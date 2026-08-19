package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.CaptionContainerView;
import org.telegram.ui.Stories.recorder.HintView2;

public abstract class CaptionPhotoViewer extends CaptionContainerView {
    private final int SHOW_ONCE;
    private final ImageView addPhotoButton;
    private boolean addPhotoVisible;
    private ImageView aiButton;
    private AiButtonDrawable aiButtonIcon;
    public HintView2 aiHint;
    private final Runnable applyCaption;
    private BlurredBackgroundDrawable backgroundForCaptionButton;
    private final Runnable collapseMoveButton;
    private final HintView2 hint;
    private boolean isVideo;
    private final AnimatedFloat lineCountAnimated;
    private final AnimatedFloat moveButtonAnimated;
    private final ButtonBounce moveButtonBounce;
    private final RectF moveButtonBounds;
    private boolean moveButtonExpanded;
    private final AnimatedFloat moveButtonExpandedAnimated;
    private Drawable moveButtonIcon;
    private final AnimatedTextView.AnimatedTextDrawable moveButtonText;
    private boolean moveButtonVisible;
    private Utilities.Callback onTTLChange;
    private boolean shownAiButton;
    private int timer;
    private final ImageView timerButton;
    private final CaptionContainerView.PeriodDrawable timerDrawable;
    private ItemOptions timerPopup;
    private boolean timerVisible;
    private final int[] values;

    @Override
    protected int additionalKeyboardHeight() {
        return 0;
    }

    @Override
    protected int getEditTextStyle() {
        return 3;
    }

    protected abstract void onMoveButtonClick();

    protected abstract void openedKeyboard();

    protected abstract boolean showMoveButton();

    public CaptionPhotoViewer(Context context, final FrameLayout frameLayout, SizeNotifierFrameLayout sizeNotifierFrameLayout, FrameLayout frameLayout2, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, Runnable runnable) {
        super(context, frameLayout, sizeNotifierFrameLayout, frameLayout2, resourcesProvider, blurManager);
        this.timer = 0;
        this.SHOW_ONCE = Integer.MAX_VALUE;
        this.values = new int[]{Integer.MAX_VALUE, 3, 10, 30, 0};
        this.moveButtonBounds = new RectF();
        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
        this.moveButtonText = animatedTextDrawable;
        this.moveButtonBounce = new ButtonBounce(this);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.lineCountAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.moveButtonAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.moveButtonExpandedAnimated = new AnimatedFloat(this, 0L, 350L, cubicBezierInterpolator);
        this.collapseMoveButton = new Runnable() {
            @Override
            public final void run() {
                CaptionPhotoViewer.$r8$lambda$7tvACeO8We2NFs09tXdWuw7fu6s(this.f$0);
            }
        };
        this.applyCaption = runnable;
        animatedTextDrawable.setTextSize(AndroidUtilities.dp(14.0f));
        animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
        animatedTextDrawable.setTextColor(-1);
        if (isAtTop()) {
            animatedTextDrawable.setText(LocaleController.getString(R.string.MoveCaptionDown));
            this.moveButtonIcon = context.getResources().getDrawable(R.drawable.menu_link_below);
        } else {
            animatedTextDrawable.setText(LocaleController.getString(R.string.MoveCaptionUp));
            this.moveButtonIcon = context.getResources().getDrawable(R.drawable.menu_link_above);
        }
        ImageView imageView = new ImageView(context);
        this.addPhotoButton = imageView;
        imageView.setImageResource(R.drawable.filled_add_photo);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(18.0f)));
        setAddPhotoVisible(false, false);
        addView(imageView, LayoutHelper.createFrame(44, 44.0f, (isAtTop() ? 48 : 80) | 3, 14.0f, isAtTop() ? 6.0f : 0.0f, 0.0f, isAtTop() ? 0.0f : 6.0f));
        ImageView imageView2 = new ImageView(context);
        this.timerButton = imageView2;
        CaptionContainerView.PeriodDrawable periodDrawable = new CaptionContainerView.PeriodDrawable();
        this.timerDrawable = periodDrawable;
        imageView2.setImageDrawable(periodDrawable);
        imageView2.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(18.0f)));
        imageView2.setScaleType(scaleType);
        setTimerVisible(false, false);
        addView(imageView2, LayoutHelper.createFrame(44, 44.0f, (isAtTop() ? 48 : 80) | 5, 0.0f, isAtTop() ? 6.0f : 0.0f, 10.0f, isAtTop() ? 0.0f : 6.0f));
        HintView2 hintView2 = new HintView2(context, isAtTop() ? 1 : 3);
        this.hint = hintView2;
        hintView2.setRounding(12.0f);
        hintView2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(isAtTop() ? 8.0f : 0.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(isAtTop() ? 0.0f : 8.0f));
        hintView2.setJoint(1.0f, -21.0f);
        hintView2.setMultilineText(true);
        addView(hintView2, LayoutHelper.createFrame(-1, 80, (isAtTop() ? 48 : 80) | 5));
        ImageView imageView3 = new ImageView(context);
        this.aiButton = imageView3;
        AiButtonDrawable aiButtonDrawable = new AiButtonDrawable(context);
        this.aiButtonIcon = aiButtonDrawable;
        imageView3.setImageDrawable(aiButtonDrawable);
        this.aiButton.setScaleType(scaleType);
        this.aiButton.setColorFilter(new PorterDuffColorFilter(-1140850689, PorterDuff.Mode.MULTIPLY));
        this.aiButton.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(16.0f)));
        addView(this.aiButton, LayoutHelper.createFrame(44, 44.0f, 53, 8.0f, 0.0f, 8.0f, 0.0f));
        this.aiButton.setContentDescription(LocaleController.getString(R.string.AIEditor));
        ScaleStateListAnimator.apply(this.aiButton);
        this.editText.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override
            public void afterTextChanged(Editable editable) {
                CaptionPhotoViewer captionPhotoViewer = CaptionPhotoViewer.this;
                captionPhotoViewer.showAiButton((captionPhotoViewer.editText.getEditText().getLineCount() <= 2 || editable == null || TextUtils.isEmpty(editable.toString().trim())) ? false : true);
            }
        });
        this.aiButton.setVisibility(8);
        this.aiButton.setAlpha(0.0f);
        this.aiButton.setScaleX(0.6f);
        this.aiButton.setScaleY(0.6f);
        this.aiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CaptionPhotoViewer.m2061$r8$lambda$lvCr3OU7SGv7V8UYHoNyXCA8S0(this.f$0, view);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CaptionPhotoViewer.$r8$lambda$GEl9WnoK5INWyzYSeKgjq_sE13g(this.f$0, frameLayout, view);
            }
        });
    }

    public static void m2061$r8$lambda$lvCr3OU7SGv7V8UYHoNyXCA8S0(final CaptionPhotoViewer captionPhotoViewer, View view) {
        captionPhotoViewer.getClass();
        MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", 3).apply();
        new AIEditorAlert(captionPhotoViewer.getContext(), new DarkThemeResourceProvider()).setText(captionPhotoViewer.editText.getText()).setOnUse(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                CaptionPhotoViewer.m2059$r8$lambda$duzMCqUquEXRcGBfzZkMn2KHHw(this.f$0, (CharSequence) obj);
            }
        }).setOnSend(0L, true, new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                CaptionPhotoViewer.$r8$lambda$EEMxvrnTh6O00DaBh_JKDpdEZ7o(this.f$0, (CharSequence) obj, (Integer) obj2, (Integer) obj3, (Boolean) obj4);
            }
        }).show();
    }

    public static void m2059$r8$lambda$duzMCqUquEXRcGBfzZkMn2KHHw(CaptionPhotoViewer captionPhotoViewer, CharSequence charSequence) {
        captionPhotoViewer.editText.setText(charSequence);
        captionPhotoViewer.editText.setSelection(charSequence.length(), charSequence.length());
    }

    public static void $r8$lambda$EEMxvrnTh6O00DaBh_JKDpdEZ7o(CaptionPhotoViewer captionPhotoViewer, CharSequence charSequence, Integer num, Integer num2, Boolean bool) {
        captionPhotoViewer.editText.setText(charSequence);
        captionPhotoViewer.done();
    }

    public static void $r8$lambda$GEl9WnoK5INWyzYSeKgjq_sE13g(final CaptionPhotoViewer captionPhotoViewer, FrameLayout frameLayout, View view) {
        String pluralString;
        ItemOptions itemOptions = captionPhotoViewer.timerPopup;
        if (itemOptions != null && itemOptions.isShown()) {
            captionPhotoViewer.timerPopup.dismiss();
            captionPhotoViewer.timerPopup = null;
            return;
        }
        captionPhotoViewer.hint.hide();
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(frameLayout, new DarkThemeResourceProvider(), captionPhotoViewer.timerButton);
        captionPhotoViewer.timerPopup = itemOptionsMakeOptions;
        itemOptionsMakeOptions.setDimAlpha(0);
        captionPhotoViewer.timerPopup.addText(LocaleController.getString(R.string.TimerPeriodHint), 13, AndroidUtilities.dp(200.0f));
        captionPhotoViewer.timerPopup.addGap();
        for (final int i : captionPhotoViewer.values) {
            if (i == 0) {
                pluralString = LocaleController.getString(R.string.TimerPeriodDoNotDelete);
            } else if (i == Integer.MAX_VALUE) {
                pluralString = LocaleController.getString(R.string.TimerPeriodOnce);
            } else {
                pluralString = LocaleController.formatPluralString("Seconds", i, new Object[0]);
            }
            captionPhotoViewer.timerPopup.add(0, pluralString, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.changeTimer(i);
                }
            });
            if (captionPhotoViewer.timer == i) {
                captionPhotoViewer.timerPopup.putCheck();
            }
        }
        captionPhotoViewer.timerPopup.show();
    }

    @Override
    protected void onLineCountChanged(int i, int i2) {
        CharSequence text = getText();
        showAiButton((i2 <= 2 || text == null || TextUtils.isEmpty(text.toString().trim())) ? false : true);
        if (this.shownAiButton) {
            if ((i < 3) != (i2 < 3)) {
                invalidate();
            }
        }
    }

    @Override
    public void setText(CharSequence charSequence) {
        super.setText(charSequence);
    }

    public void expandMoveButton() {
        AndroidUtilities.cancelRunOnUIThread(this.collapseMoveButton);
        boolean zShouldShowMoveCaptionHint = MessagesController.getInstance(this.currentAccount).shouldShowMoveCaptionHint();
        this.moveButtonExpanded = zShouldShowMoveCaptionHint;
        if (zShouldShowMoveCaptionHint) {
            MessagesController.getInstance(this.currentAccount).incrementMoveCaptionHint();
            invalidate();
            AndroidUtilities.runOnUIThread(this.collapseMoveButton, 5000L);
        }
    }

    public static void $r8$lambda$7tvACeO8We2NFs09tXdWuw7fu6s(CaptionPhotoViewer captionPhotoViewer) {
        if (captionPhotoViewer.moveButtonExpanded) {
            captionPhotoViewer.moveButtonExpanded = false;
            captionPhotoViewer.invalidate();
        }
    }

    @Override
    public void updateKeyboard(int i) {
        boolean z = this.toKeyboardShow;
        super.updateKeyboard(i);
        if (z || !this.keyboardNotifier.keyboardVisible()) {
            return;
        }
        openedKeyboard();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ImageView imageView = this.aiButton;
        if (imageView != null) {
            imageView.setTranslationX(-AndroidUtilities.dp((1.0f - this.keyboardT) * 4.0f));
            this.aiButton.setTranslationY((isAtTop() ? this.bounds.bottom - AndroidUtilities.dp(44.0f) : this.bounds.top) + ((isAtTop() ? 1 : -1) * AndroidUtilities.dp(3.0f) * Utilities.clamp01((-this.lineCountAnimated.set(this.editText.getEditText().getLineCount())) + 4.0f)));
        }
        float f = this.moveButtonAnimated.set(this.moveButtonVisible, true ^ showMoveButton());
        float f2 = this.moveButtonExpandedAnimated.set(this.moveButtonExpanded);
        if (f > 0.0f) {
            float scale = this.moveButtonBounce.getScale(0.03f);
            int iDp = AndroidUtilities.dp((1.0f - this.keyboardT) * 4.0f);
            if (isAtTop()) {
                this.moveButtonBounds.set(AndroidUtilities.dp(7.0f) + iDp, this.bounds.bottom + AndroidUtilities.dp(10.0f), iDp + AndroidUtilities.dp(44.0f) + ((this.moveButtonText.getCurrentWidth() + AndroidUtilities.dp(11.0f)) * f2), this.bounds.bottom + AndroidUtilities.dp(42.0f));
            } else {
                this.moveButtonBounds.set(AndroidUtilities.dp(7.0f) + iDp, this.bounds.top - AndroidUtilities.dp(42.0f), iDp + AndroidUtilities.dp(44.0f) + ((this.moveButtonText.getCurrentWidth() + AndroidUtilities.dp(11.0f)) * f2), this.bounds.top - AndroidUtilities.dp(10.0f));
            }
            if (f < 1.0f) {
                canvas.saveLayerAlpha(this.moveButtonBounds, (int) (f * 255.0f), 31);
            } else {
                canvas.save();
            }
            canvas.scale(scale, scale, this.moveButtonBounds.centerX(), this.moveButtonBounds.centerY());
            canvas.clipRect(this.moveButtonBounds);
            AndroidUtilities.dpf2(16.0f);
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.factoryForMentions;
            if (blurredBackgroundDrawableViewFactory != null) {
                if (this.backgroundForCaptionButton == null) {
                    this.backgroundForCaptionButton = blurredBackgroundDrawableViewFactory.create(this).setColorProvider(BlurredBackgroundProviderImpl.photoViewer(this.resourcesProvider)).setPadding(AndroidUtilities.dp(5.0f)).setRadius(AndroidUtilities.dp(16.0f));
                }
                RectF rectF = this.moveButtonBounds;
                Rect rect = AndroidUtilities.rectTmp2;
                rectF.round(rect);
                rect.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
                this.backgroundForCaptionButton.setBounds(rect);
                this.backgroundForCaptionButton.draw(canvas);
            }
            this.moveButtonIcon.setBounds((int) (this.moveButtonBounds.left + AndroidUtilities.dp(9.0f)), (int) (this.moveButtonBounds.centerY() - AndroidUtilities.dp(10.0f)), (int) (this.moveButtonBounds.left + AndroidUtilities.dp(29.0f)), (int) (this.moveButtonBounds.centerY() + AndroidUtilities.dp(10.0f)));
            this.moveButtonIcon.draw(canvas);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.moveButtonText;
            float fDp = this.moveButtonBounds.left + AndroidUtilities.dp(37.0f);
            RectF rectF2 = this.moveButtonBounds;
            animatedTextDrawable.setBounds(fDp, rectF2.top, rectF2.right, rectF2.bottom);
            this.moveButtonText.setAlpha((int) (f2 * 255.0f));
            this.moveButtonText.draw(canvas);
            canvas.restore();
        }
    }

    public void setOnAddPhotoClick(View.OnClickListener onClickListener) {
        this.addPhotoButton.setOnClickListener(onClickListener);
    }

    public void setAddPhotoVisible(final boolean z, boolean z2) {
        this.addPhotoVisible = z;
        this.addPhotoButton.animate().cancel();
        int i = 0;
        if (z2) {
            this.addPhotoButton.setVisibility(0);
            this.addPhotoButton.animate().alpha(z ? 1.0f : 0.0f).translationX(z ? 0.0f : AndroidUtilities.dp(-8.0f)).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    CaptionPhotoViewer.$r8$lambda$IN9r1TmC2UUyFns8xPbj_1CWCps(this.f$0, z);
                }
            }).start();
        } else {
            this.addPhotoButton.setVisibility(z ? 0 : 8);
            this.addPhotoButton.setAlpha(z ? 1.0f : 0.0f);
            this.addPhotoButton.setTranslationX(z ? 0.0f : AndroidUtilities.dp(-8.0f));
        }
        updateEditTextLeft();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.editText.getLayoutParams();
        if (this.addPhotoVisible && this.timerVisible) {
            i = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i);
        this.editText.setLayoutParams(marginLayoutParams);
    }

    public static void $r8$lambda$IN9r1TmC2UUyFns8xPbj_1CWCps(CaptionPhotoViewer captionPhotoViewer, boolean z) {
        if (z) {
            captionPhotoViewer.getClass();
        } else {
            captionPhotoViewer.timerButton.setVisibility(8);
        }
    }

    @Override
    protected int getEditTextLeft() {
        if (this.addPhotoVisible) {
            return AndroidUtilities.dp(31.0f);
        }
        return 0;
    }

    public void setIsVideo(boolean z) {
        this.isVideo = z;
    }

    @Override
    public void onTextChange() {
        Runnable runnable = this.applyCaption;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void setTimerVisible(final boolean z, boolean z2) {
        this.timerVisible = z;
        this.timerButton.animate().cancel();
        int i = 0;
        if (z2) {
            this.timerButton.setVisibility(0);
            this.timerButton.animate().alpha(z ? 1.0f : 0.0f).translationX(z ? 0.0f : AndroidUtilities.dp(8.0f)).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    CaptionPhotoViewer.m2063$r8$lambda$urkB2IxFGOTvJHjkiChnjNPiq4(this.f$0, z);
                }
            }).start();
        } else {
            this.timerButton.setVisibility(z ? 0 : 8);
            this.timerButton.setAlpha(z ? 1.0f : 0.0f);
            this.timerButton.setTranslationX(z ? 0.0f : AndroidUtilities.dp(8.0f));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.editText.getLayoutParams();
        if (this.addPhotoVisible && this.timerVisible) {
            i = 33;
        }
        marginLayoutParams.rightMargin = AndroidUtilities.dp(32 + i);
        this.editText.setLayoutParams(marginLayoutParams);
    }

    public static void m2063$r8$lambda$urkB2IxFGOTvJHjkiChnjNPiq4(CaptionPhotoViewer captionPhotoViewer, boolean z) {
        if (z) {
            captionPhotoViewer.getClass();
        } else {
            captionPhotoViewer.timerButton.setVisibility(8);
        }
    }

    public boolean hasTimer() {
        return this.timerVisible && this.timer > 0;
    }

    public void setTimer(int i) {
        this.timer = i;
        this.timerDrawable.setValue(i == Integer.MAX_VALUE ? 1 : Math.max(1, i), this.timer > 0, true);
        HintView2 hintView2 = this.hint;
        if (hintView2 != null) {
            hintView2.hide();
        }
    }

    public void changeTimer(int i) {
        CharSequence charSequenceReplaceTags;
        if (this.timer == i) {
            return;
        }
        setTimer(i);
        Utilities.Callback callback = this.onTTLChange;
        if (callback != null) {
            callback.run(Integer.valueOf(i));
        }
        if (i == 0) {
            charSequenceReplaceTags = LocaleController.getString(this.isVideo ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
            this.hint.setMaxWidthPx(getMeasuredWidth());
            this.hint.setMultilineText(false);
            this.hint.setInnerPadding(13.0f, 4.0f, 10.0f, 4.0f);
            this.hint.setIconMargin(0);
            this.hint.setIconTranslate(0.0f, -AndroidUtilities.dp(1.0f));
        } else if (i == Integer.MAX_VALUE) {
            charSequenceReplaceTags = LocaleController.getString(this.isVideo ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
            this.hint.setMaxWidthPx(getMeasuredWidth());
            this.hint.setMultilineText(false);
            this.hint.setInnerPadding(13.0f, 4.0f, 10.0f, 4.0f);
            this.hint.setIconMargin(0);
            this.hint.setIconTranslate(0.0f, -AndroidUtilities.dp(1.0f));
        } else {
            if (i <= 0) {
                return;
            }
            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(this.isVideo ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i, new Object[0]));
            this.hint.setMultilineText(true);
            HintView2 hintView2 = this.hint;
            hintView2.setMaxWidthPx(HintView2.cutInFancyHalf(charSequenceReplaceTags, hintView2.getTextPaint()));
            this.hint.setInnerPadding(12.0f, 7.0f, 11.0f, 7.0f);
            this.hint.setIconMargin(2);
            this.hint.setIconTranslate(0.0f, 0.0f);
        }
        this.hint.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (isAtTop() ? -1.0f : 1.0f));
        this.hint.setText(charSequenceReplaceTags);
        int i2 = i > 0 ? R.raw.fire_on : R.raw.fire_off;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
        rLottieDrawable.start();
        this.hint.setIcon(rLottieDrawable);
        this.hint.show();
        this.moveButtonExpanded = false;
        AndroidUtilities.cancelRunOnUIThread(this.collapseMoveButton);
        invalidate();
    }

    @Override
    protected void onEditHeightChange(int i) {
        this.hint.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), i)) - AndroidUtilities.dp(10.0f)) * (isAtTop() ? -1.0f : 1.0f));
    }

    @Override
    protected boolean clipChild(View view) {
        return view != this.hint;
    }

    public void setOnTimerChange(Utilities.Callback<Integer> callback) {
        this.onTTLChange = callback;
    }

    @Override
    protected int getCaptionLimit() {
        return UserConfig.getInstance(this.currentAccount).isPremium() ? getCaptionPremiumLimit() : getCaptionDefaultLimit();
    }

    @Override
    protected int getCaptionDefaultLimit() {
        return MessagesController.getInstance(this.currentAccount).captionLengthLimitDefault;
    }

    @Override
    protected int getCaptionPremiumLimit() {
        return MessagesController.getInstance(this.currentAccount).captionLengthLimitPremium;
    }

    @Override
    protected void beforeUpdateShownKeyboard(boolean z) {
        if (!z) {
            this.timerButton.setVisibility(this.timerVisible ? 0 : 8);
            this.addPhotoButton.setVisibility(this.addPhotoVisible ? 0 : 8);
        }
        HintView2 hintView2 = this.hint;
        if (hintView2 != null) {
            hintView2.hide();
        }
    }

    @Override
    protected void onUpdateShowKeyboard(float f) {
        float f2 = 1.0f - f;
        this.timerButton.setAlpha(f2);
        this.addPhotoButton.setAlpha(f2);
    }

    @Override
    protected void afterUpdateShownKeyboard(boolean z) {
        this.timerButton.setVisibility((z || !this.timerVisible) ? 8 : 0);
        this.addPhotoButton.setVisibility((z || !this.addPhotoVisible) ? 8 : 0);
        if (z) {
            this.timerButton.setVisibility(8);
            this.addPhotoButton.setVisibility(8);
        }
    }

    @Override
    public void updateColors(Theme.ResourcesProvider resourcesProvider) {
        super.updateColors(resourcesProvider);
        this.timerDrawable.updateColors(-1, Theme.getColor(Theme.key_chat_editMediaButton, resourcesProvider), -1);
    }

    public void setShowMoveButtonVisible(boolean z, boolean z2) {
        if (this.moveButtonVisible == z && z2) {
            return;
        }
        this.moveButtonVisible = z;
        if (!z2) {
            this.moveButtonAnimated.set(z, true);
        }
        invalidate();
    }

    @Override
    public int getEditTextHeight() {
        return super.getEditTextHeight();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.moveButtonBounce.setPressed(this.moveButtonAnimated.get() > 0.0f && this.moveButtonBounds.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2) {
            if (this.moveButtonBounce.isPressed() && (this.moveButtonAnimated.get() <= 0.0f || !this.moveButtonBounds.contains(motionEvent.getX(), motionEvent.getY()))) {
                this.moveButtonBounce.setPressed(false);
            }
        } else if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && this.moveButtonBounce.isPressed()) {
            if (motionEvent.getAction() == 1) {
                onMoveButtonClick();
                this.moveButtonText.setText(LocaleController.getString(isAtTop() ? R.string.MoveCaptionDown : R.string.MoveCaptionUp), true);
            }
            this.moveButtonBounce.setPressed(false);
            return true;
        }
        return this.moveButtonBounce.isPressed() || super.dispatchTouchEvent(motionEvent);
    }

    public void showAiButton(final boolean z) {
        if (this.shownAiButton == z) {
            return;
        }
        if (z) {
            MessagesController.getInstance(this.currentAccount).getTonesController().load();
        }
        this.shownAiButton = z;
        this.aiButton.setVisibility(0);
        this.aiButton.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.6f).scaleY(z ? 1.0f : 0.6f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).withEndAction(new Runnable() {
            @Override
            public final void run() {
                CaptionPhotoViewer.m2060$r8$lambda$ezVo2wPMVjn64G4J3AEOYseNMg(this.f$0, z);
            }
        }).start();
        if (z) {
            ImageView imageView = this.aiButton;
            AiButtonDrawable aiButtonDrawable = this.aiButtonIcon;
            Objects.requireNonNull(aiButtonDrawable);
            imageView.postDelayed(new CaptionPhotoViewer$$ExternalSyntheticLambda5(aiButtonDrawable), 220L);
            HintView2 hintView2 = this.aiHint;
            if (hintView2 != null) {
                hintView2.hide();
                this.aiHint = null;
            }
            if (MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) < 3) {
                final HintView2 hintView3 = new HintView2(getContext(), 3);
                this.aiHint = hintView3;
                hintView3.setMultilineText(true);
                this.aiHint.setText(LocaleController.getString(R.string.AIEditorHint));
                this.aiHint.setJointPx(1.0f, ((-this.aiButton.getWidth()) / 2.0f) + AndroidUtilities.dp(4.0f));
                addView(this.aiHint, LayoutHelper.createFrame(-1, 200.0f, 48, 0.0f, -196.0f, 0.0f, 0.0f));
                this.aiHint.setOnHiddenListener(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.removeView(hintView3);
                    }
                });
                this.aiHint.setDuration(4000L);
                this.aiHint.show();
                MessagesController.getGlobalMainSettings().edit().putInt("aihintshown", MessagesController.getGlobalMainSettings().getInt("aihintshown", 0) + 1).apply();
                return;
            }
            return;
        }
        HintView2 hintView4 = this.aiHint;
        if (hintView4 != null) {
            hintView4.hide();
            this.aiHint = null;
        }
    }

    public static void m2060$r8$lambda$ezVo2wPMVjn64G4J3AEOYseNMg(CaptionPhotoViewer captionPhotoViewer, boolean z) {
        if (z) {
            captionPhotoViewer.getClass();
        } else {
            captionPhotoViewer.aiButton.setVisibility(8);
        }
    }
}

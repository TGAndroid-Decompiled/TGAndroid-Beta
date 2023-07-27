package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmojiView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MentionsContainerView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.StoryRecorder;
public class CaptionContainerView extends FrameLayout {
    public ImageView applyButton;
    private final Paint backgroundPaint;
    private Bitmap blurBitmap;
    private Matrix blurBitmapMatrix;
    private BitmapShader blurBitmapShader;
    private Paint blurPaint;
    private final FrameLayout containerView;
    private int currentAccount;
    public final EditTextEmoji editText;
    private final LinearGradient fadeGradient;
    private final Paint fadePaint;
    private final AnimatedFloat heightAnimated;
    private boolean ignoreDraw;
    public boolean ignoreTouches;
    private ValueAnimator keyboardAnimator;
    public final KeyboardNotifier keyboardNotifier;
    public boolean keyboardShown;
    public float keyboardT;
    private int lastHeight;
    private float lastHeightTranslation;
    public AnimatedTextView limitTextView;
    private final Matrix matrix;
    public MentionsContainerView mentionContainer;
    private Utilities.Callback<Integer> onHeightUpdate;
    private Utilities.Callback<Boolean> onKeyboardOpen;
    private Utilities.Callback<Integer> onPeriodUpdate;
    private Utilities.Callback<Integer> onPremiumHintShow;
    ObjectAnimator parentKeyboardAnimator;
    public ImageView periodButton;
    private int periodIndex;
    private ItemOptions periodPopup;
    private boolean periodVisible;
    private final Theme.ResourcesProvider resourcesProvider;
    private final StoryRecorder.WindowView rootView;
    private boolean toKeyboardShow;
    private Runnable updateShowKeyboard;
    public static final int[] periods = {21600, 43200, 86400, 172800};
    public static final int[] periodDrawables = {R.drawable.msg_story_6h, R.drawable.msg_story_12h, R.drawable.msg_story_24h, R.drawable.msg_story_48h};

    public CaptionContainerView(Context context, final int i, final StoryRecorder.WindowView windowView, FrameLayout frameLayout, final Theme.ResourcesProvider resourcesProvider) {
        super(context);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        this.periodVisible = true;
        this.periodIndex = 0;
        Paint paint2 = new Paint(1);
        this.fadePaint = paint2;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(10.0f), new int[]{-65536, 0}, new float[]{0.05f, 1.0f}, Shader.TileMode.CLAMP);
        this.fadeGradient = linearGradient;
        this.matrix = new Matrix();
        this.updateShowKeyboard = new Runnable() {
            @Override
            public final void run() {
                CaptionContainerView.this.lambda$new$6();
            }
        };
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.heightAnimated = new AnimatedFloat(this, 0L, 300L, cubicBezierInterpolator);
        this.ignoreDraw = false;
        this.resourcesProvider = resourcesProvider;
        this.currentAccount = i;
        this.rootView = windowView;
        this.containerView = frameLayout;
        paint.setColor(Integer.MIN_VALUE);
        this.keyboardNotifier = new KeyboardNotifier(windowView, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                CaptionContainerView.this.updateKeyboard(((Integer) obj).intValue());
            }
        });
        EditTextEmoji editTextEmoji = new EditTextEmoji(context, windowView, null, 2, true, resourcesProvider) {
            @Override
            protected void onEmojiKeyboardUpdate() {
                CaptionContainerView.this.keyboardNotifier.fire();
            }

            @Override
            protected void onWaitingForKeyboard() {
                CaptionContainerView.this.keyboardNotifier.awaitKeyboard();
            }

            @Override
            public void createEmojiView() {
                super.createEmojiView();
                EmojiView emojiView = getEmojiView();
                if (emojiView != null) {
                    emojiView.shouldLightenBackground = false;
                    emojiView.fixBottomTabContainerTranslation = false;
                    emojiView.setShouldDrawBackground(false);
                }
            }

            @Override
            protected void drawEmojiBackground(Canvas canvas, View view) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
                CaptionContainerView.this.drawBackground(canvas, rectF, 0.0f, 0.95f, view);
            }
        };
        this.editText = editTextEmoji;
        editTextEmoji.setHint(LocaleController.getString("StoryAddCaption", R.string.StoryAddCaption));
        editTextEmoji.getEditText().setTranslationX(AndroidUtilities.dp(-22.0f));
        editTextEmoji.getEmojiButton().setAlpha(0.0f);
        editTextEmoji.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                if (CaptionContainerView.this.editText.getEditText().suppressOnTextChanged) {
                    return;
                }
                CaptionContainerView captionContainerView = CaptionContainerView.this;
                if (captionContainerView.mentionContainer == null) {
                    captionContainerView.createMentionsContainer();
                }
                if (CaptionContainerView.this.mentionContainer.getAdapter() != null) {
                    CaptionContainerView.this.mentionContainer.getAdapter().setUserOrChar(UserConfig.getInstance(i).getCurrentUser(), null);
                    CaptionContainerView.this.mentionContainer.getAdapter().searchUsernameOrHashtag(charSequence, CaptionContainerView.this.editText.getEditText().getSelectionStart(), null, false, false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
                EditTextCaption editText = CaptionContainerView.this.editText.getEditText();
                int i2 = 0;
                if (editText != null && editText.getLayout() != null) {
                    editText.ignoreClipTop = editText.getLayout().getHeight() > (AndroidUtilities.dp(180.0f) - editText.getPaddingTop()) - editText.getPaddingBottom();
                }
                try {
                    i2 = CaptionContainerView.this.editText.getEditText().getText().length();
                } catch (Exception unused) {
                }
                String str = null;
                int i3 = MessagesController.getInstance(i).storyCaptionLengthLimit;
                if (i2 + 25 > i3) {
                    str = "" + (i3 - i2);
                }
                CaptionContainerView.this.limitTextView.cancelAnimation();
                CaptionContainerView.this.limitTextView.setText(str);
                CaptionContainerView.this.limitTextView.setTextColor(i2 >= i3 ? -1280137 : -1);
            }
        });
        addView(editTextEmoji, LayoutHelper.createFrame(-1, -2.0f, 87, 12.0f, 12.0f, 12.0f, 12.0f));
        this.applyButton = new BounceableImageView(context);
        CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(16.0f), -10043398), context.getResources().getDrawable(R.drawable.input_done).mutate(), 0, AndroidUtilities.dp(1.0f));
        combinedDrawable.setCustomSize(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(32.0f));
        this.applyButton.setImageDrawable(combinedDrawable);
        this.applyButton.setScaleType(ImageView.ScaleType.CENTER);
        this.applyButton.setAlpha(0.0f);
        this.applyButton.setVisibility(8);
        this.applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CaptionContainerView.this.lambda$new$0(view);
            }
        });
        this.applyButton.setTranslationY(-AndroidUtilities.dp(1.0f));
        addView(this.applyButton, LayoutHelper.createFrame(44, 44, 85));
        AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
        this.limitTextView = animatedTextView;
        animatedTextView.setGravity(17);
        this.limitTextView.setTextSize(AndroidUtilities.dp(15.0f));
        this.limitTextView.setTextColor(-1);
        this.limitTextView.setAnimationProperties(0.4f, 0L, 320L, cubicBezierInterpolator);
        this.limitTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.limitTextView.setTranslationX(AndroidUtilities.dp(2.0f));
        addView(this.limitTextView, LayoutHelper.createFrame(52, 16.0f, 85, 0.0f, 0.0f, 0.0f, 44.0f));
        paint2.setShader(linearGradient);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        ImageView imageView = new ImageView(context);
        this.periodButton = imageView;
        imageView.setBackground(Theme.createSelectorDrawable(1090519039, 1, AndroidUtilities.dp(18.0f)));
        this.periodButton.setScaleType(ImageView.ScaleType.CENTER);
        this.periodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CaptionContainerView.this.lambda$new$5(i, windowView, resourcesProvider, view);
            }
        });
        setPeriod(86400, false);
        addView(this.periodButton, LayoutHelper.createFrame(44, 44.0f, 85, 0.0f, 0.0f, 11.0f, 11.0f));
    }

    public void lambda$new$0(View view) {
        closeKeyboard();
    }

    public void lambda$new$5(int i, StoryRecorder.WindowView windowView, Theme.ResourcesProvider resourcesProvider, View view) {
        String formatPluralString;
        ItemOptions itemOptions = this.periodPopup;
        if (itemOptions != null && itemOptions.isShown()) {
            return;
        }
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                CaptionContainerView.this.lambda$new$1((Integer) obj);
            }
        };
        boolean isPremium = UserConfig.getInstance(i).isPremium();
        final Utilities.Callback callback2 = isPremium ? null : new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                CaptionContainerView.this.lambda$new$2((Integer) obj);
            }
        };
        this.periodPopup = ItemOptions.makeOptions(windowView, resourcesProvider, this.periodButton);
        int i2 = 0;
        while (true) {
            int[] iArr = periods;
            if (i2 < iArr.length) {
                final int i3 = iArr[i2];
                ItemOptions itemOptions2 = this.periodPopup;
                if (i3 == Integer.MAX_VALUE) {
                    formatPluralString = LocaleController.getString("StoryPeriodKeep");
                } else {
                    formatPluralString = LocaleController.formatPluralString("Hours", i3 / 3600, new Object[0]);
                }
                itemOptions2.add(0, formatPluralString, this.periodIndex == i2 ? Theme.key_dialogTextBlue2 : Theme.key_actionBarDefaultSubmenuItem, new Runnable() {
                    @Override
                    public final void run() {
                        CaptionContainerView.lambda$new$3(Utilities.Callback.this, i3);
                    }
                }).putPremiumLock((isPremium || i3 == 86400 || i3 == Integer.MAX_VALUE) ? null : new Runnable() {
                    @Override
                    public final void run() {
                        CaptionContainerView.lambda$new$4(Utilities.Callback.this, i3);
                    }
                });
                i2++;
            } else {
                this.periodPopup.addGap();
                this.periodPopup.addText(LocaleController.getString("StoryPeriodHint"), 13);
                this.periodPopup.setDimAlpha(0).show();
                return;
            }
        }
    }

    public void lambda$new$1(Integer num) {
        setPeriod(num.intValue());
        Utilities.Callback<Integer> callback = this.onPeriodUpdate;
        if (callback != null) {
            callback.run(num);
        }
    }

    public void lambda$new$2(Integer num) {
        Utilities.Callback<Integer> callback = this.onPremiumHintShow;
        if (callback != null) {
            callback.run(num);
        }
    }

    public static void lambda$new$3(Utilities.Callback callback, int i) {
        callback.run(Integer.valueOf(i));
    }

    public static void lambda$new$4(Utilities.Callback callback, int i) {
        callback.run(Integer.valueOf(i));
    }

    public void closeKeyboard() {
        this.editText.closeKeyboard();
        this.editText.hidePopup(true);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.ignoreTouches) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void createMentionsContainer() {
        MentionsContainerView mentionsContainerView = new MentionsContainerView(getContext(), UserConfig.getInstance(this.currentAccount).getClientUserId(), 0, LaunchActivity.getLastFragment(), null, this.resourcesProvider) {
            @Override
            public void drawRoundRect(Canvas canvas, Rect rect, float f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(rect);
                CaptionContainerView captionContainerView = CaptionContainerView.this;
                captionContainerView.drawBackground(canvas, rectF, f, 0.9f, captionContainerView.mentionContainer);
            }
        };
        this.mentionContainer = mentionsContainerView;
        mentionsContainerView.getAdapter().setAllowStickers(false);
        this.mentionContainer.getAdapter().setAllowBots(false);
        this.mentionContainer.getAdapter().setAllowChats(false);
        this.mentionContainer.getAdapter().setSearchInDailogs(true);
        this.mentionContainer.withDelegate(new MentionsContainerView.Delegate() {
            @Override
            public void addEmojiToRecent(String str) {
                MentionsContainerView.Delegate.CC.$default$addEmojiToRecent(this, str);
            }

            @Override
            public void onStickerSelected(TLRPC$TL_document tLRPC$TL_document, String str, Object obj) {
                MentionsContainerView.Delegate.CC.$default$onStickerSelected(this, tLRPC$TL_document, str, obj);
            }

            @Override
            public void replaceText(int i, int i2, CharSequence charSequence, boolean z) {
                CaptionContainerView.this.replaceWithText(i, i2, charSequence, z);
            }

            @Override
            public Paint.FontMetricsInt getFontMetrics() {
                return CaptionContainerView.this.editText.getEditText().getPaint().getFontMetricsInt();
            }
        });
        this.containerView.addView(this.mentionContainer, LayoutHelper.createFrame(-1, -1, 83));
    }

    public void replaceWithText(int i, int i2, CharSequence charSequence, boolean z) {
        if (this.editText == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.editText.getText());
            spannableStringBuilder.replace(i, i2 + i, charSequence);
            if (z) {
                Emoji.replaceEmoji(spannableStringBuilder, this.editText.getEditText().getPaint().getFontMetricsInt(), AndroidUtilities.dp(20.0f), false);
            }
            this.editText.setText(spannableStringBuilder);
            this.editText.setSelection(i + charSequence.length());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void setPeriod(int i) {
        setPeriod(i, true);
    }

    public void setPeriodVisible(boolean z) {
        this.periodVisible = z;
        this.periodButton.setVisibility((!z || this.keyboardShown) ? 8 : 0);
    }

    public void setPeriod(int i, boolean z) {
        int i2 = 0;
        while (true) {
            int[] iArr = periods;
            if (i2 >= iArr.length) {
                i2 = 2;
                break;
            } else if (iArr[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (this.periodIndex == i2) {
            return;
        }
        Resources resources = getResources();
        int[] iArr2 = periodDrawables;
        this.periodIndex = i2;
        Drawable mutate = resources.getDrawable(iArr2[i2]).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        if (z) {
            AndroidUtilities.updateImageViewImageAnimated(this.periodButton, mutate);
        } else {
            this.periodButton.setImageDrawable(mutate);
        }
    }

    public void hidePeriodPopup() {
        ItemOptions itemOptions = this.periodPopup;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.periodPopup = null;
        }
    }

    public void onResume() {
        this.editText.onResume();
    }

    public void onPause() {
        this.editText.onPause();
    }

    public void setOnHeightUpdate(Utilities.Callback<Integer> callback) {
        this.onHeightUpdate = callback;
    }

    public void setOnPeriodUpdate(Utilities.Callback<Integer> callback) {
        this.onPeriodUpdate = callback;
    }

    public void setOnPremiumHint(Utilities.Callback<Integer> callback) {
        this.onPremiumHintShow = callback;
    }

    public int getEditTextHeight() {
        int height = this.editText.getHeight();
        if (this.keyboardShown) {
            return Math.max(AndroidUtilities.dp(46.0f), height);
        }
        return Math.min(AndroidUtilities.dp(150.0f), height);
    }

    public void setOnKeyboardOpen(Utilities.Callback<Boolean> callback) {
        this.onKeyboardOpen = callback;
    }

    public void updateKeyboard(int i) {
        this.rootView.notifyHeightChanged();
        if (this.editText.isPopupShowing() || this.editText.isWaitingForKeyboardOpen()) {
            i = Math.max(0, AndroidUtilities.navigationBarHeight + this.editText.getKeyboardHeight());
        }
        int max = Math.max(0, i - this.rootView.getBottomPadding(true));
        View view = (View) getParent();
        view.clearAnimation();
        ObjectAnimator objectAnimator = this.parentKeyboardAnimator;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.parentKeyboardAnimator.cancel();
            this.parentKeyboardAnimator = null;
        }
        this.parentKeyboardAnimator = ObjectAnimator.ofFloat(view, FrameLayout.TRANSLATION_Y, view.getTranslationY(), -max);
        if (max > AndroidUtilities.dp(20.0f)) {
            this.parentKeyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
            this.parentKeyboardAnimator.setDuration(250L);
        } else {
            this.parentKeyboardAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.parentKeyboardAnimator.setDuration(640L);
        }
        this.parentKeyboardAnimator.start();
        this.toKeyboardShow = max > AndroidUtilities.dp(20.0f);
        AndroidUtilities.cancelRunOnUIThread(this.updateShowKeyboard);
        AndroidUtilities.runOnUIThread(this.updateShowKeyboard);
        if (max < AndroidUtilities.dp(20.0f)) {
            this.editText.getEditText().clearFocus();
            this.editText.hidePopup(true);
        }
    }

    public void lambda$new$6() {
        updateShowKeyboard(this.toKeyboardShow, true);
    }

    private void updateShowKeyboard(final boolean z, boolean z2) {
        if (this.keyboardShown == z) {
            return;
        }
        this.keyboardShown = z;
        ValueAnimator valueAnimator = this.keyboardAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.keyboardAnimator = null;
        }
        Utilities.Callback<Boolean> callback = this.onKeyboardOpen;
        if (callback != null) {
            callback.run(Boolean.valueOf(z));
        }
        if (z2) {
            if (z) {
                MentionsContainerView mentionsContainerView = this.mentionContainer;
                if (mentionsContainerView != null) {
                    mentionsContainerView.setVisibility(0);
                }
                this.applyButton.setVisibility(0);
            } else {
                this.editText.getEditText().scrollBy(0, -this.editText.getEditText().getScrollY());
                this.periodButton.setVisibility(this.periodVisible ? 0 : 8);
            }
            float[] fArr = new float[2];
            fArr[0] = this.keyboardT;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.keyboardAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    CaptionContainerView.this.lambda$updateShowKeyboard$7(valueAnimator2);
                }
            });
            this.keyboardAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (!z) {
                        CaptionContainerView.this.applyButton.setVisibility(8);
                        MentionsContainerView mentionsContainerView2 = CaptionContainerView.this.mentionContainer;
                        if (mentionsContainerView2 != null) {
                            mentionsContainerView2.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    CaptionContainerView.this.periodButton.setVisibility(8);
                }
            });
            if (z) {
                this.keyboardAnimator.setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator);
                this.keyboardAnimator.setDuration(250L);
            } else {
                this.keyboardAnimator.setInterpolator(new FastOutSlowInInterpolator());
                this.keyboardAnimator.setDuration(420L);
            }
            this.keyboardAnimator.start();
        } else {
            this.keyboardT = z ? 1.0f : 0.0f;
            this.editText.getEditText().setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(-22.0f), AndroidUtilities.dp(2.0f), this.keyboardT));
            this.editText.setTranslationX(AndroidUtilities.lerp(0, AndroidUtilities.dp(-8.0f), this.keyboardT));
            this.editText.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(10.0f), this.keyboardT));
            this.limitTextView.setAlpha(AndroidUtilities.lerp(0, 1, this.keyboardT));
            this.editText.getEmojiButton().setAlpha(this.keyboardT);
            this.applyButton.setVisibility(z ? 0 : 8);
            this.applyButton.setAlpha(z ? 1.0f : 0.0f);
            ImageView imageView = this.periodButton;
            if (!z && this.periodVisible) {
                r0 = 0;
            }
            imageView.setVisibility(r0);
            this.periodButton.setAlpha(z ? 0.0f : 1.0f);
            invalidate();
        }
        this.editText.setSuggestionsEnabled(z);
        if (!z) {
            this.editText.getEditText().setSpoilersRevealed(false, true);
        }
        if (!z || SharedConfig.getDevicePerformanceClass() < 1 || LiteMode.isPowerSaverApplied()) {
            return;
        }
        if (this.blurBitmap == null) {
            this.blurBitmap = Bitmap.createBitmap((int) (this.rootView.getWidth() / 12.0f), (int) (this.rootView.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
        }
        this.ignoreDraw = true;
        drawBlurBitmap(this.blurBitmap, 12.0f);
        this.ignoreDraw = false;
        Bitmap bitmap = this.blurBitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.blurBitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = this.blurBitmapMatrix;
        if (matrix == null) {
            this.blurBitmapMatrix = new Matrix();
        } else {
            matrix.reset();
        }
        this.blurBitmapShader.setLocalMatrix(this.blurBitmapMatrix);
        if (this.blurPaint == null) {
            Paint paint = new Paint(3);
            this.blurPaint = paint;
            paint.setColor(-1);
        }
        this.blurPaint.setShader(this.blurBitmapShader);
    }

    public void lambda$updateShowKeyboard$7(ValueAnimator valueAnimator) {
        this.keyboardT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.editText.getEditText().setTranslationX(AndroidUtilities.lerp(AndroidUtilities.dp(-22.0f), AndroidUtilities.dp(2.0f), this.keyboardT));
        this.editText.setTranslationX(AndroidUtilities.lerp(0, AndroidUtilities.dp(-8.0f), this.keyboardT));
        this.editText.setTranslationY(AndroidUtilities.lerp(0, AndroidUtilities.dp(10.0f), this.keyboardT));
        this.limitTextView.setAlpha(AndroidUtilities.lerp(0, 1, this.keyboardT));
        this.editText.getEmojiButton().setAlpha(this.keyboardT);
        this.applyButton.setAlpha((float) Math.pow(this.keyboardT, 16.0d));
        this.periodButton.setAlpha(1.0f - this.keyboardT);
        MentionsContainerView mentionsContainerView = this.mentionContainer;
        if (mentionsContainerView != null) {
            mentionsContainerView.setAlpha((float) Math.pow(this.keyboardT, 4.0d));
        }
        invalidate();
    }

    public void drawBlurBitmap(Bitmap bitmap, float f) {
        Utilities.stackBlurBitmap(bitmap, (int) f);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.blurBitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.blurBitmapShader = null;
        this.blurPaint = null;
    }

    public boolean onBackPressed() {
        if (this.editText.isPopupShowing()) {
            this.editText.hidePopup(true);
            return true;
        } else if (!this.editText.isKeyboardVisible() || this.keyboardNotifier.ignoring) {
            return false;
        } else {
            closeKeyboard();
            return true;
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        int min;
        if (this.ignoreDraw) {
            return;
        }
        int height = this.editText.getHeight();
        if (this.keyboardShown) {
            min = Math.max(AndroidUtilities.dp(46.0f), height);
        } else {
            min = Math.min(AndroidUtilities.dp(150.0f), height);
        }
        if (min != this.lastHeight) {
            Utilities.Callback<Integer> callback = this.onHeightUpdate;
            if (callback != null) {
                callback.run(Integer.valueOf(min));
            }
            this.lastHeight = min;
        }
        int i = (int) this.heightAnimated.set(min);
        updateMentionsLayoutPosition();
        float f = min - i;
        if (Math.abs(this.lastHeightTranslation - f) >= 1.0f) {
            this.editText.getEditText().setTranslationY(f);
        }
        this.lastHeightTranslation = f;
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, this.keyboardT);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(lerp, (getHeight() - lerp) - i, getWidth() - lerp, getHeight() - lerp);
        drawBackground(canvas, rectF, AndroidUtilities.lerp(AndroidUtilities.dp(21.0f), 0, this.keyboardT), 1.0f, this);
        canvas.save();
        canvas.clipRect(rectF);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void drawBackground(Canvas canvas, RectF rectF, float f, float f2, View view) {
        Bitmap bitmap;
        float f3 = 0.0f;
        if (this.keyboardT > 0.0f && this.blurPaint != null && this.blurBitmapShader != null && (bitmap = this.blurBitmap) != null && !bitmap.isRecycled()) {
            this.blurBitmapMatrix.reset();
            this.blurBitmapMatrix.postScale(this.rootView.getWidth() / this.blurBitmap.getWidth(), this.rootView.getHeight() / this.blurBitmap.getHeight());
            float f4 = 0.0f;
            for (int i = 0; i < 8 && view != null; i++) {
                f3 += view.getX();
                f4 += view.getY();
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.blurBitmapMatrix.postTranslate(-f3, -f4);
            this.blurBitmapShader.setLocalMatrix(this.blurBitmapMatrix);
            this.blurPaint.setAlpha((int) (this.keyboardT * 255.0f * f2));
            canvas.drawRoundRect(rectF, f, f, this.blurPaint);
        }
        this.backgroundPaint.setAlpha((int) (this.blurPaint == null ? 128.0f : f2 * AndroidUtilities.lerp(128, 153, this.keyboardT)));
        canvas.drawRoundRect(rectF, f, f, this.backgroundPaint);
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.editText) {
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(12.0f), 0, this.keyboardT);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(lerp, (getHeight() - lerp) - this.heightAnimated.get(), getWidth() - lerp, getHeight() - lerp);
            float max = Math.max(0, this.editText.getHeight() - AndroidUtilities.dp(143.0f)) * (1.0f - this.keyboardT);
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
            canvas.save();
            canvas.translate(0.0f, max);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            canvas.save();
            this.matrix.reset();
            this.matrix.postTranslate(0.0f, rectF.top - 1.0f);
            this.fadeGradient.setLocalMatrix(this.matrix);
            float f = rectF.left;
            float f2 = rectF.top;
            canvas.drawRect(f, f2, rectF.right, f2 + AndroidUtilities.dp(10.0f), this.fadePaint);
            this.matrix.reset();
            this.matrix.postRotate(180.0f);
            this.matrix.postTranslate(0.0f, rectF.bottom);
            this.fadeGradient.setLocalMatrix(this.matrix);
            canvas.drawRect(rectF.left, rectF.bottom - AndroidUtilities.dp(10.0f), rectF.right, rectF.bottom, this.fadePaint);
            canvas.restore();
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j);
    }

    @Override
    public void clearFocus() {
        this.editText.clearFocus();
    }

    public void clear() {
        this.editText.setText("");
    }

    public void setText(CharSequence charSequence) {
        this.editText.setText(charSequence);
    }

    public CharSequence getText() {
        return this.editText.getText();
    }

    public void updateMentionsLayoutPosition() {
        if (this.mentionContainer != null) {
            float translationY = ((View) getParent()).getTranslationY() - this.heightAnimated.get();
            if (this.mentionContainer.getY() != translationY) {
                this.mentionContainer.setTranslationY(translationY);
                this.mentionContainer.invalidate();
            }
        }
    }

    public static class BounceableImageView extends ImageView {
        private final ButtonBounce bounce;
        private final float scale;

        public BounceableImageView(Context context) {
            this(context, 0.2f);
        }

        public BounceableImageView(Context context, float f) {
            super(context);
            this.bounce = new ButtonBounce(this);
            this.scale = f;
        }

        @Override
        public void setPressed(boolean z) {
            super.setPressed(z);
            this.bounce.setPressed(z);
        }

        @Override
        public void draw(Canvas canvas) {
            canvas.save();
            float scale = this.bounce.getScale(this.scale);
            canvas.scale(scale, scale, getWidth() / 2.0f, getHeight() / 2.0f);
            super.draw(canvas);
            canvas.restore();
        }
    }
}

package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.CharacterStyle;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.QrActivity$5$$ExternalSyntheticLambda1;
import org.telegram.ui.ThemePreviewActivity;

public class UndoView extends FrameLayout {
    public static final int $r8$clinit = 0;
    public float additionalTranslationY;
    public final BackupImageView avatarImageView;
    public final ShapeDrawable backgroundDrawable;
    public final int currentAccount;
    public int currentAction;
    public Runnable currentActionRunnable;
    public Runnable currentCancelRunnable;
    public ArrayList currentDialogIds;
    public Object currentInfoObject;
    public Object currentInfoObject2;
    public float enterOffset;
    public int enterOffsetMargin;
    public final boolean fromTop;
    public int hideAnimationType;
    public CharSequence infoText;
    public final CheckBoxCell.AnonymousClass2 infoTextView;
    public int infoTextViewEmojiCacheType;
    public boolean isShown;
    public long lastUpdateTime;
    public final RLottieImageView leftImageView;
    public final BaseFragment parentFragment;
    public int prevSeconds;
    public final Paint progressPaint;
    public final RectF rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView subinfoTextView;
    public final TextPaint textPaint;
    public int textWidth;
    public StaticLayout timeLayout;
    public StaticLayout timeLayoutOut;
    public long timeLeft;
    public String timeLeftString;
    public float timeReplaceProgress;
    public final LinearLayout undoButton;
    public final ImageView undoImageView;
    public final TextView undoTextView;
    public int undoViewHeight;

    public final class LinkMovementMethodMy extends LinkMovementMethod {
        public LinkMovementMethodMy() {
        }

        @Override
        public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
            CharacterStyle[] characterStyleArr;
            try {
                if (motionEvent.getAction() != 0 || ((characterStyleArr = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class)) != null && characterStyleArr.length != 0)) {
                    if (motionEvent.getAction() != 1) {
                        return super.onTouchEvent(textView, spannable, motionEvent);
                    }
                    CharacterStyle[] characterStyleArr2 = (CharacterStyle[]) spannable.getSpans(textView.getSelectionStart(), textView.getSelectionEnd(), CharacterStyle.class);
                    if (characterStyleArr2 != null && characterStyleArr2.length > 0) {
                        UndoView.this.didPressUrl(characterStyleArr2[0]);
                    }
                    Selection.removeSelection(spannable);
                    return true;
                }
                return false;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }
    }

    public UndoView(Context context) {
        this(context, null, false, null);
    }

    public boolean canUndo() {
        return true;
    }

    public void didPressUrl(CharacterStyle characterStyle) {
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.additionalTranslationY == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        float measuredHeight = (getMeasuredHeight() - this.enterOffset) + AndroidUtilities.dp(9.0f);
        if (measuredHeight > 0.0f) {
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
            super.dispatchDraw(canvas);
        }
        canvas.restore();
    }

    @Override
    public Drawable getBackground() {
        return this.backgroundDrawable;
    }

    public Object getCurrentInfoObject() {
        return this.currentInfoObject;
    }

    public float getEnterOffset() {
        return this.enterOffset;
    }

    public final int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public final boolean hasSubInfo() {
        int i;
        Object obj;
        int i2 = this.currentAction;
        if (i2 == 11 || i2 == 24 || i2 == 6 || i2 == 3 || i2 == 5 || i2 == 13 || i2 == 14 || i2 == 74) {
            return true;
        }
        if ((i2 == 7 && MessagesController.getInstance(this.currentAccount).dialogFilters.isEmpty()) || (i = this.currentAction) == 83 || i == 85) {
            return true;
        }
        return i == 88 && (obj = this.currentInfoObject2) != null && ((Integer) obj).intValue() > 0;
    }

    public void hide(int i, boolean z) {
        if (getVisibility() == 0 && this.isShown) {
            this.currentInfoObject = null;
            this.currentInfoObject2 = null;
            this.isShown = false;
            Runnable runnable = this.currentActionRunnable;
            if (runnable != null) {
                if (z) {
                    runnable.run();
                }
                this.currentActionRunnable = null;
            }
            Runnable runnable2 = this.currentCancelRunnable;
            if (runnable2 != null) {
                if (!z) {
                    runnable2.run();
                }
                this.currentCancelRunnable = null;
            }
            int i2 = this.currentAction;
            if (i2 == 0 || i2 == 1 || i2 == 95 || i2 == 26 || i2 == 27) {
                for (int i3 = 0; i3 < this.currentDialogIds.size(); i3++) {
                    long jLongValue = ((Long) this.currentDialogIds.get(i3)).longValue();
                    MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                    int i4 = this.currentAction;
                    messagesController.removeDialogAction(jLongValue, i4 == 0 || i4 == 26, z);
                    onRemoveDialogAction(this.currentAction, jLongValue);
                }
            }
            boolean z2 = this.fromTop;
            if (i == 0) {
                setEnterOffset((z2 ? -1.0f : 1.0f) * (this.enterOffsetMargin + this.undoViewHeight));
                setVisibility(4);
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (i == 1) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", (z2 ? -1.0f : 1.0f) * (this.enterOffsetMargin + this.undoViewHeight)));
                animatorSet.setDuration(250L);
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_X, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.SCALE_Y, 0.8f), ObjectAnimator.ofFloat(this, (Property<UndoView, Float>) View.ALPHA, 0.0f));
                animatorSet.setDuration(180L);
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.addListener(new Tooltip.AnonymousClass1(this, 16));
            animatorSet.start();
        }
    }

    @Override
    public void invalidate() {
        super.invalidate();
        this.infoTextView.invalidate();
        this.leftImageView.invalidate();
    }

    public final boolean isMultilineSubInfo() {
        int i = this.currentAction;
        return i == 12 || i == 15 || i == 24 || i == 74 || i == 83;
    }

    public final boolean isTooltipAction() {
        int i = this.currentAction;
        return i == 6 || i == 3 || i == 5 || i == 7 || i == 8 || i == 87 || i == 9 || i == 10 || i == 13 || i == 14 || i == 19 || i == 20 || i == 21 || i == 22 || i == 23 || i == 30 || i == 31 || i == 32 || i == 102 || i == 33 || i == 34 || i == 35 || i == 36 || i == 74 || i == 37 || i == 38 || i == 39 || i == 40 || i == 42 || i == 43 || i == 77 || i == 44 || i == 78 || i == 79 || i == 100 || i == 101 || i == 83;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f = this.additionalTranslationY;
        ShapeDrawable shapeDrawable = this.backgroundDrawable;
        if (f != 0.0f) {
            canvas.save();
            float measuredHeight = (getMeasuredHeight() - this.enterOffset) + this.enterOffsetMargin + AndroidUtilities.dp(1.0f);
            if (measuredHeight > 0.0f) {
                canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight);
                super.dispatchDraw(canvas);
            }
            shapeDrawable.draw(canvas);
            canvas.restore();
        } else {
            shapeDrawable.draw(canvas);
        }
        int i = this.currentAction;
        if (i == 1 || i == 95 || i == 0 || i == 27 || i == 26 || i == 81 || i == 88) {
            long j = this.timeLeft;
            int iCeil = j > 0 ? (int) Math.ceil(j / 1000.0f) : 0;
            int i2 = this.prevSeconds;
            TextPaint textPaint = this.textPaint;
            if (i2 != iCeil) {
                this.prevSeconds = iCeil;
                String str = String.format("%d", Integer.valueOf(Math.max(1, iCeil)));
                this.timeLeftString = str;
                StaticLayout staticLayout = this.timeLayout;
                if (staticLayout != null) {
                    this.timeLayoutOut = staticLayout;
                    this.timeReplaceProgress = 0.0f;
                }
                this.textWidth = (int) Math.ceil(textPaint.measureText(str));
                this.timeLayout = new StaticLayout(this.timeLeftString, textPaint, Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            float f2 = this.timeReplaceProgress;
            if (f2 < 1.0f) {
                float f3 = f2 + 0.10666667f;
                this.timeReplaceProgress = f3;
                if (f3 > 1.0f) {
                    this.timeReplaceProgress = 1.0f;
                } else {
                    invalidate();
                }
            }
            int alpha = textPaint.getAlpha();
            StaticLayout staticLayout2 = this.timeLayoutOut;
            RectF rectF = this.rect;
            if (staticLayout2 != null) {
                float f4 = this.timeReplaceProgress;
                if (f4 < 1.0f) {
                    textPaint.setAlpha((int) ((1.0f - f4) * alpha));
                    canvas.save();
                    canvas.translate(rectF.centerX() - (this.textWidth / 2), (AndroidUtilities.dp(10.0f) * this.timeReplaceProgress) + AndroidUtilities.dp(17.2f));
                    this.timeLayoutOut.draw(canvas);
                    textPaint.setAlpha(alpha);
                    canvas.restore();
                }
            }
            if (this.timeLayout != null) {
                float f5 = this.timeReplaceProgress;
                if (f5 != 1.0f) {
                    textPaint.setAlpha((int) (alpha * f5));
                }
                canvas.save();
                canvas.translate(rectF.centerX() - (this.textWidth / 2), BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.timeReplaceProgress, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(17.2f)));
                this.timeLayout.draw(canvas);
                if (this.timeReplaceProgress != 1.0f) {
                    textPaint.setAlpha(alpha);
                }
                canvas.restore();
            }
            canvas.drawArc(rectF, -90.0f, (this.timeLeft / 5000.0f) * (-360.0f), false, this.progressPaint);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.timeLeft - (jElapsedRealtime - this.lastUpdateTime);
        this.timeLeft = j2;
        this.lastUpdateTime = jElapsedRealtime;
        if (j2 <= 0) {
            hide(this.hideAnimationType, true);
        }
        if (this.currentAction != 82) {
            invalidate();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(this.undoViewHeight, 1073741824));
        this.backgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public void onRemoveDialogAction(int i, long j) {
    }

    public void setAdditionalTranslationY(float f) {
        if (this.additionalTranslationY != f) {
            this.additionalTranslationY = f;
            setTranslationY(((this.enterOffset - this.enterOffsetMargin) + AndroidUtilities.dp(8.0f)) - this.additionalTranslationY);
            invalidate();
        }
    }

    public final void setColors() {
        Theme.setDrawableColor(-115203550, this.backgroundDrawable);
        this.infoTextView.setTextColor(-1);
        this.subinfoTextView.setTextColor(-1);
        RLottieImageView rLottieImageView = this.leftImageView;
        rLottieImageView.setLayerColor(-14540254, "info1");
        rLottieImageView.setLayerColor(-14540254, "info2");
    }

    public void setEnterOffset(float f) {
        if (this.enterOffset != f) {
            this.enterOffset = f;
            setTranslationY(((f - this.enterOffsetMargin) + AndroidUtilities.dp(8.0f)) - this.additionalTranslationY);
            invalidate();
        }
    }

    public void setEnterOffsetMargin(int i) {
        this.enterOffsetMargin = i;
    }

    public void setHideAnimationType(int i) {
        this.hideAnimationType = i;
    }

    public void setInfoText(CharSequence charSequence) {
        this.infoText = charSequence;
    }

    public final void showWithAction() {
        showWithAction(0L, 52, (Object) null, (Object) null, (Runnable) null, (Runnable) null);
    }

    public UndoView(Context context, ThemePreviewActivity themePreviewActivity) {
        this(context, themePreviewActivity, false, null);
    }

    public final void showWithAction(long j, Integer num) {
        showWithAction(j, 22, num, (Object) null, (Runnable) null, (Runnable) null);
    }

    public UndoView(Context context, BaseFragment baseFragment, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.infoTextViewEmojiCacheType = 0;
        this.currentAccount = UserConfig.selectedAccount;
        this.currentAction = -1;
        this.hideAnimationType = 1;
        this.enterOffsetMargin = AndroidUtilities.dp(8.0f);
        this.timeReplaceProgress = 1.0f;
        this.resourcesProvider = resourcesProvider;
        this.parentFragment = baseFragment;
        this.fromTop = z;
        CheckBoxCell.AnonymousClass2 anonymousClass2 = new CheckBoxCell.AnonymousClass2(this, context, resourcesProvider);
        this.infoTextView = anonymousClass2;
        anonymousClass2.setTextSize(1, 15.0f);
        int i = Theme.key_undo_infoColor;
        anonymousClass2.setTextColor(Theme.getColor(i, resourcesProvider));
        int i2 = Theme.key_undo_cancelColor;
        anonymousClass2.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
        anonymousClass2.setMovementMethod(new LinkMovementMethodMy());
        addView(anonymousClass2, LayoutHelper.createFrame(-2, -2.0f, 51, 45.0f, 13.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.subinfoTextView = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        textView.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
        textView.setHighlightColor(0);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 58.0f, 27.0f, 8.0f, 0.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.leftImageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = Theme.key_undo_background;
        rLottieImageView.setLayerColor(Theme.getColor(i3, resourcesProvider) | (-16777216), "info1");
        rLottieImageView.setLayerColor(Theme.getColor(i3, resourcesProvider) | (-16777216), "info2");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc12");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc11");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc10");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc9");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc8");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc7");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc6");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc5");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc4");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc3");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc2");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "luc1");
        rLottieImageView.setLayerColor(Theme.getColor(i, resourcesProvider), "Oval");
        addView(rLottieImageView, LayoutHelper.createFrame(54, -2.0f, 19, 3.0f, 0.0f, 0.0f, 0.0f));
        BackupImageView backupImageView = new BackupImageView(context);
        this.avatarImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(15.0f));
        addView(backupImageView, LayoutHelper.createFrame(30, 30.0f, 19, 15.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.undoButton = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(i2, resourcesProvider) & 587202559, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, 0.0f, 11.0f, 0.0f));
        linearLayout.setOnClickListener(new UndoView$$ExternalSyntheticLambda0(this, 0));
        ImageView imageView = new ImageView(context);
        this.undoImageView = imageView;
        imageView.setImageResource(R.drawable.chats_undo);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -2, 19, 4, 4, 0, 4));
        TextView textView2 = new TextView(context);
        this.undoTextView = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(Theme.getColor(i2, resourcesProvider));
        textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 19, 6, 4, 8, 4));
        this.rect = new RectF(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(33.0f), AndroidUtilities.dp(33.0f));
        Paint paint = new Paint(1);
        this.progressPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(Theme.getColor(i, resourcesProvider));
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setColor(Theme.getColor(i, resourcesProvider));
        setWillNotDraw(false);
        this.backgroundDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), Theme.getColor(i3, resourcesProvider));
        setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(24));
        setVisibility(4);
    }

    public void showWithAction(long j, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Long.valueOf(j));
        showWithAction(arrayList, i, obj, obj2, runnable, runnable2);
    }

    public final void showWithAction(ArrayList arrayList, int i, Object obj, Object obj2, Runnable runnable, Runnable runnable2) {
        MovementMethod movementMethod;
        TextView textView;
        String str;
        FrameLayout.LayoutParams layoutParams;
        boolean z;
        long j;
        int i2;
        int iDp;
        int i3;
        String str2;
        int measuredWidth;
        int i4;
        float f;
        int iDp2;
        int i5;
        float f2;
        boolean z2;
        float f3;
        int measuredWidth2;
        FrameLayout.LayoutParams layoutParams2;
        CharSequence charSequenceReplaceTags;
        int i6;
        String firstName;
        int i7;
        String string;
        String string2;
        int i8;
        CharSequence string3;
        int i9;
        String firstName2;
        String firstName3;
        String firstName4;
        String firstName5;
        String name;
        int i10;
        CharSequence charSequenceReplaceTags2;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        int i11;
        int i12;
        if (AndroidUtilities.shouldShowClipboardToast() || !((i12 = this.currentAction) == 52 || i12 == 56 || i12 == 57 || i12 == 58 || i12 == 59 || i12 == 60 || i12 == 80 || i12 == 33)) {
            Runnable runnable3 = this.currentActionRunnable;
            if (runnable3 != null) {
                runnable3.run();
            }
            this.isShown = true;
            this.currentActionRunnable = runnable;
            this.currentCancelRunnable = runnable2;
            this.currentDialogIds = arrayList;
            Long l = (Long) arrayList.get(0);
            long jLongValue = l.longValue();
            this.currentAction = i;
            this.timeLeft = 5000L;
            this.currentInfoObject = obj;
            this.currentInfoObject2 = obj2;
            this.lastUpdateTime = SystemClock.elapsedRealtime();
            TextView textView2 = this.undoTextView;
            textView2.setText(LocaleController.getString(R.string.UndoNoCaps));
            ImageView imageView = this.undoImageView;
            imageView.setVisibility(0);
            RLottieImageView rLottieImageView = this.leftImageView;
            rLottieImageView.setPadding(0, 0, 0, 0);
            rLottieImageView.setScaleX(1.0f);
            rLottieImageView.setScaleY(1.0f);
            CheckBoxCell.AnonymousClass2 anonymousClass2 = this.infoTextView;
            anonymousClass2.setTextSize(1, 15.0f);
            BackupImageView backupImageView = this.avatarImageView;
            backupImageView.setVisibility(8);
            anonymousClass2.setGravity(51);
            TextView textView3 = this.subinfoTextView;
            ((FrameLayout.LayoutParams) textView3.getLayoutParams()).leftMargin = AndroidUtilities.dp(58.0f);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) anonymousClass2.getLayoutParams();
            layoutParams3.height = -2;
            layoutParams3.topMargin = AndroidUtilities.dp(13.0f);
            layoutParams3.bottomMargin = 0;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) rLottieImageView.getLayoutParams();
            layoutParams4.gravity = 19;
            layoutParams4.bottomMargin = 0;
            layoutParams4.topMargin = 0;
            layoutParams4.leftMargin = AndroidUtilities.dp(3.0f);
            layoutParams4.width = AndroidUtilities.dp(54.0f);
            layoutParams4.height = -2;
            anonymousClass2.setMinHeight(0);
            if ((runnable == null && runnable2 == null) || i == 83) {
                setOnClickListener(new UndoView$$ExternalSyntheticLambda0(this, 1));
                movementMethod = null;
                setOnTouchListener(null);
            } else {
                setOnClickListener(null);
                setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(25));
                movementMethod = null;
            }
            anonymousClass2.setMovementMethod(movementMethod);
            boolean zIsTooltipAction = isTooltipAction();
            LinearLayout linearLayout = this.undoButton;
            int i13 = this.currentAccount;
            if (zIsTooltipAction) {
                if (i == 83) {
                    textView = textView3;
                    textView.setSingleLine(false);
                    charSequenceReplaceTags = LocaleController.getString(R.string.SoundAdded);
                    string3 = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SoundAddedSubtitle), runnable);
                    this.currentActionRunnable = null;
                    i6 = R.raw.sound_download;
                    this.timeLeft = 4000L;
                } else {
                    if (i == 74) {
                        textView = textView3;
                        textView.setSingleLine(false);
                        charSequenceReplaceTags = LocaleController.getString(R.string.ReportChatSent);
                        string3 = LocaleController.formatString("ReportSentInfo", R.string.ReportSentInfo, new Object[0]);
                        i6 = R.raw.ic_admin;
                        this.timeLeft = 4000L;
                    } else {
                        if (i == 34) {
                            TLRPC.User user = (TLRPC.User) obj;
                            if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                                textView = textView3;
                                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelInvitedUser", R.string.VoipChannelInvitedUser, UserObject.getFirstName(user)));
                            } else {
                                textView = textView3;
                                spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupInvitedUser", R.string.VoipGroupInvitedUser, UserObject.getFirstName(user)));
                            }
                            AvatarDrawable avatarDrawable = new AvatarDrawable();
                            avatarDrawable.namePaint.setTextSize(AndroidUtilities.dp(12.0f));
                            avatarDrawable.setInfo(i13, user);
                            backupImageView.setForUserOrChat(user, avatarDrawable);
                            backupImageView.setVisibility(0);
                            this.timeLeft = 3000L;
                            charSequenceReplaceTags = spannableStringBuilderReplaceTags;
                        } else if (i == 44) {
                            TLRPC.Chat chat = (TLRPC.Chat) obj2;
                            if (obj instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) obj;
                                if (ChatObject.isChannelOrGiga(chat)) {
                                    textView = textView3;
                                    charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelUserJoined, UserObject.getFirstName(user2)));
                                } else {
                                    textView = textView3;
                                    charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatUserJoined, UserObject.getFirstName(user2)));
                                }
                            } else if (obj instanceof TLRPC.Chat) {
                                TLRPC.Chat chat2 = (TLRPC.Chat) obj;
                                if (ChatObject.isChannelOrGiga(chat)) {
                                    textView = textView3;
                                    charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChannelChatJoined, chat2.title));
                                } else {
                                    textView = textView3;
                                    charSequenceReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipChatChatJoined, chat2.title));
                                }
                            } else {
                                textView = textView3;
                                charSequenceReplaceTags2 = "";
                            }
                            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
                            avatarDrawable2.namePaint.setTextSize(AndroidUtilities.dp(12.0f));
                            TLObject tLObject = (TLObject) obj;
                            avatarDrawable2.setInfo(i13, tLObject);
                            backupImageView.setForUserOrChat(tLObject, avatarDrawable2);
                            backupImageView.setVisibility(0);
                            this.timeLeft = 3000L;
                            charSequenceReplaceTags = charSequenceReplaceTags2;
                        } else if (i == 37) {
                            AvatarDrawable avatarDrawable3 = new AvatarDrawable();
                            avatarDrawable3.namePaint.setTextSize(AndroidUtilities.dp(12.0f));
                            if (obj instanceof TLRPC.User) {
                                textView = textView3;
                                TLRPC.User user3 = (TLRPC.User) obj;
                                avatarDrawable3.setInfo(i13, user3);
                                backupImageView.setForUserOrChat(user3, avatarDrawable3);
                                name = ContactsController.formatName(user3.first_name, user3.last_name);
                            } else {
                                textView = textView3;
                                TLRPC.Chat chat3 = (TLRPC.Chat) obj;
                                avatarDrawable3.setInfo(i13, chat3);
                                backupImageView.setForUserOrChat(chat3, avatarDrawable3);
                                name = chat3.title;
                            }
                            if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj2)) {
                                i10 = 0;
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipChannelUserChanged", R.string.VoipChannelUserChanged, name));
                            } else {
                                i10 = 0;
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserChanged", R.string.VoipGroupUserChanged, name));
                            }
                            backupImageView.setVisibility(i10);
                            this.timeLeft = 3000L;
                        } else {
                            layoutParams2 = layoutParams3;
                            if (i == 33) {
                                textView = textView3;
                                charSequenceReplaceTags = LocaleController.getString(R.string.VoipGroupCopyInviteLinkCopied);
                                i7 = R.raw.voip_invite;
                                this.timeLeft = 3000L;
                            } else if (i == 77) {
                                charSequenceReplaceTags = (CharSequence) obj;
                                i7 = R.raw.payment_success;
                                this.timeLeft = 5000L;
                                if (this.parentFragment != null && (obj2 instanceof TLRPC.Message)) {
                                    textView = textView3;
                                    setOnTouchListener(null);
                                    anonymousClass2.setMovementMethod(null);
                                    setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(23, this, (TLRPC.Message) obj2));
                                }
                            } else if (i == 30) {
                                if (obj instanceof TLRPC.User) {
                                    textView = textView3;
                                    firstName5 = UserObject.getFirstName((TLRPC.User) obj);
                                } else {
                                    textView = textView3;
                                    firstName5 = ((TLRPC.Chat) obj).title;
                                }
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeak", R.string.VoipGroupUserCantNowSpeak, firstName5));
                                i7 = R.raw.voip_muted;
                                this.timeLeft = 3000L;
                            } else if (i == 35) {
                                if (obj instanceof TLRPC.User) {
                                    textView = textView3;
                                    firstName4 = UserObject.getFirstName((TLRPC.User) obj);
                                } else if (obj instanceof TLRPC.Chat) {
                                    textView = textView3;
                                    firstName4 = ((TLRPC.Chat) obj).title;
                                } else {
                                    textView = textView3;
                                    firstName4 = "";
                                }
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCantNowSpeakForYou", R.string.VoipGroupUserCantNowSpeakForYou, firstName4));
                                i7 = R.raw.voip_muted;
                                this.timeLeft = 3000L;
                            } else if (i == 31) {
                                if (obj instanceof TLRPC.User) {
                                    textView = textView3;
                                    firstName3 = UserObject.getFirstName((TLRPC.User) obj);
                                } else {
                                    textView = textView3;
                                    firstName3 = ((TLRPC.Chat) obj).title;
                                }
                                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeak", R.string.VoipGroupUserCanNowSpeak, firstName3));
                                i7 = R.raw.voip_unmuted;
                                this.timeLeft = 3000L;
                            } else if (i == 38) {
                                if (obj instanceof TLRPC.Chat) {
                                    textView = textView3;
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupYouCanNowSpeakIn", R.string.VoipGroupYouCanNowSpeakIn, ((TLRPC.Chat) obj).title));
                                } else {
                                    textView = textView3;
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupYouCanNowSpeak));
                                }
                                i7 = R.raw.voip_allow_talk;
                                this.timeLeft = 3000L;
                            } else if (i == 42) {
                                if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj)) {
                                    textView = textView3;
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundMuted));
                                } else {
                                    textView = textView3;
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundMuted));
                                }
                                i7 = R.raw.ic_mute;
                                this.timeLeft = 3000L;
                            } else if (i == 43) {
                                if (ChatObject.isChannelOrGiga((TLRPC.Chat) obj)) {
                                    textView = textView3;
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipChannelSoundUnmuted));
                                } else {
                                    textView = textView3;
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.VoipGroupSoundUnmuted));
                                }
                                i7 = R.raw.ic_unmute;
                                this.timeLeft = 3000L;
                            } else {
                                int i14 = this.currentAction;
                                if (i14 != 39 && i14 != 100) {
                                    int i15 = 40;
                                    if (i14 != 40) {
                                        if (i14 == 101) {
                                            textView = textView3;
                                            i15 = 40;
                                        } else if (i == 36) {
                                            if (obj instanceof TLRPC.User) {
                                                textView = textView3;
                                                firstName2 = UserObject.getFirstName((TLRPC.User) obj);
                                            } else {
                                                textView = textView3;
                                                firstName2 = ((TLRPC.Chat) obj).title;
                                            }
                                            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("VoipGroupUserCanNowSpeakForYou", R.string.VoipGroupUserCanNowSpeakForYou, firstName2));
                                            i7 = R.raw.voip_unmuted;
                                            this.timeLeft = 3000L;
                                        } else if (i == 32 || i == 102) {
                                            textView = textView3;
                                            textView = textView3;
                                            if (obj instanceof TLRPC.User) {
                                                firstName = UserObject.getFirstName((TLRPC.User) obj);
                                            } else {
                                                firstName = ((TLRPC.Chat) obj).title;
                                            }
                                            charSequenceReplaceTags = i == 102 ? AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipConferenceKicked, firstName)) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.VoipGroupRemovedFromGroup, firstName));
                                            i7 = R.raw.ic_ban;
                                            this.timeLeft = 3000L;
                                        } else if (i == 9 || i == 10) {
                                            textView = textView3;
                                            textView = textView3;
                                            TLRPC.User user4 = (TLRPC.User) obj;
                                            charSequenceReplaceTags = i == 9 ? AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferChannelToast", R.string.EditAdminTransferChannelToast, UserObject.getFirstName(user4))) : AndroidUtilities.replaceTags(LocaleController.formatString("EditAdminTransferGroupToast", R.string.EditAdminTransferGroupToast, UserObject.getFirstName(user4)));
                                            i7 = R.raw.contact_check;
                                        } else if (i == 8) {
                                            textView = textView3;
                                            charSequenceReplaceTags = LocaleController.formatString("NowInContacts", R.string.NowInContacts, UserObject.getFirstName((TLRPC.User) obj));
                                            i6 = R.raw.contact_check;
                                            str = "";
                                        } else if (i == 87) {
                                            textView = textView3;
                                            charSequenceReplaceTags = LocaleController.formatString(R.string.ProxyAddedSuccess, new Object[0]);
                                            i7 = R.raw.contact_check;
                                        } else if (i == 22) {
                                            if (!DialogObject.isUserDialog(jLongValue)) {
                                                TLRPC.Chat chat4 = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-jLongValue));
                                                if (!ChatObject.isChannel(chat4) || chat4.megagroup) {
                                                    if (obj == null) {
                                                        charSequenceReplaceTags = LocaleController.getString(R.string.MainGroupProfilePhotoSetHint);
                                                    } else {
                                                        charSequenceReplaceTags = LocaleController.getString(R.string.MainGroupProfileVideoSetHint);
                                                    }
                                                } else if (obj == null) {
                                                    charSequenceReplaceTags = LocaleController.getString(R.string.MainChannelProfilePhotoSetHint);
                                                } else {
                                                    charSequenceReplaceTags = LocaleController.getString(R.string.MainChannelProfileVideoSetHint);
                                                }
                                            } else if (obj == null) {
                                                charSequenceReplaceTags = LocaleController.getString(R.string.MainProfilePhotoSetHint);
                                            } else {
                                                charSequenceReplaceTags = LocaleController.getString(R.string.MainProfileVideoSetHint);
                                            }
                                            i7 = R.raw.contact_check;
                                        } else if (i == 23) {
                                            textView = textView3;
                                            charSequenceReplaceTags = LocaleController.getString(R.string.ChatWasMovedToMainList);
                                            i7 = R.raw.contact_check;
                                        } else if (i == 6) {
                                            textView = textView3;
                                            charSequenceReplaceTags = LocaleController.getString(R.string.ArchiveHidden);
                                            string3 = LocaleController.getString(R.string.ArchiveHiddenInfo);
                                            i6 = R.raw.chats_swipearchive;
                                            i9 = 48;
                                            str = "";
                                        } else {
                                            if (i14 == 13) {
                                                textView = textView3;
                                                charSequenceReplaceTags = LocaleController.getString(R.string.QuizWellDone);
                                                string3 = LocaleController.getString(R.string.QuizWellDoneInfo);
                                                i6 = R.raw.wallet_congrats;
                                            } else if (i14 == 14) {
                                                textView = textView3;
                                                charSequenceReplaceTags = LocaleController.getString(R.string.QuizWrongAnswer);
                                                string3 = LocaleController.getString(R.string.QuizWrongAnswerInfo);
                                                i6 = R.raw.wallet_science;
                                            } else {
                                                if (i == 7) {
                                                    string = LocaleController.getString(R.string.ArchivePinned);
                                                    if (MessagesController.getInstance(i13).dialogFilters.isEmpty()) {
                                                        textView = textView3;
                                                        string2 = LocaleController.getString(R.string.ArchivePinnedInfo);
                                                    } else {
                                                        textView = textView3;
                                                        string2 = null;
                                                    }
                                                    i6 = R.raw.chats_infotip;
                                                } else if (i == 20 || i == 21) {
                                                    textView = textView3;
                                                    textView = textView3;
                                                    MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) obj2;
                                                    Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, anonymousClass2.getPaint().getFontMetricsInt(), false), dialogFilter.entities, anonymousClass2.getPaint().getFontMetricsInt());
                                                    this.infoTextViewEmojiCacheType = dialogFilter.title_noanimate ? 26 : 0;
                                                    if (jLongValue != 0) {
                                                        if (DialogObject.isEncryptedDialog(jLongValue)) {
                                                            jLongValue = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(MessagesController.getInstance(i13), jLongValue).user_id;
                                                        }
                                                        if (DialogObject.isUserDialog(jLongValue)) {
                                                            TLRPC.User user5 = MessagesController.getInstance(i13).getUser(Long.valueOf(jLongValue));
                                                            String firstName6 = UserObject.getFirstName(user5);
                                                            if (UserObject.isUserSelf(user5)) {
                                                                firstName6 = LocaleController.getString(R.string.SavedMessages);
                                                            } else if (UserObject.isReplyUser(user5)) {
                                                                firstName6 = LocaleController.getString(R.string.RepliesTitle);
                                                            }
                                                            charSequenceReplaceTags = i == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserAddedToExisting, firstName6, spannableReplaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterUserRemovedFrom, firstName6, spannableReplaceAnimatedEmoji));
                                                        } else {
                                                            TLRPC.Chat chat5 = MessagesController.getInstance(i13).getChat(Long.valueOf(-jLongValue));
                                                            charSequenceReplaceTags = i == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatAddedToExisting, chat5.title, spannableReplaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatRemovedFrom, chat5.title, spannableReplaceAnimatedEmoji));
                                                        }
                                                    } else {
                                                        charSequenceReplaceTags = i == 20 ? AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsAddedToExisting, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), spannableReplaceAnimatedEmoji)) : AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.FilterChatsRemovedFrom, LocaleController.formatPluralString("ChatsSelected", ((Integer) obj).intValue(), new Object[0]), spannableReplaceAnimatedEmoji));
                                                    }
                                                    i7 = i == 20 ? R.raw.folder_in : R.raw.folder_out;
                                                } else if (i == 19) {
                                                    textView = textView3;
                                                    charSequenceReplaceTags = this.infoText;
                                                    i7 = R.raw.ic_delete;
                                                } else if (i == 82) {
                                                    if (((MediaController.PhotoEntry) obj).isVideo) {
                                                        textView = textView3;
                                                        i8 = R.string.AttachMediaVideoDeselected;
                                                    } else {
                                                        textView = textView3;
                                                        i8 = R.string.AttachMediaPhotoDeselected;
                                                    }
                                                    charSequenceReplaceTags = LocaleController.getString(i8);
                                                    str = "";
                                                    string3 = null;
                                                    i6 = 0;
                                                    i9 = 36;
                                                } else if (i != 78 && i != 79) {
                                                    if (i == 3) {
                                                        textView = textView3;
                                                        string = LocaleController.getString(R.string.ChatArchived);
                                                    } else {
                                                        textView = textView3;
                                                        string = LocaleController.getString(R.string.ChatsArchived);
                                                    }
                                                    string2 = MessagesController.getInstance(i13).dialogFilters.isEmpty() ? LocaleController.getString(R.string.ChatArchivedInfo) : null;
                                                    i6 = R.raw.chats_infotip;
                                                } else {
                                                    textView = textView3;
                                                    textView = textView3;
                                                    int iIntValue = ((Integer) obj).intValue();
                                                    if (i == 78) {
                                                        charSequenceReplaceTags = LocaleController.formatPluralString("PinnedDialogsCount", iIntValue, new Object[0]);
                                                    } else {
                                                        charSequenceReplaceTags = LocaleController.formatPluralString("UnpinnedDialogsCount", iIntValue, new Object[0]);
                                                    }
                                                    i7 = this.currentAction == 78 ? R.raw.ic_pin : R.raw.ic_unpin;
                                                    if (obj2 instanceof Integer) {
                                                        this.timeLeft = ((Integer) obj2).intValue();
                                                    }
                                                }
                                                String str3 = string;
                                                string3 = string2;
                                                charSequenceReplaceTags = str3;
                                                str = "";
                                                i9 = 36;
                                            }
                                            str = "";
                                            i9 = 44;
                                        }
                                    }
                                    String string4 = LocaleController.getString(i14 == i15 ? R.string.VoipGroupAudioRecordSaved : R.string.VoipGroupVideoRecordSaved);
                                    i6 = R.raw.voip_record_saved;
                                    this.timeLeft = 4000L;
                                    anonymousClass2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string4);
                                    int iIndexOf = string4.indexOf("**");
                                    int iLastIndexOf = string4.lastIndexOf("**");
                                    if (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf == iLastIndexOf) {
                                        str = "";
                                    } else {
                                        str = "";
                                        spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 2, (CharSequence) str);
                                        spannableStringBuilder.replace(iIndexOf, iIndexOf + 2, (CharSequence) str);
                                        try {
                                            spannableStringBuilder.setSpan(new URLSpanNoUnderline("tg://openmessage?user_id=" + UserConfig.getInstance(i13).getClientUserId()), iIndexOf, iLastIndexOf - 2, 33);
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                    }
                                    charSequenceReplaceTags = spannableStringBuilder;
                                } else {
                                    textView = textView3;
                                    textView = textView3;
                                    str = "";
                                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i14 == 39 ? R.string.VoipGroupAudioRecordStarted : R.string.VoipGroupVideoRecordStarted));
                                    int i16 = R.raw.voip_record_start;
                                    this.timeLeft = 3000L;
                                    i6 = i16;
                                }
                                string3 = null;
                                i9 = 36;
                            }
                            textView = textView3;
                            textView = textView3;
                            i6 = i7;
                            str = "";
                            string3 = null;
                            i9 = 36;
                        }
                        layoutParams2 = layoutParams3;
                        str = "";
                        string3 = null;
                        i6 = 0;
                        i9 = 36;
                    }
                    anonymousClass2.setText(charSequenceReplaceTags);
                    if (i6 != 0) {
                        rLottieImageView.setAnimation(i6, i9, i9);
                        RLottieDrawable animatedDrawable = rLottieImageView.getAnimatedDrawable();
                        animatedDrawable.playInDirectionOfCustomEndFrame = false;
                        animatedDrawable.setCustomEndFrame(animatedDrawable.getFramesCount());
                        rLottieImageView.setVisibility(0);
                        rLottieImageView.setProgress(0.0f);
                        rLottieImageView.playAnimation();
                    } else {
                        rLottieImageView.setVisibility(8);
                    }
                    if (string3 != null) {
                        FrameLayout.LayoutParams layoutParams5 = layoutParams2;
                        layoutParams5.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams5.topMargin = AndroidUtilities.dp(6.0f);
                        layoutParams5.rightMargin = AndroidUtilities.dp(8.0f);
                        ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                        textView.setText(string3);
                        textView.setVisibility(0);
                        anonymousClass2.setTextSize(1, 14.0f);
                        anonymousClass2.setTypeface(AndroidUtilities.bold());
                        i11 = 8;
                    } else {
                        FrameLayout.LayoutParams layoutParams6 = layoutParams2;
                        layoutParams6.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams6.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams6.rightMargin = AndroidUtilities.dp(8.0f);
                        i11 = 8;
                        textView.setVisibility(8);
                        anonymousClass2.setTextSize(1, 15.0f);
                        anonymousClass2.setTypeface(Typeface.DEFAULT);
                    }
                    linearLayout.setVisibility(i11);
                }
                layoutParams2 = layoutParams3;
                str = "";
                i9 = 36;
                anonymousClass2.setText(charSequenceReplaceTags);
                if (i6 != 0) {
                    rLottieImageView.setAnimation(i6, i9, i9);
                    RLottieDrawable animatedDrawable2 = rLottieImageView.getAnimatedDrawable();
                    animatedDrawable2.playInDirectionOfCustomEndFrame = false;
                    animatedDrawable2.setCustomEndFrame(animatedDrawable2.getFramesCount());
                    rLottieImageView.setVisibility(0);
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                } else {
                    rLottieImageView.setVisibility(8);
                }
                if (string3 != null) {
                    FrameLayout.LayoutParams layoutParams7 = layoutParams2;
                    layoutParams7.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams7.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams7.rightMargin = AndroidUtilities.dp(8.0f);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(8.0f);
                    textView.setText(string3);
                    textView.setVisibility(0);
                    anonymousClass2.setTextSize(1, 14.0f);
                    anonymousClass2.setTypeface(AndroidUtilities.bold());
                    i11 = 8;
                } else {
                    FrameLayout.LayoutParams layoutParams8 = layoutParams2;
                    layoutParams8.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams8.topMargin = AndroidUtilities.dp(13.0f);
                    layoutParams8.rightMargin = AndroidUtilities.dp(8.0f);
                    i11 = 8;
                    textView.setVisibility(8);
                    anonymousClass2.setTextSize(1, 15.0f);
                    anonymousClass2.setTypeface(Typeface.DEFAULT);
                }
                linearLayout.setVisibility(i11);
            } else {
                str = "";
                int i17 = this.currentAction;
                if (i17 == 45 || i17 == 46 || i17 == 47 || i17 == 52 || i17 == 53 || i17 == 54 || i17 == 55 || i17 == 56 || i17 == 57 || i17 == 58 || i17 == 59 || i17 == 60) {
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                } else if (i17 == 71 || i17 == 70 || i17 == 75 || i17 == 76 || i17 == 41 || i17 == 78 || i17 == 79 || i17 == 61 || i17 == 80) {
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                    textView = textView3;
                } else if (i17 == 24 || i17 == 25) {
                    textView = textView3;
                    textView = textView3;
                    int iIntValue2 = ((Integer) obj).intValue();
                    TLRPC.User user6 = (TLRPC.User) obj2;
                    imageView.setVisibility(8);
                    rLottieImageView.setVisibility(0);
                    if (iIntValue2 != 0) {
                        anonymousClass2.setTypeface(AndroidUtilities.bold());
                        anonymousClass2.setTextSize(1, 14.0f);
                        rLottieImageView.layerColors.clear();
                        int i18 = Theme.key_undo_infoColor;
                        rLottieImageView.setLayerColor(getThemedColor(i18), "BODY");
                        rLottieImageView.setLayerColor(getThemedColor(i18), "Wibe Big");
                        rLottieImageView.setLayerColor(getThemedColor(i18), "Wibe Big 3");
                        rLottieImageView.setLayerColor(getThemedColor(i18), "Wibe Small");
                        anonymousClass2.setText(LocaleController.getString(R.string.ProximityAlertSet));
                        rLottieImageView.setAnimation(R.raw.ic_unmute, 28, 28);
                        textView.setVisibility(0);
                        textView.setSingleLine(false);
                        textView.setMaxLines(3);
                        if (user6 != null) {
                            textView.setText(LocaleController.formatString("ProximityAlertSetInfoUser", R.string.ProximityAlertSetInfoUser, UserObject.getFirstName(user6), LocaleController.formatDistance(iIntValue2, 2)));
                        } else {
                            textView.setText(LocaleController.formatString("ProximityAlertSetInfoGroup2", R.string.ProximityAlertSetInfoGroup2, LocaleController.formatDistance(iIntValue2, 2)));
                        }
                        linearLayout.setVisibility(8);
                        layoutParams3.topMargin = AndroidUtilities.dp(6.0f);
                    } else {
                        anonymousClass2.setTypeface(Typeface.DEFAULT);
                        anonymousClass2.setTextSize(1, 15.0f);
                        rLottieImageView.layerColors.clear();
                        int i19 = Theme.key_undo_infoColor;
                        rLottieImageView.setLayerColor(getThemedColor(i19), "Body Main");
                        rLottieImageView.setLayerColor(getThemedColor(i19), "Body Top");
                        rLottieImageView.setLayerColor(getThemedColor(i19), "Line");
                        rLottieImageView.setLayerColor(getThemedColor(i19), "Curve Big");
                        rLottieImageView.setLayerColor(getThemedColor(i19), "Curve Small");
                        layoutParams3.topMargin = AndroidUtilities.dp(14.0f);
                        anonymousClass2.setText(LocaleController.getString(R.string.ProximityAlertCancelled));
                        rLottieImageView.setAnimation(R.raw.ic_mute, 28, 28);
                        textView.setVisibility(8);
                        textView2.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                        linearLayout.setVisibility(0);
                    }
                    layoutParams3.leftMargin = AndroidUtilities.dp(58.0f);
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                } else if (i17 == 11) {
                    textView = textView3;
                    anonymousClass2.setText(LocaleController.getString(R.string.AuthAnotherClientOk));
                    rLottieImageView.setAnimation(R.raw.contact_check, 36, 36);
                    layoutParams3.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams3.topMargin = AndroidUtilities.dp(6.0f);
                    textView.setText(((TLRPC.TL_authorization) obj).app_name);
                    textView.setVisibility(0);
                    anonymousClass2.setTextSize(1, 14.0f);
                    anonymousClass2.setTypeface(AndroidUtilities.bold());
                    textView2.setTextColor(getThemedColor(Theme.key_text_RedRegular));
                    imageView.setVisibility(8);
                    linearLayout.setVisibility(0);
                    rLottieImageView.setVisibility(0);
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                } else if (i17 == 15) {
                    this.timeLeft = 10000L;
                    textView2.setText(LocaleController.getString(R.string.Open));
                    anonymousClass2.setText(LocaleController.getString(R.string.FilterAvailableTitle));
                    rLottieImageView.setAnimation(R.raw.filter_new, 36, 36);
                    int iDp3 = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                    layoutParams3.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams3.rightMargin = iDp3;
                    layoutParams3.topMargin = AndroidUtilities.dp(6.0f);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = iDp3;
                    String string5 = LocaleController.getString(R.string.FilterAvailableText);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string5);
                    int iIndexOf2 = string5.indexOf(42);
                    int iLastIndexOf2 = string5.lastIndexOf(42);
                    if (iIndexOf2 >= 0 && iLastIndexOf2 >= 0 && iIndexOf2 != iLastIndexOf2) {
                        spannableStringBuilder2.replace(iLastIndexOf2, iLastIndexOf2 + 1, (CharSequence) str);
                        spannableStringBuilder2.replace(iIndexOf2, iIndexOf2 + 1, (CharSequence) str);
                        spannableStringBuilder2.setSpan(new URLSpanNoUnderline("tg://settings/folders"), iIndexOf2, iLastIndexOf2 - 1, 33);
                    }
                    textView = textView3;
                    textView.setText(spannableStringBuilder2);
                    textView.setVisibility(0);
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                    linearLayout.setVisibility(0);
                    imageView.setVisibility(8);
                    rLottieImageView.setVisibility(0);
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                } else if (i17 == 16 || i17 == 17) {
                    textView = textView3;
                    textView = textView3;
                    this.timeLeft = 4000L;
                    anonymousClass2.setTextSize(1, 14.0f);
                    anonymousClass2.setGravity(16);
                    anonymousClass2.setMinHeight(AndroidUtilities.dp(30.0f));
                    String str4 = (String) obj;
                    if ("🎲".equals(str4)) {
                        anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DiceInfo2)));
                        rLottieImageView.setImageResource(R.drawable.dice);
                    } else {
                        if ("🎯".equals(str4)) {
                            anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.DartInfo)));
                        } else {
                            String serverString = LocaleController.getServerString("DiceEmojiInfo_" + str4);
                            if (TextUtils.isEmpty(serverString)) {
                                anonymousClass2.setText(Emoji.replaceEmoji(LocaleController.formatString("DiceEmojiInfo", R.string.DiceEmojiInfo, str4), anonymousClass2.getPaint().getFontMetricsInt(), false));
                            } else {
                                anonymousClass2.setText(Emoji.replaceEmoji(serverString, anonymousClass2.getPaint().getFontMetricsInt(), false));
                            }
                        }
                        rLottieImageView.setImageDrawable(Emoji.getEmojiDrawable(str4));
                        rLottieImageView.setScaleType(ImageView.ScaleType.FIT_XY);
                        layoutParams3.topMargin = AndroidUtilities.dp(14.0f);
                        layoutParams3.bottomMargin = AndroidUtilities.dp(14.0f);
                        layoutParams4.leftMargin = AndroidUtilities.dp(14.0f);
                        layoutParams4.width = AndroidUtilities.dp(26.0f);
                        layoutParams4.height = AndroidUtilities.dp(26.0f);
                    }
                    textView2.setText(LocaleController.getString(R.string.SendDice));
                    if (this.currentAction == 16) {
                        iDp = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                        textView2.setVisibility(0);
                        textView2.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                        imageView.setVisibility(8);
                        linearLayout.setVisibility(0);
                    } else {
                        iDp = AndroidUtilities.dp(8.0f);
                        textView2.setVisibility(8);
                        linearLayout.setVisibility(8);
                    }
                    layoutParams3.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams3.rightMargin = iDp;
                    layoutParams3.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams3.bottomMargin = AndroidUtilities.dp(7.0f);
                    layoutParams3.height = -1;
                    textView.setVisibility(8);
                    rLottieImageView.setVisibility(0);
                } else if (i17 == 18) {
                    textView = textView3;
                    CharSequence charSequence = (CharSequence) obj;
                    this.timeLeft = Math.max(4000, Math.min((charSequence.length() / 50) * 1600, 10000));
                    anonymousClass2.setTextSize(1, 14.0f);
                    anonymousClass2.setGravity(16);
                    anonymousClass2.setText(charSequence);
                    textView2.setVisibility(8);
                    linearLayout.setVisibility(8);
                    layoutParams3.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams3.rightMargin = AndroidUtilities.dp(8.0f);
                    layoutParams3.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams3.bottomMargin = AndroidUtilities.dp(7.0f);
                    layoutParams3.height = -1;
                    layoutParams4.gravity = 51;
                    int iDp4 = AndroidUtilities.dp(8.0f);
                    layoutParams4.bottomMargin = iDp4;
                    layoutParams4.topMargin = iDp4;
                    rLottieImageView.setVisibility(0);
                    rLottieImageView.setAnimation(R.raw.chats_infotip, 36, 36);
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                    anonymousClass2.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                } else if (i17 == 12) {
                    anonymousClass2.setText(LocaleController.getString(R.string.ColorThemeChanged));
                    rLottieImageView.setImageResource(R.drawable.toast_pallete);
                    layoutParams3.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams3.rightMargin = AndroidUtilities.dp(48.0f);
                    layoutParams3.topMargin = AndroidUtilities.dp(6.0f);
                    ((FrameLayout.LayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(48.0f);
                    String string6 = LocaleController.getString(R.string.ColorThemeChangedInfo);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string6);
                    int iIndexOf3 = string6.indexOf(42);
                    int iLastIndexOf3 = string6.lastIndexOf(42);
                    if (iIndexOf3 >= 0 && iLastIndexOf3 >= 0 && iIndexOf3 != iLastIndexOf3) {
                        spannableStringBuilder3.replace(iLastIndexOf3, iLastIndexOf3 + 1, (CharSequence) str);
                        spannableStringBuilder3.replace(iIndexOf3, iIndexOf3 + 1, (CharSequence) str);
                        spannableStringBuilder3.setSpan(new URLSpanNoUnderline("tg://settings/themes"), iIndexOf3, iLastIndexOf3 - 1, 33);
                    }
                    textView = textView3;
                    textView.setText(spannableStringBuilder3);
                    textView.setVisibility(0);
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                    textView2.setVisibility(8);
                    linearLayout.setVisibility(0);
                    rLottieImageView.setVisibility(0);
                } else if (i17 == 84) {
                    textView = textView3;
                    anonymousClass2.setVisibility(0);
                    anonymousClass2.setTextSize(1, 15.0f);
                    anonymousClass2.setTypeface(Typeface.DEFAULT);
                    anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumTranscriptionHint)));
                    rLottieImageView.setVisibility(0);
                    rLottieImageView.setAnimation(R.raw.voice_to_text, 36, 36);
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                    layoutParams3.leftMargin = zzlm.m(58.0f, R.string.PremiumMore, textView2);
                    layoutParams3.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                    int iDp5 = AndroidUtilities.dp(6.0f);
                    layoutParams3.bottomMargin = iDp5;
                    layoutParams3.topMargin = iDp5;
                    layoutParams3.height = -2;
                    backupImageView.setVisibility(8);
                    textView.setVisibility(8);
                    textView2.setVisibility(0);
                    linearLayout.setVisibility(0);
                    imageView.setVisibility(8);
                } else if (i17 == 85) {
                    textView = textView3;
                    anonymousClass2.setVisibility(0);
                    anonymousClass2.setTextSize(1, 15.0f);
                    anonymousClass2.setTypeface(AndroidUtilities.bold());
                    anonymousClass2.setText(LocaleController.getString(R.string.SwipeToReplyHint));
                    rLottieImageView.setVisibility(0);
                    rLottieImageView.setAnimation(R.raw.hint_swipe_reply, 64, 64);
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                    textView.setVisibility(0);
                    layoutParams3.leftMargin = zzlm.m(58.0f, R.string.SwipeToReplyHintMessage, textView);
                    layoutParams3.rightMargin = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                    layoutParams3.topMargin = AndroidUtilities.dp(6.0f);
                    layoutParams3.height = -2;
                    backupImageView.setVisibility(8);
                    linearLayout.setVisibility(8);
                } else if (i17 == 90 || i17 == 91 || i17 == 92 || i17 == 93 || i17 == 94) {
                    switch (i17) {
                        case 90:
                            anonymousClass2.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningChannelsGroupsPlural", (int) BoostRepository.giveawayAddPeersMax(), new Object[0]));
                            break;
                        case 91:
                            anonymousClass2.setText(LocaleController.getString(R.string.BoostingSelectUpToWarningUsers));
                            break;
                        case 92:
                            anonymousClass2.setText(LocaleController.formatPluralString("BoostingSelectUpToWarningCountriesPlural", (int) BoostRepository.giveawayCountriesMax(), new Object[0]));
                            break;
                        case 93:
                            anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingWaitWarningPlural", BoostRepository.boostsPerSentGift(), new Object[0])));
                            break;
                        case 94:
                            anonymousClass2.setText(LocaleController.getString(R.string.BoostingOnlyRecipientCode));
                            break;
                    }
                    layoutParams3.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams3.rightMargin = AndroidUtilities.dp(8.0f);
                    anonymousClass2.setTextSize(1, 15.0f);
                    linearLayout.setVisibility(8);
                    anonymousClass2.setTypeface(Typeface.DEFAULT);
                    textView.setVisibility(8);
                    rLottieImageView.setVisibility(0);
                    rLottieImageView.setAnimation(R.raw.chats_infotip, 36, 36);
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                } else {
                    int i20 = 2;
                    if (i17 == 2) {
                        if (i == i20) {
                            anonymousClass2.setText(LocaleController.getString(R.string.ChatArchived));
                        } else {
                            anonymousClass2.setText(LocaleController.getString(R.string.ChatsArchived));
                        }
                        layoutParams3.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams3.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams3.rightMargin = 0;
                        anonymousClass2.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        anonymousClass2.setTypeface(Typeface.DEFAULT);
                        textView.setVisibility(8);
                        rLottieImageView.setVisibility(0);
                        rLottieImageView.setAnimation(R.raw.chats_archived, 36, 36);
                        rLottieImageView.setProgress(0.0f);
                        rLottieImageView.playAnimation();
                    } else if (i17 == 4) {
                        textView = textView3;
                        i20 = 2;
                        if (i == i20) {
                            anonymousClass2.setText(LocaleController.getString(R.string.ChatArchived));
                        } else {
                            anonymousClass2.setText(LocaleController.getString(R.string.ChatsArchived));
                        }
                        layoutParams3.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams3.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams3.rightMargin = 0;
                        anonymousClass2.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        anonymousClass2.setTypeface(Typeface.DEFAULT);
                        textView.setVisibility(8);
                        rLottieImageView.setVisibility(0);
                        rLottieImageView.setAnimation(R.raw.chats_archived, 36, 36);
                        rLottieImageView.setProgress(0.0f);
                        rLottieImageView.playAnimation();
                    } else if (i == 82) {
                        layoutParams3.leftMargin = AndroidUtilities.dp(58.0f);
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        if (photoEntry.isVideo) {
                            textView = textView3;
                            i3 = R.string.AttachMediaVideoDeselected;
                        } else {
                            textView = textView3;
                            i3 = R.string.AttachMediaPhotoDeselected;
                        }
                        anonymousClass2.setText(LocaleController.getString(i3));
                        linearLayout.setVisibility(0);
                        anonymousClass2.setTextSize(1, 15.0f);
                        anonymousClass2.setTypeface(Typeface.DEFAULT);
                        textView.setVisibility(8);
                        backupImageView.setVisibility(0);
                        backupImageView.setRoundRadius(AndroidUtilities.dp(2.0f));
                        String str5 = photoEntry.thumbPath;
                        if (str5 != null) {
                            backupImageView.setImage(str5, null, Theme.chat_attachEmptyDrawable);
                        } else if (photoEntry.path != null) {
                            backupImageView.setOrientation(photoEntry.orientation, photoEntry.invert, true);
                            if (photoEntry.isVideo) {
                                backupImageView.setImage("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
                            } else {
                                backupImageView.setImage("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, Theme.chat_attachEmptyDrawable);
                            }
                        } else {
                            backupImageView.setImageDrawable(Theme.chat_attachEmptyDrawable);
                        }
                    } else {
                        layoutParams3.leftMargin = AndroidUtilities.dp(45.0f);
                        layoutParams3.topMargin = AndroidUtilities.dp(13.0f);
                        layoutParams3.rightMargin = 0;
                        anonymousClass2.setTextSize(1, 15.0f);
                        linearLayout.setVisibility(0);
                        Typeface typeface = Typeface.DEFAULT;
                        anonymousClass2.setTypeface(typeface);
                        textView.setVisibility(8);
                        rLottieImageView.setVisibility(8);
                        int i21 = this.currentAction;
                        if (i21 == 88) {
                            String str6 = (String) obj;
                            int iIntValue3 = ((Integer) obj2).intValue();
                            if (iIntValue3 > 0) {
                                textView = textView3;
                                int iDp6 = AndroidUtilities.dp(26.0f) + ((int) Math.ceil(textView2.getPaint().measureText(textView2.getText().toString())));
                                layoutParams3.leftMargin = AndroidUtilities.dp(48.0f);
                                layoutParams3.rightMargin = iDp6;
                                layoutParams3.topMargin = AndroidUtilities.dp(6.0f);
                                FrameLayout.LayoutParams layoutParams9 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                                layoutParams9.leftMargin = AndroidUtilities.dp(48.0f);
                                layoutParams9.rightMargin = iDp6;
                                anonymousClass2.setText(LocaleController.formatString("FolderLinkDeletedTitle", R.string.FolderLinkDeletedTitle, str6));
                                anonymousClass2.setTypeface(AndroidUtilities.bold());
                                textView.setVisibility(0);
                                textView.setText(LocaleController.formatPluralString("FolderLinkDeletedSubtitle", iIntValue3, new Object[0]));
                            } else {
                                anonymousClass2.setTypeface(typeface);
                                int i22 = R.string.FolderLinkDeleted;
                                if (str6 == null) {
                                    textView = textView3;
                                    str6 = str;
                                }
                                textView = textView3;
                                anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FolderLinkDeleted", i22, str6.replace('*', (char) 10033))));
                            }
                        } else if (i21 == 81 || i21 == 0 || i21 == 26) {
                            textView = textView3;
                            anonymousClass2.setText(LocaleController.getString(R.string.HistoryClearedUndo));
                        } else if (i21 == 27) {
                            anonymousClass2.setText(LocaleController.getString(R.string.ChatsDeletedUndo));
                        } else if (i21 == 95) {
                            if (DialogObject.isChatDialog(jLongValue)) {
                                TLRPC.Chat chat6 = MessagesController.getInstance(i13).getChat(Long.valueOf(-jLongValue));
                                if (ChatObject.isMonoForum(chat6)) {
                                    anonymousClass2.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                                } else if (ChatObject.isChannel(chat6) && !chat6.megagroup) {
                                    anonymousClass2.setText(LocaleController.getString(R.string.ChannelLeftUndo));
                                } else {
                                    anonymousClass2.setText(LocaleController.getString(R.string.GroupLeftUndo));
                                }
                            } else {
                                anonymousClass2.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                            }
                        } else if (DialogObject.isChatDialog(jLongValue)) {
                            TLRPC.Chat chat7 = MessagesController.getInstance(i13).getChat(Long.valueOf(-jLongValue));
                            if (ChatObject.isMonoForum(chat7)) {
                                anonymousClass2.setText(LocaleController.getString(R.string.MonoforumDeletedUndo));
                            } else if (ChatObject.isChannel(chat7) && !chat7.megagroup) {
                                anonymousClass2.setText(LocaleController.getString(R.string.ChannelDeletedUndo));
                            } else {
                                anonymousClass2.setText(LocaleController.getString(R.string.GroupDeletedUndo));
                            }
                        } else {
                            anonymousClass2.setText(LocaleController.getString(R.string.ChatDeletedUndo));
                        }
                        if (this.currentAction != 81) {
                            for (int i23 = 0; i23 < arrayList.size(); i23++) {
                                MessagesController messagesController = MessagesController.getInstance(i13);
                                long jLongValue2 = ((Long) arrayList.get(i23)).longValue();
                                int i24 = this.currentAction;
                                messagesController.addDialogAction(jLongValue2, i24 == 0 || i24 == 26);
                            }
                        }
                    }
                }
                imageView.setVisibility(8);
                rLottieImageView.setVisibility(0);
                anonymousClass2.setTypeface(Typeface.DEFAULT);
                int i25 = this.currentAction;
                long j2 = -1;
                if (i25 == 76) {
                    anonymousClass2.setText(LocaleController.getString(R.string.BroadcastGroupConvertSuccess));
                    rLottieImageView.setAnimation(R.raw.gigagroup_convert, 36, 36);
                    layoutParams3.topMargin = AndroidUtilities.dp(9.0f);
                    anonymousClass2.setTextSize(1, 14.0f);
                } else if (i25 == 75) {
                    anonymousClass2.setText(LocaleController.getString(R.string.GigagroupConvertCancelHint));
                    rLottieImageView.setAnimation(R.raw.chats_infotip, 36, 36);
                    layoutParams3.topMargin = AndroidUtilities.dp(9.0f);
                    anonymousClass2.setTextSize(1, 14.0f);
                } else if (i == 70) {
                    int iIntValue4 = ((Integer) obj2).intValue();
                    textView.setSingleLine(false);
                    anonymousClass2.setText(LocaleController.formatString("AutoDeleteHintOnText", R.string.AutoDeleteHintOnText, LocaleController.formatTTLString(iIntValue4)));
                    rLottieImageView.setAnimation(R.raw.fire_on, 36, 36);
                    layoutParams3.topMargin = AndroidUtilities.dp(9.0f);
                    this.timeLeft = 4000L;
                    rLottieImageView.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
                } else {
                    if (i25 == 71) {
                        anonymousClass2.setText(LocaleController.getString(R.string.AutoDeleteHintOffText));
                        rLottieImageView.setAnimation(R.raw.fire_off, 36, 36);
                        anonymousClass2.setTextSize(1, 14.0f);
                        this.timeLeft = 3000L;
                        rLottieImageView.setPadding(0, 0, 0, AndroidUtilities.dp(4.0f));
                    } else {
                        if (i25 == 45) {
                            anonymousClass2.setText(LocaleController.getString(R.string.ImportMutualError));
                            rLottieImageView.setAnimation(R.raw.error, 36, 36);
                            layoutParams3.topMargin = AndroidUtilities.dp(9.0f);
                            z = true;
                            anonymousClass2.setTextSize(1, 14.0f);
                            layoutParams = layoutParams3;
                            j = -1;
                            i2 = 8;
                        } else if (i25 == 46) {
                            anonymousClass2.setText(LocaleController.getString(R.string.ImportNotAdmin));
                            rLottieImageView.setAnimation(R.raw.error, 36, 36);
                            layoutParams3.topMargin = AndroidUtilities.dp(9.0f);
                            anonymousClass2.setTextSize(1, 14.0f);
                        } else if (i25 == 47) {
                            anonymousClass2.setText(LocaleController.getString(R.string.ImportedInfo));
                            rLottieImageView.setAnimation(R.raw.imported, 36, 36);
                            rLottieImageView.setPadding(0, 0, 0, AndroidUtilities.dp(5.0f));
                            layoutParams3.topMargin = AndroidUtilities.dp(9.0f);
                            anonymousClass2.setTextSize(1, 14.0f);
                        } else {
                            if (i25 == 52 || i25 == 56 || i25 == 57 || i25 == 58 || i25 == 59 || i25 == 60 || i25 == 80) {
                                layoutParams = layoutParams3;
                                if (!AndroidUtilities.shouldShowClipboardToast()) {
                                    return;
                                }
                                int i26 = R.raw.copy;
                                int i27 = this.currentAction;
                                if (i27 == 80) {
                                    anonymousClass2.setText(LocaleController.getString(R.string.EmailCopied));
                                } else if (i27 == 60) {
                                    anonymousClass2.setText(LocaleController.getString(R.string.PhoneCopied));
                                } else if (i27 == 56) {
                                    anonymousClass2.setText(LocaleController.getString(R.string.UsernameCopied));
                                } else if (i27 == 57) {
                                    anonymousClass2.setText(LocaleController.getString(R.string.HashtagCopied));
                                } else if (i27 == 52) {
                                    anonymousClass2.setText(LocaleController.getString(R.string.MessageCopied));
                                } else if (i27 == 59) {
                                    i26 = R.raw.voip_invite;
                                    anonymousClass2.setText(LocaleController.getString(R.string.LinkCopied));
                                } else {
                                    anonymousClass2.setText(LocaleController.getString(R.string.TextCopied));
                                }
                                rLottieImageView.setAnimation(i26, 30, 30);
                                this.timeLeft = 3000L;
                                anonymousClass2.setTextSize(1, 15.0f);
                            } else if (i25 == 54) {
                                anonymousClass2.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOn));
                                rLottieImageView.setAnimation(R.raw.silent_unmute, 30, 30);
                                this.timeLeft = 3000L;
                                anonymousClass2.setTextSize(1, 15.0f);
                            } else {
                                layoutParams = layoutParams3;
                                if (i25 == 55) {
                                    anonymousClass2.setText(LocaleController.getString(R.string.ChannelNotifyMembersInfoOff));
                                    rLottieImageView.setAnimation(R.raw.silent_mute, 30, 30);
                                    this.timeLeft = 3000L;
                                    anonymousClass2.setTextSize(1, 15.0f);
                                } else if (i25 == 41) {
                                    if (obj2 != null) {
                                        anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                    } else if (jLongValue == UserConfig.getInstance(i13).clientUserId) {
                                        anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages)));
                                    } else if (DialogObject.isChatDialog(jLongValue)) {
                                        anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(i13).getChat(Long.valueOf(-jLongValue)).title)));
                                    } else {
                                        anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(i13).getUser(l)))));
                                    }
                                    rLottieImageView.setAnimation(R.raw.contact_check, 36, 36);
                                    this.timeLeft = 3000L;
                                } else if (i25 == 53) {
                                    Integer num = (Integer) obj;
                                    if (obj2 != null && !(obj2 instanceof TLRPC.TL_forumTopic)) {
                                        int iIntValue5 = ((Integer) obj2).intValue();
                                        if (num.intValue() == 1) {
                                            anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", iIntValue5, new Object[0])));
                                        } else {
                                            anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", iIntValue5, new Object[0])));
                                        }
                                        rLottieImageView.setAnimation(R.raw.forward, 30, 30);
                                    } else {
                                        if (jLongValue == UserConfig.getInstance(i13).clientUserId) {
                                            if (num.intValue() == 1) {
                                                anonymousClass2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), new QrActivity$5$$ExternalSyntheticLambda1(9)));
                                            } else {
                                                anonymousClass2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), new QrActivity$5$$ExternalSyntheticLambda1(9)));
                                            }
                                            rLottieImageView.setAnimation(R.raw.saved_messages, 30, 30);
                                        } else {
                                            if (DialogObject.isChatDialog(jLongValue)) {
                                                TLRPC.Chat chat8 = MessagesController.getInstance(i13).getChat(Long.valueOf(-jLongValue));
                                                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                                                String monoForumTitle = ChatObject.isMonoForum(chat8) ? ForumUtilities.getMonoForumTitle(chat8, i13, false) : null;
                                                if (num.intValue() == 1) {
                                                    int i28 = R.string.FwdMessageToGroup;
                                                    if (monoForumTitle == null) {
                                                        monoForumTitle = tL_forumTopic != null ? tL_forumTopic.title : chat8.title;
                                                    }
                                                    anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToGroup", i28, monoForumTitle)));
                                                } else {
                                                    int i29 = R.string.FwdMessagesToGroup;
                                                    if (monoForumTitle == null) {
                                                        monoForumTitle = tL_forumTopic != null ? tL_forumTopic.title : chat8.title;
                                                    }
                                                    anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToGroup", i29, monoForumTitle)));
                                                }
                                            } else {
                                                TLRPC.User user7 = MessagesController.getInstance(i13).getUser(l);
                                                if (num.intValue() == 1) {
                                                    anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessageToUser", R.string.FwdMessageToUser, UserObject.getFirstName(user7))));
                                                } else {
                                                    anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("FwdMessagesToUser", R.string.FwdMessagesToUser, UserObject.getFirstName(user7))));
                                                }
                                            }
                                            rLottieImageView.setAnimation(R.raw.forward, 30, 30);
                                        }
                                        this.timeLeft = 3000L;
                                    }
                                    j2 = 300;
                                    this.timeLeft = 3000L;
                                } else if (i25 == 61) {
                                    if (obj2 != null) {
                                        anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToChats", R.string.BackgroundToChats, LocaleController.formatPluralString("Chats", ((Integer) obj2).intValue(), new Object[0]))));
                                        rLottieImageView.setAnimation(R.raw.forward, 30, 30);
                                    } else if (jLongValue == UserConfig.getInstance(i13).clientUserId) {
                                        anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BackgroundToSavedMessages)));
                                        rLottieImageView.setAnimation(R.raw.saved_messages, 30, 30);
                                    } else {
                                        if (DialogObject.isChatDialog(jLongValue)) {
                                            anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToGroup", R.string.BackgroundToGroup, MessagesController.getInstance(i13).getChat(Long.valueOf(-jLongValue)).title)));
                                        } else {
                                            anonymousClass2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("BackgroundToUser", R.string.BackgroundToUser, UserObject.getFirstName(MessagesController.getInstance(i13).getUser(l)))));
                                        }
                                        rLottieImageView.setAnimation(R.raw.forward, 30, 30);
                                    }
                                    this.timeLeft = 3000L;
                                }
                            }
                            j = j2;
                            i2 = 8;
                            z = false;
                        }
                        textView.setVisibility(i2);
                        textView2.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                        linearLayout.setVisibility(i2);
                        FrameLayout.LayoutParams layoutParams10 = layoutParams;
                        layoutParams10.leftMargin = AndroidUtilities.dp(58.0f);
                        layoutParams10.rightMargin = AndroidUtilities.dp(8.0f);
                        rLottieImageView.setProgress(0.0f);
                        rLottieImageView.playAnimation();
                        if (j > 0) {
                            rLottieImageView.postDelayed(new Tooltip$$ExternalSyntheticLambda0(this, i2), j);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append((Object) anonymousClass2.getText());
                        if (textView.getVisibility() == 0) {
                            str2 = ". " + ((Object) textView.getText());
                        } else {
                            str2 = str;
                        }
                        sb.append(str2);
                        AndroidUtilities.makeAccessibilityAnnouncement(sb.toString());
                        if (isMultilineSubInfo()) {
                            measuredWidth2 = ((ViewGroup) getParent()).getMeasuredWidth();
                            if (measuredWidth2 == 0) {
                                measuredWidth2 = AndroidUtilities.displaySize.x;
                            }
                            View view = textView;
                            measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(measuredWidth2 - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                            this.undoViewHeight = AndroidUtilities.dp(37.0f) + view.getMeasuredHeight();
                        } else if (hasSubInfo()) {
                            this.undoViewHeight = AndroidUtilities.dp(52.0f);
                        } else if (getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup = (ViewGroup) getParent();
                            measuredWidth = (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
                            if (measuredWidth <= 0) {
                                measuredWidth = AndroidUtilities.displaySize.x;
                            }
                            measureChildWithMargins(this.infoTextView, View.MeasureSpec.makeMeasureSpec(measuredWidth - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                            int measuredHeight = anonymousClass2.getMeasuredHeight();
                            i4 = this.currentAction;
                            if (i4 != 16 || i4 == 17 || i4 == 18 || i4 == 84 || i4 == 86) {
                                f = 14.0f;
                            } else {
                                f = 28.0f;
                            }
                            iDp2 = AndroidUtilities.dp(f) + measuredHeight;
                            this.undoViewHeight = iDp2;
                            i5 = this.currentAction;
                            if (i5 == 18) {
                                this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(52.0f));
                            } else if (i5 == 25) {
                                this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(50.0f));
                            } else if (z) {
                                this.undoViewHeight = iDp2 - AndroidUtilities.dp(8.0f);
                            }
                        }
                        if (getVisibility() != 0) {
                            setVisibility(0);
                            if (this.fromTop) {
                                f2 = -1.0f;
                            } else {
                                f2 = 1.0f;
                            }
                            setEnterOffset(f2 * (this.enterOffsetMargin + this.undoViewHeight));
                            AnimatorSet animatorSet = new AnimatorSet();
                            z2 = this.fromTop;
                            if (z2) {
                                f3 = -1.0f;
                            } else {
                                f3 = 1.0f;
                            }
                            animatorSet.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f3 * (this.enterOffsetMargin + this.undoViewHeight), z2 ? 1.0f : -1.0f));
                            animatorSet.setInterpolator(new DecelerateInterpolator());
                            animatorSet.setDuration(180L);
                            animatorSet.start();
                        }
                    }
                    layoutParams = layoutParams3;
                    j = j2;
                    i2 = 8;
                    z = false;
                    textView.setVisibility(i2);
                    textView2.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                    linearLayout.setVisibility(i2);
                    FrameLayout.LayoutParams layoutParams11 = layoutParams;
                    layoutParams11.leftMargin = AndroidUtilities.dp(58.0f);
                    layoutParams11.rightMargin = AndroidUtilities.dp(8.0f);
                    rLottieImageView.setProgress(0.0f);
                    rLottieImageView.playAnimation();
                    if (j > 0) {
                        rLottieImageView.postDelayed(new Tooltip$$ExternalSyntheticLambda0(this, i2), j);
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((Object) anonymousClass2.getText());
                    if (textView.getVisibility() == 0) {
                        str2 = ". " + ((Object) textView.getText());
                    } else {
                        str2 = str;
                    }
                    sb2.append(str2);
                    AndroidUtilities.makeAccessibilityAnnouncement(sb2.toString());
                    if (isMultilineSubInfo()) {
                        measuredWidth2 = ((ViewGroup) getParent()).getMeasuredWidth();
                        if (measuredWidth2 == 0) {
                            measuredWidth2 = AndroidUtilities.displaySize.x;
                        }
                        View view2 = textView;
                        measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(measuredWidth2 - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        this.undoViewHeight = AndroidUtilities.dp(37.0f) + view2.getMeasuredHeight();
                    } else if (hasSubInfo()) {
                        this.undoViewHeight = AndroidUtilities.dp(52.0f);
                    } else if (getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) getParent();
                        measuredWidth = (viewGroup2.getMeasuredWidth() - viewGroup2.getPaddingLeft()) - viewGroup2.getPaddingRight();
                        if (measuredWidth <= 0) {
                            measuredWidth = AndroidUtilities.displaySize.x;
                        }
                        measureChildWithMargins(this.infoTextView, View.MeasureSpec.makeMeasureSpec(measuredWidth - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                        int measuredHeight2 = anonymousClass2.getMeasuredHeight();
                        i4 = this.currentAction;
                        if (i4 != 16) {
                            f = 14.0f;
                        } else {
                            f = 14.0f;
                        }
                        iDp2 = AndroidUtilities.dp(f) + measuredHeight2;
                        this.undoViewHeight = iDp2;
                        i5 = this.currentAction;
                        if (i5 == 18) {
                            this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(52.0f));
                        } else if (i5 == 25) {
                            this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(50.0f));
                        } else if (z) {
                            this.undoViewHeight = iDp2 - AndroidUtilities.dp(8.0f);
                        }
                    }
                    if (getVisibility() != 0) {
                        setVisibility(0);
                        if (this.fromTop) {
                            f2 = -1.0f;
                        } else {
                            f2 = 1.0f;
                        }
                        setEnterOffset(f2 * (this.enterOffsetMargin + this.undoViewHeight));
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        z2 = this.fromTop;
                        if (z2) {
                            f3 = -1.0f;
                        } else {
                            f3 = 1.0f;
                        }
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f3 * (this.enterOffsetMargin + this.undoViewHeight), z2 ? 1.0f : -1.0f));
                        animatorSet2.setInterpolator(new DecelerateInterpolator());
                        animatorSet2.setDuration(180L);
                        animatorSet2.start();
                    }
                }
                layoutParams = layoutParams3;
                j = -1;
                i2 = 8;
                z = true;
                textView.setVisibility(i2);
                textView2.setTextColor(getThemedColor(Theme.key_undo_cancelColor));
                linearLayout.setVisibility(i2);
                FrameLayout.LayoutParams layoutParams12 = layoutParams;
                layoutParams12.leftMargin = AndroidUtilities.dp(58.0f);
                layoutParams12.rightMargin = AndroidUtilities.dp(8.0f);
                rLottieImageView.setProgress(0.0f);
                rLottieImageView.playAnimation();
                if (j > 0) {
                    rLottieImageView.postDelayed(new Tooltip$$ExternalSyntheticLambda0(this, i2), j);
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append((Object) anonymousClass2.getText());
                if (textView.getVisibility() == 0) {
                    str2 = ". " + ((Object) textView.getText());
                } else {
                    str2 = str;
                }
                sb3.append(str2);
                AndroidUtilities.makeAccessibilityAnnouncement(sb3.toString());
                if (isMultilineSubInfo()) {
                    measuredWidth2 = ((ViewGroup) getParent()).getMeasuredWidth();
                    if (measuredWidth2 == 0) {
                        measuredWidth2 = AndroidUtilities.displaySize.x;
                    }
                    View view3 = textView;
                    measureChildWithMargins(view3, View.MeasureSpec.makeMeasureSpec(measuredWidth2 - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                    this.undoViewHeight = AndroidUtilities.dp(37.0f) + view3.getMeasuredHeight();
                } else if (hasSubInfo()) {
                    this.undoViewHeight = AndroidUtilities.dp(52.0f);
                } else if (getParent() instanceof ViewGroup) {
                    ViewGroup viewGroup3 = (ViewGroup) getParent();
                    measuredWidth = (viewGroup3.getMeasuredWidth() - viewGroup3.getPaddingLeft()) - viewGroup3.getPaddingRight();
                    if (measuredWidth <= 0) {
                        measuredWidth = AndroidUtilities.displaySize.x;
                    }
                    measureChildWithMargins(this.infoTextView, View.MeasureSpec.makeMeasureSpec(measuredWidth - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                    int measuredHeight3 = anonymousClass2.getMeasuredHeight();
                    i4 = this.currentAction;
                    if (i4 != 16) {
                        f = 14.0f;
                    } else {
                        f = 14.0f;
                    }
                    iDp2 = AndroidUtilities.dp(f) + measuredHeight3;
                    this.undoViewHeight = iDp2;
                    i5 = this.currentAction;
                    if (i5 == 18) {
                        this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(52.0f));
                    } else if (i5 == 25) {
                        this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(50.0f));
                    } else if (z) {
                        this.undoViewHeight = iDp2 - AndroidUtilities.dp(8.0f);
                    }
                }
                if (getVisibility() != 0) {
                    setVisibility(0);
                    if (this.fromTop) {
                        f2 = -1.0f;
                    } else {
                        f2 = 1.0f;
                    }
                    setEnterOffset(f2 * (this.enterOffsetMargin + this.undoViewHeight));
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    z2 = this.fromTop;
                    if (z2) {
                        f3 = -1.0f;
                    } else {
                        f3 = 1.0f;
                    }
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f3 * (this.enterOffsetMargin + this.undoViewHeight), z2 ? 1.0f : -1.0f));
                    animatorSet3.setInterpolator(new DecelerateInterpolator());
                    animatorSet3.setDuration(180L);
                    animatorSet3.start();
                }
            }
            z = false;
            StringBuilder sb4 = new StringBuilder();
            sb4.append((Object) anonymousClass2.getText());
            if (textView.getVisibility() == 0) {
                str2 = ". " + ((Object) textView.getText());
            } else {
                str2 = str;
            }
            sb4.append(str2);
            AndroidUtilities.makeAccessibilityAnnouncement(sb4.toString());
            if (isMultilineSubInfo()) {
                measuredWidth2 = ((ViewGroup) getParent()).getMeasuredWidth();
                if (measuredWidth2 == 0) {
                    measuredWidth2 = AndroidUtilities.displaySize.x;
                }
                View view4 = textView;
                measureChildWithMargins(view4, View.MeasureSpec.makeMeasureSpec(measuredWidth2 - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                this.undoViewHeight = AndroidUtilities.dp(37.0f) + view4.getMeasuredHeight();
            } else if (hasSubInfo()) {
                this.undoViewHeight = AndroidUtilities.dp(52.0f);
            } else if (getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) getParent();
                measuredWidth = (viewGroup4.getMeasuredWidth() - viewGroup4.getPaddingLeft()) - viewGroup4.getPaddingRight();
                if (measuredWidth <= 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                measureChildWithMargins(this.infoTextView, View.MeasureSpec.makeMeasureSpec(measuredWidth - AndroidUtilities.dp(16.0f), 1073741824), 0, View.MeasureSpec.makeMeasureSpec(0, 0), 0);
                int measuredHeight4 = anonymousClass2.getMeasuredHeight();
                i4 = this.currentAction;
                if (i4 != 16) {
                    f = 14.0f;
                } else {
                    f = 14.0f;
                }
                iDp2 = AndroidUtilities.dp(f) + measuredHeight4;
                this.undoViewHeight = iDp2;
                i5 = this.currentAction;
                if (i5 == 18) {
                    this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(52.0f));
                } else if (i5 == 25) {
                    this.undoViewHeight = Math.max(iDp2, AndroidUtilities.dp(50.0f));
                } else if (z) {
                    this.undoViewHeight = iDp2 - AndroidUtilities.dp(8.0f);
                }
            }
            if (getVisibility() != 0) {
                setVisibility(0);
                if (this.fromTop) {
                    f2 = -1.0f;
                } else {
                    f2 = 1.0f;
                }
                setEnterOffset(f2 * (this.enterOffsetMargin + this.undoViewHeight));
                AnimatorSet animatorSet4 = new AnimatorSet();
                z2 = this.fromTop;
                if (z2) {
                    f3 = -1.0f;
                } else {
                    f3 = 1.0f;
                }
                animatorSet4.playTogether(ObjectAnimator.ofFloat(this, "enterOffset", f3 * (this.enterOffsetMargin + this.undoViewHeight), z2 ? 1.0f : -1.0f));
                animatorSet4.setInterpolator(new DecelerateInterpolator());
                animatorSet4.setDuration(180L);
                animatorSet4.start();
            }
        }
    }
}

package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.Spannable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.AvatarSpan;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.Switch;

public class TextCheckCell extends FrameLayout {
    public static final ChatActivity.AnonymousClass5 ANIMATION_PROGRESS = new ChatActivity.AnonymousClass5("animationProgress", 2);
    public int animatedColorBackground;
    public Paint animationPaint;
    public float animationProgress;
    public ObjectAnimator animator;
    public boolean attached;
    public final Switch checkBox;
    public boolean drawCheckRipple;
    public int height;
    public RLottieImageView imageView;
    public boolean isAnimatingToThumbInsteadOfTouch;
    public boolean isMultiline;
    public boolean isRTL;
    public int itemId;
    public float lastTouchX;
    public boolean needDivider;
    public int padding;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView textView;
    public final TextView valueTextView;

    public final class AnonymousClass2 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final TextCheckCell this$0;
        public final int val$color;

        public AnonymousClass2(TextCheckCell textCheckCell, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = textCheckCell;
            this.val$color = i;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    TextCheckCell textCheckCell = this.this$0;
                    textCheckCell.animatedColorBackground = 0;
                    textCheckCell.setBackgroundColor(this.val$color);
                    textCheckCell.invalidate();
                    break;
                default:
                    int i = this.val$color;
                    TextCheckCell textCheckCell2 = this.this$0;
                    textCheckCell2.setBackgroundColor(i);
                    textCheckCell2.animatedColorBackground = 0;
                    textCheckCell2.invalidate();
                    break;
            }
        }
    }

    public TextCheckCell(Context context) {
        this(21, context, null, false);
    }

    private float getLastTouchX() {
        if (this.isAnimatingToThumbInsteadOfTouch) {
            return LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : getMeasuredWidth() - AndroidUtilities.dp(42.0f);
        }
        return this.lastTouchX;
    }

    public void setAnimationProgress(float f) {
        this.animationProgress = f;
        float lastTouchX = getLastTouchX();
        float fMax = Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        float f2 = fMax * this.animationProgress;
        Switch r2 = this.checkBox;
        r2.overlayCx = lastTouchX;
        r2.overlayCy = measuredHeight;
        r2.overlayRad = f2;
        r2.invalidate();
    }

    public Switch getCheckBox() {
        return this.checkBox;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.animatedColorBackground != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.animationProgress, this.animationPaint);
        }
        if (this.needDivider) {
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Paint paint = resourcesProvider != null ? resourcesProvider.getPaint("paintDivider") : Theme.dividerPaint;
            if (paint != null) {
                if (this.imageView != null) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : this.padding, getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? this.padding : 0), getMeasuredHeight() - 1, paint);
                } else {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, paint);
                }
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkBox.isChecked);
        StringBuilder sb = new StringBuilder();
        sb.append(this.textView.getText());
        TextView textView = this.valueTextView;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb.append('\n');
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (this.isMultiline) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.valueTextView.getVisibility() == 0 ? 64.0f : this.height) + (this.needDivider ? 1 : 0), 1073741824));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.lastTouchX = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z) {
        this.isAnimatingToThumbInsteadOfTouch = z;
    }

    @Override
    public void setBackgroundColor(int i) {
        if (this.animatedColorBackground != i) {
            clearAnimation();
            this.animatedColorBackground = 0;
            super.setBackgroundColor(i);
        }
    }

    public final void setBackgroundColorAnimated(int i, boolean z) {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.animator = null;
        }
        int i2 = this.animatedColorBackground;
        if (i2 != 0) {
            setBackgroundColor(i2);
        }
        if (this.animationPaint == null) {
            this.animationPaint = new Paint(1);
        }
        this.checkBox.setOverrideColor(z ? 1 : 2);
        this.animatedColorBackground = i;
        this.animationPaint.setColor(i);
        this.animationProgress = 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, ANIMATION_PROGRESS, 0.0f, 1.0f);
        this.animator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new AnonymousClass2(this, i, 0));
        this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.animator.setDuration(240L).start();
    }

    public void setBackgroundColorAnimatedReverse(int i) {
        int i2 = 1;
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.animator = null;
        }
        int color = this.animatedColorBackground;
        if (color == 0) {
            color = getBackground() instanceof ColorDrawable ? ((ColorDrawable) getBackground()).getColor() : 0;
        }
        if (this.animationPaint == null) {
            this.animationPaint = new Paint(1);
        }
        this.animationPaint.setColor(color);
        setBackgroundColor(i);
        this.checkBox.setOverrideColor(1);
        this.animatedColorBackground = i;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, ANIMATION_PROGRESS, 1.0f, 0.0f).setDuration(240L);
        this.animator = duration;
        duration.addListener(new AnonymousClass2(this, i, i2));
        this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.animator.start();
    }

    public void setCheckBoxIcon(int i) {
        this.checkBox.setIcon(i);
    }

    public void setChecked(boolean z) {
        Switch r0 = this.checkBox;
        r0.setChecked(r0.drawIconType, z, true);
    }

    public final void setColorfullIcon(int i, int i2) {
        if (this.imageView == null) {
            RLottieImageView rLottieImageView = new RLottieImageView(getContext());
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.imageView, LayoutHelper.createFrame(29, 29.0f, (LocaleController.isRTL ? 5 : 3) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.padding = AndroidUtilities.dp(65.0f);
            TextView textView = this.textView;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = LocaleController.isRTL ? 70 : this.padding;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = LocaleController.isRTL ? this.padding : 70;
        }
        this.imageView.setVisibility(0);
        this.imageView.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.imageView.setImageResource(i2);
        this.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), i));
    }

    public final void setColors(int i, int i2, int i3, int i4, int i5) {
        TextView textView = this.textView;
        textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
        Switch r1 = this.checkBox;
        r1.trackColorKey = i2;
        r1.trackCheckedColorKey = i3;
        r1.thumbColorKey = i4;
        r1.thumbCheckedColorKey = i5;
        textView.setTag(Integer.valueOf(i));
    }

    public void setDivider(boolean z) {
        this.needDivider = z;
        setWillNotDraw(!z);
    }

    public void setDrawCheckRipple(boolean z) {
        this.drawCheckRipple = z;
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.checkBox.setEnabled(z);
    }

    public void setHeight(int i) {
        this.height = i;
    }

    @Override
    public void setPressed(boolean z) {
        if (this.drawCheckRipple) {
            this.checkBox.setDrawRipple(z);
        }
        super.setPressed(z);
    }

    public final void setTextAndCheck(CharSequence charSequence, boolean z, boolean z2) {
        int i = AvatarSpan.$r8$clinit;
        if (charSequence != null && (charSequence instanceof Spannable)) {
            Spannable spannable = (Spannable) charSequence;
            for (AvatarSpan avatarSpan : (AvatarSpan[]) spannable.getSpans(0, spannable.length(), AvatarSpan.class)) {
                avatarSpan.setParent(this);
            }
        }
        TextView textView = this.textView;
        textView.setText(charSequence);
        this.isMultiline = false;
        Switch r6 = this.checkBox;
        r6.setVisibility(0);
        r6.setChecked(r6.drawIconType, z, this.attached);
        this.needDivider = z2;
        this.valueTextView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z2);
    }

    public final void setTextAndValueAndCheck(String str, String str2, boolean z, boolean z2, boolean z3) {
        int i = AvatarSpan.$r8$clinit;
        if (str != 0 && (str instanceof Spannable)) {
            Spannable spannable = (Spannable) str;
            for (AvatarSpan avatarSpan : (AvatarSpan[]) spannable.getSpans(0, spannable.length(), AvatarSpan.class)) {
                avatarSpan.setParent(this);
            }
        }
        TextView textView = this.textView;
        textView.setText(str);
        TextView textView2 = this.valueTextView;
        textView2.setText(str2);
        Switch r8 = this.checkBox;
        r8.setVisibility(0);
        r8.setChecked(r8.drawIconType, z, false);
        this.needDivider = z3;
        textView2.setVisibility(0);
        this.isMultiline = z2;
        if (z2) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, AndroidUtilities.dp(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z3);
    }

    public void setTypeface(Typeface typeface) {
        this.textView.setTypeface(typeface);
    }

    public TextCheckCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        this(21, context, resourcesProvider, false);
    }

    public TextCheckCell(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(context);
        this.height = 50;
        this.resourcesProvider = resourcesProvider;
        this.padding = i;
        TextView textView = new TextView(context);
        this.textView = textView;
        OKLCH.m(z ? Theme.key_dialogTextBlack : Theme.key_windowBackgroundWhiteBlackText, resourcesProvider, textView, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z2 = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 70.0f : i, 0.0f, z2 ? i : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        OKLCH.m(z ? Theme.key_dialogIcon : Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider, textView2, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z3 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z3 ? 5 : 3) | 48, z3 ? 70.0f : i, 35.0f, z3 ? i : 70.0f, 0.0f));
        Switch r1 = new Switch(context, resourcesProvider);
        this.checkBox = r1;
        int i2 = Theme.key_switchTrack;
        int i3 = Theme.key_switchTrackChecked;
        int i4 = Theme.key_windowBackgroundWhite;
        r1.trackColorKey = i2;
        r1.trackCheckedColorKey = i3;
        r1.thumbColorKey = i4;
        r1.thumbCheckedColorKey = i4;
        addView(r1, LayoutHelper.createFrame(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.isRTL = LocaleController.isRTL;
    }

    public final void setEnabled(ArrayList arrayList, boolean z) {
        super.setEnabled(z);
        Switch r2 = this.checkBox;
        TextView textView = this.textView;
        TextView textView2 = this.valueTextView;
        if (arrayList != null) {
            float[] fArr = {z ? 1.0f : 0.5f};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr));
            arrayList.add(ObjectAnimator.ofFloat(r2, (Property<Switch, Float>) property, z ? 1.0f : 0.5f));
            if (textView2.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, z ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z ? 1.0f : 0.5f);
        r2.setAlpha(z ? 1.0f : 0.5f);
        if (textView2.getVisibility() == 0) {
            textView2.setAlpha(z ? 1.0f : 0.5f);
        }
    }
}

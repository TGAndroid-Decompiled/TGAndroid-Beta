package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.web.AddressBarList;

public final class TextCheckCell2 extends FrameLayout {
    public AnimatedTextView animatedTextView;
    public final Switch checkBox;
    public AddressBarList.AnonymousClass2 checkBoxClickArea;
    public LinearLayout collapseViewContainer;
    public View collapsedArrow;
    public int id;
    public boolean needDivider;
    public final TextView textView;
    public final TextView valueTextView;

    public TextCheckCell2(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.textView = textView;
        OKLCH.m(Theme.key_windowBackgroundWhiteBlackText, (Theme.ResourcesProvider) null, textView, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-2, -1.0f, (z ? 5 : 3) | 48, z ? 64.0f : 21.0f, 0.0f, z ? 21.0f : 64.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        OKLCH.m(Theme.key_windowBackgroundWhiteGrayText2, (Theme.ResourcesProvider) null, textView2, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z2 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 64.0f : 21.0f, 35.0f, z2 ? 21.0f : 64.0f, 0.0f));
        Switch r2 = new Switch(context);
        this.checkBox = r2;
        r2.setDrawIconType(1);
        addView(r2, LayoutHelper.createFrame(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public Switch getCheckBox() {
        return this.checkBox;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkBox.isChecked());
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.collapseViewContainer;
        if (linearLayout != null) {
            boolean z2 = LocaleController.isRTL;
            TextView textView = this.textView;
            if (z2) {
                linearLayout.setTranslationX((textView.getLeft() - this.collapseViewContainer.getMeasuredWidth()) - AndroidUtilities.dp(8.0f));
            } else {
                linearLayout.setTranslationX(AndroidUtilities.dp(8.0f) + textView.getRight());
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.valueTextView.getVisibility() == 0 ? 64.0f : 50.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z) {
        this.checkBox.setChecked(z, true);
    }

    public final void setCollapseArrow(String str, boolean z, Runnable runnable) {
        if (this.collapseViewContainer == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.collapseViewContainer = linearLayout;
            linearLayout.setOrientation(0);
            AnimatedTextView animatedTextView = new AnimatedTextView(getContext(), false, true, true);
            this.animatedTextView = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            this.animatedTextView.getDrawable().setAllowCancel(true);
            AnimatedTextView animatedTextView2 = this.animatedTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            animatedTextView2.setTextColor(Theme.getColor(null, i, false));
            this.animatedTextView.setTypeface(AndroidUtilities.bold());
            this.animatedTextView.setAnimationProperties(0.4f, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.collapseViewContainer.addView(this.animatedTextView, LayoutHelper.createFrame(-2, 20.0f));
            this.collapsedArrow = new View(getContext());
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.MULTIPLY));
            this.collapsedArrow.setBackground(drawableMutate);
            this.collapseViewContainer.addView(this.collapsedArrow, LayoutHelper.createLinear(16, 16, 16));
            this.collapseViewContainer.setClipChildren(false);
            setClipChildren(false);
            addView(this.collapseViewContainer, LayoutHelper.createFrame(-2, -2, 16));
            AddressBarList.AnonymousClass2 anonymousClass2 = new AddressBarList.AnonymousClass2(getContext(), 5);
            this.checkBoxClickArea = anonymousClass2;
            anonymousClass2.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            addView(this.checkBoxClickArea, LayoutHelper.createFrame(76, -1, LocaleController.isRTL ? 3 : 5));
        }
        this.animatedTextView.setText(str);
        this.collapsedArrow.animate().cancel();
        this.collapsedArrow.animate().rotation(z ? 0.0f : 180.0f).setDuration(340L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        this.checkBoxClickArea.setOnClickListener(new TextCheckCell2$$ExternalSyntheticLambda0(0, runnable));
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        TextView textView = this.textView;
        textView.clearAnimation();
        TextView textView2 = this.valueTextView;
        textView2.clearAnimation();
        Switch r2 = this.checkBox;
        r2.clearAnimation();
        if (z) {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            r2.setAlpha(1.0f);
            AnimatedTextView animatedTextView = this.animatedTextView;
            if (animatedTextView != null) {
                animatedTextView.setAlpha(1.0f);
            }
            View view = this.collapsedArrow;
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        r2.setAlpha(0.5f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        AnimatedTextView animatedTextView2 = this.animatedTextView;
        if (animatedTextView2 != null) {
            animatedTextView2.setAlpha(0.6f);
        }
        View view2 = this.collapsedArrow;
        if (view2 != null) {
            view2.setAlpha(0.6f);
        }
    }

    public void setIcon(int i) {
        this.checkBox.setIcon(i);
    }

    public final void setTextAndCheck(String str, boolean z, boolean z2) {
        setTextAndCheck(str, z, z2, false);
    }

    public final void setTextAndCheck(String str, boolean z, boolean z2, boolean z3) {
        TextView textView = this.textView;
        textView.setText(str);
        this.checkBox.setChecked(z, z3);
        this.needDivider = z2;
        this.valueTextView.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z2);
    }

    public final void setEnabled(boolean z, boolean z2) {
        super.setEnabled(z);
        Switch r0 = this.checkBox;
        TextView textView = this.valueTextView;
        TextView textView2 = this.textView;
        if (z2) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r0.clearAnimation();
            textView2.animate().alpha(z ? 1.0f : 0.5f).start();
            textView.animate().alpha(z ? 1.0f : 0.5f).start();
            r0.animate().alpha(z ? 1.0f : 0.5f).start();
            return;
        }
        if (z) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            r0.setAlpha(1.0f);
        } else {
            r0.setAlpha(0.5f);
            textView2.setAlpha(0.5f);
            textView.setAlpha(0.5f);
        }
    }
}

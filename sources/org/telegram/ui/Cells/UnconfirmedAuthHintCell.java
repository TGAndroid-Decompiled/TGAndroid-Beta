package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CircularProgressDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;

public final class UnconfirmedAuthHintCell extends FrameLayout {
    public static final int $r8$clinit = 0;
    public final LinearLayout linearLayout;
    public final TextView messageTextView;
    public final TextViewWithLoading noButton;
    public final TextView titleTextView;
    public final TextViewWithLoading yesButton;

    public final class TextViewWithLoading extends TextView {
        public boolean loading;
        public final AnimatedFloat loadingT;
        public CircularProgressDrawable progressDrawable;

        public TextViewWithLoading(Context context) {
            super(context);
            this.loadingT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            Canvas canvas2;
            float f = this.loadingT.set(this.loading);
            if (f <= 0.0f) {
                super.onDraw(canvas);
                return;
            }
            if (f < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - f) * 255.0f), 31);
                float f2 = 1.0f - (0.2f * f);
                canvas2.scale(f2, f2, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas2.translate(0.0f, AndroidUtilities.dp(-12.0f) * f);
                super.onDraw(canvas2);
                canvas2.restore();
            } else {
                canvas2 = canvas;
            }
            if (this.progressDrawable == null) {
                CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(2.0f), getCurrentTextColor());
                this.progressDrawable = circularProgressDrawable;
                circularProgressDrawable.setCallback(this);
            }
            this.progressDrawable.setColor(getCurrentTextColor());
            float f3 = 1.0f - f;
            this.progressDrawable.setBounds(getWidth() / 2, (getHeight() / 2) + ((int) (AndroidUtilities.dp(12.0f) * f3)), getWidth() / 2, (getHeight() / 2) + ((int) (f3 * AndroidUtilities.dp(12.0f))));
            this.progressDrawable.setAlpha((int) (f * 255.0f));
            this.progressDrawable.draw(canvas2);
            invalidate();
        }

        public final void setLoading(boolean z, boolean z2) {
            this.loading = z;
            boolean z3 = true;
            if (!z2) {
                this.loadingT.set(z, true);
            }
            if (!isPressed() && !z) {
                z3 = false;
            }
            super.setPressed(z3);
            invalidate();
        }

        @Override
        public final void setPressed(boolean z) {
            super.setPressed(z || this.loading);
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return this.progressDrawable == drawable || super.verifyDrawable(drawable);
        }
    }

    public UnconfirmedAuthHintCell(Context context) {
        super(context);
        setClickable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.titleTextView = textView;
        textView.setGravity(17);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.UnconfirmedAuthTitle));
        TextView textViewM = Theme.ResourcesProvider.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 0.0f, 55, 28, 8, 28, 0), context);
        this.messageTextView = textViewM;
        textViewM.setGravity(17);
        textViewM.setTextSize(1, 13.0f);
        textViewM.setLineSpacing(AndroidUtilities.dpf2(2.0f), 1.0f);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 0.0f, 55, 28, 2, 28, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.addView(new Space(context), LayoutHelper.createLinear(-2, 1, 17.0f, 1));
        TextViewWithLoading textViewWithLoading = new TextViewWithLoading(context);
        this.yesButton = textViewWithLoading;
        textViewWithLoading.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        textViewWithLoading.setTypeface(AndroidUtilities.bold());
        textViewWithLoading.setTextSize(1, 14.22f);
        textViewWithLoading.setText(LocaleController.getString(R.string.UnconfirmedAuthConfirm));
        linearLayout2.addView(textViewWithLoading, LayoutHelper.createLinear(-2, 30));
        linearLayout2.addView(new Space(context), LayoutHelper.createLinear(-2, 1, 17.0f, 1));
        TextViewWithLoading textViewWithLoading2 = new TextViewWithLoading(context);
        this.noButton = textViewWithLoading2;
        textViewWithLoading2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(7.0f));
        textViewWithLoading2.setTypeface(AndroidUtilities.bold());
        textViewWithLoading2.setTextSize(1, 14.22f);
        textViewWithLoading2.setText(LocaleController.getString(R.string.UnconfirmedAuthDeny));
        linearLayout2.addView(textViewWithLoading2, LayoutHelper.createLinear(-2, 30));
        linearLayout2.addView(new Space(context), LayoutHelper.createLinear(-2, 1, 17.0f, 1));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 28.0f, 4.0f, 28.0f, 8.0f));
        addView(linearLayout, LayoutHelper.createFrame(-1, -1, 119));
        updateColors();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size <= 0) {
            size = AndroidUtilities.displaySize.x;
        }
        LinearLayout linearLayout = this.linearLayout;
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec((size - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + linearLayout.getMeasuredHeight() + 1, 1073741824));
    }

    public final void updateColors() {
        this.titleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        this.messageTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
        int i = Theme.key_windowBackgroundWhiteValueText;
        int color = Theme.getColor(null, i, false);
        TextViewWithLoading textViewWithLoading = this.yesButton;
        textViewWithLoading.setTextColor(color);
        textViewWithLoading.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(Theme.currentTheme.isDark() ? 0.3f : 0.15f, Theme.getColor(null, i, false)), 7, AndroidUtilities.dp(8.0f)));
        int i2 = Theme.key_text_RedBold;
        int color2 = Theme.getColor(null, i2, false);
        TextViewWithLoading textViewWithLoading2 = this.noButton;
        textViewWithLoading2.setTextColor(color2);
        textViewWithLoading2.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(Theme.currentTheme.isDark() ? 0.3f : 0.15f, Theme.getColor(null, i2, false)), 7, AndroidUtilities.dp(8.0f)));
    }
}

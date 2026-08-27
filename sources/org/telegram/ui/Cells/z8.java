package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

public final class z8 extends FrameLayout {

    public TextView f26044a;

    public TextView f26045b;

    public RadioButton f26046c;
    public boolean d;

    public int f26047e;

    public float f26048f;
    public float h;

    public boolean f26049n;

    public int f26050r;

    static {
        new dh.g("animationProgress", 4);
    }

    public void setAnimationProgress(float f10) {
        this.f26048f = f10;
        Math.max(this.h, getMeasuredWidth() - this.h);
        AndroidUtilities.dp(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z10) {
        TextView textView = this.f26044a;
        textView.setText(str);
        TextView textView2 = this.f26045b;
        textView2.setText(str2);
        this.f26046c.a(false, false);
        this.d = z10;
        textView2.setVisibility(0);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z10);
    }

    public final void c() {
        RadioButton radioButton = this.f26046c;
        TextView textView = this.f26045b;
        TextView textView2 = this.f26044a;
        int i10 = this.f26050r;
        boolean z10 = this.f26049n;
        boolean z11 = LocaleController.isRTL;
        if (z10 == z11) {
            return;
        }
        this.f26049n = z11;
        textView2.setGravity((z11 ? 5 : 3) | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z12 = LocaleController.isRTL;
        layoutParams.gravity = (z12 ? 5 : 3) | 48;
        layoutParams.leftMargin = AndroidUtilities.dp(z12 ? i10 : 64.0f);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : i10);
        textView2.setLayoutParams(layoutParams);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z13 = LocaleController.isRTL;
        layoutParams2.gravity = (z13 ? 5 : 3) | 48;
        layoutParams2.leftMargin = AndroidUtilities.dp(z13 ? i10 : 64.0f);
        layoutParams2.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 64.0f : i10);
        textView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams3.gravity = (LocaleController.isRTL ? 5 : 3) | 16;
        radioButton.setLayoutParams(layoutParams3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        TextView textView = this.f26045b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.f26046c;
        accessibilityNodeInfo.setChecked(radioButton.f26504f);
        accessibilityNodeInfo.setContentDescription(LocaleController.getString(radioButton.f26504f ? R.string.NotificationsOn : R.string.NotificationsOff));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f26044a.getText());
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f26045b.getVisibility() == 0 ? 64.0f : this.f26047e) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.h = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i10) {
        clearAnimation();
        super.setBackgroundColor(i10);
    }

    public void setChecked(boolean z10) {
        this.f26046c.a(z10, true);
    }

    public void setHeight(int i10) {
        this.f26047e = i10;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f26044a.setTypeface(typeface);
    }
}

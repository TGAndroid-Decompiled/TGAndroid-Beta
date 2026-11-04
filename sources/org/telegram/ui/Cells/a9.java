package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.RadioButton;
public final class a9 extends FrameLayout {
    public TextView f28953a;
    public TextView f28954b;
    public RadioButton f28955c;
    public boolean d;
    public int f28956e;
    public float f28957f;
    public float h;
    public boolean f28958n;
    public int f28959r;

    static {
        new n8("animationProgress", 2);
    }

    public void setAnimationProgress(float f10) {
        this.f28957f = f10;
        Math.max(this.h, getMeasuredWidth() - this.h);
        org.telegram.messenger.g0.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z10) {
        TextView textView = this.f28953a;
        textView.setText(str);
        TextView textView2 = this.f28954b;
        textView2.setText(str2);
        this.f28955c.a(false, false);
        this.d = z10;
        textView2.setVisibility(0);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setPadding(0, 0, 0, 0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.g0.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z10);
    }

    public final void c() {
        int i3;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        RadioButton radioButton = this.f28955c;
        TextView textView = this.f28954b;
        TextView textView2 = this.f28953a;
        int i13 = this.f28959r;
        boolean z10 = this.f28958n;
        boolean z11 = bd.f21784a0;
        if (z10 == z11) {
            return;
        }
        this.f28958n = z11;
        int i14 = 3;
        if (z11) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView2.setGravity(i3 | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z12 = bd.f21784a0;
        if (z12) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        layoutParams.gravity = i10 | 48;
        float f13 = 64.0f;
        if (z12) {
            f10 = i13;
        } else {
            f10 = 64.0f;
        }
        layoutParams.leftMargin = org.telegram.messenger.g0.L(f10);
        if (bd.f21784a0) {
            f11 = 64.0f;
        } else {
            f11 = i13;
        }
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f11);
        textView2.setLayoutParams(layoutParams);
        if (bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z13 = bd.f21784a0;
        if (z13) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        layoutParams2.gravity = i12 | 48;
        if (z13) {
            f12 = i13;
        } else {
            f12 = 64.0f;
        }
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(f12);
        if (!bd.f21784a0) {
            f13 = i13;
        }
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(f13);
        textView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (bd.f21784a0) {
            i14 = 5;
        }
        layoutParams3.gravity = i14 | 16;
        radioButton.setLayoutParams(layoutParams3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        if (this.d) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(64.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i3;
        TextView textView = this.f28954b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.f28955c;
        accessibilityNodeInfo.setChecked(radioButton.f31589f);
        if (radioButton.f31589f) {
            i3 = 2131747900;
        } else {
            i3 = 2131747902;
        }
        accessibilityNodeInfo.setContentDescription(bd.M0(i3, null));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f28953a.getText());
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.f28954b.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = this.f28956e;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.h = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i3) {
        clearAnimation();
        super.setBackgroundColor(i3);
    }

    public void setChecked(boolean z10) {
        this.f28955c.a(z10, true);
    }

    public void setHeight(int i3) {
        this.f28956e = i3;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f28953a.setTypeface(typeface);
    }
}

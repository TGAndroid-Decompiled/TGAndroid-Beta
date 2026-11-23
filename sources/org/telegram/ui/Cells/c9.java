package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.RadioButton;
public final class c9 extends FrameLayout {
    public TextView f30481a;
    public TextView f30482b;
    public RadioButton f30483c;
    public boolean d;
    public int f30484e;
    public float f30485f;
    public float h;
    public boolean f30486n;
    public int f30487r;

    static {
        new p8("animationProgress", 2);
    }

    public void setAnimationProgress(float f10) {
        this.f30485f = f10;
        Math.max(this.h, getMeasuredWidth() - this.h);
        org.telegram.messenger.g0.L(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z10) {
        TextView textView = this.f30481a;
        textView.setText(str);
        TextView textView2 = this.f30482b;
        textView2.setText(str2);
        this.f30483c.a(false, false);
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
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        RadioButton radioButton = this.f30483c;
        TextView textView = this.f30482b;
        TextView textView2 = this.f30481a;
        int i13 = this.f30487r;
        boolean z10 = this.f30486n;
        boolean z11 = hd.f24408a0;
        if (z10 == z11) {
            return;
        }
        this.f30486n = z11;
        int i14 = 3;
        if (z11) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView2.setGravity(i7 | 16);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        boolean z12 = hd.f24408a0;
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
        if (hd.f24408a0) {
            f11 = 64.0f;
        } else {
            f11 = i13;
        }
        layoutParams.rightMargin = org.telegram.messenger.g0.L(f11);
        textView2.setLayoutParams(layoutParams);
        if (hd.f24408a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
        boolean z13 = hd.f24408a0;
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
        if (!hd.f24408a0) {
            f13 = i13;
        }
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(f13);
        textView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        if (hd.f24408a0) {
            i14 = 5;
        }
        layoutParams3.gravity = i14 | 16;
        radioButton.setLayoutParams(layoutParams3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (this.d) {
            if (hd.f24408a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(64.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24408a0) {
                i7 = org.telegram.messenger.g0.L(64.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29470k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i7;
        TextView textView = this.f30482b;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(true);
        RadioButton radioButton = this.f30483c;
        accessibilityNodeInfo.setChecked(radioButton.f33095f);
        if (radioButton.f33095f) {
            i7 = 2131747698;
        } else {
            i7 = 2131747700;
        }
        accessibilityNodeInfo.setContentDescription(hd.N0(i7, null));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30481a.getText());
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f30482b.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = this.f30484e;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.h = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i7) {
        clearAnimation();
        super.setBackgroundColor(i7);
    }

    public void setChecked(boolean z10) {
        this.f30483c.a(z10, true);
    }

    public void setHeight(int i7) {
        this.f30484e = i7;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f30481a.setTypeface(typeface);
    }
}

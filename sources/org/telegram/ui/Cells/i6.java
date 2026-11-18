package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.RadioButton;
public final class i6 extends FrameLayout {
    public final TextView f30822a;
    public final TextView f30823b;
    public final RadioButton f30824c;
    public boolean d;

    public i6(Context context, boolean z10) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RadioButton radioButton = new RadioButton(context);
        this.f30824c = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        if (z10) {
            org.telegram.ui.ActionBar.u6.O(radioButton, org.telegram.ui.ActionBar.n6.D5, org.telegram.ui.ActionBar.n6.E5, null);
        } else {
            org.telegram.ui.ActionBar.u6.O(radioButton, org.telegram.ui.ActionBar.n6.f29450g7, org.telegram.ui.ActionBar.n6.h7, null);
        }
        boolean z11 = gd.f24213a0;
        if (z11) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i16 = i7 | 48;
        if (z11) {
            i10 = 0;
        } else {
            i10 = 20;
        }
        addView(radioButton, c8.ma.d(22, 22.0f, i16, i10, 10.0f, z11 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f30822a = textView;
        if (z10) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29502j5, null);
        } else {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
        }
        n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (gd.f24213a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z12 = gd.f24213a0;
        if (z12) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z12) {
            i13 = 23;
        } else {
            i13 = 61;
        }
        addView(textView, c8.ma.d(-2, -2.0f, i17, i13, 10.0f, z12 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30823b = textView2;
        if (z10) {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29633q5, null);
        } else {
            org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29805z6, null);
        }
        textView2.setTextSize(1, 13.0f);
        if (gd.f24213a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
        boolean z13 = gd.f24213a0;
        int i18 = (z13 ? 5 : 3) | 48;
        if (z13) {
            i15 = 17;
        } else {
            i15 = 61;
        }
        addView(textView2, c8.ma.d(-2, -2.0f, i18, i15, 35.0f, z13 ? 61 : 17, 0.0f));
    }

    public final void a(boolean z10) {
        this.f30824c.a(z10, true);
    }

    public final void b(String str, String str2, boolean z10, boolean z11) {
        this.f30822a.setText(str);
        this.f30823b.setText(str2);
        this.f30824c.a(z11, false);
        this.d = z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.d) {
            float f11 = 60.0f;
            if (gd.f24213a0) {
                f10 = 0.0f;
            } else {
                f10 = 60.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!gd.f24213a0) {
                f11 = 0.0f;
            }
            canvas.drawLine(L, height, measuredWidth - org.telegram.messenger.g0.L(f11), getHeight() - 1, org.telegram.ui.ActionBar.n6.f29517k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f30824c.f33093f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
}

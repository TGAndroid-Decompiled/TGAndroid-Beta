package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.RadioButton;
public final class k6 extends FrameLayout {
    public final TextView f30953a;
    public final TextView f30954b;
    public final RadioButton f30955c;
    public int d;

    public k6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.d = 50;
        RadioButton radioButton = new RadioButton(context);
        this.f30955c = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.t6.O(radioButton, org.telegram.ui.ActionBar.m6.D5, org.telegram.ui.ActionBar.m6.E5, h6Var);
        boolean z10 = gd.f24241a0;
        if (z10) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i17 = i7 | 48;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 18;
        }
        addView(radioButton, c8.ma.d(22, 22.0f, i17, i10, 14.0f, z10 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f30953a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29486j5, h6Var);
        n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (gd.f24241a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z11 = gd.f24241a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i18 = i12 | 48;
        if (z11) {
            i13 = 21;
        } else {
            i13 = 51;
        }
        float f10 = i13;
        if (z11) {
            i14 = 51;
        } else {
            i14 = 21;
        }
        addView(textView, c8.ma.d(-2, -2.0f, i18, f10, 13.0f, i14, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30954b = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29770y6, h6Var);
        textView2.setTextSize(1, 14.0f);
        if (gd.f24241a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15 | 16);
        textView2.setVisibility(8);
        boolean z12 = gd.f24241a0;
        int i19 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i16 = 21;
        } else {
            i16 = 51;
        }
        addView(textView2, c8.ma.d(-2, -2.0f, i19, i16, 37.0f, z12 ? 51 : 21, 0.0f));
    }

    public final void a(int i7, int i10) {
        this.f30955c.b(i7, i10);
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f30953a.setText(charSequence);
        this.f30954b.setVisibility(8);
        this.f30955c.a(z10, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f30955c.f33126f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        TextView textView = this.f30954b;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(72.0f), 1073741824), i10);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        int L = org.telegram.messenger.g0.L(this.d);
        if (textView.getVisibility() == 0) {
            i11 = textView.getMeasuredHeight() + org.telegram.messenger.g0.L(4.0f);
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i11, 1073741824));
    }
}

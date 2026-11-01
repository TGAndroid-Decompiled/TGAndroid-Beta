package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.RadioButton;
public final class n6 extends FrameLayout {
    public final TextView f22360a;
    public final TextView f22361b;
    public final RadioButton f22362c;
    public int d;

    public n6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.d = 50;
        RadioButton radioButton = new RadioButton(context);
        this.f22362c = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.D5, org.telegram.ui.ActionBar.t6.E5, p6Var);
        boolean z10 = dd.X;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 48;
        if (z10) {
            i11 = 0;
        } else {
            i11 = 18;
        }
        addView(radioButton, w7.b6.d(22, 22.0f, i18, i11, 14.0f, z10 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f22360a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21038j5, p6Var);
        a30.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        boolean z11 = dd.X;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i19 = i13 | 48;
        if (z11) {
            i14 = 21;
        } else {
            i14 = 51;
        }
        float f7 = i14;
        if (z11) {
            i15 = 51;
        } else {
            i15 = 21;
        }
        addView(textView, w7.b6.d(-2, -2.0f, i19, f7, 13.0f, i15, 0.0f));
        TextView textView2 = new TextView(context);
        this.f22361b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
        textView2.setTextSize(1, 14.0f);
        if (dd.X) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView2.setGravity(i16 | 16);
        textView2.setVisibility(8);
        boolean z12 = dd.X;
        int i20 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i17 = 21;
        } else {
            i17 = 51;
        }
        addView(textView2, w7.b6.d(-2, -2.0f, i20, i17, 37.0f, z12 ? 51 : 21, 0.0f));
    }

    public final void a(int i10, int i11) {
        this.f22362c.b(i10, i11);
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f22360a.setText(charSequence);
        this.f22361b.setVisibility(8);
        this.f22362c.a(z10, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f22362c.f24162f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TextView textView = this.f22361b;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(72.0f), 1073741824), i11);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        int L = org.telegram.messenger.i0.L(this.d);
        if (textView.getVisibility() == 0) {
            i12 = textView.getMeasuredHeight() + org.telegram.messenger.i0.L(4.0f);
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(L + i12, 1073741824));
    }
}

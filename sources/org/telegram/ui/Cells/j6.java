package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.RadioButton;
public final class j6 extends FrameLayout {
    public final TextView f29369a;
    public final TextView f29370b;
    public final RadioButton f29371c;
    public int d;

    public j6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.f29371c = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.s6.O(radioButton, org.telegram.ui.ActionBar.l6.D5, org.telegram.ui.ActionBar.l6.E5, g6Var);
        boolean z9 = id.f23157a0;
        if (z9) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i17 = i7 | 48;
        if (z9) {
            i10 = 0;
        } else {
            i10 = 18;
        }
        addView(radioButton, c8.ha.d(22, 22.0f, i17, i10, 14.0f, z9 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f29369a = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f27973j5, g6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z10 = id.f23157a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i18 = i12 | 48;
        if (z10) {
            i13 = 21;
        } else {
            i13 = 51;
        }
        float f10 = i13;
        if (z10) {
            i14 = 51;
        } else {
            i14 = 21;
        }
        addView(textView, c8.ha.d(-2, -2.0f, i18, f10, 13.0f, i14, 0.0f));
        TextView textView2 = new TextView(context);
        this.f29370b = textView2;
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28257y6, g6Var);
        textView2.setTextSize(1, 14.0f);
        if (id.f23157a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15 | 16);
        textView2.setVisibility(8);
        boolean z11 = id.f23157a0;
        int i19 = (z11 ? 5 : 3) | 48;
        if (z11) {
            i16 = 21;
        } else {
            i16 = 51;
        }
        addView(textView2, c8.ha.d(-2, -2.0f, i19, i16, 37.0f, z11 ? 51 : 21, 0.0f));
    }

    public final void a(int i7, int i10) {
        this.f29371c.b(i7, i10);
    }

    public final void b(CharSequence charSequence, boolean z9) {
        this.f29369a.setText(charSequence);
        this.f29370b.setVisibility(8);
        this.f29371c.a(z9, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f29371c.f31522f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        TextView textView = this.f29370b;
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

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.ui.Components.RadioButton;
public final class l6 extends FrameLayout {
    public final TextView f22244a;
    public final TextView f22245b;
    public final RadioButton f22246c;
    public boolean d;

    public l6(Context context, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        RadioButton radioButton = new RadioButton(context);
        this.f22246c = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        if (z10) {
            org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.D5, org.telegram.ui.ActionBar.t6.E5, null);
        } else {
            org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.f20986g7, org.telegram.ui.ActionBar.t6.f21003h7, null);
        }
        boolean z11 = cd.X;
        if (z11) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 48;
        if (z11) {
            i11 = 0;
        } else {
            i11 = 20;
        }
        addView(radioButton, w7.b6.d(22, 22.0f, i17, i11, 10.0f, z11 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f22244a = textView;
        if (z10) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21037j5, null);
        } else {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        }
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (cd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        boolean z12 = cd.X;
        if (z12) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i18 = i13 | 48;
        if (z12) {
            i14 = 23;
        } else {
            i14 = 61;
        }
        addView(textView, w7.b6.d(-2, -2.0f, i18, i14, 10.0f, z12 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.f22245b = textView2;
        if (z10) {
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21169q5, null);
        } else {
            org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21330z6, null);
        }
        textView2.setTextSize(1, 13.0f);
        if (cd.X) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, org.telegram.messenger.i0.L(12.0f));
        boolean z13 = cd.X;
        int i19 = (z13 ? 5 : 3) | 48;
        if (z13) {
            i16 = 17;
        } else {
            i16 = 61;
        }
        addView(textView2, w7.b6.d(-2, -2.0f, i19, i16, 35.0f, z13 ? 61 : 17, 0.0f));
    }

    public final void a(boolean z10) {
        this.f22246c.a(z10, true);
    }

    public final void b(String str, String str2, boolean z10, boolean z11) {
        this.f22244a.setText(str);
        this.f22245b.setText(str2);
        this.f22246c.a(z11, false);
        this.d = z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.d) {
            float f10 = 60.0f;
            if (cd.X) {
                f7 = 0.0f;
            } else {
                f7 = 60.0f;
            }
            float L = org.telegram.messenger.i0.L(f7);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!cd.X) {
                f10 = 0.0f;
            }
            canvas.drawLine(L, height, measuredWidth - org.telegram.messenger.i0.L(f10), getHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f22246c.f24161f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
}

package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.ui.Components.RadioButton;
public final class h6 extends FrameLayout {
    public final TextView f29281a;
    public final TextView f29282b;
    public final RadioButton f29283c;
    public boolean d;

    public h6(Context context, boolean z9) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        RadioButton radioButton = new RadioButton(context);
        this.f29283c = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        if (z9) {
            org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.D5, org.telegram.ui.ActionBar.k6.E5, null);
        } else {
            org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.f27908g7, org.telegram.ui.ActionBar.k6.h7, null);
        }
        boolean z10 = id.f23157a0;
        if (z10) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        int i16 = i7 | 48;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 20;
        }
        addView(radioButton, c8.ha.d(22, 22.0f, i16, i10, 10.0f, z10 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f29281a = textView;
        if (z9) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f27960j5, null);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        }
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z11 = id.f23157a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z11) {
            i13 = 23;
        } else {
            i13 = 61;
        }
        addView(textView, c8.ha.d(-2, -2.0f, i17, i13, 10.0f, z11 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.f29282b = textView2;
        if (z9) {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28091q5, null);
        } else {
            org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28262z6, null);
        }
        textView2.setTextSize(1, 13.0f);
        if (id.f23157a0) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
        boolean z12 = id.f23157a0;
        int i18 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i15 = 17;
        } else {
            i15 = 61;
        }
        addView(textView2, c8.ha.d(-2, -2.0f, i18, i15, 35.0f, z12 ? 61 : 17, 0.0f));
    }

    public final void a(boolean z9) {
        this.f29283c.a(z9, true);
    }

    public final void b(String str, String str2, boolean z9, boolean z10) {
        this.f29281a.setText(str);
        this.f29282b.setText(str2);
        this.f29283c.a(z10, false);
        this.d = z9;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.d) {
            float f11 = 60.0f;
            if (id.f23157a0) {
                f10 = 0.0f;
            } else {
                f10 = 60.0f;
            }
            float L = org.telegram.messenger.g0.L(f10);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!id.f23157a0) {
                f11 = 0.0f;
            }
            canvas.drawLine(L, height, measuredWidth - org.telegram.messenger.g0.L(f11), getHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f29283c.f31517f);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
}

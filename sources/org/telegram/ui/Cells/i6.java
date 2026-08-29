package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.RadioButton;
public final class i6 extends FrameLayout {
    public final TextView f24499a;
    public final TextView f24500b;
    public final RadioButton f24501c;
    public int d;

    public i6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
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
        this.f24501c = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.D5, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E5, c6Var));
        boolean z10 = LocaleController.isRTL;
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
        addView(radioButton, i7.f6.d(22, 22.0f, i18, i11, 14.0f, z10 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f24499a = textView;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23169j5, c6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        boolean z11 = LocaleController.isRTL;
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
        float f9 = i14;
        if (z11) {
            i15 = 51;
        } else {
            i15 = 21;
        }
        addView(textView, i7.f6.d(-2, -2.0f, i19, f9, 13.0f, i15, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24500b = textView2;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23433y6, c6Var, textView2, 1, 14.0f);
        if (LocaleController.isRTL) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView2.setGravity(i16 | 16);
        textView2.setVisibility(8);
        boolean z12 = LocaleController.isRTL;
        int i20 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i17 = 21;
        } else {
            i17 = 51;
        }
        addView(textView2, i7.f6.d(-2, -2.0f, i20, i17, 37.0f, z12 ? 51 : 21, 0.0f));
    }

    public final void a(int i10, int i11) {
        this.f24501c.b(i10, i11);
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f24499a.setText(charSequence);
        this.f24500b.setVisibility(8);
        this.f24501c.a(z10, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f24501c.f26519f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TextView textView = this.f24500b;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(72.0f), 1073741824), i11);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        int dp = AndroidUtilities.dp(this.d);
        if (textView.getVisibility() == 0) {
            i12 = textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        } else {
            i12 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dp + i12, 1073741824));
    }
}

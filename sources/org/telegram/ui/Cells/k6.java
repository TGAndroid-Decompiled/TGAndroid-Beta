package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.RadioButton;
public final class k6 extends FrameLayout {
    public final TextView f23068a;
    public final TextView f23069b;
    public final RadioButton f23070c;
    public int d;

    public k6(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
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
        this.f23070c = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.D5, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E5, g6Var));
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i18 = i10 | 48;
        if (z4) {
            i11 = 0;
        } else {
            i11 = 18;
        }
        addView(radioButton, k7.c6.d(22, 22.0f, i18, i11, 14.0f, z4 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f23068a = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f21766j5, g6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i19 = i13 | 48;
        if (z10) {
            i14 = 21;
        } else {
            i14 = 51;
        }
        float f10 = i14;
        if (z10) {
            i15 = 51;
        } else {
            i15 = 21;
        }
        addView(textView, k7.c6.d(-2, -2.0f, i19, f10, 13.0f, i15, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23069b = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f22036y6, g6Var, textView2, 1, 14.0f);
        if (LocaleController.isRTL) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView2.setGravity(i16 | 16);
        textView2.setVisibility(8);
        boolean z11 = LocaleController.isRTL;
        int i20 = (z11 ? 5 : 3) | 48;
        if (z11) {
            i17 = 21;
        } else {
            i17 = 51;
        }
        addView(textView2, k7.c6.d(-2, -2.0f, i20, i17, 37.0f, z11 ? 51 : 21, 0.0f));
    }

    public final void a(int i10, int i11) {
        this.f23070c.b(i10, i11);
    }

    public final void b(CharSequence charSequence, boolean z4) {
        this.f23068a.setText(charSequence);
        this.f23069b.setVisibility(8);
        this.f23070c.a(z4, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f23070c.f25006f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TextView textView = this.f23069b;
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

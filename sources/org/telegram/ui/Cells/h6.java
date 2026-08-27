package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.RadioButton;

public final class h6 extends FrameLayout {

    public final TextView f24449a;

    public final TextView f24450b;

    public final RadioButton f24451c;
    public int d;

    public h6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.d = 50;
        RadioButton radioButton = new RadioButton(context);
        this.f24451c = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.D5, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E5, c6Var));
        boolean z10 = LocaleController.isRTL;
        addView(radioButton, h7.z5.d(22, 22.0f, (z10 ? 5 : 3) | 48, z10 ? 0 : 18, 14.0f, z10 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f24449a = textView;
        rl.l(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z11 = LocaleController.isRTL;
        addView(textView, h7.z5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 51, 13.0f, z11 ? 51 : 21, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24450b = textView2;
        rl.l(org.telegram.ui.ActionBar.g6.f23423y6, c6Var, textView2, 1, 14.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView2.setVisibility(8);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, h7.z5.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 21 : 51, 37.0f, z12 ? 51 : 21, 0.0f));
    }

    public final void a(int i10, int i11) {
        this.f24451c.b(i10, i11);
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f24449a.setText(charSequence);
        this.f24450b.setVisibility(8);
        this.f24451c.a(z10, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f24451c.f26504f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredHeight;
        TextView textView = this.f24450b;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(72.0f), 1073741824), i11);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        int iDp = AndroidUtilities.dp(this.d);
        if (textView.getVisibility() == 0) {
            measuredHeight = textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        } else {
            measuredHeight = 0;
        }
        super.onMeasure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(iDp + measuredHeight, 1073741824));
    }
}

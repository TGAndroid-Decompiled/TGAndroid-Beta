package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.bi;
import org.telegram.ui.Components.RadioButton;
public final class l6 extends FrameLayout {
    public final TextView f22441a;
    public final TextView f22442b;
    public final RadioButton f22443c;
    public int d;

    public l6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
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
        this.f22443c = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.D5, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E5, d6Var));
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
        addView(radioButton, w7.z5.d(22, 22.0f, i18, i11, 14.0f, z10 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f22441a = textView;
        bi.m(org.telegram.ui.ActionBar.i6.f20935j5, d6Var, textView, 1, 16.0f);
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
        float f7 = i14;
        if (z11) {
            i15 = 51;
        } else {
            i15 = 21;
        }
        addView(textView, w7.z5.d(-2, -2.0f, i19, f7, 13.0f, i15, 0.0f));
        TextView textView2 = new TextView(context);
        this.f22442b = textView2;
        bi.m(org.telegram.ui.ActionBar.i6.f21214y6, d6Var, textView2, 1, 14.0f);
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
        addView(textView2, w7.z5.d(-2, -2.0f, i20, i17, 37.0f, z12 ? 51 : 21, 0.0f));
    }

    public final void a(int i10, int i11) {
        this.f22443c.b(i10, i11);
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f22441a.setText(charSequence);
        this.f22442b.setVisibility(8);
        this.f22443c.a(z10, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f22443c.f24304f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        TextView textView = this.f22442b;
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

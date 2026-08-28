package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.RadioButton;
public final class k6 extends FrameLayout {
    public final TextView f24613a;
    public final TextView f24614b;
    public final RadioButton f24615c;
    public int d;

    public k6(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.d = 50;
        RadioButton radioButton = new RadioButton(context);
        this.f24615c = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.D5, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E5, b6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        int i17 = i9 | 48;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 18;
        }
        addView(radioButton, g7.e6.d(22, 22.0f, i17, i10, 14.0f, z10 ? 18 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f24613a = textView;
        ll.n(org.telegram.ui.ActionBar.f6.f23108j5, b6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z11 = LocaleController.isRTL;
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
        addView(textView, g7.e6.d(-2, -2.0f, i18, f10, 13.0f, i14, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24614b = textView2;
        ll.n(org.telegram.ui.ActionBar.f6.f23369y6, b6Var, textView2, 1, 14.0f);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15 | 16);
        textView2.setVisibility(8);
        boolean z12 = LocaleController.isRTL;
        int i19 = (z12 ? 5 : 3) | 48;
        if (z12) {
            i16 = 21;
        } else {
            i16 = 51;
        }
        addView(textView2, g7.e6.d(-2, -2.0f, i19, i16, 37.0f, z12 ? 51 : 21, 0.0f));
    }

    public final void a(int i9, int i10) {
        this.f24615c.b(i9, i10);
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f24613a.setText(charSequence);
        this.f24614b.setVisibility(8);
        this.f24615c.a(z10, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f24615c.f26508f);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        TextView textView = this.f24614b;
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9) - AndroidUtilities.dp(72.0f), 1073741824), i10);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        int dp = AndroidUtilities.dp(this.d);
        if (textView.getVisibility() == 0) {
            i11 = textView.getMeasuredHeight() + AndroidUtilities.dp(4.0f);
        } else {
            i11 = 0;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(dp + i11, 1073741824));
    }
}

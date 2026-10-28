package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.kb1;
public final class n6 extends FrameLayout {
    public final TextView f24542a;
    public final TextView f24543b;
    public final RadioButton f24544c;
    public boolean d;

    public n6(Context context, boolean z10) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        RadioButton radioButton = new RadioButton(context);
        this.f24544c = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        if (z10) {
            org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.D5, org.telegram.ui.ActionBar.y6.E5, null);
        } else {
            org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23430h7, null);
        }
        boolean z11 = LocaleController.isRTL;
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
        addView(radioButton, kb1.h(22, 22.0f, i17, i11, 10.0f, z11 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.f24542a = textView;
        if (z10) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, null);
        } else {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        }
        wh.r(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView.setGravity(i12 | 16);
        boolean z12 = LocaleController.isRTL;
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
        addView(textView, kb1.h(-2, -2.0f, i18, i14, 10.0f, z12 ? 61 : 23, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24543b = textView2;
        if (z10) {
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.q5, null);
        } else {
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23768z6, null);
        }
        textView2.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15);
        textView2.setLines(0);
        textView2.setMaxLines(0);
        textView2.setSingleLine(false);
        textView2.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
        boolean z13 = LocaleController.isRTL;
        int i19 = (z13 ? 5 : 3) | 48;
        if (z13) {
            i16 = 17;
        } else {
            i16 = 61;
        }
        addView(textView2, kb1.h(-2, -2.0f, i19, i16, 35.0f, z13 ? 61 : 17, 0.0f));
    }

    public final void a(boolean z10) {
        this.f24544c.a(z10, true);
    }

    public final void b(String str, String str2, boolean z10, boolean z11) {
        this.f24542a.setText(str);
        this.f24543b.setText(str2);
        this.f24544c.a(z11, false);
        this.d = z10;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        if (this.d) {
            float f10 = 60.0f;
            if (LocaleController.isRTL) {
                f7 = 0.0f;
            } else {
                f7 = 60.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            float height = getHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (!LocaleController.isRTL) {
                f10 = 0.0f;
            }
            canvas.drawLine(dp, height, measuredWidth - AndroidUtilities.dp(f10), getHeight() - 1, org.telegram.ui.ActionBar.y6.f23479k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.RadioButton");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f24544c.f26282f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
}

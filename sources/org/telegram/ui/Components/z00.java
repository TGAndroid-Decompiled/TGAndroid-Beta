package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class z00 extends FrameLayout {
    public final q6 f33065a;
    public final q6 f33066b;

    public z00(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        q6 q6Var = new q6(context, true, true, false);
        this.f33065a = q6Var;
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.j6.L6;
        q6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        q6Var.setGravity(i10);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(q6Var, w7.x5.d(-1, 20.0f, i11 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        q6 q6Var2 = new q6(context, true, true, true);
        this.f33066b = q6Var2;
        q6Var2.b(0.45f, 250L, pr.h);
        q6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        q6Var2.setGravity(i12);
        addView(q6Var2, w7.x5.d(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.f44725a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        q6 q6Var = this.f33066b;
        q6Var.c(str, !LocaleController.isRTL, true);
        q6Var.setOnClickListener(new v6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        q6 q6Var = this.f33065a;
        if (z10) {
            q6Var.a();
        }
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        q6Var.c(str, z11, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f33065a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}

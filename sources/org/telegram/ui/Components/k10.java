package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class k10 extends FrameLayout {
    public final s6 f29772a;
    public final s6 f29773b;

    public k10(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        s6 s6Var = new s6(context, true, true, false);
        this.f29772a = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.y6.L6;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i13, null);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        s6Var.setGravity(i10);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(s6Var, gb1.h(-1, 20.0f, i11 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        s6 s6Var2 = new s6(context, true, true, true);
        this.f29773b = s6Var2;
        s6Var2.b(0.45f, 250L, ds.h);
        s6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i13, null);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        s6Var2.setGravity(i12);
        addView(s6Var2, gb1.h(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.f47105a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        s6 s6Var = this.f29773b;
        s6Var.c(str, !LocaleController.isRTL, true);
        s6Var.setOnClickListener(new x6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        s6 s6Var = this.f29772a;
        if (z10) {
            s6Var.a();
        }
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        s6Var.c(str, z11, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f29772a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}

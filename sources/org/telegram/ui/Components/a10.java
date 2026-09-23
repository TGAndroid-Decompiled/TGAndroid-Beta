package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class a10 extends FrameLayout {
    public final p6 f22303a;
    public final p6 f22304b;

    public a10(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        p6 p6Var = new p6(context, true, true, false);
        this.f22303a = p6Var;
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.h6.L6;
        p6Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        p6Var.setGravity(i10);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(p6Var, w7.x5.d(-1, 20.0f, i11 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        p6 p6Var2 = new p6(context, true, true, true);
        this.f22304b = p6Var2;
        p6Var2.b(0.45f, 250L, rr.h);
        p6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, i13, false));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        p6Var2.setGravity(i12);
        addView(p6Var2, w7.x5.d(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.f41795a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        p6 p6Var = this.f22304b;
        p6Var.c(str, !LocaleController.isRTL, true);
        p6Var.setOnClickListener(new u6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        p6 p6Var = this.f22303a;
        if (z10) {
            p6Var.a();
        }
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        p6Var.c(str, z11, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f22303a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}

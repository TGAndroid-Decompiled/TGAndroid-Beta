package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class a10 extends FrameLayout {
    public final k6 f23279a;
    public final k6 f23280b;

    public a10(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        k6 k6Var = new k6(context, true, true, false);
        this.f23279a = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.j6.L6;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        k6Var.setGravity(i10);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(k6Var, k7.b6.d(-1, 20.0f, i11 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        k6 k6Var2 = new k6(context, true, true, true);
        this.f23280b = k6Var2;
        k6Var2.b(0.45f, 250L, mr.h);
        k6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i13, false));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        k6Var2.setGravity(i12);
        addView(k6Var2, k7.b6.d(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.j0.f43142a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        k6 k6Var = this.f23280b;
        k6Var.c(str, !LocaleController.isRTL, true);
        k6Var.setOnClickListener(new p6(1, runnable));
    }

    public final void b(String str, boolean z4) {
        boolean z10;
        k6 k6Var = this.f23279a;
        if (z4) {
            k6Var.a();
        }
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        } else {
            z10 = false;
        }
        k6Var.c(str, z10, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f23279a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}

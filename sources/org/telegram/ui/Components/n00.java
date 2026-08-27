package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

public final class n00 extends FrameLayout {

    public final j6 f30801a;

    public final j6 f30802b;

    public n00(Context context) {
        super(context);
        j6 j6Var = new j6(context, true, true, false);
        this.f30801a = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.g6.L6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        j6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(j6Var, h7.z5.d(-1, 20.0f, (LocaleController.isRTL ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        j6 j6Var2 = new j6(context, true, true, true);
        this.f30802b = j6Var2;
        j6Var2.b(0.45f, 250L, er.h);
        j6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        j6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(j6Var2, h7.z5.d(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.j0.f46605a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        boolean z10 = !LocaleController.isRTL;
        j6 j6Var = this.f30802b;
        j6Var.c(str, z10, true);
        j6Var.setOnClickListener(new o6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        j6 j6Var = this.f30801a;
        if (z10) {
            j6Var.a();
        }
        j6Var.c(str, z10 && !LocaleController.isRTL, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f30801a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}

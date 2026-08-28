package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class k00 extends FrameLayout {
    public final j6 f29899a;
    public final j6 f29900b;

    public k00(Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        j6 j6Var = new j6(context, true, true, false);
        this.f29899a = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        int i12 = org.telegram.ui.ActionBar.f6.L6;
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        j6Var.setGravity(i9);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(j6Var, g7.e6.d(-1, 20.0f, i10 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        j6 j6Var2 = new j6(context, true, true, true);
        this.f29900b = j6Var2;
        j6Var2.b(0.45f, 250L, gr.h);
        j6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i12, false));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        j6Var2.setGravity(i11);
        addView(j6Var2, g7.e6.d(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.j0.f46915a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        j6 j6Var = this.f29900b;
        j6Var.c(str, !LocaleController.isRTL, true);
        j6Var.setOnClickListener(new o6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        j6 j6Var = this.f29899a;
        if (z10) {
            j6Var.a();
        }
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        j6Var.c(str, z11, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f29899a.getText());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }
}

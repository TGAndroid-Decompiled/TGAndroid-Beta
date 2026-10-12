package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class l10 extends FrameLayout {
    public final s6 f26907a;
    public final s6 f26908b;

    public l10(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        s6 s6Var = new s6(context, true, true, false);
        this.f26907a = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.g6.L6;
        s6Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
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
        addView(s6Var, w7.a6.a(20.0f, 21.0f, 15.0f, 21.0f, 2.0f, -1, i11 | 80));
        s6 s6Var2 = new s6(context, true, true, true);
        this.f26908b = s6Var2;
        s6Var2.b(0.45f, 250L, es.h);
        s6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        s6Var2.setGravity(i12);
        addView(s6Var2, w7.a6.a(20.0f, 21.0f, 15.0f, 21.0f, 2.0f, -2, (LocaleController.isRTL ? 3 : 5) | 80));
        WeakHashMap weakHashMap = r0.j0.f43732a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        s6 s6Var = this.f26908b;
        s6Var.c(str, !LocaleController.isRTL, true);
        s6Var.setOnClickListener(new x6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        s6 s6Var = this.f26907a;
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
        accessibilityNodeInfo.setText(this.f26907a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}

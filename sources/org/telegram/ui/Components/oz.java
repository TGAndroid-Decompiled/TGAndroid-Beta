package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class oz extends FrameLayout {
    public final h6 f36985a;
    public final h6 f36986b;

    public oz(Context context) {
        super(context);
        int i3;
        int i10;
        int i11;
        h6 h6Var = new h6(context, true, true, false);
        this.f36985a = h6Var;
        h6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.ActionBar.r6.Z(h6Var, i12, null);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        h6Var.setGravity(i3);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(h6Var, b8.mf.d(-1, 20.0f, i10 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        h6 h6Var2 = new h6(context, true, true, true);
        this.f36986b = h6Var2;
        h6Var2.b(0.45f, 250L, xq.h);
        h6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(h6Var2, i12, null);
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        h6Var2.setGravity(i11);
        addView(h6Var2, b8.mf.d(-2, 20.0f, (org.telegram.messenger.bd.f21784a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.f54015a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        h6 h6Var = this.f36986b;
        h6Var.c(str, !org.telegram.messenger.bd.f21784a0, true);
        h6Var.setOnClickListener(new m6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        h6 h6Var = this.f36985a;
        if (z10) {
            h6Var.a();
        }
        if (z10 && !org.telegram.messenger.bd.f21784a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        h6Var.c(str, z11, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f36985a.getText());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class d00 extends FrameLayout {
    public final n6 f34179a;
    public final n6 f34180b;

    public d00(Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        n6 n6Var = new n6(context, true, true, false);
        this.f34179a = n6Var;
        n6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        n6Var.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.n6.L6;
        org.telegram.ui.ActionBar.u6.Y(n6Var, i12, null);
        if (org.telegram.messenger.gd.f24314a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        n6Var.setGravity(i7);
        if (org.telegram.messenger.gd.f24314a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(n6Var, c8.na.d(-1, 20.0f, i10 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        n6 n6Var2 = new n6(context, true, true, true);
        this.f34180b = n6Var2;
        n6Var2.b(0.45f, 250L, kr.h);
        n6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.u6.Y(n6Var2, i12, null);
        if (org.telegram.messenger.gd.f24314a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        n6Var2.setGravity(i11);
        addView(n6Var2, c8.na.d(-2, 20.0f, (org.telegram.messenger.gd.f24314a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.f56367a;
        new r0.v(2131296686, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        n6 n6Var = this.f34180b;
        n6Var.c(str, !org.telegram.messenger.gd.f24314a0, true);
        n6Var.setOnClickListener(new s6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        n6 n6Var = this.f34179a;
        if (z10) {
            n6Var.a();
        }
        if (z10 && !org.telegram.messenger.gd.f24314a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        n6Var.c(str, z11, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f34179a.getText());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }
}

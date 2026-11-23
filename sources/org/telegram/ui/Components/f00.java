package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class f00 extends FrameLayout {
    public final o6 f35022a;
    public final o6 f35023b;

    public f00(Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        o6 o6Var = new o6(context, true, true, false);
        this.f35022a = o6Var;
        o6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.m6.L6;
        org.telegram.ui.ActionBar.t6.Y(o6Var, i12, null);
        if (org.telegram.messenger.hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        o6Var.setGravity(i7);
        if (org.telegram.messenger.hd.f24408a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(o6Var, c8.na.d(-1, 20.0f, i10 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        o6 o6Var2 = new o6(context, true, true, true);
        this.f35023b = o6Var2;
        o6Var2.b(0.45f, 250L, nr.h);
        o6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.t6.Y(o6Var2, i12, null);
        if (org.telegram.messenger.hd.f24408a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        o6Var2.setGravity(i11);
        addView(o6Var2, c8.na.d(-2, 20.0f, (org.telegram.messenger.hd.f24408a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.f56254a;
        new r0.v(2131296686, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        o6 o6Var = this.f35023b;
        o6Var.c(str, !org.telegram.messenger.hd.f24408a0, true);
        o6Var.setOnClickListener(new t6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        o6 o6Var = this.f35022a;
        if (z10) {
            o6Var.a();
        }
        if (z10 && !org.telegram.messenger.hd.f24408a0) {
            z11 = true;
        } else {
            z11 = false;
        }
        o6Var.c(str, z11, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f35022a.getText());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }
}

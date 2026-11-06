package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class sz extends FrameLayout {
    public final j6 f38155a;
    public final j6 f38156b;

    public sz(Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        j6 j6Var = new j6(context, true, true, false);
        this.f38155a = j6Var;
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        int i12 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.ActionBar.r6.Z(j6Var, i12, null);
        if (org.telegram.messenger.hd.f22878a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        j6Var.setGravity(i7);
        if (org.telegram.messenger.hd.f22878a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(j6Var, c8.ha.d(-1, 20.0f, i10 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        j6 j6Var2 = new j6(context, true, true, true);
        this.f38156b = j6Var2;
        j6Var2.b(0.45f, 250L, xq.h);
        j6Var2.setTextSize(org.telegram.messenger.g0.L(15.0f));
        org.telegram.ui.ActionBar.r6.Z(j6Var2, i12, null);
        if (org.telegram.messenger.hd.f22878a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        j6Var2.setGravity(i11);
        addView(j6Var2, c8.ha.d(-2, 20.0f, (org.telegram.messenger.hd.f22878a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.i0.f54097a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        j6 j6Var = this.f38156b;
        j6Var.c(str, !org.telegram.messenger.hd.f22878a0, true);
        j6Var.setOnClickListener(new o6(1, runnable));
    }

    public final void b(String str, boolean z9) {
        boolean z10;
        j6 j6Var = this.f38155a;
        if (z9) {
            j6Var.a();
        }
        if (z9 && !org.telegram.messenger.hd.f22878a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        j6Var.c(str, z10, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f38155a.getText());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }
}

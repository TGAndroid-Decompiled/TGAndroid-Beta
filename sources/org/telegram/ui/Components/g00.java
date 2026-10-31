package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
public final class g00 extends FrameLayout {
    public final f6 f26204a;
    public final f6 f26205b;

    public g00(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        f6 f6Var = new f6(context, true, true, false);
        this.f26204a = f6Var;
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        int i13 = org.telegram.ui.ActionBar.t6.L6;
        org.telegram.ui.ActionBar.a7.Z(f6Var, i13, null);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        f6Var.setGravity(i10);
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(f6Var, w7.b6.d(-1, 20.0f, i11 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        f6 f6Var2 = new f6(context, true, true, true);
        this.f26205b = f6Var2;
        f6Var2.b(0.45f, 250L, gr.h);
        f6Var2.setTextSize(org.telegram.messenger.i0.L(15.0f));
        org.telegram.ui.ActionBar.a7.Z(f6Var2, i13, null);
        if (org.telegram.messenger.cd.X) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        f6Var2.setGravity(i12);
        addView(f6Var2, w7.b6.d(-2, 20.0f, (org.telegram.messenger.cd.X ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.h0.f46123a;
        new r0.v(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        f6 f6Var = this.f26205b;
        f6Var.c(str, !org.telegram.messenger.cd.X, true);
        f6Var.setOnClickListener(new k6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        f6 f6Var = this.f26204a;
        if (z10) {
            f6Var.a();
        }
        if (z10 && !org.telegram.messenger.cd.X) {
            z11 = true;
        } else {
            z11 = false;
        }
        f6Var.c(str, z11, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f26204a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}

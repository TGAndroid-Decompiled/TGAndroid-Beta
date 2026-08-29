package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class v00 extends FrameLayout {
    public final o6 f33413a;
    public final o6 f33414b;

    public v00(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        o6 o6Var = new o6(context, true, true, false);
        this.f33413a = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.g6.L6;
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        o6Var.setGravity(i10);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(o6Var, i7.f6.d(-1, 20.0f, i11 | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        o6 o6Var2 = new o6(context, true, true, true);
        this.f33414b = o6Var2;
        o6Var2.b(0.45f, 250L, jr.h);
        o6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        o6Var2.setGravity(i12);
        addView(o6Var2, i7.f6.d(-2, 20.0f, (LocaleController.isRTL ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 2.0f));
        WeakHashMap weakHashMap = r0.j0.f46829a;
        new r0.x(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        o6 o6Var = this.f33414b;
        o6Var.c(str, !LocaleController.isRTL, true);
        o6Var.setOnClickListener(new t6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        o6 o6Var = this.f33413a;
        if (z10) {
            o6Var.a();
        }
        if (z10 && !LocaleController.isRTL) {
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
        accessibilityNodeInfo.setText(this.f33413a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}

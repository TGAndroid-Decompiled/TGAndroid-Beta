package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class p10 extends FrameLayout {
    public final r6 f29686a;
    public final r6 f29687b;

    public p10(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        r6 r6Var = new r6(context, true, true, false);
        this.f29686a = r6Var;
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        int i13 = org.telegram.ui.ActionBar.i6.L6;
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        r6Var.setGravity(i10);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(r6Var, w7.x5.a(20.0f, 21.0f, 15.0f, 21.0f, 2.0f, -1, i11 | 80));
        r6 r6Var2 = new r6(context, true, true, true);
        this.f29687b = r6Var2;
        r6Var2.b(0.45f, 250L, hs.h);
        r6Var2.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i13, false));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        r6Var2.setGravity(i12);
        addView(r6Var2, w7.x5.a(20.0f, 21.0f, 15.0f, 21.0f, 2.0f, -2, (LocaleController.isRTL ? 3 : 5) | 80));
        WeakHashMap weakHashMap = r0.i0.f46764a;
        new r0.w(2131296684, Boolean.class, 0, 28, 2).d(this, Boolean.TRUE);
    }

    public final void a(String str, Runnable runnable) {
        r6 r6Var = this.f29687b;
        r6Var.c(str, !LocaleController.isRTL, true);
        r6Var.setOnClickListener(new w6(1, runnable));
    }

    public final void b(String str, boolean z10) {
        boolean z11;
        r6 r6Var = this.f29686a;
        if (z10) {
            r6Var.a();
        }
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        r6Var.c(str, z11, true);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(this.f29686a.getText());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}

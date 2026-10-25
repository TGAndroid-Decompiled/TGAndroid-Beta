package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class p6 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final k0 f42362a;
    public final org.telegram.ui.Components.r6 f42363b;
    public final org.telegram.ui.Components.r6 f42364c;

    public p6(Context context) {
        super(context);
        k0 k0Var = new k0(this, context, 3);
        this.f42362a = k0Var;
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        k0Var.setBackground(org.telegram.ui.ActionBar.o6.f(new float[]{24.0f}, i10));
        k0Var.setImportantForAccessibility(1);
        org.telegram.ui.Components.gb1.c(k0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, null);
            k0Var.addView(textView, org.telegram.ui.Components.gb1.i(-2, -1, 17));
        }
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, true, true);
        this.f42363b = r6Var;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        r6Var.n(0.25f, 300L, dsVar);
        r6Var.setCallback(k0Var);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.t(LocaleController.getString(R.string.ClearCache), true, true);
        r6Var.f32119b = 5;
        r6Var.x(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.y6.Sh;
        r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(true, true, true);
        this.f42364c = r6Var2;
        r6Var2.n(0.25f, 300L, dsVar);
        r6Var2.setCallback(k0Var);
        r6Var2.w(AndroidUtilities.dp(14.0f));
        r6Var2.x(AndroidUtilities.bold());
        r6Var2.u(org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, i10, false), org.telegram.ui.ActionBar.y6.o1(0.7f, org.telegram.ui.ActionBar.y6.x0(null, i11, false))));
        r6Var2.t("", true, true);
        k0Var.setContentDescription(TextUtils.concat(r6Var.f32124i, "\t", r6Var2.f32124i));
        addView(k0Var, org.telegram.ui.Components.gb1.h(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z10) {
        String string;
        String formatFileSize;
        boolean z11;
        if (z10) {
            string = LocaleController.getString(R.string.ClearCache);
        } else {
            string = LocaleController.getString(R.string.ClearSelectedCache);
        }
        org.telegram.ui.Components.r6 r6Var = this.f42363b;
        r6Var.t(string, true, true);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 <= 0) {
            formatFileSize = "";
        } else {
            formatFileSize = AndroidUtilities.formatFileSize(j10);
        }
        org.telegram.ui.Components.r6 r6Var2 = this.f42364c;
        r6Var2.t(formatFileSize, true, true);
        if (i10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        k0 k0Var = this.f42362a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(r6Var.f32124i, "\t", r6Var2.f32124i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDisabled(boolean z10) {
        float f7;
        k0 k0Var = this.f42362a;
        k0Var.animate().cancel();
        ViewPropertyAnimator animate = k0Var.animate();
        if (z10) {
            f7 = 0.65f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).start();
        k0Var.setClickable(!z10);
    }

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.Components.r6 r6Var = this.f42363b;
            if (r6Var != null) {
                r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false));
            }
            org.telegram.ui.Components.r6 r6Var2 = this.f42364c;
            if (r6Var2 != null) {
                r6Var2.u(org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false), org.telegram.ui.ActionBar.y6.o1(0.7f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false))));
            }
            k0 k0Var = this.f42362a;
            if (k0Var != null) {
                k0Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

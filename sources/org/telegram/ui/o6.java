package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public class o6 extends FrameLayout {
    public final l0 f39601a;
    public final org.telegram.ui.Components.j6 f39602b;
    public final org.telegram.ui.Components.j6 f39603c;

    public o6(Context context) {
        super(context);
        l0 l0Var = new l0(this, context, 3);
        this.f39601a = l0Var;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        l0Var.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{24.0f}, i10));
        l0Var.setImportantForAccessibility(1);
        k7.e6.b(l0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Sh, false));
            l0Var.addView(textView, k7.c6.e(-2, -1, 17));
        }
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(true, true, true, false);
        this.f39602b = j6Var;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        j6Var.k(0.25f, 300L, prVar);
        j6Var.setCallback(l0Var);
        j6Var.t(AndroidUtilities.dp(14.0f));
        j6Var.q(LocaleController.getString(R.string.ClearCache), true, true);
        j6Var.f28029b = 5;
        j6Var.u(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.Sh;
        j6Var.r(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(true, true, true, false);
        this.f39603c = j6Var2;
        j6Var2.k(0.25f, 300L, prVar);
        j6Var2.setCallback(l0Var);
        j6Var2.t(AndroidUtilities.dp(14.0f));
        j6Var2.u(AndroidUtilities.bold());
        j6Var2.r(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(null, i10, false), org.telegram.ui.ActionBar.k6.l1(0.7f, org.telegram.ui.ActionBar.k6.w0(null, i11, false))));
        j6Var2.q("", true, true);
        l0Var.setContentDescription(TextUtils.concat(j6Var.f28033g, "\t", j6Var2.f28033g));
        addView(l0Var, k7.c6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z4) {
        String string;
        String formatFileSize;
        boolean z10;
        if (z4) {
            string = LocaleController.getString(R.string.ClearCache);
        } else {
            string = LocaleController.getString(R.string.ClearSelectedCache);
        }
        org.telegram.ui.Components.j6 j6Var = this.f39602b;
        j6Var.q(string, true, true);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 <= 0) {
            formatFileSize = "";
        } else {
            formatFileSize = AndroidUtilities.formatFileSize(j10);
        }
        org.telegram.ui.Components.j6 j6Var2 = this.f39603c;
        j6Var2.q(formatFileSize, true, true);
        if (i10 <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        setDisabled(z10);
        l0 l0Var = this.f39601a;
        l0Var.invalidate();
        l0Var.setContentDescription(TextUtils.concat(j6Var.f28033g, "\t", j6Var2.f28033g));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDisabled(boolean z4) {
        float f10;
        l0 l0Var = this.f39601a;
        l0Var.animate().cancel();
        ViewPropertyAnimator animate = l0Var.animate();
        if (z4) {
            f10 = 0.65f;
        } else {
            f10 = 1.0f;
        }
        animate.alpha(f10).start();
        l0Var.setClickable(!z4);
    }
}

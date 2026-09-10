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
public class l6 extends FrameLayout {
    public final k0 f34543a;
    public final org.telegram.ui.Components.n6 f34544b;
    public final org.telegram.ui.Components.n6 f34545c;

    public l6(Context context) {
        super(context);
        k0 k0Var = new k0(this, context, 3);
        this.f34543a = k0Var;
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        k0Var.setBackground(org.telegram.ui.ActionBar.z5.f(new float[]{24.0f}, i10));
        k0Var.setImportantForAccessibility(1);
        w7.c6.b(k0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            k0Var.addView(textView, w7.a6.e(-2, -1, 17));
        }
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, true, false);
        this.f34544b = n6Var;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        n6Var.k(0.25f, 300L, wrVar);
        n6Var.setCallback(k0Var);
        n6Var.t(AndroidUtilities.dp(14.0f));
        n6Var.q(LocaleController.getString(R.string.ClearCache), true, true);
        n6Var.f25425b = 5;
        n6Var.u(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.Sh;
        n6Var.r(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(true, true, true, false);
        this.f34545c = n6Var2;
        n6Var2.k(0.25f, 300L, wrVar);
        n6Var2.setCallback(k0Var);
        n6Var2.t(AndroidUtilities.dp(14.0f));
        n6Var2.u(AndroidUtilities.bold());
        n6Var2.r(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.l1(0.7f, org.telegram.ui.ActionBar.j6.w0(null, i11, false))));
        n6Var2.q("", true, true);
        k0Var.setContentDescription(TextUtils.concat(n6Var.f25428g, "\t", n6Var2.f25428g));
        addView(k0Var, w7.a6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j3, boolean z10) {
        String string;
        String formatFileSize;
        boolean z11;
        if (z10) {
            string = LocaleController.getString(R.string.ClearCache);
        } else {
            string = LocaleController.getString(R.string.ClearSelectedCache);
        }
        org.telegram.ui.Components.n6 n6Var = this.f34544b;
        n6Var.q(string, true, true);
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 <= 0) {
            formatFileSize = "";
        } else {
            formatFileSize = AndroidUtilities.formatFileSize(j3);
        }
        org.telegram.ui.Components.n6 n6Var2 = this.f34545c;
        n6Var2.q(formatFileSize, true, true);
        if (i10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        k0 k0Var = this.f34543a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(n6Var.f25428g, "\t", n6Var2.f25428g));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDisabled(boolean z10) {
        float f7;
        k0 k0Var = this.f34543a;
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
}

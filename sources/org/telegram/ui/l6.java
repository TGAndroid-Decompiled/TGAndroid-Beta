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
    public final j0 f38222a;
    public final org.telegram.ui.Components.p6 f38223b;
    public final org.telegram.ui.Components.p6 f38224c;

    public l6(Context context) {
        super(context);
        j0 j0Var = new j0(this, context, 3);
        this.f38222a = j0Var;
        int i10 = org.telegram.ui.ActionBar.j6.Oh;
        j0Var.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{24.0f}, i10));
        j0Var.setImportantForAccessibility(1);
        w7.z5.b(j0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Sh, false));
            j0Var.addView(textView, w7.x5.e(-2, -1, 17));
        }
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(true, true, true, false);
        this.f38223b = p6Var;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        p6Var.k(0.25f, 300L, prVar);
        p6Var.setCallback(j0Var);
        p6Var.t(AndroidUtilities.dp(14.0f));
        p6Var.q(LocaleController.getString(R.string.ClearCache), true, true);
        p6Var.f29312b = 5;
        p6Var.u(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.j6.Sh;
        p6Var.r(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(true, true, true, false);
        this.f38224c = p6Var2;
        p6Var2.k(0.25f, 300L, prVar);
        p6Var2.setCallback(j0Var);
        p6Var2.t(AndroidUtilities.dp(14.0f));
        p6Var2.u(AndroidUtilities.bold());
        p6Var2.r(org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, i10, false), org.telegram.ui.ActionBar.j6.l1(0.7f, org.telegram.ui.ActionBar.j6.w0(null, i11, false))));
        p6Var2.q("", true, true);
        j0Var.setContentDescription(TextUtils.concat(p6Var.f29316g, "\t", p6Var2.f29316g));
        addView(j0Var, w7.x5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
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
        org.telegram.ui.Components.p6 p6Var = this.f38223b;
        p6Var.q(string, true, true);
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 <= 0) {
            formatFileSize = "";
        } else {
            formatFileSize = AndroidUtilities.formatFileSize(j3);
        }
        org.telegram.ui.Components.p6 p6Var2 = this.f38224c;
        p6Var2.q(formatFileSize, true, true);
        if (i10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        j0 j0Var = this.f38222a;
        j0Var.invalidate();
        j0Var.setContentDescription(TextUtils.concat(p6Var.f29316g, "\t", p6Var2.f29316g));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDisabled(boolean z10) {
        float f7;
        j0 j0Var = this.f38222a;
        j0Var.animate().cancel();
        ViewPropertyAnimator animate = j0Var.animate();
        if (z10) {
            f7 = 0.65f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).start();
        j0Var.setClickable(!z10);
    }
}

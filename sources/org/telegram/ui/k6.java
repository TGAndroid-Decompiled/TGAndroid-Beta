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
public class k6 extends FrameLayout {
    public final k0 f39147a;
    public final org.telegram.ui.Components.q6 f39148b;
    public final org.telegram.ui.Components.q6 f39149c;

    public k6(Context context) {
        super(context);
        k0 k0Var = new k0(this, context, 3);
        this.f39147a = k0Var;
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        k0Var.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{24.0f}, i10));
        k0Var.setImportantForAccessibility(1);
        w7.z5.b(k0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Sh, false));
            k0Var.addView(textView, w7.x5.e(-2, -1, 17));
        }
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, true, true);
        this.f39148b = q6Var;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        q6Var.n(0.25f, 300L, isVar);
        q6Var.setCallback(k0Var);
        q6Var.w(AndroidUtilities.dp(14.0f));
        q6Var.t(LocaleController.getString(R.string.ClearCache), true, true);
        q6Var.f30031b = 5;
        q6Var.x(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.Sh;
        q6Var.u(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(true, true, true);
        this.f39149c = q6Var2;
        q6Var2.n(0.25f, 300L, isVar);
        q6Var2.setCallback(k0Var);
        q6Var2.w(AndroidUtilities.dp(14.0f));
        q6Var2.x(AndroidUtilities.bold());
        q6Var2.u(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.x0(null, i10, false), org.telegram.ui.ActionBar.i6.m1(0.7f, org.telegram.ui.ActionBar.i6.x0(null, i11, false))));
        q6Var2.t("", true, true);
        k0Var.setContentDescription(TextUtils.concat(q6Var.f30037i, "\t", q6Var2.f30037i));
        addView(k0Var, w7.x5.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 119));
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
        org.telegram.ui.Components.q6 q6Var = this.f39148b;
        q6Var.t(string, true, true);
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 <= 0) {
            formatFileSize = "";
        } else {
            formatFileSize = AndroidUtilities.formatFileSize(j3);
        }
        org.telegram.ui.Components.q6 q6Var2 = this.f39149c;
        q6Var2.t(formatFileSize, true, true);
        if (i10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        k0 k0Var = this.f39147a;
        k0Var.invalidate();
        k0Var.setContentDescription(TextUtils.concat(q6Var.f30037i, "\t", q6Var2.f30037i));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDisabled(boolean z10) {
        float f7;
        k0 k0Var = this.f39147a;
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

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
public class n6 extends FrameLayout {
    public final l0 f35826a;
    public final org.telegram.ui.Components.o6 f35827b;
    public final org.telegram.ui.Components.o6 f35828c;

    public n6(Context context) {
        super(context);
        l0 l0Var = new l0(this, context, 3);
        this.f35826a = l0Var;
        int i10 = org.telegram.ui.ActionBar.i6.Oh;
        l0Var.setBackground(org.telegram.ui.ActionBar.y5.f(new float[]{24.0f}, i10));
        l0Var.setImportantForAccessibility(1);
        w7.a6.b(l0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Sh, false));
            l0Var.addView(textView, w7.y5.e(-2, -1, 17));
        }
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, true, true, false);
        this.f35827b = o6Var;
        org.telegram.ui.Components.sr srVar = org.telegram.ui.Components.sr.h;
        o6Var.k(0.25f, 300L, srVar);
        o6Var.setCallback(l0Var);
        o6Var.t(AndroidUtilities.dp(14.0f));
        o6Var.q(LocaleController.getString(R.string.ClearCache), true, true);
        o6Var.f26983b = 5;
        o6Var.u(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.i6.Sh;
        o6Var.r(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(true, true, true, false);
        this.f35828c = o6Var2;
        o6Var2.k(0.25f, 300L, srVar);
        o6Var2.setCallback(l0Var);
        o6Var2.t(AndroidUtilities.dp(14.0f));
        o6Var2.u(AndroidUtilities.bold());
        o6Var2.r(org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(null, i10, false), org.telegram.ui.ActionBar.i6.l1(0.7f, org.telegram.ui.ActionBar.i6.w0(null, i11, false))));
        o6Var2.q("", true, true);
        l0Var.setContentDescription(TextUtils.concat(o6Var.f26986g, "\t", o6Var2.f26986g));
        addView(l0Var, w7.y5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
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
        org.telegram.ui.Components.o6 o6Var = this.f35827b;
        o6Var.q(string, true, true);
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 <= 0) {
            formatFileSize = "";
        } else {
            formatFileSize = AndroidUtilities.formatFileSize(j3);
        }
        org.telegram.ui.Components.o6 o6Var2 = this.f35828c;
        o6Var2.q(formatFileSize, true, true);
        if (i10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        l0 l0Var = this.f35826a;
        l0Var.invalidate();
        l0Var.setContentDescription(TextUtils.concat(o6Var.f26986g, "\t", o6Var2.f26986g));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDisabled(boolean z10) {
        float f7;
        l0 l0Var = this.f35826a;
        l0Var.animate().cancel();
        ViewPropertyAnimator animate = l0Var.animate();
        if (z10) {
            f7 = 0.65f;
        } else {
            f7 = 1.0f;
        }
        animate.alpha(f7).start();
        l0Var.setClickable(!z10);
    }
}

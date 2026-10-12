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
    public final l0 f38871a;
    public final org.telegram.ui.Components.r6 f38872b;
    public final org.telegram.ui.Components.r6 f38873c;

    public o6(Context context) {
        super(context);
        l0 l0Var = new l0(this, context, 3);
        this.f38871a = l0Var;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        l0Var.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{24.0f}, i10));
        l0Var.setImportantForAccessibility(1);
        w7.c6.b(l0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            l0Var.addView(textView, w7.a6.e(-2, -1, 17));
        }
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(true, true, true);
        this.f38872b = r6Var;
        org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
        r6Var.n(0.25f, 300L, esVar);
        r6Var.setCallback(l0Var);
        r6Var.w(AndroidUtilities.dp(14.0f));
        r6Var.t(LocaleController.getString(R.string.ClearCache), true, true);
        r6Var.f28748b = 5;
        r6Var.x(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.Sh;
        r6Var.u(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(true, true, true);
        this.f38873c = r6Var2;
        r6Var2.n(0.25f, 300L, esVar);
        r6Var2.setCallback(l0Var);
        r6Var2.w(AndroidUtilities.dp(14.0f));
        r6Var2.x(AndroidUtilities.bold());
        r6Var2.u(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.x0(null, i10, false), org.telegram.ui.ActionBar.g6.m1(0.7f, org.telegram.ui.ActionBar.g6.x0(null, i11, false))));
        r6Var2.t("", true, true);
        l0Var.setContentDescription(TextUtils.concat(r6Var.f28753i, "\t", r6Var2.f28753i));
        addView(l0Var, w7.a6.a(48.0f, 16.0f, 16.0f, 16.0f, 16.0f, -1, 119));
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
        org.telegram.ui.Components.r6 r6Var = this.f38872b;
        r6Var.t(string, true, true);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 <= 0) {
            formatFileSize = "";
        } else {
            formatFileSize = AndroidUtilities.formatFileSize(j10);
        }
        org.telegram.ui.Components.r6 r6Var2 = this.f38873c;
        r6Var2.t(formatFileSize, true, true);
        if (i10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        l0 l0Var = this.f38871a;
        l0Var.invalidate();
        l0Var.setContentDescription(TextUtils.concat(r6Var.f28753i, "\t", r6Var2.f28753i));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDisabled(boolean z10) {
        float f7;
        l0 l0Var = this.f38871a;
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

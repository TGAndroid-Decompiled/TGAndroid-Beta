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
public class j6 extends FrameLayout {
    public final m0 f39380a;
    public final org.telegram.ui.Components.i6 f39381b;
    public final org.telegram.ui.Components.i6 f39382c;

    public j6(Context context) {
        super(context);
        m0 m0Var = new m0(this, context, 3);
        this.f39380a = m0Var;
        int i9 = org.telegram.ui.ActionBar.f6.Oh;
        m0Var.setBackground(org.telegram.ui.ActionBar.v5.f(new float[]{24.0f}, i9));
        m0Var.setImportantForAccessibility(1);
        g7.g6.b(m0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Sh, false));
            m0Var.addView(textView, g7.e6.e(-2, -1, 17));
        }
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, true, false);
        this.f39381b = i6Var;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        i6Var.k(0.25f, 300L, grVar);
        i6Var.setCallback(m0Var);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.q(LocaleController.getString(R.string.ClearCache), true, true);
        i6Var.f29333b = 5;
        i6Var.u(AndroidUtilities.bold());
        int i10 = org.telegram.ui.ActionBar.f6.Sh;
        i6Var.r(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(true, true, true, false);
        this.f39382c = i6Var2;
        i6Var2.k(0.25f, 300L, grVar);
        i6Var2.setCallback(m0Var);
        i6Var2.t(AndroidUtilities.dp(14.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var2.r(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, i9, false), org.telegram.ui.ActionBar.f6.l1(0.7f, org.telegram.ui.ActionBar.f6.w0(null, i10, false))));
        i6Var2.q("", true, true);
        m0Var.setContentDescription(TextUtils.concat(i6Var.f29337g, "\t", i6Var2.f29337g));
        addView(m0Var, g7.e6.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
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
        org.telegram.ui.Components.i6 i6Var = this.f39381b;
        i6Var.q(string, true, true);
        int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i9 <= 0) {
            formatFileSize = "";
        } else {
            formatFileSize = AndroidUtilities.formatFileSize(j10);
        }
        org.telegram.ui.Components.i6 i6Var2 = this.f39382c;
        i6Var2.q(formatFileSize, true, true);
        if (i9 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        m0 m0Var = this.f39380a;
        m0Var.invalidate();
        m0Var.setContentDescription(TextUtils.concat(i6Var.f29337g, "\t", i6Var2.f29337g));
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    public void setDisabled(boolean z10) {
        float f10;
        m0 m0Var = this.f39380a;
        m0Var.animate().cancel();
        ViewPropertyAnimator animate = m0Var.animate();
        if (z10) {
            f10 = 0.65f;
        } else {
            f10 = 1.0f;
        }
        animate.alpha(f10).start();
        m0Var.setClickable(!z10);
    }
}

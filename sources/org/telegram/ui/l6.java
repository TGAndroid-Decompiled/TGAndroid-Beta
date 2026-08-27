package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public class l6 extends FrameLayout {

    public final n0 f39953a;

    public final org.telegram.ui.Components.i6 f39954b;

    public final org.telegram.ui.Components.i6 f39955c;

    public l6(Context context) {
        super(context);
        n0 n0Var = new n0(this, context, 3);
        this.f39953a = n0Var;
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        n0Var.setBackground(org.telegram.ui.ActionBar.w5.f(new float[]{24.0f}, i10));
        n0Var.setImportantForAccessibility(1);
        h7.b6.b(n0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Sh, false));
            n0Var.addView(textView, h7.z5.e(-2, -1, 17));
        }
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, true, false);
        this.f39954b = i6Var;
        org.telegram.ui.Components.er erVar = org.telegram.ui.Components.er.h;
        i6Var.k(0.25f, 300L, erVar);
        i6Var.setCallback(n0Var);
        i6Var.t(AndroidUtilities.dp(14.0f));
        i6Var.q(LocaleController.getString(R.string.ClearCache), true, true);
        i6Var.f29239b = 5;
        i6Var.u(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.g6.Sh;
        i6Var.r(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(true, true, true, false);
        this.f39955c = i6Var2;
        i6Var2.k(0.25f, 300L, erVar);
        i6Var2.setCallback(n0Var);
        i6Var2.t(AndroidUtilities.dp(14.0f));
        i6Var2.u(AndroidUtilities.bold());
        i6Var2.r(org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, i10, false), org.telegram.ui.ActionBar.g6.l1(0.7f, org.telegram.ui.ActionBar.g6.w0(null, i11, false))));
        i6Var2.q("", true, true);
        n0Var.setContentDescription(TextUtils.concat(i6Var.f29243g, "\t", i6Var2.f29243g));
        addView(n0Var, h7.z5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
    }

    public final void a(long j10, boolean z10) {
        String string = z10 ? LocaleController.getString(R.string.ClearCache) : LocaleController.getString(R.string.ClearSelectedCache);
        org.telegram.ui.Components.i6 i6Var = this.f39954b;
        i6Var.q(string, true, true);
        String fileSize = j10 <= 0 ? "" : AndroidUtilities.formatFileSize(j10);
        org.telegram.ui.Components.i6 i6Var2 = this.f39955c;
        i6Var2.q(fileSize, true, true);
        setDisabled(j10 <= 0);
        n0 n0Var = this.f39953a;
        n0Var.invalidate();
        n0Var.setContentDescription(TextUtils.concat(i6Var.f29243g, "\t", i6Var2.f29243g));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDisabled(boolean z10) {
        n0 n0Var = this.f39953a;
        n0Var.animate().cancel();
        n0Var.animate().alpha(z10 ? 0.65f : 1.0f).start();
        n0Var.setClickable(!z10);
    }
}

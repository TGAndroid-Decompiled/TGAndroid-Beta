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
public class o6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final l0 f40087a;
    public final org.telegram.ui.Components.n6 f40088b;
    public final org.telegram.ui.Components.n6 f40089c;

    public o6(Context context) {
        super(context);
        l0 l0Var = new l0(this, context, 3);
        this.f40087a = l0Var;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        l0Var.setBackground(org.telegram.ui.ActionBar.a6.f(new float[]{24.0f}, i10));
        l0Var.setImportantForAccessibility(1);
        w7.b6.b(l0Var, 0.02f, 1.2f);
        if (LocaleController.isRTL) {
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.ClearCache));
            textView.setGravity(17);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, null);
            l0Var.addView(textView, w7.z5.e(-2, -1, 17));
        }
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, true);
        this.f40088b = n6Var;
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        n6Var.n(0.25f, 300L, zrVar);
        n6Var.setCallback(l0Var);
        n6Var.w(AndroidUtilities.dp(14.0f));
        n6Var.t(LocaleController.getString(R.string.ClearCache), true, true);
        n6Var.f28797b = 5;
        n6Var.x(AndroidUtilities.bold());
        int i11 = org.telegram.ui.ActionBar.k6.Sh;
        n6Var.u(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(true, true, true);
        this.f40089c = n6Var2;
        n6Var2.n(0.25f, 300L, zrVar);
        n6Var2.setCallback(l0Var);
        n6Var2.w(AndroidUtilities.dp(14.0f));
        n6Var2.x(AndroidUtilities.bold());
        n6Var2.u(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.x0(null, i10, false), org.telegram.ui.ActionBar.k6.o1(0.7f, org.telegram.ui.ActionBar.k6.x0(null, i11, false))));
        n6Var2.t("", true, true);
        l0Var.setContentDescription(TextUtils.concat(n6Var.f28802i, "\t", n6Var2.f28802i));
        addView(l0Var, w7.z5.d(-1, 48.0f, 119, 16.0f, 16.0f, 16.0f, 16.0f));
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
        org.telegram.ui.Components.n6 n6Var = this.f40088b;
        n6Var.t(string, true, true);
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 <= 0) {
            formatFileSize = "";
        } else {
            formatFileSize = AndroidUtilities.formatFileSize(j10);
        }
        org.telegram.ui.Components.n6 n6Var2 = this.f40089c;
        n6Var2.t(formatFileSize, true, true);
        if (i10 <= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        setDisabled(z11);
        l0 l0Var = this.f40087a;
        l0Var.invalidate();
        l0Var.setContentDescription(TextUtils.concat(n6Var.f28802i, "\t", n6Var2.f28802i));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDisabled(boolean z10) {
        float f7;
        l0 l0Var = this.f40087a;
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

    @Override
    public final void updateColors() {
        try {
            org.telegram.ui.Components.n6 n6Var = this.f40088b;
            if (n6Var != null) {
                n6Var.u(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false));
            }
            org.telegram.ui.Components.n6 n6Var2 = this.f40089c;
            if (n6Var2 != null) {
                n6Var2.u(org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Oh, false), org.telegram.ui.ActionBar.k6.o1(0.7f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Sh, false))));
            }
            l0 l0Var = this.f40087a;
            if (l0Var != null) {
                l0Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}

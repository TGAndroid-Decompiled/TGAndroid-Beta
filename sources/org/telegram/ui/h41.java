package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class h41 extends org.telegram.ui.ActionBar.n2 {
    public static final int[] f36862c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.zl0 f36863a;
    public g41 f36864b;

    public static String S(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void T(int i10, CharSequence[] charSequenceArr, org.telegram.ui.Components.voip.e1 e1Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20372a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new lg.j(11, this, e1Var));
        showDialog(alertDialog$Builder.f20372a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20766a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f36863a = zl0Var;
        zl0Var.s1();
        this.actionBar.setAdaptiveBackground(this.f36863a);
        this.f36863a.setLayoutManager(new s4.c0());
        this.f36863a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.zl0 zl0Var2 = this.f36863a;
        g41 g41Var = new g41(context);
        this.f36864b = g41Var;
        zl0Var2.setAdapter(g41Var);
        this.f36863a.setOnItemClickListener(new t21(this, 3));
        frameLayout.addView(this.f36863a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}

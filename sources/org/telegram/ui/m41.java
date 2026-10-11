package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class m41 extends org.telegram.ui.ActionBar.m2 {
    public static final int[] f39844c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.rm0 f39845a;
    public l41 f39846b;

    public static String U(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void V(int i10, CharSequence[] charSequenceArr, v20 v20Var) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20404a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new lg.j(11, this, v20Var));
        showDialog(alertDialog$Builder.f20404a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 27));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20766a7, false));
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.rm0 rm0Var = new org.telegram.ui.Components.rm0(context, null);
        this.f39845a = rm0Var;
        rm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39845a);
        this.f39845a.setLayoutManager(new s4.d0());
        this.f39845a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.rm0 rm0Var2 = this.f39845a;
        l41 l41Var = new l41(context);
        this.f39846b = l41Var;
        rm0Var2.setAdapter(l41Var);
        this.f39845a.setOnItemClickListener(new y21(this, 3));
        frameLayout.addView(this.f39845a, w7.x5.d(-1.0f, -1));
        return this.fragmentView;
    }
}

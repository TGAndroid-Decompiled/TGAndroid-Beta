package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class d31 extends org.telegram.ui.ActionBar.o2 {
    public static final int[] f36460c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.lm0 f36461a;
    public c31 f36462b;

    public static String U(int i10) {
        if (i10 % 1000000 == 0) {
            return (i10 / 1000000) + " Mbps";
        } else if (i10 > 1000000) {
            return String.format(Locale.US, "%.1f Mbps", Float.valueOf(i10 / 1000000.0f));
        } else {
            return (i10 / 1000) + " kbps";
        }
    }

    public final void V(int i10, CharSequence[] charSequenceArr, wv wvVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20679a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new mg.j(11, this, wvVar));
        showDialog(alertDialog$Builder.f20679a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new b31(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f36461a = lm0Var;
        lm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f36461a);
        this.f36461a.setLayoutManager(new s4.b0());
        this.f36461a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.lm0 lm0Var2 = this.f36461a;
        c31 c31Var = new c31(context);
        this.f36462b = c31Var;
        lm0Var2.setAdapter(c31Var);
        this.f36461a.setOnItemClickListener(new i11(this, 3));
        frameLayout.addView(this.f36461a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}

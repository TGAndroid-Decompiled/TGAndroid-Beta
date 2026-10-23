package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Locale;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class e31 extends org.telegram.ui.ActionBar.o2 {
    public static final int[] f36812c = {750000, 1000000, 1200000, 2000000};
    public org.telegram.ui.Components.mm0 f36813a;
    public d31 f36814b;

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
        alertDialog$Builder.f20678a.R = LocaleController.getString(i10);
        alertDialog$Builder.f(charSequenceArr, new mg.j(11, this, wvVar));
        showDialog(alertDialog$Builder.f20678a);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.RoundVideoSettings));
        this.actionBar.setActionBarMenuOnItemClick(new c31(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21125a7, frameLayout, null);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f36813a = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f36813a);
        this.f36813a.setLayoutManager(new s4.b0());
        this.f36813a.setVerticalScrollBarEnabled(false);
        org.telegram.ui.Components.mm0 mm0Var2 = this.f36813a;
        d31 d31Var = new d31(context);
        this.f36814b = d31Var;
        mm0Var2.setAdapter(d31Var);
        this.f36813a.setOnItemClickListener(new j11(this, 3));
        frameLayout.addView(this.f36813a, w7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }
}

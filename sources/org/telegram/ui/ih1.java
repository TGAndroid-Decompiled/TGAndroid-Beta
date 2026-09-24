package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ih1 extends org.telegram.ui.Components.m61 {
    public gh1 d;
    public long e;
    public eh1 f34511f;
    public String h;
    public org.telegram.ui.ActionBar.u0 f34512n;
    public boolean f34513r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.j61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ih1.U(java.util.ArrayList, org.telegram.ui.Components.j61):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.v51 v51Var, View view) {
        eh1 eh1Var = this.f34511f;
        int i10 = v51Var.d;
        if (i10 == 1) {
            eh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f34513r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new ld(org.telegram.ui.Cells.c1.g(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (v51Var.f15700a == 12) {
            finishFragment();
            eh1Var.run(getMessagesController().getChat(Long.valueOf(-v51Var.f29053x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.v51 v51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.e2(this, 19);
        this.f34512n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f34512n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f34512n.setVisibility(8);
        super.createView(context);
        this.f26364a.p1();
        this.actionBar.setAdaptiveBackground(this.f26364a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f34513r) {
            gh1 gh1Var = this.d;
            gh1Var.f33932c = false;
            gh1Var.f33933f.add(new hh1(this, 0));
            this.f34513r = false;
        }
    }
}

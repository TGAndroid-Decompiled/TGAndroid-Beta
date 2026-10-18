package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class fg1 extends org.telegram.ui.Components.v61 {
    public dg1 d;
    public long e;
    public bg1 f36954f;
    public String h;
    public org.telegram.ui.ActionBar.u0 f36955n;
    public boolean f36956r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.s61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fg1.U(java.util.ArrayList, org.telegram.ui.Components.s61):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.f61 f61Var, View view) {
        bg1 bg1Var = this.f36954f;
        int i10 = f61Var.d;
        if (i10 == 1) {
            bg1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f36956r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new od(org.telegram.ui.Cells.c1.i(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (f61Var.f44334a == 12) {
            finishFragment();
            bg1Var.run(getMessagesController().getChat(Long.valueOf(-f61Var.f26158x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.f61 f61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new ig.c2(this, 19);
        this.f36955n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f36955n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f36955n.setVisibility(8);
        super.createView(context);
        this.f31197a.p1();
        this.actionBar.setAdaptiveBackground(this.f31197a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f36956r) {
            dg1 dg1Var = this.d;
            dg1Var.f36218c = false;
            dg1Var.f36219f.add(new eg1(this, 0));
            this.f36956r = false;
        }
    }
}

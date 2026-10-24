package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ig1 extends org.telegram.ui.Components.d71 {
    public gg1 d;
    public long e;
    public eg1 f38288f;
    public String h;
    public org.telegram.ui.ActionBar.u0 f38289n;
    public boolean f38290r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.a71 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ig1.U(java.util.ArrayList, org.telegram.ui.Components.a71):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.l61 l61Var, View view) {
        eg1 eg1Var = this.f38288f;
        int i10 = l61Var.d;
        if (i10 == 1) {
            eg1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f38290r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")));
                return;
            }
            presentFragment(new g(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (l61Var.f44712a == 12) {
            finishFragment();
            eg1Var.run(getMessagesController().getChat(Long.valueOf(-l61Var.f28238x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.l61 l61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.m().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new ig.b2(this, 19);
        this.f38289n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38289n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f38289n.setVisibility(8);
        super.createView(context);
        this.f25615a.t1();
        this.actionBar.setAdaptiveBackground(this.f25615a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f38290r) {
            gg1 gg1Var = this.d;
            gg1Var.f37574c = false;
            gg1Var.f37575f.add(new hg1(this, 0));
            this.f38290r = false;
        }
    }
}

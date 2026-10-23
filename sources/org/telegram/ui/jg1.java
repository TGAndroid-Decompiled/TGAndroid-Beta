package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class jg1 extends org.telegram.ui.Components.e71 {
    public hg1 d;
    public long e;
    public fg1 f38564f;
    public String h;
    public org.telegram.ui.ActionBar.u0 f38565n;
    public boolean f38566r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.b71 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.jg1.U(java.util.ArrayList, org.telegram.ui.Components.b71):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.m61 m61Var, View view) {
        fg1 fg1Var = this.f38564f;
        int i10 = m61Var.d;
        if (i10 == 1) {
            fg1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f38566r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new md(org.telegram.ui.Cells.b1.i(0, "step")));
                return;
            }
            presentFragment(new g(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (m61Var.f44713a == 12) {
            finishFragment();
            fg1Var.run(getMessagesController().getChat(Long.valueOf(-m61Var.f28570x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.m61 m61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.m().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new ig.b2(this, 19);
        this.f38565n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38565n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f38565n.setVisibility(8);
        super.createView(context);
        this.f25907a.t1();
        this.actionBar.setAdaptiveBackground(this.f25907a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f38566r) {
            hg1 hg1Var = this.d;
            hg1Var.f37858c = false;
            hg1Var.f37859f.add(new ig1(this, 0));
            this.f38566r = false;
        }
    }
}

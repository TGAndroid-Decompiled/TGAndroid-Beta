package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class dg1 extends org.telegram.ui.Components.w61 {
    public bg1 d;
    public long e;
    public zf1 f36388f;
    public String h;
    public org.telegram.ui.ActionBar.u0 f36389n;
    public boolean f36390r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.t61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dg1.U(java.util.ArrayList, org.telegram.ui.Components.t61):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.g61 g61Var, View view) {
        zf1 zf1Var = this.f36388f;
        int i10 = g61Var.d;
        if (i10 == 1) {
            zf1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f36390r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new md(org.telegram.ui.Cells.c1.i(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (g61Var.f44288a == 12) {
            finishFragment();
            zf1Var.run(getMessagesController().getChat(Long.valueOf(-g61Var.f26508x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.g61 g61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new ig.c2(this, 19);
        this.f36389n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f36389n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f36389n.setVisibility(8);
        super.createView(context);
        this.f32025a.p1();
        this.actionBar.setAdaptiveBackground(this.f32025a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f36390r) {
            bg1 bg1Var = this.d;
            bg1Var.f35627c = false;
            bg1Var.f35628f.add(new cg1(this, 0));
            this.f36390r = false;
        }
    }
}

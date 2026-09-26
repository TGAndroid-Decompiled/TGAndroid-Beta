package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ih1 extends org.telegram.ui.Components.n61 {
    public gh1 d;
    public long e;
    public eh1 f34523f;
    public String h;
    public org.telegram.ui.ActionBar.u0 f34524n;
    public boolean f34525r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.k61 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ih1.U(java.util.ArrayList, org.telegram.ui.Components.k61):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.w51 w51Var, View view) {
        eh1 eh1Var = this.f34523f;
        int i10 = w51Var.d;
        if (i10 == 1) {
            eh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f34525r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new ld(org.telegram.ui.Cells.c1.g(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (w51Var.f15715a == 12) {
            finishFragment();
            eh1Var.run(getMessagesController().getChat(Long.valueOf(-w51Var.f29906x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.w51 w51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.e2(this, 19);
        this.f34524n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f34524n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f34524n.setVisibility(8);
        super.createView(context);
        this.f26682a.p1();
        this.actionBar.setAdaptiveBackground(this.f26682a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f34525r) {
            gh1 gh1Var = this.d;
            gh1Var.f33946c = false;
            gh1Var.f33947f.add(new hh1(this, 0));
            this.f34525r = false;
        }
    }
}

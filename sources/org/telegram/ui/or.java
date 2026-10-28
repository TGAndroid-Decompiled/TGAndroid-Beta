package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class or extends org.telegram.ui.Components.n71 {
    public final lg1 e;
    public final long f42178f;
    public final jg1 h;
    public String f42179n;
    public org.telegram.ui.ActionBar.y5 f42180r;
    public boolean f42181s = false;

    public or(lg1 lg1Var, long j10, jg1 jg1Var) {
        this.e = lg1Var;
        this.f42178f = j10;
        this.h = jg1Var;
        nr nrVar = new nr(this, 0);
        if (lg1Var.f41152c) {
            nrVar.run();
        } else {
            lg1Var.f41153f.add(nrVar);
        }
    }

    @Override
    public final void V(java.util.ArrayList r18, org.telegram.ui.Components.k71 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.or.V(java.util.ArrayList, org.telegram.ui.Components.k71):void");
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void X(org.telegram.ui.Components.u61 u61Var, View view) {
        int i10 = u61Var.d;
        jg1 jg1Var = this.h;
        if (i10 == 1) {
            jg1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f42181s = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new nd(org.telegram.ui.Components.b10.g(0, "step")));
                return;
            }
            presentFragment(new g(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (u61Var.f47075a == 12) {
            finishFragment();
            jg1Var.run(getMessagesController().getChat(Long.valueOf(-u61Var.f33260x)));
        }
    }

    @Override
    public final boolean Y(org.telegram.ui.Components.u61 u61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.x5 j10 = this.simpleActionBar.j();
        int i10 = R.drawable.outline_header_search;
        getResourceProvider();
        org.telegram.ui.ActionBar.y5 a2 = j10.a(0, i10);
        a2.N();
        a2.f23292z0 = new jg.e2(this, 4);
        this.f42180r = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f42180r.setContentDescription(LocaleController.getString(R.string.Search));
        this.f42180r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f30764a.u1();
        this.f30764a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.nm0 getListViewForSimpleGlass() {
        return this.f30764a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f42181s) {
            lg1 lg1Var = this.e;
            lg1Var.f41152c = false;
            lg1Var.f41153f.add(new nr(this, 1));
            this.f42181s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class mr extends org.telegram.ui.Components.m71 {
    public final jg1 e;
    public final long f41646f;
    public final hg1 h;
    public String f41647n;
    public org.telegram.ui.ActionBar.y5 f41648r;
    public boolean f41649s = false;

    public mr(jg1 jg1Var, long j10, hg1 hg1Var) {
        this.e = jg1Var;
        this.f41646f = j10;
        this.h = hg1Var;
        lr lrVar = new lr(this, 0);
        if (jg1Var.f40636c) {
            lrVar.run();
        } else {
            jg1Var.f40637f.add(lrVar);
        }
    }

    @Override
    public final void V(java.util.ArrayList r18, org.telegram.ui.Components.j71 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.mr.V(java.util.ArrayList, org.telegram.ui.Components.j71):void");
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void X(org.telegram.ui.Components.t61 t61Var, View view) {
        int i10 = t61Var.d;
        hg1 hg1Var = this.h;
        if (i10 == 1) {
            hg1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f41649s = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new nd(org.telegram.ui.Components.b10.g(0, "step")));
                return;
            }
            presentFragment(new g(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (t61Var.f47040a == 12) {
            finishFragment();
            hg1Var.run(getMessagesController().getChat(Long.valueOf(-t61Var.f32886x)));
        }
    }

    @Override
    public final boolean Y(org.telegram.ui.Components.t61 t61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.x5 j10 = this.simpleActionBar.j();
        int i10 = R.drawable.outline_header_search;
        getResourceProvider();
        org.telegram.ui.ActionBar.y5 a2 = j10.a(0, i10);
        a2.N();
        a2.f23291z0 = new jg.e2(this, 4);
        this.f41648r = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f41648r.setContentDescription(LocaleController.getString(R.string.Search));
        this.f41648r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.f30419a.u1();
        this.f30419a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f30419a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f41649s) {
            jg1 jg1Var = this.e;
            jg1Var.f40636c = false;
            jg1Var.f40637f.add(new lr(this, 1));
            this.f41649s = false;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

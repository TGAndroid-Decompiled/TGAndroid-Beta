package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class eh1 extends org.telegram.ui.Components.b61 {
    public ch1 d;
    public long e;
    public ah1 f33817f;
    public String h;
    public org.telegram.ui.ActionBar.w0 f33818n;
    public boolean f33819r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.w51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eh1.U(java.util.ArrayList, org.telegram.ui.Components.w51):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.i51 i51Var, View view) {
        ah1 ah1Var = this.f33817f;
        int i10 = i51Var.d;
        if (i10 == 1) {
            ah1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f33819r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new pd(android.support.v4.media.a.h(0, "step")));
                return;
            }
            presentFragment(new i(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (i51Var.f1830a == 12) {
            finishFragment();
            ah1Var.run(getMessagesController().getChat(Long.valueOf(-i51Var.f25596x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.i51 i51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.E = new hb(this, 18);
        this.f33818n = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f33818n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f33818n.setVisibility(8);
        super.createView(context);
        this.f23568a.o1();
        this.actionBar.setAdaptiveBackground(this.f23568a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f33819r) {
            ch1 ch1Var = this.d;
            ch1Var.f33157c = false;
            ch1Var.f33158f.add(new dh1(this, 0));
            this.f33819r = false;
        }
    }
}

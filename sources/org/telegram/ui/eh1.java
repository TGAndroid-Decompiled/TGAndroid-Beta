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
    public long f36499e;
    public zg1 f36500f;
    public String h;
    public org.telegram.ui.ActionBar.w0 f36501n;
    public boolean f36502r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.w51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eh1.U(java.util.ArrayList, org.telegram.ui.Components.w51):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.h51 h51Var, View view) {
        zg1 zg1Var = this.f36500f;
        int i10 = h51Var.d;
        if (i10 == 1) {
            zg1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f36502r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new nd(android.support.v4.media.a.h(0, "step")));
                return;
            }
            presentFragment(new i(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (h51Var.f2505a == 12) {
            finishFragment();
            zg1Var.run(getMessagesController().getChat(Long.valueOf(-h51Var.f27386x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.h51 h51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.E = new fb(this, 18);
        this.f36501n = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f36501n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f36501n.setVisibility(8);
        super.createView(context);
        this.f25523a.o1();
        this.actionBar.setAdaptiveBackground(this.f25523a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f36502r) {
            ch1 ch1Var = this.d;
            ch1Var.f35811c = false;
            ch1Var.f35813f.add(new dh1(this, 0));
            this.f36502r = false;
        }
    }
}

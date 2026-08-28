package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ig1 extends org.telegram.ui.Components.d51 {
    public gg1 d;
    public long f39151e;
    public eg1 f39152f;
    public String h;
    public org.telegram.ui.ActionBar.w0 f39153n;
    public boolean f39154r;

    @Override
    public final void T(java.util.ArrayList r18, org.telegram.ui.Components.z41 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ig1.T(java.util.ArrayList, org.telegram.ui.Components.z41):void");
    }

    @Override
    public final CharSequence U() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void V(org.telegram.ui.Components.l41 l41Var, View view) {
        eg1 eg1Var = this.f39152f;
        int i9 = l41Var.d;
        if (i9 == 1) {
            eg1Var.run(null);
            finishFragment();
        } else if (i9 == 2) {
            this.f39154r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new id(aa.d.h(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (l41Var.f48814a == 12) {
            finishFragment();
            eg1Var.run(getMessagesController().getChat(Long.valueOf(-l41Var.f30350x)));
        }
    }

    @Override
    public final boolean W(org.telegram.ui.Components.l41 l41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.D = new cb(this, 18);
        this.f39153n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f39153n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f39153n.setVisibility(8);
        super.createView(context);
        this.f27658a.p1();
        this.actionBar.setAdaptiveBackground(this.f27658a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f39154r) {
            gg1 gg1Var = this.d;
            gg1Var.f38541c = false;
            gg1Var.f38543f.add(new hg1(this, 0));
            this.f39154r = false;
        }
    }
}

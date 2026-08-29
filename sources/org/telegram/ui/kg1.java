package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class kg1 extends org.telegram.ui.Components.p51 {
    public ig1 d;
    public long f39863e;
    public gg1 f39864f;
    public String h;
    public org.telegram.ui.ActionBar.w0 f39865n;
    public boolean f39866r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.k51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kg1.U(java.util.ArrayList, org.telegram.ui.Components.k51):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.w41 w41Var, View view) {
        gg1 gg1Var = this.f39864f;
        int i10 = w41Var.d;
        if (i10 == 1) {
            gg1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f39866r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new hd(a4.w.h(0, "step")));
                return;
            }
            presentFragment(new i(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (w41Var.f50845a == 12) {
            finishFragment();
            gg1Var.run(getMessagesController().getChat(Long.valueOf(-w41Var.f34311x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.w41 w41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.D = new bb(this, 18);
        this.f39865n = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f39865n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f39865n.setVisibility(8);
        super.createView(context);
        this.f31601a.p1();
        this.actionBar.setAdaptiveBackground(this.f31601a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f39866r) {
            ig1 ig1Var = this.d;
            ig1Var.f39263c = false;
            ig1Var.f39265f.add(new jg1(this, 0));
            this.f39866r = false;
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class qh1 extends org.telegram.ui.Components.h71 {
    public oh1 d;
    public long f41185e;
    public mh1 f41186f;
    public String h;
    public org.telegram.ui.ActionBar.u0 f41187n;
    public boolean f41188r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.e71 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qh1.U(java.util.ArrayList, org.telegram.ui.Components.e71):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.r61 r61Var, View view) {
        mh1 mh1Var = this.f41186f;
        int i10 = r61Var.d;
        if (i10 == 1) {
            mh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f41188r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new ld(org.telegram.ui.Cells.c1.f(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (r61Var.f17175a == 12) {
            finishFragment();
            mh1Var.run(getMessagesController().getChat(Long.valueOf(-r61Var.f30372x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.r61 r61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.o().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.e2(this, 19);
        this.f41187n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f41187n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f41187n.setVisibility(8);
        super.createView(context);
        this.f26922a.p1();
        this.actionBar.setAdaptiveBackground(this.f26922a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f41188r) {
            oh1 oh1Var = this.d;
            oh1Var.f40549c = false;
            oh1Var.f40551f.add(new ph1(this, 0));
            this.f41188r = false;
        }
    }
}

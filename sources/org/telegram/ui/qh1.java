package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class qh1 extends org.telegram.ui.Components.z51 {
    public oh1 d;
    public long e;
    public mh1 f36884f;
    public String h;
    public org.telegram.ui.ActionBar.v0 f36885n;
    public boolean f36886r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.w51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qh1.U(java.util.ArrayList, org.telegram.ui.Components.w51):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.i51 i51Var, View view) {
        mh1 mh1Var = this.f36884f;
        int i10 = i51Var.d;
        if (i10 == 1) {
            mh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f36886r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new ld(org.telegram.ui.Cells.q3.e(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (i51Var.f15531a == 12) {
            finishFragment();
            mh1Var.run(getMessagesController().getChat(Long.valueOf(-i51Var.f24911x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.i51 i51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.e2(this, 19);
        this.f36885n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f36885n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f36885n.setVisibility(8);
        super.createView(context);
        this.f30482a.p1();
        this.actionBar.setAdaptiveBackground(this.f30482a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f36886r) {
            oh1 oh1Var = this.d;
            oh1Var.f36229c = false;
            oh1Var.f36230f.add(new ph1(this, 0));
            this.f36886r = false;
        }
    }
}

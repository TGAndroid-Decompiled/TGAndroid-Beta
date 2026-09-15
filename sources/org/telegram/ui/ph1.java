package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class ph1 extends org.telegram.ui.Components.z51 {
    public nh1 e;
    public long f36591f;
    public lh1 h;
    public String f36592n;
    public org.telegram.ui.ActionBar.v0 f36593r;
    public boolean f36594s;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.w51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ph1.U(java.util.ArrayList, org.telegram.ui.Components.w51):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.i51 i51Var, View view) {
        lh1 lh1Var = this.h;
        int i10 = i51Var.d;
        if (i10 == 1) {
            lh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f36594s = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new ld(org.telegram.ui.Cells.p6.e(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (i51Var.f15533a == 12) {
            finishFragment();
            lh1Var.run(getMessagesController().getChat(Long.valueOf(-i51Var.f24905x)));
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
        c10.H = new hg.d2(this, 19);
        this.f36593r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f36593r.setContentDescription(LocaleController.getString(R.string.Search));
        this.f36593r.setVisibility(8);
        super.createView(context);
        this.f30485a.p1();
        this.actionBar.setAdaptiveBackground(this.f30485a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f36594s) {
            nh1 nh1Var = this.e;
            nh1Var.f35986c = false;
            nh1Var.f35987f.add(new oh1(this, 0));
            this.f36594s = false;
        }
    }
}

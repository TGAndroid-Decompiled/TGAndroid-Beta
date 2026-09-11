package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
public final class qh1 extends org.telegram.ui.Components.y51 {
    public oh1 d;
    public long f39878e;
    public mh1 f39879f;
    public String h;
    public org.telegram.ui.ActionBar.v0 f39880n;
    public boolean f39881r;

    @Override
    public final void U(java.util.ArrayList r18, org.telegram.ui.Components.v51 r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qh1.U(java.util.ArrayList, org.telegram.ui.Components.v51):void");
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.h51 h51Var, View view) {
        mh1 mh1Var = this.f39879f;
        int i10 = h51Var.d;
        if (i10 == 1) {
            mh1Var.run(null);
            finishFragment();
        } else if (i10 == 2) {
            this.f39881r = true;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
                presentFragment(new md(org.telegram.ui.Cells.p6.e(0, "step")));
                return;
            }
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        } else if (h51Var.f44071a == 12) {
            finishFragment();
            mh1Var.run(getMessagesController().getChat(Long.valueOf(-h51Var.f26605x)));
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.h51 h51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new ig.d2(this, 19);
        this.f39880n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f39880n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f39880n.setVisibility(8);
        super.createView(context);
        this.f32849a.o1();
        this.actionBar.setAdaptiveBackground(this.f32849a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f39881r) {
            oh1 oh1Var = this.d;
            oh1Var.f39253c = false;
            oh1Var.f39255f.add(new ph1(this, 0));
            this.f39881r = false;
        }
    }
}

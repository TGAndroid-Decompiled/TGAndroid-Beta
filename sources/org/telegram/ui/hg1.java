package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class hg1 extends org.telegram.ui.Components.f51 {
    public fg1 d;

    public long f38815e;

    public dg1 f38816f;
    public String h;

    public org.telegram.ui.ActionBar.v0 f38817n;

    public boolean f38818r;

    @Override
    public final void U(ArrayList arrayList, org.telegram.ui.Components.b51 b51Var) {
        CharSequence charSequence;
        long j10;
        boolean z10;
        long j11 = this.f38815e;
        CharSequence charSequence2 = null;
        if (TextUtils.isEmpty(this.h) && j11 != 0) {
            org.telegram.ui.Components.n41 n41VarC = org.telegram.ui.Components.n41.c(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide));
            n41VarC.f30850r = true;
            arrayList.add(n41VarC);
            arrayList.add(org.telegram.ui.Components.n41.B(null));
        }
        if (TextUtils.isEmpty(this.h)) {
            org.telegram.ui.Cells.pa.o(R.string.EditProfileChannelSelect, arrayList);
        }
        ArrayList arrayList2 = this.d.f38131e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat == null || ChatObject.isMegagroup(chat)) {
                charSequence = charSequence2;
            } else {
                i10++;
                if (TextUtils.isEmpty(this.h)) {
                    charSequence = charSequence2;
                    j10 = chat.f22380id;
                    org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(11);
                    n41Var.f30854w = true;
                    n41Var.f30855x = -j10;
                    if (j11 == j10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n41Var.K(z10);
                    arrayList.add(n41Var);
                } else {
                    String lowerCase = this.h.toLowerCase();
                    String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String strTranslitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (lowerCase2.startsWith(lowerCase)) {
                        charSequence = charSequence2;
                    } else {
                        charSequence = charSequence2;
                        if (org.telegram.messenger.y1.x(" ", lowerCase, lowerCase2) || strTranslitSafe2.startsWith(strTranslitSafe) || org.telegram.messenger.y1.x(" ", strTranslitSafe, strTranslitSafe2)) {
                        }
                    }
                    j10 = chat.f22380id;
                    org.telegram.ui.Components.n41 n41Var2 = new org.telegram.ui.Components.n41(11);
                    n41Var2.f30854w = true;
                    n41Var2.f30855x = -j10;
                    if (j11 == j10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    n41Var2.K(z10);
                    arrayList.add(n41Var2);
                }
            }
            charSequence2 = charSequence;
        }
        CharSequence charSequence3 = charSequence2;
        if (TextUtils.isEmpty(this.h) && i10 == 0) {
            org.telegram.ui.Components.n41 n41VarC2 = org.telegram.ui.Components.n41.c(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew));
            n41VarC2.f30849q = true;
            arrayList.add(n41VarC2);
        }
        arrayList.add(org.telegram.ui.Components.n41.B(charSequence3));
        org.telegram.ui.ActionBar.v0 v0Var = this.f38817n;
        if (v0Var != null) {
            v0Var.setVisibility(i10 <= 5 ? 8 : 0);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override
    public final void W(org.telegram.ui.Components.n41 n41Var, View view) {
        dg1 dg1Var = this.f38816f;
        int i10 = n41Var.d;
        if (i10 == 1) {
            dg1Var.run(null);
            finishFragment();
            return;
        }
        if (i10 != 2) {
            if (n41Var.f49413a == 12) {
                finishFragment();
                dg1Var.run(getMessagesController().getChat(Long.valueOf(-n41Var.f30855x)));
                return;
            }
            return;
        }
        this.f38818r = true;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
            presentFragment(new id(a9.p.g(0, "step")));
        } else {
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        }
    }

    @Override
    public final boolean X(org.telegram.ui.Components.n41 n41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 v0VarC = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        v0VarC.F();
        v0VarC.D = new db(this, 18);
        this.f38817n = v0VarC;
        v0VarC.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.f38817n.setContentDescription(LocaleController.getString(R.string.Search));
        this.f38817n.setVisibility(8);
        super.createView(context);
        this.f28261a.p1();
        this.actionBar.setAdaptiveBackground(this.f28261a);
        return this.fragmentView;
    }

    @Override
    public final void onResume() {
        super.onResume();
        if (this.f38818r) {
            fg1 fg1Var = this.d;
            fg1Var.f38130c = false;
            fg1Var.f38132f.add(new gg1(this, 0));
            this.f38818r = false;
        }
    }
}

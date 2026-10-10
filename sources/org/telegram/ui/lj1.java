package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lj1 extends org.telegram.ui.Components.qm0 {
    public final WallpapersListActivity E;
    public final Context f39655c;
    public final ArrayList d = new ArrayList();
    public final HashMap f39656e = new HashMap();
    public boolean f39657f = true;
    public String h;
    public String f39658n;
    public String f39659r;
    public int f39660s;
    public int v;
    public boolean f39661w;
    public String f39662x;
    public ii1 f39663y;

    public lj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f39655c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47706f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.f39658n != null) {
            str = a1.g.r(this.f39658n, " ", str, new StringBuilder("#color"));
        }
        ii1 ii1Var = this.f39663y;
        if (ii1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ii1Var);
            this.f39663y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f39656e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f39657f = true;
            this.h = null;
            if (this.f39660s != 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.f39660s, true);
                this.f39660s = 0;
            }
            wallpapersListActivity.N.c();
        } else {
            wallpapersListActivity.N.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f39657f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                ii1 ii1Var2 = new ii1(21, this, str);
                this.f39663y = ii1Var2;
                AndroidUtilities.runOnUIThread(ii1Var2, 500L);
            }
        }
        l();
    }

    public final void F(String str, String str2, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = this.f39660s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.f39660s, true);
            this.f39660s = 0;
        }
        this.f39662x = str;
        i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z10 && !this.f39661w) {
                this.f39661w = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i16 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i16).imageSearchBot;
                i17 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new m(this, 25));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = sc.v.i("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        this.f39660s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new ai.j8(this, i20, 7));
        i14 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.f39660s;
        i15 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i21, i15);
    }

    @Override
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.E.R);
    }

    @Override
    public final int j(int i10) {
        if (TextUtils.isEmpty(this.h)) {
            if (i10 == 0) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        Object obj;
        int i11 = d1Var.f47706f;
        View view = d1Var.f47702a;
        if (i11 != 0) {
            if (i11 == 2) {
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.SearchByColor));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.cb cbVar = (org.telegram.ui.Cells.cb) view;
        WallpapersListActivity wallpapersListActivity = this.E;
        int i12 = i10 * wallpapersListActivity.R;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.R);
        int i13 = wallpapersListActivity.R;
        boolean z11 = true;
        if (i12 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 / i13 != ceil - 1) {
            z11 = false;
        }
        cbVar.d(i13, z10, z11);
        for (int i14 = 0; i14 < wallpapersListActivity.R; i14++) {
            int i15 = i12 + i14;
            if (i15 < arrayList.size()) {
                obj = arrayList.get(i15);
            } else {
                obj = null;
            }
            cbVar.e(wallpapersListActivity.v, obj, "", i14);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout mjVar;
        FrameLayout frameLayout;
        Context context = this.f39655c;
        if (i10 != 0) {
            mjVar = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    frameLayout = new org.telegram.ui.Cells.v3(context, null);
                }
            } else {
                ?? fc1Var = new fc1(context, 13, null);
                fc1Var.setItemAnimator(null);
                fc1Var.setLayoutAnimation(null);
                gg.a0 a0Var = new gg.a0(20);
                fc1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                fc1Var.setClipToPadding(false);
                a0Var.j1(0);
                fc1Var.setLayoutManager(a0Var);
                fc1Var.setAdapter(new gg.m0(this, 4));
                fc1Var.setOnItemClickListener(new z21(this, 14));
                frameLayout = fc1Var;
            }
            mjVar = frameLayout;
        } else {
            mjVar = new org.telegram.ui.Components.mj(this, context, 2);
        }
        if (i10 == 1) {
            mjVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            mjVar.setLayoutParams(new s4.q0(-1, -2));
        }
        return new s4.d1(mjVar);
    }
}

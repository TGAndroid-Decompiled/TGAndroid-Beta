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
public final class bj1 extends org.telegram.ui.Components.vl0 {
    public final WallpapersListActivity E;
    public final Context f32437c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f32438f = true;
    public String h;
    public String f32439n;
    public String f32440r;
    public int f32441s;
    public int v;
    public boolean f32442w;
    public String f32443x;
    public p81 f32444y;

    public bj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f32437c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42963f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.f32439n != null) {
            str = a4.a.r(this.f32439n, " ", str, new StringBuilder("#color"));
        }
        p81 p81Var = this.f32444y;
        if (p81Var != null) {
            AndroidUtilities.cancelRunOnUIThread(p81Var);
            this.f32444y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f32438f = true;
            this.h = null;
            if (this.f32441s != 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.f32441s, true);
                this.f32441s = 0;
            }
            wallpapersListActivity.N.c();
        } else {
            wallpapersListActivity.N.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f32438f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                p81 p81Var2 = new p81(23, this, str);
                this.f32444y = p81Var2;
                AndroidUtilities.runOnUIThread(p81Var2, 500L);
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
        int i19 = this.f32441s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.f32441s, true);
            this.f32441s = 0;
        }
        this.f32443x = str;
        i10 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z10 && !this.f32442w) {
                this.f32442w = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i16 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i16).imageSearchBot;
                i17 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new m(this, 25));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = v7.j.g("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        this.f32441s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new ai.i8(this, i20, 7));
        i14 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.f32441s;
        i15 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).classGuid;
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
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        Object obj;
        int i11 = c1Var.f42963f;
        View view = c1Var.f42960a;
        if (i11 != 0) {
            if (i11 == 2) {
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.SearchByColor));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.eb ebVar = (org.telegram.ui.Cells.eb) view;
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
        ebVar.d(i13, z10, z11);
        for (int i14 = 0; i14 < wallpapersListActivity.R; i14++) {
            int i15 = i12 + i14;
            if (i15 < arrayList.size()) {
                obj = arrayList.get(i15);
            } else {
                obj = null;
            }
            ebVar.e(wallpapersListActivity.v, obj, "", i14);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout jjVar;
        FrameLayout frameLayout;
        Context context = this.f32437c;
        if (i10 != 0) {
            jjVar = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    frameLayout = new org.telegram.ui.Cells.v3(context, null);
                }
            } else {
                ?? wb1Var = new wb1(context, 13, null);
                wb1Var.setItemAnimator(null);
                wb1Var.setLayoutAnimation(null);
                gg.b0 b0Var = new gg.b0(20);
                wb1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                wb1Var.setClipToPadding(false);
                b0Var.j1(0);
                wb1Var.setLayoutManager(b0Var);
                wb1Var.setAdapter(new gg.n0(this, 4));
                wb1Var.setOnItemClickListener(new r21(this, 14));
                frameLayout = wb1Var;
            }
            jjVar = frameLayout;
        } else {
            jjVar = new org.telegram.ui.Components.jj(this, context, 2);
        }
        if (i10 == 1) {
            jjVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            jjVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(jjVar);
    }
}

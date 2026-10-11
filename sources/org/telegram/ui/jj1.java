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
public final class jj1 extends org.telegram.ui.Components.rm0 {
    public final WallpapersListActivity E;
    public final Context f39070c;
    public final ArrayList d = new ArrayList();
    public final HashMap f39071e = new HashMap();
    public boolean f39072f = true;
    public String h;
    public String f39073n;
    public String f39074r;
    public int f39075s;
    public int v;
    public boolean f39076w;
    public String f39077x;
    public org.telegram.ui.Wallet.i f39078y;

    public jj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f39070c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47752f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.f39073n != null) {
            str = a1.g.r(this.f39073n, " ", str, new StringBuilder("#color"));
        }
        org.telegram.ui.Wallet.i iVar = this.f39078y;
        if (iVar != null) {
            AndroidUtilities.cancelRunOnUIThread(iVar);
            this.f39078y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f39071e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f39072f = true;
            this.h = null;
            if (this.f39075s != 0) {
                i10 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.f39075s, true);
                this.f39075s = 0;
            }
            wallpapersListActivity.N.c();
        } else {
            wallpapersListActivity.N.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f39072f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                org.telegram.ui.Wallet.i iVar2 = new org.telegram.ui.Wallet.i(20, this, str);
                this.f39078y = iVar2;
                AndroidUtilities.runOnUIThread(iVar2, 500L);
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
        int i19 = this.f39075s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.f39075s, true);
            this.f39075s = 0;
        }
        this.f39077x = str;
        i10 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z10 && !this.f39076w) {
                this.f39076w = true;
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
        tL_messages_getInlineBotResults.query = sc.v.i("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        this.f39075s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new ai.j8(this, i20, 7));
        i14 = ((org.telegram.ui.ActionBar.m2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.f39075s;
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        Object obj;
        int i11 = d1Var.f47752f;
        View view = d1Var.f47748a;
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
        Context context = this.f39070c;
        if (i10 != 0) {
            mjVar = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    frameLayout = new org.telegram.ui.Cells.v3(context, null);
                }
            } else {
                ?? ec1Var = new ec1(context, 13, null);
                ec1Var.setItemAnimator(null);
                ec1Var.setLayoutAnimation(null);
                gg.a0 a0Var = new gg.a0(20);
                ec1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                ec1Var.setClipToPadding(false);
                a0Var.j1(0);
                ec1Var.setLayoutManager(a0Var);
                ec1Var.setAdapter(new gg.m0(this, 4));
                ec1Var.setOnItemClickListener(new y21(this, 14));
                frameLayout = ec1Var;
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

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
public final class ei1 extends org.telegram.ui.Components.lm0 {
    public final WallpapersListActivity E;
    public final Context f39114c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f39115f = true;
    public String h;
    public String f39116n;
    public String f39117r;
    public int f39118s;
    public int v;
    public boolean f39119w;
    public String f39120x;
    public org.telegram.ui.Wallet.q6 f39121y;

    public ei1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f39114c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.f39116n != null) {
            str = a1.g.q(this.f39116n, " ", str, new StringBuilder("#color"));
        }
        org.telegram.ui.Wallet.q6 q6Var = this.f39121y;
        if (q6Var != null) {
            AndroidUtilities.cancelRunOnUIThread(q6Var);
            this.f39121y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f39115f = true;
            this.h = null;
            if (this.f39118s != 0) {
                i10 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.f39118s, true);
                this.f39118s = 0;
            }
            wallpapersListActivity.K.c();
        } else {
            wallpapersListActivity.K.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f39115f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                org.telegram.ui.Wallet.q6 q6Var2 = new org.telegram.ui.Wallet.q6(8, this, str);
                this.f39121y = q6Var2;
                AndroidUtilities.runOnUIThread(q6Var2, 500L);
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
        int i19 = this.f39118s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.f39118s, true);
            this.f39118s = 0;
        }
        this.f39120x = str;
        i10 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z10 && !this.f39119w) {
                this.f39119w = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i16 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i16).imageSearchBot;
                i17 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new l(this, 26));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = org.telegram.ui.Components.b10.j("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
        this.f39118s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new bi.l2(this, i20, 9));
        i14 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.f39118s;
        i15 = ((org.telegram.ui.ActionBar.r2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i21, i15);
    }

    @Override
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.E.N);
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
    public final void v(s4.e1 e1Var, int i10) {
        boolean z10;
        Object obj;
        int i11 = e1Var.f47738f;
        View view = e1Var.f47735a;
        if (i11 != 0) {
            if (i11 == 2) {
                ((org.telegram.ui.Cells.z3) view).setText(LocaleController.getString(R.string.SearchByColor));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) view;
        WallpapersListActivity wallpapersListActivity = this.E;
        int i12 = i10 * wallpapersListActivity.N;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.N);
        int i13 = wallpapersListActivity.N;
        boolean z11 = true;
        if (i12 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i12 / i13 != ceil - 1) {
            z11 = false;
        }
        fbVar.d(i13, z10, z11);
        for (int i14 = 0; i14 < wallpapersListActivity.N; i14++) {
            int i15 = i12 + i14;
            if (i15 < arrayList.size()) {
                obj = arrayList.get(i15);
            } else {
                obj = null;
            }
            fbVar.e(wallpapersListActivity.f37595r, obj, "", i14);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout hjVar;
        FrameLayout frameLayout;
        Context context = this.f39114c;
        if (i10 != 0) {
            hjVar = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    frameLayout = new org.telegram.ui.Cells.z3(context, null);
                }
            } else {
                ?? za1Var = new za1(context, 13, null);
                za1Var.setItemAnimator(null);
                za1Var.setLayoutAnimation(null);
                ig.a0 a0Var = new ig.a0(20);
                za1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                za1Var.setClipToPadding(false);
                a0Var.k1(0);
                za1Var.setLayoutManager(a0Var);
                za1Var.setAdapter(new bi.h5(this, 5));
                za1Var.setOnItemClickListener(new m11(this, 14));
                frameLayout = za1Var;
            }
            hjVar = frameLayout;
        } else {
            hjVar = new org.telegram.ui.Components.hj(this, context, 2);
            hjVar.setTag(-33024);
        }
        if (i10 == 1) {
            hjVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            hjVar.setLayoutParams(new s4.q0(-1, -2));
        }
        return new s4.e1(hjVar);
    }
}

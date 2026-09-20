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
public final class ij1 extends org.telegram.ui.Components.ul0 {
    public final WallpapersListActivity E;
    public final Context f34596c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f34597f = true;
    public String h;
    public String f34598n;
    public String f34599r;
    public int f34600s;
    public int v;
    public boolean f34601w;
    public String f34602x;
    public w81 f34603y;

    public ij1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f34596c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42977f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.f34598n != null) {
            str = a4.a.q(this.f34598n, " ", str, new StringBuilder("#color"));
        }
        w81 w81Var = this.f34603y;
        if (w81Var != null) {
            AndroidUtilities.cancelRunOnUIThread(w81Var);
            this.f34603y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f34597f = true;
            this.h = null;
            if (this.f34600s != 0) {
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.f34600s, true);
                this.f34600s = 0;
            }
            wallpapersListActivity.L.c();
        } else {
            wallpapersListActivity.L.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f34597f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                w81 w81Var2 = new w81(24, this, str);
                this.f34603y = w81Var2;
                AndroidUtilities.runOnUIThread(w81Var2, 500L);
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
        int i19 = this.f34600s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.f34600s, true);
            this.f34600s = 0;
        }
        this.f34602x = str;
        i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z10 && !this.f34601w) {
                this.f34601w = true;
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
        tL_messages_getInlineBotResults.query = v7.j0.g("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        this.f34600s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new ai.g8(this, i20, 7));
        i14 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.f34600s;
        i15 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i21, i15);
    }

    @Override
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.E.P);
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
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        if (i11 != 0) {
            if (i11 == 2) {
                ((org.telegram.ui.Cells.w3) view).setText(LocaleController.getString(R.string.SearchByColor));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.fb fbVar = (org.telegram.ui.Cells.fb) view;
        WallpapersListActivity wallpapersListActivity = this.E;
        int i12 = i10 * wallpapersListActivity.P;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.P);
        int i13 = wallpapersListActivity.P;
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
        for (int i14 = 0; i14 < wallpapersListActivity.P; i14++) {
            int i15 = i12 + i14;
            if (i15 < arrayList.size()) {
                obj = arrayList.get(i15);
            } else {
                obj = null;
            }
            fbVar.e(wallpapersListActivity.f31919r, obj, "", i14);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout ijVar;
        FrameLayout frameLayout;
        Context context = this.f34596c;
        if (i10 != 0) {
            ijVar = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    frameLayout = new org.telegram.ui.Cells.w3(context, null);
                }
            } else {
                ?? fc1Var = new fc1(context, 13, null);
                fc1Var.setItemAnimator(null);
                fc1Var.setLayoutAnimation(null);
                gg.b0 b0Var = new gg.b0(20);
                fc1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                fc1Var.setClipToPadding(false);
                b0Var.j1(0);
                fc1Var.setLayoutManager(b0Var);
                fc1Var.setAdapter(new gg.n0(this, 4));
                fc1Var.setOnItemClickListener(new a31(this, 14));
                frameLayout = fc1Var;
            }
            ijVar = frameLayout;
        } else {
            ijVar = new org.telegram.ui.Components.ij(this, context, 2);
            ijVar.setTag(-33024);
        }
        if (i10 == 1) {
            ijVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            ijVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(ijVar);
    }
}

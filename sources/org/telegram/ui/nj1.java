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
public final class nj1 extends org.telegram.ui.Components.ul0 {
    public final WallpapersListActivity E;
    public final Context f35293c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f35294f = true;
    public String h;
    public String f35295n;
    public String f35296r;
    public int f35297s;
    public int v;
    public boolean f35298w;
    public String f35299x;
    public r91 f35300y;

    public nj1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f35293c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.f35295n != null) {
            str = a4.a.q(this.f35295n, " ", str, new StringBuilder("#color"));
        }
        r91 r91Var = this.f35300y;
        if (r91Var != null) {
            AndroidUtilities.cancelRunOnUIThread(r91Var);
            this.f35300y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f35294f = true;
            this.h = null;
            if (this.f35297s != 0) {
                i10 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.f35297s, true);
                this.f35297s = 0;
            }
            wallpapersListActivity.N.c();
        } else {
            wallpapersListActivity.N.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f35294f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                r91 r91Var2 = new r91(21, this, str);
                this.f35300y = r91Var2;
                AndroidUtilities.runOnUIThread(r91Var2, 500L);
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
        int i19 = this.f35297s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.f35297s, true);
            this.f35297s = 0;
        }
        this.f35299x = str;
        i10 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z10 && !this.f35298w) {
                this.f35298w = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i16 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i16).imageSearchBot;
                i17 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new m(this, 25));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = org.telegram.ui.Cells.r6.i("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
        this.f35297s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new di.k4(this, i20, 5));
        i14 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.f35297s;
        i15 = ((org.telegram.ui.ActionBar.p2) wallpapersListActivity).classGuid;
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
        int i11 = c1Var.f41613f;
        View view = c1Var.f41610a;
        if (i11 != 0) {
            if (i11 == 2) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString(R.string.SearchByColor));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.gb gbVar = (org.telegram.ui.Cells.gb) view;
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
        gbVar.d(i13, z10, z11);
        for (int i14 = 0; i14 < wallpapersListActivity.R; i14++) {
            int i15 = i12 + i14;
            if (i15 < arrayList.size()) {
                obj = arrayList.get(i15);
            } else {
                obj = null;
            }
            gbVar.e(wallpapersListActivity.v, obj, "", i14);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout ljVar;
        FrameLayout frameLayout;
        Context context = this.f35293c;
        if (i10 != 0) {
            ljVar = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    frameLayout = new org.telegram.ui.Cells.u3(context, null);
                }
            } else {
                ?? ic1Var = new ic1(context, 12, null);
                ic1Var.setItemAnimator(null);
                ic1Var.setLayoutAnimation(null);
                fg.a0 a0Var = new fg.a0(20);
                ic1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                ic1Var.setClipToPadding(false);
                a0Var.j1(0);
                ic1Var.setLayoutManager(a0Var);
                ic1Var.setAdapter(new fg.n0(this, 4));
                ic1Var.setOnItemClickListener(new f31(this, 13));
                frameLayout = ic1Var;
            }
            ljVar = frameLayout;
        } else {
            ljVar = new org.telegram.ui.Components.lj(this, context, 2);
        }
        if (i10 == 1) {
            ljVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            ljVar.setLayoutParams(new s4.p0(-1, -2));
        }
        return new s4.c1(ljVar);
    }
}

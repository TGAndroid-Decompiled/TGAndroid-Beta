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
public final class ci1 extends org.telegram.ui.Components.lm0 {
    public final WallpapersListActivity E;
    public final Context f36372c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public boolean f36373f = true;
    public String h;
    public String f36374n;
    public String f36375r;
    public int f36376s;
    public int v;
    public boolean f36377w;
    public String f36378x;
    public org.telegram.ui.Wallet.y3 f36379y;

    public ci1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.E = wallpapersListActivity;
        this.f36372c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f46346f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i10;
        if (str != null && this.f36374n != null) {
            str = a1.g.q(this.f36374n, " ", str, new StringBuilder("#color"));
        }
        org.telegram.ui.Wallet.y3 y3Var = this.f36379y;
        if (y3Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y3Var);
            this.f36379y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f36373f = true;
            this.h = null;
            if (this.f36376s != 0) {
                i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i10).cancelRequest(this.f36376s, true);
                this.f36376s = 0;
            }
            wallpapersListActivity.N.c();
        } else {
            wallpapersListActivity.N.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f36373f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                org.telegram.ui.Wallet.y3 y3Var2 = new org.telegram.ui.Wallet.y3(18, this, str);
                this.f36379y = y3Var2;
                AndroidUtilities.runOnUIThread(y3Var2, 500L);
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
        int i19 = this.f36376s;
        WallpapersListActivity wallpapersListActivity = this.E;
        if (i19 != 0) {
            i18 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i18).cancelRequest(this.f36376s, true);
            this.f36376s = 0;
        }
        this.f36378x = str;
        i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i10);
        i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i11).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z10 && !this.f36377w) {
                this.f36377w = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i16 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i16).imageSearchBot;
                i17 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i17).sendRequest(tL_contacts_resolveUsername, new l(this, 26));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = si.o0.h("#wallpaper ", str);
        i12 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i12).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i20 = this.v + 1;
        this.v = i20;
        i13 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        this.f36376s = ConnectionsManager.getInstance(i13).sendRequest(tL_messages_getInlineBotResults, new ai.n2(this, i20, 9));
        i14 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i14);
        int i21 = this.f36376s;
        i15 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).classGuid;
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
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        Object obj;
        int i11 = b1Var.f46346f;
        View view = b1Var.f46343a;
        if (i11 != 0) {
            if (i11 == 2) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString(R.string.SearchByColor));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
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
        bbVar.d(i13, z10, z11);
        for (int i14 = 0; i14 < wallpapersListActivity.R; i14++) {
            int i15 = i12 + i14;
            if (i15 < arrayList.size()) {
                obj = arrayList.get(i15);
            } else {
                obj = null;
            }
            bbVar.e(wallpapersListActivity.v, obj, "", i14);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout hjVar;
        FrameLayout frameLayout;
        Context context = this.f36372c;
        if (i10 != 0) {
            hjVar = null;
            if (i10 != 1) {
                if (i10 == 2) {
                    frameLayout = new org.telegram.ui.Cells.u3(context, null);
                }
            } else {
                ?? xa1Var = new xa1(context, 13, null);
                xa1Var.setItemAnimator(null);
                xa1Var.setLayoutAnimation(null);
                hg.a0 a0Var = new hg.a0(20);
                xa1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                xa1Var.setClipToPadding(false);
                a0Var.j1(0);
                xa1Var.setLayoutManager(a0Var);
                xa1Var.setAdapter(new ai.m5(this, 5));
                xa1Var.setOnItemClickListener(new j11(this, 14));
                frameLayout = xa1Var;
            }
            hjVar = frameLayout;
        } else {
            hjVar = new org.telegram.ui.Components.hj(this, context, 2);
        }
        if (i10 == 1) {
            hjVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            hjVar.setLayoutParams(new s4.o0(-1, -2));
        }
        return new s4.b1(hjVar);
    }
}

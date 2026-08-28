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
public final class bi1 extends org.telegram.ui.Components.vk0 {
    public final WallpapersListActivity A;
    public final Context f36867c;
    public final ArrayList d = new ArrayList();
    public final HashMap f36868e = new HashMap();
    public boolean f36869f = true;
    public String h;
    public String f36870n;
    public String f36871r;
    public int f36872s;
    public int v;
    public boolean f36873w;
    public String f36874x;
    public ai1 f36875y;

    public bi1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.A = wallpapersListActivity;
        this.f36867c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str, boolean z10) {
        int i9;
        if (str != null && this.f36870n != null) {
            str = aa.d.p(this.f36870n, " ", str, new StringBuilder("#color"));
        }
        ai1 ai1Var = this.f36875y;
        if (ai1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(ai1Var);
            this.f36875y = null;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        HashMap hashMap = this.f36868e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.A;
        if (isEmpty) {
            arrayList.clear();
            hashMap.clear();
            this.f36869f = true;
            this.h = null;
            if (this.f36872s != 0) {
                i9 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i9).cancelRequest(this.f36872s, true);
                this.f36872s = 0;
            }
            wallpapersListActivity.J.c();
        } else {
            wallpapersListActivity.J.b();
            if (z10) {
                arrayList.clear();
                hashMap.clear();
                this.f36869f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                ai1 ai1Var2 = new ai1(0, this, str);
                this.f36875y = ai1Var2;
                AndroidUtilities.runOnUIThread(ai1Var2, 500L);
            }
        }
        l();
    }

    public final void F(String str, String str2, boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = this.f36872s;
        WallpapersListActivity wallpapersListActivity = this.A;
        if (i18 != 0) {
            i17 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
            ConnectionsManager.getInstance(i17).cancelRequest(this.f36872s, true);
            this.f36872s = 0;
        }
        this.f36874x = str;
        i9 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i9);
        i10 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        TLObject userOrChat = messagesController.getUserOrChat(MessagesController.getInstance(i10).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (z10 && !this.f36873w) {
                this.f36873w = true;
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                i15 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                tL_contacts_resolveUsername.username = MessagesController.getInstance(i15).imageSearchBot;
                i16 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
                ConnectionsManager.getInstance(i16).sendRequest(tL_contacts_resolveUsername, new m(this, 25));
                return;
            }
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = ta.b.d("#wallpaper ", str);
        i11 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(i11).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i19 = this.v + 1;
        this.v = i19;
        i12 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        this.f36872s = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getInlineBotResults, new gh.u1(this, i19, 9));
        i13 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).currentAccount;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i13);
        int i20 = this.f36872s;
        i14 = ((org.telegram.ui.ActionBar.o2) wallpapersListActivity).classGuid;
        connectionsManager.bindRequestToGuid(i20, i14);
    }

    @Override
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.A.N);
    }

    @Override
    public final int j(int i9) {
        if (TextUtils.isEmpty(this.h)) {
            if (i9 == 0) {
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        Object obj;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        if (i10 != 0) {
            if (i10 == 2) {
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.SearchByColor));
                return;
            }
            return;
        }
        org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
        WallpapersListActivity wallpapersListActivity = this.A;
        int i11 = i9 * wallpapersListActivity.N;
        ArrayList arrayList = this.d;
        int ceil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.N);
        int i12 = wallpapersListActivity.N;
        boolean z11 = true;
        if (i11 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 / i12 != ceil - 1) {
            z11 = false;
        }
        zaVar.d(i12, z10, z11);
        for (int i13 = 0; i13 < wallpapersListActivity.N; i13++) {
            int i14 = i11 + i13;
            if (i14 < arrayList.size()) {
                obj = arrayList.get(i14);
            } else {
                obj = null;
            }
            zaVar.e(wallpapersListActivity.v, obj, "", i13);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout xiVar;
        FrameLayout frameLayout;
        Context context = this.f36867c;
        if (i9 != 0) {
            xiVar = null;
            if (i9 != 1) {
                if (i9 == 2) {
                    frameLayout = new org.telegram.ui.Cells.v3(context, null);
                }
            } else {
                ?? va1Var = new va1(context, 13, null);
                va1Var.setItemAnimator(null);
                va1Var.setLayoutAnimation(null);
                of.y yVar = new of.y(19);
                va1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                va1Var.setClipToPadding(false);
                yVar.j1(0);
                va1Var.setLayoutManager(yVar);
                va1Var.setAdapter(new gh.t3(this, 5));
                va1Var.setOnItemClickListener(new c21(this, 12));
                frameLayout = va1Var;
            }
            xiVar = frameLayout;
        } else {
            xiVar = new org.telegram.ui.Components.xi(this, context, 2);
        }
        if (i9 == 1) {
            xiVar.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(60.0f)));
        } else {
            xiVar.setLayoutParams(new f2.a1(-1, -2));
        }
        return new f2.q1(xiVar);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class ai1 extends org.telegram.ui.Components.yk0 {
    public final WallpapersListActivity A;

    public final Context f36542c;
    public final ArrayList d = new ArrayList();

    public final HashMap f36543e = new HashMap();

    public boolean f36544f = true;
    public String h;

    public String f36545n;

    public String f36546r;

    public int f36547s;
    public int v;

    public boolean f36548w;

    public String f36549x;

    public zh1 f36550y;

    public ai1(WallpapersListActivity wallpapersListActivity, Context context) {
        this.A = wallpapersListActivity;
        this.f36542c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return o1Var.f5793f != 2;
    }

    public final void E(String str, boolean z10) {
        if (str != null && this.f36545n != null) {
            str = a9.p.n(this.f36545n, " ", str, new StringBuilder("#color"));
        }
        zh1 zh1Var = this.f36550y;
        if (zh1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(zh1Var);
            this.f36550y = null;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        HashMap map = this.f36543e;
        ArrayList arrayList = this.d;
        WallpapersListActivity wallpapersListActivity = this.A;
        if (zIsEmpty) {
            arrayList.clear();
            map.clear();
            this.f36544f = true;
            this.h = null;
            if (this.f36547s != 0) {
                ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).cancelRequest(this.f36547s, true);
                this.f36547s = 0;
            }
            wallpapersListActivity.J.c();
        } else {
            wallpapersListActivity.J.b();
            if (z10) {
                arrayList.clear();
                map.clear();
                this.f36544f = true;
                F(str, "", true);
                this.h = str;
                l();
            } else {
                zh1 zh1Var2 = new zh1(0, this, str);
                this.f36550y = zh1Var2;
                AndroidUtilities.runOnUIThread(zh1Var2, 500L);
            }
        }
        l();
    }

    public final void F(String str, String str2, boolean z10) {
        int i10 = this.f36547s;
        WallpapersListActivity wallpapersListActivity = this.A;
        if (i10 != 0) {
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).cancelRequest(this.f36547s, true);
            this.f36547s = 0;
        }
        this.f36549x = str;
        TLObject userOrChat = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).getUserOrChat(MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).imageSearchBot);
        if (!(userOrChat instanceof TLRPC.User)) {
            if (!z10 || this.f36548w) {
                return;
            }
            this.f36548w = true;
            TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
            tL_contacts_resolveUsername.username = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).imageSearchBot;
            ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).sendRequest(tL_contacts_resolveUsername, new n(this, 25));
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.query = s3.c.e("#wallpaper ", str);
        tL_messages_getInlineBotResults.bot = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).getInputUser((TLRPC.User) userOrChat);
        tL_messages_getInlineBotResults.offset = str2;
        tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        int i11 = this.v + 1;
        this.v = i11;
        this.f36547s = ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).sendRequest(tL_messages_getInlineBotResults, new hh.u1(this, i11, 9));
        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount).bindRequestToGuid(this.f36547s, ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).classGuid);
    }

    @Override
    public final int h() {
        if (TextUtils.isEmpty(this.h)) {
            return 2;
        }
        return (int) Math.ceil(this.d.size() / this.A.N);
    }

    @Override
    public final int j(int i10) {
        if (TextUtils.isEmpty(this.h)) {
            return i10 == 0 ? 2 : 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 != 0) {
            if (i11 != 2) {
                return;
            }
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.getString(R.string.SearchByColor));
            return;
        }
        org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) view;
        WallpapersListActivity wallpapersListActivity = this.A;
        int i12 = i10 * wallpapersListActivity.N;
        ArrayList arrayList = this.d;
        int iCeil = (int) Math.ceil(arrayList.size() / wallpapersListActivity.N);
        int i13 = wallpapersListActivity.N;
        waVar.d(i13, i12 == 0, i12 / i13 == iCeil - 1);
        for (int i14 = 0; i14 < wallpapersListActivity.N; i14++) {
            int i15 = i12 + i14;
            waVar.e(wallpapersListActivity.v, i15 < arrayList.size() ? arrayList.get(i15) : null, "", i14);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View tiVar;
        View s3Var;
        Context context = this.f36542c;
        if (i10 != 0) {
            tiVar = null;
            boolean z10 = false;
            if (i10 == 1) {
                ta1 ta1Var = new ta1(context, 12, z10 ? 1 : 0);
                ta1Var.setItemAnimator(null);
                ta1Var.setLayoutAnimation(null);
                j jVar = new j(18);
                ta1Var.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                ta1Var.setClipToPadding(false);
                jVar.j1(0);
                ta1Var.setLayoutManager(jVar);
                ta1Var.setAdapter(new ag.i(this, 5));
                ta1Var.setOnItemClickListener(new b21(this, 12));
                s3Var = ta1Var;
            } else if (i10 == 2) {
                s3Var = new org.telegram.ui.Cells.s3(context, null);
            }
            tiVar = s3Var;
        } else {
            tiVar = new org.telegram.ui.Components.ti(this, context, 2);
        }
        if (i10 == 1) {
            tiVar.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(60.0f)));
        } else {
            tiVar.setLayoutParams(new f2.y0(-1, -2));
        }
        return new org.telegram.ui.Components.lk0(tiVar);
    }
}

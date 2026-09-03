package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class h70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public g70 f37233a;
    public org.telegram.ui.Components.sl0 f37234b;
    public org.telegram.ui.Components.oz f37235c;
    public long d;
    public boolean f37236e;
    public TLRPC.TL_chatInviteExported f37237f;
    public int h;
    public int f37238n;
    public int f37239r;
    public int f37240s;
    public int v;
    public int f37241w;

    public final void U(boolean z4) {
        this.f37236e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.zd(7, this, z4)), this.classGuid);
        g70 g70Var = this.f37233a;
        if (g70Var != null) {
            g70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 15));
        this.f37233a = new g70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21607a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.f37235c = ozVar;
        ozVar.b();
        frameLayout.addView(this.f37235c, k7.c6.e(-1, -1, 51));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.f37234b = sl0Var;
        sl0Var.setLayoutManager(new f2.j0(1, false));
        this.f37234b.setEmptyView(this.f37235c);
        this.f37234b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f37234b, k7.c6.e(-1, -1, 51));
        this.f37234b.setAdapter(this.f37233a);
        this.f37234b.setOnItemClickListener(new j(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j10 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f20846id == j10 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j10);
                this.f37237f = exportedInvite;
                if (exportedInvite == null) {
                    U(false);
                    return;
                }
                this.f37236e = false;
                g70 g70Var = this.f37233a;
                if (g70Var != null) {
                    g70Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37234b, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.n8.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21932s8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37234b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37234b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37234b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37235c, 2048, null, null, null, null, org.telegram.ui.ActionBar.k6.f21734h6));
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37234b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37234b, 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37234b, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f37234b, 0, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.f37236e = true;
        this.h = 1;
        this.f37238n = 2;
        this.f37239r = 3;
        this.f37240s = 4;
        this.f37241w = 6;
        this.v = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void onResume() {
        super.onResume();
        g70 g70Var = this.f37233a;
        if (g70Var != null) {
            g70Var.l();
        }
    }
}

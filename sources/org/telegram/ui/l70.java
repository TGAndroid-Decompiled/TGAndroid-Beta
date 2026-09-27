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
public final class l70 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public k70 f35265a;
    public org.telegram.ui.Components.yl0 f35266b;
    public org.telegram.ui.Components.oz f35267c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f35268f;
    public int h;
    public int f35269n;
    public int f35270r;
    public int f35271s;
    public int v;
    public int f35272w;

    public final void U(boolean z10) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.t3(8, this, z10)), this.classGuid);
        k70 k70Var = this.f35265a;
        if (k70Var != null) {
            k70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new po(this, 28));
        this.f35265a = new k70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19001a7, false));
        org.telegram.ui.Components.oz ozVar = new org.telegram.ui.Components.oz(context, null);
        this.f35267c = ozVar;
        ozVar.b();
        frameLayout.addView(this.f35267c, w7.y5.e(-1, -1, 51));
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(context, null);
        this.f35266b = yl0Var;
        yl0Var.setLayoutManager(new s4.c0(1, false));
        this.f35266b.setEmptyView(this.f35267c);
        this.f35266b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f35266b, w7.y5.e(-1, -1, 51));
        this.f35266b.setAdapter(this.f35265a);
        this.f35266b.setOnItemClickListener(new i(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j3 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f18330id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j3);
                this.f35268f = exportedInvite;
                if (exportedInvite == null) {
                    U(false);
                    return;
                }
                this.e = false;
                k70 k70Var = this.f35265a;
                if (k70Var != null) {
                    k70Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35266b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19057d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f19337s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(lVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35266b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f19356t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35266b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35266b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35267c, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f19129h6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35266b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35266b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19021b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35266b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f35266b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.e = true;
        this.h = 1;
        this.f35269n = 2;
        this.f35270r = 3;
        this.f35271s = 4;
        this.f35272w = 6;
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
        k70 k70Var = this.f35265a;
        if (k70Var != null) {
            k70Var.l();
        }
    }
}

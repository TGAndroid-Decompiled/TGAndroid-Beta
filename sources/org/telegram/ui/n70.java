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
public final class n70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public m70 f38840a;
    public org.telegram.ui.Components.ll0 f38841b;
    public org.telegram.ui.Components.mz f38842c;
    public long d;
    public boolean f38843e;
    public TLRPC.TL_chatInviteExported f38844f;
    public int h;
    public int f38845n;
    public int f38846r;
    public int f38847s;
    public int v;
    public int f38848w;

    public final void U(boolean z10) {
        this.f38843e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new di.u3(8, this, z10)), this.classGuid);
        m70 m70Var = this.f38840a;
        if (m70Var != null) {
            m70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new ic(this, 29));
        this.f38840a = new m70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f38842c = mzVar;
        mzVar.b();
        frameLayout.addView(this.f38842c, w7.x5.e(-1, -1, 51));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f38841b = ll0Var;
        ll0Var.setLayoutManager(new s4.c0(1, false));
        this.f38841b.setEmptyView(this.f38842c);
        this.f38841b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f38841b, w7.x5.e(-1, -1, 51));
        this.f38841b.setAdapter(this.f38840a);
        this.f38841b.setOnItemClickListener(new i(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j3 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f19870id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j3);
                this.f38844f = exportedInvite;
                if (exportedInvite == null) {
                    U(false);
                    return;
                }
                this.f38843e = false;
                m70 m70Var = this.f38840a;
                if (m70Var != null) {
                    m70Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38841b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20663d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20937s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38841b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38841b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38841b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38842c, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f20735h6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38841b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38841b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20627b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38841b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38841b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.f38843e = true;
        this.h = 1;
        this.f38845n = 2;
        this.f38846r = 3;
        this.f38847s = 4;
        this.f38848w = 6;
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
        m70 m70Var = this.f38840a;
        if (m70Var != null) {
            m70Var.l();
        }
    }
}

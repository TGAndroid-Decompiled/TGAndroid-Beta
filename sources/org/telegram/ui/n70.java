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
    public m70 f38868a;
    public org.telegram.ui.Components.ll0 f38869b;
    public org.telegram.ui.Components.mz f38870c;
    public long d;
    public boolean f38871e;
    public TLRPC.TL_chatInviteExported f38872f;
    public int h;
    public int f38873n;
    public int f38874r;
    public int f38875s;
    public int v;
    public int f38876w;

    public final void U(boolean z10) {
        this.f38871e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new di.u3(8, this, z10)), this.classGuid);
        m70 m70Var = this.f38868a;
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
        this.f38868a = new m70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20635a7, false));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f38870c = mzVar;
        mzVar.b();
        frameLayout.addView(this.f38870c, w7.x5.e(-1, -1, 51));
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f38869b = ll0Var;
        ll0Var.setLayoutManager(new s4.c0(1, false));
        this.f38869b.setEmptyView(this.f38870c);
        this.f38869b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f38869b, w7.x5.e(-1, -1, 51));
        this.f38869b.setAdapter(this.f38868a);
        this.f38869b.setOnItemClickListener(new i(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j3 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f19897id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j3);
                this.f38872f = exportedInvite;
                if (exportedInvite == null) {
                    U(false);
                    return;
                }
                this.f38871e = false;
                m70 m70Var = this.f38868a;
                if (m70Var != null) {
                    m70Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38869b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20691d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20635a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20965s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38869b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f21020v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20984t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38869b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20781i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38869b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20813k0, null, null, org.telegram.ui.ActionBar.j6.f20692d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38870c, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f20763h6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38869b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38869b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20655b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38869b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38869b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.f38871e = true;
        this.h = 1;
        this.f38873n = 2;
        this.f38874r = 3;
        this.f38875s = 4;
        this.f38876w = 6;
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
        m70 m70Var = this.f38868a;
        if (m70Var != null) {
            m70Var.l();
        }
    }
}

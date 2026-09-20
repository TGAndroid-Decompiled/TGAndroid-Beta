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
    public m70 f35901a;
    public org.telegram.ui.Components.vl0 f35902b;
    public org.telegram.ui.Components.mz f35903c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f35904f;
    public int h;
    public int f35905n;
    public int f35906r;
    public int f35907s;
    public int v;
    public int f35908w;

    public final void U(boolean z10) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.u3(8, this, z10)), this.classGuid);
        m70 m70Var = this.f35901a;
        if (m70Var != null) {
            m70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 28));
        this.f35901a = new m70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        org.telegram.ui.Components.mz mzVar = new org.telegram.ui.Components.mz(context, null);
        this.f35903c = mzVar;
        mzVar.b();
        frameLayout.addView(this.f35903c, w7.y5.e(-1, -1, 51));
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f35902b = vl0Var;
        vl0Var.setLayoutManager(new s4.c0(1, false));
        this.f35902b.setEmptyView(this.f35903c);
        this.f35902b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f35902b, w7.y5.e(-1, -1, 51));
        this.f35902b.setAdapter(this.f35901a);
        this.f35902b.setOnItemClickListener(new i(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j3 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f18329id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j3);
                this.f35904f = exportedInvite;
                if (exportedInvite == null) {
                    U(false);
                    return;
                }
                this.e = false;
                m70 m70Var = this.f35901a;
                if (m70Var != null) {
                    m70Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35902b, 16, new Class[]{org.telegram.ui.Cells.fa.class, org.telegram.ui.Cells.q8.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19094d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19038a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19372s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35902b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f19427v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f19391t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35902b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19184i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35902b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f19216k0, null, null, org.telegram.ui.ActionBar.j6.f19095d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35903c, 2048, null, null, null, null, org.telegram.ui.ActionBar.j6.f19166h6));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35902b, 0, new Class[]{org.telegram.ui.Cells.fa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35902b, 32, new Class[]{org.telegram.ui.Cells.f9.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19058b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35902b, 0, new Class[]{org.telegram.ui.Cells.f9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f35902b, 0, new Class[]{org.telegram.ui.Cells.q8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.e = true;
        this.h = 1;
        this.f35905n = 2;
        this.f35906r = 3;
        this.f35907s = 4;
        this.f35908w = 6;
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
        m70 m70Var = this.f35901a;
        if (m70Var != null) {
            m70Var.l();
        }
    }
}

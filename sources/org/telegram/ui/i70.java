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
public final class i70 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public h70 f34517a;
    public org.telegram.ui.Components.zl0 f34518b;
    public org.telegram.ui.Components.pz f34519c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f34520f;
    public int h;
    public int f34521n;
    public int f34522r;
    public int f34523s;
    public int v;
    public int f34524w;

    public final void U(boolean z10) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.t3(8, this, z10)), this.classGuid);
        h70 h70Var = this.f34517a;
        if (h70Var != null) {
            h70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new oo(this, 28));
        this.f34517a = new h70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19020a7, false));
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.f34519c = pzVar;
        pzVar.b();
        frameLayout.addView(this.f34519c, w7.y5.e(-1, -1, 51));
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f34518b = zl0Var;
        zl0Var.setLayoutManager(new s4.c0(1, false));
        this.f34518b.setEmptyView(this.f34519c);
        this.f34518b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f34518b, w7.y5.e(-1, -1, 51));
        this.f34518b.setAdapter(this.f34517a);
        this.f34518b.setOnItemClickListener(new i(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j3 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f18353id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j3);
                this.f34520f = exportedInvite;
                if (exportedInvite == null) {
                    U(false);
                    return;
                }
                this.e = false;
                h70 h70Var = this.f34517a;
                if (h70Var != null) {
                    h70Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34518b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19076d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19020a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f19354s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34518b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19409v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19373t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34518b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34518b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19197k0, null, null, org.telegram.ui.ActionBar.h6.f19077d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34519c, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f19147h6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34518b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34518b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19040b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34518b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f34518b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.e = true;
        this.h = 1;
        this.f34521n = 2;
        this.f34522r = 3;
        this.f34523s = 4;
        this.f34524w = 6;
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
        h70 h70Var = this.f34517a;
        if (h70Var != null) {
            h70Var.l();
        }
    }
}

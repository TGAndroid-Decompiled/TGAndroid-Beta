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
public final class m70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public l70 f38444a;
    public org.telegram.ui.Components.zl0 f38445b;
    public org.telegram.ui.Components.pz f38446c;
    public long d;
    public boolean f38447e;
    public TLRPC.TL_chatInviteExported f38448f;
    public int h;
    public int f38449n;
    public int f38450r;
    public int f38451s;
    public int v;
    public int f38452w;

    public final void S(boolean z10) {
        this.f38447e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.t3(8, this, z10)), this.classGuid);
        l70 l70Var = this.f38444a;
        if (l70Var != null) {
            l70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new qo(this, 28));
        this.f38444a = new l70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20761a7, false));
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(context, null);
        this.f38446c = pzVar;
        pzVar.b();
        frameLayout.addView(this.f38446c, w7.z5.e(-1, -1, 51));
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f38445b = zl0Var;
        zl0Var.setLayoutManager(new s4.c0(1, false));
        this.f38445b.setEmptyView(this.f38446c);
        this.f38445b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f38445b, w7.z5.e(-1, -1, 51));
        this.f38445b.setAdapter(this.f38444a);
        this.f38445b.setOnItemClickListener(new i(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j3 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f20038id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j3);
                this.f38448f = exportedInvite;
                if (exportedInvite == null) {
                    S(false);
                    return;
                }
                this.f38447e = false;
                l70 l70Var = this.f38444a;
                if (l70Var != null) {
                    l70Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38445b, 16, new Class[]{org.telegram.ui.Cells.ea.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20817d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20761a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21099s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38445b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21154v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21118t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38445b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20908i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38445b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20940k0, null, null, org.telegram.ui.ActionBar.i6.f20818d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38446c, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20890h6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38445b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38445b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20781b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38445b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f38445b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.f38447e = true;
        this.h = 1;
        this.f38449n = 2;
        this.f38450r = 3;
        this.f38451s = 4;
        this.f38452w = 6;
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
        l70 l70Var = this.f38444a;
        if (l70Var != null) {
            l70Var.l();
        }
    }
}

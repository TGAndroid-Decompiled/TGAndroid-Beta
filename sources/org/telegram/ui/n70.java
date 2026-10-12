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
public final class n70 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public m70 f40245a;
    public org.telegram.ui.Components.wm0 f40246b;
    public org.telegram.ui.Components.f00 f40247c;
    public long d;
    public boolean f40248e;
    public TLRPC.TL_chatInviteExported f40249f;
    public int h;
    public int f40250n;
    public int f40251r;
    public int f40252s;
    public int v;
    public int f40253w;

    public final void U(boolean z10) {
        this.f40248e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.s3(8, this, z10)), this.classGuid);
        m70 m70Var = this.f40245a;
        if (m70Var != null) {
            m70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new lc(this, 29));
        this.f40245a = new m70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        org.telegram.ui.Components.f00 f00Var = new org.telegram.ui.Components.f00(context, null);
        this.f40247c = f00Var;
        f00Var.b();
        frameLayout.addView(this.f40247c, w7.w5.e(-1, -1, 51));
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f40246b = wm0Var;
        wm0Var.setLayoutManager(new s4.d0(1, false));
        this.f40246b.setEmptyView(this.f40247c);
        this.f40246b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f40246b, w7.w5.e(-1, -1, 51));
        this.f40246b.setAdapter(this.f40245a);
        this.f40246b.setOnItemClickListener(new i(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j3 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f19804id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j3);
                this.f40249f = exportedInvite;
                if (exportedInvite == null) {
                    U(false);
                    return;
                }
                this.f40248e = false;
                m70 m70Var = this.f40245a;
                if (m70Var != null) {
                    m70Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40246b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20560d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20504a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20840s8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40246b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f20895v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f20859t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40246b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20651i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40246b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20682k0, null, null, org.telegram.ui.ActionBar.h6.f20561d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40247c, 2048, null, null, null, null, org.telegram.ui.ActionBar.h6.f20632h6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40246b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40246b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20524b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40246b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40246b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.f40248e = true;
        this.h = 1;
        this.f40250n = 2;
        this.f40251r = 3;
        this.f40252s = 4;
        this.f40253w = 6;
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
        m70 m70Var = this.f40245a;
        if (m70Var != null) {
            m70Var.l();
        }
    }
}

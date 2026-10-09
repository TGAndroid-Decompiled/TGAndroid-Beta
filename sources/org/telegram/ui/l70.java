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
public final class l70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public k70 f39447a;
    public org.telegram.ui.Components.qm0 f39448b;
    public org.telegram.ui.Components.c00 f39449c;
    public long d;
    public boolean f39450e;
    public TLRPC.TL_chatInviteExported f39451f;
    public int h;
    public int f39452n;
    public int f39453r;
    public int f39454s;
    public int v;
    public int f39455w;

    public final void U(boolean z10) {
        this.f39450e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().getInputPeer(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new ci.s3(8, this, z10)), this.classGuid);
        k70 k70Var = this.f39447a;
        if (k70Var != null) {
            k70Var.l();
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLink));
        this.actionBar.setActionBarMenuOnItemClick(new ro(this, 28));
        this.f39447a = new k70(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20741a7, false));
        org.telegram.ui.Components.c00 c00Var = new org.telegram.ui.Components.c00(context, null);
        this.f39449c = c00Var;
        c00Var.b();
        frameLayout.addView(this.f39449c, w7.x5.e(-1, -1, 51));
        org.telegram.ui.Components.qm0 qm0Var = new org.telegram.ui.Components.qm0(context, null);
        this.f39448b = qm0Var;
        qm0Var.setLayoutManager(new s4.d0(1, false));
        this.f39448b.setEmptyView(this.f39449c);
        this.f39448b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f39448b, w7.x5.e(-1, -1, 51));
        this.f39448b.setAdapter(this.f39447a);
        this.f39448b.setOnItemClickListener(new i(this, 12));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j3 = this.d;
        if (i10 == NotificationCenter.chatInfoDidLoad) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f20039id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported exportedInvite = getMessagesController().getExportedInvite(j3);
                this.f39451f = exportedInvite;
                if (exportedInvite == null) {
                    U(false);
                    return;
                }
                this.f39450e = false;
                k70 k70Var = this.f39447a;
                if (k70Var != null) {
                    k70Var.l();
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39448b, 16, new Class[]{org.telegram.ui.Cells.ca.class, org.telegram.ui.Cells.p8.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20797d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f21075s8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39448b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21130v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21094t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39448b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39448b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39449c, 2048, null, null, null, null, org.telegram.ui.ActionBar.i6.f20869h6));
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39448b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39448b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20761b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39448b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.B6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f39448b, 0, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, null, null, -1, null, i11));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        getMessagesController().loadFullChat(this.d, this.classGuid, true);
        this.f39450e = true;
        this.h = 1;
        this.f39452n = 2;
        this.f39453r = 3;
        this.f39454s = 4;
        this.f39455w = 6;
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
        k70 k70Var = this.f39447a;
        if (k70Var != null) {
            k70Var.l();
        }
    }
}

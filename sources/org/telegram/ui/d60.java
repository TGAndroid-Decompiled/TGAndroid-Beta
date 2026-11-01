package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class d60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs {
    public c60 f36497a;
    public org.telegram.ui.Components.uk0 f36498b;
    public org.telegram.ui.Components.xy f36499c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f36500f;
    public int h;
    public int f36501n;
    public int f36502r;
    public int f36503s;
    public int f36504w;
    public int f36505x;

    public final void Z(boolean z10) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().i1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.voip.u0(6, this, z10)), this.classGuid);
        c60 c60Var = this.f36497a;
        if (c60Var != null) {
            c60Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131749159, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 27));
        this.f36497a = new c60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f36499c = xyVar;
        xyVar.b();
        org.telegram.ui.Components.uk0 uk0Var = new org.telegram.ui.Components.uk0(context, null);
        this.f36498b = uk0Var;
        uk0Var.r1();
        this.f36498b.setSectionsDrawBackground(true);
        this.f36498b.setLayoutManager(new s4.a0(1, false));
        this.f36498b.setEmptyView(this.f36499c);
        this.f36498b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f36498b, w7.b6.e(-1, -1, 51));
        frameLayout.addView(this.f36499c, w7.b6.e(-1, -1, 51));
        this.f36498b.setAdapter(this.f36497a);
        this.f36498b.setOnItemClickListener(new g(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j10 = this.d;
        if (i10 == org.telegram.messenger.at.T) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f19795id == j10 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().f19226r.f(j10);
                this.f36500f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Z(false);
                    return;
                }
                this.e = false;
                c60 c60Var = this.f36497a;
                if (c60Var != null) {
                    c60Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f36498b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36499c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21003h6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.T);
        getMessagesController().T2(this.classGuid, this.d, true);
        this.e = true;
        this.h = 1;
        this.f36501n = 2;
        this.f36502r = 3;
        this.f36503s = 4;
        this.f36505x = 6;
        this.f36504w = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        c60 c60Var = this.f36497a;
        if (c60Var != null) {
            c60Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.xy xyVar = this.f36499c;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21003h6, false));
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

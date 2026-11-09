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
public final class h50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public g50 f46160a;
    public org.telegram.ui.Components.qj0 f46161b;
    public org.telegram.ui.Components.jy f46162c;
    public long d;
    public boolean f46163e;
    public TLRPC.TL_chatInviteExported f46164f;
    public int h;
    public int f46165n;
    public int f46166r;
    public int f46167s;
    public int f46168w;
    public int f46169x;

    public final void Z(boolean z9) {
        this.f46163e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new fi.d3(7, this, z9)), this.classGuid);
        g50 g50Var = this.f46160a;
        if (g50Var != null) {
            g50Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27829b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27866d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27957i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131749149, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 6));
        this.f46160a = new g50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.jy jyVar = new org.telegram.ui.Components.jy(context, null);
        this.f46162c = jyVar;
        jyVar.b();
        org.telegram.ui.Components.qj0 qj0Var = new org.telegram.ui.Components.qj0(context, null);
        this.f46161b = qj0Var;
        qj0Var.r1();
        this.f46161b.setSectionsDrawBackground(true);
        this.f46161b.setLayoutManager(new v4.b0(1, false));
        this.f46161b.setEmptyView(this.f46162c);
        this.f46161b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f46161b, c8.ha.e(-1, -1, 51));
        frameLayout.addView(this.f46162c, c8.ha.e(-1, -1, 51));
        this.f46161b.setAdapter(this.f46160a);
        this.f46161b.setOnItemClickListener(new h(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        long j3 = this.d;
        if (i7 == org.telegram.messenger.qs.T) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f26957id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().f24879r.f(j3);
                this.f46164f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Z(false);
                    return;
                }
                this.f46163e = false;
                g50 g50Var = this.f46160a;
                if (g50Var != null) {
                    g50Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f46161b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.f46162c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.f27939h6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.T);
        getMessagesController().V2(this.classGuid, this.d, true);
        this.f46163e = true;
        this.h = 1;
        this.f46165n = 2;
        this.f46166r = 3;
        this.f46167s = 4;
        this.f46169x = 6;
        this.f46168w = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        g50 g50Var = this.f46160a;
        if (g50Var != null) {
            g50Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.jy jyVar = this.f46162c;
            if (jyVar != null) {
                jyVar.setProgressBarColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27939h6, false));
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

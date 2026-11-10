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
public final class i50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public h50 f46500a;
    public org.telegram.ui.Components.pj0 f46501b;
    public org.telegram.ui.Components.iy f46502c;
    public long d;
    public boolean f46503e;
    public TLRPC.TL_chatInviteExported f46504f;
    public int h;
    public int f46505n;
    public int f46506r;
    public int f46507s;
    public int f46508w;
    public int f46509x;

    public final void Z(boolean z9) {
        this.f46503e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new fi.d3(7, this, z9)), this.classGuid);
        h50 h50Var = this.f46500a;
        if (h50Var != null) {
            h50Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27854b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27891d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27982i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28188t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28227v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27890d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131749149, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new xx(this, 6));
        this.f46500a = new h50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.f46502c = iyVar;
        iyVar.b();
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f46501b = pj0Var;
        pj0Var.r1();
        this.f46501b.setSectionsDrawBackground(true);
        this.f46501b.setLayoutManager(new v4.b0(1, false));
        this.f46501b.setEmptyView(this.f46502c);
        this.f46501b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f46501b, c8.ha.e(-1, -1, 51));
        frameLayout.addView(this.f46502c, c8.ha.e(-1, -1, 51));
        this.f46501b.setAdapter(this.f46500a);
        this.f46501b.setOnItemClickListener(new h(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        long j3 = this.d;
        if (i7 == org.telegram.messenger.qs.T) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f26961id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().f24883r.f(j3);
                this.f46504f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Z(false);
                    return;
                }
                this.f46503e = false;
                h50 h50Var = this.f46500a;
                if (h50Var != null) {
                    h50Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f46501b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f46502c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f27964h6));
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
        this.f46503e = true;
        this.h = 1;
        this.f46505n = 2;
        this.f46506r = 3;
        this.f46507s = 4;
        this.f46509x = 6;
        this.f46508w = 5;
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
        h50 h50Var = this.f46500a;
        if (h50Var != null) {
            h50Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.iy iyVar = this.f46502c;
            if (iyVar != null) {
                iyVar.setProgressBarColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27964h6, false));
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

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
public final class h50 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs {
    public g50 f48234a;
    public org.telegram.ui.Components.ek0 f48235b;
    public org.telegram.ui.Components.vy f48236c;
    public long d;
    public boolean f48237e;
    public TLRPC.TL_chatInviteExported f48238f;
    public int h;
    public int f48239n;
    public int f48240r;
    public int f48241s;
    public int f48242w;
    public int f48243x;

    public final void Z(boolean z10) {
        this.f48237e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().l1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new hi.b3(7, this, z10)), this.classGuid);
        g50 g50Var = this.f48234a;
        if (g50Var != null) {
            g50Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29345b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29382d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29473i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29381d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131748956, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 9));
        this.f48234a = new g50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.vy vyVar = new org.telegram.ui.Components.vy(context, null);
        this.f48236c = vyVar;
        vyVar.b();
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f48235b = ek0Var;
        ek0Var.r1();
        this.f48235b.setSectionsDrawBackground(true);
        this.f48235b.setLayoutManager(new v4.c0(1, false));
        this.f48235b.setEmptyView(this.f48236c);
        this.f48235b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f48235b, c8.ma.e(-1, -1, 51));
        frameLayout.addView(this.f48236c, c8.ma.e(-1, -1, 51));
        this.f48235b.setAdapter(this.f48234a);
        this.f48235b.setOnItemClickListener(new h(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        long j3 = this.d;
        if (i7 == org.telegram.messenger.ls.T) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f28435id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().f25943r.f(j3);
                this.f48238f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Z(false);
                    return;
                }
                this.f48237e = false;
                g50 g50Var = this.f48234a;
                if (g50Var != null) {
                    g50Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f48235b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f48236c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29455h6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.T);
        getMessagesController().b3(this.classGuid, this.d, true);
        this.f48237e = true;
        this.h = 1;
        this.f48239n = 2;
        this.f48240r = 3;
        this.f48241s = 4;
        this.f48243x = 6;
        this.f48242w = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        g50 g50Var = this.f48234a;
        if (g50Var != null) {
            g50Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.vy vyVar = this.f48236c;
            if (vyVar != null) {
                vyVar.setProgressBarColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29455h6, false));
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

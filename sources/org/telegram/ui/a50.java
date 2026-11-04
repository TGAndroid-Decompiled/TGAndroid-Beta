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
public final class a50 extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public z40 f43602a;
    public org.telegram.ui.Components.tj0 f43603b;
    public org.telegram.ui.Components.gy f43604c;
    public long d;
    public boolean f43605e;
    public TLRPC.TL_chatInviteExported f43606f;
    public int h;
    public int f43607n;
    public int f43608r;
    public int f43609s;
    public int f43610w;
    public int f43611x;

    public final void Z(boolean z10) {
        this.f43605e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new gi.b3(7, this, z10)), this.classGuid);
        z40 z40Var = this.f43602a;
        if (z40Var != null) {
            z40Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27878d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131749157, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 7));
        this.f43602a = new z40(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.f43604c = gyVar;
        gyVar.b();
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f43603b = tj0Var;
        tj0Var.r1();
        this.f43603b.setSectionsDrawBackground(true);
        this.f43603b.setLayoutManager(new u4.b0(1, false));
        this.f43603b.setEmptyView(this.f43604c);
        this.f43603b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f43603b, b8.mf.e(-1, -1, 51));
        frameLayout.addView(this.f43604c, b8.mf.e(-1, -1, 51));
        this.f43603b.setAdapter(this.f43602a);
        this.f43603b.setOnItemClickListener(new h(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        long j10 = this.d;
        if (i3 == org.telegram.messenger.hs.T) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f27002id == j10 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().f23104r.f(j10);
                this.f43606f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Z(false);
                    return;
                }
                this.f43605e = false;
                z40 z40Var = this.f43602a;
                if (z40Var != null) {
                    z40Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f43603b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f43604c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27955h6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.hs.f(this.currentAccount).c(this, org.telegram.messenger.hs.T);
        getMessagesController().V2(this.classGuid, this.d, true);
        this.f43605e = true;
        this.h = 1;
        this.f43607n = 2;
        this.f43608r = 3;
        this.f43609s = 4;
        this.f43611x = 6;
        this.f43610w = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.hs.f(this.currentAccount).n(this, org.telegram.messenger.hs.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        z40 z40Var = this.f43602a;
        if (z40Var != null) {
            z40Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.gy gyVar = this.f43604c;
            if (gyVar != null) {
                gyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27955h6, false));
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

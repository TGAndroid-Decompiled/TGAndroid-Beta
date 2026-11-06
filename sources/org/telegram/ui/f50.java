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
public final class f50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public e50 f45485a;
    public org.telegram.ui.Components.pj0 f45486b;
    public org.telegram.ui.Components.iy f45487c;
    public long d;
    public boolean f45488e;
    public TLRPC.TL_chatInviteExported f45489f;
    public int h;
    public int f45490n;
    public int f45491r;
    public int f45492s;
    public int f45493w;
    public int f45494x;

    public final void Z(boolean z9) {
        this.f45488e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().j1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new fi.d3(7, this, z9)), this.classGuid);
        e50 e50Var = this.f45485a;
        if (e50Var != null) {
            e50Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27812b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27848d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131749148, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 6));
        this.f45485a = new e50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.f45487c = iyVar;
        iyVar.b();
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f45486b = pj0Var;
        pj0Var.r1();
        this.f45486b.setSectionsDrawBackground(true);
        this.f45486b.setLayoutManager(new v4.b0(1, false));
        this.f45486b.setEmptyView(this.f45487c);
        this.f45486b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f45486b, c8.ha.e(-1, -1, 51));
        frameLayout.addView(this.f45487c, c8.ha.e(-1, -1, 51));
        this.f45486b.setAdapter(this.f45485a);
        this.f45486b.setOnItemClickListener(new h(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        long j3 = this.d;
        if (i7 == org.telegram.messenger.qs.T) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f26953id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().f24864r.f(j3);
                this.f45489f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Z(false);
                    return;
                }
                this.f45488e = false;
                e50 e50Var = this.f45485a;
                if (e50Var != null) {
                    e50Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f45486b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f45487c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27922h6));
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
        this.f45488e = true;
        this.h = 1;
        this.f45490n = 2;
        this.f45491r = 3;
        this.f45492s = 4;
        this.f45494x = 6;
        this.f45493w = 5;
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
        e50 e50Var = this.f45485a;
        if (e50Var != null) {
            e50Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.iy iyVar = this.f45487c;
            if (iyVar != null) {
                iyVar.setProgressBarColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27922h6, false));
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

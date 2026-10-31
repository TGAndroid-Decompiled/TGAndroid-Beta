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
public final class e60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public d60 f36950a;
    public org.telegram.ui.Components.tk0 f36951b;
    public org.telegram.ui.Components.xy f36952c;
    public long d;
    public boolean e;
    public TLRPC.TL_chatInviteExported f36953f;
    public int h;
    public int f36954n;
    public int f36955r;
    public int f36956s;
    public int f36957w;
    public int f36958x;

    public final void Y(boolean z10) {
        this.e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().i1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new org.telegram.messenger.voip.u0(6, this, z10)), this.classGuid);
        d60 d60Var = this.f36950a;
        if (d60Var != null) {
            d60Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131749159, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 27));
        this.f36950a = new d60(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.f36952c = xyVar;
        xyVar.b();
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f36951b = tk0Var;
        tk0Var.r1();
        this.f36951b.setSectionsDrawBackground(true);
        this.f36951b.setLayoutManager(new s4.a0(1, false));
        this.f36951b.setEmptyView(this.f36952c);
        this.f36951b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f36951b, w7.b6.e(-1, -1, 51));
        frameLayout.addView(this.f36952c, w7.b6.e(-1, -1, 51));
        this.f36951b.setAdapter(this.f36950a);
        this.f36951b.setOnItemClickListener(new g(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        long j10 = this.d;
        if (i10 == org.telegram.messenger.zs.T) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f19794id == j10 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().f18883r.f(j10);
                this.f36953f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Y(false);
                    return;
                }
                this.e = false;
                d60 d60Var = this.f36950a;
                if (d60Var != null) {
                    d60Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f36951b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36952c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21002h6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.T);
        getMessagesController().T2(this.classGuid, this.d, true);
        this.e = true;
        this.h = 1;
        this.f36954n = 2;
        this.f36955r = 3;
        this.f36956s = 4;
        this.f36958x = 6;
        this.f36957w = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        d60 d60Var = this.f36950a;
        if (d60Var != null) {
            d60Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.xy xyVar = this.f36952c;
            if (xyVar != null) {
                xyVar.setProgressBarColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h6, false));
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

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
public final class h50 extends org.telegram.ui.ActionBar.h2 implements org.telegram.messenger.fs {
    public g50 f48155a;
    public org.telegram.ui.Components.ck0 f48156b;
    public org.telegram.ui.Components.ty f48157c;
    public long d;
    public boolean f48158e;
    public TLRPC.TL_chatInviteExported f48159f;
    public int h;
    public int f48160n;
    public int f48161r;
    public int f48162s;
    public int f48163w;
    public int f48164x;

    public final void Z(boolean z10) {
        this.f48158e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().l1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new hi.c3(7, this, z10)), this.classGuid);
        g50 g50Var = this.f48155a;
        if (g50Var != null) {
            g50Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29358b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29395d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29486i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131748957, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 9));
        this.f48155a = new g50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ty tyVar = new org.telegram.ui.Components.ty(context, null);
        this.f48157c = tyVar;
        tyVar.b();
        org.telegram.ui.Components.ck0 ck0Var = new org.telegram.ui.Components.ck0(context, null);
        this.f48156b = ck0Var;
        ck0Var.r1();
        this.f48156b.setSectionsDrawBackground(true);
        this.f48156b.setLayoutManager(new v4.c0(1, false));
        this.f48156b.setEmptyView(this.f48157c);
        this.f48156b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f48156b, c8.ma.e(-1, -1, 51));
        frameLayout.addView(this.f48157c, c8.ma.e(-1, -1, 51));
        this.f48156b.setAdapter(this.f48155a);
        this.f48156b.setOnItemClickListener(new h(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        long j3 = this.d;
        if (i7 == org.telegram.messenger.ks.T) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f28404id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().f25744r.f(j3);
                this.f48159f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Z(false);
                    return;
                }
                this.f48158e = false;
                g50 g50Var = this.f48155a;
                if (g50Var != null) {
                    g50Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.f48156b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48157c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29468h6));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.T);
        getMessagesController().b3(this.classGuid, this.d, true);
        this.f48158e = true;
        this.h = 1;
        this.f48160n = 2;
        this.f48161r = 3;
        this.f48162s = 4;
        this.f48164x = 6;
        this.f48163w = 5;
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.T);
    }

    @Override
    public final void onResume() {
        super.onResume();
        g50 g50Var = this.f48155a;
        if (g50Var != null) {
            g50Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.ty tyVar = this.f48157c;
            if (tyVar != null) {
                tyVar.setProgressBarColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29468h6, false));
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

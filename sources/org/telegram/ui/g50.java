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
public final class g50 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public f50 f48103a;
    public org.telegram.ui.Components.ek0 f48104b;
    public org.telegram.ui.Components.sy f48105c;
    public long d;
    public boolean f48106e;
    public TLRPC.TL_chatInviteExported f48107f;
    public int h;
    public int f48108n;
    public int f48109r;
    public int f48110s;
    public int f48111w;
    public int f48112x;

    public final void Z(boolean z10) {
        this.f48106e = true;
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = getMessagesController().l1(-this.d);
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_exportChatInvite, new hi.k3(7, this, z10)), this.classGuid);
        f50 f50Var = this.f48103a;
        if (f50Var != null) {
            f50Var.f();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29749t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29788v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29451d6));
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131748956, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 9));
        this.f48103a = new f50(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.f48105c = syVar;
        syVar.b();
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f48104b = ek0Var;
        ek0Var.r1();
        this.f48104b.setSectionsDrawBackground(true);
        this.f48104b.setLayoutManager(new v4.c0(1, false));
        this.f48104b.setEmptyView(this.f48105c);
        this.f48104b.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.f48104b, c8.na.e(-1, -1, 51));
        frameLayout.addView(this.f48105c, c8.na.e(-1, -1, 51));
        this.f48104b.setAdapter(this.f48103a);
        this.f48104b.setOnItemClickListener(new h(this, 13));
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        long j3 = this.d;
        if (i7 == org.telegram.messenger.ks.T) {
            int intValue = ((Integer) objArr[1]).intValue();
            if (((TLRPC.ChatFull) objArr[0]).f28493id == j3 && intValue == this.classGuid) {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) getMessagesController().f25839r.f(j3);
                this.f48107f = tL_chatInviteExported;
                if (tL_chatInviteExported == null) {
                    Z(false);
                    return;
                }
                this.f48106e = false;
                f50 f50Var = this.f48103a;
                if (f50Var != null) {
                    f50Var.f();
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f48104b;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.f48105c, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29525h6));
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
        this.f48106e = true;
        this.h = 1;
        this.f48108n = 2;
        this.f48109r = 3;
        this.f48110s = 4;
        this.f48112x = 6;
        this.f48111w = 5;
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
        f50 f50Var = this.f48103a;
        if (f50Var != null) {
            f50Var.f();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.sy syVar = this.f48105c;
            if (syVar != null) {
                syVar.setProgressBarColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29525h6, false));
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

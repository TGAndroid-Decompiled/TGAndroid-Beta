package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class i91 extends org.telegram.ui.Components.n61 implements vz {
    public final FrameLayout W;
    public final org.telegram.ui.Components.tj0 f46201a0;
    public final u4.b0 f46202b0;
    public final g91 f46203c0;
    public qv0 f46204d0;
    public String f46205e0;
    public final ArrayList f46206f0;
    public final ArrayList f46207g0;
    public int f46208h0;
    public int f46209i0;
    public int f46210j0;
    public int f46211k0;
    public int f46212l0;
    public int m0;
    public int f46213n0;
    public boolean f46214o0;
    public boolean f46215p0;
    public final org.telegram.ui.Components.zu0 f46216q0;
    public final org.telegram.ui.Components.wi0 f46217r0;
    public boolean f46218s0;
    public final ci.o4 f46219t0;
    public final mr0 f46220u0;
    public final ArrayList f46221v0;
    public final m91 f46222w0;

    public i91(m91 m91Var, Context context) {
        super(context, null);
        this.f46222w0 = m91Var;
        this.f46205e0 = "empty";
        this.f46206f0 = new ArrayList();
        this.f46207g0 = new ArrayList();
        this.f46221v0 = new ArrayList();
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        this.f46220u0 = new mr0(this, 6);
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.f46201a0 = tj0Var;
        g91 g91Var = new g91(this);
        this.f46203c0 = g91Var;
        tj0Var.setAdapter(g91Var);
        u4.b0 b0Var = new u4.b0();
        this.f46202b0 = b0Var;
        tj0Var.setLayoutManager(b0Var);
        tj0Var.setOnItemClickListener(new nx0(this, 10));
        tj0Var.setOnScrollListener(new r11(this, 5));
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(context, null);
        izVar.setViewType(7);
        izVar.f34869x = false;
        izVar.setUseHeaderOffset(true);
        org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(context, izVar, 1, null);
        this.f46216q0 = zu0Var;
        zu0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        zu0Var.f41128e.setVisibility(8);
        zu0Var.setVisibility(8);
        zu0Var.addView(izVar, 0);
        zu0Var.setAnimateLayoutChange(true);
        tj0Var.setEmptyView(zu0Var);
        tj0Var.X1 = true;
        tj0Var.Y1 = 0;
        frameLayout.addView(zu0Var);
        frameLayout.addView(tj0Var);
        N();
        org.telegram.ui.Components.wi0 wi0Var = new org.telegram.ui.Components.wi0(tj0Var, true);
        this.f46217r0 = wi0Var;
        tj0Var.setItemsEnterAnimator(wi0Var);
        ci.o4 o4Var = new ci.o4(this);
        this.f46219t0 = o4Var;
        setAdapter(o4Var);
    }

    @Override
    public final boolean I() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.d2) this.f46222w0).actionBar;
        return kVar.v();
    }

    public final void L(String str) {
        int i3;
        if (this.f46218s0) {
            return;
        }
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        m91 m91Var = this.f46222w0;
        tL_messages_search.peer = m91Var.getMessagesController().j1(-m91Var.f47575a);
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.limit = 20;
        tL_messages_search.f27112q = str;
        ArrayList arrayList = this.f46207g0;
        if (!arrayList.isEmpty()) {
            tL_messages_search.offset_id = ((org.telegram.messenger.zi) k2.p1.h(1, arrayList)).f1();
        }
        this.f46218s0 = true;
        i3 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_search, new m21(6, this, str));
    }

    public final void M(View view, int i3, String str, boolean z10) {
        this.f46205e0 = str;
        FrameLayout frameLayout = this.W;
        m91 m91Var = this.f46222w0;
        int i10 = 0;
        if (view == frameLayout) {
            qv0 qv0Var = this.f46204d0;
            if (qv0Var != null) {
                org.telegram.messenger.g0.r(qv0Var);
                this.f46204d0 = null;
            }
            this.f46218s0 = false;
            this.f46215p0 = false;
            ArrayList arrayList = this.f46206f0;
            arrayList.clear();
            this.f46207g0.clear();
            N();
            if (TextUtils.isEmpty(str)) {
                this.f46214o0 = false;
                arrayList.clear();
                while (true) {
                    ArrayList arrayList2 = m91Var.f47578b;
                    if (i10 < arrayList2.size()) {
                        if (((e91) arrayList2.get(i10)).f44941c != null) {
                            arrayList.add(((e91) arrayList2.get(i10)).f44941c);
                            ((e91) arrayList2.get(i10)).f44941c.searchQuery = null;
                        }
                        i10++;
                    } else {
                        N();
                        return;
                    }
                }
            } else {
                N();
                this.f46214o0 = true;
                this.f46216q0.e(true, true);
                qv0 qv0Var2 = new qv0(25, this, str);
                this.f46204d0 = qv0Var2;
                org.telegram.messenger.g0.i3(qv0Var2, 200L);
            }
        } else if (view instanceof wz) {
            wz wzVar = (wz) view;
            wzVar.f51640c.b(0, false);
            wzVar.h(-m91Var.f47575a, 0L, 0L, 0L, kg.n0.f17105k3[((f91) ((ArrayList) this.f46219t0.f5682b).get(i3)).f45224b], false, str, z10);
        } else if (view instanceof org.telegram.ui.Components.hl0) {
            org.telegram.ui.Components.hl0 hl0Var = (org.telegram.ui.Components.hl0) view;
            hl0Var.f34442a.b(0, false);
            hl0Var.L = str;
            hl0Var.d(false);
        }
    }

    public final void N() {
        this.f46208h0 = -1;
        this.f46209i0 = -1;
        this.f46210j0 = -1;
        this.f46211k0 = -1;
        this.f46212l0 = -1;
        this.m0 = -1;
        this.f46213n0 = 0;
        ArrayList arrayList = this.f46206f0;
        if (!arrayList.isEmpty()) {
            int i3 = this.f46213n0;
            int i10 = i3 + 1;
            this.f46213n0 = i10;
            this.f46208h0 = i3;
            this.f46209i0 = i10;
            int size = arrayList.size() + i10;
            this.f46213n0 = size;
            this.f46210j0 = size;
        }
        ArrayList arrayList2 = this.f46207g0;
        if (!arrayList2.isEmpty()) {
            int i11 = this.f46213n0;
            int i12 = i11 + 1;
            this.f46213n0 = i12;
            this.f46211k0 = i11;
            this.f46212l0 = i12;
            int size2 = arrayList2.size() + i12;
            this.f46213n0 = size2;
            this.m0 = size2;
        }
        this.f46203c0.f();
    }

    @Override
    public final void h() {
        org.telegram.ui.ActionBar.k kVar;
        kVar = ((org.telegram.ui.ActionBar.d2) this.f46222w0).actionBar;
        kVar.O(null, null);
    }

    @Override
    public final boolean n(pz pzVar) {
        if (pzVar == null) {
            return false;
        }
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.f46221v0;
            if (i3 >= arrayList.size()) {
                return false;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
            if (ziVar != null && ziVar.f1() == pzVar.f48708b && org.telegram.messenger.zi.B0(ziVar.f26868k) == pzVar.f48707a) {
                return true;
            }
            i3++;
        }
    }

    @Override
    public final void o(org.telegram.messenger.zi ziVar) {
        int i3;
        Bundle bundle = new Bundle();
        long B0 = org.telegram.messenger.zi.B0(ziVar.f26868k);
        boolean C = org.telegram.messenger.m5.C(B0);
        m91 m91Var = this.f46222w0;
        if (C) {
            bundle.putInt("enc_id", (int) (B0 & 4294967295L));
        } else if (!org.telegram.messenger.m5.E(B0)) {
            i3 = ((org.telegram.ui.ActionBar.d2) m91Var).currentAccount;
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(org.telegram.messenger.c.a(i3).f21919a).M0(Long.valueOf(-B0));
            if (M0 != null && M0.migrated_to != null) {
                bundle.putLong("migrated_to", B0);
                B0 = -M0.migrated_to.channel_id;
            }
            bundle.putLong("chat_id", -B0);
        } else {
            bundle.putLong("user_id", B0);
        }
        bundle.putInt("message_id", ziVar.f1());
        m91Var.presentFragment(new wm(bundle));
    }

    @Override
    public final void w(org.telegram.messenger.zi ziVar, View view, int i3) {
        org.telegram.ui.ActionBar.k kVar;
        ArrayList arrayList = this.f46221v0;
        if (!arrayList.remove(ziVar)) {
            arrayList.add(ziVar);
        }
        if (arrayList.isEmpty()) {
            kVar = ((org.telegram.ui.ActionBar.d2) this.f46222w0).actionBar;
            kVar.u();
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class hz extends org.telegram.ui.ActionBar.k2 {
    public boolean D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public org.telegram.ui.Components.g00 O;
    public wy P;
    public final rh Q;
    public u71 f37896a;
    public gz f37897b;
    public final org.telegram.messenger.bp f37898c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f37899f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.l5 f37900n;
    public int f37901r;
    public long f37902s;
    public long f37903w;
    public org.telegram.messenger.r20 f37904x;
    public org.telegram.messenger.r20 f37905y;

    public hz(org.telegram.messenger.bp bpVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f37899f = new ArrayList();
        this.h = new ArrayList();
        this.f37901r = -5;
        this.D = false;
        this.G = 0;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.Q = new rh(this, 29);
        this.f37898c = bpVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(hz hzVar, TLRPC.TL_error tL_error) {
        hzVar.j0(false);
        hzVar.D = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            hzVar.showDialog(new kg.q0(12, hzVar.currentAccount, hzVar.getParentActivity(), hzVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            hzVar.showDialog(new kg.q0(4, hzVar.currentAccount, hzVar.getParentActivity(), hzVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            hzVar.showDialog(new kg.q0(13, hzVar.currentAccount, hzVar.getParentActivity(), hzVar, null));
        } else {
            hzVar.finishFragment();
        }
    }

    public static void a0(hz hzVar, View view, int i10) {
        String L0;
        String str;
        hz hzVar2;
        ArrayList arrayList = hzVar.e;
        if (hzVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.j4)) {
            Long l4 = (Long) hzVar.h.get(i10 - hzVar.L);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                hzVar.F = true;
                hzVar.c0();
                ((org.telegram.ui.Cells.j4) view).c(false, true);
                hzVar2 = hzVar;
            } else if (hzVar.f37899f.contains(l4)) {
                if (arrayList.size() + 1 > hzVar.f0()) {
                    hzVar.showDialog(new kg.q0(4, hzVar.currentAccount, hzVar.getParentActivity(), hzVar, null));
                    return;
                }
                hzVar2 = hzVar;
                arrayList.add(l4);
                hzVar2.F = true;
                hzVar2.c0();
                ((org.telegram.ui.Cells.j4) view).c(true, true);
            } else {
                int i11 = -hzVar.f37901r;
                hzVar.f37901r = i11;
                org.telegram.messenger.i0.F3(i11, view, null);
                org.telegram.messenger.t2.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(hzVar.getMessagesController().Z1(l4));
                    TLRPC.User Z1 = hzVar.getMessagesController().Z1(l4);
                    if (Z1 != null && Z1.bot) {
                        str = org.telegram.messenger.dd.L0(2131750771, null);
                    } else {
                        str = org.telegram.messenger.dd.L0(2131750739, null);
                    }
                } else {
                    TLRPC.Chat L02 = hzVar.getMessagesController().L0(Long.valueOf(-longValue));
                    if (org.telegram.messenger.w3.V(L02)) {
                        if (org.telegram.messenger.w3.t0(L02)) {
                            L0 = org.telegram.messenger.dd.L0(2131750769, null);
                        } else {
                            L0 = org.telegram.messenger.dd.L0(2131750742, null);
                        }
                    } else if (org.telegram.messenger.w3.t0(L02)) {
                        L0 = org.telegram.messenger.dd.L0(2131750758, null);
                    } else {
                        L0 = org.telegram.messenger.dd.L0(2131750741, null);
                    }
                    arrayList2.add(L02);
                    str = L0;
                }
                if (hzVar.f37902s != longValue || System.currentTimeMillis() - hzVar.f37903w > 1500) {
                    hzVar.f37902s = longValue;
                    hzVar.f37903w = System.currentTimeMillis();
                    org.telegram.ui.Components.cc.a0(hzVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            hzVar2.d0();
            hzVar2.k0(true);
            hzVar2.l0();
        }
    }

    public final boolean b0(boolean z10) {
        if (this.e.isEmpty() || !this.F) {
            return true;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131743860, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131743859, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754216, null), new org.telegram.ui.ActionBar.u1(this) {
                public final hz f42359b;

                {
                    this.f42359b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f42359b.h0();
                            return;
                        default:
                            this.f42359b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747596, null), new org.telegram.ui.ActionBar.u1(this) {
                public final hz f42359b;

                {
                    this.f42359b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f42359b.h0();
                            return;
                        default:
                            this.f42359b.finishFragment();
                            return;
                    }
                }
            });
            showDialog(x1Var);
        }
        return false;
    }

    public final void c0() {
        boolean z10;
        org.telegram.ui.ActionBar.l5 l5Var = this.f37900n;
        if (this.F && !this.e.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l5Var.a(z10, true);
    }

    @Override
    public final boolean canBeginSlide() {
        return b0(true);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        boolean z10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        i0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 21));
        this.f37900n = this.simpleActionBar.n(org.telegram.messenger.dd.L0(2131745963, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        u71 u71Var = new u71(7, context, null);
        this.f37896a = u71Var;
        u71Var.setLayoutManager(new s4.a0(1, false));
        this.f37896a.setVerticalScrollBarEnabled(false);
        this.f37896a.r1();
        this.f37896a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f37896a, w7.b6.c(-1.0f, -1));
        u71 u71Var2 = this.f37896a;
        gz gzVar = new gz(this);
        this.f37897b = gzVar;
        u71Var2.setAdapter(gzVar);
        this.f37896a.setOnItemClickListener(new g(this, 9));
        org.telegram.messenger.wp messagesController = getMessagesController();
        org.telegram.messenger.bp bpVar = this.f37898c;
        messagesController.h5(bpVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f37899f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                long o10 = org.telegram.messenger.o5.o(tL_exportedChatlistInvite.peers.get(i10));
                arrayList2.add(Long.valueOf(o10));
                this.e.add(Long.valueOf(o10));
                arrayList3.add(Long.valueOf(o10));
            }
        }
        int i11 = 0;
        while (true) {
            ArrayList arrayList4 = bpVar.f15007k;
            arrayList = bpVar.f15007k;
            if (i11 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (dialog != null && !org.telegram.messenger.o5.C(dialog.f19798id) && !arrayList2.contains(Long.valueOf(dialog.f19798id))) {
                int i12 = (dialog.f19798id > 0L ? 1 : (dialog.f19798id == 0L ? 0 : -1));
                if (i12 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i12 < 0) {
                    z10 = h00.m0(getMessagesController().L0(Long.valueOf(-dialog.f19798id)));
                }
                if (z10) {
                    arrayList2.add(Long.valueOf(dialog.f19798id));
                    arrayList3.add(Long.valueOf(dialog.f19798id));
                }
            }
            i11++;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i13);
            if (dialog2 != null && !org.telegram.messenger.o5.C(dialog2.f19798id) && !arrayList2.contains(Long.valueOf(dialog2.f19798id)) && !arrayList3.contains(Long.valueOf(dialog2.f19798id))) {
                arrayList2.add(Long.valueOf(dialog2.f19798id));
            }
        }
        this.G = 1;
        if (tL_exportedChatlistInvite != null) {
            this.I = 1;
            this.H = 2;
            this.G = 4;
            this.J = 3;
        } else {
            this.I = -1;
            this.H = -1;
            this.J = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList2.isEmpty()) {
            this.K = -1;
            this.L = -1;
            this.M = -1;
            this.N = -1;
        } else {
            int i14 = this.G;
            int i15 = i14 + 1;
            this.K = i14;
            int i16 = i14 + 2;
            this.G = i16;
            this.L = i15;
            int size = (arrayList2.size() - 1) + i16;
            this.M = size;
            this.G = size + 1;
            this.N = size;
        }
        gz gzVar2 = this.f37897b;
        if (gzVar2 != null) {
            gzVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.F) {
            ArrayList arrayList = this.e;
            boolean z11 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                for (int i10 = 0; i10 < tL_exportedChatlistInvite.peers.size(); i10++) {
                    if (!arrayList.contains(Long.valueOf(org.telegram.messenger.o5.o(tL_exportedChatlistInvite.peers.get(i10))))) {
                        break;
                    }
                }
            }
            z11 = z10;
            if (!z11) {
                this.F = false;
                c0();
            }
        }
    }

    public final void e0(org.telegram.ui.Components.g00 g00Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f37899f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
            i10 = 2131751458;
        } else {
            i10 = 2131745687;
        }
        g00Var.a(org.telegram.messenger.dd.L0(i10, null), new ag.j0(this, g00Var, z10, 26));
        this.F = true;
        d0();
        c0();
        k0(true);
        l0();
        for (int i11 = 0; i11 < this.f37896a.getChildCount(); i11++) {
            View childAt = this.f37896a.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.j4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.j4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int f0() {
        if (getUserConfig().q()) {
            return getMessagesController().P4;
        }
        return getMessagesController().O4;
    }

    public final String g0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && (str = tL_exportedChatlistInvite.url) != null) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.f37896a;
    }

    public final void h0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.D && this.F) {
            j0(true);
            this.D = true;
            tL_exportedChatlistInvite.peers.clear();
            int i10 = 0;
            while (true) {
                arrayList = this.e;
                if (i10 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().y1(((Long) arrayList.get(i10)).longValue()));
                i10++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f37898c.f15000a;
            tL_chatlists_editExportedInvite.slug = g0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().i1(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new vy(this, 0));
            org.telegram.messenger.r20 r20Var = this.f37905y;
            if (r20Var != null) {
                r20Var.a(tL_exportedChatlistInvite);
            }
        }
    }

    public final void i0(boolean z10) {
        String str;
        String str2;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null) {
            str = null;
        } else {
            str = tL_exportedChatlistInvite.title;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = org.telegram.messenger.dd.L0(2131750707, null);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        if (z10) {
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            i5Var.getClass();
            i5Var.B(str3, false, 220L, org.telegram.ui.Components.gr.h);
            return;
        }
        this.simpleActionBar.setTitle(str3);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.i0.r(this.Q);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f37900n;
        if (l5Var != null) {
            l5Var.b(z10);
        }
    }

    public final void k0(boolean z10) {
        String G;
        int i10;
        org.telegram.ui.Components.g00 g00Var = this.O;
        if (g00Var != null) {
            ArrayList arrayList = this.e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                G = org.telegram.messenger.dd.M0("FilterInviteHeaderChatsEmpty");
            } else {
                G = org.telegram.messenger.dd.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            g00Var.b(G, z10);
            ArrayList arrayList2 = this.f37899f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.g00 g00Var2 = this.O;
                if (!z11) {
                    i10 = 2131745687;
                } else {
                    i10 = 2131751458;
                }
                g00Var2.a(org.telegram.messenger.dd.L0(i10, null), new k2.v(27, this, z11));
            } else {
                this.O.a("", null);
            }
            if (z10) {
                org.telegram.messenger.i0.i2(((Object) this.O.f26265a.getText()) + ", " + ((Object) this.O.f26266b.getText()));
            }
        }
    }

    public final void l0() {
        wy wyVar = this.P;
        if (wyVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String L0 = org.telegram.messenger.dd.L0(2131750751, null);
            nh.p pVar = wyVar.f43182a;
            pVar.setText(L0);
            pVar.f13894s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = wyVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.bp bpVar = this.f37898c;
        Spannable A5 = org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(bpVar.f15001b, fontMetricsInt, false, null, 0), bpVar.f15002c, fontMetricsInt, false);
        wy wyVar2 = this.P;
        SpannableStringBuilder V2 = org.telegram.messenger.i0.V2(org.telegram.messenger.dd.F("FilterInviteHeader", this.e.size(), A5));
        boolean z10 = bpVar.f15010n;
        nh.p pVar2 = wyVar2.f43182a;
        pVar2.setText(V2);
        if (z10) {
            i10 = 26;
        }
        pVar2.f13894s = i10;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return b0(z10);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.E != 0) {
            getConnectionsManager().cancelRequest(this.E, true);
            this.E = 0;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

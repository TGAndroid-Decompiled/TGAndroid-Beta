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
public final class iz extends org.telegram.ui.ActionBar.k2 {
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
    public xy P;
    public final rh Q;
    public w71 f38378a;
    public hz f38379b;
    public final org.telegram.messenger.ap f38380c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList e;
    public final ArrayList f38381f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.l5 f38382n;
    public int f38383r;
    public long f38384s;
    public long f38385w;
    public org.telegram.messenger.q20 f38386x;
    public org.telegram.messenger.q20 f38387y;

    public iz(org.telegram.messenger.ap apVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.e = new ArrayList();
        this.f38381f = new ArrayList();
        this.h = new ArrayList();
        this.f38383r = -5;
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
        this.f38380c = apVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Y(iz izVar, TLRPC.TL_error tL_error) {
        izVar.i0(false);
        izVar.D = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            izVar.showDialog(new kg.q0(12, izVar.currentAccount, izVar.getParentActivity(), izVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            izVar.showDialog(new kg.q0(4, izVar.currentAccount, izVar.getParentActivity(), izVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            izVar.showDialog(new kg.q0(13, izVar.currentAccount, izVar.getParentActivity(), izVar, null));
        } else {
            izVar.finishFragment();
        }
    }

    public static void Z(iz izVar, View view, int i10) {
        String L0;
        String str;
        iz izVar2;
        ArrayList arrayList = izVar.e;
        if (izVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.j4)) {
            Long l4 = (Long) izVar.h.get(i10 - izVar.L);
            long longValue = l4.longValue();
            if (arrayList.contains(l4)) {
                arrayList.remove(l4);
                izVar.F = true;
                izVar.b0();
                ((org.telegram.ui.Cells.j4) view).c(false, true);
                izVar2 = izVar;
            } else if (izVar.f38381f.contains(l4)) {
                if (arrayList.size() + 1 > izVar.e0()) {
                    izVar.showDialog(new kg.q0(4, izVar.currentAccount, izVar.getParentActivity(), izVar, null));
                    return;
                }
                izVar2 = izVar;
                arrayList.add(l4);
                izVar2.F = true;
                izVar2.b0();
                ((org.telegram.ui.Cells.j4) view).c(true, true);
            } else {
                int i11 = -izVar.f38383r;
                izVar.f38383r = i11;
                org.telegram.messenger.i0.F3(i11, view, null);
                org.telegram.messenger.t2.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(izVar.getMessagesController().Z1(l4));
                    TLRPC.User Z1 = izVar.getMessagesController().Z1(l4);
                    if (Z1 != null && Z1.bot) {
                        str = org.telegram.messenger.cd.L0(2131750771, null);
                    } else {
                        str = org.telegram.messenger.cd.L0(2131750739, null);
                    }
                } else {
                    TLRPC.Chat L02 = izVar.getMessagesController().L0(Long.valueOf(-longValue));
                    if (org.telegram.messenger.w3.V(L02)) {
                        if (org.telegram.messenger.w3.t0(L02)) {
                            L0 = org.telegram.messenger.cd.L0(2131750769, null);
                        } else {
                            L0 = org.telegram.messenger.cd.L0(2131750742, null);
                        }
                    } else if (org.telegram.messenger.w3.t0(L02)) {
                        L0 = org.telegram.messenger.cd.L0(2131750758, null);
                    } else {
                        L0 = org.telegram.messenger.cd.L0(2131750741, null);
                    }
                    arrayList2.add(L02);
                    str = L0;
                }
                if (izVar.f38384s != longValue || System.currentTimeMillis() - izVar.f38385w > 1500) {
                    izVar.f38384s = longValue;
                    izVar.f38385w = System.currentTimeMillis();
                    org.telegram.ui.Components.cc.a0(izVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            izVar2.c0();
            izVar2.j0(true);
            izVar2.k0();
        }
    }

    public final boolean a0(boolean z10) {
        if (this.e.isEmpty() || !this.F) {
            return true;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.cd.L0(2131743860, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.cd.L0(2131743859, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new org.telegram.ui.ActionBar.u1(this) {
                public final iz f42830b;

                {
                    this.f42830b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f42830b.g0();
                            return;
                        default:
                            this.f42830b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747596, null), new org.telegram.ui.ActionBar.u1(this) {
                public final iz f42830b;

                {
                    this.f42830b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i10) {
                    switch (r2) {
                        case 0:
                            this.f42830b.g0();
                            return;
                        default:
                            this.f42830b.finishFragment();
                            return;
                    }
                }
            });
            showDialog(x1Var);
        }
        return false;
    }

    public final void b0() {
        boolean z10;
        org.telegram.ui.ActionBar.l5 l5Var = this.f38382n;
        if (this.F && !this.e.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        l5Var.a(z10, true);
    }

    public final void c0() {
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
                b0();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        return a0(true);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        boolean z10;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        h0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 21));
        this.f38382n = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        b0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        w71 w71Var = new w71(7, context, null);
        this.f38378a = w71Var;
        w71Var.setLayoutManager(new s4.a0(1, false));
        this.f38378a.setVerticalScrollBarEnabled(false);
        this.f38378a.r1();
        this.f38378a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f38378a, w7.b6.c(-1.0f, -1));
        w71 w71Var2 = this.f38378a;
        hz hzVar = new hz(this);
        this.f38379b = hzVar;
        w71Var2.setAdapter(hzVar);
        this.f38378a.setOnItemClickListener(new g(this, 9));
        org.telegram.messenger.vp messagesController = getMessagesController();
        org.telegram.messenger.ap apVar = this.f38380c;
        messagesController.h5(apVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f38381f;
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
            ArrayList arrayList4 = apVar.f14652k;
            arrayList = apVar.f14652k;
            if (i11 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
            if (dialog != null && !org.telegram.messenger.o5.C(dialog.f19797id) && !arrayList2.contains(Long.valueOf(dialog.f19797id))) {
                int i12 = (dialog.f19797id > 0L ? 1 : (dialog.f19797id == 0L ? 0 : -1));
                if (i12 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i12 < 0) {
                    z10 = i00.l0(getMessagesController().L0(Long.valueOf(-dialog.f19797id)));
                }
                if (z10) {
                    arrayList2.add(Long.valueOf(dialog.f19797id));
                    arrayList3.add(Long.valueOf(dialog.f19797id));
                }
            }
            i11++;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i13);
            if (dialog2 != null && !org.telegram.messenger.o5.C(dialog2.f19797id) && !arrayList2.contains(Long.valueOf(dialog2.f19797id)) && !arrayList3.contains(Long.valueOf(dialog2.f19797id))) {
                arrayList2.add(Long.valueOf(dialog2.f19797id));
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
        hz hzVar2 = this.f38379b;
        if (hzVar2 != null) {
            hzVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0(org.telegram.ui.Components.g00 g00Var, boolean z10) {
        int i10;
        ArrayList arrayList = this.e;
        arrayList.clear();
        ArrayList arrayList2 = this.f38381f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(e0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(e0(), arrayList2.size())) {
            i10 = 2131751458;
        } else {
            i10 = 2131745687;
        }
        g00Var.a(org.telegram.messenger.cd.L0(i10, null), new ag.j0(this, g00Var, z10, 26));
        this.F = true;
        c0();
        b0();
        j0(true);
        k0();
        for (int i11 = 0; i11 < this.f38378a.getChildCount(); i11++) {
            View childAt = this.f38378a.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.j4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.j4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int e0() {
        if (getUserConfig().q()) {
            return getMessagesController().P4;
        }
        return getMessagesController().O4;
    }

    public final String f0() {
        String str;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && (str = tL_exportedChatlistInvite.url) != null) {
            return str.substring(str.lastIndexOf(47) + 1);
        }
        return null;
    }

    public final void g0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.D && this.F) {
            i0(true);
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
            tL_inputChatlistDialogFilter.filter_id = this.f38380c.f14645a;
            tL_chatlists_editExportedInvite.slug = f0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().i1(((Long) arrayList.get(i11)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new wy(this, 0));
            org.telegram.messenger.q20 q20Var = this.f38387y;
            if (q20Var != null) {
                q20Var.a(tL_exportedChatlistInvite);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f38378a;
    }

    public final void h0(boolean z10) {
        String str;
        String str2;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null) {
            str = null;
        } else {
            str = tL_exportedChatlistInvite.title;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = org.telegram.messenger.cd.L0(2131750707, null);
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

    public final void i0(boolean z10) {
        if (!z10) {
            org.telegram.messenger.i0.r(this.Q);
        }
        org.telegram.ui.ActionBar.l5 l5Var = this.f38382n;
        if (l5Var != null) {
            l5Var.b(z10);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z10) {
        String G;
        int i10;
        org.telegram.ui.Components.g00 g00Var = this.O;
        if (g00Var != null) {
            ArrayList arrayList = this.e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                G = org.telegram.messenger.cd.M0("FilterInviteHeaderChatsEmpty");
            } else {
                G = org.telegram.messenger.cd.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            g00Var.b(G, z10);
            ArrayList arrayList2 = this.f38381f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(e0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.g00 g00Var2 = this.O;
                if (!z11) {
                    i10 = 2131745687;
                } else {
                    i10 = 2131751458;
                }
                g00Var2.a(org.telegram.messenger.cd.L0(i10, null), new k2.v(27, this, z11));
            } else {
                this.O.a("", null);
            }
            if (z10) {
                org.telegram.messenger.i0.i2(((Object) this.O.f26204a.getText()) + ", " + ((Object) this.O.f26205b.getText()));
            }
        }
    }

    public final void k0() {
        xy xyVar = this.P;
        if (xyVar == null) {
            return;
        }
        int i10 = 0;
        if (this.d == null) {
            String L0 = org.telegram.messenger.cd.L0(2131750751, null);
            nh.p pVar = xyVar.f43666a;
            pVar.setText(L0);
            pVar.f13893s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = xyVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.ap apVar = this.f38380c;
        Spannable A5 = org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(apVar.f14646b, fontMetricsInt, false, null, 0), apVar.f14647c, fontMetricsInt, false);
        xy xyVar2 = this.P;
        SpannableStringBuilder V2 = org.telegram.messenger.i0.V2(org.telegram.messenger.cd.F("FilterInviteHeader", this.e.size(), A5));
        boolean z10 = apVar.f14655n;
        nh.p pVar2 = xyVar2.f43666a;
        pVar2.setText(V2);
        if (z10) {
            i10 = 26;
        }
        pVar2.f13893s = i10;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return a0(z10);
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

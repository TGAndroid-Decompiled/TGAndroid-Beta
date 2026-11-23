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
public final class jy extends org.telegram.ui.ActionBar.g2 {
    public boolean E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public org.telegram.ui.Components.d00 P;
    public xx Q;
    public final ch R;
    public d61 f49233a;
    public iy f49234b;
    public final org.telegram.messenger.ro f49235c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f49236e;
    public final ArrayList f49237f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.c5 f49238n;
    public int f49239r;
    public long f49240s;
    public long f49241w;
    public org.telegram.messenger.w10 f49242x;
    public org.telegram.messenger.w10 f49243y;

    public jy(org.telegram.messenger.ro roVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f49236e = new ArrayList();
        this.f49237f = new ArrayList();
        this.h = new ArrayList();
        this.f49239r = -5;
        this.E = false;
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.R = new ch(this, 28);
        this.f49235c = roVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(jy jyVar, TLRPC.TL_error tL_error) {
        jyVar.j0(false);
        jyVar.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            jyVar.showDialog(new ug.k0(12, jyVar.currentAccount, jyVar.getParentActivity(), jyVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            jyVar.showDialog(new ug.k0(4, jyVar.currentAccount, jyVar.getParentActivity(), jyVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            jyVar.showDialog(new ug.k0(13, jyVar.currentAccount, jyVar.getParentActivity(), jyVar, null));
        } else {
            jyVar.finishFragment();
        }
    }

    public static void a0(jy jyVar, View view, int i7) {
        String N0;
        String str;
        jy jyVar2;
        ArrayList arrayList = jyVar.f49236e;
        if (jyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.i4)) {
            Long l10 = (Long) jyVar.h.get(i7 - jyVar.M);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                jyVar.G = true;
                jyVar.c0();
                ((org.telegram.ui.Cells.i4) view).c(false, true);
                jyVar2 = jyVar;
            } else if (jyVar.f49237f.contains(l10)) {
                if (arrayList.size() + 1 > jyVar.f0()) {
                    jyVar.showDialog(new ug.k0(4, jyVar.currentAccount, jyVar.getParentActivity(), jyVar, null));
                    return;
                }
                jyVar2 = jyVar;
                arrayList.add(l10);
                jyVar2.G = true;
                jyVar2.c0();
                ((org.telegram.ui.Cells.i4) view).c(true, true);
            } else {
                int i10 = -jyVar.f49239r;
                jyVar.f49239r = i10;
                org.telegram.messenger.g0.E3(i10, view, null);
                org.telegram.messenger.q2.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(jyVar.getMessagesController().c2(l10));
                    TLRPC.User c22 = jyVar.getMessagesController().c2(l10);
                    if (c22 != null && c22.bot) {
                        str = org.telegram.messenger.gd.N0(2131750758, null);
                    } else {
                        str = org.telegram.messenger.gd.N0(2131750726, null);
                    }
                } else {
                    TLRPC.Chat O0 = jyVar.getMessagesController().O0(Long.valueOf(-longValue));
                    if (org.telegram.messenger.v3.V(O0)) {
                        if (org.telegram.messenger.v3.t0(O0)) {
                            N0 = org.telegram.messenger.gd.N0(2131750756, null);
                        } else {
                            N0 = org.telegram.messenger.gd.N0(2131750729, null);
                        }
                    } else if (org.telegram.messenger.v3.t0(O0)) {
                        N0 = org.telegram.messenger.gd.N0(2131750745, null);
                    } else {
                        N0 = org.telegram.messenger.gd.N0(2131750728, null);
                    }
                    arrayList2.add(O0);
                    str = N0;
                }
                if (jyVar.f49240s != longValue || System.currentTimeMillis() - jyVar.f49241w > 1500) {
                    jyVar.f49240s = longValue;
                    jyVar.f49241w = System.currentTimeMillis();
                    org.telegram.ui.Components.kc.b0(jyVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            jyVar2.d0();
            jyVar2.k0(true);
            jyVar2.l0();
        }
    }

    public final boolean b0(boolean z10) {
        if (this.f49236e.isEmpty() || !this.G) {
            return true;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String N0 = org.telegram.messenger.gd.N0(2131743588, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.gd.N0(2131743587, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754213, null), new org.telegram.ui.ActionBar.q1(this) {
                public final jy f53050b;

                {
                    this.f53050b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f53050b.h0();
                            return;
                        default:
                            this.f53050b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747386, null), new org.telegram.ui.ActionBar.q1(this) {
                public final jy f53050b;

                {
                    this.f53050b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f53050b.h0();
                            return;
                        default:
                            this.f53050b.finishFragment();
                            return;
                    }
                }
            });
            showDialog(t1Var);
        }
        return false;
    }

    public final void c0() {
        boolean z10;
        org.telegram.ui.ActionBar.c5 c5Var = this.f49238n;
        if (this.G && !this.f49236e.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        c5Var.a(z10, true);
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
        this.simpleActionBar.setBackButtonImage(2131231243);
        i0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new cv(this, 3));
        this.f49238n = this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        d61 d61Var = new d61(10, context, null);
        this.f49233a = d61Var;
        d61Var.setLayoutManager(new v4.c0(1, false));
        this.f49233a.setVerticalScrollBarEnabled(false);
        this.f49233a.r1();
        this.f49233a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f49233a, c8.na.c(-1.0f, -1));
        d61 d61Var2 = this.f49233a;
        iy iyVar = new iy(this);
        this.f49234b = iyVar;
        d61Var2.setAdapter(iyVar);
        this.f49233a.setOnItemClickListener(new h(this, 9));
        org.telegram.messenger.mp messagesController = getMessagesController();
        org.telegram.messenger.ro roVar = this.f49235c;
        messagesController.w5(roVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f49237f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                long o4 = org.telegram.messenger.n5.o(tL_exportedChatlistInvite.peers.get(i7));
                arrayList2.add(Long.valueOf(o4));
                this.f49236e.add(Long.valueOf(o4));
                arrayList3.add(Long.valueOf(o4));
            }
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = roVar.f26781k;
            arrayList = roVar.f26781k;
            if (i10 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (dialog != null && !org.telegram.messenger.n5.C(dialog.f28496id) && !arrayList2.contains(Long.valueOf(dialog.f28496id))) {
                int i11 = (dialog.f28496id > 0L ? 1 : (dialog.f28496id == 0L ? 0 : -1));
                if (i11 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 < 0) {
                    z10 = jz.m0(getMessagesController().O0(Long.valueOf(-dialog.f28496id)));
                }
                if (z10) {
                    arrayList2.add(Long.valueOf(dialog.f28496id));
                    arrayList3.add(Long.valueOf(dialog.f28496id));
                }
            }
            i10++;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i12);
            if (dialog2 != null && !org.telegram.messenger.n5.C(dialog2.f28496id) && !arrayList2.contains(Long.valueOf(dialog2.f28496id)) && !arrayList3.contains(Long.valueOf(dialog2.f28496id))) {
                arrayList2.add(Long.valueOf(dialog2.f28496id));
            }
        }
        this.H = 1;
        if (tL_exportedChatlistInvite != null) {
            this.J = 1;
            this.I = 2;
            this.H = 4;
            this.K = 3;
        } else {
            this.J = -1;
            this.I = -1;
            this.K = -1;
        }
        if (tL_exportedChatlistInvite == null && arrayList2.isEmpty()) {
            this.L = -1;
            this.M = -1;
            this.N = -1;
            this.O = -1;
        } else {
            int i13 = this.H;
            int i14 = i13 + 1;
            this.L = i13;
            int i15 = i13 + 2;
            this.H = i15;
            this.M = i14;
            int size = (arrayList2.size() - 1) + i15;
            this.N = size;
            this.H = size + 1;
            this.O = size;
        }
        iy iyVar2 = this.f49234b;
        if (iyVar2 != null) {
            iyVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.G) {
            ArrayList arrayList = this.f49236e;
            boolean z11 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                    if (!arrayList.contains(Long.valueOf(org.telegram.messenger.n5.o(tL_exportedChatlistInvite.peers.get(i7))))) {
                        break;
                    }
                }
            }
            z11 = z10;
            if (!z11) {
                this.G = false;
                c0();
            }
        }
    }

    public final void e0(org.telegram.ui.Components.d00 d00Var, boolean z10) {
        int i7;
        ArrayList arrayList = this.f49236e;
        arrayList.clear();
        ArrayList arrayList2 = this.f49237f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
            i7 = 2131751445;
        } else {
            i7 = 2131745474;
        }
        d00Var.a(org.telegram.messenger.gd.N0(i7, null), new di.p6(this, d00Var, z10, 28));
        this.G = true;
        d0();
        c0();
        k0(true);
        l0();
        for (int i10 = 0; i10 < this.f49233a.getChildCount(); i10++) {
            View childAt = this.f49233a.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.i4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.i4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int f0() {
        if (getUserConfig().q()) {
            return getMessagesController().R4;
        }
        return getMessagesController().Q4;
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
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f49233a;
    }

    public final void h0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.E && this.G) {
            j0(true);
            this.E = true;
            tL_exportedChatlistInvite.peers.clear();
            int i7 = 0;
            while (true) {
                arrayList = this.f49236e;
                if (i7 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().B1(((Long) arrayList.get(i7)).longValue()));
                i7++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f49235c.f26773a;
            tL_chatlists_editExportedInvite.slug = g0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().l1(((Long) arrayList.get(i10)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new wx(this, 0));
            org.telegram.messenger.w10 w10Var = this.f49243y;
            if (w10Var != null) {
                w10Var.a(tL_exportedChatlistInvite);
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
            str2 = org.telegram.messenger.gd.N0(2131750692, null);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        if (z10) {
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            z4Var.getClass();
            z4Var.H(str3, false, 220L, org.telegram.ui.Components.kr.h);
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
            org.telegram.messenger.g0.r(this.R);
        }
        org.telegram.ui.ActionBar.c5 c5Var = this.f49238n;
        if (c5Var != null) {
            c5Var.b(z10);
        }
    }

    public final void k0(boolean z10) {
        String G;
        int i7;
        org.telegram.ui.Components.d00 d00Var = this.P;
        if (d00Var != null) {
            ArrayList arrayList = this.f49236e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                G = org.telegram.messenger.gd.O0("FilterInviteHeaderChatsEmpty");
            } else {
                G = org.telegram.messenger.gd.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            d00Var.b(G, z10);
            ArrayList arrayList2 = this.f49237f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.d00 d00Var2 = this.P;
                if (!z11) {
                    i7 = 2131745474;
                } else {
                    i7 = 2131751445;
                }
                d00Var2.a(org.telegram.messenger.gd.N0(i7, null), new org.telegram.ui.Components.qp0(8, this, z11));
            } else {
                this.P.a("", null);
            }
            if (z10) {
                org.telegram.messenger.g0.i2(((Object) this.P.f34179a.getText()) + ", " + ((Object) this.P.f34180b.getText()));
            }
        }
    }

    public final void l0() {
        xx xxVar = this.Q;
        if (xxVar == null) {
            return;
        }
        int i7 = 0;
        if (this.d == null) {
            String N0 = org.telegram.messenger.gd.N0(2131750738, null);
            xh.l lVar = xxVar.f54116a;
            lVar.setText(N0);
            lVar.f60729s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = xxVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.ro roVar = this.f49235c;
        Spannable B5 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(roVar.f26774b, fontMetricsInt, false, null, 0), roVar.f26775c, fontMetricsInt, false);
        xx xxVar2 = this.Q;
        SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(org.telegram.messenger.gd.F("FilterInviteHeader", this.f49236e.size(), B5));
        boolean z10 = roVar.f26784n;
        xh.l lVar2 = xxVar2.f54116a;
        lVar2.setText(V2);
        if (z10) {
            i7 = 26;
        }
        lVar2.f60729s = i7;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return b0(z10);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.F != 0) {
            getConnectionsManager().cancelRequest(this.F, true);
            this.F = 0;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}

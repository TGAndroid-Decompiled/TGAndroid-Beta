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
public final class cy extends org.telegram.ui.ActionBar.d2 {
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
    public org.telegram.ui.Components.oz P;
    public rx Q;
    public final xg R;
    public u51 f44475a;
    public ay f44476b;
    public final org.telegram.messenger.mo f44477c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f44478e;
    public final ArrayList f44479f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.b5 f44480n;
    public int f44481r;
    public long f44482s;
    public long f44483w;
    public org.telegram.messenger.u10 f44484x;
    public org.telegram.messenger.u10 f44485y;

    public cy(org.telegram.messenger.mo moVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f44478e = new ArrayList();
        this.f44479f = new ArrayList();
        this.h = new ArrayList();
        this.f44481r = -5;
        this.E = false;
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.R = new xg(this, 28);
        this.f44477c = moVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(cy cyVar, TLRPC.TL_error tL_error) {
        cyVar.j0(false);
        cyVar.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            cyVar.showDialog(new vg.i0(12, cyVar.currentAccount, cyVar.getParentActivity(), cyVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            cyVar.showDialog(new vg.i0(4, cyVar.currentAccount, cyVar.getParentActivity(), cyVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            cyVar.showDialog(new vg.i0(13, cyVar.currentAccount, cyVar.getParentActivity(), cyVar, null));
        } else {
            cyVar.finishFragment();
        }
    }

    public static void a0(cy cyVar, View view, int i3) {
        String M0;
        String str;
        cy cyVar2;
        ArrayList arrayList = cyVar.f44478e;
        if (cyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.h4)) {
            Long l10 = (Long) cyVar.h.get(i3 - cyVar.M);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                cyVar.G = true;
                cyVar.c0();
                ((org.telegram.ui.Cells.h4) view).c(false, true);
                cyVar2 = cyVar;
            } else if (cyVar.f44479f.contains(l10)) {
                if (arrayList.size() + 1 > cyVar.f0()) {
                    cyVar.showDialog(new vg.i0(4, cyVar.currentAccount, cyVar.getParentActivity(), cyVar, null));
                    return;
                }
                cyVar2 = cyVar;
                arrayList.add(l10);
                cyVar2.G = true;
                cyVar2.c0();
                ((org.telegram.ui.Cells.h4) view).c(true, true);
            } else {
                int i10 = -cyVar.f44481r;
                cyVar.f44481r = i10;
                org.telegram.messenger.g0.G3(i10, view, null);
                org.telegram.messenger.p2.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(cyVar.getMessagesController().a2(l10));
                    TLRPC.User a22 = cyVar.getMessagesController().a2(l10);
                    if (a22 != null && a22.bot) {
                        str = org.telegram.messenger.bd.M0(2131750771, null);
                    } else {
                        str = org.telegram.messenger.bd.M0(2131750739, null);
                    }
                } else {
                    TLRPC.Chat M02 = cyVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (org.telegram.messenger.t3.V(M02)) {
                        if (org.telegram.messenger.t3.t0(M02)) {
                            M0 = org.telegram.messenger.bd.M0(2131750769, null);
                        } else {
                            M0 = org.telegram.messenger.bd.M0(2131750742, null);
                        }
                    } else if (org.telegram.messenger.t3.t0(M02)) {
                        M0 = org.telegram.messenger.bd.M0(2131750758, null);
                    } else {
                        M0 = org.telegram.messenger.bd.M0(2131750741, null);
                    }
                    arrayList2.add(M02);
                    str = M0;
                }
                if (cyVar.f44482s != longValue || System.currentTimeMillis() - cyVar.f44483w > 1500) {
                    cyVar.f44482s = longValue;
                    cyVar.f44483w = System.currentTimeMillis();
                    org.telegram.ui.Components.fc.a0(cyVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            cyVar2.d0();
            cyVar2.k0(true);
            cyVar2.l0();
        }
    }

    public final boolean b0(boolean z10) {
        if (this.f44478e.isEmpty() || !this.G) {
            return true;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131743845, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131743844, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new org.telegram.ui.ActionBar.p1(this) {
                public final cy f48701b;

                {
                    this.f48701b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                    switch (r2) {
                        case 0:
                            this.f48701b.h0();
                            return;
                        default:
                            this.f48701b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747588, null), new org.telegram.ui.ActionBar.p1(this) {
                public final cy f48701b;

                {
                    this.f48701b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i3) {
                    switch (r2) {
                        case 0:
                            this.f48701b.h0();
                            return;
                        default:
                            this.f48701b.finishFragment();
                            return;
                    }
                }
            });
            showDialog(s1Var);
        }
        return false;
    }

    public final void c0() {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var = this.f44480n;
        if (this.G && !this.f44478e.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        b5Var.a(z10, true);
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
        this.simpleActionBar.setBackButtonImage(2131231240);
        i0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 1));
        this.f44480n = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        u51 u51Var = new u51(9, context, null);
        this.f44475a = u51Var;
        u51Var.setLayoutManager(new u4.b0(1, false));
        this.f44475a.setVerticalScrollBarEnabled(false);
        this.f44475a.r1();
        this.f44475a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f44475a, b8.mf.c(-1.0f, -1));
        u51 u51Var2 = this.f44475a;
        ay ayVar = new ay(this);
        this.f44476b = ayVar;
        u51Var2.setAdapter(ayVar);
        this.f44475a.setOnItemClickListener(new h(this, 9));
        org.telegram.messenger.hp messagesController = getMessagesController();
        org.telegram.messenger.mo moVar = this.f44477c;
        messagesController.k5(moVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f44479f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i3 = 0; i3 < tL_exportedChatlistInvite.peers.size(); i3++) {
                long o10 = org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i3));
                arrayList2.add(Long.valueOf(o10));
                this.f44478e.add(Long.valueOf(o10));
                arrayList3.add(Long.valueOf(o10));
            }
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = moVar.f24245k;
            arrayList = moVar.f24245k;
            if (i10 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (dialog != null && !org.telegram.messenger.m5.C(dialog.f27005id) && !arrayList2.contains(Long.valueOf(dialog.f27005id))) {
                int i11 = (dialog.f27005id > 0L ? 1 : (dialog.f27005id == 0L ? 0 : -1));
                if (i11 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 < 0) {
                    z10 = ez.m0(getMessagesController().M0(Long.valueOf(-dialog.f27005id)));
                }
                if (z10) {
                    arrayList2.add(Long.valueOf(dialog.f27005id));
                    arrayList3.add(Long.valueOf(dialog.f27005id));
                }
            }
            i10++;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i12);
            if (dialog2 != null && !org.telegram.messenger.m5.C(dialog2.f27005id) && !arrayList2.contains(Long.valueOf(dialog2.f27005id)) && !arrayList3.contains(Long.valueOf(dialog2.f27005id))) {
                arrayList2.add(Long.valueOf(dialog2.f27005id));
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
        ay ayVar2 = this.f44476b;
        if (ayVar2 != null) {
            ayVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.G) {
            ArrayList arrayList = this.f44478e;
            boolean z11 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                for (int i3 = 0; i3 < tL_exportedChatlistInvite.peers.size(); i3++) {
                    if (!arrayList.contains(Long.valueOf(org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i3))))) {
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

    public final void e0(org.telegram.ui.Components.oz ozVar, boolean z10) {
        int i3;
        ArrayList arrayList = this.f44478e;
        arrayList.clear();
        ArrayList arrayList2 = this.f44479f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
            i3 = 2131751458;
        } else {
            i3 = 2131745680;
        }
        ozVar.a(org.telegram.messenger.bd.M0(i3, null), new ci.v6(this, ozVar, z10, 29));
        this.G = true;
        d0();
        c0();
        k0(true);
        l0();
        for (int i10 = 0; i10 < this.f44475a.getChildCount(); i10++) {
            View childAt = this.f44475a.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.h4) {
                Object tag = childAt.getTag();
                if (tag instanceof Long) {
                    ((org.telegram.ui.Cells.h4) childAt).c(arrayList.contains((Long) tag), true);
                }
            }
        }
    }

    public final int f0() {
        if (getUserConfig().q()) {
            return getMessagesController().O4;
        }
        return getMessagesController().N4;
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
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.f44475a;
    }

    public final void h0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.E && this.G) {
            j0(true);
            this.E = true;
            tL_exportedChatlistInvite.peers.clear();
            int i3 = 0;
            while (true) {
                arrayList = this.f44478e;
                if (i3 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().z1(((Long) arrayList.get(i3)).longValue()));
                i3++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f44477c.f24237a;
            tL_chatlists_editExportedInvite.slug = g0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().j1(((Long) arrayList.get(i10)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new qx(this, 0));
            org.telegram.messenger.u10 u10Var = this.f44485y;
            if (u10Var != null) {
                u10Var.a(tL_exportedChatlistInvite);
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
            str2 = org.telegram.messenger.bd.M0(2131750707, null);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        if (z10) {
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            y4Var.getClass();
            y4Var.A(str3, false, 220L, org.telegram.ui.Components.xq.h);
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
        org.telegram.ui.ActionBar.b5 b5Var = this.f44480n;
        if (b5Var != null) {
            b5Var.b(z10);
        }
    }

    public final void k0(boolean z10) {
        String G;
        int i3;
        org.telegram.ui.Components.oz ozVar = this.P;
        if (ozVar != null) {
            ArrayList arrayList = this.f44478e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                G = org.telegram.messenger.bd.N0("FilterInviteHeaderChatsEmpty");
            } else {
                G = org.telegram.messenger.bd.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            ozVar.b(G, z10);
            ArrayList arrayList2 = this.f44479f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.oz ozVar2 = this.P;
                if (!z11) {
                    i3 = 2131745680;
                } else {
                    i3 = 2131751458;
                }
                ozVar2.a(org.telegram.messenger.bd.M0(i3, null), new org.telegram.ui.Components.up0(7, this, z11));
            } else {
                this.P.a("", null);
            }
            if (z10) {
                org.telegram.messenger.g0.i2(((Object) this.P.f36985a.getText()) + ", " + ((Object) this.P.f36986b.getText()));
            }
        }
    }

    public final void l0() {
        rx rxVar = this.Q;
        if (rxVar == null) {
            return;
        }
        int i3 = 0;
        if (this.d == null) {
            String M0 = org.telegram.messenger.bd.M0(2131750751, null);
            yh.l lVar = rxVar.f49301a;
            lVar.setText(M0);
            lVar.f59561s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = rxVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.mo moVar = this.f44477c;
        Spannable C5 = org.telegram.messenger.zi.C5(org.telegram.messenger.i6.m(moVar.f24238b, fontMetricsInt, false, null, 0), moVar.f24239c, fontMetricsInt, false);
        rx rxVar2 = this.Q;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.bd.F("FilterInviteHeader", this.f44478e.size(), C5));
        boolean z10 = moVar.f24248n;
        yh.l lVar2 = rxVar2.f49301a;
        lVar2.setText(W2);
        if (z10) {
            i3 = 26;
        }
        lVar2.f59561s = i3;
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

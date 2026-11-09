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
public final class iy extends org.telegram.ui.ActionBar.f2 {
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
    public org.telegram.ui.Components.tz O;
    public xx P;
    public final dh Q;
    public f61 f46774a;
    public hy f46775b;
    public final org.telegram.messenger.vo f46776c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f46777e;
    public final ArrayList f46778f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.b5 f46779n;
    public int f46780r;
    public long f46781s;
    public long f46782w;
    public org.telegram.messenger.c20 f46783x;
    public org.telegram.messenger.c20 f46784y;

    public iy(org.telegram.messenger.vo voVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f46777e = new ArrayList();
        this.f46778f = new ArrayList();
        this.h = new ArrayList();
        this.f46780r = -5;
        this.D = false;
        this.G = 0;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.Q = new dh(this, 28);
        this.f46776c = voVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(iy iyVar, TLRPC.TL_error tL_error) {
        iyVar.j0(false);
        iyVar.D = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            iyVar.showDialog(new ug.i0(12, iyVar.currentAccount, iyVar.getParentActivity(), iyVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            iyVar.showDialog(new ug.i0(4, iyVar.currentAccount, iyVar.getParentActivity(), iyVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            iyVar.showDialog(new ug.i0(13, iyVar.currentAccount, iyVar.getParentActivity(), iyVar, null));
        } else {
            iyVar.finishFragment();
        }
    }

    public static void a0(iy iyVar, View view, int i7) {
        String M0;
        String str;
        iy iyVar2;
        ArrayList arrayList = iyVar.f46777e;
        if (iyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.h4)) {
            Long l10 = (Long) iyVar.h.get(i7 - iyVar.L);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                iyVar.F = true;
                iyVar.c0();
                ((org.telegram.ui.Cells.h4) view).c(false, true);
                iyVar2 = iyVar;
            } else if (iyVar.f46778f.contains(l10)) {
                if (arrayList.size() + 1 > iyVar.f0()) {
                    iyVar.showDialog(new ug.i0(4, iyVar.currentAccount, iyVar.getParentActivity(), iyVar, null));
                    return;
                }
                iyVar2 = iyVar;
                arrayList.add(l10);
                iyVar2.F = true;
                iyVar2.c0();
                ((org.telegram.ui.Cells.h4) view).c(true, true);
            } else {
                int i10 = -iyVar.f46780r;
                iyVar.f46780r = i10;
                org.telegram.messenger.g0.G3(i10, view, null);
                org.telegram.messenger.p2.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(iyVar.getMessagesController().a2(l10));
                    TLRPC.User a22 = iyVar.getMessagesController().a2(l10);
                    if (a22 != null && a22.bot) {
                        str = org.telegram.messenger.id.M0(2131750770, null);
                    } else {
                        str = org.telegram.messenger.id.M0(2131750738, null);
                    }
                } else {
                    TLRPC.Chat M02 = iyVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (org.telegram.messenger.t3.V(M02)) {
                        if (org.telegram.messenger.t3.t0(M02)) {
                            M0 = org.telegram.messenger.id.M0(2131750768, null);
                        } else {
                            M0 = org.telegram.messenger.id.M0(2131750741, null);
                        }
                    } else if (org.telegram.messenger.t3.t0(M02)) {
                        M0 = org.telegram.messenger.id.M0(2131750757, null);
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131750740, null);
                    }
                    arrayList2.add(M02);
                    str = M0;
                }
                if (iyVar.f46781s != longValue || System.currentTimeMillis() - iyVar.f46782w > 1500) {
                    iyVar.f46781s = longValue;
                    iyVar.f46782w = System.currentTimeMillis();
                    org.telegram.ui.Components.hc.a0(iyVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            iyVar2.d0();
            iyVar2.k0(true);
            iyVar2.l0();
        }
    }

    public final boolean b0(boolean z9) {
        if (this.f46777e.isEmpty() || !this.F) {
            return true;
        }
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131743835, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131743834, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new org.telegram.ui.ActionBar.r1(this) {
                public final iy f50494b;

                {
                    this.f50494b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f50494b.h0();
                            return;
                        default:
                            this.f50494b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747580, null), new org.telegram.ui.ActionBar.r1(this) {
                public final iy f50494b;

                {
                    this.f50494b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f50494b.h0();
                            return;
                        default:
                            this.f50494b.finishFragment();
                            return;
                    }
                }
            });
            showDialog(u1Var);
        }
        return false;
    }

    public final void c0() {
        boolean z9;
        org.telegram.ui.ActionBar.b5 b5Var = this.f46779n;
        if (this.F && !this.f46777e.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        b5Var.a(z9, true);
    }

    @Override
    public final boolean canBeginSlide() {
        return b0(true);
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        boolean z9;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        i0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new wx(this, 0));
        this.f46779n = this.simpleActionBar.o(org.telegram.messenger.id.M0(2131745946, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        f61 f61Var = new f61(10, context, null);
        this.f46774a = f61Var;
        f61Var.setLayoutManager(new v4.b0(1, false));
        this.f46774a.setVerticalScrollBarEnabled(false);
        this.f46774a.r1();
        this.f46774a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f46774a, c8.ha.c(-1.0f, -1));
        f61 f61Var2 = this.f46774a;
        hy hyVar = new hy(this);
        this.f46775b = hyVar;
        f61Var2.setAdapter(hyVar);
        this.f46774a.setOnItemClickListener(new h(this, 9));
        org.telegram.messenger.qp messagesController = getMessagesController();
        org.telegram.messenger.vo voVar = this.f46776c;
        messagesController.k5(voVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f46778f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                long o4 = org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i7));
                arrayList2.add(Long.valueOf(o4));
                this.f46777e.add(Long.valueOf(o4));
                arrayList3.add(Long.valueOf(o4));
            }
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = voVar.f26078k;
            arrayList = voVar.f26078k;
            if (i10 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (dialog != null && !org.telegram.messenger.m5.C(dialog.f26960id) && !arrayList2.contains(Long.valueOf(dialog.f26960id))) {
                int i11 = (dialog.f26960id > 0L ? 1 : (dialog.f26960id == 0L ? 0 : -1));
                if (i11 < 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i11 < 0) {
                    z9 = iz.m0(getMessagesController().M0(Long.valueOf(-dialog.f26960id)));
                }
                if (z9) {
                    arrayList2.add(Long.valueOf(dialog.f26960id));
                    arrayList3.add(Long.valueOf(dialog.f26960id));
                }
            }
            i10++;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i12);
            if (dialog2 != null && !org.telegram.messenger.m5.C(dialog2.f26960id) && !arrayList2.contains(Long.valueOf(dialog2.f26960id)) && !arrayList3.contains(Long.valueOf(dialog2.f26960id))) {
                arrayList2.add(Long.valueOf(dialog2.f26960id));
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
            int i13 = this.G;
            int i14 = i13 + 1;
            this.K = i13;
            int i15 = i13 + 2;
            this.G = i15;
            this.L = i14;
            int size = (arrayList2.size() - 1) + i15;
            this.M = size;
            this.G = size + 1;
            this.N = size;
        }
        hy hyVar2 = this.f46775b;
        if (hyVar2 != null) {
            hyVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0() {
        boolean z9;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.F) {
            ArrayList arrayList = this.f46777e;
            boolean z10 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                    if (!arrayList.contains(Long.valueOf(org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i7))))) {
                        break;
                    }
                }
            }
            z10 = z9;
            if (!z10) {
                this.F = false;
                c0();
            }
        }
    }

    public final void e0(org.telegram.ui.Components.tz tzVar, boolean z9) {
        int i7;
        ArrayList arrayList = this.f46777e;
        arrayList.clear();
        ArrayList arrayList2 = this.f46778f;
        if (!z9) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
            i7 = 2131751457;
        } else {
            i7 = 2131745670;
        }
        tzVar.a(org.telegram.messenger.id.M0(i7, null), new bi.u7(this, tzVar, z9, 29));
        this.F = true;
        d0();
        c0();
        k0(true);
        l0();
        for (int i10 = 0; i10 < this.f46774a.getChildCount(); i10++) {
            View childAt = this.f46774a.getChildAt(i10);
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
    public final org.telegram.ui.Components.qj0 getListViewForSimpleGlass() {
        return this.f46774a;
    }

    public final void h0() {
        ArrayList arrayList;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && !this.D && this.F) {
            j0(true);
            this.D = true;
            tL_exportedChatlistInvite.peers.clear();
            int i7 = 0;
            while (true) {
                arrayList = this.f46777e;
                if (i7 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().z1(((Long) arrayList.get(i7)).longValue()));
                i7++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f46776c.f26070a;
            tL_chatlists_editExportedInvite.slug = g0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().j1(((Long) arrayList.get(i10)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new vx(this, 0));
            org.telegram.messenger.c20 c20Var = this.f46784y;
            if (c20Var != null) {
                c20Var.a(tL_exportedChatlistInvite);
            }
        }
    }

    public final void i0(boolean z9) {
        String str;
        String str2;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite == null) {
            str = null;
        } else {
            str = tL_exportedChatlistInvite.title;
        }
        if (TextUtils.isEmpty(str)) {
            str2 = org.telegram.messenger.id.M0(2131750706, null);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        if (z9) {
            org.telegram.ui.ActionBar.y4 y4Var = this.simpleActionBar;
            y4Var.getClass();
            y4Var.B(str3, false, 220L, org.telegram.ui.Components.xq.h);
            return;
        }
        this.simpleActionBar.setTitle(str3);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.r(this.Q);
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.f46779n;
        if (b5Var != null) {
            b5Var.b(z9);
        }
    }

    public final void k0(boolean z9) {
        String G;
        int i7;
        org.telegram.ui.Components.tz tzVar = this.O;
        if (tzVar != null) {
            ArrayList arrayList = this.f46777e;
            boolean z10 = false;
            if (arrayList.size() <= 0) {
                G = org.telegram.messenger.id.N0("FilterInviteHeaderChatsEmpty");
            } else {
                G = org.telegram.messenger.id.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            tzVar.b(G, z9);
            ArrayList arrayList2 = this.f46778f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
                    z10 = true;
                }
                org.telegram.ui.Components.tz tzVar2 = this.O;
                if (!z10) {
                    i7 = 2131745670;
                } else {
                    i7 = 2131751457;
                }
                tzVar2.a(org.telegram.messenger.id.M0(i7, null), new org.telegram.ui.Components.up0(7, this, z10));
            } else {
                this.O.a("", null);
            }
            if (z9) {
                org.telegram.messenger.g0.i2(((Object) this.O.f38536a.getText()) + ", " + ((Object) this.O.f38537b.getText()));
            }
        }
    }

    public final void l0() {
        xx xxVar = this.P;
        if (xxVar == null) {
            return;
        }
        int i7 = 0;
        if (this.d == null) {
            String M0 = org.telegram.messenger.id.M0(2131750750, null);
            xh.l lVar = xxVar.f51788a;
            lVar.setText(M0);
            lVar.f58853s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = xxVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.vo voVar = this.f46776c;
        Spannable B5 = org.telegram.messenger.ij.B5(org.telegram.messenger.i6.m(voVar.f26071b, fontMetricsInt, false, null, 0), voVar.f26072c, fontMetricsInt, false);
        xx xxVar2 = this.P;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.id.F("FilterInviteHeader", this.f46777e.size(), B5));
        boolean z9 = voVar.f26081n;
        xh.l lVar2 = xxVar2.f51788a;
        lVar2.setText(W2);
        if (z9) {
            i7 = 26;
        }
        lVar2.f58853s = i7;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        return b0(z9);
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

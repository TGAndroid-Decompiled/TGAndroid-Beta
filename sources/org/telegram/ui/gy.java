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
public final class gy extends org.telegram.ui.ActionBar.f2 {
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
    public vx P;
    public final bh Q;
    public e61 f46143a;
    public fy f46144b;
    public final org.telegram.messenger.vo f46145c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f46146e;
    public final ArrayList f46147f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.b5 f46148n;
    public int f46149r;
    public long f46150s;
    public long f46151w;
    public org.telegram.messenger.c20 f46152x;
    public org.telegram.messenger.c20 f46153y;

    public gy(org.telegram.messenger.vo voVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f46146e = new ArrayList();
        this.f46147f = new ArrayList();
        this.h = new ArrayList();
        this.f46149r = -5;
        this.D = false;
        this.G = 0;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.Q = new bh(this, 28);
        this.f46145c = voVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(gy gyVar, TLRPC.TL_error tL_error) {
        gyVar.j0(false);
        gyVar.D = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            gyVar.showDialog(new ug.i0(12, gyVar.currentAccount, gyVar.getParentActivity(), gyVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            gyVar.showDialog(new ug.i0(4, gyVar.currentAccount, gyVar.getParentActivity(), gyVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            gyVar.showDialog(new ug.i0(13, gyVar.currentAccount, gyVar.getParentActivity(), gyVar, null));
        } else {
            gyVar.finishFragment();
        }
    }

    public static void a0(gy gyVar, View view, int i7) {
        String M0;
        String str;
        gy gyVar2;
        ArrayList arrayList = gyVar.f46146e;
        if (gyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.h4)) {
            Long l10 = (Long) gyVar.h.get(i7 - gyVar.L);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                gyVar.F = true;
                gyVar.c0();
                ((org.telegram.ui.Cells.h4) view).c(false, true);
                gyVar2 = gyVar;
            } else if (gyVar.f46147f.contains(l10)) {
                if (arrayList.size() + 1 > gyVar.f0()) {
                    gyVar.showDialog(new ug.i0(4, gyVar.currentAccount, gyVar.getParentActivity(), gyVar, null));
                    return;
                }
                gyVar2 = gyVar;
                arrayList.add(l10);
                gyVar2.F = true;
                gyVar2.c0();
                ((org.telegram.ui.Cells.h4) view).c(true, true);
            } else {
                int i10 = -gyVar.f46149r;
                gyVar.f46149r = i10;
                org.telegram.messenger.g0.G3(i10, view, null);
                org.telegram.messenger.p2.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(gyVar.getMessagesController().a2(l10));
                    TLRPC.User a22 = gyVar.getMessagesController().a2(l10);
                    if (a22 != null && a22.bot) {
                        str = org.telegram.messenger.id.M0(2131750771, null);
                    } else {
                        str = org.telegram.messenger.id.M0(2131750739, null);
                    }
                } else {
                    TLRPC.Chat M02 = gyVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (org.telegram.messenger.t3.V(M02)) {
                        if (org.telegram.messenger.t3.t0(M02)) {
                            M0 = org.telegram.messenger.id.M0(2131750769, null);
                        } else {
                            M0 = org.telegram.messenger.id.M0(2131750742, null);
                        }
                    } else if (org.telegram.messenger.t3.t0(M02)) {
                        M0 = org.telegram.messenger.id.M0(2131750758, null);
                    } else {
                        M0 = org.telegram.messenger.id.M0(2131750741, null);
                    }
                    arrayList2.add(M02);
                    str = M0;
                }
                if (gyVar.f46150s != longValue || System.currentTimeMillis() - gyVar.f46151w > 1500) {
                    gyVar.f46150s = longValue;
                    gyVar.f46151w = System.currentTimeMillis();
                    org.telegram.ui.Components.hc.a0(gyVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            gyVar2.d0();
            gyVar2.k0(true);
            gyVar2.l0();
        }
    }

    public final boolean b0(boolean z9) {
        if (this.f46146e.isEmpty() || !this.F) {
            return true;
        }
        if (z9) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.id.M0(2131743838, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.id.M0(2131743837, null);
            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new org.telegram.ui.ActionBar.r1(this) {
                public final gy f49854b;

                {
                    this.f49854b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f49854b.h0();
                            return;
                        default:
                            this.f49854b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131747581, null), new org.telegram.ui.ActionBar.r1(this) {
                public final gy f49854b;

                {
                    this.f49854b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f49854b.h0();
                            return;
                        default:
                            this.f49854b.finishFragment();
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
        org.telegram.ui.ActionBar.b5 b5Var = this.f46148n;
        if (this.F && !this.f46146e.isEmpty()) {
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 0));
        this.f46148n = this.simpleActionBar.n(org.telegram.messenger.id.M0(2131745949, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        e61 e61Var = new e61(10, context, null);
        this.f46143a = e61Var;
        e61Var.setLayoutManager(new v4.b0(1, false));
        this.f46143a.setVerticalScrollBarEnabled(false);
        this.f46143a.r1();
        this.f46143a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f46143a, c8.ha.c(-1.0f, -1));
        e61 e61Var2 = this.f46143a;
        fy fyVar = new fy(this);
        this.f46144b = fyVar;
        e61Var2.setAdapter(fyVar);
        this.f46143a.setOnItemClickListener(new h(this, 9));
        org.telegram.messenger.qp messagesController = getMessagesController();
        org.telegram.messenger.vo voVar = this.f46145c;
        messagesController.k5(voVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f46147f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                long o4 = org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i7));
                arrayList2.add(Long.valueOf(o4));
                this.f46146e.add(Long.valueOf(o4));
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
                    z9 = gz.m0(getMessagesController().M0(Long.valueOf(-dialog.f26960id)));
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
        fy fyVar2 = this.f46144b;
        if (fyVar2 != null) {
            fyVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0() {
        boolean z9;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.F) {
            ArrayList arrayList = this.f46146e;
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
        ArrayList arrayList = this.f46146e;
        arrayList.clear();
        ArrayList arrayList2 = this.f46147f;
        if (!z9) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
            i7 = 2131751458;
        } else {
            i7 = 2131745673;
        }
        tzVar.a(org.telegram.messenger.id.M0(i7, null), new bi.u7(this, tzVar, z9, 29));
        this.F = true;
        d0();
        c0();
        k0(true);
        l0();
        for (int i10 = 0; i10 < this.f46143a.getChildCount(); i10++) {
            View childAt = this.f46143a.getChildAt(i10);
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
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f46143a;
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
                arrayList = this.f46146e;
                if (i7 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().z1(((Long) arrayList.get(i7)).longValue()));
                i7++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f46145c.f26070a;
            tL_chatlists_editExportedInvite.slug = g0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().j1(((Long) arrayList.get(i10)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new tx(this, 0));
            org.telegram.messenger.c20 c20Var = this.f46153y;
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
            str2 = org.telegram.messenger.id.M0(2131750707, null);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        if (z9) {
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

    public final void j0(boolean z9) {
        if (!z9) {
            org.telegram.messenger.g0.r(this.Q);
        }
        org.telegram.ui.ActionBar.b5 b5Var = this.f46148n;
        if (b5Var != null) {
            b5Var.b(z9);
        }
    }

    public final void k0(boolean z9) {
        String G;
        int i7;
        org.telegram.ui.Components.tz tzVar = this.O;
        if (tzVar != null) {
            ArrayList arrayList = this.f46146e;
            boolean z10 = false;
            if (arrayList.size() <= 0) {
                G = org.telegram.messenger.id.N0("FilterInviteHeaderChatsEmpty");
            } else {
                G = org.telegram.messenger.id.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            tzVar.b(G, z9);
            ArrayList arrayList2 = this.f46147f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
                    z10 = true;
                }
                org.telegram.ui.Components.tz tzVar2 = this.O;
                if (!z10) {
                    i7 = 2131745673;
                } else {
                    i7 = 2131751458;
                }
                tzVar2.a(org.telegram.messenger.id.M0(i7, null), new org.telegram.ui.Components.tp0(7, this, z10));
            } else {
                this.O.a("", null);
            }
            if (z9) {
                org.telegram.messenger.g0.i2(((Object) this.O.f38466a.getText()) + ", " + ((Object) this.O.f38467b.getText()));
            }
        }
    }

    public final void l0() {
        vx vxVar = this.P;
        if (vxVar == null) {
            return;
        }
        int i7 = 0;
        if (this.d == null) {
            String M0 = org.telegram.messenger.id.M0(2131750751, null);
            xh.l lVar = vxVar.f50794a;
            lVar.setText(M0);
            lVar.f58844s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = vxVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.vo voVar = this.f46145c;
        Spannable C5 = org.telegram.messenger.ij.C5(org.telegram.messenger.i6.m(voVar.f26071b, fontMetricsInt, false, null, 0), voVar.f26072c, fontMetricsInt, false);
        vx vxVar2 = this.P;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.id.F("FilterInviteHeader", this.f46146e.size(), C5));
        boolean z9 = voVar.f26081n;
        xh.l lVar2 = vxVar2.f50794a;
        lVar2.setText(W2);
        if (z9) {
            i7 = 26;
        }
        lVar2.f58844s = i7;
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

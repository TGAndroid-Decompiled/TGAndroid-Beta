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
public final class ky extends org.telegram.ui.ActionBar.g2 {
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
    public org.telegram.ui.Components.f00 P;
    public yx Q;
    public final bh R;
    public f61 f49411a;
    public jy f49412b;
    public final org.telegram.messenger.so f49413c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f49414e;
    public final ArrayList f49415f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.c5 f49416n;
    public int f49417r;
    public long f49418s;
    public long f49419w;
    public org.telegram.messenger.y10 f49420x;
    public org.telegram.messenger.y10 f49421y;

    public ky(org.telegram.messenger.so soVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f49414e = new ArrayList();
        this.f49415f = new ArrayList();
        this.h = new ArrayList();
        this.f49417r = -5;
        this.E = false;
        this.H = 0;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.R = new bh(this, 28);
        this.f49413c = soVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(ky kyVar, TLRPC.TL_error tL_error) {
        kyVar.j0(false);
        kyVar.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            kyVar.showDialog(new ug.k0(12, kyVar.currentAccount, kyVar.getParentActivity(), kyVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            kyVar.showDialog(new ug.k0(4, kyVar.currentAccount, kyVar.getParentActivity(), kyVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            kyVar.showDialog(new ug.k0(13, kyVar.currentAccount, kyVar.getParentActivity(), kyVar, null));
        } else {
            kyVar.finishFragment();
        }
    }

    public static void a0(ky kyVar, View view, int i7) {
        String N0;
        String str;
        ky kyVar2;
        ArrayList arrayList = kyVar.f49414e;
        if (kyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.i4)) {
            Long l10 = (Long) kyVar.h.get(i7 - kyVar.M);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                kyVar.G = true;
                kyVar.c0();
                ((org.telegram.ui.Cells.i4) view).c(false, true);
                kyVar2 = kyVar;
            } else if (kyVar.f49415f.contains(l10)) {
                if (arrayList.size() + 1 > kyVar.f0()) {
                    kyVar.showDialog(new ug.k0(4, kyVar.currentAccount, kyVar.getParentActivity(), kyVar, null));
                    return;
                }
                kyVar2 = kyVar;
                arrayList.add(l10);
                kyVar2.G = true;
                kyVar2.c0();
                ((org.telegram.ui.Cells.i4) view).c(true, true);
            } else {
                int i10 = -kyVar.f49417r;
                kyVar.f49417r = i10;
                org.telegram.messenger.g0.E3(i10, view, null);
                org.telegram.messenger.q2.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(kyVar.getMessagesController().c2(l10));
                    TLRPC.User c22 = kyVar.getMessagesController().c2(l10);
                    if (c22 != null && c22.bot) {
                        str = org.telegram.messenger.hd.N0(2131750758, null);
                    } else {
                        str = org.telegram.messenger.hd.N0(2131750726, null);
                    }
                } else {
                    TLRPC.Chat O0 = kyVar.getMessagesController().O0(Long.valueOf(-longValue));
                    if (org.telegram.messenger.v3.V(O0)) {
                        if (org.telegram.messenger.v3.t0(O0)) {
                            N0 = org.telegram.messenger.hd.N0(2131750756, null);
                        } else {
                            N0 = org.telegram.messenger.hd.N0(2131750729, null);
                        }
                    } else if (org.telegram.messenger.v3.t0(O0)) {
                        N0 = org.telegram.messenger.hd.N0(2131750745, null);
                    } else {
                        N0 = org.telegram.messenger.hd.N0(2131750728, null);
                    }
                    arrayList2.add(O0);
                    str = N0;
                }
                if (kyVar.f49418s != longValue || System.currentTimeMillis() - kyVar.f49419w > 1500) {
                    kyVar.f49418s = longValue;
                    kyVar.f49419w = System.currentTimeMillis();
                    org.telegram.ui.Components.lc.b0(kyVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            kyVar2.d0();
            kyVar2.k0(true);
            kyVar2.l0();
        }
    }

    public final boolean b0(boolean z10) {
        if (this.f49414e.isEmpty() || !this.G) {
            return true;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String N0 = org.telegram.messenger.hd.N0(2131743590, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131743589, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754213, null), new org.telegram.ui.ActionBar.q1(this) {
                public final ky f53553b;

                {
                    this.f53553b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f53553b.h0();
                            return;
                        default:
                            this.f53553b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131747386, null), new org.telegram.ui.ActionBar.q1(this) {
                public final ky f53553b;

                {
                    this.f53553b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f53553b.h0();
                            return;
                        default:
                            this.f53553b.finishFragment();
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
        org.telegram.ui.ActionBar.c5 c5Var = this.f49416n;
        if (this.G && !this.f49414e.isEmpty()) {
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
        this.simpleActionBar.setBackButtonImage(2131231240);
        i0(false);
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, 3));
        this.f49416n = this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        f61 f61Var = new f61(10, context, null);
        this.f49411a = f61Var;
        f61Var.setLayoutManager(new v4.c0(1, false));
        this.f49411a.setVerticalScrollBarEnabled(false);
        this.f49411a.r1();
        this.f49411a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f49411a, c8.ma.c(-1.0f, -1));
        f61 f61Var2 = this.f49411a;
        jy jyVar = new jy(this);
        this.f49412b = jyVar;
        f61Var2.setAdapter(jyVar);
        this.f49411a.setOnItemClickListener(new h(this, 9));
        org.telegram.messenger.np messagesController = getMessagesController();
        org.telegram.messenger.so soVar = this.f49413c;
        messagesController.w5(soVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f49415f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                long o4 = org.telegram.messenger.n5.o(tL_exportedChatlistInvite.peers.get(i7));
                arrayList2.add(Long.valueOf(o4));
                this.f49414e.add(Long.valueOf(o4));
                arrayList3.add(Long.valueOf(o4));
            }
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = soVar.f26894k;
            arrayList = soVar.f26894k;
            if (i10 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (dialog != null && !org.telegram.messenger.n5.C(dialog.f28438id) && !arrayList2.contains(Long.valueOf(dialog.f28438id))) {
                int i11 = (dialog.f28438id > 0L ? 1 : (dialog.f28438id == 0L ? 0 : -1));
                if (i11 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 < 0) {
                    z10 = kz.m0(getMessagesController().O0(Long.valueOf(-dialog.f28438id)));
                }
                if (z10) {
                    arrayList2.add(Long.valueOf(dialog.f28438id));
                    arrayList3.add(Long.valueOf(dialog.f28438id));
                }
            }
            i10++;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i12);
            if (dialog2 != null && !org.telegram.messenger.n5.C(dialog2.f28438id) && !arrayList2.contains(Long.valueOf(dialog2.f28438id)) && !arrayList3.contains(Long.valueOf(dialog2.f28438id))) {
                arrayList2.add(Long.valueOf(dialog2.f28438id));
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
        jy jyVar2 = this.f49412b;
        if (jyVar2 != null) {
            jyVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.G) {
            ArrayList arrayList = this.f49414e;
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

    public final void e0(org.telegram.ui.Components.f00 f00Var, boolean z10) {
        int i7;
        ArrayList arrayList = this.f49414e;
        arrayList.clear();
        ArrayList arrayList2 = this.f49415f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
            i7 = 2131751445;
        } else {
            i7 = 2131745474;
        }
        f00Var.a(org.telegram.messenger.hd.N0(i7, null), new di.p6(this, f00Var, z10, 28));
        this.G = true;
        d0();
        c0();
        k0(true);
        l0();
        for (int i10 = 0; i10 < this.f49411a.getChildCount(); i10++) {
            View childAt = this.f49411a.getChildAt(i10);
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
        return this.f49411a;
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
                arrayList = this.f49414e;
                if (i7 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().B1(((Long) arrayList.get(i7)).longValue()));
                i7++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f49413c.f26886a;
            tL_chatlists_editExportedInvite.slug = g0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().l1(((Long) arrayList.get(i10)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new xx(this, 0));
            org.telegram.messenger.y10 y10Var = this.f49421y;
            if (y10Var != null) {
                y10Var.a(tL_exportedChatlistInvite);
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
            str2 = org.telegram.messenger.hd.N0(2131750692, null);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        if (z10) {
            org.telegram.ui.ActionBar.z4 z4Var = this.simpleActionBar;
            z4Var.getClass();
            z4Var.I(str3, false, 220L, org.telegram.ui.Components.nr.h);
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
        org.telegram.ui.ActionBar.c5 c5Var = this.f49416n;
        if (c5Var != null) {
            c5Var.b(z10);
        }
    }

    public final void k0(boolean z10) {
        String G;
        int i7;
        org.telegram.ui.Components.f00 f00Var = this.P;
        if (f00Var != null) {
            ArrayList arrayList = this.f49414e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                G = org.telegram.messenger.hd.O0("FilterInviteHeaderChatsEmpty");
            } else {
                G = org.telegram.messenger.hd.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            f00Var.b(G, z10);
            ArrayList arrayList2 = this.f49415f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.f00 f00Var2 = this.P;
                if (!z11) {
                    i7 = 2131745474;
                } else {
                    i7 = 2131751445;
                }
                f00Var2.a(org.telegram.messenger.hd.N0(i7, null), new org.telegram.ui.Components.rp0(8, this, z11));
            } else {
                this.P.a("", null);
            }
            if (z10) {
                org.telegram.messenger.g0.i2(((Object) this.P.f35047a.getText()) + ", " + ((Object) this.P.f35048b.getText()));
            }
        }
    }

    public final void l0() {
        yx yxVar = this.Q;
        if (yxVar == null) {
            return;
        }
        int i7 = 0;
        if (this.d == null) {
            String N0 = org.telegram.messenger.hd.N0(2131750738, null);
            xh.l lVar = yxVar.f54322a;
            lVar.setText(N0);
            lVar.f60646s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = yxVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.so soVar = this.f49413c;
        Spannable B5 = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(soVar.f26887b, fontMetricsInt, false, null, 0), soVar.f26888c, fontMetricsInt, false);
        yx yxVar2 = this.Q;
        SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(org.telegram.messenger.hd.F("FilterInviteHeader", this.f49414e.size(), B5));
        boolean z10 = soVar.f26897n;
        xh.l lVar2 = yxVar2.f54322a;
        lVar2.setText(V2);
        if (z10) {
            i7 = 26;
        }
        lVar2.f60646s = i7;
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

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
public final class hy extends org.telegram.ui.ActionBar.e2 {
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
    public org.telegram.ui.Components.wz P;
    public vx Q;
    public final bh R;
    public b61 f47842a;
    public gy f47843b;
    public final org.telegram.messenger.so f47844c;
    public final TL_chatlists.TL_exportedChatlistInvite d;
    public final ArrayList f47845e;
    public final ArrayList f47846f;
    public final ArrayList h;
    public org.telegram.ui.ActionBar.z4 f47847n;
    public int f47848r;
    public long f47849s;
    public long f47850w;
    public org.telegram.messenger.z10 f47851x;
    public org.telegram.messenger.z10 f47852y;

    public hy(org.telegram.messenger.so soVar, TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        super(null);
        this.f47845e = new ArrayList();
        this.f47846f = new ArrayList();
        this.h = new ArrayList();
        this.f47848r = -5;
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
        this.f47844c = soVar;
        this.d = tL_exportedChatlistInvite;
    }

    public static void Z(hy hyVar, TLRPC.TL_error tL_error) {
        hyVar.j0(false);
        hyVar.E = false;
        if (tL_error != null && "INVITES_TOO_MUCH".equals(tL_error.text)) {
            hyVar.showDialog(new ug.j0(12, hyVar.currentAccount, hyVar.getParentActivity(), hyVar, null));
        } else if (tL_error != null && "INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            hyVar.showDialog(new ug.j0(4, hyVar.currentAccount, hyVar.getParentActivity(), hyVar, null));
        } else if (tL_error != null && "CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            hyVar.showDialog(new ug.j0(13, hyVar.currentAccount, hyVar.getParentActivity(), hyVar, null));
        } else {
            hyVar.finishFragment();
        }
    }

    public static void a0(hy hyVar, View view, int i7) {
        String M0;
        String str;
        hy hyVar2;
        ArrayList arrayList = hyVar.f47845e;
        if (hyVar.getParentActivity() != null && (view instanceof org.telegram.ui.Cells.h4)) {
            Long l10 = (Long) hyVar.h.get(i7 - hyVar.M);
            long longValue = l10.longValue();
            if (arrayList.contains(l10)) {
                arrayList.remove(l10);
                hyVar.G = true;
                hyVar.c0();
                ((org.telegram.ui.Cells.h4) view).c(false, true);
                hyVar2 = hyVar;
            } else if (hyVar.f47846f.contains(l10)) {
                if (arrayList.size() + 1 > hyVar.f0()) {
                    hyVar.showDialog(new ug.j0(4, hyVar.currentAccount, hyVar.getParentActivity(), hyVar, null));
                    return;
                }
                hyVar2 = hyVar;
                arrayList.add(l10);
                hyVar2.G = true;
                hyVar2.c0();
                ((org.telegram.ui.Cells.h4) view).c(true, true);
            } else {
                int i10 = -hyVar.f47848r;
                hyVar.f47848r = i10;
                org.telegram.messenger.g0.F3(i10, view, null);
                org.telegram.messenger.p2.APP_ERROR.a();
                ArrayList arrayList2 = new ArrayList();
                if (longValue >= 0) {
                    arrayList2.add(hyVar.getMessagesController().a2(l10));
                    TLRPC.User a22 = hyVar.getMessagesController().a2(l10);
                    if (a22 != null && a22.bot) {
                        str = org.telegram.messenger.hd.M0(2131750770, null);
                    } else {
                        str = org.telegram.messenger.hd.M0(2131750738, null);
                    }
                } else {
                    TLRPC.Chat M02 = hyVar.getMessagesController().M0(Long.valueOf(-longValue));
                    if (org.telegram.messenger.t3.V(M02)) {
                        if (org.telegram.messenger.t3.t0(M02)) {
                            M0 = org.telegram.messenger.hd.M0(2131750768, null);
                        } else {
                            M0 = org.telegram.messenger.hd.M0(2131750741, null);
                        }
                    } else if (org.telegram.messenger.t3.t0(M02)) {
                        M0 = org.telegram.messenger.hd.M0(2131750757, null);
                    } else {
                        M0 = org.telegram.messenger.hd.M0(2131750740, null);
                    }
                    arrayList2.add(M02);
                    str = M0;
                }
                if (hyVar.f47849s != longValue || System.currentTimeMillis() - hyVar.f47850w > 1500) {
                    hyVar.f47849s = longValue;
                    hyVar.f47850w = System.currentTimeMillis();
                    org.telegram.ui.Components.cc.a0(hyVar).g(str, arrayList2).j();
                    return;
                }
                return;
            }
            hyVar2.d0();
            hyVar2.k0(true);
            hyVar2.l0();
        }
    }

    public final boolean b0(boolean z10) {
        if (this.f47845e.isEmpty() || !this.G) {
            return true;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.hd.M0(2131743835, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            t1Var.U = org.telegram.messenger.hd.M0(2131743834, null);
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new org.telegram.ui.ActionBar.q1(this) {
                public final hy f51684b;

                {
                    this.f51684b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f51684b.h0();
                            return;
                        default:
                            this.f51684b.finishFragment();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747580, null), new org.telegram.ui.ActionBar.q1(this) {
                public final hy f51684b;

                {
                    this.f51684b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.t1 t1Var2, int i7) {
                    switch (r2) {
                        case 0:
                            this.f51684b.h0();
                            return;
                        default:
                            this.f51684b.finishFragment();
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
        org.telegram.ui.ActionBar.z4 z4Var = this.f47847n;
        if (this.G && !this.f47845e.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        z4Var.a(z10, true);
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 1));
        this.f47847n = this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        c0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        b61 b61Var = new b61(10, context, null);
        this.f47842a = b61Var;
        b61Var.setLayoutManager(new v4.b0(1, false));
        this.f47842a.setVerticalScrollBarEnabled(false);
        this.f47842a.r1();
        this.f47842a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f47842a, c8.ja.c(-1.0f, -1));
        b61 b61Var2 = this.f47842a;
        gy gyVar = new gy(this);
        this.f47843b = gyVar;
        b61Var2.setAdapter(gyVar);
        this.f47842a.setOnItemClickListener(new h(this, 9));
        org.telegram.messenger.np messagesController = getMessagesController();
        org.telegram.messenger.so soVar = this.f47844c;
        messagesController.l5(soVar);
        ArrayList arrayList2 = this.h;
        arrayList2.clear();
        ArrayList arrayList3 = this.f47846f;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null) {
            for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                long o4 = org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i7));
                arrayList2.add(Long.valueOf(o4));
                this.f47845e.add(Long.valueOf(o4));
                arrayList3.add(Long.valueOf(o4));
            }
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList4 = soVar.f26550k;
            arrayList = soVar.f26550k;
            if (i10 >= arrayList4.size()) {
                break;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i10);
            if (dialog != null && !org.telegram.messenger.m5.C(dialog.f28055id) && !arrayList2.contains(Long.valueOf(dialog.f28055id))) {
                int i11 = (dialog.f28055id > 0L ? 1 : (dialog.f28055id == 0L ? 0 : -1));
                if (i11 < 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i11 < 0) {
                    z10 = hz.m0(getMessagesController().M0(Long.valueOf(-dialog.f28055id)));
                }
                if (z10) {
                    arrayList2.add(Long.valueOf(dialog.f28055id));
                    arrayList3.add(Long.valueOf(dialog.f28055id));
                }
            }
            i10++;
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList.get(i12);
            if (dialog2 != null && !org.telegram.messenger.m5.C(dialog2.f28055id) && !arrayList2.contains(Long.valueOf(dialog2.f28055id)) && !arrayList3.contains(Long.valueOf(dialog2.f28055id))) {
                arrayList2.add(Long.valueOf(dialog2.f28055id));
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
        gy gyVar2 = this.f47843b;
        if (gyVar2 != null) {
            gyVar2.f();
        }
        return this.fragmentView;
    }

    public final void d0() {
        boolean z10;
        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.d;
        if (tL_exportedChatlistInvite != null && tL_exportedChatlistInvite.url != null && this.G) {
            ArrayList arrayList = this.f47845e;
            boolean z11 = true;
            if (arrayList.size() != tL_exportedChatlistInvite.peers.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                for (int i7 = 0; i7 < tL_exportedChatlistInvite.peers.size(); i7++) {
                    if (!arrayList.contains(Long.valueOf(org.telegram.messenger.m5.o(tL_exportedChatlistInvite.peers.get(i7))))) {
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

    public final void e0(org.telegram.ui.Components.wz wzVar, boolean z10) {
        int i7;
        ArrayList arrayList = this.f47845e;
        arrayList.clear();
        ArrayList arrayList2 = this.f47846f;
        if (!z10) {
            arrayList.addAll(arrayList2.subList(0, Math.min(f0(), arrayList2.size())));
        }
        if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
            i7 = 2131751457;
        } else {
            i7 = 2131745670;
        }
        wzVar.a(org.telegram.messenger.hd.M0(i7, null), new di.m6(this, wzVar, z10, 29));
        this.G = true;
        d0();
        c0();
        k0(true);
        l0();
        for (int i10 = 0; i10 < this.f47842a.getChildCount(); i10++) {
            View childAt = this.f47842a.getChildAt(i10);
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
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f47842a;
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
                arrayList = this.f47845e;
                if (i7 >= arrayList.size()) {
                    break;
                }
                tL_exportedChatlistInvite.peers.add(getMessagesController().z1(((Long) arrayList.get(i7)).longValue()));
                i7++;
            }
            TL_chatlists.TL_chatlists_editExportedInvite tL_chatlists_editExportedInvite = new TL_chatlists.TL_chatlists_editExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_editExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.f47844c.f26542a;
            tL_chatlists_editExportedInvite.slug = g0();
            tL_chatlists_editExportedInvite.revoked = tL_exportedChatlistInvite.revoked;
            tL_chatlists_editExportedInvite.flags |= 4;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                tL_chatlists_editExportedInvite.peers.add(getMessagesController().j1(((Long) arrayList.get(i10)).longValue()));
            }
            getConnectionsManager().sendRequest(tL_chatlists_editExportedInvite, new ux(this, 0));
            org.telegram.messenger.z10 z10Var = this.f47852y;
            if (z10Var != null) {
                z10Var.a(tL_exportedChatlistInvite);
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
            str2 = org.telegram.messenger.hd.M0(2131750706, null);
        } else {
            str2 = tL_exportedChatlistInvite.title;
        }
        String str3 = str2;
        if (z10) {
            org.telegram.ui.ActionBar.w4 w4Var = this.simpleActionBar;
            w4Var.getClass();
            w4Var.D(str3, false, 220L, org.telegram.ui.Components.er.h);
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
        org.telegram.ui.ActionBar.z4 z4Var = this.f47847n;
        if (z4Var != null) {
            z4Var.b(z10);
        }
    }

    public final void k0(boolean z10) {
        String G;
        int i7;
        org.telegram.ui.Components.wz wzVar = this.P;
        if (wzVar != null) {
            ArrayList arrayList = this.f47845e;
            boolean z11 = false;
            if (arrayList.size() <= 0) {
                G = org.telegram.messenger.hd.N0("FilterInviteHeaderChatsEmpty");
            } else {
                G = org.telegram.messenger.hd.G(arrayList.size(), "FilterInviteHeaderChats", new Object[0]);
            }
            wzVar.b(G, z10);
            ArrayList arrayList2 = this.f47846f;
            if (arrayList2.size() > 1) {
                if (arrayList.size() >= Math.min(f0(), arrayList2.size())) {
                    z11 = true;
                }
                org.telegram.ui.Components.wz wzVar2 = this.P;
                if (!z11) {
                    i7 = 2131745670;
                } else {
                    i7 = 2131751457;
                }
                wzVar2.a(org.telegram.messenger.hd.M0(i7, null), new org.telegram.ui.Components.fp0(8, this, z11));
            } else {
                this.P.a("", null);
            }
            if (z10) {
                org.telegram.messenger.g0.i2(((Object) this.P.f41488a.getText()) + ", " + ((Object) this.P.f41489b.getText()));
            }
        }
    }

    public final void l0() {
        vx vxVar = this.Q;
        if (vxVar == null) {
            return;
        }
        int i7 = 0;
        if (this.d == null) {
            String M0 = org.telegram.messenger.hd.M0(2131750750, null);
            xh.l lVar = vxVar.f52321a;
            lVar.setText(M0);
            lVar.f60035s = 0;
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = vxVar.getSubtitleTextView().getPaint().getFontMetricsInt();
        org.telegram.messenger.so soVar = this.f47844c;
        Spannable B5 = org.telegram.messenger.gj.B5(org.telegram.messenger.j6.m(soVar.f26543b, fontMetricsInt, false, null, 0), soVar.f26544c, fontMetricsInt, false);
        vx vxVar2 = this.Q;
        SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(org.telegram.messenger.hd.F("FilterInviteHeader", this.f47845e.size(), B5));
        boolean z10 = soVar.f26553n;
        xh.l lVar2 = vxVar2.f52321a;
        lVar2.setText(W2);
        if (z10) {
            i7 = 26;
        }
        lVar2.f60035s = i7;
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

package org.telegram.ui;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ja extends s4.u {
    public final int d;
    public final Object e;

    public ja(Object obj, int i10) {
        this.d = i10;
        this.e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, s4.c1 c1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, c1Var);
                View view = c1Var.f47909a;
                view.setPressed(false);
                view.setTag(2131296419, null);
                return;
            case 1:
                super.a(recyclerView, c1Var);
                c1Var.f47909a.setPressed(false);
                return;
            case 2:
                super.a(recyclerView, c1Var);
                View view2 = c1Var.f47909a;
                view2.setPressed(false);
                view2.setTag(2131296419, null);
                return;
            case 3:
                super.a(recyclerView, c1Var);
                View view3 = c1Var.f47909a;
                view3.setPressed(false);
                view3.setBackground(null);
                return;
            case 4:
                super.a(recyclerView, c1Var);
                c1Var.f47909a.setPressed(false);
                return;
            case 5:
                super.a(recyclerView, c1Var);
                c1Var.f47909a.setPressed(false);
                return;
            case 6:
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) this.e;
                super.a(recyclerView, c1Var);
                View view4 = c1Var.f47909a;
                view4.setPressed(false);
                if (view4.getBackground() instanceof bi.h2) {
                    bi.h2 h2Var = (bi.h2) view4.getBackground();
                    if (h2Var.f3053c) {
                        h2Var.f3053c = false;
                        h2Var.invalidateSelf();
                    }
                }
                if (v51Var.D1()) {
                    v51Var.I1(c1Var);
                    view4.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                    return;
                }
                return;
            case 7:
            default:
                super.a(recyclerView, c1Var);
                return;
            case 8:
                super.a(recyclerView, c1Var);
                c1Var.f47909a.setPressed(false);
                return;
            case 9:
                super.a(recyclerView, c1Var);
                c1Var.f47909a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, s4.c1 c1Var) {
        org.telegram.messenger.gw s10;
        switch (this.d) {
            case 0:
                if (c1Var.f47912f == 4 && ((la) c1Var.f47909a).G) {
                    return s4.u.l(3, 0);
                }
                return s4.u.l(0, 0);
            case 1:
                if (c1Var.f47912f == 1 && ((la) c1Var.f47909a).G) {
                    return s4.u.l(3, 0);
                }
                return s4.u.l(0, 0);
            case 2:
                if (c1Var.f47912f != 0) {
                    return 0;
                }
                return s4.u.l(3, 0);
            case 3:
                if (c1Var.f47912f != 5) {
                    return s4.u.l(0, 0);
                }
                return s4.u.l(3, 0);
            case 4:
                int b10 = c1Var.b();
                org.telegram.ui.Components.hm0 hm0Var = (org.telegram.ui.Components.hm0) this.e;
                if (b10 >= hm0Var.f26865w && c1Var.b() < hm0Var.f26866x) {
                    return s4.u.l(3, 0);
                }
                return s4.u.l(0, 0);
            case 5:
                int l4 = s4.u.l(0, 0);
                org.telegram.ui.Components.au0 au0Var = ((org.telegram.ui.Components.jt0) this.e).f27572y;
                if (au0Var.E1 && recyclerView.getAdapter() != au0Var.U && (s10 = s(c1Var)) != null && s10.f15966b) {
                    return s4.u.l(3, 0);
                }
                return l4;
            case 6:
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) this.e;
                if (v51Var.f31187j3 && v51Var.f31183f3.H(c1Var.b()) >= 0) {
                    int i10 = 15;
                    if (v51Var.f31182e3.f47879o == 0) {
                        if (!v51Var.f31186i3) {
                            i10 = 12;
                        }
                    } else if (!v51Var.f31186i3) {
                        i10 = 3;
                    }
                    return s4.u.l(i10, 0);
                }
                return s4.u.l(0, 0);
            case 7:
                if (((n2.u) ((org.telegram.ui.Components.w71) this.e).D).G(c1Var.b())) {
                    return s4.u.l(12, 0);
                }
                return s4.u.l(0, 0);
            case 8:
                if (c1Var.f47912f == 5 && r(c1Var.b())) {
                    return s4.u.l(3, 0);
                }
                return s4.u.l(0, 0);
            default:
                uh.i iVar = (uh.i) this.e;
                if (iVar.W.G.E1 && iVar.f50266w.L(c1Var.b())) {
                    iVar.f50262f.setItemAnimator(iVar.f50263n);
                    return s4.u.l(15, 0);
                }
                return s4.u.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 4:
                return ((org.telegram.ui.Components.hm0) this.e).I.f();
            case 5:
            case 7:
            default:
                return super.k();
            case 6:
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) this.e;
                if (v51Var.f31187j3 && v51Var.f31189l3) {
                    return true;
                }
                return false;
            case 8:
                return true;
            case 9:
                return ((uh.i) this.e).W.G.E1;
        }
    }

    @Override
    public void m(Canvas canvas, RecyclerView recyclerView, s4.c1 c1Var, float f7, float f10, int i10, boolean z10) {
        switch (this.d) {
            case 6:
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) this.e;
                if (i10 != 2 || z10 || !v51Var.D1()) {
                    super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                    if (i10 == 2 && z10) {
                        v51Var.H1(c1Var);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                ((org.telegram.ui.Components.w71) this.e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, c1Var, f7, f10, i10, z10);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2) {
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13 = this.d;
        Object obj = this.e;
        int i14 = 0;
        switch (i13) {
            case 0:
                if (c1Var.f47912f == c1Var2.f47912f) {
                    View view = c1Var2.f47909a;
                    if (!(view instanceof la) || ((la) view).G) {
                        ga gaVar = ((oa) obj).f40112c;
                        int b10 = c1Var.b();
                        int b11 = c1Var2.b();
                        int i15 = b10 - 4;
                        int i16 = b11 - 4;
                        oa oaVar = gaVar.f37437c;
                        ArrayList arrayList2 = oaVar.f40117w;
                        if (i15 >= arrayList2.size() || i16 >= arrayList2.size()) {
                            return true;
                        }
                        if (b10 != b11) {
                            oaVar.d = true;
                        }
                        arrayList2.set(i15, (TLRPC.TL_username) arrayList2.get(i16));
                        arrayList2.set(i16, (TLRPC.TL_username) arrayList2.get(i15));
                        gaVar.j(b10, b11);
                        int size = arrayList2.size() + 3;
                        if (b10 != size && b11 != size) {
                            return true;
                        }
                        gaVar.h(b10, 3);
                        gaVar.h(b11, 3);
                        return true;
                    }
                }
                return false;
            case 1:
                if (c1Var.f47912f == c1Var2.f47912f) {
                    View view2 = c1Var2.f47909a;
                    if (!(view2 instanceof la) || ((la) view2).G) {
                        ap apVar = ((bp) obj).f36092e3;
                        int b12 = c1Var.b();
                        int b13 = c1Var2.b();
                        int i17 = b12 - 1;
                        int i18 = b13 - 1;
                        bp bpVar = apVar.f35820c;
                        cp cpVar = bpVar.f36095h3;
                        ArrayList arrayList3 = cpVar.N;
                        if (i17 >= cpVar.N.size() || i18 >= arrayList3.size()) {
                            return true;
                        }
                        if (b12 != b13) {
                            bpVar.f36093f3 = true;
                        }
                        arrayList3.set(i17, (TLRPC.TL_username) arrayList3.get(i18));
                        arrayList3.set(i18, (TLRPC.TL_username) arrayList3.get(i17));
                        apVar.j(b12, b13);
                        int size2 = arrayList3.size();
                        if (b12 != size2 && b13 != size2) {
                            return true;
                        }
                        apVar.h(b12, 3);
                        apVar.h(b13, 3);
                        return true;
                    }
                }
                return false;
            case 2:
                int b14 = c1Var.b();
                int b15 = c1Var2.b();
                org.telegram.ui.Components.w7 w7Var = (org.telegram.ui.Components.w7) obj;
                if (w7Var.f32105l2) {
                    if (b14 <= 0 || b15 <= 0) {
                        return false;
                    }
                    w7Var.f32107m2.c(b14 - 1, b15 - 1);
                } else {
                    w7Var.f32107m2.c(b14, b15);
                }
                w7Var.f32109n2.clear();
                w7Var.f32109n2.addAll(w7Var.f32107m2.f17804c);
                w7Var.f32114q1.j(b14, b15);
                return true;
            case 3:
                if (c1Var.f47912f != c1Var2.f47912f) {
                    return false;
                }
                fg.j jVar = ((org.telegram.ui.Components.jn) obj).f27509r;
                int b16 = c1Var.b();
                int b17 = c1Var2.b();
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) jVar.e;
                int i19 = jnVar.f27513t0;
                ih.g gVar = jnVar.f27499m1;
                int i20 = b16 - i19;
                int i21 = b17 - i19;
                if (i20 < 0 || i21 < 0 || i20 >= (i10 = jnVar.M) || i21 >= i10) {
                    return true;
                }
                ih.f b18 = gVar.b(i20);
                SparseArray sparseArray = gVar.f8538a;
                sparseArray.put(i20, gVar.b(i21));
                sparseArray.put(i21, b18);
                CharSequence[] charSequenceArr = jnVar.K;
                CharSequence charSequence = charSequenceArr[i20];
                charSequenceArr[i20] = charSequenceArr[i21];
                charSequenceArr[i21] = charSequence;
                boolean[] zArr = jnVar.L;
                boolean z10 = zArr[i20];
                zArr[i20] = zArr[i21];
                zArr[i21] = z10;
                jVar.j(b16, b17);
                return true;
            case 4:
                int b19 = c1Var2.b();
                org.telegram.ui.Components.hm0 hm0Var = (org.telegram.ui.Components.hm0) obj;
                ArrayList arrayList4 = hm0Var.e;
                if (b19 >= hm0Var.f26865w && c1Var2.b() < hm0Var.f26866x) {
                    int b20 = c1Var.b();
                    int b21 = c1Var2.b();
                    int i22 = hm0Var.f26865w;
                    int i23 = b20 - i22;
                    int i24 = b21 - i22;
                    arrayList4.indexOf(Integer.valueOf(i23));
                    arrayList4.get(b20 - hm0Var.f26865w);
                    org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList4.get(i23);
                    org.telegram.messenger.kj kjVar2 = (org.telegram.messenger.kj) arrayList4.get(i24);
                    arrayList4.set(i23, kjVar2);
                    arrayList4.set(i24, kjVar);
                    org.telegram.messenger.b6 q6 = org.telegram.messenger.b6.q(hm0Var.d);
                    ArrayList arrayList5 = q6.G;
                    int indexOf = arrayList5.indexOf(kjVar);
                    int indexOf2 = arrayList5.indexOf(kjVar2);
                    if (indexOf >= 0 && indexOf2 >= 0) {
                        arrayList5.set(indexOf, kjVar2);
                        arrayList5.set(indexOf2, kjVar);
                    }
                    q6.y();
                    hm0Var.f26860c.j(b20, b21);
                }
                return false;
            case 5:
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) obj;
                ArrayList arrayList6 = jt0Var.f27566f;
                org.telegram.ui.Components.au0 au0Var = jt0Var.f27572y;
                if (au0Var.E1 && recyclerView.getAdapter() != au0Var.U) {
                    org.telegram.messenger.gw s10 = s(c1Var);
                    org.telegram.messenger.gw s11 = s(c1Var2);
                    if (s10 != null && s11 != null && s10.f15966b && s11.f15966b) {
                        int b22 = c1Var.b();
                        int b23 = c1Var2.b();
                        arrayList6.remove(b22);
                        arrayList6.add(b23, s10);
                        jt0Var.j(b22, b23);
                        jt0Var.h = true;
                        return true;
                    }
                }
                return false;
            case 6:
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
                org.telegram.ui.Components.q51 q51Var = v51Var.f31183f3;
                if (q51Var.H(c1Var.b()) < 0 || q51Var.H(c1Var.b()) != q51Var.H(c1Var2.b())) {
                    return false;
                }
                int b24 = c1Var.b();
                int b25 = c1Var2.b();
                ArrayList arrayList7 = q51Var.D;
                if (q51Var.M != null) {
                    int H = q51Var.H(b24);
                    int H2 = q51Var.H(b25);
                    if (H >= 0 && H == H2) {
                        boolean J = q51Var.J(b24);
                        boolean J2 = q51Var.J(b25);
                        arrayList7.add(b25, (org.telegram.ui.Components.b51) arrayList7.remove(b24));
                        q51Var.j(b24, b25);
                        if (q51Var.J(b25) != J) {
                            q51Var.h(b25, 3);
                        }
                        if (q51Var.J(b24) != J2) {
                            q51Var.h(b24, 3);
                        }
                        if (q51Var.L && (i11 = q51Var.K) != H) {
                            q51Var.F(i11);
                        }
                        q51Var.L = true;
                        q51Var.K = H;
                    }
                }
                v51Var.K1();
                return true;
            case 7:
                int b26 = c1Var.b();
                int b27 = c1Var2.b();
                org.telegram.ui.Components.w71 w71Var = (org.telegram.ui.Components.w71) obj;
                ArrayList arrayList8 = w71Var.h;
                if (!((n2.u) w71Var.D).G(b26) || !((n2.u) w71Var.D).G(b27)) {
                    return false;
                }
                Pattern pattern = Utilities.f14519a;
                Object obj2 = arrayList8.get(b26);
                arrayList8.set(b26, arrayList8.get(b27));
                arrayList8.set(b27, obj2);
                w71Var.f32164y.j(b26, b27);
                ArrayList arrayList9 = new ArrayList();
                int size3 = arrayList8.size();
                while (i14 < size3) {
                    Object obj3 = arrayList8.get(i14);
                    i14++;
                    arrayList9.add(Integer.valueOf(((org.telegram.ui.Components.t71) obj3).f30548a));
                }
                org.telegram.ui.Components.p71 p71Var = ((org.telegram.ui.Components.x71) ((n2.u) w71Var.D).f13481b).L;
                if (p71Var == null) {
                    return true;
                }
                p71Var.a(arrayList9);
                return true;
            case 8:
                if (c1Var.f47912f != c1Var2.f47912f || !r(c1Var.b()) || !r(c1Var2.b())) {
                    return false;
                }
                xs0 xs0Var = ((zs0) obj).f44054b;
                int b28 = c1Var.b();
                int b29 = c1Var2.b();
                zs0 zs0Var = xs0Var.d;
                int i25 = zs0Var.f44069n0;
                int i26 = b28 - i25;
                int i27 = b29 - i25;
                if (i26 < 0 || i27 < 0 || i26 >= (i12 = zs0Var.D) || i27 >= i12) {
                    return true;
                }
                CharSequence[] charSequenceArr2 = zs0Var.f44080w;
                CharSequence charSequence2 = charSequenceArr2[i26];
                charSequenceArr2[i26] = charSequenceArr2[i27];
                charSequenceArr2[i27] = charSequence2;
                int[] iArr = zs0Var.f44073r;
                if (iArr != null) {
                    int i28 = iArr[i26];
                    iArr[i26] = iArr[i27];
                    iArr[i27] = i28;
                }
                boolean[] zArr2 = zs0Var.f44082x;
                boolean z11 = zArr2[i26];
                zArr2[i26] = zArr2[i27];
                zArr2[i27] = z11;
                xs0Var.j(b28, b29);
                return true;
            default:
                uh.e eVar = ((uh.i) obj).f50266w;
                if (!eVar.L(c1Var.b()) || !eVar.L(c1Var2.b())) {
                    return false;
                }
                int b30 = c1Var.b();
                int b31 = c1Var2.b();
                ArrayList arrayList10 = eVar.f50255n;
                th.x4 x4Var = eVar.e;
                if (x4Var == null || b30 < 0 || b30 >= x4Var.f49650i.size() || b31 < 0 || b31 >= eVar.e.f49650i.size()) {
                    return true;
                }
                if (eVar.e instanceof th.q4) {
                    arrayList = new ArrayList();
                    for (int i29 = 0; i29 < eVar.e.f49650i.size(); i29++) {
                        arrayList.add(Integer.valueOf(((org.telegram.messenger.kj) eVar.e.f49650i.get(i29)).f1()));
                    }
                } else {
                    arrayList = new ArrayList(eVar.e.f49649g);
                }
                if (!eVar.f50256r) {
                    arrayList10.clear();
                    arrayList10.addAll(arrayList);
                    eVar.f50256r = true;
                }
                org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) eVar.e.f49650i.get(b30);
                org.telegram.messenger.kj kjVar4 = (org.telegram.messenger.kj) eVar.e.f49650i.get(b31);
                arrayList.remove(Integer.valueOf(kjVar3.f1()));
                arrayList.add(Utilities.j(b31, arrayList.size(), 0), Integer.valueOf(kjVar3.f1()));
                eVar.e.C(arrayList, false);
                eVar.j(b30, b31);
                return true;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 6:
                return;
            default:
                super.o(recyclerView, c1Var, c1Var2, i10, i11, i12);
                return;
        }
    }

    @Override
    public void p(s4.c1 c1Var, int i10) {
        org.telegram.ui.Components.ss0 ss0Var;
        ArrayList arrayList;
        boolean z10;
        int i11 = this.d;
        Boolean bool = null;
        Object obj = this.e;
        switch (i11) {
            case 0:
                oa oaVar = (oa) obj;
                if (i10 == 0) {
                    oa.d0(oaVar);
                } else {
                    oaVar.f40111b.I0(false);
                    c1Var.f47909a.setPressed(true);
                }
                if (c1Var != null) {
                    View view = c1Var.f47909a;
                    if (i10 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view.setTag(2131296419, bool);
                    return;
                }
                return;
            case 1:
                bp bpVar = (bp) obj;
                cp cpVar = bpVar.f36095h3;
                if (i10 == 0) {
                    cpVar.L = false;
                    if (bpVar.f36093f3) {
                        TLRPC.Chat chat = cpVar.X;
                        ArrayList arrayList2 = cpVar.N;
                        ArrayList arrayList3 = cpVar.M;
                        if (chat != null) {
                            bpVar.f36093f3 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = cpVar.X;
                            tL_inputChannel.channel_id = chat2.f19794id;
                            tL_inputChannel.access_hash = chat2.access_hash;
                            tL_channels_reorderUsernames.channel = tL_inputChannel;
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                                if (((TLRPC.TL_username) arrayList3.get(i12)).active) {
                                    arrayList4.add(((TLRPC.TL_username) arrayList3.get(i12)).username);
                                }
                            }
                            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                if (((TLRPC.TL_username) arrayList2.get(i13)).active) {
                                    arrayList4.add(((TLRPC.TL_username) arrayList2.get(i13)).username);
                                }
                            }
                            tL_channels_reorderUsernames.order = arrayList4;
                            cpVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new ag.c3(11));
                            cpVar.X.usernames.clear();
                            cpVar.X.usernames.addAll(arrayList3);
                            cpVar.X.usernames.addAll(arrayList2);
                            cpVar.getMessagesController().N3(cpVar.X, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                cpVar.L = true;
                bpVar.I0(false);
                c1Var.f47909a.setPressed(true);
                return;
            case 2:
                org.telegram.ui.Components.j7 j7Var = ((org.telegram.ui.Components.w7) obj).f32110o1;
                if (c1Var != null) {
                    j7Var.d1(false);
                }
                if (i10 != 0) {
                    j7Var.I0(false);
                    if (c1Var != null) {
                        c1Var.f47909a.setPressed(true);
                    }
                }
                if (c1Var != null) {
                    View view2 = c1Var.f47909a;
                    if (i10 == 2) {
                        bool = Boolean.TRUE;
                    }
                    view2.setTag(2131296419, bool);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.jn jnVar = (org.telegram.ui.Components.jn) obj;
                u71 u71Var = jnVar.f27511s;
                if (i10 != 0) {
                    u71Var.setItemAnimator(jnVar.f27516w);
                    u71Var.I0(false);
                    c1Var.f47909a.setPressed(true);
                    org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21002h5, c1Var.f47909a, jnVar.f30963a);
                    return;
                }
                return;
            case 4:
                if (i10 != 0) {
                    ((org.telegram.ui.Components.hm0) obj).f26859b.I0(false);
                    c1Var.f47909a.setPressed(true);
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) obj;
                org.telegram.ui.Components.vo0 vo0Var = jt0Var.f27567n;
                if (c1Var != null && (ss0Var = jt0Var.f27569s) != null) {
                    ss0Var.d1(false);
                }
                if (i10 == 0) {
                    org.telegram.messenger.i0.r(vo0Var);
                    org.telegram.messenger.i0.h3(vo0Var, 300L);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.Components.v51 v51Var = (org.telegram.ui.Components.v51) obj;
                if (c1Var != null) {
                    v51Var.d1(false);
                }
                if (i10 == 0) {
                    org.telegram.ui.Components.q51 q51Var = v51Var.f31183f3;
                    if (q51Var.L) {
                        q51Var.F(q51Var.K);
                    }
                    if (v51Var.f31188k3 != null) {
                        v51Var.G1();
                        v51Var.f31188k3 = null;
                        return;
                    }
                    return;
                }
                v51Var.I0(false);
                if (c1Var != null) {
                    View view3 = c1Var.f47909a;
                    view3.setPressed(true);
                    if (view3.getBackground() instanceof bi.h2) {
                        bi.h2 h2Var = (bi.h2) view3.getBackground();
                        if (!h2Var.f3053c) {
                            h2Var.f3053c = true;
                            h2Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        v51Var.f31188k3 = c1Var;
                        v51Var.J1(c1Var);
                        return;
                    }
                    return;
                }
                return;
            case 7:
            default:
                return;
            case 8:
                if (i10 != 0) {
                    ((zs0) obj).f44056c.I0(false);
                    c1Var.f47909a.setPressed(true);
                    return;
                }
                return;
            case 9:
                uh.i iVar = (uh.i) obj;
                uh.c cVar = iVar.f50262f;
                if (c1Var != null) {
                    cVar.d1(false);
                }
                if (i10 == 0) {
                    uh.e eVar = iVar.f50266w;
                    ArrayList arrayList5 = eVar.f50255n;
                    th.x4 x4Var = eVar.e;
                    if (x4Var != null && eVar.f50256r) {
                        if (x4Var instanceof th.q4) {
                            arrayList = new ArrayList();
                            for (int i14 = 0; i14 < eVar.e.f49650i.size(); i14++) {
                                arrayList.add(Integer.valueOf(((org.telegram.messenger.kj) eVar.e.f49650i.get(i14)).f1()));
                            }
                        } else {
                            arrayList = x4Var.f49649g;
                        }
                        if (arrayList5.size() != arrayList.size()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (!z10) {
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList5.size()) {
                                    if (arrayList5.get(i15) != arrayList.get(i15)) {
                                        z10 = true;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                        if (z10) {
                            eVar.e.C(arrayList, true);
                        }
                        eVar.f50256r = false;
                    }
                    cVar.setItemAnimator(null);
                    return;
                }
                cVar.I0(false);
                if (c1Var != null) {
                    c1Var.f47909a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(s4.c1 c1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        zs0 zs0Var = (zs0) this.e;
        if (!zs0Var.I || i10 - zs0Var.f44069n0 >= zs0Var.f44084y) {
            return true;
        }
        return false;
    }

    public org.telegram.messenger.gw s(s4.c1 c1Var) {
        int b10;
        org.telegram.ui.Components.jt0 jt0Var = (org.telegram.ui.Components.jt0) this.e;
        if (c1Var == null || (b10 = c1Var.b()) < 0 || b10 >= jt0Var.f27566f.size()) {
            return null;
        }
        return (org.telegram.messenger.gw) jt0Var.f27566f.get(b10);
    }

    private final void A(s4.c1 c1Var) {
    }

    private final void B(s4.c1 c1Var) {
    }

    private final void C(s4.c1 c1Var) {
    }

    private final void D(s4.c1 c1Var) {
    }

    private final void u(s4.c1 c1Var) {
    }

    private final void v(s4.c1 c1Var) {
    }

    private final void w(s4.c1 c1Var) {
    }

    private final void x(s4.c1 c1Var) {
    }

    private final void y(s4.c1 c1Var) {
    }

    private final void z(s4.c1 c1Var) {
    }

    private final void t(RecyclerView recyclerView, s4.c1 c1Var, s4.c1 c1Var2, int i10, int i11, int i12) {
    }
}

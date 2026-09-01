package org.telegram.ui;

import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class cp extends f2.b0 {
    public final int d;
    public final Object f35886e;

    public cp(Object obj, int i10) {
        this.d = i10;
        this.f35886e = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, f2.m1 m1Var) {
        switch (this.d) {
            case 0:
                super.a(recyclerView, m1Var);
                m1Var.f5875a.setPressed(false);
                return;
            case 1:
                super.a(recyclerView, m1Var);
                View view = m1Var.f5875a;
                view.setPressed(false);
                view.setBackground(null);
                return;
            case 2:
                super.a(recyclerView, m1Var);
                m1Var.f5875a.setPressed(false);
                return;
            case 3:
                org.telegram.ui.Components.i61 i61Var = (org.telegram.ui.Components.i61) this.f35886e;
                super.a(recyclerView, m1Var);
                View view2 = m1Var.f5875a;
                view2.setPressed(false);
                if (view2.getBackground() instanceof wh.w1) {
                    wh.w1 w1Var = (wh.w1) view2.getBackground();
                    if (w1Var.f50130c) {
                        w1Var.f50130c = false;
                        w1Var.invalidateSelf();
                    }
                }
                if (i61Var.A1()) {
                    i61Var.F1(m1Var);
                    view2.animate().scaleX(0.5f).scaleY(0.5f).setDuration(200L).setInterpolator(org.telegram.ui.Components.pr.h).start();
                    return;
                }
                return;
            case 4:
            default:
                super.a(recyclerView, m1Var);
                return;
            case 5:
                super.a(recyclerView, m1Var);
                m1Var.f5875a.setPressed(false);
                return;
            case 6:
                super.a(recyclerView, m1Var);
                m1Var.f5875a.setPressed(false);
                return;
        }
    }

    @Override
    public final int e(RecyclerView recyclerView, f2.m1 m1Var) {
        switch (this.d) {
            case 0:
                if (m1Var.f5879f == 1 && ((ma) m1Var.f5875a).D) {
                    return f2.b0.l(3, 0);
                }
                return f2.b0.l(0, 0);
            case 1:
                if (m1Var.f5879f != 5) {
                    return f2.b0.l(0, 0);
                }
                return f2.b0.l(3, 0);
            case 2:
                int b10 = m1Var.b();
                org.telegram.ui.Components.en0 en0Var = (org.telegram.ui.Components.en0) this.f35886e;
                if (b10 >= en0Var.v && m1Var.b() < en0Var.f26591w) {
                    return f2.b0.l(3, 0);
                }
                return f2.b0.l(0, 0);
            case 3:
                org.telegram.ui.Components.i61 i61Var = (org.telegram.ui.Components.i61) this.f35886e;
                if (i61Var.Z2 && i61Var.V2.H(m1Var.b()) >= 0) {
                    int i10 = 15;
                    if (i61Var.U2.f5816o == 0) {
                        if (!i61Var.Y2) {
                            i10 = 12;
                        }
                    } else if (!i61Var.Y2) {
                        i10 = 3;
                    }
                    return f2.b0.l(i10, 0);
                }
                return f2.b0.l(0, 0);
            case 4:
                if (((oh.h4) ((org.telegram.ui.Components.l81) this.f35886e).f28671y).Q(m1Var.b())) {
                    return f2.b0.l(12, 0);
                }
                return f2.b0.l(0, 0);
            case 5:
                if (m1Var.f5879f == 5 && r(m1Var.b())) {
                    return f2.b0.l(3, 0);
                }
                return f2.b0.l(0, 0);
            default:
                ph.l lVar = (ph.l) this.f35886e;
                if (lVar.T.D.f34021z1 && lVar.v.L(m1Var.b())) {
                    lVar.f44395f.setItemAnimator(lVar.f44396n);
                    return f2.b0.l(15, 0);
                }
                return f2.b0.l(0, 0);
        }
    }

    @Override
    public boolean k() {
        switch (this.d) {
            case 2:
                return ((org.telegram.ui.Components.en0) this.f35886e).F.f();
            case 3:
                org.telegram.ui.Components.i61 i61Var = (org.telegram.ui.Components.i61) this.f35886e;
                if (i61Var.Z2 && i61Var.f27680b3) {
                    return true;
                }
                return false;
            case 4:
            default:
                return super.k();
            case 5:
                return true;
            case 6:
                return ((ph.l) this.f35886e).T.D.f34021z1;
        }
    }

    @Override
    public void m(Canvas canvas, RecyclerView recyclerView, f2.m1 m1Var, float f10, float f11, int i10, boolean z4) {
        switch (this.d) {
            case 3:
                org.telegram.ui.Components.i61 i61Var = (org.telegram.ui.Components.i61) this.f35886e;
                if (i10 != 2 || z4 || !i61Var.A1()) {
                    super.m(canvas, recyclerView, m1Var, f10, f11, i10, z4);
                    if (i10 == 2 && z4) {
                        i61Var.E1(m1Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                super.m(canvas, recyclerView, m1Var, f10, f11, i10, z4);
                ((org.telegram.ui.Components.l81) this.f35886e).invalidate();
                return;
            default:
                super.m(canvas, recyclerView, m1Var, f10, f11, i10, z4);
                return;
        }
    }

    @Override
    public final boolean n(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2) {
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        switch (this.d) {
            case 0:
                if (m1Var.f5879f == m1Var2.f5879f) {
                    View view = m1Var2.f5875a;
                    if (!(view instanceof ma) || ((ma) view).D) {
                        bp bpVar = ((dp) this.f35886e).U2;
                        int b10 = m1Var.b();
                        int b11 = m1Var2.b();
                        int i13 = b10 - 1;
                        int i14 = b11 - 1;
                        dp dpVar = bpVar.f35573c;
                        ep epVar = dpVar.X2;
                        ArrayList arrayList2 = epVar.K;
                        if (i13 >= epVar.K.size() || i14 >= arrayList2.size()) {
                            return true;
                        }
                        if (b10 != b11) {
                            dpVar.V2 = true;
                        }
                        arrayList2.set(i13, (TLRPC.TL_username) arrayList2.get(i14));
                        arrayList2.set(i14, (TLRPC.TL_username) arrayList2.get(i13));
                        bpVar.p(b10, b11);
                        int size = arrayList2.size();
                        if (b10 != size && b11 != size) {
                            return true;
                        }
                        bpVar.n(b10, 3);
                        bpVar.n(b11, 3);
                        return true;
                    }
                }
                return false;
            case 1:
                if (m1Var.f5879f != m1Var2.f5879f) {
                    return false;
                }
                org.telegram.ui.Components.qn qnVar = ((org.telegram.ui.Components.sn) this.f35886e).f31120r;
                int b12 = m1Var.b();
                int b13 = m1Var2.b();
                org.telegram.ui.Components.sn snVar = qnVar.d;
                int i15 = snVar.f31119q0;
                eh.i iVar = snVar.f31111i1;
                int i16 = b12 - i15;
                int i17 = b13 - i15;
                if (i16 >= 0 && i17 >= 0 && i16 < (i10 = snVar.J) && i17 < i10) {
                    eh.h b14 = iVar.b(i16);
                    SparseArray sparseArray = iVar.f5638a;
                    sparseArray.put(i16, iVar.b(i17));
                    sparseArray.put(i17, b14);
                    CharSequence[] charSequenceArr = snVar.H;
                    CharSequence charSequence = charSequenceArr[i16];
                    charSequenceArr[i16] = charSequenceArr[i17];
                    charSequenceArr[i17] = charSequence;
                    boolean[] zArr = snVar.I;
                    boolean z4 = zArr[i16];
                    zArr[i16] = zArr[i17];
                    zArr[i17] = z4;
                    qnVar.p(b12, b13);
                }
                return true;
            case 2:
                int b15 = m1Var2.b();
                org.telegram.ui.Components.en0 en0Var = (org.telegram.ui.Components.en0) this.f35886e;
                ArrayList arrayList3 = en0Var.f26586e;
                if (b15 >= en0Var.v && m1Var2.b() < en0Var.f26591w) {
                    int b16 = m1Var.b();
                    int b17 = m1Var2.b();
                    int i18 = en0Var.v;
                    int i19 = b16 - i18;
                    int i20 = b17 - i18;
                    arrayList3.indexOf(Integer.valueOf(i19));
                    arrayList3.get(b16 - en0Var.v);
                    MessageObject messageObject = (MessageObject) arrayList3.get(i19);
                    MessageObject messageObject2 = (MessageObject) arrayList3.get(i20);
                    arrayList3.set(i19, messageObject2);
                    arrayList3.set(i20, messageObject);
                    DownloadController.getInstance(en0Var.d).swapLoadingPriority(messageObject, messageObject2);
                    en0Var.f26585c.p(b16, b17);
                    return false;
                }
                return false;
            case 3:
                org.telegram.ui.Components.i61 i61Var = (org.telegram.ui.Components.i61) this.f35886e;
                org.telegram.ui.Components.x51 x51Var = i61Var.V2;
                if (x51Var.H(m1Var.b()) >= 0 && x51Var.H(m1Var.b()) == x51Var.H(m1Var2.b())) {
                    int b18 = m1Var.b();
                    int b19 = m1Var2.b();
                    ArrayList arrayList4 = x51Var.f32960x;
                    if (x51Var.I != null) {
                        int H = x51Var.H(b18);
                        int H2 = x51Var.H(b19);
                        if (H >= 0 && H == H2) {
                            boolean J = x51Var.J(b18);
                            boolean J2 = x51Var.J(b19);
                            arrayList4.add(b19, (org.telegram.ui.Components.j51) arrayList4.remove(b18));
                            x51Var.p(b18, b19);
                            if (x51Var.J(b19) != J) {
                                x51Var.n(b19, 3);
                            }
                            if (x51Var.J(b18) != J2) {
                                x51Var.n(b18, 3);
                            }
                            if (x51Var.H && (i11 = x51Var.G) != H) {
                                x51Var.F(i11);
                            }
                            x51Var.H = true;
                            x51Var.G = H;
                        }
                    }
                    i61Var.H1();
                    return true;
                }
                return false;
            case 4:
                int b20 = m1Var.b();
                int b21 = m1Var2.b();
                org.telegram.ui.Components.l81 l81Var = (org.telegram.ui.Components.l81) this.f35886e;
                ArrayList arrayList5 = l81Var.h;
                boolean z10 = false;
                int i21 = 0;
                z10 = false;
                if (((oh.h4) l81Var.f28671y).Q(b20) && ((oh.h4) l81Var.f28671y).Q(b21)) {
                    Utilities.swapItems(arrayList5, b20, b21);
                    l81Var.f28670x.p(b20, b21);
                    ArrayList arrayList6 = new ArrayList();
                    int size2 = arrayList5.size();
                    while (i21 < size2) {
                        Object obj = arrayList5.get(i21);
                        i21++;
                        arrayList6.add(Integer.valueOf(((org.telegram.ui.Components.i81) obj).f27698a));
                    }
                    org.telegram.ui.Components.e81 e81Var = ((org.telegram.ui.Components.m81) ((oh.h4) l81Var.f28671y).f17180b).I;
                    z10 = true;
                    z10 = true;
                    if (e81Var != null) {
                        e81Var.a(arrayList6);
                    }
                }
                return z10;
            case 5:
                if (m1Var.f5879f == m1Var2.f5879f && r(m1Var.b()) && r(m1Var2.b())) {
                    fv0 fv0Var = ((hv0) this.f35886e).f37642b;
                    int b22 = m1Var.b();
                    int b23 = m1Var2.b();
                    hv0 hv0Var = fv0Var.d;
                    int i22 = hv0Var.f37655k0;
                    int i23 = b22 - i22;
                    int i24 = b23 - i22;
                    if (i23 >= 0 && i24 >= 0 && i23 < (i12 = hv0Var.f37673y) && i24 < i12) {
                        CharSequence[] charSequenceArr2 = hv0Var.v;
                        CharSequence charSequence2 = charSequenceArr2[i23];
                        charSequenceArr2[i23] = charSequenceArr2[i24];
                        charSequenceArr2[i24] = charSequence2;
                        int[] iArr = hv0Var.f37662r;
                        if (iArr != null) {
                            int i25 = iArr[i23];
                            iArr[i23] = iArr[i24];
                            iArr[i24] = i25;
                        }
                        boolean[] zArr2 = hv0Var.f37669w;
                        boolean z11 = zArr2[i23];
                        zArr2[i23] = zArr2[i24];
                        zArr2[i24] = z11;
                        fv0Var.p(b22, b23);
                    }
                    return true;
                }
                return false;
            default:
                ph.g gVar = ((ph.l) this.f35886e).v;
                if (!gVar.L(m1Var.b()) || !gVar.L(m1Var2.b())) {
                    return false;
                }
                int b24 = m1Var.b();
                int b25 = m1Var2.b();
                ArrayList arrayList7 = gVar.f44388n;
                oh.l6 l6Var = gVar.f44386e;
                if (l6Var != null && b24 >= 0 && b24 < l6Var.f17402i.size() && b25 >= 0 && b25 < gVar.f44386e.f17402i.size()) {
                    if (gVar.f44386e instanceof oh.d6) {
                        arrayList = new ArrayList();
                        for (int i26 = 0; i26 < gVar.f44386e.f17402i.size(); i26++) {
                            arrayList.add(Integer.valueOf(((MessageObject) gVar.f44386e.f17402i.get(i26)).getId()));
                        }
                    } else {
                        arrayList = new ArrayList(gVar.f44386e.f17401g);
                    }
                    if (!gVar.f44389r) {
                        arrayList7.clear();
                        arrayList7.addAll(arrayList);
                        gVar.f44389r = true;
                    }
                    MessageObject messageObject3 = (MessageObject) gVar.f44386e.f17402i.get(b24);
                    MessageObject messageObject4 = (MessageObject) gVar.f44386e.f17402i.get(b25);
                    arrayList.remove(Integer.valueOf(messageObject3.getId()));
                    arrayList.add(Utilities.clamp(b25, arrayList.size(), 0), Integer.valueOf(messageObject3.getId()));
                    gVar.f44386e.C(arrayList, false);
                    gVar.p(b24, b25);
                }
                return true;
        }
    }

    @Override
    public void o(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2, int i10, int i11, int i12) {
        switch (this.d) {
            case 3:
                return;
            default:
                super.o(recyclerView, m1Var, m1Var2, i10, i11, i12);
                return;
        }
    }

    @Override
    public void p(f2.m1 m1Var, int i10) {
        ArrayList arrayList;
        boolean z4;
        switch (this.d) {
            case 0:
                dp dpVar = (dp) this.f35886e;
                ep epVar = dpVar.X2;
                if (i10 == 0) {
                    epVar.I = false;
                    if (dpVar.V2) {
                        TLRPC.Chat chat = epVar.U;
                        ArrayList arrayList2 = epVar.K;
                        ArrayList arrayList3 = epVar.J;
                        if (chat != null) {
                            dpVar.V2 = false;
                            TLRPC.TL_channels_reorderUsernames tL_channels_reorderUsernames = new TLRPC.TL_channels_reorderUsernames();
                            TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                            TLRPC.Chat chat2 = epVar.U;
                            tL_inputChannel.channel_id = chat2.f20843id;
                            tL_inputChannel.access_hash = chat2.access_hash;
                            tL_channels_reorderUsernames.channel = tL_inputChannel;
                            ArrayList<String> arrayList4 = new ArrayList<>();
                            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                                if (((TLRPC.TL_username) arrayList3.get(i11)).active) {
                                    arrayList4.add(((TLRPC.TL_username) arrayList3.get(i11)).username);
                                }
                            }
                            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                if (((TLRPC.TL_username) arrayList2.get(i12)).active) {
                                    arrayList4.add(((TLRPC.TL_username) arrayList2.get(i12)).username);
                                }
                            }
                            tL_channels_reorderUsernames.order = arrayList4;
                            epVar.getConnectionsManager().sendRequest(tL_channels_reorderUsernames, new oh.p5(6));
                            epVar.U.usernames.clear();
                            epVar.U.usernames.addAll(arrayList3);
                            epVar.U.usernames.addAll(arrayList2);
                            epVar.getMessagesController().putChat(epVar.U, true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                epVar.I = true;
                dpVar.I0(false);
                m1Var.f5875a.setPressed(true);
                return;
            case 1:
                org.telegram.ui.Components.sn snVar = (org.telegram.ui.Components.sn) this.f35886e;
                kb1 kb1Var = snVar.f31122s;
                if (i10 != 0) {
                    kb1Var.setItemAnimator(snVar.v);
                    kb1Var.I0(false);
                    m1Var.f5875a.setPressed(true);
                    m1Var.f5875a.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21731h5, snVar.f26545a));
                    return;
                }
                return;
            case 2:
                if (i10 != 0) {
                    ((org.telegram.ui.Components.en0) this.f35886e).f26584b.I0(false);
                    m1Var.f5875a.setPressed(true);
                    return;
                }
                return;
            case 3:
                org.telegram.ui.Components.i61 i61Var = (org.telegram.ui.Components.i61) this.f35886e;
                if (m1Var != null) {
                    i61Var.d1(false);
                }
                if (i10 == 0) {
                    org.telegram.ui.Components.x51 x51Var = i61Var.V2;
                    if (x51Var.H) {
                        x51Var.F(x51Var.G);
                    }
                    if (i61Var.f27679a3 != null) {
                        i61Var.D1();
                        i61Var.f27679a3 = null;
                        return;
                    }
                    return;
                }
                i61Var.I0(false);
                if (m1Var != null) {
                    View view = m1Var.f5875a;
                    view.setPressed(true);
                    if (view.getBackground() instanceof wh.w1) {
                        wh.w1 w1Var = (wh.w1) view.getBackground();
                        if (!w1Var.f50130c) {
                            w1Var.f50130c = true;
                            w1Var.invalidateSelf();
                        }
                    }
                    if (i10 == 2) {
                        i61Var.f27679a3 = m1Var;
                        i61Var.G1(m1Var);
                        return;
                    }
                    return;
                }
                return;
            case 4:
            default:
                return;
            case 5:
                if (i10 != 0) {
                    ((hv0) this.f35886e).f37644c.I0(false);
                    m1Var.f5875a.setPressed(true);
                    return;
                }
                return;
            case 6:
                ph.l lVar = (ph.l) this.f35886e;
                ph.e eVar = lVar.f44395f;
                if (m1Var != null) {
                    eVar.d1(false);
                }
                if (i10 == 0) {
                    ph.g gVar = lVar.v;
                    ArrayList arrayList5 = gVar.f44388n;
                    oh.l6 l6Var = gVar.f44386e;
                    if (l6Var != null && gVar.f44389r) {
                        if (l6Var instanceof oh.d6) {
                            arrayList = new ArrayList();
                            for (int i13 = 0; i13 < gVar.f44386e.f17402i.size(); i13++) {
                                arrayList.add(Integer.valueOf(((MessageObject) gVar.f44386e.f17402i.get(i13)).getId()));
                            }
                        } else {
                            arrayList = l6Var.f17401g;
                        }
                        if (arrayList5.size() != arrayList.size()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList5.size()) {
                                    if (arrayList5.get(i14) != arrayList.get(i14)) {
                                        z4 = true;
                                    } else {
                                        i14++;
                                    }
                                }
                            }
                        }
                        if (z4) {
                            gVar.f44386e.C(arrayList, true);
                        }
                        gVar.f44389r = false;
                    }
                    eVar.setItemAnimator(null);
                    return;
                }
                eVar.I0(false);
                if (m1Var != null) {
                    m1Var.f5875a.setPressed(true);
                    return;
                }
                return;
        }
    }

    @Override
    public final void q(f2.m1 m1Var) {
        int i10 = this.d;
    }

    public boolean r(int i10) {
        hv0 hv0Var = (hv0) this.f35886e;
        if (!hv0Var.F || i10 - hv0Var.f37655k0 >= hv0Var.f37671x) {
            return true;
        }
        return false;
    }

    private final void t(f2.m1 m1Var) {
    }

    private final void u(f2.m1 m1Var) {
    }

    private final void v(f2.m1 m1Var) {
    }

    private final void w(f2.m1 m1Var) {
    }

    private final void x(f2.m1 m1Var) {
    }

    private final void y(f2.m1 m1Var) {
    }

    private final void z(f2.m1 m1Var) {
    }

    private final void s(RecyclerView recyclerView, f2.m1 m1Var, f2.m1 m1Var2, int i10, int i11, int i12) {
    }
}

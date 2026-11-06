package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oq extends na {
    public final r60 P1;
    public final ArrayList Q1;
    public final boolean R1;
    public final boolean S1;
    public final boolean T1;
    public boolean U1;
    public TLRPC.Peer V1;
    public TLRPC.InputPeer W1;
    public final org.telegram.ui.ActionBar.f2 X1;
    public final long Y1;

    public oq(org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, long j3, r60 r60Var) {
        super(f2Var, false);
        boolean z9;
        String a02;
        boolean z10;
        String a03;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28612a).M0(Long.valueOf(-j3));
        this.X1 = f2Var;
        this.Y1 = j3;
        this.f36333r1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Q1 = arrayList2;
        this.P1 = r60Var;
        boolean W = org.telegram.messenger.t3.W(M0);
        this.T1 = W;
        this.V1 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.R1 = z9;
        this.S1 = org.telegram.messenger.t3.w(14, M0);
        Context context = this.f28615b.getContext();
        this.f28615b.addView(new bi.ec(17, context, this), c8.ha.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131743456, new Object[0]);
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131743325, new Object[0]);
        }
        textView.setText(a02);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.k6.f27848d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, o4, o4);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView, k02, N, h, null);
        this.f28615b.addView(textView, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z10 = false;
            a03 = org.telegram.messenger.hd.a0(null, null, 2131743463, new Object[0]);
        } else {
            z10 = false;
            a03 = org.telegram.messenger.hd.a0(null, null, 2131743342, new Object[0]);
        }
        textView2.setText(a03);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.r6.V(textView2, i7, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i7, z10), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i7, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.r6.k(textView2, k03, null, h7, null);
        this.f28615b.addView(textView2, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final oq f36102b;

            {
                this.f36102b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        oq oqVar = this.f36102b;
                        oqVar.W1 = org.telegram.messenger.qp.s1(oqVar.f28612a).j1(org.telegram.messenger.ij.C1(oqVar.V1));
                        oqVar.dismiss();
                        return;
                    default:
                        oq oqVar2 = this.f36102b;
                        oqVar2.W1 = org.telegram.messenger.qp.s1(oqVar2.f28612a).j1(org.telegram.messenger.ij.C1(oqVar2.V1));
                        oqVar2.U1 = true;
                        oqVar2.dismiss();
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final oq f36102b;

            {
                this.f36102b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        oq oqVar = this.f36102b;
                        oqVar.W1 = org.telegram.messenger.qp.s1(oqVar.f28612a).j1(org.telegram.messenger.ij.C1(oqVar.V1));
                        oqVar.dismiss();
                        return;
                    default:
                        oq oqVar2 = this.f36102b;
                        oqVar2.W1 = org.telegram.messenger.qp.s1(oqVar2.f28612a).j1(org.telegram.messenger.ij.C1(oqVar2.V1));
                        oqVar2.U1 = true;
                        oqVar2.dismiss();
                        return;
                }
            }
        });
        pj0 pj0Var = this.f36328k1;
        int i11 = this.f28645t0;
        pj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(120.0f));
        this.f36328k1.setOnItemClickListener(new k(this, 4));
        N();
        b1();
    }

    @Override
    public final void K() {
        super.K();
        TLRPC.InputPeer inputPeer = this.W1;
        if (inputPeer != null) {
            boolean z9 = true;
            if (this.Q1.size() <= 1) {
                z9 = false;
            }
            this.P1.a(inputPeer, z9, this.U1, false);
        }
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        return new nq(this);
    }

    @Override
    public final CharSequence O0() {
        if (this.T1) {
            return org.telegram.messenger.hd.M0(2131744904, null);
        }
        return org.telegram.messenger.hd.M0(2131744901, null);
    }
}

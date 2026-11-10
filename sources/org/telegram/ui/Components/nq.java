package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class nq extends ma {
    public final r60 S1;
    public final ArrayList T1;
    public final boolean U1;
    public final boolean V1;
    public final boolean W1;
    public boolean X1;
    public TLRPC.Peer Y1;
    public TLRPC.InputPeer Z1;
    public final org.telegram.ui.ActionBar.f2 f36360a2;
    public final long f36361b2;

    public nq(org.telegram.ui.ActionBar.f2 f2Var, ArrayList arrayList, long j3, r60 r60Var) {
        super(f2Var, false);
        boolean z9;
        String a02;
        boolean z10;
        String a03;
        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(this.f28669a).M0(Long.valueOf(-j3));
        this.f36360a2 = f2Var;
        this.f36361b2 = j3;
        this.f35908u1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.T1 = arrayList2;
        this.S1 = r60Var;
        boolean W = org.telegram.messenger.t3.W(M0);
        this.W1 = W;
        this.Y1 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.U1 = z9;
        this.V1 = org.telegram.messenger.t3.w(14, M0);
        Context context = this.f28672b.getContext();
        this.f28672b.addView(new bi.ec(17, context, this), c8.ha.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            a02 = org.telegram.messenger.id.a0(null, null, 2131743455, new Object[0]);
        } else {
            a02 = org.telegram.messenger.id.a0(null, null, 2131743324, new Object[0]);
        }
        textView.setText(a02);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Gi, null);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Ci;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.m6.f27890d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, o4, o4);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i10, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView, k02, M, g10, null);
        this.f28672b.addView(textView, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z10 = false;
            a03 = org.telegram.messenger.id.a0(null, null, 2131743462, new Object[0]);
        } else {
            z10 = false;
            a03 = org.telegram.messenger.id.a0(null, null, 2131743341, new Object[0]);
        }
        textView2.setText(a03);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.t6.U(textView2, i7, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i7, z10), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.p6 g11 = org.telegram.ui.ActionBar.t6.g(i7, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.t6.j(textView2, k03, null, g11, null);
        this.f28672b.addView(textView2, c8.ha.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final nq f35726b;

            {
                this.f35726b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nq nqVar = this.f35726b;
                        nqVar.Z1 = org.telegram.messenger.qp.s1(nqVar.f28669a).j1(org.telegram.messenger.ij.B1(nqVar.Y1));
                        nqVar.dismiss();
                        return;
                    default:
                        nq nqVar2 = this.f35726b;
                        nqVar2.Z1 = org.telegram.messenger.qp.s1(nqVar2.f28669a).j1(org.telegram.messenger.ij.B1(nqVar2.Y1));
                        nqVar2.X1 = true;
                        nqVar2.dismiss();
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final nq f35726b;

            {
                this.f35726b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        nq nqVar = this.f35726b;
                        nqVar.Z1 = org.telegram.messenger.qp.s1(nqVar.f28669a).j1(org.telegram.messenger.ij.B1(nqVar.Y1));
                        nqVar.dismiss();
                        return;
                    default:
                        nq nqVar2 = this.f35726b;
                        nqVar2.Z1 = org.telegram.messenger.qp.s1(nqVar2.f28669a).j1(org.telegram.messenger.ij.B1(nqVar2.Y1));
                        nqVar2.X1 = true;
                        nqVar2.dismiss();
                        return;
                }
            }
        });
        pj0 pj0Var = this.n1;
        int i11 = this.f28705t0;
        pj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(120.0f));
        this.n1.setOnItemClickListener(new j(this, 4));
        N();
        b1();
    }

    @Override
    public final void K() {
        super.K();
        TLRPC.InputPeer inputPeer = this.Z1;
        if (inputPeer != null) {
            boolean z9 = true;
            if (this.T1.size() <= 1) {
                z9 = false;
            }
            this.S1.a(inputPeer, z9, this.X1, false);
        }
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        return new mq(this);
    }

    @Override
    public final CharSequence O0() {
        if (this.W1) {
            return org.telegram.messenger.id.M0(2131744903, null);
        }
        return org.telegram.messenger.id.M0(2131744900, null);
    }
}

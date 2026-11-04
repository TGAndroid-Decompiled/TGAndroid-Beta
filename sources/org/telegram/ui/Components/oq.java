package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class oq extends ma {
    public final m60 Q1;
    public final ArrayList R1;
    public final boolean S1;
    public final boolean T1;
    public final boolean U1;
    public boolean V1;
    public TLRPC.Peer W1;
    public TLRPC.InputPeer X1;
    public final org.telegram.ui.ActionBar.d2 Y1;
    public final long Z1;

    public oq(org.telegram.ui.ActionBar.d2 d2Var, ArrayList arrayList, long j10, m60 m60Var) {
        super(d2Var, false);
        boolean z10;
        String a02;
        boolean z11;
        String a03;
        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(this.f28583a).M0(Long.valueOf(-j10));
        this.Y1 = d2Var;
        this.Z1 = j10;
        this.f36108s1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.R1 = arrayList2;
        this.Q1 = m60Var;
        boolean W = org.telegram.messenger.t3.W(M0);
        this.U1 = W;
        this.W1 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.S1 = z10;
        this.T1 = org.telegram.messenger.t3.w(14, M0);
        Context context = this.f28586b.getContext();
        this.f28586b.addView(new ai.x2(18, context, this), b8.mf.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            a02 = org.telegram.messenger.bd.a0(null, null, 2131743465, new Object[0]);
        } else {
            a02 = org.telegram.messenger.bd.a0(null, null, 2131743334, new Object[0]);
        }
        textView.setText(a02);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.Gi, null);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        int i10 = org.telegram.ui.ActionBar.k6.f27878d6;
        int o10 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.k6.k0(L, L, L, L, x02, o10, o10);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.r6.k(textView, k02, N, h, null);
        this.f28586b.addView(textView, b8.mf.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z11 = false;
            a03 = org.telegram.messenger.bd.a0(null, null, 2131743472, new Object[0]);
        } else {
            z11 = false;
            a03 = org.telegram.messenger.bd.a0(null, null, 2131743351, new Object[0]);
        }
        textView2.setText(a03);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.r6.V(textView2, i3, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o11 = i0.a.o(org.telegram.ui.ActionBar.k6.x0(null, i3, z11), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.k6.k0(L2, L2, L2, L2, 0, o11, o11);
        org.telegram.ui.ActionBar.n6 h7 = org.telegram.ui.ActionBar.r6.h(i3, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.r6.k(textView2, k03, null, h7, null);
        this.f28586b.addView(textView2, b8.mf.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final oq f36231b;

            {
                this.f36231b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        oq oqVar = this.f36231b;
                        oqVar.X1 = org.telegram.messenger.hp.s1(oqVar.f28583a).j1(org.telegram.messenger.zi.C1(oqVar.W1));
                        oqVar.dismiss();
                        return;
                    default:
                        oq oqVar2 = this.f36231b;
                        oqVar2.X1 = org.telegram.messenger.hp.s1(oqVar2.f28583a).j1(org.telegram.messenger.zi.C1(oqVar2.W1));
                        oqVar2.V1 = true;
                        oqVar2.dismiss();
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final oq f36231b;

            {
                this.f36231b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        oq oqVar = this.f36231b;
                        oqVar.X1 = org.telegram.messenger.hp.s1(oqVar.f28583a).j1(org.telegram.messenger.zi.C1(oqVar.W1));
                        oqVar.dismiss();
                        return;
                    default:
                        oq oqVar2 = this.f36231b;
                        oqVar2.X1 = org.telegram.messenger.hp.s1(oqVar2.f28583a).j1(org.telegram.messenger.zi.C1(oqVar2.W1));
                        oqVar2.V1 = true;
                        oqVar2.dismiss();
                        return;
                }
            }
        });
        tj0 tj0Var = this.f36102l1;
        int i11 = this.f28618u0;
        tj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(120.0f));
        this.f36102l1.setOnItemClickListener(new k(this, 4));
        N();
        b1();
    }

    @Override
    public final void K() {
        super.K();
        TLRPC.InputPeer inputPeer = this.X1;
        if (inputPeer != null) {
            boolean z10 = true;
            if (this.R1.size() <= 1) {
                z10 = false;
            }
            this.Q1.a(inputPeer, z10, this.V1, false);
        }
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        return new nq(this);
    }

    @Override
    public final CharSequence O0() {
        if (this.U1) {
            return org.telegram.messenger.bd.M0(2131744913, null);
        }
        return org.telegram.messenger.bd.M0(2131744910, null);
    }
}

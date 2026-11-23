package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class er extends sa {
    public final g70 T1;
    public final ArrayList U1;
    public final boolean V1;
    public final boolean W1;
    public final boolean X1;
    public boolean Y1;
    public TLRPC.Peer Z1;
    public TLRPC.InputPeer f34965a2;
    public final org.telegram.ui.ActionBar.g2 f34966b2;
    public final long f34967c2;

    public er(org.telegram.ui.ActionBar.g2 g2Var, ArrayList arrayList, long j3, g70 g70Var) {
        super(g2Var, false);
        boolean z10;
        String a02;
        boolean z11;
        String a03;
        TLRPC.Chat O0 = org.telegram.messenger.np.u1(this.f30173a).O0(Long.valueOf(-j3));
        this.f34966b2 = g2Var;
        this.f34967c2 = j3;
        this.f39538v1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.U1 = arrayList2;
        this.T1 = g70Var;
        boolean W = org.telegram.messenger.v3.W(O0);
        this.X1 = W;
        this.Z1 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V1 = z10;
        this.W1 = org.telegram.messenger.v3.w(14, O0);
        Context context = this.f30176b.getContext();
        this.f30176b.addView(new bi.m3(18, context, this), c8.ma.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131743210, new Object[0]);
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131743079, new Object[0]);
        }
        textView.setText(a02);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.Ji, null);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.m6.f29381d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.m6.k0(L, L, L, L, x02, o4, o4);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        org.telegram.ui.ActionBar.p6 g10 = org.telegram.ui.ActionBar.t6.g(i10, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.t6.j(textView, k02, M, g10, null);
        this.f30176b.addView(textView, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z11 = false;
            a03 = org.telegram.messenger.hd.a0(null, null, 2131743217, new Object[0]);
        } else {
            z11 = false;
            a03 = org.telegram.messenger.hd.a0(null, null, 2131743096, new Object[0]);
        }
        textView2.setText(a03);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.t6.U(textView2, i7, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.m6.x0(null, i7, z11), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.m6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.p6 g11 = org.telegram.ui.ActionBar.t6.g(i7, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.t6.j(textView2, k03, null, g11, null);
        this.f30176b.addView(textView2, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final er f34287b;

            {
                this.f34287b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        er erVar = this.f34287b;
                        erVar.f34965a2 = org.telegram.messenger.np.u1(erVar.f30173a).l1(org.telegram.messenger.gj.B1(erVar.Z1));
                        erVar.dismiss();
                        return;
                    default:
                        er erVar2 = this.f34287b;
                        erVar2.f34965a2 = org.telegram.messenger.np.u1(erVar2.f30173a).l1(org.telegram.messenger.gj.B1(erVar2.Z1));
                        erVar2.Y1 = true;
                        erVar2.dismiss();
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final er f34287b;

            {
                this.f34287b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        er erVar = this.f34287b;
                        erVar.f34965a2 = org.telegram.messenger.np.u1(erVar.f30173a).l1(org.telegram.messenger.gj.B1(erVar.Z1));
                        erVar.dismiss();
                        return;
                    default:
                        er erVar2 = this.f34287b;
                        erVar2.f34965a2 = org.telegram.messenger.np.u1(erVar2.f30173a).l1(org.telegram.messenger.gj.B1(erVar2.Z1));
                        erVar2.Y1 = true;
                        erVar2.dismiss();
                        return;
                }
            }
        });
        ek0 ek0Var = this.f39531o1;
        int i11 = this.f30211u0;
        ek0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(120.0f));
        this.f39531o1.setOnItemClickListener(new o(this, 4));
        O();
        c1();
    }

    @Override
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.f34965a2;
        if (inputPeer != null) {
            boolean z10 = true;
            if (this.U1.size() <= 1) {
                z10 = false;
            }
            this.T1.a(inputPeer, z10, this.Y1, false);
        }
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        return new dr(this);
    }

    @Override
    public final CharSequence P0() {
        if (this.X1) {
            return org.telegram.messenger.hd.N0(2131744660, null);
        }
        return org.telegram.messenger.hd.N0(2131744657, null);
    }
}

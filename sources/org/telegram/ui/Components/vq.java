package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class vq extends ja {
    public final t60 T1;
    public final ArrayList U1;
    public final boolean V1;
    public final boolean W1;
    public final boolean X1;
    public boolean Y1;
    public TLRPC.Peer Z1;
    public TLRPC.InputPeer f41129a2;
    public final org.telegram.ui.ActionBar.e2 f41130b2;
    public final long f41131c2;

    public vq(org.telegram.ui.ActionBar.e2 e2Var, ArrayList arrayList, long j3, t60 t60Var) {
        super(e2Var, false);
        boolean z10;
        String a02;
        boolean z11;
        String a03;
        TLRPC.Chat M0 = org.telegram.messenger.np.s1(this.f29679a).M0(Long.valueOf(-j3));
        this.f41130b2 = e2Var;
        this.f41131c2 = j3;
        this.f35938v1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.U1 = arrayList2;
        this.T1 = t60Var;
        boolean W = org.telegram.messenger.t3.W(M0);
        this.X1 = W;
        this.Z1 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.V1 = z10;
        this.W1 = org.telegram.messenger.t3.w(14, M0);
        Context context = this.f29682b.getContext();
        this.f29682b.addView(new bi.o2(18, context, this), c8.ja.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131743455, new Object[0]);
        } else {
            a02 = org.telegram.messenger.hd.a0(null, null, 2131743324, new Object[0]);
        }
        textView.setText(a02);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.Ji, null);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.j6.Fi;
        int x02 = org.telegram.ui.ActionBar.j6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.j6.f28849d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.j6.k0(L, L, L, L, x02, o4, o4);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i7);
        org.telegram.ui.ActionBar.m6 g10 = org.telegram.ui.ActionBar.q6.g(i10, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.q6.j(textView, k02, M, g10, null);
        this.f29682b.addView(textView, c8.ja.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z11 = false;
            a03 = org.telegram.messenger.hd.a0(null, null, 2131743462, new Object[0]);
        } else {
            z11 = false;
            a03 = org.telegram.messenger.hd.a0(null, null, 2131743341, new Object[0]);
        }
        textView2.setText(a03);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.q6.U(textView2, i7, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.j6.x0(null, i7, z11), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.j6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.m6 g11 = org.telegram.ui.ActionBar.q6.g(i7, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.q6.j(textView2, k03, null, g11, null);
        this.f29682b.addView(textView2, c8.ja.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final vq f39779b;

            {
                this.f39779b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        vq vqVar = this.f39779b;
                        vqVar.f41129a2 = org.telegram.messenger.np.s1(vqVar.f29679a).j1(org.telegram.messenger.gj.B1(vqVar.Z1));
                        vqVar.dismiss();
                        return;
                    default:
                        vq vqVar2 = this.f39779b;
                        vqVar2.f41129a2 = org.telegram.messenger.np.s1(vqVar2.f29679a).j1(org.telegram.messenger.gj.B1(vqVar2.Z1));
                        vqVar2.Y1 = true;
                        vqVar2.dismiss();
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final vq f39779b;

            {
                this.f39779b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        vq vqVar = this.f39779b;
                        vqVar.f41129a2 = org.telegram.messenger.np.s1(vqVar.f29679a).j1(org.telegram.messenger.gj.B1(vqVar.Z1));
                        vqVar.dismiss();
                        return;
                    default:
                        vq vqVar2 = this.f39779b;
                        vqVar2.f41129a2 = org.telegram.messenger.np.s1(vqVar2.f29679a).j1(org.telegram.messenger.gj.B1(vqVar2.Z1));
                        vqVar2.Y1 = true;
                        vqVar2.dismiss();
                        return;
                }
            }
        });
        uj0 uj0Var = this.f35931o1;
        int i11 = this.f29717u0;
        uj0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(120.0f));
        this.f35931o1.setOnItemClickListener(new j(this, 4));
        O();
        b1();
    }

    @Override
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.f41129a2;
        if (inputPeer != null) {
            boolean z10 = true;
            if (this.U1.size() <= 1) {
                z10 = false;
            }
            this.T1.a(inputPeer, z10, this.Y1, false);
        }
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        return new uq(this);
    }

    @Override
    public final CharSequence O0() {
        if (this.X1) {
            return org.telegram.messenger.hd.M0(2131744903, null);
        }
        return org.telegram.messenger.hd.M0(2131744900, null);
    }
}

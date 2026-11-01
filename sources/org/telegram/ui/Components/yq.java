package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yq extends ha {
    public final i70 P1;
    public final ArrayList Q1;
    public final boolean R1;
    public final boolean S1;
    public final boolean T1;
    public boolean U1;
    public TLRPC.Peer V1;
    public TLRPC.InputPeer W1;
    public final org.telegram.ui.ActionBar.k2 X1;
    public final long Y1;

    public yq(org.telegram.ui.ActionBar.k2 k2Var, ArrayList arrayList, long j10, i70 i70Var) {
        super(k2Var, false);
        boolean z10;
        String a02;
        boolean z11;
        String a03;
        TLRPC.Chat L0 = org.telegram.messenger.wp.r1(this.f21584a).L0(Long.valueOf(-j10));
        this.X1 = k2Var;
        this.Y1 = j10;
        this.f26730r1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.Q1 = arrayList2;
        this.P1 = i70Var;
        boolean W = org.telegram.messenger.w3.W(L0);
        this.T1 = W;
        this.V1 = (TLRPC.Peer) arrayList2.get(0);
        if (arrayList2.size() > 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.R1 = z10;
        this.S1 = org.telegram.messenger.w3.w(14, L0);
        Context context = this.f21587b.getContext();
        this.f21587b.addView(new bi.t0(this, context, 12), w7.b6.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        if (W) {
            a02 = org.telegram.messenger.dd.a0(null, null, 2131743481, new Object[0]);
        } else {
            a02 = org.telegram.messenger.dd.a0(null, null, 2131743350, new Object[0]);
        }
        textView.setText(a02);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.Gi, null);
        int L = org.telegram.messenger.i0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int i11 = org.telegram.ui.ActionBar.t6.f20930d6;
        int o10 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i11, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.t6.k0(L, L, L, L, x02, o10, o10);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(i11, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.a7.k(textView, k02, N, h, null);
        this.f21587b.addView(textView, w7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        if (W) {
            z11 = false;
            a03 = org.telegram.messenger.dd.a0(null, null, 2131743488, new Object[0]);
        } else {
            z11 = false;
            a03 = org.telegram.messenger.dd.a0(null, null, 2131743367, new Object[0]);
        }
        textView2.setText(a03);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.a7.V(textView2, i10, null);
        int L2 = org.telegram.messenger.i0.L(8.0f);
        int o11 = i0.b.o(org.telegram.ui.ActionBar.t6.x0(null, i10, z11), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.t6.k0(L2, L2, L2, L2, 0, o11, o11);
        org.telegram.ui.ActionBar.w6 h10 = org.telegram.ui.ActionBar.a7.h(i10, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.a7.k(textView2, k03, null, h10, null);
        this.f21587b.addView(textView2, w7.b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final yq f32296b;

            {
                this.f32296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        yq yqVar = this.f32296b;
                        yqVar.W1 = org.telegram.messenger.wp.r1(yqVar.f21584a).i1(org.telegram.messenger.kj.C1(yqVar.V1));
                        yqVar.dismiss();
                        return;
                    default:
                        yq yqVar2 = this.f32296b;
                        yqVar2.W1 = org.telegram.messenger.wp.r1(yqVar2.f21584a).i1(org.telegram.messenger.kj.C1(yqVar2.V1));
                        yqVar2.U1 = true;
                        yqVar2.dismiss();
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final yq f32296b;

            {
                this.f32296b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        yq yqVar = this.f32296b;
                        yqVar.W1 = org.telegram.messenger.wp.r1(yqVar.f21584a).i1(org.telegram.messenger.kj.C1(yqVar.V1));
                        yqVar.dismiss();
                        return;
                    default:
                        yq yqVar2 = this.f32296b;
                        yqVar2.W1 = org.telegram.messenger.wp.r1(yqVar2.f21584a).i1(org.telegram.messenger.kj.C1(yqVar2.V1));
                        yqVar2.U1 = true;
                        yqVar2.dismiss();
                        return;
                }
            }
        });
        uk0 uk0Var = this.f26724k1;
        int i12 = this.f21616t0;
        uk0Var.setPadding(i12, 0, i12, org.telegram.messenger.i0.L(120.0f));
        this.f26724k1.setOnItemClickListener(new k(this, 4));
        O();
        b1();
    }

    @Override
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.W1;
        if (inputPeer != null) {
            boolean z10 = true;
            if (this.Q1.size() <= 1) {
                z10 = false;
            }
            this.P1.a(inputPeer, z10, this.U1, false);
        }
    }

    @Override
    public final tk0 L0(uk0 uk0Var) {
        return new xq(this);
    }

    @Override
    public final CharSequence O0() {
        if (this.T1) {
            return org.telegram.messenger.dd.L0(2131744921, null);
        }
        return org.telegram.messenger.dd.L0(2131744918, null);
    }
}

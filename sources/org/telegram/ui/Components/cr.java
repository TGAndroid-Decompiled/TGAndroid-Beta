package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cr extends sa {
    public final e70 T1;
    public final ArrayList U1;
    public final boolean V1;
    public final boolean W1;
    public final boolean X1;
    public boolean Y1;
    public TLRPC.Peer Z1;
    public TLRPC.InputPeer f34164a2;
    public final org.telegram.ui.ActionBar.h2 f34165b2;
    public final long f34166c2;

    public cr(org.telegram.ui.ActionBar.h2 h2Var, ArrayList arrayList, long j3, e70 e70Var) {
        super(h2Var, false);
        boolean z10;
        String a02;
        boolean z11;
        String a03;
        TLRPC.Chat O0 = org.telegram.messenger.mp.u1(this.f30187a).O0(Long.valueOf(-j3));
        this.f34165b2 = h2Var;
        this.f34166c2 = j3;
        this.f39541v1 = 0.26f;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.U1 = arrayList2;
        this.T1 = e70Var;
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
        Context context = this.f30190b.getContext();
        this.f30190b.addView(new bi.i3(18, context, this), c8.ma.d(-1, 120.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setSingleLine(true);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            a02 = org.telegram.messenger.gd.a0(null, null, 2131743218, new Object[0]);
        } else {
            a02 = org.telegram.messenger.gd.a0(null, null, 2131743087, new Object[0]);
        }
        textView.setText(a02);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.Ji, null);
        int L = org.telegram.messenger.g0.L(8.0f);
        int i7 = org.telegram.ui.ActionBar.n6.Fi;
        int x02 = org.telegram.ui.ActionBar.n6.x0(null, i7, false);
        int i10 = org.telegram.ui.ActionBar.n6.f29394d6;
        int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i10, false), 120);
        org.telegram.ui.Cells.y k02 = org.telegram.ui.ActionBar.n6.k0(L, L, L, L, x02, o4, o4);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i7);
        org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(i10, 120);
        textView.setBackground(k02);
        org.telegram.ui.ActionBar.u6.j(textView, k02, M, g10, null);
        this.f30190b.addView(textView, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 60.0f));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setEllipsize(truncateAt);
        textView2.setSingleLine(true);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        if (W) {
            z11 = false;
            a03 = org.telegram.messenger.gd.a0(null, null, 2131743225, new Object[0]);
        } else {
            z11 = false;
            a03 = org.telegram.messenger.gd.a0(null, null, 2131743104, new Object[0]);
        }
        textView2.setText(a03);
        textView2.setLetterSpacing(0.025f);
        org.telegram.ui.ActionBar.u6.U(textView2, i7, null);
        int L2 = org.telegram.messenger.g0.L(8.0f);
        int o10 = i0.a.o(org.telegram.ui.ActionBar.n6.x0(null, i7, z11), 120);
        org.telegram.ui.Cells.y k03 = org.telegram.ui.ActionBar.n6.k0(L2, L2, L2, L2, 0, o10, o10);
        org.telegram.ui.ActionBar.q6 g11 = org.telegram.ui.ActionBar.u6.g(i7, 120);
        textView2.setBackground(k03);
        org.telegram.ui.ActionBar.u6.j(textView2, k03, null, g11, null);
        this.f30190b.addView(textView2, c8.ma.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 6.0f));
        textView.setOnClickListener(new View.OnClickListener(this) {
            public final cr f33434b;

            {
                this.f33434b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        cr crVar = this.f33434b;
                        crVar.f34164a2 = org.telegram.messenger.mp.u1(crVar.f30187a).l1(org.telegram.messenger.fj.B1(crVar.Z1));
                        crVar.dismiss();
                        return;
                    default:
                        cr crVar2 = this.f33434b;
                        crVar2.f34164a2 = org.telegram.messenger.mp.u1(crVar2.f30187a).l1(org.telegram.messenger.fj.B1(crVar2.Z1));
                        crVar2.Y1 = true;
                        crVar2.dismiss();
                        return;
                }
            }
        });
        textView2.setOnClickListener(new View.OnClickListener(this) {
            public final cr f33434b;

            {
                this.f33434b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        cr crVar = this.f33434b;
                        crVar.f34164a2 = org.telegram.messenger.mp.u1(crVar.f30187a).l1(org.telegram.messenger.fj.B1(crVar.Z1));
                        crVar.dismiss();
                        return;
                    default:
                        cr crVar2 = this.f33434b;
                        crVar2.f34164a2 = org.telegram.messenger.mp.u1(crVar2.f30187a).l1(org.telegram.messenger.fj.B1(crVar2.Z1));
                        crVar2.Y1 = true;
                        crVar2.dismiss();
                        return;
                }
            }
        });
        ck0 ck0Var = this.f39534o1;
        int i11 = this.f30225u0;
        ck0Var.setPadding(i11, 0, i11, org.telegram.messenger.g0.L(120.0f));
        this.f39534o1.setOnItemClickListener(new n(this, 4));
        O();
        c1();
    }

    @Override
    public final void L() {
        super.L();
        TLRPC.InputPeer inputPeer = this.f34164a2;
        if (inputPeer != null) {
            boolean z10 = true;
            if (this.U1.size() <= 1) {
                z10 = false;
            }
            this.T1.a(inputPeer, z10, this.Y1, false);
        }
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        return new br(this);
    }

    @Override
    public final CharSequence P0() {
        if (this.X1) {
            return org.telegram.messenger.gd.M0(2131744668, null);
        }
        return org.telegram.messenger.gd.M0(2131744665, null);
    }
}

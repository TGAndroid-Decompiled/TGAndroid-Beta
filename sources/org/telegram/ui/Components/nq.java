package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nq extends sj0 {
    public final oq f36606c;

    public nq(oq oqVar) {
        this.f36606c = oqVar;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        if (d1Var.f55544f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        oq oqVar = this.f36606c;
        if (oqVar.S1) {
            return oqVar.R1.size() + 3;
        }
        if (oqVar.T1) {
            return 2;
        }
        return 1;
    }

    @Override
    public final int d(int i3) {
        if (i3 != 0) {
            int i10 = 1;
            if (i3 != 1) {
                i10 = 2;
                if (i3 != 2) {
                    return 3;
                }
            }
            return i10;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        TLObject M0;
        String str;
        boolean z10;
        int i10 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z11 = true;
        if (i10 == 3) {
            oq oqVar = this.f36606c;
            TLRPC.Peer peer = (TLRPC.Peer) oqVar.R1.get(i3 - 3);
            long C1 = org.telegram.messenger.zi.C1(peer);
            if (C1 > 0) {
                M0 = org.telegram.messenger.hp.s1(oqVar.f28583a).a2(Long.valueOf(C1));
                str = org.telegram.messenger.bd.M0(2131743359, null);
            } else {
                M0 = org.telegram.messenger.hp.s1(oqVar.f28583a).M0(Long.valueOf(-C1));
                str = null;
            }
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (i3 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            h4Var.e(M0, null, str, z10);
            if (peer != oqVar.W1) {
                z11 = false;
            }
            h4Var.c(z11, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            n4Var.setTextSize(15.0f);
            n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            n4Var.setText(org.telegram.messenger.bd.M0(2131743453, null).replace(":", ""));
        } else if (i10 == 1) {
            ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131743440, null), org.telegram.ui.ActionBar.k6.L6, 0, new gp(this, 3), null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        FrameLayout frameLayout;
        String a02;
        String a03;
        Context context = viewGroup.getContext();
        oq oqVar = this.f36606c;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    boolean z10 = oqVar.U1;
                    ?? qVar = new ci.q(context, 6);
                    qVar.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624327, 112, 112, null);
                    imageView.d();
                    qVar.addView(imageView, b8.mf.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    if (z10) {
                        a02 = org.telegram.messenger.bd.a0(null, null, 2131744913, new Object[0]);
                    } else {
                        a02 = org.telegram.messenger.bd.a0(null, null, 2131744910, new Object[0]);
                    }
                    textView.setText(a02);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    qVar.addView(textView, b8.mf.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27988j5, null);
                    if (z10) {
                        a03 = org.telegram.messenger.bd.a0(null, null, 2131743468, new Object[0]);
                    } else {
                        a03 = org.telegram.messenger.bd.a0(null, null, 2131743343, new Object[0]);
                    }
                    textView2.setText(a03);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    qVar.addView(textView2, b8.mf.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = qVar;
                } else {
                    frameLayout = new org.telegram.ui.Cells.h4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.n4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27824a7, y8Var, oqVar.J0);
            y8Var.setTopPadding(17);
            y8Var.setBottomPadding(17);
            frameLayout = y8Var;
        }
        frameLayout.setLayoutParams(new u4.p0(-1, -2));
        return new u4.d1(frameLayout);
    }
}

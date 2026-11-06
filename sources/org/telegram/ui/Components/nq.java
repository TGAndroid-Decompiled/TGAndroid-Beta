package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nq extends oj0 {
    public final oq f36468c;

    public nq(oq oqVar) {
        this.f36468c = oqVar;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f56931f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        oq oqVar = this.f36468c;
        if (oqVar.R1) {
            return oqVar.Q1.size() + 3;
        }
        if (oqVar.S1) {
            return 2;
        }
        return 1;
    }

    @Override
    public final int d(int i7) {
        if (i7 != 0) {
            int i10 = 1;
            if (i7 != 1) {
                i10 = 2;
                if (i7 != 2) {
                    return 3;
                }
            }
            return i10;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLObject M0;
        String str;
        boolean z9;
        int i10 = d1Var.f56931f;
        View view = d1Var.f56927a;
        boolean z10 = true;
        if (i10 == 3) {
            oq oqVar = this.f36468c;
            TLRPC.Peer peer = (TLRPC.Peer) oqVar.Q1.get(i7 - 3);
            long C1 = org.telegram.messenger.ij.C1(peer);
            if (C1 > 0) {
                M0 = org.telegram.messenger.qp.s1(oqVar.f28612a).a2(Long.valueOf(C1));
                str = org.telegram.messenger.hd.M0(2131743350, null);
            } else {
                M0 = org.telegram.messenger.qp.s1(oqVar.f28612a).M0(Long.valueOf(-C1));
                str = null;
            }
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (i7 != b() - 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            h4Var.e(M0, null, str, z9);
            if (peer != oqVar.V1) {
                z10 = false;
            }
            h4Var.c(z10, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            n4Var.setTextSize(15.0f);
            n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            n4Var.setText(org.telegram.messenger.hd.M0(2131743444, null).replace(":", ""));
        } else if (i10 == 1) {
            ((org.telegram.ui.Cells.z8) view).setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131743431, null), org.telegram.ui.ActionBar.k6.L6, 0, new gp(this, 3), null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        String a02;
        String a03;
        Context context = viewGroup.getContext();
        oq oqVar = this.f36468c;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    boolean z9 = oqVar.T1;
                    ?? tVar = new bi.t(context, 6);
                    tVar.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624327, 112, 112, null);
                    imageView.d();
                    tVar.addView(imageView, c8.ha.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    if (z9) {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131744904, new Object[0]);
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131744901, new Object[0]);
                    }
                    textView.setText(a02);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                    tVar.addView(textView, c8.ha.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f27956j5, null);
                    if (z9) {
                        a03 = org.telegram.messenger.hd.a0(null, null, 2131743459, new Object[0]);
                    } else {
                        a03 = org.telegram.messenger.hd.a0(null, null, 2131743334, new Object[0]);
                    }
                    textView2.setText(a03);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    tVar.addView(textView2, c8.ha.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = tVar;
                } else {
                    frameLayout = new org.telegram.ui.Cells.h4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.n4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27792a7, z8Var, oqVar.I0);
            z8Var.setTopPadding(17);
            z8Var.setBottomPadding(17);
            frameLayout = z8Var;
        }
        frameLayout.setLayoutParams(new v4.o0(-1, -2));
        return new v4.d1(frameLayout);
    }
}

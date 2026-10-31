package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xq extends sk0 {
    public final yq f32532c;

    public xq(yq yqVar) {
        this.f32532c = yqVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        yq yqVar = this.f32532c;
        if (yqVar.R1) {
            return yqVar.Q1.size() + 3;
        }
        if (yqVar.S1) {
            return 2;
        }
        return 1;
    }

    @Override
    public final int d(int i10) {
        if (i10 != 0) {
            int i11 = 1;
            if (i10 != 1) {
                i11 = 2;
                if (i10 != 2) {
                    return 3;
                }
            }
            return i11;
        }
        return 0;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLObject L0;
        String str;
        boolean z10;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        boolean z11 = true;
        if (i11 == 3) {
            yq yqVar = this.f32532c;
            TLRPC.Peer peer = (TLRPC.Peer) yqVar.Q1.get(i10 - 3);
            long C1 = org.telegram.messenger.jj.C1(peer);
            if (C1 > 0) {
                L0 = org.telegram.messenger.vp.r1(yqVar.f21583a).Z1(Long.valueOf(C1));
                str = org.telegram.messenger.cd.L0(2131743375, null);
            } else {
                L0 = org.telegram.messenger.vp.r1(yqVar.f21583a).L0(Long.valueOf(-C1));
                str = null;
            }
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            j4Var.e(L0, null, str, z10);
            if (peer != yqVar.V1) {
                z11 = false;
            }
            j4Var.c(z11, false);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
            p4Var.setTextSize(15.0f);
            p4Var.setPadding(0, 0, 0, org.telegram.messenger.i0.L(2.0f));
            p4Var.setText(org.telegram.messenger.cd.L0(2131743469, null).replace(":", ""));
        } else if (i11 == 1) {
            ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.i0.H2(org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131743456, null), org.telegram.ui.ActionBar.t6.L6, 0, new ho(this, 5), null), true, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f)));
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        String a02;
        String a03;
        Context context = viewGroup.getContext();
        yq yqVar = this.f32532c;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    boolean z10 = yqVar.T1;
                    ?? z2Var = new jg.z2(context, 6);
                    z2Var.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624325, 112, 112, null);
                    imageView.d();
                    z2Var.addView(imageView, w7.b6.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    if (z10) {
                        a02 = org.telegram.messenger.cd.a0(null, null, 2131744921, new Object[0]);
                    } else {
                        a02 = org.telegram.messenger.cd.a0(null, null, 2131744918, new Object[0]);
                    }
                    textView.setText(a02);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
                    z2Var.addView(textView, w7.b6.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21037j5, null);
                    if (z10) {
                        a03 = org.telegram.messenger.cd.a0(null, null, 2131743484, new Object[0]);
                    } else {
                        a03 = org.telegram.messenger.cd.a0(null, null, 2131743359, new Object[0]);
                    }
                    textView2.setText(a03);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    z2Var.addView(textView2, w7.b6.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = z2Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.j4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.p4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.b9 b9Var = new org.telegram.ui.Cells.b9(context);
            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20872a7, b9Var, yqVar.I0);
            b9Var.setTopPadding(17);
            b9Var.setBottomPadding(17);
            frameLayout = b9Var;
        }
        frameLayout.setLayoutParams(new s4.o0(-1, -2));
        return new s4.c1(frameLayout);
    }
}

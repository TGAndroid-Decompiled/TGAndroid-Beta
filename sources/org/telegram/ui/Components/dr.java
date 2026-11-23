package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class dr extends dk0 {
    public final er f34527c;

    public dr(er erVar) {
        this.f34527c = erVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f59115f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        er erVar = this.f34527c;
        if (erVar.V1) {
            return erVar.U1.size() + 3;
        }
        if (erVar.W1) {
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
    public final void t(v4.e1 e1Var, int i7) {
        TLObject O0;
        String str;
        boolean z10;
        int i10 = e1Var.f59115f;
        View view = e1Var.f59111a;
        boolean z11 = true;
        if (i10 == 3) {
            er erVar = this.f34527c;
            TLRPC.Peer peer = (TLRPC.Peer) erVar.U1.get(i7 - 3);
            long B1 = org.telegram.messenger.gj.B1(peer);
            if (B1 > 0) {
                O0 = org.telegram.messenger.np.u1(erVar.f30139a).c2(Long.valueOf(B1));
                str = org.telegram.messenger.hd.N0(2131743106, null);
            } else {
                O0 = org.telegram.messenger.np.u1(erVar.f30139a).O0(Long.valueOf(-B1));
                str = null;
            }
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i4Var.e(O0, null, str, z10);
            if (peer != erVar.Z1) {
                z11 = false;
            }
            i4Var.c(z11, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            o4Var.setTextSize(15.0f);
            o4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            o4Var.setText(org.telegram.messenger.hd.N0(2131743200, null).replace(":", ""));
        } else if (i10 == 1) {
            ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131743187, null), org.telegram.ui.ActionBar.m6.L6, 0, new oo(this, 5), null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        String a02;
        String a03;
        Context context = viewGroup.getContext();
        er erVar = this.f34527c;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    boolean z10 = erVar.X1;
                    ?? k2Var = new ai.k2(context, 6);
                    k2Var.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624328, 112, 112, null);
                    imageView.d();
                    k2Var.addView(imageView, c8.na.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    if (z10) {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131744662, new Object[0]);
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131744659, new Object[0]);
                    }
                    textView.setText(a02);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
                    k2Var.addView(textView, c8.na.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.f29455j5, null);
                    if (z10) {
                        a03 = org.telegram.messenger.hd.a0(null, null, 2131743215, new Object[0]);
                    } else {
                        a03 = org.telegram.messenger.hd.a0(null, null, 2131743090, new Object[0]);
                    }
                    textView2.setText(a03);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    k2Var.addView(textView2, c8.na.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = k2Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.i4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.o4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29290a7, a9Var, erVar.J0);
            a9Var.setTopPadding(17);
            a9Var.setBottomPadding(17);
            frameLayout = a9Var;
        }
        frameLayout.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(frameLayout);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br extends bk0 {
    public final cr f33758c;

    public br(cr crVar) {
        this.f33758c = crVar;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f59127f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        cr crVar = this.f33758c;
        if (crVar.V1) {
            return crVar.U1.size() + 3;
        }
        if (crVar.W1) {
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
    public final void t(v4.f1 f1Var, int i7) {
        TLObject O0;
        String str;
        boolean z10;
        int i10 = f1Var.f59127f;
        View view = f1Var.f59123a;
        boolean z11 = true;
        if (i10 == 3) {
            cr crVar = this.f33758c;
            TLRPC.Peer peer = (TLRPC.Peer) crVar.U1.get(i7 - 3);
            long B1 = org.telegram.messenger.fj.B1(peer);
            if (B1 > 0) {
                O0 = org.telegram.messenger.mp.u1(crVar.f30187a).c2(Long.valueOf(B1));
                str = org.telegram.messenger.gd.M0(2131743112, null);
            } else {
                O0 = org.telegram.messenger.mp.u1(crVar.f30187a).O0(Long.valueOf(-B1));
                str = null;
            }
            org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) view;
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            i4Var.e(O0, null, str, z10);
            if (peer != crVar.Z1) {
                z11 = false;
            }
            i4Var.c(z11, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
            o4Var.setTextSize(15.0f);
            o4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            o4Var.setText(org.telegram.messenger.gd.M0(2131743206, null).replace(":", ""));
        } else if (i10 == 1) {
            ((org.telegram.ui.Cells.a9) view).setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131743193, null), org.telegram.ui.ActionBar.n6.L6, 0, new mo(this, 5), null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        String a02;
        String a03;
        Context context = viewGroup.getContext();
        cr crVar = this.f33758c;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    boolean z10 = crVar.X1;
                    ?? r2Var = new ai.r2(context, 6);
                    r2Var.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624328, 112, 112, null);
                    imageView.d();
                    r2Var.addView(imageView, c8.ma.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    if (z10) {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131744668, new Object[0]);
                    } else {
                        a02 = org.telegram.messenger.gd.a0(null, null, 2131744665, new Object[0]);
                    }
                    textView.setText(a02);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                    r2Var.addView(textView, c8.ma.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.f29502j5, null);
                    if (z10) {
                        a03 = org.telegram.messenger.gd.a0(null, null, 2131743221, new Object[0]);
                    } else {
                        a03 = org.telegram.messenger.gd.a0(null, null, 2131743096, new Object[0]);
                    }
                    textView2.setText(a03);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    r2Var.addView(textView2, c8.ma.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = r2Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.i4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.o4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29337a7, a9Var, crVar.J0);
            a9Var.setTopPadding(17);
            a9Var.setBottomPadding(17);
            frameLayout = a9Var;
        }
        frameLayout.setLayoutParams(new v4.q0(-1, -2));
        return new v4.f1(frameLayout);
    }
}

package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uq extends tj0 {
    public final vq f40145c;

    public uq(vq vqVar) {
        this.f40145c = vqVar;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        if (e1Var.f58539f == 3) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        vq vqVar = this.f40145c;
        if (vqVar.V1) {
            return vqVar.U1.size() + 3;
        }
        if (vqVar.W1) {
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
        TLObject M0;
        String str;
        boolean z10;
        int i10 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z11 = true;
        if (i10 == 3) {
            vq vqVar = this.f40145c;
            TLRPC.Peer peer = (TLRPC.Peer) vqVar.U1.get(i7 - 3);
            long B1 = org.telegram.messenger.gj.B1(peer);
            if (B1 > 0) {
                M0 = org.telegram.messenger.np.s1(vqVar.f29679a).a2(Long.valueOf(B1));
                str = org.telegram.messenger.hd.M0(2131743349, null);
            } else {
                M0 = org.telegram.messenger.np.s1(vqVar.f29679a).M0(Long.valueOf(-B1));
                str = null;
            }
            org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
            if (i7 != b() - 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            h4Var.e(M0, null, str, z10);
            if (peer != vqVar.Z1) {
                z11 = false;
            }
            h4Var.c(z11, false);
        } else if (i10 == 2) {
            org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
            n4Var.setTextSize(15.0f);
            n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(2.0f));
            n4Var.setText(org.telegram.messenger.hd.M0(2131743443, null).replace(":", ""));
        } else if (i10 == 1) {
            ((org.telegram.ui.Cells.y8) view).setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131743430, null), org.telegram.ui.ActionBar.j6.L6, 0, new fo(this, 5), null), true, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f)));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        FrameLayout frameLayout;
        String a02;
        String a03;
        Context context = viewGroup.getContext();
        vq vqVar = this.f40145c;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    boolean z10 = vqVar.X1;
                    ?? q2Var = new ai.q2(context, 6);
                    q2Var.setOrientation(1);
                    ?? imageView = new ImageView(context);
                    imageView.setAutoRepeat(true);
                    imageView.f(2131624328, 112, 112, null);
                    imageView.d();
                    q2Var.addView(imageView, c8.ja.t(112, 112, 49, 0, 24, 0, 0));
                    TextView textView = new TextView(context);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    if (z10) {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131744903, new Object[0]);
                    } else {
                        a02 = org.telegram.messenger.hd.a0(null, null, 2131744900, new Object[0]);
                    }
                    textView.setText(a02);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                    q2Var.addView(textView, c8.ja.t(-2, -2, 1, 0, 14, 0, 7));
                    TextView textView2 = new TextView(context);
                    textView2.setTextSize(1, 14.0f);
                    textView2.setGravity(1);
                    org.telegram.ui.ActionBar.q6.U(textView2, org.telegram.ui.ActionBar.j6.f28957j5, null);
                    if (z10) {
                        a03 = org.telegram.messenger.hd.a0(null, null, 2131743458, new Object[0]);
                    } else {
                        a03 = org.telegram.messenger.hd.a0(null, null, 2131743333, new Object[0]);
                    }
                    textView2.setText(a03);
                    textView2.setLineSpacing(textView2.getLineSpacingExtra(), textView2.getLineSpacingMultiplier() * 1.1f);
                    q2Var.addView(textView2, c8.ja.t(-2, -2, 1, 28, 0, 28, 17));
                    frameLayout = q2Var;
                } else {
                    frameLayout = new org.telegram.ui.Cells.h4(context, 1, 0, false);
                }
            } else {
                frameLayout = new org.telegram.ui.Cells.n4(context, 22);
            }
        } else {
            org.telegram.ui.Cells.y8 y8Var = new org.telegram.ui.Cells.y8(context);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, y8Var, vqVar.J0);
            y8Var.setTopPadding(17);
            y8Var.setBottomPadding(17);
            frameLayout = y8Var;
        }
        frameLayout.setLayoutParams(new v4.p0(-1, -2));
        return new v4.e1(frameLayout);
    }
}

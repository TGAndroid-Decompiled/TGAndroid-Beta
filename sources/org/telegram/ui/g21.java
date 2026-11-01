package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class g21 extends org.telegram.ui.Components.tk0 {
    public final g31 f37279c;

    public g21(g31 g31Var) {
        this.f37279c = g31Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47912f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f37279c.f37332u0;
    }

    @Override
    public final long c(int i10) {
        return Math.abs(((Long) this.f37279c.f37334v0.get(i10)).longValue());
    }

    @Override
    public final int d(int i10) {
        g31 g31Var = this.f37279c;
        if (i10 == g31Var.f37287a) {
            return 7;
        }
        if (i10 < g31Var.f37290b || i10 >= g31Var.f37293c) {
            if (i10 < g31Var.d || i10 >= g31Var.e) {
                if (i10 >= g31Var.E && i10 < g31Var.F) {
                    return 1;
                }
                if (i10 >= g31Var.f37324r && i10 < g31Var.f37327s) {
                    return 3;
                }
                if (g31Var.f37343y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (g31Var.f37345z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == g31Var.f37336w) {
                    return 6;
                }
                if (g31Var.f37337w0.indexOfKey(i10) < 0 && i10 != g31Var.f37300f && i10 != g31Var.D && i10 != g31Var.f37315n && i10 != g31Var.h && i10 != g31Var.f37342y) {
                    if (i10 != g31Var.f37339x) {
                        return 3;
                    }
                    return 8;
                }
                return 0;
            }
            return 1;
        }
        return 1;
    }

    @Override
    public final void t(s4.c1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g21.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        cl0 cl0Var;
        int o10;
        g31 g31Var = this.f37279c;
        int i11 = g31Var.W;
        org.telegram.ui.ActionBar.p6 p6Var = g31Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = g31Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            cl0Var = new m21(g31Var, context, z10);
        } else if (i10 == 2) {
            cl0Var = new ImageView(g31Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = g31Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f39059a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (g31Var.f37304g1) {
                    o10 = org.telegram.ui.ActionBar.t6.w(g31Var.f37302f1, org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false)));
                } else {
                    o10 = i0.b.o(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.If), 99);
                }
                if (g31Var.f37304g1) {
                    textView.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(11.0f), o10));
                } else {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(11.0f), o10);
                    org.telegram.ui.ActionBar.w6 h = org.telegram.ui.ActionBar.a7.h(org.telegram.ui.ActionBar.t6.If, 99);
                    textView.setBackground(d02);
                    org.telegram.ui.ActionBar.a7.k(textView, d02, h, null, null);
                }
                textView.setTypeface(org.telegram.messenger.i0.o());
                textView.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(1.66f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(2.0f));
                frameLayout.addView(textView, w7.b6.e(-2, -2, 17));
                cl0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(g31Var.getContext());
                org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f38638b = y3Var;
                y3Var.b(0.3f, 250L, org.telegram.ui.Components.gr.h);
                y3Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
                y3Var.setTypeface(org.telegram.messenger.i0.o());
                org.telegram.ui.ActionBar.a7.Z(y3Var, org.telegram.ui.ActionBar.t6.Gi, p6Var);
                y3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f38637a = frameLayout3;
                int i12 = org.telegram.ui.ActionBar.t6.Ci;
                org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 8.0f);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                org.telegram.ui.ActionBar.w6 f7 = org.telegram.ui.ActionBar.a7.f(i12);
                frameLayout3.setBackground(e);
                org.telegram.ui.ActionBar.a7.k(frameLayout3, e, N, f7, p6Var);
                frameLayout3.addView(y3Var, w7.b6.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.b6.c(-1.0f, -1));
                kg.x0 x0Var = new kg.x0(frameLayout2.getContext(), p6Var, false);
                frameLayout2.f38639c = x0Var;
                x0Var.setIcon(2131624312);
                frameLayout2.addView(x0Var, w7.b6.c(-1.0f, -1));
                cl0Var = frameLayout2;
            } else if (i10 == 6) {
                cl0 cl0Var2 = new cl0(g31Var.getContext(), 1);
                cl0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    cl0Var2.setText(org.telegram.messenger.dd.L0(2131745665, null));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    cl0Var2.setText(org.telegram.messenger.dd.L0(2131746395, null));
                } else {
                    cl0Var2.setText(org.telegram.messenger.dd.L0(2131751177, null));
                }
                cl0Var2.setGravity(17);
                org.telegram.ui.ActionBar.a7.V(cl0Var2, org.telegram.ui.ActionBar.t6.f21312y6, p6Var);
                cl0Var = cl0Var2;
            } else if (i10 == 7) {
                View x3Var = new org.telegram.ui.Cells.x3(g31Var.getContext(), 52);
                x3Var.setTag("searchbox");
                cl0Var = x3Var;
            } else {
                cl0Var = new q21(g31Var, g31Var.getContext());
            }
        } else {
            q21 q21Var = new q21(g31Var, g31Var.getContext());
            if (i10 == 8) {
                q21Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(q21Var);
                q21Var.h = imageReceiver;
                q21Var.f40667r = imageReceiver;
                imageReceiver.w0(g31Var.N);
                g31Var.O = q21Var;
                q21Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            }
            cl0Var = q21Var;
        }
        if (g31.c(g31Var)) {
            cl0Var.setScaleX(0.0f);
            cl0Var.setScaleY(0.0f);
        }
        return new s4.c1(cl0Var);
    }
}

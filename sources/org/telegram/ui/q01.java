package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class q01 extends org.telegram.ui.Components.dk0 {
    public final q11 f51208c;

    public q01(q11 q11Var) {
        this.f51208c = q11Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f51208c.f51273v0;
    }

    @Override
    public final long c(int i7) {
        return Math.abs(((Long) this.f51208c.f51276w0.get(i7)).longValue());
    }

    @Override
    public final int d(int i7) {
        q11 q11Var = this.f51208c;
        if (i7 == q11Var.f51225a) {
            return 7;
        }
        if (i7 < q11Var.f51229b || i7 >= q11Var.f51232c) {
            if (i7 < q11Var.d || i7 >= q11Var.f51237e) {
                if (i7 >= q11Var.F && i7 < q11Var.G) {
                    return 1;
                }
                if (i7 >= q11Var.f51263r && i7 < q11Var.f51266s) {
                    return 3;
                }
                if (q11Var.f51284z0.indexOfKey(i7) >= 0) {
                    return 4;
                }
                if (q11Var.A0.indexOfKey(i7) >= 0) {
                    return 5;
                }
                if (i7 == q11Var.f51275w) {
                    return 6;
                }
                if (q11Var.f51279x0.indexOfKey(i7) < 0 && i7 != q11Var.f51240f && i7 != q11Var.E && i7 != q11Var.f51255n && i7 != q11Var.h && i7 != q11Var.f51281y) {
                    if (i7 != q11Var.f51278x) {
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
    public final void t(v4.f1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q01.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        mb0 mb0Var;
        int o4;
        q11 q11Var = this.f51208c;
        int i10 = q11Var.f51226a0;
        org.telegram.ui.ActionBar.i6 i6Var = q11Var.f51227a1;
        boolean z10 = false;
        if (i7 == 0) {
            Context context = q11Var.getContext();
            if (i10 == 6) {
                z10 = true;
            }
            mb0Var = new w01(q11Var, context, z10);
        } else if (i7 == 2) {
            mb0Var = new ImageView(q11Var.getContext());
        } else if (i7 != 3 && i7 != 1 && i7 != 8) {
            if (i7 == 4) {
                Context context2 = q11Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f52772a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (q11Var.f51246h1) {
                    o4 = org.telegram.ui.ActionBar.n6.w(q11Var.f51244g1, org.telegram.ui.ActionBar.n6.r1(0.4f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false)));
                } else {
                    o4 = i0.a.o(org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.Lf), 99);
                }
                if (q11Var.f51246h1) {
                    textView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(11.0f), o4));
                } else {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(11.0f), o4);
                    org.telegram.ui.ActionBar.q6 g10 = org.telegram.ui.ActionBar.u6.g(org.telegram.ui.ActionBar.n6.Lf, 99);
                    textView.setBackground(d02);
                    org.telegram.ui.ActionBar.u6.j(textView, d02, g10, null, null);
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                frameLayout.addView(textView, c8.na.e(-2, -2, 17));
                mb0Var = frameLayout;
            } else if (i7 == 5) {
                ?? frameLayout2 = new FrameLayout(q11Var.getContext());
                org.telegram.ui.Cells.x3 x3Var = new org.telegram.ui.Cells.x3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f52508b = x3Var;
                x3Var.b(0.3f, 250L, org.telegram.ui.Components.kr.h);
                x3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                x3Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.u6.Y(x3Var, org.telegram.ui.ActionBar.n6.Ji, i6Var);
                x3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f52507a = frameLayout3;
                int i11 = org.telegram.ui.ActionBar.n6.Fi;
                org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.b6.e(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 8.0f);
                org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
                org.telegram.ui.ActionBar.q6 e11 = org.telegram.ui.ActionBar.u6.e(i11);
                frameLayout3.setBackground(e10);
                org.telegram.ui.ActionBar.u6.j(frameLayout3, e10, M, e11, i6Var);
                frameLayout3.addView(x3Var, c8.na.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, c8.na.c(-1.0f, -1));
                ug.r0 r0Var = new ug.r0(frameLayout2.getContext(), i6Var, false);
                frameLayout2.f52509c = r0Var;
                r0Var.setIcon(2131624315);
                frameLayout2.addView(r0Var, c8.na.c(-1.0f, -1));
                mb0Var = frameLayout2;
            } else if (i7 == 6) {
                mb0 mb0Var2 = new mb0(q11Var.getContext(), 4);
                mb0Var2.setTextSize(1, 13.0f);
                if (i10 == 3) {
                    mb0Var2.setText(org.telegram.messenger.gd.N0(2131745452, null));
                } else if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                    mb0Var2.setText(org.telegram.messenger.gd.N0(2131746184, null));
                } else {
                    mb0Var2.setText(org.telegram.messenger.gd.N0(2131751164, null));
                }
                mb0Var2.setGravity(17);
                org.telegram.ui.ActionBar.u6.U(mb0Var2, org.telegram.ui.ActionBar.n6.f29843y6, i6Var);
                mb0Var = mb0Var2;
            } else if (i7 == 7) {
                View w3Var = new org.telegram.ui.Cells.w3(q11Var.getContext(), 52);
                w3Var.setTag("searchbox");
                mb0Var = w3Var;
            } else {
                mb0Var = new a11(q11Var, q11Var.getContext());
            }
        } else {
            a11 a11Var = new a11(q11Var, q11Var.getContext());
            if (i7 == 8) {
                a11Var.R = true;
                ImageReceiver imageReceiver = new ImageReceiver(a11Var);
                a11Var.h = imageReceiver;
                a11Var.f45552r = imageReceiver;
                imageReceiver.x0(q11Var.O);
                q11Var.P = a11Var;
                a11Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            mb0Var = a11Var;
        }
        if (q11.c(q11Var)) {
            mb0Var.setScaleX(0.0f);
            mb0Var.setScaleY(0.0f);
        }
        return new v4.f1(mb0Var);
    }
}

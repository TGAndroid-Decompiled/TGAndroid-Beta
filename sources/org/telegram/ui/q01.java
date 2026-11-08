package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class q01 extends org.telegram.ui.Components.oj0 {
    public final q11 f49000c;

    public q01(q11 q11Var) {
        this.f49000c = q11Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57047f;
        if (i7 == 2 || i7 == 1 || i7 == 3 || i7 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f49000c.f49063u0;
    }

    @Override
    public final long c(int i7) {
        return Math.abs(((Long) this.f49000c.f49065v0.get(i7)).longValue());
    }

    @Override
    public final int d(int i7) {
        q11 q11Var = this.f49000c;
        if (i7 == q11Var.f49018a) {
            return 7;
        }
        if (i7 < q11Var.f49021b || i7 >= q11Var.f49024c) {
            if (i7 < q11Var.d || i7 >= q11Var.f49029e) {
                if (i7 >= q11Var.E && i7 < q11Var.F) {
                    return 1;
                }
                if (i7 >= q11Var.f49055r && i7 < q11Var.f49058s) {
                    return 3;
                }
                if (q11Var.f49074y0.indexOfKey(i7) >= 0) {
                    return 4;
                }
                if (q11Var.f49076z0.indexOfKey(i7) >= 0) {
                    return 5;
                }
                if (i7 == q11Var.f49067w) {
                    return 6;
                }
                if (q11Var.f49068w0.indexOfKey(i7) < 0 && i7 != q11Var.f49032f && i7 != q11Var.D && i7 != q11Var.f49047n && i7 != q11Var.h && i7 != q11Var.f49073y) {
                    if (i7 != q11Var.f49070x) {
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
    public final void t(v4.d1 r36, int r37) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.q01.t(v4.d1, int):void");
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        mb0 mb0Var;
        int o4;
        q11 q11Var = this.f49000c;
        int i10 = q11Var.W;
        org.telegram.ui.ActionBar.f6 f6Var = q11Var.Z0;
        boolean z9 = false;
        if (i7 == 0) {
            Context context = q11Var.getContext();
            if (i10 == 6) {
                z9 = true;
            }
            mb0Var = new w01(q11Var, context, z9);
        } else if (i7 == 2) {
            mb0Var = new ImageView(q11Var.getContext());
        } else if (i7 != 3 && i7 != 1 && i7 != 8) {
            if (i7 == 4) {
                Context context2 = q11Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f50465a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (q11Var.f49036g1) {
                    o4 = org.telegram.ui.ActionBar.k6.w(q11Var.f49034f1, org.telegram.ui.ActionBar.k6.r1(0.4f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false)));
                } else {
                    o4 = i0.a.o(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.If), 99);
                }
                if (q11Var.f49036g1) {
                    textView.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(11.0f), o4));
                } else {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(11.0f), o4);
                    org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.If, 99);
                    textView.setBackground(d02);
                    org.telegram.ui.ActionBar.r6.k(textView, d02, h, null, null);
                }
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(1.66f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(2.0f));
                frameLayout.addView(textView, c8.ha.e(-2, -2, 17));
                mb0Var = frameLayout;
            } else if (i7 == 5) {
                ?? frameLayout2 = new FrameLayout(q11Var.getContext());
                org.telegram.ui.Cells.w3 w3Var = new org.telegram.ui.Cells.w3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f50184b = w3Var;
                w3Var.b(0.3f, 250L, org.telegram.ui.Components.xq.h);
                w3Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                w3Var.setTypeface(org.telegram.messenger.g0.o());
                org.telegram.ui.ActionBar.r6.Z(w3Var, org.telegram.ui.ActionBar.k6.Gi, f6Var);
                w3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f50183a = frameLayout3;
                int i11 = org.telegram.ui.ActionBar.k6.Ci;
                org.telegram.ui.Cells.y e10 = org.telegram.ui.ActionBar.z5.e(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 8.0f);
                org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
                org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i11);
                frameLayout3.setBackground(e10);
                org.telegram.ui.ActionBar.r6.k(frameLayout3, e10, N, f10, f6Var);
                frameLayout3.addView(w3Var, c8.ha.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, c8.ha.c(-1.0f, -1));
                ug.p0 p0Var = new ug.p0(frameLayout2.getContext(), f6Var, false);
                frameLayout2.f50185c = p0Var;
                p0Var.setIcon(2131624314);
                frameLayout2.addView(p0Var, c8.ha.c(-1.0f, -1));
                mb0Var = frameLayout2;
            } else if (i7 == 6) {
                mb0 mb0Var2 = new mb0(q11Var.getContext(), 4);
                mb0Var2.setTextSize(1, 13.0f);
                if (i10 == 3) {
                    mb0Var2.setText(org.telegram.messenger.id.M0(2131745651, null));
                } else if (i10 != 0 && i10 != 12 && i10 != 9 && i10 != 10) {
                    mb0Var2.setText(org.telegram.messenger.id.M0(2131746381, null));
                } else {
                    mb0Var2.setText(org.telegram.messenger.id.M0(2131751177, null));
                }
                mb0Var2.setGravity(17);
                org.telegram.ui.ActionBar.r6.V(mb0Var2, org.telegram.ui.ActionBar.k6.f28244y6, f6Var);
                mb0Var = mb0Var2;
            } else if (i7 == 7) {
                View v3Var = new org.telegram.ui.Cells.v3(q11Var.getContext(), 52);
                v3Var.setTag("searchbox");
                mb0Var = v3Var;
            } else {
                mb0Var = new a11(q11Var, q11Var.getContext());
            }
        } else {
            a11 a11Var = new a11(q11Var, q11Var.getContext());
            if (i7 == 8) {
                a11Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(a11Var);
                a11Var.h = imageReceiver;
                a11Var.f43538r = imageReceiver;
                imageReceiver.w0(q11Var.N);
                q11Var.O = a11Var;
                a11Var.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
            }
            mb0Var = a11Var;
        }
        if (q11.c(q11Var)) {
            mb0Var.setScaleX(0.0f);
            mb0Var.setScaleY(0.0f);
        }
        return new v4.d1(mb0Var);
    }
}

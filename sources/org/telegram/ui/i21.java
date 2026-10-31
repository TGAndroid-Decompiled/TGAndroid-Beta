package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
public final class i21 extends org.telegram.ui.Components.sk0 {
    public final i31 f38102c;

    public i21(i31 i31Var) {
        this.f38102c = i31Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f47901f;
        if (i10 == 2 || i10 == 1 || i10 == 3 || i10 == 8) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f38102c.f38156u0;
    }

    @Override
    public final long c(int i10) {
        return Math.abs(((Long) this.f38102c.f38158v0.get(i10)).longValue());
    }

    @Override
    public final int d(int i10) {
        i31 i31Var = this.f38102c;
        if (i10 == i31Var.f38111a) {
            return 7;
        }
        if (i10 < i31Var.f38114b || i10 >= i31Var.f38117c) {
            if (i10 < i31Var.d || i10 >= i31Var.e) {
                if (i10 >= i31Var.E && i10 < i31Var.F) {
                    return 1;
                }
                if (i10 >= i31Var.f38148r && i10 < i31Var.f38151s) {
                    return 3;
                }
                if (i31Var.f38167y0.indexOfKey(i10) >= 0) {
                    return 4;
                }
                if (i31Var.f38169z0.indexOfKey(i10) >= 0) {
                    return 5;
                }
                if (i10 == i31Var.f38160w) {
                    return 6;
                }
                if (i31Var.f38161w0.indexOfKey(i10) < 0 && i10 != i31Var.f38124f && i10 != i31Var.D && i10 != i31Var.f38139n && i10 != i31Var.h && i10 != i31Var.f38166y) {
                    if (i10 != i31Var.f38163x) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i21.t(s4.c1, int):void");
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        el0 el0Var;
        int o10;
        i31 i31Var = this.f38102c;
        int i11 = i31Var.W;
        org.telegram.ui.ActionBar.p6 p6Var = i31Var.Z0;
        boolean z10 = false;
        if (i10 == 0) {
            Context context = i31Var.getContext();
            if (i11 == 6) {
                z10 = true;
            }
            el0Var = new o21(i31Var, context, z10);
        } else if (i10 == 2) {
            el0Var = new ImageView(i31Var.getContext());
        } else if (i10 != 3 && i10 != 1 && i10 != 8) {
            if (i10 == 4) {
                Context context2 = i31Var.getContext();
                ?? frameLayout = new FrameLayout(context2);
                TextView textView = new TextView(context2);
                frameLayout.f39817a = textView;
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                if (i31Var.f38128g1) {
                    o10 = org.telegram.ui.ActionBar.t6.w(i31Var.f38126f1, org.telegram.ui.ActionBar.t6.r1(0.4f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false)));
                } else {
                    o10 = i0.b.o(org.telegram.ui.ActionBar.t6.v0(org.telegram.ui.ActionBar.t6.If), 99);
                }
                if (i31Var.f38128g1) {
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
                el0Var = frameLayout;
            } else if (i10 == 5) {
                ?? frameLayout2 = new FrameLayout(i31Var.getContext());
                org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(frameLayout2.getContext(), false, false, false, 4);
                frameLayout2.f39460b = y3Var;
                y3Var.b(0.3f, 250L, org.telegram.ui.Components.gr.h);
                y3Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
                y3Var.setTypeface(org.telegram.messenger.i0.o());
                org.telegram.ui.ActionBar.a7.Z(y3Var, org.telegram.ui.ActionBar.t6.Gi, p6Var);
                y3Var.setGravity(17);
                FrameLayout frameLayout3 = new FrameLayout(frameLayout2.getContext());
                frameLayout2.f39459a = frameLayout3;
                int i12 = org.telegram.ui.ActionBar.t6.Ci;
                org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 8.0f);
                org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
                org.telegram.ui.ActionBar.w6 f7 = org.telegram.ui.ActionBar.a7.f(i12);
                frameLayout3.setBackground(e);
                org.telegram.ui.ActionBar.a7.k(frameLayout3, e, N, f7, p6Var);
                frameLayout3.addView(y3Var, w7.b6.e(-1, -2, 17));
                frameLayout2.addView(frameLayout3, w7.b6.c(-1.0f, -1));
                kg.x0 x0Var = new kg.x0(frameLayout2.getContext(), p6Var, false);
                frameLayout2.f39461c = x0Var;
                x0Var.setIcon(2131624312);
                frameLayout2.addView(x0Var, w7.b6.c(-1.0f, -1));
                el0Var = frameLayout2;
            } else if (i10 == 6) {
                el0 el0Var2 = new el0(i31Var.getContext(), 1);
                el0Var2.setTextSize(1, 13.0f);
                if (i11 == 3) {
                    el0Var2.setText(org.telegram.messenger.cd.L0(2131745665, null));
                } else if (i11 != 0 && i11 != 12 && i11 != 9 && i11 != 10) {
                    el0Var2.setText(org.telegram.messenger.cd.L0(2131746395, null));
                } else {
                    el0Var2.setText(org.telegram.messenger.cd.L0(2131751177, null));
                }
                el0Var2.setGravity(17);
                org.telegram.ui.ActionBar.a7.V(el0Var2, org.telegram.ui.ActionBar.t6.f21311y6, p6Var);
                el0Var = el0Var2;
            } else if (i10 == 7) {
                View x3Var = new org.telegram.ui.Cells.x3(i31Var.getContext(), 52);
                x3Var.setTag("searchbox");
                el0Var = x3Var;
            } else {
                el0Var = new s21(i31Var, i31Var.getContext());
            }
        } else {
            s21 s21Var = new s21(i31Var, i31Var.getContext());
            if (i10 == 8) {
                s21Var.Q = true;
                ImageReceiver imageReceiver = new ImageReceiver(s21Var);
                s21Var.h = imageReceiver;
                s21Var.f41361r = imageReceiver;
                imageReceiver.w0(i31Var.N);
                i31Var.O = s21Var;
                s21Var.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
            }
            el0Var = s21Var;
        }
        if (i31.c(i31Var)) {
            el0Var.setScaleX(0.0f);
            el0Var.setScaleY(0.0f);
        }
        return new s4.c1(el0Var);
    }
}

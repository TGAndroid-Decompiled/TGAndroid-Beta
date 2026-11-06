package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class mr0 extends org.telegram.ui.Components.oj0 {
    public final Context f47841c;
    public final or0 d;

    public mr0(or0 or0Var, Context context) {
        this.d = or0Var;
        this.f47841c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7;
        int b10 = d1Var.b();
        or0 or0Var = this.d;
        if (b10 != or0Var.f48520i0 && b10 != or0Var.f48534u0 && b10 != or0Var.f48535v0) {
            if (or0Var.I && b10 >= (i7 = or0Var.f48525n0) && b10 < or0Var.D + i7) {
                if (b10 - i7 < or0Var.f48540y) {
                    return false;
                }
            } else if (b10 != or0Var.f48526o0 && b10 != or0Var.f48530r0 && b10 != or0Var.f48532s0 && (or0Var.N != 0 || b10 != or0Var.f48533t0)) {
                return false;
            }
            return true;
        }
        return !or0Var.I;
    }

    @Override
    public final int b() {
        return this.d.f48539x0;
    }

    @Override
    public final int d(int i7) {
        or0 or0Var = this.d;
        if (i7 != or0Var.f48519h0 && i7 != or0Var.m0 && i7 != or0Var.f48528q0) {
            if (i7 == or0Var.f48523l0) {
                return 1;
            }
            if (i7 != or0Var.f48527p0 && i7 != or0Var.f48537w0 && i7 != or0Var.f48522k0) {
                if (i7 == or0Var.f48526o0) {
                    return 3;
                }
                if (i7 == or0Var.f48520i0) {
                    return 4;
                }
                if (i7 == or0Var.f48521j0) {
                    return 7;
                }
                if (i7 != or0Var.f48530r0 && i7 != or0Var.f48532s0 && i7 != or0Var.f48533t0 && i7 != or0Var.f48534u0 && i7 != or0Var.f48535v0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        or0 or0Var = this.d;
        int i14 = or0Var.N;
        boolean z9 = or0Var.f48513d0;
        int i15 = d1Var.f56931f;
        View view = d1Var.f56927a;
        boolean z10 = true;
        if (i15 != 0) {
            boolean z11 = false;
            if (i15 != 6) {
                Context context = this.f47841c;
                if (i15 != 2) {
                    if (i15 == 3) {
                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                        m8Var.g(-1, org.telegram.ui.ActionBar.k6.f28088q6);
                        Drawable drawable = context.getResources().getDrawable(2131232559);
                        Drawable drawable2 = context.getResources().getDrawable(2131232560);
                        int i16 = org.telegram.ui.ActionBar.k6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.r6.y(m8Var, drawable, i16, null, mode);
                        org.telegram.ui.ActionBar.r6.y(m8Var, drawable2, org.telegram.ui.ActionBar.k6.f27978k7, null, mode);
                        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
                        if (z9) {
                            i13 = 2131744069;
                        } else {
                            i13 = 2131754471;
                        }
                        m8Var.p(org.telegram.messenger.hd.M0(i13, null), xpVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                org.telegram.ui.ActionBar.r6.a0(z8Var, context, 2131231230, org.telegram.ui.ActionBar.k6.f27812b7);
                if (i7 == or0Var.f48522k0) {
                    z8Var.setText(org.telegram.messenger.hd.M0(2131754472, null));
                    return;
                } else if (i7 == or0Var.f48537w0) {
                    z8Var.setFixedSize(12);
                    z8Var.setText(null);
                    return;
                } else {
                    int i17 = or0Var.f48524n - or0Var.D;
                    if (i17 <= 0) {
                        if (z9) {
                            i12 = 2131744109;
                        } else {
                            i12 = 2131754469;
                        }
                        z8Var.setText(org.telegram.messenger.hd.M0(i12, null));
                        return;
                    } else if (z9) {
                        z8Var.setText(org.telegram.messenger.hd.H(',', "TodoNewTaskInfo", i17));
                        return;
                    } else {
                        z8Var.setText(org.telegram.messenger.hd.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.hd.G(i17, "Option", new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setEnabled(!or0Var.I);
            Switch checkBox = r8Var.getCheckBox();
            if (!or0Var.I) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i7 == or0Var.f48534u0) {
                r8Var.f(org.telegram.messenger.hd.M0(2131744094, null), or0Var.H, true);
                r8Var.e(null, true);
                return;
            } else if (i7 == or0Var.f48535v0) {
                r8Var.f(org.telegram.messenger.hd.M0(2131744093, null), or0Var.J, false);
                r8Var.e(null, true);
                return;
            } else if (i7 == or0Var.f48530r0) {
                String M0 = org.telegram.messenger.hd.M0(2131747177, null);
                boolean z12 = or0Var.G;
                if (or0Var.f48532s0 != -1 || or0Var.f48533t0 != -1) {
                    z11 = true;
                }
                r8Var.f(M0, z12, z11);
                r8Var.e(null, true);
                return;
            } else if (i7 == or0Var.f48532s0) {
                String M02 = org.telegram.messenger.hd.M0(2131747165, null);
                boolean z13 = or0Var.K;
                if (or0Var.f48533t0 != -1) {
                    z11 = true;
                }
                r8Var.f(M02, z13, z11);
                r8Var.e(null, true);
                return;
            } else if (i7 == or0Var.f48533t0) {
                r8Var.f(org.telegram.messenger.hd.M0(2131747163, null), or0Var.L, false);
                if (i14 != 0) {
                    z10 = false;
                }
                r8Var.e(null, z10);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i7 == or0Var.f48519h0) {
            if (z9) {
                if (or0Var.f48542z0 != null) {
                    i11 = 2131744075;
                } else {
                    i11 = 2131744055;
                }
            } else {
                i11 = 2131747164;
            }
            n4Var.setText(org.telegram.messenger.hd.M0(i11, null));
        } else if (i7 == or0Var.m0) {
            if (i14 == 1) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746446, null));
                return;
            }
            if (z9) {
                i10 = 2131744073;
            } else {
                i10 = 2131754246;
            }
            n4Var.setText(org.telegram.messenger.hd.M0(i10, null));
        } else if (i7 == or0Var.f48528q0) {
            n4Var.setText(org.telegram.messenger.hd.M0(2131745496, null));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        lr0 lr0Var;
        or0 or0Var = this.d;
        boolean z9 = or0Var.f48512c0;
        if (i7 != 0) {
            Context context = this.f47841c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    lr0 lr0Var2 = new lr0(this, context, z9 ? 1 : 0, new g40(or0Var, 22));
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, lr0Var2, null);
                                    lr0Var2.b(new fi.h7(9, this, lr0Var2));
                                    lr0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = lr0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new nd(3, this, lr0Var2));
                                    textView.setOnKeyListener(new zf(lr0Var2, 2));
                                    lr0Var = lr0Var2;
                                } else {
                                    kr0 kr0Var = new kr0(this, context, z9 ? 1 : 0);
                                    kr0Var.c();
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, kr0Var, null);
                                    kr0Var.b(new fi.h7(8, this, kr0Var));
                                    lr0Var = kr0Var;
                                }
                            } else {
                                View r8Var = new org.telegram.ui.Cells.r8(context);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, r8Var, null);
                                lr0Var = r8Var;
                            }
                        } else {
                            jr0 jr0Var = new jr0(this, context, z9 ? 1 : 0);
                            jr0Var.c();
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, jr0Var, null);
                            jr0Var.b(new fi.h7(7, this, jr0Var));
                            lr0Var = jr0Var;
                        }
                    } else {
                        View m8Var = new org.telegram.ui.Cells.m8(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, m8Var, null);
                        lr0Var = m8Var;
                    }
                } else {
                    lr0Var = new org.telegram.ui.Cells.z8(context);
                }
            } else {
                lr0Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
            }
        } else {
            View n4Var = new org.telegram.ui.Cells.n4(this.f47841c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27848d6, n4Var, null);
            lr0Var = n4Var;
        }
        return jg.g.r(lr0Var, lr0Var, -1, -2);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        boolean z9;
        int i7;
        int i10;
        int i11;
        or0 or0Var = this.d;
        boolean z10 = or0Var.f48513d0;
        int i12 = d1Var.f56931f;
        View view = d1Var.f56927a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i12 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            org.telegram.ui.Cells.z5 z5Var = a6Var.d;
            CharSequence charSequence2 = or0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i11 = 2131744054;
            } else {
                i11 = 2131746447;
            }
            a6Var.n(charSequence, org.telegram.messenger.hd.M0(i11, null), false);
            a6Var.setTag(null);
            a6Var.setEnabled(!or0Var.I);
            z5Var.setEnabled(true ^ or0Var.I);
            int i13 = org.telegram.ui.ActionBar.k6.G6;
            if (!or0Var.I) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.r6.W(z5Var, org.telegram.ui.ActionBar.r6.L(f10, i13), or0Var.getResourceProvider());
            or0.h0(or0Var, view, d1Var.b());
        } else if (i12 == 5) {
            int b10 = d1Var.b();
            org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
            a6Var2.setTag(1);
            org.telegram.ui.Cells.z5 z5Var2 = a6Var2.d;
            int i14 = b10 - or0Var.f48525n0;
            if (or0Var.I && i14 < or0Var.f48540y) {
                z9 = false;
            } else {
                z9 = true;
            }
            z5Var2.setEnabled(z9);
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            if (z9) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.r6.W(z5Var2, org.telegram.ui.ActionBar.r6.L(f10, i15), or0Var.getResourceProvider());
            CharSequence charSequence3 = or0Var.f48536w[i14];
            if (z10) {
                i7 = 2131744056;
            } else {
                i7 = 2131747773;
            }
            a6Var2.n(charSequence3, org.telegram.messenger.hd.M0(i7, null), true);
            a6Var2.setTag(null);
            ImageView imageView = a6Var2.f28888f;
            if (imageView != null) {
                if (z9) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
            }
            ImageView imageView2 = a6Var2.h;
            if (imageView2 != null) {
                if (!z9) {
                    f11 = 0.45f;
                }
                imageView2.setAlpha(f11);
            }
            if (!or0Var.f48517f0 && or0Var.f48518g0 == b10) {
                EditTextBoldCursor textView = a6Var2.getTextView();
                textView.requestFocus();
                org.telegram.messenger.g0.K3(textView);
                or0Var.f48517f0 = false;
                or0Var.f48518g0 = -1;
            }
            or0.h0(or0Var, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
            a6Var3.setTag(1);
            CharSequence charSequence4 = or0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            a6Var3.n(charSequence, org.telegram.messenger.hd.M0(2131754474, null), false);
            a6Var3.setTag(null);
            or0.h0(or0Var, view, d1Var.b());
        }
    }

    @Override
    public final void z(v4.d1 d1Var) {
        int i7 = d1Var.f56931f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) d1Var.f56927a).getTextView();
            if (textView.isFocused()) {
                or0 or0Var = this.d;
                if (or0Var.f48512c0) {
                    org.telegram.ui.Components.ow0 ow0Var = or0Var.Q;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    or0Var.p0(true);
                }
                or0Var.f48510b0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class nr0 extends org.telegram.ui.Components.bk0 {
    public final Context f50286c;
    public final pr0 d;

    public nr0(pr0 pr0Var, Context context) {
        this.d = pr0Var;
        this.f50286c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7;
        int b10 = f1Var.b();
        pr0 pr0Var = this.d;
        if (b10 != pr0Var.f50977j0 && b10 != pr0Var.f50991v0 && b10 != pr0Var.f50993w0) {
            if (pr0Var.J && b10 >= (i7 = pr0Var.f50982o0) && b10 < pr0Var.E + i7) {
                if (b10 - i7 < pr0Var.f50996y) {
                    return false;
                }
            } else if (b10 != pr0Var.f50983p0 && b10 != pr0Var.f50988s0 && b10 != pr0Var.f50989t0 && (pr0Var.O != 0 || b10 != pr0Var.f50990u0)) {
                return false;
            }
            return true;
        }
        return !pr0Var.J;
    }

    @Override
    public final int b() {
        return this.d.f50997y0;
    }

    @Override
    public final int d(int i7) {
        pr0 pr0Var = this.d;
        if (i7 != pr0Var.f50976i0 && i7 != pr0Var.f50981n0 && i7 != pr0Var.f50986r0) {
            if (i7 == pr0Var.m0) {
                return 1;
            }
            if (i7 != pr0Var.f50984q0 && i7 != pr0Var.f50995x0 && i7 != pr0Var.f50979l0) {
                if (i7 == pr0Var.f50983p0) {
                    return 3;
                }
                if (i7 == pr0Var.f50977j0) {
                    return 4;
                }
                if (i7 == pr0Var.f50978k0) {
                    return 7;
                }
                if (i7 != pr0Var.f50988s0 && i7 != pr0Var.f50989t0 && i7 != pr0Var.f50990u0 && i7 != pr0Var.f50991v0 && i7 != pr0Var.f50993w0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        pr0 pr0Var = this.d;
        int i14 = pr0Var.O;
        boolean z10 = pr0Var.f50971e0;
        int i15 = f1Var.f59126f;
        View view = f1Var.f59122a;
        boolean z11 = true;
        if (i15 != 0) {
            boolean z12 = false;
            if (i15 != 6) {
                Context context = this.f50286c;
                if (i15 != 2) {
                    if (i15 == 3) {
                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                        m8Var.g(-1, org.telegram.ui.ActionBar.n6.f29636q6);
                        Drawable drawable = context.getResources().getDrawable(2131232561);
                        Drawable drawable2 = context.getResources().getDrawable(2131232562);
                        int i16 = org.telegram.ui.ActionBar.n6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.u6.x(m8Var, drawable, i16, null, mode);
                        org.telegram.ui.ActionBar.u6.x(m8Var, drawable2, org.telegram.ui.ActionBar.n6.f29526k7, null, mode);
                        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(drawable, drawable2);
                        if (z10) {
                            i13 = 2131743833;
                        } else {
                            i13 = 2131754469;
                        }
                        m8Var.p(org.telegram.messenger.gd.M0(i13, null), mqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                org.telegram.ui.ActionBar.u6.Z(z8Var, context, 2131231230, org.telegram.ui.ActionBar.n6.f29360b7);
                if (i7 == pr0Var.f50979l0) {
                    z8Var.setText(org.telegram.messenger.gd.M0(2131754470, null));
                    return;
                } else if (i7 == pr0Var.f50995x0) {
                    z8Var.setFixedSize(12);
                    z8Var.setText(null);
                    return;
                } else {
                    int i17 = pr0Var.f50980n - pr0Var.E;
                    if (i17 <= 0) {
                        if (z10) {
                            i12 = 2131743873;
                        } else {
                            i12 = 2131754467;
                        }
                        z8Var.setText(org.telegram.messenger.gd.M0(i12, null));
                        return;
                    } else if (z10) {
                        z8Var.setText(org.telegram.messenger.gd.H(',', "TodoNewTaskInfo", i17));
                        return;
                    } else {
                        z8Var.setText(org.telegram.messenger.gd.a0("AddAnOptionInfo", null, 2131754468, org.telegram.messenger.gd.G(i17, "Option", new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setEnabled(!pr0Var.J);
            Switch checkBox = r8Var.getCheckBox();
            if (!pr0Var.J) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i7 == pr0Var.f50991v0) {
                r8Var.f(org.telegram.messenger.gd.M0(2131743858, null), pr0Var.I, true);
                r8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f50993w0) {
                r8Var.f(org.telegram.messenger.gd.M0(2131743857, null), pr0Var.K, false);
                r8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f50988s0) {
                String M0 = org.telegram.messenger.gd.M0(2131746985, null);
                boolean z13 = pr0Var.H;
                if (pr0Var.f50989t0 != -1 || pr0Var.f50990u0 != -1) {
                    z12 = true;
                }
                r8Var.f(M0, z13, z12);
                r8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f50989t0) {
                String M02 = org.telegram.messenger.gd.M0(2131746973, null);
                boolean z14 = pr0Var.L;
                if (pr0Var.f50990u0 != -1) {
                    z12 = true;
                }
                r8Var.f(M02, z14, z12);
                r8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f50990u0) {
                r8Var.f(org.telegram.messenger.gd.M0(2131746971, null), pr0Var.M, false);
                if (i14 != 0) {
                    z11 = false;
                }
                r8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i7 == pr0Var.f50976i0) {
            if (z10) {
                if (pr0Var.A0 != null) {
                    i11 = 2131743839;
                } else {
                    i11 = 2131743819;
                }
            } else {
                i11 = 2131746972;
            }
            n4Var.setText(org.telegram.messenger.gd.M0(i11, null));
        } else if (i7 == pr0Var.f50981n0) {
            if (i14 == 1) {
                n4Var.setText(org.telegram.messenger.gd.M0(2131746252, null));
                return;
            }
            if (z10) {
                i10 = 2131743837;
            } else {
                i10 = 2131754244;
            }
            n4Var.setText(org.telegram.messenger.gd.M0(i10, null));
        } else if (i7 == pr0Var.f50986r0) {
            n4Var.setText(org.telegram.messenger.gd.M0(2131745300, null));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        mr0 mr0Var;
        pr0 pr0Var = this.d;
        boolean z10 = pr0Var.f50969d0;
        if (i7 != 0) {
            Context context = this.f50286c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    mr0 mr0Var2 = new mr0(this, context, z10 ? 1 : 0, new j40(pr0Var, 22));
                                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, mr0Var2, null);
                                    mr0Var2.c(new bi.v(16, this, mr0Var2));
                                    mr0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = mr0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new ld(3, this, mr0Var2));
                                    textView.setOnKeyListener(new uf(mr0Var2, 2));
                                    mr0Var = mr0Var2;
                                } else {
                                    lr0 lr0Var = new lr0(this, context, z10 ? 1 : 0);
                                    lr0Var.d();
                                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, lr0Var, null);
                                    lr0Var.c(new bi.v(15, this, lr0Var));
                                    mr0Var = lr0Var;
                                }
                            } else {
                                View r8Var = new org.telegram.ui.Cells.r8(context);
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, r8Var, null);
                                mr0Var = r8Var;
                            }
                        } else {
                            kr0 kr0Var = new kr0(this, context, z10 ? 1 : 0);
                            kr0Var.d();
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, kr0Var, null);
                            kr0Var.c(new bi.v(14, this, kr0Var));
                            mr0Var = kr0Var;
                        }
                    } else {
                        View m8Var = new org.telegram.ui.Cells.m8(context);
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, m8Var, null);
                        mr0Var = m8Var;
                    }
                } else {
                    mr0Var = new org.telegram.ui.Cells.z8(context);
                }
            } else {
                mr0Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
            }
        } else {
            View n4Var = new org.telegram.ui.Cells.n4(this.f50286c, org.telegram.ui.ActionBar.n6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, n4Var, null);
            mr0Var = n4Var;
        }
        return i5.c.q(mr0Var, mr0Var, -1, -2);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        pr0 pr0Var = this.d;
        boolean z11 = pr0Var.f50971e0;
        int i12 = f1Var.f59126f;
        View view = f1Var.f59122a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i12 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            bi.u uVar = a6Var.d;
            CharSequence charSequence2 = pr0Var.F;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i11 = 2131743818;
            } else {
                i11 = 2131746253;
            }
            a6Var.o(charSequence, org.telegram.messenger.gd.M0(i11, null), false);
            a6Var.setTag(null);
            a6Var.setEnabled(!pr0Var.J);
            uVar.setEnabled(true ^ pr0Var.J);
            int i13 = org.telegram.ui.ActionBar.n6.G6;
            if (!pr0Var.J) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.u6.V(uVar, org.telegram.ui.ActionBar.u6.K(f10, i13), pr0Var.getResourceProvider());
            pr0.h0(pr0Var, view, f1Var.b());
        } else if (i12 == 5) {
            int b10 = f1Var.b();
            org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
            a6Var2.setTag(1);
            bi.u uVar2 = a6Var2.d;
            int i14 = b10 - pr0Var.f50982o0;
            if (pr0Var.J && i14 < pr0Var.f50996y) {
                z10 = false;
            } else {
                z10 = true;
            }
            uVar2.setEnabled(z10);
            int i15 = org.telegram.ui.ActionBar.n6.G6;
            if (z10) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.u6.V(uVar2, org.telegram.ui.ActionBar.u6.K(f10, i15), pr0Var.getResourceProvider());
            CharSequence charSequence3 = pr0Var.f50992w[i14];
            if (z11) {
                i7 = 2131743820;
            } else {
                i7 = 2131747581;
            }
            a6Var2.o(charSequence3, org.telegram.messenger.gd.M0(i7, null), true);
            a6Var2.setTag(null);
            ImageView imageView = a6Var2.f30387f;
            if (imageView != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
            }
            ImageView imageView2 = a6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f11 = 0.45f;
                }
                imageView2.setAlpha(f11);
            }
            if (!pr0Var.f50974g0 && pr0Var.f50975h0 == b10) {
                EditTextBoldCursor textView = a6Var2.getTextView();
                textView.requestFocus();
                org.telegram.messenger.g0.I3(textView);
                pr0Var.f50974g0 = false;
                pr0Var.f50975h0 = -1;
            }
            pr0.h0(pr0Var, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
            a6Var3.setTag(1);
            CharSequence charSequence4 = pr0Var.G;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            a6Var3.o(charSequence, org.telegram.messenger.gd.M0(2131754472, null), false);
            a6Var3.setTag(null);
            pr0.h0(pr0Var, view, f1Var.b());
        }
    }

    @Override
    public final void z(v4.f1 f1Var) {
        int i7 = f1Var.f59126f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) f1Var.f59122a).getTextView();
            if (textView.isFocused()) {
                pr0 pr0Var = this.d;
                if (pr0Var.f50969d0) {
                    org.telegram.ui.Components.yw0 yw0Var = pr0Var.R;
                    if (yw0Var != null) {
                        yw0Var.f();
                    }
                    pr0Var.p0(true);
                }
                pr0Var.f50968c0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}

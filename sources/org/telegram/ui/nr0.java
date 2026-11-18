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
    public final Context f50270c;
    public final pr0 d;

    public nr0(pr0 pr0Var, Context context) {
        this.d = pr0Var;
        this.f50270c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7;
        int b10 = f1Var.b();
        pr0 pr0Var = this.d;
        if (b10 != pr0Var.f50898j0 && b10 != pr0Var.f50912v0 && b10 != pr0Var.f50914w0) {
            if (pr0Var.J && b10 >= (i7 = pr0Var.f50903o0) && b10 < pr0Var.E + i7) {
                if (b10 - i7 < pr0Var.f50917y) {
                    return false;
                }
            } else if (b10 != pr0Var.f50904p0 && b10 != pr0Var.f50909s0 && b10 != pr0Var.f50910t0 && (pr0Var.O != 0 || b10 != pr0Var.f50911u0)) {
                return false;
            }
            return true;
        }
        return !pr0Var.J;
    }

    @Override
    public final int b() {
        return this.d.f50918y0;
    }

    @Override
    public final int d(int i7) {
        pr0 pr0Var = this.d;
        if (i7 != pr0Var.f50897i0 && i7 != pr0Var.f50902n0 && i7 != pr0Var.f50907r0) {
            if (i7 == pr0Var.m0) {
                return 1;
            }
            if (i7 != pr0Var.f50905q0 && i7 != pr0Var.f50916x0 && i7 != pr0Var.f50900l0) {
                if (i7 == pr0Var.f50904p0) {
                    return 3;
                }
                if (i7 == pr0Var.f50898j0) {
                    return 4;
                }
                if (i7 == pr0Var.f50899k0) {
                    return 7;
                }
                if (i7 != pr0Var.f50909s0 && i7 != pr0Var.f50910t0 && i7 != pr0Var.f50911u0 && i7 != pr0Var.f50912v0 && i7 != pr0Var.f50914w0) {
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
        boolean z10 = pr0Var.f50892e0;
        int i15 = f1Var.f59127f;
        View view = f1Var.f59123a;
        boolean z11 = true;
        if (i15 != 0) {
            boolean z12 = false;
            if (i15 != 6) {
                Context context = this.f50270c;
                if (i15 != 2) {
                    if (i15 == 3) {
                        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                        n8Var.g(-1, org.telegram.ui.ActionBar.n6.f29634q6);
                        Drawable drawable = context.getResources().getDrawable(2131232561);
                        Drawable drawable2 = context.getResources().getDrawable(2131232562);
                        int i16 = org.telegram.ui.ActionBar.n6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.u6.x(n8Var, drawable, i16, null, mode);
                        org.telegram.ui.ActionBar.u6.x(n8Var, drawable2, org.telegram.ui.ActionBar.n6.f29524k7, null, mode);
                        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(drawable, drawable2);
                        if (z10) {
                            i13 = 2131743833;
                        } else {
                            i13 = 2131754469;
                        }
                        n8Var.p(org.telegram.messenger.gd.M0(i13, null), mqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                org.telegram.ui.ActionBar.u6.Z(a9Var, context, 2131231230, org.telegram.ui.ActionBar.n6.f29358b7);
                if (i7 == pr0Var.f50900l0) {
                    a9Var.setText(org.telegram.messenger.gd.M0(2131754470, null));
                    return;
                } else if (i7 == pr0Var.f50916x0) {
                    a9Var.setFixedSize(12);
                    a9Var.setText(null);
                    return;
                } else {
                    int i17 = pr0Var.f50901n - pr0Var.E;
                    if (i17 <= 0) {
                        if (z10) {
                            i12 = 2131743873;
                        } else {
                            i12 = 2131754467;
                        }
                        a9Var.setText(org.telegram.messenger.gd.M0(i12, null));
                        return;
                    } else if (z10) {
                        a9Var.setText(org.telegram.messenger.gd.H(',', "TodoNewTaskInfo", i17));
                        return;
                    } else {
                        a9Var.setText(org.telegram.messenger.gd.a0("AddAnOptionInfo", null, 2131754468, org.telegram.messenger.gd.G(i17, "Option", new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.setEnabled(!pr0Var.J);
            Switch checkBox = s8Var.getCheckBox();
            if (!pr0Var.J) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i7 == pr0Var.f50912v0) {
                s8Var.f(org.telegram.messenger.gd.M0(2131743858, null), pr0Var.I, true);
                s8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f50914w0) {
                s8Var.f(org.telegram.messenger.gd.M0(2131743857, null), pr0Var.K, false);
                s8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f50909s0) {
                String M0 = org.telegram.messenger.gd.M0(2131746985, null);
                boolean z13 = pr0Var.H;
                if (pr0Var.f50910t0 != -1 || pr0Var.f50911u0 != -1) {
                    z12 = true;
                }
                s8Var.f(M0, z13, z12);
                s8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f50910t0) {
                String M02 = org.telegram.messenger.gd.M0(2131746973, null);
                boolean z14 = pr0Var.L;
                if (pr0Var.f50911u0 != -1) {
                    z12 = true;
                }
                s8Var.f(M02, z14, z12);
                s8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f50911u0) {
                s8Var.f(org.telegram.messenger.gd.M0(2131746971, null), pr0Var.M, false);
                if (i14 != 0) {
                    z11 = false;
                }
                s8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
        if (i7 == pr0Var.f50897i0) {
            if (z10) {
                if (pr0Var.A0 != null) {
                    i11 = 2131743839;
                } else {
                    i11 = 2131743819;
                }
            } else {
                i11 = 2131746972;
            }
            o4Var.setText(org.telegram.messenger.gd.M0(i11, null));
        } else if (i7 == pr0Var.f50902n0) {
            if (i14 == 1) {
                o4Var.setText(org.telegram.messenger.gd.M0(2131746252, null));
                return;
            }
            if (z10) {
                i10 = 2131743837;
            } else {
                i10 = 2131754244;
            }
            o4Var.setText(org.telegram.messenger.gd.M0(i10, null));
        } else if (i7 == pr0Var.f50907r0) {
            o4Var.setText(org.telegram.messenger.gd.M0(2131745300, null));
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        mr0 mr0Var;
        pr0 pr0Var = this.d;
        boolean z10 = pr0Var.f50890d0;
        if (i7 != 0) {
            Context context = this.f50270c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    mr0 mr0Var2 = new mr0(this, context, z10 ? 1 : 0, new j40(pr0Var, 22));
                                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, mr0Var2, null);
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
                                    org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, lr0Var, null);
                                    lr0Var.c(new bi.v(15, this, lr0Var));
                                    mr0Var = lr0Var;
                                }
                            } else {
                                View s8Var = new org.telegram.ui.Cells.s8(context);
                                org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, s8Var, null);
                                mr0Var = s8Var;
                            }
                        } else {
                            kr0 kr0Var = new kr0(this, context, z10 ? 1 : 0);
                            kr0Var.d();
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, kr0Var, null);
                            kr0Var.c(new bi.v(14, this, kr0Var));
                            mr0Var = kr0Var;
                        }
                    } else {
                        View n8Var = new org.telegram.ui.Cells.n8(context);
                        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, n8Var, null);
                        mr0Var = n8Var;
                    }
                } else {
                    mr0Var = new org.telegram.ui.Cells.a9(context);
                }
            } else {
                mr0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
            }
        } else {
            View o4Var = new org.telegram.ui.Cells.o4(this.f50270c, org.telegram.ui.ActionBar.n6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394d6, o4Var, null);
            mr0Var = o4Var;
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
        boolean z11 = pr0Var.f50892e0;
        int i12 = f1Var.f59127f;
        View view = f1Var.f59123a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i12 == 4) {
            org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
            b6Var.setTag(1);
            bi.u uVar = b6Var.d;
            CharSequence charSequence2 = pr0Var.F;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i11 = 2131743818;
            } else {
                i11 = 2131746253;
            }
            b6Var.o(charSequence, org.telegram.messenger.gd.M0(i11, null), false);
            b6Var.setTag(null);
            b6Var.setEnabled(!pr0Var.J);
            uVar.setEnabled(true ^ pr0Var.J);
            int i13 = org.telegram.ui.ActionBar.n6.G6;
            if (!pr0Var.J) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.u6.V(uVar, org.telegram.ui.ActionBar.u6.K(f10, i13), pr0Var.getResourceProvider());
            pr0.h0(pr0Var, view, f1Var.b());
        } else if (i12 == 5) {
            int b10 = f1Var.b();
            org.telegram.ui.Cells.b6 b6Var2 = (org.telegram.ui.Cells.b6) view;
            b6Var2.setTag(1);
            bi.u uVar2 = b6Var2.d;
            int i14 = b10 - pr0Var.f50903o0;
            if (pr0Var.J && i14 < pr0Var.f50917y) {
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
            CharSequence charSequence3 = pr0Var.f50913w[i14];
            if (z11) {
                i7 = 2131743820;
            } else {
                i7 = 2131747581;
            }
            b6Var2.o(charSequence3, org.telegram.messenger.gd.M0(i7, null), true);
            b6Var2.setTag(null);
            ImageView imageView = b6Var2.f30446f;
            if (imageView != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
            }
            ImageView imageView2 = b6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f11 = 0.45f;
                }
                imageView2.setAlpha(f11);
            }
            if (!pr0Var.f50895g0 && pr0Var.f50896h0 == b10) {
                EditTextBoldCursor textView = b6Var2.getTextView();
                textView.requestFocus();
                org.telegram.messenger.g0.I3(textView);
                pr0Var.f50895g0 = false;
                pr0Var.f50896h0 = -1;
            }
            pr0.h0(pr0Var, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.b6 b6Var3 = (org.telegram.ui.Cells.b6) view;
            b6Var3.setTag(1);
            CharSequence charSequence4 = pr0Var.G;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            b6Var3.o(charSequence, org.telegram.messenger.gd.M0(2131754472, null), false);
            b6Var3.setTag(null);
            pr0.h0(pr0Var, view, f1Var.b());
        }
    }

    @Override
    public final void z(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.b6) f1Var.f59123a).getTextView();
            if (textView.isFocused()) {
                pr0 pr0Var = this.d;
                if (pr0Var.f50890d0) {
                    org.telegram.ui.Components.yw0 yw0Var = pr0Var.R;
                    if (yw0Var != null) {
                        yw0Var.f();
                    }
                    pr0Var.p0(true);
                }
                pr0Var.f50889c0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class nr0 extends org.telegram.ui.Components.oj0 {
    public final Context f48127c;
    public final pr0 d;

    public nr0(pr0 pr0Var, Context context) {
        this.d = pr0Var;
        this.f48127c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7;
        int b10 = d1Var.b();
        pr0 pr0Var = this.d;
        if (b10 != pr0Var.f48928i0 && b10 != pr0Var.f48942u0 && b10 != pr0Var.f48943v0) {
            if (pr0Var.I && b10 >= (i7 = pr0Var.f48933n0) && b10 < pr0Var.D + i7) {
                if (b10 - i7 < pr0Var.f48948y) {
                    return false;
                }
            } else if (b10 != pr0Var.f48934o0 && b10 != pr0Var.f48938r0 && b10 != pr0Var.f48940s0 && (pr0Var.N != 0 || b10 != pr0Var.f48941t0)) {
                return false;
            }
            return true;
        }
        return !pr0Var.I;
    }

    @Override
    public final int b() {
        return this.d.f48947x0;
    }

    @Override
    public final int d(int i7) {
        pr0 pr0Var = this.d;
        if (i7 != pr0Var.f48927h0 && i7 != pr0Var.m0 && i7 != pr0Var.f48936q0) {
            if (i7 == pr0Var.f48931l0) {
                return 1;
            }
            if (i7 != pr0Var.f48935p0 && i7 != pr0Var.f48945w0 && i7 != pr0Var.f48930k0) {
                if (i7 == pr0Var.f48934o0) {
                    return 3;
                }
                if (i7 == pr0Var.f48928i0) {
                    return 4;
                }
                if (i7 == pr0Var.f48929j0) {
                    return 7;
                }
                if (i7 != pr0Var.f48938r0 && i7 != pr0Var.f48940s0 && i7 != pr0Var.f48941t0 && i7 != pr0Var.f48942u0 && i7 != pr0Var.f48943v0) {
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
        pr0 pr0Var = this.d;
        int i14 = pr0Var.N;
        boolean z9 = pr0Var.f48921d0;
        int i15 = d1Var.f57047f;
        View view = d1Var.f57043a;
        boolean z10 = true;
        if (i15 != 0) {
            boolean z11 = false;
            if (i15 != 6) {
                Context context = this.f48127c;
                if (i15 != 2) {
                    if (i15 == 3) {
                        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                        m8Var.g(-1, org.telegram.ui.ActionBar.k6.f28092q6);
                        Drawable drawable = context.getResources().getDrawable(2131232559);
                        Drawable drawable2 = context.getResources().getDrawable(2131232560);
                        int i16 = org.telegram.ui.ActionBar.k6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.r6.y(m8Var, drawable, i16, null, mode);
                        org.telegram.ui.ActionBar.r6.y(m8Var, drawable2, org.telegram.ui.ActionBar.k6.f27982k7, null, mode);
                        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
                        if (z9) {
                            i13 = 2131744071;
                        } else {
                            i13 = 2131754471;
                        }
                        m8Var.p(org.telegram.messenger.id.M0(i13, null), xpVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                org.telegram.ui.ActionBar.r6.a0(z8Var, context, 2131231230, org.telegram.ui.ActionBar.k6.f27816b7);
                if (i7 == pr0Var.f48930k0) {
                    z8Var.setText(org.telegram.messenger.id.M0(2131754472, null));
                    return;
                } else if (i7 == pr0Var.f48945w0) {
                    z8Var.setFixedSize(12);
                    z8Var.setText(null);
                    return;
                } else {
                    int i17 = pr0Var.f48932n - pr0Var.D;
                    if (i17 <= 0) {
                        if (z9) {
                            i12 = 2131744111;
                        } else {
                            i12 = 2131754469;
                        }
                        z8Var.setText(org.telegram.messenger.id.M0(i12, null));
                        return;
                    } else if (z9) {
                        z8Var.setText(org.telegram.messenger.id.H(',', "TodoNewTaskInfo", i17));
                        return;
                    } else {
                        z8Var.setText(org.telegram.messenger.id.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.id.G(i17, "Option", new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setEnabled(!pr0Var.I);
            Switch checkBox = r8Var.getCheckBox();
            if (!pr0Var.I) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i7 == pr0Var.f48942u0) {
                r8Var.f(org.telegram.messenger.id.M0(2131744096, null), pr0Var.H, true);
                r8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f48943v0) {
                r8Var.f(org.telegram.messenger.id.M0(2131744095, null), pr0Var.J, false);
                r8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f48938r0) {
                String M0 = org.telegram.messenger.id.M0(2131747179, null);
                boolean z12 = pr0Var.G;
                if (pr0Var.f48940s0 != -1 || pr0Var.f48941t0 != -1) {
                    z11 = true;
                }
                r8Var.f(M0, z12, z11);
                r8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f48940s0) {
                String M02 = org.telegram.messenger.id.M0(2131747167, null);
                boolean z13 = pr0Var.K;
                if (pr0Var.f48941t0 != -1) {
                    z11 = true;
                }
                r8Var.f(M02, z13, z11);
                r8Var.e(null, true);
                return;
            } else if (i7 == pr0Var.f48941t0) {
                r8Var.f(org.telegram.messenger.id.M0(2131747165, null), pr0Var.L, false);
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
        if (i7 == pr0Var.f48927h0) {
            if (z9) {
                if (pr0Var.f48950z0 != null) {
                    i11 = 2131744077;
                } else {
                    i11 = 2131744057;
                }
            } else {
                i11 = 2131747166;
            }
            n4Var.setText(org.telegram.messenger.id.M0(i11, null));
        } else if (i7 == pr0Var.m0) {
            if (i14 == 1) {
                n4Var.setText(org.telegram.messenger.id.M0(2131746448, null));
                return;
            }
            if (z9) {
                i10 = 2131744075;
            } else {
                i10 = 2131754246;
            }
            n4Var.setText(org.telegram.messenger.id.M0(i10, null));
        } else if (i7 == pr0Var.f48936q0) {
            n4Var.setText(org.telegram.messenger.id.M0(2131745498, null));
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        mr0 mr0Var;
        pr0 pr0Var = this.d;
        boolean z9 = pr0Var.f48920c0;
        if (i7 != 0) {
            Context context = this.f48127c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    mr0 mr0Var2 = new mr0(this, context, z9 ? 1 : 0, new g40(pr0Var, 22));
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, mr0Var2, null);
                                    mr0Var2.b(new fi.h7(9, this, mr0Var2));
                                    mr0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = mr0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new nd(3, this, mr0Var2));
                                    textView.setOnKeyListener(new zf(mr0Var2, 2));
                                    mr0Var = mr0Var2;
                                } else {
                                    lr0 lr0Var = new lr0(this, context, z9 ? 1 : 0);
                                    lr0Var.c();
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, lr0Var, null);
                                    lr0Var.b(new fi.h7(8, this, lr0Var));
                                    mr0Var = lr0Var;
                                }
                            } else {
                                View r8Var = new org.telegram.ui.Cells.r8(context);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, r8Var, null);
                                mr0Var = r8Var;
                            }
                        } else {
                            kr0 kr0Var = new kr0(this, context, z9 ? 1 : 0);
                            kr0Var.c();
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, kr0Var, null);
                            kr0Var.b(new fi.h7(7, this, kr0Var));
                            mr0Var = kr0Var;
                        }
                    } else {
                        View m8Var = new org.telegram.ui.Cells.m8(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, m8Var, null);
                        mr0Var = m8Var;
                    }
                } else {
                    mr0Var = new org.telegram.ui.Cells.z8(context);
                }
            } else {
                mr0Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
            }
        } else {
            View n4Var = new org.telegram.ui.Cells.n4(this.f48127c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, n4Var, null);
            mr0Var = n4Var;
        }
        return jg.g.r(mr0Var, mr0Var, -1, -2);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        boolean z9;
        int i7;
        int i10;
        int i11;
        pr0 pr0Var = this.d;
        boolean z10 = pr0Var.f48921d0;
        int i12 = d1Var.f57047f;
        View view = d1Var.f57043a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i12 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            org.telegram.ui.Cells.z5 z5Var = a6Var.d;
            CharSequence charSequence2 = pr0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i11 = 2131744056;
            } else {
                i11 = 2131746449;
            }
            a6Var.n(charSequence, org.telegram.messenger.id.M0(i11, null), false);
            a6Var.setTag(null);
            a6Var.setEnabled(!pr0Var.I);
            z5Var.setEnabled(true ^ pr0Var.I);
            int i13 = org.telegram.ui.ActionBar.k6.G6;
            if (!pr0Var.I) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.r6.W(z5Var, org.telegram.ui.ActionBar.r6.L(f10, i13), pr0Var.getResourceProvider());
            pr0.h0(pr0Var, view, d1Var.b());
        } else if (i12 == 5) {
            int b10 = d1Var.b();
            org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
            a6Var2.setTag(1);
            org.telegram.ui.Cells.z5 z5Var2 = a6Var2.d;
            int i14 = b10 - pr0Var.f48933n0;
            if (pr0Var.I && i14 < pr0Var.f48948y) {
                z9 = false;
            } else {
                z9 = true;
            }
            z5Var2.setEnabled(z9);
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            if (z9) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.r6.W(z5Var2, org.telegram.ui.ActionBar.r6.L(f10, i15), pr0Var.getResourceProvider());
            CharSequence charSequence3 = pr0Var.f48944w[i14];
            if (z10) {
                i7 = 2131744058;
            } else {
                i7 = 2131747775;
            }
            a6Var2.n(charSequence3, org.telegram.messenger.id.M0(i7, null), true);
            a6Var2.setTag(null);
            ImageView imageView = a6Var2.f28892f;
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
            if (!pr0Var.f48925f0 && pr0Var.f48926g0 == b10) {
                EditTextBoldCursor textView = a6Var2.getTextView();
                textView.requestFocus();
                org.telegram.messenger.g0.K3(textView);
                pr0Var.f48925f0 = false;
                pr0Var.f48926g0 = -1;
            }
            pr0.h0(pr0Var, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
            a6Var3.setTag(1);
            CharSequence charSequence4 = pr0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            a6Var3.n(charSequence, org.telegram.messenger.id.M0(2131754474, null), false);
            a6Var3.setTag(null);
            pr0.h0(pr0Var, view, d1Var.b());
        }
    }

    @Override
    public final void z(v4.d1 d1Var) {
        int i7 = d1Var.f57047f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) d1Var.f57043a).getTextView();
            if (textView.isFocused()) {
                pr0 pr0Var = this.d;
                if (pr0Var.f48920c0) {
                    org.telegram.ui.Components.ow0 ow0Var = pr0Var.Q;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    pr0Var.p0(true);
                }
                pr0Var.f48918b0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}

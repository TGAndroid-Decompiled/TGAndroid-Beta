package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class lr0 extends org.telegram.ui.Components.tj0 {
    public final Context f49028c;
    public final nr0 d;

    public lr0(nr0 nr0Var, Context context) {
        this.d = nr0Var;
        this.f49028c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7;
        int b10 = e1Var.b();
        nr0 nr0Var = this.d;
        if (b10 != nr0Var.f49618j0 && b10 != nr0Var.f49632v0 && b10 != nr0Var.f49634w0) {
            if (nr0Var.J && b10 >= (i7 = nr0Var.f49623o0) && b10 < nr0Var.E + i7) {
                if (b10 - i7 < nr0Var.f49637y) {
                    return false;
                }
            } else if (b10 != nr0Var.f49624p0 && b10 != nr0Var.f49629s0 && b10 != nr0Var.f49630t0 && (nr0Var.O != 0 || b10 != nr0Var.f49631u0)) {
                return false;
            }
            return true;
        }
        return !nr0Var.J;
    }

    @Override
    public final int b() {
        return this.d.f49638y0;
    }

    @Override
    public final int d(int i7) {
        nr0 nr0Var = this.d;
        if (i7 != nr0Var.f49617i0 && i7 != nr0Var.f49622n0 && i7 != nr0Var.f49627r0) {
            if (i7 == nr0Var.m0) {
                return 1;
            }
            if (i7 != nr0Var.f49625q0 && i7 != nr0Var.f49636x0 && i7 != nr0Var.f49620l0) {
                if (i7 == nr0Var.f49624p0) {
                    return 3;
                }
                if (i7 == nr0Var.f49618j0) {
                    return 4;
                }
                if (i7 == nr0Var.f49619k0) {
                    return 7;
                }
                if (i7 != nr0Var.f49629s0 && i7 != nr0Var.f49630t0 && i7 != nr0Var.f49631u0 && i7 != nr0Var.f49632v0 && i7 != nr0Var.f49634w0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        nr0 nr0Var = this.d;
        int i14 = nr0Var.O;
        boolean z10 = nr0Var.f49612e0;
        int i15 = e1Var.f58539f;
        View view = e1Var.f58535a;
        boolean z11 = true;
        if (i15 != 0) {
            boolean z12 = false;
            if (i15 != 6) {
                Context context = this.f49028c;
                if (i15 != 2) {
                    if (i15 == 3) {
                        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                        l8Var.g(-1, org.telegram.ui.ActionBar.j6.f29089q6);
                        Drawable drawable = context.getResources().getDrawable(2131232560);
                        Drawable drawable2 = context.getResources().getDrawable(2131232561);
                        int i16 = org.telegram.ui.ActionBar.j6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.q6.x(l8Var, drawable, i16, null, mode);
                        org.telegram.ui.ActionBar.q6.x(l8Var, drawable2, org.telegram.ui.ActionBar.j6.f28979k7, null, mode);
                        org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(drawable, drawable2);
                        if (z10) {
                            i13 = 2131744068;
                        } else {
                            i13 = 2131754471;
                        }
                        l8Var.p(org.telegram.messenger.hd.M0(i13, null), fqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                org.telegram.ui.ActionBar.q6.Z(y8Var, context, 2131231230, org.telegram.ui.ActionBar.j6.f28813b7);
                if (i7 == nr0Var.f49620l0) {
                    y8Var.setText(org.telegram.messenger.hd.M0(2131754472, null));
                    return;
                } else if (i7 == nr0Var.f49636x0) {
                    y8Var.setFixedSize(12);
                    y8Var.setText(null);
                    return;
                } else {
                    int i17 = nr0Var.f49621n - nr0Var.E;
                    if (i17 <= 0) {
                        if (z10) {
                            i12 = 2131744108;
                        } else {
                            i12 = 2131754469;
                        }
                        y8Var.setText(org.telegram.messenger.hd.M0(i12, null));
                        return;
                    } else if (z10) {
                        y8Var.setText(org.telegram.messenger.hd.H(',', "TodoNewTaskInfo", i17));
                        return;
                    } else {
                        y8Var.setText(org.telegram.messenger.hd.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.hd.G(i17, "Option", new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.setEnabled(!nr0Var.J);
            Switch checkBox = q8Var.getCheckBox();
            if (!nr0Var.J) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i7 == nr0Var.f49632v0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131744093, null), nr0Var.I, true);
                q8Var.e(null, true);
                return;
            } else if (i7 == nr0Var.f49634w0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131744092, null), nr0Var.K, false);
                q8Var.e(null, true);
                return;
            } else if (i7 == nr0Var.f49629s0) {
                String M0 = org.telegram.messenger.hd.M0(2131747178, null);
                boolean z13 = nr0Var.H;
                if (nr0Var.f49630t0 != -1 || nr0Var.f49631u0 != -1) {
                    z12 = true;
                }
                q8Var.f(M0, z13, z12);
                q8Var.e(null, true);
                return;
            } else if (i7 == nr0Var.f49630t0) {
                String M02 = org.telegram.messenger.hd.M0(2131747166, null);
                boolean z14 = nr0Var.L;
                if (nr0Var.f49631u0 != -1) {
                    z12 = true;
                }
                q8Var.f(M02, z14, z12);
                q8Var.e(null, true);
                return;
            } else if (i7 == nr0Var.f49631u0) {
                q8Var.f(org.telegram.messenger.hd.M0(2131747164, null), nr0Var.M, false);
                if (i14 != 0) {
                    z11 = false;
                }
                q8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        if (i7 == nr0Var.f49617i0) {
            if (z10) {
                if (nr0Var.A0 != null) {
                    i11 = 2131744074;
                } else {
                    i11 = 2131744054;
                }
            } else {
                i11 = 2131747165;
            }
            n4Var.setText(org.telegram.messenger.hd.M0(i11, null));
        } else if (i7 == nr0Var.f49622n0) {
            if (i14 == 1) {
                n4Var.setText(org.telegram.messenger.hd.M0(2131746447, null));
                return;
            }
            if (z10) {
                i10 = 2131744072;
            } else {
                i10 = 2131754246;
            }
            n4Var.setText(org.telegram.messenger.hd.M0(i10, null));
        } else if (i7 == nr0Var.f49627r0) {
            n4Var.setText(org.telegram.messenger.hd.M0(2131745495, null));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        kr0 kr0Var;
        nr0 nr0Var = this.d;
        boolean z10 = nr0Var.f49610d0;
        if (i7 != 0) {
            Context context = this.f49028c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    kr0 kr0Var2 = new kr0(this, context, z10 ? 1 : 0, new g40(nr0Var, 22));
                                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, kr0Var2, null);
                                    kr0Var2.c(new bi.v(16, this, kr0Var2));
                                    kr0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = kr0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new ld(3, this, kr0Var2));
                                    textView.setOnKeyListener(new sf(kr0Var2, 2));
                                    kr0Var = kr0Var2;
                                } else {
                                    jr0 jr0Var = new jr0(this, context, z10 ? 1 : 0);
                                    jr0Var.d();
                                    org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, jr0Var, null);
                                    jr0Var.c(new bi.v(15, this, jr0Var));
                                    kr0Var = jr0Var;
                                }
                            } else {
                                View q8Var = new org.telegram.ui.Cells.q8(context);
                                org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, q8Var, null);
                                kr0Var = q8Var;
                            }
                        } else {
                            ir0 ir0Var = new ir0(this, context, z10 ? 1 : 0);
                            ir0Var.d();
                            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, ir0Var, null);
                            ir0Var.c(new bi.v(14, this, ir0Var));
                            kr0Var = ir0Var;
                        }
                    } else {
                        View l8Var = new org.telegram.ui.Cells.l8(context);
                        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, l8Var, null);
                        kr0Var = l8Var;
                    }
                } else {
                    kr0Var = new org.telegram.ui.Cells.y8(context);
                }
            } else {
                kr0Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
            }
        } else {
            View n4Var = new org.telegram.ui.Cells.n4(this.f49028c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28849d6, n4Var, null);
            kr0Var = n4Var;
        }
        return i5.c.q(kr0Var, kr0Var, -1, -2);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        nr0 nr0Var = this.d;
        boolean z11 = nr0Var.f49612e0;
        int i12 = e1Var.f58539f;
        View view = e1Var.f58535a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i12 == 4) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            z5Var.setTag(1);
            bi.u uVar = z5Var.d;
            CharSequence charSequence2 = nr0Var.F;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i11 = 2131744053;
            } else {
                i11 = 2131746448;
            }
            z5Var.o(charSequence, org.telegram.messenger.hd.M0(i11, null), false);
            z5Var.setTag(null);
            z5Var.setEnabled(!nr0Var.J);
            uVar.setEnabled(true ^ nr0Var.J);
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            if (!nr0Var.J) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.q6.V(uVar, org.telegram.ui.ActionBar.q6.K(f10, i13), nr0Var.getResourceProvider());
            nr0.h0(nr0Var, view, e1Var.b());
        } else if (i12 == 5) {
            int b10 = e1Var.b();
            org.telegram.ui.Cells.z5 z5Var2 = (org.telegram.ui.Cells.z5) view;
            z5Var2.setTag(1);
            bi.u uVar2 = z5Var2.d;
            int i14 = b10 - nr0Var.f49623o0;
            if (nr0Var.J && i14 < nr0Var.f49637y) {
                z10 = false;
            } else {
                z10 = true;
            }
            uVar2.setEnabled(z10);
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            if (z10) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.q6.V(uVar2, org.telegram.ui.ActionBar.q6.K(f10, i15), nr0Var.getResourceProvider());
            CharSequence charSequence3 = nr0Var.f49633w[i14];
            if (z11) {
                i7 = 2131744055;
            } else {
                i7 = 2131747774;
            }
            z5Var2.o(charSequence3, org.telegram.messenger.hd.M0(i7, null), true);
            z5Var2.setTag(null);
            ImageView imageView = z5Var2.f32119f;
            if (imageView != null) {
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                imageView.setVisibility(i10);
            }
            ImageView imageView2 = z5Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f11 = 0.45f;
                }
                imageView2.setAlpha(f11);
            }
            if (!nr0Var.f49615g0 && nr0Var.f49616h0 == b10) {
                EditTextBoldCursor textView = z5Var2.getTextView();
                textView.requestFocus();
                org.telegram.messenger.g0.J3(textView);
                nr0Var.f49615g0 = false;
                nr0Var.f49616h0 = -1;
            }
            nr0.h0(nr0Var, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.z5 z5Var3 = (org.telegram.ui.Cells.z5) view;
            z5Var3.setTag(1);
            CharSequence charSequence4 = nr0Var.G;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            z5Var3.o(charSequence, org.telegram.messenger.hd.M0(2131754474, null), false);
            z5Var3.setTag(null);
            nr0.h0(nr0Var, view, e1Var.b());
        }
    }

    @Override
    public final void z(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.z5) e1Var.f58535a).getTextView();
            if (textView.isFocused()) {
                nr0 nr0Var = this.d;
                if (nr0Var.f49610d0) {
                    org.telegram.ui.Components.rw0 rw0Var = nr0Var.R;
                    if (rw0Var != null) {
                        rw0Var.f();
                    }
                    nr0Var.p0(true);
                }
                nr0Var.f49609c0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class dr0 extends org.telegram.ui.Components.sj0 {
    public final Context f44804c;
    public final fr0 d;

    public dr0(fr0 fr0Var, Context context) {
        this.d = fr0Var;
        this.f44804c = context;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        int i3;
        int b10 = d1Var.b();
        fr0 fr0Var = this.d;
        if (b10 != fr0Var.f45341j0 && b10 != fr0Var.f45355v0 && b10 != fr0Var.f45357w0) {
            if (fr0Var.J && b10 >= (i3 = fr0Var.f45346o0) && b10 < fr0Var.E + i3) {
                if (b10 - i3 < fr0Var.f45360y) {
                    return false;
                }
            } else if (b10 != fr0Var.f45347p0 && b10 != fr0Var.f45352s0 && b10 != fr0Var.f45353t0 && (fr0Var.O != 0 || b10 != fr0Var.f45354u0)) {
                return false;
            }
            return true;
        }
        return !fr0Var.J;
    }

    @Override
    public final int b() {
        return this.d.f45361y0;
    }

    @Override
    public final int d(int i3) {
        fr0 fr0Var = this.d;
        if (i3 != fr0Var.f45340i0 && i3 != fr0Var.f45345n0 && i3 != fr0Var.f45350r0) {
            if (i3 == fr0Var.m0) {
                return 1;
            }
            if (i3 != fr0Var.f45348q0 && i3 != fr0Var.f45359x0 && i3 != fr0Var.f45343l0) {
                if (i3 == fr0Var.f45347p0) {
                    return 3;
                }
                if (i3 == fr0Var.f45341j0) {
                    return 4;
                }
                if (i3 == fr0Var.f45342k0) {
                    return 7;
                }
                if (i3 != fr0Var.f45352s0 && i3 != fr0Var.f45353t0 && i3 != fr0Var.f45354u0 && i3 != fr0Var.f45355v0 && i3 != fr0Var.f45357w0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        int i11;
        float f10;
        int i12;
        int i13;
        fr0 fr0Var = this.d;
        int i14 = fr0Var.O;
        boolean z10 = fr0Var.f45335e0;
        int i15 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z11 = true;
        if (i15 != 0) {
            boolean z12 = false;
            if (i15 != 6) {
                Context context = this.f44804c;
                if (i15 != 2) {
                    if (i15 == 3) {
                        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                        l8Var.g(-1, org.telegram.ui.ActionBar.k6.f28121q6);
                        Drawable drawable = context.getResources().getDrawable(2131232557);
                        Drawable drawable2 = context.getResources().getDrawable(2131232558);
                        int i16 = org.telegram.ui.ActionBar.k6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.r6.y(l8Var, drawable, i16, null, mode);
                        org.telegram.ui.ActionBar.r6.y(l8Var, drawable2, org.telegram.ui.ActionBar.k6.f28008k7, null, mode);
                        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(drawable, drawable2);
                        if (z10) {
                            i13 = 2131744078;
                        } else {
                            i13 = 2131754471;
                        }
                        l8Var.p(org.telegram.messenger.bd.M0(i13, null), xpVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                org.telegram.ui.ActionBar.r6.a0(y8Var, context, 2131231230, org.telegram.ui.ActionBar.k6.f27843b7);
                if (i3 == fr0Var.f45343l0) {
                    y8Var.setText(org.telegram.messenger.bd.M0(2131754472, null));
                    return;
                } else if (i3 == fr0Var.f45359x0) {
                    y8Var.setFixedSize(12);
                    y8Var.setText(null);
                    return;
                } else {
                    int i17 = fr0Var.f45344n - fr0Var.E;
                    if (i17 <= 0) {
                        if (z10) {
                            i12 = 2131744118;
                        } else {
                            i12 = 2131754469;
                        }
                        y8Var.setText(org.telegram.messenger.bd.M0(i12, null));
                        return;
                    } else if (z10) {
                        y8Var.setText(org.telegram.messenger.bd.H(',', "TodoNewTaskInfo", i17));
                        return;
                    } else {
                        y8Var.setText(org.telegram.messenger.bd.a0("AddAnOptionInfo", null, 2131754470, org.telegram.messenger.bd.G(i17, "Option", new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            q8Var.setEnabled(!fr0Var.J);
            Switch checkBox = q8Var.getCheckBox();
            if (!fr0Var.J) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i3 == fr0Var.f45355v0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131744103, null), fr0Var.I, true);
                q8Var.e(null, true);
                return;
            } else if (i3 == fr0Var.f45357w0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131744102, null), fr0Var.K, false);
                q8Var.e(null, true);
                return;
            } else if (i3 == fr0Var.f45352s0) {
                String M0 = org.telegram.messenger.bd.M0(2131747186, null);
                boolean z13 = fr0Var.H;
                if (fr0Var.f45353t0 != -1 || fr0Var.f45354u0 != -1) {
                    z12 = true;
                }
                q8Var.f(M0, z13, z12);
                q8Var.e(null, true);
                return;
            } else if (i3 == fr0Var.f45353t0) {
                String M02 = org.telegram.messenger.bd.M0(2131747174, null);
                boolean z14 = fr0Var.L;
                if (fr0Var.f45354u0 != -1) {
                    z12 = true;
                }
                q8Var.f(M02, z14, z12);
                q8Var.e(null, true);
                return;
            } else if (i3 == fr0Var.f45354u0) {
                q8Var.f(org.telegram.messenger.bd.M0(2131747172, null), fr0Var.M, false);
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
        if (i3 == fr0Var.f45340i0) {
            if (z10) {
                if (fr0Var.A0 != null) {
                    i11 = 2131744084;
                } else {
                    i11 = 2131744064;
                }
            } else {
                i11 = 2131747173;
            }
            n4Var.setText(org.telegram.messenger.bd.M0(i11, null));
        } else if (i3 == fr0Var.f45345n0) {
            if (i14 == 1) {
                n4Var.setText(org.telegram.messenger.bd.M0(2131746455, null));
                return;
            }
            if (z10) {
                i10 = 2131744082;
            } else {
                i10 = 2131754246;
            }
            n4Var.setText(org.telegram.messenger.bd.M0(i10, null));
        } else if (i3 == fr0Var.f45350r0) {
            n4Var.setText(org.telegram.messenger.bd.M0(2131745505, null));
        }
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        cr0 cr0Var;
        fr0 fr0Var = this.d;
        boolean z10 = fr0Var.f45333d0;
        if (i3 != 0) {
            Context context = this.f44804c;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 != 4) {
                            if (i3 != 6) {
                                if (i3 != 7) {
                                    cr0 cr0Var2 = new cr0(this, context, z10 ? 1 : 0, new b40(fr0Var, 22));
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, cr0Var2, null);
                                    cr0Var2.b(new ai.a0(16, this, cr0Var2));
                                    cr0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = cr0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new ld(3, this, cr0Var2));
                                    textView.setOnKeyListener(new vf(cr0Var2, 2));
                                    cr0Var = cr0Var2;
                                } else {
                                    br0 br0Var = new br0(this, context, z10 ? 1 : 0);
                                    br0Var.c();
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, br0Var, null);
                                    br0Var.b(new ai.a0(15, this, br0Var));
                                    cr0Var = br0Var;
                                }
                            } else {
                                View q8Var = new org.telegram.ui.Cells.q8(context);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, q8Var, null);
                                cr0Var = q8Var;
                            }
                        } else {
                            ar0 ar0Var = new ar0(this, context, z10 ? 1 : 0);
                            ar0Var.c();
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, ar0Var, null);
                            ar0Var.b(new ai.a0(14, this, ar0Var));
                            cr0Var = ar0Var;
                        }
                    } else {
                        View l8Var = new org.telegram.ui.Cells.l8(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, l8Var, null);
                        cr0Var = l8Var;
                    }
                } else {
                    cr0Var = new org.telegram.ui.Cells.y8(context);
                }
            } else {
                cr0Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.f1) null);
            }
        } else {
            View n4Var = new org.telegram.ui.Cells.n4(this.f44804c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, n4Var, null);
            cr0Var = n4Var;
        }
        return k2.p1.p(cr0Var, cr0Var, -1, -2);
    }

    @Override
    public final void y(u4.d1 d1Var) {
        boolean z10;
        int i3;
        int i10;
        int i11;
        fr0 fr0Var = this.d;
        boolean z11 = fr0Var.f45335e0;
        int i12 = d1Var.f55544f;
        View view = d1Var.f55540a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i12 == 4) {
            org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
            z5Var.setTag(1);
            ai.z zVar = z5Var.d;
            CharSequence charSequence2 = fr0Var.F;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i11 = 2131744063;
            } else {
                i11 = 2131746456;
            }
            z5Var.n(charSequence, org.telegram.messenger.bd.M0(i11, null), false);
            z5Var.setTag(null);
            z5Var.setEnabled(!fr0Var.J);
            zVar.setEnabled(true ^ fr0Var.J);
            int i13 = org.telegram.ui.ActionBar.k6.G6;
            if (!fr0Var.J) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.r6.W(zVar, org.telegram.ui.ActionBar.r6.L(f10, i13), fr0Var.getResourceProvider());
            fr0.h0(fr0Var, view, d1Var.b());
        } else if (i12 == 5) {
            int b10 = d1Var.b();
            org.telegram.ui.Cells.z5 z5Var2 = (org.telegram.ui.Cells.z5) view;
            z5Var2.setTag(1);
            ai.z zVar2 = z5Var2.d;
            int i14 = b10 - fr0Var.f45346o0;
            if (fr0Var.J && i14 < fr0Var.f45360y) {
                z10 = false;
            } else {
                z10 = true;
            }
            zVar2.setEnabled(z10);
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            if (z10) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.r6.W(zVar2, org.telegram.ui.ActionBar.r6.L(f10, i15), fr0Var.getResourceProvider());
            CharSequence charSequence3 = fr0Var.f45356w[i14];
            if (z11) {
                i3 = 2131744065;
            } else {
                i3 = 2131747782;
            }
            z5Var2.n(charSequence3, org.telegram.messenger.bd.M0(i3, null), true);
            z5Var2.setTag(null);
            ImageView imageView = z5Var2.f31049f;
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
            if (!fr0Var.f45338g0 && fr0Var.f45339h0 == b10) {
                EditTextBoldCursor textView = z5Var2.getTextView();
                textView.requestFocus();
                org.telegram.messenger.g0.K3(textView);
                fr0Var.f45338g0 = false;
                fr0Var.f45339h0 = -1;
            }
            fr0.h0(fr0Var, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.z5 z5Var3 = (org.telegram.ui.Cells.z5) view;
            z5Var3.setTag(1);
            CharSequence charSequence4 = fr0Var.G;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            z5Var3.n(charSequence, org.telegram.messenger.bd.M0(2131754474, null), false);
            z5Var3.setTag(null);
            fr0.h0(fr0Var, view, d1Var.b());
        }
    }

    @Override
    public final void z(u4.d1 d1Var) {
        int i3 = d1Var.f55544f;
        if (i3 == 4 || i3 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.z5) d1Var.f55540a).getTextView();
            if (textView.isFocused()) {
                fr0 fr0Var = this.d;
                if (fr0Var.f45333d0) {
                    org.telegram.ui.Components.ow0 ow0Var = fr0Var.R;
                    if (ow0Var != null) {
                        ow0Var.f();
                    }
                    fr0Var.p0(true);
                }
                fr0Var.f45332c0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}

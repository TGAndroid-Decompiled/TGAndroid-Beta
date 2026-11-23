package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class or0 extends org.telegram.ui.Components.dk0 {
    public final Context f50626c;
    public final qr0 d;

    public or0(qr0 qr0Var, Context context) {
        this.d = qr0Var;
        this.f50626c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7;
        int b10 = e1Var.b();
        qr0 qr0Var = this.d;
        if (b10 != qr0Var.f51295j0 && b10 != qr0Var.f51309v0 && b10 != qr0Var.f51311w0) {
            if (qr0Var.J && b10 >= (i7 = qr0Var.f51300o0) && b10 < qr0Var.E + i7) {
                if (b10 - i7 < qr0Var.f51314y) {
                    return false;
                }
            } else if (b10 != qr0Var.f51301p0 && b10 != qr0Var.f51306s0 && b10 != qr0Var.f51307t0 && (qr0Var.O != 0 || b10 != qr0Var.f51308u0)) {
                return false;
            }
            return true;
        }
        return !qr0Var.J;
    }

    @Override
    public final int b() {
        return this.d.f51315y0;
    }

    @Override
    public final int d(int i7) {
        qr0 qr0Var = this.d;
        if (i7 != qr0Var.f51294i0 && i7 != qr0Var.f51299n0 && i7 != qr0Var.f51304r0) {
            if (i7 == qr0Var.m0) {
                return 1;
            }
            if (i7 != qr0Var.f51302q0 && i7 != qr0Var.f51313x0 && i7 != qr0Var.f51297l0) {
                if (i7 == qr0Var.f51301p0) {
                    return 3;
                }
                if (i7 == qr0Var.f51295j0) {
                    return 4;
                }
                if (i7 == qr0Var.f51296k0) {
                    return 7;
                }
                if (i7 != qr0Var.f51306s0 && i7 != qr0Var.f51307t0 && i7 != qr0Var.f51308u0 && i7 != qr0Var.f51309v0 && i7 != qr0Var.f51311w0) {
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
        qr0 qr0Var = this.d;
        int i14 = qr0Var.O;
        boolean z10 = qr0Var.f51289e0;
        int i15 = e1Var.f59115f;
        View view = e1Var.f59111a;
        boolean z11 = true;
        if (i15 != 0) {
            boolean z12 = false;
            if (i15 != 6) {
                Context context = this.f50626c;
                if (i15 != 2) {
                    if (i15 == 3) {
                        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                        n8Var.g(-1, org.telegram.ui.ActionBar.m6.f29587q6);
                        Drawable drawable = context.getResources().getDrawable(2131232561);
                        Drawable drawable2 = context.getResources().getDrawable(2131232562);
                        int i16 = org.telegram.ui.ActionBar.m6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.t6.x(n8Var, drawable, i16, null, mode);
                        org.telegram.ui.ActionBar.t6.x(n8Var, drawable2, org.telegram.ui.ActionBar.m6.f29477k7, null, mode);
                        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(drawable, drawable2);
                        if (z10) {
                            i13 = 2131743827;
                        } else {
                            i13 = 2131754468;
                        }
                        n8Var.p(org.telegram.messenger.hd.N0(i13, null), oqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                org.telegram.ui.ActionBar.t6.Z(a9Var, context, 2131231230, org.telegram.ui.ActionBar.m6.f29311b7);
                if (i7 == qr0Var.f51297l0) {
                    a9Var.setText(org.telegram.messenger.hd.N0(2131754469, null));
                    return;
                } else if (i7 == qr0Var.f51313x0) {
                    a9Var.setFixedSize(12);
                    a9Var.setText(null);
                    return;
                } else {
                    int i17 = qr0Var.f51298n - qr0Var.E;
                    if (i17 <= 0) {
                        if (z10) {
                            i12 = 2131743867;
                        } else {
                            i12 = 2131754466;
                        }
                        a9Var.setText(org.telegram.messenger.hd.N0(i12, null));
                        return;
                    } else if (z10) {
                        a9Var.setText(org.telegram.messenger.hd.H(',', "TodoNewTaskInfo", i17));
                        return;
                    } else {
                        a9Var.setText(org.telegram.messenger.hd.a0("AddAnOptionInfo", null, 2131754467, org.telegram.messenger.hd.G(i17, "Option", new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.setEnabled(!qr0Var.J);
            Switch checkBox = s8Var.getCheckBox();
            if (!qr0Var.J) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i7 == qr0Var.f51309v0) {
                s8Var.f(org.telegram.messenger.hd.N0(2131743852, null), qr0Var.I, true);
                s8Var.e(null, true);
                return;
            } else if (i7 == qr0Var.f51311w0) {
                s8Var.f(org.telegram.messenger.hd.N0(2131743851, null), qr0Var.K, false);
                s8Var.e(null, true);
                return;
            } else if (i7 == qr0Var.f51306s0) {
                String N0 = org.telegram.messenger.hd.N0(2131746984, null);
                boolean z13 = qr0Var.H;
                if (qr0Var.f51307t0 != -1 || qr0Var.f51308u0 != -1) {
                    z12 = true;
                }
                s8Var.f(N0, z13, z12);
                s8Var.e(null, true);
                return;
            } else if (i7 == qr0Var.f51307t0) {
                String N02 = org.telegram.messenger.hd.N0(2131746972, null);
                boolean z14 = qr0Var.L;
                if (qr0Var.f51308u0 != -1) {
                    z12 = true;
                }
                s8Var.f(N02, z14, z12);
                s8Var.e(null, true);
                return;
            } else if (i7 == qr0Var.f51308u0) {
                s8Var.f(org.telegram.messenger.hd.N0(2131746970, null), qr0Var.M, false);
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
        if (i7 == qr0Var.f51294i0) {
            if (z10) {
                if (qr0Var.A0 != null) {
                    i11 = 2131743833;
                } else {
                    i11 = 2131743813;
                }
            } else {
                i11 = 2131746971;
            }
            o4Var.setText(org.telegram.messenger.hd.N0(i11, null));
        } else if (i7 == qr0Var.f51299n0) {
            if (i14 == 1) {
                o4Var.setText(org.telegram.messenger.hd.N0(2131746251, null));
                return;
            }
            if (z10) {
                i10 = 2131743831;
            } else {
                i10 = 2131754243;
            }
            o4Var.setText(org.telegram.messenger.hd.N0(i10, null));
        } else if (i7 == qr0Var.f51304r0) {
            o4Var.setText(org.telegram.messenger.hd.N0(2131745299, null));
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        nr0 nr0Var;
        qr0 qr0Var = this.d;
        boolean z10 = qr0Var.f51287d0;
        if (i7 != 0) {
            Context context = this.f50626c;
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 6) {
                                if (i7 != 7) {
                                    nr0 nr0Var2 = new nr0(this, context, z10 ? 1 : 0, new j40(qr0Var, 22));
                                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, nr0Var2, null);
                                    nr0Var2.c(new bi.v(16, this, nr0Var2));
                                    nr0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = nr0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new ld(3, this, nr0Var2));
                                    textView.setOnKeyListener(new uf(nr0Var2, 2));
                                    nr0Var = nr0Var2;
                                } else {
                                    mr0 mr0Var = new mr0(this, context, z10 ? 1 : 0);
                                    mr0Var.d();
                                    org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, mr0Var, null);
                                    mr0Var.c(new bi.v(15, this, mr0Var));
                                    nr0Var = mr0Var;
                                }
                            } else {
                                View s8Var = new org.telegram.ui.Cells.s8(context);
                                org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, s8Var, null);
                                nr0Var = s8Var;
                            }
                        } else {
                            lr0 lr0Var = new lr0(this, context, z10 ? 1 : 0);
                            lr0Var.d();
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, lr0Var, null);
                            lr0Var.c(new bi.v(14, this, lr0Var));
                            nr0Var = lr0Var;
                        }
                    } else {
                        View n8Var = new org.telegram.ui.Cells.n8(context);
                        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, n8Var, null);
                        nr0Var = n8Var;
                    }
                } else {
                    nr0Var = new org.telegram.ui.Cells.a9(context);
                }
            } else {
                nr0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
            }
        } else {
            View o4Var = new org.telegram.ui.Cells.o4(this.f50626c, org.telegram.ui.ActionBar.m6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29347d6, o4Var, null);
            nr0Var = o4Var;
        }
        return i5.c.q(nr0Var, nr0Var, -1, -2);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        qr0 qr0Var = this.d;
        boolean z11 = qr0Var.f51289e0;
        int i12 = e1Var.f59115f;
        View view = e1Var.f59111a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i12 == 4) {
            org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
            b6Var.setTag(1);
            bi.u uVar = b6Var.d;
            CharSequence charSequence2 = qr0Var.F;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i11 = 2131743812;
            } else {
                i11 = 2131746252;
            }
            b6Var.o(charSequence, org.telegram.messenger.hd.N0(i11, null), false);
            b6Var.setTag(null);
            b6Var.setEnabled(!qr0Var.J);
            uVar.setEnabled(true ^ qr0Var.J);
            int i13 = org.telegram.ui.ActionBar.m6.G6;
            if (!qr0Var.J) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.t6.V(uVar, org.telegram.ui.ActionBar.t6.K(f10, i13), qr0Var.getResourceProvider());
            qr0.h0(qr0Var, view, e1Var.b());
        } else if (i12 == 5) {
            int b10 = e1Var.b();
            org.telegram.ui.Cells.b6 b6Var2 = (org.telegram.ui.Cells.b6) view;
            b6Var2.setTag(1);
            bi.u uVar2 = b6Var2.d;
            int i14 = b10 - qr0Var.f51300o0;
            if (qr0Var.J && i14 < qr0Var.f51314y) {
                z10 = false;
            } else {
                z10 = true;
            }
            uVar2.setEnabled(z10);
            int i15 = org.telegram.ui.ActionBar.m6.G6;
            if (z10) {
                f10 = 1.0f;
            }
            org.telegram.ui.ActionBar.t6.V(uVar2, org.telegram.ui.ActionBar.t6.K(f10, i15), qr0Var.getResourceProvider());
            CharSequence charSequence3 = qr0Var.f51310w[i14];
            if (z11) {
                i7 = 2131743814;
            } else {
                i7 = 2131747580;
            }
            b6Var2.o(charSequence3, org.telegram.messenger.hd.N0(i7, null), true);
            b6Var2.setTag(null);
            ImageView imageView = b6Var2.f30443f;
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
            if (!qr0Var.f51292g0 && qr0Var.f51293h0 == b10) {
                EditTextBoldCursor textView = b6Var2.getTextView();
                textView.requestFocus();
                org.telegram.messenger.g0.I3(textView);
                qr0Var.f51292g0 = false;
                qr0Var.f51293h0 = -1;
            }
            qr0.h0(qr0Var, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.b6 b6Var3 = (org.telegram.ui.Cells.b6) view;
            b6Var3.setTag(1);
            CharSequence charSequence4 = qr0Var.G;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            b6Var3.o(charSequence, org.telegram.messenger.hd.N0(2131754471, null), false);
            b6Var3.setTag(null);
            qr0.h0(qr0Var, view, e1Var.b());
        }
    }

    @Override
    public final void z(v4.e1 e1Var) {
        int i7 = e1Var.f59115f;
        if (i7 == 4 || i7 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.b6) e1Var.f59111a).getTextView();
            if (textView.isFocused()) {
                qr0 qr0Var = this.d;
                if (qr0Var.f51287d0) {
                    org.telegram.ui.Components.ax0 ax0Var = qr0Var.R;
                    if (ax0Var != null) {
                        ax0Var.f();
                    }
                    qr0Var.p0(true);
                }
                qr0Var.f51286c0 = null;
                textView.clearFocus();
                org.telegram.messenger.g0.v1(textView);
            }
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class ew0 extends org.telegram.ui.Components.lm0 {
    public final Context f35683c;
    public final gw0 d;

    public ew0(gw0 gw0Var, Context context) {
        this.d = gw0Var;
        this.f35683c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        gw0 gw0Var = this.d;
        if (b10 != gw0Var.f36515i0 && b10 != gw0Var.f36529u0 && b10 != gw0Var.f36530v0) {
            if (gw0Var.I && b10 >= (i10 = gw0Var.f36520n0) && b10 < gw0Var.f36535y + i10) {
                if (b10 - i10 < gw0Var.f36533x) {
                    return false;
                }
            } else if (b10 != gw0Var.f36521o0 && b10 != gw0Var.f36525r0 && b10 != gw0Var.f36527s0 && (gw0Var.N != 0 || b10 != gw0Var.f36528t0)) {
                return false;
            }
            return true;
        }
        return !gw0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f36534x0;
    }

    @Override
    public final int j(int i10) {
        gw0 gw0Var = this.d;
        if (i10 != gw0Var.f36514h0 && i10 != gw0Var.m0 && i10 != gw0Var.f36523q0) {
            if (i10 == gw0Var.f36518l0) {
                return 1;
            }
            if (i10 != gw0Var.f36522p0 && i10 != gw0Var.f36532w0 && i10 != gw0Var.f36517k0) {
                if (i10 == gw0Var.f36521o0) {
                    return 3;
                }
                if (i10 == gw0Var.f36515i0) {
                    return 4;
                }
                if (i10 == gw0Var.f36516j0) {
                    return 7;
                }
                if (i10 != gw0Var.f36525r0 && i10 != gw0Var.f36527s0 && i10 != gw0Var.f36528t0 && i10 != gw0Var.f36529u0 && i10 != gw0Var.f36530v0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        gw0 gw0Var = this.d;
        int i15 = gw0Var.N;
        boolean z10 = gw0Var.f36509d0;
        int i16 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f35683c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        r8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20029k7, false), mode));
                        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), crVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                e9Var.setBackground(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19863b7));
                if (i10 == gw0Var.f36517k0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == gw0Var.f36532w0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i17 = gw0Var.f36519n - gw0Var.f36535y;
                    if (i17 <= 0) {
                        if (z10) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        e9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z10) {
                        e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i17));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i17, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setEnabled(!gw0Var.I);
            Switch checkBox = w8Var.getCheckBox();
            if (!gw0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == gw0Var.f36529u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), gw0Var.H, true);
                w8Var.e(null, true);
                return;
            } else if (i10 == gw0Var.f36530v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), gw0Var.J, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == gw0Var.f36525r0) {
                String string = LocaleController.getString(R.string.PollAnonymous);
                boolean z13 = gw0Var.G;
                if (gw0Var.f36527s0 != -1 || gw0Var.f36528t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string, z13, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == gw0Var.f36527s0) {
                String string2 = LocaleController.getString(R.string.PollMultiple);
                boolean z14 = gw0Var.K;
                if (gw0Var.f36528t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string2, z14, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == gw0Var.f36528t0) {
                w8Var.f(LocaleController.getString(R.string.PollQuiz), gw0Var.L, false);
                if (i15 != 0) {
                    z11 = false;
                }
                w8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == gw0Var.f36514h0) {
            if (z10) {
                if (gw0Var.f36537z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == gw0Var.m0) {
            if (i15 == 1) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            }
            if (z10) {
                i11 = R.string.TodoItemsTitle;
            } else {
                i11 = R.string.AnswerOptions2;
            }
            m4Var.setText(LocaleController.getString(i11));
        } else if (i10 == gw0Var.f36523q0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        dw0 dw0Var;
        gw0 gw0Var = this.d;
        boolean z10 = gw0Var.f36508c0;
        if (i10 != 0) {
            Context context = this.f35683c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    dw0 dw0Var2 = new dw0(this, context, z10 ? 1 : 0, new t60(gw0Var, 20));
                                    dw0Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                                    dw0Var2.b(new org.telegram.ui.Components.eo(6, this, dw0Var2));
                                    dw0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = dw0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new ce(3, this, dw0Var2));
                                    textView.setOnKeyListener(new yg(dw0Var2, 2));
                                    dw0Var = dw0Var2;
                                } else {
                                    cw0 cw0Var = new cw0(this, context, z10 ? 1 : 0);
                                    cw0Var.c();
                                    cw0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                                    cw0Var.b(new org.telegram.ui.Components.eo(5, this, cw0Var));
                                    dw0Var = cw0Var;
                                }
                            } else {
                                View w8Var = new org.telegram.ui.Cells.w8(context);
                                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                                dw0Var = w8Var;
                            }
                        } else {
                            bw0 bw0Var = new bw0(this, context, z10 ? 1 : 0);
                            bw0Var.c();
                            bw0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                            bw0Var.b(new org.telegram.ui.Components.eo(4, this, bw0Var));
                            dw0Var = bw0Var;
                        }
                    } else {
                        View r8Var = new org.telegram.ui.Cells.r8(context);
                        r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
                        dw0Var = r8Var;
                    }
                } else {
                    dw0Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                dw0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f35683c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
            dw0Var = m4Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(dw0Var, dw0Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        gw0 gw0Var = this.d;
        boolean z11 = gw0Var.f36509d0;
        int i13 = b1Var.f44841f;
        View view = b1Var.f44838a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence2 = gw0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            d6Var.n(charSequence, LocaleController.getString(i12), false);
            d6Var.setTag(null);
            d6Var.setEnabled(!gw0Var.I);
            c6Var.setEnabled(true ^ gw0Var.I);
            int themedColor = gw0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
            if (!gw0Var.I) {
                f7 = 1.0f;
            }
            c6Var.setTextColor(org.telegram.ui.ActionBar.g6.m1(f7, themedColor));
            gw0.c0(gw0Var, view, b1Var.b());
        } else if (i13 == 5) {
            int b10 = b1Var.b();
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            org.telegram.ui.Cells.c6 c6Var2 = d6Var2.d;
            int i14 = b10 - gw0Var.f36520n0;
            if (gw0Var.I && i14 < gw0Var.f36533x) {
                z10 = false;
            } else {
                z10 = true;
            }
            c6Var2.setEnabled(z10);
            int themedColor2 = gw0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            c6Var2.setTextColor(org.telegram.ui.ActionBar.g6.m1(f7, themedColor2));
            CharSequence charSequence3 = gw0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var2.n(charSequence3, LocaleController.getString(i10), true);
            d6Var2.setTag(null);
            ImageView imageView = d6Var2.f21072f;
            if (imageView != null) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = d6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f10 = 0.45f;
                }
                imageView2.setAlpha(f10);
            }
            if (!gw0Var.f36512f0 && gw0Var.f36513g0 == b10) {
                EditTextBoldCursor textView = d6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                gw0Var.f36512f0 = false;
                gw0Var.f36513g0 = -1;
            }
            gw0.c0(gw0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            CharSequence charSequence4 = gw0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            d6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var3.setTag(null);
            gw0.c0(gw0Var, view, b1Var.b());
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.f44838a).getTextView();
            if (textView.isFocused()) {
                gw0 gw0Var = this.d;
                if (gw0Var.f36508c0) {
                    org.telegram.ui.Components.kz0 kz0Var = gw0Var.Q;
                    if (kz0Var != null) {
                        kz0Var.f();
                    }
                    gw0Var.k0(true);
                }
                gw0Var.f36506b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

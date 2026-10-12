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
public final class aw0 extends org.telegram.ui.Components.vm0 {
    public final Context f35986c;
    public final cw0 d;

    public aw0(cw0 cw0Var, Context context) {
        this.d = cw0Var;
        this.f35986c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10;
        int b10 = d1Var.b();
        cw0 cw0Var = this.d;
        if (b10 != cw0Var.f36551i0 && b10 != cw0Var.f36565u0 && b10 != cw0Var.f36566v0) {
            if (cw0Var.I && b10 >= (i10 = cw0Var.f36556n0) && b10 < cw0Var.f36571y + i10) {
                if (b10 - i10 < cw0Var.f36569x) {
                    return false;
                }
            } else if (b10 != cw0Var.f36557o0 && b10 != cw0Var.f36561r0 && b10 != cw0Var.f36563s0 && (cw0Var.N != 0 || b10 != cw0Var.f36564t0)) {
                return false;
            }
            return true;
        }
        return !cw0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f36570x0;
    }

    @Override
    public final int j(int i10) {
        cw0 cw0Var = this.d;
        if (i10 != cw0Var.f36550h0 && i10 != cw0Var.m0 && i10 != cw0Var.f36559q0) {
            if (i10 == cw0Var.f36554l0) {
                return 1;
            }
            if (i10 != cw0Var.f36558p0 && i10 != cw0Var.f36568w0 && i10 != cw0Var.f36553k0) {
                if (i10 == cw0Var.f36557o0) {
                    return 3;
                }
                if (i10 == cw0Var.f36551i0) {
                    return 4;
                }
                if (i10 == cw0Var.f36552j0) {
                    return 7;
                }
                if (i10 != cw0Var.f36561r0 && i10 != cw0Var.f36563s0 && i10 != cw0Var.f36564t0 && i10 != cw0Var.f36565u0 && i10 != cw0Var.f36566v0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        cw0 cw0Var = this.d;
        int i15 = cw0Var.N;
        boolean z10 = cw0Var.f36544d0;
        int i16 = d1Var.f47893f;
        View view = d1Var.f47889a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f35986c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        r8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20688k7, false), mode));
                        org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), hrVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                e9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20523b7));
                if (i10 == cw0Var.f36553k0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == cw0Var.f36568w0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i17 = cw0Var.f36555n - cw0Var.f36571y;
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
            w8Var.setEnabled(!cw0Var.I);
            Switch checkBox = w8Var.getCheckBox();
            if (!cw0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == cw0Var.f36565u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), cw0Var.H, true);
                w8Var.e(null, true);
                return;
            } else if (i10 == cw0Var.f36566v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), cw0Var.J, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == cw0Var.f36561r0) {
                String string = LocaleController.getString(R.string.PollAnonymous);
                boolean z13 = cw0Var.G;
                if (cw0Var.f36563s0 != -1 || cw0Var.f36564t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string, z13, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == cw0Var.f36563s0) {
                String string2 = LocaleController.getString(R.string.PollMultiple);
                boolean z14 = cw0Var.K;
                if (cw0Var.f36564t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string2, z14, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == cw0Var.f36564t0) {
                w8Var.f(LocaleController.getString(R.string.PollQuiz), cw0Var.L, false);
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
        if (i10 == cw0Var.f36550h0) {
            if (z10) {
                if (cw0Var.f36573z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == cw0Var.m0) {
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
        } else if (i10 == cw0Var.f36559q0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        zv0 zv0Var;
        cw0 cw0Var = this.d;
        boolean z10 = cw0Var.f36543c0;
        if (i10 != 0) {
            Context context = this.f35986c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    zv0 zv0Var2 = new zv0(this, context, z10 ? 1 : 0, new o60(cw0Var, 20));
                                    zv0Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                                    zv0Var2.c(new org.telegram.ui.Components.jo(6, this, zv0Var2));
                                    zv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = zv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new ae(3, this, zv0Var2));
                                    textView.setOnKeyListener(new xg(zv0Var2, 2));
                                    zv0Var = zv0Var2;
                                } else {
                                    yv0 yv0Var = new yv0(this, context, z10 ? 1 : 0);
                                    yv0Var.d();
                                    yv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                                    yv0Var.c(new org.telegram.ui.Components.jo(5, this, yv0Var));
                                    zv0Var = yv0Var;
                                }
                            } else {
                                View w8Var = new org.telegram.ui.Cells.w8(context);
                                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                                zv0Var = w8Var;
                            }
                        } else {
                            xv0 xv0Var = new xv0(this, context, z10 ? 1 : 0);
                            xv0Var.d();
                            xv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                            xv0Var.c(new org.telegram.ui.Components.jo(4, this, xv0Var));
                            zv0Var = xv0Var;
                        }
                    } else {
                        View r8Var = new org.telegram.ui.Cells.r8(context);
                        r8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
                        zv0Var = r8Var;
                    }
                } else {
                    zv0Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                zv0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f35986c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
            zv0Var = m4Var;
        }
        return com.google.android.gms.internal.vision.e2.k(zv0Var, zv0Var, -1, -2);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        cw0 cw0Var = this.d;
        boolean z11 = cw0Var.f36544d0;
        int i13 = d1Var.f47893f;
        View view = d1Var.f47889a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence2 = cw0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            d6Var.o(charSequence, LocaleController.getString(i12), false);
            d6Var.setTag(null);
            d6Var.setEnabled(!cw0Var.I);
            c6Var.setEnabled(true ^ cw0Var.I);
            int themedColor = cw0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
            if (!cw0Var.I) {
                f7 = 1.0f;
            }
            c6Var.setTextColor(org.telegram.ui.ActionBar.h6.m1(f7, themedColor));
            cw0.c0(cw0Var, view, d1Var.b());
        } else if (i13 == 5) {
            int b10 = d1Var.b();
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            org.telegram.ui.Cells.c6 c6Var2 = d6Var2.d;
            int i14 = b10 - cw0Var.f36556n0;
            if (cw0Var.I && i14 < cw0Var.f36569x) {
                z10 = false;
            } else {
                z10 = true;
            }
            c6Var2.setEnabled(z10);
            int themedColor2 = cw0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            c6Var2.setTextColor(org.telegram.ui.ActionBar.h6.m1(f7, themedColor2));
            CharSequence charSequence3 = cw0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var2.o(charSequence3, LocaleController.getString(i10), true);
            d6Var2.setTag(null);
            ImageView imageView = d6Var2.f21737f;
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
            if (!cw0Var.f36548f0 && cw0Var.f36549g0 == b10) {
                EditTextBoldCursor textView = d6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                cw0Var.f36548f0 = false;
                cw0Var.f36549g0 = -1;
            }
            cw0.c0(cw0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            CharSequence charSequence4 = cw0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            d6Var3.o(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var3.setTag(null);
            cw0.c0(cw0Var, view, d1Var.b());
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        int i10 = d1Var.f47893f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) d1Var.f47889a).getTextView();
            if (textView.isFocused()) {
                cw0 cw0Var = this.d;
                if (cw0Var.f36543c0) {
                    org.telegram.ui.Components.uz0 uz0Var = cw0Var.Q;
                    if (uz0Var != null) {
                        uz0Var.f();
                    }
                    cw0Var.k0(true);
                }
                cw0Var.f36541b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

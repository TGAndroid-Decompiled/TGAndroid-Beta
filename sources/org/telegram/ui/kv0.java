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
public final class kv0 extends org.telegram.ui.Components.rl0 {
    public final Context f38432c;
    public final mv0 d;

    public kv0(mv0 mv0Var, Context context) {
        this.d = mv0Var;
        this.f38432c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int b10 = m1Var.b();
        mv0 mv0Var = this.d;
        if (b10 != mv0Var.f39099f0 && b10 != mv0Var.f39112r0 && b10 != mv0Var.f39114s0) {
            if (mv0Var.F && b10 >= (i10 = mv0Var.f39104k0) && b10 < mv0Var.f39122y + i10) {
                if (b10 - i10 < mv0Var.f39120x) {
                    return false;
                }
            } else if (b10 != mv0Var.f39105l0 && b10 != mv0Var.f39108o0 && b10 != mv0Var.f39109p0 && (mv0Var.K != 0 || b10 != mv0Var.f39110q0)) {
                return false;
            }
            return true;
        }
        return !mv0Var.F;
    }

    @Override
    public final int h() {
        return this.d.f39116u0;
    }

    @Override
    public final int j(int i10) {
        mv0 mv0Var = this.d;
        if (i10 != mv0Var.f39097e0 && i10 != mv0Var.f39103j0 && i10 != mv0Var.f39107n0) {
            if (i10 == mv0Var.f39102i0) {
                return 1;
            }
            if (i10 != mv0Var.m0 && i10 != mv0Var.f39115t0 && i10 != mv0Var.f39101h0) {
                if (i10 == mv0Var.f39105l0) {
                    return 3;
                }
                if (i10 == mv0Var.f39099f0) {
                    return 4;
                }
                if (i10 == mv0Var.f39100g0) {
                    return 7;
                }
                if (i10 != mv0Var.f39108o0 && i10 != mv0Var.f39109p0 && i10 != mv0Var.f39110q0 && i10 != mv0Var.f39112r0 && i10 != mv0Var.f39114s0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        mv0 mv0Var = this.d;
        int i15 = mv0Var.K;
        boolean z4 = mv0Var.f39090a0;
        int i16 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z10 = true;
        if (i16 != 0) {
            boolean z11 = false;
            if (i16 != 6) {
                Context context = this.f38432c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                        o8Var.e(-1, org.telegram.ui.ActionBar.k6.f21896q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21788k7, false), mode));
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(drawable, drawable2);
                        if (z4) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        o8Var.n(LocaleController.getString(i14), pqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21626b7));
                if (i10 == mv0Var.f39101h0) {
                    a9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == mv0Var.f39115t0) {
                    a9Var.setFixedSize(12);
                    a9Var.setText(null);
                    return;
                } else {
                    int i17 = mv0Var.f39106n - mv0Var.f39122y;
                    if (i17 <= 0) {
                        if (z4) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        a9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z4) {
                        a9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i17));
                        return;
                    } else {
                        a9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i17, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            s8Var.setEnabled(!mv0Var.F);
            Switch checkBox = s8Var.getCheckBox();
            if (!mv0Var.F) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i10 == mv0Var.f39112r0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), mv0Var.E, true);
                s8Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f39114s0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), mv0Var.G, false);
                s8Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f39108o0) {
                s8Var.f(LocaleController.getString(R.string.PollAnonymous), mv0Var.D, (mv0Var.f39109p0 == -1 && mv0Var.f39110q0 == -1) ? true : true);
                s8Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f39109p0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z12 = mv0Var.H;
                if (mv0Var.f39110q0 != -1) {
                    z11 = true;
                }
                s8Var.f(string, z12, z11);
                s8Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f39110q0) {
                s8Var.f(LocaleController.getString(R.string.PollQuiz), mv0Var.I, false);
                if (i15 != 0) {
                    z10 = false;
                }
                s8Var.e(null, z10);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == mv0Var.f39097e0) {
            if (z4) {
                if (mv0Var.f39119w0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == mv0Var.f39103j0) {
            if (i15 == 1) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            }
            if (z4) {
                i11 = R.string.TodoItemsTitle;
            } else {
                i11 = R.string.AnswerOptions2;
            }
            m4Var.setText(LocaleController.getString(i11));
        } else if (i10 == mv0Var.f39107n0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        jv0 jv0Var;
        mv0 mv0Var = this.d;
        boolean z4 = mv0Var.Z;
        if (i10 != 0) {
            Context context = this.f38432c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    jv0 jv0Var2 = new jv0(this, context, z4 ? 1 : 0, new f60(mv0Var, 21));
                                    jv0Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                                    jv0Var2.c(new dg.b0(this, jv0Var2, false, 13));
                                    jv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = jv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new yd(3, this, jv0Var2));
                                    textView.setOnKeyListener(new og(jv0Var2, 2));
                                    jv0Var = jv0Var2;
                                } else {
                                    iv0 iv0Var = new iv0(this, context, z4 ? 1 : 0);
                                    iv0Var.d();
                                    iv0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                                    iv0Var.c(new dg.b0(this, iv0Var, false, 12));
                                    jv0Var = iv0Var;
                                }
                            } else {
                                View s8Var = new org.telegram.ui.Cells.s8(context);
                                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                                jv0Var = s8Var;
                            }
                        } else {
                            hv0 hv0Var = new hv0(this, context, z4 ? 1 : 0);
                            hv0Var.d();
                            hv0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                            hv0Var.c(new dg.b0(this, hv0Var, false, 11));
                            jv0Var = hv0Var;
                        }
                    } else {
                        View o8Var = new org.telegram.ui.Cells.o8(context);
                        o8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
                        jv0Var = o8Var;
                    }
                } else {
                    jv0Var = new org.telegram.ui.Cells.a9(context);
                }
            } else {
                jv0Var = new org.telegram.ui.Cells.z6(context, (b) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f38432c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
            jv0Var = m4Var;
        }
        return yh.o(jv0Var, jv0Var, -1, -2);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        mv0 mv0Var = this.d;
        boolean z10 = mv0Var.f39090a0;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            eh.b bVar = c6Var.d;
            CharSequence charSequence2 = mv0Var.B;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            c6Var.n(charSequence, LocaleController.getString(i12), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!mv0Var.F);
            bVar.setEnabled(true ^ mv0Var.F);
            int themedColor = mv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            if (!mv0Var.F) {
                f10 = 1.0f;
            }
            bVar.setTextColor(org.telegram.ui.ActionBar.k6.l1(f10, themedColor));
            mv0.c0(mv0Var, view, m1Var.b());
        } else if (i13 == 5) {
            int b10 = m1Var.b();
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            eh.b bVar2 = c6Var2.d;
            int i14 = b10 - mv0Var.f39104k0;
            if (mv0Var.F && i14 < mv0Var.f39120x) {
                z4 = false;
            } else {
                z4 = true;
            }
            bVar2.setEnabled(z4);
            int themedColor2 = mv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            if (z4) {
                f10 = 1.0f;
            }
            bVar2.setTextColor(org.telegram.ui.ActionBar.k6.l1(f10, themedColor2));
            CharSequence charSequence3 = mv0Var.v[i14];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var2.n(charSequence3, LocaleController.getString(i10), true);
            c6Var2.setTag(null);
            ImageView imageView = c6Var2.f22653f;
            if (imageView != null) {
                if (z4) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = c6Var2.h;
            if (imageView2 != null) {
                if (!z4) {
                    f11 = 0.45f;
                }
                imageView2.setAlpha(f11);
            }
            if (!mv0Var.f39094c0 && mv0Var.f39095d0 == b10) {
                EditTextBoldCursor textView = c6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                mv0Var.f39094c0 = false;
                mv0Var.f39095d0 = -1;
            }
            mv0.c0(mv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            CharSequence charSequence4 = mv0Var.C;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            c6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var3.setTag(null);
            mv0.c0(mv0Var, view, m1Var.b());
        }
    }

    @Override
    public final void z(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) m1Var.f5875a).getTextView();
            if (textView.isFocused()) {
                mv0 mv0Var = this.d;
                if (mv0Var.Z) {
                    org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
                    if (qy0Var != null) {
                        qy0Var.f();
                    }
                    mv0Var.k0(true);
                }
                mv0Var.Y = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

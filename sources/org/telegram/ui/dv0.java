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
public final class dv0 extends org.telegram.ui.Components.rl0 {
    public final Context f33811c;
    public final fv0 d;

    public dv0(fv0 fv0Var, Context context) {
        this.d = fv0Var;
        this.f33811c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int b10 = l1Var.b();
        fv0 fv0Var = this.d;
        if (b10 != fv0Var.f34381f0 && b10 != fv0Var.f34394r0 && b10 != fv0Var.f34396s0) {
            if (fv0Var.F && b10 >= (i10 = fv0Var.f34386k0) && b10 < fv0Var.f34404y + i10) {
                if (b10 - i10 < fv0Var.f34402x) {
                    return false;
                }
            } else if (b10 != fv0Var.f34387l0 && b10 != fv0Var.f34390o0 && b10 != fv0Var.f34391p0 && (fv0Var.K != 0 || b10 != fv0Var.f34392q0)) {
                return false;
            }
            return true;
        }
        return !fv0Var.F;
    }

    @Override
    public final int h() {
        return this.d.f34398u0;
    }

    @Override
    public final int j(int i10) {
        fv0 fv0Var = this.d;
        if (i10 != fv0Var.f34379e0 && i10 != fv0Var.f34385j0 && i10 != fv0Var.f34389n0) {
            if (i10 == fv0Var.f34384i0) {
                return 1;
            }
            if (i10 != fv0Var.m0 && i10 != fv0Var.f34397t0 && i10 != fv0Var.f34383h0) {
                if (i10 == fv0Var.f34387l0) {
                    return 3;
                }
                if (i10 == fv0Var.f34381f0) {
                    return 4;
                }
                if (i10 == fv0Var.f34382g0) {
                    return 7;
                }
                if (i10 != fv0Var.f34390o0 && i10 != fv0Var.f34391p0 && i10 != fv0Var.f34392q0 && i10 != fv0Var.f34394r0 && i10 != fv0Var.f34396s0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        fv0 fv0Var = this.d;
        int i15 = fv0Var.K;
        boolean z4 = fv0Var.f34373a0;
        int i16 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z10 = true;
        if (i16 != 0) {
            boolean z11 = false;
            if (i16 != 6) {
                Context context = this.f33811c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                        o8Var.e(-1, org.telegram.ui.ActionBar.j6.f20140q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20032k7, false), mode));
                        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(drawable, drawable2);
                        if (z4) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        o8Var.n(LocaleController.getString(i14), nqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                a9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7));
                if (i10 == fv0Var.f34383h0) {
                    a9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == fv0Var.f34397t0) {
                    a9Var.setFixedSize(12);
                    a9Var.setText(null);
                    return;
                } else {
                    int i17 = fv0Var.f34388n - fv0Var.f34404y;
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
            s8Var.setEnabled(!fv0Var.F);
            Switch checkBox = s8Var.getCheckBox();
            if (!fv0Var.F) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i10 == fv0Var.f34394r0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), fv0Var.E, true);
                s8Var.e(null, true);
                return;
            } else if (i10 == fv0Var.f34396s0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), fv0Var.G, false);
                s8Var.e(null, true);
                return;
            } else if (i10 == fv0Var.f34390o0) {
                s8Var.f(LocaleController.getString(R.string.PollAnonymous), fv0Var.D, (fv0Var.f34391p0 == -1 && fv0Var.f34392q0 == -1) ? true : true);
                s8Var.e(null, true);
                return;
            } else if (i10 == fv0Var.f34391p0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z12 = fv0Var.H;
                if (fv0Var.f34392q0 != -1) {
                    z11 = true;
                }
                s8Var.f(string, z12, z11);
                s8Var.e(null, true);
                return;
            } else if (i10 == fv0Var.f34392q0) {
                s8Var.f(LocaleController.getString(R.string.PollQuiz), fv0Var.I, false);
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
        if (i10 == fv0Var.f34379e0) {
            if (z4) {
                if (fv0Var.f34401w0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == fv0Var.f34385j0) {
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
        } else if (i10 == fv0Var.f34389n0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        cv0 cv0Var;
        fv0 fv0Var = this.d;
        boolean z4 = fv0Var.Z;
        if (i10 != 0) {
            Context context = this.f33811c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    cv0 cv0Var2 = new cv0(this, context, z4 ? 1 : 0, new e60(fv0Var, 22));
                                    cv0Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                                    cv0Var2.c(new cg.b0(this, cv0Var2, false, 13));
                                    cv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = cv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new yd(3, this, cv0Var2));
                                    textView.setOnKeyListener(new og(cv0Var2, 2));
                                    cv0Var = cv0Var2;
                                } else {
                                    bv0 bv0Var = new bv0(this, context, z4 ? 1 : 0);
                                    bv0Var.d();
                                    bv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                                    bv0Var.c(new cg.b0(this, bv0Var, false, 12));
                                    cv0Var = bv0Var;
                                }
                            } else {
                                View s8Var = new org.telegram.ui.Cells.s8(context);
                                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                                cv0Var = s8Var;
                            }
                        } else {
                            av0 av0Var = new av0(this, context, z4 ? 1 : 0);
                            av0Var.d();
                            av0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                            av0Var.c(new cg.b0(this, av0Var, false, 11));
                            cv0Var = av0Var;
                        }
                    } else {
                        View o8Var = new org.telegram.ui.Cells.o8(context);
                        o8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
                        cv0Var = o8Var;
                    }
                } else {
                    cv0Var = new org.telegram.ui.Cells.a9(context);
                }
            } else {
                cv0Var = new org.telegram.ui.Cells.z6(context, (b) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f33811c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
            cv0Var = m4Var;
        }
        return yh.o(cv0Var, cv0Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        fv0 fv0Var = this.d;
        boolean z10 = fv0Var.f34373a0;
        int i13 = l1Var.f5788f;
        View view = l1Var.f5785a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            dh.b bVar = c6Var.d;
            CharSequence charSequence2 = fv0Var.B;
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
            c6Var.setEnabled(!fv0Var.F);
            bVar.setEnabled(true ^ fv0Var.F);
            int themedColor = fv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
            if (!fv0Var.F) {
                f10 = 1.0f;
            }
            bVar.setTextColor(org.telegram.ui.ActionBar.j6.l1(f10, themedColor));
            fv0.c0(fv0Var, view, l1Var.b());
        } else if (i13 == 5) {
            int b10 = l1Var.b();
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            dh.b bVar2 = c6Var2.d;
            int i14 = b10 - fv0Var.f34386k0;
            if (fv0Var.F && i14 < fv0Var.f34402x) {
                z4 = false;
            } else {
                z4 = true;
            }
            bVar2.setEnabled(z4);
            int themedColor2 = fv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
            if (z4) {
                f10 = 1.0f;
            }
            bVar2.setTextColor(org.telegram.ui.ActionBar.j6.l1(f10, themedColor2));
            CharSequence charSequence3 = fv0Var.v[i14];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var2.n(charSequence3, LocaleController.getString(i10), true);
            c6Var2.setTag(null);
            ImageView imageView = c6Var2.f20918f;
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
            if (!fv0Var.f34377c0 && fv0Var.f34378d0 == b10) {
                EditTextBoldCursor textView = c6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                fv0Var.f34377c0 = false;
                fv0Var.f34378d0 = -1;
            }
            fv0.c0(fv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            CharSequence charSequence4 = fv0Var.C;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            c6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var3.setTag(null);
            fv0.c0(fv0Var, view, l1Var.b());
        }
    }

    @Override
    public final void z(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) l1Var.f5785a).getTextView();
            if (textView.isFocused()) {
                fv0 fv0Var = this.d;
                if (fv0Var.Z) {
                    org.telegram.ui.Components.qy0 qy0Var = fv0Var.N;
                    if (qy0Var != null) {
                        qy0Var.f();
                    }
                    fv0Var.k0(true);
                }
                fv0Var.Y = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

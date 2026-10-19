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
public final class dv0 extends org.telegram.ui.Components.hm0 {
    public final Context f36446c;
    public final fv0 d;

    public dv0(fv0 fv0Var, Context context) {
        this.d = fv0Var;
        this.f36446c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        fv0 fv0Var = this.d;
        if (b10 != fv0Var.f37103i0 && b10 != fv0Var.f37117u0 && b10 != fv0Var.f37118v0) {
            if (fv0Var.I && b10 >= (i10 = fv0Var.f37108n0) && b10 < fv0Var.f37123y + i10) {
                if (b10 - i10 < fv0Var.f37121x) {
                    return false;
                }
            } else if (b10 != fv0Var.f37109o0 && b10 != fv0Var.f37113r0 && b10 != fv0Var.f37115s0 && (fv0Var.N != 0 || b10 != fv0Var.f37116t0)) {
                return false;
            }
            return true;
        }
        return !fv0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f37122x0;
    }

    @Override
    public final int j(int i10) {
        fv0 fv0Var = this.d;
        if (i10 != fv0Var.f37102h0 && i10 != fv0Var.m0 && i10 != fv0Var.f37111q0) {
            if (i10 == fv0Var.f37106l0) {
                return 1;
            }
            if (i10 != fv0Var.f37110p0 && i10 != fv0Var.f37120w0 && i10 != fv0Var.f37105k0) {
                if (i10 == fv0Var.f37109o0) {
                    return 3;
                }
                if (i10 == fv0Var.f37103i0) {
                    return 4;
                }
                if (i10 == fv0Var.f37104j0) {
                    return 7;
                }
                if (i10 != fv0Var.f37113r0 && i10 != fv0Var.f37115s0 && i10 != fv0Var.f37116t0 && i10 != fv0Var.f37117u0 && i10 != fv0Var.f37118v0) {
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
        fv0 fv0Var = this.d;
        int i15 = fv0Var.N;
        boolean z10 = fv0Var.f37097d0;
        int i16 = b1Var.f45915f;
        View view = b1Var.f45912a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f36446c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                        q8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21115k7, false), mode));
                        org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        q8Var.n(LocaleController.getString(i14), zqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                d9Var.setFixedSize(0);
                d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20949b7));
                if (i10 == fv0Var.f37105k0) {
                    d9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == fv0Var.f37120w0) {
                    d9Var.setFixedSize(12);
                    d9Var.setText(null);
                    return;
                } else {
                    int i17 = fv0Var.f37107n - fv0Var.f37123y;
                    if (i17 <= 0) {
                        if (z10) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        d9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z10) {
                        d9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i17));
                        return;
                    } else {
                        d9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i17, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            v8Var.setEnabled(!fv0Var.I);
            Switch checkBox = v8Var.getCheckBox();
            if (!fv0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == fv0Var.f37117u0) {
                v8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), fv0Var.H, true);
                v8Var.e(null, true);
                return;
            } else if (i10 == fv0Var.f37118v0) {
                v8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), fv0Var.J, false);
                v8Var.e(null, true);
                return;
            } else if (i10 == fv0Var.f37113r0) {
                String string = LocaleController.getString(R.string.PollAnonymous);
                boolean z13 = fv0Var.G;
                if (fv0Var.f37115s0 != -1 || fv0Var.f37116t0 != -1) {
                    z12 = true;
                }
                v8Var.f(string, z13, z12);
                v8Var.e(null, true);
                return;
            } else if (i10 == fv0Var.f37115s0) {
                String string2 = LocaleController.getString(R.string.PollMultiple);
                boolean z14 = fv0Var.K;
                if (fv0Var.f37116t0 != -1) {
                    z12 = true;
                }
                v8Var.f(string2, z14, z12);
                v8Var.e(null, true);
                return;
            } else if (i10 == fv0Var.f37116t0) {
                v8Var.f(LocaleController.getString(R.string.PollQuiz), fv0Var.L, false);
                if (i15 != 0) {
                    z11 = false;
                }
                v8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == fv0Var.f37102h0) {
            if (z10) {
                if (fv0Var.f37125z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            l4Var.setText(LocaleController.getString(i12));
        } else if (i10 == fv0Var.m0) {
            if (i15 == 1) {
                l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            }
            if (z10) {
                i11 = R.string.TodoItemsTitle;
            } else {
                i11 = R.string.AnswerOptions2;
            }
            l4Var.setText(LocaleController.getString(i11));
        } else if (i10 == fv0Var.f37111q0) {
            l4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        cv0 cv0Var;
        fv0 fv0Var = this.d;
        boolean z10 = fv0Var.f37096c0;
        if (i10 != 0) {
            Context context = this.f36446c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    cv0 cv0Var2 = new cv0(this, context, z10 ? 1 : 0, new s50(fv0Var, 21));
                                    cv0Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
                                    cv0Var2.c(new org.telegram.ui.Components.ao(6, this, cv0Var2));
                                    cv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = cv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new wd(3, this, cv0Var2));
                                    textView.setOnKeyListener(new lg(cv0Var2, 2));
                                    cv0Var = cv0Var2;
                                } else {
                                    bv0 bv0Var = new bv0(this, context, z10 ? 1 : 0);
                                    bv0Var.d();
                                    bv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
                                    bv0Var.c(new org.telegram.ui.Components.ao(5, this, bv0Var));
                                    cv0Var = bv0Var;
                                }
                            } else {
                                View v8Var = new org.telegram.ui.Cells.v8(context);
                                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
                                cv0Var = v8Var;
                            }
                        } else {
                            av0 av0Var = new av0(this, context, z10 ? 1 : 0);
                            av0Var.d();
                            av0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
                            av0Var.c(new org.telegram.ui.Components.ao(4, this, av0Var));
                            cv0Var = av0Var;
                        }
                    } else {
                        View q8Var = new org.telegram.ui.Cells.q8(context);
                        q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
                        cv0Var = q8Var;
                    }
                } else {
                    cv0Var = new org.telegram.ui.Cells.d9(context);
                }
            } else {
                cv0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.f36446c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, null);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false));
            cv0Var = l4Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(cv0Var, cv0Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        fv0 fv0Var = this.d;
        boolean z11 = fv0Var.f37097d0;
        int i13 = b1Var.f45915f;
        View view = b1Var.f45912a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            org.telegram.ui.Cells.b6 b6Var = c6Var.d;
            CharSequence charSequence2 = fv0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            c6Var.n(charSequence, LocaleController.getString(i12), false);
            c6Var.setTag(null);
            c6Var.setEnabled(!fv0Var.I);
            b6Var.setEnabled(true ^ fv0Var.I);
            int themedColor = fv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
            if (!fv0Var.I) {
                f7 = 1.0f;
            }
            b6Var.setTextColor(org.telegram.ui.ActionBar.h6.m1(f7, themedColor));
            fv0.c0(fv0Var, view, b1Var.b());
        } else if (i13 == 5) {
            int b10 = b1Var.b();
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            org.telegram.ui.Cells.b6 b6Var2 = c6Var2.d;
            int i14 = b10 - fv0Var.f37108n0;
            if (fv0Var.I && i14 < fv0Var.f37121x) {
                z10 = false;
            } else {
                z10 = true;
            }
            b6Var2.setEnabled(z10);
            int themedColor2 = fv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            b6Var2.setTextColor(org.telegram.ui.ActionBar.h6.m1(f7, themedColor2));
            CharSequence charSequence3 = fv0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var2.n(charSequence3, LocaleController.getString(i10), true);
            c6Var2.setTag(null);
            ImageView imageView = c6Var2.f22091f;
            if (imageView != null) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = c6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f10 = 0.45f;
                }
                imageView2.setAlpha(f10);
            }
            if (!fv0Var.f37100f0 && fv0Var.f37101g0 == b10) {
                EditTextBoldCursor textView = c6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                fv0Var.f37100f0 = false;
                fv0Var.f37101g0 = -1;
            }
            fv0.c0(fv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            CharSequence charSequence4 = fv0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            c6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var3.setTag(null);
            fv0.c0(fv0Var, view, b1Var.b());
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f45915f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) b1Var.f45912a).getTextView();
            if (textView.isFocused()) {
                fv0 fv0Var = this.d;
                if (fv0Var.f37096c0) {
                    org.telegram.ui.Components.hz0 hz0Var = fv0Var.Q;
                    if (hz0Var != null) {
                        hz0Var.f();
                    }
                    fv0Var.k0(true);
                }
                fv0Var.f37094b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

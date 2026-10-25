package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class kv0 extends org.telegram.ui.Components.lm0 {
    public final Context f41072c;
    public final mv0 d;

    public kv0(mv0 mv0Var, Context context) {
        this.d = mv0Var;
        this.f41072c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int b10 = e1Var.b();
        mv0 mv0Var = this.d;
        if (b10 != mv0Var.f41684i0 && b10 != mv0Var.f41698u0 && b10 != mv0Var.f41699v0) {
            if (mv0Var.I && b10 >= (i10 = mv0Var.f41689n0) && b10 < mv0Var.f41704y + i10) {
                if (b10 - i10 < mv0Var.f41702x) {
                    return false;
                }
            } else if (b10 != mv0Var.f41690o0 && b10 != mv0Var.f41694r0 && b10 != mv0Var.f41696s0 && (mv0Var.N != 0 || b10 != mv0Var.f41697t0)) {
                return false;
            }
            return true;
        }
        return !mv0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f41703x0;
    }

    @Override
    public final int j(int i10) {
        mv0 mv0Var = this.d;
        if (i10 != mv0Var.f41683h0 && i10 != mv0Var.m0 && i10 != mv0Var.f41692q0) {
            if (i10 == mv0Var.f41687l0) {
                return 1;
            }
            if (i10 != mv0Var.f41691p0 && i10 != mv0Var.f41701w0 && i10 != mv0Var.f41686k0) {
                if (i10 == mv0Var.f41690o0) {
                    return 3;
                }
                if (i10 == mv0Var.f41684i0) {
                    return 4;
                }
                if (i10 == mv0Var.f41685j0) {
                    return 7;
                }
                if (i10 != mv0Var.f41694r0 && i10 != mv0Var.f41696s0 && i10 != mv0Var.f41697t0 && i10 != mv0Var.f41698u0 && i10 != mv0Var.f41699v0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        mv0 mv0Var = this.d;
        int i15 = mv0Var.N;
        boolean z10 = mv0Var.f41678d0;
        int i16 = e1Var.f47738f;
        View view = e1Var.f47735a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f41072c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                        v8Var.g(-1, org.telegram.ui.ActionBar.y6.f23595q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int i17 = org.telegram.ui.ActionBar.y6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.f7.y(v8Var, drawable, i17, null, mode);
                        org.telegram.ui.ActionBar.f7.y(v8Var, drawable2, org.telegram.ui.ActionBar.y6.f23483k7, null, mode);
                        org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        v8Var.p(LocaleController.getString(i14), arVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                i9Var.setFixedSize(0);
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23316b7, context, i9Var, null);
                if (i10 == mv0Var.f41686k0) {
                    i9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == mv0Var.f41701w0) {
                    i9Var.setFixedSize(12);
                    i9Var.setText(null);
                    return;
                } else {
                    int i18 = mv0Var.f41688n - mv0Var.f41704y;
                    if (i18 <= 0) {
                        if (z10) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        i9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z10) {
                        i9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i18));
                        return;
                    } else {
                        i9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setEnabled(!mv0Var.I);
            Switch checkBox = a9Var.getCheckBox();
            if (!mv0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == mv0Var.f41698u0) {
                a9Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), mv0Var.H, true);
                a9Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f41699v0) {
                a9Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), mv0Var.J, false);
                a9Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f41694r0) {
                String string = LocaleController.getString(R.string.PollAnonymous);
                boolean z13 = mv0Var.G;
                if (mv0Var.f41696s0 != -1 || mv0Var.f41697t0 != -1) {
                    z12 = true;
                }
                a9Var.f(string, z13, z12);
                a9Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f41696s0) {
                String string2 = LocaleController.getString(R.string.PollMultiple);
                boolean z14 = mv0Var.K;
                if (mv0Var.f41697t0 != -1) {
                    z12 = true;
                }
                a9Var.f(string2, z14, z12);
                a9Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f41697t0) {
                a9Var.f(LocaleController.getString(R.string.PollQuiz), mv0Var.L, false);
                if (i15 != 0) {
                    z11 = false;
                }
                a9Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
        if (i10 == mv0Var.f41683h0) {
            if (z10) {
                if (mv0Var.f41706z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            q4Var.setText(LocaleController.getString(i12));
        } else if (i10 == mv0Var.m0) {
            if (i15 == 1) {
                q4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            }
            if (z10) {
                i11 = R.string.TodoItemsTitle;
            } else {
                i11 = R.string.AnswerOptions2;
            }
            q4Var.setText(LocaleController.getString(i11));
        } else if (i10 == mv0Var.f41692q0) {
            q4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        jv0 jv0Var;
        mv0 mv0Var = this.d;
        boolean z10 = mv0Var.f41677c0;
        if (i10 != 0) {
            Context context = this.f41072c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    jv0 jv0Var2 = new jv0(this, context, z10 ? 1 : 0, new x50(mv0Var, 23));
                                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, jv0Var2, null);
                                    jv0Var2.b(new org.telegram.ui.Components.bo(6, this, jv0Var2));
                                    jv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = jv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new yd(3, this, jv0Var2));
                                    textView.setOnKeyListener(new ng(jv0Var2, 2));
                                    jv0Var = jv0Var2;
                                } else {
                                    iv0 iv0Var = new iv0(this, context, z10 ? 1 : 0);
                                    iv0Var.c();
                                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, iv0Var, null);
                                    iv0Var.b(new org.telegram.ui.Components.bo(5, this, iv0Var));
                                    jv0Var = iv0Var;
                                }
                            } else {
                                View a9Var = new org.telegram.ui.Cells.a9(context);
                                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, a9Var, null);
                                jv0Var = a9Var;
                            }
                        } else {
                            hv0 hv0Var = new hv0(this, context, z10 ? 1 : 0);
                            hv0Var.c();
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, hv0Var, null);
                            hv0Var.b(new org.telegram.ui.Components.bo(4, this, hv0Var));
                            jv0Var = hv0Var;
                        }
                    } else {
                        View v8Var = new org.telegram.ui.Cells.v8(context);
                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, v8Var, null);
                        jv0Var = v8Var;
                    }
                } else {
                    jv0Var = new org.telegram.ui.Cells.i9(context);
                }
            } else {
                jv0Var = new org.telegram.ui.Cells.f7(context, (d3) null);
            }
        } else {
            View q4Var = new org.telegram.ui.Cells.q4(this.f41072c, org.telegram.ui.ActionBar.y6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23354d6, q4Var, null);
            jv0Var = q4Var;
        }
        return ic.a.n(jv0Var, jv0Var, -1, -2);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        mv0 mv0Var = this.d;
        boolean z11 = mv0Var.f41678d0;
        int i13 = e1Var.f47738f;
        View view = e1Var.f47735a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            h6Var.setTag(1);
            org.telegram.ui.Cells.g6 g6Var = h6Var.d;
            CharSequence charSequence2 = mv0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            h6Var.n(charSequence, LocaleController.getString(i12), false);
            h6Var.setTag(null);
            h6Var.setEnabled(!mv0Var.I);
            g6Var.setEnabled(true ^ mv0Var.I);
            int i14 = org.telegram.ui.ActionBar.y6.G6;
            if (!mv0Var.I) {
                f7 = 1.0f;
            }
            org.telegram.ui.ActionBar.f7.W(g6Var, org.telegram.ui.ActionBar.f7.L(f7, i14), mv0Var.getResourceProvider());
            mv0.d0(mv0Var, view, e1Var.b());
        } else if (i13 == 5) {
            int b10 = e1Var.b();
            org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
            h6Var2.setTag(1);
            org.telegram.ui.Cells.g6 g6Var2 = h6Var2.d;
            int i15 = b10 - mv0Var.f41689n0;
            if (mv0Var.I && i15 < mv0Var.f41702x) {
                z10 = false;
            } else {
                z10 = true;
            }
            g6Var2.setEnabled(z10);
            int i16 = org.telegram.ui.ActionBar.y6.G6;
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.ui.ActionBar.f7.W(g6Var2, org.telegram.ui.ActionBar.f7.L(f7, i16), mv0Var.getResourceProvider());
            CharSequence charSequence3 = mv0Var.v[i15];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            h6Var2.n(charSequence3, LocaleController.getString(i10), true);
            h6Var2.setTag(null);
            ImageView imageView = h6Var2.f24198f;
            if (imageView != null) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = h6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f10 = 0.45f;
                }
                imageView2.setAlpha(f10);
            }
            if (!mv0Var.f41681f0 && mv0Var.f41682g0 == b10) {
                EditTextBoldCursor textView = h6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                mv0Var.f41681f0 = false;
                mv0Var.f41682g0 = -1;
            }
            mv0.d0(mv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.h6 h6Var3 = (org.telegram.ui.Cells.h6) view;
            h6Var3.setTag(1);
            CharSequence charSequence4 = mv0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            h6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            h6Var3.setTag(null);
            mv0.d0(mv0Var, view, e1Var.b());
        }
    }

    @Override
    public final void z(s4.e1 e1Var) {
        int i10 = e1Var.f47738f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.h6) e1Var.f47735a).getTextView();
            if (textView.isFocused()) {
                mv0 mv0Var = this.d;
                if (mv0Var.f41677c0) {
                    org.telegram.ui.Components.tz0 tz0Var = mv0Var.Q;
                    if (tz0Var != null) {
                        tz0Var.f();
                    }
                    mv0Var.l0(true);
                }
                mv0Var.f41675b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

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
public final class mv0 extends org.telegram.ui.Components.mm0 {
    public final Context f41573c;
    public final ov0 d;

    public mv0(ov0 ov0Var, Context context) {
        this.d = ov0Var;
        this.f41573c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10;
        int b10 = e1Var.b();
        ov0 ov0Var = this.d;
        if (b10 != ov0Var.f42219i0 && b10 != ov0Var.f42233u0 && b10 != ov0Var.f42234v0) {
            if (ov0Var.I && b10 >= (i10 = ov0Var.f42224n0) && b10 < ov0Var.f42239y + i10) {
                if (b10 - i10 < ov0Var.f42237x) {
                    return false;
                }
            } else if (b10 != ov0Var.f42225o0 && b10 != ov0Var.f42229r0 && b10 != ov0Var.f42231s0 && (ov0Var.N != 0 || b10 != ov0Var.f42232t0)) {
                return false;
            }
            return true;
        }
        return !ov0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f42238x0;
    }

    @Override
    public final int j(int i10) {
        ov0 ov0Var = this.d;
        if (i10 != ov0Var.f42218h0 && i10 != ov0Var.m0 && i10 != ov0Var.f42227q0) {
            if (i10 == ov0Var.f42222l0) {
                return 1;
            }
            if (i10 != ov0Var.f42226p0 && i10 != ov0Var.f42236w0 && i10 != ov0Var.f42221k0) {
                if (i10 == ov0Var.f42225o0) {
                    return 3;
                }
                if (i10 == ov0Var.f42219i0) {
                    return 4;
                }
                if (i10 == ov0Var.f42220j0) {
                    return 7;
                }
                if (i10 != ov0Var.f42229r0 && i10 != ov0Var.f42231s0 && i10 != ov0Var.f42232t0 && i10 != ov0Var.f42233u0 && i10 != ov0Var.f42234v0) {
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
        ov0 ov0Var = this.d;
        int i15 = ov0Var.N;
        boolean z10 = ov0Var.f42213d0;
        int i16 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f41573c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                        v8Var.g(-1, org.telegram.ui.ActionBar.y6.f23598q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int i17 = org.telegram.ui.ActionBar.y6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.f7.y(v8Var, drawable, i17, null, mode);
                        org.telegram.ui.ActionBar.f7.y(v8Var, drawable2, org.telegram.ui.ActionBar.y6.f23486k7, null, mode);
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
                org.telegram.ui.ActionBar.f7.a0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23319b7, context, i9Var, null);
                if (i10 == ov0Var.f42221k0) {
                    i9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == ov0Var.f42236w0) {
                    i9Var.setFixedSize(12);
                    i9Var.setText(null);
                    return;
                } else {
                    int i18 = ov0Var.f42223n - ov0Var.f42239y;
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
            a9Var.setEnabled(!ov0Var.I);
            Switch checkBox = a9Var.getCheckBox();
            if (!ov0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == ov0Var.f42233u0) {
                a9Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), ov0Var.H, true);
                a9Var.e(null, true);
                return;
            } else if (i10 == ov0Var.f42234v0) {
                a9Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), ov0Var.J, false);
                a9Var.e(null, true);
                return;
            } else if (i10 == ov0Var.f42229r0) {
                String string = LocaleController.getString(R.string.PollAnonymous);
                boolean z13 = ov0Var.G;
                if (ov0Var.f42231s0 != -1 || ov0Var.f42232t0 != -1) {
                    z12 = true;
                }
                a9Var.f(string, z13, z12);
                a9Var.e(null, true);
                return;
            } else if (i10 == ov0Var.f42231s0) {
                String string2 = LocaleController.getString(R.string.PollMultiple);
                boolean z14 = ov0Var.K;
                if (ov0Var.f42232t0 != -1) {
                    z12 = true;
                }
                a9Var.f(string2, z14, z12);
                a9Var.e(null, true);
                return;
            } else if (i10 == ov0Var.f42232t0) {
                a9Var.f(LocaleController.getString(R.string.PollQuiz), ov0Var.L, false);
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
        if (i10 == ov0Var.f42218h0) {
            if (z10) {
                if (ov0Var.f42241z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            q4Var.setText(LocaleController.getString(i12));
        } else if (i10 == ov0Var.m0) {
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
        } else if (i10 == ov0Var.f42227q0) {
            q4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        lv0 lv0Var;
        ov0 ov0Var = this.d;
        boolean z10 = ov0Var.f42212c0;
        if (i10 != 0) {
            Context context = this.f41573c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    lv0 lv0Var2 = new lv0(this, context, z10 ? 1 : 0, new z50(ov0Var, 23));
                                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, lv0Var2, null);
                                    lv0Var2.b(new org.telegram.ui.Components.bo(6, this, lv0Var2));
                                    lv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = lv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new yd(3, this, lv0Var2));
                                    textView.setOnKeyListener(new mg(lv0Var2, 2));
                                    lv0Var = lv0Var2;
                                } else {
                                    kv0 kv0Var = new kv0(this, context, z10 ? 1 : 0);
                                    kv0Var.c();
                                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, kv0Var, null);
                                    kv0Var.b(new org.telegram.ui.Components.bo(5, this, kv0Var));
                                    lv0Var = kv0Var;
                                }
                            } else {
                                View a9Var = new org.telegram.ui.Cells.a9(context);
                                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, a9Var, null);
                                lv0Var = a9Var;
                            }
                        } else {
                            jv0 jv0Var = new jv0(this, context, z10 ? 1 : 0);
                            jv0Var.c();
                            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, jv0Var, null);
                            jv0Var.b(new org.telegram.ui.Components.bo(4, this, jv0Var));
                            lv0Var = jv0Var;
                        }
                    } else {
                        View v8Var = new org.telegram.ui.Cells.v8(context);
                        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, v8Var, null);
                        lv0Var = v8Var;
                    }
                } else {
                    lv0Var = new org.telegram.ui.Cells.i9(context);
                }
            } else {
                lv0Var = new org.telegram.ui.Cells.f7(context, (d3) null);
            }
        } else {
            View q4Var = new org.telegram.ui.Cells.q4(this.f41573c, org.telegram.ui.ActionBar.y6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, q4Var, null);
            lv0Var = q4Var;
        }
        return ic.a.n(lv0Var, lv0Var, -1, -2);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        ov0 ov0Var = this.d;
        boolean z11 = ov0Var.f42213d0;
        int i13 = e1Var.f47776f;
        View view = e1Var.f47773a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            h6Var.setTag(1);
            org.telegram.ui.Cells.g6 g6Var = h6Var.d;
            CharSequence charSequence2 = ov0Var.E;
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
            h6Var.setEnabled(!ov0Var.I);
            g6Var.setEnabled(true ^ ov0Var.I);
            int i14 = org.telegram.ui.ActionBar.y6.G6;
            if (!ov0Var.I) {
                f7 = 1.0f;
            }
            org.telegram.ui.ActionBar.f7.W(g6Var, org.telegram.ui.ActionBar.f7.L(f7, i14), ov0Var.getResourceProvider());
            ov0.d0(ov0Var, view, e1Var.b());
        } else if (i13 == 5) {
            int b10 = e1Var.b();
            org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
            h6Var2.setTag(1);
            org.telegram.ui.Cells.g6 g6Var2 = h6Var2.d;
            int i15 = b10 - ov0Var.f42224n0;
            if (ov0Var.I && i15 < ov0Var.f42237x) {
                z10 = false;
            } else {
                z10 = true;
            }
            g6Var2.setEnabled(z10);
            int i16 = org.telegram.ui.ActionBar.y6.G6;
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.ui.ActionBar.f7.W(g6Var2, org.telegram.ui.ActionBar.f7.L(f7, i16), ov0Var.getResourceProvider());
            CharSequence charSequence3 = ov0Var.v[i15];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            h6Var2.n(charSequence3, LocaleController.getString(i10), true);
            h6Var2.setTag(null);
            ImageView imageView = h6Var2.f24202f;
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
            if (!ov0Var.f42216f0 && ov0Var.f42217g0 == b10) {
                EditTextBoldCursor textView = h6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                ov0Var.f42216f0 = false;
                ov0Var.f42217g0 = -1;
            }
            ov0.d0(ov0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.h6 h6Var3 = (org.telegram.ui.Cells.h6) view;
            h6Var3.setTag(1);
            CharSequence charSequence4 = ov0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            h6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            h6Var3.setTag(null);
            ov0.d0(ov0Var, view, e1Var.b());
        }
    }

    @Override
    public final void z(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.h6) e1Var.f47773a).getTextView();
            if (textView.isFocused()) {
                ov0 ov0Var = this.d;
                if (ov0Var.f42212c0) {
                    org.telegram.ui.Components.uz0 uz0Var = ov0Var.Q;
                    if (uz0Var != null) {
                        uz0Var.f();
                    }
                    ov0Var.l0(true);
                }
                ov0Var.f42210b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

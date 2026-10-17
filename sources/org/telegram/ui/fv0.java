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
public final class fv0 extends org.telegram.ui.Components.hm0 {
    public final Context f37045c;
    public final hv0 d;

    public fv0(hv0 hv0Var, Context context) {
        this.d = hv0Var;
        this.f37045c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        hv0 hv0Var = this.d;
        if (b10 != hv0Var.f37660i0 && b10 != hv0Var.f37674u0 && b10 != hv0Var.f37675v0) {
            if (hv0Var.I && b10 >= (i10 = hv0Var.f37665n0) && b10 < hv0Var.f37680y + i10) {
                if (b10 - i10 < hv0Var.f37678x) {
                    return false;
                }
            } else if (b10 != hv0Var.f37666o0 && b10 != hv0Var.f37670r0 && b10 != hv0Var.f37672s0 && (hv0Var.N != 0 || b10 != hv0Var.f37673t0)) {
                return false;
            }
            return true;
        }
        return !hv0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f37679x0;
    }

    @Override
    public final int j(int i10) {
        hv0 hv0Var = this.d;
        if (i10 != hv0Var.f37659h0 && i10 != hv0Var.m0 && i10 != hv0Var.f37668q0) {
            if (i10 == hv0Var.f37663l0) {
                return 1;
            }
            if (i10 != hv0Var.f37667p0 && i10 != hv0Var.f37677w0 && i10 != hv0Var.f37662k0) {
                if (i10 == hv0Var.f37666o0) {
                    return 3;
                }
                if (i10 == hv0Var.f37660i0) {
                    return 4;
                }
                if (i10 == hv0Var.f37661j0) {
                    return 7;
                }
                if (i10 != hv0Var.f37670r0 && i10 != hv0Var.f37672s0 && i10 != hv0Var.f37673t0 && i10 != hv0Var.f37674u0 && i10 != hv0Var.f37675v0) {
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
        hv0 hv0Var = this.d;
        int i15 = hv0Var.N;
        boolean z10 = hv0Var.f37654d0;
        int i16 = b1Var.f45941f;
        View view = b1Var.f45938a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f37045c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                        q8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21114k7, false), mode));
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
                d9Var.setBackground(org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20948b7));
                if (i10 == hv0Var.f37662k0) {
                    d9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == hv0Var.f37677w0) {
                    d9Var.setFixedSize(12);
                    d9Var.setText(null);
                    return;
                } else {
                    int i17 = hv0Var.f37664n - hv0Var.f37680y;
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
            v8Var.setEnabled(!hv0Var.I);
            Switch checkBox = v8Var.getCheckBox();
            if (!hv0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == hv0Var.f37674u0) {
                v8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), hv0Var.H, true);
                v8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f37675v0) {
                v8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), hv0Var.J, false);
                v8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f37670r0) {
                String string = LocaleController.getString(R.string.PollAnonymous);
                boolean z13 = hv0Var.G;
                if (hv0Var.f37672s0 != -1 || hv0Var.f37673t0 != -1) {
                    z12 = true;
                }
                v8Var.f(string, z13, z12);
                v8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f37672s0) {
                String string2 = LocaleController.getString(R.string.PollMultiple);
                boolean z14 = hv0Var.K;
                if (hv0Var.f37673t0 != -1) {
                    z12 = true;
                }
                v8Var.f(string2, z14, z12);
                v8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f37673t0) {
                v8Var.f(LocaleController.getString(R.string.PollQuiz), hv0Var.L, false);
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
        if (i10 == hv0Var.f37659h0) {
            if (z10) {
                if (hv0Var.f37682z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            l4Var.setText(LocaleController.getString(i12));
        } else if (i10 == hv0Var.m0) {
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
        } else if (i10 == hv0Var.f37668q0) {
            l4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ev0 ev0Var;
        hv0 hv0Var = this.d;
        boolean z10 = hv0Var.f37653c0;
        if (i10 != 0) {
            Context context = this.f37045c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ev0 ev0Var2 = new ev0(this, context, z10 ? 1 : 0, new y50(hv0Var, 20));
                                    ev0Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                                    ev0Var2.c(new org.telegram.ui.Components.ao(6, this, ev0Var2));
                                    ev0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = ev0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new yd(3, this, ev0Var2));
                                    textView.setOnKeyListener(new ng(ev0Var2, 2));
                                    ev0Var = ev0Var2;
                                } else {
                                    dv0 dv0Var = new dv0(this, context, z10 ? 1 : 0);
                                    dv0Var.d();
                                    dv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                                    dv0Var.c(new org.telegram.ui.Components.ao(5, this, dv0Var));
                                    ev0Var = dv0Var;
                                }
                            } else {
                                View v8Var = new org.telegram.ui.Cells.v8(context);
                                v8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                                ev0Var = v8Var;
                            }
                        } else {
                            cv0 cv0Var = new cv0(this, context, z10 ? 1 : 0);
                            cv0Var.d();
                            cv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                            cv0Var.c(new org.telegram.ui.Components.ao(4, this, cv0Var));
                            ev0Var = cv0Var;
                        }
                    } else {
                        View q8Var = new org.telegram.ui.Cells.q8(context);
                        q8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
                        ev0Var = q8Var;
                    }
                } else {
                    ev0Var = new org.telegram.ui.Cells.d9(context);
                }
            } else {
                ev0Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.t0) null);
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.f37045c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, null);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false));
            ev0Var = l4Var;
        }
        return com.google.android.gms.internal.cast.a6.l(ev0Var, ev0Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        hv0 hv0Var = this.d;
        boolean z11 = hv0Var.f37654d0;
        int i13 = b1Var.f45941f;
        View view = b1Var.f45938a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            org.telegram.ui.Cells.b6 b6Var = c6Var.d;
            CharSequence charSequence2 = hv0Var.E;
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
            c6Var.setEnabled(!hv0Var.I);
            b6Var.setEnabled(true ^ hv0Var.I);
            int themedColor = hv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
            if (!hv0Var.I) {
                f7 = 1.0f;
            }
            b6Var.setTextColor(org.telegram.ui.ActionBar.h6.m1(f7, themedColor));
            hv0.c0(hv0Var, view, b1Var.b());
        } else if (i13 == 5) {
            int b10 = b1Var.b();
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            org.telegram.ui.Cells.b6 b6Var2 = c6Var2.d;
            int i14 = b10 - hv0Var.f37665n0;
            if (hv0Var.I && i14 < hv0Var.f37678x) {
                z10 = false;
            } else {
                z10 = true;
            }
            b6Var2.setEnabled(z10);
            int themedColor2 = hv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            b6Var2.setTextColor(org.telegram.ui.ActionBar.h6.m1(f7, themedColor2));
            CharSequence charSequence3 = hv0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var2.n(charSequence3, LocaleController.getString(i10), true);
            c6Var2.setTag(null);
            ImageView imageView = c6Var2.f22093f;
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
            if (!hv0Var.f37657f0 && hv0Var.f37658g0 == b10) {
                EditTextBoldCursor textView = c6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                hv0Var.f37657f0 = false;
                hv0Var.f37658g0 = -1;
            }
            hv0.c0(hv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            CharSequence charSequence4 = hv0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            c6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var3.setTag(null);
            hv0.c0(hv0Var, view, b1Var.b());
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f45941f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) b1Var.f45938a).getTextView();
            if (textView.isFocused()) {
                hv0 hv0Var = this.d;
                if (hv0Var.f37653c0) {
                    org.telegram.ui.Components.gz0 gz0Var = hv0Var.Q;
                    if (gz0Var != null) {
                        gz0Var.f();
                    }
                    hv0Var.k0(true);
                }
                hv0Var.f37651b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

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
public final class aw0 extends org.telegram.ui.Components.ll0 {
    public final Context f31999c;
    public final cw0 d;

    public aw0(cw0 cw0Var, Context context) {
        this.d = cw0Var;
        this.f31999c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        cw0 cw0Var = this.d;
        if (b10 != cw0Var.f32946i0 && b10 != cw0Var.f32960u0 && b10 != cw0Var.f32961v0) {
            if (cw0Var.I && b10 >= (i10 = cw0Var.f32951n0) && b10 < cw0Var.f32966y + i10) {
                if (b10 - i10 < cw0Var.f32964x) {
                    return false;
                }
            } else if (b10 != cw0Var.f32952o0 && b10 != cw0Var.f32956r0 && b10 != cw0Var.f32958s0 && (cw0Var.N != 0 || b10 != cw0Var.f32959t0)) {
                return false;
            }
            return true;
        }
        return !cw0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f32965x0;
    }

    @Override
    public final int j(int i10) {
        cw0 cw0Var = this.d;
        if (i10 != cw0Var.f32945h0 && i10 != cw0Var.m0 && i10 != cw0Var.f32954q0) {
            if (i10 == cw0Var.f32949l0) {
                return 1;
            }
            if (i10 != cw0Var.f32953p0 && i10 != cw0Var.f32963w0 && i10 != cw0Var.f32948k0) {
                if (i10 == cw0Var.f32952o0) {
                    return 3;
                }
                if (i10 == cw0Var.f32946i0) {
                    return 4;
                }
                if (i10 == cw0Var.f32947j0) {
                    return 7;
                }
                if (i10 != cw0Var.f32956r0 && i10 != cw0Var.f32958s0 && i10 != cw0Var.f32959t0 && i10 != cw0Var.f32960u0 && i10 != cw0Var.f32961v0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        cw0 cw0Var = this.d;
        int i15 = cw0Var.N;
        boolean z10 = cw0Var.f32940d0;
        int i16 = c1Var.f42705f;
        View view = c1Var.f42702a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f31999c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        r8Var.e(-1, org.telegram.ui.ActionBar.j6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18992k7, false), mode));
                        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), pqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f18827b7));
                if (i10 == cw0Var.f32948k0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == cw0Var.f32963w0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i17 = cw0Var.f32950n - cw0Var.f32966y;
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
            if (i10 == cw0Var.f32960u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), cw0Var.H, true);
                w8Var.e(null, true);
                return;
            } else if (i10 == cw0Var.f32961v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), cw0Var.J, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == cw0Var.f32956r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), cw0Var.G, (cw0Var.f32958s0 == -1 && cw0Var.f32959t0 == -1) ? true : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == cw0Var.f32958s0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z13 = cw0Var.K;
                if (cw0Var.f32959t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string, z13, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == cw0Var.f32959t0) {
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
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == cw0Var.f32945h0) {
            if (z10) {
                if (cw0Var.f32968z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            l4Var.setText(LocaleController.getString(i12));
        } else if (i10 == cw0Var.m0) {
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
        } else if (i10 == cw0Var.f32954q0) {
            l4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        zv0 zv0Var;
        cw0 cw0Var = this.d;
        boolean z10 = cw0Var.f32939c0;
        if (i10 != 0) {
            Context context = this.f31999c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    zv0 zv0Var2 = new zv0(this, context, z10 ? 1 : 0, new m60(cw0Var, 21));
                                    zv0Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                                    zv0Var2.c(new org.telegram.ui.Components.qn(6, this, zv0Var2));
                                    zv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = zv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new xd(3, this, zv0Var2));
                                    textView.setOnKeyListener(new xg(zv0Var2, 2));
                                    zv0Var = zv0Var2;
                                } else {
                                    yv0 yv0Var = new yv0(this, context, z10 ? 1 : 0);
                                    yv0Var.d();
                                    yv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                                    yv0Var.c(new org.telegram.ui.Components.qn(5, this, yv0Var));
                                    zv0Var = yv0Var;
                                }
                            } else {
                                View w8Var = new org.telegram.ui.Cells.w8(context);
                                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                                zv0Var = w8Var;
                            }
                        } else {
                            xv0 xv0Var = new xv0(this, context, z10 ? 1 : 0);
                            xv0Var.d();
                            xv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                            xv0Var.c(new org.telegram.ui.Components.qn(4, this, xv0Var));
                            zv0Var = xv0Var;
                        }
                    } else {
                        View r8Var = new org.telegram.ui.Cells.r8(context);
                        r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
                        zv0Var = r8Var;
                    }
                } else {
                    zv0Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                zv0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.f31999c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
            zv0Var = l4Var;
        }
        return com.google.android.gms.internal.vision.e2.k(zv0Var, zv0Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        cw0 cw0Var = this.d;
        boolean z11 = cw0Var.f32940d0;
        int i13 = c1Var.f42705f;
        View view = c1Var.f42702a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            org.telegram.ui.Cells.b6 b6Var = c6Var.d;
            CharSequence charSequence2 = cw0Var.E;
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
            c6Var.setEnabled(!cw0Var.I);
            b6Var.setEnabled(true ^ cw0Var.I);
            int themedColor = cw0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
            if (!cw0Var.I) {
                f7 = 1.0f;
            }
            b6Var.setTextColor(org.telegram.ui.ActionBar.j6.l1(f7, themedColor));
            cw0.c0(cw0Var, view, c1Var.b());
        } else if (i13 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            org.telegram.ui.Cells.b6 b6Var2 = c6Var2.d;
            int i14 = b10 - cw0Var.f32951n0;
            if (cw0Var.I && i14 < cw0Var.f32964x) {
                z10 = false;
            } else {
                z10 = true;
            }
            b6Var2.setEnabled(z10);
            int themedColor2 = cw0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            b6Var2.setTextColor(org.telegram.ui.ActionBar.j6.l1(f7, themedColor2));
            CharSequence charSequence3 = cw0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var2.n(charSequence3, LocaleController.getString(i10), true);
            c6Var2.setTag(null);
            ImageView imageView = c6Var2.f19874f;
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
            if (!cw0Var.f32943f0 && cw0Var.f32944g0 == b10) {
                EditTextBoldCursor textView = c6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                cw0Var.f32943f0 = false;
                cw0Var.f32944g0 = -1;
            }
            cw0.c0(cw0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            CharSequence charSequence4 = cw0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            c6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var3.setTag(null);
            cw0.c0(cw0Var, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f42705f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) c1Var.f42702a).getTextView();
            if (textView.isFocused()) {
                cw0 cw0Var = this.d;
                if (cw0Var.f32939c0) {
                    org.telegram.ui.Components.oy0 oy0Var = cw0Var.Q;
                    if (oy0Var != null) {
                        oy0Var.f();
                    }
                    cw0Var.k0(true);
                }
                cw0Var.f32937b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

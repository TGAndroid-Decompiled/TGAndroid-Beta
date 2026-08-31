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
public final class fv0 extends org.telegram.ui.Components.sl0 {
    public final Context f37024c;
    public final hv0 d;

    public fv0(hv0 hv0Var, Context context) {
        this.d = hv0Var;
        this.f37024c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10;
        int b10 = m1Var.b();
        hv0 hv0Var = this.d;
        if (b10 != hv0Var.f37650f0 && b10 != hv0Var.f37663r0 && b10 != hv0Var.f37665s0) {
            if (hv0Var.F && b10 >= (i10 = hv0Var.f37655k0) && b10 < hv0Var.f37673y + i10) {
                if (b10 - i10 < hv0Var.f37671x) {
                    return false;
                }
            } else if (b10 != hv0Var.f37656l0 && b10 != hv0Var.f37659o0 && b10 != hv0Var.f37660p0 && (hv0Var.K != 0 || b10 != hv0Var.f37661q0)) {
                return false;
            }
            return true;
        }
        return !hv0Var.F;
    }

    @Override
    public final int h() {
        return this.d.f37667u0;
    }

    @Override
    public final int j(int i10) {
        hv0 hv0Var = this.d;
        if (i10 != hv0Var.f37648e0 && i10 != hv0Var.f37654j0 && i10 != hv0Var.f37658n0) {
            if (i10 == hv0Var.f37653i0) {
                return 1;
            }
            if (i10 != hv0Var.m0 && i10 != hv0Var.f37666t0 && i10 != hv0Var.f37652h0) {
                if (i10 == hv0Var.f37656l0) {
                    return 3;
                }
                if (i10 == hv0Var.f37650f0) {
                    return 4;
                }
                if (i10 == hv0Var.f37651g0) {
                    return 7;
                }
                if (i10 != hv0Var.f37659o0 && i10 != hv0Var.f37660p0 && i10 != hv0Var.f37661q0 && i10 != hv0Var.f37663r0 && i10 != hv0Var.f37665s0) {
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
        hv0 hv0Var = this.d;
        int i15 = hv0Var.K;
        boolean z4 = hv0Var.f37641a0;
        int i16 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z10 = true;
        if (i16 != 0) {
            boolean z11 = false;
            if (i16 != 6) {
                Context context = this.f37024c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                        o8Var.e(-1, org.telegram.ui.ActionBar.k6.f21894q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21786k7, false), mode));
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
                a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
                if (i10 == hv0Var.f37652h0) {
                    a9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == hv0Var.f37666t0) {
                    a9Var.setFixedSize(12);
                    a9Var.setText(null);
                    return;
                } else {
                    int i17 = hv0Var.f37657n - hv0Var.f37673y;
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
            s8Var.setEnabled(!hv0Var.F);
            Switch checkBox = s8Var.getCheckBox();
            if (!hv0Var.F) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i10 == hv0Var.f37663r0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), hv0Var.E, true);
                s8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f37665s0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), hv0Var.G, false);
                s8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f37659o0) {
                s8Var.f(LocaleController.getString(R.string.PollAnonymous), hv0Var.D, (hv0Var.f37660p0 == -1 && hv0Var.f37661q0 == -1) ? true : true);
                s8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f37660p0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z12 = hv0Var.H;
                if (hv0Var.f37661q0 != -1) {
                    z11 = true;
                }
                s8Var.f(string, z12, z11);
                s8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f37661q0) {
                s8Var.f(LocaleController.getString(R.string.PollQuiz), hv0Var.I, false);
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
        if (i10 == hv0Var.f37648e0) {
            if (z4) {
                if (hv0Var.f37670w0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == hv0Var.f37654j0) {
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
        } else if (i10 == hv0Var.f37658n0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ev0 ev0Var;
        hv0 hv0Var = this.d;
        boolean z4 = hv0Var.Z;
        if (i10 != 0) {
            Context context = this.f37024c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ev0 ev0Var2 = new ev0(this, context, z4 ? 1 : 0, new f60(hv0Var, 22));
                                    ev0Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                                    ev0Var2.c(new dg.b0(this, ev0Var2, false, 13));
                                    ev0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = ev0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new yd(3, this, ev0Var2));
                                    textView.setOnKeyListener(new og(ev0Var2, 2));
                                    ev0Var = ev0Var2;
                                } else {
                                    dv0 dv0Var = new dv0(this, context, z4 ? 1 : 0);
                                    dv0Var.d();
                                    dv0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                                    dv0Var.c(new dg.b0(this, dv0Var, false, 12));
                                    ev0Var = dv0Var;
                                }
                            } else {
                                View s8Var = new org.telegram.ui.Cells.s8(context);
                                s8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                                ev0Var = s8Var;
                            }
                        } else {
                            cv0 cv0Var = new cv0(this, context, z4 ? 1 : 0);
                            cv0Var.d();
                            cv0Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                            cv0Var.c(new dg.b0(this, cv0Var, false, 11));
                            ev0Var = cv0Var;
                        }
                    } else {
                        View o8Var = new org.telegram.ui.Cells.o8(context);
                        o8Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
                        ev0Var = o8Var;
                    }
                } else {
                    ev0Var = new org.telegram.ui.Cells.a9(context);
                }
            } else {
                ev0Var = new org.telegram.ui.Cells.z6(context, (b) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f37024c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false));
            ev0Var = m4Var;
        }
        return yh.o(ev0Var, ev0Var, -1, -2);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        hv0 hv0Var = this.d;
        boolean z10 = hv0Var.f37641a0;
        int i13 = m1Var.f5879f;
        View view = m1Var.f5875a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            eh.b bVar = c6Var.d;
            CharSequence charSequence2 = hv0Var.B;
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
            c6Var.setEnabled(!hv0Var.F);
            bVar.setEnabled(true ^ hv0Var.F);
            int themedColor = hv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            if (!hv0Var.F) {
                f10 = 1.0f;
            }
            bVar.setTextColor(org.telegram.ui.ActionBar.k6.l1(f10, themedColor));
            hv0.c0(hv0Var, view, m1Var.b());
        } else if (i13 == 5) {
            int b10 = m1Var.b();
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            eh.b bVar2 = c6Var2.d;
            int i14 = b10 - hv0Var.f37655k0;
            if (hv0Var.F && i14 < hv0Var.f37671x) {
                z4 = false;
            } else {
                z4 = true;
            }
            bVar2.setEnabled(z4);
            int themedColor2 = hv0Var.getThemedColor(org.telegram.ui.ActionBar.k6.G6);
            if (z4) {
                f10 = 1.0f;
            }
            bVar2.setTextColor(org.telegram.ui.ActionBar.k6.l1(f10, themedColor2));
            CharSequence charSequence3 = hv0Var.v[i14];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var2.n(charSequence3, LocaleController.getString(i10), true);
            c6Var2.setTag(null);
            ImageView imageView = c6Var2.f22651f;
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
            if (!hv0Var.f37645c0 && hv0Var.f37646d0 == b10) {
                EditTextBoldCursor textView = c6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                hv0Var.f37645c0 = false;
                hv0Var.f37646d0 = -1;
            }
            hv0.c0(hv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            CharSequence charSequence4 = hv0Var.C;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            c6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var3.setTag(null);
            hv0.c0(hv0Var, view, m1Var.b());
        }
    }

    @Override
    public final void z(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) m1Var.f5875a).getTextView();
            if (textView.isFocused()) {
                hv0 hv0Var = this.d;
                if (hv0Var.Z) {
                    org.telegram.ui.Components.ry0 ry0Var = hv0Var.N;
                    if (ry0Var != null) {
                        ry0Var.f();
                    }
                    hv0Var.k0(true);
                }
                hv0Var.Y = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

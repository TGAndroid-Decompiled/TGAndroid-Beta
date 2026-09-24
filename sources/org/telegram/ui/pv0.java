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
public final class pv0 extends org.telegram.ui.Components.vl0 {
    public final Context f36669c;
    public final rv0 d;

    public pv0(rv0 rv0Var, Context context) {
        this.d = rv0Var;
        this.f36669c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int b10 = c1Var.b();
        rv0 rv0Var = this.d;
        if (b10 != rv0Var.f37493i0 && b10 != rv0Var.f37507u0 && b10 != rv0Var.f37508v0) {
            if (rv0Var.I && b10 >= (i10 = rv0Var.f37498n0) && b10 < rv0Var.f37513y + i10) {
                if (b10 - i10 < rv0Var.f37511x) {
                    return false;
                }
            } else if (b10 != rv0Var.f37499o0 && b10 != rv0Var.f37503r0 && b10 != rv0Var.f37505s0 && (rv0Var.N != 0 || b10 != rv0Var.f37506t0)) {
                return false;
            }
            return true;
        }
        return !rv0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f37512x0;
    }

    @Override
    public final int j(int i10) {
        rv0 rv0Var = this.d;
        if (i10 != rv0Var.f37492h0 && i10 != rv0Var.m0 && i10 != rv0Var.f37501q0) {
            if (i10 == rv0Var.f37496l0) {
                return 1;
            }
            if (i10 != rv0Var.f37500p0 && i10 != rv0Var.f37510w0 && i10 != rv0Var.f37495k0) {
                if (i10 == rv0Var.f37499o0) {
                    return 3;
                }
                if (i10 == rv0Var.f37493i0) {
                    return 4;
                }
                if (i10 == rv0Var.f37494j0) {
                    return 7;
                }
                if (i10 != rv0Var.f37503r0 && i10 != rv0Var.f37505s0 && i10 != rv0Var.f37506t0 && i10 != rv0Var.f37507u0 && i10 != rv0Var.f37508v0) {
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
        rv0 rv0Var = this.d;
        int i15 = rv0Var.N;
        boolean z10 = rv0Var.f37487d0;
        int i16 = c1Var.f42949f;
        View view = c1Var.f42946a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f36669c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        r8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19173k7, false), mode));
                        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), qqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                e9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19009b7));
                if (i10 == rv0Var.f37495k0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == rv0Var.f37510w0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i17 = rv0Var.f37497n - rv0Var.f37513y;
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
            w8Var.setEnabled(!rv0Var.I);
            Switch checkBox = w8Var.getCheckBox();
            if (!rv0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == rv0Var.f37507u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), rv0Var.H, true);
                w8Var.e(null, true);
                return;
            } else if (i10 == rv0Var.f37508v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), rv0Var.J, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == rv0Var.f37503r0) {
                w8Var.f(LocaleController.getString(R.string.PollAnonymous), rv0Var.G, (rv0Var.f37505s0 == -1 && rv0Var.f37506t0 == -1) ? true : true);
                w8Var.e(null, true);
                return;
            } else if (i10 == rv0Var.f37505s0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z13 = rv0Var.K;
                if (rv0Var.f37506t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string, z13, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == rv0Var.f37506t0) {
                w8Var.f(LocaleController.getString(R.string.PollQuiz), rv0Var.L, false);
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
        if (i10 == rv0Var.f37492h0) {
            if (z10) {
                if (rv0Var.f37515z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == rv0Var.m0) {
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
        } else if (i10 == rv0Var.f37501q0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ov0 ov0Var;
        rv0 rv0Var = this.d;
        boolean z10 = rv0Var.f37486c0;
        if (i10 != 0) {
            Context context = this.f36669c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ov0 ov0Var2 = new ov0(this, context, z10 ? 1 : 0, new f60(rv0Var, 21));
                                    ov0Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                                    ov0Var2.c(new org.telegram.ui.Components.rn(6, this, ov0Var2));
                                    ov0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = ov0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new vd(3, this, ov0Var2));
                                    textView.setOnKeyListener(new sg(ov0Var2, 2));
                                    ov0Var = ov0Var2;
                                } else {
                                    nv0 nv0Var = new nv0(this, context, z10 ? 1 : 0);
                                    nv0Var.d();
                                    nv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                                    nv0Var.c(new org.telegram.ui.Components.rn(5, this, nv0Var));
                                    ov0Var = nv0Var;
                                }
                            } else {
                                View w8Var = new org.telegram.ui.Cells.w8(context);
                                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                                ov0Var = w8Var;
                            }
                        } else {
                            mv0 mv0Var = new mv0(this, context, z10 ? 1 : 0);
                            mv0Var.d();
                            mv0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                            mv0Var.c(new org.telegram.ui.Components.rn(4, this, mv0Var));
                            ov0Var = mv0Var;
                        }
                    } else {
                        View r8Var = new org.telegram.ui.Cells.r8(context);
                        r8Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
                        ov0Var = r8Var;
                    }
                } else {
                    ov0Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                ov0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f36669c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19045d6, false));
            ov0Var = m4Var;
        }
        return com.google.android.gms.internal.vision.e2.k(ov0Var, ov0Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        rv0 rv0Var = this.d;
        boolean z11 = rv0Var.f37487d0;
        int i13 = c1Var.f42949f;
        View view = c1Var.f42946a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence2 = rv0Var.E;
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
            d6Var.setEnabled(!rv0Var.I);
            c6Var.setEnabled(true ^ rv0Var.I);
            int themedColor = rv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
            if (!rv0Var.I) {
                f7 = 1.0f;
            }
            c6Var.setTextColor(org.telegram.ui.ActionBar.h6.l1(f7, themedColor));
            rv0.c0(rv0Var, view, c1Var.b());
        } else if (i13 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            org.telegram.ui.Cells.c6 c6Var2 = d6Var2.d;
            int i14 = b10 - rv0Var.f37498n0;
            if (rv0Var.I && i14 < rv0Var.f37511x) {
                z10 = false;
            } else {
                z10 = true;
            }
            c6Var2.setEnabled(z10);
            int themedColor2 = rv0Var.getThemedColor(org.telegram.ui.ActionBar.h6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            c6Var2.setTextColor(org.telegram.ui.ActionBar.h6.l1(f7, themedColor2));
            CharSequence charSequence3 = rv0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var2.n(charSequence3, LocaleController.getString(i10), true);
            d6Var2.setTag(null);
            ImageView imageView = d6Var2.f20123f;
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
            if (!rv0Var.f37490f0 && rv0Var.f37491g0 == b10) {
                EditTextBoldCursor textView = d6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                rv0Var.f37490f0 = false;
                rv0Var.f37491g0 = -1;
            }
            rv0.c0(rv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            CharSequence charSequence4 = rv0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            d6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var3.setTag(null);
            rv0.c0(rv0Var, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f42949f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.f42946a).getTextView();
            if (textView.isFocused()) {
                rv0 rv0Var = this.d;
                if (rv0Var.f37486c0) {
                    org.telegram.ui.Components.xy0 xy0Var = rv0Var.Q;
                    if (xy0Var != null) {
                        xy0Var.f();
                    }
                    rv0Var.k0(true);
                }
                rv0Var.f37484b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

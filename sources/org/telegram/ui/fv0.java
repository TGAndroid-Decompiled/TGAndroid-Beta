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
public final class fv0 extends org.telegram.ui.Components.km0 {
    public final Context f37386c;
    public final hv0 d;

    public fv0(hv0 hv0Var, Context context) {
        this.d = hv0Var;
        this.f37386c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        hv0 hv0Var = this.d;
        if (b10 != hv0Var.f38042i0 && b10 != hv0Var.f38056u0 && b10 != hv0Var.f38057v0) {
            if (hv0Var.I && b10 >= (i10 = hv0Var.f38047n0) && b10 < hv0Var.f38062y + i10) {
                if (b10 - i10 < hv0Var.f38060x) {
                    return false;
                }
            } else if (b10 != hv0Var.f38048o0 && b10 != hv0Var.f38052r0 && b10 != hv0Var.f38054s0 && (hv0Var.N != 0 || b10 != hv0Var.f38055t0)) {
                return false;
            }
            return true;
        }
        return !hv0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f38061x0;
    }

    @Override
    public final int j(int i10) {
        hv0 hv0Var = this.d;
        if (i10 != hv0Var.f38041h0 && i10 != hv0Var.m0 && i10 != hv0Var.f38050q0) {
            if (i10 == hv0Var.f38045l0) {
                return 1;
            }
            if (i10 != hv0Var.f38049p0 && i10 != hv0Var.f38059w0 && i10 != hv0Var.f38044k0) {
                if (i10 == hv0Var.f38048o0) {
                    return 3;
                }
                if (i10 == hv0Var.f38042i0) {
                    return 4;
                }
                if (i10 == hv0Var.f38043j0) {
                    return 7;
                }
                if (i10 != hv0Var.f38052r0 && i10 != hv0Var.f38054s0 && i10 != hv0Var.f38055t0 && i10 != hv0Var.f38056u0 && i10 != hv0Var.f38057v0) {
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
        boolean z10 = hv0Var.f38036d0;
        int i16 = b1Var.f46345f;
        View view = b1Var.f46342a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f37386c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        r8Var.g(-1, org.telegram.ui.ActionBar.k6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int i17 = org.telegram.ui.ActionBar.k6.N6;
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        org.telegram.ui.ActionBar.r6.z(r8Var, drawable, i17, null, mode);
                        org.telegram.ui.ActionBar.r6.z(r8Var, drawable2, org.telegram.ui.ActionBar.k6.f21312k7, null, mode);
                        org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.p(LocaleController.getString(i14), wqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                org.telegram.ui.ActionBar.r6.b0(R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7, context, e9Var, null);
                if (i10 == hv0Var.f38044k0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == hv0Var.f38059w0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = hv0Var.f38046n - hv0Var.f38062y;
                    if (i18 <= 0) {
                        if (z10) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        e9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z10) {
                        e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i18));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setEnabled(!hv0Var.I);
            Switch checkBox = w8Var.getCheckBox();
            if (!hv0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == hv0Var.f38056u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), hv0Var.H, true);
                w8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f38057v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), hv0Var.J, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f38052r0) {
                String string = LocaleController.getString(R.string.PollAnonymous);
                boolean z13 = hv0Var.G;
                if (hv0Var.f38054s0 != -1 || hv0Var.f38055t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string, z13, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f38054s0) {
                String string2 = LocaleController.getString(R.string.PollMultiple);
                boolean z14 = hv0Var.K;
                if (hv0Var.f38055t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string2, z14, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == hv0Var.f38055t0) {
                w8Var.f(LocaleController.getString(R.string.PollQuiz), hv0Var.L, false);
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
        if (i10 == hv0Var.f38041h0) {
            if (z10) {
                if (hv0Var.f38064z0 != null) {
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
        } else if (i10 == hv0Var.f38050q0) {
            l4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        ev0 ev0Var;
        hv0 hv0Var = this.d;
        boolean z10 = hv0Var.f38035c0;
        if (i10 != 0) {
            Context context = this.f37386c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    ev0 ev0Var2 = new ev0(this, context, z10 ? 1 : 0, new w50(hv0Var, 21));
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, ev0Var2, null);
                                    ev0Var2.b(new org.telegram.ui.Components.yn(6, this, ev0Var2));
                                    ev0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = ev0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new wd(3, this, ev0Var2));
                                    textView.setOnKeyListener(new lg(ev0Var2, 2));
                                    ev0Var = ev0Var2;
                                } else {
                                    dv0 dv0Var = new dv0(this, context, z10 ? 1 : 0);
                                    dv0Var.c();
                                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, dv0Var, null);
                                    dv0Var.b(new org.telegram.ui.Components.yn(5, this, dv0Var));
                                    ev0Var = dv0Var;
                                }
                            } else {
                                View w8Var = new org.telegram.ui.Cells.w8(context);
                                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, w8Var, null);
                                ev0Var = w8Var;
                            }
                        } else {
                            cv0 cv0Var = new cv0(this, context, z10 ? 1 : 0);
                            cv0Var.c();
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, cv0Var, null);
                            cv0Var.b(new org.telegram.ui.Components.yn(4, this, cv0Var));
                            ev0Var = cv0Var;
                        }
                    } else {
                        View r8Var = new org.telegram.ui.Cells.r8(context);
                        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, r8Var, null);
                        ev0Var = r8Var;
                    }
                } else {
                    ev0Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                ev0Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.f37386c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, l4Var, null);
            ev0Var = l4Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(ev0Var, ev0Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        hv0 hv0Var = this.d;
        boolean z11 = hv0Var.f38036d0;
        int i13 = b1Var.f46345f;
        View view = b1Var.f46342a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence2 = hv0Var.E;
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
            d6Var.setEnabled(!hv0Var.I);
            c6Var.setEnabled(true ^ hv0Var.I);
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            if (!hv0Var.I) {
                f7 = 1.0f;
            }
            org.telegram.ui.ActionBar.r6.X(c6Var, org.telegram.ui.ActionBar.r6.M(f7, i14), hv0Var.getResourceProvider());
            hv0.c0(hv0Var, view, b1Var.b());
        } else if (i13 == 5) {
            int b10 = b1Var.b();
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            org.telegram.ui.Cells.c6 c6Var2 = d6Var2.d;
            int i15 = b10 - hv0Var.f38047n0;
            if (hv0Var.I && i15 < hv0Var.f38060x) {
                z10 = false;
            } else {
                z10 = true;
            }
            c6Var2.setEnabled(z10);
            int i16 = org.telegram.ui.ActionBar.k6.G6;
            if (z10) {
                f7 = 1.0f;
            }
            org.telegram.ui.ActionBar.r6.X(c6Var2, org.telegram.ui.ActionBar.r6.M(f7, i16), hv0Var.getResourceProvider());
            CharSequence charSequence3 = hv0Var.v[i15];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var2.n(charSequence3, LocaleController.getString(i10), true);
            d6Var2.setTag(null);
            ImageView imageView = d6Var2.f22281f;
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
            if (!hv0Var.f38039f0 && hv0Var.f38040g0 == b10) {
                EditTextBoldCursor textView = d6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                hv0Var.f38039f0 = false;
                hv0Var.f38040g0 = -1;
            }
            hv0.c0(hv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            CharSequence charSequence4 = hv0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            d6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var3.setTag(null);
            hv0.c0(hv0Var, view, b1Var.b());
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.f46342a).getTextView();
            if (textView.isFocused()) {
                hv0 hv0Var = this.d;
                if (hv0Var.f38035c0) {
                    org.telegram.ui.Components.kz0 kz0Var = hv0Var.Q;
                    if (kz0Var != null) {
                        kz0Var.f();
                    }
                    hv0Var.k0(true);
                }
                hv0Var.f38033b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

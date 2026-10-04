package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vn extends yl0 {
    public final Context f31737c;
    public final xn d;

    public vn(xn xnVar, Context context) {
        this.d = xnVar;
        this.f31737c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        xn xnVar = this.d;
        if (b10 != xnVar.f32940u0 && b10 != xnVar.G0 && b10 != xnVar.B0 && b10 != xnVar.F0 && b10 != xnVar.C0 && b10 != xnVar.H0 && b10 != xnVar.D0 && b10 != xnVar.E0 && b10 != xnVar.I0 && b10 != xnVar.J0 && b10 != xnVar.N0.f3944b && b10 != xnVar.M0.f3944b && b10 != xnVar.L0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.Q0;
    }

    @Override
    public final int j(int i10) {
        xn xnVar = this.d;
        if (i10 != xnVar.B0 && i10 != xnVar.F0 && i10 != xnVar.G0 && i10 != xnVar.C0 && i10 != xnVar.D0 && i10 != xnVar.E0 && i10 != xnVar.H0 && i10 != xnVar.M0.f3944b && i10 != xnVar.N0.f3944b) {
            if (i10 != xnVar.f32929l0 && i10 != xnVar.f32938s0 && i10 != xnVar.f32943w0 && i10 != xnVar.f32932o0) {
                if (i10 == xnVar.f32936r0) {
                    return 1;
                }
                if (i10 != xnVar.f32941v0 && i10 != xnVar.f32945x0 && i10 != xnVar.f32934q0 && i10 != xnVar.K0) {
                    if (i10 != xnVar.f32940u0 && i10 != xnVar.I0 && i10 != xnVar.L0) {
                        if (i10 == xnVar.m0) {
                            return 4;
                        }
                        if (i10 == xnVar.f32931n0) {
                            return 11;
                        }
                        if (i10 == xnVar.f32933p0) {
                            return 7;
                        }
                        if (i10 != xnVar.f32947y0 && i10 != xnVar.f32948z0 && i10 != xnVar.J0) {
                            if (i10 == xnVar.A0) {
                                return 8;
                            }
                            if (i10 == 0) {
                                return 9;
                            }
                            return 5;
                        }
                        return 6;
                    }
                    return 3;
                }
                return 2;
            }
            return 0;
        }
        return 10;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatPluralString;
        boolean z10;
        boolean z11;
        xn xnVar = this.d;
        boolean z12 = xnVar.f32915e0;
        c2.a aVar = xnVar.M0;
        c2.a aVar2 = xnVar.N0;
        org.telegram.ui.ActionBar.d6 d6Var = xnVar.f29642a;
        boolean z13 = xnVar.f32930n;
        int i15 = c1Var.f46528f;
        View view = c1Var.f46524a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f31737c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == xnVar.B0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !xnVar.f32907a0);
                                } else {
                                    if (i10 == xnVar.F0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, xnVar.f32909b0);
                                    } else if (i10 == xnVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, xnVar.R);
                                    } else if (i10 == xnVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, xnVar.T);
                                    } else if (i10 == xnVar.E0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, xnVar.S);
                                    } else if (i10 == xnVar.G0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, xnVar.f32911c0);
                                    } else if (i10 == aVar2.f3944b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.f3943a);
                                    } else if (i10 == aVar.f3944b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.f3943a);
                                    } else if (i10 == xnVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (xnVar.U == 0 && xnVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.a(string, string2, 8, i17, z10);
                                        a6Var = a6Var;
                                        if (xnVar.U == 0 && xnVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        a6Var.setDivider(z11);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == xnVar.G0) {
                                    a6Var.getCheckBox().f24334a.a(z12, false);
                                    return;
                                } else if (i10 == xnVar.C0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!xnVar.f32911c0 && !xnVar.f32907a0) {
                                        z14 = false;
                                    }
                                    checkBox.f24334a.a(z14, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f24334a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == xnVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = xnVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        r8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == xnVar.I0) {
                        xnVar.S(r8Var, false);
                        return;
                    } else {
                        r8Var.e(-1, org.telegram.ui.ActionBar.i6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.N6, d6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20948k7, d6Var), mode));
                        sq sqVar = new sq(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), sqVar, false);
                        r8Var.f22728w = 20;
                        r8Var.f22727s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                new sq(new ColorDrawable(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20762a7, d6Var)), org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20782b7)).f30857w = true;
                if (i10 == xnVar.f32934q0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == xnVar.f32945x0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = xnVar.J - xnVar.M;
                    if (i18 <= 0) {
                        if (z13) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        e9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z13) {
                        e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i18));
                        return;
                    } else if (i10 == xnVar.K0) {
                        e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == xnVar.f32947y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = xnVar.f32917f0;
                if (xnVar.f32948z0 != -1) {
                    z15 = true;
                }
                w8Var.f(string4, z16, z15);
                w8Var.e(null, true);
                return;
            } else if (i10 == xnVar.f32948z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), xnVar.f32919g0, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == xnVar.J0) {
                w8Var.f(LocaleController.getString(R.string.PollV2HideResults), xnVar.W, false);
                w8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == xnVar.f32929l0) {
            m4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == xnVar.f32932o0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == xnVar.f32938s0) {
                if (z12) {
                    m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                    return;
                }
                if (z13) {
                    i11 = R.string.TodoItemsTitle;
                } else {
                    i11 = R.string.AnswerOptions2;
                }
                m4Var.setText(LocaleController.getString(i11));
            } else if (i10 == xnVar.f32943w0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        un m4Var;
        View view;
        xn xnVar = this.d;
        boolean z10 = xnVar.f32930n;
        org.telegram.ui.ActionBar.d6 d6Var = xnVar.f29642a;
        Context context = this.f31737c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f31737c, org.telegram.ui.ActionBar.i6.L6, 21, 15, false, xnVar.f29642a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                new sq(new ColorDrawable(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20762a7, d6Var)), org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.i6.f20782b7)).f30857w = true;
                m4Var = b7Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, d6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.r8(context, d6Var);
                break;
            case 4:
            case 11:
                boolean z11 = xnVar.I;
                qn qnVar = new qn(this, this.f31737c, z11 ? 1 : 0, xnVar.f29642a, i10);
                if (i10 == 11 && !z10) {
                    qnVar.setTextRight(98);
                    qnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final vn f29406b;

                        {
                            this.f29406b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    xn.M(this.f29406b.d, -2);
                                    return;
                                case 1:
                                    xn.M(this.f29406b.d, -3);
                                    return;
                                default:
                                    this.f29406b.d.W(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                qnVar.d();
                qnVar.setIconsColor(org.telegram.ui.ActionBar.i6.f21022o7);
                qnVar.c(new rn(this, qnVar, i10));
                m4Var = qnVar;
                break;
            case 5:
            default:
                boolean z12 = xnVar.I;
                un unVar = new un(this, this.f31737c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final vn f29406b;

                    {
                        this.f29406b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                xn.M(this.f29406b.d, -2);
                                return;
                            case 1:
                                xn.M(this.f29406b.d, -3);
                                return;
                            default:
                                this.f29406b.d.W(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                return;
                        }
                    }
                }, xnVar.f29642a);
                if (!z10) {
                    unVar.setTextRight(140);
                    unVar.b().setOnClickListener(new org.telegram.ui.qf(23, this, unVar));
                }
                int i11 = org.telegram.ui.ActionBar.i6.f21022o7;
                unVar.setIconsColor(i11);
                qp qpVar = unVar.f21925r;
                if (qpVar != null) {
                    qpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = qpVar.getCheckBoxBase();
                    float f7 = unVar.f21919a.f15435e;
                    if (checkBoxBase.f24099w != f7) {
                        checkBoxBase.f24099w = f7;
                        checkBoxBase.b();
                    }
                }
                unVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.i6.f20948k7);
                unVar.c(new tn(1, this, unVar));
                unVar.setShowNextButton(true);
                EditTextBoldCursor textView = unVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.yd(2, this, unVar));
                textView.setOnKeyListener(new pn(unVar, 0));
                m4Var = unVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, d6Var);
                break;
            case 7:
                sn snVar = new sn(this, context, xnVar.I ? 1 : 0);
                snVar.d();
                if (!z10) {
                    snVar.setTextRight(98);
                    snVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final vn f29406b;

                        {
                            this.f29406b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    xn.M(this.f29406b.d, -2);
                                    return;
                                case 1:
                                    xn.M(this.f29406b.d, -3);
                                    return;
                                default:
                                    this.f29406b.d.W(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                snVar.setIconsColor(org.telegram.ui.ActionBar.i6.f21022o7);
                snVar.c(new tn(0, this, snVar));
                m4Var = snVar;
                break;
            case 8:
                View nnVar = new nn(context, 0);
                nnVar.setTag(-33024);
                view = nnVar;
                m4Var = view;
                break;
            case 9:
                View abVar = new ci.ab(this, context, 14);
                abVar.setTag(-33024);
                view = abVar;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, d6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        xn xnVar = this.d;
        qh.f fVar = xnVar.l1;
        boolean z10 = xnVar.f32930n;
        int i12 = c1Var.f46528f;
        View view = c1Var.f46524a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence2 = xnVar.N;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i11 = R.string.TodoTitlePlaceholder;
            } else {
                i11 = R.string.QuestionHint;
            }
            d6Var.n(charSequence, LocaleController.getString(i11), true);
            d6Var.setTag(null);
            xn.J(xnVar, view, c1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence3 = xnVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            d6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.f21922e.a(fVar.b(-2), false);
            xn.J(xnVar, view, c1Var.b());
        } else if (i12 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            d6Var3.f21919a.a(xnVar.f32909b0, false);
            int i13 = b10 - xnVar.f32939t0;
            CharSequence charSequence4 = xnVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var3.n(charSequence4, LocaleController.getString(i10), true);
            d6Var3.setTag(null);
            if (xnVar.f32927k0 == b10) {
                EditTextBoldCursor textView = d6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                xnVar.f32927k0 = -1;
            }
            if (!z10) {
                d6Var3.f21922e.a(fVar.b(i13), false);
            }
            xn.J(xnVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
            d6Var4.setTag(1);
            CharSequence charSequence5 = xnVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            d6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var4.setTag(null);
            if (!z10) {
                d6Var4.f21922e.a(fVar.b(-3), false);
            }
            xn.J(xnVar, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f46528f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.f46524a).getTextView();
            if (textView.isFocused()) {
                xn xnVar = this.d;
                if (xnVar.I) {
                    mn mnVar = xnVar.f32944x;
                    if (mnVar != null) {
                        mnVar.f();
                    }
                    xnVar.Y(true);
                }
                xnVar.f32920g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

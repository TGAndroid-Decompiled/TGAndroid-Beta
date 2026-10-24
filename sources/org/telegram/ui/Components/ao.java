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
public final class ao extends km0 {
    public final Context f24762c;
    public final co d;

    public ao(co coVar, Context context) {
        this.d = coVar;
        this.f24762c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        co coVar = this.d;
        if (b10 != coVar.f25395u0 && b10 != coVar.G0 && b10 != coVar.B0 && b10 != coVar.F0 && b10 != coVar.C0 && b10 != coVar.H0 && b10 != coVar.D0 && b10 != coVar.E0 && b10 != coVar.I0 && b10 != coVar.J0 && b10 != coVar.N0.f4733a && b10 != coVar.M0.f4733a && b10 != coVar.L0) {
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
        co coVar = this.d;
        if (i10 != coVar.B0 && i10 != coVar.F0 && i10 != coVar.G0 && i10 != coVar.C0 && i10 != coVar.D0 && i10 != coVar.E0 && i10 != coVar.H0 && i10 != coVar.M0.f4733a && i10 != coVar.N0.f4733a) {
            if (i10 != coVar.f25379l0 && i10 != coVar.f25393s0 && i10 != coVar.f25398w0 && i10 != coVar.f25384o0) {
                if (i10 == coVar.f25391r0) {
                    return 1;
                }
                if (i10 != coVar.f25396v0 && i10 != coVar.f25400x0 && i10 != coVar.f25388q0 && i10 != coVar.K0) {
                    if (i10 != coVar.f25395u0 && i10 != coVar.I0 && i10 != coVar.L0) {
                        if (i10 == coVar.m0) {
                            return 4;
                        }
                        if (i10 == coVar.f25382n0) {
                            return 11;
                        }
                        if (i10 == coVar.f25386p0) {
                            return 7;
                        }
                        if (i10 != coVar.f25402y0 && i10 != coVar.f25403z0 && i10 != coVar.J0) {
                            if (i10 == coVar.A0) {
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
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatPluralString;
        boolean z10;
        boolean z11;
        co coVar = this.d;
        boolean z12 = coVar.f25365e0;
        c5.f fVar = coVar.M0;
        c5.f fVar2 = coVar.N0;
        org.telegram.ui.ActionBar.g6 g6Var = coVar.f27703a;
        boolean z13 = coVar.f25381n;
        int i15 = b1Var.f46345f;
        View view = b1Var.f46342a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f24762c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == coVar.B0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), t40.f30713c, R.drawable.filled_poll_view_24, !coVar.f25357a0);
                                } else {
                                    if (i10 == coVar.F0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), t40.f30714f, R.drawable.filled_poll_multiple_24, coVar.f25359b0);
                                    } else if (i10 == coVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), t40.v, R.drawable.filled_poll_revote_24, coVar.R);
                                    } else if (i10 == coVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), t40.f30717s, R.drawable.filled_poll_add_24, coVar.T);
                                    } else if (i10 == coVar.E0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), t40.h, R.drawable.filled_poll_shuffle_24, coVar.S);
                                    } else if (i10 == coVar.G0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), t40.f30715n, R.drawable.filled_poll_correct_24, coVar.f25361c0);
                                    } else if (i10 == fVar2.f4733a) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), t40.e, R.drawable.filled_location, fVar2.f4734b);
                                    } else if (i10 == fVar.f4733a) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), t40.d, R.drawable.msg_folders_groups, fVar.f4734b);
                                    } else if (i10 == coVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (coVar.U == 0 && coVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.a(string, string2, t40.f30716r, i17, z10);
                                        a6Var = a6Var;
                                        if (coVar.U == 0 && coVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        a6Var.setDivider(z11);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == coVar.G0) {
                                    a6Var.getCheckBox().f24523a.a(z12, false);
                                    return;
                                } else if (i10 == coVar.C0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!coVar.f25361c0 && !coVar.f25357a0) {
                                        z14 = false;
                                    }
                                    checkBox.f24523a.a(z14, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f24523a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == coVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = coVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        r8Var.q(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == coVar.I0) {
                        coVar.X(r8Var, false);
                        return;
                    } else {
                        r8Var.g(-1, org.telegram.ui.ActionBar.k6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, g6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21312k7, g6Var), mode));
                        coVar.f25383n1 = drawable;
                        coVar.f25385o1 = drawable2;
                        wq wqVar = new wq(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.p(LocaleController.getString(i14), wqVar, false);
                        r8Var.f23116w = 20;
                        r8Var.f23115s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                new wq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21126a7, g6Var)), org.telegram.ui.ActionBar.k6.X0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7)).f32329w = true;
                if (i10 == coVar.f25388q0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == coVar.f25400x0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = coVar.J - coVar.M;
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
                    } else if (i10 == coVar.K0) {
                        e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == coVar.f25402y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = coVar.f25367f0;
                if (coVar.f25403z0 != -1) {
                    z15 = true;
                }
                w8Var.f(string4, z16, z15);
                w8Var.e(null, true);
                return;
            } else if (i10 == coVar.f25403z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), coVar.f25369g0, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == coVar.J0) {
                w8Var.f(LocaleController.getString(R.string.PollV2HideResults), coVar.W, false);
                w8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == coVar.f25379l0) {
            l4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            l4Var.setText(LocaleController.getString(i12));
        } else if (i10 == coVar.f25384o0) {
            l4Var.getTextView().setGravity(19);
            l4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = l4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == coVar.f25393s0) {
                if (z12) {
                    l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                    return;
                }
                if (z13) {
                    i11 = R.string.TodoItemsTitle;
                } else {
                    i11 = R.string.AnswerOptions2;
                }
                l4Var.setText(LocaleController.getString(i11));
            } else if (i10 == coVar.f25398w0) {
                l4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        zn l4Var;
        View view;
        co coVar = this.d;
        boolean z10 = coVar.f25381n;
        org.telegram.ui.ActionBar.g6 g6Var = coVar.f27703a;
        Context context = this.f24762c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(this.f24762c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, coVar.f27703a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                new wq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21126a7, g6Var)), org.telegram.ui.ActionBar.k6.X0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21146b7)).f32329w = true;
                l4Var = b7Var;
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.e9(context, g6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.r8(context, g6Var);
                break;
            case 4:
            case 11:
                boolean z11 = coVar.I;
                vn vnVar = new vn(this, this.f24762c, z11 ? 1 : 0, coVar.f27703a, i10);
                if (i10 == 11 && !z10) {
                    vnVar.setTextRight(98);
                    vnVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final ao f30865b;

                        {
                            this.f30865b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    co.R(this.f30865b.d, -2);
                                    return;
                                case 1:
                                    co.R(this.f30865b.d, -3);
                                    return;
                                default:
                                    this.f30865b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                vnVar.c();
                vnVar.setIconsColor(org.telegram.ui.ActionBar.k6.f21388o7);
                vnVar.b(new wn(this, vnVar, i10));
                l4Var = vnVar;
                break;
            case 5:
            default:
                boolean z12 = coVar.I;
                zn znVar = new zn(this, this.f24762c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final ao f30865b;

                    {
                        this.f30865b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                co.R(this.f30865b.d, -2);
                                return;
                            case 1:
                                co.R(this.f30865b.d, -3);
                                return;
                            default:
                                this.f30865b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                return;
                        }
                    }
                }, coVar.f27703a);
                if (!z10) {
                    znVar.setTextRight(140);
                    znVar.a().setOnClickListener(new aa(4, this, znVar));
                }
                int i11 = org.telegram.ui.ActionBar.k6.f21388o7;
                znVar.setIconsColor(i11);
                vp vpVar = znVar.f22283r;
                if (vpVar != null) {
                    vpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = vpVar.getCheckBoxBase();
                    float f7 = znVar.f22278a.e;
                    if (checkBoxBase.f24302w != f7) {
                        checkBoxBase.f24302w = f7;
                        checkBoxBase.b();
                    }
                }
                znVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.k6.f21312k7);
                znVar.b(new yn(1, this, znVar));
                znVar.setShowNextButton(true);
                EditTextBoldCursor textView = znVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.wd(2, this, znVar));
                textView.setOnKeyListener(new un(znVar, 0));
                l4Var = znVar;
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.w8(context, g6Var);
                break;
            case 7:
                xn xnVar = new xn(this, context, coVar.I ? 1 : 0);
                xnVar.c();
                if (!z10) {
                    xnVar.setTextRight(98);
                    xnVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final ao f30865b;

                        {
                            this.f30865b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    co.R(this.f30865b.d, -2);
                                    return;
                                case 1:
                                    co.R(this.f30865b.d, -3);
                                    return;
                                default:
                                    this.f30865b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                xnVar.setIconsColor(org.telegram.ui.ActionBar.k6.f21388o7);
                xnVar.b(new yn(0, this, xnVar));
                l4Var = xnVar;
                break;
            case 8:
                View snVar = new sn(context, 0);
                snVar.setTag(-33024);
                view = snVar;
                l4Var = view;
                break;
            case 9:
                View jcVar = new ai.jc(this, context, 14);
                jcVar.setTag(-33024);
                view = jcVar;
                l4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, g6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                l4Var = a6Var;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(l4Var, l4Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10;
        int i11;
        co coVar = this.d;
        rh.f fVar = coVar.f25380m1;
        boolean z10 = coVar.f25381n;
        int i12 = b1Var.f46345f;
        View view = b1Var.f46342a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence2 = coVar.N;
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
            co.O(coVar, view, b1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence3 = coVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            d6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            co.O(coVar, view, b1Var.b());
        } else if (i12 == 5) {
            int b10 = b1Var.b();
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            d6Var3.f22278a.a(coVar.f25359b0, false);
            int i13 = b10 - coVar.f25394t0;
            CharSequence charSequence4 = coVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var3.n(charSequence4, LocaleController.getString(i10), true);
            d6Var3.setTag(null);
            if (coVar.f25377k0 == b10) {
                EditTextBoldCursor textView = d6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                coVar.f25377k0 = -1;
            }
            if (!z10) {
                d6Var3.e.a(fVar.b(i13), false);
            }
            co.O(coVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
            d6Var4.setTag(1);
            CharSequence charSequence5 = coVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            d6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var4.setTag(null);
            if (!z10) {
                d6Var4.e.a(fVar.b(-3), false);
            }
            co.O(coVar, view, b1Var.b());
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.f46342a).getTextView();
            if (textView.isFocused()) {
                co coVar = this.d;
                if (coVar.I) {
                    rn rnVar = coVar.f25399x;
                    if (rnVar != null) {
                        rnVar.f();
                    }
                    coVar.c0(true);
                }
                coVar.f25370g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

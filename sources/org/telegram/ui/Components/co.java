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
public final class co extends lm0 {
    public final Context f25393c;
    public final fo d;

    public co(fo foVar, Context context) {
        this.d = foVar;
        this.f25393c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        fo foVar = this.d;
        if (b10 != foVar.f26423u0 && b10 != foVar.G0 && b10 != foVar.B0 && b10 != foVar.F0 && b10 != foVar.C0 && b10 != foVar.H0 && b10 != foVar.D0 && b10 != foVar.E0 && b10 != foVar.I0 && b10 != foVar.J0 && b10 != foVar.N0.f4733a && b10 != foVar.M0.f4733a && b10 != foVar.L0) {
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
        fo foVar = this.d;
        if (i10 != foVar.B0 && i10 != foVar.F0 && i10 != foVar.G0 && i10 != foVar.C0 && i10 != foVar.D0 && i10 != foVar.E0 && i10 != foVar.H0 && i10 != foVar.M0.f4733a && i10 != foVar.N0.f4733a) {
            if (i10 != foVar.f26407l0 && i10 != foVar.f26421s0 && i10 != foVar.f26426w0 && i10 != foVar.f26412o0) {
                if (i10 == foVar.f26419r0) {
                    return 1;
                }
                if (i10 != foVar.f26424v0 && i10 != foVar.f26428x0 && i10 != foVar.f26416q0 && i10 != foVar.K0) {
                    if (i10 != foVar.f26423u0 && i10 != foVar.I0 && i10 != foVar.L0) {
                        if (i10 == foVar.m0) {
                            return 4;
                        }
                        if (i10 == foVar.f26410n0) {
                            return 11;
                        }
                        if (i10 == foVar.f26414p0) {
                            return 7;
                        }
                        if (i10 != foVar.f26430y0 && i10 != foVar.f26431z0 && i10 != foVar.J0) {
                            if (i10 == foVar.A0) {
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
        fo foVar = this.d;
        boolean z12 = foVar.f26393e0;
        c5.f fVar = foVar.M0;
        c5.f fVar2 = foVar.N0;
        org.telegram.ui.ActionBar.g6 g6Var = foVar.f28365a;
        boolean z13 = foVar.f26409n;
        int i15 = b1Var.f46346f;
        View view = b1Var.f46343a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f25393c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == foVar.B0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), v40.f31346c, R.drawable.filled_poll_view_24, !foVar.f26385a0);
                                } else {
                                    if (i10 == foVar.F0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), v40.f31347f, R.drawable.filled_poll_multiple_24, foVar.f26387b0);
                                    } else if (i10 == foVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), v40.v, R.drawable.filled_poll_revote_24, foVar.R);
                                    } else if (i10 == foVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), v40.f31350s, R.drawable.filled_poll_add_24, foVar.T);
                                    } else if (i10 == foVar.E0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), v40.h, R.drawable.filled_poll_shuffle_24, foVar.S);
                                    } else if (i10 == foVar.G0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), v40.f31348n, R.drawable.filled_poll_correct_24, foVar.f26389c0);
                                    } else if (i10 == fVar2.f4733a) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), v40.e, R.drawable.filled_location, fVar2.f4734b);
                                    } else if (i10 == fVar.f4733a) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), v40.d, R.drawable.msg_folders_groups, fVar.f4734b);
                                    } else if (i10 == foVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (foVar.U == 0 && foVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.a(string, string2, v40.f31349r, i17, z10);
                                        a6Var = a6Var;
                                        if (foVar.U == 0 && foVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        a6Var.setDivider(z11);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == foVar.G0) {
                                    a6Var.getCheckBox().f24522a.a(z12, false);
                                    return;
                                } else if (i10 == foVar.C0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!foVar.f26389c0 && !foVar.f26385a0) {
                                        z14 = false;
                                    }
                                    checkBox.f24522a.a(z14, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f24522a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == foVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = foVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        r8Var.q(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == foVar.I0) {
                        foVar.X(r8Var, false);
                        return;
                    } else {
                        r8Var.g(-1, org.telegram.ui.ActionBar.k6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N6, g6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21311k7, g6Var), mode));
                        foVar.f26411n1 = drawable;
                        foVar.f26413o1 = drawable2;
                        yq yqVar = new yq(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.p(LocaleController.getString(i14), yqVar, false);
                        r8Var.f23115w = 20;
                        r8Var.f23114s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                new yq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21125a7, g6Var)), org.telegram.ui.ActionBar.k6.X0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21145b7)).f33019w = true;
                if (i10 == foVar.f26416q0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == foVar.f26428x0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = foVar.J - foVar.M;
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
                    } else if (i10 == foVar.K0) {
                        e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == foVar.f26430y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = foVar.f26395f0;
                if (foVar.f26431z0 != -1) {
                    z15 = true;
                }
                w8Var.f(string4, z16, z15);
                w8Var.e(null, true);
                return;
            } else if (i10 == foVar.f26431z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), foVar.f26397g0, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == foVar.J0) {
                w8Var.f(LocaleController.getString(R.string.PollV2HideResults), foVar.W, false);
                w8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == foVar.f26407l0) {
            l4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            l4Var.setText(LocaleController.getString(i12));
        } else if (i10 == foVar.f26412o0) {
            l4Var.getTextView().setGravity(19);
            l4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = l4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == foVar.f26421s0) {
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
            } else if (i10 == foVar.f26426w0) {
                l4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        bo l4Var;
        View view;
        fo foVar = this.d;
        boolean z10 = foVar.f26409n;
        org.telegram.ui.ActionBar.g6 g6Var = foVar.f28365a;
        Context context = this.f25393c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(this.f25393c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, foVar.f28365a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                new yq(new ColorDrawable(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21125a7, g6Var)), org.telegram.ui.ActionBar.k6.X0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21145b7)).f33019w = true;
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
                boolean z11 = foVar.I;
                xn xnVar = new xn(this, this.f25393c, z11 ? 1 : 0, foVar.f28365a, i10);
                if (i10 == 11 && !z10) {
                    xnVar.setTextRight(98);
                    xnVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final co f31505b;

                        {
                            this.f31505b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    fo.R(this.f31505b.d, -2);
                                    return;
                                case 1:
                                    fo.R(this.f31505b.d, -3);
                                    return;
                                default:
                                    this.f31505b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                xnVar.c();
                xnVar.setIconsColor(org.telegram.ui.ActionBar.k6.f21387o7);
                xnVar.b(new yn(this, xnVar, i10));
                l4Var = xnVar;
                break;
            case 5:
            default:
                boolean z12 = foVar.I;
                bo boVar = new bo(this, this.f25393c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final co f31505b;

                    {
                        this.f31505b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                fo.R(this.f31505b.d, -2);
                                return;
                            case 1:
                                fo.R(this.f31505b.d, -3);
                                return;
                            default:
                                this.f31505b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                return;
                        }
                    }
                }, foVar.f28365a);
                if (!z10) {
                    boVar.setTextRight(140);
                    boVar.a().setOnClickListener(new ca(4, this, boVar));
                }
                int i11 = org.telegram.ui.ActionBar.k6.f21387o7;
                boVar.setIconsColor(i11);
                xp xpVar = boVar.f22282r;
                if (xpVar != null) {
                    xpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = xpVar.getCheckBoxBase();
                    float f7 = boVar.f22277a.e;
                    if (checkBoxBase.f24301w != f7) {
                        checkBoxBase.f24301w = f7;
                        checkBoxBase.b();
                    }
                }
                boVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.k6.f21311k7);
                boVar.b(new ao(1, this, boVar));
                boVar.setShowNextButton(true);
                EditTextBoldCursor textView = boVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.wd(2, this, boVar));
                textView.setOnKeyListener(new wn(boVar, 0));
                l4Var = boVar;
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.w8(context, g6Var);
                break;
            case 7:
                zn znVar = new zn(this, context, foVar.I ? 1 : 0);
                znVar.c();
                if (!z10) {
                    znVar.setTextRight(98);
                    znVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final co f31505b;

                        {
                            this.f31505b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    fo.R(this.f31505b.d, -2);
                                    return;
                                case 1:
                                    fo.R(this.f31505b.d, -3);
                                    return;
                                default:
                                    this.f31505b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                znVar.setIconsColor(org.telegram.ui.ActionBar.k6.f21387o7);
                znVar.b(new ao(0, this, znVar));
                l4Var = znVar;
                break;
            case 8:
                View unVar = new un(context, 0);
                unVar.setTag(-33024);
                view = unVar;
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
        fo foVar = this.d;
        rh.f fVar = foVar.f26408m1;
        boolean z10 = foVar.f26409n;
        int i12 = b1Var.f46346f;
        View view = b1Var.f46343a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence2 = foVar.N;
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
            fo.O(foVar, view, b1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence3 = foVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            d6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            fo.O(foVar, view, b1Var.b());
        } else if (i12 == 5) {
            int b10 = b1Var.b();
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            d6Var3.f22277a.a(foVar.f26387b0, false);
            int i13 = b10 - foVar.f26422t0;
            CharSequence charSequence4 = foVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var3.n(charSequence4, LocaleController.getString(i10), true);
            d6Var3.setTag(null);
            if (foVar.f26405k0 == b10) {
                EditTextBoldCursor textView = d6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                foVar.f26405k0 = -1;
            }
            if (!z10) {
                d6Var3.e.a(fVar.b(i13), false);
            }
            fo.O(foVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
            d6Var4.setTag(1);
            CharSequence charSequence5 = foVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            d6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var4.setTag(null);
            if (!z10) {
                d6Var4.e.a(fVar.b(-3), false);
            }
            fo.O(foVar, view, b1Var.b());
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f46346f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.f46343a).getTextView();
            if (textView.isFocused()) {
                fo foVar = this.d;
                if (foVar.I) {
                    tn tnVar = foVar.f26427x;
                    if (tnVar != null) {
                        tnVar.f();
                    }
                    foVar.c0(true);
                }
                foVar.f26398g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

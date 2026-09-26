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
public final class un extends wl0 {
    public final Context f28858c;
    public final wn d;

    public un(wn wnVar, Context context) {
        this.d = wnVar;
        this.f28858c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        wn wnVar = this.d;
        if (b10 != wnVar.f30140u0 && b10 != wnVar.G0 && b10 != wnVar.B0 && b10 != wnVar.F0 && b10 != wnVar.C0 && b10 != wnVar.H0 && b10 != wnVar.D0 && b10 != wnVar.E0 && b10 != wnVar.I0 && b10 != wnVar.J0 && b10 != wnVar.N0.f3649b && b10 != wnVar.M0.f3649b && b10 != wnVar.L0) {
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
        wn wnVar = this.d;
        if (i10 != wnVar.B0 && i10 != wnVar.F0 && i10 != wnVar.G0 && i10 != wnVar.C0 && i10 != wnVar.D0 && i10 != wnVar.E0 && i10 != wnVar.H0 && i10 != wnVar.M0.f3649b && i10 != wnVar.N0.f3649b) {
            if (i10 != wnVar.f30129l0 && i10 != wnVar.f30138s0 && i10 != wnVar.f30143w0 && i10 != wnVar.f30132o0) {
                if (i10 == wnVar.f30136r0) {
                    return 1;
                }
                if (i10 != wnVar.f30141v0 && i10 != wnVar.f30145x0 && i10 != wnVar.f30134q0 && i10 != wnVar.K0) {
                    if (i10 != wnVar.f30140u0 && i10 != wnVar.I0 && i10 != wnVar.L0) {
                        if (i10 == wnVar.m0) {
                            return 4;
                        }
                        if (i10 == wnVar.f30131n0) {
                            return 11;
                        }
                        if (i10 == wnVar.f30133p0) {
                            return 7;
                        }
                        if (i10 != wnVar.f30147y0 && i10 != wnVar.f30148z0 && i10 != wnVar.J0) {
                            if (i10 == wnVar.A0) {
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
        wn wnVar = this.d;
        boolean z12 = wnVar.f30115e0;
        c2.a aVar = wnVar.M0;
        c2.a aVar2 = wnVar.N0;
        org.telegram.ui.ActionBar.d6 d6Var = wnVar.f27042a;
        boolean z13 = wnVar.f30130n;
        int i15 = c1Var.f42962f;
        View view = c1Var.f42959a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f28858c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == wnVar.B0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !wnVar.f30107a0);
                                } else {
                                    if (i10 == wnVar.F0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, wnVar.f30109b0);
                                    } else if (i10 == wnVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, wnVar.R);
                                    } else if (i10 == wnVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, wnVar.T);
                                    } else if (i10 == wnVar.E0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, wnVar.S);
                                    } else if (i10 == wnVar.G0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, wnVar.f30111c0);
                                    } else if (i10 == aVar2.f3649b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.f3648a);
                                    } else if (i10 == aVar.f3649b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.f3648a);
                                    } else if (i10 == wnVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (wnVar.U == 0 && wnVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.a(string, string2, 8, i17, z10);
                                        a6Var = a6Var;
                                        if (wnVar.U == 0 && wnVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        a6Var.setDivider(z11);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == wnVar.G0) {
                                    a6Var.getCheckBox().f22419a.a(z12, false);
                                    return;
                                } else if (i10 == wnVar.C0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!wnVar.f30111c0 && !wnVar.f30107a0) {
                                        z14 = false;
                                    }
                                    checkBox.f22419a.a(z14, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f22419a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == wnVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = wnVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        r8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == wnVar.I0) {
                        wnVar.U(r8Var, false);
                        return;
                    } else {
                        r8Var.e(-1, org.telegram.ui.ActionBar.h6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.N6, d6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19187k7, d6Var), mode));
                        rq rqVar = new rq(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), rqVar, false);
                        r8Var.f20881w = 20;
                        r8Var.f20880s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                new rq(new ColorDrawable(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19003a7, d6Var)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19023b7)).f28035w = true;
                if (i10 == wnVar.f30134q0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == wnVar.f30145x0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = wnVar.J - wnVar.M;
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
                    } else if (i10 == wnVar.K0) {
                        e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == wnVar.f30147y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = wnVar.f30117f0;
                if (wnVar.f30148z0 != -1) {
                    z15 = true;
                }
                w8Var.f(string4, z16, z15);
                w8Var.e(null, true);
                return;
            } else if (i10 == wnVar.f30148z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), wnVar.f30119g0, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == wnVar.J0) {
                w8Var.f(LocaleController.getString(R.string.PollV2HideResults), wnVar.W, false);
                w8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == wnVar.f30129l0) {
            m4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == wnVar.f30132o0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == wnVar.f30138s0) {
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
            } else if (i10 == wnVar.f30143w0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        tn m4Var;
        View view;
        wn wnVar = this.d;
        boolean z10 = wnVar.f30130n;
        org.telegram.ui.ActionBar.d6 d6Var = wnVar.f27042a;
        Context context = this.f28858c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f28858c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, wnVar.f27042a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                new rq(new ColorDrawable(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19003a7, d6Var)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f19023b7)).f28035w = true;
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
                boolean z11 = wnVar.I;
                pn pnVar = new pn(this, this.f28858c, z11 ? 1 : 0, wnVar.f27042a, i10);
                if (i10 == 11 && !z10) {
                    pnVar.setTextRight(98);
                    pnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final un f26848b;

                        {
                            this.f26848b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    wn.O(this.f26848b.d, -2);
                                    return;
                                case 1:
                                    wn.O(this.f26848b.d, -3);
                                    return;
                                default:
                                    this.f26848b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                pnVar.d();
                pnVar.setIconsColor(org.telegram.ui.ActionBar.h6.f19261o7);
                pnVar.c(new qn(this, pnVar, i10));
                m4Var = pnVar;
                break;
            case 5:
            default:
                boolean z12 = wnVar.I;
                tn tnVar = new tn(this, this.f28858c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final un f26848b;

                    {
                        this.f26848b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                wn.O(this.f26848b.d, -2);
                                return;
                            case 1:
                                wn.O(this.f26848b.d, -3);
                                return;
                            default:
                                this.f26848b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                return;
                        }
                    }
                }, wnVar.f27042a);
                if (!z10) {
                    tnVar.setTextRight(140);
                    tnVar.b().setOnClickListener(new org.telegram.ui.pf(23, this, tnVar));
                }
                int i11 = org.telegram.ui.ActionBar.h6.f19261o7;
                tnVar.setIconsColor(i11);
                pp ppVar = tnVar.f20139r;
                if (ppVar != null) {
                    ppVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = ppVar.getCheckBoxBase();
                    float f7 = tnVar.f20134a.e;
                    if (checkBoxBase.f22199w != f7) {
                        checkBoxBase.f22199w = f7;
                        checkBoxBase.b();
                    }
                }
                tnVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.h6.f19187k7);
                tnVar.c(new sn(1, this, tnVar));
                tnVar.setShowNextButton(true);
                EditTextBoldCursor textView = tnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.vd(2, this, tnVar));
                textView.setOnKeyListener(new on(tnVar, 0));
                m4Var = tnVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, d6Var);
                break;
            case 7:
                rn rnVar = new rn(this, context, wnVar.I ? 1 : 0);
                rnVar.d();
                if (!z10) {
                    rnVar.setTextRight(98);
                    rnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final un f26848b;

                        {
                            this.f26848b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    wn.O(this.f26848b.d, -2);
                                    return;
                                case 1:
                                    wn.O(this.f26848b.d, -3);
                                    return;
                                default:
                                    this.f26848b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                rnVar.setIconsColor(org.telegram.ui.ActionBar.h6.f19261o7);
                rnVar.c(new sn(0, this, rnVar));
                m4Var = rnVar;
                break;
            case 8:
                View mnVar = new mn(context, 0);
                mnVar.setTag(-33024);
                view = mnVar;
                m4Var = view;
                break;
            case 9:
                View bbVar = new ci.bb(this, context, 14);
                bbVar.setTag(-33024);
                view = bbVar;
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
        wn wnVar = this.d;
        qh.f fVar = wnVar.l1;
        boolean z10 = wnVar.f30130n;
        int i12 = c1Var.f42962f;
        View view = c1Var.f42959a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence2 = wnVar.N;
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
            wn.L(wnVar, view, c1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence3 = wnVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            d6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            wn.L(wnVar, view, c1Var.b());
        } else if (i12 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            d6Var3.f20134a.a(wnVar.f30109b0, false);
            int i13 = b10 - wnVar.f30139t0;
            CharSequence charSequence4 = wnVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var3.n(charSequence4, LocaleController.getString(i10), true);
            d6Var3.setTag(null);
            if (wnVar.f30127k0 == b10) {
                EditTextBoldCursor textView = d6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                wnVar.f30127k0 = -1;
            }
            if (!z10) {
                d6Var3.e.a(fVar.b(i13), false);
            }
            wn.L(wnVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
            d6Var4.setTag(1);
            CharSequence charSequence5 = wnVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            d6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var4.setTag(null);
            if (!z10) {
                d6Var4.e.a(fVar.b(-3), false);
            }
            wn.L(wnVar, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f42962f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.f42959a).getTextView();
            if (textView.isFocused()) {
                wn wnVar = this.d;
                if (wnVar.I) {
                    ln lnVar = wnVar.f30144x;
                    if (lnVar != null) {
                        lnVar.f();
                    }
                    wnVar.Z(true);
                }
                wnVar.f30120g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

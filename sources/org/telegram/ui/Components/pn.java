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
public final class pn extends rl0 {
    public final Context f30154c;
    public final rn d;

    public pn(rn rnVar, Context context) {
        this.d = rnVar;
        this.f30154c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int b10 = m1Var.b();
        rn rnVar = this.d;
        if (b10 != rnVar.f30841r0 && b10 != rnVar.D0 && b10 != rnVar.f30852y0 && b10 != rnVar.C0 && b10 != rnVar.f30853z0 && b10 != rnVar.E0 && b10 != rnVar.A0 && b10 != rnVar.B0 && b10 != rnVar.F0 && b10 != rnVar.G0 && b10 != rnVar.K0.f1839b && b10 != rnVar.J0.f1839b && b10 != rnVar.I0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.N0;
    }

    @Override
    public final int j(int i10) {
        rn rnVar = this.d;
        if (i10 != rnVar.f30852y0 && i10 != rnVar.C0 && i10 != rnVar.D0 && i10 != rnVar.f30853z0 && i10 != rnVar.A0 && i10 != rnVar.B0 && i10 != rnVar.E0 && i10 != rnVar.J0.f1839b && i10 != rnVar.K0.f1839b) {
            if (i10 != rnVar.f30830i0 && i10 != rnVar.f30838p0 && i10 != rnVar.f30844t0 && i10 != rnVar.f30834l0) {
                if (i10 == rnVar.f30837o0) {
                    return 1;
                }
                if (i10 != rnVar.f30843s0 && i10 != rnVar.f30845u0 && i10 != rnVar.f30836n0 && i10 != rnVar.H0) {
                    if (i10 != rnVar.f30841r0 && i10 != rnVar.F0 && i10 != rnVar.I0) {
                        if (i10 == rnVar.f30832j0) {
                            return 4;
                        }
                        if (i10 == rnVar.f30833k0) {
                            return 11;
                        }
                        if (i10 == rnVar.m0) {
                            return 7;
                        }
                        if (i10 != rnVar.f30846v0 && i10 != rnVar.f30848w0 && i10 != rnVar.G0) {
                            if (i10 == rnVar.f30850x0) {
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
    public final void v(f2.m1 m1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatPluralString;
        boolean z4;
        boolean z10;
        rn rnVar = this.d;
        boolean z11 = rnVar.f30816b0;
        b7.l0 l0Var = rnVar.J0;
        b7.l0 l0Var2 = rnVar.K0;
        org.telegram.ui.ActionBar.g6 g6Var = rnVar.f26589a;
        boolean z12 = rnVar.f30835n;
        int i15 = m1Var.f5879f;
        View view = m1Var.f5875a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z13 = true;
            boolean z14 = false;
            if (i15 != 6) {
                Context context = this.f30154c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == rnVar.f30852y0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !rnVar.U);
                                } else {
                                    if (i10 == rnVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, rnVar.V);
                                    } else if (i10 == rnVar.A0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, rnVar.O);
                                    } else if (i10 == rnVar.f30853z0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, rnVar.Q);
                                    } else if (i10 == rnVar.B0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, rnVar.P);
                                    } else if (i10 == rnVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, rnVar.W);
                                    } else if (i10 == l0Var2.f1839b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, l0Var2.f1838a);
                                    } else if (i10 == l0Var.f1839b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, l0Var.f1838a);
                                    } else if (i10 == rnVar.E0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (rnVar.R == 0 && rnVar.S == 0) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        a6Var.a(string, string2, 8, i17, z4);
                                        a6Var = a6Var;
                                        if (rnVar.R == 0 && rnVar.S == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.setDivider(z10);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == rnVar.D0) {
                                    a6Var.getCheckBox().f25043a.a(z11, false);
                                    return;
                                } else if (i10 == rnVar.f30853z0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!rnVar.W && !rnVar.U) {
                                        z13 = false;
                                    }
                                    checkBox.f25043a.a(z13, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f25043a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    if (i10 == rnVar.I0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = rnVar.M0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        o8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == rnVar.F0) {
                        rnVar.U(o8Var, false);
                        return;
                    } else {
                        o8Var.e(-1, org.telegram.ui.ActionBar.k6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.N6, g6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21788k7, g6Var), mode));
                        pq pqVar = new pq(drawable, drawable2);
                        if (z12) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        o8Var.n(LocaleController.getString(i14), pqVar, false);
                        o8Var.f23320w = 20;
                        o8Var.f23319s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                new pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21607a7, g6Var)), org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21626b7)).f30166w = true;
                if (i10 == rnVar.f30836n0) {
                    a9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == rnVar.f30845u0) {
                    a9Var.setFixedSize(12);
                    a9Var.setText(null);
                    return;
                } else {
                    int i18 = rnVar.G - rnVar.J;
                    if (i18 <= 0) {
                        if (z12) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        a9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z12) {
                        a9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i18));
                        return;
                    } else if (i10 == rnVar.H0) {
                        a9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        a9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            if (i10 == rnVar.f30846v0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z15 = rnVar.f30818c0;
                if (rnVar.f30848w0 != -1) {
                    z14 = true;
                }
                s8Var.f(string4, z15, z14);
                s8Var.e(null, true);
                return;
            } else if (i10 == rnVar.f30848w0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), rnVar.f30820d0, false);
                s8Var.e(null, true);
                return;
            } else if (i10 == rnVar.G0) {
                s8Var.f(LocaleController.getString(R.string.PollV2HideResults), rnVar.T, false);
                s8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == rnVar.f30830i0) {
            m4Var.getTextView().setGravity(19);
            if (z12) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == rnVar.f30834l0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == rnVar.f30838p0) {
                if (z11) {
                    m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                    return;
                }
                if (z12) {
                    i11 = R.string.TodoItemsTitle;
                } else {
                    i11 = R.string.AnswerOptions2;
                }
                m4Var.setText(LocaleController.getString(i11));
            } else if (i10 == rnVar.f30844t0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        on m4Var;
        View view;
        rn rnVar = this.d;
        boolean z4 = rnVar.f30835n;
        org.telegram.ui.ActionBar.g6 g6Var = rnVar.f26589a;
        Context context = this.f30154c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f30154c, org.telegram.ui.ActionBar.k6.L6, 21, 15, false, rnVar.f26589a);
                break;
            case 1:
                View z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.b) null);
                new pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21607a7, g6Var)), org.telegram.ui.ActionBar.k6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.k6.f21626b7)).f30166w = true;
                m4Var = z6Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.a9(context, g6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.o8(context, g6Var);
                break;
            case 4:
            case 11:
                boolean z10 = rnVar.F;
                ln lnVar = new ln(this, this.f30154c, z10 ? 1 : 0, rnVar.f26589a, i10);
                if (i10 == 11 && !z4) {
                    lnVar.setTextRight(98);
                    lnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final pn f28147b;

                        {
                            this.f28147b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    rn.O(this.f28147b.d, -2);
                                    return;
                                case 1:
                                    rn.O(this.f28147b.d, -3);
                                    return;
                                default:
                                    this.f28147b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                lnVar.d();
                lnVar.setIconsColor(org.telegram.ui.ActionBar.k6.f21860o7);
                lnVar.c(new mn(this, lnVar, i10));
                m4Var = lnVar;
                break;
            case 5:
            default:
                boolean z11 = rnVar.F;
                on onVar = new on(this, this.f30154c, z11 ? 1 : 0, new View.OnClickListener(this) {
                    public final pn f28147b;

                    {
                        this.f28147b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                rn.O(this.f28147b.d, -2);
                                return;
                            case 1:
                                rn.O(this.f28147b.d, -3);
                                return;
                            default:
                                this.f28147b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                return;
                        }
                    }
                }, rnVar.f26589a);
                if (!z4) {
                    onVar.setTextRight(140);
                    onVar.b().setOnClickListener(new w2(8, this, onVar));
                }
                int i11 = org.telegram.ui.ActionBar.k6.f21860o7;
                onVar.setIconsColor(i11);
                np npVar = onVar.f22655r;
                if (npVar != null) {
                    npVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = npVar.getCheckBoxBase();
                    float f10 = onVar.f22649a.f50541e;
                    if (checkBoxBase.f24816w != f10) {
                        checkBoxBase.f24816w = f10;
                        checkBoxBase.b();
                    }
                }
                onVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.k6.f21788k7);
                onVar.c(new dg.b0(this, onVar, false, 8));
                onVar.setShowNextButton(true);
                EditTextBoldCursor textView = onVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.yd(2, this, onVar));
                textView.setOnKeyListener(new kn(onVar, 0));
                m4Var = onVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.s8(context, g6Var);
                break;
            case 7:
                nn nnVar = new nn(this, context, rnVar.F ? 1 : 0);
                nnVar.d();
                if (!z4) {
                    nnVar.setTextRight(98);
                    nnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final pn f28147b;

                        {
                            this.f28147b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    rn.O(this.f28147b.d, -2);
                                    return;
                                case 1:
                                    rn.O(this.f28147b.d, -3);
                                    return;
                                default:
                                    this.f28147b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                nnVar.setIconsColor(org.telegram.ui.ActionBar.k6.f21860o7);
                nnVar.c(new dg.b0(this, nnVar, false, 7));
                m4Var = nnVar;
                break;
            case 8:
                View inVar = new in(context, 0);
                inVar.setTag(-33024);
                view = inVar;
                m4Var = view;
                break;
            case 9:
                View h0Var = new fg.h0(this, context, 9);
                h0Var.setTag(-33024);
                view = h0Var;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, g6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return org.telegram.ui.yh.o(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        int i10;
        int i11;
        rn rnVar = this.d;
        eh.i iVar = rnVar.f30831i1;
        boolean z4 = rnVar.f30835n;
        int i12 = m1Var.f5879f;
        View view = m1Var.f5875a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            CharSequence charSequence2 = rnVar.K;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z4) {
                i11 = R.string.TodoTitlePlaceholder;
            } else {
                i11 = R.string.QuestionHint;
            }
            c6Var.n(charSequence, LocaleController.getString(i11), true);
            c6Var.setTag(null);
            rn.K(rnVar, view, m1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            CharSequence charSequence3 = rnVar.L;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            c6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            c6Var2.setTag(null);
            c6Var2.f22652e.a(iVar.b(-2), false);
            rn.K(rnVar, view, m1Var.b());
        } else if (i12 == 5) {
            int b10 = m1Var.b();
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            c6Var3.f22649a.a(rnVar.V, false);
            int i13 = b10 - rnVar.f30839q0;
            CharSequence charSequence4 = rnVar.H[i13];
            if (z4) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var3.n(charSequence4, LocaleController.getString(i10), true);
            c6Var3.setTag(null);
            if (rnVar.f30828h0 == b10) {
                EditTextBoldCursor textView = c6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                rnVar.f30828h0 = -1;
            }
            if (!z4) {
                c6Var3.f22652e.a(iVar.b(i13), false);
            }
            rn.K(rnVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.c6 c6Var4 = (org.telegram.ui.Cells.c6) view;
            c6Var4.setTag(1);
            CharSequence charSequence5 = rnVar.M;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            c6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var4.setTag(null);
            if (!z4) {
                c6Var4.f22652e.a(iVar.b(-3), false);
            }
            rn.K(rnVar, view, m1Var.b());
        }
    }

    @Override
    public final void z(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) m1Var.f5875a).getTextView();
            if (textView.isFocused()) {
                rn rnVar = this.d;
                if (rnVar.F) {
                    hn hnVar = rnVar.f30849x;
                    if (hnVar != null) {
                        hnVar.f();
                    }
                    rnVar.Z(true);
                }
                rnVar.f30821d1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

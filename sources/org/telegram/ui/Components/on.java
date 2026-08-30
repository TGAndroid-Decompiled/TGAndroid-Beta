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
public final class on extends rl0 {
    public final Context f27599c;
    public final qn d;

    public on(qn qnVar, Context context) {
        this.d = qnVar;
        this.f27599c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        qn qnVar = this.d;
        if (b10 != qnVar.f28187r0 && b10 != qnVar.D0 && b10 != qnVar.f28198y0 && b10 != qnVar.C0 && b10 != qnVar.f28199z0 && b10 != qnVar.E0 && b10 != qnVar.A0 && b10 != qnVar.B0 && b10 != qnVar.F0 && b10 != qnVar.G0 && b10 != qnVar.K0.f1700b && b10 != qnVar.J0.f1700b && b10 != qnVar.I0) {
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
        qn qnVar = this.d;
        if (i10 != qnVar.f28198y0 && i10 != qnVar.C0 && i10 != qnVar.D0 && i10 != qnVar.f28199z0 && i10 != qnVar.A0 && i10 != qnVar.B0 && i10 != qnVar.E0 && i10 != qnVar.J0.f1700b && i10 != qnVar.K0.f1700b) {
            if (i10 != qnVar.f28176i0 && i10 != qnVar.f28184p0 && i10 != qnVar.f28190t0 && i10 != qnVar.f28180l0) {
                if (i10 == qnVar.f28183o0) {
                    return 1;
                }
                if (i10 != qnVar.f28189s0 && i10 != qnVar.f28191u0 && i10 != qnVar.f28182n0 && i10 != qnVar.H0) {
                    if (i10 != qnVar.f28187r0 && i10 != qnVar.F0 && i10 != qnVar.I0) {
                        if (i10 == qnVar.f28178j0) {
                            return 4;
                        }
                        if (i10 == qnVar.f28179k0) {
                            return 11;
                        }
                        if (i10 == qnVar.m0) {
                            return 7;
                        }
                        if (i10 != qnVar.f28192v0 && i10 != qnVar.f28194w0 && i10 != qnVar.G0) {
                            if (i10 == qnVar.f28196x0) {
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
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatPluralString;
        boolean z4;
        boolean z10;
        qn qnVar = this.d;
        boolean z11 = qnVar.f28162b0;
        b7.l0 l0Var = qnVar.J0;
        b7.l0 l0Var2 = qnVar.K0;
        org.telegram.ui.ActionBar.f6 f6Var = qnVar.f24277a;
        boolean z12 = qnVar.f28181n;
        int i15 = l1Var.f5788f;
        View view = l1Var.f5785a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z13 = true;
            boolean z14 = false;
            if (i15 != 6) {
                Context context = this.f27599c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == qnVar.f28198y0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !qnVar.U);
                                } else {
                                    if (i10 == qnVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, qnVar.V);
                                    } else if (i10 == qnVar.A0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, qnVar.O);
                                    } else if (i10 == qnVar.f28199z0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, qnVar.Q);
                                    } else if (i10 == qnVar.B0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, qnVar.P);
                                    } else if (i10 == qnVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, qnVar.W);
                                    } else if (i10 == l0Var2.f1700b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, l0Var2.f1699a);
                                    } else if (i10 == l0Var.f1700b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, l0Var.f1699a);
                                    } else if (i10 == qnVar.E0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (qnVar.R == 0 && qnVar.S == 0) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        a6Var.a(string, string2, 8, i17, z4);
                                        a6Var = a6Var;
                                        if (qnVar.R == 0 && qnVar.S == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.setDivider(z10);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == qnVar.D0) {
                                    a6Var.getCheckBox().f23182a.a(z11, false);
                                    return;
                                } else if (i10 == qnVar.f28199z0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!qnVar.W && !qnVar.U) {
                                        z13 = false;
                                    }
                                    checkBox.f23182a.a(z13, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f23182a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                    if (i10 == qnVar.I0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = qnVar.M0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        o8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == qnVar.F0) {
                        qnVar.U(o8Var, false);
                        return;
                    } else {
                        o8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20032k7, f6Var), mode));
                        nq nqVar = new nq(drawable, drawable2);
                        if (z12) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        o8Var.n(LocaleController.getString(i14), nqVar, false);
                        o8Var.f21534w = 20;
                        o8Var.f21533s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                a9Var.setFixedSize(0);
                new nq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7)).f27342w = true;
                if (i10 == qnVar.f28182n0) {
                    a9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == qnVar.f28191u0) {
                    a9Var.setFixedSize(12);
                    a9Var.setText(null);
                    return;
                } else {
                    int i18 = qnVar.G - qnVar.J;
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
                    } else if (i10 == qnVar.H0) {
                        a9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        a9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
            if (i10 == qnVar.f28192v0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z15 = qnVar.f28164c0;
                if (qnVar.f28194w0 != -1) {
                    z14 = true;
                }
                s8Var.f(string4, z15, z14);
                s8Var.e(null, true);
                return;
            } else if (i10 == qnVar.f28194w0) {
                s8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), qnVar.f28166d0, false);
                s8Var.e(null, true);
                return;
            } else if (i10 == qnVar.G0) {
                s8Var.f(LocaleController.getString(R.string.PollV2HideResults), qnVar.T, false);
                s8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == qnVar.f28176i0) {
            m4Var.getTextView().setGravity(19);
            if (z12) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == qnVar.f28180l0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == qnVar.f28184p0) {
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
            } else if (i10 == qnVar.f28190t0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        nn m4Var;
        View view;
        qn qnVar = this.d;
        boolean z4 = qnVar.f28181n;
        org.telegram.ui.ActionBar.f6 f6Var = qnVar.f24277a;
        Context context = this.f27599c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f27599c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, qnVar.f24277a);
                break;
            case 1:
                View z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.b) null);
                new nq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19871b7)).f27342w = true;
                m4Var = z6Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.a9(context, f6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.o8(context, f6Var);
                break;
            case 4:
            case 11:
                boolean z10 = qnVar.F;
                kn knVar = new kn(this, this.f27599c, z10 ? 1 : 0, qnVar.f24277a, i10);
                if (i10 == 11 && !z4) {
                    knVar.setTextRight(98);
                    knVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final on f25757b;

                        {
                            this.f25757b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    qn.O(this.f25757b.d, -2);
                                    return;
                                case 1:
                                    qn.O(this.f25757b.d, -3);
                                    return;
                                default:
                                    this.f25757b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                knVar.d();
                knVar.setIconsColor(org.telegram.ui.ActionBar.j6.f20104o7);
                knVar.c(new ln(this, knVar, i10));
                m4Var = knVar;
                break;
            case 5:
            default:
                boolean z11 = qnVar.F;
                nn nnVar = new nn(this, this.f27599c, z11 ? 1 : 0, new View.OnClickListener(this) {
                    public final on f25757b;

                    {
                        this.f25757b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                qn.O(this.f25757b.d, -2);
                                return;
                            case 1:
                                qn.O(this.f25757b.d, -3);
                                return;
                            default:
                                this.f25757b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                return;
                        }
                    }
                }, qnVar.f24277a);
                if (!z4) {
                    nnVar.setTextRight(140);
                    nnVar.b().setOnClickListener(new w2(8, this, nnVar));
                }
                int i11 = org.telegram.ui.ActionBar.j6.f20104o7;
                nnVar.setIconsColor(i11);
                lp lpVar = nnVar.f20920r;
                if (lpVar != null) {
                    lpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = lpVar.getCheckBoxBase();
                    float f10 = nnVar.f20915a.e;
                    if (checkBoxBase.f22970w != f10) {
                        checkBoxBase.f22970w = f10;
                        checkBoxBase.b();
                    }
                }
                nnVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.j6.f20032k7);
                nnVar.c(new cg.b0(this, nnVar, false, 8));
                nnVar.setShowNextButton(true);
                EditTextBoldCursor textView = nnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.yd(2, this, nnVar));
                textView.setOnKeyListener(new jn(nnVar, 0));
                m4Var = nnVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.s8(context, f6Var);
                break;
            case 7:
                mn mnVar = new mn(this, context, qnVar.F ? 1 : 0);
                mnVar.d();
                if (!z4) {
                    mnVar.setTextRight(98);
                    mnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final on f25757b;

                        {
                            this.f25757b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    qn.O(this.f25757b.d, -2);
                                    return;
                                case 1:
                                    qn.O(this.f25757b.d, -3);
                                    return;
                                default:
                                    this.f25757b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                mnVar.setIconsColor(org.telegram.ui.ActionBar.j6.f20104o7);
                mnVar.c(new cg.b0(this, mnVar, false, 7));
                m4Var = mnVar;
                break;
            case 8:
                View hnVar = new hn(context, 0);
                hnVar.setTag(-33024);
                view = hnVar;
                m4Var = view;
                break;
            case 9:
                View h0Var = new eg.h0(this, context, 9);
                h0Var.setTag(-33024);
                view = h0Var;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, f6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return org.telegram.ui.yh.o(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10;
        int i11;
        qn qnVar = this.d;
        dh.i iVar = qnVar.f28177i1;
        boolean z4 = qnVar.f28181n;
        int i12 = l1Var.f5788f;
        View view = l1Var.f5785a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            CharSequence charSequence2 = qnVar.K;
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
            qn.K(qnVar, view, l1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            CharSequence charSequence3 = qnVar.L;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            c6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            c6Var2.setTag(null);
            c6Var2.e.a(iVar.b(-2), false);
            qn.K(qnVar, view, l1Var.b());
        } else if (i12 == 5) {
            int b10 = l1Var.b();
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            c6Var3.f20915a.a(qnVar.V, false);
            int i13 = b10 - qnVar.f28185q0;
            CharSequence charSequence4 = qnVar.H[i13];
            if (z4) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var3.n(charSequence4, LocaleController.getString(i10), true);
            c6Var3.setTag(null);
            if (qnVar.f28174h0 == b10) {
                EditTextBoldCursor textView = c6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                qnVar.f28174h0 = -1;
            }
            if (!z4) {
                c6Var3.e.a(iVar.b(i13), false);
            }
            qn.K(qnVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.c6 c6Var4 = (org.telegram.ui.Cells.c6) view;
            c6Var4.setTag(1);
            CharSequence charSequence5 = qnVar.M;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            c6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var4.setTag(null);
            if (!z4) {
                c6Var4.e.a(iVar.b(-3), false);
            }
            qn.K(qnVar, view, l1Var.b());
        }
    }

    @Override
    public final void z(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) l1Var.f5785a).getTextView();
            if (textView.isFocused()) {
                qn qnVar = this.d;
                if (qnVar.F) {
                    gn gnVar = qnVar.f28195x;
                    if (gnVar != null) {
                        gnVar.f();
                    }
                    qnVar.Z(true);
                }
                qnVar.f28167d1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

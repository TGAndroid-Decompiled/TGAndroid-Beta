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
public final class xn extends ul0 {
    public final Context f29107c;
    public final zn d;

    public xn(zn znVar, Context context) {
        this.d = znVar;
        this.f29107c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        zn znVar = this.d;
        if (b10 != znVar.f29765u0 && b10 != znVar.G0 && b10 != znVar.B0 && b10 != znVar.F0 && b10 != znVar.C0 && b10 != znVar.H0 && b10 != znVar.D0 && b10 != znVar.E0 && b10 != znVar.I0 && b10 != znVar.J0 && b10 != znVar.N0.f4071b && b10 != znVar.M0.f4071b && b10 != znVar.L0) {
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
        zn znVar = this.d;
        if (i10 != znVar.B0 && i10 != znVar.F0 && i10 != znVar.G0 && i10 != znVar.C0 && i10 != znVar.D0 && i10 != znVar.E0 && i10 != znVar.H0 && i10 != znVar.M0.f4071b && i10 != znVar.N0.f4071b) {
            if (i10 != znVar.f29754l0 && i10 != znVar.f29763s0 && i10 != znVar.f29768w0 && i10 != znVar.f29757o0) {
                if (i10 == znVar.f29761r0) {
                    return 1;
                }
                if (i10 != znVar.f29766v0 && i10 != znVar.f29770x0 && i10 != znVar.f29759q0 && i10 != znVar.K0) {
                    if (i10 != znVar.f29765u0 && i10 != znVar.I0 && i10 != znVar.L0) {
                        if (i10 == znVar.m0) {
                            return 4;
                        }
                        if (i10 == znVar.f29756n0) {
                            return 11;
                        }
                        if (i10 == znVar.f29758p0) {
                            return 7;
                        }
                        if (i10 != znVar.f29772y0 && i10 != znVar.f29773z0 && i10 != znVar.J0) {
                            if (i10 == znVar.A0) {
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
        zn znVar = this.d;
        boolean z12 = znVar.f29740e0;
        c2.a aVar = znVar.M0;
        c2.a aVar2 = znVar.N0;
        org.telegram.ui.ActionBar.f6 f6Var = znVar.f26421a;
        boolean z13 = znVar.f29755n;
        int i15 = c1Var.f41613f;
        View view = c1Var.f41610a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f29107c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
                                b6Var.setDivider(false);
                                if (i10 == znVar.B0) {
                                    b6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !znVar.f29732a0);
                                } else {
                                    if (i10 == znVar.F0) {
                                        b6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, znVar.f29734b0);
                                    } else if (i10 == znVar.D0) {
                                        b6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, znVar.R);
                                    } else if (i10 == znVar.C0) {
                                        b6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, znVar.T);
                                    } else if (i10 == znVar.E0) {
                                        b6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, znVar.S);
                                    } else if (i10 == znVar.G0) {
                                        b6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, znVar.f29736c0);
                                    } else if (i10 == aVar2.f4071b) {
                                        b6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.f4070a);
                                    } else if (i10 == aVar.f4071b) {
                                        b6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.f4070a);
                                    } else if (i10 == znVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (znVar.U == 0 && znVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        b6Var.a(string, string2, 8, i17, z10);
                                        b6Var = b6Var;
                                        if (znVar.U == 0 && znVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        b6Var.setDivider(z11);
                                    }
                                    b6Var = b6Var;
                                }
                                if (i10 == znVar.G0) {
                                    b6Var.getCheckBox().f21282a.a(z12, false);
                                    return;
                                } else if (i10 == znVar.C0) {
                                    Switch checkBox = b6Var.getCheckBox();
                                    if (!znVar.f29736c0 && !znVar.f29732a0) {
                                        z14 = false;
                                    }
                                    checkBox.f21282a.a(z14, false);
                                    return;
                                } else {
                                    b6Var.getCheckBox().f21282a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    if (i10 == znVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = znVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        s8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == znVar.I0) {
                        znVar.U(s8Var, false);
                        return;
                    } else {
                        s8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18056k7, f6Var), mode));
                        vq vqVar = new vq(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        s8Var.n(LocaleController.getString(i14), vqVar, false);
                        s8Var.f20044w = 20;
                        s8Var.f20043s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                f9Var.setFixedSize(0);
                new vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7)).f28580w = true;
                if (i10 == znVar.f29759q0) {
                    f9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == znVar.f29770x0) {
                    f9Var.setFixedSize(12);
                    f9Var.setText(null);
                    return;
                } else {
                    int i18 = znVar.J - znVar.M;
                    if (i18 <= 0) {
                        if (z13) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        f9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z13) {
                        f9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i18));
                        return;
                    } else if (i10 == znVar.K0) {
                        f9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        f9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            if (i10 == znVar.f29772y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = znVar.f29742f0;
                if (znVar.f29773z0 != -1) {
                    z15 = true;
                }
                x8Var.f(string4, z16, z15);
                x8Var.e(null, true);
                return;
            } else if (i10 == znVar.f29773z0) {
                x8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), znVar.f29744g0, false);
                x8Var.e(null, true);
                return;
            } else if (i10 == znVar.J0) {
                x8Var.f(LocaleController.getString(R.string.PollV2HideResults), znVar.W, false);
                x8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == znVar.f29754l0) {
            m4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == znVar.f29757o0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == znVar.f29763s0) {
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
            } else if (i10 == znVar.f29768w0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        wn m4Var;
        View view;
        zn znVar = this.d;
        boolean z10 = znVar.f29755n;
        org.telegram.ui.ActionBar.f6 f6Var = znVar.f26421a;
        Context context = this.f29107c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f29107c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, znVar.f26421a);
                break;
            case 1:
                View c7Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                new vq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f17892b7)).f28580w = true;
                m4Var = c7Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.f9(context, f6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.s8(context, f6Var);
                break;
            case 4:
            case 11:
                boolean z11 = znVar.I;
                tn tnVar = new tn(this, this.f29107c, z11 ? 1 : 0, znVar.f26421a, i10);
                if (i10 == 11 && !z10) {
                    tnVar.setTextRight(98);
                    tnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final xn f26696b;

                        {
                            this.f26696b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    zn.O(this.f26696b.d, -2);
                                    return;
                                case 1:
                                    zn.O(this.f26696b.d, -3);
                                    return;
                                default:
                                    this.f26696b.d.X(view2, (org.telegram.ui.Cells.e6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                tnVar.d();
                tnVar.setIconsColor(org.telegram.ui.ActionBar.j6.f18127o7);
                tnVar.c(new un(this, tnVar, i10));
                m4Var = tnVar;
                break;
            case 5:
            default:
                boolean z12 = znVar.I;
                wn wnVar = new wn(this, this.f29107c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final xn f26696b;

                    {
                        this.f26696b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                zn.O(this.f26696b.d, -2);
                                return;
                            case 1:
                                zn.O(this.f26696b.d, -3);
                                return;
                            default:
                                this.f26696b.d.X(view2, (org.telegram.ui.Cells.e6) view2.getParent(), true);
                                return;
                        }
                    }
                }, znVar.f26421a);
                if (!z10) {
                    wnVar.setTextRight(140);
                    wnVar.b().setOnClickListener(new org.telegram.ui.sh(20, this, wnVar));
                }
                int i11 = org.telegram.ui.ActionBar.j6.f18127o7;
                wnVar.setIconsColor(i11);
                tp tpVar = wnVar.f19078r;
                if (tpVar != null) {
                    tpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = tpVar.getCheckBoxBase();
                    float f7 = wnVar.f19073a.e;
                    if (checkBoxBase.f21062w != f7) {
                        checkBoxBase.f21062w = f7;
                        checkBoxBase.b();
                    }
                }
                wnVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.j6.f18056k7);
                wnVar.c(new og.x(2, this, wnVar));
                wnVar.setShowNextButton(true);
                EditTextBoldCursor textView = wnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.xd(2, this, wnVar));
                textView.setOnKeyListener(new sn(wnVar, 0));
                m4Var = wnVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.x8(context, f6Var);
                break;
            case 7:
                vn vnVar = new vn(this, context, znVar.I ? 1 : 0);
                vnVar.d();
                if (!z10) {
                    vnVar.setTextRight(98);
                    vnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final xn f26696b;

                        {
                            this.f26696b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    zn.O(this.f26696b.d, -2);
                                    return;
                                case 1:
                                    zn.O(this.f26696b.d, -3);
                                    return;
                                default:
                                    this.f26696b.d.X(view2, (org.telegram.ui.Cells.e6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                vnVar.setIconsColor(org.telegram.ui.ActionBar.j6.f18127o7);
                vnVar.c(new og.x(1, this, vnVar));
                m4Var = vnVar;
                break;
            case 8:
                View qnVar = new qn(context, 0);
                qnVar.setTag(-33024);
                view = qnVar;
                m4Var = view;
                break;
            case 9:
                View ncVar = new bi.nc(this, context, 14);
                ncVar.setTag(-33024);
                view = ncVar;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.b6 b6Var = new org.telegram.ui.Cells.b6(context, f6Var);
                b6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = b6Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.j(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        zn znVar = this.d;
        ph.f fVar = znVar.l1;
        boolean z10 = znVar.f29755n;
        int i12 = c1Var.f41613f;
        View view = c1Var.f41610a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
            e6Var.setTag(1);
            CharSequence charSequence2 = znVar.N;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i11 = R.string.TodoTitlePlaceholder;
            } else {
                i11 = R.string.QuestionHint;
            }
            e6Var.n(charSequence, LocaleController.getString(i11), true);
            e6Var.setTag(null);
            zn.L(znVar, view, c1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.e6 e6Var2 = (org.telegram.ui.Cells.e6) view;
            e6Var2.setTag(1);
            CharSequence charSequence3 = znVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            e6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            e6Var2.setTag(null);
            e6Var2.e.a(fVar.b(-2), false);
            zn.L(znVar, view, c1Var.b());
        } else if (i12 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.e6 e6Var3 = (org.telegram.ui.Cells.e6) view;
            e6Var3.setTag(1);
            e6Var3.f19073a.a(znVar.f29734b0, false);
            int i13 = b10 - znVar.f29764t0;
            CharSequence charSequence4 = znVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            e6Var3.n(charSequence4, LocaleController.getString(i10), true);
            e6Var3.setTag(null);
            if (znVar.f29752k0 == b10) {
                EditTextBoldCursor textView = e6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                znVar.f29752k0 = -1;
            }
            if (!z10) {
                e6Var3.e.a(fVar.b(i13), false);
            }
            zn.L(znVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.e6 e6Var4 = (org.telegram.ui.Cells.e6) view;
            e6Var4.setTag(1);
            CharSequence charSequence5 = znVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            e6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            e6Var4.setTag(null);
            if (!z10) {
                e6Var4.e.a(fVar.b(-3), false);
            }
            zn.L(znVar, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.e6) c1Var.f41610a).getTextView();
            if (textView.isFocused()) {
                zn znVar = this.d;
                if (znVar.I) {
                    pn pnVar = znVar.f29769x;
                    if (pnVar != null) {
                        pnVar.f();
                    }
                    znVar.Z(true);
                }
                znVar.f29745g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

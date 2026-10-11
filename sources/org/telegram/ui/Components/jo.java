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
public final class jo extends qm0 {
    public final Context f27797c;
    public final lo d;

    public jo(lo loVar, Context context) {
        this.d = loVar;
        this.f27797c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        lo loVar = this.d;
        if (b10 != loVar.f28543u0 && b10 != loVar.G0 && b10 != loVar.B0 && b10 != loVar.F0 && b10 != loVar.C0 && b10 != loVar.H0 && b10 != loVar.D0 && b10 != loVar.E0 && b10 != loVar.I0 && b10 != loVar.J0 && b10 != loVar.N0.f3994b && b10 != loVar.M0.f3994b && b10 != loVar.L0) {
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
        lo loVar = this.d;
        if (i10 != loVar.B0 && i10 != loVar.F0 && i10 != loVar.G0 && i10 != loVar.C0 && i10 != loVar.D0 && i10 != loVar.E0 && i10 != loVar.H0 && i10 != loVar.M0.f3994b && i10 != loVar.N0.f3994b) {
            if (i10 != loVar.f28532l0 && i10 != loVar.f28541s0 && i10 != loVar.f28546w0 && i10 != loVar.f28535o0) {
                if (i10 == loVar.f28539r0) {
                    return 1;
                }
                if (i10 != loVar.f28544v0 && i10 != loVar.f28548x0 && i10 != loVar.f28537q0 && i10 != loVar.K0) {
                    if (i10 != loVar.f28543u0 && i10 != loVar.I0 && i10 != loVar.L0) {
                        if (i10 == loVar.m0) {
                            return 4;
                        }
                        if (i10 == loVar.f28534n0) {
                            return 11;
                        }
                        if (i10 == loVar.f28536p0) {
                            return 7;
                        }
                        if (i10 != loVar.f28550y0 && i10 != loVar.f28551z0 && i10 != loVar.J0) {
                            if (i10 == loVar.A0) {
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
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatPluralString;
        boolean z10;
        boolean z11;
        lo loVar = this.d;
        boolean z12 = loVar.f28518e0;
        c2.a aVar = loVar.M0;
        c2.a aVar2 = loVar.N0;
        org.telegram.ui.ActionBar.d6 d6Var = loVar.f30244a;
        boolean z13 = loVar.f28533n;
        int i15 = d1Var.f47786f;
        View view = d1Var.f47782a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f27797c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == loVar.B0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), e50.f25985c, R.drawable.filled_poll_view_24, !loVar.f28510a0);
                                } else {
                                    if (i10 == loVar.F0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), e50.f25987f, R.drawable.filled_poll_multiple_24, loVar.f28512b0);
                                    } else if (i10 == loVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), e50.v, R.drawable.filled_poll_revote_24, loVar.R);
                                    } else if (i10 == loVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), e50.f25990s, R.drawable.filled_poll_add_24, loVar.T);
                                    } else if (i10 == loVar.E0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), e50.h, R.drawable.filled_poll_shuffle_24, loVar.S);
                                    } else if (i10 == loVar.G0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), e50.f25988n, R.drawable.filled_poll_correct_24, loVar.f28514c0);
                                    } else if (i10 == aVar2.f3994b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), e50.f25986e, R.drawable.filled_location, aVar2.f3993a);
                                    } else if (i10 == aVar.f3994b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), e50.d, R.drawable.msg_folders_groups, aVar.f3993a);
                                    } else if (i10 == loVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (loVar.U == 0 && loVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.a(string, string2, e50.f25989r, i17, z10);
                                        a6Var = a6Var;
                                        if (loVar.U == 0 && loVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        a6Var.setDivider(z11);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == loVar.G0) {
                                    a6Var.getCheckBox().f24365a.a(z12, false);
                                    return;
                                } else if (i10 == loVar.C0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!loVar.f28514c0 && !loVar.f28510a0) {
                                        z14 = false;
                                    }
                                    checkBox.f24365a.a(z14, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f24365a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == loVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = loVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        r8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == loVar.I0) {
                        loVar.X(r8Var, false);
                        return;
                    } else {
                        r8Var.e(-1, org.telegram.ui.ActionBar.h6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.N6, d6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20951k7, d6Var), mode));
                        fr frVar = new fr(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), frVar, false);
                        r8Var.f22753w = 20;
                        r8Var.f22752s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                new fr(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20766a7, d6Var)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20786b7)).f26552w = true;
                if (i10 == loVar.f28537q0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == loVar.f28548x0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = loVar.J - loVar.M;
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
                    } else if (i10 == loVar.K0) {
                        e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == loVar.f28550y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = loVar.f28520f0;
                if (loVar.f28551z0 != -1) {
                    z15 = true;
                }
                w8Var.f(string4, z16, z15);
                w8Var.e(null, true);
                return;
            } else if (i10 == loVar.f28551z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), loVar.f28522g0, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == loVar.J0) {
                w8Var.f(LocaleController.getString(R.string.PollV2HideResults), loVar.W, false);
                w8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == loVar.f28532l0) {
            m4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == loVar.f28535o0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == loVar.f28541s0) {
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
            } else if (i10 == loVar.f28546w0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        io m4Var;
        View view;
        lo loVar = this.d;
        boolean z10 = loVar.f28533n;
        org.telegram.ui.ActionBar.d6 d6Var = loVar.f30244a;
        Context context = this.f27797c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f27797c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, loVar.f30244a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                new fr(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20766a7, d6Var)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20786b7)).f26552w = true;
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
                boolean z11 = loVar.I;
                eo eoVar = new eo(this, this.f27797c, z11 ? 1 : 0, loVar.f30244a, i10);
                if (i10 == 11 && !z10) {
                    eoVar.setTextRight(98);
                    eoVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final jo f25051b;

                        {
                            this.f25051b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    lo.R(this.f25051b.d, -2);
                                    return;
                                case 1:
                                    lo.R(this.f25051b.d, -3);
                                    return;
                                default:
                                    this.f25051b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                eoVar.d();
                eoVar.setIconsColor(org.telegram.ui.ActionBar.h6.f21026o7);
                eoVar.c(new fo(this, eoVar, i10));
                m4Var = eoVar;
                break;
            case 5:
            default:
                boolean z12 = loVar.I;
                io ioVar = new io(this, this.f27797c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final jo f25051b;

                    {
                        this.f25051b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                lo.R(this.f25051b.d, -2);
                                return;
                            case 1:
                                lo.R(this.f25051b.d, -3);
                                return;
                            default:
                                this.f25051b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                return;
                        }
                    }
                }, loVar.f30244a);
                if (!z10) {
                    ioVar.setTextRight(140);
                    ioVar.b().setOnClickListener(new org.telegram.ui.rf(23, this, ioVar));
                }
                int i11 = org.telegram.ui.ActionBar.h6.f21026o7;
                ioVar.setIconsColor(i11);
                dq dqVar = ioVar.f22005r;
                if (dqVar != null) {
                    dqVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = dqVar.getCheckBoxBase();
                    float f7 = ioVar.f21999a.f16401e;
                    if (checkBoxBase.f24130w != f7) {
                        checkBoxBase.f24130w = f7;
                        checkBoxBase.b();
                    }
                }
                ioVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.h6.f20951k7);
                ioVar.c(new ho(1, this, ioVar));
                ioVar.setShowNextButton(true);
                EditTextBoldCursor textView = ioVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.vd(2, this, ioVar));
                textView.setOnKeyListener(new co(ioVar, 0));
                m4Var = ioVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, d6Var);
                break;
            case 7:
                go goVar = new go(this, context, loVar.I ? 1 : 0);
                goVar.d();
                if (!z10) {
                    goVar.setTextRight(98);
                    goVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final jo f25051b;

                        {
                            this.f25051b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    lo.R(this.f25051b.d, -2);
                                    return;
                                case 1:
                                    lo.R(this.f25051b.d, -3);
                                    return;
                                default:
                                    this.f25051b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                goVar.setIconsColor(org.telegram.ui.ActionBar.h6.f21026o7);
                goVar.c(new ho(0, this, goVar));
                m4Var = goVar;
                break;
            case 8:
                View aoVar = new ao(context, 0);
                aoVar.setTag(-33024);
                view = aoVar;
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
    public final void y(s4.d1 d1Var) {
        int i10;
        int i11;
        lo loVar = this.d;
        qh.f fVar = loVar.l1;
        boolean z10 = loVar.f28533n;
        int i12 = d1Var.f47786f;
        View view = d1Var.f47782a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence2 = loVar.N;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i11 = R.string.TodoTitlePlaceholder;
            } else {
                i11 = R.string.QuestionHint;
            }
            d6Var.o(charSequence, LocaleController.getString(i11), true);
            d6Var.setTag(null);
            lo.O(loVar, view, d1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence3 = loVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            d6Var2.o(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.f22002e.a(fVar.b(-2), false);
            lo.O(loVar, view, d1Var.b());
        } else if (i12 == 5) {
            int b10 = d1Var.b();
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            d6Var3.f21999a.a(loVar.f28512b0, false);
            int i13 = b10 - loVar.f28542t0;
            CharSequence charSequence4 = loVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var3.o(charSequence4, LocaleController.getString(i10), true);
            d6Var3.setTag(null);
            if (loVar.f28530k0 == b10) {
                EditTextBoldCursor textView = d6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                loVar.f28530k0 = -1;
            }
            if (!z10) {
                d6Var3.f22002e.a(fVar.b(i13), false);
            }
            lo.O(loVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
            d6Var4.setTag(1);
            CharSequence charSequence5 = loVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            d6Var4.o(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var4.setTag(null);
            if (!z10) {
                d6Var4.f22002e.a(fVar.b(-3), false);
            }
            lo.O(loVar, view, d1Var.b());
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        int i10 = d1Var.f47786f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) d1Var.f47782a).getTextView();
            if (textView.isFocused()) {
                lo loVar = this.d;
                if (loVar.I) {
                    zn znVar = loVar.f28547x;
                    if (znVar != null) {
                        znVar.f();
                    }
                    loVar.c0(true);
                }
                loVar.f28523g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

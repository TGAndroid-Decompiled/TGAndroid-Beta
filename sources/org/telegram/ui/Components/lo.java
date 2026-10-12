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
public final class lo extends vm0 {
    public final Context f28252c;
    public final no d;

    public lo(no noVar, Context context) {
        this.d = noVar;
        this.f28252c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int b10 = d1Var.b();
        no noVar = this.d;
        if (b10 != noVar.f28906u0 && b10 != noVar.G0 && b10 != noVar.B0 && b10 != noVar.F0 && b10 != noVar.C0 && b10 != noVar.H0 && b10 != noVar.D0 && b10 != noVar.E0 && b10 != noVar.I0 && b10 != noVar.J0 && b10 != noVar.N0.f3993b && b10 != noVar.M0.f3993b && b10 != noVar.L0) {
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
        no noVar = this.d;
        if (i10 != noVar.B0 && i10 != noVar.F0 && i10 != noVar.G0 && i10 != noVar.C0 && i10 != noVar.D0 && i10 != noVar.E0 && i10 != noVar.H0 && i10 != noVar.M0.f3993b && i10 != noVar.N0.f3993b) {
            if (i10 != noVar.f28895l0 && i10 != noVar.f28904s0 && i10 != noVar.f28909w0 && i10 != noVar.f28898o0) {
                if (i10 == noVar.f28902r0) {
                    return 1;
                }
                if (i10 != noVar.f28907v0 && i10 != noVar.f28911x0 && i10 != noVar.f28900q0 && i10 != noVar.K0) {
                    if (i10 != noVar.f28906u0 && i10 != noVar.I0 && i10 != noVar.L0) {
                        if (i10 == noVar.m0) {
                            return 4;
                        }
                        if (i10 == noVar.f28897n0) {
                            return 11;
                        }
                        if (i10 == noVar.f28899p0) {
                            return 7;
                        }
                        if (i10 != noVar.f28913y0 && i10 != noVar.f28914z0 && i10 != noVar.J0) {
                            if (i10 == noVar.A0) {
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
        no noVar = this.d;
        boolean z12 = noVar.f28881e0;
        c2.a aVar = noVar.M0;
        c2.a aVar2 = noVar.N0;
        org.telegram.ui.ActionBar.c6 c6Var = noVar.f30573a;
        boolean z13 = noVar.f28896n;
        int i15 = d1Var.f47893f;
        View view = d1Var.f47889a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f28252c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == noVar.B0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), g50.f26281c, R.drawable.filled_poll_view_24, !noVar.f28873a0);
                                } else {
                                    if (i10 == noVar.F0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), g50.f26283f, R.drawable.filled_poll_multiple_24, noVar.f28875b0);
                                    } else if (i10 == noVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), g50.v, R.drawable.filled_poll_revote_24, noVar.R);
                                    } else if (i10 == noVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), g50.f26286s, R.drawable.filled_poll_add_24, noVar.T);
                                    } else if (i10 == noVar.E0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), g50.h, R.drawable.filled_poll_shuffle_24, noVar.S);
                                    } else if (i10 == noVar.G0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), g50.f26284n, R.drawable.filled_poll_correct_24, noVar.f28877c0);
                                    } else if (i10 == aVar2.f3993b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), g50.f26282e, R.drawable.filled_location, aVar2.f3992a);
                                    } else if (i10 == aVar.f3993b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), g50.d, R.drawable.msg_folders_groups, aVar.f3992a);
                                    } else if (i10 == noVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (noVar.U == 0 && noVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.a(string, string2, g50.f26285r, i17, z10);
                                        a6Var = a6Var;
                                        if (noVar.U == 0 && noVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        a6Var.setDivider(z11);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == noVar.G0) {
                                    a6Var.getCheckBox().f24114a.a(z12, false);
                                    return;
                                } else if (i10 == noVar.C0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!noVar.f28877c0 && !noVar.f28873a0) {
                                        z14 = false;
                                    }
                                    checkBox.f24114a.a(z14, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f24114a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == noVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = noVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        r8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == noVar.I0) {
                        noVar.X(r8Var, false);
                        return;
                    } else {
                        r8Var.e(-1, org.telegram.ui.ActionBar.h6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.N6, c6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20688k7, c6Var), mode));
                        hr hrVar = new hr(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), hrVar, false);
                        r8Var.f22488w = 20;
                        r8Var.f22487s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                new hr(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20503a7, c6Var)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20523b7)).f26897w = true;
                if (i10 == noVar.f28900q0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == noVar.f28911x0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = noVar.J - noVar.M;
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
                    } else if (i10 == noVar.K0) {
                        e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == noVar.f28913y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = noVar.f28883f0;
                if (noVar.f28914z0 != -1) {
                    z15 = true;
                }
                w8Var.f(string4, z16, z15);
                w8Var.e(null, true);
                return;
            } else if (i10 == noVar.f28914z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), noVar.f28885g0, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == noVar.J0) {
                w8Var.f(LocaleController.getString(R.string.PollV2HideResults), noVar.W, false);
                w8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == noVar.f28895l0) {
            m4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == noVar.f28898o0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == noVar.f28904s0) {
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
            } else if (i10 == noVar.f28909w0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        ko m4Var;
        View view;
        no noVar = this.d;
        boolean z10 = noVar.f28896n;
        org.telegram.ui.ActionBar.c6 c6Var = noVar.f30573a;
        Context context = this.f28252c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f28252c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, noVar.f30573a);
                break;
            case 1:
                View a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
                new hr(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20503a7, c6Var)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20523b7)).f26897w = true;
                m4Var = a7Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, c6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.r8(context, c6Var);
                break;
            case 4:
            case 11:
                boolean z11 = noVar.I;
                go goVar = new go(this, this.f28252c, z11 ? 1 : 0, noVar.f30573a, i10);
                if (i10 == 11 && !z10) {
                    goVar.setTextRight(98);
                    goVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final lo f25735b;

                        {
                            this.f25735b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    no.R(this.f25735b.d, -2);
                                    return;
                                case 1:
                                    no.R(this.f25735b.d, -3);
                                    return;
                                default:
                                    this.f25735b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                goVar.d();
                goVar.setIconsColor(org.telegram.ui.ActionBar.h6.f20763o7);
                goVar.c(new ho(this, goVar, i10));
                m4Var = goVar;
                break;
            case 5:
            default:
                boolean z12 = noVar.I;
                ko koVar = new ko(this, this.f28252c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final lo f25735b;

                    {
                        this.f25735b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                no.R(this.f25735b.d, -2);
                                return;
                            case 1:
                                no.R(this.f25735b.d, -3);
                                return;
                            default:
                                this.f25735b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                return;
                        }
                    }
                }, noVar.f30573a);
                if (!z10) {
                    koVar.setTextRight(140);
                    koVar.b().setOnClickListener(new org.telegram.ui.wf(23, this, koVar));
                }
                int i11 = org.telegram.ui.ActionBar.h6.f20763o7;
                koVar.setIconsColor(i11);
                fq fqVar = koVar.f21739r;
                if (fqVar != null) {
                    fqVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = fqVar.getCheckBoxBase();
                    float f7 = koVar.f21733a.f16087e;
                    if (checkBoxBase.f23879w != f7) {
                        checkBoxBase.f23879w = f7;
                        checkBoxBase.b();
                    }
                }
                koVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.h6.f20688k7);
                koVar.c(new jo(1, this, koVar));
                koVar.setShowNextButton(true);
                EditTextBoldCursor textView = koVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.ae(2, this, koVar));
                textView.setOnKeyListener(new fo(koVar, 0));
                m4Var = koVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, c6Var);
                break;
            case 7:
                io ioVar = new io(this, context, noVar.I ? 1 : 0);
                ioVar.d();
                if (!z10) {
                    ioVar.setTextRight(98);
                    ioVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final lo f25735b;

                        {
                            this.f25735b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    no.R(this.f25735b.d, -2);
                                    return;
                                case 1:
                                    no.R(this.f25735b.d, -3);
                                    return;
                                default:
                                    this.f25735b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                ioVar.setIconsColor(org.telegram.ui.ActionBar.h6.f20763o7);
                ioVar.c(new jo(0, this, ioVar));
                m4Var = ioVar;
                break;
            case 8:
                View coVar = new co(context, 0);
                coVar.setTag(-33024);
                view = coVar;
                m4Var = view;
                break;
            case 9:
                View bbVar = new ci.bb(this, context, 14);
                bbVar.setTag(-33024);
                view = bbVar;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, c6Var);
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
        no noVar = this.d;
        qh.f fVar = noVar.l1;
        boolean z10 = noVar.f28896n;
        int i12 = d1Var.f47893f;
        View view = d1Var.f47889a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence2 = noVar.N;
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
            no.O(noVar, view, d1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence3 = noVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            d6Var2.o(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.f21736e.a(fVar.b(-2), false);
            no.O(noVar, view, d1Var.b());
        } else if (i12 == 5) {
            int b10 = d1Var.b();
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            d6Var3.f21733a.a(noVar.f28875b0, false);
            int i13 = b10 - noVar.f28905t0;
            CharSequence charSequence4 = noVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var3.o(charSequence4, LocaleController.getString(i10), true);
            d6Var3.setTag(null);
            if (noVar.f28893k0 == b10) {
                EditTextBoldCursor textView = d6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                noVar.f28893k0 = -1;
            }
            if (!z10) {
                d6Var3.f21736e.a(fVar.b(i13), false);
            }
            no.O(noVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
            d6Var4.setTag(1);
            CharSequence charSequence5 = noVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            d6Var4.o(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var4.setTag(null);
            if (!z10) {
                d6Var4.f21736e.a(fVar.b(-3), false);
            }
            no.O(noVar, view, d1Var.b());
        }
    }

    @Override
    public final void z(s4.d1 d1Var) {
        int i10 = d1Var.f47893f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) d1Var.f47889a).getTextView();
            if (textView.isFocused()) {
                no noVar = this.d;
                if (noVar.I) {
                    bo boVar = noVar.f28910x;
                    if (boVar != null) {
                        boVar.f();
                    }
                    noVar.c0(true);
                }
                noVar.f28886g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

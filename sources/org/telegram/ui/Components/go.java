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
public final class go extends lm0 {
    public final Context f25370c;
    public final io d;

    public go(io ioVar, Context context) {
        this.d = ioVar;
        this.f25370c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        io ioVar = this.d;
        if (b10 != ioVar.f26034u0 && b10 != ioVar.G0 && b10 != ioVar.B0 && b10 != ioVar.F0 && b10 != ioVar.C0 && b10 != ioVar.H0 && b10 != ioVar.D0 && b10 != ioVar.E0 && b10 != ioVar.I0 && b10 != ioVar.J0 && b10 != ioVar.N0.f4357a && b10 != ioVar.M0.f4357a && b10 != ioVar.L0) {
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
        io ioVar = this.d;
        if (i10 != ioVar.B0 && i10 != ioVar.F0 && i10 != ioVar.G0 && i10 != ioVar.C0 && i10 != ioVar.D0 && i10 != ioVar.E0 && i10 != ioVar.H0 && i10 != ioVar.M0.f4357a && i10 != ioVar.N0.f4357a) {
            if (i10 != ioVar.f26023l0 && i10 != ioVar.f26032s0 && i10 != ioVar.f26037w0 && i10 != ioVar.f26026o0) {
                if (i10 == ioVar.f26030r0) {
                    return 1;
                }
                if (i10 != ioVar.f26035v0 && i10 != ioVar.f26039x0 && i10 != ioVar.f26028q0 && i10 != ioVar.K0) {
                    if (i10 != ioVar.f26034u0 && i10 != ioVar.I0 && i10 != ioVar.L0) {
                        if (i10 == ioVar.m0) {
                            return 4;
                        }
                        if (i10 == ioVar.f26025n0) {
                            return 11;
                        }
                        if (i10 == ioVar.f26027p0) {
                            return 7;
                        }
                        if (i10 != ioVar.f26041y0 && i10 != ioVar.f26042z0 && i10 != ioVar.J0) {
                            if (i10 == ioVar.A0) {
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
        io ioVar = this.d;
        boolean z12 = ioVar.f26009e0;
        c5.f fVar = ioVar.M0;
        c5.f fVar2 = ioVar.N0;
        org.telegram.ui.ActionBar.c6 c6Var = ioVar.f27670a;
        boolean z13 = ioVar.f26024n;
        int i15 = b1Var.f44841f;
        View view = b1Var.f44838a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f25370c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == ioVar.B0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), z40.f31755c, R.drawable.filled_poll_view_24, !ioVar.f26001a0);
                                } else {
                                    if (i10 == ioVar.F0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), z40.f31756f, R.drawable.filled_poll_multiple_24, ioVar.f26003b0);
                                    } else if (i10 == ioVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), z40.v, R.drawable.filled_poll_revote_24, ioVar.R);
                                    } else if (i10 == ioVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), z40.f31759s, R.drawable.filled_poll_add_24, ioVar.T);
                                    } else if (i10 == ioVar.E0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), z40.h, R.drawable.filled_poll_shuffle_24, ioVar.S);
                                    } else if (i10 == ioVar.G0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), z40.f31757n, R.drawable.filled_poll_correct_24, ioVar.f26005c0);
                                    } else if (i10 == fVar2.f4357a) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), z40.e, R.drawable.filled_location, fVar2.f4358b);
                                    } else if (i10 == fVar.f4357a) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), z40.d, R.drawable.msg_folders_groups, fVar.f4358b);
                                    } else if (i10 == ioVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (ioVar.U == 0 && ioVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.a(string, string2, z40.f31758r, i17, z10);
                                        a6Var = a6Var;
                                        if (ioVar.U == 0 && ioVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        a6Var.setDivider(z11);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == ioVar.G0) {
                                    a6Var.getCheckBox().f23317a.a(z12, false);
                                    return;
                                } else if (i10 == ioVar.C0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!ioVar.f26005c0 && !ioVar.f26001a0) {
                                        z14 = false;
                                    }
                                    checkBox.f23317a.a(z14, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f23317a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == ioVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = ioVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        r8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == ioVar.I0) {
                        ioVar.X(r8Var, false);
                        return;
                    } else {
                        r8Var.e(-1, org.telegram.ui.ActionBar.g6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.N6, c6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20029k7, c6Var), mode));
                        cr crVar = new cr(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), crVar, false);
                        r8Var.f21766w = 20;
                        r8Var.f21765s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                new cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, c6Var)), org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19863b7)).f24198w = true;
                if (i10 == ioVar.f26028q0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == ioVar.f26039x0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = ioVar.J - ioVar.M;
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
                    } else if (i10 == ioVar.K0) {
                        e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == ioVar.f26041y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = ioVar.f26011f0;
                if (ioVar.f26042z0 != -1) {
                    z15 = true;
                }
                w8Var.f(string4, z16, z15);
                w8Var.e(null, true);
                return;
            } else if (i10 == ioVar.f26042z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), ioVar.f26013g0, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == ioVar.J0) {
                w8Var.f(LocaleController.getString(R.string.PollV2HideResults), ioVar.W, false);
                w8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == ioVar.f26023l0) {
            m4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == ioVar.f26026o0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == ioVar.f26032s0) {
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
            } else if (i10 == ioVar.f26037w0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        fo m4Var;
        View view;
        io ioVar = this.d;
        boolean z10 = ioVar.f26024n;
        org.telegram.ui.ActionBar.c6 c6Var = ioVar.f27670a;
        Context context = this.f25370c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f25370c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, ioVar.f27670a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.d0) null);
                new cr(new ColorDrawable(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19843a7, c6Var)), org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f19863b7)).f24198w = true;
                m4Var = b7Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, c6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.r8(context, c6Var);
                break;
            case 4:
            case 11:
                boolean z11 = ioVar.I;
                ao aoVar = new ao(this, this.f25370c, z11 ? 1 : 0, ioVar.f27670a, i10);
                if (i10 == 11 && !z10) {
                    aoVar.setTextRight(98);
                    aoVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final go f31652b;

                        {
                            this.f31652b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    io.R(this.f31652b.d, -2);
                                    return;
                                case 1:
                                    io.R(this.f31652b.d, -3);
                                    return;
                                default:
                                    this.f31652b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                aoVar.c();
                aoVar.setIconsColor(org.telegram.ui.ActionBar.g6.f20105o7);
                aoVar.b(new bo(this, aoVar, i10));
                m4Var = aoVar;
                break;
            case 5:
            default:
                boolean z12 = ioVar.I;
                fo foVar = new fo(this, this.f25370c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final go f31652b;

                    {
                        this.f31652b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                io.R(this.f31652b.d, -2);
                                return;
                            case 1:
                                io.R(this.f31652b.d, -3);
                                return;
                            default:
                                this.f31652b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                return;
                        }
                    }
                }, ioVar.f27670a);
                if (!z10) {
                    foVar.setTextRight(140);
                    foVar.a().setOnClickListener(new org.telegram.ui.xf(23, this, foVar));
                }
                int i11 = org.telegram.ui.ActionBar.g6.f20105o7;
                foVar.setIconsColor(i11);
                aq aqVar = foVar.f21074r;
                if (aqVar != null) {
                    aqVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = aqVar.getCheckBoxBase();
                    float f7 = foVar.f21069a.e;
                    if (checkBoxBase.f23097w != f7) {
                        checkBoxBase.f23097w = f7;
                        checkBoxBase.b();
                    }
                }
                foVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.g6.f20029k7);
                foVar.b(new eo(1, this, foVar));
                foVar.setShowNextButton(true);
                EditTextBoldCursor textView = foVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.ce(2, this, foVar));
                textView.setOnKeyListener(new zn(foVar, 0));
                m4Var = foVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, c6Var);
                break;
            case 7:
                co coVar = new co(this, context, ioVar.I ? 1 : 0);
                coVar.c();
                if (!z10) {
                    coVar.setTextRight(98);
                    coVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final go f31652b;

                        {
                            this.f31652b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    io.R(this.f31652b.d, -2);
                                    return;
                                case 1:
                                    io.R(this.f31652b.d, -3);
                                    return;
                                default:
                                    this.f31652b.d.a0(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                coVar.setIconsColor(org.telegram.ui.ActionBar.g6.f20105o7);
                coVar.b(new eo(0, this, coVar));
                m4Var = coVar;
                break;
            case 8:
                View xnVar = new xn(context, 0);
                xnVar.setTag(-33024);
                view = xnVar;
                m4Var = view;
                break;
            case 9:
                View abVar = new di.ab(this, context, 14);
                abVar.setTag(-33024);
                view = abVar;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, c6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10;
        int i11;
        io ioVar = this.d;
        rh.f fVar = ioVar.l1;
        boolean z10 = ioVar.f26024n;
        int i12 = b1Var.f44841f;
        View view = b1Var.f44838a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence2 = ioVar.N;
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
            io.O(ioVar, view, b1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence3 = ioVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            d6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            io.O(ioVar, view, b1Var.b());
        } else if (i12 == 5) {
            int b10 = b1Var.b();
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            d6Var3.f21069a.a(ioVar.f26003b0, false);
            int i13 = b10 - ioVar.f26033t0;
            CharSequence charSequence4 = ioVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var3.n(charSequence4, LocaleController.getString(i10), true);
            d6Var3.setTag(null);
            if (ioVar.f26021k0 == b10) {
                EditTextBoldCursor textView = d6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                ioVar.f26021k0 = -1;
            }
            if (!z10) {
                d6Var3.e.a(fVar.b(i13), false);
            }
            io.O(ioVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
            d6Var4.setTag(1);
            CharSequence charSequence5 = ioVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            d6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var4.setTag(null);
            if (!z10) {
                d6Var4.e.a(fVar.b(-3), false);
            }
            io.O(ioVar, view, b1Var.b());
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.f44838a).getTextView();
            if (textView.isFocused()) {
                io ioVar = this.d;
                if (ioVar.I) {
                    wn wnVar = ioVar.f26038x;
                    if (wnVar != null) {
                        wnVar.f();
                    }
                    ioVar.c0(true);
                }
                ioVar.f26014g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

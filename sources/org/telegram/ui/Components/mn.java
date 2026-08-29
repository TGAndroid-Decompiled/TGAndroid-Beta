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
public final class mn extends il0 {
    public final Context f30733c;
    public final on d;

    public mn(on onVar, Context context) {
        this.d = onVar;
        this.f30733c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int b10 = n1Var.b();
        on onVar = this.d;
        if (b10 != onVar.f31424q0 && b10 != onVar.C0 && b10 != onVar.f31435x0 && b10 != onVar.B0 && b10 != onVar.f31437y0 && b10 != onVar.D0 && b10 != onVar.f31438z0 && b10 != onVar.A0 && b10 != onVar.E0 && b10 != onVar.F0 && b10 != onVar.J0.f16482b && b10 != onVar.I0.f16482b && b10 != onVar.H0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.M0;
    }

    @Override
    public final int j(int i10) {
        on onVar = this.d;
        if (i10 != onVar.f31435x0 && i10 != onVar.B0 && i10 != onVar.C0 && i10 != onVar.f31437y0 && i10 != onVar.f31438z0 && i10 != onVar.A0 && i10 != onVar.D0 && i10 != onVar.I0.f16482b && i10 != onVar.J0.f16482b) {
            if (i10 != onVar.f31414h0 && i10 != onVar.f31422o0 && i10 != onVar.f31428s0 && i10 != onVar.f31418k0) {
                if (i10 == onVar.f31421n0) {
                    return 1;
                }
                if (i10 != onVar.f31426r0 && i10 != onVar.f31429t0 && i10 != onVar.m0 && i10 != onVar.G0) {
                    if (i10 != onVar.f31424q0 && i10 != onVar.E0 && i10 != onVar.H0) {
                        if (i10 == onVar.f31416i0) {
                            return 4;
                        }
                        if (i10 == onVar.f31417j0) {
                            return 11;
                        }
                        if (i10 == onVar.f31419l0) {
                            return 7;
                        }
                        if (i10 != onVar.f31430u0 && i10 != onVar.f31431v0 && i10 != onVar.F0) {
                            if (i10 == onVar.f31433w0) {
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
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatPluralString;
        boolean z10;
        boolean z11;
        on onVar = this.d;
        boolean z12 = onVar.f31400a0;
        m.a aVar = onVar.I0;
        m.a aVar2 = onVar.J0;
        org.telegram.ui.ActionBar.c6 c6Var = onVar.f28402a;
        boolean z13 = onVar.f31420n;
        int i15 = n1Var.f6436f;
        View view = n1Var.f6432a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f30733c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) view;
                                y5Var.setDivider(false);
                                if (i10 == onVar.f31435x0) {
                                    y5Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !onVar.T);
                                } else {
                                    if (i10 == onVar.B0) {
                                        y5Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, onVar.U);
                                    } else if (i10 == onVar.f31438z0) {
                                        y5Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, onVar.N);
                                    } else if (i10 == onVar.f31437y0) {
                                        y5Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, onVar.P);
                                    } else if (i10 == onVar.A0) {
                                        y5Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, onVar.O);
                                    } else if (i10 == onVar.C0) {
                                        y5Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, onVar.V);
                                    } else if (i10 == aVar2.f16482b) {
                                        y5Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.f16481a);
                                    } else if (i10 == aVar.f16482b) {
                                        y5Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.f16481a);
                                    } else if (i10 == onVar.D0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (onVar.Q == 0 && onVar.R == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        y5Var.a(string, string2, 8, i17, z10);
                                        y5Var = y5Var;
                                        if (onVar.Q == 0 && onVar.R == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        y5Var.setDivider(z11);
                                    }
                                    y5Var = y5Var;
                                }
                                if (i10 == onVar.C0) {
                                    y5Var.getCheckBox().f26553a.a(z12, false);
                                    return;
                                } else if (i10 == onVar.f31437y0) {
                                    Switch checkBox = y5Var.getCheckBox();
                                    if (!onVar.V && !onVar.T) {
                                        z14 = false;
                                    }
                                    checkBox.f26553a.a(z14, false);
                                    return;
                                } else {
                                    y5Var.getCheckBox().f26553a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (i10 == onVar.H0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = onVar.L0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        m8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == onVar.E0) {
                        onVar.U(m8Var, false);
                        return;
                    } else {
                        m8Var.e(-1, org.telegram.ui.ActionBar.g6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.N6, c6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23190k7, c6Var), mode));
                        jq jqVar = new jq(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        m8Var.n(LocaleController.getString(i14), jqVar, false);
                        m8Var.f24716w = 20;
                        m8Var.f24715s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
                y8Var.setFixedSize(0);
                new jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, c6Var)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7)).f29792w = true;
                if (i10 == onVar.m0) {
                    y8Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == onVar.f31429t0) {
                    y8Var.setFixedSize(12);
                    y8Var.setText(null);
                    return;
                } else {
                    int i18 = onVar.F - onVar.I;
                    if (i18 <= 0) {
                        if (z13) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        y8Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z13) {
                        y8Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i18));
                        return;
                    } else if (i10 == onVar.G0) {
                        y8Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        y8Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            if (i10 == onVar.f31430u0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = onVar.f31402b0;
                if (onVar.f31431v0 != -1) {
                    z15 = true;
                }
                q8Var.f(string4, z16, z15);
                q8Var.e(null, true);
                return;
            } else if (i10 == onVar.f31431v0) {
                q8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), onVar.f31404c0, false);
                q8Var.e(null, true);
                return;
            } else if (i10 == onVar.F0) {
                q8Var.f(LocaleController.getString(R.string.PollV2HideResults), onVar.S, false);
                q8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
        if (i10 == onVar.f31414h0) {
            k4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            k4Var.setText(LocaleController.getString(i12));
        } else if (i10 == onVar.f31418k0) {
            k4Var.getTextView().setGravity(19);
            k4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = k4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == onVar.f31422o0) {
                if (z12) {
                    k4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                    return;
                }
                if (z13) {
                    i11 = R.string.TodoItemsTitle;
                } else {
                    i11 = R.string.AnswerOptions2;
                }
                k4Var.setText(LocaleController.getString(i11));
            } else if (i10 == onVar.f31428s0) {
                k4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        ln k4Var;
        View view;
        on onVar = this.d;
        boolean z10 = onVar.f31420n;
        org.telegram.ui.ActionBar.c6 c6Var = onVar.f28402a;
        Context context = this.f30733c;
        switch (i10) {
            case 0:
                k4Var = new org.telegram.ui.Cells.k4(this.f30733c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, onVar.f28402a);
                break;
            case 1:
                View x6Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.b) null);
                new jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23009a7, c6Var)), org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.g6.f23028b7)).f29792w = true;
                k4Var = x6Var;
                break;
            case 2:
                k4Var = new org.telegram.ui.Cells.y8(context, c6Var);
                break;
            case 3:
                k4Var = new org.telegram.ui.Cells.m8(context, c6Var);
                break;
            case 4:
            case 11:
                boolean z11 = onVar.E;
                in inVar = new in(this, this.f30733c, z11 ? 1 : 0, onVar.f28402a, i10);
                if (i10 == 11 && !z10) {
                    inVar.setTextRight(98);
                    inVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final mn f28922b;

                        {
                            this.f28922b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    on.O(this.f28922b.d, -2);
                                    return;
                                case 1:
                                    on.O(this.f28922b.d, -3);
                                    return;
                                default:
                                    this.f28922b.d.X(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                inVar.c();
                inVar.setIconsColor(org.telegram.ui.ActionBar.g6.f23261o7);
                inVar.b(new jn(this, inVar, i10));
                k4Var = inVar;
                break;
            case 5:
            default:
                boolean z12 = onVar.E;
                ln lnVar = new ln(this, this.f30733c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final mn f28922b;

                    {
                        this.f28922b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                on.O(this.f28922b.d, -2);
                                return;
                            case 1:
                                on.O(this.f28922b.d, -3);
                                return;
                            default:
                                this.f28922b.d.X(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                return;
                        }
                    }
                }, onVar.f28402a);
                if (!z10) {
                    lnVar.setTextRight(140);
                    lnVar.a().setOnClickListener(new t2(11, this, lnVar));
                }
                int i11 = org.telegram.ui.ActionBar.g6.f23261o7;
                lnVar.setIconsColor(i11);
                hp hpVar = lnVar.f24087r;
                if (hpVar != null) {
                    hpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = hpVar.getCheckBoxBase();
                    float f9 = lnVar.f24081a.f49505e;
                    if (checkBoxBase.f26329w != f9) {
                        checkBoxBase.f26329w = f9;
                        checkBoxBase.b();
                    }
                }
                lnVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.g6.f23190k7);
                lnVar.b(new ag.c0(this, lnVar, false, 8));
                lnVar.setShowNextButton(true);
                EditTextBoldCursor textView = lnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.rd(2, this, lnVar));
                textView.setOnKeyListener(new hn(lnVar, 0));
                k4Var = lnVar;
                break;
            case 6:
                k4Var = new org.telegram.ui.Cells.q8(context, c6Var);
                break;
            case 7:
                kn knVar = new kn(this, context, onVar.E ? 1 : 0);
                knVar.c();
                if (!z10) {
                    knVar.setTextRight(98);
                    knVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final mn f28922b;

                        {
                            this.f28922b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    on.O(this.f28922b.d, -2);
                                    return;
                                case 1:
                                    on.O(this.f28922b.d, -3);
                                    return;
                                default:
                                    this.f28922b.d.X(view2, (org.telegram.ui.Cells.a6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                knVar.setIconsColor(org.telegram.ui.ActionBar.g6.f23261o7);
                knVar.b(new ag.c0(this, knVar, false, 7));
                k4Var = knVar;
                break;
            case 8:
                View fnVar = new fn(context, 0);
                fnVar.setTag(-33024);
                view = fnVar;
                k4Var = view;
                break;
            case 9:
                View h0Var = new cg.h0(this, context, 11);
                h0Var.setTag(-33024);
                view = h0Var;
                k4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.y5 y5Var = new org.telegram.ui.Cells.y5(context, c6Var);
                y5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                k4Var = y5Var;
                break;
        }
        return org.telegram.ui.th.m(k4Var, k4Var, -1, -2);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        int i10;
        int i11;
        on onVar = this.d;
        bh.i iVar = onVar.f31415h1;
        boolean z10 = onVar.f31420n;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
            a6Var.setTag(1);
            CharSequence charSequence2 = onVar.J;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i11 = R.string.TodoTitlePlaceholder;
            } else {
                i11 = R.string.QuestionHint;
            }
            a6Var.n(charSequence, LocaleController.getString(i11), true);
            a6Var.setTag(null);
            on.K(onVar, view, n1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.a6 a6Var2 = (org.telegram.ui.Cells.a6) view;
            a6Var2.setTag(1);
            CharSequence charSequence3 = onVar.K;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            a6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            a6Var2.setTag(null);
            a6Var2.f24084e.a(iVar.b(-2), false);
            on.K(onVar, view, n1Var.b());
        } else if (i12 == 5) {
            int b10 = n1Var.b();
            org.telegram.ui.Cells.a6 a6Var3 = (org.telegram.ui.Cells.a6) view;
            a6Var3.setTag(1);
            a6Var3.f24081a.a(onVar.U, false);
            int i13 = b10 - onVar.f31423p0;
            CharSequence charSequence4 = onVar.G[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            a6Var3.n(charSequence4, LocaleController.getString(i10), true);
            a6Var3.setTag(null);
            if (onVar.f31412g0 == b10) {
                EditTextBoldCursor textView = a6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                onVar.f31412g0 = -1;
            }
            if (!z10) {
                a6Var3.f24084e.a(iVar.b(i13), false);
            }
            on.K(onVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.a6 a6Var4 = (org.telegram.ui.Cells.a6) view;
            a6Var4.setTag(1);
            CharSequence charSequence5 = onVar.L;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            a6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            a6Var4.setTag(null);
            if (!z10) {
                a6Var4.f24084e.a(iVar.b(-3), false);
            }
            on.K(onVar, view, n1Var.b());
        }
    }

    @Override
    public final void z(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.a6) n1Var.f6432a).getTextView();
            if (textView.isFocused()) {
                on onVar = this.d;
                if (onVar.E) {
                    en enVar = onVar.f31434x;
                    if (enVar != null) {
                        enVar.f();
                    }
                    onVar.Z(true);
                }
                onVar.f31405c1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

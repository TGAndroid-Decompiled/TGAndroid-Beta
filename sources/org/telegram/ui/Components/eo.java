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
public final class eo extends mm0 {
    public final Context f27896c;
    public final go d;

    public eo(go goVar, Context context) {
        this.d = goVar;
        this.f27896c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int b10 = e1Var.b();
        go goVar = this.d;
        if (b10 != goVar.f28699u0 && b10 != goVar.G0 && b10 != goVar.B0 && b10 != goVar.F0 && b10 != goVar.C0 && b10 != goVar.H0 && b10 != goVar.D0 && b10 != goVar.E0 && b10 != goVar.I0 && b10 != goVar.J0 && b10 != goVar.N0.f7970a && b10 != goVar.M0.f7970a && b10 != goVar.L0) {
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
        go goVar = this.d;
        if (i10 != goVar.B0 && i10 != goVar.F0 && i10 != goVar.G0 && i10 != goVar.C0 && i10 != goVar.D0 && i10 != goVar.E0 && i10 != goVar.H0 && i10 != goVar.M0.f7970a && i10 != goVar.N0.f7970a) {
            if (i10 != goVar.f28683l0 && i10 != goVar.f28697s0 && i10 != goVar.f28702w0 && i10 != goVar.f28688o0) {
                if (i10 == goVar.f28695r0) {
                    return 1;
                }
                if (i10 != goVar.f28700v0 && i10 != goVar.f28704x0 && i10 != goVar.f28692q0 && i10 != goVar.K0) {
                    if (i10 != goVar.f28699u0 && i10 != goVar.I0 && i10 != goVar.L0) {
                        if (i10 == goVar.m0) {
                            return 4;
                        }
                        if (i10 == goVar.f28686n0) {
                            return 11;
                        }
                        if (i10 == goVar.f28690p0) {
                            return 7;
                        }
                        if (i10 != goVar.f28706y0 && i10 != goVar.f28707z0 && i10 != goVar.J0) {
                            if (i10 == goVar.A0) {
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
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        String formatPluralString;
        boolean z10;
        boolean z11;
        go goVar = this.d;
        boolean z12 = goVar.f28669e0;
        d5.f fVar = goVar.M0;
        d5.f fVar2 = goVar.N0;
        org.telegram.ui.ActionBar.u6 u6Var = goVar.f30253a;
        boolean z13 = goVar.f28685n;
        int i15 = e1Var.f47776f;
        View view = e1Var.f47773a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f27896c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view;
                                e6Var.setDivider(false);
                                if (i10 == goVar.B0) {
                                    e6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), x40.f34661c, R.drawable.filled_poll_view_24, !goVar.f28661a0);
                                } else {
                                    if (i10 == goVar.F0) {
                                        e6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), x40.f34662f, R.drawable.filled_poll_multiple_24, goVar.f28663b0);
                                    } else if (i10 == goVar.D0) {
                                        e6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), x40.v, R.drawable.filled_poll_revote_24, goVar.R);
                                    } else if (i10 == goVar.C0) {
                                        e6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), x40.f34665s, R.drawable.filled_poll_add_24, goVar.T);
                                    } else if (i10 == goVar.E0) {
                                        e6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), x40.h, R.drawable.filled_poll_shuffle_24, goVar.S);
                                    } else if (i10 == goVar.G0) {
                                        e6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), x40.f34663n, R.drawable.filled_poll_correct_24, goVar.f28665c0);
                                    } else if (i10 == fVar2.f7970a) {
                                        e6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), x40.e, R.drawable.filled_location, fVar2.f7971b);
                                    } else if (i10 == fVar.f7970a) {
                                        e6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), x40.d, R.drawable.msg_folders_groups, fVar.f7971b);
                                    } else if (i10 == goVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (goVar.U == 0 && goVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        e6Var.a(string, string2, x40.f34664r, i17, z10);
                                        e6Var = e6Var;
                                        if (goVar.U == 0 && goVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        e6Var.setDivider(z11);
                                    }
                                    e6Var = e6Var;
                                }
                                if (i10 == goVar.G0) {
                                    e6Var.getCheckBox().f26317a.a(z12, false);
                                    return;
                                } else if (i10 == goVar.C0) {
                                    Switch checkBox = e6Var.getCheckBox();
                                    if (!goVar.f28665c0 && !goVar.f28661a0) {
                                        z14 = false;
                                    }
                                    checkBox.f26317a.a(z14, false);
                                    return;
                                } else {
                                    e6Var.getCheckBox().f26317a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    if (i10 == goVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = goVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        v8Var.q(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == goVar.I0) {
                        goVar.X(v8Var, false);
                        return;
                    } else {
                        v8Var.g(-1, org.telegram.ui.ActionBar.y6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.N6, u6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23486k7, u6Var), mode));
                        goVar.f28687n1 = drawable;
                        goVar.f28689o1 = drawable2;
                        ar arVar = new ar(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        v8Var.p(LocaleController.getString(i14), arVar, false);
                        v8Var.f25602w = 20;
                        v8Var.f25601s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
                i9Var.setFixedSize(0);
                new ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23300a7, u6Var)), org.telegram.ui.ActionBar.y6.X0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23319b7)).f26646w = true;
                if (i10 == goVar.f28692q0) {
                    i9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == goVar.f28704x0) {
                    i9Var.setFixedSize(12);
                    i9Var.setText(null);
                    return;
                } else {
                    int i18 = goVar.J - goVar.M;
                    if (i18 <= 0) {
                        if (z13) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        i9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z13) {
                        i9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i18));
                        return;
                    } else if (i10 == goVar.K0) {
                        i9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        i9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == goVar.f28706y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = goVar.f28671f0;
                if (goVar.f28707z0 != -1) {
                    z15 = true;
                }
                a9Var.f(string4, z16, z15);
                a9Var.e(null, true);
                return;
            } else if (i10 == goVar.f28707z0) {
                a9Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), goVar.f28673g0, false);
                a9Var.e(null, true);
                return;
            } else if (i10 == goVar.J0) {
                a9Var.f(LocaleController.getString(R.string.PollV2HideResults), goVar.W, false);
                a9Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
        if (i10 == goVar.f28683l0) {
            q4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            q4Var.setText(LocaleController.getString(i12));
        } else if (i10 == goVar.f28688o0) {
            q4Var.getTextView().setGravity(19);
            q4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = q4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == goVar.f28697s0) {
                if (z12) {
                    q4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                    return;
                }
                if (z13) {
                    i11 = R.string.TodoItemsTitle;
                } else {
                    i11 = R.string.AnswerOptions2;
                }
                q4Var.setText(LocaleController.getString(i11));
            } else if (i10 == goVar.f28702w0) {
                q4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        co q4Var;
        View view;
        go goVar = this.d;
        boolean z10 = goVar.f28685n;
        org.telegram.ui.ActionBar.u6 u6Var = goVar.f30253a;
        Context context = this.f27896c;
        switch (i10) {
            case 0:
                q4Var = new org.telegram.ui.Cells.q4(this.f27896c, org.telegram.ui.ActionBar.y6.L6, 21, 15, false, goVar.f30253a);
                break;
            case 1:
                View f7Var = new org.telegram.ui.Cells.f7(context, (org.telegram.ui.d3) null);
                new ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23300a7, u6Var)), org.telegram.ui.ActionBar.y6.X0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.y6.f23319b7)).f26646w = true;
                q4Var = f7Var;
                break;
            case 2:
                q4Var = new org.telegram.ui.Cells.i9(context, u6Var);
                break;
            case 3:
                q4Var = new org.telegram.ui.Cells.v8(context, u6Var);
                break;
            case 4:
            case 11:
                boolean z11 = goVar.I;
                yn ynVar = new yn(this, this.f27896c, z11 ? 1 : 0, goVar.f30253a, i10);
                if (i10 == 11 && !z10) {
                    ynVar.setTextRight(98);
                    ynVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final eo f34547b;

                        {
                            this.f34547b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    go.R(this.f34547b.d, -2);
                                    return;
                                case 1:
                                    go.R(this.f34547b.d, -3);
                                    return;
                                default:
                                    this.f34547b.d.a0(view2, (org.telegram.ui.Cells.h6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                ynVar.c();
                ynVar.setIconsColor(org.telegram.ui.ActionBar.y6.f23562o7);
                ynVar.b(new zn(this, ynVar, i10));
                q4Var = ynVar;
                break;
            case 5:
            default:
                boolean z12 = goVar.I;
                co coVar = new co(this, this.f27896c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final eo f34547b;

                    {
                        this.f34547b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                go.R(this.f34547b.d, -2);
                                return;
                            case 1:
                                go.R(this.f34547b.d, -3);
                                return;
                            default:
                                this.f34547b.d.a0(view2, (org.telegram.ui.Cells.h6) view2.getParent(), true);
                                return;
                        }
                    }
                }, goVar.f30253a);
                if (!z10) {
                    coVar.setTextRight(140);
                    coVar.a().setOnClickListener(new ga(5, this, coVar));
                }
                int i11 = org.telegram.ui.ActionBar.y6.f23562o7;
                coVar.setIconsColor(i11);
                aq aqVar = coVar.f24204r;
                if (aqVar != null) {
                    aqVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = aqVar.getCheckBoxBase();
                    float f7 = coVar.f24199a.e;
                    if (checkBoxBase.f26096w != f7) {
                        checkBoxBase.f26096w = f7;
                        checkBoxBase.b();
                    }
                }
                coVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.y6.f23486k7);
                coVar.b(new bo(1, this, coVar));
                coVar.setShowNextButton(true);
                EditTextBoldCursor textView = coVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.yd(2, this, coVar));
                textView.setOnKeyListener(new xn(coVar, 0));
                q4Var = coVar;
                break;
            case 6:
                q4Var = new org.telegram.ui.Cells.a9(context, u6Var);
                break;
            case 7:
                ao aoVar = new ao(this, context, goVar.I ? 1 : 0);
                aoVar.c();
                if (!z10) {
                    aoVar.setTextRight(98);
                    aoVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final eo f34547b;

                        {
                            this.f34547b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    go.R(this.f34547b.d, -2);
                                    return;
                                case 1:
                                    go.R(this.f34547b.d, -3);
                                    return;
                                default:
                                    this.f34547b.d.a0(view2, (org.telegram.ui.Cells.h6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                aoVar.setIconsColor(org.telegram.ui.ActionBar.y6.f23562o7);
                aoVar.b(new bo(0, this, aoVar));
                q4Var = aoVar;
                break;
            case 8:
                View vnVar = new vn(context, 0);
                vnVar.setTag(-33024);
                view = vnVar;
                q4Var = view;
                break;
            case 9:
                View ccVar = new bi.cc(this, context, 14);
                ccVar.setTag(-33024);
                view = ccVar;
                q4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.e6 e6Var = new org.telegram.ui.Cells.e6(context, u6Var);
                e6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                q4Var = e6Var;
                break;
        }
        return ic.a.n(q4Var, q4Var, -1, -2);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        int i10;
        int i11;
        go goVar = this.d;
        sh.f fVar = goVar.f28684m1;
        boolean z10 = goVar.f28685n;
        int i12 = e1Var.f47776f;
        View view = e1Var.f47773a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            h6Var.setTag(1);
            CharSequence charSequence2 = goVar.N;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i11 = R.string.TodoTitlePlaceholder;
            } else {
                i11 = R.string.QuestionHint;
            }
            h6Var.n(charSequence, LocaleController.getString(i11), true);
            h6Var.setTag(null);
            go.O(goVar, view, e1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.h6 h6Var2 = (org.telegram.ui.Cells.h6) view;
            h6Var2.setTag(1);
            CharSequence charSequence3 = goVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            h6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            h6Var2.setTag(null);
            h6Var2.e.a(fVar.b(-2), false);
            go.O(goVar, view, e1Var.b());
        } else if (i12 == 5) {
            int b10 = e1Var.b();
            org.telegram.ui.Cells.h6 h6Var3 = (org.telegram.ui.Cells.h6) view;
            h6Var3.setTag(1);
            h6Var3.f24199a.a(goVar.f28663b0, false);
            int i13 = b10 - goVar.f28698t0;
            CharSequence charSequence4 = goVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            h6Var3.n(charSequence4, LocaleController.getString(i10), true);
            h6Var3.setTag(null);
            if (goVar.f28681k0 == b10) {
                EditTextBoldCursor textView = h6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                goVar.f28681k0 = -1;
            }
            if (!z10) {
                h6Var3.e.a(fVar.b(i13), false);
            }
            go.O(goVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.h6 h6Var4 = (org.telegram.ui.Cells.h6) view;
            h6Var4.setTag(1);
            CharSequence charSequence5 = goVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            h6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            h6Var4.setTag(null);
            if (!z10) {
                h6Var4.e.a(fVar.b(-3), false);
            }
            go.O(goVar, view, e1Var.b());
        }
    }

    @Override
    public final void z(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.h6) e1Var.f47773a).getTextView();
            if (textView.isFocused()) {
                go goVar = this.d;
                if (goVar.I) {
                    un unVar = goVar.f28703x;
                    if (unVar != null) {
                        unVar.f();
                    }
                    goVar.c0(true);
                }
                goVar.f28674g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

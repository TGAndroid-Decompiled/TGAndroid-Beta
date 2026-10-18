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
public final class co extends hm0 {
    public final Context f25319c;
    public final fo d;

    public co(fo foVar, Context context) {
        this.d = foVar;
        this.f25319c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int b10 = b1Var.b();
        fo foVar = this.d;
        if (b10 != foVar.f26318u0 && b10 != foVar.G0 && b10 != foVar.B0 && b10 != foVar.F0 && b10 != foVar.C0 && b10 != foVar.H0 && b10 != foVar.D0 && b10 != foVar.E0 && b10 != foVar.I0 && b10 != foVar.J0 && b10 != foVar.N0.f4731a && b10 != foVar.M0.f4731a && b10 != foVar.L0) {
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
        if (i10 != foVar.B0 && i10 != foVar.F0 && i10 != foVar.G0 && i10 != foVar.C0 && i10 != foVar.D0 && i10 != foVar.E0 && i10 != foVar.H0 && i10 != foVar.M0.f4731a && i10 != foVar.N0.f4731a) {
            if (i10 != foVar.f26307l0 && i10 != foVar.f26316s0 && i10 != foVar.f26321w0 && i10 != foVar.f26310o0) {
                if (i10 == foVar.f26314r0) {
                    return 1;
                }
                if (i10 != foVar.f26319v0 && i10 != foVar.f26323x0 && i10 != foVar.f26312q0 && i10 != foVar.K0) {
                    if (i10 != foVar.f26318u0 && i10 != foVar.I0 && i10 != foVar.L0) {
                        if (i10 == foVar.m0) {
                            return 4;
                        }
                        if (i10 == foVar.f26309n0) {
                            return 11;
                        }
                        if (i10 == foVar.f26311p0) {
                            return 7;
                        }
                        if (i10 != foVar.f26325y0 && i10 != foVar.f26326z0 && i10 != foVar.J0) {
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
        boolean z12 = foVar.f26293e0;
        c5.f fVar = foVar.M0;
        c5.f fVar2 = foVar.N0;
        org.telegram.ui.ActionBar.d6 d6Var = foVar.f28244a;
        boolean z13 = foVar.f26308n;
        int i15 = b1Var.f45961f;
        View view = b1Var.f45958a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f25319c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                                z5Var.setDivider(false);
                                if (i10 == foVar.B0) {
                                    z5Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), v40.f31171c, R.drawable.filled_poll_view_24, !foVar.f26285a0);
                                } else {
                                    if (i10 == foVar.F0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), v40.f31172f, R.drawable.filled_poll_multiple_24, foVar.f26287b0);
                                    } else if (i10 == foVar.D0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), v40.v, R.drawable.filled_poll_revote_24, foVar.R);
                                    } else if (i10 == foVar.C0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), v40.f31175s, R.drawable.filled_poll_add_24, foVar.T);
                                    } else if (i10 == foVar.E0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), v40.h, R.drawable.filled_poll_shuffle_24, foVar.S);
                                    } else if (i10 == foVar.G0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), v40.f31173n, R.drawable.filled_poll_correct_24, foVar.f26289c0);
                                    } else if (i10 == fVar2.f4731a) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), v40.e, R.drawable.filled_location, fVar2.f4732b);
                                    } else if (i10 == fVar.f4731a) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), v40.d, R.drawable.msg_folders_groups, fVar.f4732b);
                                    } else if (i10 == foVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (foVar.U == 0 && foVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        z5Var.a(string, string2, v40.f31174r, i17, z10);
                                        z5Var = z5Var;
                                        if (foVar.U == 0 && foVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        z5Var.setDivider(z11);
                                    }
                                    z5Var = z5Var;
                                }
                                if (i10 == foVar.G0) {
                                    z5Var.getCheckBox().f24379a.a(z12, false);
                                    return;
                                } else if (i10 == foVar.C0) {
                                    Switch checkBox = z5Var.getCheckBox();
                                    if (!foVar.f26289c0 && !foVar.f26285a0) {
                                        z14 = false;
                                    }
                                    checkBox.f24379a.a(z14, false);
                                    return;
                                } else {
                                    z5Var.getCheckBox().f24379a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
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
                        q8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == foVar.I0) {
                        foVar.X(q8Var, false);
                        return;
                    } else {
                        q8Var.e(-1, org.telegram.ui.ActionBar.h6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.N6, d6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21121k7, d6Var), mode));
                        zq zqVar = new zq(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        q8Var.n(LocaleController.getString(i14), zqVar, false);
                        q8Var.f22792w = 20;
                        q8Var.f22791s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
                d9Var.setFixedSize(0);
                new zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20935a7, d6Var)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20955b7)).f33006w = true;
                if (i10 == foVar.f26312q0) {
                    d9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == foVar.f26323x0) {
                    d9Var.setFixedSize(12);
                    d9Var.setText(null);
                    return;
                } else {
                    int i18 = foVar.J - foVar.M;
                    if (i18 <= 0) {
                        if (z13) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        d9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z13) {
                        d9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i18));
                        return;
                    } else if (i10 == foVar.K0) {
                        d9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        d9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
            if (i10 == foVar.f26325y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = foVar.f26295f0;
                if (foVar.f26326z0 != -1) {
                    z15 = true;
                }
                v8Var.f(string4, z16, z15);
                v8Var.e(null, true);
                return;
            } else if (i10 == foVar.f26326z0) {
                v8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), foVar.f26297g0, false);
                v8Var.e(null, true);
                return;
            } else if (i10 == foVar.J0) {
                v8Var.f(LocaleController.getString(R.string.PollV2HideResults), foVar.W, false);
                v8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == foVar.f26307l0) {
            l4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            l4Var.setText(LocaleController.getString(i12));
        } else if (i10 == foVar.f26310o0) {
            l4Var.getTextView().setGravity(19);
            l4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = l4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == foVar.f26316s0) {
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
            } else if (i10 == foVar.f26321w0) {
                l4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        bo l4Var;
        View view;
        fo foVar = this.d;
        boolean z10 = foVar.f26308n;
        org.telegram.ui.ActionBar.d6 d6Var = foVar.f28244a;
        Context context = this.f25319c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(this.f25319c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, foVar.f28244a);
                break;
            case 1:
                View z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                new zq(new ColorDrawable(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20935a7, d6Var)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f20955b7)).f33006w = true;
                l4Var = z6Var;
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.d9(context, d6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.q8(context, d6Var);
                break;
            case 4:
            case 11:
                boolean z11 = foVar.I;
                xn xnVar = new xn(this, this.f25319c, z11 ? 1 : 0, foVar.f28244a, i10);
                if (i10 == 11 && !z10) {
                    xnVar.setTextRight(98);
                    xnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final co f31327b;

                        {
                            this.f31327b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    fo.R(this.f31327b.d, -2);
                                    return;
                                case 1:
                                    fo.R(this.f31327b.d, -3);
                                    return;
                                default:
                                    this.f31327b.d.a0(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                xnVar.d();
                xnVar.setIconsColor(org.telegram.ui.ActionBar.h6.f21197o7);
                xnVar.c(new yn(this, xnVar, i10));
                l4Var = xnVar;
                break;
            case 5:
            default:
                boolean z12 = foVar.I;
                bo boVar = new bo(this, this.f25319c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final co f31327b;

                    {
                        this.f31327b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                fo.R(this.f31327b.d, -2);
                                return;
                            case 1:
                                fo.R(this.f31327b.d, -3);
                                return;
                            default:
                                this.f31327b.d.a0(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                return;
                        }
                    }
                }, foVar.f28244a);
                if (!z10) {
                    boVar.setTextRight(140);
                    boVar.b().setOnClickListener(new ca(3, this, boVar));
                }
                int i11 = org.telegram.ui.ActionBar.h6.f21197o7;
                boVar.setIconsColor(i11);
                xp xpVar = boVar.f22099r;
                if (xpVar != null) {
                    xpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = xpVar.getCheckBoxBase();
                    float f7 = boVar.f22094a.e;
                    if (checkBoxBase.f24159w != f7) {
                        checkBoxBase.f24159w = f7;
                        checkBoxBase.b();
                    }
                }
                boVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.h6.f21121k7);
                boVar.c(new ao(1, this, boVar));
                boVar.setShowNextButton(true);
                EditTextBoldCursor textView = boVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.yd(2, this, boVar));
                textView.setOnKeyListener(new wn(boVar, 0));
                l4Var = boVar;
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.v8(context, d6Var);
                break;
            case 7:
                zn znVar = new zn(this, context, foVar.I ? 1 : 0);
                znVar.d();
                if (!z10) {
                    znVar.setTextRight(98);
                    znVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final co f31327b;

                        {
                            this.f31327b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    fo.R(this.f31327b.d, -2);
                                    return;
                                case 1:
                                    fo.R(this.f31327b.d, -3);
                                    return;
                                default:
                                    this.f31327b.d.a0(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                znVar.setIconsColor(org.telegram.ui.ActionBar.h6.f21197o7);
                znVar.c(new ao(0, this, znVar));
                l4Var = znVar;
                break;
            case 8:
                View unVar = new un(context, 0);
                unVar.setTag(-33024);
                view = unVar;
                l4Var = view;
                break;
            case 9:
                View icVar = new ai.ic(this, context, 15);
                icVar.setTag(-33024);
                view = icVar;
                l4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, d6Var);
                z5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                l4Var = z5Var;
                break;
        }
        return com.google.android.gms.internal.play_billing.k3.l(l4Var, l4Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        int i10;
        int i11;
        fo foVar = this.d;
        rh.f fVar = foVar.l1;
        boolean z10 = foVar.f26308n;
        int i12 = b1Var.f45961f;
        View view = b1Var.f45958a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            CharSequence charSequence2 = foVar.N;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i11 = R.string.TodoTitlePlaceholder;
            } else {
                i11 = R.string.QuestionHint;
            }
            c6Var.n(charSequence, LocaleController.getString(i11), true);
            c6Var.setTag(null);
            fo.O(foVar, view, b1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            CharSequence charSequence3 = foVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            c6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            c6Var2.setTag(null);
            c6Var2.e.a(fVar.b(-2), false);
            fo.O(foVar, view, b1Var.b());
        } else if (i12 == 5) {
            int b10 = b1Var.b();
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            c6Var3.f22094a.a(foVar.f26287b0, false);
            int i13 = b10 - foVar.f26317t0;
            CharSequence charSequence4 = foVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var3.n(charSequence4, LocaleController.getString(i10), true);
            c6Var3.setTag(null);
            if (foVar.f26305k0 == b10) {
                EditTextBoldCursor textView = c6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                foVar.f26305k0 = -1;
            }
            if (!z10) {
                c6Var3.e.a(fVar.b(i13), false);
            }
            fo.O(foVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.c6 c6Var4 = (org.telegram.ui.Cells.c6) view;
            c6Var4.setTag(1);
            CharSequence charSequence5 = foVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            c6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var4.setTag(null);
            if (!z10) {
                c6Var4.e.a(fVar.b(-3), false);
            }
            fo.O(foVar, view, b1Var.b());
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f45961f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) b1Var.f45958a).getTextView();
            if (textView.isFocused()) {
                fo foVar = this.d;
                if (foVar.I) {
                    tn tnVar = foVar.f26322x;
                    if (tnVar != null) {
                        tnVar.f();
                    }
                    foVar.c0(true);
                }
                foVar.f26298g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

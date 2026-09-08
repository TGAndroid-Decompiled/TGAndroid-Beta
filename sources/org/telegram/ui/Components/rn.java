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
public final class rn extends kl0 {
    public final Context f30080c;
    public final tn d;

    public rn(tn tnVar, Context context) {
        this.d = tnVar;
        this.f30080c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        tn tnVar = this.d;
        if (b10 != tnVar.f30684u0 && b10 != tnVar.G0 && b10 != tnVar.B0 && b10 != tnVar.F0 && b10 != tnVar.C0 && b10 != tnVar.H0 && b10 != tnVar.D0 && b10 != tnVar.E0 && b10 != tnVar.I0 && b10 != tnVar.J0 && b10 != tnVar.N0.f4166b && b10 != tnVar.M0.f4166b && b10 != tnVar.L0) {
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
        tn tnVar = this.d;
        if (i10 != tnVar.B0 && i10 != tnVar.F0 && i10 != tnVar.G0 && i10 != tnVar.C0 && i10 != tnVar.D0 && i10 != tnVar.E0 && i10 != tnVar.H0 && i10 != tnVar.M0.f4166b && i10 != tnVar.N0.f4166b) {
            if (i10 != tnVar.f30673l0 && i10 != tnVar.f30682s0 && i10 != tnVar.f30687w0 && i10 != tnVar.f30676o0) {
                if (i10 == tnVar.f30680r0) {
                    return 1;
                }
                if (i10 != tnVar.f30685v0 && i10 != tnVar.f30689x0 && i10 != tnVar.f30678q0 && i10 != tnVar.K0) {
                    if (i10 != tnVar.f30684u0 && i10 != tnVar.I0 && i10 != tnVar.L0) {
                        if (i10 == tnVar.m0) {
                            return 4;
                        }
                        if (i10 == tnVar.f30675n0) {
                            return 11;
                        }
                        if (i10 == tnVar.f30677p0) {
                            return 7;
                        }
                        if (i10 != tnVar.f30691y0 && i10 != tnVar.f30692z0 && i10 != tnVar.J0) {
                            if (i10 == tnVar.A0) {
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
        tn tnVar = this.d;
        boolean z12 = tnVar.f30659e0;
        c2.a aVar = tnVar.M0;
        c2.a aVar2 = tnVar.N0;
        org.telegram.ui.ActionBar.f6 f6Var = tnVar.f28779a;
        boolean z13 = tnVar.f30674n;
        int i15 = c1Var.f45770f;
        View view = c1Var.f45766a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f30080c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                                z5Var.setDivider(false);
                                if (i10 == tnVar.B0) {
                                    z5Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !tnVar.f30651a0);
                                } else {
                                    if (i10 == tnVar.F0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, tnVar.f30653b0);
                                    } else if (i10 == tnVar.D0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, tnVar.R);
                                    } else if (i10 == tnVar.C0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, tnVar.T);
                                    } else if (i10 == tnVar.E0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, tnVar.S);
                                    } else if (i10 == tnVar.G0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, tnVar.f30655c0);
                                    } else if (i10 == aVar2.f4166b) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.f4165a);
                                    } else if (i10 == aVar.f4166b) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.f4165a);
                                    } else if (i10 == tnVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (tnVar.U == 0 && tnVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        z5Var.a(string, string2, 8, i17, z10);
                                        z5Var = z5Var;
                                        if (tnVar.U == 0 && tnVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        z5Var.setDivider(z11);
                                    }
                                    z5Var = z5Var;
                                }
                                if (i10 == tnVar.G0) {
                                    z5Var.getCheckBox().f24174a.a(z12, false);
                                    return;
                                } else if (i10 == tnVar.C0) {
                                    Switch checkBox = z5Var.getCheckBox();
                                    if (!tnVar.f30655c0 && !tnVar.f30651a0) {
                                        z14 = false;
                                    }
                                    checkBox.f24174a.a(z14, false);
                                    return;
                                } else {
                                    z5Var.getCheckBox().f24174a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == tnVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = tnVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        r8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == tnVar.I0) {
                        tnVar.U(r8Var, false);
                        return;
                    } else {
                        r8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20819k7, f6Var), mode));
                        oq oqVar = new oq(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), oqVar, false);
                        r8Var.f22715w = 20;
                        r8Var.f22714s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                new oq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20634a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20654b7)).f29194w = true;
                if (i10 == tnVar.f30678q0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == tnVar.f30689x0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = tnVar.J - tnVar.M;
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
                    } else if (i10 == tnVar.K0) {
                        e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == tnVar.f30691y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = tnVar.f30661f0;
                if (tnVar.f30692z0 != -1) {
                    z15 = true;
                }
                w8Var.f(string4, z16, z15);
                w8Var.e(null, true);
                return;
            } else if (i10 == tnVar.f30692z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), tnVar.f30663g0, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == tnVar.J0) {
                w8Var.f(LocaleController.getString(R.string.PollV2HideResults), tnVar.W, false);
                w8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == tnVar.f30673l0) {
            l4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            l4Var.setText(LocaleController.getString(i12));
        } else if (i10 == tnVar.f30676o0) {
            l4Var.getTextView().setGravity(19);
            l4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = l4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == tnVar.f30682s0) {
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
            } else if (i10 == tnVar.f30687w0) {
                l4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        qn l4Var;
        View view;
        tn tnVar = this.d;
        boolean z10 = tnVar.f30674n;
        org.telegram.ui.ActionBar.f6 f6Var = tnVar.f28779a;
        Context context = this.f30080c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(this.f30080c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, tnVar.f28779a);
                break;
            case 1:
                View a7Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.p6) null);
                new oq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20634a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f20654b7)).f29194w = true;
                l4Var = a7Var;
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.e9(context, f6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.r8(context, f6Var);
                break;
            case 4:
            case 11:
                boolean z11 = tnVar.I;
                mn mnVar = new mn(this, this.f30080c, z11 ? 1 : 0, tnVar.f28779a, i10);
                if (i10 == 11 && !z10) {
                    mnVar.setTextRight(98);
                    mnVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final rn f27884b;

                        {
                            this.f27884b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    tn.O(this.f27884b.d, -2);
                                    return;
                                case 1:
                                    tn.O(this.f27884b.d, -3);
                                    return;
                                default:
                                    this.f27884b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                mnVar.c();
                mnVar.setIconsColor(org.telegram.ui.ActionBar.j6.f20890o7);
                mnVar.b(new nn(this, mnVar, i10));
                l4Var = mnVar;
                break;
            case 5:
            default:
                boolean z12 = tnVar.I;
                qn qnVar = new qn(this, this.f30080c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final rn f27884b;

                    {
                        this.f27884b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                tn.O(this.f27884b.d, -2);
                                return;
                            case 1:
                                tn.O(this.f27884b.d, -3);
                                return;
                            default:
                                this.f27884b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                return;
                        }
                    }
                }, tnVar.f28779a);
                if (!z10) {
                    qnVar.setTextRight(140);
                    qnVar.a().setOnClickListener(new org.telegram.ui.rf(23, this, qnVar));
                }
                int i11 = org.telegram.ui.ActionBar.j6.f20890o7;
                qnVar.setIconsColor(i11);
                mp mpVar = qnVar.f21715r;
                if (mpVar != null) {
                    mpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = mpVar.getCheckBoxBase();
                    float f7 = qnVar.f21709a.f15395e;
                    if (checkBoxBase.f23939w != f7) {
                        checkBoxBase.f23939w = f7;
                        checkBoxBase.b();
                    }
                }
                qnVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.j6.f20819k7);
                qnVar.b(new pn(1, this, qnVar));
                qnVar.setShowNextButton(true);
                EditTextBoldCursor textView = qnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.wd(2, this, qnVar));
                textView.setOnKeyListener(new ln(qnVar, 0));
                l4Var = qnVar;
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.w8(context, f6Var);
                break;
            case 7:
                on onVar = new on(this, context, tnVar.I ? 1 : 0);
                onVar.c();
                if (!z10) {
                    onVar.setTextRight(98);
                    onVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final rn f27884b;

                        {
                            this.f27884b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    tn.O(this.f27884b.d, -2);
                                    return;
                                case 1:
                                    tn.O(this.f27884b.d, -3);
                                    return;
                                default:
                                    this.f27884b.d.X(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                onVar.setIconsColor(org.telegram.ui.ActionBar.j6.f20890o7);
                onVar.b(new pn(0, this, onVar));
                l4Var = onVar;
                break;
            case 8:
                View jnVar = new jn(context, 0);
                jnVar.setTag(-33024);
                view = jnVar;
                l4Var = view;
                break;
            case 9:
                View ebVar = new di.eb(this, context, 14);
                ebVar.setTag(-33024);
                view = ebVar;
                l4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, f6Var);
                z5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                l4Var = z5Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.l(l4Var, l4Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        tn tnVar = this.d;
        rh.f fVar = tnVar.l1;
        boolean z10 = tnVar.f30674n;
        int i12 = c1Var.f45770f;
        View view = c1Var.f45766a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            CharSequence charSequence2 = tnVar.N;
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
            tn.L(tnVar, view, c1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            CharSequence charSequence3 = tnVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            c6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            c6Var2.setTag(null);
            c6Var2.f21712e.a(fVar.b(-2), false);
            tn.L(tnVar, view, c1Var.b());
        } else if (i12 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            c6Var3.f21709a.a(tnVar.f30653b0, false);
            int i13 = b10 - tnVar.f30683t0;
            CharSequence charSequence4 = tnVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            c6Var3.n(charSequence4, LocaleController.getString(i10), true);
            c6Var3.setTag(null);
            if (tnVar.f30671k0 == b10) {
                EditTextBoldCursor textView = c6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                tnVar.f30671k0 = -1;
            }
            if (!z10) {
                c6Var3.f21712e.a(fVar.b(i13), false);
            }
            tn.L(tnVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.c6 c6Var4 = (org.telegram.ui.Cells.c6) view;
            c6Var4.setTag(1);
            CharSequence charSequence5 = tnVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            c6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var4.setTag(null);
            if (!z10) {
                c6Var4.f21712e.a(fVar.b(-3), false);
            }
            tn.L(tnVar, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f45770f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) c1Var.f45766a).getTextView();
            if (textView.isFocused()) {
                tn tnVar = this.d;
                if (tnVar.I) {
                    in inVar = tnVar.f30688x;
                    if (inVar != null) {
                        inVar.f();
                    }
                    tnVar.Z(true);
                }
                tnVar.f30664g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

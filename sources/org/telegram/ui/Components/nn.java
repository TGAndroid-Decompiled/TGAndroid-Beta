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
public final class nn extends ql0 {
    public final Context f27307c;
    public final pn d;

    public nn(pn pnVar, Context context) {
        this.d = pnVar;
        this.f27307c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int b10 = l1Var.b();
        pn pnVar = this.d;
        if (b10 != pnVar.f27959r0 && b10 != pnVar.D0 && b10 != pnVar.f27970y0 && b10 != pnVar.C0 && b10 != pnVar.f27971z0 && b10 != pnVar.E0 && b10 != pnVar.A0 && b10 != pnVar.B0 && b10 != pnVar.F0 && b10 != pnVar.G0 && b10 != pnVar.K0.f1711b && b10 != pnVar.J0.f1711b && b10 != pnVar.I0) {
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
        pn pnVar = this.d;
        if (i10 != pnVar.f27970y0 && i10 != pnVar.C0 && i10 != pnVar.D0 && i10 != pnVar.f27971z0 && i10 != pnVar.A0 && i10 != pnVar.B0 && i10 != pnVar.E0 && i10 != pnVar.J0.f1711b && i10 != pnVar.K0.f1711b) {
            if (i10 != pnVar.f27948i0 && i10 != pnVar.f27956p0 && i10 != pnVar.f27962t0 && i10 != pnVar.f27952l0) {
                if (i10 == pnVar.f27955o0) {
                    return 1;
                }
                if (i10 != pnVar.f27961s0 && i10 != pnVar.f27963u0 && i10 != pnVar.f27954n0 && i10 != pnVar.H0) {
                    if (i10 != pnVar.f27959r0 && i10 != pnVar.F0 && i10 != pnVar.I0) {
                        if (i10 == pnVar.f27950j0) {
                            return 4;
                        }
                        if (i10 == pnVar.f27951k0) {
                            return 11;
                        }
                        if (i10 == pnVar.m0) {
                            return 7;
                        }
                        if (i10 != pnVar.f27964v0 && i10 != pnVar.f27966w0 && i10 != pnVar.G0) {
                            if (i10 == pnVar.f27968x0) {
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
        pn pnVar = this.d;
        boolean z11 = pnVar.f27934b0;
        b7.l0 l0Var = pnVar.J0;
        b7.l0 l0Var2 = pnVar.K0;
        org.telegram.ui.ActionBar.f6 f6Var = pnVar.f24281a;
        boolean z12 = pnVar.f27953n;
        int i15 = l1Var.f5777f;
        View view = l1Var.f5774a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z13 = true;
            boolean z14 = false;
            if (i15 != 6) {
                Context context = this.f27307c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
                                z5Var.setDivider(false);
                                if (i10 == pnVar.f27970y0) {
                                    z5Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !pnVar.U);
                                } else {
                                    if (i10 == pnVar.C0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, pnVar.V);
                                    } else if (i10 == pnVar.A0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, pnVar.O);
                                    } else if (i10 == pnVar.f27971z0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, pnVar.Q);
                                    } else if (i10 == pnVar.B0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, pnVar.P);
                                    } else if (i10 == pnVar.D0) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, pnVar.W);
                                    } else if (i10 == l0Var2.f1711b) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, l0Var2.f1710a);
                                    } else if (i10 == l0Var.f1711b) {
                                        z5Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, l0Var.f1710a);
                                    } else if (i10 == pnVar.E0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (pnVar.R == 0 && pnVar.S == 0) {
                                            z4 = false;
                                        } else {
                                            z4 = true;
                                        }
                                        z5Var.a(string, string2, 8, i17, z4);
                                        z5Var = z5Var;
                                        if (pnVar.R == 0 && pnVar.S == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        z5Var.setDivider(z10);
                                    }
                                    z5Var = z5Var;
                                }
                                if (i10 == pnVar.D0) {
                                    z5Var.getCheckBox().f23155a.a(z11, false);
                                    return;
                                } else if (i10 == pnVar.f27971z0) {
                                    Switch checkBox = z5Var.getCheckBox();
                                    if (!pnVar.W && !pnVar.U) {
                                        z13 = false;
                                    }
                                    checkBox.f23155a.a(z13, false);
                                    return;
                                } else {
                                    z5Var.getCheckBox().f23155a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    if (i10 == pnVar.I0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = pnVar.M0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        n8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == pnVar.F0) {
                        pnVar.U(n8Var, false);
                        return;
                    } else {
                        n8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20007k7, f6Var), mode));
                        mq mqVar = new mq(drawable, drawable2);
                        if (z12) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        n8Var.n(LocaleController.getString(i14), mqVar, false);
                        n8Var.f21444w = 20;
                        n8Var.f21443s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                new mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7)).f27116w = true;
                if (i10 == pnVar.f27954n0) {
                    z8Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == pnVar.f27963u0) {
                    z8Var.setFixedSize(12);
                    z8Var.setText(null);
                    return;
                } else {
                    int i18 = pnVar.G - pnVar.J;
                    if (i18 <= 0) {
                        if (z12) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        z8Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z12) {
                        z8Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i18));
                        return;
                    } else if (i10 == pnVar.H0) {
                        z8Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        z8Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            if (i10 == pnVar.f27964v0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z15 = pnVar.f27936c0;
                if (pnVar.f27966w0 != -1) {
                    z14 = true;
                }
                r8Var.f(string4, z15, z14);
                r8Var.e(null, true);
                return;
            } else if (i10 == pnVar.f27966w0) {
                r8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), pnVar.f27938d0, false);
                r8Var.e(null, true);
                return;
            } else if (i10 == pnVar.G0) {
                r8Var.f(LocaleController.getString(R.string.PollV2HideResults), pnVar.T, false);
                r8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == pnVar.f27948i0) {
            l4Var.getTextView().setGravity(19);
            if (z12) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            l4Var.setText(LocaleController.getString(i12));
        } else if (i10 == pnVar.f27952l0) {
            l4Var.getTextView().setGravity(19);
            l4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = l4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == pnVar.f27956p0) {
                if (z11) {
                    l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                    return;
                }
                if (z12) {
                    i11 = R.string.TodoItemsTitle;
                } else {
                    i11 = R.string.AnswerOptions2;
                }
                l4Var.setText(LocaleController.getString(i11));
            } else if (i10 == pnVar.f27962t0) {
                l4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        mn l4Var;
        View view;
        pn pnVar = this.d;
        boolean z4 = pnVar.f27953n;
        org.telegram.ui.ActionBar.f6 f6Var = pnVar.f24281a;
        Context context = this.f27307c;
        switch (i10) {
            case 0:
                l4Var = new org.telegram.ui.Cells.l4(this.f27307c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, pnVar.f24281a);
                break;
            case 1:
                View y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.b) null);
                new mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, f6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19846b7)).f27116w = true;
                l4Var = y6Var;
                break;
            case 2:
                l4Var = new org.telegram.ui.Cells.z8(context, f6Var);
                break;
            case 3:
                l4Var = new org.telegram.ui.Cells.n8(context, f6Var);
                break;
            case 4:
            case 11:
                boolean z10 = pnVar.F;
                jn jnVar = new jn(this, this.f27307c, z10 ? 1 : 0, pnVar.f24281a, i10);
                if (i10 == 11 && !z4) {
                    jnVar.setTextRight(98);
                    jnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final nn f25459b;

                        {
                            this.f25459b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    pn.O(this.f25459b.d, -2);
                                    return;
                                case 1:
                                    pn.O(this.f25459b.d, -3);
                                    return;
                                default:
                                    this.f25459b.d.X(view2, (org.telegram.ui.Cells.b6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                jnVar.d();
                jnVar.setIconsColor(org.telegram.ui.ActionBar.j6.f20079o7);
                jnVar.c(new kn(this, jnVar, i10));
                l4Var = jnVar;
                break;
            case 5:
            default:
                boolean z11 = pnVar.F;
                mn mnVar = new mn(this, this.f27307c, z11 ? 1 : 0, new View.OnClickListener(this) {
                    public final nn f25459b;

                    {
                        this.f25459b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                pn.O(this.f25459b.d, -2);
                                return;
                            case 1:
                                pn.O(this.f25459b.d, -3);
                                return;
                            default:
                                this.f25459b.d.X(view2, (org.telegram.ui.Cells.b6) view2.getParent(), true);
                                return;
                        }
                    }
                }, pnVar.f24281a);
                if (!z4) {
                    mnVar.setTextRight(140);
                    mnVar.b().setOnClickListener(new w2(8, this, mnVar));
                }
                int i11 = org.telegram.ui.ActionBar.j6.f20079o7;
                mnVar.setIconsColor(i11);
                kp kpVar = mnVar.f20849r;
                if (kpVar != null) {
                    kpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = kpVar.getCheckBoxBase();
                    float f10 = mnVar.f20844a.e;
                    if (checkBoxBase.f22943w != f10) {
                        checkBoxBase.f22943w = f10;
                        checkBoxBase.b();
                    }
                }
                mnVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.j6.f20007k7);
                mnVar.c(new cg.b0(this, mnVar, false, 8));
                mnVar.setShowNextButton(true);
                EditTextBoldCursor textView = mnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.ae(2, this, mnVar));
                textView.setOnKeyListener(new in(mnVar, 0));
                l4Var = mnVar;
                break;
            case 6:
                l4Var = new org.telegram.ui.Cells.r8(context, f6Var);
                break;
            case 7:
                ln lnVar = new ln(this, context, pnVar.F ? 1 : 0);
                lnVar.d();
                if (!z4) {
                    lnVar.setTextRight(98);
                    lnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final nn f25459b;

                        {
                            this.f25459b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    pn.O(this.f25459b.d, -2);
                                    return;
                                case 1:
                                    pn.O(this.f25459b.d, -3);
                                    return;
                                default:
                                    this.f25459b.d.X(view2, (org.telegram.ui.Cells.b6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                lnVar.setIconsColor(org.telegram.ui.ActionBar.j6.f20079o7);
                lnVar.c(new cg.b0(this, lnVar, false, 7));
                l4Var = lnVar;
                break;
            case 8:
                View gnVar = new gn(context, 0);
                gnVar.setTag(-33024);
                view = gnVar;
                l4Var = view;
                break;
            case 9:
                View h0Var = new eg.h0(this, context, 9);
                h0Var.setTag(-33024);
                view = h0Var;
                l4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context, f6Var);
                z5Var.getCheckBox().setIcon(R.drawable.permission_locked);
                l4Var = z5Var;
                break;
        }
        return org.telegram.ui.ai.n(l4Var, l4Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        int i10;
        int i11;
        pn pnVar = this.d;
        dh.i iVar = pnVar.f27949i1;
        boolean z4 = pnVar.f27953n;
        int i12 = l1Var.f5777f;
        View view = l1Var.f5774a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
            b6Var.setTag(1);
            CharSequence charSequence2 = pnVar.K;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z4) {
                i11 = R.string.TodoTitlePlaceholder;
            } else {
                i11 = R.string.QuestionHint;
            }
            b6Var.n(charSequence, LocaleController.getString(i11), true);
            b6Var.setTag(null);
            pn.K(pnVar, view, l1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.b6 b6Var2 = (org.telegram.ui.Cells.b6) view;
            b6Var2.setTag(1);
            CharSequence charSequence3 = pnVar.L;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            b6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            b6Var2.setTag(null);
            b6Var2.e.a(iVar.b(-2), false);
            pn.K(pnVar, view, l1Var.b());
        } else if (i12 == 5) {
            int b10 = l1Var.b();
            org.telegram.ui.Cells.b6 b6Var3 = (org.telegram.ui.Cells.b6) view;
            b6Var3.setTag(1);
            b6Var3.f20844a.a(pnVar.V, false);
            int i13 = b10 - pnVar.f27957q0;
            CharSequence charSequence4 = pnVar.H[i13];
            if (z4) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            b6Var3.n(charSequence4, LocaleController.getString(i10), true);
            b6Var3.setTag(null);
            if (pnVar.f27946h0 == b10) {
                EditTextBoldCursor textView = b6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                pnVar.f27946h0 = -1;
            }
            if (!z4) {
                b6Var3.e.a(iVar.b(i13), false);
            }
            pn.K(pnVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.b6 b6Var4 = (org.telegram.ui.Cells.b6) view;
            b6Var4.setTag(1);
            CharSequence charSequence5 = pnVar.M;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            b6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            b6Var4.setTag(null);
            if (!z4) {
                b6Var4.e.a(iVar.b(-3), false);
            }
            pn.K(pnVar, view, l1Var.b());
        }
    }

    @Override
    public final void z(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.b6) l1Var.f5774a).getTextView();
            if (textView.isFocused()) {
                pn pnVar = this.d;
                if (pnVar.F) {
                    fn fnVar = pnVar.f27967x;
                    if (fnVar != null) {
                        fnVar.f();
                    }
                    pnVar.Z(true);
                }
                pnVar.f27939d1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

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
public final class sn extends vl0 {
    public final Context f28199c;
    public final un d;

    public sn(un unVar, Context context) {
        this.d = unVar;
        this.f28199c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        un unVar = this.d;
        if (b10 != unVar.f28768u0 && b10 != unVar.G0 && b10 != unVar.B0 && b10 != unVar.F0 && b10 != unVar.C0 && b10 != unVar.H0 && b10 != unVar.D0 && b10 != unVar.E0 && b10 != unVar.I0 && b10 != unVar.J0 && b10 != unVar.N0.f3657b && b10 != unVar.M0.f3657b && b10 != unVar.L0) {
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
        un unVar = this.d;
        if (i10 != unVar.B0 && i10 != unVar.F0 && i10 != unVar.G0 && i10 != unVar.C0 && i10 != unVar.D0 && i10 != unVar.E0 && i10 != unVar.H0 && i10 != unVar.M0.f3657b && i10 != unVar.N0.f3657b) {
            if (i10 != unVar.f28757l0 && i10 != unVar.f28766s0 && i10 != unVar.f28771w0 && i10 != unVar.f28760o0) {
                if (i10 == unVar.f28764r0) {
                    return 1;
                }
                if (i10 != unVar.f28769v0 && i10 != unVar.f28773x0 && i10 != unVar.f28762q0 && i10 != unVar.K0) {
                    if (i10 != unVar.f28768u0 && i10 != unVar.I0 && i10 != unVar.L0) {
                        if (i10 == unVar.m0) {
                            return 4;
                        }
                        if (i10 == unVar.f28759n0) {
                            return 11;
                        }
                        if (i10 == unVar.f28761p0) {
                            return 7;
                        }
                        if (i10 != unVar.f28775y0 && i10 != unVar.f28776z0 && i10 != unVar.J0) {
                            if (i10 == unVar.A0) {
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
        un unVar = this.d;
        boolean z12 = unVar.f28743e0;
        c2.a aVar = unVar.M0;
        c2.a aVar2 = unVar.N0;
        org.telegram.ui.ActionBar.e6 e6Var = unVar.f26687a;
        boolean z13 = unVar.f28758n;
        int i15 = c1Var.f42932f;
        View view = c1Var.f42929a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f28199c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == unVar.B0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !unVar.f28735a0);
                                } else {
                                    if (i10 == unVar.F0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, unVar.f28737b0);
                                    } else if (i10 == unVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, unVar.R);
                                    } else if (i10 == unVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, unVar.T);
                                    } else if (i10 == unVar.E0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, unVar.S);
                                    } else if (i10 == unVar.G0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, unVar.f28739c0);
                                    } else if (i10 == aVar2.f3657b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.f3656a);
                                    } else if (i10 == aVar.f3657b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.f3656a);
                                    } else if (i10 == unVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (unVar.U == 0 && unVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.a(string, string2, 8, i17, z10);
                                        a6Var = a6Var;
                                        if (unVar.U == 0 && unVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        a6Var.setDivider(z11);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == unVar.G0) {
                                    a6Var.getCheckBox().f22383a.a(z12, false);
                                    return;
                                } else if (i10 == unVar.C0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!unVar.f28739c0 && !unVar.f28735a0) {
                                        z14 = false;
                                    }
                                    checkBox.f22383a.a(z14, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f22383a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == unVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = unVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        r8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == unVar.I0) {
                        unVar.U(r8Var, false);
                        return;
                    } else {
                        r8Var.e(-1, org.telegram.ui.ActionBar.j6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, e6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19191k7, e6Var), mode));
                        pq pqVar = new pq(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), pqVar, false);
                        r8Var.f20845w = 20;
                        r8Var.f20844s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                new pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19006a7, e6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19026b7)).f27303w = true;
                if (i10 == unVar.f28762q0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == unVar.f28773x0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = unVar.J - unVar.M;
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
                    } else if (i10 == unVar.K0) {
                        e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == unVar.f28775y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = unVar.f28745f0;
                if (unVar.f28776z0 != -1) {
                    z15 = true;
                }
                w8Var.f(string4, z16, z15);
                w8Var.e(null, true);
                return;
            } else if (i10 == unVar.f28776z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), unVar.f28747g0, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == unVar.J0) {
                w8Var.f(LocaleController.getString(R.string.PollV2HideResults), unVar.W, false);
                w8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == unVar.f28757l0) {
            m4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == unVar.f28760o0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == unVar.f28766s0) {
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
            } else if (i10 == unVar.f28771w0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        rn m4Var;
        View view;
        un unVar = this.d;
        boolean z10 = unVar.f28758n;
        org.telegram.ui.ActionBar.e6 e6Var = unVar.f26687a;
        Context context = this.f28199c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f28199c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, unVar.f26687a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                new pq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19006a7, e6Var)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.j6.f19026b7)).f27303w = true;
                m4Var = b7Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.e9(context, e6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.r8(context, e6Var);
                break;
            case 4:
            case 11:
                boolean z11 = unVar.I;
                nn nnVar = new nn(this, this.f28199c, z11 ? 1 : 0, unVar.f26687a, i10);
                if (i10 == 11 && !z10) {
                    nnVar.setTextRight(98);
                    nnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final sn f26186b;

                        {
                            this.f26186b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    un.O(this.f26186b.d, -2);
                                    return;
                                case 1:
                                    un.O(this.f26186b.d, -3);
                                    return;
                                default:
                                    this.f26186b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                nnVar.d();
                nnVar.setIconsColor(org.telegram.ui.ActionBar.j6.f19265o7);
                nnVar.c(new on(this, nnVar, i10));
                m4Var = nnVar;
                break;
            case 5:
            default:
                boolean z12 = unVar.I;
                rn rnVar = new rn(this, this.f28199c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final sn f26186b;

                    {
                        this.f26186b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                un.O(this.f26186b.d, -2);
                                return;
                            case 1:
                                un.O(this.f26186b.d, -3);
                                return;
                            default:
                                this.f26186b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                return;
                        }
                    }
                }, unVar.f26687a);
                if (!z10) {
                    rnVar.setTextRight(140);
                    rnVar.b().setOnClickListener(new org.telegram.ui.sf(23, this, rnVar));
                }
                int i11 = org.telegram.ui.ActionBar.j6.f19265o7;
                rnVar.setIconsColor(i11);
                np npVar = rnVar.f20103r;
                if (npVar != null) {
                    npVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = npVar.getCheckBoxBase();
                    float f7 = rnVar.f20098a.e;
                    if (checkBoxBase.f22163w != f7) {
                        checkBoxBase.f22163w = f7;
                        checkBoxBase.b();
                    }
                }
                rnVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.j6.f19191k7);
                rnVar.c(new qn(1, this, rnVar));
                rnVar.setShowNextButton(true);
                EditTextBoldCursor textView = rnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.wd(2, this, rnVar));
                textView.setOnKeyListener(new mn(rnVar, 0));
                m4Var = rnVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, e6Var);
                break;
            case 7:
                pn pnVar = new pn(this, context, unVar.I ? 1 : 0);
                pnVar.d();
                if (!z10) {
                    pnVar.setTextRight(98);
                    pnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final sn f26186b;

                        {
                            this.f26186b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    un.O(this.f26186b.d, -2);
                                    return;
                                case 1:
                                    un.O(this.f26186b.d, -3);
                                    return;
                                default:
                                    this.f26186b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                pnVar.setIconsColor(org.telegram.ui.ActionBar.j6.f19265o7);
                pnVar.c(new qn(0, this, pnVar));
                m4Var = pnVar;
                break;
            case 8:
                View knVar = new kn(context, 0);
                knVar.setTag(-33024);
                view = knVar;
                m4Var = view;
                break;
            case 9:
                View ebVar = new ci.eb(this, context, 14);
                ebVar.setTag(-33024);
                view = ebVar;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, e6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        un unVar = this.d;
        qh.f fVar = unVar.l1;
        boolean z10 = unVar.f28758n;
        int i12 = c1Var.f42932f;
        View view = c1Var.f42929a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence2 = unVar.N;
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
            un.L(unVar, view, c1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence3 = unVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            d6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            un.L(unVar, view, c1Var.b());
        } else if (i12 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            d6Var3.f20098a.a(unVar.f28737b0, false);
            int i13 = b10 - unVar.f28767t0;
            CharSequence charSequence4 = unVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var3.n(charSequence4, LocaleController.getString(i10), true);
            d6Var3.setTag(null);
            if (unVar.f28755k0 == b10) {
                EditTextBoldCursor textView = d6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                unVar.f28755k0 = -1;
            }
            if (!z10) {
                d6Var3.e.a(fVar.b(i13), false);
            }
            un.L(unVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
            d6Var4.setTag(1);
            CharSequence charSequence5 = unVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            d6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var4.setTag(null);
            if (!z10) {
                d6Var4.e.a(fVar.b(-3), false);
            }
            un.L(unVar, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f42932f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.f42929a).getTextView();
            if (textView.isFocused()) {
                un unVar = this.d;
                if (unVar.I) {
                    jn jnVar = unVar.f28772x;
                    if (jnVar != null) {
                        jnVar.f();
                    }
                    unVar.Z(true);
                }
                unVar.f28748g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

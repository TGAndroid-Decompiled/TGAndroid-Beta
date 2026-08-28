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
public final class hn extends vk0 {
    public final Context f29134c;
    public final jn d;

    public hn(jn jnVar, Context context) {
        this.d = jnVar;
        this.f29134c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int b10 = q1Var.b();
        jn jnVar = this.d;
        if (b10 != jnVar.f29788q0 && b10 != jnVar.C0 && b10 != jnVar.f29799x0 && b10 != jnVar.B0 && b10 != jnVar.f29801y0 && b10 != jnVar.D0 && b10 != jnVar.f29802z0 && b10 != jnVar.A0 && b10 != jnVar.E0 && b10 != jnVar.F0 && b10 != jnVar.J0.f16883b && b10 != jnVar.I0.f16883b && b10 != jnVar.H0) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.d.M0;
    }

    @Override
    public final int j(int i9) {
        jn jnVar = this.d;
        if (i9 != jnVar.f29799x0 && i9 != jnVar.B0 && i9 != jnVar.C0 && i9 != jnVar.f29801y0 && i9 != jnVar.f29802z0 && i9 != jnVar.A0 && i9 != jnVar.D0 && i9 != jnVar.I0.f16883b && i9 != jnVar.J0.f16883b) {
            if (i9 != jnVar.f29778h0 && i9 != jnVar.f29786o0 && i9 != jnVar.f29792s0 && i9 != jnVar.f29782k0) {
                if (i9 == jnVar.f29785n0) {
                    return 1;
                }
                if (i9 != jnVar.f29790r0 && i9 != jnVar.f29793t0 && i9 != jnVar.m0 && i9 != jnVar.G0) {
                    if (i9 != jnVar.f29788q0 && i9 != jnVar.E0 && i9 != jnVar.H0) {
                        if (i9 == jnVar.f29780i0) {
                            return 4;
                        }
                        if (i9 == jnVar.f29781j0) {
                            return 11;
                        }
                        if (i9 == jnVar.f29783l0) {
                            return 7;
                        }
                        if (i9 != jnVar.f29794u0 && i9 != jnVar.f29795v0 && i9 != jnVar.F0) {
                            if (i9 == jnVar.f29797w0) {
                                return 8;
                            }
                            if (i9 == 0) {
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
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        String formatPluralString;
        boolean z10;
        boolean z11;
        jn jnVar = this.d;
        boolean z12 = jnVar.f29764a0;
        m.a aVar = jnVar.I0;
        m.a aVar2 = jnVar.J0;
        org.telegram.ui.ActionBar.b6 b6Var = jnVar.f27492a;
        boolean z13 = jnVar.f29784n;
        int i14 = q1Var.f5505f;
        View view = q1Var.f5501a;
        int i15 = 3;
        if (i14 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i14 != 6) {
                Context context = this.f29134c;
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 9) {
                            if (i14 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i9 == jnVar.f29799x0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !jnVar.T);
                                } else {
                                    if (i9 == jnVar.B0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, jnVar.U);
                                    } else if (i9 == jnVar.f29802z0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, jnVar.N);
                                    } else if (i9 == jnVar.f29801y0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, jnVar.P);
                                    } else if (i9 == jnVar.A0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, jnVar.O);
                                    } else if (i9 == jnVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, jnVar.V);
                                    } else if (i9 == aVar2.f16883b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.f16882a);
                                    } else if (i9 == aVar.f16883b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.f16882a);
                                    } else if (i9 == jnVar.D0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i16 = R.drawable.filled_poll_deadline_24;
                                        if (jnVar.Q == 0 && jnVar.R == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.a(string, string2, 8, i16, z10);
                                        a6Var = a6Var;
                                        if (jnVar.Q == 0 && jnVar.R == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        a6Var.setDivider(z11);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i9 == jnVar.C0) {
                                    a6Var.getCheckBox().f26542a.a(z12, false);
                                    return;
                                } else if (i9 == jnVar.f29801y0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!jnVar.V && !jnVar.T) {
                                        z14 = false;
                                    }
                                    checkBox.f26542a.a(z14, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f26542a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                    if (i9 == jnVar.H0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = jnVar.L0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        p8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i9 == jnVar.E0) {
                        jnVar.T(p8Var, false);
                        return;
                    } else {
                        p8Var.e(-1, org.telegram.ui.ActionBar.f6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.N6, b6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23128k7, b6Var), mode));
                        fq fqVar = new fq(drawable, drawable2);
                        if (z13) {
                            i13 = R.string.TodoNewTask;
                        } else {
                            i13 = R.string.AddAnOption;
                        }
                        p8Var.n(LocaleController.getString(i13), fqVar, false);
                        p8Var.f24880w = 20;
                        p8Var.f24879s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.b9 b9Var = (org.telegram.ui.Cells.b9) view;
                b9Var.setFixedSize(0);
                new fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, b6Var)), org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7)).f28550w = true;
                if (i9 == jnVar.m0) {
                    b9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i9 == jnVar.f29793t0) {
                    b9Var.setFixedSize(12);
                    b9Var.setText(null);
                    return;
                } else {
                    int i17 = jnVar.F - jnVar.I;
                    if (i17 <= 0) {
                        if (z13) {
                            i12 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i12 = R.string.AddAnOptionInfoMax;
                        }
                        b9Var.setText(LocaleController.getString(i12));
                        return;
                    } else if (z13) {
                        b9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i17));
                        return;
                    } else if (i9 == jnVar.G0) {
                        b9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        b9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i17, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
            if (i9 == jnVar.f29794u0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = jnVar.f29766b0;
                if (jnVar.f29795v0 != -1) {
                    z15 = true;
                }
                t8Var.f(string4, z16, z15);
                t8Var.e(null, true);
                return;
            } else if (i9 == jnVar.f29795v0) {
                t8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), jnVar.f29768c0, false);
                t8Var.e(null, true);
                return;
            } else if (i9 == jnVar.F0) {
                t8Var.f(LocaleController.getString(R.string.PollV2HideResults), jnVar.S, false);
                t8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i9 == jnVar.f29778h0) {
            m4Var.getTextView().setGravity(19);
            if (z13) {
                i11 = R.string.TodoTitle;
            } else {
                i11 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i11));
        } else if (i9 == jnVar.f29782k0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i15 = 5;
            }
            textView.setGravity(i15 | 16);
            if (i9 == jnVar.f29786o0) {
                if (z12) {
                    m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                    return;
                }
                if (z13) {
                    i10 = R.string.TodoItemsTitle;
                } else {
                    i10 = R.string.AnswerOptions2;
                }
                m4Var.setText(LocaleController.getString(i10));
            } else if (i9 == jnVar.f29792s0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        gn m4Var;
        View view;
        jn jnVar = this.d;
        boolean z10 = jnVar.f29784n;
        org.telegram.ui.ActionBar.b6 b6Var = jnVar.f27492a;
        Context context = this.f29134c;
        switch (i9) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f29134c, org.telegram.ui.ActionBar.f6.L6, 21, 15, false, jnVar.f27492a);
                break;
            case 1:
                View z6Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                new fq(new ColorDrawable(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, b6Var)), org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.f6.f22966b7)).f28550w = true;
                m4Var = z6Var;
                break;
            case 2:
                m4Var = new org.telegram.ui.Cells.b9(context, b6Var);
                break;
            case 3:
                m4Var = new org.telegram.ui.Cells.p8(context, b6Var);
                break;
            case 4:
            case 11:
                boolean z11 = jnVar.E;
                dn dnVar = new dn(this, this.f29134c, z11 ? 1 : 0, jnVar.f27492a, i9);
                if (i9 == 11 && !z10) {
                    dnVar.setTextRight(98);
                    dnVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final hn f27254b;

                        {
                            this.f27254b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    jn.N(this.f27254b.d, -2);
                                    return;
                                case 1:
                                    jn.N(this.f27254b.d, -3);
                                    return;
                                default:
                                    this.f27254b.d.W(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                dnVar.c();
                dnVar.setIconsColor(org.telegram.ui.ActionBar.f6.f23197o7);
                dnVar.b(new en(this, dnVar, i9));
                m4Var = dnVar;
                break;
            case 5:
            default:
                boolean z12 = jnVar.E;
                gn gnVar = new gn(this, this.f29134c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final hn f27254b;

                    {
                        this.f27254b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                jn.N(this.f27254b.d, -2);
                                return;
                            case 1:
                                jn.N(this.f27254b.d, -3);
                                return;
                            default:
                                this.f27254b.d.W(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                return;
                        }
                    }
                }, jnVar.f27492a);
                if (!z10) {
                    gnVar.setTextRight(140);
                    gnVar.a().setOnClickListener(new s2(10, this, gnVar));
                }
                int i10 = org.telegram.ui.ActionBar.f6.f23197o7;
                gnVar.setIconsColor(i10);
                dp dpVar = gnVar.f24201r;
                if (dpVar != null) {
                    dpVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = dpVar.getCheckBoxBase();
                    float f10 = gnVar.f24195a.f47775e;
                    if (checkBoxBase.f26318w != f10) {
                        checkBoxBase.f26318w = f10;
                        checkBoxBase.b();
                    }
                }
                gnVar.getCheckBox().b(-1, i10, org.telegram.ui.ActionBar.f6.f23128k7);
                gnVar.b(new fh.t4(this, gnVar, false, 7));
                gnVar.setShowNextButton(true);
                EditTextBoldCursor textView = gnVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.td(2, this, gnVar));
                textView.setOnKeyListener(new cn(gnVar, 0));
                m4Var = gnVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.t8(context, b6Var);
                break;
            case 7:
                fn fnVar = new fn(this, context, jnVar.E ? 1 : 0);
                fnVar.c();
                if (!z10) {
                    fnVar.setTextRight(98);
                    fnVar.a().setOnClickListener(new View.OnClickListener(this) {
                        public final hn f27254b;

                        {
                            this.f27254b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    jn.N(this.f27254b.d, -2);
                                    return;
                                case 1:
                                    jn.N(this.f27254b.d, -3);
                                    return;
                                default:
                                    this.f27254b.d.W(view2, (org.telegram.ui.Cells.c6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                fnVar.setIconsColor(org.telegram.ui.ActionBar.f6.f23197o7);
                fnVar.b(new fh.t4(this, fnVar, false, 6));
                m4Var = fnVar;
                break;
            case 8:
                View anVar = new an(context, 0);
                anVar.setTag(-33024);
                view = anVar;
                m4Var = view;
                break;
            case 9:
                View l2Var = new fh.l2(this, context, 13);
                l2Var.setTag(-33024);
                view = l2Var;
                m4Var = view;
                break;
            case 10:
                org.telegram.ui.Cells.a6 a6Var = new org.telegram.ui.Cells.a6(context, b6Var);
                a6Var.getCheckBox().setIcon(R.drawable.permission_locked);
                m4Var = a6Var;
                break;
        }
        return j3.r0.s(m4Var, m4Var, -1, -2);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        int i9;
        int i10;
        jn jnVar = this.d;
        yg.f fVar = jnVar.f29779h1;
        boolean z10 = jnVar.f29784n;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        CharSequence charSequence = "";
        if (i11 == 4) {
            org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view;
            c6Var.setTag(1);
            CharSequence charSequence2 = jnVar.J;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i10 = R.string.TodoTitlePlaceholder;
            } else {
                i10 = R.string.QuestionHint;
            }
            c6Var.n(charSequence, LocaleController.getString(i10), true);
            c6Var.setTag(null);
            jn.K(jnVar, view, q1Var.b());
        } else if (i11 == 11) {
            org.telegram.ui.Cells.c6 c6Var2 = (org.telegram.ui.Cells.c6) view;
            c6Var2.setTag(1);
            CharSequence charSequence3 = jnVar.K;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            c6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            c6Var2.setTag(null);
            c6Var2.f24198e.a(fVar.b(-2), false);
            jn.K(jnVar, view, q1Var.b());
        } else if (i11 == 5) {
            int b10 = q1Var.b();
            org.telegram.ui.Cells.c6 c6Var3 = (org.telegram.ui.Cells.c6) view;
            c6Var3.setTag(1);
            c6Var3.f24195a.a(jnVar.U, false);
            int i12 = b10 - jnVar.f29787p0;
            CharSequence charSequence4 = jnVar.G[i12];
            if (z10) {
                i9 = R.string.TodoTaskPlaceholder;
            } else {
                i9 = R.string.OptionHint;
            }
            c6Var3.n(charSequence4, LocaleController.getString(i9), true);
            c6Var3.setTag(null);
            if (jnVar.f29776g0 == b10) {
                EditTextBoldCursor textView = c6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                jnVar.f29776g0 = -1;
            }
            if (!z10) {
                c6Var3.f24198e.a(fVar.b(i12), false);
            }
            jn.K(jnVar, view, b10);
        } else if (i11 == 7) {
            org.telegram.ui.Cells.c6 c6Var4 = (org.telegram.ui.Cells.c6) view;
            c6Var4.setTag(1);
            CharSequence charSequence5 = jnVar.L;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            c6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            c6Var4.setTag(null);
            if (!z10) {
                c6Var4.f24198e.a(fVar.b(-3), false);
            }
            jn.K(jnVar, view, q1Var.b());
        }
    }

    @Override
    public final void z(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 == 4 || i9 == 11 || i9 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.c6) q1Var.f5501a).getTextView();
            if (textView.isFocused()) {
                jn jnVar = this.d;
                if (jnVar.E) {
                    zm zmVar = jnVar.f29798x;
                    if (zmVar != null) {
                        zmVar.f();
                    }
                    jnVar.Y(true);
                }
                jnVar.f29769c1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

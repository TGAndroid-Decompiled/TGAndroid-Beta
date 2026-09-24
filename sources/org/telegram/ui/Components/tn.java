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
public final class tn extends vl0 {
    public final Context f28564c;
    public final vn d;

    public tn(vn vnVar, Context context) {
        this.d = vnVar;
        this.f28564c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int b10 = c1Var.b();
        vn vnVar = this.d;
        if (b10 != vnVar.f29208u0 && b10 != vnVar.G0 && b10 != vnVar.B0 && b10 != vnVar.F0 && b10 != vnVar.C0 && b10 != vnVar.H0 && b10 != vnVar.D0 && b10 != vnVar.E0 && b10 != vnVar.I0 && b10 != vnVar.J0 && b10 != vnVar.N0.f3649b && b10 != vnVar.M0.f3649b && b10 != vnVar.L0) {
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
        vn vnVar = this.d;
        if (i10 != vnVar.B0 && i10 != vnVar.F0 && i10 != vnVar.G0 && i10 != vnVar.C0 && i10 != vnVar.D0 && i10 != vnVar.E0 && i10 != vnVar.H0 && i10 != vnVar.M0.f3649b && i10 != vnVar.N0.f3649b) {
            if (i10 != vnVar.f29197l0 && i10 != vnVar.f29206s0 && i10 != vnVar.f29211w0 && i10 != vnVar.f29200o0) {
                if (i10 == vnVar.f29204r0) {
                    return 1;
                }
                if (i10 != vnVar.f29209v0 && i10 != vnVar.f29213x0 && i10 != vnVar.f29202q0 && i10 != vnVar.K0) {
                    if (i10 != vnVar.f29208u0 && i10 != vnVar.I0 && i10 != vnVar.L0) {
                        if (i10 == vnVar.m0) {
                            return 4;
                        }
                        if (i10 == vnVar.f29199n0) {
                            return 11;
                        }
                        if (i10 == vnVar.f29201p0) {
                            return 7;
                        }
                        if (i10 != vnVar.f29215y0 && i10 != vnVar.f29216z0 && i10 != vnVar.J0) {
                            if (i10 == vnVar.A0) {
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
        vn vnVar = this.d;
        boolean z12 = vnVar.f29183e0;
        c2.a aVar = vnVar.M0;
        c2.a aVar2 = vnVar.N0;
        org.telegram.ui.ActionBar.d6 d6Var = vnVar.f27082a;
        boolean z13 = vnVar.f29198n;
        int i15 = c1Var.f42949f;
        View view = c1Var.f42946a;
        int i16 = 3;
        if (i15 != 0) {
            boolean z14 = true;
            boolean z15 = false;
            if (i15 != 6) {
                Context context = this.f28564c;
                if (i15 != 2) {
                    if (i15 != 3) {
                        if (i15 != 9) {
                            if (i15 == 10) {
                                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view;
                                a6Var.setDivider(false);
                                if (i10 == vnVar.B0) {
                                    a6Var.a(LocaleController.getString(R.string.PollV2ShowWhoVoted), LocaleController.getString(R.string.PollV2ShowWhoVotedInfo), 1, R.drawable.filled_poll_view_24, !vnVar.f29175a0);
                                } else {
                                    if (i10 == vnVar.F0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowMultipleAnswers), LocaleController.getString(R.string.PollV2AllowMultipleAnswersInfo), 5, R.drawable.filled_poll_multiple_24, vnVar.f29177b0);
                                    } else if (i10 == vnVar.D0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowRevoting), LocaleController.getString(R.string.PollV2AllowRevotingInfo), 10, R.drawable.filled_poll_revote_24, vnVar.R);
                                    } else if (i10 == vnVar.C0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2AllowAddingOptions), LocaleController.getString(R.string.PollV2AllowAddingOptionsInfo), 9, R.drawable.filled_poll_add_24, vnVar.T);
                                    } else if (i10 == vnVar.E0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2ShuffleOptions), LocaleController.getString(R.string.PollV2ShuffleOptionsInfo), 6, R.drawable.filled_poll_shuffle_24, vnVar.S);
                                    } else if (i10 == vnVar.G0) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2SetCorrectAnswer), LocaleController.getString(R.string.PollV2SetCorrectAnswerInfo), 7, R.drawable.filled_poll_correct_24, vnVar.f29179c0);
                                    } else if (i10 == aVar2.f3649b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2LimitByCountry), LocaleController.getString(R.string.PollV2LimitByCountryInfo), 4, R.drawable.filled_location, aVar2.f3648a);
                                    } else if (i10 == aVar.f3649b) {
                                        a6Var.a(LocaleController.getString(R.string.PollV2RestrictToSubscribers), LocaleController.getString(R.string.PollV2RestrictToSubscribersInfo), 3, R.drawable.msg_folders_groups, aVar.f3648a);
                                    } else if (i10 == vnVar.H0) {
                                        String string = LocaleController.getString(R.string.PollV2LimitDuration);
                                        String string2 = LocaleController.getString(R.string.PollV2LimitDurationInfo);
                                        int i17 = R.drawable.filled_poll_deadline_24;
                                        if (vnVar.U == 0 && vnVar.V == 0) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        a6Var.a(string, string2, 8, i17, z10);
                                        a6Var = a6Var;
                                        if (vnVar.U == 0 && vnVar.V == 0) {
                                            z11 = false;
                                        } else {
                                            z11 = true;
                                        }
                                        a6Var.setDivider(z11);
                                    }
                                    a6Var = a6Var;
                                }
                                if (i10 == vnVar.G0) {
                                    a6Var.getCheckBox().f22405a.a(z12, false);
                                    return;
                                } else if (i10 == vnVar.C0) {
                                    Switch checkBox = a6Var.getCheckBox();
                                    if (!vnVar.f29179c0 && !vnVar.f29175a0) {
                                        z14 = false;
                                    }
                                    checkBox.f22405a.a(z14, false);
                                    return;
                                } else {
                                    a6Var.getCheckBox().f22405a.a(false, false);
                                    return;
                                }
                            }
                            return;
                        }
                        view.requestLayout();
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    if (i10 == vnVar.L0) {
                        String string3 = LocaleController.getString(R.string.PollV2AllowedCountries);
                        ArrayList arrayList = vnVar.P0;
                        if (arrayList.isEmpty()) {
                            formatPluralString = LocaleController.getString(R.string.SearchCountriesSelect);
                        } else if (arrayList.size() == 1) {
                            formatPluralString = LocaleController.getCountryName((String) arrayList.get(0));
                        } else {
                            formatPluralString = LocaleController.formatPluralString("PollV2AllowedCountriesListManyP", arrayList.size(), new Object[0]);
                        }
                        r8Var.o(string3, formatPluralString, false, true);
                        return;
                    } else if (i10 == vnVar.I0) {
                        vnVar.U(r8Var, false);
                        return;
                    } else {
                        r8Var.e(-1, org.telegram.ui.ActionBar.h6.il);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.N6, d6Var);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19173k7, d6Var), mode));
                        qq qqVar = new qq(drawable, drawable2);
                        if (z13) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), qqVar, false);
                        r8Var.f20867w = 20;
                        r8Var.f20866s = 58;
                        return;
                    }
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                new qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18989a7, d6Var)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19009b7)).f27733w = true;
                if (i10 == vnVar.f29202q0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == vnVar.f29213x0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i18 = vnVar.J - vnVar.M;
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
                    } else if (i10 == vnVar.K0) {
                        e9Var.setText(LocaleController.getString(R.string.PollV2HideResultsInfo));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString(R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i18, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            if (i10 == vnVar.f29215y0) {
                String string4 = LocaleController.getString(R.string.TodoAllowAddingTasks);
                boolean z16 = vnVar.f29185f0;
                if (vnVar.f29216z0 != -1) {
                    z15 = true;
                }
                w8Var.f(string4, z16, z15);
                w8Var.e(null, true);
                return;
            } else if (i10 == vnVar.f29216z0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), vnVar.f29187g0, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == vnVar.J0) {
                w8Var.f(LocaleController.getString(R.string.PollV2HideResults), vnVar.W, false);
                w8Var.e(null, true);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == vnVar.f29197l0) {
            m4Var.getTextView().setGravity(19);
            if (z13) {
                i12 = R.string.TodoTitle;
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == vnVar.f29200o0) {
            m4Var.getTextView().setGravity(19);
            m4Var.setText(LocaleController.getString(R.string.AddAnExplanationHeader));
        } else {
            TextView textView = m4Var.getTextView();
            if (LocaleController.isRTL) {
                i16 = 5;
            }
            textView.setGravity(i16 | 16);
            if (i10 == vnVar.f29206s0) {
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
            } else if (i10 == vnVar.f29211w0) {
                m4Var.setText(LocaleController.getString(R.string.Settings));
            }
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        sn m4Var;
        View view;
        vn vnVar = this.d;
        boolean z10 = vnVar.f29198n;
        org.telegram.ui.ActionBar.d6 d6Var = vnVar.f27082a;
        Context context = this.f28564c;
        switch (i10) {
            case 0:
                m4Var = new org.telegram.ui.Cells.m4(this.f28564c, org.telegram.ui.ActionBar.h6.L6, 21, 15, false, vnVar.f27082a);
                break;
            case 1:
                View b7Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                new qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18989a7, d6Var)), org.telegram.ui.ActionBar.h6.V0(context, R.drawable.greydivider, org.telegram.ui.ActionBar.h6.f19009b7)).f27733w = true;
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
                boolean z11 = vnVar.I;
                on onVar = new on(this, this.f28564c, z11 ? 1 : 0, vnVar.f27082a, i10);
                if (i10 == 11 && !z10) {
                    onVar.setTextRight(98);
                    onVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final tn f26545b;

                        {
                            this.f26545b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    vn.O(this.f26545b.d, -2);
                                    return;
                                case 1:
                                    vn.O(this.f26545b.d, -3);
                                    return;
                                default:
                                    this.f26545b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                onVar.d();
                onVar.setIconsColor(org.telegram.ui.ActionBar.h6.f19247o7);
                onVar.c(new pn(this, onVar, i10));
                m4Var = onVar;
                break;
            case 5:
            default:
                boolean z12 = vnVar.I;
                sn snVar = new sn(this, this.f28564c, z12 ? 1 : 0, new View.OnClickListener(this) {
                    public final tn f26545b;

                    {
                        this.f26545b = this;
                    }

                    @Override
                    public final void onClick(View view2) {
                        switch (r2) {
                            case 0:
                                vn.O(this.f26545b.d, -2);
                                return;
                            case 1:
                                vn.O(this.f26545b.d, -3);
                                return;
                            default:
                                this.f26545b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                return;
                        }
                    }
                }, vnVar.f27082a);
                if (!z10) {
                    snVar.setTextRight(140);
                    snVar.b().setOnClickListener(new org.telegram.ui.pf(23, this, snVar));
                }
                int i11 = org.telegram.ui.ActionBar.h6.f19247o7;
                snVar.setIconsColor(i11);
                op opVar = snVar.f20125r;
                if (opVar != null) {
                    opVar.getCheckBoxBase().i(AndroidUtilities.dp(6.0f));
                    CheckBoxBase checkBoxBase = opVar.getCheckBoxBase();
                    float f7 = snVar.f20120a.e;
                    if (checkBoxBase.f22185w != f7) {
                        checkBoxBase.f22185w = f7;
                        checkBoxBase.b();
                    }
                }
                snVar.getCheckBox().b(-1, i11, org.telegram.ui.ActionBar.h6.f19173k7);
                snVar.c(new rn(1, this, snVar));
                snVar.setShowNextButton(true);
                EditTextBoldCursor textView = snVar.getTextView();
                textView.setImeOptions(textView.getImeOptions() | 5);
                textView.setOnEditorActionListener(new org.telegram.ui.vd(2, this, snVar));
                textView.setOnKeyListener(new nn(snVar, 0));
                m4Var = snVar;
                break;
            case 6:
                m4Var = new org.telegram.ui.Cells.w8(context, d6Var);
                break;
            case 7:
                qn qnVar = new qn(this, context, vnVar.I ? 1 : 0);
                qnVar.d();
                if (!z10) {
                    qnVar.setTextRight(98);
                    qnVar.b().setOnClickListener(new View.OnClickListener(this) {
                        public final tn f26545b;

                        {
                            this.f26545b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            switch (r2) {
                                case 0:
                                    vn.O(this.f26545b.d, -2);
                                    return;
                                case 1:
                                    vn.O(this.f26545b.d, -3);
                                    return;
                                default:
                                    this.f26545b.d.X(view2, (org.telegram.ui.Cells.d6) view2.getParent(), true);
                                    return;
                            }
                        }
                    });
                }
                qnVar.setIconsColor(org.telegram.ui.ActionBar.h6.f19247o7);
                qnVar.c(new rn(0, this, qnVar));
                m4Var = qnVar;
                break;
            case 8:
                View lnVar = new ln(context, 0);
                lnVar.setTag(-33024);
                view = lnVar;
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
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        vn vnVar = this.d;
        qh.f fVar = vnVar.l1;
        boolean z10 = vnVar.f29198n;
        int i12 = c1Var.f42949f;
        View view = c1Var.f42946a;
        CharSequence charSequence = "";
        if (i12 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            CharSequence charSequence2 = vnVar.N;
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
            vn.L(vnVar, view, c1Var.b());
        } else if (i12 == 11) {
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            CharSequence charSequence3 = vnVar.O;
            if (charSequence3 != null) {
                charSequence = charSequence3;
            }
            d6Var2.n(charSequence, LocaleController.getString(R.string.QuestionDescriptionHint), false);
            d6Var2.setTag(null);
            d6Var2.e.a(fVar.b(-2), false);
            vn.L(vnVar, view, c1Var.b());
        } else if (i12 == 5) {
            int b10 = c1Var.b();
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            d6Var3.f20120a.a(vnVar.f29177b0, false);
            int i13 = b10 - vnVar.f29207t0;
            CharSequence charSequence4 = vnVar.K[i13];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var3.n(charSequence4, LocaleController.getString(i10), true);
            d6Var3.setTag(null);
            if (vnVar.f29195k0 == b10) {
                EditTextBoldCursor textView = d6Var3.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                vnVar.f29195k0 = -1;
            }
            if (!z10) {
                d6Var3.e.a(fVar.b(i13), false);
            }
            vn.L(vnVar, view, b10);
        } else if (i12 == 7) {
            org.telegram.ui.Cells.d6 d6Var4 = (org.telegram.ui.Cells.d6) view;
            d6Var4.setTag(1);
            CharSequence charSequence5 = vnVar.P;
            if (charSequence5 != null) {
                charSequence = charSequence5;
            }
            d6Var4.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var4.setTag(null);
            if (!z10) {
                d6Var4.e.a(fVar.b(-3), false);
            }
            vn.L(vnVar, view, c1Var.b());
        }
    }

    @Override
    public final void z(s4.c1 c1Var) {
        int i10 = c1Var.f42949f;
        if (i10 == 4 || i10 == 11 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) c1Var.f42946a).getTextView();
            if (textView.isFocused()) {
                vn vnVar = this.d;
                if (vnVar.I) {
                    kn knVar = vnVar.f29212x;
                    if (knVar != null) {
                        knVar.f();
                    }
                    vnVar.Z(true);
                }
                vnVar.f29188g1 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

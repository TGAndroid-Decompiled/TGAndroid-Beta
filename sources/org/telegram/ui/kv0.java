package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
public final class kv0 extends org.telegram.ui.Components.ql0 {
    public final Context f35594c;
    public final mv0 d;

    public kv0(mv0 mv0Var, Context context) {
        this.d = mv0Var;
        this.f35594c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10;
        int b10 = l1Var.b();
        mv0 mv0Var = this.d;
        if (b10 != mv0Var.f36238f0 && b10 != mv0Var.f36251r0 && b10 != mv0Var.f36253s0) {
            if (mv0Var.F && b10 >= (i10 = mv0Var.f36243k0) && b10 < mv0Var.f36261y + i10) {
                if (b10 - i10 < mv0Var.f36259x) {
                    return false;
                }
            } else if (b10 != mv0Var.f36244l0 && b10 != mv0Var.f36247o0 && b10 != mv0Var.f36248p0 && (mv0Var.K != 0 || b10 != mv0Var.f36249q0)) {
                return false;
            }
            return true;
        }
        return !mv0Var.F;
    }

    @Override
    public final int h() {
        return this.d.f36255u0;
    }

    @Override
    public final int j(int i10) {
        mv0 mv0Var = this.d;
        if (i10 != mv0Var.f36236e0 && i10 != mv0Var.f36242j0 && i10 != mv0Var.f36246n0) {
            if (i10 == mv0Var.f36241i0) {
                return 1;
            }
            if (i10 != mv0Var.m0 && i10 != mv0Var.f36254t0 && i10 != mv0Var.f36240h0) {
                if (i10 == mv0Var.f36244l0) {
                    return 3;
                }
                if (i10 == mv0Var.f36238f0) {
                    return 4;
                }
                if (i10 == mv0Var.f36239g0) {
                    return 7;
                }
                if (i10 != mv0Var.f36247o0 && i10 != mv0Var.f36248p0 && i10 != mv0Var.f36249q0 && i10 != mv0Var.f36251r0 && i10 != mv0Var.f36253s0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        mv0 mv0Var = this.d;
        int i15 = mv0Var.K;
        boolean z4 = mv0Var.f36230a0;
        int i16 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z10 = true;
        if (i16 != 0) {
            boolean z11 = false;
            if (i16 != 6) {
                Context context = this.f35594c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                        n8Var.e(-1, org.telegram.ui.ActionBar.j6.f20115q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20007k7, false), mode));
                        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(drawable, drawable2);
                        if (z4) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        n8Var.n(LocaleController.getString(i14), mqVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
                z8Var.setFixedSize(0);
                z8Var.setBackground(org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7));
                if (i10 == mv0Var.f36240h0) {
                    z8Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == mv0Var.f36254t0) {
                    z8Var.setFixedSize(12);
                    z8Var.setText(null);
                    return;
                } else {
                    int i17 = mv0Var.f36245n - mv0Var.f36261y;
                    if (i17 <= 0) {
                        if (z4) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        z8Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z4) {
                        z8Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i17));
                        return;
                    } else {
                        z8Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i17, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
            r8Var.setEnabled(!mv0Var.F);
            Switch checkBox = r8Var.getCheckBox();
            if (!mv0Var.F) {
                f10 = 1.0f;
            } else {
                f10 = 0.6f;
            }
            checkBox.setAlpha(f10);
            if (i10 == mv0Var.f36251r0) {
                r8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), mv0Var.E, true);
                r8Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f36253s0) {
                r8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), mv0Var.G, false);
                r8Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f36247o0) {
                r8Var.f(LocaleController.getString(R.string.PollAnonymous), mv0Var.D, (mv0Var.f36248p0 == -1 && mv0Var.f36249q0 == -1) ? true : true);
                r8Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f36248p0) {
                String string = LocaleController.getString(R.string.PollMultiple);
                boolean z12 = mv0Var.H;
                if (mv0Var.f36249q0 != -1) {
                    z11 = true;
                }
                r8Var.f(string, z12, z11);
                r8Var.e(null, true);
                return;
            } else if (i10 == mv0Var.f36249q0) {
                r8Var.f(LocaleController.getString(R.string.PollQuiz), mv0Var.I, false);
                if (i15 != 0) {
                    z10 = false;
                }
                r8Var.e(null, z10);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        if (i10 == mv0Var.f36236e0) {
            if (z4) {
                if (mv0Var.f36258w0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            l4Var.setText(LocaleController.getString(i12));
        } else if (i10 == mv0Var.f36242j0) {
            if (i15 == 1) {
                l4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            }
            if (z4) {
                i11 = R.string.TodoItemsTitle;
            } else {
                i11 = R.string.AnswerOptions2;
            }
            l4Var.setText(LocaleController.getString(i11));
        } else if (i10 == mv0Var.f36246n0) {
            l4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        jv0 jv0Var;
        mv0 mv0Var = this.d;
        boolean z4 = mv0Var.Z;
        if (i10 != 0) {
            Context context = this.f35594c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    jv0 jv0Var2 = new jv0(this, context, z4 ? 1 : 0, new g60(mv0Var, 21));
                                    jv0Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                                    jv0Var2.c(new cg.b0(this, jv0Var2, false, 13));
                                    jv0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = jv0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new ae(3, this, jv0Var2));
                                    textView.setOnKeyListener(new qg(jv0Var2, 2));
                                    jv0Var = jv0Var2;
                                } else {
                                    iv0 iv0Var = new iv0(this, context, z4 ? 1 : 0);
                                    iv0Var.d();
                                    iv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                                    iv0Var.c(new cg.b0(this, iv0Var, false, 12));
                                    jv0Var = iv0Var;
                                }
                            } else {
                                View r8Var = new org.telegram.ui.Cells.r8(context);
                                r8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                                jv0Var = r8Var;
                            }
                        } else {
                            hv0 hv0Var = new hv0(this, context, z4 ? 1 : 0);
                            hv0Var.d();
                            hv0Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                            hv0Var.c(new cg.b0(this, hv0Var, false, 11));
                            jv0Var = hv0Var;
                        }
                    } else {
                        View n8Var = new org.telegram.ui.Cells.n8(context);
                        n8Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
                        jv0Var = n8Var;
                    }
                } else {
                    jv0Var = new org.telegram.ui.Cells.z8(context);
                }
            } else {
                jv0Var = new org.telegram.ui.Cells.y6(context, (b) null);
            }
        } else {
            View l4Var = new org.telegram.ui.Cells.l4(this.f35594c, org.telegram.ui.ActionBar.j6.L6, 21, 15, false, null);
            l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19881d6, false));
            jv0Var = l4Var;
        }
        return ai.n(jv0Var, jv0Var, -1, -2);
    }

    @Override
    public final void y(f2.l1 l1Var) {
        boolean z4;
        int i10;
        int i11;
        int i12;
        mv0 mv0Var = this.d;
        boolean z10 = mv0Var.f36230a0;
        int i13 = l1Var.f5777f;
        View view = l1Var.f5774a;
        float f10 = 0.6f;
        CharSequence charSequence = "";
        float f11 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view;
            b6Var.setTag(1);
            dh.b bVar = b6Var.d;
            CharSequence charSequence2 = mv0Var.B;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z10) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            b6Var.n(charSequence, LocaleController.getString(i12), false);
            b6Var.setTag(null);
            b6Var.setEnabled(!mv0Var.F);
            bVar.setEnabled(true ^ mv0Var.F);
            int themedColor = mv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
            if (!mv0Var.F) {
                f10 = 1.0f;
            }
            bVar.setTextColor(org.telegram.ui.ActionBar.j6.l1(f10, themedColor));
            mv0.c0(mv0Var, view, l1Var.b());
        } else if (i13 == 5) {
            int b10 = l1Var.b();
            org.telegram.ui.Cells.b6 b6Var2 = (org.telegram.ui.Cells.b6) view;
            b6Var2.setTag(1);
            dh.b bVar2 = b6Var2.d;
            int i14 = b10 - mv0Var.f36243k0;
            if (mv0Var.F && i14 < mv0Var.f36259x) {
                z4 = false;
            } else {
                z4 = true;
            }
            bVar2.setEnabled(z4);
            int themedColor2 = mv0Var.getThemedColor(org.telegram.ui.ActionBar.j6.G6);
            if (z4) {
                f10 = 1.0f;
            }
            bVar2.setTextColor(org.telegram.ui.ActionBar.j6.l1(f10, themedColor2));
            CharSequence charSequence3 = mv0Var.v[i14];
            if (z10) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            b6Var2.n(charSequence3, LocaleController.getString(i10), true);
            b6Var2.setTag(null);
            ImageView imageView = b6Var2.f20847f;
            if (imageView != null) {
                if (z4) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = b6Var2.h;
            if (imageView2 != null) {
                if (!z4) {
                    f11 = 0.45f;
                }
                imageView2.setAlpha(f11);
            }
            if (!mv0Var.f36234c0 && mv0Var.f36235d0 == b10) {
                EditTextBoldCursor textView = b6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                mv0Var.f36234c0 = false;
                mv0Var.f36235d0 = -1;
            }
            mv0.c0(mv0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.b6 b6Var3 = (org.telegram.ui.Cells.b6) view;
            b6Var3.setTag(1);
            CharSequence charSequence4 = mv0Var.C;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            b6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            b6Var3.setTag(null);
            mv0.c0(mv0Var, view, l1Var.b());
        }
    }

    @Override
    public final void z(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.b6) l1Var.f5774a).getTextView();
            if (textView.isFocused()) {
                mv0 mv0Var = this.d;
                if (mv0Var.Z) {
                    org.telegram.ui.Components.qy0 qy0Var = mv0Var.N;
                    if (qy0Var != null) {
                        qy0Var.f();
                    }
                    mv0Var.k0(true);
                }
                mv0Var.Y = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

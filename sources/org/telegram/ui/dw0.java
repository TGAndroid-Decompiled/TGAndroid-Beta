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
public final class dw0 extends org.telegram.ui.Components.lm0 {
    public final Context f35145c;
    public final fw0 d;

    public dw0(fw0 fw0Var, Context context) {
        this.d = fw0Var;
        this.f35145c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10;
        int b10 = b1Var.b();
        fw0 fw0Var = this.d;
        if (b10 != fw0Var.f35991i0 && b10 != fw0Var.f36005u0 && b10 != fw0Var.f36006v0) {
            if (fw0Var.I && b10 >= (i10 = fw0Var.f35996n0) && b10 < fw0Var.f36011y + i10) {
                if (b10 - i10 < fw0Var.f36009x) {
                    return false;
                }
            } else if (b10 != fw0Var.f35997o0 && b10 != fw0Var.f36001r0 && b10 != fw0Var.f36003s0 && (fw0Var.N != 0 || b10 != fw0Var.f36004t0)) {
                return false;
            }
            return true;
        }
        return !fw0Var.I;
    }

    @Override
    public final int h() {
        return this.d.f36010x0;
    }

    @Override
    public final int j(int i10) {
        fw0 fw0Var = this.d;
        if (i10 != fw0Var.f35990h0 && i10 != fw0Var.m0 && i10 != fw0Var.f35999q0) {
            if (i10 == fw0Var.f35994l0) {
                return 1;
            }
            if (i10 != fw0Var.f35998p0 && i10 != fw0Var.f36008w0 && i10 != fw0Var.f35993k0) {
                if (i10 == fw0Var.f35997o0) {
                    return 3;
                }
                if (i10 == fw0Var.f35991i0) {
                    return 4;
                }
                if (i10 == fw0Var.f35992j0) {
                    return 7;
                }
                if (i10 != fw0Var.f36001r0 && i10 != fw0Var.f36003s0 && i10 != fw0Var.f36004t0 && i10 != fw0Var.f36005u0 && i10 != fw0Var.f36006v0) {
                    return 5;
                }
                return 6;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11;
        int i12;
        float f7;
        int i13;
        int i14;
        fw0 fw0Var = this.d;
        int i15 = fw0Var.N;
        boolean z10 = fw0Var.f35985d0;
        int i16 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z11 = true;
        if (i16 != 0) {
            boolean z12 = false;
            if (i16 != 6) {
                Context context = this.f35145c;
                if (i16 != 2) {
                    if (i16 == 3) {
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        r8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
                        Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                        Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                        int x02 = org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.N6, false);
                        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                        drawable.setColorFilter(new PorterDuffColorFilter(x02, mode));
                        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19729k7, false), mode));
                        org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(drawable, drawable2);
                        if (z10) {
                            i14 = R.string.TodoNewTask;
                        } else {
                            i14 = R.string.AddAnOption;
                        }
                        r8Var.n(LocaleController.getString(i14), crVar, false);
                        return;
                    }
                    return;
                }
                org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                e9Var.setFixedSize(0);
                e9Var.setBackground(org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19563b7));
                if (i10 == fw0Var.f35993k0) {
                    e9Var.setText(LocaleController.getString(R.string.AddAnExplanationInfo));
                    return;
                } else if (i10 == fw0Var.f36008w0) {
                    e9Var.setFixedSize(12);
                    e9Var.setText(null);
                    return;
                } else {
                    int i17 = fw0Var.f35995n - fw0Var.f36011y;
                    if (i17 <= 0) {
                        if (z10) {
                            i13 = R.string.TodoAddTaskInfoMax;
                        } else {
                            i13 = R.string.AddAnOptionInfoMax;
                        }
                        e9Var.setText(LocaleController.getString(i13));
                        return;
                    } else if (z10) {
                        e9Var.setText(LocaleController.formatPluralStringComma("TodoNewTaskInfo", i17));
                        return;
                    } else {
                        e9Var.setText(LocaleController.formatString("AddAnOptionInfo", R.string.AddAnOptionInfo, LocaleController.formatPluralString("Option", i17, new Object[0])));
                        return;
                    }
                }
            }
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            w8Var.setEnabled(!fw0Var.I);
            Switch checkBox = w8Var.getCheckBox();
            if (!fw0Var.I) {
                f7 = 1.0f;
            } else {
                f7 = 0.6f;
            }
            checkBox.setAlpha(f7);
            if (i10 == fw0Var.f36005u0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowAddingTasks), fw0Var.H, true);
                w8Var.e(null, true);
                return;
            } else if (i10 == fw0Var.f36006v0) {
                w8Var.f(LocaleController.getString(R.string.TodoAllowMarkingDone), fw0Var.J, false);
                w8Var.e(null, true);
                return;
            } else if (i10 == fw0Var.f36001r0) {
                String string = LocaleController.getString(R.string.PollAnonymous);
                boolean z13 = fw0Var.G;
                if (fw0Var.f36003s0 != -1 || fw0Var.f36004t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string, z13, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == fw0Var.f36003s0) {
                String string2 = LocaleController.getString(R.string.PollMultiple);
                boolean z14 = fw0Var.K;
                if (fw0Var.f36004t0 != -1) {
                    z12 = true;
                }
                w8Var.f(string2, z14, z12);
                w8Var.e(null, true);
                return;
            } else if (i10 == fw0Var.f36004t0) {
                w8Var.f(LocaleController.getString(R.string.PollQuiz), fw0Var.L, false);
                if (i15 != 0) {
                    z11 = false;
                }
                w8Var.e(null, z11);
                return;
            } else {
                return;
            }
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        if (i10 == fw0Var.f35990h0) {
            if (z10) {
                if (fw0Var.f36013z0 != null) {
                    i12 = R.string.TodoEditTitle;
                } else {
                    i12 = R.string.TodoTitle;
                }
            } else {
                i12 = R.string.PollQuestion2;
            }
            m4Var.setText(LocaleController.getString(i12));
        } else if (i10 == fw0Var.m0) {
            if (i15 == 1) {
                m4Var.setText(LocaleController.getString(R.string.QuizAnswers));
                return;
            }
            if (z10) {
                i11 = R.string.TodoItemsTitle;
            } else {
                i11 = R.string.AnswerOptions2;
            }
            m4Var.setText(LocaleController.getString(i11));
        } else if (i10 == fw0Var.f35999q0) {
            m4Var.setText(LocaleController.getString(R.string.Settings));
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        cw0 cw0Var;
        fw0 fw0Var = this.d;
        boolean z10 = fw0Var.f35984c0;
        if (i10 != 0) {
            Context context = this.f35145c;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    cw0 cw0Var2 = new cw0(this, context, z10 ? 1 : 0, new t60(fw0Var, 20));
                                    cw0Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                                    cw0Var2.b(new org.telegram.ui.Components.eo(6, this, cw0Var2));
                                    cw0Var2.setShowNextButton(true);
                                    EditTextBoldCursor textView = cw0Var2.getTextView();
                                    textView.setImeOptions(textView.getImeOptions() | 5);
                                    textView.setOnEditorActionListener(new ce(3, this, cw0Var2));
                                    textView.setOnKeyListener(new yg(cw0Var2, 2));
                                    cw0Var = cw0Var2;
                                } else {
                                    bw0 bw0Var = new bw0(this, context, z10 ? 1 : 0);
                                    bw0Var.c();
                                    bw0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                                    bw0Var.b(new org.telegram.ui.Components.eo(5, this, bw0Var));
                                    cw0Var = bw0Var;
                                }
                            } else {
                                View w8Var = new org.telegram.ui.Cells.w8(context);
                                w8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                                cw0Var = w8Var;
                            }
                        } else {
                            aw0 aw0Var = new aw0(this, context, z10 ? 1 : 0);
                            aw0Var.c();
                            aw0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                            aw0Var.b(new org.telegram.ui.Components.eo(4, this, aw0Var));
                            cw0Var = aw0Var;
                        }
                    } else {
                        View r8Var = new org.telegram.ui.Cells.r8(context);
                        r8Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
                        cw0Var = r8Var;
                    }
                } else {
                    cw0Var = new org.telegram.ui.Cells.e9(context);
                }
            } else {
                cw0Var = new org.telegram.ui.Cells.a7(context, (org.telegram.ui.Cells.c1) null);
            }
        } else {
            View m4Var = new org.telegram.ui.Cells.m4(this.f35145c, org.telegram.ui.ActionBar.g6.L6, 21, 15, false, null);
            m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19601d6, false));
            cw0Var = m4Var;
        }
        return com.google.android.gms.internal.play_billing.k3.l(cw0Var, cw0Var, -1, -2);
    }

    @Override
    public final void y(s4.b1 b1Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        fw0 fw0Var = this.d;
        boolean z11 = fw0Var.f35985d0;
        int i13 = b1Var.f44841f;
        View view = b1Var.f44838a;
        float f7 = 0.6f;
        CharSequence charSequence = "";
        float f10 = 1.0f;
        if (i13 == 4) {
            org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view;
            d6Var.setTag(1);
            org.telegram.ui.Cells.c6 c6Var = d6Var.d;
            CharSequence charSequence2 = fw0Var.E;
            if (charSequence2 != null) {
                charSequence = charSequence2;
            }
            if (z11) {
                i12 = R.string.TodoTitlePlaceholder;
            } else {
                i12 = R.string.QuestionHint;
            }
            d6Var.n(charSequence, LocaleController.getString(i12), false);
            d6Var.setTag(null);
            d6Var.setEnabled(!fw0Var.I);
            c6Var.setEnabled(true ^ fw0Var.I);
            int themedColor = fw0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
            if (!fw0Var.I) {
                f7 = 1.0f;
            }
            c6Var.setTextColor(org.telegram.ui.ActionBar.g6.m1(f7, themedColor));
            fw0.c0(fw0Var, view, b1Var.b());
        } else if (i13 == 5) {
            int b10 = b1Var.b();
            org.telegram.ui.Cells.d6 d6Var2 = (org.telegram.ui.Cells.d6) view;
            d6Var2.setTag(1);
            org.telegram.ui.Cells.c6 c6Var2 = d6Var2.d;
            int i14 = b10 - fw0Var.f35996n0;
            if (fw0Var.I && i14 < fw0Var.f36009x) {
                z10 = false;
            } else {
                z10 = true;
            }
            c6Var2.setEnabled(z10);
            int themedColor2 = fw0Var.getThemedColor(org.telegram.ui.ActionBar.g6.G6);
            if (z10) {
                f7 = 1.0f;
            }
            c6Var2.setTextColor(org.telegram.ui.ActionBar.g6.m1(f7, themedColor2));
            CharSequence charSequence3 = fw0Var.v[i14];
            if (z11) {
                i10 = R.string.TodoTaskPlaceholder;
            } else {
                i10 = R.string.OptionHint;
            }
            d6Var2.n(charSequence3, LocaleController.getString(i10), true);
            d6Var2.setTag(null);
            ImageView imageView = d6Var2.f20767f;
            if (imageView != null) {
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                imageView.setVisibility(i11);
            }
            ImageView imageView2 = d6Var2.h;
            if (imageView2 != null) {
                if (!z10) {
                    f10 = 0.45f;
                }
                imageView2.setAlpha(f10);
            }
            if (!fw0Var.f35988f0 && fw0Var.f35989g0 == b10) {
                EditTextBoldCursor textView = d6Var2.getTextView();
                textView.requestFocus();
                AndroidUtilities.showKeyboard(textView);
                fw0Var.f35988f0 = false;
                fw0Var.f35989g0 = -1;
            }
            fw0.c0(fw0Var, view, b10);
        } else if (i13 == 7) {
            org.telegram.ui.Cells.d6 d6Var3 = (org.telegram.ui.Cells.d6) view;
            d6Var3.setTag(1);
            CharSequence charSequence4 = fw0Var.F;
            if (charSequence4 != null) {
                charSequence = charSequence4;
            }
            d6Var3.n(charSequence, LocaleController.getString(R.string.AddAnExplanation), false);
            d6Var3.setTag(null);
            fw0.c0(fw0Var, view, b1Var.b());
        }
    }

    @Override
    public final void z(s4.b1 b1Var) {
        int i10 = b1Var.f44841f;
        if (i10 == 4 || i10 == 5) {
            EditTextBoldCursor textView = ((org.telegram.ui.Cells.d6) b1Var.f44838a).getTextView();
            if (textView.isFocused()) {
                fw0 fw0Var = this.d;
                if (fw0Var.f35984c0) {
                    org.telegram.ui.Components.lz0 lz0Var = fw0Var.Q;
                    if (lz0Var != null) {
                        lz0Var.f();
                    }
                    fw0Var.k0(true);
                }
                fw0Var.f35982b0 = null;
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
            }
        }
    }
}

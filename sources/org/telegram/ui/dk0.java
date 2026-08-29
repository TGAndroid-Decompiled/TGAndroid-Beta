package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;
public final class dk0 extends org.telegram.ui.Components.il0 {
    public final gk0 f37556c;

    public dk0(gk0 gk0Var) {
        this.f37556c = gk0Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f37556c.f38611n;
    }

    @Override
    public final long i(int i10) {
        ek0 ek0Var;
        gk0 gk0Var = this.f37556c;
        int i11 = gk0Var.A;
        if (i10 >= i11 && i10 < gk0Var.B) {
            ek0Var = (ek0) gk0Var.f38607b.get(i10 - i11);
        } else {
            int i12 = gk0Var.f38612r;
            if (i10 >= i12 && i10 < gk0Var.f38613s) {
                ek0Var = (ek0) gk0Var.f38606a.get(i10 - i12);
            } else {
                ek0Var = null;
            }
        }
        if (ek0Var != null) {
            return ek0Var.f37855c;
        }
        gk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == gk0Var.f38616y) {
            return 2L;
        }
        if (i10 == gk0Var.v) {
            return 3L;
        }
        if (i10 == gk0Var.f38614w) {
            return 4L;
        }
        if (i10 == gk0Var.f38615x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        gk0 gk0Var = this.f37556c;
        if (i10 >= gk0Var.A && i10 < gk0Var.B) {
            return 0;
        }
        gk0Var.getClass();
        if (i10 != 0 && i10 != gk0Var.f38616y) {
            if (i10 == gk0Var.v) {
                return 2;
            }
            if (i10 != gk0Var.f38614w && i10 != gk0Var.f38615x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        ek0 ek0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        gk0 gk0Var = this.f37556c;
        org.telegram.ui.ActionBar.c6 c6Var = gk0Var.h;
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    Drawable drawable = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.N6, c6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23190k7, c6Var), mode));
                    org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(drawable, drawable2);
                    e2Var.f24271a.l(LocaleController.getString(R.string.UploadSound), false);
                    e2Var.f24272b.setImageDrawable(jqVar);
                    e2Var.f24273c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
            if (i10 == 0) {
                k4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == gk0Var.f38616y) {
                k4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        fk0 fk0Var = (fk0) view;
        int i12 = gk0Var.A;
        if (i10 >= i12 && i10 < gk0Var.B) {
            ek0Var = (ek0) gk0Var.f38607b.get(i10 - i12);
        } else {
            ek0Var = null;
        }
        int i13 = gk0Var.f38612r;
        if (i10 >= i13 && i10 < gk0Var.f38613s) {
            ek0Var = (ek0) gk0Var.f38606a.get(i10 - i13);
        }
        if (ek0Var != null) {
            if (fk0Var.f38206e == ek0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ek0Var == gk0Var.D) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (gk0Var.F.get(ek0Var.f37855c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            fk0Var.f38206e = ek0Var;
            fk0Var.f38203a.setText(ek0Var.f37857f);
            if (i10 != gk0Var.B - 1) {
                z13 = true;
            }
            fk0Var.d = z13;
            fk0Var.f38204b.a(z11, z10);
            fk0Var.f38205c.a(z12, z10);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Cells.k4 k4Var;
        org.telegram.ui.ActionBar.c6 c6Var = this.f37556c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(context, c6Var);
                    k4Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
                    k4Var = k4Var2;
                } else {
                    k4Var = new org.telegram.ui.Cells.x6(context, (b) null);
                }
            } else {
                org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, 70, c6Var);
                e2Var.d = 61;
                e2Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var));
                k4Var = e2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f38204b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23118g7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23135h7, c6Var));
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i20 = i11 | 16;
            int i21 = 20;
            if (z10) {
                i12 = 0;
            } else {
                i12 = 20;
            }
            float f9 = i12;
            if (!z10) {
                i21 = 0;
            }
            frameLayout.addView(radioButton, i7.f6.d(22, 22.0f, i20, f9, 0.0f, i21, 0.0f));
            org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(context, 24, c6Var);
            frameLayout.f38205c = hpVar;
            int i22 = org.telegram.ui.ActionBar.g6.f23062d6;
            hpVar.b(-1, i22, org.telegram.ui.ActionBar.g6.f23190k7);
            hpVar.setDrawUnchecked(false);
            hpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i23 = i13 | 16;
            if (z11) {
                i14 = 0;
            } else {
                i14 = 18;
            }
            float f10 = i14;
            if (z11) {
                i15 = 18;
            } else {
                i15 = 0;
            }
            frameLayout.addView(hpVar, i7.f6.d(26, 26.0f, i23, f10, 0.0f, i15, 0.0f));
            hpVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f38203a = textView;
            b.m(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            if (LocaleController.isRTL) {
                i16 = 5;
            } else {
                i16 = 3;
            }
            textView.setGravity(i16 | 16);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i19 = 5;
            }
            int i24 = i19 | 16;
            if (z12) {
                i17 = 23;
            } else {
                i17 = 61;
            }
            float f11 = i17;
            if (!z12) {
                i18 = 23;
            }
            frameLayout.addView(textView, i7.f6.d(-2, -2.0f, i24, f11, 0.0f, i18, 0.0f));
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i22, c6Var));
            k4Var = frameLayout;
        }
        return th.m(k4Var, k4Var, -1, -2);
    }
}

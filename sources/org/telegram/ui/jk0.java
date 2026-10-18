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
public final class jk0 extends org.telegram.ui.Components.hm0 {
    public final mk0 f38239c;

    public jk0(mk0 mk0Var) {
        this.f38239c = mk0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f45961f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f38239c.f39235n;
    }

    @Override
    public final long i(int i10) {
        kk0 kk0Var;
        mk0 mk0Var = this.f38239c;
        int i11 = mk0Var.E;
        if (i10 >= i11 && i10 < mk0Var.F) {
            kk0Var = (kk0) mk0Var.f39232b.get(i10 - i11);
        } else {
            int i12 = mk0Var.f39236r;
            if (i10 >= i12 && i10 < mk0Var.f39237s) {
                kk0Var = (kk0) mk0Var.f39231a.get(i10 - i12);
            } else {
                kk0Var = null;
            }
        }
        if (kk0Var != null) {
            return kk0Var.f38580c;
        }
        mk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == mk0Var.f39240y) {
            return 2L;
        }
        if (i10 == mk0Var.v) {
            return 3L;
        }
        if (i10 == mk0Var.f39238w) {
            return 4L;
        }
        if (i10 == mk0Var.f39239x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        mk0 mk0Var = this.f38239c;
        if (i10 >= mk0Var.E && i10 < mk0Var.F) {
            return 0;
        }
        mk0Var.getClass();
        if (i10 != 0 && i10 != mk0Var.f39240y) {
            if (i10 == mk0Var.v) {
                return 2;
            }
            if (i10 != mk0Var.f39238w && i10 != mk0Var.f39239x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        kk0 kk0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        mk0 mk0Var = this.f38239c;
        org.telegram.ui.ActionBar.d6 d6Var = mk0Var.h;
        int i11 = b1Var.f45961f;
        View view = b1Var.f45958a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.g2 g2Var = (org.telegram.ui.Cells.g2) view;
                    Drawable drawable = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.N6, d6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21121k7, d6Var), mode));
                    org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(drawable, drawable2);
                    g2Var.f22287a.l(LocaleController.getString(R.string.UploadSound), false);
                    g2Var.f22288b.setImageDrawable(zqVar);
                    g2Var.f22289c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == 0) {
                l4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == mk0Var.f39240y) {
                l4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        lk0 lk0Var = (lk0) view;
        int i12 = mk0Var.E;
        if (i10 >= i12 && i10 < mk0Var.F) {
            kk0Var = (kk0) mk0Var.f39232b.get(i10 - i12);
        } else {
            kk0Var = null;
        }
        int i13 = mk0Var.f39236r;
        if (i10 >= i13 && i10 < mk0Var.f39237s) {
            kk0Var = (kk0) mk0Var.f39231a.get(i10 - i13);
        }
        if (kk0Var != null) {
            if (lk0Var.e == kk0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (kk0Var == mk0Var.H) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (mk0Var.J.get(kk0Var.f38580c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            lk0Var.e = kk0Var;
            lk0Var.f38883a.setText(kk0Var.f38581f);
            if (i10 != mk0Var.F - 1) {
                z13 = true;
            }
            lk0Var.d = z13;
            lk0Var.f38884b.a(z11, z10);
            lk0Var.f38885c.a(z12, z10);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Cells.l4 l4Var;
        org.telegram.ui.ActionBar.d6 d6Var = this.f38239c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, d6Var);
                    l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var));
                    l4Var = l4Var2;
                } else {
                    l4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c1) null);
                }
            } else {
                org.telegram.ui.Cells.g2 g2Var = new org.telegram.ui.Cells.g2(context, 70, d6Var);
                g2Var.d = 61;
                g2Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20993d6, d6Var));
                l4Var = g2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f38884b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21047g7, d6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21066h7, d6Var));
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
            float f7 = i12;
            if (!z10) {
                i21 = 0;
            }
            frameLayout.addView(radioButton, w7.z5.a(22.0f, f7, 0.0f, i21, 0.0f, 22, i20));
            org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(context, 24, d6Var);
            frameLayout.f38885c = xpVar;
            int i22 = org.telegram.ui.ActionBar.h6.f20993d6;
            xpVar.b(-1, i22, org.telegram.ui.ActionBar.h6.f21121k7);
            xpVar.setDrawUnchecked(false);
            xpVar.setDrawBackgroundAsArc(3);
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
            frameLayout.addView(xpVar, w7.z5.a(26.0f, f10, 0.0f, i15, 0.0f, 26, i23));
            xpVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f38883a = textView;
            org.telegram.messenger.kk.o(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 16.0f);
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
            frameLayout.addView(textView, w7.z5.a(-2.0f, f11, 0.0f, i18, 0.0f, -2, i24));
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i22, d6Var));
            l4Var = frameLayout;
        }
        return com.google.android.gms.internal.play_billing.k3.l(l4Var, l4Var, -1, -2);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
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
public final class jk0 extends org.telegram.ui.Components.km0 {
    public final mk0 f38584c;

    public jk0(mk0 mk0Var) {
        this.f38584c = mk0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        int i10 = b1Var.f46345f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f38584c.f39610n;
    }

    @Override
    public final long i(int i10) {
        kk0 kk0Var;
        mk0 mk0Var = this.f38584c;
        int i11 = mk0Var.E;
        if (i10 >= i11 && i10 < mk0Var.F) {
            kk0Var = (kk0) mk0Var.f39607b.get(i10 - i11);
        } else {
            int i12 = mk0Var.f39611r;
            if (i10 >= i12 && i10 < mk0Var.f39612s) {
                kk0Var = (kk0) mk0Var.f39606a.get(i10 - i12);
            } else {
                kk0Var = null;
            }
        }
        if (kk0Var != null) {
            return kk0Var.f38933c;
        }
        mk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == mk0Var.f39615y) {
            return 2L;
        }
        if (i10 == mk0Var.v) {
            return 3L;
        }
        if (i10 == mk0Var.f39613w) {
            return 4L;
        }
        if (i10 == mk0Var.f39614x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        mk0 mk0Var = this.f38584c;
        if (i10 >= mk0Var.E && i10 < mk0Var.F) {
            return 0;
        }
        mk0Var.getClass();
        if (i10 != 0 && i10 != mk0Var.f39615y) {
            if (i10 == mk0Var.v) {
                return 2;
            }
            if (i10 != mk0Var.f39613w && i10 != mk0Var.f39614x) {
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
        mk0 mk0Var = this.f38584c;
        org.telegram.ui.ActionBar.g6 g6Var = mk0Var.h;
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    Drawable drawable = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int i12 = org.telegram.ui.ActionBar.k6.N6;
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.r6.z(f2Var, drawable, i12, g6Var, mode);
                    org.telegram.ui.ActionBar.r6.z(f2Var, drawable2, org.telegram.ui.ActionBar.k6.f21312k7, g6Var, mode);
                    org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(drawable, drawable2);
                    f2Var.f22353a.l(LocaleController.getString(R.string.UploadSound), false);
                    f2Var.f22354b.setImageDrawable(wqVar);
                    f2Var.f22355c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == 0) {
                l4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == mk0Var.f39615y) {
                l4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        lk0 lk0Var = (lk0) view;
        int i13 = mk0Var.E;
        if (i10 >= i13 && i10 < mk0Var.F) {
            kk0Var = (kk0) mk0Var.f39607b.get(i10 - i13);
        } else {
            kk0Var = null;
        }
        int i14 = mk0Var.f39611r;
        if (i10 >= i14 && i10 < mk0Var.f39612s) {
            kk0Var = (kk0) mk0Var.f39606a.get(i10 - i14);
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
            if (mk0Var.J.get(kk0Var.f38933c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            lk0Var.e = kk0Var;
            lk0Var.f39309a.setText(kk0Var.f38934f);
            if (i10 != mk0Var.F - 1) {
                z13 = true;
            }
            lk0Var.d = z13;
            lk0Var.f39310b.a(z11, z10);
            lk0Var.f39311c.a(z12, z10);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f38584c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, g6Var);
                    org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, l4Var2, g6Var);
                    l4Var = l4Var2;
                } else {
                    l4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.b1) null);
                }
            } else {
                org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, g6Var);
                f2Var.d = 61;
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21184d6, f2Var, g6Var);
                l4Var = f2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f39310b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            org.telegram.ui.ActionBar.r6.Q(radioButton, org.telegram.ui.ActionBar.k6.f21238g7, org.telegram.ui.ActionBar.k6.f21257h7, g6Var);
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
            frameLayout.addView(radioButton, w7.z5.d(22, 22.0f, i20, f7, 0.0f, i21, 0.0f));
            org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(context, 24, g6Var);
            frameLayout.f39311c = vpVar;
            int i22 = org.telegram.ui.ActionBar.k6.f21184d6;
            vpVar.b(-1, i22, org.telegram.ui.ActionBar.k6.f21312k7);
            vpVar.setDrawUnchecked(false);
            vpVar.setDrawBackgroundAsArc(3);
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
            frameLayout.addView(vpVar, w7.z5.d(26, 26.0f, i23, f10, 0.0f, i15, 0.0f));
            vpVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f39309a = textView;
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
            org.telegram.messenger.tl.u(textView, 1, 16.0f, 1, 1);
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
            frameLayout.addView(textView, w7.z5.d(-2, -2.0f, i24, f11, 0.0f, i18, 0.0f));
            org.telegram.ui.ActionBar.r6.i(i22, frameLayout, g6Var);
            l4Var = frameLayout;
        }
        return com.google.android.gms.internal.play_billing.k3.l(l4Var, l4Var, -1, -2);
    }
}

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
public final class pk0 extends org.telegram.ui.Components.vl0 {
    public final sk0 f36571c;

    public pk0(sk0 sk0Var) {
        this.f36571c = sk0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42963f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f36571c.f37813n;
    }

    @Override
    public final long i(int i10) {
        qk0 qk0Var;
        sk0 sk0Var = this.f36571c;
        int i11 = sk0Var.E;
        if (i10 >= i11 && i10 < sk0Var.F) {
            qk0Var = (qk0) sk0Var.f37810b.get(i10 - i11);
        } else {
            int i12 = sk0Var.f37814r;
            if (i10 >= i12 && i10 < sk0Var.f37815s) {
                qk0Var = (qk0) sk0Var.f37809a.get(i10 - i12);
            } else {
                qk0Var = null;
            }
        }
        if (qk0Var != null) {
            return qk0Var.f36937c;
        }
        sk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == sk0Var.f37818y) {
            return 2L;
        }
        if (i10 == sk0Var.v) {
            return 3L;
        }
        if (i10 == sk0Var.f37816w) {
            return 4L;
        }
        if (i10 == sk0Var.f37817x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        sk0 sk0Var = this.f36571c;
        if (i10 >= sk0Var.E && i10 < sk0Var.F) {
            return 0;
        }
        sk0Var.getClass();
        if (i10 != 0 && i10 != sk0Var.f37818y) {
            if (i10 == sk0Var.v) {
                return 2;
            }
            if (i10 != sk0Var.f37816w && i10 != sk0Var.f37817x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        qk0 qk0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        sk0 sk0Var = this.f36571c;
        org.telegram.ui.ActionBar.d6 d6Var = sk0Var.h;
        int i11 = c1Var.f42963f;
        View view = c1Var.f42960a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.g2 g2Var = (org.telegram.ui.Cells.g2) view;
                    Drawable drawable = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = g2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.N6, d6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19187k7, d6Var), mode));
                    org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(drawable, drawable2);
                    g2Var.f20324a.l(LocaleController.getString(R.string.UploadSound), false);
                    g2Var.f20325b.setImageDrawable(qqVar);
                    g2Var.f20326c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == sk0Var.f37818y) {
                m4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        rk0 rk0Var = (rk0) view;
        int i12 = sk0Var.E;
        if (i10 >= i12 && i10 < sk0Var.F) {
            qk0Var = (qk0) sk0Var.f37810b.get(i10 - i12);
        } else {
            qk0Var = null;
        }
        int i13 = sk0Var.f37814r;
        if (i10 >= i13 && i10 < sk0Var.f37815s) {
            qk0Var = (qk0) sk0Var.f37809a.get(i10 - i13);
        }
        if (qk0Var != null) {
            if (rk0Var.e == qk0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (qk0Var == sk0Var.H) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (sk0Var.J.get(qk0Var.f36937c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            rk0Var.e = qk0Var;
            rk0Var.f37371a.setText(qk0Var.f36938f);
            if (i10 != sk0Var.F - 1) {
                z13 = true;
            }
            rk0Var.d = z13;
            rk0Var.f37372b.a(z11, z10);
            rk0Var.f37373c.a(z12, z10);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Cells.m4 m4Var;
        org.telegram.ui.ActionBar.d6 d6Var = this.f36571c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, d6Var);
                    m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var));
                    m4Var = m4Var2;
                } else {
                    m4Var = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                }
            } else {
                org.telegram.ui.Cells.g2 g2Var = new org.telegram.ui.Cells.g2(context, 70, d6Var);
                g2Var.d = 61;
                g2Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, d6Var));
                m4Var = g2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f37372b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19114g7, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19131h7, d6Var));
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
            frameLayout.addView(radioButton, w7.y5.d(22, 22.0f, i20, f7, 0.0f, i21, 0.0f));
            org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(context, 24, d6Var);
            frameLayout.f37373c = opVar;
            int i22 = org.telegram.ui.ActionBar.h6.f19059d6;
            opVar.b(-1, i22, org.telegram.ui.ActionBar.h6.f19187k7);
            opVar.setDrawUnchecked(false);
            opVar.setDrawBackgroundAsArc(3);
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
            frameLayout.addView(opVar, w7.y5.d(26, 26.0f, i23, f10, 0.0f, i15, 0.0f));
            opVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f37371a = textView;
            org.telegram.messenger.ok.n(org.telegram.ui.ActionBar.h6.G6, d6Var, textView, 1, 16.0f);
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
            frameLayout.addView(textView, w7.y5.d(-2, -2.0f, i24, f11, 0.0f, i18, 0.0f));
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(i22, d6Var));
            m4Var = frameLayout;
        }
        return com.google.android.gms.internal.vision.e2.k(m4Var, m4Var, -1, -2);
    }
}

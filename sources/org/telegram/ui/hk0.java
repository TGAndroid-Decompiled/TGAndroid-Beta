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
public final class hk0 extends org.telegram.ui.Components.vk0 {
    public final kk0 f38826c;

    public hk0(kk0 kk0Var) {
        this.f38826c = kk0Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 0 && i9 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f38826c.f39859n;
    }

    @Override
    public final long i(int i9) {
        ik0 ik0Var;
        kk0 kk0Var = this.f38826c;
        int i10 = kk0Var.A;
        if (i9 >= i10 && i9 < kk0Var.B) {
            ik0Var = (ik0) kk0Var.f39855b.get(i9 - i10);
        } else {
            int i11 = kk0Var.f39860r;
            if (i9 >= i11 && i9 < kk0Var.f39861s) {
                ik0Var = (ik0) kk0Var.f39854a.get(i9 - i11);
            } else {
                ik0Var = null;
            }
        }
        if (ik0Var != null) {
            return ik0Var.f39201c;
        }
        kk0Var.getClass();
        if (i9 == 0) {
            return 1L;
        }
        if (i9 == kk0Var.f39864y) {
            return 2L;
        }
        if (i9 == kk0Var.v) {
            return 3L;
        }
        if (i9 == kk0Var.f39862w) {
            return 4L;
        }
        if (i9 == kk0Var.f39863x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i9) {
        kk0 kk0Var = this.f38826c;
        if (i9 >= kk0Var.A && i9 < kk0Var.B) {
            return 0;
        }
        kk0Var.getClass();
        if (i9 != 0 && i9 != kk0Var.f39864y) {
            if (i9 == kk0Var.v) {
                return 2;
            }
            if (i9 != kk0Var.f39862w && i9 != kk0Var.f39863x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        ik0 ik0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        kk0 kk0Var = this.f38826c;
        org.telegram.ui.ActionBar.b6 b6Var = kk0Var.h;
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z13 = false;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    Drawable drawable = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.N6, b6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23128k7, b6Var), mode));
                    org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(drawable, drawable2);
                    f2Var.f24327a.l(LocaleController.getString(R.string.UploadSound), false);
                    f2Var.f24328b.setImageDrawable(fqVar);
                    f2Var.f24329c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i9 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i9 == kk0Var.f39864y) {
                m4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        jk0 jk0Var = (jk0) view;
        int i11 = kk0Var.A;
        if (i9 >= i11 && i9 < kk0Var.B) {
            ik0Var = (ik0) kk0Var.f39855b.get(i9 - i11);
        } else {
            ik0Var = null;
        }
        int i12 = kk0Var.f39860r;
        if (i9 >= i12 && i9 < kk0Var.f39861s) {
            ik0Var = (ik0) kk0Var.f39854a.get(i9 - i12);
        }
        if (ik0Var != null) {
            if (jk0Var.f39522e == ik0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ik0Var == kk0Var.D) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (kk0Var.F.get(ik0Var.f39201c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            jk0Var.f39522e = ik0Var;
            jk0Var.f39519a.setText(ik0Var.f39203f);
            if (i9 != kk0Var.B - 1) {
                z13 = true;
            }
            jk0Var.d = z13;
            jk0Var.f39520b.a(z11, z10);
            jk0Var.f39521c.a(z12, z10);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        org.telegram.ui.Cells.m4 m4Var;
        org.telegram.ui.ActionBar.b6 b6Var = this.f38826c.h;
        Context context = viewGroup.getContext();
        int i17 = 61;
        int i18 = 3;
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, b6Var);
                    m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
                    m4Var = m4Var2;
                } else {
                    m4Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.j2) null);
                }
            } else {
                org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, b6Var);
                f2Var.d = 61;
                f2Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var));
                m4Var = f2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f39520b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23056g7, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23074h7, b6Var));
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            int i19 = i10 | 16;
            int i20 = 20;
            if (z10) {
                i11 = 0;
            } else {
                i11 = 20;
            }
            float f10 = i11;
            if (!z10) {
                i20 = 0;
            }
            frameLayout.addView(radioButton, g7.e6.d(22, 22.0f, i19, f10, 0.0f, i20, 0.0f));
            org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(context, 24, b6Var);
            frameLayout.f39521c = dpVar;
            int i21 = org.telegram.ui.ActionBar.f6.f23001d6;
            dpVar.b(-1, i21, org.telegram.ui.ActionBar.f6.f23128k7);
            dpVar.setDrawUnchecked(false);
            dpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i22 = i12 | 16;
            if (z11) {
                i13 = 0;
            } else {
                i13 = 18;
            }
            float f11 = i13;
            if (z11) {
                i14 = 18;
            } else {
                i14 = 0;
            }
            frameLayout.addView(dpVar, g7.e6.d(26, 26.0f, i22, f11, 0.0f, i14, 0.0f));
            dpVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f39519a = textView;
            org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            if (LocaleController.isRTL) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            textView.setGravity(i15 | 16);
            boolean z12 = LocaleController.isRTL;
            if (z12) {
                i18 = 5;
            }
            int i23 = i18 | 16;
            if (z12) {
                i16 = 23;
            } else {
                i16 = 61;
            }
            float f12 = i16;
            if (!z12) {
                i17 = 23;
            }
            frameLayout.addView(textView, g7.e6.d(-2, -2.0f, i23, f12, 0.0f, i17, 0.0f));
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i21, b6Var));
            m4Var = frameLayout;
        }
        return j3.r0.s(m4Var, m4Var, -1, -2);
    }
}

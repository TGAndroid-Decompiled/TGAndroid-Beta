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
public final class lk0 extends org.telegram.ui.Components.rl0 {
    public final ok0 f36098c;

    public lk0(ok0 ok0Var) {
        this.f36098c = ok0Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5788f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f36098c.f36928n;
    }

    @Override
    public final long i(int i10) {
        mk0 mk0Var;
        ok0 ok0Var = this.f36098c;
        int i11 = ok0Var.B;
        if (i10 >= i11 && i10 < ok0Var.C) {
            mk0Var = (mk0) ok0Var.f36925b.get(i10 - i11);
        } else {
            int i12 = ok0Var.f36929r;
            if (i10 >= i12 && i10 < ok0Var.f36930s) {
                mk0Var = (mk0) ok0Var.f36924a.get(i10 - i12);
            } else {
                mk0Var = null;
            }
        }
        if (mk0Var != null) {
            return mk0Var.f36341c;
        }
        ok0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == ok0Var.f36933y) {
            return 2L;
        }
        if (i10 == ok0Var.v) {
            return 3L;
        }
        if (i10 == ok0Var.f36931w) {
            return 4L;
        }
        if (i10 == ok0Var.f36932x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        ok0 ok0Var = this.f36098c;
        if (i10 >= ok0Var.B && i10 < ok0Var.C) {
            return 0;
        }
        ok0Var.getClass();
        if (i10 != 0 && i10 != ok0Var.f36933y) {
            if (i10 == ok0Var.v) {
                return 2;
            }
            if (i10 != ok0Var.f36931w && i10 != ok0Var.f36932x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        mk0 mk0Var;
        boolean z4;
        boolean z10;
        boolean z11;
        ok0 ok0Var = this.f36098c;
        org.telegram.ui.ActionBar.f6 f6Var = ok0Var.h;
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        boolean z12 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) view;
                    Drawable drawable = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = f2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20032k7, f6Var), mode));
                    org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(drawable, drawable2);
                    f2Var.f21046a.l(LocaleController.getString(R.string.UploadSound), false);
                    f2Var.f21047b.setImageDrawable(nqVar);
                    f2Var.f21048c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            if (i10 == 0) {
                m4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == ok0Var.f36933y) {
                m4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        nk0 nk0Var = (nk0) view;
        int i12 = ok0Var.B;
        if (i10 >= i12 && i10 < ok0Var.C) {
            mk0Var = (mk0) ok0Var.f36925b.get(i10 - i12);
        } else {
            mk0Var = null;
        }
        int i13 = ok0Var.f36929r;
        if (i10 >= i13 && i10 < ok0Var.f36930s) {
            mk0Var = (mk0) ok0Var.f36924a.get(i10 - i13);
        }
        if (mk0Var != null) {
            if (nk0Var.e == mk0Var) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (mk0Var == ok0Var.E) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (ok0Var.G.get(mk0Var.f36341c) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            nk0Var.e = mk0Var;
            nk0Var.f36680a.setText(mk0Var.f36342f);
            if (i10 != ok0Var.C - 1) {
                z12 = true;
            }
            nk0Var.d = z12;
            nk0Var.f36681b.a(z10, z4);
            nk0Var.f36682c.a(z11, z4);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Cells.m4 m4Var;
        org.telegram.ui.ActionBar.f6 f6Var = this.f36098c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, f6Var);
                    m4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
                    m4Var = m4Var2;
                } else {
                    m4Var = new org.telegram.ui.Cells.z6(context, (b) null);
                }
            } else {
                org.telegram.ui.Cells.f2 f2Var = new org.telegram.ui.Cells.f2(context, 70, f6Var);
                f2Var.d = 61;
                f2Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var));
                m4Var = f2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f36681b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19961g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19979h7, f6Var));
            boolean z4 = LocaleController.isRTL;
            if (z4) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            int i20 = i11 | 16;
            int i21 = 20;
            if (z4) {
                i12 = 0;
            } else {
                i12 = 20;
            }
            float f10 = i12;
            if (!z4) {
                i21 = 0;
            }
            frameLayout.addView(radioButton, k7.b6.d(22, 22.0f, i20, f10, 0.0f, i21, 0.0f));
            org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(context, 24, f6Var);
            frameLayout.f36682c = lpVar;
            int i22 = org.telegram.ui.ActionBar.j6.f19906d6;
            lpVar.b(-1, i22, org.telegram.ui.ActionBar.j6.f20032k7);
            lpVar.setDrawUnchecked(false);
            lpVar.setDrawBackgroundAsArc(3);
            boolean z10 = LocaleController.isRTL;
            if (z10) {
                i13 = 5;
            } else {
                i13 = 3;
            }
            int i23 = i13 | 16;
            if (z10) {
                i14 = 0;
            } else {
                i14 = 18;
            }
            float f11 = i14;
            if (z10) {
                i15 = 18;
            } else {
                i15 = 0;
            }
            frameLayout.addView(lpVar, k7.b6.d(26, 26.0f, i23, f11, 0.0f, i15, 0.0f));
            lpVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f36680a = textView;
            b.l(org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
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
            boolean z11 = LocaleController.isRTL;
            if (z11) {
                i19 = 5;
            }
            int i24 = i19 | 16;
            if (z11) {
                i17 = 23;
            } else {
                i17 = 61;
            }
            float f12 = i17;
            if (!z11) {
                i18 = 23;
            }
            frameLayout.addView(textView, k7.b6.d(-2, -2.0f, i24, f12, 0.0f, i18, 0.0f));
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(i22, f6Var));
            m4Var = frameLayout;
        }
        return yh.o(m4Var, m4Var, -1, -2);
    }
}

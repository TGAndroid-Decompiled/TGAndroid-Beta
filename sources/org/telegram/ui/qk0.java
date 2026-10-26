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
public final class qk0 extends org.telegram.ui.Components.lm0 {
    public final tk0 f42864c;

    public qk0(tk0 tk0Var) {
        this.f42864c = tk0Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f42864c.h;
    }

    @Override
    public final long i(int i10) {
        rk0 rk0Var;
        tk0 tk0Var = this.f42864c;
        int i11 = tk0Var.f43865y;
        if (i10 >= i11 && i10 < tk0Var.E) {
            rk0Var = (rk0) tk0Var.f43857b.get(i10 - i11);
        } else {
            int i12 = tk0Var.f43860n;
            if (i10 >= i12 && i10 < tk0Var.f43861r) {
                rk0Var = (rk0) tk0Var.f43856a.get(i10 - i12);
            } else {
                rk0Var = null;
            }
        }
        if (rk0Var != null) {
            return rk0Var.f43179c;
        }
        tk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == tk0Var.f43864x) {
            return 2L;
        }
        if (i10 == tk0Var.f43862s) {
            return 3L;
        }
        if (i10 == tk0Var.v) {
            return 4L;
        }
        if (i10 == tk0Var.f43863w) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        tk0 tk0Var = this.f42864c;
        if (i10 >= tk0Var.f43865y && i10 < tk0Var.E) {
            return 0;
        }
        tk0Var.getClass();
        if (i10 != 0 && i10 != tk0Var.f43864x) {
            if (i10 == tk0Var.f43862s) {
                return 2;
            }
            if (i10 != tk0Var.v && i10 != tk0Var.f43863w) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        rk0 rk0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        tk0 tk0Var = this.f42864c;
        org.telegram.ui.ActionBar.u6 u6Var = tk0Var.f43859f;
        int i11 = e1Var.f47741f;
        View view = e1Var.f47738a;
        boolean z13 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    Drawable drawable = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int i12 = org.telegram.ui.ActionBar.y6.N6;
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    org.telegram.ui.ActionBar.f7.y(e2Var, drawable, i12, u6Var, mode);
                    org.telegram.ui.ActionBar.f7.y(e2Var, drawable2, org.telegram.ui.ActionBar.y6.f23485k7, u6Var, mode);
                    org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(drawable, drawable2);
                    e2Var.f24023a.l(LocaleController.getString(R.string.UploadSound), false);
                    e2Var.f24024b.setImageDrawable(arVar);
                    e2Var.f24025c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
            if (i10 == 0) {
                q4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == tk0Var.f43864x) {
                q4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        sk0 sk0Var = (sk0) view;
        int i13 = tk0Var.f43865y;
        if (i10 >= i13 && i10 < tk0Var.E) {
            rk0Var = (rk0) tk0Var.f43857b.get(i10 - i13);
        } else {
            rk0Var = null;
        }
        int i14 = tk0Var.f43860n;
        if (i10 >= i14 && i10 < tk0Var.f43861r) {
            rk0Var = (rk0) tk0Var.f43856a.get(i10 - i14);
        }
        if (rk0Var != null) {
            if (sk0Var.e == rk0Var) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (rk0Var == tk0Var.G) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (tk0Var.I.get(rk0Var.f43179c) != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            sk0Var.e = rk0Var;
            sk0Var.f43529a.setText(rk0Var.f43180f);
            if (i10 != tk0Var.E - 1) {
                z13 = true;
            }
            sk0Var.d = z13;
            sk0Var.f43530b.a(z11, z10);
            sk0Var.f43531c.a(z12, z10);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        org.telegram.ui.Cells.q4 q4Var;
        org.telegram.ui.ActionBar.u6 u6Var = this.f42864c.f43859f;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.q4 q4Var2 = new org.telegram.ui.Cells.q4(context, u6Var);
                    org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, q4Var2, u6Var);
                    q4Var = q4Var2;
                } else {
                    q4Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                }
            } else {
                org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, 70, u6Var);
                e2Var.d = 61;
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23356d6, e2Var, u6Var);
                q4Var = e2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f43530b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            org.telegram.ui.ActionBar.f7.P(radioButton, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23429h7, u6Var);
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
            frameLayout.addView(radioButton, org.telegram.ui.Components.gb1.h(22, 22.0f, i20, f7, 0.0f, i21, 0.0f));
            org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(context, 24, u6Var);
            frameLayout.f43531c = zpVar;
            int i22 = org.telegram.ui.ActionBar.y6.f23356d6;
            zpVar.b(-1, i22, org.telegram.ui.ActionBar.y6.f23485k7);
            zpVar.setDrawUnchecked(false);
            zpVar.setDrawBackgroundAsArc(3);
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
            frameLayout.addView(zpVar, org.telegram.ui.Components.gb1.h(26, 26.0f, i23, f10, 0.0f, i15, 0.0f));
            zpVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f43529a = textView;
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
            org.telegram.messenger.vh.r(textView, 1, 16.0f, 1, 1);
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
            frameLayout.addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, i24, f11, 0.0f, i18, 0.0f));
            org.telegram.ui.ActionBar.f7.i(i22, frameLayout, u6Var);
            q4Var = frameLayout;
        }
        return ic.a.n(q4Var, q4Var, -1, -2);
    }
}

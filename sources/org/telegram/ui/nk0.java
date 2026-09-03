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
public final class nk0 extends org.telegram.ui.Components.ql0 {
    public final qk0 f36529c;

    public nk0(qk0 qk0Var) {
        this.f36529c = qk0Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f5777f;
        if (i10 != 0 && i10 != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int h() {
        return this.f36529c.f37434n;
    }

    @Override
    public final long i(int i10) {
        ok0 ok0Var;
        qk0 qk0Var = this.f36529c;
        int i11 = qk0Var.B;
        if (i10 >= i11 && i10 < qk0Var.C) {
            ok0Var = (ok0) qk0Var.f37431b.get(i10 - i11);
        } else {
            int i12 = qk0Var.f37435r;
            if (i10 >= i12 && i10 < qk0Var.f37436s) {
                ok0Var = (ok0) qk0Var.f37430a.get(i10 - i12);
            } else {
                ok0Var = null;
            }
        }
        if (ok0Var != null) {
            return ok0Var.f36833c;
        }
        qk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == qk0Var.f37439y) {
            return 2L;
        }
        if (i10 == qk0Var.v) {
            return 3L;
        }
        if (i10 == qk0Var.f37437w) {
            return 4L;
        }
        if (i10 == qk0Var.f37438x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        qk0 qk0Var = this.f36529c;
        if (i10 >= qk0Var.B && i10 < qk0Var.C) {
            return 0;
        }
        qk0Var.getClass();
        if (i10 != 0 && i10 != qk0Var.f37439y) {
            if (i10 == qk0Var.v) {
                return 2;
            }
            if (i10 != qk0Var.f37437w && i10 != qk0Var.f37438x) {
                return 0;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        ok0 ok0Var;
        boolean z4;
        boolean z10;
        boolean z11;
        qk0 qk0Var = this.f36529c;
        org.telegram.ui.ActionBar.f6 f6Var = qk0Var.h;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z12 = false;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
                    Drawable drawable = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
                    Drawable drawable2 = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
                    int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.N6, f6Var);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawable.setColorFilter(new PorterDuffColorFilter(v02, mode));
                    drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20007k7, f6Var), mode));
                    org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(drawable, drawable2);
                    e2Var.f20982a.l(LocaleController.getString(R.string.UploadSound), false);
                    e2Var.f20983b.setImageDrawable(mqVar);
                    e2Var.f20984c = false;
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
            if (i10 == 0) {
                l4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else if (i10 == qk0Var.f37439y) {
                l4Var.setText(LocaleController.getString(R.string.SystemTones));
                return;
            } else {
                return;
            }
        }
        pk0 pk0Var = (pk0) view;
        int i12 = qk0Var.B;
        if (i10 >= i12 && i10 < qk0Var.C) {
            ok0Var = (ok0) qk0Var.f37431b.get(i10 - i12);
        } else {
            ok0Var = null;
        }
        int i13 = qk0Var.f37435r;
        if (i10 >= i13 && i10 < qk0Var.f37436s) {
            ok0Var = (ok0) qk0Var.f37430a.get(i10 - i13);
        }
        if (ok0Var != null) {
            if (pk0Var.e == ok0Var) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ok0Var == qk0Var.E) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (qk0Var.G.get(ok0Var.f36833c) != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            pk0Var.e = ok0Var;
            pk0Var.f37178a.setText(ok0Var.f36834f);
            if (i10 != qk0Var.C - 1) {
                z12 = true;
            }
            pk0Var.d = z12;
            pk0Var.f37179b.a(z10, z4);
            pk0Var.f37180c.a(z11, z4);
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
        org.telegram.ui.Cells.l4 l4Var;
        org.telegram.ui.ActionBar.f6 f6Var = this.f36529c.h;
        Context context = viewGroup.getContext();
        int i18 = 61;
        int i19 = 3;
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, f6Var);
                    l4Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var));
                    l4Var = l4Var2;
                } else {
                    l4Var = new org.telegram.ui.Cells.y6(context, (b) null);
                }
            } else {
                org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, 70, f6Var);
                e2Var.d = 61;
                e2Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, f6Var));
                l4Var = e2Var;
            }
        } else {
            ?? frameLayout = new FrameLayout(context);
            RadioButton radioButton = new RadioButton(context);
            frameLayout.f37179b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19936g7, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19954h7, f6Var));
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
            org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(context, 24, f6Var);
            frameLayout.f37180c = kpVar;
            int i22 = org.telegram.ui.ActionBar.j6.f19881d6;
            kpVar.b(-1, i22, org.telegram.ui.ActionBar.j6.f20007k7);
            kpVar.setDrawUnchecked(false);
            kpVar.setDrawBackgroundAsArc(3);
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
            frameLayout.addView(kpVar, k7.b6.d(26, 26.0f, i23, f11, 0.0f, i15, 0.0f));
            kpVar.a(true, false);
            TextView textView = new TextView(context);
            frameLayout.f37178a = textView;
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
            l4Var = frameLayout;
        }
        return ai.n(l4Var, l4Var, -1, -2);
    }
}

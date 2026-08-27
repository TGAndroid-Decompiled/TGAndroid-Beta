package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.RadioButton;

public final class hk0 extends org.telegram.ui.Components.yk0 {

    public final kk0 f38852c;

    public hk0(kk0 kk0Var) {
        this.f38852c = kk0Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        int i10 = o1Var.f5793f;
        return i10 == 0 || i10 == 2;
    }

    @Override
    public final int h() {
        return this.f38852c.f39796n;
    }

    @Override
    public final long i(int i10) {
        ik0 ik0Var;
        kk0 kk0Var = this.f38852c;
        int i11 = kk0Var.A;
        if (i10 < i11 || i10 >= kk0Var.B) {
            int i12 = kk0Var.f39797r;
            ik0Var = (i10 < i12 || i10 >= kk0Var.f39798s) ? null : (ik0) kk0Var.f39791a.get(i10 - i12);
        } else {
            ik0Var = (ik0) kk0Var.f39792b.get(i10 - i11);
        }
        if (ik0Var != null) {
            return ik0Var.f39123c;
        }
        kk0Var.getClass();
        if (i10 == 0) {
            return 1L;
        }
        if (i10 == kk0Var.f39801y) {
            return 2L;
        }
        if (i10 == kk0Var.v) {
            return 3L;
        }
        if (i10 == kk0Var.f39799w) {
            return 4L;
        }
        if (i10 == kk0Var.f39800x) {
            return 5L;
        }
        throw new RuntimeException();
    }

    @Override
    public final int j(int i10) {
        kk0 kk0Var = this.f38852c;
        if (i10 >= kk0Var.A && i10 < kk0Var.B) {
            return 0;
        }
        kk0Var.getClass();
        if (i10 == 0 || i10 == kk0Var.f39801y) {
            return 1;
        }
        if (i10 == kk0Var.v) {
            return 2;
        }
        return (i10 == kk0Var.f39799w || i10 == kk0Var.f39800x) ? 3 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        kk0 kk0Var = this.f38852c;
        org.telegram.ui.ActionBar.c6 c6Var = kk0Var.h;
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        if (i11 == 0) {
            jk0 jk0Var = (jk0) view;
            int i12 = kk0Var.A;
            ik0 ik0Var = (i10 < i12 || i10 >= kk0Var.B) ? null : (ik0) kk0Var.f39792b.get(i10 - i12);
            int i13 = kk0Var.f39797r;
            if (i10 >= i13 && i10 < kk0Var.f39798s) {
                ik0Var = (ik0) kk0Var.f39791a.get(i10 - i13);
            }
            if (ik0Var != null) {
                boolean z10 = jk0Var.f39386e == ik0Var;
                boolean z11 = ik0Var == kk0Var.D;
                boolean z12 = kk0Var.F.get(ik0Var.f39123c) != null;
                jk0Var.f39386e = ik0Var;
                jk0Var.f39383a.setText(ik0Var.f39125f);
                jk0Var.d = i10 != kk0Var.B - 1;
                jk0Var.f39384b.a(z11, z10);
                jk0Var.f39385c.a(z12, z10);
                return;
            }
            return;
        }
        if (i11 == 1) {
            org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
            if (i10 == 0) {
                j4Var.setText(LocaleController.getString(R.string.TelegramTones));
                return;
            } else {
                if (i10 == kk0Var.f39801y) {
                    j4Var.setText(LocaleController.getString(R.string.SystemTones));
                    return;
                }
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) view;
        Drawable drawable = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_circle);
        Drawable drawable2 = e2Var.getContext().getResources().getDrawable(R.drawable.poll_add_plus);
        int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.N6, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23182k7, c6Var), mode));
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(drawable, drawable2);
        e2Var.f24254a.l(LocaleController.getString(R.string.UploadSound), false);
        e2Var.f24255b.setImageDrawable(dqVar);
        e2Var.f24256c = false;
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View w6Var;
        org.telegram.ui.ActionBar.c6 c6Var = this.f38852c.h;
        Context context = viewGroup.getContext();
        if (i10 == 0) {
            jk0 jk0Var = new jk0(context);
            RadioButton radioButton = new RadioButton(context);
            jk0Var.f39384b = radioButton;
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.b(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23109g7, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23126h7, c6Var));
            boolean z10 = LocaleController.isRTL;
            jk0Var.addView(radioButton, h7.z5.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
            org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, 24, c6Var);
            jk0Var.f39385c = bpVar;
            int i11 = org.telegram.ui.ActionBar.g6.f23053d6;
            bpVar.b(-1, i11, org.telegram.ui.ActionBar.g6.f23182k7);
            bpVar.setDrawUnchecked(false);
            bpVar.setDrawBackgroundAsArc(3);
            boolean z11 = LocaleController.isRTL;
            jk0Var.addView(bpVar, h7.z5.d(26, 26.0f, (z11 ? 5 : 3) | 16, z11 ? 0 : 18, 0.0f, z11 ? 18 : 0, 0.0f));
            bpVar.a(true, false);
            TextView textView = new TextView(context);
            jk0Var.f39383a = textView;
            org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            boolean z12 = LocaleController.isRTL;
            jk0Var.addView(textView, h7.z5.d(-2, -2.0f, (z12 ? 5 : 3) | 16, z12 ? 23 : 61, 0.0f, z12 ? 61 : 23, 0.0f));
            jk0Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
            w6Var = jk0Var;
        } else if (i10 == 2) {
            org.telegram.ui.Cells.e2 e2Var = new org.telegram.ui.Cells.e2(context, 70, c6Var);
            e2Var.d = 61;
            e2Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
            w6Var = e2Var;
        } else if (i10 != 3) {
            org.telegram.ui.Cells.j4 j4Var = new org.telegram.ui.Cells.j4(context, c6Var);
            j4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var));
            w6Var = j4Var;
        } else {
            w6Var = new org.telegram.ui.Cells.w6(context, (org.telegram.messenger.rl) null);
        }
        return org.telegram.ui.Cells.pa.l(w6Var, w6Var, -1, -2);
    }
}

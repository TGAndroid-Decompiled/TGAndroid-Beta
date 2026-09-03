package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class nf0 extends ql0 {
    public final Context f27243c;
    public final of0 d;

    public nf0(of0 of0Var, Context context) {
        this.d = of0Var;
        this.f27243c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.C;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        of0 of0Var = this.d;
        if (i10 != of0Var.f27555y && i10 != of0Var.B) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        of0 of0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                t5Var.setTag(Integer.valueOf(i10));
                if (i10 == of0Var.f27555y) {
                    t5Var.a(of0Var.K, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == of0Var.B) {
                    t5Var.a(of0Var.L, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
        u5Var.setTag(Integer.valueOf(i10));
        if (i10 == of0Var.f27525b) {
            u5Var.a(LocaleController.getString(R.string.Enhance), 0, of0Var.D);
        } else if (i10 == of0Var.f27544r) {
            u5Var.a(LocaleController.getString(R.string.Highlights), -100, of0Var.M);
        } else if (i10 == of0Var.d) {
            u5Var.a(LocaleController.getString(R.string.Contrast), -100, of0Var.F);
        } else if (i10 == of0Var.f27527c) {
            u5Var.a(LocaleController.getString(R.string.Exposure), -100, of0Var.E);
        } else if (i10 == of0Var.f27531f) {
            u5Var.a(LocaleController.getString(R.string.Warmth), -100, of0Var.G);
        } else if (i10 == of0Var.e) {
            u5Var.a(LocaleController.getString(R.string.Saturation), -100, of0Var.H);
        } else if (i10 == of0Var.v) {
            u5Var.a(LocaleController.getString(R.string.Vignette), 0, of0Var.O);
        } else if (i10 == of0Var.f27546s) {
            u5Var.a(LocaleController.getString(R.string.Shadows), -100, of0Var.N);
        } else if (i10 == of0Var.f27551w) {
            u5Var.a(LocaleController.getString(R.string.Grain), 0, of0Var.P);
        } else if (i10 == of0Var.f27553x) {
            u5Var.a(LocaleController.getString(R.string.Sharpen), 0, of0Var.R);
        } else if (i10 == of0Var.h) {
            u5Var.a(LocaleController.getString(R.string.Fade), 0, of0Var.I);
        } else if (i10 == of0Var.f27539n) {
            u5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, of0Var.J);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t5 t5Var;
        Context context = this.f27243c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f6 f6Var = this.d.F0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.e = new m2.b((Object) frameLayout, 7);
            TextView textView = new TextView(context);
            frameLayout.f22374a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, k7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f22375b = textView2;
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20279zf, f6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, k7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f23662a = paint;
            Paint paint2 = new Paint(1);
            view.f23663b = paint2;
            view.f23664c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.e = 0.0f;
            view.f23665f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f22376c = view;
            frameLayout.addView(view, k7.b6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new ev(this, 10));
            t5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(context);
            t5Var2.setOnClickListener(new a80(this, 6));
            t5Var = t5Var2;
        }
        return new f2.l1(t5Var);
    }
}

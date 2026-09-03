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
public final class of0 extends rl0 {
    public final Context f29747c;
    public final pf0 d;

    public of0(pf0 pf0Var, Context context) {
        this.d = pf0Var;
        this.f29747c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
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
        pf0 pf0Var = this.d;
        if (i10 != pf0Var.f30080y && i10 != pf0Var.B) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        pf0 pf0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                u5Var.setTag(Integer.valueOf(i10));
                if (i10 == pf0Var.f30080y) {
                    u5Var.a(pf0Var.K, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == pf0Var.B) {
                    u5Var.a(pf0Var.L, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == pf0Var.f30049b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, pf0Var.D);
        } else if (i10 == pf0Var.f30069r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, pf0Var.M);
        } else if (i10 == pf0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, pf0Var.F);
        } else if (i10 == pf0Var.f30051c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, pf0Var.E);
        } else if (i10 == pf0Var.f30056f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, pf0Var.G);
        } else if (i10 == pf0Var.f30054e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, pf0Var.H);
        } else if (i10 == pf0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, pf0Var.O);
        } else if (i10 == pf0Var.f30071s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, pf0Var.N);
        } else if (i10 == pf0Var.f30076w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, pf0Var.P);
        } else if (i10 == pf0Var.f30078x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, pf0Var.R);
        } else if (i10 == pf0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, pf0Var.I);
        } else if (i10 == pf0Var.f30064n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, pf0Var.J);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.f29747c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.g6 g6Var = this.d.F0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f24318e = new m2.b((Object) frameLayout, 7);
            TextView textView = new TextView(context);
            frameLayout.f24315a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, k7.c6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f24316b = textView2;
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f22061zf, g6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, k7.c6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f25917a = paint;
            Paint paint2 = new Paint(1);
            view.f25918b = paint2;
            view.f25919c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.f25920e = 0.0f;
            view.f25921f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f24317c = view;
            frameLayout.addView(view, k7.c6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new hv(this, 10));
            u5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new b80(this, 6));
            u5Var = u5Var2;
        }
        return new f2.m1(u5Var);
    }
}

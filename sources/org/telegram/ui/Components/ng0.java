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
public final class ng0 extends vm0 {
    public final Context f28796c;
    public final og0 d;

    public ng0(og0 og0Var, Context context) {
        this.d = og0Var;
        this.f28796c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.F;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        og0 og0Var = this.d;
        if (i10 != og0Var.f29208y && i10 != og0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f47893f;
        View view = d1Var.f47889a;
        og0 og0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                u5Var.setTag(Integer.valueOf(i10));
                if (i10 == og0Var.f29208y) {
                    u5Var.a(og0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == og0Var.E) {
                    u5Var.a(og0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == og0Var.f29177b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, og0Var.G);
        } else if (i10 == og0Var.f29197r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, og0Var.P);
        } else if (i10 == og0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, og0Var.I);
        } else if (i10 == og0Var.f29179c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, og0Var.H);
        } else if (i10 == og0Var.f29184f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, og0Var.J);
        } else if (i10 == og0Var.f29182e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, og0Var.K);
        } else if (i10 == og0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, og0Var.R);
        } else if (i10 == og0Var.f29199s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, og0Var.Q);
        } else if (i10 == og0Var.f29204w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, og0Var.S);
        } else if (i10 == og0Var.f29206x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, og0Var.U);
        } else if (i10 == og0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, og0Var.L);
        } else if (i10 == og0Var.f29192n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, og0Var.M);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.f28796c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.c6 c6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f23317e = new ai.r4((Object) frameLayout, 28);
            TextView textView = new TextView(context);
            frameLayout.f23314a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            TextView textView2 = new TextView(context);
            frameLayout.f23315b = textView2;
            org.telegram.messenger.am.o(org.telegram.ui.ActionBar.h6.f20972zf, c6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f24634a = paint;
            Paint paint2 = new Paint(1);
            view.f24635b = paint2;
            view.f24636c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.f24637e = 0.0f;
            view.f24638f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f23316c = view;
            frameLayout.addView(view, w7.w5.a(40.0f, 96.0f, 0.0f, 24.0f, 0.0f, -1, 19));
            frameLayout.setSeekBarDelegate(new ew(this, 11));
            u5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new f90(this, 5));
            u5Var = u5Var2;
        }
        return new s4.d1(u5Var);
    }
}

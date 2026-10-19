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
public final class bg0 extends hm0 {
    public final Context f24949c;
    public final cg0 d;

    public bg0(cg0 cg0Var, Context context) {
        this.d = cg0Var;
        this.f24949c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
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
        cg0 cg0Var = this.d;
        if (i10 != cg0Var.f25214y && i10 != cg0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f45913f;
        View view = b1Var.f45910a;
        cg0 cg0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                t5Var.setTag(Integer.valueOf(i10));
                if (i10 == cg0Var.f25214y) {
                    t5Var.a(cg0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == cg0Var.E) {
                    t5Var.a(cg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
        u5Var.setTag(Integer.valueOf(i10));
        if (i10 == cg0Var.f25184b) {
            u5Var.a(LocaleController.getString(R.string.Enhance), 0, cg0Var.G);
        } else if (i10 == cg0Var.f25203r) {
            u5Var.a(LocaleController.getString(R.string.Highlights), -100, cg0Var.P);
        } else if (i10 == cg0Var.d) {
            u5Var.a(LocaleController.getString(R.string.Contrast), -100, cg0Var.I);
        } else if (i10 == cg0Var.f25186c) {
            u5Var.a(LocaleController.getString(R.string.Exposure), -100, cg0Var.H);
        } else if (i10 == cg0Var.f25190f) {
            u5Var.a(LocaleController.getString(R.string.Warmth), -100, cg0Var.J);
        } else if (i10 == cg0Var.e) {
            u5Var.a(LocaleController.getString(R.string.Saturation), -100, cg0Var.K);
        } else if (i10 == cg0Var.v) {
            u5Var.a(LocaleController.getString(R.string.Vignette), 0, cg0Var.R);
        } else if (i10 == cg0Var.f25205s) {
            u5Var.a(LocaleController.getString(R.string.Shadows), -100, cg0Var.Q);
        } else if (i10 == cg0Var.f25210w) {
            u5Var.a(LocaleController.getString(R.string.Grain), 0, cg0Var.S);
        } else if (i10 == cg0Var.f25212x) {
            u5Var.a(LocaleController.getString(R.string.Sharpen), 0, cg0Var.U);
        } else if (i10 == cg0Var.h) {
            u5Var.a(LocaleController.getString(R.string.Fade), 0, cg0Var.L);
        } else if (i10 == cg0Var.f25198n) {
            u5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, cg0Var.M);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t5 t5Var;
        Context context = this.f24949c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.d6 d6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.e = new androidx.activity.i((Object) frameLayout, 28);
            TextView textView = new TextView(context);
            frameLayout.f23594a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, w7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f23595b = textView2;
            org.telegram.messenger.lk.o(org.telegram.ui.ActionBar.h6.f21402zf, d6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, w7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f29253a = paint;
            Paint paint2 = new Paint(1);
            view.f29254b = paint2;
            view.f29255c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.e = 0.0f;
            view.f29256f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f23596c = view;
            frameLayout.addView(view, w7.z5.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new tv(this, 11));
            t5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(context);
            t5Var2.setOnClickListener(new u80(this, 5));
            t5Var = t5Var2;
        }
        return new s4.b1(t5Var);
    }
}

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
public final class if0 extends kl0 {
    public final Context f27108c;
    public final jf0 d;

    public if0(jf0 jf0Var, Context context) {
        this.d = jf0Var;
        this.f27108c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
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
        jf0 jf0Var = this.d;
        if (i10 != jf0Var.f27500y && i10 != jf0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        jf0 jf0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                t5Var.setTag(Integer.valueOf(i10));
                if (i10 == jf0Var.f27500y) {
                    t5Var.a(jf0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == jf0Var.E) {
                    t5Var.a(jf0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
        u5Var.setTag(Integer.valueOf(i10));
        if (i10 == jf0Var.f27469b) {
            u5Var.a(LocaleController.getString(R.string.Enhance), 0, jf0Var.G);
        } else if (i10 == jf0Var.f27489r) {
            u5Var.a(LocaleController.getString(R.string.Highlights), -100, jf0Var.P);
        } else if (i10 == jf0Var.d) {
            u5Var.a(LocaleController.getString(R.string.Contrast), -100, jf0Var.I);
        } else if (i10 == jf0Var.f27471c) {
            u5Var.a(LocaleController.getString(R.string.Exposure), -100, jf0Var.H);
        } else if (i10 == jf0Var.f27476f) {
            u5Var.a(LocaleController.getString(R.string.Warmth), -100, jf0Var.J);
        } else if (i10 == jf0Var.f27474e) {
            u5Var.a(LocaleController.getString(R.string.Saturation), -100, jf0Var.K);
        } else if (i10 == jf0Var.v) {
            u5Var.a(LocaleController.getString(R.string.Vignette), 0, jf0Var.R);
        } else if (i10 == jf0Var.f27491s) {
            u5Var.a(LocaleController.getString(R.string.Shadows), -100, jf0Var.Q);
        } else if (i10 == jf0Var.f27496w) {
            u5Var.a(LocaleController.getString(R.string.Grain), 0, jf0Var.S);
        } else if (i10 == jf0Var.f27498x) {
            u5Var.a(LocaleController.getString(R.string.Sharpen), 0, jf0Var.U);
        } else if (i10 == jf0Var.h) {
            u5Var.a(LocaleController.getString(R.string.Fade), 0, jf0Var.L);
        } else if (i10 == jf0Var.f27484n) {
            u5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, jf0Var.M);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t5 t5Var;
        Context context = this.f27108c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f6 f6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f23325e = new androidx.activity.i((Object) frameLayout, 28);
            TextView textView = new TextView(context);
            frameLayout.f23322a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, w7.x5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f23323b = textView2;
            org.telegram.messenger.wl.n(org.telegram.ui.ActionBar.j6.f21070zf, f6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, w7.x5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f32250a = paint;
            Paint paint2 = new Paint(1);
            view.f32251b = paint2;
            view.f32252c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.f32253e = 0.0f;
            view.f32254f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f23324c = view;
            frameLayout.addView(view, w7.x5.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new kv(this, 10));
            t5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(context);
            t5Var2.setOnClickListener(new x70(this, 6));
            t5Var = t5Var2;
        }
        return new s4.c1(t5Var);
    }
}

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
public final class df0 extends il0 {
    public final Context f27755c;
    public final ef0 d;

    public df0(ef0 ef0Var, Context context) {
        this.d = ef0Var;
        this.f27755c = context;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.B;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        ef0 ef0Var = this.d;
        if (i10 != ef0Var.f28055y && i10 != ef0Var.A) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        int i11 = n1Var.f6436f;
        View view = n1Var.f6432a;
        ef0 ef0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                s5Var.setTag(Integer.valueOf(i10));
                if (i10 == ef0Var.f28055y) {
                    s5Var.a(ef0Var.J, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == ef0Var.A) {
                    s5Var.a(ef0Var.K, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
        t5Var.setTag(Integer.valueOf(i10));
        if (i10 == ef0Var.f28024b) {
            t5Var.a(LocaleController.getString(R.string.Enhance), 0, ef0Var.C);
        } else if (i10 == ef0Var.f28044r) {
            t5Var.a(LocaleController.getString(R.string.Highlights), -100, ef0Var.L);
        } else if (i10 == ef0Var.d) {
            t5Var.a(LocaleController.getString(R.string.Contrast), -100, ef0Var.E);
        } else if (i10 == ef0Var.f28026c) {
            t5Var.a(LocaleController.getString(R.string.Exposure), -100, ef0Var.D);
        } else if (i10 == ef0Var.f28031f) {
            t5Var.a(LocaleController.getString(R.string.Warmth), -100, ef0Var.F);
        } else if (i10 == ef0Var.f28029e) {
            t5Var.a(LocaleController.getString(R.string.Saturation), -100, ef0Var.G);
        } else if (i10 == ef0Var.v) {
            t5Var.a(LocaleController.getString(R.string.Vignette), 0, ef0Var.N);
        } else if (i10 == ef0Var.f28046s) {
            t5Var.a(LocaleController.getString(R.string.Shadows), -100, ef0Var.M);
        } else if (i10 == ef0Var.f28051w) {
            t5Var.a(LocaleController.getString(R.string.Grain), 0, ef0Var.O);
        } else if (i10 == ef0Var.f28053x) {
            t5Var.a(LocaleController.getString(R.string.Sharpen), 0, ef0Var.Q);
        } else if (i10 == ef0Var.h) {
            t5Var.a(LocaleController.getString(R.string.Fade), 0, ef0Var.H);
        } else if (i10 == ef0Var.f28039n) {
            t5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, ef0Var.I);
        }
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.s5 s5Var;
        Context context = this.f27755c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.c6 c6Var = this.d.E0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f25703e = new lh.m7((Object) frameLayout, 8);
            TextView textView = new TextView(context);
            frameLayout.f25700a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, i7.f6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f25701b = textView2;
            org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23459zf, c6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, i7.f6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f32273a = paint;
            Paint paint2 = new Paint(1);
            view.f32274b = paint2;
            view.f32275c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.f32276e = 0.0f;
            view.f32277f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f25702c = view;
            frameLayout.addView(view, i7.f6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new cv(this, 10));
            s5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.s5 s5Var2 = new org.telegram.ui.Cells.s5(context);
            s5Var2.setOnClickListener(new u70(this, 6));
            s5Var = s5Var2;
        }
        return new f2.n1(s5Var);
    }
}

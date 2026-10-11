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
public final class lg0 extends rm0 {
    public final Context f28335c;
    public final mg0 d;

    public lg0(mg0 mg0Var, Context context) {
        this.d = mg0Var;
        this.f28335c = context;
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
        mg0 mg0Var = this.d;
        if (i10 != mg0Var.f28702y && i10 != mg0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f47752f;
        View view = d1Var.f47748a;
        mg0 mg0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                u5Var.setTag(Integer.valueOf(i10));
                if (i10 == mg0Var.f28702y) {
                    u5Var.a(mg0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == mg0Var.E) {
                    u5Var.a(mg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == mg0Var.f28671b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, mg0Var.G);
        } else if (i10 == mg0Var.f28691r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, mg0Var.P);
        } else if (i10 == mg0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, mg0Var.I);
        } else if (i10 == mg0Var.f28673c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, mg0Var.H);
        } else if (i10 == mg0Var.f28678f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, mg0Var.J);
        } else if (i10 == mg0Var.f28676e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, mg0Var.K);
        } else if (i10 == mg0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, mg0Var.R);
        } else if (i10 == mg0Var.f28693s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, mg0Var.Q);
        } else if (i10 == mg0Var.f28698w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, mg0Var.S);
        } else if (i10 == mg0Var.f28700x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, mg0Var.U);
        } else if (i10 == mg0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, mg0Var.L);
        } else if (i10 == mg0Var.f28686n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, mg0Var.M);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.f28335c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.d6 d6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f23537e = new ai.r4((Object) frameLayout, 29);
            TextView textView = new TextView(context);
            frameLayout.f23534a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            TextView textView2 = new TextView(context);
            frameLayout.f23535b = textView2;
            org.telegram.messenger.ai.o(org.telegram.ui.ActionBar.h6.f21198zf, d6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f33497a = paint;
            Paint paint2 = new Paint(1);
            view.f33498b = paint2;
            view.f33499c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.f33500e = 0.0f;
            view.f33501f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f23536c = view;
            frameLayout.addView(view, w7.x5.a(40.0f, 96.0f, 0.0f, 24.0f, 0.0f, -1, 19));
            frameLayout.setSeekBarDelegate(new cw(this, 11));
            u5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new c90(this, 5));
            u5Var = u5Var2;
        }
        return new s4.d1(u5Var);
    }
}

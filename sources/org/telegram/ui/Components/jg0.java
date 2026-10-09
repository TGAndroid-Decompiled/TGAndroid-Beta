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
public final class jg0 extends pm0 {
    public final Context f27711c;
    public final kg0 d;

    public jg0(kg0 kg0Var, Context context) {
        this.d = kg0Var;
        this.f27711c = context;
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
        kg0 kg0Var = this.d;
        if (i10 != kg0Var.f28004y && i10 != kg0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f47660f;
        View view = d1Var.f47656a;
        kg0 kg0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                u5Var.setTag(Integer.valueOf(i10));
                if (i10 == kg0Var.f28004y) {
                    u5Var.a(kg0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == kg0Var.E) {
                    u5Var.a(kg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == kg0Var.f27973b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, kg0Var.G);
        } else if (i10 == kg0Var.f27993r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, kg0Var.P);
        } else if (i10 == kg0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, kg0Var.I);
        } else if (i10 == kg0Var.f27975c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, kg0Var.H);
        } else if (i10 == kg0Var.f27980f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, kg0Var.J);
        } else if (i10 == kg0Var.f27978e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, kg0Var.K);
        } else if (i10 == kg0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, kg0Var.R);
        } else if (i10 == kg0Var.f27995s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, kg0Var.Q);
        } else if (i10 == kg0Var.f28000w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, kg0Var.S);
        } else if (i10 == kg0Var.f28002x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, kg0Var.U);
        } else if (i10 == kg0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, kg0Var.L);
        } else if (i10 == kg0Var.f27988n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, kg0Var.M);
        }
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.f27711c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.e6 e6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f23545e = new ai.r4((Object) frameLayout, 29);
            TextView textView = new TextView(context);
            frameLayout.f23542a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            TextView textView2 = new TextView(context);
            frameLayout.f23543b = textView2;
            org.telegram.messenger.bi.o(org.telegram.ui.ActionBar.i6.f21208zf, e6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f32821a = paint;
            Paint paint2 = new Paint(1);
            view.f32822b = paint2;
            view.f32823c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.f32824e = 0.0f;
            view.f32825f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f23544c = view;
            frameLayout.addView(view, w7.x5.a(40.0f, 96.0f, 0.0f, 24.0f, 0.0f, -1, 19));
            frameLayout.setSeekBarDelegate(new bw(this, 11));
            u5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new b90(this, 5));
            u5Var = u5Var2;
        }
        return new s4.d1(u5Var);
    }
}

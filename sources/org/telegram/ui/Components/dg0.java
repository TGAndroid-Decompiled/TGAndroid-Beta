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
public final class dg0 extends lm0 {
    public final Context f27518c;
    public final eg0 d;

    public dg0(eg0 eg0Var, Context context) {
        this.d = eg0Var;
        this.f27518c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
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
        eg0 eg0Var = this.d;
        if (i10 != eg0Var.f27858y && i10 != eg0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f47738f;
        View view = e1Var.f47735a;
        eg0 eg0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) view;
                y5Var.setTag(Integer.valueOf(i10));
                if (i10 == eg0Var.f27858y) {
                    y5Var.a(eg0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == eg0Var.E) {
                    y5Var.a(eg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
        z5Var.setTag(Integer.valueOf(i10));
        if (i10 == eg0Var.f27828b) {
            z5Var.a(LocaleController.getString(R.string.Enhance), 0, eg0Var.G);
        } else if (i10 == eg0Var.f27847r) {
            z5Var.a(LocaleController.getString(R.string.Highlights), -100, eg0Var.P);
        } else if (i10 == eg0Var.d) {
            z5Var.a(LocaleController.getString(R.string.Contrast), -100, eg0Var.I);
        } else if (i10 == eg0Var.f27830c) {
            z5Var.a(LocaleController.getString(R.string.Exposure), -100, eg0Var.H);
        } else if (i10 == eg0Var.f27834f) {
            z5Var.a(LocaleController.getString(R.string.Warmth), -100, eg0Var.J);
        } else if (i10 == eg0Var.e) {
            z5Var.a(LocaleController.getString(R.string.Saturation), -100, eg0Var.K);
        } else if (i10 == eg0Var.v) {
            z5Var.a(LocaleController.getString(R.string.Vignette), 0, eg0Var.R);
        } else if (i10 == eg0Var.f27849s) {
            z5Var.a(LocaleController.getString(R.string.Shadows), -100, eg0Var.Q);
        } else if (i10 == eg0Var.f27854w) {
            z5Var.a(LocaleController.getString(R.string.Grain), 0, eg0Var.S);
        } else if (i10 == eg0Var.f27856x) {
            z5Var.a(LocaleController.getString(R.string.Sharpen), 0, eg0Var.U);
        } else if (i10 == eg0Var.h) {
            z5Var.a(LocaleController.getString(R.string.Fade), 0, eg0Var.L);
        } else if (i10 == eg0Var.f27842n) {
            z5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, eg0Var.M);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y5 y5Var;
        Context context = this.f27518c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.u6 u6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.e = new m.g3((Object) frameLayout, 4);
            TextView textView = new TextView(context);
            frameLayout.f25786a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, gb1.h(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f25787b = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.zf, u6Var);
            textView2.setTextSize(1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, gb1.h(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f31908a = paint;
            Paint paint2 = new Paint(1);
            view.f31909b = paint2;
            view.f31910c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.e = 0.0f;
            view.f31911f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f25788c = view;
            frameLayout.addView(view, gb1.h(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new tv(this, 12));
            y5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.y5 y5Var2 = new org.telegram.ui.Cells.y5(context);
            y5Var2.setOnClickListener(new w80(this, 4));
            y5Var = y5Var2;
        }
        return new s4.e1(y5Var);
    }
}

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
public final class eg0 extends mm0 {
    public final Context f27844c;
    public final fg0 d;

    public eg0(fg0 fg0Var, Context context) {
        this.d = fg0Var;
        this.f27844c = context;
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
        fg0 fg0Var = this.d;
        if (i10 != fg0Var.f28153y && i10 != fg0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        fg0 fg0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) view;
                y5Var.setTag(Integer.valueOf(i10));
                if (i10 == fg0Var.f28153y) {
                    y5Var.a(fg0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == fg0Var.E) {
                    y5Var.a(fg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view;
        z5Var.setTag(Integer.valueOf(i10));
        if (i10 == fg0Var.f28123b) {
            z5Var.a(LocaleController.getString(R.string.Enhance), 0, fg0Var.G);
        } else if (i10 == fg0Var.f28142r) {
            z5Var.a(LocaleController.getString(R.string.Highlights), -100, fg0Var.P);
        } else if (i10 == fg0Var.d) {
            z5Var.a(LocaleController.getString(R.string.Contrast), -100, fg0Var.I);
        } else if (i10 == fg0Var.f28125c) {
            z5Var.a(LocaleController.getString(R.string.Exposure), -100, fg0Var.H);
        } else if (i10 == fg0Var.f28129f) {
            z5Var.a(LocaleController.getString(R.string.Warmth), -100, fg0Var.J);
        } else if (i10 == fg0Var.e) {
            z5Var.a(LocaleController.getString(R.string.Saturation), -100, fg0Var.K);
        } else if (i10 == fg0Var.v) {
            z5Var.a(LocaleController.getString(R.string.Vignette), 0, fg0Var.R);
        } else if (i10 == fg0Var.f28144s) {
            z5Var.a(LocaleController.getString(R.string.Shadows), -100, fg0Var.Q);
        } else if (i10 == fg0Var.f28149w) {
            z5Var.a(LocaleController.getString(R.string.Grain), 0, fg0Var.S);
        } else if (i10 == fg0Var.f28151x) {
            z5Var.a(LocaleController.getString(R.string.Sharpen), 0, fg0Var.U);
        } else if (i10 == fg0Var.h) {
            z5Var.a(LocaleController.getString(R.string.Fade), 0, fg0Var.L);
        } else if (i10 == fg0Var.f28137n) {
            z5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, fg0Var.M);
        }
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y5 y5Var;
        Context context = this.f27844c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.u6 u6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.e = new m.g3((Object) frameLayout, 4);
            TextView textView = new TextView(context);
            frameLayout.f25790a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, kb1.h(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f25791b = textView2;
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.zf, u6Var);
            textView2.setTextSize(1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, kb1.h(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f32243a = paint;
            Paint paint2 = new Paint(1);
            view.f32244b = paint2;
            view.f32245c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.e = 0.0f;
            view.f32246f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f25792c = view;
            frameLayout.addView(view, kb1.h(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new tv(this, 12));
            y5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.y5 y5Var2 = new org.telegram.ui.Cells.y5(context);
            y5Var2.setOnClickListener(new x80(this, 4));
            y5Var = y5Var2;
        }
        return new s4.e1(y5Var);
    }
}

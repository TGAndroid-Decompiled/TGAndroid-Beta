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
public final class fg0 extends km0 {
    public final Context f26321c;
    public final gg0 d;

    public fg0(gg0 gg0Var, Context context) {
        this.d = gg0Var;
        this.f26321c = context;
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
        gg0 gg0Var = this.d;
        if (i10 != gg0Var.f26687y && i10 != gg0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f46345f;
        View view = b1Var.f46342a;
        gg0 gg0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                t5Var.setTag(Integer.valueOf(i10));
                if (i10 == gg0Var.f26687y) {
                    t5Var.a(gg0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == gg0Var.E) {
                    t5Var.a(gg0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == gg0Var.f26657b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, gg0Var.G);
        } else if (i10 == gg0Var.f26676r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, gg0Var.P);
        } else if (i10 == gg0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, gg0Var.I);
        } else if (i10 == gg0Var.f26659c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, gg0Var.H);
        } else if (i10 == gg0Var.f26663f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, gg0Var.J);
        } else if (i10 == gg0Var.e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, gg0Var.K);
        } else if (i10 == gg0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, gg0Var.R);
        } else if (i10 == gg0Var.f26678s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, gg0Var.Q);
        } else if (i10 == gg0Var.f26683w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, gg0Var.S);
        } else if (i10 == gg0Var.f26685x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, gg0Var.U);
        } else if (i10 == gg0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, gg0Var.L);
        } else if (i10 == gg0Var.f26671n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, gg0Var.M);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t5 t5Var;
        Context context = this.f26321c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.g6 g6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.e = new org.telegram.ui.Cells.u5(frameLayout, 0);
            TextView textView = new TextView(context);
            frameLayout.f23845a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, w7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f23846b = textView2;
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21597zf, g6Var);
            textView2.setTextSize(1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, w7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f30489a = paint;
            Paint paint2 = new Paint(1);
            view.f30490b = paint2;
            view.f30491c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.e = 0.0f;
            view.f30492f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f23847c = view;
            frameLayout.addView(view, w7.z5.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new rv(this, 11));
            t5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.t5 t5Var2 = new org.telegram.ui.Cells.t5(context);
            t5Var2.setOnClickListener(new t80(this, 5));
            t5Var = t5Var2;
        }
        return new s4.b1(t5Var);
    }
}

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
public final class vf0 extends yl0 {
    public final Context f29109c;
    public final wf0 d;

    public vf0(wf0 wf0Var, Context context) {
        this.d = wf0Var;
        this.f29109c = context;
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
        wf0 wf0Var = this.d;
        if (i10 != wf0Var.f29934y && i10 != wf0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f43071f;
        View view = c1Var.f43068a;
        wf0 wf0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                u5Var.setTag(Integer.valueOf(i10));
                if (i10 == wf0Var.f29934y) {
                    u5Var.a(wf0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == wf0Var.E) {
                    u5Var.a(wf0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == wf0Var.f29904b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, wf0Var.G);
        } else if (i10 == wf0Var.f29923r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, wf0Var.P);
        } else if (i10 == wf0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, wf0Var.I);
        } else if (i10 == wf0Var.f29906c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, wf0Var.H);
        } else if (i10 == wf0Var.f29910f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, wf0Var.J);
        } else if (i10 == wf0Var.e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, wf0Var.K);
        } else if (i10 == wf0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, wf0Var.R);
        } else if (i10 == wf0Var.f29925s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, wf0Var.Q);
        } else if (i10 == wf0Var.f29930w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, wf0Var.S);
        } else if (i10 == wf0Var.f29932x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, wf0Var.U);
        } else if (i10 == wf0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, wf0Var.L);
        } else if (i10 == wf0Var.f29918n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, wf0Var.M);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.f29109c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.d6 d6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.e = new ai.q4((Object) frameLayout, 29);
            TextView textView = new TextView(context);
            frameLayout.f21705a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, w7.y5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f21706b = textView2;
            org.telegram.messenger.ok.n(org.telegram.ui.ActionBar.h6.f19487zf, d6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, w7.y5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f25436a = paint;
            Paint paint2 = new Paint(1);
            view.f25437b = paint2;
            view.f25438c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.e = 0.0f;
            view.f25439f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f21707c = view;
            frameLayout.addView(view, w7.y5.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new ov(this, 11));
            u5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new l80(this, 6));
            u5Var = u5Var2;
        }
        return new s4.c1(u5Var);
    }
}

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
public final class uf0 extends yl0 {
    public final Context f31364c;
    public final vf0 d;

    public uf0(vf0 vf0Var, Context context) {
        this.d = vf0Var;
        this.f31364c = context;
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
        vf0 vf0Var = this.d;
        if (i10 != vf0Var.f31675y && i10 != vf0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f46527f;
        View view = c1Var.f46523a;
        vf0 vf0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                u5Var.setTag(Integer.valueOf(i10));
                if (i10 == vf0Var.f31675y) {
                    u5Var.a(vf0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == vf0Var.E) {
                    u5Var.a(vf0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == vf0Var.f31644b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, vf0Var.G);
        } else if (i10 == vf0Var.f31664r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, vf0Var.P);
        } else if (i10 == vf0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, vf0Var.I);
        } else if (i10 == vf0Var.f31646c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, vf0Var.H);
        } else if (i10 == vf0Var.f31651f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, vf0Var.J);
        } else if (i10 == vf0Var.f31649e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, vf0Var.K);
        } else if (i10 == vf0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, vf0Var.R);
        } else if (i10 == vf0Var.f31666s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, vf0Var.Q);
        } else if (i10 == vf0Var.f31671w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, vf0Var.S);
        } else if (i10 == vf0Var.f31673x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, vf0Var.U);
        } else if (i10 == vf0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, vf0Var.L);
        } else if (i10 == vf0Var.f31659n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, vf0Var.M);
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.f31364c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.d6 d6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f23555e = new ai.q4((Object) frameLayout, 29);
            TextView textView = new TextView(context);
            frameLayout.f23552a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, w7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f23553b = textView2;
            org.telegram.messenger.ok.n(org.telegram.ui.ActionBar.i6.f21232zf, d6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, w7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f27393a = paint;
            Paint paint2 = new Paint(1);
            view.f27394b = paint2;
            view.f27395c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.f27396e = 0.0f;
            view.f27397f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f23554c = view;
            frameLayout.addView(view, w7.z5.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new pv(this, 11));
            u5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new l80(this, 6));
            u5Var = u5Var2;
        }
        return new s4.c1(u5Var);
    }
}

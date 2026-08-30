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
public final class mf0 extends rl0 {
    public final Context f27009c;
    public final nf0 d;

    public mf0(nf0 nf0Var, Context context) {
        this.d = nf0Var;
        this.f27009c = context;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.C;
    }

    @Override
    public final long i(int i10) {
        return i10;
    }

    @Override
    public final int j(int i10) {
        nf0 nf0Var = this.d;
        if (i10 != nf0Var.f27268y && i10 != nf0Var.B) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        int i11 = l1Var.f5788f;
        View view = l1Var.f5785a;
        nf0 nf0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                u5Var.setTag(Integer.valueOf(i10));
                if (i10 == nf0Var.f27268y) {
                    u5Var.a(nf0Var.K, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == nf0Var.B) {
                    u5Var.a(nf0Var.L, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == nf0Var.f27238b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, nf0Var.D);
        } else if (i10 == nf0Var.f27257r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, nf0Var.M);
        } else if (i10 == nf0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, nf0Var.F);
        } else if (i10 == nf0Var.f27240c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, nf0Var.E);
        } else if (i10 == nf0Var.f27244f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, nf0Var.G);
        } else if (i10 == nf0Var.e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, nf0Var.H);
        } else if (i10 == nf0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, nf0Var.O);
        } else if (i10 == nf0Var.f27259s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, nf0Var.N);
        } else if (i10 == nf0Var.f27264w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, nf0Var.P);
        } else if (i10 == nf0Var.f27266x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, nf0Var.R);
        } else if (i10 == nf0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, nf0Var.I);
        } else if (i10 == nf0Var.f27252n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, nf0Var.J);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.f27009c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.f6 f6Var = this.d.F0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.e = new m2.b((Object) frameLayout, 7);
            TextView textView = new TextView(context);
            frameLayout.f22500a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, k7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f22501b = textView2;
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.j6.f20304zf, f6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, k7.b6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f23373a = paint;
            Paint paint2 = new Paint(1);
            view.f23374b = paint2;
            view.f23375c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.e = 0.0f;
            view.f23376f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f22502c = view;
            frameLayout.addView(view, k7.b6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new fv(this, 10));
            u5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new z70(this, 6));
            u5Var = u5Var2;
        }
        return new f2.l1(u5Var);
    }
}

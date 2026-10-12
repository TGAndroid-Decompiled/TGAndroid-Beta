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
public final class hg0 extends lm0 {
    public final Context f25661c;
    public final ig0 d;

    public hg0(ig0 ig0Var, Context context) {
        this.d = ig0Var;
        this.f25661c = context;
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
        ig0 ig0Var = this.d;
        if (i10 != ig0Var.f25975y && i10 != ig0Var.E) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        ig0 ig0Var = this.d;
        if (i11 != 0) {
            if (i11 == 1) {
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                u5Var.setTag(Integer.valueOf(i10));
                if (i10 == ig0Var.f25975y) {
                    u5Var.a(ig0Var.N, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i10 == ig0Var.E) {
                    u5Var.a(ig0Var.O, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i10));
        if (i10 == ig0Var.f25945b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, ig0Var.G);
        } else if (i10 == ig0Var.f25964r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, ig0Var.P);
        } else if (i10 == ig0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, ig0Var.I);
        } else if (i10 == ig0Var.f25947c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, ig0Var.H);
        } else if (i10 == ig0Var.f25951f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, ig0Var.J);
        } else if (i10 == ig0Var.e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, ig0Var.K);
        } else if (i10 == ig0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, ig0Var.R);
        } else if (i10 == ig0Var.f25966s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, ig0Var.Q);
        } else if (i10 == ig0Var.f25971w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, ig0Var.S);
        } else if (i10 == ig0Var.f25973x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, ig0Var.U);
        } else if (i10 == ig0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, ig0Var.L);
        } else if (i10 == ig0Var.f25959n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, ig0Var.M);
        }
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.f25661c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.c6 c6Var = this.d.I0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.e = new androidx.activity.i((Object) frameLayout, 29);
            TextView textView = new TextView(context);
            frameLayout.f22566a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            TextView textView2 = new TextView(context);
            frameLayout.f22567b = textView2;
            org.telegram.messenger.yh.n(org.telegram.ui.ActionBar.g6.f20313zf, c6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, w7.a6.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 80, 19));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f29948a = paint;
            Paint paint2 = new Paint(1);
            view.f29949b = paint2;
            view.f29950c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.e = 0.0f;
            view.f29951f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f22568c = view;
            frameLayout.addView(view, w7.a6.a(40.0f, 96.0f, 0.0f, 24.0f, 0.0f, -1, 19));
            frameLayout.setSeekBarDelegate(new xv(this, 11));
            u5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new z80(this, 5));
            u5Var = u5Var2;
        }
        return new s4.b1(u5Var);
    }
}

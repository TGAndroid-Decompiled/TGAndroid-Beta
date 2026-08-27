package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ue0 extends yk0 {

    public final Context f33067c;
    public final ve0 d;

    public ue0(ve0 ve0Var, Context context) {
        this.d = ve0Var;
        this.f33067c = context;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
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
        ve0 ve0Var = this.d;
        return (i10 == ve0Var.f33411y || i10 == ve0Var.A) ? 1 : 0;
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        int i11 = o1Var.f5793f;
        View view = o1Var.f5789a;
        ve0 ve0Var = this.d;
        if (i11 != 0) {
            if (i11 != 1) {
                return;
            }
            org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
            r5Var.setTag(Integer.valueOf(i10));
            if (i10 == ve0Var.f33411y) {
                r5Var.a(ve0Var.J, LocaleController.getString(R.string.TintShadows));
                return;
            } else {
                if (i10 == ve0Var.A) {
                    r5Var.a(ve0Var.K, LocaleController.getString(R.string.TintHighlights));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        s5Var.setTag(Integer.valueOf(i10));
        if (i10 == ve0Var.f33380b) {
            s5Var.a(LocaleController.getString(R.string.Enhance), 0, ve0Var.C);
            return;
        }
        if (i10 == ve0Var.f33400r) {
            s5Var.a(LocaleController.getString(R.string.Highlights), -100, ve0Var.L);
            return;
        }
        if (i10 == ve0Var.d) {
            s5Var.a(LocaleController.getString(R.string.Contrast), -100, ve0Var.E);
            return;
        }
        if (i10 == ve0Var.f33382c) {
            s5Var.a(LocaleController.getString(R.string.Exposure), -100, ve0Var.D);
            return;
        }
        if (i10 == ve0Var.f33387f) {
            s5Var.a(LocaleController.getString(R.string.Warmth), -100, ve0Var.F);
            return;
        }
        if (i10 == ve0Var.f33385e) {
            s5Var.a(LocaleController.getString(R.string.Saturation), -100, ve0Var.G);
            return;
        }
        if (i10 == ve0Var.v) {
            s5Var.a(LocaleController.getString(R.string.Vignette), 0, ve0Var.N);
            return;
        }
        if (i10 == ve0Var.f33402s) {
            s5Var.a(LocaleController.getString(R.string.Shadows), -100, ve0Var.M);
            return;
        }
        if (i10 == ve0Var.f33407w) {
            s5Var.a(LocaleController.getString(R.string.Grain), 0, ve0Var.O);
            return;
        }
        if (i10 == ve0Var.f33409x) {
            s5Var.a(LocaleController.getString(R.string.Sharpen), 0, ve0Var.Q);
        } else if (i10 == ve0Var.h) {
            s5Var.a(LocaleController.getString(R.string.Fade), 0, ve0Var.H);
        } else if (i10 == ve0Var.f33395n) {
            s5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, ve0Var.I);
        }
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.f33067c;
        if (i10 == 0) {
            org.telegram.ui.ActionBar.c6 c6Var = this.d.E0;
            org.telegram.ui.Cells.s5 s5Var = new org.telegram.ui.Cells.s5(context);
            s5Var.f25636e = new m.i3(s5Var, 5);
            TextView textView = new TextView(context);
            s5Var.f25633a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            s5Var.addView(textView, h7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            s5Var.f25634b = textView2;
            org.telegram.messenger.rl.l(org.telegram.ui.ActionBar.g6.f23449zf, c6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            s5Var.addView(textView2, h7.z5.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ie0 ie0Var = new ie0(context);
            Paint paint = new Paint();
            ie0Var.f29341a = paint;
            Paint paint2 = new Paint(1);
            ie0Var.f29342b = paint2;
            ie0Var.f29343c = AndroidUtilities.dp(16.0f);
            ie0Var.d = 0;
            ie0Var.f29344e = 0.0f;
            ie0Var.f29345f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            s5Var.f25635c = ie0Var;
            s5Var.addView(ie0Var, h7.z5.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            s5Var.setSeekBarDelegate(new vu(this, 10));
            view = s5Var;
        } else {
            org.telegram.ui.Cells.r5 r5Var = new org.telegram.ui.Cells.r5(context);
            r5Var.setOnClickListener(new l70(this, 6));
            view = r5Var;
        }
        return new lk0(view);
    }
}

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
public final class pe0 extends vk0 {
    public final Context f31619c;
    public final qe0 d;

    public pe0(qe0 qe0Var, Context context) {
        this.d = qe0Var;
        this.f31619c = context;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.B;
    }

    @Override
    public final long i(int i9) {
        return i9;
    }

    @Override
    public final int j(int i9) {
        qe0 qe0Var = this.d;
        if (i9 != qe0Var.f31923y && i9 != qe0Var.A) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f5505f;
        View view = q1Var.f5501a;
        qe0 qe0Var = this.d;
        if (i10 != 0) {
            if (i10 == 1) {
                org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                u5Var.setTag(Integer.valueOf(i9));
                if (i9 == qe0Var.f31923y) {
                    u5Var.a(qe0Var.J, LocaleController.getString(R.string.TintShadows));
                    return;
                } else if (i9 == qe0Var.A) {
                    u5Var.a(qe0Var.K, LocaleController.getString(R.string.TintHighlights));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) view;
        v5Var.setTag(Integer.valueOf(i9));
        if (i9 == qe0Var.f31892b) {
            v5Var.a(LocaleController.getString(R.string.Enhance), 0, qe0Var.C);
        } else if (i9 == qe0Var.f31912r) {
            v5Var.a(LocaleController.getString(R.string.Highlights), -100, qe0Var.L);
        } else if (i9 == qe0Var.d) {
            v5Var.a(LocaleController.getString(R.string.Contrast), -100, qe0Var.E);
        } else if (i9 == qe0Var.f31894c) {
            v5Var.a(LocaleController.getString(R.string.Exposure), -100, qe0Var.D);
        } else if (i9 == qe0Var.f31899f) {
            v5Var.a(LocaleController.getString(R.string.Warmth), -100, qe0Var.F);
        } else if (i9 == qe0Var.f31897e) {
            v5Var.a(LocaleController.getString(R.string.Saturation), -100, qe0Var.G);
        } else if (i9 == qe0Var.v) {
            v5Var.a(LocaleController.getString(R.string.Vignette), 0, qe0Var.N);
        } else if (i9 == qe0Var.f31914s) {
            v5Var.a(LocaleController.getString(R.string.Shadows), -100, qe0Var.M);
        } else if (i9 == qe0Var.f31919w) {
            v5Var.a(LocaleController.getString(R.string.Grain), 0, qe0Var.O);
        } else if (i9 == qe0Var.f31921x) {
            v5Var.a(LocaleController.getString(R.string.Sharpen), 0, qe0Var.Q);
        } else if (i9 == qe0Var.h) {
            v5Var.a(LocaleController.getString(R.string.Fade), 0, qe0Var.H);
        } else if (i9 == qe0Var.f31907n) {
            v5Var.a(LocaleController.getString(R.string.SoftenSkin), 0, qe0Var.I);
        }
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.u5 u5Var;
        Context context = this.f31619c;
        if (i9 == 0) {
            org.telegram.ui.ActionBar.b6 b6Var = this.d.E0;
            ?? frameLayout = new FrameLayout(context);
            frameLayout.f25795e = new m.i3((Object) frameLayout, 5);
            TextView textView = new TextView(context);
            frameLayout.f25792a = textView;
            textView.setGravity(5);
            textView.setTextColor(-1);
            textView.setTextSize(1, 12.0f);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            frameLayout.addView(textView, g7.e6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            frameLayout.f25793b = textView2;
            org.telegram.messenger.ll.n(org.telegram.ui.ActionBar.f6.f23395zf, b6Var, textView2, 1, 12.0f);
            textView2.setGravity(5);
            textView2.setSingleLine(true);
            frameLayout.addView(textView2, g7.e6.d(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
            ?? view = new View(context);
            Paint paint = new Paint();
            view.f27724a = paint;
            Paint paint2 = new Paint(1);
            view.f27725b = paint2;
            view.f27726c = AndroidUtilities.dp(16.0f);
            view.d = 0;
            view.f27727e = 0.0f;
            view.f27728f = false;
            paint.setColor(-11711155);
            paint2.setColor(-1);
            frameLayout.f25794c = view;
            frameLayout.addView(view, g7.e6.d(-1, 40.0f, 19, 96.0f, 0.0f, 24.0f, 0.0f));
            frameLayout.setSeekBarDelegate(new wu(this, 10));
            u5Var = frameLayout;
        } else {
            org.telegram.ui.Cells.u5 u5Var2 = new org.telegram.ui.Cells.u5(context);
            u5Var2.setOnClickListener(new h70(this, 6));
            u5Var = u5Var2;
        }
        return new f2.q1(u5Var);
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class c8 extends s4.h0 {
    public final int f38369c;
    public final Object d;

    public c8(Object obj, int i10) {
        this.f38369c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f38369c) {
            case 0:
                return ((n8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).f25422f3.size();
            case 2:
                return ((org.telegram.ui.Components.d9) this.d).f27433f3.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((qp0) this.d).f42889f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f38369c) {
            case 0:
                n8 n8Var = (n8) this.d;
                return ((n8Var.I - (i10 / 12)) * 100) + (n8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) this.d;
                if (i10 >= d9Var.f27433f3.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.c9) d9Var.f27433f3.get(i10)).f27093a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f38369c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.d9) this.d).f27433f3.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.e1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c8.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        switch (this.f38369c) {
            case 0:
                return new s4.e1(new k8((n8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f25010a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f25011b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f25012c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, org.telegram.ui.Components.gb1.u(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false));
                linearLayout.addView(textView, org.telegram.ui.Components.gb1.x(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new s4.e1(linearLayout);
            case 2:
                org.telegram.ui.Components.d9 d9Var = (org.telegram.ui.Components.d9) this.d;
                return new s4.e1(new org.telegram.ui.Components.e9(d9Var.f27438k3, d9Var.getContext()));
            case 3:
                return new s4.e1(((org.telegram.ui.Components.cn) this.d).v);
            case 4:
                return new s4.e1(new bi.cc(this, ((org.telegram.ui.Components.ho) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(viewGroup.getContext(), null);
                z90Var.setGravity(17);
                z90Var.setTypeface(AndroidUtilities.bold());
                z90Var.setTextSize(1, 14.0f);
                z90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                z90Var.setEllipsize(TextUtils.TruncateAt.END);
                z90Var.setSingleLine();
                z90Var.setMaxLines(1);
                z90Var.setLayoutParams(new s4.q0(-2, AndroidUtilities.dp(28.0f)));
                org.telegram.ui.Components.gb1.c(z90Var, 0.075f, 1.4f);
                return new s4.e1(z90Var);
        }
    }

    private final void D(s4.e1 e1Var, int i10) {
    }

    private final void E(s4.e1 e1Var, int i10) {
    }
}

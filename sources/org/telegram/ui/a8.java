package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a8 extends s4.g0 {
    public final int f34073c;
    public final Object d;

    public a8(Object obj, int i10) {
        this.f34073c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f34073c) {
            case 0:
                return ((l8) this.d).K;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).V2.size();
            case 2:
                return ((org.telegram.ui.Components.e9) this.d).V2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((fq0) this.d).f36208f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f34073c) {
            case 0:
                l8 l8Var = (l8) this.d;
                return ((l8Var.I - (i10 / 12)) * 100) + (l8Var.J - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.d;
                if (i10 >= e9Var.V2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.d9) e9Var.V2.get(i10)).f24320a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f34073c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.e9) this.d).V2.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(s4.b1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a8.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        switch (this.f34073c) {
            case 0:
                return new s4.b1(new i8((l8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f21776a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f21777b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f21778c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, w7.a6.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
                linearLayout.addView(textView, w7.a6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new s4.b1(linearLayout);
            case 2:
                org.telegram.ui.Components.e9 e9Var = (org.telegram.ui.Components.e9) this.d;
                return new s4.b1(new org.telegram.ui.Components.f9(e9Var.f24630a3, e9Var.getContext()));
            case 3:
                return new s4.b1(((org.telegram.ui.Components.en) this.d).v);
            case 4:
                return new s4.b1(new di.ab(this, ((org.telegram.ui.Components.jo) this.d).getContext(), 15));
            default:
                org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(viewGroup.getContext(), null);
                da0Var.setGravity(17);
                da0Var.setTypeface(AndroidUtilities.bold());
                da0Var.setTextSize(1, 14.0f);
                da0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                da0Var.setEllipsize(TextUtils.TruncateAt.END);
                da0Var.setSingleLine();
                da0Var.setMaxLines(1);
                da0Var.setLayoutParams(new s4.o0(-2, AndroidUtilities.dp(28.0f)));
                w7.c6.b(da0Var, 0.075f, 1.4f);
                return new s4.b1(da0Var);
        }
    }

    private final void D(s4.b1 b1Var, int i10) {
    }

    private final void E(s4.b1 b1Var, int i10) {
    }
}

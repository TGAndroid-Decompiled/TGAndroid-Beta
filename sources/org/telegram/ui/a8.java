package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class a8 extends f2.o0 {
    public final int f32510c;
    public final Object d;

    public a8(Object obj, int i10) {
        this.f32510c = i10;
        this.d = obj;
    }

    @Override
    public final int h() {
        switch (this.f32510c) {
            case 0:
                return ((l8) this.d).H;
            case 1:
                return ((org.telegram.ui.Cells.t) this.d).U2.size();
            case 2:
                return ((org.telegram.ui.Components.t8) this.d).U2.size() + 1;
            case 3:
                return 1;
            case 4:
                return 1;
            default:
                return ((mp0) this.d).f36152f.size();
        }
    }

    @Override
    public long i(int i10) {
        switch (this.f32510c) {
            case 0:
                l8 l8Var = (l8) this.d;
                return ((l8Var.F - (i10 / 12)) * 100) + (l8Var.G - (i10 % 12));
            case 1:
            default:
                return super.i(i10);
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                if (i10 >= t8Var.U2.size()) {
                    return 1L;
                }
                return ((org.telegram.ui.Components.s8) t8Var.U2.get(i10)).f28690a;
        }
    }

    @Override
    public int j(int i10) {
        switch (this.f32510c) {
            case 2:
                if (i10 >= ((org.telegram.ui.Components.t8) this.d).U2.size()) {
                    return 1;
                }
                return 0;
            default:
                return super.j(i10);
        }
    }

    @Override
    public final void v(f2.l1 r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a8.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        switch (this.f32510c) {
            case 0:
                return new f2.l1(new i8((l8) this.d, viewGroup.getContext()));
            case 1:
                Context context = viewGroup.getContext();
                ?? linearLayout = new LinearLayout(context);
                Paint paint = new Paint(1);
                linearLayout.f21899a = paint;
                Paint paint2 = new Paint(1);
                linearLayout.f21900b = paint2;
                linearLayout.setOrientation(1);
                linearLayout.setWillNotDraw(false);
                org.telegram.ui.Cells.q qVar = new org.telegram.ui.Cells.q(context);
                linearLayout.f21901c = qVar;
                qVar.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                linearLayout.addView(qVar, k7.b6.q(58, 58, 1));
                TextView textView = new TextView(context);
                linearLayout.d = textView;
                textView.setSingleLine();
                textView.setTextSize(1, 13.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
                linearLayout.addView(textView, k7.b6.t(-2, -2, 1, 0, 4, 0, 0));
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(Math.max(2, AndroidUtilities.dp(0.5f)));
                paint2.setColor(-1);
                return new f2.l1(linearLayout);
            case 2:
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.d;
                return new f2.l1(new org.telegram.ui.Components.u8(t8Var.Z2, t8Var.getContext()));
            case 3:
                return new f2.l1(((org.telegram.ui.Components.nm) this.d).v);
            case 4:
                return new f2.l1(new eg.h0(this, ((org.telegram.ui.Components.qn) this.d).getContext(), 10));
            default:
                org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(viewGroup.getContext(), null);
                f90Var.setGravity(17);
                f90Var.setTypeface(AndroidUtilities.bold());
                f90Var.setTextSize(1, 14.0f);
                f90Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                f90Var.setEllipsize(TextUtils.TruncateAt.END);
                f90Var.setSingleLine();
                f90Var.setMaxLines(1);
                f90Var.setLayoutParams(new f2.w0(-2, AndroidUtilities.dp(28.0f)));
                k7.d6.b(f90Var, 0.075f, 1.4f);
                return new f2.l1(f90Var);
        }
    }

    private final void D(f2.l1 l1Var, int i10) {
    }

    private final void E(f2.l1 l1Var, int i10) {
    }
}

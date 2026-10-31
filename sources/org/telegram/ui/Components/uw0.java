package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class uw0 extends FrameLayout {
    public int f31067a;
    public final RectF f31068b;
    public boolean f31069c;
    public Boolean d;
    public final cx0 e;

    public uw0(cx0 cx0Var, Context context) {
        super(context);
        this.e = cx0Var;
        this.f31068b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        Paint paint;
        boolean z10;
        boolean z11;
        int min;
        cx0 cx0Var = this.e;
        int L = org.telegram.messenger.i0.L(6.0f) + (cx0Var.V1 - cx0Var.f21614s0);
        int L2 = (cx0Var.V1 - cx0Var.f21614s0) - org.telegram.messenger.i0.L(13.0f);
        int i11 = org.telegram.messenger.i0.f16020m;
        int i12 = L2 + i11;
        int i13 = L + i11;
        boolean z12 = false;
        if (this.f31069c) {
            int i14 = cx0Var.f21614s0;
            if (i12 + i14 < i11 * 2) {
                i12 -= Math.min(i11, ((i11 * 2) - i12) - i14);
                f7 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.i0.f16020m);
            } else {
                f7 = 1.0f;
            }
            int i15 = cx0Var.f21614s0;
            int i16 = i12 + i15;
            int i17 = org.telegram.messenger.i0.f16020m;
            if (i16 < i17) {
                i10 = Math.min(i17, (i17 - i12) - i15);
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
            f7 = 1.0f;
        }
        cx0Var.f21612r0.setBounds(0, i12, getMeasuredWidth(), getMeasuredHeight());
        cx0Var.f21612r0.draw(canvas);
        int i18 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        RectF rectF = this.f31068b;
        if (i18 != 0) {
            org.telegram.ui.ActionBar.t6.f21217t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, cx0Var.I0));
            rectF.set(cx0Var.f21615t0, cx0Var.f21614s0 + i12, getMeasuredWidth() - cx0Var.f21615t0, org.telegram.messenger.i0.L(24.0f) + cx0Var.f21614s0 + i12);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.f21217t0);
        }
        Typeface typeface = org.telegram.messenger.i0.f15999a;
        int L3 = org.telegram.messenger.i0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i13, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.i0.L(4.0f) + i13);
        org.telegram.ui.ActionBar.t6.f21217t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, cx0Var.I0));
        org.telegram.ui.ActionBar.t6.f21217t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i13 - org.telegram.messenger.i0.f16020m) / org.telegram.messenger.i0.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21217t0);
        if (i10 > org.telegram.messenger.i0.f16020m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, cx0Var.I0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, cx0Var.I0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.i0.r3(cx0Var.getWindow(), z11);
        }
        if (i10 > 0) {
            org.telegram.ui.ActionBar.t6.f21217t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, cx0Var.I0));
            canvas.drawRect(cx0Var.f21615t0, org.telegram.messenger.i0.f16020m - i10, getMeasuredWidth() - cx0Var.f21615t0, org.telegram.messenger.i0.f16020m, org.telegram.ui.ActionBar.t6.f21217t0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            cx0 cx0Var = this.e;
            if (cx0Var.V1 != 0 && motionEvent.getY() < cx0Var.V1) {
                cx0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f31067a;
        int i15 = i12 - i10;
        cx0 cx0Var = this.e;
        if (i14 != i15) {
            this.f31067a = i15;
            yw0 yw0Var = cx0Var.f25208k1;
            if (yw0Var != null && cx0Var.N1 != null) {
                yw0Var.f();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        cx0.I0(cx0Var);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i12;
        int max;
        int i13;
        int i14;
        int i15;
        float f7;
        int size = View.MeasureSpec.getSize(i11);
        cx0 cx0Var = this.e;
        ArrayList arrayList = cx0Var.O1;
        boolean z10 = true;
        cx0Var.X1 = true;
        int i16 = cx0Var.f21615t0;
        setPadding(i16, org.telegram.messenger.i0.f16020m, i16, 0);
        cx0Var.X1 = false;
        if (cx0Var.Q0()) {
            int measuredWidth = cx0Var.f25206j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.i0.f16026q.x;
            }
            yw0 yw0Var = cx0Var.f25208k1;
            if (org.telegram.messenger.i0.Q1()) {
                f7 = 60.0f;
            } else {
                f7 = 45.0f;
            }
            yw0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.i0.L(f7));
            int size2 = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(36.0f)) / cx0Var.f25208k1.d;
            cx0Var.F1 = size2;
            cx0Var.G1 = size2;
        } else {
            cx0Var.f25208k1.d = 5;
            cx0Var.F1 = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(36.0f)) / cx0Var.f25208k1.d;
            cx0Var.G1 = org.telegram.messenger.i0.L(82.0f);
        }
        float f10 = cx0Var.f25208k1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cx0Var.f25206j1.getLayoutParams();
        int i17 = 3;
        if (arrayList != null) {
            i14 = (Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * cx0Var.G1) + org.telegram.messenger.i0.L(48.0f) + marginLayoutParams.bottomMargin + cx0Var.f21614s0 + org.telegram.messenger.i0.f16020m;
        } else {
            if (cx0Var.N1 != null) {
                i13 = (cx0Var.f25208k1.f32815n * cx0Var.G1) + (cx0Var.N1.size() * org.telegram.messenger.i0.L(60.0f)) + org.telegram.messenger.i0.L(8.0f) + marginLayoutParams.bottomMargin + cx0Var.f21614s0;
                max = org.telegram.messenger.i0.L(24.0f);
            } else {
                int L = org.telegram.messenger.i0.L(48.0f) + marginLayoutParams.bottomMargin;
                if (cx0Var.Q0()) {
                    i17 = 2;
                }
                if (cx0Var.J1 != null) {
                    i12 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10);
                } else {
                    i12 = 0;
                }
                max = (Math.max(i17, i12) * cx0Var.G1) + L + cx0Var.f21614s0;
                i13 = org.telegram.messenger.i0.f16020m;
            }
            i14 = i13 + max;
        }
        if (cx0Var.Q0()) {
            i14 = (int) ((cx0Var.G1 * 0.15f) + i14);
        }
        float f11 = size / 5.0f;
        if (i14 < f11 * 3.2d) {
            i15 = 0;
        } else {
            i15 = (int) (f11 * 2.0f);
        }
        if (i15 != 0 && i14 < size) {
            i15 -= size - i14;
        }
        if (i15 == 0) {
            i15 = cx0Var.f21614s0;
        }
        if (cx0Var.N1 != null) {
            i15 += org.telegram.messenger.i0.L(8.0f);
        }
        if (cx0Var.f25206j1.getPaddingTop() != i15) {
            cx0Var.X1 = true;
            cx0Var.f25206j1.setPadding(org.telegram.messenger.i0.L(10.0f), i15, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(8.0f));
            cx0Var.B1.setPadding(0, i15, 0, 0);
            cx0Var.X1 = false;
        }
        if (i14 < size) {
            z10 = false;
        }
        this.f31069c = z10;
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(i14, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.e.X1) {
            return;
        }
        super.requestLayout();
    }
}

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
public final class vw0 extends FrameLayout {
    public int f31926a;
    public final RectF f31927b;
    public boolean f31928c;
    public Boolean d;
    public final dx0 e;

    public vw0(dx0 dx0Var, Context context) {
        super(context);
        this.e = dx0Var;
        this.f31927b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10;
        float f7;
        Paint paint;
        boolean z10;
        boolean z11;
        int min;
        dx0 dx0Var = this.e;
        int L = org.telegram.messenger.i0.L(6.0f) + (dx0Var.V1 - dx0Var.f21615s0);
        int L2 = (dx0Var.V1 - dx0Var.f21615s0) - org.telegram.messenger.i0.L(13.0f);
        int i11 = org.telegram.messenger.i0.f16166m;
        int i12 = L2 + i11;
        int i13 = L + i11;
        boolean z12 = false;
        if (this.f31928c) {
            int i14 = dx0Var.f21615s0;
            if (i12 + i14 < i11 * 2) {
                i12 -= Math.min(i11, ((i11 * 2) - i12) - i14);
                f7 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.i0.f16166m);
            } else {
                f7 = 1.0f;
            }
            int i15 = dx0Var.f21615s0;
            int i16 = i12 + i15;
            int i17 = org.telegram.messenger.i0.f16166m;
            if (i16 < i17) {
                i10 = Math.min(i17, (i17 - i12) - i15);
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
            f7 = 1.0f;
        }
        dx0Var.f21613r0.setBounds(0, i12, getMeasuredWidth(), getMeasuredHeight());
        dx0Var.f21613r0.draw(canvas);
        int i18 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        RectF rectF = this.f31927b;
        if (i18 != 0) {
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, dx0Var.I0));
            rectF.set(dx0Var.f21616t0, dx0Var.f21615s0 + i12, getMeasuredWidth() - dx0Var.f21616t0, org.telegram.messenger.i0.L(24.0f) + dx0Var.f21615s0 + i12);
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.messenger.i0.L(12.0f) * f7, org.telegram.ui.ActionBar.t6.f21218t0);
        }
        Typeface typeface = org.telegram.messenger.i0.f16145a;
        int L3 = org.telegram.messenger.i0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i13, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.i0.L(4.0f) + i13);
        org.telegram.ui.ActionBar.t6.f21218t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.wj, dx0Var.I0));
        org.telegram.ui.ActionBar.t6.f21218t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i13 - org.telegram.messenger.i0.f16166m) / org.telegram.messenger.i0.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.ui.ActionBar.t6.f21218t0);
        if (i10 > org.telegram.messenger.i0.f16166m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, dx0Var.I0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21207s8, dx0Var.I0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.i0.r3(dx0Var.getWindow(), z11);
        }
        if (i10 > 0) {
            org.telegram.ui.ActionBar.t6.f21218t0.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, dx0Var.I0));
            canvas.drawRect(dx0Var.f21616t0, org.telegram.messenger.i0.f16166m - i10, getMeasuredWidth() - dx0Var.f21616t0, org.telegram.messenger.i0.f16166m, org.telegram.ui.ActionBar.t6.f21218t0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            dx0 dx0Var = this.e;
            if (dx0Var.V1 != 0 && motionEvent.getY() < dx0Var.V1) {
                dx0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = this.f31926a;
        int i15 = i12 - i10;
        dx0 dx0Var = this.e;
        if (i14 != i15) {
            this.f31926a = i15;
            zw0 zw0Var = dx0Var.f25621k1;
            if (zw0Var != null && dx0Var.N1 != null) {
                zw0Var.f();
            }
        }
        super.onLayout(z10, i10, i11, i12, i13);
        dx0.I0(dx0Var);
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
        dx0 dx0Var = this.e;
        ArrayList arrayList = dx0Var.O1;
        boolean z10 = true;
        dx0Var.X1 = true;
        int i16 = dx0Var.f21616t0;
        setPadding(i16, org.telegram.messenger.i0.f16166m, i16, 0);
        dx0Var.X1 = false;
        if (dx0Var.Q0()) {
            int measuredWidth = dx0Var.f25619j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.i0.f16172q.x;
            }
            zw0 zw0Var = dx0Var.f25621k1;
            if (org.telegram.messenger.i0.Q1()) {
                f7 = 60.0f;
            } else {
                f7 = 45.0f;
            }
            zw0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.i0.L(f7));
            int size2 = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(36.0f)) / dx0Var.f25621k1.d;
            dx0Var.F1 = size2;
            dx0Var.G1 = size2;
        } else {
            dx0Var.f25621k1.d = 5;
            dx0Var.F1 = (View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(36.0f)) / dx0Var.f25621k1.d;
            dx0Var.G1 = org.telegram.messenger.i0.L(82.0f);
        }
        float f10 = dx0Var.f25621k1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dx0Var.f25619j1.getLayoutParams();
        int i17 = 3;
        if (arrayList != null) {
            i14 = (Math.max(3, (int) Math.ceil(arrayList.size() / f10)) * dx0Var.G1) + org.telegram.messenger.i0.L(48.0f) + marginLayoutParams.bottomMargin + dx0Var.f21615s0 + org.telegram.messenger.i0.f16166m;
        } else {
            if (dx0Var.N1 != null) {
                i13 = (dx0Var.f25621k1.f33244n * dx0Var.G1) + (dx0Var.N1.size() * org.telegram.messenger.i0.L(60.0f)) + org.telegram.messenger.i0.L(8.0f) + marginLayoutParams.bottomMargin + dx0Var.f21615s0;
                max = org.telegram.messenger.i0.L(24.0f);
            } else {
                int L = org.telegram.messenger.i0.L(48.0f) + marginLayoutParams.bottomMargin;
                if (dx0Var.Q0()) {
                    i17 = 2;
                }
                if (dx0Var.J1 != null) {
                    i12 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f10);
                } else {
                    i12 = 0;
                }
                max = (Math.max(i17, i12) * dx0Var.G1) + L + dx0Var.f21615s0;
                i13 = org.telegram.messenger.i0.f16166m;
            }
            i14 = i13 + max;
        }
        if (dx0Var.Q0()) {
            i14 = (int) ((dx0Var.G1 * 0.15f) + i14);
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
            i15 = dx0Var.f21615s0;
        }
        if (dx0Var.N1 != null) {
            i15 += org.telegram.messenger.i0.L(8.0f);
        }
        if (dx0Var.f25619j1.getPaddingTop() != i15) {
            dx0Var.X1 = true;
            dx0Var.f25619j1.setPadding(org.telegram.messenger.i0.L(10.0f), i15, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(8.0f));
            dx0Var.B1.setPadding(0, i15, 0, 0);
            dx0Var.X1 = false;
        }
        if (i14 < size) {
            z10 = false;
        }
        this.f31928c = z10;
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

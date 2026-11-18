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
public final class aw0 extends FrameLayout {
    public int f33474a;
    public final RectF f33475b;
    public boolean f33476c;
    public Boolean d;
    public final iw0 f33477e;

    public aw0(iw0 iw0Var, Context context) {
        super(context);
        this.f33477e = iw0Var;
        this.f33475b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        Paint paint;
        boolean z10;
        boolean z11;
        int min;
        iw0 iw0Var = this.f33477e;
        int L = org.telegram.messenger.g0.L(6.0f) + (iw0Var.Z1 - iw0Var.f30226t0);
        int L2 = (iw0Var.Z1 - iw0Var.f30226t0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.f24115m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        boolean z12 = false;
        if (this.f33476c) {
            int i13 = iw0Var.f30226t0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f24115m);
            } else {
                f10 = 1.0f;
            }
            int i14 = iw0Var.f30226t0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.f24115m;
            if (i15 < i16) {
                i7 = Math.min(i16, (i16 - i11) - i14);
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        iw0Var.f30225s0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        iw0Var.f30225s0.draw(canvas);
        int i17 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        RectF rectF = this.f33475b;
        if (i17 != 0) {
            org.telegram.ui.ActionBar.n6.f29687t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, iw0Var.J0));
            rectF.set(iw0Var.f30227u0, iw0Var.f30226t0 + i11, getMeasuredWidth() - iw0Var.f30227u0, org.telegram.messenger.g0.L(24.0f) + iw0Var.f30226t0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.n6.f29687t0);
        }
        Typeface typeface = org.telegram.messenger.g0.f24093a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.n6.f29687t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, iw0Var.J0));
        org.telegram.ui.ActionBar.n6.f29687t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.f24115m) / org.telegram.messenger.g0.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29687t0);
        if (i7 > org.telegram.messenger.g0.f24115m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, iw0Var.J0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29676s8, iw0Var.J0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.r3(iw0Var.getWindow(), z11);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.n6.f29687t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, iw0Var.J0));
            canvas.drawRect(iw0Var.f30227u0, org.telegram.messenger.g0.f24115m - i7, getMeasuredWidth() - iw0Var.f30227u0, org.telegram.messenger.g0.f24115m, org.telegram.ui.ActionBar.n6.f29687t0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            iw0 iw0Var = this.f33477e;
            if (iw0Var.Z1 != 0 && motionEvent.getY() < iw0Var.Z1) {
                iw0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = this.f33474a;
        int i14 = i11 - i7;
        iw0 iw0Var = this.f33477e;
        if (i13 != i14) {
            this.f33474a = i14;
            ew0 ew0Var = iw0Var.f36247o1;
            if (ew0Var != null && iw0Var.R1 != null) {
                ew0Var.f();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
        iw0.J0(iw0Var);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i11;
        int max;
        int i12;
        int i13;
        int i14;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        iw0 iw0Var = this.f33477e;
        ArrayList arrayList = iw0Var.S1;
        boolean z10 = true;
        iw0Var.f36234b2 = true;
        int i15 = iw0Var.f30227u0;
        setPadding(i15, org.telegram.messenger.g0.f24115m, i15, 0);
        iw0Var.f36234b2 = false;
        if (iw0Var.R0()) {
            int measuredWidth = iw0Var.n1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f24121q.x;
            }
            ew0 ew0Var = iw0Var.f36247o1;
            if (org.telegram.messenger.g0.Q1()) {
                f10 = 60.0f;
            } else {
                f10 = 45.0f;
            }
            ew0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            int size2 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / iw0Var.f36247o1.d;
            iw0Var.J1 = size2;
            iw0Var.K1 = size2;
        } else {
            iw0Var.f36247o1.d = 5;
            iw0Var.J1 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / iw0Var.f36247o1.d;
            iw0Var.K1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f11 = iw0Var.f36247o1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iw0Var.n1.getLayoutParams();
        int i16 = 3;
        if (arrayList != null) {
            i13 = (Math.max(3, (int) Math.ceil(arrayList.size() / f11)) * iw0Var.K1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + iw0Var.f30226t0 + org.telegram.messenger.g0.f24115m;
        } else {
            if (iw0Var.R1 != null) {
                i12 = (iw0Var.f36247o1.f34814n * iw0Var.K1) + (iw0Var.R1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + iw0Var.f30226t0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                int L = org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin;
                if (iw0Var.R0()) {
                    i16 = 2;
                }
                if (iw0Var.N1 != null) {
                    i11 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f11);
                } else {
                    i11 = 0;
                }
                max = (Math.max(i16, i11) * iw0Var.K1) + L + iw0Var.f30226t0;
                i12 = org.telegram.messenger.g0.f24115m;
            }
            i13 = i12 + max;
        }
        if (iw0Var.R0()) {
            i13 = (int) ((iw0Var.K1 * 0.15f) + i13);
        }
        float f12 = size / 5.0f;
        if (i13 < f12 * 3.2d) {
            i14 = 0;
        } else {
            i14 = (int) (f12 * 2.0f);
        }
        if (i14 != 0 && i13 < size) {
            i14 -= size - i13;
        }
        if (i14 == 0) {
            i14 = iw0Var.f30226t0;
        }
        if (iw0Var.R1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (iw0Var.n1.getPaddingTop() != i14) {
            iw0Var.f36234b2 = true;
            iw0Var.n1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            iw0Var.F1.setPadding(0, i14, 0, 0);
            iw0Var.f36234b2 = false;
        }
        if (i13 < size) {
            z10 = false;
        }
        this.f33476c = z10;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(i13, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33477e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f33477e.f36234b2) {
            return;
        }
        super.requestLayout();
    }
}

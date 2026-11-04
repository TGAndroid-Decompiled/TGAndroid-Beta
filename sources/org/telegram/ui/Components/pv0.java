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
public final class pv0 extends FrameLayout {
    public int f37257a;
    public final RectF f37258b;
    public boolean f37259c;
    public Boolean d;
    public final xv0 f37260e;

    public pv0(xv0 xv0Var, Context context) {
        super(context);
        this.f37260e = xv0Var;
        this.f37258b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3;
        float f10;
        Paint paint;
        boolean z10;
        boolean z11;
        int min;
        xv0 xv0Var = this.f37260e;
        int L = org.telegram.messenger.g0.L(6.0f) + (xv0Var.W1 - xv0Var.f28617t0);
        int L2 = (xv0Var.W1 - xv0Var.f28617t0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.f22602m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        boolean z12 = false;
        if (this.f37259c) {
            int i13 = xv0Var.f28617t0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22602m);
            } else {
                f10 = 1.0f;
            }
            int i14 = xv0Var.f28617t0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.f22602m;
            if (i15 < i16) {
                i3 = Math.min(i16, (i16 - i11) - i14);
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
            f10 = 1.0f;
        }
        xv0Var.f28616s0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        xv0Var.f28616s0.draw(canvas);
        int i17 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        RectF rectF = this.f37258b;
        if (i17 != 0) {
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, xv0Var.J0));
            rectF.set(xv0Var.f28618u0, xv0Var.f28617t0 + i11, getMeasuredWidth() - xv0Var.f28618u0, org.telegram.messenger.g0.L(24.0f) + xv0Var.f28617t0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28171t0);
        }
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, xv0Var.J0));
        org.telegram.ui.ActionBar.k6.f28171t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.f22602m) / org.telegram.messenger.g0.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28171t0);
        if (i3 > org.telegram.messenger.g0.f22602m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, xv0Var.J0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, xv0Var.J0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(xv0Var.getWindow(), z11);
        }
        if (i3 > 0) {
            org.telegram.ui.ActionBar.k6.f28171t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, xv0Var.J0));
            canvas.drawRect(xv0Var.f28618u0, org.telegram.messenger.g0.f22602m - i3, getMeasuredWidth() - xv0Var.f28618u0, org.telegram.messenger.g0.f22602m, org.telegram.ui.ActionBar.k6.f28171t0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            xv0 xv0Var = this.f37260e;
            if (xv0Var.W1 != 0 && motionEvent.getY() < xv0Var.W1) {
                xv0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        int i13 = this.f37257a;
        int i14 = i11 - i3;
        xv0 xv0Var = this.f37260e;
        if (i13 != i14) {
            this.f37257a = i14;
            tv0 tv0Var = xv0Var.f40517l1;
            if (tv0Var != null && xv0Var.O1 != null) {
                tv0Var.f();
            }
        }
        super.onLayout(z10, i3, i10, i11, i12);
        xv0.I0(xv0Var);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        int i11;
        int max;
        int i12;
        int i13;
        int i14;
        float f10;
        int size = View.MeasureSpec.getSize(i10);
        xv0 xv0Var = this.f37260e;
        ArrayList arrayList = xv0Var.P1;
        boolean z10 = true;
        xv0Var.Y1 = true;
        int i15 = xv0Var.f28618u0;
        setPadding(i15, org.telegram.messenger.g0.f22602m, i15, 0);
        xv0Var.Y1 = false;
        if (xv0Var.Q0()) {
            int measuredWidth = xv0Var.k1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f22608q.x;
            }
            tv0 tv0Var = xv0Var.f40517l1;
            if (org.telegram.messenger.g0.Q1()) {
                f10 = 60.0f;
            } else {
                f10 = 45.0f;
            }
            tv0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            int size2 = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(36.0f)) / xv0Var.f40517l1.d;
            xv0Var.G1 = size2;
            xv0Var.H1 = size2;
        } else {
            xv0Var.f40517l1.d = 5;
            xv0Var.G1 = (View.MeasureSpec.getSize(i3) - org.telegram.messenger.g0.L(36.0f)) / xv0Var.f40517l1.d;
            xv0Var.H1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f11 = xv0Var.f40517l1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xv0Var.k1.getLayoutParams();
        int i16 = 3;
        if (arrayList != null) {
            i13 = (Math.max(3, (int) Math.ceil(arrayList.size() / f11)) * xv0Var.H1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + xv0Var.f28617t0 + org.telegram.messenger.g0.f22602m;
        } else {
            if (xv0Var.O1 != null) {
                i12 = (xv0Var.f40517l1.f38563n * xv0Var.H1) + (xv0Var.O1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + xv0Var.f28617t0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                int L = org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin;
                if (xv0Var.Q0()) {
                    i16 = 2;
                }
                if (xv0Var.K1 != null) {
                    i11 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f11);
                } else {
                    i11 = 0;
                }
                max = (Math.max(i16, i11) * xv0Var.H1) + L + xv0Var.f28617t0;
                i12 = org.telegram.messenger.g0.f22602m;
            }
            i13 = i12 + max;
        }
        if (xv0Var.Q0()) {
            i13 = (int) ((xv0Var.H1 * 0.15f) + i13);
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
            i14 = xv0Var.f28617t0;
        }
        if (xv0Var.O1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (xv0Var.k1.getPaddingTop() != i14) {
            xv0Var.Y1 = true;
            xv0Var.k1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            xv0Var.C1.setPadding(0, i14, 0, 0);
            xv0Var.Y1 = false;
        }
        if (i13 < size) {
            z10 = false;
        }
        this.f37259c = z10;
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.min(i13, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37260e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37260e.Y1) {
            return;
        }
        super.requestLayout();
    }
}

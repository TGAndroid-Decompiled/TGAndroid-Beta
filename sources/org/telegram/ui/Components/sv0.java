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
public final class sv0 extends FrameLayout {
    public int f39439a;
    public final RectF f39440b;
    public boolean f39441c;
    public Boolean d;
    public final bw0 f39442e;

    public sv0(bw0 bw0Var, Context context) {
        super(context);
        this.f39442e = bw0Var;
        this.f39440b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        Paint paint;
        boolean z10;
        boolean z11;
        int min;
        bw0 bw0Var = this.f39442e;
        int L = org.telegram.messenger.g0.L(6.0f) + (bw0Var.Z1 - bw0Var.f29716t0);
        int L2 = (bw0Var.Z1 - bw0Var.f29716t0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.f23603m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        boolean z12 = false;
        if (this.f39441c) {
            int i13 = bw0Var.f29716t0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f23603m);
            } else {
                f10 = 1.0f;
            }
            int i14 = bw0Var.f29716t0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.f23603m;
            if (i15 < i16) {
                i7 = Math.min(i16, (i16 - i11) - i14);
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        bw0Var.f29715s0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        bw0Var.f29715s0.draw(canvas);
        int i17 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        RectF rectF = this.f39440b;
        if (i17 != 0) {
            org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, bw0Var.J0));
            rectF.set(bw0Var.f29717u0, bw0Var.f29716t0 + i11, getMeasuredWidth() - bw0Var.f29717u0, org.telegram.messenger.g0.L(24.0f) + bw0Var.f29716t0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.j6.f29140t0);
        }
        Typeface typeface = org.telegram.messenger.g0.f23581a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.zj, bw0Var.J0));
        org.telegram.ui.ActionBar.j6.f29140t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.f23603m) / org.telegram.messenger.g0.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.j6.f29140t0);
        if (i7 > org.telegram.messenger.g0.f23603m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, bw0Var.J0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, bw0Var.J0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.s3(bw0Var.getWindow(), z11);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.j6.f29140t0.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, bw0Var.J0));
            canvas.drawRect(bw0Var.f29717u0, org.telegram.messenger.g0.f23603m - i7, getMeasuredWidth() - bw0Var.f29717u0, org.telegram.messenger.g0.f23603m, org.telegram.ui.ActionBar.j6.f29140t0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            bw0 bw0Var = this.f39442e;
            if (bw0Var.Z1 != 0 && motionEvent.getY() < bw0Var.Z1) {
                bw0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = this.f39439a;
        int i14 = i11 - i7;
        bw0 bw0Var = this.f39442e;
        if (i13 != i14) {
            this.f39439a = i14;
            xv0 xv0Var = bw0Var.f33410o1;
            if (xv0Var != null && bw0Var.R1 != null) {
                xv0Var.f();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
        bw0.I0(bw0Var);
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
        bw0 bw0Var = this.f39442e;
        ArrayList arrayList = bw0Var.S1;
        boolean z10 = true;
        bw0Var.f33397b2 = true;
        int i15 = bw0Var.f29717u0;
        setPadding(i15, org.telegram.messenger.g0.f23603m, i15, 0);
        bw0Var.f33397b2 = false;
        if (bw0Var.Q0()) {
            int measuredWidth = bw0Var.n1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f23609q.x;
            }
            xv0 xv0Var = bw0Var.f33410o1;
            if (org.telegram.messenger.g0.Q1()) {
                f10 = 60.0f;
            } else {
                f10 = 45.0f;
            }
            xv0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            int size2 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / bw0Var.f33410o1.d;
            bw0Var.J1 = size2;
            bw0Var.K1 = size2;
        } else {
            bw0Var.f33410o1.d = 5;
            bw0Var.J1 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / bw0Var.f33410o1.d;
            bw0Var.K1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f11 = bw0Var.f33410o1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bw0Var.n1.getLayoutParams();
        int i16 = 3;
        if (arrayList != null) {
            i13 = (Math.max(3, (int) Math.ceil(arrayList.size() / f11)) * bw0Var.K1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + bw0Var.f29716t0 + org.telegram.messenger.g0.f23603m;
        } else {
            if (bw0Var.R1 != null) {
                i12 = (bw0Var.f33410o1.f41774n * bw0Var.K1) + (bw0Var.R1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + bw0Var.f29716t0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                int L = org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin;
                if (bw0Var.Q0()) {
                    i16 = 2;
                }
                if (bw0Var.N1 != null) {
                    i11 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f11);
                } else {
                    i11 = 0;
                }
                max = (Math.max(i16, i11) * bw0Var.K1) + L + bw0Var.f29716t0;
                i12 = org.telegram.messenger.g0.f23603m;
            }
            i13 = i12 + max;
        }
        if (bw0Var.Q0()) {
            i13 = (int) ((bw0Var.K1 * 0.15f) + i13);
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
            i14 = bw0Var.f29716t0;
        }
        if (bw0Var.R1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (bw0Var.n1.getPaddingTop() != i14) {
            bw0Var.f33397b2 = true;
            bw0Var.n1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            bw0Var.F1.setPadding(0, i14, 0, 0);
            bw0Var.f33397b2 = false;
        }
        if (i13 < size) {
            z10 = false;
        }
        this.f39441c = z10;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(i13, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f39442e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f39442e.f33397b2) {
            return;
        }
        super.requestLayout();
    }
}

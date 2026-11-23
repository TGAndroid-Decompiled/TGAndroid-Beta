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
public final class bw0 extends FrameLayout {
    public int f33830a;
    public final RectF f33831b;
    public boolean f33832c;
    public Boolean d;
    public final jw0 f33833e;

    public bw0(jw0 jw0Var, Context context) {
        super(context);
        this.f33833e = jw0Var;
        this.f33831b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        Paint paint;
        boolean z10;
        boolean z11;
        int min;
        jw0 jw0Var = this.f33833e;
        int L = org.telegram.messenger.g0.L(6.0f) + (jw0Var.Z1 - jw0Var.f30260t0);
        int L2 = (jw0Var.Z1 - jw0Var.f30260t0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.f24220m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        boolean z12 = false;
        if (this.f33832c) {
            int i13 = jw0Var.f30260t0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f24220m);
            } else {
                f10 = 1.0f;
            }
            int i14 = jw0Var.f30260t0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.f24220m;
            if (i15 < i16) {
                i7 = Math.min(i16, (i16 - i11) - i14);
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        jw0Var.f30259s0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        jw0Var.f30259s0.draw(canvas);
        int i17 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        RectF rectF = this.f33831b;
        if (i17 != 0) {
            org.telegram.ui.ActionBar.n6.f29742t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, jw0Var.J0));
            rectF.set(jw0Var.f30261u0, jw0Var.f30260t0 + i11, getMeasuredWidth() - jw0Var.f30261u0, org.telegram.messenger.g0.L(24.0f) + jw0Var.f30260t0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.n6.f29742t0);
        }
        Typeface typeface = org.telegram.messenger.g0.f24198a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.n6.f29742t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.zj, jw0Var.J0));
        org.telegram.ui.ActionBar.n6.f29742t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.f24220m) / org.telegram.messenger.g0.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.n6.f29742t0);
        if (i7 > org.telegram.messenger.g0.f24220m / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z10) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, jw0Var.J0)) > 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29731s8, jw0Var.J0), 855638016)) > 0.721f) {
                z12 = true;
            }
            this.d = Boolean.valueOf(z10);
            if (!z10) {
                z11 = z12;
            }
            org.telegram.messenger.g0.r3(jw0Var.getWindow(), z11);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.n6.f29742t0.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29524h5, jw0Var.J0));
            canvas.drawRect(jw0Var.f30261u0, org.telegram.messenger.g0.f24220m - i7, getMeasuredWidth() - jw0Var.f30261u0, org.telegram.messenger.g0.f24220m, org.telegram.ui.ActionBar.n6.f29742t0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            jw0 jw0Var = this.f33833e;
            if (jw0Var.Z1 != 0 && motionEvent.getY() < jw0Var.Z1) {
                jw0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13 = this.f33830a;
        int i14 = i11 - i7;
        jw0 jw0Var = this.f33833e;
        if (i13 != i14) {
            this.f33830a = i14;
            fw0 fw0Var = jw0Var.f36541o1;
            if (fw0Var != null && jw0Var.R1 != null) {
                fw0Var.f();
            }
        }
        super.onLayout(z10, i7, i10, i11, i12);
        jw0.J0(jw0Var);
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
        jw0 jw0Var = this.f33833e;
        ArrayList arrayList = jw0Var.S1;
        boolean z10 = true;
        jw0Var.f36528b2 = true;
        int i15 = jw0Var.f30261u0;
        setPadding(i15, org.telegram.messenger.g0.f24220m, i15, 0);
        jw0Var.f36528b2 = false;
        if (jw0Var.R0()) {
            int measuredWidth = jw0Var.n1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f24226q.x;
            }
            fw0 fw0Var = jw0Var.f36541o1;
            if (org.telegram.messenger.g0.Q1()) {
                f10 = 60.0f;
            } else {
                f10 = 45.0f;
            }
            fw0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            int size2 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / jw0Var.f36541o1.d;
            jw0Var.J1 = size2;
            jw0Var.K1 = size2;
        } else {
            jw0Var.f36541o1.d = 5;
            jw0Var.J1 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / jw0Var.f36541o1.d;
            jw0Var.K1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f11 = jw0Var.f36541o1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jw0Var.n1.getLayoutParams();
        int i16 = 3;
        if (arrayList != null) {
            i13 = (Math.max(3, (int) Math.ceil(arrayList.size() / f11)) * jw0Var.K1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + jw0Var.f30260t0 + org.telegram.messenger.g0.f24220m;
        } else {
            if (jw0Var.R1 != null) {
                i12 = (jw0Var.f36541o1.f35214n * jw0Var.K1) + (jw0Var.R1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + jw0Var.f30260t0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                int L = org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin;
                if (jw0Var.R0()) {
                    i16 = 2;
                }
                if (jw0Var.N1 != null) {
                    i11 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f11);
                } else {
                    i11 = 0;
                }
                max = (Math.max(i16, i11) * jw0Var.K1) + L + jw0Var.f30260t0;
                i12 = org.telegram.messenger.g0.f24220m;
            }
            i13 = i12 + max;
        }
        if (jw0Var.R0()) {
            i13 = (int) ((jw0Var.K1 * 0.15f) + i13);
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
            i14 = jw0Var.f30260t0;
        }
        if (jw0Var.R1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (jw0Var.n1.getPaddingTop() != i14) {
            jw0Var.f36528b2 = true;
            jw0Var.n1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            jw0Var.F1.setPadding(0, i14, 0, 0);
            jw0Var.f36528b2 = false;
        }
        if (i13 < size) {
            z10 = false;
        }
        this.f33832c = z10;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(i13, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f33833e.J && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f33833e.f36528b2) {
            return;
        }
        super.requestLayout();
    }
}

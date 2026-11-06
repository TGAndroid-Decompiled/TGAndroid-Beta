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
public final class qv0 extends FrameLayout {
    public int f37523a;
    public final RectF f37524b;
    public boolean f37525c;
    public Boolean d;
    public final yv0 f37526e;

    public qv0(yv0 yv0Var, Context context) {
        super(context);
        this.f37526e = yv0Var;
        this.f37524b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        Paint paint;
        boolean z9;
        boolean z10;
        int min;
        yv0 yv0Var = this.f37526e;
        int L = org.telegram.messenger.g0.L(6.0f) + (yv0Var.V1 - yv0Var.f28644s0);
        int L2 = (yv0Var.V1 - yv0Var.f28644s0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.f22531m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        boolean z11 = false;
        if (this.f37525c) {
            int i13 = yv0Var.f28644s0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22531m);
            } else {
                f10 = 1.0f;
            }
            int i14 = yv0Var.f28644s0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.f22531m;
            if (i15 < i16) {
                i7 = Math.min(i16, (i16 - i11) - i14);
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        yv0Var.f28642r0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        yv0Var.f28642r0.draw(canvas);
        int i17 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        RectF rectF = this.f37524b;
        if (i17 != 0) {
            org.telegram.ui.ActionBar.k6.f28139t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, yv0Var.I0));
            rectF.set(yv0Var.f28645t0, yv0Var.f28644s0 + i11, getMeasuredWidth() - yv0Var.f28645t0, org.telegram.messenger.g0.L(24.0f) + yv0Var.f28644s0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.k6.f28139t0);
        }
        Typeface typeface = org.telegram.messenger.g0.f22509a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.k6.f28139t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.wj, yv0Var.I0));
        org.telegram.ui.ActionBar.k6.f28139t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.f22531m) / org.telegram.messenger.g0.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.f28139t0);
        if (i7 > org.telegram.messenger.g0.f22531m / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z9) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, yv0Var.I0)) > 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28128s8, yv0Var.I0), 855638016)) > 0.721f) {
                z11 = true;
            }
            this.d = Boolean.valueOf(z9);
            if (!z9) {
                z10 = z11;
            }
            org.telegram.messenger.g0.s3(yv0Var.getWindow(), z10);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.k6.f28139t0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, yv0Var.I0));
            canvas.drawRect(yv0Var.f28645t0, org.telegram.messenger.g0.f22531m - i7, getMeasuredWidth() - yv0Var.f28645t0, org.telegram.messenger.g0.f22531m, org.telegram.ui.ActionBar.k6.f28139t0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            yv0 yv0Var = this.f37526e;
            if (yv0Var.V1 != 0 && motionEvent.getY() < yv0Var.V1) {
                yv0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = this.f37523a;
        int i14 = i11 - i7;
        yv0 yv0Var = this.f37526e;
        if (i13 != i14) {
            this.f37523a = i14;
            uv0 uv0Var = yv0Var.f40732k1;
            if (uv0Var != null && yv0Var.N1 != null) {
                uv0Var.f();
            }
        }
        super.onLayout(z9, i7, i10, i11, i12);
        yv0.I0(yv0Var);
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
        yv0 yv0Var = this.f37526e;
        ArrayList arrayList = yv0Var.O1;
        boolean z9 = true;
        yv0Var.X1 = true;
        int i15 = yv0Var.f28645t0;
        setPadding(i15, org.telegram.messenger.g0.f22531m, i15, 0);
        yv0Var.X1 = false;
        if (yv0Var.Q0()) {
            int measuredWidth = yv0Var.f40730j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f22537q.x;
            }
            uv0 uv0Var = yv0Var.f40732k1;
            if (org.telegram.messenger.g0.Q1()) {
                f10 = 60.0f;
            } else {
                f10 = 45.0f;
            }
            uv0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            int size2 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / yv0Var.f40732k1.d;
            yv0Var.F1 = size2;
            yv0Var.G1 = size2;
        } else {
            yv0Var.f40732k1.d = 5;
            yv0Var.F1 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / yv0Var.f40732k1.d;
            yv0Var.G1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f11 = yv0Var.f40732k1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) yv0Var.f40730j1.getLayoutParams();
        int i16 = 3;
        if (arrayList != null) {
            i13 = (Math.max(3, (int) Math.ceil(arrayList.size() / f11)) * yv0Var.G1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + yv0Var.f28644s0 + org.telegram.messenger.g0.f22531m;
        } else {
            if (yv0Var.N1 != null) {
                i12 = (yv0Var.f40732k1.f38743n * yv0Var.G1) + (yv0Var.N1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + yv0Var.f28644s0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                int L = org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin;
                if (yv0Var.Q0()) {
                    i16 = 2;
                }
                if (yv0Var.J1 != null) {
                    i11 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f11);
                } else {
                    i11 = 0;
                }
                max = (Math.max(i16, i11) * yv0Var.G1) + L + yv0Var.f28644s0;
                i12 = org.telegram.messenger.g0.f22531m;
            }
            i13 = i12 + max;
        }
        if (yv0Var.Q0()) {
            i13 = (int) ((yv0Var.G1 * 0.15f) + i13);
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
            i14 = yv0Var.f28644s0;
        }
        if (yv0Var.N1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (yv0Var.f40730j1.getPaddingTop() != i14) {
            yv0Var.X1 = true;
            yv0Var.f40730j1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            yv0Var.B1.setPadding(0, i14, 0, 0);
            yv0Var.X1 = false;
        }
        if (i13 < size) {
            z9 = false;
        }
        this.f37525c = z9;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(i13, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37526e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37526e.X1) {
            return;
        }
        super.requestLayout();
    }
}

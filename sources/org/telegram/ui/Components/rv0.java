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
public final class rv0 extends FrameLayout {
    public int f37823a;
    public final RectF f37824b;
    public boolean f37825c;
    public Boolean d;
    public final zv0 f37826e;

    public rv0(zv0 zv0Var, Context context) {
        super(context);
        this.f37826e = zv0Var;
        this.f37824b = new RectF();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7;
        float f10;
        Paint paint;
        boolean z9;
        boolean z10;
        int min;
        zv0 zv0Var = this.f37826e;
        int L = org.telegram.messenger.g0.L(6.0f) + (zv0Var.V1 - zv0Var.f28653s0);
        int L2 = (zv0Var.V1 - zv0Var.f28653s0) - org.telegram.messenger.g0.L(13.0f);
        int i10 = org.telegram.messenger.g0.f22557m;
        int i11 = L2 + i10;
        int i12 = L + i10;
        boolean z11 = false;
        if (this.f37825c) {
            int i13 = zv0Var.f28653s0;
            if (i11 + i13 < i10 * 2) {
                i11 -= Math.min(i10, ((i10 * 2) - i11) - i13);
                f10 = 1.0f - Math.min(1.0f, (min * 2) / org.telegram.messenger.g0.f22557m);
            } else {
                f10 = 1.0f;
            }
            int i14 = zv0Var.f28653s0;
            int i15 = i11 + i14;
            int i16 = org.telegram.messenger.g0.f22557m;
            if (i15 < i16) {
                i7 = Math.min(i16, (i16 - i11) - i14);
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
            f10 = 1.0f;
        }
        zv0Var.f28651r0.setBounds(0, i11, getMeasuredWidth(), getMeasuredHeight());
        zv0Var.f28651r0.draw(canvas);
        int i17 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        RectF rectF = this.f37824b;
        if (i17 != 0) {
            org.telegram.ui.ActionBar.l6.f28156t0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, zv0Var.I0));
            rectF.set(zv0Var.f28654t0, zv0Var.f28653s0 + i11, getMeasuredWidth() - zv0Var.f28654t0, org.telegram.messenger.g0.L(24.0f) + zv0Var.f28653s0 + i11);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.messenger.g0.L(12.0f) * f10, org.telegram.ui.ActionBar.l6.f28156t0);
        }
        Typeface typeface = org.telegram.messenger.g0.f22535a;
        int L3 = org.telegram.messenger.g0.L(36.0f);
        rectF.set((getMeasuredWidth() - L3) / 2, i12, (getMeasuredWidth() + L3) / 2, org.telegram.messenger.g0.L(4.0f) + i12);
        org.telegram.ui.ActionBar.l6.f28156t0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.wj, zv0Var.I0));
        org.telegram.ui.ActionBar.l6.f28156t0.setAlpha((int) (Math.max(0.0f, Math.min(1.0f, (i12 - org.telegram.messenger.g0.f22557m) / org.telegram.messenger.g0.L(16.0f))) * paint.getAlpha()));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.l6.f28156t0);
        if (i7 > org.telegram.messenger.g0.f22557m / 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        Boolean bool = this.d;
        if (bool == null || bool.booleanValue() != z9) {
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, zv0Var.I0)) > 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28145s8, zv0Var.I0), 855638016)) > 0.721f) {
                z11 = true;
            }
            this.d = Boolean.valueOf(z9);
            if (!z9) {
                z10 = z11;
            }
            org.telegram.messenger.g0.s3(zv0Var.getWindow(), z10);
        }
        if (i7 > 0) {
            org.telegram.ui.ActionBar.l6.f28156t0.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27938h5, zv0Var.I0));
            canvas.drawRect(zv0Var.f28654t0, org.telegram.messenger.g0.f22557m - i7, getMeasuredWidth() - zv0Var.f28654t0, org.telegram.messenger.g0.f22557m, org.telegram.ui.ActionBar.l6.f28156t0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            zv0 zv0Var = this.f37826e;
            if (zv0Var.V1 != 0 && motionEvent.getY() < zv0Var.V1) {
                zv0Var.dismiss();
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13 = this.f37823a;
        int i14 = i11 - i7;
        zv0 zv0Var = this.f37826e;
        if (i13 != i14) {
            this.f37823a = i14;
            vv0 vv0Var = zv0Var.f41155k1;
            if (vv0Var != null && zv0Var.N1 != null) {
                vv0Var.f();
            }
        }
        super.onLayout(z9, i7, i10, i11, i12);
        zv0.I0(zv0Var);
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
        zv0 zv0Var = this.f37826e;
        ArrayList arrayList = zv0Var.O1;
        boolean z9 = true;
        zv0Var.X1 = true;
        int i15 = zv0Var.f28654t0;
        setPadding(i15, org.telegram.messenger.g0.f22557m, i15, 0);
        zv0Var.X1 = false;
        if (zv0Var.Q0()) {
            int measuredWidth = zv0Var.f41153j1.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = org.telegram.messenger.g0.f22563q.x;
            }
            vv0 vv0Var = zv0Var.f41155k1;
            if (org.telegram.messenger.g0.Q1()) {
                f10 = 60.0f;
            } else {
                f10 = 45.0f;
            }
            vv0Var.d = Math.max(1, measuredWidth / org.telegram.messenger.g0.L(f10));
            int size2 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / zv0Var.f41155k1.d;
            zv0Var.F1 = size2;
            zv0Var.G1 = size2;
        } else {
            zv0Var.f41155k1.d = 5;
            zv0Var.F1 = (View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(36.0f)) / zv0Var.f41155k1.d;
            zv0Var.G1 = org.telegram.messenger.g0.L(82.0f);
        }
        float f11 = zv0Var.f41155k1.d;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zv0Var.f41153j1.getLayoutParams();
        int i16 = 3;
        if (arrayList != null) {
            i13 = (Math.max(3, (int) Math.ceil(arrayList.size() / f11)) * zv0Var.G1) + org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin + zv0Var.f28653s0 + org.telegram.messenger.g0.f22557m;
        } else {
            if (zv0Var.N1 != null) {
                i12 = (zv0Var.f41155k1.f39815n * zv0Var.G1) + (zv0Var.N1.size() * org.telegram.messenger.g0.L(60.0f)) + org.telegram.messenger.g0.L(8.0f) + marginLayoutParams.bottomMargin + zv0Var.f28653s0;
                max = org.telegram.messenger.g0.L(24.0f);
            } else {
                int L = org.telegram.messenger.g0.L(48.0f) + marginLayoutParams.bottomMargin;
                if (zv0Var.Q0()) {
                    i16 = 2;
                }
                if (zv0Var.J1 != null) {
                    i11 = (int) Math.ceil(tL_messages_stickerSet.documents.size() / f11);
                } else {
                    i11 = 0;
                }
                max = (Math.max(i16, i11) * zv0Var.G1) + L + zv0Var.f28653s0;
                i12 = org.telegram.messenger.g0.f22557m;
            }
            i13 = i12 + max;
        }
        if (zv0Var.Q0()) {
            i13 = (int) ((zv0Var.G1 * 0.15f) + i13);
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
            i14 = zv0Var.f28653s0;
        }
        if (zv0Var.N1 != null) {
            i14 += org.telegram.messenger.g0.L(8.0f);
        }
        if (zv0Var.f41153j1.getPaddingTop() != i14) {
            zv0Var.X1 = true;
            zv0Var.f41153j1.setPadding(org.telegram.messenger.g0.L(10.0f), i14, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(8.0f));
            zv0Var.B1.setPadding(0, i14, 0, 0);
            zv0Var.X1 = false;
        }
        if (i13 < size) {
            z9 = false;
        }
        this.f37825c = z9;
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(i13, size), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f37826e.I && super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override
    public final void requestLayout() {
        if (this.f37826e.X1) {
            return;
        }
        super.requestLayout();
    }
}

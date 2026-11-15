package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class yu extends LinearLayout {
    public final a0.h f42156a;
    public final Paint f42157b;
    public final RectF f42158c;
    public final RectF d;
    public final RectF f42159e;
    public final Path f42160f;
    public final boolean h;
    public final boolean f42161n;
    public final gv f42162r;

    public yu(gv gvVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f42162r = gvVar;
        this.h = z10;
        this.f42161n = z11;
        this.f42156a = new a0.h();
        this.f42157b = new Paint(1);
        this.f42158c = new RectF();
        this.d = new RectF();
        this.f42159e = new RectF();
        this.f42160f = new Path();
    }

    public final void a(RectF rectF, int i7) {
        View childAt = getChildAt(c8.i9.b(i7, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        gv gvVar = this.f42162r;
        boolean z10 = gvVar.f35068n;
        ev evVar = gvVar.H;
        for (Map.Entry entry : gvVar.I.entrySet()) {
            View view = (View) entry.getKey();
            if (view != null) {
                Rect rect = (Rect) entry.getValue();
                canvas.save();
                canvas.translate(rect.left, rect.top);
                canvas.scale(view.getScaleX(), view.getScaleY(), rect.width() / 2.0f, rect.height() / 2.0f);
                view.draw(canvas);
                canvas.restore();
            }
        }
        if (gvVar.f35070s == null) {
            gvVar.f35070s = new u5(this, 350L, er.h);
        }
        u5 u5Var = gvVar.f35070s;
        float f12 = 0.0f;
        if (gvVar.f35069r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i7 = 0;
        float e10 = u5Var.e(false, f10);
        int floor = (int) Math.floor(gvVar.L);
        RectF rectF = this.f42158c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(gvVar.L));
        float f13 = gvVar.L - floor;
        RectF rectF3 = this.f42159e;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f13, rectF3);
        if (evVar != null) {
            float f14 = gvVar.L;
            if (gvVar.F != null) {
                i7 = 1;
            }
            f12 = 1.0f - Utilities.l(Math.abs(f14 - (i7 + 1)));
        }
        float f15 = gvVar.M;
        float f16 = (1.0f - f15) * 4.0f * f15;
        float B = com.google.android.gms.internal.vision.e2.B(f16, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float C = com.google.android.gms.internal.vision.e2.C(f16, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - C, rectF3.centerX() + B, rectF3.centerY() + C);
        float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(8.0f, 16.0f, f12));
        int k10 = gvVar.k();
        Paint paint = this.f42157b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) com.google.android.gms.internal.vision.e2.C(f12, 0.5f, 1.0f, paint.getAlpha() * e10));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e10));
        }
        Path path = this.f42160f;
        path.rewind();
        boolean z11 = this.f42161n;
        if (z11) {
            f11 = rectF3.height() / 2.0f;
        } else {
            f11 = L;
        }
        if (z11) {
            L = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f11, L, direction);
        canvas.drawPath(path, paint);
        if (z10) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, org.telegram.messenger.g0.N(16.0f), org.telegram.messenger.g0.N(16.0f), direction);
            paint.setColor(gvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (evVar != null) {
            path.addCircle(org.telegram.messenger.g0.L(15.0f) + evVar.getLeft(), (evVar.getBottom() + evVar.getTop()) / 2.0f, org.telegram.messenger.g0.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f42162r.H) {
            canvas.save();
            canvas.clipPath(this.f42160f);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        a0.h hVar;
        long j3;
        TLRPC.StickerSet stickerSet;
        gv gvVar = this.f42162r;
        cv cvVar = gvVar.G;
        int i13 = (i12 - i10) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i14 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f42156a;
                if (i14 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i14);
                if (childAt != cvVar && !gvVar.I.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                    boolean z11 = childAt instanceof cv;
                    Long l10 = null;
                    if (z11) {
                        cv cvVar2 = (cv) childAt;
                        Long l11 = cvVar2.f33693a;
                        if (l11 == null) {
                            zw zwVar = cvVar2.f33701w;
                            if (zwVar != null && (stickerSet = zwVar.f42431b) != null) {
                                l10 = Long.valueOf(stickerSet.f28078id);
                            } else {
                                l11 = cvVar2.f33699r;
                                if (l11 == null) {
                                    TLRPC.Document document = cvVar2.f33700s;
                                    if (document != null) {
                                        l10 = Long.valueOf(document.f28057id);
                                    }
                                }
                            }
                        }
                        l10 = l11;
                    } else if (childAt instanceof ev) {
                        l10 = Long.valueOf(((ev) childAt).h);
                    }
                    if (gvVar.P && z11) {
                        cv cvVar3 = (cv) childAt;
                        if (cvVar3.f33694b) {
                            cvVar3.f33694b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (ch.f0.d()) {
                                j3 = 0;
                            } else {
                                j3 = 200;
                            }
                            alpha.setDuration(j3).setInterpolator(er.h).start();
                        }
                    }
                    if (l10 != null) {
                        Integer num = (Integer) hVar.f(l10.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < org.telegram.messenger.g0.L(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(er.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l10.longValue());
                    }
                    if ((childAt != gvVar.E || gvVar.f35063a0) && (childAt != gvVar.F || gvVar.f35065c0)) {
                        paddingLeft = org.telegram.messenger.k5.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i14++;
            }
            if (cvVar != null) {
                Long l12 = cvVar.f33693a;
                if (getPaddingRight() + cvVar.getMeasuredWidth() + paddingLeft <= gvVar.getMeasuredWidth()) {
                    int i15 = i11 - i7;
                    paddingLeft = (i15 - getPaddingRight()) - cvVar.getMeasuredWidth();
                    cvVar.layout(paddingLeft, i13 - (cvVar.getMeasuredHeight() / 2), i15 - getPaddingRight(), (cvVar.getMeasuredHeight() / 2) + i13);
                } else {
                    cvVar.layout(paddingLeft, i13 - (cvVar.getMeasuredHeight() / 2), cvVar.getMeasuredWidth() + paddingLeft, (cvVar.getMeasuredHeight() / 2) + i13);
                }
                if (l12 != null) {
                    if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft) {
                        cvVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft);
                        cvVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l12.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!gvVar.f35063a0 ? 1 : 0)) - (!gvVar.f35065c0 ? 1 : 0);
        int A = (int) (org.telegram.messenger.i20.A(30.0f, childCount2, ((i11 - i7) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt((!gvVar.f35063a0 ? 1 : 0) + (!gvVar.f35065c0 ? 1 : 0) + i16);
            if (childAt2 != null) {
                childAt2.layout(paddingLeft2, i13 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i13);
                paddingLeft2 = childAt2.getMeasuredWidth() + A + paddingLeft2;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        cv cvVar;
        cv cvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        gv gvVar = this.f42162r;
        float f11 = 0.0f;
        if (!gvVar.f35063a0 && (cvVar2 = gvVar.E) != null) {
            f10 = cvVar2.getAlpha() * org.telegram.messenger.g0.L(33.0f);
        } else {
            f10 = 0.0f;
        }
        int i12 = paddingRight - ((int) f10);
        if (!gvVar.f35065c0 && (cvVar = gvVar.F) != null) {
            f11 = cvVar.getAlpha() * org.telegram.messenger.g0.L(33.0f);
        }
        int i13 = i12 - ((int) f11);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, i10);
                int measuredWidth = childAt.getMeasuredWidth();
                if (i14 + 1 < getChildCount()) {
                    i11 = org.telegram.messenger.g0.L(3.0f);
                } else {
                    i11 = 0;
                }
                i13 = measuredWidth + i11 + i13;
            }
        }
        if (!this.h) {
            setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
        } else {
            setMeasuredDimension(Math.max(i13, View.MeasureSpec.getSize(i7)), View.MeasureSpec.getSize(i10));
        }
    }
}

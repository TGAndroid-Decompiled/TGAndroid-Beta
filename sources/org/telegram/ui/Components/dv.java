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
public final class dv extends LinearLayout {
    public final a0.h f34509a;
    public final Paint f34510b;
    public final RectF f34511c;
    public final RectF d;
    public final RectF f34512e;
    public final Path f34513f;
    public final boolean h;
    public final boolean f34514n;
    public final lv f34515r;

    public dv(lv lvVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f34515r = lvVar;
        this.h = z10;
        this.f34514n = z11;
        this.f34509a = new a0.h();
        this.f34510b = new Paint(1);
        this.f34511c = new RectF();
        this.d = new RectF();
        this.f34512e = new RectF();
        this.f34513f = new Path();
    }

    public final void a(RectF rectF, int i7) {
        View childAt = getChildAt(c8.l9.b(i7, 0, getChildCount() - 1));
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
        lv lvVar = this.f34515r;
        boolean z10 = lvVar.f37250n;
        jv jvVar = lvVar.H;
        for (Map.Entry entry : lvVar.I.entrySet()) {
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
        if (lvVar.f37252s == null) {
            lvVar.f37252s = new c6(this, 350L, lr.h);
        }
        c6 c6Var = lvVar.f37252s;
        float f12 = 0.0f;
        if (lvVar.f37251r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i7 = 0;
        float e10 = c6Var.e(false, f10);
        int floor = (int) Math.floor(lvVar.L);
        RectF rectF = this.f34511c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(lvVar.L));
        float f13 = lvVar.L - floor;
        RectF rectF3 = this.f34512e;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f13, rectF3);
        if (jvVar != null) {
            float f14 = lvVar.L;
            if (lvVar.F != null) {
                i7 = 1;
            }
            f12 = 1.0f - Utilities.l(Math.abs(f14 - (i7 + 1)));
        }
        float f15 = lvVar.M;
        float f16 = (1.0f - f15) * 4.0f * f15;
        float B = com.google.android.gms.internal.vision.e2.B(f16, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float C = com.google.android.gms.internal.vision.e2.C(f16, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - C, rectF3.centerX() + B, rectF3.centerY() + C);
        float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(8.0f, 16.0f, f12));
        int k10 = lvVar.k();
        Paint paint = this.f34510b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) com.google.android.gms.internal.vision.e2.C(f12, 0.5f, 1.0f, paint.getAlpha() * e10));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e10));
        }
        Path path = this.f34513f;
        path.rewind();
        boolean z11 = this.f34514n;
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
            paint.setColor(lvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (jvVar != null) {
            path.addCircle(org.telegram.messenger.g0.L(15.0f) + jvVar.getLeft(), (jvVar.getBottom() + jvVar.getTop()) / 2.0f, org.telegram.messenger.g0.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f34515r.H) {
            canvas.save();
            canvas.clipPath(this.f34513f);
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
        lv lvVar = this.f34515r;
        hv hvVar = lvVar.G;
        int i13 = (i12 - i10) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i14 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f34509a;
                if (i14 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i14);
                if (childAt != hvVar && !lvVar.I.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                    boolean z11 = childAt instanceof hv;
                    Long l10 = null;
                    if (z11) {
                        hv hvVar2 = (hv) childAt;
                        Long l11 = hvVar2.f35985a;
                        if (l11 == null) {
                            fx fxVar = hvVar2.f35993w;
                            if (fxVar != null && (stickerSet = fxVar.f35172b) != null) {
                                l10 = Long.valueOf(stickerSet.f28432id);
                            } else {
                                l11 = hvVar2.f35991r;
                                if (l11 == null) {
                                    TLRPC.Document document = hvVar2.f35992s;
                                    if (document != null) {
                                        l10 = Long.valueOf(document.f28411id);
                                    }
                                }
                            }
                        }
                        l10 = l11;
                    } else if (childAt instanceof jv) {
                        l10 = Long.valueOf(((jv) childAt).h);
                    }
                    if (lvVar.P && z11) {
                        hv hvVar3 = (hv) childAt;
                        if (hvVar3.f35986b) {
                            hvVar3.f35986b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (ch.f0.d()) {
                                j3 = 0;
                            } else {
                                j3 = 200;
                            }
                            alpha.setDuration(j3).setInterpolator(lr.h).start();
                        }
                    }
                    if (l10 != null) {
                        Integer num = (Integer) hVar.f(l10.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < org.telegram.messenger.g0.L(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(lr.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l10.longValue());
                    }
                    if ((childAt != lvVar.E || lvVar.f37245a0) && (childAt != lvVar.F || lvVar.f37247c0)) {
                        paddingLeft = org.telegram.messenger.f3.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i14++;
            }
            if (hvVar != null) {
                Long l12 = hvVar.f35985a;
                if (getPaddingRight() + hvVar.getMeasuredWidth() + paddingLeft <= lvVar.getMeasuredWidth()) {
                    int i15 = i11 - i7;
                    paddingLeft = (i15 - getPaddingRight()) - hvVar.getMeasuredWidth();
                    hvVar.layout(paddingLeft, i13 - (hvVar.getMeasuredHeight() / 2), i15 - getPaddingRight(), (hvVar.getMeasuredHeight() / 2) + i13);
                } else {
                    hvVar.layout(paddingLeft, i13 - (hvVar.getMeasuredHeight() / 2), hvVar.getMeasuredWidth() + paddingLeft, (hvVar.getMeasuredHeight() / 2) + i13);
                }
                if (l12 != null) {
                    if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft) {
                        hvVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft);
                        hvVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l12.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!lvVar.f37245a0 ? 1 : 0)) - (!lvVar.f37247c0 ? 1 : 0);
        int B = (int) (org.telegram.messenger.n10.B(30.0f, childCount2, ((i11 - i7) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt((!lvVar.f37245a0 ? 1 : 0) + (!lvVar.f37247c0 ? 1 : 0) + i16);
            if (childAt2 != null) {
                childAt2.layout(paddingLeft2, i13 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i13);
                paddingLeft2 = childAt2.getMeasuredWidth() + B + paddingLeft2;
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int i11;
        hv hvVar;
        hv hvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        lv lvVar = this.f34515r;
        float f11 = 0.0f;
        if (!lvVar.f37245a0 && (hvVar2 = lvVar.E) != null) {
            f10 = hvVar2.getAlpha() * org.telegram.messenger.g0.L(33.0f);
        } else {
            f10 = 0.0f;
        }
        int i12 = paddingRight - ((int) f10);
        if (!lvVar.f37247c0 && (hvVar = lvVar.F) != null) {
            f11 = hvVar.getAlpha() * org.telegram.messenger.g0.L(33.0f);
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

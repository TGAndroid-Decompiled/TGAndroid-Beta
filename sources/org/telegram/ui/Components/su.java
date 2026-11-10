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
public final class su extends LinearLayout {
    public final a0.h f38076a;
    public final Paint f38077b;
    public final RectF f38078c;
    public final RectF d;
    public final RectF f38079e;
    public final Path f38080f;
    public final boolean h;
    public final boolean f38081n;
    public final av f38082r;

    public su(av avVar, Context context, boolean z9, boolean z10) {
        super(context);
        this.f38082r = avVar;
        this.h = z9;
        this.f38081n = z10;
        this.f38076a = new a0.h();
        this.f38077b = new Paint(1);
        this.f38078c = new RectF();
        this.d = new RectF();
        this.f38079e = new RectF();
        this.f38080f = new Path();
    }

    public final void a(RectF rectF, int i7) {
        View childAt = getChildAt(c8.j9.b(i7, 0, getChildCount() - 1));
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
        av avVar = this.f38082r;
        boolean z9 = avVar.f32013n;
        yu yuVar = avVar.G;
        for (Map.Entry entry : avVar.H.entrySet()) {
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
        if (avVar.f32015s == null) {
            avVar.f32015s = new v5(this, 350L, wq.h);
        }
        v5 v5Var = avVar.f32015s;
        float f12 = 0.0f;
        if (avVar.f32014r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i7 = 0;
        float e10 = v5Var.e(false, f10);
        int floor = (int) Math.floor(avVar.K);
        RectF rectF = this.f38078c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(avVar.K));
        float f13 = avVar.K - floor;
        RectF rectF3 = this.f38079e;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f13, rectF3);
        if (yuVar != null) {
            float f14 = avVar.K;
            if (avVar.E != null) {
                i7 = 1;
            }
            f12 = 1.0f - Utilities.l(Math.abs(f14 - (i7 + 1)));
        }
        float f15 = avVar.L;
        float f16 = (1.0f - f15) * 4.0f * f15;
        float B = com.google.android.recaptcha.internal.a.B(f16, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float C = com.google.android.recaptcha.internal.a.C(f16, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - C, rectF3.centerX() + B, rectF3.centerY() + C);
        float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(8.0f, 16.0f, f12));
        int k10 = avVar.k();
        Paint paint = this.f38077b;
        paint.setColor(k10);
        if (z9) {
            paint.setAlpha((int) com.google.android.recaptcha.internal.a.C(f12, 0.5f, 1.0f, paint.getAlpha() * e10));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e10));
        }
        Path path = this.f38080f;
        path.rewind();
        boolean z10 = this.f38081n;
        if (z10) {
            f11 = rectF3.height() / 2.0f;
        } else {
            f11 = L;
        }
        if (z10) {
            L = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f11, L, direction);
        canvas.drawPath(path, paint);
        if (z9) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, org.telegram.messenger.g0.N(16.0f), org.telegram.messenger.g0.N(16.0f), direction);
            paint.setColor(avVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (yuVar != null) {
            path.addCircle(org.telegram.messenger.g0.L(15.0f) + yuVar.getLeft(), (yuVar.getBottom() + yuVar.getTop()) / 2.0f, org.telegram.messenger.g0.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f38082r.G) {
            canvas.save();
            canvas.clipPath(this.f38080f);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        a0.h hVar;
        long j3;
        TLRPC.StickerSet stickerSet;
        av avVar = this.f38082r;
        wu wuVar = avVar.F;
        int i13 = (i12 - i10) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i14 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f38076a;
                if (i14 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i14);
                if (childAt != wuVar && !avVar.H.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                    boolean z10 = childAt instanceof wu;
                    Long l10 = null;
                    if (z10) {
                        wu wuVar2 = (wu) childAt;
                        Long l11 = wuVar2.f40087a;
                        if (l11 == null) {
                            tw twVar = wuVar2.f40095w;
                            if (twVar != null && (stickerSet = twVar.f38404b) != null) {
                                l10 = Long.valueOf(stickerSet.f26987id);
                            } else {
                                l11 = wuVar2.f40093r;
                                if (l11 == null) {
                                    TLRPC.Document document = wuVar2.f40094s;
                                    if (document != null) {
                                        l10 = Long.valueOf(document.f26966id);
                                    }
                                }
                            }
                        }
                        l10 = l11;
                    } else if (childAt instanceof yu) {
                        l10 = Long.valueOf(((yu) childAt).h);
                    }
                    if (avVar.O && z10) {
                        wu wuVar3 = (wu) childAt;
                        if (wuVar3.f40088b) {
                            wuVar3.f40088b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (ch.e0.d()) {
                                j3 = 0;
                            } else {
                                j3 = 200;
                            }
                            alpha.setDuration(j3).setInterpolator(wq.h).start();
                        }
                    }
                    if (l10 != null) {
                        Integer num = (Integer) hVar.f(l10.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < org.telegram.messenger.g0.L(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(wq.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l10.longValue());
                    }
                    if ((childAt != avVar.D || avVar.W) && (childAt != avVar.E || avVar.f32010b0)) {
                        paddingLeft = org.telegram.messenger.k5.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i14++;
            }
            if (wuVar != null) {
                Long l12 = wuVar.f40087a;
                if (getPaddingRight() + wuVar.getMeasuredWidth() + paddingLeft <= avVar.getMeasuredWidth()) {
                    int i15 = i11 - i7;
                    paddingLeft = (i15 - getPaddingRight()) - wuVar.getMeasuredWidth();
                    wuVar.layout(paddingLeft, i13 - (wuVar.getMeasuredHeight() / 2), i15 - getPaddingRight(), (wuVar.getMeasuredHeight() / 2) + i13);
                } else {
                    wuVar.layout(paddingLeft, i13 - (wuVar.getMeasuredHeight() / 2), wuVar.getMeasuredWidth() + paddingLeft, (wuVar.getMeasuredHeight() / 2) + i13);
                }
                if (l12 != null) {
                    if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft) {
                        wuVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft);
                        wuVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l12.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!avVar.W ? 1 : 0)) - (!avVar.f32010b0 ? 1 : 0);
        int A = (int) (org.telegram.messenger.camera.q.A(30.0f, childCount2, ((i11 - i7) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt((!avVar.W ? 1 : 0) + (!avVar.f32010b0 ? 1 : 0) + i16);
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
        wu wuVar;
        wu wuVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        av avVar = this.f38082r;
        float f11 = 0.0f;
        if (!avVar.W && (wuVar2 = avVar.D) != null) {
            f10 = wuVar2.getAlpha() * org.telegram.messenger.g0.L(33.0f);
        } else {
            f10 = 0.0f;
        }
        int i12 = paddingRight - ((int) f10);
        if (!avVar.f32010b0 && (wuVar = avVar.E) != null) {
            f11 = wuVar.getAlpha() * org.telegram.messenger.g0.L(33.0f);
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

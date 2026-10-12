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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class gw extends LinearLayout {
    public final a0.h f25427a;
    public final Paint f25428b;
    public final RectF f25429c;
    public final RectF d;
    public final RectF e;
    public final Path f25430f;
    public final boolean h;
    public final boolean f25431n;
    public final ow f25432r;

    public gw(ow owVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f25432r = owVar;
        this.h = z10;
        this.f25431n = z11;
        this.f25427a = new a0.h();
        this.f25428b = new Paint(1);
        this.f25429c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f25430f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(w7.s.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        ow owVar = this.f25432r;
        boolean z10 = owVar.f28072n;
        mw mwVar = owVar.G;
        for (Map.Entry entry : owVar.H.entrySet()) {
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
        if (owVar.f28074s == null) {
            owVar.f28074s = new g6(this, 350L, es.h);
        }
        g6 g6Var = owVar.f28074s;
        float f11 = 0.0f;
        if (owVar.f28073r) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = 0;
        float d = g6Var.d(f7, false);
        int floor = (int) Math.floor(owVar.K);
        RectF rectF = this.f25429c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(owVar.K));
        float f12 = owVar.K - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f12, rectF3);
        if (mwVar != null) {
            float f13 = owVar.K;
            if (owVar.E != null) {
                i10 = 1;
            }
            f11 = 1.0f - Utilities.clamp01(Math.abs(f13 - (i10 + 1)));
        }
        float f14 = owVar.L;
        float f15 = (1.0f - f14) * 4.0f * f14;
        float A = com.google.android.gms.internal.play_billing.k3.A(f15, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = com.google.android.gms.internal.play_billing.k3.B(f15, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - A, rectF3.centerY() - B, rectF3.centerX() + A, rectF3.centerY() + B);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, f11));
        int k10 = owVar.k();
        Paint paint = this.f25428b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) com.google.android.gms.internal.play_billing.k3.B(f11, 0.5f, 1.0f, paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f25430f;
        path.rewind();
        boolean z11 = this.f25431n;
        if (z11) {
            f10 = rectF3.height() / 2.0f;
        } else {
            f10 = dp;
        }
        if (z11) {
            dp = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f10, dp, direction);
        canvas.drawPath(path, paint);
        if (z10) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
            paint.setColor(owVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (mwVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + mwVar.getLeft(), (mwVar.getBottom() + mwVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f25432r.G) {
            canvas.save();
            canvas.clipPath(this.f25430f);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a0.h hVar;
        long j10;
        TLRPC.StickerSet stickerSet;
        ow owVar = this.f25432r;
        kw kwVar = owVar.F;
        int i14 = (i13 - i11) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f25427a;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt != kwVar && !owVar.H.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    boolean z11 = childAt instanceof kw;
                    Long l4 = null;
                    if (z11) {
                        kw kwVar2 = (kw) childAt;
                        Long l10 = kwVar2.f26811a;
                        if (l10 == null) {
                            jy jyVar = kwVar2.v;
                            if (jyVar != null && (stickerSet = jyVar.f26514b) != null) {
                                l4 = Long.valueOf(stickerSet.f19243id);
                            } else {
                                l10 = kwVar2.f26816r;
                                if (l10 == null) {
                                    TLRPC.Document document = kwVar2.f26817s;
                                    if (document != null) {
                                        l4 = Long.valueOf(document.f19222id);
                                    }
                                }
                            }
                        }
                        l4 = l10;
                    } else if (childAt instanceof mw) {
                        l4 = Long.valueOf(((mw) childAt).h);
                    }
                    if (owVar.O && z11) {
                        kw kwVar3 = (kw) childAt;
                        if (kwVar3.f26812b) {
                            kwVar3.f26812b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (ah.x0.d()) {
                                j10 = 0;
                            } else {
                                j10 = 200;
                            }
                            alpha.setDuration(j10).setInterpolator(es.h).start();
                        }
                    }
                    if (l4 != null) {
                        Integer num = (Integer) hVar.f(l4.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < AndroidUtilities.dp(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(es.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l4.longValue());
                    }
                    if ((childAt != owVar.f28077y || owVar.W) && (childAt != owVar.E || owVar.f28069b0)) {
                        paddingLeft = org.telegram.messenger.yh.c(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i15++;
            }
            if (kwVar != null) {
                Long l11 = kwVar.f26811a;
                if (getPaddingRight() + kwVar.getMeasuredWidth() + paddingLeft <= owVar.getMeasuredWidth()) {
                    int i16 = i12 - i10;
                    paddingLeft = (i16 - getPaddingRight()) - kwVar.getMeasuredWidth();
                    kwVar.layout(paddingLeft, i14 - (kwVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (kwVar.getMeasuredHeight() / 2) + i14);
                } else {
                    kwVar.layout(paddingLeft, i14 - (kwVar.getMeasuredHeight() / 2), kwVar.getMeasuredWidth() + paddingLeft, (kwVar.getMeasuredHeight() / 2) + i14);
                }
                if (l11 != null) {
                    if (hVar.f(l11.longValue()) != null && ((Integer) hVar.f(l11.longValue())).intValue() != paddingLeft) {
                        kwVar.setTranslationX(((Integer) hVar.f(l11.longValue())).intValue() - paddingLeft);
                        kwVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l11.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!owVar.W ? 1 : 0)) - (!owVar.f28069b0 ? 1 : 0);
        int C = (int) (org.telegram.messenger.yh.C(30.0f, childCount2, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt((!owVar.W ? 1 : 0) + (!owVar.f28069b0 ? 1 : 0) + i17);
            if (childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                paddingLeft2 = childAt2.getMeasuredWidth() + C + paddingLeft2;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        kw kwVar;
        kw kwVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        ow owVar = this.f25432r;
        float f10 = 0.0f;
        if (!owVar.W && (kwVar2 = owVar.f28077y) != null) {
            f7 = kwVar2.getAlpha() * AndroidUtilities.dp(33.0f);
        } else {
            f7 = 0.0f;
        }
        int i13 = paddingRight - ((int) f7);
        if (!owVar.f28069b0 && (kwVar = owVar.E) != null) {
            f10 = kwVar.getAlpha() * AndroidUtilities.dp(33.0f);
        }
        int i14 = i13 - ((int) f10);
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, i11);
                int measuredWidth = childAt.getMeasuredWidth();
                if (i15 + 1 < getChildCount()) {
                    i12 = AndroidUtilities.dp(3.0f);
                } else {
                    i12 = 0;
                }
                i14 = measuredWidth + i12 + i14;
            }
        }
        if (!this.h) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        } else {
            setMeasuredDimension(Math.max(i14, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getSize(i11));
        }
    }
}

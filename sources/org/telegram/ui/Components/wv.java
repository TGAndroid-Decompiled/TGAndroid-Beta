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
public final class wv extends LinearLayout {
    public final a0.i f30174a;
    public final Paint f30175b;
    public final RectF f30176c;
    public final RectF d;
    public final RectF e;
    public final Path f30177f;
    public final boolean h;
    public final boolean f30178n;
    public final ew f30179r;

    public wv(ew ewVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f30179r = ewVar;
        this.h = z10;
        this.f30178n = z11;
        this.f30174a = new a0.i();
        this.f30175b = new Paint(1);
        this.f30176c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f30177f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(w7.q.b(i10, 0, getChildCount() - 1));
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
        ew ewVar = this.f30179r;
        boolean z10 = ewVar.f23986n;
        cw cwVar = ewVar.G;
        for (Map.Entry entry : ewVar.H.entrySet()) {
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
        if (ewVar.f23988s == null) {
            ewVar.f23988s = new e6(this, 350L, rr.h);
        }
        e6 e6Var = ewVar.f23988s;
        float f11 = 0.0f;
        if (ewVar.f23987r) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = 0;
        float d = e6Var.d(f7, false);
        int floor = (int) Math.floor(ewVar.K);
        RectF rectF = this.f30176c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(ewVar.K));
        float f12 = ewVar.K - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f12, rectF3);
        if (cwVar != null) {
            float f13 = ewVar.K;
            if (ewVar.E != null) {
                i10 = 1;
            }
            f11 = 1.0f - Utilities.clamp01(Math.abs(f13 - (i10 + 1)));
        }
        float f14 = ewVar.L;
        float f15 = (1.0f - f14) * 4.0f * f14;
        float B = com.google.android.gms.internal.vision.e2.B(f15, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f15 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - height, rectF3.centerX() + B, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, f11));
        int k10 = ewVar.k();
        Paint paint = this.f30175b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) ((1.0f - (f11 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f30177f;
        path.rewind();
        boolean z11 = this.f30178n;
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
            paint.setColor(ewVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (cwVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + cwVar.getLeft(), (cwVar.getBottom() + cwVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f30179r.G) {
            canvas.save();
            canvas.clipPath(this.f30177f);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a0.i iVar;
        long j3;
        TLRPC.StickerSet stickerSet;
        ew ewVar = this.f30179r;
        aw awVar = ewVar.F;
        int i14 = (i13 - i11) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                iVar = this.f30174a;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt != awVar && !ewVar.H.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    boolean z11 = childAt instanceof aw;
                    Long l4 = null;
                    if (z11) {
                        aw awVar2 = (aw) childAt;
                        Long l10 = awVar2.f22766a;
                        if (l10 == null) {
                            yx yxVar = awVar2.v;
                            if (yxVar != null && (stickerSet = yxVar.f30705b) != null) {
                                l4 = Long.valueOf(stickerSet.f18348id);
                            } else {
                                l10 = awVar2.f22771r;
                                if (l10 == null) {
                                    TLRPC.Document document = awVar2.f22772s;
                                    if (document != null) {
                                        l4 = Long.valueOf(document.f18327id);
                                    }
                                }
                            }
                        }
                        l4 = l10;
                    } else if (childAt instanceof cw) {
                        l4 = Long.valueOf(((cw) childAt).h);
                    }
                    if (ewVar.O && z11) {
                        aw awVar3 = (aw) childAt;
                        if (awVar3.f22767b) {
                            awVar3.f22767b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (zg.e0.d()) {
                                j3 = 0;
                            } else {
                                j3 = 200;
                            }
                            alpha.setDuration(j3).setInterpolator(rr.h).start();
                        }
                    }
                    if (l4 != null) {
                        Integer num = (Integer) iVar.f(l4.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < AndroidUtilities.dp(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(rr.h).start();
                        }
                        iVar.k(Integer.valueOf(paddingLeft), l4.longValue());
                    }
                    if ((childAt != ewVar.f23991y || ewVar.W) && (childAt != ewVar.E || ewVar.f23983b0)) {
                        paddingLeft = org.telegram.messenger.f0.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i15++;
            }
            if (awVar != null) {
                Long l11 = awVar.f22766a;
                if (getPaddingRight() + awVar.getMeasuredWidth() + paddingLeft <= ewVar.getMeasuredWidth()) {
                    int i16 = i12 - i10;
                    paddingLeft = (i16 - getPaddingRight()) - awVar.getMeasuredWidth();
                    awVar.layout(paddingLeft, i14 - (awVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (awVar.getMeasuredHeight() / 2) + i14);
                } else {
                    awVar.layout(paddingLeft, i14 - (awVar.getMeasuredHeight() / 2), awVar.getMeasuredWidth() + paddingLeft, (awVar.getMeasuredHeight() / 2) + i14);
                }
                if (l11 != null) {
                    if (iVar.f(l11.longValue()) != null && ((Integer) iVar.f(l11.longValue())).intValue() != paddingLeft) {
                        awVar.setTranslationX(((Integer) iVar.f(l11.longValue())).intValue() - paddingLeft);
                        awVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    iVar.k(Integer.valueOf(paddingLeft), l11.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!ewVar.W ? 1 : 0)) - (!ewVar.f23983b0 ? 1 : 0);
        int B = (int) (org.telegram.messenger.ok.B(30.0f, childCount2, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt((!ewVar.W ? 1 : 0) + (!ewVar.f23983b0 ? 1 : 0) + i17);
            if (childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                paddingLeft2 = childAt2.getMeasuredWidth() + B + paddingLeft2;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        aw awVar;
        aw awVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        ew ewVar = this.f30179r;
        float f10 = 0.0f;
        if (!ewVar.W && (awVar2 = ewVar.f23991y) != null) {
            f7 = awVar2.getAlpha() * AndroidUtilities.dp(33.0f);
        } else {
            f7 = 0.0f;
        }
        int i13 = paddingRight - ((int) f7);
        if (!ewVar.f23983b0 && (awVar = ewVar.E) != null) {
            f10 = awVar.getAlpha() * AndroidUtilities.dp(33.0f);
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

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
public final class lw extends LinearLayout {
    public final a0.i f28625a;
    public final Paint f28626b;
    public final RectF f28627c;
    public final RectF d;
    public final RectF f28628e;
    public final Path f28629f;
    public final boolean h;
    public final boolean f28630n;
    public final tw f28631r;

    public lw(tw twVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f28631r = twVar;
        this.h = z10;
        this.f28630n = z11;
        this.f28625a = new a0.i();
        this.f28626b = new Paint(1);
        this.f28627c = new RectF();
        this.d = new RectF();
        this.f28628e = new RectF();
        this.f28629f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(w7.o.b(i10, 0, getChildCount() - 1));
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
        tw twVar = this.f28631r;
        boolean z10 = twVar.f31353n;
        rw rwVar = twVar.G;
        for (Map.Entry entry : twVar.H.entrySet()) {
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
        if (twVar.f31355s == null) {
            twVar.f31355s = new g6(this, 350L, is.h);
        }
        g6 g6Var = twVar.f31355s;
        float f11 = 0.0f;
        if (twVar.f31354r) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = 0;
        float d = g6Var.d(f7, false);
        int floor = (int) Math.floor(twVar.K);
        RectF rectF = this.f28627c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(twVar.K));
        float f12 = twVar.K - floor;
        RectF rectF3 = this.f28628e;
        AndroidUtilities.lerp(rectF, rectF2, f12, rectF3);
        if (rwVar != null) {
            float f13 = twVar.K;
            if (twVar.E != null) {
                i10 = 1;
            }
            f11 = 1.0f - Utilities.clamp01(Math.abs(f13 - (i10 + 1)));
        }
        float f14 = twVar.L;
        float f15 = (1.0f - f14) * 4.0f * f14;
        float A = com.google.android.gms.internal.vision.e2.A(f15, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = com.google.android.gms.internal.vision.e2.B(f15, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - A, rectF3.centerY() - B, rectF3.centerX() + A, rectF3.centerY() + B);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, f11));
        int k10 = twVar.k();
        Paint paint = this.f28626b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) com.google.android.gms.internal.vision.e2.B(f11, 0.5f, 1.0f, paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f28629f;
        path.rewind();
        boolean z11 = this.f28630n;
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
            paint.setColor(twVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (rwVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + rwVar.getLeft(), (rwVar.getBottom() + rwVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f28631r.G) {
            canvas.save();
            canvas.clipPath(this.f28629f);
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
        tw twVar = this.f28631r;
        pw pwVar = twVar.F;
        int i14 = (i13 - i11) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                iVar = this.f28625a;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt != pwVar && !twVar.H.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    boolean z11 = childAt instanceof pw;
                    Long l4 = null;
                    if (z11) {
                        pw pwVar2 = (pw) childAt;
                        Long l10 = pwVar2.f29973a;
                        if (l10 == null) {
                            oy oyVar = pwVar2.v;
                            if (oyVar != null && (stickerSet = oyVar.f29651b) != null) {
                                l4 = Long.valueOf(stickerSet.f20095id);
                            } else {
                                l10 = pwVar2.f29979r;
                                if (l10 == null) {
                                    TLRPC.Document document = pwVar2.f29980s;
                                    if (document != null) {
                                        l4 = Long.valueOf(document.f20074id);
                                    }
                                }
                            }
                        }
                        l4 = l10;
                    } else if (childAt instanceof rw) {
                        l4 = Long.valueOf(((rw) childAt).h);
                    }
                    if (twVar.O && z11) {
                        pw pwVar3 = (pw) childAt;
                        if (pwVar3.f29974b) {
                            pwVar3.f29974b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (zg.d0.d()) {
                                j3 = 0;
                            } else {
                                j3 = 200;
                            }
                            alpha.setDuration(j3).setInterpolator(is.h).start();
                        }
                    }
                    if (l4 != null) {
                        Integer num = (Integer) iVar.f(l4.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < AndroidUtilities.dp(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(is.h).start();
                        }
                        iVar.k(Integer.valueOf(paddingLeft), l4.longValue());
                    }
                    if ((childAt != twVar.f31358y || twVar.W) && (childAt != twVar.E || twVar.f31350b0)) {
                        paddingLeft = org.telegram.messenger.q.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i15++;
            }
            if (pwVar != null) {
                Long l11 = pwVar.f29973a;
                if (getPaddingRight() + pwVar.getMeasuredWidth() + paddingLeft <= twVar.getMeasuredWidth()) {
                    int i16 = i12 - i10;
                    paddingLeft = (i16 - getPaddingRight()) - pwVar.getMeasuredWidth();
                    pwVar.layout(paddingLeft, i14 - (pwVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (pwVar.getMeasuredHeight() / 2) + i14);
                } else {
                    pwVar.layout(paddingLeft, i14 - (pwVar.getMeasuredHeight() / 2), pwVar.getMeasuredWidth() + paddingLeft, (pwVar.getMeasuredHeight() / 2) + i14);
                }
                if (l11 != null) {
                    if (iVar.f(l11.longValue()) != null && ((Integer) iVar.f(l11.longValue())).intValue() != paddingLeft) {
                        pwVar.setTranslationX(((Integer) iVar.f(l11.longValue())).intValue() - paddingLeft);
                        pwVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    iVar.k(Integer.valueOf(paddingLeft), l11.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!twVar.W ? 1 : 0)) - (!twVar.f31350b0 ? 1 : 0);
        int B = (int) (org.telegram.messenger.ai.B(30.0f, childCount2, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt((!twVar.W ? 1 : 0) + (!twVar.f31350b0 ? 1 : 0) + i17);
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
        pw pwVar;
        pw pwVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        tw twVar = this.f28631r;
        float f10 = 0.0f;
        if (!twVar.W && (pwVar2 = twVar.f31358y) != null) {
            f7 = pwVar2.getAlpha() * AndroidUtilities.dp(33.0f);
        } else {
            f7 = 0.0f;
        }
        int i13 = paddingRight - ((int) f7);
        if (!twVar.f31350b0 && (pwVar = twVar.E) != null) {
            f10 = pwVar.getAlpha() * AndroidUtilities.dp(33.0f);
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

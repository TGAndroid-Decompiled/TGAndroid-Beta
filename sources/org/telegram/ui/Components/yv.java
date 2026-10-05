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
public final class yv extends LinearLayout {
    public final a0.i f33349a;
    public final Paint f33350b;
    public final RectF f33351c;
    public final RectF d;
    public final RectF f33352e;
    public final Path f33353f;
    public final boolean h;
    public final boolean f33354n;
    public final gw f33355r;

    public yv(gw gwVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f33355r = gwVar;
        this.h = z10;
        this.f33354n = z11;
        this.f33349a = new a0.i();
        this.f33350b = new Paint(1);
        this.f33351c = new RectF();
        this.d = new RectF();
        this.f33352e = new RectF();
        this.f33353f = new Path();
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
        gw gwVar = this.f33355r;
        boolean z10 = gwVar.f26996n;
        ew ewVar = gwVar.G;
        for (Map.Entry entry : gwVar.H.entrySet()) {
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
        if (gwVar.f26998s == null) {
            gwVar.f26998s = new e6(this, 350L, tr.h);
        }
        e6 e6Var = gwVar.f26998s;
        float f11 = 0.0f;
        if (gwVar.f26997r) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = 0;
        float d = e6Var.d(f7, false);
        int floor = (int) Math.floor(gwVar.K);
        RectF rectF = this.f33351c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(gwVar.K));
        float f12 = gwVar.K - floor;
        RectF rectF3 = this.f33352e;
        AndroidUtilities.lerp(rectF, rectF2, f12, rectF3);
        if (ewVar != null) {
            float f13 = gwVar.K;
            if (gwVar.E != null) {
                i10 = 1;
            }
            f11 = 1.0f - Utilities.clamp01(Math.abs(f13 - (i10 + 1)));
        }
        float f14 = gwVar.L;
        float f15 = (1.0f - f14) * 4.0f * f14;
        float B = com.google.android.gms.internal.vision.e2.B(f15, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f15 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - height, rectF3.centerX() + B, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, f11));
        int k10 = gwVar.k();
        Paint paint = this.f33350b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) ((1.0f - (f11 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f33353f;
        path.rewind();
        boolean z11 = this.f33354n;
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
            paint.setColor(gwVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (ewVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + ewVar.getLeft(), (ewVar.getBottom() + ewVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f33355r.G) {
            canvas.save();
            canvas.clipPath(this.f33353f);
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
        gw gwVar = this.f33355r;
        cw cwVar = gwVar.F;
        int i14 = (i13 - i11) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                iVar = this.f33349a;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt != cwVar && !gwVar.H.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    boolean z11 = childAt instanceof cw;
                    Long l4 = null;
                    if (z11) {
                        cw cwVar2 = (cw) childAt;
                        Long l10 = cwVar2.f25528a;
                        if (l10 == null) {
                            ay ayVar = cwVar2.v;
                            if (ayVar != null && (stickerSet = ayVar.f24760b) != null) {
                                l4 = Long.valueOf(stickerSet.f20074id);
                            } else {
                                l10 = cwVar2.f25534r;
                                if (l10 == null) {
                                    TLRPC.Document document = cwVar2.f25535s;
                                    if (document != null) {
                                        l4 = Long.valueOf(document.f20053id);
                                    }
                                }
                            }
                        }
                        l4 = l10;
                    } else if (childAt instanceof ew) {
                        l4 = Long.valueOf(((ew) childAt).h);
                    }
                    if (gwVar.O && z11) {
                        cw cwVar3 = (cw) childAt;
                        if (cwVar3.f25529b) {
                            cwVar3.f25529b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (zg.c0.d()) {
                                j3 = 0;
                            } else {
                                j3 = 200;
                            }
                            alpha.setDuration(j3).setInterpolator(tr.h).start();
                        }
                    }
                    if (l4 != null) {
                        Integer num = (Integer) iVar.f(l4.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < AndroidUtilities.dp(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(tr.h).start();
                        }
                        iVar.k(Integer.valueOf(paddingLeft), l4.longValue());
                    }
                    if ((childAt != gwVar.f27001y || gwVar.W) && (childAt != gwVar.E || gwVar.f26993b0)) {
                        paddingLeft = org.telegram.messenger.q.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i15++;
            }
            if (cwVar != null) {
                Long l11 = cwVar.f25528a;
                if (getPaddingRight() + cwVar.getMeasuredWidth() + paddingLeft <= gwVar.getMeasuredWidth()) {
                    int i16 = i12 - i10;
                    paddingLeft = (i16 - getPaddingRight()) - cwVar.getMeasuredWidth();
                    cwVar.layout(paddingLeft, i14 - (cwVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (cwVar.getMeasuredHeight() / 2) + i14);
                } else {
                    cwVar.layout(paddingLeft, i14 - (cwVar.getMeasuredHeight() / 2), cwVar.getMeasuredWidth() + paddingLeft, (cwVar.getMeasuredHeight() / 2) + i14);
                }
                if (l11 != null) {
                    if (iVar.f(l11.longValue()) != null && ((Integer) iVar.f(l11.longValue())).intValue() != paddingLeft) {
                        cwVar.setTranslationX(((Integer) iVar.f(l11.longValue())).intValue() - paddingLeft);
                        cwVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    iVar.k(Integer.valueOf(paddingLeft), l11.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!gwVar.W ? 1 : 0)) - (!gwVar.f26993b0 ? 1 : 0);
        int A = (int) (org.telegram.messenger.bi.A(30.0f, childCount2, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt((!gwVar.W ? 1 : 0) + (!gwVar.f26993b0 ? 1 : 0) + i17);
            if (childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                paddingLeft2 = childAt2.getMeasuredWidth() + A + paddingLeft2;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int i12;
        cw cwVar;
        cw cwVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        gw gwVar = this.f33355r;
        float f10 = 0.0f;
        if (!gwVar.W && (cwVar2 = gwVar.f27001y) != null) {
            f7 = cwVar2.getAlpha() * AndroidUtilities.dp(33.0f);
        } else {
            f7 = 0.0f;
        }
        int i13 = paddingRight - ((int) f7);
        if (!gwVar.f26993b0 && (cwVar = gwVar.E) != null) {
            f10 = cwVar.getAlpha() * AndroidUtilities.dp(33.0f);
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

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
public final class pv extends LinearLayout {
    public final a0.h f27995a;
    public final Paint f27996b;
    public final RectF f27997c;
    public final RectF d;
    public final RectF e;
    public final Path f27998f;
    public final boolean h;
    public final boolean f27999n;
    public final xv f28000r;

    public pv(xv xvVar, Context context, boolean z4, boolean z10) {
        super(context);
        this.f28000r = xvVar;
        this.h = z4;
        this.f27999n = z10;
        this.f27995a = new a0.h();
        this.f27996b = new Paint(1);
        this.f27997c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f27998f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(k7.n.b(i10, 0, getChildCount() - 1));
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
        xv xvVar = this.f28000r;
        boolean z4 = xvVar.f30734n;
        vv vvVar = xvVar.D;
        for (Map.Entry entry : xvVar.E.entrySet()) {
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
        if (xvVar.f30736s == null) {
            xvVar.f30736s = new z5(this, 350L, nr.h);
        }
        z5 z5Var = xvVar.f30736s;
        float f12 = 0.0f;
        if (xvVar.f30735r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i10 = 0;
        float d = z5Var.d(f10, false);
        int floor = (int) Math.floor(xvVar.H);
        RectF rectF = this.f27997c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(xvVar.H));
        float f13 = xvVar.H - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f13, rectF3);
        if (vvVar != null) {
            float f14 = xvVar.H;
            if (xvVar.B != null) {
                i10 = 1;
            }
            f12 = 1.0f - Utilities.clamp01(Math.abs(f14 - (i10 + 1)));
        }
        float f15 = xvVar.I;
        float f16 = (1.0f - f15) * 4.0f * f15;
        float y10 = e2.c.y(f16, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f16 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - y10, rectF3.centerY() - height, rectF3.centerX() + y10, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, f12));
        int k10 = xvVar.k();
        Paint paint = this.f27996b;
        paint.setColor(k10);
        if (z4) {
            paint.setAlpha((int) ((1.0f - (f12 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f27998f;
        path.rewind();
        boolean z10 = this.f27999n;
        if (z10) {
            f11 = rectF3.height() / 2.0f;
        } else {
            f11 = dp;
        }
        if (z10) {
            dp = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f11, dp, direction);
        canvas.drawPath(path, paint);
        if (z4) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
            paint.setColor(xvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (vvVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + vvVar.getLeft(), (vvVar.getBottom() + vvVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f28000r.D) {
            canvas.save();
            canvas.clipPath(this.f27998f);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        a0.h hVar;
        long j10;
        TLRPC.StickerSet stickerSet;
        xv xvVar = this.f28000r;
        tv tvVar = xvVar.C;
        int i14 = (i13 - i11) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f27995a;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt != tvVar && !xvVar.E.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    boolean z10 = childAt instanceof tv;
                    Long l10 = null;
                    if (z10) {
                        tv tvVar2 = (tv) childAt;
                        Long l11 = tvVar2.f29048a;
                        if (l11 == null) {
                            vx vxVar = tvVar2.v;
                            if (vxVar != null && (stickerSet = vxVar.f30100b) != null) {
                                l10 = Long.valueOf(stickerSet.f19211id);
                            } else {
                                l11 = tvVar2.f29053r;
                                if (l11 == null) {
                                    TLRPC.Document document = tvVar2.f29054s;
                                    if (document != null) {
                                        l10 = Long.valueOf(document.f19190id);
                                    }
                                }
                            }
                        }
                        l10 = l11;
                    } else if (childAt instanceof vv) {
                        l10 = Long.valueOf(((vv) childAt).h);
                    }
                    if (xvVar.L && z10) {
                        tv tvVar3 = (tv) childAt;
                        if (tvVar3.f29049b) {
                            tvVar3.f29049b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (mg.g0.d()) {
                                j10 = 0;
                            } else {
                                j10 = 200;
                            }
                            alpha.setDuration(j10).setInterpolator(nr.h).start();
                        }
                    }
                    if (l10 != null) {
                        Integer num = (Integer) hVar.f(l10.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < AndroidUtilities.dp(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(nr.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l10.longValue());
                    }
                    if ((childAt != xvVar.f30739y || xvVar.T) && (childAt != xvVar.B || xvVar.V)) {
                        paddingLeft = org.telegram.messenger.y3.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i15++;
            }
            if (tvVar != null) {
                Long l12 = tvVar.f29048a;
                if (getPaddingRight() + tvVar.getMeasuredWidth() + paddingLeft <= xvVar.getMeasuredWidth()) {
                    int i16 = i12 - i10;
                    paddingLeft = (i16 - getPaddingRight()) - tvVar.getMeasuredWidth();
                    tvVar.layout(paddingLeft, i14 - (tvVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (tvVar.getMeasuredHeight() / 2) + i14);
                } else {
                    tvVar.layout(paddingLeft, i14 - (tvVar.getMeasuredHeight() / 2), tvVar.getMeasuredWidth() + paddingLeft, (tvVar.getMeasuredHeight() / 2) + i14);
                }
                if (l12 != null) {
                    if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft) {
                        tvVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft);
                        tvVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l12.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!xvVar.T ? 1 : 0)) - (!xvVar.V ? 1 : 0);
        int z11 = (int) (org.telegram.ui.b.z(30.0f, childCount2, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt((!xvVar.T ? 1 : 0) + (!xvVar.V ? 1 : 0) + i17);
            if (childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                paddingLeft2 = childAt2.getMeasuredWidth() + z11 + paddingLeft2;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int i12;
        tv tvVar;
        tv tvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        xv xvVar = this.f28000r;
        float f11 = 0.0f;
        if (!xvVar.T && (tvVar2 = xvVar.f30739y) != null) {
            f10 = tvVar2.getAlpha() * AndroidUtilities.dp(33.0f);
        } else {
            f10 = 0.0f;
        }
        int i13 = paddingRight - ((int) f10);
        if (!xvVar.V && (tvVar = xvVar.B) != null) {
            f11 = tvVar.getAlpha() * AndroidUtilities.dp(33.0f);
        }
        int i14 = i13 - ((int) f11);
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

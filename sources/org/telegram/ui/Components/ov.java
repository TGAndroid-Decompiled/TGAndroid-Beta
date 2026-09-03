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
public final class ov extends LinearLayout {
    public final a0.h f27670a;
    public final Paint f27671b;
    public final RectF f27672c;
    public final RectF d;
    public final RectF e;
    public final Path f27673f;
    public final boolean h;
    public final boolean f27674n;
    public final wv f27675r;

    public ov(wv wvVar, Context context, boolean z4, boolean z10) {
        super(context);
        this.f27675r = wvVar;
        this.h = z4;
        this.f27674n = z10;
        this.f27670a = new a0.h();
        this.f27671b = new Paint(1);
        this.f27672c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f27673f = new Path();
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
        wv wvVar = this.f27675r;
        boolean z4 = wvVar.f30355n;
        uv uvVar = wvVar.D;
        for (Map.Entry entry : wvVar.E.entrySet()) {
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
        if (wvVar.f30357s == null) {
            wvVar.f30357s = new z5(this, 350L, mr.h);
        }
        z5 z5Var = wvVar.f30357s;
        float f12 = 0.0f;
        if (wvVar.f30356r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i10 = 0;
        float d = z5Var.d(f10, false);
        int floor = (int) Math.floor(wvVar.H);
        RectF rectF = this.f27672c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(wvVar.H));
        float f13 = wvVar.H - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f13, rectF3);
        if (uvVar != null) {
            float f14 = wvVar.H;
            if (wvVar.B != null) {
                i10 = 1;
            }
            f12 = 1.0f - Utilities.clamp01(Math.abs(f14 - (i10 + 1)));
        }
        float f15 = wvVar.I;
        float f16 = (1.0f - f15) * 4.0f * f15;
        float y10 = e2.c.y(f16, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f16 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - y10, rectF3.centerY() - height, rectF3.centerX() + y10, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, f12));
        int k10 = wvVar.k();
        Paint paint = this.f27671b;
        paint.setColor(k10);
        if (z4) {
            paint.setAlpha((int) ((1.0f - (f12 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f27673f;
        path.rewind();
        boolean z10 = this.f27674n;
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
            paint.setColor(wvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (uvVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + uvVar.getLeft(), (uvVar.getBottom() + uvVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f27675r.D) {
            canvas.save();
            canvas.clipPath(this.f27673f);
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
        wv wvVar = this.f27675r;
        sv svVar = wvVar.C;
        int i14 = (i13 - i11) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f27670a;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt != svVar && !wvVar.E.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    boolean z10 = childAt instanceof sv;
                    Long l10 = null;
                    if (z10) {
                        sv svVar2 = (sv) childAt;
                        Long l11 = svVar2.f28816a;
                        if (l11 == null) {
                            vx vxVar = svVar2.v;
                            if (vxVar != null && (stickerSet = vxVar.f30064b) != null) {
                                l10 = Long.valueOf(stickerSet.f19186id);
                            } else {
                                l11 = svVar2.f28821r;
                                if (l11 == null) {
                                    TLRPC.Document document = svVar2.f28822s;
                                    if (document != null) {
                                        l10 = Long.valueOf(document.f19165id);
                                    }
                                }
                            }
                        }
                        l10 = l11;
                    } else if (childAt instanceof uv) {
                        l10 = Long.valueOf(((uv) childAt).h);
                    }
                    if (wvVar.L && z10) {
                        sv svVar3 = (sv) childAt;
                        if (svVar3.f28817b) {
                            svVar3.f28817b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (mg.g0.d()) {
                                j10 = 0;
                            } else {
                                j10 = 200;
                            }
                            alpha.setDuration(j10).setInterpolator(mr.h).start();
                        }
                    }
                    if (l10 != null) {
                        Integer num = (Integer) hVar.f(l10.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < AndroidUtilities.dp(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(mr.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l10.longValue());
                    }
                    if ((childAt != wvVar.f30360y || wvVar.T) && (childAt != wvVar.B || wvVar.V)) {
                        paddingLeft = org.telegram.messenger.y3.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i15++;
            }
            if (svVar != null) {
                Long l12 = svVar.f28816a;
                if (getPaddingRight() + svVar.getMeasuredWidth() + paddingLeft <= wvVar.getMeasuredWidth()) {
                    int i16 = i12 - i10;
                    paddingLeft = (i16 - getPaddingRight()) - svVar.getMeasuredWidth();
                    svVar.layout(paddingLeft, i14 - (svVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (svVar.getMeasuredHeight() / 2) + i14);
                } else {
                    svVar.layout(paddingLeft, i14 - (svVar.getMeasuredHeight() / 2), svVar.getMeasuredWidth() + paddingLeft, (svVar.getMeasuredHeight() / 2) + i14);
                }
                if (l12 != null) {
                    if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft) {
                        svVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft);
                        svVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l12.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!wvVar.T ? 1 : 0)) - (!wvVar.V ? 1 : 0);
        int z11 = (int) (org.telegram.ui.b.z(30.0f, childCount2, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt((!wvVar.T ? 1 : 0) + (!wvVar.V ? 1 : 0) + i17);
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
        sv svVar;
        sv svVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        wv wvVar = this.f27675r;
        float f11 = 0.0f;
        if (!wvVar.T && (svVar2 = wvVar.f30360y) != null) {
            f10 = svVar2.getAlpha() * AndroidUtilities.dp(33.0f);
        } else {
            f10 = 0.0f;
        }
        int i13 = paddingRight - ((int) f10);
        if (!wvVar.V && (svVar = wvVar.B) != null) {
            f11 = svVar.getAlpha() * AndroidUtilities.dp(33.0f);
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

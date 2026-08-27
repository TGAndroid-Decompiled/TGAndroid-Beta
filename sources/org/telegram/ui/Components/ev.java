package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class ev extends LinearLayout {

    public final a0.h f28159a;

    public final Paint f28160b;

    public final RectF f28161c;
    public final RectF d;

    public final RectF f28162e;

    public final Path f28163f;
    public final boolean h;

    public final boolean f28164n;

    public final mv f28165r;

    public ev(mv mvVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f28165r = mvVar;
        this.h = z10;
        this.f28164n = z11;
        this.f28159a = new a0.h();
        this.f28160b = new Paint(1);
        this.f28161c = new RectF();
        this.d = new RectF();
        this.f28162e = new RectF();
        this.f28163f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(h7.n.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        mv mvVar = this.f28165r;
        for (Map.Entry entry : mvVar.D.entrySet()) {
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
        if (mvVar.f30756s == null) {
            mvVar.f30756s = new y5(this, 350L, er.h);
        }
        float fD = mvVar.f30756s.d(mvVar.f30755r ? 1.0f : 0.0f, false);
        int iFloor = (int) Math.floor(mvVar.G);
        int iCeil = (int) Math.ceil(mvVar.G);
        RectF rectF = this.f28161c;
        a(rectF, iFloor);
        RectF rectF2 = this.d;
        a(rectF2, iCeil);
        float f10 = mvVar.G - iFloor;
        RectF rectF3 = this.f28162e;
        AndroidUtilities.lerp(rectF, rectF2, f10, rectF3);
        float fClamp01 = mvVar.C != null ? 1.0f - Utilities.clamp01(Math.abs(mvVar.G - ((mvVar.A != null ? 1 : 0) + 1))) : 0.0f;
        float f11 = mvVar.H;
        float f12 = (1.0f - f11) * 4.0f * f11;
        float fB = com.google.android.recaptcha.internal.a.B(f12, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float fHeight = (1.0f - (f12 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - fB, rectF3.centerY() - fHeight, rectF3.centerX() + fB, rectF3.centerY() + fHeight);
        float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, fClamp01));
        int iK = mvVar.k();
        Paint paint = this.f28160b;
        paint.setColor(iK);
        if (mvVar.f30754n) {
            paint.setAlpha((int) ((1.0f - (fClamp01 * 0.5f)) * paint.getAlpha() * fD));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * fD));
        }
        Path path = this.f28163f;
        path.rewind();
        boolean z10 = this.f28164n;
        float fHeight2 = z10 ? rectF3.height() / 2.0f : fDp;
        if (z10) {
            fDp = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, fHeight2, fDp, direction);
        canvas.drawPath(path, paint);
        if (mvVar.f30754n) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
            paint.setColor(mvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        kv kvVar = mvVar.C;
        if (kvVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + kvVar.getLeft(), (mvVar.C.getBottom() + mvVar.C.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
        mvVar.O = true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view != this.f28165r.C) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipPath(this.f28163f);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a0.h hVar;
        TLRPC.StickerSet stickerSet;
        mv mvVar = this.f28165r;
        iv ivVar = mvVar.B;
        int i14 = (i13 - i11) / 2;
        if (!this.h) {
            int childCount = (getChildCount() - (!mvVar.T ? 1 : 0)) - (!mvVar.V ? 1 : 0);
            int iZ = (int) (org.telegram.messenger.rl.z(30.0f, childCount, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount - 1));
            int paddingLeft = getPaddingLeft();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt = getChildAt((!mvVar.T ? 1 : 0) + (!mvVar.V ? 1 : 0) + i15);
                if (childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    paddingLeft = childAt.getMeasuredWidth() + iZ + paddingLeft;
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        int i16 = 0;
        while (true) {
            int childCount2 = getChildCount();
            hVar = this.f28159a;
            if (i16 >= childCount2) {
                break;
            }
            View childAt2 = getChildAt(i16);
            if (childAt2 != ivVar && !mvVar.D.containsKey(childAt2) && childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                boolean z11 = childAt2 instanceof iv;
                Long lValueOf = null;
                if (z11) {
                    iv ivVar2 = (iv) childAt2;
                    Long l10 = ivVar2.f29489a;
                    if (l10 == null) {
                        kx kxVar = ivVar2.v;
                        if (kxVar == null || (stickerSet = kxVar.f30205b) == null) {
                            l10 = ivVar2.f29495r;
                            if (l10 != null) {
                                lValueOf = l10;
                            } else {
                                TLRPC.Document document = ivVar2.f29496s;
                                if (document != null) {
                                    lValueOf = Long.valueOf(document.f22386id);
                                }
                            }
                        } else {
                            lValueOf = Long.valueOf(stickerSet.f22407id);
                        }
                    } else {
                        lValueOf = l10;
                    }
                } else if (childAt2 instanceof kv) {
                    lValueOf = Long.valueOf(((kv) childAt2).h);
                }
                if (mvVar.K && z11) {
                    iv ivVar3 = (iv) childAt2;
                    if (ivVar3.f29490b) {
                        ivVar3.f29490b = false;
                        childAt2.setScaleX(0.0f);
                        childAt2.setScaleY(0.0f);
                        childAt2.setAlpha(0.0f);
                        childAt2.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(ig.g0.d() ? 0L : 200L).setInterpolator(er.h).start();
                    }
                }
                if (lValueOf != null) {
                    Integer num = (Integer) hVar.f(lValueOf.longValue());
                    if (num != null && num.intValue() != paddingLeft2 && Math.abs(num.intValue() - paddingLeft2) < AndroidUtilities.dp(45.0f)) {
                        childAt2.setTranslationX(num.intValue() - paddingLeft2);
                        childAt2.animate().translationX(0.0f).setDuration(250L).setInterpolator(er.h).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft2), lValueOf.longValue());
                }
                if ((childAt2 != mvVar.f30759y || mvVar.T) && (childAt2 != mvVar.A || mvVar.V)) {
                    paddingLeft2 = org.telegram.messenger.y1.C(3.0f, childAt2.getMeasuredWidth(), paddingLeft2);
                }
            }
            i16++;
        }
        if (ivVar != null) {
            Long l11 = ivVar.f29489a;
            if (getPaddingRight() + ivVar.getMeasuredWidth() + paddingLeft2 <= mvVar.getMeasuredWidth()) {
                int i17 = i12 - i10;
                paddingLeft2 = (i17 - getPaddingRight()) - ivVar.getMeasuredWidth();
                ivVar.layout(paddingLeft2, i14 - (ivVar.getMeasuredHeight() / 2), i17 - getPaddingRight(), (ivVar.getMeasuredHeight() / 2) + i14);
            } else {
                ivVar.layout(paddingLeft2, i14 - (ivVar.getMeasuredHeight() / 2), ivVar.getMeasuredWidth() + paddingLeft2, (ivVar.getMeasuredHeight() / 2) + i14);
            }
            if (l11 != null) {
                if (hVar.f(l11.longValue()) != null && ((Integer) hVar.f(l11.longValue())).intValue() != paddingLeft2) {
                    ivVar.setTranslationX(((Integer) hVar.f(l11.longValue())).intValue() - paddingLeft2);
                    ivVar.animate().translationX(0.0f).setDuration(350L).start();
                }
                hVar.k(Integer.valueOf(paddingLeft2), l11.longValue());
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        iv ivVar;
        iv ivVar2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        mv mvVar = this.f28165r;
        float alpha = 0.0f;
        int alpha2 = paddingRight - ((int) ((mvVar.T || (ivVar2 = mvVar.f30759y) == null) ? 0.0f : ivVar2.getAlpha() * AndroidUtilities.dp(33.0f)));
        if (!mvVar.V && (ivVar = mvVar.A) != null) {
            alpha = ivVar.getAlpha() * AndroidUtilities.dp(33.0f);
        }
        int measuredWidth = alpha2 - ((int) alpha);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt != null) {
                childAt.measure(iMakeMeasureSpec, i11);
                measuredWidth = childAt.getMeasuredWidth() + (i12 + 1 < getChildCount() ? AndroidUtilities.dp(3.0f) : 0) + measuredWidth;
            }
        }
        if (this.h) {
            setMeasuredDimension(Math.max(measuredWidth, View.MeasureSpec.getSize(i10)), View.MeasureSpec.getSize(i11));
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        }
    }
}

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
public final class vv extends LinearLayout {
    public final a0.i f29813a;
    public final Paint f29814b;
    public final RectF f29815c;
    public final RectF d;
    public final RectF e;
    public final Path f29816f;
    public final boolean h;
    public final boolean f29817n;
    public final dw f29818r;

    public vv(dw dwVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f29818r = dwVar;
        this.h = z10;
        this.f29817n = z11;
        this.f29813a = new a0.i();
        this.f29814b = new Paint(1);
        this.f29815c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f29816f = new Path();
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
        dw dwVar = this.f29818r;
        boolean z10 = dwVar.f23764n;
        bw bwVar = dwVar.G;
        for (Map.Entry entry : dwVar.H.entrySet()) {
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
        if (dwVar.f23766s == null) {
            dwVar.f23766s = new d6(this, 350L, qr.h);
        }
        d6 d6Var = dwVar.f23766s;
        float f11 = 0.0f;
        if (dwVar.f23765r) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = 0;
        float d = d6Var.d(f7, false);
        int floor = (int) Math.floor(dwVar.K);
        RectF rectF = this.f29815c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(dwVar.K));
        float f12 = dwVar.K - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f12, rectF3);
        if (bwVar != null) {
            float f13 = dwVar.K;
            if (dwVar.E != null) {
                i10 = 1;
            }
            f11 = 1.0f - Utilities.clamp01(Math.abs(f13 - (i10 + 1)));
        }
        float f14 = dwVar.L;
        float f15 = (1.0f - f14) * 4.0f * f14;
        float B = com.google.android.gms.internal.vision.e2.B(f15, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f15 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - height, rectF3.centerX() + B, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, f11));
        int k10 = dwVar.k();
        Paint paint = this.f29814b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) ((1.0f - (f11 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f29816f;
        path.rewind();
        boolean z11 = this.f29817n;
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
            paint.setColor(dwVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (bwVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + bwVar.getLeft(), (bwVar.getBottom() + bwVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f29818r.G) {
            canvas.save();
            canvas.clipPath(this.f29816f);
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
        dw dwVar = this.f29818r;
        zv zvVar = dwVar.F;
        int i14 = (i13 - i11) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                iVar = this.f29813a;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt != zvVar && !dwVar.H.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    boolean z11 = childAt instanceof zv;
                    Long l4 = null;
                    if (z11) {
                        zv zvVar2 = (zv) childAt;
                        Long l10 = zvVar2.f30961a;
                        if (l10 == null) {
                            xx xxVar = zvVar2.v;
                            if (xxVar != null && (stickerSet = xxVar.f30422b) != null) {
                                l4 = Long.valueOf(stickerSet.f18370id);
                            } else {
                                l10 = zvVar2.f30966r;
                                if (l10 == null) {
                                    TLRPC.Document document = zvVar2.f30967s;
                                    if (document != null) {
                                        l4 = Long.valueOf(document.f18349id);
                                    }
                                }
                            }
                        }
                        l4 = l10;
                    } else if (childAt instanceof bw) {
                        l4 = Long.valueOf(((bw) childAt).h);
                    }
                    if (dwVar.O && z11) {
                        zv zvVar3 = (zv) childAt;
                        if (zvVar3.f30962b) {
                            zvVar3.f30962b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (zg.f0.d()) {
                                j3 = 0;
                            } else {
                                j3 = 200;
                            }
                            alpha.setDuration(j3).setInterpolator(qr.h).start();
                        }
                    }
                    if (l4 != null) {
                        Integer num = (Integer) iVar.f(l4.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < AndroidUtilities.dp(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(qr.h).start();
                        }
                        iVar.k(Integer.valueOf(paddingLeft), l4.longValue());
                    }
                    if ((childAt != dwVar.f23769y || dwVar.W) && (childAt != dwVar.E || dwVar.f23761b0)) {
                        paddingLeft = org.telegram.messenger.l0.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i15++;
            }
            if (zvVar != null) {
                Long l11 = zvVar.f30961a;
                if (getPaddingRight() + zvVar.getMeasuredWidth() + paddingLeft <= dwVar.getMeasuredWidth()) {
                    int i16 = i12 - i10;
                    paddingLeft = (i16 - getPaddingRight()) - zvVar.getMeasuredWidth();
                    zvVar.layout(paddingLeft, i14 - (zvVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (zvVar.getMeasuredHeight() / 2) + i14);
                } else {
                    zvVar.layout(paddingLeft, i14 - (zvVar.getMeasuredHeight() / 2), zvVar.getMeasuredWidth() + paddingLeft, (zvVar.getMeasuredHeight() / 2) + i14);
                }
                if (l11 != null) {
                    if (iVar.f(l11.longValue()) != null && ((Integer) iVar.f(l11.longValue())).intValue() != paddingLeft) {
                        zvVar.setTranslationX(((Integer) iVar.f(l11.longValue())).intValue() - paddingLeft);
                        zvVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    iVar.k(Integer.valueOf(paddingLeft), l11.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!dwVar.W ? 1 : 0)) - (!dwVar.f23761b0 ? 1 : 0);
        int B = (int) (org.telegram.messenger.rk.B(30.0f, childCount2, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt((!dwVar.W ? 1 : 0) + (!dwVar.f23761b0 ? 1 : 0) + i17);
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
        zv zvVar;
        zv zvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        dw dwVar = this.f29818r;
        float f10 = 0.0f;
        if (!dwVar.W && (zvVar2 = dwVar.f23769y) != null) {
            f7 = zvVar2.getAlpha() * AndroidUtilities.dp(33.0f);
        } else {
            f7 = 0.0f;
        }
        int i13 = paddingRight - ((int) f7);
        if (!dwVar.f23761b0 && (zvVar = dwVar.E) != null) {
            f10 = zvVar.getAlpha() * AndroidUtilities.dp(33.0f);
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

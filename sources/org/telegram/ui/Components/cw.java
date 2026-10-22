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
public final class cw extends LinearLayout {
    public final a0.h f25272a;
    public final Paint f25273b;
    public final RectF f25274c;
    public final RectF d;
    public final RectF e;
    public final Path f25275f;
    public final boolean h;
    public final boolean f25276n;
    public final kw f25277r;

    public cw(kw kwVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f25277r = kwVar;
        this.h = z10;
        this.f25276n = z11;
        this.f25272a = new a0.h();
        this.f25273b = new Paint(1);
        this.f25274c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f25275f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(w7.r.b(i10, 0, getChildCount() - 1));
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
        kw kwVar = this.f25277r;
        boolean z10 = kwVar.f27974n;
        iw iwVar = kwVar.G;
        for (Map.Entry entry : kwVar.H.entrySet()) {
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
        if (kwVar.f27976s == null) {
            kwVar.f27976s = new f6(this, 350L, bs.h);
        }
        f6 f6Var = kwVar.f27976s;
        float f11 = 0.0f;
        if (kwVar.f27975r) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = 0;
        float d = f6Var.d(f7, false);
        int floor = (int) Math.floor(kwVar.K);
        RectF rectF = this.f25274c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(kwVar.K));
        float f12 = kwVar.K - floor;
        RectF rectF3 = this.e;
        AndroidUtilities.lerp(rectF, rectF2, f12, rectF3);
        if (iwVar != null) {
            float f13 = kwVar.K;
            if (kwVar.E != null) {
                i10 = 1;
            }
            f11 = 1.0f - Utilities.clamp01(Math.abs(f13 - (i10 + 1)));
        }
        float f14 = kwVar.L;
        float f15 = (1.0f - f14) * 4.0f * f14;
        float A = com.google.android.gms.internal.play_billing.k3.A(f15, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = com.google.android.gms.internal.play_billing.k3.B(f15, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - A, rectF3.centerY() - B, rectF3.centerX() + A, rectF3.centerY() + B);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, f11));
        int k10 = kwVar.k();
        Paint paint = this.f25273b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) com.google.android.gms.internal.play_billing.k3.B(f11, 0.5f, 1.0f, paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f25275f;
        path.rewind();
        boolean z11 = this.f25276n;
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
            paint.setColor(kwVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (iwVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + iwVar.getLeft(), (iwVar.getBottom() + iwVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f25277r.G) {
            canvas.save();
            canvas.clipPath(this.f25275f);
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
        kw kwVar = this.f25277r;
        gw gwVar = kwVar.F;
        int i14 = (i13 - i11) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f25272a;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt != gwVar && !kwVar.H.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    boolean z11 = childAt instanceof gw;
                    Long l4 = null;
                    if (z11) {
                        gw gwVar2 = (gw) childAt;
                        Long l10 = gwVar2.f26676a;
                        if (l10 == null) {
                            fy fyVar = gwVar2.v;
                            if (fyVar != null && (stickerSet = fyVar.f26438b) != null) {
                                l4 = Long.valueOf(stickerSet.f20306id);
                            } else {
                                l10 = gwVar2.f26681r;
                                if (l10 == null) {
                                    TLRPC.Document document = gwVar2.f26682s;
                                    if (document != null) {
                                        l4 = Long.valueOf(document.f20285id);
                                    }
                                }
                            }
                        }
                        l4 = l10;
                    } else if (childAt instanceof iw) {
                        l4 = Long.valueOf(((iw) childAt).h);
                    }
                    if (kwVar.O && z11) {
                        gw gwVar3 = (gw) childAt;
                        if (gwVar3.f26677b) {
                            gwVar3.f26677b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (ah.x0.d()) {
                                j10 = 0;
                            } else {
                                j10 = 200;
                            }
                            alpha.setDuration(j10).setInterpolator(bs.h).start();
                        }
                    }
                    if (l4 != null) {
                        Integer num = (Integer) hVar.f(l4.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < AndroidUtilities.dp(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(bs.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l4.longValue());
                    }
                    if ((childAt != kwVar.f27979y || kwVar.W) && (childAt != kwVar.E || kwVar.f27971b0)) {
                        paddingLeft = org.telegram.messenger.g0.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i15++;
            }
            if (gwVar != null) {
                Long l11 = gwVar.f26676a;
                if (getPaddingRight() + gwVar.getMeasuredWidth() + paddingLeft <= kwVar.getMeasuredWidth()) {
                    int i16 = i12 - i10;
                    paddingLeft = (i16 - getPaddingRight()) - gwVar.getMeasuredWidth();
                    gwVar.layout(paddingLeft, i14 - (gwVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (gwVar.getMeasuredHeight() / 2) + i14);
                } else {
                    gwVar.layout(paddingLeft, i14 - (gwVar.getMeasuredHeight() / 2), gwVar.getMeasuredWidth() + paddingLeft, (gwVar.getMeasuredHeight() / 2) + i14);
                }
                if (l11 != null) {
                    if (hVar.f(l11.longValue()) != null && ((Integer) hVar.f(l11.longValue())).intValue() != paddingLeft) {
                        gwVar.setTranslationX(((Integer) hVar.f(l11.longValue())).intValue() - paddingLeft);
                        gwVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l11.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!kwVar.W ? 1 : 0)) - (!kwVar.f27971b0 ? 1 : 0);
        int B = (int) (org.telegram.messenger.ok.B(30.0f, childCount2, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt((!kwVar.W ? 1 : 0) + (!kwVar.f27971b0 ? 1 : 0) + i17);
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
        gw gwVar;
        gw gwVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        kw kwVar = this.f25277r;
        float f10 = 0.0f;
        if (!kwVar.W && (gwVar2 = kwVar.f27979y) != null) {
            f7 = gwVar2.getAlpha() * AndroidUtilities.dp(33.0f);
        } else {
            f7 = 0.0f;
        }
        int i13 = paddingRight - ((int) f7);
        if (!kwVar.f27971b0 && (gwVar = kwVar.E) != null) {
            f10 = gwVar.getAlpha() * AndroidUtilities.dp(33.0f);
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

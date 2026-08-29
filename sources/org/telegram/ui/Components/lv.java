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
public final class lv extends LinearLayout {
    public final a0.h f30434a;
    public final Paint f30435b;
    public final RectF f30436c;
    public final RectF d;
    public final RectF f30437e;
    public final Path f30438f;
    public final boolean h;
    public final boolean f30439n;
    public final tv f30440r;

    public lv(tv tvVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f30440r = tvVar;
        this.h = z10;
        this.f30439n = z11;
        this.f30434a = new a0.h();
        this.f30435b = new Paint(1);
        this.f30436c = new RectF();
        this.d = new RectF();
        this.f30437e = new RectF();
        this.f30438f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(i7.w.b(i10, 0, getChildCount() - 1));
        if (childAt == null) {
            return;
        }
        rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
        rectF.set(rectF.centerX() - (childAt.getScaleX() * (rectF.width() / 2.0f)), rectF.centerY() - (childAt.getScaleY() * (rectF.height() / 2.0f)), (childAt.getScaleX() * (rectF.width() / 2.0f)) + rectF.centerX(), (childAt.getScaleY() * (rectF.height() / 2.0f)) + rectF.centerY());
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        tv tvVar = this.f30440r;
        boolean z10 = tvVar.f33043n;
        rv rvVar = tvVar.C;
        for (Map.Entry entry : tvVar.D.entrySet()) {
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
        if (tvVar.f33045s == null) {
            tvVar.f33045s = new d6(this, 350L, jr.h);
        }
        d6 d6Var = tvVar.f33045s;
        float f11 = 0.0f;
        if (tvVar.f33044r) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        int i10 = 0;
        float d = d6Var.d(f9, false);
        int floor = (int) Math.floor(tvVar.G);
        RectF rectF = this.f30436c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(tvVar.G));
        float f12 = tvVar.G - floor;
        RectF rectF3 = this.f30437e;
        AndroidUtilities.lerp(rectF, rectF2, f12, rectF3);
        if (rvVar != null) {
            float f13 = tvVar.G;
            if (tvVar.A != null) {
                i10 = 1;
            }
            f11 = 1.0f - Utilities.clamp01(Math.abs(f13 - (i10 + 1)));
        }
        float f14 = tvVar.H;
        float f15 = (1.0f - f14) * 4.0f * f14;
        float B = com.google.android.recaptcha.internal.a.B(f15, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f15 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - height, rectF3.centerX() + B, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, f11));
        int k9 = tvVar.k();
        Paint paint = this.f30435b;
        paint.setColor(k9);
        if (z10) {
            paint.setAlpha((int) ((1.0f - (f11 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f30438f;
        path.rewind();
        boolean z11 = this.f30439n;
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
            paint.setColor(tvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (rvVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + rvVar.getLeft(), (rvVar.getBottom() + rvVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f30440r.C) {
            canvas.save();
            canvas.clipPath(this.f30438f);
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
        tv tvVar = this.f30440r;
        pv pvVar = tvVar.B;
        int i14 = (i13 - i11) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f30434a;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt != pvVar && !tvVar.D.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    boolean z11 = childAt instanceof pv;
                    Long l10 = null;
                    if (z11) {
                        pv pvVar2 = (pv) childAt;
                        Long l11 = pvVar2.f31777a;
                        if (l11 == null) {
                            rx rxVar = pvVar2.v;
                            if (rxVar != null && (stickerSet = rxVar.f32402b) != null) {
                                l10 = Long.valueOf(stickerSet.f22419id);
                            } else {
                                l11 = pvVar2.f31783r;
                                if (l11 == null) {
                                    TLRPC.Document document = pvVar2.f31784s;
                                    if (document != null) {
                                        l10 = Long.valueOf(document.f22398id);
                                    }
                                }
                            }
                        }
                        l10 = l11;
                    } else if (childAt instanceof rv) {
                        l10 = Long.valueOf(((rv) childAt).h);
                    }
                    if (tvVar.K && z11) {
                        pv pvVar3 = (pv) childAt;
                        if (pvVar3.f31778b) {
                            pvVar3.f31778b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (kg.g0.d()) {
                                j10 = 0;
                            } else {
                                j10 = 200;
                            }
                            alpha.setDuration(j10).setInterpolator(jr.h).start();
                        }
                    }
                    if (l10 != null) {
                        Integer num = (Integer) hVar.f(l10.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < AndroidUtilities.dp(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(jr.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l10.longValue());
                    }
                    if ((childAt != tvVar.f33048y || tvVar.S) && (childAt != tvVar.A || tvVar.U)) {
                        paddingLeft = org.telegram.messenger.x3.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i15++;
            }
            if (pvVar != null) {
                Long l12 = pvVar.f31777a;
                if (getPaddingRight() + pvVar.getMeasuredWidth() + paddingLeft <= tvVar.getMeasuredWidth()) {
                    int i16 = i12 - i10;
                    paddingLeft = (i16 - getPaddingRight()) - pvVar.getMeasuredWidth();
                    pvVar.layout(paddingLeft, i14 - (pvVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (pvVar.getMeasuredHeight() / 2) + i14);
                } else {
                    pvVar.layout(paddingLeft, i14 - (pvVar.getMeasuredHeight() / 2), pvVar.getMeasuredWidth() + paddingLeft, (pvVar.getMeasuredHeight() / 2) + i14);
                }
                if (l12 != null) {
                    if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft) {
                        pvVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft);
                        pvVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l12.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!tvVar.S ? 1 : 0)) - (!tvVar.U ? 1 : 0);
        int z12 = (int) (org.telegram.ui.b.z(30.0f, childCount2, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt((!tvVar.S ? 1 : 0) + (!tvVar.U ? 1 : 0) + i17);
            if (childAt2 != null) {
                childAt2.layout(paddingLeft2, i14 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i14);
                paddingLeft2 = childAt2.getMeasuredWidth() + z12 + paddingLeft2;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int i12;
        pv pvVar;
        pv pvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        tv tvVar = this.f30440r;
        float f10 = 0.0f;
        if (!tvVar.S && (pvVar2 = tvVar.f33048y) != null) {
            f9 = pvVar2.getAlpha() * AndroidUtilities.dp(33.0f);
        } else {
            f9 = 0.0f;
        }
        int i13 = paddingRight - ((int) f9);
        if (!tvVar.U && (pvVar = tvVar.A) != null) {
            f10 = pvVar.getAlpha() * AndroidUtilities.dp(33.0f);
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

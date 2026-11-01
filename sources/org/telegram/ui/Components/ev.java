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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ev extends LinearLayout {
    public final a0.h f25935a;
    public final Paint f25936b;
    public final RectF f25937c;
    public final RectF d;
    public final RectF e;
    public final Path f25938f;
    public final boolean h;
    public final boolean f25939n;
    public final mv f25940r;

    public ev(mv mvVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f25940r = mvVar;
        this.h = z10;
        this.f25939n = z11;
        this.f25935a = new a0.h();
        this.f25936b = new Paint(1);
        this.f25937c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.f25938f = new Path();
    }

    public final void a(RectF rectF, int i10) {
        View childAt = getChildAt(w7.u.b(i10, 0, getChildCount() - 1));
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
        mv mvVar = this.f25940r;
        boolean z10 = mvVar.f28579n;
        kv kvVar = mvVar.G;
        for (Map.Entry entry : mvVar.H.entrySet()) {
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
        if (mvVar.f28581s == null) {
            mvVar.f28581s = new t5(this, 350L, gr.h);
        }
        t5 t5Var = mvVar.f28581s;
        float f11 = 0.0f;
        if (mvVar.f28580r) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        int i10 = 0;
        float e = t5Var.e(false, f7);
        int floor = (int) Math.floor(mvVar.K);
        RectF rectF = this.f25937c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(mvVar.K));
        float f12 = mvVar.K - floor;
        RectF rectF3 = this.e;
        org.telegram.messenger.i0.Z1(rectF, rectF2, f12, rectF3);
        if (kvVar != null) {
            float f13 = mvVar.K;
            if (mvVar.E != null) {
                i10 = 1;
            }
            f11 = 1.0f - Utilities.l(Math.abs(f13 - (i10 + 1)));
        }
        float f14 = mvVar.L;
        float f15 = (1.0f - f14) * 4.0f * f14;
        float C = c3.i0.C(f15, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float D = c3.i0.D(f15, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - C, rectF3.centerY() - D, rectF3.centerX() + C, rectF3.centerY() + D);
        float L = org.telegram.messenger.i0.L(org.telegram.messenger.i0.T1(8.0f, 16.0f, f11));
        int k10 = mvVar.k();
        Paint paint = this.f25936b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) c3.i0.D(f11, 0.5f, 1.0f, paint.getAlpha() * e));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e));
        }
        Path path = this.f25938f;
        path.rewind();
        boolean z11 = this.f25939n;
        if (z11) {
            f10 = rectF3.height() / 2.0f;
        } else {
            f10 = L;
        }
        if (z11) {
            L = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f10, L, direction);
        canvas.drawPath(path, paint);
        if (z10) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, org.telegram.messenger.i0.N(16.0f), org.telegram.messenger.i0.N(16.0f), direction);
            paint.setColor(mvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (kvVar != null) {
            path.addCircle(org.telegram.messenger.i0.L(15.0f) + kvVar.getLeft(), (kvVar.getBottom() + kvVar.getTop()) / 2.0f, org.telegram.messenger.i0.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f25940r.G) {
            canvas.save();
            canvas.clipPath(this.f25938f);
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
        mv mvVar = this.f25940r;
        iv ivVar = mvVar.F;
        int i14 = (i13 - i11) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i15 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f25935a;
                if (i15 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i15);
                if (childAt != ivVar && !mvVar.H.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i14 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i14);
                    boolean z11 = childAt instanceof iv;
                    Long l4 = null;
                    if (z11) {
                        iv ivVar2 = (iv) childAt;
                        Long l10 = ivVar2.f27177a;
                        if (l10 == null) {
                            ix ixVar = ivVar2.f27184w;
                            if (ixVar != null && (stickerSet = ixVar.f27193b) != null) {
                                l4 = Long.valueOf(stickerSet.f19821id);
                            } else {
                                l10 = ivVar2.f27182r;
                                if (l10 == null) {
                                    TLRPC.Document document = ivVar2.f27183s;
                                    if (document != null) {
                                        l4 = Long.valueOf(document.f19800id);
                                    }
                                }
                            }
                        }
                        l4 = l10;
                    } else if (childAt instanceof kv) {
                        l4 = Long.valueOf(((kv) childAt).h);
                    }
                    if (mvVar.O && z11) {
                        iv ivVar3 = (iv) childAt;
                        if (ivVar3.f27178b) {
                            ivVar3.f27178b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (sg.e0.d()) {
                                j10 = 0;
                            } else {
                                j10 = 200;
                            }
                            alpha.setDuration(j10).setInterpolator(gr.h).start();
                        }
                    }
                    if (l4 != null) {
                        Integer num = (Integer) hVar.f(l4.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < org.telegram.messenger.i0.L(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(gr.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l4.longValue());
                    }
                    if ((childAt != mvVar.D || mvVar.W) && (childAt != mvVar.E || mvVar.f28576b0)) {
                        paddingLeft = org.telegram.messenger.m5.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i15++;
            }
            if (ivVar != null) {
                Long l11 = ivVar.f27177a;
                if (getPaddingRight() + ivVar.getMeasuredWidth() + paddingLeft <= mvVar.getMeasuredWidth()) {
                    int i16 = i12 - i10;
                    paddingLeft = (i16 - getPaddingRight()) - ivVar.getMeasuredWidth();
                    ivVar.layout(paddingLeft, i14 - (ivVar.getMeasuredHeight() / 2), i16 - getPaddingRight(), (ivVar.getMeasuredHeight() / 2) + i14);
                } else {
                    ivVar.layout(paddingLeft, i14 - (ivVar.getMeasuredHeight() / 2), ivVar.getMeasuredWidth() + paddingLeft, (ivVar.getMeasuredHeight() / 2) + i14);
                }
                if (l11 != null) {
                    if (hVar.f(l11.longValue()) != null && ((Integer) hVar.f(l11.longValue())).intValue() != paddingLeft) {
                        ivVar.setTranslationX(((Integer) hVar.f(l11.longValue())).intValue() - paddingLeft);
                        ivVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l11.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!mvVar.W ? 1 : 0)) - (!mvVar.f28576b0 ? 1 : 0);
        int A = (int) (org.telegram.messenger.a30.A(30.0f, childCount2, ((i12 - i10) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt((!mvVar.W ? 1 : 0) + (!mvVar.f28576b0 ? 1 : 0) + i17);
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
        iv ivVar;
        iv ivVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        mv mvVar = this.f25940r;
        float f10 = 0.0f;
        if (!mvVar.W && (ivVar2 = mvVar.D) != null) {
            f7 = ivVar2.getAlpha() * org.telegram.messenger.i0.L(33.0f);
        } else {
            f7 = 0.0f;
        }
        int i13 = paddingRight - ((int) f7);
        if (!mvVar.f28576b0 && (ivVar = mvVar.E) != null) {
            f10 = ivVar.getAlpha() * org.telegram.messenger.i0.L(33.0f);
        }
        int i14 = i13 - ((int) f10);
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, i11);
                int measuredWidth = childAt.getMeasuredWidth();
                if (i15 + 1 < getChildCount()) {
                    i12 = org.telegram.messenger.i0.L(3.0f);
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

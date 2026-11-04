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
public final class ru extends LinearLayout {
    public final a0.h f37801a;
    public final Paint f37802b;
    public final RectF f37803c;
    public final RectF d;
    public final RectF f37804e;
    public final Path f37805f;
    public final boolean h;
    public final boolean f37806n;
    public final zu f37807r;

    public ru(zu zuVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f37807r = zuVar;
        this.h = z10;
        this.f37806n = z11;
        this.f37801a = new a0.h();
        this.f37802b = new Paint(1);
        this.f37803c = new RectF();
        this.d = new RectF();
        this.f37804e = new RectF();
        this.f37805f = new Path();
    }

    public final void a(RectF rectF, int i3) {
        View childAt = getChildAt(b8.be.b(i3, 0, getChildCount() - 1));
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
        zu zuVar = this.f37807r;
        boolean z10 = zuVar.f41119n;
        xu xuVar = zuVar.H;
        for (Map.Entry entry : zuVar.I.entrySet()) {
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
        if (zuVar.f41121s == null) {
            zuVar.f41121s = new u5(this, 350L, xq.h);
        }
        u5 u5Var = zuVar.f41121s;
        float f12 = 0.0f;
        if (zuVar.f41120r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i3 = 0;
        float e10 = u5Var.e(false, f10);
        int floor = (int) Math.floor(zuVar.L);
        RectF rectF = this.f37803c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(zuVar.L));
        float f13 = zuVar.L - floor;
        RectF rectF3 = this.f37804e;
        org.telegram.messenger.g0.Z1(rectF, rectF2, f13, rectF3);
        if (xuVar != null) {
            float f14 = zuVar.L;
            if (zuVar.F != null) {
                i3 = 1;
            }
            f12 = 1.0f - Utilities.l(Math.abs(f14 - (i3 + 1)));
        }
        float f15 = zuVar.M;
        float f16 = (1.0f - f15) * 4.0f * f15;
        float A = com.google.android.recaptcha.internal.a.A(f16, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float B = com.google.android.recaptcha.internal.a.B(f16, 0.05f, 1.0f, rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - A, rectF3.centerY() - B, rectF3.centerX() + A, rectF3.centerY() + B);
        float L = org.telegram.messenger.g0.L(org.telegram.messenger.g0.T1(8.0f, 16.0f, f12));
        int k10 = zuVar.k();
        Paint paint = this.f37802b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) com.google.android.recaptcha.internal.a.B(f12, 0.5f, 1.0f, paint.getAlpha() * e10));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * e10));
        }
        Path path = this.f37805f;
        path.rewind();
        boolean z11 = this.f37806n;
        if (z11) {
            f11 = rectF3.height() / 2.0f;
        } else {
            f11 = L;
        }
        if (z11) {
            L = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f11, L, direction);
        canvas.drawPath(path, paint);
        if (z10) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, org.telegram.messenger.g0.N(16.0f), org.telegram.messenger.g0.N(16.0f), direction);
            paint.setColor(zuVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (xuVar != null) {
            path.addCircle(org.telegram.messenger.g0.L(15.0f) + xuVar.getLeft(), (xuVar.getBottom() + xuVar.getTop()) / 2.0f, org.telegram.messenger.g0.L(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f37807r.H) {
            canvas.save();
            canvas.clipPath(this.f37805f);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        a0.h hVar;
        long j10;
        TLRPC.StickerSet stickerSet;
        zu zuVar = this.f37807r;
        vu vuVar = zuVar.G;
        int i13 = (i12 - i10) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i14 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f37801a;
                if (i14 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i14);
                if (childAt != vuVar && !zuVar.I.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                    boolean z11 = childAt instanceof vu;
                    Long l10 = null;
                    if (z11) {
                        vu vuVar2 = (vu) childAt;
                        Long l11 = vuVar2.f39795a;
                        if (l11 == null) {
                            sw swVar = vuVar2.f39803w;
                            if (swVar != null && (stickerSet = swVar.f38125b) != null) {
                                l10 = Long.valueOf(stickerSet.f27028id);
                            } else {
                                l11 = vuVar2.f39801r;
                                if (l11 == null) {
                                    TLRPC.Document document = vuVar2.f39802s;
                                    if (document != null) {
                                        l10 = Long.valueOf(document.f27007id);
                                    }
                                }
                            }
                        }
                        l10 = l11;
                    } else if (childAt instanceof xu) {
                        l10 = Long.valueOf(((xu) childAt).h);
                    }
                    if (zuVar.P && z11) {
                        vu vuVar3 = (vu) childAt;
                        if (vuVar3.f39796b) {
                            vuVar3.f39796b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (dh.d0.d()) {
                                j10 = 0;
                            } else {
                                j10 = 200;
                            }
                            alpha.setDuration(j10).setInterpolator(xq.h).start();
                        }
                    }
                    if (l10 != null) {
                        Integer num = (Integer) hVar.f(l10.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < org.telegram.messenger.g0.L(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(xq.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l10.longValue());
                    }
                    if ((childAt != zuVar.E || zuVar.f41114a0) && (childAt != zuVar.F || zuVar.f41116c0)) {
                        paddingLeft = org.telegram.messenger.k5.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i14++;
            }
            if (vuVar != null) {
                Long l12 = vuVar.f39795a;
                if (getPaddingRight() + vuVar.getMeasuredWidth() + paddingLeft <= zuVar.getMeasuredWidth()) {
                    int i15 = i11 - i3;
                    paddingLeft = (i15 - getPaddingRight()) - vuVar.getMeasuredWidth();
                    vuVar.layout(paddingLeft, i13 - (vuVar.getMeasuredHeight() / 2), i15 - getPaddingRight(), (vuVar.getMeasuredHeight() / 2) + i13);
                } else {
                    vuVar.layout(paddingLeft, i13 - (vuVar.getMeasuredHeight() / 2), vuVar.getMeasuredWidth() + paddingLeft, (vuVar.getMeasuredHeight() / 2) + i13);
                }
                if (l12 != null) {
                    if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft) {
                        vuVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft);
                        vuVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l12.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!zuVar.f41114a0 ? 1 : 0)) - (!zuVar.f41116c0 ? 1 : 0);
        int A = (int) (org.telegram.messenger.camera.q.A(30.0f, childCount2, ((i11 - i3) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt((!zuVar.f41114a0 ? 1 : 0) + (!zuVar.f41116c0 ? 1 : 0) + i16);
            if (childAt2 != null) {
                childAt2.layout(paddingLeft2, i13 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i13);
                paddingLeft2 = childAt2.getMeasuredWidth() + A + paddingLeft2;
            }
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int i11;
        vu vuVar;
        vu vuVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        zu zuVar = this.f37807r;
        float f11 = 0.0f;
        if (!zuVar.f41114a0 && (vuVar2 = zuVar.E) != null) {
            f10 = vuVar2.getAlpha() * org.telegram.messenger.g0.L(33.0f);
        } else {
            f10 = 0.0f;
        }
        int i12 = paddingRight - ((int) f10);
        if (!zuVar.f41116c0 && (vuVar = zuVar.F) != null) {
            f11 = vuVar.getAlpha() * org.telegram.messenger.g0.L(33.0f);
        }
        int i13 = i12 - ((int) f11);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, i10);
                int measuredWidth = childAt.getMeasuredWidth();
                if (i14 + 1 < getChildCount()) {
                    i11 = org.telegram.messenger.g0.L(3.0f);
                } else {
                    i11 = 0;
                }
                i13 = measuredWidth + i11 + i13;
            }
        }
        if (!this.h) {
            setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        } else {
            setMeasuredDimension(Math.max(i13, View.MeasureSpec.getSize(i3)), View.MeasureSpec.getSize(i10));
        }
    }
}

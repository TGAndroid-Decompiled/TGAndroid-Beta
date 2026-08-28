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
public final class fv extends LinearLayout {
    public final a0.h f28571a;
    public final Paint f28572b;
    public final RectF f28573c;
    public final RectF d;
    public final RectF f28574e;
    public final Path f28575f;
    public final boolean h;
    public final boolean f28576n;
    public final nv f28577r;

    public fv(nv nvVar, Context context, boolean z10, boolean z11) {
        super(context);
        this.f28577r = nvVar;
        this.h = z10;
        this.f28576n = z11;
        this.f28571a = new a0.h();
        this.f28572b = new Paint(1);
        this.f28573c = new RectF();
        this.d = new RectF();
        this.f28574e = new RectF();
        this.f28575f = new Path();
    }

    public final void a(RectF rectF, int i9) {
        View childAt = getChildAt(g7.n.b(i9, 0, getChildCount() - 1));
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
        nv nvVar = this.f28577r;
        boolean z10 = nvVar.f31184n;
        lv lvVar = nvVar.C;
        for (Map.Entry entry : nvVar.D.entrySet()) {
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
        if (nvVar.f31186s == null) {
            nvVar.f31186s = new y5(this, 350L, gr.h);
        }
        y5 y5Var = nvVar.f31186s;
        float f12 = 0.0f;
        if (nvVar.f31185r) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        int i9 = 0;
        float d = y5Var.d(f10, false);
        int floor = (int) Math.floor(nvVar.G);
        RectF rectF = this.f28573c;
        a(rectF, floor);
        RectF rectF2 = this.d;
        a(rectF2, (int) Math.ceil(nvVar.G));
        float f13 = nvVar.G - floor;
        RectF rectF3 = this.f28574e;
        AndroidUtilities.lerp(rectF, rectF2, f13, rectF3);
        if (lvVar != null) {
            float f14 = nvVar.G;
            if (nvVar.A != null) {
                i9 = 1;
            }
            f12 = 1.0f - Utilities.clamp01(Math.abs(f14 - (i9 + 1)));
        }
        float f15 = nvVar.H;
        float f16 = (1.0f - f15) * 4.0f * f15;
        float B = e2.c.B(f16, 0.3f, 1.0f, rectF3.width() / 2.0f);
        float height = (1.0f - (f16 * 0.05f)) * (rectF3.height() / 2.0f);
        rectF3.set(rectF3.centerX() - B, rectF3.centerY() - height, rectF3.centerX() + B, rectF3.centerY() + height);
        float dp = AndroidUtilities.dp(AndroidUtilities.lerp(8.0f, 16.0f, f12));
        int k10 = nvVar.k();
        Paint paint = this.f28572b;
        paint.setColor(k10);
        if (z10) {
            paint.setAlpha((int) ((1.0f - (f12 * 0.5f)) * paint.getAlpha() * d));
        } else {
            paint.setAlpha((int) (paint.getAlpha() * d));
        }
        Path path = this.f28575f;
        path.rewind();
        boolean z11 = this.f28576n;
        if (z11) {
            f11 = rectF3.height() / 2.0f;
        } else {
            f11 = dp;
        }
        if (z11) {
            dp = rectF3.height() / 2.0f;
        }
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF3, f11, dp, direction);
        canvas.drawPath(path, paint);
        if (z10) {
            path.rewind();
            a(rectF3, 1);
            path.addRoundRect(rectF3, AndroidUtilities.dpf2(16.0f), AndroidUtilities.dpf2(16.0f), direction);
            paint.setColor(nvVar.k());
            paint.setAlpha((int) (paint.getAlpha() * 0.5f));
            canvas.drawPath(path, paint);
        }
        if (lvVar != null) {
            path.addCircle(AndroidUtilities.dp(15.0f) + lvVar.getLeft(), (lvVar.getBottom() + lvVar.getTop()) / 2.0f, AndroidUtilities.dp(15.0f), direction);
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f28577r.C) {
            canvas.save();
            canvas.clipPath(this.f28575f);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        a0.h hVar;
        long j10;
        TLRPC.StickerSet stickerSet;
        nv nvVar = this.f28577r;
        jv jvVar = nvVar.B;
        int i13 = (i12 - i10) / 2;
        if (this.h) {
            int paddingLeft = getPaddingLeft();
            int i14 = 0;
            while (true) {
                int childCount = getChildCount();
                hVar = this.f28571a;
                if (i14 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i14);
                if (childAt != jvVar && !nvVar.D.containsKey(childAt) && childAt != null) {
                    childAt.layout(paddingLeft, i13 - (childAt.getMeasuredHeight() / 2), childAt.getMeasuredWidth() + paddingLeft, (childAt.getMeasuredHeight() / 2) + i13);
                    boolean z11 = childAt instanceof jv;
                    Long l10 = null;
                    if (z11) {
                        jv jvVar2 = (jv) childAt;
                        Long l11 = jvVar2.f29845a;
                        if (l11 == null) {
                            jx jxVar = jvVar2.v;
                            if (jxVar != null && (stickerSet = jxVar.f29865b) != null) {
                                l10 = Long.valueOf(stickerSet.f22407id);
                            } else {
                                l11 = jvVar2.f29851r;
                                if (l11 == null) {
                                    TLRPC.Document document = jvVar2.f29852s;
                                    if (document != null) {
                                        l10 = Long.valueOf(document.f22386id);
                                    }
                                }
                            }
                        }
                        l10 = l11;
                    } else if (childAt instanceof lv) {
                        l10 = Long.valueOf(((lv) childAt).h);
                    }
                    if (nvVar.K && z11) {
                        jv jvVar3 = (jv) childAt;
                        if (jvVar3.f29846b) {
                            jvVar3.f29846b = false;
                            childAt.setScaleX(0.0f);
                            childAt.setScaleY(0.0f);
                            childAt.setAlpha(0.0f);
                            ViewPropertyAnimator alpha = childAt.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f);
                            if (hg.h0.d()) {
                                j10 = 0;
                            } else {
                                j10 = 200;
                            }
                            alpha.setDuration(j10).setInterpolator(gr.h).start();
                        }
                    }
                    if (l10 != null) {
                        Integer num = (Integer) hVar.f(l10.longValue());
                        if (num != null && num.intValue() != paddingLeft && Math.abs(num.intValue() - paddingLeft) < AndroidUtilities.dp(45.0f)) {
                            childAt.setTranslationX(num.intValue() - paddingLeft);
                            childAt.animate().translationX(0.0f).setDuration(250L).setInterpolator(gr.h).start();
                        }
                        hVar.k(Integer.valueOf(paddingLeft), l10.longValue());
                    }
                    if ((childAt != nvVar.f31189y || nvVar.S) && (childAt != nvVar.A || nvVar.U)) {
                        paddingLeft = org.telegram.messenger.l0.C(3.0f, childAt.getMeasuredWidth(), paddingLeft);
                    }
                }
                i14++;
            }
            if (jvVar != null) {
                Long l12 = jvVar.f29845a;
                if (getPaddingRight() + jvVar.getMeasuredWidth() + paddingLeft <= nvVar.getMeasuredWidth()) {
                    int i15 = i11 - i9;
                    paddingLeft = (i15 - getPaddingRight()) - jvVar.getMeasuredWidth();
                    jvVar.layout(paddingLeft, i13 - (jvVar.getMeasuredHeight() / 2), i15 - getPaddingRight(), (jvVar.getMeasuredHeight() / 2) + i13);
                } else {
                    jvVar.layout(paddingLeft, i13 - (jvVar.getMeasuredHeight() / 2), jvVar.getMeasuredWidth() + paddingLeft, (jvVar.getMeasuredHeight() / 2) + i13);
                }
                if (l12 != null) {
                    if (hVar.f(l12.longValue()) != null && ((Integer) hVar.f(l12.longValue())).intValue() != paddingLeft) {
                        jvVar.setTranslationX(((Integer) hVar.f(l12.longValue())).intValue() - paddingLeft);
                        jvVar.animate().translationX(0.0f).setDuration(350L).start();
                    }
                    hVar.k(Integer.valueOf(paddingLeft), l12.longValue());
                    return;
                }
                return;
            }
            return;
        }
        int childCount2 = (getChildCount() - (!nvVar.S ? 1 : 0)) - (!nvVar.U ? 1 : 0);
        int A = (int) (org.telegram.messenger.ll.A(30.0f, childCount2, ((i11 - i9) - getPaddingLeft()) - getPaddingRight()) / Math.max(1, childCount2 - 1));
        int paddingLeft2 = getPaddingLeft();
        for (int i16 = 0; i16 < childCount2; i16++) {
            View childAt2 = getChildAt((!nvVar.S ? 1 : 0) + (!nvVar.U ? 1 : 0) + i16);
            if (childAt2 != null) {
                childAt2.layout(paddingLeft2, i13 - (childAt2.getMeasuredHeight() / 2), childAt2.getMeasuredWidth() + paddingLeft2, (childAt2.getMeasuredHeight() / 2) + i13);
                paddingLeft2 = childAt2.getMeasuredWidth() + A + paddingLeft2;
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        int i11;
        jv jvVar;
        jv jvVar2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(99999999, Integer.MIN_VALUE);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        nv nvVar = this.f28577r;
        float f11 = 0.0f;
        if (!nvVar.S && (jvVar2 = nvVar.f31189y) != null) {
            f10 = jvVar2.getAlpha() * AndroidUtilities.dp(33.0f);
        } else {
            f10 = 0.0f;
        }
        int i12 = paddingRight - ((int) f10);
        if (!nvVar.U && (jvVar = nvVar.A) != null) {
            f11 = jvVar.getAlpha() * AndroidUtilities.dp(33.0f);
        }
        int i13 = i12 - ((int) f11);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null) {
                childAt.measure(makeMeasureSpec, i10);
                int measuredWidth = childAt.getMeasuredWidth();
                if (i14 + 1 < getChildCount()) {
                    i11 = AndroidUtilities.dp(3.0f);
                } else {
                    i11 = 0;
                }
                i13 = measuredWidth + i11 + i13;
            }
        }
        if (!this.h) {
            setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        } else {
            setMeasuredDimension(Math.max(i13, View.MeasureSpec.getSize(i9)), View.MeasureSpec.getSize(i10));
        }
    }
}

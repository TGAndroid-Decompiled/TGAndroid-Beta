package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.fj;
public final class u9 extends View {
    public final Paint f32124a;
    public float f32125b;
    public float f32126c;
    public long d;
    public final Path f32127e;
    public final ArrayList f32128f;
    public float h;
    public float f32129n;
    public final v9 f32130r;

    public u9(v9 v9Var, Context context) {
        super(context);
        this.f32130r = v9Var;
        Paint paint = new Paint(1);
        this.f32124a = paint;
        this.d = 0L;
        this.f32127e = new Path();
        this.f32128f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f32128f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        v9 v9Var = this.f32130r;
        if (v9Var.x() && !v9Var.f32193i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && a8.w9.b((int) this.f32125b, (int) this.f32126c, (int) motionEvent.getX(), (int) motionEvent.getY()) < v9Var.f32201m) {
                    v9Var.K(motionEvent.getRawX(), motionEvent.getRawY());
                    v9Var.u();
                    v9Var.f(false);
                    return true;
                }
            } else {
                this.f32125b = motionEvent.getX();
                this.f32126c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f32128f;
            if (!arrayList.isEmpty()) {
                arrayList.clear();
                setSystemGestureExclusionRects(arrayList);
            }
        }
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        v9 v9Var = this.f32130r;
        if (v9Var.f32194i0 && (viewGroup = v9Var.F) != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f fVar;
        int i7;
        char c10;
        float f10;
        int i10;
        boolean isRtlCharAt;
        fj fjVar;
        float f11;
        boolean z10;
        int i11;
        v9 v9Var = this.f32130r;
        f fVar2 = v9Var.m0;
        OvershootInterpolator overshootInterpolator = v9Var.f32184c0;
        RectF rectF = v9Var.S;
        RectF rectF2 = v9Var.T;
        l9 l9Var = v9Var.f32180a0;
        if (v9Var.x()) {
            int L = org.telegram.messenger.g0.L(22.0f);
            int i12 = v9Var.f32213x;
            v9Var.N();
            q9 q9Var = v9Var.W;
            Paint paint = this.f32124a;
            Path path = this.f32127e;
            if (q9Var != null) {
                canvas.save();
                int[] l10 = v9Var.l();
                c10 = 1;
                float f12 = l10[1] + v9Var.f32181b;
                f10 = 8.0f;
                float f13 = l10[0] + v9Var.f32179a;
                canvas.translate(f13, f12);
                q9 q9Var2 = v9Var.W;
                if (q9Var2 instanceof q1) {
                    fjVar = ((q1) q9Var2).getMessageObject();
                } else {
                    fjVar = null;
                }
                if (fjVar != null && fjVar.P3()) {
                    paint.setColor(v9Var.t(org.telegram.ui.ActionBar.n6.Nc));
                } else {
                    paint.setColor(v9Var.t(org.telegram.ui.ActionBar.n6.f29569mg));
                }
                int length = v9Var.s(v9Var.W, false).length();
                int i13 = v9Var.v;
                if (i13 >= 0 && i13 <= length) {
                    v9Var.i(i13, l9Var, false);
                    Layout layout = (Layout) l9Var.d;
                    if (layout != null) {
                        fVar = fVar2;
                        int i14 = v9Var.v - l9Var.f31007a;
                        int length2 = layout.getText().length();
                        if (i14 > length2) {
                            i14 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i14);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i14);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + l9Var.f31008b);
                        float f14 = primaryHorizontal + l9Var.f31009c;
                        Rect rect = (Rect) l9Var.f31010e;
                        if (rect != null) {
                            float f15 = rect.right - v9Var.f32179a;
                            i11 = rect.bottom - v9Var.f32181b;
                            f11 = f15;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(v9Var.v);
                            f11 = f14;
                            z10 = isRtlCharAt2;
                            i11 = lineBottom;
                        }
                        float f16 = i11;
                        float f17 = f12 + f16;
                        i7 = i12;
                        if (f17 > i7 + v9Var.f32185d0 && f17 < v9Var.F.getMeasuredHeight()) {
                            if (!z10) {
                                canvas.save();
                                canvas.translate(f11, f16);
                                float interpolation = overshootInterpolator.getInterpolation(v9Var.V);
                                float f18 = L;
                                float f19 = f18 / 2.0f;
                                canvas.scale(interpolation, interpolation, f19, f19);
                                path.reset();
                                Path.Direction direction = Path.Direction.CCW;
                                path.addCircle(f19, f19, f19, direction);
                                path.addRect(0.0f, 0.0f, f19, f19, direction);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f20 = f13 + f11;
                                rectF2.set(f20, f17 - f18, f20 + f18, f17 + f18);
                                rectF2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                                i10 = 1;
                                canvas.restore();
                            } else {
                                canvas.save();
                                float f21 = L;
                                canvas.translate(f11 - f21, f16);
                                float interpolation2 = overshootInterpolator.getInterpolation(v9Var.V);
                                float f22 = f21 / 2.0f;
                                canvas.scale(interpolation2, interpolation2, f22, f22);
                                path.reset();
                                Path.Direction direction2 = Path.Direction.CCW;
                                path.addCircle(f22, f22, f22, direction2);
                                path.addRect(f22, 0.0f, f21, f22, direction2);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f23 = f13 + f11;
                                rectF2.set(f23 - f21, f17 - f21, f23, f17 + f21);
                                rectF2.inset(-org.telegram.messenger.g0.L(8.0f), -org.telegram.messenger.g0.L(8.0f));
                            }
                        } else {
                            rectF2.setEmpty();
                        }
                        i10 = 0;
                        canvas.restore();
                    }
                }
                fVar = fVar2;
                i7 = i12;
                i10 = 0;
                canvas.restore();
            } else {
                fVar = fVar2;
                i7 = i12;
                c10 = 1;
                f10 = 8.0f;
                i10 = 0;
            }
            v9Var.O();
            if (v9Var.W != null) {
                canvas.save();
                int[] l11 = v9Var.l();
                float f24 = l11[c10] + v9Var.f32181b;
                float f25 = l11[0] + v9Var.f32179a;
                canvas.translate(f25, f24);
                int length3 = v9Var.s(v9Var.W, false).length();
                int i15 = v9Var.f32211u;
                if (i15 >= 0 && i15 <= length3) {
                    v9Var.i(i15, l9Var, false);
                    Layout layout2 = (Layout) l9Var.d;
                    if (layout2 != null) {
                        int i16 = v9Var.f32211u - l9Var.f31007a;
                        int lineForOffset2 = layout2.getLineForOffset(i16);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i16);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + l9Var.f31008b);
                        float f26 = primaryHorizontal2 + l9Var.f31009c;
                        Rect rect2 = (Rect) l9Var.f31010e;
                        if (rect2 != null) {
                            f26 = rect2.left - v9Var.f32179a;
                            lineBottom2 = rect2.bottom - v9Var.f32181b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(v9Var.f32211u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 > i7 + v9Var.f32185d0 && f28 < v9Var.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f29 = L;
                                canvas.translate(f26 - f29, f27);
                                float interpolation3 = overshootInterpolator.getInterpolation(v9Var.V);
                                float f30 = f29 / 2.0f;
                                canvas.scale(interpolation3, interpolation3, f30, f30);
                                path.reset();
                                Path.Direction direction3 = Path.Direction.CCW;
                                path.addCircle(f30, f30, f30, direction3);
                                path.addRect(f30, 0.0f, f29, f30, direction3);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f31 = f25 + f26;
                                rectF.set(f31 - f29, f28 - f29, f31, f28 + f29);
                                rectF.inset(-org.telegram.messenger.g0.L(f10), -org.telegram.messenger.g0.L(f10));
                                i10++;
                            } else {
                                canvas.save();
                                canvas.translate(f26, f27);
                                float interpolation4 = overshootInterpolator.getInterpolation(v9Var.V);
                                float f32 = L;
                                float f33 = f32 / 2.0f;
                                canvas.scale(interpolation4, interpolation4, f33, f33);
                                path.reset();
                                Path.Direction direction4 = Path.Direction.CCW;
                                path.addCircle(f33, f33, f33, direction4);
                                path.addRect(0.0f, 0.0f, f33, f33, direction4);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f34 = f25 + f26;
                                rectF.set(f34, f28 - f32, f34 + f32, f28 + f32);
                                rectF.inset(-org.telegram.messenger.g0.L(f10), -org.telegram.messenger.g0.L(f10));
                            }
                        } else {
                            if (f28 > 0.0f && f28 - v9Var.m() < v9Var.F.getMeasuredHeight()) {
                                i10++;
                            }
                            rectF.setEmpty();
                        }
                    }
                }
                canvas.restore();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f32128f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i10 != 0 && v9Var.f32193i) {
                if (!v9Var.f32195j) {
                    v9Var.N();
                }
                v9.a(v9Var, v9Var.f32182b0);
                if (v9Var.I != v9Var.H || v9Var.L != v9Var.K) {
                    invalidate();
                }
            }
            if (!v9Var.Q) {
                org.telegram.messenger.g0.r(fVar);
                org.telegram.messenger.g0.g3(fVar);
            }
            org.telegram.ui.ActionBar.y3 y3Var = v9Var.Y;
            if (y3Var != null) {
                y3Var.invalidateContentRect();
                org.telegram.ui.ActionBar.y3 y3Var2 = v9Var.Y;
                if (y3Var2 != null) {
                    y3Var2.c();
                }
            }
            if (v9Var.f32197k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.u9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

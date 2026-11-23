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
import org.telegram.messenger.gj;
public final class v9 extends View {
    public final Paint f32178a;
    public float f32179b;
    public float f32180c;
    public long d;
    public final Path f32181e;
    public final ArrayList f32182f;
    public float h;
    public float f32183n;
    public final w9 f32184r;

    public v9(w9 w9Var, Context context) {
        super(context);
        this.f32184r = w9Var;
        Paint paint = new Paint(1);
        this.f32178a = paint;
        this.d = 0L;
        this.f32181e = new Path();
        this.f32182f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f32182f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        w9 w9Var = this.f32184r;
        if (w9Var.x() && !w9Var.f32248i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && a8.x9.b((int) this.f32179b, (int) this.f32180c, (int) motionEvent.getX(), (int) motionEvent.getY()) < w9Var.f32256m) {
                    w9Var.K(motionEvent.getRawX(), motionEvent.getRawY());
                    w9Var.u();
                    w9Var.f(false);
                    return true;
                }
            } else {
                this.f32179b = motionEvent.getX();
                this.f32180c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f32182f;
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
        w9 w9Var = this.f32184r;
        if (w9Var.f32249i0 && (viewGroup = w9Var.F) != null) {
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
        gj gjVar;
        float f11;
        boolean z10;
        int i11;
        w9 w9Var = this.f32184r;
        f fVar2 = w9Var.m0;
        OvershootInterpolator overshootInterpolator = w9Var.f32239c0;
        RectF rectF = w9Var.S;
        RectF rectF2 = w9Var.T;
        m9 m9Var = w9Var.f32235a0;
        if (w9Var.x()) {
            int L = org.telegram.messenger.g0.L(22.0f);
            int i12 = w9Var.f32268x;
            w9Var.N();
            r9 r9Var = w9Var.W;
            Paint paint = this.f32178a;
            Path path = this.f32181e;
            if (r9Var != null) {
                canvas.save();
                int[] l10 = w9Var.l();
                c10 = 1;
                float f12 = l10[1] + w9Var.f32236b;
                f10 = 8.0f;
                float f13 = l10[0] + w9Var.f32234a;
                canvas.translate(f13, f12);
                r9 r9Var2 = w9Var.W;
                if (r9Var2 instanceof r1) {
                    gjVar = ((r1) r9Var2).getMessageObject();
                } else {
                    gjVar = null;
                }
                if (gjVar != null && gjVar.P3()) {
                    paint.setColor(w9Var.t(org.telegram.ui.ActionBar.m6.Nc));
                } else {
                    paint.setColor(w9Var.t(org.telegram.ui.ActionBar.m6.f29520mg));
                }
                int length = w9Var.s(w9Var.W, false).length();
                int i13 = w9Var.v;
                if (i13 >= 0 && i13 <= length) {
                    w9Var.i(i13, m9Var, false);
                    Layout layout = (Layout) m9Var.d;
                    if (layout != null) {
                        fVar = fVar2;
                        int i14 = w9Var.v - m9Var.f31077a;
                        int length2 = layout.getText().length();
                        if (i14 > length2) {
                            i14 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i14);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i14);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + m9Var.f31078b);
                        float f14 = primaryHorizontal + m9Var.f31079c;
                        Rect rect = (Rect) m9Var.f31080e;
                        if (rect != null) {
                            float f15 = rect.right - w9Var.f32234a;
                            i11 = rect.bottom - w9Var.f32236b;
                            f11 = f15;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(w9Var.v);
                            f11 = f14;
                            z10 = isRtlCharAt2;
                            i11 = lineBottom;
                        }
                        float f16 = i11;
                        float f17 = f12 + f16;
                        i7 = i12;
                        if (f17 > i7 + w9Var.f32240d0 && f17 < w9Var.F.getMeasuredHeight()) {
                            if (!z10) {
                                canvas.save();
                                canvas.translate(f11, f16);
                                float interpolation = overshootInterpolator.getInterpolation(w9Var.V);
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
                                float interpolation2 = overshootInterpolator.getInterpolation(w9Var.V);
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
            w9Var.O();
            if (w9Var.W != null) {
                canvas.save();
                int[] l11 = w9Var.l();
                float f24 = l11[c10] + w9Var.f32236b;
                float f25 = l11[0] + w9Var.f32234a;
                canvas.translate(f25, f24);
                int length3 = w9Var.s(w9Var.W, false).length();
                int i15 = w9Var.f32266u;
                if (i15 >= 0 && i15 <= length3) {
                    w9Var.i(i15, m9Var, false);
                    Layout layout2 = (Layout) m9Var.d;
                    if (layout2 != null) {
                        int i16 = w9Var.f32266u - m9Var.f31077a;
                        int lineForOffset2 = layout2.getLineForOffset(i16);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i16);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + m9Var.f31078b);
                        float f26 = primaryHorizontal2 + m9Var.f31079c;
                        Rect rect2 = (Rect) m9Var.f31080e;
                        if (rect2 != null) {
                            f26 = rect2.left - w9Var.f32234a;
                            lineBottom2 = rect2.bottom - w9Var.f32236b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(w9Var.f32266u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 > i7 + w9Var.f32240d0 && f28 < w9Var.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f29 = L;
                                canvas.translate(f26 - f29, f27);
                                float interpolation3 = overshootInterpolator.getInterpolation(w9Var.V);
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
                                float interpolation4 = overshootInterpolator.getInterpolation(w9Var.V);
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
                            if (f28 > 0.0f && f28 - w9Var.m() < w9Var.F.getMeasuredHeight()) {
                                i10++;
                            }
                            rectF.setEmpty();
                        }
                    }
                }
                canvas.restore();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f32182f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i10 != 0 && w9Var.f32248i) {
                if (!w9Var.f32250j) {
                    w9Var.N();
                }
                w9.a(w9Var, w9Var.f32237b0);
                if (w9Var.I != w9Var.H || w9Var.L != w9Var.K) {
                    invalidate();
                }
            }
            if (!w9Var.Q) {
                org.telegram.messenger.g0.r(fVar);
                org.telegram.messenger.g0.g3(fVar);
            }
            org.telegram.ui.ActionBar.x3 x3Var = w9Var.Y;
            if (x3Var != null) {
                x3Var.invalidateContentRect();
                org.telegram.ui.ActionBar.x3 x3Var2 = w9Var.Y;
                if (x3Var2 != null) {
                    x3Var2.c();
                }
            }
            if (w9Var.f32252k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

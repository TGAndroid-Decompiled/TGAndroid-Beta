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
public final class t9 extends View {
    public final Paint f31684a;
    public float f31685b;
    public float f31686c;
    public long d;
    public final Path f31687e;
    public final ArrayList f31688f;
    public float h;
    public float f31689n;
    public final u9 f31690r;

    public t9(u9 u9Var, Context context) {
        super(context);
        this.f31690r = u9Var;
        Paint paint = new Paint(1);
        this.f31684a = paint;
        this.d = 0L;
        this.f31687e = new Path();
        this.f31688f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f31688f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        u9 u9Var = this.f31690r;
        if (u9Var.x() && !u9Var.f31749i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && a8.t9.b((int) this.f31685b, (int) this.f31686c, (int) motionEvent.getX(), (int) motionEvent.getY()) < u9Var.f31757m) {
                    u9Var.K(motionEvent.getRawX(), motionEvent.getRawY());
                    u9Var.u();
                    u9Var.f(false);
                    return true;
                }
            } else {
                this.f31685b = motionEvent.getX();
                this.f31686c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f31688f;
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
        u9 u9Var = this.f31690r;
        if (u9Var.f31750i0 && (viewGroup = u9Var.F) != null) {
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
        u9 u9Var = this.f31690r;
        f fVar2 = u9Var.m0;
        OvershootInterpolator overshootInterpolator = u9Var.f31740c0;
        RectF rectF = u9Var.S;
        RectF rectF2 = u9Var.T;
        k9 k9Var = u9Var.f31736a0;
        if (u9Var.x()) {
            int L = org.telegram.messenger.g0.L(22.0f);
            int i12 = u9Var.f31769x;
            u9Var.N();
            p9 p9Var = u9Var.W;
            Paint paint = this.f31684a;
            Path path = this.f31687e;
            if (p9Var != null) {
                canvas.save();
                int[] l10 = u9Var.l();
                c10 = 1;
                float f12 = l10[1] + u9Var.f31737b;
                f10 = 8.0f;
                float f13 = l10[0] + u9Var.f31735a;
                canvas.translate(f13, f12);
                p9 p9Var2 = u9Var.W;
                if (p9Var2 instanceof q1) {
                    gjVar = ((q1) p9Var2).getMessageObject();
                } else {
                    gjVar = null;
                }
                if (gjVar != null && gjVar.P3()) {
                    paint.setColor(u9Var.t(org.telegram.ui.ActionBar.j6.Nc));
                } else {
                    paint.setColor(u9Var.t(org.telegram.ui.ActionBar.j6.f29022mg));
                }
                int length = u9Var.s(u9Var.W, false).length();
                int i13 = u9Var.v;
                if (i13 >= 0 && i13 <= length) {
                    u9Var.i(i13, k9Var, false);
                    Layout layout = (Layout) k9Var.d;
                    if (layout != null) {
                        fVar = fVar2;
                        int i14 = u9Var.v - k9Var.f30570a;
                        int length2 = layout.getText().length();
                        if (i14 > length2) {
                            i14 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i14);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i14);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + k9Var.f30571b);
                        float f14 = primaryHorizontal + k9Var.f30572c;
                        Rect rect = (Rect) k9Var.f30573e;
                        if (rect != null) {
                            float f15 = rect.right - u9Var.f31735a;
                            i11 = rect.bottom - u9Var.f31737b;
                            f11 = f15;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(u9Var.v);
                            f11 = f14;
                            z10 = isRtlCharAt2;
                            i11 = lineBottom;
                        }
                        float f16 = i11;
                        float f17 = f12 + f16;
                        i7 = i12;
                        if (f17 > i7 + u9Var.f31741d0 && f17 < u9Var.F.getMeasuredHeight()) {
                            if (!z10) {
                                canvas.save();
                                canvas.translate(f11, f16);
                                float interpolation = overshootInterpolator.getInterpolation(u9Var.V);
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
                                float interpolation2 = overshootInterpolator.getInterpolation(u9Var.V);
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
            u9Var.O();
            if (u9Var.W != null) {
                canvas.save();
                int[] l11 = u9Var.l();
                float f24 = l11[c10] + u9Var.f31737b;
                float f25 = l11[0] + u9Var.f31735a;
                canvas.translate(f25, f24);
                int length3 = u9Var.s(u9Var.W, false).length();
                int i15 = u9Var.f31767u;
                if (i15 >= 0 && i15 <= length3) {
                    u9Var.i(i15, k9Var, false);
                    Layout layout2 = (Layout) k9Var.d;
                    if (layout2 != null) {
                        int i16 = u9Var.f31767u - k9Var.f30570a;
                        int lineForOffset2 = layout2.getLineForOffset(i16);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i16);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + k9Var.f30571b);
                        float f26 = primaryHorizontal2 + k9Var.f30572c;
                        Rect rect2 = (Rect) k9Var.f30573e;
                        if (rect2 != null) {
                            f26 = rect2.left - u9Var.f31735a;
                            lineBottom2 = rect2.bottom - u9Var.f31737b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(u9Var.f31767u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 > i7 + u9Var.f31741d0 && f28 < u9Var.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f29 = L;
                                canvas.translate(f26 - f29, f27);
                                float interpolation3 = overshootInterpolator.getInterpolation(u9Var.V);
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
                                float interpolation4 = overshootInterpolator.getInterpolation(u9Var.V);
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
                            if (f28 > 0.0f && f28 - u9Var.m() < u9Var.F.getMeasuredHeight()) {
                                i10++;
                            }
                            rectF.setEmpty();
                        }
                    }
                }
                canvas.restore();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f31688f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i10 != 0 && u9Var.f31749i) {
                if (!u9Var.f31751j) {
                    u9Var.N();
                }
                u9.a(u9Var, u9Var.f31738b0);
                if (u9Var.I != u9Var.H || u9Var.L != u9Var.K) {
                    invalidate();
                }
            }
            if (!u9Var.Q) {
                org.telegram.messenger.g0.r(fVar);
                org.telegram.messenger.g0.h3(fVar);
            }
            org.telegram.ui.ActionBar.u3 u3Var = u9Var.Y;
            if (u3Var != null) {
                u3Var.invalidateContentRect();
                org.telegram.ui.ActionBar.u3 u3Var2 = u9Var.Y;
                if (u3Var2 != null) {
                    u3Var2.c();
                }
            }
            if (u9Var.f31753k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.t9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

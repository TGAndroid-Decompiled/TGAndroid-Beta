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
import org.telegram.messenger.kj;
public final class v9 extends View {
    public final Paint f23335a;
    public float f23336b;
    public float f23337c;
    public long d;
    public final Path e;
    public final ArrayList f23338f;
    public float h;
    public float f23339n;
    public final w9 f23340r;

    public v9(w9 w9Var, Context context) {
        super(context);
        this.f23340r = w9Var;
        Paint paint = new Paint(1);
        this.f23335a = paint;
        this.d = 0L;
        this.e = new Path();
        this.f23338f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f23338f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        w9 w9Var = this.f23340r;
        if (w9Var.x() && !w9Var.f23426i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && w7.z8.b((int) this.f23336b, (int) this.f23337c, (int) motionEvent.getX(), (int) motionEvent.getY()) < w9Var.f23434m) {
                    w9Var.K(motionEvent.getRawX(), motionEvent.getRawY());
                    w9Var.u();
                    w9Var.f(false);
                    return true;
                }
            } else {
                this.f23336b = motionEvent.getX();
                this.f23337c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f23338f;
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
        w9 w9Var = this.f23340r;
        if (w9Var.f23427i0 && (viewGroup = w9Var.F) != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        f fVar;
        int i10;
        char c10;
        float f7;
        int i11;
        boolean isRtlCharAt;
        kj kjVar;
        float f10;
        boolean z10;
        int i12;
        w9 w9Var = this.f23340r;
        f fVar2 = w9Var.m0;
        OvershootInterpolator overshootInterpolator = w9Var.f23418c0;
        RectF rectF = w9Var.S;
        RectF rectF2 = w9Var.T;
        ge.b bVar = w9Var.f23414a0;
        if (w9Var.x()) {
            int L = org.telegram.messenger.i0.L(22.0f);
            int i13 = w9Var.f23446x;
            w9Var.N();
            r9 r9Var = w9Var.W;
            Paint paint = this.f23335a;
            Path path = this.e;
            if (r9Var != null) {
                canvas.save();
                int[] l4 = w9Var.l();
                c10 = 1;
                float f11 = l4[1] + w9Var.f23415b;
                f7 = 8.0f;
                float f12 = l4[0] + w9Var.f23413a;
                canvas.translate(f12, f11);
                r9 r9Var2 = w9Var.W;
                if (r9Var2 instanceof q1) {
                    kjVar = ((q1) r9Var2).getMessageObject();
                } else {
                    kjVar = null;
                }
                if (kjVar != null && kjVar.P3()) {
                    paint.setColor(w9Var.t(org.telegram.ui.ActionBar.t6.Kc));
                } else {
                    paint.setColor(w9Var.t(org.telegram.ui.ActionBar.t6.f21049jg));
                }
                int length = w9Var.s(w9Var.W, false).length();
                int i14 = w9Var.v;
                if (i14 >= 0 && i14 <= length) {
                    w9Var.i(i14, bVar, false);
                    Layout layout = (Layout) bVar.d;
                    if (layout != null) {
                        fVar = fVar2;
                        int i15 = w9Var.v - bVar.f7471a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + bVar.f7472b);
                        float f13 = primaryHorizontal + bVar.f7473c;
                        Rect rect = (Rect) bVar.e;
                        if (rect != null) {
                            float f14 = rect.right - w9Var.f23413a;
                            i12 = rect.bottom - w9Var.f23415b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(w9Var.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 > i10 + w9Var.f23419d0 && f16 < w9Var.F.getMeasuredHeight()) {
                            if (!z10) {
                                canvas.save();
                                canvas.translate(f10, f15);
                                float interpolation = overshootInterpolator.getInterpolation(w9Var.V);
                                float f17 = L;
                                float f18 = f17 / 2.0f;
                                canvas.scale(interpolation, interpolation, f18, f18);
                                path.reset();
                                Path.Direction direction = Path.Direction.CCW;
                                path.addCircle(f18, f18, f18, direction);
                                path.addRect(0.0f, 0.0f, f18, f18, direction);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f19 = f12 + f10;
                                rectF2.set(f19, f16 - f17, f19 + f17, f16 + f17);
                                rectF2.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                                i11 = 1;
                                canvas.restore();
                            } else {
                                canvas.save();
                                float f20 = L;
                                canvas.translate(f10 - f20, f15);
                                float interpolation2 = overshootInterpolator.getInterpolation(w9Var.V);
                                float f21 = f20 / 2.0f;
                                canvas.scale(interpolation2, interpolation2, f21, f21);
                                path.reset();
                                Path.Direction direction2 = Path.Direction.CCW;
                                path.addCircle(f21, f21, f21, direction2);
                                path.addRect(f21, 0.0f, f20, f21, direction2);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f22 = f12 + f10;
                                rectF2.set(f22 - f20, f16 - f20, f22, f16 + f20);
                                rectF2.inset(-org.telegram.messenger.i0.L(8.0f), -org.telegram.messenger.i0.L(8.0f));
                            }
                        } else {
                            rectF2.setEmpty();
                        }
                        i11 = 0;
                        canvas.restore();
                    }
                }
                fVar = fVar2;
                i10 = i13;
                i11 = 0;
                canvas.restore();
            } else {
                fVar = fVar2;
                i10 = i13;
                c10 = 1;
                f7 = 8.0f;
                i11 = 0;
            }
            w9Var.O();
            if (w9Var.W != null) {
                canvas.save();
                int[] l10 = w9Var.l();
                float f23 = l10[c10] + w9Var.f23415b;
                float f24 = l10[0] + w9Var.f23413a;
                canvas.translate(f24, f23);
                int length3 = w9Var.s(w9Var.W, false).length();
                int i16 = w9Var.f23444u;
                if (i16 >= 0 && i16 <= length3) {
                    w9Var.i(i16, bVar, false);
                    Layout layout2 = (Layout) bVar.d;
                    if (layout2 != null) {
                        int i17 = w9Var.f23444u - bVar.f7471a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + bVar.f7472b);
                        float f25 = primaryHorizontal2 + bVar.f7473c;
                        Rect rect2 = (Rect) bVar.e;
                        if (rect2 != null) {
                            f25 = rect2.left - w9Var.f23413a;
                            lineBottom2 = rect2.bottom - w9Var.f23415b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(w9Var.f23444u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 > i10 + w9Var.f23419d0 && f27 < w9Var.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f28 = L;
                                canvas.translate(f25 - f28, f26);
                                float interpolation3 = overshootInterpolator.getInterpolation(w9Var.V);
                                float f29 = f28 / 2.0f;
                                canvas.scale(interpolation3, interpolation3, f29, f29);
                                path.reset();
                                Path.Direction direction3 = Path.Direction.CCW;
                                path.addCircle(f29, f29, f29, direction3);
                                path.addRect(f29, 0.0f, f28, f29, direction3);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f30 = f24 + f25;
                                rectF.set(f30 - f28, f27 - f28, f30, f27 + f28);
                                rectF.inset(-org.telegram.messenger.i0.L(f7), -org.telegram.messenger.i0.L(f7));
                                i11++;
                            } else {
                                canvas.save();
                                canvas.translate(f25, f26);
                                float interpolation4 = overshootInterpolator.getInterpolation(w9Var.V);
                                float f31 = L;
                                float f32 = f31 / 2.0f;
                                canvas.scale(interpolation4, interpolation4, f32, f32);
                                path.reset();
                                Path.Direction direction4 = Path.Direction.CCW;
                                path.addCircle(f32, f32, f32, direction4);
                                path.addRect(0.0f, 0.0f, f32, f32, direction4);
                                canvas.drawPath(path, paint);
                                canvas.restore();
                                float f33 = f24 + f25;
                                rectF.set(f33, f27 - f31, f33 + f31, f27 + f31);
                                rectF.inset(-org.telegram.messenger.i0.L(f7), -org.telegram.messenger.i0.L(f7));
                            }
                        } else {
                            if (f27 > 0.0f && f27 - w9Var.m() < w9Var.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        }
                    }
                }
                canvas.restore();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f23338f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && w9Var.f23426i) {
                if (!w9Var.f23428j) {
                    w9Var.N();
                }
                w9.a(w9Var, w9Var.f23416b0);
                if (w9Var.I != w9Var.H || w9Var.L != w9Var.K) {
                    invalidate();
                }
            }
            if (!w9Var.Q) {
                org.telegram.messenger.i0.r(fVar);
                org.telegram.messenger.i0.g3(fVar);
            }
            org.telegram.ui.ActionBar.d4 d4Var = w9Var.Y;
            if (d4Var != null) {
                d4Var.invalidateContentRect();
                org.telegram.ui.ActionBar.d4 d4Var2 = w9Var.Y;
                if (d4Var2 != null) {
                    d4Var2.c();
                }
            }
            if (w9Var.f23430k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.v9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

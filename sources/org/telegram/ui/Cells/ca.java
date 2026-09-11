package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class ca extends View {
    public final Paint f21710a;
    public float f21711b;
    public float f21712c;
    public long d;
    public final Path f21713e;
    public final ArrayList f21714f;
    public float h;
    public float f21715n;
    public final da f21716r;

    public ca(da daVar, Context context) {
        super(context);
        this.f21716r = daVar;
        Paint paint = new Paint(1);
        this.f21710a = paint;
        this.d = 0L;
        this.f21713e = new Path();
        this.f21714f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f21714f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        da daVar = this.f21716r;
        if (daVar.y() && !daVar.f21776i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && v7.z6.b((int) this.f21711b, (int) this.f21712c, (int) motionEvent.getX(), (int) motionEvent.getY()) < daVar.f21784m) {
                    daVar.L(motionEvent.getRawX(), motionEvent.getRawY());
                    daVar.v();
                    daVar.f(false);
                    return true;
                }
            } else {
                this.f21711b = motionEvent.getX();
                this.f21712c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f21714f;
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
        da daVar = this.f21716r;
        if (daVar.f21779j0 && (viewGroup = daVar.F) != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g gVar;
        int i10;
        char c10;
        float f7;
        int i11;
        ActionMode actionMode;
        boolean isRtlCharAt;
        MessageObject messageObject;
        float f10;
        boolean z10;
        int i12;
        da daVar = this.f21716r;
        g gVar2 = daVar.f21794r0;
        OvershootInterpolator overshootInterpolator = daVar.f21767c0;
        RectF rectF = daVar.S;
        RectF rectF2 = daVar.T;
        t9 t9Var = daVar.f21763a0;
        if (daVar.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = daVar.f21801x;
            daVar.O();
            y9 y9Var = daVar.W;
            Paint paint = this.f21710a;
            Path path = this.f21713e;
            if (y9Var != null) {
                canvas.save();
                int[] m10 = daVar.m();
                c10 = 1;
                float f11 = m10[1] + daVar.f21764b;
                f7 = 8.0f;
                float f12 = m10[0] + daVar.f21762a;
                canvas.translate(f12, f11);
                y9 y9Var2 = daVar.W;
                if (y9Var2 instanceof t1) {
                    messageObject = ((t1) y9Var2).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && messageObject.isOutOwner()) {
                    paint.setColor(daVar.u(org.telegram.ui.ActionBar.j6.Wb));
                } else {
                    paint.setColor(daVar.u(org.telegram.ui.ActionBar.j6.f20998vf));
                }
                int length = daVar.t(daVar.W, false).length();
                int i14 = daVar.v;
                if (i14 >= 0 && i14 <= length) {
                    daVar.j(i14, t9Var, false);
                    Layout layout = t9Var.f23296b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = daVar.v - t9Var.f23295a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + t9Var.f23297c);
                        float f13 = primaryHorizontal + t9Var.d;
                        Rect rect = t9Var.f23298e;
                        if (rect != null) {
                            float f14 = rect.right - daVar.f21762a;
                            i12 = rect.bottom - daVar.f21764b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(daVar.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 > i10 + daVar.f21770e0 && f16 < daVar.F.getMeasuredHeight()) {
                            if (!z10) {
                                canvas.save();
                                canvas.translate(f10, f15);
                                float interpolation = overshootInterpolator.getInterpolation(daVar.V);
                                float f17 = dp;
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
                                rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                                i11 = 1;
                                canvas.restore();
                            } else {
                                canvas.save();
                                float f20 = dp;
                                canvas.translate(f10 - f20, f15);
                                float interpolation2 = overshootInterpolator.getInterpolation(daVar.V);
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
                                rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                            }
                        } else {
                            rectF2.setEmpty();
                        }
                        i11 = 0;
                        canvas.restore();
                    }
                }
                gVar = gVar2;
                i10 = i13;
                i11 = 0;
                canvas.restore();
            } else {
                gVar = gVar2;
                i10 = i13;
                c10 = 1;
                f7 = 8.0f;
                i11 = 0;
            }
            daVar.P();
            if (daVar.W != null) {
                canvas.save();
                int[] m11 = daVar.m();
                float f23 = m11[c10] + daVar.f21764b;
                float f24 = m11[0] + daVar.f21762a;
                canvas.translate(f24, f23);
                int length3 = daVar.t(daVar.W, false).length();
                int i16 = daVar.f21799u;
                if (i16 >= 0 && i16 <= length3) {
                    daVar.j(i16, t9Var, false);
                    Layout layout2 = t9Var.f23296b;
                    if (layout2 != null) {
                        int i17 = daVar.f21799u - t9Var.f23295a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + t9Var.f23297c);
                        float f25 = primaryHorizontal2 + t9Var.d;
                        Rect rect2 = t9Var.f23298e;
                        if (rect2 != null) {
                            f25 = rect2.left - daVar.f21762a;
                            lineBottom2 = rect2.bottom - daVar.f21764b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(daVar.f21799u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 > i10 + daVar.f21770e0 && f27 < daVar.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f28 = dp;
                                canvas.translate(f25 - f28, f26);
                                float interpolation3 = overshootInterpolator.getInterpolation(daVar.V);
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
                                rectF.inset(-AndroidUtilities.dp(f7), -AndroidUtilities.dp(f7));
                                i11++;
                            } else {
                                canvas.save();
                                canvas.translate(f25, f26);
                                float interpolation4 = overshootInterpolator.getInterpolation(daVar.V);
                                float f31 = dp;
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
                                rectF.inset(-AndroidUtilities.dp(f7), -AndroidUtilities.dp(f7));
                            }
                        } else {
                            if (f27 > 0.0f && f27 - daVar.n() < daVar.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        }
                    }
                }
                canvas.restore();
            }
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 29) {
                ArrayList arrayList = this.f21714f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && daVar.f21776i) {
                if (!daVar.f21778j) {
                    daVar.O();
                }
                da.a(daVar, daVar.f21765b0);
                if (daVar.I != daVar.H || daVar.L != daVar.K) {
                    invalidate();
                }
            }
            if (!daVar.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = daVar.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = daVar.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.i4) actionMode2).e();
                }
            }
            if (daVar.f21780k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ca.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

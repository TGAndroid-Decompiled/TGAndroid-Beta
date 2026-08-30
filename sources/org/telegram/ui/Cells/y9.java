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
public final class y9 extends View {
    public final Paint f22627a;
    public float f22628b;
    public float f22629c;
    public long d;
    public final Path e;
    public final ArrayList f22630f;
    public float h;
    public float f22631n;
    public final z9 f22632r;

    public y9(z9 z9Var, Context context) {
        super(context);
        this.f22632r = z9Var;
        Paint paint = new Paint(1);
        this.f22627a = paint;
        this.d = 0L;
        this.e = new Path();
        this.f22630f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f22630f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        z9 z9Var = this.f22632r;
        if (z9Var.y() && !z9Var.f22678i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && k7.n6.b((int) this.f22628b, (int) this.f22629c, (int) motionEvent.getX(), (int) motionEvent.getY()) < z9Var.f22686m) {
                    z9Var.L(motionEvent.getRawX(), motionEvent.getRawY());
                    z9Var.v();
                    z9Var.f(false);
                    return true;
                }
            } else {
                this.f22628b = motionEvent.getX();
                this.f22629c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f22630f;
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
        z9 z9Var = this.f22632r;
        if (z9Var.f22681j0 && (viewGroup = z9Var.F) != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g gVar;
        int i10;
        char c3;
        float f10;
        int i11;
        ActionMode actionMode;
        boolean isRtlCharAt;
        MessageObject messageObject;
        float f11;
        boolean z4;
        int i12;
        z9 z9Var = this.f22632r;
        g gVar2 = z9Var.f22696r0;
        OvershootInterpolator overshootInterpolator = z9Var.f22670c0;
        RectF rectF = z9Var.S;
        RectF rectF2 = z9Var.T;
        p9 p9Var = z9Var.f22666a0;
        if (z9Var.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = z9Var.f22703x;
            z9Var.O();
            u9 u9Var = z9Var.W;
            Paint paint = this.f22627a;
            Path path = this.e;
            if (u9Var != null) {
                canvas.save();
                int[] m9 = z9Var.m();
                c3 = 1;
                float f12 = m9[1] + z9Var.f22667b;
                f10 = 8.0f;
                float f13 = m9[0] + z9Var.f22665a;
                canvas.translate(f13, f12);
                u9 u9Var2 = z9Var.W;
                if (u9Var2 instanceof t1) {
                    messageObject = ((t1) u9Var2).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && messageObject.isOutOwner()) {
                    paint.setColor(z9Var.u(org.telegram.ui.ActionBar.j6.Wb));
                } else {
                    paint.setColor(z9Var.u(org.telegram.ui.ActionBar.j6.f20234vf));
                }
                int length = z9Var.t(z9Var.W, false).length();
                int i14 = z9Var.v;
                if (i14 >= 0 && i14 <= length) {
                    z9Var.j(i14, p9Var, false);
                    Layout layout = p9Var.f21554b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = z9Var.v - p9Var.f21553a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + p9Var.f21555c);
                        float f14 = primaryHorizontal + p9Var.d;
                        Rect rect = p9Var.e;
                        if (rect != null) {
                            float f15 = rect.right - z9Var.f22665a;
                            i12 = rect.bottom - z9Var.f22667b;
                            f11 = f15;
                            z4 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(z9Var.v);
                            f11 = f14;
                            z4 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f16 = i12;
                        float f17 = f12 + f16;
                        i10 = i13;
                        if (f17 > i10 + z9Var.f22672e0 && f17 < z9Var.F.getMeasuredHeight()) {
                            if (!z4) {
                                canvas.save();
                                canvas.translate(f11, f16);
                                float interpolation = overshootInterpolator.getInterpolation(z9Var.V);
                                float f18 = dp;
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
                                rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                                i11 = 1;
                                canvas.restore();
                            } else {
                                canvas.save();
                                float f21 = dp;
                                canvas.translate(f11 - f21, f16);
                                float interpolation2 = overshootInterpolator.getInterpolation(z9Var.V);
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
                c3 = 1;
                f10 = 8.0f;
                i11 = 0;
            }
            z9Var.P();
            if (z9Var.W != null) {
                canvas.save();
                int[] m10 = z9Var.m();
                float f24 = m10[c3] + z9Var.f22667b;
                float f25 = m10[0] + z9Var.f22665a;
                canvas.translate(f25, f24);
                int length3 = z9Var.t(z9Var.W, false).length();
                int i16 = z9Var.f22701u;
                if (i16 >= 0 && i16 <= length3) {
                    z9Var.j(i16, p9Var, false);
                    Layout layout2 = p9Var.f21554b;
                    if (layout2 != null) {
                        int i17 = z9Var.f22701u - p9Var.f21553a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + p9Var.f21555c);
                        float f26 = primaryHorizontal2 + p9Var.d;
                        Rect rect2 = p9Var.e;
                        if (rect2 != null) {
                            f26 = rect2.left - z9Var.f22665a;
                            lineBottom2 = rect2.bottom - z9Var.f22667b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(z9Var.f22701u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 > i10 + z9Var.f22672e0 && f28 < z9Var.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f29 = dp;
                                canvas.translate(f26 - f29, f27);
                                float interpolation3 = overshootInterpolator.getInterpolation(z9Var.V);
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
                                rectF.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
                                i11++;
                            } else {
                                canvas.save();
                                canvas.translate(f26, f27);
                                float interpolation4 = overshootInterpolator.getInterpolation(z9Var.V);
                                float f32 = dp;
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
                                rectF.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
                            }
                        } else {
                            if (f28 > 0.0f && f28 - z9Var.n() < z9Var.F.getMeasuredHeight()) {
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
                ArrayList arrayList = this.f22630f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && z9Var.f22678i) {
                if (!z9Var.f22680j) {
                    z9Var.O();
                }
                z9.a(z9Var, z9Var.f22668b0);
                if (z9Var.I != z9Var.H || z9Var.L != z9Var.K) {
                    invalidate();
                }
            }
            if (!z9Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = z9Var.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = z9Var.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.j4) actionMode2).e();
                }
            }
            if (z9Var.f22682k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.y9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

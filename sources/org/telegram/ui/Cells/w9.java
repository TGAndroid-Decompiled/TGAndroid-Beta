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
public final class w9 extends View {
    public final Paint f25881a;
    public float f25882b;
    public float f25883c;
    public long d;
    public final Path f25884e;
    public final ArrayList f25885f;
    public float h;
    public float f25886n;
    public final x9 f25887r;

    public w9(x9 x9Var, Context context) {
        super(context);
        this.f25887r = x9Var;
        Paint paint = new Paint(1);
        this.f25881a = paint;
        this.d = 0L;
        this.f25884e = new Path();
        this.f25885f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f25885f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        x9 x9Var = this.f25887r;
        if (x9Var.y() && !x9Var.f25946i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && i7.z5.b((int) this.f25882b, (int) this.f25883c, (int) motionEvent.getX(), (int) motionEvent.getY()) < x9Var.f25954m) {
                    x9Var.L(motionEvent.getRawX(), motionEvent.getRawY());
                    x9Var.v();
                    x9Var.f(false);
                    return true;
                }
            } else {
                this.f25882b = motionEvent.getX();
                this.f25883c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f25885f;
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
        x9 x9Var = this.f25887r;
        if (x9Var.f25949j0 && (viewGroup = x9Var.F) != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g gVar;
        int i10;
        char c3;
        float f9;
        int i11;
        ActionMode actionMode;
        boolean isRtlCharAt;
        MessageObject messageObject;
        float f10;
        boolean z10;
        int i12;
        x9 x9Var = this.f25887r;
        g gVar2 = x9Var.f25964r0;
        OvershootInterpolator overshootInterpolator = x9Var.f25937c0;
        RectF rectF = x9Var.S;
        RectF rectF2 = x9Var.T;
        n9 n9Var = x9Var.f25933a0;
        if (x9Var.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = x9Var.f25971x;
            x9Var.O();
            s9 s9Var = x9Var.W;
            Paint paint = this.f25881a;
            Path path = this.f25884e;
            if (s9Var != null) {
                canvas.save();
                int[] m10 = x9Var.m();
                c3 = 1;
                float f11 = m10[1] + x9Var.f25934b;
                f9 = 8.0f;
                float f12 = m10[0] + x9Var.f25932a;
                canvas.translate(f12, f11);
                s9 s9Var2 = x9Var.W;
                if (s9Var2 instanceof s1) {
                    messageObject = ((s1) s9Var2).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && messageObject.isOutOwner()) {
                    paint.setColor(x9Var.u(org.telegram.ui.ActionBar.g6.Wb));
                } else {
                    paint.setColor(x9Var.u(org.telegram.ui.ActionBar.g6.f23392vf));
                }
                int length = x9Var.t(x9Var.W, false).length();
                int i14 = x9Var.v;
                if (i14 >= 0 && i14 <= length) {
                    x9Var.j(i14, n9Var, false);
                    Layout layout = n9Var.f24754b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = x9Var.v - n9Var.f24753a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + n9Var.f24755c);
                        float f13 = primaryHorizontal + n9Var.d;
                        Rect rect = n9Var.f24756e;
                        if (rect != null) {
                            float f14 = rect.right - x9Var.f25932a;
                            i12 = rect.bottom - x9Var.f25934b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(x9Var.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 > i10 + x9Var.f25940e0 && f16 < x9Var.F.getMeasuredHeight()) {
                            if (!z10) {
                                canvas.save();
                                canvas.translate(f10, f15);
                                float interpolation = overshootInterpolator.getInterpolation(x9Var.V);
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
                                float interpolation2 = overshootInterpolator.getInterpolation(x9Var.V);
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
                c3 = 1;
                f9 = 8.0f;
                i11 = 0;
            }
            x9Var.P();
            if (x9Var.W != null) {
                canvas.save();
                int[] m11 = x9Var.m();
                float f23 = m11[c3] + x9Var.f25934b;
                float f24 = m11[0] + x9Var.f25932a;
                canvas.translate(f24, f23);
                int length3 = x9Var.t(x9Var.W, false).length();
                int i16 = x9Var.f25969u;
                if (i16 >= 0 && i16 <= length3) {
                    x9Var.j(i16, n9Var, false);
                    Layout layout2 = n9Var.f24754b;
                    if (layout2 != null) {
                        int i17 = x9Var.f25969u - n9Var.f24753a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + n9Var.f24755c);
                        float f25 = primaryHorizontal2 + n9Var.d;
                        Rect rect2 = n9Var.f24756e;
                        if (rect2 != null) {
                            f25 = rect2.left - x9Var.f25932a;
                            lineBottom2 = rect2.bottom - x9Var.f25934b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(x9Var.f25969u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 > i10 + x9Var.f25940e0 && f27 < x9Var.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f28 = dp;
                                canvas.translate(f25 - f28, f26);
                                float interpolation3 = overshootInterpolator.getInterpolation(x9Var.V);
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
                                rectF.inset(-AndroidUtilities.dp(f9), -AndroidUtilities.dp(f9));
                                i11++;
                            } else {
                                canvas.save();
                                canvas.translate(f25, f26);
                                float interpolation4 = overshootInterpolator.getInterpolation(x9Var.V);
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
                                rectF.inset(-AndroidUtilities.dp(f9), -AndroidUtilities.dp(f9));
                            }
                        } else {
                            if (f27 > 0.0f && f27 - x9Var.n() < x9Var.F.getMeasuredHeight()) {
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
                ArrayList arrayList = this.f25885f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && x9Var.f25946i) {
                if (!x9Var.f25948j) {
                    x9Var.O();
                }
                x9.a(x9Var, x9Var.f25935b0);
                if (x9Var.I != x9Var.H || x9Var.L != x9Var.K) {
                    invalidate();
                }
            }
            if (!x9Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = x9Var.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = x9Var.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.g4) actionMode2).e();
                }
            }
            if (x9Var.f25950k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.w9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

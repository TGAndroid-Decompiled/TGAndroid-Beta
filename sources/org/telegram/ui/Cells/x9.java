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
public final class x9 extends View {
    public final Paint f22557a;
    public float f22558b;
    public float f22559c;
    public long d;
    public final Path e;
    public final ArrayList f22560f;
    public float h;
    public float f22561n;
    public final y9 f22562r;

    public x9(y9 y9Var, Context context) {
        super(context);
        this.f22562r = y9Var;
        Paint paint = new Paint(1);
        this.f22557a = paint;
        this.d = 0L;
        this.e = new Path();
        this.f22560f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f22560f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        y9 y9Var = this.f22562r;
        if (y9Var.y() && !y9Var.f22614i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && k7.n6.b((int) this.f22558b, (int) this.f22559c, (int) motionEvent.getX(), (int) motionEvent.getY()) < y9Var.f22622m) {
                    y9Var.L(motionEvent.getRawX(), motionEvent.getRawY());
                    y9Var.v();
                    y9Var.f(false);
                    return true;
                }
            } else {
                this.f22558b = motionEvent.getX();
                this.f22559c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f22560f;
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
        y9 y9Var = this.f22562r;
        if (y9Var.f22617j0 && (viewGroup = y9Var.F) != null) {
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
        y9 y9Var = this.f22562r;
        g gVar2 = y9Var.f22632r0;
        OvershootInterpolator overshootInterpolator = y9Var.f22606c0;
        RectF rectF = y9Var.S;
        RectF rectF2 = y9Var.T;
        o9 o9Var = y9Var.f22602a0;
        if (y9Var.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = y9Var.f22639x;
            y9Var.O();
            t9 t9Var = y9Var.W;
            Paint paint = this.f22557a;
            Path path = this.e;
            if (t9Var != null) {
                canvas.save();
                int[] m9 = y9Var.m();
                c3 = 1;
                float f12 = m9[1] + y9Var.f22603b;
                f10 = 8.0f;
                float f13 = m9[0] + y9Var.f22601a;
                canvas.translate(f13, f12);
                t9 t9Var2 = y9Var.W;
                if (t9Var2 instanceof s1) {
                    messageObject = ((s1) t9Var2).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && messageObject.isOutOwner()) {
                    paint.setColor(y9Var.u(org.telegram.ui.ActionBar.j6.Wb));
                } else {
                    paint.setColor(y9Var.u(org.telegram.ui.ActionBar.j6.f20209vf));
                }
                int length = y9Var.t(y9Var.W, false).length();
                int i14 = y9Var.v;
                if (i14 >= 0 && i14 <= length) {
                    y9Var.j(i14, o9Var, false);
                    Layout layout = o9Var.f21488b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = y9Var.v - o9Var.f21487a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + o9Var.f21489c);
                        float f14 = primaryHorizontal + o9Var.d;
                        Rect rect = o9Var.e;
                        if (rect != null) {
                            float f15 = rect.right - y9Var.f22601a;
                            i12 = rect.bottom - y9Var.f22603b;
                            f11 = f15;
                            z4 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(y9Var.v);
                            f11 = f14;
                            z4 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f16 = i12;
                        float f17 = f12 + f16;
                        i10 = i13;
                        if (f17 > i10 + y9Var.f22608e0 && f17 < y9Var.F.getMeasuredHeight()) {
                            if (!z4) {
                                canvas.save();
                                canvas.translate(f11, f16);
                                float interpolation = overshootInterpolator.getInterpolation(y9Var.V);
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
                                float interpolation2 = overshootInterpolator.getInterpolation(y9Var.V);
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
            y9Var.P();
            if (y9Var.W != null) {
                canvas.save();
                int[] m10 = y9Var.m();
                float f24 = m10[c3] + y9Var.f22603b;
                float f25 = m10[0] + y9Var.f22601a;
                canvas.translate(f25, f24);
                int length3 = y9Var.t(y9Var.W, false).length();
                int i16 = y9Var.f22637u;
                if (i16 >= 0 && i16 <= length3) {
                    y9Var.j(i16, o9Var, false);
                    Layout layout2 = o9Var.f21488b;
                    if (layout2 != null) {
                        int i17 = y9Var.f22637u - o9Var.f21487a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + o9Var.f21489c);
                        float f26 = primaryHorizontal2 + o9Var.d;
                        Rect rect2 = o9Var.e;
                        if (rect2 != null) {
                            f26 = rect2.left - y9Var.f22601a;
                            lineBottom2 = rect2.bottom - y9Var.f22603b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(y9Var.f22637u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 > i10 + y9Var.f22608e0 && f28 < y9Var.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f29 = dp;
                                canvas.translate(f26 - f29, f27);
                                float interpolation3 = overshootInterpolator.getInterpolation(y9Var.V);
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
                                float interpolation4 = overshootInterpolator.getInterpolation(y9Var.V);
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
                            if (f28 > 0.0f && f28 - y9Var.n() < y9Var.F.getMeasuredHeight()) {
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
                ArrayList arrayList = this.f22560f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && y9Var.f22614i) {
                if (!y9Var.f22616j) {
                    y9Var.O();
                }
                y9.a(y9Var, y9Var.f22604b0);
                if (y9Var.I != y9Var.H || y9Var.L != y9Var.K) {
                    invalidate();
                }
            }
            if (!y9Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = y9Var.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = y9Var.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.j4) actionMode2).e();
                }
            }
            if (y9Var.f22618k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.x9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

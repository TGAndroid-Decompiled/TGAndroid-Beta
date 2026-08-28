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
public final class z9 extends View {
    public final Paint f26041a;
    public float f26042b;
    public float f26043c;
    public long d;
    public final Path f26044e;
    public final ArrayList f26045f;
    public float h;
    public float f26046n;
    public final aa f26047r;

    public z9(aa aaVar, Context context) {
        super(context);
        this.f26047r = aaVar;
        Paint paint = new Paint(1);
        this.f26041a = paint;
        this.d = 0L;
        this.f26044e = new Path();
        this.f26045f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f26045f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        aa aaVar = this.f26047r;
        if (aaVar.y() && !aaVar.f24085i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && g7.w.b((int) this.f26042b, (int) this.f26043c, (int) motionEvent.getX(), (int) motionEvent.getY()) < aaVar.f24093m) {
                    aaVar.L(motionEvent.getRawX(), motionEvent.getRawY());
                    aaVar.v();
                    aaVar.f(false);
                    return true;
                }
            } else {
                this.f26042b = motionEvent.getX();
                this.f26043c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f26045f;
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
        aa aaVar = this.f26047r;
        if (aaVar.f24088j0 && (viewGroup = aaVar.F) != null) {
            viewGroup.invalidate();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g gVar;
        int i9;
        char c10;
        float f10;
        int i10;
        ActionMode actionMode;
        boolean isRtlCharAt;
        MessageObject messageObject;
        float f11;
        boolean z10;
        int i11;
        aa aaVar = this.f26047r;
        g gVar2 = aaVar.f24103r0;
        OvershootInterpolator overshootInterpolator = aaVar.f24076c0;
        RectF rectF = aaVar.S;
        RectF rectF2 = aaVar.T;
        q9 q9Var = aaVar.f24072a0;
        if (aaVar.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i12 = aaVar.f24110x;
            aaVar.O();
            v9 v9Var = aaVar.W;
            Paint paint = this.f26041a;
            Path path = this.f26044e;
            if (v9Var != null) {
                canvas.save();
                int[] m10 = aaVar.m();
                c10 = 1;
                float f12 = m10[1] + aaVar.f24073b;
                f10 = 8.0f;
                float f13 = m10[0] + aaVar.f24071a;
                canvas.translate(f13, f12);
                v9 v9Var2 = aaVar.W;
                if (v9Var2 instanceof t1) {
                    messageObject = ((t1) v9Var2).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && messageObject.isOutOwner()) {
                    paint.setColor(aaVar.u(org.telegram.ui.ActionBar.f6.Wb));
                } else {
                    paint.setColor(aaVar.u(org.telegram.ui.ActionBar.f6.f23325vf));
                }
                int length = aaVar.t(aaVar.W, false).length();
                int i13 = aaVar.v;
                if (i13 >= 0 && i13 <= length) {
                    aaVar.j(i13, q9Var, false);
                    Layout layout = q9Var.f24920b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i14 = aaVar.v - q9Var.f24919a;
                        int length2 = layout.getText().length();
                        if (i14 > length2) {
                            i14 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i14);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i14);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + q9Var.f24921c);
                        float f14 = primaryHorizontal + q9Var.d;
                        Rect rect = q9Var.f24922e;
                        if (rect != null) {
                            float f15 = rect.right - aaVar.f24071a;
                            i11 = rect.bottom - aaVar.f24073b;
                            f11 = f15;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(aaVar.v);
                            f11 = f14;
                            z10 = isRtlCharAt2;
                            i11 = lineBottom;
                        }
                        float f16 = i11;
                        float f17 = f12 + f16;
                        i9 = i12;
                        if (f17 > i9 + aaVar.f24079e0 && f17 < aaVar.F.getMeasuredHeight()) {
                            if (!z10) {
                                canvas.save();
                                canvas.translate(f11, f16);
                                float interpolation = overshootInterpolator.getInterpolation(aaVar.V);
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
                                i10 = 1;
                                canvas.restore();
                            } else {
                                canvas.save();
                                float f21 = dp;
                                canvas.translate(f11 - f21, f16);
                                float interpolation2 = overshootInterpolator.getInterpolation(aaVar.V);
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
                        i10 = 0;
                        canvas.restore();
                    }
                }
                gVar = gVar2;
                i9 = i12;
                i10 = 0;
                canvas.restore();
            } else {
                gVar = gVar2;
                i9 = i12;
                c10 = 1;
                f10 = 8.0f;
                i10 = 0;
            }
            aaVar.P();
            if (aaVar.W != null) {
                canvas.save();
                int[] m11 = aaVar.m();
                float f24 = m11[c10] + aaVar.f24073b;
                float f25 = m11[0] + aaVar.f24071a;
                canvas.translate(f25, f24);
                int length3 = aaVar.t(aaVar.W, false).length();
                int i15 = aaVar.f24108u;
                if (i15 >= 0 && i15 <= length3) {
                    aaVar.j(i15, q9Var, false);
                    Layout layout2 = q9Var.f24920b;
                    if (layout2 != null) {
                        int i16 = aaVar.f24108u - q9Var.f24919a;
                        int lineForOffset2 = layout2.getLineForOffset(i16);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i16);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + q9Var.f24921c);
                        float f26 = primaryHorizontal2 + q9Var.d;
                        Rect rect2 = q9Var.f24922e;
                        if (rect2 != null) {
                            f26 = rect2.left - aaVar.f24071a;
                            lineBottom2 = rect2.bottom - aaVar.f24073b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(aaVar.f24108u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 > i9 + aaVar.f24079e0 && f28 < aaVar.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f29 = dp;
                                canvas.translate(f26 - f29, f27);
                                float interpolation3 = overshootInterpolator.getInterpolation(aaVar.V);
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
                                i10++;
                            } else {
                                canvas.save();
                                canvas.translate(f26, f27);
                                float interpolation4 = overshootInterpolator.getInterpolation(aaVar.V);
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
                            if (f28 > 0.0f && f28 - aaVar.n() < aaVar.F.getMeasuredHeight()) {
                                i10++;
                            }
                            rectF.setEmpty();
                        }
                    }
                }
                canvas.restore();
            }
            int i17 = Build.VERSION.SDK_INT;
            if (i17 >= 29) {
                ArrayList arrayList = this.f26045f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i10 != 0 && aaVar.f24085i) {
                if (!aaVar.f24087j) {
                    aaVar.O();
                }
                aa.a(aaVar, aaVar.f24074b0);
                if (aaVar.I != aaVar.H || aaVar.L != aaVar.K) {
                    invalidate();
                }
            }
            if (!aaVar.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i17 >= 23 && (actionMode = aaVar.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = aaVar.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.g4) actionMode2).e();
                }
            }
            if (aaVar.f24089k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

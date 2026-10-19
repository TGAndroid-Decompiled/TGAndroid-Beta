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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
public final class z9 extends View {
    public final Paint f23880a;
    public float f23881b;
    public float f23882c;
    public long d;
    public final Path e;
    public final ArrayList f23883f;
    public float h;
    public float f23884n;
    public final aa f23885r;

    public z9(aa aaVar, Context context) {
        super(context);
        this.f23885r = aaVar;
        Paint paint = new Paint(1);
        this.f23880a = paint;
        this.d = 0L;
        this.e = new Path();
        this.f23883f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f23883f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        aa aaVar = this.f23885r;
        if (aaVar.x() && !aaVar.f21994i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && v7.f7.b((int) this.f23881b, (int) this.f23882c, (int) motionEvent.getX(), (int) motionEvent.getY()) < aaVar.f22002m) {
                    aaVar.K(motionEvent.getRawX(), motionEvent.getRawY());
                    aaVar.u();
                    aaVar.f(false);
                    return true;
                }
            } else {
                this.f23881b = motionEvent.getX();
                this.f23882c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f23883f;
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
        aa aaVar = this.f23885r;
        if (aaVar.f21995i0 && (viewGroup = aaVar.F) != null) {
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
        boolean isRtlCharAt;
        MessageObject messageObject;
        float f10;
        boolean z10;
        int i12;
        aa aaVar = this.f23885r;
        g gVar2 = aaVar.m0;
        OvershootInterpolator overshootInterpolator = aaVar.f21986c0;
        RectF rectF = aaVar.S;
        RectF rectF2 = aaVar.T;
        q9 q9Var = aaVar.f21982a0;
        if (aaVar.x()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = aaVar.f22014x;
            aaVar.N();
            v9 v9Var = aaVar.W;
            Paint paint = this.f23880a;
            Path path = this.e;
            if (v9Var != null) {
                canvas.save();
                int[] l4 = aaVar.l();
                c10 = 1;
                float f11 = l4[1] + aaVar.f21983b;
                f7 = 8.0f;
                float f12 = l4[0] + aaVar.f21981a;
                canvas.translate(f12, f11);
                v9 v9Var2 = aaVar.W;
                if (v9Var2 instanceof u1) {
                    messageObject = ((u1) v9Var2).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && messageObject.isOutOwner()) {
                    paint.setColor(aaVar.t(org.telegram.ui.ActionBar.h6.Wb));
                } else {
                    paint.setColor(aaVar.t(org.telegram.ui.ActionBar.h6.f21331vf));
                }
                int length = aaVar.s(aaVar.W, false).length();
                int i14 = aaVar.v;
                if (i14 >= 0 && i14 <= length) {
                    aaVar.i(i14, q9Var, false);
                    Layout layout = q9Var.f22792b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = aaVar.v - q9Var.f22791a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + q9Var.f22793c);
                        float f13 = primaryHorizontal + q9Var.d;
                        Rect rect = q9Var.e;
                        if (rect != null) {
                            float f14 = rect.right - aaVar.f21981a;
                            i12 = rect.bottom - aaVar.f21983b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(aaVar.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 > i10 + aaVar.f21987d0 && f16 < aaVar.F.getMeasuredHeight()) {
                            if (!z10) {
                                canvas.save();
                                canvas.translate(f10, f15);
                                float interpolation = overshootInterpolator.getInterpolation(aaVar.V);
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
                                float interpolation2 = overshootInterpolator.getInterpolation(aaVar.V);
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
            aaVar.O();
            if (aaVar.W != null) {
                canvas.save();
                int[] l10 = aaVar.l();
                float f23 = l10[c10] + aaVar.f21983b;
                float f24 = l10[0] + aaVar.f21981a;
                canvas.translate(f24, f23);
                int length3 = aaVar.s(aaVar.W, false).length();
                int i16 = aaVar.f22012u;
                if (i16 >= 0 && i16 <= length3) {
                    aaVar.i(i16, q9Var, false);
                    Layout layout2 = q9Var.f22792b;
                    if (layout2 != null) {
                        int i17 = aaVar.f22012u - q9Var.f22791a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + q9Var.f22793c);
                        float f25 = primaryHorizontal2 + q9Var.d;
                        Rect rect2 = q9Var.e;
                        if (rect2 != null) {
                            f25 = rect2.left - aaVar.f21981a;
                            lineBottom2 = rect2.bottom - aaVar.f21983b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(aaVar.f22012u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 > i10 + aaVar.f21987d0 && f27 < aaVar.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f28 = dp;
                                canvas.translate(f25 - f28, f26);
                                float interpolation3 = overshootInterpolator.getInterpolation(aaVar.V);
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
                                float interpolation4 = overshootInterpolator.getInterpolation(aaVar.V);
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
                            if (f27 > 0.0f && f27 - aaVar.m() < aaVar.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        }
                    }
                }
                canvas.restore();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f23883f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && aaVar.f21994i) {
                if (!aaVar.f21996j) {
                    aaVar.N();
                }
                aa.a(aaVar, aaVar.f21984b0);
                if (aaVar.I != aaVar.H || aaVar.L != aaVar.K) {
                    invalidate();
                }
            }
            if (!aaVar.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            org.telegram.ui.ActionBar.h4 h4Var = aaVar.Y;
            if (h4Var != null) {
                h4Var.invalidateContentRect();
                org.telegram.ui.ActionBar.h4 h4Var2 = aaVar.Y;
                if (h4Var2 != null) {
                    h4Var2.c();
                }
            }
            if (aaVar.f21998k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.z9.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

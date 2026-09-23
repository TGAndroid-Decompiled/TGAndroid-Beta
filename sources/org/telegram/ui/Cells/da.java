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
public final class da extends View {
    public final Paint f19885a;
    public float f19886b;
    public float f19887c;
    public long d;
    public final Path e;
    public final ArrayList f19888f;
    public float h;
    public float f19889n;
    public final ea f19890r;

    public da(ea eaVar, Context context) {
        super(context);
        this.f19890r = eaVar;
        Paint paint = new Paint(1);
        this.f19885a = paint;
        this.d = 0L;
        this.e = new Path();
        this.f19888f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f19888f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        ea eaVar = this.f19890r;
        if (eaVar.y() && !eaVar.f19990i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && v7.z6.b((int) this.f19886b, (int) this.f19887c, (int) motionEvent.getX(), (int) motionEvent.getY()) < eaVar.f19998m) {
                    eaVar.L(motionEvent.getRawX(), motionEvent.getRawY());
                    eaVar.v();
                    eaVar.f(false);
                    return true;
                }
            } else {
                this.f19886b = motionEvent.getX();
                this.f19887c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f19888f;
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
        ea eaVar = this.f19890r;
        if (eaVar.f19993j0 && (viewGroup = eaVar.F) != null) {
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
        ea eaVar = this.f19890r;
        g gVar2 = eaVar.f20008r0;
        OvershootInterpolator overshootInterpolator = eaVar.f19982c0;
        RectF rectF = eaVar.S;
        RectF rectF2 = eaVar.T;
        u9 u9Var = eaVar.f19978a0;
        if (eaVar.y()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = eaVar.f20015x;
            eaVar.O();
            z9 z9Var = eaVar.W;
            Paint paint = this.f19885a;
            Path path = this.e;
            if (z9Var != null) {
                canvas.save();
                int[] m10 = eaVar.m();
                c10 = 1;
                float f11 = m10[1] + eaVar.f19979b;
                f7 = 8.0f;
                float f12 = m10[0] + eaVar.f19977a;
                canvas.translate(f12, f11);
                z9 z9Var2 = eaVar.W;
                if (z9Var2 instanceof t1) {
                    messageObject = ((t1) z9Var2).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && messageObject.isOutOwner()) {
                    paint.setColor(eaVar.u(org.telegram.ui.ActionBar.h6.Wb));
                } else {
                    paint.setColor(eaVar.u(org.telegram.ui.ActionBar.h6.f19126vf));
                }
                int length = eaVar.t(eaVar.W, false).length();
                int i14 = eaVar.v;
                if (i14 >= 0 && i14 <= length) {
                    eaVar.j(i14, u9Var, false);
                    Layout layout = u9Var.f21428b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = eaVar.v - u9Var.f21427a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + u9Var.f21429c);
                        float f13 = primaryHorizontal + u9Var.d;
                        Rect rect = u9Var.e;
                        if (rect != null) {
                            float f14 = rect.right - eaVar.f19977a;
                            i12 = rect.bottom - eaVar.f19979b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(eaVar.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 > i10 + eaVar.f19984e0 && f16 < eaVar.F.getMeasuredHeight()) {
                            if (!z10) {
                                canvas.save();
                                canvas.translate(f10, f15);
                                float interpolation = overshootInterpolator.getInterpolation(eaVar.V);
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
                                float interpolation2 = overshootInterpolator.getInterpolation(eaVar.V);
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
            eaVar.P();
            if (eaVar.W != null) {
                canvas.save();
                int[] m11 = eaVar.m();
                float f23 = m11[c10] + eaVar.f19979b;
                float f24 = m11[0] + eaVar.f19977a;
                canvas.translate(f24, f23);
                int length3 = eaVar.t(eaVar.W, false).length();
                int i16 = eaVar.f20013u;
                if (i16 >= 0 && i16 <= length3) {
                    eaVar.j(i16, u9Var, false);
                    Layout layout2 = u9Var.f21428b;
                    if (layout2 != null) {
                        int i17 = eaVar.f20013u - u9Var.f21427a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + u9Var.f21429c);
                        float f25 = primaryHorizontal2 + u9Var.d;
                        Rect rect2 = u9Var.e;
                        if (rect2 != null) {
                            f25 = rect2.left - eaVar.f19977a;
                            lineBottom2 = rect2.bottom - eaVar.f19979b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(eaVar.f20013u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 > i10 + eaVar.f19984e0 && f27 < eaVar.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f28 = dp;
                                canvas.translate(f25 - f28, f26);
                                float interpolation3 = overshootInterpolator.getInterpolation(eaVar.V);
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
                                float interpolation4 = overshootInterpolator.getInterpolation(eaVar.V);
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
                            if (f27 > 0.0f && f27 - eaVar.n() < eaVar.F.getMeasuredHeight()) {
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
                ArrayList arrayList = this.f19888f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && eaVar.f19990i) {
                if (!eaVar.f19992j) {
                    eaVar.O();
                }
                ea.a(eaVar, eaVar.f19980b0);
                if (eaVar.I != eaVar.H || eaVar.L != eaVar.K) {
                    invalidate();
                }
            }
            if (!eaVar.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = eaVar.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = eaVar.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.h4) actionMode2).e();
                }
            }
            if (eaVar.f19994k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.da.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

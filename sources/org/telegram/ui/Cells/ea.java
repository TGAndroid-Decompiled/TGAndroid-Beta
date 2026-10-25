package org.telegram.ui.Cells;

import a8.ic;
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
public final class ea extends View {
    public final Paint f24036a;
    public float f24037b;
    public float f24038c;
    public long d;
    public final Path e;
    public final ArrayList f24039f;
    public float h;
    public float f24040n;
    public final fa f24041r;

    public ea(fa faVar, Context context) {
        super(context);
        this.f24041r = faVar;
        Paint paint = new Paint(1);
        this.f24036a = paint;
        this.d = 0L;
        this.e = new Path();
        this.f24039f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f24039f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        fa faVar = this.f24041r;
        if (faVar.x() && !faVar.f24098i) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 && System.currentTimeMillis() - this.d < 200 && ic.b((int) this.f24037b, (int) this.f24038c, (int) motionEvent.getX(), (int) motionEvent.getY()) < faVar.f24106m) {
                    faVar.K(motionEvent.getRawX(), motionEvent.getRawY());
                    faVar.u();
                    faVar.f(false);
                    return true;
                }
            } else {
                this.f24037b = motionEvent.getX();
                this.f24038c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f24039f;
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
        fa faVar = this.f24041r;
        if (faVar.f24099i0 && (viewGroup = faVar.F) != null) {
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
        fa faVar = this.f24041r;
        g gVar2 = faVar.m0;
        OvershootInterpolator overshootInterpolator = faVar.f24090c0;
        RectF rectF = faVar.S;
        RectF rectF2 = faVar.T;
        v9 v9Var = faVar.f24086a0;
        if (faVar.x()) {
            int dp = AndroidUtilities.dp(22.0f);
            int i13 = faVar.f24118x;
            faVar.N();
            aa aaVar = faVar.W;
            Paint paint = this.f24036a;
            Path path = this.e;
            if (aaVar != null) {
                canvas.save();
                int[] l4 = faVar.l();
                c10 = 1;
                float f11 = l4[1] + faVar.f24087b;
                f7 = 8.0f;
                float f12 = l4[0] + faVar.f24085a;
                canvas.translate(f12, f11);
                aa aaVar2 = faVar.W;
                if (aaVar2 instanceof s1) {
                    messageObject = ((s1) aaVar2).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && messageObject.isOutOwner()) {
                    paint.setColor(faVar.t(org.telegram.ui.ActionBar.y6.Wb));
                } else {
                    paint.setColor(faVar.t(org.telegram.ui.ActionBar.y6.f23698vf));
                }
                int length = faVar.s(faVar.W, false).length();
                int i14 = faVar.v;
                if (i14 >= 0 && i14 <= length) {
                    faVar.i(i14, v9Var, false);
                    Layout layout = v9Var.f25602b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = faVar.v - v9Var.f25601a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + v9Var.f25603c);
                        float f13 = primaryHorizontal + v9Var.d;
                        Rect rect = v9Var.e;
                        if (rect != null) {
                            float f14 = rect.right - faVar.f24085a;
                            i12 = rect.bottom - faVar.f24087b;
                            f10 = f14;
                            z10 = false;
                        } else {
                            boolean isRtlCharAt2 = layout.isRtlCharAt(faVar.v);
                            f10 = f13;
                            z10 = isRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f15 = i12;
                        float f16 = f11 + f15;
                        i10 = i13;
                        if (f16 > i10 + faVar.f24091d0 && f16 < faVar.F.getMeasuredHeight()) {
                            if (!z10) {
                                canvas.save();
                                canvas.translate(f10, f15);
                                float interpolation = overshootInterpolator.getInterpolation(faVar.V);
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
                                float interpolation2 = overshootInterpolator.getInterpolation(faVar.V);
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
            faVar.O();
            if (faVar.W != null) {
                canvas.save();
                int[] l10 = faVar.l();
                float f23 = l10[c10] + faVar.f24087b;
                float f24 = l10[0] + faVar.f24085a;
                canvas.translate(f24, f23);
                int length3 = faVar.s(faVar.W, false).length();
                int i16 = faVar.f24116u;
                if (i16 >= 0 && i16 <= length3) {
                    faVar.i(i16, v9Var, false);
                    Layout layout2 = v9Var.f25602b;
                    if (layout2 != null) {
                        int i17 = faVar.f24116u - v9Var.f25601a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + v9Var.f25603c);
                        float f25 = primaryHorizontal2 + v9Var.d;
                        Rect rect2 = v9Var.e;
                        if (rect2 != null) {
                            f25 = rect2.left - faVar.f24085a;
                            lineBottom2 = rect2.bottom - faVar.f24087b;
                            isRtlCharAt = false;
                        } else {
                            isRtlCharAt = layout2.isRtlCharAt(faVar.f24116u);
                        }
                        float f26 = lineBottom2;
                        float f27 = f23 + f26;
                        if (f27 > i10 + faVar.f24091d0 && f27 < faVar.F.getMeasuredHeight()) {
                            if (!isRtlCharAt) {
                                canvas.save();
                                float f28 = dp;
                                canvas.translate(f25 - f28, f26);
                                float interpolation3 = overshootInterpolator.getInterpolation(faVar.V);
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
                                float interpolation4 = overshootInterpolator.getInterpolation(faVar.V);
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
                            if (f27 > 0.0f && f27 - faVar.m() < faVar.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        }
                    }
                }
                canvas.restore();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f24039f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && faVar.f24098i) {
                if (!faVar.f24100j) {
                    faVar.N();
                }
                fa.a(faVar, faVar.f24088b0);
                if (faVar.I != faVar.H || faVar.L != faVar.K) {
                    invalidate();
                }
            }
            if (!faVar.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            org.telegram.ui.ActionBar.m4 m4Var = faVar.Y;
            if (m4Var != null) {
                m4Var.invalidateContentRect();
                org.telegram.ui.ActionBar.m4 m4Var2 = faVar.Y;
                if (m4Var2 != null) {
                    m4Var2.c();
                }
            }
            if (faVar.f24102k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.ea.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

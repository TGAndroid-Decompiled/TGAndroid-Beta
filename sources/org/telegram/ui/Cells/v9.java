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
import android.view.ViewParent;
import android.view.animation.OvershootInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

public final class v9 extends View {

    public final Paint f25820a;

    public float f25821b;

    public float f25822c;
    public long d;

    public final Path f25823e;

    public final ArrayList f25824f;
    public float h;

    public float f25825n;

    public final w9 f25826r;

    public v9(w9 w9Var, Context context) {
        super(context);
        this.f25826r = w9Var;
        Paint paint = new Paint(1);
        this.f25820a = paint;
        this.d = 0L;
        this.f25823e = new Path();
        this.f25824f = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
    }

    public final void a(RectF rectF) {
        if (rectF.isEmpty()) {
            return;
        }
        this.f25824f.add(new Rect((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom)));
    }

    public final boolean b(MotionEvent motionEvent) {
        w9 w9Var = this.f25826r;
        if (w9Var.y() && !w9Var.f25872i) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f25821b = motionEvent.getX();
                this.f25822c = motionEvent.getY();
                this.d = System.currentTimeMillis();
            } else if (action == 1 && System.currentTimeMillis() - this.d < 200 && h7.y.b((int) this.f25821b, (int) this.f25822c, (int) motionEvent.getX(), (int) motionEvent.getY()) < w9Var.f25880m) {
                w9Var.L(motionEvent.getRawX(), motionEvent.getRawY());
                w9Var.v();
                w9Var.f(false);
                return true;
            }
        }
        return false;
    }

    public final void c() {
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.f25824f;
            if (arrayList.isEmpty()) {
                return;
            }
            arrayList.clear();
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        w9 w9Var = this.f25826r;
        if (!w9Var.f25875j0 || (viewGroup = w9Var.F) == null) {
            return;
        }
        viewGroup.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        g gVar;
        int i10;
        char c10;
        float f10;
        int i11;
        ActionMode actionMode;
        boolean zIsRtlCharAt;
        float f11;
        boolean z10;
        int i12;
        w9 w9Var = this.f25826r;
        g gVar2 = w9Var.f25890r0;
        OvershootInterpolator overshootInterpolator = w9Var.f25863c0;
        RectF rectF = w9Var.S;
        RectF rectF2 = w9Var.T;
        m9 m9Var = w9Var.f25859a0;
        if (w9Var.y()) {
            int iDp = AndroidUtilities.dp(22.0f);
            int i13 = w9Var.f25897x;
            w9Var.O();
            r9 r9Var = w9Var.W;
            Paint paint = this.f25820a;
            Path path = this.f25823e;
            if (r9Var != null) {
                canvas.save();
                int[] iArrM = w9Var.m();
                c10 = 1;
                float f12 = iArrM[1] + w9Var.f25860b;
                f10 = 8.0f;
                float f13 = iArrM[0] + w9Var.f25858a;
                canvas.translate(f13, f12);
                r9 r9Var2 = w9Var.W;
                MessageObject messageObject = r9Var2 instanceof s1 ? ((s1) r9Var2).getMessageObject() : null;
                if (messageObject == null || !messageObject.isOutOwner()) {
                    paint.setColor(w9Var.u(org.telegram.ui.ActionBar.g6.f23382vf));
                } else {
                    paint.setColor(w9Var.u(org.telegram.ui.ActionBar.g6.Wb));
                }
                int length = w9Var.t(w9Var.W, false).length();
                int i14 = w9Var.v;
                if (i14 < 0 || i14 > length) {
                    gVar = gVar2;
                    i10 = i13;
                    i11 = 0;
                } else {
                    w9Var.j(i14, m9Var, false);
                    Layout layout = m9Var.f24688b;
                    if (layout != null) {
                        gVar = gVar2;
                        int i15 = w9Var.v - m9Var.f24687a;
                        int length2 = layout.getText().length();
                        if (i15 > length2) {
                            i15 = length2;
                        }
                        int lineForOffset = layout.getLineForOffset(i15);
                        float primaryHorizontal = layout.getPrimaryHorizontal(i15);
                        int lineBottom = (int) (layout.getLineBottom(lineForOffset) + m9Var.f24689c);
                        float f14 = primaryHorizontal + m9Var.d;
                        Rect rect = m9Var.f24690e;
                        if (rect != null) {
                            float f15 = rect.right - w9Var.f25858a;
                            i12 = rect.bottom - w9Var.f25860b;
                            f11 = f15;
                            z10 = false;
                        } else {
                            boolean zIsRtlCharAt2 = layout.isRtlCharAt(w9Var.v);
                            f11 = f14;
                            z10 = zIsRtlCharAt2;
                            i12 = lineBottom;
                        }
                        float f16 = i12;
                        float f17 = f12 + f16;
                        i10 = i13;
                        if (f17 <= i10 + w9Var.f25866e0 || f17 >= w9Var.F.getMeasuredHeight()) {
                            rectF2.setEmpty();
                        } else if (z10) {
                            canvas.save();
                            float f18 = iDp;
                            canvas.translate(f11 - f18, f16);
                            float interpolation = overshootInterpolator.getInterpolation(w9Var.V);
                            float f19 = f18 / 2.0f;
                            canvas.scale(interpolation, interpolation, f19, f19);
                            path.reset();
                            Path.Direction direction = Path.Direction.CCW;
                            path.addCircle(f19, f19, f19, direction);
                            path.addRect(f19, 0.0f, f18, f19, direction);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f20 = f13 + f11;
                            rectF2.set(f20 - f18, f17 - f18, f20, f17 + f18);
                            rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                        } else {
                            canvas.save();
                            canvas.translate(f11, f16);
                            float interpolation2 = overshootInterpolator.getInterpolation(w9Var.V);
                            float f21 = iDp;
                            float f22 = f21 / 2.0f;
                            canvas.scale(interpolation2, interpolation2, f22, f22);
                            path.reset();
                            Path.Direction direction2 = Path.Direction.CCW;
                            path.addCircle(f22, f22, f22, direction2);
                            path.addRect(0.0f, 0.0f, f22, f22, direction2);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f23 = f13 + f11;
                            rectF2.set(f23, f17 - f21, f23 + f21, f17 + f21);
                            rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                            i11 = 1;
                        }
                    } else {
                        gVar = gVar2;
                        i10 = i13;
                    }
                    i11 = 0;
                }
                canvas.restore();
            } else {
                gVar = gVar2;
                i10 = i13;
                c10 = 1;
                f10 = 8.0f;
                i11 = 0;
            }
            w9Var.P();
            if (w9Var.W != null) {
                canvas.save();
                int[] iArrM2 = w9Var.m();
                float f24 = iArrM2[c10] + w9Var.f25860b;
                float f25 = iArrM2[0] + w9Var.f25858a;
                canvas.translate(f25, f24);
                int length3 = w9Var.t(w9Var.W, false).length();
                int i16 = w9Var.f25895u;
                if (i16 >= 0 && i16 <= length3) {
                    w9Var.j(i16, m9Var, false);
                    Layout layout2 = m9Var.f24688b;
                    if (layout2 != null) {
                        int i17 = w9Var.f25895u - m9Var.f24687a;
                        int lineForOffset2 = layout2.getLineForOffset(i17);
                        float primaryHorizontal2 = layout2.getPrimaryHorizontal(i17);
                        int lineBottom2 = (int) (layout2.getLineBottom(lineForOffset2) + m9Var.f24689c);
                        float f26 = primaryHorizontal2 + m9Var.d;
                        Rect rect2 = m9Var.f24690e;
                        if (rect2 != null) {
                            f26 = rect2.left - w9Var.f25858a;
                            lineBottom2 = rect2.bottom - w9Var.f25860b;
                            zIsRtlCharAt = false;
                        } else {
                            zIsRtlCharAt = layout2.isRtlCharAt(w9Var.f25895u);
                        }
                        float f27 = lineBottom2;
                        float f28 = f24 + f27;
                        if (f28 <= i10 + w9Var.f25866e0 || f28 >= w9Var.F.getMeasuredHeight()) {
                            if (f28 > 0.0f && f28 - w9Var.n() < w9Var.F.getMeasuredHeight()) {
                                i11++;
                            }
                            rectF.setEmpty();
                        } else if (zIsRtlCharAt) {
                            canvas.save();
                            canvas.translate(f26, f27);
                            float interpolation3 = overshootInterpolator.getInterpolation(w9Var.V);
                            float f29 = iDp;
                            float f30 = f29 / 2.0f;
                            canvas.scale(interpolation3, interpolation3, f30, f30);
                            path.reset();
                            Path.Direction direction3 = Path.Direction.CCW;
                            path.addCircle(f30, f30, f30, direction3);
                            path.addRect(0.0f, 0.0f, f30, f30, direction3);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f31 = f25 + f26;
                            rectF.set(f31, f28 - f29, f31 + f29, f28 + f29);
                            rectF.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
                        } else {
                            canvas.save();
                            float f32 = iDp;
                            canvas.translate(f26 - f32, f27);
                            float interpolation4 = overshootInterpolator.getInterpolation(w9Var.V);
                            float f33 = f32 / 2.0f;
                            canvas.scale(interpolation4, interpolation4, f33, f33);
                            path.reset();
                            Path.Direction direction4 = Path.Direction.CCW;
                            path.addCircle(f33, f33, f33, direction4);
                            path.addRect(f33, 0.0f, f32, f33, direction4);
                            canvas.drawPath(path, paint);
                            canvas.restore();
                            float f34 = f25 + f26;
                            rectF.set(f34 - f32, f28 - f32, f34, f28 + f32);
                            rectF.inset(-AndroidUtilities.dp(f10), -AndroidUtilities.dp(f10));
                            i11++;
                        }
                    }
                }
                canvas.restore();
            }
            int i18 = Build.VERSION.SDK_INT;
            if (i18 >= 29) {
                ArrayList arrayList = this.f25824f;
                arrayList.clear();
                a(rectF);
                a(rectF2);
                setSystemGestureExclusionRects(arrayList);
            }
            if (i11 != 0 && w9Var.f25872i) {
                if (!w9Var.f25874j) {
                    w9Var.O();
                }
                w9.a(w9Var, w9Var.f25861b0);
                if (w9Var.I != w9Var.H || w9Var.L != w9Var.K) {
                    invalidate();
                }
            }
            if (!w9Var.Q) {
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
            }
            if (i18 >= 23 && (actionMode = w9Var.Y) != null) {
                actionMode.invalidateContentRect();
                ActionMode actionMode2 = w9Var.Y;
                if (actionMode2 != null) {
                    ((org.telegram.ui.ActionBar.g4) actionMode2).e();
                }
            }
            if (w9Var.f25876k) {
                invalidate();
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        ViewParent parent;
        boolean z11;
        float measuredHeight;
        float f10;
        CharSequence charSequenceT;
        int i10;
        Layout layout;
        Layout layout2;
        Layout layout3;
        Layout layout4;
        int i11;
        int i12;
        char cCharAt;
        char cCharAt2;
        w9 w9Var = this.f25826r;
        g gVar = w9Var.f25890r0;
        m.i3 i3Var = w9Var.f25868f0;
        m9 m9Var = w9Var.f25859a0;
        if (!w9Var.y()) {
            return false;
        }
        if (motionEvent.getPointerCount() > 1) {
            return w9Var.f25872i;
        }
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int i13 = w9Var.f25861b0 - x8;
        w9Var.f25861b0 = x8;
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!w9Var.f25872i) {
                float f11 = x8;
                float f12 = y10;
                if (w9Var.S.contains(f11, f12)) {
                    w9Var.P();
                    if (w9Var.W == null) {
                        return false;
                    }
                    w9Var.f25872i = true;
                    w9Var.f25874j = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    int[] iArrC = w9Var.C(w9Var.f25895u);
                    float fN = w9Var.n() / 2;
                    int[] iArrM = w9Var.m();
                    if (w9Var.f25873i0) {
                        w9Var.f25867f = ((iArrC[0] + w9Var.f25858a) + iArrM[0]) - x8;
                    } else {
                        w9Var.f25867f = 0.0f;
                    }
                    w9Var.f25869g = (((iArrC[1] + w9Var.f25860b) + iArrM[1]) - y10) - fN;
                    w9Var.v();
                    w9Var.C.invalidate();
                    return true;
                }
                if (!w9Var.T.contains(f11, f12)) {
                    w9Var.f25872i = false;
                    w9Var.f25865e = true;
                    return w9Var.f25872i;
                }
                w9Var.O();
                if (w9Var.W == null) {
                    return false;
                }
                w9Var.f25872i = true;
                w9Var.f25874j = false;
                ViewParent parent3 = getParent();
                if (parent3 != null) {
                    parent3.requestDisallowInterceptTouchEvent(true);
                }
                int[] iArrC2 = w9Var.C(w9Var.v);
                float fN2 = w9Var.n() / 2;
                int[] iArrM2 = w9Var.m();
                w9Var.f25867f = ((iArrC2[0] + w9Var.f25858a) + iArrM2[0]) - x8;
                w9Var.f25869g = (((iArrC2[1] + w9Var.f25860b) + iArrM2[1]) - y10) - fN2;
                w9.a(w9Var, w9Var.f25861b0);
                w9Var.v();
                w9Var.C.invalidate();
                return true;
            }
            return true;
        }
        if (action == 1) {
            w9Var.w();
            if (w9Var.f25872i || (parent = getParent()) == null) {
                z10 = false;
            } else {
                z10 = false;
                parent.requestDisallowInterceptTouchEvent(false);
            }
            w9Var.f25872i = z10;
            w9Var.R = z10;
            w9Var.f25876k = z10;
            if (w9Var.y()) {
                w9Var.C.invalidate();
                AndroidUtilities.cancelRunOnUIThread(gVar);
                AndroidUtilities.runOnUIThread(gVar);
                w9Var.V();
            }
            if (w9Var.N) {
                w9Var.N = false;
                AndroidUtilities.cancelRunOnUIThread(i3Var);
            }
        } else if (action != 2) {
            if (action == 3) {
                w9Var.w();
                if (w9Var.f25872i) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                w9Var.f25872i = z10;
                w9Var.R = z10;
                w9Var.f25876k = z10;
                if (w9Var.y()) {
                    w9Var.C.invalidate();
                    AndroidUtilities.cancelRunOnUIThread(gVar);
                    AndroidUtilities.runOnUIThread(gVar);
                    w9Var.V();
                }
                if (w9Var.N) {
                    w9Var.N = false;
                    AndroidUtilities.cancelRunOnUIThread(i3Var);
                }
            }
        } else if (w9Var.f25872i) {
            if (w9Var.f25874j) {
                w9Var.P();
            } else {
                w9Var.O();
            }
            if (w9Var.W == null) {
                return w9Var.f25872i;
            }
            int i14 = (int) (x8 + w9Var.f25867f);
            int i15 = (int) (y10 + w9Var.f25869g);
            boolean zQ = w9Var.Q(i14, i15);
            if (w9Var.W != null) {
                if (w9Var.f25874j) {
                    w9Var.j(w9Var.f25895u, m9Var, false);
                } else {
                    w9Var.j(w9Var.v, m9Var, false);
                }
                if (m9Var.f24688b != null) {
                    float f13 = m9Var.f24689c;
                    r9 r9Var = w9Var.W;
                    int[] iArrM3 = w9Var.m();
                    int i16 = i15 - iArrM3[1];
                    int i17 = i14 - iArrM3[0];
                    boolean z12 = w9Var.E != null;
                    boolean z13 = z12 && y10 - w9Var.f25880m > w9Var.F.getMeasuredHeight() - w9Var.p() && (w9Var.f25877k0 || w9Var.Z || w9Var.W.getBottom() > w9Var.F.getMeasuredHeight() - w9Var.p());
                    if (!z12) {
                        z11 = false;
                    } else if (y10 >= w9Var.q() + ((View) w9Var.F.getParent()).getTop() || (!w9Var.Z && w9Var.W.getTop() >= w9Var.q())) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z13 || z11) {
                        if (!w9Var.N) {
                            w9Var.N = true;
                            AndroidUtilities.runOnUIThread(i3Var);
                        }
                        w9Var.O = z13;
                        if (z13) {
                            measuredHeight = w9Var.F.getMeasuredHeight() - w9Var.W.getTop();
                            f10 = w9Var.f25869g;
                        } else {
                            measuredHeight = -w9Var.W.getTop();
                            f10 = w9Var.f25869g;
                        }
                        i16 = (int) (measuredHeight + f10);
                    } else if (w9Var.N) {
                        w9Var.N = false;
                        AndroidUtilities.cancelRunOnUIThread(i3Var);
                    }
                    int iL = w9Var.l(i17, i16, w9Var.f25858a, w9Var.f25860b, w9Var.W, false);
                    if (iL >= 0) {
                        if (w9Var.R) {
                            if (!zQ) {
                                if (iL < w9Var.f25895u) {
                                    w9Var.R = false;
                                    w9Var.f25874j = true;
                                    w9Var.v();
                                } else if (iL > w9Var.v) {
                                    w9Var.R = false;
                                    w9Var.f25874j = false;
                                    w9Var.v();
                                }
                                if (w9Var.f25874j) {
                                    if (w9Var.f25895u != iL) {
                                        CharSequence charSequenceT2 = w9Var.t(w9Var.W, false);
                                        w9Var.j(iL, m9Var, false);
                                        layout3 = m9Var.f24688b;
                                        w9Var.j(w9Var.f25895u, m9Var, false);
                                        layout4 = m9Var.f24688b;
                                        if (layout3 != null) {
                                            i11 = iL;
                                            while (true) {
                                                i12 = i11 - 1;
                                                if (i12 < 0) {
                                                    break;
                                                }
                                                break;
                                                break;
                                                i11--;
                                            }
                                            int lineForOffset = layout4.getLineForOffset(i11);
                                            int lineForOffset2 = layout4.getLineForOffset(w9Var.f25895u);
                                            int lineForOffset3 = layout4.getLineForOffset(iL);
                                            if (zQ) {
                                                w9Var.B(iL, i11, zQ, w9Var.f25859a0.f24689c, f13, r9Var);
                                                AndroidUtilities.vibrateCursor(w9Var.C);
                                                w9Var.x();
                                            } else {
                                                w9Var.B(iL, i11, zQ, w9Var.f25859a0.f24689c, f13, r9Var);
                                                AndroidUtilities.vibrateCursor(w9Var.C);
                                                w9Var.x();
                                            }
                                        }
                                    }
                                    w9Var.G();
                                } else {
                                    if (iL != w9Var.v) {
                                        charSequenceT = w9Var.t(w9Var.W, false);
                                        i10 = iL;
                                        while (i10 < charSequenceT.length()) {
                                            i10++;
                                        }
                                        w9Var.j(iL, m9Var, false);
                                        layout = m9Var.f24688b;
                                        w9Var.j(w9Var.v, m9Var, false);
                                        layout2 = m9Var.f24688b;
                                        if (layout != null) {
                                            if (iL > charSequenceT.length()) {
                                                iL = charSequenceT.length();
                                            }
                                            int lineForOffset4 = layout2.getLineForOffset(i10);
                                            int lineForOffset5 = layout2.getLineForOffset(w9Var.v);
                                            int lineForOffset6 = layout2.getLineForOffset(iL);
                                            if (zQ) {
                                                w9Var.B(iL, i10, zQ, w9Var.f25859a0.f24689c, f13, r9Var);
                                                AndroidUtilities.vibrateCursor(w9Var.C);
                                                w9Var.x();
                                            } else {
                                                w9Var.B(iL, i10, zQ, w9Var.f25859a0.f24689c, f13, r9Var);
                                                AndroidUtilities.vibrateCursor(w9Var.C);
                                                w9Var.x();
                                            }
                                        }
                                    }
                                    w9Var.G();
                                }
                            }
                        } else if (w9Var.f25874j) {
                            if (w9Var.f25895u != iL && w9Var.c(iL)) {
                                CharSequence charSequenceT3 = w9Var.t(w9Var.W, false);
                                w9Var.j(iL, m9Var, false);
                                layout3 = m9Var.f24688b;
                                w9Var.j(w9Var.f25895u, m9Var, false);
                                layout4 = m9Var.f24688b;
                                if (layout3 != null && layout4 != null) {
                                    i11 = iL;
                                    while (true) {
                                        i12 = i11 - 1;
                                        if (i12 < 0 || !w9.z(charSequenceT3.charAt(i12))) {
                                            break;
                                        }
                                        i11--;
                                    }
                                    int lineForOffset7 = layout4.getLineForOffset(i11);
                                    int lineForOffset8 = layout4.getLineForOffset(w9Var.f25895u);
                                    int lineForOffset9 = layout4.getLineForOffset(iL);
                                    if (zQ || layout3 != layout4 || (lineForOffset9 != layout4.getLineForOffset(w9Var.f25895u) && lineForOffset9 == lineForOffset7)) {
                                        w9Var.B(iL, i11, zQ, w9Var.f25859a0.f24689c, f13, r9Var);
                                        AndroidUtilities.vibrateCursor(w9Var.C);
                                        w9Var.x();
                                    } else if (-1 == layout4.getParagraphDirection(layout4.getLineForOffset(iL)) || layout4.isRtlCharAt(iL) || lineForOffset7 != lineForOffset8 || lineForOffset9 != lineForOffset7) {
                                        w9Var.f25895u = iL;
                                        int i18 = w9Var.v;
                                        if (iL > i18) {
                                            w9Var.v = iL;
                                            w9Var.f25895u = i18;
                                            w9Var.f25874j = false;
                                        }
                                        AndroidUtilities.vibrateCursor(w9Var.C);
                                        w9Var.x();
                                    } else {
                                        int i19 = iL;
                                        while (true) {
                                            int i20 = i19 + 1;
                                            if (i20 >= charSequenceT3.length() || !w9.z(charSequenceT3.charAt(i20))) {
                                                break;
                                            }
                                            i19 = i20;
                                        }
                                        int iAbs = Math.abs(iL - i11);
                                        int iAbs2 = Math.abs(iL - i19);
                                        if (w9Var.f25898y) {
                                            w9Var.f25898y = i13 >= 0;
                                        }
                                        int i21 = iL - 1;
                                        boolean z14 = i21 > 0 && w9.z(charSequenceT3.charAt(i21));
                                        if (iL >= charSequenceT3.length()) {
                                            iL = charSequenceT3.length();
                                            cCharAt = '\n';
                                        } else {
                                            cCharAt = charSequenceT3.charAt(iL);
                                        }
                                        if (w9Var.f25895u >= charSequenceT3.length()) {
                                            w9Var.f25895u = charSequenceT3.length();
                                            cCharAt2 = '\n';
                                        } else {
                                            cCharAt2 = charSequenceT3.charAt(w9Var.f25895u);
                                        }
                                        int i22 = w9Var.f25895u;
                                        if ((iL < i22 && iAbs < iAbs2) || ((iL > i22 && i13 < 0) || !w9.z(cCharAt) || ((w9.z(cCharAt2) && !w9Var.f25898y) || iL == 0 || !z14 || cCharAt2 == '\n'))) {
                                            if (!w9Var.f25898y || iL != 1) {
                                                if (iL >= w9Var.f25895u || !w9.z(cCharAt) || ((w9.z(cCharAt2) && !w9Var.f25898y) || cCharAt2 == '\n')) {
                                                    w9Var.f25895u = iL;
                                                } else {
                                                    w9Var.f25895u = i11;
                                                    w9Var.f25898y = true;
                                                }
                                                int i23 = w9Var.f25895u;
                                                int i24 = w9Var.v;
                                                if (i23 > i24) {
                                                    w9Var.v = i23;
                                                    w9Var.f25895u = i24;
                                                    w9Var.f25874j = false;
                                                }
                                                AndroidUtilities.vibrateCursor(w9Var.C);
                                                w9Var.x();
                                            }
                                        }
                                    }
                                }
                            }
                            w9Var.G();
                        } else {
                            if (iL != w9Var.v && w9Var.c(iL)) {
                                charSequenceT = w9Var.t(w9Var.W, false);
                                i10 = iL;
                                while (i10 < charSequenceT.length() && w9.z(charSequenceT.charAt(i10))) {
                                    i10++;
                                }
                                w9Var.j(iL, m9Var, false);
                                layout = m9Var.f24688b;
                                w9Var.j(w9Var.v, m9Var, false);
                                layout2 = m9Var.f24688b;
                                if (layout != null && layout2 != null) {
                                    if (iL > charSequenceT.length()) {
                                        iL = charSequenceT.length();
                                    }
                                    int lineForOffset10 = layout2.getLineForOffset(i10);
                                    int lineForOffset11 = layout2.getLineForOffset(w9Var.v);
                                    int lineForOffset12 = layout2.getLineForOffset(iL);
                                    if (zQ || layout != layout2 || (lineForOffset12 != layout2.getLineForOffset(w9Var.v) && lineForOffset12 == lineForOffset10)) {
                                        w9Var.B(iL, i10, zQ, w9Var.f25859a0.f24689c, f13, r9Var);
                                        AndroidUtilities.vibrateCursor(w9Var.C);
                                        w9Var.x();
                                    } else if (-1 == layout2.getParagraphDirection(layout2.getLineForOffset(iL)) || layout2.isRtlCharAt(iL) || lineForOffset11 != lineForOffset10 || lineForOffset12 != lineForOffset10) {
                                        w9Var.v = iL;
                                        int i25 = w9Var.f25895u;
                                        if (i25 > iL) {
                                            w9Var.v = i25;
                                            w9Var.f25895u = iL;
                                            w9Var.f25874j = true;
                                        }
                                        AndroidUtilities.vibrateCursor(w9Var.C);
                                        w9Var.x();
                                    } else {
                                        int i26 = iL;
                                        while (true) {
                                            int i27 = i26 - 1;
                                            if (i27 < 0 || !w9.z(charSequenceT.charAt(i27))) {
                                                break;
                                            }
                                            i26--;
                                        }
                                        int iAbs3 = Math.abs(iL - i10);
                                        int iAbs4 = Math.abs(iL - i26);
                                        int i28 = iL - 1;
                                        boolean z15 = i28 > 0 && w9.z(charSequenceT.charAt(i28));
                                        if (w9Var.f25898y) {
                                            w9Var.f25898y = i13 <= 0;
                                        }
                                        int i29 = w9Var.v;
                                        boolean z16 = i29 > 0 && w9.z(charSequenceT.charAt(i29 - 1));
                                        int i30 = w9Var.v;
                                        if ((iL > i30 && iAbs3 <= iAbs4) || ((iL < i30 && i13 > 0) || !z15 || (z16 && !w9Var.f25898y))) {
                                            if (iL <= i30 || !z15 || (z16 && !w9Var.f25898y)) {
                                                w9Var.v = iL;
                                            } else {
                                                w9Var.v = i10;
                                                w9Var.f25898y = true;
                                            }
                                            int i31 = w9Var.f25895u;
                                            int i32 = w9Var.v;
                                            if (i31 > i32) {
                                                w9Var.v = i31;
                                                w9Var.f25895u = i32;
                                                w9Var.f25874j = true;
                                            }
                                            AndroidUtilities.vibrateCursor(w9Var.C);
                                            w9Var.x();
                                        }
                                    }
                                }
                            }
                            w9Var.G();
                        }
                    }
                    w9.a(w9Var, w9Var.f25861b0);
                }
            }
            return true;
        }
        return w9Var.f25872i;
    }
}

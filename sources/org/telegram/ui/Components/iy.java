package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CompoundEmoji;
import org.telegram.messenger.Emoji;
public final class iy extends mm0 {
    public boolean V2;
    public final SparseArray W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f25813a3;
    public int f25814b3;
    public SparseArray f25815c3;
    public final wz f25816d3;

    public iy(wz wzVar, Context context) {
        super(context, null);
        this.f25816d3 = wzVar;
        this.W2 = new SparseArray();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f25813a3 = new ArrayList();
        this.f25814b3 = -1;
        new SparseIntArray();
        es esVar = es.f24465f;
    }

    @Override
    public final void J0(Canvas canvas, RectF rectF, long j10) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        int i10;
        boolean z11;
        Canvas canvas2 = canvas;
        wz wzVar = this.f25816d3;
        iy iyVar = wzVar.P;
        super.J0(canvas, rectF, j10);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f25814b3 != getChildCount()) {
            z1();
            this.f25814b3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.W2;
            int size = sparseArray.size();
            arrayList = this.Z2;
            if (i12 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i12);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i12++;
        }
        sparseArray.clear();
        int i13 = 1;
        if (wzVar.f30764u2 > 0 && SystemClock.elapsedRealtime() - wzVar.f30764u2 < x1() && wzVar.f30754r2 != null && wzVar.f30758s2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f7 = 0.0f;
        if (wzVar.f30711d2 != null && iyVar != null) {
            int i14 = 0;
            while (i14 < iyVar.getChildCount()) {
                View childAt = iyVar.getChildAt(i14);
                if (childAt instanceof ez) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) i2.d.A(i13, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ez) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == wzVar.f30758s2 - i13) {
                    z11 = z10;
                    float interpolation = es.f24466g.getInterpolation(w7.r.a(((float) (SystemClock.elapsedRealtime() - wzVar.f30764u2)) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        wzVar.f30754r2.draw(canvas2);
                        canvas2.restore();
                    }
                } else {
                    i10 = i14;
                    z11 = z10;
                }
                i14 = i10 + 1;
                z10 = z11;
                f7 = 0.0f;
                i13 = 1;
            }
        }
        ArrayList arrayList5 = this.Y2;
        arrayList5.clear();
        ArrayList arrayList6 = this.X2;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            gy gyVar = null;
            arrayList2 = this.f25813a3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            ez ezVar = (ez) arrayList7.get(i11);
            int i16 = ezVar.f24517a;
            int i17 = i11;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                } else if (((gy) arrayList5.get(i17)).M == i16) {
                    gyVar = (gy) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                } else {
                    i17++;
                }
            }
            if (gyVar == null) {
                if (!arrayList2.isEmpty()) {
                    gyVar = (gy) i2.d.A(1, arrayList2);
                } else {
                    gyVar = new gy(this);
                }
                gyVar.M = i16;
                gyVar.e();
            }
            arrayList6.add(gyVar);
            gyVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(ezVar.getLeft(), ezVar.getY() + ezVar.getPaddingTop());
            gyVar.N = ezVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (ezVar.getLeft() * 2);
            int measuredHeight = ezVar.getMeasuredHeight() - ezVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                gyVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((gy) arrayList5.get(i18));
                ((gy) arrayList5.get(i18)).O = null;
                ((gy) arrayList5.get(i18)).k();
            } else {
                ((gy) arrayList5.get(i18)).f();
            }
        }
        arrayList5.clear();
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        super.dispatchDraw(canvas);
        wz wzVar = this.f25816d3;
        iy iyVar = wzVar.P;
        wzVar.f30737m2.h++;
        if (this.f25814b3 != getChildCount()) {
            z1();
            this.f25814b3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.W2;
            int size = sparseArray.size();
            arrayList = this.Z2;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        if (wzVar.f30764u2 > 0 && SystemClock.elapsedRealtime() - wzVar.f30764u2 < x1() && wzVar.f30754r2 != null && wzVar.f30758s2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (wzVar.f30711d2 != null && iyVar != null) {
            for (int i12 = 0; i12 < iyVar.getChildCount(); i12++) {
                View childAt = iyVar.getChildAt(i12);
                if (childAt instanceof ez) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) i2.d.A(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((ez) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == wzVar.f30758s2 - 1) {
                    float interpolation = es.f24466g.getInterpolation(w7.r.a(((float) (SystemClock.elapsedRealtime() - wzVar.f30764u2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        wzVar.f30754r2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.Y2;
        arrayList5.clear();
        ArrayList arrayList6 = this.X2;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            gy gyVar = null;
            arrayList2 = this.f25813a3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            ez ezVar = (ez) arrayList7.get(i10);
            int i14 = ezVar.f24517a;
            int i15 = i10;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                } else if (((gy) arrayList5.get(i15)).M == i14) {
                    gyVar = (gy) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                } else {
                    i15++;
                }
            }
            if (gyVar == null) {
                if (!arrayList2.isEmpty()) {
                    gyVar = (gy) i2.d.A(1, arrayList2);
                } else {
                    gyVar = new gy(this);
                }
                gyVar.M = i14;
                gyVar.e();
            }
            arrayList6.add(gyVar);
            gyVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(ezVar.getLeft(), ezVar.getY() + ezVar.getPaddingTop());
            gyVar.N = ezVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (ezVar.getLeft() * 2);
            int measuredHeight = ezVar.getMeasuredHeight() - ezVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                gyVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((gy) arrayList5.get(i16));
                ((gy) arrayList5.get(i16)).O = null;
                ((gy) arrayList5.get(i16)).k();
            } else {
                ((gy) arrayList5.get(i16)).f();
            }
        }
        arrayList5.clear();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (motionEvent.getActionMasked() != 6 && motionEvent.getActionMasked() != 1) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (motionEvent.getActionMasked() == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 || z11 || z12) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f25815c3 == null) {
                this.f25815c3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f25428a = x10;
                    obj.f25429b = y3;
                    obj.f25430c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f25815c3.put(pointerId, obj);
                    B0();
                }
            } else {
                hy hyVar = (hy) this.f25815c3.get(pointerId);
                this.f25815c3.remove(pointerId);
                if (E != null && hyVar != null) {
                    if (Math.sqrt(Math.pow(y3 - hyVar.f25429b, 2.0d) + Math.pow(x10 - hyVar.f25428a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        wz wzVar = this.f25816d3;
                        if (!wzVar.B1.isShowing() || SystemClock.elapsedRealtime() - hyVar.f25430c < ViewConfiguration.getLongPressTimeout()) {
                            View view = hyVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof ez) {
                                    wz.d(wzVar, (ez) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof ly) {
                                    wzVar.R.E(R, (ly) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (hyVar != null && (hyVar.d.getBackground() instanceof RippleDrawable)) {
                    hyVar.d.getBackground().setState(new int[0]);
                }
                if (hyVar != null) {
                    hyVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f25815c3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            wz wzVar = this.f25816d3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                wzVar.M(true);
            }
            if (!canScrollVertically(1)) {
                wz.e(wzVar, 1, AndroidUtilities.dp(36.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        z1();
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        b6.release(this, this.f25816d3.f30711d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.X2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((gy) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f25813a3;
            if (i10 < arrayList2.size()) {
                ((gy) arrayList2.get(i10)).f();
                i10++;
            } else {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wz wzVar = this.f25816d3;
        if (!wzVar.f30715f) {
            boolean r10 = org.telegram.ui.xt.q().r(motionEvent, this, wzVar.f30721g2, this.f27148n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        wz wzVar = this.f25816d3;
        if (wzVar.f30709d0 && wzVar.f30706c0) {
            this.V2 = true;
            wzVar.Q.h1(0, 0);
            wzVar.f30706c0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        wzVar.l(true);
        z1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.V2 = true;
        int size = View.MeasureSpec.getSize(i10);
        wz wzVar = this.f25816d3;
        vx vxVar = wzVar.Q;
        int i12 = vxVar.J;
        if (AndroidUtilities.isTablet()) {
            f7 = 60.0f;
        } else {
            f7 = 45.0f;
        }
        vxVar.y1(Math.max(1, size / AndroidUtilities.dp(f7)));
        this.V2 = false;
        super.onMeasure(i10, i11);
        if (i12 != vxVar.J) {
            wzVar.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        wz wzVar = this.f25816d3;
        int[] iArr = wzVar.D1;
        jv jvVar = wzVar.B1;
        if (wzVar.R1 != null && jvVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f7 = wzVar.U1;
                    if (f7 != -10000.0f) {
                        if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(wzVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            wzVar.U1 = -10000.0f;
                            wzVar.V1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    jvVar.f26139c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = jvVar.d;
                    iv ivVar = jvVar.f26139c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + jvVar.e)));
                        if (ivVar.f25795n[0] != max) {
                            AndroidUtilities.vibrateCursor(ivVar);
                            int[] iArr2 = ivVar.f25795n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                ivVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (jvVar != null && jvVar.isShowing() && !jvVar.d) {
                    jvVar.dismiss();
                    int i10 = jvVar.f26139c.f25795n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) wzVar.R1.getTag();
                    if (!wzVar.R1.f24519c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = wz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        wzVar.R1.a(Emoji.getEmojiBigDrawable(str2), wzVar.R1.f24519c);
                        wz.d(wzVar, wzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            wz.d(wzVar, wzVar.R1, wz.g(replace, str));
                        } else {
                            wz.d(wzVar, wzVar.R1, replace);
                        }
                    }
                }
                if (jvVar == null || !jvVar.d) {
                    wzVar.R1 = null;
                }
                wzVar.U1 = -10000.0f;
                wzVar.V1 = -10000.0f;
            }
            if (jvVar == null || !jvVar.d || jvVar.isShowing()) {
                return true;
            }
        }
        wzVar.S1 = motionEvent.getX();
        wzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.V2) {
            return;
        }
        super.requestLayout();
    }

    public final long x1() {
        wz wzVar = this.f25816d3;
        return Math.max(400L, Math.min(45, wzVar.f30761t2 - wzVar.f30758s2) * 35) + Math.max(600L, Math.min(55, wzVar.f30761t2 - wzVar.f30758s2) * 40) + 150;
    }

    public final void y1(View view) {
        if (this.f25815c3 != null) {
            int i10 = 0;
            while (i10 < this.f25815c3.size()) {
                hy hyVar = (hy) this.f25815c3.valueAt(i10);
                if (hyVar.d == view) {
                    this.f25815c3.removeAt(i10);
                    i10--;
                    View view2 = hyVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        hyVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = hyVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void z1() {
        wz wzVar = this.f25816d3;
        int i10 = wzVar.f30705c;
        iy iyVar = wzVar.P;
        iy iyVar2 = wzVar.P;
        b6[] b6VarArr = new b6[iyVar.getChildCount()];
        for (int i11 = 0; i11 < iyVar2.getChildCount(); i11++) {
            View childAt = iyVar2.getChildAt(i11);
            if (childAt instanceof ez) {
                b6VarArr[i11] = ((ez) childAt).getSpan();
            }
        }
        wzVar.f30711d2 = b6.update(i10, this, b6VarArr, wzVar.f30711d2);
    }
}

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
public final class zx extends zl0 {
    public boolean f33673e3;
    public final SparseArray f33674f3;
    public final ArrayList f33675g3;
    public final ArrayList f33676h3;
    public final ArrayList f33677i3;
    public final ArrayList j3;
    public int f33678k3;
    public SparseArray f33679l3;
    public final nz f33680m3;

    public zx(nz nzVar, Context context) {
        super(context, null);
        this.f33680m3 = nzVar;
        this.f33674f3 = new SparseArray();
        this.f33675g3 = new ArrayList();
        this.f33676h3 = new ArrayList();
        this.f33677i3 = new ArrayList();
        this.j3 = new ArrayList();
        this.f33678k3 = -1;
        new SparseIntArray();
        tr trVar = tr.f31147f;
    }

    public final void A1() {
        nz nzVar = this.f33680m3;
        int i10 = nzVar.f29095c;
        zx zxVar = nzVar.P;
        zx zxVar2 = nzVar.P;
        z5[] z5VarArr = new z5[zxVar.getChildCount()];
        for (int i11 = 0; i11 < zxVar2.getChildCount(); i11++) {
            View childAt = zxVar2.getChildAt(i11);
            if (childAt instanceof wy) {
                z5VarArr[i11] = ((wy) childAt).getSpan();
            }
        }
        nzVar.f29101d2 = z5.update(i10, this, z5VarArr, nzVar.f29101d2);
    }

    @Override
    public final void K0(Canvas canvas, RectF rectF, long j3) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        int i10;
        boolean z11;
        Canvas canvas2 = canvas;
        nz nzVar = this.f33680m3;
        zx zxVar = nzVar.P;
        super.K0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f33678k3 != getChildCount()) {
            A1();
            this.f33678k3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.f33674f3;
            int size = sparseArray.size();
            arrayList = this.f33677i3;
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
        if (nzVar.f29155u2 > 0 && SystemClock.elapsedRealtime() - nzVar.f29155u2 < y1() && nzVar.f29145r2 != null && nzVar.f29149s2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f7 = 0.0f;
        if (nzVar.f29101d2 != null && zxVar != null) {
            int i14 = 0;
            while (i14 < zxVar.getChildCount()) {
                View childAt = zxVar.getChildAt(i14);
                if (childAt instanceof wy) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) hg.c.w(i13, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((wy) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == nzVar.f29149s2 - i13) {
                    z11 = z10;
                    float interpolation = tr.f31148g.getInterpolation(w7.q.a(((float) (SystemClock.elapsedRealtime() - nzVar.f29155u2)) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        nzVar.f29145r2.draw(canvas2);
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
        ArrayList arrayList5 = this.f33676h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f33675g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            xx xxVar = null;
            arrayList2 = this.j3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            wy wyVar = (wy) arrayList7.get(i11);
            int i16 = wyVar.f32672a;
            int i17 = 0;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                } else if (((xx) arrayList5.get(i17)).M == i16) {
                    xxVar = (xx) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                } else {
                    i17++;
                }
            }
            if (xxVar == null) {
                if (!arrayList2.isEmpty()) {
                    xxVar = (xx) hg.c.w(1, arrayList2);
                } else {
                    xxVar = new xx(this);
                }
                xxVar.M = i16;
                xxVar.e();
            }
            arrayList6.add(xxVar);
            xxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(wyVar.getLeft(), wyVar.getY() + wyVar.getPaddingTop());
            xxVar.N = wyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (wyVar.getLeft() * 2);
            int measuredHeight = wyVar.getMeasuredHeight() - wyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                xxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((xx) arrayList5.get(i18));
                ((xx) arrayList5.get(i18)).O = null;
                ((xx) arrayList5.get(i18)).k();
            } else {
                ((xx) arrayList5.get(i18)).f();
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
        nz nzVar = this.f33680m3;
        zx zxVar = nzVar.P;
        nzVar.f29128m2.g();
        if (this.f33678k3 != getChildCount()) {
            A1();
            this.f33678k3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f33674f3;
            int size = sparseArray.size();
            arrayList = this.f33677i3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        if (nzVar.f29155u2 > 0 && SystemClock.elapsedRealtime() - nzVar.f29155u2 < y1() && nzVar.f29145r2 != null && nzVar.f29149s2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (nzVar.f29101d2 != null && zxVar != null) {
            for (int i12 = 0; i12 < zxVar.getChildCount(); i12++) {
                View childAt = zxVar.getChildAt(i12);
                if (childAt instanceof wy) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) hg.c.w(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((wy) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == nzVar.f29149s2 - 1) {
                    float interpolation = tr.f31148g.getInterpolation(w7.q.a(((float) (SystemClock.elapsedRealtime() - nzVar.f29155u2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        nzVar.f29145r2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.f33676h3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f33675g3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            xx xxVar = null;
            arrayList2 = this.j3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            wy wyVar = (wy) arrayList7.get(i10);
            int i14 = wyVar.f32672a;
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                } else if (((xx) arrayList5.get(i15)).M == i14) {
                    xxVar = (xx) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                } else {
                    i15++;
                }
            }
            if (xxVar == null) {
                if (!arrayList2.isEmpty()) {
                    xxVar = (xx) hg.c.w(1, arrayList2);
                } else {
                    xxVar = new xx(this);
                }
                xxVar.M = i14;
                xxVar.e();
            }
            arrayList6.add(xxVar);
            xxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(wyVar.getLeft(), wyVar.getY() + wyVar.getPaddingTop());
            xxVar.N = wyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (wyVar.getLeft() * 2);
            int measuredHeight = wyVar.getMeasuredHeight() - wyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                xxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((xx) arrayList5.get(i16));
                ((xx) arrayList5.get(i16)).O = null;
                ((xx) arrayList5.get(i16)).k();
            } else {
                ((xx) arrayList5.get(i16)).f();
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
            if (this.f33679l3 == null) {
                this.f33679l3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f33270a = x10;
                    obj.f33271b = y3;
                    obj.f33272c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f33679l3.put(pointerId, obj);
                    C0();
                }
            } else {
                yx yxVar = (yx) this.f33679l3.get(pointerId);
                this.f33679l3.remove(pointerId);
                if (E != null && yxVar != null) {
                    if (Math.sqrt(Math.pow(y3 - yxVar.f33271b, 2.0d) + Math.pow(x10 - yxVar.f33270a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        nz nzVar = this.f33680m3;
                        if (!nzVar.B1.isShowing() || SystemClock.elapsedRealtime() - yxVar.f33272c < ViewConfiguration.getLongPressTimeout()) {
                            View view = yxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof wy) {
                                    nz.c(nzVar, (wy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof dy) {
                                    nzVar.R.E(R, (dy) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (yxVar != null && (yxVar.d.getBackground() instanceof RippleDrawable)) {
                    yxVar.d.getBackground().setState(new int[0]);
                }
                if (yxVar != null) {
                    yxVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f33679l3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void k0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            nz nzVar = this.f33680m3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                nzVar.K(true);
            }
            if (!canScrollVertically(1)) {
                nz.e(nzVar, 1, AndroidUtilities.dp(36.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A1();
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        z5.release(this, this.f33680m3.f29101d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f33675g3;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((xx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.j3;
            if (i10 < arrayList2.size()) {
                ((xx) arrayList2.get(i10)).f();
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
        nz nzVar = this.f33680m3;
        if (!nzVar.f29106f) {
            boolean r10 = org.telegram.ui.rt.q().r(motionEvent, this, nzVar.f29112g2, this.f33552p2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        nz nzVar = this.f33680m3;
        if (nzVar.f29099d0 && nzVar.f29096c0) {
            this.f33673e3 = true;
            nzVar.Q.h1(0, 0);
            nzVar.f29096c0 = false;
            this.f33673e3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        nzVar.l(true);
        A1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.f33673e3 = true;
        int size = View.MeasureSpec.getSize(i10);
        nz nzVar = this.f33680m3;
        nx nxVar = nzVar.Q;
        int i12 = nxVar.J;
        if (AndroidUtilities.isTablet()) {
            f7 = 60.0f;
        } else {
            f7 = 45.0f;
        }
        nxVar.y1(Math.max(1, size / AndroidUtilities.dp(f7)));
        this.f33673e3 = false;
        super.onMeasure(i10, i11);
        if (i12 != nxVar.J) {
            nzVar.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        nz nzVar = this.f33680m3;
        int[] iArr = nzVar.D1;
        bv bvVar = nzVar.B1;
        if (nzVar.R1 != null && bvVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f7 = nzVar.U1;
                    if (f7 != -10000.0f) {
                        if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(nzVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            nzVar.U1 = -10000.0f;
                            nzVar.V1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    bvVar.f25067c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = bvVar.d;
                    av avVar = bvVar.f25067c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + bvVar.f25068e)));
                        if (avVar.f24674n[0] != max) {
                            AndroidUtilities.vibrateCursor(avVar);
                            int[] iArr2 = avVar.f24674n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                avVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (bvVar != null && bvVar.isShowing() && !bvVar.d) {
                    bvVar.dismiss();
                    int i10 = bvVar.f25067c.f24674n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) nzVar.R1.getTag();
                    if (!nzVar.R1.f32674c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = nz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        nzVar.R1.a(Emoji.getEmojiBigDrawable(str2), nzVar.R1.f32674c);
                        nz.c(nzVar, nzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            nz.c(nzVar, nzVar.R1, nz.g(replace, str));
                        } else {
                            nz.c(nzVar, nzVar.R1, replace);
                        }
                    }
                }
                if (bvVar == null || !bvVar.d) {
                    nzVar.R1 = null;
                }
                nzVar.U1 = -10000.0f;
                nzVar.V1 = -10000.0f;
            }
            if (bvVar == null || !bvVar.d || bvVar.isShowing()) {
                return true;
            }
        }
        nzVar.S1 = motionEvent.getX();
        nzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f33673e3) {
            return;
        }
        super.requestLayout();
    }

    public final long y1() {
        nz nzVar = this.f33680m3;
        return Math.max(400L, Math.min(45, nzVar.f29152t2 - nzVar.f29149s2) * 35) + Math.max(600L, Math.min(55, nzVar.f29152t2 - nzVar.f29149s2) * 40) + 150;
    }

    public final void z1(View view) {
        if (this.f33679l3 != null) {
            int i10 = 0;
            while (i10 < this.f33679l3.size()) {
                yx yxVar = (yx) this.f33679l3.valueAt(i10);
                if (yxVar.d == view) {
                    this.f33679l3.removeAt(i10);
                    i10--;
                    View view2 = yxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        yxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = yxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }
}

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
public final class ny extends sm0 {
    public boolean V2;
    public final SparseArray W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f29171a3;
    public int f29172b3;
    public SparseArray f29173c3;
    public final b00 f29174d3;

    public ny(b00 b00Var, Context context) {
        super(context, null);
        this.f29174d3 = b00Var;
        this.W2 = new SparseArray();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f29171a3 = new ArrayList();
        this.f29172b3 = -1;
        new SparseIntArray();
        is isVar = is.f27451f;
    }

    @Override
    public final void J0(Canvas canvas, RectF rectF, long j3) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        int i10;
        boolean z11;
        Canvas canvas2 = canvas;
        b00 b00Var = this.f29174d3;
        ny nyVar = b00Var.P;
        super.J0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f29172b3 != getChildCount()) {
            z1();
            this.f29172b3 = getChildCount();
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
        if (b00Var.f24720u2 > 0 && SystemClock.elapsedRealtime() - b00Var.f24720u2 < x1() && b00Var.f24710r2 != null && b00Var.f24714s2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f7 = 0.0f;
        if (b00Var.f24666d2 != null && nyVar != null) {
            int i14 = 0;
            while (i14 < nyVar.getChildCount()) {
                View childAt = nyVar.getChildAt(i14);
                if (childAt instanceof jz) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) hg.c.x(i13, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((jz) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == b00Var.f24714s2 - i13) {
                    z11 = z10;
                    float interpolation = is.f27452g.getInterpolation(w7.o.a(((float) (SystemClock.elapsedRealtime() - b00Var.f24720u2)) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        b00Var.f24710r2.draw(canvas2);
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
            ly lyVar = null;
            arrayList2 = this.f29171a3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            jz jzVar = (jz) arrayList7.get(i11);
            int i16 = jzVar.f27775a;
            int i17 = i11;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                } else if (((ly) arrayList5.get(i17)).M == i16) {
                    lyVar = (ly) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                } else {
                    i17++;
                }
            }
            if (lyVar == null) {
                if (!arrayList2.isEmpty()) {
                    lyVar = (ly) hg.c.x(1, arrayList2);
                } else {
                    lyVar = new ly(this);
                }
                lyVar.M = i16;
                lyVar.e();
            }
            arrayList6.add(lyVar);
            lyVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(jzVar.getLeft(), jzVar.getY() + jzVar.getPaddingTop());
            lyVar.N = jzVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (jzVar.getLeft() * 2);
            int measuredHeight = jzVar.getMeasuredHeight() - jzVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                lyVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ly) arrayList5.get(i18));
                ((ly) arrayList5.get(i18)).O = null;
                ((ly) arrayList5.get(i18)).k();
            } else {
                ((ly) arrayList5.get(i18)).f();
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
        b00 b00Var = this.f29174d3;
        ny nyVar = b00Var.P;
        b00Var.f24693m2.h++;
        if (this.f29172b3 != getChildCount()) {
            z1();
            this.f29172b3 = getChildCount();
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
        if (b00Var.f24720u2 > 0 && SystemClock.elapsedRealtime() - b00Var.f24720u2 < x1() && b00Var.f24710r2 != null && b00Var.f24714s2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (b00Var.f24666d2 != null && nyVar != null) {
            for (int i12 = 0; i12 < nyVar.getChildCount(); i12++) {
                View childAt = nyVar.getChildAt(i12);
                if (childAt instanceof jz) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) hg.c.x(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((jz) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == b00Var.f24714s2 - 1) {
                    float interpolation = is.f27452g.getInterpolation(w7.o.a(((float) (SystemClock.elapsedRealtime() - b00Var.f24720u2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        b00Var.f24710r2.draw(canvas);
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
            ly lyVar = null;
            arrayList2 = this.f29171a3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            jz jzVar = (jz) arrayList7.get(i10);
            int i14 = jzVar.f27775a;
            int i15 = i10;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                } else if (((ly) arrayList5.get(i15)).M == i14) {
                    lyVar = (ly) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                } else {
                    i15++;
                }
            }
            if (lyVar == null) {
                if (!arrayList2.isEmpty()) {
                    lyVar = (ly) hg.c.x(1, arrayList2);
                } else {
                    lyVar = new ly(this);
                }
                lyVar.M = i14;
                lyVar.e();
            }
            arrayList6.add(lyVar);
            lyVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(jzVar.getLeft(), jzVar.getY() + jzVar.getPaddingTop());
            lyVar.N = jzVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (jzVar.getLeft() * 2);
            int measuredHeight = jzVar.getMeasuredHeight() - jzVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                lyVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ly) arrayList5.get(i16));
                ((ly) arrayList5.get(i16)).O = null;
                ((ly) arrayList5.get(i16)).k();
            } else {
                ((ly) arrayList5.get(i16)).f();
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
            if (this.f29173c3 == null) {
                this.f29173c3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f28875a = x10;
                    obj.f28876b = y3;
                    obj.f28877c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f29173c3.put(pointerId, obj);
                    B0();
                }
            } else {
                my myVar = (my) this.f29173c3.get(pointerId);
                this.f29173c3.remove(pointerId);
                if (E != null && myVar != null) {
                    if (Math.sqrt(Math.pow(y3 - myVar.f28876b, 2.0d) + Math.pow(x10 - myVar.f28875a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        b00 b00Var = this.f29174d3;
                        if (!b00Var.B1.isShowing() || SystemClock.elapsedRealtime() - myVar.f28877c < ViewConfiguration.getLongPressTimeout()) {
                            View view = myVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof jz) {
                                    b00.c(b00Var, (jz) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof qy) {
                                    b00Var.R.E(R, (qy) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (myVar != null && (myVar.d.getBackground() instanceof RippleDrawable)) {
                    myVar.d.getBackground().setState(new int[0]);
                }
                if (myVar != null) {
                    myVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f29173c3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            b00 b00Var = this.f29174d3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                b00Var.M(true);
            }
            if (!canScrollVertically(1)) {
                b00.e(b00Var, 1, AndroidUtilities.dp(36.0f));
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
        b6.release(this, this.f29174d3.f24666d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.X2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((ly) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f29171a3;
            if (i10 < arrayList2.size()) {
                ((ly) arrayList2.get(i10)).f();
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
        b00 b00Var = this.f29174d3;
        if (!b00Var.f24671f) {
            boolean r10 = org.telegram.ui.qt.q().r(motionEvent, this, b00Var.f24677g2, this.f30807n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b00 b00Var = this.f29174d3;
        if (b00Var.f24664d0 && b00Var.f24661c0) {
            this.V2 = true;
            b00Var.Q.h1(0, 0);
            b00Var.f24661c0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        b00Var.l(true);
        z1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.V2 = true;
        int size = View.MeasureSpec.getSize(i10);
        b00 b00Var = this.f29174d3;
        ay ayVar = b00Var.Q;
        int i12 = ayVar.J;
        if (AndroidUtilities.isTablet()) {
            f7 = 60.0f;
        } else {
            f7 = 45.0f;
        }
        ayVar.y1(Math.max(1, size / AndroidUtilities.dp(f7)));
        this.V2 = false;
        super.onMeasure(i10, i11);
        if (i12 != ayVar.J) {
            b00Var.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        b00 b00Var = this.f29174d3;
        int[] iArr = b00Var.D1;
        ov ovVar = b00Var.B1;
        if (b00Var.R1 != null && ovVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f7 = b00Var.U1;
                    if (f7 != -10000.0f) {
                        if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(b00Var.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            b00Var.U1 = -10000.0f;
                            b00Var.V1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    ovVar.f29530c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = ovVar.d;
                    nv nvVar = ovVar.f29530c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + ovVar.f29531e)));
                        if (nvVar.f29149n[0] != max) {
                            AndroidUtilities.vibrateCursor(nvVar);
                            int[] iArr2 = nvVar.f29149n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                nvVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (ovVar != null && ovVar.isShowing() && !ovVar.d) {
                    ovVar.dismiss();
                    int i10 = ovVar.f29530c.f29149n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) b00Var.R1.getTag();
                    if (!b00Var.R1.f27777c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = b00.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        b00Var.R1.a(Emoji.getEmojiBigDrawable(str2), b00Var.R1.f27777c);
                        b00.c(b00Var, b00Var.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            b00.c(b00Var, b00Var.R1, b00.g(replace, str));
                        } else {
                            b00.c(b00Var, b00Var.R1, replace);
                        }
                    }
                }
                if (ovVar == null || !ovVar.d) {
                    b00Var.R1 = null;
                }
                b00Var.U1 = -10000.0f;
                b00Var.V1 = -10000.0f;
            }
            if (ovVar == null || !ovVar.d || ovVar.isShowing()) {
                return true;
            }
        }
        b00Var.S1 = motionEvent.getX();
        b00Var.T1 = motionEvent.getY();
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
        b00 b00Var = this.f29174d3;
        return Math.max(400L, Math.min(45, b00Var.f24717t2 - b00Var.f24714s2) * 35) + Math.max(600L, Math.min(55, b00Var.f24717t2 - b00Var.f24714s2) * 40) + 150;
    }

    public final void y1(View view) {
        if (this.f29173c3 != null) {
            int i10 = 0;
            while (i10 < this.f29173c3.size()) {
                my myVar = (my) this.f29173c3.valueAt(i10);
                if (myVar.d == view) {
                    this.f29173c3.removeAt(i10);
                    i10--;
                    View view2 = myVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        myVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = myVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void z1() {
        b00 b00Var = this.f29174d3;
        int i10 = b00Var.f24660c;
        ny nyVar = b00Var.P;
        ny nyVar2 = b00Var.P;
        b6[] b6VarArr = new b6[nyVar.getChildCount()];
        for (int i11 = 0; i11 < nyVar2.getChildCount(); i11++) {
            View childAt = nyVar2.getChildAt(i11);
            if (childAt instanceof jz) {
                b6VarArr[i11] = ((jz) childAt).getSpan();
            }
        }
        b00Var.f24666d2 = b6.update(i10, this, b6VarArr, b00Var.f24666d2);
    }
}

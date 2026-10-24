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
public final class cy extends lm0 {
    public boolean Y2;
    public final SparseArray Z2;
    public final ArrayList f25482a3;
    public final ArrayList f25483b3;
    public final ArrayList f25484c3;
    public final ArrayList f25485d3;
    public int f25486e3;
    public SparseArray f25487f3;
    public final rz f25488g3;

    public cy(rz rzVar, Context context) {
        super(context, null);
        this.f25488g3 = rzVar;
        this.Z2 = new SparseArray();
        this.f25482a3 = new ArrayList();
        this.f25483b3 = new ArrayList();
        this.f25484c3 = new ArrayList();
        this.f25485d3 = new ArrayList();
        this.f25486e3 = -1;
        new SparseIntArray();
        zr zrVar = zr.f33337f;
    }

    public final long C1() {
        rz rzVar = this.f25488g3;
        return Math.max(400L, Math.min(45, rzVar.f30367u2 - rzVar.f30364t2) * 35) + Math.max(600L, Math.min(55, rzVar.f30367u2 - rzVar.f30364t2) * 40) + 150;
    }

    public final void D1(View view) {
        if (this.f25487f3 != null) {
            int i10 = 0;
            while (i10 < this.f25487f3.size()) {
                ay ayVar = (ay) this.f25487f3.valueAt(i10);
                if (ayVar.d == view) {
                    this.f25487f3.removeAt(i10);
                    i10--;
                    View view2 = ayVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        ayVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = ayVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void E1() {
        rz rzVar = this.f25488g3;
        int i10 = rzVar.f30308c;
        cy cyVar = rzVar.P;
        cy cyVar2 = rzVar.P;
        y5[] y5VarArr = new y5[cyVar.getChildCount()];
        for (int i11 = 0; i11 < cyVar2.getChildCount(); i11++) {
            View childAt = cyVar2.getChildAt(i11);
            if (childAt instanceof az) {
                y5VarArr[i11] = ((az) childAt).getSpan();
            }
        }
        rzVar.f30314d2 = y5.update(i10, this, y5VarArr, rzVar.f30314d2);
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
        rz rzVar = this.f25488g3;
        cy cyVar = rzVar.P;
        super.J0(canvas, rectF, j10);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f25486e3 != getChildCount()) {
            E1();
            this.f25486e3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.Z2;
            int size = sparseArray.size();
            arrayList = this.f25484c3;
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
        if (rzVar.f30370v2 > 0 && SystemClock.elapsedRealtime() - rzVar.f30370v2 < C1() && rzVar.f30361s2 != null && rzVar.f30364t2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f7 = 0.0f;
        if (rzVar.f30314d2 != null && cyVar != null) {
            int i14 = 0;
            while (i14 < cyVar.getChildCount()) {
                View childAt = cyVar.getChildAt(i14);
                if (childAt instanceof az) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) i2.o1.A(i13, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((az) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == rzVar.f30364t2 - i13) {
                    z11 = z10;
                    float interpolation = zr.f33338g.getInterpolation(w7.r.a(((float) (SystemClock.elapsedRealtime() - rzVar.f30370v2)) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        rzVar.f30361s2.draw(canvas2);
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
        ArrayList arrayList5 = this.f25483b3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f25482a3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            zx zxVar = null;
            arrayList2 = this.f25485d3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            az azVar = (az) arrayList7.get(i11);
            int i16 = azVar.f24846a;
            int i17 = i11;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                } else if (((zx) arrayList5.get(i17)).M == i16) {
                    zxVar = (zx) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                } else {
                    i17++;
                }
            }
            if (zxVar == null) {
                if (!arrayList2.isEmpty()) {
                    zxVar = (zx) i2.o1.A(1, arrayList2);
                } else {
                    zxVar = new zx(this);
                }
                zxVar.M = i16;
                zxVar.e();
            }
            arrayList6.add(zxVar);
            zxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(azVar.getLeft(), azVar.getY() + azVar.getPaddingTop());
            zxVar.N = azVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (azVar.getLeft() * 2);
            int measuredHeight = azVar.getMeasuredHeight() - azVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                zxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((zx) arrayList5.get(i18));
                ((zx) arrayList5.get(i18)).O = null;
                ((zx) arrayList5.get(i18)).k();
            } else {
                ((zx) arrayList5.get(i18)).f();
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
        rz rzVar = this.f25488g3;
        cy cyVar = rzVar.P;
        rzVar.f30344n2.h++;
        if (this.f25486e3 != getChildCount()) {
            E1();
            this.f25486e3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.Z2;
            int size = sparseArray.size();
            arrayList = this.f25484c3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        if (rzVar.f30370v2 > 0 && SystemClock.elapsedRealtime() - rzVar.f30370v2 < C1() && rzVar.f30361s2 != null && rzVar.f30364t2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rzVar.f30314d2 != null && cyVar != null) {
            for (int i12 = 0; i12 < cyVar.getChildCount(); i12++) {
                View childAt = cyVar.getChildAt(i12);
                if (childAt instanceof az) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) i2.o1.A(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((az) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == rzVar.f30364t2 - 1) {
                    float interpolation = zr.f33338g.getInterpolation(w7.r.a(((float) (SystemClock.elapsedRealtime() - rzVar.f30370v2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        rzVar.f30361s2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.f25483b3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f25482a3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            zx zxVar = null;
            arrayList2 = this.f25485d3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            az azVar = (az) arrayList7.get(i10);
            int i14 = azVar.f24846a;
            int i15 = i10;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                } else if (((zx) arrayList5.get(i15)).M == i14) {
                    zxVar = (zx) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                } else {
                    i15++;
                }
            }
            if (zxVar == null) {
                if (!arrayList2.isEmpty()) {
                    zxVar = (zx) i2.o1.A(1, arrayList2);
                } else {
                    zxVar = new zx(this);
                }
                zxVar.M = i14;
                zxVar.e();
            }
            arrayList6.add(zxVar);
            zxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(azVar.getLeft(), azVar.getY() + azVar.getPaddingTop());
            zxVar.N = azVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (azVar.getLeft() * 2);
            int measuredHeight = azVar.getMeasuredHeight() - azVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                zxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((zx) arrayList5.get(i16));
                ((zx) arrayList5.get(i16)).O = null;
                ((zx) arrayList5.get(i16)).k();
            } else {
                ((zx) arrayList5.get(i16)).f();
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
            if (this.f25487f3 == null) {
                this.f25487f3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f24833a = x10;
                    obj.f24834b = y3;
                    obj.f24835c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f25487f3.put(pointerId, obj);
                    B0();
                }
            } else {
                ay ayVar = (ay) this.f25487f3.get(pointerId);
                this.f25487f3.remove(pointerId);
                if (E != null && ayVar != null) {
                    if (Math.sqrt(Math.pow(y3 - ayVar.f24834b, 2.0d) + Math.pow(x10 - ayVar.f24833a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        rz rzVar = this.f25488g3;
                        if (!rzVar.B1.isShowing() || SystemClock.elapsedRealtime() - ayVar.f24835c < ViewConfiguration.getLongPressTimeout()) {
                            View view = ayVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof az) {
                                    rz.d(rzVar, (az) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof fy) {
                                    rzVar.R.E(R, (fy) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (ayVar != null && (ayVar.d.getBackground() instanceof RippleDrawable)) {
                    ayVar.d.getBackground().setState(new int[0]);
                }
                if (ayVar != null) {
                    ayVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f25487f3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            rz rzVar = this.f25488g3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                rzVar.M(true);
            }
            if (!canScrollVertically(1)) {
                rz.e(rzVar, 1, AndroidUtilities.dp(36.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        E1();
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        y5.release(this, this.f25488g3.f30314d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f25482a3;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((zx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f25485d3;
            if (i10 < arrayList2.size()) {
                ((zx) arrayList2.get(i10)).f();
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
        rz rzVar = this.f25488g3;
        if (!rzVar.f30318f) {
            boolean p5 = org.telegram.ui.ht.o().p(motionEvent, this, rzVar.f30324g2, this.f28396n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !p5) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        rz rzVar = this.f25488g3;
        if (rzVar.f30312d0 && rzVar.f30309c0) {
            this.Y2 = true;
            rzVar.Q.h1(0, 0);
            rzVar.f30309c0 = false;
            this.Y2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        rzVar.l(true);
        E1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.Y2 = true;
        int size = View.MeasureSpec.getSize(i10);
        rz rzVar = this.f25488g3;
        px pxVar = rzVar.Q;
        int i12 = pxVar.J;
        if (AndroidUtilities.isTablet()) {
            f7 = 60.0f;
        } else {
            f7 = 45.0f;
        }
        pxVar.y1(Math.max(1, size / AndroidUtilities.dp(f7)));
        this.Y2 = false;
        super.onMeasure(i10, i11);
        if (i12 != pxVar.J) {
            rzVar.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        rz rzVar = this.f25488g3;
        int[] iArr = rzVar.D1;
        cv cvVar = rzVar.B1;
        if (rzVar.R1 != null && cvVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f7 = rzVar.U1;
                    if (f7 != -10000.0f) {
                        if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(rzVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            rzVar.U1 = -10000.0f;
                            rzVar.V1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    cvVar.f25478c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = cvVar.d;
                    bv bvVar = cvVar.f25478c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + cvVar.e)));
                        if (bvVar.f25100n[0] != max) {
                            AndroidUtilities.vibrateCursor(bvVar);
                            int[] iArr2 = bvVar.f25100n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                bvVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (cvVar != null && cvVar.isShowing() && !cvVar.d) {
                    cvVar.dismiss();
                    int i10 = cvVar.f25478c.f25100n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) rzVar.R1.getTag();
                    if (!rzVar.R1.f24848c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = rz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        rzVar.R1.a(Emoji.getEmojiBigDrawable(str2), rzVar.R1.f24848c);
                        rz.d(rzVar, rzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            rz.d(rzVar, rzVar.R1, rz.g(replace, str));
                        } else {
                            rz.d(rzVar, rzVar.R1, replace);
                        }
                    }
                }
                if (cvVar == null || !cvVar.d) {
                    rzVar.R1 = null;
                }
                rzVar.U1 = -10000.0f;
                rzVar.V1 = -10000.0f;
            }
            if (cvVar == null || !cvVar.d || cvVar.isShowing()) {
                return true;
            }
        }
        rzVar.S1 = motionEvent.getX();
        rzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.Y2) {
            return;
        }
        super.requestLayout();
    }
}

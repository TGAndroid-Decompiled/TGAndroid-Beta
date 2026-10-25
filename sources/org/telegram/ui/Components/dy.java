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
public final class dy extends mm0 {
    public boolean f27624f3;
    public final SparseArray f27625g3;
    public final ArrayList f27626h3;
    public final ArrayList f27627i3;
    public final ArrayList f27628j3;
    public final ArrayList f27629k3;
    public int f27630l3;
    public SparseArray f27631m3;
    public final sz f27632n3;

    public dy(sz szVar, Context context) {
        super(context, null);
        this.f27632n3 = szVar;
        this.f27625g3 = new SparseArray();
        this.f27626h3 = new ArrayList();
        this.f27627i3 = new ArrayList();
        this.f27628j3 = new ArrayList();
        this.f27629k3 = new ArrayList();
        this.f27630l3 = -1;
        new SparseIntArray();
        ds dsVar = ds.f27584f;
    }

    public final long C1() {
        sz szVar = this.f27632n3;
        return Math.max(400L, Math.min(45, szVar.f32773u2 - szVar.f32770t2) * 35) + Math.max(600L, Math.min(55, szVar.f32773u2 - szVar.f32770t2) * 40) + 150;
    }

    public final void D1(View view) {
        if (this.f27631m3 != null) {
            int i10 = 0;
            while (i10 < this.f27631m3.size()) {
                cy cyVar = (cy) this.f27631m3.valueAt(i10);
                if (cyVar.d == view) {
                    this.f27631m3.removeAt(i10);
                    i10--;
                    View view2 = cyVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        cyVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = cyVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void E1() {
        sz szVar = this.f27632n3;
        int i10 = szVar.f32714c;
        dy dyVar = szVar.P;
        dy dyVar2 = szVar.P;
        c6[] c6VarArr = new c6[dyVar.getChildCount()];
        for (int i11 = 0; i11 < dyVar2.getChildCount(); i11++) {
            View childAt = dyVar2.getChildAt(i11);
            if (childAt instanceof bz) {
                c6VarArr[i11] = ((bz) childAt).getSpan();
            }
        }
        szVar.f32720d2 = c6.update(i10, this, c6VarArr, szVar.f32720d2);
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
        sz szVar = this.f27632n3;
        dy dyVar = szVar.P;
        super.J0(canvas, rectF, j10);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f27630l3 != getChildCount()) {
            E1();
            this.f27630l3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.f27625g3;
            int size = sparseArray.size();
            arrayList = this.f27628j3;
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
        if (szVar.f32776v2 > 0 && SystemClock.elapsedRealtime() - szVar.f32776v2 < C1() && szVar.f32767s2 != null && szVar.f32770t2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f7 = 0.0f;
        if (szVar.f32720d2 != null && dyVar != null) {
            int i14 = 0;
            while (i14 < dyVar.getChildCount()) {
                View childAt = dyVar.getChildAt(i14);
                if (childAt instanceof bz) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) ic.a.y(i13, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((bz) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == szVar.f32770t2 - i13) {
                    z11 = z10;
                    float interpolation = ds.f27585g.getInterpolation(a8.ee.a(((float) (SystemClock.elapsedRealtime() - szVar.f32776v2)) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        szVar.f32767s2.draw(canvas2);
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
        ArrayList arrayList5 = this.f27627i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f27626h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            ay ayVar = null;
            arrayList2 = this.f27629k3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            bz bzVar = (bz) arrayList7.get(i11);
            int i16 = bzVar.f26998a;
            int i17 = i11;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                } else if (((ay) arrayList5.get(i17)).M == i16) {
                    ayVar = (ay) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                } else {
                    i17++;
                }
            }
            if (ayVar == null) {
                if (!arrayList2.isEmpty()) {
                    ayVar = (ay) ic.a.y(1, arrayList2);
                } else {
                    ayVar = new ay(this);
                }
                ayVar.M = i16;
                ayVar.e();
            }
            arrayList6.add(ayVar);
            ayVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(bzVar.getLeft(), bzVar.getY() + bzVar.getPaddingTop());
            ayVar.N = bzVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (bzVar.getLeft() * 2);
            int measuredHeight = bzVar.getMeasuredHeight() - bzVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                ayVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ay) arrayList5.get(i18));
                ((ay) arrayList5.get(i18)).O = null;
                ((ay) arrayList5.get(i18)).k();
            } else {
                ((ay) arrayList5.get(i18)).f();
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
        sz szVar = this.f27632n3;
        dy dyVar = szVar.P;
        szVar.f32750n2.g();
        if (this.f27630l3 != getChildCount()) {
            E1();
            this.f27630l3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.f27625g3;
            int size = sparseArray.size();
            arrayList = this.f27628j3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        if (szVar.f32776v2 > 0 && SystemClock.elapsedRealtime() - szVar.f32776v2 < C1() && szVar.f32767s2 != null && szVar.f32770t2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (szVar.f32720d2 != null && dyVar != null) {
            for (int i12 = 0; i12 < dyVar.getChildCount(); i12++) {
                View childAt = dyVar.getChildAt(i12);
                if (childAt instanceof bz) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        if (!arrayList.isEmpty()) {
                            arrayList4 = (ArrayList) ic.a.y(1, arrayList);
                        } else {
                            arrayList4 = new ArrayList();
                        }
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((bz) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == szVar.f32770t2 - 1) {
                    float interpolation = ds.f27585g.getInterpolation(a8.ee.a(((float) (SystemClock.elapsedRealtime() - szVar.f32776v2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        szVar.f32767s2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.f27627i3;
        arrayList5.clear();
        ArrayList arrayList6 = this.f27626h3;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            ay ayVar = null;
            arrayList2 = this.f27629k3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            bz bzVar = (bz) arrayList7.get(i10);
            int i14 = bzVar.f26998a;
            int i15 = i10;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                } else if (((ay) arrayList5.get(i15)).M == i14) {
                    ayVar = (ay) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                } else {
                    i15++;
                }
            }
            if (ayVar == null) {
                if (!arrayList2.isEmpty()) {
                    ayVar = (ay) ic.a.y(1, arrayList2);
                } else {
                    ayVar = new ay(this);
                }
                ayVar.M = i14;
                ayVar.e();
            }
            arrayList6.add(ayVar);
            ayVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(bzVar.getLeft(), bzVar.getY() + bzVar.getPaddingTop());
            ayVar.N = bzVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (bzVar.getLeft() * 2);
            int measuredHeight = bzVar.getMeasuredHeight() - bzVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                ayVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ay) arrayList5.get(i16));
                ((ay) arrayList5.get(i16)).O = null;
                ((ay) arrayList5.get(i16)).k();
            } else {
                ((ay) arrayList5.get(i16)).f();
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
            if (this.f27631m3 == null) {
                this.f27631m3 = new SparseArray();
            }
            float x9 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x9, y3);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f27278a = x9;
                    obj.f27279b = y3;
                    obj.f27280c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f27631m3.put(pointerId, obj);
                    C0();
                }
            } else {
                cy cyVar = (cy) this.f27631m3.get(pointerId);
                this.f27631m3.remove(pointerId);
                if (E != null && cyVar != null) {
                    if (Math.sqrt(Math.pow(y3 - cyVar.f27279b, 2.0d) + Math.pow(x9 - cyVar.f27278a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        sz szVar = this.f27632n3;
                        if (!szVar.B1.isShowing() || SystemClock.elapsedRealtime() - cyVar.f27280c < ViewConfiguration.getLongPressTimeout()) {
                            View view = cyVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof bz) {
                                    sz.b(szVar, (bz) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof gy) {
                                    szVar.R.E(R, (gy) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (cyVar != null && (cyVar.d.getBackground() instanceof RippleDrawable)) {
                    cyVar.d.getBackground().setState(new int[0]);
                }
                if (cyVar != null) {
                    cyVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f27631m3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void k0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            sz szVar = this.f27632n3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                szVar.M(true);
            }
            if (!canScrollVertically(1)) {
                sz.e(szVar, 1, AndroidUtilities.dp(36.0f));
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
        c6.release(this, this.f27632n3.f32720d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.f27626h3;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((ay) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f27629k3;
            if (i10 < arrayList2.size()) {
                ((ay) arrayList2.get(i10)).f();
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
        sz szVar = this.f27632n3;
        if (!szVar.f32724f) {
            boolean p10 = org.telegram.ui.ft.o().p(motionEvent, this, szVar.f32730g2, this.f30644n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !p10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        sz szVar = this.f27632n3;
        if (szVar.f32718d0 && szVar.f32715c0) {
            this.f27624f3 = true;
            szVar.Q.h1(0, 0);
            szVar.f32715c0 = false;
            this.f27624f3 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        szVar.l(true);
        E1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.f27624f3 = true;
        int size = View.MeasureSpec.getSize(i10);
        sz szVar = this.f27632n3;
        qx qxVar = szVar.Q;
        int i12 = qxVar.J;
        if (AndroidUtilities.isTablet()) {
            f7 = 60.0f;
        } else {
            f7 = 45.0f;
        }
        qxVar.z1(Math.max(1, size / AndroidUtilities.dp(f7)));
        this.f27624f3 = false;
        super.onMeasure(i10, i11);
        if (i12 != qxVar.J) {
            szVar.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        sz szVar = this.f27632n3;
        int[] iArr = szVar.D1;
        fv fvVar = szVar.B1;
        if (szVar.R1 != null && fvVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f7 = szVar.U1;
                    if (f7 != -10000.0f) {
                        if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(szVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            szVar.U1 = -10000.0f;
                            szVar.V1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x9 = motionEvent.getX() + iArr[0];
                    fvVar.f28320c.getLocationOnScreen(iArr);
                    int dp = (int) (x9 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = fvVar.d;
                    ev evVar = fvVar.f28320c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + fvVar.e)));
                        if (evVar.f27989n[0] != max) {
                            AndroidUtilities.vibrateCursor(evVar);
                            int[] iArr2 = evVar.f27989n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                evVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (fvVar != null && fvVar.isShowing() && !fvVar.d) {
                    fvVar.dismiss();
                    int i10 = fvVar.f28320c.f27989n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) szVar.R1.getTag();
                    if (!szVar.R1.f27000c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = sz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        szVar.R1.a(Emoji.getEmojiBigDrawable(str2), szVar.R1.f27000c);
                        sz.b(szVar, szVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            sz.b(szVar, szVar.R1, sz.g(replace, str));
                        } else {
                            sz.b(szVar, szVar.R1, replace);
                        }
                    }
                }
                if (fvVar == null || !fvVar.d) {
                    szVar.R1 = null;
                }
                szVar.U1 = -10000.0f;
                szVar.V1 = -10000.0f;
            }
            if (fvVar == null || !fvVar.d || fvVar.isShowing()) {
                return true;
            }
        }
        szVar.S1 = motionEvent.getX();
        szVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.f27624f3) {
            return;
        }
        super.requestLayout();
    }
}

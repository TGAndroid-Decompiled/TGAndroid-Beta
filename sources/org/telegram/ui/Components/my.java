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
public final class my extends qm0 {
    public boolean V2;
    public final SparseArray W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public final ArrayList f28967a3;
    public int f28968b3;
    public SparseArray f28969c3;
    public final a00 f28970d3;

    public my(a00 a00Var, Context context) {
        super(context, null);
        this.f28970d3 = a00Var;
        this.W2 = new SparseArray();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f28967a3 = new ArrayList();
        this.f28968b3 = -1;
        new SparseIntArray();
        hs hsVar = hs.f27118f;
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
        a00 a00Var = this.f28970d3;
        my myVar = a00Var.P;
        super.J0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f28968b3 != getChildCount()) {
            z1();
            this.f28968b3 = getChildCount();
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
        if (a00Var.f24459u2 > 0 && SystemClock.elapsedRealtime() - a00Var.f24459u2 < x1() && a00Var.f24449r2 != null && a00Var.f24453s2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f7 = 0.0f;
        if (a00Var.f24405d2 != null && myVar != null) {
            int i14 = 0;
            while (i14 < myVar.getChildCount()) {
                View childAt = myVar.getChildAt(i14);
                if (childAt instanceof iz) {
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
                    arrayList4.add((iz) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == a00Var.f24453s2 - i13) {
                    z11 = z10;
                    float interpolation = hs.f27119g.getInterpolation(w7.o.a(((float) (SystemClock.elapsedRealtime() - a00Var.f24459u2)) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        a00Var.f24449r2.draw(canvas2);
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
            ky kyVar = null;
            arrayList2 = this.f28967a3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            iz izVar = (iz) arrayList7.get(i11);
            int i16 = izVar.f27517a;
            int i17 = i11;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                } else if (((ky) arrayList5.get(i17)).M == i16) {
                    kyVar = (ky) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                } else {
                    i17++;
                }
            }
            if (kyVar == null) {
                if (!arrayList2.isEmpty()) {
                    kyVar = (ky) hg.c.x(1, arrayList2);
                } else {
                    kyVar = new ky(this);
                }
                kyVar.M = i16;
                kyVar.e();
            }
            arrayList6.add(kyVar);
            kyVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(izVar.getLeft(), izVar.getY() + izVar.getPaddingTop());
            kyVar.N = izVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (izVar.getLeft() * 2);
            int measuredHeight = izVar.getMeasuredHeight() - izVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                kyVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ky) arrayList5.get(i18));
                ((ky) arrayList5.get(i18)).O = null;
                ((ky) arrayList5.get(i18)).k();
            } else {
                ((ky) arrayList5.get(i18)).f();
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
        a00 a00Var = this.f28970d3;
        my myVar = a00Var.P;
        a00Var.f24432m2.h++;
        if (this.f28968b3 != getChildCount()) {
            z1();
            this.f28968b3 = getChildCount();
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
        if (a00Var.f24459u2 > 0 && SystemClock.elapsedRealtime() - a00Var.f24459u2 < x1() && a00Var.f24449r2 != null && a00Var.f24453s2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (a00Var.f24405d2 != null && myVar != null) {
            for (int i12 = 0; i12 < myVar.getChildCount(); i12++) {
                View childAt = myVar.getChildAt(i12);
                if (childAt instanceof iz) {
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
                    arrayList4.add((iz) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == a00Var.f24453s2 - 1) {
                    float interpolation = hs.f27119g.getInterpolation(w7.o.a(((float) (SystemClock.elapsedRealtime() - a00Var.f24459u2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        a00Var.f24449r2.draw(canvas);
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
            ky kyVar = null;
            arrayList2 = this.f28967a3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            iz izVar = (iz) arrayList7.get(i10);
            int i14 = izVar.f27517a;
            int i15 = i10;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                } else if (((ky) arrayList5.get(i15)).M == i14) {
                    kyVar = (ky) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                } else {
                    i15++;
                }
            }
            if (kyVar == null) {
                if (!arrayList2.isEmpty()) {
                    kyVar = (ky) hg.c.x(1, arrayList2);
                } else {
                    kyVar = new ky(this);
                }
                kyVar.M = i14;
                kyVar.e();
            }
            arrayList6.add(kyVar);
            kyVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(izVar.getLeft(), izVar.getY() + izVar.getPaddingTop());
            kyVar.N = izVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (izVar.getLeft() * 2);
            int measuredHeight = izVar.getMeasuredHeight() - izVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                kyVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((ky) arrayList5.get(i16));
                ((ky) arrayList5.get(i16)).O = null;
                ((ky) arrayList5.get(i16)).k();
            } else {
                ((ky) arrayList5.get(i16)).f();
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
            if (this.f28969c3 == null) {
                this.f28969c3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f28624a = x10;
                    obj.f28625b = y3;
                    obj.f28626c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f28969c3.put(pointerId, obj);
                    B0();
                }
            } else {
                ly lyVar = (ly) this.f28969c3.get(pointerId);
                this.f28969c3.remove(pointerId);
                if (E != null && lyVar != null) {
                    if (Math.sqrt(Math.pow(y3 - lyVar.f28625b, 2.0d) + Math.pow(x10 - lyVar.f28624a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        a00 a00Var = this.f28970d3;
                        if (!a00Var.B1.isShowing() || SystemClock.elapsedRealtime() - lyVar.f28626c < ViewConfiguration.getLongPressTimeout()) {
                            View view = lyVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof iz) {
                                    a00.c(a00Var, (iz) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof py) {
                                    a00Var.R.E(R, (py) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (lyVar != null && (lyVar.d.getBackground() instanceof RippleDrawable)) {
                    lyVar.d.getBackground().setState(new int[0]);
                }
                if (lyVar != null) {
                    lyVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f28969c3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            a00 a00Var = this.f28970d3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                a00Var.M(true);
            }
            if (!canScrollVertically(1)) {
                a00.e(a00Var, 1, AndroidUtilities.dp(36.0f));
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
        b6.release(this, this.f28970d3.f24405d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.X2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((ky) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f28967a3;
            if (i10 < arrayList2.size()) {
                ((ky) arrayList2.get(i10)).f();
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
        a00 a00Var = this.f28970d3;
        if (!a00Var.f24410f) {
            boolean r10 = org.telegram.ui.rt.q().r(motionEvent, this, a00Var.f24416g2, this.f30216n2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a00 a00Var = this.f28970d3;
        if (a00Var.f24403d0 && a00Var.f24400c0) {
            this.V2 = true;
            a00Var.Q.h1(0, 0);
            a00Var.f24400c0 = false;
            this.V2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        a00Var.l(true);
        z1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.V2 = true;
        int size = View.MeasureSpec.getSize(i10);
        a00 a00Var = this.f28970d3;
        zx zxVar = a00Var.Q;
        int i12 = zxVar.J;
        if (AndroidUtilities.isTablet()) {
            f7 = 60.0f;
        } else {
            f7 = 45.0f;
        }
        zxVar.y1(Math.max(1, size / AndroidUtilities.dp(f7)));
        this.V2 = false;
        super.onMeasure(i10, i11);
        if (i12 != zxVar.J) {
            a00Var.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        a00 a00Var = this.f28970d3;
        int[] iArr = a00Var.D1;
        nv nvVar = a00Var.B1;
        if (a00Var.R1 != null && nvVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f7 = a00Var.U1;
                    if (f7 != -10000.0f) {
                        if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(a00Var.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            a00Var.U1 = -10000.0f;
                            a00Var.V1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    nvVar.f29288c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = nvVar.d;
                    mv mvVar = nvVar.f29288c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + nvVar.f29289e)));
                        if (mvVar.f28948n[0] != max) {
                            AndroidUtilities.vibrateCursor(mvVar);
                            int[] iArr2 = mvVar.f28948n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                mvVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (nvVar != null && nvVar.isShowing() && !nvVar.d) {
                    nvVar.dismiss();
                    int i10 = nvVar.f29288c.f28948n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) a00Var.R1.getTag();
                    if (!a00Var.R1.f27519c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = a00.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        a00Var.R1.a(Emoji.getEmojiBigDrawable(str2), a00Var.R1.f27519c);
                        a00.c(a00Var, a00Var.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            a00.c(a00Var, a00Var.R1, a00.g(replace, str));
                        } else {
                            a00.c(a00Var, a00Var.R1, replace);
                        }
                    }
                }
                if (nvVar == null || !nvVar.d) {
                    a00Var.R1 = null;
                }
                a00Var.U1 = -10000.0f;
                a00Var.V1 = -10000.0f;
            }
            if (nvVar == null || !nvVar.d || nvVar.isShowing()) {
                return true;
            }
        }
        a00Var.S1 = motionEvent.getX();
        a00Var.T1 = motionEvent.getY();
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
        a00 a00Var = this.f28970d3;
        return Math.max(400L, Math.min(45, a00Var.f24456t2 - a00Var.f24453s2) * 35) + Math.max(600L, Math.min(55, a00Var.f24456t2 - a00Var.f24453s2) * 40) + 150;
    }

    public final void y1(View view) {
        if (this.f28969c3 != null) {
            int i10 = 0;
            while (i10 < this.f28969c3.size()) {
                ly lyVar = (ly) this.f28969c3.valueAt(i10);
                if (lyVar.d == view) {
                    this.f28969c3.removeAt(i10);
                    i10--;
                    View view2 = lyVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        lyVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = lyVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void z1() {
        a00 a00Var = this.f28970d3;
        int i10 = a00Var.f24399c;
        my myVar = a00Var.P;
        my myVar2 = a00Var.P;
        b6[] b6VarArr = new b6[myVar.getChildCount()];
        for (int i11 = 0; i11 < myVar2.getChildCount(); i11++) {
            View childAt = myVar2.getChildAt(i11);
            if (childAt instanceof iz) {
                b6VarArr[i11] = ((iz) childAt).getSpan();
            }
        }
        a00Var.f24405d2 = b6.update(i10, this, b6VarArr, a00Var.f24405d2);
    }
}

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
public final class yx extends xl0 {
    public boolean X2;
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList f30717a3;
    public final ArrayList f30718b3;
    public final ArrayList f30719c3;
    public int f30720d3;
    public SparseArray f30721e3;
    public final mz f30722f3;

    public yx(mz mzVar, Context context) {
        super(context, null);
        this.f30722f3 = mzVar;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.f30717a3 = new ArrayList();
        this.f30718b3 = new ArrayList();
        this.f30719c3 = new ArrayList();
        this.f30720d3 = -1;
        new SparseIntArray();
        sr srVar = sr.f28339f;
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
        mz mzVar = this.f30722f3;
        yx yxVar = mzVar.P;
        super.J0(canvas, rectF, j3);
        canvas2.save();
        canvas.clipRect(rectF);
        if (this.f30720d3 != getChildCount()) {
            y1();
            this.f30720d3 = getChildCount();
        }
        int i11 = 0;
        int i12 = 0;
        while (true) {
            sparseArray = this.Y2;
            int size = sparseArray.size();
            arrayList = this.f30718b3;
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
        if (mzVar.f26605u2 > 0 && SystemClock.elapsedRealtime() - mzVar.f26605u2 < w1() && mzVar.f26595r2 != null && mzVar.f26599s2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f7 = 0.0f;
        if (mzVar.f26552d2 != null && yxVar != null) {
            int i14 = 0;
            while (i14 < yxVar.getChildCount()) {
                View childAt = yxVar.getChildAt(i14);
                if (childAt instanceof vy) {
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
                    arrayList4.add((vy) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == mzVar.f26599s2 - i13) {
                    z11 = z10;
                    float interpolation = sr.f28340g.getInterpolation(w7.q.a(((float) (SystemClock.elapsedRealtime() - mzVar.f26605u2)) / 140.0f, f7, 1.0f));
                    if (interpolation >= 1.0f || (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()))) {
                        i10 = i14;
                    } else {
                        float f10 = 1.0f - interpolation;
                        i10 = i14;
                        canvas2.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas2.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas2.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        mzVar.f26595r2.draw(canvas2);
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
        ArrayList arrayList5 = this.f30717a3;
        arrayList5.clear();
        ArrayList arrayList6 = this.Z2;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i15 = 0;
        while (true) {
            int size2 = sparseArray.size();
            wx wxVar = null;
            arrayList2 = this.f30719c3;
            if (i15 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i15);
            vy vyVar = (vy) arrayList7.get(i11);
            int i16 = vyVar.f29787a;
            int i17 = 0;
            while (true) {
                if (i17 >= arrayList5.size()) {
                    break;
                } else if (((wx) arrayList5.get(i17)).M == i16) {
                    wxVar = (wx) arrayList5.get(i17);
                    arrayList5.remove(i17);
                    break;
                } else {
                    i17++;
                }
            }
            if (wxVar == null) {
                if (!arrayList2.isEmpty()) {
                    wxVar = (wx) hg.c.x(1, arrayList2);
                } else {
                    wxVar = new wx(this);
                }
                wxVar.M = i16;
                wxVar.e();
            }
            arrayList6.add(wxVar);
            wxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(vyVar.getLeft(), vyVar.getY() + vyVar.getPaddingTop());
            wxVar.N = vyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (vyVar.getLeft() * 2);
            int measuredHeight = vyVar.getMeasuredHeight() - vyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                if (Build.VERSION.SDK_INT >= 30 && canvas2.quickReject(0.0f, 0.0f, measuredWidth, measuredHeight)) {
                }
                wxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i15++;
            canvas2 = canvas;
            i11 = 0;
        }
        for (int i18 = 0; i18 < arrayList5.size(); i18++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((wx) arrayList5.get(i18));
                ((wx) arrayList5.get(i18)).O = null;
                ((wx) arrayList5.get(i18)).k();
            } else {
                ((wx) arrayList5.get(i18)).f();
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
        mz mzVar = this.f30722f3;
        yx yxVar = mzVar.P;
        mzVar.f26578m2.h++;
        if (this.f30720d3 != getChildCount()) {
            y1();
            this.f30720d3 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.Y2;
            int size = sparseArray.size();
            arrayList = this.f30718b3;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        if (mzVar.f26605u2 > 0 && SystemClock.elapsedRealtime() - mzVar.f26605u2 < w1() && mzVar.f26595r2 != null && mzVar.f26599s2 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (mzVar.f26552d2 != null && yxVar != null) {
            for (int i12 = 0; i12 < yxVar.getChildCount(); i12++) {
                View childAt = yxVar.getChildAt(i12);
                if (childAt instanceof vy) {
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
                    arrayList4.add((vy) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == mzVar.f26599s2 - 1) {
                    float interpolation = sr.f28340g.getInterpolation(w7.q.a(((float) (SystemClock.elapsedRealtime() - mzVar.f26605u2)) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f7 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f7), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f10 = (f7 * 0.5f) + 0.5f;
                        canvas.scale(f10, f10, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        mzVar.f26595r2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        Canvas canvas2 = canvas;
        ArrayList arrayList5 = this.f30717a3;
        arrayList5.clear();
        ArrayList arrayList6 = this.Z2;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long currentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            wx wxVar = null;
            arrayList2 = this.f30719c3;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            vy vyVar = (vy) arrayList7.get(i10);
            int i14 = vyVar.f29787a;
            int i15 = 0;
            while (true) {
                if (i15 >= arrayList5.size()) {
                    break;
                } else if (((wx) arrayList5.get(i15)).M == i14) {
                    wxVar = (wx) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                } else {
                    i15++;
                }
            }
            if (wxVar == null) {
                if (!arrayList2.isEmpty()) {
                    wxVar = (wx) hg.c.x(1, arrayList2);
                } else {
                    wxVar = new wx(this);
                }
                wxVar.M = i14;
                wxVar.e();
            }
            arrayList6.add(wxVar);
            wxVar.O = arrayList7;
            canvas2.save();
            canvas2.translate(vyVar.getLeft(), vyVar.getY() + vyVar.getPaddingTop());
            wxVar.N = vyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (vyVar.getLeft() * 2);
            int measuredHeight = vyVar.getMeasuredHeight() - vyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                wxVar.a(canvas2, currentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            canvas2 = canvas;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((wx) arrayList5.get(i16));
                ((wx) arrayList5.get(i16)).O = null;
                ((wx) arrayList5.get(i16)).k();
            } else {
                ((wx) arrayList5.get(i16)).f();
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
            if (this.f30721e3 == null) {
                this.f30721e3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f30483a = x10;
                    obj.f30484b = y3;
                    obj.f30485c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f30721e3.put(pointerId, obj);
                    B0();
                }
            } else {
                xx xxVar = (xx) this.f30721e3.get(pointerId);
                this.f30721e3.remove(pointerId);
                if (E != null && xxVar != null) {
                    if (Math.sqrt(Math.pow(y3 - xxVar.f30484b, 2.0d) + Math.pow(x10 - xxVar.f30483a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        mz mzVar = this.f30722f3;
                        if (!mzVar.B1.isShowing() || SystemClock.elapsedRealtime() - xxVar.f30485c < ViewConfiguration.getLongPressTimeout()) {
                            View view = xxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof vy) {
                                    mz.c(mzVar, (vy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof cy) {
                                    mzVar.R.E(R, (cy) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (xxVar != null && (xxVar.d.getBackground() instanceof RippleDrawable)) {
                    xxVar.d.getBackground().setState(new int[0]);
                }
                if (xxVar != null) {
                    xxVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f30721e3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            mz mzVar = this.f30722f3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                mzVar.M(true);
            }
            if (!canScrollVertically(1)) {
                mz.e(mzVar, 1, AndroidUtilities.dp(36.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        y1();
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        z5.release(this, this.f30722f3.f26552d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.Z2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((wx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f30719c3;
            if (i10 < arrayList2.size()) {
                ((wx) arrayList2.get(i10)).f();
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
        mz mzVar = this.f30722f3;
        if (!mzVar.f26556f) {
            boolean r10 = org.telegram.ui.nt.q().r(motionEvent, this, mzVar.f26562g2, this.f30399p2);
            if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        mz mzVar = this.f30722f3;
        if (mzVar.f26550d0 && mzVar.f26547c0) {
            this.X2 = true;
            mzVar.Q.h1(0, 0);
            mzVar.f26547c0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        mzVar.l(true);
        y1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.X2 = true;
        int size = View.MeasureSpec.getSize(i10);
        mz mzVar = this.f30722f3;
        mx mxVar = mzVar.Q;
        int i12 = mxVar.J;
        if (AndroidUtilities.isTablet()) {
            f7 = 60.0f;
        } else {
            f7 = 45.0f;
        }
        mxVar.y1(Math.max(1, size / AndroidUtilities.dp(f7)));
        this.X2 = false;
        super.onMeasure(i10, i11);
        if (i12 != mxVar.J) {
            mzVar.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        mz mzVar = this.f30722f3;
        int[] iArr = mzVar.D1;
        zu zuVar = mzVar.B1;
        if (mzVar.R1 != null && zuVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f7 = mzVar.U1;
                    if (f7 != -10000.0f) {
                        if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(mzVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            mzVar.U1 = -10000.0f;
                            mzVar.V1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    zuVar.f30968c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = zuVar.d;
                    yu yuVar = zuVar.f30968c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + zuVar.e)));
                        if (yuVar.f30708n[0] != max) {
                            AndroidUtilities.vibrateCursor(yuVar);
                            int[] iArr2 = yuVar.f30708n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                yuVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (zuVar != null && zuVar.isShowing() && !zuVar.d) {
                    zuVar.dismiss();
                    int i10 = zuVar.f30968c.f30708n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) mzVar.R1.getTag();
                    if (!mzVar.R1.f29789c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = mz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        mzVar.R1.a(Emoji.getEmojiBigDrawable(str2), mzVar.R1.f29789c);
                        mz.c(mzVar, mzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            mz.c(mzVar, mzVar.R1, mz.g(replace, str));
                        } else {
                            mz.c(mzVar, mzVar.R1, replace);
                        }
                    }
                }
                if (zuVar == null || !zuVar.d) {
                    mzVar.R1 = null;
                }
                mzVar.U1 = -10000.0f;
                mzVar.V1 = -10000.0f;
            }
            if (zuVar == null || !zuVar.d || zuVar.isShowing()) {
                return true;
            }
        }
        mzVar.S1 = motionEvent.getX();
        mzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }

    public final long w1() {
        mz mzVar = this.f30722f3;
        return Math.max(400L, Math.min(45, mzVar.f26602t2 - mzVar.f26599s2) * 35) + Math.max(600L, Math.min(55, mzVar.f26602t2 - mzVar.f26599s2) * 40) + 150;
    }

    public final void x1(View view) {
        if (this.f30721e3 != null) {
            int i10 = 0;
            while (i10 < this.f30721e3.size()) {
                xx xxVar = (xx) this.f30721e3.valueAt(i10);
                if (xxVar.d == view) {
                    this.f30721e3.removeAt(i10);
                    i10--;
                    View view2 = xxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        xxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = xxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void y1() {
        mz mzVar = this.f30722f3;
        int i10 = mzVar.f26546c;
        yx yxVar = mzVar.P;
        yx yxVar2 = mzVar.P;
        z5[] z5VarArr = new z5[yxVar.getChildCount()];
        for (int i11 = 0; i11 < yxVar2.getChildCount(); i11++) {
            View childAt = yxVar2.getChildAt(i11);
            if (childAt instanceof vy) {
                z5VarArr[i11] = ((vy) childAt).getSpan();
            }
        }
        mzVar.f26552d2 = z5.update(i10, this, z5VarArr, mzVar.f26552d2);
    }
}

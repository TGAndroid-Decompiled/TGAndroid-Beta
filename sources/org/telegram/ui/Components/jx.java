package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.RippleDrawable;
import android.os.SystemClock;
import android.util.LongSparseArray;
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

public abstract class jx extends zk0 {
    public boolean T2;
    public final SparseArray U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public int Z2;
    public SparseArray a3;

    public final yy f29826b3;

    public jx(yy yyVar, Context context) {
        super(context, null);
        this.f29826b3 = yyVar;
        this.U2 = new SparseArray();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = -1;
        new SparseIntArray();
        er erVar = er.f28122f;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        SparseArray sparseArray;
        ArrayList arrayList;
        boolean z10;
        ArrayList arrayList2;
        yy yyVar = this.f29826b3;
        ww wwVar = yyVar.L;
        super.dispatchDraw(canvas);
        if (this.Z2 != getChildCount()) {
            x1();
            this.Z2 = getChildCount();
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            sparseArray = this.U2;
            int size = sparseArray.size();
            arrayList = this.X2;
            if (i11 >= size) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) sparseArray.valueAt(i11);
            arrayList3.clear();
            arrayList.add(arrayList3);
            i11++;
        }
        sparseArray.clear();
        if (yyVar.f35033r2 <= 0) {
            z10 = false;
        } else if (SystemClock.elapsedRealtime() - yyVar.f35033r2 >= Math.max(400L, ((long) Math.min(45, yyVar.f35029q2 - yyVar.f35026p2)) * 35) + Math.max(600L, ((long) Math.min(55, yyVar.f35029q2 - yyVar.f35026p2)) * 40) + 150 || yyVar.f35023o2 == null || yyVar.f35026p2 < 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (yyVar.Z1 != null && wwVar != null) {
            for (int i12 = 0; i12 < wwVar.getChildCount(); i12++) {
                View childAt = wwVar.getChildAt(i12);
                if (childAt instanceof gy) {
                    int top = childAt.getTop() + ((int) childAt.getTranslationY());
                    ArrayList arrayList4 = (ArrayList) sparseArray.get(top);
                    if (arrayList4 == null) {
                        arrayList4 = !arrayList.isEmpty() ? (ArrayList) com.google.android.recaptcha.internal.a.k(1, arrayList) : new ArrayList();
                        sparseArray.put(top, arrayList4);
                    }
                    arrayList4.add((gy) childAt);
                }
                if (z10 && childAt != null && RecyclerView.R(childAt) == yyVar.f35026p2 - 1) {
                    float interpolation = er.f28123g.getInterpolation(h7.n.a((SystemClock.elapsedRealtime() - yyVar.f35033r2) / 140.0f, 0.0f, 1.0f));
                    if (interpolation < 1.0f) {
                        float f10 = 1.0f - interpolation;
                        canvas.saveLayerAlpha(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom(), (int) (255.0f * f10), 31);
                        canvas.translate(childAt.getLeft(), childAt.getTop());
                        float f11 = (f10 * 0.5f) + 0.5f;
                        canvas.scale(f11, f11, childAt.getWidth() / 2.0f, childAt.getHeight() / 2.0f);
                        yyVar.f35023o2.draw(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        ArrayList arrayList5 = this.W2;
        arrayList5.clear();
        ArrayList arrayList6 = this.V2;
        arrayList5.addAll(arrayList6);
        arrayList6.clear();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i13 = 0;
        while (true) {
            int size2 = sparseArray.size();
            hx hxVar = null;
            arrayList2 = this.Y2;
            if (i13 >= size2) {
                break;
            }
            ArrayList arrayList7 = (ArrayList) sparseArray.valueAt(i13);
            gy gyVar = (gy) arrayList7.get(i10);
            int i14 = gyVar.f28866a;
            for (int i15 = 0; i15 < arrayList5.size(); i15++) {
                if (((hx) arrayList5.get(i15)).I == i14) {
                    hxVar = (hx) arrayList5.get(i15);
                    arrayList5.remove(i15);
                    break;
                }
            }
            if (hxVar == null) {
                hxVar = !arrayList2.isEmpty() ? (hx) com.google.android.recaptcha.internal.a.k(1, arrayList2) : new hx(this);
                hxVar.I = i14;
                hxVar.e();
            }
            arrayList6.add(hxVar);
            hxVar.K = arrayList7;
            canvas.save();
            canvas.translate(gyVar.getLeft(), gyVar.getY() + gyVar.getPaddingTop());
            hxVar.J = gyVar.getLeft();
            int measuredWidth = getMeasuredWidth() - (gyVar.getLeft() * 2);
            int measuredHeight = gyVar.getMeasuredHeight() - gyVar.getPaddingBottom();
            if (measuredWidth > 0 && measuredHeight > 0) {
                hxVar.a(canvas, jCurrentTimeMillis, measuredWidth, measuredHeight, 1.0f);
            }
            canvas.restore();
            invalidate();
            i13++;
            i10 = 0;
        }
        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
            if (arrayList2.size() < 3) {
                arrayList2.add((hx) arrayList5.get(i16));
                ((hx) arrayList5.get(i16)).K = null;
                ((hx) arrayList5.get(i16)).k();
            } else {
                ((hx) arrayList5.get(i16)).f();
            }
        }
        arrayList5.clear();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = motionEvent.getActionMasked() == 5 || motionEvent.getActionMasked() == 0;
        boolean z11 = motionEvent.getActionMasked() == 6 || motionEvent.getActionMasked() == 1;
        boolean z12 = motionEvent.getActionMasked() == 3;
        if (z10 || z11 || z12) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.a3 == null) {
                this.a3 = new SparseArray();
            }
            float x8 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View viewE = E(x8, y10);
            if (!z10) {
                ix ixVar = (ix) this.a3.get(pointerId);
                this.a3.remove(pointerId);
                if (viewE != null && ixVar != null) {
                    if (Math.sqrt(Math.pow(y10 - ixVar.f29515b, 2.0d) + Math.pow(x8 - ixVar.f29514a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        yy yyVar = this.f29826b3;
                        if (!yyVar.f35053x1.isShowing() || SystemClock.elapsedRealtime() - ixVar.f29516c < ViewConfiguration.getLongPressTimeout()) {
                            View view = ixVar.d;
                            int iR = RecyclerView.R(view);
                            try {
                                if (view instanceof gy) {
                                    yy.c(yyVar, (gy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof mx) {
                                    yyVar.N.E(iR, (mx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (ixVar != null && (ixVar.d.getBackground() instanceof RippleDrawable)) {
                    ixVar.d.getBackground().setState(new int[0]);
                }
                if (ixVar != null) {
                    ixVar.d.setPressed(false);
                }
            } else if (viewE != null) {
                ix ixVar2 = new ix();
                ixVar2.f29514a = x8;
                ixVar2.f29515b = y10;
                ixVar2.f29516c = SystemClock.elapsedRealtime();
                ixVar2.d = viewE;
                if (viewE.getBackground() instanceof RippleDrawable) {
                    viewE.getBackground().setState(new int[]{16842919, 16842910});
                }
                ixVar2.d.setPressed(true);
                this.a3.put(pointerId, ixVar2);
                B0();
            }
        }
        return super.dispatchTouchEvent(motionEvent) || (!z12 && this.a3.size() > 0);
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean zCanScrollVertically = canScrollVertically(-1);
            yy yyVar = this.f29826b3;
            if (!zCanScrollVertically || !canScrollVertically(1)) {
                int i11 = yy.K2;
                yyVar.O(true);
            }
            if (canScrollVertically(1)) {
                return;
            }
            yy.e(yyVar, 1, AndroidUtilities.dp(36.0f));
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        x1();
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        t5.release(this, (LongSparseArray<k5>) this.f29826b3.Z1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.V2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((hx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.Y2;
            if (i10 >= arrayList2.size()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            } else {
                ((hx) arrayList2.get(i10)).f();
                i10++;
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent) || org.telegram.ui.kt.q().r(motionEvent, this, this.f29826b3.f34986c2, this.f35277l2);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        yy yyVar = this.f29826b3;
        if (yyVar.W && yyVar.V) {
            this.T2 = true;
            yyVar.M.h1(0, 0);
            yyVar.V = false;
            this.T2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        yyVar.l(true);
        x1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.T2 = true;
        int size = View.MeasureSpec.getSize(i10);
        yy yyVar = this.f29826b3;
        xw xwVar = yyVar.M;
        int i12 = xwVar.J;
        xwVar.y1(Math.max(1, size / AndroidUtilities.dp(AndroidUtilities.isTablet() ? 60.0f : 45.0f)));
        this.T2 = false;
        super.onMeasure(i10, i11);
        if (i12 != xwVar.J) {
            yyVar.N.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int iDp;
        boolean z10;
        gu guVar;
        int iMax;
        int[] iArr;
        yy yyVar = this.f29826b3;
        int[] iArr2 = yyVar.f35060z1;
        hu huVar = yyVar.f35053x1;
        if (yyVar.N1 != null && huVar != null) {
            if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (huVar != null && huVar.isShowing() && !huVar.d) {
                    huVar.dismiss();
                    int i10 = huVar.f29103c.f28819n[0];
                    String str = (i10 < 1 || i10 > 5) ? null : CompoundEmoji.skinTones.get(i10 - 1);
                    String strG = (String) yyVar.N1.getTag();
                    if (yyVar.N1.f28868c) {
                        String strReplace = strG.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            yy.c(yyVar, yyVar.N1, yy.g(strReplace, str));
                        } else {
                            yy.c(yyVar, yyVar.N1, strReplace);
                        }
                    } else {
                        if (str != null) {
                            Emoji.emojiColor.put(strG, str);
                            strG = yy.g(strG, str);
                        } else {
                            Emoji.emojiColor.remove(strG);
                        }
                        yyVar.N1.a(Emoji.getEmojiBigDrawable(strG), yyVar.N1.f28868c);
                        yy.c(yyVar, yyVar.N1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    }
                }
                if (huVar == null || !huVar.d) {
                    yyVar.N1 = null;
                }
                yyVar.Q1 = -10000.0f;
                yyVar.R1 = -10000.0f;
            } else if (motionEvent.getAction() == 2) {
                float f10 = yyVar.Q1;
                if (f10 == -10000.0f) {
                    getLocationOnScreen(iArr2);
                    float x8 = motionEvent.getX() + iArr2[0];
                    huVar.f29103c.getLocationOnScreen(iArr2);
                    iDp = (int) (x8 - (AndroidUtilities.dp(3.0f) + iArr2[0]));
                    z10 = huVar.d;
                    guVar = huVar.f29103c;
                    if (!z10) {
                        iMax = Math.max(0, Math.min(5, iDp / (AndroidUtilities.dp(4.0f) + huVar.f29104e)));
                        if (guVar.f28819n[0] != iMax) {
                            AndroidUtilities.vibrateCursor(guVar);
                            iArr = guVar.f28819n;
                            if (iArr[0] != iMax) {
                                iArr[0] = iMax;
                                guVar.invalidate();
                            }
                        }
                    }
                } else if (Math.abs(f10 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(yyVar.R1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                    yyVar.Q1 = -10000.0f;
                    yyVar.R1 = -10000.0f;
                    getLocationOnScreen(iArr2);
                    float x10 = motionEvent.getX() + iArr2[0];
                    huVar.f29103c.getLocationOnScreen(iArr2);
                    iDp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr2[0]));
                    z10 = huVar.d;
                    guVar = huVar.f29103c;
                    if (!z10) {
                        iMax = Math.max(0, Math.min(5, iDp / (AndroidUtilities.dp(4.0f) + huVar.f29104e)));
                        if (guVar.f28819n[0] != iMax) {
                            AndroidUtilities.vibrateCursor(guVar);
                            iArr = guVar.f28819n;
                            if (iArr[0] != iMax) {
                                iArr[0] = iMax;
                                guVar.invalidate();
                            }
                        }
                    }
                }
            }
            if (huVar == null || !huVar.d || huVar.isShowing()) {
                return true;
            }
        }
        yyVar.O1 = motionEvent.getX();
        yyVar.P1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.T2) {
            return;
        }
        super.requestLayout();
    }

    public final void w1(View view) {
        if (this.a3 != null) {
            int i10 = 0;
            while (i10 < this.a3.size()) {
                ix ixVar = (ix) this.a3.valueAt(i10);
                if (ixVar.d == view) {
                    this.a3.removeAt(i10);
                    i10--;
                    View view2 = ixVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        ixVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = ixVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void x1() {
        yy yyVar = this.f29826b3;
        int i10 = yyVar.f34983c;
        ww wwVar = yyVar.L;
        t5[] t5VarArr = new t5[wwVar.getChildCount()];
        for (int i11 = 0; i11 < wwVar.getChildCount(); i11++) {
            View childAt = wwVar.getChildAt(i11);
            if (childAt instanceof gy) {
                t5VarArr[i11] = ((gy) childAt).getSpan();
            }
        }
        yyVar.Z1 = t5.update(i10, this, t5VarArr, (LongSparseArray<k5>) yyVar.Z1);
    }
}

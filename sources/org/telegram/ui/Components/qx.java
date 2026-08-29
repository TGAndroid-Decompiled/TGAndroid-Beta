package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
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
public abstract class qx extends jl0 {
    public boolean T2;
    public final SparseArray U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public int Z2;
    public SparseArray f32130a3;
    public final fz f32131b3;

    public qx(fz fzVar, Context context) {
        super(context, null);
        this.f32131b3 = fzVar;
        this.U2 = new SparseArray();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = -1;
        new SparseIntArray();
        jr jrVar = jr.f29800f;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qx.dispatchDraw(android.graphics.Canvas):void");
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
            if (this.f32130a3 == null) {
                this.f32130a3 = new SparseArray();
            }
            float x4 = motionEvent.getX(actionIndex);
            float y8 = motionEvent.getY(actionIndex);
            View E = E(x4, y8);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f31798a = x4;
                    obj.f31799b = y8;
                    obj.f31800c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f32130a3.put(pointerId, obj);
                    B0();
                }
            } else {
                px pxVar = (px) this.f32130a3.get(pointerId);
                this.f32130a3.remove(pointerId);
                if (E != null && pxVar != null) {
                    if (Math.sqrt(Math.pow(y8 - pxVar.f31799b, 2.0d) + Math.pow(x4 - pxVar.f31798a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        fz fzVar = this.f32131b3;
                        if (!fzVar.f28651x1.isShowing() || SystemClock.elapsedRealtime() - pxVar.f31800c < ViewConfiguration.getLongPressTimeout()) {
                            View view = pxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof ny) {
                                    fz.b(fzVar, (ny) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof tx) {
                                    fzVar.N.E(R, (tx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (pxVar != null && (pxVar.d.getBackground() instanceof RippleDrawable)) {
                    pxVar.d.getBackground().setState(new int[0]);
                }
                if (pxVar != null) {
                    pxVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f32130a3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            fz fzVar = this.f32131b3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i11 = fz.K2;
                fzVar.O(true);
            }
            if (!canScrollVertically(1)) {
                fz.e(fzVar, 1, AndroidUtilities.dp(36.0f));
            }
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
        y5.release(this, this.f32131b3.Z1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.V2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((ox) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.Y2;
            if (i10 < arrayList2.size()) {
                ((ox) arrayList2.get(i10)).f();
                i10++;
            } else {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean r6 = org.telegram.ui.ht.q().r(motionEvent, this, this.f32131b3.f28584c2, this.f29709l2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r6) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        fz fzVar = this.f32131b3;
        if (fzVar.W && fzVar.V) {
            this.T2 = true;
            fzVar.M.h1(0, 0);
            fzVar.V = false;
            this.T2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        fzVar.l(true);
        x1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        this.T2 = true;
        int size = View.MeasureSpec.getSize(i10);
        fz fzVar = this.f32131b3;
        ex exVar = fzVar.M;
        int i12 = exVar.J;
        if (AndroidUtilities.isTablet()) {
            f9 = 60.0f;
        } else {
            f9 = 45.0f;
        }
        exVar.y1(Math.max(1, size / AndroidUtilities.dp(f9)));
        this.T2 = false;
        super.onMeasure(i10, i11);
        if (i12 != exVar.J) {
            fzVar.N.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        fz fzVar = this.f32131b3;
        int[] iArr = fzVar.f28658z1;
        ou ouVar = fzVar.f28651x1;
        if (fzVar.N1 != null && ouVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f9 = fzVar.Q1;
                    if (f9 != -10000.0f) {
                        if (Math.abs(f9 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(fzVar.R1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            fzVar.Q1 = -10000.0f;
                            fzVar.R1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x4 = motionEvent.getX() + iArr[0];
                    ouVar.f31481c.getLocationOnScreen(iArr);
                    int dp = (int) (x4 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = ouVar.d;
                    nu nuVar = ouVar.f31481c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + ouVar.f31482e)));
                        if (nuVar.f31143n[0] != max) {
                            AndroidUtilities.vibrateCursor(nuVar);
                            int[] iArr2 = nuVar.f31143n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                nuVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (ouVar != null && ouVar.isShowing() && !ouVar.d) {
                    ouVar.dismiss();
                    int i10 = ouVar.f31481c.f31143n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) fzVar.N1.getTag();
                    if (!fzVar.N1.f31195c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = fz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        fzVar.N1.a(Emoji.getEmojiBigDrawable(str2), fzVar.N1.f31195c);
                        fz.b(fzVar, fzVar.N1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            fz.b(fzVar, fzVar.N1, fz.g(replace, str));
                        } else {
                            fz.b(fzVar, fzVar.N1, replace);
                        }
                    }
                }
                if (ouVar == null || !ouVar.d) {
                    fzVar.N1 = null;
                }
                fzVar.Q1 = -10000.0f;
                fzVar.R1 = -10000.0f;
            }
            if (ouVar == null || !ouVar.d || ouVar.isShowing()) {
                return true;
            }
        }
        fzVar.O1 = motionEvent.getX();
        fzVar.P1 = motionEvent.getY();
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
        if (this.f32130a3 != null) {
            int i10 = 0;
            while (i10 < this.f32130a3.size()) {
                px pxVar = (px) this.f32130a3.valueAt(i10);
                if (pxVar.d == view) {
                    this.f32130a3.removeAt(i10);
                    i10--;
                    View view2 = pxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        pxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = pxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void x1() {
        fz fzVar = this.f32131b3;
        int i10 = fzVar.f28581c;
        dx dxVar = fzVar.L;
        y5[] y5VarArr = new y5[dxVar.getChildCount()];
        for (int i11 = 0; i11 < dxVar.getChildCount(); i11++) {
            View childAt = dxVar.getChildAt(i11);
            if (childAt instanceof ny) {
                y5VarArr[i11] = ((ny) childAt).getSpan();
            }
        }
        fzVar.Z1 = y5.update(i10, this, y5VarArr, fzVar.Z1);
    }
}

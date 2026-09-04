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
public abstract class wx extends ll0 {
    public boolean X2;
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList f32358a3;
    public final ArrayList f32359b3;
    public final ArrayList f32360c3;
    public int f32361d3;
    public SparseArray f32362e3;
    public final kz f32363f3;

    public wx(kz kzVar, Context context) {
        super(context, null);
        this.f32363f3 = kzVar;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.f32358a3 = new ArrayList();
        this.f32359b3 = new ArrayList();
        this.f32360c3 = new ArrayList();
        this.f32361d3 = -1;
        new SparseIntArray();
        pr prVar = pr.f29466f;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wx.dispatchDraw(android.graphics.Canvas):void");
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
            if (this.f32362e3 == null) {
                this.f32362e3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f32016a = x10;
                    obj.f32017b = y3;
                    obj.f32018c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f32362e3.put(pointerId, obj);
                    B0();
                }
            } else {
                vx vxVar = (vx) this.f32362e3.get(pointerId);
                this.f32362e3.remove(pointerId);
                if (E != null && vxVar != null) {
                    if (Math.sqrt(Math.pow(y3 - vxVar.f32017b, 2.0d) + Math.pow(x10 - vxVar.f32016a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        kz kzVar = this.f32363f3;
                        if (!kzVar.B1.isShowing() || SystemClock.elapsedRealtime() - vxVar.f32018c < ViewConfiguration.getLongPressTimeout()) {
                            View view = vxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof ty) {
                                    kz.d(kzVar, (ty) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof zx) {
                                    kzVar.R.E(R, (zx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (vxVar != null && (vxVar.d.getBackground() instanceof RippleDrawable)) {
                    vxVar.d.getBackground().setState(new int[0]);
                }
                if (vxVar != null) {
                    vxVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f32362e3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            kz kzVar = this.f32363f3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i11 = kz.O2;
                kzVar.O(true);
            }
            if (!canScrollVertically(1)) {
                kz.e(kzVar, 1, AndroidUtilities.dp(36.0f));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        w1();
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        z5.release(this, this.f32363f3.f27936d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.Z2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((ux) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f32360c3;
            if (i10 < arrayList2.size()) {
                ((ux) arrayList2.get(i10)).f();
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
        boolean r10 = org.telegram.ui.st.q().r(motionEvent, this, this.f32363f3.f27947g2, this.f28224p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        kz kzVar = this.f32363f3;
        if (kzVar.f27934d0 && kzVar.f27931c0) {
            this.X2 = true;
            kzVar.Q.h1(0, 0);
            kzVar.f27931c0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        kzVar.l(true);
        w1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.X2 = true;
        int size = View.MeasureSpec.getSize(i10);
        kz kzVar = this.f32363f3;
        lx lxVar = kzVar.Q;
        int i12 = lxVar.J;
        if (AndroidUtilities.isTablet()) {
            f7 = 60.0f;
        } else {
            f7 = 45.0f;
        }
        lxVar.y1(Math.max(1, size / AndroidUtilities.dp(f7)));
        this.X2 = false;
        super.onMeasure(i10, i11);
        if (i12 != lxVar.J) {
            kzVar.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        kz kzVar = this.f32363f3;
        int[] iArr = kzVar.D1;
        vu vuVar = kzVar.B1;
        if (kzVar.R1 != null && vuVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f7 = kzVar.U1;
                    if (f7 != -10000.0f) {
                        if (Math.abs(f7 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(kzVar.V1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            kzVar.U1 = -10000.0f;
                            kzVar.V1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    vuVar.f31985c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = vuVar.d;
                    uu uuVar = vuVar.f31985c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + vuVar.f31986e)));
                        if (uuVar.f30976n[0] != max) {
                            AndroidUtilities.vibrateCursor(uuVar);
                            int[] iArr2 = uuVar.f30976n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                uuVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (vuVar != null && vuVar.isShowing() && !vuVar.d) {
                    vuVar.dismiss();
                    int i10 = vuVar.f31985c.f30976n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) kzVar.R1.getTag();
                    if (!kzVar.R1.f30738c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = kz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        kzVar.R1.a(Emoji.getEmojiBigDrawable(str2), kzVar.R1.f30738c);
                        kz.d(kzVar, kzVar.R1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            kz.d(kzVar, kzVar.R1, kz.g(replace, str));
                        } else {
                            kz.d(kzVar, kzVar.R1, replace);
                        }
                    }
                }
                if (vuVar == null || !vuVar.d) {
                    kzVar.R1 = null;
                }
                kzVar.U1 = -10000.0f;
                kzVar.V1 = -10000.0f;
            }
            if (vuVar == null || !vuVar.d || vuVar.isShowing()) {
                return true;
            }
        }
        kzVar.S1 = motionEvent.getX();
        kzVar.T1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.X2) {
            return;
        }
        super.requestLayout();
    }

    public final void v1(View view) {
        if (this.f32362e3 != null) {
            int i10 = 0;
            while (i10 < this.f32362e3.size()) {
                vx vxVar = (vx) this.f32362e3.valueAt(i10);
                if (vxVar.d == view) {
                    this.f32362e3.removeAt(i10);
                    i10--;
                    View view2 = vxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        vxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = vxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void w1() {
        kz kzVar = this.f32363f3;
        int i10 = kzVar.f27930c;
        kx kxVar = kzVar.P;
        z5[] z5VarArr = new z5[kxVar.getChildCount()];
        for (int i11 = 0; i11 < kxVar.getChildCount(); i11++) {
            View childAt = kxVar.getChildAt(i11);
            if (childAt instanceof ty) {
                z5VarArr[i11] = ((ty) childAt).getSpan();
            }
        }
        kzVar.f27936d2 = z5.update(i10, this, z5VarArr, kzVar.f27936d2);
    }
}

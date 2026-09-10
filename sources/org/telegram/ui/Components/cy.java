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
public abstract class cy extends vl0 {
    public boolean X2;
    public final SparseArray Y2;
    public final ArrayList Z2;
    public final ArrayList f22247a3;
    public final ArrayList f22248b3;
    public final ArrayList f22249c3;
    public int f22250d3;
    public SparseArray f22251e3;
    public final rz f22252f3;

    public cy(rz rzVar, Context context) {
        super(context, null);
        this.f22252f3 = rzVar;
        this.Y2 = new SparseArray();
        this.Z2 = new ArrayList();
        this.f22247a3 = new ArrayList();
        this.f22248b3 = new ArrayList();
        this.f22249c3 = new ArrayList();
        this.f22250d3 = -1;
        new SparseIntArray();
        wr wrVar = wr.f28819f;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cy.dispatchDraw(android.graphics.Canvas):void");
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
            if (this.f22251e3 == null) {
                this.f22251e3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y3 = motionEvent.getY(actionIndex);
            View E = E(x10, y3);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f21654a = x10;
                    obj.f21655b = y3;
                    obj.f21656c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f22251e3.put(pointerId, obj);
                    B0();
                }
            } else {
                ay ayVar = (ay) this.f22251e3.get(pointerId);
                this.f22251e3.remove(pointerId);
                if (E != null && ayVar != null) {
                    if (Math.sqrt(Math.pow(y3 - ayVar.f21655b, 2.0d) + Math.pow(x10 - ayVar.f21654a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        rz rzVar = this.f22252f3;
                        if (!rzVar.B1.isShowing() || SystemClock.elapsedRealtime() - ayVar.f21656c < ViewConfiguration.getLongPressTimeout()) {
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
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.f22251e3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            rz rzVar = this.f22252f3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i11 = rz.O2;
                rzVar.O(true);
            }
            if (!canScrollVertically(1)) {
                rz.e(rzVar, 1, AndroidUtilities.dp(36.0f));
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
        y5.release(this, this.f22252f3.f26809d2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.Z2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((zx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.f22249c3;
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
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean r10 = org.telegram.ui.tt.q().r(motionEvent, this, this.f22252f3.f26819g2, this.f27987p2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        rz rzVar = this.f22252f3;
        if (rzVar.f26807d0 && rzVar.f26804c0) {
            this.X2 = true;
            rzVar.Q.h1(0, 0);
            rzVar.f26804c0 = false;
            this.X2 = false;
        }
        super.onLayout(z10, i10, i11, i12, i13);
        rzVar.l(true);
        w1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        this.X2 = true;
        int size = View.MeasureSpec.getSize(i10);
        rz rzVar = this.f22252f3;
        qx qxVar = rzVar.Q;
        int i12 = qxVar.J;
        if (AndroidUtilities.isTablet()) {
            f7 = 60.0f;
        } else {
            f7 = 45.0f;
        }
        qxVar.y1(Math.max(1, size / AndroidUtilities.dp(f7)));
        this.X2 = false;
        super.onMeasure(i10, i11);
        if (i12 != qxVar.J) {
            rzVar.R.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        rz rzVar = this.f22252f3;
        int[] iArr = rzVar.D1;
        bv bvVar = rzVar.B1;
        if (rzVar.R1 != null && bvVar != null) {
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
                    bvVar.f21912c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = bvVar.d;
                    av avVar = bvVar.f21912c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + bvVar.e)));
                        if (avVar.f21604n[0] != max) {
                            AndroidUtilities.vibrateCursor(avVar);
                            int[] iArr2 = avVar.f21604n;
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
                    int i10 = bvVar.f21912c.f21604n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) rzVar.R1.getTag();
                    if (!rzVar.R1.f21660c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = rz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        rzVar.R1.a(Emoji.getEmojiBigDrawable(str2), rzVar.R1.f21660c);
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
                if (bvVar == null || !bvVar.d) {
                    rzVar.R1 = null;
                }
                rzVar.U1 = -10000.0f;
                rzVar.V1 = -10000.0f;
            }
            if (bvVar == null || !bvVar.d || bvVar.isShowing()) {
                return true;
            }
        }
        rzVar.S1 = motionEvent.getX();
        rzVar.T1 = motionEvent.getY();
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
        if (this.f22251e3 != null) {
            int i10 = 0;
            while (i10 < this.f22251e3.size()) {
                ay ayVar = (ay) this.f22251e3.valueAt(i10);
                if (ayVar.d == view) {
                    this.f22251e3.removeAt(i10);
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

    public final void w1() {
        rz rzVar = this.f22252f3;
        int i10 = rzVar.f26803c;
        px pxVar = rzVar.P;
        y5[] y5VarArr = new y5[pxVar.getChildCount()];
        for (int i11 = 0; i11 < pxVar.getChildCount(); i11++) {
            View childAt = pxVar.getChildAt(i11);
            if (childAt instanceof az) {
                y5VarArr[i11] = ((az) childAt).getSpan();
            }
        }
        rzVar.f26809d2 = y5.update(i10, this, y5VarArr, rzVar.f26809d2);
    }
}

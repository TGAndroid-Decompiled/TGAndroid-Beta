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
public abstract class ux extends sl0 {
    public boolean U2;
    public final SparseArray V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public int f29300a3;
    public SparseArray f29301b3;
    public final kz c3;

    public ux(kz kzVar, Context context) {
        super(context, null);
        this.c3 = kzVar;
        this.V2 = new SparseArray();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f29300a3 = -1;
        new SparseIntArray();
        nr nrVar = nr.f27346f;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ux.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        boolean z11;
        if (motionEvent.getActionMasked() != 5 && motionEvent.getActionMasked() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (motionEvent.getActionMasked() != 6 && motionEvent.getActionMasked() != 1) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (motionEvent.getActionMasked() == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4 || z10 || z11) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            if (this.f29301b3 == null) {
                this.f29301b3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (z4) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f29061a = x10;
                    obj.f29062b = y10;
                    obj.f29063c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f29301b3.put(pointerId, obj);
                    B0();
                }
            } else {
                tx txVar = (tx) this.f29301b3.get(pointerId);
                this.f29301b3.remove(pointerId);
                if (E != null && txVar != null) {
                    if (Math.sqrt(Math.pow(y10 - txVar.f29062b, 2.0d) + Math.pow(x10 - txVar.f29061a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z11) {
                        kz kzVar = this.c3;
                        if (!kzVar.f26489y1.isShowing() || SystemClock.elapsedRealtime() - txVar.f29063c < ViewConfiguration.getLongPressTimeout()) {
                            View view = txVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof sy) {
                                    kz.d(kzVar, (sy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof xx) {
                                    kzVar.O.E(R, (xx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (txVar != null && (txVar.d.getBackground() instanceof RippleDrawable)) {
                    txVar.d.getBackground().setState(new int[0]);
                }
                if (txVar != null) {
                    txVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z11 || this.f29301b3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            kz kzVar = this.c3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i11 = kz.L2;
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
        x1();
    }

    @Override
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        u5.release(this, this.c3.a2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.W2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((sx) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.Z2;
            if (i10 < arrayList2.size()) {
                ((sx) arrayList2.get(i10)).f();
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
        boolean r10 = org.telegram.ui.pt.q().r(motionEvent, this, this.c3.f26422d2, this.f28750m2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        kz kzVar = this.c3;
        if (kzVar.f26410a0 && kzVar.W) {
            this.U2 = true;
            kzVar.N.h1(0, 0);
            kzVar.W = false;
            this.U2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        kzVar.l(true);
        x1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        this.U2 = true;
        int size = View.MeasureSpec.getSize(i10);
        kz kzVar = this.c3;
        jx jxVar = kzVar.N;
        int i12 = jxVar.J;
        if (AndroidUtilities.isTablet()) {
            f10 = 60.0f;
        } else {
            f10 = 45.0f;
        }
        jxVar.y1(Math.max(1, size / AndroidUtilities.dp(f10)));
        this.U2 = false;
        super.onMeasure(i10, i11);
        if (i12 != jxVar.J) {
            kzVar.O.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        kz kzVar = this.c3;
        int[] iArr = kzVar.A1;
        ru ruVar = kzVar.f26489y1;
        if (kzVar.O1 != null && ruVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f10 = kzVar.R1;
                    if (f10 != -10000.0f) {
                        if (Math.abs(f10 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(kzVar.S1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            kzVar.R1 = -10000.0f;
                            kzVar.S1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    ruVar.f28540c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z4 = ruVar.d;
                    qu quVar = ruVar.f28540c;
                    if (!z4) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + ruVar.e)));
                        if (quVar.f28251n[0] != max) {
                            AndroidUtilities.vibrateCursor(quVar);
                            int[] iArr2 = quVar.f28251n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                quVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (ruVar != null && ruVar.isShowing() && !ruVar.d) {
                    ruVar.dismiss();
                    int i10 = ruVar.f28540c.f28251n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) kzVar.O1.getTag();
                    if (!kzVar.O1.f28830c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = kz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        kzVar.O1.a(Emoji.getEmojiBigDrawable(str2), kzVar.O1.f28830c);
                        kz.d(kzVar, kzVar.O1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            kz.d(kzVar, kzVar.O1, kz.g(replace, str));
                        } else {
                            kz.d(kzVar, kzVar.O1, replace);
                        }
                    }
                }
                if (ruVar == null || !ruVar.d) {
                    kzVar.O1 = null;
                }
                kzVar.R1 = -10000.0f;
                kzVar.S1 = -10000.0f;
            }
            if (ruVar == null || !ruVar.d || ruVar.isShowing()) {
                return true;
            }
        }
        kzVar.P1 = motionEvent.getX();
        kzVar.Q1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }

    public final void w1(View view) {
        if (this.f29301b3 != null) {
            int i10 = 0;
            while (i10 < this.f29301b3.size()) {
                tx txVar = (tx) this.f29301b3.valueAt(i10);
                if (txVar.d == view) {
                    this.f29301b3.removeAt(i10);
                    i10--;
                    View view2 = txVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        txVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = txVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i10++;
            }
        }
    }

    public final void x1() {
        kz kzVar = this.c3;
        int i10 = kzVar.f26416c;
        ix ixVar = kzVar.M;
        u5[] u5VarArr = new u5[ixVar.getChildCount()];
        for (int i11 = 0; i11 < ixVar.getChildCount(); i11++) {
            View childAt = ixVar.getChildAt(i11);
            if (childAt instanceof sy) {
                u5VarArr[i11] = ((sy) childAt).getSpan();
            }
        }
        kzVar.a2 = u5.update(i10, this, u5VarArr, kzVar.a2);
    }
}

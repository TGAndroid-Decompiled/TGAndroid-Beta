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
public abstract class wx extends sl0 {
    public boolean U2;
    public final SparseArray V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public final ArrayList Z2;
    public int f32841a3;
    public SparseArray f32842b3;
    public final mz c3;

    public wx(mz mzVar, Context context) {
        super(context, null);
        this.c3 = mzVar;
        this.V2 = new SparseArray();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = new ArrayList();
        this.f32841a3 = -1;
        new SparseIntArray();
        pr prVar = pr.f30168f;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wx.dispatchDraw(android.graphics.Canvas):void");
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
            if (this.f32842b3 == null) {
                this.f32842b3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (z4) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f32566a = x10;
                    obj.f32567b = y10;
                    obj.f32568c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.f32842b3.put(pointerId, obj);
                    B0();
                }
            } else {
                vx vxVar = (vx) this.f32842b3.get(pointerId);
                this.f32842b3.remove(pointerId);
                if (E != null && vxVar != null) {
                    if (Math.sqrt(Math.pow(y10 - vxVar.f32567b, 2.0d) + Math.pow(x10 - vxVar.f32566a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z11) {
                        mz mzVar = this.c3;
                        if (!mzVar.f29346y1.isShowing() || SystemClock.elapsedRealtime() - vxVar.f32568c < ViewConfiguration.getLongPressTimeout()) {
                            View view = vxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof uy) {
                                    mz.d(mzVar, (uy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof zx) {
                                    mzVar.O.E(R, (zx) view);
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
        if (!super.dispatchTouchEvent(motionEvent) && (z11 || this.f32842b3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i10) {
        if (i10 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            mz mzVar = this.c3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i11 = mz.L2;
                mzVar.O(true);
            }
            if (!canScrollVertically(1)) {
                mz.e(mzVar, 1, AndroidUtilities.dp(36.0f));
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
        u5.release(this, this.c3.a2);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            arrayList = this.W2;
            if (i11 >= arrayList.size()) {
                break;
            }
            ((ux) arrayList.get(i11)).f();
            i11++;
        }
        while (true) {
            ArrayList arrayList2 = this.Z2;
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
        boolean r10 = org.telegram.ui.qt.q().r(motionEvent, this, this.c3.f29278d2, this.f31106m2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        mz mzVar = this.c3;
        if (mzVar.f29266a0 && mzVar.W) {
            this.U2 = true;
            mzVar.N.h1(0, 0);
            mzVar.W = false;
            this.U2 = false;
        }
        super.onLayout(z4, i10, i11, i12, i13);
        mzVar.l(true);
        w1();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        this.U2 = true;
        int size = View.MeasureSpec.getSize(i10);
        mz mzVar = this.c3;
        lx lxVar = mzVar.N;
        int i12 = lxVar.J;
        if (AndroidUtilities.isTablet()) {
            f10 = 60.0f;
        } else {
            f10 = 45.0f;
        }
        lxVar.y1(Math.max(1, size / AndroidUtilities.dp(f10)));
        this.U2 = false;
        super.onMeasure(i10, i11);
        if (i12 != lxVar.J) {
            mzVar.O.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        mz mzVar = this.c3;
        int[] iArr = mzVar.A1;
        tu tuVar = mzVar.f29346y1;
        if (mzVar.O1 != null && tuVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f10 = mzVar.R1;
                    if (f10 != -10000.0f) {
                        if (Math.abs(f10 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(mzVar.S1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            mzVar.R1 = -10000.0f;
                            mzVar.S1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    tuVar.f31419c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z4 = tuVar.d;
                    su suVar = tuVar.f31419c;
                    if (!z4) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + tuVar.f31420e)));
                        if (suVar.f31182n[0] != max) {
                            AndroidUtilities.vibrateCursor(suVar);
                            int[] iArr2 = suVar.f31182n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                suVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (tuVar != null && tuVar.isShowing() && !tuVar.d) {
                    tuVar.dismiss();
                    int i10 = tuVar.f31419c.f31182n[0];
                    if (i10 >= 1 && i10 <= 5) {
                        str = CompoundEmoji.skinTones.get(i10 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) mzVar.O1.getTag();
                    if (!mzVar.O1.f31707c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = mz.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        mzVar.O1.a(Emoji.getEmojiBigDrawable(str2), mzVar.O1.f31707c);
                        mz.d(mzVar, mzVar.O1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            mz.d(mzVar, mzVar.O1, mz.g(replace, str));
                        } else {
                            mz.d(mzVar, mzVar.O1, replace);
                        }
                    }
                }
                if (tuVar == null || !tuVar.d) {
                    mzVar.O1 = null;
                }
                mzVar.R1 = -10000.0f;
                mzVar.S1 = -10000.0f;
            }
            if (tuVar == null || !tuVar.d || tuVar.isShowing()) {
                return true;
            }
        }
        mzVar.P1 = motionEvent.getX();
        mzVar.Q1 = motionEvent.getY();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final void requestLayout() {
        if (this.U2) {
            return;
        }
        super.requestLayout();
    }

    public final void v1(View view) {
        if (this.f32842b3 != null) {
            int i10 = 0;
            while (i10 < this.f32842b3.size()) {
                vx vxVar = (vx) this.f32842b3.valueAt(i10);
                if (vxVar.d == view) {
                    this.f32842b3.removeAt(i10);
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
        mz mzVar = this.c3;
        int i10 = mzVar.f29272c;
        kx kxVar = mzVar.M;
        u5[] u5VarArr = new u5[kxVar.getChildCount()];
        for (int i11 = 0; i11 < kxVar.getChildCount(); i11++) {
            View childAt = kxVar.getChildAt(i11);
            if (childAt instanceof uy) {
                u5VarArr[i11] = ((uy) childAt).getSpan();
            }
        }
        mzVar.a2 = u5.update(i10, this, u5VarArr, mzVar.a2);
    }
}

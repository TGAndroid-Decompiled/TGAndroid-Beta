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
public abstract class ix extends wk0 {
    public boolean T2;
    public final SparseArray U2;
    public final ArrayList V2;
    public final ArrayList W2;
    public final ArrayList X2;
    public final ArrayList Y2;
    public int Z2;
    public SparseArray a3;
    public final wy f29541b3;

    public ix(wy wyVar, Context context) {
        super(context, null);
        this.f29541b3 = wyVar;
        this.U2 = new SparseArray();
        this.V2 = new ArrayList();
        this.W2 = new ArrayList();
        this.X2 = new ArrayList();
        this.Y2 = new ArrayList();
        this.Z2 = -1;
        new SparseIntArray();
        gr grVar = gr.f28844f;
    }

    @Override
    public final void dispatchDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ix.dispatchDraw(android.graphics.Canvas):void");
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
            if (this.a3 == null) {
                this.a3 = new SparseArray();
            }
            float x10 = motionEvent.getX(actionIndex);
            float y10 = motionEvent.getY(actionIndex);
            View E = E(x10, y10);
            if (z10) {
                if (E != null) {
                    ?? obj = new Object();
                    obj.f29206a = x10;
                    obj.f29207b = y10;
                    obj.f29208c = SystemClock.elapsedRealtime();
                    obj.d = E;
                    if (E.getBackground() instanceof RippleDrawable) {
                        E.getBackground().setState(new int[]{16842919, 16842910});
                    }
                    obj.d.setPressed(true);
                    this.a3.put(pointerId, obj);
                    B0();
                }
            } else {
                hx hxVar = (hx) this.a3.get(pointerId);
                this.a3.remove(pointerId);
                if (E != null && hxVar != null) {
                    if (Math.sqrt(Math.pow(y10 - hxVar.f29207b, 2.0d) + Math.pow(x10 - hxVar.f29206a, 2.0d)) < AndroidUtilities.touchSlop * 3.0f && !z12) {
                        wy wyVar = this.f29541b3;
                        if (!wyVar.f34460x1.isShowing() || SystemClock.elapsedRealtime() - hxVar.f29208c < ViewConfiguration.getLongPressTimeout()) {
                            View view = hxVar.d;
                            int R = RecyclerView.R(view);
                            try {
                                if (view instanceof fy) {
                                    wy.c(wyVar, (fy) view, null);
                                    performHapticFeedback(3, 1);
                                } else if (view instanceof lx) {
                                    wyVar.N.E(R, (lx) view);
                                    performHapticFeedback(3, 1);
                                } else {
                                    view.callOnClick();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                if (hxVar != null && (hxVar.d.getBackground() instanceof RippleDrawable)) {
                    hxVar.d.getBackground().setState(new int[0]);
                }
                if (hxVar != null) {
                    hxVar.d.setPressed(false);
                }
            }
        }
        if (!super.dispatchTouchEvent(motionEvent) && (z12 || this.a3.size() <= 0)) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(int i9) {
        if (i9 == 0) {
            boolean canScrollVertically = canScrollVertically(-1);
            wy wyVar = this.f29541b3;
            if (!canScrollVertically || !canScrollVertically(1)) {
                int i10 = wy.K2;
                wyVar.N(true);
            }
            if (!canScrollVertically(1)) {
                wy.e(wyVar, 1, AndroidUtilities.dp(36.0f));
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
        t5.release(this, this.f29541b3.Z1);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            arrayList = this.V2;
            if (i10 >= arrayList.size()) {
                break;
            }
            ((gx) arrayList.get(i10)).f();
            i10++;
        }
        while (true) {
            ArrayList arrayList2 = this.Y2;
            if (i9 < arrayList2.size()) {
                ((gx) arrayList2.get(i9)).f();
                i9++;
            } else {
                arrayList2.addAll(arrayList);
                arrayList.clear();
                return;
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean r10 = org.telegram.ui.ht.q().r(motionEvent, this, this.f29541b3.f34393c2, this.f34260l2);
        if (!super.onInterceptTouchEvent(motionEvent) && !r10) {
            return false;
        }
        return true;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        wy wyVar = this.f29541b3;
        if (wyVar.W && wyVar.V) {
            this.T2 = true;
            wyVar.M.h1(0, 0);
            wyVar.V = false;
            this.T2 = false;
        }
        super.onLayout(z10, i9, i10, i11, i12);
        wyVar.l(true);
        x1();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        this.T2 = true;
        int size = View.MeasureSpec.getSize(i9);
        wy wyVar = this.f29541b3;
        xw xwVar = wyVar.M;
        int i11 = xwVar.J;
        if (AndroidUtilities.isTablet()) {
            f10 = 60.0f;
        } else {
            f10 = 45.0f;
        }
        xwVar.y1(Math.max(1, size / AndroidUtilities.dp(f10)));
        this.T2 = false;
        super.onMeasure(i9, i10);
        if (i11 != xwVar.J) {
            wyVar.N.F(false);
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        String str;
        wy wyVar = this.f29541b3;
        int[] iArr = wyVar.f34467z1;
        iu iuVar = wyVar.f34460x1;
        if (wyVar.N1 != null && iuVar != null) {
            if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                if (motionEvent.getAction() == 2) {
                    float f10 = wyVar.Q1;
                    if (f10 != -10000.0f) {
                        if (Math.abs(f10 - motionEvent.getX()) > AndroidUtilities.getPixelsInCM(0.2f, true) || Math.abs(wyVar.R1 - motionEvent.getY()) > AndroidUtilities.getPixelsInCM(0.2f, false)) {
                            wyVar.Q1 = -10000.0f;
                            wyVar.R1 = -10000.0f;
                        }
                    }
                    getLocationOnScreen(iArr);
                    float x10 = motionEvent.getX() + iArr[0];
                    iuVar.f29522c.getLocationOnScreen(iArr);
                    int dp = (int) (x10 - (AndroidUtilities.dp(3.0f) + iArr[0]));
                    boolean z10 = iuVar.d;
                    hu huVar = iuVar.f29522c;
                    if (!z10) {
                        int max = Math.max(0, Math.min(5, dp / (AndroidUtilities.dp(4.0f) + iuVar.f29523e)));
                        if (huVar.f29190n[0] != max) {
                            AndroidUtilities.vibrateCursor(huVar);
                            int[] iArr2 = huVar.f29190n;
                            if (iArr2[0] != max) {
                                iArr2[0] = max;
                                huVar.invalidate();
                            }
                        }
                    }
                }
            } else {
                if (iuVar != null && iuVar.isShowing() && !iuVar.d) {
                    iuVar.dismiss();
                    int i9 = iuVar.f29522c.f29190n[0];
                    if (i9 >= 1 && i9 <= 5) {
                        str = CompoundEmoji.skinTones.get(i9 - 1);
                    } else {
                        str = null;
                    }
                    String str2 = (String) wyVar.N1.getTag();
                    if (!wyVar.N1.f28600c) {
                        if (str != null) {
                            Emoji.emojiColor.put(str2, str);
                            str2 = wy.g(str2, str);
                        } else {
                            Emoji.emojiColor.remove(str2);
                        }
                        wyVar.N1.a(Emoji.getEmojiBigDrawable(str2), wyVar.N1.f28600c);
                        wy.c(wyVar, wyVar.N1, null);
                        try {
                            performHapticFeedback(3, 1);
                        } catch (Exception unused) {
                        }
                        Emoji.saveEmojiColors();
                    } else {
                        String replace = str2.replace("🏻", "").replace("🏼", "").replace("🏽", "").replace("🏾", "").replace("🏿", "");
                        if (str != null) {
                            wy.c(wyVar, wyVar.N1, wy.g(replace, str));
                        } else {
                            wy.c(wyVar, wyVar.N1, replace);
                        }
                    }
                }
                if (iuVar == null || !iuVar.d) {
                    wyVar.N1 = null;
                }
                wyVar.Q1 = -10000.0f;
                wyVar.R1 = -10000.0f;
            }
            if (iuVar == null || !iuVar.d || iuVar.isShowing()) {
                return true;
            }
        }
        wyVar.O1 = motionEvent.getX();
        wyVar.P1 = motionEvent.getY();
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
            int i9 = 0;
            while (i9 < this.a3.size()) {
                hx hxVar = (hx) this.a3.valueAt(i9);
                if (hxVar.d == view) {
                    this.a3.removeAt(i9);
                    i9--;
                    View view2 = hxVar.d;
                    if (view2 != null && (view2.getBackground() instanceof RippleDrawable)) {
                        hxVar.d.getBackground().setState(new int[0]);
                    }
                    View view3 = hxVar.d;
                    if (view3 != null) {
                        view3.setPressed(false);
                    }
                }
                i9++;
            }
        }
    }

    public final void x1() {
        wy wyVar = this.f29541b3;
        int i9 = wyVar.f34390c;
        ww wwVar = wyVar.L;
        t5[] t5VarArr = new t5[wwVar.getChildCount()];
        for (int i10 = 0; i10 < wwVar.getChildCount(); i10++) {
            View childAt = wwVar.getChildAt(i10);
            if (childAt instanceof fy) {
                t5VarArr[i10] = ((fy) childAt).getSpan();
            }
        }
        wyVar.Z1 = t5.update(i9, this, t5VarArr, wyVar.Z1);
    }
}

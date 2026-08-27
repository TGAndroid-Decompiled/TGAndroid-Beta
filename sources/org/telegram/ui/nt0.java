package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

public abstract class nt0 extends NestedScrollView {
    public final Paint S;
    public final o1.j T;
    public boolean U;
    public float V;
    public float W;

    public float f40918a0;

    public final Method f40919b0;

    public final OverScroller f40920c0;

    public boolean f40921d0;

    public int f40922e0;

    public int f40923f0;

    public float f40924g0;

    public boolean f40925h0;

    public int f40926i0;

    public final qt0 f40927j0;

    public final FrameLayout f40928k0;

    public nt0(Context context, qt0 qt0Var, FrameLayout frameLayout) {
        super(context, null);
        Paint paint = new Paint(1);
        this.S = paint;
        this.f40924g0 = 1.0f;
        this.f40926i0 = -1;
        this.f40927j0 = qt0Var;
        this.f40928k0 = frameLayout;
        setClipChildren(false);
        int i10 = 2;
        setOverScrollMode(2);
        paint.setColor(-16777216);
        setFadingEdgeLength(AndroidUtilities.dp(12.0f));
        setVerticalFadingEdgeEnabled(true);
        setWillNotDraw(false);
        o1.j jVar = new o1.j(qt0Var, o1.h.f19130n, 0.0f);
        this.T = jVar;
        jVar.f19147u.b(100.0f);
        jVar.f19144j = 1.0f;
        jVar.b(new ed0(this, i10));
        jVar.a(new m9(this, i10));
        jVar.f19147u.a(1.0f);
        try {
            Method declaredMethod = NestedScrollView.class.getDeclaredMethod("d", null);
            this.f40919b0 = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e9) {
            this.f40919b0 = null;
            FileLog.e(e9);
        }
        try {
            Field declaredField = NestedScrollView.class.getDeclaredField("d");
            declaredField.setAccessible(true);
            this.f40920c0 = (OverScroller) declaredField.get(this);
        } catch (Exception e10) {
            this.f40920c0 = null;
            FileLog.e(e10);
        }
    }

    @Override
    public final void B(int i10) {
        OverScroller overScroller;
        if (this.U && i10 == 0) {
            this.U = false;
            if (this.V != 0.0f && (overScroller = this.f40920c0) != null && overScroller.isFinished()) {
                float f10 = this.f40918a0;
                o1.j jVar = this.T;
                if (!jVar.f19141f) {
                    jVar.f19137a = f10;
                    jVar.f();
                }
            }
            D();
        }
    }

    public boolean C() {
        return true;
    }

    public final void H(int i10, int i11) {
        int i12;
        int fontMetricsInt;
        int iDp;
        if (i10 == 0 || i11 == 0) {
            i12 = -1;
        } else {
            qt0 qt0Var = this.f40927j0;
            TextView currentView = qt0Var.getCurrentView();
            CharSequence text = currentView.getText();
            int iHashCode = text.hashCode();
            Point point = AndroidUtilities.displaySize;
            boolean z10 = point.x > point.y;
            if (this.f40922e0 == iHashCode && this.f40921d0 == z10 && this.f40923f0 == i11) {
                i12 = -1;
            } else {
                this.f40922e0 = iHashCode;
                this.f40921d0 = z10;
                this.f40923f0 = i11;
                currentView.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                Layout layout = currentView.getLayout();
                int lineCount = layout.getLineCount();
                if ((!z10 || lineCount > 2) && (z10 || lineCount > 5)) {
                    int iMin = Math.min(z10 ? 2 : 5, lineCount);
                    loop0: while (iMin > 1) {
                        int i13 = iMin - 1;
                        for (int lineStart = layout.getLineStart(i13); lineStart < layout.getLineEnd(i13); lineStart++) {
                            if (!Character.isWhitespace(text.charAt(lineStart))) {
                                break loop0;
                            }
                        }
                        iMin--;
                    }
                    fontMetricsInt = i11 - (currentView.getPaint().getFontMetricsInt(null) * iMin);
                    iDp = AndroidUtilities.dp(8.0f);
                } else {
                    fontMetricsInt = i11 - currentView.getMeasuredHeight();
                    iDp = qt0Var.getPaddingBottom();
                }
                i12 = fontMetricsInt - iDp;
            }
        }
        if (i12 >= 0) {
            if (this.f40925h0) {
                this.f40926i0 = i12;
            } else {
                ((ViewGroup.MarginLayoutParams) this.f40928k0.getLayoutParams()).topMargin = i12;
                this.f40926i0 = -1;
            }
        }
    }

    @Override
    public final void computeScroll() {
        OverScroller overScroller;
        super.computeScroll();
        if (!this.U && this.V != 0.0f && (overScroller = this.f40920c0) != null && overScroller.isFinished()) {
            o1.j jVar = this.T;
            if (!jVar.f19141f) {
                jVar.f19137a = 0.0f;
                jVar.f();
            }
        }
        G();
    }

    @Override
    public final void draw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int scrollY = getScrollY();
        int iSave = canvas.save();
        int i10 = height + scrollY;
        canvas.clipRect(0, scrollY, width, i10);
        int i11 = (int) (this.f40924g0 * 127.0f);
        Paint paint = this.S;
        paint.setAlpha(i11);
        canvas.drawRect(0.0f, this.f40927j0.getTranslationY() + this.f40928k0.getTop(), width, i10, paint);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override
    public final boolean g(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        iArr[1] = 0;
        if (this.U) {
            float f10 = this.V;
            if ((f10 > 0.0f && i11 > 0) || (f10 < 0.0f && i11 < 0)) {
                float f11 = i11;
                float f12 = f10 - f11;
                if (f10 > 0.0f) {
                    if (f12 < 0.0f) {
                        this.V = 0.0f;
                        iArr[1] = (int) (f11 + f12 + 0);
                    } else {
                        this.V = f12;
                        iArr[1] = i11;
                    }
                } else if (f12 > 0.0f) {
                    this.V = 0.0f;
                    iArr[1] = (int) (f11 + f12 + 0);
                } else {
                    this.V = f12;
                    iArr[1] = i11;
                }
                G();
                this.f40927j0.setTranslationY(this.V);
                return true;
            }
        }
        return false;
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    public int getPendingMarginTopDiff() {
        int i10 = this.f40926i0;
        if (i10 >= 0) {
            return i10 - ((ViewGroup.MarginLayoutParams) this.f40928k0.getLayoutParams()).topMargin;
        }
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    @Override
    public final void h(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        float f10;
        if (i13 != 0) {
            int iRound = Math.round((1.0f - Math.abs((-this.V) / (this.f40928k0.getTop() - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + (C() ? AndroidUtilities.statusBarHeight : 0))))) * i13);
            if (iRound != 0) {
                boolean z10 = this.U;
                qt0 qt0Var = this.f40927j0;
                if (z10) {
                    float f11 = this.V - iRound;
                    this.V = f11;
                    qt0Var.setTranslationY(f11);
                } else {
                    o1.j jVar = this.T;
                    if (!jVar.f19141f) {
                        OverScroller overScroller = this.f40920c0;
                        float currVelocity = overScroller != null ? overScroller.getCurrVelocity() : Float.NaN;
                        if (Float.isNaN(currVelocity)) {
                            f10 = 0.0f;
                        } else {
                            Point point = AndroidUtilities.displaySize;
                            float fMin = Math.min(point.x > point.y ? 3000.0f : 5000.0f, currVelocity);
                            iRound = (int) ((iRound * fMin) / currVelocity);
                            f10 = fMin * (-this.W);
                        }
                        if (iRound != 0) {
                            float f12 = this.V - iRound;
                            this.V = f12;
                            qt0Var.setTranslationY(f12);
                        }
                        if (!jVar.f19141f) {
                            jVar.f19137a = f10;
                            jVar.f();
                        }
                    }
                }
            }
            G();
        }
    }

    @Override
    public final void k(int i10) {
        super.k(i10);
        this.W = Math.signum(i10);
        this.f40918a0 = 0.0f;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        H(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            if (motionEvent.getY() < this.f40927j0.getTranslationY() + (this.f40928k0.getTop() - getScrollY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public final boolean z(int i10, int i11) {
        if (i11 == 0) {
            this.T.c();
            this.U = true;
            this.V = this.f40927j0.getTranslationY();
            F();
        }
        return true;
    }

    public void D() {
    }

    public void F() {
    }

    public void G() {
    }
}

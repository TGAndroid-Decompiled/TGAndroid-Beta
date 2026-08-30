package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class if1 extends org.telegram.ui.Components.aa {
    public static final int f35110e3 = 0;
    public boolean f35111a3;
    public boolean f35112b3;
    public float c3;
    public final kf1 f35113d3;

    public if1(kf1 kf1Var, Context context) {
        super(context, null);
        this.f35113d3 = kf1Var;
        this.f35111a3 = true;
        new Paint();
        new RectF();
        this.f28734e1 = true;
        this.Y2 = AndroidUtilities.dp(200.0f);
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.m4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.c3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kf1 kf1Var = this.f35113d3;
        if (kf1Var.Y0 != null) {
            canvas.save();
            canvas.translate(kf1Var.Y0.getLeft(), kf1Var.Y0.getY());
            kf1Var.Y0.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        y1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        y1();
        if (this.f35113d3.Y0 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        kf1 kf1Var = this.f35113d3;
        if (kf1Var.f35706w != null && this.c3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            kf1Var.f35706w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.U1) {
            HashSet hashSet = kf1.f35667k1;
            kf1 kf1Var = this.f35113d3;
            if (kf1Var.getParentLayout() == null || !((ActionBarLayout) kf1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.p2) kf1Var).actionBar;
                    kVar.getClass();
                    f2.o0 adapter = getAdapter();
                    if (kf1Var.f35674c != adapter.h()) {
                        this.f35112b3 = true;
                        adapter.l();
                        this.f35112b3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        HashSet hashSet = kf1.f35667k1;
        kf1 kf1Var = this.f35113d3;
        kf1Var.getClass();
        kf1Var.getClass();
        kf1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f35111a3) {
            kf1 kf1Var = this.f35113d3;
            if (kf1Var.getMessagesController().dialogsLoaded) {
                if (kf1Var.f35708x > 0) {
                    this.f35112b3 = true;
                    kVar = ((org.telegram.ui.ActionBar.p2) kf1Var).actionBar;
                    ((f2.i0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f35112b3 = false;
                }
                this.f35111a3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f2.i0 i0Var;
        int L0;
        float f10;
        if (!this.U1) {
            HashSet hashSet = kf1.f35667k1;
            kf1 kf1Var = this.f35113d3;
            if (kf1Var.getParentLayout() == null || !((ActionBarLayout) kf1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    ne1 ne1Var = kf1Var.L;
                    if (ne1Var.f5690y != 0 && kf1Var.M.d && ne1Var.f(null, 4) != 0) {
                        kf1Var.M.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && kf1Var.f35710y == 2 && kf1Var.f35708x > 0 && (L0 = (i0Var = (f2.i0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m9 = i0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f10 = 78.0f;
                    } else {
                        f10 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f10) * 0.85f);
                    int measuredHeight = m9.getMeasuredHeight() + (m9.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - kf1Var.V;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (kf1Var.f35710y != 1) {
                            if (this.c3 == 0.0f) {
                                v0(0, m9.getTop() - paddingTop, org.telegram.ui.Components.nr.h);
                            }
                            if (!kf1Var.W) {
                                kf1Var.W = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                vw vwVar = kf1Var.f35706w;
                                if (vwVar != null) {
                                    vwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.r2) m9).a0();
                            kf1Var.f35710y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.nr.h);
                        kf1Var.f35710y = 2;
                    }
                    float f11 = this.c3;
                    if (f11 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                        ofFloat.addUpdateListener(new h11(this, 19));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.y3.A(this.c3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.nr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ls0(this, 23));
                        ofFloat.start();
                    }
                }
                return onTouchEvent;
            }
        }
        return false;
    }

    @Override
    public final void removeView(View view) {
        super.removeView(view);
        view.setTranslationY(0.0f);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void requestLayout() {
        if (this.f35112b3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(f2.o0 o0Var) {
        super.setAdapter(o0Var);
        this.f35111a3 = true;
    }

    public final void setViewsOffset(float f10) {
        View m9;
        this.c3 = f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f10);
        }
        if (this.B1 != -1 && (m9 = getLayoutManager().m(this.B1)) != null) {
            int right = m9.getRight();
            int bottom = (int) (m9.getBottom() + f10);
            Rect rect = this.D1;
            rect.set(m9.getLeft(), (int) (m9.getTop() + f10), right, bottom);
            this.A1.setBounds(rect);
        }
        invalidate();
    }

    public final void y1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = kf1.f35667k1;
        }
    }

    public final void z1(boolean z4, org.telegram.ui.Cells.r2 r2Var) {
        kf1 kf1Var = this.f35113d3;
        kf1Var.B = z4;
        int i10 = 2;
        boolean z10 = true;
        if (!z4) {
            if (r2Var != null) {
                kf1Var.C.h1(1, 0);
                if (kf1Var.B) {
                    i10 = 0;
                }
                kf1Var.f35710y = i10;
                vw vwVar = kf1Var.f35706w;
                if (vwVar != null) {
                    if (i10 == 0) {
                        z10 = false;
                    }
                    vwVar.X = z10;
                }
            }
        } else {
            kf1Var.C.h1(0, 0);
            if (kf1Var.B) {
                i10 = 0;
            }
            kf1Var.f35710y = i10;
            vw vwVar2 = kf1Var.f35706w;
            if (vwVar2 != null) {
                if (i10 == 0) {
                    z10 = false;
                }
                vwVar2.X = z10;
            }
            if (r2Var != null) {
                r2Var.U();
                r2Var.invalidate();
            }
        }
        ye1 ye1Var = kf1Var.B0;
        if (ye1Var != null) {
            ye1Var.forceLayout();
        }
    }
}

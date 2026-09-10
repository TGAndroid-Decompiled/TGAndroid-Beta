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
public abstract class gg1 extends org.telegram.ui.Components.ha {
    public static final int f33095h3 = 0;
    public boolean f33096d3;
    public boolean f33097e3;
    public float f33098f3;
    public final ig1 f33099g3;

    public gg1(ig1 ig1Var, Context context) {
        super(context, null);
        this.f33099g3 = ig1Var;
        this.f33096d3 = true;
        new Paint();
        new RectF();
        this.f27971h1 = true;
        this.f23558b3 = AndroidUtilities.dp(200.0f);
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
        view.setTranslationY(this.f33098f3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ig1 ig1Var = this.f33099g3;
        if (ig1Var.f33686b1 != null) {
            canvas.save();
            canvas.translate(ig1Var.f33686b1.getLeft(), ig1Var.f33686b1.getY());
            ig1Var.f33686b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        x1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        x1();
        if (this.f33099g3.f33686b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        ig1 ig1Var = this.f33099g3;
        if (ig1Var.f33721w != null && this.f33098f3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            ig1Var.f33721w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.X1) {
            HashSet hashSet = ig1.f33680n1;
            ig1 ig1Var = this.f33099g3;
            if (ig1Var.getParentLayout() == null || !((ActionBarLayout) ig1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.p2) ig1Var).actionBar;
                    lVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (ig1Var.f33687c != adapter.h()) {
                        this.f33097e3 = true;
                        adapter.l();
                        this.f33097e3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        HashSet hashSet = ig1.f33680n1;
        ig1 ig1Var = this.f33099g3;
        ig1Var.getClass();
        ig1Var.getClass();
        ig1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        if (this.f33096d3) {
            ig1 ig1Var = this.f33099g3;
            if (ig1Var.getMessagesController().dialogsLoaded) {
                if (ig1Var.f33723x > 0) {
                    this.f33097e3 = true;
                    lVar = ((org.telegram.ui.ActionBar.p2) ig1Var).actionBar;
                    ((s4.c0) getLayoutManager()).h1(1, (int) lVar.getTranslationY());
                    this.f33097e3 = false;
                }
                this.f33096d3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c0 c0Var;
        int L0;
        float f7;
        if (!this.X1) {
            HashSet hashSet = ig1.f33680n1;
            ig1 ig1Var = this.f33099g3;
            if (ig1Var.getParentLayout() == null || !((ActionBarLayout) ig1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    mf1 mf1Var = ig1Var.O;
                    if (mf1Var.f41759y != 0 && ig1Var.P.d && mf1Var.f(null, 4) != 0) {
                        ig1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && ig1Var.f33725y == 2 && ig1Var.f33723x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - ig1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (ig1Var.f33725y != 1) {
                            if (this.f33098f3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.wr.h);
                            }
                            if (!ig1Var.Z) {
                                ig1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                cx cxVar = ig1Var.f33721w;
                                if (cxVar != null) {
                                    cxVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.r2) m10).a0();
                            ig1Var.f33725y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.wr.h);
                        ig1Var.f33725y = 2;
                    }
                    float f10 = this.f33098f3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new f21(this, 19));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.em.c(this.f33098f3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.wr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new mv0(this, 14));
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
        if (this.f33097e3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f33096d3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f33098f3 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.E1 != -1 && (m10 = getLayoutManager().m(this.E1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.G1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f7), right, bottom);
            this.D1.setBounds(rect);
        }
        invalidate();
    }

    public final void x1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = ig1.f33680n1;
        }
    }

    public final void y1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        ig1 ig1Var = this.f33099g3;
        ig1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (r2Var != null) {
                ig1Var.F.h1(1, 0);
                if (ig1Var.E) {
                    i10 = 0;
                }
                ig1Var.f33725y = i10;
                cx cxVar = ig1Var.f33721w;
                if (cxVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    cxVar.X = z11;
                }
            }
        } else {
            ig1Var.F.h1(0, 0);
            if (ig1Var.E) {
                i10 = 0;
            }
            ig1Var.f33725y = i10;
            cx cxVar2 = ig1Var.f33721w;
            if (cxVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                cxVar2.X = z11;
            }
            if (r2Var != null) {
                r2Var.U();
                r2Var.invalidate();
            }
        }
        wf1 wf1Var = ig1Var.E0;
        if (wf1Var != null) {
            wf1Var.forceLayout();
        }
    }
}

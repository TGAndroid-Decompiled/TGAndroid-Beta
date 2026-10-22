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
public abstract class pe1 extends org.telegram.ui.Components.ia {
    public static final int f40205f3 = 0;
    public boolean f40206b3;
    public boolean f40207c3;
    public float f40208d3;
    public final re1 f40209e3;

    public pe1(re1 re1Var, Context context) {
        super(context, null);
        this.f40209e3 = re1Var;
        this.f40206b3 = true;
        new Paint();
        new RectF();
        this.f27566f1 = true;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.r2 r2Var) {
        re1 re1Var = this.f40209e3;
        re1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (r2Var != null) {
                re1Var.F.h1(1, 0);
                if (re1Var.E) {
                    i10 = 0;
                }
                re1Var.f41195y = i10;
                iw iwVar = re1Var.f41191w;
                if (iwVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    iwVar.X = z11;
                }
            }
        } else {
            re1Var.F.h1(0, 0);
            if (re1Var.E) {
                i10 = 0;
            }
            re1Var.f41195y = i10;
            iw iwVar2 = re1Var.f41191w;
            if (iwVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                iwVar2.X = z11;
            }
            if (r2Var != null) {
                r2Var.U();
                r2Var.invalidate();
            }
        }
        fe1 fe1Var = re1Var.E0;
        if (fe1Var != null) {
            fe1Var.forceLayout();
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.l4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f40208d3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        re1 re1Var = this.f40209e3;
        if (re1Var.f41156b1 != null) {
            canvas.save();
            canvas.translate(re1Var.f41156b1.getLeft(), re1Var.f41156b1.getY());
            re1Var.f41156b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        z1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z1();
        if (this.f40209e3.f41156b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        re1 re1Var = this.f40209e3;
        if (re1Var.f41191w != null && this.f40208d3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            re1Var.f41191w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.V1) {
            HashSet hashSet = re1.f41150n1;
            re1 re1Var = this.f40209e3;
            if (re1Var.getParentLayout() == null || !((ActionBarLayout) re1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) re1Var).actionBar;
                    kVar.getClass();
                    s4.g0 adapter = getAdapter();
                    if (re1Var.f41157c != adapter.h()) {
                        this.f40207c3 = true;
                        adapter.l();
                        this.f40207c3 = false;
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
        HashSet hashSet = re1.f41150n1;
        re1 re1Var = this.f40209e3;
        re1Var.getClass();
        re1Var.getClass();
        re1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f40206b3) {
            re1 re1Var = this.f40209e3;
            if (re1Var.getMessagesController().dialogsLoaded) {
                if (re1Var.f41193x > 0) {
                    this.f40207c3 = true;
                    kVar = ((org.telegram.ui.ActionBar.n2) re1Var).actionBar;
                    ((s4.b0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f40207c3 = false;
                }
                this.f40206b3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.b0 b0Var;
        int L0;
        float f7;
        if (!this.V1) {
            HashSet hashSet = re1.f41150n1;
            re1 re1Var = this.f40209e3;
            if (re1Var.getParentLayout() == null || !((ActionBarLayout) re1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    vd1 vd1Var = re1Var.O;
                    if (vd1Var.f46075y != 0 && re1Var.P.d && vd1Var.g(null, 4) != 0) {
                        re1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && re1Var.f41195y == 2 && re1Var.f41193x > 0 && (L0 = (b0Var = (s4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - re1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (re1Var.f41195y != 1) {
                            if (this.f40208d3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.bs.h);
                            }
                            if (!re1Var.Z) {
                                re1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                iw iwVar = re1Var.f41191w;
                                if (iwVar != null) {
                                    iwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.r2) m10).a0();
                            re1Var.f41195y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.bs.h);
                        re1Var.f41195y = 2;
                    }
                    float f10 = this.f40208d3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new c11(this, 17));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.ok.x(this.f40208d3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.bs.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new zb0(this, 29));
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
        if (this.f40207c3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f40206b3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f40208d3 = f7;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setTranslationY(f7);
        }
        if (this.C1 != -1 && (m10 = getLayoutManager().m(this.C1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f7);
            Rect rect = this.E1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f7), right, bottom);
            this.B1.setBounds(rect);
        }
        invalidate();
    }

    public final void z1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = re1.f41150n1;
        }
    }
}

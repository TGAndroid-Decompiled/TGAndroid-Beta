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
public abstract class cg1 extends org.telegram.ui.Components.ka {
    public static final int f36731f3 = 0;
    public boolean f36732b3;
    public boolean f36733c3;
    public float f36734d3;
    public final eg1 f36735e3;

    public cg1(eg1 eg1Var, Context context) {
        super(context, null);
        this.f36735e3 = eg1Var;
        this.f36732b3 = true;
        new Paint();
        new RectF();
        this.f30554f1 = true;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        eg1 eg1Var = this.f36735e3;
        eg1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (s2Var != null) {
                eg1Var.F.h1(1, 0);
                if (eg1Var.E) {
                    i10 = 0;
                }
                eg1Var.f37390y = i10;
                yw ywVar = eg1Var.f37386w;
                if (ywVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    ywVar.X = z11;
                }
            }
        } else {
            eg1Var.F.h1(0, 0);
            if (eg1Var.E) {
                i10 = 0;
            }
            eg1Var.f37390y = i10;
            yw ywVar2 = eg1Var.f37386w;
            if (ywVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                ywVar2.X = z11;
            }
            if (s2Var != null) {
                s2Var.U();
                s2Var.invalidate();
            }
        }
        sf1 sf1Var = eg1Var.E0;
        if (sf1Var != null) {
            sf1Var.forceLayout();
        }
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
        view.setTranslationY(this.f36734d3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        eg1 eg1Var = this.f36735e3;
        if (eg1Var.f37350b1 != null) {
            canvas.save();
            canvas.translate(eg1Var.f37350b1.getLeft(), eg1Var.f37350b1.getY());
            eg1Var.f37350b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        z1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        z1();
        if (this.f36735e3.f37350b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        eg1 eg1Var = this.f36735e3;
        if (eg1Var.f37386w != null && this.f36734d3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            eg1Var.f37386w.c(canvas, true);
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
            HashSet hashSet = eg1.f37344n1;
            eg1 eg1Var = this.f36735e3;
            if (eg1Var.getParentLayout() == null || !((ActionBarLayout) eg1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) eg1Var).actionBar;
                    kVar.getClass();
                    s4.i0 adapter = getAdapter();
                    if (eg1Var.f37351c != adapter.h()) {
                        this.f36733c3 = true;
                        adapter.l();
                        this.f36733c3 = false;
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
        HashSet hashSet = eg1.f37344n1;
        eg1 eg1Var = this.f36735e3;
        eg1Var.getClass();
        eg1Var.getClass();
        eg1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f36732b3) {
            eg1 eg1Var = this.f36735e3;
            if (eg1Var.getMessagesController().dialogsLoaded) {
                if (eg1Var.f37388x > 0) {
                    this.f36733c3 = true;
                    kVar = ((org.telegram.ui.ActionBar.m2) eg1Var).actionBar;
                    ((s4.d0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f36733c3 = false;
                }
                this.f36732b3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.d0 d0Var;
        int L0;
        float f7;
        if (!this.V1) {
            HashSet hashSet = eg1.f37344n1;
            eg1 eg1Var = this.f36735e3;
            if (eg1Var.getParentLayout() == null || !((ActionBarLayout) eg1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    if1 if1Var = eg1Var.O;
                    if (if1Var.f47950y != 0 && eg1Var.P.d && if1Var.g(null, 4) != 0) {
                        eg1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && eg1Var.f37390y == 2 && eg1Var.f37388x > 0 && (L0 = (d0Var = (s4.d0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = d0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - eg1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (eg1Var.f37390y != 1) {
                            if (this.f36734d3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.is.h);
                            }
                            if (!eg1Var.Z) {
                                eg1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                yw ywVar = eg1Var.f37386w;
                                if (ywVar != null) {
                                    ywVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.s2) m10).a0();
                            eg1Var.f37390y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.is.h);
                        eg1Var.f37390y = 2;
                    }
                    float f10 = this.f36734d3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new x11(this, 19));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.ai.b(this.f36734d3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.is.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new dp0(this, 25));
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
        if (this.f36733c3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.i0 i0Var) {
        super.setAdapter(i0Var);
        this.f36732b3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f36734d3 = f7;
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
            HashSet hashSet = eg1.f37344n1;
        }
    }
}

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
public abstract class jg1 extends org.telegram.ui.Components.ka {
    public static final int f37375f3 = 0;
    public boolean f37376b3;
    public boolean f37377c3;
    public float f37378d3;
    public final lg1 f37379e3;

    public jg1(lg1 lg1Var, Context context) {
        super(context, null);
        this.f37379e3 = lg1Var;
        this.f37376b3 = true;
        new Paint();
        new RectF();
        this.f27423f1 = true;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        lg1 lg1Var = this.f37379e3;
        lg1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (s2Var != null) {
                lg1Var.F.h1(1, 0);
                if (lg1Var.E) {
                    i10 = 0;
                }
                lg1Var.f38001y = i10;
                ex exVar = lg1Var.f37997w;
                if (exVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    exVar.X = z11;
                }
            }
        } else {
            lg1Var.F.h1(0, 0);
            if (lg1Var.E) {
                i10 = 0;
            }
            lg1Var.f38001y = i10;
            ex exVar2 = lg1Var.f37997w;
            if (exVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                exVar2.X = z11;
            }
            if (s2Var != null) {
                s2Var.U();
                s2Var.invalidate();
            }
        }
        zf1 zf1Var = lg1Var.E0;
        if (zf1Var != null) {
            zf1Var.forceLayout();
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
        view.setTranslationY(this.f37378d3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        lg1 lg1Var = this.f37379e3;
        if (lg1Var.f37962b1 != null) {
            canvas.save();
            canvas.translate(lg1Var.f37962b1.getLeft(), lg1Var.f37962b1.getY());
            lg1Var.f37962b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        z1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        z1();
        if (this.f37379e3.f37962b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        lg1 lg1Var = this.f37379e3;
        if (lg1Var.f37997w != null && this.f37378d3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            lg1Var.f37997w.c(canvas, true);
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
            HashSet hashSet = lg1.f37956n1;
            lg1 lg1Var = this.f37379e3;
            if (lg1Var.getParentLayout() == null || !((ActionBarLayout) lg1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.m2) lg1Var).actionBar;
                    kVar.getClass();
                    s4.g0 adapter = getAdapter();
                    if (lg1Var.f37963c != adapter.h()) {
                        this.f37377c3 = true;
                        adapter.l();
                        this.f37377c3 = false;
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
        HashSet hashSet = lg1.f37956n1;
        lg1 lg1Var = this.f37379e3;
        lg1Var.getClass();
        lg1Var.getClass();
        lg1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f37376b3) {
            lg1 lg1Var = this.f37379e3;
            if (lg1Var.getMessagesController().dialogsLoaded) {
                if (lg1Var.f37999x > 0) {
                    this.f37377c3 = true;
                    kVar = ((org.telegram.ui.ActionBar.m2) lg1Var).actionBar;
                    ((s4.b0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f37377c3 = false;
                }
                this.f37376b3 = false;
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
            HashSet hashSet = lg1.f37956n1;
            lg1 lg1Var = this.f37379e3;
            if (lg1Var.getParentLayout() == null || !((ActionBarLayout) lg1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    pf1 pf1Var = lg1Var.O;
                    if (pf1Var.f44993y != 0 && lg1Var.P.d && pf1Var.g(null, 4) != 0) {
                        lg1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && lg1Var.f38001y == 2 && lg1Var.f37999x > 0 && (L0 = (b0Var = (s4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - lg1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (lg1Var.f38001y != 1) {
                            if (this.f37378d3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.es.h);
                            }
                            if (!lg1Var.Z) {
                                lg1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                ex exVar = lg1Var.f37997w;
                                if (exVar != null) {
                                    exVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.s2) m10).a0();
                            lg1Var.f38001y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.es.h);
                        lg1Var.f38001y = 2;
                    }
                    float f10 = this.f37378d3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new f21(this, 19));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.yh.b(this.f37378d3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.es.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new lj0(this, 28));
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
        if (this.f37377c3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f37376b3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f37378d3 = f7;
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
            HashSet hashSet = lg1.f37956n1;
        }
    }
}

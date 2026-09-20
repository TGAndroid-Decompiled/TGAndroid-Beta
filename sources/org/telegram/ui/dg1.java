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
public abstract class dg1 extends org.telegram.ui.Components.ha {
    public static final int f33038h3 = 0;
    public boolean f33039d3;
    public boolean f33040e3;
    public float f33041f3;
    public final fg1 f33042g3;

    public dg1(fg1 fg1Var, Context context) {
        super(context, null);
        this.f33042g3 = fg1Var;
        this.f33039d3 = true;
        new Paint();
        new RectF();
        this.f29191h1 = true;
        this.f24586b3 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        fg1 fg1Var = this.f33042g3;
        fg1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (s2Var != null) {
                fg1Var.F.h1(1, 0);
                if (fg1Var.E) {
                    i10 = 0;
                }
                fg1Var.f33640y = i10;
                ax axVar = fg1Var.f33636w;
                if (axVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    axVar.X = z11;
                }
            }
        } else {
            fg1Var.F.h1(0, 0);
            if (fg1Var.E) {
                i10 = 0;
            }
            fg1Var.f33640y = i10;
            ax axVar2 = fg1Var.f33636w;
            if (axVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                axVar2.X = z11;
            }
            if (s2Var != null) {
                s2Var.U();
                s2Var.invalidate();
            }
        }
        tf1 tf1Var = fg1Var.E0;
        if (tf1Var != null) {
            tf1Var.forceLayout();
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof org.telegram.ui.Cells.n4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f33041f3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fg1 fg1Var = this.f33042g3;
        if (fg1Var.f33601b1 != null) {
            canvas.save();
            canvas.translate(fg1Var.f33601b1.getLeft(), fg1Var.f33601b1.getY());
            fg1Var.f33601b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        z1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        z1();
        if (this.f33042g3.f33601b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fg1 fg1Var = this.f33042g3;
        if (fg1Var.f33636w != null && this.f33041f3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            fg1Var.f33636w.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.X1) {
            HashSet hashSet = fg1.f33595n1;
            fg1 fg1Var = this.f33042g3;
            if (fg1Var.getParentLayout() == null || !((ActionBarLayout) fg1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) fg1Var).actionBar;
                    kVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (fg1Var.f33602c != adapter.h()) {
                        this.f33040e3 = true;
                        adapter.l();
                        this.f33040e3 = false;
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
        HashSet hashSet = fg1.f33595n1;
        fg1 fg1Var = this.f33042g3;
        fg1Var.getClass();
        fg1Var.getClass();
        fg1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f33039d3) {
            fg1 fg1Var = this.f33042g3;
            if (fg1Var.getMessagesController().dialogsLoaded) {
                if (fg1Var.f33638x > 0) {
                    this.f33040e3 = true;
                    kVar = ((org.telegram.ui.ActionBar.n2) fg1Var).actionBar;
                    ((s4.c0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f33040e3 = false;
                }
                this.f33039d3 = false;
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
            HashSet hashSet = fg1.f33595n1;
            fg1 fg1Var = this.f33042g3;
            if (fg1Var.getParentLayout() == null || !((ActionBarLayout) fg1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    jf1 jf1Var = fg1Var.O;
                    if (jf1Var.f43123y != 0 && fg1Var.P.d && jf1Var.g(null, 4) != 0) {
                        fg1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && fg1Var.f33640y == 2 && fg1Var.f33638x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - fg1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (fg1Var.f33640y != 1) {
                            if (this.f33041f3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.qr.h);
                            }
                            if (!fg1Var.Z) {
                                fg1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                ax axVar = fg1Var.f33636w;
                                if (axVar != null) {
                                    axVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.s2) m10).a0();
                            fg1Var.f33640y = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.qr.h);
                        fg1Var.f33640y = 2;
                    }
                    float f10 = this.f33041f3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new i21(this, 18));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.rk.b(this.f33041f3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.qr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new gp0(this, 25));
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
        if (this.f33040e3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f33039d3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f33041f3 = f7;
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

    public final void z1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = fg1.f33595n1;
        }
    }
}

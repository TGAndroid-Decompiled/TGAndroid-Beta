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
public abstract class bg1 extends org.telegram.ui.Components.ia {
    public static final int f32372h3 = 0;
    public boolean f32373d3;
    public boolean f32374e3;
    public float f32375f3;
    public final dg1 f32376g3;

    public bg1(dg1 dg1Var, Context context) {
        super(context, null);
        this.f32376g3 = dg1Var;
        this.f32373d3 = true;
        new Paint();
        new RectF();
        this.f30074h1 = true;
        this.f24883b3 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        dg1 dg1Var = this.f32376g3;
        dg1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (s2Var != null) {
                dg1Var.F.h1(1, 0);
                if (dg1Var.E) {
                    i10 = 0;
                }
                dg1Var.f33014y = i10;
                ax axVar = dg1Var.f33010w;
                if (axVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    axVar.X = z11;
                }
            }
        } else {
            dg1Var.F.h1(0, 0);
            if (dg1Var.E) {
                i10 = 0;
            }
            dg1Var.f33014y = i10;
            ax axVar2 = dg1Var.f33010w;
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
        rf1 rf1Var = dg1Var.E0;
        if (rf1Var != null) {
            rf1Var.forceLayout();
        }
    }

    @Override
    public final boolean G0(View view) {
        if ((view instanceof org.telegram.ui.Cells.m4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f32375f3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        dg1 dg1Var = this.f32376g3;
        if (dg1Var.f32975b1 != null) {
            canvas.save();
            canvas.translate(dg1Var.f32975b1.getLeft(), dg1Var.f32975b1.getY());
            dg1Var.f32975b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        z1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        z1();
        if (this.f32376g3.f32975b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        dg1 dg1Var = this.f32376g3;
        if (dg1Var.f33010w != null && this.f32375f3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            dg1Var.f33010w.c(canvas, true);
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
            HashSet hashSet = dg1.f32969n1;
            dg1 dg1Var = this.f32376g3;
            if (dg1Var.getParentLayout() == null || !((ActionBarLayout) dg1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) dg1Var).actionBar;
                    kVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (dg1Var.f32976c != adapter.h()) {
                        this.f32374e3 = true;
                        adapter.l();
                        this.f32374e3 = false;
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
        HashSet hashSet = dg1.f32969n1;
        dg1 dg1Var = this.f32376g3;
        dg1Var.getClass();
        dg1Var.getClass();
        dg1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f32373d3) {
            dg1 dg1Var = this.f32376g3;
            if (dg1Var.getMessagesController().dialogsLoaded) {
                if (dg1Var.f33012x > 0) {
                    this.f32374e3 = true;
                    kVar = ((org.telegram.ui.ActionBar.n2) dg1Var).actionBar;
                    ((s4.c0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f32374e3 = false;
                }
                this.f32373d3 = false;
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
            HashSet hashSet = dg1.f32969n1;
            dg1 dg1Var = this.f32376g3;
            if (dg1Var.getParentLayout() == null || !((ActionBarLayout) dg1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    hf1 hf1Var = dg1Var.O;
                    if (hf1Var.f43078y != 0 && dg1Var.P.d && hf1Var.g(null, 4) != 0) {
                        dg1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && dg1Var.f33014y == 2 && dg1Var.f33012x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - dg1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (dg1Var.f33014y != 1) {
                            if (this.f32375f3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.qr.h);
                            }
                            if (!dg1Var.Z) {
                                dg1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                ax axVar = dg1Var.f33010w;
                                if (axVar != null) {
                                    axVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.s2) m10).a0();
                            dg1Var.f33014y = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.qr.h);
                        dg1Var.f33014y = 2;
                    }
                    float f10 = this.f32375f3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new i21(this, 18));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.wh.b(this.f32375f3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
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
        if (this.f32374e3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f32373d3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f32375f3 = f7;
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
            HashSet hashSet = dg1.f32969n1;
        }
    }
}

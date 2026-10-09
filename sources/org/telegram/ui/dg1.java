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
public abstract class dg1 extends org.telegram.ui.Components.la {
    public static final int f36959f3 = 0;
    public boolean f36960b3;
    public boolean f36961c3;
    public float f36962d3;
    public final fg1 f36963e3;

    public dg1(fg1 fg1Var, Context context) {
        super(context, null);
        this.f36963e3 = fg1Var;
        this.f36960b3 = true;
        new Paint();
        new RectF();
        this.f30200f1 = true;
        this.Z2 = AndroidUtilities.dp(200.0f);
    }

    public final void A1(boolean z10, org.telegram.ui.Cells.s2 s2Var) {
        fg1 fg1Var = this.f36963e3;
        fg1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (s2Var != null) {
                fg1Var.F.h1(1, 0);
                if (fg1Var.E) {
                    i10 = 0;
                }
                fg1Var.f37601y = i10;
                zw zwVar = fg1Var.f37597w;
                if (zwVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    zwVar.X = z11;
                }
            }
        } else {
            fg1Var.F.h1(0, 0);
            if (fg1Var.E) {
                i10 = 0;
            }
            fg1Var.f37601y = i10;
            zw zwVar2 = fg1Var.f37597w;
            if (zwVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                zwVar2.X = z11;
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
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.m4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f36962d3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fg1 fg1Var = this.f36963e3;
        if (fg1Var.f37561b1 != null) {
            canvas.save();
            canvas.translate(fg1Var.f37561b1.getLeft(), fg1Var.f37561b1.getY());
            fg1Var.f37561b1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        z1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        z1();
        if (this.f36963e3.f37561b1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        fg1 fg1Var = this.f36963e3;
        if (fg1Var.f37597w != null && this.f36962d3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            fg1Var.f37597w.c(canvas, true);
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
            HashSet hashSet = fg1.f37555n1;
            fg1 fg1Var = this.f36963e3;
            if (fg1Var.getParentLayout() == null || !((ActionBarLayout) fg1Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.n2) fg1Var).actionBar;
                    kVar.getClass();
                    s4.i0 adapter = getAdapter();
                    if (fg1Var.f37562c != adapter.h()) {
                        this.f36961c3 = true;
                        adapter.l();
                        this.f36961c3 = false;
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
        HashSet hashSet = fg1.f37555n1;
        fg1 fg1Var = this.f36963e3;
        fg1Var.getClass();
        fg1Var.getClass();
        fg1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f36960b3) {
            fg1 fg1Var = this.f36963e3;
            if (fg1Var.getMessagesController().dialogsLoaded) {
                if (fg1Var.f37599x > 0) {
                    this.f36961c3 = true;
                    kVar = ((org.telegram.ui.ActionBar.n2) fg1Var).actionBar;
                    ((s4.d0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f36961c3 = false;
                }
                this.f36960b3 = false;
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
            HashSet hashSet = fg1.f37555n1;
            fg1 fg1Var = this.f36963e3;
            if (fg1Var.getParentLayout() == null || !((ActionBarLayout) fg1Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    jf1 jf1Var = fg1Var.O;
                    if (jf1Var.f47824y != 0 && fg1Var.P.d && jf1Var.g(null, 4) != 0) {
                        fg1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && fg1Var.f37601y == 2 && fg1Var.f37599x > 0 && (L0 = (d0Var = (s4.d0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = d0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - fg1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (fg1Var.f37601y != 1) {
                            if (this.f36962d3 == 0.0f) {
                                v0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.hs.h);
                            }
                            if (!fg1Var.Z) {
                                fg1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                zw zwVar = fg1Var.f37597w;
                                if (zwVar != null) {
                                    zwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.s2) m10).a0();
                            fg1Var.f37601y = 1;
                        }
                    } else {
                        v0(0, measuredHeight, org.telegram.ui.Components.hs.h);
                        fg1Var.f37601y = 2;
                    }
                    float f10 = this.f36962d3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new y11(this, 19));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.bi.b(this.f36962d3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.hs.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ep0(this, 25));
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
        if (this.f36961c3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.i0 i0Var) {
        super.setAdapter(i0Var);
        this.f36960b3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f36962d3 = f7;
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
            HashSet hashSet = fg1.f37555n1;
        }
    }
}

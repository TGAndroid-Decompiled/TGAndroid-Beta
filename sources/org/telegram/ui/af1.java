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
public abstract class af1 extends org.telegram.ui.Components.ka {
    public static final int f37765o3 = 0;
    public boolean f37766k3;
    public boolean f37767l3;
    public float f37768m3;
    public final cf1 f37769n3;

    public af1(cf1 cf1Var, Context context) {
        super(context, null);
        this.f37769n3 = cf1Var;
        this.f37766k3 = true;
        new Paint();
        new RectF();
        this.f30972f1 = true;
        this.f29915i3 = AndroidUtilities.dp(200.0f);
    }

    public final void E1() {
        if (getItemAnimator() != null && getItemAnimator().k()) {
            HashSet hashSet = cf1.f38287q1;
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.q4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    public final void F1(boolean z10, org.telegram.ui.Cells.p2 p2Var) {
        cf1 cf1Var = this.f37769n3;
        cf1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (p2Var != null) {
                cf1Var.F.h1(1, 0);
                if (cf1Var.E) {
                    i10 = 0;
                }
                cf1Var.f38335y = i10;
                hw hwVar = cf1Var.f38331w;
                if (hwVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    hwVar.X = z11;
                }
            }
        } else {
            cf1Var.F.h1(0, 0);
            if (cf1Var.E) {
                i10 = 0;
            }
            cf1Var.f38335y = i10;
            hw hwVar2 = cf1Var.f38331w;
            if (hwVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                hwVar2.X = z11;
            }
            if (p2Var != null) {
                p2Var.T();
                p2Var.invalidate();
            }
        }
        qe1 qe1Var = cf1Var.E0;
        if (qe1Var != null) {
            qe1Var.forceLayout();
        }
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f37768m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        cf1 cf1Var = this.f37769n3;
        if (cf1Var.f38296c1 != null) {
            canvas.save();
            canvas.translate(cf1Var.f38296c1.getLeft(), cf1Var.f38296c1.getY());
            cf1Var.f38296c1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        E1();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        E1();
        if (this.f37769n3.f38296c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        cf1 cf1Var = this.f37769n3;
        if (cf1Var.f38331w != null && this.f37768m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            cf1Var.f38331w.c(canvas, true);
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
            HashSet hashSet = cf1.f38287q1;
            cf1 cf1Var = this.f37769n3;
            if (cf1Var.getParentLayout() == null || !((ActionBarLayout) cf1Var.getParentLayout()).x()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.r2) cf1Var).actionBar;
                    kVar.getClass();
                    s4.h0 adapter = getAdapter();
                    if (cf1Var.f38294c != adapter.h()) {
                        this.f37767l3 = true;
                        adapter.l();
                        this.f37767l3 = false;
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
        HashSet hashSet = cf1.f38287q1;
        cf1 cf1Var = this.f37769n3;
        cf1Var.getClass();
        cf1Var.getClass();
        cf1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f37766k3) {
            cf1 cf1Var = this.f37769n3;
            if (cf1Var.getMessagesController().dialogsLoaded) {
                if (cf1Var.f38333x > 0) {
                    this.f37767l3 = true;
                    kVar = ((org.telegram.ui.ActionBar.r2) cf1Var).actionBar;
                    ((s4.c0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f37767l3 = false;
                }
                this.f37766k3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.c0 c0Var;
        int L0;
        float f7;
        if (!this.V1) {
            HashSet hashSet = cf1.f38287q1;
            cf1 cf1Var = this.f37769n3;
            if (cf1Var.getParentLayout() == null || !((ActionBarLayout) cf1Var.getParentLayout()).x()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    ge1 ge1Var = cf1Var.O;
                    if (ge1Var.f47905y != 0 && cf1Var.P.d && ge1Var.i(null, 4) != 0) {
                        cf1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && cf1Var.f38335y == 2 && cf1Var.f38333x > 0 && (L0 = (c0Var = (s4.c0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = c0Var.m(L0);
                    if (SharedConfig.useThreeLinesLayout) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int dp = (int) (AndroidUtilities.dp(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - cf1Var.Y;
                    if (measuredHeight >= dp && currentTimeMillis >= 200) {
                        if (cf1Var.f38335y != 1) {
                            if (this.f37768m3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.ds.h);
                            }
                            if (!cf1Var.Z) {
                                cf1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                hw hwVar = cf1Var.f38331w;
                                if (hwVar != null) {
                                    hwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.p2) m10).Z();
                            cf1Var.f38335y = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.ds.h);
                        cf1Var.f38335y = 2;
                    }
                    float f10 = this.f37768m3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new x11(this, 16));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.wh.w(this.f37768m3, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.ds.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new hc1(this, 2));
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
        if (this.f37767l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f37766k3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f37768m3 = f7;
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
}

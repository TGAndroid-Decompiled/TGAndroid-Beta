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
import org.telegram.ui.ActionBar.ActionBarLayout;
public abstract class lb1 extends org.telegram.ui.Components.r9 {
    public static final int f39182n3 = 0;
    public boolean f39183j3;
    public boolean f39184k3;
    public float f39185l3;
    public final nb1 f39186m3;

    public lb1(nb1 nb1Var, Context context) {
        super(context, null);
        this.f39186m3 = nb1Var;
        this.f39183j3 = true;
        new Paint();
        new RectF();
        this.f30992f1 = true;
        this.f29965h3 = org.telegram.messenger.i0.L(200.0f);
    }

    public final void B1(boolean z10, org.telegram.ui.Cells.v2 v2Var) {
        nb1 nb1Var = this.f39186m3;
        nb1Var.E = z10;
        int i10 = 2;
        boolean z11 = true;
        if (!z10) {
            if (v2Var != null) {
                nb1Var.F.h1(1, 0);
                if (nb1Var.E) {
                    i10 = 0;
                }
                nb1Var.D = i10;
                jw jwVar = nb1Var.f39842x;
                if (jwVar != null) {
                    if (i10 == 0) {
                        z11 = false;
                    }
                    jwVar.X = z11;
                }
            }
        } else {
            nb1Var.F.h1(0, 0);
            if (nb1Var.E) {
                i10 = 0;
            }
            nb1Var.D = i10;
            jw jwVar2 = nb1Var.f39842x;
            if (jwVar2 != null) {
                if (i10 == 0) {
                    z11 = false;
                }
                jwVar2.X = z11;
            }
            if (v2Var != null) {
                v2Var.b0();
                v2Var.invalidate();
            }
        }
        db1 db1Var = nb1Var.E0;
        if (db1Var != null) {
            db1Var.forceLayout();
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.p4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        view.setTranslationY(this.f39185l3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        nb1 nb1Var = this.f39186m3;
        if (nb1Var.f39805c1 != null) {
            canvas.save();
            canvas.translate(nb1Var.f39805c1.getLeft(), nb1Var.f39805c1.getY());
            nb1Var.f39805c1.draw(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (getItemAnimator() != null) {
            getItemAnimator().k();
        }
        if (this.f39186m3.f39805c1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        nb1 nb1Var = this.f39186m3;
        if (nb1Var.f39842x != null && this.f39185l3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            nb1Var.f39842x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        if (!this.V1) {
            HashSet hashSet = nb1.f39796q1;
            nb1 nb1Var = this.f39186m3;
            if (nb1Var.getParentLayout() == null || !((ActionBarLayout) nb1Var.getParentLayout()).x()) {
                if (motionEvent.getAction() == 0) {
                    lVar = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
                    lVar.getClass();
                    s4.g0 adapter = getAdapter();
                    if (nb1Var.f39803c != adapter.b()) {
                        this.f39184k3 = true;
                        adapter.f();
                        this.f39184k3 = false;
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
        nb1 nb1Var = this.f39186m3;
        nb1Var.getClass();
        nb1Var.getClass();
        nb1Var.getClass();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.l lVar;
        if (this.f39183j3) {
            nb1 nb1Var = this.f39186m3;
            if (nb1Var.getMessagesController().Y1) {
                if (nb1Var.f39844y > 0) {
                    this.f39184k3 = true;
                    lVar = ((org.telegram.ui.ActionBar.k2) nb1Var).actionBar;
                    ((s4.a0) getLayoutManager()).h1(1, (int) lVar.getTranslationY());
                    this.f39184k3 = false;
                }
                this.f39183j3 = false;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s4.a0 a0Var;
        int L0;
        float f7;
        if (!this.V1) {
            HashSet hashSet = nb1.f39796q1;
            nb1 nb1Var = this.f39186m3;
            if (nb1Var.getParentLayout() == null || !((ActionBarLayout) nb1Var.getParentLayout()).x()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    sa1 sa1Var = nb1Var.O;
                    if (sa1Var.D != 0 && nb1Var.P.d && sa1Var.i(null, 4) != 0) {
                        nb1Var.P.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && nb1Var.D == 2 && nb1Var.f39844y > 0 && (L0 = (a0Var = (s4.a0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = a0Var.m(L0);
                    if (org.telegram.messenger.uz.f18542p1) {
                        f7 = 78.0f;
                    } else {
                        f7 = 72.0f;
                    }
                    int L = (int) (org.telegram.messenger.i0.L(f7) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - nb1Var.Y;
                    if (measuredHeight >= L && currentTimeMillis >= 200) {
                        if (nb1Var.D != 1) {
                            if (this.f39185l3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.gr.h);
                            }
                            if (!nb1Var.Z) {
                                nb1Var.Z = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                jw jwVar = nb1Var.f39842x;
                                if (jwVar != null) {
                                    jwVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.v2) m10).h0();
                            nb1Var.D = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.gr.h);
                        nb1Var.D = 2;
                    }
                    float f10 = this.f39185l3;
                    if (f10 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, 0.0f);
                        ofFloat.addUpdateListener(new u01(this, 15));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.a30.v(this.f39185l3, org.telegram.messenger.i0.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.gr.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new ms0(this, 12));
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
        if (this.f39184k3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(s4.g0 g0Var) {
        super.setAdapter(g0Var);
        this.f39183j3 = true;
    }

    public final void setViewsOffset(float f7) {
        View m10;
        this.f39185l3 = f7;
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

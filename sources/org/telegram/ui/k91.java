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
public abstract class k91 extends org.telegram.ui.Components.w9 {
    public static final int f46833o3 = 0;
    public boolean f46834k3;
    public boolean f46835l3;
    public float f46836m3;
    public final m91 f46837n3;

    public k91(m91 m91Var, Context context) {
        super(context, null);
        this.f46837n3 = m91Var;
        this.f46834k3 = true;
        new Paint();
        new RectF();
        this.f38445g1 = true;
        this.i3 = org.telegram.messenger.g0.L(200.0f);
    }

    public final void B1(boolean z10, org.telegram.ui.Cells.t2 t2Var) {
        m91 m91Var = this.f46837n3;
        m91Var.F = z10;
        int i3 = 2;
        boolean z11 = true;
        if (!z10) {
            if (t2Var != null) {
                m91Var.G.h1(1, 0);
                if (m91Var.F) {
                    i3 = 0;
                }
                m91Var.E = i3;
                cv cvVar = m91Var.f47621x;
                if (cvVar != null) {
                    if (i3 == 0) {
                        z11 = false;
                    }
                    cvVar.X = z11;
                }
            }
        } else {
            m91Var.G.h1(0, 0);
            if (m91Var.F) {
                i3 = 0;
            }
            m91Var.E = i3;
            cv cvVar2 = m91Var.f47621x;
            if (cvVar2 != null) {
                if (i3 == 0) {
                    z11 = false;
                }
                cvVar2.X = z11;
            }
            if (t2Var != null) {
                t2Var.b0();
                t2Var.invalidate();
            }
        }
        c91 c91Var = m91Var.F0;
        if (c91Var != null) {
            c91Var.forceLayout();
        }
    }

    @Override
    public final boolean F0(View view) {
        if ((view instanceof org.telegram.ui.Cells.n4) && !view.isClickable()) {
            return false;
        }
        return true;
    }

    @Override
    public final void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
        view.setTranslationY(this.f46836m3);
        view.setTranslationX(0.0f);
        view.setAlpha(1.0f);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        m91 m91Var = this.f46837n3;
        if (m91Var.f47585d1 != null) {
            canvas.save();
            canvas.translate(m91Var.f47585d1.getLeft(), m91Var.f47585d1.getY());
            m91Var.f47585d1.draw(canvas);
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
        if (this.f46837n3.f47585d1 == view) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        m91 m91Var = this.f46837n3;
        if (m91Var.f47621x != null && this.f46836m3 != 0.0f) {
            int paddingTop = getPaddingTop();
            if (paddingTop != 0) {
                canvas.save();
                canvas.translate(0.0f, paddingTop);
            }
            m91Var.f47621x.c(canvas, true);
            if (paddingTop != 0) {
                canvas.restore();
            }
        }
        super.onDraw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        if (!this.W1) {
            HashSet hashSet = m91.f47574r1;
            m91 m91Var = this.f46837n3;
            if (m91Var.getParentLayout() == null || !((ActionBarLayout) m91Var.getParentLayout()).y()) {
                if (motionEvent.getAction() == 0) {
                    kVar = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
                    kVar.getClass();
                    u4.h0 adapter = getAdapter();
                    if (m91Var.f47581c != adapter.b()) {
                        this.f46835l3 = true;
                        adapter.f();
                        this.f46835l3 = false;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        }
        return false;
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        m91 m91Var = this.f46837n3;
        m91Var.getClass();
        m91Var.getClass();
        m91Var.getClass();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        if (this.f46834k3) {
            m91 m91Var = this.f46837n3;
            if (m91Var.getMessagesController().Z1) {
                if (m91Var.f47623y > 0) {
                    this.f46835l3 = true;
                    kVar = ((org.telegram.ui.ActionBar.d2) m91Var).actionBar;
                    ((u4.b0) getLayoutManager()).h1(1, (int) kVar.getTranslationY());
                    this.f46835l3 = false;
                }
                this.f46834k3 = false;
            }
        }
        super.onMeasure(i3, i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u4.b0 b0Var;
        int L0;
        float f10;
        if (!this.W1) {
            HashSet hashSet = m91.f47574r1;
            m91 m91Var = this.f46837n3;
            if (m91Var.getParentLayout() == null || !((ActionBarLayout) m91Var.getParentLayout()).y()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    setOverScrollMode(0);
                }
                if (action == 1 || action == 3) {
                    s81 s81Var = m91Var.P;
                    if (s81Var.E != 0 && m91Var.Q.d && s81Var.i(null, 4) != 0) {
                        m91Var.Q.getClass();
                    }
                }
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if ((action == 1 || action == 3) && m91Var.E == 2 && m91Var.f47623y > 0 && (L0 = (b0Var = (u4.b0) getLayoutManager()).L0()) == 0) {
                    int paddingTop = getPaddingTop();
                    View m10 = b0Var.m(L0);
                    if (org.telegram.messenger.az.f21654p1) {
                        f10 = 78.0f;
                    } else {
                        f10 = 72.0f;
                    }
                    int L = (int) (org.telegram.messenger.g0.L(f10) * 0.85f);
                    int measuredHeight = m10.getMeasuredHeight() + (m10.getTop() - paddingTop);
                    long currentTimeMillis = System.currentTimeMillis() - m91Var.Z;
                    if (measuredHeight >= L && currentTimeMillis >= 200) {
                        if (m91Var.E != 1) {
                            if (this.f46836m3 == 0.0f) {
                                w0(0, m10.getTop() - paddingTop, org.telegram.ui.Components.xq.h);
                            }
                            if (!m91Var.f47576a0) {
                                m91Var.f47576a0 = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                cv cvVar = m91Var.f47621x;
                                if (cvVar != null) {
                                    cvVar.a(true);
                                }
                            }
                            ((org.telegram.ui.Cells.t2) m10).h0();
                            m91Var.E = 1;
                        }
                    } else {
                        w0(0, measuredHeight, org.telegram.ui.Components.xq.h);
                        m91Var.E = 2;
                    }
                    float f11 = this.f46836m3;
                    if (f11 != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
                        ofFloat.addUpdateListener(new xy0(this, 15));
                        ofFloat.setDuration(Math.max(100L, org.telegram.messenger.camera.q.v(this.f46836m3, org.telegram.messenger.g0.L(72.0f), 120.0f, 350.0f)));
                        ofFloat.setInterpolator(org.telegram.ui.Components.xq.h);
                        setScrollEnabled(false);
                        ofFloat.addListener(new i81(this, 1));
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
        if (this.f46835l3) {
            return;
        }
        super.requestLayout();
    }

    @Override
    public final void setAdapter(u4.h0 h0Var) {
        super.setAdapter(h0Var);
        this.f46834k3 = true;
    }

    public final void setViewsOffset(float f10) {
        View m10;
        this.f46836m3 = f10;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).setTranslationY(f10);
        }
        if (this.D1 != -1 && (m10 = getLayoutManager().m(this.D1)) != null) {
            int right = m10.getRight();
            int bottom = (int) (m10.getBottom() + f10);
            Rect rect = this.F1;
            rect.set(m10.getLeft(), (int) (m10.getTop() + f10), right, bottom);
            this.C1.setBounds(rect);
        }
        invalidate();
    }
}

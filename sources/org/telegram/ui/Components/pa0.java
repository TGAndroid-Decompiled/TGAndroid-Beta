package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public abstract class pa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int R = 0;
    public Paint B;
    public Integer C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final vp G;
    public o1.j H;
    public boolean I;
    public float J;
    public boolean K;
    public int L;
    public ArrayList M;
    public final la0 N;
    public pg.b O;
    public final Path P;
    public final RectF Q;
    public final org.telegram.ui.ActionBar.f6 f27800a;
    public final oa0 f27801b;
    public final org.telegram.ui.br f27802c;
    public final ia0 d;
    public final tf.z0 e;
    public final tf.u0 f27803f;
    public final org.telegram.ui.ActionBar.p2 h;
    public float f27804n;
    public float f27805r;
    public float f27806s;
    public float v;
    public gg.v0 f27807w;
    public ma0 f27808x;
    public final Rect f27809y;

    public pa0(Context context, long j10, long j11, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f27809y = new Rect();
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = new vp(this, 27);
        this.I = false;
        this.J = 0.0f;
        this.K = false;
        this.N = new la0(this);
        this.P = new Path();
        this.Q = new RectF();
        this.h = p2Var;
        this.f27800a = f6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        oa0 oa0Var = new oa0(this, context, f6Var);
        this.f27801b = oa0Var;
        org.telegram.ui.br brVar = new org.telegram.ui.br((Object) this, 2);
        this.f27802c = brVar;
        brVar.j1(1);
        ia0 ia0Var = new ia0(this);
        this.d = ia0Var;
        ia0Var.O = new ja0(this);
        f2.l lVar = new f2.l();
        lVar.f5837c = 150L;
        lVar.e = 150L;
        lVar.f5838f = 150L;
        lVar.f5839g = 150L;
        lVar.d = 150L;
        lVar.f5773o = nr.f27346f;
        lVar.C = false;
        oa0Var.setItemAnimator(lVar);
        oa0Var.setClipToPadding(false);
        oa0Var.setLayoutManager(brVar);
        tf.u0 u0Var = new tf.u0(context, j10, j11, new ka0(this, p2Var), f6Var, h());
        this.f27803f = u0Var;
        ?? o0Var = new f2.o0();
        o0Var.d = null;
        o0Var.f44925f = false;
        f2.d1 d1Var = new f2.d1(o0Var, 2);
        o0Var.f44924c = u0Var;
        u0Var.B(d1Var);
        this.e = o0Var;
        oa0Var.setAdapter(o0Var);
        oa0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(oa0Var, k7.b6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        ia0 ia0Var;
        tf.u0 u0Var;
        int height;
        oa0 oa0Var = this.f27801b;
        if (oa0Var != null && this.f27802c != null) {
            boolean g10 = g();
            this.f27806s = 0.0f;
            tf.z0 z0Var = this.e;
            if (g10) {
                if (z0Var.f44925f) {
                    height = z0Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, oa0Var.getTranslationY() + height) + this.f27806s, (1.0f - this.J) * getHeight());
                this.f27804n = 0.0f;
                this.f27805r = min;
            } else {
                if (z0Var.f44925f) {
                    i10 = z0Var.e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f27804n = Math.max(Math.max(0.0f, oa0Var.getTranslationY() + i10) - this.f27806s, this.J * getHeight());
                this.f27805r = getMeasuredHeight();
            }
            pg.b bVar = this.O;
            if (bVar != null) {
                bVar.setBounds(0, ((int) this.f27804n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f27805r));
                Path path = this.P;
                path.rewind();
                Rect rect = this.O.h.f41212m;
                RectF rectF = this.Q;
                rectF.set(rect);
                if (oa0Var != null && (ia0Var = this.d) != null && oa0Var.getLayoutManager() == ia0Var && (u0Var = this.f27803f) != null && u0Var.O != null) {
                    rectF.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
                    path.addRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), Path.Direction.CW);
                } else {
                    path.addRoundRect(rectF, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(22.0f), Path.Direction.CW);
                }
                path.close();
                invalidate();
            }
        }
    }

    public final void c() {
        boolean z4;
        float f10;
        int i10;
        ia0 ia0Var;
        tf.u0 u0Var;
        oa0 oa0Var = this.f27801b;
        if (oa0Var != null && this.f27802c != null) {
            int i11 = 0;
            if (oa0Var != null && (ia0Var = this.d) != null && oa0Var.getLayoutManager() == ia0Var && (u0Var = this.f27803f) != null && u0Var.O != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.O == null) {
                oa0Var.setPadding(0, 0, 0, 0);
                return;
            }
            float f11 = 5.0f;
            if (z4) {
                f10 = 7.0f;
            } else {
                f10 = 5.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            if (z4) {
                i10 = AndroidUtilities.dp(2.0f);
            } else {
                i10 = 0;
            }
            if (z4) {
                f11 = 7.0f;
            }
            int dp2 = AndroidUtilities.dp(f11);
            if (z4) {
                i11 = AndroidUtilities.dp(2.0f);
            }
            oa0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f27804n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f27801b, (h5.d) new nh.e(9));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float min;
        int v02;
        int height;
        pg.b bVar = this.O;
        if (bVar != null) {
            bVar.draw(canvas);
            canvas.save();
            canvas.clipPath(this.P);
            super.dispatchDraw(canvas);
            canvas.restore();
            return;
        }
        boolean g10 = g();
        tf.u0 u0Var = this.f27803f;
        if ((u0Var.N() || u0Var.O != null) && ((u0Var.f44861u0 || u0Var.f44866x0 != null) && u0Var.I() == null && u0Var.R == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f27806s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f10 = this.f27804n;
        tf.z0 z0Var = this.e;
        oa0 oa0Var = this.f27801b;
        Rect rect = this.f27809y;
        if (g10) {
            if (z0Var.f44925f) {
                height = z0Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, oa0Var.getTranslationY() + height) + this.f27806s, (1.0f - this.J) * getHeight());
            this.f27804n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f27805r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f27805r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (oa0Var.getLayoutManager() == this.d) {
                this.f27806s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (z0Var.f44925f) {
                i11 = z0Var.e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, oa0Var.getTranslationY() + i11) - this.f27806s;
            this.f27804n = max;
            float max2 = Math.max(max, this.J * getHeight());
            this.f27804n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f27805r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f27804n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.f27804n) > 0.1f) {
            i();
        }
        if (this.B == null) {
            Paint paint = new Paint(1);
            this.B = paint;
            paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, 0.0f, 503316480);
        }
        Paint paint2 = this.B;
        Integer num = this.C;
        if (num != null) {
            v02 = num.intValue();
        } else {
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, this.f27800a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f27805r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.B);
    }

    public final boolean g() {
        f2.v0 layoutManager = this.f27801b.getLayoutManager();
        org.telegram.ui.br brVar = this.f27802c;
        if (layoutManager == brVar && brVar.f5736t) {
            return true;
        }
        return false;
    }

    public tf.u0 getAdapter() {
        return this.f27803f;
    }

    public f2.i0 getCurrentLayoutManager() {
        f2.v0 layoutManager = this.f27801b.getLayoutManager();
        org.telegram.ui.br brVar = this.f27802c;
        if (layoutManager == brVar) {
            return brVar;
        }
        return this.d;
    }

    public oa0 getListView() {
        return this.f27801b;
    }

    public f2.i0 getNeededLayoutManager() {
        tf.u0 u0Var = this.f27803f;
        if ((!u0Var.N() && u0Var.O == null) || (!u0Var.f44861u0 && u0Var.f44866x0 == null)) {
            return this.f27802c;
        }
        return this.d;
    }

    public boolean h() {
        return this instanceof nh.q2;
    }

    public final void o(boolean z4) {
        long j10;
        float computeVerticalScrollOffset;
        int i10;
        if (z4) {
            boolean g10 = g();
            if (!this.F) {
                this.E = true;
                oa0 oa0Var = this.f27801b;
                f2.v0 layoutManager = oa0Var.getLayoutManager();
                org.telegram.ui.br brVar = this.f27802c;
                if (layoutManager == brVar) {
                    if (g10) {
                        i10 = -100000;
                    } else {
                        i10 = 100000;
                    }
                    brVar.h1(0, i10);
                }
                if (getVisibility() == 8) {
                    this.J = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.v + AndroidUtilities.dp(12.0f));
                    } else {
                        computeVerticalScrollOffset = oa0Var.computeVerticalScrollOffset() + this.v;
                    }
                    oa0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.E = false;
        }
        this.F = z4;
        vp vpVar = this.G;
        AndroidUtilities.cancelRunOnUIThread(vpVar);
        o1.j jVar = this.H;
        if (jVar != null) {
            jVar.c();
        }
        org.telegram.ui.ActionBar.p2 p2Var = this.h;
        if (p2Var != null && p2Var.getFragmentBeginToShow()) {
            j10 = 0;
        } else {
            j10 = 100;
        }
        AndroidUtilities.runOnUIThread(vpVar, j10);
        if (z4) {
            m();
        } else {
            j();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    public final void p(ma0 ma0Var) {
        this.f27808x = ma0Var;
        oa0 listView = getListView();
        gg.v0 v0Var = new gg.v0(13, this, ma0Var);
        this.f27807w = v0Var;
        listView.setOnItemClickListener(v0Var);
        getListView().setOnTouchListener(new tr(this, 2));
    }

    @Override
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    public void setBackgroundDrawable(pg.b bVar) {
        this.O = bVar;
        bVar.p(AndroidUtilities.dp(22.0f));
        this.O.o(AndroidUtilities.dp(5.0f));
        c();
    }

    public void setDialogId(long j10) {
        tf.u0 u0Var = this.f27803f;
        if (u0Var.f44851n != j10) {
            u0Var.f44851n = j10;
        }
    }

    public void setIgnoreLayout(boolean z4) {
        this.D = z4;
    }

    public void setOverrideColor(int i10) {
        this.C = Integer.valueOf(i10);
        invalidate();
    }

    public void setReversed(boolean z4) {
        if (z4 != g()) {
            this.E = true;
            this.f27802c.k1(z4);
            tf.u0 u0Var = this.f27803f;
            if (u0Var.H0 != z4) {
                u0Var.H0 = z4;
                int i10 = u0Var.I0;
                if (i10 > 0) {
                    u0Var.m(0);
                }
                if (i10 > 1) {
                    u0Var.m(i10 - 1);
                }
            }
        }
    }

    public void i() {
    }

    public void j() {
    }

    public void k(TLRPC.BotInlineResult botInlineResult) {
    }

    public void l(boolean z4) {
    }

    public void m() {
    }

    public void n(boolean z4) {
    }
}

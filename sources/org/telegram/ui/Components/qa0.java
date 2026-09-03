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
public abstract class qa0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int R = 0;
    public Paint B;
    public Integer C;
    public boolean D;
    public boolean E;
    public boolean F;
    public final up G;
    public o1.j H;
    public boolean I;
    public float J;
    public boolean K;
    public int L;
    public ArrayList M;
    public final ma0 N;
    public pg.b O;
    public final Path P;
    public final RectF Q;
    public final org.telegram.ui.ActionBar.f6 f28126a;
    public final pa0 f28127b;
    public final org.telegram.ui.dr f28128c;
    public final ja0 d;
    public final tf.z0 e;
    public final tf.u0 f28129f;
    public final org.telegram.ui.ActionBar.p2 h;
    public float f28130n;
    public float f28131r;
    public float f28132s;
    public float v;
    public gg.v0 f28133w;
    public na0 f28134x;
    public final Rect f28135y;

    public qa0(Context context, long j10, long j11, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f28135y = new Rect();
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = new up(this, 27);
        this.I = false;
        this.J = 0.0f;
        this.K = false;
        this.N = new ma0(this);
        this.P = new Path();
        this.Q = new RectF();
        this.h = p2Var;
        this.f28126a = f6Var;
        setVisibility(8);
        setWillNotDraw(false);
        setClipToOutline(true);
        this.v = (int) Math.min(AndroidUtilities.dp(126.0f), AndroidUtilities.displaySize.y * 0.22f);
        pa0 pa0Var = new pa0(this, context, f6Var);
        this.f28127b = pa0Var;
        org.telegram.ui.dr drVar = new org.telegram.ui.dr((Object) this, 2);
        this.f28128c = drVar;
        drVar.j1(1);
        ja0 ja0Var = new ja0(this);
        this.d = ja0Var;
        ja0Var.O = new ka0(this);
        f2.l lVar = new f2.l();
        lVar.f5826c = 150L;
        lVar.e = 150L;
        lVar.f5827f = 150L;
        lVar.f5828g = 150L;
        lVar.d = 150L;
        lVar.f5762o = mr.f27122f;
        lVar.C = false;
        pa0Var.setItemAnimator(lVar);
        pa0Var.setClipToPadding(false);
        pa0Var.setLayoutManager(drVar);
        tf.u0 u0Var = new tf.u0(context, j10, j11, new la0(this, p2Var), f6Var, h());
        this.f28129f = u0Var;
        ?? o0Var = new f2.o0();
        o0Var.d = null;
        o0Var.f44987f = false;
        f2.d1 d1Var = new f2.d1(o0Var, 2);
        o0Var.f44986c = u0Var;
        u0Var.B(d1Var);
        this.e = o0Var;
        pa0Var.setAdapter(o0Var);
        pa0Var.setTranslationY(AndroidUtilities.dp(6.0f));
        addView(pa0Var, k7.b6.c(-1.0f, -1));
        setReversed(false);
    }

    public boolean a() {
        return true;
    }

    public final void b() {
        int i10;
        ja0 ja0Var;
        tf.u0 u0Var;
        int height;
        pa0 pa0Var = this.f28127b;
        if (pa0Var != null && this.f28128c != null) {
            boolean g10 = g();
            this.f28132s = 0.0f;
            tf.z0 z0Var = this.e;
            if (g10) {
                if (z0Var.f44987f) {
                    height = z0Var.e.getTop();
                } else {
                    height = getHeight();
                }
                float min = Math.min(Math.max(0.0f, pa0Var.getTranslationY() + height) + this.f28132s, (1.0f - this.J) * getHeight());
                this.f28130n = 0.0f;
                this.f28131r = min;
            } else {
                if (z0Var.f44987f) {
                    i10 = z0Var.e.getBottom();
                } else {
                    i10 = 0;
                }
                this.f28130n = Math.max(Math.max(0.0f, pa0Var.getTranslationY() + i10) - this.f28132s, this.J * getHeight());
                this.f28131r = getMeasuredHeight();
            }
            pg.b bVar = this.O;
            if (bVar != null) {
                bVar.setBounds(0, ((int) this.f28130n) - AndroidUtilities.dp(5.0f), getMeasuredWidth(), AndroidUtilities.dp(5.0f) + ((int) this.f28131r));
                Path path = this.P;
                path.rewind();
                Rect rect = this.O.h.f41239m;
                RectF rectF = this.Q;
                rectF.set(rect);
                if (pa0Var != null && (ja0Var = this.d) != null && pa0Var.getLayoutManager() == ja0Var && (u0Var = this.f28129f) != null && u0Var.O != null) {
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
        ja0 ja0Var;
        tf.u0 u0Var;
        pa0 pa0Var = this.f28127b;
        if (pa0Var != null && this.f28128c != null) {
            int i11 = 0;
            if (pa0Var != null && (ja0Var = this.d) != null && pa0Var.getLayoutManager() == ja0Var && (u0Var = this.f28129f) != null && u0Var.O != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (this.O == null) {
                pa0Var.setPadding(0, 0, 0, 0);
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
            pa0Var.setPadding(dp, i10, dp2, i11);
        }
    }

    public final float d() {
        if (getVisibility() != 0 || g()) {
            return 0.0f;
        }
        return getMeasuredHeight() - this.f28130n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            AndroidUtilities.forEachViews((RecyclerView) this.f28127b, (h5.d) new nh.e(9));
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
        tf.u0 u0Var = this.f28129f;
        if ((u0Var.N() || u0Var.O != null) && ((u0Var.f44923u0 || u0Var.f44928x0 != null) && u0Var.I() == null && u0Var.R == null)) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        this.f28132s = AndroidUtilities.dp(i10 + 2);
        canvas.save();
        float dp = AndroidUtilities.dp(6.0f);
        float f10 = this.f28130n;
        tf.z0 z0Var = this.e;
        pa0 pa0Var = this.f28127b;
        Rect rect = this.f28135y;
        if (g10) {
            if (z0Var.f44987f) {
                height = z0Var.e.getTop();
            } else {
                height = getHeight();
            }
            float min2 = Math.min(Math.max(0.0f, pa0Var.getTranslationY() + height) + this.f28132s, (1.0f - this.J) * getHeight());
            this.f28130n = 0.0f;
            int measuredWidth = getMeasuredWidth();
            this.f28131r = min2;
            rect.set(0, (int) 0.0f, measuredWidth, (int) min2);
            min = Math.min(dp, Math.abs(getMeasuredHeight() - this.f28131r));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.top -= (int) min;
            }
        } else {
            if (pa0Var.getLayoutManager() == this.d) {
                this.f28132s += AndroidUtilities.dp(2.0f);
                dp += AndroidUtilities.dp(2.0f);
            }
            if (z0Var.f44987f) {
                i11 = z0Var.e.getBottom();
            } else {
                i11 = 0;
            }
            float max = Math.max(0.0f, pa0Var.getTranslationY() + i11) - this.f28132s;
            this.f28130n = max;
            float max2 = Math.max(max, this.J * getHeight());
            this.f28130n = max2;
            int measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            this.f28131r = measuredHeight;
            rect.set(0, (int) max2, measuredWidth2, (int) measuredHeight);
            min = Math.min(dp, Math.abs(this.f28130n));
            if (min > 0.0f) {
                canvas.clipRect(0, 0, getWidth(), getHeight());
                rect.bottom += (int) min;
            }
        }
        if (Math.abs(f10 - this.f28130n) > 0.1f) {
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
            v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Sd, this.f28126a);
        }
        paint2.setColor(v02);
        f(canvas, rect, min);
        canvas.clipRect(rect);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public final float e() {
        if (getVisibility() == 0 && g()) {
            return this.f28131r;
        }
        return 0.0f;
    }

    public void f(Canvas canvas, Rect rect, float f10) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(rect);
        canvas.drawRoundRect(rectF, f10, f10, this.B);
    }

    public final boolean g() {
        f2.v0 layoutManager = this.f28127b.getLayoutManager();
        org.telegram.ui.dr drVar = this.f28128c;
        if (layoutManager == drVar && drVar.f5725t) {
            return true;
        }
        return false;
    }

    public tf.u0 getAdapter() {
        return this.f28129f;
    }

    public f2.i0 getCurrentLayoutManager() {
        f2.v0 layoutManager = this.f28127b.getLayoutManager();
        org.telegram.ui.dr drVar = this.f28128c;
        if (layoutManager == drVar) {
            return drVar;
        }
        return this.d;
    }

    public pa0 getListView() {
        return this.f28127b;
    }

    public f2.i0 getNeededLayoutManager() {
        tf.u0 u0Var = this.f28129f;
        if ((!u0Var.N() && u0Var.O == null) || (!u0Var.f44923u0 && u0Var.f44928x0 == null)) {
            return this.f28128c;
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
                pa0 pa0Var = this.f28127b;
                f2.v0 layoutManager = pa0Var.getLayoutManager();
                org.telegram.ui.dr drVar = this.f28128c;
                if (layoutManager == drVar) {
                    if (g10) {
                        i10 = -100000;
                    } else {
                        i10 = 100000;
                    }
                    drVar.h1(0, i10);
                }
                if (getVisibility() == 8) {
                    this.J = 1.0f;
                    if (g10) {
                        computeVerticalScrollOffset = -(this.v + AndroidUtilities.dp(12.0f));
                    } else {
                        computeVerticalScrollOffset = pa0Var.computeVerticalScrollOffset() + this.v;
                    }
                    pa0Var.setTranslationY(computeVerticalScrollOffset);
                }
            }
            setVisibility(0);
        } else {
            this.E = false;
        }
        this.F = z4;
        up upVar = this.G;
        AndroidUtilities.cancelRunOnUIThread(upVar);
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
        AndroidUtilities.runOnUIThread(upVar, j10);
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

    public final void p(na0 na0Var) {
        this.f28134x = na0Var;
        pa0 listView = getListView();
        gg.v0 v0Var = new gg.v0(13, this, na0Var);
        this.f28133w = v0Var;
        listView.setOnItemClickListener(v0Var);
        getListView().setOnTouchListener(new sr(this, 2));
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
        tf.u0 u0Var = this.f28129f;
        if (u0Var.f44913n != j10) {
            u0Var.f44913n = j10;
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
            this.f28128c.k1(z4);
            tf.u0 u0Var = this.f28129f;
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

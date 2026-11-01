package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class wf extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final vh.j D;
    public final Drawable E;
    public final Drawable F;
    public final vf G;
    public int H;
    public final RectF I;
    public final RectF J;
    public long K;
    public final Path L;
    public final float[] M;
    public final float[] N;
    public final t5 O;
    public wg.b P;
    public boolean Q;
    public vg.f R;
    public vg.f S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public vh.p2 f32225a;
    public boolean f32226a0;
    public vh.p2 f32227b;
    public final ChatActivityEnterView f32228b0;
    public ShapeDrawable f32229c;
    public final Drawable d;
    public final String e;
    public StaticLayout f32230f;
    public float h;
    public final TextPaint f32231n;
    public final Paint f32232r;
    public final Paint f32233s;
    public final Paint f32234w;
    public final Path f32235x;
    public final Paint f32236y;

    public wf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32228b0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f32231n = textPaint;
        this.f32232r = new Paint(1);
        this.f32233s = new Paint(1);
        Paint paint = new Paint(1);
        this.f32234w = paint;
        this.f32235x = new Path();
        this.f32236y = new Paint(1);
        this.I = new RectF();
        this.J = new RectF();
        this.L = new Path();
        this.M = r4;
        this.N = r3;
        this.O = new t5(this, 0L, 350L, gr.h);
        vf vfVar = new vf(this, this);
        this.G = vfVar;
        r0.h0.j(this, vfVar);
        vh.j jVar = new vh.j(5);
        this.D = jVar;
        jVar.setCallback(this);
        jVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.i0.N(1.7f));
        Drawable drawable = getResources().getDrawable(2131231640);
        chatActivityEnterView.V3 = drawable;
        org.telegram.ui.ActionBar.a7.y(this, drawable, org.telegram.ui.ActionBar.t6.Pe, chatActivityEnterView.W3, PorterDuff.Mode.MULTIPLY);
        this.f32229c = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(5.0f), chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.f20957eg));
        textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.d = context.getDrawable(2131232780);
        this.e = org.telegram.messenger.dd.L0(2131745330, "SlideUpToLock");
        float L = org.telegram.messenger.i0.L(3.0f);
        float[] fArr = {L, L, 0.0f, 0.0f, 0.0f, 0.0f, L, L};
        float[] fArr2 = {0.0f, 0.0f, r13, r13, r13, r13, 0.0f, 0.0f};
        float L2 = org.telegram.messenger.i0.L(3.0f);
        this.E = getResources().getDrawable(2131231507).mutate();
        this.F = getResources().getDrawable(2131231515).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public final void a() {
        vh.p2 p2Var = this.f32225a;
        if (p2Var != null) {
            p2Var.f51755l0 = new uf(this, p2Var, 1);
            p2Var.e(true);
            this.f32225a = null;
        }
        vh.p2 p2Var2 = this.f32227b;
        if (p2Var2 != null) {
            p2Var2.f51755l0 = new uf(this, p2Var2, 2);
            p2Var2.e(true);
            this.f32227b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        vh.p2 p2Var = new vh.p2(getContext(), 2);
        this.f32227b = p2Var;
        p2Var.l(1.0f, 0.0f);
        this.f32227b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.f32228b0;
        if (chatActivityEnterView.f23689c1) {
            if (chatActivityEnterView.O) {
                i10 = 2131743608;
            } else {
                i10 = 2131743609;
            }
        } else if (chatActivityEnterView.O) {
            i10 = 2131743536;
        } else {
            i10 = 2131743537;
        }
        this.f32227b.s(org.telegram.messenger.i0.W2(org.telegram.messenger.dd.L0(i10, null)));
        vh.p2 p2Var2 = this.f32227b;
        p2Var2.h = vh.p2.a(p2Var2.getText(), this.f32227b.getTextPaint());
        if (chatActivityEnterView.O) {
            vh.p2 p2Var3 = this.f32227b;
            p2Var3.getClass();
            ci0 ci0Var = new ci0(2131624020, org.telegram.messenger.i0.L(34.0f), org.telegram.messenger.i0.L(34.0f));
            ci0Var.start();
            p2Var3.j(ci0Var);
        } else {
            org.telegram.messenger.wp.d1().edit().putInt("voiceoncehint", org.telegram.messenger.wp.d1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f32227b, w7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        vh.p2 p2Var4 = this.f32227b;
        p2Var4.f51755l0 = new uf(this, p2Var4, 0);
        p2Var4.u();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.G.f(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wf.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(250.0f);
        if (this.H != size) {
            this.H = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.f32231n, org.telegram.messenger.i0.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f32230f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f32230f.getLineWidth(i12);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final boolean onSetAlpha(int i10) {
        return super.onSetAlpha(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ChatActivityEnterView chatActivityEnterView = this.f32228b0;
        RectF rectF = chatActivityEnterView.S3;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        if (action == 0) {
            if (chatActivityEnterView.f23788s4) {
                this.f32226a0 = rectF.contains(x10, y3);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f23757n4 > 0.1f) {
                this.W = rectF2.contains(x10, y3);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f32226a0 && rectF.contains(x10, y3)) {
                if (chatActivityEnterView.f23689c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23738k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Z2.X0();
                } else {
                    tf tfVar = new tf(this, 0);
                    vh.p2 p2Var = this.f32225a;
                    if (p2Var != null && p2Var.V) {
                        a();
                    }
                    oj0 oj0Var = chatActivityEnterView.f23720h1;
                    if (oj0Var != null) {
                        oj0Var.setPlaying(false);
                    }
                    if (MediaController.B().K() && (chatActivityEnterView.f23720h1.getAudioLeft() > 0.01f || chatActivityEnterView.f23720h1.getAudioRight() < 0.99f)) {
                        cd cdVar = new cd(4, this, tfVar);
                        if (org.telegram.messenger.wp.d1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), chatActivityEnterView.W3);
                            String L0 = org.telegram.messenger.dd.L0(2131746363, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                            x1Var.R = L0;
                            x1Var.T = org.telegram.messenger.dd.L0(2131746364, null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), new t(cdVar, 19));
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                            alertDialog$Builder.p();
                        } else {
                            cdVar.run();
                        }
                    } else {
                        tfVar.run();
                    }
                }
                this.W = false;
                this.f32226a0 = false;
                return true;
            } else if (this.W && rectF2.contains(x10, y3)) {
                boolean z10 = !chatActivityEnterView.O;
                chatActivityEnterView.O = z10;
                this.D.d(1, z10, true);
                org.telegram.messenger.vi b02 = org.telegram.messenger.vi.b0(chatActivityEnterView.Q);
                long j11 = chatActivityEnterView.Q2;
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                if (unVar != null && unVar.f42256v4) {
                    j10 = unVar.b();
                } else {
                    j10 = 0;
                }
                b02.e2(j11, j10, chatActivityEnterView.O);
                if (chatActivityEnterView.O) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.W = false;
                this.f32226a0 = false;
                return true;
            } else {
                this.W = false;
                this.f32226a0 = false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.W = false;
            this.f32226a0 = false;
        }
        if (!this.f32226a0 && !this.W) {
            return false;
        }
        return true;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setBlurredBackgroundFactory(tg.b bVar) {
        this.Q = true;
        if (this.P == null) {
            this.P = new wg.b(org.telegram.ui.ActionBar.t6.Oe, this.f32228b0.W3);
        }
        vg.f c10 = bVar.c(this, this.P, false);
        this.R = c10;
        c10.q(org.telegram.messenger.i0.L(18.0f));
        this.R.p(org.telegram.messenger.i0.L(3.0f));
        vg.f c11 = bVar.c(this, this.P, false);
        this.S = c11;
        c11.q(org.telegram.messenger.i0.L(18.0f));
        this.S.p(org.telegram.messenger.i0.L(3.0f));
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        int i10;
        int i11;
        int i12;
        int i13;
        vh.j jVar = this.D;
        if (jVar != null && (textPaint = this.f32231n) != null && (drawable = this.E) != null && (drawable2 = this.F) != null) {
            wg.b bVar = this.P;
            if (bVar != null) {
                bVar.d();
            }
            vg.f fVar = this.R;
            if (fVar != null) {
                fVar.updateColors();
            }
            vg.f fVar2 = this.S;
            if (fVar2 != null) {
                fVar2.updateColors();
            }
            if (this.Q) {
                i10 = org.telegram.ui.ActionBar.t6.Kl;
            } else {
                i10 = org.telegram.ui.ActionBar.t6.Ne;
            }
            ChatActivityEnterView chatActivityEnterView = this.f32228b0;
            jVar.e(chatActivityEnterView.e0(i10), chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Rf), -1);
            textPaint.setColor(chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.f20940dg));
            ShapeDrawable shapeDrawable = this.f32229c;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.t6.C1(chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.f20957eg), shapeDrawable);
            } else {
                this.f32229c = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(5.0f), chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.f20957eg));
            }
            int e02 = chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.f20957eg);
            Drawable drawable3 = this.d;
            if (drawable3 != null && e02 != this.T) {
                this.T = e02;
                drawable3.setColorFilter(new PorterDuffColorFilter(e02, PorterDuff.Mode.SRC_IN));
            }
            this.f32232r.setColor(chatActivityEnterView.e0(org.telegram.ui.ActionBar.t6.Oe));
            if (this.Q) {
                i11 = org.telegram.ui.ActionBar.t6.Kl;
            } else {
                i11 = org.telegram.ui.ActionBar.t6.Ne;
            }
            this.f32233s.setColor(chatActivityEnterView.e0(i11));
            if (this.Q) {
                i12 = org.telegram.ui.ActionBar.t6.Kl;
            } else {
                i12 = org.telegram.ui.ActionBar.t6.Ne;
            }
            this.f32234w.setColor(chatActivityEnterView.e0(i12));
            if (this.Q) {
                i13 = org.telegram.ui.ActionBar.t6.Kl;
            } else {
                i13 = org.telegram.ui.ActionBar.t6.Ne;
            }
            int e03 = chatActivityEnterView.e0(i13);
            if (!this.V || e03 != this.U) {
                this.V = true;
                this.U = e03;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(e03, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(e03, mode));
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.D && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

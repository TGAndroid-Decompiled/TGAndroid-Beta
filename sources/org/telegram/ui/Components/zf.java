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
public final class zf extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final fi.l D;
    public final Drawable E;
    public final Drawable F;
    public final yf G;
    public int H;
    public final RectF I;
    public final RectF J;
    public long K;
    public final Path L;
    public final float[] M;
    public final float[] N;
    public final v5 O;
    public gh.b P;
    public boolean Q;
    public fh.g R;
    public fh.g S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public fi.m3 f40932a;
    public boolean f40933a0;
    public fi.m3 f40934b;
    public final ChatActivityEnterView f40935b0;
    public ShapeDrawable f40936c;
    public final Drawable d;
    public final String f40937e;
    public StaticLayout f40938f;
    public float h;
    public final TextPaint f40939n;
    public final Paint f40940r;
    public final Paint f40941s;
    public final Paint f40942w;
    public final Path f40943x;
    public final Paint f40944y;

    public zf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f40935b0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f40939n = textPaint;
        this.f40940r = new Paint(1);
        this.f40941s = new Paint(1);
        Paint paint = new Paint(1);
        this.f40942w = paint;
        this.f40943x = new Path();
        this.f40944y = new Paint(1);
        this.I = new RectF();
        this.J = new RectF();
        this.L = new Path();
        this.M = r4;
        this.N = r3;
        this.O = new v5(this, 0L, 350L, wq.h);
        yf yfVar = new yf(this, this);
        this.G = yfVar;
        r0.i0.j(this, yfVar);
        fi.l lVar = new fi.l(5);
        this.D = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        Drawable drawable = getResources().getDrawable(2131231641);
        chatActivityEnterView.V3 = drawable;
        org.telegram.ui.ActionBar.t6.x(this, drawable, org.telegram.ui.ActionBar.m6.Pe, chatActivityEnterView.W3, PorterDuff.Mode.MULTIPLY);
        this.f40936c = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.f27918eg));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.d = context.getDrawable(2131232783);
        this.f40937e = org.telegram.messenger.id.M0(2131745312, "SlideUpToLock");
        float L = org.telegram.messenger.g0.L(3.0f);
        float[] fArr = {L, L, 0.0f, 0.0f, 0.0f, 0.0f, L, L};
        float[] fArr2 = {0.0f, 0.0f, r13, r13, r13, r13, 0.0f, 0.0f};
        float L2 = org.telegram.messenger.g0.L(3.0f);
        this.E = getResources().getDrawable(2131231506).mutate();
        this.F = getResources().getDrawable(2131231514).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public final void a() {
        fi.m3 m3Var = this.f40932a;
        if (m3Var != null) {
            m3Var.f12438q0 = new xf(this, m3Var, 1);
            m3Var.f(true);
            this.f40932a = null;
        }
        fi.m3 m3Var2 = this.f40934b;
        if (m3Var2 != null) {
            m3Var2.f12438q0 = new xf(this, m3Var2, 2);
            m3Var2.f(true);
            this.f40934b = null;
        }
    }

    public final void b() {
        int i7;
        a();
        fi.m3 m3Var = new fi.m3(getContext(), 2);
        this.f40934b = m3Var;
        m3Var.o(1.0f, 0.0f);
        fi.m3 m3Var2 = this.f40934b;
        ChatActivityEnterView chatActivityEnterView = this.f40935b0;
        chatActivityEnterView.setHintGlass(m3Var2);
        this.f40934b.r(true);
        if (chatActivityEnterView.f31045c1) {
            if (chatActivityEnterView.O) {
                i7 = 2131743582;
            } else {
                i7 = 2131743583;
            }
        } else if (chatActivityEnterView.O) {
            i7 = 2131743510;
        } else {
            i7 = 2131743511;
        }
        this.f40934b.u(org.telegram.messenger.g0.X2(org.telegram.messenger.id.M0(i7, null)));
        fi.m3 m3Var3 = this.f40934b;
        m3Var3.h = fi.m3.a(m3Var3.getText(), this.f40934b.getTextPaint());
        if (chatActivityEnterView.O) {
            fi.m3 m3Var4 = this.f40934b;
            m3Var4.getClass();
            zg0 zg0Var = new zg0(2131624020, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
            zg0Var.start();
            m3Var4.m(zg0Var);
        } else {
            org.telegram.messenger.qp.e1().edit().putInt("voiceoncehint", org.telegram.messenger.qp.e1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f40934b, c8.ha.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        fi.m3 m3Var5 = this.f40934b;
        m3Var5.f12438q0 = new xf(this, m3Var5, 0);
        m3Var5.w();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zf.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(250.0f);
        if (this.H != size) {
            this.H = size;
            StaticLayout staticLayout = new StaticLayout(this.f40937e, this.f40939n, org.telegram.messenger.g0.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f40938f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i11 = 0; i11 < lineCount; i11++) {
                float lineWidth = this.f40938f.getLineWidth(i11);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final boolean onSetAlpha(int i7) {
        return super.onSetAlpha(i7);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j3;
        ChatActivityEnterView chatActivityEnterView = this.f40935b0;
        RectF rectF = chatActivityEnterView.S3;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        if (action == 0) {
            if (chatActivityEnterView.f31143s4) {
                this.f40933a0 = rectF.contains(x10, y10);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f31112n4 > 0.1f) {
                this.W = rectF2.contains(x10, y10);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f40933a0 && rectF.contains(x10, y10)) {
                if (chatActivityEnterView.f31045c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31093k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Z2.c1();
                } else {
                    wf wfVar = new wf(this, 0);
                    fi.m3 m3Var = this.f40932a;
                    if (m3Var != null && m3Var.V) {
                        a();
                    }
                    ji0 ji0Var = chatActivityEnterView.f31076h1;
                    if (ji0Var != null) {
                        ji0Var.setPlaying(false);
                    }
                    if (MediaController.B().K() && (chatActivityEnterView.f31076h1.getAudioLeft() > 0.01f || chatActivityEnterView.f31076h1.getAudioRight() < 0.99f)) {
                        org.telegram.ui.fq fqVar = new org.telegram.ui.fq(11, this, wfVar);
                        if (org.telegram.messenger.qp.e1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), chatActivityEnterView.W3);
                            String M0 = org.telegram.messenger.id.M0(2131746348, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                            u1Var.R = M0;
                            u1Var.T = org.telegram.messenger.id.M0(2131746349, null);
                            alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), new t(fqVar, 19));
                            alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                        } else {
                            fqVar.run();
                        }
                    } else {
                        wfVar.run();
                    }
                }
                this.W = false;
                this.f40933a0 = false;
                return true;
            } else if (this.W && rectF2.contains(x10, y10)) {
                boolean z9 = !chatActivityEnterView.O;
                chatActivityEnterView.O = z9;
                this.D.d(1, z9, true);
                org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(chatActivityEnterView.Q);
                long j10 = chatActivityEnterView.Q2;
                org.telegram.ui.cn cnVar = chatActivityEnterView.P2;
                if (cnVar != null && cnVar.f44693v4) {
                    j3 = cnVar.b();
                } else {
                    j3 = 0;
                }
                b02.e2(j10, j3, chatActivityEnterView.O);
                if (chatActivityEnterView.O) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.W = false;
                this.f40933a0 = false;
                return true;
            } else {
                this.W = false;
                this.f40933a0 = false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.W = false;
            this.f40933a0 = false;
        }
        if (!this.f40933a0 && !this.W) {
            return false;
        }
        return true;
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setBlurredBackgroundFactory(dh.c cVar) {
        this.Q = true;
        if (this.P == null) {
            this.P = new gh.b(org.telegram.ui.ActionBar.m6.Oe, this.f40935b0.W3);
        }
        fh.g c10 = cVar.c(this, this.P, false);
        this.R = c10;
        c10.r(org.telegram.messenger.g0.L(18.0f));
        this.R.q(org.telegram.messenger.g0.L(3.0f));
        fh.g c11 = cVar.c(this, this.P, false);
        this.S = c11;
        c11.r(org.telegram.messenger.g0.L(18.0f));
        this.S.q(org.telegram.messenger.g0.L(3.0f));
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        int i7;
        int i10;
        int i11;
        int i12;
        fi.l lVar = this.D;
        if (lVar != null && (textPaint = this.f40939n) != null && (drawable = this.E) != null && (drawable2 = this.F) != null) {
            gh.b bVar = this.P;
            if (bVar != null) {
                bVar.d();
            }
            fh.g gVar = this.R;
            if (gVar != null) {
                gVar.updateColors();
            }
            fh.g gVar2 = this.S;
            if (gVar2 != null) {
                gVar2.updateColors();
            }
            if (this.Q) {
                i7 = org.telegram.ui.ActionBar.m6.Kl;
            } else {
                i7 = org.telegram.ui.ActionBar.m6.Ne;
            }
            ChatActivityEnterView chatActivityEnterView = this.f40935b0;
            lVar.e(chatActivityEnterView.f0(i7), chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.Rf), -1);
            textPaint.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.f27899dg));
            ShapeDrawable shapeDrawable = this.f40936c;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.m6.C1(chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.f27918eg), shapeDrawable);
            } else {
                this.f40936c = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.f27918eg));
            }
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.f27918eg);
            Drawable drawable3 = this.d;
            if (drawable3 != null && f02 != this.T) {
                this.T = f02;
                drawable3.setColorFilter(new PorterDuffColorFilter(f02, PorterDuff.Mode.SRC_IN));
            }
            this.f40940r.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.m6.Oe));
            if (this.Q) {
                i10 = org.telegram.ui.ActionBar.m6.Kl;
            } else {
                i10 = org.telegram.ui.ActionBar.m6.Ne;
            }
            this.f40941s.setColor(chatActivityEnterView.f0(i10));
            if (this.Q) {
                i11 = org.telegram.ui.ActionBar.m6.Kl;
            } else {
                i11 = org.telegram.ui.ActionBar.m6.Ne;
            }
            this.f40942w.setColor(chatActivityEnterView.f0(i11));
            if (this.Q) {
                i12 = org.telegram.ui.ActionBar.m6.Kl;
            } else {
                i12 = org.telegram.ui.ActionBar.m6.Ne;
            }
            int f03 = chatActivityEnterView.f0(i12);
            if (!this.V || f03 != this.U) {
                this.V = true;
                this.U = f03;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(f03, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(f03, mode));
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

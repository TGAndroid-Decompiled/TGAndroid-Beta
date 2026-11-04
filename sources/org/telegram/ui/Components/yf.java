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
public final class yf extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final gi.l E;
    public final Drawable F;
    public final Drawable G;
    public final xf H;
    public int I;
    public final RectF J;
    public final RectF K;
    public long L;
    public final Path M;
    public final float[] N;
    public final float[] O;
    public final u5 P;
    public hh.b Q;
    public boolean R;
    public gh.g S;
    public gh.g T;
    public int U;
    public int V;
    public boolean W;
    public gi.l3 f40693a;
    public boolean f40694a0;
    public gi.l3 f40695b;
    public boolean f40696b0;
    public ShapeDrawable f40697c;
    public final ChatActivityEnterView f40698c0;
    public final Drawable d;
    public final String f40699e;
    public StaticLayout f40700f;
    public float h;
    public final TextPaint f40701n;
    public final Paint f40702r;
    public final Paint f40703s;
    public final Paint f40704w;
    public final Path f40705x;
    public final Paint f40706y;

    public yf(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f40698c0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f40701n = textPaint;
        this.f40702r = new Paint(1);
        this.f40703s = new Paint(1);
        Paint paint = new Paint(1);
        this.f40704w = paint;
        this.f40705x = new Path();
        this.f40706y = new Paint(1);
        this.J = new RectF();
        this.K = new RectF();
        this.M = new Path();
        this.N = r4;
        this.O = r3;
        this.P = new u5(this, 0L, 350L, xq.h);
        xf xfVar = new xf(this, this);
        this.H = xfVar;
        r0.i0.j(this, xfVar);
        gi.l lVar = new gi.l(5);
        this.E = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.P, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.7f));
        Drawable drawable = getResources().getDrawable(2131231641);
        chatActivityEnterView.W3 = drawable;
        org.telegram.ui.ActionBar.r6.y(this, drawable, org.telegram.ui.ActionBar.k6.Pe, chatActivityEnterView.X3, PorterDuff.Mode.MULTIPLY);
        this.f40697c = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f27907eg));
        textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.d = context.getDrawable(2131232781);
        this.f40699e = org.telegram.messenger.bd.M0(2131745322, "SlideUpToLock");
        float L = org.telegram.messenger.g0.L(3.0f);
        float[] fArr = {L, L, 0.0f, 0.0f, 0.0f, 0.0f, L, L};
        float[] fArr2 = {0.0f, 0.0f, r13, r13, r13, r13, 0.0f, 0.0f};
        float L2 = org.telegram.messenger.g0.L(3.0f);
        this.F = getResources().getDrawable(2131231506).mutate();
        this.G = getResources().getDrawable(2131231514).mutate();
        setWillNotDraw(false);
        updateColors();
    }

    public final void a() {
        gi.l3 l3Var = this.f40693a;
        if (l3Var != null) {
            l3Var.f13100r0 = new wf(this, l3Var, 1);
            l3Var.f(true);
            this.f40693a = null;
        }
        gi.l3 l3Var2 = this.f40695b;
        if (l3Var2 != null) {
            l3Var2.f13100r0 = new wf(this, l3Var2, 2);
            l3Var2.f(true);
            this.f40695b = null;
        }
    }

    public final void b() {
        int i3;
        a();
        gi.l3 l3Var = new gi.l3(getContext(), 2);
        this.f40695b = l3Var;
        l3Var.o(1.0f, 0.0f);
        gi.l3 l3Var2 = this.f40695b;
        ChatActivityEnterView chatActivityEnterView = this.f40698c0;
        chatActivityEnterView.setHintGlass(l3Var2);
        this.f40695b.r(true);
        if (chatActivityEnterView.f31104d1) {
            if (chatActivityEnterView.P) {
                i3 = 2131743592;
            } else {
                i3 = 2131743593;
            }
        } else if (chatActivityEnterView.P) {
            i3 = 2131743520;
        } else {
            i3 = 2131743521;
        }
        this.f40695b.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(i3, null)));
        gi.l3 l3Var3 = this.f40695b;
        l3Var3.h = gi.l3.a(l3Var3.getText(), this.f40695b.getTextPaint());
        if (chatActivityEnterView.P) {
            gi.l3 l3Var4 = this.f40695b;
            l3Var4.getClass();
            ch0 ch0Var = new ch0(2131624020, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
            ch0Var.start();
            l3Var4.m(ch0Var);
        } else {
            org.telegram.messenger.hp.e1().edit().putInt("voiceoncehint", org.telegram.messenger.hp.e1().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f40695b, b8.mf.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        gi.l3 l3Var5 = this.f40695b;
        l3Var5.f13100r0 = new wf(this, l3Var5, 0);
        l3Var5.w();
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.H.f(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yf.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        int L = org.telegram.messenger.g0.L(250.0f);
        if (this.I != size) {
            this.I = size;
            StaticLayout staticLayout = new StaticLayout(this.f40699e, this.f40701n, org.telegram.messenger.g0.L(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f40700f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i11 = 0; i11 < lineCount; i11++) {
                float lineWidth = this.f40700f.getLineWidth(i11);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(L, 1073741824));
    }

    @Override
    public final boolean onSetAlpha(int i3) {
        return super.onSetAlpha(i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ChatActivityEnterView chatActivityEnterView = this.f40698c0;
        RectF rectF = chatActivityEnterView.T3;
        int x10 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.K;
        if (action == 0) {
            if (chatActivityEnterView.f31202t4) {
                this.f40696b0 = rectF.contains(x10, y9);
            }
            if (chatActivityEnterView.Q && chatActivityEnterView.O1 != null && chatActivityEnterView.f31171o4 > 0.1f) {
                this.f40694a0 = rectF2.contains(x10, y9);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f40696b0 && rectF.contains(x10, y9)) {
                if (chatActivityEnterView.f31104d1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f31152l1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.f31087a3.Z0();
                } else {
                    vf vfVar = new vf(this, 0);
                    gi.l3 l3Var = this.f40693a;
                    if (l3Var != null && l3Var.W) {
                        a();
                    }
                    mi0 mi0Var = chatActivityEnterView.f31136i1;
                    if (mi0Var != null) {
                        mi0Var.setPlaying(false);
                    }
                    if (MediaController.B().K() && (chatActivityEnterView.f31136i1.getAudioLeft() > 0.01f || chatActivityEnterView.f31136i1.getAudioRight() < 0.99f)) {
                        org.telegram.ui.lo loVar = new org.telegram.ui.lo(15, this, vfVar);
                        if (org.telegram.messenger.hp.e1().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), chatActivityEnterView.X3);
                            String M0 = org.telegram.messenger.bd.M0(2131746356, null);
                            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                            s1Var.S = M0;
                            s1Var.U = org.telegram.messenger.bd.M0(2131746357, null);
                            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new t(loVar, 19));
                            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            alertDialog$Builder.p();
                        } else {
                            loVar.run();
                        }
                    } else {
                        vfVar.run();
                    }
                }
                this.f40694a0 = false;
                this.f40696b0 = false;
                return true;
            } else if (this.f40694a0 && rectF2.contains(x10, y9)) {
                boolean z10 = !chatActivityEnterView.P;
                chatActivityEnterView.P = z10;
                this.E.d(1, z10, true);
                org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(chatActivityEnterView.R);
                long j11 = chatActivityEnterView.R2;
                org.telegram.ui.wm wmVar = chatActivityEnterView.Q2;
                if (wmVar != null && wmVar.f51525w4) {
                    j10 = wmVar.b();
                } else {
                    j10 = 0;
                }
                b02.e2(j11, j10, chatActivityEnterView.P);
                if (chatActivityEnterView.P) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.f40694a0 = false;
                this.f40696b0 = false;
                return true;
            } else {
                this.f40694a0 = false;
                this.f40696b0 = false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.f40694a0 = false;
            this.f40696b0 = false;
        }
        if (!this.f40696b0 && !this.f40694a0) {
            return false;
        }
        return true;
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setBlurredBackgroundFactory(eh.c cVar) {
        this.R = true;
        if (this.Q == null) {
            this.Q = new hh.b(org.telegram.ui.ActionBar.k6.Oe, this.f40698c0.X3);
        }
        gh.g c2 = cVar.c(this, this.Q, false);
        this.S = c2;
        c2.r(org.telegram.messenger.g0.L(18.0f));
        this.S.q(org.telegram.messenger.g0.L(3.0f));
        gh.g c10 = cVar.c(this, this.Q, false);
        this.T = c10;
        c10.r(org.telegram.messenger.g0.L(18.0f));
        this.T.q(org.telegram.messenger.g0.L(3.0f));
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        int i3;
        int i10;
        int i11;
        int i12;
        gi.l lVar = this.E;
        if (lVar != null && (textPaint = this.f40701n) != null && (drawable = this.F) != null && (drawable2 = this.G) != null) {
            hh.b bVar = this.Q;
            if (bVar != null) {
                bVar.d();
            }
            gh.g gVar = this.S;
            if (gVar != null) {
                gVar.updateColors();
            }
            gh.g gVar2 = this.T;
            if (gVar2 != null) {
                gVar2.updateColors();
            }
            if (this.R) {
                i3 = org.telegram.ui.ActionBar.k6.Kl;
            } else {
                i3 = org.telegram.ui.ActionBar.k6.Ne;
            }
            ChatActivityEnterView chatActivityEnterView = this.f40698c0;
            lVar.e(chatActivityEnterView.f0(i3), chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Rf), -1);
            textPaint.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f27888dg));
            ShapeDrawable shapeDrawable = this.f40697c;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.C1(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f27907eg), shapeDrawable);
            } else {
                this.f40697c = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f27907eg));
            }
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f27907eg);
            Drawable drawable3 = this.d;
            if (drawable3 != null && f02 != this.U) {
                this.U = f02;
                drawable3.setColorFilter(new PorterDuffColorFilter(f02, PorterDuff.Mode.SRC_IN));
            }
            this.f40702r.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.Oe));
            if (this.R) {
                i10 = org.telegram.ui.ActionBar.k6.Kl;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Ne;
            }
            this.f40703s.setColor(chatActivityEnterView.f0(i10));
            if (this.R) {
                i11 = org.telegram.ui.ActionBar.k6.Kl;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Ne;
            }
            this.f40704w.setColor(chatActivityEnterView.f0(i11));
            if (this.R) {
                i12 = org.telegram.ui.ActionBar.k6.Kl;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.Ne;
            }
            int f03 = chatActivityEnterView.f0(i12);
            if (!this.W || f03 != this.V) {
                this.W = true;
                this.V = f03;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(f03, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(f03, mode));
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

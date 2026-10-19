package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class z20 extends FrameLayout implements org.telegram.ui.Components.voip.n0 {
    public final TextPaint E;
    public final org.telegram.ui.jd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.o0 I;
    public final org.telegram.ui.Cells.b4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final a30 P;
    public final h9 f32811a;
    public TLRPC.User f32812b;
    public TLRPC.Chat f32813c;
    public final w9 d;
    public long e;
    public ChatObject.VideoParticipant f32814f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f32815n;
    public final Paint f32816r;
    public float f32817s;
    public org.telegram.ui.Components.voip.t v;
    public String f32818w;
    public String f32819x;
    public int f32820y;

    public z20(a30 a30Var, Context context) {
        super(context);
        this.P = a30Var;
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f32811a = h9Var;
        Paint paint = new Paint(1);
        this.f32815n = paint;
        Paint paint2 = new Paint(1);
        this.f32816r = paint2;
        this.f32817s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.b4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        h9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var, w7.z5.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21293tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21234qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.jd jdVar = new org.telegram.ui.jd(this, context, 1);
        this.F = jdVar;
        jdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(jdVar, w7.z5.c(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f32816r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z10) {
        a30 a30Var = this.P;
        if (!a30Var.f24472r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.t.c(a30Var.h, a30Var.f24471n, null, this, null, this.f32814f, a30Var.f24469c, a30Var.f24472r);
            } else if (!z10) {
                org.telegram.ui.Components.voip.t tVar = this.v;
                if (tVar != null) {
                    tVar.setSecondaryView(null);
                }
                this.v = null;
            }
        }
    }

    public final void c(Canvas canvas) {
        if (this.f32818w != null) {
            canvas.save();
            int A = org.telegram.messenger.kk.A(24.0f, getMeasuredWidth() - this.f32820y, 2);
            int alpha = (int) (getAlpha() * this.f32817s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f32818w, AndroidUtilities.dp(22.0f) + A, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(A, AndroidUtilities.dp(53.0f));
            org.telegram.ui.jd jdVar = this.F;
            if (jdVar.getDrawable() != null) {
                jdVar.getDrawable().setAlpha((int) (getAlpha() * this.f32817s * 255.0f));
                jdVar.draw(canvas);
                jdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z20.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.f31758b && !tVar.f31777r && tVar.v && tVar.f31756a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.P.f24472r.F2) {
            d(canvas);
            return;
        }
        if (this.f32817s > 0.0f) {
            float measuredWidth = (1.0f - this.f32817s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f32815n);
            d(canvas);
        }
        w9 w9Var = this.d;
        float x10 = w9Var.getX() + (w9Var.getMeasuredWidth() / 2);
        float y3 = w9Var.getY() + (w9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.b4 b4Var = this.J;
        b4Var.f();
        b4Var.a(canvas, x10, y3, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f7 = this.f32817s;
        float f10 = (f7 * 1.0f) + ((1.0f - f7) * dp);
        w9Var.setScaleX(b4Var.b() * f10);
        w9Var.setScaleY(b4Var.b() * f10);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.F) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(ChatObject.VideoParticipant videoParticipant, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z10;
        float f7;
        a30 a30Var = this.P;
        int i10 = a30Var.d;
        this.f32814f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        int i11 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
        boolean z11 = true;
        w9 w9Var = this.d;
        h9 h9Var = this.f32811a;
        if (i11 > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.f32812b = user;
            this.f32813c = null;
            h9Var.m(i10, user);
            this.f32819x = UserObject.getFirstName(this.f32812b);
            w9Var.getImageReceiver().setCurrentAccount(i10);
            w9Var.h(ImageLocation.getForUser(this.f32812b, 1), "50_50", h9Var, this.f32812b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.f32813c = chat;
            this.f32812b = null;
            h9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f32813c;
            if (chat2 != null) {
                this.f32819x = chat2.title;
                w9Var.getImageReceiver().setCurrentAccount(i10);
                w9Var.h(ImageLocation.getForChat(this.f32813c, 1), "50_50", h9Var, this.f32813c);
            }
        }
        if (j10 == this.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (a30Var.f24471n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = a30Var.f24471n.e;
            if (videoParticipant2 != null) {
                this.H = videoParticipant2.equals(videoParticipant);
            } else {
                this.H = false;
            }
        }
        if (!z10) {
            if (this.H) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            setSelectedProgress(f7);
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.I;
        if (o0Var != null) {
            o0Var.h = groupCallParticipant;
            o0Var.c(z10);
            f(z10);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z20.f(boolean):void");
    }

    public w9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.e;
    }

    public float getProgressToFullscreen() {
        return this.f32817s;
    }

    public org.telegram.ui.Components.voip.t getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f32814f;
    }

    @Override
    public final void invalidate() {
        if (this.O) {
            return;
        }
        this.O = true;
        super.invalidate();
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null) {
            tVar.invalidate();
        } else {
            this.P.f24471n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a30 a30Var = this.P;
        org.telegram.ui.q50 q50Var = a30Var.f24472r;
        if (a30Var.f24473s && this.f32814f != null) {
            b(true);
        }
        this.K = true;
        if (q50Var.f40450t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.o0) i2.e.A(1, q50Var.f40450t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.o0();
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.I;
        o0Var.f31653g = this;
        o0Var.f31651c = this.F;
        o0Var.c(false);
        org.telegram.ui.Components.voip.o0 o0Var2 = this.I;
        o0Var2.h = this.h;
        o0Var2.c(false);
        f(false);
        boolean z10 = this.I.e;
        org.telegram.ui.Cells.b4 b4Var = this.J;
        b4Var.e(this, z10);
        if (!this.I.e) {
            b4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.o0 o0Var = this.I;
        if (o0Var != null) {
            this.P.f24472r.f40450t2.add(o0Var);
            org.telegram.ui.Components.voip.o0 o0Var2 = this.I;
            o0Var2.f31651c = null;
            o0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f32819x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f32819x));
            this.f32820y = min;
            this.f32818w = TextUtils.ellipsize(this.f32819x, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.o0 o0Var = this.I;
        if (o0Var != null) {
            o0Var.a(d);
        }
        this.J.c(d);
    }

    public void setProgressToFullscreen(float f7) {
        if (this.f32817s != f7) {
            this.f32817s = f7;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            Paint paint = this.f32815n;
            w9 w9Var = this.d;
            if (i10 == 0) {
                w9Var.setTranslationY(0.0f);
                w9Var.setScaleX(1.0f);
                w9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.t tVar = this.v;
                if (tVar != null) {
                    tVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((w9Var.getMeasuredHeight() / 2.0f) + w9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f10 = 1.0f - f7;
            float f11 = 1.0f * f7;
            float dp = f11 + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f10);
            w9Var.setTranslationY((-measuredHeight) * f10);
            w9Var.setScaleX(dp);
            w9Var.setScaleY(dp);
            paint.setAlpha((int) (f7 * 255.0f));
            invalidate();
            org.telegram.ui.Components.voip.t tVar2 = this.v;
            if (tVar2 != null) {
                tVar2.invalidate();
            }
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.t tVar) {
        this.v = tVar;
    }
}

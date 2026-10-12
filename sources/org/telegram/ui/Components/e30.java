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
public final class e30 extends FrameLayout implements org.telegram.ui.Components.voip.n0 {
    public final TextPaint E;
    public final org.telegram.ui.pd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.o0 I;
    public final org.telegram.ui.Cells.c4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final f30 P;
    public final k9 f24573a;
    public TLRPC.User f24574b;
    public TLRPC.Chat f24575c;
    public final z9 d;
    public long e;
    public ChatObject.VideoParticipant f24576f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f24577n;
    public final Paint f24578r;
    public float f24579s;
    public org.telegram.ui.Components.voip.t v;
    public String f24580w;
    public String f24581x;
    public int f24582y;

    public e30(f30 f30Var, Context context) {
        super(context);
        this.P = f30Var;
        k9 k9Var = new k9((org.telegram.ui.ActionBar.c6) null);
        this.f24573a = k9Var;
        Paint paint = new Paint(1);
        this.f24577n = paint;
        Paint paint2 = new Paint(1);
        this.f24578r = paint2;
        this.f24579s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        k9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        z9 z9Var = new z9(context);
        this.d = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(z9Var, w7.a6.a(40.0f, 0.0f, 9.0f, 0.0f, 9.0f, 40, 1));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20207tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20148qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.pd pdVar = new org.telegram.ui.pd(this, context, 1);
        this.F = pdVar;
        pdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(pdVar, w7.a6.d(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f24578r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z10) {
        f30 f30Var = this.P;
        if (!f30Var.f24876r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.t.c(f30Var.h, f30Var.f24875n, null, this, null, this.f24576f, f30Var.f24873c, f30Var.f24876r);
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
        if (this.f24580w != null) {
            canvas.save();
            int B = org.telegram.messenger.yh.B(24.0f, getMeasuredWidth() - this.f24582y, 2);
            int alpha = (int) (getAlpha() * this.f24579s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f24580w, AndroidUtilities.dp(22.0f) + B, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(B, AndroidUtilities.dp(53.0f));
            org.telegram.ui.pd pdVar = this.F;
            if (pdVar.getDrawable() != null) {
                pdVar.getDrawable().setAlpha((int) (getAlpha() * this.f24579s * 255.0f));
                pdVar.draw(canvas);
                pdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e30.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.f30478b && !tVar.f30497r && tVar.v && tVar.f30476a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.P.f24876r.F2) {
            d(canvas);
            return;
        }
        if (this.f24579s > 0.0f) {
            float measuredWidth = (1.0f - this.f24579s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f24577n);
            d(canvas);
        }
        z9 z9Var = this.d;
        float x10 = z9Var.getX() + (z9Var.getMeasuredWidth() / 2);
        float y3 = z9Var.getY() + (z9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.c4 c4Var = this.J;
        c4Var.f();
        c4Var.a(canvas, x10, y3, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f7 = this.f24579s;
        float f10 = (f7 * 1.0f) + ((1.0f - f7) * dp);
        z9Var.setScaleX(c4Var.b() * f10);
        z9Var.setScaleY(c4Var.b() * f10);
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
        f30 f30Var = this.P;
        int i10 = f30Var.d;
        this.f24576f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        int i11 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
        boolean z11 = true;
        z9 z9Var = this.d;
        k9 k9Var = this.f24573a;
        if (i11 > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.f24574b = user;
            this.f24575c = null;
            k9Var.m(i10, user);
            this.f24581x = UserObject.getFirstName(this.f24574b);
            z9Var.getImageReceiver().setCurrentAccount(i10);
            z9Var.h(ImageLocation.getForUser(this.f24574b, 1), "50_50", k9Var, this.f24574b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.f24575c = chat;
            this.f24574b = null;
            k9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f24575c;
            if (chat2 != null) {
                this.f24581x = chat2.title;
                z9Var.getImageReceiver().setCurrentAccount(i10);
                z9Var.h(ImageLocation.getForChat(this.f24575c, 1), "50_50", k9Var, this.f24575c);
            }
        }
        if (j10 == this.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (f30Var.f24875n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = f30Var.f24875n.e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e30.f(boolean):void");
    }

    public z9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.e;
    }

    public float getProgressToFullscreen() {
        return this.f24579s;
    }

    public org.telegram.ui.Components.voip.t getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f24576f;
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
            this.P.f24875n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f30 f30Var = this.P;
        org.telegram.ui.n60 n60Var = f30Var.f24876r;
        if (f30Var.f24877s && this.f24576f != null) {
            b(true);
        }
        this.K = true;
        if (n60Var.f38522t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.o0) i2.d.x(1, n60Var.f38522t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.o0();
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.I;
        o0Var.f30370g = this;
        o0Var.f30368c = this.F;
        o0Var.c(false);
        org.telegram.ui.Components.voip.o0 o0Var2 = this.I;
        o0Var2.h = this.h;
        o0Var2.c(false);
        f(false);
        boolean z10 = this.I.e;
        org.telegram.ui.Cells.c4 c4Var = this.J;
        c4Var.e(this, z10);
        if (!this.I.e) {
            c4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.o0 o0Var = this.I;
        if (o0Var != null) {
            this.P.f24876r.f38522t2.add(o0Var);
            org.telegram.ui.Components.voip.o0 o0Var2 = this.I;
            o0Var2.f30368c = null;
            o0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f24581x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f24581x));
            this.f24582y = min;
            this.f24580w = TextUtils.ellipsize(this.f24581x, textPaint, min, TextUtils.TruncateAt.END).toString();
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
        if (this.f24579s != f7) {
            this.f24579s = f7;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            Paint paint = this.f24577n;
            z9 z9Var = this.d;
            if (i10 == 0) {
                z9Var.setTranslationY(0.0f);
                z9Var.setScaleX(1.0f);
                z9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.t tVar = this.v;
                if (tVar != null) {
                    tVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((z9Var.getMeasuredHeight() / 2.0f) + z9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f10 = 1.0f - f7;
            float f11 = 1.0f * f7;
            float dp = f11 + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f10);
            z9Var.setTranslationY((-measuredHeight) * f10);
            z9Var.setScaleX(dp);
            z9Var.setScaleY(dp);
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

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
public final class j30 extends FrameLayout implements org.telegram.ui.Components.voip.o0 {
    public final TextPaint E;
    public final org.telegram.ui.jd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.p0 I;
    public final org.telegram.ui.Cells.c4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final k30 P;
    public final j9 f27514a;
    public TLRPC.User f27515b;
    public TLRPC.Chat f27516c;
    public final y9 d;
    public long f27517e;
    public ChatObject.VideoParticipant f27518f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f27519n;
    public final Paint f27520r;
    public float f27521s;
    public org.telegram.ui.Components.voip.u v;
    public String f27522w;
    public String f27523x;
    public int f27524y;

    public j30(k30 k30Var, Context context) {
        super(context);
        this.P = k30Var;
        j9 j9Var = new j9((org.telegram.ui.ActionBar.e6) null);
        this.f27514a = j9Var;
        Paint paint = new Paint(1);
        this.f27519n = paint;
        Paint paint2 = new Paint(1);
        this.f27520r = paint2;
        this.f27521s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        j9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(y9Var, w7.x5.a(40.0f, 0.0f, 9.0f, 0.0f, 9.0f, 40, 1));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21105tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21050qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.jd jdVar = new org.telegram.ui.jd(this, context, 1);
        this.F = jdVar;
        jdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(jdVar, w7.x5.d(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f27520r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.f32218e);
        f(true);
    }

    public final void b(boolean z10) {
        k30 k30Var = this.P;
        if (!k30Var.f27876r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.u.c(k30Var.h, k30Var.f27875n, null, this, null, this.f27518f, k30Var.f27872c, k30Var.f27876r);
            } else if (!z10) {
                org.telegram.ui.Components.voip.u uVar = this.v;
                if (uVar != null) {
                    uVar.setSecondaryView(null);
                }
                this.v = null;
            }
        }
    }

    public final void c(Canvas canvas) {
        if (this.f27522w != null) {
            canvas.save();
            int A = org.telegram.messenger.bi.A(24.0f, getMeasuredWidth() - this.f27524y, 2);
            int alpha = (int) (getAlpha() * this.f27521s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f27522w, AndroidUtilities.dp(22.0f) + A, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(A, AndroidUtilities.dp(53.0f));
            org.telegram.ui.jd jdVar = this.F;
            if (jdVar.getDrawable() != null) {
                jdVar.getDrawable().setAlpha((int) (getAlpha() * this.f27521s * 255.0f));
                jdVar.draw(canvas);
                jdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j30.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null && !uVar.f32318b && !uVar.f32338r && uVar.v && uVar.f32316a.d.isFirstFrameRendered() && uVar.getAlpha() == 1.0f && !this.P.f27876r.F2) {
            d(canvas);
            return;
        }
        if (this.f27521s > 0.0f) {
            float measuredWidth = (1.0f - this.f27521s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f27519n);
            d(canvas);
        }
        y9 y9Var = this.d;
        float x10 = y9Var.getX() + (y9Var.getMeasuredWidth() / 2);
        float y3 = y9Var.getY() + (y9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.c4 c4Var = this.J;
        c4Var.f();
        c4Var.a(canvas, x10, y3, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f7 = this.f27521s;
        float f10 = (f7 * 1.0f) + ((1.0f - f7) * dp);
        y9Var.setScaleX(c4Var.b() * f10);
        y9Var.setScaleY(c4Var.b() * f10);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.F) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(ChatObject.VideoParticipant videoParticipant, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z10;
        float f7;
        k30 k30Var = this.P;
        int i10 = k30Var.d;
        this.f27518f = videoParticipant;
        this.h = groupCallParticipant;
        long j3 = this.f27517e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.f27517e = peerId;
        int i11 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
        boolean z11 = true;
        y9 y9Var = this.d;
        j9 j9Var = this.f27514a;
        if (i11 > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.f27517e));
            this.f27515b = user;
            this.f27516c = null;
            j9Var.m(i10, user);
            this.f27523x = UserObject.getFirstName(this.f27515b);
            y9Var.getImageReceiver().setCurrentAccount(i10);
            y9Var.h(ImageLocation.getForUser(this.f27515b, 1), "50_50", j9Var, this.f27515b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.f27517e));
            this.f27516c = chat;
            this.f27515b = null;
            j9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f27516c;
            if (chat2 != null) {
                this.f27523x = chat2.title;
                y9Var.getImageReceiver().setCurrentAccount(i10);
                y9Var.h(ImageLocation.getForChat(this.f27516c, 1), "50_50", j9Var, this.f27516c);
            }
        }
        if (j3 == this.f27517e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (k30Var.f27875n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = k30Var.f27875n.f32125e;
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
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        if (p0Var != null) {
            p0Var.h = groupCallParticipant;
            p0Var.c(z10);
            f(z10);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j30.f(boolean):void");
    }

    public y9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f27517e;
    }

    public float getProgressToFullscreen() {
        return this.f27521s;
    }

    public org.telegram.ui.Components.voip.u getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f27518f;
    }

    @Override
    public final void invalidate() {
        if (this.O) {
            return;
        }
        this.O = true;
        super.invalidate();
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null) {
            uVar.invalidate();
        } else {
            this.P.f27875n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k30 k30Var = this.P;
        org.telegram.ui.g60 g60Var = k30Var.f27876r;
        if (k30Var.f27877s && this.f27518f != null) {
            b(true);
        }
        this.K = true;
        if (g60Var.f37913t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.p0) hg.c.x(1, g60Var.f37913t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.p0();
        }
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        p0Var.f32220g = this;
        p0Var.f32217c = this.F;
        p0Var.c(false);
        org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
        p0Var2.h = this.h;
        p0Var2.c(false);
        f(false);
        boolean z10 = this.I.f32218e;
        org.telegram.ui.Cells.c4 c4Var = this.J;
        c4Var.e(this, z10);
        if (!this.I.f32218e) {
            c4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        if (p0Var != null) {
            this.P.f27876r.f37913t2.add(p0Var);
            org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
            p0Var2.f32217c = null;
            p0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f27523x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f27523x));
            this.f27524y = min;
            this.f27522w = TextUtils.ellipsize(this.f27523x, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        if (p0Var != null) {
            p0Var.a(d);
        }
        this.J.c(d);
    }

    public void setProgressToFullscreen(float f7) {
        if (this.f27521s != f7) {
            this.f27521s = f7;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            Paint paint = this.f27519n;
            y9 y9Var = this.d;
            if (i10 == 0) {
                y9Var.setTranslationY(0.0f);
                y9Var.setScaleX(1.0f);
                y9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.u uVar = this.v;
                if (uVar != null) {
                    uVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((y9Var.getMeasuredHeight() / 2.0f) + y9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f10 = 1.0f - f7;
            float f11 = 1.0f * f7;
            float dp = f11 + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f10);
            y9Var.setTranslationY((-measuredHeight) * f10);
            y9Var.setScaleX(dp);
            y9Var.setScaleY(dp);
            paint.setAlpha((int) (f7 * 255.0f));
            invalidate();
            org.telegram.ui.Components.voip.u uVar2 = this.v;
            if (uVar2 != null) {
                uVar2.invalidate();
            }
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.u uVar) {
        this.v = uVar;
    }
}

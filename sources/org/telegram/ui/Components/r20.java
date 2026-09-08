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
public final class r20 extends FrameLayout implements org.telegram.ui.Components.voip.n0 {
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
    public final s20 P;
    public final i9 f29913a;
    public TLRPC.User f29914b;
    public TLRPC.Chat f29915c;
    public final x9 d;
    public long f29916e;
    public ChatObject.VideoParticipant f29917f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f29918n;
    public final Paint f29919r;
    public float f29920s;
    public org.telegram.ui.Components.voip.t v;
    public String f29921w;
    public String f29922x;
    public int f29923y;

    public r20(s20 s20Var, Context context) {
        super(context);
        this.P = s20Var;
        i9 i9Var = new i9((org.telegram.ui.ActionBar.f6) null);
        this.f29913a = i9Var;
        Paint paint = new Paint(1);
        this.f29918n = paint;
        Paint paint2 = new Paint(1);
        this.f29919r = paint2;
        this.f29920s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.b4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        i9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        x9 x9Var = new x9(context);
        this.d = x9Var;
        x9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(x9Var, w7.x5.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20990tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20934qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.jd jdVar = new org.telegram.ui.jd(this, context, 1);
        this.F = jdVar;
        jdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(jdVar, w7.x5.c(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f29919r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.f31717e);
        f(true);
    }

    public final void b(boolean z10) {
        s20 s20Var = this.P;
        if (!s20Var.f30201r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.t.c(s20Var.h, s20Var.f30200n, null, this, null, this.f29917f, s20Var.f30197c, s20Var.f30201r);
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
        if (this.f29921w != null) {
            canvas.save();
            int y3 = org.telegram.messenger.wl.y(24.0f, getMeasuredWidth() - this.f29923y, 2);
            int alpha = (int) (getAlpha() * this.f29920s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f29921w, AndroidUtilities.dp(22.0f) + y3, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y3, AndroidUtilities.dp(53.0f));
            org.telegram.ui.jd jdVar = this.F;
            if (jdVar.getDrawable() != null) {
                jdVar.getDrawable().setAlpha((int) (getAlpha() * this.f29920s * 255.0f));
                jdVar.draw(canvas);
                jdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r20.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.f31833b && !tVar.f31853r && tVar.v && tVar.f31831a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.P.f30201r.F2) {
            d(canvas);
            return;
        }
        if (this.f29920s > 0.0f) {
            float measuredWidth = (1.0f - this.f29920s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f29918n);
            d(canvas);
        }
        x9 x9Var = this.d;
        float x10 = x9Var.getX() + (x9Var.getMeasuredWidth() / 2);
        float y3 = x9Var.getY() + (x9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.b4 b4Var = this.J;
        b4Var.f();
        b4Var.a(canvas, x10, y3, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f7 = this.f29920s;
        float f10 = (f7 * 1.0f) + ((1.0f - f7) * dp);
        x9Var.setScaleX(b4Var.b() * f10);
        x9Var.setScaleY(b4Var.b() * f10);
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
        s20 s20Var = this.P;
        int i10 = s20Var.d;
        this.f29917f = videoParticipant;
        this.h = groupCallParticipant;
        long j3 = this.f29916e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.f29916e = peerId;
        boolean z11 = true;
        x9 x9Var = this.d;
        i9 i9Var = this.f29913a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.f29916e));
            this.f29914b = user;
            this.f29915c = null;
            i9Var.m(i10, user);
            this.f29922x = UserObject.getFirstName(this.f29914b);
            x9Var.getImageReceiver().setCurrentAccount(i10);
            x9Var.h(ImageLocation.getForUser(this.f29914b, 1), "50_50", i9Var, this.f29914b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.f29916e));
            this.f29915c = chat;
            this.f29914b = null;
            i9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f29915c;
            if (chat2 != null) {
                this.f29922x = chat2.title;
                x9Var.getImageReceiver().setCurrentAccount(i10);
                x9Var.h(ImageLocation.getForChat(this.f29915c, 1), "50_50", i9Var, this.f29915c);
            }
        }
        if (j3 == this.f29916e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (s20Var.f30200n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = s20Var.f30200n.f31629e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r20.f(boolean):void");
    }

    public x9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f29916e;
    }

    public float getProgressToFullscreen() {
        return this.f29920s;
    }

    public org.telegram.ui.Components.voip.t getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f29917f;
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
            this.P.f30200n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s20 s20Var = this.P;
        org.telegram.ui.j60 j60Var = s20Var.f30201r;
        if (s20Var.f30202s && this.f29917f != null) {
            b(true);
        }
        this.K = true;
        if (j60Var.f37620t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.o0) i2.g.z(1, j60Var.f37620t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.o0();
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.I;
        o0Var.f31719g = this;
        o0Var.f31716c = this.F;
        o0Var.c(false);
        org.telegram.ui.Components.voip.o0 o0Var2 = this.I;
        o0Var2.h = this.h;
        o0Var2.c(false);
        f(false);
        boolean z10 = this.I.f31717e;
        org.telegram.ui.Cells.b4 b4Var = this.J;
        b4Var.e(this, z10);
        if (!this.I.f31717e) {
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
            this.P.f30201r.f37620t2.add(o0Var);
            org.telegram.ui.Components.voip.o0 o0Var2 = this.I;
            o0Var2.f31716c = null;
            o0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f29922x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f29922x));
            this.f29923y = min;
            this.f29921w = TextUtils.ellipsize(this.f29922x, textPaint, min, TextUtils.TruncateAt.END).toString();
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
        if (this.f29920s != f7) {
            this.f29920s = f7;
            Paint paint = this.f29918n;
            x9 x9Var = this.d;
            if (f7 == 1.0f) {
                x9Var.setTranslationY(0.0f);
                x9Var.setScaleX(1.0f);
                x9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.t tVar = this.v;
                if (tVar != null) {
                    tVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((x9Var.getMeasuredHeight() / 2.0f) + x9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f10 = 1.0f - f7;
            float f11 = 1.0f * f7;
            float dp = f11 + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f10);
            x9Var.setTranslationY((-measuredHeight) * f10);
            x9Var.setScaleX(dp);
            x9Var.setScaleY(dp);
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

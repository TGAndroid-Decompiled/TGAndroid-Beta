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
public final class r20 extends FrameLayout implements org.telegram.ui.Components.voip.o0 {
    public final TextPaint E;
    public final org.telegram.ui.jd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.p0 I;
    public final org.telegram.ui.Cells.d4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final s20 P;
    public final g9 f27729a;
    public TLRPC.User f27730b;
    public TLRPC.Chat f27731c;
    public final v9 d;
    public long e;
    public ChatObject.VideoParticipant f27732f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f27733n;
    public final Paint f27734r;
    public float f27735s;
    public org.telegram.ui.Components.voip.u v;
    public String f27736w;
    public String f27737x;
    public int f27738y;

    public r20(s20 s20Var, Context context) {
        super(context);
        this.P = s20Var;
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        this.f27729a = g9Var;
        Paint paint = new Paint(1);
        this.f27733n = paint;
        Paint paint2 = new Paint(1);
        this.f27734r = paint2;
        this.f27735s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.d4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        g9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        v9 v9Var = new v9(context);
        this.d = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(v9Var, w7.y5.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19398tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19342qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.jd jdVar = new org.telegram.ui.jd(this, context, 1);
        this.F = jdVar;
        jdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(jdVar, w7.y5.c(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f27734r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z10) {
        s20 s20Var = this.P;
        if (!s20Var.f28013r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.u.c(s20Var.h, s20Var.f28012n, null, this, null, this.f27732f, s20Var.f28010c, s20Var.f28013r);
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
        if (this.f27736w != null) {
            canvas.save();
            int z10 = org.telegram.messenger.rk.z(24.0f, getMeasuredWidth() - this.f27738y, 2);
            int alpha = (int) (getAlpha() * this.f27735s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f27736w, AndroidUtilities.dp(22.0f) + z10, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(z10, AndroidUtilities.dp(53.0f));
            org.telegram.ui.jd jdVar = this.F;
            if (jdVar.getDrawable() != null) {
                jdVar.getDrawable().setAlpha((int) (getAlpha() * this.f27735s * 255.0f));
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
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null && !uVar.f29645b && !uVar.f29664r && uVar.v && uVar.f29643a.d.isFirstFrameRendered() && uVar.getAlpha() == 1.0f && !this.P.f28013r.F2) {
            d(canvas);
            return;
        }
        if (this.f27735s > 0.0f) {
            float measuredWidth = (1.0f - this.f27735s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f27733n);
            d(canvas);
        }
        v9 v9Var = this.d;
        float x10 = v9Var.getX() + (v9Var.getMeasuredWidth() / 2);
        float y3 = v9Var.getY() + (v9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.d4 d4Var = this.J;
        d4Var.f();
        d4Var.a(canvas, x10, y3, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f7 = this.f27735s;
        float f10 = (f7 * 1.0f) + ((1.0f - f7) * dp);
        v9Var.setScaleX(d4Var.b() * f10);
        v9Var.setScaleY(d4Var.b() * f10);
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
        this.f27732f = videoParticipant;
        this.h = groupCallParticipant;
        long j3 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        boolean z11 = true;
        v9 v9Var = this.d;
        g9 g9Var = this.f27729a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.f27730b = user;
            this.f27731c = null;
            g9Var.m(i10, user);
            this.f27737x = UserObject.getFirstName(this.f27730b);
            v9Var.getImageReceiver().setCurrentAccount(i10);
            v9Var.h(ImageLocation.getForUser(this.f27730b, 1), "50_50", g9Var, this.f27730b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.f27731c = chat;
            this.f27730b = null;
            g9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f27731c;
            if (chat2 != null) {
                this.f27737x = chat2.title;
                v9Var.getImageReceiver().setCurrentAccount(i10);
                v9Var.h(ImageLocation.getForChat(this.f27731c, 1), "50_50", g9Var, this.f27731c);
            }
        }
        if (j3 == this.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (s20Var.f28012n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = s20Var.f28012n.e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r20.f(boolean):void");
    }

    public v9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.e;
    }

    public float getProgressToFullscreen() {
        return this.f27735s;
    }

    public org.telegram.ui.Components.voip.u getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f27732f;
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
            this.P.f28012n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        s20 s20Var = this.P;
        org.telegram.ui.i60 i60Var = s20Var.f28013r;
        if (s20Var.f28014s && this.f27732f != null) {
            b(true);
        }
        this.K = true;
        if (i60Var.f34439t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.p0) hg.k0.x(1, i60Var.f34439t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.p0();
        }
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        p0Var.f29556g = this;
        p0Var.f29554c = this.F;
        p0Var.c(false);
        org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
        p0Var2.h = this.h;
        p0Var2.c(false);
        f(false);
        boolean z10 = this.I.e;
        org.telegram.ui.Cells.d4 d4Var = this.J;
        d4Var.e(this, z10);
        if (!this.I.e) {
            d4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        if (p0Var != null) {
            this.P.f28013r.f34439t2.add(p0Var);
            org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
            p0Var2.f29554c = null;
            p0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f27737x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f27737x));
            this.f27738y = min;
            this.f27736w = TextUtils.ellipsize(this.f27737x, textPaint, min, TextUtils.TruncateAt.END).toString();
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
        if (this.f27735s != f7) {
            this.f27735s = f7;
            Paint paint = this.f27733n;
            v9 v9Var = this.d;
            if (f7 == 1.0f) {
                v9Var.setTranslationY(0.0f);
                v9Var.setScaleX(1.0f);
                v9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.u uVar = this.v;
                if (uVar != null) {
                    uVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((v9Var.getMeasuredHeight() / 2.0f) + v9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f10 = 1.0f - f7;
            float f11 = 1.0f * f7;
            float dp = f11 + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f10);
            v9Var.setTranslationY((-measuredHeight) * f10);
            v9Var.setScaleX(dp);
            v9Var.setScaleY(dp);
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

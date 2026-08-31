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
public final class t20 extends FrameLayout implements org.telegram.ui.Components.voip.n0 {
    public final TextPaint B;
    public final org.telegram.ui.kd C;
    public float D;
    public boolean E;
    public org.telegram.ui.Components.voip.o0 F;
    public final org.telegram.ui.Cells.c4 G;
    public boolean H;
    public int I;
    public int J;
    public ValueAnimator K;
    public boolean L;
    public final u20 M;
    public final z8 f31242a;
    public TLRPC.User f31243b;
    public TLRPC.Chat f31244c;
    public final p9 d;
    public long f31245e;
    public ChatObject.VideoParticipant f31246f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f31247n;
    public final Paint f31248r;
    public float f31249s;
    public org.telegram.ui.Components.voip.u v;
    public String f31250w;
    public String f31251x;
    public int f31252y;

    public t20(u20 u20Var, Context context) {
        super(context);
        this.M = u20Var;
        z8 z8Var = new z8((org.telegram.ui.ActionBar.g6) null);
        this.f31242a = z8Var;
        Paint paint = new Paint(1);
        this.f31247n = paint;
        Paint paint2 = new Paint(1);
        this.f31248r = paint2;
        this.f31249s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.B = textPaint;
        this.G = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        z8Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        p9 p9Var = new p9(context);
        this.d = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(p9Var, k7.c6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21952tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21903qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.kd kdVar = new org.telegram.ui.kd(this, context, 1);
        this.C = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(kdVar, k7.c6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.D != f10) {
            this.D = f10;
            this.f31248r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.G.e(this, this.F.f32219e);
        f(true);
    }

    public final void b(boolean z4) {
        u20 u20Var = this.M;
        if (!u20Var.f31529r.isDismissed()) {
            if (z4 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.u.c(u20Var.h, u20Var.f31528n, null, this, null, this.f31246f, u20Var.f31525c, u20Var.f31529r);
            } else if (!z4) {
                org.telegram.ui.Components.voip.u uVar = this.v;
                if (uVar != null) {
                    uVar.setSecondaryView(null);
                }
                this.v = null;
            }
        }
    }

    public final void c(Canvas canvas) {
        if (this.f31250w != null) {
            canvas.save();
            int x10 = org.telegram.ui.b.x(24.0f, getMeasuredWidth() - this.f31252y, 2);
            int alpha = (int) (getAlpha() * this.f31249s * 255.0f);
            TextPaint textPaint = this.B;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f31250w, AndroidUtilities.dp(22.0f) + x10, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(x10, AndroidUtilities.dp(53.0f));
            org.telegram.ui.kd kdVar = this.C;
            if (kdVar.getDrawable() != null) {
                kdVar.getDrawable().setAlpha((int) (getAlpha() * this.f31249s * 255.0f));
                kdVar.draw(canvas);
                kdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t20.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null && !uVar.f32362b && !uVar.f32382r && uVar.v && uVar.f32360a.d.isFirstFrameRendered() && uVar.getAlpha() == 1.0f && !this.M.f31529r.C2) {
            d(canvas);
            return;
        }
        if (this.f31249s > 0.0f) {
            float measuredWidth = (1.0f - this.f31249s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f31247n);
            d(canvas);
        }
        p9 p9Var = this.d;
        float x10 = p9Var.getX() + (p9Var.getMeasuredWidth() / 2);
        float y10 = p9Var.getY() + (p9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.c4 c4Var = this.G;
        c4Var.f();
        c4Var.a(canvas, x10, y10, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f10 = this.f31249s;
        float f11 = (f10 * 1.0f) + ((1.0f - f10) * dp);
        p9Var.setScaleX(c4Var.b() * f11);
        p9Var.setScaleY(c4Var.b() * f11);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.C) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(ChatObject.VideoParticipant videoParticipant, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z4;
        float f10;
        u20 u20Var = this.M;
        int i10 = u20Var.d;
        this.f31246f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.f31245e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.f31245e = peerId;
        boolean z10 = true;
        p9 p9Var = this.d;
        z8 z8Var = this.f31242a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.f31245e));
            this.f31243b = user;
            this.f31244c = null;
            z8Var.m(i10, user);
            this.f31251x = UserObject.getFirstName(this.f31243b);
            p9Var.getImageReceiver().setCurrentAccount(i10);
            p9Var.h(ImageLocation.getForUser(this.f31243b, 1), "50_50", z8Var, this.f31243b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.f31245e));
            this.f31244c = chat;
            this.f31243b = null;
            z8Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f31244c;
            if (chat2 != null) {
                this.f31251x = chat2.title;
                p9Var.getImageReceiver().setCurrentAccount(i10);
                p9Var.h(ImageLocation.getForChat(this.f31244c, 1), "50_50", z8Var, this.f31244c);
            }
        }
        if (j10 == this.f31245e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (videoParticipant == null) {
            if (u20Var.f31528n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z10 = false;
            }
            this.E = z10;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = u20Var.f31528n.f32145e;
            if (videoParticipant2 != null) {
                this.E = videoParticipant2.equals(videoParticipant);
            } else {
                this.E = false;
            }
        }
        if (!z4) {
            if (this.E) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            setSelectedProgress(f10);
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.F;
        if (o0Var != null) {
            o0Var.h = groupCallParticipant;
            o0Var.c(z4);
            f(z4);
        }
    }

    public final void f(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t20.f(boolean):void");
    }

    public p9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f31245e;
    }

    public float getProgressToFullscreen() {
        return this.f31249s;
    }

    public org.telegram.ui.Components.voip.u getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f31246f;
    }

    @Override
    public final void invalidate() {
        if (this.L) {
            return;
        }
        this.L = true;
        super.invalidate();
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null) {
            uVar.invalidate();
        } else {
            this.M.f31528n.invalidate();
        }
        this.L = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u20 u20Var = this.M;
        org.telegram.ui.d60 d60Var = u20Var.f31529r;
        if (u20Var.f31530s && this.f31246f != null) {
            b(true);
        }
        this.H = true;
        if (d60Var.f36078q2.size() > 0) {
            this.F = (org.telegram.ui.Components.voip.o0) e2.c.g(1, d60Var.f36078q2);
        } else {
            this.F = new org.telegram.ui.Components.voip.o0();
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.F;
        o0Var.f32221g = this;
        o0Var.f32218c = this.C;
        o0Var.c(false);
        org.telegram.ui.Components.voip.o0 o0Var2 = this.F;
        o0Var2.h = this.h;
        o0Var2.c(false);
        f(false);
        boolean z4 = this.F.f32219e;
        org.telegram.ui.Cells.c4 c4Var = this.G;
        c4Var.e(this, z4);
        if (!this.F.f32219e) {
            c4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.H = false;
        org.telegram.ui.Components.voip.o0 o0Var = this.F;
        if (o0Var != null) {
            this.M.f31529r.f36078q2.add(o0Var);
            org.telegram.ui.Components.voip.o0 o0Var2 = this.F;
            o0Var2.f32218c = null;
            o0Var2.c(false);
            this.F.b();
        }
        this.F = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.B;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f31251x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f31251x));
            this.f31252y = min;
            this.f31250w = TextUtils.ellipsize(this.f31251x, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.o0 o0Var = this.F;
        if (o0Var != null) {
            o0Var.a(d);
        }
        this.G.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.f31249s != f10) {
            this.f31249s = f10;
            Paint paint = this.f31247n;
            p9 p9Var = this.d;
            if (f10 == 1.0f) {
                p9Var.setTranslationY(0.0f);
                p9Var.setScaleX(1.0f);
                p9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.u uVar = this.v;
                if (uVar != null) {
                    uVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((p9Var.getMeasuredHeight() / 2.0f) + p9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f11 = 1.0f - f10;
            float f12 = 1.0f * f10;
            float dp = f12 + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f11);
            p9Var.setTranslationY((-measuredHeight) * f11);
            p9Var.setScaleX(dp);
            p9Var.setScaleY(dp);
            paint.setAlpha((int) (f10 * 255.0f));
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

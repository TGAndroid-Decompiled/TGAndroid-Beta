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
public final class s20 extends FrameLayout implements org.telegram.ui.Components.voip.m0 {
    public final TextPaint B;
    public final org.telegram.ui.kd C;
    public float D;
    public boolean E;
    public org.telegram.ui.Components.voip.n0 F;
    public final org.telegram.ui.Cells.c4 G;
    public boolean H;
    public int I;
    public int J;
    public ValueAnimator K;
    public boolean L;
    public final t20 M;
    public final z8 f28604a;
    public TLRPC.User f28605b;
    public TLRPC.Chat f28606c;
    public final p9 d;
    public long e;
    public ChatObject.VideoParticipant f28607f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f28608n;
    public final Paint f28609r;
    public float f28610s;
    public org.telegram.ui.Components.voip.t v;
    public String f28611w;
    public String f28612x;
    public int f28613y;

    public s20(t20 t20Var, Context context) {
        super(context);
        this.M = t20Var;
        z8 z8Var = new z8((org.telegram.ui.ActionBar.f6) null);
        this.f28604a = z8Var;
        Paint paint = new Paint(1);
        this.f28608n = paint;
        Paint paint2 = new Paint(1);
        this.f28609r = paint2;
        this.f28610s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.B = textPaint;
        this.G = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        z8Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        p9 p9Var = new p9(context);
        this.d = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(p9Var, k7.b6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20198tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20149qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.kd kdVar = new org.telegram.ui.kd(this, context, 1);
        this.C = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(kdVar, k7.b6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.D != f10) {
            this.D = f10;
            this.f28609r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.G.e(this, this.F.e);
        f(true);
    }

    public final void b(boolean z4) {
        t20 t20Var = this.M;
        if (!t20Var.f28874r.isDismissed()) {
            if (z4 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.t.c(t20Var.h, t20Var.f28873n, null, this, null, this.f28607f, t20Var.f28871c, t20Var.f28874r);
            } else if (!z4) {
                org.telegram.ui.Components.voip.t tVar = this.v;
                if (tVar != null) {
                    tVar.setSecondaryView(null);
                }
                this.v = null;
            }
        }
    }

    public final void c(Canvas canvas) {
        if (this.f28611w != null) {
            canvas.save();
            int x10 = org.telegram.ui.b.x(24.0f, getMeasuredWidth() - this.f28613y, 2);
            int alpha = (int) (getAlpha() * this.f28610s * 255.0f);
            TextPaint textPaint = this.B;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f28611w, AndroidUtilities.dp(22.0f) + x10, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(x10, AndroidUtilities.dp(53.0f));
            org.telegram.ui.kd kdVar = this.C;
            if (kdVar.getDrawable() != null) {
                kdVar.getDrawable().setAlpha((int) (getAlpha() * this.f28610s * 255.0f));
                kdVar.draw(canvas);
                kdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s20.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.f29921b && !tVar.f29940r && tVar.v && tVar.f29919a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.M.f28874r.C2) {
            d(canvas);
            return;
        }
        if (this.f28610s > 0.0f) {
            float measuredWidth = (1.0f - this.f28610s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f28608n);
            d(canvas);
        }
        p9 p9Var = this.d;
        float x10 = p9Var.getX() + (p9Var.getMeasuredWidth() / 2);
        float y10 = p9Var.getY() + (p9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.c4 c4Var = this.G;
        c4Var.f();
        c4Var.a(canvas, x10, y10, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f10 = this.f28610s;
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
        t20 t20Var = this.M;
        int i10 = t20Var.d;
        this.f28607f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        boolean z10 = true;
        p9 p9Var = this.d;
        z8 z8Var = this.f28604a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.f28605b = user;
            this.f28606c = null;
            z8Var.m(i10, user);
            this.f28612x = UserObject.getFirstName(this.f28605b);
            p9Var.getImageReceiver().setCurrentAccount(i10);
            p9Var.h(ImageLocation.getForUser(this.f28605b, 1), "50_50", z8Var, this.f28605b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.f28606c = chat;
            this.f28605b = null;
            z8Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f28606c;
            if (chat2 != null) {
                this.f28612x = chat2.title;
                p9Var.getImageReceiver().setCurrentAccount(i10);
                p9Var.h(ImageLocation.getForChat(this.f28606c, 1), "50_50", z8Var, this.f28606c);
            }
        }
        if (j10 == this.e) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (videoParticipant == null) {
            if (t20Var.f28873n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z10 = false;
            }
            this.E = z10;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = t20Var.f28873n.e;
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
        org.telegram.ui.Components.voip.n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.h = groupCallParticipant;
            n0Var.c(z4);
            f(z4);
        }
    }

    public final void f(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s20.f(boolean):void");
    }

    public p9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.e;
    }

    public float getProgressToFullscreen() {
        return this.f28610s;
    }

    public org.telegram.ui.Components.voip.t getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f28607f;
    }

    @Override
    public final void invalidate() {
        if (this.L) {
            return;
        }
        this.L = true;
        super.invalidate();
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null) {
            tVar.invalidate();
        } else {
            this.M.f28873n.invalidate();
        }
        this.L = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t20 t20Var = this.M;
        org.telegram.ui.c60 c60Var = t20Var.f28874r;
        if (t20Var.f28875s && this.f28607f != null) {
            b(true);
        }
        this.H = true;
        if (c60Var.f33164q2.size() > 0) {
            this.F = (org.telegram.ui.Components.voip.n0) e2.c.g(1, c60Var.f33164q2);
        } else {
            this.F = new org.telegram.ui.Components.voip.n0();
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.F;
        n0Var.f29790g = this;
        n0Var.f29788c = this.C;
        n0Var.c(false);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.F;
        n0Var2.h = this.h;
        n0Var2.c(false);
        f(false);
        boolean z4 = this.F.e;
        org.telegram.ui.Cells.c4 c4Var = this.G;
        c4Var.e(this, z4);
        if (!this.F.e) {
            c4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.H = false;
        org.telegram.ui.Components.voip.n0 n0Var = this.F;
        if (n0Var != null) {
            this.M.f28874r.f33164q2.add(n0Var);
            org.telegram.ui.Components.voip.n0 n0Var2 = this.F;
            n0Var2.f29788c = null;
            n0Var2.c(false);
            this.F.b();
        }
        this.F = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.B;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f28612x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f28612x));
            this.f28613y = min;
            this.f28611w = TextUtils.ellipsize(this.f28612x, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.n0 n0Var = this.F;
        if (n0Var != null) {
            n0Var.a(d);
        }
        this.G.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.f28610s != f10) {
            this.f28610s = f10;
            Paint paint = this.f28608n;
            p9 p9Var = this.d;
            if (f10 == 1.0f) {
                p9Var.setTranslationY(0.0f);
                p9Var.setScaleX(1.0f);
                p9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.t tVar = this.v;
                if (tVar != null) {
                    tVar.invalidate();
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

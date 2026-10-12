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
public final class l30 extends FrameLayout implements org.telegram.ui.Components.voip.p0 {
    public final TextPaint E;
    public final org.telegram.ui.nd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.q0 I;
    public final org.telegram.ui.Cells.c4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final m30 P;
    public final j9 f28010a;
    public TLRPC.User f28011b;
    public TLRPC.Chat f28012c;
    public final y9 d;
    public long f28013e;
    public ChatObject.VideoParticipant f28014f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f28015n;
    public final Paint f28016r;
    public float f28017s;
    public org.telegram.ui.Components.voip.u v;
    public String f28018w;
    public String f28019x;
    public int f28020y;

    public l30(m30 m30Var, Context context) {
        super(context);
        this.P = m30Var;
        j9 j9Var = new j9((org.telegram.ui.ActionBar.c6) null);
        this.f28010a = j9Var;
        Paint paint = new Paint(1);
        this.f28015n = paint;
        Paint paint2 = new Paint(1);
        this.f28016r = paint2;
        this.f28017s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        j9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(y9Var, w7.w5.a(40.0f, 0.0f, 9.0f, 0.0f, 9.0f, 40, 1));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20865tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20808qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.nd ndVar = new org.telegram.ui.nd(this, context, 1);
        this.F = ndVar;
        ndVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(ndVar, w7.w5.d(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f28016r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.f31911e);
        f(true);
    }

    public final void b(boolean z10) {
        m30 m30Var = this.P;
        if (!m30Var.f28374r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.u.c(m30Var.h, m30Var.f28373n, null, this, null, this.f28014f, m30Var.f28370c, m30Var.f28374r);
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
        if (this.f28018w != null) {
            canvas.save();
            int A = org.telegram.messenger.am.A(24.0f, getMeasuredWidth() - this.f28020y, 2);
            int alpha = (int) (getAlpha() * this.f28017s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f28018w, AndroidUtilities.dp(22.0f) + A, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(A, AndroidUtilities.dp(53.0f));
            org.telegram.ui.nd ndVar = this.F;
            if (ndVar.getDrawable() != null) {
                ndVar.getDrawable().setAlpha((int) (getAlpha() * this.f28017s * 255.0f));
                ndVar.draw(canvas);
                ndVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l30.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null && !uVar.f31997b && !uVar.f32017r && uVar.v && uVar.f31995a.d.isFirstFrameRendered() && uVar.getAlpha() == 1.0f && !this.P.f28374r.F2) {
            d(canvas);
            return;
        }
        if (this.f28017s > 0.0f) {
            float measuredWidth = (1.0f - this.f28017s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f28015n);
            d(canvas);
        }
        y9 y9Var = this.d;
        float x10 = y9Var.getX() + (y9Var.getMeasuredWidth() / 2);
        float y3 = y9Var.getY() + (y9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.c4 c4Var = this.J;
        c4Var.f();
        c4Var.a(canvas, x10, y3, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f7 = this.f28017s;
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
        m30 m30Var = this.P;
        int i10 = m30Var.d;
        this.f28014f = videoParticipant;
        this.h = groupCallParticipant;
        long j3 = this.f28013e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.f28013e = peerId;
        int i11 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
        boolean z11 = true;
        y9 y9Var = this.d;
        j9 j9Var = this.f28010a;
        if (i11 > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.f28013e));
            this.f28011b = user;
            this.f28012c = null;
            j9Var.m(i10, user);
            this.f28019x = UserObject.getFirstName(this.f28011b);
            y9Var.getImageReceiver().setCurrentAccount(i10);
            y9Var.h(ImageLocation.getForUser(this.f28011b, 1), "50_50", j9Var, this.f28011b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.f28013e));
            this.f28012c = chat;
            this.f28011b = null;
            j9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f28012c;
            if (chat2 != null) {
                this.f28019x = chat2.title;
                y9Var.getImageReceiver().setCurrentAccount(i10);
                y9Var.h(ImageLocation.getForChat(this.f28012c, 1), "50_50", j9Var, this.f28012c);
            }
        }
        if (j3 == this.f28013e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (m30Var.f28373n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = m30Var.f28373n.f31819e;
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
        org.telegram.ui.Components.voip.q0 q0Var = this.I;
        if (q0Var != null) {
            q0Var.h = groupCallParticipant;
            q0Var.c(z10);
            f(z10);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l30.f(boolean):void");
    }

    public y9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f28013e;
    }

    public float getProgressToFullscreen() {
        return this.f28017s;
    }

    public org.telegram.ui.Components.voip.u getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f28014f;
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
            this.P.f28373n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m30 m30Var = this.P;
        org.telegram.ui.i60 i60Var = m30Var.f28374r;
        if (m30Var.f28375s && this.f28014f != null) {
            b(true);
        }
        this.K = true;
        if (i60Var.f38758t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.q0) hg.c.A(1, i60Var.f38758t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.q0();
        }
        org.telegram.ui.Components.voip.q0 q0Var = this.I;
        q0Var.f31913g = this;
        q0Var.f31910c = this.F;
        q0Var.c(false);
        org.telegram.ui.Components.voip.q0 q0Var2 = this.I;
        q0Var2.h = this.h;
        q0Var2.c(false);
        f(false);
        boolean z10 = this.I.f31911e;
        org.telegram.ui.Cells.c4 c4Var = this.J;
        c4Var.e(this, z10);
        if (!this.I.f31911e) {
            c4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.q0 q0Var = this.I;
        if (q0Var != null) {
            this.P.f28374r.f38758t2.add(q0Var);
            org.telegram.ui.Components.voip.q0 q0Var2 = this.I;
            q0Var2.f31910c = null;
            q0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f28019x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f28019x));
            this.f28020y = min;
            this.f28018w = TextUtils.ellipsize(this.f28019x, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.q0 q0Var = this.I;
        if (q0Var != null) {
            q0Var.a(d);
        }
        this.J.c(d);
    }

    public void setProgressToFullscreen(float f7) {
        if (this.f28017s != f7) {
            this.f28017s = f7;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            Paint paint = this.f28015n;
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

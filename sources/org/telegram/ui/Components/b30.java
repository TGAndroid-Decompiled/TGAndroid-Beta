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
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class b30 extends FrameLayout implements org.telegram.ui.ActionBar.p6, org.telegram.ui.Components.voip.n0 {
    public final TextPaint E;
    public final org.telegram.ui.kd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.o0 I;
    public final org.telegram.ui.Cells.g4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final c30 P;
    public final j9 f26714a;
    public TLRPC.User f26715b;
    public TLRPC.Chat f26716c;
    public final y9 d;
    public long e;
    public ChatObject.VideoParticipant f26717f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f26718n;
    public final Paint f26719r;
    public float f26720s;
    public org.telegram.ui.Components.voip.t v;
    public String f26721w;
    public String f26722x;
    public int f26723y;

    public b30(c30 c30Var, Context context) {
        super(context);
        this.P = c30Var;
        j9 j9Var = new j9((org.telegram.ui.ActionBar.u6) null);
        this.f26714a = j9Var;
        Paint paint = new Paint(1);
        this.f26718n = paint;
        Paint paint2 = new Paint(1);
        this.f26719r = paint2;
        this.f26720s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.g4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        j9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        y9 y9Var = new y9(context);
        this.d = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(y9Var, kb1.h(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23664tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23606qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.kd kdVar = new org.telegram.ui.kd(this, context, 1);
        this.F = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(kdVar, kb1.g(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f26719r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z10) {
        c30 c30Var = this.P;
        if (!c30Var.f27043r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.t.c(c30Var.h, c30Var.f27042n, null, this, null, this.f26717f, c30Var.f27040c, c30Var.f27043r);
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
        if (this.f26721w != null) {
            canvas.save();
            int B = org.telegram.messenger.wh.B(24.0f, getMeasuredWidth() - this.f26723y, 2);
            int alpha = (int) (getAlpha() * this.f26720s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f26721w, AndroidUtilities.dp(22.0f) + B, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(B, AndroidUtilities.dp(53.0f));
            org.telegram.ui.kd kdVar = this.F;
            if (kdVar.getDrawable() != null) {
                kdVar.getDrawable().setAlpha((int) (getAlpha() * this.f26720s * 255.0f));
                kdVar.draw(canvas);
                kdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b30.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.f34181b && !tVar.f34200r && tVar.v && tVar.f34179a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.P.f27043r.F2) {
            d(canvas);
            return;
        }
        if (this.f26720s > 0.0f) {
            float measuredWidth = (1.0f - this.f26720s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f26718n);
            d(canvas);
        }
        y9 y9Var = this.d;
        float x9 = y9Var.getX() + (y9Var.getMeasuredWidth() / 2);
        float y3 = y9Var.getY() + (y9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.g4 g4Var = this.J;
        g4Var.f();
        g4Var.a(canvas, x9, y3, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f7 = this.f26720s;
        float f10 = (f7 * 1.0f) + ((1.0f - f7) * dp);
        y9Var.setScaleX(g4Var.b() * f10);
        y9Var.setScaleY(g4Var.b() * f10);
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
        c30 c30Var = this.P;
        int i10 = c30Var.d;
        this.f26717f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        int i11 = (peerId > 0L ? 1 : (peerId == 0L ? 0 : -1));
        boolean z11 = true;
        y9 y9Var = this.d;
        j9 j9Var = this.f26714a;
        if (i11 > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.f26715b = user;
            this.f26716c = null;
            j9Var.m(i10, user);
            this.f26722x = UserObject.getFirstName(this.f26715b);
            y9Var.getImageReceiver().setCurrentAccount(i10);
            y9Var.h(ImageLocation.getForUser(this.f26715b, 1), "50_50", j9Var, this.f26715b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.f26716c = chat;
            this.f26715b = null;
            j9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f26716c;
            if (chat2 != null) {
                this.f26722x = chat2.title;
                y9Var.getImageReceiver().setCurrentAccount(i10);
                y9Var.h(ImageLocation.getForChat(this.f26716c, 1), "50_50", j9Var, this.f26716c);
            }
        }
        if (j10 == this.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (c30Var.f27042n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = c30Var.f27042n.e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b30.f(boolean):void");
    }

    public y9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.e;
    }

    public float getProgressToFullscreen() {
        return this.f26720s;
    }

    public org.telegram.ui.Components.voip.t getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f26717f;
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
            this.P.f27042n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c30 c30Var = this.P;
        org.telegram.ui.x50 x50Var = c30Var.f27043r;
        if (c30Var.f27044s && this.f26717f != null) {
            b(true);
        }
        this.K = true;
        if (x50Var.f45571t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.o0) ic.a.y(1, x50Var.f45571t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.o0();
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.I;
        o0Var.f34089g = this;
        o0Var.f34087c = this.F;
        o0Var.c(false);
        org.telegram.ui.Components.voip.o0 o0Var2 = this.I;
        o0Var2.h = this.h;
        o0Var2.c(false);
        f(false);
        boolean z10 = this.I.e;
        org.telegram.ui.Cells.g4 g4Var = this.J;
        g4Var.e(this, z10);
        if (!this.I.e) {
            g4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.o0 o0Var = this.I;
        if (o0Var != null) {
            this.P.f27043r.f45571t2.add(o0Var);
            org.telegram.ui.Components.voip.o0 o0Var2 = this.I;
            o0Var2.f34087c = null;
            o0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f26722x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f26722x));
            this.f26723y = min;
            this.f26721w = TextUtils.ellipsize(this.f26722x, textPaint, min, TextUtils.TruncateAt.END).toString();
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
        if (this.f26720s != f7) {
            this.f26720s = f7;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            Paint paint = this.f26718n;
            y9 y9Var = this.d;
            if (i10 == 0) {
                y9Var.setTranslationY(0.0f);
                y9Var.setScaleX(1.0f);
                y9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.t tVar = this.v;
                if (tVar != null) {
                    tVar.invalidate();
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
            org.telegram.ui.Components.voip.t tVar2 = this.v;
            if (tVar2 != null) {
                tVar2.invalidate();
            }
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.t tVar) {
        this.v = tVar;
    }

    @Override
    public final void updateColors() {
        try {
            this.f26718n.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23664tg, false));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

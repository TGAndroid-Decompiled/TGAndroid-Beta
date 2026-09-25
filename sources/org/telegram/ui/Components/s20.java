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
public final class s20 extends FrameLayout implements org.telegram.ui.Components.voip.o0 {
    public final TextPaint E;
    public final org.telegram.ui.id F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.p0 I;
    public final org.telegram.ui.Cells.c4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final t20 P;
    public final h9 f28108a;
    public TLRPC.User f28109b;
    public TLRPC.Chat f28110c;
    public final w9 d;
    public long e;
    public ChatObject.VideoParticipant f28111f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f28112n;
    public final Paint f28113r;
    public float f28114s;
    public org.telegram.ui.Components.voip.u v;
    public String f28115w;
    public String f28116x;
    public int f28117y;

    public s20(t20 t20Var, Context context) {
        super(context);
        this.P = t20Var;
        h9 h9Var = new h9((org.telegram.ui.ActionBar.d6) null);
        this.f28108a = h9Var;
        Paint paint = new Paint(1);
        this.f28112n = paint;
        Paint paint2 = new Paint(1);
        this.f28113r = paint2;
        this.f28114s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        h9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var, w7.y5.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19364tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19308qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.id idVar = new org.telegram.ui.id(this, context, 1);
        this.F = idVar;
        idVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(idVar, w7.y5.c(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f28113r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z10) {
        t20 t20Var = this.P;
        if (!t20Var.f28391r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.u.c(t20Var.h, t20Var.f28390n, null, this, null, this.f28111f, t20Var.f28388c, t20Var.f28391r);
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
        if (this.f28115w != null) {
            canvas.save();
            int A = org.telegram.messenger.ok.A(24.0f, getMeasuredWidth() - this.f28117y, 2);
            int alpha = (int) (getAlpha() * this.f28114s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f28115w, AndroidUtilities.dp(22.0f) + A, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(A, AndroidUtilities.dp(53.0f));
            org.telegram.ui.id idVar = this.F;
            if (idVar.getDrawable() != null) {
                idVar.getDrawable().setAlpha((int) (getAlpha() * this.f28114s * 255.0f));
                idVar.draw(canvas);
                idVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s20.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null && !uVar.f29645b && !uVar.f29664r && uVar.v && uVar.f29643a.d.isFirstFrameRendered() && uVar.getAlpha() == 1.0f && !this.P.f28391r.F2) {
            d(canvas);
            return;
        }
        if (this.f28114s > 0.0f) {
            float measuredWidth = (1.0f - this.f28114s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f28112n);
            d(canvas);
        }
        w9 w9Var = this.d;
        float x10 = w9Var.getX() + (w9Var.getMeasuredWidth() / 2);
        float y3 = w9Var.getY() + (w9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.c4 c4Var = this.J;
        c4Var.f();
        c4Var.a(canvas, x10, y3, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f7 = this.f28114s;
        float f10 = (f7 * 1.0f) + ((1.0f - f7) * dp);
        w9Var.setScaleX(c4Var.b() * f10);
        w9Var.setScaleY(c4Var.b() * f10);
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
        t20 t20Var = this.P;
        int i10 = t20Var.d;
        this.f28111f = videoParticipant;
        this.h = groupCallParticipant;
        long j3 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        boolean z11 = true;
        w9 w9Var = this.d;
        h9 h9Var = this.f28108a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.f28109b = user;
            this.f28110c = null;
            h9Var.m(i10, user);
            this.f28116x = UserObject.getFirstName(this.f28109b);
            w9Var.getImageReceiver().setCurrentAccount(i10);
            w9Var.h(ImageLocation.getForUser(this.f28109b, 1), "50_50", h9Var, this.f28109b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.f28110c = chat;
            this.f28109b = null;
            h9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f28110c;
            if (chat2 != null) {
                this.f28116x = chat2.title;
                w9Var.getImageReceiver().setCurrentAccount(i10);
                w9Var.h(ImageLocation.getForChat(this.f28110c, 1), "50_50", h9Var, this.f28110c);
            }
        }
        if (j3 == this.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (t20Var.f28390n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = t20Var.f28390n.e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.s20.f(boolean):void");
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
        return this.f28114s;
    }

    public org.telegram.ui.Components.voip.u getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f28111f;
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
            this.P.f28390n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t20 t20Var = this.P;
        org.telegram.ui.d60 d60Var = t20Var.f28391r;
        if (t20Var.f28392s && this.f28111f != null) {
            b(true);
        }
        this.K = true;
        if (d60Var.f33015t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.p0) hg.c.x(1, d60Var.f33015t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.p0();
        }
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        p0Var.f29543g = this;
        p0Var.f29541c = this.F;
        p0Var.c(false);
        org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
        p0Var2.h = this.h;
        p0Var2.c(false);
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
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        if (p0Var != null) {
            this.P.f28391r.f33015t2.add(p0Var);
            org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
            p0Var2.f29541c = null;
            p0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f28116x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f28116x));
            this.f28117y = min;
            this.f28115w = TextUtils.ellipsize(this.f28116x, textPaint, min, TextUtils.TruncateAt.END).toString();
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
        if (this.f28114s != f7) {
            this.f28114s = f7;
            Paint paint = this.f28112n;
            w9 w9Var = this.d;
            if (f7 == 1.0f) {
                w9Var.setTranslationY(0.0f);
                w9Var.setScaleX(1.0f);
                w9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.u uVar = this.v;
                if (uVar != null) {
                    uVar.invalidate();
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

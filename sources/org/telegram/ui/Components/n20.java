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
public final class n20 extends FrameLayout implements org.telegram.ui.Components.voip.n0 {
    public final TextPaint A;
    public final org.telegram.ui.ed B;
    public float C;
    public boolean D;
    public org.telegram.ui.Components.voip.o0 E;
    public final org.telegram.ui.Cells.a4 F;
    public boolean G;
    public int H;
    public int I;
    public ValueAnimator J;
    public boolean K;
    public final o20 L;
    public final e9 f30826a;
    public TLRPC.User f30827b;
    public TLRPC.Chat f30828c;
    public final t9 d;
    public long f30829e;
    public ChatObject.VideoParticipant f30830f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f30831n;
    public final Paint f30832r;
    public float f30833s;
    public org.telegram.ui.Components.voip.u v;
    public String f30834w;
    public String f30835x;
    public int f30836y;

    public n20(o20 o20Var, Context context) {
        super(context);
        this.L = o20Var;
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        this.f30826a = e9Var;
        Paint paint = new Paint(1);
        this.f30831n = paint;
        Paint paint2 = new Paint(1);
        this.f30832r = paint2;
        this.f30833s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.A = textPaint;
        this.F = new org.telegram.ui.Cells.a4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        e9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        t9 t9Var = new t9(context);
        this.d = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(t9Var, i7.f6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23356tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23302qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.ed edVar = new org.telegram.ui.ed(this, context, 1);
        this.B = edVar;
        edVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(edVar, i7.f6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f9) {
        if (this.C != f9) {
            this.C = f9;
            this.f30832r.setAlpha((int) (f9 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.F.e(this, this.E.f33875e);
        f(true);
    }

    public final void b(boolean z10) {
        o20 o20Var = this.L;
        if (!o20Var.f31239r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.u.c(o20Var.h, o20Var.f31238n, null, this, null, this.f30830f, o20Var.f31235c, o20Var.f31239r);
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
        if (this.f30834w != null) {
            canvas.save();
            int x4 = org.telegram.ui.b.x(24.0f, getMeasuredWidth() - this.f30836y, 2);
            int alpha = (int) (getAlpha() * this.f30833s * 255.0f);
            TextPaint textPaint = this.A;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f30834w, AndroidUtilities.dp(22.0f) + x4, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(x4, AndroidUtilities.dp(53.0f));
            org.telegram.ui.ed edVar = this.B;
            if (edVar.getDrawable() != null) {
                edVar.getDrawable().setAlpha((int) (getAlpha() * this.f30833s * 255.0f));
                edVar.draw(canvas);
                edVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n20.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null && !uVar.f34016b && !uVar.f34036r && uVar.v && uVar.f34014a.d.isFirstFrameRendered() && uVar.getAlpha() == 1.0f && !this.L.f31239r.B2) {
            d(canvas);
            return;
        }
        if (this.f30833s > 0.0f) {
            float measuredWidth = (1.0f - this.f30833s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f30831n);
            d(canvas);
        }
        t9 t9Var = this.d;
        float x4 = t9Var.getX() + (t9Var.getMeasuredWidth() / 2);
        float y8 = t9Var.getY() + (t9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.a4 a4Var = this.F;
        a4Var.f();
        a4Var.a(canvas, x4, y8, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f9 = this.f30833s;
        float f10 = (f9 * 1.0f) + ((1.0f - f9) * dp);
        t9Var.setScaleX(a4Var.b() * f10);
        t9Var.setScaleY(a4Var.b() * f10);
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.B) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(ChatObject.VideoParticipant videoParticipant, TLRPC.GroupCallParticipant groupCallParticipant) {
        boolean z10;
        float f9;
        o20 o20Var = this.L;
        int i10 = o20Var.d;
        this.f30830f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.f30829e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.f30829e = peerId;
        boolean z11 = true;
        t9 t9Var = this.d;
        e9 e9Var = this.f30826a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.f30829e));
            this.f30827b = user;
            this.f30828c = null;
            e9Var.m(i10, user);
            this.f30835x = UserObject.getFirstName(this.f30827b);
            t9Var.getImageReceiver().setCurrentAccount(i10);
            t9Var.h(ImageLocation.getForUser(this.f30827b, 1), "50_50", e9Var, this.f30827b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.f30829e));
            this.f30828c = chat;
            this.f30827b = null;
            e9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f30828c;
            if (chat2 != null) {
                this.f30835x = chat2.title;
                t9Var.getImageReceiver().setCurrentAccount(i10);
                t9Var.h(ImageLocation.getForChat(this.f30828c, 1), "50_50", e9Var, this.f30828c);
            }
        }
        if (j10 == this.f30829e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (o20Var.f31238n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.D = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = o20Var.f31238n.f33801e;
            if (videoParticipant2 != null) {
                this.D = videoParticipant2.equals(videoParticipant);
            } else {
                this.D = false;
            }
        }
        if (!z10) {
            if (this.D) {
                f9 = 1.0f;
            } else {
                f9 = 0.0f;
            }
            setSelectedProgress(f9);
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.E;
        if (o0Var != null) {
            o0Var.h = groupCallParticipant;
            o0Var.c(z10);
            f(z10);
        }
    }

    public final void f(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n20.f(boolean):void");
    }

    public t9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f30829e;
    }

    public float getProgressToFullscreen() {
        return this.f30833s;
    }

    public org.telegram.ui.Components.voip.u getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f30830f;
    }

    @Override
    public final void invalidate() {
        if (this.K) {
            return;
        }
        this.K = true;
        super.invalidate();
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null) {
            uVar.invalidate();
        } else {
            this.L.f31238n.invalidate();
        }
        this.K = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o20 o20Var = this.L;
        org.telegram.ui.r50 r50Var = o20Var.f31239r;
        if (o20Var.f31240s && this.f30830f != null) {
            b(true);
        }
        this.G = true;
        if (r50Var.f41931p2.size() > 0) {
            this.E = (org.telegram.ui.Components.voip.o0) com.google.android.recaptcha.internal.a.j(1, r50Var.f41931p2);
        } else {
            this.E = new org.telegram.ui.Components.voip.o0();
        }
        org.telegram.ui.Components.voip.o0 o0Var = this.E;
        o0Var.f33877g = this;
        o0Var.f33874c = this.B;
        o0Var.c(false);
        org.telegram.ui.Components.voip.o0 o0Var2 = this.E;
        o0Var2.h = this.h;
        o0Var2.c(false);
        f(false);
        boolean z10 = this.E.f33875e;
        org.telegram.ui.Cells.a4 a4Var = this.F;
        a4Var.e(this, z10);
        if (!this.E.f33875e) {
            a4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.G = false;
        org.telegram.ui.Components.voip.o0 o0Var = this.E;
        if (o0Var != null) {
            this.L.f31239r.f41931p2.add(o0Var);
            org.telegram.ui.Components.voip.o0 o0Var2 = this.E;
            o0Var2.f33874c = null;
            o0Var2.c(false);
            this.E.b();
        }
        this.E = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.A;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f30835x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f30835x));
            this.f30836y = min;
            this.f30834w = TextUtils.ellipsize(this.f30835x, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f9) {
        super.setAlpha(f9);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.o0 o0Var = this.E;
        if (o0Var != null) {
            o0Var.a(d);
        }
        this.F.c(d);
    }

    public void setProgressToFullscreen(float f9) {
        if (this.f30833s != f9) {
            this.f30833s = f9;
            Paint paint = this.f30831n;
            t9 t9Var = this.d;
            if (f9 == 1.0f) {
                t9Var.setTranslationY(0.0f);
                t9Var.setScaleX(1.0f);
                t9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.u uVar = this.v;
                if (uVar != null) {
                    uVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((t9Var.getMeasuredHeight() / 2.0f) + t9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f10 = 1.0f - f9;
            float f11 = 1.0f * f9;
            float dp = f11 + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f10);
            t9Var.setTranslationY((-measuredHeight) * f10);
            t9Var.setScaleX(dp);
            t9Var.setScaleY(dp);
            paint.setAlpha((int) (f9 * 255.0f));
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

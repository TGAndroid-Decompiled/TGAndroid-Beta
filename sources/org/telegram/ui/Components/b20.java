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
public final class b20 extends FrameLayout implements org.telegram.ui.Components.voip.m0 {
    public final TextPaint A;
    public final org.telegram.ui.fd B;
    public float C;
    public boolean D;
    public org.telegram.ui.Components.voip.n0 E;
    public final org.telegram.ui.Cells.c4 F;
    public boolean G;
    public int H;
    public int I;
    public ValueAnimator J;
    public boolean K;
    public final c20 L;
    public final z8 f26987a;
    public TLRPC.User f26988b;
    public TLRPC.Chat f26989c;
    public final o9 d;
    public long f26990e;
    public ChatObject.VideoParticipant f26991f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f26992n;
    public final Paint f26993r;
    public float f26994s;
    public org.telegram.ui.Components.voip.t v;
    public String f26995w;
    public String f26996x;
    public int f26997y;

    public b20(c20 c20Var, Context context) {
        super(context);
        this.L = c20Var;
        z8 z8Var = new z8((org.telegram.ui.ActionBar.b6) null);
        this.f26987a = z8Var;
        Paint paint = new Paint(1);
        this.f26992n = paint;
        Paint paint2 = new Paint(1);
        this.f26993r = paint2;
        this.f26994s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.A = textPaint;
        this.F = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        z8Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        o9 o9Var = new o9(context);
        this.d = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(o9Var, g7.e6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23295tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23239qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.fd fdVar = new org.telegram.ui.fd(this, context, 1);
        this.B = fdVar;
        fdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(fdVar, g7.e6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.C != f10) {
            this.C = f10;
            this.f26993r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.F.e(this, this.E.f33678e);
        f(true);
    }

    public final void b(boolean z10) {
        c20 c20Var = this.L;
        if (!c20Var.f27353r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.t.c(c20Var.h, c20Var.f27352n, null, this, null, this.f26991f, c20Var.f27349c, c20Var.f27353r);
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
        if (this.f26995w != null) {
            canvas.save();
            int y10 = org.telegram.messenger.ll.y(24.0f, getMeasuredWidth() - this.f26997y, 2);
            int alpha = (int) (getAlpha() * this.f26994s * 255.0f);
            TextPaint textPaint = this.A;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f26995w, AndroidUtilities.dp(22.0f) + y10, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y10, AndroidUtilities.dp(53.0f));
            org.telegram.ui.fd fdVar = this.B;
            if (fdVar.getDrawable() != null) {
                fdVar.getDrawable().setAlpha((int) (getAlpha() * this.f26994s * 255.0f));
                fdVar.draw(canvas);
                fdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b20.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.f33823b && !tVar.f33843r && tVar.v && tVar.f33821a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.L.f27353r.B2) {
            d(canvas);
            return;
        }
        if (this.f26994s > 0.0f) {
            float measuredWidth = (1.0f - this.f26994s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f26992n);
            d(canvas);
        }
        o9 o9Var = this.d;
        float x10 = o9Var.getX() + (o9Var.getMeasuredWidth() / 2);
        float y10 = o9Var.getY() + (o9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.c4 c4Var = this.F;
        c4Var.f();
        c4Var.a(canvas, x10, y10, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f10 = this.f26994s;
        float f11 = (f10 * 1.0f) + ((1.0f - f10) * dp);
        o9Var.setScaleX(c4Var.b() * f11);
        o9Var.setScaleY(c4Var.b() * f11);
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
        float f10;
        c20 c20Var = this.L;
        int i9 = c20Var.d;
        this.f26991f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.f26990e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.f26990e = peerId;
        boolean z11 = true;
        o9 o9Var = this.d;
        z8 z8Var = this.f26987a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i9).getMessagesController().getUser(Long.valueOf(this.f26990e));
            this.f26988b = user;
            this.f26989c = null;
            z8Var.m(i9, user);
            this.f26996x = UserObject.getFirstName(this.f26988b);
            o9Var.getImageReceiver().setCurrentAccount(i9);
            o9Var.h(ImageLocation.getForUser(this.f26988b, 1), "50_50", z8Var, this.f26988b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i9).getMessagesController().getChat(Long.valueOf(-this.f26990e));
            this.f26989c = chat;
            this.f26988b = null;
            z8Var.k(i9, chat);
            TLRPC.Chat chat2 = this.f26989c;
            if (chat2 != null) {
                this.f26996x = chat2.title;
                o9Var.getImageReceiver().setCurrentAccount(i9);
                o9Var.h(ImageLocation.getForChat(this.f26989c, 1), "50_50", z8Var, this.f26989c);
            }
        }
        if (j10 == this.f26990e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (c20Var.f27352n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.D = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = c20Var.f27352n.f33603e;
            if (videoParticipant2 != null) {
                this.D = videoParticipant2.equals(videoParticipant);
            } else {
                this.D = false;
            }
        }
        if (!z10) {
            if (this.D) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            setSelectedProgress(f10);
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        if (n0Var != null) {
            n0Var.h = groupCallParticipant;
            n0Var.c(z10);
            f(z10);
        }
    }

    public final void f(boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b20.f(boolean):void");
    }

    public o9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f26990e;
    }

    public float getProgressToFullscreen() {
        return this.f26994s;
    }

    public org.telegram.ui.Components.voip.t getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f26991f;
    }

    @Override
    public final void invalidate() {
        if (this.K) {
            return;
        }
        this.K = true;
        super.invalidate();
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null) {
            tVar.invalidate();
        } else {
            this.L.f27352n.invalidate();
        }
        this.K = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c20 c20Var = this.L;
        org.telegram.ui.o50 o50Var = c20Var.f27353r;
        if (c20Var.f27354s && this.f26991f != null) {
            b(true);
        }
        this.G = true;
        if (o50Var.f40944p2.size() > 0) {
            this.E = (org.telegram.ui.Components.voip.n0) e2.c.k(1, o50Var.f40944p2);
        } else {
            this.E = new org.telegram.ui.Components.voip.n0();
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        n0Var.f33680g = this;
        n0Var.f33677c = this.B;
        n0Var.c(false);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.E;
        n0Var2.h = this.h;
        n0Var2.c(false);
        f(false);
        boolean z10 = this.E.f33678e;
        org.telegram.ui.Cells.c4 c4Var = this.F;
        c4Var.e(this, z10);
        if (!this.E.f33678e) {
            c4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.G = false;
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        if (n0Var != null) {
            this.L.f27353r.f40944p2.add(n0Var);
            org.telegram.ui.Components.voip.n0 n0Var2 = this.E;
            n0Var2.f33677c = null;
            n0Var2.c(false);
            this.E.b();
        }
        this.E = null;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        TextPaint textPaint = this.A;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f26996x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f26996x));
            this.f26997y = min;
            this.f26995w = TextUtils.ellipsize(this.f26996x, textPaint, min, TextUtils.TruncateAt.END).toString();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setAmplitude(double d) {
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        if (n0Var != null) {
            n0Var.a(d);
        }
        this.F.c(d);
    }

    public void setProgressToFullscreen(float f10) {
        if (this.f26994s != f10) {
            this.f26994s = f10;
            Paint paint = this.f26992n;
            o9 o9Var = this.d;
            if (f10 == 1.0f) {
                o9Var.setTranslationY(0.0f);
                o9Var.setScaleX(1.0f);
                o9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.t tVar = this.v;
                if (tVar != null) {
                    tVar.invalidate();
                    return;
                }
                return;
            }
            float measuredHeight = ((o9Var.getMeasuredHeight() / 2.0f) + o9Var.getTop()) - (getMeasuredHeight() / 2.0f);
            float f11 = 1.0f - f10;
            float f12 = 1.0f * f10;
            float dp = f12 + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f11);
            o9Var.setTranslationY((-measuredHeight) * f11);
            o9Var.setScaleX(dp);
            o9Var.setScaleY(dp);
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

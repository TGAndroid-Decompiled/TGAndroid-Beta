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
public final class a30 extends FrameLayout implements org.telegram.ui.Components.voip.o0 {
    public final TextPaint E;
    public final org.telegram.ui.kd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.p0 I;
    public final org.telegram.ui.Cells.b4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final b30 P;
    public final g9 f21366a;
    public TLRPC.User f21367b;
    public TLRPC.Chat f21368c;
    public final w9 d;
    public long e;
    public ChatObject.VideoParticipant f21369f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f21370n;
    public final Paint f21371r;
    public float f21372s;
    public org.telegram.ui.Components.voip.t v;
    public String f21373w;
    public String f21374x;
    public int f21375y;

    public a30(b30 b30Var, Context context) {
        super(context);
        this.P = b30Var;
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        this.f21366a = g9Var;
        Paint paint = new Paint(1);
        this.f21370n = paint;
        Paint paint2 = new Paint(1);
        this.f21371r = paint2;
        this.f21372s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.b4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        g9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var, w7.a6.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18227tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18171qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.kd kdVar = new org.telegram.ui.kd(this, context, 1);
        this.F = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(kdVar, w7.a6.c(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f21371r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z10) {
        b30 b30Var = this.P;
        if (!b30Var.f21696r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.t.c(b30Var.h, b30Var.f21695n, null, this, null, this.f21369f, b30Var.f21693c, b30Var.f21696r);
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
        if (this.f21373w != null) {
            canvas.save();
            int y3 = org.telegram.messenger.em.y(24.0f, getMeasuredWidth() - this.f21375y, 2);
            int alpha = (int) (getAlpha() * this.f21372s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f21373w, AndroidUtilities.dp(22.0f) + y3, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(y3, AndroidUtilities.dp(53.0f));
            org.telegram.ui.kd kdVar = this.F;
            if (kdVar.getDrawable() != null) {
                kdVar.getDrawable().setAlpha((int) (getAlpha() * this.f21372s * 255.0f));
                kdVar.draw(canvas);
                kdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a30.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.f28411b && !tVar.f28430r && tVar.v && tVar.f28409a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.P.f21696r.F2) {
            d(canvas);
            return;
        }
        if (this.f21372s > 0.0f) {
            float measuredWidth = (1.0f - this.f21372s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f21370n);
            d(canvas);
        }
        w9 w9Var = this.d;
        float x10 = w9Var.getX() + (w9Var.getMeasuredWidth() / 2);
        float y3 = w9Var.getY() + (w9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.b4 b4Var = this.J;
        b4Var.f();
        b4Var.a(canvas, x10, y3, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f7 = this.f21372s;
        float f10 = (f7 * 1.0f) + ((1.0f - f7) * dp);
        w9Var.setScaleX(b4Var.b() * f10);
        w9Var.setScaleY(b4Var.b() * f10);
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
        b30 b30Var = this.P;
        int i10 = b30Var.d;
        this.f21369f = videoParticipant;
        this.h = groupCallParticipant;
        long j3 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        boolean z11 = true;
        w9 w9Var = this.d;
        g9 g9Var = this.f21366a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.f21367b = user;
            this.f21368c = null;
            g9Var.m(i10, user);
            this.f21374x = UserObject.getFirstName(this.f21367b);
            w9Var.getImageReceiver().setCurrentAccount(i10);
            w9Var.h(ImageLocation.getForUser(this.f21367b, 1), "50_50", g9Var, this.f21367b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.f21368c = chat;
            this.f21367b = null;
            g9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f21368c;
            if (chat2 != null) {
                this.f21374x = chat2.title;
                w9Var.getImageReceiver().setCurrentAccount(i10);
                w9Var.h(ImageLocation.getForChat(this.f21368c, 1), "50_50", g9Var, this.f21368c);
            }
        }
        if (j3 == this.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (b30Var.f21695n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = b30Var.f21695n.e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a30.f(boolean):void");
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
        return this.f21372s;
    }

    public org.telegram.ui.Components.voip.t getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f21369f;
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
            this.P.f21695n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b30 b30Var = this.P;
        org.telegram.ui.j60 j60Var = b30Var.f21696r;
        if (b30Var.f21697s && this.f21369f != null) {
            b(true);
        }
        this.K = true;
        if (j60Var.f34015t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.p0) hc.b.z(1, j60Var.f34015t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.p0();
        }
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        p0Var.f28332g = this;
        p0Var.f28330c = this.F;
        p0Var.c(false);
        org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
        p0Var2.h = this.h;
        p0Var2.c(false);
        f(false);
        boolean z10 = this.I.e;
        org.telegram.ui.Cells.b4 b4Var = this.J;
        b4Var.e(this, z10);
        if (!this.I.e) {
            b4Var.c(0.0d);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.K = false;
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        if (p0Var != null) {
            this.P.f21696r.f34015t2.add(p0Var);
            org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
            p0Var2.f28330c = null;
            p0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f21374x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f21374x));
            this.f21375y = min;
            this.f21373w = TextUtils.ellipsize(this.f21374x, textPaint, min, TextUtils.TruncateAt.END).toString();
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
        if (this.f21372s != f7) {
            this.f21372s = f7;
            Paint paint = this.f21370n;
            w9 w9Var = this.d;
            if (f7 == 1.0f) {
                w9Var.setTranslationY(0.0f);
                w9Var.setScaleX(1.0f);
                w9Var.setScaleY(1.0f);
                paint.setAlpha(255);
                invalidate();
                org.telegram.ui.Components.voip.t tVar = this.v;
                if (tVar != null) {
                    tVar.invalidate();
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

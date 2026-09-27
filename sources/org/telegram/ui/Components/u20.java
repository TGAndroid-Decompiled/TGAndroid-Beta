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
public final class u20 extends FrameLayout implements org.telegram.ui.Components.voip.o0 {
    public final TextPaint E;
    public final org.telegram.ui.kd F;
    public float G;
    public boolean H;
    public org.telegram.ui.Components.voip.p0 I;
    public final org.telegram.ui.Cells.c4 J;
    public boolean K;
    public int L;
    public int M;
    public ValueAnimator N;
    public boolean O;
    public final v20 P;
    public final h9 f28756a;
    public TLRPC.User f28757b;
    public TLRPC.Chat f28758c;
    public final w9 d;
    public long e;
    public ChatObject.VideoParticipant f28759f;
    public TLRPC.GroupCallParticipant h;
    public final Paint f28760n;
    public final Paint f28761r;
    public float f28762s;
    public org.telegram.ui.Components.voip.u v;
    public String f28763w;
    public String f28764x;
    public int f28765y;

    public u20(v20 v20Var, Context context) {
        super(context);
        this.P = v20Var;
        h9 h9Var = new h9((org.telegram.ui.ActionBar.e6) null);
        this.f28756a = h9Var;
        Paint paint = new Paint(1);
        this.f28760n = paint;
        Paint paint2 = new Paint(1);
        this.f28761r = paint2;
        this.f28762s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.E = textPaint;
        this.J = new org.telegram.ui.Cells.c4(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        h9Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        w9 w9Var = new w9(context);
        this.d = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(w9Var, w7.y5.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19363tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19306qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.kd kdVar = new org.telegram.ui.kd(this, context, 1);
        this.F = kdVar;
        kdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(kdVar, w7.y5.c(24.0f, 24));
    }

    private void setSelectedProgress(float f7) {
        if (this.G != f7) {
            this.G = f7;
            this.f28761r.setAlpha((int) (f7 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.J.e(this, this.I.e);
        f(true);
    }

    public final void b(boolean z10) {
        v20 v20Var = this.P;
        if (!v20Var.f29018r.isDismissed()) {
            if (z10 && this.v == null) {
                this.v = org.telegram.ui.Components.voip.u.c(v20Var.h, v20Var.f29017n, null, this, null, this.f28759f, v20Var.f29015c, v20Var.f29018r);
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
        if (this.f28763w != null) {
            canvas.save();
            int z10 = org.telegram.messenger.qk.z(24.0f, getMeasuredWidth() - this.f28765y, 2);
            int alpha = (int) (getAlpha() * this.f28762s * 255.0f);
            TextPaint textPaint = this.E;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f28763w, AndroidUtilities.dp(22.0f) + z10, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(z10, AndroidUtilities.dp(53.0f));
            org.telegram.ui.kd kdVar = this.F;
            if (kdVar.getDrawable() != null) {
                kdVar.getDrawable().setAlpha((int) (getAlpha() * this.f28762s * 255.0f));
                kdVar.draw(canvas);
                kdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(android.graphics.Canvas r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u20.d(android.graphics.Canvas):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.u uVar = this.v;
        if (uVar != null && !uVar.f29587b && !uVar.f29606r && uVar.v && uVar.f29585a.d.isFirstFrameRendered() && uVar.getAlpha() == 1.0f && !this.P.f29018r.F2) {
            d(canvas);
            return;
        }
        if (this.f28762s > 0.0f) {
            float measuredWidth = (1.0f - this.f28762s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f28760n);
            d(canvas);
        }
        w9 w9Var = this.d;
        float x10 = w9Var.getX() + (w9Var.getMeasuredWidth() / 2);
        float y3 = w9Var.getY() + (w9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.c4 c4Var = this.J;
        c4Var.f();
        c4Var.a(canvas, x10, y3, this);
        float dp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f7 = this.f28762s;
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
        v20 v20Var = this.P;
        int i10 = v20Var.d;
        this.f28759f = videoParticipant;
        this.h = groupCallParticipant;
        long j3 = this.e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.e = peerId;
        boolean z11 = true;
        w9 w9Var = this.d;
        h9 h9Var = this.f28756a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.e));
            this.f28757b = user;
            this.f28758c = null;
            h9Var.m(i10, user);
            this.f28764x = UserObject.getFirstName(this.f28757b);
            w9Var.getImageReceiver().setCurrentAccount(i10);
            w9Var.h(ImageLocation.getForUser(this.f28757b, 1), "50_50", h9Var, this.f28757b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.e));
            this.f28758c = chat;
            this.f28757b = null;
            h9Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f28758c;
            if (chat2 != null) {
                this.f28764x = chat2.title;
                w9Var.getImageReceiver().setCurrentAccount(i10);
                w9Var.h(ImageLocation.getForChat(this.f28758c, 1), "50_50", h9Var, this.f28758c);
            }
        }
        if (j3 == this.e) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (videoParticipant == null) {
            if (v20Var.f29017n.d != MessageObject.getPeerId(groupCallParticipant.peer)) {
                z11 = false;
            }
            this.H = z11;
        } else {
            ChatObject.VideoParticipant videoParticipant2 = v20Var.f29017n.e;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u20.f(boolean):void");
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
        return this.f28762s;
    }

    public org.telegram.ui.Components.voip.u getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f28759f;
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
            this.P.f29017n.invalidate();
        }
        this.O = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v20 v20Var = this.P;
        org.telegram.ui.g60 g60Var = v20Var.f29018r;
        if (v20Var.f29019s && this.f28759f != null) {
            b(true);
        }
        this.K = true;
        if (g60Var.f33805t2.size() > 0) {
            this.I = (org.telegram.ui.Components.voip.p0) hg.k0.x(1, g60Var.f33805t2);
        } else {
            this.I = new org.telegram.ui.Components.voip.p0();
        }
        org.telegram.ui.Components.voip.p0 p0Var = this.I;
        p0Var.f29485g = this;
        p0Var.f29483c = this.F;
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
            this.P.f29018r.f33805t2.add(p0Var);
            org.telegram.ui.Components.voip.p0 p0Var2 = this.I;
            p0Var2.f29483c = null;
            p0Var2.c(false);
            this.I.b();
        }
        this.I = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        TextPaint textPaint = this.E;
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        if (this.f28764x != null) {
            int min = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f28764x));
            this.f28765y = min;
            this.f28763w = TextUtils.ellipsize(this.f28764x, textPaint, min, TextUtils.TruncateAt.END).toString();
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
        if (this.f28762s != f7) {
            this.f28762s = f7;
            Paint paint = this.f28760n;
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

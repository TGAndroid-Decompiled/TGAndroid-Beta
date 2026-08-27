package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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

public final class e20 extends FrameLayout implements org.telegram.ui.Components.voip.m0 {
    public final TextPaint A;
    public final org.telegram.ui.fd B;
    public float C;
    public boolean D;
    public org.telegram.ui.Components.voip.n0 E;
    public final org.telegram.ui.Cells.z3 F;
    public boolean G;
    public int H;
    public int I;
    public ValueAnimator J;
    public boolean K;
    public final f20 L;

    public final y8 f27931a;

    public TLRPC.User f27932b;

    public TLRPC.Chat f27933c;
    public final n9 d;

    public long f27934e;

    public ChatObject.VideoParticipant f27935f;
    public TLRPC.GroupCallParticipant h;

    public final Paint f27936n;

    public final Paint f27937r;

    public float f27938s;
    public org.telegram.ui.Components.voip.t v;

    public String f27939w;

    public String f27940x;

    public int f27941y;

    public e20(f20 f20Var, Context context) {
        super(context);
        this.L = f20Var;
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        this.f27931a = y8Var;
        Paint paint = new Paint(1);
        this.f27936n = paint;
        Paint paint2 = new Paint(1);
        this.f27937r = paint2;
        this.f27938s = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.A = textPaint;
        this.F = new org.telegram.ui.Cells.z3(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(29.0f));
        y8Var.u((int) (AndroidUtilities.dp(18.0f) / 1.15f));
        n9 n9Var = new n9(context);
        this.d = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(20.0f));
        addView(n9Var, h7.z5.d(40, 40.0f, 1, 0.0f, 9.0f, 0.0f, 9.0f));
        setWillNotDraw(false);
        paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23349tg, false));
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23292qg, false));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        textPaint.setColor(-1);
        org.telegram.ui.fd fdVar = new org.telegram.ui.fd(this, context, 1);
        this.B = fdVar;
        fdVar.setScaleType(ImageView.ScaleType.CENTER);
        addView(fdVar, h7.z5.c(24.0f, 24));
    }

    private void setSelectedProgress(float f10) {
        if (this.C != f10) {
            this.C = f10;
            this.f27937r.setAlpha((int) (f10 * 255.0f));
        }
    }

    @Override
    public final void a() {
        this.F.e(this, this.E.f33728e);
        f(true);
    }

    public final void b(boolean z10) {
        f20 f20Var = this.L;
        if (f20Var.f28237r.isDismissed()) {
            return;
        }
        if (z10 && this.v == null) {
            this.v = org.telegram.ui.Components.voip.t.c(f20Var.h, f20Var.f28236n, null, this, null, this.f27935f, f20Var.f28233c, f20Var.f28237r);
        } else {
            if (z10) {
                return;
            }
            org.telegram.ui.Components.voip.t tVar = this.v;
            if (tVar != null) {
                tVar.setSecondaryView(null);
            }
            this.v = null;
        }
    }

    public final void c(Canvas canvas) {
        if (this.f27939w != null) {
            canvas.save();
            int iX = org.telegram.messenger.rl.x(24.0f, getMeasuredWidth() - this.f27941y, 2);
            int alpha = (int) (getAlpha() * this.f27938s * 255.0f);
            TextPaint textPaint = this.A;
            textPaint.setAlpha(alpha);
            canvas.drawText(this.f27939w, AndroidUtilities.dp(22.0f) + iX, AndroidUtilities.dp(69.0f), textPaint);
            canvas.restore();
            canvas.save();
            canvas.translate(iX, AndroidUtilities.dp(53.0f));
            org.telegram.ui.fd fdVar = this.B;
            if (fdVar.getDrawable() != null) {
                fdVar.getDrawable().setAlpha((int) (getAlpha() * this.f27938s * 255.0f));
                fdVar.draw(canvas);
                fdVar.getDrawable().setAlpha(255);
            }
            canvas.restore();
        }
    }

    public final void d(Canvas canvas) {
        float f10;
        float f11;
        boolean z10 = this.D;
        if (z10) {
            float f12 = this.C;
            if (f12 != 1.0f) {
                float f13 = f12 + 0.10666667f;
                if (f13 > 1.0f) {
                    f13 = 1.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f13);
            } else if (!z10) {
                f10 = this.C;
                if (f10 != 0.0f) {
                    f11 = f10 - 0.10666667f;
                    if (f11 < 0.0f) {
                        f11 = 0.0f;
                    } else {
                        invalidate();
                    }
                    setSelectedProgress(f11);
                }
            }
        } else if (!z10) {
            f10 = this.C;
            if (f10 != 0.0f) {
                f11 = f10 - 0.10666667f;
                if (f11 < 0.0f) {
                    f11 = 0.0f;
                } else {
                    invalidate();
                }
                setSelectedProgress(f11);
            }
        }
        if (this.C > 0.0f) {
            float measuredWidth = (1.0f - this.f27938s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            Paint paint = this.f27937r;
            rectF.inset(paint.getStrokeWidth() / 2.0f, paint.getStrokeWidth() / 2.0f);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), paint);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.voip.t tVar = this.v;
        if (tVar != null && !tVar.f33873b && !tVar.f33893r && tVar.v && tVar.f33871a.d.isFirstFrameRendered() && tVar.getAlpha() == 1.0f && !this.L.f28237r.B2) {
            d(canvas);
            return;
        }
        if (this.f27938s > 0.0f) {
            float measuredWidth = (1.0f - this.f27938s) * (getMeasuredWidth() / 2.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(measuredWidth, measuredWidth, getMeasuredWidth() - measuredWidth, getMeasuredHeight() - measuredWidth);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), this.f27936n);
            d(canvas);
        }
        n9 n9Var = this.d;
        float x8 = n9Var.getX() + (n9Var.getMeasuredWidth() / 2);
        float y10 = n9Var.getY() + (n9Var.getMeasuredHeight() / 2);
        org.telegram.ui.Cells.z3 z3Var = this.F;
        z3Var.f();
        z3Var.a(canvas, x8, y10, this);
        float fDp = AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f);
        float f10 = this.f27938s;
        float f11 = (f10 * 1.0f) + ((1.0f - f10) * fDp);
        n9Var.setScaleX(z3Var.b() * f11);
        n9Var.setScaleY(z3Var.b() * f11);
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
        f20 f20Var = this.L;
        int i10 = f20Var.d;
        this.f27935f = videoParticipant;
        this.h = groupCallParticipant;
        long j10 = this.f27934e;
        long peerId = MessageObject.getPeerId(groupCallParticipant.peer);
        this.f27934e = peerId;
        n9 n9Var = this.d;
        y8 y8Var = this.f27931a;
        if (peerId > 0) {
            TLRPC.User user = AccountInstance.getInstance(i10).getMessagesController().getUser(Long.valueOf(this.f27934e));
            this.f27932b = user;
            this.f27933c = null;
            y8Var.m(i10, user);
            this.f27940x = UserObject.getFirstName(this.f27932b);
            n9Var.getImageReceiver().setCurrentAccount(i10);
            n9Var.h(ImageLocation.getForUser(this.f27932b, 1), "50_50", y8Var, this.f27932b);
        } else {
            TLRPC.Chat chat = AccountInstance.getInstance(i10).getMessagesController().getChat(Long.valueOf(-this.f27934e));
            this.f27933c = chat;
            this.f27932b = null;
            y8Var.k(i10, chat);
            TLRPC.Chat chat2 = this.f27933c;
            if (chat2 != null) {
                this.f27940x = chat2.title;
                n9Var.getImageReceiver().setCurrentAccount(i10);
                n9Var.h(ImageLocation.getForChat(this.f27933c, 1), "50_50", y8Var, this.f27933c);
            }
        }
        boolean z10 = j10 == this.f27934e;
        if (videoParticipant == null) {
            this.D = f20Var.f28236n.d == MessageObject.getPeerId(groupCallParticipant.peer);
        } else {
            ChatObject.VideoParticipant videoParticipant2 = f20Var.f28236n.f33653e;
            if (videoParticipant2 != null) {
                this.D = videoParticipant2.equals(videoParticipant);
            } else {
                this.D = false;
            }
        }
        if (!z10) {
            setSelectedProgress(this.D ? 1.0f : 0.0f);
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        if (n0Var != null) {
            n0Var.h = groupCallParticipant;
            n0Var.c(z10);
            f(z10);
        }
    }

    public final void f(boolean z10) {
        int iW0;
        int iW1;
        int iW2;
        ValueAnimator valueAnimator;
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        if (n0Var == null) {
            return;
        }
        n0Var.c(z10);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.E;
        if (!n0Var2.f33733k) {
            if (n0Var2.f33728e) {
                iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23292qg, false);
            } else {
                iW0 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23242ng, false);
                iW1 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23275pg, false);
            }
            if (!z10) {
                int i10 = this.H;
                int i11 = this.I;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.J = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new hh.db(this, i10, iW0, i11, iW1, 1));
                this.J.addListener(new nh.q2(this, iW0, iW1, 1));
                this.J.start();
                return;
            }
            valueAnimator = this.J;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.J.cancel();
            }
            this.H = iW0;
            this.I = iW1;
            this.B.setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.MULTIPLY));
            this.A.setColor(this.H);
            this.f27937r.setColor(iW1);
            this.F.d(i0.b.k(iW1, 38));
            invalidate();
        }
        iW2 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23330sg, false);
        iW0 = iW2;
        iW1 = iW0;
        if (!z10) {
            int i12 = this.H;
            int i13 = this.I;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.J = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new hh.db(this, i12, iW0, i13, iW1, 1));
            this.J.addListener(new nh.q2(this, iW0, iW1, 1));
            this.J.start();
            return;
        }
        valueAnimator = this.J;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.J.cancel();
        }
        this.H = iW0;
        this.I = iW1;
        this.B.setColorFilter(new PorterDuffColorFilter(iW0, PorterDuff.Mode.MULTIPLY));
        this.A.setColor(this.H);
        this.f27937r.setColor(iW1);
        this.F.d(i0.b.k(iW1, 38));
        invalidate();
    }

    public n9 getAvatarImageView() {
        return this.d;
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.h;
    }

    public long getPeerId() {
        return this.f27934e;
    }

    public float getProgressToFullscreen() {
        return this.f27938s;
    }

    public org.telegram.ui.Components.voip.t getRenderer() {
        return this.v;
    }

    public ChatObject.VideoParticipant getVideoParticipant() {
        return this.f27935f;
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
            this.L.f28236n.invalidate();
        }
        this.K = false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f20 f20Var = this.L;
        org.telegram.ui.s50 s50Var = f20Var.f28237r;
        if (f20Var.f28238s && this.f27935f != null) {
            b(true);
        }
        this.G = true;
        if (s50Var.f42473p2.size() > 0) {
            this.E = (org.telegram.ui.Components.voip.n0) com.google.android.recaptcha.internal.a.k(1, s50Var.f42473p2);
        } else {
            this.E = new org.telegram.ui.Components.voip.n0();
        }
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        n0Var.f33730g = this;
        n0Var.f33727c = this.B;
        n0Var.c(false);
        org.telegram.ui.Components.voip.n0 n0Var2 = this.E;
        n0Var2.h = this.h;
        n0Var2.c(false);
        f(false);
        boolean z10 = this.E.f33728e;
        org.telegram.ui.Cells.z3 z3Var = this.F;
        z3Var.e(this, z10);
        if (this.E.f33728e) {
            return;
        }
        z3Var.c(0.0d);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b(false);
        this.G = false;
        org.telegram.ui.Components.voip.n0 n0Var = this.E;
        if (n0Var != null) {
            this.L.f28237r.f42473p2.add(n0Var);
            org.telegram.ui.Components.voip.n0 n0Var2 = this.E;
            n0Var2.f33727c = null;
            n0Var2.c(false);
            this.E.b();
        }
        this.E = null;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float fDp = AndroidUtilities.dp(12.0f);
        TextPaint textPaint = this.A;
        textPaint.setTextSize(fDp);
        if (this.f27940x != null) {
            int iMin = (int) Math.min(AndroidUtilities.dp(46.0f), textPaint.measureText(this.f27940x));
            this.f27941y = iMin;
            this.f27939w = TextUtils.ellipsize(this.f27940x, textPaint, iMin, TextUtils.TruncateAt.END).toString();
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
        if (this.f27938s == f10) {
            return;
        }
        this.f27938s = f10;
        Paint paint = this.f27936n;
        n9 n9Var = this.d;
        if (f10 == 1.0f) {
            n9Var.setTranslationY(0.0f);
            n9Var.setScaleX(1.0f);
            n9Var.setScaleY(1.0f);
            paint.setAlpha(255);
            invalidate();
            org.telegram.ui.Components.voip.t tVar = this.v;
            if (tVar != null) {
                tVar.invalidate();
                return;
            }
            return;
        }
        float measuredHeight = ((n9Var.getMeasuredHeight() / 2.0f) + n9Var.getTop()) - (getMeasuredHeight() / 2.0f);
        float f11 = 1.0f - f10;
        float fDp = (1.0f * f10) + ((AndroidUtilities.dp(46.0f) / AndroidUtilities.dp(40.0f)) * f11);
        n9Var.setTranslationY((-measuredHeight) * f11);
        n9Var.setScaleX(fDp);
        n9Var.setScaleY(fDp);
        paint.setAlpha((int) (f10 * 255.0f));
        invalidate();
        org.telegram.ui.Components.voip.t tVar2 = this.v;
        if (tVar2 != null) {
            tVar2.invalidate();
        }
    }

    public void setRenderer(org.telegram.ui.Components.voip.t tVar) {
        this.v = tVar;
    }
}

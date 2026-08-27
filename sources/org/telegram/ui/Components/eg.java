package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class eg extends FrameLayout {
    public final Drawable A;
    public final Drawable B;
    public final dg C;
    public int D;
    public final RectF E;
    public final RectF F;
    public long G;
    public final Path H;
    public final float[] I;
    public final float[] J;
    public final y5 K;
    public mg.b L;
    public boolean M;
    public lg.d N;
    public lg.d O;
    public boolean P;
    public boolean Q;
    public final ChatActivityEnterView R;

    public lh.w3 f28041a;

    public lh.w3 f28042b;

    public ShapeDrawable f28043c;
    public final Drawable d;

    public final String f28044e;

    public StaticLayout f28045f;
    public float h;

    public final TextPaint f28046n;

    public final Paint f28047r;

    public final Paint f28048s;
    public final Paint v;

    public final Path f28049w;

    public final Paint f28050x;

    public final lh.l f28051y;

    public eg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.R = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f28046n = textPaint;
        this.f28047r = new Paint(1);
        this.f28048s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f28049w = new Path();
        this.f28050x = new Paint(1);
        this.E = new RectF();
        this.F = new RectF();
        this.H = new Path();
        this.I = new float[]{fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f, fDp, fDp};
        this.J = new float[]{0.0f, 0.0f, fDp, fDp, fDp, fDp, 0.0f, 0.0f};
        this.K = new y5(this, 0L, 350L, er.h);
        dg dgVar = new dg(this, this);
        this.C = dgVar;
        r0.j0.k(this, dgVar);
        lh.l lVar = new lh.l(5);
        this.f28051y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.K, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.Q3 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23025be), PorterDuff.Mode.MULTIPLY));
        this.f28043c = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(5.0f), chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23291qf));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.f28044e = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
        float fDp = AndroidUtilities.dp(3.0f);
        float fDp2 = AndroidUtilities.dp(3.0f);
        this.A = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.B = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        c();
    }

    public final void a() {
        lh.w3 w3Var = this.f28041a;
        if (w3Var != null) {
            w3Var.f16984h0 = new cg(this, w3Var, 1);
            w3Var.e(true);
            this.f28041a = null;
        }
        lh.w3 w3Var2 = this.f28042b;
        if (w3Var2 != null) {
            w3Var2.f16984h0 = new cg(this, w3Var2, 2);
            w3Var2.e(true);
            this.f28042b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        lh.w3 w3Var = new lh.w3(getContext(), 2);
        this.f28042b = w3Var;
        w3Var.m(1.0f, 0.0f);
        this.f28042b.q(true);
        ChatActivityEnterView chatActivityEnterView = this.R;
        if (chatActivityEnterView.Y0) {
            i10 = chatActivityEnterView.K ? R.string.VideoSetOnceHintEnabled : R.string.VideoSetOnceHint;
        } else {
            i10 = chatActivityEnterView.K ? R.string.VoiceSetOnceHintEnabled : R.string.VoiceSetOnceHint;
        }
        this.f28042b.t(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        lh.w3 w3Var2 = this.f28042b;
        w3Var2.h = lh.w3.a(w3Var2.getText(), this.f28042b.getTextPaint());
        if (chatActivityEnterView.K) {
            this.f28042b.j(R.raw.fire_on);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f28042b, h7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        lh.w3 w3Var3 = this.f28042b;
        w3Var3.f16984h0 = new cg(this, w3Var3, 0);
        w3Var3.v();
    }

    public final void c() {
        mg.b bVar = this.L;
        if (bVar != null) {
            bVar.b();
        }
        lg.d dVar = this.N;
        if (dVar != null) {
            dVar.u();
        }
        lg.d dVar2 = this.O;
        if (dVar2 != null) {
            dVar2.u();
        }
        int i10 = this.M ? org.telegram.ui.ActionBar.g6.Wk : org.telegram.ui.ActionBar.g6.Zd;
        ChatActivityEnterView chatActivityEnterView = this.R;
        this.f28051y.e(chatActivityEnterView.i0(i10), chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23044cf), -1);
        this.f28046n.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23274pf));
        int iDp = AndroidUtilities.dp(5.0f);
        int i11 = org.telegram.ui.ActionBar.g6.f23291qf;
        this.f28043c = org.telegram.ui.ActionBar.g6.b0(iDp, chatActivityEnterView.i0(i11));
        int iI0 = chatActivityEnterView.i0(i11);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(iI0, mode));
        this.f28047r.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23006ae));
        this.f28048s.setColor(chatActivityEnterView.i0(this.M ? org.telegram.ui.ActionBar.g6.Wk : org.telegram.ui.ActionBar.g6.Zd));
        this.v.setColor(chatActivityEnterView.i0(this.M ? org.telegram.ui.ActionBar.g6.Wk : org.telegram.ui.ActionBar.g6.Zd));
        this.A.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(this.M ? org.telegram.ui.ActionBar.g6.Wk : org.telegram.ui.ActionBar.g6.Zd), mode));
        this.B.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(this.M ? org.telegram.ui.ActionBar.g6.Wk : org.telegram.ui.ActionBar.g6.Zd), mode));
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return super.dispatchHoverEvent(motionEvent) || this.C.f(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float fMax;
        float f11;
        float f12;
        float fDp;
        float fDp2;
        float fDpf2;
        float fB;
        float f13;
        float f14;
        float f15;
        boolean z10;
        float f16;
        float fMax2;
        float interpolation;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float fDpf3;
        float fZ;
        float f22;
        float f23;
        lg.d dVar;
        Paint paint;
        lh.w3 w3Var;
        float f24;
        float f25;
        float fCenterX;
        float fCenterY;
        float fClamp;
        Paint paint2;
        float f26;
        Canvas canvas2;
        Paint paint3;
        float f27;
        Drawable drawable;
        ag agVar;
        boolean z11;
        lh.w3 w3Var2;
        lg.d dVar2;
        float f28;
        int i10;
        Drawable drawable2;
        float f29;
        float f30;
        ChatActivityEnterView chatActivityEnterView = this.R;
        float f31 = chatActivityEnterView.f26088c4;
        if (f31 <= 0.5f) {
            f10 = f31 / 0.5f;
        } else {
            f10 = f31 <= 0.75f ? 1.0f - (((f31 - 0.5f) / 0.25f) * 0.1f) : (((f31 - 0.75f) / 0.25f) * 0.1f) + 0.9f;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.G;
        this.G = System.currentTimeMillis();
        float f32 = chatActivityEnterView.f26114g4;
        if (f32 != 10000.0f) {
            fMax = Math.max(0, (int) (chatActivityEnterView.f26108f4 - f32));
            if (fMax > AndroidUtilities.dp(57.0f)) {
                fMax = AndroidUtilities.dp(57.0f);
            }
        } else {
            fMax = 0.0f;
        }
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp2(26.0f);
        float fDp3 = 1.0f - (fMax / AndroidUtilities.dp(57.0f));
        float measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(194.0f);
        if (chatActivityEnterView.f26150n4) {
            fDp = AndroidUtilities.dp(36.0f);
            f11 = 0.25f;
            fDp2 = (AndroidUtilities.dpf2(14.0f) * fDp3) + ((((1.0f - f10) * AndroidUtilities.dpf2(30.0f)) + (AndroidUtilities.dp(60.0f) + measuredHeight)) - fMax);
            fDpf2 = AndroidUtilities.dpf2(2.0f) + (((fDp / 2.0f) + fDp2) - AndroidUtilities.dpf2(8.0f));
            AndroidUtilities.dpf2(16.0f);
            AndroidUtilities.dpf2(2.0f);
            float f33 = fDp3 > 0.4f ? 1.0f : fDp3 / 0.4f;
            f12 = 26.0f;
            float f34 = chatActivityEnterView.f26126i4;
            fB = org.telegram.ui.Cells.pa.b(1.0f, f33, f34 * 15.0f, (1.0f - f34) * (1.0f - fDp3) * 9.0f);
            f13 = fDp3;
        } else {
            f11 = 0.25f;
            f12 = 26.0f;
            fDp = AndroidUtilities.dp(36.0f) + ((int) (AndroidUtilities.dp(14.0f) * fDp3));
            fDp2 = (((AndroidUtilities.dp(60.0f) + measuredHeight) + ((int) ((1.0f - f10) * AndroidUtilities.dp(30.0f)))) - ((int) fMax)) + (chatActivityEnterView.f26131j4 * fDp3 * (-AndroidUtilities.dp(8.0f)));
            fDpf2 = AndroidUtilities.dpf2(2.0f) + (((fDp / 2.0f) + fDp2) - AndroidUtilities.dpf2(8.0f)) + (AndroidUtilities.dpf2(2.0f) * fDp3);
            AndroidUtilities.dpf2(16.0f);
            AndroidUtilities.dpf2(2.0f);
            AndroidUtilities.dpf2(2.0f);
            chatActivityEnterView.f26126i4 = 0.0f;
            fB = (1.0f - fDp3) * 9.0f;
            f13 = 0.0f;
        }
        float f35 = fDp2;
        boolean z12 = chatActivityEnterView.Z3;
        RectF rectF = this.E;
        if (z12) {
            f14 = fDp3;
            f15 = 1.0f;
            if (System.currentTimeMillis() - chatActivityEnterView.f26074a4 > 200) {
                if (f14 >= 0.8f || chatActivityEnterView.f26150n4 || chatActivityEnterView.f26120h4 != 0.0f || chatActivityEnterView.f26136k4 != 0.0f) {
                    chatActivityEnterView.Z3 = false;
                }
                if (chatActivityEnterView.Z3) {
                    f29 = chatActivityEnterView.f26081b4;
                    if (f29 != f15) {
                        f30 = (jCurrentTimeMillis / 150.0f) + f29;
                        chatActivityEnterView.f26081b4 = f30;
                        if (f30 >= f15) {
                            chatActivityEnterView.f26081b4 = 1.0f;
                            SharedConfig.increaseLockRecordAudioVideoHintShowed();
                        }
                    }
                } else {
                    f28 = chatActivityEnterView.f26081b4 - (jCurrentTimeMillis / 150.0f);
                    chatActivityEnterView.f26081b4 = f28;
                    if (f28 < 0.0f) {
                        chatActivityEnterView.f26081b4 = 0.0f;
                    }
                }
                i10 = (int) (chatActivityEnterView.f26081b4 * 255.0f);
                this.f28043c.setAlpha(i10);
                drawable2 = this.d;
                drawable2.setAlpha(i10);
                this.f28046n.setAlpha(i10);
                if (this.f28045f != null) {
                    canvas.save();
                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.translate((getMeasuredWidth() - this.h) - AndroidUtilities.dp(44.0f), AndroidUtilities.dpf2(16.0f) + measuredHeight);
                    this.f28043c.setBounds(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(2.0f), (int) (this.h + AndroidUtilities.dp(36.0f)), (int) (AndroidUtilities.dpf2(4.0f) + this.f28045f.getHeight()));
                    this.f28043c.draw(canvas);
                    this.f28045f.draw(canvas);
                    canvas.restore();
                    canvas.save();
                    canvas.translate(getMeasuredWidth() - AndroidUtilities.dp(f12), ((this.f28045f.getHeight() / 2.0f) + (AndroidUtilities.dpf2(17.0f) + measuredHeight)) - (AndroidUtilities.dpf2(3.0f) * chatActivityEnterView.f26131j4));
                    Path path = this.f28049w;
                    path.reset();
                    path.setLastPoint(-AndroidUtilities.dpf2(5.0f), AndroidUtilities.dpf2(4.0f));
                    path.lineTo(0.0f, 0.0f);
                    path.lineTo(AndroidUtilities.dpf2(5.0f), AndroidUtilities.dpf2(4.0f));
                    Paint paint4 = this.f28050x;
                    paint4.setColor(-1);
                    paint4.setAlpha(i10);
                    paint4.setStyle(Paint.Style.STROKE);
                    paint4.setStrokeCap(Paint.Cap.ROUND);
                    paint4.setStrokeJoin(Paint.Join.ROUND);
                    paint4.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                    canvas.drawPath(path, paint4);
                    canvas.restore();
                    canvas.save();
                    drawable2.setBounds(measuredWidth - (drawable2.getIntrinsicWidth() / 2), (int) (AndroidUtilities.dpf2(20.0f) + this.f28045f.getHeight() + measuredHeight), org.telegram.messenger.rl.A(2, measuredWidth, drawable2), drawable2.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(20.0f) + this.f28045f.getHeight() + measuredHeight)));
                    drawable2.draw(canvas);
                    canvas.restore();
                }
            }
            if (chatActivityEnterView.Y0 || chatActivityEnterView.f26098e1 < 59000) {
                z10 = false;
            } else {
                z10 = true;
            }
            float fE = this.K.e(z10);
            f16 = chatActivityEnterView.f26136k4;
            if (f16 != 0.0f || chatActivityEnterView.f26091d1 == null) {
                fMax2 = chatActivityEnterView.f26120h4;
                if (fMax2 != 0.0f) {
                    if (fMax2 > 0.6f) {
                        f18 = 1.0f;
                    } else {
                        f18 = fMax2 / 0.6f;
                    }
                    if (!chatActivityEnterView.f26084c0) {
                        fMax2 = Math.max(0.0f, (fMax2 - 0.6f) / 0.4f);
                    }
                    er erVar = er.f28125j;
                    float interpolation2 = erVar.getInterpolation(f18);
                    interpolation = erVar.getInterpolation(fMax2);
                    f17 = interpolation2;
                } else {
                    interpolation = 0.0f;
                    f17 = 0.0f;
                }
            } else {
                float f36 = f16 > 0.38f ? 1.0f : f16 / 0.38f;
                float fMax3 = f16 > 0.63f ? 1.0f : Math.max(0.0f, (f16 - 0.38f) / f11);
                er erVar2 = er.f28125j;
                float interpolation3 = erVar2.getInterpolation(f36);
                erVar2.getInterpolation(fMax3);
                f17 = interpolation3;
                interpolation = 0.0f;
            }
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - chatActivityEnterView.f26184u1.getMeasuredHeight());
            f19 = 1.0f - chatActivityEnterView.f26094d4;
            if (f19 == 0.0f) {
                if (interpolation != 0.0f) {
                    f19 = interpolation;
                } else {
                    f19 = 0.0f;
                }
            }
            if (chatActivityEnterView.f26101e4 >= 0.7f || chatActivityEnterView.f26144m4) {
                chatActivityEnterView.Z3 = false;
                f20 = chatActivityEnterView.f26140l4;
                if (f20 != 0.0f) {
                    f21 = f20 - 0.12f;
                    chatActivityEnterView.f26140l4 = f21;
                    if (f21 < 0.0f) {
                        chatActivityEnterView.f26140l4 = 0.0f;
                    }
                }
            } else {
                float f37 = chatActivityEnterView.f26140l4;
                if (f37 != 1.0f) {
                    float f38 = f37 + 0.12f;
                    chatActivityEnterView.f26140l4 = f38;
                    if (f38 > 1.0f) {
                        chatActivityEnterView.f26140l4 = 1.0f;
                    }
                }
            }
            fDpf3 = AndroidUtilities.dpf2(72.0f);
            float fZ2 = com.google.android.recaptcha.internal.a.z(1.0f, f19, AndroidUtilities.dpf2(24.0f) * f17, fDpf3 * f19);
            float f39 = chatActivityEnterView.f26140l4;
            fZ = com.google.android.recaptcha.internal.a.z(1.0f, f39, fDpf3, fZ2);
            if (fZ > fDpf3) {
                f22 = fDpf3;
            } else {
                f22 = fZ;
            }
            float fZ3 = org.telegram.messenger.y1.z(1.0f, interpolation, (1.0f - fE) * chatActivityEnterView.f26094d4, f39);
            f23 = measuredWidth;
            float f40 = fDpf2 + f22;
            canvas.scale(fZ3, fZ3, f23, f40);
            float f41 = f35 + f22;
            rectF.set(f23 - AndroidUtilities.dpf2(18.0f), f41, AndroidUtilities.dpf2(18.0f) + f23, f41 + fDp);
            dVar = this.N;
            paint = this.f28047r;
            if (dVar != null) {
                dVar.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                this.N.draw(canvas);
            } else {
                chatActivityEnterView.Q3.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                chatActivityEnterView.Q3.draw(canvas);
                canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(18.0f), paint);
            }
            chatActivityEnterView.N3.set(rectF);
            RectF rectF2 = chatActivityEnterView.N3;
            float fCenterX2 = rectF2.centerX();
            float fCenterY2 = rectF2.centerY();
            rectF2.left = AndroidUtilities.lerp(fCenterX2, rectF2.left, fZ3);
            rectF2.right = AndroidUtilities.lerp(fCenterX2, rectF2.right, fZ3);
            rectF2.top = AndroidUtilities.lerp(fCenterY2, rectF2.top, fZ3);
            rectF2.bottom = AndroidUtilities.lerp(fCenterY2, rectF2.bottom, fZ3);
            w3Var = this.f28041a;
            if (w3Var != null) {
                w3Var.n(0.0f, rectF.centerY());
                this.f28041a.invalidate();
            }
            f24 = 1.0f - f13;
            rectF.set((f23 - AndroidUtilities.dpf2(6.0f)) - (AndroidUtilities.dpf2(2.0f) * f24), f40 - (AndroidUtilities.dpf2(2.0f) * f24), (AndroidUtilities.dpf2(2.0f) * f24) + AndroidUtilities.dp(6.0f) + measuredWidth, (AndroidUtilities.dpf2(2.0f) * f24) + f40 + AndroidUtilities.dp(12.0f));
            f25 = rectF.bottom;
            fCenterX = rectF.centerX();
            fCenterY = rectF.centerY();
            canvas.save();
            fClamp = Utilities.clamp(chatActivityEnterView.f26136k4 * 2.0f, 1.0f, 0.0f);
            paint2 = this.f28048s;
            int alpha = paint2.getAlpha();
            f26 = f13;
            float f42 = fDp;
            float f43 = f17;
            canvas2 = canvas;
            int iSaveLayerAlpha = canvas2.saveLayerAlpha(fCenterX - AndroidUtilities.dp(24.0f), fCenterY - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f) + fCenterX, AndroidUtilities.dp(24.0f) + fCenterY, (int) (alpha * (1.0f - fClamp)), 31);
            paint3 = this.v;
            paint3.setAlpha(255);
            paint2.setAlpha(255);
            f27 = 1.0f - f14;
            canvas2.translate(0.0f, AndroidUtilities.dpf2(2.0f) * f27);
            canvas2.rotate(fB, fCenterX, fCenterY);
            if (f26 != 1.0f) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(8.0f));
                canvas2.save();
                canvas2.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.dpf2(2.0f) * f27) + f22 + f25);
                float f44 = f14;
                canvas2.translate(f23 - AndroidUtilities.dpf2(4.0f), (AndroidUtilities.dpf2(2.0f) * chatActivityEnterView.f26126i4) + (AndroidUtilities.dpf2(12.0f) * f26) + ((rectF.top - AndroidUtilities.dp(6.0f)) - AndroidUtilities.lerp(AndroidUtilities.dpf2(2.0f), (1.0f - chatActivityEnterView.f26131j4) * AndroidUtilities.dpf2(1.5f), f44)));
                if (fB > 0.0f) {
                    canvas2.rotate(fB, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                }
                canvas2.drawLine(AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(6.0f) + (AndroidUtilities.dpf2(4.0f) * f24), paint3);
                canvas.drawArc(rectF3, 0.0f, -180.0f, false, paint3);
                canvas2 = canvas;
                canvas2.drawLine(0.0f, AndroidUtilities.dpf2(4.0f), 0.0f, com.google.android.recaptcha.internal.a.x(AndroidUtilities.dpf2(4.0f), chatActivityEnterView.f26126i4, f27, (AndroidUtilities.dpf2(4.0f) * chatActivityEnterView.f26131j4 * f44 * (!chatActivityEnterView.f26150n4 ? 1 : 0)) + AndroidUtilities.dpf2(4.0f)), paint3);
                canvas2.restore();
            }
            if (fClamp > 0.0f) {
                drawable = null;
            } else if (chatActivityEnterView.Y0) {
                drawable = this.B;
            } else {
                drawable = this.A;
            }
            if (f26 > 0.0f) {
                if (this.O == null) {
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint);
                }
                Path path2 = this.H;
                path2.rewind();
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(rectF);
                rectF4.right = rectF.centerX() - (AndroidUtilities.dp(1.66f) * f26);
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.5f), f26);
                float[] fArr = this.I;
                fArr[7] = fLerp;
                fArr[6] = fLerp;
                fArr[1] = fLerp;
                fArr[0] = fLerp;
                float fDp4 = AndroidUtilities.dp(1.5f) * f26;
                fArr[5] = fDp4;
                fArr[4] = fDp4;
                fArr[3] = fDp4;
                fArr[2] = fDp4;
                Path.Direction direction = Path.Direction.CW;
                path2.addRoundRect(rectF4, fArr, direction);
                rectF4.set(rectF);
                rectF4.left = (AndroidUtilities.dp(1.66f) * f26) + rectF.centerX();
                float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.5f), f26);
                float[] fArr2 = this.J;
                fArr2[5] = fLerp2;
                fArr2[4] = fLerp2;
                fArr2[3] = fLerp2;
                fArr2[2] = fLerp2;
                float fDp5 = AndroidUtilities.dp(1.5f) * f26;
                fArr2[7] = fDp5;
                fArr2[6] = fDp5;
                fArr2[1] = fDp5;
                fArr2[0] = fDp5;
                path2.addRoundRect(rectF4, fArr2, direction);
                canvas2.drawPath(path2, paint2);
            } else {
                canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint2);
            }
            paint2.setAlpha(alpha);
            paint3.setAlpha(alpha);
            canvas2.restoreToCount(iSaveLayerAlpha);
            if (drawable != null) {
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set((int) (rectF.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (rectF.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((drawable.getIntrinsicWidth() / 2) * 0.9285f) + rectF.centerX()), (int) (((drawable.getIntrinsicHeight() / 2) * 0.9285f) + rectF.centerY()));
                drawable.setBounds(rect);
                drawable.setAlpha((int) (fClamp * 255.0f));
                drawable.draw(canvas2);
            }
            if (f26 != 1.0f) {
                canvas2.drawCircle(fCenterX, fCenterY, AndroidUtilities.dpf2(2.0f) * f24, paint);
            }
            canvas2.restore();
            canvas2.restore();
            float fDp6 = (AndroidUtilities.dp(38.0f) * fE) + AndroidUtilities.lerp(f35, getMeasuredHeight() - AndroidUtilities.dp(118.0f), Math.max(chatActivityEnterView.f26120h4, Math.min(f43, chatActivityEnterView.f26140l4))) + f22;
            rectF.set(f23 - AndroidUtilities.dpf2(18.0f), fDp6, AndroidUtilities.dpf2(18.0f) + f23, fDp6 + f42);
            agVar = chatActivityEnterView.U2;
            if (agVar == null && agVar.g1()) {
                z11 = true;
            } else {
                z11 = false;
            }
            chatActivityEnterView.L = z11;
            if (z11) {
                float fDpf4 = AndroidUtilities.dpf2(12.0f);
                rectF.set(rectF.left, (rectF.top - AndroidUtilities.dpf2(36.0f)) - fDpf4, rectF.right, rectF.top - fDpf4);
                w3Var2 = this.f28042b;
                if (w3Var2 != null) {
                    w3Var2.n(0.0f, rectF.centerY());
                    this.f28042b.invalidate();
                }
                this.F.set(rectF);
                canvas2.save();
                float f45 = (1.0f - chatActivityEnterView.f26120h4) * chatActivityEnterView.f26094d4 * chatActivityEnterView.f26140l4 * chatActivityEnterView.f26126i4;
                canvas2.scale(f45, f45, rectF.centerX(), rectF.centerY());
                dVar2 = this.O;
                if (dVar2 != null) {
                    dVar2.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                    this.O.draw(canvas2);
                } else {
                    chatActivityEnterView.Q3.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                    chatActivityEnterView.Q3.draw(canvas2);
                    canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(18.0f), paint);
                }
                this.f28051y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.f28051y.draw(canvas2);
                canvas2.restore();
            }
        }
        f14 = fDp3;
        f15 = 1.0f;
        if (chatActivityEnterView.f26081b4 != 0.0f) {
            if (f14 >= 0.8f) {
                chatActivityEnterView.Z3 = false;
            } else {
                chatActivityEnterView.Z3 = false;
            }
            if (chatActivityEnterView.Z3) {
                f29 = chatActivityEnterView.f26081b4;
                if (f29 != f15) {
                    f30 = (jCurrentTimeMillis / 150.0f) + f29;
                    chatActivityEnterView.f26081b4 = f30;
                    if (f30 >= f15) {
                        chatActivityEnterView.f26081b4 = 1.0f;
                        SharedConfig.increaseLockRecordAudioVideoHintShowed();
                    }
                }
            } else {
                f28 = chatActivityEnterView.f26081b4 - (jCurrentTimeMillis / 150.0f);
                chatActivityEnterView.f26081b4 = f28;
                if (f28 < 0.0f) {
                    chatActivityEnterView.f26081b4 = 0.0f;
                }
            }
            i10 = (int) (chatActivityEnterView.f26081b4 * 255.0f);
            this.f28043c.setAlpha(i10);
            drawable2 = this.d;
            drawable2.setAlpha(i10);
            this.f28046n.setAlpha(i10);
            if (this.f28045f != null) {
                canvas.save();
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.translate((getMeasuredWidth() - this.h) - AndroidUtilities.dp(44.0f), AndroidUtilities.dpf2(16.0f) + measuredHeight);
                this.f28043c.setBounds(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(2.0f), (int) (this.h + AndroidUtilities.dp(36.0f)), (int) (AndroidUtilities.dpf2(4.0f) + this.f28045f.getHeight()));
                this.f28043c.draw(canvas);
                this.f28045f.draw(canvas);
                canvas.restore();
                canvas.save();
                canvas.translate(getMeasuredWidth() - AndroidUtilities.dp(f12), ((this.f28045f.getHeight() / 2.0f) + (AndroidUtilities.dpf2(17.0f) + measuredHeight)) - (AndroidUtilities.dpf2(3.0f) * chatActivityEnterView.f26131j4));
                Path path3 = this.f28049w;
                path3.reset();
                path3.setLastPoint(-AndroidUtilities.dpf2(5.0f), AndroidUtilities.dpf2(4.0f));
                path3.lineTo(0.0f, 0.0f);
                path3.lineTo(AndroidUtilities.dpf2(5.0f), AndroidUtilities.dpf2(4.0f));
                Paint paint5 = this.f28050x;
                paint5.setColor(-1);
                paint5.setAlpha(i10);
                paint5.setStyle(Paint.Style.STROKE);
                paint5.setStrokeCap(Paint.Cap.ROUND);
                paint5.setStrokeJoin(Paint.Join.ROUND);
                paint5.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
                canvas.drawPath(path3, paint5);
                canvas.restore();
                canvas.save();
                drawable2.setBounds(measuredWidth - (drawable2.getIntrinsicWidth() / 2), (int) (AndroidUtilities.dpf2(20.0f) + this.f28045f.getHeight() + measuredHeight), org.telegram.messenger.rl.A(2, measuredWidth, drawable2), drawable2.getIntrinsicHeight() + ((int) (AndroidUtilities.dpf2(20.0f) + this.f28045f.getHeight() + measuredHeight)));
                drawable2.draw(canvas);
                canvas.restore();
            }
        }
        if (chatActivityEnterView.Y0) {
            z10 = false;
        } else {
            z10 = false;
        }
        float fE2 = this.K.e(z10);
        f16 = chatActivityEnterView.f26136k4;
        if (f16 != 0.0f) {
            fMax2 = chatActivityEnterView.f26120h4;
            if (fMax2 != 0.0f) {
                if (fMax2 > 0.6f) {
                    f18 = 1.0f;
                } else {
                    f18 = fMax2 / 0.6f;
                }
                if (!chatActivityEnterView.f26084c0) {
                    fMax2 = Math.max(0.0f, (fMax2 - 0.6f) / 0.4f);
                }
                er erVar3 = er.f28125j;
                float interpolation4 = erVar3.getInterpolation(f18);
                interpolation = erVar3.getInterpolation(fMax2);
                f17 = interpolation4;
            } else {
                interpolation = 0.0f;
                f17 = 0.0f;
            }
        } else {
            fMax2 = chatActivityEnterView.f26120h4;
            if (fMax2 != 0.0f) {
                if (fMax2 > 0.6f) {
                    f18 = 1.0f;
                } else {
                    f18 = fMax2 / 0.6f;
                }
                if (!chatActivityEnterView.f26084c0) {
                    fMax2 = Math.max(0.0f, (fMax2 - 0.6f) / 0.4f);
                }
                er erVar4 = er.f28125j;
                float interpolation5 = erVar4.getInterpolation(f18);
                interpolation = erVar4.getInterpolation(fMax2);
                f17 = interpolation5;
            } else {
                interpolation = 0.0f;
                f17 = 0.0f;
            }
        }
        canvas.save();
        canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - chatActivityEnterView.f26184u1.getMeasuredHeight());
        f19 = 1.0f - chatActivityEnterView.f26094d4;
        if (f19 == 0.0f) {
            if (interpolation != 0.0f) {
                f19 = interpolation;
            } else {
                f19 = 0.0f;
            }
        }
        if (chatActivityEnterView.f26101e4 >= 0.7f) {
            chatActivityEnterView.Z3 = false;
            f20 = chatActivityEnterView.f26140l4;
            if (f20 != 0.0f) {
                f21 = f20 - 0.12f;
                chatActivityEnterView.f26140l4 = f21;
                if (f21 < 0.0f) {
                    chatActivityEnterView.f26140l4 = 0.0f;
                }
            }
        } else {
            chatActivityEnterView.Z3 = false;
            f20 = chatActivityEnterView.f26140l4;
            if (f20 != 0.0f) {
                f21 = f20 - 0.12f;
                chatActivityEnterView.f26140l4 = f21;
                if (f21 < 0.0f) {
                    chatActivityEnterView.f26140l4 = 0.0f;
                }
            }
        }
        fDpf3 = AndroidUtilities.dpf2(72.0f);
        float fZ4 = com.google.android.recaptcha.internal.a.z(1.0f, f19, AndroidUtilities.dpf2(24.0f) * f17, fDpf3 * f19);
        float f310 = chatActivityEnterView.f26140l4;
        fZ = com.google.android.recaptcha.internal.a.z(1.0f, f310, fDpf3, fZ4);
        if (fZ > fDpf3) {
            f22 = fDpf3;
        } else {
            f22 = fZ;
        }
        float fZ5 = org.telegram.messenger.y1.z(1.0f, interpolation, (1.0f - fE2) * chatActivityEnterView.f26094d4, f310);
        f23 = measuredWidth;
        float f46 = fDpf2 + f22;
        canvas.scale(fZ5, fZ5, f23, f46);
        float f47 = f35 + f22;
        rectF.set(f23 - AndroidUtilities.dpf2(18.0f), f47, AndroidUtilities.dpf2(18.0f) + f23, f47 + fDp);
        dVar = this.N;
        paint = this.f28047r;
        if (dVar != null) {
            dVar.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
            this.N.draw(canvas);
        } else {
            chatActivityEnterView.Q3.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
            chatActivityEnterView.Q3.draw(canvas);
            canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(18.0f), paint);
        }
        chatActivityEnterView.N3.set(rectF);
        RectF rectF5 = chatActivityEnterView.N3;
        float fCenterX3 = rectF5.centerX();
        float fCenterY3 = rectF5.centerY();
        rectF5.left = AndroidUtilities.lerp(fCenterX3, rectF5.left, fZ5);
        rectF5.right = AndroidUtilities.lerp(fCenterX3, rectF5.right, fZ5);
        rectF5.top = AndroidUtilities.lerp(fCenterY3, rectF5.top, fZ5);
        rectF5.bottom = AndroidUtilities.lerp(fCenterY3, rectF5.bottom, fZ5);
        w3Var = this.f28041a;
        if (w3Var != null) {
            w3Var.n(0.0f, rectF.centerY());
            this.f28041a.invalidate();
        }
        f24 = 1.0f - f13;
        rectF.set((f23 - AndroidUtilities.dpf2(6.0f)) - (AndroidUtilities.dpf2(2.0f) * f24), f46 - (AndroidUtilities.dpf2(2.0f) * f24), (AndroidUtilities.dpf2(2.0f) * f24) + AndroidUtilities.dp(6.0f) + measuredWidth, (AndroidUtilities.dpf2(2.0f) * f24) + f46 + AndroidUtilities.dp(12.0f));
        f25 = rectF.bottom;
        fCenterX = rectF.centerX();
        fCenterY = rectF.centerY();
        canvas.save();
        fClamp = Utilities.clamp(chatActivityEnterView.f26136k4 * 2.0f, 1.0f, 0.0f);
        paint2 = this.f28048s;
        int alpha2 = paint2.getAlpha();
        f26 = f13;
        float f48 = fDp;
        float f49 = f17;
        canvas2 = canvas;
        int iSaveLayerAlpha2 = canvas2.saveLayerAlpha(fCenterX - AndroidUtilities.dp(24.0f), fCenterY - AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f) + fCenterX, AndroidUtilities.dp(24.0f) + fCenterY, (int) (alpha2 * (1.0f - fClamp)), 31);
        paint3 = this.v;
        paint3.setAlpha(255);
        paint2.setAlpha(255);
        f27 = 1.0f - f14;
        canvas2.translate(0.0f, AndroidUtilities.dpf2(2.0f) * f27);
        canvas2.rotate(fB, fCenterX, fCenterY);
        if (f26 != 1.0f) {
            RectF rectF6 = AndroidUtilities.rectTmp;
            rectF6.set(0.0f, 0.0f, AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(8.0f));
            canvas2.save();
            canvas2.clipRect(0.0f, 0.0f, getMeasuredWidth(), (AndroidUtilities.dpf2(2.0f) * f27) + f22 + f25);
            float f410 = f14;
            canvas2.translate(f23 - AndroidUtilities.dpf2(4.0f), (AndroidUtilities.dpf2(2.0f) * chatActivityEnterView.f26126i4) + (AndroidUtilities.dpf2(12.0f) * f26) + ((rectF.top - AndroidUtilities.dp(6.0f)) - AndroidUtilities.lerp(AndroidUtilities.dpf2(2.0f), (1.0f - chatActivityEnterView.f26131j4) * AndroidUtilities.dpf2(1.5f), f410)));
            if (fB > 0.0f) {
                canvas2.rotate(fB, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            }
            canvas2.drawLine(AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(4.0f), AndroidUtilities.dpf2(8.0f), AndroidUtilities.dpf2(6.0f) + (AndroidUtilities.dpf2(4.0f) * f24), paint3);
            canvas.drawArc(rectF6, 0.0f, -180.0f, false, paint3);
            canvas2 = canvas;
            canvas2.drawLine(0.0f, AndroidUtilities.dpf2(4.0f), 0.0f, com.google.android.recaptcha.internal.a.x(AndroidUtilities.dpf2(4.0f), chatActivityEnterView.f26126i4, f27, (AndroidUtilities.dpf2(4.0f) * chatActivityEnterView.f26131j4 * f410 * (!chatActivityEnterView.f26150n4 ? 1 : 0)) + AndroidUtilities.dpf2(4.0f)), paint3);
            canvas2.restore();
        }
        if (fClamp > 0.0f) {
            drawable = null;
        } else if (chatActivityEnterView.Y0) {
            drawable = this.B;
        } else {
            drawable = this.A;
        }
        if (f26 > 0.0f) {
            if (this.O == null) {
                canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint);
            }
            Path path4 = this.H;
            path4.rewind();
            RectF rectF7 = AndroidUtilities.rectTmp;
            rectF7.set(rectF);
            rectF7.right = rectF.centerX() - (AndroidUtilities.dp(1.66f) * f26);
            float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.5f), f26);
            float[] fArr3 = this.I;
            fArr3[7] = fLerp3;
            fArr3[6] = fLerp3;
            fArr3[1] = fLerp3;
            fArr3[0] = fLerp3;
            float fDp7 = AndroidUtilities.dp(1.5f) * f26;
            fArr3[5] = fDp7;
            fArr3[4] = fDp7;
            fArr3[3] = fDp7;
            fArr3[2] = fDp7;
            Path.Direction direction2 = Path.Direction.CW;
            path4.addRoundRect(rectF7, fArr3, direction2);
            rectF7.set(rectF);
            rectF7.left = (AndroidUtilities.dp(1.66f) * f26) + rectF.centerX();
            float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.5f), f26);
            float[] fArr4 = this.J;
            fArr4[5] = fLerp4;
            fArr4[4] = fLerp4;
            fArr4[3] = fLerp4;
            fArr4[2] = fLerp4;
            float fDp8 = AndroidUtilities.dp(1.5f) * f26;
            fArr4[7] = fDp8;
            fArr4[6] = fDp8;
            fArr4[1] = fDp8;
            fArr4[0] = fDp8;
            path4.addRoundRect(rectF7, fArr4, direction2);
            canvas2.drawPath(path4, paint2);
        } else {
            canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint2);
        }
        paint2.setAlpha(alpha2);
        paint3.setAlpha(alpha2);
        canvas2.restoreToCount(iSaveLayerAlpha2);
        if (drawable != null) {
            Rect rect2 = AndroidUtilities.rectTmp2;
            rect2.set((int) (rectF.centerX() - ((drawable.getIntrinsicWidth() / 2) * 0.9285f)), (int) (rectF.centerY() - ((drawable.getIntrinsicHeight() / 2) * 0.9285f)), (int) (((drawable.getIntrinsicWidth() / 2) * 0.9285f) + rectF.centerX()), (int) (((drawable.getIntrinsicHeight() / 2) * 0.9285f) + rectF.centerY()));
            drawable.setBounds(rect2);
            drawable.setAlpha((int) (fClamp * 255.0f));
            drawable.draw(canvas2);
        }
        if (f26 != 1.0f) {
            canvas2.drawCircle(fCenterX, fCenterY, AndroidUtilities.dpf2(2.0f) * f24, paint);
        }
        canvas2.restore();
        canvas2.restore();
        float fDp9 = (AndroidUtilities.dp(38.0f) * fE2) + AndroidUtilities.lerp(f35, getMeasuredHeight() - AndroidUtilities.dp(118.0f), Math.max(chatActivityEnterView.f26120h4, Math.min(f49, chatActivityEnterView.f26140l4))) + f22;
        rectF.set(f23 - AndroidUtilities.dpf2(18.0f), fDp9, AndroidUtilities.dpf2(18.0f) + f23, fDp9 + f48);
        agVar = chatActivityEnterView.U2;
        if (agVar == null) {
            z11 = false;
        } else {
            z11 = false;
        }
        chatActivityEnterView.L = z11;
        if (z11) {
            float fDpf5 = AndroidUtilities.dpf2(12.0f);
            rectF.set(rectF.left, (rectF.top - AndroidUtilities.dpf2(36.0f)) - fDpf5, rectF.right, rectF.top - fDpf5);
            w3Var2 = this.f28042b;
            if (w3Var2 != null) {
                w3Var2.n(0.0f, rectF.centerY());
                this.f28042b.invalidate();
            }
            this.F.set(rectF);
            canvas2.save();
            float f411 = (1.0f - chatActivityEnterView.f26120h4) * chatActivityEnterView.f26094d4 * chatActivityEnterView.f26140l4 * chatActivityEnterView.f26126i4;
            canvas2.scale(f411, f411, rectF.centerX(), rectF.centerY());
            dVar2 = this.O;
            if (dVar2 != null) {
                dVar2.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                this.O.draw(canvas2);
            } else {
                chatActivityEnterView.Q3.setBounds((int) (rectF.left - AndroidUtilities.dpf2(3.0f)), (int) (rectF.top - AndroidUtilities.dpf2(3.0f)), (int) (AndroidUtilities.dpf2(3.0f) + rectF.right), (int) (AndroidUtilities.dpf2(3.0f) + rectF.bottom));
                chatActivityEnterView.Q3.draw(canvas2);
                canvas2.drawRoundRect(rectF, AndroidUtilities.dpf2(18.0f), AndroidUtilities.dpf2(18.0f), paint);
            }
            this.f28051y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f28051y.draw(canvas2);
            canvas2.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int iDp = AndroidUtilities.dp(250.0f);
        if (this.D != size) {
            this.D = size;
            StaticLayout staticLayout = new StaticLayout(this.f28044e, this.f28046n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f28045f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f28045f.getLineWidth(i12);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
    }

    @Override
    public final boolean onSetAlpha(int i10) {
        return super.onSetAlpha(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.R;
        RectF rectF = chatActivityEnterView.N3;
        int x8 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.F;
        if (action == 0) {
            if (chatActivityEnterView.f26150n4) {
                this.Q = rectF.contains(x8, y10);
            }
            if (chatActivityEnterView.L && chatActivityEnterView.I1 != null && chatActivityEnterView.f26126i4 > 0.1f) {
                this.P = rectF2.contains(x8, y10);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Q && rectF.contains(x8, y10)) {
                if (chatActivityEnterView.Y0) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26105f1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.U2.f1();
                } else {
                    bg bgVar = new bg(this, 0);
                    lh.w3 w3Var = this.f28041a;
                    if (w3Var != null && w3Var.R) {
                        a();
                    }
                    xj0 xj0Var = chatActivityEnterView.f26091d1;
                    if (xj0Var != null) {
                        xj0Var.setPlaying(false);
                    }
                    if (!MediaController.getInstance().isRecordingPaused() || (chatActivityEnterView.f26091d1.getAudioLeft() <= 0.01f && chatActivityEnterView.f26091d1.getAudioRight() >= 0.99f)) {
                        bgVar.run();
                    } else {
                        org.telegram.ui.yq yqVar = new org.telegram.ui.yq(11, this, bgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.R3);
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s(yqVar, 19));
                            i0.a.w(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            yqVar.run();
                        }
                    }
                }
                this.P = false;
                this.Q = false;
                return true;
            }
            if (this.P && rectF2.contains(x8, y10)) {
                boolean z10 = !chatActivityEnterView.K;
                chatActivityEnterView.K = z10;
                this.f28051y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                long j10 = chatActivityEnterView.L2;
                org.telegram.ui.rn rnVar = chatActivityEnterView.K2;
                mediaDataController.toggleDraftVoiceOnce(j10, (rnVar == null || !rnVar.f42017d4) ? 0L : rnVar.b(), chatActivityEnterView.K);
                if (chatActivityEnterView.K) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.P = false;
                this.Q = false;
                return true;
            }
            this.P = false;
            this.Q = false;
        } else if (motionEvent.getAction() == 3) {
            this.P = false;
            this.Q = false;
        }
        return this.Q || this.P;
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setBlurredBackgroundFactory(jg.a aVar) {
        this.M = true;
        if (this.L == null) {
            this.L = new mg.b(org.telegram.ui.ActionBar.g6.f23006ae, this.R.R3);
        }
        lg.d dVarC = aVar.c(this, this.L, false);
        this.N = dVarC;
        dVarC.p(AndroidUtilities.dp(18.0f));
        this.N.o(AndroidUtilities.dp(3.0f));
        lg.d dVarC2 = aVar.c(this, this.L, false);
        this.O = dVarC2;
        dVarC2.p(AndroidUtilities.dp(18.0f));
        this.O.o(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.f28051y || super.verifyDrawable(drawable);
    }
}

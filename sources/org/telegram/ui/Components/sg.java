package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sg extends FrameLayout {
    public final Drawable E;
    public final Drawable F;
    public final rg G;
    public int H;
    public final RectF I;
    public final RectF J;
    public long K;
    public final Path L;
    public final float[] M;
    public final float[] N;
    public final e6 O;
    public eh.b P;
    public boolean Q;
    public dh.d R;
    public dh.d S;
    public boolean T;
    public boolean U;
    public final ChatActivityEnterView V;
    public di.f4 f30278a;
    public di.f4 f30279b;
    public ShapeDrawable f30280c;
    public final Drawable d;
    public final String f30281e;
    public StaticLayout f30282f;
    public float h;
    public final TextPaint f30283n;
    public final Paint f30284r;
    public final Paint f30285s;
    public final Paint v;
    public final Path f30286w;
    public final Paint f30287x;
    public final di.l f30288y;

    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.V = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f30283n = textPaint;
        this.f30284r = new Paint(1);
        this.f30285s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f30286w = new Path();
        this.f30287x = new Paint(1);
        this.I = new RectF();
        this.J = new RectF();
        this.L = new Path();
        this.M = r4;
        this.N = r3;
        this.O = new e6(this, 0L, 350L, pr.h);
        rg rgVar = new rg(this, this);
        this.G = rgVar;
        r0.i0.k(this, rgVar);
        di.l lVar = new di.l(5);
        this.f30288y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.U3 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f20633be), PorterDuff.Mode.MULTIPLY));
        this.f30280c = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(5.0f), chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f20906qf));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.f30281e = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
        float dp = AndroidUtilities.dp(3.0f);
        float[] fArr = {dp, dp, 0.0f, 0.0f, 0.0f, 0.0f, dp, dp};
        float[] fArr2 = {0.0f, 0.0f, r13, r13, r13, r13, 0.0f, 0.0f};
        float dp2 = AndroidUtilities.dp(3.0f);
        this.E = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.F = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        c();
    }

    public final void a() {
        di.f4 f4Var = this.f30278a;
        if (f4Var != null) {
            f4Var.f7210l0 = new qg(this, f4Var, 1);
            f4Var.e(true);
            this.f30278a = null;
        }
        di.f4 f4Var2 = this.f30279b;
        if (f4Var2 != null) {
            f4Var2.f7210l0 = new qg(this, f4Var2, 2);
            f4Var2.e(true);
            this.f30279b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        di.f4 f4Var = new di.f4(getContext(), 2);
        this.f30279b = f4Var;
        f4Var.l(1.0f, 0.0f);
        this.f30279b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.V;
        if (chatActivityEnterView.f23677c1) {
            if (chatActivityEnterView.O) {
                i10 = R.string.VideoSetOnceHintEnabled;
            } else {
                i10 = R.string.VideoSetOnceHint;
            }
        } else if (chatActivityEnterView.O) {
            i10 = R.string.VoiceSetOnceHintEnabled;
        } else {
            i10 = R.string.VoiceSetOnceHint;
        }
        this.f30279b.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        di.f4 f4Var2 = this.f30279b;
        f4Var2.h = di.f4.a(f4Var2.getText(), this.f30279b.getTextPaint());
        if (chatActivityEnterView.O) {
            di.f4 f4Var3 = this.f30279b;
            int i11 = R.raw.fire_on;
            f4Var3.getClass();
            xi0 xi0Var = new xi0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            xi0Var.start();
            f4Var3.j(xi0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f30279b, w7.x5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        di.f4 f4Var4 = this.f30279b;
        f4Var4.f7210l0 = new qg(this, f4Var4, 0);
        f4Var4.u();
    }

    public final void c() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        eh.b bVar = this.P;
        if (bVar != null) {
            bVar.b();
        }
        dh.d dVar = this.R;
        if (dVar != null) {
            dVar.u();
        }
        dh.d dVar2 = this.S;
        if (dVar2 != null) {
            dVar2.u();
        }
        if (this.Q) {
            i10 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Zd;
        }
        ChatActivityEnterView chatActivityEnterView = this.V;
        this.f30288y.e(chatActivityEnterView.i0(i10), chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f20653cf), -1);
        this.f30283n.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f20888pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i15 = org.telegram.ui.ActionBar.j6.f20906qf;
        this.f30280c = org.telegram.ui.ActionBar.j6.b0(dp, chatActivityEnterView.i0(i15));
        int i02 = chatActivityEnterView.i0(i15);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(i02, mode));
        this.f30284r.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f20614ae));
        if (this.Q) {
            i11 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.Zd;
        }
        this.f30285s.setColor(chatActivityEnterView.i0(i11));
        if (this.Q) {
            i12 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.Zd;
        }
        this.v.setColor(chatActivityEnterView.i0(i12));
        if (this.Q) {
            i13 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.Zd;
        }
        this.E.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i13), mode));
        if (this.Q) {
            i14 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i14 = org.telegram.ui.ActionBar.j6.Zd;
        }
        this.F.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i14), mode));
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.G.f(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sg.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(250.0f);
        if (this.H != size) {
            this.H = size;
            StaticLayout staticLayout = new StaticLayout(this.f30281e, this.f30283n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f30282f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f30282f.getLineWidth(i12);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }

    @Override
    public final boolean onSetAlpha(int i10) {
        return super.onSetAlpha(i10);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j3;
        ChatActivityEnterView chatActivityEnterView = this.V;
        RectF rectF = chatActivityEnterView.R3;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        if (action == 0) {
            if (chatActivityEnterView.f23765r4) {
                this.U = rectF.contains(x10, y3);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.M1 != null && chatActivityEnterView.f23738m4 > 0.1f) {
                this.T = rectF2.contains(x10, y3);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.U && rectF.contains(x10, y3)) {
                if (chatActivityEnterView.f23677c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23721j1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Y2.h1();
                } else {
                    pg pgVar = new pg(this, 0);
                    di.f4 f4Var = this.f30278a;
                    if (f4Var != null && f4Var.V) {
                        a();
                    }
                    gk0 gk0Var = chatActivityEnterView.f23709h1;
                    if (gk0Var != null) {
                        gk0Var.setPlaying(false);
                    }
                    if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f23709h1.getAudioLeft() > 0.01f || chatActivityEnterView.f23709h1.getAudioRight() < 0.99f)) {
                        uc ucVar = new uc(5, this, pgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.V3);
                            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new t(ucVar, 19));
                            i2.g.r(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            ucVar.run();
                        }
                    } else {
                        pgVar.run();
                    }
                }
                this.T = false;
                this.U = false;
                return true;
            } else if (this.T && rectF2.contains(x10, y3)) {
                boolean z10 = !chatActivityEnterView.O;
                chatActivityEnterView.O = z10;
                this.f30288y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j10 = chatActivityEnterView.P2;
                org.telegram.ui.co coVar = chatActivityEnterView.O2;
                if (coVar != null && coVar.f35277h4) {
                    j3 = coVar.d();
                } else {
                    j3 = 0;
                }
                mediaDataController.toggleDraftVoiceOnce(j10, j3, chatActivityEnterView.O);
                if (chatActivityEnterView.O) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.T = false;
                this.U = false;
                return true;
            } else {
                this.T = false;
                this.U = false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.T = false;
            this.U = false;
        }
        if (!this.U && !this.T) {
            return false;
        }
        return true;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setBlurredBackgroundFactory(bh.b bVar) {
        this.Q = true;
        if (this.P == null) {
            this.P = new eh.b(org.telegram.ui.ActionBar.j6.f20614ae, this.V.V3);
        }
        dh.d c10 = bVar.c(this, this.P, false);
        this.R = c10;
        c10.p(AndroidUtilities.dp(18.0f));
        this.R.o(AndroidUtilities.dp(3.0f));
        dh.d c11 = bVar.c(this, this.P, false);
        this.S = c11;
        c11.p(AndroidUtilities.dp(18.0f));
        this.S.o(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30288y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

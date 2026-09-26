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
    public dh.b P;
    public boolean Q;
    public ch.d R;
    public ch.d S;
    public boolean T;
    public boolean U;
    public final ChatActivityEnterView V;
    public ci.e4 f28270a;
    public ci.e4 f28271b;
    public ShapeDrawable f28272c;
    public final Drawable d;
    public final String e;
    public StaticLayout f28273f;
    public float h;
    public final TextPaint f28274n;
    public final Paint f28275r;
    public final Paint f28276s;
    public final Paint v;
    public final Path f28277w;
    public final Paint f28278x;
    public final ci.l f28279y;

    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.V = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f28274n = textPaint;
        this.f28275r = new Paint(1);
        this.f28276s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f28277w = new Path();
        this.f28278x = new Paint(1);
        this.I = new RectF();
        this.J = new RectF();
        this.L = new Path();
        this.M = r4;
        this.N = r3;
        this.O = new e6(this, 0L, 350L, sr.h);
        rg rgVar = new rg(this, this);
        this.G = rgVar;
        r0.i0.k(this, rgVar);
        ci.l lVar = new ci.l(5);
        this.f28279y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.V3 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.f19029be), PorterDuff.Mode.MULTIPLY));
        this.f28272c = org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(5.0f), chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.f19306qf));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
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
        ci.e4 e4Var = this.f28270a;
        if (e4Var != null) {
            e4Var.f4615l0 = new qg(this, e4Var, 1);
            e4Var.e(true);
            this.f28270a = null;
        }
        ci.e4 e4Var2 = this.f28271b;
        if (e4Var2 != null) {
            e4Var2.f4615l0 = new qg(this, e4Var2, 2);
            e4Var2.e(true);
            this.f28271b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        ci.e4 e4Var = new ci.e4(getContext(), 2);
        this.f28271b = e4Var;
        e4Var.l(1.0f, 0.0f);
        this.f28271b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.V;
        if (chatActivityEnterView.f21968c1) {
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
        this.f28271b.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        ci.e4 e4Var2 = this.f28271b;
        e4Var2.h = ci.e4.a(e4Var2.getText(), this.f28271b.getTextPaint());
        if (chatActivityEnterView.O) {
            ci.e4 e4Var3 = this.f28271b;
            int i11 = R.raw.fire_on;
            e4Var3.getClass();
            jj0 jj0Var = new jj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            jj0Var.start();
            e4Var3.j(jj0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f28271b, w7.y5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        ci.e4 e4Var4 = this.f28271b;
        e4Var4.f4615l0 = new qg(this, e4Var4, 0);
        e4Var4.u();
    }

    public final void c() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        dh.b bVar = this.P;
        if (bVar != null) {
            bVar.d();
        }
        ch.d dVar = this.R;
        if (dVar != null) {
            dVar.v();
        }
        ch.d dVar2 = this.S;
        if (dVar2 != null) {
            dVar2.v();
        }
        if (this.Q) {
            i10 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.Zd;
        }
        ChatActivityEnterView chatActivityEnterView = this.V;
        this.f28279y.e(chatActivityEnterView.i0(i10), chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.f19049cf), -1);
        this.f28274n.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.f19287pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i15 = org.telegram.ui.ActionBar.h6.f19306qf;
        this.f28272c = org.telegram.ui.ActionBar.h6.b0(dp, chatActivityEnterView.i0(i15));
        int i02 = chatActivityEnterView.i0(i15);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(i02, mode));
        this.f28275r.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.h6.f19010ae));
        if (this.Q) {
            i11 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.f28276s.setColor(chatActivityEnterView.i0(i11));
        if (this.Q) {
            i12 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.v.setColor(chatActivityEnterView.i0(i12));
        if (this.Q) {
            i13 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.E.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i13), mode));
        if (this.Q) {
            i14 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i14 = org.telegram.ui.ActionBar.h6.Zd;
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
            StaticLayout staticLayout = new StaticLayout(this.e, this.f28274n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f28273f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f28273f.getLineWidth(i12);
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
        RectF rectF = chatActivityEnterView.S3;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        if (action == 0) {
            if (chatActivityEnterView.f22062s4) {
                this.U = rectF.contains(x10, y3);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f22035n4 > 0.1f) {
                this.T = rectF2.contains(x10, y3);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.U && rectF.contains(x10, y3)) {
                if (chatActivityEnterView.f21968c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22016k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Z2.n1();
                } else {
                    pg pgVar = new pg(this, 0);
                    ci.e4 e4Var = this.f28270a;
                    if (e4Var != null && e4Var.V) {
                        a();
                    }
                    sk0 sk0Var = chatActivityEnterView.f21999h1;
                    if (sk0Var != null) {
                        sk0Var.setPlaying(false);
                    }
                    if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f21999h1.getAudioLeft() > 0.01f || chatActivityEnterView.f21999h1.getAudioRight() < 0.99f)) {
                        kd kdVar = new kd(4, this, pgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.W3);
                            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s(kdVar, 19));
                            hg.c.p(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            kdVar.run();
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
                this.f28279y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j10 = chatActivityEnterView.Q2;
                org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
                if (wnVar != null && wnVar.f39498h4) {
                    j3 = wnVar.d();
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

    public void setBlurredBackgroundFactory(ah.c cVar) {
        this.Q = true;
        if (this.P == null) {
            this.P = new dh.b(org.telegram.ui.ActionBar.h6.f19010ae, this.V.W3);
        }
        ch.d c10 = cVar.c(this, this.P, false);
        this.R = c10;
        c10.q(AndroidUtilities.dp(18.0f));
        this.R.p(AndroidUtilities.dp(3.0f));
        ch.d c11 = cVar.c(this, this.P, false);
        this.S = c11;
        c11.q(AndroidUtilities.dp(18.0f));
        this.S.p(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f28279y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

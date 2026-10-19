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
    public final f6 O;
    public eh.b P;
    public boolean Q;
    public dh.d R;
    public dh.d S;
    public boolean T;
    public boolean U;
    public final ChatActivityEnterView V;
    public ei.x3 f30250a;
    public ei.x3 f30251b;
    public ShapeDrawable f30252c;
    public final Drawable d;
    public final String e;
    public StaticLayout f30253f;
    public float h;
    public final TextPaint f30254n;
    public final Paint f30255r;
    public final Paint f30256s;
    public final Paint v;
    public final Path f30257w;
    public final Paint f30258x;
    public final ei.l f30259y;

    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.V = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f30254n = textPaint;
        this.f30255r = new Paint(1);
        this.f30256s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f30257w = new Path();
        this.f30258x = new Paint(1);
        this.I = new RectF();
        this.J = new RectF();
        this.L = new Path();
        this.M = r4;
        this.N = r3;
        this.O = new f6(this, 0L, 350L, bs.h);
        rg rgVar = new rg(this, this);
        this.G = rgVar;
        r0.i0.j(this, rgVar);
        ei.l lVar = new ei.l(5);
        this.f30259y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.V3 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f20958be), PorterDuff.Mode.MULTIPLY));
        this.f30252c = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(5.0f), chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f21235qf));
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
        ei.x3 x3Var = this.f30250a;
        if (x3Var != null) {
            x3Var.f10082l0 = new qg(this, x3Var, 1);
            x3Var.e(true);
            this.f30250a = null;
        }
        ei.x3 x3Var2 = this.f30251b;
        if (x3Var2 != null) {
            x3Var2.f10082l0 = new qg(this, x3Var2, 2);
            x3Var2.e(true);
            this.f30251b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        ei.x3 x3Var = new ei.x3(getContext(), 2);
        this.f30251b = x3Var;
        x3Var.l(1.0f, 0.0f);
        this.f30251b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.V;
        if (chatActivityEnterView.f23923c1) {
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
        this.f30251b.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        ei.x3 x3Var2 = this.f30251b;
        x3Var2.h = ei.x3.a(x3Var2.getText(), this.f30251b.getTextPaint());
        if (chatActivityEnterView.O) {
            ei.x3 x3Var3 = this.f30251b;
            int i11 = R.raw.fire_on;
            x3Var3.getClass();
            uj0 uj0Var = new uj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            uj0Var.start();
            x3Var3.j(uj0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f30251b, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        ei.x3 x3Var4 = this.f30251b;
        x3Var4.f10082l0 = new qg(this, x3Var4, 0);
        x3Var4.u();
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
            dVar.v();
        }
        dh.d dVar2 = this.S;
        if (dVar2 != null) {
            dVar2.v();
        }
        if (this.Q) {
            i10 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.Zd;
        }
        ChatActivityEnterView chatActivityEnterView = this.V;
        this.f30259y.e(chatActivityEnterView.g0(i10), chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f20979cf), -1);
        this.f30254n.setColor(chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f21216pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i15 = org.telegram.ui.ActionBar.h6.f21235qf;
        this.f30252c = org.telegram.ui.ActionBar.h6.c0(dp, chatActivityEnterView.g0(i15));
        int g02 = chatActivityEnterView.g0(i15);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(g02, mode));
        this.f30255r.setColor(chatActivityEnterView.g0(org.telegram.ui.ActionBar.h6.f20938ae));
        if (this.Q) {
            i11 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.f30256s.setColor(chatActivityEnterView.g0(i11));
        if (this.Q) {
            i12 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.v.setColor(chatActivityEnterView.g0(i12));
        if (this.Q) {
            i13 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.E.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i13), mode));
        if (this.Q) {
            i14 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i14 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.F.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.g0(i14), mode));
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.G.f(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sg.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(250.0f);
        if (this.H != size) {
            this.H = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.f30254n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f30253f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f30253f.getLineWidth(i12);
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
        long j10;
        ChatActivityEnterView chatActivityEnterView = this.V;
        RectF rectF = chatActivityEnterView.S3;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        if (action == 0) {
            if (chatActivityEnterView.f24018s4) {
                this.U = rectF.contains(x10, y3);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f23991n4 > 0.1f) {
                this.T = rectF2.contains(x10, y3);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.U && rectF.contains(x10, y3)) {
                if (chatActivityEnterView.f23923c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23972k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Z2.i1();
                } else {
                    pg pgVar = new pg(this, 0);
                    ei.x3 x3Var = this.f30250a;
                    if (x3Var != null && x3Var.V) {
                        a();
                    }
                    dl0 dl0Var = chatActivityEnterView.f23954h1;
                    if (dl0Var != null) {
                        dl0Var.setPlaying(false);
                    }
                    if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f23954h1.getAudioLeft() > 0.01f || chatActivityEnterView.f23954h1.getAudioRight() < 0.99f)) {
                        ee eeVar = new ee(2, this, pgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.W3);
                            alertDialog$Builder.f20604a.R = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.f20604a.T = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s(eeVar, 19));
                            i2.e.r(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            eeVar.run();
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
                this.f30259y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j11 = chatActivityEnterView.Q2;
                org.telegram.ui.qn qnVar = chatActivityEnterView.P2;
                if (qnVar != null && qnVar.f40707h4) {
                    j10 = qnVar.d();
                } else {
                    j10 = 0;
                }
                mediaDataController.toggleDraftVoiceOnce(j11, j10, chatActivityEnterView.O);
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
            this.P = new eh.b(org.telegram.ui.ActionBar.h6.f20938ae, this.V.W3);
        }
        dh.d c10 = bVar.c(this, this.P, false);
        this.R = c10;
        c10.q(AndroidUtilities.dp(18.0f));
        this.R.p(AndroidUtilities.dp(3.0f));
        dh.d c11 = bVar.c(this, this.P, false);
        this.S = c11;
        c11.q(AndroidUtilities.dp(18.0f));
        this.S.p(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30259y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

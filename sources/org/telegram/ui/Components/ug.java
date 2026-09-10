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
public final class ug extends FrameLayout {
    public final Drawable E;
    public final Drawable F;
    public final tg G;
    public int H;
    public final RectF I;
    public final RectF J;
    public long K;
    public final Path L;
    public final float[] M;
    public final float[] N;
    public final d6 O;
    public ch.b P;
    public boolean Q;
    public bh.d R;
    public bh.d S;
    public boolean T;
    public boolean U;
    public final ChatActivityEnterView V;
    public bi.x4 f27662a;
    public bi.x4 f27663b;
    public ShapeDrawable f27664c;
    public final Drawable d;
    public final String e;
    public StaticLayout f27665f;
    public float h;
    public final TextPaint f27666n;
    public final Paint f27667r;
    public final Paint f27668s;
    public final Paint v;
    public final Path f27669w;
    public final Paint f27670x;
    public final bi.n f27671y;

    public ug(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.V = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f27666n = textPaint;
        this.f27667r = new Paint(1);
        this.f27668s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f27669w = new Path();
        this.f27670x = new Paint(1);
        this.I = new RectF();
        this.J = new RectF();
        this.L = new Path();
        this.M = r4;
        this.N = r3;
        this.O = new d6(this, 0L, 350L, wr.h);
        tg tgVar = new tg(this, this);
        this.G = tgVar;
        r0.i0.k(this, tgVar);
        bi.n nVar = new bi.n(5);
        this.f27671y = nVar;
        nVar.setCallback(this);
        nVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.U3 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f17898be), PorterDuff.Mode.MULTIPLY));
        this.f27664c = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(5.0f), chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f18170qf));
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
        bi.x4 x4Var = this.f27662a;
        if (x4Var != null) {
            x4Var.f3890l0 = new sg(this, x4Var, 1);
            x4Var.e(true);
            this.f27662a = null;
        }
        bi.x4 x4Var2 = this.f27663b;
        if (x4Var2 != null) {
            x4Var2.f3890l0 = new sg(this, x4Var2, 2);
            x4Var2.e(true);
            this.f27663b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        bi.x4 x4Var = new bi.x4(getContext(), 2);
        this.f27663b = x4Var;
        x4Var.l(1.0f, 0.0f);
        this.f27663b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.V;
        if (chatActivityEnterView.f20832c1) {
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
        this.f27663b.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        bi.x4 x4Var2 = this.f27663b;
        x4Var2.h = bi.x4.a(x4Var2.getText(), this.f27663b.getTextPaint());
        if (chatActivityEnterView.O) {
            bi.x4 x4Var3 = this.f27663b;
            int i11 = R.raw.fire_on;
            x4Var3.getClass();
            hj0 hj0Var = new hj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            hj0Var.start();
            x4Var3.j(hj0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f27663b, w7.a6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        bi.x4 x4Var4 = this.f27663b;
        x4Var4.f3890l0 = new sg(this, x4Var4, 0);
        x4Var4.u();
    }

    public final void c() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        ch.b bVar = this.P;
        if (bVar != null) {
            bVar.b();
        }
        bh.d dVar = this.R;
        if (dVar != null) {
            dVar.u();
        }
        bh.d dVar2 = this.S;
        if (dVar2 != null) {
            dVar2.u();
        }
        if (this.Q) {
            i10 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Zd;
        }
        ChatActivityEnterView chatActivityEnterView = this.V;
        this.f27671y.e(chatActivityEnterView.i0(i10), chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f17918cf), -1);
        this.f27666n.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f18152pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i15 = org.telegram.ui.ActionBar.j6.f18170qf;
        this.f27664c = org.telegram.ui.ActionBar.j6.b0(dp, chatActivityEnterView.i0(i15));
        int i02 = chatActivityEnterView.i0(i15);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(i02, mode));
        this.f27667r.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f17879ae));
        if (this.Q) {
            i11 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.Zd;
        }
        this.f27668s.setColor(chatActivityEnterView.i0(i11));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ug.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(250.0f);
        if (this.H != size) {
            this.H = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.f27666n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f27665f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f27665f.getLineWidth(i12);
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
            if (chatActivityEnterView.f20919r4) {
                this.U = rectF.contains(x10, y3);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.M1 != null && chatActivityEnterView.f20892m4 > 0.1f) {
                this.T = rectF2.contains(x10, y3);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.U && rectF.contains(x10, y3)) {
                if (chatActivityEnterView.f20832c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f20875j1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Y2.m1();
                } else {
                    rg rgVar = new rg(this, 0);
                    bi.x4 x4Var = this.f27662a;
                    if (x4Var != null && x4Var.V) {
                        a();
                    }
                    qk0 qk0Var = chatActivityEnterView.f20863h1;
                    if (qk0Var != null) {
                        qk0Var.setPlaying(false);
                    }
                    if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f20863h1.getAudioLeft() > 0.01f || chatActivityEnterView.f20863h1.getAudioRight() < 0.99f)) {
                        ee eeVar = new ee(2, this, rgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.V3);
                            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new t(eeVar, 19));
                            hc.b.s(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            eeVar.run();
                        }
                    } else {
                        rgVar.run();
                    }
                }
                this.T = false;
                this.U = false;
                return true;
            } else if (this.T && rectF2.contains(x10, y3)) {
                boolean z10 = !chatActivityEnterView.O;
                chatActivityEnterView.O = z10;
                this.f27671y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j10 = chatActivityEnterView.P2;
                org.telegram.ui.eo eoVar = chatActivityEnterView.O2;
                if (eoVar != null && eoVar.f32346h4) {
                    j3 = eoVar.d();
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

    public void setBlurredBackgroundFactory(zg.a aVar) {
        this.Q = true;
        if (this.P == null) {
            this.P = new ch.b(org.telegram.ui.ActionBar.j6.f17879ae, this.V.V3);
        }
        bh.d c10 = aVar.c(this, this.P, false);
        this.R = c10;
        c10.p(AndroidUtilities.dp(18.0f));
        this.R.o(AndroidUtilities.dp(3.0f));
        bh.d c11 = aVar.c(this, this.P, false);
        this.S = c11;
        c11.p(AndroidUtilities.dp(18.0f));
        this.S.o(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f27671y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

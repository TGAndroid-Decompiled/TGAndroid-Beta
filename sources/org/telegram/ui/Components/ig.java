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
public final class ig extends FrameLayout {
    public final Drawable B;
    public final Drawable C;
    public final hg D;
    public int E;
    public final RectF F;
    public final RectF G;
    public long H;
    public final Path I;
    public final float[] J;
    public final float[] K;
    public final z5 L;
    public qg.b M;
    public boolean N;
    public pg.b O;
    public pg.b P;
    public boolean Q;
    public boolean R;
    public final ChatActivityEnterView S;
    public ph.f3 f25694a;
    public ph.f3 f25695b;
    public ShapeDrawable f25696c;
    public final Drawable d;
    public final String e;
    public StaticLayout f25697f;
    public float h;
    public final TextPaint f25698n;
    public final Paint f25699r;
    public final Paint f25700s;
    public final Paint v;
    public final Path f25701w;
    public final Paint f25702x;
    public final ph.j f25703y;

    public ig(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.S = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f25698n = textPaint;
        this.f25699r = new Paint(1);
        this.f25700s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f25701w = new Path();
        this.f25702x = new Paint(1);
        this.F = new RectF();
        this.G = new RectF();
        this.I = new Path();
        this.J = r4;
        this.K = r3;
        this.L = new z5(this, 0L, 350L, mr.h);
        hg hgVar = new hg(this, this);
        this.D = hgVar;
        r0.j0.k(this, hgVar);
        ph.j jVar = new ph.j(5);
        this.f25703y = jVar;
        jVar.setCallback(this);
        jVar.d(1, chatActivityEnterView.L, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.R3 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f19853be), PorterDuff.Mode.MULTIPLY));
        this.f25696c = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(5.0f), chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.qf));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.e = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
        float dp = AndroidUtilities.dp(3.0f);
        float[] fArr = {dp, dp, 0.0f, 0.0f, 0.0f, 0.0f, dp, dp};
        float[] fArr2 = {0.0f, 0.0f, r13, r13, r13, r13, 0.0f, 0.0f};
        float dp2 = AndroidUtilities.dp(3.0f);
        this.B = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.C = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        c();
    }

    public final void a() {
        ph.f3 f3Var = this.f25694a;
        if (f3Var != null) {
            f3Var.f41662i0 = new gg(this, f3Var, 1);
            f3Var.e(true);
            this.f25694a = null;
        }
        ph.f3 f3Var2 = this.f25695b;
        if (f3Var2 != null) {
            f3Var2.f41662i0 = new gg(this, f3Var2, 2);
            f3Var2.e(true);
            this.f25695b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        ph.f3 f3Var = new ph.f3(getContext(), 2);
        this.f25695b = f3Var;
        f3Var.l(1.0f, 0.0f);
        this.f25695b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.S;
        if (chatActivityEnterView.Z0) {
            if (chatActivityEnterView.L) {
                i10 = R.string.VideoSetOnceHintEnabled;
            } else {
                i10 = R.string.VideoSetOnceHint;
            }
        } else if (chatActivityEnterView.L) {
            i10 = R.string.VoiceSetOnceHintEnabled;
        } else {
            i10 = R.string.VoiceSetOnceHint;
        }
        this.f25695b.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        ph.f3 f3Var2 = this.f25695b;
        f3Var2.h = ph.f3.a(f3Var2.getText(), this.f25695b.getTextPaint());
        if (chatActivityEnterView.L) {
            ph.f3 f3Var3 = this.f25695b;
            int i11 = R.raw.fire_on;
            f3Var3.getClass();
            gj0 gj0Var = new gj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            gj0Var.start();
            f3Var3.j(gj0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f25695b, k7.b6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        ph.f3 f3Var4 = this.f25695b;
        f3Var4.f41662i0 = new gg(this, f3Var4, 0);
        f3Var4.u();
    }

    public final void c() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        qg.b bVar = this.M;
        if (bVar != null) {
            bVar.b();
        }
        pg.b bVar2 = this.O;
        if (bVar2 != null) {
            bVar2.u();
        }
        pg.b bVar3 = this.P;
        if (bVar3 != null) {
            bVar3.u();
        }
        if (this.N) {
            i10 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i10 = org.telegram.ui.ActionBar.j6.Zd;
        }
        ChatActivityEnterView chatActivityEnterView = this.S;
        this.f25703y.e(chatActivityEnterView.i0(i10), chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f19872cf), -1);
        this.f25698n.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f20105pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i15 = org.telegram.ui.ActionBar.j6.qf;
        this.f25696c = org.telegram.ui.ActionBar.j6.b0(dp, chatActivityEnterView.i0(i15));
        int i02 = chatActivityEnterView.i0(i15);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(i02, mode));
        this.f25699r.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.j6.f19834ae));
        if (this.N) {
            i11 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i11 = org.telegram.ui.ActionBar.j6.Zd;
        }
        this.f25700s.setColor(chatActivityEnterView.i0(i11));
        if (this.N) {
            i12 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i12 = org.telegram.ui.ActionBar.j6.Zd;
        }
        this.v.setColor(chatActivityEnterView.i0(i12));
        if (this.N) {
            i13 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i13 = org.telegram.ui.ActionBar.j6.Zd;
        }
        this.B.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i13), mode));
        if (this.N) {
            i14 = org.telegram.ui.ActionBar.j6.Wk;
        } else {
            i14 = org.telegram.ui.ActionBar.j6.Zd;
        }
        this.C.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i14), mode));
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.D.f(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ig.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(250.0f);
        if (this.E != size) {
            this.E = size;
            StaticLayout staticLayout = new StaticLayout(this.e, this.f25698n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f25697f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f25697f.getLineWidth(i12);
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
        ChatActivityEnterView chatActivityEnterView = this.S;
        RectF rectF = chatActivityEnterView.O3;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.G;
        if (action == 0) {
            if (chatActivityEnterView.f22787o4) {
                this.R = rectF.contains(x10, y10);
            }
            if (chatActivityEnterView.M && chatActivityEnterView.J1 != null && chatActivityEnterView.f22763j4 > 0.1f) {
                this.Q = rectF2.contains(x10, y10);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.R && rectF.contains(x10, y10)) {
                if (chatActivityEnterView.Z0) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f22742g1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.V2.s1();
                } else {
                    fg fgVar = new fg(this, 0);
                    ph.f3 f3Var = this.f25694a;
                    if (f3Var != null && f3Var.S) {
                        a();
                    }
                    qk0 qk0Var = chatActivityEnterView.f22729e1;
                    if (qk0Var != null) {
                        qk0Var.setPlaying(false);
                    }
                    if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f22729e1.getAudioLeft() > 0.01f || chatActivityEnterView.f22729e1.getAudioRight() < 0.99f)) {
                        org.telegram.ui.np npVar = new org.telegram.ui.np(16, this, fgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.S3);
                            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new t(npVar, 19));
                            kf.k0.u(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            npVar.run();
                        }
                    } else {
                        fgVar.run();
                    }
                }
                this.Q = false;
                this.R = false;
                return true;
            } else if (this.Q && rectF2.contains(x10, y10)) {
                boolean z4 = !chatActivityEnterView.L;
                chatActivityEnterView.L = z4;
                this.f25703y.d(1, z4, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.N);
                long j11 = chatActivityEnterView.M2;
                org.telegram.ui.zn znVar = chatActivityEnterView.L2;
                if (znVar != null && znVar.f40567e4) {
                    j10 = znVar.d();
                } else {
                    j10 = 0;
                }
                mediaDataController.toggleDraftVoiceOnce(j11, j10, chatActivityEnterView.L);
                if (chatActivityEnterView.L) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.Q = false;
                this.R = false;
                return true;
            } else {
                this.Q = false;
                this.R = false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.Q = false;
            this.R = false;
        }
        if (!this.R && !this.Q) {
            return false;
        }
        return true;
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setBlurredBackgroundFactory(ng.a aVar) {
        this.N = true;
        if (this.M == null) {
            this.M = new qg.b(org.telegram.ui.ActionBar.j6.f19834ae, this.S.S3);
        }
        pg.b c3 = aVar.c(this, this.M, false);
        this.O = c3;
        c3.p(AndroidUtilities.dp(18.0f));
        this.O.o(AndroidUtilities.dp(3.0f));
        pg.b c10 = aVar.c(this, this.M, false);
        this.P = c10;
        c10.p(AndroidUtilities.dp(18.0f));
        this.P.o(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f25703y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

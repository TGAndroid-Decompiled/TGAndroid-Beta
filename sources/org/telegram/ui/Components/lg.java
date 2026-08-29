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
public final class lg extends FrameLayout {
    public final Drawable A;
    public final Drawable B;
    public final kg C;
    public int D;
    public final RectF E;
    public final RectF F;
    public long G;
    public final Path H;
    public final float[] I;
    public final float[] J;
    public final d6 K;
    public og.b L;
    public boolean M;
    public ng.d N;
    public ng.d O;
    public boolean P;
    public boolean Q;
    public final ChatActivityEnterView R;
    public nh.t3 f30304a;
    public nh.t3 f30305b;
    public ShapeDrawable f30306c;
    public final Drawable d;
    public final String f30307e;
    public StaticLayout f30308f;
    public float h;
    public final TextPaint f30309n;
    public final Paint f30310r;
    public final Paint f30311s;
    public final Paint v;
    public final Path f30312w;
    public final Paint f30313x;
    public final nh.l f30314y;

    public lg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.R = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f30309n = textPaint;
        this.f30310r = new Paint(1);
        this.f30311s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f30312w = new Path();
        this.f30313x = new Paint(1);
        this.E = new RectF();
        this.F = new RectF();
        this.H = new Path();
        this.I = r4;
        this.J = r3;
        this.K = new d6(this, 0L, 350L, jr.h);
        kg kgVar = new kg(this, this);
        this.C = kgVar;
        r0.j0.k(this, kgVar);
        nh.l lVar = new nh.l(5);
        this.f30314y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.K, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.Q3 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23035be), PorterDuff.Mode.MULTIPLY));
        this.f30306c = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(5.0f), chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23301qf));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.f30307e = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
        float dp = AndroidUtilities.dp(3.0f);
        float[] fArr = {dp, dp, 0.0f, 0.0f, 0.0f, 0.0f, dp, dp};
        float[] fArr2 = {0.0f, 0.0f, r13, r13, r13, r13, 0.0f, 0.0f};
        float dp2 = AndroidUtilities.dp(3.0f);
        this.A = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.B = getResources().getDrawable(R.drawable.input_video).mutate();
        setWillNotDraw(false);
        c();
    }

    public final void a() {
        nh.t3 t3Var = this.f30304a;
        if (t3Var != null) {
            t3Var.f18597h0 = new jg(this, t3Var, 1);
            t3Var.e(true);
            this.f30304a = null;
        }
        nh.t3 t3Var2 = this.f30305b;
        if (t3Var2 != null) {
            t3Var2.f18597h0 = new jg(this, t3Var2, 2);
            t3Var2.e(true);
            this.f30305b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        nh.t3 t3Var = new nh.t3(getContext(), 2);
        this.f30305b = t3Var;
        t3Var.m(1.0f, 0.0f);
        this.f30305b.q(true);
        ChatActivityEnterView chatActivityEnterView = this.R;
        if (chatActivityEnterView.Y0) {
            if (chatActivityEnterView.K) {
                i10 = R.string.VideoSetOnceHintEnabled;
            } else {
                i10 = R.string.VideoSetOnceHint;
            }
        } else if (chatActivityEnterView.K) {
            i10 = R.string.VoiceSetOnceHintEnabled;
        } else {
            i10 = R.string.VoiceSetOnceHint;
        }
        this.f30305b.t(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        nh.t3 t3Var2 = this.f30305b;
        t3Var2.h = nh.t3.a(t3Var2.getText(), this.f30305b.getTextPaint());
        if (chatActivityEnterView.K) {
            this.f30305b.j(R.raw.fire_on);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f30305b, i7.f6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        nh.t3 t3Var3 = this.f30305b;
        t3Var3.f18597h0 = new jg(this, t3Var3, 0);
        t3Var3.v();
    }

    public final void c() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        og.b bVar = this.L;
        if (bVar != null) {
            bVar.b();
        }
        ng.d dVar = this.N;
        if (dVar != null) {
            dVar.u();
        }
        ng.d dVar2 = this.O;
        if (dVar2 != null) {
            dVar2.u();
        }
        if (this.M) {
            i10 = org.telegram.ui.ActionBar.g6.Wk;
        } else {
            i10 = org.telegram.ui.ActionBar.g6.Zd;
        }
        ChatActivityEnterView chatActivityEnterView = this.R;
        this.f30314y.e(chatActivityEnterView.i0(i10), chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23053cf), -1);
        this.f30309n.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i15 = org.telegram.ui.ActionBar.g6.f23301qf;
        this.f30306c = org.telegram.ui.ActionBar.g6.b0(dp, chatActivityEnterView.i0(i15));
        int i02 = chatActivityEnterView.i0(i15);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(i02, mode));
        this.f30310r.setColor(chatActivityEnterView.i0(org.telegram.ui.ActionBar.g6.f23016ae));
        if (this.M) {
            i11 = org.telegram.ui.ActionBar.g6.Wk;
        } else {
            i11 = org.telegram.ui.ActionBar.g6.Zd;
        }
        this.f30311s.setColor(chatActivityEnterView.i0(i11));
        if (this.M) {
            i12 = org.telegram.ui.ActionBar.g6.Wk;
        } else {
            i12 = org.telegram.ui.ActionBar.g6.Zd;
        }
        this.v.setColor(chatActivityEnterView.i0(i12));
        if (this.M) {
            i13 = org.telegram.ui.ActionBar.g6.Wk;
        } else {
            i13 = org.telegram.ui.ActionBar.g6.Zd;
        }
        this.A.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i13), mode));
        if (this.M) {
            i14 = org.telegram.ui.ActionBar.g6.Wk;
        } else {
            i14 = org.telegram.ui.ActionBar.g6.Zd;
        }
        this.B.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.i0(i14), mode));
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.C.f(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lg.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(250.0f);
        if (this.D != size) {
            this.D = size;
            StaticLayout staticLayout = new StaticLayout(this.f30307e, this.f30309n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f30308f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f30308f.getLineWidth(i12);
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
        ChatActivityEnterView chatActivityEnterView = this.R;
        RectF rectF = chatActivityEnterView.N3;
        int x4 = (int) motionEvent.getX();
        int y8 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.F;
        if (action == 0) {
            if (chatActivityEnterView.f26165n4) {
                this.Q = rectF.contains(x4, y8);
            }
            if (chatActivityEnterView.L && chatActivityEnterView.I1 != null && chatActivityEnterView.f26141i4 > 0.1f) {
                this.P = rectF2.contains(x4, y8);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Q && rectF.contains(x4, y8)) {
                if (chatActivityEnterView.Y0) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26120f1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.U2.n1();
                } else {
                    ig igVar = new ig(this, 0);
                    nh.t3 t3Var = this.f30304a;
                    if (t3Var != null && t3Var.R) {
                        a();
                    }
                    gk0 gk0Var = chatActivityEnterView.f26106d1;
                    if (gk0Var != null) {
                        gk0Var.setPlaying(false);
                    }
                    if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f26106d1.getAudioLeft() > 0.01f || chatActivityEnterView.f26106d1.getAudioRight() < 0.99f)) {
                        z2 z2Var = new z2(8, this, igVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.R3);
                            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new u(z2Var, 19));
                            j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            z2Var.run();
                        }
                    } else {
                        igVar.run();
                    }
                }
                this.P = false;
                this.Q = false;
                return true;
            } else if (this.P && rectF2.contains(x4, y8)) {
                boolean z10 = !chatActivityEnterView.K;
                chatActivityEnterView.K = z10;
                this.f30314y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                long j11 = chatActivityEnterView.L2;
                org.telegram.ui.tn tnVar = chatActivityEnterView.K2;
                if (tnVar != null && tnVar.f42779d4) {
                    j10 = tnVar.b();
                } else {
                    j10 = 0;
                }
                mediaDataController.toggleDraftVoiceOnce(j11, j10, chatActivityEnterView.K);
                if (chatActivityEnterView.K) {
                    b();
                } else {
                    a();
                }
                invalidate();
                this.P = false;
                this.Q = false;
                return true;
            } else {
                this.P = false;
                this.Q = false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.P = false;
            this.Q = false;
        }
        if (!this.Q && !this.P) {
            return false;
        }
        return true;
    }

    @Override
    public void setAlpha(float f9) {
        super.setAlpha(f9);
    }

    public void setBlurredBackgroundFactory(lg.a aVar) {
        this.M = true;
        if (this.L == null) {
            this.L = new og.b(org.telegram.ui.ActionBar.g6.f23016ae, this.R.R3);
        }
        ng.d c3 = aVar.c(this, this.L, false);
        this.N = c3;
        c3.p(AndroidUtilities.dp(18.0f));
        this.N.o(AndroidUtilities.dp(3.0f));
        ng.d c6 = aVar.c(this, this.L, false);
        this.O = c6;
        c6.p(AndroidUtilities.dp(18.0f));
        this.O.o(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30314y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

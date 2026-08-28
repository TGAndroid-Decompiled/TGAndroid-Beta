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
    public final Drawable A;
    public final Drawable B;
    public final hg C;
    public int D;
    public final RectF E;
    public final RectF F;
    public long G;
    public final Path H;
    public final float[] I;
    public final float[] J;
    public final y5 K;
    public lg.b L;
    public boolean M;
    public kg.d N;
    public kg.d O;
    public boolean P;
    public boolean Q;
    public final ChatActivityEnterView R;
    public kh.x3 f29424a;
    public kh.x3 f29425b;
    public ShapeDrawable f29426c;
    public final Drawable d;
    public final String f29427e;
    public StaticLayout f29428f;
    public float h;
    public final TextPaint f29429n;
    public final Paint f29430r;
    public final Paint f29431s;
    public final Paint v;
    public final Path f29432w;
    public final Paint f29433x;
    public final kh.l f29434y;

    public ig(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.R = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f29429n = textPaint;
        this.f29430r = new Paint(1);
        this.f29431s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f29432w = new Path();
        this.f29433x = new Paint(1);
        this.E = new RectF();
        this.F = new RectF();
        this.H = new Path();
        this.I = r4;
        this.J = r3;
        this.K = new y5(this, 0L, 350L, gr.h);
        hg hgVar = new hg(this, this);
        this.C = hgVar;
        r0.j0.k(this, hgVar);
        kh.l lVar = new kh.l(5);
        this.f29434y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.K, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.Q3 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.f22972be), PorterDuff.Mode.MULTIPLY));
        this.f29426c = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(5.0f), chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.f23238qf));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.f29427e = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
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
        kh.x3 x3Var = this.f29424a;
        if (x3Var != null) {
            x3Var.f16352h0 = new gg(this, x3Var, 1);
            x3Var.e(true);
            this.f29424a = null;
        }
        kh.x3 x3Var2 = this.f29425b;
        if (x3Var2 != null) {
            x3Var2.f16352h0 = new gg(this, x3Var2, 2);
            x3Var2.e(true);
            this.f29425b = null;
        }
    }

    public final void b() {
        int i9;
        a();
        kh.x3 x3Var = new kh.x3(getContext(), 2);
        this.f29425b = x3Var;
        x3Var.m(1.0f, 0.0f);
        this.f29425b.q(true);
        ChatActivityEnterView chatActivityEnterView = this.R;
        if (chatActivityEnterView.Y0) {
            if (chatActivityEnterView.K) {
                i9 = R.string.VideoSetOnceHintEnabled;
            } else {
                i9 = R.string.VideoSetOnceHint;
            }
        } else if (chatActivityEnterView.K) {
            i9 = R.string.VoiceSetOnceHintEnabled;
        } else {
            i9 = R.string.VoiceSetOnceHint;
        }
        this.f29425b.t(AndroidUtilities.replaceTags(LocaleController.getString(i9)));
        kh.x3 x3Var2 = this.f29425b;
        x3Var2.h = kh.x3.a(x3Var2.getText(), this.f29425b.getTextPaint());
        if (chatActivityEnterView.K) {
            this.f29425b.j(R.raw.fire_on);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f29425b, g7.e6.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        kh.x3 x3Var3 = this.f29425b;
        x3Var3.f16352h0 = new gg(this, x3Var3, 0);
        x3Var3.v();
    }

    public final void c() {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        lg.b bVar = this.L;
        if (bVar != null) {
            bVar.b();
        }
        kg.d dVar = this.N;
        if (dVar != null) {
            dVar.u();
        }
        kg.d dVar2 = this.O;
        if (dVar2 != null) {
            dVar2.u();
        }
        if (this.M) {
            i9 = org.telegram.ui.ActionBar.f6.Wk;
        } else {
            i9 = org.telegram.ui.ActionBar.f6.Zd;
        }
        ChatActivityEnterView chatActivityEnterView = this.R;
        this.f29434y.e(chatActivityEnterView.h0(i9), chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.f22992cf), -1);
        this.f29429n.setColor(chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.f23219pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i14 = org.telegram.ui.ActionBar.f6.f23238qf;
        this.f29426c = org.telegram.ui.ActionBar.f6.b0(dp, chatActivityEnterView.h0(i14));
        int h02 = chatActivityEnterView.h0(i14);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(h02, mode));
        this.f29430r.setColor(chatActivityEnterView.h0(org.telegram.ui.ActionBar.f6.f22954ae));
        if (this.M) {
            i10 = org.telegram.ui.ActionBar.f6.Wk;
        } else {
            i10 = org.telegram.ui.ActionBar.f6.Zd;
        }
        this.f29431s.setColor(chatActivityEnterView.h0(i10));
        if (this.M) {
            i11 = org.telegram.ui.ActionBar.f6.Wk;
        } else {
            i11 = org.telegram.ui.ActionBar.f6.Zd;
        }
        this.v.setColor(chatActivityEnterView.h0(i11));
        if (this.M) {
            i12 = org.telegram.ui.ActionBar.f6.Wk;
        } else {
            i12 = org.telegram.ui.ActionBar.f6.Zd;
        }
        this.A.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(i12), mode));
        if (this.M) {
            i13 = org.telegram.ui.ActionBar.f6.Wk;
        } else {
            i13 = org.telegram.ui.ActionBar.f6.Zd;
        }
        this.B.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.h0(i13), mode));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ig.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(250.0f);
        if (this.D != size) {
            this.D = size;
            StaticLayout staticLayout = new StaticLayout(this.f29427e, this.f29429n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f29428f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i11 = 0; i11 < lineCount; i11++) {
                float lineWidth = this.f29428f.getLineWidth(i11);
                if (lineWidth > this.h) {
                    this.h = lineWidth;
                }
            }
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
    }

    @Override
    public final boolean onSetAlpha(int i9) {
        return super.onSetAlpha(i9);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        long j10;
        ChatActivityEnterView chatActivityEnterView = this.R;
        RectF rectF = chatActivityEnterView.N3;
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.F;
        if (action == 0) {
            if (chatActivityEnterView.f26154n4) {
                this.Q = rectF.contains(x10, y10);
            }
            if (chatActivityEnterView.L && chatActivityEnterView.I1 != null && chatActivityEnterView.f26130i4 > 0.1f) {
                this.P = rectF2.contains(x10, y10);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.Q && rectF.contains(x10, y10)) {
                if (chatActivityEnterView.Y0) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f26109f1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.U2.c1();
                } else {
                    fg fgVar = new fg(this, 0);
                    kh.x3 x3Var = this.f29424a;
                    if (x3Var != null && x3Var.R) {
                        a();
                    }
                    vj0 vj0Var = chatActivityEnterView.f26095d1;
                    if (vj0Var != null) {
                        vj0Var.setPlaying(false);
                    }
                    if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f26095d1.getAudioLeft() > 0.01f || chatActivityEnterView.f26095d1.getAudioRight() < 0.99f)) {
                        org.telegram.ui.wq wqVar = new org.telegram.ui.wq(11, this, fgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.R3);
                            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s(wqVar, 19));
                            j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            wqVar.run();
                        }
                    } else {
                        fgVar.run();
                    }
                }
                this.P = false;
                this.Q = false;
                return true;
            } else if (this.P && rectF2.contains(x10, y10)) {
                boolean z10 = !chatActivityEnterView.K;
                chatActivityEnterView.K = z10;
                this.f29434y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.M);
                long j11 = chatActivityEnterView.L2;
                org.telegram.ui.qn qnVar = chatActivityEnterView.K2;
                if (qnVar != null && qnVar.f41882d4) {
                    j10 = qnVar.b();
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
    public void setAlpha(float f10) {
        super.setAlpha(f10);
    }

    public void setBlurredBackgroundFactory(ig.a aVar) {
        this.M = true;
        if (this.L == null) {
            this.L = new lg.b(org.telegram.ui.ActionBar.f6.f22954ae, this.R.R3);
        }
        kg.d c10 = aVar.c(this, this.L, false);
        this.N = c10;
        c10.p(AndroidUtilities.dp(18.0f));
        this.N.o(AndroidUtilities.dp(3.0f));
        kg.d c11 = aVar.c(this, this.L, false);
        this.O = c11;
        c11.p(AndroidUtilities.dp(18.0f));
        this.O.o(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f29434y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

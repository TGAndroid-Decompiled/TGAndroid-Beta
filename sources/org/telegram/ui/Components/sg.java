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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class sg extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
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
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public ei.x3 f30479a;
    public boolean f30480a0;
    public ei.x3 f30481b;
    public final ChatActivityEnterView f30482b0;
    public ShapeDrawable f30483c;
    public final Drawable d;
    public final String e;
    public StaticLayout f30484f;
    public float h;
    public final TextPaint f30485n;
    public final Paint f30486r;
    public final Paint f30487s;
    public final Paint v;
    public final Path f30488w;
    public final Paint f30489x;
    public final ei.l f30490y;

    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f30482b0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f30485n = textPaint;
        this.f30486r = new Paint(1);
        this.f30487s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f30488w = new Path();
        this.f30489x = new Paint(1);
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
        this.f30490y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.V3 = drawable;
        org.telegram.ui.ActionBar.r6.z(this, drawable, org.telegram.ui.ActionBar.k6.f21152be, chatActivityEnterView.W3, PorterDuff.Mode.MULTIPLY);
        this.f30483c = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f21429qf));
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
        updateColors();
    }

    public final void a() {
        ei.x3 x3Var = this.f30479a;
        if (x3Var != null) {
            x3Var.f10097l0 = new qg(this, x3Var, 1);
            x3Var.e(true);
            this.f30479a = null;
        }
        ei.x3 x3Var2 = this.f30481b;
        if (x3Var2 != null) {
            x3Var2.f10097l0 = new qg(this, x3Var2, 2);
            x3Var2.e(true);
            this.f30481b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        ei.x3 x3Var = new ei.x3(getContext(), 2);
        this.f30481b = x3Var;
        x3Var.l(1.0f, 0.0f);
        this.f30481b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.f30482b0;
        if (chatActivityEnterView.f24066c1) {
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
        this.f30481b.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        ei.x3 x3Var2 = this.f30481b;
        x3Var2.h = ei.x3.a(x3Var2.getText(), this.f30481b.getTextPaint());
        if (chatActivityEnterView.O) {
            ei.x3 x3Var3 = this.f30481b;
            int i11 = R.raw.fire_on;
            x3Var3.getClass();
            yj0 yj0Var = new yj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            yj0Var.start();
            x3Var3.j(yj0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f30481b, w7.z5.d(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        ei.x3 x3Var4 = this.f30481b;
        x3Var4.f10097l0 = new qg(this, x3Var4, 0);
        x3Var4.u();
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
            StaticLayout staticLayout = new StaticLayout(this.e, this.f30485n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f30484f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f30484f.getLineWidth(i12);
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
        ChatActivityEnterView chatActivityEnterView = this.f30482b0;
        RectF rectF = chatActivityEnterView.S3;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        if (action == 0) {
            if (chatActivityEnterView.f24164s4) {
                this.f30480a0 = rectF.contains(x10, y3);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f24134n4 > 0.1f) {
                this.W = rectF2.contains(x10, y3);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f30480a0 && rectF.contains(x10, y3)) {
                if (chatActivityEnterView.f24066c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f24115k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Z2.i1();
                } else {
                    pg pgVar = new pg(this, 0);
                    ei.x3 x3Var = this.f30479a;
                    if (x3Var != null && x3Var.V) {
                        a();
                    }
                    hl0 hl0Var = chatActivityEnterView.f24097h1;
                    if (hl0Var != null) {
                        hl0Var.setPlaying(false);
                    }
                    if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f24097h1.getAudioLeft() > 0.01f || chatActivityEnterView.f24097h1.getAudioRight() < 0.99f)) {
                        ee eeVar = new ee(2, this, pgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.W3);
                            alertDialog$Builder.f20678a.R = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s(eeVar, 19));
                            i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            eeVar.run();
                        }
                    } else {
                        pgVar.run();
                    }
                }
                this.W = false;
                this.f30480a0 = false;
                return true;
            } else if (this.W && rectF2.contains(x10, y3)) {
                boolean z10 = !chatActivityEnterView.O;
                chatActivityEnterView.O = z10;
                this.f30490y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j11 = chatActivityEnterView.Q2;
                org.telegram.ui.sn snVar = chatActivityEnterView.P2;
                if (snVar != null && snVar.f41689t4) {
                    j10 = snVar.d();
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
                this.W = false;
                this.f30480a0 = false;
                return true;
            } else {
                this.W = false;
                this.f30480a0 = false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.W = false;
            this.f30480a0 = false;
        }
        if (!this.f30480a0 && !this.W) {
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
            this.P = new eh.b(org.telegram.ui.ActionBar.k6.f21132ae, this.f30482b0.W3);
        }
        dh.d c10 = bVar.c(this, this.P, false);
        this.R = c10;
        c10.q(AndroidUtilities.dp(18.0f));
        this.R.p(AndroidUtilities.dp(3.0f));
        dh.d c11 = bVar.c(this, this.P, false);
        this.S = c11;
        c11.q(AndroidUtilities.dp(18.0f));
        this.S.p(AndroidUtilities.dp(3.0f));
        updateColors();
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint;
        Drawable drawable;
        Drawable drawable2;
        int i10;
        int i11;
        int i12;
        int i13;
        ei.l lVar = this.f30490y;
        if (lVar != null && (textPaint = this.f30485n) != null && (drawable = this.E) != null && (drawable2 = this.F) != null) {
            eh.b bVar = this.P;
            if (bVar != null) {
                bVar.c();
            }
            dh.d dVar = this.R;
            if (dVar != null) {
                dVar.updateColors();
            }
            dh.d dVar2 = this.S;
            if (dVar2 != null) {
                dVar2.updateColors();
            }
            if (this.Q) {
                i10 = org.telegram.ui.ActionBar.k6.Wk;
            } else {
                i10 = org.telegram.ui.ActionBar.k6.Zd;
            }
            ChatActivityEnterView chatActivityEnterView = this.f30482b0;
            lVar.e(chatActivityEnterView.f0(i10), chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f21173cf), -1);
            textPaint.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f21410pf));
            ShapeDrawable shapeDrawable = this.f30483c;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.k6.z1(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f21429qf), shapeDrawable);
            } else {
                this.f30483c = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f21429qf));
            }
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f21429qf);
            Drawable drawable3 = this.d;
            if (drawable3 != null && f02 != this.T) {
                this.T = f02;
                drawable3.setColorFilter(new PorterDuffColorFilter(f02, PorterDuff.Mode.SRC_IN));
            }
            this.f30486r.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.k6.f21132ae));
            if (this.Q) {
                i11 = org.telegram.ui.ActionBar.k6.Wk;
            } else {
                i11 = org.telegram.ui.ActionBar.k6.Zd;
            }
            this.f30487s.setColor(chatActivityEnterView.f0(i11));
            if (this.Q) {
                i12 = org.telegram.ui.ActionBar.k6.Wk;
            } else {
                i12 = org.telegram.ui.ActionBar.k6.Zd;
            }
            this.v.setColor(chatActivityEnterView.f0(i12));
            if (this.Q) {
                i13 = org.telegram.ui.ActionBar.k6.Wk;
            } else {
                i13 = org.telegram.ui.ActionBar.k6.Zd;
            }
            int f03 = chatActivityEnterView.f0(i13);
            if (!this.V || f03 != this.U) {
                this.V = true;
                this.U = f03;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawable.setColorFilter(new PorterDuffColorFilter(f03, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(f03, mode));
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f30490y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

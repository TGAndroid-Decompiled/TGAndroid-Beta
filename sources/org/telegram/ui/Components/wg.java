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
public final class wg extends FrameLayout {
    public final Drawable E;
    public final Drawable F;
    public final Paint G;
    public final Paint H;
    public final g6 I;
    public String J;
    public final Paint K;
    public final vg L;
    public int M;
    public final RectF N;
    public final RectF O;
    public long P;
    public final Path Q;
    public final float[] R;
    public final float[] S;
    public final g6 T;
    public dh.b U;
    public boolean V;
    public ch.d W;
    public ci.d4 f32385a;
    public ch.d f32386a0;
    public ci.d4 f32387b;
    public ch.d f32388b0;
    public ShapeDrawable f32389c;
    public boolean f32390c0;
    public final Drawable d;
    public boolean f32391d0;
    public final String f32392e;
    public boolean f32393e0;
    public StaticLayout f32394f;
    public final ChatActivityEnterView f32395f0;
    public float h;
    public final TextPaint f32396n;
    public final Paint f32397r;
    public final Paint f32398s;
    public final Paint v;
    public final Path f32399w;
    public final Paint f32400x;
    public final ci.l f32401y;

    public wg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32395f0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f32396n = textPaint;
        this.f32397r = new Paint(1);
        this.f32398s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f32399w = new Path();
        this.f32400x = new Paint(1);
        Paint paint2 = new Paint(1);
        this.G = paint2;
        Paint paint3 = new Paint(1);
        this.H = paint3;
        js jsVar = js.h;
        g6 g6Var = new g6(this, 0L, 220L, jsVar);
        this.I = g6Var;
        Paint paint4 = new Paint(1);
        this.K = paint4;
        this.N = new RectF();
        this.O = new RectF();
        this.Q = new Path();
        this.R = r2;
        this.S = r0;
        this.T = new g6(this, 0L, 350L, jsVar);
        vg vgVar = new vg(this, this);
        this.L = vgVar;
        r0.i0.j(this, vgVar);
        ci.l lVar = new ci.l(5);
        this.f32401y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.f23768y4 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20530be), PorterDuff.Mode.MULTIPLY));
        this.f32389c = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(5.0f), chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20807qf));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.d = context.getDrawable(R.drawable.tooltip_arrow);
        this.f32392e = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
        float dp = AndroidUtilities.dp(3.0f);
        float[] fArr = {dp, dp, 0.0f, 0.0f, 0.0f, 0.0f, dp, dp};
        float[] fArr2 = {0.0f, 0.0f, r5, r5, r5, r5, 0.0f, 0.0f};
        float dp2 = AndroidUtilities.dp(3.0f);
        this.E = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.F = getResources().getDrawable(R.drawable.input_video).mutate();
        paint2.setTextSize(AndroidUtilities.dp(16.0f));
        paint2.setTypeface(AndroidUtilities.bold());
        paint2.setTextAlign(Paint.Align.CENTER);
        paint3.setTextSize(AndroidUtilities.dp(14.0f));
        paint3.setTextAlign(Paint.Align.LEFT);
        g6Var.d(0.0f, true);
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(AndroidUtilities.dpf2(1.5f));
        setWillNotDraw(false);
        c();
    }

    public final void a() {
        ci.d4 d4Var = this.f32385a;
        if (d4Var != null) {
            d4Var.f4916l0 = new ug(this, d4Var, 1);
            d4Var.e(true);
            this.f32385a = null;
        }
        ci.d4 d4Var2 = this.f32387b;
        if (d4Var2 != null) {
            d4Var2.f4916l0 = new ug(this, d4Var2, 2);
            d4Var2.e(true);
            this.f32387b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        ci.d4 d4Var = new ci.d4(getContext(), 2);
        this.f32387b = d4Var;
        d4Var.l(1.0f, 0.0f);
        this.f32387b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.f32395f0;
        if (chatActivityEnterView.f23631c1) {
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
        this.f32387b.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        ci.d4 d4Var2 = this.f32387b;
        d4Var2.h = ci.d4.a(d4Var2.getText(), this.f32387b.getTextPaint());
        if (chatActivityEnterView.O) {
            ci.d4 d4Var3 = this.f32387b;
            int i11 = R.raw.fire_on;
            d4Var3.getClass();
            fk0 fk0Var = new fk0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            fk0Var.start();
            d4Var3.j(fk0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f32387b, w7.w5.a(-1.0f, 0.0f, 0.0f, 54.0f, 58.0f, -1, 119));
        ci.d4 d4Var4 = this.f32387b;
        d4Var4.f4916l0 = new ug(this, d4Var4, 0);
        d4Var4.u();
    }

    public final void c() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        dh.b bVar = this.U;
        if (bVar != null) {
            bVar.c();
        }
        ch.d dVar = this.W;
        if (dVar != null) {
            dVar.v();
        }
        ch.d dVar2 = this.f32386a0;
        if (dVar2 != null) {
            dVar2.v();
        }
        ch.d dVar3 = this.f32388b0;
        if (dVar3 != null) {
            dVar3.v();
        }
        if (this.V) {
            i10 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.Zd;
        }
        ChatActivityEnterView chatActivityEnterView = this.f32395f0;
        this.f32401y.e(chatActivityEnterView.j0(i10), chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20549cf), -1);
        this.f32396n.setColor(chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20788pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i15 = org.telegram.ui.ActionBar.h6.f20807qf;
        this.f32389c = org.telegram.ui.ActionBar.h6.c0(dp, chatActivityEnterView.j0(i15));
        int j02 = chatActivityEnterView.j0(i15);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.d.setColorFilter(new PorterDuffColorFilter(j02, mode));
        this.f32397r.setColor(chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20510ae));
        if (this.V) {
            i11 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.f32398s.setColor(chatActivityEnterView.j0(i11));
        if (this.V) {
            i12 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.v.setColor(chatActivityEnterView.j0(i12));
        int i16 = org.telegram.ui.ActionBar.h6.Yd;
        this.G.setColor(chatActivityEnterView.j0(i16));
        this.H.setColor(chatActivityEnterView.j0(i16));
        this.K.setColor(chatActivityEnterView.j0(i16));
        this.J = LocaleController.getString(R.string.RecordedAudioRecognizing);
        if (this.V) {
            i13 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.E.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i13), mode));
        if (this.V) {
            i14 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i14 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.F.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i14), mode));
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.L.f(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onDraw(android.graphics.Canvas r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wg.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(250.0f) + this.f32395f0.f23682k3;
        if (this.M != size) {
            this.M = size;
            StaticLayout staticLayout = new StaticLayout(this.f32392e, this.f32396n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f32394f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f32394f.getLineWidth(i12);
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
        boolean z10;
        int x10 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        ChatActivityEnterView chatActivityEnterView = this.f32395f0;
        RectF rectF = chatActivityEnterView.f23742u4;
        RectF rectF2 = chatActivityEnterView.f23748v4;
        if (chatActivityEnterView.f23682k3 <= 0 || y3 < getHeight() - chatActivityEnterView.f23682k3) {
            int action = motionEvent.getAction();
            RectF rectF3 = this.O;
            if (action == 0) {
                if (chatActivityEnterView.V4) {
                    float f7 = x10;
                    float f10 = y3;
                    this.f32391d0 = rectF.contains(f7, f10);
                    if (!rectF2.isEmpty() && rectF2.contains(f7, f10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f32393e0 = z10;
                }
                if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.Q4 > 0.1f) {
                    this.f32390c0 = rectF3.contains(x10, y3);
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f32393e0 && rectF2.contains(x10, y3)) {
                    chatActivityEnterView.A1();
                    this.f32393e0 = false;
                    this.f32390c0 = false;
                    this.f32391d0 = false;
                    return true;
                } else if (this.f32391d0 && rectF.contains(x10, y3)) {
                    if (chatActivityEnterView.f23631c1) {
                        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23680k1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        chatActivityEnterView.Z2.t1();
                    } else {
                        tg tgVar = new tg(this, 0);
                        ci.d4 d4Var = this.f32385a;
                        if (d4Var != null && d4Var.V) {
                            a();
                        }
                        ol0 ol0Var = chatActivityEnterView.f23663h1;
                        if (ol0Var != null) {
                            ol0Var.setPlaying(false);
                        }
                        if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f23663h1.getAudioLeft() > 0.01f || chatActivityEnterView.f23663h1.getAudioRight() < 0.99f)) {
                            md mdVar = new md(4, this, tgVar);
                            if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.f23774z4);
                                alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.RecordingTrimTitle);
                                alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.RecordingTrimText);
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s(mdVar, 19));
                                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                            } else {
                                mdVar.run();
                            }
                        } else {
                            tgVar.run();
                        }
                    }
                    this.f32393e0 = false;
                    this.f32390c0 = false;
                    this.f32391d0 = false;
                    return true;
                } else if (this.f32390c0 && rectF3.contains(x10, y3)) {
                    boolean z11 = !chatActivityEnterView.O;
                    chatActivityEnterView.O = z11;
                    this.f32401y.d(1, z11, true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
                    if (eoVar != null && eoVar.f37281h4) {
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
                    this.f32393e0 = false;
                    this.f32390c0 = false;
                    this.f32391d0 = false;
                    return true;
                } else {
                    this.f32393e0 = false;
                    this.f32390c0 = false;
                    this.f32391d0 = false;
                }
            } else if (motionEvent.getAction() == 3) {
                this.f32393e0 = false;
                this.f32390c0 = false;
                this.f32391d0 = false;
            }
            if (this.f32391d0 || this.f32390c0 || this.f32393e0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setBlurredBackgroundFactory(ah.c cVar) {
        this.V = true;
        if (this.U == null) {
            this.U = new dh.b(org.telegram.ui.ActionBar.h6.f20510ae, this.f32395f0.f23774z4);
        }
        ch.d c10 = cVar.c(this, this.U, false);
        this.W = c10;
        c10.q(AndroidUtilities.dp(18.0f));
        this.W.p(AndroidUtilities.dp(3.0f));
        ch.d c11 = cVar.c(this, this.U, false);
        this.f32386a0 = c11;
        c11.q(AndroidUtilities.dp(18.0f));
        this.f32386a0.p(AndroidUtilities.dp(3.0f));
        ch.d c12 = cVar.c(this, this.U, false);
        this.f32388b0 = c12;
        c12.q(AndroidUtilities.dp(18.0f));
        this.f32388b0.p(AndroidUtilities.dp(3.0f));
        c();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.f32401y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

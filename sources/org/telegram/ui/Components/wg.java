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
    public final ci.l E;
    public final Drawable F;
    public final Drawable G;
    public final Paint H;
    public final Paint I;
    public final g6 J;
    public String K;
    public final Paint L;
    public final vg M;
    public int N;
    public final RectF O;
    public final RectF P;
    public long Q;
    public final Path R;
    public final float[] S;
    public final float[] T;
    public final g6 U;
    public dh.b V;
    public boolean W;
    public final g6 f32371a;
    public ch.d f32372a0;
    public ci.d4 f32373b;
    public ch.d f32374b0;
    public ci.d4 f32375c;
    public ch.d f32376c0;
    public ShapeDrawable d;
    public boolean f32377d0;
    public final Drawable f32378e;
    public boolean f32379e0;
    public final String f32380f;
    public boolean f32381f0;
    public final ChatActivityEnterView f32382g0;
    public StaticLayout h;
    public float f32383n;
    public final TextPaint f32384r;
    public final Paint f32385s;
    public final Paint v;
    public final Paint f32386w;
    public final Path f32387x;
    public final Paint f32388y;

    public wg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32382g0 = chatActivityEnterView;
        js jsVar = js.h;
        this.f32371a = new g6(this, 0L, 280L, jsVar);
        TextPaint textPaint = new TextPaint(1);
        this.f32384r = textPaint;
        this.f32385s = new Paint(1);
        this.v = new Paint(1);
        Paint paint = new Paint(1);
        this.f32386w = paint;
        this.f32387x = new Path();
        this.f32388y = new Paint(1);
        Paint paint2 = new Paint(1);
        this.H = paint2;
        Paint paint3 = new Paint(1);
        this.I = paint3;
        g6 g6Var = new g6(this, 0L, 220L, jsVar);
        this.J = g6Var;
        Paint paint4 = new Paint(1);
        this.L = paint4;
        this.O = new RectF();
        this.P = new RectF();
        this.R = new Path();
        this.S = r2;
        this.T = r0;
        this.U = new g6(this, 0L, 350L, jsVar);
        vg vgVar = new vg(this, this);
        this.M = vgVar;
        r0.i0.j(this, vgVar);
        ci.l lVar = new ci.l(5);
        this.E = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.f23769y4 = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20531be), PorterDuff.Mode.MULTIPLY));
        this.d = org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(5.0f), chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20808qf));
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        this.f32378e = context.getDrawable(R.drawable.tooltip_arrow);
        this.f32380f = LocaleController.getString("SlideUpToLock", R.string.SlideUpToLock);
        float dp = AndroidUtilities.dp(3.0f);
        float[] fArr = {dp, dp, 0.0f, 0.0f, 0.0f, 0.0f, dp, dp};
        float[] fArr2 = {0.0f, 0.0f, r5, r5, r5, r5, 0.0f, 0.0f};
        float dp2 = AndroidUtilities.dp(3.0f);
        this.F = getResources().getDrawable(R.drawable.input_mic).mutate();
        this.G = getResources().getDrawable(R.drawable.input_video).mutate();
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
        d();
    }

    public static void a(wg wgVar) {
        wgVar.f32371a.d(wgVar.getSideControlsShiftTarget(), true);
        wgVar.invalidate();
    }

    private float getSideControlsShiftTarget() {
        int i10;
        aa.a aVar;
        ChatActivityEnterView chatActivityEnterView = this.f32382g0;
        jh.h hVar = chatActivityEnterView.J5;
        if (hVar != null && hVar.getVisibility() == 0) {
            jh.h hVar2 = chatActivityEnterView.J5;
            if (chatActivityEnterView.H5) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i11 = 0;
            while (true) {
                aa.a[] aVarArr = hVar2.f14197e;
                if (i11 < aVarArr.length) {
                    if (i11 != i10 && (aVar = aVarArr[i11]) != null && ((me.b) aVar.f387c).f16089f) {
                        return AndroidUtilities.dp(52.0f);
                    }
                    i11++;
                } else {
                    return 0.0f;
                }
            }
        } else {
            return 0.0f;
        }
    }

    public final void b() {
        ci.d4 d4Var = this.f32373b;
        if (d4Var != null) {
            d4Var.f4916l0 = new ug(this, d4Var, 1);
            d4Var.e(true);
            this.f32373b = null;
        }
        ci.d4 d4Var2 = this.f32375c;
        if (d4Var2 != null) {
            d4Var2.f4916l0 = new ug(this, d4Var2, 2);
            d4Var2.e(true);
            this.f32375c = null;
        }
    }

    public final void c() {
        int i10;
        b();
        ci.d4 d4Var = new ci.d4(getContext(), 2);
        this.f32375c = d4Var;
        d4Var.l(1.0f, 0.0f);
        this.f32375c.p(true);
        ChatActivityEnterView chatActivityEnterView = this.f32382g0;
        if (chatActivityEnterView.f23632c1) {
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
        this.f32375c.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        ci.d4 d4Var2 = this.f32375c;
        d4Var2.h = ci.d4.a(d4Var2.getText(), this.f32375c.getTextPaint());
        if (chatActivityEnterView.O) {
            ci.d4 d4Var3 = this.f32375c;
            int i11 = R.raw.fire_on;
            d4Var3.getClass();
            fk0 fk0Var = new fk0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            fk0Var.start();
            d4Var3.j(fk0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f32375c, w7.w5.a(-1.0f, 0.0f, 0.0f, 54.0f, 58.0f, -1, 119));
        ci.d4 d4Var4 = this.f32375c;
        d4Var4.f4916l0 = new ug(this, d4Var4, 0);
        d4Var4.u();
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        dh.b bVar = this.V;
        if (bVar != null) {
            bVar.c();
        }
        ch.d dVar = this.f32372a0;
        if (dVar != null) {
            dVar.v();
        }
        ch.d dVar2 = this.f32374b0;
        if (dVar2 != null) {
            dVar2.v();
        }
        ch.d dVar3 = this.f32376c0;
        if (dVar3 != null) {
            dVar3.v();
        }
        if (this.W) {
            i10 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i10 = org.telegram.ui.ActionBar.h6.Zd;
        }
        ChatActivityEnterView chatActivityEnterView = this.f32382g0;
        this.E.e(chatActivityEnterView.j0(i10), chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20550cf), -1);
        this.f32384r.setColor(chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20789pf));
        int dp = AndroidUtilities.dp(5.0f);
        int i15 = org.telegram.ui.ActionBar.h6.f20808qf;
        this.d = org.telegram.ui.ActionBar.h6.c0(dp, chatActivityEnterView.j0(i15));
        int j02 = chatActivityEnterView.j0(i15);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f32378e.setColorFilter(new PorterDuffColorFilter(j02, mode));
        this.f32385s.setColor(chatActivityEnterView.j0(org.telegram.ui.ActionBar.h6.f20511ae));
        if (this.W) {
            i11 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i11 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.v.setColor(chatActivityEnterView.j0(i11));
        if (this.W) {
            i12 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i12 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.f32386w.setColor(chatActivityEnterView.j0(i12));
        int i16 = org.telegram.ui.ActionBar.h6.Yd;
        this.H.setColor(chatActivityEnterView.j0(i16));
        this.I.setColor(chatActivityEnterView.j0(i16));
        this.L.setColor(chatActivityEnterView.j0(i16));
        this.K = LocaleController.getString(R.string.RecordedAudioRecognizing);
        if (this.W) {
            i13 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i13 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.F.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i13), mode));
        if (this.W) {
            i14 = org.telegram.ui.ActionBar.h6.Wk;
        } else {
            i14 = org.telegram.ui.ActionBar.h6.Zd;
        }
        this.G.setColorFilter(new PorterDuffColorFilter(chatActivityEnterView.j0(i14), mode));
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!super.dispatchHoverEvent(motionEvent) && !this.M.f(motionEvent)) {
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
        int dp = AndroidUtilities.dp(250.0f) + this.f32382g0.f23683k3;
        if (this.N != size) {
            this.N = size;
            StaticLayout staticLayout = new StaticLayout(this.f32380f, this.f32384r, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.h = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.f32383n = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.h.getLineWidth(i12);
                if (lineWidth > this.f32383n) {
                    this.f32383n = lineWidth;
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
        ChatActivityEnterView chatActivityEnterView = this.f32382g0;
        RectF rectF = chatActivityEnterView.f23743u4;
        RectF rectF2 = chatActivityEnterView.f23749v4;
        if (chatActivityEnterView.f23683k3 <= 0 || y3 < getHeight() - chatActivityEnterView.f23683k3) {
            int action = motionEvent.getAction();
            RectF rectF3 = this.P;
            if (action == 0) {
                if (chatActivityEnterView.V4) {
                    float f7 = x10;
                    float f10 = y3;
                    this.f32379e0 = rectF.contains(f7, f10);
                    if (!rectF2.isEmpty() && rectF2.contains(f7, f10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f32381f0 = z10;
                }
                if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.Q4 > 0.1f) {
                    this.f32377d0 = rectF3.contains(x10, y3);
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.f32381f0 && rectF2.contains(x10, y3)) {
                    chatActivityEnterView.A1();
                    this.f32381f0 = false;
                    this.f32377d0 = false;
                    this.f32379e0 = false;
                    return true;
                } else if (this.f32379e0 && rectF.contains(x10, y3)) {
                    if (chatActivityEnterView.f23632c1) {
                        ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f23681k1;
                        if (slideTextView != null) {
                            slideTextView.setEnabled(false);
                        }
                        chatActivityEnterView.Z2.t1();
                    } else {
                        tg tgVar = new tg(this, 0);
                        ci.d4 d4Var = this.f32373b;
                        if (d4Var != null && d4Var.V) {
                            b();
                        }
                        ol0 ol0Var = chatActivityEnterView.f23664h1;
                        if (ol0Var != null) {
                            ol0Var.setPlaying(false);
                        }
                        if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f23664h1.getAudioLeft() > 0.01f || chatActivityEnterView.f23664h1.getAudioRight() < 0.99f)) {
                            md mdVar = new md(5, this, tgVar);
                            if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.f23775z4);
                                alertDialog$Builder.f20142a.R = LocaleController.getString(R.string.RecordingTrimTitle);
                                alertDialog$Builder.f20142a.T = LocaleController.getString(R.string.RecordingTrimText);
                                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s(mdVar, 19));
                                hg.c.r(R.string.Cancel, alertDialog$Builder, null);
                            } else {
                                mdVar.run();
                            }
                        } else {
                            tgVar.run();
                        }
                    }
                    this.f32381f0 = false;
                    this.f32377d0 = false;
                    this.f32379e0 = false;
                    return true;
                } else if (this.f32377d0 && rectF3.contains(x10, y3)) {
                    boolean z11 = !chatActivityEnterView.O;
                    chatActivityEnterView.O = z11;
                    this.E.d(1, z11, true);
                    MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                    long j10 = chatActivityEnterView.Q2;
                    org.telegram.ui.eo eoVar = chatActivityEnterView.P2;
                    if (eoVar != null && eoVar.f37286h4) {
                        j3 = eoVar.d();
                    } else {
                        j3 = 0;
                    }
                    mediaDataController.toggleDraftVoiceOnce(j10, j3, chatActivityEnterView.O);
                    if (chatActivityEnterView.O) {
                        c();
                    } else {
                        b();
                    }
                    invalidate();
                    this.f32381f0 = false;
                    this.f32377d0 = false;
                    this.f32379e0 = false;
                    return true;
                } else {
                    this.f32381f0 = false;
                    this.f32377d0 = false;
                    this.f32379e0 = false;
                }
            } else if (motionEvent.getAction() == 3) {
                this.f32381f0 = false;
                this.f32377d0 = false;
                this.f32379e0 = false;
            }
            if (this.f32379e0 || this.f32377d0 || this.f32381f0) {
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
        this.W = true;
        if (this.V == null) {
            this.V = new dh.b(org.telegram.ui.ActionBar.h6.f20511ae, this.f32382g0.f23775z4);
        }
        ch.d c10 = cVar.c(this, this.V, false);
        this.f32372a0 = c10;
        c10.q(AndroidUtilities.dp(18.0f));
        this.f32372a0.p(AndroidUtilities.dp(3.0f));
        ch.d c11 = cVar.c(this, this.V, false);
        this.f32374b0 = c11;
        c11.q(AndroidUtilities.dp(18.0f));
        this.f32374b0.p(AndroidUtilities.dp(3.0f));
        ch.d c12 = cVar.c(this, this.V, false);
        this.f32376c0 = c12;
        c12.q(AndroidUtilities.dp(18.0f));
        this.f32376c0.p(AndroidUtilities.dp(3.0f));
        d();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.E && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}

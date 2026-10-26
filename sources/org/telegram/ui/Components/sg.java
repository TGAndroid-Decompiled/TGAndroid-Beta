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
public final class sg extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
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
    public final h6 O;
    public fh.b P;
    public boolean Q;
    public eh.d R;
    public eh.d S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public fi.v3 f32541a;
    public boolean f32542a0;
    public fi.v3 f32543b;
    public final ChatActivityEnterView f32544b0;
    public ShapeDrawable f32545c;
    public final Drawable d;
    public final String e;
    public StaticLayout f32546f;
    public float h;
    public final TextPaint f32547n;
    public final Paint f32548r;
    public final Paint f32549s;
    public final Paint v;
    public final Path f32550w;
    public final Paint f32551x;
    public final fi.l f32552y;

    public sg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.f32544b0 = chatActivityEnterView;
        TextPaint textPaint = new TextPaint(1);
        this.f32547n = textPaint;
        this.f32548r = new Paint(1);
        this.f32549s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.f32550w = new Path();
        this.f32551x = new Paint(1);
        this.I = new RectF();
        this.J = new RectF();
        this.L = new Path();
        this.M = r4;
        this.N = r3;
        this.O = new h6(this, 0L, 350L, ds.h);
        rg rgVar = new rg(this, this);
        this.G = rgVar;
        r0.i0.k(this, rgVar);
        fi.l lVar = new fi.l(5);
        this.f32552y = lVar;
        lVar.setCallback(this);
        lVar.d(1, chatActivityEnterView.O, false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.7f));
        Drawable drawable = getResources().getDrawable(R.drawable.lock_round_shadow);
        chatActivityEnterView.V3 = drawable;
        org.telegram.ui.ActionBar.f7.y(this, drawable, org.telegram.ui.ActionBar.y6.f23325be, chatActivityEnterView.W3, PorterDuff.Mode.MULTIPLY);
        this.f32545c = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.f23604qf));
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
        fi.v3 v3Var = this.f32541a;
        if (v3Var != null) {
            v3Var.f11798l0 = new qg(this, v3Var, 1);
            v3Var.e(true);
            this.f32541a = null;
        }
        fi.v3 v3Var2 = this.f32543b;
        if (v3Var2 != null) {
            v3Var2.f11798l0 = new qg(this, v3Var2, 2);
            v3Var2.e(true);
            this.f32543b = null;
        }
    }

    public final void b() {
        int i10;
        a();
        fi.v3 v3Var = new fi.v3(getContext(), 2);
        this.f32543b = v3Var;
        v3Var.l(1.0f, 0.0f);
        this.f32543b.p(true);
        ChatActivityEnterView chatActivityEnterView = this.f32544b0;
        if (chatActivityEnterView.f25859c1) {
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
        this.f32543b.s(AndroidUtilities.replaceTags(LocaleController.getString(i10)));
        fi.v3 v3Var2 = this.f32543b;
        v3Var2.h = fi.v3.a(v3Var2.getText(), this.f32543b.getTextPaint());
        if (chatActivityEnterView.O) {
            fi.v3 v3Var3 = this.f32543b;
            int i11 = R.raw.fire_on;
            v3Var3.getClass();
            xj0 xj0Var = new xj0(i11, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
            xj0Var.start();
            v3Var3.j(xj0Var);
        } else {
            MessagesController.getGlobalMainSettings().edit().putInt("voiceoncehint", MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) + 1).apply();
        }
        addView(this.f32543b, gb1.h(-1, -1.0f, 119, 0.0f, 0.0f, 54.0f, 58.0f));
        fi.v3 v3Var4 = this.f32543b;
        v3Var4.f11798l0 = new qg(this, v3Var4, 0);
        v3Var4.u();
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
            StaticLayout staticLayout = new StaticLayout(this.e, this.f32547n, AndroidUtilities.dp(220.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            this.f32546f = staticLayout;
            int lineCount = staticLayout.getLineCount();
            this.h = 0.0f;
            for (int i12 = 0; i12 < lineCount; i12++) {
                float lineWidth = this.f32546f.getLineWidth(i12);
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
        ChatActivityEnterView chatActivityEnterView = this.f32544b0;
        RectF rectF = chatActivityEnterView.S3;
        int x9 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        RectF rectF2 = this.J;
        if (action == 0) {
            if (chatActivityEnterView.f25957s4) {
                this.f32542a0 = rectF.contains(x9, y3);
            }
            if (chatActivityEnterView.P && chatActivityEnterView.N1 != null && chatActivityEnterView.f25927n4 > 0.1f) {
                this.W = rectF2.contains(x9, y3);
            }
        } else if (motionEvent.getAction() == 1) {
            if (this.f32542a0 && rectF.contains(x9, y3)) {
                if (chatActivityEnterView.f25859c1) {
                    ChatActivityEnterView.SlideTextView slideTextView = chatActivityEnterView.f25908k1;
                    if (slideTextView != null) {
                        slideTextView.setEnabled(false);
                    }
                    chatActivityEnterView.Z2.X0();
                } else {
                    pg pgVar = new pg(this, 0);
                    fi.v3 v3Var = this.f32541a;
                    if (v3Var != null && v3Var.V) {
                        a();
                    }
                    gl0 gl0Var = chatActivityEnterView.f25890h1;
                    if (gl0Var != null) {
                        gl0Var.setPlaying(false);
                    }
                    if (MediaController.getInstance().isRecordingPaused() && (chatActivityEnterView.f25890h1.getAudioLeft() > 0.01f || chatActivityEnterView.f25890h1.getAudioRight() < 0.99f)) {
                        org.telegram.ui.ip ipVar = new org.telegram.ui.ip(13, this, pgVar);
                        if (MessagesController.getGlobalMainSettings().getBoolean("trimvoicehint", true)) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, chatActivityEnterView.W3);
                            alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.RecordingTrimTitle);
                            alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.RecordingTrimText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s(ipVar, 19));
                            ic.a.r(R.string.Cancel, alertDialog$Builder, null);
                        } else {
                            ipVar.run();
                        }
                    } else {
                        pgVar.run();
                    }
                }
                this.W = false;
                this.f32542a0 = false;
                return true;
            } else if (this.W && rectF2.contains(x9, y3)) {
                boolean z10 = !chatActivityEnterView.O;
                chatActivityEnterView.O = z10;
                this.f32552y.d(1, z10, true);
                MediaDataController mediaDataController = MediaDataController.getInstance(chatActivityEnterView.Q);
                long j11 = chatActivityEnterView.Q2;
                org.telegram.ui.un unVar = chatActivityEnterView.P2;
                if (unVar != null && unVar.f44422t4) {
                    j10 = unVar.b();
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
                this.f32542a0 = false;
                return true;
            } else {
                this.W = false;
                this.f32542a0 = false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.W = false;
            this.f32542a0 = false;
        }
        if (!this.f32542a0 && !this.W) {
            return false;
        }
        return true;
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
    }

    public void setBlurredBackgroundFactory(ch.b bVar) {
        this.Q = true;
        if (this.P == null) {
            this.P = new fh.b(org.telegram.ui.ActionBar.y6.f23305ae, this.f32544b0.W3);
        }
        eh.d c10 = bVar.c(this, this.P, false);
        this.R = c10;
        c10.x(AndroidUtilities.dp(18.0f));
        this.R.w(AndroidUtilities.dp(3.0f));
        eh.d c11 = bVar.c(this, this.P, false);
        this.S = c11;
        c11.x(AndroidUtilities.dp(18.0f));
        this.S.w(AndroidUtilities.dp(3.0f));
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
        fi.l lVar = this.f32552y;
        if (lVar != null && (textPaint = this.f32547n) != null && (drawable = this.E) != null && (drawable2 = this.F) != null) {
            fh.b bVar = this.P;
            if (bVar != null) {
                bVar.c();
            }
            eh.d dVar = this.R;
            if (dVar != null) {
                dVar.updateColors();
            }
            eh.d dVar2 = this.S;
            if (dVar2 != null) {
                dVar2.updateColors();
            }
            if (this.Q) {
                i10 = org.telegram.ui.ActionBar.y6.Wk;
            } else {
                i10 = org.telegram.ui.ActionBar.y6.Zd;
            }
            ChatActivityEnterView chatActivityEnterView = this.f32544b0;
            lVar.e(chatActivityEnterView.f0(i10), chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.f23346cf), -1);
            textPaint.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.f23587pf));
            ShapeDrawable shapeDrawable = this.f32545c;
            if (shapeDrawable != null) {
                org.telegram.ui.ActionBar.y6.z1(chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.f23604qf), shapeDrawable);
            } else {
                this.f32545c = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(5.0f), chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.f23604qf));
            }
            int f02 = chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.f23604qf);
            Drawable drawable3 = this.d;
            if (drawable3 != null && f02 != this.T) {
                this.T = f02;
                drawable3.setColorFilter(new PorterDuffColorFilter(f02, PorterDuff.Mode.SRC_IN));
            }
            this.f32548r.setColor(chatActivityEnterView.f0(org.telegram.ui.ActionBar.y6.f23305ae));
            if (this.Q) {
                i11 = org.telegram.ui.ActionBar.y6.Wk;
            } else {
                i11 = org.telegram.ui.ActionBar.y6.Zd;
            }
            this.f32549s.setColor(chatActivityEnterView.f0(i11));
            if (this.Q) {
                i12 = org.telegram.ui.ActionBar.y6.Wk;
            } else {
                i12 = org.telegram.ui.ActionBar.y6.Zd;
            }
            this.v.setColor(chatActivityEnterView.f0(i12));
            if (this.Q) {
                i13 = org.telegram.ui.ActionBar.y6.Wk;
            } else {
                i13 = org.telegram.ui.ActionBar.y6.Zd;
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
        if (drawable != this.f32552y && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

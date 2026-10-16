package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class wi0 extends View {
    public int E;
    public float F;
    public int G;
    public boolean H;
    public RenderNode I;
    public float J;
    public float K;
    public float L;
    public final org.telegram.ui.ActionBar.c6 f30583a;
    public final PorterDuffColorFilter f30584b;
    public final PorterDuffColorFilter f30585c;
    public i11 d;
    public i11 e;
    public final Paint f30586f;
    public final Paint h;
    public final Path f30587n;
    public final Drawable f30588r;
    public final RectF f30589s;
    public final Paint v;
    public final Paint f30590w;
    public final Path f30591x;
    public final ad f30592y;

    public wi0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f30584b = new PorterDuffColorFilter(-1, mode);
        this.f30585c = new PorterDuffColorFilter(-16777216, mode);
        this.f30586f = new Paint();
        Paint paint = new Paint();
        this.h = paint;
        Path path = new Path();
        this.f30587n = path;
        this.f30589s = new RectF();
        this.v = new Paint(1);
        this.f30590w = new Paint(1);
        this.f30591x = new Path();
        this.f30592y = new ad(this);
        this.E = -1;
        this.f30583a = c6Var;
        this.f30588r = context.getResources().getDrawable(R.drawable.files_music).mutate();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        path.moveTo(0.0f, -AndroidUtilities.dpf2(3.33f));
        path.lineTo(AndroidUtilities.dpf2(3.16f), 0.0f);
        path.lineTo(0.0f, AndroidUtilities.dpf2(3.33f));
        setColor(null);
        c("Author", " - Title");
    }

    public final void a() {
        boolean z10;
        int i10;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.F < 0.8f && AndroidUtilities.computePerceivedBrightness(this.G) > 0.85f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.E = i10;
        if (z10) {
            porterDuffColorFilter = this.f30585c;
        } else {
            porterDuffColorFilter = this.f30584b;
        }
        this.f30588r.setColorFilter(porterDuffColorFilter);
        this.f30586f.setColor(this.E);
        this.h.setColor(org.telegram.ui.ActionBar.g6.m1(0.85f, this.E));
        invalidate();
    }

    public final void b() {
        if (this.I != null) {
            this.I = null;
            invalidate();
        }
    }

    public final void c(String str, String str2) {
        this.d = new i11(str, 11.0f, AndroidUtilities.bold());
        this.e = new i11(str2, 11.0f, null);
        setContentDescription(LocaleController.getString(R.string.AccDescrProfileMusic) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.clamp01(this.L / AndroidUtilities.dp(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f30589s;
        ad adVar = this.f30592y;
        if (action == 0) {
            adVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && adVar.f23201i) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                adVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            adVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (adVar.f23201i) {
                performClick();
            }
            adVar.c(false);
        }
        return adVar.f23201i;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.e != null) {
            float clamp01 = Utilities.clamp01(this.L / AndroidUtilities.dp(21.0f));
            float a2 = this.f30592y.a(0.02f);
            if (clamp01 > 0.0f) {
                int width = getWidth() - (AndroidUtilities.dp(12.0f) * 2);
                this.d.f25465p = (width - AndroidUtilities.dp(35.0f)) / 2.0f;
                this.e.f25465p = (width - this.d.l()) - AndroidUtilities.dp(35.0f);
                float l4 = this.e.l() + this.d.l() + AndroidUtilities.dp(16.6f) + AndroidUtilities.dp(8.0f);
                float dp = AndroidUtilities.dp(16.0f) + l4;
                canvas.save();
                canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
                float dp2 = (AndroidUtilities.dp(17.0f) * clamp01) + AndroidUtilities.dp(10.0f);
                RectF rectF = this.f30589s;
                rectF.set((getWidth() - dp) / 2.0f, AndroidUtilities.dp(10.0f), (getWidth() + dp) / 2.0f, dp2);
                boolean z10 = this.H;
                Paint paint = this.f30590w;
                Paint paint2 = this.v;
                if (z10 && SharedConfig.shadowsInSections) {
                    paint2.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.g6.m1(clamp01, 167772160));
                    paint.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.g6.m1(clamp01, 201326592));
                    paint.setColor(0);
                } else {
                    paint2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * clamp01));
                if (this.H && SharedConfig.shadowsInSections) {
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                }
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                paint2.setAlpha(alpha);
                Path path = this.f30591x;
                path.rewind();
                path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (this.I != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                    canvas.save();
                    canvas.translate(0.0f, this.K);
                    float f7 = this.J;
                    canvas.scale(f7, f7);
                    canvas.drawRenderNode(this.I);
                    canvas.restore();
                }
                canvas.translate((getWidth() - l4) / 2.0f, 0.0f);
                float height = getHeight() / 2.0f;
                AndroidUtilities.dp(6.0f);
                AndroidUtilities.dp(2.0f);
                int dp3 = AndroidUtilities.dp(13.0f);
                int i10 = (int) height;
                int i11 = dp3 / 2;
                int i12 = i10 - i11;
                int i13 = i10 + i11;
                Drawable drawable = this.f30588r;
                drawable.setBounds(0, i12, dp3, i13);
                drawable.draw(canvas);
                canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
                this.d.c(0.0f, height, clamp01, this.E, canvas);
                canvas.translate(this.d.l(), 0.0f);
                this.e.c(0.0f, height, clamp01 * 0.85f, this.E, canvas);
                canvas.translate(this.e.l(), 0.0f);
                float dpf2 = AndroidUtilities.dpf2(1.16f);
                Paint paint3 = this.h;
                paint3.setStrokeWidth(dpf2);
                canvas.translate(AndroidUtilities.dpf2(4.8f), height);
                canvas.drawPath(this.f30587n, paint3);
                canvas.restore();
                canvas.restore();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824));
    }

    public void setColor(MessagesController.PeerColor peerColor) {
        int bgColor1;
        int bgColor2;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30583a;
        if (peerColor == null) {
            bgColor1 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19880s8, c6Var);
            bgColor2 = bgColor1;
        } else {
            bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
            bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
        }
        if (peerColor == null) {
            this.G = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, c6Var);
            this.H = true;
        } else {
            this.G = org.telegram.ui.ActionBar.g6.b(0.04f, -0.09f, i0.a.d(0.15f, bgColor1, bgColor2));
            this.H = false;
        }
        this.v.setColor(this.G);
        a();
    }

    public void setMusicDocument(TLRPC.Document document) {
        String str;
        int i10 = 0;
        String str2 = null;
        if (document != null) {
            for (int i11 = 0; i11 < document.attributes.size(); i11++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    str = documentAttribute.performer;
                    break;
                }
            }
        }
        str = null;
        if (document != null) {
            while (true) {
                if (i10 < document.attributes.size()) {
                    TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i10);
                    if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                        str2 = documentAttribute2.title;
                        if (str2 == null || str2.length() == 0) {
                            str2 = FileLoader.getDocumentFileName(document);
                        }
                    } else {
                        i10++;
                    }
                } else {
                    String documentFileName = FileLoader.getDocumentFileName(document);
                    if (!TextUtils.isEmpty(documentFileName)) {
                        str2 = documentFileName;
                    }
                }
            }
        }
        if (TextUtils.isEmpty(str)) {
            if (!TextUtils.isEmpty(str2)) {
                str = "";
            } else {
                str = LocaleController.getString(R.string.AudioUnknownArtist);
                str2 = org.telegram.messenger.g0.g(R.string.AudioUnknownTitle, new StringBuilder(" - "));
            }
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "";
        } else {
            str2 = " - " + ((Object) str2);
        }
        c(str, str2);
    }

    public void setParentExpanded(float f7) {
        if (this.F != f7) {
            this.F = f7;
            a();
            invalidate();
        }
    }
}

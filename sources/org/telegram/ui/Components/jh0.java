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

public final class jh0 extends View {
    public int A;
    public float B;
    public int C;
    public boolean D;
    public RenderNode E;
    public float F;
    public float G;
    public float H;

    public final org.telegram.ui.ActionBar.c6 f29696a;

    public final PorterDuffColorFilter f29697b;

    public final PorterDuffColorFilter f29698c;
    public pz0 d;

    public pz0 f29699e;

    public final Paint f29700f;
    public final Paint h;

    public final Path f29701n;

    public final Drawable f29702r;

    public final RectF f29703s;
    public final Paint v;

    public final Paint f29704w;

    public final Path f29705x;

    public final nc f29706y;

    public jh0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f29697b = new PorterDuffColorFilter(-1, mode);
        this.f29698c = new PorterDuffColorFilter(-16777216, mode);
        this.f29700f = new Paint();
        Paint paint = new Paint();
        this.h = paint;
        Path path = new Path();
        this.f29701n = path;
        this.f29703s = new RectF();
        this.v = new Paint(1);
        this.f29704w = new Paint(1);
        this.f29705x = new Path();
        this.f29706y = new nc(this);
        this.A = -1;
        this.f29696a = c6Var;
        this.f29702r = context.getResources().getDrawable(R.drawable.files_music).mutate();
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
        boolean z10 = this.B < 0.8f && AndroidUtilities.computePerceivedBrightness(this.C) > 0.85f;
        this.A = z10 ? -16777216 : -1;
        this.f29702r.setColorFilter(z10 ? this.f29698c : this.f29697b);
        this.f29700f.setColor(this.A);
        this.h.setColor(org.telegram.ui.ActionBar.g6.l1(0.85f, this.A));
        invalidate();
    }

    public final void b() {
        if (this.E != null) {
            this.E = null;
            invalidate();
        }
    }

    public final void c(String str, String str2) {
        this.d = new pz0(str, 11.0f, AndroidUtilities.bold());
        this.f29699e = new pz0(str2, 11.0f, null);
        setContentDescription(LocaleController.getString(R.string.AccDescrProfileMusic) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.clamp01(this.H / AndroidUtilities.dp(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f29703s;
        nc ncVar = this.f29706y;
        if (action == 0) {
            ncVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && ncVar.h) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                ncVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            ncVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (ncVar.h) {
                performClick();
            }
            ncVar.c(false);
        }
        return ncVar.h;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d == null || this.f29699e == null) {
            return;
        }
        float fClamp01 = Utilities.clamp01(this.H / AndroidUtilities.dp(21.0f));
        float fA = this.f29706y.a(0.02f);
        if (fClamp01 <= 0.0f) {
            return;
        }
        int width = getWidth() - (AndroidUtilities.dp(12.0f) * 2);
        this.d.f31708p = (width - AndroidUtilities.dp(35.0f)) / 2.0f;
        this.f29699e.f31708p = (width - this.d.l()) - AndroidUtilities.dp(35.0f);
        float fL = this.f29699e.l() + this.d.l() + AndroidUtilities.dp(16.6f) + AndroidUtilities.dp(8.0f);
        float fDp = AndroidUtilities.dp(16.0f) + fL;
        canvas.save();
        canvas.scale(fA, fA, getWidth() / 2.0f, getHeight() / 2.0f);
        float width2 = (getWidth() - fDp) / 2.0f;
        float fDp2 = AndroidUtilities.dp(10.0f);
        float width3 = (getWidth() + fDp) / 2.0f;
        float fDp3 = (AndroidUtilities.dp(17.0f) * fClamp01) + AndroidUtilities.dp(10.0f);
        RectF rectF = this.f29703s;
        rectF.set(width2, fDp2, width3, fDp3);
        boolean z10 = this.D;
        Paint paint = this.f29704w;
        Paint paint2 = this.v;
        if (z10 && SharedConfig.shadowsInSections) {
            paint2.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.g6.l1(fClamp01, 167772160));
            paint.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.g6.l1(fClamp01, 201326592));
            paint.setColor(0);
        } else {
            paint2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        int alpha = paint2.getAlpha();
        paint2.setAlpha((int) (alpha * fClamp01));
        if (this.D && SharedConfig.shadowsInSections) {
            canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
        paint2.setAlpha(alpha);
        Path path = this.f29705x;
        path.rewind();
        path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        if (this.E != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
            canvas.save();
            canvas.translate(0.0f, this.G);
            float f10 = this.F;
            canvas.scale(f10, f10);
            canvas.drawRenderNode(this.E);
            canvas.restore();
        }
        canvas.translate((getWidth() - fL) / 2.0f, 0.0f);
        float height = getHeight() / 2.0f;
        AndroidUtilities.dp(6.0f);
        AndroidUtilities.dp(2.0f);
        int iDp = AndroidUtilities.dp(13.0f);
        int i10 = (int) height;
        int i11 = iDp / 2;
        int i12 = i10 - i11;
        int i13 = i10 + i11;
        Drawable drawable = this.f29702r;
        drawable.setBounds(0, i12, iDp, i13);
        drawable.draw(canvas);
        canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
        this.d.c(0.0f, height, fClamp01, this.A, canvas);
        canvas.translate(this.d.l(), 0.0f);
        this.f29699e.c(0.0f, height, fClamp01 * 0.85f, this.A, canvas);
        canvas.translate(this.f29699e.l(), 0.0f);
        float fDpf2 = AndroidUtilities.dpf2(1.16f);
        Paint paint3 = this.h;
        paint3.setStrokeWidth(fDpf2);
        canvas.translate(AndroidUtilities.dpf2(4.8f), height);
        canvas.drawPath(this.f29701n, paint3);
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(37.0f), 1073741824));
    }

    public void setColor(MessagesController.PeerColor peerColor) {
        int bgColor1;
        int bgColor2;
        org.telegram.ui.ActionBar.c6 c6Var = this.f29696a;
        if (peerColor == null) {
            bgColor1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23322s8, c6Var);
            bgColor2 = bgColor1;
        } else {
            bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
            bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
        }
        if (peerColor == null) {
            this.C = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, c6Var);
            this.D = true;
        } else {
            this.C = org.telegram.ui.ActionBar.g6.b(0.04f, -0.09f, i0.b.d(0.15f, bgColor1, bgColor2));
            this.D = false;
        }
        this.v.setColor(this.C);
        a();
    }

    public void setMusicDocument(TLRPC.Document document) {
        String string;
        int i10 = 0;
        String strI = null;
        if (document != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= document.attributes.size()) {
                    string = null;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) && !documentAttribute.voice) {
                    string = documentAttribute.performer;
                    break;
                }
                i11++;
            }
        } else {
            string = null;
            break;
        }
        if (document != null) {
            while (true) {
                if (i10 >= document.attributes.size()) {
                    String documentFileName = FileLoader.getDocumentFileName(document);
                    if (!TextUtils.isEmpty(documentFileName)) {
                        strI = documentFileName;
                        break;
                    }
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute2 = document.attributes.get(i10);
                if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                    strI = documentAttribute2.title;
                    if (strI != null && strI.length() != 0) {
                        break;
                    }
                    strI = FileLoader.getDocumentFileName(document);
                    break;
                }
                i10++;
            }
        }
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(strI)) {
                string = LocaleController.getString(R.string.AudioUnknownArtist);
                strI = org.telegram.messenger.y1.i(R.string.AudioUnknownTitle, new StringBuilder(" - "));
            } else {
                string = "";
            }
        } else if (TextUtils.isEmpty(strI)) {
            strI = "";
        } else {
            strI = " - " + ((Object) strI);
        }
        c(string, strI);
    }

    public void setParentExpanded(float f10) {
        if (this.B != f10) {
            this.B = f10;
            a();
            invalidate();
        }
    }
}

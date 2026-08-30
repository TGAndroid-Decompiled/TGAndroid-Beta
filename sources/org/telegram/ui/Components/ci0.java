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
public final class ci0 extends View {
    public int B;
    public float C;
    public int D;
    public boolean E;
    public RenderNode F;
    public float G;
    public float H;
    public float I;
    public final org.telegram.ui.ActionBar.f6 f24001a;
    public final PorterDuffColorFilter f24002b;
    public final PorterDuffColorFilter f24003c;
    public k01 d;
    public k01 e;
    public final Paint f24004f;
    public final Paint h;
    public final Path f24005n;
    public final Drawable f24006r;
    public final RectF f24007s;
    public final Paint v;
    public final Paint f24008w;
    public final Path f24009x;
    public final rc f24010y;

    public ci0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f24002b = new PorterDuffColorFilter(-1, mode);
        this.f24003c = new PorterDuffColorFilter(-16777216, mode);
        this.f24004f = new Paint();
        Paint paint = new Paint();
        this.h = paint;
        Path path = new Path();
        this.f24005n = path;
        this.f24007s = new RectF();
        this.v = new Paint(1);
        this.f24008w = new Paint(1);
        this.f24009x = new Path();
        this.f24010y = new rc(this);
        this.B = -1;
        this.f24001a = f6Var;
        this.f24006r = context.getResources().getDrawable(R.drawable.files_music).mutate();
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
        boolean z4;
        int i10;
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.C < 0.8f && AndroidUtilities.computePerceivedBrightness(this.D) > 0.85f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.B = i10;
        if (z4) {
            porterDuffColorFilter = this.f24003c;
        } else {
            porterDuffColorFilter = this.f24002b;
        }
        this.f24006r.setColorFilter(porterDuffColorFilter);
        this.f24004f.setColor(this.B);
        this.h.setColor(org.telegram.ui.ActionBar.j6.l1(0.85f, this.B));
        invalidate();
    }

    public final void b() {
        if (this.F != null) {
            this.F = null;
            invalidate();
        }
    }

    public final void c(String str, String str2) {
        this.d = new k01(str, 11.0f, AndroidUtilities.bold());
        this.e = new k01(str2, 11.0f, null);
        setContentDescription(LocaleController.getString(R.string.AccDescrProfileMusic) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.clamp01(this.I / AndroidUtilities.dp(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f24007s;
        rc rcVar = this.f24010y;
        if (action == 0) {
            rcVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && rcVar.h) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                rcVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            rcVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (rcVar.h) {
                performClick();
            }
            rcVar.c(false);
        }
        return rcVar.h;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.e != null) {
            float clamp01 = Utilities.clamp01(this.I / AndroidUtilities.dp(21.0f));
            float a2 = this.f24010y.a(0.02f);
            if (clamp01 > 0.0f) {
                int width = getWidth() - (AndroidUtilities.dp(12.0f) * 2);
                this.d.f26094p = (width - AndroidUtilities.dp(35.0f)) / 2.0f;
                this.e.f26094p = (width - this.d.l()) - AndroidUtilities.dp(35.0f);
                float l10 = this.e.l() + this.d.l() + AndroidUtilities.dp(16.6f) + AndroidUtilities.dp(8.0f);
                float dp = AndroidUtilities.dp(16.0f) + l10;
                canvas.save();
                canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
                float dp2 = (AndroidUtilities.dp(17.0f) * clamp01) + AndroidUtilities.dp(10.0f);
                RectF rectF = this.f24007s;
                rectF.set((getWidth() - dp) / 2.0f, AndroidUtilities.dp(10.0f), (getWidth() + dp) / 2.0f, dp2);
                boolean z4 = this.E;
                Paint paint = this.f24008w;
                Paint paint2 = this.v;
                if (z4 && SharedConfig.shadowsInSections) {
                    paint2.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.j6.l1(clamp01, 167772160));
                    paint.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.j6.l1(clamp01, 201326592));
                    paint.setColor(0);
                } else {
                    paint2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * clamp01));
                if (this.E && SharedConfig.shadowsInSections) {
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                }
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                paint2.setAlpha(alpha);
                Path path = this.f24009x;
                path.rewind();
                path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (this.F != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                    canvas.save();
                    canvas.translate(0.0f, this.H);
                    float f10 = this.G;
                    canvas.scale(f10, f10);
                    canvas.drawRenderNode(this.F);
                    canvas.restore();
                }
                canvas.translate((getWidth() - l10) / 2.0f, 0.0f);
                float height = getHeight() / 2.0f;
                AndroidUtilities.dp(6.0f);
                AndroidUtilities.dp(2.0f);
                int dp3 = AndroidUtilities.dp(13.0f);
                int i10 = (int) height;
                int i11 = dp3 / 2;
                int i12 = i10 - i11;
                int i13 = i10 + i11;
                Drawable drawable = this.f24006r;
                drawable.setBounds(0, i12, dp3, i13);
                drawable.draw(canvas);
                canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
                this.d.c(0.0f, height, clamp01, this.B, canvas);
                canvas.translate(this.d.l(), 0.0f);
                this.e.c(0.0f, height, clamp01 * 0.85f, this.B, canvas);
                canvas.translate(this.e.l(), 0.0f);
                float dpf2 = AndroidUtilities.dpf2(1.16f);
                Paint paint3 = this.h;
                paint3.setStrokeWidth(dpf2);
                canvas.translate(AndroidUtilities.dpf2(4.8f), height);
                canvas.drawPath(this.f24005n, paint3);
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f24001a;
        if (peerColor == null) {
            bgColor1 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20176s8, f6Var);
            bgColor2 = bgColor1;
        } else {
            bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.j6.I.q());
            bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.j6.I.q());
        }
        if (peerColor == null) {
            this.D = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, f6Var);
            this.E = true;
        } else {
            this.D = org.telegram.ui.ActionBar.j6.b(0.04f, -0.09f, i0.a.d(0.15f, bgColor1, bgColor2));
            this.E = false;
        }
        this.v.setColor(this.D);
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
                str2 = org.telegram.messenger.y3.h(R.string.AudioUnknownTitle, new StringBuilder(" - "));
            }
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "";
        } else {
            str2 = " - " + ((Object) str2);
        }
        c(str, str2);
    }

    public void setParentExpanded(float f10) {
        if (this.C != f10) {
            this.C = f10;
            a();
            invalidate();
        }
    }
}

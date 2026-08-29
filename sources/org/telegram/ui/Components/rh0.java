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
public final class rh0 extends View {
    public int A;
    public float B;
    public int C;
    public boolean D;
    public RenderNode E;
    public float F;
    public float G;
    public float H;
    public final org.telegram.ui.ActionBar.c6 f32302a;
    public final PorterDuffColorFilter f32303b;
    public final PorterDuffColorFilter f32304c;
    public zz0 d;
    public zz0 f32305e;
    public final Paint f32306f;
    public final Paint h;
    public final Path f32307n;
    public final Drawable f32308r;
    public final RectF f32309s;
    public final Paint v;
    public final Paint f32310w;
    public final Path f32311x;
    public final uc f32312y;

    public rh0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f32303b = new PorterDuffColorFilter(-1, mode);
        this.f32304c = new PorterDuffColorFilter(-16777216, mode);
        this.f32306f = new Paint();
        Paint paint = new Paint();
        this.h = paint;
        Path path = new Path();
        this.f32307n = path;
        this.f32309s = new RectF();
        this.v = new Paint(1);
        this.f32310w = new Paint(1);
        this.f32311x = new Path();
        this.f32312y = new uc(this);
        this.A = -1;
        this.f32302a = c6Var;
        this.f32308r = context.getResources().getDrawable(R.drawable.files_music).mutate();
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
        if (this.B < 0.8f && AndroidUtilities.computePerceivedBrightness(this.C) > 0.85f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = -16777216;
        } else {
            i10 = -1;
        }
        this.A = i10;
        if (z10) {
            porterDuffColorFilter = this.f32304c;
        } else {
            porterDuffColorFilter = this.f32303b;
        }
        this.f32308r.setColorFilter(porterDuffColorFilter);
        this.f32306f.setColor(this.A);
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
        this.d = new zz0(str, 11.0f, AndroidUtilities.bold());
        this.f32305e = new zz0(str2, 11.0f, null);
        setContentDescription(LocaleController.getString(R.string.AccDescrProfileMusic) + " " + ((Object) str) + " — " + ((Object) str2));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (Utilities.clamp01(this.H / AndroidUtilities.dp(21.0f)) <= 0.0f) {
            return false;
        }
        int action = motionEvent.getAction();
        RectF rectF = this.f32309s;
        uc ucVar = this.f32312y;
        if (action == 0) {
            ucVar.c(rectF.contains(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getAction() == 2 && ucVar.h) {
            if (!rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                ucVar.c(false);
            }
        } else if (motionEvent.getAction() == 3) {
            ucVar.c(false);
        } else if (motionEvent.getAction() == 1) {
            if (ucVar.h) {
                performClick();
            }
            ucVar.c(false);
        }
        return ucVar.h;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.d != null && this.f32305e != null) {
            float clamp01 = Utilities.clamp01(this.H / AndroidUtilities.dp(21.0f));
            float a2 = this.f32312y.a(0.02f);
            if (clamp01 > 0.0f) {
                int width = getWidth() - (AndroidUtilities.dp(12.0f) * 2);
                this.d.f35473p = (width - AndroidUtilities.dp(35.0f)) / 2.0f;
                this.f32305e.f35473p = (width - this.d.l()) - AndroidUtilities.dp(35.0f);
                float l10 = this.f32305e.l() + this.d.l() + AndroidUtilities.dp(16.6f) + AndroidUtilities.dp(8.0f);
                float dp = AndroidUtilities.dp(16.0f) + l10;
                canvas.save();
                canvas.scale(a2, a2, getWidth() / 2.0f, getHeight() / 2.0f);
                float dp2 = (AndroidUtilities.dp(17.0f) * clamp01) + AndroidUtilities.dp(10.0f);
                RectF rectF = this.f32309s;
                rectF.set((getWidth() - dp) / 2.0f, AndroidUtilities.dp(10.0f), (getWidth() + dp) / 2.0f, dp2);
                boolean z10 = this.D;
                Paint paint = this.f32310w;
                Paint paint2 = this.v;
                if (z10 && SharedConfig.shadowsInSections) {
                    paint2.setShadowLayer(AndroidUtilities.dpf2(2.0f), 0.0f, AndroidUtilities.dpf2(0.33f), org.telegram.ui.ActionBar.g6.l1(clamp01, 167772160));
                    paint.setShadowLayer(AndroidUtilities.dpf2(0.33f), 0.0f, 0.0f, org.telegram.ui.ActionBar.g6.l1(clamp01, 201326592));
                    paint.setColor(0);
                } else {
                    paint2.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                }
                int alpha = paint2.getAlpha();
                paint2.setAlpha((int) (alpha * clamp01));
                if (this.D && SharedConfig.shadowsInSections) {
                    canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
                }
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint2);
                paint2.setAlpha(alpha);
                Path path = this.f32311x;
                path.rewind();
                path.addRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
                if (this.E != null && Build.VERSION.SDK_INT >= 29 && canvas.isHardwareAccelerated()) {
                    canvas.save();
                    canvas.translate(0.0f, this.G);
                    float f9 = this.F;
                    canvas.scale(f9, f9);
                    canvas.drawRenderNode(this.E);
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
                Drawable drawable = this.f32308r;
                drawable.setBounds(0, i12, dp3, i13);
                drawable.draw(canvas);
                canvas.translate(AndroidUtilities.dp(16.6f), 0.0f);
                this.d.c(0.0f, height, clamp01, this.A, canvas);
                canvas.translate(this.d.l(), 0.0f);
                this.f32305e.c(0.0f, height, clamp01 * 0.85f, this.A, canvas);
                canvas.translate(this.f32305e.l(), 0.0f);
                float dpf2 = AndroidUtilities.dpf2(1.16f);
                Paint paint3 = this.h;
                paint3.setStrokeWidth(dpf2);
                canvas.translate(AndroidUtilities.dpf2(4.8f), height);
                canvas.drawPath(this.f32307n, paint3);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f32302a;
        if (peerColor == null) {
            bgColor1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23329s8, c6Var);
            bgColor2 = bgColor1;
        } else {
            bgColor1 = peerColor.getBgColor1(org.telegram.ui.ActionBar.g6.I.q());
            bgColor2 = peerColor.getBgColor2(org.telegram.ui.ActionBar.g6.I.q());
        }
        if (peerColor == null) {
            this.C = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, c6Var);
            this.D = true;
        } else {
            this.C = org.telegram.ui.ActionBar.g6.b(0.04f, -0.09f, i0.a.d(0.15f, bgColor1, bgColor2));
            this.D = false;
        }
        this.v.setColor(this.C);
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
                str2 = org.telegram.messenger.x3.i(R.string.AudioUnknownTitle, new StringBuilder(" - "));
            }
        } else if (TextUtils.isEmpty(str2)) {
            str2 = "";
        } else {
            str2 = " - " + ((Object) str2);
        }
        c(str, str2);
    }

    public void setParentExpanded(float f9) {
        if (this.B != f9) {
            this.B = f9;
            a();
            invalidate();
        }
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.TelegramQRCodeWriter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class h21 extends View {
    public static final float Q = AndroidUtilities.dp(2.0f);
    public static final float R = AndroidUtilities.dp(20.0f);
    public final Paint B;
    public org.telegram.ui.Components.gj0 C;
    public String D;
    public boolean E;
    public String F;
    public int G;
    public boolean H;
    public final float[] I;
    public boolean J;
    public final e21 K;
    public Integer L;
    public Integer M;
    public String N;
    public String O;
    public boolean P;
    public final org.telegram.ui.Components.dc0 f34734a;
    public final Paint f34735b;
    public final BitmapShader f34736c;
    public final BitmapShader d;
    public x11 e;
    public Bitmap f34737f;
    public Bitmap h;
    public Bitmap f34738n;
    public boolean f34739r;
    public final org.telegram.ui.Components.no0 f34740s;
    public TextPaint v;
    public StaticLayout f34741w;
    public final org.telegram.ui.Components.z5 f34742x;
    public final Paint f34743y;

    public h21(Context context) {
        super(context);
        org.telegram.ui.Components.dc0 dc0Var = new org.telegram.ui.Components.dc0();
        this.f34734a = dc0Var;
        Paint paint = new Paint(1);
        this.f34735b = paint;
        org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.nr.h;
        this.f34742x = new org.telegram.ui.Components.z5(1.0f, this, 0L, 2000L, nrVar);
        Paint paint2 = new Paint(1);
        this.f34743y = paint2;
        Paint paint3 = new Paint(1);
        this.B = paint3;
        this.I = new float[8];
        this.K = new e21(this, 0);
        this.P = true;
        dc0Var.N = true;
        dc0Var.r(this);
        Bitmap bitmap = dc0Var.f24241k;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f34736c = bitmapShader;
        BitmapShader bitmapShader2 = new BitmapShader(dc0Var.f24241k, tileMode, tileMode);
        this.d = bitmapShader2;
        paint.setShader(bitmapShader);
        org.telegram.ui.Components.no0 no0Var = new org.telegram.ui.Components.no0(this);
        this.f34740s = no0Var;
        no0Var.k(0.35f, 300L, nrVar);
        no0Var.setCallback(this);
        no0Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        no0Var.f25883a.setShader(bitmapShader2);
        no0Var.f25884b = 17;
        no0Var.t(AndroidUtilities.dp(35.0f));
        no0Var.q("", true, true);
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(Canvas canvas) {
        int i10;
        float f10;
        x11 x11Var;
        if (this.C != null) {
            int x10 = b.x(60.0f, getWidth(), 33);
            int i11 = (x10 * 33) + 32;
            int width = (getWidth() - i11) / 2;
            int height = (int) (getHeight() * 0.15f);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                height = (int) (getHeight() * 0.09f);
            }
            int i12 = height;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.saveLayerAlpha(rectF, 255, 31);
            int i13 = width + 16;
            int i14 = i12 + 16;
            Paint paint = this.f34735b;
            canvas.drawRect(i13, i14, (getWidth() - width) - 16, (((getWidth() + i12) - width) - width) - 16, paint);
            canvas.save();
            this.C.setBounds(i13, i14, (getWidth() - width) - 16, (((getWidth() + i12) - width) - width) - 16);
            this.C.draw(canvas);
            canvas.restore();
            canvas.restore();
            float width2 = getWidth() / 2.0f;
            float f11 = i12;
            float f12 = width;
            float width3 = ((getWidth() / 2.0f) + f11) - f12;
            float round = ((Math.round((i10 / 4.65f) / f10) * x10) / 2) * 0.75f;
            canvas.drawCircle(width2, width3, round, paint);
            TelegramQRCodeWriter.drawSideQuads(canvas, f12, f11, paint, 7.0f, x10, 16, i11, 0.75f, this.I, true);
            if (!this.J && (x11Var = this.e) != null) {
                m21 m21Var = x11Var.f39831a;
                m21Var.f36171c.set((int) (width2 - round), (int) (width3 - round), (int) (width2 + round), (int) (width3 + round));
                m21Var.B.requestLayout();
                this.J = true;
            }
        }
    }

    public final void b(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h21.b(int, int):void");
    }

    public final void c(String str, String str2, boolean z4, boolean z10) {
        this.H = true;
        this.D = str2;
        this.E = z4;
        if (z10) {
            TLRPC.TL_exportedContactToken cachedContactToken = MessagesController.getInstance(UserConfig.selectedAccount).getCachedContactToken();
            if (cachedContactToken != null) {
                this.F = cachedContactToken.url;
                this.G = cachedContactToken.expires;
            } else {
                this.F = null;
            }
        } else {
            this.F = str;
        }
        this.f34739r = z10;
        Utilities.themeQueue.postRunnable(new f21(this, getWidth(), getHeight(), 0));
        invalidate();
        this.K.run();
    }

    public final void d(boolean z4) {
        if (!this.f34739r) {
            return;
        }
        if (z4) {
            if (this.v == null) {
                this.v = new TextPaint(1);
            }
            this.v.setShader(this.d);
            this.v.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            this.v.setTextSize(AndroidUtilities.dp(25.0f));
            String str = this.D;
            if (str == null) {
                str = "";
            }
            this.f34741w = org.telegram.ui.Components.kw0.c(Emoji.replaceEmoji(str, this.v.getFontMetricsInt(), false), this.v, getWidth(), Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1, true);
            return;
        }
        this.f34741w = null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K.run();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.gj0 gj0Var = this.C;
        if (gj0Var != null) {
            gj0Var.stop();
            this.C.A(false);
            this.C = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h21.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        Bitmap bitmap = this.f34737f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f34737f = null;
        }
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f10 = Q;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, f10, 251658240);
        this.f34737f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f34737f);
        float f11 = i10;
        RectF rectF = new RectF(f10, f10, f11 - f10, getHeight() - f10);
        float f12 = R;
        canvas.drawRoundRect(rectF, f12, f12, paint);
        if (this.H) {
            Utilities.themeQueue.postRunnable(new f21(this, i10, i11, 1));
        }
        float max = Math.max((getWidth() * 1.0f) / this.f34734a.f24241k.getWidth(), (getHeight() * 1.0f) / this.f34734a.f24241k.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        this.f34736c.setLocalMatrix(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(max, max);
        matrix2.postTranslate(f11 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
        this.d.setLocalMatrix(matrix2);
    }
}

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
public final class a31 extends View {
    public static final float T = AndroidUtilities.dp(2.0f);
    public static final float U = AndroidUtilities.dp(20.0f);
    public final Paint E;
    public org.telegram.ui.Components.xi0 F;
    public String G;
    public boolean H;
    public String I;
    public int J;
    public boolean K;
    public final float[] L;
    public boolean M;
    public final x21 N;
    public Integer O;
    public Integer P;
    public String Q;
    public String R;
    public boolean S;
    public final org.telegram.ui.Components.dc0 f34314a;
    public final Paint f34315b;
    public final BitmapShader f34316c;
    public final BitmapShader d;
    public r21 f34317e;
    public Bitmap f34318f;
    public Bitmap h;
    public Bitmap f34319n;
    public boolean f34320r;
    public final org.telegram.ui.Components.jo0 f34321s;
    public TextPaint v;
    public StaticLayout f34322w;
    public final org.telegram.ui.Components.e6 f34323x;
    public final Paint f34324y;

    public a31(Context context) {
        super(context);
        org.telegram.ui.Components.dc0 dc0Var = new org.telegram.ui.Components.dc0();
        this.f34314a = dc0Var;
        Paint paint = new Paint(1);
        this.f34315b = paint;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.f34323x = new org.telegram.ui.Components.e6(1.0f, this, 0L, 2000L, prVar);
        Paint paint2 = new Paint(1);
        this.f34324y = paint2;
        Paint paint3 = new Paint(1);
        this.E = paint3;
        this.L = new float[8];
        this.N = new x21(this, 0);
        this.S = true;
        dc0Var.N = true;
        dc0Var.r(this);
        Bitmap bitmap = dc0Var.f25353k;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f34316c = bitmapShader;
        BitmapShader bitmapShader2 = new BitmapShader(dc0Var.f25353k, tileMode, tileMode);
        this.d = bitmapShader2;
        paint.setShader(bitmapShader);
        org.telegram.ui.Components.jo0 jo0Var = new org.telegram.ui.Components.jo0(this);
        this.f34321s = jo0Var;
        jo0Var.k(0.35f, 300L, prVar);
        jo0Var.setCallback(this);
        jo0Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        jo0Var.f29284a.setShader(bitmapShader2);
        jo0Var.f29285b = 17;
        jo0Var.t(AndroidUtilities.dp(35.0f));
        jo0Var.q("", true, true);
        Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
        paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{-1, 0}, new float[]{0.0f, 1.0f}, tileMode2));
        PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
        paint2.setXfermode(new PorterDuffXfermode(mode));
        paint3.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(120.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode2));
        paint3.setXfermode(new PorterDuffXfermode(mode));
    }

    public final void a(Canvas canvas) {
        int i10;
        float f7;
        r21 r21Var;
        if (this.F != null) {
            int y3 = org.telegram.messenger.wl.y(60.0f, getWidth(), 33);
            int i11 = (y3 * 33) + 32;
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
            Paint paint = this.f34315b;
            canvas.drawRect(i13, i14, (getWidth() - width) - 16, (((getWidth() + i12) - width) - width) - 16, paint);
            canvas.save();
            this.F.setBounds(i13, i14, (getWidth() - width) - 16, (((getWidth() + i12) - width) - width) - 16);
            this.F.draw(canvas);
            canvas.restore();
            canvas.restore();
            float width2 = getWidth() / 2.0f;
            float f10 = i12;
            float f11 = width;
            float width3 = ((getWidth() / 2.0f) + f10) - f11;
            float round = ((Math.round((i10 / 4.65f) / f7) * y3) / 2) * 0.75f;
            canvas.drawCircle(width2, width3, round, paint);
            TelegramQRCodeWriter.drawSideQuads(canvas, f11, f10, paint, 7.0f, y3, 16, i11, 0.75f, this.L, true);
            if (!this.M && (r21Var = this.f34317e) != null) {
                g31 g31Var = r21Var.f40050a;
                g31Var.f36540c.set((int) (width2 - round), (int) (width3 - round), (int) (width2 + round), (int) (width3 + round));
                g31Var.E.requestLayout();
                this.M = true;
            }
        }
    }

    public final void b(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a31.b(int, int):void");
    }

    public final void c(String str, String str2, boolean z10, boolean z11) {
        this.K = true;
        this.G = str2;
        this.H = z10;
        if (z11) {
            TLRPC.TL_exportedContactToken cachedContactToken = MessagesController.getInstance(UserConfig.selectedAccount).getCachedContactToken();
            if (cachedContactToken != null) {
                this.I = cachedContactToken.url;
                this.J = cachedContactToken.expires;
            } else {
                this.I = null;
            }
        } else {
            this.I = str;
        }
        this.f34320r = z11;
        Utilities.themeQueue.postRunnable(new y21(this, getWidth(), getHeight(), 0));
        invalidate();
        this.N.run();
    }

    public final void d(boolean z10) {
        if (!this.f34320r) {
            return;
        }
        if (z10) {
            if (this.v == null) {
                this.v = new TextPaint(1);
            }
            this.v.setShader(this.d);
            this.v.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            this.v.setTextSize(AndroidUtilities.dp(25.0f));
            String str = this.G;
            if (str == null) {
                str = "";
            }
            this.f34322w = org.telegram.ui.Components.iw0.c(Emoji.replaceEmoji(str, this.v.getFontMetricsInt(), false), this.v, getWidth(), Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1, true);
            return;
        }
        this.f34322w = null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N.run();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.xi0 xi0Var = this.F;
        if (xi0Var != null) {
            xi0Var.stop();
            this.F.A(false);
            this.F = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a31.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        Bitmap bitmap = this.f34318f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f34318f = null;
        }
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f7 = T;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, f7, 251658240);
        this.f34318f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f34318f);
        float f10 = i10;
        RectF rectF = new RectF(f7, f7, f10 - f7, getHeight() - f7);
        float f11 = U;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (this.K) {
            Utilities.themeQueue.postRunnable(new y21(this, i10, i11, 1));
        }
        float max = Math.max((getWidth() * 1.0f) / this.f34314a.f25353k.getWidth(), (getHeight() * 1.0f) / this.f34314a.f25353k.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        this.f34316c.setLocalMatrix(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(max, max);
        matrix2.postTranslate(f10 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
        this.d.setLocalMatrix(matrix2);
    }
}

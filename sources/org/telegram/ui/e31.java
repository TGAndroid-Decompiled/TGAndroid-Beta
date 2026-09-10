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
public final class e31 extends View {
    public static final float T = AndroidUtilities.dp(2.0f);
    public static final float U = AndroidUtilities.dp(20.0f);
    public final Paint E;
    public org.telegram.ui.Components.hj0 F;
    public String G;
    public boolean H;
    public String I;
    public int J;
    public boolean K;
    public final float[] L;
    public boolean M;
    public final b31 N;
    public Integer O;
    public Integer P;
    public String Q;
    public String R;
    public boolean S;
    public final org.telegram.ui.Components.lc0 f32047a;
    public final Paint f32048b;
    public final BitmapShader f32049c;
    public final BitmapShader d;
    public v21 e;
    public Bitmap f32050f;
    public Bitmap h;
    public Bitmap f32051n;
    public boolean f32052r;
    public final org.telegram.ui.Components.so0 f32053s;
    public TextPaint v;
    public StaticLayout f32054w;
    public final org.telegram.ui.Components.d6 f32055x;
    public final Paint f32056y;

    public e31(Context context) {
        super(context);
        org.telegram.ui.Components.lc0 lc0Var = new org.telegram.ui.Components.lc0();
        this.f32047a = lc0Var;
        Paint paint = new Paint(1);
        this.f32048b = paint;
        org.telegram.ui.Components.wr wrVar = org.telegram.ui.Components.wr.h;
        this.f32055x = new org.telegram.ui.Components.d6(1.0f, this, 0L, 2000L, wrVar);
        Paint paint2 = new Paint(1);
        this.f32056y = paint2;
        Paint paint3 = new Paint(1);
        this.E = paint3;
        this.L = new float[8];
        this.N = new b31(this, 0);
        this.S = true;
        lc0Var.N = true;
        lc0Var.r(this);
        Bitmap bitmap = lc0Var.f24949k;
        Shader.TileMode tileMode = Shader.TileMode.MIRROR;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.f32049c = bitmapShader;
        BitmapShader bitmapShader2 = new BitmapShader(lc0Var.f24949k, tileMode, tileMode);
        this.d = bitmapShader2;
        paint.setShader(bitmapShader);
        org.telegram.ui.Components.so0 so0Var = new org.telegram.ui.Components.so0(this);
        this.f32053s = so0Var;
        so0Var.k(0.35f, 300L, wrVar);
        so0Var.setCallback(this);
        so0Var.u(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        so0Var.f25424a.setShader(bitmapShader2);
        so0Var.f25425b = 17;
        so0Var.t(AndroidUtilities.dp(35.0f));
        so0Var.q("", true, true);
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
        v21 v21Var;
        if (this.F != null) {
            int y3 = org.telegram.messenger.em.y(60.0f, getWidth(), 33);
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
            Paint paint = this.f32048b;
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
            if (!this.M && (v21Var = this.e) != null) {
                k31 k31Var = v21Var.f37399a;
                k31Var.f34211c.set((int) (width2 - round), (int) (width3 - round), (int) (width2 + round), (int) (width3 + round));
                k31Var.E.requestLayout();
                this.M = true;
            }
        }
    }

    public final void b(int r25, int r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e31.b(int, int):void");
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
        this.f32052r = z11;
        Utilities.themeQueue.postRunnable(new c31(this, getWidth(), getHeight(), 0));
        invalidate();
        this.N.run();
    }

    public final void d(boolean z10) {
        if (!this.f32052r) {
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
            this.f32054w = org.telegram.ui.Components.uw0.c(Emoji.replaceEmoji(str, this.v.getFontMetricsInt(), false), this.v, getWidth(), Layout.Alignment.ALIGN_CENTER, 0.0f, false, TextUtils.TruncateAt.END, getWidth() - AndroidUtilities.dp(60.0f), 1, true);
            return;
        }
        this.f32054w = null;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N.run();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.hj0 hj0Var = this.F;
        if (hj0Var != null) {
            hj0Var.stop();
            this.F.C(false);
            this.F = null;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e31.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        Bitmap bitmap = this.f32050f;
        if (bitmap != null) {
            bitmap.recycle();
            this.f32050f = null;
        }
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f7 = T;
        paint.setShadowLayer(AndroidUtilities.dp(4.0f), 0.0f, f7, 251658240);
        this.f32050f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.f32050f);
        float f10 = i10;
        RectF rectF = new RectF(f7, f7, f10 - f7, getHeight() - f7);
        float f11 = U;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        if (this.K) {
            Utilities.themeQueue.postRunnable(new c31(this, i10, i11, 1));
        }
        float max = Math.max((getWidth() * 1.0f) / this.f32047a.f24949k.getWidth(), (getHeight() * 1.0f) / this.f32047a.f24949k.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(max, max);
        this.f32049c.setLocalMatrix(matrix);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(max, max);
        matrix2.postTranslate(f10 / 2.0f, AndroidUtilities.dp(6.0f) + getWidth());
        this.d.setLocalMatrix(matrix2);
    }
}

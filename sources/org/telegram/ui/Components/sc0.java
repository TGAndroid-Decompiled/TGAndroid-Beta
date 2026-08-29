package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class sc0 extends ik0 implements DownloadController.FileDownloadProgressListener {
    public static final Paint D;
    public static final Paint E;
    public static final TextPaint F;
    public static final TextPaint G;
    public static final TextPaint H;
    public static final TextPaint I;
    public static final TextPaint J;
    public static final TextPaint K;
    public static final DecelerateInterpolator L;
    public String A;
    public String B;
    public String C;
    public long f32613a;
    public float f32614b;
    public float f32615c;
    public long d;
    public float f32616e;
    public float f32617f;
    public boolean h;
    public View f32618n;
    public MessageObject f32619r;
    public int f32620s;
    public boolean v;
    public boolean f32621w;
    public Drawable f32622x;
    public String f32623y;

    static {
        Paint paint = new Paint();
        D = paint;
        Paint paint2 = new Paint(1);
        E = paint2;
        TextPaint textPaint = new TextPaint(1);
        F = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        G = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        H = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        I = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        J = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        K = textPaint6;
        L = new DecelerateInterpolator();
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-14209998);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        textPaint3.setColor(-10327179);
        textPaint4.setColor(-10327179);
        textPaint5.setColor(-1);
        textPaint6.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint4.setTypeface(AndroidUtilities.bold());
        textPaint5.setTypeface(AndroidUtilities.bold());
        textPaint6.setTypeface(AndroidUtilities.bold());
    }

    public final void a() {
        String attachFileName;
        MessageObject messageObject = this.f32619r;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.media != null) {
                if ((TextUtils.isEmpty(message.attachPath) || !new File(this.f32619r.messageOwner.attachPath).exists()) && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.f32619r.messageOwner).exists()) {
                    attachFileName = FileLoader.getAttachFileName(this.f32619r.getDocument());
                } else {
                    attachFileName = null;
                }
                this.f32621w = false;
                if (attachFileName == null) {
                    this.h = false;
                    this.v = false;
                    this.f32621w = true;
                    DownloadController.getInstance(this.f32619r.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.f32619r.currentAccount).addLoadingFileObserver(attachFileName, this);
                    boolean isLoadingFile = FileLoader.getInstance(this.f32619r.currentAccount).isLoadingFile(attachFileName);
                    this.v = isLoadingFile;
                    if (isLoadingFile) {
                        this.h = true;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        if (fileProgress == null) {
                            fileProgress = Float.valueOf(0.0f);
                        }
                        b(fileProgress.floatValue(), false);
                    } else {
                        this.h = false;
                    }
                }
                this.f32618n.invalidate();
            }
        }
        this.v = false;
        this.f32621w = true;
        this.h = false;
        b(0.0f, false);
        DownloadController.getInstance(this.f32619r.currentAccount).removeLoadingFileObserver(this);
        this.f32618n.invalidate();
    }

    public final void b(float f9, boolean z10) {
        if (!z10) {
            this.f32616e = f9;
            this.f32615c = f9;
        } else {
            this.f32615c = this.f32616e;
        }
        this.C = String.format("%d%%", Integer.valueOf((int) (100.0f * f9)));
        if (f9 != 1.0f) {
            this.f32617f = 1.0f;
        }
        this.f32614b = f9;
        this.d = 0L;
        this.f32613a = System.currentTimeMillis();
        this.f32618n.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        String str;
        TextPaint textPaint;
        String str2;
        TextPaint textPaint2;
        String str3;
        TextPaint textPaint3;
        String string;
        int dp;
        TextPaint textPaint4;
        String str4;
        TextPaint textPaint5;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawRect(0.0f, 0.0f, width, height, D);
        int x4 = org.telegram.ui.b.x(240.0f, height, 2);
        int x10 = org.telegram.ui.b.x(48.0f, width, 2);
        Drawable drawable = this.f32622x;
        drawable.setBounds(x10, x4, AndroidUtilities.dp(48.0f) + x10, AndroidUtilities.dp(48.0f) + x4);
        drawable.draw(canvas);
        canvas.drawText(this.f32623y, (width - ((int) Math.ceil(textPaint.measureText(str)))) / 2, AndroidUtilities.dp(31.0f) + x4, F);
        canvas.drawText(this.A, (width - ((int) Math.ceil(textPaint2.measureText(str2)))) / 2, AndroidUtilities.dp(96.0f) + x4, G);
        canvas.drawText(this.B, (width - ((int) Math.ceil(textPaint3.measureText(str3)))) / 2, AndroidUtilities.dp(125.0f) + x4, H);
        if (this.f32621w) {
            string = LocaleController.getString(R.string.OpenFile);
            textPaint4 = K;
            dp = 0;
        } else {
            if (this.v) {
                string = LocaleController.getString(R.string.Cancel).toUpperCase();
            } else {
                string = LocaleController.getString(R.string.TapToDownload);
            }
            dp = AndroidUtilities.dp(28.0f);
            textPaint4 = I;
        }
        canvas.drawText(string, (width - ((int) Math.ceil(textPaint4.measureText(string)))) / 2, org.telegram.messenger.x3.C(235.0f, x4, dp), textPaint4);
        if (this.h) {
            if (this.C != null) {
                canvas.drawText(this.C, (width - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, AndroidUtilities.dp(210.0f) + x4, J);
            }
            int x11 = org.telegram.ui.b.x(240.0f, width, 2);
            int dp2 = AndroidUtilities.dp(232.0f) + x4;
            Paint paint = E;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f32617f * 255.0f));
            float f9 = dp2;
            canvas.drawRect(((int) (AndroidUtilities.dp(240.0f) * this.f32616e)) + x11, f9, AndroidUtilities.dp(240.0f) + x11, AndroidUtilities.dp(2.0f) + dp2, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f32617f * 255.0f));
            float f10 = x11;
            canvas.drawRect(f10, f9, (AndroidUtilities.dp(240.0f) * this.f32616e) + f10, AndroidUtilities.dp(2.0f) + dp2, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f32613a;
            this.f32613a = currentTimeMillis;
            float f11 = this.f32616e;
            if (f11 != 1.0f) {
                float f12 = this.f32614b;
                if (f11 != f12) {
                    float f13 = this.f32615c;
                    float f14 = f12 - f13;
                    if (f14 > 0.0f) {
                        long j11 = this.d + j10;
                        this.d = j11;
                        if (j11 >= 300) {
                            this.f32616e = f12;
                            this.f32615c = f12;
                            this.d = 0L;
                        } else {
                            this.f32616e = (L.getInterpolation(((float) j11) / 300.0f) * f14) + f13;
                        }
                    }
                    this.f32618n.invalidate();
                }
            }
            int i10 = (this.f32616e > 1.0f ? 1 : (this.f32616e == 1.0f ? 0 : -1));
            if (i10 >= 0 && i10 == 0) {
                float f15 = this.f32617f;
                if (f15 != 0.0f) {
                    float f16 = f15 - (((float) j10) / 200.0f);
                    this.f32617f = f16;
                    if (f16 <= 0.0f) {
                        this.f32617f = 0.0f;
                    }
                    this.f32618n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f32618n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f32618n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f32618n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f32618n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.f32620s;
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void onFailedDownload(String str, boolean z10) {
        a();
    }

    @Override
    public final void onProgressDownload(String str, long j10, long j11) {
        if (!this.h) {
            a();
        }
        b(Math.min(1.0f, ((float) j10) / ((float) j11)), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        b(1.0f, true);
        a();
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f32622x;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        D.setAlpha(i10);
        F.setAlpha(i10);
        G.setAlpha(i10);
        H.setAlpha(i10);
        I.setAlpha(i10);
        J.setAlpha(i10);
        K.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}

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
public final class yc0 extends tk0 implements DownloadController.FileDownloadProgressListener {
    public static final Paint E;
    public static final Paint F;
    public static final TextPaint G;
    public static final TextPaint H;
    public static final TextPaint I;
    public static final TextPaint J;
    public static final TextPaint K;
    public static final TextPaint L;
    public static final DecelerateInterpolator M;
    public String B;
    public String C;
    public String D;
    public long f30984a;
    public float f30985b;
    public float f30986c;
    public long d;
    public float e;
    public float f30987f;
    public boolean h;
    public View f30988n;
    public MessageObject f30989r;
    public int f30990s;
    public boolean v;
    public boolean f30991w;
    public Drawable f30992x;
    public String f30993y;

    static {
        Paint paint = new Paint();
        E = paint;
        Paint paint2 = new Paint(1);
        F = paint2;
        TextPaint textPaint = new TextPaint(1);
        G = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        H = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        I = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        J = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        K = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        L = textPaint6;
        M = new DecelerateInterpolator();
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
        MessageObject messageObject = this.f30989r;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.media != null) {
                if ((TextUtils.isEmpty(message.attachPath) || !new File(this.f30989r.messageOwner.attachPath).exists()) && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.f30989r.messageOwner).exists()) {
                    attachFileName = FileLoader.getAttachFileName(this.f30989r.getDocument());
                } else {
                    attachFileName = null;
                }
                this.f30991w = false;
                if (attachFileName == null) {
                    this.h = false;
                    this.v = false;
                    this.f30991w = true;
                    DownloadController.getInstance(this.f30989r.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.f30989r.currentAccount).addLoadingFileObserver(attachFileName, this);
                    boolean isLoadingFile = FileLoader.getInstance(this.f30989r.currentAccount).isLoadingFile(attachFileName);
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
                this.f30988n.invalidate();
            }
        }
        this.v = false;
        this.f30991w = true;
        this.h = false;
        b(0.0f, false);
        DownloadController.getInstance(this.f30989r.currentAccount).removeLoadingFileObserver(this);
        this.f30988n.invalidate();
    }

    public final void b(float f10, boolean z4) {
        if (!z4) {
            this.e = f10;
            this.f30986c = f10;
        } else {
            this.f30986c = this.e;
        }
        this.D = String.format("%d%%", Integer.valueOf((int) (100.0f * f10)));
        if (f10 != 1.0f) {
            this.f30987f = 1.0f;
        }
        this.f30985b = f10;
        this.d = 0L;
        this.f30984a = System.currentTimeMillis();
        this.f30988n.invalidate();
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
        canvas.drawRect(0.0f, 0.0f, width, height, E);
        int x10 = org.telegram.ui.b.x(240.0f, height, 2);
        int x11 = org.telegram.ui.b.x(48.0f, width, 2);
        Drawable drawable = this.f30992x;
        drawable.setBounds(x11, x10, AndroidUtilities.dp(48.0f) + x11, AndroidUtilities.dp(48.0f) + x10);
        drawable.draw(canvas);
        canvas.drawText(this.f30993y, (width - ((int) Math.ceil(textPaint.measureText(str)))) / 2, AndroidUtilities.dp(31.0f) + x10, G);
        canvas.drawText(this.B, (width - ((int) Math.ceil(textPaint2.measureText(str2)))) / 2, AndroidUtilities.dp(96.0f) + x10, H);
        canvas.drawText(this.C, (width - ((int) Math.ceil(textPaint3.measureText(str3)))) / 2, AndroidUtilities.dp(125.0f) + x10, I);
        if (this.f30991w) {
            string = LocaleController.getString(R.string.OpenFile);
            textPaint4 = L;
            dp = 0;
        } else {
            if (this.v) {
                string = LocaleController.getString(R.string.Cancel).toUpperCase();
            } else {
                string = LocaleController.getString(R.string.TapToDownload);
            }
            dp = AndroidUtilities.dp(28.0f);
            textPaint4 = J;
        }
        canvas.drawText(string, (width - ((int) Math.ceil(textPaint4.measureText(string)))) / 2, org.telegram.messenger.y3.C(235.0f, x10, dp), textPaint4);
        if (this.h) {
            if (this.D != null) {
                canvas.drawText(this.D, (width - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, AndroidUtilities.dp(210.0f) + x10, K);
            }
            int x12 = org.telegram.ui.b.x(240.0f, width, 2);
            int dp2 = AndroidUtilities.dp(232.0f) + x10;
            Paint paint = F;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f30987f * 255.0f));
            float f10 = dp2;
            canvas.drawRect(((int) (AndroidUtilities.dp(240.0f) * this.e)) + x12, f10, AndroidUtilities.dp(240.0f) + x12, AndroidUtilities.dp(2.0f) + dp2, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f30987f * 255.0f));
            float f11 = x12;
            canvas.drawRect(f11, f10, (AndroidUtilities.dp(240.0f) * this.e) + f11, AndroidUtilities.dp(2.0f) + dp2, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f30984a;
            this.f30984a = currentTimeMillis;
            float f12 = this.e;
            if (f12 != 1.0f) {
                float f13 = this.f30985b;
                if (f12 != f13) {
                    float f14 = this.f30986c;
                    float f15 = f13 - f14;
                    if (f15 > 0.0f) {
                        long j11 = this.d + j10;
                        this.d = j11;
                        if (j11 >= 300) {
                            this.e = f13;
                            this.f30986c = f13;
                            this.d = 0L;
                        } else {
                            this.e = (M.getInterpolation(((float) j11) / 300.0f) * f15) + f14;
                        }
                    }
                    this.f30988n.invalidate();
                }
            }
            int i10 = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
            if (i10 >= 0 && i10 == 0) {
                float f16 = this.f30987f;
                if (f16 != 0.0f) {
                    float f17 = f16 - (((float) j10) / 200.0f);
                    this.f30987f = f17;
                    if (f17 <= 0.0f) {
                        this.f30987f = 0.0f;
                    }
                    this.f30988n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f30988n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f30988n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f30988n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f30988n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.f30990s;
    }

    @Override
    public final int getOpacity() {
        return -1;
    }

    @Override
    public final void onFailedDownload(String str, boolean z4) {
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
        Drawable drawable = this.f30992x;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        E.setAlpha(i10);
        G.setAlpha(i10);
        H.setAlpha(i10);
        I.setAlpha(i10);
        J.setAlpha(i10);
        K.setAlpha(i10);
        L.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}

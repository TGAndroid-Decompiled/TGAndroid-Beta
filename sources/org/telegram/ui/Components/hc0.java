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

public final class hc0 extends zj0 implements DownloadController.FileDownloadProgressListener {
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

    public long f28969a;

    public float f28970b;

    public float f28971c;
    public long d;

    public float f28972e;

    public float f28973f;
    public boolean h;

    public View f28974n;

    public MessageObject f28975r;

    public int f28976s;
    public boolean v;

    public boolean f28977w;

    public Drawable f28978x;

    public String f28979y;

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
        MessageObject messageObject = this.f28975r;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.media != null) {
                String attachFileName = ((TextUtils.isEmpty(message.attachPath) || !new File(this.f28975r.messageOwner.attachPath).exists()) && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.f28975r.messageOwner).exists()) ? FileLoader.getAttachFileName(this.f28975r.getDocument()) : null;
                this.f28977w = false;
                if (attachFileName == null) {
                    this.h = false;
                    this.v = false;
                    this.f28977w = true;
                    DownloadController.getInstance(this.f28975r.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.f28975r.currentAccount).addLoadingFileObserver(attachFileName, this);
                    boolean zIsLoadingFile = FileLoader.getInstance(this.f28975r.currentAccount).isLoadingFile(attachFileName);
                    this.v = zIsLoadingFile;
                    if (zIsLoadingFile) {
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
            } else {
                this.v = false;
                this.f28977w = true;
                this.h = false;
                b(0.0f, false);
                DownloadController.getInstance(this.f28975r.currentAccount).removeLoadingFileObserver(this);
            }
        } else {
            this.v = false;
            this.f28977w = true;
            this.h = false;
            b(0.0f, false);
            DownloadController.getInstance(this.f28975r.currentAccount).removeLoadingFileObserver(this);
        }
        this.f28974n.invalidate();
    }

    public final void b(float f10, boolean z10) {
        if (z10) {
            this.f28971c = this.f28972e;
        } else {
            this.f28972e = f10;
            this.f28971c = f10;
        }
        this.C = String.format("%d%%", Integer.valueOf((int) (100.0f * f10)));
        if (f10 != 1.0f) {
            this.f28973f = 1.0f;
        }
        this.f28970b = f10;
        this.d = 0L;
        this.f28969a = System.currentTimeMillis();
        this.f28974n.invalidate();
    }

    @Override
    public final void draw(Canvas canvas) {
        String upperCase;
        int iDp;
        TextPaint textPaint;
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawRect(0.0f, 0.0f, iWidth, iHeight, D);
        int iX = org.telegram.messenger.rl.x(240.0f, iHeight, 2);
        int iX2 = org.telegram.messenger.rl.x(48.0f, iWidth, 2);
        Drawable drawable = this.f28978x;
        drawable.setBounds(iX2, iX, AndroidUtilities.dp(48.0f) + iX2, AndroidUtilities.dp(48.0f) + iX);
        drawable.draw(canvas);
        String str = this.f28979y;
        TextPaint textPaint2 = F;
        canvas.drawText(str, (iWidth - ((int) Math.ceil(textPaint2.measureText(str)))) / 2, AndroidUtilities.dp(31.0f) + iX, textPaint2);
        String str2 = this.A;
        TextPaint textPaint3 = G;
        canvas.drawText(str2, (iWidth - ((int) Math.ceil(textPaint3.measureText(str2)))) / 2, AndroidUtilities.dp(96.0f) + iX, textPaint3);
        String str3 = this.B;
        TextPaint textPaint4 = H;
        canvas.drawText(str3, (iWidth - ((int) Math.ceil(textPaint4.measureText(str3)))) / 2, AndroidUtilities.dp(125.0f) + iX, textPaint4);
        if (this.f28977w) {
            upperCase = LocaleController.getString(R.string.OpenFile);
            textPaint = K;
            iDp = 0;
        } else {
            upperCase = this.v ? LocaleController.getString(R.string.Cancel).toUpperCase() : LocaleController.getString(R.string.TapToDownload);
            iDp = AndroidUtilities.dp(28.0f);
            textPaint = I;
        }
        canvas.drawText(upperCase, (iWidth - ((int) Math.ceil(textPaint.measureText(upperCase)))) / 2, org.telegram.messenger.y1.C(235.0f, iX, iDp), textPaint);
        if (this.h) {
            String str4 = this.C;
            if (str4 != null) {
                TextPaint textPaint5 = J;
                canvas.drawText(this.C, (iWidth - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, AndroidUtilities.dp(210.0f) + iX, textPaint5);
            }
            int iX3 = org.telegram.messenger.rl.x(240.0f, iWidth, 2);
            int iDp2 = AndroidUtilities.dp(232.0f) + iX;
            Paint paint = E;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f28973f * 255.0f));
            float f10 = iDp2;
            canvas.drawRect(((int) (AndroidUtilities.dp(240.0f) * this.f28972e)) + iX3, f10, AndroidUtilities.dp(240.0f) + iX3, AndroidUtilities.dp(2.0f) + iDp2, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f28973f * 255.0f));
            float f11 = iX3;
            canvas.drawRect(f11, f10, (AndroidUtilities.dp(240.0f) * this.f28972e) + f11, AndroidUtilities.dp(2.0f) + iDp2, paint);
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = jCurrentTimeMillis - this.f28969a;
            this.f28969a = jCurrentTimeMillis;
            float f12 = this.f28972e;
            if (f12 != 1.0f) {
                float f13 = this.f28970b;
                if (f12 != f13) {
                    float f14 = this.f28971c;
                    float f15 = f13 - f14;
                    if (f15 > 0.0f) {
                        long j11 = this.d + j10;
                        this.d = j11;
                        if (j11 >= 300) {
                            this.f28972e = f13;
                            this.f28971c = f13;
                            this.d = 0L;
                        } else {
                            this.f28972e = (L.getInterpolation(j11 / 300.0f) * f15) + f14;
                        }
                    }
                    this.f28974n.invalidate();
                }
            }
            float f16 = this.f28972e;
            if (f16 >= 1.0f && f16 == 1.0f) {
                float f17 = this.f28973f;
                if (f17 != 0.0f) {
                    float f18 = f17 - (j10 / 200.0f);
                    this.f28973f = f18;
                    if (f18 <= 0.0f) {
                        this.f28973f = 0.0f;
                    }
                    this.f28974n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f28974n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f28974n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f28974n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f28974n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.f28976s;
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
        b(Math.min(1.0f, j10 / j11), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        b(1.0f, true);
        a();
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f28978x;
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

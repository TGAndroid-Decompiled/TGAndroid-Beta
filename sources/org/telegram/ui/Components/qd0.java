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
public final class qd0 extends gl0 implements DownloadController.FileDownloadProgressListener {
    public static final Paint H;
    public static final Paint I;
    public static final TextPaint J;
    public static final TextPaint K;
    public static final TextPaint L;
    public static final TextPaint M;
    public static final TextPaint N;
    public static final TextPaint O;
    public static final DecelerateInterpolator P;
    public String E;
    public String F;
    public String G;
    public long f29553a;
    public float f29554b;
    public float f29555c;
    public long d;
    public float e;
    public float f29556f;
    public boolean h;
    public View f29557n;
    public MessageObject f29558r;
    public int f29559s;
    public boolean v;
    public boolean f29560w;
    public Drawable f29561x;
    public String f29562y;

    static {
        Paint paint = new Paint();
        H = paint;
        Paint paint2 = new Paint(1);
        I = paint2;
        TextPaint textPaint = new TextPaint(1);
        J = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        K = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        L = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        M = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        N = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        O = textPaint6;
        P = new DecelerateInterpolator();
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
        MessageObject messageObject = this.f29558r;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.media != null) {
                if ((TextUtils.isEmpty(message.attachPath) || !new File(this.f29558r.messageOwner.attachPath).exists()) && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.f29558r.messageOwner).exists()) {
                    attachFileName = FileLoader.getAttachFileName(this.f29558r.getDocument());
                } else {
                    attachFileName = null;
                }
                this.f29560w = false;
                if (attachFileName == null) {
                    this.h = false;
                    this.v = false;
                    this.f29560w = true;
                    DownloadController.getInstance(this.f29558r.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.f29558r.currentAccount).addLoadingFileObserver(attachFileName, this);
                    boolean isLoadingFile = FileLoader.getInstance(this.f29558r.currentAccount).isLoadingFile(attachFileName);
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
                this.f29557n.invalidate();
            }
        }
        this.v = false;
        this.f29560w = true;
        this.h = false;
        b(0.0f, false);
        DownloadController.getInstance(this.f29558r.currentAccount).removeLoadingFileObserver(this);
        this.f29557n.invalidate();
    }

    public final void b(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f29555c = f7;
        } else {
            this.f29555c = this.e;
        }
        this.G = String.format("%d%%", Integer.valueOf((int) (100.0f * f7)));
        if (f7 != 1.0f) {
            this.f29556f = 1.0f;
        }
        this.f29554b = f7;
        this.d = 0L;
        this.f29553a = System.currentTimeMillis();
        this.f29557n.invalidate();
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
        canvas.drawRect(0.0f, 0.0f, width, height, H);
        int A = org.telegram.messenger.mk.A(240.0f, height, 2);
        int A2 = org.telegram.messenger.mk.A(48.0f, width, 2);
        Drawable drawable = this.f29561x;
        drawable.setBounds(A2, A, AndroidUtilities.dp(48.0f) + A2, AndroidUtilities.dp(48.0f) + A);
        drawable.draw(canvas);
        canvas.drawText(this.f29562y, (width - ((int) Math.ceil(textPaint.measureText(str)))) / 2, AndroidUtilities.dp(31.0f) + A, J);
        canvas.drawText(this.E, (width - ((int) Math.ceil(textPaint2.measureText(str2)))) / 2, AndroidUtilities.dp(96.0f) + A, K);
        canvas.drawText(this.F, (width - ((int) Math.ceil(textPaint3.measureText(str3)))) / 2, AndroidUtilities.dp(125.0f) + A, L);
        if (this.f29560w) {
            string = LocaleController.getString(R.string.OpenFile);
            textPaint4 = O;
            dp = 0;
        } else {
            if (this.v) {
                string = LocaleController.getString(R.string.Cancel).toUpperCase();
            } else {
                string = LocaleController.getString(R.string.TapToDownload);
            }
            dp = AndroidUtilities.dp(28.0f);
            textPaint4 = M;
        }
        canvas.drawText(string, (width - ((int) Math.ceil(textPaint4.measureText(string)))) / 2, org.telegram.messenger.g0.C(235.0f, A, dp), textPaint4);
        if (this.h) {
            if (this.G != null) {
                canvas.drawText(this.G, (width - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, AndroidUtilities.dp(210.0f) + A, N);
            }
            int A3 = org.telegram.messenger.mk.A(240.0f, width, 2);
            int dp2 = AndroidUtilities.dp(232.0f) + A;
            Paint paint = I;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f29556f * 255.0f));
            float f7 = dp2;
            canvas.drawRect(((int) (AndroidUtilities.dp(240.0f) * this.e)) + A3, f7, AndroidUtilities.dp(240.0f) + A3, AndroidUtilities.dp(2.0f) + dp2, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f29556f * 255.0f));
            float f10 = A3;
            canvas.drawRect(f10, f7, (AndroidUtilities.dp(240.0f) * this.e) + f10, AndroidUtilities.dp(2.0f) + dp2, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f29553a;
            this.f29553a = currentTimeMillis;
            float f11 = this.e;
            if (f11 != 1.0f) {
                float f12 = this.f29554b;
                if (f11 != f12) {
                    float f13 = this.f29555c;
                    float f14 = f12 - f13;
                    if (f14 > 0.0f) {
                        long j11 = this.d + j10;
                        this.d = j11;
                        if (j11 >= 300) {
                            this.e = f12;
                            this.f29555c = f12;
                            this.d = 0L;
                        } else {
                            this.e = (P.getInterpolation(((float) j11) / 300.0f) * f14) + f13;
                        }
                    }
                    this.f29557n.invalidate();
                }
            }
            int i10 = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
            if (i10 >= 0 && i10 == 0) {
                float f15 = this.f29556f;
                if (f15 != 0.0f) {
                    float f16 = f15 - (((float) j10) / 200.0f);
                    this.f29556f = f16;
                    if (f16 <= 0.0f) {
                        this.f29556f = 0.0f;
                    }
                    this.f29557n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f29557n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f29557n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f29557n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f29557n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.f29559s;
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
        Drawable drawable = this.f29561x;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        H.setAlpha(i10);
        J.setAlpha(i10);
        K.setAlpha(i10);
        L.setAlpha(i10);
        M.setAlpha(i10);
        N.setAlpha(i10);
        O.setAlpha(i10);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}

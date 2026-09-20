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
public final class fd0 extends sk0 implements DownloadController.FileDownloadProgressListener {
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
    public long f24088a;
    public float f24089b;
    public float f24090c;
    public long d;
    public float e;
    public float f24091f;
    public boolean h;
    public View f24092n;
    public MessageObject f24093r;
    public int f24094s;
    public boolean v;
    public boolean f24095w;
    public Drawable f24096x;
    public String f24097y;

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
        MessageObject messageObject = this.f24093r;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.media != null) {
                if ((TextUtils.isEmpty(message.attachPath) || !new File(this.f24093r.messageOwner.attachPath).exists()) && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.f24093r.messageOwner).exists()) {
                    attachFileName = FileLoader.getAttachFileName(this.f24093r.getDocument());
                } else {
                    attachFileName = null;
                }
                this.f24095w = false;
                if (attachFileName == null) {
                    this.h = false;
                    this.v = false;
                    this.f24095w = true;
                    DownloadController.getInstance(this.f24093r.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.f24093r.currentAccount).addLoadingFileObserver(attachFileName, this);
                    boolean isLoadingFile = FileLoader.getInstance(this.f24093r.currentAccount).isLoadingFile(attachFileName);
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
                this.f24092n.invalidate();
            }
        }
        this.v = false;
        this.f24095w = true;
        this.h = false;
        b(0.0f, false);
        DownloadController.getInstance(this.f24093r.currentAccount).removeLoadingFileObserver(this);
        this.f24092n.invalidate();
    }

    public final void b(float f7, boolean z10) {
        if (!z10) {
            this.e = f7;
            this.f24090c = f7;
        } else {
            this.f24090c = this.e;
        }
        this.G = String.format("%d%%", Integer.valueOf((int) (100.0f * f7)));
        if (f7 != 1.0f) {
            this.f24091f = 1.0f;
        }
        this.f24089b = f7;
        this.d = 0L;
        this.f24088a = System.currentTimeMillis();
        this.f24092n.invalidate();
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
        int z10 = org.telegram.messenger.rk.z(240.0f, height, 2);
        int z11 = org.telegram.messenger.rk.z(48.0f, width, 2);
        Drawable drawable = this.f24096x;
        drawable.setBounds(z11, z10, AndroidUtilities.dp(48.0f) + z11, AndroidUtilities.dp(48.0f) + z10);
        drawable.draw(canvas);
        canvas.drawText(this.f24097y, (width - ((int) Math.ceil(textPaint.measureText(str)))) / 2, AndroidUtilities.dp(31.0f) + z10, J);
        canvas.drawText(this.E, (width - ((int) Math.ceil(textPaint2.measureText(str2)))) / 2, AndroidUtilities.dp(96.0f) + z10, K);
        canvas.drawText(this.F, (width - ((int) Math.ceil(textPaint3.measureText(str3)))) / 2, AndroidUtilities.dp(125.0f) + z10, L);
        if (this.f24095w) {
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
        canvas.drawText(string, (width - ((int) Math.ceil(textPaint4.measureText(string)))) / 2, org.telegram.messenger.l0.C(235.0f, z10, dp), textPaint4);
        if (this.h) {
            if (this.G != null) {
                canvas.drawText(this.G, (width - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, AndroidUtilities.dp(210.0f) + z10, N);
            }
            int z12 = org.telegram.messenger.rk.z(240.0f, width, 2);
            int dp2 = AndroidUtilities.dp(232.0f) + z10;
            Paint paint = I;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f24091f * 255.0f));
            float f7 = dp2;
            canvas.drawRect(((int) (AndroidUtilities.dp(240.0f) * this.e)) + z12, f7, AndroidUtilities.dp(240.0f) + z12, AndroidUtilities.dp(2.0f) + dp2, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f24091f * 255.0f));
            float f10 = z12;
            canvas.drawRect(f10, f7, (AndroidUtilities.dp(240.0f) * this.e) + f10, AndroidUtilities.dp(2.0f) + dp2, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = currentTimeMillis - this.f24088a;
            this.f24088a = currentTimeMillis;
            float f11 = this.e;
            if (f11 != 1.0f) {
                float f12 = this.f24089b;
                if (f11 != f12) {
                    float f13 = this.f24090c;
                    float f14 = f12 - f13;
                    if (f14 > 0.0f) {
                        long j10 = this.d + j3;
                        this.d = j10;
                        if (j10 >= 300) {
                            this.e = f12;
                            this.f24090c = f12;
                            this.d = 0L;
                        } else {
                            this.e = (P.getInterpolation(((float) j10) / 300.0f) * f14) + f13;
                        }
                    }
                    this.f24092n.invalidate();
                }
            }
            int i10 = (this.e > 1.0f ? 1 : (this.e == 1.0f ? 0 : -1));
            if (i10 >= 0 && i10 == 0) {
                float f15 = this.f24091f;
                if (f15 != 0.0f) {
                    float f16 = f15 - (((float) j3) / 200.0f);
                    this.f24091f = f16;
                    if (f16 <= 0.0f) {
                        this.f24091f = 0.0f;
                    }
                    this.f24092n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f24092n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f24092n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f24092n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f24092n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.f24094s;
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
    public final void onProgressDownload(String str, long j3, long j10) {
        if (!this.h) {
            a();
        }
        b(Math.min(1.0f, ((float) j3) / ((float) j10)), true);
    }

    @Override
    public final void onSuccessDownload(String str) {
        b(1.0f, true);
        a();
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f24096x;
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
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}

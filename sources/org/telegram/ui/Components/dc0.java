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
public final class dc0 extends xj0 implements DownloadController.FileDownloadProgressListener {
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
    public long f27707a;
    public float f27708b;
    public float f27709c;
    public long d;
    public float f27710e;
    public float f27711f;
    public boolean h;
    public View f27712n;
    public MessageObject f27713r;
    public int f27714s;
    public boolean v;
    public boolean f27715w;
    public Drawable f27716x;
    public String f27717y;

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
        MessageObject messageObject = this.f27713r;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.media != null) {
                if ((TextUtils.isEmpty(message.attachPath) || !new File(this.f27713r.messageOwner.attachPath).exists()) && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.f27713r.messageOwner).exists()) {
                    attachFileName = FileLoader.getAttachFileName(this.f27713r.getDocument());
                } else {
                    attachFileName = null;
                }
                this.f27715w = false;
                if (attachFileName == null) {
                    this.h = false;
                    this.v = false;
                    this.f27715w = true;
                    DownloadController.getInstance(this.f27713r.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.f27713r.currentAccount).addLoadingFileObserver(attachFileName, this);
                    boolean isLoadingFile = FileLoader.getInstance(this.f27713r.currentAccount).isLoadingFile(attachFileName);
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
                this.f27712n.invalidate();
            }
        }
        this.v = false;
        this.f27715w = true;
        this.h = false;
        b(0.0f, false);
        DownloadController.getInstance(this.f27713r.currentAccount).removeLoadingFileObserver(this);
        this.f27712n.invalidate();
    }

    public final void b(float f10, boolean z10) {
        if (!z10) {
            this.f27710e = f10;
            this.f27709c = f10;
        } else {
            this.f27709c = this.f27710e;
        }
        this.C = String.format("%d%%", Integer.valueOf((int) (100.0f * f10)));
        if (f10 != 1.0f) {
            this.f27711f = 1.0f;
        }
        this.f27708b = f10;
        this.d = 0L;
        this.f27707a = System.currentTimeMillis();
        this.f27712n.invalidate();
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
        int y10 = org.telegram.messenger.ll.y(240.0f, height, 2);
        int y11 = org.telegram.messenger.ll.y(48.0f, width, 2);
        Drawable drawable = this.f27716x;
        drawable.setBounds(y11, y10, AndroidUtilities.dp(48.0f) + y11, AndroidUtilities.dp(48.0f) + y10);
        drawable.draw(canvas);
        canvas.drawText(this.f27717y, (width - ((int) Math.ceil(textPaint.measureText(str)))) / 2, AndroidUtilities.dp(31.0f) + y10, F);
        canvas.drawText(this.A, (width - ((int) Math.ceil(textPaint2.measureText(str2)))) / 2, AndroidUtilities.dp(96.0f) + y10, G);
        canvas.drawText(this.B, (width - ((int) Math.ceil(textPaint3.measureText(str3)))) / 2, AndroidUtilities.dp(125.0f) + y10, H);
        if (this.f27715w) {
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
        canvas.drawText(string, (width - ((int) Math.ceil(textPaint4.measureText(string)))) / 2, org.telegram.messenger.l0.C(235.0f, y10, dp), textPaint4);
        if (this.h) {
            if (this.C != null) {
                canvas.drawText(this.C, (width - ((int) Math.ceil(textPaint5.measureText(str4)))) / 2, AndroidUtilities.dp(210.0f) + y10, J);
            }
            int y12 = org.telegram.messenger.ll.y(240.0f, width, 2);
            int dp2 = AndroidUtilities.dp(232.0f) + y10;
            Paint paint = E;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f27711f * 255.0f));
            float f10 = dp2;
            canvas.drawRect(((int) (AndroidUtilities.dp(240.0f) * this.f27710e)) + y12, f10, AndroidUtilities.dp(240.0f) + y12, AndroidUtilities.dp(2.0f) + dp2, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f27711f * 255.0f));
            float f11 = y12;
            canvas.drawRect(f11, f10, (AndroidUtilities.dp(240.0f) * this.f27710e) + f11, AndroidUtilities.dp(2.0f) + dp2, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.f27707a;
            this.f27707a = currentTimeMillis;
            float f12 = this.f27710e;
            if (f12 != 1.0f) {
                float f13 = this.f27708b;
                if (f12 != f13) {
                    float f14 = this.f27709c;
                    float f15 = f13 - f14;
                    if (f15 > 0.0f) {
                        long j11 = this.d + j10;
                        this.d = j11;
                        if (j11 >= 300) {
                            this.f27710e = f13;
                            this.f27709c = f13;
                            this.d = 0L;
                        } else {
                            this.f27710e = (L.getInterpolation(((float) j11) / 300.0f) * f15) + f14;
                        }
                    }
                    this.f27712n.invalidate();
                }
            }
            int i9 = (this.f27710e > 1.0f ? 1 : (this.f27710e == 1.0f ? 0 : -1));
            if (i9 >= 0 && i9 == 0) {
                float f16 = this.f27711f;
                if (f16 != 0.0f) {
                    float f17 = f16 - (((float) j10) / 200.0f);
                    this.f27711f = f17;
                    if (f17 <= 0.0f) {
                        this.f27711f = 0.0f;
                    }
                    this.f27712n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override
    public final int getIntrinsicHeight() {
        return this.f27712n.getMeasuredHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        return this.f27712n.getMeasuredWidth();
    }

    @Override
    public final int getMinimumHeight() {
        return this.f27712n.getMeasuredHeight();
    }

    @Override
    public final int getMinimumWidth() {
        return this.f27712n.getMeasuredWidth();
    }

    @Override
    public final int getObserverTag() {
        return this.f27714s;
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
    public final void setAlpha(int i9) {
        Drawable drawable = this.f27716x;
        if (drawable != null) {
            drawable.setAlpha(i9);
        }
        D.setAlpha(i9);
        F.setAlpha(i9);
        G.setAlpha(i9);
        H.setAlpha(i9);
        I.setAlpha(i9);
        J.setAlpha(i9);
        K.setAlpha(i9);
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}

package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class fy extends View implements NotificationCenter.NotificationCenterDelegate {
    public final Paint f38364a;
    public final Paint f38365b;
    public final int f38366c;
    public final ArrayList d;
    public float f38367e;
    public float f38368f;
    public float h;
    public final ImageReceiver f38369n;
    public final ImageReceiver f38370r;
    public final org.telegram.ui.Components.mi0 f38371s;
    public final org.telegram.ui.Components.mi0 v;
    public boolean f38372w;
    public int f38373x;
    public boolean f38374y;

    public fy(Context context, int i9) {
        super(context);
        this.f38364a = new Paint(1);
        this.f38365b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f38369n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f38370r = imageReceiver2;
        this.f38366c = i9;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(R.raw.download_progress, "download_progress", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f38371s = mi0Var;
        org.telegram.ui.Components.mi0 mi0Var2 = new org.telegram.ui.Components.mi0(R.raw.download_finish, "download_finish", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = mi0Var2;
        imageReceiver.setImageBitmap(mi0Var);
        imageReceiver2.setImageBitmap(mi0Var2);
        imageReceiver.setAutoRepeat(1);
        mi0Var.I(1);
        mi0Var.start();
    }

    public final void a() {
        int i9 = org.telegram.ui.ActionBar.f6.f23321v8;
        this.f38371s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.SRC_IN));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.SRC));
        invalidate();
    }

    public final void b() {
        ArrayList arrayList;
        int i9 = this.f38366c;
        DownloadController downloadController = DownloadController.getInstance(i9);
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            hashMap.put(((ey) arrayList.get(i10)).f38042c, (ey) arrayList.get(i10));
            DownloadController.getInstance(i9).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
            i10++;
        }
        arrayList.clear();
        for (int i11 = 0; i11 < downloadController.downloadingFiles.size(); i11++) {
            String fileName = downloadController.downloadingFiles.get(i11).getFileName();
            if (FileLoader.getInstance(i9).isLoadingFile(fileName)) {
                ey eyVar = (ey) hashMap.get(fileName);
                if (eyVar == null) {
                    eyVar = new ey(this, fileName);
                }
                DownloadController.getInstance(i9).addLoadingFileObserver(fileName, eyVar);
                arrayList.add(eyVar);
            }
        }
        if (arrayList.size() == 0 && !this.f38374y) {
            if (DownloadController.getInstance(i9).hasUnviewedDownloads()) {
                this.f38367e = 1.0f;
                this.f38368f = 1.0f;
                this.f38372w = true;
                return;
            }
            this.f38367e = 0.0f;
            this.f38368f = 0.0f;
            this.f38372w = false;
        }
    }

    public final void c() {
        MessagesStorage.getInstance(this.f38366c);
        int i9 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i9 >= arrayList.size()) {
                break;
            }
            j10 += ((ey) arrayList.get(i9)).f38040a;
            j11 += ((ey) arrayList.get(i9)).f38041b;
            i9++;
        }
        if (j10 == 0) {
            this.f38367e = 1.0f;
        } else {
            this.f38367e = ((float) j11) / ((float) j10);
        }
        float f10 = this.f38367e;
        if (f10 > 1.0f) {
            this.f38367e = 1.0f;
        } else if (f10 < 0.0f) {
            this.f38367e = 0.0f;
        }
        this.h = ((this.f38367e - this.f38368f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.onDownloadingFilesChanged) {
            b();
            c();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        NotificationCenter.getInstance(this.f38366c).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f38369n.onAttachedToWindow();
        this.f38370r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i10 = this.f38366c;
            if (i9 < size) {
                DownloadController.getInstance(i10).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i9));
                i9++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f38369n.onDetachedFromWindow();
                this.f38370r.onDetachedFromWindow();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i9 = this.f38373x;
            int i10 = org.telegram.ui.ActionBar.f6.f23321v8;
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
            ImageReceiver imageReceiver = this.f38370r;
            ImageReceiver imageReceiver2 = this.f38369n;
            Paint paint = this.f38364a;
            Paint paint2 = this.f38365b;
            if (i9 != w02) {
                this.f38373x = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
                paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
                int w03 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.setColorFilter(new PorterDuffColorFilter(w03, mode));
                imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), mode));
                paint2.setAlpha(100);
            }
            float f10 = this.f38368f;
            float f11 = this.f38367e;
            if (f10 != f11) {
                float f12 = this.h;
                float f13 = f10 + f12;
                this.f38368f = f13;
                if (f12 > 0.0f && f13 > f11) {
                    this.f38368f = f11;
                } else if (f12 < 0.0f && f13 < f11) {
                    this.f38368f = f11;
                } else {
                    invalidate();
                }
            }
            int dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(1.0f);
            float dp3 = AndroidUtilities.dp(16.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            float measuredHeight = dp + (getMeasuredHeight() / 2);
            float f14 = measuredHeight - dp2;
            float f15 = measuredHeight + dp2;
            rectF.set(dp3, f14, getMeasuredWidth() - dp3, f15);
            canvas.drawRoundRect(rectF, dp2, dp2, paint2);
            rectF.set(dp3, f14, ((getMeasuredWidth() - (2.0f * dp3)) * this.f38368f) + dp3, f15);
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f14);
            if (this.f38367e != 1.0f) {
                this.f38372w = false;
            }
            if (this.f38372w) {
                imageReceiver.draw(canvas);
            } else {
                imageReceiver2.draw(canvas);
            }
            if (this.f38367e == 1.0f && !this.f38372w && this.f38371s.X == 0) {
                org.telegram.ui.Components.mi0 mi0Var = this.v;
                mi0Var.L(0, false, false);
                mi0Var.start();
                this.f38372w = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.f38374y = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
        int dp = AndroidUtilities.dp(15.0f);
        float f10 = dp;
        this.f38369n.setImageCoords(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - i11);
        this.f38370r.setImageCoords(f10, f10, getMeasuredWidth() - i11, getMeasuredHeight() - (dp * 2));
    }

    @Override
    public void setAlpha(float f10) {
        if (f10 == 0.0f) {
            this.f38374y = false;
        }
        super.setAlpha(f10);
    }

    @Override
    public void setVisibility(int i9) {
        if (i9 != 0) {
            this.f38374y = false;
        }
        super.setVisibility(i9);
    }
}

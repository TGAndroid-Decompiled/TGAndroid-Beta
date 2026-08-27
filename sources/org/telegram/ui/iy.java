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

public final class iy extends View implements NotificationCenter.NotificationCenterDelegate {

    public final Paint f39174a;

    public final Paint f39175b;

    public final int f39176c;
    public final ArrayList d;

    public float f39177e;

    public float f39178f;
    public float h;

    public final ImageReceiver f39179n;

    public final ImageReceiver f39180r;

    public final org.telegram.ui.Components.oi0 f39181s;
    public final org.telegram.ui.Components.oi0 v;

    public boolean f39182w;

    public int f39183x;

    public boolean f39184y;

    public iy(Context context, int i10) {
        super(context);
        this.f39174a = new Paint(1);
        this.f39175b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f39179n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f39180r = imageReceiver2;
        this.f39176c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.download_progress, "download_progress", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f39181s = oi0Var;
        org.telegram.ui.Components.oi0 oi0Var2 = new org.telegram.ui.Components.oi0(R.raw.download_finish, "download_finish", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = oi0Var2;
        imageReceiver.setImageBitmap(oi0Var);
        imageReceiver2.setImageBitmap(oi0Var2);
        imageReceiver.setAutoRepeat(1);
        oi0Var.I(1);
        oi0Var.start();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.g6.f23375v8;
        this.f39181s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.SRC));
        invalidate();
    }

    public final void b() {
        ArrayList arrayList;
        int i10 = this.f39176c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap map = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            map.put(((hy) arrayList.get(i11)).f38908c, (hy) arrayList.get(i11));
            DownloadController.getInstance(i10).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < downloadController.downloadingFiles.size(); i12++) {
            String fileName = downloadController.downloadingFiles.get(i12).getFileName();
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                hy hyVar = (hy) map.get(fileName);
                if (hyVar == null) {
                    hyVar = new hy(this, fileName);
                }
                DownloadController.getInstance(i10).addLoadingFileObserver(fileName, hyVar);
                arrayList.add(hyVar);
            }
        }
        if (arrayList.size() != 0 || this.f39184y) {
            return;
        }
        if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
            this.f39177e = 1.0f;
            this.f39178f = 1.0f;
            this.f39182w = true;
        } else {
            this.f39177e = 0.0f;
            this.f39178f = 0.0f;
            this.f39182w = false;
        }
    }

    public final void c() {
        MessagesStorage.getInstance(this.f39176c);
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j10 += ((hy) arrayList.get(i10)).f38906a;
            j11 += ((hy) arrayList.get(i10)).f38907b;
            i10++;
        }
        if (j10 == 0) {
            this.f39177e = 1.0f;
        } else {
            this.f39177e = j11 / j10;
        }
        float f10 = this.f39177e;
        if (f10 > 1.0f) {
            this.f39177e = 1.0f;
        } else if (f10 < 0.0f) {
            this.f39177e = 0.0f;
        }
        this.h = ((this.f39177e - this.f39178f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.onDownloadingFilesChanged) {
            b();
            c();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        NotificationCenter.getInstance(this.f39176c).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f39179n.onAttachedToWindow();
        this.f39180r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f39176c;
            if (i10 >= size) {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f39179n.onDetachedFromWindow();
                this.f39180r.onDetachedFromWindow();
                return;
            }
            DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
            i10++;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i10 = this.f39183x;
        int i11 = org.telegram.ui.ActionBar.g6.f23375v8;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        ImageReceiver imageReceiver = this.f39180r;
        ImageReceiver imageReceiver2 = this.f39179n;
        Paint paint = this.f39174a;
        Paint paint2 = this.f39175b;
        if (i10 != iW0) {
            this.f39183x = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            int iW1 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageReceiver2.setColorFilter(new PorterDuffColorFilter(iW1, mode));
            imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
            paint2.setAlpha(100);
        }
        float f10 = this.f39178f;
        float f11 = this.f39177e;
        if (f10 != f11) {
            float f12 = this.h;
            float f13 = f10 + f12;
            this.f39178f = f13;
            if (f12 > 0.0f && f13 > f11) {
                this.f39178f = f11;
            } else if (f12 >= 0.0f || f13 >= f11) {
                invalidate();
            } else {
                this.f39178f = f11;
            }
        }
        int iDp = AndroidUtilities.dp(8.0f) + (getMeasuredHeight() / 2);
        float fDp = AndroidUtilities.dp(1.0f);
        float fDp2 = AndroidUtilities.dp(16.0f);
        float measuredWidth = getMeasuredWidth() - (2.0f * fDp2);
        RectF rectF = AndroidUtilities.rectTmp;
        float f14 = iDp;
        float f15 = f14 - fDp;
        float f16 = f14 + fDp;
        rectF.set(fDp2, f15, getMeasuredWidth() - fDp2, f16);
        canvas.drawRoundRect(rectF, fDp, fDp, paint2);
        rectF.set(fDp2, f15, (measuredWidth * this.f39178f) + fDp2, f16);
        canvas.drawRoundRect(rectF, fDp, fDp, paint);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f15);
        if (this.f39177e != 1.0f) {
            this.f39182w = false;
        }
        if (this.f39182w) {
            imageReceiver.draw(canvas);
        } else {
            imageReceiver2.draw(canvas);
        }
        if (this.f39177e == 1.0f && !this.f39182w && this.f39181s.X == 0) {
            org.telegram.ui.Components.oi0 oi0Var = this.v;
            oi0Var.L(0, false, false);
            oi0Var.start();
            this.f39182w = true;
        }
        canvas.restore();
        if (getAlpha() != 0.0f) {
            this.f39184y = true;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int iDp = AndroidUtilities.dp(15.0f);
        float f10 = iDp;
        int i12 = iDp * 2;
        this.f39179n.setImageCoords(f10, f10, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f39180r.setImageCoords(f10, f10, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
    }

    @Override
    public void setAlpha(float f10) {
        if (f10 == 0.0f) {
            this.f39184y = false;
        }
        super.setAlpha(f10);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.f39184y = false;
        }
        super.setVisibility(i10);
    }
}

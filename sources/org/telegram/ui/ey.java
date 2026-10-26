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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
public final class ey extends View implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public int E;
    public final Paint f39199a;
    public final Paint f39200b;
    public final int f39201c;
    public final ArrayList d;
    public float e;
    public float f39202f;
    public float h;
    public final ImageReceiver f39203n;
    public final ImageReceiver f39204r;
    public final org.telegram.ui.Components.xj0 f39205s;
    public final org.telegram.ui.Components.xj0 v;
    public boolean f39206w;
    public int f39207x;
    public boolean f39208y;

    public ey(Context context, int i10) {
        super(context);
        this.f39199a = new Paint(1);
        this.f39200b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f39203n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f39204r = imageReceiver2;
        this.f39201c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.download_progress, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f39205s = xj0Var;
        org.telegram.ui.Components.xj0 xj0Var2 = new org.telegram.ui.Components.xj0(R.raw.download_finish, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = xj0Var2;
        imageReceiver.setImageBitmap(xj0Var);
        imageReceiver2.setImageBitmap(xj0Var2);
        imageReceiver.setAutoRepeat(1);
        xj0Var.K(1);
        xj0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i10 = this.f39201c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((dy) arrayList.get(i11)).f38951c, (dy) arrayList.get(i11));
            DownloadController.getInstance(i10).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < downloadController.downloadingFiles.size(); i12++) {
            String fileName = downloadController.downloadingFiles.get(i12).getFileName();
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                dy dyVar = (dy) hashMap.get(fileName);
                if (dyVar == null) {
                    dyVar = new dy(this, fileName);
                }
                DownloadController.getInstance(i10).addLoadingFileObserver(fileName, dyVar);
                arrayList.add(dyVar);
            }
        }
        if (arrayList.size() == 0 && !this.f39208y) {
            if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
                this.e = 1.0f;
                this.f39202f = 1.0f;
                this.f39206w = true;
                return;
            }
            this.e = 0.0f;
            this.f39202f = 0.0f;
            this.f39206w = false;
        }
    }

    public final void b() {
        MessagesStorage.getInstance(this.f39201c);
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j10 += ((dy) arrayList.get(i10)).f38949a;
            j11 += ((dy) arrayList.get(i10)).f38950b;
            i10++;
        }
        if (j10 == 0) {
            this.e = 1.0f;
        } else {
            this.e = ((float) j11) / ((float) j10);
        }
        float f7 = this.e;
        if (f7 > 1.0f) {
            this.e = 1.0f;
        } else if (f7 < 0.0f) {
            this.e = 0.0f;
        }
        this.h = ((this.e - this.f39202f) * 16.0f) / 150.0f;
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.onDownloadingFilesChanged) {
            a();
            b();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
        NotificationCenter.getInstance(this.f39201c).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f39203n.onAttachedToWindow();
        this.f39204r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f39201c;
            if (i10 < size) {
                DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f39203n.onDetachedFromWindow();
                this.f39204r.onDetachedFromWindow();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f39207x;
            int i11 = org.telegram.ui.ActionBar.y6.f23694v8;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            ImageReceiver imageReceiver = this.f39204r;
            ImageReceiver imageReceiver2 = this.f39203n;
            Paint paint = this.f39199a;
            Paint paint2 = this.f39200b;
            if (i10 != x02) {
                this.f39207x = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.setColorFilter(new PorterDuffColorFilter(x03, mode));
                imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, i11, false), mode));
                paint2.setAlpha(100);
            }
            float f7 = this.f39202f;
            float f10 = this.e;
            if (f7 != f10) {
                float f11 = this.h;
                float f12 = f7 + f11;
                this.f39202f = f12;
                if (f11 > 0.0f && f12 > f10) {
                    this.f39202f = f10;
                } else if (f11 < 0.0f && f12 < f10) {
                    this.f39202f = f10;
                } else {
                    invalidate();
                }
            }
            int dp = AndroidUtilities.dp(8.0f);
            float dp2 = AndroidUtilities.dp(1.0f);
            float dp3 = AndroidUtilities.dp(16.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            float measuredHeight = dp + (getMeasuredHeight() / 2);
            float f13 = measuredHeight - dp2;
            float f14 = measuredHeight + dp2;
            rectF.set(dp3, f13, getMeasuredWidth() - dp3, f14);
            canvas.drawRoundRect(rectF, dp2, dp2, paint2);
            rectF.set(dp3, f13, ((getMeasuredWidth() - (2.0f * dp3)) * this.f39202f) + dp3, f14);
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f13);
            if (this.e != 1.0f) {
                this.f39206w = false;
            }
            if (this.f39206w) {
                imageReceiver.draw(canvas);
            } else {
                imageReceiver2.draw(canvas);
            }
            if (this.e == 1.0f && !this.f39206w && this.f39205s.f34736a0 == 0) {
                org.telegram.ui.Components.xj0 xj0Var = this.v;
                xj0Var.N(0, false, false);
                xj0Var.start();
                this.f39206w = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.f39208y = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int dp = AndroidUtilities.dp(15.0f);
        float f7 = dp;
        this.f39203n.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f39204r.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - (dp * 2));
    }

    @Override
    public void setAlpha(float f7) {
        if (f7 == 0.0f) {
            this.f39208y = false;
        }
        super.setAlpha(f7);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.f39208y = false;
        }
        super.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.xj0 xj0Var;
        org.telegram.ui.Components.xj0 xj0Var2 = this.f39205s;
        if (xj0Var2 != null && (xj0Var = this.v) != null) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23694v8, false);
            if (x02 != this.E || xj0Var2.getColorFilter() == null) {
                this.E = x02;
                xj0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                xj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

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
public final class gy extends View implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
    public int E;
    public final Paint f39708a;
    public final Paint f39709b;
    public final int f39710c;
    public final ArrayList d;
    public float e;
    public float f39711f;
    public float h;
    public final ImageReceiver f39712n;
    public final ImageReceiver f39713r;
    public final org.telegram.ui.Components.yj0 f39714s;
    public final org.telegram.ui.Components.yj0 v;
    public boolean f39715w;
    public int f39716x;
    public boolean f39717y;

    public gy(Context context, int i10) {
        super(context);
        this.f39708a = new Paint(1);
        this.f39709b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f39712n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f39713r = imageReceiver2;
        this.f39710c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.download_progress, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f39714s = yj0Var;
        org.telegram.ui.Components.yj0 yj0Var2 = new org.telegram.ui.Components.yj0(R.raw.download_finish, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = yj0Var2;
        imageReceiver.setImageBitmap(yj0Var);
        imageReceiver2.setImageBitmap(yj0Var2);
        imageReceiver.setAutoRepeat(1);
        yj0Var.K(1);
        yj0Var.start();
    }

    public final void a() {
        ArrayList arrayList;
        int i10 = this.f39710c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((fy) arrayList.get(i11)).f39446c, (fy) arrayList.get(i11));
            DownloadController.getInstance(i10).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i11));
            i11++;
        }
        arrayList.clear();
        for (int i12 = 0; i12 < downloadController.downloadingFiles.size(); i12++) {
            String fileName = downloadController.downloadingFiles.get(i12).getFileName();
            if (FileLoader.getInstance(i10).isLoadingFile(fileName)) {
                fy fyVar = (fy) hashMap.get(fileName);
                if (fyVar == null) {
                    fyVar = new fy(this, fileName);
                }
                DownloadController.getInstance(i10).addLoadingFileObserver(fileName, fyVar);
                arrayList.add(fyVar);
            }
        }
        if (arrayList.size() == 0 && !this.f39717y) {
            if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
                this.e = 1.0f;
                this.f39711f = 1.0f;
                this.f39715w = true;
                return;
            }
            this.e = 0.0f;
            this.f39711f = 0.0f;
            this.f39715w = false;
        }
    }

    public final void b() {
        MessagesStorage.getInstance(this.f39710c);
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j10 += ((fy) arrayList.get(i10)).f39444a;
            j11 += ((fy) arrayList.get(i10)).f39445b;
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
        this.h = ((this.e - this.f39711f) * 16.0f) / 150.0f;
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
        NotificationCenter.getInstance(this.f39710c).addWeakObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f39712n.onAttachedToWindow();
        this.f39713r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f39710c;
            if (i10 < size) {
                DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f39712n.onDetachedFromWindow();
                this.f39713r.onDetachedFromWindow();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f39716x;
            int i11 = org.telegram.ui.ActionBar.y6.f23695v8;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
            ImageReceiver imageReceiver = this.f39713r;
            ImageReceiver imageReceiver2 = this.f39712n;
            Paint paint = this.f39708a;
            Paint paint2 = this.f39709b;
            if (i10 != x02) {
                this.f39716x = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.setColorFilter(new PorterDuffColorFilter(x03, mode));
                imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, i11, false), mode));
                paint2.setAlpha(100);
            }
            float f7 = this.f39711f;
            float f10 = this.e;
            if (f7 != f10) {
                float f11 = this.h;
                float f12 = f7 + f11;
                this.f39711f = f12;
                if (f11 > 0.0f && f12 > f10) {
                    this.f39711f = f10;
                } else if (f11 < 0.0f && f12 < f10) {
                    this.f39711f = f10;
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
            rectF.set(dp3, f13, ((getMeasuredWidth() - (2.0f * dp3)) * this.f39711f) + dp3, f14);
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f13);
            if (this.e != 1.0f) {
                this.f39715w = false;
            }
            if (this.f39715w) {
                imageReceiver.draw(canvas);
            } else {
                imageReceiver2.draw(canvas);
            }
            if (this.e == 1.0f && !this.f39715w && this.f39714s.f35067a0 == 0) {
                org.telegram.ui.Components.yj0 yj0Var = this.v;
                yj0Var.N(0, false, false);
                yj0Var.start();
                this.f39715w = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.f39717y = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int dp = AndroidUtilities.dp(15.0f);
        float f7 = dp;
        this.f39712n.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f39713r.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - (dp * 2));
    }

    @Override
    public void setAlpha(float f7) {
        if (f7 == 0.0f) {
            this.f39717y = false;
        }
        super.setAlpha(f7);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.f39717y = false;
        }
        super.setVisibility(i10);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.yj0 yj0Var;
        org.telegram.ui.Components.yj0 yj0Var2 = this.f39714s;
        if (yj0Var2 != null && (yj0Var = this.v) != null) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23695v8, false);
            if (x02 != this.E || yj0Var2.getColorFilter() == null) {
                this.E = x02;
                yj0Var2.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
                yj0Var.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC));
                invalidate();
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

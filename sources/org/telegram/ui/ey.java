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
public final class ey extends View implements NotificationCenter.NotificationCenterDelegate {
    public final Paint f36813a;
    public final Paint f36814b;
    public final int f36815c;
    public final ArrayList d;
    public float e;
    public float f36816f;
    public float h;
    public final ImageReceiver f36817n;
    public final ImageReceiver f36818r;
    public final org.telegram.ui.Components.uj0 f36819s;
    public final org.telegram.ui.Components.uj0 v;
    public boolean f36820w;
    public int f36821x;
    public boolean f36822y;

    public ey(Context context, int i10) {
        super(context);
        this.f36813a = new Paint(1);
        this.f36814b = new Paint(1);
        this.d = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f36817n = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f36818r = imageReceiver2;
        this.f36815c = i10;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(R.raw.download_progress, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.f36819s = uj0Var;
        org.telegram.ui.Components.uj0 uj0Var2 = new org.telegram.ui.Components.uj0(R.raw.download_finish, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.v = uj0Var2;
        imageReceiver.setImageBitmap(uj0Var);
        imageReceiver2.setImageBitmap(uj0Var2);
        imageReceiver.setAutoRepeat(1);
        uj0Var.K(1);
        uj0Var.start();
    }

    public final void a() {
        int i10 = org.telegram.ui.ActionBar.h6.f21322v8;
        this.f36819s.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false), PorterDuff.Mode.SRC_IN));
        this.v.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i10, false), PorterDuff.Mode.SRC));
        invalidate();
    }

    public final void b() {
        ArrayList arrayList;
        int i10 = this.f36815c;
        DownloadController downloadController = DownloadController.getInstance(i10);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (true) {
            arrayList = this.d;
            if (i11 >= arrayList.size()) {
                break;
            }
            hashMap.put(((dy) arrayList.get(i11)).f36456c, (dy) arrayList.get(i11));
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
        if (arrayList.size() == 0 && !this.f36822y) {
            if (DownloadController.getInstance(i10).hasUnviewedDownloads()) {
                this.e = 1.0f;
                this.f36816f = 1.0f;
                this.f36820w = true;
                return;
            }
            this.e = 0.0f;
            this.f36816f = 0.0f;
            this.f36820w = false;
        }
    }

    public final void c() {
        MessagesStorage.getInstance(this.f36815c);
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                break;
            }
            j10 += ((dy) arrayList.get(i10)).f36454a;
            j11 += ((dy) arrayList.get(i10)).f36455b;
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
        this.h = ((this.e - this.f36816f) * 16.0f) / 150.0f;
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
        NotificationCenter.getInstance(this.f36815c).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.f36817n.onAttachedToWindow();
        this.f36818r.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i11 = this.f36815c;
            if (i10 < size) {
                DownloadController.getInstance(i11).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i10));
                i10++;
            } else {
                arrayList.clear();
                NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.f36817n.onDetachedFromWindow();
                this.f36818r.onDetachedFromWindow();
                return;
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() != 0.0f) {
            int i10 = this.f36821x;
            int i11 = org.telegram.ui.ActionBar.h6.f21322v8;
            int x02 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
            ImageReceiver imageReceiver = this.f36818r;
            ImageReceiver imageReceiver2 = this.f36817n;
            Paint paint = this.f36813a;
            Paint paint2 = this.f36814b;
            if (i10 != x02) {
                this.f36821x = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
                paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                paint2.setColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
                int x03 = org.telegram.ui.ActionBar.h6.x0(null, i11, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageReceiver2.setColorFilter(new PorterDuffColorFilter(x03, mode));
                imageReceiver.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), mode));
                paint2.setAlpha(100);
            }
            float f7 = this.f36816f;
            float f10 = this.e;
            if (f7 != f10) {
                float f11 = this.h;
                float f12 = f7 + f11;
                this.f36816f = f12;
                if (f11 > 0.0f && f12 > f10) {
                    this.f36816f = f10;
                } else if (f11 < 0.0f && f12 < f10) {
                    this.f36816f = f10;
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
            rectF.set(dp3, f13, ((getMeasuredWidth() - (2.0f * dp3)) * this.f36816f) + dp3, f14);
            canvas.drawRoundRect(rectF, dp2, dp2, paint);
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f13);
            if (this.e != 1.0f) {
                this.f36820w = false;
            }
            if (this.f36820w) {
                imageReceiver.draw(canvas);
            } else {
                imageReceiver2.draw(canvas);
            }
            if (this.e == 1.0f && !this.f36820w && this.f36819s.f30974a0 == 0) {
                org.telegram.ui.Components.uj0 uj0Var = this.v;
                uj0Var.N(0, false, false);
                uj0Var.start();
                this.f36820w = true;
            }
            canvas.restore();
            if (getAlpha() != 0.0f) {
                this.f36822y = true;
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
        int dp = AndroidUtilities.dp(15.0f);
        float f7 = dp;
        this.f36817n.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - i12);
        this.f36818r.setImageCoords(f7, f7, getMeasuredWidth() - i12, getMeasuredHeight() - (dp * 2));
    }

    @Override
    public void setAlpha(float f7) {
        if (f7 == 0.0f) {
            this.f36822y = false;
        }
        super.setAlpha(f7);
    }

    @Override
    public void setVisibility(int i10) {
        if (i10 != 0) {
            this.f36822y = false;
        }
        super.setVisibility(i10);
    }
}

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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RLottieDrawable;

public final class DownloadProgressIcon extends View implements NotificationCenter.NotificationCenterDelegate {
    public final int currentAccount;
    public int currentColor;
    public final ArrayList currentListeners;
    public float currentProgress;
    public final RLottieDrawable downloadCompleteDrawable;
    public final ImageReceiver downloadCompleteImageReceiver;
    public final RLottieDrawable downloadDrawable;
    public final ImageReceiver downloadImageReceiver;
    public final Paint paint;
    public final Paint paint2;
    public float progress;
    public float progressDt;
    public boolean showCompletedIcon;
    public boolean wasDrawn;

    public final class ProgressObserver implements DownloadController.FileDownloadProgressListener {
        public long downloaded;
        public final String fileName;
        public long total;

        public ProgressObserver(String str) {
            this.fileName = str;
        }

        @Override
        public final int getObserverTag() {
            return 0;
        }

        @Override
        public final void onFailedDownload(String str, boolean z) {
        }

        @Override
        public final void onProgressDownload(String str, long j, long j2) {
            this.downloaded = j;
            this.total = j2;
            DownloadProgressIcon.this.updateProgress$1();
        }

        @Override
        public final void onProgressUpload(String str, long j, long j2, boolean z) {
        }

        @Override
        public final void onSuccessDownload(String str) {
        }
    }

    public DownloadProgressIcon(Context context, int i) {
        super(context);
        this.paint = new Paint(1);
        this.paint2 = new Paint(1);
        this.currentListeners = new ArrayList();
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.downloadImageReceiver = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.downloadCompleteImageReceiver = imageReceiver2;
        this.currentAccount = i;
        imageReceiver.ignoreNotifications = true;
        imageReceiver2.ignoreNotifications = true;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.download_progress, "download_progress", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.downloadDrawable = rLottieDrawable;
        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(R.raw.download_finish, "download_finish", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
        this.downloadCompleteDrawable = rLottieDrawable2;
        imageReceiver.setImageBitmap(rLottieDrawable);
        imageReceiver2.setImageBitmap(rLottieDrawable2);
        imageReceiver.setAutoRepeat(1);
        rLottieDrawable.setAutoRepeat(1);
        rLottieDrawable.start();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.onDownloadingFilesChanged) {
            updateDownloadingListeners();
            updateProgress$1();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateDownloadingListeners();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.onDownloadingFilesChanged);
        this.downloadImageReceiver.onAttachedToWindow();
        this.downloadCompleteImageReceiver.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.currentListeners;
            int size = arrayList.size();
            int i2 = this.currentAccount;
            if (i >= size) {
                arrayList.clear();
                NotificationCenter.getInstance(i2).removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
                this.downloadImageReceiver.onDetachedFromWindow();
                this.downloadCompleteImageReceiver.onDetachedFromWindow();
                return;
            }
            DownloadController.getInstance(i2).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i));
            i++;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (getAlpha() == 0.0f) {
            return;
        }
        int i = this.currentColor;
        int i2 = Theme.key_actionBarDefaultIcon;
        int color = Theme.getColor(null, i2, false);
        ImageReceiver imageReceiver = this.downloadCompleteImageReceiver;
        ImageReceiver imageReceiver2 = this.downloadImageReceiver;
        Paint paint = this.paint;
        Paint paint2 = this.paint2;
        if (i != color) {
            this.currentColor = Theme.getColor(null, i2, false);
            paint.setColor(Theme.getColor(null, i2, false));
            paint2.setColor(Theme.getColor(null, i2, false));
            int color2 = Theme.getColor(null, i2, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageReceiver2.setColorFilter(new PorterDuffColorFilter(color2, mode));
            imageReceiver.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i2, false), mode));
            paint2.setAlpha(100);
        }
        float f = this.currentProgress;
        float f2 = this.progress;
        if (f != f2) {
            float f3 = this.progressDt;
            float f4 = f + f3;
            this.currentProgress = f4;
            if (f3 > 0.0f && f4 > f2) {
                this.currentProgress = f2;
            } else if (f3 >= 0.0f || f4 >= f2) {
                invalidate();
            } else {
                this.currentProgress = f2;
            }
        }
        int iDp = AndroidUtilities.dp(8.0f) + (getMeasuredHeight() / 2);
        float fDp = AndroidUtilities.dp(1.0f);
        float fDp2 = AndroidUtilities.dp(16.0f);
        float measuredWidth = getMeasuredWidth() - (2.0f * fDp2);
        RectF rectF = AndroidUtilities.rectTmp;
        float f5 = iDp;
        float f6 = f5 - fDp;
        float f7 = f5 + fDp;
        rectF.set(fDp2, f6, getMeasuredWidth() - fDp2, f7);
        canvas.drawRoundRect(rectF, fDp, fDp, paint2);
        rectF.set(fDp2, f6, (measuredWidth * this.currentProgress) + fDp2, f7);
        canvas.drawRoundRect(rectF, fDp, fDp, paint);
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getMeasuredWidth(), f6);
        if (this.progress != 1.0f) {
            this.showCompletedIcon = false;
        }
        if (this.showCompletedIcon) {
            imageReceiver.draw(canvas);
        } else {
            imageReceiver2.draw(canvas);
        }
        if (this.progress == 1.0f && !this.showCompletedIcon && this.downloadDrawable.currentFrame == 0) {
            RLottieDrawable rLottieDrawable = this.downloadCompleteDrawable;
            rLottieDrawable.setCurrentFrame(0, false, false);
            rLottieDrawable.start();
            this.showCompletedIcon = true;
        }
        canvas.restore();
        if (getAlpha() != 0.0f) {
            this.wasDrawn = true;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
        int iDp = AndroidUtilities.dp(15.0f);
        float f = iDp;
        int i3 = iDp * 2;
        this.downloadImageReceiver.setImageCoords(f, f, getMeasuredWidth() - i3, getMeasuredHeight() - i3);
        this.downloadCompleteImageReceiver.setImageCoords(f, f, getMeasuredWidth() - i3, getMeasuredHeight() - i3);
    }

    @Override
    public void setAlpha(float f) {
        if (f == 0.0f) {
            this.wasDrawn = false;
        }
        super.setAlpha(f);
    }

    @Override
    public void setVisibility(int i) {
        if (i != 0) {
            this.wasDrawn = false;
        }
        super.setVisibility(i);
    }

    public final void updateColors$1() {
        RLottieDrawable rLottieDrawable = this.downloadDrawable;
        int i = Theme.key_actionBarDefaultIcon;
        rLottieDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.SRC_IN));
        this.downloadCompleteDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.SRC));
        invalidate();
    }

    public final void updateDownloadingListeners() {
        ArrayList arrayList;
        int i = this.currentAccount;
        DownloadController downloadController = DownloadController.getInstance(i);
        HashMap map = new HashMap();
        int i2 = 0;
        while (true) {
            arrayList = this.currentListeners;
            if (i2 >= arrayList.size()) {
                break;
            }
            map.put(((ProgressObserver) arrayList.get(i2)).fileName, (ProgressObserver) arrayList.get(i2));
            DownloadController.getInstance(i).removeLoadingFileObserver((DownloadController.FileDownloadProgressListener) arrayList.get(i2));
            i2++;
        }
        arrayList.clear();
        for (int i3 = 0; i3 < downloadController.downloadingFiles.size(); i3++) {
            String fileName = downloadController.downloadingFiles.get(i3).getFileName();
            if (FileLoader.getInstance(i).isLoadingFile(fileName)) {
                ProgressObserver progressObserver = (ProgressObserver) map.get(fileName);
                if (progressObserver == null) {
                    progressObserver = new ProgressObserver(fileName);
                }
                DownloadController.getInstance(i).addLoadingFileObserver(fileName, progressObserver);
                arrayList.add(progressObserver);
            }
        }
        if (arrayList.size() != 0 || this.wasDrawn) {
            return;
        }
        if (DownloadController.getInstance(i).hasUnviewedDownloads()) {
            this.progress = 1.0f;
            this.currentProgress = 1.0f;
            this.showCompletedIcon = true;
        } else {
            this.progress = 0.0f;
            this.currentProgress = 0.0f;
            this.showCompletedIcon = false;
        }
    }

    public final void updateProgress$1() {
        MessagesStorage.getInstance(this.currentAccount);
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (true) {
            ArrayList arrayList = this.currentListeners;
            if (i >= arrayList.size()) {
                break;
            }
            j += ((ProgressObserver) arrayList.get(i)).total;
            j2 += ((ProgressObserver) arrayList.get(i)).downloaded;
            i++;
        }
        if (j == 0) {
            this.progress = 1.0f;
        } else {
            this.progress = j2 / j;
        }
        float f = this.progress;
        if (f > 1.0f) {
            this.progress = 1.0f;
        } else if (f < 0.0f) {
            this.progress = 0.0f;
        }
        this.progressDt = ((this.progress - this.currentProgress) * 16.0f) / 150.0f;
        invalidate();
    }
}

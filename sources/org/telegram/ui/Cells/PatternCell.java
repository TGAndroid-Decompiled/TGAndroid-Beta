package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.iv.RichEditor;

public final class PatternCell extends BackupImageView implements DownloadController.FileDownloadProgressListener {
    public final int TAG;
    public MotionBackgroundDrawable backgroundDrawable;
    public final Paint backgroundPaint;
    public final int currentAccount;
    public int currentBackgroundColor;
    public int currentGradientAngle;
    public int currentGradientColor1;
    public int currentGradientColor2;
    public int currentGradientColor3;
    public TLRPC.TL_wallPaper currentPattern;
    public final PatternCellDelegate delegate;
    public LinearGradient gradientShader;
    public final int maxWallpaperSize;
    public final RadialProgress2 radialProgress;
    public final RectF rect;

    public interface PatternCellDelegate {
        int getBackgroundColor();

        int getBackgroundGradientAngle();

        int getBackgroundGradientColor1();

        int getBackgroundGradientColor2();

        int getBackgroundGradientColor3();

        int getCheckColor();

        float getIntensity();

        int getPatternColor();

        TLRPC.TL_wallPaper getSelectedPattern();
    }

    public PatternCell(Context context, int i, PatternCellDelegate patternCellDelegate) {
        super(context);
        this.rect = new RectF();
        int i2 = UserConfig.selectedAccount;
        this.currentAccount = i2;
        setRoundRadius(AndroidUtilities.dp(6.0f));
        this.maxWallpaperSize = i;
        this.delegate = patternCellDelegate;
        RadialProgress2 radialProgress2 = new RadialProgress2(this);
        this.radialProgress = radialProgress2;
        radialProgress2.setProgressRect(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        this.backgroundPaint = new Paint(3);
        this.TAG = DownloadController.getInstance(i2).generateObserverTag();
        setOutlineProvider(new RichEditor.AnonymousClass5(3));
        setClipToOutline(true);
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateSelected(false);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        PatternCellDelegate patternCellDelegate = this.delegate;
        float intensity = patternCellDelegate.getIntensity();
        this.imageReceiver.setBlendMode(null);
        int backgroundColor = patternCellDelegate.getBackgroundColor();
        int backgroundGradientColor1 = patternCellDelegate.getBackgroundGradientColor1();
        int backgroundGradientColor2 = patternCellDelegate.getBackgroundGradientColor2();
        int backgroundGradientColor3 = patternCellDelegate.getBackgroundGradientColor3();
        int backgroundGradientAngle = patternCellDelegate.getBackgroundGradientAngle();
        int checkColor = patternCellDelegate.getCheckColor();
        if (backgroundGradientColor1 == 0) {
            this.gradientShader = null;
            this.backgroundDrawable = null;
            this.imageReceiver.setGradientBitmap(null);
        } else if (this.gradientShader == null || backgroundColor != this.currentBackgroundColor || backgroundGradientColor1 != this.currentGradientColor1 || backgroundGradientColor2 != this.currentGradientColor2 || backgroundGradientColor3 != this.currentGradientColor3 || backgroundGradientAngle != this.currentGradientAngle) {
            this.currentBackgroundColor = backgroundColor;
            this.currentGradientColor1 = backgroundGradientColor1;
            this.currentGradientColor2 = backgroundGradientColor2;
            this.currentGradientColor3 = backgroundGradientColor3;
            this.currentGradientAngle = backgroundGradientAngle;
            if (backgroundGradientColor2 != 0) {
                this.gradientShader = null;
                MotionBackgroundDrawable motionBackgroundDrawable = this.backgroundDrawable;
                if (motionBackgroundDrawable != null) {
                    motionBackgroundDrawable.setColors(backgroundColor, backgroundGradientColor1, backgroundGradientColor2, backgroundGradientColor3, 0, false);
                } else {
                    MotionBackgroundDrawable motionBackgroundDrawable2 = new MotionBackgroundDrawable(backgroundColor, backgroundGradientColor1, backgroundGradientColor2, backgroundGradientColor3, true);
                    this.backgroundDrawable = motionBackgroundDrawable2;
                    motionBackgroundDrawable2.setRoundRadius(AndroidUtilities.dp(6.0f));
                    this.backgroundDrawable.setParentView(this);
                }
                if (intensity < 0.0f) {
                    this.imageReceiver.setGradientBitmap(this.backgroundDrawable.getBitmap());
                } else {
                    this.imageReceiver.setGradientBitmap(null);
                    if (Build.VERSION.SDK_INT >= 29) {
                        this.imageReceiver.setBlendMode(BlendMode.SOFT_LIGHT);
                    } else {
                        this.imageReceiver.setColorFilter(new PorterDuffColorFilter(patternCellDelegate.getPatternColor(), PorterDuff.Mode.SRC_IN));
                    }
                }
            } else {
                Rect gradientPoints = BackgroundGradientDrawable.getGradientPoints(backgroundGradientAngle, getMeasuredWidth(), getMeasuredHeight());
                this.gradientShader = new LinearGradient(gradientPoints.left, gradientPoints.top, gradientPoints.right, gradientPoints.bottom, new int[]{backgroundColor, backgroundGradientColor1}, (float[]) null, Shader.TileMode.CLAMP);
                this.backgroundDrawable = null;
                this.imageReceiver.setGradientBitmap(null);
            }
        }
        MotionBackgroundDrawable motionBackgroundDrawable3 = this.backgroundDrawable;
        if (motionBackgroundDrawable3 != null) {
            motionBackgroundDrawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.backgroundDrawable.draw(canvas);
        } else {
            Paint paint = this.backgroundPaint;
            paint.setShader(this.gradientShader);
            if (this.gradientShader == null) {
                paint.setColor(backgroundColor);
            }
            RectF rectF = this.rect;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        super.onDraw(canvas);
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (radialProgress2.getIcon() != 4) {
            radialProgress2.setColors(checkColor, checkColor, -1, -1);
            radialProgress2.draw(canvas);
        }
    }

    @Override
    public final void onFailedDownload(String str, boolean z) {
        TLRPC.TL_wallPaper selectedPattern = this.delegate.getSelectedPattern();
        TLRPC.TL_wallPaper tL_wallPaper = this.currentPattern;
        if (!(tL_wallPaper == null && selectedPattern == null) && (selectedPattern == null || tL_wallPaper == null || tL_wallPaper.id != selectedPattern.id)) {
            return;
        }
        if (z) {
            this.radialProgress.setIcon(4, false, true);
        } else {
            updateButtonState(tL_wallPaper, true, z);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
    }

    @Override
    public final void onProgressDownload(String str, long j, long j2) {
        float fMin = Math.min(1.0f, j / j2);
        RadialProgress2 radialProgress2 = this.radialProgress;
        radialProgress2.setProgress(fMin, true);
        TLRPC.TL_wallPaper selectedPattern = this.delegate.getSelectedPattern();
        TLRPC.TL_wallPaper tL_wallPaper = this.currentPattern;
        if ((!(tL_wallPaper == null && selectedPattern == null) && (selectedPattern == null || tL_wallPaper == null || tL_wallPaper.id != selectedPattern.id)) || radialProgress2.getIcon() == 10) {
            return;
        }
        updateButtonState(this.currentPattern, false, true);
    }

    @Override
    public final void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    @Override
    public final void onSuccessDownload(String str) {
        this.radialProgress.setProgress(1.0f, true);
        TLRPC.TL_wallPaper selectedPattern = this.delegate.getSelectedPattern();
        TLRPC.TL_wallPaper tL_wallPaper = this.currentPattern;
        if (!(tL_wallPaper == null && selectedPattern == null) && (selectedPattern == null || tL_wallPaper == null || tL_wallPaper.id != selectedPattern.id)) {
            return;
        }
        updateButtonState(tL_wallPaper, false, true);
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.currentPattern = tL_wallPaper;
        if (tL_wallPaper != null) {
            setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100.0f)), tL_wallPaper.document), "100_100", (ImageLocation) null, (String) null, "png", 0L, 1, tL_wallPaper);
        } else {
            setImageDrawable(null);
        }
        updateSelected(false);
    }

    public final void updateButtonState(Object obj, boolean z, boolean z2) {
        File httpFilePath;
        String name;
        boolean z3 = obj instanceof TLRPC.TL_wallPaper;
        RadialProgress2 radialProgress2 = this.radialProgress;
        if (!z3 && !(obj instanceof MediaController.SearchImage)) {
            radialProgress2.setIcon(6, z, z2);
            return;
        }
        int i = this.currentAccount;
        if (z3) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = FileLoader.getAttachFileName(tL_wallPaper.document);
            if (TextUtils.isEmpty(name)) {
                return;
            } else {
                httpFilePath = FileLoader.getInstance(i).getPathToAttach(tL_wallPaper.document, true);
            }
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            TLRPC.Photo photo = searchImage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.maxWallpaperSize, true);
                File pathToAttach = FileLoader.getInstance(i).getPathToAttach(closestPhotoSizeWithSize, true);
                name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                httpFilePath = pathToAttach;
            } else {
                httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                name = httpFilePath.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (httpFilePath.exists()) {
            DownloadController.getInstance(i).removeLoadingFileObserver(this);
            radialProgress2.setProgress(1.0f, z2);
            radialProgress2.setIcon(6, z, z2);
            return;
        }
        DownloadController.getInstance(i).addLoadingFileObserver(name, null, this);
        FileLoader.getInstance(i).isLoadingFile(name);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(name);
        if (fileProgress != null) {
            radialProgress2.setProgress(fileProgress.floatValue(), z2);
        } else {
            radialProgress2.setProgress(0.0f, z2);
        }
        radialProgress2.setIcon(10, z, z2);
    }

    public final void updateSelected(boolean z) {
        TLRPC.TL_wallPaper selectedPattern = this.delegate.getSelectedPattern();
        TLRPC.TL_wallPaper tL_wallPaper = this.currentPattern;
        if (!(tL_wallPaper == null && selectedPattern == null) && (selectedPattern == null || tL_wallPaper == null || tL_wallPaper.id != selectedPattern.id)) {
            this.radialProgress.setIcon(4, false, z);
        } else {
            updateButtonState(selectedPattern, false, z);
        }
        invalidate();
    }
}

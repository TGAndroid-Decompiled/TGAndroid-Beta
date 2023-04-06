package org.telegram.ui.Cells;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_wallPaper;
import org.telegram.ui.Components.BackgroundGradientDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.RadialProgress2;
public class PatternCell extends BackupImageView implements DownloadController.FileDownloadProgressListener {
    private int TAG;
    private MotionBackgroundDrawable backgroundDrawable;
    private Paint backgroundPaint;
    private int currentAccount;
    private int currentBackgroundColor;
    private int currentGradientAngle;
    private int currentGradientColor1;
    private int currentGradientColor2;
    private int currentGradientColor3;
    private TLRPC$TL_wallPaper currentPattern;
    private PatternCellDelegate delegate;
    private LinearGradient gradientShader;
    private int maxWallpaperSize;
    private RadialProgress2 radialProgress;
    private RectF rect;

    public interface PatternCellDelegate {
        int getBackgroundColor();

        int getBackgroundGradientAngle();

        int getBackgroundGradientColor1();

        int getBackgroundGradientColor2();

        int getBackgroundGradientColor3();

        int getCheckColor();

        float getIntensity();

        int getPatternColor();

        TLRPC$TL_wallPaper getSelectedPattern();
    }

    @Override
    public void onProgressUpload(String str, long j, long j2, boolean z) {
    }

    public PatternCell(Context context, int i, PatternCellDelegate patternCellDelegate) {
        super(context);
        this.rect = new RectF();
        this.currentAccount = UserConfig.selectedAccount;
        setRoundRadius(AndroidUtilities.dp(6.0f));
        this.maxWallpaperSize = i;
        this.delegate = patternCellDelegate;
        RadialProgress2 radialProgress2 = new RadialProgress2(this);
        this.radialProgress = radialProgress2;
        radialProgress2.setProgressRect(AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f));
        this.backgroundPaint = new Paint(3);
        this.TAG = DownloadController.getInstance(this.currentAccount).generateObserverTag();
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), view.getMeasuredWidth() - AndroidUtilities.dp(1.0f), view.getMeasuredHeight() - AndroidUtilities.dp(1.0f), AndroidUtilities.dp(6.0f));
                }
            });
            setClipToOutline(true);
        }
    }

    public void setPattern(TLRPC$TL_wallPaper tLRPC$TL_wallPaper) {
        this.currentPattern = tLRPC$TL_wallPaper;
        if (tLRPC$TL_wallPaper != null) {
            setImage(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tLRPC$TL_wallPaper.document.thumbs, AndroidUtilities.dp(100.0f)), tLRPC$TL_wallPaper.document), "100_100", null, null, "png", 0L, 1, tLRPC$TL_wallPaper);
        } else {
            setImageDrawable(null);
        }
        updateSelected(false);
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateSelected(false);
    }

    public void updateSelected(boolean z) {
        TLRPC$TL_wallPaper selectedPattern = this.delegate.getSelectedPattern();
        TLRPC$TL_wallPaper tLRPC$TL_wallPaper = this.currentPattern;
        if ((tLRPC$TL_wallPaper == null && selectedPattern == null) || !(selectedPattern == null || tLRPC$TL_wallPaper == null || tLRPC$TL_wallPaper.id != selectedPattern.id)) {
            updateButtonState(selectedPattern, false, z);
        } else {
            this.radialProgress.setIcon(4, false, z);
        }
        invalidate();
    }

    @Override
    public void invalidate() {
        super.invalidate();
    }

    private void updateButtonState(Object obj, boolean z, boolean z2) {
        File httpFilePath;
        String name;
        boolean z3 = obj instanceof TLRPC$TL_wallPaper;
        if (z3 || (obj instanceof MediaController.SearchImage)) {
            if (z3) {
                TLRPC$TL_wallPaper tLRPC$TL_wallPaper = (TLRPC$TL_wallPaper) obj;
                name = FileLoader.getAttachFileName(tLRPC$TL_wallPaper.document);
                if (TextUtils.isEmpty(name)) {
                    return;
                }
                httpFilePath = FileLoader.getInstance(this.currentAccount).getPathToAttach(tLRPC$TL_wallPaper.document, true);
            } else {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                TLRPC$Photo tLRPC$Photo = searchImage.photo;
                if (tLRPC$Photo != null) {
                    TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tLRPC$Photo.sizes, this.maxWallpaperSize, true);
                    File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true);
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
                DownloadController.getInstance(this.currentAccount).removeLoadingFileObserver(this);
                this.radialProgress.setProgress(1.0f, z2);
                this.radialProgress.setIcon(6, z, z2);
                return;
            }
            DownloadController.getInstance(this.currentAccount).addLoadingFileObserver(name, null, this);
            FileLoader.getInstance(this.currentAccount).isLoadingFile(name);
            Float fileProgress = ImageLoader.getInstance().getFileProgress(name);
            if (fileProgress != null) {
                this.radialProgress.setProgress(fileProgress.floatValue(), z2);
            } else {
                this.radialProgress.setProgress(0.0f, z2);
            }
            this.radialProgress.setIcon(10, z, z2);
            return;
        }
        this.radialProgress.setIcon(6, z, z2);
    }

    @Override
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        float intensity = this.delegate.getIntensity();
        this.imageReceiver.setBlendMode(null);
        int backgroundColor = this.delegate.getBackgroundColor();
        int backgroundGradientColor1 = this.delegate.getBackgroundGradientColor1();
        int backgroundGradientColor2 = this.delegate.getBackgroundGradientColor2();
        int backgroundGradientColor3 = this.delegate.getBackgroundGradientColor3();
        int backgroundGradientAngle = this.delegate.getBackgroundGradientAngle();
        int checkColor = this.delegate.getCheckColor();
        if (backgroundGradientColor1 != 0) {
            if (this.gradientShader == null || backgroundColor != this.currentBackgroundColor || backgroundGradientColor1 != this.currentGradientColor1 || backgroundGradientColor2 != this.currentGradientColor2 || backgroundGradientColor3 != this.currentGradientColor3 || backgroundGradientAngle != this.currentGradientAngle) {
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
                            this.imageReceiver.setColorFilter(new PorterDuffColorFilter(this.delegate.getPatternColor(), PorterDuff.Mode.SRC_IN));
                        }
                    }
                } else {
                    Rect gradientPoints = BackgroundGradientDrawable.getGradientPoints(backgroundGradientAngle, getMeasuredWidth(), getMeasuredHeight());
                    this.gradientShader = new LinearGradient(gradientPoints.left, gradientPoints.top, gradientPoints.right, gradientPoints.bottom, new int[]{backgroundColor, backgroundGradientColor1}, (float[]) null, Shader.TileMode.CLAMP);
                    this.backgroundDrawable = null;
                    this.imageReceiver.setGradientBitmap(null);
                }
            }
        } else {
            this.gradientShader = null;
            this.backgroundDrawable = null;
            this.imageReceiver.setGradientBitmap(null);
        }
        MotionBackgroundDrawable motionBackgroundDrawable3 = this.backgroundDrawable;
        if (motionBackgroundDrawable3 != null) {
            motionBackgroundDrawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.backgroundDrawable.draw(canvas);
        } else {
            this.backgroundPaint.setShader(this.gradientShader);
            if (this.gradientShader == null) {
                this.backgroundPaint.setColor(backgroundColor);
            }
            this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(this.rect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.backgroundPaint);
        }
        super.onDraw(canvas);
        if (this.radialProgress.getIcon() != 4) {
            this.radialProgress.setColors(checkColor, checkColor, -1, -1);
            this.radialProgress.draw(canvas);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
    }

    @Override
    public void onFailedDownload(String str, boolean z) {
        TLRPC$TL_wallPaper selectedPattern = this.delegate.getSelectedPattern();
        TLRPC$TL_wallPaper tLRPC$TL_wallPaper = this.currentPattern;
        if ((tLRPC$TL_wallPaper == null && selectedPattern == null) || !(selectedPattern == null || tLRPC$TL_wallPaper == null || tLRPC$TL_wallPaper.id != selectedPattern.id)) {
            if (z) {
                this.radialProgress.setIcon(4, false, true);
            } else {
                updateButtonState(tLRPC$TL_wallPaper, true, z);
            }
        }
    }

    @Override
    public void onSuccessDownload(String str) {
        this.radialProgress.setProgress(1.0f, true);
        TLRPC$TL_wallPaper selectedPattern = this.delegate.getSelectedPattern();
        TLRPC$TL_wallPaper tLRPC$TL_wallPaper = this.currentPattern;
        if ((tLRPC$TL_wallPaper == null && selectedPattern == null) || !(selectedPattern == null || tLRPC$TL_wallPaper == null || tLRPC$TL_wallPaper.id != selectedPattern.id)) {
            updateButtonState(tLRPC$TL_wallPaper, false, true);
        }
    }

    @Override
    public void onProgressDownload(String str, long j, long j2) {
        this.radialProgress.setProgress(Math.min(1.0f, ((float) j) / ((float) j2)), true);
        TLRPC$TL_wallPaper selectedPattern = this.delegate.getSelectedPattern();
        TLRPC$TL_wallPaper tLRPC$TL_wallPaper = this.currentPattern;
        if (!((tLRPC$TL_wallPaper == null && selectedPattern == null) || !(selectedPattern == null || tLRPC$TL_wallPaper == null || tLRPC$TL_wallPaper.id != selectedPattern.id)) || this.radialProgress.getIcon() == 10) {
            return;
        }
        updateButtonState(this.currentPattern, false, true);
    }

    @Override
    public int getObserverTag() {
        return this.TAG;
    }
}

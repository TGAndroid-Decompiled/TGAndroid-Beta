package org.telegram.ui.Stories.recorder;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.zxing.common.detector.MathUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda6;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.wallpaper.WallpaperBitmapHolder;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatBackgroundDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MotionBackgroundDrawable;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.Components.PhotoFilterView;
import org.telegram.ui.Components.VideoEditTextureView;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichTableCell$$ExternalSyntheticLambda3;
import org.telegram.ui.web.MHTML;

public abstract class PreviewView extends FrameLayout {
    public static final int $r8$clinit = 0;
    public boolean allowCropping;
    public boolean allowRotation;
    public boolean allowWithSingleTouch;
    public float angle;
    public VideoPlayer audioPlayer;
    public Bitmap bitmap;
    public final Rect bitmapDst;
    public final Paint bitmapPaint;
    public final Rect bitmapSrc;
    public final BlurringShader.BlurManager blurManager;
    public CollageLayoutView2 collage;
    public CropEditor cropEditorDrawing;
    public float cx;
    public float cy;
    public boolean draw;
    public boolean drawForThemeToggle;
    public StoryEntry entry;
    public TextureView filterTextureView;
    public final Matrix finalMatrix;
    public int gradientBottom;
    public final Paint gradientPaint;
    public int gradientTop;
    public StoryRecorder$$ExternalSyntheticLambda5 invalidateBlur;
    public final Matrix invertMatrix;
    public boolean isMuted;
    public long lastPos;
    public final PointF lastTouch;
    public float lastTouchDistance;
    public double lastTouchRotation;
    public Drawable lastWallpaperDrawable;
    public final Matrix matrix;
    public boolean moving;
    public boolean multitouch;
    public StoryRecorder$$ExternalSyntheticLambda5 onErrorListener;
    public Runnable onTap;
    public final HashSet pauseLinks;
    public PhotoFilterView photoFilterView;
    public float rotationDiff;
    public VideoPlayer roundPlayer;
    public RoundView roundView;
    public long seekedLastTime;
    public boolean snappedRotation;
    public long tapTime;
    public VideoEditTextureView textureView;
    public final TextureViewHolder textureViewHolder;
    public final AnimatedFloat thumbAlpha;
    public TimelineView timelineView;
    public final PointF touch;
    public final Matrix touchMatrix;
    public final Matrix transformBackMatrix;
    public final Matrix transformMatrix;
    public final PreviewView$$ExternalSyntheticLambda1 updateAudioProgressRunnable;
    public final PreviewView$$ExternalSyntheticLambda1 updateProgressRunnable;
    public final PreviewView$$ExternalSyntheticLambda1 updateRoundProgressRunnable;
    public final float[] vertices;
    public int videoHeight;
    public VideoPlayer videoPlayer;
    public int videoWidth;
    public Drawable wallpaperDrawable;
    public final AnimatedFloat wallpaperDrawableCrossfade;

    public final class AnonymousClass3 implements VideoPlayer.VideoPlayerDelegate {
        public final StoryEntry val$entry;
        public final Runnable[] val$whenReadyFinal;

        public AnonymousClass3(StoryEntry storyEntry, Runnable[] runnableArr) {
            this.val$entry = storyEntry;
            this.val$whenReadyFinal = runnableArr;
        }

        @Override
        public final void onError(VideoPlayer videoPlayer, Exception exc) {
            StoryRecorder$$ExternalSyntheticLambda5 storyRecorder$$ExternalSyntheticLambda5 = PreviewView.this.onErrorListener;
            if (storyRecorder$$ExternalSyntheticLambda5 != null) {
                storyRecorder$$ExternalSyntheticLambda5.run();
            }
        }

        @Override
        public final void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onRenderedFirstFrame(this, eventTime);
        }

        @Override
        public final void onSeekFinished(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
        }

        @Override
        public final void onSeekStarted(AnalyticsListener.EventTime eventTime) {
            VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
        }

        @Override
        public final void onStateChanged(boolean z, int i) {
            PreviewView previewView = PreviewView.this;
            VideoPlayer videoPlayer = previewView.videoPlayer;
            if (videoPlayer == null) {
                return;
            }
            boolean zIsPlaying = videoPlayer.isPlaying();
            PreviewView$$ExternalSyntheticLambda1 previewView$$ExternalSyntheticLambda1 = previewView.updateProgressRunnable;
            if (zIsPlaying) {
                AndroidUtilities.runOnUIThread(previewView$$ExternalSyntheticLambda1);
            } else {
                AndroidUtilities.cancelRunOnUIThread(previewView$$ExternalSyntheticLambda1);
            }
        }

        @Override
        public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
            return VideoPlayer.VideoPlayerDelegate.CC.$default$onSurfaceDestroyed(this, surfaceTexture);
        }

        @Override
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            PreviewView.this.invalidateTextureViewHolder();
        }

        @Override
        public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
            PreviewView previewView = PreviewView.this;
            StoryEntry storyEntry = this.val$entry;
            if (storyEntry != null) {
                storyEntry.hdrInfo = previewView.videoPlayer.getHDRStaticInfo(storyEntry.hdrInfo);
                VideoEditTextureView videoEditTextureView = previewView.textureView;
                if (videoEditTextureView != null) {
                    videoEditTextureView.setHDRInfo(storyEntry.hdrInfo);
                }
            }
            int i4 = (int) (i * f);
            previewView.videoWidth = i4;
            int i5 = (int) (i2 * f);
            previewView.videoHeight = i5;
            if (storyEntry != null && (storyEntry.width != i4 || storyEntry.height != i5)) {
                storyEntry.width = i4;
                storyEntry.height = i5;
                storyEntry.setupMatrix();
            }
            previewView.applyMatrix();
            VideoEditTextureView videoEditTextureView2 = previewView.textureView;
            if (videoEditTextureView2 != null) {
                videoEditTextureView2.setVideoSize(previewView.videoWidth, previewView.videoHeight);
            }
        }

        @Override
        public final void onRenderedFirstFrame() {
            PreviewView previewView = PreviewView.this;
            TextureViewHolder textureViewHolder = previewView.textureViewHolder;
            if (textureViewHolder != null && textureViewHolder.active) {
                int i = previewView.videoWidth;
                int i2 = previewView.videoHeight;
                textureViewHolder.textureViewActive = true;
                textureViewHolder.videoWidth = i;
                textureViewHolder.videoHeight = i2;
                GiftSheet$$ExternalSyntheticLambda8 giftSheet$$ExternalSyntheticLambda8 = textureViewHolder.whenTextureViewActive;
                if (giftSheet$$ExternalSyntheticLambda8 != null) {
                    giftSheet$$ExternalSyntheticLambda8.run(Integer.valueOf(i), Integer.valueOf(textureViewHolder.videoHeight));
                }
            }
            Runnable[] runnableArr = this.val$whenReadyFinal;
            Runnable runnable = runnableArr[0];
            StoryEntry storyEntry = this.val$entry;
            if (runnable == null) {
                VideoEditTextureView videoEditTextureView = previewView.textureView;
                if (videoEditTextureView != null) {
                    TextureViewHolder textureViewHolder2 = previewView.textureViewHolder;
                    if (textureViewHolder2 == null || !textureViewHolder2.active) {
                        videoEditTextureView.animate().alpha(1.0f).setDuration(180L).withEndAction(new StoryViewer$5$$ExternalSyntheticLambda0(25, this, storyEntry)).start();
                        return;
                    }
                    return;
                }
                return;
            }
            previewView.post(runnable);
            runnableArr[0] = null;
            Bitmap bitmap = previewView.bitmap;
            if (bitmap != null) {
                bitmap.recycle();
                if (storyEntry.blurredVideoThumb == previewView.bitmap) {
                    storyEntry.blurredVideoThumb = null;
                }
                previewView.bitmap = null;
                previewView.invalidate();
            }
        }
    }

    public final class TextureViewHolder {
        public boolean active;
        public VideoEditTextureView textureView;
        public boolean textureViewActive;
        public int videoHeight;
        public int videoWidth;
        public GiftSheet$$ExternalSyntheticLambda8 whenTextureViewActive;
        public DialogCell$$ExternalSyntheticLambda6 whenTextureViewReceived;
    }

    public PreviewView(Activity activity, BlurringShader.BlurManager blurManager, TextureViewHolder textureViewHolder) {
        super(activity);
        this.bitmapSrc = new Rect();
        this.bitmapDst = new Rect();
        Paint paint = new Paint(1);
        this.updateProgressRunnable = new PreviewView$$ExternalSyntheticLambda1(this, 1);
        this.updateAudioProgressRunnable = new PreviewView$$ExternalSyntheticLambda1(this, 2);
        this.updateRoundProgressRunnable = new PreviewView$$ExternalSyntheticLambda1(this, 3);
        this.wallpaperDrawableCrossfade = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.bitmapPaint = new Paint(7);
        this.gradientPaint = new Paint(1);
        this.matrix = new Matrix();
        this.vertices = new float[2];
        this.draw = true;
        this.thumbAlpha = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT);
        this.drawForThemeToggle = false;
        this.invertMatrix = new Matrix();
        this.transformMatrix = new Matrix();
        this.transformBackMatrix = new Matrix();
        this.allowCropping = true;
        this.lastTouch = new PointF();
        this.touch = new PointF();
        this.touchMatrix = new Matrix();
        this.finalMatrix = new Matrix();
        this.pauseLinks = new HashSet();
        this.blurManager = blurManager;
        this.textureViewHolder = textureViewHolder;
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(3.0f), 0.0f, AndroidUtilities.dp(1.0f), 1073741824);
    }

    public static Drawable getBackgroundDrawable(Drawable drawable, int i, long j, boolean z) {
        TLRPC.WallPaper wallPaper = null;
        if (j == Long.MIN_VALUE) {
            return null;
        }
        if (j >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(j);
            if (userFull != null) {
                wallPaper = userFull.wallpaper;
            }
        } else {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i).getChatFull(-j);
            if (chatFull != null) {
                wallPaper = chatFull.wallpaper;
            }
        }
        return getBackgroundDrawable(drawable, i, wallPaper, z);
    }

    public static Drawable getBackgroundDrawableFromTheme(final EmojiThemes emojiThemes, int i, final boolean z) {
        if (emojiThemes.isAnyStub()) {
            Theme.createBackgroundDrawable(EmojiThemes.getDefaultThemeInfo(z), emojiThemes.getPreviewColors(i, z ? 1 : 0), ((EmojiThemes.ThemeItem) emojiThemes.items.get(z ? 1 : 0)).wallpaperLink, 0, false);
            return new ColorDrawable(-16777216);
        }
        SparseIntArray previewColors = emojiThemes.getPreviewColors(i, z ? 1 : 0);
        int i2 = Theme.key_chat_wallpaper;
        int i3 = previewColors.get(i2, Theme.getColor(null, i2, false));
        int i4 = Theme.key_chat_wallpaper_gradient_to1;
        int i5 = previewColors.get(i4, Theme.getColor(null, i4, false));
        int i6 = Theme.key_chat_wallpaper_gradient_to2;
        int i7 = previewColors.get(i6, Theme.getColor(null, i6, false));
        int i8 = Theme.key_chat_wallpaper_gradient_to3;
        int i9 = previewColors.get(i8, Theme.getColor(null, i8, false));
        final MotionBackgroundDrawable motionBackgroundDrawable = new MotionBackgroundDrawable();
        motionBackgroundDrawable.isPreview = false;
        motionBackgroundDrawable.setPatternBitmap(emojiThemes.getWallpaper(z ? 1 : 0).settings.intensity);
        motionBackgroundDrawable.setColors(i3, i5, i7, i9, 0, true);
        motionBackgroundDrawable.setPhase(0);
        final int patternColor = motionBackgroundDrawable.getPatternColor();
        emojiThemes.loadWallpaper(z ? 1 : 0, new ResultCallback() {
            @Override
            public final void onComplete(Object obj) {
                Pair pair = (Pair) obj;
                if (pair == null) {
                    return;
                }
                long jLongValue = ((Long) pair.first).longValue();
                Bitmap bitmap = ((WallpaperBitmapHolder) pair.second).bitmap;
                EmojiThemes emojiThemes2 = emojiThemes;
                if (jLongValue != ((EmojiThemes.ThemeItem) emojiThemes2.items.get(z ? 1 : 0)).getThemeId() || bitmap == null) {
                    return;
                }
                int i10 = emojiThemes2.getWallpaper(z ? 1 : 0).settings.intensity;
                MotionBackgroundDrawable motionBackgroundDrawable2 = motionBackgroundDrawable;
                motionBackgroundDrawable2.setPatternBitmap(i10, bitmap);
                motionBackgroundDrawable2.setPatternColorFilter(patternColor);
                motionBackgroundDrawable2.setPatternAlpha(1.0f);
            }

            @Override
            public final void onError(Throwable th) {
                ResultCallback.CC.$default$onError(this, th);
            }

            @Override
            public final void onError(TLRPC.TL_error tL_error) {
                ResultCallback.CC.$default$onError(this, tL_error);
            }
        });
        return motionBackgroundDrawable;
    }

    private void setupCollage(StoryEntry storyEntry) {
        TimelineView timelineView = this.timelineView;
        if (timelineView != null) {
            timelineView.setCollage(storyEntry != null ? storyEntry.collageContent : null);
        }
    }

    private void setupImage(StoryEntry storyEntry) {
        Utilities.searchQueue.postRunnable(new StoryViewer$5$$ExternalSyntheticLambda0(24, this, storyEntry));
    }

    public abstract void applyMatrix();

    public final void checkVolumes() {
        float f;
        float f2;
        StoryEntry storyEntry;
        VideoPlayer videoPlayer = this.videoPlayer;
        float f3 = 0.0f;
        if (videoPlayer != null) {
            if (this.isMuted || ((storyEntry = this.entry) != null && storyEntry.muted)) {
                f2 = 0.0f;
            } else {
                f2 = storyEntry != null ? storyEntry.videoVolume : 1.0f;
            }
            videoPlayer.setVolume(f2);
        }
        VideoPlayer videoPlayer2 = this.roundPlayer;
        if (videoPlayer2 != null) {
            if (this.isMuted) {
                f = 0.0f;
            } else {
                StoryEntry storyEntry2 = this.entry;
                f = storyEntry2 != null ? storyEntry2.roundVolume : 1.0f;
            }
            videoPlayer2.setVolume(f);
        }
        VideoPlayer videoPlayer3 = this.audioPlayer;
        if (videoPlayer3 != null) {
            if (!this.isMuted) {
                StoryEntry storyEntry3 = this.entry;
                f3 = storyEntry3 != null ? storyEntry3.audioVolume : 1.0f;
            }
            videoPlayer3.setVolume(f3);
        }
        CollageLayoutView2 collageLayoutView2 = this.collage;
        if (collageLayoutView2 != null) {
            collageLayoutView2.setMuted(this.isMuted);
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.wallpaperDrawable != null) {
            if (this.drawForThemeToggle) {
                Path path = new Path();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
                canvas.save();
                canvas.clipPath(path);
            }
            Drawable drawable = this.wallpaperDrawable;
            float f = ((drawable instanceof MotionBackgroundDrawable) && ((MotionBackgroundDrawable) drawable).getPatternBitmap() == null) ? 0.0f : this.wallpaperDrawableCrossfade.set(1.0f);
            Drawable drawable2 = this.lastWallpaperDrawable;
            if (drawable2 != null && f < 1.0f) {
                drawable2.setAlpha((int) ((1.0f - f) * 255.0f));
                StoryEntry.drawBackgroundDrawable(canvas, this.lastWallpaperDrawable, getWidth(), getHeight());
            }
            this.wallpaperDrawable.setAlpha((int) (f * 255.0f));
            StoryEntry.drawBackgroundDrawable(canvas, this.wallpaperDrawable, getWidth(), getHeight());
            if (this.drawForThemeToggle) {
                canvas.restore();
            }
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.gradientPaint);
        }
        CropEditor cropEditor = this.cropEditorDrawing;
        if (cropEditor != null) {
            cropEditor.contentView.drawImage(canvas2, true);
        } else if (this.draw && this.entry != null && !isCollage()) {
            float f2 = this.thumbAlpha.set(this.bitmap == null);
            if (this.bitmap != null) {
                canvas2.save();
                canvas2.scale(getWidth() / this.entry.resultWidth, getHeight() / this.entry.resultHeight);
                canvas2.concat(this.entry.matrix);
                StoryEntry storyEntry = this.entry;
                if (storyEntry.crop != null) {
                    canvas2.translate(storyEntry.width / 2.0f, storyEntry.height / 2.0f);
                    canvas2.rotate(-this.entry.orientation);
                    StoryEntry storyEntry2 = this.entry;
                    int i = storyEntry2.width;
                    int i2 = storyEntry2.height;
                    int i3 = storyEntry2.orientation;
                    MediaController.CropState cropState = storyEntry2.crop;
                    if (((i3 + cropState.transformRotation) / 90) % 2 != 1) {
                        i2 = i;
                        i = i2;
                    }
                    float f3 = cropState.cropPw;
                    float f4 = cropState.cropPh;
                    float f5 = i2;
                    float f6 = i;
                    canvas2.clipRect(((-i2) * f3) / 2.0f, ((-i) * f4) / 2.0f, (f3 * f5) / 2.0f, (f4 * f6) / 2.0f);
                    float f7 = this.entry.crop.cropScale;
                    canvas2.scale(f7, f7);
                    MediaController.CropState cropState2 = this.entry.crop;
                    canvas2.translate(cropState2.cropPx * f5, cropState2.cropPy * f6);
                    MediaController.CropState cropState3 = this.entry.crop;
                    canvas2.rotate(cropState3.cropRotate + cropState3.transformRotation);
                    if (this.entry.crop.mirrored) {
                        canvas2.scale(-1.0f, 1.0f);
                    }
                    canvas2.rotate(this.entry.orientation);
                    StoryEntry storyEntry3 = this.entry;
                    canvas2.translate((-storyEntry3.width) / 2.0f, (-storyEntry3.height) / 2.0f);
                }
                Paint paint = this.bitmapPaint;
                paint.setAlpha((int) ((1.0f - f2) * 255.0f));
                int width = this.bitmap.getWidth();
                int height = this.bitmap.getHeight();
                Rect rect = this.bitmapSrc;
                rect.set(0, 0, width, height);
                StoryEntry storyEntry4 = this.entry;
                int i4 = storyEntry4.width;
                int i5 = storyEntry4.height;
                Rect rect2 = this.bitmapDst;
                rect2.set(0, 0, i4, i5);
                canvas2.drawBitmap(this.bitmap, rect, rect2, paint);
                canvas2.restore();
            }
        }
        super.dispatchDraw(canvas2);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        boolean z = touchEvent(motionEvent);
        StoryRecorder storyRecorder = StoryRecorder.this;
        StoryRecorder.AnonymousClass8 anonymousClass8 = storyRecorder.captionEdit;
        boolean z2 = ((anonymousClass8 == null || !anonymousClass8.recording) ? storyRecorder.photoFilterEnhanceView.onTouch(motionEvent) : false) || z;
        if (motionEvent.getAction() == 0) {
            this.tapTime = System.currentTimeMillis();
        } else if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.tapTime <= ViewConfiguration.getTapTimeout() && (runnable = this.onTap) != null) {
                runnable.run();
            }
            this.tapTime = 0L;
        } else if (motionEvent.getAction() == 3) {
            this.tapTime = 0L;
        }
        if (!z2) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getPointerCount() <= 1) {
            super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        StoryEntry storyEntry;
        StoryEntry storyEntry2;
        VideoEditTextureView videoEditTextureView = this.textureView;
        if (view == videoEditTextureView && (storyEntry2 = this.entry) != null && storyEntry2.isRepostMessage) {
            return false;
        }
        if ((view != videoEditTextureView && view != this.filterTextureView) || (storyEntry = this.entry) == null || storyEntry.crop == null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.scale(getWidth() / this.entry.resultWidth, getHeight() / this.entry.resultHeight);
        canvas.concat(this.entry.matrix);
        StoryEntry storyEntry3 = this.entry;
        if (storyEntry3.crop != null) {
            canvas.translate(storyEntry3.width / 2.0f, storyEntry3.height / 2.0f);
            canvas.rotate(-this.entry.orientation);
            StoryEntry storyEntry4 = this.entry;
            int i = storyEntry4.width;
            int i2 = storyEntry4.height;
            int i3 = storyEntry4.orientation;
            MediaController.CropState cropState = storyEntry4.crop;
            if (((i3 + cropState.transformRotation) / 90) % 2 == 1) {
                i2 = i;
                i = i2;
            }
            float f = cropState.cropPw;
            float f2 = cropState.cropPh;
            canvas.clipRect(((-i) * f) / 2.0f, ((-i2) * f2) / 2.0f, (i * f) / 2.0f, (i2 * f2) / 2.0f);
            canvas.rotate(this.entry.orientation);
            StoryEntry storyEntry5 = this.entry;
            canvas.translate((-storyEntry5.width) / 2.0f, (-storyEntry5.height) / 2.0f);
        }
        canvas.concat(this.invertMatrix);
        canvas.scale(1.0f / (getWidth() / this.entry.resultWidth), 1.0f / (getHeight() / this.entry.resultHeight));
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    public final void extractPointsData(Matrix matrix) {
        StoryEntry storyEntry = this.entry;
        if (storyEntry == null) {
            return;
        }
        float f = storyEntry.width / 2.0f;
        float[] fArr = this.vertices;
        fArr[0] = f;
        fArr[1] = storyEntry.height / 2.0f;
        matrix.mapPoints(fArr);
        this.cx = fArr[0];
        this.cy = fArr[1];
        StoryEntry storyEntry2 = this.entry;
        fArr[0] = storyEntry2.width;
        fArr[1] = storyEntry2.height / 2.0f;
        matrix.mapPoints(fArr);
        this.angle = (float) Math.toDegrees(Math.atan2(fArr[1] - this.cy, fArr[0] - this.cx));
        MathUtils.distance(this.cx, this.cy, fArr[0], fArr[1]);
        StoryEntry storyEntry3 = this.entry;
        fArr[0] = storyEntry3.width / 2.0f;
        fArr[1] = storyEntry3.height;
        matrix.mapPoints(fArr);
        MathUtils.distance(this.cx, this.cy, fArr[0], fArr[1]);
    }

    public int getContentHeight() {
        StoryEntry storyEntry = this.entry;
        if (storyEntry == null) {
            return 1;
        }
        return storyEntry.height;
    }

    public int getContentWidth() {
        StoryEntry storyEntry = this.entry;
        if (storyEntry == null) {
            return 1;
        }
        return storyEntry.width;
    }

    public final void getCoverBitmap(Utilities.Callback callback, View... viewArr) {
        VideoEditTextureView videoEditTextureView;
        int iDp = (int) (AndroidUtilities.dp(26.0f) * AndroidUtilities.density);
        int iDp2 = (int) (AndroidUtilities.dp(30.33f) * AndroidUtilities.density);
        int iDp3 = (int) (AndroidUtilities.dp(4.0f) * AndroidUtilities.density);
        Bitmap[] bitmapArr = new Bitmap[viewArr.length];
        for (int i = 0; i < viewArr.length; i++) {
            View view = viewArr[i];
            if (view != null && view.getWidth() >= 0 && viewArr[i].getHeight() > 0) {
                View view2 = viewArr[i];
                if (view2 == this && (videoEditTextureView = this.textureView) != null) {
                    bitmapArr[i] = videoEditTextureView.getBitmap();
                } else if (view2 instanceof TextureView) {
                    bitmapArr[i] = ((TextureView) view2).getBitmap();
                } else if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0) {
                    bitmapArr[i] = Bitmap.createBitmap(iDp, iDp2, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapArr[i]);
                    canvas.save();
                    float fMax = Math.max(iDp / viewArr[i].getWidth(), iDp2 / viewArr[i].getHeight());
                    canvas.scale(fMax, fMax);
                    viewArr[i].draw(canvas);
                    canvas.restore();
                }
            }
        }
        Utilities.globalQueue.postRunnable(new MessagesStorage$$ExternalSyntheticLambda6(iDp, iDp2, iDp3, bitmapArr, callback));
    }

    public long getCurrentPosition() {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            return videoPlayer.getCurrentPosition();
        }
        VideoPlayer videoPlayer2 = this.roundPlayer;
        if (videoPlayer2 != null) {
            return videoPlayer2.getCurrentPosition();
        }
        VideoPlayer videoPlayer3 = this.audioPlayer;
        if (videoPlayer3 != null) {
            return videoPlayer3.getCurrentPosition();
        }
        return 0L;
    }

    public long getDuration() {
        StoryEntry storyEntry = this.entry;
        if (storyEntry != null) {
            double d = storyEntry.fileDuration;
            if (d >= 0.0d) {
                return (long) (d * 1000.0d);
            }
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer == null || videoPlayer.getDuration() == -9223372036854775807L) {
            return 1L;
        }
        return this.videoPlayer.getDuration();
    }

    public int getOrientation() {
        StoryEntry storyEntry = this.entry;
        if (storyEntry == null) {
            return 0;
        }
        return storyEntry.orientation;
    }

    public Pair<Integer, Integer> getPaintSize() {
        return this.entry == null ? new Pair<>(1080, 1920) : new Pair<>(Integer.valueOf(this.entry.resultWidth), Integer.valueOf(this.entry.resultHeight));
    }

    public Bitmap getPhotoBitmap() {
        return this.bitmap;
    }

    public VideoEditTextureView getTextureView() {
        return this.textureView;
    }

    public abstract void invalidateTextureViewHolder();

    public final boolean isCollage() {
        StoryEntry storyEntry;
        return (this.collage == null || (storyEntry = this.entry) == null || !storyEntry.isCollage()) ? false : true;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.allowCropping) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        touchEvent(motionEvent);
        return true;
    }

    public final void preset(StoryEntry storyEntry) {
        this.entry = storyEntry;
        if (storyEntry == null) {
            setupImage(null);
            setupWallpaper(null);
            this.gradientPaint.setShader(null);
            setupAudio(false, null);
            setupRound(null, null, false);
            return;
        }
        if (storyEntry.isVideo) {
            setupImage(storyEntry);
            if (storyEntry.gradientTopColor == 0 && storyEntry.gradientBottomColor == 0) {
                storyEntry.setupGradient(new PreviewView$$ExternalSyntheticLambda12((StoryRecorder.AnonymousClass7) this, 0));
            } else {
                setupGradient();
            }
        } else {
            setupImage(storyEntry);
            setupGradient();
        }
        applyMatrix();
        setupWallpaper(storyEntry);
        setupAudio(false, storyEntry);
        setupRound(storyEntry, null, false);
    }

    public final void seekTo(long j) {
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.seekTo(j, false);
        } else if (isCollage()) {
            this.collage.seekTo(j, false);
        } else {
            VideoPlayer videoPlayer2 = this.roundPlayer;
            if (videoPlayer2 != null) {
                videoPlayer2.seekTo(j, false);
            } else {
                VideoPlayer videoPlayer3 = this.audioPlayer;
                if (videoPlayer3 != null) {
                    videoPlayer3.seekTo(j, false);
                }
            }
        }
        updateAudioPlayer(true);
        updateRoundPlayer(true);
    }

    public void set(StoryEntry storyEntry) {
        set(storyEntry, null, 0L);
    }

    public void setAllowCropping(boolean z) {
        this.allowCropping = z;
    }

    public void setCollageView(CollageLayoutView2 collageLayoutView2) {
        this.collage = collageLayoutView2;
    }

    public void setCropEditorDrawing(CropEditor cropEditor) {
        if (this.cropEditorDrawing != cropEditor) {
            this.cropEditorDrawing = cropEditor;
            invalidate();
        }
    }

    public void setDraw(boolean z) {
        this.draw = z;
        invalidate();
    }

    public void setOnTapListener(Runnable runnable) {
        this.onTap = runnable;
    }

    public void setVideoTimelineView(TimelineView timelineView) {
        this.timelineView = timelineView;
        if (timelineView != null) {
            timelineView.setDelegate(new RichEditor.AnonymousClass3(this));
        }
    }

    @Override
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8) {
            set(null);
        }
    }

    public final void setupAudio(boolean z, StoryEntry storyEntry) {
        boolean z2;
        VideoPlayer videoPlayer = this.audioPlayer;
        if (videoPlayer != null) {
            videoPlayer.pause();
            this.audioPlayer.releasePlayer(true);
            this.audioPlayer = null;
        }
        if (storyEntry == null) {
            return;
        }
        TimelineView timelineView = this.timelineView;
        if (timelineView != null) {
            String str = storyEntry.audioPath;
            String str2 = storyEntry.audioAuthor;
            String str3 = storyEntry.audioTitle;
            long j = storyEntry.audioDuration;
            long j2 = storyEntry.audioOffset;
            float f = storyEntry.audioLeft;
            float f2 = storyEntry.audioRight;
            float f3 = storyEntry.audioVolume;
            if (!TextUtils.equals(timelineView.audioPath, str)) {
                TimelineView.AudioWaveformLoader audioWaveformLoader = timelineView.waveform;
                if (audioWaveformLoader != null) {
                    audioWaveformLoader.destroy();
                    timelineView.waveform = null;
                    timelineView.waveformIsLoaded = false;
                }
                timelineView.audioPath = str;
                timelineView.setupAudioWaveform();
            }
            timelineView.audioPath = str;
            boolean zIsEmpty = TextUtils.isEmpty(str);
            timelineView.hasAudio = !zIsEmpty;
            if (zIsEmpty) {
                timelineView.audioSelected = false;
                str2 = null;
                str3 = null;
            }
            String str4 = TextUtils.isEmpty(str2) ? null : str2;
            if (TextUtils.isEmpty(str3)) {
                str3 = null;
            }
            if (timelineView.hasAudio) {
                timelineView.audioDuration = j;
                timelineView.audioOffset = j2 - ((long) (j * f));
                timelineView.audioLeft = f;
                timelineView.audioRight = f2;
                timelineView.audioVolume = f3;
                if (str4 != null) {
                    StaticLayout staticLayout = new StaticLayout(str4, timelineView.audioAuthorPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    timelineView.audioAuthor = staticLayout;
                    timelineView.audioAuthorWidth = staticLayout.getLineCount() > 0 ? timelineView.audioAuthor.getLineWidth(0) : 0.0f;
                    timelineView.audioAuthorLeft = timelineView.audioAuthor.getLineCount() > 0 ? timelineView.audioAuthor.getLineLeft(0) : 0.0f;
                } else {
                    timelineView.audioAuthorWidth = 0.0f;
                    timelineView.audioAuthor = null;
                }
                if (str3 != null) {
                    StaticLayout staticLayout2 = new StaticLayout(str3, timelineView.audioTitlePaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    timelineView.audioTitle = staticLayout2;
                    timelineView.audioTitleWidth = staticLayout2.getLineCount() > 0 ? timelineView.audioTitle.getLineWidth(0) : 0.0f;
                    timelineView.audioTitleLeft = timelineView.audioTitle.getLineCount() > 0 ? timelineView.audioTitle.getLineLeft(0) : 0.0f;
                } else {
                    timelineView.audioTitleWidth = 0.0f;
                    timelineView.audioTitle = null;
                }
            }
            if (z) {
                z2 = true;
            } else {
                z2 = true;
                timelineView.audioT.set(timelineView.hasAudio, true);
            }
            timelineView.invalidate();
        } else {
            z2 = true;
        }
        if (storyEntry.audioPath != null) {
            VideoPlayer videoPlayer2 = new VideoPlayer();
            this.audioPlayer = videoPlayer2;
            videoPlayer2.allowMultipleInstances = z2;
            videoPlayer2.setDelegate(new VideoPlayer.VideoPlayerDelegate() {
                @Override
                public final void onError(VideoPlayer videoPlayer3, Exception exc) {
                }

                @Override
                public final void onRenderedFirstFrame() {
                }

                @Override
                public final void onSeekFinished(AnalyticsListener.EventTime eventTime) {
                    VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
                }

                @Override
                public final void onSeekStarted(AnalyticsListener.EventTime eventTime) {
                    VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
                }

                @Override
                public final void onStateChanged(boolean z3, int i) {
                    PreviewView previewView = PreviewView.this;
                    AndroidUtilities.cancelRunOnUIThread(previewView.updateAudioProgressRunnable);
                    VideoPlayer videoPlayer3 = previewView.audioPlayer;
                    if (videoPlayer3 == null || !videoPlayer3.isPlaying()) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(previewView.updateAudioProgressRunnable);
                }

                @Override
                public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
                    return VideoPlayer.VideoPlayerDelegate.CC.$default$onSurfaceDestroyed(this, surfaceTexture);
                }

                @Override
                public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    PreviewView.this.invalidateTextureViewHolder();
                }

                @Override
                public final void onVideoSizeChanged(int i, int i2, int i3, float f4) {
                }

                @Override
                public final void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
                    VideoPlayer.VideoPlayerDelegate.CC.$default$onRenderedFirstFrame(this, eventTime);
                }
            });
            this.audioPlayer.preparePlayer(Uri.fromFile(new File(storyEntry.audioPath)), "other");
            checkVolumes();
            if (this.videoPlayer != null && getDuration() > 0) {
                long duration = (long) (storyEntry.left * getDuration());
                this.videoPlayer.seekTo(duration);
                this.timelineView.setProgress(duration);
            }
            updateAudioPlayer(true);
        }
        StoryRecorder storyRecorder = StoryRecorder.this;
        StoryRecorder.AnonymousClass24 anonymousClass24 = storyRecorder.paintView;
        if (anonymousClass24 != null) {
            StoryEntry storyEntry2 = storyRecorder.outputEntry;
            anonymousClass24.setHasAudio((storyEntry2 == null || storyEntry2.audioPath == null) ? false : true);
        }
    }

    public final void setupGradient() {
        if (this.entry == null) {
            return;
        }
        int measuredHeight = getMeasuredHeight() > 0 ? getMeasuredHeight() : AndroidUtilities.displaySize.y;
        StoryEntry storyEntry = this.entry;
        int i = storyEntry.gradientTopColor;
        Paint paint = this.gradientPaint;
        if (i == 0 || storyEntry.gradientBottomColor == 0) {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                new PreviewView$$ExternalSyntheticLambda8(this, measuredHeight, 0).run(DominantColors.getColorsSync(bitmap, true));
            } else {
                paint.setShader(null);
            }
        } else {
            float f = measuredHeight;
            StoryEntry storyEntry2 = this.entry;
            int i2 = storyEntry2.gradientTopColor;
            this.gradientTop = i2;
            int i3 = storyEntry2.gradientBottomColor;
            this.gradientBottom = i3;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, f, new int[]{i2, i3}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            VideoEditTextureView videoEditTextureView = this.textureView;
            if (videoEditTextureView != null) {
                videoEditTextureView.updateUiBlurGradient(this.gradientTop, this.gradientBottom);
            }
            PhotoFilterView photoFilterView = this.photoFilterView;
            if (photoFilterView != null) {
                photoFilterView.updateUiBlurGradient(this.gradientTop, this.gradientBottom);
            }
        }
        invalidate();
    }

    public final void setupRound(StoryEntry storyEntry, RoundView roundView, boolean z) {
        VideoPlayer videoPlayer;
        if (storyEntry == null || storyEntry.round == null) {
            VideoPlayer videoPlayer2 = this.roundPlayer;
            if (videoPlayer2 != null) {
                videoPlayer2.pause();
                this.roundPlayer.releasePlayer(true);
                this.roundPlayer = null;
            }
            TimelineView timelineView = this.timelineView;
            if (timelineView != null) {
                timelineView.setRoundNull(z);
            }
            this.roundView = null;
            AndroidUtilities.cancelRunOnUIThread(this.updateProgressRunnable);
            return;
        }
        VideoPlayer videoPlayer3 = this.roundPlayer;
        if (videoPlayer3 != null) {
            videoPlayer3.releasePlayer(true);
            this.roundPlayer = null;
        }
        VideoPlayer videoPlayer4 = new VideoPlayer();
        this.roundPlayer = videoPlayer4;
        videoPlayer4.allowMultipleInstances = true;
        videoPlayer4.setDelegate(new VideoPlayer.VideoPlayerDelegate() {
            @Override
            public final void onError(VideoPlayer videoPlayer5, Exception exc) {
            }

            @Override
            public final void onRenderedFirstFrame() {
            }

            @Override
            public final void onSeekFinished(AnalyticsListener.EventTime eventTime) {
                VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekFinished(this, eventTime);
            }

            @Override
            public final void onSeekStarted(AnalyticsListener.EventTime eventTime) {
                VideoPlayer.VideoPlayerDelegate.CC.$default$onSeekStarted(this, eventTime);
            }

            @Override
            public final void onStateChanged(boolean z2, int i) {
                PreviewView previewView = PreviewView.this;
                VideoPlayer videoPlayer5 = previewView.roundPlayer;
                if (videoPlayer5 == null) {
                    return;
                }
                boolean zIsPlaying = videoPlayer5.isPlaying();
                PreviewView$$ExternalSyntheticLambda1 previewView$$ExternalSyntheticLambda1 = previewView.updateRoundProgressRunnable;
                if (zIsPlaying) {
                    AndroidUtilities.runOnUIThread(previewView$$ExternalSyntheticLambda1);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(previewView$$ExternalSyntheticLambda1);
                }
            }

            @Override
            public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
                return VideoPlayer.VideoPlayerDelegate.CC.$default$onSurfaceDestroyed(this, surfaceTexture);
            }

            @Override
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                VideoPlayer.VideoPlayerDelegate.CC.$default$onSurfaceTextureUpdated(this, surfaceTexture);
            }

            @Override
            public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
                PreviewView previewView = PreviewView.this;
                previewView.getClass();
                previewView.getClass();
                RoundView roundView2 = previewView.roundView;
                if (roundView2 != null) {
                    float f2 = i / i2;
                    if (Math.abs(roundView2.a - f2) >= 1.0E-4f) {
                        roundView2.a = f2;
                        roundView2.requestLayout();
                    }
                }
            }

            @Override
            public final void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
                VideoPlayer.VideoPlayerDelegate.CC.$default$onRenderedFirstFrame(this, eventTime);
            }
        });
        this.roundPlayer.preparePlayer(Uri.fromFile(storyEntry.round), "other");
        checkVolumes();
        this.roundView = roundView;
        if (roundView != null && (videoPlayer = this.roundPlayer) != null) {
            videoPlayer.setTextureView(roundView.textureView);
        }
        this.timelineView.setRound(storyEntry.round.getAbsolutePath(), storyEntry.roundDuration, storyEntry.roundOffset, storyEntry.roundLeft, storyEntry.roundRight, storyEntry.roundVolume, z);
        updateRoundPlayer(true);
    }

    public final void setupVideoPlayer(StoryEntry storyEntry, RichTableCell$$ExternalSyntheticLambda3 richTableCell$$ExternalSyntheticLambda3, long j) {
        ArrayList arrayList;
        int i = 0;
        if (storyEntry == null || storyEntry.isCollage()) {
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer != null) {
                videoPlayer.pause();
                this.videoPlayer.releasePlayer(true);
                this.videoPlayer = null;
            }
            TextureViewHolder textureViewHolder = this.textureViewHolder;
            if (textureViewHolder == null || !textureViewHolder.active) {
                VideoEditTextureView videoEditTextureView = this.textureView;
                if (videoEditTextureView != null) {
                    videoEditTextureView.clearAnimation();
                    this.textureView.animate().alpha(0.0f).withEndAction(new PreviewView$$ExternalSyntheticLambda1(this, 4)).start();
                }
            } else {
                VideoEditTextureView videoEditTextureView2 = textureViewHolder.textureView;
                if (videoEditTextureView2 != null) {
                    ViewParent parent = videoEditTextureView2.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(textureViewHolder.textureView);
                    }
                    textureViewHolder.textureViewActive = false;
                    textureViewHolder.textureView = null;
                    DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = textureViewHolder.whenTextureViewReceived;
                    if (dialogCell$$ExternalSyntheticLambda6 != null) {
                        dialogCell$$ExternalSyntheticLambda6.run(null);
                    }
                }
            }
            TimelineView timelineView = this.timelineView;
            if (timelineView != null) {
                timelineView.setVideo(false, null, 1L, 0.0f);
            }
            AndroidUtilities.cancelRunOnUIThread(this.updateProgressRunnable);
            if (richTableCell$$ExternalSyntheticLambda3 != null) {
                AndroidUtilities.runOnUIThread(richTableCell$$ExternalSyntheticLambda3);
                return;
            }
            return;
        }
        VideoPlayer videoPlayer2 = this.videoPlayer;
        if (videoPlayer2 != null) {
            videoPlayer2.releasePlayer(true);
            this.videoPlayer = null;
        }
        VideoPlayer videoPlayer3 = new VideoPlayer();
        this.videoPlayer = videoPlayer3;
        videoPlayer3.allowMultipleInstances = true;
        videoPlayer3.setDelegate(new AnonymousClass3(storyEntry, new Runnable[]{richTableCell$$ExternalSyntheticLambda3}));
        VideoEditTextureView videoEditTextureView3 = this.textureView;
        if (videoEditTextureView3 != null) {
            videoEditTextureView3.clearAnimation();
            this.textureView.release();
            removeView(this.textureView);
            this.textureView = null;
        }
        this.textureView = new VideoEditTextureView(getContext(), this.videoPlayer);
        this.blurManager.resetBitmap();
        this.textureView.updateUiBlurManager(storyEntry.isRepostMessage ? null : this.blurManager);
        this.textureView.setOpaque(false);
        applyMatrix();
        TextureViewHolder textureViewHolder2 = this.textureViewHolder;
        if (textureViewHolder2 == null || !textureViewHolder2.active) {
            this.textureView.setAlpha(richTableCell$$ExternalSyntheticLambda3 != null ? 1.0f : 0.0f);
            addView(this.textureView, LayoutHelper.createFrame(-2, -2, 51));
        } else {
            VideoEditTextureView videoEditTextureView4 = this.textureView;
            VideoEditTextureView videoEditTextureView5 = textureViewHolder2.textureView;
            if (videoEditTextureView5 != videoEditTextureView4) {
                if (videoEditTextureView5 != null) {
                    ViewParent parent2 = videoEditTextureView5.getParent();
                    if (parent2 instanceof ViewGroup) {
                        ((ViewGroup) parent2).removeView(textureViewHolder2.textureView);
                    }
                    textureViewHolder2.textureView = null;
                }
                textureViewHolder2.textureViewActive = false;
                textureViewHolder2.textureView = videoEditTextureView4;
                DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda7 = textureViewHolder2.whenTextureViewReceived;
                if (dialogCell$$ExternalSyntheticLambda7 != null) {
                    dialogCell$$ExternalSyntheticLambda7.run(videoEditTextureView4);
                }
            }
        }
        HintView2$$ExternalSyntheticLambda0 hintView2$$ExternalSyntheticLambda0 = new HintView2$$ExternalSyntheticLambda0(this, 7);
        StoryEntry.HDRInfo hDRInfo = storyEntry.hdrInfo;
        if (hDRInfo != null) {
            hintView2$$ExternalSyntheticLambda0.run(hDRInfo);
        } else if (!storyEntry.isVideo || Build.VERSION.SDK_INT < 24) {
            StoryEntry.HDRInfo hDRInfo2 = new StoryEntry.HDRInfo();
            storyEntry.hdrInfo = hDRInfo2;
            hintView2$$ExternalSyntheticLambda0.run(hDRInfo2);
        } else {
            Utilities.globalQueue.postRunnable(new StoryEntry$$ExternalSyntheticLambda1(storyEntry, hintView2$$ExternalSyntheticLambda0, i));
        }
        File file = storyEntry.filterFile;
        if (file == null) {
            file = storyEntry.file;
        }
        this.videoPlayer.preparePlayer(Uri.fromFile(file), "other");
        this.videoPlayer.setPlayWhenReady(this.pauseLinks.isEmpty());
        this.videoPlayer.setLooping(true);
        if (storyEntry.isEditSaved) {
            j = (long) ((storyEntry.left * storyEntry.duration) + j);
        }
        if (j > 0) {
            this.videoPlayer.seekTo(j);
        }
        checkVolumes();
        updateAudioPlayer(true);
        boolean z = storyEntry.isRepostMessage && (arrayList = storyEntry.messageObjects) != null && arrayList.size() == 1 && ((MessageObject) storyEntry.messageObjects.get(0)).type == 5;
        TimelineView timelineView2 = this.timelineView;
        File file2 = storyEntry.filterFile;
        if (file2 == null) {
            file2 = storyEntry.file;
        }
        timelineView2.setVideo(z, file2.getAbsolutePath(), getDuration(), storyEntry.videoVolume);
        this.timelineView.setVideoLeft(storyEntry.left);
        this.timelineView.setVideoRight(storyEntry.right);
        TimelineView timelineView3 = this.timelineView;
        if (timelineView3 == null || j <= 0) {
            return;
        }
        timelineView3.setProgress(j);
    }

    public final void setupWallpaper(StoryEntry storyEntry) {
        Drawable drawable = this.wallpaperDrawable;
        this.lastWallpaperDrawable = drawable;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        if (storyEntry == null) {
            this.wallpaperDrawable = null;
            return;
        }
        long j = storyEntry.backgroundWallpaperPeerId;
        if (j == Long.MIN_VALUE) {
            this.wallpaperDrawable = null;
            return;
        }
        Drawable backgroundDrawable = getBackgroundDrawable(this.wallpaperDrawable, storyEntry.currentAccount, j, storyEntry.isDark);
        storyEntry.backgroundDrawable = backgroundDrawable;
        this.wallpaperDrawable = backgroundDrawable;
        if (this.lastWallpaperDrawable != backgroundDrawable) {
            this.lastWallpaperDrawable = null;
        }
        if (backgroundDrawable != null) {
            backgroundDrawable.setCallback(this);
        }
        BlurringShader.BlurManager blurManager = this.blurManager;
        if (blurManager != null) {
            Drawable drawable2 = this.wallpaperDrawable;
            if (drawable2 == null) {
                blurManager.setFallbackBlur(null, 0);
            } else if (drawable2 instanceof BitmapDrawable) {
                blurManager.setFallbackBlur(((BitmapDrawable) drawable2).getBitmap(), 0);
            } else {
                int intrinsicWidth = drawable2.getIntrinsicWidth();
                int intrinsicHeight = this.wallpaperDrawable.getIntrinsicHeight();
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    intrinsicWidth = 1080;
                    intrinsicHeight = 1920;
                }
                float f = intrinsicWidth;
                float f2 = intrinsicHeight;
                float fMax = Math.max(100.0f / f, 100.0f / f2);
                if (fMax > 1.0f) {
                    intrinsicWidth = (int) (f * fMax);
                    intrinsicHeight = (int) (f2 * fMax);
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                this.wallpaperDrawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
                this.wallpaperDrawable.draw(new Canvas(bitmapCreateBitmap));
                blurManager.setFallbackBlur(bitmapCreateBitmap, 0, true);
            }
        }
        invalidate();
    }

    public final boolean touchEvent(MotionEvent motionEvent) {
        double dAtan2;
        float fDistance;
        if (this.allowCropping) {
            boolean z = motionEvent.getPointerCount() > 1;
            PointF pointF = this.touch;
            if (z) {
                pointF.x = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                pointF.y = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                fDistance = MathUtils.distance(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                dAtan2 = Math.atan2(motionEvent.getY(1) - motionEvent.getY(0), motionEvent.getX(1) - motionEvent.getX(0));
            } else {
                pointF.x = motionEvent.getX(0);
                pointF.y = motionEvent.getY(0);
                dAtan2 = 0.0d;
                fDistance = 0.0f;
            }
            boolean z2 = this.multitouch;
            PointF pointF2 = this.lastTouch;
            if (z2 != z) {
                pointF2.x = pointF.x;
                pointF2.y = pointF.y;
                this.lastTouchDistance = fDistance;
                this.lastTouchRotation = dAtan2;
                this.multitouch = z;
            }
            StoryEntry storyEntry = this.entry;
            if (storyEntry != null) {
                float width = storyEntry.resultWidth / getWidth();
                int actionMasked = motionEvent.getActionMasked();
                Matrix matrix = this.touchMatrix;
                if (actionMasked == 0) {
                    this.rotationDiff = 0.0f;
                    this.snappedRotation = false;
                    invalidate();
                    this.moving = true;
                    matrix.set(this.entry.matrix);
                }
                if (motionEvent.getActionMasked() == 2 && this.moving && this.entry != null) {
                    float f = pointF.x * width;
                    float f2 = pointF.y * width;
                    float f3 = pointF2.x * width;
                    float f4 = pointF2.y * width;
                    if (motionEvent.getPointerCount() > 1) {
                        float f5 = this.lastTouchDistance;
                        if (f5 != 0.0f) {
                            float f6 = fDistance / f5;
                            matrix.postScale(f6, f6, f, f2);
                        }
                        float degrees = (float) Math.toDegrees(dAtan2 - this.lastTouchRotation);
                        float f7 = this.rotationDiff + degrees;
                        this.rotationDiff = f7;
                        if (!this.allowRotation) {
                            boolean z3 = Math.abs(f7) > 20.0f;
                            this.allowRotation = z3;
                            if (!z3) {
                                extractPointsData(matrix);
                                this.allowRotation = (((float) Math.round(this.angle / 90.0f)) * 90.0f) - this.angle > 20.0f;
                            }
                            if (!this.snappedRotation) {
                                AndroidUtilities.vibrateCursor(this);
                                this.snappedRotation = true;
                            }
                        }
                        if (this.allowRotation) {
                            matrix.postRotate(degrees, f, f2);
                        }
                        this.allowWithSingleTouch = true;
                    }
                    if (motionEvent.getPointerCount() > 1 || this.allowWithSingleTouch) {
                        matrix.postTranslate(f - f3, f2 - f4);
                    }
                    Matrix matrix2 = this.finalMatrix;
                    matrix2.set(matrix);
                    Matrix matrix3 = this.matrix;
                    matrix3.set(matrix);
                    extractPointsData(matrix3);
                    float fRound = (Math.round(this.angle / 90.0f) * 90.0f) - this.angle;
                    if (this.allowRotation) {
                        if (Math.abs(fRound) < 3.5f) {
                            matrix2.postRotate(fRound, this.cx, this.cy);
                            if (!this.snappedRotation) {
                                AndroidUtilities.vibrateCursor(this);
                                this.snappedRotation = true;
                            }
                        } else {
                            this.snappedRotation = false;
                        }
                    }
                    this.entry.matrix.set(matrix2);
                    this.entry.editedMedia = true;
                    applyMatrix();
                    invalidate();
                } else {
                    fDistance = fDistance;
                }
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    if (motionEvent.getPointerCount() <= 1) {
                        this.allowWithSingleTouch = false;
                        StoryRecorder storyRecorder = StoryRecorder.this;
                        storyRecorder.previewHighlight.show(true, false, storyRecorder.actionBarContainer);
                        PreviewHighlightView previewHighlightView = storyRecorder.previewHighlight;
                        CharSequence text = storyRecorder.captionEdit.getText();
                        previewHighlightView.getClass();
                        previewHighlightView.storyCaptionView.captionTextview.setText(AnimatedEmojiSpan.cloneSpans(new SpannableString(text)), null, null, false, false);
                    }
                    this.moving = false;
                    this.allowRotation = false;
                    this.rotationDiff = 0.0f;
                    this.snappedRotation = false;
                    invalidate();
                }
                pointF2.x = pointF.x;
                pointF2.y = pointF.y;
                this.lastTouchDistance = fDistance;
                this.lastTouchRotation = dAtan2;
                return true;
            }
        }
        return false;
    }

    public final void updateAudioPlayer(boolean z) {
        long currentPosition;
        boolean zIsPlaying;
        boolean z2;
        if (this.audioPlayer == null || this.entry == null) {
            return;
        }
        if (this.videoPlayer == null && this.roundPlayer == null && !isCollage()) {
            this.audioPlayer.setPlayWhenReady(this.pauseLinks.isEmpty());
            this.audioPlayer.setLooping(true);
            long currentPosition2 = this.audioPlayer.getCurrentPosition();
            if (!z || this.audioPlayer.getDuration() == -9223372036854775807L) {
                return;
            }
            float duration = currentPosition2 / this.audioPlayer.getDuration();
            StoryEntry storyEntry = this.entry;
            if ((duration < storyEntry.audioLeft || duration > storyEntry.audioRight) && System.currentTimeMillis() - this.seekedLastTime > 500) {
                this.seekedLastTime = System.currentTimeMillis();
                this.audioPlayer.seekTo(-this.entry.audioOffset);
                return;
            }
            return;
        }
        if (isCollage()) {
            currentPosition = this.collage.getPositionWithOffset();
            zIsPlaying = this.collage.playing;
        } else {
            VideoPlayer videoPlayer = this.videoPlayer;
            if (videoPlayer == null) {
                videoPlayer = this.roundPlayer;
            }
            currentPosition = videoPlayer.getCurrentPosition();
            zIsPlaying = videoPlayer.isPlaying();
        }
        StoryEntry storyEntry2 = this.entry;
        float f = storyEntry2.audioRight;
        float f2 = storyEntry2.audioLeft;
        float f3 = storyEntry2.audioDuration;
        long j = (long) ((f - f2) * f3);
        if (zIsPlaying) {
            long j2 = storyEntry2.audioOffset;
            z2 = currentPosition >= j2 && currentPosition <= j2 + j;
        }
        long j3 = currentPosition - (storyEntry2.audioOffset - ((long) (f2 * f3)));
        if (this.audioPlayer.isPlaying() != z2) {
            this.audioPlayer.setPlayWhenReady(z2);
            this.audioPlayer.seekTo(j3);
        } else if (z) {
            if (Math.abs(this.audioPlayer.getCurrentPosition() - j3) > (isCollage() ? 300 : 120)) {
                this.audioPlayer.seekTo(j3);
            }
        }
    }

    public final void updatePauseReason(int i, boolean z) {
        HashSet hashSet = this.pauseLinks;
        if (z) {
            hashSet.add(Integer.valueOf(i));
        } else {
            hashSet.remove(Integer.valueOf(i));
        }
        VideoPlayer videoPlayer = this.videoPlayer;
        if (videoPlayer != null) {
            videoPlayer.setPlayWhenReady(hashSet.isEmpty());
        }
        CollageLayoutView2 collageLayoutView2 = this.collage;
        if (collageLayoutView2 != null) {
            collageLayoutView2.setPlaying(hashSet.isEmpty());
        }
        updateAudioPlayer(true);
        updateRoundPlayer(true);
    }

    public final void updateRoundPlayer(boolean z) {
        long currentPosition;
        boolean zIsPlaying;
        if (this.roundPlayer == null || this.entry == null) {
            return;
        }
        if (this.videoPlayer == null && !isCollage()) {
            this.roundPlayer.setPlayWhenReady(this.pauseLinks.isEmpty());
            this.roundPlayer.setLooping(true);
            RoundView roundView = this.roundView;
            if (roundView != null && !roundView.shown) {
                roundView.shown = true;
                roundView.shownT.set(true, true);
                roundView.invalidate();
            }
            long currentPosition2 = this.roundPlayer.getCurrentPosition();
            if (!z || this.roundPlayer.getDuration() == -9223372036854775807L) {
                return;
            }
            float duration = currentPosition2 / this.roundPlayer.getDuration();
            StoryEntry storyEntry = this.entry;
            if ((duration < storyEntry.roundLeft || duration > storyEntry.roundRight) && System.currentTimeMillis() - this.seekedLastTime > 500) {
                this.seekedLastTime = System.currentTimeMillis();
                this.roundPlayer.seekTo(-this.entry.roundOffset);
                return;
            }
            return;
        }
        if (isCollage()) {
            currentPosition = this.collage.getPositionWithOffset();
            zIsPlaying = this.collage.playing;
        } else {
            currentPosition = this.videoPlayer.getCurrentPosition();
            zIsPlaying = this.videoPlayer.isPlaying();
        }
        StoryEntry storyEntry2 = this.entry;
        float f = storyEntry2.roundRight;
        float f2 = storyEntry2.roundLeft;
        float f3 = storyEntry2.roundDuration;
        long j = (long) ((f - f2) * f3);
        long j2 = storyEntry2.roundOffset;
        boolean z2 = currentPosition >= j2 && currentPosition <= j + j2;
        boolean z3 = zIsPlaying && z2;
        long j3 = (currentPosition - j2) + ((long) (f2 * f3));
        RoundView roundView2 = this.roundView;
        if (roundView2 != null && roundView2.shown != z2) {
            roundView2.shown = z2;
            roundView2.invalidate();
        }
        if (this.roundPlayer.isPlaying() != z3) {
            this.roundPlayer.setPlayWhenReady(z3);
            this.roundPlayer.seekTo(j3);
        } else if (z) {
            if (Math.abs(this.roundPlayer.getCurrentPosition() - j3) > (isCollage() ? 300 : 120)) {
                this.roundPlayer.seekTo(j3);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.wallpaperDrawable == drawable || super.verifyDrawable(drawable);
    }

    public final void set(StoryEntry storyEntry, RichTableCell$$ExternalSyntheticLambda3 richTableCell$$ExternalSyntheticLambda3, long j) {
        this.entry = storyEntry;
        if (storyEntry == null) {
            setupVideoPlayer(null, richTableCell$$ExternalSyntheticLambda3, j);
            setupImage(null);
            setupCollage(null);
            setupWallpaper(null);
            this.gradientPaint.setShader(null);
            setupAudio(false, null);
            setupRound(null, null, false);
            return;
        }
        if (storyEntry.isCollage()) {
            setupImage(null);
            setupVideoPlayer(null, richTableCell$$ExternalSyntheticLambda3, j);
            setupCollage(storyEntry);
        } else if (storyEntry.isVideo) {
            setupImage(storyEntry);
            setupCollage(null);
            setupVideoPlayer(storyEntry, richTableCell$$ExternalSyntheticLambda3, j);
            if (storyEntry.gradientTopColor == 0 && storyEntry.gradientBottomColor == 0) {
                storyEntry.setupGradient(new PreviewView$$ExternalSyntheticLambda1(this, 0));
            } else {
                setupGradient();
            }
        } else {
            setupCollage(null);
            setupVideoPlayer(null, richTableCell$$ExternalSyntheticLambda3, 0L);
            setupImage(storyEntry);
            setupGradient();
        }
        applyMatrix();
        setupWallpaper(storyEntry);
        setupAudio(false, storyEntry);
        setupRound(storyEntry, null, false);
    }

    public static Drawable getBackgroundDrawable(Drawable drawable, int i, TLRPC.WallPaper wallPaper, boolean z) {
        Theme.ThemeInfo themeInfo;
        SparseIntArray sparseIntArray;
        String[] strArr;
        String str;
        SparseIntArray themeFileValues;
        int[] iArr;
        Theme.ThemeAccent accent;
        int i2;
        MHTML mhtmlCreateBackgroundDrawable;
        BitmapDrawable bitmapDrawable;
        int i3;
        if (wallPaper != null && TextUtils.isEmpty(ChatThemeController.getWallpaperEmoticon(wallPaper))) {
            return ChatBackgroundDrawable.getOrCreate(drawable, wallPaper, z);
        }
        EmojiThemes theme = (wallPaper == null || wallPaper.settings == null) ? null : ChatThemeController.getInstance(i).getTheme(new ThemeKey(wallPaper.settings.emoticon, null));
        if (theme != null) {
            return getBackgroundDrawableFromTheme(theme, i, z);
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str2 = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        HashMap map = Theme.themesDict;
        if (((Theme.ThemeInfo) map.get(string)) == null || ((Theme.ThemeInfo) map.get(string)).isDark()) {
            string = "Blue";
        }
        String str3 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (((Theme.ThemeInfo) map.get(string2)) == null || !((Theme.ThemeInfo) map.get(string2)).isDark()) {
            string2 = "Dark Blue";
        }
        Theme.ThemeInfo themeInfo2 = Theme.currentTheme;
        if (string.equals(string2)) {
            if (themeInfo2.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                str3 = string2;
            }
            if (z) {
                themeInfo = (Theme.ThemeInfo) map.get(str3);
            } else {
                themeInfo = (Theme.ThemeInfo) map.get(str2);
            }
            sparseIntArray = new SparseIntArray();
            strArr = new String[1];
            str = themeInfo.assetName;
            if (str != null) {
                themeFileValues = Theme.getThemeFileValues(null, str, strArr);
            } else {
                themeFileValues = Theme.getThemeFileValues(new File(themeInfo.pathToFile), null, strArr);
            }
            iArr = Theme.defaultColors;
            if (iArr != null) {
                for (i3 = 0; i3 < iArr.length; i3++) {
                    sparseIntArray.put(i3, iArr[i3]);
                }
            }
            accent = themeInfo.getAccent(false);
            if (accent != null) {
                accent.fillAccentColors(themeFileValues, sparseIntArray);
            } else {
                for (i2 = 0; i2 < themeFileValues.size(); i2++) {
                    sparseIntArray.put(themeFileValues.keyAt(i2), themeFileValues.valueAt(i2));
                }
            }
            mhtmlCreateBackgroundDrawable = Theme.createBackgroundDrawable(themeInfo, sparseIntArray, strArr[0], 0, true);
            bitmapDrawable = (BitmapDrawable) mhtmlCreateBackgroundDrawable.boundary;
            if (bitmapDrawable != null) {
                return bitmapDrawable;
            }
            return (Drawable) mhtmlCreateBackgroundDrawable.file;
        }
        str3 = string2;
        str2 = string;
        if (z) {
            themeInfo = (Theme.ThemeInfo) map.get(str3);
        } else {
            themeInfo = (Theme.ThemeInfo) map.get(str2);
        }
        sparseIntArray = new SparseIntArray();
        strArr = new String[1];
        str = themeInfo.assetName;
        if (str != null) {
            themeFileValues = Theme.getThemeFileValues(null, str, strArr);
        } else {
            themeFileValues = Theme.getThemeFileValues(new File(themeInfo.pathToFile), null, strArr);
        }
        iArr = Theme.defaultColors;
        if (iArr != null) {
            while (i3 < iArr.length) {
                sparseIntArray.put(i3, iArr[i3]);
            }
        }
        accent = themeInfo.getAccent(false);
        if (accent != null) {
            accent.fillAccentColors(themeFileValues, sparseIntArray);
        } else {
            while (i2 < themeFileValues.size()) {
                sparseIntArray.put(themeFileValues.keyAt(i2), themeFileValues.valueAt(i2));
            }
        }
        mhtmlCreateBackgroundDrawable = Theme.createBackgroundDrawable(themeInfo, sparseIntArray, strArr[0], 0, true);
        bitmapDrawable = (BitmapDrawable) mhtmlCreateBackgroundDrawable.boundary;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        return (Drawable) mhtmlCreateBackgroundDrawable.file;
    }

    public final void setupAudio(MessageObject messageObject) {
        StoryEntry storyEntry;
        long duration;
        StoryEntry storyEntry2 = this.entry;
        if (storyEntry2 != null) {
            storyEntry2.editedMedia = true;
            if (messageObject != null && messageObject.messageOwner != null) {
                TLRPC.Document document = messageObject.getDocument();
                if (document != null && document.id != 0) {
                    this.entry.audioDocument = new TLRPC.TL_inputDocument();
                    TLRPC.InputDocument inputDocument = this.entry.audioDocument;
                    inputDocument.id = document.id;
                    inputDocument.file_reference = document.file_reference;
                    inputDocument.access_hash = document.access_hash;
                }
                int i = 0;
                if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath)) {
                    this.entry.audioPath = messageObject.messageOwner.attachPath;
                } else {
                    File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, false, true);
                    if (pathToAttach == null || !pathToAttach.exists()) {
                        pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document, null, true, true);
                        if (pathToAttach != null && pathToAttach.exists()) {
                            this.entry.audioPath = pathToAttach.getAbsolutePath();
                        } else {
                            StoryEntry storyEntry3 = this.entry;
                            storyEntry3.audioPath = null;
                            storyEntry3.audioDocument = null;
                            storyEntry3.audioAuthor = null;
                            storyEntry3.audioTitle = null;
                            storyEntry3.audioOffset = 0L;
                            storyEntry3.audioDuration = 0L;
                            storyEntry3.audioLeft = 0.0f;
                            storyEntry3.audioRight = 1.0f;
                            return;
                        }
                    }
                    this.entry.audioPath = pathToAttach.getAbsolutePath();
                }
                StoryEntry storyEntry4 = this.entry;
                storyEntry4.audioAuthor = null;
                storyEntry4.audioTitle = null;
                if (document != null) {
                    ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.DocumentAttribute documentAttribute = arrayList.get(i2);
                        i2++;
                        TLRPC.DocumentAttribute documentAttribute2 = documentAttribute;
                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeAudio) {
                            this.entry.audioAuthor = documentAttribute2.performer;
                            if (!TextUtils.isEmpty(documentAttribute2.title)) {
                                this.entry.audioTitle = documentAttribute2.title;
                            }
                            this.entry.audioDuration = (long) (documentAttribute2.duration * 1000.0d);
                            break;
                        }
                        if (documentAttribute2 instanceof TLRPC.TL_documentAttributeFilename) {
                            this.entry.audioTitle = documentAttribute2.file_name;
                        }
                    }
                }
                StoryEntry storyEntry5 = this.entry;
                storyEntry5.audioOffset = 0L;
                if (storyEntry5.isVideo) {
                    storyEntry5.audioOffset = (long) (storyEntry5.left * getDuration());
                }
                this.entry.audioLeft = 0.0f;
                if (isCollage()) {
                    ArrayList arrayList2 = this.collage.parts;
                    int size2 = arrayList2.size();
                    while (true) {
                        if (i < size2) {
                            Object obj = arrayList2.get(i);
                            i++;
                            StoryEntry storyEntry6 = ((CollageLayoutView2.Part) obj).content;
                            if (storyEntry6 != null && storyEntry6.isVideo) {
                                duration = this.collage.getDuration();
                            }
                        } else {
                            storyEntry = this.entry;
                            if (storyEntry.isVideo) {
                                duration = getDuration();
                            } else {
                                duration = storyEntry.audioDuration;
                            }
                        }
                    }
                } else {
                    storyEntry = this.entry;
                    if (storyEntry.isVideo) {
                        duration = getDuration();
                    } else {
                        duration = storyEntry.audioDuration;
                    }
                }
                TimelineView timelineView = this.timelineView;
                int maxCount = timelineView == null ? 1 : timelineView.getMaxCount();
                StoryEntry storyEntry7 = this.entry;
                storyEntry7.audioRight = storyEntry7.audioDuration != 0 ? Math.min(1.0f, Math.min(duration, ((long) maxCount) * 59000) / this.entry.audioDuration) : 1.0f;
            } else {
                storyEntry2.audioPath = null;
                storyEntry2.audioDocument = null;
                storyEntry2.audioAuthor = null;
                storyEntry2.audioTitle = null;
                storyEntry2.audioOffset = 0L;
                storyEntry2.audioDuration = 0L;
                storyEntry2.audioLeft = 0.0f;
                storyEntry2.audioRight = 1.0f;
            }
        }
        setupAudio(true, this.entry);
    }
}

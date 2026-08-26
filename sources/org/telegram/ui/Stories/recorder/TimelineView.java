package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzkp;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Scroller;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda16;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda48;

public final class TimelineView extends View {
    public RichEditor$$ExternalSyntheticLambda48 askExactSeek;
    public StaticLayout audioAuthor;
    public float audioAuthorLeft;
    public final TextPaint audioAuthorPaint;
    public float audioAuthorWidth;
    public final BlurringShader.StoryBlurDrawer audioBlur;
    public final RectF audioBounds;
    public final Path audioClipPath;
    public final Paint audioDotPaint;
    public long audioDuration;
    public final Drawable audioIcon;
    public float audioLeft;
    public long audioOffset;
    public String audioPath;
    public float audioRight;
    public boolean audioSelected;
    public final AnimatedFloat audioSelectedT;
    public final AnimatedFloat audioT;
    public StaticLayout audioTitle;
    public float audioTitleLeft;
    public final TextPaint audioTitlePaint;
    public float audioTitleWidth;
    public float audioVolume;
    public final BlurringShader.StoryBlurDrawer audioWaveformBlur;
    public final BlurringShader.StoryBlurDrawer backgroundBlur;
    public final BlurringShader.BlurManager blurManager;
    public final Path collageClipPath;
    public final Paint collageFramePaint;
    public Track collageMain;
    public int collageSelected;
    public final ArrayList collageTracks;
    public final ArrayList collageWaveforms;
    public final TextPaint countTextPaint;
    public long coverEnd;
    public long coverStart;
    public TimelineDelegate delegate;
    public float dragSpeed;
    public boolean dragged;
    public boolean draggingProgress;
    public final LinearGradient ellipsizeGradient;
    public final Matrix ellipsizeMatrix;
    public final Paint ellipsizePaint;
    public int h;
    public boolean hadDragChange;
    public boolean hasAudio;
    public boolean hasRound;
    public boolean isCover;
    public int lastHeight;
    public long lastTime;
    public float lastX;
    public final AnimatedFloat loopProgress;
    public long loopProgressFrom;
    public int maxCount;
    public Runnable onHeightChange;
    public final SendGiftSheet$$ExternalSyntheticLambda16 onLongPress;
    public Runnable onTimelineClick;
    public boolean open;
    public final AnimatedFloat openT;
    public int ph;
    public int pressCollageIndex;
    public int pressHandle;
    public int pressHandleCollageIndex;
    public long pressTime;
    public int pressType;
    public long progress;
    public final Paint progressShadowPaint;
    public final Paint progressWhitePaint;
    public int px;
    public int py;
    public final Paint regionCutPaint;
    public final Paint regionHandlePaint;
    public final Paint regionPaint;
    public boolean resetWaveform;
    public final Theme.ResourcesProvider resourcesProvider;
    public final RectF roundBounds;
    public final Path roundClipPath;
    public long roundDuration;
    public float roundLeft;
    public long roundOffset;
    public String roundPath;
    public float roundRight;
    public boolean roundSelected;
    public final AnimatedFloat roundSelectedT;
    public final AnimatedFloat roundT;
    public VideoThumbsLoader roundThumbs;
    public float roundVolume;
    public long scroll;
    public final Scroller scroller;
    public boolean scrolling;
    public boolean scrollingVideo;
    public final Path selectedCollageClipPath;
    public final Path selectedVideoClipPath;
    public final float[] selectedVideoRadii;
    public int sw;
    public final RectF timelineBounds;
    public final Path timelineClipPath;
    public final Drawable timelineIcon;
    public final Text timelineText;
    public final AnimatedFloat timelineWaveformMax;
    public final WaveformPath timelineWaveformPath;
    public VelocityTracker velocityTracker;
    public final RectF videoBounds;
    public final Path videoClipPath;
    public final Paint videoFramePaint;
    public Track videoTrack;
    public int w;
    public int wasScrollX;
    public AudioWaveformLoader waveform;
    public boolean waveformIsLoaded;
    public final AnimatedFloat waveformMax;
    public final Paint waveformPaint;
    public final WaveformPath waveformPath;

    public final class AudioWaveformLoader {
        public final AnimatedFloat animatedLoaded;
        public final int count;
        public final short[] data;
        public final long duration;
        public final MediaExtractor extractor;
        public final MediaFormat inputFormat;
        public short max;
        public final FfmpegAudioWaveformLoader waveformLoader;
        public int loaded = 0;
        public final Object lock = new Object();
        public boolean stop = false;

        public AudioWaveformLoader(String str, int i) {
            this.animatedLoaded = new AnimatedFloat(TimelineView.this, 0L, 600L, CubicBezierInterpolator.EASE_OUT_QUINT);
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.extractor = mediaExtractor;
            String string = null;
            try {
                mediaExtractor.setDataSource(str);
                int trackCount = mediaExtractor.getTrackCount();
                for (int i2 = 0; i2 < trackCount; i2++) {
                    MediaFormat trackFormat = this.extractor.getTrackFormat(i2);
                    string = trackFormat.getString("mime");
                    if (string != null && string.startsWith("audio/")) {
                        this.extractor.selectTrack(i2);
                        this.inputFormat = trackFormat;
                        break;
                    }
                }
                MediaFormat mediaFormat = this.inputFormat;
                if (mediaFormat != null) {
                    this.duration = mediaFormat.getLong("durationUs") / 1000000;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            Track track = TimelineView.this.videoTrack;
            int iMin = Math.min(Math.round((((this.duration * 1000) / Math.min(track != null ? track.duration : !TimelineView.this.collageTracks.isEmpty() ? TimelineView.this.getBaseDuration() : TimelineView.this.hasRound ? TimelineView.this.roundDuration : this.duration * 1000, TimelineView.this.getMaxScrollDuration())) * i) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
            this.count = iMin;
            this.data = new short[iMin];
            if (this.duration <= 0 || this.inputFormat == null) {
                return;
            }
            if ("audio/mpeg".equals(string) || "audio/mp3".equals(string) || "audio/mp4a".equals(string) || "audio/mp4a-latm".equals(string)) {
                this.waveformLoader = new FfmpegAudioWaveformLoader(str, iMin, new PaintView$$ExternalSyntheticLambda4(this, 8));
            } else {
                Utilities.phoneBookQueue.postRunnable(new PreviewView$$ExternalSyntheticLambda12(this, 26));
            }
        }

        public final void destroy() {
            FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.waveformLoader;
            if (ffmpegAudioWaveformLoader != null) {
                ffmpegAudioWaveformLoader.destroy();
            }
            Utilities.phoneBookQueue.cancelRunnable(new PreviewView$$ExternalSyntheticLambda12(this, 26));
            synchronized (this.lock) {
                this.stop = true;
            }
        }

        public final void receiveData(short[] sArr, int i) {
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = this.loaded + i2;
                short[] sArr2 = this.data;
                if (i3 >= sArr2.length) {
                    break;
                }
                sArr2[i3] = sArr[i2];
                short s = this.max;
                short s2 = sArr[i2];
                if (s < s2) {
                    this.max = s2;
                }
            }
            this.loaded += i;
            TimelineView.this.invalidate();
        }
    }

    public interface TimelineDelegate {
        void onAudioLeftChange(float f);

        void onAudioOffsetChange(long j);

        void onAudioRemove();

        void onAudioRightChange(float f);

        void onAudioVolumeChange(float f);

        void onProgressChange(long j, boolean z);

        void onProgressDragChange(boolean z);

        void onRoundLeftChange(float f);

        void onRoundOffsetChange(long j);

        void onRoundRemove();

        void onRoundRightChange(float f);

        void onRoundSelectChange(boolean z);

        void onRoundVolumeChange(float f);

        void onVideoLeftChange(int i, float f);

        void onVideoLeftChange(boolean z, float f);

        void onVideoOffsetChange(int i, long j);

        void onVideoRightChange(int i, float f);

        void onVideoRightChange(boolean z, float f);

        void onVideoSelected(int i);

        void onVideoVolumeChange(float f);

        void onVideoVolumeChange(int i, float f);
    }

    public final class Track {
        public final RectF bounds = new RectF();
        public long duration;
        public int index;
        public boolean isRound;
        public float left;
        public long offset;
        public String path;
        public float right;
        public final AnimatedFloat selectedT;
        public VideoThumbsLoader thumbs;
        public float volume;

        public Track() {
            this.selectedT = new AnimatedFloat(TimelineView.this, 360L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        public static void access$700(Track track) {
            int i = track.index;
            if (i >= 0) {
                TimelineView timelineView = TimelineView.this;
                if (i >= timelineView.collageWaveforms.size()) {
                    return;
                }
                ArrayList arrayList = timelineView.collageWaveforms;
                AudioWaveformLoader audioWaveformLoader = (AudioWaveformLoader) arrayList.get(track.index);
                if (timelineView.getMeasuredWidth() <= 0 || audioWaveformLoader != null) {
                    return;
                }
                if (audioWaveformLoader != null) {
                    audioWaveformLoader.destroy();
                }
                arrayList.set(track.index, timelineView.new AudioWaveformLoader(track.path, (timelineView.getMeasuredWidth() - timelineView.getPaddingLeft()) - timelineView.getPaddingRight()));
            }
        }

        public final void setupThumbs(boolean z) {
            TimelineView timelineView = TimelineView.this;
            if (timelineView.getMeasuredWidth() > 0) {
                VideoThumbsLoader videoThumbsLoader = this.thumbs;
                if (videoThumbsLoader == null || z) {
                    if (videoThumbsLoader != null) {
                        videoThumbsLoader.destroy();
                        this.thumbs = null;
                    }
                    boolean z2 = this.isRound;
                    String str = this.path;
                    int i = timelineView.w;
                    int i2 = timelineView.px;
                    int i3 = (i - i2) - i2;
                    int iDp = AndroidUtilities.dp(38.0f);
                    long j = this.duration;
                    this.thumbs = timelineView.new VideoThumbsLoader(z2, str, i3, iDp, j > 2 ? Long.valueOf(j) : null, timelineView.getMaxScrollDuration(), timelineView.coverStart, timelineView.coverEnd, new PreviewView$$ExternalSyntheticLambda12(this, 27));
                }
            }
        }
    }

    public final class VideoThumbsLoader {
        public Path clipPath;
        public int count;
        public boolean destroyed;
        public long duration;
        public volatile int frameHeight;
        public volatile long frameIterator;
        public volatile int frameWidth;
        public final boolean isRound;
        public long nextFrame;
        public final ArrayList frames = new ArrayList();
        public boolean loading = false;
        public final Paint bitmapPaint = new Paint(3);
        public MediaMetadataRetriever metadataRetriever = new MediaMetadataRetriever();

        public final class BitmapFrame {
            public final AnimatedFloat alpha;
            public final Bitmap bitmap;

            public BitmapFrame(VideoThumbsLoader videoThumbsLoader, Bitmap bitmap) {
                this.alpha = new AnimatedFloat(0.0f, TimelineView.this, 0L, 240L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.bitmap = bitmap;
            }
        }

        public VideoThumbsLoader(boolean z, final String str, final int i, final int i2, final Long l, final long j, final long j2, final long j3, final Runnable runnable) {
            this.isRound = z;
            Utilities.themeQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    int i3;
                    int i4;
                    int i5;
                    int i6;
                    TimelineView.VideoThumbsLoader videoThumbsLoader = this.f$0;
                    String str2 = str;
                    Long l2 = l;
                    long j4 = j2;
                    long j5 = j3;
                    int i7 = i2;
                    long j6 = j;
                    int i8 = i;
                    Runnable runnable2 = runnable;
                    long maxScrollDuration = TimelineView.this.getMaxScrollDuration();
                    try {
                        videoThumbsLoader.metadataRetriever.setDataSource(str2);
                        String strExtractMetadata = videoThumbsLoader.metadataRetriever.extractMetadata(9);
                        if (strExtractMetadata != null) {
                            maxScrollDuration = Long.parseLong(strExtractMetadata);
                            videoThumbsLoader.duration = maxScrollDuration;
                        }
                        String strExtractMetadata2 = videoThumbsLoader.metadataRetriever.extractMetadata(18);
                        i3 = strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : 0;
                        try {
                            String strExtractMetadata3 = videoThumbsLoader.metadataRetriever.extractMetadata(19);
                            i4 = strExtractMetadata3 != null ? Integer.parseInt(strExtractMetadata3) : 0;
                            try {
                                String strExtractMetadata4 = videoThumbsLoader.metadataRetriever.extractMetadata(24);
                                if (strExtractMetadata4 == null || !((i6 = Integer.parseInt(strExtractMetadata4)) == 90 || i6 == 270)) {
                                    i5 = i3;
                                    i3 = i4;
                                } else {
                                    i5 = i4;
                                }
                            } catch (Exception e) {
                                e = e;
                                int i9 = i4;
                                i4 = i3;
                                i3 = i9;
                                videoThumbsLoader.metadataRetriever = null;
                                FileLog.e(e);
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i4 = i3;
                            i3 = 0;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        i3 = 0;
                        i4 = 0;
                    }
                    if (l2 != null) {
                        maxScrollDuration = l2.longValue();
                        videoThumbsLoader.duration = maxScrollDuration;
                    }
                    if (j4 != -1 && j5 != -1) {
                        maxScrollDuration = j5 - j4;
                    }
                    float fClamp = Utilities.clamp((i5 == 0 || i3 == 0) ? 1.0f : i5 / i3, 1.3333334f, 0.5625f);
                    videoThumbsLoader.frameHeight = Math.max(1, i7);
                    videoThumbsLoader.frameWidth = Math.max(1, (int) Math.ceil(i7 * fClamp));
                    int iCeil = (int) Math.ceil(((Math.max(maxScrollDuration, j6) / j6) * i8) / videoThumbsLoader.frameWidth);
                    videoThumbsLoader.count = iCeil;
                    videoThumbsLoader.frameIterator = (long) (maxScrollDuration / iCeil);
                    videoThumbsLoader.nextFrame = -videoThumbsLoader.frameIterator;
                    if (j4 != -1) {
                        videoThumbsLoader.nextFrame = j4 - videoThumbsLoader.frameIterator;
                    }
                    videoThumbsLoader.load();
                    if (runnable2 != null) {
                        AndroidUtilities.runOnUIThread(runnable2);
                    }
                }
            });
        }

        public final void destroy() {
            this.destroyed = true;
            Utilities.themeQueue.cancelRunnable(new PreviewView$$ExternalSyntheticLambda12(this, 28));
            ArrayList arrayList = this.frames;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Bitmap bitmap = ((BitmapFrame) obj).bitmap;
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            this.frames.clear();
            MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetriever;
            if (mediaMetadataRetriever != null) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception e) {
                    this.metadataRetriever = null;
                    FileLog.e(e);
                }
            }
        }

        public final void load() {
            if (this.loading || this.metadataRetriever == null || this.frames.size() >= this.count) {
                return;
            }
            this.loading = true;
            this.nextFrame += this.frameIterator;
            int i = 28;
            Utilities.themeQueue.cancelRunnable(new PreviewView$$ExternalSyntheticLambda12(this, i));
            Utilities.themeQueue.postRunnable(new PreviewView$$ExternalSyntheticLambda12(this, i));
        }
    }

    public TimelineView(Context context, ViewGroup viewGroup, StoryRecorder.AnonymousClass3 anonymousClass3, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
        super(context);
        this.collageSelected = 0;
        this.collageWaveforms = new ArrayList();
        this.collageTracks = new ArrayList();
        this.collageFramePaint = new Paint(3);
        this.collageClipPath = new Path();
        this.selectedCollageClipPath = new Path();
        this.maxCount = 1;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.roundT = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.roundSelectedT = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.audioT = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.audioSelectedT = new AnimatedFloat(this, 360L, cubicBezierInterpolator);
        this.waveformMax = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        new AnimatedFloat(this, 0L, 600L, cubicBezierInterpolator);
        this.timelineWaveformMax = new AnimatedFloat(this, 0L, 360L, cubicBezierInterpolator);
        this.openT = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
        this.open = true;
        this.timelineBounds = new RectF();
        this.timelineClipPath = new Path();
        this.timelineWaveformPath = new WaveformPath();
        this.videoBounds = new RectF();
        this.videoFramePaint = new Paint(3);
        this.videoClipPath = new Path();
        this.selectedVideoClipPath = new Path();
        this.roundBounds = new RectF();
        this.roundClipPath = new Path();
        Paint paint = new Paint(1);
        this.regionPaint = paint;
        Paint paint2 = new Paint(1);
        this.regionCutPaint = paint2;
        Paint paint3 = new Paint(1);
        this.regionHandlePaint = paint3;
        Paint paint4 = new Paint(1);
        this.progressShadowPaint = paint4;
        Paint paint5 = new Paint(1);
        this.progressWhitePaint = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.countTextPaint = textPaint;
        this.audioBounds = new RectF();
        this.audioClipPath = new Path();
        Paint paint6 = new Paint(1);
        this.waveformPaint = paint6;
        this.waveformPath = new WaveformPath();
        Paint paint7 = new Paint(1);
        this.audioDotPaint = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.audioAuthorPaint = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.audioTitlePaint = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.ellipsizeGradient = linearGradient;
        this.ellipsizeMatrix = new Matrix();
        Paint paint8 = new Paint(1);
        this.ellipsizePaint = paint8;
        this.scroller = new Scroller(getContext());
        this.coverStart = -1L;
        this.coverEnd = -1L;
        this.loopProgress = new AnimatedFloat(0.0f, this, 0L, 340L, cubicBezierInterpolator);
        this.loopProgressFrom = -1L;
        this.pressHandle = -1;
        this.pressHandleCollageIndex = -1;
        this.pressType = -1;
        this.pressCollageIndex = -1;
        this.dragSpeed = 1.0f;
        this.scrollingVideo = true;
        this.scrolling = false;
        this.selectedVideoRadii = new float[8];
        this.resourcesProvider = resourcesProvider;
        paint7.setColor(Integer.MAX_VALUE);
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(1.0f), 436207616);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(2.0f), 1073741824);
        textPaint.setTypeface(AndroidUtilities.bold());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.timelineText = new Text(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.timelineIcon = drawableMutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.audioIcon = drawableMutate2;
        drawableMutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.blurManager = blurManager;
        this.backgroundBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 0);
        this.audioBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 3);
        this.audioWaveformBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 4);
        this.onLongPress = new SendGiftSheet$$ExternalSyntheticLambda16(this, viewGroup, resourcesProvider, blurManager, anonymousClass3, 23);
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.audioSelectedT.set(this.audioSelected));
    }

    public long getBaseDuration() {
        Track track = this.videoTrack;
        if (track != null) {
            return Math.max(1L, track.duration);
        }
        Track track2 = this.collageMain;
        if (track2 != null) {
            return Math.max(1L, track2.duration);
        }
        return this.hasRound ? Math.max(1L, this.roundDuration) : Math.max(1L, this.audioDuration);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.collageTracks;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float fLerp = 0.0f;
        for (int i = 0; i < arrayList.size(); i++) {
            if (fLerp > 0.0f) {
                fLerp += AndroidUtilities.dp(4.0f);
            }
            fLerp += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((Track) arrayList.get(i)).selectedT.get());
        }
        return fLerp;
    }

    private float getRoundHeight() {
        if (!this.hasRound) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.roundSelectedT.set(this.roundSelected));
    }

    private float getVideoHeight() {
        Track track = this.videoTrack;
        if (track == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), track.selectedT.get());
    }

    @Override
    public final void computeScroll() {
        Scroller scroller = this.scroller;
        if (!scroller.computeScrollOffset()) {
            if (this.scrolling) {
                this.scrolling = false;
                TimelineDelegate timelineDelegate = this.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onProgressDragChange(false);
                    return;
                }
                return;
            }
            return;
        }
        int currX = scroller.getCurrX();
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.scrollingVideo) {
            this.scroll = (long) Math.max(0.0f, (((currX - this.px) - this.ph) / this.sw) * jMin);
        } else {
            if (!this.audioSelected) {
                scroller.abortAnimation();
                return;
            }
            int i = this.px;
            int i2 = this.ph;
            float f = this.sw;
            float f2 = jMin;
            moveAudioOffset(((((currX - i) - i2) / f) * f2) - ((((this.wasScrollX - i) - i2) / f) * f2));
        }
        invalidate();
        this.wasScrollX = currX;
    }

    public final int detectHandle(MotionEvent motionEvent) {
        boolean z;
        int i;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        float fClamp = Utilities.clamp(this.progress, getBaseDuration(), 0L);
        Track track = this.collageMain;
        float f = jMin;
        float f2 = (this.sw * (((fClamp + (track != null ? (track.left * track.duration) + track.offset : this.videoTrack == null ? this.audioOffset : 0L)) - this.scroll) / f)) + this.px + this.ph;
        if (!this.isCover && x >= f2 - AndroidUtilities.dp(12.0f) && x <= f2 + AndroidUtilities.dp(12.0f)) {
            return 0;
        }
        boolean z2 = this.videoTrack != null && y > (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        ArrayList arrayList = this.collageTracks;
        boolean z3 = !arrayList.isEmpty() && y > ((((((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(4.0f))) - getCollageHeight()) - ((float) AndroidUtilities.dp(4.0f))) - ((float) AndroidUtilities.dp(2.0f)) && y < (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        if (!this.hasRound) {
            z = false;
        } else if (y <= (((((((this.h - this.py) - getVideoHeight()) - AndroidUtilities.dp(4.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(2.0f)) {
            z = false;
        } else if (y < ((((this.h - this.py) - getVideoHeight()) - AndroidUtilities.dp(2.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) {
            z = true;
        } else {
            z = false;
        }
        if (z3) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Track track2 = (Track) arrayList.get(i2);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(track2.bounds);
                rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                if (rectF.contains(x, y)) {
                    float f3 = this.px + this.ph;
                    long j = track2.offset;
                    float f4 = j;
                    float f5 = this.sw;
                    float f6 = ((f4 / f) * f5) + f3;
                    float f7 = track2.left;
                    long j2 = track2.duration;
                    float f8 = j2;
                    float f9 = ((((f7 * f8) + f4) / f) * f5) + f3;
                    float f10 = ((((track2.right * f8) + f4) / f) * f5) + f3;
                    float fM = zzir.m(j + j2, f, f5, f3);
                    this.pressHandleCollageIndex = i2;
                    if (x >= f9 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f9) {
                        return 13;
                    }
                    if (x >= f10 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f10) {
                        return 14;
                    }
                    if (x < f9 || x > f10 || (track2.left <= 0.01f && track2.right >= 0.99f)) {
                        return (x < f6 || x > fM) ? -1 : 16;
                    }
                    return 15;
                }
            }
            i = 1;
        } else {
            i = 1;
            if (z2) {
                float f11 = this.px + this.ph;
                Track track3 = this.videoTrack;
                float f12 = track3.left;
                float f13 = track3.duration;
                float f14 = this.scroll;
                float f15 = this.sw;
                float f16 = ((((f12 * f13) - f14) / f) * f15) + f11;
                float f17 = ((((track3.right * f13) - f14) / f) * f15) + f11;
                if (this.isCover) {
                    if (getBaseDuration() < getMaxScrollDuration()) {
                        return 4;
                    }
                    if (x >= f16 - AndroidUtilities.dp(15.0f) && x <= f17 + AndroidUtilities.dp(15.0f)) {
                        return 4;
                    }
                } else {
                    if (x >= f16 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f16) {
                        return 2;
                    }
                    if (x >= f17 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f17) {
                        return 3;
                    }
                    if (x >= f16 && x <= f17) {
                        Track track4 = this.videoTrack;
                        if (track4.left > 0.01f || track4.right < 0.99f) {
                            return 4;
                        }
                    }
                }
                return i;
            }
            if (z) {
                float f18 = this.px + this.ph;
                float f19 = this.roundOffset;
                float f20 = this.roundLeft;
                float f21 = this.roundDuration;
                float f22 = this.scroll;
                float f23 = this.sw;
                float f24 = (((((f20 * f21) + f19) - f22) / f) * f23) + f18;
                float fM2 = (((((this.roundRight * f21) + f19) - f22) / f) * f23) + f18;
                if (this.roundSelected || this.videoTrack == null) {
                    if (x >= f24 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f24) {
                        return 10;
                    }
                    if (x >= fM2 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + fM2) {
                        return 11;
                    }
                    if (x >= f24 && x <= fM2) {
                        return this.videoTrack == null ? 12 : 9;
                    }
                    float f25 = this.px + this.ph;
                    long j3 = this.roundOffset;
                    long j4 = this.scroll;
                    float f26 = this.sw;
                    float f27 = (((j3 - j4) / f) * f26) + f25;
                    fM2 = zzir.m((j3 + this.roundDuration) - j4, f, f26, f25);
                    f24 = f27;
                }
                if (x >= f24 && x <= fM2) {
                    return 9;
                }
            } else if (this.hasAudio) {
                float f28 = this.px + this.ph;
                float f29 = this.audioOffset;
                float f30 = this.audioLeft;
                float f31 = this.audioDuration;
                float f32 = this.scroll;
                float f33 = this.sw;
                float f34 = (((((f30 * f31) + f29) - f32) / f) * f33) + f28;
                float fM3 = (((((this.audioRight * f31) + f29) - f32) / f) * f33) + f28;
                if (this.audioSelected || (this.videoTrack == null && !this.hasRound)) {
                    if (x >= f34 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f34) {
                        return 6;
                    }
                    if (x >= fM3 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + fM3) {
                        return 7;
                    }
                    if (x >= f34 && x <= fM3) {
                        return this.videoTrack == null ? 8 : 5;
                    }
                    float f35 = this.px + this.ph;
                    long j5 = this.audioOffset;
                    long j6 = this.scroll;
                    float f36 = this.sw;
                    float f37 = (((j5 - j6) / f) * f36) + f35;
                    fM3 = zzir.m((j5 + this.audioDuration) - j6, f, f36, f35);
                    f34 = f37;
                }
                if (x >= f34 && x <= fM3) {
                    return 5;
                }
            }
        }
        Track track5 = this.videoTrack;
        if (track5 == null || track5.duration <= getMaxScrollDuration() || !z2) {
            return -1;
        }
        return i;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        long j;
        int i;
        Track track;
        Track track2;
        int i2;
        float f;
        float fMax;
        Canvas canvas2;
        boolean z;
        float f2;
        float f3;
        float videoHeight;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        double d;
        float f10;
        float f11;
        float fLerp;
        Canvas canvas3;
        float f12;
        float f13;
        Track track3;
        float fM;
        float f14;
        float f15;
        long j2;
        float fCenterY;
        float fMax2;
        float fDpf2;
        float f16;
        boolean z2;
        float f17;
        float f18;
        float fDpf3;
        boolean z3;
        float fMin;
        float fDpf4;
        BlurringShader.BlurManager blurManager;
        float fM2;
        float fLerp2;
        boolean z4;
        float fM3;
        float f19;
        float f20;
        float f21;
        boolean z5;
        int i3;
        float f22;
        boolean z6;
        int i4;
        BlurringShader.BlurManager blurManager2;
        int i5;
        TimelineView timelineView = this;
        Paint paint = timelineView.backgroundBlur.getPaint(1.0f);
        float f23 = timelineView.openT.set(timelineView.open);
        long jMin = Math.min(timelineView.getBaseDuration(), timelineView.getMaxScrollDuration());
        if (f23 < 1.0f) {
            timelineView.timelineBounds.set(timelineView.px, (timelineView.h - timelineView.py) - AndroidUtilities.dp(28.0f), timelineView.w - timelineView.px, timelineView.h - timelineView.py);
            timelineView.timelineClipPath.rewind();
            timelineView.timelineClipPath.addRoundRect(timelineView.timelineBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(timelineView.timelineBounds, (int) ((1.0f - f23) * 255.0f), 31);
            canvas.clipPath(timelineView.timelineClipPath);
            if (timelineView.blurManager.hasRenderNode()) {
                timelineView.backgroundBlur.drawRect(canvas);
                canvas.drawColor(855638016);
            } else if (paint == null) {
                canvas.drawColor(1073741824);
            } else {
                canvas.drawRect(timelineView.timelineBounds, paint);
                canvas.drawColor(855638016);
            }
            if (!timelineView.collageWaveforms.isEmpty() && (blurManager2 = timelineView.blurManager) != null && blurManager2.hasRenderNode()) {
                AnimatedFloat animatedFloat = timelineView.timelineWaveformMax;
                ArrayList arrayList = timelineView.collageWaveforms;
                int i6 = WaveformPath.$r8$clinit;
                if (arrayList == null) {
                    i5 = 0;
                } else {
                    i5 = 0;
                    for (int i7 = 0; i7 < arrayList.size(); i7++) {
                        if (arrayList.get(i7) != null) {
                            i5 += ((AudioWaveformLoader) arrayList.get(i7)).max;
                        }
                    }
                }
                float f24 = animatedFloat.set(i5);
                float f25 = (((timelineView.audioOffset - timelineView.scroll) / jMin) * timelineView.sw) + timelineView.px + timelineView.ph;
                WaveformPath waveformPath = timelineView.timelineWaveformPath;
                RectF rectF = timelineView.timelineBounds;
                waveformPath.check(f25, rectF.left, rectF.right, AndroidUtilities.dp(28.0f), f24, timelineView.timelineBounds.bottom, timelineView.collageWaveforms);
                canvas.saveLayerAlpha(timelineView.timelineBounds, 102, 31);
                canvas.clipPath(timelineView.timelineWaveformPath);
                timelineView.audioWaveformBlur.drawRect(canvas);
                canvas.restore();
            } else if (!timelineView.collageWaveforms.isEmpty()) {
                Paint paint2 = timelineView.audioWaveformBlur.getPaint(0.4f);
                if (paint2 == null) {
                    paint2 = timelineView.waveformPaint;
                    paint2.setAlpha(64);
                }
                AnimatedFloat animatedFloat2 = timelineView.timelineWaveformMax;
                ArrayList arrayList2 = timelineView.collageWaveforms;
                int i8 = WaveformPath.$r8$clinit;
                if (arrayList2 == null) {
                    i4 = 0;
                } else {
                    i4 = 0;
                    for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                        if (arrayList2.get(i9) != null) {
                            i4 += ((AudioWaveformLoader) arrayList2.get(i9)).max;
                        }
                    }
                }
                float f26 = animatedFloat2.set(i4);
                float f27 = (((timelineView.audioOffset - timelineView.scroll) / jMin) * timelineView.sw) + timelineView.px + timelineView.ph;
                WaveformPath waveformPath2 = timelineView.timelineWaveformPath;
                RectF rectF2 = timelineView.timelineBounds;
                waveformPath2.check(f27, rectF2.left, rectF2.right, AndroidUtilities.dp(28.0f), f26, timelineView.timelineBounds.bottom, timelineView.collageWaveforms);
                canvas.drawPath(timelineView.timelineWaveformPath, paint2);
            }
            float currentWidth = ((timelineView.timelineText.getCurrentWidth() + AndroidUtilities.dp(3.66f)) + timelineView.timelineIcon.getIntrinsicWidth()) / 2.0f;
            int iCenterX = (int) (timelineView.timelineBounds.centerX() - currentWidth);
            int iCenterY = (int) timelineView.timelineBounds.centerY();
            Drawable drawable = timelineView.timelineIcon;
            drawable.setBounds(iCenterX, zzkm.m(iCenterY, drawable), timelineView.timelineIcon.getIntrinsicWidth() + iCenterX, zzkp.m(iCenterY, timelineView.timelineIcon));
            timelineView.timelineIcon.setAlpha(191);
            timelineView.timelineIcon.draw(canvas);
            timelineView.timelineText.draw(canvas, (timelineView.timelineBounds.centerX() - currentWidth) + timelineView.timelineIcon.getIntrinsicWidth() + AndroidUtilities.dp(3.66f), iCenterY, -1, 0.75f);
            canvas.restore();
        }
        if (f23 > 0.0f) {
            if (f23 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, timelineView.getWidth(), timelineView.getHeight(), (int) (f23 * 255.0f), 31);
                z = true;
            } else {
                canvas2 = canvas;
                z = false;
            }
            Track track4 = timelineView.videoTrack;
            float f28 = track4 != null ? 1.0f : 0.0f;
            float f29 = track4 != null ? track4.selectedT.set((timelineView.audioSelected || timelineView.roundSelected) ? false : true) : 0.0f;
            float f30 = timelineView.h - timelineView.py;
            float fDp = AndroidUtilities.dp(4.0f);
            float f31 = f29;
            float f32 = f28;
            if (timelineView.videoTrack != null) {
                canvas2.save();
                videoHeight = timelineView.getVideoHeight();
                Track track5 = timelineView.videoTrack;
                float f33 = track5.left;
                long j3 = track5.duration;
                float f34 = j3;
                f3 = (f33 * f34 * f31) + 0.0f;
                f2 = (track5.right * f34 * f31) + 0.0f;
                float f35 = j3 <= 0 ? 0.0f : (timelineView.px + timelineView.ph) - ((timelineView.scroll / jMin) * timelineView.sw);
                int i10 = timelineView.ph;
                float f36 = i10;
                float f37 = f35 - f36;
                float f38 = (j3 <= 0 ? 0.0f : timelineView.px + i10 + (((j3 - timelineView.scroll) / jMin) * timelineView.sw)) + f36;
                timelineView.videoBounds.set(f37, f30 - videoHeight, f38, f30);
                float f39 = f30 - ((fDp * f32) + videoHeight);
                RectF rectF3 = timelineView.videoBounds;
                float f40 = (rectF3.top * f31) + 0.0f;
                float f41 = (rectF3.bottom * f31) + 0.0f;
                timelineView.videoClipPath.rewind();
                timelineView.videoClipPath.addRoundRect(timelineView.videoBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(timelineView.videoClipPath);
                VideoThumbsLoader videoThumbsLoader = timelineView.videoTrack.thumbs;
                if (videoThumbsLoader != null) {
                    int i11 = videoThumbsLoader.frameWidth;
                    float f42 = i11;
                    f22 = f39;
                    f4 = f41;
                    int iMax = (int) Math.max(0.0d, Math.floor((f37 - timelineView.px) / f42));
                    int iMin = (int) Math.min(timelineView.videoTrack.thumbs.count, Math.ceil(((f38 - f37) - timelineView.px) / f42) + 1.0d);
                    int i12 = (int) timelineView.videoBounds.top;
                    boolean z7 = timelineView.videoTrack.thumbs.frames.size() >= iMin;
                    boolean z8 = (i11 == 0 || !z7 || timelineView.videoTrack.isRound) ? false : true;
                    f5 = f40;
                    if (!z8) {
                        z6 = z8;
                        break;
                    }
                    int i13 = iMax;
                    while (true) {
                        if (i13 >= Math.min(timelineView.videoTrack.thumbs.frames.size(), iMin)) {
                            z6 = z8;
                            break;
                        } else {
                            if (((VideoThumbsLoader.BitmapFrame) timelineView.videoTrack.thumbs.frames.get(i13)).bitmap == null) {
                                z6 = false;
                                break;
                            }
                            i13++;
                        }
                    }
                    if (!z6) {
                        if (timelineView.blurManager.hasRenderNode()) {
                            timelineView.backgroundBlur.drawRect(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(1073741824);
                        } else {
                            canvas2.drawRect(timelineView.videoBounds, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i11 != 0) {
                        float f43 = f37;
                        int i14 = iMax;
                        while (i14 < Math.min(timelineView.videoTrack.thumbs.frames.size(), iMin)) {
                            VideoThumbsLoader.BitmapFrame bitmapFrame = (VideoThumbsLoader.BitmapFrame) timelineView.videoTrack.thumbs.frames.get(i14);
                            if (bitmapFrame.bitmap != null) {
                                timelineView.videoFramePaint.setAlpha((int) (bitmapFrame.alpha.set(1.0f) * 255.0f));
                                Bitmap bitmap = bitmapFrame.bitmap;
                                canvas2.drawBitmap(bitmap, f43, i12 - ((int) ((bitmap.getHeight() - videoHeight) / 2.0f)), timelineView.videoFramePaint);
                            }
                            f43 += f42;
                            i14++;
                            iMin = iMin;
                        }
                    }
                    if (!z7) {
                        timelineView.videoTrack.thumbs.load();
                    }
                } else {
                    f22 = f39;
                    f4 = f41;
                    f5 = f40;
                }
                timelineView.selectedVideoClipPath.rewind();
                if (!timelineView.isCover) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    int i15 = timelineView.px;
                    int i16 = timelineView.ph;
                    float f44 = i15 + i16;
                    Track track6 = timelineView.videoTrack;
                    float f45 = track6.left;
                    float f46 = track6.duration;
                    float f47 = timelineView.scroll;
                    float f48 = jMin;
                    float f49 = ((f45 * f46) - f47) / f48;
                    float f50 = timelineView.sw;
                    float f51 = ((f49 * f50) + f44) - (f45 <= 0.0f ? i16 : 0);
                    float f52 = timelineView.h - timelineView.py;
                    float f53 = f52 - videoHeight;
                    float f54 = track6.right;
                    rectF4.set(f51, f53, ((((f46 * f54) - f47) / f48) * f50) + f44 + (f54 >= 1.0f ? i16 : 0), f52);
                    timelineView.selectedVideoClipPath.addRoundRect(rectF4, timelineView.selectedVideoRadii, Path.Direction.CW);
                    canvas2.clipPath(timelineView.selectedVideoClipPath, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f30 = f22;
            } else {
                fDp = fDp;
                f2 = 0.0f;
                f3 = 0.0f;
                videoHeight = 0.0f;
                f4 = 0.0f;
                f5 = 0.0f;
            }
            if (timelineView.collageTracks.isEmpty()) {
                f6 = 0.0f;
            } else {
                timelineView.getCollageHeight();
                float f55 = f30;
                int i17 = 0;
                while (i17 < timelineView.collageTracks.size()) {
                    Track track7 = (Track) timelineView.collageTracks.get(i17);
                    float f56 = track7.selectedT.set((timelineView.audioSelected || timelineView.roundSelected || timelineView.collageSelected != i17) ? false : true);
                    if (track7 != timelineView.collageMain) {
                        float f57 = jMin;
                        float fLerp3 = ((((AndroidUtilities.lerp(track7.left, 0.0f, f56) * track7.duration) + (track7.offset - timelineView.scroll)) / f57) * timelineView.sw) + timelineView.px + timelineView.ph;
                        fM3 = (Fragment$$ExternalSyntheticOutline0.m(AndroidUtilities.lerp(track7.right, 1.0f, f56), track7.duration, track7.offset - timelineView.scroll, f57) * timelineView.sw) + timelineView.px + timelineView.ph;
                        f19 = fLerp3;
                    } else {
                        float f58 = timelineView.px + timelineView.ph;
                        long j4 = track7.offset - timelineView.scroll;
                        float f59 = jMin;
                        float f60 = timelineView.sw;
                        float f61 = ((j4 / f59) * f60) + f58;
                        fM3 = zzir.m(j4 + track7.duration, f59, f60, f58);
                        f19 = f61;
                    }
                    canvas2.save();
                    float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), f56);
                    RectF rectF5 = track7.bounds;
                    float f62 = timelineView.ph;
                    rectF5.set(f19 - f62, f55 - fLerp4, fM3 + f62, f55);
                    RectF rectF6 = track7.bounds;
                    f5 = (rectF6.top * f56) + f5;
                    f4 = (rectF6.bottom * f56) + f4;
                    float f63 = track7.offset;
                    float f64 = track7.left;
                    float f65 = track7.duration;
                    f3 += ((f64 * f65) + f63) * f56;
                    f2 += ((track7.right * f65) + f63) * f56;
                    timelineView.collageClipPath.rewind();
                    timelineView.collageClipPath.addRoundRect(track7.bounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(timelineView.collageClipPath);
                    VideoThumbsLoader videoThumbsLoader2 = track7.thumbs;
                    if (videoThumbsLoader2 != null) {
                        long j5 = track7.duration;
                        float f66 = j5 <= 0 ? 0.0f : (((track7.offset - timelineView.scroll) / jMin) * timelineView.sw) + timelineView.px + timelineView.ph;
                        int i18 = timelineView.ph;
                        float f67 = i18;
                        float f68 = f66 - f67;
                        float f69 = (j5 <= 0 ? 0.0f : ((((track7.offset + j5) - timelineView.scroll) / jMin) * timelineView.sw) + timelineView.px + i18) + f67;
                        int i19 = videoThumbsLoader2.frameWidth;
                        float f70 = i19;
                        double dFloor = Math.floor((f68 - ((((track7.offset - timelineView.scroll) / jMin) * timelineView.sw) + (timelineView.px + timelineView.ph))) / f70);
                        f21 = fLerp4;
                        int iMax2 = (int) Math.max(0.0d, dFloor);
                        int iMin2 = (int) Math.min(track7.thumbs.count, Math.ceil((f69 - f68) / f70) + 1.0d);
                        int i20 = (int) track7.bounds.top;
                        boolean z9 = track7.thumbs.frames.size() >= iMin2;
                        f20 = f55;
                        if (!z9) {
                            z5 = z9;
                            break;
                        }
                        int i21 = iMax2;
                        while (true) {
                            if (i21 >= Math.min(track7.thumbs.frames.size(), iMin2)) {
                                z5 = z9;
                                break;
                            } else {
                                if (((VideoThumbsLoader.BitmapFrame) track7.thumbs.frames.get(i21)).bitmap == null) {
                                    z5 = false;
                                    break;
                                }
                                i21++;
                            }
                        }
                        if (!z5) {
                            if (timelineView.blurManager.hasRenderNode()) {
                                timelineView.backgroundBlur.drawRect(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(1073741824);
                            } else {
                                canvas2.drawRect(track7.bounds, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i19 != 0) {
                            int i22 = iMax2;
                            while (i22 < Math.min(track7.thumbs.frames.size(), iMin2)) {
                                VideoThumbsLoader.BitmapFrame bitmapFrame2 = (VideoThumbsLoader.BitmapFrame) track7.thumbs.frames.get(i22);
                                int i23 = i22;
                                if (bitmapFrame2.bitmap != null) {
                                    i3 = i20;
                                    timelineView.collageFramePaint.setAlpha((int) (bitmapFrame2.alpha.set(1.0f) * 255.0f));
                                    Bitmap bitmap2 = bitmapFrame2.bitmap;
                                    canvas2.drawBitmap(bitmap2, f68, i3 - ((int) ((bitmap2.getHeight() - f21) / 2.0f)), timelineView.collageFramePaint);
                                } else {
                                    i3 = i20;
                                }
                                f68 += f70;
                                i22 = i23 + 1;
                                iMin2 = iMin2;
                                i20 = i3;
                            }
                        }
                        if (!z9) {
                            track7.thumbs.load();
                        }
                    } else {
                        f20 = f55;
                        f21 = fLerp4;
                    }
                    timelineView.selectedCollageClipPath.rewind();
                    if (!timelineView.isCover) {
                        RectF rectF7 = AndroidUtilities.rectTmp;
                        int i24 = timelineView.px;
                        int i25 = timelineView.ph;
                        float f71 = i24 + i25;
                        float f72 = track7.left;
                        float f73 = track7.duration;
                        int i26 = i25;
                        float f74 = timelineView.scroll;
                        float f75 = (f72 * f73) - f74;
                        float f76 = track7.offset;
                        float f77 = jMin;
                        float f78 = (f75 + f76) / f77;
                        float f79 = timelineView.sw;
                        float f80 = ((f78 * f79) + f71) - (f72 <= 0.0f ? i26 : 0);
                        RectF rectF8 = track7.bounds;
                        float f81 = rectF8.top;
                        float f82 = track7.right;
                        float f83 = (((((f73 * f82) - f74) + f76) / f77) * f79) + f71;
                        if (f82 < 1.0f) {
                            i26 = 0;
                        }
                        rectF7.set(f80, f81, f83 + i26, rectF8.bottom);
                        timelineView.selectedCollageClipPath.addRoundRect(rectF7, timelineView.selectedVideoRadii, Path.Direction.CW);
                        canvas2.clipPath(timelineView.selectedCollageClipPath, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f55 = f20 - ((fDp * 1.0f) + f21);
                    i17++;
                    fDp = fDp;
                }
                f30 = f55;
                f6 = 1.0f;
            }
            float f84 = fDp;
            float f85 = timelineView.roundT.set(timelineView.hasRound);
            float f86 = timelineView.roundSelectedT.set(timelineView.hasRound && timelineView.roundSelected);
            float roundHeight = timelineView.getRoundHeight() * f85;
            float f87 = ((timelineView.videoTrack == null && !timelineView.hasAudio && timelineView.collageTracks.isEmpty()) ? 1.0f : f86) * f85;
            if (f85 > 0.0f) {
                long j6 = timelineView.roundOffset;
                float f88 = j6;
                f7 = f85;
                float f89 = timelineView.roundLeft;
                long j7 = timelineView.roundDuration;
                float f90 = j7;
                f3 = (((f89 * f90) + f88) * f87) + f3;
                f2 += ((timelineView.roundRight * f90) + f88) * f87;
                if (timelineView.videoTrack != null) {
                    float f91 = jMin;
                    fLerp2 = ((((AndroidUtilities.lerp(f89, 0.0f, f86) * timelineView.roundDuration) + (j6 - timelineView.scroll)) / f91) * timelineView.sw) + timelineView.px + timelineView.ph;
                    fM2 = (Fragment$$ExternalSyntheticOutline0.m(AndroidUtilities.lerp(timelineView.roundRight, 1.0f, f86), timelineView.roundDuration, timelineView.roundOffset - timelineView.scroll, f91) * timelineView.sw) + timelineView.px + timelineView.ph;
                } else {
                    float f92 = timelineView.px + timelineView.ph;
                    long j8 = j6 - timelineView.scroll;
                    float f93 = jMin;
                    float f94 = timelineView.sw;
                    float f95 = ((j8 / f93) * f94) + f92;
                    fM2 = zzir.m(j8 + j7, f93, f94, f92);
                    fLerp2 = f95;
                }
                RectF rectF9 = timelineView.roundBounds;
                float f96 = timelineView.ph;
                rectF9.set(fLerp2 - f96, f30 - roundHeight, fM2 + f96, f30);
                float f97 = f30 - ((f84 * f7) + roundHeight);
                RectF rectF10 = timelineView.roundBounds;
                f5 = (rectF10.top * f87) + f5;
                f4 = (rectF10.bottom * f87) + f4;
                timelineView.roundClipPath.rewind();
                timelineView.roundClipPath.addRoundRect(timelineView.roundBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(timelineView.roundClipPath);
                VideoThumbsLoader videoThumbsLoader3 = timelineView.roundThumbs;
                if (videoThumbsLoader3 != null) {
                    long j9 = timelineView.roundDuration;
                    float f98 = j9 <= 0 ? 0.0f : (((timelineView.roundOffset - timelineView.scroll) / jMin) * timelineView.sw) + timelineView.px + timelineView.ph;
                    int i27 = timelineView.ph;
                    float f99 = i27;
                    float f100 = f98 - f99;
                    float f101 = (j9 <= 0 ? 0.0f : timelineView.px + i27 + ((((timelineView.roundOffset + j9) - timelineView.scroll) / jMin) * timelineView.sw)) + f99;
                    int i28 = videoThumbsLoader3.frameWidth;
                    float f102 = i28;
                    int iMax3 = (int) Math.max(0.0d, Math.floor((f100 - (timelineView.videoTrack != null ? (((timelineView.roundOffset - timelineView.scroll) / jMin) * timelineView.sw) + (timelineView.px + timelineView.ph) : timelineView.px)) / f102));
                    int iMin3 = (int) Math.min(timelineView.roundThumbs.count, Math.ceil((f101 - f100) / f102) + 1.0d);
                    int i29 = (int) timelineView.roundBounds.top;
                    boolean z10 = timelineView.roundThumbs.frames.size() >= iMin3;
                    if (!z10) {
                        z4 = z10;
                        break;
                    }
                    int i30 = iMax3;
                    while (true) {
                        if (i30 >= Math.min(timelineView.roundThumbs.frames.size(), iMin3)) {
                            z4 = z10;
                            break;
                        } else {
                            if (((VideoThumbsLoader.BitmapFrame) timelineView.roundThumbs.frames.get(i30)).bitmap == null) {
                                z4 = false;
                                break;
                            }
                            i30++;
                        }
                    }
                    if (!z4) {
                        if (timelineView.blurManager.hasRenderNode()) {
                            timelineView.backgroundBlur.drawRect(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(1073741824);
                        } else {
                            canvas2.drawRect(timelineView.roundBounds, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i28 != 0) {
                        float f103 = f100;
                        while (iMax3 < Math.min(timelineView.roundThumbs.frames.size(), iMin3)) {
                            VideoThumbsLoader.BitmapFrame bitmapFrame3 = (VideoThumbsLoader.BitmapFrame) timelineView.roundThumbs.frames.get(iMax3);
                            if (bitmapFrame3.bitmap != null) {
                                timelineView.videoFramePaint.setAlpha((int) (bitmapFrame3.alpha.set(1.0f) * 255.0f));
                                Bitmap bitmap3 = bitmapFrame3.bitmap;
                                canvas2.drawBitmap(bitmap3, f103, i29 - ((int) ((bitmap3.getHeight() - roundHeight) / 2.0f)), timelineView.videoFramePaint);
                            }
                            f103 += f102;
                            iMax3++;
                            iMin3 = iMin3;
                        }
                    }
                    if (!z10) {
                        timelineView.roundThumbs.load();
                    }
                } else {
                    f97 = f97;
                }
                timelineView.selectedVideoClipPath.rewind();
                RectF rectF11 = AndroidUtilities.rectTmp;
                int i31 = timelineView.px;
                int i32 = timelineView.ph;
                float f104 = i31 + i32;
                float f105 = timelineView.roundLeft;
                float f106 = timelineView.roundDuration;
                float f107 = timelineView.scroll;
                float f108 = (f105 * f106) - f107;
                float f109 = timelineView.roundOffset;
                float f110 = jMin;
                float f111 = timelineView.sw;
                float f112 = (1.0f - f86) * i32;
                float f113 = (((((f108 + f109) / f110) * f111) + f104) - (f105 <= 0.0f ? i32 : 0)) - f112;
                RectF rectF12 = timelineView.roundBounds;
                float f114 = rectF12.top;
                float f115 = timelineView.roundRight;
                rectF11.set(f113, f114, (((((f106 * f115) - f107) + f109) / f110) * f111) + f104 + (f115 >= 1.0f ? i32 : 0) + f112, rectF12.bottom);
                timelineView.selectedVideoClipPath.addRoundRect(rectF11, timelineView.selectedVideoRadii, Path.Direction.CW);
                canvas2.clipPath(timelineView.selectedVideoClipPath, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f30 = f97;
            } else {
                f7 = f85;
                f86 = f86;
            }
            float f116 = timelineView.audioT.set(timelineView.hasAudio);
            float f117 = timelineView.audioSelectedT.set(timelineView.hasAudio && timelineView.audioSelected);
            float audioHeight = timelineView.getAudioHeight() * f116;
            float f118 = ((timelineView.videoTrack == null && !timelineView.hasRound && timelineView.collageTracks.isEmpty()) ? 1.0f : f117) * f116;
            if (f116 > 0.0f) {
                float f119 = timelineView.audioOffset;
                float f120 = timelineView.audioLeft;
                float f121 = timelineView.audioDuration;
                float f122 = (((f120 * f121) + f119) * f118) + f3;
                float f123 = f2 + (((timelineView.audioRight * f121) + f119) * f118);
                Paint paint3 = timelineView.audioBlur.getPaint(f116);
                canvas2.save();
                if (timelineView.videoTrack == null && !timelineView.hasRound && timelineView.collageTracks.isEmpty()) {
                    float f124 = timelineView.px + timelineView.ph;
                    long j10 = timelineView.audioOffset - timelineView.scroll;
                    float f125 = jMin;
                    float f126 = timelineView.sw;
                    float f127 = ((j10 / f125) * f126) + f124;
                    fM = zzir.m(j10 + timelineView.audioDuration, f125, f126, f124);
                    f14 = f127;
                } else {
                    float f128 = jMin;
                    float fLerp5 = timelineView.px + timelineView.ph + ((((AndroidUtilities.lerp(timelineView.audioLeft, 0.0f, f117) * timelineView.audioDuration) + (timelineView.audioOffset - timelineView.scroll)) / f128) * timelineView.sw);
                    fM = (Fragment$$ExternalSyntheticOutline0.m(AndroidUtilities.lerp(timelineView.audioRight, 1.0f, f117), timelineView.audioDuration, timelineView.audioOffset - timelineView.scroll, f128) * timelineView.sw) + timelineView.px + timelineView.ph;
                    f14 = fLerp5;
                }
                float f129 = fM;
                RectF rectF13 = timelineView.audioBounds;
                float f130 = timelineView.ph;
                rectF13.set(f14 - f130, f30 - audioHeight, f130 + f129, f30);
                RectF rectF14 = timelineView.audioBounds;
                f5 = (rectF14.top * f118) + f5;
                f4 = (rectF14.bottom * f118) + f4;
                timelineView.audioClipPath.rewind();
                timelineView.audioClipPath.addRoundRect(timelineView.audioBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(timelineView.audioClipPath);
                BlurringShader.BlurManager blurManager3 = timelineView.blurManager;
                if (blurManager3 != null && blurManager3.hasRenderNode()) {
                    timelineView.backgroundBlur.drawRect(canvas2);
                    canvas2.drawColor(Theme.multAlpha(f116, 855638016));
                } else if (paint3 == null) {
                    canvas2.drawColor(Theme.multAlpha(f116, 1073741824));
                } else {
                    canvas2.drawRect(timelineView.audioBounds, paint3);
                    canvas2.drawColor(Theme.multAlpha(f116, 855638016));
                }
                if (timelineView.waveform == null || (blurManager = timelineView.blurManager) == null || !blurManager.hasRenderNode()) {
                    f15 = f117;
                    j2 = jMin;
                    if (timelineView.waveform != null && paint3 != null) {
                        Paint paint4 = timelineView.audioWaveformBlur.getPaint(f116 * 0.4f);
                        if (paint4 == null) {
                            paint4 = timelineView.waveformPaint;
                            paint4.setAlpha((int) (64.0f * f116));
                        }
                        float f131 = timelineView.waveformMax.set(timelineView.waveform.max, !timelineView.waveformIsLoaded);
                        AudioWaveformLoader audioWaveformLoader = timelineView.waveform;
                        timelineView.waveformIsLoaded = audioWaveformLoader.loaded > 0;
                        timelineView.waveformPath.check((((timelineView.audioOffset - timelineView.scroll) / j2) * timelineView.sw) + timelineView.px + timelineView.ph, f14, f129, f15, j2, audioHeight, f131, timelineView.audioBounds.bottom, audioWaveformLoader);
                        f8 = f15;
                        j = j2;
                        canvas2.drawPath(timelineView.waveformPath, paint4);
                    }
                    if (f8 < 1.0f) {
                        int i33 = timelineView.px;
                        float f132 = timelineView.ph + i33;
                        float f133 = timelineView.audioOffset - timelineView.scroll;
                        float f134 = timelineView.audioLeft;
                        float f135 = timelineView.audioDuration;
                        float f136 = j;
                        float f137 = timelineView.sw;
                        float f138 = ((((f134 * f135) + f133) / f136) * f137) + f132;
                        float f139 = ((((timelineView.audioRight * f135) + f133) / f136) * f137) + f132;
                        float fMin2 = (Math.min(timelineView.w - timelineView.px, f139) + Math.max(i33, f138)) / 2.0f;
                        fCenterY = timelineView.audioBounds.centerY();
                        fMax2 = Math.max(0.0f, (Math.min(timelineView.w - timelineView.px, f139) - Math.max(timelineView.px, f138)) - AndroidUtilities.dp(24.0f));
                        float fDpf5 = AndroidUtilities.dpf2(13.0f);
                        if (timelineView.audioAuthor == null || timelineView.audioTitle != null) {
                            fDpf2 = timelineView.audioTitleWidth + AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + timelineView.audioAuthorWidth;
                        } else {
                            fDpf2 = 0.0f;
                        }
                        f16 = fDpf5 + fDpf2;
                        if (f16 < fMax2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        float fMin3 = fMin2 - (Math.min(f16, fMax2) / 2.0f);
                        timelineView.audioIcon.setBounds((int) fMin3, (int) (fCenterY - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + fMin3), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + fCenterY));
                        f17 = 1.0f - f8;
                        f18 = f17 * 255.0f;
                        timelineView.audioIcon.setAlpha((int) f18);
                        timelineView.audioIcon.draw(canvas2);
                        fDpf3 = AndroidUtilities.dpf2(16.11f) + fMin3;
                        z3 = z2;
                        f10 = f116;
                        d = 0.0d;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, timelineView.w, timelineView.h, 255, 31);
                        fMin = Math.min(f139, timelineView.w) - AndroidUtilities.dp(12.0f);
                        canvas2.clipRect(fDpf3, 0.0f, fMin, timelineView.h);
                        if (timelineView.audioAuthor != null) {
                            canvas2.save();
                            canvas2.translate(fDpf3 - timelineView.audioAuthorLeft, fCenterY - (timelineView.audioAuthor.getHeight() / 2.0f));
                            timelineView.audioAuthorPaint.setAlpha((int) (f18 * f10));
                            timelineView.audioAuthor.draw(canvas2);
                            canvas2.restore();
                            fDpf4 = fDpf3 + timelineView.audioAuthorWidth;
                        } else {
                            fDpf4 = fDpf3;
                        }
                        if (timelineView.audioAuthor != null && timelineView.audioTitle != null) {
                            float fDpf6 = AndroidUtilities.dpf2(3.66f) + fDpf4;
                            int alpha = timelineView.audioDotPaint.getAlpha();
                            timelineView.audioDotPaint.setAlpha((int) (alpha * f17));
                            canvas2.drawCircle(AndroidUtilities.dp(1.0f) + fDpf6, fCenterY, AndroidUtilities.dp(1.0f), timelineView.audioDotPaint);
                            timelineView.audioDotPaint.setAlpha(alpha);
                            fDpf4 = AndroidUtilities.dpf2(2.0f) + fDpf6 + AndroidUtilities.dpf2(4.0f);
                        }
                        if (timelineView.audioTitle != null) {
                            canvas2.save();
                            canvas2.translate(fDpf4 - timelineView.audioTitleLeft, fCenterY - (timelineView.audioTitle.getHeight() / 2.0f));
                            timelineView.audioTitlePaint.setAlpha((int) (f18 * f10));
                            timelineView.audioTitle.draw(canvas2);
                            canvas2.restore();
                        }
                        if (!z3) {
                            timelineView.ellipsizeMatrix.reset();
                            timelineView.ellipsizeMatrix.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                            timelineView.ellipsizeMatrix.postTranslate(fMin - AndroidUtilities.dp(8.0f), 0.0f);
                            timelineView.ellipsizeGradient.setLocalMatrix(timelineView.ellipsizeMatrix);
                            float fDp2 = fMin - AndroidUtilities.dp(8.0f);
                            RectF rectF15 = timelineView.audioBounds;
                            canvas2.drawRect(fDp2, rectF15.top, fMin, rectF15.bottom, timelineView.ellipsizePaint);
                        }
                        canvas.restore();
                    } else {
                        f10 = f116;
                        d = 0.0d;
                    }
                    canvas.restore();
                    f9 = f122;
                    f2 = f123;
                } else {
                    float f140 = timelineView.waveformMax.set(timelineView.waveform.max, !timelineView.waveformIsLoaded);
                    AudioWaveformLoader audioWaveformLoader2 = timelineView.waveform;
                    timelineView.waveformIsLoaded = audioWaveformLoader2.loaded > 0;
                    f15 = f117;
                    timelineView.waveformPath.check((((timelineView.audioOffset - timelineView.scroll) / jMin) * timelineView.sw) + timelineView.px + timelineView.ph, f14, f129, f15, jMin, audioHeight, f140, timelineView.audioBounds.bottom, audioWaveformLoader2);
                    j2 = jMin;
                    canvas2.saveLayerAlpha(timelineView.audioBounds, 102, 31);
                    canvas2.clipPath(timelineView.waveformPath);
                    timelineView.audioWaveformBlur.drawRect(canvas2);
                    canvas2.restore();
                }
                j = j2;
                f8 = f15;
                if (f8 < 1.0f) {
                    int i34 = timelineView.px;
                    float f1310 = timelineView.ph + i34;
                    float f1311 = timelineView.audioOffset - timelineView.scroll;
                    float f1312 = timelineView.audioLeft;
                    float f1313 = timelineView.audioDuration;
                    float f1314 = j;
                    float f1315 = timelineView.sw;
                    float f1316 = ((((f1312 * f1313) + f1311) / f1314) * f1315) + f1310;
                    float f1317 = ((((timelineView.audioRight * f1313) + f1311) / f1314) * f1315) + f1310;
                    float fMin4 = (Math.min(timelineView.w - timelineView.px, f1317) + Math.max(i34, f1316)) / 2.0f;
                    fCenterY = timelineView.audioBounds.centerY();
                    fMax2 = Math.max(0.0f, (Math.min(timelineView.w - timelineView.px, f1317) - Math.max(timelineView.px, f1316)) - AndroidUtilities.dp(24.0f));
                    float fDpf7 = AndroidUtilities.dpf2(13.0f);
                    if (timelineView.audioAuthor == null) {
                        fDpf2 = timelineView.audioTitleWidth + AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + timelineView.audioAuthorWidth;
                    } else {
                        fDpf2 = timelineView.audioTitleWidth + AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + timelineView.audioAuthorWidth;
                    }
                    f16 = fDpf7 + fDpf2;
                    if (f16 < fMax2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    float fMin5 = fMin4 - (Math.min(f16, fMax2) / 2.0f);
                    timelineView.audioIcon.setBounds((int) fMin5, (int) (fCenterY - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + fMin5), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + fCenterY));
                    f17 = 1.0f - f8;
                    f18 = f17 * 255.0f;
                    timelineView.audioIcon.setAlpha((int) f18);
                    timelineView.audioIcon.draw(canvas2);
                    fDpf3 = AndroidUtilities.dpf2(16.11f) + fMin5;
                    z3 = z2;
                    f10 = f116;
                    d = 0.0d;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, timelineView.w, timelineView.h, 255, 31);
                    fMin = Math.min(f1317, timelineView.w) - AndroidUtilities.dp(12.0f);
                    canvas2.clipRect(fDpf3, 0.0f, fMin, timelineView.h);
                    if (timelineView.audioAuthor != null) {
                        canvas2.save();
                        canvas2.translate(fDpf3 - timelineView.audioAuthorLeft, fCenterY - (timelineView.audioAuthor.getHeight() / 2.0f));
                        timelineView.audioAuthorPaint.setAlpha((int) (f18 * f10));
                        timelineView.audioAuthor.draw(canvas2);
                        canvas2.restore();
                        fDpf4 = fDpf3 + timelineView.audioAuthorWidth;
                    } else {
                        fDpf4 = fDpf3;
                    }
                    if (timelineView.audioAuthor != null) {
                        float fDpf8 = AndroidUtilities.dpf2(3.66f) + fDpf4;
                        int alpha2 = timelineView.audioDotPaint.getAlpha();
                        timelineView.audioDotPaint.setAlpha((int) (alpha2 * f17));
                        canvas2.drawCircle(AndroidUtilities.dp(1.0f) + fDpf8, fCenterY, AndroidUtilities.dp(1.0f), timelineView.audioDotPaint);
                        timelineView.audioDotPaint.setAlpha(alpha2);
                        fDpf4 = AndroidUtilities.dpf2(2.0f) + fDpf8 + AndroidUtilities.dpf2(4.0f);
                    }
                    if (timelineView.audioTitle != null) {
                        canvas2.save();
                        canvas2.translate(fDpf4 - timelineView.audioTitleLeft, fCenterY - (timelineView.audioTitle.getHeight() / 2.0f));
                        timelineView.audioTitlePaint.setAlpha((int) (f18 * f10));
                        timelineView.audioTitle.draw(canvas2);
                        canvas2.restore();
                    }
                    if (!z3) {
                        timelineView.ellipsizeMatrix.reset();
                        timelineView.ellipsizeMatrix.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                        timelineView.ellipsizeMatrix.postTranslate(fMin - AndroidUtilities.dp(8.0f), 0.0f);
                        timelineView.ellipsizeGradient.setLocalMatrix(timelineView.ellipsizeMatrix);
                        float fDp3 = fMin - AndroidUtilities.dp(8.0f);
                        RectF rectF16 = timelineView.audioBounds;
                        canvas2.drawRect(fDp3, rectF16.top, fMin, rectF16.bottom, timelineView.ellipsizePaint);
                    }
                    canvas.restore();
                } else {
                    f10 = f116;
                    d = 0.0d;
                }
                canvas.restore();
                f9 = f122;
                f2 = f123;
            } else {
                f8 = f117;
                f6 = f6;
                paint = paint;
                j = jMin;
                f9 = f3;
                f32 = f32;
                f31 = f31;
                f7 = f7;
                d = 0.0d;
                f10 = f116;
            }
            float f141 = f4;
            float f142 = f5;
            float f143 = timelineView.px + timelineView.ph;
            float f144 = timelineView.scroll;
            float f145 = j;
            float f146 = timelineView.sw;
            float f147 = (((f9 - f144) / f145) * f146) + f143;
            float f148 = (((f2 - f144) / f145) * f146) + f143;
            float fMax3 = timelineView.collageTracks.isEmpty() ? (timelineView.hasAudio && timelineView.videoTrack == null) ? f10 : Math.max(f32, f7) : f6;
            if (f10 > d || f7 > d || f32 > d || f6 > d) {
                if (timelineView.videoTrack == null && !timelineView.hasRound && timelineView.collageTracks.isEmpty()) {
                    f11 = f8;
                    fLerp = AndroidUtilities.lerp(0.6f, 1.0f, f11) * f10;
                } else {
                    f11 = f8;
                    fLerp = 1.0f;
                }
                Paint paint5 = paint;
                timelineView.drawRegion(canvas, paint5, f142, f141, f147, f148, fLerp * fMax3);
                Track track8 = timelineView.videoTrack;
                if (track8 != null && ((timelineView.hasAudio || timelineView.hasRound) && (f11 > 0.0f || f86 > 0.0f))) {
                    float f149 = timelineView.h - timelineView.py;
                    float f150 = timelineView.ph + timelineView.px;
                    float f151 = track8.left;
                    float f152 = track8.duration;
                    float f153 = timelineView.scroll;
                    float f154 = timelineView.sw;
                    float f155 = ((((track8.right * f152) - f153) / f145) * f154) + f150;
                    canvas3 = canvas;
                    timelineView.drawRegion(canvas3, paint5, f149 - videoHeight, f149, ((((f151 * f152) - f153) / f145) * f154) + f150, f155, 0.8f);
                } else if (timelineView.collageMain == null || timelineView.collageTracks.size() <= 1) {
                    canvas3 = canvas;
                } else {
                    Track track9 = timelineView.collageMain;
                    RectF rectF17 = track9.bounds;
                    float f156 = rectF17.top;
                    float f157 = rectF17.bottom;
                    float f158 = timelineView.ph + timelineView.px;
                    float f159 = track9.offset;
                    float f160 = track9.left;
                    float f161 = track9.duration;
                    float f162 = timelineView.scroll;
                    float f163 = timelineView.sw;
                    float f164 = (((((f160 * f161) + f159) - f162) / f145) * f163) + f158;
                    float f165 = (((((track9.right * f161) + f159) - f162) / f145) * f163) + f158;
                    canvas3 = canvas;
                    timelineView.drawRegion(canvas3, paint5, f156, f157, f164, f165, 0.8f);
                }
                if (timelineView.maxCount > 1 && (track3 = timelineView.videoTrack) != null) {
                    float f166 = track3.duration;
                    float f167 = track3.right;
                    float f168 = track3.left;
                    long j11 = (long) ((f167 - f168) * f166);
                    if (j11 > 68999) {
                        float f169 = timelineView.px + timelineView.ph;
                        float f170 = timelineView.scroll;
                        float f171 = timelineView.sw;
                        float f172 = ((((f168 * f166) - f170) / f145) * f171) + f169;
                        float f173 = ((((f167 * f166) - f170) / f145) * f171) + f169;
                        canvas3.save();
                        float f174 = timelineView.h - timelineView.py;
                        canvas3.clipRect(f172, f174 - videoHeight, f173, f174);
                        timelineView.regionPaint.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f31) * 255.0f));
                        long j12 = 59000;
                        int iMin4 = (int) Math.min(timelineView.maxCount - 1, j11 / 59000);
                        int i35 = 1;
                        while (i35 <= iMin4) {
                            long j13 = ((long) i35) * j12;
                            if (Math.min(j12, j11 - j13) < 1000) {
                                break;
                            }
                            float f175 = timelineView.px + timelineView.ph;
                            Track track10 = timelineView.videoTrack;
                            float f176 = ((((((long) (track10.duration * track10.left)) + j13) - timelineView.scroll) / f145) * timelineView.sw) + f175;
                            int i36 = i35;
                            canvas.drawRect(f176, (timelineView.h - timelineView.py) - videoHeight, AndroidUtilities.dp(1.0f) + f176, timelineView.h - timelineView.py, timelineView.regionPaint);
                            canvas3 = canvas;
                            StringBuilder sb = new StringBuilder("#");
                            int i37 = i36 + 1;
                            sb.append(i37);
                            canvas3.drawText(sb.toString(), f176 + AndroidUtilities.dp(2.0f), ((timelineView.h - timelineView.py) - videoHeight) + AndroidUtilities.dp(14.0f), timelineView.countTextPaint);
                            i35 = i37;
                            j12 = 59000;
                        }
                        canvas3.restore();
                    }
                }
                float f177 = timelineView.loopProgress.set(0.0f);
                float contentHeight = ((timelineView.h - timelineView.getContentHeight()) + timelineView.py) - AndroidUtilities.dpf2(2.3f);
                float fDpf9 = AndroidUtilities.dpf2(4.3f) + (timelineView.h - timelineView.py);
                if (f177 > 0.0f) {
                    long j14 = timelineView.loopProgressFrom;
                    if (j14 == -1) {
                        Track track11 = timelineView.videoTrack;
                        if (track11 != null) {
                            j14 = (long) (track11.duration * track11.right);
                        } else {
                            Track track12 = timelineView.collageMain;
                            if (track12 != null) {
                                j14 = (long) ((track12.right - track12.left) * track12.duration);
                            } else {
                                if (timelineView.hasRound) {
                                    f12 = timelineView.roundDuration;
                                    f13 = timelineView.roundRight;
                                } else {
                                    f12 = timelineView.audioDuration;
                                    f13 = timelineView.audioRight;
                                }
                                j14 = (long) (f12 * f13);
                            }
                        }
                    }
                    timelineView = this;
                    timelineView.drawProgress(canvas3, contentHeight, fDpf9, j14, f177 * fMax3);
                } else {
                    timelineView = timelineView;
                }
                timelineView.drawProgress(canvas, contentHeight, fDpf9, timelineView.progress, (1.0f - f177) * fMax3);
            }
            if (z) {
                canvas.restore();
            }
        } else {
            j = jMin;
        }
        if (timelineView.dragged) {
            float f178 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float fDp4 = (AndroidUtilities.dp(32.0f) / timelineView.sw) * j * f178;
            float f179 = timelineView.dragSpeed;
            long j15 = (long) (fDp4 * f179);
            if (timelineView.isCover) {
                timelineView.dragSpeed = (f178 * 0.25f) + f179;
            }
            int i38 = timelineView.pressHandle;
            if (i38 == 4 && (track2 = timelineView.videoTrack) != null) {
                float f180 = track2.left;
                long j16 = timelineView.scroll;
                long j17 = track2.duration;
                float f181 = j17;
                if (f180 < j16 / f181) {
                    i2 = -1;
                } else if (track2.right > (j16 + j) / f181) {
                    i2 = 1;
                } else {
                    timelineView.dragSpeed = 1.0f;
                    i2 = 0;
                }
                long j18 = ((long) i2) * j15;
                long jClamp = Utilities.clamp(j16 + j18, j17 - j, 0L);
                timelineView.scroll = jClamp;
                timelineView.progress += j18;
                Track track13 = timelineView.videoTrack;
                float f182 = (jClamp - j16) / track13.duration;
                if (f182 > 0.0f) {
                    f = 1.0f;
                    fMax = Math.min(1.0f - track13.right, f182);
                } else {
                    f = 1.0f;
                    fMax = Math.max(0.0f - track13.left, f182);
                }
                Track track14 = timelineView.videoTrack;
                track14.left = Utilities.clamp(track14.left + fMax, f, 0.0f);
                Track track15 = timelineView.videoTrack;
                track15.right = Utilities.clamp(track15.right + fMax, f, 0.0f);
                TimelineDelegate timelineDelegate = timelineView.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onVideoLeftChange(false, timelineView.videoTrack.left);
                    timelineView.delegate.onVideoRightChange(false, timelineView.videoTrack.right);
                }
                timelineView.invalidate();
            } else if (i38 == 8) {
                float f183 = timelineView.audioLeft;
                long j19 = timelineView.audioOffset;
                long j20 = -j19;
                float f184 = j20 + 100;
                long j21 = timelineView.audioDuration;
                float f185 = j21;
                if (f183 < f184 / f185) {
                    i = -1;
                } else if (timelineView.audioRight >= ((j20 + j) - 100) / f185) {
                    i = 1;
                } else {
                    timelineView.dragSpeed = 1.0f;
                    i = 0;
                }
                if (i != 0) {
                    if (timelineView.audioSelected && (track = timelineView.videoTrack) != null) {
                        long j22 = j19 - (((long) i) * j15);
                        float f186 = track.right;
                        float f187 = track.duration;
                        timelineView.audioOffset = Utilities.clamp(j22, (long) ((f186 * f187) - (f183 * f185)), (long) ((track.left * f187) - (timelineView.audioRight * f185)));
                    } else if (timelineView.roundSelected && timelineView.hasRound) {
                        long j23 = j19 - (((long) i) * j15);
                        float f188 = timelineView.roundRight;
                        float f189 = timelineView.roundDuration;
                        timelineView.audioOffset = Utilities.clamp(j23, (long) ((f188 * f189) - (f183 * f185)), (long) ((timelineView.roundLeft * f189) - (timelineView.audioRight * f185)));
                    } else {
                        timelineView.audioOffset = Utilities.clamp(j19 - (((long) i) * j15), 0L, -(j21 - Math.min(timelineView.getBaseDuration(), timelineView.getMaxScrollDuration())));
                    }
                    float f190 = (-(timelineView.audioOffset - j19)) / timelineView.audioDuration;
                    float fMin6 = f190 > 0.0f ? Math.min(1.0f - timelineView.audioRight, f190) : Math.max(0.0f - timelineView.audioLeft, f190);
                    if (timelineView.videoTrack == null) {
                        float f191 = timelineView.progress;
                        float f192 = timelineView.audioDuration;
                        timelineView.progress = (long) Utilities.clamp((fMin6 * f192) + f191, f192, 0.0f);
                    }
                    timelineView.audioLeft = Utilities.clamp(timelineView.audioLeft + fMin6, 1.0f, 0.0f);
                    timelineView.audioRight = Utilities.clamp(timelineView.audioRight + fMin6, 1.0f, 0.0f);
                    TimelineDelegate timelineDelegate2 = timelineView.delegate;
                    if (timelineDelegate2 != null) {
                        timelineDelegate2.onAudioLeftChange(timelineView.audioLeft);
                        timelineView.delegate.onAudioRightChange(timelineView.audioRight);
                        timelineView.delegate.onProgressChange(timelineView.progress, false);
                    }
                    timelineView.invalidate();
                } else {
                    timelineView.dragSpeed = 1.0f;
                }
            } else {
                timelineView.dragSpeed = 1.0f;
            }
        } else {
            timelineView.dragSpeed = 1.0f;
        }
        int contentHeight2 = timelineView.getContentHeight();
        if (timelineView.lastHeight != contentHeight2) {
            timelineView.lastHeight = contentHeight2;
            Runnable runnable = timelineView.onHeightChange;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void drawProgress(Canvas canvas, float f, float f2, long j, float f3) {
        float f4;
        if (this.isCover) {
            return;
        }
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        float fClamp = Utilities.clamp(j, getBaseDuration(), 0L);
        Track track = this.collageMain;
        if (track != null) {
            f4 = (track.left * track.duration) + track.offset;
        } else {
            f4 = this.videoTrack == null ? this.audioOffset : 0L;
        }
        float f5 = (this.sw * (((fClamp + f4) - this.scroll) / jMin)) + this.px + this.ph;
        float f6 = (1.0f - f3) * (((f2 - f) / 2.0f) / 2.0f);
        float f7 = f + f6;
        float f8 = f2 - f6;
        Paint paint = this.progressShadowPaint;
        paint.setAlpha((int) (38.0f * f3));
        Paint paint2 = this.progressWhitePaint;
        paint2.setAlpha((int) (f3 * 255.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f5 - AndroidUtilities.dpf2(1.5f), f7, AndroidUtilities.dpf2(1.5f) + f5, f8);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        rectF.set(f5 - AndroidUtilities.dpf2(1.5f), f7, AndroidUtilities.dpf2(1.5f) + f5, f8);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
    }

    public final void drawRegion(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5) {
        if (f5 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f3 - AndroidUtilities.dp(10.0f), f, AndroidUtilities.dp(10.0f) + f4, f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, 255, 31);
        Paint paint2 = this.regionPaint;
        int i = (int) (255.0f * f5);
        paint2.setAlpha(i);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.inset(AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f), AndroidUtilities.dp(2.0f));
        boolean z = this.isCover;
        Paint paint3 = this.regionCutPaint;
        if (z) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(10.0f);
        Paint paint4 = this.regionHandlePaint;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(255);
        paint5.setAlpha(i);
        float f6 = f + f2;
        float f7 = (f6 - fDp2) / 2.0f;
        float f8 = (f6 + fDp2) / 2.0f;
        rectF.set(ImageReceiver$$ExternalSyntheticOutline1.m(AndroidUtilities.dp(this.isCover ? 2.0f : 10.0f), fDp, 2.0f, f3), f7, f3 - ((AndroidUtilities.dp(this.isCover ? 2.0f : 10.0f) + fDp) / 2.0f), f8);
        if (!this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null && !this.isCover) {
                paint4.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        rectF.set(ImageReceiver$$ExternalSyntheticOutline0.m(AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f), fDp, 2.0f, f4), f7, AacUtil.m(AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f), fDp, 2.0f, f4), f8);
        if (!this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        canvas.restore();
    }

    public int getContentHeight() {
        float fDp = 0.0f;
        float videoHeight = this.py + (this.videoTrack != null ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.collageTracks.isEmpty() ? 0.0f : getCollageHeight() + AndroidUtilities.dp(4.0f)) + (this.hasRound ? getRoundHeight() + AndroidUtilities.dp(4.0f) : 0.0f);
        if (this.hasAudio) {
            fDp = AndroidUtilities.dp(4.0f) + getAudioHeight();
        }
        return (int) (videoHeight + fDp + this.py);
    }

    public int getMaxCount() {
        return this.maxCount;
    }

    public long getMaxScrollDuration() {
        if (this.collageTracks.isEmpty()) {
            return Math.max(120000L, (long) (((long) this.maxCount) * 59000 * 1.5f));
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.py + this.py, getContentHeight(), this.openT.get());
    }

    public final void lambda$new$6(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, StoryRecorder.AnonymousClass3 anonymousClass3) {
        int i;
        int i2 = this.pressType;
        try {
            if (i2 == 2 && this.hasAudio) {
                final int i3 = 0;
                SliderView onValueChange = new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.audioVolume).setOnValueChange(new Utilities.Callback(this) {
                    public final TimelineView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f = (Float) obj;
                        switch (i3) {
                            case 0:
                                TimelineView timelineView = this.f$0;
                                timelineView.getClass();
                                timelineView.audioVolume = f.floatValue();
                                TimelineView.TimelineDelegate timelineDelegate = timelineView.delegate;
                                if (timelineDelegate != null) {
                                    timelineDelegate.onAudioVolumeChange(f.floatValue());
                                }
                                break;
                            case 1:
                                TimelineView timelineView2 = this.f$0;
                                timelineView2.getClass();
                                timelineView2.roundVolume = f.floatValue();
                                TimelineView.TimelineDelegate timelineDelegate2 = timelineView2.delegate;
                                if (timelineDelegate2 != null) {
                                    timelineDelegate2.onRoundVolumeChange(f.floatValue());
                                }
                                break;
                            default:
                                TimelineView timelineView3 = this.f$0;
                                timelineView3.videoTrack.volume = f.floatValue();
                                TimelineView.TimelineDelegate timelineDelegate3 = timelineView3.delegate;
                                if (timelineDelegate3 != null) {
                                    timelineDelegate3.onVideoVolumeChange(f.floatValue());
                                }
                                break;
                        }
                    }
                });
                long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
                int i4 = this.w;
                int i5 = this.px;
                int i6 = this.ph;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new TimelineView$$ExternalSyntheticLambda1(this, 1)).setGravity(5).forceTop(true).translate((-(this.w - Math.min((i4 - i5) - i6, ((((AndroidUtilities.lerp(this.audioRight, 1.0f, this.audioSelectedT.get()) * this.audioDuration) + (this.audioOffset - this.scroll)) / jMin) * this.sw) + (i5 + i6)))) + AndroidUtilities.dp(18.0f), this.audioBounds.top).show().setBlurBackground(blurManager, -anonymousClass3.getX(), -anonymousClass3.getY());
                performHapticFeedback(0, 1);
                return;
            }
            if (i2 == 1 && this.hasRound) {
                final int i7 = 1;
                SliderView onValueChange2 = new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.roundVolume).setOnValueChange(new Utilities.Callback(this) {
                    public final TimelineView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f = (Float) obj;
                        switch (i7) {
                            case 0:
                                TimelineView timelineView = this.f$0;
                                timelineView.getClass();
                                timelineView.audioVolume = f.floatValue();
                                TimelineView.TimelineDelegate timelineDelegate = timelineView.delegate;
                                if (timelineDelegate != null) {
                                    timelineDelegate.onAudioVolumeChange(f.floatValue());
                                }
                                break;
                            case 1:
                                TimelineView timelineView2 = this.f$0;
                                timelineView2.getClass();
                                timelineView2.roundVolume = f.floatValue();
                                TimelineView.TimelineDelegate timelineDelegate2 = timelineView2.delegate;
                                if (timelineDelegate2 != null) {
                                    timelineDelegate2.onRoundVolumeChange(f.floatValue());
                                }
                                break;
                            default:
                                TimelineView timelineView3 = this.f$0;
                                timelineView3.videoTrack.volume = f.floatValue();
                                TimelineView.TimelineDelegate timelineDelegate3 = timelineView3.delegate;
                                if (timelineDelegate3 != null) {
                                    timelineDelegate3.onVideoVolumeChange(f.floatValue());
                                }
                                break;
                        }
                    }
                });
                long jMin2 = Math.min(getBaseDuration(), getMaxScrollDuration());
                int i8 = this.w;
                int i9 = this.px;
                int i10 = this.ph;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange2).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new TimelineView$$ExternalSyntheticLambda1(this, 2)).setGravity(5).forceTop(true).translate((-(this.w - Math.min((i8 - i9) - i10, ((((AndroidUtilities.lerp(this.roundRight, 1.0f, this.roundSelectedT.get()) * this.roundDuration) + (this.roundOffset - this.scroll)) / jMin2) * this.sw) + (i9 + i10)))) + AndroidUtilities.dp(18.0f), this.roundBounds.top).show().setBlurBackground(blurManager, -anonymousClass3.getX(), -anonymousClass3.getY());
                performHapticFeedback(0, 1);
                return;
            }
            if (i2 == 0 && this.videoTrack != null) {
                final int i11 = 2;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.videoTrack.volume).setOnValueChange(new Utilities.Callback(this) {
                    public final TimelineView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        Float f = (Float) obj;
                        switch (i11) {
                            case 0:
                                TimelineView timelineView = this.f$0;
                                timelineView.getClass();
                                timelineView.audioVolume = f.floatValue();
                                TimelineView.TimelineDelegate timelineDelegate = timelineView.delegate;
                                if (timelineDelegate != null) {
                                    timelineDelegate.onAudioVolumeChange(f.floatValue());
                                }
                                break;
                            case 1:
                                TimelineView timelineView2 = this.f$0;
                                timelineView2.getClass();
                                timelineView2.roundVolume = f.floatValue();
                                TimelineView.TimelineDelegate timelineDelegate2 = timelineView2.delegate;
                                if (timelineDelegate2 != null) {
                                    timelineDelegate2.onRoundVolumeChange(f.floatValue());
                                }
                                break;
                            default:
                                TimelineView timelineView3 = this.f$0;
                                timelineView3.videoTrack.volume = f.floatValue();
                                TimelineView.TimelineDelegate timelineDelegate3 = timelineView3.delegate;
                                if (timelineDelegate3 != null) {
                                    timelineDelegate3.onVideoVolumeChange(f.floatValue());
                                }
                                break;
                        }
                    }
                })).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), this.videoBounds.top).show().setBlurBackground(blurManager, -anonymousClass3.getX(), -anonymousClass3.getY());
                performHapticFeedback(0, 1);
            } else {
                if (i2 != 3 || (i = this.pressCollageIndex) < 0) {
                    return;
                }
                ArrayList arrayList = this.collageTracks;
                if (i < arrayList.size()) {
                    Track track = (Track) arrayList.get(this.pressCollageIndex);
                    ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(track.volume).setOnValueChange(new GiftSheet$$ExternalSyntheticLambda4(23, this, track))).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), track.bounds.top).show().setBlurBackground(blurManager, -anonymousClass3.getX(), -anonymousClass3.getY());
                    performHapticFeedback(0, 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final long maxSelectDuration() {
        return ((long) this.maxCount) * 59000;
    }

    public final long minAudioSelect() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    public final void moveAudioOffset(float f) {
        float f2;
        long j;
        float f3;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        TimelineDelegate timelineDelegate;
        long jClamp;
        Track track = this.videoTrack;
        if (track == null && !this.hasRound) {
            long j7 = this.audioOffset;
            long jClamp2 = Utilities.clamp(j7 + ((long) f), 0L, -(this.audioDuration - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.audioOffset = jClamp2;
            float f4 = jClamp2 - j7;
            this.audioLeft = Utilities.clamp(this.audioLeft - (f4 / this.audioDuration), 1.0f, 0.0f);
            this.audioRight = Utilities.clamp(this.audioRight - (f4 / this.audioDuration), 1.0f, 0.0f);
            TimelineDelegate timelineDelegate2 = this.delegate;
            if (timelineDelegate2 != null) {
                timelineDelegate2.onAudioLeftChange(this.audioLeft);
                this.delegate.onAudioRightChange(this.audioRight);
            }
        } else if (this.audioSelected) {
            if (track != null) {
                f2 = track.left;
                j = track.duration;
            } else {
                f2 = this.roundLeft;
                j = this.roundDuration;
            }
            float f5 = f2 * j;
            if (track != null) {
                f3 = track.right;
                j2 = track.duration;
            } else {
                f3 = this.roundRight;
                j2 = this.roundDuration;
            }
            float f6 = f3 * j2;
            float f7 = track != null ? (track.right - track.left) * track.duration : this.roundDuration * (this.roundRight - this.roundLeft);
            float f8 = this.audioRight;
            float f9 = this.audioDuration;
            long j8 = (long) (f6 - (f8 * f9));
            float f10 = this.audioLeft;
            long j9 = (long) (f5 - (f10 * f9));
            float fMin = Math.min(f8 - f10, f7 / f9);
            long j10 = this.audioOffset;
            long j11 = (long) f;
            long j12 = j10 + j11;
            if (j12 > j8) {
                float fClamp = Utilities.clamp(((f6 - j10) - j11) / this.audioDuration, 1.0f, fMin);
                this.audioRight = fClamp;
                float fClamp2 = Utilities.clamp(fClamp - fMin, 1.0f, 0.0f);
                this.audioLeft = fClamp2;
                float f11 = this.audioRight;
                float f12 = this.audioDuration;
                long j13 = (long) (f6 - (f11 * f12));
                long j14 = (long) (f5 - (fClamp2 * f12));
                if (j13 < j14) {
                    j6 = j14;
                    j5 = j13;
                } else {
                    j5 = j14;
                    j6 = j13;
                }
                this.audioOffset = Utilities.clamp(this.audioOffset + j11, j6, j5);
                TimelineDelegate timelineDelegate3 = this.delegate;
                if (timelineDelegate3 != null) {
                    timelineDelegate3.onAudioLeftChange(this.audioLeft);
                    this.delegate.onAudioRightChange(this.audioRight);
                }
            } else if (j12 < j9) {
                float fClamp3 = Utilities.clamp(((f5 - j10) - j11) / this.audioDuration, 1.0f - fMin, 0.0f);
                this.audioLeft = fClamp3;
                float fClamp4 = Utilities.clamp(fClamp3 + fMin, 1.0f, 0.0f);
                this.audioRight = fClamp4;
                float f13 = this.audioDuration;
                long j15 = (long) (f6 - (fClamp4 * f13));
                long j16 = (long) (f5 - (this.audioLeft * f13));
                if (j15 < j16) {
                    j4 = j16;
                    j3 = j15;
                } else {
                    j3 = j16;
                    j4 = j15;
                }
                this.audioOffset = Utilities.clamp(this.audioOffset + j11, j4, j3);
                TimelineDelegate timelineDelegate4 = this.delegate;
                if (timelineDelegate4 != null) {
                    timelineDelegate4.onAudioLeftChange(this.audioLeft);
                    this.delegate.onAudioRightChange(this.audioRight);
                }
            } else {
                this.audioOffset = j12;
            }
        } else {
            long j17 = this.audioOffset + ((long) f);
            float baseDuration = getBaseDuration();
            float f14 = this.audioDuration;
            this.audioOffset = Utilities.clamp(j17, (long) (baseDuration - (this.audioRight * f14)), (long) ((-this.audioLeft) * f14));
        }
        invalidate();
        TimelineDelegate timelineDelegate5 = this.delegate;
        if (timelineDelegate5 != null) {
            timelineDelegate5.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
        }
        boolean z = this.dragged;
        if (z || (timelineDelegate = this.delegate) == null) {
            if (z || this.scrolling) {
                Track track2 = this.videoTrack;
                if (track2 != null) {
                    long j18 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                    float f15 = track2.right;
                    float f16 = track2.duration;
                    this.progress = Utilities.clamp(j18, (long) (f15 * f16), (long) (track2.left * f16));
                } else if (!this.hasRound || track2 == null) {
                    float f17 = this.audioLeft;
                    long j19 = this.audioDuration;
                    this.progress = Utilities.clamp((long) (f17 * j19), j19, 0L);
                } else {
                    long j20 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                    float f18 = this.roundRight;
                    float f19 = track2.duration;
                    this.progress = Utilities.clamp(j20, (long) (f18 * f19), (long) (this.roundLeft * f19));
                }
                TimelineDelegate timelineDelegate6 = this.delegate;
                if (timelineDelegate6 != null) {
                    timelineDelegate6.onProgressChange(this.progress, false);
                    return;
                }
                return;
            }
            return;
        }
        timelineDelegate.onProgressDragChange(true);
        Track track3 = this.videoTrack;
        if (track3 != null) {
            long j21 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
            float f20 = track3.right;
            float f21 = track3.duration;
            jClamp = Utilities.clamp(j21, (long) (f20 * f21), (long) (track3.left * f21));
        } else if (this.hasRound) {
            long j22 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
            float f22 = this.roundRight;
            float f23 = this.roundDuration;
            jClamp = Utilities.clamp(j22, (long) (f22 * f23), (long) (this.roundLeft * f23));
        } else {
            float f24 = this.audioLeft;
            long j23 = this.audioDuration;
            jClamp = Utilities.clamp((long) (f24 * j23), j23, 0L);
        }
        if (this.videoTrack != null && Math.abs(this.progress - jClamp) > 400) {
            this.loopProgressFrom = this.progress;
            this.loopProgress.set(1.0f, true);
        }
        TimelineDelegate timelineDelegate7 = this.delegate;
        this.progress = jClamp;
        timelineDelegate7.onProgressChange(jClamp, false);
    }

    public final void moveCollageOffset(Track track, float f) {
        TimelineDelegate timelineDelegate;
        long jClamp;
        long j;
        long j2;
        long j3;
        long j4;
        if (track == null) {
            return;
        }
        Track track2 = this.collageMain;
        if (track2 != track && track2 != null) {
            if (this.collageSelected == this.collageTracks.indexOf(track)) {
                Track track3 = this.collageMain;
                float f2 = track3.duration;
                float f3 = track.right;
                float f4 = track.duration;
                long j5 = (long) ((f2 * 1.0f) - (f3 * f4));
                float f5 = track.left;
                long j6 = (long) ((f2 * 0.0f) - (f5 * f4));
                float fMin = Math.min(f3 - f5, ((track3.right - track3.left) * f2) / f4);
                long j7 = track.offset;
                long j8 = (long) f;
                long j9 = j7 + j8;
                if (j9 > j5) {
                    Track track4 = this.collageMain;
                    float fClamp = Utilities.clamp((((track4.right * track4.duration) - j7) - j8) / track.duration, 1.0f, fMin);
                    track.right = fClamp;
                    float fClamp2 = Utilities.clamp(fClamp - fMin, 1.0f, 0.0f);
                    track.left = fClamp2;
                    Track track5 = this.collageMain;
                    float f6 = track5.right;
                    float f7 = track5.duration;
                    float f8 = track.right;
                    float f9 = track.duration;
                    long j10 = (long) ((f6 * f7) - (f8 * f9));
                    long j11 = (long) ((track5.left * f7) - (fClamp2 * f9));
                    if (j10 < j11) {
                        j4 = j11;
                        j3 = j10;
                    } else {
                        j3 = j11;
                        j4 = j10;
                    }
                    track.offset = Utilities.clamp(track.offset + j8, j4, j3);
                    TimelineDelegate timelineDelegate2 = this.delegate;
                    if (timelineDelegate2 != null) {
                        timelineDelegate2.onVideoLeftChange(track.index, track.left);
                        this.delegate.onVideoRightChange(track.index, track.right);
                    }
                } else if (j9 < j6) {
                    Track track6 = this.collageMain;
                    float fClamp3 = Utilities.clamp((((track6.left * track6.duration) - j7) - j8) / track.duration, 1.0f - fMin, 0.0f);
                    track.left = fClamp3;
                    float fClamp4 = Utilities.clamp(fClamp3 + fMin, 1.0f, 0.0f);
                    track.right = fClamp4;
                    Track track7 = this.collageMain;
                    float f10 = track7.right;
                    float f11 = track7.duration;
                    float f12 = track.duration;
                    long j12 = (long) ((f10 * f11) - (fClamp4 * f12));
                    long j13 = (long) ((track7.left * f11) - (track.left * f12));
                    if (j12 < j13) {
                        j2 = j13;
                        j = j12;
                    } else {
                        j = j13;
                        j2 = j12;
                    }
                    track.offset = Utilities.clamp(track.offset + j8, j2, j);
                    TimelineDelegate timelineDelegate3 = this.delegate;
                    if (timelineDelegate3 != null) {
                        timelineDelegate3.onVideoLeftChange(track.index, track.left);
                        this.delegate.onVideoRightChange(track.index, track.right);
                    }
                } else {
                    track.offset = j9;
                }
            } else {
                long j14 = track.offset + ((long) f);
                float baseDuration = getBaseDuration();
                float f13 = track.duration;
                track.offset = Utilities.clamp(j14, (long) (baseDuration - (track.right * f13)), (long) ((-track.left) * f13));
            }
        }
        invalidate();
        TimelineDelegate timelineDelegate4 = this.delegate;
        if (timelineDelegate4 != null) {
            timelineDelegate4.onVideoOffsetChange(track.index, track.offset);
        }
        boolean z = this.dragged;
        if (z || (timelineDelegate = this.delegate) == null) {
            if (z || this.scrolling) {
                Track track8 = this.collageMain;
                if (track8 == track || track8 == null) {
                    float f14 = track.left;
                    long j15 = track.duration;
                    this.progress = Utilities.clamp((long) (f14 * j15), j15, 0L);
                } else {
                    long j16 = track.offset + ((long) (track.left * track.duration));
                    float f15 = track8.right;
                    float f16 = track8.duration;
                    this.progress = Utilities.clamp(j16, (long) (f15 * f16), (long) (track8.left * f16));
                }
                TimelineDelegate timelineDelegate5 = this.delegate;
                if (timelineDelegate5 != null) {
                    timelineDelegate5.onProgressChange(this.progress, false);
                    return;
                }
                return;
            }
            return;
        }
        timelineDelegate.onProgressDragChange(true);
        Track track9 = this.collageMain;
        if (track9 == track || track9 == null) {
            float f17 = track.left;
            long j17 = track.duration;
            jClamp = Utilities.clamp((long) (f17 * j17), j17, 0L);
        } else {
            long j18 = track.offset + ((long) (track.left * track.duration));
            float f18 = track9.right;
            float f19 = track9.duration;
            jClamp = Utilities.clamp(j18, (long) (f18 * f19), (long) (track9.left * f19));
        }
        Track track10 = this.collageMain;
        if (track10 != track && track10 != null && Math.abs(this.progress - jClamp) > 400) {
            this.loopProgressFrom = this.progress;
            this.loopProgress.set(1.0f, true);
        }
        TimelineDelegate timelineDelegate6 = this.delegate;
        this.progress = jClamp;
        timelineDelegate6.onProgressChange(jClamp, false);
    }

    public final void moveRoundOffset(float f) {
        long j;
        long j2;
        long j3;
        long j4;
        TimelineDelegate timelineDelegate;
        long jClamp;
        Track track = this.videoTrack;
        if (track == null) {
            long j5 = this.roundOffset;
            long jClamp2 = Utilities.clamp(j5 + ((long) f), 0L, -(this.roundDuration - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.roundOffset = jClamp2;
            float f2 = jClamp2 - j5;
            this.roundLeft = Utilities.clamp(this.roundLeft - (f2 / this.roundDuration), 1.0f, 0.0f);
            this.roundRight = Utilities.clamp(this.roundRight - (f2 / this.roundDuration), 1.0f, 0.0f);
            TimelineDelegate timelineDelegate2 = this.delegate;
            if (timelineDelegate2 != null) {
                timelineDelegate2.onRoundLeftChange(this.roundLeft);
                this.delegate.onRoundRightChange(this.roundRight);
            }
        } else if (this.roundSelected) {
            float f3 = track.right;
            float f4 = track.duration;
            float f5 = this.roundRight;
            float f6 = this.roundDuration;
            long j6 = (long) ((f3 * f4) - (f5 * f6));
            float f7 = track.left;
            float f8 = this.roundLeft;
            long j7 = (long) ((f7 * f4) - (f8 * f6));
            float fMin = Math.min(f5 - f8, ((f3 - f7) * f4) / f6);
            long j8 = this.roundOffset;
            long j9 = (long) f;
            long j10 = j8 + j9;
            if (j10 > j6) {
                Track track2 = this.videoTrack;
                float fClamp = Utilities.clamp((((track2.right * track2.duration) - j8) - j9) / this.roundDuration, 1.0f, fMin);
                this.roundRight = fClamp;
                float fClamp2 = Utilities.clamp(fClamp - fMin, 1.0f, 0.0f);
                this.roundLeft = fClamp2;
                Track track3 = this.videoTrack;
                float f9 = track3.right;
                float f10 = track3.duration;
                float f11 = this.roundRight;
                float f12 = this.roundDuration;
                long j11 = (long) ((f9 * f10) - (f11 * f12));
                long j12 = (long) ((track3.left * f10) - (fClamp2 * f12));
                if (j11 < j12) {
                    j4 = j12;
                    j3 = j11;
                } else {
                    j3 = j12;
                    j4 = j11;
                }
                this.roundOffset = Utilities.clamp(this.roundOffset + j9, j4, j3);
                TimelineDelegate timelineDelegate3 = this.delegate;
                if (timelineDelegate3 != null) {
                    timelineDelegate3.onRoundLeftChange(this.roundLeft);
                    this.delegate.onRoundRightChange(this.roundRight);
                }
            } else if (j10 < j7) {
                Track track4 = this.videoTrack;
                float fClamp3 = Utilities.clamp((((track4.left * track4.duration) - j8) - j9) / this.roundDuration, 1.0f - fMin, 0.0f);
                this.roundLeft = fClamp3;
                float fClamp4 = Utilities.clamp(fClamp3 + fMin, 1.0f, 0.0f);
                this.roundRight = fClamp4;
                Track track5 = this.videoTrack;
                float f13 = track5.right;
                float f14 = track5.duration;
                float f15 = this.roundDuration;
                long j13 = (long) ((f13 * f14) - (fClamp4 * f15));
                long j14 = (long) ((track5.left * f14) - (this.roundLeft * f15));
                if (j13 < j14) {
                    j2 = j14;
                    j = j13;
                } else {
                    j = j14;
                    j2 = j13;
                }
                this.roundOffset = Utilities.clamp(this.roundOffset + j9, j2, j);
                TimelineDelegate timelineDelegate4 = this.delegate;
                if (timelineDelegate4 != null) {
                    timelineDelegate4.onRoundLeftChange(this.roundLeft);
                    this.delegate.onRoundRightChange(this.roundRight);
                }
            } else {
                this.roundOffset = j10;
            }
        } else {
            long j15 = this.roundOffset + ((long) f);
            float baseDuration = getBaseDuration();
            float f16 = this.roundDuration;
            this.roundOffset = Utilities.clamp(j15, (long) (baseDuration - (this.roundRight * f16)), (long) ((-this.roundLeft) * f16));
        }
        invalidate();
        TimelineDelegate timelineDelegate5 = this.delegate;
        if (timelineDelegate5 != null) {
            timelineDelegate5.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
        }
        boolean z = this.dragged;
        if (z || (timelineDelegate = this.delegate) == null) {
            if (z || this.scrolling) {
                Track track6 = this.videoTrack;
                if (track6 != null) {
                    long j16 = this.roundOffset + ((long) (this.roundLeft * this.roundDuration));
                    float f17 = track6.right;
                    float f18 = track6.duration;
                    this.progress = Utilities.clamp(j16, (long) (f17 * f18), (long) (track6.left * f18));
                } else {
                    float f19 = this.roundLeft;
                    long j17 = this.roundDuration;
                    this.progress = Utilities.clamp((long) (f19 * j17), j17, 0L);
                }
                TimelineDelegate timelineDelegate6 = this.delegate;
                if (timelineDelegate6 != null) {
                    timelineDelegate6.onProgressChange(this.progress, false);
                    return;
                }
                return;
            }
            return;
        }
        timelineDelegate.onProgressDragChange(true);
        Track track7 = this.videoTrack;
        if (track7 != null) {
            long j18 = this.roundOffset + ((long) (this.roundLeft * this.roundDuration));
            float f20 = track7.right;
            float f21 = track7.duration;
            jClamp = Utilities.clamp(j18, (long) (f20 * f21), (long) (track7.left * f21));
        } else {
            float f22 = this.roundLeft;
            long j19 = this.roundDuration;
            jClamp = Utilities.clamp((long) (f22 * j19), j19, 0L);
        }
        if (this.videoTrack != null && Math.abs(this.progress - jClamp) > 400) {
            this.loopProgressFrom = this.progress;
            this.loopProgress.set(1.0f, true);
        }
        TimelineDelegate timelineDelegate7 = this.delegate;
        this.progress = jClamp;
        timelineDelegate7.onProgressChange(jClamp, false);
    }

    public final void normalizeScrollByVideo() {
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        Track track = this.videoTrack;
        float f = (track.right + track.left) / 2.0f;
        long j = track.duration;
        this.scroll = Utilities.clamp((long) ((f * j) - (jMin / 2.0f)), j - jMin, 0L);
        invalidate();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.audioAuthorPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.audioTitlePaint.setTextSize(AndroidUtilities.dp(12.0f));
        int iDp = AndroidUtilities.dp(12.0f);
        this.px = iDp;
        int iDp2 = AndroidUtilities.dp(5.0f);
        this.py = iDp2;
        setPadding(iDp, iDp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i);
        this.w = size;
        int iDp3 = AndroidUtilities.dp(388);
        this.h = iDp3;
        setMeasuredDimension(size, iDp3);
        int iDp4 = AndroidUtilities.dp(10.0f);
        this.ph = iDp4;
        this.sw = (this.w - (iDp4 * 2)) - (this.px * 2);
        Track track = this.videoTrack;
        if (track != null && track.path != null && track.thumbs == null) {
            track.setupThumbs(false);
        }
        ArrayList arrayList = this.collageTracks;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                Track track2 = (Track) obj;
                if (track2.path != null && track2.thumbs == null) {
                    track2.setupThumbs(false);
                    Track.access$700(track2);
                }
            }
        }
        if (this.audioPath == null || this.waveform != null) {
            return;
        }
        setupAudioWaveform();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        TimelineDelegate timelineDelegate;
        VelocityTracker velocityTracker;
        long j;
        long j2;
        long j3;
        float f;
        VelocityTracker velocityTracker2;
        long j4;
        long j5;
        VelocityTracker velocityTracker3;
        VelocityTracker velocityTracker4;
        long j6;
        Runnable runnable;
        VelocityTracker velocityTracker5;
        float fMin;
        float fMax;
        float fMin2;
        float fMax2;
        boolean z2;
        TimelineDelegate timelineDelegate2;
        int i;
        boolean z3;
        int i2;
        float f2;
        float f3;
        Track track = this.videoTrack;
        ArrayList arrayList = this.collageTracks;
        if (track != null || !arrayList.isEmpty() || this.hasAudio || this.hasRound) {
            float timelineHeight = this.h - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                Scroller scroller = this.scroller;
                SendGiftSheet$$ExternalSyntheticLambda16 sendGiftSheet$$ExternalSyntheticLambda16 = this.onLongPress;
                if (action == 0) {
                    RichEditor$$ExternalSyntheticLambda48 richEditor$$ExternalSyntheticLambda48 = this.askExactSeek;
                    if (richEditor$$ExternalSyntheticLambda48 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditor$$ExternalSyntheticLambda48);
                        this.askExactSeek = null;
                    }
                    scroller.abortAnimation();
                    this.pressHandleCollageIndex = -1;
                    this.pressHandle = detectHandle(motionEvent);
                    this.pressType = -1;
                    this.pressCollageIndex = -1;
                    int roundHeight = this.h - this.py;
                    if (!this.open && this.timelineBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.pressType = 10;
                        this.pressHandle = -1;
                    }
                    if (this.pressType != -1 || this.videoTrack == null) {
                        f2 = 4.0f;
                    } else {
                        float f4 = roundHeight;
                        if (motionEvent.getY() < f4) {
                            f2 = 4.0f;
                            if (motionEvent.getY() > (f4 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                                this.pressType = 0;
                            }
                        } else {
                            f2 = 4.0f;
                        }
                        roundHeight = (int) (f4 - (getVideoHeight() + AndroidUtilities.dp(f2)));
                    }
                    if (this.pressType == -1 && !arrayList.isEmpty()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= arrayList.size()) {
                                f3 = 2.0f;
                                break;
                            }
                            f3 = 2.0f;
                            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((Track) arrayList.get(i3)).selectedT.get());
                            float f5 = roundHeight;
                            if (motionEvent.getY() < f5 && motionEvent.getY() > (f5 - fLerp) - AndroidUtilities.dp(2.0f)) {
                                this.pressType = 3;
                                this.pressCollageIndex = i3;
                                break;
                            }
                            roundHeight = (int) (f5 - (fLerp + AndroidUtilities.dp(f2)));
                            i3++;
                        }
                    } else {
                        f3 = 2.0f;
                        break;
                    }
                    if (this.pressType == -1 && this.hasRound) {
                        float f6 = roundHeight;
                        if (motionEvent.getY() < f6 && motionEvent.getY() > (f6 - getRoundHeight()) - AndroidUtilities.dp(f3)) {
                            this.pressType = 1;
                        }
                        roundHeight = (int) (f6 - (getRoundHeight() + AndroidUtilities.dp(f2)));
                    }
                    if (this.pressType == -1 && this.hasAudio) {
                        float f7 = roundHeight;
                        if (motionEvent.getY() < f7 && motionEvent.getY() > (f7 - getAudioHeight()) - AndroidUtilities.dp(f3)) {
                            this.pressType = 2;
                        }
                        getAudioHeight();
                        AndroidUtilities.dp(f2);
                    }
                    this.pressTime = System.currentTimeMillis();
                    int i4 = this.pressHandle;
                    this.draggingProgress = i4 == 0 || i4 == -1 || i4 == 1;
                    this.hadDragChange = false;
                    if (i4 == 1 || i4 == 5 || i4 == 8) {
                        this.velocityTracker = VelocityTracker.obtain();
                    } else {
                        VelocityTracker velocityTracker6 = this.velocityTracker;
                        if (velocityTracker6 != null) {
                            velocityTracker6.recycle();
                            this.velocityTracker = null;
                        }
                    }
                    this.dragSpeed = 1.0f;
                    this.dragged = false;
                    this.lastX = motionEvent.getX();
                    if (!this.isCover) {
                        AndroidUtilities.cancelRunOnUIThread(sendGiftSheet$$ExternalSyntheticLambda16);
                        AndroidUtilities.runOnUIThread(sendGiftSheet$$ExternalSyntheticLambda16, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x = motionEvent.getX() - this.lastX;
                    if (this.open && (this.dragged || Math.abs(x) > AndroidUtilities.touchSlop)) {
                        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
                        Track track2 = this.videoTrack;
                        if (track2 != null && this.pressHandle == 1) {
                            this.scroll = (long) Utilities.clamp(this.scroll - ((x / this.sw) * jMin), track2.duration - jMin, 0.0f);
                            invalidate();
                            if (!this.dragged) {
                                this.dragSpeed = 1.0f;
                            }
                            this.dragged = true;
                            this.draggingProgress = false;
                        } else if (track2 == null || !((i2 = this.pressHandle) == 2 || i2 == 3 || i2 == 4)) {
                            int i5 = this.pressHandle;
                            if (i5 == 6 || i5 == 7 || i5 == 8) {
                                float f8 = (jMin / this.audioDuration) * (x / this.sw);
                                if (i5 == 6) {
                                    float fMinAudioSelect = this.audioRight - (minAudioSelect() / this.audioDuration);
                                    float fMax3 = Math.max(0L, this.scroll - this.audioOffset);
                                    float f9 = this.audioDuration;
                                    float f10 = fMax3 / f9;
                                    Track track3 = this.videoTrack;
                                    if (track3 != null) {
                                        fMax = Math.max(f10, (((track3.left * track3.duration) + this.scroll) - this.audioOffset) / f9);
                                    } else {
                                        Track track4 = this.collageMain;
                                        if (track4 != null) {
                                            fMax = Math.max(f10, (((track4.left * track4.duration) + this.scroll) - this.audioOffset) / f9);
                                        } else if (this.hasRound) {
                                            fMax = Math.max(f10, (((this.roundLeft * this.roundDuration) + this.scroll) - this.audioOffset) / f9);
                                        } else {
                                            fMax = Math.max(f10, this.audioRight - (maxSelectDuration() / this.audioDuration));
                                            if (!this.hadDragChange && f8 < 0.0f && this.audioLeft <= this.audioRight - (maxSelectDuration() / this.audioDuration)) {
                                                this.pressHandle = 8;
                                            }
                                        }
                                    }
                                    float f11 = this.audioLeft;
                                    float fClamp = Utilities.clamp(f11 + f8, fMinAudioSelect, fMax);
                                    this.audioLeft = fClamp;
                                    if (Math.abs(f11 - fClamp) > 0.01f) {
                                        this.hadDragChange = true;
                                    }
                                    TimelineDelegate timelineDelegate3 = this.delegate;
                                    if (timelineDelegate3 != null) {
                                        timelineDelegate3.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
                                    }
                                    TimelineDelegate timelineDelegate4 = this.delegate;
                                    if (timelineDelegate4 != null) {
                                        timelineDelegate4.onAudioLeftChange(this.audioLeft);
                                    }
                                } else if (i5 == 7) {
                                    float fMin3 = Math.min(1.0f, Math.max(0L, (this.scroll - this.audioOffset) + jMin) / this.audioDuration);
                                    float f12 = this.audioLeft;
                                    float fMinAudioSelect2 = minAudioSelect();
                                    float f13 = this.audioDuration;
                                    float f14 = (fMinAudioSelect2 / f13) + f12;
                                    Track track5 = this.videoTrack;
                                    if (track5 != null) {
                                        fMin = Math.min(fMin3, (((track5.right * track5.duration) + this.scroll) - this.audioOffset) / f13);
                                    } else {
                                        Track track6 = this.collageMain;
                                        if (track6 != null) {
                                            fMin = Math.min(fMin3, (((track6.right * track6.duration) + this.scroll) - this.audioOffset) / f13);
                                        } else if (this.hasRound) {
                                            fMin = Math.min(fMin3, (((this.roundRight * this.roundDuration) + this.scroll) - this.audioOffset) / f13);
                                        } else {
                                            fMin = Math.min(fMin3, (maxSelectDuration() / this.audioDuration) + this.audioLeft);
                                            if (!this.hadDragChange && f8 > 0.0f) {
                                                if (this.audioRight >= (maxSelectDuration() / this.audioDuration) + this.audioLeft) {
                                                    this.pressHandle = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f15 = this.audioRight;
                                    float fClamp2 = Utilities.clamp(f15 + f8, fMin, f14);
                                    this.audioRight = fClamp2;
                                    if (Math.abs(f15 - fClamp2) > 0.01f) {
                                        this.hadDragChange = true;
                                    }
                                    TimelineDelegate timelineDelegate5 = this.delegate;
                                    if (timelineDelegate5 != null) {
                                        timelineDelegate5.onAudioRightChange(this.audioRight);
                                    }
                                }
                                if (this.pressHandle == 8) {
                                    float fMin4 = f8 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.scroll - this.audioOffset) + jMin) / this.audioDuration) - this.audioRight), f8) : Math.max(Math.min(0.0f, (Math.max(0L, this.scroll - this.audioOffset) / this.audioDuration) - this.audioLeft), f8);
                                    float f16 = this.audioLeft + fMin4;
                                    this.audioLeft = f16;
                                    this.audioRight += fMin4;
                                    TimelineDelegate timelineDelegate6 = this.delegate;
                                    if (timelineDelegate6 != null) {
                                        timelineDelegate6.onAudioLeftChange(f16);
                                        this.delegate.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
                                        this.delegate.onAudioRightChange(this.audioRight);
                                    }
                                    TimelineDelegate timelineDelegate7 = this.delegate;
                                    if (timelineDelegate7 != null) {
                                        timelineDelegate7.onProgressDragChange(true);
                                    }
                                }
                                if (this.videoTrack == null && !this.hasRound) {
                                    this.progress = (long) (this.audioLeft * this.audioDuration);
                                    TimelineDelegate timelineDelegate8 = this.delegate;
                                    if (timelineDelegate8 != null) {
                                        timelineDelegate8.onProgressDragChange(true);
                                        this.delegate.onProgressChange(this.progress, false);
                                    }
                                }
                                invalidate();
                                if (!this.dragged) {
                                    this.dragSpeed = 1.0f;
                                }
                                this.dragged = true;
                                this.draggingProgress = false;
                            } else if (i5 == 10 || i5 == 11 || i5 == 12) {
                                float f17 = (jMin / this.roundDuration) * (x / this.sw);
                                if (i5 == 10) {
                                    float fMinAudioSelect3 = this.roundRight - (minAudioSelect() / this.roundDuration);
                                    float fMax4 = Math.max(0L, this.scroll - this.roundOffset);
                                    float f18 = this.roundDuration;
                                    float f19 = fMax4 / f18;
                                    Track track7 = this.videoTrack;
                                    if (track7 != null) {
                                        fMax2 = Math.max(f19, (((track7.left * track7.duration) + this.scroll) - this.roundOffset) / f18);
                                    } else {
                                        Track track8 = this.collageMain;
                                        if (track8 != null) {
                                            fMax2 = Math.max(f19, (((track8.left * track8.duration) + this.scroll) - this.roundOffset) / f18);
                                        } else {
                                            fMax2 = Math.max(f19, this.roundRight - (maxSelectDuration() / this.roundDuration));
                                            if (!this.hadDragChange && f17 < 0.0f && this.roundLeft <= this.roundRight - (maxSelectDuration() / this.roundDuration)) {
                                                this.pressHandle = 8;
                                            }
                                        }
                                    }
                                    float f20 = this.roundLeft;
                                    float fClamp3 = Utilities.clamp(f20 + f17, fMinAudioSelect3, fMax2);
                                    this.roundLeft = fClamp3;
                                    if (Math.abs(f20 - fClamp3) > 0.01f) {
                                        this.hadDragChange = true;
                                    }
                                    TimelineDelegate timelineDelegate9 = this.delegate;
                                    if (timelineDelegate9 != null) {
                                        timelineDelegate9.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
                                    }
                                    TimelineDelegate timelineDelegate10 = this.delegate;
                                    if (timelineDelegate10 != null) {
                                        timelineDelegate10.onRoundLeftChange(this.roundLeft);
                                    }
                                } else if (i5 == 11) {
                                    float fMin5 = Math.min(1.0f, Math.max(0L, (this.scroll - this.roundOffset) + jMin) / this.roundDuration);
                                    float f21 = this.roundLeft;
                                    float fMinAudioSelect4 = minAudioSelect();
                                    float f22 = this.roundDuration;
                                    float f23 = (fMinAudioSelect4 / f22) + f21;
                                    Track track9 = this.videoTrack;
                                    if (track9 != null) {
                                        fMin5 = Math.min(fMin5, (((track9.right * track9.duration) + this.scroll) - this.roundOffset) / f22);
                                    }
                                    Track track10 = this.collageMain;
                                    if (track10 != null) {
                                        fMin2 = Math.min(fMin5, (((track10.right * track10.duration) + this.scroll) - this.roundOffset) / this.roundDuration);
                                    } else {
                                        fMin2 = Math.min(fMin5, (maxSelectDuration() / this.roundDuration) + this.roundLeft);
                                        if (!this.hadDragChange && f17 > 0.0f) {
                                            if (this.roundRight >= (maxSelectDuration() / this.roundDuration) + this.roundLeft) {
                                                this.pressHandle = 8;
                                            }
                                        }
                                    }
                                    float f24 = this.roundRight;
                                    float fClamp4 = Utilities.clamp(f24 + f17, fMin2, f23);
                                    this.roundRight = fClamp4;
                                    if (Math.abs(f24 - fClamp4) > 0.01f) {
                                        this.hadDragChange = true;
                                    }
                                    TimelineDelegate timelineDelegate11 = this.delegate;
                                    if (timelineDelegate11 != null) {
                                        timelineDelegate11.onRoundRightChange(this.roundRight);
                                    }
                                }
                                if (this.pressHandle == 12) {
                                    float fMin6 = f17 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.scroll - this.roundOffset) + jMin) / this.roundDuration) - this.roundRight, f17) : Math.max((Math.max(0L, this.scroll - this.roundOffset) / this.roundDuration) - this.roundLeft, f17);
                                    float f25 = this.roundLeft + fMin6;
                                    this.roundLeft = f25;
                                    this.roundRight += fMin6;
                                    TimelineDelegate timelineDelegate12 = this.delegate;
                                    if (timelineDelegate12 != null) {
                                        timelineDelegate12.onRoundLeftChange(f25);
                                        this.delegate.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
                                        this.delegate.onRoundRightChange(this.roundRight);
                                    }
                                    TimelineDelegate timelineDelegate13 = this.delegate;
                                    if (timelineDelegate13 != null) {
                                        timelineDelegate13.onProgressDragChange(true);
                                    }
                                }
                                if (this.videoTrack == null) {
                                    this.progress = (long) (this.roundLeft * this.roundDuration);
                                    TimelineDelegate timelineDelegate14 = this.delegate;
                                    if (timelineDelegate14 != null) {
                                        timelineDelegate14.onProgressDragChange(true);
                                        this.delegate.onProgressChange(this.progress, false);
                                    }
                                }
                                invalidate();
                                if (!this.dragged) {
                                    this.dragSpeed = 1.0f;
                                }
                                this.dragged = true;
                                this.draggingProgress = false;
                            } else {
                                int i6 = this.pressHandleCollageIndex;
                                if (i6 < 0 || i6 >= arrayList.size() || !((i = this.pressHandle) == 13 || i == 14 || i == 15)) {
                                    int i7 = this.pressHandle;
                                    if (i7 == 5) {
                                        moveAudioOffset((x / this.sw) * jMin);
                                        if (!this.dragged) {
                                            this.dragSpeed = 1.0f;
                                        }
                                        this.dragged = true;
                                        this.draggingProgress = false;
                                    } else if (i7 == 9) {
                                        moveRoundOffset((x / this.sw) * jMin);
                                        if (!this.dragged) {
                                            this.dragSpeed = 1.0f;
                                        }
                                        this.dragged = true;
                                        this.draggingProgress = false;
                                    } else {
                                        int i8 = this.pressHandleCollageIndex;
                                        if (i8 >= 0 && i8 < arrayList.size() && this.pressHandle == 16) {
                                            moveCollageOffset((Track) arrayList.get(this.pressHandleCollageIndex), (x / this.sw) * jMin);
                                            if (!this.dragged) {
                                                this.dragSpeed = 1.0f;
                                            }
                                            this.dragged = true;
                                            this.draggingProgress = false;
                                        } else if (this.draggingProgress) {
                                            setProgressAt(motionEvent.getX(), jCurrentTimeMillis - this.lastTime < 350);
                                            if (this.dragged || (timelineDelegate2 = this.delegate) == null) {
                                                z2 = true;
                                            } else {
                                                z2 = true;
                                                timelineDelegate2.onProgressDragChange(true);
                                            }
                                            if (!this.dragged) {
                                                this.dragSpeed = 1.0f;
                                            }
                                            this.dragged = z2;
                                        }
                                    }
                                } else {
                                    Track track11 = (Track) arrayList.get(this.pressHandleCollageIndex);
                                    float f26 = (jMin / track11.duration) * (x / this.sw);
                                    int i9 = this.pressHandle;
                                    if (i9 == 13) {
                                        float fMinAudioSelect5 = track11.right - (minAudioSelect() / track11.duration);
                                        float fMax5 = Math.max(0L, this.scroll - track11.offset) / track11.duration;
                                        if (track11 == this.collageMain) {
                                            fMax5 = Math.max(fMax5, track11.right - (maxSelectDuration() / track11.duration));
                                            if (!this.hadDragChange && f26 < 0.0f && track11.left <= track11.right - (maxSelectDuration() / track11.duration)) {
                                                this.pressHandle = 15;
                                            }
                                        }
                                        float f27 = track11.left;
                                        float fClamp5 = Utilities.clamp(f27 + f26, fMinAudioSelect5, fMax5);
                                        track11.left = fClamp5;
                                        if (Math.abs(f27 - fClamp5) > 0.01f) {
                                            this.hadDragChange = true;
                                        }
                                        TimelineDelegate timelineDelegate15 = this.delegate;
                                        if (timelineDelegate15 != null) {
                                            timelineDelegate15.onVideoOffsetChange(track11.index, track11.offset);
                                        }
                                        TimelineDelegate timelineDelegate16 = this.delegate;
                                        if (timelineDelegate16 != null) {
                                            timelineDelegate16.onVideoLeftChange(track11.index, track11.left);
                                        }
                                    } else if (i9 == 14) {
                                        float fMin7 = Math.min(1.0f, Math.max(0L, (this.scroll - track11.offset) + jMin) / track11.duration);
                                        float fMinAudioSelect6 = (minAudioSelect() / track11.duration) + track11.left;
                                        if (track11 == this.collageMain) {
                                            fMin7 = Math.min(fMin7, (maxSelectDuration() / track11.duration) + track11.left);
                                            if (!this.hadDragChange && f26 > 0.0f) {
                                                if (track11.right >= (maxSelectDuration() / track11.duration) + track11.left) {
                                                    this.pressHandle = 15;
                                                }
                                            }
                                        }
                                        float f28 = track11.right;
                                        float fClamp6 = Utilities.clamp(f28 + f26, fMin7, fMinAudioSelect6);
                                        track11.right = fClamp6;
                                        if (Math.abs(f28 - fClamp6) > 0.01f) {
                                            this.hadDragChange = true;
                                        }
                                        TimelineDelegate timelineDelegate17 = this.delegate;
                                        if (timelineDelegate17 != null) {
                                            timelineDelegate17.onVideoRightChange(track11.index, track11.right);
                                        }
                                    }
                                    if (this.pressHandle == 15) {
                                        float fMin8 = f26 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.scroll - track11.offset) + jMin) / track11.duration) - track11.right, f26) : Math.max((Math.max(0L, this.scroll - track11.offset) / track11.duration) - track11.left, f26);
                                        float f29 = track11.left + fMin8;
                                        track11.left = f29;
                                        track11.right += fMin8;
                                        TimelineDelegate timelineDelegate18 = this.delegate;
                                        if (timelineDelegate18 != null) {
                                            timelineDelegate18.onVideoLeftChange(track11.index, f29);
                                            this.delegate.onVideoOffsetChange(track11.index, track11.offset);
                                            this.delegate.onVideoRightChange(track11.index, track11.right);
                                        }
                                        TimelineDelegate timelineDelegate19 = this.delegate;
                                        if (timelineDelegate19 != null) {
                                            z3 = true;
                                            timelineDelegate19.onProgressDragChange(true);
                                        } else {
                                            z3 = true;
                                        }
                                    } else {
                                        z3 = true;
                                    }
                                    invalidate();
                                    if (!this.dragged) {
                                        this.dragSpeed = 1.0f;
                                    }
                                    this.dragged = z3;
                                    this.draggingProgress = false;
                                }
                            }
                        } else {
                            float f30 = x / this.sw;
                            float f31 = track2.duration;
                            float f32 = (jMin / f31) * f30;
                            if (i2 == 2) {
                                track2.left = Utilities.clamp(track2.left + f32, track2.right - (1000.0f / f31), 0.0f);
                                TimelineDelegate timelineDelegate20 = this.delegate;
                                if (timelineDelegate20 != null) {
                                    timelineDelegate20.onVideoLeftChange(false, this.videoTrack.left);
                                }
                                Track track12 = this.videoTrack;
                                float f33 = track12.right - track12.left;
                                float fMaxSelectDuration = maxSelectDuration();
                                Track track13 = this.videoTrack;
                                if (f33 > fMaxSelectDuration / track13.duration) {
                                    track13.right = Math.min(1.0f, (maxSelectDuration() / this.videoTrack.duration) + track13.left);
                                    TimelineDelegate timelineDelegate21 = this.delegate;
                                    if (timelineDelegate21 != null) {
                                        timelineDelegate21.onVideoRightChange(false, this.videoTrack.right);
                                    }
                                }
                            } else if (i2 == 3) {
                                track2.right = Utilities.clamp(track2.right + f32, 1.0f, (1000.0f / f31) + track2.left);
                                TimelineDelegate timelineDelegate22 = this.delegate;
                                if (timelineDelegate22 != null) {
                                    timelineDelegate22.onVideoRightChange(false, this.videoTrack.right);
                                }
                                Track track14 = this.videoTrack;
                                float f34 = track14.right - track14.left;
                                float fMaxSelectDuration2 = maxSelectDuration();
                                Track track15 = this.videoTrack;
                                if (f34 > fMaxSelectDuration2 / track15.duration) {
                                    track15.left = Math.max(0.0f, track15.right - (maxSelectDuration() / this.videoTrack.duration));
                                    TimelineDelegate timelineDelegate23 = this.delegate;
                                    if (timelineDelegate23 != null) {
                                        timelineDelegate23.onVideoLeftChange(false, this.videoTrack.left);
                                    }
                                }
                            } else if (i2 == 4) {
                                float fMin9 = f32 > 0.0f ? Math.min(1.0f - track2.right, f32) : Math.max(-track2.left, f32);
                                Track track16 = this.videoTrack;
                                float f35 = track16.left + fMin9;
                                track16.left = f35;
                                track16.right += fMin9;
                                TimelineDelegate timelineDelegate24 = this.delegate;
                                if (timelineDelegate24 != null) {
                                    timelineDelegate24.onVideoLeftChange(false, f35);
                                    this.delegate.onVideoRightChange(false, this.videoTrack.right);
                                }
                            }
                            float f36 = this.progress;
                            Track track17 = this.videoTrack;
                            float f37 = track17.duration;
                            float f38 = f36 / f37;
                            float f39 = track17.left;
                            if (f38 < f39 || f38 > track17.right) {
                                long j7 = (long) (f39 * f37);
                                this.progress = j7;
                                TimelineDelegate timelineDelegate25 = this.delegate;
                                if (timelineDelegate25 != null) {
                                    timelineDelegate25.onProgressChange(j7, false);
                                }
                            }
                            invalidate();
                            if (!this.dragged) {
                                this.dragSpeed = 1.0f;
                            }
                            this.dragged = true;
                            this.draggingProgress = false;
                        }
                        this.lastX = motionEvent.getX();
                    }
                    if (this.dragged) {
                        AndroidUtilities.cancelRunOnUIThread(sendGiftSheet$$ExternalSyntheticLambda16);
                    }
                    int i10 = this.pressHandle;
                    if ((i10 == 1 || i10 == 5 || i10 == 8) && (velocityTracker5 = this.velocityTracker) != null) {
                        velocityTracker5.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(sendGiftSheet$$ExternalSyntheticLambda16);
                    scroller.abortAnimation();
                    if (motionEvent.getAction() != 1) {
                        z = true;
                    } else {
                        if ((System.currentTimeMillis() - this.pressTime > ViewConfiguration.getTapTimeout() || this.dragged) && this.open) {
                            int i11 = this.pressHandle;
                            if (i11 == 16 && (velocityTracker4 = this.velocityTracker) != null) {
                                velocityTracker4.computeCurrentVelocity(1000);
                                int xVelocity = (int) this.velocityTracker.getXVelocity();
                                this.scrollingVideo = true;
                                if (this.videoTrack != null && Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                                    long jMin2 = Math.min(this.videoTrack.duration, getMaxScrollDuration());
                                    int i12 = this.px;
                                    float f40 = i12;
                                    float f41 = jMin2;
                                    float f42 = this.scroll / f41;
                                    float f43 = this.sw;
                                    int i13 = (int) ((f42 * f43) + f40);
                                    int iM = (int) zzir.m(this.videoTrack.duration - jMin2, f41, f43, f40);
                                    this.scrolling = true;
                                    this.wasScrollX = i13;
                                    this.scroller.fling(i13, 0, -xVelocity, 0, i12, iM, 0, 0);
                                    z = false;
                                }
                            } else if (i11 == 1 && (velocityTracker3 = this.velocityTracker) != null) {
                                velocityTracker3.computeCurrentVelocity(1000);
                                int xVelocity2 = (int) this.velocityTracker.getXVelocity();
                                this.scrollingVideo = true;
                                if (this.videoTrack != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                                    long jMin3 = Math.min(this.videoTrack.duration, getMaxScrollDuration());
                                    int i14 = this.px;
                                    float f44 = i14;
                                    float f45 = jMin3;
                                    float f46 = this.scroll / f45;
                                    float f47 = this.sw;
                                    int i15 = (int) ((f46 * f47) + f44);
                                    int iM2 = (int) zzir.m(this.videoTrack.duration - jMin3, f45, f47, f44);
                                    this.scrolling = true;
                                    this.wasScrollX = i15;
                                    this.scroller.fling(i15, 0, -xVelocity2, 0, i14, iM2, 0, 0);
                                    z = false;
                                }
                            } else if ((i11 == 5 || (i11 == 8 && !this.dragged)) && this.audioSelected && (velocityTracker = this.velocityTracker) != null) {
                                velocityTracker.computeCurrentVelocity(this.videoTrack == null ? 1500 : 1000);
                                int xVelocity3 = (int) this.velocityTracker.getXVelocity();
                                this.scrollingVideo = false;
                                if (Math.abs(xVelocity3) > AndroidUtilities.dp(100.0f)) {
                                    float fMin10 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i16 = (int) (((this.audioOffset / fMin10) * this.sw) + this.px + this.ph);
                                    Track track18 = this.videoTrack;
                                    if (track18 != null) {
                                        float f48 = track18.right;
                                        float f49 = track18.duration;
                                        j3 = this.audioDuration;
                                        j2 = (long) ((f48 * f49) - 0);
                                        f = track18.left * f49;
                                    } else {
                                        if (this.hasRound) {
                                            float f50 = this.roundRight;
                                            float f51 = this.roundDuration;
                                            j3 = this.audioDuration;
                                            j2 = (long) ((f50 * f51) - 0);
                                            f = this.roundLeft * f51;
                                        } else {
                                            j = -(this.audioDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                            j2 = 0;
                                        }
                                        this.scrolling = true;
                                        this.wasScrollX = i16;
                                        float f52 = this.px + this.ph;
                                        float f53 = this.sw;
                                        this.scroller.fling(i16, 0, xVelocity3, 0, (int) (((j / fMin10) * f53) + f52), (int) zzir.m(j2, fMin10, f53, f52), 0, 0);
                                        z = false;
                                    }
                                    j = (long) (f - j3);
                                    this.scrolling = true;
                                    this.wasScrollX = i16;
                                    float f54 = this.px + this.ph;
                                    float f55 = this.sw;
                                    this.scroller.fling(i16, 0, xVelocity3, 0, (int) (((j / fMin10) * f55) + f54), (int) zzir.m(j2, fMin10, f55, f54), 0, 0);
                                    z = false;
                                }
                            } else if ((i11 == 9 || (i11 == 12 && !this.dragged)) && this.roundSelected && (velocityTracker2 = this.velocityTracker) != null) {
                                velocityTracker2.computeCurrentVelocity(this.videoTrack == null ? 1500 : 1000);
                                int xVelocity4 = (int) this.velocityTracker.getXVelocity();
                                this.scrollingVideo = false;
                                if (Math.abs(xVelocity4) > AndroidUtilities.dp(100.0f)) {
                                    float fMin11 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i17 = (int) (((this.roundOffset / fMin11) * this.sw) + this.px + this.ph);
                                    Track track19 = this.videoTrack;
                                    if (track19 != null) {
                                        float f56 = track19.right;
                                        float f57 = track19.duration;
                                        j5 = (long) ((f56 * f57) - 0);
                                        j4 = (long) ((track19.left * f57) - this.roundDuration);
                                    } else {
                                        j4 = -(this.roundDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j5 = 0;
                                    }
                                    this.scrolling = true;
                                    this.wasScrollX = i17;
                                    float f58 = this.px + this.ph;
                                    float f59 = this.sw;
                                    this.scroller.fling(i17, 0, xVelocity4, 0, (int) (((j4 / fMin11) * f59) + f58), (int) zzir.m(j5, fMin11, f59, f58), 0, 0);
                                    z = false;
                                }
                            }
                        } else if (this.open) {
                            if (!this.isCover || this.videoTrack == null) {
                                int i18 = this.pressType;
                                if (i18 == 3) {
                                    int i19 = (this.audioSelected || this.roundSelected) ? -1 : this.collageSelected;
                                    int i20 = this.pressCollageIndex;
                                    if (i19 != i20) {
                                        this.audioSelected = false;
                                        this.roundSelected = false;
                                        this.collageSelected = i20;
                                        if (this.delegate != null && i20 >= 0 && i20 < arrayList.size()) {
                                            this.delegate.onVideoSelected(((Track) arrayList.get(this.pressCollageIndex)).index);
                                        }
                                        invalidate();
                                    } else if (i18 != 2) {
                                        if (i18 != 1) {
                                            if (i18 == 2) {
                                                if (i18 == 1) {
                                                    j6 = this.progress;
                                                    if (setProgressAt(motionEvent.getX(), false)) {
                                                        this.loopProgressFrom = j6;
                                                        this.loopProgress.set(1.0f, true);
                                                        invalidate();
                                                    }
                                                } else {
                                                    j6 = this.progress;
                                                    if (setProgressAt(motionEvent.getX(), false)) {
                                                        this.loopProgressFrom = j6;
                                                        this.loopProgress.set(1.0f, true);
                                                        invalidate();
                                                    }
                                                }
                                            } else if (i18 == 1) {
                                                j6 = this.progress;
                                                if (setProgressAt(motionEvent.getX(), false)) {
                                                    this.loopProgressFrom = j6;
                                                    this.loopProgress.set(1.0f, true);
                                                    invalidate();
                                                }
                                            } else {
                                                j6 = this.progress;
                                                if (setProgressAt(motionEvent.getX(), false)) {
                                                    this.loopProgressFrom = j6;
                                                    this.loopProgress.set(1.0f, true);
                                                    invalidate();
                                                }
                                            }
                                        } else if (i18 == 2) {
                                            if (i18 == 1) {
                                                j6 = this.progress;
                                                if (setProgressAt(motionEvent.getX(), false)) {
                                                    this.loopProgressFrom = j6;
                                                    this.loopProgress.set(1.0f, true);
                                                    invalidate();
                                                }
                                            } else {
                                                j6 = this.progress;
                                                if (setProgressAt(motionEvent.getX(), false)) {
                                                    this.loopProgressFrom = j6;
                                                    this.loopProgress.set(1.0f, true);
                                                    invalidate();
                                                }
                                            }
                                        } else if (i18 == 1) {
                                            j6 = this.progress;
                                            if (setProgressAt(motionEvent.getX(), false)) {
                                                this.loopProgressFrom = j6;
                                                this.loopProgress.set(1.0f, true);
                                                invalidate();
                                            }
                                        } else {
                                            j6 = this.progress;
                                            if (setProgressAt(motionEvent.getX(), false)) {
                                                this.loopProgressFrom = j6;
                                                this.loopProgress.set(1.0f, true);
                                                invalidate();
                                            }
                                        }
                                    } else if (i18 != 1) {
                                        if (i18 == 2) {
                                            if (i18 == 1) {
                                                j6 = this.progress;
                                                if (setProgressAt(motionEvent.getX(), false)) {
                                                    this.loopProgressFrom = j6;
                                                    this.loopProgress.set(1.0f, true);
                                                    invalidate();
                                                }
                                            } else {
                                                j6 = this.progress;
                                                if (setProgressAt(motionEvent.getX(), false)) {
                                                    this.loopProgressFrom = j6;
                                                    this.loopProgress.set(1.0f, true);
                                                    invalidate();
                                                }
                                            }
                                        } else if (i18 == 1) {
                                            j6 = this.progress;
                                            if (setProgressAt(motionEvent.getX(), false)) {
                                                this.loopProgressFrom = j6;
                                                this.loopProgress.set(1.0f, true);
                                                invalidate();
                                            }
                                        } else {
                                            j6 = this.progress;
                                            if (setProgressAt(motionEvent.getX(), false)) {
                                                this.loopProgressFrom = j6;
                                                this.loopProgress.set(1.0f, true);
                                                invalidate();
                                            }
                                        }
                                    } else if (i18 == 2) {
                                        if (i18 == 1) {
                                            j6 = this.progress;
                                            if (setProgressAt(motionEvent.getX(), false)) {
                                                this.loopProgressFrom = j6;
                                                this.loopProgress.set(1.0f, true);
                                                invalidate();
                                            }
                                        } else {
                                            j6 = this.progress;
                                            if (setProgressAt(motionEvent.getX(), false)) {
                                                this.loopProgressFrom = j6;
                                                this.loopProgress.set(1.0f, true);
                                                invalidate();
                                            }
                                        }
                                    } else if (i18 == 1) {
                                        j6 = this.progress;
                                        if (setProgressAt(motionEvent.getX(), false)) {
                                            this.loopProgressFrom = j6;
                                            this.loopProgress.set(1.0f, true);
                                            invalidate();
                                        }
                                    } else {
                                        j6 = this.progress;
                                        if (setProgressAt(motionEvent.getX(), false)) {
                                            this.loopProgressFrom = j6;
                                            this.loopProgress.set(1.0f, true);
                                            invalidate();
                                        }
                                    }
                                } else if (i18 != 2 && !this.audioSelected) {
                                    this.audioSelected = true;
                                    this.roundSelected = false;
                                    TimelineDelegate timelineDelegate26 = this.delegate;
                                    if (timelineDelegate26 != null) {
                                        timelineDelegate26.onRoundSelectChange(false);
                                    }
                                    invalidate();
                                } else if (i18 != 1 && !this.roundSelected) {
                                    this.audioSelected = false;
                                    this.roundSelected = true;
                                    TimelineDelegate timelineDelegate27 = this.delegate;
                                    if (timelineDelegate27 != null) {
                                        timelineDelegate27.onRoundSelectChange(true);
                                    }
                                    invalidate();
                                } else if (i18 == 2 && this.audioSelected) {
                                    this.audioSelected = false;
                                    this.roundSelected = false;
                                    TimelineDelegate timelineDelegate28 = this.delegate;
                                    if (timelineDelegate28 != null) {
                                        timelineDelegate28.onRoundSelectChange(false);
                                    }
                                    invalidate();
                                } else if (i18 == 1 && this.roundSelected) {
                                    this.audioSelected = false;
                                    this.roundSelected = false;
                                    TimelineDelegate timelineDelegate29 = this.delegate;
                                    if (timelineDelegate29 != null) {
                                        timelineDelegate29.onRoundSelectChange(false);
                                    }
                                    invalidate();
                                } else {
                                    j6 = this.progress;
                                    if (setProgressAt(motionEvent.getX(), false) && Math.abs(this.progress - j6) > 400) {
                                        this.loopProgressFrom = j6;
                                        this.loopProgress.set(1.0f, true);
                                        invalidate();
                                    }
                                }
                            } else {
                                long jClamp = (long) Utilities.clamp(((((motionEvent.getX() - this.px) - this.ph) / this.sw) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.scroll, getBaseDuration(), 0.0f);
                                Track track20 = this.videoTrack;
                                float f60 = track20.right - track20.left;
                                track20.left = (1.0f - f60) * (jClamp / getBaseDuration());
                                Track track21 = this.videoTrack;
                                float f61 = track21.left;
                                track21.right = f60 + f61;
                                TimelineDelegate timelineDelegate30 = this.delegate;
                                if (timelineDelegate30 != null) {
                                    timelineDelegate30.onVideoLeftChange(true, f61);
                                    this.delegate.onVideoRightChange(true, this.videoTrack.right);
                                }
                                invalidate();
                            }
                        } else if (this.pressType == 10 && (runnable = this.onTimelineClick) != null) {
                            runnable.run();
                        }
                        z = true;
                    }
                    RichEditor$$ExternalSyntheticLambda48 richEditor$$ExternalSyntheticLambda49 = this.askExactSeek;
                    if (richEditor$$ExternalSyntheticLambda49 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditor$$ExternalSyntheticLambda49);
                        this.askExactSeek = null;
                    }
                    if (this.dragged && z && (timelineDelegate = this.delegate) != null) {
                        timelineDelegate.onProgressDragChange(false);
                    }
                    this.dragSpeed = 1.0f;
                    this.dragged = false;
                    this.draggingProgress = false;
                    this.pressTime = -1L;
                    this.pressHandle = -1;
                    VelocityTracker velocityTracker7 = this.velocityTracker;
                    if (velocityTracker7 != null) {
                        velocityTracker7.recycle();
                        this.velocityTracker = null;
                    }
                }
                this.lastTime = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    public void setCollage(ArrayList<StoryEntry> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        VideoThumbsLoader videoThumbsLoader;
        int i = 0;
        while (true) {
            arrayList2 = this.collageTracks;
            if (i >= arrayList2.size()) {
                break;
            }
            Track track = (Track) arrayList2.get(i);
            if (track != null && (videoThumbsLoader = track.thumbs) != null) {
                videoThumbsLoader.destroy();
            }
            i++;
        }
        arrayList2.clear();
        int i2 = 0;
        while (true) {
            arrayList3 = this.collageWaveforms;
            if (i2 >= arrayList3.size()) {
                break;
            }
            AudioWaveformLoader audioWaveformLoader = (AudioWaveformLoader) arrayList3.get(i2);
            if (audioWaveformLoader != null) {
                audioWaveformLoader.destroy();
            }
            i2++;
        }
        arrayList3.clear();
        this.timelineWaveformMax.set(1.0f, true);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                arrayList3.add(null);
                StoryEntry storyEntry = arrayList.get(i3);
                if (storyEntry.isVideo) {
                    Track track2 = new Track();
                    track2.index = i3;
                    track2.isRound = false;
                    track2.path = storyEntry.file.getAbsolutePath();
                    track2.duration = storyEntry.duration;
                    track2.offset = storyEntry.videoOffset;
                    track2.volume = storyEntry.videoVolume;
                    track2.left = storyEntry.videoLeft;
                    track2.right = storyEntry.videoRight;
                    track2.setupThumbs(false);
                    Track.access$700(track2);
                    arrayList2.add(track2);
                }
            }
        }
        Collections.sort(arrayList2, new CacheModel$$ExternalSyntheticLambda0(17));
        this.collageMain = arrayList2.isEmpty() ? null : (Track) arrayList2.get(0);
        this.collageSelected = 0;
    }

    public void setDelegate(TimelineDelegate timelineDelegate) {
        this.delegate = timelineDelegate;
    }

    public void setMaxCount(int i) {
        this.maxCount = i;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.onHeightChange = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.onTimelineClick = runnable;
    }

    public void setProgress(long j) {
        long j2;
        float f;
        float f2;
        Track track = this.videoTrack;
        if (track != null) {
            long j3 = this.progress;
            if (j < j3) {
                float f3 = j;
                float f4 = track.duration;
                if (f3 <= (track.left * f4) + 240.0f && j3 + 240 >= f4 * track.right) {
                    this.loopProgressFrom = -1L;
                    this.loopProgress.set(1.0f, true);
                } else if (!this.hasAudio && !this.hasRound && track == null) {
                    long j4 = this.progress;
                    if (j < j4) {
                        float f5 = j;
                        float f6 = this.audioDuration;
                        if (f5 <= (this.audioLeft * f6) + 240.0f && j4 + 240 >= f6 * this.audioRight) {
                            this.loopProgressFrom = -1L;
                            this.loopProgress.set(1.0f, true);
                        } else if (this.hasRound) {
                            j2 = this.progress;
                            if (j < j2) {
                                f = j;
                                f2 = this.roundDuration;
                                if (f <= (this.audioLeft * f2) + 240.0f) {
                                    this.loopProgressFrom = -1L;
                                    this.loopProgress.set(1.0f, true);
                                }
                            }
                        }
                    } else if (this.hasRound) {
                        j2 = this.progress;
                        if (j < j2) {
                            f = j;
                            f2 = this.roundDuration;
                            if (f <= (this.audioLeft * f2) + 240.0f) {
                                this.loopProgressFrom = -1L;
                                this.loopProgress.set(1.0f, true);
                            }
                        }
                    }
                } else if (this.hasRound && track == null) {
                    j2 = this.progress;
                    if (j < j2) {
                        f = j;
                        f2 = this.roundDuration;
                        if (f <= (this.audioLeft * f2) + 240.0f && j2 + 240 >= f2 * this.audioRight) {
                            this.loopProgressFrom = -1L;
                            this.loopProgress.set(1.0f, true);
                        }
                    }
                }
            } else if (!this.hasAudio) {
                if (this.hasRound) {
                    j2 = this.progress;
                    if (j < j2) {
                        f = j;
                        f2 = this.roundDuration;
                        if (f <= (this.audioLeft * f2) + 240.0f) {
                            this.loopProgressFrom = -1L;
                            this.loopProgress.set(1.0f, true);
                        }
                    }
                }
            } else if (this.hasRound) {
                j2 = this.progress;
                if (j < j2) {
                    f = j;
                    f2 = this.roundDuration;
                    if (f <= (this.audioLeft * f2) + 240.0f) {
                        this.loopProgressFrom = -1L;
                        this.loopProgress.set(1.0f, true);
                    }
                }
            }
        } else if (!this.hasAudio) {
            if (this.hasRound) {
                j2 = this.progress;
                if (j < j2) {
                    f = j;
                    f2 = this.roundDuration;
                    if (f <= (this.audioLeft * f2) + 240.0f) {
                        this.loopProgressFrom = -1L;
                        this.loopProgress.set(1.0f, true);
                    }
                }
            }
        } else if (this.hasRound) {
            j2 = this.progress;
            if (j < j2) {
                f = j;
                f2 = this.roundDuration;
                if (f <= (this.audioLeft * f2) + 240.0f) {
                    this.loopProgressFrom = -1L;
                    this.loopProgress.set(1.0f, true);
                }
            }
        }
        this.progress = j;
        invalidate();
    }

    public final boolean setProgressAt(float f, boolean z) {
        long j;
        Track track = this.videoTrack;
        ArrayList arrayList = this.collageTracks;
        if (track == null && !this.hasAudio && arrayList.isEmpty()) {
            return false;
        }
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f2 = ((f - this.px) - this.ph) / this.sw;
        Track track2 = this.collageMain;
        if (track2 != null) {
            j = (long) ((track2.left * track2.duration) + track2.offset);
        } else {
            j = 0;
        }
        float f3 = f2 * jMin;
        if (track2 == null) {
            j = this.videoTrack == null ? this.audioOffset : 0L;
        }
        long jClamp = (long) Utilities.clamp((f3 - j) + this.scroll, getBaseDuration(), 0.0f);
        Track track3 = this.videoTrack;
        if (track3 != null) {
            float f4 = jClamp / track3.duration;
            if (f4 < track3.left || f4 > track3.right) {
                return false;
            }
        }
        Track track4 = this.collageMain;
        if (track4 != null && (jClamp < 0 || jClamp >= ((long) ((track4.right - track4.left) * track4.duration)))) {
            return false;
        }
        if (this.hasAudio && track3 == null && arrayList.isEmpty()) {
            float f5 = jClamp / this.audioDuration;
            if (f5 < this.audioLeft || f5 > this.audioRight) {
                return false;
            }
        }
        this.progress = jClamp;
        invalidate();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onProgressChange(jClamp, z);
        }
        RichEditor$$ExternalSyntheticLambda48 richEditor$$ExternalSyntheticLambda48 = this.askExactSeek;
        if (richEditor$$ExternalSyntheticLambda48 != null) {
            AndroidUtilities.cancelRunOnUIThread(richEditor$$ExternalSyntheticLambda48);
            this.askExactSeek = null;
        }
        if (!z) {
            return true;
        }
        RichEditor$$ExternalSyntheticLambda48 richEditor$$ExternalSyntheticLambda49 = new RichEditor$$ExternalSyntheticLambda48(this, jClamp, 19);
        this.askExactSeek = richEditor$$ExternalSyntheticLambda49;
        AndroidUtilities.runOnUIThread(richEditor$$ExternalSyntheticLambda49, 150L);
        return true;
    }

    public final void setRound(String str, long j, long j2, float f, float f2, float f3, boolean z) {
        boolean z2;
        boolean z3;
        Track track;
        if (TextUtils.equals(this.roundPath, str)) {
            return;
        }
        VideoThumbsLoader videoThumbsLoader = this.roundThumbs;
        if (videoThumbsLoader != null) {
            videoThumbsLoader.destroy();
            this.roundThumbs = null;
        }
        long j3 = this.roundDuration;
        if (str != null) {
            this.roundPath = str;
            this.roundDuration = j;
            this.roundOffset = j2 - ((long) (j * f));
            this.roundLeft = f;
            this.roundRight = f2;
            this.roundVolume = f3;
            if (getMeasuredWidth() <= 0 || this.roundThumbs != null || ((track = this.videoTrack) != null && track.duration < 1)) {
                z3 = false;
                z2 = true;
            } else {
                String str2 = this.roundPath;
                int i = this.w;
                int i2 = this.px;
                int i3 = (i - i2) - i2;
                int iDp = AndroidUtilities.dp(38.0f);
                long j4 = this.roundDuration;
                Long lValueOf = j4 > 2 ? Long.valueOf(j4) : null;
                Track track2 = this.videoTrack;
                z3 = false;
                z2 = true;
                this.roundThumbs = new VideoThumbsLoader(false, str2, i3, iDp, lValueOf, track2 != null ? track2.duration : getMaxScrollDuration(), -1L, -1L, new TimelineView$$ExternalSyntheticLambda1(this, 0));
            }
            if (this.videoTrack == null) {
                this.audioSelected = z3;
                this.roundSelected = z2;
            }
        } else {
            j3 = j3;
            z2 = true;
            this.roundPath = null;
            this.roundDuration = 1L;
            this.roundSelected = false;
        }
        this.hasRound = this.roundPath != null;
        if (j3 != j && this.videoTrack == null && this.waveform != null) {
            this.resetWaveform = z2;
            setupAudioWaveform();
        }
        if (this.hasAudio && this.hasRound && this.videoTrack == null) {
            this.audioLeft = 0.0f;
            this.audioRight = Utilities.clamp(j / this.audioDuration, 1.0f, 0.0f);
        }
        if (!z) {
            this.roundSelectedT.set(this.roundSelected, z2);
            this.audioSelectedT.set(this.audioSelected, z2);
            this.roundT.set(this.hasRound, z2);
        }
        invalidate();
    }

    public void setRoundNull(boolean z) {
        setRound(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z);
    }

    public final void setVideo(boolean z, String str, long j, float f) {
        Track track = this.videoTrack;
        if (TextUtils.equals(track == null ? null : track.path, str)) {
            return;
        }
        Track track2 = this.videoTrack;
        if (track2 != null) {
            VideoThumbsLoader videoThumbsLoader = track2.thumbs;
            if (videoThumbsLoader != null) {
                videoThumbsLoader.destroy();
                this.videoTrack.thumbs = null;
            }
            this.videoTrack = null;
        }
        if (str != null) {
            this.scroll = 0L;
            Track track3 = new Track();
            this.videoTrack = track3;
            track3.isRound = z;
            track3.path = str;
            track3.duration = j;
            track3.volume = f;
            track3.setupThumbs(false);
        } else {
            this.videoTrack = null;
            this.scroll = 0L;
        }
        if (!this.hasRound) {
            this.roundSelected = false;
        }
        this.progress = 0L;
        invalidate();
    }

    public void setVideoLeft(float f) {
        Track track = this.videoTrack;
        if (track == null) {
            return;
        }
        track.left = f;
        invalidate();
    }

    public void setVideoRight(float f) {
        Track track = this.videoTrack;
        if (track == null) {
            return;
        }
        track.right = f;
        invalidate();
    }

    public final void setupAudioWaveform() {
        if (getMeasuredWidth() > 0) {
            if (this.waveform == null || this.resetWaveform) {
                this.waveform = new AudioWaveformLoader(this.audioPath, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.waveformIsLoaded = false;
                this.waveformMax.set(1.0f, true);
            }
        }
    }

    public final class WaveformPath extends Path {
        public static final int $r8$clinit = 0;
        public float lastAudioHeight;
        public float lastAudioSelected;
        public float lastBottom;
        public float lastLeft;
        public float lastMaxBar;
        public float lastRight;
        public float lastStart;
        public ArrayList lastWaveformCounts;
        public ArrayList lastWaveformLoaded;
        public final int ph = AndroidUtilities.dp(10.0f);
        public final float[] waveformRadii;

        public WaveformPath() {
            this.waveformRadii = new float[]{fDp, fDp, fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f};
            float fDp = AndroidUtilities.dp(2.0f);
        }

        public final void check(float f, float f2, float f3, float f4, long j, float f5, float f6, float f7, AudioWaveformLoader audioWaveformLoader) {
            float f8;
            ArrayList arrayList;
            if (audioWaveformLoader == null) {
                rewind();
                return;
            }
            float f9 = audioWaveformLoader.loaded;
            AnimatedFloat animatedFloat = audioWaveformLoader.animatedLoaded;
            float f10 = animatedFloat.set(f9);
            float f11 = 0.0f;
            if (0 == j && Math.abs(this.lastAudioHeight - f5) <= 1.0f && Math.abs(this.lastMaxBar - f6) <= 0.01f && Math.abs(this.lastAudioSelected - f4) <= 0.1f && Math.abs(this.lastBottom - f7) <= 1.0f && Math.abs(this.lastStart - f) <= 1.0f && Math.abs(this.lastLeft - f2) <= 1.0f && Math.abs(this.lastRight - f3) <= 1.0f && (arrayList = this.lastWaveformCounts) != null && arrayList.size() == 1) {
                ArrayList arrayList2 = this.lastWaveformLoaded;
                if (Math.abs(((arrayList2 == null || arrayList2.isEmpty()) ? 0.0f : ((Float) this.lastWaveformLoaded.get(0)).floatValue()) - f10) <= 0.01f) {
                    return;
                }
            }
            ArrayList arrayList3 = this.lastWaveformCounts;
            if (arrayList3 == null) {
                this.lastWaveformCounts = new ArrayList();
            } else {
                arrayList3.clear();
            }
            ArrayList arrayList4 = this.lastWaveformCounts;
            int i = audioWaveformLoader.count;
            arrayList4.add(Integer.valueOf(i));
            ArrayList arrayList5 = this.lastWaveformLoaded;
            if (arrayList5 == null) {
                this.lastWaveformLoaded = new ArrayList();
            } else {
                arrayList5.clear();
            }
            this.lastWaveformLoaded.add(Float.valueOf(f10));
            this.lastStart = f;
            this.lastLeft = f2;
            this.lastRight = f3;
            this.lastAudioSelected = f4;
            this.lastMaxBar = f6;
            this.lastAudioHeight = f5;
            this.lastBottom = f7;
            float f12 = animatedFloat.set(audioWaveformLoader.loaded);
            rewind();
            float fRound = Math.round(AndroidUtilities.dpf2(3.3333f));
            int i2 = this.ph;
            int iMax = Math.max(0, (int) (((f2 - i2) - f) / fRound));
            int iMin = Math.min(i - 1, (int) Math.ceil(((i2 + f3) - f) / fRound));
            while (iMax <= iMin) {
                float f13 = iMax;
                float fDp = (f13 * fRound) + f + AndroidUtilities.dp(2.0f);
                float f14 = f6 <= f11 ? 0.0f : (audioWaveformLoader.data[iMax] / f6) * f5 * 0.6f;
                if (f13 < f12) {
                    f8 = 0.0f;
                    if (iMax + 1 > f12) {
                        f14 *= f12 - f13;
                    }
                    if (fDp >= f2 || fDp > f3) {
                        f14 *= f4;
                        if (f14 > f8) {
                            float fMax = Math.max(f14, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(fDp, AndroidUtilities.lerp(f7 - fMax, f7 - ((f5 + fMax) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f7, ImageReceiver$$ExternalSyntheticOutline1.m(f5, fMax, 2.0f, f7), f4));
                            addRoundRect(rectF, this.waveformRadii, Path.Direction.CW);
                        }
                    } else {
                        float fMax2 = Math.max(f14, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(fDp, AndroidUtilities.lerp(f7 - fMax2, f7 - ((f5 + fMax2) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f7, ImageReceiver$$ExternalSyntheticOutline1.m(f5, fMax2, 2.0f, f7), f4));
                        addRoundRect(rectF2, this.waveformRadii, Path.Direction.CW);
                    }
                    iMax++;
                    iMin = iMin;
                    f11 = 0.0f;
                } else {
                    f8 = 0.0f;
                }
                if (f13 > f12) {
                    f14 = 0.0f;
                }
                if (fDp >= f2) {
                    f14 *= f4;
                    if (f14 > f8) {
                        float fMax3 = Math.max(f14, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                        RectF rectF3 = AndroidUtilities.rectTmp;
                        rectF3.set(fDp, AndroidUtilities.lerp(f7 - fMax3, f7 - ((f5 + fMax3) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f7, ImageReceiver$$ExternalSyntheticOutline1.m(f5, fMax3, 2.0f, f7), f4));
                        addRoundRect(rectF3, this.waveformRadii, Path.Direction.CW);
                    }
                } else {
                    f14 *= f4;
                    if (f14 > f8) {
                        float fMax4 = Math.max(f14, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(fDp, AndroidUtilities.lerp(f7 - fMax4, f7 - ((f5 + fMax4) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f7, ImageReceiver$$ExternalSyntheticOutline1.m(f5, fMax4, 2.0f, f7), f4));
                        addRoundRect(rectF4, this.waveformRadii, Path.Direction.CW);
                    }
                }
                iMax++;
                iMin = iMin;
                f11 = 0.0f;
            }
        }

        public final void check(float f, float f2, float f3, float f4, float f5, float f6, ArrayList arrayList) {
            ArrayList arrayList2;
            float f7 = f;
            float f8 = f3;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (Math.abs(this.lastAudioHeight - f4) <= 1.0f && Math.abs(this.lastMaxBar - f5) <= 0.01f && Math.abs(this.lastAudioSelected - 0.0f) <= 0.1f && Math.abs(this.lastBottom - f6) <= 1.0f && Math.abs(this.lastStart - f7) <= 1.0f && Math.abs(this.lastLeft - f2) <= 1.0f && Math.abs(this.lastRight - f8) <= 1.0f) {
                    ArrayList arrayList3 = this.lastWaveformCounts;
                    if (arrayList3 == null || arrayList3.size() != arrayList.size()) {
                        arrayList2 = this.lastWaveformLoaded;
                        if (arrayList2 != null || arrayList2.size() != arrayList.size()) {
                            return;
                        }
                        for (int i = 0; i < arrayList2.size(); i++) {
                            if (((Float) arrayList2.get(i)).floatValue() != (arrayList.get(i) == null ? 0.0f : ((AudioWaveformLoader) arrayList.get(i)).animatedLoaded.set(((AudioWaveformLoader) arrayList.get(i)).loaded))) {
                                return;
                            }
                        }
                    } else {
                        int i2 = 0;
                        while (true) {
                            if (i2 < arrayList3.size()) {
                                if (((Integer) arrayList3.get(i2)).intValue() != (arrayList.get(i2) == null ? 0 : ((AudioWaveformLoader) arrayList.get(i2)).count)) {
                                    arrayList2 = this.lastWaveformLoaded;
                                    if (arrayList2 != null) {
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                i2++;
                            }
                        }
                    }
                }
                ArrayList arrayList4 = this.lastWaveformCounts;
                if (arrayList4 == null) {
                    this.lastWaveformCounts = new ArrayList();
                } else {
                    arrayList4.clear();
                }
                int iM = 0;
                while (iM < arrayList.size()) {
                    iM = LocationController$$ExternalSyntheticOutline0.m(arrayList.get(iM) == null ? 0 : ((AudioWaveformLoader) arrayList.get(iM)).count, iM, 1, this.lastWaveformCounts);
                }
                ArrayList arrayList5 = this.lastWaveformLoaded;
                if (arrayList5 == null) {
                    this.lastWaveformLoaded = new ArrayList();
                } else {
                    arrayList5.clear();
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    this.lastWaveformLoaded.add(Float.valueOf(arrayList.get(i3) == null ? 0.0f : ((AudioWaveformLoader) arrayList.get(i3)).animatedLoaded.set(((AudioWaveformLoader) arrayList.get(i3)).loaded)));
                }
                this.lastStart = f7;
                this.lastLeft = f2;
                this.lastRight = f8;
                this.lastAudioSelected = 0.0f;
                this.lastMaxBar = f5;
                this.lastAudioHeight = f4;
                this.lastBottom = f6;
                ArrayList arrayList6 = this.lastWaveformLoaded;
                rewind();
                float fRound = Math.round(AndroidUtilities.dpf2(3.3333f));
                int iMax = 0;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (arrayList.get(i4) != null) {
                        iMax = Math.max(iMax, ((AudioWaveformLoader) arrayList.get(i4)).count);
                    }
                }
                float f9 = this.ph;
                int iMax2 = Math.max(0, (int) (((f2 - f9) - f7) / fRound));
                int iMin = Math.min(iMax - 1, (int) Math.ceil(((f8 + f9) - f7) / fRound));
                while (iMax2 <= iMin) {
                    float f10 = iMax2;
                    float fDp = (f10 * fRound) + f7 + AndroidUtilities.dp(2.0f);
                    int i5 = 0;
                    for (int i6 = 0; i6 < arrayList.size(); i6++) {
                        short sFloatValue = (arrayList.get(i6) == null || iMax2 >= ((AudioWaveformLoader) arrayList.get(i6)).count) ? (short) 0 : ((AudioWaveformLoader) arrayList.get(i6)).data[iMax2];
                        if (f10 < ((Float) arrayList6.get(i6)).floatValue() && iMax2 + 1 > ((Float) arrayList6.get(i6)).floatValue()) {
                            sFloatValue = (short) ((((Float) arrayList6.get(i6)).floatValue() - f10) * sFloatValue);
                        } else if (f10 > ((Float) arrayList6.get(i6)).floatValue()) {
                            sFloatValue = 0;
                        }
                        i5 += sFloatValue;
                    }
                    float f11 = f5 <= 0.0f ? 0.0f : (i5 / f5) * f4 * 0.6f;
                    if (fDp < f2 || fDp > f8) {
                        f11 *= 0.0f;
                        if (f11 > 0.0f) {
                            float fMax = Math.max(f11, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), 0.0f));
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(fDp, AndroidUtilities.lerp(f6 - fMax, f6 - ((f4 + fMax) / 2.0f), 0.0f), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f6, ImageReceiver$$ExternalSyntheticOutline1.m(f4, fMax, 2.0f, f6), 0.0f));
                            addRoundRect(rectF, this.waveformRadii, Path.Direction.CW);
                        }
                    } else {
                        float fMax2 = Math.max(f11, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), 0.0f));
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(fDp, AndroidUtilities.lerp(f6 - fMax2, f6 - ((f4 + fMax2) / 2.0f), 0.0f), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f6, ImageReceiver$$ExternalSyntheticOutline1.m(f4, fMax2, 2.0f, f6), 0.0f));
                        addRoundRect(rectF2, this.waveformRadii, Path.Direction.CW);
                    }
                    iMax2++;
                    f7 = f;
                    f8 = f3;
                }
                return;
            }
            rewind();
        }
    }
}

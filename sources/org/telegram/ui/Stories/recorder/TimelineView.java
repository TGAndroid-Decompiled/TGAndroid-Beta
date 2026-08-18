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
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Scroller;
import org.telegram.ui.Components.Text;

public class TimelineView extends View {
    private Runnable askExactSeek;
    private StaticLayout audioAuthor;
    private float audioAuthorLeft;
    private final TextPaint audioAuthorPaint;
    private float audioAuthorWidth;
    private final BlurringShader.StoryBlurDrawer audioBlur;
    private final RectF audioBounds;
    private final Path audioClipPath;
    private final Paint audioDotPaint;
    private long audioDuration;
    private final Drawable audioIcon;
    private float audioLeft;
    private long audioOffset;
    private String audioPath;
    private float audioRight;
    private boolean audioSelected;
    private final AnimatedFloat audioSelectedT;
    private final AnimatedFloat audioT;
    private StaticLayout audioTitle;
    private float audioTitleLeft;
    private final TextPaint audioTitlePaint;
    private float audioTitleWidth;
    private float audioVolume;
    private final BlurringShader.StoryBlurDrawer audioWaveformBlur;
    private final BlurringShader.StoryBlurDrawer backgroundBlur;
    private final BlurringShader.BlurManager blurManager;
    private final Path collageClipPath;
    private final Paint collageFramePaint;
    private Track collageMain;
    private int collageSelected;
    private final ArrayList collageTracks;
    private final ArrayList collageWaveforms;
    private final TextPaint countTextPaint;
    private long coverEnd;
    private long coverStart;
    private TimelineDelegate delegate;
    private float dragSpeed;
    private boolean dragged;
    private boolean draggingProgress;
    private final LinearGradient ellipsizeGradient;
    private final Matrix ellipsizeMatrix;
    private final Paint ellipsizePaint;
    private int h;
    private boolean hadDragChange;
    private boolean hasAudio;
    private boolean hasRound;
    private boolean isCover;
    private int lastHeight;
    private long lastTime;
    private float lastX;
    private final AnimatedFloat loopProgress;
    private long loopProgressFrom;
    private int maxCount;
    private Runnable onHeightChange;
    private final Runnable onLongPress;
    private Runnable onTimelineClick;
    public boolean open;
    private final AnimatedFloat openT;
    private int ph;
    private int pressCollageIndex;
    private int pressHandle;
    private int pressHandleCollageIndex;
    private long pressTime;
    private int pressType;
    private final View previewContainer;
    private long progress;
    private final Paint progressShadowPaint;
    private final Paint progressWhitePaint;
    private int px;
    private int py;
    private final Paint regionCutPaint;
    private final Paint regionHandlePaint;
    private final Paint regionPaint;
    private boolean resetWaveform;
    private final Theme.ResourcesProvider resourcesProvider;
    private final RectF roundBounds;
    private final Path roundClipPath;
    private long roundDuration;
    private float roundLeft;
    private long roundOffset;
    private String roundPath;
    private float roundRight;
    private boolean roundSelected;
    private final AnimatedFloat roundSelectedT;
    private final AnimatedFloat roundT;
    private VideoThumbsLoader roundThumbs;
    private float roundVolume;
    private long scroll;
    private final Scroller scroller;
    private boolean scrolling;
    private int scrollingCollage;
    private boolean scrollingVideo;
    private final Path selectedCollageClipPath;
    private final Path selectedVideoClipPath;
    final float[] selectedVideoRadii;
    private int sw;
    private final RectF timelineBounds;
    private final Path timelineClipPath;
    private final Drawable timelineIcon;
    private final Text timelineText;
    private final AnimatedFloat timelineWaveformLoaded;
    private final AnimatedFloat timelineWaveformMax;
    private final WaveformPath timelineWaveformPath;
    private VelocityTracker velocityTracker;
    private final RectF videoBounds;
    private final Path videoClipPath;
    private final Paint videoFramePaint;
    private Track videoTrack;
    private int w;
    private int wasScrollX;
    private AudioWaveformLoader waveform;
    private boolean waveformIsLoaded;
    private final AnimatedFloat waveformMax;
    private final Paint waveformPaint;
    private final WaveformPath waveformPath;

    public interface TimelineDelegate {

        public abstract class CC {
            public static void $default$onAudioLeftChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onAudioOffsetChange(TimelineDelegate timelineDelegate, long j) {
            }

            public static void $default$onAudioRemove(TimelineDelegate timelineDelegate) {
            }

            public static void $default$onAudioRightChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onAudioVolumeChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onProgressChange(TimelineDelegate timelineDelegate, long j, boolean z) {
            }

            public static void $default$onProgressDragChange(TimelineDelegate timelineDelegate, boolean z) {
            }

            public static void $default$onRoundLeftChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onRoundOffsetChange(TimelineDelegate timelineDelegate, long j) {
            }

            public static void $default$onRoundRemove(TimelineDelegate timelineDelegate) {
            }

            public static void $default$onRoundRightChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onRoundSelectChange(TimelineDelegate timelineDelegate, boolean z) {
            }

            public static void $default$onRoundVolumeChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onVideoLeftChange(TimelineDelegate timelineDelegate, int i, float f) {
            }

            public static void $default$onVideoOffsetChange(TimelineDelegate timelineDelegate, int i, long j) {
            }

            public static void $default$onVideoRightChange(TimelineDelegate timelineDelegate, int i, float f) {
            }

            public static void $default$onVideoRightChange(TimelineDelegate timelineDelegate, boolean z, float f) {
            }

            public static void $default$onVideoSelected(TimelineDelegate timelineDelegate, int i) {
            }

            public static void $default$onVideoVolumeChange(TimelineDelegate timelineDelegate, float f) {
            }

            public static void $default$onVideoVolumeChange(TimelineDelegate timelineDelegate, int i, float f) {
            }
        }

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

    public static int heightDp() {
        return 388;
    }

    public long getMaxScrollDuration() {
        if (this.collageTracks.isEmpty()) {
            return Math.max(120000L, (long) (maxSelectDuration() * 1.5f));
        }
        return 70000L;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.onTimelineClick = runnable;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.onHeightChange = runnable;
    }

    class Track {
        final RectF bounds;
        long duration;
        int index;
        boolean isRound;
        float left;
        long offset;
        String path;
        float right;
        private final AnimatedFloat selectedT;
        VideoThumbsLoader thumbs;
        float volume;

        private Track() {
            this.bounds = new RectF();
            this.selectedT = new AnimatedFloat(TimelineView.this, 360L, CubicBezierInterpolator.EASE_OUT_QUINT);
        }

        public void setupThumbs(boolean z) {
            if (TimelineView.this.getMeasuredWidth() > 0) {
                VideoThumbsLoader videoThumbsLoader = this.thumbs;
                if (videoThumbsLoader == null || z) {
                    if (videoThumbsLoader != null) {
                        videoThumbsLoader.destroy();
                        this.thumbs = null;
                    }
                    TimelineView timelineView = TimelineView.this;
                    boolean z2 = this.isRound;
                    String str = this.path;
                    int i = (timelineView.w - TimelineView.this.px) - TimelineView.this.px;
                    int iDp = AndroidUtilities.dp(38.0f);
                    long j = this.duration;
                    this.thumbs = timelineView.new VideoThumbsLoader(z2, str, i, iDp, j > 2 ? Long.valueOf(j) : null, TimelineView.this.getMaxScrollDuration(), TimelineView.this.coverStart, TimelineView.this.coverEnd, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$setupThumbs$0();
                        }
                    });
                }
            }
        }

        public void lambda$setupThumbs$0() {
            VideoThumbsLoader videoThumbsLoader = this.thumbs;
            if (videoThumbsLoader == null || videoThumbsLoader.getDuration() <= 0) {
                return;
            }
            this.duration = this.thumbs.getDuration();
            TimelineView.this.sortCollage();
        }

        public void setupWaveform(boolean z) {
            int i = this.index;
            if (i < 0 || i >= TimelineView.this.collageWaveforms.size()) {
                return;
            }
            AudioWaveformLoader audioWaveformLoader = (AudioWaveformLoader) TimelineView.this.collageWaveforms.get(this.index);
            if (TimelineView.this.getMeasuredWidth() > 0) {
                if (audioWaveformLoader == null || z) {
                    if (audioWaveformLoader != null) {
                        audioWaveformLoader.destroy();
                    }
                    TimelineView timelineView = TimelineView.this;
                    TimelineView.this.collageWaveforms.set(this.index, timelineView.new AudioWaveformLoader(this.path, (timelineView.getMeasuredWidth() - TimelineView.this.getPaddingLeft()) - TimelineView.this.getPaddingRight()));
                }
            }
        }
    }

    public void setMaxCount(int i) {
        this.maxCount = i;
    }

    public int getMaxCount() {
        return this.maxCount;
    }

    private long maxSelectDuration() {
        return ((long) this.maxCount) * 59000;
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
        if (this.hasRound) {
            return Math.max(1L, this.roundDuration);
        }
        return Math.max(1L, this.audioDuration);
    }

    public void setOpen(boolean z, boolean z2) {
        if (this.open == z && z2) {
            return;
        }
        this.open = z;
        if (!z2) {
            this.openT.set(z, true);
        }
        invalidate();
    }

    public void setCover() {
        this.isCover = true;
    }

    public TimelineView(Context context, final ViewGroup viewGroup, final View view, final Theme.ResourcesProvider resourcesProvider, final BlurringShader.BlurManager blurManager) {
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
        this.timelineWaveformLoaded = new AnimatedFloat(this, 0L, 600L, cubicBezierInterpolator);
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
        this.scrollingCollage = -1;
        this.scrolling = false;
        this.selectedVideoRadii = new float[8];
        this.previewContainer = view;
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
        this.onLongPress = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$new$6(viewGroup, resourcesProvider, blurManager, view);
            }
        };
    }

    public void lambda$new$6(ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, View view) {
        int i;
        int i2 = this.pressType;
        try {
            if (i2 == 2 && this.hasAudio) {
                SliderView onValueChange = new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.audioVolume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$new$0((Float) obj);
                    }
                });
                long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
                int i3 = this.w;
                int i4 = this.px;
                int i5 = this.ph;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$new$1();
                    }
                }).setGravity(5).forceTop(true).translate((-(this.w - Math.min((i3 - i4) - i5, (i4 + i5) + ((((this.audioOffset - this.scroll) + (AndroidUtilities.lerp(this.audioRight, 1.0f, this.audioSelectedT.get()) * this.audioDuration)) / jMin) * this.sw)))) + AndroidUtilities.dp(18.0f), this.audioBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 1 && this.hasRound) {
                SliderView onValueChange2 = new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.roundVolume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$new$2((Float) obj);
                    }
                });
                long jMin2 = Math.min(getBaseDuration(), getMaxScrollDuration());
                int i6 = this.w;
                int i7 = this.px;
                int i8 = this.ph;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(onValueChange2).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$new$3();
                    }
                }).setGravity(5).forceTop(true).translate((-(this.w - Math.min((i6 - i7) - i8, (i7 + i8) + ((((this.roundOffset - this.scroll) + (AndroidUtilities.lerp(this.roundRight, 1.0f, this.roundSelectedT.get()) * this.roundDuration)) / jMin2) * this.sw)))) + AndroidUtilities.dp(18.0f), this.roundBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            } else if (i2 == 0 && this.videoTrack != null) {
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(this.videoTrack.volume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$new$4((Float) obj);
                    }
                })).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), this.videoBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            } else {
                if (i2 != 3 || (i = this.pressCollageIndex) < 0 || i >= this.collageTracks.size()) {
                    return;
                }
                final Track track = (Track) this.collageTracks.get(this.pressCollageIndex);
                ItemOptions.makeOptions(viewGroup, resourcesProvider, this).addView(new SliderView(getContext(), 0).setMinMax(0.0f, 1.5f).setValue(track.volume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$new$5(track, (Float) obj);
                    }
                })).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), track.bounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    public void lambda$new$0(Float f) {
        this.audioVolume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onAudioVolumeChange(f.floatValue());
        }
    }

    public void lambda$new$1() {
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onAudioRemove();
        }
    }

    public void lambda$new$2(Float f) {
        this.roundVolume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onRoundVolumeChange(f.floatValue());
        }
    }

    public void lambda$new$3() {
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onRoundRemove();
        }
    }

    public void lambda$new$4(Float f) {
        this.videoTrack.volume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onVideoVolumeChange(f.floatValue());
        }
    }

    public void lambda$new$5(Track track, Float f) {
        track.volume = f.floatValue();
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onVideoVolumeChange(track.index, f.floatValue());
        }
    }

    public void setDelegate(TimelineDelegate timelineDelegate) {
        this.delegate = timelineDelegate;
    }

    public void setCoverVideo(long j, long j2) {
        this.coverStart = j;
        this.coverEnd = j2;
        Track track = this.videoTrack;
        if (track != null) {
            track.setupThumbs(true);
        }
    }

    public void setVideo(boolean z, String str, long j, float f) {
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

    public void setCollage(ArrayList<StoryEntry> arrayList) {
        VideoThumbsLoader videoThumbsLoader;
        for (int i = 0; i < this.collageTracks.size(); i++) {
            Track track = (Track) this.collageTracks.get(i);
            if (track != null && (videoThumbsLoader = track.thumbs) != null) {
                videoThumbsLoader.destroy();
            }
        }
        this.collageTracks.clear();
        for (int i2 = 0; i2 < this.collageWaveforms.size(); i2++) {
            AudioWaveformLoader audioWaveformLoader = (AudioWaveformLoader) this.collageWaveforms.get(i2);
            if (audioWaveformLoader != null) {
                audioWaveformLoader.destroy();
            }
        }
        this.collageWaveforms.clear();
        this.timelineWaveformMax.set(1.0f, true);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.collageWaveforms.add(null);
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
                    track2.setupWaveform(false);
                    this.collageTracks.add(track2);
                }
            }
        }
        sortCollage();
        this.collageSelected = 0;
    }

    public static int lambda$sortCollage$7(Track track, Track track2) {
        return (int) (track2.duration - track.duration);
    }

    public void sortCollage() {
        Collections.sort(this.collageTracks, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return TimelineView.lambda$sortCollage$7((TimelineView.Track) obj, (TimelineView.Track) obj2);
            }
        });
        this.collageMain = this.collageTracks.isEmpty() ? null : (Track) this.collageTracks.get(0);
    }

    public void setRoundNull(boolean z) {
        setRound(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z);
    }

    public void setRound(String str, long j, long j2, float f, float f2, float f3, boolean z) {
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
            setupRoundThumbs();
            if (this.videoTrack == null) {
                this.audioSelected = false;
                this.roundSelected = true;
            }
        } else {
            this.roundPath = null;
            this.roundDuration = 1L;
            this.roundSelected = false;
        }
        this.hasRound = this.roundPath != null;
        if (j3 != j && this.videoTrack == null && this.waveform != null) {
            this.resetWaveform = true;
            setupAudioWaveform();
        }
        if (this.hasAudio && this.hasRound && this.videoTrack == null) {
            this.audioLeft = 0.0f;
            this.audioRight = Utilities.clamp(j / this.audioDuration, 1.0f, 0.0f);
        }
        if (!z) {
            this.roundSelectedT.set(this.roundSelected, true);
            this.audioSelectedT.set(this.audioSelected, true);
            this.roundT.set(this.hasRound, true);
        }
        invalidate();
    }

    public void selectRound(boolean z) {
        if (z && this.hasRound) {
            this.roundSelected = true;
            this.audioSelected = false;
        } else {
            this.roundSelected = false;
            this.audioSelected = this.hasAudio && this.videoTrack == null;
        }
        invalidate();
    }

    private void setupRoundThumbs() {
        if (getMeasuredWidth() <= 0 || this.roundThumbs != null) {
            return;
        }
        Track track = this.videoTrack;
        if (track == null || track.duration >= 1) {
            String str = this.roundPath;
            int i = this.w;
            int i2 = this.px;
            int i3 = (i - i2) - i2;
            int iDp = AndroidUtilities.dp(38.0f);
            long j = this.roundDuration;
            Long lValueOf = j > 2 ? Long.valueOf(j) : null;
            Track track2 = this.videoTrack;
            this.roundThumbs = new VideoThumbsLoader(false, str, i3, iDp, lValueOf, track2 != null ? track2.duration : getMaxScrollDuration(), -1L, -1L, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setupRoundThumbs$8();
                }
            });
        }
    }

    public void lambda$setupRoundThumbs$8() {
        VideoThumbsLoader videoThumbsLoader = this.roundThumbs;
        if (videoThumbsLoader == null || videoThumbsLoader.getDuration() <= 0) {
            return;
        }
        this.roundDuration = this.roundThumbs.getDuration();
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

    public void normalizeScrollByVideo() {
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        Track track = this.videoTrack;
        float f = (track.right + track.left) / 2.0f;
        long j = track.duration;
        this.scroll = Utilities.clamp((long) ((f * j) - (jMin / 2.0f)), j - jMin, 0L);
        invalidate();
    }

    public void setAudio(String str, String str2, String str3, long j, long j2, float f, float f2, float f3, boolean z) {
        String str4;
        String str5;
        if (!TextUtils.equals(this.audioPath, str)) {
            AudioWaveformLoader audioWaveformLoader = this.waveform;
            if (audioWaveformLoader != null) {
                audioWaveformLoader.destroy();
                this.waveform = null;
                this.waveformIsLoaded = false;
            }
            this.audioPath = str;
            setupAudioWaveform();
        }
        this.audioPath = str;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        this.hasAudio = !zIsEmpty;
        if (zIsEmpty) {
            this.audioSelected = false;
            str4 = null;
            str5 = null;
        } else {
            str4 = str2;
            str5 = str3;
        }
        if (TextUtils.isEmpty(str4)) {
            str4 = null;
        }
        if (TextUtils.isEmpty(str5)) {
            str5 = null;
        }
        if (this.hasAudio) {
            this.audioDuration = j;
            this.audioOffset = j2 - ((long) (j * f));
            this.audioLeft = f;
            this.audioRight = f2;
            this.audioVolume = f3;
            if (str4 != null) {
                StaticLayout staticLayout = new StaticLayout(str4, this.audioAuthorPaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.audioAuthor = staticLayout;
                this.audioAuthorWidth = staticLayout.getLineCount() > 0 ? this.audioAuthor.getLineWidth(0) : 0.0f;
                this.audioAuthorLeft = this.audioAuthor.getLineCount() > 0 ? this.audioAuthor.getLineLeft(0) : 0.0f;
            } else {
                this.audioAuthorWidth = 0.0f;
                this.audioAuthor = null;
            }
            if (str5 != null) {
                StaticLayout staticLayout2 = new StaticLayout(str5, this.audioTitlePaint, 99999, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.audioTitle = staticLayout2;
                this.audioTitleWidth = staticLayout2.getLineCount() > 0 ? this.audioTitle.getLineWidth(0) : 0.0f;
                this.audioTitleLeft = this.audioTitle.getLineCount() > 0 ? this.audioTitle.getLineLeft(0) : 0.0f;
            } else {
                this.audioTitleWidth = 0.0f;
                this.audioTitle = null;
            }
        }
        if (!z) {
            this.audioT.set(this.hasAudio, true);
        }
        invalidate();
    }

    private void setupAudioWaveform() {
        if (getMeasuredWidth() > 0) {
            if (this.waveform == null || this.resetWaveform) {
                this.waveform = new AudioWaveformLoader(this.audioPath, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.waveformIsLoaded = false;
                this.waveformMax.set(1.0f, true);
            }
        }
    }

    private int detectHandle(MotionEvent motionEvent) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        float fClamp = Utilities.clamp(this.progress, getBaseDuration(), 0L);
        Track track = this.collageMain;
        float f5 = jMin;
        float f6 = this.px + this.ph + (this.sw * (((fClamp + (track != null ? track.offset + (track.left * track.duration) : this.videoTrack == null ? this.audioOffset : 0L)) - this.scroll) / f5));
        if (!this.isCover && x >= f6 - AndroidUtilities.dp(12.0f) && x <= f6 + AndroidUtilities.dp(12.0f)) {
            return 0;
        }
        boolean z2 = this.videoTrack != null && y > (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        boolean z3 = !this.collageTracks.isEmpty() && y > ((((((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(4.0f))) - getCollageHeight()) - ((float) AndroidUtilities.dp(4.0f))) - ((float) AndroidUtilities.dp(2.0f)) && y < (((float) (this.h - this.py)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        if (!this.hasRound) {
            z = false;
        } else if (y <= (((((((this.h - this.py) - getVideoHeight()) - AndroidUtilities.dp(4.0f)) - getCollageHeight()) - AndroidUtilities.dp(this.collageTracks.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(2.0f)) {
            z = false;
        } else if (y < ((((this.h - this.py) - getVideoHeight()) - AndroidUtilities.dp(2.0f)) - getCollageHeight()) - AndroidUtilities.dp(this.collageTracks.isEmpty() ? 0.0f : 4.0f)) {
            z = true;
        } else {
            z = false;
        }
        if (z3) {
            for (int i = 0; i < this.collageTracks.size(); i++) {
                Track track2 = (Track) this.collageTracks.get(i);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(track2.bounds);
                rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                if (rectF.contains(x, y)) {
                    float f7 = this.px + this.ph;
                    long j = track2.offset;
                    float f8 = j;
                    float f9 = this.sw;
                    float f10 = ((f8 / f5) * f9) + f7;
                    float f11 = track2.left;
                    long j2 = track2.duration;
                    float f12 = j2;
                    float f13 = ((((f11 * f12) + f8) / f5) * f9) + f7;
                    float f14 = (((f8 + (track2.right * f12)) / f5) * f9) + f7;
                    float f15 = f7 + (((j + j2) / f5) * f9);
                    this.pressHandleCollageIndex = i;
                    if (x >= f13 - AndroidUtilities.dp(15.0f)) {
                        f4 = 5.0f;
                        if (x <= AndroidUtilities.dp(5.0f) + f13) {
                            return 13;
                        }
                    } else {
                        f4 = 5.0f;
                    }
                    if (x >= f14 - AndroidUtilities.dp(f4) && x <= AndroidUtilities.dp(15.0f) + f14) {
                        return 14;
                    }
                    if (x < f13 || x > f14 || (track2.left <= 0.01f && track2.right >= 0.99f)) {
                        return (x < f10 || x > f15) ? -1 : 16;
                    }
                    return 15;
                }
            }
        } else if (z2) {
            float f16 = this.px + this.ph;
            Track track3 = this.videoTrack;
            float f17 = track3.left;
            float f18 = track3.duration;
            float f19 = this.scroll;
            float f20 = this.sw;
            float f21 = ((((f17 * f18) - f19) / f5) * f20) + f16;
            float f22 = f16 + ((((track3.right * f18) - f19) / f5) * f20);
            if (this.isCover) {
                return (getBaseDuration() < getMaxScrollDuration() || (x >= f21 - ((float) AndroidUtilities.dp(15.0f)) && x <= f22 + ((float) AndroidUtilities.dp(15.0f)))) ? 4 : 1;
            }
            if (x >= f21 - AndroidUtilities.dp(15.0f)) {
                f3 = 5.0f;
                if (x <= AndroidUtilities.dp(5.0f) + f21) {
                    return 2;
                }
            } else {
                f3 = 5.0f;
            }
            if (x >= f22 - AndroidUtilities.dp(f3) && x <= AndroidUtilities.dp(15.0f) + f22) {
                return 3;
            }
            if (x >= f21 && x <= f22) {
                Track track4 = this.videoTrack;
                if (track4.left > 0.01f || track4.right < 0.99f) {
                    return 4;
                }
            }
        } else if (z) {
            float f23 = this.px + this.ph;
            float f24 = this.roundOffset;
            float f25 = this.roundLeft;
            float f26 = this.roundDuration;
            float f27 = this.scroll;
            float f28 = this.sw;
            float f29 = (((((f25 * f26) + f24) - f27) / f5) * f28) + f23;
            float f30 = f23 + ((((f24 + (this.roundRight * f26)) - f27) / f5) * f28);
            if (this.roundSelected || this.videoTrack == null) {
                if (x >= f29 - AndroidUtilities.dp(15.0f)) {
                    f2 = 5.0f;
                    if (x <= AndroidUtilities.dp(5.0f) + f29) {
                        return 10;
                    }
                } else {
                    f2 = 5.0f;
                }
                if (x >= f30 - AndroidUtilities.dp(f2) && x <= AndroidUtilities.dp(15.0f) + f30) {
                    return 11;
                }
                if (x >= f29 && x <= f30) {
                    return this.videoTrack == null ? 12 : 9;
                }
                float f31 = this.px + this.ph;
                long j3 = this.roundOffset;
                long j4 = this.scroll;
                float f32 = this.sw;
                float f33 = (((j3 - j4) / f5) * f32) + f31;
                f30 = f31 + ((((j3 + this.roundDuration) - j4) / f5) * f32);
                f29 = f33;
            }
            if (x >= f29 && x <= f30) {
                return 9;
            }
        } else if (this.hasAudio) {
            float f34 = this.px + this.ph;
            float f35 = this.audioOffset;
            float f36 = this.audioLeft;
            float f37 = this.audioDuration;
            float f38 = this.scroll;
            float f39 = this.sw;
            float f40 = (((((f36 * f37) + f35) - f38) / f5) * f39) + f34;
            float f41 = f34 + ((((f35 + (this.audioRight * f37)) - f38) / f5) * f39);
            if (this.audioSelected || (this.videoTrack == null && !this.hasRound)) {
                if (x >= f40 - AndroidUtilities.dp(15.0f)) {
                    f = 5.0f;
                    if (x <= AndroidUtilities.dp(5.0f) + f40) {
                        return 6;
                    }
                } else {
                    f = 5.0f;
                }
                if (x >= f41 - AndroidUtilities.dp(f) && x <= AndroidUtilities.dp(15.0f) + f41) {
                    return 7;
                }
                if (x >= f40 && x <= f41) {
                    return this.videoTrack == null ? 8 : 5;
                }
                float f42 = this.px + this.ph;
                long j5 = this.audioOffset;
                long j6 = this.scroll;
                float f43 = this.sw;
                float f44 = (((j5 - j6) / f5) * f43) + f42;
                f41 = f42 + ((((j5 + this.audioDuration) - j6) / f5) * f43);
                f40 = f44;
            }
            if (x >= f40 && x <= f41) {
                return 5;
            }
        }
        Track track5 = this.videoTrack;
        return (track5 == null || track5.duration <= getMaxScrollDuration() || !z2) ? -1 : 1;
    }

    public boolean onBackPressed() {
        boolean z = false;
        if (this.audioSelected) {
            this.audioSelected = false;
            z = true;
            if (this.hasRound && this.videoTrack == null) {
                this.roundSelected = true;
                TimelineDelegate timelineDelegate = this.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onRoundSelectChange(true);
                }
            }
        }
        return z;
    }

    public boolean isDragging() {
        return this.dragged;
    }

    private boolean setProgressAt(float f, boolean z) {
        if (this.videoTrack == null && !this.hasAudio && this.collageTracks.isEmpty()) {
            return false;
        }
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f2 = ((f - this.px) - this.ph) / this.sw;
        Track track = this.collageMain;
        long j = track != null ? (long) (track.offset + (track.left * track.duration)) : 0L;
        float f3 = f2 * jMin;
        if (track == null) {
            j = this.videoTrack == null ? this.audioOffset : 0L;
        }
        final long jClamp = (long) Utilities.clamp((f3 - j) + this.scroll, getBaseDuration(), 0.0f);
        Track track2 = this.videoTrack;
        if (track2 != null) {
            float f4 = jClamp / track2.duration;
            if (f4 < track2.left || f4 > track2.right) {
                return false;
            }
        }
        Track track3 = this.collageMain;
        if (track3 != null && (jClamp < 0 || jClamp >= ((long) ((track3.right - track3.left) * track3.duration)))) {
            return false;
        }
        if (this.hasAudio && track2 == null && this.collageTracks.isEmpty()) {
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
        Runnable runnable = this.askExactSeek;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.askExactSeek = null;
        }
        if (!z) {
            return true;
        }
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setProgressAt$9(jClamp);
            }
        };
        this.askExactSeek = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 150L);
        return true;
    }

    public void lambda$setProgressAt$9(long j) {
        TimelineDelegate timelineDelegate = this.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onProgressChange(j, false);
        }
    }

    private float getVideoHeight() {
        Track track = this.videoTrack;
        if (track == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), track.selectedT.get());
    }

    private float getCollageHeight() {
        if (this.collageTracks.isEmpty()) {
            return 0.0f;
        }
        float fLerp = 0.0f;
        for (int i = 0; i < this.collageTracks.size(); i++) {
            if (fLerp > 0.0f) {
                fLerp += AndroidUtilities.dp(4.0f);
            }
            fLerp += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((Track) this.collageTracks.get(i)).selectedT.get());
        }
        return fLerp;
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.audioSelectedT.set(this.audioSelected));
    }

    private float getRoundHeight() {
        if (!this.hasRound) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.roundSelectedT.set(this.roundSelected));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        TimelineDelegate timelineDelegate;
        VelocityTracker velocityTracker;
        long j;
        boolean z2;
        long j2;
        VelocityTracker velocityTracker2;
        long j3;
        long j4;
        VelocityTracker velocityTracker3;
        VelocityTracker velocityTracker4;
        long j5;
        Runnable runnable;
        VelocityTracker velocityTracker5;
        float fMin;
        float fMax;
        float fMax2;
        float fMin2;
        float fMax3;
        float fMax4;
        boolean z3;
        TimelineDelegate timelineDelegate2;
        int i;
        boolean z4;
        float fMax5;
        int i2;
        float fMax6;
        if (this.videoTrack == null && this.collageTracks.isEmpty() && !this.hasAudio && !this.hasRound) {
            return false;
        }
        float timelineHeight = this.h - getTimelineHeight();
        if (motionEvent.getAction() == 0 && motionEvent.getY() < timelineHeight) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (motionEvent.getAction() == 0) {
            Runnable runnable2 = this.askExactSeek;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                this.askExactSeek = null;
            }
            this.scroller.abortAnimation();
            this.pressHandleCollageIndex = -1;
            this.pressHandle = detectHandle(motionEvent);
            this.pressType = -1;
            this.pressCollageIndex = -1;
            int roundHeight = this.h - this.py;
            if (!this.open && this.timelineBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                this.pressType = 10;
                this.pressHandle = -1;
            }
            if (this.pressType == -1 && this.videoTrack != null) {
                float f = roundHeight;
                if (motionEvent.getY() < f && motionEvent.getY() > (f - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 0;
                }
                roundHeight = (int) (f - (getVideoHeight() + AndroidUtilities.dp(4.0f)));
            }
            if (this.pressType == -1 && !this.collageTracks.isEmpty()) {
                for (int i3 = 0; i3 < this.collageTracks.size(); i3++) {
                    float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((Track) this.collageTracks.get(i3)).selectedT.get());
                    float f2 = roundHeight;
                    if (motionEvent.getY() < f2 && motionEvent.getY() > (f2 - fLerp) - AndroidUtilities.dp(2.0f)) {
                        this.pressType = 3;
                        this.pressCollageIndex = i3;
                        break;
                    }
                    roundHeight = (int) (f2 - (fLerp + AndroidUtilities.dp(4.0f)));
                }
            }
            if (this.pressType == -1 && this.hasRound) {
                float f3 = roundHeight;
                if (motionEvent.getY() < f3 && motionEvent.getY() > (f3 - getRoundHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 1;
                }
                roundHeight = (int) (f3 - (getRoundHeight() + AndroidUtilities.dp(4.0f)));
            }
            if (this.pressType == -1 && this.hasAudio) {
                float f4 = roundHeight;
                if (motionEvent.getY() < f4 && motionEvent.getY() > (f4 - getAudioHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 2;
                }
                getAudioHeight();
                AndroidUtilities.dp(4.0f);
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
                AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
                AndroidUtilities.runOnUIThread(this.onLongPress, ViewConfiguration.getLongPressTimeout());
            }
        } else if (motionEvent.getAction() == 2) {
            float x = motionEvent.getX() - this.lastX;
            if (this.open && (this.dragged || Math.abs(x) > AndroidUtilities.touchSlop)) {
                long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
                Track track = this.videoTrack;
                if (track != null && this.pressHandle == 1) {
                    this.scroll = (long) Utilities.clamp(this.scroll - ((x / this.sw) * jMin), track.duration - jMin, 0.0f);
                    invalidate();
                    if (!this.dragged) {
                        this.dragSpeed = 1.0f;
                    }
                    this.dragged = true;
                    this.draggingProgress = false;
                } else if (track != null && ((i2 = this.pressHandle) == 2 || i2 == 3 || i2 == 4)) {
                    float f5 = x / this.sw;
                    float f6 = track.duration;
                    float f7 = f5 * (jMin / f6);
                    if (i2 == 2) {
                        track.left = Utilities.clamp(track.left + f7, track.right - (1000.0f / f6), 0.0f);
                        TimelineDelegate timelineDelegate3 = this.delegate;
                        if (timelineDelegate3 != null) {
                            timelineDelegate3.onVideoLeftChange(false, this.videoTrack.left);
                        }
                        Track track2 = this.videoTrack;
                        float f8 = track2.right - track2.left;
                        float fMaxSelectDuration = maxSelectDuration();
                        Track track3 = this.videoTrack;
                        if (f8 > fMaxSelectDuration / track3.duration) {
                            track3.right = Math.min(1.0f, track3.left + (maxSelectDuration() / this.videoTrack.duration));
                            TimelineDelegate timelineDelegate4 = this.delegate;
                            if (timelineDelegate4 != null) {
                                timelineDelegate4.onVideoRightChange(false, this.videoTrack.right);
                            }
                        }
                    } else if (i2 == 3) {
                        track.right = Utilities.clamp(track.right + f7, 1.0f, track.left + (1000.0f / f6));
                        TimelineDelegate timelineDelegate5 = this.delegate;
                        if (timelineDelegate5 != null) {
                            timelineDelegate5.onVideoRightChange(false, this.videoTrack.right);
                        }
                        Track track4 = this.videoTrack;
                        float f9 = track4.right - track4.left;
                        float fMaxSelectDuration2 = maxSelectDuration();
                        Track track5 = this.videoTrack;
                        if (f9 > fMaxSelectDuration2 / track5.duration) {
                            track5.left = Math.max(0.0f, track5.right - (maxSelectDuration() / this.videoTrack.duration));
                            TimelineDelegate timelineDelegate6 = this.delegate;
                            if (timelineDelegate6 != null) {
                                timelineDelegate6.onVideoLeftChange(false, this.videoTrack.left);
                            }
                        }
                    } else if (i2 == 4) {
                        if (f7 > 0.0f) {
                            fMax6 = Math.min(1.0f - track.right, f7);
                        } else {
                            fMax6 = Math.max(-track.left, f7);
                        }
                        Track track6 = this.videoTrack;
                        float f10 = track6.left + fMax6;
                        track6.left = f10;
                        track6.right += fMax6;
                        TimelineDelegate timelineDelegate7 = this.delegate;
                        if (timelineDelegate7 != null) {
                            timelineDelegate7.onVideoLeftChange(false, f10);
                            this.delegate.onVideoRightChange(false, this.videoTrack.right);
                        }
                    }
                    float f11 = this.progress;
                    Track track7 = this.videoTrack;
                    float f12 = track7.duration;
                    float f13 = f11 / f12;
                    float f14 = track7.left;
                    if (f13 < f14 || f13 > track7.right) {
                        long j6 = (long) (f14 * f12);
                        this.progress = j6;
                        TimelineDelegate timelineDelegate8 = this.delegate;
                        if (timelineDelegate8 != null) {
                            timelineDelegate8.onProgressChange(j6, false);
                        }
                    }
                    invalidate();
                    if (!this.dragged) {
                        this.dragSpeed = 1.0f;
                    }
                    this.dragged = true;
                    this.draggingProgress = false;
                } else {
                    int i5 = this.pressHandle;
                    if (i5 == 6 || i5 == 7 || i5 == 8) {
                        float f15 = (x / this.sw) * (jMin / this.audioDuration);
                        if (i5 == 6) {
                            float fMinAudioSelect = this.audioRight - (minAudioSelect() / this.audioDuration);
                            float fMax7 = Math.max(0L, this.scroll - this.audioOffset);
                            float f16 = this.audioDuration;
                            float f17 = fMax7 / f16;
                            Track track8 = this.videoTrack;
                            if (track8 != null) {
                                fMax2 = Math.max(f17, (((track8.left * track8.duration) + this.scroll) - this.audioOffset) / f16);
                            } else {
                                Track track9 = this.collageMain;
                                if (track9 != null) {
                                    fMax2 = Math.max(f17, (((track9.left * track9.duration) + this.scroll) - this.audioOffset) / f16);
                                } else if (this.hasRound) {
                                    fMax2 = Math.max(f17, (((this.roundLeft * this.roundDuration) + this.scroll) - this.audioOffset) / f16);
                                } else {
                                    fMax2 = Math.max(f17, this.audioRight - (maxSelectDuration() / this.audioDuration));
                                    if (!this.hadDragChange && f15 < 0.0f && this.audioLeft <= this.audioRight - (maxSelectDuration() / this.audioDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f18 = this.audioLeft;
                            float fClamp = Utilities.clamp(f18 + f15, fMinAudioSelect, fMax2);
                            this.audioLeft = fClamp;
                            if (Math.abs(f18 - fClamp) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate9 = this.delegate;
                            if (timelineDelegate9 != null) {
                                timelineDelegate9.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
                            }
                            TimelineDelegate timelineDelegate10 = this.delegate;
                            if (timelineDelegate10 != null) {
                                timelineDelegate10.onAudioLeftChange(this.audioLeft);
                            }
                        } else if (i5 == 7) {
                            float fMin3 = Math.min(1.0f, Math.max(0L, (this.scroll - this.audioOffset) + jMin) / this.audioDuration);
                            float f19 = this.audioLeft;
                            float fMinAudioSelect2 = minAudioSelect();
                            float f20 = this.audioDuration;
                            float f21 = f19 + (fMinAudioSelect2 / f20);
                            Track track10 = this.videoTrack;
                            if (track10 != null) {
                                fMin = Math.min(fMin3, (((track10.right * track10.duration) + this.scroll) - this.audioOffset) / f20);
                            } else {
                                Track track11 = this.collageMain;
                                if (track11 != null) {
                                    fMin = Math.min(fMin3, (((track11.right * track11.duration) + this.scroll) - this.audioOffset) / f20);
                                } else if (this.hasRound) {
                                    fMin = Math.min(fMin3, (((this.roundRight * this.roundDuration) + this.scroll) - this.audioOffset) / f20);
                                } else {
                                    fMin = Math.min(fMin3, this.audioLeft + (maxSelectDuration() / this.audioDuration));
                                    if (!this.hadDragChange && f15 > 0.0f && this.audioRight >= this.audioLeft + (maxSelectDuration() / this.audioDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f22 = this.audioRight;
                            float fClamp2 = Utilities.clamp(f22 + f15, fMin, f21);
                            this.audioRight = fClamp2;
                            if (Math.abs(f22 - fClamp2) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate11 = this.delegate;
                            if (timelineDelegate11 != null) {
                                timelineDelegate11.onAudioRightChange(this.audioRight);
                            }
                        }
                        if (this.pressHandle == 8) {
                            float fMax8 = Math.max(0L, this.scroll - this.audioOffset) / this.audioDuration;
                            float fMin4 = Math.min(1.0f, Math.max(0L, (this.scroll - this.audioOffset) + jMin) / this.audioDuration);
                            if (f15 > 0.0f) {
                                fMax = Math.min(Math.max(0.0f, fMin4 - this.audioRight), f15);
                            } else {
                                fMax = Math.max(Math.min(0.0f, fMax8 - this.audioLeft), f15);
                            }
                            float f23 = this.audioLeft + fMax;
                            this.audioLeft = f23;
                            this.audioRight += fMax;
                            TimelineDelegate timelineDelegate12 = this.delegate;
                            if (timelineDelegate12 != null) {
                                timelineDelegate12.onAudioLeftChange(f23);
                                this.delegate.onAudioOffsetChange(this.audioOffset + ((long) (this.audioLeft * this.audioDuration)));
                                this.delegate.onAudioRightChange(this.audioRight);
                            }
                            TimelineDelegate timelineDelegate13 = this.delegate;
                            if (timelineDelegate13 != null) {
                                timelineDelegate13.onProgressDragChange(true);
                            }
                        }
                        if (this.videoTrack == null && !this.hasRound) {
                            this.progress = (long) (this.audioLeft * this.audioDuration);
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
                    } else if (i5 == 10 || i5 == 11 || i5 == 12) {
                        float f24 = (x / this.sw) * (jMin / this.roundDuration);
                        if (i5 == 10) {
                            float fMinAudioSelect3 = this.roundRight - (minAudioSelect() / this.roundDuration);
                            float fMax9 = Math.max(0L, this.scroll - this.roundOffset);
                            float f25 = this.roundDuration;
                            float f26 = fMax9 / f25;
                            Track track12 = this.videoTrack;
                            if (track12 != null) {
                                fMax4 = Math.max(f26, (((track12.left * track12.duration) + this.scroll) - this.roundOffset) / f25);
                            } else {
                                Track track13 = this.collageMain;
                                if (track13 != null) {
                                    fMax4 = Math.max(f26, (((track13.left * track13.duration) + this.scroll) - this.roundOffset) / f25);
                                } else {
                                    fMax4 = Math.max(f26, this.roundRight - (maxSelectDuration() / this.roundDuration));
                                    if (!this.hadDragChange && f24 < 0.0f && this.roundLeft <= this.roundRight - (maxSelectDuration() / this.roundDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f27 = this.roundLeft;
                            float fClamp3 = Utilities.clamp(f27 + f24, fMinAudioSelect3, fMax4);
                            this.roundLeft = fClamp3;
                            if (Math.abs(f27 - fClamp3) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate15 = this.delegate;
                            if (timelineDelegate15 != null) {
                                timelineDelegate15.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
                            }
                            TimelineDelegate timelineDelegate16 = this.delegate;
                            if (timelineDelegate16 != null) {
                                timelineDelegate16.onRoundLeftChange(this.roundLeft);
                            }
                        } else if (i5 == 11) {
                            float fMin5 = Math.min(1.0f, Math.max(0L, (this.scroll - this.roundOffset) + jMin) / this.roundDuration);
                            float f28 = this.roundLeft;
                            float fMinAudioSelect4 = minAudioSelect();
                            float f29 = this.roundDuration;
                            float f30 = f28 + (fMinAudioSelect4 / f29);
                            Track track14 = this.videoTrack;
                            if (track14 != null) {
                                fMin5 = Math.min(fMin5, (((track14.right * track14.duration) + this.scroll) - this.roundOffset) / f29);
                            }
                            Track track15 = this.collageMain;
                            if (track15 != null) {
                                fMin2 = Math.min(fMin5, (((track15.right * track15.duration) + this.scroll) - this.roundOffset) / this.roundDuration);
                            } else {
                                fMin2 = Math.min(fMin5, this.roundLeft + (maxSelectDuration() / this.roundDuration));
                                if (!this.hadDragChange && f24 > 0.0f && this.roundRight >= this.roundLeft + (maxSelectDuration() / this.roundDuration)) {
                                    this.pressHandle = 8;
                                }
                            }
                            float f31 = this.roundRight;
                            float fClamp4 = Utilities.clamp(f31 + f24, fMin2, f30);
                            this.roundRight = fClamp4;
                            if (Math.abs(f31 - fClamp4) > 0.01f) {
                                this.hadDragChange = true;
                            }
                            TimelineDelegate timelineDelegate17 = this.delegate;
                            if (timelineDelegate17 != null) {
                                timelineDelegate17.onRoundRightChange(this.roundRight);
                            }
                        }
                        if (this.pressHandle == 12) {
                            float fMax10 = Math.max(0L, this.scroll - this.roundOffset) / this.roundDuration;
                            float fMin6 = Math.min(1.0f, Math.max(0L, (this.scroll - this.roundOffset) + jMin) / this.roundDuration);
                            if (f24 > 0.0f) {
                                fMax3 = Math.min(fMin6 - this.roundRight, f24);
                            } else {
                                fMax3 = Math.max(fMax10 - this.roundLeft, f24);
                            }
                            float f32 = this.roundLeft + fMax3;
                            this.roundLeft = f32;
                            this.roundRight += fMax3;
                            TimelineDelegate timelineDelegate18 = this.delegate;
                            if (timelineDelegate18 != null) {
                                timelineDelegate18.onRoundLeftChange(f32);
                                this.delegate.onRoundOffsetChange(this.roundOffset + ((long) (this.roundLeft * this.roundDuration)));
                                this.delegate.onRoundRightChange(this.roundRight);
                            }
                            TimelineDelegate timelineDelegate19 = this.delegate;
                            if (timelineDelegate19 != null) {
                                timelineDelegate19.onProgressDragChange(true);
                            }
                        }
                        if (this.videoTrack == null) {
                            this.progress = (long) (this.roundLeft * this.roundDuration);
                            TimelineDelegate timelineDelegate20 = this.delegate;
                            if (timelineDelegate20 != null) {
                                timelineDelegate20.onProgressDragChange(true);
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
                        if (i6 >= 0 && i6 < this.collageTracks.size() && ((i = this.pressHandle) == 13 || i == 14 || i == 15)) {
                            Track track16 = (Track) this.collageTracks.get(this.pressHandleCollageIndex);
                            float f33 = (x / this.sw) * (jMin / track16.duration);
                            int i7 = this.pressHandle;
                            if (i7 == 13) {
                                float fMinAudioSelect5 = track16.right - (minAudioSelect() / track16.duration);
                                float fMax11 = Math.max(0L, this.scroll - track16.offset) / track16.duration;
                                if (track16 == this.collageMain) {
                                    fMax11 = Math.max(fMax11, track16.right - (maxSelectDuration() / track16.duration));
                                    if (!this.hadDragChange && f33 < 0.0f && track16.left <= track16.right - (maxSelectDuration() / track16.duration)) {
                                        this.pressHandle = 15;
                                    }
                                }
                                float f34 = track16.left;
                                float fClamp5 = Utilities.clamp(f34 + f33, fMinAudioSelect5, fMax11);
                                track16.left = fClamp5;
                                if (Math.abs(f34 - fClamp5) > 0.01f) {
                                    this.hadDragChange = true;
                                }
                                TimelineDelegate timelineDelegate21 = this.delegate;
                                if (timelineDelegate21 != null) {
                                    timelineDelegate21.onVideoOffsetChange(track16.index, track16.offset);
                                }
                                TimelineDelegate timelineDelegate22 = this.delegate;
                                if (timelineDelegate22 != null) {
                                    timelineDelegate22.onVideoLeftChange(track16.index, track16.left);
                                }
                            } else if (i7 == 14) {
                                float fMin7 = Math.min(1.0f, Math.max(0L, (this.scroll - track16.offset) + jMin) / track16.duration);
                                float fMinAudioSelect6 = track16.left + (minAudioSelect() / track16.duration);
                                if (track16 == this.collageMain) {
                                    fMin7 = Math.min(fMin7, track16.left + (maxSelectDuration() / track16.duration));
                                    if (!this.hadDragChange && f33 > 0.0f && track16.right >= track16.left + (maxSelectDuration() / track16.duration)) {
                                        this.pressHandle = 15;
                                    }
                                }
                                float f35 = track16.right;
                                float fClamp6 = Utilities.clamp(f35 + f33, fMin7, fMinAudioSelect6);
                                track16.right = fClamp6;
                                if (Math.abs(f35 - fClamp6) > 0.01f) {
                                    this.hadDragChange = true;
                                }
                                TimelineDelegate timelineDelegate23 = this.delegate;
                                if (timelineDelegate23 != null) {
                                    timelineDelegate23.onVideoRightChange(track16.index, track16.right);
                                }
                            }
                            if (this.pressHandle == 15) {
                                float fMax12 = Math.max(0L, this.scroll - track16.offset) / track16.duration;
                                float fMin8 = Math.min(1.0f, Math.max(0L, (this.scroll - track16.offset) + jMin) / track16.duration);
                                if (f33 > 0.0f) {
                                    fMax5 = Math.min(fMin8 - track16.right, f33);
                                } else {
                                    fMax5 = Math.max(fMax12 - track16.left, f33);
                                }
                                float f36 = track16.left + fMax5;
                                track16.left = f36;
                                track16.right += fMax5;
                                TimelineDelegate timelineDelegate24 = this.delegate;
                                if (timelineDelegate24 != null) {
                                    timelineDelegate24.onVideoLeftChange(track16.index, f36);
                                    this.delegate.onVideoOffsetChange(track16.index, track16.offset);
                                    this.delegate.onVideoRightChange(track16.index, track16.right);
                                }
                                TimelineDelegate timelineDelegate25 = this.delegate;
                                if (timelineDelegate25 != null) {
                                    z4 = true;
                                    timelineDelegate25.onProgressDragChange(true);
                                } else {
                                    z4 = true;
                                }
                            } else {
                                z4 = true;
                            }
                            invalidate();
                            if (!this.dragged) {
                                this.dragSpeed = 1.0f;
                            }
                            this.dragged = z4;
                            this.draggingProgress = false;
                        } else {
                            int i8 = this.pressHandle;
                            if (i8 == 5) {
                                moveAudioOffset((x / this.sw) * jMin);
                                if (!this.dragged) {
                                    this.dragSpeed = 1.0f;
                                }
                                this.dragged = true;
                                this.draggingProgress = false;
                            } else if (i8 == 9) {
                                moveRoundOffset((x / this.sw) * jMin);
                                if (!this.dragged) {
                                    this.dragSpeed = 1.0f;
                                }
                                this.dragged = true;
                                this.draggingProgress = false;
                            } else {
                                int i9 = this.pressHandleCollageIndex;
                                if (i9 >= 0 && i9 < this.collageTracks.size() && this.pressHandle == 16) {
                                    moveCollageOffset((Track) this.collageTracks.get(this.pressHandleCollageIndex), (x / this.sw) * jMin);
                                    if (!this.dragged) {
                                        this.dragSpeed = 1.0f;
                                    }
                                    this.dragged = true;
                                    this.draggingProgress = false;
                                } else if (this.draggingProgress) {
                                    setProgressAt(motionEvent.getX(), jCurrentTimeMillis - this.lastTime < 350);
                                    if (this.dragged || (timelineDelegate2 = this.delegate) == null) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                        timelineDelegate2.onProgressDragChange(true);
                                    }
                                    if (!this.dragged) {
                                        this.dragSpeed = 1.0f;
                                    }
                                    this.dragged = z3;
                                }
                            }
                        }
                    }
                }
                this.lastX = motionEvent.getX();
            }
            if (this.dragged) {
                AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
            }
            int i10 = this.pressHandle;
            if ((i10 == 1 || i10 == 5 || i10 == 8) && (velocityTracker5 = this.velocityTracker) != null) {
                velocityTracker5.addMovement(motionEvent);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            AndroidUtilities.cancelRunOnUIThread(this.onLongPress);
            this.scroller.abortAnimation();
            if (motionEvent.getAction() != 1) {
                z = true;
            } else {
                if ((System.currentTimeMillis() - this.pressTime <= ViewConfiguration.getTapTimeout() && !this.dragged) || !this.open) {
                    if (!this.open) {
                        if (this.pressType == 10 && (runnable = this.onTimelineClick) != null) {
                            runnable.run();
                        }
                    } else if (this.isCover && this.videoTrack != null) {
                        long jClamp = (long) Utilities.clamp(((((motionEvent.getX() - this.px) - this.ph) / this.sw) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.scroll, getBaseDuration(), 0.0f);
                        Track track17 = this.videoTrack;
                        float f37 = track17.right - track17.left;
                        track17.left = (jClamp / getBaseDuration()) * (1.0f - f37);
                        Track track18 = this.videoTrack;
                        float f38 = track18.left;
                        track18.right = f37 + f38;
                        TimelineDelegate timelineDelegate26 = this.delegate;
                        if (timelineDelegate26 != null) {
                            timelineDelegate26.onVideoLeftChange(true, f38);
                            this.delegate.onVideoRightChange(true, this.videoTrack.right);
                        }
                        invalidate();
                    } else {
                        int i11 = this.pressType;
                        if (i11 == 3) {
                            int i12 = (this.audioSelected || this.roundSelected) ? -1 : this.collageSelected;
                            int i13 = this.pressCollageIndex;
                            if (i12 != i13) {
                                this.audioSelected = false;
                                this.roundSelected = false;
                                this.collageSelected = i13;
                                if (this.delegate != null && i13 >= 0 && i13 < this.collageTracks.size()) {
                                    this.delegate.onVideoSelected(((Track) this.collageTracks.get(this.pressCollageIndex)).index);
                                }
                                invalidate();
                            } else if (i11 != 2) {
                                if (i11 != 1) {
                                    if (i11 == 2) {
                                        if (i11 == 1) {
                                            j5 = this.progress;
                                            if (setProgressAt(motionEvent.getX(), false)) {
                                                this.loopProgressFrom = j5;
                                                this.loopProgress.set(1.0f, true);
                                                invalidate();
                                            }
                                        } else {
                                            j5 = this.progress;
                                            if (setProgressAt(motionEvent.getX(), false)) {
                                                this.loopProgressFrom = j5;
                                                this.loopProgress.set(1.0f, true);
                                                invalidate();
                                            }
                                        }
                                    } else if (i11 == 1) {
                                        j5 = this.progress;
                                        if (setProgressAt(motionEvent.getX(), false)) {
                                            this.loopProgressFrom = j5;
                                            this.loopProgress.set(1.0f, true);
                                            invalidate();
                                        }
                                    } else {
                                        j5 = this.progress;
                                        if (setProgressAt(motionEvent.getX(), false)) {
                                            this.loopProgressFrom = j5;
                                            this.loopProgress.set(1.0f, true);
                                            invalidate();
                                        }
                                    }
                                } else if (i11 == 2) {
                                    if (i11 == 1) {
                                        j5 = this.progress;
                                        if (setProgressAt(motionEvent.getX(), false)) {
                                            this.loopProgressFrom = j5;
                                            this.loopProgress.set(1.0f, true);
                                            invalidate();
                                        }
                                    } else {
                                        j5 = this.progress;
                                        if (setProgressAt(motionEvent.getX(), false)) {
                                            this.loopProgressFrom = j5;
                                            this.loopProgress.set(1.0f, true);
                                            invalidate();
                                        }
                                    }
                                } else if (i11 == 1) {
                                    j5 = this.progress;
                                    if (setProgressAt(motionEvent.getX(), false)) {
                                        this.loopProgressFrom = j5;
                                        this.loopProgress.set(1.0f, true);
                                        invalidate();
                                    }
                                } else {
                                    j5 = this.progress;
                                    if (setProgressAt(motionEvent.getX(), false)) {
                                        this.loopProgressFrom = j5;
                                        this.loopProgress.set(1.0f, true);
                                        invalidate();
                                    }
                                }
                            } else if (i11 != 1) {
                                if (i11 == 2) {
                                    if (i11 == 1) {
                                        j5 = this.progress;
                                        if (setProgressAt(motionEvent.getX(), false)) {
                                            this.loopProgressFrom = j5;
                                            this.loopProgress.set(1.0f, true);
                                            invalidate();
                                        }
                                    } else {
                                        j5 = this.progress;
                                        if (setProgressAt(motionEvent.getX(), false)) {
                                            this.loopProgressFrom = j5;
                                            this.loopProgress.set(1.0f, true);
                                            invalidate();
                                        }
                                    }
                                } else if (i11 == 1) {
                                    j5 = this.progress;
                                    if (setProgressAt(motionEvent.getX(), false)) {
                                        this.loopProgressFrom = j5;
                                        this.loopProgress.set(1.0f, true);
                                        invalidate();
                                    }
                                } else {
                                    j5 = this.progress;
                                    if (setProgressAt(motionEvent.getX(), false)) {
                                        this.loopProgressFrom = j5;
                                        this.loopProgress.set(1.0f, true);
                                        invalidate();
                                    }
                                }
                            } else if (i11 == 2) {
                                if (i11 == 1) {
                                    j5 = this.progress;
                                    if (setProgressAt(motionEvent.getX(), false)) {
                                        this.loopProgressFrom = j5;
                                        this.loopProgress.set(1.0f, true);
                                        invalidate();
                                    }
                                } else {
                                    j5 = this.progress;
                                    if (setProgressAt(motionEvent.getX(), false)) {
                                        this.loopProgressFrom = j5;
                                        this.loopProgress.set(1.0f, true);
                                        invalidate();
                                    }
                                }
                            } else if (i11 == 1) {
                                j5 = this.progress;
                                if (setProgressAt(motionEvent.getX(), false)) {
                                    this.loopProgressFrom = j5;
                                    this.loopProgress.set(1.0f, true);
                                    invalidate();
                                }
                            } else {
                                j5 = this.progress;
                                if (setProgressAt(motionEvent.getX(), false)) {
                                    this.loopProgressFrom = j5;
                                    this.loopProgress.set(1.0f, true);
                                    invalidate();
                                }
                            }
                        } else if (i11 != 2 && !this.audioSelected) {
                            this.audioSelected = true;
                            this.roundSelected = false;
                            TimelineDelegate timelineDelegate27 = this.delegate;
                            if (timelineDelegate27 != null) {
                                timelineDelegate27.onRoundSelectChange(false);
                            }
                            invalidate();
                        } else if (i11 != 1 && !this.roundSelected) {
                            this.audioSelected = false;
                            this.roundSelected = true;
                            TimelineDelegate timelineDelegate28 = this.delegate;
                            if (timelineDelegate28 != null) {
                                timelineDelegate28.onRoundSelectChange(true);
                            }
                            invalidate();
                        } else if (i11 == 2 && this.audioSelected) {
                            this.audioSelected = false;
                            this.roundSelected = false;
                            TimelineDelegate timelineDelegate29 = this.delegate;
                            if (timelineDelegate29 != null) {
                                timelineDelegate29.onRoundSelectChange(false);
                            }
                            invalidate();
                        } else if (i11 == 1 && this.roundSelected) {
                            this.audioSelected = false;
                            this.roundSelected = false;
                            TimelineDelegate timelineDelegate30 = this.delegate;
                            if (timelineDelegate30 != null) {
                                timelineDelegate30.onRoundSelectChange(false);
                            }
                            invalidate();
                        } else {
                            j5 = this.progress;
                            if (setProgressAt(motionEvent.getX(), false) && Math.abs(this.progress - j5) > 400) {
                                this.loopProgressFrom = j5;
                                this.loopProgress.set(1.0f, true);
                                invalidate();
                            }
                        }
                    }
                } else {
                    int i14 = this.pressHandle;
                    if (i14 == 16 && (velocityTracker4 = this.velocityTracker) != null) {
                        velocityTracker4.computeCurrentVelocity(1000);
                        int xVelocity = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = true;
                        if (this.videoTrack != null && Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                            long jMin2 = Math.min(this.videoTrack.duration, getMaxScrollDuration());
                            int i15 = this.px;
                            float f39 = i15;
                            float f40 = jMin2;
                            float f41 = this.scroll / f40;
                            float f42 = this.sw;
                            int i16 = (int) ((f41 * f42) + f39);
                            int i17 = (int) (f39 + (((this.videoTrack.duration - jMin2) / f40) * f42));
                            this.scrolling = true;
                            Scroller scroller = this.scroller;
                            this.wasScrollX = i16;
                            scroller.fling(i16, 0, -xVelocity, 0, i15, i17, 0, 0);
                            z = false;
                        }
                    } else if (i14 == 1 && (velocityTracker3 = this.velocityTracker) != null) {
                        velocityTracker3.computeCurrentVelocity(1000);
                        int xVelocity2 = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = true;
                        if (this.videoTrack != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                            long jMin3 = Math.min(this.videoTrack.duration, getMaxScrollDuration());
                            int i18 = this.px;
                            float f43 = i18;
                            float f44 = jMin3;
                            float f45 = this.scroll / f44;
                            float f46 = this.sw;
                            int i19 = (int) ((f45 * f46) + f43);
                            int i20 = (int) (f43 + (((this.videoTrack.duration - jMin3) / f44) * f46));
                            this.scrolling = true;
                            Scroller scroller2 = this.scroller;
                            this.wasScrollX = i19;
                            scroller2.fling(i19, 0, -xVelocity2, 0, i18, i20, 0, 0);
                            z = false;
                        }
                    } else if ((i14 == 5 || (i14 == 8 && !this.dragged)) && this.audioSelected && (velocityTracker = this.velocityTracker) != null) {
                        velocityTracker.computeCurrentVelocity(this.videoTrack == null ? 1500 : 1000);
                        int xVelocity3 = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = false;
                        if (Math.abs(xVelocity3) > AndroidUtilities.dp(100.0f)) {
                            float fMin9 = Math.min(getBaseDuration(), getMaxScrollDuration());
                            int i21 = (int) (this.px + this.ph + ((this.audioOffset / fMin9) * this.sw));
                            Track track19 = this.videoTrack;
                            if (track19 != null) {
                                float f47 = track19.right;
                                float f48 = track19.duration;
                                j = (long) ((track19.left * f48) - this.audioDuration);
                                j2 = (long) ((f47 * f48) - 0);
                            } else {
                                if (this.hasRound) {
                                    float f49 = this.roundRight;
                                    float f50 = this.roundDuration;
                                    j2 = (long) ((f49 * f50) - 0);
                                    j = (long) ((this.roundLeft * f50) - this.audioDuration);
                                } else {
                                    j = -(this.audioDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                    z2 = true;
                                    j2 = 0;
                                }
                                this.scrolling = z2;
                                Scroller scroller3 = this.scroller;
                                this.wasScrollX = i21;
                                float f51 = this.px + this.ph;
                                float f52 = this.sw;
                                scroller3.fling(i21, 0, xVelocity3, 0, (int) (((j / fMin9) * f52) + f51), (int) (f51 + ((j2 / fMin9) * f52)), 0, 0);
                                z = false;
                            }
                            z2 = true;
                            this.scrolling = z2;
                            Scroller scroller4 = this.scroller;
                            this.wasScrollX = i21;
                            float f53 = this.px + this.ph;
                            float f54 = this.sw;
                            scroller4.fling(i21, 0, xVelocity3, 0, (int) (((j / fMin9) * f54) + f53), (int) (f53 + ((j2 / fMin9) * f54)), 0, 0);
                            z = false;
                        }
                    } else if ((i14 == 9 || (i14 == 12 && !this.dragged)) && this.roundSelected && (velocityTracker2 = this.velocityTracker) != null) {
                        velocityTracker2.computeCurrentVelocity(this.videoTrack == null ? 1500 : 1000);
                        int xVelocity4 = (int) this.velocityTracker.getXVelocity();
                        this.scrollingVideo = false;
                        if (Math.abs(xVelocity4) > AndroidUtilities.dp(100.0f)) {
                            float fMin10 = Math.min(getBaseDuration(), getMaxScrollDuration());
                            int i22 = (int) (this.px + this.ph + ((this.roundOffset / fMin10) * this.sw));
                            Track track20 = this.videoTrack;
                            if (track20 != null) {
                                float f55 = track20.right;
                                float f56 = track20.duration;
                                j3 = (long) ((f55 * f56) - 0);
                                j4 = (long) ((track20.left * f56) - this.roundDuration);
                            } else {
                                j3 = 0;
                                j4 = -(this.roundDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                            }
                            this.scrolling = true;
                            Scroller scroller5 = this.scroller;
                            this.wasScrollX = i22;
                            float f57 = this.px + this.ph;
                            float f58 = this.sw;
                            scroller5.fling(i22, 0, xVelocity4, 0, (int) (((j4 / fMin10) * f58) + f57), (int) (f57 + ((j3 / fMin10) * f58)), 0, 0);
                            z = false;
                        }
                    }
                }
                z = true;
            }
            Runnable runnable3 = this.askExactSeek;
            if (runnable3 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable3);
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

    private long minAudioSelect() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    private void moveAudioOffset(float f) {
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
        if (!z && (timelineDelegate = this.delegate) != null) {
            timelineDelegate.onProgressDragChange(true);
            Track track2 = this.videoTrack;
            if (track2 != null) {
                long j18 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f15 = track2.right;
                float f16 = track2.duration;
                jClamp = Utilities.clamp(j18, (long) (f15 * f16), (long) (track2.left * f16));
            } else if (this.hasRound) {
                long j19 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f17 = this.roundRight;
                float f18 = this.roundDuration;
                jClamp = Utilities.clamp(j19, (long) (f17 * f18), (long) (this.roundLeft * f18));
            } else {
                float f19 = this.audioLeft;
                long j20 = this.audioDuration;
                jClamp = Utilities.clamp((long) (f19 * j20), j20, 0L);
            }
            if (this.videoTrack != null && Math.abs(this.progress - jClamp) > 400) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            TimelineDelegate timelineDelegate6 = this.delegate;
            this.progress = jClamp;
            timelineDelegate6.onProgressChange(jClamp, false);
            return;
        }
        if (z || this.scrolling) {
            Track track3 = this.videoTrack;
            if (track3 != null) {
                long j21 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f20 = track3.right;
                float f21 = track3.duration;
                this.progress = Utilities.clamp(j21, (long) (f20 * f21), (long) (track3.left * f21));
            } else if (this.hasRound && track3 != null) {
                long j22 = this.audioOffset + ((long) (this.audioLeft * this.audioDuration));
                float f22 = this.roundRight;
                float f23 = track3.duration;
                this.progress = Utilities.clamp(j22, (long) (f22 * f23), (long) (this.roundLeft * f23));
            } else {
                float f24 = this.audioLeft;
                long j23 = this.audioDuration;
                this.progress = Utilities.clamp((long) (f24 * j23), j23, 0L);
            }
            TimelineDelegate timelineDelegate7 = this.delegate;
            if (timelineDelegate7 != null) {
                timelineDelegate7.onProgressChange(this.progress, false);
            }
        }
    }

    private void moveRoundOffset(float f) {
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
                    j2 = j13;
                    j = j14;
                } else {
                    j = j13;
                    j2 = j14;
                }
                this.roundOffset = Utilities.clamp(this.roundOffset + j9, j, j2);
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
        if (!z && (timelineDelegate = this.delegate) != null) {
            timelineDelegate.onProgressDragChange(true);
            Track track6 = this.videoTrack;
            if (track6 != null) {
                long j16 = this.roundOffset + ((long) (this.roundLeft * this.roundDuration));
                float f17 = track6.right;
                float f18 = track6.duration;
                jClamp = Utilities.clamp(j16, (long) (f17 * f18), (long) (track6.left * f18));
            } else {
                float f19 = this.roundLeft;
                long j17 = this.roundDuration;
                jClamp = Utilities.clamp((long) (f19 * j17), j17, 0L);
            }
            if (this.videoTrack != null && Math.abs(this.progress - jClamp) > 400) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            TimelineDelegate timelineDelegate6 = this.delegate;
            this.progress = jClamp;
            timelineDelegate6.onProgressChange(jClamp, false);
            return;
        }
        if (z || this.scrolling) {
            Track track7 = this.videoTrack;
            if (track7 != null) {
                long j18 = this.roundOffset + ((long) (this.roundLeft * this.roundDuration));
                float f20 = track7.right;
                float f21 = track7.duration;
                this.progress = Utilities.clamp(j18, (long) (f20 * f21), (long) (track7.left * f21));
            } else {
                float f22 = this.roundLeft;
                long j19 = this.roundDuration;
                this.progress = Utilities.clamp((long) (f22 * j19), j19, 0L);
            }
            TimelineDelegate timelineDelegate7 = this.delegate;
            if (timelineDelegate7 != null) {
                timelineDelegate7.onProgressChange(this.progress, false);
            }
        }
    }

    private void moveCollageOffset(Track track, float f) {
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
                        j2 = j12;
                        j = j13;
                    } else {
                        j = j12;
                        j2 = j13;
                    }
                    track.offset = Utilities.clamp(track.offset + j8, j, j2);
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
        if (!z && (timelineDelegate = this.delegate) != null) {
            timelineDelegate.onProgressDragChange(true);
            Track track8 = this.collageMain;
            if (track8 != track && track8 != null) {
                long j15 = track.offset + ((long) (track.left * track.duration));
                float f14 = track8.right;
                float f15 = track8.duration;
                jClamp = Utilities.clamp(j15, (long) (f14 * f15), (long) (track8.left * f15));
            } else {
                float f16 = track.left;
                long j16 = track.duration;
                jClamp = Utilities.clamp((long) (f16 * j16), j16, 0L);
            }
            Track track9 = this.collageMain;
            if (track9 != track && track9 != null && Math.abs(this.progress - jClamp) > 400) {
                this.loopProgressFrom = this.progress;
                this.loopProgress.set(1.0f, true);
            }
            TimelineDelegate timelineDelegate5 = this.delegate;
            this.progress = jClamp;
            timelineDelegate5.onProgressChange(jClamp, false);
            return;
        }
        if (z || this.scrolling) {
            Track track10 = this.collageMain;
            if (track10 != track && track10 != null) {
                long j17 = track.offset + ((long) (track.left * track.duration));
                float f17 = track10.right;
                float f18 = track10.duration;
                this.progress = Utilities.clamp(j17, (long) (f17 * f18), (long) (track10.left * f18));
            } else {
                float f19 = track.left;
                long j18 = track.duration;
                this.progress = Utilities.clamp((long) (f19 * j18), j18, 0L);
            }
            TimelineDelegate timelineDelegate6 = this.delegate;
            if (timelineDelegate6 != null) {
                timelineDelegate6.onProgressChange(this.progress, false);
            }
        }
    }

    @Override
    public void computeScroll() {
        if (this.scroller.computeScrollOffset()) {
            int currX = this.scroller.getCurrX();
            long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
            if (this.scrollingVideo) {
                this.scroll = (long) Math.max(0.0f, (((currX - this.px) - this.ph) / this.sw) * jMin);
            } else {
                if (!this.audioSelected) {
                    this.scroller.abortAnimation();
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
            return;
        }
        if (this.scrolling) {
            this.scrolling = false;
            TimelineDelegate timelineDelegate = this.delegate;
            if (timelineDelegate != null) {
                timelineDelegate.onProgressDragChange(false);
            }
        }
    }

    static class WaveformPath extends Path {
        private float lastAudioHeight;
        private float lastAudioSelected;
        private float lastBottom;
        private float lastLeft;
        private float lastMaxBar;
        private float lastRight;
        private long lastScrollDuration;
        private float lastStart;
        private ArrayList lastWaveformCounts;
        private ArrayList lastWaveformLoaded;
        private final int ph = AndroidUtilities.dp(10.0f);
        private final float[] waveformRadii;

        WaveformPath() {
            this.waveformRadii = new float[]{fDp, fDp, fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f};
            float fDp = AndroidUtilities.dp(2.0f);
        }

        private boolean eqCount(ArrayList arrayList, ArrayList arrayList2) {
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (((Integer) arrayList.get(i)).intValue() != (arrayList2.get(i) == null ? 0 : ((AudioWaveformLoader) arrayList2.get(i)).getCount())) {
                    return false;
                }
            }
            return true;
        }

        private boolean eqLoadedCounts(ArrayList arrayList, ArrayList arrayList2) {
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if (arrayList == null || arrayList2 == null || arrayList.size() != arrayList2.size()) {
                return false;
            }
            for (int i = 0; i < arrayList.size(); i++) {
                if (((Float) arrayList.get(i)).floatValue() != (arrayList2.get(i) == null ? 0.0f : ((AudioWaveformLoader) arrayList2.get(i)).animatedLoaded.set(((AudioWaveformLoader) arrayList2.get(i)).getLoadedCount()))) {
                    return false;
                }
            }
            return true;
        }

        public static int getMaxBar(ArrayList arrayList) {
            if (arrayList == null) {
                return 0;
            }
            int maxBar = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) != null) {
                    maxBar += ((AudioWaveformLoader) arrayList.get(i)).getMaxBar();
                }
            }
            return maxBar;
        }

        public void check(float f, float f2, float f3, float f4, long j, float f5, float f6, float f7, AudioWaveformLoader audioWaveformLoader) {
            ArrayList arrayList;
            if (audioWaveformLoader == null) {
                rewind();
                return;
            }
            float f8 = audioWaveformLoader.animatedLoaded.set(audioWaveformLoader.getLoadedCount());
            if (this.lastScrollDuration == j && Math.abs(this.lastAudioHeight - f5) <= 1.0f && Math.abs(this.lastMaxBar - f6) <= 0.01f && Math.abs(this.lastAudioSelected - f4) <= 0.1f && Math.abs(this.lastBottom - f7) <= 1.0f && Math.abs(this.lastStart - f) <= 1.0f && Math.abs(this.lastLeft - f2) <= 1.0f && Math.abs(this.lastRight - f3) <= 1.0f && (arrayList = this.lastWaveformCounts) != null && arrayList.size() == 1) {
                ArrayList arrayList2 = this.lastWaveformLoaded;
                if (Math.abs(((arrayList2 == null || arrayList2.isEmpty()) ? 0.0f : ((Float) this.lastWaveformLoaded.get(0)).floatValue()) - f8) <= 0.01f) {
                    return;
                }
            }
            ArrayList arrayList3 = this.lastWaveformCounts;
            if (arrayList3 == null) {
                this.lastWaveformCounts = new ArrayList();
            } else {
                arrayList3.clear();
            }
            this.lastWaveformCounts.add(Integer.valueOf(audioWaveformLoader.getCount()));
            ArrayList arrayList4 = this.lastWaveformLoaded;
            if (arrayList4 == null) {
                this.lastWaveformLoaded = new ArrayList();
            } else {
                arrayList4.clear();
            }
            this.lastWaveformLoaded.add(Float.valueOf(f8));
            this.lastStart = f;
            this.lastLeft = f2;
            this.lastRight = f3;
            this.lastAudioSelected = f4;
            this.lastMaxBar = f6;
            this.lastAudioHeight = f5;
            this.lastBottom = f7;
            layout(f, f2, f3, f4, f6, f5, f7, audioWaveformLoader.animatedLoaded.set(audioWaveformLoader.getLoadedCount()), audioWaveformLoader);
        }

        public void check(float f, float f2, float f3, float f4, float f5, float f6, float f7, ArrayList arrayList) {
            if (arrayList == null || arrayList.isEmpty()) {
                rewind();
                return;
            }
            if (Math.abs(this.lastAudioHeight - f5) > 1.0f || Math.abs(this.lastMaxBar - f6) > 0.01f || Math.abs(this.lastAudioSelected - f4) > 0.1f || Math.abs(this.lastBottom - f7) > 1.0f || Math.abs(this.lastStart - f) > 1.0f || Math.abs(this.lastLeft - f2) > 1.0f || Math.abs(this.lastRight - f3) > 1.0f || eqCount(this.lastWaveformCounts, arrayList) || eqLoadedCounts(this.lastWaveformLoaded, arrayList)) {
                ArrayList arrayList2 = this.lastWaveformCounts;
                if (arrayList2 == null) {
                    this.lastWaveformCounts = new ArrayList();
                } else {
                    arrayList2.clear();
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    this.lastWaveformCounts.add(Integer.valueOf(arrayList.get(i) == null ? 0 : ((AudioWaveformLoader) arrayList.get(i)).getCount()));
                }
                ArrayList arrayList3 = this.lastWaveformLoaded;
                if (arrayList3 == null) {
                    this.lastWaveformLoaded = new ArrayList();
                } else {
                    arrayList3.clear();
                }
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    this.lastWaveformLoaded.add(Float.valueOf(arrayList.get(i2) == null ? 0.0f : ((AudioWaveformLoader) arrayList.get(i2)).animatedLoaded.set(((AudioWaveformLoader) arrayList.get(i2)).getLoadedCount())));
                }
                this.lastStart = f;
                this.lastLeft = f2;
                this.lastRight = f3;
                this.lastAudioSelected = f4;
                this.lastMaxBar = f6;
                this.lastAudioHeight = f5;
                this.lastBottom = f7;
                layout(f, f2, f3, f4, f6, f5, f7, this.lastWaveformLoaded, arrayList);
            }
        }

        private void layout(float f, float f2, float f3, float f4, float f5, float f6, float f7, ArrayList arrayList, ArrayList arrayList2) {
            rewind();
            float fRound = Math.round(AndroidUtilities.dpf2(3.3333f));
            int iMax = 0;
            for (int i = 0; i < arrayList2.size(); i++) {
                if (arrayList2.get(i) != null) {
                    iMax = Math.max(iMax, ((AudioWaveformLoader) arrayList2.get(i)).getCount());
                }
            }
            int iMax2 = Math.max(0, (int) (((f2 - this.ph) - f) / fRound));
            int iMin = Math.min(iMax - 1, (int) Math.ceil(((f3 + this.ph) - f) / fRound));
            while (iMax2 <= iMin) {
                float f8 = iMax2;
                float fDp = f + (f8 * fRound) + AndroidUtilities.dp(2.0f);
                int i2 = 0;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    short bar = (arrayList2.get(i3) == null || iMax2 >= ((AudioWaveformLoader) arrayList2.get(i3)).getCount()) ? (short) 0 : ((AudioWaveformLoader) arrayList2.get(i3)).getBar(iMax2);
                    if (f8 < ((Float) arrayList.get(i3)).floatValue() && iMax2 + 1 > ((Float) arrayList.get(i3)).floatValue()) {
                        bar = (short) (bar * (((Float) arrayList.get(i3)).floatValue() - f8));
                    } else if (f8 > ((Float) arrayList.get(i3)).floatValue()) {
                        bar = 0;
                    }
                    i2 += bar;
                }
                float f9 = f5 <= 0.0f ? 0.0f : (i2 / f5) * f6 * 0.6f;
                if (fDp < f2 || fDp > f3) {
                    f9 *= f4;
                    if (f9 > 0.0f) {
                        float fMax = Math.max(f9, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(fDp, AndroidUtilities.lerp(f7 - fMax, f7 - ((f6 + fMax) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f7, f7 - ((f6 - fMax) / 2.0f), f4));
                        addRoundRect(rectF, this.waveformRadii, Path.Direction.CW);
                    }
                } else {
                    float fMax2 = Math.max(f9, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(fDp, AndroidUtilities.lerp(f7 - fMax2, f7 - ((f6 + fMax2) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f7, f7 - ((f6 - fMax2) / 2.0f), f4));
                    addRoundRect(rectF2, this.waveformRadii, Path.Direction.CW);
                }
                iMax2++;
            }
        }

        private void layout(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, AudioWaveformLoader audioWaveformLoader) {
            rewind();
            float fRound = Math.round(AndroidUtilities.dpf2(3.3333f));
            int count = audioWaveformLoader.getCount();
            int iMin = Math.min(count - 1, (int) Math.ceil(((f3 + this.ph) - f) / fRound));
            for (int iMax = Math.max(0, (int) (((f2 - this.ph) - f) / fRound)); iMax <= iMin; iMax++) {
                float f9 = iMax;
                float fDp = (f9 * fRound) + f + AndroidUtilities.dp(2.0f);
                float bar = f5 <= 0.0f ? 0.0f : (audioWaveformLoader.getBar(iMax) / f5) * f6 * 0.6f;
                if (f9 < f8 && iMax + 1 > f8) {
                    bar *= f8 - f9;
                } else if (f9 > f8) {
                    bar = 0.0f;
                }
                if (fDp < f2 || fDp > f3) {
                    bar *= f4;
                    if (bar > 0.0f) {
                        float fMax = Math.max(bar, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(fDp, AndroidUtilities.lerp(f7 - fMax, f7 - ((f6 + fMax) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f7, f7 - ((f6 - fMax) / 2.0f), f4));
                        addRoundRect(rectF, this.waveformRadii, Path.Direction.CW);
                    }
                } else {
                    float fMax2 = Math.max(bar, AndroidUtilities.lerp(AndroidUtilities.dpf2(0.66f), AndroidUtilities.dpf2(1.5f), f4));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(fDp, AndroidUtilities.lerp(f7 - fMax2, f7 - ((f6 + fMax2) / 2.0f), f4), AndroidUtilities.dpf2(1.66f) + fDp, AndroidUtilities.lerp(f7, f7 - ((f6 - fMax2) / 2.0f), f4));
                    addRoundRect(rectF2, this.waveformRadii, Path.Direction.CW);
                }
            }
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        long j;
        int i;
        float fMax;
        Track track;
        Track track2;
        int i2;
        float f;
        float fMax2;
        float f2;
        boolean z;
        float f3;
        float f4;
        float f5;
        Paint paint;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        Canvas canvas2;
        float f12;
        Paint paint2;
        float f13;
        float f14;
        Canvas canvas3;
        Paint paint3;
        double d;
        Canvas canvas4;
        float f15;
        float fMax3;
        float f16;
        float fLerp;
        Track track3;
        float f17;
        float contentHeight;
        float fDpf2;
        long j2;
        Track track4;
        Track track5;
        float f18;
        float f19;
        float f20;
        Track track6;
        float f21;
        float f22;
        float f23;
        long j3;
        long j4;
        int iMin;
        int i3;
        long j5;
        int i4;
        float fLerp2;
        float fLerp3;
        Canvas canvas5;
        long j6;
        float fDpf3;
        BlurringShader.BlurManager blurManager;
        float fLerp4;
        float f24;
        Paint paint4;
        float f25;
        boolean z2;
        float f26;
        int i5;
        float fLerp5;
        float f27;
        Canvas canvas6;
        Paint paint5;
        Canvas canvas7;
        float f28;
        boolean z3;
        VideoThumbsLoader.BitmapFrame bitmapFrame;
        int i6;
        BlurringShader.BlurManager blurManager2;
        Canvas canvas8 = canvas;
        Paint paint6 = this.backgroundBlur.getPaint(1.0f);
        float f29 = this.openT.set(this.open);
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (f29 < 1.0f) {
            this.timelineBounds.set(this.px, (this.h - this.py) - AndroidUtilities.dp(28.0f), this.w - this.px, this.h - this.py);
            this.timelineClipPath.rewind();
            this.timelineClipPath.addRoundRect(this.timelineBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas8.saveLayerAlpha(this.timelineBounds, (int) ((1.0f - f29) * 255.0f), 31);
            canvas8.clipPath(this.timelineClipPath);
            if (this.blurManager.hasRenderNode()) {
                this.backgroundBlur.drawRect(canvas8);
                canvas8.drawColor(855638016);
            } else if (paint6 == null) {
                canvas8.drawColor(1073741824);
            } else {
                canvas8.drawRect(this.timelineBounds, paint6);
                canvas8.drawColor(855638016);
            }
            if (!this.collageWaveforms.isEmpty() && (blurManager2 = this.blurManager) != null && blurManager2.hasRenderNode()) {
                float f30 = this.timelineWaveformMax.set(WaveformPath.getMaxBar(this.collageWaveforms));
                float f31 = this.px + this.ph + (((this.audioOffset - this.scroll) / jMin) * this.sw);
                WaveformPath waveformPath = this.timelineWaveformPath;
                RectF rectF = this.timelineBounds;
                waveformPath.check(f31, rectF.left, rectF.right, 0.0f, AndroidUtilities.dp(28.0f), f30, this.timelineBounds.bottom, this.collageWaveforms);
                canvas8.saveLayerAlpha(this.timelineBounds, 102, 31);
                canvas8.clipPath(this.timelineWaveformPath);
                this.audioWaveformBlur.drawRect(canvas8);
                canvas.restore();
            } else if (!this.collageWaveforms.isEmpty()) {
                Paint paint7 = this.audioWaveformBlur.getPaint(0.4f);
                if (paint7 == null) {
                    paint7 = this.waveformPaint;
                    paint7.setAlpha(64);
                }
                float f32 = this.timelineWaveformMax.set(WaveformPath.getMaxBar(this.collageWaveforms));
                float f33 = this.px + this.ph + (((this.audioOffset - this.scroll) / jMin) * this.sw);
                WaveformPath waveformPath2 = this.timelineWaveformPath;
                RectF rectF2 = this.timelineBounds;
                waveformPath2.check(f33, rectF2.left, rectF2.right, 0.0f, AndroidUtilities.dp(28.0f), f32, this.timelineBounds.bottom, this.collageWaveforms);
                canvas8.drawPath(this.timelineWaveformPath, paint7);
            }
            float currentWidth = ((this.timelineText.getCurrentWidth() + AndroidUtilities.dp(3.66f)) + this.timelineIcon.getIntrinsicWidth()) / 2.0f;
            int iCenterX = (int) (this.timelineBounds.centerX() - currentWidth);
            int iCenterY = (int) this.timelineBounds.centerY();
            Drawable drawable = this.timelineIcon;
            drawable.setBounds(iCenterX, iCenterY - (drawable.getIntrinsicHeight() / 2), this.timelineIcon.getIntrinsicWidth() + iCenterX, (this.timelineIcon.getIntrinsicHeight() / 2) + iCenterY);
            this.timelineIcon.setAlpha(191);
            this.timelineIcon.draw(canvas8);
            this.timelineText.draw(canvas, (this.timelineBounds.centerX() - currentWidth) + this.timelineIcon.getIntrinsicWidth() + AndroidUtilities.dp(3.66f), iCenterY, -1, 0.75f);
            canvas.restore();
        }
        if (f29 > 0.0f) {
            if (f29 < 1.0f) {
                f2 = 0.0f;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f29 * 255.0f), 31);
                z = true;
            } else {
                f2 = 0.0f;
                z = false;
            }
            Track track7 = this.videoTrack;
            float f34 = track7 != null ? 1.0f : 0.0f;
            if (track7 != null) {
                f3 = track7.selectedT.set((this.audioSelected || this.roundSelected) ? false : true);
            } else {
                f3 = 0.0f;
            }
            float f35 = this.h - this.py;
            float fDp = AndroidUtilities.dp(4.0f);
            if (this.videoTrack != null) {
                canvas.save();
                float videoHeight = getVideoHeight();
                Track track8 = this.videoTrack;
                float f36 = track8.left;
                long j7 = track8.duration;
                float f37 = j7;
                float f38 = (f36 * f37 * f3) + f2;
                f8 = (track8.right * f37 * f3) + f2;
                float f39 = j7 <= 0 ? 0.0f : (this.px + this.ph) - ((this.scroll / jMin) * this.sw);
                int i7 = this.ph;
                float f40 = i7;
                float f41 = f39 - f40;
                float f42 = (j7 <= 0 ? 0.0f : this.px + i7 + (((j7 - this.scroll) / jMin) * this.sw)) + f40;
                this.videoBounds.set(f41, f35 - videoHeight, f42, f35);
                float f43 = f35 - ((fDp * f34) + videoHeight);
                RectF rectF3 = this.videoBounds;
                f10 = (rectF3.top * f3) + 0.0f;
                float f44 = (rectF3.bottom * f3) + 0.0f;
                this.videoClipPath.rewind();
                f9 = f44;
                this.videoClipPath.addRoundRect(this.videoBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas8.clipPath(this.videoClipPath);
                VideoThumbsLoader videoThumbsLoader = this.videoTrack.thumbs;
                if (videoThumbsLoader != null) {
                    int frameWidth = videoThumbsLoader.getFrameWidth();
                    float f45 = frameWidth;
                    f4 = f3;
                    f5 = f34;
                    int iMax = (int) Math.max(0.0d, Math.floor((f41 - this.px) / f45));
                    int iMin2 = (int) Math.min(this.videoTrack.thumbs.count, Math.ceil(((f42 - f41) - this.px) / f45) + 1.0d);
                    int i8 = (int) this.videoBounds.top;
                    boolean z4 = this.videoTrack.thumbs.frames.size() >= iMin2;
                    boolean z5 = (frameWidth == 0 || !z4 || this.videoTrack.isRound) ? false : true;
                    if (z5) {
                        int i9 = iMax;
                        i6 = i9;
                        while (i9 < Math.min(this.videoTrack.thumbs.frames.size(), iMin2)) {
                            if (((VideoThumbsLoader.BitmapFrame) this.videoTrack.thumbs.frames.get(i9)).bitmap == null) {
                                z5 = false;
                                break;
                            }
                            i9++;
                        }
                    } else {
                        i6 = iMax;
                    }
                    if (z5) {
                        paint = paint6;
                    } else {
                        if (this.blurManager.hasRenderNode()) {
                            this.backgroundBlur.drawRect(canvas8);
                            canvas8.drawColor(855638016);
                        } else if (paint6 == 0) {
                            canvas8.drawColor(1073741824);
                        } else {
                            paint = paint6;
                            canvas8.drawRect(this.videoBounds, paint);
                            canvas8.drawColor(855638016);
                        }
                        paint = paint6;
                    }
                    if (frameWidth != 0) {
                        int i10 = i6;
                        while (i10 < Math.min(this.videoTrack.thumbs.frames.size(), iMin2)) {
                            VideoThumbsLoader.BitmapFrame bitmapFrame2 = (VideoThumbsLoader.BitmapFrame) this.videoTrack.thumbs.frames.get(i10);
                            if (bitmapFrame2.bitmap != null) {
                                this.videoFramePaint.setAlpha((int) (bitmapFrame2.getAlpha() * 255.0f));
                                Bitmap bitmap = bitmapFrame2.bitmap;
                                canvas8.drawBitmap(bitmap, f41, i8 - ((int) ((bitmap.getHeight() - videoHeight) / 2.0f)), this.videoFramePaint);
                            }
                            f41 += f45;
                            i10++;
                            iMin2 = iMin2;
                        }
                    }
                    if (!z4) {
                        this.videoTrack.thumbs.load();
                    }
                } else {
                    f4 = f3;
                    f5 = f34;
                    paint = paint6;
                }
                this.selectedVideoClipPath.rewind();
                if (!this.isCover) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    int i11 = this.px;
                    int i12 = this.ph;
                    float f46 = i11 + i12;
                    Track track9 = this.videoTrack;
                    float f47 = track9.left;
                    float f48 = track9.duration;
                    float f49 = this.scroll;
                    float f50 = jMin;
                    float f51 = this.sw;
                    float f52 = (((((f47 * f48) - f49) / f50) * f51) + f46) - (f47 <= 0.0f ? i12 : 0);
                    float f53 = this.h - this.py;
                    float f54 = f53 - videoHeight;
                    float f55 = track9.right;
                    rectF4.set(f52, f54, f46 + ((((f48 * f55) - f49) / f50) * f51) + (f55 >= 1.0f ? i12 : 0), f53);
                    this.selectedVideoClipPath.addRoundRect(rectF4, this.selectedVideoRadii, Path.Direction.CW);
                    canvas8.clipPath(this.selectedVideoClipPath, Region.Op.DIFFERENCE);
                    canvas8.drawColor(1342177280);
                }
                canvas.restore();
                f7 = videoHeight;
                f6 = f38;
                f35 = f43;
            } else {
                f4 = f3;
                f5 = f34;
                paint = paint6;
                f6 = 0.0f;
                f7 = 0.0f;
                f8 = 0.0f;
                f9 = 0.0f;
                f10 = 0.0f;
            }
            if (this.collageTracks.isEmpty()) {
                f11 = fDp;
                float f56 = f6;
                canvas2 = canvas8;
                f12 = f7;
                paint2 = paint;
                f13 = f56;
                f14 = 0.0f;
            } else {
                getCollageHeight();
                int i13 = 0;
                while (i13 < this.collageTracks.size()) {
                    Track track10 = (Track) this.collageTracks.get(i13);
                    float f57 = track10.selectedT.set((this.audioSelected || this.roundSelected || this.collageSelected != i13) ? false : true);
                    if (track10 != this.collageMain) {
                        int i14 = i13;
                        float f58 = jMin;
                        float fLerp6 = this.px + this.ph + ((((track10.offset - this.scroll) + (AndroidUtilities.lerp(track10.left, 0.0f, f57) * track10.duration)) / f58) * this.sw);
                        f26 = fDp;
                        fLerp5 = this.px + this.ph + ((((track10.offset - this.scroll) + (AndroidUtilities.lerp(track10.right, 1.0f, f57) * track10.duration)) / f58) * this.sw);
                        f27 = fLerp6;
                        i5 = i14;
                    } else {
                        f26 = fDp;
                        int i15 = i13;
                        float f59 = this.px + this.ph;
                        long j8 = track10.offset - this.scroll;
                        float f60 = jMin;
                        float f61 = this.sw;
                        float f62 = ((j8 / f60) * f61) + f59;
                        i5 = i15;
                        fLerp5 = f59 + (((j8 + track10.duration) / f60) * f61);
                        f27 = f62;
                    }
                    canvas.save();
                    float fLerp7 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), f57);
                    RectF rectF5 = track10.bounds;
                    float f63 = this.ph;
                    rectF5.set(f27 - f63, f35 - fLerp7, fLerp5 + f63, f35);
                    RectF rectF6 = track10.bounds;
                    f10 += rectF6.top * f57;
                    f9 += rectF6.bottom * f57;
                    float f64 = track10.offset;
                    float f65 = track10.left;
                    float f66 = track10.duration;
                    float f67 = f6 + (((f65 * f66) + f64) * f57);
                    f8 += (f64 + (track10.right * f66)) * f57;
                    this.collageClipPath.rewind();
                    this.collageClipPath.addRoundRect(track10.bounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas8.clipPath(this.collageClipPath);
                    VideoThumbsLoader videoThumbsLoader2 = track10.thumbs;
                    if (videoThumbsLoader2 != null) {
                        long j9 = track10.duration;
                        if (j9 <= 0) {
                            jMin = jMin;
                            f28 = 0.0f;
                        } else {
                            jMin = jMin;
                            f28 = this.px + this.ph + (((track10.offset - this.scroll) / jMin) * this.sw);
                        }
                        int i16 = this.ph;
                        float f68 = i16;
                        float f69 = f28 - f68;
                        float f70 = j9 <= 0 ? 0.0f : ((((track10.offset + j9) - this.scroll) / jMin) * this.sw) + this.px + i16;
                        int frameWidth2 = videoThumbsLoader2.getFrameWidth();
                        float f71 = frameWidth2;
                        int iMax2 = (int) Math.max(0.0d, Math.floor((f69 - ((this.px + this.ph) + (((track10.offset - this.scroll) / jMin) * this.sw))) / f71));
                        int iMin3 = (int) Math.min(track10.thumbs.count, Math.ceil(((f70 + f68) - f69) / f71) + 1.0d);
                        int i17 = (int) track10.bounds.top;
                        boolean z6 = track10.thumbs.frames.size() >= iMin3;
                        if (!z6) {
                            z3 = z6;
                            break;
                        }
                        int i18 = iMax2;
                        while (true) {
                            if (i18 >= Math.min(track10.thumbs.frames.size(), iMin3)) {
                                z3 = z6;
                                break;
                            } else {
                                if (((VideoThumbsLoader.BitmapFrame) track10.thumbs.frames.get(i18)).bitmap == null) {
                                    z3 = false;
                                    break;
                                }
                                i18++;
                            }
                        }
                        if (z3) {
                            canvas6 = canvas;
                        } else if (this.blurManager.hasRenderNode()) {
                            canvas6 = canvas;
                            this.backgroundBlur.drawRect(canvas6);
                            canvas6.drawColor(855638016);
                        } else {
                            canvas6 = canvas;
                            if (paint == null) {
                                canvas6.drawColor(1073741824);
                            } else {
                                paint5 = paint;
                                canvas6.drawRect(track10.bounds, paint5);
                                canvas6.drawColor(855638016);
                            }
                            if (frameWidth2 != 0) {
                                while (iMax2 < Math.min(track10.thumbs.frames.size(), iMin3)) {
                                    bitmapFrame = (VideoThumbsLoader.BitmapFrame) track10.thumbs.frames.get(iMax2);
                                    if (bitmapFrame.bitmap != null) {
                                        this.collageFramePaint.setAlpha((int) (bitmapFrame.getAlpha() * 255.0f));
                                        Bitmap bitmap2 = bitmapFrame.bitmap;
                                        canvas6.drawBitmap(bitmap2, f69, i17 - ((int) ((bitmap2.getHeight() - fLerp7) / 2.0f)), this.collageFramePaint);
                                    }
                                    f69 += f71;
                                    iMax2++;
                                    iMin3 = iMin3;
                                }
                            }
                            if (!z6) {
                                track10.thumbs.load();
                            }
                        }
                        paint5 = paint;
                        if (frameWidth2 != 0) {
                            while (iMax2 < Math.min(track10.thumbs.frames.size(), iMin3)) {
                                bitmapFrame = (VideoThumbsLoader.BitmapFrame) track10.thumbs.frames.get(iMax2);
                                if (bitmapFrame.bitmap != null) {
                                    this.collageFramePaint.setAlpha((int) (bitmapFrame.getAlpha() * 255.0f));
                                    Bitmap bitmap3 = bitmapFrame.bitmap;
                                    canvas6.drawBitmap(bitmap3, f69, i17 - ((int) ((bitmap3.getHeight() - fLerp7) / 2.0f)), this.collageFramePaint);
                                }
                                f69 += f71;
                                iMax2++;
                                iMin3 = iMin3;
                            }
                        }
                        if (!z6) {
                            track10.thumbs.load();
                        }
                    } else {
                        canvas6 = canvas8;
                        f7 = f7;
                        i5 = i5;
                        jMin = jMin;
                        f67 = f67;
                        paint5 = paint;
                    }
                    this.selectedCollageClipPath.rewind();
                    if (this.isCover) {
                        canvas7 = canvas6;
                    } else {
                        RectF rectF7 = AndroidUtilities.rectTmp;
                        int i19 = this.px;
                        int i20 = this.ph;
                        float f72 = i19 + i20;
                        float f73 = track10.left;
                        float f74 = track10.duration;
                        float f75 = this.scroll;
                        float f76 = track10.offset;
                        float f77 = jMin;
                        float f78 = this.sw;
                        float f79 = ((((((f73 * f74) - f75) + f76) / f77) * f78) + f72) - (f73 <= 0.0f ? i20 : 0);
                        RectF rectF8 = track10.bounds;
                        float f80 = rectF8.top;
                        float f81 = track10.right;
                        rectF7.set(f79, f80, f72 + (((((f74 * f81) - f75) + f76) / f77) * f78) + (f81 >= 1.0f ? i20 : 0), rectF8.bottom);
                        this.selectedCollageClipPath.addRoundRect(rectF7, this.selectedVideoRadii, Path.Direction.CW);
                        canvas7 = canvas;
                        canvas7.clipPath(this.selectedCollageClipPath, Region.Op.DIFFERENCE);
                        canvas7.drawColor(1342177280);
                    }
                    canvas.restore();
                    f35 -= fLerp7 + (f26 * 1.0f);
                    i13 = i5 + 1;
                    canvas8 = canvas7;
                    fDp = f26;
                    f7 = f7;
                    f6 = f67;
                    paint = paint5;
                }
                f11 = fDp;
                f13 = f6;
                canvas2 = canvas8;
                f12 = f7;
                paint2 = paint;
                f14 = 1.0f;
            }
            float f82 = this.roundT.set(this.hasRound);
            float f83 = this.roundSelectedT.set(this.hasRound && this.roundSelected);
            float roundHeight = getRoundHeight() * f82;
            float f84 = ((this.videoTrack == null && !this.hasAudio && this.collageTracks.isEmpty()) ? 1.0f : f83) * f82;
            if (f82 > 0.0f) {
                long j10 = this.roundOffset;
                float f85 = j10;
                float f86 = this.roundLeft;
                long j11 = this.roundDuration;
                float f87 = j11;
                f13 += (f85 + (f86 * f87)) * f84;
                f8 += (f85 + (this.roundRight * f87)) * f84;
                if (this.videoTrack != null) {
                    float f88 = this.px + this.ph;
                    float fLerp8 = (j10 - this.scroll) + (AndroidUtilities.lerp(f86, 0.0f, f83) * this.roundDuration);
                    float f89 = jMin;
                    f24 = f88 + ((fLerp8 / f89) * this.sw);
                    fLerp4 = this.px + this.ph + ((((this.roundOffset - this.scroll) + (AndroidUtilities.lerp(this.roundRight, 1.0f, f83) * this.roundDuration)) / f89) * this.sw);
                } else {
                    float f90 = this.px + this.ph;
                    long j12 = j10 - this.scroll;
                    float f91 = jMin;
                    float f92 = this.sw;
                    fLerp4 = f90 + (((j12 + j11) / f91) * f92);
                    f24 = ((j12 / f91) * f92) + f90;
                }
                RectF rectF9 = this.roundBounds;
                float f93 = this.ph;
                rectF9.set(f24 - f93, f35 - roundHeight, fLerp4 + f93, f35);
                float f94 = f35 - ((f11 * f82) + roundHeight);
                RectF rectF10 = this.roundBounds;
                f10 += rectF10.top * f84;
                f9 += rectF10.bottom * f84;
                this.roundClipPath.rewind();
                this.roundClipPath.addRoundRect(this.roundBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.save();
                canvas3 = canvas;
                canvas3.clipPath(this.roundClipPath);
                VideoThumbsLoader videoThumbsLoader3 = this.roundThumbs;
                if (videoThumbsLoader3 != null) {
                    long j13 = this.roundDuration;
                    float f95 = j13 <= 0 ? 0.0f : this.px + this.ph + (((this.roundOffset - this.scroll) / jMin) * this.sw);
                    int i21 = this.ph;
                    float f96 = i21;
                    float f97 = f95 - f96;
                    float f98 = (j13 <= 0 ? 0.0f : ((((this.roundOffset + j13) - this.scroll) / jMin) * this.sw) + this.px + i21) + f96;
                    int frameWidth3 = videoThumbsLoader3.getFrameWidth();
                    if (this.videoTrack != null) {
                        f25 = this.px + this.ph + (((this.roundOffset - this.scroll) / jMin) * this.sw);
                    } else {
                        f25 = this.px;
                    }
                    float f99 = frameWidth3;
                    int iMax3 = (int) Math.max(0.0d, Math.floor((f97 - f25) / f99));
                    int iMin4 = (int) Math.min(this.roundThumbs.count, Math.ceil((f98 - f97) / f99) + 1.0d);
                    int i22 = (int) this.roundBounds.top;
                    boolean z7 = this.roundThumbs.frames.size() >= iMin4;
                    if (!z7) {
                        z2 = z7;
                        break;
                    }
                    int i23 = iMax3;
                    while (true) {
                        if (i23 >= Math.min(this.roundThumbs.frames.size(), iMin4)) {
                            z2 = z7;
                            break;
                        } else {
                            if (((VideoThumbsLoader.BitmapFrame) this.roundThumbs.frames.get(i23)).bitmap == null) {
                                z2 = false;
                                break;
                            }
                            i23++;
                        }
                    }
                    if (z2) {
                        paint4 = paint2;
                    } else {
                        if (this.blurManager.hasRenderNode()) {
                            this.backgroundBlur.drawRect(canvas3);
                            canvas3.drawColor(855638016);
                        } else if (paint2 == null) {
                            canvas3.drawColor(1073741824);
                        } else {
                            paint4 = paint2;
                            canvas3.drawRect(this.roundBounds, paint4);
                            canvas3.drawColor(855638016);
                        }
                        paint4 = paint2;
                    }
                    if (frameWidth3 != 0) {
                        while (iMax3 < Math.min(this.roundThumbs.frames.size(), iMin4)) {
                            VideoThumbsLoader.BitmapFrame bitmapFrame3 = (VideoThumbsLoader.BitmapFrame) this.roundThumbs.frames.get(iMax3);
                            if (bitmapFrame3.bitmap != null) {
                                this.videoFramePaint.setAlpha((int) (bitmapFrame3.getAlpha() * 255.0f));
                                Bitmap bitmap4 = bitmapFrame3.bitmap;
                                canvas3.drawBitmap(bitmap4, f97, i22 - ((int) ((bitmap4.getHeight() - roundHeight) / 2.0f)), this.videoFramePaint);
                            }
                            f97 += f99;
                            iMax3++;
                        }
                    }
                    if (!z7) {
                        this.roundThumbs.load();
                    }
                } else {
                    f94 = f94;
                    paint4 = paint2;
                }
                this.selectedVideoClipPath.rewind();
                RectF rectF11 = AndroidUtilities.rectTmp;
                int i24 = this.px;
                int i25 = this.ph;
                float f100 = i24 + i25;
                float f101 = this.roundLeft;
                float f102 = this.roundDuration;
                float f103 = this.scroll;
                float f104 = this.roundOffset;
                float f105 = jMin;
                float f106 = this.sw;
                float f107 = ((((((f101 * f102) - f103) + f104) / f105) * f106) + f100) - (f101 <= 0.0f ? i25 : 0);
                float f108 = i25 * (1.0f - f83);
                float f109 = f107 - f108;
                paint2 = paint4;
                RectF rectF12 = this.roundBounds;
                float f110 = rectF12.top;
                float f111 = this.roundRight;
                rectF11.set(f109, f110, f100 + (((((f102 * f111) - f103) + f104) / f105) * f106) + (f111 >= 1.0f ? i25 : 0) + f108, rectF12.bottom);
                this.selectedVideoClipPath.addRoundRect(rectF11, this.selectedVideoRadii, Path.Direction.CW);
                canvas3.clipPath(this.selectedVideoClipPath, Region.Op.DIFFERENCE);
                canvas3.drawColor(1342177280);
                canvas.restore();
                f35 = f94;
            } else {
                canvas3 = canvas2;
                f83 = f83;
            }
            float f112 = this.audioT.set(this.hasAudio);
            float f113 = this.audioSelectedT.set(this.hasAudio && this.audioSelected);
            float audioHeight = getAudioHeight() * f112;
            float f114 = ((this.videoTrack == null && !this.hasRound && this.collageTracks.isEmpty()) ? 1.0f : f113) * f112;
            if (f112 > 0.0f) {
                float f115 = this.audioOffset;
                float f116 = this.audioLeft;
                float f117 = this.audioDuration;
                f13 += ((f116 * f117) + f115) * f114;
                f8 += (f115 + (this.audioRight * f117)) * f114;
                Paint paint8 = this.audioBlur.getPaint(f112);
                canvas.save();
                if (this.videoTrack != null || this.hasRound || !this.collageTracks.isEmpty()) {
                    float f118 = jMin;
                    fLerp2 = this.px + this.ph + ((((this.audioOffset - this.scroll) + (AndroidUtilities.lerp(this.audioLeft, 0.0f, f113) * this.audioDuration)) / f118) * this.sw);
                    fLerp3 = this.px + this.ph + ((((this.audioOffset - this.scroll) + (AndroidUtilities.lerp(this.audioRight, 1.0f, f113) * this.audioDuration)) / f118) * this.sw);
                } else {
                    float f119 = this.px + this.ph;
                    long j14 = this.audioOffset - this.scroll;
                    float f120 = jMin;
                    float f121 = this.sw;
                    fLerp2 = ((j14 / f120) * f121) + f119;
                    fLerp3 = f119 + (((j14 + this.audioDuration) / f120) * f121);
                }
                RectF rectF13 = this.audioBounds;
                float f122 = this.ph;
                rectF13.set(fLerp2 - f122, f35 - audioHeight, f122 + fLerp3, f35);
                RectF rectF14 = this.audioBounds;
                f10 += rectF14.top * f114;
                f9 += rectF14.bottom * f114;
                this.audioClipPath.rewind();
                this.audioClipPath.addRoundRect(this.audioBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas3.clipPath(this.audioClipPath);
                BlurringShader.BlurManager blurManager3 = this.blurManager;
                if (blurManager3 == null || !blurManager3.hasRenderNode()) {
                    f112 = f112;
                    if (paint8 == null) {
                        canvas3.drawColor(Theme.multAlpha(1073741824, f112));
                    } else {
                        canvas3.drawRect(this.audioBounds, paint8);
                        canvas3.drawColor(Theme.multAlpha(855638016, f112));
                    }
                } else {
                    this.backgroundBlur.drawRect(canvas3);
                    f112 = f112;
                    canvas3.drawColor(Theme.multAlpha(855638016, f112));
                }
                if (this.waveform != null && (blurManager = this.blurManager) != null && blurManager.hasRenderNode()) {
                    float f123 = this.waveformMax.set(this.waveform.getMaxBar(), !this.waveformIsLoaded);
                    this.waveformIsLoaded = this.waveform.getLoadedCount() > 0;
                    d = 0.0d;
                    canvas5 = canvas;
                    paint3 = paint2;
                    j6 = jMin;
                    this.waveformPath.check(this.px + this.ph + (((this.audioOffset - this.scroll) / jMin) * this.sw), fLerp2, fLerp3, f113, j6, audioHeight, f123, this.audioBounds.bottom, this.waveform);
                    canvas5.saveLayerAlpha(this.audioBounds, 102, 31);
                    canvas5.clipPath(this.waveformPath);
                    this.audioWaveformBlur.drawRect(canvas5);
                    canvas.restore();
                } else {
                    canvas5 = canvas3;
                    j6 = jMin;
                    paint3 = paint2;
                    d = 0.0d;
                    if (this.waveform != null && paint8 != null) {
                        Paint paint9 = this.audioWaveformBlur.getPaint(0.4f * f112);
                        if (paint9 == null) {
                            paint9 = this.waveformPaint;
                            paint9.setAlpha((int) (64.0f * f112));
                        }
                        float f124 = this.waveformMax.set(this.waveform.getMaxBar(), !this.waveformIsLoaded);
                        this.waveformIsLoaded = this.waveform.getLoadedCount() > 0;
                        this.waveformPath.check(this.px + this.ph + (((this.audioOffset - this.scroll) / j6) * this.sw), fLerp2, fLerp3, f113, j6, audioHeight, f124, this.audioBounds.bottom, this.waveform);
                        canvas5.drawPath(this.waveformPath, paint9);
                    }
                }
                if (f113 < 1.0f) {
                    int i26 = this.px;
                    float f125 = this.ph + i26;
                    float f126 = this.audioOffset - this.scroll;
                    float f127 = this.audioLeft;
                    float f128 = this.audioDuration;
                    j = j6;
                    float f129 = j;
                    float f130 = this.sw;
                    float f131 = ((((f127 * f128) + f126) / f129) * f130) + f125;
                    float f132 = f125 + (((f126 + (this.audioRight * f128)) / f129) * f130);
                    float fMax4 = (Math.max(i26, f131) + Math.min(this.w - this.px, f132)) / 2.0f;
                    float fCenterY = this.audioBounds.centerY();
                    float fMax5 = Math.max(0.0f, (Math.min(this.w - this.px, f132) - Math.max(this.px, f131)) - AndroidUtilities.dp(24.0f));
                    float fDpf4 = AndroidUtilities.dpf2(13.0f) + ((this.audioAuthor == null && this.audioTitle == null) ? 0.0f : AndroidUtilities.dpf2(3.11f) + this.audioAuthorWidth + AndroidUtilities.dpf2(9.66f) + this.audioTitleWidth);
                    boolean z8 = fDpf4 < fMax5;
                    float fMin = fMax4 - (Math.min(fDpf4, fMax5) / 2.0f);
                    this.audioIcon.setBounds((int) fMin, (int) (fCenterY - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + fMin), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + fCenterY));
                    float f133 = 1.0f - f113;
                    float f134 = f133 * 255.0f;
                    this.audioIcon.setAlpha((int) f134);
                    this.audioIcon.draw(canvas5);
                    float fDpf5 = fMin + AndroidUtilities.dpf2(16.11f);
                    canvas4 = canvas5;
                    canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, 255, 31);
                    float fMin2 = Math.min(f132, this.w) - AndroidUtilities.dp(12.0f);
                    canvas4.clipRect(fDpf5, 0.0f, fMin2, this.h);
                    if (this.audioAuthor != null) {
                        canvas.save();
                        canvas4.translate(fDpf5 - this.audioAuthorLeft, fCenterY - (this.audioAuthor.getHeight() / 2.0f));
                        this.audioAuthorPaint.setAlpha((int) (f134 * f112));
                        this.audioAuthor.draw(canvas4);
                        canvas.restore();
                        fDpf3 = fDpf5 + this.audioAuthorWidth;
                    } else {
                        fDpf3 = fDpf5;
                    }
                    if (this.audioAuthor != null && this.audioTitle != null) {
                        float fDpf6 = fDpf3 + AndroidUtilities.dpf2(3.66f);
                        int alpha = this.audioDotPaint.getAlpha();
                        this.audioDotPaint.setAlpha((int) (alpha * f133));
                        canvas4.drawCircle(AndroidUtilities.dp(1.0f) + fDpf6, fCenterY, AndroidUtilities.dp(1.0f), this.audioDotPaint);
                        this.audioDotPaint.setAlpha(alpha);
                        fDpf3 = fDpf6 + AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(4.0f);
                    }
                    if (this.audioTitle != null) {
                        canvas.save();
                        canvas4.translate(fDpf3 - this.audioTitleLeft, fCenterY - (this.audioTitle.getHeight() / 2.0f));
                        this.audioTitlePaint.setAlpha((int) (f134 * f112));
                        this.audioTitle.draw(canvas4);
                        canvas.restore();
                    }
                    if (!z8) {
                        this.ellipsizeMatrix.reset();
                        this.ellipsizeMatrix.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                        this.ellipsizeMatrix.postTranslate(fMin2 - AndroidUtilities.dp(8.0f), 0.0f);
                        this.ellipsizeGradient.setLocalMatrix(this.ellipsizeMatrix);
                        float fDp2 = fMin2 - AndroidUtilities.dp(8.0f);
                        RectF rectF15 = this.audioBounds;
                        canvas.drawRect(fDp2, rectF15.top, fMin2, rectF15.bottom, this.ellipsizePaint);
                    }
                    canvas.restore();
                } else {
                    j = j6;
                    canvas4 = canvas5;
                }
                canvas.restore();
            } else {
                f113 = f113;
                j = jMin;
                f5 = f5;
                f4 = f4;
                paint3 = paint2;
                d = 0.0d;
                canvas4 = canvas3;
            }
            float f135 = f9;
            float f136 = f10;
            float f137 = this.px + this.ph;
            float f138 = this.scroll;
            float f139 = j;
            float f140 = this.sw;
            float f141 = f137 + (((f13 - f138) / f139) * f140);
            float f142 = f137 + (((f8 - f138) / f139) * f140);
            if (this.collageTracks.isEmpty()) {
                if (this.hasAudio && this.videoTrack == null) {
                    fMax3 = f112;
                } else {
                    f82 = f82;
                    f15 = f5;
                    fMax3 = Math.max(f15, f82);
                }
                if (f112 <= d || f82 > d || f15 > d || f14 > d) {
                    if (this.videoTrack == null || this.hasRound || !this.collageTracks.isEmpty()) {
                        f16 = f113;
                        fLerp = 1.0f;
                    } else {
                        f16 = f113;
                        fLerp = AndroidUtilities.lerp(0.6f, 1.0f, f16) * f112;
                    }
                    drawRegion(canvas, paint3, f136, f135, f141, f142, fLerp * fMax3);
                    track3 = this.videoTrack;
                    if (track3 == null && ((this.hasAudio || this.hasRound) && (f16 > 0.0f || f83 > 0.0f))) {
                        float f143 = this.h - this.py;
                        float f144 = this.ph + this.px;
                        float f145 = track3.left;
                        float f146 = track3.duration;
                        float f147 = this.scroll;
                        float f148 = this.sw;
                        drawRegion(canvas, paint3, f143 - f12, f143, f144 + ((((f145 * f146) - f147) / f139) * f148), f144 + ((((track3.right * f146) - f147) / f139) * f148), 0.8f);
                    } else if (this.collageMain != null && this.collageTracks.size() > 1) {
                        Track track11 = this.collageMain;
                        RectF rectF16 = track11.bounds;
                        float f149 = rectF16.top;
                        float f150 = rectF16.bottom;
                        float f151 = this.ph + this.px;
                        float f152 = track11.offset;
                        float f153 = track11.left;
                        float f154 = track11.duration;
                        float f155 = this.scroll;
                        float f156 = this.sw;
                        drawRegion(canvas, paint3, f149, f150, (((((f153 * f154) + f152) - f155) / f139) * f156) + f151, f151 + ((((f152 + (track11.right * f154)) - f155) / f139) * f156), 0.8f);
                    }
                    if (this.maxCount > 1 && (track6 = this.videoTrack) != null) {
                        f21 = track6.duration;
                        f22 = track6.right;
                        f23 = track6.left;
                        j3 = (long) ((f22 - f23) * f21);
                        if (j3 > 68999) {
                            float f157 = this.px + this.ph;
                            float f158 = this.scroll;
                            float f159 = this.sw;
                            float f160 = ((((f23 * f21) - f158) / f139) * f159) + f157;
                            float f161 = f157 + ((((f22 * f21) - f158) / f139) * f159);
                            canvas.save();
                            float f162 = this.h - this.py;
                            canvas4.clipRect(f160, f162 - f12, f161, f162);
                            this.regionPaint.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f4) * 255.0f));
                            j4 = 59000;
                            iMin = (int) Math.min(this.maxCount - 1, j3 / 59000);
                            i3 = 1;
                            while (i3 <= iMin) {
                                j5 = ((long) i3) * j4;
                                i4 = iMin;
                                if (Math.min(j4, j3 - j5) < 1000) {
                                    break;
                                }
                                float f163 = this.px + this.ph;
                                Track track12 = this.videoTrack;
                                float f164 = f163 + ((((((long) (track12.duration * track12.left)) + j5) - this.scroll) / f139) * this.sw);
                                canvas.drawRect(f164, (this.h - this.py) - f12, f164 + AndroidUtilities.dp(1.0f), this.h - this.py, this.regionPaint);
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                i3++;
                                sb.append(i3);
                                canvas4.drawText(sb.toString(), f164 + AndroidUtilities.dp(2.0f), ((this.h - this.py) - f12) + AndroidUtilities.dp(14.0f), this.countTextPaint);
                                iMin = i4;
                                j4 = 59000;
                            }
                            canvas.restore();
                        }
                    }
                    f17 = this.loopProgress.set(0.0f);
                    contentHeight = ((this.h - getContentHeight()) + this.py) - AndroidUtilities.dpf2(2.3f);
                    fDpf2 = (this.h - this.py) + AndroidUtilities.dpf2(4.3f);
                    if (f17 > 0.0f) {
                        j2 = this.loopProgressFrom;
                        if (j2 == -1) {
                            track4 = this.videoTrack;
                            if (track4 != null) {
                                f20 = track4.duration * track4.right;
                            } else {
                                track5 = this.collageMain;
                                if (track5 != null) {
                                    f20 = track5.duration * (track5.right - track5.left);
                                } else {
                                    if (this.hasRound) {
                                        f18 = this.roundDuration;
                                        f19 = this.roundRight;
                                    } else {
                                        f18 = this.audioDuration;
                                        f19 = this.audioRight;
                                    }
                                    j2 = (long) (f18 * f19);
                                }
                            }
                            j2 = (long) f20;
                        }
                        drawProgress(canvas, contentHeight, fDpf2, j2, f17 * fMax3);
                    }
                    drawProgress(canvas, contentHeight, fDpf2, this.progress, (1.0f - f17) * fMax3);
                }
                if (z) {
                    canvas.restore();
                }
            } else {
                fMax3 = f14;
            }
            f15 = f5;
            if (f112 <= d) {
                if (this.videoTrack == null) {
                    f16 = f113;
                    fLerp = 1.0f;
                } else {
                    f16 = f113;
                    fLerp = 1.0f;
                }
                drawRegion(canvas, paint3, f136, f135, f141, f142, fLerp * fMax3);
                track3 = this.videoTrack;
                if (track3 == null) {
                    if (this.collageMain != null) {
                        Track track13 = this.collageMain;
                        RectF rectF17 = track13.bounds;
                        float f1410 = rectF17.top;
                        float f1510 = rectF17.bottom;
                        float f1511 = this.ph + this.px;
                        float f1512 = track13.offset;
                        float f1513 = track13.left;
                        float f1514 = track13.duration;
                        float f1515 = this.scroll;
                        float f1516 = this.sw;
                        drawRegion(canvas, paint3, f1410, f1510, (((((f1513 * f1514) + f1512) - f1515) / f139) * f1516) + f1511, f1511 + ((((f1512 + (track13.right * f1514)) - f1515) / f139) * f1516), 0.8f);
                    }
                } else if (this.collageMain != null) {
                    Track track14 = this.collageMain;
                    RectF rectF18 = track14.bounds;
                    float f1411 = rectF18.top;
                    float f1517 = rectF18.bottom;
                    float f1518 = this.ph + this.px;
                    float f1519 = track14.offset;
                    float f15110 = track14.left;
                    float f15111 = track14.duration;
                    float f15112 = this.scroll;
                    float f15113 = this.sw;
                    drawRegion(canvas, paint3, f1411, f1517, (((((f15110 * f15111) + f1519) - f15112) / f139) * f15113) + f1518, f1518 + ((((f1519 + (track14.right * f15111)) - f15112) / f139) * f15113), 0.8f);
                }
                if (this.maxCount > 1) {
                    f21 = track6.duration;
                    f22 = track6.right;
                    f23 = track6.left;
                    j3 = (long) ((f22 - f23) * f21);
                    if (j3 > 68999) {
                        float f1520 = this.px + this.ph;
                        float f1521 = this.scroll;
                        float f1522 = this.sw;
                        float f165 = ((((f23 * f21) - f1521) / f139) * f1522) + f1520;
                        float f166 = f1520 + ((((f22 * f21) - f1521) / f139) * f1522);
                        canvas.save();
                        float f167 = this.h - this.py;
                        canvas4.clipRect(f165, f167 - f12, f166, f167);
                        this.regionPaint.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f4) * 255.0f));
                        j4 = 59000;
                        iMin = (int) Math.min(this.maxCount - 1, j3 / 59000);
                        i3 = 1;
                        while (i3 <= iMin) {
                            j5 = ((long) i3) * j4;
                            i4 = iMin;
                            if (Math.min(j4, j3 - j5) < 1000) {
                                break;
                                break;
                            }
                            float f168 = this.px + this.ph;
                            Track track15 = this.videoTrack;
                            float f169 = f168 + ((((((long) (track15.duration * track15.left)) + j5) - this.scroll) / f139) * this.sw);
                            canvas.drawRect(f169, (this.h - this.py) - f12, f169 + AndroidUtilities.dp(1.0f), this.h - this.py, this.regionPaint);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("#");
                            i3++;
                            sb2.append(i3);
                            canvas4.drawText(sb2.toString(), f169 + AndroidUtilities.dp(2.0f), ((this.h - this.py) - f12) + AndroidUtilities.dp(14.0f), this.countTextPaint);
                            iMin = i4;
                            j4 = 59000;
                        }
                        canvas.restore();
                    }
                }
                f17 = this.loopProgress.set(0.0f);
                contentHeight = ((this.h - getContentHeight()) + this.py) - AndroidUtilities.dpf2(2.3f);
                fDpf2 = (this.h - this.py) + AndroidUtilities.dpf2(4.3f);
                if (f17 > 0.0f) {
                    j2 = this.loopProgressFrom;
                    if (j2 == -1) {
                        track4 = this.videoTrack;
                        if (track4 != null) {
                            f20 = track4.duration * track4.right;
                        } else {
                            track5 = this.collageMain;
                            if (track5 != null) {
                                f20 = track5.duration * (track5.right - track5.left);
                            } else {
                                if (this.hasRound) {
                                    f18 = this.roundDuration;
                                    f19 = this.roundRight;
                                } else {
                                    f18 = this.audioDuration;
                                    f19 = this.audioRight;
                                }
                                j2 = (long) (f18 * f19);
                            }
                        }
                        j2 = (long) f20;
                    }
                    drawProgress(canvas, contentHeight, fDpf2, j2, f17 * fMax3);
                }
                drawProgress(canvas, contentHeight, fDpf2, this.progress, (1.0f - f17) * fMax3);
            } else {
                if (this.videoTrack == null) {
                    f16 = f113;
                    fLerp = 1.0f;
                } else {
                    f16 = f113;
                    fLerp = 1.0f;
                }
                drawRegion(canvas, paint3, f136, f135, f141, f142, fLerp * fMax3);
                track3 = this.videoTrack;
                if (track3 == null) {
                    if (this.collageMain != null) {
                        Track track16 = this.collageMain;
                        RectF rectF19 = track16.bounds;
                        float f1412 = rectF19.top;
                        float f15114 = rectF19.bottom;
                        float f15115 = this.ph + this.px;
                        float f15116 = track16.offset;
                        float f15117 = track16.left;
                        float f15118 = track16.duration;
                        float f15119 = this.scroll;
                        float f151110 = this.sw;
                        drawRegion(canvas, paint3, f1412, f15114, (((((f15117 * f15118) + f15116) - f15119) / f139) * f151110) + f15115, f15115 + ((((f15116 + (track16.right * f15118)) - f15119) / f139) * f151110), 0.8f);
                    }
                } else if (this.collageMain != null) {
                    Track track17 = this.collageMain;
                    RectF rectF110 = track17.bounds;
                    float f1413 = rectF110.top;
                    float f151111 = rectF110.bottom;
                    float f151112 = this.ph + this.px;
                    float f151113 = track17.offset;
                    float f151114 = track17.left;
                    float f151115 = track17.duration;
                    float f151116 = this.scroll;
                    float f151117 = this.sw;
                    drawRegion(canvas, paint3, f1413, f151111, (((((f151114 * f151115) + f151113) - f151116) / f139) * f151117) + f151112, f151112 + ((((f151113 + (track17.right * f151115)) - f151116) / f139) * f151117), 0.8f);
                }
                if (this.maxCount > 1) {
                    f21 = track6.duration;
                    f22 = track6.right;
                    f23 = track6.left;
                    j3 = (long) ((f22 - f23) * f21);
                    if (j3 > 68999) {
                        float f1523 = this.px + this.ph;
                        float f1524 = this.scroll;
                        float f1525 = this.sw;
                        float f1610 = ((((f23 * f21) - f1524) / f139) * f1525) + f1523;
                        float f1611 = f1523 + ((((f22 * f21) - f1524) / f139) * f1525);
                        canvas.save();
                        float f1612 = this.h - this.py;
                        canvas4.clipRect(f1610, f1612 - f12, f1611, f1612);
                        this.regionPaint.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f4) * 255.0f));
                        j4 = 59000;
                        iMin = (int) Math.min(this.maxCount - 1, j3 / 59000);
                        i3 = 1;
                        while (i3 <= iMin) {
                            j5 = ((long) i3) * j4;
                            i4 = iMin;
                            if (Math.min(j4, j3 - j5) < 1000) {
                                break;
                                break;
                            }
                            float f1613 = this.px + this.ph;
                            Track track18 = this.videoTrack;
                            float f1614 = f1613 + ((((((long) (track18.duration * track18.left)) + j5) - this.scroll) / f139) * this.sw);
                            canvas.drawRect(f1614, (this.h - this.py) - f12, f1614 + AndroidUtilities.dp(1.0f), this.h - this.py, this.regionPaint);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("#");
                            i3++;
                            sb3.append(i3);
                            canvas4.drawText(sb3.toString(), f1614 + AndroidUtilities.dp(2.0f), ((this.h - this.py) - f12) + AndroidUtilities.dp(14.0f), this.countTextPaint);
                            iMin = i4;
                            j4 = 59000;
                        }
                        canvas.restore();
                    }
                }
                f17 = this.loopProgress.set(0.0f);
                contentHeight = ((this.h - getContentHeight()) + this.py) - AndroidUtilities.dpf2(2.3f);
                fDpf2 = (this.h - this.py) + AndroidUtilities.dpf2(4.3f);
                if (f17 > 0.0f) {
                    j2 = this.loopProgressFrom;
                    if (j2 == -1) {
                        track4 = this.videoTrack;
                        if (track4 != null) {
                            f20 = track4.duration * track4.right;
                        } else {
                            track5 = this.collageMain;
                            if (track5 != null) {
                                f20 = track5.duration * (track5.right - track5.left);
                            } else {
                                if (this.hasRound) {
                                    f18 = this.roundDuration;
                                    f19 = this.roundRight;
                                } else {
                                    f18 = this.audioDuration;
                                    f19 = this.audioRight;
                                }
                                j2 = (long) (f18 * f19);
                            }
                        }
                        j2 = (long) f20;
                    }
                    drawProgress(canvas, contentHeight, fDpf2, j2, f17 * fMax3);
                }
                drawProgress(canvas, contentHeight, fDpf2, this.progress, (1.0f - f17) * fMax3);
            }
            if (z) {
                canvas.restore();
            }
        } else {
            j = jMin;
        }
        if (this.dragged) {
            float f170 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float fDp3 = (AndroidUtilities.dp(32.0f) / this.sw) * j * f170;
            float f171 = this.dragSpeed;
            long j15 = (long) (fDp3 * f171);
            if (this.isCover) {
                this.dragSpeed = f171 + (f170 * 0.25f);
            }
            int i27 = this.pressHandle;
            if (i27 == 4 && (track2 = this.videoTrack) != null) {
                float f172 = track2.left;
                long j16 = this.scroll;
                long j17 = track2.duration;
                float f173 = j17;
                if (f172 < j16 / f173) {
                    i2 = -1;
                } else if (track2.right > (j16 + j) / f173) {
                    i2 = 1;
                } else {
                    this.dragSpeed = 1.0f;
                    i2 = 0;
                }
                long j18 = ((long) i2) * j15;
                long jClamp = Utilities.clamp(j16 + j18, j17 - j, 0L);
                this.scroll = jClamp;
                this.progress += j18;
                Track track19 = this.videoTrack;
                float f174 = (jClamp - j16) / track19.duration;
                if (f174 > 0.0f) {
                    f = 1.0f;
                    fMax2 = Math.min(1.0f - track19.right, f174);
                } else {
                    f = 1.0f;
                    fMax2 = Math.max(0.0f - track19.left, f174);
                }
                Track track20 = this.videoTrack;
                track20.left = Utilities.clamp(track20.left + fMax2, f, 0.0f);
                Track track21 = this.videoTrack;
                track21.right = Utilities.clamp(track21.right + fMax2, f, 0.0f);
                TimelineDelegate timelineDelegate = this.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onVideoLeftChange(false, this.videoTrack.left);
                    this.delegate.onVideoRightChange(false, this.videoTrack.right);
                }
                invalidate();
            } else if (i27 == 8) {
                float f175 = this.audioLeft;
                long j19 = this.audioOffset;
                long j20 = -j19;
                float f176 = 100 + j20;
                long j21 = this.audioDuration;
                float f177 = j21;
                if (f175 < f176 / f177) {
                    i = -1;
                } else if (this.audioRight >= ((j20 + j) - 100) / f177) {
                    i = 1;
                } else {
                    this.dragSpeed = 1.0f;
                    i = 0;
                }
                if (i != 0) {
                    if (this.audioSelected && (track = this.videoTrack) != null) {
                        long j22 = j19 - (((long) i) * j15);
                        float f178 = track.right;
                        float f179 = track.duration;
                        this.audioOffset = Utilities.clamp(j22, (long) ((f178 * f179) - (f175 * f177)), (long) ((track.left * f179) - (this.audioRight * f177)));
                    } else if (this.roundSelected && this.hasRound) {
                        long j23 = j19 - (((long) i) * j15);
                        float f180 = this.roundRight;
                        float f181 = this.roundDuration;
                        this.audioOffset = Utilities.clamp(j23, (long) ((f180 * f181) - (f175 * f177)), (long) ((this.roundLeft * f181) - (this.audioRight * f177)));
                    } else {
                        this.audioOffset = Utilities.clamp(j19 - (((long) i) * j15), 0L, -(j21 - Math.min(getBaseDuration(), getMaxScrollDuration())));
                    }
                    float f182 = (-(this.audioOffset - j19)) / this.audioDuration;
                    if (f182 > 0.0f) {
                        fMax = Math.min(1.0f - this.audioRight, f182);
                    } else {
                        fMax = Math.max(0.0f - this.audioLeft, f182);
                    }
                    if (this.videoTrack == null) {
                        float f183 = this.progress;
                        float f184 = this.audioDuration;
                        this.progress = (long) Utilities.clamp(f183 + (fMax * f184), f184, 0.0f);
                    }
                    this.audioLeft = Utilities.clamp(this.audioLeft + fMax, 1.0f, 0.0f);
                    this.audioRight = Utilities.clamp(this.audioRight + fMax, 1.0f, 0.0f);
                    TimelineDelegate timelineDelegate2 = this.delegate;
                    if (timelineDelegate2 != null) {
                        timelineDelegate2.onAudioLeftChange(this.audioLeft);
                        this.delegate.onAudioRightChange(this.audioRight);
                        this.delegate.onProgressChange(this.progress, false);
                    }
                    invalidate();
                } else {
                    this.dragSpeed = 1.0f;
                }
            } else {
                this.dragSpeed = 1.0f;
            }
        } else {
            this.dragSpeed = 1.0f;
        }
        int contentHeight2 = getContentHeight();
        if (this.lastHeight != contentHeight2) {
            this.lastHeight = contentHeight2;
            Runnable runnable = this.onHeightChange;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    private void drawRegion(Canvas canvas, Paint paint, float f, float f2, float f3, float f4, float f5) {
        if (f5 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f3 - AndroidUtilities.dp(10.0f), f, f4 + AndroidUtilities.dp(10.0f), f2);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.w, this.h, 255, 31);
        int i = (int) (255.0f * f5);
        this.regionPaint.setAlpha(i);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.regionPaint);
        rectF.inset(AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f), AndroidUtilities.dp(2.0f));
        if (this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.regionCutPaint);
        } else {
            canvas.drawRect(rectF, this.regionCutPaint);
        }
        float fDp = AndroidUtilities.dp(2.0f);
        float fDp2 = AndroidUtilities.dp(10.0f);
        Paint paint2 = paint != null ? paint : this.regionHandlePaint;
        this.regionHandlePaint.setAlpha(255);
        paint2.setAlpha(i);
        float f6 = f + f2;
        float f7 = (f6 - fDp2) / 2.0f;
        float f8 = (f6 + fDp2) / 2.0f;
        rectF.set(f3 - ((AndroidUtilities.dp(this.isCover ? 2.0f : 10.0f) - fDp) / 2.0f), f7, f3 - ((AndroidUtilities.dp(this.isCover ? 2.0f : 10.0f) + fDp) / 2.0f), f8);
        if (!this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null && !this.isCover) {
                this.regionHandlePaint.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.regionHandlePaint);
            }
        }
        rectF.set(f4 + ((AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f) - fDp) / 2.0f), f7, f4 + ((AndroidUtilities.dp(this.isCover ? 2.5f : 10.0f) + fDp) / 2.0f), f8);
        if (!this.isCover) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint2);
            if (paint != null) {
                this.regionHandlePaint.setAlpha((int) (f5 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), this.regionHandlePaint);
            }
        }
        canvas.restore();
    }

    private void drawProgress(Canvas canvas, float f, float f2, long j, float f3) {
        float f4;
        if (this.isCover) {
            return;
        }
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        float fClamp = Utilities.clamp(j, getBaseDuration(), 0L);
        Track track = this.collageMain;
        if (track != null) {
            f4 = track.offset + (track.left * track.duration);
        } else {
            f4 = this.videoTrack == null ? this.audioOffset : 0L;
        }
        float f5 = this.px + this.ph + (this.sw * (((fClamp + f4) - this.scroll) / jMin));
        float f6 = (((f2 - f) / 2.0f) / 2.0f) * (1.0f - f3);
        float f7 = f + f6;
        float f8 = f2 - f6;
        this.progressShadowPaint.setAlpha((int) (38.0f * f3));
        this.progressWhitePaint.setAlpha((int) (f3 * 255.0f));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f5 - AndroidUtilities.dpf2(1.5f), f7, AndroidUtilities.dpf2(1.5f) + f5, f8);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.progressShadowPaint);
        rectF.set(f5 - AndroidUtilities.dpf2(1.5f), f7, f5 + AndroidUtilities.dpf2(1.5f), f8);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.progressWhitePaint);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        this.audioAuthorPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.audioTitlePaint.setTextSize(AndroidUtilities.dp(12.0f));
        int iDp = AndroidUtilities.dp(12.0f);
        this.px = iDp;
        int iDp2 = AndroidUtilities.dp(5.0f);
        this.py = iDp2;
        setPadding(iDp, iDp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i);
        this.w = size;
        int iDp3 = AndroidUtilities.dp(heightDp());
        this.h = iDp3;
        setMeasuredDimension(size, iDp3);
        int iDp4 = AndroidUtilities.dp(10.0f);
        this.ph = iDp4;
        this.sw = (this.w - (iDp4 * 2)) - (this.px * 2);
        Track track = this.videoTrack;
        if (track != null && track.path != null && track.thumbs == null) {
            track.setupThumbs(false);
        }
        if (!this.collageTracks.isEmpty()) {
            for (Track track2 : this.collageTracks) {
                if (track2.path != null && track2.thumbs == null) {
                    track2.setupThumbs(false);
                    track2.setupWaveform(false);
                }
            }
        }
        if (this.audioPath == null || this.waveform != null) {
            return;
        }
        setupAudioWaveform();
    }

    class VideoThumbsLoader {
        private Path clipPath;
        private int count;
        private boolean destroyed;
        private long duration;
        private volatile int frameHeight;
        private volatile long frameIterator;
        private volatile int frameWidth;
        private final boolean isRound;
        private long nextFrame;
        private final ArrayList frames = new ArrayList();
        private boolean loading = false;
        private final Paint bitmapPaint = new Paint(3);
        private MediaMetadataRetriever metadataRetriever = new MediaMetadataRetriever();

        public VideoThumbsLoader(boolean z, final String str, final int i, final int i2, final Long l, final long j, final long j2, final long j3, final Runnable runnable) {
            this.isRound = z;
            Utilities.themeQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$0(str, l, j2, j3, i2, j, i, runnable);
                }
            });
        }

        public void lambda$new$0(String str, Long l, long j, long j2, int i, long j3, int i2, Runnable runnable) {
            int i3;
            int i4;
            long maxScrollDuration = TimelineView.this.getMaxScrollDuration();
            int i5 = 0;
            try {
                this.metadataRetriever.setDataSource(str);
                String strExtractMetadata = this.metadataRetriever.extractMetadata(9);
                if (strExtractMetadata != null) {
                    maxScrollDuration = Long.parseLong(strExtractMetadata);
                    this.duration = maxScrollDuration;
                }
                String strExtractMetadata2 = this.metadataRetriever.extractMetadata(18);
                i3 = strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : 0;
                try {
                    String strExtractMetadata3 = this.metadataRetriever.extractMetadata(19);
                    i5 = strExtractMetadata3 != null ? Integer.parseInt(strExtractMetadata3) : 0;
                    String strExtractMetadata4 = this.metadataRetriever.extractMetadata(24);
                    if (strExtractMetadata4 == null || ((i4 = Integer.parseInt(strExtractMetadata4)) != 90 && i4 != 270)) {
                        int i6 = i3;
                        i3 = i5;
                        i5 = i6;
                    }
                } catch (Exception e) {
                    e = e;
                    this.metadataRetriever = null;
                    FileLog.e(e);
                }
            } catch (Exception e2) {
                e = e2;
                i3 = 0;
            }
            if (l != null) {
                maxScrollDuration = l.longValue();
                this.duration = maxScrollDuration;
            }
            if (j != -1 && j2 != -1) {
                maxScrollDuration = j2 - j;
            }
            float fClamp = Utilities.clamp((i5 == 0 || i3 == 0) ? 1.0f : i5 / i3, 1.3333334f, 0.5625f);
            this.frameHeight = Math.max(1, i);
            this.frameWidth = Math.max(1, (int) Math.ceil(i * fClamp));
            int iCeil = (int) Math.ceil(((Math.max(maxScrollDuration, j3) / j3) * i2) / this.frameWidth);
            this.count = iCeil;
            this.frameIterator = (long) (maxScrollDuration / iCeil);
            this.nextFrame = -this.frameIterator;
            if (j != -1) {
                this.nextFrame = j - this.frameIterator;
            }
            load();
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
        }

        public int getFrameWidth() {
            return this.frameWidth;
        }

        public long getDuration() {
            return this.duration;
        }

        public void load() {
            if (this.loading || this.metadataRetriever == null || this.frames.size() >= this.count) {
                return;
            }
            this.loading = true;
            this.nextFrame += this.frameIterator;
            Utilities.themeQueue.cancelRunnable(new TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda0(this));
            Utilities.themeQueue.postRunnable(new TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda0(this));
        }

        public void retrieveFrame() {
            MediaMetadataRetriever mediaMetadataRetriever = this.metadataRetriever;
            if (mediaMetadataRetriever == null) {
                return;
            }
            final Bitmap frameAtTime = null;
            try {
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(this.nextFrame * 1000, 2);
                if (frameAtTime != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.frameWidth, this.frameHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    float fMax = Math.max(this.frameWidth / frameAtTime.getWidth(), this.frameHeight / frameAtTime.getHeight());
                    Rect rect = new Rect(0, 0, frameAtTime.getWidth(), frameAtTime.getHeight());
                    Rect rect2 = new Rect((int) ((bitmapCreateBitmap.getWidth() - (frameAtTime.getWidth() * fMax)) / 2.0f), (int) ((bitmapCreateBitmap.getHeight() - (frameAtTime.getHeight() * fMax)) / 2.0f), (int) ((bitmapCreateBitmap.getWidth() + (frameAtTime.getWidth() * fMax)) / 2.0f), (int) ((bitmapCreateBitmap.getHeight() + (frameAtTime.getHeight() * fMax)) / 2.0f));
                    if (this.isRound) {
                        if (this.clipPath == null) {
                            this.clipPath = new Path();
                        }
                        this.clipPath.rewind();
                        this.clipPath.addCircle(this.frameWidth / 2.0f, this.frameHeight / 2.0f, Math.min(this.frameWidth, this.frameHeight) / 2.0f, Path.Direction.CW);
                        canvas.clipPath(this.clipPath);
                    }
                    canvas.drawBitmap(frameAtTime, rect, rect2, this.bitmapPaint);
                    frameAtTime.recycle();
                    frameAtTime = bitmapCreateBitmap;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$retrieveFrame$1(frameAtTime);
                }
            });
        }

        public void lambda$retrieveFrame$1(Bitmap bitmap) {
            if (!this.loading || this.destroyed) {
                return;
            }
            this.frames.add(new BitmapFrame(bitmap));
            this.loading = false;
            TimelineView.this.invalidate();
        }

        public void destroy() {
            this.destroyed = true;
            Utilities.themeQueue.cancelRunnable(new TimelineView$VideoThumbsLoader$$ExternalSyntheticLambda0(this));
            Iterator it = this.frames.iterator();
            while (it.hasNext()) {
                Bitmap bitmap = ((BitmapFrame) it.next()).bitmap;
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

        public class BitmapFrame {
            private final AnimatedFloat alpha;
            public Bitmap bitmap;

            public BitmapFrame(Bitmap bitmap) {
                this.alpha = new AnimatedFloat(0.0f, TimelineView.this, 0L, 240L, CubicBezierInterpolator.EASE_OUT_QUINT);
                this.bitmap = bitmap;
            }

            public float getAlpha() {
                return this.alpha.set(1.0f);
            }
        }
    }

    class AudioWaveformLoader {
        private final AnimatedFloat animatedLoaded;
        private final int count;
        private final short[] data;
        private long duration;
        private final MediaExtractor extractor;
        private MediaFormat inputFormat;
        private short max;
        private FfmpegAudioWaveformLoader waveformLoader;
        private int loaded = 0;
        private final Object lock = new Object();
        private boolean stop = false;

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
            int iMin = Math.min(Math.round((((this.duration * 1000) / Math.min(TimelineView.this.videoTrack != null ? TimelineView.this.videoTrack.duration : !TimelineView.this.collageTracks.isEmpty() ? TimelineView.this.getBaseDuration() : TimelineView.this.hasRound ? TimelineView.this.roundDuration : this.duration * 1000, TimelineView.this.getMaxScrollDuration())) * i) / Math.round(AndroidUtilities.dpf2(3.3333f))), 4000);
            this.count = iMin;
            this.data = new short[iMin];
            if (this.duration <= 0 || this.inputFormat == null) {
                return;
            }
            if ("audio/mpeg".equals(string) || "audio/mp3".equals(string) || "audio/mp4a".equals(string) || "audio/mp4a-latm".equals(string)) {
                this.waveformLoader = new FfmpegAudioWaveformLoader(str, iMin, new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        this.f$0.lambda$run$0((short[]) obj, ((Integer) obj2).intValue());
                    }
                });
            } else {
                Utilities.phoneBookQueue.postRunnable(new TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0(this));
            }
        }

        public void run() {
            short s;
            try {
                int iRound = Math.round(((this.duration * ((long) this.inputFormat.getInteger("sample-rate"))) / this.count) / 5.0f);
                MediaCodec mediaCodecCreateDecoderByType = MediaCodec.createDecoderByType(this.inputFormat.getString("mime"));
                if (mediaCodecCreateDecoderByType == null) {
                    return;
                }
                mediaCodecCreateDecoderByType.configure(this.inputFormat, (Surface) null, (MediaCrypto) null, 0);
                mediaCodecCreateDecoderByType.start();
                mediaCodecCreateDecoderByType.getInputBuffers();
                mediaCodecCreateDecoderByType.getOutputBuffers();
                short[] sArr = new short[32];
                int iDequeueOutputBuffer = -1;
                int i = 0;
                boolean z = false;
                int i2 = 0;
                int i3 = 0;
                short s2 = 0;
                do {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(2500L);
                    if (iDequeueInputBuffer >= 0) {
                        int sampleData = this.extractor.readSampleData(mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer), 0);
                        if (sampleData < 0) {
                            mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                            z = true;
                        } else {
                            mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.extractor.getSampleTime(), 0);
                            this.extractor.advance();
                        }
                    }
                    if (iDequeueOutputBuffer >= 0) {
                        mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer).position(0);
                    }
                    iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                    while (true) {
                        if (iDequeueOutputBuffer == -1 || z) {
                            sArr = sArr;
                            break;
                        }
                        if (iDequeueOutputBuffer >= 0) {
                            ByteBuffer outputBuffer = mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer);
                            if (outputBuffer != null && bufferInfo.size > 0) {
                                int i4 = i3;
                                final short[] sArr2 = sArr;
                                while (true) {
                                    if (outputBuffer.remaining() > 0) {
                                        short s3 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                        if (i4 >= iRound) {
                                            sArr2[i - i2] = s2;
                                            i++;
                                            final int i5 = i - i2;
                                            if (i5 >= sArr2.length || i >= this.count) {
                                                short[] sArr3 = new short[sArr2.length];
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        this.f$0.lambda$run$0(sArr2, i5);
                                                    }
                                                });
                                                sArr = sArr3;
                                                i2 = i;
                                            } else {
                                                sArr = sArr2;
                                            }
                                            if (i >= this.data.length) {
                                                i3 = 0;
                                                s2 = 0;
                                                break;
                                            } else {
                                                sArr2 = sArr;
                                                i4 = 0;
                                                s = 0;
                                            }
                                        } else {
                                            s = s2;
                                        }
                                        s2 = s < s3 ? s3 : s;
                                        i4++;
                                        if (outputBuffer.remaining() >= 8) {
                                            outputBuffer.position(outputBuffer.position() + 8);
                                        }
                                    }
                                    i3 = i4;
                                    sArr = sArr2;
                                    break;
                                }
                            }
                            mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            if ((bufferInfo.flags & 4) != 0) {
                                sArr = sArr;
                                z = true;
                                break;
                            }
                        } else if (iDequeueOutputBuffer == -3) {
                            mediaCodecCreateDecoderByType.getOutputBuffers();
                        }
                        iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                    }
                    synchronized (this.lock) {
                        try {
                            if (!this.stop) {
                                if (z) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (i < this.count);
                mediaCodecCreateDecoderByType.stop();
                mediaCodecCreateDecoderByType.release();
                this.extractor.release();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$run$0(short[] sArr, int i) {
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

        public void destroy() {
            FfmpegAudioWaveformLoader ffmpegAudioWaveformLoader = this.waveformLoader;
            if (ffmpegAudioWaveformLoader != null) {
                ffmpegAudioWaveformLoader.destroy();
            }
            Utilities.phoneBookQueue.cancelRunnable(new TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0(this));
            synchronized (this.lock) {
                this.stop = true;
            }
        }

        public short getMaxBar() {
            return this.max;
        }

        public short getBar(int i) {
            return this.data[i];
        }

        public int getLoadedCount() {
            return this.loaded;
        }

        public int getCount() {
            return this.count;
        }
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(this.py + AndroidUtilities.dp(28.0f) + this.py, getContentHeight(), this.openT.get());
    }

    public int getContentHeight() {
        float fDp = 0.0f;
        float videoHeight = this.py + (this.videoTrack != null ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.collageTracks.isEmpty() ? 0.0f : getCollageHeight() + AndroidUtilities.dp(4.0f)) + (this.hasRound ? getRoundHeight() + AndroidUtilities.dp(4.0f) : 0.0f);
        if (this.hasAudio) {
            fDp = AndroidUtilities.dp(4.0f) + getAudioHeight();
        }
        return (int) (videoHeight + fDp + this.py);
    }
}

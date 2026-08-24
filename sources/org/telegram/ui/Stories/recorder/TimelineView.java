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
                            TimelineView.Track.m4661$r8$lambda$5nKwQ2tgX4hRgpG5diUTp4Qn7g(this.f$0);
                        }
                    });
                }
            }
        }

        public static void m4661$r8$lambda$5nKwQ2tgX4hRgpG5diUTp4Qn7g(Track track) {
            VideoThumbsLoader videoThumbsLoader = track.thumbs;
            if (videoThumbsLoader == null || videoThumbsLoader.getDuration() <= 0) {
                return;
            }
            track.duration = track.thumbs.getDuration();
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
                TimelineView.$r8$lambda$3xfpuv3NLYw_7m5eQR4XDlX9AVw(this.f$0, viewGroup, resourcesProvider, blurManager, view);
            }
        };
    }

    public static void $r8$lambda$3xfpuv3NLYw_7m5eQR4XDlX9AVw(final TimelineView timelineView, ViewGroup viewGroup, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager, View view) {
        int i;
        int i2 = timelineView.pressType;
        try {
            if (i2 == 2 && timelineView.hasAudio) {
                SliderView onValueChange = new SliderView(timelineView.getContext(), 0).setMinMax(0.0f, 1.5f).setValue(timelineView.audioVolume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        TimelineView.$r8$lambda$7j3DKEqbZxbFm4cHs9YxhnORcSQ(this.f$0, (Float) obj);
                    }
                });
                long jMin = Math.min(timelineView.getBaseDuration(), timelineView.getMaxScrollDuration());
                int i3 = timelineView.w;
                int i4 = timelineView.px;
                int i5 = timelineView.ph;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, timelineView).addView(onValueChange).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new Runnable() {
                    @Override
                    public final void run() {
                        TimelineView.m4658$r8$lambda$kx2RWR0HuGWZWCMCnhKwT75y4(this.f$0);
                    }
                }).setGravity(5).forceTop(true).translate((-(timelineView.w - Math.min((i3 - i4) - i5, (i4 + i5) + ((((timelineView.audioOffset - timelineView.scroll) + (AndroidUtilities.lerp(timelineView.audioRight, 1.0f, timelineView.audioSelectedT.get()) * timelineView.audioDuration)) / jMin) * timelineView.sw)))) + AndroidUtilities.dp(18.0f), timelineView.audioBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                timelineView.performHapticFeedback(0, 1);
                return;
            }
            if (i2 == 1 && timelineView.hasRound) {
                SliderView onValueChange2 = new SliderView(timelineView.getContext(), 0).setMinMax(0.0f, 1.5f).setValue(timelineView.roundVolume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        TimelineView.m4657$r8$lambda$cGqD5y3W4FcwjXr1H28Dw0Gpno(this.f$0, (Float) obj);
                    }
                });
                long jMin2 = Math.min(timelineView.getBaseDuration(), timelineView.getMaxScrollDuration());
                int i6 = timelineView.w;
                int i7 = timelineView.px;
                int i8 = timelineView.ph;
                ItemOptions.makeOptions(viewGroup, resourcesProvider, timelineView).addView(onValueChange2).addSpaceGap().add(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new Runnable() {
                    @Override
                    public final void run() {
                        TimelineView.$r8$lambda$G8ujk_cWeaysCw6dOFM32DyUvr0(this.f$0);
                    }
                }).setGravity(5).forceTop(true).translate((-(timelineView.w - Math.min((i6 - i7) - i8, (i7 + i8) + ((((timelineView.roundOffset - timelineView.scroll) + (AndroidUtilities.lerp(timelineView.roundRight, 1.0f, timelineView.roundSelectedT.get()) * timelineView.roundDuration)) / jMin2) * timelineView.sw)))) + AndroidUtilities.dp(18.0f), timelineView.roundBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                timelineView.performHapticFeedback(0, 1);
                return;
            }
            if (i2 == 0 && timelineView.videoTrack != null) {
                ItemOptions.makeOptions(viewGroup, resourcesProvider, timelineView).addView(new SliderView(timelineView.getContext(), 0).setMinMax(0.0f, 1.5f).setValue(timelineView.videoTrack.volume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        TimelineView.m4659$r8$lambda$lokWYyMBVmGgLaI60HGFVf3AAg(this.f$0, (Float) obj);
                    }
                })).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), timelineView.videoBounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                timelineView.performHapticFeedback(0, 1);
            } else {
                if (i2 != 3 || (i = timelineView.pressCollageIndex) < 0 || i >= timelineView.collageTracks.size()) {
                    return;
                }
                final Track track = (Track) timelineView.collageTracks.get(timelineView.pressCollageIndex);
                ItemOptions.makeOptions(viewGroup, resourcesProvider, timelineView).addView(new SliderView(timelineView.getContext(), 0).setMinMax(0.0f, 1.5f).setValue(track.volume).setOnValueChange(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        TimelineView.$r8$lambda$hR6yXxbyw7j0f7kSfKmENclw7Qw(this.f$0, track, (Float) obj);
                    }
                })).setGravity(5).forceTop(true).translate(AndroidUtilities.dp(18.0f), track.bounds.top).show().setBlurBackground(blurManager, -view.getX(), -view.getY());
                timelineView.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    public static void $r8$lambda$7j3DKEqbZxbFm4cHs9YxhnORcSQ(TimelineView timelineView, Float f) {
        timelineView.getClass();
        timelineView.audioVolume = f.floatValue();
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onAudioVolumeChange(f.floatValue());
        }
    }

    public static void m4658$r8$lambda$kx2RWR0HuGWZWCMCnhKwT75y4(TimelineView timelineView) {
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onAudioRemove();
        }
    }

    public static void m4657$r8$lambda$cGqD5y3W4FcwjXr1H28Dw0Gpno(TimelineView timelineView, Float f) {
        timelineView.getClass();
        timelineView.roundVolume = f.floatValue();
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onRoundVolumeChange(f.floatValue());
        }
    }

    public static void $r8$lambda$G8ujk_cWeaysCw6dOFM32DyUvr0(TimelineView timelineView) {
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onRoundRemove();
        }
    }

    public static void m4659$r8$lambda$lokWYyMBVmGgLaI60HGFVf3AAg(TimelineView timelineView, Float f) {
        timelineView.videoTrack.volume = f.floatValue();
        TimelineDelegate timelineDelegate = timelineView.delegate;
        if (timelineDelegate != null) {
            timelineDelegate.onVideoVolumeChange(f.floatValue());
        }
    }

    public static void $r8$lambda$hR6yXxbyw7j0f7kSfKmENclw7Qw(TimelineView timelineView, Track track, Float f) {
        timelineView.getClass();
        track.volume = f.floatValue();
        TimelineDelegate timelineDelegate = timelineView.delegate;
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

    public static int $r8$lambda$CcgHyMQkOAL1CJP_zrgPRlX6yxQ(Track track, Track track2) {
        return (int) (track2.duration - track.duration);
    }

    public void sortCollage() {
        Collections.sort(this.collageTracks, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return TimelineView.$r8$lambda$CcgHyMQkOAL1CJP_zrgPRlX6yxQ((TimelineView.Track) obj, (TimelineView.Track) obj2);
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
                    TimelineView.$r8$lambda$VKEvP7BMWSMm0sA52g6r4hpygfg(this.f$0);
                }
            });
        }
    }

    public static void $r8$lambda$VKEvP7BMWSMm0sA52g6r4hpygfg(TimelineView timelineView) {
        VideoThumbsLoader videoThumbsLoader = timelineView.roundThumbs;
        if (videoThumbsLoader == null || videoThumbsLoader.getDuration() <= 0) {
            return;
        }
        timelineView.roundDuration = timelineView.roundThumbs.getDuration();
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
        int i;
        int i2;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jMin = Math.min(getBaseDuration(), getMaxScrollDuration());
        float fClamp = Utilities.clamp(this.progress, getBaseDuration(), 0L);
        Track track = this.collageMain;
        float f = jMin;
        float f2 = this.px + this.ph + (this.sw * (((fClamp + (track != null ? track.offset + (track.left * track.duration) : this.videoTrack == null ? this.audioOffset : 0L)) - this.scroll) / f));
        if (!this.isCover && x >= f2 - AndroidUtilities.dp(12.0f) && x <= f2 + AndroidUtilities.dp(12.0f)) {
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
            for (int i3 = 0; i3 < this.collageTracks.size(); i3++) {
                Track track2 = (Track) this.collageTracks.get(i3);
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
                    float f10 = (((f4 + (track2.right * f8)) / f) * f5) + f3;
                    float f11 = f3 + (((j + j2) / f) * f5);
                    this.pressHandleCollageIndex = i3;
                    if (x >= f9 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f9) {
                        return 13;
                    }
                    if (x >= f10 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f10) {
                        return 14;
                    }
                    if (x < f9 || x > f10 || (track2.left <= 0.01f && track2.right >= 0.99f)) {
                        return (x < f6 || x > f11) ? -1 : 16;
                    }
                    return 15;
                }
            }
            i = 1;
            i2 = -1;
        } else {
            i = 1;
            i2 = -1;
            if (z2) {
                float f12 = this.px + this.ph;
                Track track3 = this.videoTrack;
                float f13 = track3.left;
                float f14 = track3.duration;
                float f15 = this.scroll;
                float f16 = this.sw;
                float f17 = ((((f13 * f14) - f15) / f) * f16) + f12;
                float f18 = f12 + ((((track3.right * f14) - f15) / f) * f16);
                if (this.isCover) {
                    return (getBaseDuration() < getMaxScrollDuration() || (x >= f17 - ((float) AndroidUtilities.dp(15.0f)) && x <= f18 + ((float) AndroidUtilities.dp(15.0f)))) ? 4 : 1;
                }
                if (x >= f17 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f17) {
                    return 2;
                }
                if (x >= f18 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f18) {
                    return 3;
                }
                if (x >= f17 && x <= f18) {
                    Track track4 = this.videoTrack;
                    if (track4.left > 0.01f || track4.right < 0.99f) {
                        return 4;
                    }
                }
            } else if (z) {
                float f19 = this.px + this.ph;
                float f20 = this.roundOffset;
                float f21 = this.roundLeft;
                float f22 = this.roundDuration;
                float f23 = this.scroll;
                float f24 = this.sw;
                float f25 = (((((f21 * f22) + f20) - f23) / f) * f24) + f19;
                float f26 = f19 + ((((f20 + (this.roundRight * f22)) - f23) / f) * f24);
                if (this.roundSelected || this.videoTrack == null) {
                    if (x >= f25 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f25) {
                        return 10;
                    }
                    if (x >= f26 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f26) {
                        return 11;
                    }
                    if (x >= f25 && x <= f26) {
                        return this.videoTrack == null ? 12 : 9;
                    }
                    float f27 = this.px + this.ph;
                    long j3 = this.roundOffset;
                    long j4 = this.scroll;
                    float f28 = this.sw;
                    float f29 = (((j3 - j4) / f) * f28) + f27;
                    f26 = f27 + ((((j3 + this.roundDuration) - j4) / f) * f28);
                    f25 = f29;
                }
                if (x >= f25 && x <= f26) {
                    return 9;
                }
            } else if (this.hasAudio) {
                float f30 = this.px + this.ph;
                float f31 = this.audioOffset;
                float f32 = this.audioLeft;
                float f33 = this.audioDuration;
                float f34 = this.scroll;
                float f35 = this.sw;
                float f36 = (((((f32 * f33) + f31) - f34) / f) * f35) + f30;
                float f37 = f30 + ((((f31 + (this.audioRight * f33)) - f34) / f) * f35);
                if (this.audioSelected || (this.videoTrack == null && !this.hasRound)) {
                    if (x >= f36 - AndroidUtilities.dp(15.0f) && x <= AndroidUtilities.dp(5.0f) + f36) {
                        return 6;
                    }
                    if (x >= f37 - AndroidUtilities.dp(5.0f) && x <= AndroidUtilities.dp(15.0f) + f37) {
                        return 7;
                    }
                    if (x >= f36 && x <= f37) {
                        return this.videoTrack == null ? 8 : 5;
                    }
                    float f38 = this.px + this.ph;
                    long j5 = this.audioOffset;
                    long j6 = this.scroll;
                    float f39 = this.sw;
                    float f40 = (((j5 - j6) / f) * f39) + f38;
                    f37 = f38 + ((((j5 + this.audioDuration) - j6) / f) * f39);
                    f36 = f40;
                }
                if (x >= f36 && x <= f37) {
                    return 5;
                }
            }
        }
        Track track5 = this.videoTrack;
        return (track5 == null || track5.duration <= getMaxScrollDuration() || !z2) ? i2 : i;
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
                TimelineView.$r8$lambda$LB5xKJ5UqtqxrxGlddx1Rq3Q_M0(this.f$0, jClamp);
            }
        };
        this.askExactSeek = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 150L);
        return true;
    }

    public static void $r8$lambda$LB5xKJ5UqtqxrxGlddx1Rq3Q_M0(TimelineView timelineView, long j) {
        TimelineDelegate timelineDelegate = timelineView.delegate;
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
        float f;
        float f2;
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
        float f3;
        float f4;
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
                float f5 = roundHeight;
                if (motionEvent.getY() < f5 && motionEvent.getY() > (f5 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                    this.pressType = 0;
                }
                roundHeight = (int) (f5 - (getVideoHeight() + AndroidUtilities.dp(4.0f)));
            }
            if (this.pressType == -1 && !this.collageTracks.isEmpty()) {
                int i3 = 0;
                while (true) {
                    if (i3 >= this.collageTracks.size()) {
                        f3 = 4.0f;
                        f4 = 2.0f;
                        break;
                    }
                    f3 = 4.0f;
                    float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((Track) this.collageTracks.get(i3)).selectedT.get());
                    float f6 = roundHeight;
                    if (motionEvent.getY() < f6) {
                        f4 = 2.0f;
                        if (motionEvent.getY() > (f6 - fLerp) - AndroidUtilities.dp(2.0f)) {
                            this.pressType = 3;
                            this.pressCollageIndex = i3;
                            break;
                        }
                    }
                    roundHeight = (int) (f6 - (fLerp + AndroidUtilities.dp(4.0f)));
                    i3++;
                }
            } else {
                f3 = 4.0f;
                f4 = 2.0f;
                break;
            }
            if (this.pressType == -1 && this.hasRound) {
                float f7 = roundHeight;
                if (motionEvent.getY() < f7 && motionEvent.getY() > (f7 - getRoundHeight()) - AndroidUtilities.dp(f4)) {
                    this.pressType = 1;
                }
                roundHeight = (int) (f7 - (getRoundHeight() + AndroidUtilities.dp(f3)));
            }
            if (this.pressType == -1 && this.hasAudio) {
                float f8 = roundHeight;
                if (motionEvent.getY() < f8 && motionEvent.getY() > (f8 - getAudioHeight()) - AndroidUtilities.dp(f4)) {
                    this.pressType = 2;
                }
                getAudioHeight();
                AndroidUtilities.dp(f3);
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
                    float f9 = x / this.sw;
                    float f10 = track.duration;
                    float f11 = f9 * (jMin / f10);
                    if (i2 == 2) {
                        track.left = Utilities.clamp(track.left + f11, track.right - (1000.0f / f10), 0.0f);
                        TimelineDelegate timelineDelegate3 = this.delegate;
                        if (timelineDelegate3 != null) {
                            timelineDelegate3.onVideoLeftChange(false, this.videoTrack.left);
                        }
                        Track track2 = this.videoTrack;
                        float f12 = track2.right - track2.left;
                        float fMaxSelectDuration = maxSelectDuration();
                        Track track3 = this.videoTrack;
                        if (f12 > fMaxSelectDuration / track3.duration) {
                            track3.right = Math.min(1.0f, track3.left + (maxSelectDuration() / this.videoTrack.duration));
                            TimelineDelegate timelineDelegate4 = this.delegate;
                            if (timelineDelegate4 != null) {
                                timelineDelegate4.onVideoRightChange(false, this.videoTrack.right);
                            }
                        }
                    } else if (i2 == 3) {
                        track.right = Utilities.clamp(track.right + f11, 1.0f, track.left + (1000.0f / f10));
                        TimelineDelegate timelineDelegate5 = this.delegate;
                        if (timelineDelegate5 != null) {
                            timelineDelegate5.onVideoRightChange(false, this.videoTrack.right);
                        }
                        Track track4 = this.videoTrack;
                        float f13 = track4.right - track4.left;
                        float fMaxSelectDuration2 = maxSelectDuration();
                        Track track5 = this.videoTrack;
                        if (f13 > fMaxSelectDuration2 / track5.duration) {
                            track5.left = Math.max(0.0f, track5.right - (maxSelectDuration() / this.videoTrack.duration));
                            TimelineDelegate timelineDelegate6 = this.delegate;
                            if (timelineDelegate6 != null) {
                                timelineDelegate6.onVideoLeftChange(false, this.videoTrack.left);
                            }
                        }
                    } else if (i2 == 4) {
                        if (f11 > 0.0f) {
                            fMax6 = Math.min(1.0f - track.right, f11);
                        } else {
                            fMax6 = Math.max(-track.left, f11);
                        }
                        Track track6 = this.videoTrack;
                        float f14 = track6.left + fMax6;
                        track6.left = f14;
                        track6.right += fMax6;
                        TimelineDelegate timelineDelegate7 = this.delegate;
                        if (timelineDelegate7 != null) {
                            timelineDelegate7.onVideoLeftChange(false, f14);
                            this.delegate.onVideoRightChange(false, this.videoTrack.right);
                        }
                    }
                    float f15 = this.progress;
                    Track track7 = this.videoTrack;
                    float f16 = track7.duration;
                    float f17 = f15 / f16;
                    float f18 = track7.left;
                    if (f17 < f18 || f17 > track7.right) {
                        long j6 = (long) (f18 * f16);
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
                        float f19 = (x / this.sw) * (jMin / this.audioDuration);
                        if (i5 == 6) {
                            float fMinAudioSelect = this.audioRight - (minAudioSelect() / this.audioDuration);
                            float fMax7 = Math.max(0L, this.scroll - this.audioOffset);
                            float f20 = this.audioDuration;
                            float f21 = fMax7 / f20;
                            Track track8 = this.videoTrack;
                            if (track8 != null) {
                                fMax2 = Math.max(f21, (((track8.left * track8.duration) + this.scroll) - this.audioOffset) / f20);
                            } else {
                                Track track9 = this.collageMain;
                                if (track9 != null) {
                                    fMax2 = Math.max(f21, (((track9.left * track9.duration) + this.scroll) - this.audioOffset) / f20);
                                } else if (this.hasRound) {
                                    fMax2 = Math.max(f21, (((this.roundLeft * this.roundDuration) + this.scroll) - this.audioOffset) / f20);
                                } else {
                                    fMax2 = Math.max(f21, this.audioRight - (maxSelectDuration() / this.audioDuration));
                                    if (!this.hadDragChange && f19 < 0.0f && this.audioLeft <= this.audioRight - (maxSelectDuration() / this.audioDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f22 = this.audioLeft;
                            float fClamp = Utilities.clamp(f22 + f19, fMinAudioSelect, fMax2);
                            this.audioLeft = fClamp;
                            if (Math.abs(f22 - fClamp) > 0.01f) {
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
                            float f23 = this.audioLeft;
                            float fMinAudioSelect2 = minAudioSelect();
                            float f24 = this.audioDuration;
                            float f25 = f23 + (fMinAudioSelect2 / f24);
                            Track track10 = this.videoTrack;
                            if (track10 != null) {
                                fMin = Math.min(fMin3, (((track10.right * track10.duration) + this.scroll) - this.audioOffset) / f24);
                            } else {
                                Track track11 = this.collageMain;
                                if (track11 != null) {
                                    fMin = Math.min(fMin3, (((track11.right * track11.duration) + this.scroll) - this.audioOffset) / f24);
                                } else if (this.hasRound) {
                                    fMin = Math.min(fMin3, (((this.roundRight * this.roundDuration) + this.scroll) - this.audioOffset) / f24);
                                } else {
                                    fMin = Math.min(fMin3, this.audioLeft + (maxSelectDuration() / this.audioDuration));
                                    if (!this.hadDragChange && f19 > 0.0f && this.audioRight >= this.audioLeft + (maxSelectDuration() / this.audioDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f26 = this.audioRight;
                            float fClamp2 = Utilities.clamp(f26 + f19, fMin, f25);
                            this.audioRight = fClamp2;
                            if (Math.abs(f26 - fClamp2) > 0.01f) {
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
                            if (f19 > 0.0f) {
                                fMax = Math.min(Math.max(0.0f, fMin4 - this.audioRight), f19);
                            } else {
                                fMax = Math.max(Math.min(0.0f, fMax8 - this.audioLeft), f19);
                            }
                            float f27 = this.audioLeft + fMax;
                            this.audioLeft = f27;
                            this.audioRight += fMax;
                            TimelineDelegate timelineDelegate12 = this.delegate;
                            if (timelineDelegate12 != null) {
                                timelineDelegate12.onAudioLeftChange(f27);
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
                        float f28 = (x / this.sw) * (jMin / this.roundDuration);
                        if (i5 == 10) {
                            float fMinAudioSelect3 = this.roundRight - (minAudioSelect() / this.roundDuration);
                            float fMax9 = Math.max(0L, this.scroll - this.roundOffset);
                            float f29 = this.roundDuration;
                            float f30 = fMax9 / f29;
                            Track track12 = this.videoTrack;
                            if (track12 != null) {
                                fMax4 = Math.max(f30, (((track12.left * track12.duration) + this.scroll) - this.roundOffset) / f29);
                            } else {
                                Track track13 = this.collageMain;
                                if (track13 != null) {
                                    fMax4 = Math.max(f30, (((track13.left * track13.duration) + this.scroll) - this.roundOffset) / f29);
                                } else {
                                    fMax4 = Math.max(f30, this.roundRight - (maxSelectDuration() / this.roundDuration));
                                    if (!this.hadDragChange && f28 < 0.0f && this.roundLeft <= this.roundRight - (maxSelectDuration() / this.roundDuration)) {
                                        this.pressHandle = 8;
                                    }
                                }
                            }
                            float f31 = this.roundLeft;
                            float fClamp3 = Utilities.clamp(f31 + f28, fMinAudioSelect3, fMax4);
                            this.roundLeft = fClamp3;
                            if (Math.abs(f31 - fClamp3) > 0.01f) {
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
                            float f32 = this.roundLeft;
                            float fMinAudioSelect4 = minAudioSelect();
                            float f33 = this.roundDuration;
                            float f34 = f32 + (fMinAudioSelect4 / f33);
                            Track track14 = this.videoTrack;
                            if (track14 != null) {
                                fMin5 = Math.min(fMin5, (((track14.right * track14.duration) + this.scroll) - this.roundOffset) / f33);
                            }
                            Track track15 = this.collageMain;
                            if (track15 != null) {
                                fMin2 = Math.min(fMin5, (((track15.right * track15.duration) + this.scroll) - this.roundOffset) / this.roundDuration);
                            } else {
                                fMin2 = Math.min(fMin5, this.roundLeft + (maxSelectDuration() / this.roundDuration));
                                if (!this.hadDragChange && f28 > 0.0f && this.roundRight >= this.roundLeft + (maxSelectDuration() / this.roundDuration)) {
                                    this.pressHandle = 8;
                                }
                            }
                            float f35 = this.roundRight;
                            float fClamp4 = Utilities.clamp(f35 + f28, fMin2, f34);
                            this.roundRight = fClamp4;
                            if (Math.abs(f35 - fClamp4) > 0.01f) {
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
                            if (f28 > 0.0f) {
                                fMax3 = Math.min(fMin6 - this.roundRight, f28);
                            } else {
                                fMax3 = Math.max(fMax10 - this.roundLeft, f28);
                            }
                            float f36 = this.roundLeft + fMax3;
                            this.roundLeft = f36;
                            this.roundRight += fMax3;
                            TimelineDelegate timelineDelegate18 = this.delegate;
                            if (timelineDelegate18 != null) {
                                timelineDelegate18.onRoundLeftChange(f36);
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
                            float f37 = (x / this.sw) * (jMin / track16.duration);
                            int i7 = this.pressHandle;
                            if (i7 == 13) {
                                float fMinAudioSelect5 = track16.right - (minAudioSelect() / track16.duration);
                                float fMax11 = Math.max(0L, this.scroll - track16.offset) / track16.duration;
                                if (track16 == this.collageMain) {
                                    fMax11 = Math.max(fMax11, track16.right - (maxSelectDuration() / track16.duration));
                                    if (!this.hadDragChange && f37 < 0.0f && track16.left <= track16.right - (maxSelectDuration() / track16.duration)) {
                                        this.pressHandle = 15;
                                    }
                                }
                                float f38 = track16.left;
                                float fClamp5 = Utilities.clamp(f38 + f37, fMinAudioSelect5, fMax11);
                                track16.left = fClamp5;
                                if (Math.abs(f38 - fClamp5) > 0.01f) {
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
                                    if (!this.hadDragChange && f37 > 0.0f && track16.right >= track16.left + (maxSelectDuration() / track16.duration)) {
                                        this.pressHandle = 15;
                                    }
                                }
                                float f39 = track16.right;
                                float fClamp6 = Utilities.clamp(f39 + f37, fMin7, fMinAudioSelect6);
                                track16.right = fClamp6;
                                if (Math.abs(f39 - fClamp6) > 0.01f) {
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
                                if (f37 > 0.0f) {
                                    fMax5 = Math.min(fMin8 - track16.right, f37);
                                } else {
                                    fMax5 = Math.max(fMax12 - track16.left, f37);
                                }
                                float f40 = track16.left + fMax5;
                                track16.left = f40;
                                track16.right += fMax5;
                                TimelineDelegate timelineDelegate24 = this.delegate;
                                if (timelineDelegate24 != null) {
                                    timelineDelegate24.onVideoLeftChange(track16.index, f40);
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
                        float f41 = track17.right - track17.left;
                        track17.left = (jClamp / getBaseDuration()) * (1.0f - f41);
                        Track track18 = this.videoTrack;
                        float f42 = track18.left;
                        track18.right = f41 + f42;
                        TimelineDelegate timelineDelegate26 = this.delegate;
                        if (timelineDelegate26 != null) {
                            timelineDelegate26.onVideoLeftChange(true, f42);
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
                            float f43 = i15;
                            float f44 = jMin2;
                            float f45 = this.scroll / f44;
                            float f46 = this.sw;
                            int i16 = (int) ((f45 * f46) + f43);
                            int i17 = (int) (f43 + (((this.videoTrack.duration - jMin2) / f44) * f46));
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
                            float f47 = i18;
                            float f48 = jMin3;
                            float f49 = this.scroll / f48;
                            float f50 = this.sw;
                            int i19 = (int) ((f49 * f50) + f47);
                            int i20 = (int) (f47 + (((this.videoTrack.duration - jMin3) / f48) * f50));
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
                                float f51 = track19.right;
                                float f52 = track19.duration;
                                long j7 = this.audioDuration;
                                j2 = (long) ((f51 * f52) - 0);
                                f = track19.left * f52;
                                f2 = j7;
                            } else {
                                if (this.hasRound) {
                                    float f53 = this.roundRight;
                                    float f54 = this.roundDuration;
                                    long j8 = this.audioDuration;
                                    j2 = (long) ((f53 * f54) - 0);
                                    f = this.roundLeft * f54;
                                    f2 = j8;
                                } else {
                                    j = -(this.audioDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                    z2 = true;
                                    j2 = 0;
                                }
                                this.scrolling = z2;
                                Scroller scroller3 = this.scroller;
                                this.wasScrollX = i21;
                                float f55 = this.px + this.ph;
                                float f56 = this.sw;
                                scroller3.fling(i21, 0, xVelocity3, 0, (int) (((j / fMin9) * f56) + f55), (int) (f55 + ((j2 / fMin9) * f56)), 0, 0);
                                z = false;
                            }
                            j = (long) (f - f2);
                            z2 = true;
                            this.scrolling = z2;
                            Scroller scroller4 = this.scroller;
                            this.wasScrollX = i21;
                            float f57 = this.px + this.ph;
                            float f58 = this.sw;
                            scroller4.fling(i21, 0, xVelocity3, 0, (int) (((j / fMin9) * f58) + f57), (int) (f57 + ((j2 / fMin9) * f58)), 0, 0);
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
                                float f59 = track20.right;
                                float f60 = track20.duration;
                                j3 = (long) ((f59 * f60) - 0);
                                j4 = (long) ((track20.left * f60) - this.roundDuration);
                            } else {
                                j3 = 0;
                                j4 = -(this.roundDuration - Math.min(getBaseDuration(), getMaxScrollDuration()));
                            }
                            this.scrolling = true;
                            Scroller scroller5 = this.scroller;
                            this.wasScrollX = i22;
                            float f61 = this.px + this.ph;
                            float f62 = this.sw;
                            scroller5.fling(i22, 0, xVelocity4, 0, (int) (((j4 / fMin10) * f62) + f61), (int) (f61 + ((j3 / fMin10) * f62)), 0, 0);
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
            int iMin = Math.min(count - 1, (int) Math.ceil(((this.ph + f3) - f) / fRound));
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
        float f;
        float f2;
        int i;
        float fMax;
        Track track;
        Track track2;
        int i2;
        float f3;
        float fMax2;
        Canvas canvas2;
        boolean z;
        float f4;
        float f5;
        float f6;
        float videoHeight;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        double d;
        float f12;
        float fLerp;
        Canvas canvas3;
        int i3;
        float f13;
        float contentHeight;
        float fDpf2;
        long j;
        Track track3;
        Track track4;
        float f14;
        float f15;
        float f16;
        Track track5;
        float fLerp2;
        float f17;
        long j2;
        float fCenterY;
        float fMax3;
        float fDpf3;
        float f18;
        boolean z2;
        float f19;
        float f20;
        float fDpf4;
        boolean z3;
        float fMin;
        float fDpf5;
        BlurringShader.BlurManager blurManager;
        float fLerp3;
        float f21;
        float f22;
        float f23;
        boolean z4;
        float fLerp4;
        float fLerp5;
        float f24;
        boolean z5;
        float f25;
        BlurringShader.BlurManager blurManager2;
        TimelineView timelineView = this;
        Paint paint = timelineView.backgroundBlur.getPaint(1.0f);
        float f26 = timelineView.openT.set(timelineView.open);
        long jMin = Math.min(timelineView.getBaseDuration(), timelineView.getMaxScrollDuration());
        if (f26 < 1.0f) {
            f = 28.0f;
            f2 = 1.0f;
            timelineView.timelineBounds.set(timelineView.px, (timelineView.h - timelineView.py) - AndroidUtilities.dp(28.0f), timelineView.w - timelineView.px, timelineView.h - timelineView.py);
            timelineView.timelineClipPath.rewind();
            timelineView.timelineClipPath.addRoundRect(timelineView.timelineBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(timelineView.timelineBounds, (int) ((1.0f - f26) * 255.0f), 31);
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
                float f27 = timelineView.timelineWaveformMax.set(WaveformPath.getMaxBar(timelineView.collageWaveforms));
                float f28 = timelineView.px + timelineView.ph + (((timelineView.audioOffset - timelineView.scroll) / jMin) * timelineView.sw);
                WaveformPath waveformPath = timelineView.timelineWaveformPath;
                RectF rectF = timelineView.timelineBounds;
                waveformPath.check(f28, rectF.left, rectF.right, 0.0f, AndroidUtilities.dp(28.0f), f27, timelineView.timelineBounds.bottom, timelineView.collageWaveforms);
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
                float f29 = timelineView.timelineWaveformMax.set(WaveformPath.getMaxBar(timelineView.collageWaveforms));
                float f30 = timelineView.px + timelineView.ph + (((timelineView.audioOffset - timelineView.scroll) / jMin) * timelineView.sw);
                WaveformPath waveformPath2 = timelineView.timelineWaveformPath;
                RectF rectF2 = timelineView.timelineBounds;
                waveformPath2.check(f30, rectF2.left, rectF2.right, 0.0f, AndroidUtilities.dp(28.0f), f29, timelineView.timelineBounds.bottom, timelineView.collageWaveforms);
                canvas.drawPath(timelineView.timelineWaveformPath, paint2);
            }
            float currentWidth = ((timelineView.timelineText.getCurrentWidth() + AndroidUtilities.dp(3.66f)) + timelineView.timelineIcon.getIntrinsicWidth()) / 2.0f;
            int iCenterX = (int) (timelineView.timelineBounds.centerX() - currentWidth);
            int iCenterY = (int) timelineView.timelineBounds.centerY();
            Drawable drawable = timelineView.timelineIcon;
            drawable.setBounds(iCenterX, iCenterY - (drawable.getIntrinsicHeight() / 2), timelineView.timelineIcon.getIntrinsicWidth() + iCenterX, (timelineView.timelineIcon.getIntrinsicHeight() / 2) + iCenterY);
            timelineView.timelineIcon.setAlpha(191);
            timelineView.timelineIcon.draw(canvas);
            timelineView.timelineText.draw(canvas, (timelineView.timelineBounds.centerX() - currentWidth) + timelineView.timelineIcon.getIntrinsicWidth() + AndroidUtilities.dp(3.66f), iCenterY, -1, 0.75f);
            canvas.restore();
        } else {
            f = 28.0f;
            f2 = 1.0f;
        }
        if (f26 > 0.0f) {
            if (f26 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, timelineView.getWidth(), timelineView.getHeight(), (int) (f26 * 255.0f), 31);
                z = true;
            } else {
                canvas2 = canvas;
                z = false;
            }
            Track track6 = timelineView.videoTrack;
            float f31 = track6 != null ? 1.0f : 0.0f;
            if (track6 != null) {
                f4 = track6.selectedT.set((timelineView.audioSelected || timelineView.roundSelected) ? false : true);
            } else {
                f4 = 0.0f;
            }
            float f32 = timelineView.h - timelineView.py;
            float fDp = AndroidUtilities.dp(4.0f);
            float f33 = f4;
            float f34 = f31;
            if (timelineView.videoTrack != null) {
                canvas2.save();
                videoHeight = timelineView.getVideoHeight();
                Track track7 = timelineView.videoTrack;
                float f35 = track7.left;
                long j3 = track7.duration;
                float f36 = j3;
                float f37 = (f35 * f36 * f33) + 0.0f;
                f6 = (track7.right * f36 * f33) + 0.0f;
                float f38 = j3 <= 0 ? 0.0f : (timelineView.px + timelineView.ph) - ((timelineView.scroll / jMin) * timelineView.sw);
                int i4 = timelineView.ph;
                float f39 = i4;
                float f40 = f38 - f39;
                float f41 = (j3 <= 0 ? 0.0f : timelineView.px + i4 + (((j3 - timelineView.scroll) / jMin) * timelineView.sw)) + f39;
                timelineView.videoBounds.set(f40, f32 - videoHeight, f41, f32);
                float f42 = f32 - (videoHeight + (fDp * f34));
                RectF rectF3 = timelineView.videoBounds;
                float f43 = (rectF3.top * f33) + 0.0f;
                float f44 = (rectF3.bottom * f33) + 0.0f;
                timelineView.videoClipPath.rewind();
                timelineView.videoClipPath.addRoundRect(timelineView.videoBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(timelineView.videoClipPath);
                VideoThumbsLoader videoThumbsLoader = timelineView.videoTrack.thumbs;
                if (videoThumbsLoader != null) {
                    int frameWidth = videoThumbsLoader.getFrameWidth();
                    float f45 = frameWidth;
                    f25 = f42;
                    f7 = f44;
                    int iMax = (int) Math.max(0.0d, Math.floor((f40 - timelineView.px) / f45));
                    int iMin = (int) Math.min(timelineView.videoTrack.thumbs.count, Math.ceil(((f41 - f40) - timelineView.px) / f45) + 1.0d);
                    int i5 = (int) timelineView.videoBounds.top;
                    boolean z6 = timelineView.videoTrack.thumbs.frames.size() >= iMin;
                    boolean z7 = (frameWidth == 0 || !z6 || timelineView.videoTrack.isRound) ? false : true;
                    f8 = f43;
                    if (z7) {
                        for (int i6 = iMax; i6 < Math.min(timelineView.videoTrack.thumbs.frames.size(), iMin); i6++) {
                            if (((VideoThumbsLoader.BitmapFrame) timelineView.videoTrack.thumbs.frames.get(i6)).bitmap == null) {
                                z7 = false;
                                break;
                            }
                        }
                    }
                    if (!z7) {
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
                    if (frameWidth != 0) {
                        float f46 = f40;
                        for (int i7 = iMax; i7 < Math.min(timelineView.videoTrack.thumbs.frames.size(), iMin); i7++) {
                            VideoThumbsLoader.BitmapFrame bitmapFrame = (VideoThumbsLoader.BitmapFrame) timelineView.videoTrack.thumbs.frames.get(i7);
                            if (bitmapFrame.bitmap != null) {
                                timelineView.videoFramePaint.setAlpha((int) (bitmapFrame.getAlpha() * 255.0f));
                                Bitmap bitmap = bitmapFrame.bitmap;
                                canvas2.drawBitmap(bitmap, f46, i5 - ((int) ((bitmap.getHeight() - videoHeight) / 2.0f)), timelineView.videoFramePaint);
                            }
                            f46 += f45;
                        }
                    }
                    if (!z6) {
                        timelineView.videoTrack.thumbs.load();
                    }
                } else {
                    f25 = f42;
                    f7 = f44;
                    f8 = f43;
                }
                timelineView.selectedVideoClipPath.rewind();
                if (!timelineView.isCover) {
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    int i8 = timelineView.px;
                    int i9 = timelineView.ph;
                    float f47 = i8 + i9;
                    Track track8 = timelineView.videoTrack;
                    float f48 = track8.left;
                    float f49 = track8.duration;
                    float f50 = timelineView.scroll;
                    float f51 = jMin;
                    float f52 = ((f48 * f49) - f50) / f51;
                    float f53 = timelineView.sw;
                    float f54 = (f47 + (f52 * f53)) - (f48 <= 0.0f ? i9 : 0);
                    float f55 = timelineView.h - timelineView.py;
                    float f56 = f55 - videoHeight;
                    float f57 = track8.right;
                    rectF4.set(f54, f56, f47 + ((((f49 * f57) - f50) / f51) * f53) + (f57 >= f2 ? i9 : 0), f55);
                    timelineView.selectedVideoClipPath.addRoundRect(rectF4, timelineView.selectedVideoRadii, Path.Direction.CW);
                    canvas2.clipPath(timelineView.selectedVideoClipPath, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f32 = f25;
                f5 = f37;
            } else {
                fDp = fDp;
                f5 = 0.0f;
                f6 = 0.0f;
                videoHeight = 0.0f;
                f7 = 0.0f;
                f8 = 0.0f;
            }
            if (timelineView.collageTracks.isEmpty()) {
                f9 = 0.0f;
            } else {
                timelineView.getCollageHeight();
                int i10 = 0;
                while (i10 < timelineView.collageTracks.size()) {
                    Track track9 = (Track) timelineView.collageTracks.get(i10);
                    float f58 = track9.selectedT.set((timelineView.audioSelected || timelineView.roundSelected || timelineView.collageSelected != i10) ? false : true);
                    if (track9 != timelineView.collageMain) {
                        float f59 = jMin;
                        fLerp5 = timelineView.px + timelineView.ph + ((((track9.offset - timelineView.scroll) + (AndroidUtilities.lerp(track9.left, 0.0f, f58) * track9.duration)) / f59) * timelineView.sw);
                        fLerp4 = timelineView.px + timelineView.ph + ((((track9.offset - timelineView.scroll) + (AndroidUtilities.lerp(track9.right, 1.0f, f58) * track9.duration)) / f59) * timelineView.sw);
                    } else {
                        float f60 = timelineView.px + timelineView.ph;
                        long j4 = track9.offset - timelineView.scroll;
                        float f61 = j4;
                        float f62 = jMin;
                        float f63 = timelineView.sw;
                        float f64 = ((f61 / f62) * f63) + f60;
                        fLerp4 = (((j4 + track9.duration) / f62) * f63) + f60;
                        fLerp5 = f64;
                    }
                    canvas2.save();
                    float fLerp6 = AndroidUtilities.lerp(AndroidUtilities.dp(f), AndroidUtilities.dp(38.0f), f58);
                    RectF rectF5 = track9.bounds;
                    float f65 = fLerp4;
                    float f66 = timelineView.ph;
                    rectF5.set(fLerp5 - f66, f32 - fLerp6, f65 + f66, f32);
                    RectF rectF6 = track9.bounds;
                    f8 += rectF6.top * f58;
                    f7 += rectF6.bottom * f58;
                    float f67 = track9.offset;
                    float f68 = track9.left;
                    float f69 = track9.duration;
                    float f70 = (((f68 * f69) + f67) * f58) + f5;
                    f6 += (f67 + (track9.right * f69)) * f58;
                    timelineView.collageClipPath.rewind();
                    timelineView.collageClipPath.addRoundRect(track9.bounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(timelineView.collageClipPath);
                    VideoThumbsLoader videoThumbsLoader2 = track9.thumbs;
                    if (videoThumbsLoader2 != null) {
                        long j5 = track9.duration;
                        float f71 = j5 <= 0 ? 0.0f : timelineView.px + timelineView.ph + (((track9.offset - timelineView.scroll) / jMin) * timelineView.sw);
                        int i11 = timelineView.ph;
                        float f72 = f71;
                        float f73 = i11;
                        float f74 = f72 - f73;
                        float f75 = (j5 <= 0 ? 0.0f : timelineView.px + i11 + ((((track9.offset + j5) - timelineView.scroll) / jMin) * timelineView.sw)) + f73;
                        int frameWidth2 = videoThumbsLoader2.getFrameWidth();
                        float f76 = frameWidth2;
                        int iMax2 = (int) Math.max(0.0d, Math.floor((f74 - ((timelineView.px + timelineView.ph) + (((track9.offset - timelineView.scroll) / jMin) * timelineView.sw))) / f76));
                        int iMin2 = (int) Math.min(track9.thumbs.count, Math.ceil((f75 - f74) / f76) + 1.0d);
                        int i12 = (int) track9.bounds.top;
                        boolean z8 = track9.thumbs.frames.size() >= iMin2;
                        if (!z8) {
                            z5 = z8;
                            break;
                        }
                        int i13 = iMax2;
                        while (true) {
                            if (i13 >= Math.min(track9.thumbs.frames.size(), iMin2)) {
                                z5 = z8;
                                break;
                            } else {
                                if (((VideoThumbsLoader.BitmapFrame) track9.thumbs.frames.get(i13)).bitmap == null) {
                                    z5 = false;
                                    break;
                                }
                                i13++;
                            }
                        }
                        if (!z5) {
                            if (timelineView.blurManager.hasRenderNode()) {
                                timelineView.backgroundBlur.drawRect(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(1073741824);
                            } else {
                                canvas2.drawRect(track9.bounds, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (frameWidth2 != 0) {
                            float f77 = f74;
                            while (iMax2 < Math.min(track9.thumbs.frames.size(), iMin2)) {
                                VideoThumbsLoader.BitmapFrame bitmapFrame2 = (VideoThumbsLoader.BitmapFrame) track9.thumbs.frames.get(iMax2);
                                int i14 = iMin2;
                                if (bitmapFrame2.bitmap != null) {
                                    timelineView.collageFramePaint.setAlpha((int) (bitmapFrame2.getAlpha() * 255.0f));
                                    Bitmap bitmap2 = bitmapFrame2.bitmap;
                                    canvas2.drawBitmap(bitmap2, f77, i12 - ((int) ((bitmap2.getHeight() - fLerp6) / 2.0f)), timelineView.collageFramePaint);
                                }
                                f77 += f76;
                                iMax2++;
                                iMin2 = i14;
                                f32 = f32;
                            }
                        }
                        f24 = f32;
                        if (!z8) {
                            track9.thumbs.load();
                        }
                    } else {
                        f70 = f70;
                        f24 = f32;
                    }
                    timelineView.selectedCollageClipPath.rewind();
                    if (!timelineView.isCover) {
                        RectF rectF7 = AndroidUtilities.rectTmp;
                        int i15 = timelineView.px;
                        int i16 = timelineView.ph;
                        float f78 = i15 + i16;
                        float f79 = track9.left;
                        float f80 = track9.duration;
                        float f81 = timelineView.scroll;
                        float f82 = (f79 * f80) - f81;
                        float f83 = track9.offset;
                        float f84 = jMin;
                        float f85 = (f82 + f83) / f84;
                        float f86 = timelineView.sw;
                        float f87 = (f78 + (f85 * f86)) - (f79 <= 0.0f ? i16 : 0);
                        RectF rectF8 = track9.bounds;
                        float f88 = rectF8.top;
                        float f89 = track9.right;
                        rectF7.set(f87, f88, f78 + (((((f80 * f89) - f81) + f83) / f84) * f86) + (f89 >= 1.0f ? i16 : 0), rectF8.bottom);
                        timelineView.selectedCollageClipPath.addRoundRect(rectF7, timelineView.selectedVideoRadii, Path.Direction.CW);
                        canvas2.clipPath(timelineView.selectedCollageClipPath, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f32 = f24 - (fLerp6 + (fDp * 1.0f));
                    i10++;
                    f5 = f70;
                }
                f9 = 1.0f;
            }
            float f90 = timelineView.roundT.set(timelineView.hasRound);
            float f91 = timelineView.roundSelectedT.set(timelineView.hasRound && timelineView.roundSelected);
            float roundHeight = timelineView.getRoundHeight() * f90;
            float f92 = ((timelineView.videoTrack == null && !timelineView.hasAudio && timelineView.collageTracks.isEmpty()) ? 1.0f : f91) * f90;
            if (f90 > 0.0f) {
                float f93 = f5;
                f10 = f90;
                long j6 = timelineView.roundOffset;
                float f94 = j6;
                float f95 = timelineView.roundLeft;
                long j7 = timelineView.roundDuration;
                float f96 = j7;
                float f97 = f93 + ((f94 + (f95 * f96)) * f92);
                f6 += (f94 + (timelineView.roundRight * f96)) * f92;
                if (timelineView.videoTrack != null) {
                    float f98 = timelineView.px + timelineView.ph;
                    float fLerp7 = (j6 - timelineView.scroll) + (timelineView.roundDuration * AndroidUtilities.lerp(f95, 0.0f, f91));
                    float f99 = jMin;
                    float f100 = f98 + ((fLerp7 / f99) * timelineView.sw);
                    fLerp3 = timelineView.px + timelineView.ph + ((((timelineView.roundOffset - timelineView.scroll) + (AndroidUtilities.lerp(timelineView.roundRight, 1.0f, f91) * timelineView.roundDuration)) / f99) * timelineView.sw);
                    f21 = f100;
                } else {
                    float f101 = timelineView.px + timelineView.ph;
                    long j8 = j6 - timelineView.scroll;
                    float f102 = j8;
                    float f103 = jMin;
                    float f104 = timelineView.sw;
                    fLerp3 = (((j8 + j7) / f103) * f104) + f101;
                    f21 = ((f102 / f103) * f104) + f101;
                }
                RectF rectF9 = timelineView.roundBounds;
                float f105 = timelineView.ph;
                rectF9.set(f21 - f105, f32 - roundHeight, fLerp3 + f105, f32);
                float f106 = f32 - (roundHeight + (fDp * f10));
                RectF rectF10 = timelineView.roundBounds;
                f8 += rectF10.top * f92;
                f7 += rectF10.bottom * f92;
                timelineView.roundClipPath.rewind();
                timelineView.roundClipPath.addRoundRect(timelineView.roundBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(timelineView.roundClipPath);
                VideoThumbsLoader videoThumbsLoader3 = timelineView.roundThumbs;
                if (videoThumbsLoader3 != null) {
                    long j9 = timelineView.roundDuration;
                    float f107 = j9 <= 0 ? 0.0f : (((timelineView.roundOffset - timelineView.scroll) / jMin) * timelineView.sw) + timelineView.px + timelineView.ph;
                    int i17 = timelineView.ph;
                    float f108 = i17;
                    float f109 = f107 - f108;
                    float f110 = (j9 <= 0 ? 0.0f : timelineView.px + i17 + ((((timelineView.roundOffset + j9) - timelineView.scroll) / jMin) * timelineView.sw)) + f108;
                    int frameWidth3 = videoThumbsLoader3.getFrameWidth();
                    if (timelineView.videoTrack != null) {
                        f23 = timelineView.px + timelineView.ph + (((timelineView.roundOffset - timelineView.scroll) / jMin) * timelineView.sw);
                    } else {
                        f23 = timelineView.px;
                    }
                    float f111 = frameWidth3;
                    int iMax3 = (int) Math.max(0.0d, Math.floor((f109 - f23) / f111));
                    f22 = f106;
                    int iMin3 = (int) Math.min(timelineView.roundThumbs.count, Math.ceil((f110 - f109) / f111) + 1.0d);
                    int i18 = (int) timelineView.roundBounds.top;
                    boolean z9 = timelineView.roundThumbs.frames.size() >= iMin3;
                    if (!z9) {
                        z4 = z9;
                        break;
                    }
                    int i19 = iMax3;
                    while (true) {
                        if (i19 >= Math.min(timelineView.roundThumbs.frames.size(), iMin3)) {
                            z4 = z9;
                            break;
                        } else {
                            if (((VideoThumbsLoader.BitmapFrame) timelineView.roundThumbs.frames.get(i19)).bitmap == null) {
                                z4 = false;
                                break;
                            }
                            i19++;
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
                    if (frameWidth3 != 0) {
                        while (iMax3 < Math.min(timelineView.roundThumbs.frames.size(), iMin3)) {
                            VideoThumbsLoader.BitmapFrame bitmapFrame3 = (VideoThumbsLoader.BitmapFrame) timelineView.roundThumbs.frames.get(iMax3);
                            if (bitmapFrame3.bitmap != null) {
                                timelineView.videoFramePaint.setAlpha((int) (bitmapFrame3.getAlpha() * 255.0f));
                                Bitmap bitmap3 = bitmapFrame3.bitmap;
                                canvas2.drawBitmap(bitmap3, f109, i18 - ((int) ((bitmap3.getHeight() - roundHeight) / 2.0f)), timelineView.videoFramePaint);
                            }
                            f109 += f111;
                            iMax3++;
                            iMin3 = iMin3;
                        }
                    }
                    if (!z9) {
                        timelineView.roundThumbs.load();
                    }
                } else {
                    f22 = f106;
                }
                timelineView.selectedVideoClipPath.rewind();
                RectF rectF11 = AndroidUtilities.rectTmp;
                int i20 = timelineView.px;
                int i21 = timelineView.ph;
                float f112 = i20 + i21;
                float f113 = timelineView.roundLeft;
                float f114 = timelineView.roundDuration;
                float f115 = timelineView.scroll;
                float f116 = (f113 * f114) - f115;
                float f117 = timelineView.roundOffset;
                float f118 = jMin;
                float f119 = timelineView.sw;
                float f120 = i21 * (1.0f - f91);
                float f121 = ((f112 + (((f116 + f117) / f118) * f119)) - (f113 <= 0.0f ? i21 : 0)) - f120;
                RectF rectF12 = timelineView.roundBounds;
                float f122 = rectF12.top;
                float f123 = timelineView.roundRight;
                rectF11.set(f121, f122, f112 + (((((f114 * f123) - f115) + f117) / f118) * f119) + (f123 >= 1.0f ? i21 : 0) + f120, rectF12.bottom);
                timelineView.selectedVideoClipPath.addRoundRect(rectF11, timelineView.selectedVideoRadii, Path.Direction.CW);
                canvas2.clipPath(timelineView.selectedVideoClipPath, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f32 = f22;
                f5 = f97;
            } else {
                f10 = f90;
                f91 = f91;
            }
            float f124 = timelineView.audioT.set(timelineView.hasAudio);
            float f125 = timelineView.audioSelectedT.set(timelineView.hasAudio && timelineView.audioSelected);
            float audioHeight = timelineView.getAudioHeight() * f124;
            float f126 = ((timelineView.videoTrack == null && !timelineView.hasRound && timelineView.collageTracks.isEmpty()) ? 1.0f : f125) * f124;
            if (f124 > 0.0f) {
                float f127 = timelineView.audioOffset;
                float f128 = timelineView.audioLeft;
                float f129 = timelineView.audioDuration;
                float f130 = f5 + ((f127 + (f128 * f129)) * f126);
                float f131 = f6 + ((f127 + (timelineView.audioRight * f129)) * f126);
                Paint paint3 = timelineView.audioBlur.getPaint(f124);
                canvas2.save();
                if (timelineView.videoTrack != null || timelineView.hasRound || !timelineView.collageTracks.isEmpty()) {
                    float f132 = jMin;
                    float fLerp8 = ((((timelineView.audioOffset - timelineView.scroll) + (AndroidUtilities.lerp(timelineView.audioLeft, 0.0f, f125) * timelineView.audioDuration)) / f132) * timelineView.sw) + timelineView.px + timelineView.ph;
                    fLerp2 = ((((timelineView.audioOffset - timelineView.scroll) + (AndroidUtilities.lerp(timelineView.audioRight, 1.0f, f125) * timelineView.audioDuration)) / f132) * timelineView.sw) + timelineView.px + timelineView.ph;
                    f17 = fLerp8;
                } else {
                    float f133 = timelineView.px + timelineView.ph;
                    long j10 = timelineView.audioOffset - timelineView.scroll;
                    float f134 = jMin;
                    float f135 = j10 / f134;
                    float f136 = timelineView.sw;
                    float f137 = f133 + (f135 * f136);
                    fLerp2 = (((j10 + timelineView.audioDuration) / f134) * f136) + f133;
                    f17 = f137;
                }
                float f138 = fLerp2;
                RectF rectF13 = timelineView.audioBounds;
                float f139 = timelineView.ph;
                float f140 = f17;
                rectF13.set(f17 - f139, f32 - audioHeight, f139 + f138, f32);
                RectF rectF14 = timelineView.audioBounds;
                f8 += rectF14.top * f126;
                f7 += rectF14.bottom * f126;
                timelineView.audioClipPath.rewind();
                timelineView.audioClipPath.addRoundRect(timelineView.audioBounds, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(timelineView.audioClipPath);
                BlurringShader.BlurManager blurManager3 = timelineView.blurManager;
                if (blurManager3 != null && blurManager3.hasRenderNode()) {
                    timelineView.backgroundBlur.drawRect(canvas2);
                    canvas2.drawColor(Theme.multAlpha(855638016, f124));
                } else if (paint3 == null) {
                    canvas2.drawColor(Theme.multAlpha(1073741824, f124));
                } else {
                    canvas2.drawRect(timelineView.audioBounds, paint3);
                    canvas2.drawColor(Theme.multAlpha(855638016, f124));
                }
                if (timelineView.waveform != null && (blurManager = timelineView.blurManager) != null && blurManager.hasRenderNode()) {
                    float f141 = timelineView.waveformMax.set(timelineView.waveform.getMaxBar(), !timelineView.waveformIsLoaded);
                    timelineView.waveformIsLoaded = timelineView.waveform.getLoadedCount() > 0;
                    timelineView.waveformPath.check(timelineView.px + timelineView.ph + (((timelineView.audioOffset - timelineView.scroll) / jMin) * timelineView.sw), f140, f138, f125, jMin, audioHeight, f141, timelineView.audioBounds.bottom, timelineView.waveform);
                    j2 = jMin;
                    canvas2.saveLayerAlpha(timelineView.audioBounds, 102, 31);
                    canvas2.clipPath(timelineView.waveformPath);
                    timelineView.audioWaveformBlur.drawRect(canvas2);
                    canvas2.restore();
                } else {
                    j2 = jMin;
                    if (timelineView.waveform != null && paint3 != null) {
                        Paint paint4 = timelineView.audioWaveformBlur.getPaint(f124 * 0.4f);
                        if (paint4 == null) {
                            paint4 = timelineView.waveformPaint;
                            paint4.setAlpha((int) (64.0f * f124));
                        }
                        float f142 = timelineView.waveformMax.set(timelineView.waveform.getMaxBar(), !timelineView.waveformIsLoaded);
                        timelineView.waveformIsLoaded = timelineView.waveform.getLoadedCount() > 0;
                        timelineView.waveformPath.check(timelineView.px + timelineView.ph + (((timelineView.audioOffset - timelineView.scroll) / j2) * timelineView.sw), f140, f138, f125, j2, audioHeight, f142, timelineView.audioBounds.bottom, timelineView.waveform);
                        jMin = j2;
                        canvas2.drawPath(timelineView.waveformPath, paint4);
                    }
                    if (f125 < 1.0f) {
                        int i22 = timelineView.px;
                        float f143 = timelineView.ph + i22;
                        float f144 = timelineView.audioOffset - timelineView.scroll;
                        float f145 = timelineView.audioLeft;
                        float f146 = timelineView.audioDuration;
                        float f147 = jMin;
                        float f148 = timelineView.sw;
                        float f149 = ((((f145 * f146) + f144) / f147) * f148) + f143;
                        float f150 = f143 + (((f144 + (timelineView.audioRight * f146)) / f147) * f148);
                        float fMax4 = (Math.max(i22, f149) + Math.min(timelineView.w - timelineView.px, f150)) / 2.0f;
                        fCenterY = timelineView.audioBounds.centerY();
                        fMax3 = Math.max(0.0f, (Math.min(timelineView.w - timelineView.px, f150) - Math.max(timelineView.px, f149)) - AndroidUtilities.dp(24.0f));
                        float fDpf6 = AndroidUtilities.dpf2(13.0f);
                        if (timelineView.audioAuthor == null || timelineView.audioTitle != null) {
                            fDpf3 = AndroidUtilities.dpf2(3.11f) + timelineView.audioAuthorWidth + AndroidUtilities.dpf2(9.66f) + timelineView.audioTitleWidth;
                        } else {
                            fDpf3 = 0.0f;
                        }
                        f18 = fDpf6 + fDpf3;
                        if (f18 < fMax3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        float fMin2 = fMax4 - (Math.min(f18, fMax3) / 2.0f);
                        timelineView.audioIcon.setBounds((int) fMin2, (int) (fCenterY - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + fMin2), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + fCenterY));
                        f19 = 1.0f - f125;
                        f20 = f19 * 255.0f;
                        timelineView.audioIcon.setAlpha((int) f20);
                        timelineView.audioIcon.draw(canvas2);
                        fDpf4 = fMin2 + AndroidUtilities.dpf2(16.11f);
                        z3 = z2;
                        f11 = f124;
                        d = 0.0d;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, timelineView.w, timelineView.h, 255, 31);
                        fMin = Math.min(f150, timelineView.w) - AndroidUtilities.dp(12.0f);
                        canvas2.clipRect(fDpf4, 0.0f, fMin, timelineView.h);
                        if (timelineView.audioAuthor != null) {
                            canvas2.save();
                            canvas2.translate(fDpf4 - timelineView.audioAuthorLeft, fCenterY - (timelineView.audioAuthor.getHeight() / 2.0f));
                            timelineView.audioAuthorPaint.setAlpha((int) (f20 * f11));
                            timelineView.audioAuthor.draw(canvas2);
                            canvas2.restore();
                            fDpf5 = timelineView.audioAuthorWidth + fDpf4;
                        } else {
                            fDpf5 = fDpf4;
                        }
                        if (timelineView.audioAuthor != null && timelineView.audioTitle != null) {
                            float fDpf7 = fDpf5 + AndroidUtilities.dpf2(3.66f);
                            int alpha = timelineView.audioDotPaint.getAlpha();
                            timelineView.audioDotPaint.setAlpha((int) (alpha * f19));
                            canvas2.drawCircle(AndroidUtilities.dp(1.0f) + fDpf7, fCenterY, AndroidUtilities.dp(1.0f), timelineView.audioDotPaint);
                            timelineView.audioDotPaint.setAlpha(alpha);
                            fDpf5 = fDpf7 + AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(4.0f);
                        }
                        if (timelineView.audioTitle != null) {
                            canvas2.save();
                            canvas2.translate(fDpf5 - timelineView.audioTitleLeft, fCenterY - (timelineView.audioTitle.getHeight() / 2.0f));
                            timelineView.audioTitlePaint.setAlpha((int) (f20 * f11));
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
                        f11 = f124;
                        d = 0.0d;
                    }
                    canvas.restore();
                    f5 = f130;
                    f6 = f131;
                }
                jMin = j2;
                if (f125 < 1.0f) {
                    int i23 = timelineView.px;
                    float f1410 = timelineView.ph + i23;
                    float f1411 = timelineView.audioOffset - timelineView.scroll;
                    float f1412 = timelineView.audioLeft;
                    float f1413 = timelineView.audioDuration;
                    float f1414 = jMin;
                    float f1415 = timelineView.sw;
                    float f1416 = ((((f1412 * f1413) + f1411) / f1414) * f1415) + f1410;
                    float f151 = f1410 + (((f1411 + (timelineView.audioRight * f1413)) / f1414) * f1415);
                    float fMax5 = (Math.max(i23, f1416) + Math.min(timelineView.w - timelineView.px, f151)) / 2.0f;
                    fCenterY = timelineView.audioBounds.centerY();
                    fMax3 = Math.max(0.0f, (Math.min(timelineView.w - timelineView.px, f151) - Math.max(timelineView.px, f1416)) - AndroidUtilities.dp(24.0f));
                    float fDpf8 = AndroidUtilities.dpf2(13.0f);
                    if (timelineView.audioAuthor == null) {
                        fDpf3 = AndroidUtilities.dpf2(3.11f) + timelineView.audioAuthorWidth + AndroidUtilities.dpf2(9.66f) + timelineView.audioTitleWidth;
                    } else {
                        fDpf3 = AndroidUtilities.dpf2(3.11f) + timelineView.audioAuthorWidth + AndroidUtilities.dpf2(9.66f) + timelineView.audioTitleWidth;
                    }
                    f18 = fDpf8 + fDpf3;
                    if (f18 < fMax3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    float fMin3 = fMax5 - (Math.min(f18, fMax3) / 2.0f);
                    timelineView.audioIcon.setBounds((int) fMin3, (int) (fCenterY - (AndroidUtilities.dp(13.0f) / 2.0f)), (int) (AndroidUtilities.dp(13.0f) + fMin3), (int) ((AndroidUtilities.dp(13.0f) / 2.0f) + fCenterY));
                    f19 = 1.0f - f125;
                    f20 = f19 * 255.0f;
                    timelineView.audioIcon.setAlpha((int) f20);
                    timelineView.audioIcon.draw(canvas2);
                    fDpf4 = fMin3 + AndroidUtilities.dpf2(16.11f);
                    z3 = z2;
                    f11 = f124;
                    d = 0.0d;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, timelineView.w, timelineView.h, 255, 31);
                    fMin = Math.min(f151, timelineView.w) - AndroidUtilities.dp(12.0f);
                    canvas2.clipRect(fDpf4, 0.0f, fMin, timelineView.h);
                    if (timelineView.audioAuthor != null) {
                        canvas2.save();
                        canvas2.translate(fDpf4 - timelineView.audioAuthorLeft, fCenterY - (timelineView.audioAuthor.getHeight() / 2.0f));
                        timelineView.audioAuthorPaint.setAlpha((int) (f20 * f11));
                        timelineView.audioAuthor.draw(canvas2);
                        canvas2.restore();
                        fDpf5 = timelineView.audioAuthorWidth + fDpf4;
                    } else {
                        fDpf5 = fDpf4;
                    }
                    if (timelineView.audioAuthor != null) {
                        float fDpf9 = fDpf5 + AndroidUtilities.dpf2(3.66f);
                        int alpha2 = timelineView.audioDotPaint.getAlpha();
                        timelineView.audioDotPaint.setAlpha((int) (alpha2 * f19));
                        canvas2.drawCircle(AndroidUtilities.dp(1.0f) + fDpf9, fCenterY, AndroidUtilities.dp(1.0f), timelineView.audioDotPaint);
                        timelineView.audioDotPaint.setAlpha(alpha2);
                        fDpf5 = fDpf9 + AndroidUtilities.dpf2(2.0f) + AndroidUtilities.dpf2(4.0f);
                    }
                    if (timelineView.audioTitle != null) {
                        canvas2.save();
                        canvas2.translate(fDpf5 - timelineView.audioTitleLeft, fCenterY - (timelineView.audioTitle.getHeight() / 2.0f));
                        timelineView.audioTitlePaint.setAlpha((int) (f20 * f11));
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
                    f11 = f124;
                    d = 0.0d;
                }
                canvas.restore();
                f5 = f130;
                f6 = f131;
            } else {
                f11 = f124;
                f9 = f9;
                paint = paint;
                f125 = f125;
                f34 = f34;
                f33 = f33;
                f10 = f10;
                d = 0.0d;
            }
            float f152 = f7;
            float f153 = f8;
            float f154 = timelineView.px + timelineView.ph;
            float f155 = timelineView.scroll;
            float f156 = jMin;
            float f157 = timelineView.sw;
            float f158 = (((f5 - f155) / f156) * f157) + f154;
            float f159 = f154 + (((f6 - f155) / f156) * f157);
            float fMax6 = timelineView.collageTracks.isEmpty() ? (timelineView.hasAudio && timelineView.videoTrack == null) ? f11 : Math.max(f34, f10) : f9;
            if (f11 > d || f10 > d || f34 > d || f9 > d) {
                if (timelineView.videoTrack == null && !timelineView.hasRound && timelineView.collageTracks.isEmpty()) {
                    f12 = f125;
                    fLerp = AndroidUtilities.lerp(0.6f, 1.0f, f12) * f11;
                } else {
                    f12 = f125;
                    fLerp = 1.0f;
                }
                Paint paint5 = paint;
                timelineView.drawRegion(canvas, paint5, f153, f152, f158, f159, fLerp * fMax6);
                Track track10 = timelineView.videoTrack;
                if (track10 != null && ((timelineView.hasAudio || timelineView.hasRound) && (f12 > 0.0f || f91 > 0.0f))) {
                    float f160 = timelineView.h - timelineView.py;
                    float f161 = timelineView.ph + timelineView.px;
                    float f162 = track10.left;
                    float f163 = track10.duration;
                    float f164 = timelineView.scroll;
                    float f165 = timelineView.sw;
                    float f166 = ((((f162 * f163) - f164) / f156) * f165) + f161;
                    float f167 = f161 + ((((track10.right * f163) - f164) / f156) * f165);
                    canvas3 = canvas;
                    timelineView.drawRegion(canvas3, paint5, f160 - videoHeight, f160, f166, f167, 0.8f);
                } else {
                    if (timelineView.collageMain != null) {
                        i3 = 1;
                        if (timelineView.collageTracks.size() > 1) {
                            Track track11 = timelineView.collageMain;
                            RectF rectF17 = track11.bounds;
                            float f168 = rectF17.top;
                            float f169 = rectF17.bottom;
                            float f170 = timelineView.ph + timelineView.px;
                            float f171 = track11.offset;
                            float f172 = track11.left;
                            float f173 = track11.duration;
                            float f174 = timelineView.scroll;
                            float f175 = timelineView.sw;
                            float f176 = (((((f172 * f173) + f171) - f174) / f156) * f175) + f170;
                            float f177 = ((((f171 + (track11.right * f173)) - f174) / f156) * f175) + f170;
                            canvas3 = canvas;
                            timelineView.drawRegion(canvas3, paint5, f168, f169, f176, f177, 0.8f);
                        } else {
                            canvas3 = canvas;
                        }
                    } else {
                        canvas3 = canvas;
                    }
                    if (timelineView.maxCount <= i3 && (track5 = timelineView.videoTrack) != null) {
                        float f178 = track5.duration;
                        float f179 = track5.right;
                        float f180 = track5.left;
                        long j11 = (long) ((f179 - f180) * f178);
                        if (j11 > 68999) {
                            float f181 = timelineView.px + timelineView.ph;
                            float f182 = timelineView.scroll;
                            float f183 = timelineView.sw;
                            float f184 = ((((f180 * f178) - f182) / f156) * f183) + f181;
                            float f185 = f181 + ((((f179 * f178) - f182) / f156) * f183);
                            canvas3.save();
                            float f186 = timelineView.h - timelineView.py;
                            canvas3.clipRect(f184, f186 - videoHeight, f185, f186);
                            timelineView.regionPaint.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f33) * 255.0f));
                            long j12 = 59000;
                            int iMin4 = (int) Math.min(timelineView.maxCount - 1, j11 / 59000);
                            int i24 = 1;
                            while (i24 <= iMin4) {
                                long j13 = ((long) i24) * j12;
                                if (Math.min(j12, j11 - j13) < 1000) {
                                    break;
                                }
                                float f187 = timelineView.px + timelineView.ph;
                                Track track12 = timelineView.videoTrack;
                                float f188 = f187 + ((((((long) (track12.duration * track12.left)) + j13) - timelineView.scroll) / f156) * timelineView.sw);
                                int i25 = i24;
                                canvas.drawRect(f188, (timelineView.h - timelineView.py) - videoHeight, AndroidUtilities.dp(1.0f) + f188, timelineView.h - timelineView.py, timelineView.regionPaint);
                                canvas3 = canvas;
                                StringBuilder sb = new StringBuilder();
                                sb.append("#");
                                int i26 = i25 + 1;
                                sb.append(i26);
                                canvas3.drawText(sb.toString(), f188 + AndroidUtilities.dp(2.0f), ((timelineView.h - timelineView.py) - videoHeight) + AndroidUtilities.dp(14.0f), timelineView.countTextPaint);
                                i24 = i26;
                                j12 = 59000;
                            }
                            canvas3.restore();
                        }
                    }
                    f13 = timelineView.loopProgress.set(0.0f);
                    contentHeight = ((timelineView.h - timelineView.getContentHeight()) + timelineView.py) - AndroidUtilities.dpf2(2.3f);
                    fDpf2 = AndroidUtilities.dpf2(4.3f) + (timelineView.h - timelineView.py);
                    if (f13 > 0.0f) {
                        j = timelineView.loopProgressFrom;
                        if (j == -1) {
                            track3 = timelineView.videoTrack;
                            if (track3 != null) {
                                f16 = track3.duration * track3.right;
                            } else {
                                track4 = timelineView.collageMain;
                                if (track4 != null) {
                                    f16 = track4.duration * (track4.right - track4.left);
                                } else {
                                    if (timelineView.hasRound) {
                                        f14 = timelineView.roundDuration;
                                        f15 = timelineView.roundRight;
                                    } else {
                                        f14 = timelineView.audioDuration;
                                        f15 = timelineView.audioRight;
                                    }
                                    j = (long) (f14 * f15);
                                }
                            }
                            j = (long) f16;
                        }
                        timelineView = this;
                        timelineView.drawProgress(canvas3, contentHeight, fDpf2, j, f13 * fMax6);
                    } else {
                        timelineView = timelineView;
                    }
                    timelineView.drawProgress(canvas, contentHeight, fDpf2, timelineView.progress, (1.0f - f13) * fMax6);
                }
                i3 = 1;
                if (timelineView.maxCount <= i3) {
                }
                f13 = timelineView.loopProgress.set(0.0f);
                contentHeight = ((timelineView.h - timelineView.getContentHeight()) + timelineView.py) - AndroidUtilities.dpf2(2.3f);
                fDpf2 = AndroidUtilities.dpf2(4.3f) + (timelineView.h - timelineView.py);
                if (f13 > 0.0f) {
                    j = timelineView.loopProgressFrom;
                    if (j == -1) {
                        track3 = timelineView.videoTrack;
                        if (track3 != null) {
                            f16 = track3.duration * track3.right;
                        } else {
                            track4 = timelineView.collageMain;
                            if (track4 != null) {
                                f16 = track4.duration * (track4.right - track4.left);
                            } else {
                                if (timelineView.hasRound) {
                                    f14 = timelineView.roundDuration;
                                    f15 = timelineView.roundRight;
                                } else {
                                    f14 = timelineView.audioDuration;
                                    f15 = timelineView.audioRight;
                                }
                                j = (long) (f14 * f15);
                            }
                        }
                        j = (long) f16;
                    }
                    timelineView = this;
                    timelineView.drawProgress(canvas3, contentHeight, fDpf2, j, f13 * fMax6);
                } else {
                    timelineView = timelineView;
                }
                timelineView.drawProgress(canvas, contentHeight, fDpf2, timelineView.progress, (1.0f - f13) * fMax6);
            }
            if (z) {
                canvas.restore();
            }
        }
        if (timelineView.dragged) {
            float f189 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float fDp4 = (AndroidUtilities.dp(32.0f) / timelineView.sw) * jMin * f189;
            float f190 = timelineView.dragSpeed;
            long j14 = (long) (fDp4 * f190);
            if (timelineView.isCover) {
                timelineView.dragSpeed = f190 + (f189 * 0.25f);
            }
            int i27 = timelineView.pressHandle;
            if (i27 == 4 && (track2 = timelineView.videoTrack) != null) {
                float f191 = track2.left;
                long j15 = timelineView.scroll;
                long j16 = track2.duration;
                float f192 = j16;
                if (f191 < j15 / f192) {
                    i2 = -1;
                } else if (track2.right > (j15 + jMin) / f192) {
                    i2 = 1;
                } else {
                    timelineView.dragSpeed = 1.0f;
                    i2 = 0;
                }
                long j17 = ((long) i2) * j14;
                long jClamp = Utilities.clamp(j15 + j17, j16 - jMin, 0L);
                timelineView.scroll = jClamp;
                timelineView.progress += j17;
                Track track13 = timelineView.videoTrack;
                float f193 = (jClamp - j15) / track13.duration;
                if (f193 > 0.0f) {
                    f3 = 1.0f;
                    fMax2 = Math.min(1.0f - track13.right, f193);
                } else {
                    f3 = 1.0f;
                    fMax2 = Math.max(0.0f - track13.left, f193);
                }
                Track track14 = timelineView.videoTrack;
                track14.left = Utilities.clamp(track14.left + fMax2, f3, 0.0f);
                Track track15 = timelineView.videoTrack;
                track15.right = Utilities.clamp(track15.right + fMax2, f3, 0.0f);
                TimelineDelegate timelineDelegate = timelineView.delegate;
                if (timelineDelegate != null) {
                    timelineDelegate.onVideoLeftChange(false, timelineView.videoTrack.left);
                    timelineView.delegate.onVideoRightChange(false, timelineView.videoTrack.right);
                }
                timelineView.invalidate();
            } else if (i27 == 8) {
                float f194 = timelineView.audioLeft;
                long j18 = timelineView.audioOffset;
                long j19 = -j18;
                float f195 = 100 + j19;
                long j20 = timelineView.audioDuration;
                float f196 = j20;
                if (f194 < f195 / f196) {
                    i = -1;
                } else if (timelineView.audioRight >= ((j19 + jMin) - 100) / f196) {
                    i = 1;
                } else {
                    timelineView.dragSpeed = 1.0f;
                    i = 0;
                }
                if (i != 0) {
                    if (timelineView.audioSelected && (track = timelineView.videoTrack) != null) {
                        long j21 = j18 - (((long) i) * j14);
                        float f197 = track.right;
                        float f198 = track.duration;
                        timelineView.audioOffset = Utilities.clamp(j21, (long) ((f197 * f198) - (f194 * f196)), (long) ((track.left * f198) - (timelineView.audioRight * f196)));
                    } else if (timelineView.roundSelected && timelineView.hasRound) {
                        long j22 = j18 - (((long) i) * j14);
                        float f199 = timelineView.roundRight;
                        float f200 = timelineView.roundDuration;
                        timelineView.audioOffset = Utilities.clamp(j22, (long) ((f199 * f200) - (f194 * f196)), (long) ((timelineView.roundLeft * f200) - (timelineView.audioRight * f196)));
                    } else {
                        timelineView.audioOffset = Utilities.clamp(j18 - (((long) i) * j14), 0L, -(j20 - Math.min(timelineView.getBaseDuration(), timelineView.getMaxScrollDuration())));
                    }
                    float f201 = (-(timelineView.audioOffset - j18)) / timelineView.audioDuration;
                    if (f201 > 0.0f) {
                        fMax = Math.min(1.0f - timelineView.audioRight, f201);
                    } else {
                        fMax = Math.max(0.0f - timelineView.audioLeft, f201);
                    }
                    if (timelineView.videoTrack == null) {
                        float f202 = timelineView.progress;
                        float f203 = timelineView.audioDuration;
                        timelineView.progress = (long) Utilities.clamp(f202 + (fMax * f203), f203, 0.0f);
                    }
                    timelineView.audioLeft = Utilities.clamp(timelineView.audioLeft + fMax, 1.0f, 0.0f);
                    timelineView.audioRight = Utilities.clamp(timelineView.audioRight + fMax, 1.0f, 0.0f);
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
            ArrayList arrayList = this.collageTracks;
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                Track track2 = (Track) obj;
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
                    TimelineView.VideoThumbsLoader.$r8$lambda$fteXkXvoy6bA9L1ywK_hhKALubA(this.f$0, str, l, j2, j3, i2, j, i, runnable);
                }
            });
        }

        public static void $r8$lambda$fteXkXvoy6bA9L1ywK_hhKALubA(VideoThumbsLoader videoThumbsLoader, String str, Long l, long j, long j2, int i, long j3, int i2, Runnable runnable) {
            Exception exc;
            int i3;
            int i4;
            int i5;
            long maxScrollDuration = TimelineView.this.getMaxScrollDuration();
            int i6 = 0;
            try {
                videoThumbsLoader.metadataRetriever.setDataSource(str);
                String strExtractMetadata = videoThumbsLoader.metadataRetriever.extractMetadata(9);
                if (strExtractMetadata != null) {
                    maxScrollDuration = Long.parseLong(strExtractMetadata);
                    videoThumbsLoader.duration = maxScrollDuration;
                }
                String strExtractMetadata2 = videoThumbsLoader.metadataRetriever.extractMetadata(18);
                i4 = strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : 0;
                try {
                    String strExtractMetadata3 = videoThumbsLoader.metadataRetriever.extractMetadata(19);
                    i6 = strExtractMetadata3 != null ? Integer.parseInt(strExtractMetadata3) : 0;
                    String strExtractMetadata4 = videoThumbsLoader.metadataRetriever.extractMetadata(24);
                    if (strExtractMetadata4 == null || ((i5 = Integer.parseInt(strExtractMetadata4)) != 90 && i5 != 270)) {
                        int i7 = i6;
                        i6 = i4;
                        i4 = i7;
                    }
                } catch (Exception e) {
                    i3 = i4;
                    exc = e;
                    videoThumbsLoader.metadataRetriever = null;
                    FileLog.e(exc);
                    i4 = i6;
                    i6 = i3;
                }
            } catch (Exception e2) {
                exc = e2;
                i3 = 0;
            }
            if (l != null) {
                maxScrollDuration = l.longValue();
                videoThumbsLoader.duration = maxScrollDuration;
            }
            if (j != -1 && j2 != -1) {
                maxScrollDuration = j2 - j;
            }
            float fClamp = Utilities.clamp((i6 == 0 || i4 == 0) ? 1.0f : i6 / i4, 1.3333334f, 0.5625f);
            videoThumbsLoader.frameHeight = Math.max(1, i);
            videoThumbsLoader.frameWidth = Math.max(1, (int) Math.ceil(i * fClamp));
            int iCeil = (int) Math.ceil(((Math.max(maxScrollDuration, j3) / j3) * i2) / videoThumbsLoader.frameWidth);
            videoThumbsLoader.count = iCeil;
            videoThumbsLoader.frameIterator = (long) (maxScrollDuration / iCeil);
            videoThumbsLoader.nextFrame = -videoThumbsLoader.frameIterator;
            if (j != -1) {
                videoThumbsLoader.nextFrame = j - videoThumbsLoader.frameIterator;
            }
            videoThumbsLoader.load();
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
                    this.f$0.receiveFrame(frameAtTime);
                }
            });
        }

        public void receiveFrame(Bitmap bitmap) {
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
                        this.f$0.receiveData((short[]) obj, ((Integer) obj2).intValue());
                    }
                });
            } else {
                Utilities.phoneBookQueue.postRunnable(new TimelineView$AudioWaveformLoader$$ExternalSyntheticLambda0(this));
            }
        }

        public void run() {
            MediaCodec.BufferInfo bufferInfo;
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
                final short[] sArr = new short[32];
                int iDequeueOutputBuffer = -1;
                int i = 0;
                boolean z = false;
                int i2 = 0;
                int i3 = 0;
                short s2 = 0;
                do {
                    MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                    int iDequeueInputBuffer = mediaCodecCreateDecoderByType.dequeueInputBuffer(2500L);
                    if (iDequeueInputBuffer >= 0) {
                        int sampleData = this.extractor.readSampleData(mediaCodecCreateDecoderByType.getInputBuffer(iDequeueInputBuffer), 0);
                        if (sampleData < 0) {
                            mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
                            bufferInfo = bufferInfo2;
                            z = true;
                        } else {
                            bufferInfo = bufferInfo2;
                            mediaCodecCreateDecoderByType.queueInputBuffer(iDequeueInputBuffer, 0, sampleData, this.extractor.getSampleTime(), 0);
                            this.extractor.advance();
                        }
                    } else {
                        bufferInfo = bufferInfo2;
                    }
                    if (iDequeueOutputBuffer >= 0) {
                        mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer).position(0);
                    }
                    iDequeueOutputBuffer = mediaCodecCreateDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                    while (iDequeueOutputBuffer != -1 && !z) {
                        if (iDequeueOutputBuffer >= 0) {
                            ByteBuffer outputBuffer = mediaCodecCreateDecoderByType.getOutputBuffer(iDequeueOutputBuffer);
                            if (outputBuffer != null && bufferInfo.size > 0) {
                                int i4 = i3;
                                while (true) {
                                    if (outputBuffer.remaining() > 0) {
                                        short s3 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                        if (i4 >= iRound) {
                                            sArr[i - i2] = s2;
                                            i++;
                                            final int i5 = i - i2;
                                            if (i5 >= sArr.length || i >= this.count) {
                                                short[] sArr2 = new short[sArr.length];
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        this.f$0.receiveData(sArr, i5);
                                                    }
                                                });
                                                sArr = sArr2;
                                                i2 = i;
                                            }
                                            if (i >= this.data.length) {
                                                i3 = 0;
                                                s2 = 0;
                                                break;
                                            } else {
                                                s = 0;
                                                i4 = 0;
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
                                    break;
                                }
                            }
                            mediaCodecCreateDecoderByType.releaseOutputBuffer(iDequeueOutputBuffer, false);
                            if ((bufferInfo.flags & 4) != 0) {
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

        public void receiveData(short[] sArr, int i) {
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

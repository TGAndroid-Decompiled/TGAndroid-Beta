package org.telegram.ui.Components;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.TeeAudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.LoopingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.SurfaceNotValidException;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoSize;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FourierTransform;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Stories.recorder.StoryEntry;
@SuppressLint({"NewApi"})
public class VideoPlayer implements Player.Listener, VideoListener, AnalyticsListener, NotificationCenter.NotificationCenterDelegate {
    static int playerCounter;
    public boolean allowMultipleInstances;
    boolean audioDisabled;
    private ExoPlayer audioPlayer;
    private boolean audioPlayerReady;
    private String audioType;
    Handler audioUpdateHandler;
    private Uri audioUri;
    private AudioVisualizerDelegate audioVisualizerDelegate;
    private boolean autoplay;
    private Uri currentUri;
    MediaSource.Factory dashMediaSourceFactory;
    private VideoPlayerDelegate delegate;
    private boolean handleAudioFocus;
    HlsMediaSource.Factory hlsMediaSourceFactory;
    private boolean isStory;
    private boolean isStreaming;
    private boolean lastReportedPlayWhenReady;
    private int lastReportedPlaybackState;
    private boolean looping;
    private boolean loopingMediaSource;
    private DataSource.Factory mediaDataSourceFactory;
    private boolean mixedAudio;
    private boolean mixedPlayWhenReady;
    public ExoPlayer player;
    ProgressiveMediaSource.Factory progressiveMediaSourceFactory;
    private int repeatCount;
    private boolean shouldPauseOther;
    SsMediaSource.Factory ssMediaSourceFactory;
    private Surface surface;
    private SurfaceView surfaceView;
    private TextureView textureView;
    private MappingTrackSelector trackSelector;
    private boolean triedReinit;
    private boolean videoPlayerReady;
    private String videoType;
    private Uri videoUri;
    private DispatchQueue workerQueue;

    public interface AudioVisualizerDelegate {
        boolean needUpdate();

        void onVisualizerUpdate(boolean z, boolean z2, float[] fArr);
    }

    public interface VideoPlayerDelegate {

        public final class CC {
            public static void $default$onRenderedFirstFrame(VideoPlayerDelegate videoPlayerDelegate, AnalyticsListener.EventTime eventTime) {
            }

            public static void $default$onSeekFinished(VideoPlayerDelegate videoPlayerDelegate, AnalyticsListener.EventTime eventTime) {
            }

            public static void $default$onSeekStarted(VideoPlayerDelegate videoPlayerDelegate, AnalyticsListener.EventTime eventTime) {
            }
        }

        void onError(VideoPlayer videoPlayer, Exception exc);

        void onRenderedFirstFrame();

        void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime);

        void onSeekFinished(AnalyticsListener.EventTime eventTime);

        void onSeekStarted(AnalyticsListener.EventTime eventTime);

        void onStateChanged(boolean z, int i);

        boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

        void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

        void onVideoSizeChanged(int i, int i2, int i3, float f);
    }

    @Override
    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
        AnalyticsListener.CC.$default$onAudioAttributesChanged(this, eventTime, audioAttributes);
    }

    @Override
    public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
    }

    @Override
    public void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        AnalyticsListener.CC.$default$onAudioCodecError(this, eventTime, exc);
    }

    @Override
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        AnalyticsListener.CC.$default$onAudioDecoderInitialized(this, eventTime, str, j);
    }

    @Override
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        AnalyticsListener.CC.$default$onAudioDecoderInitialized(this, eventTime, str, j, j2);
    }

    @Override
    public void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        AnalyticsListener.CC.$default$onAudioDecoderReleased(this, eventTime, str);
    }

    @Override
    public void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        AnalyticsListener.CC.$default$onAudioDisabled(this, eventTime, decoderCounters);
    }

    @Override
    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        AnalyticsListener.CC.$default$onAudioEnabled(this, eventTime, decoderCounters);
    }

    @Override
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
        AnalyticsListener.CC.$default$onAudioInputFormatChanged(this, eventTime, format);
    }

    @Override
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.CC.$default$onAudioInputFormatChanged(this, eventTime, format, decoderReuseEvaluation);
    }

    @Override
    public void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
        AnalyticsListener.CC.$default$onAudioPositionAdvancing(this, eventTime, j);
    }

    @Override
    public void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
        AnalyticsListener.CC.$default$onAudioSinkError(this, eventTime, exc);
    }

    @Override
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        AnalyticsListener.CC.$default$onAudioUnderrun(this, eventTime, i, j, j2);
    }

    @Override
    public void onAvailableCommandsChanged(Player.Commands commands) {
        Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
    }

    @Override
    public void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
        AnalyticsListener.CC.$default$onAvailableCommandsChanged(this, eventTime, commands);
    }

    @Override
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
        AnalyticsListener.CC.$default$onBandwidthEstimate(this, eventTime, i, j, j2);
    }

    @Override
    public void onCues(AnalyticsListener.EventTime eventTime, CueGroup cueGroup) {
        AnalyticsListener.CC.$default$onCues(this, eventTime, cueGroup);
    }

    @Override
    public void onCues(AnalyticsListener.EventTime eventTime, List list) {
        AnalyticsListener.CC.$default$onCues(this, eventTime, list);
    }

    @Override
    public void onCues(CueGroup cueGroup) {
        Player.Listener.CC.$default$onCues(this, cueGroup);
    }

    @Override
    public void onCues(List list) {
        Player.Listener.CC.$default$onCues(this, list);
    }

    @Override
    public void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        AnalyticsListener.CC.$default$onDecoderDisabled(this, eventTime, i, decoderCounters);
    }

    @Override
    public void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
        AnalyticsListener.CC.$default$onDecoderEnabled(this, eventTime, i, decoderCounters);
    }

    @Override
    public void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
        AnalyticsListener.CC.$default$onDecoderInitialized(this, eventTime, i, str, j);
    }

    @Override
    public void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i, Format format) {
        AnalyticsListener.CC.$default$onDecoderInputFormatChanged(this, eventTime, i, format);
    }

    @Override
    public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
    }

    @Override
    public void onDeviceInfoChanged(AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo) {
        AnalyticsListener.CC.$default$onDeviceInfoChanged(this, eventTime, deviceInfo);
    }

    @Override
    public void onDeviceVolumeChanged(int i, boolean z) {
        Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
    }

    @Override
    public void onDeviceVolumeChanged(AnalyticsListener.EventTime eventTime, int i, boolean z) {
        AnalyticsListener.CC.$default$onDeviceVolumeChanged(this, eventTime, i, z);
    }

    @Override
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        AnalyticsListener.CC.$default$onDownstreamFormatChanged(this, eventTime, mediaLoadData);
    }

    @Override
    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener.CC.$default$onDrmKeysLoaded(this, eventTime);
    }

    @Override
    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener.CC.$default$onDrmKeysRemoved(this, eventTime);
    }

    @Override
    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener.CC.$default$onDrmKeysRestored(this, eventTime);
    }

    @Override
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener.CC.$default$onDrmSessionAcquired(this, eventTime);
    }

    @Override
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
        AnalyticsListener.CC.$default$onDrmSessionAcquired(this, eventTime, i);
    }

    @Override
    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
        AnalyticsListener.CC.$default$onDrmSessionManagerError(this, eventTime, exc);
    }

    @Override
    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener.CC.$default$onDrmSessionReleased(this, eventTime);
    }

    @Override
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
        AnalyticsListener.CC.$default$onDroppedVideoFrames(this, eventTime, i, j);
    }

    @Override
    public void onEvents(Player player, Player.Events events) {
        Player.Listener.CC.$default$onEvents(this, player, events);
    }

    @Override
    public void onEvents(Player player, AnalyticsListener.Events events) {
        AnalyticsListener.CC.$default$onEvents(this, player, events);
    }

    @Override
    public void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        AnalyticsListener.CC.$default$onIsLoadingChanged(this, eventTime, z);
    }

    @Override
    public void onIsLoadingChanged(boolean z) {
        Player.Listener.CC.$default$onIsLoadingChanged(this, z);
    }

    @Override
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        AnalyticsListener.CC.$default$onIsPlayingChanged(this, eventTime, z);
    }

    @Override
    public void onIsPlayingChanged(boolean z) {
        Player.Listener.CC.$default$onIsPlayingChanged(this, z);
    }

    @Override
    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.CC.$default$onLoadCanceled(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override
    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.CC.$default$onLoadCompleted(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        AnalyticsListener.CC.$default$onLoadError(this, eventTime, loadEventInfo, mediaLoadData, iOException, z);
    }

    @Override
    public void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.CC.$default$onLoadStarted(this, eventTime, loadEventInfo, mediaLoadData);
    }

    @Override
    public void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        AnalyticsListener.CC.$default$onLoadingChanged(this, eventTime, z);
    }

    @Override
    public void onLoadingChanged(boolean z) {
        Player.Listener.CC.$default$onLoadingChanged(this, z);
    }

    @Override
    public void onMediaItemTransition(MediaItem mediaItem, int i) {
        Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
    }

    @Override
    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
        AnalyticsListener.CC.$default$onMediaItemTransition(this, eventTime, mediaItem, i);
    }

    @Override
    public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
    }

    @Override
    public void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
        AnalyticsListener.CC.$default$onMediaMetadataChanged(this, eventTime, mediaMetadata);
    }

    @Override
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
        AnalyticsListener.CC.$default$onMetadata(this, eventTime, metadata);
    }

    @Override
    public void onMetadata(Metadata metadata) {
        Player.Listener.CC.$default$onMetadata(this, metadata);
    }

    @Override
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        AnalyticsListener.CC.$default$onPlayWhenReadyChanged(this, eventTime, z, i);
    }

    @Override
    public void onPlayWhenReadyChanged(boolean z, int i) {
        Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i);
    }

    @Override
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
        AnalyticsListener.CC.$default$onPlaybackParametersChanged(this, eventTime, playbackParameters);
    }

    @Override
    public void onPlaybackStateChanged(int i) {
        Player.Listener.CC.$default$onPlaybackStateChanged(this, i);
    }

    @Override
    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
        AnalyticsListener.CC.$default$onPlaybackStateChanged(this, eventTime, i);
    }

    @Override
    public void onPlaybackSuppressionReasonChanged(int i) {
        Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
    }

    @Override
    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
        AnalyticsListener.CC.$default$onPlaybackSuppressionReasonChanged(this, eventTime, i);
    }

    @Override
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        AnalyticsListener.CC.$default$onPlayerError(this, eventTime, playbackException);
    }

    @Override
    public void onPlayerErrorChanged(PlaybackException playbackException) {
        Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
    }

    @Override
    public void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
        AnalyticsListener.CC.$default$onPlayerErrorChanged(this, eventTime, playbackException);
    }

    @Override
    public void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
        AnalyticsListener.CC.$default$onPlayerReleased(this, eventTime);
    }

    @Override
    public void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
        AnalyticsListener.CC.$default$onPlayerStateChanged(this, eventTime, z, i);
    }

    @Override
    public void onPositionDiscontinuity(int i) {
        Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
    }

    @Override
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
        AnalyticsListener.CC.$default$onPositionDiscontinuity(this, eventTime, i);
    }

    @Override
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        AnalyticsListener.CC.$default$onPositionDiscontinuity(this, eventTime, positionInfo, positionInfo2, i);
    }

    @Override
    public void onRepeatModeChanged(int i) {
    }

    @Override
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
        AnalyticsListener.CC.$default$onRepeatModeChanged(this, eventTime, i);
    }

    @Override
    public void onSeekProcessed() {
        Player.Listener.CC.$default$onSeekProcessed(this);
    }

    @Override
    public void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
        AnalyticsListener.CC.$default$onSkipSilenceEnabledChanged(this, eventTime, z);
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z) {
        Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
    }

    @Override
    public void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override
    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
        AnalyticsListener.CC.$default$onSurfaceSizeChanged(this, eventTime, i, i2);
    }

    @Override
    public void onTimelineChanged(Timeline timeline, int i) {
        Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
    }

    @Override
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
        AnalyticsListener.CC.$default$onTimelineChanged(this, eventTime, i);
    }

    @Override
    public void onTracksChanged(Tracks tracks) {
        Player.Listener.CC.$default$onTracksChanged(this, tracks);
    }

    @Override
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
        AnalyticsListener.CC.$default$onTracksChanged(this, eventTime, tracks);
    }

    @Override
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
        AnalyticsListener.CC.$default$onUpstreamDiscarded(this, eventTime, mediaLoadData);
    }

    @Override
    public void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
        AnalyticsListener.CC.$default$onVideoCodecError(this, eventTime, exc);
    }

    @Override
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
        AnalyticsListener.CC.$default$onVideoDecoderInitialized(this, eventTime, str, j);
    }

    @Override
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
        AnalyticsListener.CC.$default$onVideoDecoderInitialized(this, eventTime, str, j, j2);
    }

    @Override
    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
        AnalyticsListener.CC.$default$onVideoDecoderReleased(this, eventTime, str);
    }

    @Override
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        AnalyticsListener.CC.$default$onVideoDisabled(this, eventTime, decoderCounters);
    }

    @Override
    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
        AnalyticsListener.CC.$default$onVideoEnabled(this, eventTime, decoderCounters);
    }

    @Override
    public void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
        AnalyticsListener.CC.$default$onVideoFrameProcessingOffset(this, eventTime, j, i);
    }

    @Override
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
        AnalyticsListener.CC.$default$onVideoInputFormatChanged(this, eventTime, format);
    }

    @Override
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.CC.$default$onVideoInputFormatChanged(this, eventTime, format, decoderReuseEvaluation);
    }

    @Override
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
        AnalyticsListener.CC.$default$onVideoSizeChanged(this, eventTime, i, i2, i3, f);
    }

    @Override
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
        AnalyticsListener.CC.$default$onVideoSizeChanged(this, eventTime, videoSize);
    }

    @Override
    public void onVolumeChanged(float f) {
        Player.Listener.CC.$default$onVolumeChanged(this, f);
    }

    @Override
    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
        AnalyticsListener.CC.$default$onVolumeChanged(this, eventTime, f);
    }

    public boolean createdWithAudioTrack() {
        return !this.audioDisabled;
    }

    public VideoPlayer() {
        this(true, false);
    }

    public VideoPlayer(boolean z, boolean z2) {
        this.audioUpdateHandler = new Handler(Looper.getMainLooper());
        this.handleAudioFocus = false;
        this.audioDisabled = z2;
        this.mediaDataSourceFactory = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(ApplicationLoader.applicationContext);
        this.trackSelector = defaultTrackSelector;
        if (z2) {
            defaultTrackSelector.setParameters(defaultTrackSelector.getParameters().buildUpon().setTrackTypeDisabled(1, true).build());
        }
        this.lastReportedPlaybackState = 1;
        this.shouldPauseOther = z;
        if (z) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
        playerCounter++;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.playerDidStartPlaying || ((VideoPlayer) objArr[0]) == this || !isPlaying() || this.allowMultipleInstances) {
            return;
        }
        pause();
    }

    private void ensurePlayerCreated() {
        DefaultLoadControl defaultLoadControl;
        DefaultRenderersFactory defaultRenderersFactory;
        if (this.isStory) {
            defaultLoadControl = new DefaultLoadControl(new DefaultAllocator(true, 65536), 50000, 50000, 1000, 1000, -1, false, 0, false);
        } else {
            defaultLoadControl = new DefaultLoadControl(new DefaultAllocator(true, 65536), 50000, 50000, 100, 5000, -1, false, 0, false);
        }
        if (this.player == null) {
            if (this.audioVisualizerDelegate != null) {
                defaultRenderersFactory = new AudioVisualizerRenderersFactory(ApplicationLoader.applicationContext);
            } else {
                defaultRenderersFactory = new DefaultRenderersFactory(ApplicationLoader.applicationContext);
            }
            defaultRenderersFactory.setExtensionRendererMode(2);
            ExoPlayer build = new ExoPlayer.Builder(ApplicationLoader.applicationContext).setRenderersFactory(defaultRenderersFactory).setTrackSelector(this.trackSelector).setLoadControl(defaultLoadControl).build();
            this.player = build;
            build.addAnalyticsListener(this);
            this.player.addListener(this);
            this.player.addVideoListener(this);
            TextureView textureView = this.textureView;
            if (textureView != null) {
                this.player.setVideoTextureView(textureView);
            } else {
                Surface surface = this.surface;
                if (surface != null) {
                    this.player.setVideoSurface(surface);
                } else {
                    SurfaceView surfaceView = this.surfaceView;
                    if (surfaceView != null) {
                        this.player.setVideoSurfaceView(surfaceView);
                    }
                }
            }
            this.player.setPlayWhenReady(this.autoplay);
            this.player.setRepeatMode(this.looping ? 2 : 0);
        }
        if (this.mixedAudio && this.audioPlayer == null) {
            SimpleExoPlayer buildSimpleExoPlayer = new ExoPlayer.Builder(ApplicationLoader.applicationContext).setTrackSelector(this.trackSelector).setLoadControl(defaultLoadControl).buildSimpleExoPlayer();
            this.audioPlayer = buildSimpleExoPlayer;
            buildSimpleExoPlayer.addListener(new Player.Listener() {
                @Override
                public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                    Player.Listener.CC.$default$onAudioAttributesChanged(this, audioAttributes);
                }

                @Override
                public void onAvailableCommandsChanged(Player.Commands commands) {
                    Player.Listener.CC.$default$onAvailableCommandsChanged(this, commands);
                }

                @Override
                public void onCues(CueGroup cueGroup) {
                    Player.Listener.CC.$default$onCues(this, cueGroup);
                }

                @Override
                public void onCues(List list) {
                    Player.Listener.CC.$default$onCues(this, list);
                }

                @Override
                public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                    Player.Listener.CC.$default$onDeviceInfoChanged(this, deviceInfo);
                }

                @Override
                public void onDeviceVolumeChanged(int i, boolean z) {
                    Player.Listener.CC.$default$onDeviceVolumeChanged(this, i, z);
                }

                @Override
                public void onEvents(Player player, Player.Events events) {
                    Player.Listener.CC.$default$onEvents(this, player, events);
                }

                @Override
                public void onIsLoadingChanged(boolean z) {
                    Player.Listener.CC.$default$onIsLoadingChanged(this, z);
                }

                @Override
                public void onIsPlayingChanged(boolean z) {
                    Player.Listener.CC.$default$onIsPlayingChanged(this, z);
                }

                @Override
                public void onLoadingChanged(boolean z) {
                    Player.Listener.CC.$default$onLoadingChanged(this, z);
                }

                @Override
                public void onMediaItemTransition(MediaItem mediaItem, int i) {
                    Player.Listener.CC.$default$onMediaItemTransition(this, mediaItem, i);
                }

                @Override
                public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                    Player.Listener.CC.$default$onMediaMetadataChanged(this, mediaMetadata);
                }

                @Override
                public void onMetadata(Metadata metadata) {
                    Player.Listener.CC.$default$onMetadata(this, metadata);
                }

                @Override
                public void onPlayWhenReadyChanged(boolean z, int i) {
                    Player.Listener.CC.$default$onPlayWhenReadyChanged(this, z, i);
                }

                @Override
                public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                    Player.Listener.CC.$default$onPlaybackParametersChanged(this, playbackParameters);
                }

                @Override
                public void onPlaybackStateChanged(int i) {
                    Player.Listener.CC.$default$onPlaybackStateChanged(this, i);
                }

                @Override
                public void onPlaybackSuppressionReasonChanged(int i) {
                    Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(this, i);
                }

                @Override
                public void onPlayerError(PlaybackException playbackException) {
                    Player.Listener.CC.$default$onPlayerError(this, playbackException);
                }

                @Override
                public void onPlayerErrorChanged(PlaybackException playbackException) {
                    Player.Listener.CC.$default$onPlayerErrorChanged(this, playbackException);
                }

                @Override
                public void onPositionDiscontinuity(int i) {
                    Player.Listener.CC.$default$onPositionDiscontinuity(this, i);
                }

                @Override
                public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                    Player.Listener.CC.$default$onPositionDiscontinuity(this, positionInfo, positionInfo2, i);
                }

                @Override
                public void onRenderedFirstFrame() {
                    Player.Listener.CC.$default$onRenderedFirstFrame(this);
                }

                @Override
                public void onRepeatModeChanged(int i) {
                    Player.Listener.CC.$default$onRepeatModeChanged(this, i);
                }

                @Override
                public void onSeekProcessed() {
                    Player.Listener.CC.$default$onSeekProcessed(this);
                }

                @Override
                public void onSkipSilenceEnabledChanged(boolean z) {
                    Player.Listener.CC.$default$onSkipSilenceEnabledChanged(this, z);
                }

                @Override
                public void onSurfaceSizeChanged(int i, int i2) {
                    Player.Listener.CC.$default$onSurfaceSizeChanged(this, i, i2);
                }

                @Override
                public void onTimelineChanged(Timeline timeline, int i) {
                    Player.Listener.CC.$default$onTimelineChanged(this, timeline, i);
                }

                @Override
                public void onTracksChanged(Tracks tracks) {
                    Player.Listener.CC.$default$onTracksChanged(this, tracks);
                }

                @Override
                public void onVideoSizeChanged(VideoSize videoSize) {
                    Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
                }

                @Override
                public void onVolumeChanged(float f) {
                    Player.Listener.CC.$default$onVolumeChanged(this, f);
                }

                {
                    VideoPlayer.this = this;
                }

                @Override
                public void onPlayerStateChanged(boolean z, int i) {
                    if (VideoPlayer.this.audioPlayerReady || i != 3) {
                        return;
                    }
                    VideoPlayer.this.audioPlayerReady = true;
                    VideoPlayer.this.checkPlayersReady();
                }
            });
            this.audioPlayer.setPlayWhenReady(this.autoplay);
        }
    }

    public void preparePlayerLoop(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        this.videoUri = uri;
        this.audioUri = uri2;
        this.videoType = str;
        this.audioType = str2;
        this.loopingMediaSource = true;
        this.mixedAudio = true;
        this.audioPlayerReady = false;
        this.videoPlayerReady = false;
        ensurePlayerCreated();
        LoopingMediaSource loopingMediaSource = null;
        LoopingMediaSource loopingMediaSource2 = null;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            LoopingMediaSource loopingMediaSource3 = new LoopingMediaSource(mediaSourceFromUri(uri3, str3));
            if (i == 0) {
                loopingMediaSource = loopingMediaSource3;
            } else {
                loopingMediaSource2 = loopingMediaSource3;
            }
        }
        this.player.setMediaSource(loopingMediaSource, true);
        this.player.prepare();
        this.audioPlayer.setMediaSource(loopingMediaSource2, true);
        this.audioPlayer.prepare();
    }

    private MediaSource mediaSourceFromUri(Uri uri, String str) {
        MediaItem build = new MediaItem.Builder().setUri(uri).build();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3680:
                if (str.equals("ss")) {
                    c = 0;
                    break;
                }
                break;
            case 103407:
                if (str.equals("hls")) {
                    c = 1;
                    break;
                }
                break;
            case 3075986:
                if (str.equals("dash")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (this.ssMediaSourceFactory == null) {
                    this.ssMediaSourceFactory = new SsMediaSource.Factory(this.mediaDataSourceFactory);
                }
                return this.ssMediaSourceFactory.createMediaSource(build);
            case 1:
                if (this.hlsMediaSourceFactory == null) {
                    this.hlsMediaSourceFactory = new HlsMediaSource.Factory(this.mediaDataSourceFactory);
                }
                return this.hlsMediaSourceFactory.createMediaSource(build);
            case 2:
                if (this.dashMediaSourceFactory == null) {
                    this.dashMediaSourceFactory = new DashMediaSource.Factory(this.mediaDataSourceFactory);
                }
                return this.dashMediaSourceFactory.createMediaSource(build);
            default:
                if (this.progressiveMediaSourceFactory == null) {
                    this.progressiveMediaSourceFactory = new ProgressiveMediaSource.Factory(this.mediaDataSourceFactory);
                }
                return this.progressiveMediaSourceFactory.createMediaSource(build);
        }
    }

    public void preparePlayer(Uri uri, String str) {
        preparePlayer(uri, str, 3);
    }

    public void preparePlayer(Uri uri, String str, int i) {
        this.videoUri = uri;
        this.videoType = str;
        this.audioUri = null;
        this.audioType = null;
        boolean z = false;
        this.loopingMediaSource = false;
        this.videoPlayerReady = false;
        this.mixedAudio = false;
        this.currentUri = uri;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null && !scheme.startsWith("file")) {
            z = true;
        }
        this.isStreaming = z;
        ensurePlayerCreated();
        this.player.setMediaSource(mediaSourceFromUri(uri, str), true);
        this.player.prepare();
    }

    public boolean isPlayerPrepared() {
        return this.player != null;
    }

    public void releasePlayer(boolean z) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.release();
            this.player = null;
        }
        ExoPlayer exoPlayer2 = this.audioPlayer;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
            this.audioPlayer = null;
        }
        if (this.shouldPauseOther) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
        playerCounter--;
    }

    @Override
    public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        VideoPlayerDelegate videoPlayerDelegate = this.delegate;
        if (videoPlayerDelegate != null) {
            videoPlayerDelegate.onSeekStarted(eventTime);
        }
    }

    @Override
    public void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        VideoPlayerDelegate videoPlayerDelegate = this.delegate;
        if (videoPlayerDelegate != null) {
            videoPlayerDelegate.onSeekFinished(eventTime);
        }
    }

    @Override
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        VideoPlayerDelegate videoPlayerDelegate = this.delegate;
        if (videoPlayerDelegate != null) {
            videoPlayerDelegate.onRenderedFirstFrame(eventTime);
        }
    }

    public void setTextureView(TextureView textureView) {
        if (this.textureView == textureView) {
            return;
        }
        this.textureView = textureView;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.setVideoTextureView(textureView);
    }

    public void setSurfaceView(SurfaceView surfaceView) {
        if (this.surfaceView == surfaceView) {
            return;
        }
        this.surfaceView = surfaceView;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.setVideoSurfaceView(surfaceView);
    }

    public void setSurface(Surface surface) {
        if (this.surface == surface) {
            return;
        }
        this.surface = surface;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        exoPlayer.setVideoSurface(surface);
    }

    public boolean getPlayWhenReady() {
        return this.player.getPlayWhenReady();
    }

    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    public Uri getCurrentUri() {
        return this.currentUri;
    }

    public void play() {
        this.mixedPlayWhenReady = true;
        if (this.mixedAudio && (!this.audioPlayerReady || !this.videoPlayerReady)) {
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.setPlayWhenReady(false);
            }
            ExoPlayer exoPlayer2 = this.audioPlayer;
            if (exoPlayer2 != null) {
                exoPlayer2.setPlayWhenReady(false);
                return;
            }
            return;
        }
        ExoPlayer exoPlayer3 = this.player;
        if (exoPlayer3 != null) {
            exoPlayer3.setPlayWhenReady(true);
        }
        ExoPlayer exoPlayer4 = this.audioPlayer;
        if (exoPlayer4 != null) {
            exoPlayer4.setPlayWhenReady(true);
        }
    }

    public void pause() {
        this.mixedPlayWhenReady = false;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(false);
        }
        ExoPlayer exoPlayer2 = this.audioPlayer;
        if (exoPlayer2 != null) {
            exoPlayer2.setPlayWhenReady(false);
        }
        if (this.audioVisualizerDelegate != null) {
            this.audioUpdateHandler.removeCallbacksAndMessages(null);
            this.audioVisualizerDelegate.onVisualizerUpdate(false, true, null);
        }
    }

    public void setPlaybackSpeed(float f) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setPlaybackParameters(new PlaybackParameters(f, f > 1.0f ? 0.98f : 1.0f));
        }
    }

    public void setPlayWhenReady(boolean z) {
        this.mixedPlayWhenReady = z;
        if (z && this.mixedAudio && (!this.audioPlayerReady || !this.videoPlayerReady)) {
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.setPlayWhenReady(false);
            }
            ExoPlayer exoPlayer2 = this.audioPlayer;
            if (exoPlayer2 != null) {
                exoPlayer2.setPlayWhenReady(false);
                return;
            }
            return;
        }
        this.autoplay = z;
        ExoPlayer exoPlayer3 = this.player;
        if (exoPlayer3 != null) {
            exoPlayer3.setPlayWhenReady(z);
        }
        ExoPlayer exoPlayer4 = this.audioPlayer;
        if (exoPlayer4 != null) {
            exoPlayer4.setPlayWhenReady(z);
        }
    }

    public long getDuration() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return exoPlayer.getDuration();
        }
        return 0L;
    }

    public long getCurrentPosition() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return exoPlayer.getCurrentPosition();
        }
        return 0L;
    }

    public boolean isMuted() {
        ExoPlayer exoPlayer = this.player;
        return exoPlayer != null && exoPlayer.getVolume() == 0.0f;
    }

    public void setMute(boolean z) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setVolume(z ? 0.0f : 1.0f);
        }
        ExoPlayer exoPlayer2 = this.audioPlayer;
        if (exoPlayer2 != null) {
            exoPlayer2.setVolume(z ? 0.0f : 1.0f);
        }
    }

    public void setVolume(float f) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setVolume(f);
        }
        ExoPlayer exoPlayer2 = this.audioPlayer;
        if (exoPlayer2 != null) {
            exoPlayer2.setVolume(f);
        }
    }

    public void seekTo(long j) {
        seekTo(j, false);
    }

    public void seekTo(long j, boolean z) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setSeekParameters(z ? SeekParameters.CLOSEST_SYNC : SeekParameters.EXACT);
            this.player.seekTo(j);
        }
    }

    public void setDelegate(VideoPlayerDelegate videoPlayerDelegate) {
        this.delegate = videoPlayerDelegate;
    }

    public void setAudioVisualizerDelegate(AudioVisualizerDelegate audioVisualizerDelegate) {
        this.audioVisualizerDelegate = audioVisualizerDelegate;
    }

    public long getBufferedPosition() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return this.isStreaming ? exoPlayer.getBufferedPosition() : exoPlayer.getDuration();
        }
        return 0L;
    }

    public boolean isPlaying() {
        ExoPlayer exoPlayer;
        return (this.mixedAudio && this.mixedPlayWhenReady) || ((exoPlayer = this.player) != null && exoPlayer.getPlayWhenReady());
    }

    public boolean isBuffering() {
        return this.player != null && this.lastReportedPlaybackState == 2;
    }

    public void setStreamType(int i) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(i == 0 ? 2 : 1).build(), this.handleAudioFocus);
        }
        ExoPlayer exoPlayer2 = this.audioPlayer;
        if (exoPlayer2 != null) {
            exoPlayer2.setAudioAttributes(new AudioAttributes.Builder().setUsage(i != 0 ? 1 : 2).build(), true);
        }
    }

    public void setLooping(boolean z) {
        if (this.looping != z) {
            this.looping = z;
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.setRepeatMode(z ? 2 : 0);
            }
        }
    }

    public boolean isLooping() {
        return this.looping;
    }

    public void checkPlayersReady() {
        if (this.audioPlayerReady && this.videoPlayerReady && this.mixedPlayWhenReady) {
            play();
        }
    }

    @Override
    public void onPlayerStateChanged(boolean z, int i) {
        maybeReportPlayerState();
        if (z && i == 3 && !isMuted() && this.shouldPauseOther) {
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
        }
        if (!this.videoPlayerReady && i == 3) {
            this.videoPlayerReady = true;
            checkPlayersReady();
        }
        if (i != 3) {
            this.audioUpdateHandler.removeCallbacksAndMessages(null);
            AudioVisualizerDelegate audioVisualizerDelegate = this.audioVisualizerDelegate;
            if (audioVisualizerDelegate != null) {
                audioVisualizerDelegate.onVisualizerUpdate(false, true, null);
            }
        }
    }

    @Override
    public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        if (i == 0) {
            this.repeatCount++;
        }
    }

    @Override
    public void onPlayerError(final PlaybackException playbackException) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VideoPlayer.this.lambda$onPlayerError$1(playbackException);
            }
        });
    }

    public void lambda$onPlayerError$1(PlaybackException playbackException) {
        Throwable cause = playbackException.getCause();
        TextureView textureView = this.textureView;
        if (textureView != null && ((!this.triedReinit && (cause instanceof MediaCodecRenderer.DecoderInitializationException)) || (cause instanceof SurfaceNotValidException))) {
            this.triedReinit = true;
            if (this.player != null) {
                ViewGroup viewGroup = (ViewGroup) textureView.getParent();
                if (viewGroup != null) {
                    int indexOfChild = viewGroup.indexOfChild(this.textureView);
                    viewGroup.removeView(this.textureView);
                    viewGroup.addView(this.textureView, indexOfChild);
                }
                DispatchQueue dispatchQueue = this.workerQueue;
                if (dispatchQueue != null) {
                    dispatchQueue.postRunnable(new Runnable() {
                        @Override
                        public final void run() {
                            VideoPlayer.this.lambda$onPlayerError$0();
                        }
                    });
                    return;
                }
                this.player.clearVideoTextureView(this.textureView);
                this.player.setVideoTextureView(this.textureView);
                if (this.loopingMediaSource) {
                    preparePlayerLoop(this.videoUri, this.videoType, this.audioUri, this.audioType);
                } else {
                    preparePlayer(this.videoUri, this.videoType);
                }
                play();
                return;
            }
            return;
        }
        this.delegate.onError(this, playbackException);
    }

    public void lambda$onPlayerError$0() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.clearVideoTextureView(this.textureView);
            this.player.setVideoTextureView(this.textureView);
            if (this.loopingMediaSource) {
                preparePlayerLoop(this.videoUri, this.videoType, this.audioUri, this.audioType);
            } else {
                preparePlayer(this.videoUri, this.videoType);
            }
            play();
        }
    }

    @Override
    public void onVideoSizeChanged(VideoSize videoSize) {
        this.delegate.onVideoSizeChanged(videoSize.width, videoSize.height, videoSize.unappliedRotationDegrees, videoSize.pixelWidthHeightRatio);
        Player.Listener.CC.$default$onVideoSizeChanged(this, videoSize);
    }

    @Override
    public void onRenderedFirstFrame() {
        this.delegate.onRenderedFirstFrame();
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return this.delegate.onSurfaceDestroyed(surfaceTexture);
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.delegate.onSurfaceTextureUpdated(surfaceTexture);
    }

    private void maybeReportPlayerState() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return;
        }
        boolean playWhenReady = exoPlayer.getPlayWhenReady();
        int playbackState = this.player.getPlaybackState();
        if (this.lastReportedPlayWhenReady == playWhenReady && this.lastReportedPlaybackState == playbackState) {
            return;
        }
        this.delegate.onStateChanged(playWhenReady, playbackState);
        this.lastReportedPlayWhenReady = playWhenReady;
        this.lastReportedPlaybackState = playbackState;
    }

    public class AudioVisualizerRenderersFactory extends DefaultRenderersFactory {
        public AudioVisualizerRenderersFactory(Context context) {
            super(context);
            VideoPlayer.this = r1;
        }

        @Override
        protected AudioSink buildAudioSink(Context context, boolean z, boolean z2, boolean z3) {
            return new DefaultAudioSink.Builder().setAudioCapabilities(AudioCapabilities.getCapabilities(context)).setEnableFloatOutput(z).setEnableAudioTrackPlaybackParams(z2).setAudioProcessors(new AudioProcessor[]{new TeeAudioProcessor(new VisualizerBufferSink())}).setOffloadMode(z3 ? 1 : 0).build();
        }
    }

    public class VisualizerBufferSink implements TeeAudioProcessor.AudioBufferSink {
        ByteBuffer byteBuffer;
        long lastUpdateTime;
        FourierTransform.FFT fft = new FourierTransform.FFT(1024, 48000.0f);
        float[] real = new float[1024];
        int position = 0;

        @Override
        public void flush(int i, int i2, int i3) {
        }

        public VisualizerBufferSink() {
            VideoPlayer.this = r3;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(8192);
            this.byteBuffer = allocateDirect;
            allocateDirect.position(0);
        }

        @Override
        public void handleBuffer(ByteBuffer byteBuffer) {
            if (VideoPlayer.this.audioVisualizerDelegate == null) {
                return;
            }
            if (byteBuffer != AudioProcessor.EMPTY_BUFFER && VideoPlayer.this.mixedPlayWhenReady) {
                if (VideoPlayer.this.audioVisualizerDelegate.needUpdate()) {
                    int limit = byteBuffer.limit();
                    int i = 0;
                    if (limit > 8192) {
                        VideoPlayer.this.audioUpdateHandler.removeCallbacksAndMessages(null);
                        VideoPlayer.this.audioVisualizerDelegate.onVisualizerUpdate(false, true, null);
                        return;
                    }
                    this.byteBuffer.put(byteBuffer);
                    int i2 = this.position + limit;
                    this.position = i2;
                    if (i2 >= 1024) {
                        this.byteBuffer.position(0);
                        for (int i3 = 0; i3 < 1024; i3++) {
                            this.real[i3] = this.byteBuffer.getShort() / 32768.0f;
                        }
                        this.byteBuffer.rewind();
                        this.position = 0;
                        this.fft.forward(this.real);
                        int i4 = 0;
                        float f = 0.0f;
                        while (true) {
                            float f2 = 1.0f;
                            if (i4 >= 1024) {
                                break;
                            }
                            float f3 = this.fft.getSpectrumReal()[i4];
                            float f4 = this.fft.getSpectrumImaginary()[i4];
                            float sqrt = ((float) Math.sqrt((f3 * f3) + (f4 * f4))) / 30.0f;
                            if (sqrt <= 1.0f) {
                                f2 = sqrt < 0.0f ? 0.0f : sqrt;
                            }
                            f += f2 * f2;
                            i4++;
                        }
                        float sqrt2 = (float) Math.sqrt(f / 1024);
                        final float[] fArr = new float[7];
                        fArr[6] = sqrt2;
                        if (sqrt2 < 0.4f) {
                            while (i < 7) {
                                fArr[i] = 0.0f;
                                i++;
                            }
                        } else {
                            while (i < 6) {
                                int i5 = 170 * i;
                                float f5 = this.fft.getSpectrumReal()[i5];
                                float f6 = this.fft.getSpectrumImaginary()[i5];
                                fArr[i] = (float) (Math.sqrt((f5 * f5) + (f6 * f6)) / 30.0d);
                                if (fArr[i] > 1.0f) {
                                    fArr[i] = 1.0f;
                                } else if (fArr[i] < 0.0f) {
                                    fArr[i] = 0.0f;
                                }
                                i++;
                            }
                        }
                        if (System.currentTimeMillis() - this.lastUpdateTime < 64) {
                            return;
                        }
                        this.lastUpdateTime = System.currentTimeMillis();
                        VideoPlayer.this.audioUpdateHandler.postDelayed(new Runnable() {
                            @Override
                            public final void run() {
                                VideoPlayer.VisualizerBufferSink.this.lambda$handleBuffer$1(fArr);
                            }
                        }, 130L);
                        return;
                    }
                    return;
                }
                return;
            }
            VideoPlayer.this.audioUpdateHandler.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    VideoPlayer.VisualizerBufferSink.this.lambda$handleBuffer$0();
                }
            }, 80L);
        }

        public void lambda$handleBuffer$0() {
            VideoPlayer.this.audioUpdateHandler.removeCallbacksAndMessages(null);
            VideoPlayer.this.audioVisualizerDelegate.onVisualizerUpdate(false, true, null);
        }

        public void lambda$handleBuffer$1(float[] fArr) {
            VideoPlayer.this.audioVisualizerDelegate.onVisualizerUpdate(true, true, fArr);
        }
    }

    public boolean isHDR() {
        ColorInfo colorInfo;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null) {
            return false;
        }
        try {
            Format videoFormat = exoPlayer.getVideoFormat();
            if (videoFormat != null && (colorInfo = videoFormat.colorInfo) != null) {
                int i = colorInfo.colorTransfer;
                return i == 6 || i == 7;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public StoryEntry.HDRInfo getHDRStaticInfo(StoryEntry.HDRInfo hDRInfo) {
        if (hDRInfo == null) {
            hDRInfo = new StoryEntry.HDRInfo();
        }
        try {
            MediaFormat mediaFormat = ((MediaCodecRenderer) this.player.getRenderer(0)).codecOutputMediaFormat;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            if (byteBuffer.get() == 0) {
                byteBuffer.getShort(17);
                byteBuffer.getShort(19);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                if (mediaFormat.containsKey("color-transfer")) {
                    hDRInfo.colorTransfer = mediaFormat.getInteger("color-transfer");
                }
                if (mediaFormat.containsKey("color-standard")) {
                    hDRInfo.colorStandard = mediaFormat.getInteger("color-standard");
                }
                if (mediaFormat.containsKey("color-range")) {
                    mediaFormat.getInteger("color-range");
                }
            }
        } catch (Exception unused) {
        }
        return hDRInfo;
    }

    public void setWorkerQueue(DispatchQueue dispatchQueue) {
        this.workerQueue = dispatchQueue;
        this.player.setWorkerQueue(dispatchQueue);
    }

    public void setIsStory() {
        this.isStory = true;
    }
}

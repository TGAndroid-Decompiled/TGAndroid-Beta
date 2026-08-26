package org.telegram.ui.Components;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.LongSparseArray;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatBackgroundHelper;
import androidx.core.util.AtomicFile;
import androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.BasePlayer;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.DefaultRenderersFactory;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayer$Builder$$ExternalSyntheticLambda2;
import com.google.android.exoplayer2.ExoPlayerImpl;
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
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioCapabilities;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.TeeAudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.drm.DrmSessionManager$1;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.LoopingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.SurfaceNotValidException;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.stripe.android.time.Clock;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FourierTransform;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.chromecast.ChromecastMedia;
import org.telegram.messenger.chromecast.ChromecastMediaVariations;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.iv.Latex;
import org.telegram.ui.iv.RichMediaCell;

public class VideoPlayer implements Player.Listener, VideoListener, AnalyticsListener, NotificationCenter.NotificationCenterDelegate {
    public static final int QUALITY_AUTO = -1;
    private static HashMap<String, Boolean> cachedSupportedCodec;
    private static int lastPlayerId;
    public boolean allowMultipleInstances;
    boolean audioDisabled;
    private ExoPlayer audioPlayer;
    private boolean audioPlayerReady;
    private String audioType;
    Handler audioUpdateHandler;
    private Uri audioUri;
    private AudioVisualizerDelegate audioVisualizerDelegate;
    private boolean autoIsOriginal;
    private boolean autoplay;
    private DefaultBandwidthMeter bandwidthMeter;
    private boolean currentStreamIsHls;
    private Uri currentUri;
    MediaSource.Factory dashMediaSourceFactory;
    private VideoPlayerDelegate delegate;
    private long fallbackDuration;
    private long fallbackPosition;
    private boolean handleAudioFocus;
    HlsMediaSource.Factory hlsMediaSourceFactory;
    private boolean isStory;
    private boolean isStreaming;
    private boolean lastReportedPlayWhenReady;
    private int lastReportedPlaybackState;
    private Looper looper;
    private boolean looping;
    private boolean loopingMediaSource;
    private ArrayList<VideoUri> manifestUris;
    private ExtendedDefaultDataSourceFactory mediaDataSourceFactory;
    private boolean mixedAudio;
    private boolean mixedPlayWhenReady;
    private Runnable onQualityChangeListener;
    public ExoPlayer player;
    public final int playerId;
    ProgressiveMediaSource.Factory progressiveMediaSourceFactory;
    private int repeatCount;
    private final ArrayList<Runnable> seekFinishedListeners;
    private int selectedQualityIndex;
    private boolean shouldPauseOther;
    private Surface surface;
    private SurfaceView surfaceView;
    private TextureView textureView;
    private MappingTrackSelector trackSelector;
    private boolean triedReinit;
    private boolean videoPlayerReady;
    private ArrayList<Quality> videoQualities;
    private Quality videoQualityToSelect;
    private String videoType;
    private Uri videoUri;
    private DispatchQueue workerQueue;
    public static final HashSet<Integer> activePlayers = new HashSet<>();
    static int playerCounter = 0;

    public interface AudioVisualizerDelegate {
        boolean needUpdate();

        void onVisualizerUpdate(boolean z, boolean z2, float[] fArr);
    }

    public class AudioVisualizerRenderersFactory extends DefaultRenderersFactory {
        public AudioVisualizerRenderersFactory(Context context) {
            super(context);
        }

        @Override
        public AudioSink buildAudioSink(Context context, boolean z, boolean z2, boolean z3) {
            DefaultAudioSink.Builder builder = new DefaultAudioSink.Builder();
            AudioCapabilities capabilities = AudioCapabilities.getCapabilities(context);
            capabilities.getClass();
            builder.audioCapabilities = capabilities;
            builder.enableFloatOutput = z;
            builder.enableAudioTrackPlaybackParams = z2;
            builder.audioProcessorChain = new AtomicFile(new AudioProcessor[]{new TeeAudioProcessor(VideoPlayer.this.new VisualizerBufferSink())});
            builder.offloadMode = z3 ? 1 : 0;
            return new DefaultAudioSink(builder);
        }
    }

    public static class OffsetDataSource implements DataSource {
        private final long byteOffset;
        private final DataSource upstream;

        public OffsetDataSource(DataSource dataSource, long j) {
            this.upstream = dataSource;
            this.byteOffset = j;
        }

        @Override
        public void addTransferListener(TransferListener transferListener) {
            this.upstream.addTransferListener(transferListener);
        }

        @Override
        public void close() {
            this.upstream.close();
        }

        @Override
        public Map<String, List<String>> getResponseHeaders() {
            return this.upstream.getResponseHeaders();
        }

        @Override
        public Uri getUri() {
            return this.upstream.getUri();
        }

        @Override
        public long open(DataSpec dataSpec) {
            dataSpec.getClass();
            Uri uri = dataSpec.uri;
            long j = this.byteOffset + dataSpec.position;
            Log.checkStateNotNull(uri, "The uri must be set.");
            return this.upstream.open(new DataSpec(uri, dataSpec.httpBody, dataSpec.httpRequestHeaders, j, dataSpec.length, dataSpec.key, dataSpec.flags));
        }

        @Override
        public int read(byte[] bArr, int i, int i2) {
            return this.upstream.read(bArr, i, i2);
        }
    }

    public static class Quality {
        public int height;
        public boolean original;
        public final ArrayList<VideoUri> uris;
        public int width;

        public Quality(VideoUri videoUri) {
            ArrayList<VideoUri> arrayList = new ArrayList<>();
            this.uris = arrayList;
            this.original = videoUri.original;
            this.width = videoUri.width;
            this.height = videoUri.height;
            arrayList.add(videoUri);
        }

        public static ArrayList<Quality> filterByCodec(ArrayList<Quality> arrayList) {
            if (arrayList == null) {
                return null;
            }
            int i = 0;
            while (i < arrayList.size()) {
                Quality quality = arrayList.get(i);
                int i2 = 0;
                while (i2 < quality.uris.size()) {
                    VideoUri videoUri = quality.uris.get(i2);
                    if (!TextUtils.isEmpty(videoUri.codec) && !VideoPlayer.supportsHardwareDecoder(videoUri.codec)) {
                        quality.uris.remove(i2);
                        i2--;
                    }
                    i2++;
                }
                if (quality.uris.isEmpty()) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
            return arrayList;
        }

        public static ArrayList<Quality> group(ArrayList<VideoUri> arrayList) {
            Quality quality;
            ArrayList<Quality> arrayList2 = new ArrayList<>();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                VideoUri videoUri = arrayList.get(i);
                i++;
                VideoUri videoUri2 = videoUri;
                if (videoUri2.original) {
                    arrayList2.add(new Quality(videoUri2));
                } else {
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            quality = null;
                            break;
                        }
                        Quality quality2 = arrayList2.get(i2);
                        i2++;
                        quality = quality2;
                        if (!quality.original && quality.width == videoUri2.width && quality.height == videoUri2.height) {
                            break;
                        }
                    }
                    if (quality == null || SharedConfig.debugVideoQualities) {
                        arrayList2.add(new Quality(videoUri2));
                    } else {
                        quality.uris.add(videoUri2);
                    }
                }
            }
            return arrayList2;
        }

        public TLRPC.Document getDownloadDocument() {
            VideoUri videoUri = null;
            if (this.uris.isEmpty()) {
                return null;
            }
            ArrayList<VideoUri> arrayList = this.uris;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                VideoUri videoUri2 = arrayList.get(i);
                i++;
                VideoUri videoUri3 = videoUri2;
                if (videoUri3.isCached()) {
                    return videoUri3.document;
                }
            }
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < this.uris.size(); i2++) {
                VideoUri videoUri4 = this.uris.get(i2);
                if (videoUri4.size < j && VideoPlayer.supportsHardwareDecoder(videoUri4.codec)) {
                    j = videoUri4.size;
                    videoUri = videoUri4;
                }
            }
            return videoUri != null ? videoUri.document : this.uris.get(0).document;
        }

        public VideoUri getDownloadUri() {
            VideoUri videoUri = null;
            if (this.uris.isEmpty()) {
                return null;
            }
            ArrayList<VideoUri> arrayList = this.uris;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                VideoUri videoUri2 = arrayList.get(i);
                i++;
                VideoUri videoUri3 = videoUri2;
                if (videoUri3.isCached()) {
                    return videoUri3;
                }
            }
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < this.uris.size(); i2++) {
                VideoUri videoUri4 = this.uris.get(i2);
                if (videoUri4.size < j && VideoPlayer.supportsHardwareDecoder(videoUri4.codec)) {
                    j = videoUri4.size;
                    videoUri = videoUri4;
                }
            }
            return videoUri != null ? videoUri : this.uris.get(0);
        }

        public int p() {
            int iMin = Math.min(this.width, this.height);
            if (Math.abs(iMin - 2160) < 55) {
                return 2160;
            }
            if (Math.abs(iMin - 1440) < 55) {
                return 1440;
            }
            if (Math.abs(iMin - 1080) < 55) {
                return 1080;
            }
            if (Math.abs(iMin - 720) < 55) {
                return 720;
            }
            if (Math.abs(iMin - 480) < 55) {
                return 480;
            }
            if (Math.abs(iMin - 360) < 55) {
                return 360;
            }
            if (Math.abs(iMin - 240) < 55) {
                return 240;
            }
            if (Math.abs(iMin - 144) < 55) {
                return 144;
            }
            return iMin;
        }

        public String toString() {
            String str;
            String str2 = "";
            if (!SharedConfig.debugVideoQualities) {
                StringBuilder sb = new StringBuilder();
                sb.append(p());
                sb.append("p");
                if (this.original) {
                    str2 = " (" + LocaleController.getString(R.string.QualitySource) + ")";
                }
                sb.append(str2);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.width);
            sb2.append("x");
            sb2.append(this.height);
            if (this.original) {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append("\n");
            sb2.append(AndroidUtilities.formatFileSize((long) this.uris.get(0).bitrate).replace(" ", ""));
            sb2.append("/s");
            if (this.uris.get(0).codec != null) {
                str2 = ", " + this.uris.get(0).codec;
            }
            sb2.append(str2);
            return sb2.toString();
        }
    }

    public static class VideoUri {
        public double bitrate;
        public String codec;
        public int currentAccount;
        public long docId;
        public TLRPC.Document document;
        public double duration;
        public long fileVideoOffset;
        public int height;
        public Uri m3u8uri;
        public long manifestDocId;
        public TLRPC.Document manifestDocument;
        public MediaItem mediaItem;
        public boolean original;
        public long size;
        public Uri uri;
        public int width;

        public static Uri getUri(int i, TLRPC.Document document, int i2) {
            StringBuilder sbM = DiffUtil.m(i, "?account=", "&id=");
            sbM.append(document.id);
            sbM.append("&hash=");
            sbM.append(document.access_hash);
            sbM.append("&dc=");
            sbM.append(document.dc_id);
            sbM.append("&size=");
            sbM.append(document.size);
            sbM.append("&mime=");
            sbM.append(URLEncoder.encode(document.mime_type, "UTF-8"));
            sbM.append("&rid=");
            sbM.append(i2);
            sbM.append("&name=");
            sbM.append(URLEncoder.encode(FileLoader.getDocumentFileName(document), "UTF-8"));
            sbM.append("&reference=");
            byte[] bArr = document.file_reference;
            if (bArr == null) {
                bArr = new byte[0];
            }
            sbM.append(Utilities.bytesToHex(bArr));
            return Uri.parse("tg://" + MessageObject.getFileName(document) + sbM.toString());
        }

        public static VideoUri of(int i, TLRPC.Document document, TLRPC.Document document2, int i2, boolean z) {
            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo;
            String str;
            VideoUri videoUri = new VideoUri();
            int i3 = 0;
            while (true) {
                if (i3 >= document.attributes.size()) {
                    tL_documentAttributeVideo = null;
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                    tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) documentAttribute;
                    break;
                }
                i3++;
            }
            String lowerCase = (tL_documentAttributeVideo == null || (str = tL_documentAttributeVideo.video_codec) == null) ? null : str.toLowerCase();
            videoUri.currentAccount = i;
            videoUri.document = document;
            videoUri.docId = document.id;
            videoUri.uri = getUri(i, document, i2);
            if (document2 != null) {
                videoUri.manifestDocument = document2;
                videoUri.manifestDocId = document2.id;
                videoUri.m3u8uri = getUri(i, document2, i2);
                File pathToAttach = FileLoader.getInstance(i).getPathToAttach(document2, null, false, z);
                if (pathToAttach == null || !pathToAttach.exists()) {
                    File pathToAttach2 = FileLoader.getInstance(i).getPathToAttach(document2, null, true, z);
                    if (pathToAttach2 != null && pathToAttach2.exists()) {
                        videoUri.m3u8uri = Uri.fromFile(pathToAttach2);
                    }
                } else {
                    videoUri.m3u8uri = Uri.fromFile(pathToAttach);
                }
            }
            videoUri.codec = lowerCase;
            long j = document.size;
            videoUri.size = j;
            if (tL_documentAttributeVideo != null) {
                double d = tL_documentAttributeVideo.duration;
                videoUri.duration = d;
                videoUri.width = tL_documentAttributeVideo.w;
                videoUri.height = tL_documentAttributeVideo.h;
                videoUri.bitrate = j / d;
            }
            File pathToAttach3 = FileLoader.getInstance(i).getPathToAttach(document, null, false, z);
            if (pathToAttach3 != null && pathToAttach3.exists()) {
                videoUri.uri = Uri.fromFile(pathToAttach3);
                return videoUri;
            }
            File pathToAttach4 = FileLoader.getInstance(i).getPathToAttach(document, null, true, z);
            if (pathToAttach4 != null && pathToAttach4.exists()) {
                videoUri.uri = Uri.fromFile(pathToAttach4);
            }
            return videoUri;
        }

        public MediaItem getMediaItem() {
            if (this.mediaItem == null) {
                MediaItem.ClippingConfiguration.Builder builder = new MediaItem.ClippingConfiguration.Builder();
                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
                List list = Collections.EMPTY_LIST;
                ImmutableList.Itr itr2 = ImmutableList.EMPTY_ITR;
                RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
                MediaItem.RequestMetadata requestMetadata = MediaItem.RequestMetadata.EMPTY;
                Uri uri = this.uri;
                this.mediaItem = new MediaItem("", new MediaItem.ClippingProperties(builder), uri != null ? new MediaItem.PlaybackProperties(uri, list, regularImmutableList2) : null, new MediaItem.LiveConfiguration(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), MediaMetadata.EMPTY, requestMetadata);
            }
            return this.mediaItem;
        }

        public boolean isCached() {
            Uri uri = this.uri;
            return uri != null && "file".equalsIgnoreCase(uri.getScheme());
        }

        public boolean isManifestCached() {
            Uri uri = this.m3u8uri;
            return uri != null && "file".equalsIgnoreCase(uri.getScheme());
        }

        public void updateCached(boolean z) {
            if (!isCached() && this.document != null) {
                File pathToAttach = FileLoader.getInstance(this.currentAccount).getPathToAttach(this.document, null, false, z);
                if (pathToAttach == null || !pathToAttach.exists()) {
                    File pathToAttach2 = FileLoader.getInstance(this.currentAccount).getPathToAttach(this.document, null, true, z);
                    if (pathToAttach2 != null && pathToAttach2.exists()) {
                        this.uri = Uri.fromFile(pathToAttach2);
                    }
                } else {
                    this.uri = Uri.fromFile(pathToAttach);
                }
            }
            if (isManifestCached() || this.manifestDocument == null) {
                return;
            }
            File pathToAttach3 = FileLoader.getInstance(this.currentAccount).getPathToAttach(this.manifestDocument, null, false, z);
            if (pathToAttach3 != null && pathToAttach3.exists()) {
                this.m3u8uri = Uri.fromFile(pathToAttach3);
                return;
            }
            File pathToAttach4 = FileLoader.getInstance(this.currentAccount).getPathToAttach(this.manifestDocument, null, true, z);
            if (pathToAttach4 == null || !pathToAttach4.exists()) {
                return;
            }
            this.m3u8uri = Uri.fromFile(pathToAttach4);
        }
    }

    public class VisualizerBufferSink implements TeeAudioProcessor.AudioBufferSink {
        ByteBuffer byteBuffer;
        long lastUpdateTime;
        private final int BUFFER_SIZE = 1024;
        private final int MAX_BUFFER_SIZE = 8192;
        FourierTransform.FFT fft = new FourierTransform.FFT(1024, 48000.0f);
        float[] real = new float[1024];
        int position = 0;

        public VisualizerBufferSink() {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(8192);
            this.byteBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.position(0);
        }

        public void lambda$handleBuffer$0() {
            VideoPlayer.this.audioUpdateHandler.removeCallbacksAndMessages(null);
            VideoPlayer.this.audioVisualizerDelegate.onVisualizerUpdate(false, true, null);
        }

        public void lambda$handleBuffer$1(float[] fArr) {
            VideoPlayer.this.audioVisualizerDelegate.onVisualizerUpdate(true, true, fArr);
        }

        @Override
        public void flush(int i, int i2, int i3) {
        }

        @Override
        public void handleBuffer(ByteBuffer byteBuffer) {
            if (VideoPlayer.this.audioVisualizerDelegate == null) {
                return;
            }
            if (byteBuffer == AudioProcessor.EMPTY_BUFFER || !VideoPlayer.this.mixedPlayWhenReady) {
                VideoPlayer.this.audioUpdateHandler.postDelayed(new ShareAlert$23$$ExternalSyntheticLambda0(this, 12), 80L);
                return;
            }
            if (VideoPlayer.this.audioVisualizerDelegate.needUpdate()) {
                int iLimit = byteBuffer.limit();
                int i = 0;
                if (iLimit > 8192) {
                    VideoPlayer.this.audioUpdateHandler.removeCallbacksAndMessages(null);
                    VideoPlayer.this.audioVisualizerDelegate.onVisualizerUpdate(false, true, null);
                    return;
                }
                this.byteBuffer.put(byteBuffer);
                int i2 = this.position + iLimit;
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
                        float fSqrt = ((float) Math.sqrt((f4 * f4) + (f3 * f3))) / 30.0f;
                        if (fSqrt <= 1.0f) {
                            f2 = fSqrt < 0.0f ? 0.0f : fSqrt;
                        }
                        f += f2 * f2;
                        i4++;
                    }
                    float fSqrt2 = (float) Math.sqrt(f / 1024);
                    float[] fArr = new float[7];
                    fArr[6] = fSqrt2;
                    if (fSqrt2 < 0.4f) {
                        while (i < 7) {
                            fArr[i] = 0.0f;
                            i++;
                        }
                    } else {
                        while (i < 6) {
                            int i5 = 170 * i;
                            float f5 = this.fft.getSpectrumReal()[i5];
                            float f6 = this.fft.getSpectrumImaginary()[i5];
                            float fSqrt3 = (float) (Math.sqrt((f6 * f6) + (f5 * f5)) / 30.0d);
                            fArr[i] = fSqrt3;
                            if (fSqrt3 > 1.0f) {
                                fArr[i] = 1.0f;
                            } else if (fSqrt3 < 0.0f) {
                                fArr[i] = 0.0f;
                            }
                            i++;
                        }
                    }
                    if (System.currentTimeMillis() - this.lastUpdateTime < 64) {
                        return;
                    }
                    this.lastUpdateTime = System.currentTimeMillis();
                    VideoPlayer.this.audioUpdateHandler.postDelayed(new EmojiView$2$$ExternalSyntheticLambda0(23, this, fArr), 130L);
                }
            }
        }
    }

    public VideoPlayer() {
        this(true, false);
    }

    public void checkPlayersReady() {
        if (this.audioPlayerReady && this.videoPlayerReady && this.mixedPlayWhenReady) {
            play();
        }
    }

    private void ensurePlayerCreated() {
        DefaultLoadControl defaultLoadControl = this.isStory ? new DefaultLoadControl(new Latex(), 1000, 1000) : new DefaultLoadControl(new Latex(), 100, 5000);
        if (this.player == null) {
            DefaultRenderersFactory audioVisualizerRenderersFactory = this.audioVisualizerDelegate != null ? new AudioVisualizerRenderersFactory(ApplicationLoader.applicationContext) : new DefaultRenderersFactory(ApplicationLoader.applicationContext);
            audioVisualizerRenderersFactory.setExtensionRendererMode(2);
            ExoPlayer.Builder builder = new ExoPlayer.Builder(ApplicationLoader.applicationContext);
            boolean z = builder.buildCalled;
            if (z) {
                throw new IllegalStateException();
            }
            builder.renderersFactorySupplier = new ExoPlayer$Builder$$ExternalSyntheticLambda2(audioVisualizerRenderersFactory, 2);
            MappingTrackSelector mappingTrackSelector = this.trackSelector;
            if (z) {
                throw new IllegalStateException();
            }
            mappingTrackSelector.getClass();
            builder.trackSelectorSupplier = new ExoPlayer$Builder$$ExternalSyntheticLambda2(mappingTrackSelector, 1);
            boolean z2 = builder.buildCalled;
            if (z2) {
                throw new IllegalStateException();
            }
            builder.loadControlSupplier = new ExoPlayer$Builder$$ExternalSyntheticLambda2(defaultLoadControl, 0);
            Looper looper = this.looper;
            if (looper != null) {
                if (z2) {
                    throw new IllegalStateException();
                }
                builder.looper = looper;
            }
            if (z2) {
                throw new IllegalStateException();
            }
            builder.buildCalled = true;
            ExoPlayerImpl exoPlayerImpl = new ExoPlayerImpl(builder, null);
            this.player = exoPlayerImpl;
            DefaultAnalyticsCollector defaultAnalyticsCollector = exoPlayerImpl.analyticsCollector;
            defaultAnalyticsCollector.getClass();
            defaultAnalyticsCollector.listeners.add(this);
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
            ExoPlayer.Builder builder2 = new ExoPlayer.Builder(ApplicationLoader.applicationContext);
            MappingTrackSelector mappingTrackSelector2 = this.trackSelector;
            if (builder2.buildCalled) {
                throw new IllegalStateException();
            }
            mappingTrackSelector2.getClass();
            builder2.trackSelectorSupplier = new ExoPlayer$Builder$$ExternalSyntheticLambda2(mappingTrackSelector2, 1);
            boolean z3 = builder2.buildCalled;
            if (z3) {
                throw new IllegalStateException();
            }
            builder2.loadControlSupplier = new ExoPlayer$Builder$$ExternalSyntheticLambda2(defaultLoadControl, 0);
            if (z3) {
                throw new IllegalStateException();
            }
            builder2.buildCalled = true;
            SimpleExoPlayer simpleExoPlayer = new SimpleExoPlayer(builder2);
            this.audioPlayer = simpleExoPlayer;
            simpleExoPlayer.addListener(new Player.Listener() {
                @Override
                public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                }

                public void onAudioSessionIdChanged(int i) {
                }

                @Override
                public void onAvailableCommandsChanged(Player.Commands commands) {
                }

                @Override
                public void onCues(CueGroup cueGroup) {
                }

                @Override
                public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                }

                @Override
                public void onDeviceVolumeChanged(int i, boolean z4) {
                }

                @Override
                public void onEvents(Player player, Player.Events events) {
                }

                @Override
                public void onIsLoadingChanged(boolean z4) {
                }

                @Override
                public void onIsPlayingChanged(boolean z4) {
                }

                @Override
                @Deprecated
                public void onLoadingChanged(boolean z4) {
                }

                public void onMaxSeekToPreviousPositionChanged(long j) {
                }

                @Override
                public void onMediaItemTransition(MediaItem mediaItem, int i) {
                }

                @Override
                public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                }

                @Override
                public void onMetadata(Metadata metadata) {
                }

                @Override
                public void onPlayWhenReadyChanged(boolean z4, int i) {
                }

                @Override
                public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                }

                @Override
                public void onPlaybackStateChanged(int i) {
                }

                @Override
                public void onPlaybackSuppressionReasonChanged(int i) {
                }

                @Override
                public void onPlayerError(PlaybackException playbackException) {
                }

                @Override
                public void onPlayerErrorChanged(PlaybackException playbackException) {
                }

                @Override
                public void onPlayerStateChanged(boolean z4, int i) {
                    if (VideoPlayer.this.audioPlayerReady || i != 3) {
                        return;
                    }
                    VideoPlayer.this.audioPlayerReady = true;
                    VideoPlayer.this.checkPlayersReady();
                }

                public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                }

                @Override
                @Deprecated
                public void onPositionDiscontinuity(int i) {
                }

                @Override
                public void onRenderedFirstFrame() {
                }

                @Override
                public void onRepeatModeChanged(int i) {
                }

                public void onSeekBackIncrementChanged(long j) {
                }

                public void onSeekForwardIncrementChanged(long j) {
                }

                @Override
                @Deprecated
                public void onSeekProcessed() {
                }

                @Override
                public void onShuffleModeEnabledChanged(boolean z4) {
                }

                @Override
                public void onSkipSilenceEnabledChanged(boolean z4) {
                }

                @Override
                public void onSurfaceSizeChanged(int i, int i2) {
                }

                @Override
                public void onTimelineChanged(Timeline timeline, int i) {
                }

                public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
                }

                @Override
                public void onTracksChanged(Tracks tracks) {
                }

                @Override
                public void onVideoSizeChanged(VideoSize videoSize) {
                }

                @Override
                public void onVolumeChanged(float f) {
                }

                @Override
                @Deprecated
                public void onCues(List list) {
                }

                @Override
                public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                }
            });
            this.audioPlayer.setPlayWhenReady(this.autoplay);
        }
    }

    public static VideoUri getCachedQuality(ArrayList<Quality> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Quality quality = arrayList.get(i);
            i++;
            ArrayList<VideoUri> arrayList2 = quality.uris;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                VideoUri videoUri = arrayList2.get(i2);
                i2++;
                VideoUri videoUri2 = videoUri;
                if (videoUri2.isCached()) {
                    return videoUri2;
                }
            }
        }
        return null;
    }

    public static TLRPC.Document getDocumentForThumb(int i, TLRPC.MessageMedia messageMedia) {
        VideoUri qualityForThumb;
        if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (qualityForThumb = getQualityForThumb(getQualities(i, messageMedia.document, messageMedia.alt_documents, 0, true))) != null) {
            return qualityForThumb.document;
        }
        return null;
    }

    public static Boolean getLooping(MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0);
        String str = messageObject.getDialogId() + "_" + messageObject.getId() + "loop";
        if (sharedPreferences.contains(str)) {
            return Boolean.valueOf(sharedPreferences.getBoolean(str, false));
        }
        return null;
    }

    public static ArrayList<Quality> getQualities(int i, TLRPC.Document document, ArrayList<TLRPC.Document> arrayList, int i2, boolean z) {
        return getQualities(i, document, arrayList, i2, z, true);
    }

    public static VideoUri getQualityForPlayer(ArrayList<Quality> arrayList) {
        int i;
        int i2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Quality quality = arrayList.get(i3);
            i3++;
            ArrayList<VideoUri> arrayList2 = quality.uris;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                VideoUri videoUri = arrayList2.get(i4);
                i4++;
                VideoUri videoUri2 = videoUri;
                if (videoUri2.original && videoUri2.isCached()) {
                    return videoUri2;
                }
            }
        }
        int size3 = arrayList.size();
        VideoUri videoUri3 = null;
        int i5 = 0;
        while (i5 < size3) {
            Quality quality2 = arrayList.get(i5);
            i5++;
            ArrayList<VideoUri> arrayList3 = quality2.uris;
            int size4 = arrayList3.size();
            int i6 = 0;
            while (i6 < size4) {
                VideoUri videoUri4 = arrayList3.get(i6);
                i6++;
                VideoUri videoUri5 = videoUri4;
                if (!videoUri5.original && supportsHardwareDecoder(videoUri5.codec) && (videoUri3 == null || (i = videoUri5.width * videoUri5.height) > (i2 = videoUri3.width * videoUri3.height) || (i == i2 && videoUri5.bitrate < videoUri3.bitrate))) {
                    videoUri3 = videoUri5;
                }
            }
        }
        if (videoUri3 == null) {
            int size5 = arrayList.size();
            int i7 = 0;
            while (i7 < size5) {
                Quality quality3 = arrayList.get(i7);
                i7++;
                ArrayList<VideoUri> arrayList4 = quality3.uris;
                int size6 = arrayList4.size();
                int i8 = 0;
                while (i8 < size6) {
                    VideoUri videoUri6 = arrayList4.get(i8);
                    i8++;
                    VideoUri videoUri7 = videoUri6;
                    if (videoUri3 == null || videoUri3.width * videoUri3.height > videoUri7.width * videoUri7.height || videoUri7.bitrate < videoUri3.bitrate) {
                        videoUri3 = videoUri7;
                    }
                }
            }
        }
        return videoUri3;
    }

    public static VideoUri getQualityForThumb(ArrayList<Quality> arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Quality quality = arrayList.get(i);
            i++;
            ArrayList<VideoUri> arrayList2 = quality.uris;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                VideoUri videoUri = arrayList2.get(i2);
                i2++;
                VideoUri videoUri2 = videoUri;
                if (videoUri2.isCached()) {
                    return videoUri2;
                }
            }
        }
        int size3 = arrayList.size();
        VideoUri videoUri3 = null;
        int i3 = 0;
        while (i3 < size3) {
            Quality quality2 = arrayList.get(i3);
            i3++;
            ArrayList<VideoUri> arrayList3 = quality2.uris;
            int size4 = arrayList3.size();
            int i4 = 0;
            while (i4 < size4) {
                VideoUri videoUri4 = arrayList3.get(i4);
                i4++;
                VideoUri videoUri5 = videoUri4;
                if (!videoUri5.original && (videoUri3 == null || videoUri3.width * videoUri3.height > videoUri5.width * videoUri5.height || videoUri5.bitrate < videoUri3.bitrate)) {
                    if (videoUri5.width <= 900 && videoUri5.height <= 900) {
                        videoUri3 = videoUri5;
                    }
                }
            }
        }
        if (videoUri3 == null) {
            int size5 = arrayList.size();
            int i5 = 0;
            while (i5 < size5) {
                Quality quality3 = arrayList.get(i5);
                i5++;
                ArrayList<VideoUri> arrayList4 = quality3.uris;
                int size6 = arrayList4.size();
                int i6 = 0;
                while (i6 < size6) {
                    VideoUri videoUri6 = arrayList4.get(i6);
                    i6++;
                    VideoUri videoUri7 = videoUri6;
                    if (videoUri3 == null || videoUri3.width * videoUri3.height > videoUri7.width * videoUri7.height || videoUri7.bitrate < videoUri3.bitrate) {
                        videoUri3 = videoUri7;
                    }
                }
            }
        }
        return videoUri3;
    }

    private TrackSelectionOverride getQualityTrackSelection(VideoUri videoUri) {
        int i;
        try {
            int iIndexOf = this.manifestUris.indexOf(videoUri);
            AppCompatBackgroundHelper appCompatBackgroundHelper = this.trackSelector.currentMappedTrackInfo;
            for (int i2 = 0; i2 < appCompatBackgroundHelper.mBackgroundResId; i2++) {
                TrackGroupArray trackGroupArray = ((TrackGroupArray[]) appCompatBackgroundHelper.mDrawableManager)[i2];
                for (int i3 = 0; i3 < trackGroupArray.length; i3++) {
                    TrackGroup trackGroup = trackGroupArray.get(i3);
                    for (int i4 = 0; i4 < trackGroup.length; i4++) {
                        Format format = trackGroup.formats[i4];
                        try {
                            i = Integer.parseInt(format.id);
                        } catch (Exception unused) {
                            i = -1;
                        }
                        if (i >= 0 && iIndexOf == i) {
                            return new TrackSelectionOverride(trackGroup, ImmutableList.of((Object) Integer.valueOf(i4)));
                        }
                        if (format.width == videoUri.width && format.height == videoUri.height) {
                            return new TrackSelectionOverride(trackGroup, ImmutableList.of((Object) Integer.valueOf(i4)));
                        }
                    }
                }
            }
            return null;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Quality getSavedQuality(ArrayList<Quality> arrayList, MessageObject messageObject) {
        if (messageObject == null) {
            return null;
        }
        return getSavedQuality(arrayList, messageObject.getDialogId(), messageObject.getId());
    }

    public static boolean hasQualities(int i, TLRPC.MessageMedia messageMedia) {
        ArrayList<Quality> qualities;
        return (messageMedia instanceof TLRPC.TL_messageMediaDocument) && (qualities = getQualities(i, messageMedia.document, messageMedia.alt_documents, 0, false)) != null && qualities.size() > 1;
    }

    public DataSource lambda$mediaSourceFromUri$0(long j) {
        return new OffsetDataSource(this.mediaDataSourceFactory.createDataSource(), j);
    }

    public void lambda$onPlayerError$1() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.clearVideoTextureView(this.textureView);
            this.player.setVideoTextureView(this.textureView);
            ArrayList<Quality> arrayList = this.videoQualities;
            if (arrayList != null) {
                preparePlayer(arrayList, this.videoQualityToSelect);
            } else if (this.loopingMediaSource) {
                preparePlayerLoop(this.videoUri, this.videoType, this.audioUri, this.audioType);
            } else {
                preparePlayer(this.videoUri, this.videoType);
            }
            play();
        }
    }

    public void lambda$onPlayerError$2(PlaybackException playbackException) {
        Throwable cause = playbackException.getCause();
        if ((cause instanceof MediaCodecDecoderException) && (cause.toString().contains("av1") || cause.toString().contains("av01"))) {
            FileLog.e(playbackException);
            FileLog.e("av1 codec failed, we think this codec is not supported");
            MessagesController.getGlobalMainSettings().edit().putBoolean("unsupport_video/av01", true).commit();
            HashMap<String, Boolean> map = cachedSupportedCodec;
            if (map != null) {
                map.clear();
            }
            ArrayList<Quality> arrayListFilterByCodec = Quality.filterByCodec(this.videoQualities);
            this.videoQualities = arrayListFilterByCodec;
            if (arrayListFilterByCodec != null) {
                preparePlayer(arrayListFilterByCodec, this.videoQualityToSelect);
                return;
            }
            return;
        }
        TextureView textureView = this.textureView;
        if (textureView == null || ((this.triedReinit || !(cause instanceof MediaCodecRenderer.DecoderInitializationException)) && !(cause instanceof SurfaceNotValidException))) {
            this.delegate.onError(this, playbackException);
            return;
        }
        this.triedReinit = true;
        if (this.player != null) {
            ViewGroup viewGroup = (ViewGroup) textureView.getParent();
            if (viewGroup != null) {
                int iIndexOfChild = viewGroup.indexOfChild(this.textureView);
                viewGroup.removeView(this.textureView);
                viewGroup.addView(this.textureView, iIndexOfChild);
            }
            DispatchQueue dispatchQueue = this.workerQueue;
            if (dispatchQueue != null) {
                dispatchQueue.postRunnable(new VideoPlayer$$ExternalSyntheticLambda1(this, 0));
                return;
            }
            this.player.clearVideoTextureView(this.textureView);
            this.player.setVideoTextureView(this.textureView);
            ArrayList<Quality> arrayList = this.videoQualities;
            if (arrayList != null) {
                preparePlayer(arrayList, this.videoQualityToSelect);
            } else if (this.loopingMediaSource) {
                preparePlayerLoop(this.videoUri, this.videoType, this.audioUri, this.audioType);
            } else {
                preparePlayer(this.videoUri, this.videoType);
            }
            play();
        }
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

    private MediaSource mediaSourceFromUri(Uri uri, long j, String str) {
        MediaItem.ClippingConfiguration.Builder builder = new MediaItem.ClippingConfiguration.Builder();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        List list = Collections.EMPTY_LIST;
        RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
        MediaItem.RequestMetadata requestMetadata = MediaItem.RequestMetadata.EMPTY;
        MediaItem.PlaybackProperties playbackProperties = uri != null ? new MediaItem.PlaybackProperties(uri, list, regularImmutableList2) : null;
        MediaItem mediaItem = new MediaItem("", new MediaItem.ClippingProperties(builder), playbackProperties, new MediaItem.LiveConfiguration(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), MediaMetadata.EMPTY, requestMetadata);
        if (j != 0) {
            VideoPlayer$$ExternalSyntheticLambda2 videoPlayer$$ExternalSyntheticLambda2 = new VideoPlayer$$ExternalSyntheticLambda2(this, j);
            RegisteredMediaRouteProviderWatcher$$ExternalSyntheticLambda0 registeredMediaRouteProviderWatcher$$ExternalSyntheticLambda0 = new RegisteredMediaRouteProviderWatcher$$ExternalSyntheticLambda0(new DefaultExtractorsFactory(), 23);
            Clock clock = new Clock(11);
            playbackProperties.getClass();
            DrmSessionManager$1.get(mediaItem);
            return new ProgressiveMediaSource(mediaItem, videoPlayer$$ExternalSyntheticLambda2, registeredMediaRouteProviderWatcher$$ExternalSyntheticLambda0, clock);
        }
        str.getClass();
        if (str.equals("hls")) {
            if (this.hlsMediaSourceFactory == null) {
                this.hlsMediaSourceFactory = new HlsMediaSource.Factory(this.mediaDataSourceFactory);
            }
            return this.hlsMediaSourceFactory.createMediaSource(mediaItem);
        }
        if (str.equals("dash")) {
            if (this.dashMediaSourceFactory == null) {
                this.dashMediaSourceFactory = new DashMediaSource.Factory(this.mediaDataSourceFactory);
            }
            return this.dashMediaSourceFactory.createMediaSource(mediaItem);
        }
        if (this.progressiveMediaSourceFactory == null) {
            this.progressiveMediaSourceFactory = new ProgressiveMediaSource.Factory(this.mediaDataSourceFactory, new DefaultExtractorsFactory());
        }
        return this.progressiveMediaSourceFactory.createMediaSource(mediaItem);
    }

    public static void saveLooping(boolean z, MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z).apply();
    }

    public static void saveQuality(Quality quality, MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        saveQuality(quality, messageObject.getDialogId(), messageObject.getId());
    }

    public static boolean supportsHardwareDecoder(String str) {
        try {
            String mime = toMime(str);
            if (mime != null) {
                if (cachedSupportedCodec == null) {
                    cachedSupportedCodec = new HashMap<>();
                }
                Boolean bool = cachedSupportedCodec.get(mime);
                if (bool != null) {
                    return bool.booleanValue();
                }
                if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(mime), false)) {
                    int codecCount = MediaCodecList.getCodecCount();
                    for (int i = 0; i < codecCount; i++) {
                        MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                        if (!codecInfoAt.isEncoder()) {
                            Pattern pattern = MediaCodecUtil.PROFILE_PATTERN;
                            if (Util.SDK_INT >= 29 ? codecInfoAt.isHardwareAccelerated() : !MediaCodecUtil.isSoftwareOnly(codecInfoAt, mime)) {
                                for (String str2 : codecInfoAt.getSupportedTypes()) {
                                    if (str2.equalsIgnoreCase(mime)) {
                                        cachedSupportedCodec.put(mime, Boolean.TRUE);
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                    cachedSupportedCodec.put(mime, Boolean.FALSE);
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public static String toMime(String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
            case "av1":
            case "av01":
                return "video/av01";
            case "avc":
            case "h264":
                return "video/avc";
            case "vp8":
                return "video/x-vnd.on2.vp8";
            case "vp9":
                return "video/x-vnd.on2.vp9";
            case "h265":
            case "hevc":
                return "video/hevc";
            default:
                return "video/".concat(str);
        }
    }

    public boolean createdWithAudioTrack() {
        return !this.audioDisabled;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.playerDidStartPlaying || ((VideoPlayer) objArr[0]) == this || !isPlaying() || this.allowMultipleInstances) {
            return;
        }
        pause();
    }

    public int getBufferedPercentage() {
        if (!this.isStreaming) {
            return 100;
        }
        Object obj = this.player;
        if (obj != null) {
            BasePlayer basePlayer = (BasePlayer) obj;
            long bufferedPosition = basePlayer.getBufferedPosition();
            long duration = basePlayer.getDuration();
            if (bufferedPosition != -9223372036854775807L && duration != -9223372036854775807L) {
                if (duration == 0) {
                    return 100;
                }
                int i = (int) ((bufferedPosition * 100) / duration);
                int i2 = Util.SDK_INT;
                return Math.max(0, Math.min(i, 100));
            }
        }
        return 0;
    }

    public long getBufferedPosition() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return this.isStreaming ? exoPlayer.getBufferedPosition() : exoPlayer.getDuration();
        }
        return 0L;
    }

    public ChromecastMediaVariations getCurrentChromecastMedia(String str, String str2, String str3) {
        if (this.videoQualities == null) {
            if (this.videoUri == null) {
                return null;
            }
            String strM = zzii.m("/mtproto_", str);
            String queryParameter = this.videoUri.getQueryParameter("mime");
            ChromecastMedia.Builder builder = new ChromecastMedia.Builder(this.videoUri, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, strM);
            builder.title = str2;
            builder.subtitle = str3;
            return new ChromecastMediaVariations(new ChromecastMedia(builder));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Quality> arrayList2 = this.videoQualities;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Quality quality = arrayList2.get(i);
            i++;
            ArrayList<VideoUri> arrayList3 = quality.uris;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                VideoUri videoUri = arrayList3.get(i2);
                i2++;
                VideoUri videoUri2 = videoUri;
                StringBuilder sb = new StringBuilder("/mtproto_");
                ArrayList<Quality> arrayList4 = arrayList2;
                sb.append(videoUri2.docId);
                String string = sb.toString();
                TLRPC.Document document = videoUri2.document;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                ChromecastMedia.Builder builder2 = new ChromecastMedia.Builder(videoUri2.uri, str4, string);
                builder2.title = str2;
                builder2.subtitle = str3;
                int i3 = videoUri2.width;
                int i4 = videoUri2.height;
                builder2.width = i3;
                builder2.height = i4;
                arrayList.add(new ChromecastMedia(builder2));
                arrayList2 = arrayList4;
            }
        }
        return new ChromecastMediaVariations(arrayList);
    }

    public TLRPC.Document getCurrentDocument() {
        Format videoFormat;
        ArrayList<Quality> arrayList;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null && (videoFormat = exoPlayer.getVideoFormat()) != null && videoFormat.documentId != 0 && (arrayList = this.videoQualities) != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Quality quality = arrayList.get(i);
                i++;
                ArrayList<VideoUri> arrayList2 = quality.uris;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    VideoUri videoUri = arrayList2.get(i2);
                    i2++;
                    VideoUri videoUri2 = videoUri;
                    if (videoUri2.docId == videoFormat.documentId) {
                        return videoUri2.document;
                    }
                }
            }
        }
        return null;
    }

    public long getCurrentPosition() {
        long j = this.fallbackPosition;
        if (j != -9223372036854775807L) {
            return j;
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return exoPlayer.getCurrentPosition();
        }
        return 0L;
    }

    public Quality getCurrentQuality() {
        int currentQualityIndex = getCurrentQualityIndex();
        if (currentQualityIndex < 0 || currentQualityIndex >= getQualitiesCount()) {
            return null;
        }
        return getQuality(currentQualityIndex);
    }

    public int getCurrentQualityIndex() {
        Format videoFormat;
        if (this.selectedQualityIndex == -1) {
            try {
                if (this.autoIsOriginal) {
                    for (int i = 0; i < getQualitiesCount(); i++) {
                        if (getQuality(i).original) {
                            return i;
                        }
                    }
                }
                ExoPlayer exoPlayer = this.player;
                if (exoPlayer == null || (videoFormat = exoPlayer.getVideoFormat()) == null) {
                    return -1;
                }
                for (int i2 = 0; i2 < getQualitiesCount(); i2++) {
                    Quality quality = getQuality(i2);
                    if (!quality.original && videoFormat.width == quality.width && videoFormat.height == quality.height && videoFormat.bitrate == ((int) Math.floor(quality.uris.get(0).bitrate * 8.0d))) {
                        return i2;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
                return -1;
            }
        }
        return this.selectedQualityIndex;
    }

    public Uri getCurrentUri() {
        return this.currentUri;
    }

    public long getDuration() {
        long j = this.fallbackDuration;
        if (j != -9223372036854775807L) {
            return j;
        }
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return exoPlayer.getDuration();
        }
        return 0L;
    }

    public File getFile() {
        ArrayList<Quality> arrayList = this.videoQualities;
        if (arrayList != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Quality quality = arrayList.get(i);
                i++;
                ArrayList<VideoUri> arrayList2 = quality.uris;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    VideoUri videoUri = arrayList2.get(i2);
                    i2++;
                    VideoUri videoUri2 = videoUri;
                    if (videoUri2.isCached()) {
                        return new File(videoUri2.uri.getPath());
                    }
                }
            }
        }
        Uri uri = this.videoUri;
        if (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) {
            return null;
        }
        return new File(this.videoUri.getPath());
    }

    public StoryEntry.HDRInfo getHDRStaticInfo(StoryEntry.HDRInfo hDRInfo) {
        if (hDRInfo == null) {
            hDRInfo = new StoryEntry.HDRInfo();
        }
        try {
            MediaFormat mediaFormat = ((MediaCodecRenderer) this.player.getRenderer()).codecOutputMediaFormat;
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

    public Quality getHighestQuality(Boolean bool) {
        Quality quality = null;
        for (int i = 0; i < getQualitiesCount(); i++) {
            Quality quality2 = getQuality(i);
            if ((bool == null || quality2.original == bool.booleanValue()) && (quality == null || quality.width * quality.height < quality2.width * quality2.height)) {
                quality = quality2;
            }
        }
        return quality;
    }

    public int getHighestQualityIndex(Boolean bool) {
        int i = -1;
        Quality quality = null;
        for (int i2 = 0; i2 < getQualitiesCount(); i2++) {
            Quality quality2 = getQuality(i2);
            if ((bool == null || quality2.original == bool.booleanValue()) && (quality == null || quality.width * quality.height < quality2.width * quality2.height)) {
                i = i2;
                quality = quality2;
            }
        }
        return i;
    }

    public File getLowestFile() {
        ArrayList<Quality> arrayList = this.videoQualities;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ArrayList<VideoUri> arrayList2 = this.videoQualities.get(size).uris;
                int size2 = arrayList2.size();
                int i = 0;
                while (i < size2) {
                    VideoUri videoUri = arrayList2.get(i);
                    i++;
                    VideoUri videoUri2 = videoUri;
                    if (!videoUri2.isCached()) {
                        videoUri2.updateCached(true);
                    }
                    if (videoUri2.isCached()) {
                        return new File(videoUri2.uri.getPath());
                    }
                }
            }
        }
        Uri uri = this.videoUri;
        if (uri == null || !"file".equalsIgnoreCase(uri.getScheme())) {
            return null;
        }
        return new File(this.videoUri.getPath());
    }

    public Quality getLowestQuality() {
        Quality quality = null;
        for (int i = 0; i < getQualitiesCount(); i++) {
            Quality quality2 = getQuality(i);
            if (quality == null || quality.width * quality.height > quality2.width * quality2.height) {
                quality = quality2;
            }
        }
        return quality;
    }

    public Quality getOriginalQuality() {
        for (int i = 0; i < getQualitiesCount(); i++) {
            Quality quality = getQuality(i);
            if (quality.original) {
                return quality;
            }
        }
        return null;
    }

    public boolean getPlayWhenReady() {
        return this.player.getPlayWhenReady();
    }

    public float getPlaybackSpeed() {
        PlaybackParameters playbackParameters;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer == null || (playbackParameters = exoPlayer.getPlaybackParameters()) == null) {
            return 1.0f;
        }
        return playbackParameters.speed;
    }

    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    public int getQualitiesCount() {
        ArrayList<Quality> arrayList = this.videoQualities;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public Quality getQuality(int i) {
        ArrayList<Quality> arrayList = this.videoQualities;
        if (arrayList == null) {
            return getHighestQuality(Boolean.FALSE);
        }
        return (i < 0 || i >= arrayList.size()) ? getHighestQuality(Boolean.FALSE) : this.videoQualities.get(i);
    }

    public int getRepeatCount() {
        return this.repeatCount;
    }

    public int getSelectedQuality() {
        return this.selectedQualityIndex;
    }

    public VideoSize getVideoSize() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return exoPlayer.getVideoSize();
        }
        return null;
    }

    public float getVolume() {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            return exoPlayer.getVolume();
        }
        return 1.0f;
    }

    public void handleAudioFocus(boolean z) {
        this.handleAudioFocus = z;
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setAudioAttributes(exoPlayer.getAudioAttributes(), z);
        }
    }

    public boolean isBuffering() {
        return this.player != null && this.lastReportedPlaybackState == 2;
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
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean isLooping() {
        return this.looping;
    }

    public boolean isMuted() {
        ExoPlayer exoPlayer = this.player;
        return exoPlayer != null && exoPlayer.getVolume() == 0.0f;
    }

    public boolean isPlayerPrepared() {
        return this.player != null;
    }

    public boolean isPlaying() {
        if (this.mixedAudio && this.mixedPlayWhenReady) {
            return true;
        }
        ExoPlayer exoPlayer = this.player;
        return exoPlayer != null && exoPlayer.getPlayWhenReady();
    }

    public boolean isStreaming() {
        return this.isStreaming;
    }

    public Uri makeManifest(ArrayList<Quality> arrayList) {
        StringBuilder sb = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.manifestUris = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            Quality quality = arrayList.get(i);
            i++;
            ArrayList<VideoUri> arrayList3 = quality.uris;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                VideoUri videoUri = arrayList3.get(i2);
                i2++;
                VideoUri videoUri2 = videoUri;
                this.mediaDataSourceFactory.putDocumentUri(videoUri2.docId, videoUri2.uri);
                this.mediaDataSourceFactory.putDocumentUri(videoUri2.manifestDocId, videoUri2.m3u8uri);
                if (videoUri2.m3u8uri != null) {
                    this.manifestUris.add(videoUri2);
                    StringBuilder sb2 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb2.append((int) Math.floor(videoUri2.bitrate * 8.0d));
                    sb2.append(",RESOLUTION=");
                    sb2.append(videoUri2.width);
                    sb2.append("x");
                    sb2.append(videoUri2.height);
                    String mime = toMime(videoUri2.codec);
                    if (mime != null) {
                        sb2.append(",MIME=\"");
                        sb2.append(mime);
                        sb2.append("\"");
                    }
                    if (videoUri2.isCached() && videoUri2.isManifestCached()) {
                        sb2.append(",CACHED=\"true\"");
                    }
                    sb2.append(",DOCID=\"");
                    sb2.append(videoUri2.docId);
                    sb2.append("\",ACCOUNT=\"");
                    sb2.append(videoUri2.currentAccount);
                    sb2.append("\"\n");
                    if (videoUri2.isManifestCached()) {
                        sb2.append(videoUri2.m3u8uri);
                        sb2.append("\n\n");
                    } else {
                        sb2.append("mtproto:");
                        sb2.append(videoUri2.manifestDocId);
                        sb2.append("\n\n");
                    }
                    arrayList2.add(sb2.toString());
                    z = true;
                }
            }
        }
        if (!z) {
            return null;
        }
        Collections.reverse(arrayList2);
        sb.append(TextUtils.join("", arrayList2));
        return Uri.parse("data:application/x-mpegurl;base64," + Base64.encodeToString(sb.toString().getBytes(), 2));
    }

    @Override
    public void onAudioAttributesChanged(AnalyticsListener.EventTime eventTime, AudioAttributes audioAttributes) {
    }

    @Override
    public void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override
    @Deprecated
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    @Override
    public void onAudioDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override
    public void onAudioDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override
    public void onAudioEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override
    @Deprecated
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
    }

    @Override
    public void onAudioPositionAdvancing(AnalyticsListener.EventTime eventTime, long j) {
    }

    public void onAudioSessionIdChanged(int i) {
    }

    @Override
    public void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override
    public void onAudioUnderrun(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    @Override
    public void onAvailableCommandsChanged(Player.Commands commands) {
    }

    @Override
    public void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j, long j2) {
    }

    @Override
    public void onCues(AnalyticsListener.EventTime eventTime, CueGroup cueGroup) {
    }

    @Override
    @Deprecated
    public void onDecoderDisabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
    }

    @Override
    @Deprecated
    public void onDecoderEnabled(AnalyticsListener.EventTime eventTime, int i, DecoderCounters decoderCounters) {
    }

    @Override
    @Deprecated
    public void onDecoderInitialized(AnalyticsListener.EventTime eventTime, int i, String str, long j) {
    }

    @Override
    @Deprecated
    public void onDecoderInputFormatChanged(AnalyticsListener.EventTime eventTime, int i, Format format) {
    }

    @Override
    public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override
    public void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override
    public void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    public void onDrmKeysLoaded(AnalyticsListener.EventTime eventTime) {
    }

    public void onDrmKeysRemoved(AnalyticsListener.EventTime eventTime) {
    }

    public void onDrmKeysRestored(AnalyticsListener.EventTime eventTime) {
    }

    @Deprecated
    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime) {
    }

    public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    public void onDrmSessionReleased(AnalyticsListener.EventTime eventTime) {
    }

    @Override
    public void onDroppedVideoFrames(AnalyticsListener.EventTime eventTime, int i, long j) {
    }

    @Override
    public void onEvents(Player player, Player.Events events) {
    }

    @Override
    public void onIsLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override
    public void onIsPlayingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override
    public void onLoadCanceled(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override
    public void onLoadCompleted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override
    public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
    }

    @Override
    public void onLoadStarted(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
    }

    @Override
    @Deprecated
    public void onLoadingChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    public void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override
    public void onMediaItemTransition(MediaItem mediaItem, int i) {
    }

    @Override
    public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override
    public void onMetadata(AnalyticsListener.EventTime eventTime, Metadata metadata) {
    }

    @Override
    public void onPlayWhenReadyChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    @Override
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override
    public void onPlaybackStateChanged(int i) {
    }

    @Override
    public void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override
    public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
    }

    @Override
    public void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override
    public void onPlayerReleased(AnalyticsListener.EventTime eventTime) {
    }

    @Override
    @Deprecated
    public void onPlayerStateChanged(AnalyticsListener.EventTime eventTime, boolean z, int i) {
    }

    public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override
    @Deprecated
    public void onPositionDiscontinuity(int i) {
    }

    @Override
    public void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        this.fallbackPosition = -9223372036854775807L;
        this.fallbackDuration = -9223372036854775807L;
        VideoPlayerDelegate videoPlayerDelegate = this.delegate;
        if (videoPlayerDelegate != null) {
            videoPlayerDelegate.onRenderedFirstFrame(eventTime);
        }
    }

    @Override
    public void onRepeatModeChanged(int i) {
    }

    public void onSeekBackIncrementChanged(long j) {
    }

    public void onSeekForwardIncrementChanged(long j) {
    }

    @Override
    @Deprecated
    public void onSeekProcessed() {
    }

    @Override
    public void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        VideoPlayerDelegate videoPlayerDelegate = this.delegate;
        if (videoPlayerDelegate != null) {
            videoPlayerDelegate.onSeekStarted(eventTime);
        }
    }

    @Override
    public void onShuffleModeChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override
    public void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(AnalyticsListener.EventTime eventTime, boolean z) {
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return this.delegate.onSurfaceDestroyed(surfaceTexture);
    }

    @Override
    public void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.delegate.onSurfaceTextureUpdated(surfaceTexture);
    }

    @Override
    public void onTimelineChanged(Timeline timeline, int i) {
    }

    public void onTrackSelectionParametersChanged(AnalyticsListener.EventTime eventTime, TrackSelectionParameters trackSelectionParameters) {
    }

    @Override
    public void onTracksChanged(AnalyticsListener.EventTime eventTime, Tracks tracks) {
    }

    @Override
    public void onUpstreamDiscarded(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override
    public void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) {
    }

    @Override
    @Deprecated
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j) {
    }

    @Override
    public void onVideoDecoderReleased(AnalyticsListener.EventTime eventTime, String str) {
    }

    @Override
    public void onVideoDisabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override
    public void onVideoEnabled(AnalyticsListener.EventTime eventTime, DecoderCounters decoderCounters) {
    }

    @Override
    public void onVideoFrameProcessingOffset(AnalyticsListener.EventTime eventTime, long j, int i) {
    }

    @Override
    @Deprecated
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format) {
    }

    @Override
    @Deprecated
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2, int i3, float f) {
    }

    @Override
    public void onVolumeChanged(float f) {
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

    public void play() {
        this.mixedPlayWhenReady = true;
        if (!this.mixedAudio || (this.audioPlayerReady && this.videoPlayerReady)) {
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.setPlayWhenReady(true);
            }
            ExoPlayer exoPlayer2 = this.audioPlayer;
            if (exoPlayer2 != null) {
                exoPlayer2.setPlayWhenReady(true);
                return;
            }
            return;
        }
        ExoPlayer exoPlayer3 = this.player;
        if (exoPlayer3 != null) {
            exoPlayer3.setPlayWhenReady(false);
        }
        ExoPlayer exoPlayer4 = this.audioPlayer;
        if (exoPlayer4 != null) {
            exoPlayer4.setPlayWhenReady(false);
        }
    }

    public void preparePlayer(Uri uri, String str) {
        preparePlayer(uri, str, 3, 0L);
    }

    public void preparePlayerLoop(Uri uri, String str, Uri uri2, String str2) {
        Uri uri3;
        String str3;
        LoopingMediaSource loopingMediaSource = null;
        this.videoQualities = null;
        this.videoQualityToSelect = null;
        this.videoUri = uri;
        this.audioUri = uri2;
        this.videoType = str;
        this.audioType = str2;
        this.loopingMediaSource = true;
        this.currentStreamIsHls = false;
        this.mixedAudio = true;
        this.audioPlayerReady = false;
        this.videoPlayerReady = false;
        ensurePlayerCreated();
        LoopingMediaSource loopingMediaSource2 = null;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                uri3 = uri;
                str3 = str;
            } else {
                uri3 = uri2;
                str3 = str2;
            }
            LoopingMediaSource loopingMediaSource3 = new LoopingMediaSource(mediaSourceFromUri(uri3, 0L, str3));
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
        activePlayers.add(Integer.valueOf(this.playerId));
    }

    public void releasePlayer(boolean z) {
        activePlayers.remove(Integer.valueOf(this.playerId));
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

    public void seekTo(long j) {
        seekTo(j, false);
    }

    public void seekToBack(long j, boolean z, Runnable runnable) {
        if (this.player != null) {
            if (runnable != null) {
                this.seekFinishedListeners.add(runnable);
            }
            this.player.setSeekParameters(z ? SeekParameters.PREVIOUS_SYNC : SeekParameters.EXACT);
            BasePlayer basePlayer = (BasePlayer) this.player;
            basePlayer.seekTo(j, basePlayer.getCurrentMediaItemIndex(), 5, false);
        }
    }

    public void seekToForward(long j, boolean z, Runnable runnable) {
        if (this.player != null) {
            if (runnable != null) {
                this.seekFinishedListeners.add(runnable);
            }
            this.player.setSeekParameters(z ? SeekParameters.NEXT_SYNC : SeekParameters.EXACT);
            BasePlayer basePlayer = (BasePlayer) this.player;
            basePlayer.seekTo(j, basePlayer.getCurrentMediaItemIndex(), 5, false);
        }
    }

    public void setAudioVisualizerDelegate(AudioVisualizerDelegate audioVisualizerDelegate) {
        this.audioVisualizerDelegate = audioVisualizerDelegate;
    }

    public void setDelegate(VideoPlayerDelegate videoPlayerDelegate) {
        this.delegate = videoPlayerDelegate;
    }

    public void setIsStory() {
        this.isStory = true;
    }

    public void setLooper(Looper looper) {
        this.looper = looper;
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

    public void setOnQualityChangeListener(Runnable runnable) {
        this.onQualityChangeListener = runnable;
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

    public void setPlaybackSpeed(float f) {
        try {
            ExoPlayer exoPlayer = this.player;
            if (exoPlayer != null) {
                exoPlayer.setPlaybackParameters(new PlaybackParameters(f, f > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    public void setSelectedQuality(int i) {
        if (this.player == null || i == this.selectedQualityIndex) {
            return;
        }
        this.selectedQualityIndex = i;
        ArrayList<Quality> arrayList = this.videoQualities;
        setSelectedQuality(false, (arrayList == null || i < 0 || i >= arrayList.size()) ? null : this.videoQualities.get(i));
    }

    public void setStreamType(int i) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setAudioAttributes(new AudioAttributes(0, 0, i == 0 ? 2 : 1, 1, 0), this.handleAudioFocus);
        }
        ExoPlayer exoPlayer2 = this.audioPlayer;
        if (exoPlayer2 != null) {
            exoPlayer2.setAudioAttributes(new AudioAttributes(0, 0, i == 0 ? 2 : 1, 1, 0), true);
        }
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

    public void setWorkerQueue(DispatchQueue dispatchQueue) {
        this.workerQueue = dispatchQueue;
        this.player.setWorkerQueue(dispatchQueue);
    }

    public VideoPlayer(boolean z, boolean z2) {
        int i = lastPlayerId;
        lastPlayerId = i + 1;
        this.playerId = i;
        this.audioUpdateHandler = new Handler(Looper.getMainLooper());
        this.autoIsOriginal = false;
        this.selectedQualityIndex = -1;
        this.fallbackDuration = -9223372036854775807L;
        this.fallbackPosition = -9223372036854775807L;
        this.seekFinishedListeners = new ArrayList<>();
        this.handleAudioFocus = false;
        this.audioDisabled = z2;
        this.mediaDataSourceFactory = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(ApplicationLoader.applicationContext, new RichMediaCell.AnonymousClass2(11));
        this.trackSelector = defaultTrackSelector;
        if (z2) {
            DefaultTrackSelector.Parameters parameters = defaultTrackSelector.getParameters();
            parameters.getClass();
            DefaultTrackSelector.Parameters.Builder builder = new DefaultTrackSelector.Parameters.Builder(parameters);
            builder.disabledTrackTypes.add(1);
            defaultTrackSelector.setParameters(new DefaultTrackSelector.Parameters(builder));
        }
        this.lastReportedPlaybackState = 1;
        this.shouldPauseOther = z;
        if (z) {
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.playerDidStartPlaying);
        }
        playerCounter++;
    }

    public static ArrayList<Quality> getQualities(int i, TLRPC.Document document, ArrayList<TLRPC.Document> arrayList, int i2, boolean z, boolean z2) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (document != null) {
            arrayList2.add(document);
        }
        if (!MessagesController.getInstance(i).videoIgnoreAltDocuments && arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        LongSparseArray longSparseArray = new LongSparseArray();
        int i3 = 0;
        while (i3 < arrayList2.size()) {
            TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i3);
            if ("application/x-mpegurl".equalsIgnoreCase(document2.mime_type) && (str = document2.file_name_fixed) != null && str.startsWith("mtproto")) {
                try {
                    longSparseArray.put(Long.parseLong(document2.file_name_fixed.substring(7)), document2);
                    arrayList2.remove(i3);
                    i3--;
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            i3++;
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            try {
                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i4);
                if (!"application/x-mpegurl".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboard".equalsIgnoreCase(document3.mime_type) && !"application/x-tgstoryboardmap".equalsIgnoreCase(document3.mime_type)) {
                    VideoUri videoUriOf = VideoUri.of(i, document3, (TLRPC.Document) longSparseArray.get(document3.id), i2, z2);
                    if (videoUriOf.width > 0 && videoUriOf.height > 0) {
                        if (document3 == document) {
                            videoUriOf.original = true;
                        }
                        arrayList3.add(videoUriOf);
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (int i5 = 0; i5 < arrayList3.size(); i5++) {
            VideoUri videoUri = (VideoUri) arrayList3.get(i5);
            String str2 = videoUri.codec;
            if (str2 == null) {
                arrayList4.add(videoUri);
            } else if (z) {
                if ("avc".equals(str2) || "h264".equals(videoUri.codec) || "vp9".equals(videoUri.codec) || "vp8".equals(videoUri.codec) || (("av1".equals(videoUri.codec) || "av01".equals(videoUri.codec)) && supportsHardwareDecoder(videoUri.codec))) {
                    arrayList4.add(videoUri);
                }
            } else if ((!"av1".equals(str2) && !"av01".equals(videoUri.codec) && !"hevc".equals(videoUri.codec) && !"h265".equals(videoUri.codec) && !"vp9".equals(videoUri.codec)) || supportsHardwareDecoder(videoUri.codec)) {
                arrayList4.add(videoUri);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4.isEmpty()) {
            arrayList5.addAll(arrayList3);
        } else {
            arrayList5.addAll(arrayList4);
        }
        return Quality.group(arrayList5);
    }

    public static Quality getSavedQuality(ArrayList<Quality> arrayList, long j, int i) {
        int i2 = 0;
        String string = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).getString(j + "_" + i + "q2", "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        int size = arrayList.size();
        while (i2 < size) {
            Quality quality = arrayList.get(i2);
            i2++;
            Quality quality2 = quality;
            StringBuilder sb = new StringBuilder();
            sb.append(quality2.width);
            sb.append("x");
            sb.append(quality2.height);
            sb.append(quality2.original ? "s" : "");
            if (TextUtils.equals(string, sb.toString())) {
                return quality2;
            }
        }
        return null;
    }

    public static void saveQuality(Quality quality, long j, int i) {
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (quality == null) {
            editorEdit.remove(j + "_" + i + "q2");
        } else {
            String str = j + "_" + i + "q2";
            StringBuilder sb = new StringBuilder();
            sb.append(quality.width);
            sb.append("x");
            sb.append(quality.height);
            sb.append(quality.original ? "s" : "");
            editorEdit.putString(str, sb.toString());
        }
        editorEdit.apply();
    }

    @Override
    public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    @Override
    public void onAudioDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
    }

    @Override
    public void onAudioInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    public void onAudioSessionIdChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override
    public void onAvailableCommandsChanged(AnalyticsListener.EventTime eventTime, Player.Commands commands) {
    }

    @Override
    @Deprecated
    public void onCues(AnalyticsListener.EventTime eventTime, List list) {
    }

    @Override
    public void onDeviceInfoChanged(AnalyticsListener.EventTime eventTime, DeviceInfo deviceInfo) {
    }

    @Override
    public void onDeviceVolumeChanged(AnalyticsListener.EventTime eventTime, int i, boolean z) {
    }

    public void onDrmSessionAcquired(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override
    public void onEvents(Player player, AnalyticsListener.Events events) {
    }

    @Override
    public void onIsLoadingChanged(boolean z) {
    }

    @Override
    public void onIsPlayingChanged(boolean z) {
    }

    @Override
    @Deprecated
    public void onLoadingChanged(boolean z) {
    }

    public void onMaxSeekToPreviousPositionChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override
    public void onMediaItemTransition(AnalyticsListener.EventTime eventTime, MediaItem mediaItem, int i) {
    }

    @Override
    public void onMediaMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @Override
    public void onMetadata(Metadata metadata) {
    }

    @Override
    public void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override
    public void onPlaybackParametersChanged(AnalyticsListener.EventTime eventTime, PlaybackParameters playbackParameters) {
    }

    @Override
    public void onPlaybackStateChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override
    public void onPlaybackSuppressionReasonChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override
    public void onPlayerError(PlaybackException playbackException) {
        AndroidUtilities.runOnUIThread(new UndoView$$ExternalSyntheticLambda3(26, this, playbackException));
    }

    @Override
    public void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) {
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

    public void onPlaylistMetadataChanged(AnalyticsListener.EventTime eventTime, MediaMetadata mediaMetadata) {
    }

    @Override
    @Deprecated
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, int i) {
    }

    @Override
    public void onRepeatModeChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    public void onSeekBackIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    public void onSeekForwardIncrementChanged(AnalyticsListener.EventTime eventTime, long j) {
    }

    @Override
    public void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        VideoPlayerDelegate videoPlayerDelegate = this.delegate;
        if (videoPlayerDelegate != null) {
            videoPlayerDelegate.onSeekFinished(eventTime);
        }
        ArrayList<Runnable> arrayList = this.seekFinishedListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Runnable runnable = arrayList.get(i);
            i++;
            runnable.run();
        }
        this.seekFinishedListeners.clear();
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override
    public void onSurfaceSizeChanged(AnalyticsListener.EventTime eventTime, int i, int i2) {
    }

    @Override
    public void onTimelineChanged(AnalyticsListener.EventTime eventTime, int i) {
    }

    public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        Runnable runnable = this.onQualityChangeListener;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    @Override
    public void onTracksChanged(Tracks tracks) {
        Runnable runnable = this.onQualityChangeListener;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
        }
    }

    @Override
    public void onVideoDecoderInitialized(AnalyticsListener.EventTime eventTime, String str, long j, long j2) {
    }

    @Override
    public void onVideoInputFormatChanged(AnalyticsListener.EventTime eventTime, Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    @Override
    public void onVideoSizeChanged(AnalyticsListener.EventTime eventTime, VideoSize videoSize) {
    }

    @Override
    public void onVolumeChanged(AnalyticsListener.EventTime eventTime, float f) {
    }

    public void preparePlayer(Uri uri, String str, int i, long j) {
        this.videoQualities = null;
        this.videoQualityToSelect = null;
        this.videoUri = uri;
        this.videoType = str;
        this.audioUri = null;
        this.audioType = null;
        boolean z = false;
        this.loopingMediaSource = false;
        this.autoIsOriginal = false;
        this.currentStreamIsHls = false;
        this.videoPlayerReady = false;
        this.mixedAudio = false;
        this.currentUri = uri;
        String scheme = uri != null ? uri.getScheme() : null;
        if (scheme != null && !scheme.startsWith("file")) {
            z = true;
        }
        this.isStreaming = z;
        ensurePlayerCreated();
        this.player.setMediaSource(mediaSourceFromUri(uri, j, str), true);
        this.player.prepare();
    }

    public void seekTo(long j, boolean z) {
        ExoPlayer exoPlayer = this.player;
        if (exoPlayer != null) {
            exoPlayer.setSeekParameters(z ? SeekParameters.CLOSEST_SYNC : SeekParameters.EXACT);
            BasePlayer basePlayer = (BasePlayer) this.player;
            basePlayer.seekTo(j, basePlayer.getCurrentMediaItemIndex(), 5, false);
        }
    }

    @Override
    public void onCues(CueGroup cueGroup) {
    }

    @Override
    public void onPositionDiscontinuity(AnalyticsListener.EventTime eventTime, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    @Override
    public void onVideoSizeChanged(VideoSize videoSize) {
        this.delegate.onVideoSizeChanged(videoSize.width, videoSize.height, videoSize.unappliedRotationDegrees, videoSize.pixelWidthHeightRatio);
    }

    @Override
    @Deprecated
    public void onCues(List list) {
    }

    @Override
    public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
        if (i == 0) {
            this.repeatCount++;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        this.delegate.onRenderedFirstFrame();
    }

    private void setSelectedQuality(boolean z, Quality quality) {
        int i;
        Object obj = this.player;
        if (obj == null) {
            return;
        }
        BasePlayer basePlayer = (BasePlayer) obj;
        int i2 = 0;
        boolean z2 = basePlayer.getPlaybackState() == 3 && basePlayer.getPlayWhenReady() && basePlayer.getPlaybackSuppressionReason() == 0;
        long currentPosition = this.player.getCurrentPosition();
        if (!z) {
            this.fallbackPosition = currentPosition;
            this.fallbackDuration = this.player.getDuration();
        }
        this.videoQualityToSelect = quality;
        if (quality == null) {
            Uri uriMakeManifest = makeManifest(this.videoQualities);
            Quality originalQuality = getOriginalQuality();
            if (originalQuality != null && originalQuality.uris.size() == 1 && originalQuality.uris.get(0).isCached()) {
                this.currentStreamIsHls = false;
                this.autoIsOriginal = true;
                this.videoQualityToSelect = originalQuality;
                this.player.setMediaSource(mediaSourceFromUri(originalQuality.getDownloadUri(), "other"), false);
            } else if (uriMakeManifest != null) {
                this.autoIsOriginal = false;
                MappingTrackSelector mappingTrackSelector = this.trackSelector;
                DefaultTrackSelector.Parameters parameters = ((DefaultTrackSelector) mappingTrackSelector).getParameters();
                parameters.getClass();
                DefaultTrackSelector.Parameters.Builder builder = new DefaultTrackSelector.Parameters.Builder(parameters);
                builder.overrides.clear();
                mappingTrackSelector.setParameters(new DefaultTrackSelector.Parameters(builder));
                if (!this.currentStreamIsHls) {
                    this.currentStreamIsHls = true;
                    this.player.setMediaSource(mediaSourceFromUri(uriMakeManifest, 0L, "hls"), false);
                }
            } else {
                Quality highestQuality = getHighestQuality(Boolean.TRUE);
                if (highestQuality == null) {
                    highestQuality = getHighestQuality(Boolean.FALSE);
                }
                if (highestQuality == null || highestQuality.uris.isEmpty()) {
                    return;
                }
                this.currentStreamIsHls = false;
                this.videoQualityToSelect = highestQuality;
                this.autoIsOriginal = highestQuality.original;
                this.player.setMediaSource(mediaSourceFromUri(highestQuality.getDownloadUri(), "other"), false);
            }
            i2 = 1;
        } else {
            this.autoIsOriginal = false;
            if (quality.uris.isEmpty()) {
                return;
            }
            Uri uriMakeManifest2 = quality.uris.size() > 1 ? makeManifest(this.videoQualities) : null;
            if (uriMakeManifest2 != null && quality.uris.size() != 1 && this.trackSelector.currentMappedTrackInfo != null) {
                if (this.currentStreamIsHls) {
                    i = 0;
                } else {
                    this.currentStreamIsHls = true;
                    this.player.setMediaSource(mediaSourceFromUri(uriMakeManifest2, 0L, "hls"), false);
                    i = 1;
                }
                DefaultTrackSelector.Parameters parameters2 = ((DefaultTrackSelector) this.trackSelector).getParameters();
                parameters2.getClass();
                DefaultTrackSelector.Parameters.Builder builder2 = new DefaultTrackSelector.Parameters.Builder(parameters2);
                builder2.overrides.clear();
                ArrayList<VideoUri> arrayList = quality.uris;
                int size = arrayList.size();
                while (i2 < size) {
                    VideoUri videoUri = arrayList.get(i2);
                    i2++;
                    TrackSelectionOverride qualityTrackSelection = getQualityTrackSelection(videoUri);
                    if (qualityTrackSelection != null) {
                        builder2.overrides.put(qualityTrackSelection.mediaTrackGroup, qualityTrackSelection);
                    }
                }
                this.trackSelector.setParameters(new DefaultTrackSelector.Parameters(builder2));
                i2 = i;
            } else {
                this.currentStreamIsHls = false;
                this.player.setMediaSource(mediaSourceFromUri(quality.getDownloadUri(), "other"), false);
                i2 = 1;
            }
        }
        if (i2 != 0) {
            this.player.prepare();
            if (!z) {
                BasePlayer basePlayer2 = (BasePlayer) this.player;
                basePlayer2.seekTo(currentPosition, basePlayer2.getCurrentMediaItemIndex(), 5, false);
                if (z2) {
                    ((BasePlayer) this.player).setPlayWhenReady(true);
                }
            }
            Runnable runnable = this.onQualityChangeListener;
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
            }
            activePlayers.add(Integer.valueOf(this.playerId));
        }
    }

    public void seekTo(long j, boolean z, Runnable runnable) {
        if (this.player != null) {
            if (runnable != null) {
                this.seekFinishedListeners.add(runnable);
            }
            this.player.setSeekParameters(z ? SeekParameters.CLOSEST_SYNC : SeekParameters.EXACT);
            BasePlayer basePlayer = (BasePlayer) this.player;
            basePlayer.seekTo(j, basePlayer.getCurrentMediaItemIndex(), 5, false);
        }
    }

    public void preparePlayer(ArrayList<Quality> arrayList, Quality quality) {
        ArrayList<Quality> arrayList2;
        this.videoQualities = arrayList;
        this.videoQualityToSelect = quality;
        this.videoUri = null;
        this.videoType = "hls";
        this.audioUri = null;
        this.audioType = null;
        this.loopingMediaSource = false;
        this.autoIsOriginal = false;
        this.videoPlayerReady = false;
        this.mixedAudio = false;
        this.currentUri = null;
        this.isStreaming = true;
        ensurePlayerCreated();
        this.currentStreamIsHls = false;
        this.selectedQualityIndex = (quality == null || (arrayList2 = this.videoQualities) == null) ? -1 : arrayList2.indexOf(quality);
        setSelectedQuality(true, quality);
        if (this.autoIsOriginal) {
            this.selectedQualityIndex = -1;
        }
    }

    private MediaSource mediaSourceFromUri(VideoUri videoUri, String str) {
        return mediaSourceFromUri(videoUri.uri, videoUri.fileVideoOffset, str);
    }

    public static ArrayList<Quality> getQualities(int i, TLRPC.MessageMedia messageMedia, boolean z) {
        if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
            return new ArrayList<>();
        }
        return getQualities(i, messageMedia.document, messageMedia.alt_documents, 0, false, z);
    }

    public interface VideoPlayerDelegate {
        void onError(VideoPlayer videoPlayer, Exception exc);

        void onRenderedFirstFrame();

        void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime);

        void onSeekFinished(AnalyticsListener.EventTime eventTime);

        void onSeekStarted(AnalyticsListener.EventTime eventTime);

        void onStateChanged(boolean z, int i);

        boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture);

        void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture);

        void onVideoSizeChanged(int i, int i2, int i3, float f);

        public abstract class CC {
            public static boolean $default$onSurfaceDestroyed(VideoPlayerDelegate videoPlayerDelegate, SurfaceTexture surfaceTexture) {
                return false;
            }

            public static void $default$onRenderedFirstFrame(VideoPlayerDelegate videoPlayerDelegate, AnalyticsListener.EventTime eventTime) {
            }

            public static void $default$onSeekFinished(VideoPlayerDelegate videoPlayerDelegate, AnalyticsListener.EventTime eventTime) {
            }

            public static void $default$onSeekStarted(VideoPlayerDelegate videoPlayerDelegate, AnalyticsListener.EventTime eventTime) {
            }

            public static void $default$onSurfaceTextureUpdated(VideoPlayerDelegate videoPlayerDelegate, SurfaceTexture surfaceTexture) {
            }
        }
    }
}

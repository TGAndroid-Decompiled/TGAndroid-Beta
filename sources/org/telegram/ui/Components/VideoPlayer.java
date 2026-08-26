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
import androidx.appcompat.widget.AppCompatBackgroundHelper;
import androidx.core.util.AtomicFile;
import androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.zzcl;
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
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.audio.TeeAudioProcessor;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.drm.DrmSessionManager$1;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.LoopingMediaSource;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import com.stripe.android.time.Clock;
import java.io.File;
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
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSource;
import org.telegram.messenger.secretmedia.ExtendedDefaultDataSourceFactory;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda112;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda16;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.iv.Latex;

public class VideoPlayer implements Player.Listener, VideoListener, AnalyticsListener, NotificationCenter.NotificationCenterDelegate {
    public static final HashSet activePlayers = new HashSet();
    public static HashMap cachedSupportedCodec;
    public static int lastPlayerId;
    public boolean allowMultipleInstances;
    public final boolean audioDisabled;
    public SimpleExoPlayer audioPlayer;
    public boolean audioPlayerReady;
    public String audioType;
    public final Handler audioUpdateHandler;
    public Uri audioUri;
    public AudioVisualizerDelegate audioVisualizerDelegate;
    public boolean autoIsOriginal;
    public boolean autoplay;
    public boolean currentStreamIsHls;
    public Uri currentUri;
    public DashMediaSource.Factory dashMediaSourceFactory;
    public VideoPlayerDelegate delegate;
    public long fallbackDuration;
    public long fallbackPosition;
    public HlsMediaSource.Factory hlsMediaSourceFactory;
    public boolean isStory;
    public boolean isStreaming;
    public boolean lastReportedPlayWhenReady;
    public int lastReportedPlaybackState;
    public boolean looping;
    public boolean loopingMediaSource;
    public ArrayList manifestUris;
    public final ExtendedDefaultDataSourceFactory mediaDataSourceFactory;
    public boolean mixedAudio;
    public boolean mixedPlayWhenReady;
    public PhotoViewer$$ExternalSyntheticLambda16 onQualityChangeListener;
    public ExoPlayerImpl player;
    public final int playerId;
    public ProgressiveMediaSource.Factory progressiveMediaSourceFactory;
    public final ArrayList seekFinishedListeners;
    public int selectedQualityIndex;
    public final boolean shouldPauseOther;
    public Surface surface;
    public SurfaceView surfaceView;
    public TextureView textureView;
    public final DefaultTrackSelector trackSelector;
    public boolean triedReinit;
    public boolean videoPlayerReady;
    public ArrayList videoQualities;
    public Quality videoQualityToSelect;
    public String videoType;
    public Uri videoUri;
    public DispatchQueue workerQueue;

    public interface AudioVisualizerDelegate {
        boolean needUpdate();

        void onVisualizerUpdate(boolean z, boolean z2, float[] fArr);
    }

    public final class AudioVisualizerRenderersFactory extends DefaultRenderersFactory {
        public final VideoPlayer this$0;

        public AudioVisualizerRenderersFactory(Context context, VideoPlayer videoPlayer) {
            super(context);
            this.this$0 = videoPlayer;
        }

        @Override
        public final DefaultAudioSink buildAudioSink(Context context) {
            AtomicFile atomicFile = new AtomicFile(16);
            AudioCapabilities capabilities = AudioCapabilities.getCapabilities(context);
            capabilities.getClass();
            atomicFile.mBaseName = capabilities;
            atomicFile.mNewName = new AtomicFile(new AudioProcessor[]{new TeeAudioProcessor(this.this$0.new VisualizerBufferSink())});
            return new DefaultAudioSink(atomicFile);
        }
    }

    public final class OffsetDataSource implements DataSource {
        public final long byteOffset;
        public final ExtendedDefaultDataSource upstream;

        public OffsetDataSource(ExtendedDefaultDataSource extendedDefaultDataSource, long j) {
            this.upstream = extendedDefaultDataSource;
            this.byteOffset = j;
        }

        @Override
        public final void addTransferListener(TransferListener transferListener) {
            this.upstream.addTransferListener(transferListener);
        }

        @Override
        public final void close() {
            this.upstream.close();
        }

        @Override
        public final Map getResponseHeaders() {
            return this.upstream.getResponseHeaders();
        }

        @Override
        public final Uri getUri() {
            return this.upstream.getUri();
        }

        @Override
        public final long open(DataSpec dataSpec) {
            dataSpec.getClass();
            Uri uri = dataSpec.uri;
            long j = this.byteOffset + dataSpec.position;
            Log.checkStateNotNull(uri, "The uri must be set.");
            return this.upstream.open(new DataSpec(uri, dataSpec.httpBody, dataSpec.httpRequestHeaders, j, dataSpec.length, dataSpec.key, dataSpec.flags));
        }

        @Override
        public final int read(byte[] bArr, int i, int i2) {
            return this.upstream.read(bArr, i, i2);
        }
    }

    public final class Quality {
        public final int height;
        public final boolean original;
        public final ArrayList uris;
        public final int width;

        public Quality(VideoUri videoUri) {
            ArrayList arrayList = new ArrayList();
            this.uris = arrayList;
            this.original = videoUri.original;
            this.width = videoUri.width;
            this.height = videoUri.height;
            arrayList.add(videoUri);
        }

        public final VideoUri getDownloadUri() {
            ArrayList arrayList = this.uris;
            VideoUri videoUri = null;
            if (arrayList.isEmpty()) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                VideoUri videoUri2 = (VideoUri) obj;
                if (videoUri2.isCached()) {
                    return videoUri2;
                }
            }
            long j = Long.MAX_VALUE;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                VideoUri videoUri3 = (VideoUri) arrayList.get(i2);
                if (videoUri3.size < j && VideoPlayer.supportsHardwareDecoder(videoUri3.codec)) {
                    j = videoUri3.size;
                    videoUri = videoUri3;
                }
            }
            return videoUri != null ? videoUri : (VideoUri) arrayList.get(0);
        }

        public final int p() {
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

        public final String toString() {
            String str;
            boolean z = SharedConfig.debugVideoQualities;
            boolean z2 = this.original;
            String str2 = "";
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(p());
                sb.append("p");
                if (z2) {
                    str2 = " (" + LocaleController.getString(R.string.QualitySource) + ")";
                }
                sb.append(str2);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.width);
            sb2.append("x");
            sb2.append(this.height);
            if (z2) {
                str = " (" + LocaleController.getString(R.string.QualitySource) + ")";
            } else {
                str = "";
            }
            sb2.append(str);
            sb2.append("\n");
            ArrayList arrayList = this.uris;
            sb2.append(AndroidUtilities.formatFileSize((long) ((VideoUri) arrayList.get(0)).bitrate).replace(" ", ""));
            sb2.append("/s");
            if (((VideoUri) arrayList.get(0)).codec != null) {
                str2 = ", " + ((VideoUri) arrayList.get(0)).codec;
            }
            sb2.append(str2);
            return sb2.toString();
        }
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
    }

    public final class VideoUri {
        public double bitrate;
        public String codec;
        public int currentAccount;
        public long docId;
        public TLRPC.Document document;
        public int height;
        public Uri m3u8uri;
        public long manifestDocId;
        public TLRPC.Document manifestDocument;
        public boolean original;
        public long size;
        public Uri uri;
        public int width;

        public static Uri getUri(int i, int i2, TLRPC.Document document) {
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
            videoUri.uri = getUri(i, i2, document);
            if (document2 != null) {
                videoUri.manifestDocument = document2;
                videoUri.manifestDocId = document2.id;
                videoUri.m3u8uri = getUri(i, i2, document2);
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

        public final boolean isCached() {
            Uri uri = this.uri;
            return uri != null && "file".equalsIgnoreCase(uri.getScheme());
        }

        public final boolean isManifestCached() {
            Uri uri = this.m3u8uri;
            return uri != null && "file".equalsIgnoreCase(uri.getScheme());
        }

        public final void updateCached(boolean z) {
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

    public final class VisualizerBufferSink {
        public final ByteBuffer byteBuffer;
        public long lastUpdateTime;
        public final FourierTransform.FFT fft = new FourierTransform.FFT(1024, 48000.0f);
        public final float[] real = new float[1024];
        public int position = 0;

        public VisualizerBufferSink() {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(8192);
            this.byteBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.position(0);
        }
    }

    public VideoPlayer() {
        this(true, false);
    }

    public static VideoUri getCachedQuality(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((Quality) obj).uris;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                VideoUri videoUri = (VideoUri) obj2;
                if (videoUri.isCached()) {
                    return videoUri;
                }
            }
        }
        return null;
    }

    public static ArrayList getQualities(int i, TLRPC.Document document, ArrayList arrayList, int i2, boolean z) {
        Quality quality;
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
                    VideoUri videoUriOf = VideoUri.of(i, document3, (TLRPC.Document) longSparseArray.get(document3.id), i2, z);
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
            if (str2 == null || ((!"av1".equals(str2) && !"av01".equals(videoUri.codec) && !"hevc".equals(videoUri.codec) && !"h265".equals(videoUri.codec) && !"vp9".equals(videoUri.codec)) || supportsHardwareDecoder(videoUri.codec))) {
                arrayList4.add(videoUri);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (arrayList4.isEmpty()) {
            arrayList5.addAll(arrayList3);
        } else {
            arrayList5.addAll(arrayList4);
        }
        ArrayList arrayList6 = new ArrayList();
        int size = arrayList5.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList5.get(i6);
            i6++;
            VideoUri videoUri2 = (VideoUri) obj;
            if (videoUri2.original) {
                arrayList6.add(new Quality(videoUri2));
            } else {
                int size2 = arrayList6.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        quality = null;
                        break;
                    }
                    Object obj2 = arrayList6.get(i7);
                    i7++;
                    quality = (Quality) obj2;
                    if (!quality.original && quality.width == videoUri2.width && quality.height == videoUri2.height) {
                        break;
                    }
                }
                if (quality == null || SharedConfig.debugVideoQualities) {
                    arrayList6.add(new Quality(videoUri2));
                } else {
                    quality.uris.add(videoUri2);
                }
            }
        }
        return arrayList6;
    }

    public static VideoUri getQualityForPlayer(ArrayList arrayList) {
        int i;
        int i2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ArrayList arrayList2 = ((Quality) obj).uris;
            int size2 = arrayList2.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList2.get(i4);
                i4++;
                VideoUri videoUri = (VideoUri) obj2;
                if (videoUri.original && videoUri.isCached()) {
                    return videoUri;
                }
            }
        }
        int size3 = arrayList.size();
        VideoUri videoUri2 = null;
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList.get(i5);
            i5++;
            ArrayList arrayList3 = ((Quality) obj3).uris;
            int size4 = arrayList3.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList3.get(i6);
                i6++;
                VideoUri videoUri3 = (VideoUri) obj4;
                if (!videoUri3.original && supportsHardwareDecoder(videoUri3.codec) && (videoUri2 == null || (i = videoUri3.width * videoUri3.height) > (i2 = videoUri2.width * videoUri2.height) || (i == i2 && videoUri3.bitrate < videoUri2.bitrate))) {
                    videoUri2 = videoUri3;
                }
            }
        }
        if (videoUri2 == null) {
            int size5 = arrayList.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList.get(i7);
                i7++;
                ArrayList arrayList4 = ((Quality) obj5).uris;
                int size6 = arrayList4.size();
                int i8 = 0;
                while (i8 < size6) {
                    Object obj6 = arrayList4.get(i8);
                    i8++;
                    VideoUri videoUri4 = (VideoUri) obj6;
                    if (videoUri2 == null || videoUri2.width * videoUri2.height > videoUri4.width * videoUri4.height || videoUri4.bitrate < videoUri2.bitrate) {
                        videoUri2 = videoUri4;
                    }
                }
            }
        }
        return videoUri2;
    }

    public static VideoUri getQualityForThumb(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((Quality) obj).uris;
            int size2 = arrayList2.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                VideoUri videoUri = (VideoUri) obj2;
                if (videoUri.isCached()) {
                    return videoUri;
                }
            }
        }
        int size3 = arrayList.size();
        VideoUri videoUri2 = null;
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList.get(i3);
            i3++;
            ArrayList arrayList3 = ((Quality) obj3).uris;
            int size4 = arrayList3.size();
            int i4 = 0;
            while (i4 < size4) {
                Object obj4 = arrayList3.get(i4);
                i4++;
                VideoUri videoUri3 = (VideoUri) obj4;
                if (!videoUri3.original && (videoUri2 == null || videoUri2.width * videoUri2.height > videoUri3.width * videoUri3.height || videoUri3.bitrate < videoUri2.bitrate)) {
                    if (videoUri3.width <= 900 && videoUri3.height <= 900) {
                        videoUri2 = videoUri3;
                    }
                }
            }
        }
        if (videoUri2 == null) {
            int size5 = arrayList.size();
            int i5 = 0;
            while (i5 < size5) {
                Object obj5 = arrayList.get(i5);
                i5++;
                ArrayList arrayList4 = ((Quality) obj5).uris;
                int size6 = arrayList4.size();
                int i6 = 0;
                while (i6 < size6) {
                    Object obj6 = arrayList4.get(i6);
                    i6++;
                    VideoUri videoUri4 = (VideoUri) obj6;
                    if (videoUri2 == null || videoUri2.width * videoUri2.height > videoUri4.width * videoUri4.height || videoUri4.bitrate < videoUri2.bitrate) {
                        videoUri2 = videoUri4;
                    }
                }
            }
        }
        return videoUri2;
    }

    public static void saveLooping(MessageObject messageObject, boolean z) {
        if (messageObject == null) {
            return;
        }
        ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit().putBoolean(messageObject.getDialogId() + "_" + messageObject.getId() + "loop", z).apply();
    }

    public static void saveQuality(MessageObject messageObject, Quality quality) {
        if (messageObject == null) {
            return;
        }
        long dialogId = messageObject.getDialogId();
        int id = messageObject.getId();
        SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("media_saved_pos", 0).edit();
        if (quality == null) {
            editorEdit.remove(dialogId + "_" + id + "q2");
        } else {
            String str = dialogId + "_" + id + "q2";
            StringBuilder sb = new StringBuilder();
            sb.append(quality.width);
            sb.append("x");
            sb.append(quality.height);
            sb.append(quality.original ? "s" : "");
            editorEdit.putString(str, sb.toString());
        }
        editorEdit.apply();
    }

    public static boolean supportsHardwareDecoder(String str) {
        String strConcat;
        if (str != null) {
            switch (str) {
                case "av1":
                case "av01":
                    strConcat = "video/av01";
                    break;
                case "avc":
                case "h264":
                    strConcat = "video/avc";
                    break;
                case "vp8":
                    strConcat = "video/x-vnd.on2.vp8";
                    break;
                case "vp9":
                    strConcat = "video/x-vnd.on2.vp9";
                    break;
                case "h265":
                case "hevc":
                    strConcat = "video/hevc";
                    break;
                default:
                    try {
                        strConcat = "video/".concat(str);
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return false;
                    }
                    break;
            }
        } else {
            strConcat = null;
        }
        if (strConcat != null) {
            if (cachedSupportedCodec == null) {
                cachedSupportedCodec = new HashMap();
            }
            Boolean bool = (Boolean) cachedSupportedCodec.get(strConcat);
            if (bool != null) {
                return bool.booleanValue();
            }
            if (!MessagesController.getGlobalMainSettings().getBoolean("unsupport_".concat(strConcat), false)) {
                int codecCount = MediaCodecList.getCodecCount();
                for (int i = 0; i < codecCount; i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (!codecInfoAt.isEncoder()) {
                        Pattern pattern = MediaCodecUtil.PROFILE_PATTERN;
                        if (Util.SDK_INT >= 29 ? codecInfoAt.isHardwareAccelerated() : !MediaCodecUtil.isSoftwareOnly(codecInfoAt, strConcat)) {
                            for (String str2 : codecInfoAt.getSupportedTypes()) {
                                if (str2.equalsIgnoreCase(strConcat)) {
                                    cachedSupportedCodec.put(strConcat, Boolean.TRUE);
                                    return true;
                                }
                            }
                        }
                    }
                }
                cachedSupportedCodec.put(strConcat, Boolean.FALSE);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.playerDidStartPlaying || ((VideoPlayer) objArr[0]) == this || !isPlaying() || this.allowMultipleInstances) {
            return;
        }
        pause();
    }

    public final void ensurePlayerCreated() {
        DefaultLoadControl defaultLoadControl = this.isStory ? new DefaultLoadControl(new Latex(), 1000, 1000) : new DefaultLoadControl(new Latex(), 100, 5000);
        if (this.player == null) {
            DefaultRenderersFactory audioVisualizerRenderersFactory = this.audioVisualizerDelegate != null ? new AudioVisualizerRenderersFactory(ApplicationLoader.applicationContext, this) : new DefaultRenderersFactory(ApplicationLoader.applicationContext);
            audioVisualizerRenderersFactory.extensionRendererMode = 2;
            ExoPlayer.Builder builder = new ExoPlayer.Builder(ApplicationLoader.applicationContext);
            boolean z = builder.buildCalled;
            if (z) {
                throw new IllegalStateException();
            }
            builder.renderersFactorySupplier = new ExoPlayer$Builder$$ExternalSyntheticLambda2(audioVisualizerRenderersFactory, 2);
            DefaultTrackSelector defaultTrackSelector = this.trackSelector;
            if (z) {
                throw new IllegalStateException();
            }
            defaultTrackSelector.getClass();
            builder.trackSelectorSupplier = new ExoPlayer$Builder$$ExternalSyntheticLambda2(defaultTrackSelector, 1);
            boolean z2 = builder.buildCalled;
            if (z2) {
                throw new IllegalStateException();
            }
            builder.loadControlSupplier = new ExoPlayer$Builder$$ExternalSyntheticLambda2(defaultLoadControl, 0);
            if (z2) {
                throw new IllegalStateException();
            }
            builder.buildCalled = true;
            ExoPlayerImpl exoPlayerImpl = new ExoPlayerImpl(builder, null);
            this.player = exoPlayerImpl;
            DefaultAnalyticsCollector defaultAnalyticsCollector = exoPlayerImpl.analyticsCollector;
            defaultAnalyticsCollector.getClass();
            defaultAnalyticsCollector.listeners.add(this);
            this.player.listeners.add(this);
            this.player.videoListeners.add(this);
            TextureView textureView = this.textureView;
            if (textureView != null) {
                this.player.setVideoTextureView(textureView);
            } else {
                Surface surface = this.surface;
                if (surface != null) {
                    ExoPlayerImpl exoPlayerImpl2 = this.player;
                    exoPlayerImpl2.verifyApplicationThread();
                    exoPlayerImpl2.removeSurfaceCallbacks();
                    exoPlayerImpl2.setVideoOutputInternal(surface);
                    exoPlayerImpl2.maybeNotifySurfaceSizeChanged(-1, -1);
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
            DefaultTrackSelector defaultTrackSelector2 = this.trackSelector;
            if (builder2.buildCalled) {
                throw new IllegalStateException();
            }
            defaultTrackSelector2.getClass();
            builder2.trackSelectorSupplier = new ExoPlayer$Builder$$ExternalSyntheticLambda2(defaultTrackSelector2, 1);
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
                public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                }

                @Override
                public final void onAvailableCommandsChanged(Player.Commands commands) {
                }

                @Override
                public final void onCues(CueGroup cueGroup) {
                }

                @Override
                public final void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                }

                @Override
                public final void onDeviceVolumeChanged(int i, boolean z4) {
                }

                @Override
                public final void onEvents(Player player, Player.Events events) {
                }

                @Override
                public final void onIsLoadingChanged(boolean z4) {
                }

                @Override
                public final void onIsPlayingChanged(boolean z4) {
                }

                @Override
                public final void onLoadingChanged(boolean z4) {
                }

                @Override
                public final void onMediaItemTransition(MediaItem mediaItem, int i) {
                }

                @Override
                public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                }

                @Override
                public final void onMetadata(Metadata metadata) {
                }

                @Override
                public final void onPlayWhenReadyChanged(boolean z4, int i) {
                }

                @Override
                public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                }

                @Override
                public final void onPlaybackStateChanged(int i) {
                }

                @Override
                public final void onPlaybackSuppressionReasonChanged(int i) {
                }

                @Override
                public final void onPlayerError(PlaybackException playbackException) {
                }

                @Override
                public final void onPlayerErrorChanged(PlaybackException playbackException) {
                }

                @Override
                public final void onPlayerStateChanged(boolean z4, int i) {
                    VideoPlayer videoPlayer = VideoPlayer.this;
                    if (videoPlayer.audioPlayerReady || i != 3) {
                        return;
                    }
                    videoPlayer.audioPlayerReady = true;
                    if (videoPlayer.videoPlayerReady && videoPlayer.mixedPlayWhenReady) {
                        videoPlayer.play();
                    }
                }

                @Override
                public final void onPositionDiscontinuity(int i) {
                }

                @Override
                public final void onRenderedFirstFrame() {
                }

                @Override
                public final void onRepeatModeChanged(int i) {
                }

                @Override
                public final void onSeekProcessed() {
                }

                @Override
                public final void onShuffleModeEnabledChanged(boolean z4) {
                }

                @Override
                public final void onSkipSilenceEnabledChanged(boolean z4) {
                }

                @Override
                public final void onSurfaceSizeChanged(int i, int i2) {
                }

                @Override
                public final void onTimelineChanged(Timeline timeline, int i) {
                }

                @Override
                public final void onTracksChanged(Tracks tracks) {
                }

                @Override
                public final void onVideoSizeChanged(VideoSize videoSize) {
                }

                @Override
                public final void onVolumeChanged(float f) {
                }

                @Override
                public final void onCues(List list) {
                }

                @Override
                public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                }
            });
            this.audioPlayer.setPlayWhenReady(this.autoplay);
        }
    }

    public final ChromecastMediaVariations getCurrentChromecastMedia(String str, String str2, String str3) {
        if (this.videoQualities == null) {
            if (this.videoUri == null) {
                return null;
            }
            String strM = zzil.m("/mtproto_", str);
            String queryParameter = this.videoUri.getQueryParameter("mime");
            RecyclerView.Recycler recycler = new RecyclerView.Recycler(this.videoUri, TextUtils.isEmpty(queryParameter) ? "video/mp4" : queryParameter, strM);
            recycler.mRecyclerPool = str2;
            recycler.this$0 = str3;
            return new ChromecastMediaVariations(new ChromecastMedia(recycler));
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.videoQualities;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ArrayList arrayList3 = ((Quality) obj).uris;
            int size2 = arrayList3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = arrayList3.get(i2);
                i2++;
                VideoUri videoUri = (VideoUri) obj2;
                StringBuilder sb = new StringBuilder("/mtproto_");
                ArrayList arrayList4 = arrayList2;
                sb.append(videoUri.docId);
                String string = sb.toString();
                TLRPC.Document document = videoUri.document;
                String str4 = document != null ? document.mime_type : null;
                if (TextUtils.isEmpty(str4)) {
                    str4 = "video/mp4";
                }
                RecyclerView.Recycler recycler2 = new RecyclerView.Recycler(videoUri.uri, str4, string);
                recycler2.mRecyclerPool = str2;
                recycler2.this$0 = str3;
                int i3 = videoUri.width;
                int i4 = videoUri.height;
                recycler2.mRequestedCacheMax = i3;
                recycler2.mViewCacheMax = i4;
                arrayList.add(new ChromecastMedia(recycler2));
                arrayList2 = arrayList4;
            }
        }
        return new ChromecastMediaVariations(arrayList);
    }

    public final TLRPC.Document getCurrentDocument() {
        ArrayList arrayList;
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl == null) {
            return null;
        }
        exoPlayerImpl.verifyApplicationThread();
        Format format = exoPlayerImpl.videoFormat;
        if (format != null && format.documentId != 0 && (arrayList = this.videoQualities) != null) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ArrayList arrayList2 = ((Quality) obj).uris;
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    VideoUri videoUri = (VideoUri) obj2;
                    if (videoUri.docId == format.documentId) {
                        return videoUri.document;
                    }
                }
            }
        }
        return null;
    }

    public final long getCurrentPosition() {
        long j = this.fallbackPosition;
        if (j != -9223372036854775807L) {
            return j;
        }
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl == null) {
            return 0L;
        }
        exoPlayerImpl.verifyApplicationThread();
        return Util.usToMs(exoPlayerImpl.getCurrentPositionUsInternal(exoPlayerImpl.playbackInfo));
    }

    public final int getCurrentQualityIndex() {
        if (this.selectedQualityIndex == -1) {
            try {
                if (this.autoIsOriginal) {
                    for (int i = 0; i < getQualitiesCount(); i++) {
                        if (getQuality(i).original) {
                            return i;
                        }
                    }
                }
                ExoPlayerImpl exoPlayerImpl = this.player;
                if (exoPlayerImpl != null) {
                    exoPlayerImpl.verifyApplicationThread();
                    Format format = exoPlayerImpl.videoFormat;
                    if (format != null) {
                        for (int i2 = 0; i2 < getQualitiesCount(); i2++) {
                            Quality quality = getQuality(i2);
                            if (!quality.original && format.width == quality.width && format.height == quality.height && format.bitrate == ((int) Math.floor(((VideoUri) quality.uris.get(0)).bitrate * 8.0d))) {
                                return i2;
                            }
                        }
                    }
                }
                return -1;
            } catch (Exception e) {
                FileLog.e(e);
                return -1;
            }
        }
        return this.selectedQualityIndex;
    }

    public final long getDuration() {
        long j = this.fallbackDuration;
        if (j != -9223372036854775807L) {
            return j;
        }
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl != null) {
            return exoPlayerImpl.getDuration();
        }
        return 0L;
    }

    public final StoryEntry.HDRInfo getHDRStaticInfo(StoryEntry.HDRInfo hDRInfo) {
        if (hDRInfo == null) {
            hDRInfo = new StoryEntry.HDRInfo();
        }
        try {
            ExoPlayerImpl exoPlayerImpl = this.player;
            exoPlayerImpl.verifyApplicationThread();
            MediaFormat mediaFormat = ((MediaCodecRenderer) exoPlayerImpl.renderers[0]).codecOutputMediaFormat;
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

    public final Quality getHighestQuality(Boolean bool) {
        Quality quality = null;
        for (int i = 0; i < getQualitiesCount(); i++) {
            Quality quality2 = getQuality(i);
            if (quality2.original == bool.booleanValue() && (quality == null || quality.width * quality.height < quality2.width * quality2.height)) {
                quality = quality2;
            }
        }
        return quality;
    }

    public final int getQualitiesCount() {
        ArrayList arrayList = this.videoQualities;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final Quality getQuality(int i) {
        ArrayList arrayList = this.videoQualities;
        if (arrayList == null) {
            return getHighestQuality(Boolean.FALSE);
        }
        return (i < 0 || i >= arrayList.size()) ? getHighestQuality(Boolean.FALSE) : (Quality) this.videoQualities.get(i);
    }

    public final boolean isPlaying() {
        if (this.mixedAudio && this.mixedPlayWhenReady) {
            return true;
        }
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl == null) {
            return false;
        }
        exoPlayerImpl.verifyApplicationThread();
        return exoPlayerImpl.playbackInfo.playWhenReady;
    }

    public final Uri makeManifest(ArrayList arrayList) {
        String strConcat;
        int i = 1;
        StringBuilder sb = new StringBuilder("#EXTM3U\n#EXT-X-VERSION:6\n#EXT-X-INDEPENDENT-SEGMENTS\n\n");
        this.manifestUris = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2 += i;
            ArrayList arrayList3 = ((Quality) obj).uris;
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3 += i;
                VideoUri videoUri = (VideoUri) obj2;
                i2 = i2;
                long j = videoUri.docId;
                Uri uri = videoUri.uri;
                ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.mediaDataSourceFactory;
                extendedDefaultDataSourceFactory.putDocumentUri(j, uri);
                extendedDefaultDataSourceFactory.putDocumentUri(videoUri.manifestDocId, videoUri.m3u8uri);
                if (videoUri.m3u8uri != null) {
                    this.manifestUris.add(videoUri);
                    StringBuilder sb2 = new StringBuilder("#EXT-X-STREAM-INF:BANDWIDTH=");
                    sb2.append((int) Math.floor(videoUri.bitrate * 8.0d));
                    sb2.append(",RESOLUTION=");
                    sb2.append(videoUri.width);
                    sb2.append("x");
                    sb2.append(videoUri.height);
                    String str = videoUri.codec;
                    if (str != null) {
                        switch (str) {
                            case "av1":
                            case "av01":
                                strConcat = "video/av01";
                                break;
                            case "avc":
                            case "h264":
                                strConcat = "video/avc";
                                break;
                            case "vp8":
                                strConcat = "video/x-vnd.on2.vp8";
                                break;
                            case "vp9":
                                strConcat = "video/x-vnd.on2.vp9";
                                break;
                            case "h265":
                            case "hevc":
                                strConcat = "video/hevc";
                                break;
                            default:
                                strConcat = "video/".concat(str);
                                break;
                        }
                    } else {
                        strConcat = null;
                    }
                    if (strConcat != null) {
                        sb2.append(",MIME=\"");
                        sb2.append(strConcat);
                        sb2.append("\"");
                    }
                    if (videoUri.isCached() && videoUri.isManifestCached()) {
                        sb2.append(",CACHED=\"true\"");
                    }
                    sb2.append(",DOCID=\"");
                    sb2.append(videoUri.docId);
                    sb2.append("\",ACCOUNT=\"");
                    sb2.append(videoUri.currentAccount);
                    sb2.append("\"\n");
                    if (videoUri.isManifestCached()) {
                        sb2.append(videoUri.m3u8uri);
                        sb2.append("\n\n");
                    } else {
                        sb2.append("mtproto:");
                        sb2.append(videoUri.manifestDocId);
                        sb2.append("\n\n");
                    }
                    arrayList2.add(sb2.toString());
                    i = 1;
                    z = true;
                } else {
                    i = 1;
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

    public final BaseMediaSource mediaSourceFromUri(Uri uri, String str, long j) {
        MediaItem.ClippingConfiguration.Builder builder = new MediaItem.ClippingConfiguration.Builder();
        ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
        RegularImmutableList regularImmutableList = RegularImmutableList.EMPTY;
        List list = Collections.EMPTY_LIST;
        RegularImmutableList regularImmutableList2 = RegularImmutableList.EMPTY;
        MediaItem.RequestMetadata requestMetadata = MediaItem.RequestMetadata.EMPTY;
        MediaItem.PlaybackProperties playbackProperties = uri != null ? new MediaItem.PlaybackProperties(uri, list, regularImmutableList2) : null;
        MediaItem mediaItem = new MediaItem("", new MediaItem.ClippingProperties(builder), playbackProperties, new MediaItem.LiveConfiguration(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), MediaMetadata.EMPTY, requestMetadata);
        if (j != 0) {
            LaunchActivity$$ExternalSyntheticLambda112 launchActivity$$ExternalSyntheticLambda112 = new LaunchActivity$$ExternalSyntheticLambda112(this, j, 6);
            RegisteredMediaRouteProviderWatcher$$ExternalSyntheticLambda0 registeredMediaRouteProviderWatcher$$ExternalSyntheticLambda0 = new RegisteredMediaRouteProviderWatcher$$ExternalSyntheticLambda0(new DefaultExtractorsFactory(), 25);
            Clock clock = new Clock(11);
            playbackProperties.getClass();
            DrmSessionManager$1.get(mediaItem);
            return new ProgressiveMediaSource(mediaItem, launchActivity$$ExternalSyntheticLambda112, registeredMediaRouteProviderWatcher$$ExternalSyntheticLambda0, clock);
        }
        str.getClass();
        boolean zEquals = str.equals("hls");
        ExtendedDefaultDataSourceFactory extendedDefaultDataSourceFactory = this.mediaDataSourceFactory;
        if (zEquals) {
            if (this.hlsMediaSourceFactory == null) {
                this.hlsMediaSourceFactory = new HlsMediaSource.Factory(extendedDefaultDataSourceFactory);
            }
            return this.hlsMediaSourceFactory.createMediaSource(mediaItem);
        }
        if (str.equals("dash")) {
            if (this.dashMediaSourceFactory == null) {
                this.dashMediaSourceFactory = new DashMediaSource.Factory(extendedDefaultDataSourceFactory);
            }
            return this.dashMediaSourceFactory.createMediaSource(mediaItem);
        }
        if (this.progressiveMediaSourceFactory == null) {
            this.progressiveMediaSourceFactory = new ProgressiveMediaSource.Factory(extendedDefaultDataSourceFactory, new DefaultExtractorsFactory());
        }
        return this.progressiveMediaSourceFactory.createMediaSource(mediaItem);
    }

    @Override
    public final void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    @Override
    public final void onAvailableCommandsChanged(Player.Commands commands) {
    }

    @Override
    public final void onBandwidthEstimate(AnalyticsListener.EventTime eventTime, int i, long j) {
    }

    @Override
    public final void onCues(CueGroup cueGroup) {
    }

    @Override
    public final void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override
    public final void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override
    public final void onDownstreamFormatChanged(AnalyticsListener.EventTime eventTime, MediaLoadData mediaLoadData) {
    }

    @Override
    public final void onEvents(BasePlayer basePlayer, zzcl zzclVar) {
    }

    @Override
    public final void onIsLoadingChanged(boolean z) {
    }

    @Override
    public final void onIsPlayingChanged(boolean z) {
    }

    @Override
    public final void onLoadError(MediaLoadData mediaLoadData) {
    }

    @Override
    public final void onLoadingChanged(boolean z) {
    }

    @Override
    public final void onMediaItemTransition(MediaItem mediaItem, int i) {
    }

    @Override
    public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override
    public final void onMetadata(Metadata metadata) {
    }

    @Override
    public final void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override
    public final void onPlaybackStateChanged(int i) {
    }

    @Override
    public final void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override
    public final void onPlayerError(PlaybackException playbackException) {
        AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(5, this, playbackException));
    }

    @Override
    public final void onPlayerError$1(PlaybackException playbackException) {
    }

    @Override
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override
    public final void onPlayerStateChanged(boolean z, int i) {
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl != null) {
            exoPlayerImpl.verifyApplicationThread();
            boolean z2 = exoPlayerImpl.playbackInfo.playWhenReady;
            ExoPlayerImpl exoPlayerImpl2 = this.player;
            exoPlayerImpl2.verifyApplicationThread();
            int i2 = exoPlayerImpl2.playbackInfo.playbackState;
            if (this.lastReportedPlayWhenReady != z2 || this.lastReportedPlaybackState != i2) {
                this.delegate.onStateChanged(z2, i2);
                this.lastReportedPlayWhenReady = z2;
                this.lastReportedPlaybackState = i2;
            }
        }
        if (z && i == 3) {
            ExoPlayerImpl exoPlayerImpl3 = this.player;
            if (exoPlayerImpl3 != null) {
                exoPlayerImpl3.verifyApplicationThread();
                if (exoPlayerImpl3.volume != 0.0f) {
                    if (this.shouldPauseOther) {
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
                    }
                }
            } else if (this.shouldPauseOther) {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.playerDidStartPlaying, this);
            }
        }
        if (!this.videoPlayerReady && i == 3) {
            this.videoPlayerReady = true;
            if (this.audioPlayerReady && this.mixedPlayWhenReady) {
                play();
            }
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
    public final void onPositionDiscontinuity(int i) {
    }

    @Override
    public final void onPositionDiscontinuity$1(int i) {
    }

    @Override
    public final void onRenderedFirstFrame(AnalyticsListener.EventTime eventTime) {
        this.fallbackPosition = -9223372036854775807L;
        this.fallbackDuration = -9223372036854775807L;
        VideoPlayerDelegate videoPlayerDelegate = this.delegate;
        if (videoPlayerDelegate != null) {
            videoPlayerDelegate.onRenderedFirstFrame(eventTime);
        }
    }

    @Override
    public final void onRepeatModeChanged(int i) {
    }

    @Override
    public final void onSeekProcessed() {
    }

    @Override
    public final void onSeekStarted(AnalyticsListener.EventTime eventTime) {
        VideoPlayerDelegate videoPlayerDelegate = this.delegate;
        if (videoPlayerDelegate != null) {
            videoPlayerDelegate.onSeekStarted(eventTime);
        }
    }

    @Override
    public final void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override
    public final void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override
    public final void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override
    public final void onTimelineChanged(Timeline timeline, int i) {
    }

    @Override
    public final void onTracksChanged(Tracks tracks) {
        PhotoViewer$$ExternalSyntheticLambda16 photoViewer$$ExternalSyntheticLambda16 = this.onQualityChangeListener;
        if (photoViewer$$ExternalSyntheticLambda16 != null) {
            AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda16);
        }
    }

    @Override
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override
    public final void onVideoSizeChanged(VideoSize videoSize) {
        this.delegate.onVideoSizeChanged(videoSize.width, videoSize.height, videoSize.unappliedRotationDegrees, videoSize.pixelWidthHeightRatio);
    }

    @Override
    public final void onVideoSizeChanged$1(VideoSize videoSize) {
    }

    @Override
    public final void onVolumeChanged(float f) {
    }

    public void pause() {
        this.mixedPlayWhenReady = false;
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl != null) {
            exoPlayerImpl.setPlayWhenReady(false);
        }
        SimpleExoPlayer simpleExoPlayer = this.audioPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setPlayWhenReady(false);
        }
        if (this.audioVisualizerDelegate != null) {
            this.audioUpdateHandler.removeCallbacksAndMessages(null);
            this.audioVisualizerDelegate.onVisualizerUpdate(false, true, null);
        }
    }

    public void play() {
        this.mixedPlayWhenReady = true;
        if (!this.mixedAudio || (this.audioPlayerReady && this.videoPlayerReady)) {
            ExoPlayerImpl exoPlayerImpl = this.player;
            if (exoPlayerImpl != null) {
                exoPlayerImpl.setPlayWhenReady(true);
            }
            SimpleExoPlayer simpleExoPlayer = this.audioPlayer;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setPlayWhenReady(true);
                return;
            }
            return;
        }
        ExoPlayerImpl exoPlayerImpl2 = this.player;
        if (exoPlayerImpl2 != null) {
            exoPlayerImpl2.setPlayWhenReady(false);
        }
        SimpleExoPlayer simpleExoPlayer2 = this.audioPlayer;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.setPlayWhenReady(false);
        }
    }

    public final void preparePlayer(Uri uri, String str, long j) {
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
        this.player.setMediaSource(mediaSourceFromUri(uri, str, j), true);
        this.player.prepare();
    }

    public final void preparePlayerLoop(Uri uri, String str, Uri uri2, String str2) {
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
            LoopingMediaSource loopingMediaSource3 = new LoopingMediaSource(mediaSourceFromUri(uri3, str3, 0L));
            if (i == 0) {
                loopingMediaSource = loopingMediaSource3;
            } else {
                loopingMediaSource2 = loopingMediaSource3;
            }
        }
        this.player.setMediaSource(loopingMediaSource, true);
        this.player.prepare();
        SimpleExoPlayer simpleExoPlayer = this.audioPlayer;
        simpleExoPlayer.constructorFinished.blockUninterruptible();
        simpleExoPlayer.player.setMediaSource(loopingMediaSource2, true);
        this.audioPlayer.prepare();
        activePlayers.add(Integer.valueOf(this.playerId));
    }

    public final void releasePlayer() {
        activePlayers.remove(Integer.valueOf(this.playerId));
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl != null) {
            exoPlayerImpl.release();
            this.player = null;
        }
        SimpleExoPlayer simpleExoPlayer = this.audioPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.constructorFinished.blockUninterruptible();
            simpleExoPlayer.player.release();
            this.audioPlayer = null;
        }
        if (this.shouldPauseOther) {
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.playerDidStartPlaying);
        }
    }

    public void seekTo(long j) {
        seekTo(j, false);
    }

    public final void setLooping(boolean z) {
        if (this.looping != z) {
            this.looping = z;
            ExoPlayerImpl exoPlayerImpl = this.player;
            if (exoPlayerImpl != null) {
                exoPlayerImpl.setRepeatMode(z ? 2 : 0);
            }
        }
    }

    public final void setMute(boolean z) {
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl != null) {
            exoPlayerImpl.setVolume(z ? 0.0f : 1.0f);
        }
        SimpleExoPlayer simpleExoPlayer = this.audioPlayer;
        if (simpleExoPlayer != null) {
            float f = z ? 0.0f : 1.0f;
            simpleExoPlayer.constructorFinished.blockUninterruptible();
            simpleExoPlayer.player.setVolume(f);
        }
    }

    public void setPlayWhenReady(boolean z) {
        this.mixedPlayWhenReady = z;
        if (z && this.mixedAudio && (!this.audioPlayerReady || !this.videoPlayerReady)) {
            ExoPlayerImpl exoPlayerImpl = this.player;
            if (exoPlayerImpl != null) {
                exoPlayerImpl.setPlayWhenReady(false);
            }
            SimpleExoPlayer simpleExoPlayer = this.audioPlayer;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setPlayWhenReady(false);
                return;
            }
            return;
        }
        this.autoplay = z;
        ExoPlayerImpl exoPlayerImpl2 = this.player;
        if (exoPlayerImpl2 != null) {
            exoPlayerImpl2.setPlayWhenReady(z);
        }
        SimpleExoPlayer simpleExoPlayer2 = this.audioPlayer;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.setPlayWhenReady(z);
        }
    }

    public void setPlaybackSpeed(float f) {
        try {
            ExoPlayerImpl exoPlayerImpl = this.player;
            if (exoPlayerImpl != null) {
                exoPlayerImpl.setPlaybackParameters(new PlaybackParameters(f, f > 1.0f ? 0.98f : 1.0f));
            }
        } catch (Exception unused) {
        }
    }

    public final void setSelectedQuality(boolean z, Quality quality) {
        int i;
        boolean z2;
        int i2;
        TrackSelectionOverride trackSelectionOverride;
        int i3;
        Quality quality2;
        Quality highestQuality;
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl == null) {
            return;
        }
        int i4 = 0;
        boolean z3 = exoPlayerImpl.getPlaybackState() == 3 && exoPlayerImpl.getPlayWhenReady() && exoPlayerImpl.getPlaybackSuppressionReason() == 0;
        ExoPlayerImpl exoPlayerImpl2 = this.player;
        exoPlayerImpl2.verifyApplicationThread();
        long jUsToMs = Util.usToMs(exoPlayerImpl2.getCurrentPositionUsInternal(exoPlayerImpl2.playbackInfo));
        if (!z) {
            this.fallbackPosition = jUsToMs;
            this.fallbackDuration = this.player.getDuration();
        }
        this.videoQualityToSelect = quality;
        DefaultTrackSelector defaultTrackSelector = this.trackSelector;
        if (quality == null) {
            Uri uriMakeManifest = makeManifest(this.videoQualities);
            int i5 = 0;
            while (true) {
                if (i5 >= getQualitiesCount()) {
                    quality2 = null;
                    break;
                }
                Quality quality3 = getQuality(i5);
                if (quality3.original) {
                    quality2 = quality3;
                    break;
                }
                i5++;
            }
            if (quality2 != null) {
                ArrayList arrayList = quality2.uris;
                if (arrayList.size() == 1 && ((VideoUri) arrayList.get(0)).isCached()) {
                    this.currentStreamIsHls = false;
                    this.autoIsOriginal = true;
                    this.videoQualityToSelect = quality2;
                    this.player.setMediaSource(mediaSourceFromUri(quality2.getDownloadUri().uri, "other", 0L), false);
                } else if (uriMakeManifest == null) {
                    this.autoIsOriginal = false;
                    DefaultTrackSelector.Parameters parameters = defaultTrackSelector.getParameters();
                    parameters.getClass();
                    DefaultTrackSelector.Parameters.Builder builder = new DefaultTrackSelector.Parameters.Builder(parameters);
                    builder.overrides.clear();
                    defaultTrackSelector.setParameters(new DefaultTrackSelector.Parameters(builder));
                    if (this.currentStreamIsHls) {
                        z3 = z3;
                    } else {
                        this.currentStreamIsHls = true;
                        this.player.setMediaSource(mediaSourceFromUri(uriMakeManifest, "hls", 0L), false);
                    }
                } else {
                    highestQuality = getHighestQuality(Boolean.TRUE);
                    if (highestQuality == null) {
                        highestQuality = getHighestQuality(Boolean.FALSE);
                    }
                    if (highestQuality != null || highestQuality.uris.isEmpty()) {
                        return;
                    }
                    this.currentStreamIsHls = false;
                    this.videoQualityToSelect = highestQuality;
                    this.autoIsOriginal = highestQuality.original;
                    this.player.setMediaSource(mediaSourceFromUri(highestQuality.getDownloadUri().uri, "other", 0L), false);
                }
                i4 = 1;
            } else {
                if (uriMakeManifest == null) {
                    highestQuality = getHighestQuality(Boolean.TRUE);
                    if (highestQuality == null) {
                        highestQuality = getHighestQuality(Boolean.FALSE);
                    }
                    if (highestQuality != null) {
                        return;
                    } else {
                        return;
                    }
                }
                this.autoIsOriginal = false;
                DefaultTrackSelector.Parameters parameters2 = defaultTrackSelector.getParameters();
                parameters2.getClass();
                DefaultTrackSelector.Parameters.Builder builder2 = new DefaultTrackSelector.Parameters.Builder(parameters2);
                builder2.overrides.clear();
                defaultTrackSelector.setParameters(new DefaultTrackSelector.Parameters(builder2));
                if (this.currentStreamIsHls) {
                    this.currentStreamIsHls = true;
                    this.player.setMediaSource(mediaSourceFromUri(uriMakeManifest, "hls", 0L), false);
                } else {
                    z3 = z3;
                }
                i4 = 1;
            }
        } else {
            this.autoIsOriginal = false;
            ArrayList arrayList2 = quality.uris;
            if (arrayList2.isEmpty()) {
                return;
            }
            Uri uriMakeManifest2 = arrayList2.size() > 1 ? makeManifest(this.videoQualities) : null;
            if (uriMakeManifest2 == null || arrayList2.size() == 1 || defaultTrackSelector.currentMappedTrackInfo == null) {
                this.currentStreamIsHls = false;
                this.player.setMediaSource(mediaSourceFromUri(quality.getDownloadUri().uri, "other", 0L), false);
                i4 = 1;
            } else {
                if (this.currentStreamIsHls) {
                    i = 0;
                } else {
                    this.currentStreamIsHls = true;
                    this.player.setMediaSource(mediaSourceFromUri(uriMakeManifest2, "hls", 0L), false);
                    i = 1;
                }
                DefaultTrackSelector.Parameters parameters3 = defaultTrackSelector.getParameters();
                parameters3.getClass();
                DefaultTrackSelector.Parameters.Builder builder3 = new DefaultTrackSelector.Parameters.Builder(parameters3);
                builder3.overrides.clear();
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    int i7 = i6 + 1;
                    VideoUri videoUri = (VideoUri) arrayList2.get(i6);
                    try {
                        int iIndexOf = this.manifestUris.indexOf(videoUri);
                        AppCompatBackgroundHelper appCompatBackgroundHelper = defaultTrackSelector.currentMappedTrackInfo;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= appCompatBackgroundHelper.mBackgroundResId) {
                                z2 = z3;
                                i2 = i;
                                trackSelectionOverride = null;
                                break;
                            }
                            TrackGroupArray trackGroupArray = ((TrackGroupArray[]) appCompatBackgroundHelper.mDrawableManager)[i8];
                            z2 = z3;
                            while (i4 < trackGroupArray.length) {
                                try {
                                    TrackGroup trackGroup = trackGroupArray.get(i4);
                                    i2 = i;
                                    TrackGroupArray trackGroupArray2 = trackGroupArray;
                                    int i9 = 0;
                                    while (i9 < trackGroup.length) {
                                        try {
                                            Format format = trackGroup.formats[i9];
                                            int i10 = i9;
                                            try {
                                                i3 = Integer.parseInt(format.id);
                                            } catch (Exception unused) {
                                                i3 = -1;
                                            }
                                            if (i3 >= 0 && iIndexOf == i3) {
                                                trackSelectionOverride = new TrackSelectionOverride(trackGroup, ImmutableList.of((Object) Integer.valueOf(i10)));
                                                break;
                                            }
                                            int i11 = iIndexOf;
                                            if (format.width == videoUri.width && format.height == videoUri.height) {
                                                trackSelectionOverride = new TrackSelectionOverride(trackGroup, ImmutableList.of((Object) Integer.valueOf(i10)));
                                                break;
                                            } else {
                                                i9 = i10 + 1;
                                                iIndexOf = i11;
                                            }
                                        } catch (Exception e) {
                                            e = e;
                                            FileLog.e(e);
                                            trackSelectionOverride = null;
                                            break;
                                        }
                                    }
                                    i4++;
                                    i = i2;
                                    trackGroupArray = trackGroupArray2;
                                } catch (Exception e2) {
                                    e = e2;
                                    i2 = i;
                                    FileLog.e(e);
                                    trackSelectionOverride = null;
                                    if (trackSelectionOverride == null) {
                                        builder3.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
                                    }
                                    i = i2;
                                    i6 = i7;
                                    z3 = z2;
                                    i4 = 0;
                                }
                            }
                            i8++;
                            z3 = z2;
                            i4 = 0;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        z2 = z3;
                    }
                    if (trackSelectionOverride == null) {
                        builder3.overrides.put(trackSelectionOverride.mediaTrackGroup, trackSelectionOverride);
                    }
                    i = i2;
                    i6 = i7;
                    z3 = z2;
                    i4 = 0;
                }
                z3 = z3;
                defaultTrackSelector.setParameters(new DefaultTrackSelector.Parameters(builder3));
                i4 = i;
            }
        }
        if (i4 != 0) {
            this.player.prepare();
            if (!z) {
                ExoPlayerImpl exoPlayerImpl3 = this.player;
                exoPlayerImpl3.seekTo(jUsToMs, exoPlayerImpl3.getCurrentMediaItemIndex(), 5, false);
                if (z3) {
                    this.player.setPlayWhenReady(true);
                }
            }
            PhotoViewer$$ExternalSyntheticLambda16 photoViewer$$ExternalSyntheticLambda16 = this.onQualityChangeListener;
            if (photoViewer$$ExternalSyntheticLambda16 != null) {
                AndroidUtilities.runOnUIThread(photoViewer$$ExternalSyntheticLambda16);
            }
            activePlayers.add(Integer.valueOf(this.playerId));
        }
    }

    public final void setStreamType(int i) {
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl != null) {
            exoPlayerImpl.setAudioAttributes(new AudioAttributes(0, 0, i == 0 ? 2 : 1, 1, 0), false);
        }
        SimpleExoPlayer simpleExoPlayer = this.audioPlayer;
        if (simpleExoPlayer != null) {
            AudioAttributes audioAttributes = new AudioAttributes(0, 0, i == 0 ? 2 : 1, 1, 0);
            simpleExoPlayer.constructorFinished.blockUninterruptible();
            simpleExoPlayer.player.setAudioAttributes(audioAttributes, true);
        }
    }

    public final void setSurface(Surface surface) {
        if (this.surface == surface) {
            return;
        }
        this.surface = surface;
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl == null) {
            return;
        }
        exoPlayerImpl.verifyApplicationThread();
        exoPlayerImpl.removeSurfaceCallbacks();
        exoPlayerImpl.setVideoOutputInternal(surface);
        int i = surface == null ? 0 : -1;
        exoPlayerImpl.maybeNotifySurfaceSizeChanged(i, i);
    }

    public final void setSurfaceView(SurfaceView surfaceView) {
        if (this.surfaceView == surfaceView) {
            return;
        }
        this.surfaceView = surfaceView;
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl == null) {
            return;
        }
        exoPlayerImpl.setVideoSurfaceView(surfaceView);
    }

    public final void setTextureView(TextureView textureView) {
        if (this.textureView == textureView) {
            return;
        }
        this.textureView = textureView;
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl == null) {
            return;
        }
        exoPlayerImpl.setVideoTextureView(textureView);
    }

    public final void setVolume(float f) {
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl != null) {
            exoPlayerImpl.setVolume(f);
        }
        SimpleExoPlayer simpleExoPlayer = this.audioPlayer;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.constructorFinished.blockUninterruptible();
            simpleExoPlayer.player.setVolume(f);
        }
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
        this.seekFinishedListeners = new ArrayList();
        this.audioDisabled = z2;
        this.mediaDataSourceFactory = new ExtendedDefaultDataSourceFactory(ApplicationLoader.applicationContext, "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector(ApplicationLoader.applicationContext, new ChatActivity.AnonymousClass40(11));
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
    }

    @Override
    public final void onCues(List list) {
    }

    @Override
    public final void onEvents(Player player, Player.Events events) {
    }

    @Override
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
    }

    @Override
    public final void onSeekProcessed(AnalyticsListener.EventTime eventTime) {
        VideoPlayerDelegate videoPlayerDelegate = this.delegate;
        if (videoPlayerDelegate != null) {
            videoPlayerDelegate.onSeekFinished(eventTime);
        }
        ArrayList arrayList = this.seekFinishedListeners;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
        arrayList.clear();
    }

    public final void seekTo(long j, boolean z) {
        ExoPlayerImpl exoPlayerImpl = this.player;
        if (exoPlayerImpl != null) {
            exoPlayerImpl.setSeekParameters(z ? SeekParameters.CLOSEST_SYNC : SeekParameters.EXACT);
            ExoPlayerImpl exoPlayerImpl2 = this.player;
            exoPlayerImpl2.seekTo(j, exoPlayerImpl2.getCurrentMediaItemIndex(), 5, false);
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        this.delegate.onRenderedFirstFrame();
    }

    public final void seekTo(long j, boolean z, Runnable runnable) {
        if (this.player != null) {
            if (runnable != null) {
                this.seekFinishedListeners.add(runnable);
            }
            this.player.setSeekParameters(z ? SeekParameters.CLOSEST_SYNC : SeekParameters.EXACT);
            ExoPlayerImpl exoPlayerImpl = this.player;
            exoPlayerImpl.seekTo(j, exoPlayerImpl.getCurrentMediaItemIndex(), 5, false);
        }
    }

    public final void preparePlayer(ArrayList arrayList, Quality quality) {
        ArrayList arrayList2;
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
}

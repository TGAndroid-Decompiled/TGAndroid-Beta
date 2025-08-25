package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Comparator$CC;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.function.ToDoubleFunction;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Components.VideoSeekPreviewImage;

public abstract class VideoSeekPreviewImage extends View implements NotificationCenter.NotificationCenterDelegate {
    private Paint bitmapPaint;
    private RectF bitmapRect;
    private BitmapShader bitmapShader;
    private Bitmap bitmapToDraw;
    private Bitmap bitmapToRecycle;
    private int currentPixel;
    private VideoSeekPreviewImageDelegate delegate;
    private String downloadingStoryBoardMapFilename;
    private TLRPC.Document downloadingStoryboardMapDocument;
    private boolean drawStoryBoard;
    private RectF dstR;
    private long duration;
    private AnimatedFileDrawable fileDrawable;
    private Drawable frameDrawable;
    private String frameTime;
    private boolean isQualities;
    private boolean isYoutube;
    private double lastPosition;
    private int listeningCurrentAccount;
    private Runnable loadRunnable;
    private Matrix matrix;
    private boolean open;
    private Paint paint;
    private float pendingProgress;
    private int pixelWidth;
    private Runnable progressRunnable;
    private boolean ready;
    private int storyBoardFrameHeight;
    private int storyBoardFrameWidth;
    private ArrayList storyBoardMap;
    private long storyBoardMapDocId;
    private long storyBoardPictureDocId;
    private ImageReceiver storyBoardsReceiver;
    private final TextPaint textPaint;
    private int timeWidth;
    private Uri videoUri;
    private PhotoViewerWebView webView;
    private int ytImageHeight;
    private int ytImageWidth;
    private int ytImageX;
    private int ytImageY;
    private final Path ytPath;

    public interface VideoSeekPreviewImageDelegate {
        void onReady();
    }

    public static final class StoryBoardFrame {
        public final int left;
        public final double pts;
        public final int top;

        public StoryBoardFrame(double d, int i, int i2) {
            this.pts = d;
            this.left = i;
            this.top = i2;
        }
    }

    public VideoSeekPreviewImage(Context context, VideoSeekPreviewImageDelegate videoSeekPreviewImageDelegate) {
        super(context);
        this.currentPixel = -1;
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.dstR = new RectF();
        this.paint = new Paint(2);
        this.bitmapPaint = new Paint(2);
        this.bitmapRect = new RectF();
        this.matrix = new Matrix();
        this.ytPath = new Path();
        this.listeningCurrentAccount = -1;
        setVisibility(4);
        this.frameDrawable = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        this.delegate = videoSeekPreviewImageDelegate;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.storyBoardsReceiver = imageReceiver;
        imageReceiver.setParentView(this);
        this.storyBoardsReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) {
                VideoSeekPreviewImage.this.lambda$new$0(imageReceiver2, z, z2, z3);
            }

            @Override
            public void didSetImageBitmap(int i, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver2) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
            }
        });
    }

    public void lambda$new$0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        StoryBoardFrame storyBoardFrame;
        int i;
        if (z) {
            if (this.webView == null && this.storyBoardMap == null) {
                return;
            }
            int dp = AndroidUtilities.dp(150.0f);
            PhotoViewerWebView photoViewerWebView = this.webView;
            if (photoViewerWebView != null) {
                int youtubeStoryboardImageCount = photoViewerWebView.getYoutubeStoryboardImageCount((int) this.lastPosition);
                float bitmapWidth = this.storyBoardsReceiver.getBitmapWidth() / Math.min(youtubeStoryboardImageCount, 5);
                float bitmapHeight = this.storyBoardsReceiver.getBitmapHeight() / ((int) Math.ceil(youtubeStoryboardImageCount / 5.0f));
                int min = Math.min(this.webView.getYoutubeStoryboardImageIndex((int) this.lastPosition), youtubeStoryboardImageCount - 1);
                this.ytImageX = (int) ((min % 5) * bitmapWidth);
                this.ytImageY = (int) ((min / 5) * bitmapHeight);
                this.ytImageWidth = (int) bitmapWidth;
                this.ytImageHeight = (int) bitmapHeight;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.storyBoardMap.size()) {
                        storyBoardFrame = null;
                        break;
                    }
                    storyBoardFrame = (StoryBoardFrame) this.storyBoardMap.get(i2);
                    double d = i2 == 0 ? 0.0d : storyBoardFrame.pts;
                    double d2 = i2 == this.storyBoardMap.size() - 1 ? 9.9999999E7d : ((StoryBoardFrame) this.storyBoardMap.get(i2 + 1)).pts;
                    double d3 = this.lastPosition;
                    if (d3 >= d && d3 <= d2) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (storyBoardFrame == null) {
                    return;
                }
                this.ytImageX = storyBoardFrame.left;
                this.ytImageY = storyBoardFrame.top;
                this.ytImageWidth = this.storyBoardFrameWidth;
                this.ytImageHeight = this.storyBoardFrameHeight;
            }
            this.drawStoryBoard = true;
            float f = this.ytImageWidth / this.ytImageHeight;
            if (f > 1.0f) {
                i = (int) (dp / f);
            } else {
                int i3 = (int) (dp * f);
                i = dp;
                dp = i3;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (getVisibility() == 0 && layoutParams.width == dp && layoutParams.height == i) {
                return;
            }
            layoutParams.width = dp;
            layoutParams.height = i;
            setVisibility(0);
            requestLayout();
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.storyBoardsReceiver.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.storyBoardsReceiver.onDetachedFromWindow();
    }

    public void setProgressForYouTube(PhotoViewerWebView photoViewerWebView, float f, int i) {
        this.webView = photoViewerWebView;
        this.isYoutube = true;
        if (this.storyBoardMapDocId != 0) {
            this.storyBoardMapDocId = 0L;
            this.downloadingStoryBoardMapFilename = null;
            this.downloadingStoryboardMapDocument = null;
            this.storyBoardMap = null;
            listen(-1);
        }
        if (i != 0) {
            this.pixelWidth = i;
            int i2 = ((int) (i * f)) / 5;
            if (this.currentPixel == i2) {
                return;
            } else {
                this.currentPixel = i2;
            }
        }
        this.frameTime = AndroidUtilities.formatShortDuration((int) ((photoViewerWebView.getVideoDuration() * f) / 1000));
        this.timeWidth = (int) Math.ceil(this.textPaint.measureText(r10));
        invalidate();
        if (this.progressRunnable != null) {
            Utilities.globalQueue.cancelRunnable(this.progressRunnable);
        }
        double videoDuration = (f * photoViewerWebView.getVideoDuration()) / 1000.0d;
        this.lastPosition = videoDuration;
        String youtubeStoryboard = photoViewerWebView.getYoutubeStoryboard((int) videoDuration);
        if (youtubeStoryboard != null) {
            this.storyBoardsReceiver.setImage(youtubeStoryboard, null, null, null, 0L);
        }
    }

    public void setProgress(org.telegram.messenger.MessageObject r13, final float r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.VideoSeekPreviewImage.setProgress(org.telegram.messenger.MessageObject, float, int):void");
    }

    public void lambda$setProgress$2(float f, long j) {
        int i;
        if (this.fileDrawable == null) {
            this.pendingProgress = f;
            return;
        }
        int max = Math.max(200, AndroidUtilities.dp(100.0f));
        final Bitmap frameAtTime = this.fileDrawable.getFrameAtTime(j, false);
        if (frameAtTime != null) {
            int width = frameAtTime.getWidth();
            int height = frameAtTime.getHeight();
            if (width > height) {
                i = (int) (height / (width / max));
            } else {
                int i2 = (int) (width / (height / max));
                i = max;
                max = i2;
            }
            try {
                Bitmap createBitmap = Bitmaps.createBitmap(max, i, Bitmap.Config.ARGB_8888);
                this.dstR.set(0.0f, 0.0f, max, i);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawBitmap(frameAtTime, (android.graphics.Rect) null, this.dstR, this.paint);
                canvas.setBitmap(null);
                frameAtTime = createBitmap;
            } catch (Throwable unused) {
                frameAtTime = null;
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VideoSeekPreviewImage.this.lambda$setProgress$1(frameAtTime);
            }
        });
    }

    public void lambda$setProgress$1(Bitmap bitmap) {
        int i;
        if (bitmap != null) {
            if (this.bitmapToDraw != null) {
                Bitmap bitmap2 = this.bitmapToRecycle;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                this.bitmapToRecycle = this.bitmapToDraw;
            }
            this.bitmapToDraw = bitmap;
            Bitmap bitmap3 = this.bitmapToDraw;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
            this.bitmapShader = bitmapShader;
            bitmapShader.setLocalMatrix(this.matrix);
            this.bitmapPaint.setShader(this.bitmapShader);
            invalidate();
            int dp = AndroidUtilities.dp(150.0f);
            float width = bitmap.getWidth() / bitmap.getHeight();
            if (width > 1.0f) {
                i = (int) (dp / width);
            } else {
                dp = (int) (dp * width);
                i = dp;
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (getVisibility() != 0 || layoutParams.width != dp || layoutParams.height != i) {
                layoutParams.width = dp;
                layoutParams.height = i;
                setVisibility(0);
                requestLayout();
            }
        }
        this.progressRunnable = null;
    }

    public void open(MessageObject messageObject, VideoPlayer videoPlayer) {
        VideoPlayer.Quality currentQuality;
        if (videoPlayer == null) {
            return;
        }
        if (videoPlayer.getQualitiesCount() > 0) {
            VideoPlayer.VideoUri videoUri = null;
            for (int i = 0; i < videoPlayer.getQualitiesCount(); i++) {
                Iterator it = videoPlayer.getQuality(i).uris.iterator();
                while (it.hasNext()) {
                    VideoPlayer.VideoUri videoUri2 = (VideoPlayer.VideoUri) it.next();
                    if (videoUri == null || ((!videoUri.isCached() && videoUri2.isCached()) || (videoUri.isCached() == videoUri2.isCached() && videoUri2.width * videoUri2.height < videoUri.width * videoUri.height))) {
                        videoUri = videoUri2;
                    }
                }
            }
            if (videoUri != null && !videoUri.isCached() && (currentQuality = videoPlayer.getCurrentQuality()) != null) {
                videoUri = currentQuality.getDownloadUri();
            }
            if (videoUri != null && !videoUri.isCached()) {
                close();
                return;
            } else {
                if (videoUri != null) {
                    videoUri.isCached();
                }
                open(messageObject, videoUri);
            }
        } else {
            Uri currentUri = videoPlayer.getCurrentUri();
            if (currentUri != null) {
                "file".equalsIgnoreCase(currentUri.getScheme());
            }
            open(messageObject, currentUri);
        }
        TLRPC.Document findDocumentByMimeType = findDocumentByMimeType(messageObject, "application/x-tgstoryboardmap");
        long j = findDocumentByMimeType == null ? 0L : findDocumentByMimeType.id;
        if (this.storyBoardMapDocId != j) {
            this.storyBoardMapDocId = j;
            this.storyBoardMap = null;
            if (findDocumentByMimeType != null) {
                File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(findDocumentByMimeType);
                if (pathToAttach != null && pathToAttach.exists()) {
                    this.downloadingStoryBoardMapFilename = null;
                    this.downloadingStoryboardMapDocument = null;
                    listen(-1);
                    parseStoryBoardMap(pathToAttach);
                    return;
                }
                this.downloadingStoryBoardMapFilename = FileLoader.getAttachFileName(findDocumentByMimeType);
                this.downloadingStoryboardMapDocument = findDocumentByMimeType;
                listen(messageObject.currentAccount);
                FileLoader.getInstance(messageObject.currentAccount).loadFile(findDocumentByMimeType, messageObject, 2, 0);
                return;
            }
            this.downloadingStoryBoardMapFilename = null;
            this.downloadingStoryboardMapDocument = null;
            listen(-1);
            parseStoryBoardMap(null);
        }
    }

    private void listen(int i) {
        int i2 = this.listeningCurrentAccount;
        if (i2 == i) {
            return;
        }
        if (i == -1) {
            NotificationCenter.getInstance(i2).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.listeningCurrentAccount).removeObserver(this, NotificationCenter.fileLoadFailed);
        } else {
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        this.listeningCurrentAccount = i;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.fileLoaded) {
            if (((String) objArr[0]).equals(this.downloadingStoryBoardMapFilename)) {
                File pathToAttach = FileLoader.getInstance(i2).getPathToAttach(this.downloadingStoryboardMapDocument);
                if (pathToAttach != null && pathToAttach.exists()) {
                    parseStoryBoardMap(pathToAttach);
                }
                this.downloadingStoryBoardMapFilename = null;
                this.downloadingStoryboardMapDocument = null;
                listen(-1);
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileLoadFailed && ((String) objArr[0]).equals(this.downloadingStoryBoardMapFilename)) {
            this.downloadingStoryBoardMapFilename = null;
            this.downloadingStoryboardMapDocument = null;
            listen(-1);
        }
    }

    public void parseStoryBoardMap(File file) {
        if (file == null) {
            this.storyBoardMap = null;
            return;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j = 0;
            int i = 0;
            int i2 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine != null) {
                    if (readLine.startsWith("file=mtproto:")) {
                        j = Long.parseLong(readLine.substring(13));
                    } else if (readLine.startsWith("frame_width=")) {
                        i2 = Integer.parseInt(readLine.substring(12));
                    } else if (readLine.startsWith("frame_height=")) {
                        i = Integer.parseInt(readLine.substring(13));
                    } else {
                        String[] split = readLine.split(",");
                        if (split.length == 3) {
                            arrayList.add(new StoryBoardFrame(Double.parseDouble(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2])));
                        }
                    }
                } else {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new ToDoubleFunction() {
                        @Override
                        public final double applyAsDouble(Object obj) {
                            double d;
                            d = ((VideoSeekPreviewImage.StoryBoardFrame) obj).pts;
                            return d;
                        }
                    }));
                    this.storyBoardPictureDocId = j;
                    this.storyBoardFrameWidth = i2;
                    this.storyBoardFrameHeight = i;
                    this.storyBoardMap = arrayList;
                    return;
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            this.storyBoardMap = null;
        }
    }

    public void open(final MessageObject messageObject, final VideoPlayer.VideoUri videoUri) {
        if (videoUri == null || videoUri.uri.equals(this.videoUri)) {
            return;
        }
        if (this.open) {
            close();
        }
        this.isQualities = true;
        this.videoUri = videoUri.uri;
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoSeekPreviewImage.this.lambda$open$5(videoUri, messageObject);
            }
        };
        this.loadRunnable = runnable;
        dispatchQueue.postRunnable(runnable);
    }

    public void lambda$open$5(VideoPlayer.VideoUri videoUri, MessageObject messageObject) {
        Object obj;
        String absolutePath;
        if (videoUri.isCached()) {
            this.fileDrawable = new AnimatedFileDrawable(new File(videoUri.uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, null);
        } else {
            int i = UserConfig.selectedAccount;
            try {
                i = Utilities.parseInt((CharSequence) videoUri.uri.getQueryParameter("account")).intValue();
            } catch (Exception e) {
                FileLog.e(e);
            }
            int i2 = i;
            try {
                obj = FileLoader.getInstance(i2).getParentObject(Utilities.parseInt((CharSequence) videoUri.uri.getQueryParameter("rid")).intValue());
            } catch (Exception e2) {
                FileLog.e(e2);
                obj = null;
            }
            Object obj2 = obj;
            TLRPC.Document document = videoUri.document;
            if (FileLoader.getInstance(i2).isLoadingFile(FileLoader.getAttachFileName(document))) {
                absolutePath = new File(FileLoader.getDirectory(4), document.dc_id + "_" + document.id + ".temp").getAbsolutePath();
            } else {
                absolutePath = FileLoader.getInstance(i2).getPathToAttach(document, false).getAbsolutePath();
            }
            this.fileDrawable = new AnimatedFileDrawable(new File(absolutePath), true, document.size, 1, document, null, obj2, 0L, i2, true, null);
        }
        this.duration = this.fileDrawable.getDurationMs();
        float f = this.pendingProgress;
        if (f != 0.0f) {
            setProgress(messageObject, f, this.pixelWidth);
            this.pendingProgress = 0.0f;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VideoSeekPreviewImage.this.lambda$open$4();
            }
        });
    }

    public void lambda$open$4() {
        this.open = true;
        this.loadRunnable = null;
        if (this.fileDrawable != null) {
            this.ready = true;
            this.delegate.onReady();
        }
    }

    public void open(final MessageObject messageObject, final Uri uri) {
        if (uri == null || uri.equals(this.videoUri)) {
            return;
        }
        if (this.open) {
            close();
        }
        this.isQualities = false;
        this.videoUri = uri;
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                VideoSeekPreviewImage.this.lambda$open$7(uri, messageObject);
            }
        };
        this.loadRunnable = runnable;
        dispatchQueue.postRunnable(runnable);
    }

    public void lambda$open$7(Uri uri, MessageObject messageObject) {
        String absolutePath;
        if ("tg".equals(uri.getScheme())) {
            int intValue = Utilities.parseInt((CharSequence) uri.getQueryParameter("account")).intValue();
            Object parentObject = FileLoader.getInstance(intValue).getParentObject(Utilities.parseInt((CharSequence) uri.getQueryParameter("rid")).intValue());
            TLRPC.TL_document tL_document = new TLRPC.TL_document();
            tL_document.access_hash = Utilities.parseLong(uri.getQueryParameter("hash")).longValue();
            tL_document.id = Utilities.parseLong(uri.getQueryParameter("id")).longValue();
            tL_document.size = Utilities.parseLong(uri.getQueryParameter("size")).longValue();
            tL_document.dc_id = Utilities.parseInt((CharSequence) uri.getQueryParameter("dc")).intValue();
            tL_document.mime_type = uri.getQueryParameter("mime");
            tL_document.file_reference = Utilities.hexToBytes(uri.getQueryParameter("reference"));
            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
            tL_documentAttributeFilename.file_name = uri.getQueryParameter("name");
            tL_document.attributes.add(tL_documentAttributeFilename);
            tL_document.attributes.add(new TLRPC.TL_documentAttributeVideo());
            if (FileLoader.getInstance(intValue).isLoadingFile(FileLoader.getAttachFileName(tL_document))) {
                absolutePath = new File(FileLoader.getDirectory(4), tL_document.dc_id + "_" + tL_document.id + ".temp").getAbsolutePath();
            } else {
                absolutePath = FileLoader.getInstance(intValue).getPathToAttach(tL_document, false).getAbsolutePath();
            }
            this.fileDrawable = new AnimatedFileDrawable(new File(absolutePath), true, tL_document.size, 1, tL_document, null, parentObject, 0L, intValue, true, null);
        } else {
            this.fileDrawable = new AnimatedFileDrawable(new File(uri.getPath()), true, 0L, 0, null, null, null, 0L, 0, true, null);
        }
        this.duration = this.fileDrawable.getDurationMs();
        float f = this.pendingProgress;
        if (f != 0.0f) {
            setProgress(messageObject, f, this.pixelWidth);
            this.pendingProgress = 0.0f;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VideoSeekPreviewImage.this.lambda$open$6();
            }
        });
    }

    public void lambda$open$6() {
        this.open = true;
        this.loadRunnable = null;
        if (this.fileDrawable != null) {
            this.ready = true;
            this.delegate.onReady();
        }
    }

    public static TLRPC.Document findDocumentByMimeType(MessageObject messageObject, String str) {
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (media == null) {
            return null;
        }
        TLRPC.Document document = media.document;
        if (document != null && str.equalsIgnoreCase(document.mime_type)) {
            return media.document;
        }
        Iterator<TLRPC.Document> it = media.alt_documents.iterator();
        while (it.hasNext()) {
            TLRPC.Document next = it.next();
            if (str.equalsIgnoreCase(next.mime_type)) {
                return next;
            }
        }
        return null;
    }

    public static TLRPC.Document findDocumentById(MessageObject messageObject, long j) {
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (media == null) {
            return null;
        }
        TLRPC.Document document = media.document;
        if (document != null && document.id == j) {
            return document;
        }
        Iterator<TLRPC.Document> it = media.alt_documents.iterator();
        while (it.hasNext()) {
            TLRPC.Document next = it.next();
            if (next.id == j) {
                return next;
            }
        }
        return null;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotY(getMeasuredHeight());
    }

    public boolean isReady() {
        return this.ready;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Bitmap bitmap = this.bitmapToRecycle;
        if (bitmap != null) {
            bitmap.recycle();
            this.bitmapToRecycle = null;
        }
        if (this.drawStoryBoard) {
            canvas.save();
            this.ytPath.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            this.ytPath.addRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
            canvas.clipPath(this.ytPath);
            canvas.scale(getWidth() / this.ytImageWidth, getHeight() / this.ytImageHeight);
            canvas.translate(-this.ytImageX, -this.ytImageY);
            this.storyBoardsReceiver.setImageCoords(0.0f, 0.0f, r0.getBitmapWidth(), this.storyBoardsReceiver.getBitmapHeight());
            this.storyBoardsReceiver.draw(canvas);
            canvas.restore();
            this.frameDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            this.frameDrawable.draw(canvas);
            canvas.drawText(this.frameTime, (getMeasuredWidth() - this.timeWidth) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), this.textPaint);
            return;
        }
        if (this.bitmapToDraw == null || this.bitmapShader == null) {
            return;
        }
        this.matrix.reset();
        float measuredWidth = getMeasuredWidth() / this.bitmapToDraw.getWidth();
        this.matrix.preScale(measuredWidth, measuredWidth);
        this.bitmapRect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(this.bitmapRect, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.bitmapPaint);
        this.frameDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        this.frameDrawable.draw(canvas);
        canvas.drawText(this.frameTime, (getMeasuredWidth() - this.timeWidth) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), this.textPaint);
    }

    public void close() {
        if (this.loadRunnable != null) {
            Utilities.globalQueue.cancelRunnable(this.loadRunnable);
            this.loadRunnable = null;
        }
        if (this.progressRunnable != null) {
            Utilities.globalQueue.cancelRunnable(this.progressRunnable);
            this.progressRunnable = null;
        }
        AnimatedFileDrawable animatedFileDrawable = this.fileDrawable;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.resetStream(true);
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VideoSeekPreviewImage.this.lambda$close$8();
            }
        });
        setVisibility(4);
        this.bitmapToDraw = null;
        this.bitmapShader = null;
        invalidate();
        this.currentPixel = -1;
        this.videoUri = null;
        this.ready = false;
        this.open = false;
        if (this.storyBoardMapDocId != 0) {
            this.storyBoardMapDocId = 0L;
            this.downloadingStoryBoardMapFilename = null;
            this.downloadingStoryboardMapDocument = null;
            this.storyBoardMap = null;
            listen(-1);
        }
    }

    public void lambda$close$8() {
        this.pendingProgress = 0.0f;
        AnimatedFileDrawable animatedFileDrawable = this.fileDrawable;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.recycle();
            this.fileDrawable = null;
        }
    }
}

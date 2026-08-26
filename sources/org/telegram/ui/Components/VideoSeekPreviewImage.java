package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.view.View;
import j$.util.Comparator$CC;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda49;
import org.telegram.ui.Stars.StarGiftPreviewSheet$$ExternalSyntheticLambda5;

public abstract class VideoSeekPreviewImage extends View implements NotificationCenter.NotificationCenterDelegate {
    public final Paint bitmapPaint;
    public final RectF bitmapRect;
    public BitmapShader bitmapShader;
    public Bitmap bitmapToDraw;
    public Bitmap bitmapToRecycle;
    public int currentPixel;
    public final PhotoViewer$$ExternalSyntheticLambda49 delegate;
    public String downloadingStoryBoardMapFilename;
    public TLRPC.Document downloadingStoryboardMapDocument;
    public boolean drawStoryBoard;
    public final RectF dstR;
    public long duration;
    public AnimatedFileDrawable fileDrawable;
    public final Drawable frameDrawable;
    public String frameTime;
    public double lastPosition;
    public int listeningCurrentAccount;
    public Runnable loadRunnable;
    public final Matrix matrix;
    public boolean open;
    public final Paint paint;
    public float pendingProgress;
    public int pixelWidth;
    public VideoSeekPreviewImage$$ExternalSyntheticLambda6 progressRunnable;
    public boolean ready;
    public int storyBoardFrameHeight;
    public int storyBoardFrameWidth;
    public ArrayList storyBoardMap;
    public long storyBoardMapDocId;
    public long storyBoardPictureDocId;
    public final ImageReceiver storyBoardsReceiver;
    public final TextPaint textPaint;
    public int timeWidth;
    public Uri videoUri;
    public PhotoViewer.AnonymousClass79 webView;
    public int ytImageHeight;
    public int ytImageWidth;
    public int ytImageX;
    public int ytImageY;
    public final Path ytPath;

    public final class StoryBoardFrame {
        public final int left;
        public final double pts;
        public final int top;

        public StoryBoardFrame(int i, int i2, double d) {
            this.pts = d;
            this.left = i;
            this.top = i2;
        }
    }

    public VideoSeekPreviewImage(Context context, PhotoViewer$$ExternalSyntheticLambda49 photoViewer$$ExternalSyntheticLambda49) {
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
        this.delegate = photoViewer$$ExternalSyntheticLambda49;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.storyBoardsReceiver = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new VideoEditTextureView$$ExternalSyntheticLambda1(this, 3));
    }

    public final void close() {
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
            AnimatedFileDrawableStream animatedFileDrawableStream = animatedFileDrawable.stream;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (animatedFileDrawable.mDecoder != null) {
                animatedFileDrawable.mDecoder.stopDecoder();
            }
        }
        Utilities.globalQueue.postRunnable(new Tooltip$$ExternalSyntheticLambda0(this, 14));
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

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.fileLoaded) {
            if (i == NotificationCenter.fileLoadFailed && ((String) objArr[0]).equals(this.downloadingStoryBoardMapFilename)) {
                this.downloadingStoryBoardMapFilename = null;
                this.downloadingStoryboardMapDocument = null;
                listen(-1);
                return;
            }
            return;
        }
        if (((String) objArr[0]).equals(this.downloadingStoryBoardMapFilename)) {
            File pathToAttach = FileLoader.getInstance(i2).getPathToAttach(this.downloadingStoryboardMapDocument);
            if (pathToAttach != null && pathToAttach.exists()) {
                parseStoryBoardMap(pathToAttach);
            }
            this.downloadingStoryBoardMapFilename = null;
            this.downloadingStoryboardMapDocument = null;
            listen(-1);
        }
    }

    public final void listen(int i) {
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
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.storyBoardsReceiver.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.storyBoardsReceiver.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.bitmapToRecycle;
        if (bitmap != null) {
            bitmap.recycle();
            this.bitmapToRecycle = null;
        }
        boolean z = this.drawStoryBoard;
        TextPaint textPaint = this.textPaint;
        Drawable drawable = this.frameDrawable;
        if (!z) {
            if (this.bitmapToDraw == null || this.bitmapShader == null) {
                return;
            }
            Matrix matrix = this.matrix;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.bitmapToDraw.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            RectF rectF = this.bitmapRect;
            rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.bitmapPaint);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.frameTime, (getMeasuredWidth() - this.timeWidth) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
            return;
        }
        canvas.save();
        Path path = this.ytPath;
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(getWidth() / this.ytImageWidth, getHeight() / this.ytImageHeight);
        canvas.translate(-this.ytImageX, -this.ytImageY);
        ImageReceiver imageReceiver = this.storyBoardsReceiver;
        imageReceiver.setImageCoords(0.0f, 0.0f, imageReceiver.getBitmapWidth(), imageReceiver.getBitmapHeight());
        imageReceiver.draw(canvas);
        canvas.restore();
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        canvas.drawText(this.frameTime, (getMeasuredWidth() - this.timeWidth) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotY(getMeasuredHeight());
    }

    public final void open(VideoPlayer videoPlayer, MessageObject messageObject) {
        TLRPC.Document document;
        if (videoPlayer == null) {
            return;
        }
        if (videoPlayer.getQualitiesCount() > 0) {
            VideoPlayer.VideoUri downloadUri = null;
            for (int i = 0; i < videoPlayer.getQualitiesCount(); i++) {
                ArrayList arrayList = videoPlayer.getQuality(i).uris;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    VideoPlayer.VideoUri videoUri = (VideoPlayer.VideoUri) obj;
                    if (downloadUri == null || ((!downloadUri.isCached() && videoUri.isCached()) || (downloadUri.isCached() == videoUri.isCached() && videoUri.width * videoUri.height < downloadUri.width * downloadUri.height))) {
                        downloadUri = videoUri;
                    }
                }
            }
            if (downloadUri != null && !downloadUri.isCached()) {
                int currentQualityIndex = videoPlayer.getCurrentQualityIndex();
                VideoPlayer.Quality quality = (currentQualityIndex < 0 || currentQualityIndex >= videoPlayer.getQualitiesCount()) ? null : videoPlayer.getQuality(currentQualityIndex);
                if (quality != null) {
                    downloadUri = quality.getDownloadUri();
                }
            }
            if (downloadUri != null && !downloadUri.isCached()) {
                close();
                return;
            }
            if (downloadUri != null) {
                downloadUri.isCached();
            }
            if (downloadUri != null && !downloadUri.uri.equals(this.videoUri)) {
                if (this.open) {
                    close();
                }
                this.videoUri = downloadUri.uri;
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                IntroActivity$$ExternalSyntheticLambda5 introActivity$$ExternalSyntheticLambda5 = new IntroActivity$$ExternalSyntheticLambda5((PhotoViewer.AnonymousClass52) this, downloadUri, messageObject, 11);
                this.loadRunnable = introActivity$$ExternalSyntheticLambda5;
                dispatchQueue.postRunnable(introActivity$$ExternalSyntheticLambda5);
            }
        } else {
            Uri uri = videoPlayer.currentUri;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
            }
            if (uri != null && !uri.equals(this.videoUri)) {
                if (this.open) {
                    close();
                }
                this.videoUri = uri;
                DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                IntroActivity$$ExternalSyntheticLambda5 introActivity$$ExternalSyntheticLambda6 = new IntroActivity$$ExternalSyntheticLambda5((PhotoViewer.AnonymousClass52) this, uri, messageObject, 10);
                this.loadRunnable = introActivity$$ExternalSyntheticLambda6;
                dispatchQueue2.postRunnable(introActivity$$ExternalSyntheticLambda6);
            }
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (media == null) {
            document = null;
            break;
        }
        TLRPC.Document document2 = media.document;
        if (document2 == null || !"application/x-tgstoryboardmap".equalsIgnoreCase(document2.mime_type)) {
            ArrayList<TLRPC.Document> arrayList2 = media.alt_documents;
            int size2 = arrayList2.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    document = null;
                    break;
                }
                TLRPC.Document document3 = arrayList2.get(i3);
                i3++;
                TLRPC.Document document4 = document3;
                if ("application/x-tgstoryboardmap".equalsIgnoreCase(document4.mime_type)) {
                    document = document4;
                    break;
                }
            }
        } else {
            document = media.document;
        }
        long j = document == null ? 0L : document.id;
        if (this.storyBoardMapDocId != j) {
            this.storyBoardMapDocId = j;
            this.storyBoardMap = null;
            if (document == null) {
                this.downloadingStoryBoardMapFilename = null;
                this.downloadingStoryboardMapDocument = null;
                listen(-1);
                this.storyBoardMap = null;
                return;
            }
            File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document);
            if (pathToAttach == null || !pathToAttach.exists()) {
                this.downloadingStoryBoardMapFilename = FileLoader.getAttachFileName(document);
                this.downloadingStoryboardMapDocument = document;
                listen(messageObject.currentAccount);
                FileLoader.getInstance(messageObject.currentAccount).loadFile(document, messageObject, 2, 0);
                return;
            }
            this.downloadingStoryBoardMapFilename = null;
            this.downloadingStoryboardMapDocument = null;
            listen(-1);
            parseStoryBoardMap(pathToAttach);
        }
    }

    public final void parseStoryBoardMap(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j = 0;
            int i = 0;
            int i2 = 0;
            while (true) {
                String line = randomAccessFile.readLine();
                if (line == null) {
                    Collections.sort(arrayList, Comparator$CC.comparingDouble(new StarGiftPreviewSheet$$ExternalSyntheticLambda5(1)));
                    this.storyBoardPictureDocId = j;
                    this.storyBoardFrameWidth = i2;
                    this.storyBoardFrameHeight = i;
                    this.storyBoardMap = arrayList;
                    return;
                }
                if (line.startsWith("file=mtproto:")) {
                    j = Long.parseLong(line.substring(13));
                } else if (line.startsWith("frame_width=")) {
                    i2 = Integer.parseInt(line.substring(12));
                } else if (line.startsWith("frame_height=")) {
                    i = Integer.parseInt(line.substring(13));
                } else {
                    String[] strArrSplit = line.split(",");
                    if (strArrSplit.length == 3) {
                        arrayList.add(new StoryBoardFrame(Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), Double.parseDouble(strArrSplit[0])));
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
            this.storyBoardMap = null;
        }
    }

    public final void setProgress(MessageObject messageObject, final float f, int i) {
        TLRPC.Document document;
        this.webView = null;
        boolean z = false;
        if (this.storyBoardMap != null) {
            long j = this.storyBoardPictureDocId;
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (media == null) {
                document = null;
                break;
            }
            document = media.document;
            if (document == null || document.id != j) {
                ArrayList<TLRPC.Document> arrayList = media.alt_documents;
                int size = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        document = null;
                        break;
                    }
                    TLRPC.Document document2 = arrayList.get(i2);
                    i2++;
                    TLRPC.Document document3 = document2;
                    if (document3.id == j) {
                        document = document3;
                        break;
                    }
                }
            }
            if (document != null) {
                this.lastPosition = ((double) (this.duration * f)) / 1000.0d;
                this.storyBoardsReceiver.setImage(ImageLocation.getForDocument(document), null, null, null, messageObject, 0);
                z = true;
            } else {
                this.storyBoardsReceiver.setImageBitmap((Drawable) null);
            }
        } else {
            this.storyBoardsReceiver.setImageBitmap((Drawable) null);
        }
        this.drawStoryBoard = z;
        if (i != 0) {
            this.pixelWidth = i;
            int i3 = ((int) (i * f)) / 5;
            if (this.currentPixel == i3) {
                return;
            } else {
                this.currentPixel = i3;
            }
        }
        final long j2 = (long) (this.duration * f);
        String shortDuration = AndroidUtilities.formatShortDuration((int) (j2 / 1000));
        this.frameTime = shortDuration;
        this.timeWidth = (int) Math.ceil(this.textPaint.measureText(shortDuration));
        invalidate();
        if (this.progressRunnable != null) {
            Utilities.globalQueue.cancelRunnable(this.progressRunnable);
        }
        if (z) {
            return;
        }
        AnimatedFileDrawable animatedFileDrawable = this.fileDrawable;
        if (animatedFileDrawable != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = animatedFileDrawable.stream;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (animatedFileDrawable.mDecoder != null) {
                animatedFileDrawable.mDecoder.prepareToSeek();
            }
        }
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        ?? r5 = new Runnable() {
            @Override
            public final void run() {
                int i4;
                VideoSeekPreviewImage videoSeekPreviewImage = this.f$0;
                if (videoSeekPreviewImage.fileDrawable == null) {
                    videoSeekPreviewImage.pendingProgress = f;
                    return;
                }
                int iMax = Math.max(200, AndroidUtilities.dp(100.0f));
                Bitmap frameAtTime = videoSeekPreviewImage.fileDrawable.getFrameAtTime(j2, false);
                if (frameAtTime != null) {
                    int width = frameAtTime.getWidth();
                    int height = frameAtTime.getHeight();
                    if (width > height) {
                        i4 = (int) (height / (width / iMax));
                    } else {
                        int i5 = (int) (width / (height / iMax));
                        i4 = iMax;
                        iMax = i5;
                    }
                    try {
                        Bitmap bitmapCreateBitmap = Bitmaps.createBitmap(iMax, i4, Bitmap.Config.ARGB_8888);
                        RectF rectF = videoSeekPreviewImage.dstR;
                        rectF.set(0.0f, 0.0f, iMax, i4);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        canvas.drawBitmap(frameAtTime, (Rect) null, rectF, videoSeekPreviewImage.paint);
                        canvas.setBitmap(null);
                        frameAtTime = bitmapCreateBitmap;
                    } catch (Throwable unused) {
                        frameAtTime = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda8(7, videoSeekPreviewImage, frameAtTime));
            }
        };
        this.progressRunnable = r5;
        dispatchQueue.postRunnable(r5);
    }
}

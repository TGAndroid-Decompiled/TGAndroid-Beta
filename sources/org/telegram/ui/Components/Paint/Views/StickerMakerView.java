package org.telegram.ui.Components.Paint.Views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.cast.zzba;
import com.google.android.gms.internal.mlkit_vision_common.zzid;
import com.google.android.gms.internal.mlkit_vision_label.zzkd;
import com.google.android.gms.internal.mlkit_vision_label.zzkf;
import com.google.android.gms.internal.mlkit_vision_label.zznp;
import com.google.common.base.Splitter;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0;
import com.google.firebase.messaging.GmsRpc;
import com.google.mlkit.common.sdkinternal.MLTask;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.zzh;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.common.internal.MultiFlavorDetectorCreator;
import com.google.mlkit.vision.label.defaults.ImageLabelerOptions;
import com.google.mlkit.vision.label.internal.ImageLabelerImpl;
import com.google.mlkit.vision.segmentation.subject.SubjectSegmenterOptions;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.EmuDetector;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.utils.WindowVisibilityManager$$ExternalSyntheticLambda0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.AlertsCreator$$ExternalSyntheticLambda37;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda65;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.DownloadButton;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.community.CommunityUtils$$ExternalSyntheticLambda2;
import org.telegram.ui.iv.RichEditor;

public final class StickerMakerView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public final TextView actionTextView;
    public final Path areaPath;
    public final Paint bgPaint;
    public final Path bgPath;
    public final Paint borderPaint;
    public ValueAnimator bordersAnimator;
    public float bordersAnimatorValue;
    public float bordersAnimatorValueStart;
    public final PathMeasure bordersPathMeasure;
    public int containerHeight;
    public int containerWidth;
    public int currentAccount;
    public final Paint dashPaint;
    public final Path dashPath;
    public String detectedEmoji;
    public boolean empty;
    public final Rect exclusionRect;
    public final ArrayList exclusionRects;
    public Bitmap filteredBitmap;
    public float imageReceiverHeight;
    public final Matrix imageReceiverMatrix;
    public float imageReceiverWidth;
    public boolean isSegmentedState;
    public boolean isThanosInProgress;
    public DownloadButton.PreparingVideoToast loadingToast;
    public SegmentedObject[] objects;
    public int orientation;
    public final AnimatedFloat outlineAlpha;
    public final RectF outlineBounds;
    public Path outlineBoundsInnerPath;
    public Path outlineBoundsPath;
    public final Matrix outlineMatrix;
    public boolean outlineVisible;
    public float outlineWidth;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Path screenPath;
    public final AnimatedFloat segmentBorderAlpha;
    public float segmentBorderImageHeight;
    public float segmentBorderImageWidth;
    public final Paint segmentBorderPaint;
    public volatile boolean segmentingLoaded;
    public volatile boolean segmentingLoading;
    public SegmentedObject selectedObject;
    public volatile Bitmap sourceBitmap;
    public StickerCutOutBtn stickerCutOutBtn;
    public StickerUploader stickerUploader;
    public ThanosEffect thanosEffect;
    public float tx;
    public float ty;
    public final PaintWeightChooserView weightChooserView;

    public final class Point extends android.graphics.Point {
        public Point(float f, int i, int i2) {
            super((int) (i * f), (int) (i2 * f));
        }
    }

    public final class SegmentedObject {
        public float borderImageHeight;
        public float borderImageWidth;
        public Bitmap darkMaskImage;
        public boolean hover;
        public Bitmap image;
        public int orientation;
        public Bitmap overrideDarkMaskImage;
        public Bitmap overrideImage;
        public float[] points;
        public int pointsCount;
        public final Paint pointsHighlightPaint;
        public final Paint pointsPaint;
        public final AnimatedFloat select = new AnimatedFloat(0.0f, (View) null, 0, 320, CubicBezierInterpolator.EASE_OUT_QUINT);
        public final RectF bounds = new RectF();
        public final RectF rotatedBounds = new RectF();
        public final Path segmentBorderPath = new Path();
        public final Path partSegmentBorderPath = new Path();
        public final Paint bordersFillPaint = new Paint(1);
        public final Paint bordersStrokePaint = new Paint(1);

        public SegmentedObject() {
            new Paint(1);
            this.pointsPaint = new Paint(1);
            this.pointsHighlightPaint = new Paint(1);
        }

        public final Bitmap makeDarkMaskImage() {
            Bitmap bitmap = this.overrideImage;
            if (bitmap == null) {
                bitmap = this.image;
            }
            int width = bitmap.getWidth();
            Bitmap bitmap2 = this.overrideImage;
            if (bitmap2 == null) {
                bitmap2 = this.image;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, bitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(-16777216);
            Paint paint = new Paint(3);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Bitmap bitmap3 = this.overrideImage;
            if (bitmap3 == null) {
                bitmap3 = this.image;
            }
            canvas.drawBitmap(bitmap3, 0.0f, 0.0f, paint);
            return bitmapCreateBitmap;
        }
    }

    public final class StickerUploader {
        public boolean addToFavorite;
        public Utilities.Callback2 customHandler;
        public String emoji;
        public TLRPC.InputFile file;
        public String finalPath;
        public TLRPC.TL_messageMediaDocument mediaDocument;
        public MessageObject messageObject;
        public String path;
        public TLRPC.Document replacedSticker;
        public long sendToDialogId;
        public CharSequence stickerPackName;
        public TLRPC.StickerSet stickerSet;
        public String thumbPath;
        public TLRPC.TL_inputStickerSetItem tlInputStickerSetItem;
        public boolean uploaded;
        public VideoEditedInfo videoEditedInfo;
        public Utilities.Callback whenDone;
        public final ArrayList finalFiles = new ArrayList();
        public final ArrayList files = new ArrayList();
        public float convertingProgress = 0.0f;
        public float uploadProgress = 0.0f;

        public final void destroy() {
            ArrayList arrayList = this.finalFiles;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                try {
                    ((File) obj).delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            arrayList.clear();
            ArrayList arrayList2 = this.files;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                try {
                    ((File) obj2).delete();
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            arrayList2.clear();
        }
    }

    public final class SubjectMock {
        public Bitmap bitmap;
        public int height;
        public int startX;
        public int startY;
        public int width;
    }

    public StickerMakerView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = -1;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.segmentBorderAlpha = new AnimatedFloat(0.0f, (View) null, 0L, 420L, cubicBezierInterpolator);
        this.outlineAlpha = new AnimatedFloat(0.0f, (View) null, 0L, 420L, cubicBezierInterpolator);
        Paint paint = new Paint(1);
        this.dashPaint = paint;
        Paint paint2 = new Paint(1);
        this.bgPaint = paint2;
        Paint paint3 = new Paint(1);
        this.borderPaint = paint3;
        Paint paint4 = new Paint(1);
        this.segmentBorderPaint = paint4;
        this.bordersPathMeasure = new PathMeasure();
        this.bgPath = new Path();
        this.areaPath = new Path();
        this.screenPath = new Path();
        this.dashPath = new Path();
        this.outlineWidth = 2.0f;
        this.imageReceiverMatrix = new Matrix();
        this.outlineMatrix = new Matrix();
        this.outlineBounds = new RectF();
        this.exclusionRects = new ArrayList();
        this.exclusionRect = new Rect();
        this.resourcesProvider = resourcesProvider;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(context);
        this.actionTextView = textView;
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, LayoutHelper.createFrame(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        float fDp = AndroidUtilities.dp(4.0f);
        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
        paint3.setMaskFilter(new BlurMaskFilter(fDp, blur));
        paint4.setColor(-1);
        paint4.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(20.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(4.0f), blur));
        paint2.setColor(1711276032);
        setLayerType(2, null);
        PaintWeightChooserView paintWeightChooserView = new PaintWeightChooserView(context);
        this.weightChooserView = paintWeightChooserView;
        paintWeightChooserView.setAlpha(0.0f);
        paintWeightChooserView.setTranslationX(-AndroidUtilities.dp(18.0f));
        paintWeightChooserView.min = 0.33f;
        paintWeightChooserView.max = 10.0f;
        paintWeightChooserView.invalidate();
        paintWeightChooserView.setBrushWeight(this.outlineWidth);
        paintWeightChooserView.setValueOverride(new RichEditor.AnonymousClass3(this));
        paintWeightChooserView.setTranslationX(-AndroidUtilities.dp(18.0f));
        paintWeightChooserView.setAlpha(0.0f);
        addView(paintWeightChooserView, LayoutHelper.createFrame(-1, -1.0f));
    }

    public static void createSegmentImagePath(SegmentedObject segmentedObject, int i, int i2) {
        Bitmap bitmap = segmentedObject.overrideImage;
        if (bitmap == null) {
            bitmap = segmentedObject.image;
        }
        int width = bitmap.getWidth();
        Bitmap bitmap2 = segmentedObject.overrideImage;
        if (bitmap2 == null) {
            bitmap2 = segmentedObject.image;
        }
        int height = bitmap2.getHeight();
        float fMax = Math.max(width, height) / (SharedConfig.getDevicePerformanceClass() == 2 ? 512.0f : 384.0f);
        if ((segmentedObject.orientation / 90) % 2 != 0) {
            Bitmap bitmap3 = segmentedObject.overrideImage;
            if (bitmap3 == null) {
                bitmap3 = segmentedObject.image;
            }
            width = bitmap3.getHeight();
            Bitmap bitmap4 = segmentedObject.overrideImage;
            if (bitmap4 == null) {
                bitmap4 = segmentedObject.image;
            }
            height = bitmap4.getWidth();
        }
        float f = width;
        float f2 = height;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (f / fMax), (int) (f2 / fMax), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        if (segmentedObject.orientation != 0) {
            Matrix matrix = new Matrix();
            float f3 = segmentedObject.orientation;
            Bitmap bitmap5 = segmentedObject.overrideImage;
            if (bitmap5 == null) {
                bitmap5 = segmentedObject.image;
            }
            matrix.postRotate(f3, bitmap5.getWidth() / 2.0f, segmentedObject.image.getHeight() / 2.0f);
            if ((segmentedObject.orientation / 90) % 2 != 0) {
                Bitmap bitmap6 = segmentedObject.overrideImage;
                if (bitmap6 == null) {
                    bitmap6 = segmentedObject.image;
                }
                int height2 = bitmap6.getHeight();
                Bitmap bitmap7 = segmentedObject.overrideImage;
                if (bitmap7 == null) {
                    bitmap7 = segmentedObject.image;
                }
                float width2 = (height2 - bitmap7.getWidth()) / 2.0f;
                matrix.postTranslate(width2, -width2);
            }
            matrix.postScale(rectF.width() / f, rectF.height() / f2);
            Bitmap bitmap8 = segmentedObject.overrideImage;
            if (bitmap8 == null) {
                bitmap8 = segmentedObject.image;
            }
            canvas.drawBitmap(bitmap8, matrix, new Paint(3));
        } else {
            Bitmap bitmap9 = segmentedObject.overrideImage;
            if (bitmap9 == null) {
                bitmap9 = segmentedObject.image;
            }
            canvas.drawBitmap(bitmap9, (Rect) null, rectF, new Paint(3));
        }
        int height3 = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth();
        int[] iArr = new int[height3];
        bitmapCreateBitmap.getPixels(iArr, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f4 = i;
        float f5 = i2;
        float fMin = Math.min(f4 / bitmapCreateBitmap.getWidth(), f5 / bitmapCreateBitmap.getHeight());
        Point point = null;
        Point point2 = null;
        int i3 = 0;
        while (i3 < height3) {
            int width3 = i3 / bitmapCreateBitmap.getWidth();
            int width4 = i3 - (bitmapCreateBitmap.getWidth() * width3);
            int i4 = iArr[i3];
            boolean z = i4 != 0;
            if (i4 == 0) {
                int i5 = i3 - 1;
                boolean z2 = i5 >= 0;
                int i6 = i3 + 1;
                boolean z3 = i6 < height3;
                if (z2 && iArr[i5] != 0) {
                    point2 = new Point(fMin, width4, width3);
                }
                if (point == null && z3 && iArr[i6] != 0) {
                    point = new Point(fMin, width4, width3);
                }
            } else {
                f = f;
            }
            boolean z4 = width4 == bitmapCreateBitmap.getWidth() + (-1);
            boolean z5 = width4 == 0;
            if (z4) {
                Point point3 = z ? new Point(fMin, width4, width3) : point2;
                if (point != null) {
                    arrayList.add(point);
                }
                if (point3 != null) {
                    arrayList2.add(point3);
                }
                point = null;
                point2 = null;
            }
            if (z5 && z) {
                point = new Point(fMin, width4, width3);
            }
            i3++;
            f = f;
        }
        float f6 = f;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Point point4 = null;
        Point point5 = null;
        int i7 = 0;
        while (i7 < height3) {
            int height4 = i7 / bitmapCreateBitmap.getHeight();
            float f7 = f2;
            int height5 = i7 - (bitmapCreateBitmap.getHeight() * height4);
            boolean z6 = iArr[(bitmapCreateBitmap.getWidth() * height5) + height4] != 0;
            if (!z6) {
                int width5 = (bitmapCreateBitmap.getWidth() * (height5 - 1)) + height4;
                Point point6 = point4;
                int width6 = (bitmapCreateBitmap.getWidth() * (height5 + 1)) + height4;
                boolean z7 = width5 >= 0;
                boolean z8 = width6 < height3;
                if (z7 && iArr[width5] != 0) {
                    point5 = new Point(fMin, height4, height5);
                }
                point4 = (point6 == null && z8 && iArr[width6] != 0) ? new Point(fMin, height4, height5) : point6;
            }
            int i8 = height3;
            boolean z9 = height5 == bitmapCreateBitmap.getHeight() + (-1);
            boolean z10 = height5 == 0;
            if (z9) {
                if (z6) {
                    point5 = new Point(fMin, height4, height5);
                }
                if (point4 != null) {
                    arrayList3.add(point4);
                }
                if (point5 != null) {
                    arrayList4.add(point5);
                }
                point4 = null;
                point5 = null;
            }
            if (z10 && z6) {
                point4 = new Point(fMin, height4, height5);
            }
            i7++;
            f2 = f7;
            height3 = i8;
        }
        float f8 = f2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Collections.reverse(arrayList2);
        Collections.reverse(arrayList3);
        linkedHashSet2.addAll(arrayList);
        linkedHashSet2.addAll(arrayList2);
        linkedHashSet.addAll(arrayList4);
        linkedHashSet.addAll(arrayList3);
        ArrayList arrayListRemoveUnnecessaryPoints = removeUnnecessaryPoints(new ArrayList(linkedHashSet));
        ArrayList arrayListRemoveUnnecessaryPoints2 = removeUnnecessaryPoints(new ArrayList(linkedHashSet2));
        Path path = new Path();
        for (int i9 = 0; i9 < arrayListRemoveUnnecessaryPoints2.size(); i9 += 2) {
            Point point7 = (Point) arrayListRemoveUnnecessaryPoints2.get(i9);
            if (path.isEmpty()) {
                path.moveTo(((android.graphics.Point) point7).x, ((android.graphics.Point) point7).y);
            } else {
                path.lineTo(((android.graphics.Point) point7).x, ((android.graphics.Point) point7).y);
            }
        }
        Path path2 = new Path();
        for (int i10 = 0; i10 < arrayListRemoveUnnecessaryPoints.size(); i10 += 2) {
            Point point8 = (Point) arrayListRemoveUnnecessaryPoints.get(i10);
            if (path2.isEmpty()) {
                path2.moveTo(((android.graphics.Point) point8).x, ((android.graphics.Point) point8).y);
            } else {
                path2.lineTo(((android.graphics.Point) point8).x, ((android.graphics.Point) point8).y);
            }
        }
        Path path3 = segmentedObject.segmentBorderPath;
        path3.reset();
        path3.op(path, path2, Path.Op.INTERSECT);
        float fMin2 = Math.min(f4 / f6, f5 / f8);
        float f9 = f6 * fMin2;
        segmentedObject.borderImageWidth = f9;
        float f10 = fMin2 * f8;
        segmentedObject.borderImageHeight = f10;
        path3.offset((-f9) / 2.0f, (-f10) / 2.0f);
        PathMeasure pathMeasure = new PathMeasure();
        pathMeasure.setPath(path3, true);
        float length = pathMeasure.getLength();
        int iCeil = (int) Math.ceil(length / AndroidUtilities.dp(2.0f));
        segmentedObject.pointsCount = iCeil;
        segmentedObject.points = new float[iCeil * 2];
        float[] fArr = new float[2];
        int i11 = 0;
        while (true) {
            int i12 = segmentedObject.pointsCount;
            if (i11 >= i12) {
                Paint paint = segmentedObject.bordersFillPaint;
                paint.setStyle(Paint.Style.FILL);
                paint.setColor(-1);
                Paint.Join join = Paint.Join.ROUND;
                paint.setStrokeJoin(join);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint.setStrokeCap(cap);
                paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(10.0f)));
                Paint paint2 = segmentedObject.bordersStrokePaint;
                Paint.Style style = Paint.Style.STROKE;
                paint2.setStyle(style);
                paint2.setColor(-1);
                paint2.setStrokeJoin(join);
                paint2.setStrokeCap(cap);
                paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(10.0f)));
                Paint paint3 = segmentedObject.pointsPaint;
                paint3.setStyle(style);
                paint3.setStrokeWidth(AndroidUtilities.dp(4.0f));
                paint3.setColor(-1);
                paint3.setStrokeCap(cap);
                float fDp = AndroidUtilities.dp(0.33f);
                BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                paint3.setMaskFilter(new BlurMaskFilter(fDp, blur));
                Paint paint4 = segmentedObject.pointsHighlightPaint;
                paint4.setStyle(style);
                paint4.setColor(Theme.multAlpha(0.04f, -1));
                paint4.setStrokeCap(cap);
                paint4.setStrokeWidth(AndroidUtilities.dp(20.0f));
                paint4.setColor(Theme.multAlpha(0.04f, -1));
                paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(60.0f), blur));
                return;
            }
            pathMeasure.getPosTan(((i11 / i12) * length) % length, fArr, null);
            float[] fArr2 = segmentedObject.points;
            int i13 = i11 * 2;
            fArr2[i13] = fArr[0];
            fArr2[i13 + 1] = fArr[1];
            i11++;
        }
    }

    public static ArrayList removeUnnecessaryPoints(ArrayList arrayList) {
        if (arrayList.size() < 3) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((Point) arrayList.get(0));
        int i = 1;
        while (i < arrayList.size() - 1) {
            Point point = (Point) arrayList.get(i - 1);
            Point point2 = (Point) arrayList.get(i);
            i++;
            Point point3 = (Point) arrayList.get(i);
            int i2 = ((android.graphics.Point) point2).x;
            int i3 = ((android.graphics.Point) point).x;
            int i4 = ((android.graphics.Point) point3).y;
            int i5 = ((android.graphics.Point) point).y;
            if (Math.abs((((i4 - i5) * (i2 - i3)) - ((((android.graphics.Point) point3).x - i3) * (((android.graphics.Point) point2).y - i5))) - (-1.0f)) >= 0.15f) {
                arrayList2.add(point2);
            }
        }
        arrayList2.add((Point) Fragment$$ExternalSyntheticOutline0.m(1, arrayList));
        return arrayList2;
    }

    public final void afterUploadingMedia() {
        final int i = 0;
        int i2 = 11;
        final int i3 = 1;
        final StickerUploader stickerUploader = this.stickerUploader;
        if (stickerUploader == null) {
            return;
        }
        final int i4 = UserConfig.selectedAccount;
        stickerUploader.uploaded = true;
        if (stickerUploader.customHandler != null) {
            hideLoadingDialog();
            stickerUploader.customHandler.run(stickerUploader.finalPath, stickerUploader.tlInputStickerSetItem.document);
            AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda2(i2), 250L);
            return;
        }
        if (stickerUploader.replacedSticker != null) {
            TLRPC.TL_stickers_replaceSticker tL_stickers_replaceSticker = new TLRPC.TL_stickers_replaceSticker();
            tL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(stickerUploader.replacedSticker, stickerUploader.emoji).document;
            tL_stickers_replaceSticker.new_sticker = stickerUploader.tlInputStickerSetItem;
            ConnectionsManager.getInstance(i4).sendRequest(tL_stickers_replaceSticker, new RequestDelegate(this) {
                public final StickerMakerView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i) {
                        case 0:
                            final StickerMakerView stickerMakerView = this.f$0;
                            stickerMakerView.getClass();
                            final int i5 = i4;
                            final StickerMakerView.StickerUploader stickerUploader2 = stickerUploader;
                            final int i6 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z;
                                    boolean z2;
                                    boolean z3;
                                    switch (i6) {
                                        case 0:
                                            final StickerMakerView stickerMakerView2 = stickerMakerView;
                                            stickerMakerView2.getClass();
                                            final TLObject tLObject2 = tLObject;
                                            boolean z4 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader3 = stickerUploader2;
                                            if (z4) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i7 = i5;
                                                MediaDataController.getInstance(i7).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i7).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i7).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast = stickerMakerView2.loadingToast;
                                                if (preparingVideoToast != null) {
                                                    preparingVideoToast.setProgress(1.0f);
                                                }
                                                final int i8 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject3 = tLObject2;
                                                        StickerMakerView.StickerUploader stickerUploader4 = stickerUploader3;
                                                        StickerMakerView stickerMakerView3 = stickerMakerView2;
                                                        int i9 = i8;
                                                        stickerMakerView3.getClass();
                                                        switch (i9) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i10 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader4.mediaDocument.document;
                                                                String str = stickerUploader4.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i10, bool, tLObject3, document, str, bool);
                                                                stickerMakerView3.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject3, stickerUploader4.mediaDocument.document, stickerUploader4.thumbPath, Boolean.TRUE);
                                                                stickerMakerView3.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i11 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader4.mediaDocument.document;
                                                                String str2 = stickerUploader4.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i11, bool2, tLObject3, document2, str2, bool2);
                                                                stickerMakerView3.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z = true;
                                            } else {
                                                stickerMakerView2.showError(tL_error);
                                                stickerMakerView2.hideLoadingDialog();
                                                z = false;
                                            }
                                            Utilities.Callback callback = stickerUploader3.whenDone;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z));
                                                stickerUploader3.whenDone = null;
                                            }
                                            break;
                                        case 1:
                                            final StickerMakerView stickerMakerView3 = stickerMakerView;
                                            stickerMakerView3.getClass();
                                            final TLObject tLObject3 = tLObject;
                                            boolean z5 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader4 = stickerUploader2;
                                            if (z5) {
                                                int i9 = i5;
                                                MediaDataController.getInstance(i9).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i9).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                DownloadButton.PreparingVideoToast preparingVideoToast2 = stickerMakerView3.loadingToast;
                                                if (preparingVideoToast2 != null) {
                                                    preparingVideoToast2.setProgress(1.0f);
                                                }
                                                final int i10 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject4 = tLObject3;
                                                        StickerMakerView.StickerUploader stickerUploader5 = stickerUploader4;
                                                        StickerMakerView stickerMakerView4 = stickerMakerView3;
                                                        int i11 = i10;
                                                        stickerMakerView4.getClass();
                                                        switch (i11) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i12 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader5.mediaDocument.document;
                                                                String str = stickerUploader5.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i12, bool, tLObject4, document, str, bool);
                                                                stickerMakerView4.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject4, stickerUploader5.mediaDocument.document, stickerUploader5.thumbPath, Boolean.TRUE);
                                                                stickerMakerView4.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i13 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader5.mediaDocument.document;
                                                                String str2 = stickerUploader5.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i13, bool2, tLObject4, document2, str2, bool2);
                                                                stickerMakerView4.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z2 = true;
                                            } else {
                                                stickerMakerView3.showError(tL_error);
                                                stickerMakerView3.hideLoadingDialog();
                                                z2 = false;
                                            }
                                            Utilities.Callback callback2 = stickerUploader4.whenDone;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z2));
                                                stickerUploader4.whenDone = null;
                                            }
                                            break;
                                        default:
                                            final StickerMakerView stickerMakerView4 = stickerMakerView;
                                            stickerMakerView4.getClass();
                                            final TLObject tLObject4 = tLObject;
                                            boolean z6 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader5 = stickerUploader2;
                                            if (z6) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i11 = i5;
                                                MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i11).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast3 = stickerMakerView4.loadingToast;
                                                if (preparingVideoToast3 != null) {
                                                    preparingVideoToast3.setProgress(1.0f);
                                                }
                                                final int i12 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject4;
                                                        StickerMakerView.StickerUploader stickerUploader6 = stickerUploader5;
                                                        StickerMakerView stickerMakerView5 = stickerMakerView4;
                                                        int i13 = i12;
                                                        stickerMakerView5.getClass();
                                                        switch (i13) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i14 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader6.mediaDocument.document;
                                                                String str = stickerUploader6.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject5, document, str, bool);
                                                                stickerMakerView5.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader6.mediaDocument.document, stickerUploader6.thumbPath, Boolean.TRUE);
                                                                stickerMakerView5.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i15 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader6.mediaDocument.document;
                                                                String str2 = stickerUploader6.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView5.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z3 = true;
                                            } else {
                                                stickerMakerView4.showError(tL_error);
                                                stickerMakerView4.hideLoadingDialog();
                                                z3 = false;
                                            }
                                            Utilities.Callback callback3 = stickerUploader5.whenDone;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z3));
                                                stickerUploader5.whenDone = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final StickerMakerView stickerMakerView2 = this.f$0;
                            stickerMakerView2.getClass();
                            final int i7 = i4;
                            final StickerMakerView.StickerUploader stickerUploader3 = stickerUploader;
                            final int i8 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z;
                                    boolean z2;
                                    boolean z3;
                                    switch (i8) {
                                        case 0:
                                            final StickerMakerView stickerMakerView3 = stickerMakerView2;
                                            stickerMakerView3.getClass();
                                            final TLObject tLObject2 = tLObject;
                                            boolean z4 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader4 = stickerUploader3;
                                            if (z4) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i9 = i7;
                                                MediaDataController.getInstance(i9).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i9).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i9).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast = stickerMakerView3.loadingToast;
                                                if (preparingVideoToast != null) {
                                                    preparingVideoToast.setProgress(1.0f);
                                                }
                                                final int i10 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject2;
                                                        StickerMakerView.StickerUploader stickerUploader6 = stickerUploader4;
                                                        StickerMakerView stickerMakerView5 = stickerMakerView3;
                                                        int i13 = i10;
                                                        stickerMakerView5.getClass();
                                                        switch (i13) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i14 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader6.mediaDocument.document;
                                                                String str = stickerUploader6.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject5, document, str, bool);
                                                                stickerMakerView5.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader6.mediaDocument.document, stickerUploader6.thumbPath, Boolean.TRUE);
                                                                stickerMakerView5.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i15 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader6.mediaDocument.document;
                                                                String str2 = stickerUploader6.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView5.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z = true;
                                            } else {
                                                stickerMakerView3.showError(tL_error);
                                                stickerMakerView3.hideLoadingDialog();
                                                z = false;
                                            }
                                            Utilities.Callback callback = stickerUploader4.whenDone;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z));
                                                stickerUploader4.whenDone = null;
                                            }
                                            break;
                                        case 1:
                                            final StickerMakerView stickerMakerView4 = stickerMakerView2;
                                            stickerMakerView4.getClass();
                                            final TLObject tLObject3 = tLObject;
                                            boolean z5 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader5 = stickerUploader3;
                                            if (z5) {
                                                int i11 = i7;
                                                MediaDataController.getInstance(i11).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i11).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                DownloadButton.PreparingVideoToast preparingVideoToast2 = stickerMakerView4.loadingToast;
                                                if (preparingVideoToast2 != null) {
                                                    preparingVideoToast2.setProgress(1.0f);
                                                }
                                                final int i12 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject3;
                                                        StickerMakerView.StickerUploader stickerUploader6 = stickerUploader5;
                                                        StickerMakerView stickerMakerView5 = stickerMakerView4;
                                                        int i13 = i12;
                                                        stickerMakerView5.getClass();
                                                        switch (i13) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i14 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader6.mediaDocument.document;
                                                                String str = stickerUploader6.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i14, bool, tLObject5, document, str, bool);
                                                                stickerMakerView5.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader6.mediaDocument.document, stickerUploader6.thumbPath, Boolean.TRUE);
                                                                stickerMakerView5.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i15 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader6.mediaDocument.document;
                                                                String str2 = stickerUploader6.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i15, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView5.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z2 = true;
                                            } else {
                                                stickerMakerView4.showError(tL_error);
                                                stickerMakerView4.hideLoadingDialog();
                                                z2 = false;
                                            }
                                            Utilities.Callback callback2 = stickerUploader5.whenDone;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z2));
                                                stickerUploader5.whenDone = null;
                                            }
                                            break;
                                        default:
                                            final StickerMakerView stickerMakerView5 = stickerMakerView2;
                                            stickerMakerView5.getClass();
                                            final TLObject tLObject4 = tLObject;
                                            boolean z6 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader6 = stickerUploader3;
                                            if (z6) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i13 = i7;
                                                MediaDataController.getInstance(i13).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i13).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast3 = stickerMakerView5.loadingToast;
                                                if (preparingVideoToast3 != null) {
                                                    preparingVideoToast3.setProgress(1.0f);
                                                }
                                                final int i14 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject4;
                                                        StickerMakerView.StickerUploader stickerUploader7 = stickerUploader6;
                                                        StickerMakerView stickerMakerView6 = stickerMakerView5;
                                                        int i15 = i14;
                                                        stickerMakerView6.getClass();
                                                        switch (i15) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i16 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader7.mediaDocument.document;
                                                                String str = stickerUploader7.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i16, bool, tLObject5, document, str, bool);
                                                                stickerMakerView6.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader7.mediaDocument.document, stickerUploader7.thumbPath, Boolean.TRUE);
                                                                stickerMakerView6.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i17 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader7.mediaDocument.document;
                                                                String str2 = stickerUploader7.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i17, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView6.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z3 = true;
                                            } else {
                                                stickerMakerView5.showError(tL_error);
                                                stickerMakerView5.hideLoadingDialog();
                                                z3 = false;
                                            }
                                            Utilities.Callback callback3 = stickerUploader6.whenDone;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z3));
                                                stickerUploader6.whenDone = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final StickerMakerView stickerMakerView3 = this.f$0;
                            stickerMakerView3.getClass();
                            final int i9 = i4;
                            final StickerMakerView.StickerUploader stickerUploader4 = stickerUploader;
                            final int i10 = 2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z;
                                    boolean z2;
                                    boolean z3;
                                    switch (i10) {
                                        case 0:
                                            final StickerMakerView stickerMakerView4 = stickerMakerView3;
                                            stickerMakerView4.getClass();
                                            final TLObject tLObject2 = tLObject;
                                            boolean z4 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader5 = stickerUploader4;
                                            if (z4) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i11 = i9;
                                                MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i11).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast = stickerMakerView4.loadingToast;
                                                if (preparingVideoToast != null) {
                                                    preparingVideoToast.setProgress(1.0f);
                                                }
                                                final int i12 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject2;
                                                        StickerMakerView.StickerUploader stickerUploader7 = stickerUploader5;
                                                        StickerMakerView stickerMakerView6 = stickerMakerView4;
                                                        int i15 = i12;
                                                        stickerMakerView6.getClass();
                                                        switch (i15) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i16 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader7.mediaDocument.document;
                                                                String str = stickerUploader7.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i16, bool, tLObject5, document, str, bool);
                                                                stickerMakerView6.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader7.mediaDocument.document, stickerUploader7.thumbPath, Boolean.TRUE);
                                                                stickerMakerView6.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i17 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader7.mediaDocument.document;
                                                                String str2 = stickerUploader7.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i17, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView6.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z = true;
                                            } else {
                                                stickerMakerView4.showError(tL_error);
                                                stickerMakerView4.hideLoadingDialog();
                                                z = false;
                                            }
                                            Utilities.Callback callback = stickerUploader5.whenDone;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z));
                                                stickerUploader5.whenDone = null;
                                            }
                                            break;
                                        case 1:
                                            final StickerMakerView stickerMakerView5 = stickerMakerView3;
                                            stickerMakerView5.getClass();
                                            final TLObject tLObject3 = tLObject;
                                            boolean z5 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader6 = stickerUploader4;
                                            if (z5) {
                                                int i13 = i9;
                                                MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                DownloadButton.PreparingVideoToast preparingVideoToast2 = stickerMakerView5.loadingToast;
                                                if (preparingVideoToast2 != null) {
                                                    preparingVideoToast2.setProgress(1.0f);
                                                }
                                                final int i14 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject3;
                                                        StickerMakerView.StickerUploader stickerUploader7 = stickerUploader6;
                                                        StickerMakerView stickerMakerView6 = stickerMakerView5;
                                                        int i15 = i14;
                                                        stickerMakerView6.getClass();
                                                        switch (i15) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i16 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader7.mediaDocument.document;
                                                                String str = stickerUploader7.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i16, bool, tLObject5, document, str, bool);
                                                                stickerMakerView6.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader7.mediaDocument.document, stickerUploader7.thumbPath, Boolean.TRUE);
                                                                stickerMakerView6.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i17 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader7.mediaDocument.document;
                                                                String str2 = stickerUploader7.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i17, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView6.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z2 = true;
                                            } else {
                                                stickerMakerView5.showError(tL_error);
                                                stickerMakerView5.hideLoadingDialog();
                                                z2 = false;
                                            }
                                            Utilities.Callback callback2 = stickerUploader6.whenDone;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z2));
                                                stickerUploader6.whenDone = null;
                                            }
                                            break;
                                        default:
                                            final StickerMakerView stickerMakerView6 = stickerMakerView3;
                                            stickerMakerView6.getClass();
                                            final TLObject tLObject4 = tLObject;
                                            boolean z6 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader7 = stickerUploader4;
                                            if (z6) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i15 = i9;
                                                MediaDataController.getInstance(i15).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i15).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i15).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast3 = stickerMakerView6.loadingToast;
                                                if (preparingVideoToast3 != null) {
                                                    preparingVideoToast3.setProgress(1.0f);
                                                }
                                                final int i16 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject4;
                                                        StickerMakerView.StickerUploader stickerUploader8 = stickerUploader7;
                                                        StickerMakerView stickerMakerView7 = stickerMakerView6;
                                                        int i17 = i16;
                                                        stickerMakerView7.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                String str = stickerUploader8.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                String str2 = stickerUploader8.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z3 = true;
                                            } else {
                                                stickerMakerView6.showError(tL_error);
                                                stickerMakerView6.hideLoadingDialog();
                                                z3 = false;
                                            }
                                            Utilities.Callback callback3 = stickerUploader7.whenDone;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z3));
                                                stickerUploader7.whenDone = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (stickerUploader.stickerPackName != null) {
            TLRPC.TL_stickers_createStickerSet tL_stickers_createStickerSet = new TLRPC.TL_stickers_createStickerSet();
            tL_stickers_createStickerSet.user_id = new TLRPC.TL_inputUserSelf();
            tL_stickers_createStickerSet.title = stickerUploader.stickerPackName.toString();
            tL_stickers_createStickerSet.short_name = "";
            tL_stickers_createStickerSet.stickers.add(stickerUploader.tlInputStickerSetItem);
            ConnectionsManager.getInstance(i4).sendRequest(tL_stickers_createStickerSet, new RequestDelegate(this) {
                public final StickerMakerView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i3) {
                        case 0:
                            final StickerMakerView stickerMakerView = this.f$0;
                            stickerMakerView.getClass();
                            final int i5 = i4;
                            final StickerMakerView.StickerUploader stickerUploader2 = stickerUploader;
                            final int i6 = 0;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z;
                                    boolean z2;
                                    boolean z3;
                                    switch (i6) {
                                        case 0:
                                            final StickerMakerView stickerMakerView4 = stickerMakerView;
                                            stickerMakerView4.getClass();
                                            final TLObject tLObject2 = tLObject;
                                            boolean z4 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader5 = stickerUploader2;
                                            if (z4) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i11 = i5;
                                                MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i11).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast = stickerMakerView4.loadingToast;
                                                if (preparingVideoToast != null) {
                                                    preparingVideoToast.setProgress(1.0f);
                                                }
                                                final int i12 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject2;
                                                        StickerMakerView.StickerUploader stickerUploader8 = stickerUploader5;
                                                        StickerMakerView stickerMakerView7 = stickerMakerView4;
                                                        int i17 = i12;
                                                        stickerMakerView7.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                String str = stickerUploader8.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                String str2 = stickerUploader8.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z = true;
                                            } else {
                                                stickerMakerView4.showError(tL_error);
                                                stickerMakerView4.hideLoadingDialog();
                                                z = false;
                                            }
                                            Utilities.Callback callback = stickerUploader5.whenDone;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z));
                                                stickerUploader5.whenDone = null;
                                            }
                                            break;
                                        case 1:
                                            final StickerMakerView stickerMakerView5 = stickerMakerView;
                                            stickerMakerView5.getClass();
                                            final TLObject tLObject3 = tLObject;
                                            boolean z5 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader6 = stickerUploader2;
                                            if (z5) {
                                                int i13 = i5;
                                                MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                DownloadButton.PreparingVideoToast preparingVideoToast2 = stickerMakerView5.loadingToast;
                                                if (preparingVideoToast2 != null) {
                                                    preparingVideoToast2.setProgress(1.0f);
                                                }
                                                final int i14 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject3;
                                                        StickerMakerView.StickerUploader stickerUploader8 = stickerUploader6;
                                                        StickerMakerView stickerMakerView7 = stickerMakerView5;
                                                        int i17 = i14;
                                                        stickerMakerView7.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                String str = stickerUploader8.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                String str2 = stickerUploader8.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z2 = true;
                                            } else {
                                                stickerMakerView5.showError(tL_error);
                                                stickerMakerView5.hideLoadingDialog();
                                                z2 = false;
                                            }
                                            Utilities.Callback callback2 = stickerUploader6.whenDone;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z2));
                                                stickerUploader6.whenDone = null;
                                            }
                                            break;
                                        default:
                                            final StickerMakerView stickerMakerView6 = stickerMakerView;
                                            stickerMakerView6.getClass();
                                            final TLObject tLObject4 = tLObject;
                                            boolean z6 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader7 = stickerUploader2;
                                            if (z6) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i15 = i5;
                                                MediaDataController.getInstance(i15).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i15).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i15).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast3 = stickerMakerView6.loadingToast;
                                                if (preparingVideoToast3 != null) {
                                                    preparingVideoToast3.setProgress(1.0f);
                                                }
                                                final int i16 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject4;
                                                        StickerMakerView.StickerUploader stickerUploader8 = stickerUploader7;
                                                        StickerMakerView stickerMakerView7 = stickerMakerView6;
                                                        int i17 = i16;
                                                        stickerMakerView7.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                String str = stickerUploader8.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                String str2 = stickerUploader8.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z3 = true;
                                            } else {
                                                stickerMakerView6.showError(tL_error);
                                                stickerMakerView6.hideLoadingDialog();
                                                z3 = false;
                                            }
                                            Utilities.Callback callback3 = stickerUploader7.whenDone;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z3));
                                                stickerUploader7.whenDone = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        case 1:
                            final StickerMakerView stickerMakerView2 = this.f$0;
                            stickerMakerView2.getClass();
                            final int i7 = i4;
                            final StickerMakerView.StickerUploader stickerUploader3 = stickerUploader;
                            final int i8 = 1;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z;
                                    boolean z2;
                                    boolean z3;
                                    switch (i8) {
                                        case 0:
                                            final StickerMakerView stickerMakerView4 = stickerMakerView2;
                                            stickerMakerView4.getClass();
                                            final TLObject tLObject2 = tLObject;
                                            boolean z4 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader5 = stickerUploader3;
                                            if (z4) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i11 = i7;
                                                MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i11).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast = stickerMakerView4.loadingToast;
                                                if (preparingVideoToast != null) {
                                                    preparingVideoToast.setProgress(1.0f);
                                                }
                                                final int i12 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject2;
                                                        StickerMakerView.StickerUploader stickerUploader8 = stickerUploader5;
                                                        StickerMakerView stickerMakerView7 = stickerMakerView4;
                                                        int i17 = i12;
                                                        stickerMakerView7.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                String str = stickerUploader8.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                String str2 = stickerUploader8.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z = true;
                                            } else {
                                                stickerMakerView4.showError(tL_error);
                                                stickerMakerView4.hideLoadingDialog();
                                                z = false;
                                            }
                                            Utilities.Callback callback = stickerUploader5.whenDone;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z));
                                                stickerUploader5.whenDone = null;
                                            }
                                            break;
                                        case 1:
                                            final StickerMakerView stickerMakerView5 = stickerMakerView2;
                                            stickerMakerView5.getClass();
                                            final TLObject tLObject3 = tLObject;
                                            boolean z5 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader6 = stickerUploader3;
                                            if (z5) {
                                                int i13 = i7;
                                                MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                DownloadButton.PreparingVideoToast preparingVideoToast2 = stickerMakerView5.loadingToast;
                                                if (preparingVideoToast2 != null) {
                                                    preparingVideoToast2.setProgress(1.0f);
                                                }
                                                final int i14 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject3;
                                                        StickerMakerView.StickerUploader stickerUploader8 = stickerUploader6;
                                                        StickerMakerView stickerMakerView7 = stickerMakerView5;
                                                        int i17 = i14;
                                                        stickerMakerView7.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                String str = stickerUploader8.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                String str2 = stickerUploader8.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z2 = true;
                                            } else {
                                                stickerMakerView5.showError(tL_error);
                                                stickerMakerView5.hideLoadingDialog();
                                                z2 = false;
                                            }
                                            Utilities.Callback callback2 = stickerUploader6.whenDone;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z2));
                                                stickerUploader6.whenDone = null;
                                            }
                                            break;
                                        default:
                                            final StickerMakerView stickerMakerView6 = stickerMakerView2;
                                            stickerMakerView6.getClass();
                                            final TLObject tLObject4 = tLObject;
                                            boolean z6 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader7 = stickerUploader3;
                                            if (z6) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i15 = i7;
                                                MediaDataController.getInstance(i15).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i15).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i15).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast3 = stickerMakerView6.loadingToast;
                                                if (preparingVideoToast3 != null) {
                                                    preparingVideoToast3.setProgress(1.0f);
                                                }
                                                final int i16 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject4;
                                                        StickerMakerView.StickerUploader stickerUploader8 = stickerUploader7;
                                                        StickerMakerView stickerMakerView7 = stickerMakerView6;
                                                        int i17 = i16;
                                                        stickerMakerView7.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                String str = stickerUploader8.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                String str2 = stickerUploader8.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z3 = true;
                                            } else {
                                                stickerMakerView6.showError(tL_error);
                                                stickerMakerView6.hideLoadingDialog();
                                                z3 = false;
                                            }
                                            Utilities.Callback callback3 = stickerUploader7.whenDone;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z3));
                                                stickerUploader7.whenDone = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final StickerMakerView stickerMakerView3 = this.f$0;
                            stickerMakerView3.getClass();
                            final int i9 = i4;
                            final StickerMakerView.StickerUploader stickerUploader4 = stickerUploader;
                            final int i10 = 2;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    boolean z;
                                    boolean z2;
                                    boolean z3;
                                    switch (i10) {
                                        case 0:
                                            final StickerMakerView stickerMakerView4 = stickerMakerView3;
                                            stickerMakerView4.getClass();
                                            final TLObject tLObject2 = tLObject;
                                            boolean z4 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader5 = stickerUploader4;
                                            if (z4) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                int i11 = i9;
                                                MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet);
                                                if (!MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                    MediaDataController.getInstance(i11).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast = stickerMakerView4.loadingToast;
                                                if (preparingVideoToast != null) {
                                                    preparingVideoToast.setProgress(1.0f);
                                                }
                                                final int i12 = 1;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject2;
                                                        StickerMakerView.StickerUploader stickerUploader8 = stickerUploader5;
                                                        StickerMakerView stickerMakerView7 = stickerMakerView4;
                                                        int i17 = i12;
                                                        stickerMakerView7.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                String str = stickerUploader8.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                String str2 = stickerUploader8.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z = true;
                                            } else {
                                                stickerMakerView4.showError(tL_error);
                                                stickerMakerView4.hideLoadingDialog();
                                                z = false;
                                            }
                                            Utilities.Callback callback = stickerUploader5.whenDone;
                                            if (callback != null) {
                                                callback.run(Boolean.valueOf(z));
                                                stickerUploader5.whenDone = null;
                                            }
                                            break;
                                        case 1:
                                            final StickerMakerView stickerMakerView5 = stickerMakerView3;
                                            stickerMakerView5.getClass();
                                            final TLObject tLObject3 = tLObject;
                                            boolean z5 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader6 = stickerUploader4;
                                            if (z5) {
                                                int i13 = i9;
                                                MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                DownloadButton.PreparingVideoToast preparingVideoToast2 = stickerMakerView5.loadingToast;
                                                if (preparingVideoToast2 != null) {
                                                    preparingVideoToast2.setProgress(1.0f);
                                                }
                                                final int i14 = 0;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject3;
                                                        StickerMakerView.StickerUploader stickerUploader8 = stickerUploader6;
                                                        StickerMakerView stickerMakerView7 = stickerMakerView5;
                                                        int i17 = i14;
                                                        stickerMakerView7.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                String str = stickerUploader8.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                String str2 = stickerUploader8.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 250L);
                                                z2 = true;
                                            } else {
                                                stickerMakerView5.showError(tL_error);
                                                stickerMakerView5.hideLoadingDialog();
                                                z2 = false;
                                            }
                                            Utilities.Callback callback2 = stickerUploader6.whenDone;
                                            if (callback2 != null) {
                                                callback2.run(Boolean.valueOf(z2));
                                                stickerUploader6.whenDone = null;
                                            }
                                            break;
                                        default:
                                            final StickerMakerView stickerMakerView6 = stickerMakerView3;
                                            stickerMakerView6.getClass();
                                            final TLObject tLObject4 = tLObject;
                                            boolean z6 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                            final StickerMakerView.StickerUploader stickerUploader7 = stickerUploader4;
                                            if (z6) {
                                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                int i15 = i9;
                                                MediaDataController.getInstance(i15).putStickerSet(tL_messages_stickerSet2);
                                                if (!MediaDataController.getInstance(i15).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                    MediaDataController.getInstance(i15).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                }
                                                DownloadButton.PreparingVideoToast preparingVideoToast3 = stickerMakerView6.loadingToast;
                                                if (preparingVideoToast3 != null) {
                                                    preparingVideoToast3.setProgress(1.0f);
                                                }
                                                final int i16 = 2;
                                                AndroidUtilities.runOnUIThread(new Runnable() {
                                                    @Override
                                                    public final void run() {
                                                        TLObject tLObject5 = tLObject4;
                                                        StickerMakerView.StickerUploader stickerUploader8 = stickerUploader7;
                                                        StickerMakerView stickerMakerView7 = stickerMakerView6;
                                                        int i17 = i16;
                                                        stickerMakerView7.getClass();
                                                        switch (i17) {
                                                            case 0:
                                                                NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i18 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                String str = stickerUploader8.thumbPath;
                                                                Boolean bool = Boolean.FALSE;
                                                                notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            case 1:
                                                                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                            default:
                                                                NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                int i19 = NotificationCenter.customStickerCreated;
                                                                TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                String str2 = stickerUploader8.thumbPath;
                                                                Boolean bool2 = Boolean.FALSE;
                                                                notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                stickerMakerView7.hideLoadingDialog();
                                                                break;
                                                        }
                                                    }
                                                }, 450L);
                                                z3 = true;
                                            } else {
                                                stickerMakerView6.showError(tL_error);
                                                stickerMakerView6.hideLoadingDialog();
                                                z3 = false;
                                            }
                                            Utilities.Callback callback3 = stickerUploader7.whenDone;
                                            if (callback3 != null) {
                                                callback3.run(Boolean.valueOf(z3));
                                                stickerUploader7.whenDone = null;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (stickerUploader.addToFavorite) {
            hideLoadingDialog();
            NotificationCenter.getInstance(i4).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
            AndroidUtilities.runOnUIThread(new ChatbotSheet$$ExternalSyntheticLambda0(stickerUploader, 24), 350L);
            Utilities.Callback callback = stickerUploader.whenDone;
            if (callback != null) {
                callback.run(Boolean.TRUE);
                return;
            }
            return;
        }
        if (stickerUploader.sendToDialogId == 0) {
            if (stickerUploader.stickerSet != null) {
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = new TLRPC.TL_stickers_addStickerToSet();
                tL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(stickerUploader.stickerSet);
                tL_stickers_addStickerToSet.sticker = stickerUploader.tlInputStickerSetItem;
                final int i5 = 2;
                ConnectionsManager.getInstance(i4).sendRequest(tL_stickers_addStickerToSet, new RequestDelegate(this) {
                    public final StickerMakerView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i5) {
                            case 0:
                                final StickerMakerView stickerMakerView = this.f$0;
                                stickerMakerView.getClass();
                                final int i6 = i4;
                                final StickerMakerView.StickerUploader stickerUploader2 = stickerUploader;
                                final int i7 = 0;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z;
                                        boolean z2;
                                        boolean z3;
                                        switch (i7) {
                                            case 0:
                                                final StickerMakerView stickerMakerView4 = stickerMakerView;
                                                stickerMakerView4.getClass();
                                                final TLObject tLObject2 = tLObject;
                                                boolean z4 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final StickerMakerView.StickerUploader stickerUploader5 = stickerUploader2;
                                                if (z4) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i11 = i6;
                                                    MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i11).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    DownloadButton.PreparingVideoToast preparingVideoToast = stickerMakerView4.loadingToast;
                                                    if (preparingVideoToast != null) {
                                                        preparingVideoToast.setProgress(1.0f);
                                                    }
                                                    final int i12 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TLObject tLObject5 = tLObject2;
                                                            StickerMakerView.StickerUploader stickerUploader8 = stickerUploader5;
                                                            StickerMakerView stickerMakerView7 = stickerMakerView4;
                                                            int i17 = i12;
                                                            stickerMakerView7.getClass();
                                                            switch (i17) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i18 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                    String str = stickerUploader8.thumbPath;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i19 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                    String str2 = stickerUploader8.thumbPath;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    stickerMakerView4.showError(tL_error);
                                                    stickerMakerView4.hideLoadingDialog();
                                                    z = false;
                                                }
                                                Utilities.Callback callback2 = stickerUploader5.whenDone;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z));
                                                    stickerUploader5.whenDone = null;
                                                }
                                                break;
                                            case 1:
                                                final StickerMakerView stickerMakerView5 = stickerMakerView;
                                                stickerMakerView5.getClass();
                                                final TLObject tLObject3 = tLObject;
                                                boolean z5 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final StickerMakerView.StickerUploader stickerUploader6 = stickerUploader2;
                                                if (z5) {
                                                    int i13 = i6;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    DownloadButton.PreparingVideoToast preparingVideoToast2 = stickerMakerView5.loadingToast;
                                                    if (preparingVideoToast2 != null) {
                                                        preparingVideoToast2.setProgress(1.0f);
                                                    }
                                                    final int i14 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TLObject tLObject5 = tLObject3;
                                                            StickerMakerView.StickerUploader stickerUploader8 = stickerUploader6;
                                                            StickerMakerView stickerMakerView7 = stickerMakerView5;
                                                            int i17 = i14;
                                                            stickerMakerView7.getClass();
                                                            switch (i17) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i18 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                    String str = stickerUploader8.thumbPath;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i19 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                    String str2 = stickerUploader8.thumbPath;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z2 = true;
                                                } else {
                                                    stickerMakerView5.showError(tL_error);
                                                    stickerMakerView5.hideLoadingDialog();
                                                    z2 = false;
                                                }
                                                Utilities.Callback callback3 = stickerUploader6.whenDone;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z2));
                                                    stickerUploader6.whenDone = null;
                                                }
                                                break;
                                            default:
                                                final StickerMakerView stickerMakerView6 = stickerMakerView;
                                                stickerMakerView6.getClass();
                                                final TLObject tLObject4 = tLObject;
                                                boolean z6 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final StickerMakerView.StickerUploader stickerUploader7 = stickerUploader2;
                                                if (z6) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i15 = i6;
                                                    MediaDataController.getInstance(i15).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i15).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i15).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    DownloadButton.PreparingVideoToast preparingVideoToast3 = stickerMakerView6.loadingToast;
                                                    if (preparingVideoToast3 != null) {
                                                        preparingVideoToast3.setProgress(1.0f);
                                                    }
                                                    final int i16 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TLObject tLObject5 = tLObject4;
                                                            StickerMakerView.StickerUploader stickerUploader8 = stickerUploader7;
                                                            StickerMakerView stickerMakerView7 = stickerMakerView6;
                                                            int i17 = i16;
                                                            stickerMakerView7.getClass();
                                                            switch (i17) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i18 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                    String str = stickerUploader8.thumbPath;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i19 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                    String str2 = stickerUploader8.thumbPath;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z3 = true;
                                                } else {
                                                    stickerMakerView6.showError(tL_error);
                                                    stickerMakerView6.hideLoadingDialog();
                                                    z3 = false;
                                                }
                                                Utilities.Callback callback4 = stickerUploader7.whenDone;
                                                if (callback4 != null) {
                                                    callback4.run(Boolean.valueOf(z3));
                                                    stickerUploader7.whenDone = null;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            case 1:
                                final StickerMakerView stickerMakerView2 = this.f$0;
                                stickerMakerView2.getClass();
                                final int i8 = i4;
                                final StickerMakerView.StickerUploader stickerUploader3 = stickerUploader;
                                final int i9 = 1;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z;
                                        boolean z2;
                                        boolean z3;
                                        switch (i9) {
                                            case 0:
                                                final StickerMakerView stickerMakerView4 = stickerMakerView2;
                                                stickerMakerView4.getClass();
                                                final TLObject tLObject2 = tLObject;
                                                boolean z4 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final StickerMakerView.StickerUploader stickerUploader5 = stickerUploader3;
                                                if (z4) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i11 = i8;
                                                    MediaDataController.getInstance(i11).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i11).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i11).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    DownloadButton.PreparingVideoToast preparingVideoToast = stickerMakerView4.loadingToast;
                                                    if (preparingVideoToast != null) {
                                                        preparingVideoToast.setProgress(1.0f);
                                                    }
                                                    final int i12 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TLObject tLObject5 = tLObject2;
                                                            StickerMakerView.StickerUploader stickerUploader8 = stickerUploader5;
                                                            StickerMakerView stickerMakerView7 = stickerMakerView4;
                                                            int i17 = i12;
                                                            stickerMakerView7.getClass();
                                                            switch (i17) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i18 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                    String str = stickerUploader8.thumbPath;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i19 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                    String str2 = stickerUploader8.thumbPath;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    stickerMakerView4.showError(tL_error);
                                                    stickerMakerView4.hideLoadingDialog();
                                                    z = false;
                                                }
                                                Utilities.Callback callback2 = stickerUploader5.whenDone;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z));
                                                    stickerUploader5.whenDone = null;
                                                }
                                                break;
                                            case 1:
                                                final StickerMakerView stickerMakerView5 = stickerMakerView2;
                                                stickerMakerView5.getClass();
                                                final TLObject tLObject3 = tLObject;
                                                boolean z5 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final StickerMakerView.StickerUploader stickerUploader6 = stickerUploader3;
                                                if (z5) {
                                                    int i13 = i8;
                                                    MediaDataController.getInstance(i13).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i13).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    DownloadButton.PreparingVideoToast preparingVideoToast2 = stickerMakerView5.loadingToast;
                                                    if (preparingVideoToast2 != null) {
                                                        preparingVideoToast2.setProgress(1.0f);
                                                    }
                                                    final int i14 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TLObject tLObject5 = tLObject3;
                                                            StickerMakerView.StickerUploader stickerUploader8 = stickerUploader6;
                                                            StickerMakerView stickerMakerView7 = stickerMakerView5;
                                                            int i17 = i14;
                                                            stickerMakerView7.getClass();
                                                            switch (i17) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i18 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                    String str = stickerUploader8.thumbPath;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i19 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                    String str2 = stickerUploader8.thumbPath;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z2 = true;
                                                } else {
                                                    stickerMakerView5.showError(tL_error);
                                                    stickerMakerView5.hideLoadingDialog();
                                                    z2 = false;
                                                }
                                                Utilities.Callback callback3 = stickerUploader6.whenDone;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z2));
                                                    stickerUploader6.whenDone = null;
                                                }
                                                break;
                                            default:
                                                final StickerMakerView stickerMakerView6 = stickerMakerView2;
                                                stickerMakerView6.getClass();
                                                final TLObject tLObject4 = tLObject;
                                                boolean z6 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final StickerMakerView.StickerUploader stickerUploader7 = stickerUploader3;
                                                if (z6) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i15 = i8;
                                                    MediaDataController.getInstance(i15).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i15).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i15).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    DownloadButton.PreparingVideoToast preparingVideoToast3 = stickerMakerView6.loadingToast;
                                                    if (preparingVideoToast3 != null) {
                                                        preparingVideoToast3.setProgress(1.0f);
                                                    }
                                                    final int i16 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TLObject tLObject5 = tLObject4;
                                                            StickerMakerView.StickerUploader stickerUploader8 = stickerUploader7;
                                                            StickerMakerView stickerMakerView7 = stickerMakerView6;
                                                            int i17 = i16;
                                                            stickerMakerView7.getClass();
                                                            switch (i17) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i18 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                    String str = stickerUploader8.thumbPath;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i19 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                    String str2 = stickerUploader8.thumbPath;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z3 = true;
                                                } else {
                                                    stickerMakerView6.showError(tL_error);
                                                    stickerMakerView6.hideLoadingDialog();
                                                    z3 = false;
                                                }
                                                Utilities.Callback callback4 = stickerUploader7.whenDone;
                                                if (callback4 != null) {
                                                    callback4.run(Boolean.valueOf(z3));
                                                    stickerUploader7.whenDone = null;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final StickerMakerView stickerMakerView3 = this.f$0;
                                stickerMakerView3.getClass();
                                final int i10 = i4;
                                final StickerMakerView.StickerUploader stickerUploader4 = stickerUploader;
                                final int i11 = 2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        boolean z;
                                        boolean z2;
                                        boolean z3;
                                        switch (i11) {
                                            case 0:
                                                final StickerMakerView stickerMakerView4 = stickerMakerView3;
                                                stickerMakerView4.getClass();
                                                final TLObject tLObject2 = tLObject;
                                                boolean z4 = tLObject2 instanceof TLRPC.TL_messages_stickerSet;
                                                final StickerMakerView.StickerUploader stickerUploader5 = stickerUploader4;
                                                if (z4) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject2;
                                                    int i12 = i10;
                                                    MediaDataController.getInstance(i12).putStickerSet(tL_messages_stickerSet);
                                                    if (!MediaDataController.getInstance(i12).isStickerPackInstalled(tL_messages_stickerSet.set.id)) {
                                                        MediaDataController.getInstance(i12).toggleStickerSet(null, tLObject2, 2, null, false, false);
                                                    }
                                                    DownloadButton.PreparingVideoToast preparingVideoToast = stickerMakerView4.loadingToast;
                                                    if (preparingVideoToast != null) {
                                                        preparingVideoToast.setProgress(1.0f);
                                                    }
                                                    final int i13 = 1;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TLObject tLObject5 = tLObject2;
                                                            StickerMakerView.StickerUploader stickerUploader8 = stickerUploader5;
                                                            StickerMakerView stickerMakerView7 = stickerMakerView4;
                                                            int i17 = i13;
                                                            stickerMakerView7.getClass();
                                                            switch (i17) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i18 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                    String str = stickerUploader8.thumbPath;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i19 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                    String str2 = stickerUploader8.thumbPath;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z = true;
                                                } else {
                                                    stickerMakerView4.showError(tL_error);
                                                    stickerMakerView4.hideLoadingDialog();
                                                    z = false;
                                                }
                                                Utilities.Callback callback2 = stickerUploader5.whenDone;
                                                if (callback2 != null) {
                                                    callback2.run(Boolean.valueOf(z));
                                                    stickerUploader5.whenDone = null;
                                                }
                                                break;
                                            case 1:
                                                final StickerMakerView stickerMakerView5 = stickerMakerView3;
                                                stickerMakerView5.getClass();
                                                final TLObject tLObject3 = tLObject;
                                                boolean z5 = tLObject3 instanceof TLRPC.TL_messages_stickerSet;
                                                final StickerMakerView.StickerUploader stickerUploader6 = stickerUploader4;
                                                if (z5) {
                                                    int i14 = i10;
                                                    MediaDataController.getInstance(i14).putStickerSet((TLRPC.TL_messages_stickerSet) tLObject3);
                                                    MediaDataController.getInstance(i14).toggleStickerSet(null, tLObject3, 2, null, false, false);
                                                    DownloadButton.PreparingVideoToast preparingVideoToast2 = stickerMakerView5.loadingToast;
                                                    if (preparingVideoToast2 != null) {
                                                        preparingVideoToast2.setProgress(1.0f);
                                                    }
                                                    final int i15 = 0;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TLObject tLObject5 = tLObject3;
                                                            StickerMakerView.StickerUploader stickerUploader8 = stickerUploader6;
                                                            StickerMakerView stickerMakerView7 = stickerMakerView5;
                                                            int i17 = i15;
                                                            stickerMakerView7.getClass();
                                                            switch (i17) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i18 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                    String str = stickerUploader8.thumbPath;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i18, bool, tLObject5, document, str, bool);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i19 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                    String str2 = stickerUploader8.thumbPath;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i19, bool2, tLObject5, document2, str2, bool2);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                            }
                                                        }
                                                    }, 250L);
                                                    z2 = true;
                                                } else {
                                                    stickerMakerView5.showError(tL_error);
                                                    stickerMakerView5.hideLoadingDialog();
                                                    z2 = false;
                                                }
                                                Utilities.Callback callback3 = stickerUploader6.whenDone;
                                                if (callback3 != null) {
                                                    callback3.run(Boolean.valueOf(z2));
                                                    stickerUploader6.whenDone = null;
                                                }
                                                break;
                                            default:
                                                final StickerMakerView stickerMakerView6 = stickerMakerView3;
                                                stickerMakerView6.getClass();
                                                final TLObject tLObject4 = tLObject;
                                                boolean z6 = tLObject4 instanceof TLRPC.TL_messages_stickerSet;
                                                final StickerMakerView.StickerUploader stickerUploader7 = stickerUploader4;
                                                if (z6) {
                                                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) tLObject4;
                                                    int i16 = i10;
                                                    MediaDataController.getInstance(i16).putStickerSet(tL_messages_stickerSet2);
                                                    if (!MediaDataController.getInstance(i16).isStickerPackInstalled(tL_messages_stickerSet2.set.id)) {
                                                        MediaDataController.getInstance(i16).toggleStickerSet(null, tLObject4, 2, null, false, false);
                                                    }
                                                    DownloadButton.PreparingVideoToast preparingVideoToast3 = stickerMakerView6.loadingToast;
                                                    if (preparingVideoToast3 != null) {
                                                        preparingVideoToast3.setProgress(1.0f);
                                                    }
                                                    final int i17 = 2;
                                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                                        @Override
                                                        public final void run() {
                                                            TLObject tLObject5 = tLObject4;
                                                            StickerMakerView.StickerUploader stickerUploader8 = stickerUploader7;
                                                            StickerMakerView stickerMakerView7 = stickerMakerView6;
                                                            int i18 = i17;
                                                            stickerMakerView7.getClass();
                                                            switch (i18) {
                                                                case 0:
                                                                    NotificationCenter notificationCenter = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i19 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document = stickerUploader8.mediaDocument.document;
                                                                    String str = stickerUploader8.thumbPath;
                                                                    Boolean bool = Boolean.FALSE;
                                                                    notificationCenter.postNotificationNameOnUIThread(i19, bool, tLObject5, document, str, bool);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                case 1:
                                                                    NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject5, stickerUploader8.mediaDocument.document, stickerUploader8.thumbPath, Boolean.TRUE);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                                default:
                                                                    NotificationCenter notificationCenter2 = NotificationCenter.getInstance(UserConfig.selectedAccount);
                                                                    int i110 = NotificationCenter.customStickerCreated;
                                                                    TLRPC.Document document2 = stickerUploader8.mediaDocument.document;
                                                                    String str2 = stickerUploader8.thumbPath;
                                                                    Boolean bool2 = Boolean.FALSE;
                                                                    notificationCenter2.postNotificationNameOnUIThread(i110, bool2, tLObject5, document2, str2, bool2);
                                                                    stickerMakerView7.hideLoadingDialog();
                                                                    break;
                                                            }
                                                        }
                                                    }, 450L);
                                                    z3 = true;
                                                } else {
                                                    stickerMakerView6.showError(tL_error);
                                                    stickerMakerView6.hideLoadingDialog();
                                                    z3 = false;
                                                }
                                                Utilities.Callback callback4 = stickerUploader7.whenDone;
                                                if (callback4 != null) {
                                                    callback4.run(Boolean.valueOf(z3));
                                                    stickerUploader7.whenDone = null;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        SendMessagesHelper.getInstance(i4).sendSticker(stickerUploader.mediaDocument.document, null, stickerUploader.sendToDialogId, null, null, null, null, null, true, 0, 0, false, null, null, 0L, 0L, null);
        DownloadButton.PreparingVideoToast preparingVideoToast = this.loadingToast;
        if (preparingVideoToast != null) {
            preparingVideoToast.setProgress(1.0f);
        }
        AndroidUtilities.runOnUIThread(new Theme$$ExternalSyntheticLambda19(this, i4, i2), 450L);
        Utilities.Callback callback2 = stickerUploader.whenDone;
        if (callback2 != null) {
            callback2.run(Boolean.TRUE);
            stickerUploader.whenDone = null;
        }
    }

    public final void clean() {
        ValueAnimator valueAnimator = this.bordersAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.bordersAnimator = null;
        }
        this.sourceBitmap = null;
        if (this.objects != null) {
            int i = 0;
            while (true) {
                SegmentedObject[] segmentedObjectArr = this.objects;
                if (i >= segmentedObjectArr.length) {
                    break;
                }
                SegmentedObject segmentedObject = segmentedObjectArr[i];
                if (segmentedObject != null) {
                    segmentedObject.segmentBorderPath.reset();
                    Bitmap bitmap = segmentedObject.overrideImage;
                    if (bitmap != null) {
                        bitmap.recycle();
                        segmentedObject.overrideImage = null;
                    }
                    Bitmap bitmap2 = segmentedObject.image;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        segmentedObject.image = null;
                    }
                    Bitmap bitmap3 = segmentedObject.overrideDarkMaskImage;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                        segmentedObject.overrideDarkMaskImage = null;
                    }
                    Bitmap bitmap4 = segmentedObject.darkMaskImage;
                    if (bitmap4 != null) {
                        bitmap4.recycle();
                        segmentedObject.darkMaskImage = null;
                    }
                }
                i++;
            }
            this.objects = null;
        }
        this.segmentingLoaded = false;
        this.segmentingLoading = false;
        this.isSegmentedState = false;
        this.actionTextView.setAlpha(0.0f);
        this.actionTextView.setScaleX(0.3f);
        this.actionTextView.setScaleY(0.3f);
        StickerUploader stickerUploader = this.stickerUploader;
        if (stickerUploader != null) {
            if (!stickerUploader.uploaded) {
                stickerUploader.destroy();
            }
            this.stickerUploader = null;
        }
        hideLoadingDialog();
        this.isThanosInProgress = false;
    }

    public final Bitmap createSmoothEdgesSegmentedImage(Bitmap bitmap, int i, int i2, boolean z) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap == null || bitmap.isRecycled() || sourceBitmap == null) {
            return null;
        }
        Paint paint = new Paint(3);
        int width = sourceBitmap.getWidth();
        int height = sourceBitmap.getHeight();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (z) {
            canvas.scale(bitmapCreateBitmap.getWidth() / bitmap.getWidth(), bitmapCreateBitmap.getHeight() / bitmap.getHeight());
            canvas.drawBitmap(bitmap, i, i2, paint);
        } else {
            canvas.drawBitmap(bitmap, i, i2, paint);
        }
        Utilities.stackBlurBitmap(bitmapCreateBitmap, 5);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), config);
        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
        canvas2.drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
        Paint paint2 = new Paint(3);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas2.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, paint2);
        bitmapCreateBitmap.recycle();
        return bitmapCreateBitmap2;
    }

    public final Bitmap cutSegmentInFilteredBitmap(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        SegmentedObject segmentedObject = this.selectedObject;
        if (segmentedObject != null) {
            this.filteredBitmap = bitmap;
            if (segmentedObject.darkMaskImage != null && this.isSegmentedState) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Paint paint = new Paint(3);
                Paint paint2 = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                Rect rect = new Rect();
                rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                SegmentedObject segmentedObject2 = this.selectedObject;
                if (segmentedObject2.orientation == 0) {
                    Bitmap bitmap2 = segmentedObject2.overrideDarkMaskImage;
                    if (bitmap2 == null) {
                        bitmap2 = segmentedObject2.darkMaskImage;
                    }
                    canvas.drawBitmap(bitmap2, (Rect) null, rect, paint);
                    return bitmapCreateBitmap;
                }
                Matrix matrix = new Matrix();
                SegmentedObject segmentedObject3 = this.selectedObject;
                float f = segmentedObject3.orientation;
                Bitmap bitmap3 = segmentedObject3.overrideDarkMaskImage;
                if (bitmap3 == null) {
                    bitmap3 = segmentedObject3.darkMaskImage;
                }
                float width = bitmap3.getWidth() / 2.0f;
                SegmentedObject segmentedObject4 = this.selectedObject;
                Bitmap bitmap4 = segmentedObject4.overrideDarkMaskImage;
                if (bitmap4 == null) {
                    bitmap4 = segmentedObject4.darkMaskImage;
                }
                matrix.postRotate(f, width, bitmap4.getHeight() / 2.0f);
                SegmentedObject segmentedObject5 = this.selectedObject;
                if ((segmentedObject5.orientation / 90) % 2 != 0) {
                    Bitmap bitmap5 = segmentedObject5.overrideImage;
                    if (bitmap5 == null) {
                        bitmap5 = segmentedObject5.image;
                    }
                    int height = bitmap5.getHeight();
                    SegmentedObject segmentedObject6 = this.selectedObject;
                    Bitmap bitmap6 = segmentedObject6.overrideImage;
                    if (bitmap6 == null) {
                        bitmap6 = segmentedObject6.image;
                    }
                    float width2 = (height - bitmap6.getWidth()) / 2.0f;
                    matrix.postTranslate(width2, -width2);
                }
                float width3 = bitmap.getWidth();
                SegmentedObject segmentedObject7 = this.selectedObject;
                Bitmap bitmap7 = segmentedObject7.overrideDarkMaskImage;
                if (bitmap7 == null) {
                    bitmap7 = segmentedObject7.darkMaskImage;
                }
                float height2 = width3 / bitmap7.getHeight();
                float height3 = bitmap.getHeight();
                SegmentedObject segmentedObject8 = this.selectedObject;
                Bitmap bitmap8 = segmentedObject8.overrideDarkMaskImage;
                if (bitmap8 == null) {
                    bitmap8 = segmentedObject8.darkMaskImage;
                }
                matrix.postScale(height2, height3 / bitmap8.getWidth());
                SegmentedObject segmentedObject9 = this.selectedObject;
                Bitmap bitmap9 = segmentedObject9.overrideDarkMaskImage;
                if (bitmap9 == null) {
                    bitmap9 = segmentedObject9.darkMaskImage;
                }
                canvas.drawBitmap(bitmap9, matrix, paint);
                return bitmapCreateBitmap;
            }
        }
        return bitmap;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        StickerUploader stickerUploader;
        float f;
        if (i == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC.InputFile inputFile = (TLRPC.InputFile) objArr[1];
            StickerUploader stickerUploader2 = this.stickerUploader;
            if (stickerUploader2 == null || !str.equalsIgnoreCase(stickerUploader2.finalPath)) {
                return;
            }
            StickerUploader stickerUploader3 = this.stickerUploader;
            stickerUploader3.file = inputFile;
            TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
            tL_messages_uploadMedia.peer = new TLRPC.TL_inputPeerSelf();
            TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
            tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
            tL_inputMediaUploadedDocument.file = stickerUploader3.file;
            if (stickerUploader3.videoEditedInfo != null) {
                tL_inputMediaUploadedDocument.mime_type = "video/webm";
            } else {
                tL_inputMediaUploadedDocument.mime_type = "image/webp";
            }
            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
            tL_documentAttributeSticker.alt = stickerUploader3.emoji;
            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
            tL_messages_uploadMedia.media.attributes.add(tL_documentAttributeSticker);
            ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_messages_uploadMedia, new StarGiftSheet$$ExternalSyntheticLambda0(13, this, stickerUploader3), 2);
            return;
        }
        if (i == NotificationCenter.fileUploadProgressChanged) {
            String str2 = (String) objArr[0];
            StickerUploader stickerUploader4 = this.stickerUploader;
            if (stickerUploader4 == null || !str2.equalsIgnoreCase(stickerUploader4.finalPath)) {
                return;
            }
            long jLongValue = ((Long) objArr[1]).longValue();
            long jLongValue2 = ((Long) objArr[2]).longValue();
            if (jLongValue2 > 0) {
                StickerUploader stickerUploader5 = this.stickerUploader;
                stickerUploader5.uploadProgress = Utilities.clamp(jLongValue / jLongValue2, 1.0f, stickerUploader5.uploadProgress);
                DownloadButton.PreparingVideoToast preparingVideoToast = this.loadingToast;
                if (preparingVideoToast != null) {
                    StickerUploader stickerUploader6 = this.stickerUploader;
                    f = stickerUploader6.customHandler != null ? 1.0f : 0.9f;
                    preparingVideoToast.setProgress(stickerUploader6.videoEditedInfo == null ? f * stickerUploader6.uploadProgress : AndroidUtilities$$ExternalSyntheticOutline0.m(stickerUploader6.uploadProgress, 0.5f, stickerUploader6.convertingProgress * 0.5f, f));
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.fileUploadFailed) {
            String str3 = (String) objArr[0];
            StickerUploader stickerUploader7 = this.stickerUploader;
            if (stickerUploader7 == null || !str3.equalsIgnoreCase(stickerUploader7.finalPath)) {
                return;
            }
            hideLoadingDialog();
            return;
        }
        if (i == NotificationCenter.filePreparingStarted) {
            StickerUploader stickerUploader8 = this.stickerUploader;
            if (stickerUploader8 != null && objArr[0] == stickerUploader8.messageObject) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.stickerUploader.finalPath, false, true, 67108864);
                return;
            }
            return;
        }
        if (i != NotificationCenter.fileNewChunkAvailable) {
            if (i == NotificationCenter.filePreparingFailed && (stickerUploader = this.stickerUploader) != null && objArr[0] == stickerUploader.messageObject) {
                hideLoadingDialog();
                return;
            }
            return;
        }
        StickerUploader stickerUploader9 = this.stickerUploader;
        if (stickerUploader9 != null && objArr[0] == stickerUploader9.messageObject) {
            String str4 = (String) objArr[1];
            long jLongValue3 = ((Long) objArr[2]).longValue();
            long jLongValue4 = ((Long) objArr[3]).longValue();
            Float f2 = (Float) objArr[4];
            float fFloatValue = f2.floatValue();
            this.stickerUploader.messageObject.videoEditedInfo.needUpdateProgress = true;
            FileLoader.getInstance(this.currentAccount).checkUploadNewDataAvailable(str4, false, Math.max(1L, jLongValue3), jLongValue4, f2);
            StickerUploader stickerUploader10 = this.stickerUploader;
            stickerUploader10.convertingProgress = Math.max(stickerUploader10.convertingProgress, fFloatValue);
            DownloadButton.PreparingVideoToast preparingVideoToast2 = this.loadingToast;
            if (preparingVideoToast2 != null) {
                StickerUploader stickerUploader11 = this.stickerUploader;
                f = stickerUploader11.customHandler != null ? 1.0f : 0.9f;
                preparingVideoToast2.setProgress(stickerUploader11.videoEditedInfo == null ? f * stickerUploader11.uploadProgress : AndroidUtilities$$ExternalSyntheticOutline0.m(stickerUploader11.uploadProgress, 0.5f, stickerUploader11.convertingProgress * 0.5f, f));
            }
        }
    }

    public final void disableClippingMode() {
        this.segmentBorderAlpha.set(0.0f);
        ValueAnimator valueAnimator = this.bordersAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.bordersAnimator = null;
        }
        setOnClickListener(null);
        setClickable(false);
        TextView textView = this.actionTextView;
        textView.animate().cancel();
        textView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.screenPath, this.bgPaint);
        canvas.drawPath(this.dashPath, this.dashPaint);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        this.tx = motionEvent.getX();
        float y = motionEvent.getY();
        this.ty = y;
        if (this.objects != null && this.bordersAnimator != null) {
            SegmentedObject segmentedObjectObjectBehind = objectBehind(this.tx, y);
            int i = 0;
            while (true) {
                SegmentedObject[] segmentedObjectArr = this.objects;
                if (i >= segmentedObjectArr.length) {
                    break;
                }
                if (segmentedObjectArr[i] == segmentedObjectObjectBehind && motionEvent.getAction() != 3) {
                    z = motionEvent.getAction() != 1;
                }
                if (z && !this.objects[i].hover) {
                    AndroidUtilities.vibrateCursor(this);
                }
                this.objects[i].hover = z;
                i++;
            }
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void drawOutline(Canvas canvas, boolean z, ViewGroup viewGroup, boolean z2) {
        this.outlineAlpha.setParent(viewGroup);
        if (this.outlineVisible || this.outlineAlpha.get() > 0.0f) {
            float f = viewGroup == null ? 1.0f : this.outlineAlpha.set(this.outlineVisible && !z2);
            SegmentedObject[] segmentedObjectArr = this.objects;
            if (segmentedObjectArr != null) {
                for (SegmentedObject segmentedObject : segmentedObjectArr) {
                    if (segmentedObject != null && segmentedObject == this.selectedObject) {
                        float f2 = this.outlineWidth;
                        if (f2 > 0.0f) {
                            if (StickerMakerView.this.outlineBoundsPath == null) {
                                return;
                            }
                            canvas.save();
                            canvas.clipPath(StickerMakerView.this.outlineBoundsPath);
                            if (StickerMakerView.this.sourceBitmap != null) {
                                Paint paint = z ? segmentedObject.bordersStrokePaint : segmentedObject.bordersFillPaint;
                                paint.setAlpha((int) (f * 255.0f));
                                paint.setStrokeWidth(AndroidUtilities.dp(f2));
                                canvas.drawPath(segmentedObject.segmentBorderPath, paint);
                                if (StickerMakerView.this.outlineBoundsPath != null && z) {
                                    canvas.clipPath(segmentedObject.segmentBorderPath);
                                    paint.setStrokeWidth(AndroidUtilities.dp(f2 * 2.0f));
                                    canvas.drawPath(StickerMakerView.this.outlineBoundsPath, paint);
                                }
                            }
                            canvas.restore();
                            return;
                        }
                    }
                }
            }
        }
    }

    public float getSegmentBorderImageHeight() {
        return this.segmentBorderImageHeight;
    }

    public float getSegmentBorderImageWidth() {
        return this.segmentBorderImageWidth;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        SegmentedObject segmentedObject;
        if (!this.isSegmentedState || (segmentedObject = this.selectedObject) == null) {
            return null;
        }
        Bitmap bitmap = segmentedObject.overrideDarkMaskImage;
        return bitmap != null ? bitmap : segmentedObject.darkMaskImage;
    }

    public Bitmap getSourceBitmap() {
        return this.sourceBitmap;
    }

    public ThanosEffect getThanosEffect() {
        if (!ThanosEffect.supports()) {
            return null;
        }
        if (this.thanosEffect == null) {
            ThanosEffect thanosEffect = new ThanosEffect(getContext(), new StickerMakerView$$ExternalSyntheticLambda6(this, 0));
            this.thanosEffect = thanosEffect;
            addView(thanosEffect, LayoutHelper.createFrame(-1, -1.0f));
        }
        return this.thanosEffect;
    }

    public final void hideLoadingDialog() {
        DownloadButton.PreparingVideoToast preparingVideoToast = this.loadingToast;
        if (preparingVideoToast != null) {
            preparingVideoToast.hide();
            this.loadingToast = null;
        }
    }

    public final boolean isSegmentedState() {
        return this.isSegmentedState;
    }

    public final SegmentedObject objectBehind(float f, float f2) {
        int width;
        int height;
        if (this.sourceBitmap == null) {
            return null;
        }
        int i = 0;
        while (true) {
            SegmentedObject[] segmentedObjectArr = this.objects;
            if (i >= segmentedObjectArr.length) {
                return null;
            }
            SegmentedObject segmentedObject = segmentedObjectArr[i];
            if (segmentedObject != null) {
                if ((segmentedObject.orientation / 90) % 2 != 0) {
                    width = this.sourceBitmap.getHeight();
                    height = this.sourceBitmap.getWidth();
                } else {
                    width = this.sourceBitmap.getWidth();
                    height = this.sourceBitmap.getHeight();
                }
                RectF rectF = AndroidUtilities.rectTmp;
                RectF rectF2 = this.objects[i].rotatedBounds;
                float f3 = width;
                float f4 = rectF2.left / f3;
                float f5 = this.imageReceiverWidth;
                float f6 = height;
                float f7 = rectF2.top / f6;
                float f8 = this.imageReceiverHeight;
                rectF.set(f4 * f5, f7 * f8, (rectF2.right / f3) * f5, (rectF2.bottom / f6) * f8);
                this.imageReceiverMatrix.mapRect(rectF);
                if (rectF.contains(f, f2)) {
                    return segmentedObject;
                }
            }
            i++;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadProgressChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.currentAccount;
        if (i >= 0) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float fDp = AndroidUtilities.dp(10.0f);
        float f = fDp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f;
        float measuredHeight = getMeasuredHeight() - f;
        float f2 = measuredWidth / 8.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f3 = measuredWidth + fDp;
        rectF.set(fDp, fDp, f3, f3);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        Path path = this.areaPath;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, f2, f2, direction);
        Path path2 = this.bgPath;
        path2.rewind();
        path2.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), direction);
        Path path3 = this.screenPath;
        path3.reset();
        path3.op(path2, path, Path.Op.DIFFERENCE);
        Path path4 = this.dashPath;
        path4.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        path4.addRoundRect(rectF, f2, f2, direction);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.actionTextView.setTranslationY(-((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f)));
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.exclusionRects;
            arrayList.clear();
            if (this.outlineVisible) {
                Rect rect = this.exclusionRect;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void resetPaths() {
        Bitmap bitmap;
        SegmentedObject[] segmentedObjectArr = this.objects;
        if (segmentedObjectArr != null) {
            for (SegmentedObject segmentedObject : segmentedObjectArr) {
                if (segmentedObject != null && (bitmap = segmentedObject.overrideImage) != null) {
                    bitmap.recycle();
                    segmentedObject.overrideImage = null;
                    Bitmap bitmap2 = segmentedObject.overrideDarkMaskImage;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        segmentedObject.overrideDarkMaskImage = null;
                    }
                    createSegmentImagePath(segmentedObject, this.containerWidth, this.containerHeight);
                }
            }
        }
    }

    public final void segmentImage(Bitmap bitmap, int i, int i2, int i3, PhotoViewer$$ExternalSyntheticLambda65 photoViewer$$ExternalSyntheticLambda65) {
        MultiFlavorDetectorCreator multiFlavorDetectorCreator;
        int i4 = i2 <= 0 ? AndroidUtilities.displaySize.x : i2;
        int i5 = i3 <= 0 ? AndroidUtilities.displaySize.y : i3;
        this.containerWidth = i4;
        this.containerHeight = i5;
        if (this.segmentingLoaded || this.segmentingLoading || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        this.sourceBitmap = bitmap;
        this.orientation = i;
        this.detectedEmoji = null;
        CommunityUtils$$ExternalSyntheticLambda2 communityUtils$$ExternalSyntheticLambda2 = new CommunityUtils$$ExternalSyntheticLambda2(this, i, photoViewer$$ExternalSyntheticLambda65, 1);
        this.segmentingLoading = true;
        Settings.FeatureFlagData featureFlagData = new Settings.FeatureFlagData();
        featureFlagData.collectAnrs = true;
        featureFlagData.collectBuildIds = true;
        zzd client = zzid.getClient(new SubjectSegmenterOptions(featureFlagData));
        if (EmuDetector.with(getContext()).detect()) {
            ArrayList arrayList = new ArrayList();
            Bitmap bitmap2 = this.sourceBitmap;
            SubjectMock subjectMock = new SubjectMock();
            int iMin = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.4f);
            subjectMock.height = iMin;
            subjectMock.width = iMin;
            subjectMock.bitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
            new Canvas(subjectMock.bitmap).drawRect(0.0f, 0.0f, subjectMock.width, subjectMock.height, Theme.DEBUG_RED);
            subjectMock.startX = (bitmap2.getWidth() - subjectMock.width) / 2;
            subjectMock.startY = (bitmap2.getHeight() - subjectMock.height) / 2;
            arrayList.add(subjectMock);
            communityUtils$$ExternalSyntheticLambda2.run(arrayList);
            return;
        }
        InputImage inputImageFromBitmap = InputImage.fromBitmap(i, bitmap);
        client.processBase(inputImageFromBitmap).addOnSuccessListener(new WindowVisibilityManager$$ExternalSyntheticLambda0(communityUtils$$ExternalSyntheticLambda2, 28)).addOnFailureListener(new AlertsCreator$$ExternalSyntheticLambda37(this, bitmap, i, photoViewer$$ExternalSyntheticLambda65, communityUtils$$ExternalSyntheticLambda2));
        if (this.detectedEmoji == null) {
            ImageLabelerOptions imageLabelerOptions = ImageLabelerOptions.DEFAULT_OPTIONS;
            zzah.checkNotNull(imageLabelerOptions, "options cannot be null");
            synchronized (MultiFlavorDetectorCreator.class) {
                multiFlavorDetectorCreator = (MultiFlavorDetectorCreator) MlKitContext.getInstance().get(MultiFlavorDetectorCreator.class);
            }
            Provider provider = (Provider) multiFlavorDetectorCreator.zza.get(ImageLabelerOptions.class);
            zzah.checkNotNull(provider);
            com.google.mlkit.vision.label.defaults.thin.zzd zzdVar = (com.google.mlkit.vision.label.defaults.thin.zzd) provider.get();
            zzdVar.getClass();
            GmsRpc gmsRpc = new GmsRpc();
            gmsRpc.rpc = zzkd.TYPE_THIN;
            Splitter splitter = new Splitter(gmsRpc, 1);
            zzkf zzkfVar = zzkf.ON_DEVICE_IMAGE_LABEL_CREATE;
            zznp zznpVar = zzdVar.zzc;
            zzh.zza.execute(new zzba(4, zznpVar, splitter, zzkfVar, zznpVar.zzj()));
            new ImageLabelerImpl((MLTask) zzdVar.zza.get(imageLabelerOptions), (Executor) zzdVar.zzb.zza.get(), new Feature("vision.ica", 1L)).processBase(inputImageFromBitmap).addOnSuccessListener(new WindowVisibilityManager$$ExternalSyntheticLambda0(this, 29)).addOnFailureListener(new FirebaseMessaging$AutoInit$$ExternalSyntheticLambda0(25));
        }
        List<TLRPC.TL_availableReaction> enabledReactionsList = MediaDataController.getInstance(this.currentAccount).getEnabledReactionsList();
        for (int i6 = 0; i6 < Math.min(enabledReactionsList.size(), 9); i6++) {
            Emoji.getEmojiDrawable(enabledReactionsList.get(i6).reaction);
        }
    }

    public void setCurrentAccount(int i) {
        int i2 = this.currentAccount;
        if (i2 != i) {
            if (i2 >= 0 && isAttachedToWindow()) {
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadProgressChanged);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.currentAccount = i;
            if (i < 0 || !isAttachedToWindow()) {
                return;
            }
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadProgressChanged);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    public void setOutlineVisible(boolean z) {
        if (this.outlineVisible == z) {
            return;
        }
        this.outlineVisible = z;
        this.weightChooserView.animate().alpha(z ? 1.0f : 0.0f).translationX(z ? 0.0f : AndroidUtilities.dp(-18.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).start();
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.exclusionRects;
            arrayList.clear();
            if (this.outlineVisible) {
                Rect rect = this.exclusionRect;
                arrayList.add(rect);
                int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
                rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            }
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public void setOutlineWidth(float f) {
        this.outlineWidth = f;
        if (getParent() instanceof View) {
            ((View) getParent()).invalidate();
        }
    }

    public void setStickerCutOutBtn(StickerCutOutBtn stickerCutOutBtn) {
        this.stickerCutOutBtn = stickerCutOutBtn;
    }

    public final void showError(TLRPC.TL_error tL_error) {
        if (tL_error == null || "PACK_TITLE_INVALID".equals(tL_error.text)) {
            return;
        }
        BulletinFactory.of((FrameLayout) getParent(), this.resourcesProvider).createErrorBulletin(tL_error.text).show();
    }

    public final void updateOutlineBounds() {
        Path path = this.outlineBoundsPath;
        if (path == null) {
            this.outlineBoundsPath = new Path();
        } else {
            path.rewind();
        }
        if (this.outlineBoundsInnerPath == null) {
            this.outlineBoundsInnerPath = new Path();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, 1.0f, 1.0f);
            this.outlineBoundsInnerPath.addRoundRect(rectF, rectF.width() * 0.12f, rectF.height() * 0.12f, Path.Direction.CW);
        }
        this.outlineBoundsPath.addPath(this.outlineBoundsInnerPath, this.outlineMatrix);
        this.outlineBoundsPath.computeBounds(this.outlineBounds, true);
    }

    public final void uploadStickerFile(final Utilities.Callback callback, final String str, final String str2, final CharSequence charSequence, final boolean z, final long j, final TLRPC.StickerSet stickerSet, final TLRPC.Document document, final TLRPC.Document document2, final VideoEditedInfo videoEditedInfo, final String str3, final Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickerMakerView.StickerUploader stickerUploader;
                StickerMakerView stickerMakerView = this.f$0;
                Utilities.Callback callback3 = callback;
                boolean z2 = callback3 == null || (stickerUploader = stickerMakerView.stickerUploader) == null || !stickerUploader.uploaded;
                if (z2) {
                    StickerMakerView.StickerUploader stickerUploader2 = stickerMakerView.stickerUploader;
                    if (stickerUploader2 != null) {
                        stickerUploader2.destroy();
                    }
                    stickerMakerView.stickerUploader = new StickerMakerView.StickerUploader();
                }
                StickerMakerView.StickerUploader stickerUploader3 = stickerMakerView.stickerUploader;
                stickerUploader3.emoji = str2;
                String str4 = str;
                stickerUploader3.finalPath = str4;
                stickerUploader3.path = str4;
                stickerUploader3.stickerPackName = charSequence;
                stickerUploader3.addToFavorite = z;
                stickerUploader3.sendToDialogId = j;
                stickerUploader3.stickerSet = stickerSet;
                stickerUploader3.replacedSticker = document;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                stickerUploader3.videoEditedInfo = videoEditedInfo2;
                stickerUploader3.thumbPath = str3;
                stickerUploader3.whenDone = callback3;
                stickerUploader3.customHandler = callback2;
                if (!TextUtils.isEmpty(str4)) {
                    stickerUploader3.finalFiles.add(new File(stickerUploader3.finalPath));
                }
                boolean zIsEmpty = TextUtils.isEmpty(stickerUploader3.path);
                ArrayList arrayList = stickerUploader3.files;
                if (!zIsEmpty && !TextUtils.equals(stickerUploader3.path, stickerUploader3.finalPath)) {
                    arrayList.add(new File(stickerUploader3.path));
                }
                if (!TextUtils.isEmpty(stickerUploader3.thumbPath)) {
                    arrayList.add(new File(stickerUploader3.thumbPath));
                }
                if (z2) {
                    TLRPC.Document document3 = document2;
                    if (document3 != null) {
                        StickerMakerView.StickerUploader stickerUploader4 = stickerMakerView.stickerUploader;
                        stickerUploader4.tlInputStickerSetItem = MediaDataController.getInputStickerSetItem(document3, stickerUploader4.emoji);
                        stickerMakerView.stickerUploader.mediaDocument = new TLRPC.TL_messageMediaDocument();
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = stickerMakerView.stickerUploader.mediaDocument;
                        tL_messageMediaDocument.flags |= 1;
                        tL_messageMediaDocument.document = document3;
                        stickerMakerView.afterUploadingMedia();
                    } else if (videoEditedInfo2 != null) {
                        TLRPC.TL_message tL_message = new TLRPC.TL_message();
                        tL_message.id = 1;
                        StickerMakerView.StickerUploader stickerUploader5 = stickerMakerView.stickerUploader;
                        String absolutePath = StoryEntry.makeCacheFile(UserConfig.selectedAccount, "webm").getAbsolutePath();
                        tL_message.attachPath = absolutePath;
                        stickerUploader5.finalPath = absolutePath;
                        stickerMakerView.stickerUploader.messageObject = new MessageObject(UserConfig.selectedAccount, (TLRPC.Message) tL_message, (MessageObject) null, false, false);
                        stickerMakerView.stickerUploader.messageObject.videoEditedInfo = videoEditedInfo2;
                        MediaController.getInstance().scheduleVideoConvert(stickerMakerView.stickerUploader.messageObject, false, false, false);
                    } else {
                        FileLoader.getInstance(stickerMakerView.currentAccount).uploadFile(str4, false, true, 67108864);
                    }
                } else {
                    stickerMakerView.afterUploadingMedia();
                }
                if (callback3 == null) {
                    if (stickerMakerView.loadingToast == null) {
                        stickerMakerView.loadingToast = new DownloadButton.PreparingVideoToast(stickerMakerView.getContext(), LocaleController.getString(R.string.PreparingSticker));
                    }
                    stickerMakerView.loadingToast.setOnCancelListener(new StickerMakerView$$ExternalSyntheticLambda6(stickerMakerView, 1));
                    if (stickerMakerView.loadingToast.getParent() == null) {
                        stickerMakerView.addView(stickerMakerView.loadingToast, LayoutHelper.createFrame(-1, -1, 17));
                    }
                    DownloadButton.PreparingVideoToast preparingVideoToast = stickerMakerView.loadingToast;
                    preparingVideoToast.shown = true;
                    preparingVideoToast.invalidate();
                }
            }
        }, 300L);
    }
}

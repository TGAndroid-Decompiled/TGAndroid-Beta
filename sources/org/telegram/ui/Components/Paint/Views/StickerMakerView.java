package org.telegram.ui.Components.Paint.Views;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.segmentation.subject.Subject;
import com.google.mlkit.vision.segmentation.subject.SubjectSegmentation;
import com.google.mlkit.vision.segmentation.subject.SubjectSegmentationResult;
import com.google.mlkit.vision.segmentation.subject.SubjectSegmenter;
import com.google.mlkit.vision.segmentation.subject.SubjectSegmenterOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$InputFile;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$StickerSet;
import org.telegram.tgnet.TLRPC$TL_documentAttributeSticker;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputMediaUploadedDocument;
import org.telegram.tgnet.TLRPC$TL_inputPeerSelf;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetEmpty;
import org.telegram.tgnet.TLRPC$TL_inputStickerSetItem;
import org.telegram.tgnet.TLRPC$TL_inputUserSelf;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_messages_uploadMedia;
import org.telegram.tgnet.TLRPC$TL_stickers_addStickerToSet;
import org.telegram.tgnet.TLRPC$TL_stickers_createStickerSet;
import org.telegram.tgnet.TLRPC$TL_stickers_replaceSticker;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ThanosEffect;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.recorder.StoryEntry;
@SuppressLint({"ViewConstructor"})
public class StickerMakerView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private final TextView actionTextView;
    private final Path areaPath;
    private final Paint bgPaint;
    private final Path bgPath;
    private final Paint borderPaint;
    private ValueAnimator bordersAnimator;
    private float bordersAnimatorValue;
    private float bordersAnimatorValueStart;
    private final PathMeasure bordersPathMeasure;
    public int currentAccount;
    private final Paint dashPaint;
    private final Path dashPath;
    private Bitmap filteredBitmap;
    private float imageReceiverHeight;
    private final Matrix imageReceiverMatrix;
    private float imageReceiverWidth;
    private boolean isSegmentedState;
    public boolean isThanosInProgress;
    private AlertDialog loadingDialog;
    public SegmentedObject[] objects;
    private final Theme.ResourcesProvider resourcesProvider;
    private final Path screenPath;
    private final AnimatedFloat segmentBorderAlpha;
    private float segmentBorderImageHeight;
    private float segmentBorderImageWidth;
    private final Paint segmentBorderPaint;
    private volatile boolean segmentingLoaded;
    private volatile boolean segmentingLoading;
    private SegmentedObject selectedObject;
    private volatile Bitmap sourceBitmap;
    private StickerCutOutBtn stickerCutOutBtn;
    private StickerUploader stickerUploader;
    private ThanosEffect thanosEffect;
    float tx;
    float ty;

    public StickerMakerView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.currentAccount = -1;
        this.segmentBorderAlpha = new AnimatedFloat(0.0f, (View) null, 0L, 420L, CubicBezierInterpolator.EASE_OUT_QUINT);
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
        this.imageReceiverMatrix = new Matrix();
        this.resourcesProvider = resourcesProvider;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(5.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
        paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        paint.setAlpha(140);
        TextView textView = new TextView(context);
        this.actionTextView = textView;
        textView.setText(LocaleController.getString(R.string.SegmentationTabToCrop));
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(-1);
        textView.setAlpha(0.0f);
        textView.setScaleX(0.3f);
        textView.setScaleY(0.3f);
        addView(textView, LayoutHelper.createFrame(-2, -2, 17));
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(6.0f)));
        paint3.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(4.0f), BlurMaskFilter.Blur.NORMAL));
        paint4.setColor(-1);
        paint4.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeCap(Paint.Cap.ROUND);
        paint4.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(6.0f)));
        paint4.setMaskFilter(new BlurMaskFilter(AndroidUtilities.dp(4.0f), BlurMaskFilter.Blur.NORMAL));
        paint2.setColor(1711276032);
        setLayerType(2, null);
    }

    public void setStickerCutOutBtn(StickerCutOutBtn stickerCutOutBtn) {
        this.stickerCutOutBtn = stickerCutOutBtn;
    }

    public float getSegmentBorderImageHeight() {
        return this.segmentBorderImageHeight;
    }

    public float getSegmentBorderImageWidth() {
        return this.segmentBorderImageWidth;
    }

    public ThanosEffect getThanosEffect() {
        if (ThanosEffect.supports()) {
            if (this.thanosEffect == null) {
                ThanosEffect thanosEffect = new ThanosEffect(getContext(), new Runnable() {
                    @Override
                    public final void run() {
                        StickerMakerView.this.lambda$getThanosEffect$0();
                    }
                });
                this.thanosEffect = thanosEffect;
                addView(thanosEffect, LayoutHelper.createFrame(-1, -1.0f));
            }
            return this.thanosEffect;
        }
        return null;
    }

    public void lambda$getThanosEffect$0() {
        ThanosEffect thanosEffect = this.thanosEffect;
        if (thanosEffect != null) {
            this.thanosEffect = null;
            removeView(thanosEffect);
        }
    }

    public class SegmentedObject {
        private float borderImageHeight;
        private float borderImageWidth;
        public Bitmap darkMaskImage;
        public boolean hover;
        public Bitmap image;
        public int orientation;
        public AnimatedFloat select = new AnimatedFloat(0.0f, (View) null, 0, 320, CubicBezierInterpolator.EASE_OUT_QUINT);
        public RectF bounds = new RectF();
        public RectF rotatedBounds = new RectF();
        private final Path segmentBorderPath = new Path();
        private final Path partSegmentBorderPath = new Path();

        public SegmentedObject() {
        }

        public void drawBorders(Canvas canvas, float f, float f2, View view) {
            int width;
            int height;
            this.select.setParent(view);
            if (StickerMakerView.this.sourceBitmap == null) {
                return;
            }
            float lerp = AndroidUtilities.lerp(1.0f, 1.065f, f2) * AndroidUtilities.lerp(1.0f, 1.05f, this.select.set(this.hover));
            if ((this.orientation / 90) % 2 != 0) {
                width = StickerMakerView.this.sourceBitmap.getHeight();
                height = StickerMakerView.this.sourceBitmap.getWidth();
            } else {
                width = StickerMakerView.this.sourceBitmap.getWidth();
                height = StickerMakerView.this.sourceBitmap.getHeight();
            }
            canvas.save();
            float f3 = width;
            float f4 = this.borderImageWidth;
            float f5 = height;
            float f6 = this.borderImageHeight;
            canvas.scale(lerp, lerp, ((this.rotatedBounds.centerX() / f3) * f4) - (f4 / 2.0f), ((this.rotatedBounds.centerY() / f5) * f6) - (f6 / 2.0f));
            StickerMakerView.this.bordersPathMeasure.setPath(this.segmentBorderPath, false);
            this.partSegmentBorderPath.reset();
            float length = StickerMakerView.this.bordersPathMeasure.getLength();
            if (length == 0.0f) {
                return;
            }
            StickerMakerView.this.segmentBorderPaint.setAlpha((int) (255.0f * f2));
            StickerMakerView.this.borderPaint.setAlpha((int) (f2 * 64.0f));
            canvas.drawPath(this.partSegmentBorderPath, StickerMakerView.this.borderPaint);
            float f7 = 0.2f + f;
            StickerMakerView.this.bordersPathMeasure.getSegment(f * length, length * f7, this.partSegmentBorderPath, true);
            canvas.drawPath(this.partSegmentBorderPath, StickerMakerView.this.segmentBorderPaint);
            canvas.drawPath(this.partSegmentBorderPath, StickerMakerView.this.segmentBorderPaint);
            if (f7 > 1.0f) {
                this.partSegmentBorderPath.reset();
                StickerMakerView.this.bordersPathMeasure.setPath(this.segmentBorderPath, false);
                StickerMakerView.this.bordersPathMeasure.getSegment(0.0f, (f7 - 1.0f) * length, this.partSegmentBorderPath, true);
                canvas.drawPath(this.partSegmentBorderPath, StickerMakerView.this.segmentBorderPaint);
                canvas.drawPath(this.partSegmentBorderPath, StickerMakerView.this.segmentBorderPaint);
            }
            if (this.image != null) {
                canvas.save();
                canvas.rotate(this.orientation);
                canvas.scale((1.0f / f3) * this.borderImageWidth, (1.0f / f5) * this.borderImageHeight);
                canvas.drawBitmap(this.image, (-StickerMakerView.this.sourceBitmap.getWidth()) / 2.0f, (-StickerMakerView.this.sourceBitmap.getHeight()) / 2.0f, (Paint) null);
                canvas.restore();
            }
            canvas.restore();
        }

        public void recycle() {
            this.segmentBorderPath.reset();
            Bitmap bitmap = this.image;
            if (bitmap != null) {
                bitmap.recycle();
                this.image = null;
            }
            Bitmap bitmap2 = this.darkMaskImage;
            if (bitmap2 != null) {
                bitmap2.recycle();
                this.darkMaskImage = null;
            }
        }
    }

    public void drawSegmentBorderPath(Canvas canvas, ImageReceiver imageReceiver, Matrix matrix, ViewGroup viewGroup) {
        this.segmentBorderAlpha.setParent(viewGroup);
        if ((this.bordersAnimator != null || this.segmentBorderAlpha.get() > 0.0f) && viewGroup != null) {
            this.imageReceiverWidth = imageReceiver.getImageWidth();
            this.imageReceiverHeight = imageReceiver.getImageHeight();
            matrix.invert(this.imageReceiverMatrix);
            float f = (this.bordersAnimatorValueStart + this.bordersAnimatorValue) % 1.0f;
            float f2 = this.segmentBorderAlpha.set(this.bordersAnimator != null ? 1.0f : 0.0f);
            canvas.drawColor(Theme.multAlpha(1342177280, f2));
            SegmentedObject[] segmentedObjectArr = this.objects;
            if (segmentedObjectArr != null) {
                for (SegmentedObject segmentedObject : segmentedObjectArr) {
                    segmentedObject.drawBorders(canvas, f, f2, viewGroup);
                }
            }
            viewGroup.invalidate();
        }
    }

    public void enableClippingMode(final Utilities.Callback<SegmentedObject> callback) {
        setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StickerMakerView.this.lambda$enableClippingMode$1(callback, view);
            }
        });
        this.actionTextView.animate().cancel();
        this.actionTextView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
        ValueAnimator valueAnimator = this.bordersAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.bordersAnimatorValueStart = this.bordersAnimatorValue;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.bordersAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                StickerMakerView.this.lambda$enableClippingMode$2(valueAnimator2);
            }
        });
        this.bordersAnimator.setRepeatCount(-1);
        this.bordersAnimator.setRepeatMode(1);
        this.bordersAnimator.setDuration(2400L);
        this.bordersAnimator.setInterpolator(new LinearInterpolator());
        this.bordersAnimator.start();
    }

    public void lambda$enableClippingMode$1(Utilities.Callback callback, View view) {
        SegmentedObject objectBehind;
        SegmentedObject[] segmentedObjectArr = this.objects;
        if (segmentedObjectArr == null || segmentedObjectArr.length == 0 || this.sourceBitmap == null || (objectBehind = objectBehind(this.tx, this.ty)) == null) {
            return;
        }
        callback.run(objectBehind);
    }

    public void lambda$enableClippingMode$2(ValueAnimator valueAnimator) {
        this.bordersAnimatorValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.tx = motionEvent.getX();
        float y = motionEvent.getY();
        this.ty = y;
        if (this.objects != null && this.bordersAnimator != null) {
            SegmentedObject objectBehind = objectBehind(this.tx, y);
            int i = 0;
            while (true) {
                SegmentedObject[] segmentedObjectArr = this.objects;
                if (i >= segmentedObjectArr.length) {
                    break;
                }
                boolean z = true;
                z = (segmentedObjectArr[i] != objectBehind || motionEvent.getAction() == 3 || motionEvent.getAction() == 1) ? false : false;
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

    public SegmentedObject objectBehind(float f, float f2) {
        int width;
        int height;
        float[] fArr = {f, f2};
        this.imageReceiverMatrix.mapPoints(fArr);
        if ((this.objects[0].orientation / 90) % 2 != 0) {
            width = this.sourceBitmap.getHeight();
            height = this.sourceBitmap.getWidth();
        } else {
            width = this.sourceBitmap.getWidth();
            height = this.sourceBitmap.getHeight();
        }
        int i = 0;
        while (true) {
            SegmentedObject[] segmentedObjectArr = this.objects;
            if (i >= segmentedObjectArr.length) {
                return null;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            float f3 = width;
            float f4 = this.imageReceiverWidth;
            float f5 = height;
            float f6 = this.imageReceiverHeight;
            rectF.set((segmentedObjectArr[i].rotatedBounds.left / f3) * f4, (segmentedObjectArr[i].rotatedBounds.top / f5) * f6, (segmentedObjectArr[i].rotatedBounds.right / f3) * f4, (segmentedObjectArr[i].rotatedBounds.bottom / f5) * f6);
            rectF.offset((-this.imageReceiverWidth) / 2.0f, (-this.imageReceiverHeight) / 2.0f);
            if (rectF.contains(fArr[0], fArr[1])) {
                return this.objects[i];
            }
            i++;
        }
    }

    public void disableClippingMode() {
        this.segmentBorderAlpha.set(0.0f);
        ValueAnimator valueAnimator = this.bordersAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.bordersAnimator = null;
        }
        setOnClickListener(null);
        setClickable(false);
        this.actionTextView.animate().cancel();
        this.actionTextView.animate().alpha(0.0f).scaleX(0.7f).scaleY(0.7f).setDuration(240L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.actionTextView.setTranslationY((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(10.0f));
    }

    public boolean isSegmentedState() {
        return this.isSegmentedState;
    }

    public void setSegmentedState(boolean z, SegmentedObject segmentedObject) {
        this.isSegmentedState = z;
        this.selectedObject = segmentedObject;
    }

    public Bitmap getSegmentedDarkMaskImage() {
        SegmentedObject segmentedObject;
        if (!this.isSegmentedState || (segmentedObject = this.selectedObject) == null) {
            return null;
        }
        return segmentedObject.darkMaskImage;
    }

    public boolean hasSegmentedBitmap() {
        SegmentedObject[] segmentedObjectArr;
        return this.segmentingLoaded && (segmentedObjectArr = this.objects) != null && segmentedObjectArr.length > 0;
    }

    public Bitmap getSourceBitmap() {
        return this.sourceBitmap;
    }

    public Bitmap getSourceBitmap(boolean z) {
        Bitmap bitmap;
        return (!z || (bitmap = this.filteredBitmap) == null) ? this.sourceBitmap : bitmap;
    }

    public Bitmap getSegmentedImage(Bitmap bitmap, boolean z, int i) {
        SegmentedObject segmentedObject = this.selectedObject;
        if (segmentedObject == null) {
            return this.sourceBitmap;
        }
        if (z && bitmap != null) {
            return cutSegmentInFilteredBitmap(bitmap, i);
        }
        return segmentedObject.image;
    }

    public Bitmap getThanosImage(MediaController.PhotoEntry photoEntry, int i) {
        String str = photoEntry.filterPath;
        Bitmap decodeFile = str != null ? BitmapFactory.decodeFile(str) : getSourceBitmap();
        Bitmap decodeFile2 = BitmapFactory.decodeFile(photoEntry.paintPath);
        Bitmap createBitmap = Bitmap.createBitmap(decodeFile.getWidth(), decodeFile.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        Paint paint2 = new Paint(3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint2);
        Rect rect = new Rect();
        rect.set(0, 0, decodeFile.getWidth(), decodeFile.getHeight());
        SegmentedObject segmentedObject = this.selectedObject;
        if (segmentedObject == null) {
            SegmentedObject[] segmentedObjectArr = this.objects;
            if (segmentedObjectArr.length > 0) {
                segmentedObject = segmentedObjectArr[0];
            }
        }
        if (segmentedObject == null) {
            return null;
        }
        if (segmentedObject.orientation != 0 && photoEntry.isFiltered) {
            Matrix matrix = new Matrix();
            matrix.postRotate(segmentedObject.orientation, segmentedObject.darkMaskImage.getWidth() / 2.0f, segmentedObject.darkMaskImage.getHeight() / 2.0f);
            if ((segmentedObject.orientation / 90) % 2 != 0) {
                float height = (segmentedObject.darkMaskImage.getHeight() - segmentedObject.darkMaskImage.getWidth()) / 2.0f;
                matrix.postTranslate(height, -height);
            }
            matrix.postScale(decodeFile.getWidth() / segmentedObject.darkMaskImage.getHeight(), decodeFile.getHeight() / segmentedObject.darkMaskImage.getWidth());
            canvas.drawBitmap(segmentedObject.darkMaskImage, matrix, paint);
        } else {
            canvas.drawBitmap(segmentedObject.darkMaskImage, (Rect) null, rect, paint);
        }
        if (decodeFile2 != null) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            if (segmentedObject.orientation != 0 && !photoEntry.isFiltered) {
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(-segmentedObject.orientation, decodeFile2.getWidth() / 2.0f, decodeFile2.getHeight() / 2.0f);
                if ((segmentedObject.orientation / 90) % 2 != 0) {
                    float height2 = (decodeFile2.getHeight() - decodeFile2.getWidth()) / 2.0f;
                    matrix2.postTranslate(height2, -height2);
                }
                matrix2.postScale(decodeFile.getWidth() / decodeFile2.getHeight(), decodeFile.getHeight() / decodeFile2.getWidth());
                canvas.drawBitmap(decodeFile2, matrix2, paint);
            } else {
                canvas.drawBitmap(decodeFile2, (Rect) null, rect, paint);
            }
        }
        return createBitmap;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float dp = AndroidUtilities.dp(10.0f);
        float f = dp * 2.0f;
        float measuredWidth = getMeasuredWidth() - f;
        float measuredHeight = getMeasuredHeight() - f;
        float f2 = measuredWidth / 8.0f;
        RectF rectF = AndroidUtilities.rectTmp;
        float f3 = measuredWidth + dp;
        rectF.set(dp, dp, f3, f3);
        rectF.offset(0.0f, (measuredHeight - rectF.height()) / 2.0f);
        this.areaPath.rewind();
        this.areaPath.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        this.bgPath.rewind();
        this.bgPath.addRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), Path.Direction.CW);
        this.screenPath.reset();
        this.screenPath.op(this.bgPath, this.areaPath, Path.Op.DIFFERENCE);
        this.dashPath.rewind();
        rectF.inset(AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(-1.0f));
        this.dashPath.addRoundRect(rectF, f2, f2, Path.Direction.CW);
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawPath(this.screenPath, this.bgPaint);
        canvas.drawPath(this.dashPath, this.dashPaint);
    }

    private Bitmap createSmoothEdgesSegmentedImage(int i, int i2, Bitmap bitmap) {
        Bitmap sourceBitmap = getSourceBitmap();
        if (bitmap == null || sourceBitmap == null) {
            return null;
        }
        Paint paint = new Paint(3);
        Bitmap createBitmap = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, i, i2, paint);
        Utilities.stackBlurBitmap(createBitmap, 5);
        Bitmap createBitmap2 = Bitmap.createBitmap(sourceBitmap.getWidth(), sourceBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap2);
        canvas.drawBitmap(sourceBitmap, 0.0f, 0.0f, paint);
        Paint paint2 = new Paint(3);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, paint2);
        createBitmap.recycle();
        return createBitmap2;
    }

    public void lambda$segmentImage$6(final Bitmap bitmap, final int i, final int i2, final int i3) {
        if (this.segmentingLoaded || this.segmentingLoading || bitmap == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        SubjectSegmenter client = SubjectSegmentation.getClient(new SubjectSegmenterOptions.Builder().enableMultipleSubjects(new SubjectSegmenterOptions.SubjectResultOptions.Builder().enableSubjectBitmap().build()).build());
        this.segmentingLoading = true;
        this.sourceBitmap = bitmap;
        client.process(InputImage.fromBitmap(bitmap, i)).addOnSuccessListener(new OnSuccessListener() {
            @Override
            public final void onSuccess(Object obj) {
                StickerMakerView.this.lambda$segmentImage$5(i, i2, i3, (SubjectSegmentationResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public final void onFailure(Exception exc) {
                StickerMakerView.this.lambda$segmentImage$7(bitmap, i, i2, i3, exc);
            }
        });
    }

    public void lambda$segmentImage$5(final int i, final int i2, final int i3, final SubjectSegmentationResult subjectSegmentationResult) {
        if (this.sourceBitmap == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        Utilities.themeQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                StickerMakerView.this.lambda$segmentImage$4(subjectSegmentationResult, i, i2, i3, arrayList);
            }
        });
    }

    public void lambda$segmentImage$4(SubjectSegmentationResult subjectSegmentationResult, int i, int i2, int i3, final ArrayList arrayList) {
        if (this.sourceBitmap == null) {
            return;
        }
        List<Subject> subjects = subjectSegmentationResult.getSubjects();
        Matrix matrix = new Matrix();
        matrix.postScale(1.0f / this.sourceBitmap.getWidth(), 1.0f / this.sourceBitmap.getHeight());
        matrix.postTranslate(-0.5f, -0.5f);
        matrix.postRotate(i);
        matrix.postTranslate(0.5f, 0.5f);
        if ((i / 90) % 2 != 0) {
            matrix.postScale(this.sourceBitmap.getHeight(), this.sourceBitmap.getWidth());
        } else {
            matrix.postScale(this.sourceBitmap.getWidth(), this.sourceBitmap.getHeight());
        }
        for (int i4 = 0; i4 < subjects.size(); i4++) {
            Subject subject = subjects.get(i4);
            SegmentedObject segmentedObject = new SegmentedObject();
            segmentedObject.bounds.set(subject.getStartX(), subject.getStartY(), subject.getStartX() + subject.getWidth(), subject.getStartY() + subject.getHeight());
            segmentedObject.rotatedBounds.set(segmentedObject.bounds);
            matrix.mapRect(segmentedObject.rotatedBounds);
            segmentedObject.orientation = i;
            Bitmap createSmoothEdgesSegmentedImage = createSmoothEdgesSegmentedImage(subject.getStartX(), subject.getStartY(), subject.getBitmap());
            segmentedObject.image = createSmoothEdgesSegmentedImage;
            if (createSmoothEdgesSegmentedImage != null) {
                segmentedObject.darkMaskImage = Bitmap.createBitmap(createSmoothEdgesSegmentedImage.getWidth(), segmentedObject.image.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(segmentedObject.darkMaskImage);
                canvas.drawColor(-16777216);
                Paint paint = new Paint(3);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                canvas.drawBitmap(segmentedObject.image, 0.0f, 0.0f, paint);
                createSegmentImagePath(segmentedObject, i2, i3);
                this.segmentBorderImageWidth = segmentedObject.borderImageWidth;
                this.segmentBorderImageHeight = segmentedObject.borderImageHeight;
                arrayList.add(segmentedObject);
            }
        }
        this.selectedObject = null;
        this.segmentingLoaded = true;
        this.segmentingLoading = false;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickerMakerView.this.lambda$segmentImage$3(arrayList);
            }
        });
    }

    public void lambda$segmentImage$3(ArrayList arrayList) {
        SegmentedObject[] segmentedObjectArr = (SegmentedObject[]) arrayList.toArray(new SegmentedObject[1]);
        this.objects = segmentedObjectArr;
        if (segmentedObjectArr.length > 0) {
            this.stickerCutOutBtn.setScaleX(0.3f);
            this.stickerCutOutBtn.setScaleY(0.3f);
            this.stickerCutOutBtn.setAlpha(0.0f);
            this.stickerCutOutBtn.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
        }
    }

    public void lambda$segmentImage$7(final Bitmap bitmap, final int i, final int i2, final int i3, Exception exc) {
        this.segmentingLoading = false;
        FileLog.e(exc);
        if (isWaitingMlKitError(exc) && isAttachedToWindow()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StickerMakerView.this.lambda$segmentImage$6(bitmap, i, i2, i3);
                }
            }, 2000L);
        } else {
            this.segmentingLoaded = true;
        }
    }

    private void createSegmentImagePath(SegmentedObject segmentedObject, int i, int i2) {
        int i3;
        int width = segmentedObject.image.getWidth();
        int height = segmentedObject.image.getHeight();
        float max = Math.max(width, height) / 256.0f;
        if ((segmentedObject.orientation / 90) % 2 != 0) {
            width = segmentedObject.image.getHeight();
            height = segmentedObject.image.getWidth();
        }
        float f = width;
        float f2 = height;
        Bitmap createBitmap = Bitmap.createBitmap((int) (f / max), (int) (f2 / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, createBitmap.getWidth(), createBitmap.getHeight());
        if (segmentedObject.orientation != 0) {
            Matrix matrix = new Matrix();
            matrix.postRotate(segmentedObject.orientation, segmentedObject.image.getWidth() / 2.0f, segmentedObject.image.getHeight() / 2.0f);
            if ((segmentedObject.orientation / 90) % 2 != 0) {
                float height2 = (segmentedObject.image.getHeight() - segmentedObject.image.getWidth()) / 2.0f;
                matrix.postTranslate(height2, -height2);
            }
            matrix.postScale(rectF.width() / f, rectF.height() / f2);
            canvas.drawBitmap(segmentedObject.image, matrix, new Paint(3));
        } else {
            canvas.drawBitmap(segmentedObject.image, (Rect) null, rectF, new Paint(3));
        }
        int width2 = createBitmap.getWidth() * createBitmap.getHeight();
        int[] iArr = new int[width2];
        createBitmap.getPixels(iArr, 0, createBitmap.getWidth(), 0, 0, createBitmap.getWidth(), createBitmap.getHeight());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        float f3 = i;
        float width3 = f3 / createBitmap.getWidth();
        Point point = null;
        Point point2 = null;
        int i4 = 0;
        while (true) {
            if (i4 >= width2) {
                break;
            }
            int width4 = i4 / createBitmap.getWidth();
            int width5 = i4 - (createBitmap.getWidth() * width4);
            boolean z = iArr[i4] != 0;
            if (iArr[i4] == 0) {
                int i5 = i4 - 1;
                boolean z2 = i5 >= 0;
                int i6 = i4 + 1;
                boolean z3 = i6 < width2;
                if (z2 && iArr[i5] != 0) {
                    point2 = new Point(width5, width4, width3);
                }
                if (point == null && z3 && iArr[i6] != 0) {
                    point = new Point(width5, width4, width3);
                }
            }
            boolean z4 = width5 == createBitmap.getWidth() + (-1);
            boolean z5 = width5 == 0;
            if (z4) {
                if (z) {
                    point2 = new Point(width5, width4, width3);
                }
                if (point != null) {
                    arrayList.add(point);
                }
                if (point2 != null) {
                    arrayList2.add(point2);
                }
                point = null;
                point2 = null;
            }
            if (z5 && z) {
                point = new Point(width5, width4, width3);
            }
            i4++;
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int i7 = 0;
        Point point3 = null;
        Point point4 = null;
        while (i7 < width2) {
            int height3 = i7 / createBitmap.getHeight();
            Point point5 = point4;
            int height4 = i7 - (createBitmap.getHeight() * height3);
            boolean z6 = iArr[height3 + (createBitmap.getWidth() * height4)] != 0;
            if (z6) {
                i3 = width2;
            } else {
                int width6 = height3 + ((height4 - 1) * createBitmap.getWidth());
                int width7 = height3 + ((height4 + 1) * createBitmap.getWidth());
                boolean z7 = width6 >= 0;
                boolean z8 = width7 < width2;
                if (!z7 || iArr[width6] == 0) {
                    i3 = width2;
                } else {
                    i3 = width2;
                    point5 = new Point(height3, height4, width3);
                }
                if (point3 == null && z8 && iArr[width7] != 0) {
                    point3 = new Point(height3, height4, width3);
                }
            }
            boolean z9 = height4 == createBitmap.getHeight() + (-1);
            boolean z10 = height4 == 0;
            if (z9) {
                Point point6 = z6 ? new Point(height3, height4, width3) : point5;
                if (point3 != null) {
                    arrayList3.add(point3);
                }
                if (point6 != null) {
                    arrayList4.add(point6);
                }
                point3 = null;
                point5 = null;
            }
            if (z10 && z6) {
                point3 = new Point(height3, height4, width3);
            }
            i7++;
            point4 = point5;
            width2 = i3;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Collections.reverse(arrayList2);
        Collections.reverse(arrayList3);
        linkedHashSet2.addAll(arrayList);
        linkedHashSet2.addAll(arrayList2);
        linkedHashSet.addAll(arrayList4);
        linkedHashSet.addAll(arrayList3);
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(linkedHashSet2);
        Path path = new Path();
        for (int i8 = 0; i8 < arrayList6.size(); i8 += 2) {
            Point point7 = (Point) arrayList6.get(i8);
            if (path.isEmpty()) {
                path.moveTo(((android.graphics.Point) point7).x, ((android.graphics.Point) point7).y);
            } else {
                path.lineTo(((android.graphics.Point) point7).x, ((android.graphics.Point) point7).y);
            }
        }
        Path path2 = new Path();
        for (int i9 = 0; i9 < arrayList5.size(); i9 += 2) {
            Point point8 = (Point) arrayList5.get(i9);
            if (path2.isEmpty()) {
                path2.moveTo(((android.graphics.Point) point8).x, ((android.graphics.Point) point8).y);
            } else {
                path2.lineTo(((android.graphics.Point) point8).x, ((android.graphics.Point) point8).y);
            }
        }
        segmentedObject.segmentBorderPath.reset();
        segmentedObject.segmentBorderPath.op(path, path2, Path.Op.INTERSECT);
        float min = Math.min(f3 / f, i2 / f2);
        segmentedObject.borderImageWidth = f * min;
        segmentedObject.borderImageHeight = f2 * min;
        segmentedObject.segmentBorderPath.offset((-segmentedObject.borderImageWidth) / 2.0f, (-segmentedObject.borderImageHeight) / 2.0f);
    }

    public Bitmap cutSegmentInFilteredBitmap(Bitmap bitmap, int i) {
        SegmentedObject segmentedObject = this.selectedObject;
        if (segmentedObject == null) {
            return bitmap;
        }
        this.filteredBitmap = bitmap;
        if (segmentedObject.darkMaskImage == null || !this.isSegmentedState) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        Paint paint2 = new Paint(3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
        Rect rect = new Rect();
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        SegmentedObject segmentedObject2 = this.selectedObject;
        if (segmentedObject2.orientation != 0) {
            Matrix matrix = new Matrix();
            SegmentedObject segmentedObject3 = this.selectedObject;
            matrix.postRotate(segmentedObject3.orientation, segmentedObject3.darkMaskImage.getWidth() / 2.0f, this.selectedObject.darkMaskImage.getHeight() / 2.0f);
            SegmentedObject segmentedObject4 = this.selectedObject;
            if ((segmentedObject4.orientation / 90) % 2 != 0) {
                float height = (segmentedObject4.image.getHeight() - this.selectedObject.image.getWidth()) / 2.0f;
                matrix.postTranslate(height, -height);
            }
            matrix.postScale(bitmap.getWidth() / this.selectedObject.darkMaskImage.getHeight(), bitmap.getHeight() / this.selectedObject.darkMaskImage.getWidth());
            canvas.drawBitmap(this.selectedObject.darkMaskImage, matrix, paint);
        } else {
            canvas.drawBitmap(segmentedObject2.darkMaskImage, (Rect) null, rect, paint);
        }
        return createBitmap;
    }

    public void clean() {
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
                if (segmentedObjectArr[i] != null) {
                    segmentedObjectArr[i].recycle();
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
    }

    public static boolean isWaitingMlKitError(Exception exc) {
        return (exc instanceof MlKitException) && exc.getMessage() != null && exc.getMessage().contains("segmentation optional module to be downloaded");
    }

    public void setCurrentAccount(int i) {
        int i2 = this.currentAccount;
        if (i2 != i) {
            if (i2 >= 0) {
                NotificationCenter.getInstance(i2).removeObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
            this.currentAccount = i;
            if (i >= 0) {
                NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.fileUploaded);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingFailed);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingStarted);
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileNewChunkAvailable);
            }
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = this.currentAccount;
        if (i >= 0) {
            NotificationCenter.getInstance(i).removeObserver(this, NotificationCenter.fileUploaded);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileUploadFailed);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingFailed);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.filePreparingStarted);
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.fileNewChunkAvailable);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileUploadFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingFailed);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.filePreparingStarted);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.fileNewChunkAvailable);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        StickerUploader stickerUploader;
        if (i == NotificationCenter.fileUploaded) {
            String str = (String) objArr[0];
            TLRPC$InputFile tLRPC$InputFile = (TLRPC$InputFile) objArr[1];
            StickerUploader stickerUploader2 = this.stickerUploader;
            if (stickerUploader2 == null || !str.equalsIgnoreCase(stickerUploader2.finalPath)) {
                return;
            }
            this.stickerUploader.file = tLRPC$InputFile;
            uploadMedia();
        } else if (i == NotificationCenter.fileUploadFailed) {
            String str2 = (String) objArr[0];
            StickerUploader stickerUploader3 = this.stickerUploader;
            if (stickerUploader3 == null || !str2.equalsIgnoreCase(stickerUploader3.finalPath)) {
                return;
            }
            hideLoadingDialog();
        } else if (i == NotificationCenter.filePreparingStarted) {
            StickerUploader stickerUploader4 = this.stickerUploader;
            if (stickerUploader4 != null && objArr[0] == stickerUploader4.messageObject) {
                FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(this.stickerUploader.finalPath, false, true, ConnectionsManager.FileTypeFile);
            }
        } else if (i == NotificationCenter.fileNewChunkAvailable) {
            StickerUploader stickerUploader5 = this.stickerUploader;
            if (stickerUploader5 != null && objArr[0] == stickerUploader5.messageObject) {
                FileLoader.getInstance(this.currentAccount).checkUploadNewDataAvailable((String) objArr[1], false, Math.max(1L, ((Long) objArr[2]).longValue()), ((Long) objArr[3]).longValue(), Float.valueOf(((Float) objArr[4]).floatValue()));
            }
        } else if (i == NotificationCenter.filePreparingFailed && (stickerUploader = this.stickerUploader) != null && objArr[0] == stickerUploader.messageObject) {
            hideLoadingDialog();
        }
    }

    public void uploadStickerFile(final String str, final VideoEditedInfo videoEditedInfo, final String str2, final CharSequence charSequence, final boolean z, final TLRPC$StickerSet tLRPC$StickerSet, final TLRPC$Document tLRPC$Document) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickerMakerView.this.lambda$uploadStickerFile$8(str2, str, charSequence, z, tLRPC$StickerSet, tLRPC$Document, videoEditedInfo);
            }
        }, 300L);
    }

    public void lambda$uploadStickerFile$8(String str, String str2, CharSequence charSequence, boolean z, TLRPC$StickerSet tLRPC$StickerSet, TLRPC$Document tLRPC$Document, VideoEditedInfo videoEditedInfo) {
        StickerUploader stickerUploader = new StickerUploader();
        this.stickerUploader = stickerUploader;
        stickerUploader.emoji = str;
        stickerUploader.finalPath = str2;
        stickerUploader.stickerPackName = charSequence;
        stickerUploader.addToFavorite = z;
        stickerUploader.stickerSet = tLRPC$StickerSet;
        stickerUploader.replacedSticker = tLRPC$Document;
        stickerUploader.videoEditedInfo = videoEditedInfo;
        if (videoEditedInfo != null) {
            TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
            tLRPC$TL_message.id = 1;
            StickerUploader stickerUploader2 = this.stickerUploader;
            String absolutePath = StoryEntry.makeCacheFile(UserConfig.selectedAccount, "webm").getAbsolutePath();
            tLRPC$TL_message.attachPath = absolutePath;
            stickerUploader2.finalPath = absolutePath;
            this.stickerUploader.messageObject = new MessageObject(UserConfig.selectedAccount, (TLRPC$Message) tLRPC$TL_message, (MessageObject) null, false, false);
            this.stickerUploader.messageObject.videoEditedInfo = videoEditedInfo;
            MediaController.getInstance().scheduleVideoConvert(this.stickerUploader.messageObject, false, false);
        } else {
            FileLoader.getInstance(UserConfig.selectedAccount).uploadFile(str2, false, true, ConnectionsManager.FileTypeFile);
        }
        showLoadingDialog();
    }

    private void showLoadingDialog() {
        AlertDialog alertDialog = new AlertDialog(getContext(), 3, new DarkThemeResourceProvider());
        this.loadingDialog = alertDialog;
        alertDialog.show();
    }

    private void hideLoadingDialog() {
        AlertDialog alertDialog = this.loadingDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.loadingDialog = null;
        }
    }

    private void uploadMedia() {
        TLRPC$TL_messages_uploadMedia tLRPC$TL_messages_uploadMedia = new TLRPC$TL_messages_uploadMedia();
        tLRPC$TL_messages_uploadMedia.peer = new TLRPC$TL_inputPeerSelf();
        TLRPC$TL_inputMediaUploadedDocument tLRPC$TL_inputMediaUploadedDocument = new TLRPC$TL_inputMediaUploadedDocument();
        tLRPC$TL_messages_uploadMedia.media = tLRPC$TL_inputMediaUploadedDocument;
        StickerUploader stickerUploader = this.stickerUploader;
        tLRPC$TL_inputMediaUploadedDocument.file = stickerUploader.file;
        if (stickerUploader.videoEditedInfo != null) {
            tLRPC$TL_inputMediaUploadedDocument.mime_type = "video/webm";
        } else {
            tLRPC$TL_inputMediaUploadedDocument.mime_type = "image/webp";
        }
        TLRPC$TL_documentAttributeSticker tLRPC$TL_documentAttributeSticker = new TLRPC$TL_documentAttributeSticker();
        tLRPC$TL_documentAttributeSticker.alt = this.stickerUploader.emoji;
        tLRPC$TL_documentAttributeSticker.stickerset = new TLRPC$TL_inputStickerSetEmpty();
        tLRPC$TL_messages_uploadMedia.media.attributes.add(tLRPC$TL_documentAttributeSticker);
        ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tLRPC$TL_messages_uploadMedia, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                StickerMakerView.this.lambda$uploadMedia$10(tLObject, tLRPC$TL_error);
            }
        }, 2);
    }

    public void lambda$uploadMedia$10(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickerMakerView.this.lambda$uploadMedia$9(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$uploadMedia$9(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messageMediaDocument) {
            TLRPC$TL_messageMediaDocument tLRPC$TL_messageMediaDocument = (TLRPC$TL_messageMediaDocument) tLObject;
            StickerUploader stickerUploader = this.stickerUploader;
            stickerUploader.tlInputStickerSetItem = MediaDataController.getInputStickerSetItem(tLRPC$TL_messageMediaDocument.document, stickerUploader.emoji);
            this.stickerUploader.mediaDocument = tLRPC$TL_messageMediaDocument;
            afterUploadingMedia();
            return;
        }
        hideLoadingDialog();
        showError(tLRPC$TL_error);
    }

    private void showError(TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.of((FrameLayout) getParent(), this.resourcesProvider).createErrorBulletin(tLRPC$TL_error.text).show();
        }
    }

    private void afterUploadingMedia() {
        final int i = UserConfig.selectedAccount;
        StickerUploader stickerUploader = this.stickerUploader;
        if (stickerUploader.replacedSticker != null) {
            TLRPC$TL_stickers_replaceSticker tLRPC$TL_stickers_replaceSticker = new TLRPC$TL_stickers_replaceSticker();
            tLRPC$TL_stickers_replaceSticker.sticker = MediaDataController.getInputStickerSetItem(this.stickerUploader.replacedSticker, "").document;
            tLRPC$TL_stickers_replaceSticker.new_sticker = this.stickerUploader.tlInputStickerSetItem;
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_stickers_replaceSticker, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StickerMakerView.this.lambda$afterUploadingMedia$13(i, tLObject, tLRPC$TL_error);
                }
            });
        } else if (stickerUploader.stickerPackName != null) {
            TLRPC$TL_stickers_createStickerSet tLRPC$TL_stickers_createStickerSet = new TLRPC$TL_stickers_createStickerSet();
            tLRPC$TL_stickers_createStickerSet.user_id = new TLRPC$TL_inputUserSelf();
            tLRPC$TL_stickers_createStickerSet.title = this.stickerUploader.stickerPackName.toString();
            tLRPC$TL_stickers_createStickerSet.short_name = "";
            tLRPC$TL_stickers_createStickerSet.stickers.add(this.stickerUploader.tlInputStickerSetItem);
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_stickers_createStickerSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StickerMakerView.this.lambda$afterUploadingMedia$16(i, tLObject, tLRPC$TL_error);
                }
            });
        } else if (stickerUploader.addToFavorite) {
            hideLoadingDialog();
            NotificationCenter.getInstance(i).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StickerMakerView.this.lambda$afterUploadingMedia$17();
                }
            }, 350L);
        } else if (stickerUploader.stickerSet != null) {
            TLRPC$TL_stickers_addStickerToSet tLRPC$TL_stickers_addStickerToSet = new TLRPC$TL_stickers_addStickerToSet();
            tLRPC$TL_stickers_addStickerToSet.stickerset = MediaDataController.getInputStickerSet(this.stickerUploader.stickerSet);
            tLRPC$TL_stickers_addStickerToSet.sticker = this.stickerUploader.tlInputStickerSetItem;
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_stickers_addStickerToSet, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    StickerMakerView.this.lambda$afterUploadingMedia$20(i, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$afterUploadingMedia$13(final int i, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickerMakerView.this.lambda$afterUploadingMedia$12(tLObject, i, tLRPC$TL_error);
            }
        });
    }

    public void lambda$afterUploadingMedia$12(final TLObject tLObject, int i, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            MediaDataController.getInstance(i).toggleStickerSet(null, tLObject, 2, null, false, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StickerMakerView.this.lambda$afterUploadingMedia$11(tLObject);
                }
            }, 250L);
        }
        showError(tLRPC$TL_error);
        hideLoadingDialog();
    }

    public void lambda$afterUploadingMedia$11(TLObject tLObject) {
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject, this.stickerUploader.mediaDocument.document);
    }

    public void lambda$afterUploadingMedia$16(final int i, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickerMakerView.this.lambda$afterUploadingMedia$15(tLObject, i, tLRPC$TL_error);
            }
        });
    }

    public void lambda$afterUploadingMedia$15(final TLObject tLObject, int i, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            MediaDataController.getInstance(i).toggleStickerSet(null, tLObject, 2, null, false, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StickerMakerView.this.lambda$afterUploadingMedia$14(tLObject);
                }
            }, 250L);
        }
        showError(tLRPC$TL_error);
        hideLoadingDialog();
    }

    public void lambda$afterUploadingMedia$14(TLObject tLObject) {
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject, this.stickerUploader.mediaDocument.document);
    }

    public void lambda$afterUploadingMedia$17() {
        MediaDataController.getInstance(UserConfig.selectedAccount).addRecentSticker(2, null, this.stickerUploader.mediaDocument.document, (int) (System.currentTimeMillis() / 1000), false);
    }

    public void lambda$afterUploadingMedia$20(final int i, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                StickerMakerView.this.lambda$afterUploadingMedia$19(tLObject, i, tLRPC$TL_error);
            }
        });
    }

    public void lambda$afterUploadingMedia$19(final TLObject tLObject, int i, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$TL_messages_stickerSet) {
            MediaDataController.getInstance(i).toggleStickerSet(null, tLObject, 2, null, false, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    StickerMakerView.this.lambda$afterUploadingMedia$18(tLObject);
                }
            }, 250L);
        }
        showError(tLRPC$TL_error);
        hideLoadingDialog();
    }

    public void lambda$afterUploadingMedia$18(TLObject tLObject) {
        NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, Boolean.FALSE, tLObject, this.stickerUploader.mediaDocument.document);
    }

    public static class StickerUploader {
        public boolean addToFavorite;
        public String emoji;
        public TLRPC$InputFile file;
        public String finalPath;
        public TLRPC$TL_messageMediaDocument mediaDocument;
        public MessageObject messageObject;
        public TLRPC$Document replacedSticker;
        public CharSequence stickerPackName;
        public TLRPC$StickerSet stickerSet;
        public TLRPC$TL_inputStickerSetItem tlInputStickerSetItem;
        public VideoEditedInfo videoEditedInfo;

        private StickerUploader() {
        }
    }

    public static class Point extends android.graphics.Point {
        public Point(int i, int i2, float f) {
            super((int) (i * f), (int) (i2 * f));
        }
    }
}

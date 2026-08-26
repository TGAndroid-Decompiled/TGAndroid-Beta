package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.PhotoEditRadioCell;
import org.telegram.ui.Cells.PhotoEditToolCell;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.StoryRecorder$$ExternalSyntheticLambda7;

public final class PhotoFilterView extends FrameLayout implements FilterShaders.FilterShadersDelegate, StoryRecorder.Touchable {
    public final Bitmap bitmapMask;
    public final Bitmap bitmapToEdit;
    public float blurAngle;
    public final PhotoFilterBlurControl blurControl;
    public float blurExcludeBlurSize;
    public PointF blurExcludePoint;
    public float blurExcludeSize;
    public final ImageView blurItem;
    public final FrameLayout blurLayout;
    public final TextView blurLinearButton;
    public final TextView blurOffButton;
    public final TextView blurRadialButton;
    public int blurType;
    public final TextView cancelTextView;
    public final int contrastTool;
    public float contrastValue;
    public final ImageView curveItem;
    public final FrameLayout curveLayout;
    public final RadioButton[] curveRadioButton;
    public final PhotoFilterCurvesControl curvesControl;
    public final CurvesToolValue curvesToolValue;
    public final TextView doneTextView;
    public FilterGLThread eglThread;
    public final int enhanceTool;
    public float enhanceValue;
    public final int exposureTool;
    public float exposureValue;
    public final int fadeTool;
    public float fadeValue;
    public boolean filtersEmpty;
    public int gradientBottom;
    public int gradientTop;
    public final int grainTool;
    public float grainValue;
    public final int highlightsTool;
    public float highlightsValue;
    public final boolean inBubbleMode;
    public final boolean isMirrored;
    public MediaController.SavedFilterState lastState;
    public final Matrix maskMatrix;
    public final Paint maskPaint;
    public final Rect maskRect;
    public final int orientation;
    public final boolean ownLayout;
    public final boolean ownsTextureView;
    public final PaintingOverlay paintingOverlay;
    public final ChatAttachAlert.AnonymousClass15 recyclerListView;
    public final Theme.ResourcesProvider resourcesProvider;
    public final int rowsCount;
    public final int saturationTool;
    public float saturationValue;
    public int selectedTool;
    public final int shadowsTool;
    public float shadowsValue;
    public final int sharpenTool;
    public float sharpenValue;
    public boolean showOriginal;
    public final int softenSkinTool;
    public float softenSkinValue;
    public final TextureView textureView;
    public int tintHighlightsColor;
    public final int tintHighlightsTool;
    public int tintShadowsColor;
    public final int tintShadowsTool;
    public final FrameLayout toolsView;
    public final ImageView tuneItem;
    public final int vignetteTool;
    public float vignetteValue;
    public final int warmthTool;
    public float warmthValue;

    public final class AnonymousClass2 implements TextureView.SurfaceTextureListener {
        public final BlurringShader.BlurManager val$blurManager;
        public final boolean val$ownLayout;

        public AnonymousClass2(boolean z, BlurringShader.BlurManager blurManager) {
            this.val$ownLayout = z;
            this.val$blurManager = blurManager;
        }

        @Override
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            PhotoFilterView photoFilterView = PhotoFilterView.this;
            if (photoFilterView.eglThread != null || surfaceTexture == null) {
                return;
            }
            FilterGLThread filterGLThread = new FilterGLThread(surfaceTexture, photoFilterView.bitmapToEdit, photoFilterView.orientation, photoFilterView.isMirrored, this.val$ownLayout, this.val$blurManager, i, i2);
            photoFilterView.eglThread = filterGLThread;
            if (!this.val$ownLayout) {
                filterGLThread.updateUiBlurGradient(photoFilterView.gradientTop, photoFilterView.gradientBottom);
                FilterGLThread filterGLThread2 = photoFilterView.eglThread;
                TextureView textureView = photoFilterView.textureView;
                Matrix transform = textureView.getTransform(null);
                int width = textureView.getWidth();
                int height = textureView.getHeight();
                BlurringShader blurringShader = filterGLThread2.uiBlur;
                if (blurringShader != null) {
                    Matrix matrix = blurringShader.iMatrix;
                    transform.invert(matrix);
                    float f = width;
                    float f2 = height;
                    matrix.preScale(f, f2);
                    matrix.postScale(1.0f / f, 1.0f / f2);
                    blurringShader.updateTransform(matrix);
                    filterGLThread2.requestRender(false, false, false);
                }
            }
            photoFilterView.eglThread.setFilterGLThreadDelegate(photoFilterView);
            FilterGLThread filterGLThread3 = photoFilterView.eglThread;
            filterGLThread3.getClass();
            filterGLThread3.postRunnable(new FilterGLThread$$ExternalSyntheticLambda0(filterGLThread3, i, i2, 1));
            photoFilterView.eglThread.requestRender(true, true, false);
        }

        @Override
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            PhotoFilterView photoFilterView = PhotoFilterView.this;
            FilterGLThread filterGLThread = photoFilterView.eglThread;
            if (filterGLThread == null) {
                return true;
            }
            filterGLThread.shutdown();
            photoFilterView.eglThread = null;
            return true;
        }

        @Override
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            PhotoFilterView photoFilterView = PhotoFilterView.this;
            FilterGLThread filterGLThread = photoFilterView.eglThread;
            if (filterGLThread != null) {
                filterGLThread.postRunnable(new FilterGLThread$$ExternalSyntheticLambda0(filterGLThread, i, i2, 1));
                photoFilterView.eglThread.requestRender(false, true, false);
                photoFilterView.eglThread.postRunnable(new PasscodeView$9$$ExternalSyntheticLambda0(this, 5));
            }
        }

        @Override
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public final class CurvesToolValue {
        public int activeType;
        public final ByteBuffer curveBuffer;
        public final CurvesValue luminanceCurve = new CurvesValue();
        public final CurvesValue redCurve = new CurvesValue();
        public final CurvesValue greenCurve = new CurvesValue();
        public final CurvesValue blueCurve = new CurvesValue();

        public CurvesToolValue() {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(800);
            this.curveBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        }

        public final void fillBuffer() {
            ByteBuffer byteBuffer = this.curveBuffer;
            byteBuffer.position(0);
            CurvesValue curvesValue = this.luminanceCurve;
            if (curvesValue.cachedDataPoints == null) {
                curvesValue.interpolateCurve();
            }
            float[] fArr = curvesValue.cachedDataPoints;
            CurvesValue curvesValue2 = this.redCurve;
            if (curvesValue2.cachedDataPoints == null) {
                curvesValue2.interpolateCurve();
            }
            float[] fArr2 = curvesValue2.cachedDataPoints;
            CurvesValue curvesValue3 = this.greenCurve;
            if (curvesValue3.cachedDataPoints == null) {
                curvesValue3.interpolateCurve();
            }
            float[] fArr3 = curvesValue3.cachedDataPoints;
            CurvesValue curvesValue4 = this.blueCurve;
            if (curvesValue4.cachedDataPoints == null) {
                curvesValue4.interpolateCurve();
            }
            float[] fArr4 = curvesValue4.cachedDataPoints;
            for (int i = 0; i < 200; i++) {
                byteBuffer.put((byte) (fArr2[i] * 255.0f));
                byteBuffer.put((byte) (fArr3[i] * 255.0f));
                byteBuffer.put((byte) (fArr4[i] * 255.0f));
                byteBuffer.put((byte) (fArr[i] * 255.0f));
            }
            byteBuffer.position(0);
        }

        public final boolean shouldBeSkipped() {
            return this.luminanceCurve.isDefault() && this.redCurve.isDefault() && this.greenCurve.isDefault() && this.blueCurve.isDefault();
        }
    }

    public final class CurvesValue {
        public float[] cachedDataPoints;
        public float blacksLevel = 0.0f;
        public float shadowsLevel = 25.0f;
        public float midtonesLevel = 50.0f;
        public float highlightsLevel = 75.0f;
        public float whitesLevel = 100.0f;

        public final float[] interpolateCurve() {
            float f = this.blacksLevel / 100.0f;
            float f2 = this.shadowsLevel / 100.0f;
            float f3 = this.midtonesLevel / 100.0f;
            float f4 = this.highlightsLevel / 100.0f;
            float f5 = this.whitesLevel / 100.0f;
            int i = 1;
            int i2 = 2;
            int i3 = 5;
            float[] fArr = {-0.001f, f, 0.0f, f, 0.25f, f2, 0.5f, f3, 0.75f, f4, 1.0f, f5, 1.001f, f5};
            ArrayList arrayList = new ArrayList(100);
            ArrayList arrayList2 = new ArrayList(100);
            arrayList2.add(Float.valueOf(fArr[0]));
            arrayList2.add(Float.valueOf(fArr[1]));
            int i4 = 1;
            while (i4 < i3) {
                int i5 = (i4 - 1) * 2;
                float f6 = fArr[i5];
                float f7 = fArr[i5 + i];
                int i6 = i4 * 2;
                float f8 = fArr[i6];
                float f9 = fArr[i6 + 1];
                int i7 = i4 + 1;
                int i8 = i7 * 2;
                float f10 = fArr[i8];
                float f11 = fArr[i8 + 1];
                int i9 = (i4 + i2) * 2;
                float f12 = fArr[i9];
                float f13 = fArr[i9 + i];
                while (i < 100) {
                    float f14 = i * 0.01f;
                    float f15 = f14 * f14;
                    float f16 = f15 * f14;
                    float fM = ((((((f8 * 3.0f) - f6) - (f10 * 3.0f)) + f12) * f16) + ((((f10 * 4.0f) + ((f6 * 2.0f) - (f8 * 5.0f))) - f12) * f15) + DiffUtil.m(f10, f6, f14, f8 * 2.0f)) * 0.5f;
                    float fMax = Math.max(0.0f, Math.min(1.0f, ((((((f9 * 3.0f) - f7) - (f11 * 3.0f)) + f13) * f16) + ((((4.0f * f11) + ((2.0f * f7) - (5.0f * f9))) - f13) * f15) + DiffUtil.m(f11, f7, f14, f9 * 2.0f)) * 0.5f));
                    if (fM > f6) {
                        arrayList2.add(Float.valueOf(fM));
                        arrayList2.add(Float.valueOf(fMax));
                    }
                    if ((i - 1) % 2 == 0) {
                        arrayList.add(Float.valueOf(fMax));
                    }
                    i++;
                }
                arrayList2.add(Float.valueOf(f10));
                arrayList2.add(Float.valueOf(f11));
                i4 = i7;
                i3 = 5;
                i = 1;
                i2 = 2;
            }
            arrayList2.add(Float.valueOf(fArr[12]));
            arrayList2.add(Float.valueOf(fArr[13]));
            this.cachedDataPoints = new float[arrayList.size()];
            int i10 = 0;
            while (true) {
                float[] fArr2 = this.cachedDataPoints;
                if (i10 >= fArr2.length) {
                    break;
                }
                fArr2[i10] = ((Float) arrayList.get(i10)).floatValue();
                i10++;
            }
            int size = arrayList2.size();
            float[] fArr3 = new float[size];
            for (int i11 = 0; i11 < size; i11++) {
                fArr3[i11] = ((Float) arrayList2.get(i11)).floatValue();
            }
            return fArr3;
        }

        public final boolean isDefault() {
            return ((double) Math.abs(this.blacksLevel - 0.0f)) < 1.0E-5d && ((double) Math.abs(this.shadowsLevel - 25.0f)) < 1.0E-5d && ((double) Math.abs(this.midtonesLevel - 50.0f)) < 1.0E-5d && ((double) Math.abs(this.highlightsLevel - 75.0f)) < 1.0E-5d && ((double) Math.abs(this.whitesLevel - 100.0f)) < 1.0E-5d;
        }
    }

    public final class EnhanceView extends View {
        public boolean allowTouch;
        public StaticLayout bottomText;
        public float bottomTextLeft;
        public final TextPaint bottomTextPaint;
        public float bottomTextWidth;
        public long downTime;
        public PhotoFilterView filterView;
        public final PasscodeView$9$$ExternalSyntheticLambda0 hide;
        public float lastTouchX;
        public float lastTouchY;
        public float lastVibrateValue;
        public final StoryRecorder$$ExternalSyntheticLambda7 requestFilterView;
        public final AnimatedFloat showT;
        public boolean shown;
        public StaticLayout topText;
        public float topTextLeft;
        public final TextPaint topTextPaint;
        public float topTextWidth;
        public boolean tracking;

        public EnhanceView(Activity activity, StoryRecorder$$ExternalSyntheticLambda7 storyRecorder$$ExternalSyntheticLambda7) {
            super(activity);
            this.topTextPaint = new TextPaint(1);
            this.bottomTextPaint = new TextPaint(1);
            this.showT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.hide = new PasscodeView$9$$ExternalSyntheticLambda0(this, 6);
            this.requestFilterView = storyRecorder$$ExternalSyntheticLambda7;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f = this.showT.set(this.shown);
            if (f <= 0.0f || this.topText == null || this.bottomText == null) {
                return;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (f * 255.0f), 31);
            canvas.save();
            canvas.translate(((getWidth() - this.topTextWidth) / 2.0f) - this.topTextLeft, getHeight() * 0.22f);
            this.topText.draw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(((getWidth() - this.bottomTextWidth) / 2.0f) - this.bottomTextLeft, (getHeight() * 0.22f) + AndroidUtilities.dp(60.0f));
            this.bottomText.draw(canvas);
            canvas.restore();
            canvas.restore();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            TextPaint textPaint = this.topTextPaint;
            textPaint.setColor(-1);
            textPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
            textPaint.setTextSize(AndroidUtilities.dp(34.0f));
            TextPaint textPaint2 = this.bottomTextPaint;
            textPaint2.setColor(-1);
            textPaint2.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
            textPaint2.setTextSize(AndroidUtilities.dp(58.0f));
            if (this.topText == null) {
                StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), textPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.topText = staticLayout;
                this.topTextWidth = staticLayout.getLineCount() > 0 ? this.topText.getLineWidth(0) : 0.0f;
                this.topTextLeft = this.topText.getLineCount() > 0 ? this.topText.getLineLeft(0) : 0.0f;
            }
        }

        public void setAllowTouch(boolean z) {
            this.allowTouch = z;
        }

        public void setFilterView(PhotoFilterView photoFilterView) {
            this.filterView = photoFilterView;
        }
    }

    public final class ToolsAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ToolsAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return PhotoFilterView.this.rowsCount;
        }

        @Override
        public final long getItemId(int i) {
            return i;
        }

        @Override
        public final int getItemViewType(int i) {
            PhotoFilterView photoFilterView = PhotoFilterView.this;
            return (i == photoFilterView.tintShadowsTool || i == photoFilterView.tintHighlightsTool) ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = viewHolder.mItemViewType;
            PhotoFilterView photoFilterView = PhotoFilterView.this;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                PhotoEditRadioCell photoEditRadioCell = (PhotoEditRadioCell) view;
                photoEditRadioCell.setTag(Integer.valueOf(i));
                int i3 = photoFilterView.tintShadowsTool;
                TextView textView = photoEditRadioCell.nameTextView;
                if (i == i3) {
                    String string = LocaleController.getString(R.string.TintShadows);
                    photoEditRadioCell.currentColor = photoFilterView.tintShadowsColor;
                    textView.setText(string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase());
                    photoEditRadioCell.updateSelectedTintButton(false);
                    return;
                }
                if (i == photoFilterView.tintHighlightsTool) {
                    String string2 = LocaleController.getString(R.string.TintHighlights);
                    photoEditRadioCell.currentColor = photoFilterView.tintHighlightsColor;
                    textView.setText(string2.substring(0, 1).toUpperCase() + string2.substring(1).toLowerCase());
                    photoEditRadioCell.updateSelectedTintButton(false);
                    return;
                }
                return;
            }
            PhotoEditToolCell photoEditToolCell = (PhotoEditToolCell) view;
            photoEditToolCell.setTag(Integer.valueOf(i));
            if (i == photoFilterView.enhanceTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Enhance), 0, photoFilterView.enhanceValue);
                return;
            }
            if (i == photoFilterView.highlightsTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Highlights), -100, photoFilterView.highlightsValue);
                return;
            }
            if (i == photoFilterView.contrastTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Contrast), -100, photoFilterView.contrastValue);
                return;
            }
            if (i == photoFilterView.exposureTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Exposure), -100, photoFilterView.exposureValue);
                return;
            }
            if (i == photoFilterView.warmthTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Warmth), -100, photoFilterView.warmthValue);
                return;
            }
            if (i == photoFilterView.saturationTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Saturation), -100, photoFilterView.saturationValue);
                return;
            }
            if (i == photoFilterView.vignetteTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Vignette), 0, photoFilterView.vignetteValue);
                return;
            }
            if (i == photoFilterView.shadowsTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Shadows), -100, photoFilterView.shadowsValue);
                return;
            }
            if (i == photoFilterView.grainTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Grain), 0, photoFilterView.grainValue);
                return;
            }
            if (i == photoFilterView.sharpenTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Sharpen), 0, photoFilterView.sharpenValue);
            } else if (i == photoFilterView.fadeTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Fade), 0, photoFilterView.fadeValue);
            } else if (i == photoFilterView.softenSkinTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.SoftenSkin), 0, photoFilterView.softenSkinValue);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            Context context = this.mContext;
            if (i == 0) {
                PhotoEditToolCell photoEditToolCell = new PhotoEditToolCell(context, PhotoFilterView.this.resourcesProvider);
                photoEditToolCell.setSeekBarDelegate(new ProfileGooeyView$$ExternalSyntheticLambda0(this, 13));
                view = photoEditToolCell;
            } else {
                PhotoEditRadioCell photoEditRadioCell = new PhotoEditRadioCell(context);
                photoEditRadioCell.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 12));
                view = photoEditRadioCell;
            }
            return new RecyclerListView.Holder(view);
        }
    }

    public PhotoFilterView(Context context, VideoEditTextureView videoEditTextureView, Bitmap bitmap, Bitmap bitmap2, int i, MediaController.SavedFilterState savedFilterState, PaintingOverlay paintingOverlay, int i2, boolean z, boolean z2, BlurringShader.BlurManager blurManager, Theme.ResourcesProvider resourcesProvider) {
        float f;
        super(context);
        this.curveRadioButton = new RadioButton[4];
        this.maskRect = new Rect();
        this.maskMatrix = new Matrix();
        this.maskPaint = new Paint(2);
        this.ownLayout = z2;
        this.resourcesProvider = resourcesProvider;
        this.inBubbleMode = context instanceof BubbleActivity;
        this.paintingOverlay = paintingOverlay;
        this.isMirrored = z;
        this.rowsCount = 0;
        if (i2 == 1) {
            this.rowsCount = 1;
            this.softenSkinTool = 0;
        } else if (i2 == 0) {
            this.softenSkinTool = -1;
        }
        int i3 = this.rowsCount;
        this.enhanceTool = i3;
        this.exposureTool = i3 + 1;
        this.contrastTool = i3 + 2;
        this.saturationTool = i3 + 3;
        this.warmthTool = i3 + 4;
        this.fadeTool = i3 + 5;
        this.highlightsTool = i3 + 6;
        this.shadowsTool = i3 + 7;
        int i4 = i3 + 9;
        this.rowsCount = i4;
        this.vignetteTool = i3 + 8;
        if (i2 == 2) {
            this.rowsCount = i3 + 10;
            this.softenSkinTool = i4;
        }
        if (videoEditTextureView == null) {
            int i5 = this.rowsCount;
            this.rowsCount = i5 + 1;
            this.grainTool = i5;
        } else {
            this.grainTool = -1;
        }
        int i6 = this.rowsCount;
        this.sharpenTool = i6;
        this.tintShadowsTool = i6 + 1;
        this.rowsCount = i6 + 3;
        this.tintHighlightsTool = i6 + 2;
        if (savedFilterState != null) {
            this.enhanceValue = savedFilterState.enhanceValue;
            this.softenSkinValue = savedFilterState.softenSkinValue;
            this.exposureValue = savedFilterState.exposureValue;
            this.contrastValue = savedFilterState.contrastValue;
            this.warmthValue = savedFilterState.warmthValue;
            this.saturationValue = savedFilterState.saturationValue;
            this.fadeValue = savedFilterState.fadeValue;
            this.tintShadowsColor = savedFilterState.tintShadowsColor;
            this.tintHighlightsColor = savedFilterState.tintHighlightsColor;
            this.highlightsValue = savedFilterState.highlightsValue;
            this.shadowsValue = savedFilterState.shadowsValue;
            this.vignetteValue = savedFilterState.vignetteValue;
            this.grainValue = savedFilterState.grainValue;
            this.blurType = savedFilterState.blurType;
            this.sharpenValue = savedFilterState.sharpenValue;
            this.curvesToolValue = savedFilterState.curvesToolValue;
            this.blurExcludeSize = savedFilterState.blurExcludeSize;
            this.blurExcludePoint = savedFilterState.blurExcludePoint;
            this.blurExcludeBlurSize = savedFilterState.blurExcludeBlurSize;
            this.filtersEmpty = savedFilterState.isEmpty();
            this.blurAngle = savedFilterState.blurAngle;
            this.lastState = savedFilterState;
        } else {
            this.curvesToolValue = new CurvesToolValue();
            this.blurExcludeSize = 0.35f;
            this.blurExcludePoint = new PointF(0.5f, 0.5f);
            this.blurExcludeBlurSize = 0.15f;
            this.blurAngle = 1.5707964f;
            this.filtersEmpty = true;
        }
        this.bitmapToEdit = bitmap;
        this.bitmapMask = bitmap2;
        this.orientation = i;
        if (videoEditTextureView != null) {
            this.textureView = videoEditTextureView;
            videoEditTextureView.setDelegate(new PhotoFilterView$$ExternalSyntheticLambda0(this));
        } else {
            this.ownsTextureView = true;
            TextureView textureView = new TextureView(context) {
                @Override
                public final void onMeasure(int i7, int i8) {
                    View.MeasureSpec.getSize(i7);
                    super.onMeasure(i7, i8);
                }

                @Override
                public final void setTransform(Matrix matrix) {
                    super.setTransform(matrix);
                    FilterGLThread filterGLThread = PhotoFilterView.this.eglThread;
                    if (filterGLThread != null) {
                        int width = getWidth();
                        int height = getHeight();
                        BlurringShader blurringShader = filterGLThread.uiBlur;
                        if (blurringShader == null) {
                            return;
                        }
                        Matrix matrix2 = blurringShader.iMatrix;
                        matrix.invert(matrix2);
                        float f2 = width;
                        float f3 = height;
                        matrix2.preScale(f2, f3);
                        matrix2.postScale(1.0f / f2, 1.0f / f3);
                        blurringShader.updateTransform(matrix2);
                        filterGLThread.requestRender(false, false, false);
                    }
                }
            };
            this.textureView = textureView;
            if (z2) {
                addView(textureView, LayoutHelper.createFrame(-1, -1, 51));
            }
            textureView.setVisibility(4);
            textureView.setSurfaceTextureListener(new AnonymousClass2(z2, blurManager));
        }
        PhotoFilterBlurControl photoFilterBlurControl = new PhotoFilterBlurControl(context);
        this.blurControl = photoFilterBlurControl;
        photoFilterBlurControl.setVisibility(4);
        if (z2) {
            addView(photoFilterBlurControl, LayoutHelper.createFrame(-1, -1, 51));
        }
        photoFilterBlurControl.setDelegate(new PhotoFilterView$$ExternalSyntheticLambda0(this));
        PhotoFilterCurvesControl photoFilterCurvesControl = new PhotoFilterCurvesControl(context, this.curvesToolValue);
        this.curvesControl = photoFilterCurvesControl;
        photoFilterCurvesControl.setDelegate(new PhotoFilterView$$ExternalSyntheticLambda0(this));
        photoFilterCurvesControl.setVisibility(4);
        if (z2) {
            addView(photoFilterCurvesControl, LayoutHelper.createFrame(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.toolsView = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, (!z2 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        frameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, 48, 83));
        TextView textView = new TextView(context);
        this.cancelTextView = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(Theme.createSelectorDrawable(-12763843, 0, -1));
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView, LayoutHelper.createFrame(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.doneTextView = textView2;
        textView2.setTextSize(1, 14.0f);
        int i7 = Theme.key_chat_editMediaButton;
        textView2.setTextColor(Theme.getColor(i7, resourcesProvider));
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(Theme.createSelectorDrawable(-12763843, 0, -1));
        textView2.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView2.setText(LocaleController.getString(R.string.Done).toUpperCase());
        textView2.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, LayoutHelper.createFrame(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.tuneItem = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_photo_settings);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i7, resourcesProvider), PorterDuff.Mode.MULTIPLY));
        imageView.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039, 1, -1));
        linearLayout.addView(imageView, LayoutHelper.createLinear(56, 48));
        final int i8 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        PhotoFilterView photoFilterView = this.f$0;
                        photoFilterView.selectedTool = 0;
                        photoFilterView.tuneItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView.switchMode();
                        break;
                    case 1:
                        PhotoFilterView photoFilterView2 = this.f$0;
                        photoFilterView2.selectedTool = 1;
                        photoFilterView2.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.blurItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView2.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView2.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.switchMode();
                        break;
                    case 2:
                        PhotoFilterView photoFilterView3 = this.f$0;
                        photoFilterView3.selectedTool = 2;
                        photoFilterView3.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.curveItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView3.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView3.switchMode();
                        break;
                    case 3:
                        PhotoFilterView photoFilterView4 = this.f$0;
                        photoFilterView4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        photoFilterView4.curvesToolValue.activeType = iIntValue;
                        int i9 = 0;
                        while (i9 < 4) {
                            photoFilterView4.curveRadioButton[i9].setChecked(i9 == iIntValue, true);
                            i9++;
                        }
                        photoFilterView4.curvesControl.invalidate();
                        break;
                    case 4:
                        PhotoFilterView photoFilterView5 = this.f$0;
                        photoFilterView5.blurType = 0;
                        photoFilterView5.updateSelectedBlurType();
                        photoFilterView5.blurControl.setVisibility(4);
                        FilterGLThread filterGLThread = photoFilterView5.eglThread;
                        if (filterGLThread != null) {
                            filterGLThread.requestRender(false, false, false);
                        }
                        break;
                    case 5:
                        PhotoFilterView photoFilterView6 = this.f$0;
                        photoFilterView6.blurType = 1;
                        photoFilterView6.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl2 = photoFilterView6.blurControl;
                        photoFilterBlurControl2.setVisibility(0);
                        photoFilterBlurControl2.setType(1);
                        FilterGLThread filterGLThread2 = photoFilterView6.eglThread;
                        if (filterGLThread2 != null) {
                            filterGLThread2.requestRender(false, false, false);
                        }
                        break;
                    default:
                        PhotoFilterView photoFilterView7 = this.f$0;
                        photoFilterView7.blurType = 2;
                        photoFilterView7.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl3 = photoFilterView7.blurControl;
                        photoFilterBlurControl3.setVisibility(0);
                        photoFilterBlurControl3.setType(0);
                        FilterGLThread filterGLThread3 = photoFilterView7.eglThread;
                        if (filterGLThread3 != null) {
                            filterGLThread3.requestRender(false, false, false);
                        }
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.blurItem = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_photo_blur);
        imageView2.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039, 1, -1));
        linearLayout.addView(imageView2, LayoutHelper.createLinear(56, 48));
        final int i9 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        PhotoFilterView photoFilterView = this.f$0;
                        photoFilterView.selectedTool = 0;
                        photoFilterView.tuneItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView.switchMode();
                        break;
                    case 1:
                        PhotoFilterView photoFilterView2 = this.f$0;
                        photoFilterView2.selectedTool = 1;
                        photoFilterView2.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.blurItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView2.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView2.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.switchMode();
                        break;
                    case 2:
                        PhotoFilterView photoFilterView3 = this.f$0;
                        photoFilterView3.selectedTool = 2;
                        photoFilterView3.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.curveItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView3.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView3.switchMode();
                        break;
                    case 3:
                        PhotoFilterView photoFilterView4 = this.f$0;
                        photoFilterView4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        photoFilterView4.curvesToolValue.activeType = iIntValue;
                        int i10 = 0;
                        while (i10 < 4) {
                            photoFilterView4.curveRadioButton[i10].setChecked(i10 == iIntValue, true);
                            i10++;
                        }
                        photoFilterView4.curvesControl.invalidate();
                        break;
                    case 4:
                        PhotoFilterView photoFilterView5 = this.f$0;
                        photoFilterView5.blurType = 0;
                        photoFilterView5.updateSelectedBlurType();
                        photoFilterView5.blurControl.setVisibility(4);
                        FilterGLThread filterGLThread = photoFilterView5.eglThread;
                        if (filterGLThread != null) {
                            filterGLThread.requestRender(false, false, false);
                        }
                        break;
                    case 5:
                        PhotoFilterView photoFilterView6 = this.f$0;
                        photoFilterView6.blurType = 1;
                        photoFilterView6.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl2 = photoFilterView6.blurControl;
                        photoFilterBlurControl2.setVisibility(0);
                        photoFilterBlurControl2.setType(1);
                        FilterGLThread filterGLThread2 = photoFilterView6.eglThread;
                        if (filterGLThread2 != null) {
                            filterGLThread2.requestRender(false, false, false);
                        }
                        break;
                    default:
                        PhotoFilterView photoFilterView7 = this.f$0;
                        photoFilterView7.blurType = 2;
                        photoFilterView7.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl3 = photoFilterView7.blurControl;
                        photoFilterBlurControl3.setVisibility(0);
                        photoFilterBlurControl3.setType(0);
                        FilterGLThread filterGLThread3 = photoFilterView7.eglThread;
                        if (filterGLThread3 != null) {
                            filterGLThread3.requestRender(false, false, false);
                        }
                        break;
                }
            }
        });
        if (videoEditTextureView != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.curveItem = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(R.drawable.msg_photo_curve);
        imageView3.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039, 1, -1));
        linearLayout.addView(imageView3, LayoutHelper.createLinear(56, 48));
        final int i10 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        PhotoFilterView photoFilterView = this.f$0;
                        photoFilterView.selectedTool = 0;
                        photoFilterView.tuneItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView.switchMode();
                        break;
                    case 1:
                        PhotoFilterView photoFilterView2 = this.f$0;
                        photoFilterView2.selectedTool = 1;
                        photoFilterView2.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.blurItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView2.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView2.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.switchMode();
                        break;
                    case 2:
                        PhotoFilterView photoFilterView3 = this.f$0;
                        photoFilterView3.selectedTool = 2;
                        photoFilterView3.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.curveItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView3.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView3.switchMode();
                        break;
                    case 3:
                        PhotoFilterView photoFilterView4 = this.f$0;
                        photoFilterView4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        photoFilterView4.curvesToolValue.activeType = iIntValue;
                        int i11 = 0;
                        while (i11 < 4) {
                            photoFilterView4.curveRadioButton[i11].setChecked(i11 == iIntValue, true);
                            i11++;
                        }
                        photoFilterView4.curvesControl.invalidate();
                        break;
                    case 4:
                        PhotoFilterView photoFilterView5 = this.f$0;
                        photoFilterView5.blurType = 0;
                        photoFilterView5.updateSelectedBlurType();
                        photoFilterView5.blurControl.setVisibility(4);
                        FilterGLThread filterGLThread = photoFilterView5.eglThread;
                        if (filterGLThread != null) {
                            filterGLThread.requestRender(false, false, false);
                        }
                        break;
                    case 5:
                        PhotoFilterView photoFilterView6 = this.f$0;
                        photoFilterView6.blurType = 1;
                        photoFilterView6.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl2 = photoFilterView6.blurControl;
                        photoFilterBlurControl2.setVisibility(0);
                        photoFilterBlurControl2.setType(1);
                        FilterGLThread filterGLThread2 = photoFilterView6.eglThread;
                        if (filterGLThread2 != null) {
                            filterGLThread2.requestRender(false, false, false);
                        }
                        break;
                    default:
                        PhotoFilterView photoFilterView7 = this.f$0;
                        photoFilterView7.blurType = 2;
                        photoFilterView7.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl3 = photoFilterView7.blurControl;
                        photoFilterBlurControl3.setVisibility(0);
                        photoFilterBlurControl3.setType(0);
                        FilterGLThread filterGLThread3 = photoFilterView7.eglThread;
                        if (filterGLThread3 != null) {
                            filterGLThread3.requestRender(false, false, false);
                        }
                        break;
                }
            }
        });
        ChatAttachAlert.AnonymousClass15 anonymousClass15 = new ChatAttachAlert.AnonymousClass15(context, 1);
        this.recyclerListView = anonymousClass15;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.setOrientation(1);
        anonymousClass15.setLayoutManager(linearLayoutManager);
        anonymousClass15.setClipToPadding(false);
        anonymousClass15.setOverScrollMode(2);
        anonymousClass15.setAdapter(new ToolsAdapter(context));
        frameLayout.addView(anonymousClass15, LayoutHelper.createFrame(-1, (!z2 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.curveLayout = frameLayout3;
        frameLayout3.setVisibility(4);
        frameLayout.addView(frameLayout3, LayoutHelper.createFrame(-1, 78.0f, 1, 0.0f, (!z2 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout3.addView(linearLayout2, LayoutHelper.createFrame(-2, -2, 1));
        for (int i11 = 0; i11 < 4; i11++) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i11));
            this.curveRadioButton[i11] = new RadioButton(context);
            this.curveRadioButton[i11].setSize(AndroidUtilities.dp(20.0f));
            frameLayout4.addView(this.curveRadioButton[i11], LayoutHelper.createFrame(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i11 == 0) {
                String string = LocaleController.getString(R.string.CurvesAll);
                textView3.setText(string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                RadioButton radioButton = this.curveRadioButton[i11];
                radioButton.color = -1;
                radioButton.checkedColor = -1;
                radioButton.invalidate();
            } else {
                if (i11 == 1) {
                    String string2 = LocaleController.getString(R.string.CurvesRed);
                    textView3.setText(string2.substring(0, 1).toUpperCase() + string2.substring(1).toLowerCase());
                    textView3.setTextColor(-1684147);
                    RadioButton radioButton2 = this.curveRadioButton[i11];
                    radioButton2.color = -1684147;
                    radioButton2.checkedColor = -1684147;
                    radioButton2.invalidate();
                } else if (i11 == 2) {
                    String string3 = LocaleController.getString(R.string.CurvesGreen);
                    textView3.setText(string3.substring(0, 1).toUpperCase() + string3.substring(1).toLowerCase());
                    textView3.setTextColor(-10831009);
                    RadioButton radioButton3 = this.curveRadioButton[i11];
                    radioButton3.color = -10831009;
                    radioButton3.checkedColor = -10831009;
                    radioButton3.invalidate();
                } else if (i11 == 3) {
                    String string4 = LocaleController.getString(R.string.CurvesBlue);
                    textView3.setText(string4.substring(0, 1).toUpperCase() + string4.substring(1).toLowerCase());
                    textView3.setTextColor(-12734994);
                    RadioButton radioButton4 = this.curveRadioButton[i11];
                    radioButton4.color = -12734994;
                    radioButton4.checkedColor = -12734994;
                    radioButton4.invalidate();
                }
                frameLayout4.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
                if (i11 == 0) {
                    f = 0.0f;
                } else {
                    f = 30.0f;
                }
                linearLayout2.addView(frameLayout4, LayoutHelper.createLinear(f, 0.0f, 0.0f, 0.0f, -2, -2));
                final int i12 = 3;
                frameLayout4.setOnClickListener(new View.OnClickListener(this) {
                    public final PhotoFilterView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i12) {
                            case 0:
                                PhotoFilterView photoFilterView = this.f$0;
                                photoFilterView.selectedTool = 0;
                                photoFilterView.tuneItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                                photoFilterView.blurItem.setColorFilter((ColorFilter) null);
                                photoFilterView.curveItem.setColorFilter((ColorFilter) null);
                                photoFilterView.switchMode();
                                break;
                            case 1:
                                PhotoFilterView photoFilterView2 = this.f$0;
                                photoFilterView2.selectedTool = 1;
                                photoFilterView2.tuneItem.setColorFilter((ColorFilter) null);
                                photoFilterView2.blurItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView2.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                                photoFilterView2.curveItem.setColorFilter((ColorFilter) null);
                                photoFilterView2.switchMode();
                                break;
                            case 2:
                                PhotoFilterView photoFilterView3 = this.f$0;
                                photoFilterView3.selectedTool = 2;
                                photoFilterView3.tuneItem.setColorFilter((ColorFilter) null);
                                photoFilterView3.blurItem.setColorFilter((ColorFilter) null);
                                photoFilterView3.curveItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView3.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                                photoFilterView3.switchMode();
                                break;
                            case 3:
                                PhotoFilterView photoFilterView4 = this.f$0;
                                photoFilterView4.getClass();
                                int iIntValue = ((Integer) view.getTag()).intValue();
                                photoFilterView4.curvesToolValue.activeType = iIntValue;
                                int i13 = 0;
                                while (i13 < 4) {
                                    photoFilterView4.curveRadioButton[i13].setChecked(i13 == iIntValue, true);
                                    i13++;
                                }
                                photoFilterView4.curvesControl.invalidate();
                                break;
                            case 4:
                                PhotoFilterView photoFilterView5 = this.f$0;
                                photoFilterView5.blurType = 0;
                                photoFilterView5.updateSelectedBlurType();
                                photoFilterView5.blurControl.setVisibility(4);
                                FilterGLThread filterGLThread = photoFilterView5.eglThread;
                                if (filterGLThread != null) {
                                    filterGLThread.requestRender(false, false, false);
                                }
                                break;
                            case 5:
                                PhotoFilterView photoFilterView6 = this.f$0;
                                photoFilterView6.blurType = 1;
                                photoFilterView6.updateSelectedBlurType();
                                PhotoFilterBlurControl photoFilterBlurControl2 = photoFilterView6.blurControl;
                                photoFilterBlurControl2.setVisibility(0);
                                photoFilterBlurControl2.setType(1);
                                FilterGLThread filterGLThread2 = photoFilterView6.eglThread;
                                if (filterGLThread2 != null) {
                                    filterGLThread2.requestRender(false, false, false);
                                }
                                break;
                            default:
                                PhotoFilterView photoFilterView7 = this.f$0;
                                photoFilterView7.blurType = 2;
                                photoFilterView7.updateSelectedBlurType();
                                PhotoFilterBlurControl photoFilterBlurControl3 = photoFilterView7.blurControl;
                                photoFilterBlurControl3.setVisibility(0);
                                photoFilterBlurControl3.setType(0);
                                FilterGLThread filterGLThread3 = photoFilterView7.eglThread;
                                if (filterGLThread3 != null) {
                                    filterGLThread3.requestRender(false, false, false);
                                }
                                break;
                        }
                    }
                });
            }
            frameLayout4.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            if (i11 == 0) {
                f = 0.0f;
            } else {
                f = 30.0f;
            }
            linearLayout2.addView(frameLayout4, LayoutHelper.createLinear(f, 0.0f, 0.0f, 0.0f, -2, -2));
            final int i13 = 3;
            frameLayout4.setOnClickListener(new View.OnClickListener(this) {
                public final PhotoFilterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            PhotoFilterView photoFilterView = this.f$0;
                            photoFilterView.selectedTool = 0;
                            photoFilterView.tuneItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                            photoFilterView.blurItem.setColorFilter((ColorFilter) null);
                            photoFilterView.curveItem.setColorFilter((ColorFilter) null);
                            photoFilterView.switchMode();
                            break;
                        case 1:
                            PhotoFilterView photoFilterView2 = this.f$0;
                            photoFilterView2.selectedTool = 1;
                            photoFilterView2.tuneItem.setColorFilter((ColorFilter) null);
                            photoFilterView2.blurItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView2.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                            photoFilterView2.curveItem.setColorFilter((ColorFilter) null);
                            photoFilterView2.switchMode();
                            break;
                        case 2:
                            PhotoFilterView photoFilterView3 = this.f$0;
                            photoFilterView3.selectedTool = 2;
                            photoFilterView3.tuneItem.setColorFilter((ColorFilter) null);
                            photoFilterView3.blurItem.setColorFilter((ColorFilter) null);
                            photoFilterView3.curveItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView3.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                            photoFilterView3.switchMode();
                            break;
                        case 3:
                            PhotoFilterView photoFilterView4 = this.f$0;
                            photoFilterView4.getClass();
                            int iIntValue = ((Integer) view.getTag()).intValue();
                            photoFilterView4.curvesToolValue.activeType = iIntValue;
                            int i14 = 0;
                            while (i14 < 4) {
                                photoFilterView4.curveRadioButton[i14].setChecked(i14 == iIntValue, true);
                                i14++;
                            }
                            photoFilterView4.curvesControl.invalidate();
                            break;
                        case 4:
                            PhotoFilterView photoFilterView5 = this.f$0;
                            photoFilterView5.blurType = 0;
                            photoFilterView5.updateSelectedBlurType();
                            photoFilterView5.blurControl.setVisibility(4);
                            FilterGLThread filterGLThread = photoFilterView5.eglThread;
                            if (filterGLThread != null) {
                                filterGLThread.requestRender(false, false, false);
                            }
                            break;
                        case 5:
                            PhotoFilterView photoFilterView6 = this.f$0;
                            photoFilterView6.blurType = 1;
                            photoFilterView6.updateSelectedBlurType();
                            PhotoFilterBlurControl photoFilterBlurControl2 = photoFilterView6.blurControl;
                            photoFilterBlurControl2.setVisibility(0);
                            photoFilterBlurControl2.setType(1);
                            FilterGLThread filterGLThread2 = photoFilterView6.eglThread;
                            if (filterGLThread2 != null) {
                                filterGLThread2.requestRender(false, false, false);
                            }
                            break;
                        default:
                            PhotoFilterView photoFilterView7 = this.f$0;
                            photoFilterView7.blurType = 2;
                            photoFilterView7.updateSelectedBlurType();
                            PhotoFilterBlurControl photoFilterBlurControl3 = photoFilterView7.blurControl;
                            photoFilterBlurControl3.setVisibility(0);
                            photoFilterBlurControl3.setType(0);
                            FilterGLThread filterGLThread3 = photoFilterView7.eglThread;
                            if (filterGLThread3 != null) {
                                filterGLThread3.requestRender(false, false, false);
                            }
                            break;
                    }
                }
            });
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.blurLayout = frameLayout5;
        frameLayout5.setVisibility(4);
        this.toolsView.addView(frameLayout5, LayoutHelper.createFrame(280, 60.0f, 1, 0.0f, (z2 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.blurOffButton = textView4;
        textView4.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(LocaleController.getString(R.string.BlurOff));
        frameLayout5.addView(textView4, LayoutHelper.createFrame(60.0f, 80));
        final int i14 = 4;
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        PhotoFilterView photoFilterView = this.f$0;
                        photoFilterView.selectedTool = 0;
                        photoFilterView.tuneItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView.switchMode();
                        break;
                    case 1:
                        PhotoFilterView photoFilterView2 = this.f$0;
                        photoFilterView2.selectedTool = 1;
                        photoFilterView2.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.blurItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView2.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView2.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.switchMode();
                        break;
                    case 2:
                        PhotoFilterView photoFilterView3 = this.f$0;
                        photoFilterView3.selectedTool = 2;
                        photoFilterView3.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.curveItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView3.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView3.switchMode();
                        break;
                    case 3:
                        PhotoFilterView photoFilterView4 = this.f$0;
                        photoFilterView4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        photoFilterView4.curvesToolValue.activeType = iIntValue;
                        int i15 = 0;
                        while (i15 < 4) {
                            photoFilterView4.curveRadioButton[i15].setChecked(i15 == iIntValue, true);
                            i15++;
                        }
                        photoFilterView4.curvesControl.invalidate();
                        break;
                    case 4:
                        PhotoFilterView photoFilterView5 = this.f$0;
                        photoFilterView5.blurType = 0;
                        photoFilterView5.updateSelectedBlurType();
                        photoFilterView5.blurControl.setVisibility(4);
                        FilterGLThread filterGLThread = photoFilterView5.eglThread;
                        if (filterGLThread != null) {
                            filterGLThread.requestRender(false, false, false);
                        }
                        break;
                    case 5:
                        PhotoFilterView photoFilterView6 = this.f$0;
                        photoFilterView6.blurType = 1;
                        photoFilterView6.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl2 = photoFilterView6.blurControl;
                        photoFilterBlurControl2.setVisibility(0);
                        photoFilterBlurControl2.setType(1);
                        FilterGLThread filterGLThread2 = photoFilterView6.eglThread;
                        if (filterGLThread2 != null) {
                            filterGLThread2.requestRender(false, false, false);
                        }
                        break;
                    default:
                        PhotoFilterView photoFilterView7 = this.f$0;
                        photoFilterView7.blurType = 2;
                        photoFilterView7.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl3 = photoFilterView7.blurControl;
                        photoFilterBlurControl3.setVisibility(0);
                        photoFilterBlurControl3.setType(0);
                        FilterGLThread filterGLThread3 = photoFilterView7.eglThread;
                        if (filterGLThread3 != null) {
                            filterGLThread3.requestRender(false, false, false);
                        }
                        break;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.blurRadialButton = textView5;
        textView5.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(LocaleController.getString(R.string.BlurRadial));
        frameLayout5.addView(textView5, LayoutHelper.createFrame(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final int i15 = 5;
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        PhotoFilterView photoFilterView = this.f$0;
                        photoFilterView.selectedTool = 0;
                        photoFilterView.tuneItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView.switchMode();
                        break;
                    case 1:
                        PhotoFilterView photoFilterView2 = this.f$0;
                        photoFilterView2.selectedTool = 1;
                        photoFilterView2.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.blurItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView2.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView2.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.switchMode();
                        break;
                    case 2:
                        PhotoFilterView photoFilterView3 = this.f$0;
                        photoFilterView3.selectedTool = 2;
                        photoFilterView3.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.curveItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView3.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView3.switchMode();
                        break;
                    case 3:
                        PhotoFilterView photoFilterView4 = this.f$0;
                        photoFilterView4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        photoFilterView4.curvesToolValue.activeType = iIntValue;
                        int i16 = 0;
                        while (i16 < 4) {
                            photoFilterView4.curveRadioButton[i16].setChecked(i16 == iIntValue, true);
                            i16++;
                        }
                        photoFilterView4.curvesControl.invalidate();
                        break;
                    case 4:
                        PhotoFilterView photoFilterView5 = this.f$0;
                        photoFilterView5.blurType = 0;
                        photoFilterView5.updateSelectedBlurType();
                        photoFilterView5.blurControl.setVisibility(4);
                        FilterGLThread filterGLThread = photoFilterView5.eglThread;
                        if (filterGLThread != null) {
                            filterGLThread.requestRender(false, false, false);
                        }
                        break;
                    case 5:
                        PhotoFilterView photoFilterView6 = this.f$0;
                        photoFilterView6.blurType = 1;
                        photoFilterView6.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl2 = photoFilterView6.blurControl;
                        photoFilterBlurControl2.setVisibility(0);
                        photoFilterBlurControl2.setType(1);
                        FilterGLThread filterGLThread2 = photoFilterView6.eglThread;
                        if (filterGLThread2 != null) {
                            filterGLThread2.requestRender(false, false, false);
                        }
                        break;
                    default:
                        PhotoFilterView photoFilterView7 = this.f$0;
                        photoFilterView7.blurType = 2;
                        photoFilterView7.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl3 = photoFilterView7.blurControl;
                        photoFilterBlurControl3.setVisibility(0);
                        photoFilterBlurControl3.setType(0);
                        FilterGLThread filterGLThread3 = photoFilterView7.eglThread;
                        if (filterGLThread3 != null) {
                            filterGLThread3.requestRender(false, false, false);
                        }
                        break;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.blurLinearButton = textView6;
        textView6.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(LocaleController.getString(R.string.BlurLinear));
        frameLayout5.addView(textView6, LayoutHelper.createFrame(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final int i16 = 6;
        textView6.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        PhotoFilterView photoFilterView = this.f$0;
                        photoFilterView.selectedTool = 0;
                        photoFilterView.tuneItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView.switchMode();
                        break;
                    case 1:
                        PhotoFilterView photoFilterView2 = this.f$0;
                        photoFilterView2.selectedTool = 1;
                        photoFilterView2.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.blurItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView2.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView2.curveItem.setColorFilter((ColorFilter) null);
                        photoFilterView2.switchMode();
                        break;
                    case 2:
                        PhotoFilterView photoFilterView3 = this.f$0;
                        photoFilterView3.selectedTool = 2;
                        photoFilterView3.tuneItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.blurItem.setColorFilter((ColorFilter) null);
                        photoFilterView3.curveItem.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton, photoFilterView3.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        photoFilterView3.switchMode();
                        break;
                    case 3:
                        PhotoFilterView photoFilterView4 = this.f$0;
                        photoFilterView4.getClass();
                        int iIntValue = ((Integer) view.getTag()).intValue();
                        photoFilterView4.curvesToolValue.activeType = iIntValue;
                        int i17 = 0;
                        while (i17 < 4) {
                            photoFilterView4.curveRadioButton[i17].setChecked(i17 == iIntValue, true);
                            i17++;
                        }
                        photoFilterView4.curvesControl.invalidate();
                        break;
                    case 4:
                        PhotoFilterView photoFilterView5 = this.f$0;
                        photoFilterView5.blurType = 0;
                        photoFilterView5.updateSelectedBlurType();
                        photoFilterView5.blurControl.setVisibility(4);
                        FilterGLThread filterGLThread = photoFilterView5.eglThread;
                        if (filterGLThread != null) {
                            filterGLThread.requestRender(false, false, false);
                        }
                        break;
                    case 5:
                        PhotoFilterView photoFilterView6 = this.f$0;
                        photoFilterView6.blurType = 1;
                        photoFilterView6.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl2 = photoFilterView6.blurControl;
                        photoFilterBlurControl2.setVisibility(0);
                        photoFilterBlurControl2.setType(1);
                        FilterGLThread filterGLThread2 = photoFilterView6.eglThread;
                        if (filterGLThread2 != null) {
                            filterGLThread2.requestRender(false, false, false);
                        }
                        break;
                    default:
                        PhotoFilterView photoFilterView7 = this.f$0;
                        photoFilterView7.blurType = 2;
                        photoFilterView7.updateSelectedBlurType();
                        PhotoFilterBlurControl photoFilterBlurControl3 = photoFilterView7.blurControl;
                        photoFilterBlurControl3.setVisibility(0);
                        photoFilterBlurControl3.setType(0);
                        FilterGLThread filterGLThread3 = photoFilterView7.eglThread;
                        if (filterGLThread3 != null) {
                            filterGLThread3.requestRender(false, false, false);
                        }
                        break;
                }
            }
        });
        updateSelectedBlurType();
        if (this.inBubbleMode || !z2) {
            return;
        }
        if (this.ownsTextureView) {
            ((FrameLayout.LayoutParams) this.textureView.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
        }
        ((FrameLayout.LayoutParams) this.curvesControl.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
    }

    private void setShowOriginal(boolean z) {
        if (this.showOriginal == z) {
            return;
        }
        this.showOriginal = z;
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(false, false, false);
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        TextureView textureView;
        boolean zDrawChild = super.drawChild(canvas, view, j);
        PaintingOverlay paintingOverlay = this.paintingOverlay;
        if (paintingOverlay != null && view == (textureView = this.textureView)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.bitmapMask;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.maskRect;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.maskPaint;
                int i = this.orientation;
                if (i != 0) {
                    Matrix matrix = this.maskMatrix;
                    matrix.reset();
                    matrix.postRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / paintingOverlay.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            paintingOverlay.draw(canvas);
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override
    public final ByteBuffer fillAndGetCurveBuffer() {
        CurvesToolValue curvesToolValue = this.curvesToolValue;
        curvesToolValue.fillBuffer();
        return curvesToolValue.curveBuffer;
    }

    public Bitmap getBitmap() {
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread == null || !filterGLThread.initied || !filterGLThread.isAlive()) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Bitmap[] bitmapArr = new Bitmap[1];
        try {
            if (filterGLThread.postRunnable(new FilterGLThread$$ExternalSyntheticLambda1(filterGLThread, bitmapArr, countDownLatch, 0))) {
                countDownLatch.await();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return bitmapArr[0];
    }

    @Override
    public float getBlurAngle() {
        return this.blurAngle;
    }

    public PhotoFilterBlurControl getBlurControl() {
        return this.blurControl;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.blurExcludeBlurSize;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.blurExcludePoint;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.blurExcludeSize;
    }

    @Override
    public int getBlurType() {
        return this.blurType;
    }

    public TextView getCancelTextView() {
        return this.cancelTextView;
    }

    @Override
    public float getContrastValue() {
        return zzjd.m(this.contrastValue, 100.0f, 0.3f, 1.0f);
    }

    public PhotoFilterCurvesControl getCurveControl() {
        return this.curvesControl;
    }

    public TextView getDoneTextView() {
        return this.doneTextView;
    }

    @Override
    public float getEnhanceValue() {
        return this.enhanceValue / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return this.exposureValue / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return this.fadeValue / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (this.grainValue / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return SurfaceContainer$$ExternalSyntheticOutline0.m$1(this.highlightsValue, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (!this.ownsTextureView || this.ownLayout) {
            return null;
        }
        return this.textureView;
    }

    @Override
    public float getSaturationValue() {
        float f = this.saturationValue / 100.0f;
        if (f > 0.0f) {
            f *= 1.05f;
        }
        return f + 1.0f;
    }

    public MediaController.SavedFilterState getSavedFilterState() {
        MediaController.SavedFilterState savedFilterState = new MediaController.SavedFilterState();
        savedFilterState.enhanceValue = this.enhanceValue;
        savedFilterState.exposureValue = this.exposureValue;
        savedFilterState.contrastValue = this.contrastValue;
        savedFilterState.warmthValue = this.warmthValue;
        savedFilterState.saturationValue = this.saturationValue;
        savedFilterState.fadeValue = this.fadeValue;
        savedFilterState.softenSkinValue = this.softenSkinValue;
        savedFilterState.tintShadowsColor = this.tintShadowsColor;
        savedFilterState.tintHighlightsColor = this.tintHighlightsColor;
        savedFilterState.highlightsValue = this.highlightsValue;
        savedFilterState.shadowsValue = this.shadowsValue;
        savedFilterState.vignetteValue = this.vignetteValue;
        savedFilterState.grainValue = this.grainValue;
        savedFilterState.blurType = this.blurType;
        savedFilterState.sharpenValue = this.sharpenValue;
        savedFilterState.curvesToolValue = this.curvesToolValue;
        savedFilterState.blurExcludeSize = this.blurExcludeSize;
        savedFilterState.blurExcludePoint = this.blurExcludePoint;
        savedFilterState.blurExcludeBlurSize = this.blurExcludeBlurSize;
        savedFilterState.blurAngle = this.blurAngle;
        this.lastState = savedFilterState;
        return savedFilterState;
    }

    @Override
    public float getShadowsValue() {
        return SurfaceContainer$$ExternalSyntheticOutline0.m$1(this.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return zzjd.m(this.sharpenValue, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return this.softenSkinValue / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return this.tintHighlightsColor;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        return this.tintHighlightsColor == 0 ? 0.0f : 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return this.tintShadowsColor;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        return this.tintShadowsColor == 0 ? 0.0f : 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.toolsView;
    }

    public Bitmap getUiBlurBitmap() {
        BlurringShader blurringShader;
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread == null || (blurringShader = filterGLThread.uiBlur) == null) {
            return null;
        }
        synchronized (blurringShader.bitmapLock) {
            try {
                if (blurringShader.bitmapAvailable) {
                    return blurringShader.bitmap;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public float getVignetteValue() {
        return this.vignetteValue / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return this.warmthValue / 100.0f;
    }

    public final boolean hasChanges() {
        MediaController.SavedFilterState savedFilterState = this.lastState;
        CurvesToolValue curvesToolValue = this.curvesToolValue;
        if (savedFilterState != null) {
            return (this.enhanceValue == savedFilterState.enhanceValue && this.contrastValue == savedFilterState.contrastValue && this.highlightsValue == savedFilterState.highlightsValue && this.exposureValue == savedFilterState.exposureValue && this.warmthValue == savedFilterState.warmthValue && this.saturationValue == savedFilterState.saturationValue && this.vignetteValue == savedFilterState.vignetteValue && this.shadowsValue == savedFilterState.shadowsValue && this.grainValue == savedFilterState.grainValue && this.sharpenValue == savedFilterState.sharpenValue && this.fadeValue == savedFilterState.fadeValue && this.softenSkinValue == savedFilterState.softenSkinValue && this.tintHighlightsColor == savedFilterState.tintHighlightsColor && this.tintShadowsColor == savedFilterState.tintShadowsColor && curvesToolValue.shouldBeSkipped()) ? false : true;
        }
        return (this.enhanceValue == 0.0f && this.contrastValue == 0.0f && this.highlightsValue == 0.0f && this.exposureValue == 0.0f && this.warmthValue == 0.0f && this.saturationValue == 0.0f && this.vignetteValue == 0.0f && this.shadowsValue == 0.0f && this.grainValue == 0.0f && this.sharpenValue == 0.0f && this.fadeValue == 0.0f && this.softenSkinValue == 0.0f && this.tintHighlightsColor == 0 && this.tintShadowsColor == 0 && curvesToolValue.shouldBeSkipped()) ? false : true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float width;
        int height;
        float fCeil;
        float fCeil2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.ownLayout) {
            int iDp = size - AndroidUtilities.dp(28.0f);
            int iDp2 = AndroidUtilities.dp(214.0f);
            boolean z = this.inBubbleMode;
            int i3 = size2 - (iDp2 + (!z ? AndroidUtilities.statusBarHeight : 0));
            TextureView textureView = this.textureView;
            Bitmap bitmap = this.bitmapToEdit;
            if (bitmap != null) {
                int i4 = this.orientation % 360;
                if (i4 == 90 || i4 == 270) {
                    width = bitmap.getHeight();
                    height = bitmap.getWidth();
                } else {
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                }
            } else {
                width = textureView.getWidth();
                height = textureView.getHeight();
            }
            float f = height;
            float f2 = iDp;
            float f3 = f2 / width;
            float f4 = i3;
            float f5 = f4 / f;
            if (f3 > f5) {
                fCeil2 = (int) Math.ceil(width * f5);
                fCeil = f4;
            } else {
                fCeil = (int) Math.ceil(f * f3);
                fCeil2 = f2;
            }
            int iCeil = (int) Math.ceil(((f2 - fCeil2) / 2.0f) + AndroidUtilities.dp(14.0f));
            int iCeil2 = (int) Math.ceil(((f4 - fCeil) / 2.0f) + AndroidUtilities.dp(14.0f) + (!z ? AndroidUtilities.statusBarHeight : 0));
            int i5 = (int) fCeil2;
            int i6 = (int) fCeil;
            if (this.ownsTextureView) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = iCeil;
                layoutParams.topMargin = iCeil2;
                layoutParams.width = i5;
                layoutParams.height = i6;
            }
            float f6 = iCeil;
            float f7 = iCeil2 - (!z ? AndroidUtilities.statusBarHeight : 0);
            float f8 = i5;
            float f9 = i6;
            PhotoFilterCurvesControl photoFilterCurvesControl = this.curvesControl;
            RectOld rectOld = photoFilterCurvesControl.actualArea;
            rectOld.x = f6;
            rectOld.y = f7;
            rectOld.width = f8;
            rectOld.height = f9;
            PhotoFilterBlurControl photoFilterBlurControl = this.blurControl;
            Size size3 = photoFilterBlurControl.actualAreaSize;
            size3.width = f8;
            size3.height = f9;
            ((FrameLayout.LayoutParams) photoFilterBlurControl.getLayoutParams()).height = AndroidUtilities.dp(38.0f) + i3;
            ((FrameLayout.LayoutParams) photoFilterCurvesControl.getLayoutParams()).height = AndroidUtilities.dp(28.0f) + i3;
            if (AndroidUtilities.isTablet()) {
                int iDp3 = AndroidUtilities.dp(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.recyclerListView.getLayoutParams();
                if (iDp3 < iDp) {
                    layoutParams2.width = iDp3;
                    layoutParams2.leftMargin = (iDp - iDp3) / 2;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                }
            }
        }
        super.onMeasure(i, i2);
    }

    @Override
    public final boolean onTouch(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.textureView;
            if (textureView instanceof VideoEditTextureView) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                RectOld rectOld = ((VideoEditTextureView) textureView).viewRect;
                float f = rectOld.x;
                if (x >= f && x <= f + rectOld.width) {
                    float f2 = rectOld.y;
                    if (y >= f2 && y <= f2 + rectOld.height) {
                        setShowOriginal(true);
                    }
                }
            } else if (motionEvent.getX() >= textureView.getX() && motionEvent.getY() >= textureView.getY() && motionEvent.getX() <= textureView.getX() + textureView.getWidth() && motionEvent.getY() <= textureView.getY() + textureView.getHeight()) {
                setShowOriginal(true);
            }
        } else if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
            setShowOriginal(false);
        }
        return true;
    }

    public void setEnhanceValue(float f) {
        this.enhanceValue = f * 100.0f;
        updateFiltersEmpty();
        int i = 0;
        while (true) {
            ChatAttachAlert.AnonymousClass15 anonymousClass15 = this.recyclerListView;
            if (i >= anonymousClass15.getChildCount()) {
                break;
            }
            View childAt = anonymousClass15.getChildAt(i);
            if (childAt instanceof PhotoEditToolCell) {
                anonymousClass15.getClass();
                if (RecyclerView.getChildAdapterPosition(childAt) == this.enhanceTool) {
                    ((PhotoEditToolCell) childAt).setIconAndTextAndValue(LocaleController.getString(R.string.Enhance), 0, this.enhanceValue);
                    break;
                }
            }
            i++;
        }
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(true, false, false);
        }
    }

    @Override
    public final boolean shouldDrawCurvesPass() {
        return !this.curvesToolValue.shouldBeSkipped();
    }

    @Override
    public final boolean shouldShowOriginal() {
        return this.showOriginal || this.filtersEmpty;
    }

    public final void shutdown() {
        boolean z = this.ownsTextureView;
        TextureView textureView = this.textureView;
        if (z) {
            FilterGLThread filterGLThread = this.eglThread;
            if (filterGLThread != null) {
                filterGLThread.shutdown();
                this.eglThread = null;
            }
            textureView.setVisibility(8);
            return;
        }
        if (textureView instanceof VideoEditTextureView) {
            VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
            MediaController.SavedFilterState savedFilterState = this.lastState;
            if (savedFilterState == null) {
                videoEditTextureView.setDelegate(null);
                return;
            }
            FilterGLThread filterGLThread2 = this.eglThread;
            if (filterGLThread2 != null) {
                filterGLThread2.setFilterGLThreadDelegate(new FilterShaders.AnonymousClass1(savedFilterState));
            }
        }
    }

    public final void switchMode() {
        int i = this.selectedTool;
        FrameLayout frameLayout = this.curveLayout;
        FrameLayout frameLayout2 = this.blurLayout;
        ChatAttachAlert.AnonymousClass15 anonymousClass15 = this.recyclerListView;
        PhotoFilterCurvesControl photoFilterCurvesControl = this.curvesControl;
        PhotoFilterBlurControl photoFilterBlurControl = this.blurControl;
        if (i == 0) {
            photoFilterBlurControl.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            photoFilterCurvesControl.setVisibility(4);
            anonymousClass15.setVisibility(0);
            return;
        }
        if (i == 1) {
            anonymousClass15.setVisibility(4);
            frameLayout.setVisibility(4);
            photoFilterCurvesControl.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.blurType != 0) {
                photoFilterBlurControl.setVisibility(0);
            }
            updateSelectedBlurType();
            return;
        }
        if (i == 2) {
            anonymousClass15.setVisibility(4);
            frameLayout2.setVisibility(4);
            photoFilterBlurControl.setVisibility(4);
            frameLayout.setVisibility(0);
            photoFilterCurvesControl.setVisibility(0);
            this.curvesToolValue.activeType = 0;
            int i2 = 0;
            while (i2 < 4) {
                this.curveRadioButton[i2].setChecked(i2 == 0, false);
                i2++;
            }
        }
    }

    public final void updateFiltersEmpty() {
        this.filtersEmpty = Math.abs(this.enhanceValue) < 0.1f && Math.abs(this.softenSkinValue) < 0.1f && Math.abs(this.exposureValue) < 0.1f && Math.abs(this.contrastValue) < 0.1f && Math.abs(this.warmthValue) < 0.1f && Math.abs(this.saturationValue) < 0.1f && Math.abs(this.fadeValue) < 0.1f && this.tintShadowsColor == 0 && this.tintHighlightsColor == 0 && Math.abs(this.highlightsValue) < 0.1f && Math.abs(this.shadowsValue) < 0.1f && Math.abs(this.vignetteValue) < 0.1f && Math.abs(this.grainValue) < 0.1f && this.blurType == 0 && Math.abs(this.sharpenValue) < 0.1f && this.curvesToolValue.shouldBeSkipped();
    }

    public final void updateSelectedBlurType() {
        int i = this.blurType;
        TextView textView = this.blurLinearButton;
        TextView textView2 = this.blurRadialButton;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        TextView textView3 = this.blurOffButton;
        if (i == 0) {
            Drawable drawableMutate = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i2 = Theme.key_chat_editMediaButton;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(Theme.getColor(i2, resourcesProvider));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            Drawable drawableMutate2 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i3 = Theme.key_chat_editMediaButton;
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(Theme.getColor(i3, resourcesProvider));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            textView.setTextColor(-1);
        } else if (i == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            textView2.setTextColor(-1);
            Drawable drawableMutate3 = textView3.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i4 = Theme.key_chat_editMediaButton;
            drawableMutate3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i4, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(Theme.getColor(i4, resourcesProvider));
        }
        updateFiltersEmpty();
    }
}

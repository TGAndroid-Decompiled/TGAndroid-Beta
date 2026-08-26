package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticOutline0;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.PhotoEditRadioCell;
import org.telegram.ui.Cells.PhotoEditToolCell;
import org.telegram.ui.Stories.recorder.StoryRecorder;

public class PhotoFilterView extends FrameLayout implements FilterShaders.FilterShadersDelegate, StoryRecorder.Touchable {
    private static final int curveDataStep = 2;
    private static final int curveGranularity = 100;
    private Bitmap bitmapMask;
    private Bitmap bitmapToEdit;
    private float blurAngle;
    private PhotoFilterBlurControl blurControl;
    private float blurExcludeBlurSize;
    private PointF blurExcludePoint;
    private float blurExcludeSize;
    private ImageView blurItem;
    private FrameLayout blurLayout;
    private TextView blurLinearButton;
    private TextView blurOffButton;
    private TextView blurRadialButton;
    private int blurType;
    private TextView cancelTextView;
    private int contrastTool;
    private float contrastValue;
    private ImageView curveItem;
    private FrameLayout curveLayout;
    private RadioButton[] curveRadioButton;
    private PhotoFilterCurvesControl curvesControl;
    private CurvesToolValue curvesToolValue;
    private TextView doneTextView;
    private FilterGLThread eglThread;
    private int enhanceTool;
    private float enhanceValue;
    private int exposureTool;
    private float exposureValue;
    private int fadeTool;
    private float fadeValue;
    private boolean filtersEmpty;
    private int gradientBottom;
    private int gradientTop;
    private int grainTool;
    private float grainValue;
    private int highlightsTool;
    private float highlightsValue;
    private boolean inBubbleMode;
    private boolean isMirrored;
    private MediaController.SavedFilterState lastState;
    private final Matrix maskMatrix;
    private final Paint maskPaint;
    private final Rect maskRect;
    private int orientation;
    private boolean ownLayout;
    private boolean ownsTextureView;
    private PaintingOverlay paintingOverlay;
    private RecyclerListView recyclerListView;
    private final Theme.ResourcesProvider resourcesProvider;
    private int rowsCount;
    private int saturationTool;
    private float saturationValue;
    private int selectedTool;
    private int shadowsTool;
    private float shadowsValue;
    private int sharpenTool;
    private float sharpenValue;
    private boolean showOriginal;
    private int softenSkinTool;
    private float softenSkinValue;
    private TextureView textureView;
    private int tintHighlightsColor;
    private int tintHighlightsTool;
    private int tintShadowsColor;
    private int tintShadowsTool;
    private FrameLayout toolsView;
    private ImageView tuneItem;
    private int vignetteTool;
    private float vignetteValue;
    private int warmthTool;
    private float warmthValue;

    public class AnonymousClass2 implements TextureView.SurfaceTextureListener {
        final BlurringShader.BlurManager val$blurManager;
        final boolean val$ownLayout;

        public AnonymousClass2(boolean z, BlurringShader.BlurManager blurManager) {
            this.val$ownLayout = z;
            this.val$blurManager = blurManager;
        }

        public void lambda$onSurfaceTextureSizeChanged$0() {
            if (PhotoFilterView.this.eglThread != null) {
                PhotoFilterView.this.eglThread.requestRender(false, true, false);
            }
        }

        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (PhotoFilterView.this.eglThread != null || surfaceTexture == null) {
                return;
            }
            PhotoFilterView.this.eglThread = new FilterGLThread(surfaceTexture, PhotoFilterView.this.bitmapToEdit, PhotoFilterView.this.orientation, PhotoFilterView.this.isMirrored, null, this.val$ownLayout, this.val$blurManager, i, i2);
            if (!this.val$ownLayout) {
                PhotoFilterView.this.eglThread.updateUiBlurGradient(PhotoFilterView.this.gradientTop, PhotoFilterView.this.gradientBottom);
                PhotoFilterView.this.eglThread.updateUiBlurTransform(PhotoFilterView.this.textureView.getTransform(null), PhotoFilterView.this.textureView.getWidth(), PhotoFilterView.this.textureView.getHeight());
            }
            PhotoFilterView.this.eglThread.setFilterGLThreadDelegate(PhotoFilterView.this);
            PhotoFilterView.this.eglThread.setSurfaceTextureSize(i, i2);
            PhotoFilterView.this.eglThread.requestRender(true, true, false);
        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (PhotoFilterView.this.eglThread == null) {
                return true;
            }
            PhotoFilterView.this.eglThread.shutdown();
            PhotoFilterView.this.eglThread = null;
            return true;
        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            if (PhotoFilterView.this.eglThread != null) {
                PhotoFilterView.this.eglThread.setSurfaceTextureSize(i, i2);
                PhotoFilterView.this.eglThread.requestRender(false, true, false);
                PhotoFilterView.this.eglThread.postRunnable(new Bulletin$2$$ExternalSyntheticLambda1(this, 24));
            }
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public static class CurvesToolValue {
        public static final int CurvesTypeBlue = 3;
        public static final int CurvesTypeGreen = 2;
        public static final int CurvesTypeLuminance = 0;
        public static final int CurvesTypeRed = 1;
        public int activeType;
        public ByteBuffer curveBuffer;
        public CurvesValue luminanceCurve = new CurvesValue();
        public CurvesValue redCurve = new CurvesValue();
        public CurvesValue greenCurve = new CurvesValue();
        public CurvesValue blueCurve = new CurvesValue();

        public CurvesToolValue() {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(800);
            this.curveBuffer = byteBufferAllocateDirect;
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        }

        public void fillBuffer() {
            this.curveBuffer.position(0);
            float[] dataPoints = this.luminanceCurve.getDataPoints();
            float[] dataPoints2 = this.redCurve.getDataPoints();
            float[] dataPoints3 = this.greenCurve.getDataPoints();
            float[] dataPoints4 = this.blueCurve.getDataPoints();
            for (int i = 0; i < 200; i++) {
                this.curveBuffer.put((byte) (dataPoints2[i] * 255.0f));
                this.curveBuffer.put((byte) (dataPoints3[i] * 255.0f));
                this.curveBuffer.put((byte) (dataPoints4[i] * 255.0f));
                this.curveBuffer.put((byte) (dataPoints[i] * 255.0f));
            }
            this.curveBuffer.position(0);
        }

        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.luminanceCurve.readParams(inputSerializedData, z);
            this.redCurve.readParams(inputSerializedData, z);
            this.greenCurve.readParams(inputSerializedData, z);
            this.blueCurve.readParams(inputSerializedData, z);
        }

        public void serializeToStream(OutputSerializedData outputSerializedData) {
            this.luminanceCurve.serializeToStream(outputSerializedData);
            this.redCurve.serializeToStream(outputSerializedData);
            this.greenCurve.serializeToStream(outputSerializedData);
            this.blueCurve.serializeToStream(outputSerializedData);
        }

        public boolean shouldBeSkipped() {
            return this.luminanceCurve.isDefault() && this.redCurve.isDefault() && this.greenCurve.isDefault() && this.blueCurve.isDefault();
        }
    }

    public static class CurvesValue {
        public float[] cachedDataPoints;
        public float blacksLevel = 0.0f;
        public float shadowsLevel = 25.0f;
        public float midtonesLevel = 50.0f;
        public float highlightsLevel = 75.0f;
        public float whitesLevel = 100.0f;
        public float previousBlacksLevel = 0.0f;
        public float previousShadowsLevel = 25.0f;
        public float previousMidtonesLevel = 50.0f;
        public float previousHighlightsLevel = 75.0f;
        public float previousWhitesLevel = 100.0f;

        public float[] getDataPoints() {
            if (this.cachedDataPoints == null) {
                interpolateCurve();
            }
            return this.cachedDataPoints;
        }

        public float[] interpolateCurve() {
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

        public boolean isDefault() {
            return ((double) Math.abs(this.blacksLevel - 0.0f)) < 1.0E-5d && ((double) Math.abs(this.shadowsLevel - 25.0f)) < 1.0E-5d && ((double) Math.abs(this.midtonesLevel - 50.0f)) < 1.0E-5d && ((double) Math.abs(this.highlightsLevel - 75.0f)) < 1.0E-5d && ((double) Math.abs(this.whitesLevel - 100.0f)) < 1.0E-5d;
        }

        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            float f = inputSerializedData.readFloat(z);
            this.previousBlacksLevel = f;
            this.blacksLevel = f;
            float f2 = inputSerializedData.readFloat(z);
            this.previousShadowsLevel = f2;
            this.shadowsLevel = f2;
            float f3 = inputSerializedData.readFloat(z);
            this.previousMidtonesLevel = f3;
            this.midtonesLevel = f3;
            float f4 = inputSerializedData.readFloat(z);
            this.previousHighlightsLevel = f4;
            this.highlightsLevel = f4;
            float f5 = inputSerializedData.readFloat(z);
            this.previousWhitesLevel = f5;
            this.whitesLevel = f5;
        }

        public void restoreValues() {
            this.blacksLevel = this.previousBlacksLevel;
            this.shadowsLevel = this.previousShadowsLevel;
            this.midtonesLevel = this.previousMidtonesLevel;
            this.highlightsLevel = this.previousHighlightsLevel;
            this.whitesLevel = this.previousWhitesLevel;
            interpolateCurve();
        }

        public void saveValues() {
            this.previousBlacksLevel = this.blacksLevel;
            this.previousShadowsLevel = this.shadowsLevel;
            this.previousMidtonesLevel = this.midtonesLevel;
            this.previousHighlightsLevel = this.highlightsLevel;
            this.previousWhitesLevel = this.whitesLevel;
        }

        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeFloat(this.blacksLevel);
            outputSerializedData.writeFloat(this.shadowsLevel);
            outputSerializedData.writeFloat(this.midtonesLevel);
            outputSerializedData.writeFloat(this.highlightsLevel);
            outputSerializedData.writeFloat(this.whitesLevel);
        }
    }

    public static class EnhanceView extends View {
        private boolean allowTouch;
        private StaticLayout bottomText;
        private float bottomTextLeft;
        private TextPaint bottomTextPaint;
        private float bottomTextWidth;
        private long downTime;
        private PhotoFilterView filterView;
        private Runnable hide;
        private float lastTouchX;
        private float lastTouchY;
        private float lastVibrateValue;
        private Runnable requestFilterView;
        private AnimatedFloat showT;
        private boolean shown;
        private StaticLayout topText;
        private float topTextLeft;
        private TextPaint topTextPaint;
        private float topTextWidth;
        private boolean tracking;

        public EnhanceView(Context context, Runnable runnable) {
            super(context);
            this.topTextPaint = new TextPaint(1);
            this.bottomTextPaint = new TextPaint(1);
            this.showT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.hide = new GroupCallPip$$ExternalSyntheticLambda2(this, 27);
            this.requestFilterView = runnable;
        }

        public void lambda$new$0() {
            this.shown = false;
            invalidate();
        }

        private void updateBottomText() {
            PhotoFilterView photoFilterView = this.filterView;
            StaticLayout staticLayout = new StaticLayout("" + Math.round((photoFilterView == null ? 0.0f : photoFilterView.getEnhanceValue()) * 100.0f), this.bottomTextPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.bottomText = staticLayout;
            this.bottomTextWidth = staticLayout.getLineCount() > 0 ? this.bottomText.getLineWidth(0) : 0.0f;
            this.bottomTextLeft = this.bottomText.getLineCount() > 0 ? this.bottomText.getLineLeft(0) : 0.0f;
            invalidate();
        }

        @Override
        public void onDraw(Canvas canvas) {
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
        public void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            this.topTextPaint.setColor(-1);
            this.topTextPaint.setShadowLayer(AndroidUtilities.dp(8.0f), 0.0f, 0.0f, 805306368);
            this.topTextPaint.setTextSize(AndroidUtilities.dp(34.0f));
            this.bottomTextPaint.setColor(-1);
            this.bottomTextPaint.setShadowLayer(AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 805306368);
            this.bottomTextPaint.setTextSize(AndroidUtilities.dp(58.0f));
            if (this.topText == null) {
                StaticLayout staticLayout = new StaticLayout(LocaleController.getString(R.string.Enhance), this.topTextPaint, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.topText = staticLayout;
                this.topTextWidth = staticLayout.getLineCount() > 0 ? this.topText.getLineWidth(0) : 0.0f;
                this.topTextLeft = this.topText.getLineCount() > 0 ? this.topText.getLineLeft(0) : 0.0f;
            }
        }

        public boolean onTouch(MotionEvent motionEvent) {
            if (this.allowTouch && motionEvent.getPointerCount() == 1) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.tracking = false;
                    this.downTime = System.currentTimeMillis();
                    this.lastTouchX = motionEvent.getX();
                    this.lastTouchY = motionEvent.getY();
                    PhotoFilterView photoFilterView = this.filterView;
                    if (photoFilterView != null) {
                        this.lastVibrateValue = photoFilterView.getEnhanceValue();
                    }
                    return true;
                }
                if (action == 2) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    if (!this.tracking && System.currentTimeMillis() - this.downTime <= ViewConfiguration.getLongPressTimeout() && Math.abs(this.lastTouchY - y) < Math.abs(this.lastTouchX - x) && Math.abs(this.lastTouchX - x) > AndroidUtilities.touchSlop) {
                        this.tracking = true;
                        AndroidUtilities.cancelRunOnUIThread(this.hide);
                        this.shown = true;
                        invalidate();
                    }
                    if (this.tracking) {
                        float f = x - this.lastTouchX;
                        if (this.filterView == null) {
                            this.requestFilterView.run();
                        }
                        PhotoFilterView photoFilterView2 = this.filterView;
                        if (photoFilterView2 == null) {
                            this.tracking = false;
                            return false;
                        }
                        float f2 = AndroidUtilities.displaySize.x * 0.8f;
                        float enhanceValue = photoFilterView2.getEnhanceValue();
                        float fClamp = Utilities.clamp((f / f2) + enhanceValue, 1.0f, 0.0f);
                        int iRound = Math.round(fClamp * 100.0f);
                        int iRound2 = Math.round(enhanceValue * 100.0f);
                        int iRound3 = Math.round(this.lastVibrateValue * 100.0f);
                        if (iRound == iRound2 || !(iRound == 100 || iRound == 0)) {
                            if (Math.abs(iRound - iRound3) > (SharedConfig.getDevicePerformanceClass() == 2 ? 5 : 10)) {
                                AndroidUtilities.vibrateCursor(this);
                                this.lastVibrateValue = fClamp;
                            }
                        } else {
                            try {
                                performHapticFeedback(3, 1);
                            } catch (Exception unused) {
                            }
                            this.lastVibrateValue = fClamp;
                        }
                        this.filterView.setEnhanceValue(fClamp);
                        updateBottomText();
                    }
                    this.lastTouchX = x;
                    this.lastTouchY = y;
                } else if (action == 1 || action == 3) {
                    this.tracking = false;
                    this.downTime = -1L;
                    PhotoFilterView photoFilterView3 = this.filterView;
                    if (photoFilterView3 != null) {
                        this.lastVibrateValue = photoFilterView3.getEnhanceValue();
                    }
                    AndroidUtilities.runOnUIThread(this.hide, 600L);
                    return false;
                }
            } else if (this.shown) {
                this.shown = false;
                invalidate();
            }
            return false;
        }

        public void setAllowTouch(boolean z) {
            this.allowTouch = z;
        }

        public void setFilterView(PhotoFilterView photoFilterView) {
            this.filterView = photoFilterView;
        }
    }

    public static class RecyclerListViewWithShadows extends RecyclerListView {
        private boolean bottom;
        private AnimatedFloat bottomAlpha;
        private final Paint bottomPaint;
        private boolean top;
        private AnimatedFloat topAlpha;
        private final Paint topPaint;

        public RecyclerListViewWithShadows(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.topPaint = paint;
            Paint paint2 = new Paint(1);
            this.bottomPaint = paint2;
            this.topAlpha = new AnimatedFloat(this);
            this.bottomAlpha = new AnimatedFloat(this);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{-16777216, 0}, new float[]{0.0f, 1.0f}, tileMode));
            paint2.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(8.0f), new int[]{0, -16777216}, new float[]{0.0f, 1.0f}, tileMode));
        }

        private void updateAlphas() {
            boolean zCanScrollVertically = canScrollVertically(-1);
            boolean zCanScrollVertically2 = canScrollVertically(1);
            if (zCanScrollVertically == this.top && zCanScrollVertically2 == this.bottom) {
                return;
            }
            this.top = zCanScrollVertically;
            this.bottom = zCanScrollVertically2;
            invalidate();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            this.topPaint.setAlpha((int) (this.topAlpha.set(this.top ? 1.0f : 0.0f) * 255.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), this.topPaint);
            this.bottomPaint.setAlpha((int) (this.bottomAlpha.set(this.bottom ? 1.0f : 0.0f) * 255.0f));
            canvas.save();
            canvas.translate(0.0f, getHeight() - AndroidUtilities.dp(8.0f));
            canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(8.0f), this.bottomPaint);
            canvas.restore();
        }

        @Override
        public void onScrolled(int i, int i2) {
            super.onScrolled(i, i2);
            updateAlphas();
        }
    }

    public class ToolsAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ToolsAdapter(Context context) {
            this.mContext = context;
        }

        public void lambda$onCreateViewHolder$0(int i, int i2) {
            if (i == PhotoFilterView.this.enhanceTool) {
                PhotoFilterView.this.enhanceValue = i2;
            } else if (i == PhotoFilterView.this.highlightsTool) {
                PhotoFilterView.this.highlightsValue = i2;
            } else if (i == PhotoFilterView.this.contrastTool) {
                PhotoFilterView.this.contrastValue = i2;
            } else if (i == PhotoFilterView.this.exposureTool) {
                PhotoFilterView.this.exposureValue = i2;
            } else if (i == PhotoFilterView.this.warmthTool) {
                PhotoFilterView.this.warmthValue = i2;
            } else if (i == PhotoFilterView.this.saturationTool) {
                PhotoFilterView.this.saturationValue = i2;
            } else if (i == PhotoFilterView.this.vignetteTool) {
                PhotoFilterView.this.vignetteValue = i2;
            } else if (i == PhotoFilterView.this.shadowsTool) {
                PhotoFilterView.this.shadowsValue = i2;
            } else if (i == PhotoFilterView.this.grainTool) {
                PhotoFilterView.this.grainValue = i2;
            } else if (i == PhotoFilterView.this.sharpenTool) {
                PhotoFilterView.this.sharpenValue = i2;
            } else if (i == PhotoFilterView.this.fadeTool) {
                PhotoFilterView.this.fadeValue = i2;
            } else if (i == PhotoFilterView.this.softenSkinTool) {
                PhotoFilterView.this.softenSkinValue = i2;
            }
            if (PhotoFilterView.this.eglThread != null) {
                PhotoFilterView.this.eglThread.requestRender(true);
            }
            PhotoFilterView.this.updateFiltersEmpty();
        }

        public void lambda$onCreateViewHolder$1(View view) {
            PhotoEditRadioCell photoEditRadioCell = (PhotoEditRadioCell) view;
            if (((Integer) photoEditRadioCell.getTag()).intValue() == PhotoFilterView.this.tintShadowsTool) {
                PhotoFilterView.this.tintShadowsColor = photoEditRadioCell.getCurrentColor();
            } else {
                PhotoFilterView.this.tintHighlightsColor = photoEditRadioCell.getCurrentColor();
            }
            if (PhotoFilterView.this.eglThread != null) {
                PhotoFilterView.this.eglThread.requestRender(false);
            }
            PhotoFilterView.this.updateFiltersEmpty();
        }

        @Override
        public int getItemCount() {
            return PhotoFilterView.this.rowsCount;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public int getItemViewType(int i) {
            return (i == PhotoFilterView.this.tintShadowsTool || i == PhotoFilterView.this.tintHighlightsTool) ? 1 : 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    return;
                }
                PhotoEditRadioCell photoEditRadioCell = (PhotoEditRadioCell) viewHolder.itemView;
                photoEditRadioCell.setTag(Integer.valueOf(i));
                int i2 = PhotoFilterView.this.tintShadowsTool;
                TextView textView = photoEditRadioCell.nameTextView;
                if (i == i2) {
                    String string = LocaleController.getString(R.string.TintShadows);
                    photoEditRadioCell.currentColor = PhotoFilterView.this.tintShadowsColor;
                    textView.setText(string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase());
                    photoEditRadioCell.updateSelectedTintButton(false);
                    return;
                }
                if (i == PhotoFilterView.this.tintHighlightsTool) {
                    String string2 = LocaleController.getString(R.string.TintHighlights);
                    photoEditRadioCell.currentColor = PhotoFilterView.this.tintHighlightsColor;
                    textView.setText(string2.substring(0, 1).toUpperCase() + string2.substring(1).toLowerCase());
                    photoEditRadioCell.updateSelectedTintButton(false);
                    return;
                }
                return;
            }
            PhotoEditToolCell photoEditToolCell = (PhotoEditToolCell) viewHolder.itemView;
            photoEditToolCell.setTag(Integer.valueOf(i));
            if (i == PhotoFilterView.this.enhanceTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Enhance), 0, PhotoFilterView.this.enhanceValue);
                return;
            }
            if (i == PhotoFilterView.this.highlightsTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Highlights), -100, PhotoFilterView.this.highlightsValue);
                return;
            }
            if (i == PhotoFilterView.this.contrastTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Contrast), -100, PhotoFilterView.this.contrastValue);
                return;
            }
            if (i == PhotoFilterView.this.exposureTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Exposure), -100, PhotoFilterView.this.exposureValue);
                return;
            }
            if (i == PhotoFilterView.this.warmthTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Warmth), -100, PhotoFilterView.this.warmthValue);
                return;
            }
            if (i == PhotoFilterView.this.saturationTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Saturation), -100, PhotoFilterView.this.saturationValue);
                return;
            }
            if (i == PhotoFilterView.this.vignetteTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Vignette), 0, PhotoFilterView.this.vignetteValue);
                return;
            }
            if (i == PhotoFilterView.this.shadowsTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Shadows), -100, PhotoFilterView.this.shadowsValue);
                return;
            }
            if (i == PhotoFilterView.this.grainTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Grain), 0, PhotoFilterView.this.grainValue);
                return;
            }
            if (i == PhotoFilterView.this.sharpenTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Sharpen), 0, PhotoFilterView.this.sharpenValue);
            } else if (i == PhotoFilterView.this.fadeTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.Fade), 0, PhotoFilterView.this.fadeValue);
            } else if (i == PhotoFilterView.this.softenSkinTool) {
                photoEditToolCell.setIconAndTextAndValue(LocaleController.getString(R.string.SoftenSkin), 0, PhotoFilterView.this.softenSkinValue);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                PhotoEditToolCell photoEditToolCell = new PhotoEditToolCell(this.mContext, PhotoFilterView.this.resourcesProvider);
                photoEditToolCell.setSeekBarDelegate(new ColorPicker$$ExternalSyntheticLambda5(this, 8));
                view = photoEditToolCell;
            } else {
                PhotoEditRadioCell photoEditRadioCell = new PhotoEditRadioCell(this.mContext);
                photoEditRadioCell.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 8));
                view = photoEditRadioCell;
            }
            return new RecyclerListView.Holder(view);
        }
    }

    public PhotoFilterView(Context context, VideoEditTextureView videoEditTextureView, Bitmap bitmap, int i, MediaController.SavedFilterState savedFilterState, PaintingOverlay paintingOverlay, int i2, boolean z, boolean z2, BlurringShader.BlurManager blurManager, Theme.ResourcesProvider resourcesProvider) {
        this(context, videoEditTextureView, bitmap, null, i, savedFilterState, paintingOverlay, i2, z, z2, blurManager, resourcesProvider);
    }

    private void fixLayout(int i, int i2) {
        float width;
        int height;
        float fCeil;
        float fCeil2;
        if (this.ownLayout) {
            int iDp = i - AndroidUtilities.dp(28.0f);
            int iDp2 = i2 - (AndroidUtilities.dp(214.0f) + (!this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0));
            Bitmap bitmap = this.bitmapToEdit;
            if (bitmap != null) {
                int i3 = this.orientation % 360;
                if (i3 == 90 || i3 == 270) {
                    width = bitmap.getHeight();
                    height = this.bitmapToEdit.getWidth();
                } else {
                    width = bitmap.getWidth();
                    height = this.bitmapToEdit.getHeight();
                }
            } else {
                width = this.textureView.getWidth();
                height = this.textureView.getHeight();
            }
            float f = height;
            float f2 = iDp;
            float f3 = f2 / width;
            float f4 = iDp2;
            float f5 = f4 / f;
            if (f3 > f5) {
                fCeil2 = (int) Math.ceil(width * f5);
                fCeil = f4;
            } else {
                fCeil = (int) Math.ceil(f * f3);
                fCeil2 = f2;
            }
            int iCeil = (int) Math.ceil(((f2 - fCeil2) / 2.0f) + AndroidUtilities.dp(14.0f));
            int iCeil2 = (int) Math.ceil(((f4 - fCeil) / 2.0f) + AndroidUtilities.dp(14.0f) + (!this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0));
            int i4 = (int) fCeil2;
            int i5 = (int) fCeil;
            if (this.ownsTextureView) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.textureView.getLayoutParams();
                layoutParams.leftMargin = iCeil;
                layoutParams.topMargin = iCeil2;
                layoutParams.width = i4;
                layoutParams.height = i5;
            }
            float f6 = i4;
            float f7 = i5;
            this.curvesControl.setActualArea(iCeil, iCeil2 - (!this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0), f6, f7);
            this.blurControl.setActualAreaSize(f6, f7);
            ((FrameLayout.LayoutParams) this.blurControl.getLayoutParams()).height = AndroidUtilities.dp(38.0f) + iDp2;
            ((FrameLayout.LayoutParams) this.curvesControl.getLayoutParams()).height = AndroidUtilities.dp(28.0f) + iDp2;
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
    }

    private int getThemedColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    public void lambda$new$0(FilterGLThread filterGLThread) {
        this.eglThread = filterGLThread;
        filterGLThread.setFilterGLThreadDelegate(this);
    }

    public void lambda$new$1(PointF pointF, float f, float f2, float f3) {
        this.blurExcludeSize = f2;
        this.blurExcludePoint = pointF;
        this.blurExcludeBlurSize = f;
        this.blurAngle = f3;
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(false);
        }
    }

    public void lambda$new$2() {
        updateFiltersEmpty();
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(false);
        }
    }

    public void lambda$new$3(View view) {
        this.selectedTool = 0;
        this.tuneItem.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY));
        this.blurItem.setColorFilter((ColorFilter) null);
        this.curveItem.setColorFilter((ColorFilter) null);
        switchMode();
    }

    public void lambda$new$4(View view) {
        this.selectedTool = 1;
        this.tuneItem.setColorFilter((ColorFilter) null);
        this.blurItem.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY));
        this.curveItem.setColorFilter((ColorFilter) null);
        switchMode();
    }

    public void lambda$new$5(View view) {
        this.selectedTool = 2;
        this.tuneItem.setColorFilter((ColorFilter) null);
        this.blurItem.setColorFilter((ColorFilter) null);
        this.curveItem.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY));
        switchMode();
    }

    public void lambda$new$6(View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        this.curvesToolValue.activeType = iIntValue;
        int i = 0;
        while (i < 4) {
            this.curveRadioButton[i].setChecked(i == iIntValue, true);
            i++;
        }
        this.curvesControl.invalidate();
    }

    public void lambda$new$7(View view) {
        this.blurType = 0;
        updateSelectedBlurType();
        this.blurControl.setVisibility(4);
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(false);
        }
    }

    public void lambda$new$8(View view) {
        this.blurType = 1;
        updateSelectedBlurType();
        this.blurControl.setVisibility(0);
        this.blurControl.setType(1);
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(false);
        }
    }

    public void lambda$new$9(View view) {
        this.blurType = 2;
        updateSelectedBlurType();
        this.blurControl.setVisibility(0);
        this.blurControl.setType(0);
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(false);
        }
    }

    private void setShowOriginal(boolean z) {
        if (this.showOriginal == z) {
            return;
        }
        this.showOriginal = z;
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(false);
        }
    }

    public void updateFiltersEmpty() {
        this.filtersEmpty = Math.abs(this.enhanceValue) < 0.1f && Math.abs(this.softenSkinValue) < 0.1f && Math.abs(this.exposureValue) < 0.1f && Math.abs(this.contrastValue) < 0.1f && Math.abs(this.warmthValue) < 0.1f && Math.abs(this.saturationValue) < 0.1f && Math.abs(this.fadeValue) < 0.1f && this.tintShadowsColor == 0 && this.tintHighlightsColor == 0 && Math.abs(this.highlightsValue) < 0.1f && Math.abs(this.shadowsValue) < 0.1f && Math.abs(this.vignetteValue) < 0.1f && Math.abs(this.grainValue) < 0.1f && this.blurType == 0 && Math.abs(this.sharpenValue) < 0.1f && this.curvesToolValue.shouldBeSkipped();
    }

    private void updateSelectedBlurType() {
        int i = this.blurType;
        if (i == 0) {
            Drawable drawableMutate = this.blurOffButton.getContext().getResources().getDrawable(R.drawable.msg_blur_off).mutate();
            int i2 = Theme.key_chat_editMediaButton;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i2), PorterDuff.Mode.MULTIPLY));
            this.blurOffButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate, (Drawable) null, (Drawable) null);
            this.blurOffButton.setTextColor(getThemedColor(i2));
            this.blurRadialButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            this.blurRadialButton.setTextColor(-1);
            this.blurLinearButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            this.blurLinearButton.setTextColor(-1);
        } else if (i == 1) {
            this.blurOffButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            this.blurOffButton.setTextColor(-1);
            Drawable drawableMutate2 = this.blurOffButton.getContext().getResources().getDrawable(R.drawable.msg_blur_radial).mutate();
            int i3 = Theme.key_chat_editMediaButton;
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i3), PorterDuff.Mode.MULTIPLY));
            this.blurRadialButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate2, (Drawable) null, (Drawable) null);
            this.blurRadialButton.setTextColor(getThemedColor(i3));
            this.blurLinearButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_linear, 0, 0);
            this.blurLinearButton.setTextColor(-1);
        } else if (i == 2) {
            this.blurOffButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_off, 0, 0);
            this.blurOffButton.setTextColor(-1);
            this.blurRadialButton.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.msg_blur_radial, 0, 0);
            this.blurRadialButton.setTextColor(-1);
            Drawable drawableMutate3 = this.blurOffButton.getContext().getResources().getDrawable(R.drawable.msg_blur_linear).mutate();
            int i4 = Theme.key_chat_editMediaButton;
            drawableMutate3.setColorFilter(new PorterDuffColorFilter(getThemedColor(i4), PorterDuff.Mode.MULTIPLY));
            this.blurLinearButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate3, (Drawable) null, (Drawable) null);
            this.blurLinearButton.setTextColor(getThemedColor(i4));
        }
        updateFiltersEmpty();
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (this.paintingOverlay != null && view == this.textureView) {
            canvas.save();
            canvas.translate(this.textureView.getLeft(), this.textureView.getTop());
            if (this.bitmapMask != null && this.textureView.getVisibility() == 0) {
                this.maskRect.set(0, 0, this.textureView.getMeasuredWidth(), this.textureView.getMeasuredHeight());
                if (this.orientation != 0) {
                    this.maskMatrix.reset();
                    this.maskMatrix.postRotate(this.orientation, this.bitmapMask.getWidth() / 2.0f, this.bitmapMask.getHeight() / 2.0f);
                    float height = (this.bitmapMask.getHeight() - this.bitmapMask.getWidth()) / 2.0f;
                    this.maskMatrix.postTranslate(height, -height);
                    this.maskMatrix.postScale(this.maskRect.width() / this.bitmapMask.getHeight(), this.maskRect.height() / this.bitmapMask.getWidth());
                    canvas.drawBitmap(this.bitmapMask, this.maskMatrix, this.maskPaint);
                } else {
                    canvas.drawBitmap(this.bitmapMask, (Rect) null, this.maskRect, this.maskPaint);
                }
            }
            float measuredWidth = this.textureView.getMeasuredWidth() / this.paintingOverlay.getMeasuredWidth();
            canvas.scale(measuredWidth, measuredWidth);
            this.paintingOverlay.draw(canvas);
            canvas.restore();
        }
        return zDrawChild;
    }

    @Override
    public ByteBuffer fillAndGetCurveBuffer() {
        this.curvesToolValue.fillBuffer();
        return this.curvesToolValue.curveBuffer;
    }

    public Bitmap getBitmap() {
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            return filterGLThread.getTexture();
        }
        return null;
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
        return zzir.m(this.contrastValue, 100.0f, 0.3f, 1.0f);
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
        return Fragment$$ExternalSyntheticOutline0.m(this.highlightsValue, 0.75f, 100.0f, 100.0f);
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
        return Fragment$$ExternalSyntheticOutline0.m(this.shadowsValue, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return zzir.m(this.sharpenValue, 100.0f, 0.6f, 0.11f);
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
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread == null) {
            return null;
        }
        return filterGLThread.getUiBlurBitmap();
    }

    @Override
    public float getVignetteValue() {
        return this.vignetteValue / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return this.warmthValue / 100.0f;
    }

    public boolean hasChanges() {
        MediaController.SavedFilterState savedFilterState = this.lastState;
        if (savedFilterState != null) {
            return (this.enhanceValue == savedFilterState.enhanceValue && this.contrastValue == savedFilterState.contrastValue && this.highlightsValue == savedFilterState.highlightsValue && this.exposureValue == savedFilterState.exposureValue && this.warmthValue == savedFilterState.warmthValue && this.saturationValue == savedFilterState.saturationValue && this.vignetteValue == savedFilterState.vignetteValue && this.shadowsValue == savedFilterState.shadowsValue && this.grainValue == savedFilterState.grainValue && this.sharpenValue == savedFilterState.sharpenValue && this.fadeValue == savedFilterState.fadeValue && this.softenSkinValue == savedFilterState.softenSkinValue && this.tintHighlightsColor == savedFilterState.tintHighlightsColor && this.tintShadowsColor == savedFilterState.tintShadowsColor && this.curvesToolValue.shouldBeSkipped()) ? false : true;
        }
        return (this.enhanceValue == 0.0f && this.contrastValue == 0.0f && this.highlightsValue == 0.0f && this.exposureValue == 0.0f && this.warmthValue == 0.0f && this.saturationValue == 0.0f && this.vignetteValue == 0.0f && this.shadowsValue == 0.0f && this.grainValue == 0.0f && this.sharpenValue == 0.0f && this.fadeValue == 0.0f && this.softenSkinValue == 0.0f && this.tintHighlightsColor == 0 && this.tintShadowsColor == 0 && this.curvesToolValue.shouldBeSkipped()) ? false : true;
    }

    public void init() {
        this.textureView.setVisibility(0);
    }

    @Override
    public void onMeasure(int i, int i2) {
        fixLayout(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }

    @Override
    public boolean onTouch(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            TextureView textureView = this.textureView;
            if (textureView instanceof VideoEditTextureView) {
                if (((VideoEditTextureView) textureView).containsPoint(motionEvent.getX(), motionEvent.getY())) {
                    setShowOriginal(true);
                }
            } else if (motionEvent.getX() >= this.textureView.getX() && motionEvent.getY() >= this.textureView.getY() && motionEvent.getX() <= this.textureView.getX() + this.textureView.getWidth() && motionEvent.getY() <= this.textureView.getY() + this.textureView.getHeight()) {
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
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if ((childAt instanceof PhotoEditToolCell) && this.recyclerListView.getChildAdapterPosition(childAt) == this.enhanceTool) {
                ((PhotoEditToolCell) childAt).setIconAndTextAndValue(LocaleController.getString(R.string.Enhance), 0, this.enhanceValue);
                break;
            }
        }
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.requestRender(true);
        }
    }

    @Override
    public boolean shouldDrawCurvesPass() {
        return !this.curvesToolValue.shouldBeSkipped();
    }

    @Override
    public boolean shouldShowOriginal() {
        return this.showOriginal || this.filtersEmpty;
    }

    public void shutdown() {
        if (this.ownsTextureView) {
            FilterGLThread filterGLThread = this.eglThread;
            if (filterGLThread != null) {
                filterGLThread.shutdown();
                this.eglThread = null;
            }
            this.textureView.setVisibility(8);
            return;
        }
        TextureView textureView = this.textureView;
        if (textureView instanceof VideoEditTextureView) {
            VideoEditTextureView videoEditTextureView = (VideoEditTextureView) textureView;
            MediaController.SavedFilterState savedFilterState = this.lastState;
            if (savedFilterState == null) {
                videoEditTextureView.setDelegate(null);
                return;
            }
            FilterGLThread filterGLThread2 = this.eglThread;
            if (filterGLThread2 != null) {
                filterGLThread2.setFilterGLThreadDelegate(FilterShaders.getFilterShadersDelegate(savedFilterState));
            }
        }
    }

    public void switchMode() {
        int i = this.selectedTool;
        if (i == 0) {
            this.blurControl.setVisibility(4);
            this.blurLayout.setVisibility(4);
            this.curveLayout.setVisibility(4);
            this.curvesControl.setVisibility(4);
            this.recyclerListView.setVisibility(0);
            return;
        }
        if (i == 1) {
            this.recyclerListView.setVisibility(4);
            this.curveLayout.setVisibility(4);
            this.curvesControl.setVisibility(4);
            this.blurLayout.setVisibility(0);
            if (this.blurType != 0) {
                this.blurControl.setVisibility(0);
            }
            updateSelectedBlurType();
            return;
        }
        if (i == 2) {
            this.recyclerListView.setVisibility(4);
            this.blurLayout.setVisibility(4);
            this.blurControl.setVisibility(4);
            this.curveLayout.setVisibility(0);
            this.curvesControl.setVisibility(0);
            this.curvesToolValue.activeType = 0;
            int i2 = 0;
            while (i2 < 4) {
                this.curveRadioButton[i2].setChecked(i2 == 0, false);
                i2++;
            }
        }
    }

    public void updateColors() {
        TextView textView = this.doneTextView;
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_chat_editMediaButton));
        }
        ImageView imageView = this.tuneItem;
        if (imageView != null && imageView.getColorFilter() != null) {
            this.tuneItem.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView2 = this.blurItem;
        if (imageView2 != null && imageView2.getColorFilter() != null) {
            this.blurItem.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY));
        }
        ImageView imageView3 = this.curveItem;
        if (imageView3 != null && imageView3.getColorFilter() != null) {
            this.curveItem.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY));
        }
        updateSelectedBlurType();
    }

    public void updateUiBlurGradient(int i, int i2) {
        FilterGLThread filterGLThread = this.eglThread;
        if (filterGLThread != null) {
            filterGLThread.updateUiBlurGradient(i, i2);
        } else {
            this.gradientTop = i;
            this.gradientBottom = i2;
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
                public void onMeasure(int i7, int i8) {
                    View.MeasureSpec.getSize(i7);
                    super.onMeasure(i7, i8);
                }

                @Override
                public void setTransform(Matrix matrix) {
                    super.setTransform(matrix);
                    if (PhotoFilterView.this.eglThread != null) {
                        PhotoFilterView.this.eglThread.updateUiBlurTransform(matrix, getWidth(), getHeight());
                    }
                }
            };
            this.textureView = textureView;
            if (z2) {
                addView(textureView, LayoutHelper.createFrame(-1, -1, 51));
            }
            this.textureView.setVisibility(4);
            this.textureView.setSurfaceTextureListener(new AnonymousClass2(z2, blurManager));
        }
        PhotoFilterBlurControl photoFilterBlurControl = new PhotoFilterBlurControl(context);
        this.blurControl = photoFilterBlurControl;
        photoFilterBlurControl.setVisibility(4);
        if (z2) {
            addView(this.blurControl, LayoutHelper.createFrame(-1, -1, 51));
        }
        this.blurControl.setDelegate(new PhotoFilterView$$ExternalSyntheticLambda0(this));
        PhotoFilterCurvesControl photoFilterCurvesControl = new PhotoFilterCurvesControl(context, this.curvesToolValue);
        this.curvesControl = photoFilterCurvesControl;
        photoFilterCurvesControl.setDelegate(new PhotoFilterView$$ExternalSyntheticLambda0(this));
        this.curvesControl.setVisibility(4);
        if (z2) {
            addView(this.curvesControl, LayoutHelper.createFrame(-1, -1, 51));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.toolsView = frameLayout;
        addView(frameLayout, LayoutHelper.createFrame(-1, (!z2 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackgroundColor(-16777216);
        this.toolsView.addView(frameLayout2, LayoutHelper.createFrame(-1, 48, 83));
        TextView textView = new TextView(context);
        this.cancelTextView = textView;
        textView.setTextSize(1, 14.0f);
        this.cancelTextView.setTextColor(-1);
        this.cancelTextView.setGravity(17);
        this.cancelTextView.setBackgroundDrawable(Theme.createSelectorDrawable(-12763843, 0, -1));
        this.cancelTextView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        ArticleViewer$$ExternalSyntheticOutline0.m(R.string.Cancel, this.cancelTextView);
        this.cancelTextView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(this.cancelTextView, LayoutHelper.createFrame(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.doneTextView = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = this.doneTextView;
        int i7 = Theme.key_chat_editMediaButton;
        textView3.setTextColor(getThemedColor(i7));
        this.doneTextView.setGravity(17);
        this.doneTextView.setBackgroundDrawable(Theme.createSelectorDrawable(-12763843, 0, -1));
        this.doneTextView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        ArticleViewer$$ExternalSyntheticOutline0.m(R.string.Done, this.doneTextView);
        this.doneTextView.setTypeface(AndroidUtilities.bold());
        frameLayout2.addView(this.doneTextView, LayoutHelper.createFrame(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout2.addView(linearLayout, LayoutHelper.createFrame(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.tuneItem = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.tuneItem.setImageResource(R.drawable.msg_photo_settings);
        this.tuneItem.setColorFilter(new PorterDuffColorFilter(getThemedColor(i7), PorterDuff.Mode.MULTIPLY));
        this.tuneItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039, 1, -1));
        linearLayout.addView(this.tuneItem, LayoutHelper.createLinear(56, 48));
        final int i8 = 0;
        this.tuneItem.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i8) {
                    case 0:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$5(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$6(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$7(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$8(view);
                        break;
                    default:
                        this.f$0.lambda$new$9(view);
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.blurItem = imageView2;
        imageView2.setScaleType(scaleType);
        this.blurItem.setImageResource(R.drawable.msg_photo_blur);
        this.blurItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039, 1, -1));
        linearLayout.addView(this.blurItem, LayoutHelper.createLinear(56, 48));
        final int i9 = 1;
        this.blurItem.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$5(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$6(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$7(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$8(view);
                        break;
                    default:
                        this.f$0.lambda$new$9(view);
                        break;
                }
            }
        });
        if (videoEditTextureView != null) {
            this.blurItem.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.curveItem = imageView3;
        imageView3.setScaleType(scaleType);
        this.curveItem.setImageResource(R.drawable.msg_photo_curve);
        this.curveItem.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039, 1, -1));
        linearLayout.addView(this.curveItem, LayoutHelper.createLinear(56, 48));
        final int i10 = 2;
        this.curveItem.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$5(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$6(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$7(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$8(view);
                        break;
                    default:
                        this.f$0.lambda$new$9(view);
                        break;
                }
            }
        });
        this.recyclerListView = new RecyclerListViewWithShadows(context);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        linearLayoutManager.setOrientation(1);
        this.recyclerListView.setLayoutManager(linearLayoutManager);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setOverScrollMode(2);
        this.recyclerListView.setAdapter(new ToolsAdapter(context));
        this.toolsView.addView(this.recyclerListView, LayoutHelper.createFrame(-1, (!z2 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.curveLayout = frameLayout3;
        frameLayout3.setVisibility(4);
        this.toolsView.addView(this.curveLayout, LayoutHelper.createFrame(-1, 78.0f, 1, 0.0f, (!z2 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        this.curveLayout.addView(linearLayout2, LayoutHelper.createFrame(-2, -2, 1));
        for (int i11 = 0; i11 < 4; i11++) {
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setTag(Integer.valueOf(i11));
            this.curveRadioButton[i11] = new RadioButton(context);
            this.curveRadioButton[i11].setSize(AndroidUtilities.dp(20.0f));
            frameLayout4.addView(this.curveRadioButton[i11], LayoutHelper.createFrame(30, 30, 49));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 12.0f);
            textView4.setGravity(16);
            if (i11 == 0) {
                String string = LocaleController.getString(R.string.CurvesAll);
                textView4.setText(string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase());
                textView4.setTextColor(-1);
                this.curveRadioButton[i11].setColor(-1, -1);
            } else {
                if (i11 == 1) {
                    String string2 = LocaleController.getString(R.string.CurvesRed);
                    textView4.setText(string2.substring(0, 1).toUpperCase() + string2.substring(1).toLowerCase());
                    textView4.setTextColor(-1684147);
                    this.curveRadioButton[i11].setColor(-1684147, -1684147);
                } else if (i11 == 2) {
                    String string3 = LocaleController.getString(R.string.CurvesGreen);
                    textView4.setText(string3.substring(0, 1).toUpperCase() + string3.substring(1).toLowerCase());
                    textView4.setTextColor(-10831009);
                    this.curveRadioButton[i11].setColor(-10831009, -10831009);
                } else if (i11 == 3) {
                    String string4 = LocaleController.getString(R.string.CurvesBlue);
                    textView4.setText(string4.substring(0, 1).toUpperCase() + string4.substring(1).toLowerCase());
                    textView4.setTextColor(-12734994);
                    this.curveRadioButton[i11].setColor(-12734994, -12734994);
                }
                frameLayout4.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
                if (i11 == 0) {
                    f = 0.0f;
                } else {
                    f = 30.0f;
                }
                linearLayout2.addView(frameLayout4, LayoutHelper.createLinear(-2, -2, f, 0.0f, 0.0f, 0.0f));
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
                                this.f$0.lambda$new$3(view);
                                break;
                            case 1:
                                this.f$0.lambda$new$4(view);
                                break;
                            case 2:
                                this.f$0.lambda$new$5(view);
                                break;
                            case 3:
                                this.f$0.lambda$new$6(view);
                                break;
                            case 4:
                                this.f$0.lambda$new$7(view);
                                break;
                            case 5:
                                this.f$0.lambda$new$8(view);
                                break;
                            default:
                                this.f$0.lambda$new$9(view);
                                break;
                        }
                    }
                });
            }
            frameLayout4.addView(textView4, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            if (i11 == 0) {
                f = 0.0f;
            } else {
                f = 30.0f;
            }
            linearLayout2.addView(frameLayout4, LayoutHelper.createLinear(-2, -2, f, 0.0f, 0.0f, 0.0f));
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
                            this.f$0.lambda$new$3(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$4(view);
                            break;
                        case 2:
                            this.f$0.lambda$new$5(view);
                            break;
                        case 3:
                            this.f$0.lambda$new$6(view);
                            break;
                        case 4:
                            this.f$0.lambda$new$7(view);
                            break;
                        case 5:
                            this.f$0.lambda$new$8(view);
                            break;
                        default:
                            this.f$0.lambda$new$9(view);
                            break;
                    }
                }
            });
        }
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.blurLayout = frameLayout5;
        frameLayout5.setVisibility(4);
        this.toolsView.addView(this.blurLayout, LayoutHelper.createFrame(280, 60.0f, 1, 0.0f, (z2 ? 0 : 40) + 40, 0.0f, 0.0f));
        TextView textView5 = new TextView(context);
        this.blurOffButton = textView5;
        textView5.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        this.blurOffButton.setTextSize(1, 13.0f);
        this.blurOffButton.setGravity(1);
        this.blurOffButton.setText(LocaleController.getString(R.string.BlurOff));
        this.blurLayout.addView(this.blurOffButton, LayoutHelper.createFrame(80, 60.0f));
        final int i14 = 4;
        this.blurOffButton.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$5(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$6(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$7(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$8(view);
                        break;
                    default:
                        this.f$0.lambda$new$9(view);
                        break;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.blurRadialButton = textView6;
        textView6.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        this.blurRadialButton.setTextSize(1, 13.0f);
        this.blurRadialButton.setGravity(1);
        this.blurRadialButton.setText(LocaleController.getString(R.string.BlurRadial));
        this.blurLayout.addView(this.blurRadialButton, LayoutHelper.createFrame(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        final int i15 = 5;
        this.blurRadialButton.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$5(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$6(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$7(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$8(view);
                        break;
                    default:
                        this.f$0.lambda$new$9(view);
                        break;
                }
            }
        });
        TextView textView7 = new TextView(context);
        this.blurLinearButton = textView7;
        textView7.setCompoundDrawablePadding(AndroidUtilities.dp(2.0f));
        this.blurLinearButton.setTextSize(1, 13.0f);
        this.blurLinearButton.setGravity(1);
        this.blurLinearButton.setText(LocaleController.getString(R.string.BlurLinear));
        this.blurLayout.addView(this.blurLinearButton, LayoutHelper.createFrame(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        final int i16 = 6;
        this.blurLinearButton.setOnClickListener(new View.OnClickListener(this) {
            public final PhotoFilterView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        this.f$0.lambda$new$3(view);
                        break;
                    case 1:
                        this.f$0.lambda$new$4(view);
                        break;
                    case 2:
                        this.f$0.lambda$new$5(view);
                        break;
                    case 3:
                        this.f$0.lambda$new$6(view);
                        break;
                    case 4:
                        this.f$0.lambda$new$7(view);
                        break;
                    case 5:
                        this.f$0.lambda$new$8(view);
                        break;
                    default:
                        this.f$0.lambda$new$9(view);
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
}

package org.telegram.ui.Components.Paint.Views;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.Paint.Views.PaintWeightChooserView;
import org.telegram.ui.Components.Size;
public class MaskPaintView extends FrameLayout {
    private float baseScale;
    private Bitmap bitmapToEdit;
    public final FrameLayout buttonsLayout;
    public final TextView cancelButton;
    private int currentAccount;
    private MediaController.CropState currentCropState;
    public final TextView doneButton;
    private boolean eraser;
    private Rect exclusionRect;
    private ArrayList<Rect> exclusionRects;
    private boolean ignoreLayout;
    private boolean inBubbleMode;
    private int orientation;
    private Size paintingSize;
    private float panTranslationY;
    private DispatchQueue queue;
    private final RenderView renderView;
    private float transformX;
    private float transformY;
    private UndoStore undoStore;
    public PaintWeightChooserView weightChooserView;
    private PaintWeightChooserView.ValueOverride weightDefaultValueOverride;

    public int getAdditionalBottom() {
        return 0;
    }

    public int getAdditionalTop() {
        return 0;
    }

    protected void onDrawn() {
    }

    public void onRenderViewAlphaUpdate(ValueAnimator valueAnimator) {
    }

    public MaskPaintView(Context context, int i, Bitmap bitmap, Bitmap bitmap2, int i2, MediaController.CropState cropState) {
        super(context);
        this.weightDefaultValueOverride = new PaintWeightChooserView.ValueOverride() {
            @Override
            public float get() {
                Brush currentBrush = MaskPaintView.this.renderView.getCurrentBrush();
                return currentBrush == null ? PersistColorPalette.getInstance(MaskPaintView.this.currentAccount).getCurrentWeight() : PersistColorPalette.getInstance(MaskPaintView.this.currentAccount).getWeight("-1", currentBrush.getDefaultWeight());
            }

            @Override
            public void set(float f) {
                PersistColorPalette.getInstance(MaskPaintView.this.currentAccount).setWeight("-1", f);
                MaskPaintView.this.renderView.setBrushSize(f);
            }
        };
        this.exclusionRects = new ArrayList<>();
        this.exclusionRect = new Rect();
        this.currentAccount = i;
        this.inBubbleMode = context instanceof BubbleActivity;
        UndoStore undoStore = new UndoStore();
        this.undoStore = undoStore;
        undoStore.setDelegate(new UndoStore.UndoStoreDelegate(this) {
            @Override
            public void historyChanged() {
            }
        });
        this.queue = new DispatchQueue("MaskPaint");
        this.currentCropState = cropState;
        this.bitmapToEdit = bitmap;
        this.orientation = i2;
        RenderView renderView = new RenderView(context, new Painting(getPaintingSize(), bitmap2, i2, null).asMask(), bitmap, null, null);
        this.renderView = renderView;
        renderView.setAlpha(0.0f);
        renderView.setDelegate(new RenderView.RenderViewDelegate() {
            @Override
            public void invalidateInputView() {
                RenderView.RenderViewDelegate.CC.$default$invalidateInputView(this);
            }

            @Override
            public void resetBrush() {
            }

            @Override
            public boolean shouldDraw() {
                return true;
            }

            @Override
            public void onBeganDrawing() {
                MaskPaintView.this.weightChooserView.setViewHidden(true);
            }

            @Override
            public void onFinishedDrawing(boolean z) {
                MaskPaintView.this.undoStore.getDelegate().historyChanged();
                MaskPaintView.this.weightChooserView.setViewHidden(false);
                MaskPaintView.this.onDrawn();
            }

            @Override
            public void onFirstDraw() {
                ViewPropertyAnimator duration = MaskPaintView.this.renderView.animate().alpha(1.0f).setDuration(320L);
                final MaskPaintView maskPaintView = MaskPaintView.this;
                duration.setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        MaskPaintView.this.onRenderViewAlphaUpdate(valueAnimator);
                    }
                }).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }
        });
        renderView.setUndoStore(this.undoStore);
        renderView.setQueue(this.queue);
        renderView.setVisibility(4);
        renderView.setBrush(new Brush.Radial());
        renderView.setBrushSize(this.weightDefaultValueOverride.get());
        renderView.setColor(-65536);
        addView(renderView, LayoutHelper.createFrame(-1, -1, 51));
        PaintWeightChooserView paintWeightChooserView = new PaintWeightChooserView(context);
        this.weightChooserView = paintWeightChooserView;
        paintWeightChooserView.setMinMax(0.05f, 1.0f);
        this.weightChooserView.setBrushWeight(this.weightDefaultValueOverride.get());
        this.weightChooserView.setRenderView(renderView);
        this.weightChooserView.setValueOverride(this.weightDefaultValueOverride);
        this.weightChooserView.setTranslationX(-AndroidUtilities.dp(18.0f));
        this.weightChooserView.setAlpha(0.0f);
        addView(this.weightChooserView, LayoutHelper.createFrame(-1, -1.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonsLayout = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, LayoutHelper.createFrame(-1, 44, 80));
        TextView textView = new TextView(context);
        this.cancelButton = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(-1, 0.15f), 3));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.doneButton = textView2;
        textView2.setTextSize(1, 15.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        int i3 = Theme.key_chat_editMediaButton;
        textView2.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(Theme.getColor(i3), 0.15f), 3));
        textView2.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView2.setText(LocaleController.getString(R.string.Save).toUpperCase());
        textView2.setTextColor(Theme.getColor(i3));
        textView2.setGravity(17);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    public boolean canUndo() {
        return this.undoStore.canUndo();
    }

    public boolean undo() {
        if (this.undoStore.canUndo()) {
            this.undoStore.undo();
            return true;
        }
        return false;
    }

    private Size getPaintingSize() {
        float f;
        float f2;
        Size size = this.paintingSize;
        if (size != null) {
            return size;
        }
        Size size2 = new Size(this.bitmapToEdit.getWidth(), this.bitmapToEdit.getHeight());
        float f3 = 1280;
        size2.width = f3;
        float floor = (float) Math.floor((f3 * f2) / f);
        size2.height = floor;
        if (floor > f3) {
            size2.height = f3;
            size2.width = (float) Math.floor((f3 * f) / f2);
        }
        this.paintingSize = size2;
        return size2;
    }

    public void setEraser(boolean z) {
        if (this.eraser == z) {
            return;
        }
        this.eraser = z;
        this.renderView.setBrush(z ? new Brush.Eraser() : new Brush.Radial());
    }

    public void setTransform(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        float f9;
        float f10;
        MediaController.CropState cropState;
        float f11;
        this.transformX = f2;
        float f12 = f3 + this.panTranslationY;
        this.transformY = f12;
        int i = 0;
        while (i < 1) {
            if (i == 0) {
                RenderView renderView = this.renderView;
                MediaController.CropState cropState2 = this.currentCropState;
                if (cropState2 != null) {
                    float f13 = cropState2.cropScale * 1.0f;
                    int measuredWidth = renderView.getMeasuredWidth();
                    int measuredHeight = renderView.getMeasuredHeight();
                    if (measuredWidth == 0 || measuredHeight == 0) {
                        return;
                    }
                    int i2 = this.currentCropState.transformRotation;
                    if (i2 == 90 || i2 == 270) {
                        measuredHeight = measuredWidth;
                        measuredWidth = measuredHeight;
                    }
                    float f14 = measuredWidth;
                    float max = Math.max(f5 / ((int) (cropState.cropPw * f14)), f6 / ((int) (cropState.cropPh * f11)));
                    f7 = f13 * max;
                    MediaController.CropState cropState3 = this.currentCropState;
                    float f15 = cropState3.cropScale;
                    f9 = (cropState3.cropPx * f14 * f * max * f15) + f2;
                    f10 = (cropState3.cropPy * measuredHeight * f * max * f15) + f12;
                    f8 = f4 + cropState3.cropRotate + i2;
                } else {
                    f7 = i == 0 ? this.baseScale * 1.0f : 1.0f;
                    f8 = f4;
                    f9 = f2;
                    f10 = f12;
                }
                float f16 = f7 * f;
                float f17 = Float.isNaN(f16) ? 1.0f : f16;
                renderView.setScaleX(f17);
                renderView.setScaleY(f17);
                renderView.setTranslationX(f9);
                renderView.setTranslationY(f10);
                renderView.setRotation(f8);
                renderView.invalidate();
            }
            i++;
        }
        invalidate();
    }

    public void init() {
        this.renderView.setVisibility(0);
        this.buttonsLayout.setVisibility(0);
        this.buttonsLayout.setTranslationY(AndroidUtilities.dp(18.0f));
        ViewPropertyAnimator translationY = this.buttonsLayout.animate().alpha(1.0f).translationY(0.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        translationY.setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
        this.weightChooserView.animate().alpha(1.0f).translationX(0.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        this.ignoreLayout = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int i3 = AndroidUtilities.displaySize.y;
        Bitmap bitmap = this.bitmapToEdit;
        if (bitmap != null) {
            f2 = bitmap.getWidth();
            f = this.bitmapToEdit.getHeight();
        } else {
            f = size2;
            f2 = size;
        }
        float f3 = size;
        float floor = (float) Math.floor((f3 * f) / f2);
        float f4 = i3;
        if (floor > f4) {
            f3 = (float) Math.floor((f2 * f4) / f);
            floor = f4;
        }
        this.renderView.measure(View.MeasureSpec.makeMeasureSpec((int) f3, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.baseScale = 1.0f;
        measureChild(this.weightChooserView, i, i2);
        measureChild(this.buttonsLayout, i, i2);
        this.ignoreLayout = false;
        if (Build.VERSION.SDK_INT >= 29) {
            this.exclusionRects.clear();
            this.exclusionRects.add(this.exclusionRect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            this.exclusionRect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(this.exclusionRects);
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (Build.VERSION.SDK_INT >= 21 && !this.inBubbleMode) {
            int i7 = AndroidUtilities.statusBarHeight;
        }
        int ceil = (int) Math.ceil((i5 - this.renderView.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i6 - this.renderView.getMeasuredHeight()) / 2;
        RenderView renderView = this.renderView;
        renderView.layout(ceil, measuredHeight, renderView.getMeasuredWidth() + ceil, this.renderView.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.buttonsLayout;
        frameLayout.layout(0, i6 - frameLayout.getMeasuredHeight(), this.buttonsLayout.getMeasuredWidth(), i6);
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i = 0;
        if (view == this.renderView && this.currentCropState != null) {
            canvas.save();
            if (Build.VERSION.SDK_INT >= 21 && !this.inBubbleMode) {
                i = AndroidUtilities.statusBarHeight;
            }
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            MediaController.CropState cropState = this.currentCropState;
            int i2 = cropState.transformRotation;
            if (i2 == 90 || i2 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float scaleX = measuredWidth * cropState.cropPw * view.getScaleX();
            MediaController.CropState cropState2 = this.currentCropState;
            int i3 = (int) (scaleX / cropState2.cropScale);
            int scaleY = (int) (((measuredHeight * cropState2.cropPh) * view.getScaleY()) / this.currentCropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - i3) / 2.0f)) + this.transformX;
            float measuredHeight2 = (((((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f)) + getAdditionalBottom()) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i + this.transformY;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, measuredHeight2), Math.min(ceil + i3, getMeasuredWidth()), Math.min(getMeasuredHeight(), measuredHeight2 + scaleY));
            i = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public boolean onTouch(MotionEvent motionEvent) {
        float x = ((motionEvent.getX() - this.renderView.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / this.renderView.getScaleX();
        float y = ((motionEvent.getY() - this.renderView.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / this.renderView.getScaleY();
        double d = x;
        double radians = (float) Math.toRadians(-this.renderView.getRotation());
        double cos = Math.cos(radians);
        Double.isNaN(d);
        double d2 = y;
        double sin = Math.sin(radians);
        Double.isNaN(d2);
        float measuredWidth = ((float) ((cos * d) - (sin * d2))) + (this.renderView.getMeasuredWidth() / 2.0f);
        double sin2 = Math.sin(radians);
        Double.isNaN(d);
        double cos2 = Math.cos(radians);
        Double.isNaN(d2);
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, ((float) ((d * sin2) + (d2 * cos2))) + (this.renderView.getMeasuredHeight() / 2.0f));
        this.renderView.onTouch(obtain);
        obtain.recycle();
        return true;
    }

    public Bitmap getBitmap() {
        Bitmap resultBitmap = this.renderView.getResultBitmap(false, false);
        if (this.orientation != 0) {
            int width = resultBitmap.getWidth();
            int height = resultBitmap.getHeight();
            if ((this.orientation / 90) % 2 != 0) {
                width = resultBitmap.getHeight();
                height = resultBitmap.getWidth();
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(width / 2.0f, height / 2.0f);
            canvas.rotate(-this.orientation);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((-resultBitmap.getWidth()) / 2.0f, (-resultBitmap.getHeight()) / 2.0f, resultBitmap.getWidth() / 2.0f, resultBitmap.getHeight() / 2.0f);
            canvas.drawBitmap(resultBitmap, (Rect) null, rectF, new Paint(3));
            resultBitmap.recycle();
            return createBitmap;
        }
        return resultBitmap;
    }

    public RenderView getRenderView() {
        return this.renderView;
    }

    public void shutdown() {
        this.renderView.shutdown();
        this.queue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                MaskPaintView.lambda$shutdown$0();
            }
        });
    }

    public static void lambda$shutdown$0() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            myLooper.quit();
        }
    }
}

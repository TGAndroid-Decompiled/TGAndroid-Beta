package org.telegram.ui.Components.Paint.Views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline1;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions$$ExternalSyntheticLambda4;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.Painting;
import org.telegram.ui.Components.Paint.RenderView;
import org.telegram.ui.Components.Paint.UndoStore;
import org.telegram.ui.Components.Size;
import org.telegram.ui.PhotoViewer;

public abstract class MaskPaintView extends FrameLayout {
    public float baseScale;
    public final Bitmap bitmapToEdit;
    public final FrameLayout buttonsLayout;
    public final TextView cancelButton;
    public final int currentAccount;
    public final MediaController.CropState currentCropState;
    public final TextView doneButton;
    public boolean eraser;
    public final Rect exclusionRect;
    public final ArrayList exclusionRects;
    public boolean ignoreLayout;
    public final boolean inBubbleMode;
    public final int orientation;
    public Size paintingSize;
    public final DispatchQueue queue;
    public final RenderView renderView;
    public float transformX;
    public float transformY;
    public final UndoStore undoStore;
    public final PaintWeightChooserView weightChooserView;

    public final class AnonymousClass2 implements UndoStore.UndoStoreDelegate {
        @Override
        public final void historyChanged() {
        }
    }

    public MaskPaintView(Context context, int i, Bitmap bitmap, Bitmap bitmap2, int i2, MediaController.CropState cropState) {
        super(context);
        PhotoViewer.AnonymousClass18 anonymousClass18 = new PhotoViewer.AnonymousClass18(this, 16);
        this.exclusionRects = new ArrayList();
        this.exclusionRect = new Rect();
        this.currentAccount = i;
        this.inBubbleMode = context instanceof BubbleActivity;
        UndoStore undoStore = new UndoStore();
        this.undoStore = undoStore;
        undoStore.delegate = new AnonymousClass2();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.queue = dispatchQueue;
        this.currentCropState = cropState;
        this.bitmapToEdit = bitmap;
        this.orientation = i2;
        Painting painting = new Painting(getPaintingSize(), bitmap2, i2, null);
        painting.masking = true;
        RenderView renderView = new RenderView(context, painting, bitmap, null, null);
        this.renderView = renderView;
        renderView.setAlpha(0.0f);
        renderView.setDelegate(new RenderView.RenderViewDelegate() {
            @Override
            public final void invalidateInputView() {
            }

            @Override
            public final void onBeganDrawing() {
                MaskPaintView.this.weightChooserView.setViewHidden(true);
            }

            @Override
            public final void onFinishedDrawing() {
                MaskPaintView maskPaintView = MaskPaintView.this;
                maskPaintView.undoStore.delegate.historyChanged();
                maskPaintView.weightChooserView.setViewHidden(false);
                PhotoViewer photoViewer = PhotoViewer.this;
                Drawable[] drawableArr = PhotoViewer.progressDrawables;
                photoViewer.showEditStickerMode(true, true);
            }

            @Override
            public final void onFirstDraw() {
                MaskPaintView maskPaintView = MaskPaintView.this;
                maskPaintView.renderView.animate().alpha(1.0f).setDuration(320L).setUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(maskPaintView, 19)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            @Override
            public final void resetBrush() {
            }

            @Override
            public final boolean shouldDraw() {
                return true;
            }
        });
        renderView.setUndoStore(undoStore);
        renderView.setQueue(dispatchQueue);
        renderView.setVisibility(4);
        renderView.setBrush(new Brush.Radial());
        renderView.setBrushSize(anonymousClass18.get());
        renderView.setColor(-65536);
        addView(renderView, LayoutHelper.createFrame(-1, -1, 51));
        PaintWeightChooserView paintWeightChooserView = new PaintWeightChooserView(context);
        this.weightChooserView = paintWeightChooserView;
        paintWeightChooserView.min = 0.05f;
        paintWeightChooserView.max = 1.0f;
        paintWeightChooserView.invalidate();
        paintWeightChooserView.setBrushWeight(anonymousClass18.get());
        paintWeightChooserView.setRenderView(renderView);
        paintWeightChooserView.setValueOverride(anonymousClass18);
        paintWeightChooserView.setTranslationX(-AndroidUtilities.dp(18.0f));
        paintWeightChooserView.setAlpha(0.0f);
        addView(paintWeightChooserView, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonsLayout = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, LayoutHelper.createFrame(-1, 44, 80));
        TextView textView = new TextView(context);
        this.cancelButton = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.doneButton = textView2;
        zzkk.m(15.0f, 1, textView2);
        int i3 = Theme.key_chat_editMediaButton;
        textView2.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.15f, Theme.getColor(null, i3, false)), 3, -1));
        textView2.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView2.setText(LocaleController.getString(R.string.Save).toUpperCase());
        textView2.setTextColor(Theme.getColor(null, i3, false));
        textView2.setGravity(17);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private Size getPaintingSize() {
        Size size = this.paintingSize;
        if (size != null) {
            return size;
        }
        Bitmap bitmap = this.bitmapToEdit;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        Size size2 = new Size(width, height);
        float f = 1280;
        size2.width = f;
        float fFloor = (float) Math.floor((f * height) / width);
        size2.height = fFloor;
        if (fFloor > f) {
            size2.height = f;
            size2.width = (float) Math.floor((f * width) / height);
        }
        this.paintingSize = size2;
        return size2;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        MediaController.CropState cropState;
        int i = 0;
        if (view == this.renderView && (cropState = this.currentCropState) != null) {
            canvas.save();
            i = this.inBubbleMode ? 0 : AndroidUtilities.statusBarHeight;
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = cropState.transformRotation;
            if (i2 != 90 && i2 != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredHeight * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredWidth * cropState.cropPh)) / cropState.cropScale);
            float fCeil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.transformX;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i + this.transformY;
            canvas.clipRect(Math.max(0.0f, fCeil), Math.max(0.0f, additionalBottom), Math.min(fCeil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i = 1;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return zDrawChild;
    }

    public int getAdditionalBottom() {
        return 0;
    }

    public int getAdditionalTop() {
        return 0;
    }

    public Bitmap getBitmap() {
        Bitmap resultBitmap = this.renderView.getResultBitmap(false, false);
        int i = this.orientation;
        if (i == 0) {
            return resultBitmap;
        }
        int width = resultBitmap.getWidth();
        int height = resultBitmap.getHeight();
        if ((i / 90) % 2 != 0) {
            width = resultBitmap.getHeight();
            height = resultBitmap.getWidth();
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.translate(width / 2.0f, height / 2.0f);
        canvas.rotate(-i);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set((-resultBitmap.getWidth()) / 2.0f, (-resultBitmap.getHeight()) / 2.0f, resultBitmap.getWidth() / 2.0f, resultBitmap.getHeight() / 2.0f);
        canvas.drawBitmap(resultBitmap, (Rect) null, rectF, new Paint(3));
        resultBitmap.recycle();
        return bitmapCreateBitmap;
    }

    public RenderView getRenderView() {
        return this.renderView;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (!this.inBubbleMode) {
            int i7 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        RenderView renderView = this.renderView;
        int iCeil = (int) Math.ceil((i5 - renderView.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i6 - renderView.getMeasuredHeight()) / 2;
        renderView.layout(iCeil, measuredHeight, renderView.getMeasuredWidth() + iCeil, renderView.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.buttonsLayout;
        frameLayout.layout(0, i6 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i6);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float height;
        float width;
        this.ignoreLayout = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int i3 = AndroidUtilities.displaySize.y;
        Bitmap bitmap = this.bitmapToEdit;
        if (bitmap != null) {
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        } else {
            height = size2;
            width = size;
        }
        float fFloor = size;
        float fFloor2 = (float) Math.floor((fFloor * height) / width);
        float f = i3;
        if (fFloor2 > f) {
            fFloor = (float) Math.floor((width * f) / height);
            fFloor2 = f;
        }
        this.renderView.measure(View.MeasureSpec.makeMeasureSpec((int) fFloor, 1073741824), View.MeasureSpec.makeMeasureSpec((int) fFloor2, 1073741824));
        this.baseScale = 1.0f;
        measureChild(this.weightChooserView, i, i2);
        measureChild(this.buttonsLayout, i, i2);
        this.ignoreLayout = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.exclusionRects;
            arrayList.clear();
            Rect rect = this.exclusionRect;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    public final void onTouch(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        RenderView renderView = this.renderView;
        float translationX = ((x - renderView.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / renderView.getScaleX();
        float y = ((motionEvent.getY() - renderView.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / renderView.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-renderView.getRotation());
        double d2 = y;
        float measuredWidth = (renderView.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (renderView.getMeasuredHeight() / 2.0f) + ((float) AndroidUtilities$$ExternalSyntheticOutline1.m(radians, d2, Math.sin(radians) * d));
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setLocation(measuredWidth, measuredHeight);
        renderView.onTouch(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override
    public final void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z) {
        if (this.eraser == z) {
            return;
        }
        this.eraser = z;
        this.renderView.setBrush(z ? new Brush.Eraser() : new Brush.Radial());
    }

    public final void setTransform(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        this.transformX = f2;
        float f9 = 0.0f + f3;
        this.transformY = f9;
        RenderView renderView = this.renderView;
        MediaController.CropState cropState = this.currentCropState;
        if (cropState != null) {
            float f10 = cropState.cropScale * 1.0f;
            int measuredWidth = renderView.getMeasuredWidth();
            int measuredHeight = renderView.getMeasuredHeight();
            if (measuredWidth == 0 || measuredHeight == 0) {
                return;
            }
            int i = cropState.transformRotation;
            if (i != 90 && i != 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            float f11 = measuredHeight;
            float f12 = measuredWidth;
            float fMax = Math.max(f5 / ((int) (cropState.cropPw * f11)), f6 / ((int) (cropState.cropPh * f12)));
            f7 = f10 * fMax;
            float fM = MediaController$$ExternalSyntheticOutline0.m(cropState.cropPx, f11, f, fMax);
            float f13 = cropState.cropScale;
            f2 += fM * f13;
            f9 += cropState.cropPy * f12 * f * fMax * f13;
            f8 = cropState.cropRotate + i + f4;
        } else {
            f7 = this.baseScale * 1.0f;
            f8 = f4;
        }
        float f14 = f * f7;
        float f15 = Float.isNaN(f14) ? 1.0f : f14;
        renderView.setScaleX(f15);
        renderView.setScaleY(f15);
        renderView.setTranslationX(f2);
        renderView.setTranslationY(f9);
        renderView.setRotation(f8);
        renderView.invalidate();
        invalidate();
    }
}

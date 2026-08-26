package org.telegram.ui.Components.Paint;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Consumer;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.CacheControlActivity;
import org.telegram.ui.Components.ColorPicker;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.PaintColorsListView;
import org.telegram.ui.Components.Paint.Views.PipettePickerView;
import org.telegram.ui.Components.SearchField$$ExternalSyntheticLambda0;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.PassportActivity;
import org.telegram.ui.PaymentFormActivity$$ExternalSyntheticLambda11;
import org.telegram.ui.iv.RichTextCell$$ExternalSyntheticLambda3;

public final class ColorPickerBottomSheet extends BottomSheet {
    public static final int $r8$clinit = 0;
    public final CacheControlActivity.ClearingCacheView.ProgressView alphaPickerView;
    public Consumer colorListener;
    public final ImageView doneView;
    public boolean initialized;
    public int mColor;
    public final android.graphics.Path path;
    public final ColorPicker.AnonymousClass1 pickerView;
    public PipetteDelegate pipetteDelegate;
    public final ImageView pipetteView;

    public final class AnonymousClass1 extends PipettePickerView {
        public AnonymousClass1(Context context, Bitmap bitmap) {
            super(context, bitmap);
        }
    }

    public final class ColorSliderView extends View {
        public final Paint colorPaint;
        public int filledColor;
        public int mode;
        public final Paint outlinePaint;

        public ColorSliderView(Context context) {
            super(context);
            this.colorPaint = new Paint(1);
            Paint paint = new Paint(1);
            this.outlinePaint = paint;
            paint.setColor(-1);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        }

        public final void invalidateShader() {
            int iArgb;
            int iArgb2;
            int i = this.mode;
            ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
            if (i == 1) {
                iArgb = Color.argb(255, Color.red(colorPickerBottomSheet.mColor), 0, Color.blue(colorPickerBottomSheet.mColor));
                iArgb2 = Color.argb(255, Color.red(colorPickerBottomSheet.mColor), 255, Color.blue(colorPickerBottomSheet.mColor));
            } else if (i != 2) {
                iArgb = Color.argb(255, 0, Color.green(colorPickerBottomSheet.mColor), Color.blue(colorPickerBottomSheet.mColor));
                iArgb2 = Color.argb(255, 255, Color.green(colorPickerBottomSheet.mColor), Color.blue(colorPickerBottomSheet.mColor));
            } else {
                iArgb = Color.argb(255, Color.red(colorPickerBottomSheet.mColor), Color.green(colorPickerBottomSheet.mColor), 0);
                iArgb2 = Color.argb(255, Color.red(colorPickerBottomSheet.mColor), Color.green(colorPickerBottomSheet.mColor), 255);
            }
            this.colorPaint.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{iArgb, iArgb2}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            int iGreen;
            super.onDraw(canvas);
            float height = getHeight() / 2.0f;
            float fDp = AndroidUtilities.dp(6.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fDp, height - fDp, getWidth() - fDp, height + fDp);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), this.colorPaint);
            int i = this.mode;
            ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
            if (i != 1) {
                iGreen = i != 2 ? Color.red(colorPickerBottomSheet.mColor) : Color.blue(colorPickerBottomSheet.mColor);
            } else {
                iGreen = Color.green(colorPickerBottomSheet.mColor);
            }
            float f = iGreen / 255.0f;
            float fDp2 = AndroidUtilities.dp(13.0f);
            Paint paint = this.outlinePaint;
            float strokeWidth = fDp2 - (paint.getStrokeWidth() / 2.0f);
            float fMax = Math.max(fDp + strokeWidth, (((getWidth() - (2.0f * fDp)) * f) + fDp) - strokeWidth);
            canvas.drawCircle(fMax, height, fDp2, paint);
            PaintColorsListView.drawColorCircle(fMax, height, strokeWidth, this.filledColor, canvas);
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            invalidateShader();
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    updatePosition(motionEvent.getX());
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
                return true;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            updatePosition(motionEvent.getX());
            return true;
        }

        public final void updatePosition(float f) {
            int iArgb;
            float fDp = AndroidUtilities.dp(6.0f);
            float fClamp = MathUtils.clamp(((f - fDp) + (AndroidUtilities.dp(13.0f) - (this.outlinePaint.getStrokeWidth() / 2.0f))) / (getWidth() - (fDp * 2.0f)), 0.0f, 1.0f);
            int i = this.mode;
            ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
            if (i != 1) {
                iArgb = i != 2 ? Color.argb(255, (int) (fClamp * 255.0f), Color.green(colorPickerBottomSheet.mColor), Color.blue(colorPickerBottomSheet.mColor)) : Color.argb(255, Color.red(colorPickerBottomSheet.mColor), Color.green(colorPickerBottomSheet.mColor), (int) (fClamp * 255.0f));
            } else {
                iArgb = Color.argb(255, Color.red(colorPickerBottomSheet.mColor), (int) (fClamp * 255.0f), Color.blue(colorPickerBottomSheet.mColor));
            }
            colorPickerBottomSheet.onSetColor(ColorUtils.setAlphaComponent(iArgb, Color.alpha(colorPickerBottomSheet.mColor)), 4);
            invalidate();
        }
    }

    public final class GradientPickerView extends View {
        public final Paint gradientPaint;
        public final float[] hsv;
        public final Paint outlinePaint;
        public float positionX;
        public float positionY;
        public final Drawable shadowDrawable;
        public final Paint whiteBlackPaint;

        public GradientPickerView(Context context) {
            super(context);
            this.gradientPaint = new Paint(1);
            this.whiteBlackPaint = new Paint(1);
            Paint paint = new Paint(1);
            this.outlinePaint = paint;
            this.hsv = new float[3];
            setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
            paint.setColor(-1);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            this.shadowDrawable = context.getDrawable(R.drawable.knob_shadow);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.gradientPaint);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.whiteBlackPaint);
            float fDp = AndroidUtilities.dp(13.0f);
            Paint paint = this.outlinePaint;
            float strokeWidth = fDp - (paint.getStrokeWidth() / 2.0f);
            float fDp2 = AndroidUtilities.dp(16.0f);
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f = width;
            float fClamp = MathUtils.clamp(this.positionX * f, fDp2, f - fDp2) + getPaddingLeft();
            float f2 = height;
            float fClamp2 = MathUtils.clamp(this.positionY * f2, fDp2, f2 - fDp2) + getPaddingTop();
            Rect rect = AndroidUtilities.rectTmp2;
            Drawable drawable = this.shadowDrawable;
            drawable.getPadding(rect);
            int i = (int) ((fClamp - fDp) - rect.left);
            int i2 = (int) ((fClamp2 - fDp) - rect.top);
            float f3 = rect.bottom;
            drawable.setBounds(i, i2, (int) (fClamp + fDp + f3), (int) (fClamp2 + fDp + f3));
            drawable.draw(canvas);
            canvas.drawCircle(fClamp, fClamp2, fDp, paint);
            PaintColorsListView.drawColorCircle(fClamp, fClamp2, strokeWidth, ColorUtils.setAlphaComponent(ColorPickerBottomSheet.this.mColor, 255), canvas);
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.gradientPaint.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i2 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
            this.whiteBlackPaint.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, android.graphics.Shader.TileMode.MIRROR));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
                updatePosition(motionEvent);
            } else if (actionMasked == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
                updatePosition(motionEvent);
            } else if (actionMasked == 2) {
                updatePosition(motionEvent);
            } else if (actionMasked == 3) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            return true;
        }

        public final void updatePosition(MotionEvent motionEvent) {
            this.positionX = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
            float y = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
            this.positionY = y;
            float[] fArr = this.hsv;
            fArr[0] = y * 360.0f;
            float f = this.positionX;
            if (f <= 0.22f || f >= 0.78f) {
                fArr[1] = AndroidUtilities.lerp(1.0f, 0.0f, f <= 0.22f ? 1.0f - (f / 0.22f) : (f - 0.78f) / 0.22000003f);
                float f2 = this.positionX;
                fArr[2] = f2 > 0.22f ? AndroidUtilities.lerp(1.0f, 0.0f, (f2 - 0.78f) / 0.22000003f) : 1.0f;
            } else {
                fArr[1] = 1.0f;
                fArr[2] = 1.0f;
            }
            int iHSVToColor = Color.HSVToColor(fArr);
            ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
            colorPickerBottomSheet.mColor = iHSVToColor;
            colorPickerBottomSheet.onSetColor(iHSVToColor, 0);
            invalidate();
        }
    }

    public final class GridPickerView extends View {
        public final HashMap colorMap;
        public final int[] colors;
        public final Paint paint;
        public final float[] radii;
        public long selected;
        public final Paint selectorPaint;
        public final android.graphics.Path selectorPath;
        public final LongSparseArray selectors;

        public GridPickerView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.colors = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
            Paint paint = new Paint(1);
            this.selectorPaint = paint;
            this.selectors = new LongSparseArray();
            this.selected = Long.MIN_VALUE;
            this.selectorPath = new android.graphics.Path();
            this.radii = new float[8];
            this.colorMap = new HashMap();
            setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(3.0f));
            paint.setColor(-1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setStrokeJoin(Paint.Join.ROUND);
            for (int i = 0; i < 12; i++) {
                for (int i2 = 0; i2 < 10; i2++) {
                    if (i2 == 0) {
                        this.colorMap.put(Long.valueOf(((long) (i << 16)) + ((long) i2)), Integer.valueOf(ColorUtils.blendARGB(i / 11.0f, -1, -16777216)));
                    } else {
                        this.colorMap.put(Long.valueOf(((long) (i << 16)) + ((long) i2)), Integer.valueOf(i2 < 6 ? ColorUtils.blendARGB(((5 - i2) / 4.0f) * 0.5f, this.colors[i], -16777216) : ColorUtils.blendARGB(TextureRenderer$$ExternalSyntheticOutline0.m(9 - i2, 5.0f, 0.5f, 0.5f), this.colors[i], -1)));
                    }
                }
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            HashMap map;
            super.onDraw(canvas);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.save();
            ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
            colorPickerBottomSheet.path.rewind();
            colorPickerBottomSheet.path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), android.graphics.Path.Direction.CW);
            canvas.clipPath(colorPickerBottomSheet.path);
            float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
            float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
            int i = 0;
            while (true) {
                map = this.colorMap;
                if (i >= 12) {
                    break;
                }
                for (int i2 = 0; i2 < 10; i2++) {
                    Integer num = (Integer) map.get(Long.valueOf(((long) (i << 16)) + ((long) i2)));
                    if (num != null) {
                        Paint paint = this.paint;
                        paint.setColor(num.intValue());
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set((i * width) + getPaddingLeft(), (i2 * height) + getPaddingTop(), ((i + 1) * width) + getPaddingLeft(), ((i2 + 1) * height) + getPaddingTop());
                        canvas.drawRect(rectF2, paint);
                    }
                }
                i++;
            }
            canvas.restore();
            int i3 = 0;
            while (true) {
                LongSparseArray longSparseArray = this.selectors;
                if (i3 >= longSparseArray.size()) {
                    return;
                }
                long jKeyAt = longSparseArray.keyAt(i3);
                float fFloatValue = ((Float) longSparseArray.valueAt(i3)).floatValue();
                float fMin = this.selected == jKeyAt ? Math.min(1.0f, fFloatValue + 0.045714285f) : Math.max(0.0f, fFloatValue - 0.10666667f);
                int i4 = (int) (jKeyAt >> 16);
                int i5 = (int) (jKeyAt - ((long) (i4 << 16)));
                Integer num2 = (Integer) map.get(Long.valueOf(jKeyAt));
                Paint paint2 = this.selectorPaint;
                if (num2 != null) {
                    paint2.setColor(AndroidUtilities.computePerceivedBrightness(num2.intValue()) > 0.721f ? -15658735 : -1);
                }
                paint2.setStrokeWidth(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(fMin) * AndroidUtilities.dp(3.0f));
                android.graphics.Path path = this.selectorPath;
                path.rewind();
                RectF rectF3 = AndroidUtilities.rectTmp;
                float f = width;
                float f2 = height;
                HashMap map2 = map;
                rectF3.set((i4 * f) + getPaddingLeft(), (i5 * f2) + getPaddingTop(), ((i4 + 1) * f) + getPaddingLeft(), ((i5 + 1) * f2) + getPaddingTop());
                float fDp = (i4 == 0 && i5 == 0) ? AndroidUtilities.dp(10.0f) : 0.0f;
                float[] fArr = this.radii;
                fArr[1] = fDp;
                fArr[0] = fDp;
                float fDp2 = (i4 == 11 && i5 == 0) ? AndroidUtilities.dp(10.0f) : 0.0f;
                fArr[3] = fDp2;
                fArr[2] = fDp2;
                float fDp3 = (i4 == 11 && i5 == 9) ? AndroidUtilities.dp(10.0f) : 0.0f;
                fArr[5] = fDp3;
                fArr[4] = fDp3;
                float fDp4 = (i4 == 0 && i5 == 9) ? AndroidUtilities.dp(10.0f) : 0.0f;
                fArr[7] = fDp4;
                fArr[6] = fDp4;
                path.addRoundRect(rectF3, fArr, android.graphics.Path.Direction.CW);
                canvas.drawPath(path, paint2);
                if (fMin > 0.0f || this.selected == jKeyAt) {
                    if (fMin < 1.0f) {
                        invalidate();
                    }
                    longSparseArray.setValueAt(i3, Float.valueOf(fMin));
                } else {
                    longSparseArray.removeAt(i3);
                    i3--;
                    invalidate();
                }
                i3++;
                width = f;
                height = f2;
                map = map2;
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1) {
                    updatePosition(motionEvent);
                } else if (actionMasked == 2) {
                    updatePosition(motionEvent);
                } else if (actionMasked == 3) {
                }
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                updatePosition(motionEvent);
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            return true;
        }

        public final void setCurrentColor(int i) {
            for (Map.Entry entry : this.colorMap.entrySet()) {
                if (((Integer) entry.getValue()).intValue() == i) {
                    long jLongValue = ((Long) entry.getKey()).longValue();
                    int i2 = (int) (jLongValue >> 16);
                    long j = (((long) i2) << 16) + ((long) ((int) (jLongValue - ((long) (i2 << 16)))));
                    this.selected = j;
                    LongSparseArray longSparseArray = this.selectors;
                    if (longSparseArray.get(j) == null) {
                        longSparseArray.put(this.selected, Float.valueOf(0.0f));
                    }
                    invalidate();
                    return;
                }
            }
            this.selected = Long.MIN_VALUE;
            invalidate();
        }

        public final void updatePosition(MotionEvent motionEvent) {
            long x = (((long) ((int) ((motionEvent.getX() - getPaddingLeft()) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12)))) << 16) + ((long) ((int) (motionEvent.getY() / (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10))));
            Integer num = (Integer) this.colorMap.get(Long.valueOf(x));
            if (num != null) {
                int iIntValue = num.intValue();
                int i = ColorPickerBottomSheet.$r8$clinit;
                ColorPickerBottomSheet.this.onSetColor(iIntValue, 3);
                this.selected = x;
                LongSparseArray longSparseArray = this.selectors;
                if (longSparseArray.get(x) == null) {
                    longSparseArray.put(this.selected, Float.valueOf(0.0f));
                }
                invalidate();
            }
        }
    }

    public interface PipetteDelegate {
        FrameLayout getContainerView();

        View getSnapshotDrawingView();

        boolean isPipetteAvailable();

        boolean isPipetteVisible();

        void onColorSelected(int i);

        void onDrawImageOverCanvas(Canvas canvas);

        void onStartColorPipette();

        void onStopColorPipette();
    }

    public final class SliderCell extends FrameLayout {
        public boolean isInvalidatingColor;
        public int mode;
        public final ColorSliderView sliderView;
        public final TextView titleView;
        public final EditTextBoldCursor valueView;

        public SliderCell(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.titleView = textView;
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(14.0f, -1711276033, 1, textView);
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
            ColorSliderView colorSliderView = ColorPickerBottomSheet.this.new ColorSliderView(context);
            this.sliderView = colorSliderView;
            addView(colorSliderView, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.valueView = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            editTextBoldCursor.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), 436207615));
            editTextBoldCursor.setPadding(0, 0, 0, 0);
            editTextBoldCursor.setTextColor(-1);
            editTextBoldCursor.setGravity(17);
            editTextBoldCursor.setSingleLine();
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
            editTextBoldCursor.setInputType(2);
            editTextBoldCursor.setTypeface(AndroidUtilities.bold());
            editTextBoldCursor.addTextChangedListener(new LoginActivity.AnonymousClass7(this));
            editTextBoldCursor.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 2));
            editTextBoldCursor.setOnEditorActionListener(new PaymentFormActivity$$ExternalSyntheticLambda11(3));
            addView(editTextBoldCursor, LayoutHelper.createFrame(72, 36, 85));
        }

        public final void bind(int i) {
            this.mode = i;
            this.sliderView.mode = i;
            TextView textView = this.titleView;
            if (i == 0) {
                textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersRed).toUpperCase());
            } else if (i == 1) {
                textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersGreen).toUpperCase());
            } else if (i == 2) {
                textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersBlue).toUpperCase());
            }
            invalidateColor();
        }

        public final void invalidateColor() {
            this.isInvalidatingColor = true;
            ColorSliderView colorSliderView = this.sliderView;
            colorSliderView.filledColor = ColorUtils.setAlphaComponent(ColorPickerBottomSheet.this.mColor, 255);
            colorSliderView.invalidateShader();
            colorSliderView.invalidate();
            EditTextBoldCursor editTextBoldCursor = this.valueView;
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            int i = this.mode;
            ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
            if (i == 0) {
                editTextBoldCursor.setText(String.valueOf(Color.red(colorPickerBottomSheet.mColor)));
            } else if (i == 1) {
                editTextBoldCursor.setText(String.valueOf(Color.green(colorPickerBottomSheet.mColor)));
            } else if (i == 2) {
                editTextBoldCursor.setText(String.valueOf(Color.blue(colorPickerBottomSheet.mColor)));
            }
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
            this.isInvalidatingColor = false;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
        }
    }

    public final class SlidersPickerView extends LinearLayout {
        public final SliderCell blue;
        public final SliderCell green;
        public final EditTextBoldCursor hexEdit;
        public boolean isInvalidatingColor;
        public final SliderCell red;

        public SlidersPickerView(Context context) {
            super(context);
            setOrientation(1);
            setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
            SliderCell sliderCell = ColorPickerBottomSheet.this.new SliderCell(context);
            this.red = sliderCell;
            sliderCell.bind(0);
            addView(sliderCell, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 0, 0, 16));
            SliderCell sliderCell2 = ColorPickerBottomSheet.this.new SliderCell(context);
            this.green = sliderCell2;
            sliderCell2.bind(1);
            addView(sliderCell2, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 0, 0, 16));
            SliderCell sliderCell3 = ColorPickerBottomSheet.this.new SliderCell(context);
            this.blue = sliderCell3;
            sliderCell3.bind(2);
            addView(sliderCell3, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 0, 0, 16));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(21);
            addView(linearLayout, LayoutHelper.createFrame(64.0f, -1));
            TextView textView = new TextView(context);
            textView.setTextColor(-1711276033);
            textView.setTextSize(1, 16.0f);
            textView.setText(LocaleController.getString(R.string.PaintPaletteSlidersHexColor).toUpperCase());
            textView.setTypeface(AndroidUtilities.bold());
            linearLayout.addView(textView, LayoutHelper.createLinear(0.0f, 0.0f, 8.0f, 0.0f, -2, -2));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.hexEdit = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            editTextBoldCursor.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), 436207615));
            editTextBoldCursor.setPadding(0, 0, 0, 0);
            editTextBoldCursor.setTextColor(-1);
            editTextBoldCursor.setGravity(17);
            editTextBoldCursor.setSingleLine();
            editTextBoldCursor.setImeOptions(6);
            editTextBoldCursor.setImeActionLabel(LocaleController.getString(R.string.Done), 6);
            editTextBoldCursor.setTypeface(AndroidUtilities.bold());
            editTextBoldCursor.addTextChangedListener(new PassportActivity.AnonymousClass13(this));
            editTextBoldCursor.setOnFocusChangeListener(new RichTextCell$$ExternalSyntheticLambda3(this, 3));
            editTextBoldCursor.setOnEditorActionListener(new PaymentFormActivity$$ExternalSyntheticLambda11(4));
            linearLayout.addView(editTextBoldCursor, LayoutHelper.createLinear(72, 36));
        }
    }

    public ColorPickerBottomSheet(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider, true, false);
        this.path = new android.graphics.Path();
        fixNavigationBar(-14342875);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.pipetteView = imageView;
        imageView.setImageResource(R.drawable.picker);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        imageView.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(2, this, context));
        ImageView imageView2 = new ImageView(context);
        this.doneView = imageView2;
        imageView2.setImageResource(R.drawable.ic_ab_done);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(Theme.createSelectorDrawable(1090519039, 1, -1));
        imageView2.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(this, 8));
        CacheControlActivity.ClearingCacheView.ProgressView progressView = new CacheControlActivity.ClearingCacheView.ProgressView(this, context);
        this.alphaPickerView = progressView;
        progressView.progress = Color.alpha(-65536) / 255.0f;
        progressView.in.setShader(new LinearGradient(0.0f, 0.0f, progressView.getWidth(), 0.0f, new int[]{0, this.mColor}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        progressView.invalidate();
        ColorPicker.AnonymousClass1 anonymousClass1 = new ColorPicker.AnonymousClass1(this, context);
        this.pickerView = anonymousClass1;
        linearLayout.addView(anonymousClass1, LayoutHelper.createLinear(-1, 0));
        ScrollView scrollView = new ScrollView(context) {
            {
                setWillNotDraw(false);
            }

            @Override
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                float y = linearLayout.getY() + AndroidUtilities.dp(1.0f);
                int iDp = AndroidUtilities.dp(36.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getMeasuredWidth() - iDp) / 2.0f, y, (getMeasuredWidth() + iDp) / 2.0f, AndroidUtilities.dp(4.0f) + y);
                Theme.dialogs_onlineCirclePaint.setColor(-10790053);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
            }

            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                ((LinearLayout.LayoutParams) ColorPickerBottomSheet.this.pickerView.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i) - AndroidUtilities.dp(24.0f)) * 0.8333333f) + AndroidUtilities.dp(88.0f));
            }
        };
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        super.lambda$showGiftOfferSheet$15();
        Consumer consumer = this.colorListener;
        if (consumer != null) {
            consumer.accept(Integer.valueOf(this.mColor));
        }
    }

    public final void onSetColor(int i, int i2) {
        View viewFindFocus;
        if (!this.initialized) {
            if (i2 != 2) {
                return;
            } else {
                this.initialized = true;
            }
        }
        ColorPicker.AnonymousClass1 anonymousClass1 = this.pickerView;
        if (i2 != 5 && (viewFindFocus = anonymousClass1.findFocus()) != null) {
            viewFindFocus.clearFocus();
            AndroidUtilities.hideKeyboard(viewFindFocus);
        }
        if (i2 != 3) {
            ((GridPickerView) anonymousClass1.rect).setCurrentColor(i);
        }
        if (i2 != 0) {
            GradientPickerView gradientPickerView = (GradientPickerView) anonymousClass1.paint;
            boolean z = i2 != 1;
            ColorPickerBottomSheet.this.mColor = i;
            float[] fArr = gradientPickerView.hsv;
            Color.colorToHSV(i, fArr);
            if (z) {
                float f = (fArr[1] * 0.5f) + 1.0f;
                float f2 = fArr[2];
                gradientPickerView.positionX = f - (f2 <= 0.5f ? 1.0f - (((1.0f - f2) * 0.22000003f) + 0.78f) : BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, f2, 0.22f, 1.0f));
                gradientPickerView.positionY = fArr[0] / 360.0f;
            }
            gradientPickerView.invalidate();
        }
        if (i2 != 1) {
            CacheControlActivity.ClearingCacheView.ProgressView progressView = this.alphaPickerView;
            progressView.getClass();
            progressView.progress = Color.alpha(i) / 255.0f;
            progressView.in.setShader(new LinearGradient(0.0f, 0.0f, progressView.getWidth(), 0.0f, new int[]{0, ((ColorPickerBottomSheet) progressView.progressT).mColor}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
            progressView.invalidate();
        }
        SlidersPickerView slidersPickerView = (SlidersPickerView) anonymousClass1.this$0;
        slidersPickerView.isInvalidatingColor = true;
        slidersPickerView.red.invalidateColor();
        slidersPickerView.green.invalidateColor();
        slidersPickerView.blue.invalidateColor();
        EditTextBoldCursor editTextBoldCursor = slidersPickerView.hexEdit;
        if (!editTextBoldCursor.isFocused()) {
            int selectionStart = editTextBoldCursor.getSelectionStart();
            int selectionEnd = editTextBoldCursor.getSelectionEnd();
            StringBuilder sb = new StringBuilder(Integer.toHexString(ColorPickerBottomSheet.this.mColor));
            while (sb.length() < 8) {
                sb.insert(0, "0");
            }
            editTextBoldCursor.setText(sb.toString().toUpperCase().substring(2));
            editTextBoldCursor.setSelection(selectionStart, selectionEnd);
        }
        slidersPickerView.isInvalidatingColor = false;
    }

    @Override
    public final void show() {
        if (!this.pipetteDelegate.isPipetteAvailable()) {
            this.pipetteView.setVisibility(8);
        }
        super.show();
    }
}

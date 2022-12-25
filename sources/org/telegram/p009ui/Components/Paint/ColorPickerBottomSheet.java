package org.telegram.p009ui.Components.Paint;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.LongSparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.BottomSheet;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.EditTextBoldCursor;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.p009ui.Components.Paint.Views.PaintColorsListView;
import org.telegram.p009ui.Components.Paint.Views.PipettePickerView;
import org.telegram.p009ui.Components.ViewPagerFixed;

public class ColorPickerBottomSheet extends BottomSheet {
    private AlphaPickerView alphaPickerView;
    private Consumer<Integer> colorListener;
    private ImageView doneView;
    private boolean initialized;
    private int mColor;
    private Path path;
    private ColorPickerView pickerView;
    private PipetteDelegate pipetteDelegate;
    private ImageView pipetteView;

    public interface PipetteDelegate {
        ViewGroup getContainerView();

        View getSnapshotDrawingView();

        boolean isPipetteAvailable();

        boolean isPipetteVisible();

        void onColorSelected(int i);

        void onDrawImageOverCanvas(Bitmap bitmap, Canvas canvas);

        void onStartColorPipette();

        void onStopColorPipette();
    }

    public ColorPickerBottomSheet(final Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, true, resourcesProvider);
        this.path = new Path();
        fixNavigationBar(-14342875);
        Drawable mutate = context.getResources().getDrawable(C1072R.C1073drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        final LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.m35dp(16.0f), 0, 0);
        ImageView imageView = new ImageView(context);
        this.pipetteView = imageView;
        imageView.setImageResource(C1072R.C1073drawable.picker);
        this.pipetteView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.pipetteView.setBackground(Theme.createSelectorDrawable(1090519039));
        this.pipetteView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ColorPickerBottomSheet.this.lambda$new$0(context, view);
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.doneView = imageView2;
        imageView2.setImageResource(C1072R.C1073drawable.ic_ab_done);
        this.doneView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.doneView.setBackground(Theme.createSelectorDrawable(1090519039));
        this.doneView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ColorPickerBottomSheet.this.lambda$new$1(view);
            }
        });
        AlphaPickerView alphaPickerView = new AlphaPickerView(context);
        this.alphaPickerView = alphaPickerView;
        alphaPickerView.setColor(-65536);
        ColorPickerView colorPickerView = new ColorPickerView(this, context);
        this.pickerView = colorPickerView;
        linearLayout.addView(colorPickerView, LayoutHelper.createLinear(-1, 0));
        ScrollView scrollView = new ScrollView(context) {
            {
                setWillNotDraw(false);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, i2);
                ((LinearLayout.LayoutParams) ColorPickerBottomSheet.this.pickerView.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i) - AndroidUtilities.m35dp(24.0f)) * 0.8333333f) + AndroidUtilities.m35dp(88.0f));
            }

            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                float y = linearLayout.getY() + AndroidUtilities.m35dp(1.0f);
                int m35dp = AndroidUtilities.m35dp(36.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getMeasuredWidth() - m35dp) / 2.0f, y, (getMeasuredWidth() + m35dp) / 2.0f, AndroidUtilities.m35dp(4.0f) + y);
                Theme.dialogs_onlineCirclePaint.setColor(-10790053);
                canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(2.0f), Theme.dialogs_onlineCirclePaint);
            }
        };
        scrollView.addView(linearLayout);
        setCustomView(scrollView);
    }

    public void lambda$new$0(Context context, View view) {
        if (this.pipetteDelegate.isPipetteVisible()) {
            return;
        }
        Bitmap snapshotView = AndroidUtilities.snapshotView(this.pipetteDelegate.getSnapshotDrawingView());
        Bitmap createBitmap = Bitmap.createBitmap(snapshotView.getWidth(), snapshotView.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-16777216);
        this.pipetteDelegate.onDrawImageOverCanvas(createBitmap, canvas);
        canvas.drawBitmap(snapshotView, 0.0f, 0.0f, (Paint) null);
        snapshotView.recycle();
        PipettePickerView pipettePickerView = new PipettePickerView(context, createBitmap) {
            @Override
            protected void onStartPipette() {
                ColorPickerBottomSheet.this.pipetteDelegate.onStartColorPipette();
            }

            @Override
            protected void onStopPipette() {
                ColorPickerBottomSheet.this.pipetteDelegate.onStopColorPipette();
            }
        };
        this.pipetteDelegate.getContainerView().addView(pipettePickerView, LayoutHelper.createFrame(-1, -1.0f));
        final PipetteDelegate pipetteDelegate = this.pipetteDelegate;
        Objects.requireNonNull(pipetteDelegate);
        pipettePickerView.setColorListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                ColorPickerBottomSheet.PipetteDelegate.this.onColorSelected(((Integer) obj).intValue());
            }
        });
        pipettePickerView.animateShow();
        dismiss();
    }

    public void lambda$new$1(View view) {
        dismiss();
    }

    @Override
    public void show() {
        if (!this.pipetteDelegate.isPipetteAvailable()) {
            this.pipetteView.setVisibility(8);
        }
        super.show();
    }

    public ColorPickerBottomSheet setPipetteDelegate(PipetteDelegate pipetteDelegate) {
        this.pipetteDelegate = pipetteDelegate;
        return this;
    }

    public ColorPickerBottomSheet setColorListener(Consumer<Integer> consumer) {
        this.colorListener = consumer;
        return this;
    }

    public ColorPickerBottomSheet setColor(int i) {
        onSetColor(i, 2);
        return this;
    }

    public void onSetColor(int i, int i2) {
        View findFocus;
        if (!this.initialized) {
            if (i2 != 2) {
                return;
            }
            this.initialized = true;
        }
        if (i2 != 5 && (findFocus = this.pickerView.findFocus()) != null) {
            findFocus.clearFocus();
            AndroidUtilities.hideKeyboard(findFocus);
        }
        if (i2 != 3) {
            this.pickerView.gridPickerView.setCurrentColor(i);
        }
        if (i2 != 0) {
            this.pickerView.gradientPickerView.setColor(i, i2 != 1);
        }
        if (i2 != 1) {
            this.alphaPickerView.setColor(i);
        }
        this.pickerView.slidersPickerView.invalidateColor();
    }

    @Override
    public void dismiss() {
        super.dismiss();
        Consumer<Integer> consumer = this.colorListener;
        if (consumer != null) {
            consumer.accept(Integer.valueOf(this.mColor));
        }
    }

    public final class ColorPickerView extends LinearLayout {
        private GradientPickerView gradientPickerView;
        private GridPickerView gridPickerView;
        private SlidersPickerView slidersPickerView;

        public ColorPickerView(ColorPickerBottomSheet colorPickerBottomSheet, Context context) {
            super(context);
            setOrientation(1);
            GridPickerView gridPickerView = new GridPickerView(context);
            this.gridPickerView = gridPickerView;
            gridPickerView.setCurrentColor(colorPickerBottomSheet.mColor);
            this.gradientPickerView = new GradientPickerView(context);
            this.slidersPickerView = new SlidersPickerView(context);
            ViewPagerFixed viewPagerFixed = new ViewPagerFixed(this, context, ((BottomSheet) colorPickerBottomSheet).resourcesProvider, colorPickerBottomSheet) {
                @Override
                protected int tabMarginDp() {
                    return 0;
                }
            };
            viewPagerFixed.setAdapter(new ViewPagerFixed.Adapter(colorPickerBottomSheet) {
                @Override
                public void bindView(View view, int i, int i2) {
                }

                @Override
                public int getItemCount() {
                    return 3;
                }

                @Override
                public int getItemViewType(int i) {
                    return i;
                }

                @Override
                public String getItemTitle(int i) {
                    if (i != 1) {
                        if (i != 2) {
                            return LocaleController.getString(C1072R.string.PaintPaletteGrid).toUpperCase();
                        }
                        return LocaleController.getString(C1072R.string.PaintPaletteSliders).toUpperCase();
                    }
                    return LocaleController.getString(C1072R.string.PaintPaletteSpectrum).toUpperCase();
                }

                @Override
                public View createView(int i) {
                    if (i != 1) {
                        return i != 2 ? ColorPickerView.this.gridPickerView : ColorPickerView.this.slidersPickerView;
                    }
                    return ColorPickerView.this.gradientPickerView;
                }
            });
            addView(viewPagerFixed, LayoutHelper.createLinear(-1, 0, 1.0f));
            addView(colorPickerBottomSheet.alphaPickerView, LayoutHelper.createLinear(-1, 48, 12.0f, 0.0f, 12.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.addView(colorPickerBottomSheet.pipetteView, LayoutHelper.createLinear(28, 28));
            linearLayout.addView(viewPagerFixed.createTabsView(false), LayoutHelper.createLinear(-1, 40, 1.0f, 16, 12, 0, 12, 0));
            linearLayout.addView(colorPickerBottomSheet.doneView, LayoutHelper.createLinear(28, 28));
            addView(linearLayout, LayoutHelper.createLinear(-1, 48, 14.0f, 0.0f, 14.0f, 0.0f));
        }
    }

    public final class GridPickerView extends View {
        private Map<Long, Integer> colorMap;
        private final int[] colors;
        private Paint paint;
        private float[] radii;
        private long selected;
        private Paint selectorPaint;
        private Path selectorPath;
        private LongSparseArray<Float> selectors;

        public GridPickerView(Context context) {
            super(context);
            int blendARGB;
            this.paint = new Paint(1);
            this.colors = new int[]{-16735784, -16752387, -11788361, -6804548, -4707235, -180718, -38656, -152832, -211200, -198077, -2495689, -8996289};
            this.selectorPaint = new Paint(1);
            this.selectors = new LongSparseArray<>();
            this.selected = Long.MIN_VALUE;
            this.selectorPath = new Path();
            this.radii = new float[8];
            this.colorMap = new HashMap();
            setPadding(AndroidUtilities.m35dp(14.0f), AndroidUtilities.m35dp(3.0f), AndroidUtilities.m35dp(14.0f), AndroidUtilities.m35dp(3.0f));
            this.selectorPaint.setColor(-1);
            this.selectorPaint.setStyle(Paint.Style.STROKE);
            this.selectorPaint.setStrokeCap(Paint.Cap.ROUND);
            this.selectorPaint.setStrokeJoin(Paint.Join.ROUND);
            for (int i = 0; i < 12; i++) {
                for (int i2 = 0; i2 < 10; i2++) {
                    if (i2 == 0) {
                        this.colorMap.put(Long.valueOf((i << 16) + i2), Integer.valueOf(ColorUtils.blendARGB(-1, -16777216, i / 11.0f)));
                    } else {
                        if (i2 < 6) {
                            blendARGB = ColorUtils.blendARGB(this.colors[i], -16777216, (((6 - i2) - 1) / 4.0f) * 0.5f);
                        } else {
                            blendARGB = ColorUtils.blendARGB(this.colors[i], -1, 0.5f - ((((10 - i2) - 1) / 5.0f) * 0.5f));
                        }
                        this.colorMap.put(Long.valueOf((i << 16) + i2), Integer.valueOf(blendARGB));
                    }
                }
            }
        }

        @Override
        @android.annotation.SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(android.view.MotionEvent r4) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.Paint.ColorPickerBottomSheet.GridPickerView.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void setCurrentColor(int i) {
            for (Map.Entry<Long, Integer> entry : this.colorMap.entrySet()) {
                if (entry.getValue().intValue() == i) {
                    long longValue = entry.getKey().longValue();
                    int i2 = (int) (longValue >> 16);
                    setCurrentColor(i2, (int) (longValue - (i2 << 16)));
                    return;
                }
            }
            this.selected = Long.MIN_VALUE;
            invalidate();
        }

        public void setCurrentColor(int i, int i2) {
            long j = (i << 16) + i2;
            this.selected = j;
            if (this.selectors.get(j) == null) {
                this.selectors.put(this.selected, Float.valueOf(0.0f));
            }
            invalidate();
        }

        private void updatePosition(MotionEvent motionEvent) {
            int x = (int) ((motionEvent.getX() - getPaddingLeft()) / (((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12));
            int y = (int) (motionEvent.getY() / (((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10));
            Integer num = this.colorMap.get(Long.valueOf((x << 16) + y));
            if (num != null) {
                ColorPickerBottomSheet.this.onSetColor(num.intValue(), 3);
                setCurrentColor(x, y);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float max;
            super.onDraw(canvas);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.save();
            ColorPickerBottomSheet.this.path.rewind();
            ColorPickerBottomSheet.this.path.addRoundRect(rectF, AndroidUtilities.m35dp(10.0f), AndroidUtilities.m35dp(10.0f), Path.Direction.CW);
            canvas.clipPath(ColorPickerBottomSheet.this.path);
            float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) / 12.0f;
            float height = ((getHeight() - getPaddingTop()) - getPaddingBottom()) / 10.0f;
            for (int i = 0; i < 12; i++) {
                for (int i2 = 0; i2 < 10; i2++) {
                    Integer num = this.colorMap.get(Long.valueOf((i << 16) + i2));
                    if (num != null) {
                        this.paint.setColor(num.intValue());
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(getPaddingLeft() + (i * width), getPaddingTop() + (i2 * height), getPaddingLeft() + ((i + 1) * width), getPaddingTop() + ((i2 + 1) * height));
                        canvas.drawRect(rectF2, this.paint);
                    }
                }
            }
            canvas.restore();
            int i3 = 0;
            while (i3 < this.selectors.size()) {
                long keyAt = this.selectors.keyAt(i3);
                float floatValue = this.selectors.valueAt(i3).floatValue();
                if (this.selected == keyAt) {
                    max = Math.min(1.0f, floatValue + 0.045714285f);
                } else {
                    max = Math.max(0.0f, floatValue - 0.10666667f);
                }
                int i4 = (int) (keyAt >> 16);
                int i5 = (int) (keyAt - (i4 << 16));
                Integer num2 = this.colorMap.get(Long.valueOf(keyAt));
                if (num2 != null) {
                    this.selectorPaint.setColor(AndroidUtilities.computePerceivedBrightness(num2.intValue()) > 0.721f ? -15658735 : -1);
                }
                this.selectorPaint.setStrokeWidth(CubicBezierInterpolator.EASE_OUT_QUINT.getInterpolation(max) * AndroidUtilities.m35dp(3.0f));
                this.selectorPath.rewind();
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(getPaddingLeft() + (i4 * width), getPaddingTop() + (i5 * height), getPaddingLeft() + ((i4 + 1) * width), getPaddingTop() + ((i5 + 1) * height));
                float[] fArr = this.radii;
                float m35dp = (i4 == 0 && i5 == 0) ? AndroidUtilities.m35dp(10.0f) : 0.0f;
                fArr[1] = m35dp;
                fArr[0] = m35dp;
                float[] fArr2 = this.radii;
                float m35dp2 = (i4 == 11 && i5 == 0) ? AndroidUtilities.m35dp(10.0f) : 0.0f;
                fArr2[3] = m35dp2;
                fArr2[2] = m35dp2;
                float[] fArr3 = this.radii;
                float m35dp3 = (i4 == 11 && i5 == 9) ? AndroidUtilities.m35dp(10.0f) : 0.0f;
                fArr3[5] = m35dp3;
                fArr3[4] = m35dp3;
                float[] fArr4 = this.radii;
                float m35dp4 = (i4 == 0 && i5 == 9) ? AndroidUtilities.m35dp(10.0f) : 0.0f;
                fArr4[7] = m35dp4;
                fArr4[6] = m35dp4;
                this.selectorPath.addRoundRect(rectF3, this.radii, Path.Direction.CW);
                canvas.drawPath(this.selectorPath, this.selectorPaint);
                if (max <= 0.0f && this.selected != keyAt) {
                    this.selectors.removeAt(i3);
                    i3--;
                    invalidate();
                } else {
                    if (max < 1.0f) {
                        invalidate();
                    }
                    this.selectors.setValueAt(i3, Float.valueOf(max));
                }
                i3++;
            }
        }
    }

    public final class GradientPickerView extends View {
        private Paint gradientPaint;
        private float[] hsv;
        private Paint outlinePaint;
        private float positionX;
        private float positionY;
        private Drawable shadowDrawable;
        private Paint whiteBlackPaint;

        public GradientPickerView(Context context) {
            super(context);
            this.gradientPaint = new Paint(1);
            this.whiteBlackPaint = new Paint(1);
            this.outlinePaint = new Paint(1);
            this.hsv = new float[3];
            setPadding(AndroidUtilities.m35dp(14.0f), AndroidUtilities.m35dp(3.0f), AndroidUtilities.m35dp(14.0f), AndroidUtilities.m35dp(3.0f));
            this.outlinePaint.setColor(-1);
            this.outlinePaint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.outlinePaint.setStrokeWidth(AndroidUtilities.m35dp(3.0f));
            this.shadowDrawable = ContextCompat.getDrawable(context, C1072R.C1073drawable.knob_shadow);
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.gradientPaint.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i2 - getPaddingBottom(), new int[]{-65536, -256, -16711936, -16711681, -16776961, -65281, -65536}, (float[]) null, Shader.TileMode.CLAMP));
            this.whiteBlackPaint.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i - getPaddingRight(), 0.0f, new int[]{-1, 0, 0, -16777216}, new float[]{0.06f, 0.22f, 0.78f, 0.94f}, Shader.TileMode.MIRROR));
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), this.gradientPaint);
            canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(8.0f), this.whiteBlackPaint);
            float m35dp = AndroidUtilities.m35dp(13.0f);
            float m35dp2 = AndroidUtilities.m35dp(16.0f);
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            float f = width;
            float paddingLeft = getPaddingLeft() + MathUtils.clamp(this.positionX * f, m35dp2, f - m35dp2);
            float f2 = height;
            float paddingTop = getPaddingTop() + MathUtils.clamp(this.positionY * f2, m35dp2, f2 - m35dp2);
            Drawable drawable = this.shadowDrawable;
            Rect rect = AndroidUtilities.rectTmp2;
            drawable.getPadding(rect);
            int i = rect.bottom;
            this.shadowDrawable.setBounds((int) ((paddingLeft - m35dp) - rect.left), (int) ((paddingTop - m35dp) - rect.top), (int) (paddingLeft + m35dp + i), (int) (paddingTop + m35dp + i));
            this.shadowDrawable.draw(canvas);
            canvas.drawCircle(paddingLeft, paddingTop, m35dp, this.outlinePaint);
            PaintColorsListView.drawColorCircle(canvas, paddingLeft, paddingTop, m35dp - (this.outlinePaint.getStrokeWidth() / 2.0f), ColorUtils.setAlphaComponent(ColorPickerBottomSheet.this.mColor, 255));
        }

        @Override
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
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

        private void updatePosition(MotionEvent motionEvent) {
            this.positionX = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
            float y = (motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom());
            this.positionY = y;
            float[] fArr = this.hsv;
            fArr[0] = y * 360.0f;
            float f = this.positionX;
            if (f <= 0.22f || f >= 0.78f) {
                fArr[1] = AndroidUtilities.lerp(1.0f, 0.0f, f <= 0.22f ? 1.0f - (f / 0.22f) : (f - 0.78f) / 0.22000003f);
                float[] fArr2 = this.hsv;
                float f2 = this.positionX;
                fArr2[2] = f2 > 0.22f ? AndroidUtilities.lerp(1.0f, 0.0f, (f2 - 0.78f) / 0.22000003f) : 1.0f;
            } else {
                fArr[1] = 1.0f;
                fArr[2] = 1.0f;
            }
            ColorPickerBottomSheet.this.mColor = Color.HSVToColor(this.hsv);
            ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
            colorPickerBottomSheet.onSetColor(colorPickerBottomSheet.mColor, 0);
            invalidate();
        }

        public void setColor(int i, boolean z) {
            ColorPickerBottomSheet.this.mColor = i;
            Color.colorToHSV(i, this.hsv);
            if (z) {
                float[] fArr = this.hsv;
                this.positionX = ((fArr[1] * 0.5f) + 1.0f) - (fArr[2] <= 0.5f ? 1.0f - (((1.0f - fArr[2]) * 0.22000003f) + 0.78f) : 1.0f - ((1.0f - fArr[2]) * 0.22f));
                this.positionY = fArr[0] / 360.0f;
            }
            invalidate();
        }
    }

    public final class SlidersPickerView extends LinearLayout {
        private SliderCell blue;
        private SliderCell green;
        private EditText hexEdit;
        private boolean isInvalidatingColor;
        private SliderCell red;

        public SlidersPickerView(Context context) {
            super(context);
            setOrientation(1);
            setPadding(AndroidUtilities.m35dp(14.0f), 0, AndroidUtilities.m35dp(14.0f), 0);
            SliderCell sliderCell = new SliderCell(context);
            this.red = sliderCell;
            sliderCell.bind(0);
            addView(this.red, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 0, 0, 16));
            SliderCell sliderCell2 = new SliderCell(context);
            this.green = sliderCell2;
            sliderCell2.bind(1);
            addView(this.green, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 0, 0, 16));
            SliderCell sliderCell3 = new SliderCell(context);
            this.blue = sliderCell3;
            sliderCell3.bind(2);
            addView(this.blue, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 0, 0, 16));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(21);
            addView(linearLayout, LayoutHelper.createFrame(-1, 64.0f));
            TextView textView = new TextView(context);
            textView.setTextColor(-1711276033);
            textView.setTextSize(1, 16.0f);
            textView.setText(LocaleController.getString(C1072R.string.PaintPaletteSlidersHexColor).toUpperCase());
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 0.0f, 0.0f, 8.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.hexEdit = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            this.hexEdit.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.m35dp(10.0f), 436207615));
            this.hexEdit.setPadding(0, 0, 0, 0);
            this.hexEdit.setTextColor(-1);
            this.hexEdit.setGravity(17);
            this.hexEdit.setSingleLine();
            this.hexEdit.setImeOptions(6);
            this.hexEdit.setImeActionLabel(LocaleController.getString(C1072R.string.Done), 6);
            this.hexEdit.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.hexEdit.addTextChangedListener(new TextWatcher(ColorPickerBottomSheet.this) {
                private Pattern pattern = Pattern.compile("^[0-9a-fA-F]*$");
                private CharSequence previous;

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    this.previous = charSequence.toString();
                }

                @Override
                public void afterTextChanged(android.text.Editable r6) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.Paint.ColorPickerBottomSheet.SlidersPickerView.C24631.afterTextChanged(android.text.Editable):void");
                }
            });
            this.hexEdit.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z) {
                    ColorPickerBottomSheet.SlidersPickerView.this.lambda$new$0(view, z);
                }
            });
            this.hexEdit.setOnEditorActionListener(C2465x8f669e74.INSTANCE);
            linearLayout.addView(this.hexEdit, LayoutHelper.createLinear(72, 36));
        }

        public void lambda$new$0(View view, boolean z) {
            if (z || !TextUtils.isEmpty(this.hexEdit.getText())) {
                return;
            }
            this.hexEdit.setText("0");
        }

        public static boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return false;
            }
            return false;
        }

        public void invalidateColor() {
            this.isInvalidatingColor = true;
            this.red.invalidateColor();
            this.green.invalidateColor();
            this.blue.invalidateColor();
            if (!this.hexEdit.isFocused()) {
                int selectionStart = this.hexEdit.getSelectionStart();
                int selectionEnd = this.hexEdit.getSelectionEnd();
                StringBuilder sb = new StringBuilder(Integer.toHexString(ColorPickerBottomSheet.this.mColor));
                while (sb.length() < 8) {
                    sb.insert(0, "0");
                }
                this.hexEdit.setText(sb.toString().toUpperCase().substring(2));
                this.hexEdit.setSelection(selectionStart, selectionEnd);
            }
            this.isInvalidatingColor = false;
        }
    }

    public final class SliderCell extends FrameLayout {
        private boolean isInvalidatingColor;
        private int mode;
        private ColorSliderView sliderView;
        private TextView titleView;
        private EditText valueView;

        public SliderCell(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextColor(-1711276033);
            this.titleView.setTextSize(1, 14.0f);
            this.titleView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            addView(this.titleView, LayoutHelper.createFrame(-2, -2.0f, 3, 8.0f, 0.0f, 8.0f, 0.0f));
            ColorSliderView colorSliderView = new ColorSliderView(context);
            this.sliderView = colorSliderView;
            addView(colorSliderView, LayoutHelper.createFrame(-1, -1.0f, 3, 0.0f, 16.0f, 78.0f, 0.0f));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.valueView = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            this.valueView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.m35dp(10.0f), 436207615));
            this.valueView.setPadding(0, 0, 0, 0);
            this.valueView.setTextColor(-1);
            this.valueView.setGravity(17);
            this.valueView.setSingleLine();
            this.valueView.setImeOptions(6);
            this.valueView.setImeActionLabel(LocaleController.getString(C1072R.string.Done), 6);
            this.valueView.setInputType(2);
            this.valueView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.valueView.addTextChangedListener(new TextWatcher(ColorPickerBottomSheet.this) {
                private CharSequence previous;

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    this.previous = charSequence.toString();
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (SliderCell.this.isInvalidatingColor || this.previous == null || editable == null || TextUtils.isEmpty(editable) || Objects.equals(this.previous.toString(), editable.toString())) {
                        return;
                    }
                    int clamp = MathUtils.clamp(Integer.parseInt(editable.toString()), 0, 255);
                    int i = SliderCell.this.mode;
                    ColorPickerBottomSheet.this.onSetColor(i != 1 ? i != 2 ? Color.argb(Color.alpha(ColorPickerBottomSheet.this.mColor), clamp, Color.green(ColorPickerBottomSheet.this.mColor), Color.blue(ColorPickerBottomSheet.this.mColor)) : Color.argb(Color.alpha(ColorPickerBottomSheet.this.mColor), Color.red(ColorPickerBottomSheet.this.mColor), Color.green(ColorPickerBottomSheet.this.mColor), clamp) : Color.argb(Color.alpha(ColorPickerBottomSheet.this.mColor), Color.red(ColorPickerBottomSheet.this.mColor), clamp, Color.blue(ColorPickerBottomSheet.this.mColor)), 5);
                }
            });
            this.valueView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z) {
                    ColorPickerBottomSheet.SliderCell.this.lambda$new$0(view, z);
                }
            });
            this.valueView.setOnEditorActionListener(ColorPickerBottomSheet$SliderCell$$ExternalSyntheticLambda1.INSTANCE);
            addView(this.valueView, LayoutHelper.createFrame(72, 36, 85));
        }

        public void lambda$new$0(View view, boolean z) {
            if (z || !TextUtils.isEmpty(this.valueView.getText())) {
                return;
            }
            this.valueView.setText("0");
        }

        public static boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                textView.clearFocus();
                AndroidUtilities.hideKeyboard(textView);
                return false;
            }
            return false;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m35dp(52.0f), 1073741824));
        }

        public void bind(int i) {
            this.mode = i;
            this.sliderView.setMode(i);
            if (i == 0) {
                this.titleView.setText(LocaleController.getString(C1072R.string.PaintPaletteSlidersRed).toUpperCase());
            } else if (i == 1) {
                this.titleView.setText(LocaleController.getString(C1072R.string.PaintPaletteSlidersGreen).toUpperCase());
            } else if (i == 2) {
                this.titleView.setText(LocaleController.getString(C1072R.string.PaintPaletteSlidersBlue).toUpperCase());
            }
            invalidateColor();
        }

        public void invalidateColor() {
            this.isInvalidatingColor = true;
            this.sliderView.invalidateColor();
            int selectionStart = this.valueView.getSelectionStart();
            int selectionEnd = this.valueView.getSelectionEnd();
            int i = this.mode;
            if (i == 0) {
                this.valueView.setText(String.valueOf(Color.red(ColorPickerBottomSheet.this.mColor)));
            } else if (i == 1) {
                this.valueView.setText(String.valueOf(Color.green(ColorPickerBottomSheet.this.mColor)));
            } else if (i == 2) {
                this.valueView.setText(String.valueOf(Color.blue(ColorPickerBottomSheet.this.mColor)));
            }
            this.valueView.setSelection(selectionStart, selectionEnd);
            this.isInvalidatingColor = false;
        }
    }

    public final class AlphaPickerView extends View {
        private float alpha;
        private Paint colorPaint;
        private Paint outlinePaint;

        public AlphaPickerView(Context context) {
            super(context);
            this.colorPaint = new Paint(1);
            Paint paint = new Paint(1);
            this.outlinePaint = paint;
            paint.setColor(-1);
            this.outlinePaint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.outlinePaint.setStrokeWidth(AndroidUtilities.m35dp(3.0f));
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            invalidateShader();
        }

        public void setColor(int i) {
            this.alpha = Color.alpha(i) / 255.0f;
            invalidateShader();
            invalidate();
        }

        private void invalidateShader() {
            this.colorPaint.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{0, ColorPickerBottomSheet.this.mColor}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
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

        private void updatePosition(float f) {
            float m35dp = AndroidUtilities.m35dp(6.0f);
            this.alpha = MathUtils.clamp(((f - m35dp) + (AndroidUtilities.m35dp(13.0f) - (this.outlinePaint.getStrokeWidth() / 2.0f))) / (getWidth() - (m35dp * 2.0f)), 0.0f, 1.0f);
            ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
            colorPickerBottomSheet.onSetColor(ColorUtils.setAlphaComponent(colorPickerBottomSheet.mColor, (int) (this.alpha * 255.0f)), 1);
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float height = getHeight() / 2.0f;
            float m35dp = AndroidUtilities.m35dp(6.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            float f = height - m35dp;
            float f2 = height + m35dp;
            rectF.set(m35dp, f, getWidth() - m35dp, f2);
            canvas.save();
            ColorPickerBottomSheet.this.path.rewind();
            ColorPickerBottomSheet.this.path.addRoundRect(rectF, AndroidUtilities.m35dp(16.0f), AndroidUtilities.m35dp(16.0f), Path.Direction.CW);
            canvas.clipPath(ColorPickerBottomSheet.this.path);
            PaintColorsListView.drawCheckerboard(canvas, rectF, AndroidUtilities.m35dp(6.0f));
            canvas.restore();
            rectF.set(m35dp, f, getWidth() - m35dp, f2);
            canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(16.0f), AndroidUtilities.m35dp(16.0f), this.colorPaint);
            float m35dp2 = AndroidUtilities.m35dp(13.0f);
            float strokeWidth = m35dp2 - (this.outlinePaint.getStrokeWidth() / 2.0f);
            float max = Math.max(m35dp + strokeWidth, (m35dp + ((getWidth() - (2.0f * m35dp)) * this.alpha)) - strokeWidth);
            canvas.drawCircle(max, height, m35dp2, this.outlinePaint);
            PaintColorsListView.drawColorCircle(canvas, max, height, strokeWidth, ColorUtils.setAlphaComponent(ColorPickerBottomSheet.this.mColor, (int) (this.alpha * 255.0f)));
        }
    }

    public final class ColorSliderView extends View {
        private Paint colorPaint;
        private int filledColor;
        private int mode;
        private Paint outlinePaint;

        public ColorSliderView(Context context) {
            super(context);
            this.colorPaint = new Paint(1);
            Paint paint = new Paint(1);
            this.outlinePaint = paint;
            paint.setColor(-1);
            this.outlinePaint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.outlinePaint.setStrokeWidth(AndroidUtilities.m35dp(3.0f));
        }

        @Override
        protected void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            invalidateShader();
        }

        public void setMode(int i) {
            this.mode = i;
        }

        public void invalidateColor() {
            this.filledColor = ColorUtils.setAlphaComponent(ColorPickerBottomSheet.this.mColor, 255);
            invalidateShader();
            invalidate();
        }

        private void invalidateShader() {
            int argb;
            int argb2;
            int i = this.mode;
            if (i == 1) {
                argb = Color.argb(255, Color.red(ColorPickerBottomSheet.this.mColor), 0, Color.blue(ColorPickerBottomSheet.this.mColor));
                argb2 = Color.argb(255, Color.red(ColorPickerBottomSheet.this.mColor), 255, Color.blue(ColorPickerBottomSheet.this.mColor));
            } else if (i != 2) {
                argb = Color.argb(255, 0, Color.green(ColorPickerBottomSheet.this.mColor), Color.blue(ColorPickerBottomSheet.this.mColor));
                argb2 = Color.argb(255, 255, Color.green(ColorPickerBottomSheet.this.mColor), Color.blue(ColorPickerBottomSheet.this.mColor));
            } else {
                argb = Color.argb(255, Color.red(ColorPickerBottomSheet.this.mColor), Color.green(ColorPickerBottomSheet.this.mColor), 0);
                argb2 = Color.argb(255, Color.red(ColorPickerBottomSheet.this.mColor), Color.green(ColorPickerBottomSheet.this.mColor), 255);
            }
            this.colorPaint.setShader(new LinearGradient(0.0f, 0.0f, getWidth(), 0.0f, new int[]{argb, argb2}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
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

        private void updatePosition(float f) {
            float m35dp = AndroidUtilities.m35dp(6.0f);
            float clamp = MathUtils.clamp(((f - m35dp) + (AndroidUtilities.m35dp(13.0f) - (this.outlinePaint.getStrokeWidth() / 2.0f))) / (getWidth() - (m35dp * 2.0f)), 0.0f, 1.0f);
            int i = this.mode;
            int argb = i != 1 ? i != 2 ? Color.argb(255, (int) (clamp * 255.0f), Color.green(ColorPickerBottomSheet.this.mColor), Color.blue(ColorPickerBottomSheet.this.mColor)) : Color.argb(255, Color.red(ColorPickerBottomSheet.this.mColor), Color.green(ColorPickerBottomSheet.this.mColor), (int) (clamp * 255.0f)) : Color.argb(255, Color.red(ColorPickerBottomSheet.this.mColor), (int) (clamp * 255.0f), Color.blue(ColorPickerBottomSheet.this.mColor));
            ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
            colorPickerBottomSheet.onSetColor(ColorUtils.setAlphaComponent(argb, Color.alpha(colorPickerBottomSheet.mColor)), 4);
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            float height = getHeight() / 2.0f;
            float m35dp = AndroidUtilities.m35dp(6.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(m35dp, height - m35dp, getWidth() - m35dp, height + m35dp);
            canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(16.0f), AndroidUtilities.m35dp(16.0f), this.colorPaint);
            int i = this.mode;
            float red = (i != 1 ? i != 2 ? Color.red(ColorPickerBottomSheet.this.mColor) : Color.blue(ColorPickerBottomSheet.this.mColor) : Color.green(ColorPickerBottomSheet.this.mColor)) / 255.0f;
            float m35dp2 = AndroidUtilities.m35dp(13.0f);
            float strokeWidth = m35dp2 - (this.outlinePaint.getStrokeWidth() / 2.0f);
            float max = Math.max(m35dp + strokeWidth, (m35dp + ((getWidth() - (2.0f * m35dp)) * red)) - strokeWidth);
            canvas.drawCircle(max, height, m35dp2, this.outlinePaint);
            PaintColorsListView.drawColorCircle(canvas, max, height, strokeWidth, this.filledColor);
        }
    }
}

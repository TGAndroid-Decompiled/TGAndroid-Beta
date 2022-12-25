package org.telegram.p009ui.Components.Crop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.LocaleController;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.LayoutHelper;

public class CropRotationWheel extends FrameLayout {
    private ImageView aspectRatioButton;
    private Paint bluePaint;
    private String degreesText;
    private TextPaint degreesTextPaint;
    private ImageView mirrorButton;
    private float prevX;
    protected float rotation;
    private ImageView rotation90Button;
    private RotationWheelListener rotationListener;
    private RectF tempRect;
    private Paint whitePaint;

    public interface RotationWheelListener {
        void aspectRatioPressed();

        boolean mirror();

        void onChange(float f);

        void onEnd(float f);

        void onStart();

        boolean rotate90Pressed();
    }

    public void setFreeform(boolean z) {
    }

    public CropRotationWheel(Context context) {
        super(context);
        this.tempRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.whitePaint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.whitePaint.setColor(-1);
        this.whitePaint.setAlpha(255);
        this.whitePaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.bluePaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.bluePaint.setColor(-11420173);
        this.bluePaint.setAlpha(255);
        this.bluePaint.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.mirrorButton = imageView;
        imageView.setImageResource(C1010R.C1011drawable.msg_photo_flip);
        this.mirrorButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.mirrorButton.setScaleType(ImageView.ScaleType.CENTER);
        this.mirrorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CropRotationWheel.this.lambda$new$0(view);
            }
        });
        this.mirrorButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean lambda$new$1;
                lambda$new$1 = CropRotationWheel.this.lambda$new$1(view);
                return lambda$new$1;
            }
        });
        this.mirrorButton.setContentDescription(LocaleController.getString("AccDescrMirror", C1010R.string.AccDescrMirror));
        addView(this.mirrorButton, LayoutHelper.createFrame(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.aspectRatioButton = imageView2;
        imageView2.setImageResource(C1010R.C1011drawable.msg_photo_cropfix);
        this.aspectRatioButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.aspectRatioButton.setScaleType(ImageView.ScaleType.CENTER);
        this.aspectRatioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CropRotationWheel.this.lambda$new$2(view);
            }
        });
        this.aspectRatioButton.setVisibility(8);
        this.aspectRatioButton.setContentDescription(LocaleController.getString("AccDescrAspectRatio", C1010R.string.AccDescrAspectRatio));
        addView(this.aspectRatioButton, LayoutHelper.createFrame(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.rotation90Button = imageView3;
        imageView3.setImageResource(C1010R.C1011drawable.msg_photo_rotate);
        this.rotation90Button.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.rotation90Button.setScaleType(ImageView.ScaleType.CENTER);
        this.rotation90Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CropRotationWheel.this.lambda$new$3(view);
            }
        });
        this.rotation90Button.setContentDescription(LocaleController.getString("AccDescrRotate", C1010R.string.AccDescrRotate));
        addView(this.rotation90Button, LayoutHelper.createFrame(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.degreesTextPaint = textPaint;
        textPaint.setColor(-1);
        this.degreesTextPaint.setTextSize(AndroidUtilities.m35dp(14.0f));
        setWillNotDraw(false);
        setRotation(0.0f, false);
    }

    public void lambda$new$0(View view) {
        RotationWheelListener rotationWheelListener = this.rotationListener;
        if (rotationWheelListener != null) {
            setMirrored(rotationWheelListener.mirror());
        }
    }

    public boolean lambda$new$1(View view) {
        this.aspectRatioButton.callOnClick();
        return true;
    }

    public void lambda$new$2(View view) {
        RotationWheelListener rotationWheelListener = this.rotationListener;
        if (rotationWheelListener != null) {
            rotationWheelListener.aspectRatioPressed();
        }
    }

    public void lambda$new$3(View view) {
        RotationWheelListener rotationWheelListener = this.rotationListener;
        if (rotationWheelListener != null) {
            setRotated(rotationWheelListener.rotate90Pressed());
        }
    }

    public void setMirrored(boolean z) {
        this.mirrorButton.setColorFilter(z ? new PorterDuffColorFilter(Theme.getColor("dialogFloatingButton"), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setRotated(boolean z) {
        this.rotation90Button.setColorFilter(z ? new PorterDuffColorFilter(Theme.getColor("dialogFloatingButton"), PorterDuff.Mode.MULTIPLY) : null);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), AndroidUtilities.m35dp(400.0f)), 1073741824), i2);
    }

    public void reset(boolean z) {
        setRotation(0.0f, false);
        if (z) {
            setMirrored(false);
        }
        setRotated(false);
    }

    public void setListener(RotationWheelListener rotationWheelListener) {
        this.rotationListener = rotationWheelListener;
    }

    public void setRotation(float f, boolean z) {
        this.rotation = f;
        if (Math.abs(f) < 0.099d) {
            f = Math.abs(f);
        }
        this.degreesText = String.format("%.1fº", Float.valueOf(f));
        invalidate();
    }

    @Override
    public float getRotation() {
        return this.rotation;
    }

    public void setAspectLock(boolean z) {
        this.aspectRatioButton.setColorFilter(z ? new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY) : null);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        if (actionMasked == 0) {
            this.prevX = x;
            RotationWheelListener rotationWheelListener = this.rotationListener;
            if (rotationWheelListener != null) {
                rotationWheelListener.onStart();
            }
        } else if (actionMasked == 1 || actionMasked == 3) {
            RotationWheelListener rotationWheelListener2 = this.rotationListener;
            if (rotationWheelListener2 != null) {
                rotationWheelListener2.onEnd(this.rotation);
            }
            AndroidUtilities.makeAccessibilityAnnouncement(String.format("%.1f°", Float.valueOf(this.rotation)));
        } else if (actionMasked == 2) {
            float f = this.rotation;
            double d = (this.prevX - x) / AndroidUtilities.density;
            Double.isNaN(d);
            float max = Math.max(-45.0f, Math.min(45.0f, f + ((float) ((d / 3.141592653589793d) / 1.649999976158142d))));
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    if ((Math.abs(max - 45.0f) < 0.001f && Math.abs(this.rotation - 45.0f) >= 0.001f) || (Math.abs(max - (-45.0f)) < 0.001f && Math.abs(this.rotation - (-45.0f)) >= 0.001f)) {
                        performHapticFeedback(3, 1);
                    } else if (Math.floor(this.rotation / 2.5f) != Math.floor(max / 2.5f)) {
                        performHapticFeedback(9, 1);
                    }
                } catch (Exception unused) {
                }
            }
            if (Math.abs(max - this.rotation) > 0.001d) {
                if (Math.abs(max) < 0.05d) {
                    max = 0.0f;
                }
                setRotation(max, false);
                RotationWheelListener rotationWheelListener3 = this.rotationListener;
                if (rotationWheelListener3 != null) {
                    rotationWheelListener3.onChange(this.rotation);
                }
                this.prevX = x;
            }
        }
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = (-this.rotation) * 2.0f;
        float f2 = f % 5.0f;
        int floor = (int) Math.floor(f / 5.0f);
        int i = 0;
        while (i < 16) {
            Paint paint = this.whitePaint;
            if (i < floor || (i == 0 && f2 < 0.0f)) {
                paint = this.bluePaint;
            }
            int i2 = i;
            drawLine(canvas, i, f2, width, height, i == floor || (i == 0 && floor == -1), paint);
            if (i2 != 0) {
                int i3 = -i2;
                drawLine(canvas, i3, f2, width, height, i3 == floor + 1, i3 > floor ? this.bluePaint : this.whitePaint);
            }
            i = i2 + 1;
        }
        this.bluePaint.setAlpha(255);
        this.tempRect.left = (width - AndroidUtilities.m35dp(2.5f)) / 2;
        this.tempRect.top = (height - AndroidUtilities.m35dp(22.0f)) / 2;
        this.tempRect.right = (AndroidUtilities.m35dp(2.5f) + width) / 2;
        this.tempRect.bottom = (height + AndroidUtilities.m35dp(22.0f)) / 2;
        canvas.drawRoundRect(this.tempRect, AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(2.0f), this.bluePaint);
        canvas.drawText(this.degreesText, (width - this.degreesTextPaint.measureText(this.degreesText)) / 2.0f, AndroidUtilities.m35dp(14.0f), this.degreesTextPaint);
    }

    protected void drawLine(Canvas canvas, int i, float f, int i2, int i3, boolean z, Paint paint) {
        int i4;
        int m35dp = (int) ((i2 / 2.0f) - AndroidUtilities.m35dp(70.0f));
        double d = m35dp;
        double cos = Math.cos(Math.toRadians(90.0f - ((i * 5) + f)));
        Double.isNaN(d);
        int i5 = (i2 / 2) + ((int) (d * cos));
        float abs = Math.abs(i4) / m35dp;
        int min = Math.min(255, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z) {
            paint = this.bluePaint;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        int i6 = z ? 4 : 2;
        int m35dp2 = AndroidUtilities.m35dp(z ? 16.0f : 12.0f);
        int i7 = i6 / 2;
        canvas.drawRect(i5 - i7, (i3 - m35dp2) / 2, i5 + i7, (i3 + m35dp2) / 2, paint2);
    }
}

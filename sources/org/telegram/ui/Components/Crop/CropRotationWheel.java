package org.telegram.ui.Components.Crop;

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
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;

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
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.whitePaint.setColor(-1);
        this.whitePaint.setAlpha(255);
        this.whitePaint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.bluePaint = paint2;
        paint2.setStyle(style);
        this.bluePaint.setColor(-11420173);
        this.bluePaint.setAlpha(255);
        this.bluePaint.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.mirrorButton = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        this.mirrorButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        ImageView imageView2 = this.mirrorButton;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        this.mirrorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CropRotationWheel.m2247$r8$lambda$_kKv5ZU5duqWNkbWStPVNLUqE(this.f$0, view);
            }
        });
        this.mirrorButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return CropRotationWheel.$r8$lambda$ii_mKFpdpuRx_6Yi9woLN9t_7Hc(this.f$0, view);
            }
        });
        this.mirrorButton.setContentDescription(LocaleController.getString(R.string.AccDescrMirror));
        addView(this.mirrorButton, LayoutHelper.createFrame(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.aspectRatioButton = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_cropfix);
        this.aspectRatioButton.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.aspectRatioButton.setScaleType(scaleType);
        this.aspectRatioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CropRotationWheel.$r8$lambda$rGAw4KW_FOPaf2ISMFirYQDucMg(this.f$0, view);
            }
        });
        this.aspectRatioButton.setVisibility(8);
        this.aspectRatioButton.setContentDescription(LocaleController.getString(R.string.AccDescrAspectRatio));
        addView(this.aspectRatioButton, LayoutHelper.createFrame(70, 64, 19));
        ImageView imageView4 = new ImageView(context);
        this.rotation90Button = imageView4;
        imageView4.setImageResource(R.drawable.msg_photo_rotate);
        this.rotation90Button.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039));
        this.rotation90Button.setScaleType(scaleType);
        this.rotation90Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                CropRotationWheel.m2246$r8$lambda$4pWpcLGhBIA87ldncOPMZyJpZQ(this.f$0, view);
            }
        });
        this.rotation90Button.setContentDescription(LocaleController.getString(R.string.AccDescrRotate));
        addView(this.rotation90Button, LayoutHelper.createFrame(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.degreesTextPaint = textPaint;
        textPaint.setColor(-1);
        this.degreesTextPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        setRotation(0.0f, false);
    }

    public static void m2247$r8$lambda$_kKv5ZU5duqWNkbWStPVNLUqE(CropRotationWheel cropRotationWheel, View view) {
        RotationWheelListener rotationWheelListener = cropRotationWheel.rotationListener;
        if (rotationWheelListener != null) {
            cropRotationWheel.setMirrored(rotationWheelListener.mirror());
        }
    }

    public static boolean $r8$lambda$ii_mKFpdpuRx_6Yi9woLN9t_7Hc(CropRotationWheel cropRotationWheel, View view) {
        cropRotationWheel.aspectRatioButton.callOnClick();
        return true;
    }

    public static void $r8$lambda$rGAw4KW_FOPaf2ISMFirYQDucMg(CropRotationWheel cropRotationWheel, View view) {
        RotationWheelListener rotationWheelListener = cropRotationWheel.rotationListener;
        if (rotationWheelListener != null) {
            rotationWheelListener.aspectRatioPressed();
        }
    }

    public static void m2246$r8$lambda$4pWpcLGhBIA87ldncOPMZyJpZQ(CropRotationWheel cropRotationWheel, View view) {
        RotationWheelListener rotationWheelListener = cropRotationWheel.rotationListener;
        if (rotationWheelListener != null) {
            cropRotationWheel.setRotated(rotationWheelListener.rotate90Pressed());
        }
    }

    public void setMirrored(boolean z) {
        this.mirrorButton.setColorFilter(z ? new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setRotated(boolean z) {
        this.rotation90Button.setColorFilter(z ? new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_editMediaButton), PorterDuff.Mode.MULTIPLY) : null);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), AndroidUtilities.dp(400.0f)), 1073741824), i2);
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
            float fMax = Math.max(-45.0f, Math.min(45.0f, this.rotation + ((float) ((((double) ((this.prevX - x) / AndroidUtilities.density)) / 3.141592653589793d) / 1.649999976158142d))));
            if (Build.VERSION.SDK_INT >= 27) {
                try {
                    if (Math.abs(fMax - 45.0f) < 0.001f && Math.abs(this.rotation - 45.0f) >= 0.001f) {
                        performHapticFeedback(3, 1);
                    } else if (Math.abs(fMax - (-45.0f)) < 0.001f && Math.abs(this.rotation - (-45.0f)) >= 0.001f) {
                        performHapticFeedback(3, 1);
                    } else if (Math.floor(this.rotation / 2.5f) != Math.floor(fMax / 2.5f)) {
                        AndroidUtilities.vibrateCursor(this);
                    }
                } catch (Exception unused) {
                }
            }
            if (Math.abs(fMax - this.rotation) > 0.001d) {
                if (Math.abs(fMax) < 0.05d) {
                    fMax = 0.0f;
                }
                setRotation(fMax, false);
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
        int iFloor = (int) Math.floor(f / 5.0f);
        int i = 0;
        while (i < 16) {
            Paint paint = this.whitePaint;
            if (i < iFloor || (i == 0 && f2 < 0.0f)) {
                paint = this.bluePaint;
            }
            Canvas canvas2 = canvas;
            drawLine(canvas2, i, f2, width, height, i == iFloor || (i == 0 && iFloor == -1), paint);
            int i2 = i;
            if (i2 != 0) {
                int i3 = -i2;
                drawLine(canvas2, i3, f2, width, height, i3 == iFloor + 1, i3 > iFloor ? this.bluePaint : this.whitePaint);
            }
            i = i2 + 1;
            canvas = canvas2;
        }
        Canvas canvas3 = canvas;
        this.bluePaint.setAlpha(255);
        this.tempRect.left = (width - AndroidUtilities.dp(2.5f)) / 2;
        this.tempRect.top = (height - AndroidUtilities.dp(22.0f)) / 2;
        this.tempRect.right = (AndroidUtilities.dp(2.5f) + width) / 2;
        this.tempRect.bottom = (height + AndroidUtilities.dp(22.0f)) / 2;
        canvas3.drawRoundRect(this.tempRect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.bluePaint);
        canvas3.drawText(this.degreesText, (width - this.degreesTextPaint.measureText(this.degreesText)) / 2.0f, AndroidUtilities.dp(14.0f), this.degreesTextPaint);
    }

    protected void drawLine(Canvas canvas, int i, float f, int i2, int i3, boolean z, Paint paint) {
        int iDp = (int) ((i2 / 2.0f) - AndroidUtilities.dp(70.0f));
        int iCos = (int) (((double) iDp) * Math.cos(Math.toRadians(90.0f - ((i * 5) + f))));
        int i4 = (i2 / 2) + iCos;
        float fAbs = Math.abs(iCos) / iDp;
        int iMin = Math.min(255, Math.max(0, (int) ((1.0f - (fAbs * fAbs)) * 255.0f)));
        if (z) {
            paint = this.bluePaint;
        }
        Paint paint2 = paint;
        paint2.setAlpha(iMin);
        int i5 = z ? 4 : 2;
        int iDp2 = AndroidUtilities.dp(z ? 16.0f : 12.0f);
        int i6 = i5 / 2;
        canvas.drawRect(i4 - i6, (i3 - iDp2) / 2, i4 + i6, (i3 + iDp2) / 2, paint2);
    }
}

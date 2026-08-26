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
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda44;

public final class CropRotationWheel extends FrameLayout {
    public final ImageView aspectRatioButton;
    public final Paint bluePaint;
    public String degreesText;
    public final TextPaint degreesTextPaint;
    public final ImageView mirrorButton;
    public float prevX;
    public float rotation;
    public final ImageView rotation90Button;
    public RotationWheelListener rotationListener;
    public final RectF tempRect;
    public final Paint whitePaint;

    public interface RotationWheelListener {
        void aspectRatioPressed();

        boolean mirror();

        void onChange(float f);

        void onEnd();

        void onStart();

        boolean rotate90Pressed();
    }

    public CropRotationWheel(Context context) {
        super(context);
        this.tempRect = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.whitePaint = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(255);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.bluePaint = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(255);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.mirrorButton = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        final int i = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final CropRotationWheel f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        CropRotationWheel cropRotationWheel = this.f$0;
                        CropRotationWheel.RotationWheelListener rotationWheelListener = cropRotationWheel.rotationListener;
                        if (rotationWheelListener != null) {
                            cropRotationWheel.setMirrored(rotationWheelListener.mirror());
                        }
                        break;
                    case 1:
                        CropRotationWheel.RotationWheelListener rotationWheelListener2 = this.f$0.rotationListener;
                        if (rotationWheelListener2 != null) {
                            rotationWheelListener2.aspectRatioPressed();
                        }
                        break;
                    default:
                        CropRotationWheel cropRotationWheel2 = this.f$0;
                        CropRotationWheel.RotationWheelListener rotationWheelListener3 = cropRotationWheel2.rotationListener;
                        if (rotationWheelListener3 != null) {
                            cropRotationWheel2.setRotated(rotationWheelListener3.rotate90Pressed());
                        }
                        break;
                }
            }
        });
        imageView.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 5));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMirror));
        addView(imageView, LayoutHelper.createFrame(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.aspectRatioButton = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        final int i2 = 1;
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final CropRotationWheel f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        CropRotationWheel cropRotationWheel = this.f$0;
                        CropRotationWheel.RotationWheelListener rotationWheelListener = cropRotationWheel.rotationListener;
                        if (rotationWheelListener != null) {
                            cropRotationWheel.setMirrored(rotationWheelListener.mirror());
                        }
                        break;
                    case 1:
                        CropRotationWheel.RotationWheelListener rotationWheelListener2 = this.f$0.rotationListener;
                        if (rotationWheelListener2 != null) {
                            rotationWheelListener2.aspectRatioPressed();
                        }
                        break;
                    default:
                        CropRotationWheel cropRotationWheel2 = this.f$0;
                        CropRotationWheel.RotationWheelListener rotationWheelListener3 = cropRotationWheel2.rotationListener;
                        if (rotationWheelListener3 != null) {
                            cropRotationWheel2.setRotated(rotationWheelListener3.rotate90Pressed());
                        }
                        break;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrAspectRatio));
        addView(imageView2, LayoutHelper.createFrame(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.rotation90Button = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(Theme.createSelectorDrawable(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        final int i3 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final CropRotationWheel f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        CropRotationWheel cropRotationWheel = this.f$0;
                        CropRotationWheel.RotationWheelListener rotationWheelListener = cropRotationWheel.rotationListener;
                        if (rotationWheelListener != null) {
                            cropRotationWheel.setMirrored(rotationWheelListener.mirror());
                        }
                        break;
                    case 1:
                        CropRotationWheel.RotationWheelListener rotationWheelListener2 = this.f$0.rotationListener;
                        if (rotationWheelListener2 != null) {
                            rotationWheelListener2.aspectRatioPressed();
                        }
                        break;
                    default:
                        CropRotationWheel cropRotationWheel2 = this.f$0;
                        CropRotationWheel.RotationWheelListener rotationWheelListener3 = cropRotationWheel2.rotationListener;
                        if (rotationWheelListener3 != null) {
                            cropRotationWheel2.setRotated(rotationWheelListener3.rotate90Pressed());
                        }
                        break;
                }
            }
        });
        imageView3.setContentDescription(LocaleController.getString(R.string.AccDescrRotate));
        addView(imageView3, LayoutHelper.createFrame(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.degreesTextPaint = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
        setWillNotDraw(false);
        setRotation$1(0.0f);
    }

    public final void drawLine(Canvas canvas, int i, float f, int i2, int i3, boolean z, Paint paint) {
        int iDp = (int) ((i2 / 2.0f) - AndroidUtilities.dp(70.0f));
        int iCos = (int) (Math.cos(Math.toRadians(90.0f - ((i * 5) + f))) * ((double) iDp));
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

    @Override
    public float getRotation() {
        return this.rotation;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = (-this.rotation) * 2.0f;
        float f2 = f % 5.0f;
        int iFloor = (int) Math.floor(f / 5.0f);
        int i = 0;
        while (true) {
            Paint paint = this.bluePaint;
            if (i >= 16) {
                Canvas canvas2 = canvas;
                paint.setAlpha(255);
                RectF rectF = this.tempRect;
                rectF.left = OKLCH.m$2(2.5f, width, 2);
                rectF.top = OKLCH.m$2(22.0f, height, 2);
                rectF.right = (AndroidUtilities.dp(2.5f) + width) / 2;
                rectF.bottom = (AndroidUtilities.dp(22.0f) + height) / 2;
                canvas2.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), paint);
                TextPaint textPaint = this.degreesTextPaint;
                canvas2.drawText(this.degreesText, (width - textPaint.measureText(this.degreesText)) / 2.0f, AndroidUtilities.dp(14.0f), textPaint);
                return;
            }
            Paint paint2 = this.whitePaint;
            Canvas canvas3 = canvas;
            drawLine(canvas3, i, f2, width, height, i == iFloor || (i == 0 && iFloor == -1), (i < iFloor || (i == 0 && f2 < 0.0f)) ? paint : paint2);
            int i2 = i;
            if (i2 != 0) {
                int i3 = -i2;
                drawLine(canvas3, i3, f2, width, height, i3 == iFloor + 1, i3 > iFloor ? paint : paint2);
            }
            i = i2 + 1;
            canvas = canvas3;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), AndroidUtilities.dp(400.0f)), 1073741824), i2);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        if (actionMasked == 0) {
            this.prevX = x;
            RotationWheelListener rotationWheelListener = this.rotationListener;
            if (rotationWheelListener != null) {
                rotationWheelListener.onStart();
                return true;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                RotationWheelListener rotationWheelListener2 = this.rotationListener;
                if (rotationWheelListener2 != null) {
                    rotationWheelListener2.onEnd();
                }
                AndroidUtilities.makeAccessibilityAnnouncement(String.format("%.1f°", Float.valueOf(this.rotation)));
                return true;
            }
            if (actionMasked == 2) {
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
                    setRotation$1(fMax);
                    RotationWheelListener rotationWheelListener3 = this.rotationListener;
                    if (rotationWheelListener3 != null) {
                        rotationWheelListener3.onChange(this.rotation);
                    }
                    this.prevX = x;
                }
            }
        }
        return true;
    }

    public void setAspectLock(boolean z) {
        this.aspectRatioButton.setColorFilter(z ? new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setFreeform(boolean z) {
    }

    public void setListener(RotationWheelListener rotationWheelListener) {
        this.rotationListener = rotationWheelListener;
    }

    public void setMirrored(boolean z) {
        this.mirrorButton.setColorFilter(z ? new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_editMediaButton, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setRotated(boolean z) {
        this.rotation90Button.setColorFilter(z ? new PorterDuffColorFilter(Theme.getColor(null, Theme.key_chat_editMediaButton, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public final void setRotation$1(float f) {
        this.rotation = f;
        if (Math.abs(f) < 0.099d) {
            f = Math.abs(f);
        }
        this.degreesText = String.format("%.1fº", Float.valueOf(f));
        invalidate();
    }
}

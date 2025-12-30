package org.telegram.ui.Components.Crop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
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
                this.f$0.lambda$new$0(view);
            }
        });
        this.mirrorButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$new$1(view);
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
                this.f$0.lambda$new$2(view);
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
                this.f$0.lambda$new$3(view);
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
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Crop.CropRotationWheel.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = ((-this.rotation) * 2.0f) % 5.0f;
        int iFloor = (int) Math.floor(r0 / 5.0f);
        int i = 0;
        while (i < 16) {
            Paint paint = this.whitePaint;
            if (i < iFloor || (i == 0 && f < 0.0f)) {
                paint = this.bluePaint;
            }
            int i2 = i;
            drawLine(canvas, i, f, width, height, i == iFloor || (i == 0 && iFloor == -1), paint);
            if (i2 != 0) {
                int i3 = -i2;
                drawLine(canvas, i3, f, width, height, i3 == iFloor + 1, i3 > iFloor ? this.bluePaint : this.whitePaint);
            }
            i = i2 + 1;
        }
        this.bluePaint.setAlpha(255);
        this.tempRect.left = (width - AndroidUtilities.dp(2.5f)) / 2;
        this.tempRect.top = (height - AndroidUtilities.dp(22.0f)) / 2;
        this.tempRect.right = (AndroidUtilities.dp(2.5f) + width) / 2;
        this.tempRect.bottom = (height + AndroidUtilities.dp(22.0f)) / 2;
        canvas.drawRoundRect(this.tempRect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), this.bluePaint);
        canvas.drawText(this.degreesText, (width - this.degreesTextPaint.measureText(this.degreesText)) / 2.0f, AndroidUtilities.dp(14.0f), this.degreesTextPaint);
    }

    protected void drawLine(Canvas canvas, int i, float f, int i2, int i3, boolean z, Paint paint) {
        int iDp = (int) ((i2 / 2.0f) - AndroidUtilities.dp(70.0f));
        int iCos = (i2 / 2) + ((int) (iDp * Math.cos(Math.toRadians(90.0f - ((i * 5) + f)))));
        float fAbs = Math.abs(r8) / iDp;
        int iMin = Math.min(255, Math.max(0, (int) ((1.0f - (fAbs * fAbs)) * 255.0f)));
        if (z) {
            paint = this.bluePaint;
        }
        Paint paint2 = paint;
        paint2.setAlpha(iMin);
        int i4 = z ? 4 : 2;
        int iDp2 = AndroidUtilities.dp(z ? 16.0f : 12.0f);
        int i5 = i4 / 2;
        canvas.drawRect(iCos - i5, (i3 - iDp2) / 2, iCos + i5, (i3 + iDp2) / 2, paint2);
    }
}

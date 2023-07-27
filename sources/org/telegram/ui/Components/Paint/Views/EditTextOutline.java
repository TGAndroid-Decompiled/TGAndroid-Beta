package org.telegram.ui.Components.Paint.Views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public class EditTextOutline extends EditTextBoldCursor {
    public boolean betterFraming;
    private boolean isFrameDirty;
    private float lastFrameRoundRadius;
    private RectF[] lines;
    private Bitmap mCache;
    private Canvas mCanvas;
    private int mFrameColor;
    private int mStrokeColor;
    private float mStrokeWidth;
    private boolean mUpdateCachedBitmap;
    private Paint paint;
    private Path path;
    private TextPaint textPaint;

    public EditTextOutline(Context context) {
        super(context);
        this.mCanvas = new Canvas();
        this.textPaint = new TextPaint(1);
        this.paint = new Paint(1);
        this.path = new Path();
        this.mStrokeColor = 0;
        setInputType(getInputType() | 131072 | 524288);
        this.mUpdateCachedBitmap = true;
        this.isFrameDirty = true;
        setFrameRoundRadius(AndroidUtilities.dp(16.0f));
        this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f) {
        if (Math.abs(this.lastFrameRoundRadius - f) > 0.1f) {
            Paint paint = this.paint;
            this.lastFrameRoundRadius = f;
            paint.setPathEffect(new CornerPathEffect(f));
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.mUpdateCachedBitmap = true;
        this.isFrameDirty = true;
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i > 0 && i2 > 0) {
            this.mUpdateCachedBitmap = true;
            this.isFrameDirty = true;
            Bitmap bitmap = this.mCache;
            if (bitmap != null) {
                bitmap.recycle();
            }
            this.mCache = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            return;
        }
        this.mCache = null;
    }

    @Override
    public void setGravity(int i) {
        super.setGravity(i);
        this.mUpdateCachedBitmap = true;
        this.isFrameDirty = true;
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.mStrokeColor = i;
        this.mUpdateCachedBitmap = true;
        invalidate();
    }

    public void setFrameColor(int i) {
        int i2 = this.mFrameColor;
        if (i2 == 0 && i != 0) {
            setPadding(AndroidUtilities.dp(19.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(7.0f));
            setCursorColor(-1);
        } else if (i2 != 0 && i == 0) {
            setPadding(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
            setCursorColor(-1);
        }
        this.mFrameColor = i;
        if (i != 0) {
            float computePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(i);
            if (computePerceivedBrightness == 0.0f) {
                computePerceivedBrightness = Color.red(this.mFrameColor) / 255.0f;
            }
            if (computePerceivedBrightness > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.isFrameDirty = true;
        }
        this.mUpdateCachedBitmap = true;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.mStrokeWidth = f;
        this.mUpdateCachedBitmap = true;
        invalidate();
    }

    @Override
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        boolean z;
        int i = 0;
        if (this.mCache != null && this.mStrokeColor != 0) {
            if (this.mUpdateCachedBitmap) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                Editable text = getText();
                this.mCanvas.setBitmap(this.mCache);
                this.mCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
                float f = this.mStrokeWidth;
                if (f <= 0.0f) {
                    f = (float) Math.ceil(getTextSize() / 11.5f);
                }
                this.textPaint.setStrokeWidth(f);
                this.textPaint.setColor(this.mStrokeColor);
                this.textPaint.setTextSize(getTextSize());
                this.textPaint.setTypeface(getTypeface());
                this.textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                if (getLayout() != null) {
                    alignment = getLayout().getAlignment();
                }
                StaticLayout staticLayout = new StaticLayout(text, this.textPaint, measuredWidth, alignment, 1.0f, 0.0f, true);
                this.mCanvas.save();
                this.mCanvas.translate(getPaddingLeft(), ((((measuredHeight - getPaddingTop()) - getPaddingBottom()) - staticLayout.getHeight()) / 2.0f) + getPaddingTop());
                staticLayout.draw(this.mCanvas);
                this.mCanvas.restore();
                this.mUpdateCachedBitmap = false;
            }
            canvas.drawBitmap(this.mCache, 0.0f, 0.0f, this.textPaint);
        }
        if (this.mFrameColor != 0) {
            canvas.save();
            if (this.betterFraming) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            this.paint.setColor(this.mFrameColor);
            Layout layout = getLayout();
            if (layout == null) {
                super.onDraw(canvas);
                return;
            }
            RectF[] rectFArr = this.lines;
            if (rectFArr == null || rectFArr.length != layout.getLineCount()) {
                this.lines = new RectF[layout.getLineCount()];
                this.isFrameDirty = true;
            }
            if (this.isFrameDirty) {
                this.isFrameDirty = false;
                for (int i2 = 0; i2 < layout.getLineCount(); i2++) {
                    RectF[] rectFArr2 = this.lines;
                    if (rectFArr2[i2] == null) {
                        rectFArr2[i2] = new RectF();
                    }
                    this.lines[i2].set(layout.getLineLeft(i2), layout.getLineTop(i2), layout.getLineRight(i2), layout.getLineBottom(i2));
                    if (this.lines[i2].width() > AndroidUtilities.dp(1.0f)) {
                        if (this.betterFraming) {
                            this.lines[i2].inset((-getTextSize()) / 3.0f, 0.0f);
                            this.lines[i2].top += AndroidUtilities.dpf2(1.2f);
                            this.lines[i2].bottom += AndroidUtilities.dpf2(1.0f);
                            this.lines[i2].left = Math.max(-getPaddingLeft(), this.lines[i2].left);
                            this.lines[i2].right = Math.min(getWidth() - getPaddingLeft(), this.lines[i2].right);
                        } else {
                            this.lines[i2].right += AndroidUtilities.dp(32.0f);
                            this.lines[i2].bottom += AndroidUtilities.dp(6.0f);
                        }
                    } else {
                        RectF[] rectFArr3 = this.lines;
                        rectFArr3[i2].left = rectFArr3[i2].right;
                    }
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        if (this.lines[i3].width() > 0.0f) {
                            RectF[] rectFArr4 = this.lines;
                            rectFArr4[i3].bottom = rectFArr4[i2].top;
                        }
                    }
                }
            }
            this.path.rewind();
            float height = getHeight();
            int i4 = 0;
            while (true) {
                RectF[] rectFArr5 = this.lines;
                if (i4 >= rectFArr5.length) {
                    break;
                }
                if (rectFArr5[i4].width() != 0.0f) {
                    RectF[] rectFArr6 = this.lines;
                    height = rectFArr6[i4].bottom - rectFArr6[i4].top;
                }
                i4++;
            }
            float min = Math.min(height / 3.0f, AndroidUtilities.dp(16.0f));
            float f2 = 1.5f * min;
            int i5 = 1;
            while (true) {
                RectF[] rectFArr7 = this.lines;
                if (i5 >= rectFArr7.length) {
                    break;
                }
                RectF rectF = rectFArr7[i5 - 1];
                RectF rectF2 = rectFArr7[i5];
                if (rectF.width() >= AndroidUtilities.dp(1.0f) && rectF2.width() >= AndroidUtilities.dp(1.0f)) {
                    if (Math.abs(rectF.left - rectF2.left) < f2) {
                        float min2 = Math.min(rectF2.left, rectF.left);
                        rectF.left = min2;
                        rectF2.left = min2;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Math.abs(rectF.right - rectF2.right) < f2) {
                        float max = Math.max(rectF2.right, rectF.right);
                        rectF.right = max;
                        rectF2.right = max;
                        z = true;
                    }
                    if (z) {
                        for (int i6 = i5; i6 >= 1; i6--) {
                            RectF[] rectFArr8 = this.lines;
                            RectF rectF3 = rectFArr8[i6 - 1];
                            RectF rectF4 = rectFArr8[i6];
                            if (rectF3.width() >= AndroidUtilities.dp(1.0f) && rectF4.width() >= AndroidUtilities.dp(1.0f)) {
                                if (Math.abs(rectF3.left - rectF4.left) < f2) {
                                    float min3 = Math.min(rectF4.left, rectF3.left);
                                    rectF3.left = min3;
                                    rectF4.left = min3;
                                }
                                if (Math.abs(rectF3.right - rectF4.right) < f2) {
                                    float max2 = Math.max(rectF4.right, rectF3.right);
                                    rectF3.right = max2;
                                    rectF4.right = max2;
                                }
                            }
                        }
                    }
                }
                i5++;
            }
            while (true) {
                RectF[] rectFArr9 = this.lines;
                if (i >= rectFArr9.length) {
                    break;
                }
                if (rectFArr9[i].width() != 0.0f) {
                    this.path.addRect(this.lines[i], Path.Direction.CW);
                }
                i++;
            }
            setFrameRoundRadius(min);
            canvas.drawPath(this.path, this.paint);
            canvas.restore();
        }
        super.onDraw(canvas);
    }
}

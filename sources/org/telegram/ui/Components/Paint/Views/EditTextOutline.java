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
import org.telegram.ui.Components.CornerPath;
import org.telegram.ui.Components.EditTextBoldCursor;

public class EditTextOutline extends EditTextBoldCursor {
    public RectF framePadding;
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
    private CornerPath path;
    private TextPaint textPaint;

    public EditTextOutline(Context context) {
        super(context);
        this.mCanvas = new Canvas();
        this.textPaint = new TextPaint(1);
        this.paint = new Paint(1);
        this.path = new CornerPath();
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
            canvas.translate(getPaddingLeft(), getPaddingTop());
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
                        this.lines[i2].inset((-getTextSize()) / 3.0f, 0.0f);
                        this.lines[i2].top += AndroidUtilities.dpf2(1.2f);
                        this.lines[i2].bottom += AndroidUtilities.dpf2(1.0f);
                        this.lines[i2].left = Math.max(-getPaddingLeft(), this.lines[i2].left);
                        this.lines[i2].right = Math.min(getWidth() - getPaddingLeft(), this.lines[i2].right);
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
                if (this.framePadding == null) {
                    this.framePadding = new RectF();
                }
                this.framePadding.left = getMeasuredWidth();
                this.framePadding.top = getMeasuredHeight();
                RectF rectF = this.framePadding;
                rectF.bottom = 0.0f;
                rectF.right = 0.0f;
                for (int i4 = 0; i4 < this.lines.length; i4++) {
                    RectF rectF2 = this.framePadding;
                    rectF2.left = Math.min(rectF2.left, getPaddingLeft() + this.lines[i4].left);
                    RectF rectF3 = this.framePadding;
                    rectF3.top = Math.min(rectF3.top, getPaddingTop() + this.lines[i4].top);
                    RectF rectF4 = this.framePadding;
                    rectF4.right = Math.max(rectF4.right, getPaddingLeft() + this.lines[i4].right);
                    RectF rectF5 = this.framePadding;
                    rectF5.bottom = Math.max(rectF5.bottom, getPaddingTop() + this.lines[i4].bottom);
                }
                RectF rectF6 = this.framePadding;
                float measuredWidth2 = getMeasuredWidth();
                RectF rectF7 = this.framePadding;
                rectF6.right = measuredWidth2 - rectF7.right;
                rectF7.bottom = getMeasuredHeight() - this.framePadding.bottom;
            }
            this.path.rewind();
            float textSize = getTextSize() / 3.0f;
            float f2 = 1.5f * textSize;
            int i5 = 1;
            while (true) {
                RectF[] rectFArr5 = this.lines;
                if (i5 >= rectFArr5.length) {
                    break;
                }
                RectF rectF8 = rectFArr5[i5 - 1];
                RectF rectF9 = rectFArr5[i5];
                if (rectF8.width() >= AndroidUtilities.dp(1.0f) && rectF9.width() >= AndroidUtilities.dp(1.0f)) {
                    if (Math.abs(rectF8.left - rectF9.left) < f2) {
                        float min = Math.min(rectF9.left, rectF8.left);
                        rectF8.left = min;
                        rectF9.left = min;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Math.abs(rectF8.right - rectF9.right) < f2) {
                        float max = Math.max(rectF9.right, rectF8.right);
                        rectF8.right = max;
                        rectF9.right = max;
                        z = true;
                    }
                    if (z) {
                        for (int i6 = i5; i6 >= 1; i6--) {
                            RectF[] rectFArr6 = this.lines;
                            RectF rectF10 = rectFArr6[i6 - 1];
                            RectF rectF11 = rectFArr6[i6];
                            if (rectF10.width() >= AndroidUtilities.dp(1.0f) && rectF11.width() >= AndroidUtilities.dp(1.0f)) {
                                if (Math.abs(rectF10.left - rectF11.left) < f2) {
                                    float min2 = Math.min(rectF11.left, rectF10.left);
                                    rectF10.left = min2;
                                    rectF11.left = min2;
                                }
                                if (Math.abs(rectF10.right - rectF11.right) < f2) {
                                    float max2 = Math.max(rectF11.right, rectF10.right);
                                    rectF10.right = max2;
                                    rectF11.right = max2;
                                }
                            }
                        }
                    }
                }
                i5++;
            }
            while (true) {
                RectF[] rectFArr7 = this.lines;
                if (i >= rectFArr7.length) {
                    break;
                }
                if (rectFArr7[i].width() != 0.0f) {
                    this.path.addRect(this.lines[i], Path.Direction.CW);
                }
                i++;
            }
            this.path.closeRects();
            setFrameRoundRadius(textSize);
            canvas.drawPath(this.path, this.paint);
            canvas.restore();
        } else {
            this.framePadding = null;
        }
        super.onDraw(canvas);
    }

    @Override
    public boolean onTextContextMenuItem(int i) {
        return super.onTextContextMenuItem(i);
    }
}

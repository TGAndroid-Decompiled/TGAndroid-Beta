package org.telegram.ui.Components.Paint.Views;

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
    public boolean isFrameDirty;
    public float lastFrameRoundRadius;
    public RectF[] lines;
    public Bitmap mCache;
    public final Canvas mCanvas;
    public int mFrameColor;
    public int mStrokeColor;
    public float mStrokeWidth;
    public boolean mUpdateCachedBitmap;
    public final Paint paint;
    public final CornerPath path;
    public final TextPaint textPaint;

    public EditTextOutline(Context context) {
        super(context);
        this.mCanvas = new Canvas();
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.paint = new Paint(1);
        this.path = new CornerPath();
        this.mStrokeColor = 0;
        setInputType(getInputType() | 655360);
        this.mUpdateCachedBitmap = true;
        this.isFrameDirty = true;
        setFrameRoundRadius(AndroidUtilities.dp(16.0f));
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
    }

    private void setFrameRoundRadius(float f) {
        if (Math.abs(this.lastFrameRoundRadius - f) > 0.1f) {
            Paint paint = this.paint;
            this.lastFrameRoundRadius = f;
            paint.setPathEffect(new CornerPathEffect(f));
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z;
        int i = 0;
        if (this.mCache != null && this.mStrokeColor != 0) {
            boolean z2 = this.mUpdateCachedBitmap;
            TextPaint textPaint = this.textPaint;
            if (z2) {
                int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight = getMeasuredHeight();
                Editable text = getText();
                Canvas canvas2 = this.mCanvas;
                canvas2.setBitmap(this.mCache);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                float fCeil = this.mStrokeWidth;
                if (fCeil <= 0.0f) {
                    fCeil = (float) Math.ceil(getTextSize() / 11.5f);
                }
                textPaint.setStrokeWidth(fCeil);
                textPaint.setColor(this.mStrokeColor);
                textPaint.setTextSize(getTextSize());
                textPaint.setTypeface(getTypeface());
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                if (getLayout() != null) {
                    alignment = getLayout().getAlignment();
                }
                StaticLayout staticLayout = new StaticLayout(text, textPaint, measuredWidth, alignment, 1.0f, 0.0f, true);
                canvas2.save();
                canvas2.translate(getPaddingLeft(), ((((measuredHeight - getPaddingTop()) - getPaddingBottom()) - staticLayout.getHeight()) / 2.0f) + getPaddingTop());
                staticLayout.draw(canvas2);
                canvas2.restore();
                this.mUpdateCachedBitmap = false;
            }
            canvas.drawBitmap(this.mCache, 0.0f, 0.0f, textPaint);
        }
        if (this.mFrameColor != 0) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            Paint paint = this.paint;
            paint.setColor(this.mFrameColor);
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
                        RectF rectF = this.lines[i2];
                        rectF.top = AndroidUtilities.dpf2(1.2f) + rectF.top;
                        RectF rectF2 = this.lines[i2];
                        rectF2.bottom = AndroidUtilities.dpf2(1.0f) + rectF2.bottom;
                        this.lines[i2].left = Math.max(-getPaddingLeft(), this.lines[i2].left);
                        this.lines[i2].right = Math.min(getWidth() - getPaddingLeft(), this.lines[i2].right);
                    } else {
                        RectF rectF3 = this.lines[i2];
                        rectF3.left = rectF3.right;
                    }
                    if (i2 > 0) {
                        int i3 = i2 - 1;
                        if (this.lines[i3].width() > 0.0f) {
                            RectF[] rectFArr3 = this.lines;
                            rectFArr3[i3].bottom = rectFArr3[i2].top;
                        }
                    }
                }
                if (this.framePadding == null) {
                    this.framePadding = new RectF();
                }
                this.framePadding.left = getMeasuredWidth();
                this.framePadding.top = getMeasuredHeight();
                RectF rectF4 = this.framePadding;
                rectF4.bottom = 0.0f;
                rectF4.right = 0.0f;
                for (int i4 = 0; i4 < this.lines.length; i4++) {
                    RectF rectF5 = this.framePadding;
                    rectF5.left = Math.min(rectF5.left, getPaddingLeft() + this.lines[i4].left);
                    RectF rectF6 = this.framePadding;
                    rectF6.top = Math.min(rectF6.top, getPaddingTop() + this.lines[i4].top);
                    RectF rectF7 = this.framePadding;
                    rectF7.right = Math.max(rectF7.right, getPaddingLeft() + this.lines[i4].right);
                    RectF rectF8 = this.framePadding;
                    rectF8.bottom = Math.max(rectF8.bottom, getPaddingTop() + this.lines[i4].bottom);
                }
                RectF rectF9 = this.framePadding;
                float measuredWidth2 = getMeasuredWidth();
                RectF rectF10 = this.framePadding;
                rectF9.right = measuredWidth2 - rectF10.right;
                rectF10.bottom = getMeasuredHeight() - this.framePadding.bottom;
            }
            CornerPath cornerPath = this.path;
            cornerPath.rewind();
            float textSize = getTextSize() / 3.0f;
            float f = 1.5f * textSize;
            int i5 = 1;
            while (true) {
                RectF[] rectFArr4 = this.lines;
                if (i5 >= rectFArr4.length) {
                    break;
                }
                RectF rectF11 = rectFArr4[i5 - 1];
                RectF rectF12 = rectFArr4[i5];
                if (rectF11.width() >= AndroidUtilities.dp(1.0f) && rectF12.width() >= AndroidUtilities.dp(1.0f)) {
                    if (Math.abs(rectF11.left - rectF12.left) < f) {
                        float fMin = Math.min(rectF12.left, rectF11.left);
                        rectF11.left = fMin;
                        rectF12.left = fMin;
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Math.abs(rectF11.right - rectF12.right) < f) {
                        float fMax = Math.max(rectF12.right, rectF11.right);
                        rectF11.right = fMax;
                        rectF12.right = fMax;
                        z = true;
                    }
                    if (z) {
                        for (int i6 = i5; i6 >= 1; i6--) {
                            RectF[] rectFArr5 = this.lines;
                            RectF rectF13 = rectFArr5[i6 - 1];
                            RectF rectF14 = rectFArr5[i6];
                            if (rectF13.width() >= AndroidUtilities.dp(1.0f) && rectF14.width() >= AndroidUtilities.dp(1.0f)) {
                                if (Math.abs(rectF13.left - rectF14.left) < f) {
                                    float fMin2 = Math.min(rectF14.left, rectF13.left);
                                    rectF13.left = fMin2;
                                    rectF14.left = fMin2;
                                }
                                if (Math.abs(rectF13.right - rectF14.right) < f) {
                                    float fMax2 = Math.max(rectF14.right, rectF13.right);
                                    rectF13.right = fMax2;
                                    rectF14.right = fMax2;
                                }
                            }
                        }
                    }
                }
                i5++;
            }
            while (true) {
                RectF[] rectFArr6 = this.lines;
                if (i >= rectFArr6.length) {
                    break;
                }
                if (rectFArr6[i].width() != 0.0f) {
                    cornerPath.addRect(this.lines[i], Path.Direction.CW);
                }
                i++;
            }
            cornerPath.closeRects();
            setFrameRoundRadius(textSize);
            canvas.drawPath(cornerPath, paint);
            canvas.restore();
        } else {
            this.framePadding = null;
        }
        super.onDraw(canvas);
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            this.mCache = null;
            return;
        }
        this.mUpdateCachedBitmap = true;
        this.isFrameDirty = true;
        Bitmap bitmap = this.mCache;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.mCache = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.mUpdateCachedBitmap = true;
        this.isFrameDirty = true;
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
            float fComputePerceivedBrightness = AndroidUtilities.computePerceivedBrightness(i);
            if (fComputePerceivedBrightness == 0.0f) {
                fComputePerceivedBrightness = Color.red(this.mFrameColor) / 255.0f;
            }
            if (fComputePerceivedBrightness > 0.87d) {
                setTextColor(-16777216);
            } else {
                setTextColor(-1);
            }
            this.isFrameDirty = true;
        }
        this.mUpdateCachedBitmap = true;
        invalidate();
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

    public void setStrokeWidth(float f) {
        this.mStrokeWidth = f;
        this.mUpdateCachedBitmap = true;
        invalidate();
    }
}

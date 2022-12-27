package org.telegram.p009ui.Components;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.ActionBar.Theme;

public class CanvasButton {
    private static final int[] pressedState = {16842910, 16842919};
    boolean buttonPressed;
    private Runnable delegate;
    private boolean longPressEnabled;
    Runnable longPressRunnable;
    Paint maskPaint;
    private final View parent;
    private boolean pathCreated;
    CornerPathEffect pathEffect;
    boolean rounded;
    RippleDrawable selectorDrawable;
    int usingRectCount;
    Path drawingPath = new Path();
    ArrayList<RectF> drawingRects = new ArrayList<>();
    Paint paint = new Paint(1);
    Runnable longPressRunnableInner = new Runnable() {
        @Override
        public void run() {
            CanvasButton.this.checkTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
            CanvasButton.this.parent.performHapticFeedback(0);
            Runnable runnable = CanvasButton.this.longPressRunnable;
            if (runnable != null) {
                runnable.run();
            }
        }
    };
    float roundRadius = AndroidUtilities.m36dp(12.0f);

    public CanvasButton(View view) {
        this.parent = view;
        Paint paint = this.paint;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(this.roundRadius);
        this.pathEffect = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        if (Build.VERSION.SDK_INT >= 21) {
            Paint paint2 = new Paint(1);
            this.maskPaint = paint2;
            paint2.setFilterBitmap(true);
            this.maskPaint.setPathEffect(new CornerPathEffect(AndroidUtilities.m36dp(12.0f)));
            this.maskPaint.setColor(-1);
            final Paint paint3 = new Paint(1);
            paint3.setFilterBitmap(true);
            paint3.setColor(-1);
            this.selectorDrawable = new RippleDrawable(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{Theme.getColor("listSelectorSDK21") & 436207615}), null, new Drawable() {
                @Override
                public int getOpacity() {
                    return -2;
                }

                @Override
                public void setAlpha(int i) {
                }

                @Override
                public void setColorFilter(ColorFilter colorFilter) {
                }

                @Override
                public void draw(Canvas canvas) {
                    CanvasButton canvasButton = CanvasButton.this;
                    if (canvasButton.usingRectCount > 1) {
                        canvasButton.drawInternal(canvas, canvasButton.maskPaint);
                    } else {
                        canvasButton.drawInternal(canvas, paint3);
                    }
                }
            });
        }
    }

    public void draw(Canvas canvas) {
        drawInternal(canvas, this.paint);
        RippleDrawable rippleDrawable = this.selectorDrawable;
        if (rippleDrawable != null) {
            rippleDrawable.draw(canvas);
        }
    }

    public void drawInternal(Canvas canvas, Paint paint) {
        int i = this.usingRectCount;
        int i2 = 0;
        if (i <= 1) {
            if (i == 1) {
                RippleDrawable rippleDrawable = this.selectorDrawable;
                if (rippleDrawable != null) {
                    rippleDrawable.setBounds((int) this.drawingRects.get(0).left, (int) this.drawingRects.get(0).top, (int) this.drawingRects.get(0).right, (int) this.drawingRects.get(0).bottom);
                }
                if (this.rounded) {
                    paint.setPathEffect(null);
                    float min = Math.min(this.drawingRects.get(0).width(), this.drawingRects.get(0).height()) / 2.0f;
                    canvas.drawRoundRect(this.drawingRects.get(0), min, min, paint);
                    return;
                }
                paint.setPathEffect(this.pathEffect);
                canvas.drawRoundRect(this.drawingRects.get(0), 0.0f, 0.0f, paint);
                return;
            }
            return;
        }
        if (!this.pathCreated) {
            this.drawingPath.rewind();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                int i7 = this.usingRectCount;
                if (i2 >= i7) {
                    break;
                }
                int i8 = i2 + 1;
                if (i8 < i7) {
                    float f = this.drawingRects.get(i2).right;
                    float f2 = this.drawingRects.get(i8).right;
                    if (Math.abs(f - f2) < AndroidUtilities.m36dp(4.0f)) {
                        float max = Math.max(f, f2);
                        this.drawingRects.get(i2).right = max;
                        this.drawingRects.get(i8).right = max;
                    }
                }
                if (i2 == 0 || this.drawingRects.get(i2).bottom > i3) {
                    i3 = (int) this.drawingRects.get(i2).bottom;
                }
                if (i2 == 0 || this.drawingRects.get(i2).right > i4) {
                    i4 = (int) this.drawingRects.get(i2).right;
                }
                if (i2 == 0 || this.drawingRects.get(i2).left < i5) {
                    i5 = (int) this.drawingRects.get(i2).left;
                }
                if (i2 == 0 || this.drawingRects.get(i2).top < i6) {
                    i6 = (int) this.drawingRects.get(i2).top;
                }
                this.drawingPath.addRect(this.drawingRects.get(i2), Path.Direction.CCW);
                RippleDrawable rippleDrawable2 = this.selectorDrawable;
                if (rippleDrawable2 != null) {
                    rippleDrawable2.setBounds(i5, i6, i4, i3);
                }
                i2 = i8;
            }
            this.pathCreated = true;
        }
        paint.setPathEffect(this.pathEffect);
        canvas.drawPath(this.drawingPath, paint);
    }

    public boolean checkTouchEvent(MotionEvent motionEvent) {
        RippleDrawable rippleDrawable;
        Runnable runnable;
        RippleDrawable rippleDrawable2;
        RippleDrawable rippleDrawable3;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0) {
            if (contains(x, y)) {
                this.buttonPressed = true;
                if (Build.VERSION.SDK_INT >= 21 && (rippleDrawable3 = this.selectorDrawable) != null) {
                    rippleDrawable3.setHotspot(x, y);
                    this.selectorDrawable.setState(pressedState);
                }
                AndroidUtilities.cancelRunOnUIThread(this.longPressRunnableInner);
                if (this.longPressEnabled) {
                    AndroidUtilities.runOnUIThread(this.longPressRunnableInner, ViewConfiguration.getLongPressTimeout());
                }
                this.parent.invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.buttonPressed) {
                if (motionEvent.getAction() == 1 && (runnable = this.delegate) != null) {
                    runnable.run();
                }
                this.parent.playSoundEffect(0);
                if (Build.VERSION.SDK_INT >= 21 && (rippleDrawable = this.selectorDrawable) != null) {
                    rippleDrawable.setState(StateSet.NOTHING);
                }
                this.buttonPressed = false;
                this.parent.invalidate();
            }
            AndroidUtilities.cancelRunOnUIThread(this.longPressRunnableInner);
        } else if (motionEvent.getAction() == 2 && this.buttonPressed && Build.VERSION.SDK_INT >= 21 && (rippleDrawable2 = this.selectorDrawable) != null) {
            rippleDrawable2.setHotspot(x, y);
        }
        return this.buttonPressed;
    }

    private boolean contains(int i, int i2) {
        for (int i3 = 0; i3 < this.usingRectCount; i3++) {
            if (this.drawingRects.get(i3).contains(i, i2)) {
                return true;
            }
        }
        return false;
    }

    public void setColor(int i) {
        setColor(i, i);
    }

    public void setColor(int i, int i2) {
        this.paint.setColor(i);
        RippleDrawable rippleDrawable = this.selectorDrawable;
        if (rippleDrawable == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        Theme.setSelectorDrawableColor(rippleDrawable, i2, true);
    }

    public void setDelegate(Runnable runnable) {
        this.delegate = runnable;
    }

    public void rewind() {
        this.pathCreated = false;
        this.usingRectCount = 0;
    }

    public void addRect(RectF rectF) {
        int i = this.usingRectCount + 1;
        this.usingRectCount = i;
        if (i > this.drawingRects.size()) {
            this.drawingRects.add(new RectF());
        }
        this.drawingRects.get(this.usingRectCount - 1).set(rectF);
    }

    public void setRect(RectF rectF) {
        rewind();
        addRect(rectF);
    }

    public void setLongPress(Runnable runnable) {
        this.longPressEnabled = true;
        this.longPressRunnable = runnable;
    }

    public void setRounded(boolean z) {
        this.rounded = z;
    }

    public void cancelRipple() {
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT < 21 || (rippleDrawable = this.selectorDrawable) == null) {
            return;
        }
        rippleDrawable.setState(StateSet.NOTHING);
        this.selectorDrawable.jumpToCurrentState();
    }
}

package org.telegram.ui.Components.Paint.Views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
public class PaintToolsView extends LinearLayout {
    private final int brushesCount;
    private RLottieImageView[] buttons;
    private Delegate delegate;
    private boolean isShapeSelected;
    private ValueAnimator nextSelectedAnimator;
    private int nextSelectedIndex;
    private float nextSelectedIndexProgress;
    private int selectedIndex;
    private Paint selectorPaint;

    public interface Delegate {
        void onAddButtonPressed(View view);

        void onBrushSelected(Brush brush);

        void onColorPickerSelected();

        PersistColorPalette onGetPalette();
    }

    public PaintToolsView(Context context, boolean z) {
        super(context);
        this.buttons = new RLottieImageView[Brush.BRUSHES_LIST.size() + 2];
        this.selectorPaint = new Paint(1);
        this.selectedIndex = 1;
        this.nextSelectedIndex = -1;
        this.nextSelectedIndexProgress = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        this.selectorPaint.setColor(822083583);
        this.brushesCount = Brush.BRUSHES_LIST.size() - (!z ? 1 : 0);
        int i = 0;
        final int i2 = 0;
        while (i < Brush.BRUSHES_LIST.size() + 2) {
            this.buttons[i2] = createView(i == 0, i == Brush.BRUSHES_LIST.size() + 1);
            if (i == 0) {
                this.buttons[i2].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PaintToolsView.this.lambda$new$0(view);
                    }
                });
            } else if (i > 0 && i <= Brush.BRUSHES_LIST.size()) {
                final Brush brush = Brush.BRUSHES_LIST.get(i - 1);
                if (z || !(brush instanceof Brush.Blurer)) {
                    this.buttons[i2].setAnimation(brush.getIconRes(), 28, 28);
                    this.buttons[i2].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            PaintToolsView.this.lambda$new$1(i2, brush, view);
                        }
                    });
                } else {
                    i++;
                }
            } else if (i == Brush.BRUSHES_LIST.size() + 1) {
                this.buttons[i2].setImageResource(R.drawable.msg_add);
                this.buttons[i2].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        PaintToolsView.this.lambda$new$2(view);
                    }
                });
            }
            addView(this.buttons[i2]);
            i2++;
            i++;
        }
    }

    public void lambda$new$0(View view) {
        this.delegate.onColorPickerSelected();
    }

    public void lambda$new$1(int i, Brush brush, View view) {
        animateNextIndex(i);
        this.delegate.onGetPalette().setCurrentBrush(i - 1);
        this.delegate.onBrushSelected(brush);
    }

    public void lambda$new$2(View view) {
        this.delegate.onAddButtonPressed(view);
    }

    public void setSelectedIndex(int i) {
        this.selectedIndex = i;
        if (this.isShapeSelected) {
            this.isShapeSelected = false;
            AndroidUtilities.updateImageViewImageAnimated(this.buttons[this.brushesCount + 1], R.drawable.msg_add);
        }
        invalidate();
    }

    public void select(int i) {
        animateNextIndex(i);
        this.delegate.onGetPalette().setCurrentBrush(i - 1);
    }

    public void animatePlusToIcon(int i) {
        animateNextIndex(this.brushesCount + 1);
        AndroidUtilities.updateImageViewImageAnimated(this.buttons[this.brushesCount + 1], i);
        this.isShapeSelected = true;
    }

    private void animateNextIndex(int i) {
        if (i >= 0) {
            RLottieImageView[] rLottieImageViewArr = this.buttons;
            if (i >= rLottieImageViewArr.length) {
                return;
            }
            if (this.nextSelectedAnimator == null || this.nextSelectedIndex != i) {
                RLottieImageView rLottieImageView = rLottieImageViewArr[i];
                if (rLottieImageView != null) {
                    Drawable drawable = rLottieImageView.getDrawable();
                    if (drawable instanceof RLottieDrawable) {
                        RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                        rLottieDrawable.setCurrentFrame(0);
                        rLottieDrawable.start();
                    }
                }
                ValueAnimator valueAnimator = this.nextSelectedAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.selectedIndex == i) {
                    return;
                }
                if (this.isShapeSelected) {
                    this.isShapeSelected = false;
                    AndroidUtilities.updateImageViewImageAnimated(this.buttons[this.brushesCount + 1], R.drawable.msg_add);
                }
                this.nextSelectedIndex = i;
                this.nextSelectedIndexProgress = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.nextSelectedAnimator = duration;
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.nextSelectedAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        PaintToolsView.this.lambda$animateNextIndex$3(valueAnimator2);
                    }
                });
                this.nextSelectedAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (animator == PaintToolsView.this.nextSelectedAnimator) {
                            PaintToolsView paintToolsView = PaintToolsView.this;
                            paintToolsView.selectedIndex = paintToolsView.nextSelectedIndex;
                            PaintToolsView.this.nextSelectedIndex = -1;
                            PaintToolsView.this.nextSelectedAnimator = null;
                        }
                    }
                });
                this.nextSelectedAnimator.start();
            }
        }
    }

    public void lambda$animateNextIndex$3(ValueAnimator valueAnimator) {
        this.nextSelectedIndexProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            motionEvent.getY();
            for (int i = 1; i < getChildCount() - 1; i++) {
                final View childAt = getChildAt(i);
                if (x >= childAt.getLeft() && x <= childAt.getRight()) {
                    if (this.nextSelectedAnimator != null) {
                        if (this.nextSelectedIndex != i) {
                            animateNextIndex(i);
                            post(new Runnable() {
                                @Override
                                public final void run() {
                                    childAt.performClick();
                                }
                            });
                            return true;
                        }
                    } else if (this.selectedIndex != i) {
                        animateNextIndex(i);
                        post(new Runnable() {
                            @Override
                            public final void run() {
                                childAt.performClick();
                            }
                        });
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RLottieImageView[] rLottieImageViewArr = this.buttons;
        RLottieImageView rLottieImageView = rLottieImageViewArr[this.selectedIndex];
        int i = this.nextSelectedIndex;
        RLottieImageView rLottieImageView2 = i != -1 ? rLottieImageViewArr[i] : null;
        float f = rLottieImageView2 != null ? this.nextSelectedIndexProgress : 0.0f;
        float f2 = 1.0f;
        if (f > 0.25f && f < 0.75f) {
            f2 = (f <= 0.25f || f >= 0.5f) ? 1.0f - ((0.75f - f) / 0.25f) : (0.5f - f) / 0.25f;
        }
        float min = (Math.min((rLottieImageView.getWidth() - rLottieImageView.getPaddingLeft()) - rLottieImageView.getPaddingRight(), (rLottieImageView.getHeight() - rLottieImageView.getPaddingTop()) - rLottieImageView.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f) + (AndroidUtilities.dp(3.0f) * f2);
        float x = rLottieImageView.getX() + (rLottieImageView.getWidth() / 2.0f) + getOffsetForIndex(this.selectedIndex);
        float x2 = rLottieImageView2 != null ? rLottieImageView2.getX() + (rLottieImageView2.getWidth() / 2.0f) : 0.0f;
        int i2 = this.nextSelectedIndex;
        canvas.drawCircle(AndroidUtilities.lerp(x, x2 + (i2 != -1 ? getOffsetForIndex(i2) : 0.0f), f), rLottieImageView.getY() + (rLottieImageView.getHeight() / 2.0f), min, this.selectorPaint);
    }

    private float getOffsetForIndex(int i) {
        if (i == this.brushesCount + 1) {
            return AndroidUtilities.dp(4.0f);
        }
        return 0.0f;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    private RLottieImageView createView(boolean z, boolean z2) {
        RLottieImageView rLottieImageView = new RLottieImageView(getContext());
        rLottieImageView.setPadding(AndroidUtilities.dp(z ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(z2 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f));
        rLottieImageView.setLayoutParams(LayoutHelper.createLinear(0, 40, 1.0f));
        rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        return rLottieImageView;
    }
}

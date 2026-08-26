package org.telegram.ui.Components.Paint.Views;

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
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.ui.Business.ChatbotSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.BotButton$$ExternalSyntheticLambda0;
import org.telegram.ui.Cells.WallpaperCell$$ExternalSyntheticLambda0;
import org.telegram.ui.Charts.BaseChartView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Brush;
import org.telegram.ui.Components.Paint.PersistColorPalette;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;

public final class PaintToolsView extends LinearLayout {
    public final int brushesCount;
    public final RLottieImageView[] buttons;
    public Delegate delegate;
    public boolean isShapeSelected;
    public ValueAnimator nextSelectedAnimator;
    public int nextSelectedIndex;
    public float nextSelectedIndexProgress;
    public int selectedIndex;
    public final Paint selectorPaint;

    public interface Delegate {
        void onAddButtonPressed(View view);

        void onBrushSelected(Brush brush);

        void onColorPickerSelected();

        PersistColorPalette onGetPalette();
    }

    public PaintToolsView(Context context, boolean z) {
        super(context);
        List list = Brush.BRUSHES_LIST;
        this.buttons = new RLottieImageView[list.size() + 2];
        Paint paint = new Paint(1);
        this.selectorPaint = paint;
        this.selectedIndex = 1;
        this.nextSelectedIndex = -1;
        this.nextSelectedIndexProgress = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.brushesCount = list.size() - (!z ? 1 : 0);
        int i = 0;
        int i2 = 0;
        while (true) {
            List list2 = Brush.BRUSHES_LIST;
            if (i >= list2.size() + 2) {
                return;
            }
            RLottieImageView[] rLottieImageViewArr = this.buttons;
            boolean z2 = i == 0;
            boolean z3 = i == list2.size() + 1;
            RLottieImageView rLottieImageView = new RLottieImageView(getContext());
            rLottieImageView.setPadding(AndroidUtilities.dp(z2 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(z3 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f));
            rLottieImageView.setLayoutParams(LayoutHelper.createLinear(0, 40, 1.0f));
            rLottieImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            rLottieImageViewArr[i2] = rLottieImageView;
            if (i == 0) {
                final int i3 = 0;
                this.buttons[i2].setOnClickListener(new View.OnClickListener(this) {
                    public final PaintToolsView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                this.f$0.delegate.onColorPickerSelected();
                                break;
                            default:
                                this.f$0.delegate.onAddButtonPressed(view);
                                break;
                        }
                    }
                });
            } else if (i > 0 && i <= list2.size()) {
                Brush brush = (Brush) list2.get(i - 1);
                if (z || !(brush instanceof Brush.Blurer)) {
                    this.buttons[i2].setAnimation(brush.getIconRes(), 28, 28);
                    this.buttons[i2].setOnClickListener(new WallpaperCell$$ExternalSyntheticLambda0(this, i2, brush, 2));
                }
                i++;
            } else if (i == list2.size() + 1) {
                this.buttons[i2].setImageResource(R.drawable.msg_add);
                final int i4 = 1;
                this.buttons[i2].setOnClickListener(new View.OnClickListener(this) {
                    public final PaintToolsView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i4) {
                            case 0:
                                this.f$0.delegate.onColorPickerSelected();
                                break;
                            default:
                                this.f$0.delegate.onAddButtonPressed(view);
                                break;
                        }
                    }
                });
            }
            addView(this.buttons[i2]);
            i2++;
            i++;
        }
    }

    public final void animateNextIndex(int i) {
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
                    AndroidUtilities.updateImageViewImageAnimated(rLottieImageViewArr[this.brushesCount + 1], R.drawable.msg_add);
                }
                this.nextSelectedIndex = i;
                this.nextSelectedIndexProgress = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.nextSelectedAnimator = duration;
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.nextSelectedAnimator.addUpdateListener(new BotButton$$ExternalSyntheticLambda0(this, 12));
                this.nextSelectedAnimator.addListener(new BaseChartView.AnonymousClass4(this, 7));
                this.nextSelectedAnimator.start();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            motionEvent.getY();
            for (int i = 1; i < getChildCount() - 1; i++) {
                View childAt = getChildAt(i);
                if (x >= childAt.getLeft() && x <= childAt.getRight()) {
                    if (this.nextSelectedAnimator != null) {
                        if (this.nextSelectedIndex != i) {
                            animateNextIndex(i);
                            post(new ChatbotSheet$$ExternalSyntheticLambda0(childAt, 23));
                            return true;
                        }
                    } else if (this.selectedIndex != i) {
                        animateNextIndex(i);
                        post(new ChatbotSheet$$ExternalSyntheticLambda0(childAt, 23));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float width;
        super.onDraw(canvas);
        int i = this.selectedIndex;
        RLottieImageView[] rLottieImageViewArr = this.buttons;
        RLottieImageView rLottieImageView = rLottieImageViewArr[i];
        int i2 = this.nextSelectedIndex;
        RLottieImageView rLottieImageView2 = i2 != -1 ? rLottieImageViewArr[i2] : null;
        float fDp = 0.0f;
        float f = rLottieImageView2 != null ? this.nextSelectedIndexProgress : 0.0f;
        float fM = 1.0f;
        if (f > 0.25f && f < 0.75f) {
            fM = (f <= 0.25f || f >= 0.5f) ? ImageReceiver$$ExternalSyntheticOutline1.m(0.75f, f, 0.25f, 1.0f) : (0.5f - f) / 0.25f;
        }
        float fDp2 = (AndroidUtilities.dp(3.0f) * fM) + (Math.min((rLottieImageView.getWidth() - rLottieImageView.getPaddingLeft()) - rLottieImageView.getPaddingRight(), (rLottieImageView.getHeight() - rLottieImageView.getPaddingTop()) - rLottieImageView.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width2 = (rLottieImageView.getWidth() / 2.0f) + rLottieImageView.getX();
        int i3 = this.selectedIndex;
        int i4 = this.brushesCount;
        float fDp3 = (i3 == i4 + 1 ? AndroidUtilities.dp(4.0f) : 0.0f) + width2;
        if (rLottieImageView2 != null) {
            width = (rLottieImageView2.getWidth() / 2.0f) + rLottieImageView2.getX();
        } else {
            width = 0.0f;
        }
        int i5 = this.nextSelectedIndex;
        if (i5 != -1 && i5 == i4 + 1) {
            fDp = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(fDp3, width + fDp, f), (rLottieImageView.getHeight() / 2.0f) + rLottieImageView.getY(), fDp2, this.selectorPaint);
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void setSelectedIndex(int i) {
        this.selectedIndex = i;
        if (this.isShapeSelected) {
            this.isShapeSelected = false;
            AndroidUtilities.updateImageViewImageAnimated(this.buttons[this.brushesCount + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}

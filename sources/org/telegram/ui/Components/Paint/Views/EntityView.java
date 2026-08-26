package org.telegram.ui.Components.Paint.Views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import com.google.zxing.common.detector.MathUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme$$ExternalSyntheticLambda19;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.RectOld;

public abstract class EntityView extends FrameLayout {
    public static final List STICKY_ANGLES = Arrays.asList(-90, 0, 90, 180);
    public float angle;
    public ValueAnimator angleAnimator;
    public boolean announcedDrag;
    public boolean announcedMultitouchDrag;
    public boolean announcedSelection;
    public boolean announcedTrash;
    public final ButtonBounce bounce;
    public int currentStickyAngle;
    public final float[] cxy;
    public EntityViewDelegate delegate;
    public ValueAnimator fromStickyAngleAnimator;
    public boolean hadMultitouch;
    public boolean hasPanned;
    public boolean hasReleased;
    public boolean hasStickyAngle;
    public boolean hasTransformed;
    public boolean lastIsMultitouch;
    public FrameLayout lastSelectionContainer;
    public final EntityView$$ExternalSyntheticLambda3 longPressRunnable;
    public PointF position;
    public float previousLocationCX;
    public float previousLocationCY;
    public float previousLocationX;
    public float previousLocationX2;
    public float previousLocationY;
    public float previousLocationY2;
    public boolean recognizedLongPress;
    public float scale;
    public ValueAnimator selectAnimator;
    public float selectT;
    public boolean selecting;
    public SelectionView selectionView;
    public Theme$$ExternalSyntheticLambda19 setStickyAngleRunnable;
    public final EntityView$$ExternalSyntheticLambda3 setStickyXRunnable;
    public final EntityView$$ExternalSyntheticLambda3 setStickyYRunnable;
    public int stickyAngleRunnableValue;
    public float stickyAnimatedAngle;
    public int stickyX;
    public ValueAnimator stickyXAnimator;
    public int stickyXRunnableValue;
    public int stickyY;
    public ValueAnimator stickyYAnimator;
    public int stickyYRunnableValue;
    public ValueAnimator trashAnimator;
    public float trashScale;
    public final UUID uuid;
    public final float[] xy;
    public final float[] xy2;

    public final class AnonymousClass1 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final EntityView this$0;

        public AnonymousClass1(EntityView entityView, int i) {
            this.$r8$classId = i;
            this.this$0 = entityView;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    EntityView entityView = this.this$0;
                    if (animator == entityView.stickyXAnimator) {
                        entityView.stickyXAnimator = null;
                    }
                    break;
                case 1:
                    EntityView entityView2 = this.this$0;
                    if (animator == entityView2.stickyYAnimator) {
                        entityView2.stickyYAnimator = null;
                    }
                    break;
                case 2:
                    EntityView entityView3 = this.this$0;
                    if (animator == entityView3.angleAnimator) {
                        entityView3.angleAnimator = null;
                        entityView3.stickyAnimatedAngle = 0.0f;
                    }
                    break;
                case 3:
                    EntityView entityView4 = this.this$0;
                    if (animator == entityView4.fromStickyAngleAnimator) {
                        entityView4.fromStickyAngleAnimator = null;
                    }
                    break;
                default:
                    EntityView entityView5 = this.this$0;
                    if (!entityView5.selecting) {
                        AndroidUtilities.removeFromParent(entityView5.selectionView);
                        entityView5.selectionView = null;
                    }
                    break;
            }
        }
    }

    public interface EntityViewDelegate {
        boolean allowInteraction(EntityView entityView);

        int[] getCenterLocation(EntityView entityView);

        void getTransformedTouch(float f, float f2, float[] fArr);

        boolean isEntityDeletable();

        void onEntityDragEnd(boolean z);

        void onEntityDragMultitouchEnd();

        void onEntityDragMultitouchStart();

        void onEntityDragStart();

        void onEntityDragTrash(boolean z);

        void onEntityDraggedBottom(boolean z);

        void onEntityDraggedTop(boolean z);

        void onEntityHandleTouched();

        boolean onEntityLongClicked(EntityView entityView);

        boolean onEntitySelected(EntityView entityView);
    }

    public abstract class SelectionView extends FrameLayout {
        public int currentHandle;
        public final Paint dotPaint;
        public final Paint dotStrokePaint;
        public final Paint paint;
        public final AnimatedFloat showAlpha;
        public boolean shown;

        public SelectionView(Context context) {
            super(context);
            Paint paint = new Paint(1);
            this.paint = paint;
            Paint paint2 = new Paint(1);
            this.dotPaint = paint2;
            Paint paint3 = new Paint(1);
            this.dotStrokePaint = paint3;
            this.showAlpha = new AnimatedFloat(this, 0L, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.shown = true;
            setWillNotDraw(false);
            paint.setColor(-1);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStrokeCap(Paint.Cap.ROUND);
            paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
            paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
            paint2.setColor(-15033089);
            paint3.setColor(-1);
            paint3.setStyle(style);
            paint3.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
            paint3.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        }

        public float getShowAlpha() {
            return this.showAlpha.set(this.shown);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean zOnTouchMove;
            boolean z2;
            double dAtan2;
            EntityViewDelegate entityViewDelegate;
            int actionMasked = motionEvent.getActionMasked();
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            EntityView entityView = EntityView.this;
            EntityViewDelegate entityViewDelegate2 = entityView.delegate;
            float[] fArr = entityView.xy;
            entityViewDelegate2.getTransformedTouch(rawX, rawY, fArr);
            boolean z3 = motionEvent.getPointerCount() > 1 && this.currentHandle == 3;
            float[] fArr2 = entityView.xy2;
            if (!z3) {
                z = z3;
            } else if (Build.VERSION.SDK_INT >= 29) {
                entityView.delegate.getTransformedTouch(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
                z = z3;
            } else {
                z = false;
            }
            float[] fArr3 = entityView.cxy;
            if (z) {
                fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
            } else {
                fArr3[0] = fArr[0];
                fArr3[1] = fArr[1];
            }
            if (entityView.lastIsMultitouch != z) {
                entityView.previousLocationX = fArr[0];
                entityView.previousLocationY = fArr[1];
                entityView.previousLocationX2 = fArr2[0];
                entityView.previousLocationY2 = fArr2[1];
                entityView.previousLocationCX = fArr3[0];
                entityView.previousLocationCY = fArr3[1];
                this.shown = !z;
                invalidate();
            }
            entityView.lastIsMultitouch = z;
            float f = fArr3[0];
            float f2 = fArr3[1];
            EntityView$$ExternalSyntheticLambda3 entityView$$ExternalSyntheticLambda3 = entityView.longPressRunnable;
            if (actionMasked == 0) {
                entityView.hadMultitouch = false;
                int iPointInsideHandle = pointInsideHandle(motionEvent.getX(), motionEvent.getY());
                if (iPointInsideHandle != 0) {
                    this.currentHandle = iPointInsideHandle;
                    entityView.previousLocationX = fArr[0];
                    entityView.previousLocationY = fArr[1];
                    entityView.previousLocationCX = f;
                    entityView.previousLocationCY = f2;
                    entityView.hasReleased = false;
                    if (getParent() instanceof EntitiesContainerView) {
                        ((EntitiesContainerView) getParent()).invalidate();
                    }
                    if (iPointInsideHandle == 3 && (entityView instanceof ReactionWidgetEntityView)) {
                        AndroidUtilities.runOnUIThread(entityView$$ExternalSyntheticLambda3, ViewConfiguration.getLongPressTimeout());
                    }
                    zOnTouchMove = true;
                } else {
                    zOnTouchMove = false;
                }
            } else if (actionMasked == 1) {
                if (actionMasked == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                entityView.onTouchUp(z2);
                this.currentHandle = 0;
                this.shown = true;
                invalidate();
                zOnTouchMove = true;
            } else {
                if (actionMasked == 2) {
                    int i = this.currentHandle;
                    if (i == 3) {
                        zOnTouchMove = entityView.onTouchMove(fArr[0], fArr[1], fArr2[0], fArr2[1], z);
                    } else if (i != 0) {
                        float f3 = f - entityView.previousLocationX;
                        float f4 = f2 - entityView.previousLocationY;
                        if (entityView.hasTransformed || Math.abs(f3) > AndroidUtilities.dp(2.0f) || Math.abs(f4) > AndroidUtilities.dp(2.0f)) {
                            if (!entityView.hasTransformed && (entityViewDelegate = entityView.delegate) != null) {
                                entityViewDelegate.onEntityHandleTouched();
                            }
                            entityView.hasTransformed = true;
                            AndroidUtilities.cancelRunOnUIThread(entityView$$ExternalSyntheticLambda3);
                            int[] centerLocation = entityView.delegate.getCenterLocation(entityView);
                            float fDistance = MathUtils.distance(centerLocation[0], centerLocation[1], entityView.previousLocationX, entityView.previousLocationY);
                            float fDistance2 = MathUtils.distance(centerLocation[0], centerLocation[1], f, f2);
                            float f5 = 0.0f;
                            if (fDistance > 0.0f) {
                                entityView.scale(fDistance2 / fDistance);
                            }
                            int i2 = this.currentHandle;
                            if (i2 == 1) {
                                dAtan2 = Math.atan2(centerLocation[1] - f2, centerLocation[0] - f);
                            } else {
                                if (i2 == 2) {
                                    dAtan2 = Math.atan2(f2 - centerLocation[1], f - centerLocation[0]);
                                }
                                entityView.rotate((float) Math.toDegrees(f5));
                                entityView.previousLocationX = f;
                                entityView.previousLocationY = f2;
                            }
                            f5 = (float) dAtan2;
                            entityView.rotate((float) Math.toDegrees(f5));
                            entityView.previousLocationX = f;
                            entityView.previousLocationY = f2;
                        }
                        zOnTouchMove = true;
                    }
                } else if (actionMasked == 3) {
                    if (actionMasked == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    entityView.onTouchUp(z2);
                    this.currentHandle = 0;
                    this.shown = true;
                    invalidate();
                    zOnTouchMove = true;
                }
                zOnTouchMove = false;
            }
            entityView.hadMultitouch = z;
            return super.onTouchEvent(motionEvent) || zOnTouchMove;
        }

        public abstract int pointInsideHandle(float f, float f2);

        public final void updatePosition() {
            EntityView entityView = EntityView.this;
            RectOld selectionBounds = entityView.getSelectionBounds();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.leftMargin = (int) selectionBounds.x;
            layoutParams.topMargin = (int) selectionBounds.y;
            layoutParams.width = (int) selectionBounds.width;
            layoutParams.height = (int) selectionBounds.height;
            setLayoutParams(layoutParams);
            setRotation(entityView.getRotation());
        }
    }

    public EntityView(Context context, PointF pointF) {
        super(context);
        this.bounce = new ButtonBounce(this);
        this.hasPanned = false;
        this.hasReleased = false;
        this.hasTransformed = false;
        this.announcedDrag = false;
        this.announcedMultitouchDrag = false;
        this.announcedSelection = false;
        this.announcedTrash = false;
        this.recognizedLongPress = false;
        final int i = 0;
        this.longPressRunnable = new Runnable(this) {
            public final EntityView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        EntityView entityView = this.f$0;
                        entityView.recognizedLongPress = true;
                        if (entityView.delegate != null) {
                            try {
                                entityView.performHapticFeedback(0);
                                break;
                            } catch (Exception unused) {
                            }
                            entityView.delegate.onEntityLongClicked(entityView);
                        }
                        break;
                    case 1:
                        this.f$0.updateStickyX();
                        break;
                    default:
                        this.f$0.updateStickyY();
                        break;
                }
            }
        };
        this.hasStickyAngle = true;
        this.currentStickyAngle = 0;
        this.stickyAngleRunnableValue = -1;
        this.stickyX = 0;
        this.stickyY = 0;
        final int i2 = 1;
        this.setStickyXRunnable = new Runnable(this) {
            public final EntityView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        EntityView entityView = this.f$0;
                        entityView.recognizedLongPress = true;
                        if (entityView.delegate != null) {
                            try {
                                entityView.performHapticFeedback(0);
                                break;
                            } catch (Exception unused) {
                            }
                            entityView.delegate.onEntityLongClicked(entityView);
                        }
                        break;
                    case 1:
                        this.f$0.updateStickyX();
                        break;
                    default:
                        this.f$0.updateStickyY();
                        break;
                }
            }
        };
        final int i3 = 2;
        this.setStickyYRunnable = new Runnable(this) {
            public final EntityView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        EntityView entityView = this.f$0;
                        entityView.recognizedLongPress = true;
                        if (entityView.delegate != null) {
                            try {
                                entityView.performHapticFeedback(0);
                                break;
                            } catch (Exception unused) {
                            }
                            entityView.delegate.onEntityLongClicked(entityView);
                        }
                        break;
                    case 1:
                        this.f$0.updateStickyX();
                        break;
                    default:
                        this.f$0.updateStickyY();
                        break;
                }
            }
        };
        this.xy = new float[2];
        this.xy2 = new float[2];
        this.cxy = new float[2];
        this.scale = 1.0f;
        this.selecting = false;
        this.trashScale = 1.0f;
        this.uuid = UUID.randomUUID();
        this.position = pointF;
    }

    public abstract SelectionView createSelectionView();

    @Override
    public void dispatchDraw(Canvas canvas) {
        float scale = this.bounce.getScale(getBounceScale());
        canvas.save();
        canvas.scale(scale, scale, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            if (this instanceof RoundView) {
                float f = this.trashScale;
                canvas.scale(f, f, getWidth() / 2.0f, getHeight() / 2.0f);
            } else {
                float width = (view.getWidth() / 2.0f) - getX();
                float height = (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY();
                float f2 = this.trashScale;
                canvas.scale(f2, f2, width, height);
            }
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public float getBounceScale() {
        return 0.04f;
    }

    public float getMaxScale() {
        return 100.0f;
    }

    public float getMinScale() {
        return 0.0f;
    }

    public PointF getPosition() {
        return this.position;
    }

    public float getPositionX() {
        float measuredWidth;
        float f = this.position.x;
        if (getParent() != null) {
            View view = (View) getParent();
            int i = this.stickyX;
            if (i == 1) {
                measuredWidth = (getScaleX() * ((width() / 2.0f) - getStickyPaddingLeft())) + AndroidUtilities.dp(8.0f);
            } else if (i == 2) {
                measuredWidth = view.getMeasuredWidth() / 2.0f;
            } else if (i == 3) {
                measuredWidth = (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f)) - (getScaleX() * (getStickyPaddingRight() + (width() / 2.0f)));
            } else {
                measuredWidth = f;
            }
            ValueAnimator valueAnimator = this.stickyXAnimator;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f, measuredWidth, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (measuredWidth != 0.0f) {
                return measuredWidth;
            }
        }
        return f;
    }

    public float getPositionY() {
        float measuredHeight;
        float f = this.position.y;
        if (getParent() != null) {
            View view = (View) getParent();
            int i = this.stickyY;
            if (i == 1) {
                measuredHeight = (getScaleY() * ((height() / 2.0f) - getStickyPaddingTop())) + AndroidUtilities.dp(64.0f);
            } else if (i == 2) {
                measuredHeight = view.getMeasuredHeight() / 2.0f;
            } else if (i == 3) {
                measuredHeight = (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f)) - (getScaleY() * (getStickyPaddingBottom() + (height() / 2.0f)));
            } else {
                measuredHeight = f;
            }
            ValueAnimator valueAnimator = this.stickyYAnimator;
            if (valueAnimator != null) {
                return AndroidUtilities.lerp(f, measuredHeight, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
            if (measuredHeight != 0.0f) {
                return measuredHeight;
            }
        }
        return f;
    }

    public float getScale() {
        return getScaleX();
    }

    public RectOld getSelectionBounds() {
        return new RectOld(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public float getStickyPaddingBottom() {
        return 0.0f;
    }

    public float getStickyPaddingLeft() {
        return 0.0f;
    }

    public float getStickyPaddingRight() {
        return 0.0f;
    }

    public float getStickyPaddingTop() {
        return 0.0f;
    }

    public final int getStickyX() {
        return this.stickyX;
    }

    public final int getStickyY() {
        return this.stickyY;
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public final float height() {
        return (float) ((Math.abs(Math.sin(((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * ((double) getMeasuredWidth())) + (Math.abs(Math.cos(((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * ((double) getMeasuredHeight())));
    }

    @Override
    public final boolean isSelected() {
        return this.selecting;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.delegate.allowInteraction(this);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        EntityView entityView;
        boolean zOnTouchMove;
        if (this.delegate.allowInteraction(this)) {
            EntityViewDelegate entityViewDelegate = this.delegate;
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            float[] fArr = this.xy;
            entityViewDelegate.getTransformedTouch(rawX, rawY, fArr);
            boolean z2 = motionEvent.getPointerCount() > 1;
            float[] fArr2 = this.xy2;
            if (!z2) {
                z = z2;
            } else if (Build.VERSION.SDK_INT >= 29) {
                this.delegate.getTransformedTouch(motionEvent.getRawX(1), motionEvent.getRawY(1), fArr2);
                z = z2;
            } else {
                z = false;
            }
            float[] fArr3 = this.cxy;
            if (z) {
                fArr3[0] = (fArr[0] + fArr2[0]) / 2.0f;
                fArr3[1] = (fArr[1] + fArr2[1]) / 2.0f;
            } else {
                fArr3[0] = fArr[0];
                fArr3[1] = fArr[1];
            }
            if (this.lastIsMultitouch != z) {
                this.previousLocationX = fArr[0];
                this.previousLocationY = fArr[1];
                this.previousLocationX2 = fArr2[0];
                this.previousLocationY2 = fArr2[1];
                this.previousLocationCX = fArr3[0];
                this.previousLocationCY = fArr3[1];
                SelectionView selectionView = this.selectionView;
                if (selectionView != null) {
                    selectionView.shown = !z;
                    selectionView.invalidate();
                }
            }
            this.lastIsMultitouch = z;
            float f = fArr3[0];
            float f2 = fArr3[1];
            int actionMasked = motionEvent.getActionMasked();
            ButtonBounce buttonBounce = this.bounce;
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 2) {
                        entityView = this;
                        zOnTouchMove = entityView.onTouchMove(fArr[0], fArr[1], fArr2[0], fArr2[1], z);
                    } else if (actionMasked != 3) {
                        zOnTouchMove = false;
                        entityView = this;
                    }
                    entityView.hadMultitouch = z;
                    if (!super.onTouchEvent(motionEvent) || zOnTouchMove) {
                        return true;
                    }
                }
                entityView = this;
                onTouchUp(actionMasked == 3);
                buttonBounce.setPressed(false);
                SelectionView selectionView2 = entityView.selectionView;
                if (selectionView2 != null) {
                    selectionView2.shown = true;
                    selectionView2.invalidate();
                }
            } else {
                entityView = this;
                entityView.hadMultitouch = false;
                entityView.previousLocationX = fArr[0];
                entityView.previousLocationY = fArr[1];
                entityView.previousLocationCX = f;
                entityView.previousLocationCY = f2;
                entityView.hasReleased = false;
                if ((getParent() instanceof EntitiesContainerView) && (entityView.stickyX != 0 || entityView.stickyY != 0)) {
                    ((EntitiesContainerView) getParent()).invalidate();
                }
                buttonBounce.setPressed(true);
                EntityView$$ExternalSyntheticLambda3 entityView$$ExternalSyntheticLambda3 = entityView.longPressRunnable;
                AndroidUtilities.cancelRunOnUIThread(entityView$$ExternalSyntheticLambda3);
                if (!z) {
                    AndroidUtilities.runOnUIThread(entityView$$ExternalSyntheticLambda3, ViewConfiguration.getLongPressTimeout());
                }
            }
            zOnTouchMove = true;
            entityView.hadMultitouch = z;
            if (!super.onTouchEvent(motionEvent)) {
            }
            return true;
        }
        return false;
    }

    public final boolean onTouchMove(float f, float f2, float f3, float f4, boolean z) {
        EntityViewDelegate entityViewDelegate;
        EntityViewDelegate entityViewDelegate2;
        EntityViewDelegate entityViewDelegate3;
        EntityViewDelegate entityViewDelegate4;
        if (getParent() == null) {
            return false;
        }
        float scaleX = ((View) getParent()).getScaleX();
        float f5 = z ? (f + f3) / 2.0f : f;
        float f6 = z ? (f2 + f4) / 2.0f : f2;
        float f7 = (f5 - this.previousLocationCX) / scaleX;
        float f8 = (f6 - this.previousLocationCY) / scaleX;
        if (((float) Math.hypot(f7, f8)) <= (this.hasPanned ? 6.0f : 16.0f) && !z) {
            return false;
        }
        AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
        pan(f7, f8);
        if (z) {
            float fDistance = MathUtils.distance(f, f2, f3, f4);
            float fDistance2 = MathUtils.distance(this.previousLocationX, this.previousLocationY, this.previousLocationX2, this.previousLocationY2);
            if (fDistance2 > 0.0f) {
                scale(fDistance / fDistance2);
            }
            rotate(this.angle + ((float) Math.toDegrees(Math.atan2(f2 - f4, f - f3) - Math.atan2(this.previousLocationY - this.previousLocationY2, this.previousLocationX - this.previousLocationX2))));
        }
        this.previousLocationX = f;
        this.previousLocationY = f2;
        this.previousLocationCX = f5;
        this.previousLocationCY = f6;
        if (z) {
            this.previousLocationX2 = f3;
            this.previousLocationY2 = f4;
        }
        this.hasPanned = true;
        if ((getParent() instanceof EntitiesContainerView) && (this.stickyX != 0 || this.stickyY != 0)) {
            ((EntitiesContainerView) getParent()).invalidate();
        }
        if (!this.announcedDrag && (entityViewDelegate4 = this.delegate) != null) {
            this.announcedDrag = true;
            entityViewDelegate4.onEntityDragStart();
        }
        if (!this.announcedMultitouchDrag && z && (entityViewDelegate3 = this.delegate) != null) {
            this.announcedMultitouchDrag = true;
            entityViewDelegate3.onEntityDragMultitouchStart();
        }
        if (this.announcedMultitouchDrag && !z && (entityViewDelegate2 = this.delegate) != null) {
            this.announcedMultitouchDrag = false;
            entityViewDelegate2.onEntityDragMultitouchEnd();
        }
        if (!this.selecting && !this.announcedSelection && (entityViewDelegate = this.delegate) != null) {
            entityViewDelegate.onEntitySelected(this);
            this.announcedSelection = true;
        }
        EntityViewDelegate entityViewDelegate5 = this.delegate;
        if (entityViewDelegate5 != null) {
            entityViewDelegate5.onEntityDraggedTop(TextureRenderer$$ExternalSyntheticOutline0.m((float) getHeight(), 2.0f, scaleX, this.position.y) < ((float) AndroidUtilities.dp(66.0f)));
            this.delegate.onEntityDraggedBottom(zzir.m((float) getHeight(), 2.0f, scaleX, this.position.y) > ((float) (((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f))));
        }
        EntityViewDelegate entityViewDelegate6 = this.delegate;
        boolean z2 = (entityViewDelegate6 == null || entityViewDelegate6.isEntityDeletable()) && !z && MathUtils.distance(f5, f6, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f))) < ((float) AndroidUtilities.dp(32.0f));
        if (this.announcedTrash != z2) {
            ValueAnimator valueAnimator = this.trashAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.trashAnimator = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.trashScale, z2 ? 0.5f : 1.0f);
            this.trashAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new EntityView$$ExternalSyntheticLambda2(this, 4));
            this.trashAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.trashAnimator.setDuration(280L);
            this.trashAnimator.start();
            this.announcedTrash = z2;
            EntityViewDelegate entityViewDelegate7 = this.delegate;
            if (entityViewDelegate7 != null) {
                entityViewDelegate7.onEntityDragTrash(z2);
            }
        }
        this.bounce.setPressed(false);
        return true;
    }

    public final void onTouchUp(boolean z) {
        EntityViewDelegate entityViewDelegate;
        EntityViewDelegate entityViewDelegate2;
        if (this.announcedDrag) {
            this.delegate.onEntityDragEnd(this.announcedTrash);
            this.announcedDrag = false;
        }
        this.announcedMultitouchDrag = false;
        if (!z && !this.recognizedLongPress && !this.hasPanned && !this.hasTransformed && !this.announcedSelection && (entityViewDelegate2 = this.delegate) != null) {
            entityViewDelegate2.onEntitySelected(this);
        }
        if (this.hasPanned && (entityViewDelegate = this.delegate) != null) {
            entityViewDelegate.onEntityDraggedTop(false);
            this.delegate.onEntityDraggedBottom(false);
        }
        AndroidUtilities.cancelRunOnUIThread(this.longPressRunnable);
        this.recognizedLongPress = false;
        this.hasPanned = false;
        this.hasTransformed = false;
        this.hasReleased = true;
        this.announcedSelection = false;
        this.stickyAngleRunnableValue = this.currentStickyAngle;
        Theme$$ExternalSyntheticLambda19 theme$$ExternalSyntheticLambda19 = this.setStickyAngleRunnable;
        if (theme$$ExternalSyntheticLambda19 != null) {
            AndroidUtilities.cancelRunOnUIThread(theme$$ExternalSyntheticLambda19);
            this.setStickyAngleRunnable = null;
        }
        this.stickyXRunnableValue = this.stickyX;
        AndroidUtilities.cancelRunOnUIThread(this.setStickyXRunnable);
        this.stickyYRunnableValue = this.stickyY;
        AndroidUtilities.cancelRunOnUIThread(this.setStickyYRunnable);
        if (getParent() instanceof EntitiesContainerView) {
            ((EntitiesContainerView) getParent()).invalidate();
        }
    }

    public final void pan(float f, float f2) {
        int i;
        PointF pointF = this.position;
        pointF.x += f;
        pointF.y += f2;
        View view = (View) getParent();
        if (view != null) {
            int i2 = 3;
            if (this.lastIsMultitouch) {
                i = 0;
            } else if (Math.abs(this.position.x - (view.getMeasuredWidth() / 2.0f)) > AndroidUtilities.dp(12.0f) || this.position.y >= view.getMeasuredHeight() - AndroidUtilities.dp(112.0f)) {
                if (Math.abs((this.position.x - (getScaleX() * (getStickyPaddingLeft() + (width() / 2.0f)))) - AndroidUtilities.dp(8.0f)) <= AndroidUtilities.dp(12.0f)) {
                    i = 1;
                } else {
                    if (Math.abs(((getScaleX() * ((width() / 2.0f) - getStickyPaddingRight())) + this.position.x) - (view.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) <= AndroidUtilities.dp(12.0f)) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                }
            } else {
                i = 2;
            }
            if (this.stickyXRunnableValue != i) {
                this.stickyXRunnableValue = i;
                if (i == 0) {
                    updateStickyX();
                } else {
                    AndroidUtilities.runOnUIThread(this.setStickyXRunnable, 250L);
                }
            }
            if (this.lastIsMultitouch) {
                i2 = 0;
            } else if (Math.abs(this.position.y - (view.getMeasuredHeight() / 2.0f)) <= AndroidUtilities.dp(12.0f)) {
                i2 = 2;
            } else {
                if (Math.abs((this.position.y - (getScaleY() * (getStickyPaddingTop() + (height() / 2.0f)))) - AndroidUtilities.dp(64.0f)) <= AndroidUtilities.dp(12.0f)) {
                    i2 = 1;
                } else {
                    if (Math.abs(((getScaleY() * ((height() / 2.0f) - getStickyPaddingBottom())) + this.position.y) - (view.getMeasuredHeight() - AndroidUtilities.dp(64.0f))) > AndroidUtilities.dp(12.0f)) {
                        i2 = 0;
                    }
                }
            }
            if (this.stickyYRunnableValue != i2) {
                this.stickyYRunnableValue = i2;
                if (i2 == 0) {
                    updateStickyY();
                } else {
                    AndroidUtilities.runOnUIThread(this.setStickyYRunnable, 250L);
                }
            }
        }
        updatePosition();
    }

    public final void rotate(float f) {
        int i = 3;
        if (this.stickyX != 0) {
            this.stickyXRunnableValue = 0;
            updateStickyX();
        }
        if (this.stickyY != 0) {
            this.stickyYRunnableValue = 0;
            updateStickyY();
        }
        this.angle = f;
        boolean z = this.hasStickyAngle;
        if (!z && !this.lastIsMultitouch) {
            Iterator it = STICKY_ANGLES.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (Math.abs(iIntValue - f) < 4.0f) {
                    if (this.stickyAngleRunnableValue == iIntValue) {
                        break;
                    }
                    this.stickyAngleRunnableValue = iIntValue;
                    Theme$$ExternalSyntheticLambda19 theme$$ExternalSyntheticLambda19 = this.setStickyAngleRunnable;
                    if (theme$$ExternalSyntheticLambda19 != null) {
                        AndroidUtilities.cancelRunOnUIThread(theme$$ExternalSyntheticLambda19);
                    }
                    Theme$$ExternalSyntheticLambda19 theme$$ExternalSyntheticLambda110 = new Theme$$ExternalSyntheticLambda19(this, iIntValue, 9);
                    this.setStickyAngleRunnable = theme$$ExternalSyntheticLambda110;
                    AndroidUtilities.runOnUIThread(theme$$ExternalSyntheticLambda110, 250L);
                    break;
                }
            }
        } else if (z) {
            if (Math.abs(this.currentStickyAngle - f) >= 12.0f || this.lastIsMultitouch) {
                this.stickyAngleRunnableValue = -1;
                Theme$$ExternalSyntheticLambda19 theme$$ExternalSyntheticLambda111 = this.setStickyAngleRunnable;
                if (theme$$ExternalSyntheticLambda111 != null) {
                    AndroidUtilities.cancelRunOnUIThread(theme$$ExternalSyntheticLambda111);
                    this.setStickyAngleRunnable = null;
                }
                ValueAnimator valueAnimator = this.angleAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = this.fromStickyAngleAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                this.fromStickyAngleAnimator = duration;
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.fromStickyAngleAnimator.addUpdateListener(new EntityView$$ExternalSyntheticLambda2(this, i));
                this.fromStickyAngleAnimator.addListener(new AnonymousClass1(this, i));
                this.fromStickyAngleAnimator.start();
                this.hasStickyAngle = false;
            } else {
                f = this.angleAnimator != null ? this.stickyAnimatedAngle : this.currentStickyAngle;
            }
        }
        ValueAnimator valueAnimator3 = this.fromStickyAngleAnimator;
        if (valueAnimator3 != null) {
            f = AndroidUtilities.lerpAngle(0.0f, f, valueAnimator3.getAnimatedFraction());
        }
        setRotation(f);
        if (this.stickyX != 0 || this.stickyY != 0) {
            updatePosition();
        }
        SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
    }

    public final void runStickyXAnimator(float... fArr) {
        ValueAnimator valueAnimator = this.stickyXAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.stickyXAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.stickyXAnimator.addUpdateListener(new EntityView$$ExternalSyntheticLambda2(this, 5));
        this.stickyXAnimator.addListener(new AnonymousClass1(this, 0));
        this.stickyXAnimator.start();
    }

    public final void runStickyYAnimator(float... fArr) {
        ValueAnimator valueAnimator = this.stickyYAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.stickyYAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        int i = 1;
        this.stickyYAnimator.addUpdateListener(new EntityView$$ExternalSyntheticLambda2(this, i));
        this.stickyYAnimator.addListener(new AnonymousClass1(this, i));
        this.stickyYAnimator.start();
    }

    public final void scale(float f) {
        float f2 = this.scale;
        float f3 = f * f2;
        this.scale = f3;
        float fClamp = Utilities.clamp(Math.max(f3, 0.1f), getMaxScale(), getMinScale());
        if (!(this instanceof ReactionWidgetEntityView)) {
            if ((fClamp >= getMaxScale() || fClamp <= getMinScale()) != (f2 >= getMaxScale() || f2 <= getMinScale())) {
                try {
                    performHapticFeedback(3, 1);
                } catch (Exception unused) {
                }
            }
        }
        setScaleX(fClamp);
        setScaleY(fClamp);
    }

    public void setDelegate(EntityViewDelegate entityViewDelegate) {
        this.delegate = entityViewDelegate;
    }

    public void setIsVideo(boolean z) {
    }

    public void setPosition(PointF pointF) {
        this.position = pointF;
        updatePosition();
    }

    public void setScale(float f) {
        this.scale = f;
        setScaleX(f);
        setScaleY(f);
    }

    public void setSelectionVisibility(boolean z) {
        SelectionView selectionView = this.selectionView;
        if (selectionView == null) {
            return;
        }
        selectionView.setVisibility(z ? 0 : 8);
    }

    public void setStickyX(int i) {
        this.stickyXRunnableValue = i;
        this.stickyX = i;
    }

    public void setStickyY(int i) {
        this.stickyYRunnableValue = i;
        this.stickyY = i;
    }

    public void updatePosition() {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        setX(getPositionX() - measuredWidth);
        setY(getPositionY() - measuredHeight);
        SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
    }

    public final void updateSelect(ViewGroup viewGroup, boolean z) {
        int i = 0;
        if (this.selecting != z) {
            this.selecting = z;
            ValueAnimator valueAnimator = this.selectAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.selectAnimator = null;
            }
            if (this.selectionView == null) {
                if (!z && viewGroup == null) {
                    return;
                }
                SelectionView selectionViewCreateSelectionView = createSelectionView();
                this.selectionView = selectionViewCreateSelectionView;
                selectionViewCreateSelectionView.shown = !this.lastIsMultitouch;
                selectionViewCreateSelectionView.invalidate();
                viewGroup.addView(this.selectionView);
                this.selectT = 0.0f;
            }
            this.selectionView.updatePosition();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.selectT, z ? 1.0f : 0.0f);
            this.selectAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new EntityView$$ExternalSyntheticLambda2(this, i));
            this.selectAnimator.addListener(new AnonymousClass1(this, 4));
            this.selectAnimator.setDuration(280L);
            this.selectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.selectAnimator.start();
        }
    }

    public final void updateStickyX() {
        AndroidUtilities.cancelRunOnUIThread(this.setStickyXRunnable);
        int i = this.stickyX;
        int i2 = this.stickyXRunnableValue;
        if (i == i2) {
            return;
        }
        this.stickyX = i2;
        if (getParent() instanceof EntitiesContainerView) {
            ((EntitiesContainerView) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.stickyXAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.stickyXRunnableValue == 0) {
            runStickyXAnimator(1.0f, 0.0f);
        } else {
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            runStickyXAnimator(0.0f, 1.0f);
        }
    }

    public final void updateStickyY() {
        AndroidUtilities.cancelRunOnUIThread(this.setStickyYRunnable);
        int i = this.stickyY;
        int i2 = this.stickyYRunnableValue;
        if (i == i2) {
            return;
        }
        this.stickyY = i2;
        if (getParent() instanceof EntitiesContainerView) {
            ((EntitiesContainerView) getParent()).invalidate();
        }
        ValueAnimator valueAnimator = this.stickyYAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.stickyYRunnableValue == 0) {
            runStickyYAnimator(1.0f, 0.0f);
        } else {
            try {
                performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            runStickyYAnimator(0.0f, 1.0f);
        }
    }

    public final float width() {
        return (float) ((Math.abs(Math.sin(((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * ((double) getMeasuredHeight())) + (Math.abs(Math.cos(((double) (getRotation() / 180.0f)) * 3.141592653589793d)) * ((double) getMeasuredWidth())));
    }
}

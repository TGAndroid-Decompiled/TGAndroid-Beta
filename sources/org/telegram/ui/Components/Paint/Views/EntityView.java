package org.telegram.ui.Components.Paint.Views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.zxing.common.detector.MathUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.Point;
import org.telegram.ui.Components.Rect;
public class EntityView extends FrameLayout {
    private static final List<Integer> STICKY_ANGLES = Arrays.asList(-90, 0, 90, 180);
    private ValueAnimator angleAnimator;
    private boolean announcedDrag;
    private boolean announcedSelection;
    private boolean announcedTrash;
    private ButtonBounce bounce;
    private int currentStickyAngle;
    private EntityViewDelegate delegate;
    private ValueAnimator fromStickyAngleAnimator;
    private float fromStickyAnimatedAngle;
    private float fromStickyToAngle;
    private float fromStickyX;
    private float fromStickyY;
    private GestureDetector gestureDetector;
    private boolean hasFromStickyXAnimation;
    private boolean hasFromStickyYAnimation;
    private boolean hasPanned;
    private boolean hasReleased;
    private boolean hasStickyAngle;
    private boolean hasStickyX;
    private boolean hasStickyY;
    private boolean hasTransformed;
    private Point position;
    private float previousLocationX;
    private float previousLocationY;
    private boolean recognizedLongPress;
    private ValueAnimator selectAnimator;
    private float selectT;
    private boolean selecting;
    protected SelectionView selectionView;
    private float stickyAnimatedAngle;
    private ValueAnimator stickyXAnimator;
    private ValueAnimator stickyYAnimator;
    private ValueAnimator trashAnimator;
    private float trashScale;
    private UUID uuid;

    public interface EntityViewDelegate {

        public final class CC {
            public static void $default$onEntityDragEnd(EntityViewDelegate entityViewDelegate, boolean z) {
            }

            public static void $default$onEntityDragStart(EntityViewDelegate entityViewDelegate) {
            }

            public static void $default$onEntityDragTrash(EntityViewDelegate entityViewDelegate, boolean z) {
            }

            public static void $default$onEntityDraggedBottom(EntityViewDelegate entityViewDelegate, boolean z) {
            }

            public static void $default$onEntityDraggedTop(EntityViewDelegate entityViewDelegate, boolean z) {
            }
        }

        boolean allowInteraction(EntityView entityView);

        int[] getCenterLocation(EntityView entityView);

        float getCropRotation();

        float[] getTransformedTouch(MotionEvent motionEvent, float f, float f2);

        void onEntityDragEnd(boolean z);

        void onEntityDragStart();

        void onEntityDragTrash(boolean z);

        void onEntityDraggedBottom(boolean z);

        void onEntityDraggedTop(boolean z);

        boolean onEntityLongClicked(EntityView entityView);

        boolean onEntitySelected(EntityView entityView);
    }

    protected SelectionView createSelectionView() {
        return null;
    }

    public EntityView(Context context, Point point) {
        super(context);
        this.bounce = new ButtonBounce(this);
        this.hasPanned = false;
        this.hasReleased = false;
        this.hasTransformed = false;
        this.announcedDrag = false;
        this.announcedSelection = false;
        this.announcedTrash = false;
        this.recognizedLongPress = false;
        this.hasStickyAngle = true;
        this.currentStickyAngle = 0;
        this.selecting = false;
        this.trashScale = 1.0f;
        this.uuid = UUID.randomUUID();
        this.position = point;
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public void onLongPress(MotionEvent motionEvent) {
                if (EntityView.this.hasPanned || EntityView.this.hasTransformed || EntityView.this.hasReleased) {
                    return;
                }
                EntityView.this.recognizedLongPress = true;
                if (EntityView.this.delegate != null) {
                    EntityView.this.performHapticFeedback(0);
                    EntityView.this.delegate.onEntityLongClicked(EntityView.this);
                }
            }
        });
    }

    public UUID getUUID() {
        return this.uuid;
    }

    public Point getPosition() {
        return this.position;
    }

    public void setPosition(Point point) {
        this.position = point;
        updatePosition();
    }

    public float getScale() {
        return getScaleX();
    }

    public void setScale(float f) {
        setScaleX(f);
        setScaleY(f);
    }

    public void setDelegate(EntityViewDelegate entityViewDelegate) {
        this.delegate = entityViewDelegate;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.delegate.allowInteraction(this);
    }

    public boolean onTouchMove(float f, float f2) {
        EntityViewDelegate entityViewDelegate;
        EntityViewDelegate entityViewDelegate2;
        if (getParent() == null) {
            return false;
        }
        float scaleX = ((View) getParent()).getScaleX();
        float f3 = (f - this.previousLocationX) / scaleX;
        float f4 = (f2 - this.previousLocationY) / scaleX;
        if (((float) Math.hypot(f3, f4)) > (this.hasPanned ? 6.0f : 16.0f)) {
            pan(f3, f4);
            this.previousLocationX = f;
            this.previousLocationY = f2;
            this.hasPanned = true;
            if ((getParent() instanceof EntitiesContainerView) && (this.hasStickyX || this.hasStickyY)) {
                ((EntitiesContainerView) getParent()).invalidate();
            }
            if (!this.announcedDrag && (entityViewDelegate2 = this.delegate) != null) {
                this.announcedDrag = true;
                entityViewDelegate2.onEntityDragStart();
            }
            if (!isSelected() && !this.announcedSelection && (entityViewDelegate = this.delegate) != null) {
                entityViewDelegate.onEntitySelected(this);
                this.announcedSelection = true;
            }
            EntityViewDelegate entityViewDelegate3 = this.delegate;
            if (entityViewDelegate3 != null) {
                entityViewDelegate3.onEntityDraggedTop(this.position.y - ((((float) getHeight()) / 2.0f) * scaleX) < ((float) AndroidUtilities.dp(66.0f)));
                this.delegate.onEntityDraggedBottom(this.position.y + ((((float) getHeight()) / 2.0f) * scaleX) > ((float) (((View) getParent()).getHeight() - AndroidUtilities.dp(114.0f))));
            }
            updateTrash(MathUtils.distance(f, f2, ((float) ((View) getParent()).getWidth()) / 2.0f, (float) (((View) getParent()).getHeight() - AndroidUtilities.dp(76.0f))) < ((float) AndroidUtilities.dp(32.0f)));
            this.bounce.setPressed(false);
            return true;
        }
        return false;
    }

    public void onTouchUp() {
        EntityViewDelegate entityViewDelegate;
        EntityViewDelegate entityViewDelegate2;
        if (this.announcedDrag) {
            this.delegate.onEntityDragEnd(this.announcedTrash);
            this.announcedDrag = false;
        }
        if (!this.recognizedLongPress && !this.hasPanned && !this.hasTransformed && !this.announcedSelection && (entityViewDelegate2 = this.delegate) != null) {
            entityViewDelegate2.onEntitySelected(this);
        }
        if (this.hasPanned && (entityViewDelegate = this.delegate) != null) {
            entityViewDelegate.onEntityDraggedTop(false);
            this.delegate.onEntityDraggedBottom(false);
        }
        this.recognizedLongPress = false;
        this.hasPanned = false;
        this.hasTransformed = false;
        this.hasReleased = true;
        this.announcedSelection = false;
        if (getParent() instanceof EntitiesContainerView) {
            ((EntitiesContainerView) getParent()).invalidate();
        }
    }

    public final boolean hasTouchDown() {
        return !this.hasReleased;
    }

    public void setHasStickyX(boolean z) {
        this.hasStickyX = z;
    }

    public final boolean hasStickyX() {
        return this.hasStickyX;
    }

    public void setHasStickyY(boolean z) {
        this.hasStickyY = z;
    }

    public final boolean hasStickyY() {
        return this.hasStickyY;
    }

    public boolean hasPanned() {
        return this.hasPanned;
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Paint.Views.EntityView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void runStickyXAnimator(float... fArr) {
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.stickyXAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.stickyXAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                EntityView.this.lambda$runStickyXAnimator$0(valueAnimator);
            }
        });
        this.stickyXAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator == EntityView.this.stickyXAnimator) {
                    EntityView.this.stickyXAnimator = null;
                    EntityView.this.hasFromStickyXAnimation = false;
                }
            }
        });
        this.stickyXAnimator.start();
    }

    public void lambda$runStickyXAnimator$0(ValueAnimator valueAnimator) {
        updatePosition();
    }

    private void runStickyYAnimator(float... fArr) {
        ValueAnimator duration = ValueAnimator.ofFloat(fArr).setDuration(150L);
        this.stickyYAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.stickyYAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                EntityView.this.lambda$runStickyYAnimator$1(valueAnimator);
            }
        });
        this.stickyYAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator == EntityView.this.stickyYAnimator) {
                    EntityView.this.stickyYAnimator = null;
                    EntityView.this.hasFromStickyYAnimation = false;
                }
            }
        });
        this.stickyYAnimator.start();
    }

    public void lambda$runStickyYAnimator$1(ValueAnimator valueAnimator) {
        updatePosition();
    }

    public void pan(float f, float f2) {
        Point point = this.position;
        float f3 = point.x + f;
        point.x = f3;
        float f4 = point.y + f2;
        point.y = f4;
        if (this.hasFromStickyXAnimation) {
            this.fromStickyX = f3;
        }
        if (this.hasFromStickyYAnimation) {
            this.fromStickyY = f4;
        }
        View view = (View) getParent();
        if (view != null) {
            if (!this.hasStickyX) {
                if (Math.abs(this.position.x - (view.getMeasuredWidth() / 2.0f)) <= AndroidUtilities.dp(6.0f) && this.position.y < view.getMeasuredHeight() - AndroidUtilities.dp(176.0f)) {
                    this.hasStickyX = true;
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (getParent() instanceof EntitiesContainerView) {
                        ((EntitiesContainerView) getParent()).invalidate();
                    }
                    ValueAnimator valueAnimator = this.stickyXAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    this.fromStickyX = this.position.x;
                    this.hasFromStickyXAnimation = false;
                    runStickyXAnimator(0.0f, 1.0f);
                }
            } else if (Math.abs(this.position.x - (view.getMeasuredWidth() / 2.0f)) > AndroidUtilities.dp(16.0f) || this.position.y >= view.getMeasuredHeight() - AndroidUtilities.dp(176.0f)) {
                this.hasStickyX = false;
                if (getParent() instanceof EntitiesContainerView) {
                    ((EntitiesContainerView) getParent()).invalidate();
                }
                ValueAnimator valueAnimator2 = this.stickyXAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.hasFromStickyXAnimation = true;
                runStickyXAnimator(1.0f, 0.0f);
            }
            if (!this.hasStickyY) {
                if (Math.abs(this.position.y - (view.getMeasuredHeight() / 2.0f)) <= AndroidUtilities.dp(6.0f)) {
                    this.hasStickyY = true;
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused2) {
                    }
                    if (getParent() instanceof EntitiesContainerView) {
                        ((EntitiesContainerView) getParent()).invalidate();
                    }
                    ValueAnimator valueAnimator3 = this.stickyYAnimator;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    this.fromStickyY = this.position.y;
                    this.hasFromStickyYAnimation = false;
                    runStickyYAnimator(0.0f, 1.0f);
                }
            } else if (Math.abs(this.position.y - (view.getMeasuredHeight() / 2.0f)) > AndroidUtilities.dp(16.0f)) {
                this.hasStickyY = false;
                if (getParent() instanceof EntitiesContainerView) {
                    ((EntitiesContainerView) getParent()).invalidate();
                }
                ValueAnimator valueAnimator4 = this.stickyYAnimator;
                if (valueAnimator4 != null) {
                    valueAnimator4.cancel();
                }
                this.hasFromStickyYAnimation = true;
                runStickyYAnimator(1.0f, 0.0f);
            }
        }
        updatePosition();
    }

    public float getPositionX() {
        float f = this.position.x;
        if (getParent() != null) {
            View view = (View) getParent();
            if (this.stickyXAnimator != null) {
                return AndroidUtilities.lerp(this.fromStickyX, view.getMeasuredWidth() / 2.0f, ((Float) this.stickyXAnimator.getAnimatedValue()).floatValue());
            }
            return this.hasStickyX ? view.getMeasuredWidth() / 2.0f : f;
        }
        return f;
    }

    public float getPositionY() {
        float f = this.position.y;
        if (getParent() != null) {
            View view = (View) getParent();
            if (this.stickyYAnimator != null) {
                return AndroidUtilities.lerp(this.fromStickyY, view.getMeasuredHeight() / 2.0f, ((Float) this.stickyYAnimator.getAnimatedValue()).floatValue());
            }
            return this.hasStickyY ? view.getMeasuredHeight() / 2.0f : f;
        }
        return f;
    }

    public void updatePosition() {
        setX(getPositionX() - (getMeasuredWidth() / 2.0f));
        setY(getPositionY() - (getMeasuredHeight() / 2.0f));
        updateSelectionView();
    }

    public void scale(float f) {
        setScale(Math.max(getScale() * f, 0.1f));
        updateSelectionView();
    }

    public void rotate(final float f) {
        if (!this.hasStickyAngle) {
            Iterator<Integer> it = STICKY_ANGLES.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int intValue = it.next().intValue();
                if (Math.abs(intValue - f) < 5.0f) {
                    this.currentStickyAngle = intValue;
                    this.hasStickyAngle = true;
                    try {
                        performHapticFeedback(3, 2);
                    } catch (Exception unused) {
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
                    this.angleAnimator = duration;
                    duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    this.angleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            EntityView.this.lambda$rotate$2(f, valueAnimator3);
                        }
                    });
                    this.angleAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (animator == EntityView.this.angleAnimator) {
                                EntityView.this.angleAnimator = null;
                                EntityView.this.stickyAnimatedAngle = 0.0f;
                            }
                        }
                    });
                    this.angleAnimator.start();
                }
            }
        } else if (Math.abs(this.currentStickyAngle - f) >= 15.0f) {
            ValueAnimator valueAnimator3 = this.angleAnimator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            ValueAnimator valueAnimator4 = this.fromStickyAngleAnimator;
            if (valueAnimator4 != null) {
                valueAnimator4.cancel();
            }
            this.fromStickyAnimatedAngle = this.currentStickyAngle;
            this.fromStickyToAngle = f;
            ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
            this.fromStickyAngleAnimator = duration2;
            duration2.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.fromStickyAngleAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator5) {
                    EntityView.this.lambda$rotate$3(valueAnimator5);
                }
            });
            this.fromStickyAngleAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator == EntityView.this.fromStickyAngleAnimator) {
                        EntityView.this.fromStickyAngleAnimator = null;
                    }
                }
            });
            this.fromStickyAngleAnimator.start();
            this.hasStickyAngle = false;
        } else if (this.angleAnimator != null) {
            f = this.stickyAnimatedAngle;
        } else {
            f = this.currentStickyAngle;
        }
        ValueAnimator valueAnimator5 = this.fromStickyAngleAnimator;
        if (valueAnimator5 != null) {
            this.fromStickyToAngle = f;
            f = AndroidUtilities.lerpAngle(this.fromStickyAnimatedAngle, f, valueAnimator5.getAnimatedFraction());
        }
        rotateInternal(f);
    }

    public void lambda$rotate$2(float f, ValueAnimator valueAnimator) {
        float lerpAngle = AndroidUtilities.lerpAngle(f, this.currentStickyAngle, valueAnimator.getAnimatedFraction());
        this.stickyAnimatedAngle = lerpAngle;
        rotateInternal(lerpAngle);
    }

    public void lambda$rotate$3(ValueAnimator valueAnimator) {
        rotateInternal(AndroidUtilities.lerpAngle(this.fromStickyAnimatedAngle, this.fromStickyToAngle, this.fromStickyAngleAnimator.getAnimatedFraction()));
    }

    private void rotateInternal(float f) {
        setRotation(f);
        updateSelectionView();
    }

    protected Rect getSelectionBounds() {
        return new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override
    public boolean isSelected() {
        return this.selecting;
    }

    public void updateSelectionView() {
        SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.updatePosition();
        }
    }

    private void updateSelect(ViewGroup viewGroup, boolean z) {
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
                SelectionView createSelectionView = createSelectionView();
                this.selectionView = createSelectionView;
                viewGroup.addView(createSelectionView);
                this.selectT = 0.0f;
            }
            this.selectionView.updatePosition();
            float[] fArr = new float[2];
            fArr[0] = this.selectT;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.selectAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    EntityView.this.lambda$updateSelect$4(valueAnimator2);
                }
            });
            this.selectAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (EntityView.this.selecting) {
                        return;
                    }
                    AndroidUtilities.removeFromParent(EntityView.this.selectionView);
                    EntityView.this.selectionView = null;
                }
            });
            this.selectAnimator.setDuration(280L);
            this.selectAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.selectAnimator.start();
        }
    }

    public void lambda$updateSelect$4(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.selectT = floatValue;
        SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, floatValue) * Utilities.clamp(this.trashScale * 1.25f, 1.0f, 0.0f));
            this.selectionView.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, this.selectT) * Utilities.clamp(this.trashScale * 1.25f, 1.0f, 0.0f));
            this.selectionView.setAlpha(this.selectT * Math.max(0.0f, this.trashScale - 0.8f) * 5.0f);
        }
    }

    public void select(ViewGroup viewGroup) {
        updateSelect(viewGroup, true);
    }

    public void deselect() {
        updateSelect(null, false);
    }

    public void setSelectionVisibility(boolean z) {
        SelectionView selectionView = this.selectionView;
        if (selectionView == null) {
            return;
        }
        selectionView.setVisibility(z ? 0 : 8);
    }

    public class SelectionView extends FrameLayout {
        private int currentHandle;
        protected Paint dotPaint;
        protected Paint dotStrokePaint;
        protected Paint paint;

        protected int pointInsideHandle(float f, float f2) {
            throw null;
        }

        public SelectionView(Context context) {
            super(context);
            this.paint = new Paint(1);
            this.dotPaint = new Paint(1);
            this.dotStrokePaint = new Paint(1);
            setWillNotDraw(false);
            this.paint.setColor(-1);
            this.paint.setStyle(Paint.Style.STROKE);
            this.paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            this.paint.setStrokeCap(Paint.Cap.ROUND);
            this.paint.setPathEffect(new DashPathEffect(new float[]{AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)}, 0.5f));
            this.paint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
            this.dotPaint.setColor(-15033089);
            this.dotStrokePaint.setColor(-1);
            this.dotStrokePaint.setStyle(Paint.Style.STROKE);
            this.dotStrokePaint.setStrokeWidth(AndroidUtilities.dpf2(2.66f));
            this.dotStrokePaint.setShadowLayer(AndroidUtilities.dpf2(0.75f), 0.0f, 0.0f, 1342177280);
        }

        protected void updatePosition() {
            Rect selectionBounds = EntityView.this.getSelectionBounds();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.leftMargin = (int) selectionBounds.x;
            layoutParams.topMargin = (int) selectionBounds.y;
            layoutParams.width = (int) selectionBounds.width;
            layoutParams.height = (int) selectionBounds.height;
            setLayoutParams(layoutParams);
            setRotation(EntityView.this.getRotation());
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.Paint.Views.EntityView.SelectionView.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    private void updateTrash(boolean z) {
        if (this.announcedTrash != z) {
            ValueAnimator valueAnimator = this.trashAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.trashAnimator = null;
            }
            float[] fArr = new float[2];
            fArr[0] = this.trashScale;
            fArr[1] = z ? 0.5f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.trashAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    EntityView.this.lambda$updateTrash$5(valueAnimator2);
                }
            });
            this.trashAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.trashAnimator.setDuration(280L);
            this.trashAnimator.start();
            this.announcedTrash = z;
            EntityViewDelegate entityViewDelegate = this.delegate;
            if (entityViewDelegate != null) {
                entityViewDelegate.onEntityDragTrash(z);
            }
        }
    }

    public void lambda$updateTrash$5(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.trashScale = floatValue;
        setAlpha(floatValue);
        SelectionView selectionView = this.selectionView;
        if (selectionView != null) {
            selectionView.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, this.selectT) * Utilities.clamp(this.trashScale * 1.25f, 1.0f, 0.0f));
            this.selectionView.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, this.selectT) * Utilities.clamp(this.trashScale * 1.25f, 1.0f, 0.0f));
            this.selectionView.setAlpha(this.selectT * Math.max(0.0f, this.trashScale - 0.8f) * 5.0f);
        }
        invalidate();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float scale = this.bounce.getScale(0.05f);
        canvas.save();
        canvas.scale(scale, scale, getWidth() / 2.0f, getHeight() / 2.0f);
        if (getParent() instanceof View) {
            View view = (View) getParent();
            float f = this.trashScale;
            canvas.scale(f, f, (view.getWidth() / 2.0f) - getX(), (view.getHeight() - AndroidUtilities.dp(76.0f)) - getY());
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }
}

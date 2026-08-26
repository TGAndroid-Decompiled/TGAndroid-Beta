package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.ui.BubbleActivity;

public class PhotoFilterBlurControl extends FrameLayout {
    private static final float BlurMinimumDifference = 0.02f;
    private static final float BlurMinimumFalloff = 0.1f;
    private final int GestureStateBegan;
    private final int GestureStateCancelled;
    private final int GestureStateChanged;
    private final int GestureStateEnded;
    private final int GestureStateFailed;
    private BlurViewActiveControl activeControl;
    private Size actualAreaSize;
    private float angle;
    private Paint arcPaint;
    private RectF arcRect;
    private PointF centerPoint;
    private boolean checkForMoving;
    private boolean checkForZooming;
    private PhotoFilterLinearBlurControlDelegate delegate;
    private float falloff;
    private boolean inBubbleMode;
    private boolean isMoving;
    private boolean isZooming;
    private Paint paint;
    private float pointerScale;
    private float pointerStartX;
    private float pointerStartY;
    private float size;
    private PointF startCenterPoint;
    private float startDistance;
    private float startPointerDistance;
    private float startRadius;
    private int type;
    private static final float BlurInsetProximity = AndroidUtilities.dp(20.0f);
    private static final float BlurViewCenterInset = AndroidUtilities.dp(30.0f);
    private static final float BlurViewRadiusInset = AndroidUtilities.dp(30.0f);

    public enum BlurViewActiveControl {
        BlurViewActiveControlNone,
        BlurViewActiveControlCenter,
        BlurViewActiveControlInnerRadius,
        BlurViewActiveControlOuterRadius,
        BlurViewActiveControlWholeArea,
        BlurViewActiveControlRotation
    }

    public interface PhotoFilterLinearBlurControlDelegate {
        void valueChanged(PointF pointF, float f, float f2, float f3);
    }

    public PhotoFilterBlurControl(Context context) {
        super(context);
        this.GestureStateBegan = 1;
        this.GestureStateChanged = 2;
        this.GestureStateEnded = 3;
        this.GestureStateCancelled = 4;
        this.GestureStateFailed = 5;
        this.startCenterPoint = new PointF();
        this.actualAreaSize = new Size();
        this.centerPoint = new PointF(0.5f, 0.5f);
        this.falloff = 0.15f;
        this.size = 0.35f;
        this.arcRect = new RectF();
        this.pointerScale = 1.0f;
        this.checkForMoving = true;
        this.paint = new Paint(1);
        this.arcPaint = new Paint(1);
        setWillNotDraw(false);
        this.paint.setColor(-1);
        this.arcPaint.setColor(-1);
        this.arcPaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.arcPaint.setStyle(Paint.Style.STROKE);
        this.inBubbleMode = context instanceof BubbleActivity;
    }

    private float degreesToRadians(float f) {
        return (f * 3.1415927f) / 180.0f;
    }

    private PointF getActualCenterPoint() {
        float width = getWidth();
        float f = this.actualAreaSize.width;
        float f2 = (this.centerPoint.x * f) + ((width - f) / 2.0f);
        int i = !this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
        float height = getHeight();
        Size size = this.actualAreaSize;
        float f3 = size.height;
        float fM = ImageReceiver$$ExternalSyntheticOutline0.m(height, f3, 2.0f, i);
        float f4 = size.width;
        return new PointF(f2, (this.centerPoint.y * f4) + ImageReceiver$$ExternalSyntheticOutline1.m(f4, f3, 2.0f, fM));
    }

    private float getActualInnerRadius() {
        Size size = this.actualAreaSize;
        return Math.min(size.width, size.height) * this.falloff;
    }

    private float getActualOuterRadius() {
        Size size = this.actualAreaSize;
        return Math.min(size.width, size.height) * this.size;
    }

    private float getDistance(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 2) {
            return 0.0f;
        }
        float x = motionEvent.getX(0);
        float y = motionEvent.getY(0);
        float x2 = x - motionEvent.getX(1);
        float y2 = y - motionEvent.getY(1);
        return (float) Math.sqrt((y2 * y2) + (x2 * x2));
    }

    private void handlePan(int i, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f = x - actualCenterPoint.x;
        float f2 = y - actualCenterPoint.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        Size size = this.actualAreaSize;
        float fMin = Math.min(size.width, size.height);
        float f3 = this.falloff * fMin;
        float f4 = this.size * fMin;
        float fAbs = (float) Math.abs((Math.sin(((double) degreesToRadians(this.angle)) + 1.5707963267948966d) * ((double) f2)) + (Math.cos(((double) degreesToRadians(this.angle)) + 1.5707963267948966d) * ((double) f)));
        if (i == 1) {
            this.pointerStartX = motionEvent.getX();
            this.pointerStartY = motionEvent.getY();
            boolean z = Math.abs(f4 - f3) < BlurInsetProximity;
            float f5 = z ? 0.0f : BlurViewRadiusInset;
            float f6 = z ? 0.0f : BlurViewRadiusInset;
            int i2 = this.type;
            if (i2 == 0) {
                if (fSqrt < BlurViewCenterInset) {
                    this.activeControl = BlurViewActiveControl.BlurViewActiveControlCenter;
                    this.startCenterPoint = actualCenterPoint;
                } else {
                    float f7 = BlurViewRadiusInset;
                    float f8 = f3 - f7;
                    if (fAbs > f8 && fAbs < f5 + f3) {
                        this.activeControl = BlurViewActiveControl.BlurViewActiveControlInnerRadius;
                        this.startDistance = fAbs;
                        this.startRadius = f3;
                    } else if (fAbs > f4 - f6 && fAbs < f4 + f7) {
                        this.activeControl = BlurViewActiveControl.BlurViewActiveControlOuterRadius;
                        this.startDistance = fAbs;
                        this.startRadius = f4;
                    } else if (fAbs <= f8 || fAbs >= f4 + f7) {
                        this.activeControl = BlurViewActiveControl.BlurViewActiveControlRotation;
                    }
                }
            } else if (i2 == 1) {
                if (fSqrt < BlurViewCenterInset) {
                    this.activeControl = BlurViewActiveControl.BlurViewActiveControlCenter;
                    this.startCenterPoint = actualCenterPoint;
                } else {
                    float f9 = BlurViewRadiusInset;
                    if (fSqrt > f3 - f9 && fSqrt < f5 + f3) {
                        this.activeControl = BlurViewActiveControl.BlurViewActiveControlInnerRadius;
                        this.startDistance = fSqrt;
                        this.startRadius = f3;
                    } else if (fSqrt > f4 - f6 && fSqrt < f9 + f4) {
                        this.activeControl = BlurViewActiveControl.BlurViewActiveControlOuterRadius;
                        this.startDistance = fSqrt;
                        this.startRadius = f4;
                    }
                }
            }
            setSelected(true, true);
            return;
        }
        if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                this.activeControl = BlurViewActiveControl.BlurViewActiveControlNone;
                setSelected(false, true);
                return;
            }
            return;
        }
        int i3 = this.type;
        if (i3 == 0) {
            int iOrdinal = this.activeControl.ordinal();
            if (iOrdinal == 1) {
                float f10 = x - this.pointerStartX;
                float f11 = y - this.pointerStartY;
                float width = (getWidth() - this.actualAreaSize.width) / 2.0f;
                int i4 = !this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
                float height = getHeight();
                Size size2 = this.actualAreaSize;
                float f12 = size2.height;
                RectOld rectOld = new RectOld(width, ImageReceiver$$ExternalSyntheticOutline0.m(height, f12, 2.0f, i4), size2.width, f12);
                float f13 = rectOld.x;
                float fMax = Math.max(f13, Math.min(rectOld.width + f13, this.startCenterPoint.x + f10));
                float f14 = rectOld.y;
                PointF pointF = new PointF(fMax, Math.max(f14, Math.min(rectOld.height + f14, this.startCenterPoint.y + f11)));
                float f15 = pointF.x - rectOld.x;
                Size size3 = this.actualAreaSize;
                float f16 = size3.width;
                this.centerPoint = new PointF(f15 / f16, (((f16 - size3.height) / 2.0f) + (pointF.y - rectOld.y)) / f16);
            } else if (iOrdinal == 2) {
                this.falloff = Math.min(Math.max(0.1f, (this.startRadius + (fAbs - this.startDistance)) / fMin), this.size - 0.02f);
            } else if (iOrdinal == 3) {
                this.size = Math.max(this.falloff + 0.02f, (this.startRadius + (fAbs - this.startDistance)) / fMin);
            } else if (iOrdinal == 5) {
                float f17 = x - this.pointerStartX;
                float f18 = y - this.pointerStartY;
                boolean z2 = x > actualCenterPoint.x;
                boolean z3 = y > actualCenterPoint.y;
                boolean z4 = Math.abs(f18) > Math.abs(f17);
                this.angle = (((((float) Math.sqrt((f18 * f18) + (f17 * f17))) * ((((z2 || z3 ? !z2 || z3 ? !(z2 && z3) ? !(!z4 ? f17 < 0.0f : f18 < 0.0f) : !(!z4 ? f17 < 0.0f : f18 > 0.0f) : !z4 ? f17 > 0.0f : f18 > 0.0f : !z4 ? f17 > 0.0f : f18 < 0.0f) ? 0 : 1) * 2) - 1)) / 3.1415927f) / 1.15f) + this.angle;
                this.pointerStartX = x;
                this.pointerStartY = y;
            }
        } else if (i3 == 1) {
            int iOrdinal2 = this.activeControl.ordinal();
            if (iOrdinal2 == 1) {
                float f19 = x - this.pointerStartX;
                float f20 = y - this.pointerStartY;
                float width2 = (getWidth() - this.actualAreaSize.width) / 2.0f;
                int i5 = !this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
                float height2 = getHeight();
                Size size4 = this.actualAreaSize;
                float f21 = size4.height;
                RectOld rectOld2 = new RectOld(width2, ImageReceiver$$ExternalSyntheticOutline0.m(height2, f21, 2.0f, i5), size4.width, f21);
                float f22 = rectOld2.x;
                float fMax2 = Math.max(f22, Math.min(rectOld2.width + f22, this.startCenterPoint.x + f19));
                float f23 = rectOld2.y;
                PointF pointF2 = new PointF(fMax2, Math.max(f23, Math.min(rectOld2.height + f23, this.startCenterPoint.y + f20)));
                float f24 = pointF2.x - rectOld2.x;
                Size size5 = this.actualAreaSize;
                float f25 = size5.width;
                this.centerPoint = new PointF(f24 / f25, (((f25 - size5.height) / 2.0f) + (pointF2.y - rectOld2.y)) / f25);
            } else if (iOrdinal2 == 2) {
                this.falloff = Math.min(Math.max(0.1f, (this.startRadius + (fSqrt - this.startDistance)) / fMin), this.size - 0.02f);
            } else if (iOrdinal2 == 3) {
                this.size = Math.max(this.falloff + 0.02f, (this.startRadius + (fSqrt - this.startDistance)) / fMin);
            }
        }
        invalidate();
        PhotoFilterLinearBlurControlDelegate photoFilterLinearBlurControlDelegate = this.delegate;
        if (photoFilterLinearBlurControlDelegate != null) {
            photoFilterLinearBlurControlDelegate.valueChanged(this.centerPoint, this.falloff, this.size, degreesToRadians(this.angle) + 1.5707964f);
        }
    }

    private void handlePinch(int i, MotionEvent motionEvent) {
        if (i == 1) {
            this.startPointerDistance = getDistance(motionEvent);
            this.pointerScale = 1.0f;
            this.activeControl = BlurViewActiveControl.BlurViewActiveControlWholeArea;
            setSelected(true, true);
        } else if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                this.activeControl = BlurViewActiveControl.BlurViewActiveControlNone;
                setSelected(false, true);
                return;
            }
            return;
        }
        float distance = getDistance(motionEvent);
        float fM = zzir.m(distance - this.startPointerDistance, AndroidUtilities.density, 0.01f, this.pointerScale);
        this.pointerScale = fM;
        float fMax = Math.max(0.1f, this.falloff * fM);
        this.falloff = fMax;
        this.size = Math.max(fMax + 0.02f, this.size * this.pointerScale);
        this.pointerScale = 1.0f;
        this.startPointerDistance = distance;
        invalidate();
        PhotoFilterLinearBlurControlDelegate photoFilterLinearBlurControlDelegate = this.delegate;
        if (photoFilterLinearBlurControlDelegate != null) {
            photoFilterLinearBlurControlDelegate.valueChanged(this.centerPoint, this.falloff, this.size, degreesToRadians(this.angle) + 1.5707964f);
        }
    }

    private void setSelected(boolean z, boolean z2) {
    }

    @Override
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i = this.type;
        int i2 = 0;
        if (i == 0) {
            canvas2.rotate(this.angle);
            float fDp = AndroidUtilities.dp(6.0f);
            float fDp2 = AndroidUtilities.dp(12.0f);
            float fDp3 = AndroidUtilities.dp(1.5f);
            for (int i3 = 0; i3 < 30; i3++) {
                float f = fDp2 + fDp;
                float f2 = i3 * f;
                float f3 = -actualInnerRadius;
                float f4 = f2 + fDp2;
                float f5 = fDp3 - actualInnerRadius;
                canvas2.drawRect(f2, f3, f4, f5, this.paint);
                float f6 = ((-i3) * f) - fDp;
                float f7 = f6 - fDp2;
                canvas2 = canvas;
                canvas2.drawRect(f7, f3, f6, f5, this.paint);
                float f8 = fDp3 + actualInnerRadius;
                canvas2.drawRect(f2, actualInnerRadius, f4, f8, this.paint);
                canvas2.drawRect(f7, actualInnerRadius, f6, f8, this.paint);
            }
            float fDp4 = AndroidUtilities.dp(6.0f);
            while (i2 < 64) {
                float f9 = fDp4 + fDp;
                float f10 = i2 * f9;
                float f11 = -actualOuterRadius;
                float f12 = fDp4 + f10;
                float f13 = fDp3 - actualOuterRadius;
                canvas.drawRect(f10, f11, f12, f13, this.paint);
                float f14 = ((-i2) * f9) - fDp;
                float f15 = f14 - fDp4;
                canvas.drawRect(f15, f11, f14, f13, this.paint);
                float f16 = fDp3 + actualOuterRadius;
                canvas.drawRect(f10, actualOuterRadius, f12, f16, this.paint);
                canvas.drawRect(f15, actualOuterRadius, f14, f16, this.paint);
                i2++;
            }
        } else if (i == 1) {
            float f17 = -actualInnerRadius;
            this.arcRect.set(f17, f17, actualInnerRadius, actualInnerRadius);
            for (int i4 = 0; i4 < 22; i4++) {
                canvas.drawArc(this.arcRect, 16.35f * i4, 10.2f, false, this.arcPaint);
            }
            float f18 = -actualOuterRadius;
            this.arcRect.set(f18, f18, actualOuterRadius, actualOuterRadius);
            while (i2 < 64) {
                canvas.drawArc(this.arcRect, 5.62f * i2, 3.6f, false, this.arcPaint);
                i2++;
            }
        }
        canvas.drawCircle(0.0f, 0.0f, AndroidUtilities.dp(8.0f), this.paint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PointF pointF;
        float fSqrt;
        float actualInnerRadius;
        float actualOuterRadius;
        boolean z;
        float f;
        float f2;
        int i;
        boolean z2;
        float f3;
        boolean z3;
        ?? r5;
        float fAbs;
        float f4;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            if (motionEvent.getPointerCount() == 1) {
                if (this.isMoving) {
                    handlePan(3, motionEvent);
                    this.checkForMoving = true;
                    this.isMoving = false;
                }
                if (motionEvent.getPointerCount() != 2) {
                    handlePinch(3, motionEvent);
                    this.checkForZooming = true;
                    this.isZooming = false;
                    return true;
                }
                if (!this.checkForZooming && !this.isZooming) {
                    handlePinch(1, motionEvent);
                    this.isZooming = true;
                    return true;
                }
            }
            if (this.checkForMoving && !this.isMoving) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                PointF actualCenterPoint = getActualCenterPoint();
                pointF = new PointF(x - actualCenterPoint.x, y - actualCenterPoint.y);
                float f5 = pointF.x;
                float f6 = pointF.y;
                fSqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
                actualInnerRadius = getActualInnerRadius();
                actualOuterRadius = getActualOuterRadius();
                if (Math.abs(actualOuterRadius - actualInnerRadius) < BlurInsetProximity) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    f = 0.0f;
                } else {
                    f = BlurViewRadiusInset;
                }
                f2 = z ? 0.0f : BlurViewRadiusInset;
                i = this.type;
                if (i == 0) {
                    fAbs = (float) Math.abs((Math.sin(((double) degreesToRadians(this.angle)) + 1.5707963267948966d) * ((double) pointF.y)) + (Math.cos(((double) degreesToRadians(this.angle)) + 1.5707963267948966d) * ((double) pointF.x)));
                    if (fSqrt < BlurViewCenterInset) {
                        this.isMoving = true;
                    } else {
                        float f7 = BlurViewRadiusInset;
                        f4 = actualInnerRadius - f7;
                        if (fAbs <= f4 && fAbs < actualInnerRadius + f) {
                            this.isMoving = true;
                        } else {
                            if (fAbs > actualOuterRadius - f2 || fAbs >= actualOuterRadius + f7) {
                                if (fAbs > f4 || fAbs >= actualOuterRadius + f7) {
                                    z2 = true;
                                    this.isMoving = true;
                                }
                                this.checkForMoving = z3;
                                if (!this.isMoving) {
                                    return r5;
                                }
                                handlePan(r5, motionEvent);
                                return r5;
                            }
                            this.isMoving = true;
                        }
                    }
                    z3 = false;
                    r5 = 1;
                    this.checkForMoving = z3;
                    if (!this.isMoving) {
                        return r5;
                    }
                    handlePan(r5, motionEvent);
                    return r5;
                }
                z2 = true;
                z2 = true;
                z2 = true;
                z2 = true;
                z2 = true;
                z2 = true;
                if (i == 1) {
                    if (fSqrt < BlurViewCenterInset) {
                        this.isMoving = true;
                    } else {
                        f3 = BlurViewRadiusInset;
                        if (fSqrt <= actualInnerRadius - f3 && fSqrt < actualInnerRadius + f) {
                            this.isMoving = true;
                        } else if (fSqrt > actualOuterRadius - f2 && fSqrt < actualOuterRadius + f3) {
                            this.isMoving = true;
                        }
                    }
                }
                z3 = false;
                r5 = z2;
                this.checkForMoving = z3;
                if (!this.isMoving) {
                    return r5;
                }
                handlePan(r5, motionEvent);
                return r5;
            }
        } else if (actionMasked == 1) {
            if (this.isMoving) {
                handlePan(3, motionEvent);
                this.isMoving = false;
            } else if (this.isZooming) {
                handlePinch(3, motionEvent);
                this.isZooming = false;
            }
            this.checkForMoving = true;
            this.checkForZooming = true;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.isMoving) {
                    handlePan(3, motionEvent);
                    this.isMoving = false;
                } else if (this.isZooming) {
                    handlePinch(3, motionEvent);
                    this.isZooming = false;
                }
                this.checkForMoving = true;
                this.checkForZooming = true;
            } else if (actionMasked != 5) {
                if (actionMasked == 6) {
                    if (this.isMoving) {
                        handlePan(3, motionEvent);
                        this.isMoving = false;
                    } else if (this.isZooming) {
                        handlePinch(3, motionEvent);
                        this.isZooming = false;
                    }
                    this.checkForMoving = true;
                    this.checkForZooming = true;
                }
            } else {
                if (motionEvent.getPointerCount() == 1) {
                    if (this.isMoving) {
                        handlePan(3, motionEvent);
                        this.checkForMoving = true;
                        this.isMoving = false;
                    }
                    if (motionEvent.getPointerCount() != 2) {
                        return !this.checkForZooming ? true : true;
                    }
                    handlePinch(3, motionEvent);
                    this.checkForZooming = true;
                    this.isZooming = false;
                    return true;
                }
                if (this.checkForMoving) {
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    PointF actualCenterPoint2 = getActualCenterPoint();
                    pointF = new PointF(x2 - actualCenterPoint2.x, y2 - actualCenterPoint2.y);
                    float f8 = pointF.x;
                    float f9 = pointF.y;
                    fSqrt = (float) Math.sqrt((f9 * f9) + (f8 * f8));
                    actualInnerRadius = getActualInnerRadius();
                    actualOuterRadius = getActualOuterRadius();
                    if (Math.abs(actualOuterRadius - actualInnerRadius) < BlurInsetProximity) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        f = 0.0f;
                    } else {
                        f = BlurViewRadiusInset;
                    }
                    if (z) {
                    }
                    i = this.type;
                    if (i == 0) {
                        fAbs = (float) Math.abs((Math.sin(((double) degreesToRadians(this.angle)) + 1.5707963267948966d) * ((double) pointF.y)) + (Math.cos(((double) degreesToRadians(this.angle)) + 1.5707963267948966d) * ((double) pointF.x)));
                        if (fSqrt < BlurViewCenterInset) {
                            this.isMoving = true;
                        } else {
                            float f10 = BlurViewRadiusInset;
                            f4 = actualInnerRadius - f10;
                            if (fAbs <= f4) {
                                if (fAbs > actualOuterRadius - f2) {
                                    if (fAbs > f4) {
                                    }
                                    z2 = true;
                                    this.isMoving = true;
                                } else {
                                    if (fAbs > f4) {
                                    }
                                    z2 = true;
                                    this.isMoving = true;
                                }
                            } else if (fAbs > actualOuterRadius - f2) {
                                if (fAbs > f4) {
                                }
                                z2 = true;
                                this.isMoving = true;
                            } else {
                                if (fAbs > f4) {
                                }
                                z2 = true;
                                this.isMoving = true;
                            }
                        }
                        z3 = false;
                        r5 = 1;
                        this.checkForMoving = z3;
                        if (!this.isMoving) {
                            return r5;
                        }
                        handlePan(r5, motionEvent);
                        return r5;
                    }
                    z2 = true;
                    z2 = true;
                    z2 = true;
                    z2 = true;
                    z2 = true;
                    z2 = true;
                    if (i == 1) {
                        if (fSqrt < BlurViewCenterInset) {
                            this.isMoving = true;
                        } else {
                            f3 = BlurViewRadiusInset;
                            if (fSqrt <= actualInnerRadius - f3) {
                                if (fSqrt > actualOuterRadius - f2) {
                                    this.isMoving = true;
                                }
                            } else if (fSqrt > actualOuterRadius - f2) {
                                this.isMoving = true;
                            }
                        }
                    }
                    z3 = false;
                    r5 = z2;
                    this.checkForMoving = z3;
                    if (!this.isMoving) {
                        return r5;
                    }
                    handlePan(r5, motionEvent);
                    return r5;
                }
            }
        } else if (this.isMoving) {
            handlePan(2, motionEvent);
        } else if (this.isZooming) {
            handlePinch(2, motionEvent);
        }
        return true;
    }

    public void setActualAreaSize(float f, float f2) {
        Size size = this.actualAreaSize;
        size.width = f;
        size.height = f2;
    }

    public void setDelegate(PhotoFilterLinearBlurControlDelegate photoFilterLinearBlurControlDelegate) {
        this.delegate = photoFilterLinearBlurControlDelegate;
    }

    public void setType(int i) {
        this.type = i;
        invalidate();
    }
}

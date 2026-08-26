package org.telegram.ui.Components;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.util.Log;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda2;
import org.telegram.ui.iv.RichDetailsCell;

public final class CanvasButton {
    public static final int[] pressedState = {16842910, 16842919};
    public boolean buttonPressed;
    public Runnable delegate;
    public CornerPath drawingPath;
    public final ArrayList drawingRects = new ArrayList();
    public boolean longPressEnabled;
    public Runnable longPressRunnable;
    public final BubbleActivity.AnonymousClass1 longPressRunnableInner;
    public final Paint maskPaint;
    public final Paint paint;
    public final View parent;
    public boolean pathCreated;
    public final CornerPathEffect pathEffect;
    public boolean rounded;
    public final BaseCell.RippleDrawableSafe selectorDrawable;
    public int usingRectCount;

    public CanvasButton(View view) {
        Paint paint = new Paint(1);
        this.paint = paint;
        this.longPressRunnableInner = new BubbleActivity.AnonymousClass1(this, 12);
        float fDp = AndroidUtilities.dp(12.0f);
        this.parent = view;
        CornerPathEffect cornerPathEffect = new CornerPathEffect(fDp);
        this.pathEffect = cornerPathEffect;
        paint.setPathEffect(cornerPathEffect);
        Paint paint2 = new Paint(1);
        this.maskPaint = paint2;
        paint2.setFilterBitmap(true);
        paint2.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(12.0f)));
        paint2.setColor(-1);
        Paint paint3 = new Paint(1);
        paint3.setFilterBitmap(true);
        paint3.setColor(-1);
        BaseCell.RippleDrawableSafe rippleDrawableSafe = new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{Theme.getColor(null, Theme.key_listSelector, false) & 436207615}), null, new AnonymousClass2(this, paint3));
        this.selectorDrawable = rippleDrawableSafe;
        rippleDrawableSafe.setCallback(view);
    }

    public final void addRect(RectF rectF) {
        int i = this.usingRectCount + 1;
        this.usingRectCount = i;
        ArrayList arrayList = this.drawingRects;
        if (i > arrayList.size()) {
            arrayList.add(new RectF());
        }
        ((RectF) arrayList.get(this.usingRectCount - 1)).set(rectF);
    }

    public final boolean checkTouchEvent(MotionEvent motionEvent) {
        Runnable runnable;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int action = motionEvent.getAction();
        View view = this.parent;
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.longPressRunnableInner;
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (action == 0) {
            for (int i = 0; i < this.usingRectCount; i++) {
                float f = x;
                float f2 = y;
                if (((RectF) this.drawingRects.get(i)).contains(f, f2)) {
                    this.buttonPressed = true;
                    if (rippleDrawableSafe != null) {
                        rippleDrawableSafe.setHotspot(f, f2);
                        rippleDrawableSafe.setState(pressedState);
                    }
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                    if (this.longPressEnabled) {
                        AndroidUtilities.runOnUIThread(anonymousClass1, ViewConfiguration.getLongPressTimeout());
                    }
                    view.invalidate();
                    return true;
                }
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.buttonPressed) {
                if (motionEvent.getAction() == 1 && (runnable = this.delegate) != null) {
                    runnable.run();
                }
                view.playSoundEffect(0);
                if (rippleDrawableSafe != null) {
                    rippleDrawableSafe.setState(StateSet.NOTHING);
                }
                this.buttonPressed = false;
                view.invalidate();
            }
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
        } else if (motionEvent.getAction() == 2 && this.buttonPressed && rippleDrawableSafe != null) {
            rippleDrawableSafe.setHotspot(x, y);
        }
        return this.buttonPressed;
    }

    public final void drawInternal(Canvas canvas, Paint paint) {
        int i = this.usingRectCount;
        CornerPathEffect cornerPathEffect = this.pathEffect;
        ArrayList arrayList = this.drawingRects;
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        int i2 = 0;
        if (i <= 1) {
            if (i == 1) {
                if (rippleDrawableSafe != null) {
                    rippleDrawableSafe.setBounds((int) ((RectF) arrayList.get(0)).left, (int) ((RectF) arrayList.get(0)).top, (int) ((RectF) arrayList.get(0)).right, (int) ((RectF) arrayList.get(0)).bottom);
                }
                if (!this.rounded) {
                    paint.setPathEffect(cornerPathEffect);
                    canvas.drawRoundRect((RectF) arrayList.get(0), 0.0f, 0.0f, paint);
                    return;
                } else {
                    paint.setPathEffect(null);
                    float fMin = Math.min(((RectF) arrayList.get(0)).width(), ((RectF) arrayList.get(0)).height()) / 2.0f;
                    canvas.drawRoundRect((RectF) arrayList.get(0), fMin, fMin, paint);
                    return;
                }
            }
            return;
        }
        if (!this.pathCreated) {
            CornerPath cornerPath = this.drawingPath;
            if (cornerPath == null) {
                this.drawingPath = new CornerPath(0);
            } else {
                cornerPath.rewind();
            }
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
                    float f = ((RectF) arrayList.get(i2)).right;
                    float f2 = ((RectF) arrayList.get(i8)).right;
                    if (Math.abs(f - f2) < AndroidUtilities.dp(4.0f)) {
                        RectF rectF = (RectF) arrayList.get(i8);
                        RectF rectF2 = (RectF) arrayList.get(i2);
                        float fMax = Math.max(f, f2);
                        rectF2.right = fMax;
                        rectF.right = fMax;
                    }
                }
                if (i2 == 0 || ((RectF) arrayList.get(i2)).bottom > i3) {
                    i3 = (int) ((RectF) arrayList.get(i2)).bottom;
                }
                if (i2 == 0 || ((RectF) arrayList.get(i2)).right > i4) {
                    i4 = (int) ((RectF) arrayList.get(i2)).right;
                }
                if (i2 == 0 || ((RectF) arrayList.get(i2)).left < i5) {
                    i5 = (int) ((RectF) arrayList.get(i2)).left;
                }
                if (i2 == 0 || ((RectF) arrayList.get(i2)).top < i6) {
                    i6 = (int) ((RectF) arrayList.get(i2)).top;
                }
                this.drawingPath.addRect((RectF) arrayList.get(i2), Path.Direction.CCW);
                if (rippleDrawableSafe != null) {
                    rippleDrawableSafe.setBounds(i5, i6, i4, i3);
                }
                i2 = i8;
            }
            this.drawingPath.closeRects();
            this.pathCreated = true;
        }
        paint.setPathEffect(cornerPathEffect);
        CornerPath cornerPath2 = this.drawingPath;
        if (cornerPath2 != null) {
            canvas.drawPath(cornerPath2, paint);
        }
    }

    public final void rewind() {
        this.pathCreated = false;
        this.usingRectCount = 0;
    }

    public final void setColor(int i) {
        this.paint.setColor(i);
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.selectorDrawable;
        if (rippleDrawableSafe != null) {
            Theme.setSelectorDrawableColor(rippleDrawableSafe, i, true);
        }
    }

    public final void setDelegate(DialogCell$$ExternalSyntheticLambda2 dialogCell$$ExternalSyntheticLambda2) {
        this.delegate = dialogCell$$ExternalSyntheticLambda2;
    }

    public final void setLongPress(DialogCell$$ExternalSyntheticLambda2 dialogCell$$ExternalSyntheticLambda2) {
        this.longPressEnabled = true;
        this.longPressRunnable = dialogCell$$ExternalSyntheticLambda2;
    }

    public final class AnonymousClass2 extends Drawable {
        public final int $r8$classId;
        public final Object this$0;
        public final Object val$maskPaint2;

        public AnonymousClass2() {
            this.$r8$classId = 4;
            RichDetailsCell.AnonymousClass1 anonymousClass1 = new RichDetailsCell.AnonymousClass1(this, 9);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
            this.this$0 = animatedTextDrawable;
            animatedTextDrawable.setCallback(anonymousClass1);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            animatedTextDrawable.moveAmplitude = 0.3f;
            animatedTextDrawable.animateDuration = 165L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextDrawable.gravity = 1;
            Typeface typefaceBold = AndroidUtilities.bold();
            TextPaint textPaint = animatedTextDrawable.textPaint;
            textPaint.setTypeface(typefaceBold);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(10.0f));
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.6f));
            Paint paint = new Paint(1);
            this.val$maskPaint2 = paint;
            paint.setStyle(Paint.Style.STROKE);
        }

        public static String formatNumber(float f) {
            Math.abs(f - 0.25f);
            float fRound = Math.round(f * 10.0f) / 10.0f;
            long j = (long) fRound;
            if (fRound == j) {
                return Log.m(j, "");
            }
            return "" + fRound;
        }

        @Override
        public final void draw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    CanvasButton canvasButton = (CanvasButton) this.this$0;
                    if (canvasButton.usingRectCount <= 1) {
                        canvasButton.drawInternal(canvas, (Paint) this.val$maskPaint2);
                    } else {
                        canvasButton.drawInternal(canvas, canvasButton.maskPaint);
                    }
                    break;
                case 1:
                    Bitmap bitmap = (Bitmap) this.val$maskPaint2;
                    if (!bitmap.isRecycled()) {
                        canvas.drawBitmap(bitmap, (Rect) null, (Rect) this.this$0, (Paint) null);
                        break;
                    }
                    break;
                case 2:
                    ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.this$0;
                    if (chatActivityEnterView.emojiView != null) {
                        Paint paint = (Paint) this.val$maskPaint2;
                        paint.setAlpha(Math.round(chatActivityEnterView.stickersExpansionProgress * 102.0f));
                        float width = chatActivityEnterView.getWidth();
                        float y = (chatActivityEnterView.emojiView.getY() - chatActivityEnterView.getHeight()) + Theme.chat_composeShadowDrawable.getIntrinsicHeight();
                        ChatActivityEnterView.AnonymousClass50 anonymousClass50 = chatActivityEnterView.messageEditText;
                        canvas.drawRect(0.0f, 0.0f, width, y + (anonymousClass50 == null ? 0.0f : anonymousClass50.getOffsetY()), paint);
                        break;
                    }
                    break;
                case 3:
                    canvas.drawRect(getBounds(), (Paint) this.val$maskPaint2);
                    int iDp = AndroidUtilities.dp(9.0f);
                    int iWidth = getBounds().width() / iDp;
                    int iHeight = getBounds().height() / iDp;
                    int i = getBounds().left;
                    int i2 = getBounds().top;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        Paint paint2 = (Paint) this.this$0;
                        if (i4 >= iWidth) {
                            while (i3 < iHeight) {
                                i3++;
                                float f = (iDp * i3) + i2;
                                canvas.drawLine(i, f, getBounds().width() + i, f, paint2);
                            }
                        } else {
                            int i5 = i4 + 1;
                            float f2 = (iDp * i5) + i;
                            canvas.drawLine(f2, i2, f2, getBounds().height() + i2, paint2);
                            i4 = i5;
                        }
                        break;
                    }
                    break;
                case 4:
                    Paint paint3 = (Paint) this.val$maskPaint2;
                    AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = (AnimatedTextView.AnimatedTextDrawable) this.this$0;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(AndroidUtilities.dpf2(1.6f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(((AndroidUtilities.dp(24.0f) - animatedTextDrawable.getCurrentWidth()) / 2.0f) - AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(0.2f) + ((AndroidUtilities.dp(24.0f) - animatedTextDrawable.currentHeight) / 2.0f), AndroidUtilities.dpf2(3.0f) + ((animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(24.0f)) / 2.0f), (AndroidUtilities.dp(24.0f) + animatedTextDrawable.currentHeight) / 2.0f);
                        canvas.drawRoundRect(rectF, AndroidUtilities.dpf2(3.0f), AndroidUtilities.dpf2(3.0f), paint3);
                    }
                    animatedTextDrawable.textPaint.setStrokeWidth(AndroidUtilities.dpf2(0.3f));
                    animatedTextDrawable.setBounds(0, (int) ((AndroidUtilities.dp(24.0f) - animatedTextDrawable.currentHeight) / 2.0f), AndroidUtilities.dp(24.0f), (int) ((AndroidUtilities.dp(24.0f) + animatedTextDrawable.currentHeight) / 2.0f));
                    animatedTextDrawable.draw(canvas);
                    break;
                default:
                    ImageReceiver imageReceiver = (ImageReceiver) this.val$maskPaint2;
                    imageReceiver.draw(canvas);
                    Drawable drawable = (Drawable) this.this$0;
                    int intrinsicWidth = (int) (drawable.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (drawable.getIntrinsicHeight() * 0.8f);
                    int iM = (int) ImageReceiver$$ExternalSyntheticOutline0.m(imageReceiver.getImageWidth(), intrinsicWidth, 2.0f, imageReceiver.getImageX());
                    int imageHeight = (int) ((((imageReceiver.getImageHeight() / 2.0f) - intrinsicHeight) + imageReceiver.getImageY()) - ((1.0f - CubicBezierInterpolator.EASE_OUT_BACK.getInterpolation(imageReceiver.getCurrentAlpha())) * AndroidUtilities.dp(16.0f)));
                    drawable.setAlpha((int) (imageReceiver.getAlpha() * Math.min(1.0f, imageReceiver.getCurrentAlpha() * 5.0f) * 255.0f));
                    drawable.setBounds(iM, imageHeight, intrinsicWidth + iM, intrinsicHeight + imageHeight);
                    drawable.draw(canvas);
                    break;
            }
        }

        @Override
        public int getAlpha() {
            switch (this.$r8$classId) {
                case 5:
                    return (int) (((ImageReceiver) this.val$maskPaint2).getAlpha() * 255.0f);
                default:
                    return super.getAlpha();
            }
        }

        @Override
        public int getIntrinsicHeight() {
            switch (this.$r8$classId) {
                case 3:
                    return 0;
                case 4:
                    return AndroidUtilities.dp(24.0f);
                default:
                    return super.getIntrinsicHeight();
            }
        }

        @Override
        public int getIntrinsicWidth() {
            switch (this.$r8$classId) {
                case 3:
                    return 0;
                case 4:
                    return AndroidUtilities.dp(24.0f);
                default:
                    return super.getIntrinsicWidth();
            }
        }

        @Override
        public final int getOpacity() {
            switch (this.$r8$classId) {
                case 0:
                    return -2;
                case 1:
                    return -3;
                case 2:
                    return -2;
                case 3:
                    return 0;
                case 4:
                    return -2;
                default:
                    return 0;
            }
        }

        @Override
        public void onBoundsChange(Rect rect) {
            switch (this.$r8$classId) {
                case 5:
                    ((ImageReceiver) this.val$maskPaint2).setImageCoords(AndroidUtilities.dp(2.0f) + rect.left, AndroidUtilities.dp(2.0f) + rect.top, OKLCH.m$1(2.0f, rect.left, rect.right - AndroidUtilities.dp(2.0f)), OKLCH.m$1(2.0f, rect.top, rect.bottom - AndroidUtilities.dp(2.0f)));
                    break;
                default:
                    super.onBoundsChange(rect);
                    break;
            }
        }

        @Override
        public final void setAlpha(int i) {
            switch (this.$r8$classId) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break;
                case 4:
                    ((AnimatedTextView.AnimatedTextDrawable) this.this$0).alpha = i;
                    Paint paint = (Paint) this.val$maskPaint2;
                    if (paint != null) {
                        paint.setAlpha(i);
                    }
                    break;
                default:
                    ((ImageReceiver) this.val$maskPaint2).setAlpha(i / 255.0f);
                    break;
            }
        }

        @Override
        public void setBounds(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 1:
                    super.setBounds(i, i2, i3, i4);
                    Bitmap bitmap = (Bitmap) this.val$maskPaint2;
                    if (bitmap != null && !bitmap.isRecycled()) {
                        int i5 = i3 - i;
                        int i6 = i4 - i2;
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMin = Math.min(i5 / width, i6 / height);
                        int iRound = Math.round(width * fMin);
                        int iRound2 = Math.round(height * fMin);
                        int i7 = i + ((i5 - iRound) / 2);
                        int i8 = i2 + ((i6 - iRound2) / 2);
                        ((Rect) this.this$0).set(i7, i8, iRound + i7, iRound2 + i8);
                        break;
                    }
                    break;
                default:
                    super.setBounds(i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            int i = this.$r8$classId;
        }

        public AnonymousClass2(Bitmap bitmap) {
            this.$r8$classId = 1;
            this.this$0 = new Rect();
            this.val$maskPaint2 = bitmap;
        }

        public AnonymousClass2(ImageReceiver imageReceiver, Drawable drawable) {
            this.$r8$classId = 5;
            this.val$maskPaint2 = imageReceiver;
            this.this$0 = drawable;
        }

        public AnonymousClass2(CanvasButton canvasButton, Paint paint) {
            this.$r8$classId = 0;
            this.this$0 = canvasButton;
            this.val$maskPaint2 = paint;
        }

        public AnonymousClass2(ChatActivityEnterView chatActivityEnterView) {
            this.$r8$classId = 2;
            this.this$0 = chatActivityEnterView;
            Paint paint = new Paint();
            this.val$maskPaint2 = paint;
            paint.setColor(0);
        }

        public AnonymousClass2(boolean z) {
            this.$r8$classId = 3;
            Paint paint = new Paint();
            this.val$maskPaint2 = paint;
            Paint paint2 = new Paint();
            this.this$0 = paint2;
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            if (z) {
                paint.setColor(-14865331);
                paint2.setColor(-15854042);
            } else {
                paint.setColor(-2172970);
                paint2.setColor(-3752002);
            }
        }

        private final void setAlpha$org$telegram$messenger$pip$source$PipSourcePlaceholder$PlaceholderDrawable(int i) {
        }

        private final void setAlpha$org$telegram$ui$Components$CanvasButton$2(int i) {
        }

        private final void setAlpha$org$telegram$ui$Components$ChatActivityEnterView$ScrimDrawable(int i) {
        }

        private final void setAlpha$org$telegram$ui$Components$MapPlaceholderDrawable(int i) {
        }

        private final void setColorFilter$org$telegram$messenger$pip$source$PipSourcePlaceholder$PlaceholderDrawable(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Components$CanvasButton$2(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Components$ChatActivityEnterView$ScrimDrawable(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Components$MapPlaceholderDrawable(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Components$SpeedIconDrawable(ColorFilter colorFilter) {
        }

        private final void setColorFilter$org$telegram$ui$Components$poll$attached$PollAttachedMediaLocation$2(ColorFilter colorFilter) {
        }
    }
}

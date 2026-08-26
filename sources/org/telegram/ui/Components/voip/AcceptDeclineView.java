package org.telegram.ui.Components.voip;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.widget.Button;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.RLottieDrawable;

public final class AcceptDeclineView extends View {
    public final ButtonBounce acceptBounce;
    public final FabBackgroundDrawable acceptDrawable;
    public final StaticLayout acceptLayout;
    public final Rect acceptRect;
    public final Drawable acceptVideoDrawable;
    public final RLottieDrawable acceptVoiceDrawable;
    public AnonymousClass1 accessibilityNodeProvider;
    public final ImageWithWavesView.AvatarWavesDrawable avatarWavesDrawable;
    public float bigRadius;
    public final int buttonWidth;
    public ValueAnimator callAnimator;
    public final Drawable callDrawable;
    public final Drawable cancelDrawable;
    public boolean captured;
    public final ButtonBounce declineBounce;
    public final FabBackgroundDrawable declineDrawable;
    public final StaticLayout declineLayout;
    public final Rect declineRect;
    public boolean expandBigRadius;
    public boolean expandSmallRadius;
    public ValueAnimator leftAnimator;
    public boolean leftDrag;
    public float leftOffsetX;
    public final Paint linePaint;
    public Listener listener;
    public final Paint maskPaint;
    public float maxOffset;
    public final StaticLayout retryLayout;
    public boolean retryMod;
    public ValueAnimator rightAnimator;
    public float rigthOffsetX;
    public BaseCell.RippleDrawableSafe rippleDrawable;
    public float smallRadius;
    public float startY;
    public final float touchSlop;

    public final class AnonymousClass1 extends AccessibilityNodeProvider {
        public final AccessibilityManager accessibilityManager;
        public final AcceptDeclineView hostView;
        public final Rect rect = new Rect();
        public int currentFocusedVirtualViewId = -1;
        public final int virtualViewsCount = 2;
        public final int[] coords = {0, 0};

        public AnonymousClass1(AcceptDeclineView acceptDeclineView) {
            this.hostView = acceptDeclineView;
            this.accessibilityManager = (AccessibilityManager) ContextCompat.getSystemService(acceptDeclineView.getContext(), AccessibilityManager.class);
        }

        @Override
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            StaticLayout staticLayout;
            CharSequence text;
            AcceptDeclineView acceptDeclineView = this.hostView;
            if (i == -1) {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(acceptDeclineView);
                accessibilityNodeInfoObtain.setPackageName(acceptDeclineView.getContext().getPackageName());
                for (int i2 = 0; i2 < this.virtualViewsCount; i2++) {
                    accessibilityNodeInfoObtain.addChild(acceptDeclineView, i2);
                }
                return accessibilityNodeInfoObtain;
            }
            AccessibilityNodeInfo accessibilityNodeInfoObtain2 = AccessibilityNodeInfo.obtain(acceptDeclineView, i);
            accessibilityNodeInfoObtain2.setPackageName(acceptDeclineView.getContext().getPackageName());
            int i3 = Build.VERSION.SDK_INT;
            accessibilityNodeInfoObtain2.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
            AcceptDeclineView acceptDeclineView2 = AcceptDeclineView.this;
            if (i == 0) {
                if (acceptDeclineView2.retryMod) {
                    StaticLayout staticLayout2 = acceptDeclineView2.retryLayout;
                    if (staticLayout2 != null) {
                        text = staticLayout2.getText();
                    } else {
                        text = null;
                    }
                } else {
                    StaticLayout staticLayout3 = acceptDeclineView2.acceptLayout;
                    if (staticLayout3 != null) {
                        text = staticLayout3.getText();
                    } else {
                        text = null;
                    }
                }
            } else if (i != 1 || (staticLayout = acceptDeclineView2.declineLayout) == null) {
                text = null;
            } else {
                text = staticLayout.getText();
            }
            accessibilityNodeInfoObtain2.setText(text);
            accessibilityNodeInfoObtain2.setClassName(Button.class.getName());
            if (i3 >= 24) {
                accessibilityNodeInfoObtain2.setImportantForAccessibility(true);
            }
            accessibilityNodeInfoObtain2.setVisibleToUser(true);
            accessibilityNodeInfoObtain2.setClickable(true);
            accessibilityNodeInfoObtain2.setEnabled(true);
            accessibilityNodeInfoObtain2.setParent(acceptDeclineView);
            Rect rect = this.rect;
            if (i == 0) {
                rect.set(acceptDeclineView2.acceptRect);
            } else if (i == 1) {
                rect.set(acceptDeclineView2.declineRect);
            } else {
                rect.setEmpty();
            }
            int[] iArr = this.coords;
            acceptDeclineView2.getLocationOnScreen(iArr);
            rect.offset(iArr[0], iArr[1]);
            accessibilityNodeInfoObtain2.setBoundsInScreen(rect);
            return accessibilityNodeInfoObtain2;
        }

        @Override
        public final boolean performAction(int i, int i2, Bundle bundle) {
            if (i == -1) {
                return this.hostView.performAccessibilityAction(i2, bundle);
            }
            if (i2 == 64) {
                sendAccessibilityEventForVirtualView(i);
                return false;
            }
            if (i2 != 16) {
                return false;
            }
            Listener listener = AcceptDeclineView.this.listener;
            if (listener != null) {
                if (i == 0) {
                    listener.onAccept();
                } else if (i == 1) {
                    listener.onDecline();
                }
            }
            return true;
        }

        public final void sendAccessibilityEventForVirtualView(int i) {
            View view;
            ViewParent parent;
            if (!this.accessibilityManager.isTouchExplorationEnabled() || (parent = (view = this.hostView).getParent()) == null) {
                return;
            }
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(32768);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            accessibilityEventObtain.setSource(view, i);
            parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
        }
    }

    public interface Listener {
        void onAccept();

        void onDecline();
    }

    public AcceptDeclineView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.acceptBounce = new ButtonBounce(this);
        this.declineBounce = new ButtonBounce(this);
        this.expandSmallRadius = true;
        this.expandBigRadius = true;
        this.acceptRect = new Rect();
        this.declineRect = new Rect();
        this.linePaint = new Paint(1);
        Paint paint2 = new Paint(1);
        this.maskPaint = paint2;
        ImageWithWavesView.AvatarWavesDrawable avatarWavesDrawable = new ImageWithWavesView.AvatarWavesDrawable(AndroidUtilities.dp(45.0f), AndroidUtilities.dp(50.0f), AndroidUtilities.dp(8.0f), 4);
        this.avatarWavesDrawable = avatarWavesDrawable;
        avatarWavesDrawable.muteToStatic = true;
        avatarWavesDrawable.muteToStaticProgress = 0.0f;
        avatarWavesDrawable.wavesEnter = 0.0f;
        avatarWavesDrawable.setAmplitude(0.0d);
        paint2.setColor(-16777216);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        int iDp = AndroidUtilities.dp(60.0f);
        this.buttonWidth = iDp;
        FabBackgroundDrawable fabBackgroundDrawable = new FabBackgroundDrawable();
        this.acceptDrawable = fabBackgroundDrawable;
        fabBackgroundDrawable.bgPaint.setColor(-12531895);
        fabBackgroundDrawable.invalidateSelf();
        FabBackgroundDrawable fabBackgroundDrawable2 = new FabBackgroundDrawable();
        this.declineDrawable = fabBackgroundDrawable2;
        fabBackgroundDrawable2.bgPaint.setColor(-1041108);
        fabBackgroundDrawable2.invalidateSelf();
        fabBackgroundDrawable2.setBounds(0, 0, iDp, iDp);
        fabBackgroundDrawable.setBounds(0, 0, iDp, iDp);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
        textPaint.setColor(-1);
        String string = LocaleController.getString(R.string.AcceptCall);
        String string2 = LocaleController.getString(R.string.DeclineCall);
        String string3 = LocaleController.getString(R.string.RetryCall);
        int iMeasureText = (int) textPaint.measureText(string);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.acceptLayout = new StaticLayout(string, textPaint, iMeasureText, alignment, 1.0f, 0.0f, false);
        this.declineLayout = new StaticLayout(string2, textPaint, (int) textPaint.measureText(string2), alignment, 1.0f, 0.0f, false);
        this.retryLayout = new StaticLayout(string3, textPaint, (int) textPaint.measureText(string3), alignment, 1.0f, 0.0f, false);
        this.callDrawable = context.getDrawable(R.drawable.calls_decline).mutate();
        Drawable drawableMutate = context.getDrawable(R.drawable.ic_close_white).mutate();
        this.cancelDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        int i = R.raw.call_accept;
        RLottieDrawable rLottieDrawable = new RLottieDrawable(i, Fragment$$ExternalSyntheticOutline0.m(i, ""), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(48.0f), true, null);
        this.acceptVoiceDrawable = rLottieDrawable;
        rLottieDrawable.setAutoRepeat(1);
        rLottieDrawable.setCustomEndFrame(90);
        rLottieDrawable.setMasterParent(this);
        this.acceptVideoDrawable = context.getDrawable(R.drawable.calls_video).mutate();
        paint.setColor(-1);
        paint.setAlpha(20);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(52.0f), 0, ColorUtils.setAlphaComponent(-1, 76));
        this.rippleDrawable = rippleDrawableSafeCreateSimpleSelectorCircleDrawable;
        rippleDrawableSafeCreateSimpleSelectorCircleDrawable.setCallback(this);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.rippleDrawable.setState(getDrawableState());
    }

    @Override
    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        if (this.accessibilityNodeProvider == null) {
            this.accessibilityNodeProvider = new AnonymousClass1(this);
        }
        return this.accessibilityNodeProvider;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        BaseCell.RippleDrawableSafe rippleDrawableSafe = this.rippleDrawable;
        if (rippleDrawableSafe != null) {
            rippleDrawableSafe.jumpToCurrentState();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.callAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.callAnimator = null;
            this.acceptVoiceDrawable.stop();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f;
        if (!this.retryMod) {
            if (this.expandSmallRadius) {
                float fDp = (AndroidUtilities.dp(2.0f) * 0.04f) + this.smallRadius;
                this.smallRadius = fDp;
                if (fDp > AndroidUtilities.dp(4.0f)) {
                    this.smallRadius = AndroidUtilities.dp(4.0f);
                    this.expandSmallRadius = false;
                }
            } else {
                float fDp2 = this.smallRadius - (AndroidUtilities.dp(2.0f) * 0.04f);
                this.smallRadius = fDp2;
                if (fDp2 < 0.0f) {
                    this.smallRadius = 0.0f;
                    this.expandSmallRadius = true;
                }
            }
            if (this.expandBigRadius) {
                float fDp3 = (AndroidUtilities.dp(4.0f) * 0.03f) + this.bigRadius;
                this.bigRadius = fDp3;
                if (fDp3 > AndroidUtilities.dp(10.0f)) {
                    this.bigRadius = AndroidUtilities.dp(10.0f);
                    this.expandBigRadius = false;
                }
            } else {
                float fDp4 = this.bigRadius - (AndroidUtilities.dp(5.0f) * 0.03f);
                this.bigRadius = fDp4;
                if (fDp4 < AndroidUtilities.dp(5.0f)) {
                    this.bigRadius = AndroidUtilities.dp(5.0f);
                    this.expandBigRadius = true;
                }
            }
            invalidate();
        }
        this.bigRadius = (AndroidUtilities.dp(8.0f) * 0.005f) + this.bigRadius;
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(46.0f);
        int i = this.buttonWidth;
        int iDp = AndroidUtilities.dp(40.0f);
        int measuredWidth2 = getMeasuredWidth() - AndroidUtilities.dp(46.0f);
        int iDp2 = AndroidUtilities.dp(40.0f) + i;
        Rect rect = this.declineRect;
        rect.set(measuredWidth - i, iDp, measuredWidth2, iDp2);
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(40.0f));
        canvas.save();
        float scale = this.declineBounce.getScale(0.1f);
        float f2 = i;
        float f3 = f2 / 2.0f;
        canvas.scale(scale, scale, rect.centerX(), rect.top + f3);
        canvas.translate(((this.rigthOffsetX + getMeasuredWidth()) - AndroidUtilities.dp(46.0f)) - f2, 0.0f);
        boolean z = this.retryMod;
        FabBackgroundDrawable fabBackgroundDrawable = this.declineDrawable;
        if (z) {
            f = 2.0f;
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.linePaint, 31);
            fabBackgroundDrawable.draw(canvas);
            Drawable drawable = this.cancelDrawable;
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                if (bitmapDrawable.getBitmap() != null) {
                    canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, bitmapDrawable.getBounds(), this.maskPaint);
                }
            }
            canvas.restore();
        } else {
            f = 2.0f;
            fabBackgroundDrawable.draw(canvas);
            this.callDrawable.draw(canvas);
        }
        canvas.save();
        StaticLayout staticLayout = this.declineLayout;
        canvas.translate(f3 - (staticLayout.getWidth() / f), AndroidUtilities.dp(4.0f) + i);
        staticLayout.draw(canvas);
        canvas.restore();
        if (this.leftDrag) {
            this.rippleDrawable.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i - AndroidUtilities.dp(4.0f), i - AndroidUtilities.dp(4.0f));
            this.rippleDrawable.draw(canvas);
        }
        canvas.restore();
        int iDp3 = AndroidUtilities.dp(46.0f);
        int iDp4 = AndroidUtilities.dp(40.0f);
        int iDp5 = AndroidUtilities.dp(46.0f) + i;
        int iDp6 = AndroidUtilities.dp(40.0f) + i;
        Rect rect2 = this.acceptRect;
        rect2.set(iDp3, iDp4, iDp5, iDp6);
        canvas.save();
        float scale2 = this.acceptBounce.getScale(0.1f);
        canvas.scale(scale2, scale2, rect2.centerX(), rect2.top + f3);
        canvas.translate(this.leftOffsetX + AndroidUtilities.dp(46.0f), 0.0f);
        if (!this.retryMod) {
            ImageWithWavesView.AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
            avatarWavesDrawable.update();
            float f4 = (int) f3;
            avatarWavesDrawable.draw(canvas, this, f4, f4);
        }
        this.acceptDrawable.draw(canvas);
        if (this.retryMod) {
            canvas.save();
            StaticLayout staticLayout2 = this.retryLayout;
            canvas.translate(f3 - (staticLayout2.getWidth() / f), AndroidUtilities.dp(4.0f) + i);
            staticLayout2.draw(canvas);
            canvas.restore();
        } else {
            canvas.save();
            StaticLayout staticLayout3 = this.acceptLayout;
            canvas.translate(f3 - (staticLayout3.getWidth() / f), AndroidUtilities.dp(4.0f) + i);
            staticLayout3.draw(canvas);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
        this.acceptVoiceDrawable.draw(canvas);
        canvas.restore();
        if (!this.leftDrag) {
            this.rippleDrawable.setBounds(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), i - AndroidUtilities.dp(4.0f), i - AndroidUtilities.dp(4.0f));
            this.rippleDrawable.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
        if (this.captured) {
            invalidate();
        }
    }

    @Override
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        AnonymousClass1 anonymousClass1 = this.accessibilityNodeProvider;
        if (anonymousClass1 != null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                for (int i = 0; i < anonymousClass1.virtualViewsCount; i++) {
                    AcceptDeclineView acceptDeclineView = AcceptDeclineView.this;
                    Rect rect = anonymousClass1.rect;
                    if (i == 0) {
                        rect.set(acceptDeclineView.acceptRect);
                    } else if (i == 1) {
                        rect.set(acceptDeclineView.declineRect);
                    } else {
                        rect.setEmpty();
                    }
                    if (rect.contains(x, y)) {
                        if (i != anonymousClass1.currentFocusedVirtualViewId) {
                            anonymousClass1.currentFocusedVirtualViewId = i;
                            anonymousClass1.sendAccessibilityEventForVirtualView(i);
                        }
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 10 && anonymousClass1.currentFocusedVirtualViewId != -1) {
                anonymousClass1.currentFocusedVirtualViewId = -1;
                return true;
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        int i3 = this.buttonWidth;
        this.maxOffset = measuredWidth - ((i3 / 2.0f) + AndroidUtilities.dp(46.0f));
        int iM$2 = OKLCH.m$2(28.0f, i3, 2);
        this.callDrawable.setBounds(iM$2, iM$2, AndroidUtilities.dp(28.0f) + iM$2, AndroidUtilities.dp(28.0f) + iM$2);
        this.cancelDrawable.setBounds(iM$2, iM$2, AndroidUtilities.dp(28.0f) + iM$2, AndroidUtilities.dp(28.0f) + iM$2);
        Paint paint = this.linePaint;
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setColor(-1);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.AcceptDeclineView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    public void setRetryMod(boolean z) {
        this.retryMod = z;
        FabBackgroundDrawable fabBackgroundDrawable = this.declineDrawable;
        if (z) {
            fabBackgroundDrawable.bgPaint.setColor(-1);
            fabBackgroundDrawable.invalidateSelf();
            return;
        }
        this.acceptVoiceDrawable.start();
        ImageWithWavesView.AvatarWavesDrawable avatarWavesDrawable = this.avatarWavesDrawable;
        if (!avatarWavesDrawable.showWaves) {
            invalidate();
        }
        avatarWavesDrawable.showWaves = true;
        fabBackgroundDrawable.bgPaint.setColor(-1041108);
        fabBackgroundDrawable.invalidateSelf();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 60, 0, 0, 60, 0, 0, 0, 0);
        this.callAnimator = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new AcceptDeclineView$$ExternalSyntheticLambda0(this, 2));
        this.callAnimator.setDuration(1500L);
        this.callAnimator.setRepeatMode(1);
        this.callAnimator.setRepeatCount(-1);
        this.callAnimator.start();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return this.rippleDrawable == drawable || super.verifyDrawable(drawable);
    }
}

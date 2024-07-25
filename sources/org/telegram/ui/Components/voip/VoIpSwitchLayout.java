package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.voip.VoIpSwitchLayout;
@SuppressLint({"ViewConstructor"})
public class VoIpSwitchLayout extends FrameLayout {
    public int animationDelay;
    private final VoIPBackgroundProvider backgroundProvider;
    private final TextView currentTextView;
    private final TextView newTextView;
    private Type type;
    private VoIpButtonView voIpButtonView;

    public enum Type {
        MICRO,
        CAMERA,
        VIDEO,
        BLUETOOTH,
        SPEAKER
    }

    public void setOnBtnClickedListener(VoIpButtonView.OnBtnClickedListener onBtnClickedListener) {
        this.voIpButtonView.setOnBtnClickedListener(onBtnClickedListener);
    }

    public VoIpSwitchLayout(Context context, VoIPBackgroundProvider voIPBackgroundProvider) {
        super(context);
        this.backgroundProvider = voIPBackgroundProvider;
        setWillNotDraw(true);
        VoIpButtonView voIpButtonView = new VoIpButtonView(context, voIPBackgroundProvider);
        this.voIpButtonView = voIpButtonView;
        addView(voIpButtonView, LayoutHelper.createFrame(53.5f, 53.5f, 1));
        TextView textView = new TextView(context);
        this.currentTextView = textView;
        textView.setGravity(1);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(-1);
        textView.setImportantForAccessibility(2);
        addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        TextView textView2 = new TextView(context);
        this.newTextView = textView2;
        textView2.setGravity(1);
        textView2.setTextSize(1, 11.0f);
        textView2.setTextColor(-1);
        textView2.setImportantForAccessibility(2);
        addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 0, 0.0f, 58.0f, 0.0f, 2.0f));
        textView.setVisibility(8);
        textView2.setVisibility(8);
    }

    public static class AnonymousClass4 {
        static final int[] $SwitchMap$org$telegram$ui$Components$voip$VoIpSwitchLayout$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$org$telegram$ui$Components$voip$VoIpSwitchLayout$Type = iArr;
            try {
                iArr[Type.MICRO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$voip$VoIpSwitchLayout$Type[Type.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$voip$VoIpSwitchLayout$Type[Type.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$voip$VoIpSwitchLayout$Type[Type.BLUETOOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$telegram$ui$Components$voip$VoIpSwitchLayout$Type[Type.SPEAKER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void setText(Type type, boolean z) {
        final String string;
        int i = AnonymousClass4.$SwitchMap$org$telegram$ui$Components$voip$VoIpSwitchLayout$Type[type.ordinal()];
        if (i != 1) {
            if (i == 2) {
                string = LocaleController.getString("VoipFlip", R.string.VoipFlip);
            } else if (i != 3) {
                if (i == 4) {
                    string = LocaleController.getString("VoipAudioRoutingBluetooth", R.string.VoipAudioRoutingBluetooth);
                } else {
                    string = i != 5 ? "" : LocaleController.getString("VoipSpeaker", R.string.VoipSpeaker);
                }
            } else if (z) {
                string = LocaleController.getString("VoipStartVideo", R.string.VoipStartVideo);
            } else {
                string = LocaleController.getString("VoipStopVideo", R.string.VoipStopVideo);
            }
        } else if (z) {
            string = LocaleController.getString("VoipUnmute", R.string.VoipUnmute);
        } else {
            string = LocaleController.getString("VoipMute", R.string.VoipMute);
        }
        setContentDescription(string);
        if (this.currentTextView.getVisibility() == 8 && this.newTextView.getVisibility() == 8) {
            this.currentTextView.setVisibility(0);
            this.currentTextView.setText(string);
            this.newTextView.setText(string);
        } else if (this.newTextView.getText().equals(string) && this.currentTextView.getText().equals(string)) {
        } else {
            this.currentTextView.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(4.0f)).setDuration(140L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    VoIpSwitchLayout.this.currentTextView.setText(string);
                    VoIpSwitchLayout.this.currentTextView.setTranslationY(0.0f);
                    VoIpSwitchLayout.this.currentTextView.setAlpha(1.0f);
                }
            }).start();
            this.newTextView.setText(string);
            this.newTextView.setVisibility(0);
            this.newTextView.setAlpha(0.0f);
            this.newTextView.setTranslationY(AndroidUtilities.dp(5.0f));
            this.newTextView.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    VoIpSwitchLayout.this.newTextView.setVisibility(8);
                }
            }).start();
        }
    }

    private void attachNewButton(int i, int i2, boolean z, Type type) {
        VoIpButtonView voIpButtonView = new VoIpButtonView(getContext(), this.backgroundProvider);
        if (i == R.raw.camera_flip2) {
            voIpButtonView.singleIcon = new RLottieDrawable(i, "" + i, i2, i2, true, null);
            voIpButtonView.singleIcon.setMasterParent(voIpButtonView);
        } else {
            voIpButtonView.unSelectedIcon = new RLottieDrawable(i, "" + i, i2, i2, true, null);
            voIpButtonView.selectedIcon = new RLottieDrawable(i, "" + i, i2, i2, true, null);
            voIpButtonView.selectedIcon.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
        }
        voIpButtonView.setSelectedState(z, false, type);
        voIpButtonView.setAlpha(0.0f);
        voIpButtonView.setOnBtnClickedListener(this.voIpButtonView.onBtnClickedListener);
        addView(voIpButtonView, LayoutHelper.createFrame(53.5f, 53.5f, 1));
        final VoIpButtonView voIpButtonView2 = this.voIpButtonView;
        this.voIpButtonView = voIpButtonView;
        voIpButtonView.animate().alpha(1.0f).setDuration(250L).start();
        voIpButtonView2.animate().alpha(0.0f).setDuration(250L).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                VoIpSwitchLayout.this.removeView(voIpButtonView2);
            }
        }).start();
    }

    public void setType(Type type, boolean z) {
        setType(type, z, false);
    }

    public void setType(org.telegram.ui.Components.voip.VoIpSwitchLayout.Type r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.voip.VoIpSwitchLayout.setType(org.telegram.ui.Components.voip.VoIpSwitchLayout$Type, boolean, boolean):void");
    }

    public void lambda$setType$1(final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIpSwitchLayout.this.lambda$setType$0(i);
            }
        });
    }

    public void lambda$setType$3(final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIpSwitchLayout.this.lambda$setType$2(i);
            }
        });
    }

    public void lambda$setType$0(int i) {
        VoIpButtonView voIpButtonView = this.voIpButtonView;
        int i2 = R.raw.speaker_to_bt;
        voIpButtonView.unSelectedIcon = new RLottieDrawable(i2, "" + i2, i, i, true, null);
        VoIpButtonView voIpButtonView2 = this.voIpButtonView;
        voIpButtonView2.selectedIcon = new RLottieDrawable(i2, "" + i2, i, i, true, null);
        this.voIpButtonView.selectedIcon.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public void lambda$setType$2(int i) {
        VoIpButtonView voIpButtonView = this.voIpButtonView;
        int i2 = R.raw.bt_to_speaker;
        voIpButtonView.unSelectedIcon = new RLottieDrawable(i2, "" + i2, i, i, true, null);
        VoIpButtonView voIpButtonView2 = this.voIpButtonView;
        voIpButtonView2.selectedIcon = new RLottieDrawable(i2, "" + i2, i, i, true, null);
        this.voIpButtonView.selectedIcon.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public static class VoIpButtonView extends View {
        private ValueAnimator animator;
        private final VoIPBackgroundProvider backgroundProvider;
        private final Path clipPath;
        private final Paint darkPaint;
        private boolean isSelectedState;
        private final Paint maskPaint;
        private final int maxRadius;
        private OnBtnClickedListener onBtnClickedListener;
        private float pressedScale;
        private ValueAnimator pressedScaleAnimator;
        private RLottieDrawable selectedIcon;
        private int selectedRadius;
        private RLottieDrawable singleIcon;
        private int singleIconBackgroundAlphaPercent;
        private float startX;
        private float startY;
        private RLottieDrawable unSelectedIcon;
        private int unselectedRadius;
        private final Paint whiteCirclePaint;

        public interface OnBtnClickedListener {
            void onClicked(View view);
        }

        public void setSelectedState(boolean z, boolean z2, Type type) {
            ValueAnimator ofInt;
            if (z2) {
                if (this.singleIcon != null) {
                    ValueAnimator valueAnimator = this.animator;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        this.animator.cancel();
                    }
                    int[] iArr = {100, 20};
                    if (z) {
                        
                        iArr[0] = 20;
                        iArr[1] = 100;
                        ofInt = ValueAnimator.ofInt(iArr);
                    } else {
                        ofInt = ValueAnimator.ofInt(iArr);
                    }
                    this.animator = ofInt;
                    ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            VoIpSwitchLayout.VoIpButtonView.this.lambda$setSelectedState$0(valueAnimator2);
                        }
                    });
                    this.animator.setDuration(200L);
                    this.animator.start();
                    if (type == Type.CAMERA) {
                        this.singleIcon.setCurrentFrame(0, false);
                        this.singleIcon.start();
                    }
                } else {
                    ValueAnimator valueAnimator2 = this.animator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.removeAllUpdateListeners();
                        this.animator.cancel();
                    }
                    ValueAnimator ofInt2 = ValueAnimator.ofInt(0, this.maxRadius);
                    this.animator = ofInt2;
                    if (z) {
                        this.unselectedRadius = this.maxRadius;
                        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                VoIpSwitchLayout.VoIpButtonView.this.lambda$setSelectedState$1(valueAnimator3);
                            }
                        });
                        this.animator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                VoIpButtonView.this.unselectedRadius = 0;
                                VoIpButtonView.this.invalidate();
                            }
                        });
                        this.animator.setDuration(200L);
                        this.animator.start();
                        this.selectedIcon.setCurrentFrame(0, false);
                        this.selectedIcon.start();
                    } else {
                        this.selectedRadius = this.maxRadius;
                        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                                VoIpSwitchLayout.VoIpButtonView.this.lambda$setSelectedState$2(valueAnimator3);
                            }
                        });
                        this.animator.setDuration(200L);
                        this.animator.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                VoIpButtonView.this.selectedRadius = 0;
                                VoIpButtonView.this.invalidate();
                            }
                        });
                        this.animator.start();
                    }
                }
            } else if (z) {
                this.selectedRadius = this.maxRadius;
                this.unselectedRadius = 0;
                this.singleIconBackgroundAlphaPercent = 100;
                if (type == Type.VIDEO || type == Type.MICRO) {
                    RLottieDrawable rLottieDrawable = this.selectedIcon;
                    rLottieDrawable.setCurrentFrame(rLottieDrawable.getFramesCount() - 1, false);
                }
            } else {
                this.selectedRadius = 0;
                this.unselectedRadius = this.maxRadius;
                this.singleIconBackgroundAlphaPercent = 20;
            }
            this.isSelectedState = z;
            invalidate();
        }

        public void lambda$setSelectedState$0(ValueAnimator valueAnimator) {
            this.singleIconBackgroundAlphaPercent = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            invalidate();
        }

        public void lambda$setSelectedState$1(ValueAnimator valueAnimator) {
            this.selectedRadius = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            invalidate();
        }

        public void lambda$setSelectedState$2(ValueAnimator valueAnimator) {
            this.unselectedRadius = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            invalidate();
        }

        public void setOnBtnClickedListener(OnBtnClickedListener onBtnClickedListener) {
            this.onBtnClickedListener = onBtnClickedListener;
        }

        public VoIpButtonView(Context context, VoIPBackgroundProvider voIPBackgroundProvider) {
            super(context);
            Paint paint = new Paint(1);
            this.maskPaint = paint;
            Paint paint2 = new Paint(1);
            this.whiteCirclePaint = paint2;
            Paint paint3 = new Paint(1);
            this.darkPaint = paint3;
            this.clipPath = new Path();
            int dp = AndroidUtilities.dp(26.0f);
            this.maxRadius = dp;
            this.unselectedRadius = dp;
            this.selectedRadius = 0;
            this.isSelectedState = false;
            this.singleIconBackgroundAlphaPercent = 0;
            this.pressedScale = 1.0f;
            this.backgroundProvider = voIPBackgroundProvider;
            voIPBackgroundProvider.attach(this);
            setLayerType(1, null);
            paint2.setColor(-1);
            paint.setColor(-16777216);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            paint3.setColor(-16777216);
            paint3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP));
            paint3.setAlpha(35);
        }

        private void setPressedBtn(boolean z) {
            ValueAnimator valueAnimator = this.pressedScaleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            float[] fArr = new float[2];
            fArr[0] = this.pressedScale;
            fArr[1] = z ? 0.8f : 1.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.pressedScaleAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    VoIpSwitchLayout.VoIpButtonView.this.lambda$setPressedBtn$3(valueAnimator2);
                }
            });
            this.pressedScaleAnimator.setDuration(150L);
            this.pressedScaleAnimator.start();
        }

        public void lambda$setPressedBtn$3(ValueAnimator valueAnimator) {
            this.pressedScale = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.save();
            float f = this.pressedScale;
            canvas.scale(f, f, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            this.backgroundProvider.setLightTranslation(getX() + ((View) getParent()).getX(), getY() + ((View) ((View) getParent()).getParent()).getY());
            if (this.singleIcon != null) {
                int i = this.singleIconBackgroundAlphaPercent;
                if (i > 20) {
                    this.darkPaint.setAlpha((int) ((i * 35) / 100.0f));
                    this.whiteCirclePaint.setAlpha((int) ((this.singleIconBackgroundAlphaPercent * 255) / 100.0f));
                    canvas.drawCircle(width, height, this.maxRadius, this.whiteCirclePaint);
                    this.singleIcon.draw(canvas, this.maskPaint);
                    this.singleIcon.draw(canvas, this.darkPaint);
                    return;
                }
                canvas.drawCircle(width, height, this.maxRadius, this.backgroundProvider.getLightPaint());
                if (this.backgroundProvider.isReveal()) {
                    canvas.drawCircle(width, height, this.maxRadius, this.backgroundProvider.getRevealPaint());
                }
                this.singleIcon.draw(canvas);
            } else if (this.selectedIcon == null || this.unSelectedIcon == null) {
            } else {
                int i2 = this.unselectedRadius;
                int i3 = this.maxRadius;
                boolean z = true;
                boolean z2 = i2 == i3 && this.selectedRadius == 0;
                int i4 = this.selectedRadius;
                z = (i4 == i3 && i2 == 0) ? false : false;
                if (i4 == i3 && i2 > 0 && i2 != i3) {
                    canvas.drawCircle(width, height, i4, this.whiteCirclePaint);
                    canvas.drawCircle(width, height, this.unselectedRadius, this.maskPaint);
                    this.selectedIcon.setAlpha(255);
                    this.selectedIcon.draw(canvas, this.maskPaint);
                    this.selectedIcon.setAlpha(35);
                    this.selectedIcon.draw(canvas);
                    this.clipPath.reset();
                    this.clipPath.addCircle(width, height, this.unselectedRadius, Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                    canvas.drawCircle(width, height, this.unselectedRadius, this.maskPaint);
                }
                if (z2 || this.unselectedRadius > 0) {
                    canvas.drawCircle(width, height, this.unselectedRadius, this.backgroundProvider.getLightPaint());
                    if (this.backgroundProvider.isReveal()) {
                        canvas.drawCircle(width, height, this.unselectedRadius, this.backgroundProvider.getRevealPaint());
                    }
                    this.unSelectedIcon.draw(canvas);
                }
                if (z || (this.selectedRadius > 0 && this.unselectedRadius == this.maxRadius)) {
                    this.clipPath.reset();
                    this.clipPath.addCircle(width, height, this.selectedRadius, Path.Direction.CW);
                    canvas.clipPath(this.clipPath);
                    canvas.drawCircle(width, height, this.selectedRadius, this.whiteCirclePaint);
                    this.selectedIcon.setAlpha(255);
                    this.selectedIcon.draw(canvas, this.maskPaint);
                    this.selectedIcon.setAlpha(35);
                    this.selectedIcon.draw(canvas);
                }
                canvas.restore();
            }
        }

        private boolean isAnimating() {
            int i = this.unselectedRadius;
            int i2 = this.maxRadius;
            return ((i == i2 && this.selectedRadius == 0) || (this.selectedRadius == i2 && i == 0)) ? false : true;
        }

        @Override
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            OnBtnClickedListener onBtnClickedListener;
            int action = motionEvent.getAction();
            if (action == 0) {
                setPressedBtn(true);
                this.startX = motionEvent.getX();
                this.startY = motionEvent.getY();
            } else if (action == 1) {
                setPressedBtn(false);
                if (isClick(this.startX, motionEvent.getX(), this.startY, motionEvent.getY()) && !isAnimating() && (onBtnClickedListener = this.onBtnClickedListener) != null) {
                    onBtnClickedListener.onClicked(this);
                }
            } else if (action == 3) {
                setPressedBtn(false);
            }
            return true;
        }

        private boolean isClick(float f, float f2, float f3, float f4) {
            return Math.abs(f - f2) <= ((float) AndroidUtilities.dp(48.0f)) && Math.abs(f3 - f4) <= ((float) AndroidUtilities.dp(48.0f));
        }
    }
}

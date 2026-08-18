package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
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

    private void setText(Type type, boolean z) {
        final String string;
        int iOrdinal = type.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                string = LocaleController.getString(R.string.VoipFlip);
            } else if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    string = LocaleController.getString(R.string.VoipAudioRoutingBluetooth);
                } else if (iOrdinal == 4) {
                    string = LocaleController.getString(R.string.VoipSpeaker);
                } else {
                    string = "";
                }
            } else if (z) {
                string = LocaleController.getString(R.string.VoipStartVideo);
            } else {
                string = LocaleController.getString(R.string.VoipStopVideo);
            }
        } else if (z) {
            string = LocaleController.getString(R.string.VoipUnmute);
        } else {
            string = LocaleController.getString(R.string.VoipMute);
        }
        setContentDescription(string);
        if (this.currentTextView.getVisibility() == 8 && this.newTextView.getVisibility() == 8) {
            this.currentTextView.setVisibility(0);
            this.currentTextView.setText(string);
            this.newTextView.setText(string);
        } else {
            if (this.newTextView.getText().equals(string) && this.currentTextView.getText().equals(string)) {
                return;
            }
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

    public void setType(Type type, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (this.type == type && z == this.voIpButtonView.isSelectedState) {
            if (getVisibility() != 0) {
                setVisibility(0);
                return;
            }
            return;
        }
        if (getVisibility() != 0) {
            setVisibility(0);
        }
        final int iDp = AndroidUtilities.dp(53.5f);
        int iOrdinal = type.ordinal();
        if (iOrdinal == 0) {
            if (this.type != Type.MICRO) {
                VoIpButtonView voIpButtonView = this.voIpButtonView;
                int i = R.raw.call_mute;
                voIpButtonView.unSelectedIcon = new RLottieDrawable(i, "" + i, iDp, iDp, true, null);
                this.voIpButtonView.selectedIcon = new RLottieDrawable(i, "" + i, iDp, iDp, true, null);
                this.voIpButtonView.selectedIcon.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                this.voIpButtonView.selectedIcon.setMasterParent(this.voIpButtonView);
            }
        } else {
            if (iOrdinal == 1) {
                Type type2 = this.type;
                if (type2 == Type.SPEAKER || type2 == Type.BLUETOOTH) {
                    attachNewButton(R.raw.camera_flip2, iDp, z, type);
                    z3 = true;
                } else if (type2 != Type.CAMERA) {
                    VoIpButtonView voIpButtonView2 = this.voIpButtonView;
                    int i2 = R.raw.camera_flip2;
                    voIpButtonView2.singleIcon = new RLottieDrawable(i2, "" + i2, iDp, iDp, true, null);
                    this.voIpButtonView.singleIcon.setMasterParent(this.voIpButtonView);
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    Type type3 = this.type;
                    if (type3 != Type.SPEAKER) {
                        if (type3 == Type.CAMERA) {
                            attachNewButton(R.raw.bt_to_speaker, iDp, z, type);
                            z3 = true;
                        } else if (type3 != Type.BLUETOOTH) {
                            lambda$setType$2(iDp);
                        }
                    } else {
                        z3 = z == this.voIpButtonView.isSelectedState;
                        RLottieDrawable rLottieDrawable = z ? this.voIpButtonView.selectedIcon : this.voIpButtonView.unSelectedIcon;
                        rLottieDrawable.setMasterParent(this.voIpButtonView);
                        rLottieDrawable.setOnAnimationEndListener(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$setType$3(iDp);
                            }
                        });
                        rLottieDrawable.start();
                    }
                } else if (iOrdinal == 4) {
                    Type type4 = this.type;
                    if (type4 != Type.BLUETOOTH) {
                        if (type4 == Type.CAMERA) {
                            attachNewButton(R.raw.speaker_to_bt, iDp, z, type);
                            z3 = true;
                        } else if (type4 != Type.SPEAKER) {
                            lambda$setType$0(iDp);
                        }
                    } else {
                        z3 = z == this.voIpButtonView.isSelectedState;
                        RLottieDrawable rLottieDrawable2 = z ? this.voIpButtonView.selectedIcon : this.voIpButtonView.unSelectedIcon;
                        rLottieDrawable2.setMasterParent(this.voIpButtonView);
                        rLottieDrawable2.setOnAnimationEndListener(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$setType$1(iDp);
                            }
                        });
                        rLottieDrawable2.start();
                    }
                }
            } else if (this.type != Type.VIDEO) {
                VoIpButtonView voIpButtonView3 = this.voIpButtonView;
                int i3 = R.raw.video_stop;
                voIpButtonView3.unSelectedIcon = new RLottieDrawable(i3, "" + i3, iDp, iDp, true, null);
                this.voIpButtonView.selectedIcon = new RLottieDrawable(i3, "" + i3, iDp, iDp, true, null);
                this.voIpButtonView.selectedIcon.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                this.voIpButtonView.selectedIcon.setMasterParent(this.voIpButtonView);
            }
            if (!z3) {
                VoIpButtonView voIpButtonView4 = this.voIpButtonView;
                if (this.type != null || z2) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                voIpButtonView4.setSelectedState(z, z4, type);
            }
            setText(type, z);
            this.type = type;
        }
        z3 = false;
        if (!z3) {
            VoIpButtonView voIpButtonView5 = this.voIpButtonView;
            if (this.type != null) {
                z4 = false;
            } else {
                z4 = false;
            }
            voIpButtonView5.setSelectedState(z, z4, type);
        }
        setText(type, z);
        this.type = type;
    }

    public void lambda$setType$1(final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setType$0(i);
            }
        });
    }

    public void lambda$setType$3(final int i) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setType$2(i);
            }
        });
    }

    public void lambda$setType$0(int i) {
        VoIpButtonView voIpButtonView = this.voIpButtonView;
        int i2 = R.raw.speaker_to_bt;
        voIpButtonView.unSelectedIcon = new RLottieDrawable(i2, "" + i2, i, i, true, null);
        this.voIpButtonView.selectedIcon = new RLottieDrawable(i2, "" + i2, i, i, true, null);
        this.voIpButtonView.selectedIcon.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
    }

    public void lambda$setType$2(int i) {
        VoIpButtonView voIpButtonView = this.voIpButtonView;
        int i2 = R.raw.bt_to_speaker;
        voIpButtonView.unSelectedIcon = new RLottieDrawable(i2, "" + i2, i, i, true, null);
        this.voIpButtonView.selectedIcon = new RLottieDrawable(i2, "" + i2, i, i, true, null);
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
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.animator.removeAllUpdateListeners();
                this.animator.cancel();
                z2 = false;
            }
            if (z2) {
                if (this.singleIcon != null) {
                    ValueAnimator valueAnimator2 = this.animator;
                    if (valueAnimator2 != null) {
                        valueAnimator2.removeAllUpdateListeners();
                        this.animator.cancel();
                    }
                    ValueAnimator valueAnimatorOfInt = z ? ValueAnimator.ofInt(20, 100) : ValueAnimator.ofInt(100, 20);
                    this.animator = valueAnimatorOfInt;
                    valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            this.f$0.lambda$setSelectedState$0(valueAnimator3);
                        }
                    });
                    this.animator.setDuration(200L);
                    this.animator.start();
                    if (type == Type.CAMERA) {
                        this.singleIcon.setCurrentFrame(0, false);
                        this.singleIcon.start();
                    }
                } else {
                    ValueAnimator valueAnimator3 = this.animator;
                    if (valueAnimator3 != null) {
                        valueAnimator3.removeAllUpdateListeners();
                        this.animator.cancel();
                    }
                    ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(0, this.maxRadius);
                    this.animator = valueAnimatorOfInt2;
                    if (z) {
                        this.unselectedRadius = this.maxRadius;
                        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                                this.f$0.lambda$setSelectedState$1(valueAnimator4);
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
                        valueAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                                this.f$0.lambda$setSelectedState$2(valueAnimator4);
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
            int iDp = AndroidUtilities.dp(26.0f);
            this.maxRadius = iDp;
            this.unselectedRadius = iDp;
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
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pressedScale, z ? 0.8f : 1.0f);
            this.pressedScaleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$setPressedBtn$3(valueAnimator2);
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
                return;
            }
            if (this.selectedIcon == null || this.unSelectedIcon == null) {
                return;
            }
            int i2 = this.unselectedRadius;
            int i3 = this.maxRadius;
            boolean z = false;
            boolean z2 = i2 == i3 && this.selectedRadius == 0;
            int i4 = this.selectedRadius;
            if (i4 == i3 && i2 == 0) {
                z = true;
            }
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

        private boolean isAnimating() {
            int i = this.unselectedRadius;
            int i2 = this.maxRadius;
            return ((i == i2 && this.selectedRadius == 0) || (this.selectedRadius == i2 && i == 0)) ? false : true;
        }

        @Override
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

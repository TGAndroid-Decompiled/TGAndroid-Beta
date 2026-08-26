package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;

public abstract class StoryModeTabs extends FrameLayout implements FlashViews.Invertable {
    public ValueAnimator animator;
    public float invert;
    public final AnonymousClass1 layout;
    public final TextView live;
    public final FrameLayout liveLayout;
    public float mode;
    public Utilities.Callback onSwitchModeListener;
    public Utilities.Callback onSwitchingModeListener;
    public final TextView photo;
    public final FrameLayout photoLayout;
    public int toMode;
    public final TextView video;
    public final FrameLayout videoLayout;

    public StoryModeTabs(Activity activity) {
        super(activity);
        final StoryRecorder.AnonymousClass12 anonymousClass12 = (StoryRecorder.AnonymousClass12) this;
        ?? r2 = new LinearLayout(activity) {
            public final RectF a = new RectF();
            public final RectF b = new RectF();
            public final RectF c = new RectF();
            public final Paint backgroundPaint = new Paint(1);

            @Override
            public final void dispatchDraw(Canvas canvas) {
                StoryRecorder.AnonymousClass12 anonymousClass13 = anonymousClass12;
                int iFloor = (int) Math.floor(anonymousClass13.mode);
                RectF rectF = this.a;
                setRect(iFloor, rectF);
                int iCeil = (int) Math.ceil(anonymousClass13.mode);
                RectF rectF2 = this.b;
                setRect(iCeil, rectF2);
                float f = anonymousClass13.mode;
                float fFloor = f - ((float) Math.floor(f));
                RectF rectF3 = this.c;
                AndroidUtilities.lerp(rectF, rectF2, fFloor, rectF3);
                Paint paint = this.backgroundPaint;
                paint.setColor(Theme.multAlpha(0.15f, ColorUtils.blendARGB(anonymousClass13.invert, -1, -16777216)));
                canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, rectF3.height() / 2.0f, paint);
                super.dispatchDraw(canvas);
            }

            public final void setRect(int i, RectF rectF) {
                FrameLayout frameLayout;
                StoryRecorder.AnonymousClass12 anonymousClass13 = anonymousClass12;
                if (i <= -1) {
                    frameLayout = anonymousClass13.liveLayout;
                } else {
                    frameLayout = i >= 1 ? anonymousClass13.videoLayout : anonymousClass13.photoLayout;
                }
                rectF.set(frameLayout.getLeft(), frameLayout.getBottom() - AndroidUtilities.dp(30.0f), frameLayout.getRight(), frameLayout.getBottom());
            }
        };
        this.layout = r2;
        r2.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.liveLayout = frameLayout;
        TextView textView = new TextView(activity);
        this.live = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        r2.addView(frameLayout, LayoutHelper.createLinear(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final StoryRecorder.AnonymousClass12 anonymousClass13 = (StoryRecorder.AnonymousClass12) this;
        final int i = 0;
        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        StoryRecorder.AnonymousClass12 anonymousClass14 = anonymousClass13;
                        if (anonymousClass14.toMode != -1) {
                            anonymousClass14.switchMode(-1);
                            Utilities.Callback callback = anonymousClass14.onSwitchModeListener;
                            if (callback != null) {
                                callback.run(-1);
                            }
                            break;
                        }
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass12 anonymousClass15 = anonymousClass13;
                        if (anonymousClass15.toMode != 0) {
                            anonymousClass15.switchMode(0);
                            Utilities.Callback callback2 = anonymousClass15.onSwitchModeListener;
                            if (callback2 != null) {
                                callback2.run(0);
                            }
                            break;
                        }
                        break;
                    default:
                        StoryRecorder.AnonymousClass12 anonymousClass16 = anonymousClass13;
                        if (anonymousClass16.toMode != 1) {
                            anonymousClass16.switchMode(1);
                            Utilities.Callback callback3 = anonymousClass16.onSwitchModeListener;
                            if (callback3 != null) {
                                callback3.run(1);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ScaleStateListAnimator.apply(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.photoLayout = frameLayout2;
        TextView textView2 = new TextView(activity);
        this.photo = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        r2.addView(frameLayout2, LayoutHelper.createLinear(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i2 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        StoryRecorder.AnonymousClass12 anonymousClass14 = anonymousClass13;
                        if (anonymousClass14.toMode != -1) {
                            anonymousClass14.switchMode(-1);
                            Utilities.Callback callback = anonymousClass14.onSwitchModeListener;
                            if (callback != null) {
                                callback.run(-1);
                            }
                            break;
                        }
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass12 anonymousClass15 = anonymousClass13;
                        if (anonymousClass15.toMode != 0) {
                            anonymousClass15.switchMode(0);
                            Utilities.Callback callback2 = anonymousClass15.onSwitchModeListener;
                            if (callback2 != null) {
                                callback2.run(0);
                            }
                            break;
                        }
                        break;
                    default:
                        StoryRecorder.AnonymousClass12 anonymousClass16 = anonymousClass13;
                        if (anonymousClass16.toMode != 1) {
                            anonymousClass16.switchMode(1);
                            Utilities.Callback callback3 = anonymousClass16.onSwitchModeListener;
                            if (callback3 != null) {
                                callback3.run(1);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ScaleStateListAnimator.apply(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.videoLayout = frameLayout3;
        TextView textView3 = new TextView(activity);
        this.video = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        r2.addView(frameLayout3, LayoutHelper.createLinear(-2, -1, 112, 0, 0, 0, 0));
        final int i3 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        StoryRecorder.AnonymousClass12 anonymousClass14 = anonymousClass13;
                        if (anonymousClass14.toMode != -1) {
                            anonymousClass14.switchMode(-1);
                            Utilities.Callback callback = anonymousClass14.onSwitchModeListener;
                            if (callback != null) {
                                callback.run(-1);
                            }
                            break;
                        }
                        break;
                    case 1:
                        StoryRecorder.AnonymousClass12 anonymousClass15 = anonymousClass13;
                        if (anonymousClass15.toMode != 0) {
                            anonymousClass15.switchMode(0);
                            Utilities.Callback callback2 = anonymousClass15.onSwitchModeListener;
                            if (callback2 != null) {
                                callback2.run(0);
                            }
                            break;
                        }
                        break;
                    default:
                        StoryRecorder.AnonymousClass12 anonymousClass16 = anonymousClass13;
                        if (anonymousClass16.toMode != 1) {
                            anonymousClass16.switchMode(1);
                            Utilities.Callback callback3 = anonymousClass16.onSwitchModeListener;
                            if (callback3 != null) {
                                callback3.run(1);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ScaleStateListAnimator.apply(frameLayout3);
        addView((View) r2, LayoutHelper.createFrame(-2, -1, 113));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (StoryRecorder.this.inCheck()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        invalidate();
    }

    @Override
    public void setInvert(float f) {
        this.invert = f;
        this.live.setTextColor(ColorUtils.blendARGB(f, -1, -16777216));
        this.photo.setTextColor(ColorUtils.blendARGB(f, -1, -16777216));
        this.video.setTextColor(ColorUtils.blendARGB(f, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.onSwitchModeListener = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.onSwitchingModeListener = callback;
    }

    public final void switchMode(int i) {
        if (this.toMode == i) {
            return;
        }
        this.toMode = i;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.mode, i);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new HintView2$$ExternalSyntheticLambda1(this, 9));
        this.animator.setDuration(320L);
        this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.animator.start();
    }
}

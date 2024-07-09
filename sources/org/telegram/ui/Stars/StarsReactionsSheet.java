package org.telegram.ui.Stars;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class StarsReactionsSheet extends BottomSheet {
    private final StarsIntroActivity.StarsBalanceView balanceView;
    private final ButtonWithCounterView buttonView;
    private final LinearLayout layout;
    private final View separatorView;
    private final StarsSlider slider;
    private final TextView statusView;
    private final TextView titleView;
    private final FrameLayout topLayout;
    private final TopSendersView topSendersView;

    public static void lambda$new$0(View view) {
    }

    public StarsReactionsSheet(Context context) {
        super(context, false);
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground));
        LinearLayout linearLayout = new LinearLayout(context);
        this.layout = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(this, context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i2), AndroidUtilities.dp(220.0f)), 1073741824));
            }
        };
        this.topLayout = frameLayout;
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 280));
        StarsSlider starsSlider = new StarsSlider(context) {
            @Override
            public void onValueChanged(int i) {
                StarsReactionsSheet.this.updateSenders(i);
            }
        };
        this.slider = starsSlider;
        starsSlider.setSteps(100, 1, 10, 50, 100, 250, 500, 1000, 2000, 5000, 7500, 10000);
        starsSlider.setValue(50);
        frameLayout.addView(starsSlider, LayoutHelper.createFrame(-1, -1.0f));
        TextView textView = new TextView(this, context) {
            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(ActionBar.getCurrentActionBarHeight(), 1073741824));
            }
        };
        this.titleView = textView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        textView.setTextColor(Theme.getColor(i));
        textView.setTextSize(1, 20.0f);
        textView.setText("Star Reaction");
        textView.setGravity(16);
        textView.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 51, 22.0f, 0.0f, 22.0f, 0.0f));
        StarsIntroActivity.StarsBalanceView starsBalanceView = new StarsIntroActivity.StarsBalanceView(context, this.currentAccount);
        this.balanceView = starsBalanceView;
        ScaleStateListAnimator.apply(starsBalanceView);
        starsBalanceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StarsReactionsSheet.lambda$new$0(view);
            }
        });
        frameLayout.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 53, 6.0f, 0.0f, 6.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        frameLayout.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 179.0f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.statusView = textView2;
        textView2.setTextColor(Theme.getColor(i));
        textView2.setTextSize(1, 14.0f);
        textView2.setGravity(17);
        textView2.setSingleLine(false);
        textView2.setMaxLines(3);
        textView2.setText(AndroidUtilities.replaceTags("Choose how may stars you want to send to **Cool Bunnies** to support this post."));
        linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2, 55, 40, 0, 40, 0));
        View view = new View(this, context) {
            private final LinearGradient gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            private final Matrix gradientMatrix = new Matrix();
            private final Paint backgroundPaint = new Paint(1);
            private final Paint separatorPaint = new Paint(1);
            private final Text text = new Text("Top senders", 14.16f, AndroidUtilities.bold());

            @Override
            public void dispatchDraw(Canvas canvas) {
                this.gradientMatrix.reset();
                this.gradientMatrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
                this.gradientMatrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
                this.gradient.setLocalMatrix(this.gradientMatrix);
                this.backgroundPaint.setShader(this.gradient);
                float currentWidth = this.text.getCurrentWidth() + AndroidUtilities.dp(30.0f);
                this.separatorPaint.setColor(Theme.getColor(Theme.key_divider));
                canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - currentWidth) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, this.separatorPaint);
                canvas.drawRect(((getWidth() + currentWidth) / 2.0f) + AndroidUtilities.dp(8.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, this.separatorPaint);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((getWidth() - currentWidth) / 2.0f, 0.0f, (getWidth() + currentWidth) / 2.0f, getHeight());
                canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, this.backgroundPaint);
                this.text.draw(canvas, (getWidth() - this.text.getCurrentWidth()) / 2.0f, getHeight() / 2.0f, -1, 1.0f);
            }
        };
        this.separatorView = view;
        linearLayout2.addView(view, LayoutHelper.createLinear(-1, 30, 55, 0, 30, 0, 0));
        TopSendersView topSendersView = new TopSendersView(context);
        this.topSendersView = topSendersView;
        linearLayout.addView(topSendersView, LayoutHelper.createLinear(-1, 120));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, null);
        this.buttonView = buttonWithCounterView;
        linearLayout.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 14.0f, 0.0f, 14.0f, 0.0f));
        updateSenders(50L);
        setCustomView(linearLayout);
    }

    public void updateSenders(long j) {
        if (this.topSendersView == null) {
            return;
        }
        SenderData of = SenderData.of(835030L, 800L);
        SenderData of2 = SenderData.of(-2204004266L, 1000L);
        SenderData of3 = SenderData.of(5309652686L, 2000L);
        SenderData of4 = SenderData.of(UserConfig.getInstance(this.currentAccount).getClientUserId(), j);
        ArrayList<SenderData> arrayList = new ArrayList<>();
        arrayList.add(of);
        arrayList.add(of2);
        arrayList.add(of3);
        arrayList.add(of4);
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$updateSenders$1;
                lambda$updateSenders$1 = StarsReactionsSheet.lambda$updateSenders$1((StarsReactionsSheet.SenderData) obj, (StarsReactionsSheet.SenderData) obj2);
                return lambda$updateSenders$1;
            }
        });
        arrayList.remove(arrayList.size() - 1);
        this.topSendersView.setSenders(arrayList);
        this.buttonView.setText(StarsIntroActivity.replaceStars("Send ⭐️" + LocaleController.formatNumber(j, ',')), false);
    }

    public static int lambda$updateSenders$1(SenderData senderData, SenderData senderData2) {
        return (int) (senderData2.stars - senderData.stars);
    }

    @Override
    public boolean canDismissWithSwipe() {
        if (this.slider.tracking) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    public static class StarsSlider extends View {
        public float aprogress;
        private final RectF arc;
        private final Drawable counterImage;
        private final AnimatedTextView.AnimatedTextDrawable counterText;
        private final LinearGradient gradient;
        private final Matrix gradientMatrix;
        private float lastX;
        private float lastY;
        private int pointerId;
        public float progress;
        private final Paint sliderCirclePaint;
        private final RectF sliderCircleRect;
        private final Paint sliderInnerPaint;
        private final Path sliderInnerPath;
        private final RectF sliderInnerRect;
        private final Paint sliderPaint;
        private final Particles sliderParticles;
        private final Path sliderPath;
        private final RectF sliderRect;
        private final ColoredImageSpan[] starRef;
        public int steps;
        public int[] stops;
        private final Paint textBackgroundPaint;
        private final Particles textParticles;
        private final Path textPath;
        private final RectF textRect;
        private boolean tracking;

        protected void onValueChanged(int i) {
        }

        public StarsSlider(Context context) {
            super(context);
            this.sliderInnerPaint = new Paint(1);
            this.sliderPaint = new Paint(1);
            this.sliderCirclePaint = new Paint(1);
            this.textBackgroundPaint = new Paint(1);
            this.sliderParticles = new Particles(0, 50);
            this.textParticles = new Particles(1, 30);
            this.gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.gradientMatrix = new Matrix();
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true);
            this.counterText = animatedTextDrawable;
            this.starRef = new ColoredImageSpan[1];
            this.sliderInnerRect = new RectF();
            this.sliderRect = new RectF();
            this.sliderCircleRect = new RectF();
            this.arc = new RectF();
            this.sliderInnerPath = new Path();
            this.sliderPath = new Path();
            this.textRect = new RectF();
            this.textPath = new Path();
            this.progress = 0.0f;
            Drawable mutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
            this.counterImage = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            animatedTextDrawable.setTextColor(-1);
            animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(21.0f));
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable.setGravity(17);
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.counterText || super.verifyDrawable(drawable);
        }

        public void setSteps(int i, int... iArr) {
            this.steps = i;
            this.stops = iArr;
        }

        public void setValue(int i) {
            setValue(i, false);
        }

        public void setValue(int i, boolean z) {
            float progress = getProgress(i);
            this.progress = progress;
            if (!z) {
                this.aprogress = progress;
            }
            updateText(true);
        }

        public int getValue() {
            return getValue(this.progress);
        }

        public float getProgress() {
            return this.progress;
        }

        public int getValue(float f) {
            int clamp = Utilities.clamp((int) Math.floor((this.stops.length - 1) * f), this.stops.length - 1, 0);
            int clamp2 = Utilities.clamp((int) Math.ceil((this.stops.length - 1) * f), this.stops.length - 1, 0);
            int[] iArr = this.stops;
            int length = iArr.length;
            return AndroidUtilities.lerp(iArr[clamp], iArr[clamp2], Math.round((clamp2 == clamp ? 1.0f : ((f * (iArr.length - 1)) - clamp) / (clamp2 - clamp)) * this.steps) / this.steps);
        }

        public float getProgress(int i) {
            int i2 = 1;
            while (true) {
                int[] iArr = this.stops;
                if (i2 >= iArr.length) {
                    return 1.0f;
                }
                if (i <= iArr[i2]) {
                    return ((i2 - 1) + ((i - iArr[r2]) / (iArr[i2] - iArr[r2]))) / iArr.length;
                }
                i2++;
            }
        }

        public void updateText(boolean z) {
            this.counterText.cancelAnimation();
            this.counterText.setText(StarsIntroActivity.replaceStars(LocaleController.formatNumber(getValue(), ','), this.starRef), z);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int measuredWidth = getMeasuredWidth();
            getMeasuredHeight();
            this.sliderInnerRect.set(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(135.0f), measuredWidth - r6, r0 + AndroidUtilities.dp(24.0f));
            this.sliderInnerPaint.setColor(653241613);
            this.sliderPaint.setColor(-1069811);
            this.sliderCirclePaint.setColor(-1);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float f;
            super.dispatchDraw(canvas);
            this.gradientMatrix.reset();
            this.gradientMatrix.postTranslate(this.sliderInnerRect.left, 0.0f);
            this.gradientMatrix.postScale(this.sliderInnerRect.width() / 255.0f, 1.0f);
            this.gradient.setLocalMatrix(this.gradientMatrix);
            this.sliderPaint.setShader(this.gradient);
            this.sliderInnerPath.rewind();
            this.sliderInnerPath.addRoundRect(this.sliderInnerRect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            canvas.drawPath(this.sliderInnerPath, this.sliderInnerPaint);
            this.sliderRect.set(this.sliderInnerRect);
            float progress = getProgress();
            RectF rectF = this.sliderRect;
            rectF.right = AndroidUtilities.lerp(rectF.left + AndroidUtilities.dp(24.0f), this.sliderRect.right, progress);
            this.sliderPath.rewind();
            this.sliderPath.addRoundRect(this.sliderRect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Path.Direction.CW);
            this.sliderParticles.setBounds(this.sliderInnerRect);
            this.sliderParticles.setSpeed((this.progress * 5.0f) + 1.0f);
            this.sliderParticles.process();
            canvas.save();
            canvas.clipPath(this.sliderInnerPath);
            this.sliderParticles.draw(canvas, -673522);
            canvas.drawPath(this.sliderPath, this.sliderPaint);
            canvas.clipPath(this.sliderPath);
            this.sliderParticles.draw(canvas, -1);
            canvas.restore();
            invalidate();
            this.sliderCircleRect.set((this.sliderRect.right - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f), this.sliderRect.centerY() - (AndroidUtilities.dp(16.0f) / 2.0f), this.sliderRect.right - AndroidUtilities.dp(4.0f), this.sliderRect.centerY() + (AndroidUtilities.dp(16.0f) / 2.0f));
            canvas.drawRoundRect(this.sliderCircleRect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.sliderCirclePaint);
            this.sliderInnerRect.width();
            float f2 = this.progress;
            RectF rectF2 = this.sliderCircleRect;
            float lerp = AndroidUtilities.lerp(rectF2.left, rectF2.right, f2);
            float currentWidth = this.counterText.getCurrentWidth() + AndroidUtilities.dp(50.0f);
            float dp = AndroidUtilities.dp(44.0f);
            float clamp = Utilities.clamp(lerp - (currentWidth / 2.0f), (this.sliderInnerRect.right - currentWidth) - AndroidUtilities.dp(4.0f), this.sliderInnerRect.left + AndroidUtilities.dp(4.0f));
            this.textRect.set(clamp, (this.sliderInnerRect.top - AndroidUtilities.dp(21.0f)) - dp, currentWidth + clamp, this.sliderInnerRect.top - AndroidUtilities.dp(21.0f));
            float height = this.textRect.height();
            float f3 = height / 2.0f;
            RectF rectF3 = this.textRect;
            float clamp2 = Utilities.clamp(lerp, rectF3.right, rectF3.left);
            RectF rectF4 = this.textRect;
            float clamp3 = Utilities.clamp(clamp2 - AndroidUtilities.dp(9.0f), rectF4.right, rectF4.left);
            RectF rectF5 = this.textRect;
            float clamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + clamp2, rectF5.right, rectF5.left);
            float clamp5 = Utilities.clamp(this.progress - this.aprogress, 1.0f, -1.0f) * 60.0f;
            float dp2 = this.textRect.bottom + AndroidUtilities.dp(8.0f);
            this.textPath.rewind();
            RectF rectF6 = this.arc;
            RectF rectF7 = this.textRect;
            float f4 = rectF7.left;
            float f5 = rectF7.top;
            rectF6.set(f4, f5, f4 + height, f5 + height);
            this.textPath.arcTo(this.arc, -180.0f, 90.0f);
            RectF rectF8 = this.arc;
            RectF rectF9 = this.textRect;
            float f6 = rectF9.right;
            float f7 = rectF9.top;
            rectF8.set(f6 - height, f7, f6, f7 + height);
            this.textPath.arcTo(this.arc, -90.0f, 90.0f);
            RectF rectF10 = this.arc;
            RectF rectF11 = this.textRect;
            float f8 = rectF11.right;
            float f9 = rectF11.bottom;
            rectF10.set(f8 - height, f9 - height, f8, f9);
            this.textPath.arcTo(this.arc, 0.0f, (float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp4 - this.arc.centerX()) / f3)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d));
            RectF rectF12 = this.textRect;
            float f10 = 0.7f * height;
            if (clamp3 < rectF12.right - f10) {
                this.textPath.lineTo(clamp4, rectF12.bottom);
                f = 8.0f;
                this.textPath.lineTo(clamp2 + 2.0f, this.textRect.bottom + AndroidUtilities.dp(8.0f));
            } else {
                f = 8.0f;
            }
            this.textPath.lineTo(clamp2, this.textRect.bottom + AndroidUtilities.dp(f) + 1.0f);
            RectF rectF13 = this.textRect;
            if (clamp4 > rectF13.left + f10) {
                this.textPath.lineTo(clamp2 - 2.0f, rectF13.bottom + AndroidUtilities.dp(8.0f));
                this.textPath.lineTo(clamp3, this.textRect.bottom);
            }
            RectF rectF14 = this.arc;
            RectF rectF15 = this.textRect;
            float f11 = rectF15.left;
            float f12 = rectF15.bottom;
            rectF14.set(f11, f12 - height, height + f11, f12);
            float clamp6 = ((float) Utilities.clamp(((Math.acos(Utilities.clamp01((clamp3 - this.arc.left) / f3)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d)) + 90.0f;
            this.textPath.arcTo(this.arc, clamp6, 180.0f - clamp6);
            Path path = this.textPath;
            RectF rectF16 = this.textRect;
            path.lineTo(rectF16.left, rectF16.bottom);
            this.textPath.close();
            RectF rectF17 = AndroidUtilities.rectTmp;
            rectF17.set(this.textRect);
            rectF17.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
            this.textParticles.setBounds(rectF17);
            this.textParticles.setSpeed((this.progress * 10.0f) + 1.0f);
            this.textParticles.process();
            canvas.save();
            this.textParticles.draw(canvas, -673522);
            canvas.restore();
            canvas.save();
            canvas.rotate(clamp5, clamp2, dp2);
            if (Math.abs(this.progress - this.aprogress) > 0.001f) {
                this.aprogress = AndroidUtilities.lerp(this.aprogress, this.progress, 0.1f);
                invalidate();
            }
            this.textBackgroundPaint.setShader(this.gradient);
            canvas.drawPath(this.textPath, this.textBackgroundPaint);
            canvas.save();
            canvas.clipPath(this.textPath);
            canvas.rotate(-clamp5, clamp2, dp2);
            this.textParticles.draw(canvas, -1);
            canvas.restore();
            this.counterImage.setBounds((int) (this.textRect.left + AndroidUtilities.dp(13.0f)), (int) (this.textRect.centerY() - AndroidUtilities.dp(10.0f)), (int) (this.textRect.left + AndroidUtilities.dp(33.0f)), (int) (this.textRect.centerY() + AndroidUtilities.dp(10.0f)));
            this.counterImage.draw(canvas);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counterText;
            float dp3 = this.textRect.left + AndroidUtilities.dp(24.0f);
            RectF rectF18 = this.textRect;
            animatedTextDrawable.setBounds(dp3, rectF18.top, rectF18.right, rectF18.bottom);
            this.counterText.draw(canvas);
            canvas.restore();
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.lastX = motionEvent.getX();
                this.lastY = motionEvent.getY();
                this.pointerId = motionEvent.getPointerId(0);
                this.tracking = false;
            } else if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.pointerId) {
                float x = motionEvent.getX() - this.lastX;
                float y = motionEvent.getY() - this.lastY;
                if (!this.tracking && Math.abs(x) > Math.abs(y * 1.5f) && Math.abs(x) > AndroidUtilities.touchSlop) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.tracking = true;
                }
                if (this.tracking) {
                    int value = getValue();
                    this.progress = Utilities.clamp01(this.progress + (x / (getWidth() * 1.5f)));
                    if (getValue() != value) {
                        onValueChanged(getValue());
                        updateText(true);
                    }
                    this.lastX = motionEvent.getX();
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.tracking = false;
            }
            return true;
        }
    }

    public static class Particles {
        public final Bitmap b;
        private long lastTime;
        public final ArrayList<Particle> particles;
        public final int type;
        public final RectF bounds = new RectF();
        public final Paint bPaint = new Paint(3);
        public final Rect rect = new Rect();
        private float speed = 1.0f;

        public Particles(int i, int i2) {
            this.type = i;
            this.particles = new ArrayList<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.particles.add(new Particle());
            }
            int dp = AndroidUtilities.dp(10.0f);
            Bitmap createBitmap = Bitmap.createBitmap(dp, dp, Bitmap.Config.ARGB_8888);
            this.b = createBitmap;
            Path path = new Path();
            float f = dp >> 1;
            int i4 = (int) (0.85f * f);
            path.moveTo(0.0f, f);
            float f2 = i4;
            path.lineTo(f2, f2);
            path.lineTo(f, 0.0f);
            float f3 = dp - i4;
            path.lineTo(f3, f2);
            float f4 = dp;
            path.lineTo(f4, f);
            path.lineTo(f3, f3);
            path.lineTo(f, f4);
            path.lineTo(f2, f3);
            path.lineTo(0.0f, f);
            path.close();
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setColor(Theme.multAlpha(-1, 0.75f));
            canvas.drawPath(path, paint);
        }

        public void setBounds(RectF rectF) {
            this.bounds.set(rectF);
            if (this.type == 1) {
                long currentTimeMillis = System.currentTimeMillis();
                for (int i = 0; i < this.particles.size(); i++) {
                    Particle particle = this.particles.get(i);
                    if (!rectF.contains(particle.x, particle.y)) {
                        gen(particle, currentTimeMillis);
                    }
                }
            }
        }

        public void setSpeed(float f) {
            this.speed = f;
        }

        public void process() {
            long currentTimeMillis = System.currentTimeMillis();
            float min = (((float) Math.min(this.lastTime - currentTimeMillis, 16L)) / 1000.0f) * this.speed;
            for (int i = 0; i < this.particles.size(); i++) {
                Particle particle = this.particles.get(i);
                long j = particle.lifetime;
                float f = j <= 0 ? 2.0f : ((float) (currentTimeMillis - particle.start)) / ((float) j);
                if (f > 1.0f) {
                    gen(particle, currentTimeMillis);
                    f = 0.0f;
                }
                particle.x += particle.vx * min;
                particle.y += particle.vy * min;
                float f2 = 4.0f * f;
                particle.la = f2 - (f * f2);
            }
            this.lastTime = currentTimeMillis;
        }

        public void draw(Canvas canvas, int i) {
            this.bPaint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
            for (int i2 = 0; i2 < this.particles.size(); i2++) {
                Particle particle = this.particles.get(i2);
                particle.draw(canvas, i, particle.la);
            }
        }

        public void gen(Particle particle, long j) {
            particle.start = j;
            particle.lifetime = AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat());
            RectF rectF = this.bounds;
            particle.x = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
            RectF rectF2 = this.bounds;
            particle.y = AndroidUtilities.lerp(rectF2.top, rectF2.bottom, Utilities.fastRandom.nextFloat());
            if (this.type == 0) {
                particle.vx = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
                particle.vy = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
            } else {
                particle.vx = this.bounds.centerX() - particle.x;
                particle.vy = this.bounds.centerY() - particle.y;
                float dp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat()));
                float f = particle.vx;
                float f2 = particle.vy;
                float sqrt = dp / ((float) Math.sqrt((f * f) + (f2 * f2)));
                particle.vx *= sqrt;
                particle.vy *= sqrt;
            }
            particle.a = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
            particle.s = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
        }

        public class Particle {
            public float a;
            public float la;
            public long lifetime;
            public float s;
            public long start;
            public float vx;
            public float vy;
            public float x;
            public float y;

            public Particle() {
            }

            public void draw(Canvas canvas, int i, float f) {
                Particles.this.bPaint.setAlpha((int) (255.0f * f));
                Particles.this.rect.set((int) (this.x - ((((r8.b.getWidth() / 2.0f) * this.a) * this.s) * f)), (int) (this.y - ((((Particles.this.b.getHeight() / 2.0f) * this.a) * this.s) * f)), (int) (this.x + ((Particles.this.b.getWidth() / 2.0f) * this.a * this.s * f)), (int) (this.y + ((Particles.this.b.getHeight() / 2.0f) * this.a * this.s * f)));
                Particles particles = Particles.this;
                canvas.drawBitmap(particles.b, (Rect) null, particles.rect, particles.bPaint);
            }
        }
    }

    public static class SenderData {
        public long did;
        public long stars;

        public static SenderData of(long j, long j2) {
            SenderData senderData = new SenderData();
            senderData.did = j;
            senderData.stars = j2;
            return senderData;
        }
    }

    public static class TopSendersView extends View {
        public final AnimatedFloat animatedCount;
        public final Paint backgroundPaint;
        public float count;
        public final ArrayList<Sender> oldSenders;
        public final ArrayList<Sender> senders;
        public final Paint starsBackgroundPaint;

        public TopSendersView(Context context) {
            super(context);
            this.senders = new ArrayList<>();
            this.oldSenders = new ArrayList<>();
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            Paint paint2 = new Paint(1);
            this.starsBackgroundPaint = paint2;
            this.animatedCount = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setColor(Theme.getColor(Theme.key_dialogBackground));
            paint2.setColor(-1002750);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            this.count = this.animatedCount.set(this.senders.size());
            for (int i = 0; i < this.oldSenders.size(); i++) {
                this.oldSenders.get(i).draw(canvas);
            }
            for (int i2 = 0; i2 < this.senders.size(); i2++) {
                this.senders.get(i2).draw(canvas);
            }
        }

        public void setSenders(ArrayList<SenderData> arrayList) {
            Sender sender;
            int i = 0;
            while (true) {
                SenderData senderData = null;
                if (i >= this.senders.size()) {
                    break;
                }
                Sender sender2 = this.senders.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    }
                    if (arrayList.get(i2).did == sender2.did) {
                        senderData = arrayList.get(i2);
                        break;
                    }
                    i2++;
                }
                if (senderData == null) {
                    this.senders.remove(i);
                    i--;
                    sender2.index = -1;
                    this.oldSenders.add(sender2);
                }
                i++;
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                SenderData senderData2 = arrayList.get(i3);
                int i4 = 0;
                while (true) {
                    if (i4 >= this.senders.size()) {
                        sender = null;
                        break;
                    } else {
                        if (this.senders.get(i4).did == senderData2.did) {
                            sender = this.senders.get(i4);
                            break;
                        }
                        i4++;
                    }
                }
                if (sender == null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= this.oldSenders.size()) {
                            break;
                        }
                        if (this.oldSenders.get(i5).did == senderData2.did) {
                            sender = this.oldSenders.get(i5);
                            break;
                        }
                        i5++;
                    }
                    if (sender != null) {
                        this.oldSenders.remove(sender);
                        this.senders.add(sender);
                    }
                }
                if (sender == null) {
                    sender = new Sender(senderData2.did);
                    sender.animatedPosition.set(arrayList.size(), true);
                    sender.animatedScale.set(0.0f, true);
                    this.senders.add(sender);
                }
                sender.setStars(senderData2.stars);
                sender.index = (arrayList.size() - 1) - i3;
            }
            invalidate();
        }

        public class Sender {
            public final AnimatedFloat animatedPosition;
            public final AnimatedFloat animatedScale;
            public final AvatarDrawable avatarDrawable;
            public final long did;
            public final ImageReceiver imageReceiver;
            public int index;
            public Text starsText;
            public final Text text;

            public Sender(long j) {
                String str;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.animatedPosition = new AnimatedFloat(TopSendersView.this, 0L, 600L, cubicBezierInterpolator);
                this.animatedScale = new AnimatedFloat(TopSendersView.this, 0L, 200L, cubicBezierInterpolator);
                ImageReceiver imageReceiver = new ImageReceiver(TopSendersView.this);
                this.imageReceiver = imageReceiver;
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                this.avatarDrawable = avatarDrawable;
                this.did = j;
                if (j >= 0) {
                    TLRPC$User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j));
                    str = UserObject.getForcedFirstName(user);
                    avatarDrawable.setInfo(user);
                    imageReceiver.setForUserOrChat(user, avatarDrawable);
                } else {
                    TLRPC$Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j));
                    str = chat == null ? "" : chat.title;
                    avatarDrawable.setInfo(chat);
                    imageReceiver.setForUserOrChat(chat, avatarDrawable);
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
                this.text = new Text(str, 12.0f);
            }

            public void setStars(long j) {
                this.starsText = new Text(StarsIntroActivity.replaceStars("⭐️" + LocaleController.formatNumber(j, ','), 0.85f), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
            }

            public void draw(Canvas canvas) {
                float f = this.animatedPosition.set(this.index);
                AnimatedFloat animatedFloat = this.animatedScale;
                int i = this.index;
                float f2 = animatedFloat.set(i >= 0 && i < TopSendersView.this.senders.size());
                canvas.save();
                float dp = AndroidUtilities.dp(40.0f) + (((TopSendersView.this.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, TopSendersView.this.count)) * ((TopSendersView.this.count - 0.5f) - f));
                float dp2 = AndroidUtilities.dp(50.0f);
                float f3 = (0.3f * f2) + 0.7f;
                canvas.scale(f3, f3, dp, dp2);
                this.imageReceiver.setImageCoords(dp - (AndroidUtilities.dp(56.0f) / 2.0f), dp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                this.imageReceiver.draw(canvas);
                this.imageReceiver.setAlpha(f2);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((dp - (this.starsText.getCurrentWidth() / 2.0f)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + dp2) - (AndroidUtilities.dp(16.0f) / 2.0f), (this.starsText.getCurrentWidth() / 2.0f) + dp + AndroidUtilities.dp(5.66f), AndroidUtilities.dp(23.0f) + dp2 + (AndroidUtilities.dp(16.0f) / 2.0f));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, TopSendersView.this.backgroundPaint);
                TopSendersView.this.starsBackgroundPaint.setAlpha((int) (255.0f * f2));
                canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, TopSendersView.this.starsBackgroundPaint);
                Text text = this.starsText;
                text.draw(canvas, dp - (text.getCurrentWidth() / 2.0f), dp2 + AndroidUtilities.dp(23.0f), -1, f2);
                Text text2 = this.text;
                text2.draw(canvas, dp - (text2.getCurrentWidth() / 2.0f), dp2 + AndroidUtilities.dp(42.0f), -16777216, f2);
                canvas.restore();
            }
        }
    }
}

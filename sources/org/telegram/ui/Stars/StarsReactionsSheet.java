package org.telegram.ui.Stars;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.TransitionManager;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.app.NotificationCompatBuilder;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.zxing.common.detector.MathUtils;
import java.util.ArrayList;
import java.util.Collections;
import me.vkryl.android.animator.BoolAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda135;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda286;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BatchParticlesDrawHelper;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda3;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.QrActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.StakedDiceSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.HighlightMessageSheet;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.LiveCommentsView$$ExternalSyntheticLambda9;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.web.WebActionBar;

public final class StarsReactionsSheet extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    public final BalanceCloud balanceCloud;
    public final ButtonWithCounterView buttonView;
    public ChatActivity chatActivity;
    public final CheckBox2 checkBox;
    public boolean checkedVisiblity;
    public final LiveCommentsView.Message commentMessage;
    public final LiveCommentsView.LiveCommentView commentView;
    public PeerStoriesView.AnonymousClass10 commentsView;
    public final int currentAccount;
    public final BackupImageView dialogImageView;
    public final FrameLayout dialogSelectorInnerLayout;
    public final FrameLayout dialogSelectorLayout;
    public final AnonymousClass6 icon3dView;
    public ValueAnimator iconAnimator;
    public long lastSelectedPeer;
    public final LinearLayout layout;
    public final boolean liveStories;
    public View messageCell;
    public final MessageObject messageObject;
    public LiveCommentsView$$ExternalSyntheticLambda9 onSendListener;
    public long peer;
    public final ArrayList reactors;
    public final Theme.ResourcesProvider resourcesProvider;
    public final boolean sendEnabled;
    public boolean sending;
    public int sentMessageId;
    public final AnonymousClass1 slider;
    public final ColoredImageSpan[] starRef;
    public final FrameLayout topLayout;
    public final TopSendersView topSendersView;
    public final LinearLayout toptopLayout;

    public final class Particles {
        public final Bitmap b;
        public int bPaintColor;
        public NotificationCompatBuilder batchParticlesBuffer;
        public final Paint batchParticlesPaint;
        public long lastInvalidateTime;
        public long lastTime;
        public final ArrayList particles;
        public final int type;
        public int visibleCount;
        public final RectF bounds = new RectF();
        public final Paint bPaint = new Paint(3);
        public final Rect rect = new Rect();
        public float speed = 1.0f;
        public final float lifetime = 1.0f;
        public boolean firstDraw = true;

        public final class Particle {
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
        }

        public Particles(int i, int i2) {
            this.type = i;
            this.visibleCount = i2;
            this.particles = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.particles.add(new Particle());
            }
            int iDp = AndroidUtilities.dp(10.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iDp, iDp, Bitmap.Config.ARGB_8888);
            this.b = bitmapCreateBitmap;
            Path path = new Path();
            float f = iDp >> 1;
            int i4 = (int) (0.85f * f);
            path.moveTo(0.0f, f);
            float f2 = i4;
            path.lineTo(f2, f2);
            path.lineTo(f, 0.0f);
            float f3 = iDp - i4;
            path.lineTo(f3, f2);
            float f4 = iDp;
            path.lineTo(f4, f);
            path.lineTo(f3, f3);
            path.lineTo(f, f4);
            path.lineTo(f2, f3);
            path.lineTo(0.0f, f);
            path.close();
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColor(Theme.multAlpha(0.75f, -1));
            canvas.drawPath(path, paint);
            if (Build.VERSION.SDK_INT < 29) {
                this.batchParticlesBuffer = null;
                this.batchParticlesPaint = null;
                return;
            }
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(i2);
            this.batchParticlesBuffer = notificationCompatBuilder;
            float width = bitmapCreateBitmap.getWidth();
            float height = bitmapCreateBitmap.getHeight();
            for (int i5 = 0; i5 < notificationCompatBuilder.mGroupAlertBehavior; i5++) {
                NotificationCompatBuilder.bufferVertexSet((float[]) notificationCompatBuilder.mBuilder, i5, 0.0f, 0.0f, width, height);
            }
            this.batchParticlesPaint = BatchParticlesDrawHelper.createBatchParticlesPaint(bitmapCreateBitmap);
        }

        public final void draw(Canvas canvas, int i, float f) {
            if (LiteMode.isEnabled(131072)) {
                int i2 = this.visibleCount;
                ArrayList arrayList = this.particles;
                int iMin = Math.min(i2, arrayList.size());
                if (this.batchParticlesBuffer != null) {
                    Bitmap bitmap = this.b;
                    float width = bitmap.getWidth();
                    float height = bitmap.getHeight();
                    for (int i3 = 0; i3 < iMin; i3++) {
                        Particle particle = (Particle) arrayList.get(i3);
                        float f2 = particle.a * particle.s * f;
                        float f3 = (width / 2.0f) * f2;
                        float f4 = (height / 2.0f) * f2;
                        NotificationCompatBuilder notificationCompatBuilder = this.batchParticlesBuffer;
                        float f5 = particle.x;
                        float f6 = particle.y;
                        NotificationCompatBuilder.bufferVertexSet((float[]) notificationCompatBuilder.mContext, i3, f5 - f3, f6 - f4, f5 + f3, f6 + f4);
                        NotificationCompatBuilder notificationCompatBuilder2 = this.batchParticlesBuffer;
                        int alphaComponent = ColorUtils.setAlphaComponent(i, (int) (Utilities.clamp01(particle.la * f) * 255.0f));
                        int[] iArr = (int[]) notificationCompatBuilder2.mExtras;
                        int i4 = i3 * 4;
                        iArr[i4] = alphaComponent;
                        iArr[i4 + 1] = alphaComponent;
                        iArr[i4 + 2] = alphaComponent;
                        iArr[i4 + 3] = alphaComponent;
                    }
                    NotificationCompatBuilder notificationCompatBuilder3 = this.batchParticlesBuffer;
                    canvas.drawVertices(Canvas.VertexMode.TRIANGLES, iMin * 8, (float[]) notificationCompatBuilder3.mContext, 0, (float[]) notificationCompatBuilder3.mBuilder, 0, (int[]) notificationCompatBuilder3.mExtras, 0, (short[]) notificationCompatBuilder3.mBuilderCompat, 0, iMin * 6, this.batchParticlesPaint);
                } else {
                    if (this.bPaintColor != i) {
                        Paint paint = this.bPaint;
                        this.bPaintColor = i;
                        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                    }
                    for (int i5 = 0; i5 < iMin; i5++) {
                        Particle particle2 = (Particle) arrayList.get(i5);
                        float f7 = particle2.la * f;
                        Particles particles = Particles.this;
                        particles.bPaint.setAlpha((int) (f7 * 255.0f));
                        particles.rect.set((int) (particle2.x - ((((particles.b.getWidth() / 2.0f) * particle2.a) * particle2.s) * f7)), (int) (particle2.y - ((((particles.b.getHeight() / 2.0f) * particle2.a) * particle2.s) * f7)), (int) SurfaceContainer$$ExternalSyntheticOutline0.m((particles.b.getWidth() / 2.0f) * particle2.a, particle2.s, f7, particle2.x), (int) SurfaceContainer$$ExternalSyntheticOutline0.m((particles.b.getHeight() / 2.0f) * particle2.a, particle2.s, f7, particle2.y));
                        canvas.drawBitmap(particles.b, (Rect) null, particles.rect, particles.bPaint);
                    }
                }
                this.firstDraw = false;
            }
        }

        public final void gen(Particle particle, long j, boolean z) {
            particle.start = j;
            long jLerp = (long) (AndroidUtilities.lerp(500, 2500, Utilities.fastRandom.nextFloat()) * this.lifetime);
            particle.lifetime = jLerp;
            if (z) {
                particle.start -= (long) (Utilities.clamp01(Utilities.fastRandom.nextFloat()) * jLerp);
            }
            RectF rectF = this.bounds;
            particle.x = AndroidUtilities.lerp(rectF.left, rectF.right, Utilities.fastRandom.nextFloat());
            particle.y = AndroidUtilities.lerp(rectF.top, rectF.bottom, Utilities.fastRandom.nextFloat());
            if (this.type == 0) {
                particle.vx = AndroidUtilities.dp(AndroidUtilities.lerp(-7.0f, -18.0f, Utilities.fastRandom.nextFloat()));
                particle.vy = AndroidUtilities.dp(AndroidUtilities.lerp(-2.0f, 2.0f, Utilities.fastRandom.nextFloat()));
            } else {
                particle.vx = rectF.centerX() - particle.x;
                particle.vy = rectF.centerY() - particle.y;
                float fDp = AndroidUtilities.dp(AndroidUtilities.lerp(1.0f, 4.0f, Utilities.fastRandom.nextFloat()));
                float f = particle.vx;
                float f2 = particle.vy;
                float fSqrt = fDp / ((float) Math.sqrt((f2 * f2) + (f * f)));
                particle.vx *= fSqrt;
                particle.vy *= fSqrt;
            }
            particle.a = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
            particle.s = AndroidUtilities.lerp(0.8f, 1.2f, Utilities.fastRandom.nextFloat()) * 0.7f;
        }

        public final boolean process() {
            if (LiteMode.isEnabled(131072)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                float fMin = (Math.min(this.lastTime - jCurrentTimeMillis, 16L) / 1000.0f) * this.speed;
                int i = 0;
                while (true) {
                    int i2 = this.visibleCount;
                    ArrayList arrayList = this.particles;
                    if (i >= Math.min(i2, arrayList.size())) {
                        break;
                    }
                    Particle particle = (Particle) arrayList.get(i);
                    long j = particle.lifetime;
                    float f = j <= 0 ? 2.0f : (jCurrentTimeMillis - particle.start) / j;
                    if (f > 1.0f) {
                        gen(particle, jCurrentTimeMillis, this.firstDraw);
                        f = 0.0f;
                    }
                    particle.x = (particle.vx * fMin) + particle.x;
                    particle.y = (particle.vy * fMin) + particle.y;
                    float f2 = 4.0f * f;
                    particle.la = f2 - (f * f2);
                    i++;
                }
                this.lastTime = jCurrentTimeMillis;
                long j2 = this.lastInvalidateTime;
                if (j2 == 0 || j2 - jCurrentTimeMillis >= 66) {
                    this.lastInvalidateTime = jCurrentTimeMillis;
                    return true;
                }
            }
            return false;
        }

        public final void removeParticlesOutside() {
            if (this.type != 2) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.particles;
                if (i >= arrayList.size()) {
                    return;
                }
                Particle particle = (Particle) arrayList.get(i);
                if (!this.bounds.contains((int) particle.x, (int) particle.y)) {
                    gen(particle, jCurrentTimeMillis, this.firstDraw);
                }
                i++;
            }
        }
    }

    public final class SenderData {
        public boolean anonymous;
        public long did;
        public boolean my;
        public long stars;
    }

    public abstract class StarsSlider extends View {
        public float aprogress;
        public final RectF arc;
        public final Drawable counterImage;
        public final AnimatedTextView.AnimatedTextDrawable counterSubText;
        public final AnimatedTextView.AnimatedTextDrawable counterText;
        public long currentTop;
        public boolean drawCounterImage;
        public boolean drawPlus;
        public LinearGradient gradient;
        public ValueAnimator gradientAnimator;
        public int gradientColor1;
        public int gradientColor2;
        public final Matrix gradientMatrix;
        public float lastX;
        public float lastY;
        public final AnimatedFloat overTop;
        public final AnimatedFloat overTopText;
        public final Paint plusPaint;
        public final Path plusPath;
        public int pointerId;
        public long pressTime;
        public float progress;
        public ValueAnimator progressAnimator;
        public final Theme.ResourcesProvider resourcesProvider;
        public final Paint sliderCirclePaint;
        public final RectF sliderCircleRect;
        public final Paint sliderInnerPaint;
        public final Path sliderInnerPath;
        public final RectF sliderInnerRect;
        public final Paint sliderPaint;
        public final Particles sliderParticles;
        public final Path sliderPath;
        public final RectF sliderRect;
        public final ColoredImageSpan[] starRef;
        public int[] stops;
        public final BoolAnimator subTextVisible;
        public final Paint textBackgroundPaint;
        public final Particles textParticles;
        public final Path textPath;
        public final RectF textRect;
        public int toGradientColor1;
        public int toGradientColor2;
        public final Paint topPaint;
        public final Text topText;
        public boolean tracking;

        public StarsSlider(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.sliderInnerPaint = new Paint(1);
            this.sliderPaint = new Paint(1);
            this.plusPaint = new Paint(1);
            this.sliderCirclePaint = new Paint(1);
            this.textBackgroundPaint = new Paint(1);
            this.sliderParticles = new Particles(0, 300);
            this.textParticles = new Particles(2, 30);
            this.gradientColor1 = -1135603;
            this.gradientColor2 = -404714;
            this.toGradientColor1 = -1135603;
            this.toGradientColor2 = -404714;
            this.gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.gradientColor1, this.gradientColor2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
            this.gradientMatrix = new Matrix();
            this.drawCounterImage = true;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
            this.counterText = animatedTextDrawable;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = new AnimatedTextView.AnimatedTextDrawable(false, true, true, false);
            this.counterSubText = animatedTextDrawable2;
            this.starRef = new ColoredImageSpan[1];
            Paint paint = new Paint(1);
            this.topPaint = paint;
            this.topText = new Text(LocaleController.getString(R.string.StarsReactionTop), 14.0f, AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.overTop = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            this.overTopText = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            this.currentTop = -1L;
            this.sliderInnerRect = new RectF();
            this.sliderRect = new RectF();
            this.sliderCircleRect = new RectF();
            this.arc = new RectF();
            this.sliderInnerPath = new Path();
            this.sliderPath = new Path();
            this.plusPath = new Path();
            this.textRect = new RectF();
            this.textPath = new Path();
            this.progress = 0.0f;
            this.subTextVisible = new BoolAnimator(320L, this, cubicBezierInterpolator);
            this.resourcesProvider = resourcesProvider;
            Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
            this.counterImage = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            TextPaint textPaint = animatedTextDrawable.textPaint;
            textPaint.setColor(-1);
            animatedTextDrawable.alpha = Color.alpha(-1);
            textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(21.0f));
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.overrideFullWidth = AndroidUtilities.displaySize.x;
            animatedTextDrawable.gravity = 17;
            animatedTextDrawable2.textPaint.setColor(-570425345);
            animatedTextDrawable2.alpha = Color.alpha(-570425345);
            animatedTextDrawable2.setTextSize(AndroidUtilities.dp(11.0f));
            animatedTextDrawable2.setCallback(this);
            animatedTextDrawable2.overrideFullWidth = AndroidUtilities.displaySize.x;
            animatedTextDrawable2.gravity = 17;
            paint.setColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        }

        public final void animateProgressTo(float f) {
            ValueAnimator valueAnimator = this.progressAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progress, f);
            this.progressAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new QrActivity$$ExternalSyntheticLambda18(this, 17));
            int value = getValue();
            this.progressAnimator.addListener(new WebActionBar.AnonymousClass7(this, f, value));
            this.progressAnimator.setDuration(320L);
            this.progressAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.progressAnimator.start();
            if (getValue(f) != value) {
                onValueChanged(getValue(f));
            }
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counterText;
            ValueAnimator valueAnimator2 = animatedTextDrawable.animator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            animatedTextDrawable.setText(StarsIntroActivity.replaceStars(false, LocaleController.formatNumber(getValue(f), ','), this.starRef), true, true);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float f;
            int i;
            float f2;
            AnimatedFloat animatedFloat;
            Path path;
            float f3;
            Canvas canvas2 = canvas;
            super.dispatchDraw(canvas);
            Matrix matrix = this.gradientMatrix;
            matrix.reset();
            RectF rectF = this.sliderInnerRect;
            matrix.postTranslate(rectF.left, 0.0f);
            matrix.postScale(rectF.width() / 255.0f, 1.0f);
            this.gradient.setLocalMatrix(matrix);
            Paint paint = this.sliderPaint;
            paint.setShader(this.gradient);
            int iBlendARGB = ColorUtils.blendARGB(this.progress, this.gradientColor1, this.gradientColor2);
            Path path2 = this.sliderInnerPath;
            path2.rewind();
            float fDp = AndroidUtilities.dp(12.0f);
            float fDp2 = AndroidUtilities.dp(12.0f);
            Path.Direction direction = Path.Direction.CW;
            path2.addRoundRect(rectF, fDp, fDp2, direction);
            Paint paint2 = this.sliderInnerPaint;
            paint2.setColor(Theme.multAlpha(0.15f, this.gradientColor1));
            canvas2.drawPath(path2, paint2);
            RectF rectF2 = this.sliderRect;
            rectF2.set(rectF);
            float progress = getProgress(getValue());
            rectF2.right = AndroidUtilities.lerp(rectF2.left + AndroidUtilities.dp(24.0f), rectF2.right, progress);
            Path path3 = this.sliderPath;
            path3.rewind();
            path3.addRoundRect(rectF2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), direction);
            Particles particles = this.sliderParticles;
            particles.bounds.set(rectF);
            particles.removeParticlesOutside();
            float f4 = this.progress;
            particles.speed = (f4 * 15.0f) + 1.0f;
            particles.visibleCount = (int) (particles.particles.size() * ((f4 * 0.85f) + 0.15f));
            particles.process();
            canvas2.save();
            canvas2.clipPath(path2);
            particles.draw(canvas2, iBlendARGB, 1.0f);
            long j = this.currentTop;
            Paint paint3 = this.topPaint;
            AnimatedFloat animatedFloat2 = this.overTopText;
            AnimatedFloat animatedFloat3 = this.overTop;
            Text text = this.topText;
            if (j == -1 || getProgress((int) j) >= 1.0f || getProgress((int) this.currentTop) <= 0.0f) {
                f = progress;
                i = iBlendARGB;
                f2 = 0.15f;
                animatedFloat = animatedFloat2;
                path = path3;
            } else {
                float fClamp01 = (Utilities.clamp01(getProgress((int) this.currentTop)) * (rectF.width() - AndroidUtilities.dp(24.0f))) + rectF.left + AndroidUtilities.dp(12.0f);
                float f5 = animatedFloat3.set(Math.abs((rectF2.right - ((float) AndroidUtilities.dp(10.0f))) - fClamp01) < ((float) AndroidUtilities.dp(14.0f)));
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), animatedFloat2.set(Math.abs((rectF2.right - ((float) AndroidUtilities.dp(10.0f))) - fClamp01) < ((float) AndroidUtilities.dp(12.0f))));
                float f6 = (text.width + fClamp01) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > rectF.right ? (fClamp01 - fLerp) - text.width : fLerp + fClamp01;
                paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
                paint3.setColor(Theme.multAlpha(0.6f, iBlendARGB));
                f = progress;
                i = iBlendARGB;
                path = path3;
                f2 = 0.15f;
                animatedFloat = animatedFloat2;
                canvas.drawLine(fClamp01, AndroidUtilities.lerp(rectF.top, rectF.centerY(), f5), fClamp01, AndroidUtilities.lerp(rectF.bottom, rectF.centerY(), f5), paint3);
                this.topText.draw(f6, rectF.centerY(), 0.6f, i, canvas);
                canvas2 = canvas;
            }
            canvas2.drawPath(path, paint);
            canvas2.clipPath(path);
            particles.draw(canvas2, -1, 1.0f);
            long j2 = this.currentTop;
            if (j2 != -1 && getProgress((int) j2) < 1.0f && getProgress((int) this.currentTop) > 0.0f) {
                float fDp3 = rectF.left + AndroidUtilities.dp(12.0f) + (Utilities.clamp01(getProgress((int) this.currentTop)) * (rectF.width() - AndroidUtilities.dp(24.0f)));
                float f7 = animatedFloat3.set(Math.abs((rectF2.right - ((float) AndroidUtilities.dp(10.0f))) - fDp3) < ((float) AndroidUtilities.dp(14.0f)));
                float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), animatedFloat.set(Math.abs((rectF2.right - ((float) AndroidUtilities.dp(10.0f))) - fDp3) < ((float) AndroidUtilities.dp(12.0f))));
                float f8 = (text.width + fDp3) + ((float) (AndroidUtilities.dp(16.0f) * 2)) > rectF.right ? (fDp3 - fLerp2) - text.width : fLerp2 + fDp3;
                paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
                paint3.setColor(Theme.multAlpha(0.4f, Theme.getColor(Theme.key_dialogBackground, this.resourcesProvider)));
                canvas2.drawLine(fDp3, AndroidUtilities.lerp(rectF.top, rectF.centerY(), f7), fDp3, AndroidUtilities.lerp(rectF.bottom, rectF.centerY(), f7), paint3);
                this.topText.draw(f8, rectF.centerY(), 0.75f, -1, canvas);
                canvas2 = canvas;
            }
            canvas2.restore();
            invalidate();
            if (this.drawPlus) {
                float fHeight = rectF.right - (rectF.height() / 2.0f);
                float fCenterY = rectF.centerY();
                Paint paint4 = this.plusPaint;
                paint4.setColor(ColorUtils.blendARGB(0.5f, paint2.getColor(), this.gradientColor2));
                Path path4 = this.plusPath;
                path4.rewind();
                f3 = 0.5f;
                path4.addRoundRect(fHeight - AndroidUtilities.dp(1.0f), fCenterY - AndroidUtilities.dp(6.0f), fHeight + AndroidUtilities.dp(1.0f), fCenterY + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction);
                path4.addRoundRect(fHeight - AndroidUtilities.dp(6.0f), fCenterY - AndroidUtilities.dp(1.0f), fHeight + AndroidUtilities.dp(6.0f), fCenterY + AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), direction);
                canvas2.drawPath(path4, paint4);
            } else {
                f3 = 0.5f;
            }
            RectF rectF3 = this.sliderCircleRect;
            rectF3.set((rectF2.right - AndroidUtilities.dp(16.0f)) - AndroidUtilities.dp(4.0f), rectF2.centerY() - (AndroidUtilities.dp(16.0f) / 2.0f), rectF2.right - AndroidUtilities.dp(4.0f), (AndroidUtilities.dp(16.0f) / 2.0f) + rectF2.centerY());
            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), this.sliderCirclePaint);
            float fDp4 = AndroidUtilities.dp(9.0f) / rectF.width();
            float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.lerp(rectF3.left, rectF3.right, f), AndroidUtilities.lerp(rectF3.left + AndroidUtilities.dp(9.0f), rectF3.right - AndroidUtilities.dp(9.0f), f), Math.min(Utilities.clamp01(f / fDp4), Utilities.clamp01((1.0f - f) / fDp4)));
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counterSubText;
            float currentWidth = animatedTextDrawable.getCurrentWidth() + AndroidUtilities.dp(20.0f);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable2 = this.counterText;
            float fMax = Math.max(currentWidth, animatedTextDrawable2.getCurrentWidth() + AndroidUtilities.dp(50.0f));
            float fDp5 = AndroidUtilities.dp(44.0f);
            float fClamp = Utilities.clamp(fLerp3 - (fMax / 2.0f), (rectF.right - fMax) - AndroidUtilities.dp(4.0f), rectF.left + AndroidUtilities.dp(4.0f));
            RectF rectF4 = this.textRect;
            rectF4.set(fClamp, (rectF.top - AndroidUtilities.dp(21.0f)) - fDp5, fMax + fClamp, rectF.top - AndroidUtilities.dp(21.0f));
            float fHeight2 = rectF4.height();
            float f9 = fHeight2 / 2.0f;
            float fClamp2 = Utilities.clamp(fLerp3, rectF4.right, rectF4.left);
            float fClamp3 = Utilities.clamp(fClamp2 - AndroidUtilities.dp(9.0f), rectF4.right, rectF4.left);
            float fClamp4 = Utilities.clamp(AndroidUtilities.dp(9.0f) + fClamp2, rectF4.right, rectF4.left);
            float fClamp5 = Utilities.clamp(this.progress - this.aprogress, 1.0f, -1.0f) * 60.0f;
            float fDp6 = rectF4.bottom + AndroidUtilities.dp(8.0f);
            Path path5 = this.textPath;
            path5.rewind();
            RectF rectF5 = this.arc;
            float f10 = rectF4.left;
            float f11 = rectF4.top;
            rectF5.set(f10, f11, f10 + fHeight2, f11 + fHeight2);
            path5.arcTo(rectF5, -180.0f, 90.0f);
            float f12 = rectF4.right;
            float f13 = rectF4.top;
            rectF5.set(f12 - fHeight2, f13, f12, f13 + fHeight2);
            path5.arcTo(rectF5, -90.0f, 90.0f);
            float f14 = rectF4.right;
            float f15 = rectF4.bottom;
            rectF5.set(f14 - fHeight2, f15 - fHeight2, f14, f15);
            path5.arcTo(rectF5, 0.0f, (float) Utilities.clamp(((Math.acos(Utilities.clamp01((fClamp4 - rectF5.centerX()) / f9)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d));
            float f16 = 0.7f * fHeight2;
            if (fClamp3 < rectF4.right - f16) {
                path5.lineTo(fClamp4, rectF4.bottom);
                path5.lineTo(fClamp2 + 2.0f, rectF4.bottom + AndroidUtilities.dp(8.0f));
            }
            path5.lineTo(fClamp2, rectF4.bottom + AndroidUtilities.dp(8.0f) + 1.0f);
            if (fClamp4 > rectF4.left + f16) {
                path5.lineTo(fClamp2 - 2.0f, rectF4.bottom + AndroidUtilities.dp(8.0f));
                path5.lineTo(fClamp3, rectF4.bottom);
            }
            float f17 = rectF4.left;
            float f18 = rectF4.bottom;
            rectF5.set(f17, f18 - fHeight2, f17 + fHeight2, f18);
            float fClamp6 = ((float) Utilities.clamp(((Math.acos(Utilities.clamp01((fClamp3 - rectF5.left) / f9)) * 0.8500000238418579d) / 3.141592653589793d) * 180.0d, 90.0d, 0.0d)) + 90.0f;
            path5.arcTo(rectF5, fClamp6, 180.0f - fClamp6);
            path5.lineTo(rectF4.left, rectF4.bottom);
            path5.close();
            RectF rectF6 = AndroidUtilities.rectTmp;
            rectF6.set(rectF4);
            rectF6.inset(-AndroidUtilities.dp(12.0f), -AndroidUtilities.dp(12.0f));
            Particles particles2 = this.textParticles;
            particles2.bounds.set(rectF6);
            particles2.removeParticlesOutside();
            particles2.speed = (this.progress * 15.0f) + 1.0f;
            particles2.process();
            canvas2.save();
            particles2.draw(canvas2, i, 1.0f);
            canvas2.restore();
            canvas2.save();
            canvas2.rotate(fClamp5, fClamp2, fDp6);
            if (Math.abs(this.progress - this.aprogress) > 0.001f) {
                this.aprogress = AndroidUtilities.lerp(this.aprogress, this.progress, 0.1f);
                invalidate();
            }
            this.textBackgroundPaint.setShader(this.gradient);
            canvas2.drawPath(path5, this.textBackgroundPaint);
            canvas2.save();
            canvas2.clipPath(path5);
            canvas2.rotate(-fClamp5, fClamp2, fDp6);
            particles2.draw(canvas2, -1, 1.0f);
            canvas2.restore();
            canvas2.save();
            float f19 = 1.0f - (this.subTextVisible.floatValue * f2);
            canvas2.scale(f19, f19, rectF4.centerX(), rectF4.top - (rectF4.height() * f3));
            this.counterImage.setBounds((int) ((rectF4.centerX() - (animatedTextDrawable2.getCurrentWidth() / 2.0f)) + AndroidUtilities.dp(-12.0f)), (int) (rectF4.centerY() - AndroidUtilities.dp(10.0f)), (int) ((rectF4.centerX() - (animatedTextDrawable2.getCurrentWidth() / 2.0f)) + AndroidUtilities.dp(8.0f)), (int) (rectF4.centerY() + AndroidUtilities.dp(10.0f)));
            if (this.drawCounterImage) {
                this.counterImage.draw(canvas2);
            }
            animatedTextDrawable2.setBounds(rectF4.left + AndroidUtilities.dp(24.0f), rectF4.top, rectF4.right, rectF4.bottom);
            animatedTextDrawable2.draw(canvas2);
            canvas2.restore();
            animatedTextDrawable.setBounds(rectF4.left, rectF4.top + AndroidUtilities.dp(10.0f), rectF4.right, rectF4.bottom + AndroidUtilities.dp(10.0f));
            animatedTextDrawable.alpha = (int) (this.subTextVisible.floatValue * 255.0f);
            animatedTextDrawable.draw(canvas2);
            canvas2.restore();
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.lastX = motionEvent.getX();
                this.lastY = motionEvent.getY();
                this.pointerId = motionEvent.getPointerId(0);
                this.pressTime = System.currentTimeMillis();
                this.tracking = false;
                return true;
            }
            if (motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.pointerId) {
                float x = motionEvent.getX() - this.lastX;
                float y = motionEvent.getY() - this.lastY;
                if (!this.tracking && Math.abs(x) > Math.abs(y * 1.5f) && Math.abs(x) > AndroidUtilities.touchSlop) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.tracking = true;
                    ValueAnimator valueAnimator = this.progressAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                }
                if (this.tracking) {
                    int value = getValue();
                    this.progress = Utilities.clamp01((x / (getWidth() * 1.0f)) + this.progress);
                    if (getValue() != value) {
                        onValueChanged(getValue());
                        AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counterText;
                        animatedTextDrawable.cancelAnimation();
                        animatedTextDrawable.setText(StarsIntroActivity.replaceStars(false, LocaleController.formatNumber(getValue(), ','), this.starRef), true, true);
                    }
                    this.lastX = motionEvent.getX();
                    return true;
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (!this.tracking && motionEvent.getPointerId(0) == this.pointerId && MathUtils.distance(this.lastX, this.lastY, motionEvent.getX(), motionEvent.getY()) < AndroidUtilities.touchSlop && System.currentTimeMillis() - this.pressTime <= ViewConfiguration.getTapTimeout() * 1.5f) {
                    float x2 = motionEvent.getX();
                    motionEvent.getY();
                    if (!onTapCustom(x2)) {
                        float x3 = motionEvent.getX();
                        RectF rectF = this.sliderInnerRect;
                        float fClamp01 = Utilities.clamp01((x3 - rectF.left) / rectF.width());
                        long j = this.currentTop;
                        if (j > 0 && Math.abs(getProgress((int) j) - fClamp01) < 0.035f) {
                            fClamp01 = Utilities.clamp01(getProgress((int) this.currentTop));
                        }
                        animateProgressTo(fClamp01);
                    }
                }
                this.tracking = false;
                return true;
            }
            return true;
        }

        public float getProgress() {
            return this.progress;
        }

        public int getValue() {
            return getValue(this.progress);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(220.0f));
            int measuredWidth = getMeasuredWidth();
            getMeasuredHeight();
            int iDp = AndroidUtilities.dp(14.0f);
            int iDp2 = AndroidUtilities.dp(135.0f);
            this.sliderInnerRect.set(iDp, iDp2, measuredWidth - iDp, AndroidUtilities.dp(24.0f) + iDp2);
            this.sliderPaint.setColor(-1069811);
            this.sliderCirclePaint.setColor(-1);
        }

        public boolean onTapCustom(float f) {
            return false;
        }

        public abstract void onValueChanged(int i);

        public final void setColor(final int i, final int i2, boolean z) {
            if (this.toGradientColor1 == i && this.toGradientColor2 == i2) {
                return;
            }
            ValueAnimator valueAnimator = this.gradientAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.gradientAnimator = null;
            }
            if (!z) {
                this.toGradientColor1 = i;
                this.gradientColor1 = i;
                this.toGradientColor2 = i2;
                this.gradientColor2 = i2;
                this.gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{this.gradientColor1, this.gradientColor2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                invalidate();
                return;
            }
            final int i3 = this.gradientColor1;
            final int i4 = this.gradientColor2;
            this.toGradientColor1 = i;
            this.toGradientColor2 = i2;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.gradientAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new StarsReactionsSheet$StarsSlider$$ExternalSyntheticLambda1(this, i3, i, i4, i2, 0));
            this.gradientAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public final void onAnimationEnd(Animator animator) {
                    int iBlendARGB = ColorUtils.blendARGB(1.0f, i3, i);
                    StarsSlider starsSlider = StarsSlider.this;
                    starsSlider.gradientColor1 = iBlendARGB;
                    starsSlider.gradientColor2 = ColorUtils.blendARGB(1.0f, i4, i2);
                    starsSlider.gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{starsSlider.gradientColor1, starsSlider.gradientColor2}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    starsSlider.invalidate();
                }
            });
            this.gradientAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.gradientAnimator.setDuration(420L);
            this.gradientAnimator.start();
        }

        public final void setCounterSubText(String str) {
            this.subTextVisible.setValue(!TextUtils.isEmpty(str), true);
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counterSubText;
            animatedTextDrawable.cancelAnimation();
            animatedTextDrawable.setText(str, true, true);
        }

        public void setStarsTop(long j) {
            this.currentTop = j;
            invalidate();
        }

        public void setTopText(String str) {
            this.topText.setText(str);
        }

        public void setValue(int i) {
            float progress = getProgress(i);
            this.progress = progress;
            this.aprogress = progress;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counterText;
            animatedTextDrawable.cancelAnimation();
            animatedTextDrawable.setText(StarsIntroActivity.replaceStars(false, LocaleController.formatNumber(getValue(), ','), this.starRef), true, true);
        }

        public void setValueAnimated(int i) {
            if (i == getValue()) {
                return;
            }
            animateProgressTo(getProgress(i));
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.counterText || super.verifyDrawable(drawable);
        }

        public final float getProgress(int i) {
            int i2 = 1;
            while (true) {
                int[] iArr = this.stops;
                if (i2 >= iArr.length) {
                    return 1.0f;
                }
                int i3 = iArr[i2];
                if (i <= i3) {
                    int i4 = i2 - 1;
                    int i5 = iArr[i4];
                    return (i4 + ((i - i5) / (i3 - i5))) / (iArr.length - 1);
                }
                i2++;
            }
        }

        public final int getValue(float f) {
            if (f <= 0.0f) {
                return this.stops[0];
            }
            if (f >= 1.0f) {
                int[] iArr = this.stops;
                return iArr[iArr.length - 1];
            }
            int[] iArr2 = this.stops;
            float length = f * (iArr2.length - 1);
            int i = (int) length;
            float f2 = length - i;
            int i2 = iArr2[i];
            float f3 = i2;
            int i3 = i + 1;
            if (i3 < iArr2.length) {
                i = i3;
            }
            return Math.round((f2 * (iArr2[i] - i2)) + f3);
        }
    }

    public final class TopSendersView extends View {
        public final AnimatedFloat animatedCount;
        public final Paint backgroundPaint;
        public Utilities.Callback clickListener;
        public float count;
        public final boolean liveStories;
        public final ArrayList oldSenders;
        public Sender pressedSender;
        public final ArrayList senders;

        public final class Sender {
            public final AnimatedFloat animatedAnonymous;
            public final AnimatedFloat animatedPosition;
            public final AnimatedFloat animatedScale;
            public boolean anonymous;
            public final AvatarDrawable anonymousAvatarDrawable;
            public final AvatarDrawable avatarDrawable;
            public final ButtonBounce bounce;
            public final RectF clickBounds = new RectF();
            public Drawable crown;
            public Drawable crownOutline;
            public int currentColor;
            public long did;
            public LinearGradient gradient;
            public final Matrix gradientMatrix;
            public final ImageReceiver imageReceiver;
            public int index;
            public final boolean my;
            public final Paint paint;
            public int place;
            public Text placeText;
            public Text starsText;
            public Text text;

            public Sender(boolean z, long j) {
                String forcedFirstName;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                this.animatedPosition = new AnimatedFloat(TopSendersView.this, 0L, 600L, cubicBezierInterpolator);
                this.animatedScale = new AnimatedFloat(TopSendersView.this, 0L, 200L, cubicBezierInterpolator);
                this.animatedAnonymous = new AnimatedFloat(TopSendersView.this, 0L, 350L, cubicBezierInterpolator);
                this.gradient = null;
                this.gradientMatrix = new Matrix();
                this.paint = new Paint(1);
                ImageReceiver imageReceiver = new ImageReceiver(TopSendersView.this);
                this.imageReceiver = imageReceiver;
                AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
                this.avatarDrawable = avatarDrawable;
                AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
                this.anonymousAvatarDrawable = avatarDrawable2;
                this.bounce = new ButtonBounce(TopSendersView.this, 1.0f, 5.0f);
                this.my = z;
                this.did = j;
                StarsReactionsSheet starsReactionsSheet = StarsReactionsSheet.this;
                if (j >= 0) {
                    TLRPC.User user = MessagesController.getInstance(starsReactionsSheet.currentAccount).getUser(Long.valueOf(j));
                    forcedFirstName = UserObject.getForcedFirstName(user);
                    avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                    imageReceiver.setForUserOrChat(user, avatarDrawable);
                } else {
                    TLRPC.Chat chat = MessagesController.getInstance(starsReactionsSheet.currentAccount).getChat(Long.valueOf(-j));
                    forcedFirstName = chat == null ? "" : chat.title;
                    avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                    imageReceiver.setForUserOrChat(chat, avatarDrawable);
                }
                imageReceiver.setRoundRadius(AndroidUtilities.dp(56.0f));
                imageReceiver.onAttachedToWindow();
                imageReceiver.setCrossfadeWithOldImage(true);
                avatarDrawable2.setAvatarType(21);
                int color = Theme.getColor(Theme.key_avatar_backgroundGray, starsReactionsSheet.resourcesProvider);
                avatarDrawable2.hasGradient = false;
                avatarDrawable2.hasAdvancedGradient = false;
                avatarDrawable2.color2 = color;
                avatarDrawable2.color = color;
                avatarDrawable2.needApplyColorAccent = false;
                this.text = new Text(forcedFirstName, 12.0f, null);
            }

            public final void draw(Canvas canvas) {
                float f;
                float f2;
                float f3;
                boolean z = false;
                float f4 = this.animatedPosition.set(this.index, false);
                int i = this.index;
                TopSendersView topSendersView = TopSendersView.this;
                if (i >= 0 && i < topSendersView.senders.size()) {
                    z = true;
                }
                float f5 = this.animatedScale.set(z);
                canvas.save();
                float width = (topSendersView.getWidth() - AndroidUtilities.dp(80.0f)) / Math.max(1.0f, topSendersView.count);
                float fDp = ((topSendersView.count - (f4 + 0.5f)) * width) + AndroidUtilities.dp(40.0f);
                float fDp2 = AndroidUtilities.dp(40.0f);
                float f6 = width / 2.0f;
                this.clickBounds.set(fDp - f6, fDp2 - AndroidUtilities.dp(50.0f), f6 + fDp, AndroidUtilities.dp(50.0f) + fDp2);
                float f7 = (0.3f * f5) + 0.7f;
                canvas.scale(f7, f7, fDp, fDp2);
                float scale = this.bounce.getScale(0.04f);
                canvas.scale(scale, scale, fDp, fDp2);
                if (f5 > 0.0f) {
                    float f8 = this.animatedAnonymous.set(this.anonymous);
                    if (f8 < 1.0f) {
                        ImageReceiver imageReceiver = this.imageReceiver;
                        f = 255.0f;
                        f2 = 40.0f;
                        f3 = 2.0f;
                        imageReceiver.setImageCoords(fDp - (AndroidUtilities.dp(56.0f) / 2.0f), fDp2 - (AndroidUtilities.dp(56.0f) / 2.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                        imageReceiver.setAlpha(f5);
                        imageReceiver.draw(canvas);
                        imageReceiver.setAlpha(1.0f);
                    } else {
                        f = 255.0f;
                        f2 = 40.0f;
                        f3 = 2.0f;
                    }
                    if (f8 > 0.0f) {
                        AvatarDrawable avatarDrawable = this.anonymousAvatarDrawable;
                        int i2 = (int) fDp;
                        int i3 = (int) fDp2;
                        avatarDrawable.setBounds(i2 - (AndroidUtilities.dp(56.0f) / 2), i3 - (AndroidUtilities.dp(56.0f) / 2), (AndroidUtilities.dp(56.0f) / 2) + i2, (AndroidUtilities.dp(56.0f) / 2) + i3);
                        avatarDrawable.alpha = (int) (f5 * f * f8);
                        avatarDrawable.draw(canvas);
                        avatarDrawable.alpha = 255;
                    }
                } else {
                    f = 255.0f;
                    f2 = 40.0f;
                    f3 = 2.0f;
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set((fDp - (this.starsText.width / f3)) - AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(23.0f) + fDp2) - (AndroidUtilities.dp(16.0f) / f3), (this.starsText.width / f3) + fDp + AndroidUtilities.dp(5.66f), (AndroidUtilities.dp(16.0f) / f3) + AndroidUtilities.dp(23.0f) + fDp2);
                canvas.drawRoundRect(rectF, rectF.height() / f3, rectF.height() / f3, topSendersView.backgroundPaint);
                Paint paint = this.paint;
                int i4 = (int) (f5 * f);
                paint.setAlpha(i4);
                if (this.gradient != null) {
                    Matrix matrix = this.gradientMatrix;
                    matrix.reset();
                    matrix.postTranslate(0.0f, rectF.top);
                    this.gradient.setLocalMatrix(matrix);
                }
                canvas.drawRoundRect(rectF, rectF.height() / f3, rectF.height() / f3, paint);
                Text text = this.starsText;
                text.draw(fDp - (text.width / f3), AndroidUtilities.dp(23.0f) + fDp2, f5, -1, canvas);
                Text text2 = this.text;
                text2.ellipsizeWidth = width - AndroidUtilities.dp(4.0f);
                text2.draw(fDp - (this.text.getWidth() / f3), AndroidUtilities.dp(42.0f) + fDp2, f5, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, StarsReactionsSheet.this.resourcesProvider), canvas);
                if (this.place > 0) {
                    int i5 = (int) fDp;
                    int i6 = (int) fDp2;
                    this.crownOutline.setBounds(i5 - AndroidUtilities.dp(12.0f), i6 - AndroidUtilities.dp(f2), AndroidUtilities.dp(12.0f) + i5, i6 - AndroidUtilities.dp(16.0f));
                    this.crown.setBounds(i5 - AndroidUtilities.dp(12.0f), i6 - AndroidUtilities.dp(f2), AndroidUtilities.dp(12.0f) + i5, i6 - AndroidUtilities.dp(16.0f));
                    this.crownOutline.setAlpha(i4);
                    this.crown.setAlpha(i4);
                    this.crownOutline.draw(canvas);
                    this.crown.draw(canvas);
                    Text text3 = this.placeText;
                    text3.draw(fDp - (text3.width / f3), fDp2 - AndroidUtilities.dp(27.0f), f5, -1, canvas);
                }
                canvas.restore();
            }

            public final void setPrivacy(long j) {
                long j2;
                String forcedFirstName;
                String string;
                if (this.my) {
                    boolean z = this.anonymous;
                    TopSendersView topSendersView = TopSendersView.this;
                    StarsReactionsSheet starsReactionsSheet = StarsReactionsSheet.this;
                    if (z) {
                        j2 = 2666000;
                    } else {
                        j2 = this.did == UserConfig.getInstance(starsReactionsSheet.currentAccount).getClientUserId() ? 0L : this.did;
                    }
                    if (j2 != j) {
                        this.anonymous = j == 2666000;
                        if (j == 0 || j == 2666000) {
                            j = UserConfig.getInstance(starsReactionsSheet.currentAccount).getClientUserId();
                        }
                        this.did = j;
                        if (this.anonymous) {
                            string = LocaleController.getString(R.string.StarsReactionAnonymous);
                        } else {
                            ImageReceiver imageReceiver = this.imageReceiver;
                            AvatarDrawable avatarDrawable = this.avatarDrawable;
                            if (j >= 0) {
                                TLRPC.User user = MessagesController.getInstance(starsReactionsSheet.currentAccount).getUser(Long.valueOf(this.did));
                                forcedFirstName = UserObject.getForcedFirstName(user);
                                avatarDrawable.setInfo(UserConfig.selectedAccount, user);
                                imageReceiver.setForUserOrChat(user, avatarDrawable);
                            } else {
                                TLRPC.Chat chat = MessagesController.getInstance(starsReactionsSheet.currentAccount).getChat(Long.valueOf(-this.did));
                                forcedFirstName = chat == null ? "" : chat.title;
                                avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
                                imageReceiver.setForUserOrChat(chat, avatarDrawable);
                            }
                            string = forcedFirstName;
                        }
                        this.text = new Text(string, 12.0f, null);
                        topSendersView.invalidate();
                    }
                }
            }
        }

        public TopSendersView(Context context, boolean z) {
            super(context);
            this.senders = new ArrayList();
            this.oldSenders = new ArrayList();
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            this.animatedCount = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.liveStories = z;
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
            paint.setColor(Theme.getColor(Theme.key_dialogBackground, StarsReactionsSheet.this.resourcesProvider));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            ArrayList arrayList = this.senders;
            this.count = this.animatedCount.set(arrayList.size(), false);
            int i = 0;
            while (true) {
                ArrayList arrayList2 = this.oldSenders;
                if (i >= arrayList2.size()) {
                    break;
                }
                ((Sender) arrayList2.get(i)).draw(canvas);
                i++;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((Sender) arrayList.get(i2)).draw(canvas);
            }
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.senders;
                if (i >= arrayList.size()) {
                    return;
                }
                ((Sender) arrayList.get(i)).imageReceiver.onAttachedToWindow();
                i++;
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.senders;
                if (i >= arrayList.size()) {
                    return;
                }
                ((Sender) arrayList.get(i)).imageReceiver.onDetachedFromWindow();
                i++;
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            Sender sender;
            Utilities.Callback callback;
            if (motionEvent.getAction() == 0) {
                Sender sender2 = this.pressedSender;
                if (sender2 != null) {
                    sender2.bounce.setPressed(false);
                }
                this.pressedSender = null;
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.senders;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    if (((Sender) arrayList.get(i)).clickBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.pressedSender = (Sender) arrayList.get(i);
                        break;
                    }
                    i++;
                }
                Sender sender3 = this.pressedSender;
                if (sender3 != null) {
                    sender3.bounce.setPressed(true);
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (motionEvent.getAction() == 1 && (sender = this.pressedSender) != null && !sender.anonymous && sender.clickBounds.contains(motionEvent.getX(), motionEvent.getY()) && (callback = this.clickListener) != null) {
                    callback.run(Long.valueOf(this.pressedSender.did));
                }
                Sender sender4 = this.pressedSender;
                if (sender4 != null) {
                    sender4.bounce.setPressed(false);
                }
                this.pressedSender = null;
            }
            return this.pressedSender != null;
        }

        public void setMyPrivacy(long j) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.senders;
                if (i >= arrayList.size()) {
                    return;
                }
                Sender sender = (Sender) arrayList.get(i);
                if (sender.my) {
                    sender.setPrivacy(j);
                    return;
                }
                i++;
            }
        }

        public void setOnSenderClickListener(Utilities.Callback<Long> callback) {
            this.clickListener = callback;
        }

        public void setSenders(ArrayList<SenderData> arrayList) {
            ArrayList arrayList2;
            ?? r8;
            ?? r9;
            ?? r7;
            Object obj;
            ?? r3 = 1;
            int i = 0;
            while (true) {
                arrayList2 = this.senders;
                int size = arrayList2.size();
                r8 = this.oldSenders;
                r9 = 0;
                SenderData senderData = null;
                if (i >= size) {
                    break;
                }
                Sender sender = (Sender) arrayList2.get(i);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    SenderData senderData2 = arrayList.get(i2);
                    boolean z = senderData2.my;
                    if ((z && sender.my) || (!sender.my && !z && senderData2.did == sender.did)) {
                        senderData = arrayList.get(i2);
                        break;
                    }
                }
                if (senderData == null) {
                    sender.imageReceiver.onDetachedFromWindow();
                    arrayList2.remove(i);
                    i--;
                    sender.index = -1;
                    r8.add(sender);
                }
                i++;
            }
            int i3 = 0;
            while (i3 < arrayList.size()) {
                SenderData senderData3 = arrayList.get(i3);
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList2.size()) {
                        r7 = r9;
                        break;
                    }
                    Sender sender2 = (Sender) arrayList2.get(i4);
                    boolean z2 = sender2.my;
                    if ((z2 && senderData3.my) || (!z2 && !senderData3.my && sender2.did == senderData3.did)) {
                        r7 = (Sender) arrayList2.get(i4);
                        break;
                    }
                    i4 += r3;
                }
                if (r7 == 0) {
                    for (int i5 = 0; i5 < r8.size(); i5 += r3) {
                        Sender sender3 = (Sender) r8.get(i5);
                        boolean z3 = sender3.my;
                        if ((z3 && senderData3.my) || (!z3 && !senderData3.my && sender3.did == senderData3.did)) {
                            r7 = (Sender) r8.get(i5);
                            break;
                        }
                    }
                    if (r7 != 0) {
                        r8.remove(r7);
                        r7.imageReceiver.onAttachedToWindow();
                        arrayList2.add(r7);
                    }
                }
                ?? r10 = r7;
                if (r7 == 0) {
                    Sender sender4 = new Sender(senderData3.my, senderData3.did);
                    sender4.animatedScale.set(0.0f, r3);
                    arrayList2.add(sender4);
                    sender4.animatedPosition.set((arrayList.size() - r3) - i3, r3);
                    r10 = sender4;
                }
                r10.index = (arrayList.size() - r3) - i3;
                long j = senderData3.stars;
                r10.starsText = new Text(StarsIntroActivity.replaceStars(BillingController$$ExternalSyntheticOutline0.m(j, ',', new StringBuilder("⭐️")), 0.85f, (ColoredImageSpan[]) r9), 12.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                TopSendersView topSendersView = TopSendersView.this;
                ?? r13 = r10.paint;
                StarsReactionsSheet starsReactionsSheet = StarsReactionsSheet.this;
                if (topSendersView.liveStories) {
                    int i6 = (int) j;
                    r10.gradient = new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), new int[]{HighlightMessageSheet.getTierOption(starsReactionsSheet.currentAccount, i6, 4), HighlightMessageSheet.getTierOption(starsReactionsSheet.currentAccount, i6, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    r10.currentColor = ColorUtils.blendARGB(0.5f, HighlightMessageSheet.getTierOption(starsReactionsSheet.currentAccount, i6, 4), HighlightMessageSheet.getTierOption(starsReactionsSheet.currentAccount, i6, 3));
                    r13.setShader(r10.gradient);
                } else {
                    r13.setShader(r9);
                    r10.currentColor = -1002750;
                    r13.setColor(-1002750);
                }
                Drawable drawable = r10.crown;
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(r10.currentColor, PorterDuff.Mode.SRC_IN));
                }
                if (this.liveStories) {
                    int i7 = i3 + 1;
                    r10.place = i7;
                    r10.placeText = new Text(DiffUtil.m(i7, ""), 10.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                    if (i7 > 0 && r10.crown == null) {
                        Drawable drawableMutate = topSendersView.getContext().getResources().getDrawable(R.drawable.filled_stream_crown).mutate();
                        r10.crown = drawableMutate;
                        int i8 = r10.currentColor;
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                        drawableMutate.setColorFilter(new PorterDuffColorFilter(i8, mode));
                        Drawable drawableMutate2 = topSendersView.getContext().getResources().getDrawable(R.drawable.filled_stream_crown_outline).mutate();
                        r10.crownOutline = drawableMutate2;
                        drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogBackground, starsReactionsSheet.resourcesProvider), mode));
                    }
                }
                if (senderData3.my) {
                    r10.setPrivacy(StarsReactionsSheet.this.peer);
                } else {
                    boolean z4 = senderData3.anonymous;
                    if (!r10.my && r10.anonymous != z4) {
                        r10.anonymous = z4;
                        obj = null;
                        r10.text = new Text(z4 ? LocaleController.getString(R.string.StarsReactionAnonymous) : DialogObject.getShortName(r10.did), 12.0f, null);
                        topSendersView.invalidate();
                    }
                    i3++;
                    r9 = obj;
                    r3 = 1;
                }
                obj = null;
                i3++;
                r9 = obj;
                r3 = 1;
            }
            invalidate();
        }
    }

    public StarsReactionsSheet(Context context, final int i, final long j, ChatActivity chatActivity, MessageObject messageObject, ArrayList arrayList, boolean z, final boolean z2, long j2, final Theme.ResourcesProvider resourcesProvider) {
        TLRPC.MessageReactor messageReactor;
        ArrayList arrayList2;
        boolean z3;
        String string;
        Context context2;
        long j3;
        super(context, resourcesProvider, false, false);
        int i2 = 9;
        this.starRef = new ColoredImageSpan[1];
        this.checkedVisiblity = false;
        this.resourcesProvider = resourcesProvider;
        this.currentAccount = i;
        this.messageObject = messageObject;
        this.reactors = arrayList;
        this.liveStories = z2;
        this.sendEnabled = z;
        BalanceCloud balanceCloud = new BalanceCloud(context, i, AmountUtils$Currency.STARS, resourcesProvider);
        this.balanceCloud = balanceCloud;
        balanceCloud.setScaleX(0.6f);
        balanceCloud.setScaleY(0.6f);
        balanceCloud.setAlpha(0.0f);
        this.container.addView(balanceCloud, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        ScaleStateListAnimator.apply(balanceCloud, 0.1f, 1.5f);
        balanceCloud.setOnClickListener(new StakedDiceSheet$$ExternalSyntheticLambda3(context, 2, resourcesProvider));
        long clientUserId = UserConfig.getInstance(i).getClientUserId();
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            TLRPC.MessageReactor messageReactor2 = null;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TLRPC.MessageReactor messageReactor3 = (TLRPC.MessageReactor) obj;
                long peerDialogId = DialogObject.getPeerDialogId(messageReactor3.peer_id);
                if (messageReactor3.anonymous && messageReactor3.my) {
                    peerDialogId = clientUserId;
                }
                if (messageReactor3.my || peerDialogId == clientUserId) {
                    messageReactor2 = messageReactor3;
                }
            }
            messageReactor = messageReactor2;
        } else {
            messageReactor = null;
        }
        boolean z4 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z2) {
            if (arrayList != null) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (((TLRPC.MessageReactor) arrayList.get(i4)).my) {
                        break;
                    }
                }
            }
            this.peer = j2;
        } else {
            this.peer = StarsController.getInstance(i, false).getPaidReactionsDialogId(messageObject);
        }
        long j4 = this.peer;
        this.lastSelectedPeer = j4 == 2666000 ? clientUserId : j4;
        fixNavigationBar(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
        LinearLayout linearLayout = new LinearLayout(context);
        this.layout = linearLayout;
        linearLayout.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        this.topLayout = frameLayout;
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
        this.slider = new StarsSlider(context, resourcesProvider) {
            @Override
            public final void onValueChanged(int i5) {
                long j5 = i5;
                StarsReactionsSheet starsReactionsSheet = StarsReactionsSheet.this;
                starsReactionsSheet.updateSenders(j5);
                ButtonWithCounterView buttonWithCounterView = starsReactionsSheet.buttonView;
                if (buttonWithCounterView != null) {
                    buttonWithCounterView.setText(StarsIntroActivity.replaceStars(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(j5, ',')), starsReactionsSheet.starRef), true, true);
                }
                if (z2) {
                    LiveCommentsView.Message message = starsReactionsSheet.commentMessage;
                    message.stars = j5;
                    starsReactionsSheet.commentView.set(message);
                    int i6 = i;
                    setColor(HighlightMessageSheet.getTierOption(i6, i5, 3), HighlightMessageSheet.getTierOption(i6, i5, 4), true);
                }
            }

            @Override
            public final void setValue(int i5) {
                super.setValue(i5);
                if (z2) {
                    int i6 = i;
                    setColor(HighlightMessageSheet.getTierOption(i6, i5, 3), HighlightMessageSheet.getTierOption(i6, i5, 4), true);
                }
            }
        };
        int[] iArr = {1, 50, 100, 500, 1000, 2000, 5000, 7500, 10000};
        long j5 = MessagesController.getInstance(i).starsPaidReactionAmountMax;
        ArrayList arrayList3 = new ArrayList();
        int i5 = 0;
        while (true) {
            if (i5 >= i2) {
                arrayList2 = arrayList3;
                break;
            }
            int i6 = iArr[i5];
            ArrayList arrayList4 = arrayList3;
            if (i6 > j5) {
                arrayList2 = arrayList4;
                arrayList2.add(Integer.valueOf((int) j5));
                break;
            }
            arrayList2 = arrayList4;
            arrayList2.add(Integer.valueOf(i6));
            int i7 = i5;
            if (iArr[i5] == j5) {
                break;
            }
            i5 = i7 + 1;
            arrayList3 = arrayList2;
            i2 = 9;
        }
        int[] iArr2 = new int[arrayList2.size()];
        for (int i8 = 0; i8 < arrayList2.size(); i8++) {
            iArr2[i8] = ((Integer) arrayList2.get(i8)).intValue();
        }
        AnonymousClass1 anonymousClass1 = this.slider;
        anonymousClass1.stops = iArr2;
        if (z || z2) {
            if (!z) {
                anonymousClass1.setAlpha(0.5f);
            }
            this.topLayout.addView(this.slider, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, z2 ? -50.0f : 0.0f, 0.0f, (!z2 || z4) ? 0.0f : -40.0f));
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.toptopLayout = linearLayout2;
        linearLayout2.setOrientation(0);
        if (!z2) {
            this.topLayout.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.dialogSelectorLayout = frameLayout2;
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.dialogSelectorInnerLayout = frameLayout3;
        frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), Theme.getColor(Theme.key_dialogBackgroundGray, resourcesProvider)));
        BackupImageView backupImageView = new BackupImageView(context);
        this.dialogImageView = backupImageView;
        backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
        backupImageView.getImageReceiver().setCrossfadeWithOldImage(true);
        updatePeerDialog();
        frameLayout3.addView(backupImageView, LayoutHelper.createFrame(28, 28, 115));
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int color = Theme.getColor(Theme.key_dialogTextGray3, resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
        imageView.setImageResource(R.drawable.arrows_select);
        frameLayout3.addView(imageView, LayoutHelper.createFrame(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
        frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(52, 28, 17));
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
        linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-2, -1, 0.0f, 115, 6, 4, 6, 0));
        ScaleStateListAnimator.apply(frameLayout2, 0.1f, 1.5f);
        BotStarsController.getInstance(i).loadAdminedChannels();
        ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 22);
        int i9 = Theme.key_windowBackgroundWhiteBlackText;
        anonymousClass9.setTextColor(Theme.getColor(i9, resourcesProvider));
        anonymousClass9.setTextSize(1, 20.0f);
        anonymousClass9.setGravity(17);
        anonymousClass9.setText(LocaleController.getString(R.string.StarsReactionTitle2));
        anonymousClass9.setTypeface(AndroidUtilities.bold());
        anonymousClass9.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout2.addView(anonymousClass9, LayoutHelper.createLinear(-1, -2, 1.0f, 119, 2, 0, 2, 0));
        updateCanSwitchPeer(false);
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.ic_close_white);
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogEmptyImage, resourcesProvider), mode));
        ScaleStateListAnimator.apply(imageView2, 0.1f, 1.5f);
        final int i10 = 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final StarsReactionsSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f$0.lambda$new$1$17(view);
                        break;
                    default:
                        StarsReactionsSheet starsReactionsSheet = this.f$0;
                        CheckBox2 checkBox2 = starsReactionsSheet.checkBox;
                        CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
                        checkBoxBase.setChecked(-1, !checkBoxBase.isChecked, true);
                        starsReactionsSheet.peer = checkBox2.checkBoxBase.isChecked ? starsReactionsSheet.lastSelectedPeer : 2666000L;
                        starsReactionsSheet.updatePeerDialog();
                        StarsReactionsSheet.TopSendersView topSendersView = starsReactionsSheet.topSendersView;
                        if (topSendersView != null) {
                            topSendersView.setMyPrivacy(starsReactionsSheet.peer);
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, LayoutHelper.createLinear(48, 48, 0.0f, 53, 0, 6, 6, 0));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(1);
        this.topLayout.addView(linearLayout3, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, z2 ? 0.0f : z ? 179.0f : 45.0f, 0.0f, 15.0f));
        TLRPC.Chat chat = MessagesController.getInstance(i).getChat(Long.valueOf(-j));
        TextView textView = new TextView(context);
        OKLCH.m(i9, resourcesProvider, textView, 14.0f);
        textView.setGravity(17);
        textView.setSingleLine(false);
        textView.setMaxLines(3);
        if (messageReactor != null) {
            string = LocaleController.formatPluralStringComma("StarsReactionTextSent", messageReactor.count);
            z3 = false;
        } else {
            z3 = false;
            string = LocaleController.formatString(R.string.StarsReactionText, chat == null ? "" : chat.title);
        }
        textView.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(string), textView.getPaint().getFontMetricsInt(), z3));
        if (z && !z2) {
            linearLayout3.addView(textView, LayoutHelper.createLinear(-1, -2, 55, 40, 0, 40, 0));
        }
        if (z4 != 0) {
            if (!z2) {
                linearLayout3.addView(new View(context) {
                    public final LinearGradient gradient = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{-1135603, -404714}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    public final Matrix gradientMatrix = new Matrix();
                    public final Paint backgroundPaint = new Paint(1);
                    public final Paint separatorPaint = new Paint(1);
                    public final Text text = new Text(LocaleController.getString(R.string.StarsReactionTopSenders), 14.16f, AndroidUtilities.bold());

                    @Override
                    public final void dispatchDraw(Canvas canvas) {
                        Matrix matrix = this.gradientMatrix;
                        matrix.reset();
                        matrix.postTranslate(AndroidUtilities.dp(14.0f), 0.0f);
                        matrix.postScale((getWidth() - AndroidUtilities.dp(28.0f)) / 255.0f, 1.0f);
                        LinearGradient linearGradient = this.gradient;
                        linearGradient.setLocalMatrix(matrix);
                        Paint paint = this.backgroundPaint;
                        paint.setShader(linearGradient);
                        Text text = this.text;
                        float fDp = text.width + AndroidUtilities.dp(30.0f);
                        Paint paint2 = this.separatorPaint;
                        paint2.setColor(Theme.getColor(Theme.key_divider, resourcesProvider));
                        canvas.drawRect(AndroidUtilities.dp(24.0f), (getHeight() / 2.0f) - 1.0f, ((getWidth() - fDp) / 2.0f) - AndroidUtilities.dp(8.0f), getHeight() / 2.0f, paint2);
                        canvas.drawRect(AndroidUtilities.dp(8.0f) + ((getWidth() + fDp) / 2.0f), (getHeight() / 2.0f) - 1.0f, getWidth() - AndroidUtilities.dp(24.0f), getHeight() / 2.0f, paint2);
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set((getWidth() - fDp) / 2.0f, 0.0f, (getWidth() + fDp) / 2.0f, getHeight());
                        canvas.drawRoundRect(rectF, getHeight() / 2.0f, getHeight() / 2.0f, paint);
                        this.text.draw((getWidth() - text.width) / 2.0f, getHeight() / 2.0f, 1.0f, -1, canvas);
                    }
                }, LayoutHelper.createLinear(-1, 30, 55, 0, 20, 0, 0));
            }
            TopSendersView topSendersView = new TopSendersView(context, z2);
            this.topSendersView = topSendersView;
            topSendersView.setOnSenderClickListener(new Utilities.Callback() {
                @Override
                public final void run(Object obj2) {
                    Long l = (Long) obj2;
                    final StarsReactionsSheet starsReactionsSheet = this.f$0;
                    starsReactionsSheet.getClass();
                    BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment == null) {
                        return;
                    }
                    long jLongValue = l.longValue();
                    final boolean z5 = z2;
                    if (jLongValue >= 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", l.longValue());
                        if (l.longValue() == UserConfig.getInstance(i).getClientUserId()) {
                            bundle.putBoolean("my_profile", true);
                        }
                        safeLastFragment.presentFragment(new ProfileActivity(bundle) {
                            @Override
                            public final void onFragmentDestroy() {
                                super.onFragmentDestroy();
                                if (z5) {
                                    return;
                                }
                                StarsReactionsSheet.this.show();
                            }
                        });
                        starsReactionsSheet.lambda$showGiftOfferSheet$15();
                    } else {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", -l.longValue());
                        safeLastFragment.presentFragment(new ChatActivity(bundle2) {
                            @Override
                            public final void onFragmentDestroy() {
                                super.onFragmentDestroy();
                                if (z5) {
                                    return;
                                }
                                StarsReactionsSheet.this.show();
                            }
                        });
                    }
                    starsReactionsSheet.lambda$showGiftOfferSheet$15();
                }
            });
            this.layout.addView(topSendersView, LayoutHelper.createLinear(0.0f, z2 ? -50.0f : 0.0f, 0.0f, 0.0f, -1, 110));
            View view = new View(context);
            view.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
            if (!z2 && (z || messageReactor != null)) {
                this.layout.addView(view, LayoutHelper.createLinear(-1, 7, 24, 0, 24, 1.0f / AndroidUtilities.density, 0));
            }
        } else {
            this.topSendersView = null;
        }
        if (z2) {
            int i11 = Theme.key_dialogTextBlack;
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i11, true, resourcesProvider);
            textViewMakeTextView.setGravity(17);
            textViewMakeTextView.setText(LocaleController.getString(z ? R.string.LiveStoryReactTitle : R.string.LiveStoryReactAdminTitle));
            this.layout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 7, 32, 6, 32, 9));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i11, false, resourcesProvider);
            textViewMakeTextView2.setGravity(17);
            zzko.m(z ? R.string.LiveStoryReactText : z4 ? R.string.LiveStoryReactAdminText : R.string.LiveStoryReactAdminEmptyText, new Object[]{DialogObject.getName(j)}, textViewMakeTextView2);
            this.layout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 7, 32, 0, 32, 20));
        }
        if (z2) {
            LiveCommentsView.Message message = new LiveCommentsView.Message();
            this.commentMessage = message;
            message.dialogId = this.peer;
            message.stars = 50L;
            message.isReaction = true;
            LiveCommentsView.LiveCommentView liveCommentView = new LiveCommentsView.LiveCommentView(i, context, true);
            this.commentView = liveCommentView;
            liveCommentView.set(message);
            this.layout.addView(liveCommentView, LayoutHelper.createLinear(-2, -2, 17, 32, 0, 32, 20));
        }
        CheckBox2 checkBox2 = new CheckBox2(context, 21, resourcesProvider);
        this.checkBox = checkBox2;
        int i12 = Theme.key_radioBackgroundChecked;
        int i13 = Theme.key_checkboxDisabled;
        int i14 = Theme.key_checkboxCheck;
        CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
        checkBoxBase.setColor(i12, i13, i14);
        checkBox2.setDrawUnchecked(true);
        checkBoxBase.setChecked(-1, this.peer != 2666000, false);
        TopSendersView topSendersView2 = this.topSendersView;
        if (topSendersView2 != null) {
            topSendersView2.setMyPrivacy(this.peer);
        }
        checkBox2.setDrawBackgroundAsArc(10);
        TextView textView2 = new TextView(context);
        OKLCH.m(i9, resourcesProvider, textView2, 14.0f);
        textView2.setText(LocaleController.getString(R.string.StarsReactionShowMeInTopSenders));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout4.addView(checkBox2, LayoutHelper.createLinear(21, 21, 16, 0, 0, 9, 0));
        linearLayout4.addView(textView2, LayoutHelper.createLinear(-2, -2, 16));
        final int i15 = 1;
        linearLayout4.setOnClickListener(new View.OnClickListener(this) {
            public final StarsReactionsSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        this.f$0.lambda$new$1$17(view2);
                        break;
                    default:
                        StarsReactionsSheet starsReactionsSheet = this.f$0;
                        CheckBox2 checkBox3 = starsReactionsSheet.checkBox;
                        CheckBoxBase checkBoxBase2 = checkBox3.checkBoxBase;
                        checkBoxBase2.setChecked(-1, !checkBoxBase2.isChecked, true);
                        starsReactionsSheet.peer = checkBox3.checkBoxBase.isChecked ? starsReactionsSheet.lastSelectedPeer : 2666000L;
                        starsReactionsSheet.updatePeerDialog();
                        StarsReactionsSheet.TopSendersView topSendersView3 = starsReactionsSheet.topSendersView;
                        if (topSendersView3 != null) {
                            topSendersView3.setMyPrivacy(starsReactionsSheet.peer);
                        }
                        break;
                }
            }
        });
        ScaleStateListAnimator.apply(linearLayout4, 0.05f, 1.2f);
        linearLayout4.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 6, 6));
        if (!z2 && (z || messageReactor != null)) {
            this.layout.addView(linearLayout4, LayoutHelper.createLinear(-2, -2, 1, 0, z4 != 0 ? 10 : 4, 0, 10));
        }
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        this.buttonView = buttonWithCounterView;
        buttonWithCounterView.setRoundRadius(24);
        if (z || z2) {
            if (!z) {
                buttonWithCounterView.setAlpha(0.5f);
                buttonWithCounterView.setEnabled(false);
            }
            this.layout.addView(buttonWithCounterView, LayoutHelper.createLinear(14.0f, 0.0f, 14.0f, 0.0f, -1, 48));
        }
        updateSenders(0L);
        buttonWithCounterView.setText(StarsIntroActivity.replaceStars(false, LocaleController.formatString(R.string.StarsReactionSend, LocaleController.formatNumber(50L, ',')), this.starRef), true, true);
        if (z) {
            j3 = 0;
            context2 = context;
            buttonWithCounterView.setOnClickListener(new StarsIntroActivity$$ExternalSyntheticLambda63(this, messageObject, chatActivity, i, z2, context, resourcesProvider, j, chat));
        } else {
            context2 = context;
            j3 = 0;
        }
        frameLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$new$9(i, resourcesProvider, j, z2);
            }
        });
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context2, resourcesProvider);
        linksTextView.setTextSize(1, 13.0f);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
        if (!z2 || z) {
            linksTextView.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsReactionTerms), new OAuthSheet$$ExternalSyntheticLambda0(context2, 18)));
        } else {
            linksTextView.setText(LocaleController.getString(R.string.LiveStoryReactAdminCant));
        }
        linksTextView.setGravity(17);
        linksTextView.setLinkTextColor(getThemedColor(Theme.key_dialogTextLink));
        if (z || z2) {
            this.layout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 17, 14, 8, 14, 12));
        }
        setCustomView(this.layout);
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(context2, 1, 2, 0);
        this.icon3dView = anonymousClass6;
        GLIconRenderer gLIconRenderer = anonymousClass6.mRenderer;
        gLIconRenderer.colorKey1 = Theme.key_starsGradient1;
        gLIconRenderer.colorKey2 = Theme.key_starsGradient2;
        gLIconRenderer.updateColors();
        anonymousClass6.mRenderer.white = 1.0f;
        anonymousClass6.setVisibility(4);
        anonymousClass6.setPaused(true);
        this.container.addView(anonymousClass6, LayoutHelper.createFrame(150.0f, 150));
        setValue(50);
        if (arrayList != null) {
            long j6 = j3;
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                long j7 = ((TLRPC.MessageReactor) arrayList.get(i16)).count;
                if (j7 > j6) {
                    j6 = j7;
                }
            }
            j6 = messageReactor != null ? j6 - ((long) messageReactor.count) : j6;
            if (j6 > j3) {
                setStarsTop(j6 + 1);
            }
        }
    }

    public final void animate3dIcon(final StarsReactionsSheet$$ExternalSyntheticLambda13 starsReactionsSheet$$ExternalSyntheticLambda13) {
        View view;
        ReactionsLayoutInBubble reactionsLayoutInBubble;
        ReactionsLayoutInBubble.ReactionButton reactionButton;
        PeerStoriesView.AnonymousClass10 anonymousClass10;
        LiveCommentsView.LiveCommentView liveCommentView;
        LiveCommentsView.Message message;
        View view2;
        ReactionsLayoutInBubble reactionsLayoutInBubble2;
        ReactionsLayoutInBubble.ReactionButton reactionButton2;
        MessageObject messageObject;
        int i = 2;
        LiveCommentsView.LiveCommentView liveCommentView2 = null;
        if (this.messageObject == null || (view2 = this.chatActivity.fragmentView) == null || !view2.isAttachedToWindow()) {
            if (this.commentsView == null) {
                return;
            }
            view = null;
            reactionsLayoutInBubble = null;
            reactionButton = null;
        } else {
            View viewFindMessageCell = this.messageCell;
            if (viewFindMessageCell instanceof ChatMessageCell) {
                reactionsLayoutInBubble2 = ((ChatMessageCell) viewFindMessageCell).reactionsLayoutInBubble;
                reactionsLayoutInBubble2.getClass();
                reactionButton2 = reactionsLayoutInBubble2.getReactionButton("stars");
            } else if (viewFindMessageCell instanceof ChatActionCell) {
                reactionsLayoutInBubble2 = ((ChatActionCell) viewFindMessageCell).reactionsLayoutInBubble;
                reactionsLayoutInBubble2.getClass();
                reactionButton2 = reactionsLayoutInBubble2.getReactionButton("stars");
            } else {
                reactionsLayoutInBubble2 = null;
                reactionButton2 = null;
            }
            if (reactionButton2 == null && reactionsLayoutInBubble2 != null) {
                MessageObject.GroupedMessages validGroupedMessage = this.chatActivity.getValidGroupedMessage(this.messageObject);
                if (validGroupedMessage != null && !validGroupedMessage.posArray.isEmpty()) {
                    ArrayList<MessageObject> arrayList = validGroupedMessage.messages;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            messageObject = null;
                            break;
                        }
                        MessageObject messageObject2 = arrayList.get(i2);
                        i2++;
                        messageObject = messageObject2;
                        MessageObject.GroupedMessagePosition position = validGroupedMessage.getPosition(messageObject);
                        if (position != null) {
                            int i3 = position.flags;
                            if ((i3 & 1) != 0 && (i3 & 8) != 0) {
                                break;
                            }
                        }
                    }
                    if (messageObject != null) {
                        viewFindMessageCell = this.chatActivity.findMessageCell(messageObject.getId(), false);
                    }
                }
                if (viewFindMessageCell == null) {
                    return;
                }
                if (viewFindMessageCell instanceof ChatMessageCell) {
                    reactionsLayoutInBubble2 = ((ChatMessageCell) viewFindMessageCell).reactionsLayoutInBubble;
                    reactionsLayoutInBubble2.getClass();
                    reactionButton2 = reactionsLayoutInBubble2.getReactionButton("stars");
                }
            }
            if (reactionButton2 == null) {
                return;
            }
            reactionsLayoutInBubble = reactionsLayoutInBubble2;
            reactionButton = reactionButton2;
            view = viewFindMessageCell;
        }
        int[] iArr = new int[2];
        final RectF rectF = new RectF();
        getLocationInWindow(iArr);
        rectF.set(this.slider.counterImage.getBounds());
        rectF.inset(-AndroidUtilities.dp(3.5f), -AndroidUtilities.dp(3.5f));
        rectF.offset(iArr[0], iArr[1]);
        AnonymousClass6 anonymousClass6 = this.icon3dView;
        StarsReactionsSheet$$ExternalSyntheticLambda11 starsReactionsSheet$$ExternalSyntheticLambda11 = new StarsReactionsSheet$$ExternalSyntheticLambda11(this, i);
        if (anonymousClass6.ready) {
            starsReactionsSheet$$ExternalSyntheticLambda11.run();
        } else {
            anonymousClass6.readyListener = starsReactionsSheet$$ExternalSyntheticLambda11;
        }
        if (reactionButton != null) {
            reactionButton.drawImage = false;
        }
        if (view != null) {
            view.invalidate();
        }
        final LiveCommentsView.LiveCommentView[] liveCommentViewArr = new LiveCommentsView.LiveCommentView[1];
        if (this.liveStories && (anonymousClass10 = this.commentsView) != null) {
            int i4 = this.sentMessageId;
            for (int i5 = 0; i5 < anonymousClass10.listView.getChildCount(); i5++) {
                View childAt = anonymousClass10.listView.getChildAt(i5);
                if ((childAt instanceof LiveCommentsView.LiveCommentView) && (message = (liveCommentView = (LiveCommentsView.LiveCommentView) childAt).message) != null && message.id == i4) {
                    liveCommentView2 = liveCommentView;
                    break;
                }
            }
            liveCommentViewArr[0] = liveCommentView2;
        }
        final RectF rectF2 = new RectF();
        final View view3 = view;
        final ChatActivity$$ExternalSyntheticLambda135 chatActivity$$ExternalSyntheticLambda135 = new ChatActivity$$ExternalSyntheticLambda135(this, liveCommentViewArr, iArr, rectF2, view3, reactionsLayoutInBubble, reactionButton, 12);
        final ReactionsLayoutInBubble.ReactionButton reactionButton3 = reactionButton;
        chatActivity$$ExternalSyntheticLambda135.run();
        this.icon3dView.setPaused(false);
        this.icon3dView.setVisibility(0);
        final RectF rectF3 = new RectF();
        rectF3.set(rectF);
        this.icon3dView.setTranslationX(rectF3.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.icon3dView.setTranslationY(rectF3.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
        this.icon3dView.setScaleX(rectF3.width() / AndroidUtilities.dp(150.0f));
        this.icon3dView.setScaleY(rectF3.height() / AndroidUtilities.dp(150.0f));
        ValueAnimator valueAnimator = this.iconAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        final boolean[] zArr = new boolean[1];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.iconAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                StarsReactionsSheet starsReactionsSheet = this.f$0;
                starsReactionsSheet.getClass();
                float fFloatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                chatActivity$$ExternalSyntheticLambda135.run();
                RectF rectF4 = rectF;
                RectF rectF5 = rectF2;
                RectF rectF6 = rectF3;
                AndroidUtilities.lerp(rectF4, rectF5, fFloatValue, rectF6);
                float fCenterX = rectF6.centerX() - (AndroidUtilities.dp(150.0f) / 2.0f);
                StarsReactionsSheet.AnonymousClass6 anonymousClass7 = starsReactionsSheet.icon3dView;
                anonymousClass7.setTranslationX(fCenterX);
                anonymousClass7.setTranslationY(rectF6.centerY() - (AndroidUtilities.dp(150.0f) / 2.0f));
                float fLerp = AndroidUtilities.lerp(Math.max(rectF6.width() / AndroidUtilities.dp(150.0f), rectF6.height() / AndroidUtilities.dp(150.0f)), 1.0f, (float) Math.sin(((double) fFloatValue) * 3.141592653589793d));
                anonymousClass7.setScaleX(fLerp);
                anonymousClass7.setScaleY(fLerp);
                GLIconRenderer gLIconRenderer = anonymousClass7.mRenderer;
                gLIconRenderer.angleX = 360.0f * fFloatValue;
                gLIconRenderer.white = Math.max(0.0f, 1.0f - (4.0f * fFloatValue));
                boolean[] zArr2 = zArr;
                if (zArr2[0] || fFloatValue <= 0.95f) {
                    return;
                }
                zArr2[0] = true;
                LaunchActivity.makeRipple(rectF5.centerX(), rectF5.centerY(), 1.5f);
                try {
                    starsReactionsSheet.container.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                StarsReactionsSheet$$ExternalSyntheticLambda13 starsReactionsSheet$$ExternalSyntheticLambda14 = starsReactionsSheet$$ExternalSyntheticLambda13;
                if (starsReactionsSheet$$ExternalSyntheticLambda14 != null) {
                    starsReactionsSheet$$ExternalSyntheticLambda14.run();
                }
            }
        });
        this.iconAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public final void onAnimationEnd(Animator animator) {
                LaunchActivity.AnonymousClass5 anonymousClass5;
                StarsReactionsSheet starsReactionsSheet = StarsReactionsSheet.this;
                starsReactionsSheet.icon3dView.setVisibility(4);
                starsReactionsSheet.icon3dView.setPaused(true);
                ReactionsLayoutInBubble.ReactionButton reactionButton4 = reactionButton3;
                if (reactionButton4 != null) {
                    reactionButton4.drawImage = true;
                }
                View view4 = view3;
                if (view4 != null) {
                    view4.invalidate();
                }
                LiveCommentsView.LiveCommentView liveCommentView3 = liveCommentViewArr[0];
                if (liveCommentView3 != null) {
                    liveCommentView3.setDrawStar(true);
                }
                StarsReactionsSheet.super.dismissInternal();
                boolean[] zArr2 = zArr;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    RectF rectF4 = rectF2;
                    LaunchActivity.makeRipple(rectF4.centerX(), rectF4.centerY(), 1.5f);
                    try {
                        starsReactionsSheet.container.performHapticFeedback(0, 1);
                    } catch (Exception unused) {
                    }
                    StarsReactionsSheet$$ExternalSyntheticLambda13 starsReactionsSheet$$ExternalSyntheticLambda14 = starsReactionsSheet$$ExternalSyntheticLambda13;
                    if (starsReactionsSheet$$ExternalSyntheticLambda14 != null) {
                        starsReactionsSheet$$ExternalSyntheticLambda14.run();
                    }
                }
                LaunchActivity launchActivity = LaunchActivity.instance;
                if (launchActivity == null || (anonymousClass5 = launchActivity.fireworksOverlay) == null) {
                    return;
                }
                anonymousClass5.start(true);
            }
        });
        this.iconAnimator.setDuration(800L);
        this.iconAnimator.setInterpolator(new ViewPager.AnonymousClass2(4));
        this.iconAnimator.start();
    }

    @Override
    public final void appendOpenAnimator(boolean z, ArrayList arrayList) {
        Property property = View.ALPHA;
        float[] fArr = {z ? 1.0f : 0.0f};
        BalanceCloud balanceCloud = this.balanceCloud;
        arrayList.add(ObjectAnimator.ofFloat(balanceCloud, (Property<BalanceCloud, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(balanceCloud, (Property<BalanceCloud, Float>) View.SCALE_X, z ? 1.0f : 0.6f));
        arrayList.add(ObjectAnimator.ofFloat(balanceCloud, (Property<BalanceCloud, Float>) View.SCALE_Y, z ? 1.0f : 0.6f));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.slider.tracking) {
            return false;
        }
        return super.canDismissWithSwipe();
    }

    public final boolean canSwitchPeer() {
        if (!this.liveStories) {
            BotStarsController botStarsController = BotStarsController.getInstance(this.currentAccount);
            botStarsController.loadAdminedChannels();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = botStarsController.adminedChannels;
            if (arrayList2 != null) {
                arrayList.addAll(arrayList2);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if ((obj instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.adminedChannelsLoaded) {
            updateCanSwitchPeer(true);
        }
    }

    @Override
    public final void lambda$showGiftOfferSheet$15() {
        Long myPaidReactionPeer;
        if (!this.sending && !this.checkedVisiblity) {
            this.checkedVisiblity = true;
            MessageObject messageObject = this.messageObject;
            if (messageObject != null && ((myPaidReactionPeer = messageObject.getMyPaidReactionPeer()) == null || myPaidReactionPeer.longValue() != this.peer)) {
                messageObject.setMyPaidReactionDialogId(this.peer);
                StarsController.MessageId messageIdFrom = StarsController.MessageId.from(messageObject);
                TLRPC.TL_messages_togglePaidReactionPrivacy tL_messages_togglePaidReactionPrivacy = new TLRPC.TL_messages_togglePaidReactionPrivacy();
                int i = this.currentAccount;
                tL_messages_togglePaidReactionPrivacy.peer = MessagesController.getInstance(i).getInputPeer(messageIdFrom.did);
                int i2 = messageIdFrom.mid;
                tL_messages_togglePaidReactionPrivacy.msg_id = i2;
                long j = this.peer;
                if (j == 0) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyDefault();
                } else if (j == 2666000) {
                    tL_messages_togglePaidReactionPrivacy.privacy = new TL_stars.paidReactionPrivacyAnonymous();
                } else {
                    TL_stars.paidReactionPrivacyPeer paidreactionprivacypeer = new TL_stars.paidReactionPrivacyPeer();
                    tL_messages_togglePaidReactionPrivacy.privacy = paidreactionprivacypeer;
                    paidreactionprivacypeer.peer = MessagesController.getInstance(i).getInputPeer(this.peer);
                }
                NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starReactionAnonymousUpdate, Long.valueOf(messageIdFrom.did), Integer.valueOf(i2), Long.valueOf(this.peer));
                ConnectionsManager.getInstance(i).sendRequest(tL_messages_togglePaidReactionPrivacy, new LinkManager$$ExternalSyntheticLambda3(this, 28));
            }
        }
        super.lambda$showGiftOfferSheet$15();
    }

    @Override
    public final void dismissInternal() {
        ValueAnimator valueAnimator = this.iconAnimator;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            super.dismissInternal();
        }
    }

    @Override
    public final boolean isTouchOutside(float f, float f2) {
        BalanceCloud balanceCloud = this.balanceCloud;
        if (f < balanceCloud.getX() || f > balanceCloud.getX() + balanceCloud.getWidth() || f2 < balanceCloud.getY() || f2 > balanceCloud.getY() + balanceCloud.getHeight()) {
            return super.isTouchOutside(f, f2);
        }
        return false;
    }

    public final void lambda$new$9(int i, Theme.ResourcesProvider resourcesProvider, long j, boolean z) {
        long j2;
        StarsReactionsSheet starsReactionsSheet = this;
        BotStarsController botStarsController = BotStarsController.getInstance(i);
        botStarsController.loadAdminedChannels();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = botStarsController.adminedChannels;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        arrayList.add(0, UserConfig.getInstance(i).getCurrentUser());
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(starsReactionsSheet.containerView, resourcesProvider, starsReactionsSheet.dialogSelectorInnerLayout);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            TLObject tLObject = (TLObject) arrayList.get(i2);
            if (tLObject instanceof TLRPC.User) {
                j2 = ((TLRPC.User) tLObject).id;
            } else {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                        j2 = -chat.id;
                    }
                }
                starsReactionsSheet = this;
                i2 = i3;
            }
            if (j2 != j) {
                long j3 = starsReactionsSheet.peer;
                itemOptionsMakeOptions.addChat(tLObject, j2 == j3 || (j3 == 0 && j2 == UserConfig.getInstance(i).getClientUserId()), new ChatActivity$$ExternalSyntheticLambda286(starsReactionsSheet, j2, z, 4));
            }
            starsReactionsSheet = this;
            i2 = i3;
        }
        itemOptionsMakeOptions.drawScrim = false;
        itemOptionsMakeOptions.onTopOfScrim = true;
        itemOptionsMakeOptions.dimAlpha = 0;
        itemOptionsMakeOptions.setGravity(5);
        itemOptionsMakeOptions.show();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.adminedChannelsLoaded);
    }

    public final void updateCanSwitchPeer(boolean z) {
        FrameLayout frameLayout = this.dialogSelectorLayout;
        if ((frameLayout.getVisibility() == 0) != canSwitchPeer()) {
            frameLayout.setVisibility(canSwitchPeer() ? 0 : 8);
            if (z) {
                if (canSwitchPeer()) {
                    frameLayout.setScaleX(0.4f);
                    frameLayout.setScaleY(0.4f);
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                }
                ChangeBounds changeBounds = new ChangeBounds();
                changeBounds.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.toptopLayout, changeBounds);
            }
        }
    }

    public final void updatePeerDialog() {
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        avatarDrawable.scaleSize = 0.42f;
        long j = this.peer;
        BackupImageView backupImageView = this.dialogImageView;
        if (j == 2666000) {
            avatarDrawable.setAvatarType(21);
            int i = Theme.key_avatar_backgroundGray;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            avatarDrawable.setColor(Theme.getColor(i, resourcesProvider), Theme.getColor(i, resourcesProvider));
            backupImageView.imageReceiver.setForUserOrChat(null, avatarDrawable);
            backupImageView.onNewImageSet();
            return;
        }
        int i2 = this.currentAccount;
        if (j >= 0) {
            TLRPC.User user = MessagesController.getInstance(i2).getUser(Long.valueOf(this.peer));
            avatarDrawable.setInfo(UserConfig.selectedAccount, user);
            backupImageView.imageReceiver.setForUserOrChat(user, avatarDrawable);
            backupImageView.onNewImageSet();
            return;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i2).getChat(Long.valueOf(-this.peer));
        avatarDrawable.setInfo(UserConfig.selectedAccount, chat);
        backupImageView.imageReceiver.setForUserOrChat(chat, avatarDrawable);
        backupImageView.onNewImageSet();
    }

    public final void updateSenders(long j) {
        TopSendersView topSendersView;
        long j2;
        long j3;
        long j4 = 0;
        if ((!this.liveStories || this.sendEnabled || j <= 0) && (topSendersView = this.topSendersView) != null) {
            ArrayList arrayList = new ArrayList();
            long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            int i = 1;
            ArrayList arrayList2 = this.reactors;
            if (arrayList2 != null) {
                j3 = 0;
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    TLRPC.MessageReactor messageReactor = (TLRPC.MessageReactor) arrayList2.get(i2);
                    long peerDialogId = DialogObject.getPeerDialogId(messageReactor.peer_id);
                    long j5 = j4;
                    boolean z = messageReactor.anonymous;
                    if (z) {
                        peerDialogId = messageReactor.my ? clientUserId : (-i2) - i;
                    }
                    if (messageReactor.my || peerDialogId == clientUserId) {
                        j3 = messageReactor.count;
                    } else {
                        long j6 = messageReactor.count;
                        SenderData senderData = new SenderData();
                        senderData.anonymous = z;
                        senderData.my = false;
                        senderData.did = peerDialogId;
                        senderData.stars = j6;
                        arrayList.add(senderData);
                    }
                    i2++;
                    j4 = j5;
                    arrayList2 = arrayList2;
                    i = 1;
                }
                j2 = j4;
            } else {
                j2 = 0;
                j3 = 0;
            }
            long j7 = j3 + j;
            if (j7 > j2) {
                boolean z2 = this.peer == 2666000;
                SenderData senderData2 = new SenderData();
                senderData2.anonymous = z2;
                senderData2.my = true;
                senderData2.did = clientUserId;
                senderData2.stars = j7;
                arrayList.add(senderData2);
            }
            Collections.sort(arrayList, new OAuthSheet$$ExternalSyntheticLambda3(8));
            topSendersView.setSenders(new ArrayList<>(arrayList.subList(0, Math.min(3, arrayList.size()))));
        }
    }

    public final class AnonymousClass6 extends GLIconTextureView {
        public final int $r8$classId;

        public AnonymousClass6(Context context, int i, int i2, int i3) {
            super(context, i, i2);
            this.$r8$classId = i3;
        }

        @Override
        public void onAttachedToWindow() {
            switch (this.$r8$classId) {
                case 1:
                    super.onAttachedToWindow();
                    setPaused(false);
                    break;
                case 2:
                    super.onAttachedToWindow();
                    setPaused(false);
                    break;
                case 3:
                    super.onAttachedToWindow();
                    setPaused(false);
                    break;
                case 4:
                    super.onAttachedToWindow();
                    setPaused(false);
                    break;
                default:
                    super.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 1:
                    super.onDetachedFromWindow();
                    setPaused(true);
                    break;
                case 2:
                    super.onDetachedFromWindow();
                    setPaused(true);
                    break;
                case 3:
                    super.onDetachedFromWindow();
                    setPaused(true);
                    break;
                case 4:
                    super.onDetachedFromWindow();
                    setPaused(true);
                    break;
                default:
                    super.onDetachedFromWindow();
                    break;
            }
        }

        @Override
        public void startIdleAnimation() {
            switch (this.$r8$classId) {
                case 0:
                    break;
                default:
                    super.startIdleAnimation();
                    break;
            }
        }

        private final void startIdleAnimation$org$telegram$ui$Stars$StarsReactionsSheet$6() {
        }
    }
}

package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.StateSet;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_transcribeAudio;
import org.telegram.tgnet.TLRPC$TL_messages_transcribedAudio;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
public class TranscribeButton {
    private static final int[] pressedState = {16842910, 16842919};
    private static HashMap<Integer, MessageObject> transcribeOperationsByDialogPosition;
    private static HashMap<Long, MessageObject> transcribeOperationsById;
    private static ArrayList<Integer> videoTranscriptionsOpen;
    private float a;
    private float b;
    private float backgroundBack;
    private int backgroundColor;
    private Paint backgroundPaint;
    private Path boundsPath;
    private int color;
    private int diameter;
    private int iconColor;
    private RLottieDrawable inIconDrawable;
    private int inIconDrawableAlpha;
    private boolean isOpen;
    private boolean loading;
    private AnimatedFloat loadingFloat;
    private RLottieDrawable outIconDrawable;
    private int outIconDrawableAlpha;
    private ChatMessageCell parent;
    private boolean premium;
    private android.graphics.Rect pressBounds;
    private Path progressClipPath;
    private int radius;
    private int rippleColor;
    private SeekBarWaveform seekBar;
    private float[] segments;
    private Drawable selectorDrawable;
    private boolean shouldBeOpen;
    private Paint strokePaint;
    private boolean clickedToOpen = false;
    private boolean pressed = false;
    private final FastOutSlowInInterpolator interpolator = new FastOutSlowInInterpolator();
    private long start = SystemClock.elapsedRealtime();
    private android.graphics.Rect bounds = new android.graphics.Rect(0, 0, AndroidUtilities.dp(30.0f), AndroidUtilities.dp(30.0f));

    public void drawGradientBackground(Canvas canvas, android.graphics.Rect rect, float f) {
        throw null;
    }

    protected void onOpen() {
        throw null;
    }

    public TranscribeButton(ChatMessageCell chatMessageCell, SeekBarWaveform seekBarWaveform) {
        boolean z = false;
        this.parent = chatMessageCell;
        this.seekBar = seekBarWaveform;
        android.graphics.Rect rect = new android.graphics.Rect(this.bounds);
        this.pressBounds = rect;
        rect.inset(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        RLottieDrawable rLottieDrawable = new RLottieDrawable(R.raw.transcribe_out, "transcribe_out", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
        this.outIconDrawable = rLottieDrawable;
        rLottieDrawable.setCurrentFrame(0);
        this.outIconDrawable.setCallback(chatMessageCell);
        this.outIconDrawable.setOnFinishCallback(new Runnable() {
            @Override
            public final void run() {
                TranscribeButton.this.lambda$new$0();
            }
        }, 19);
        this.outIconDrawable.setAllowDecodeSingleFrame(true);
        RLottieDrawable rLottieDrawable2 = new RLottieDrawable(R.raw.transcribe_in, "transcribe_in", AndroidUtilities.dp(26.0f), AndroidUtilities.dp(26.0f));
        this.inIconDrawable = rLottieDrawable2;
        rLottieDrawable2.setCurrentFrame(0);
        this.inIconDrawable.setCallback(chatMessageCell);
        this.inIconDrawable.setMasterParent(chatMessageCell);
        this.inIconDrawable.setOnFinishCallback(new Runnable() {
            @Override
            public final void run() {
                TranscribeButton.this.lambda$new$1();
            }
        }, 19);
        this.inIconDrawable.setAllowDecodeSingleFrame(true);
        this.isOpen = false;
        this.shouldBeOpen = false;
        if (chatMessageCell.getMessageObject() != null && UserConfig.getInstance(chatMessageCell.getMessageObject().currentAccount).isPremium()) {
            z = true;
        }
        this.premium = z;
        this.loadingFloat = new AnimatedFloat(chatMessageCell, 250L, CubicBezierInterpolator.EASE_OUT_QUINT);
    }

    public void lambda$new$0() {
        this.outIconDrawable.stop();
        this.inIconDrawable.stop();
        this.shouldBeOpen = true;
        this.isOpen = true;
        this.inIconDrawable.setCurrentFrame(0);
    }

    public void lambda$new$1() {
        this.inIconDrawable.stop();
        this.outIconDrawable.stop();
        this.shouldBeOpen = false;
        this.isOpen = false;
        this.outIconDrawable.setCurrentFrame(0);
    }

    public void setLoading(boolean z, boolean z2) {
        this.loading = z;
        this.seekBar.setLoading(z);
        if (!z2) {
            this.loadingFloat.set(this.loading ? 1.0f : 0.0f, true);
        } else if (this.loadingFloat.get() <= 0.0f) {
            this.start = SystemClock.elapsedRealtime();
        }
        ChatMessageCell chatMessageCell = this.parent;
        if (chatMessageCell != null) {
            chatMessageCell.invalidate();
        }
    }

    public void setOpen(boolean z, boolean z2) {
        if (!this.shouldBeOpen && z && this.clickedToOpen) {
            this.clickedToOpen = false;
            onOpen();
        }
        boolean z3 = this.shouldBeOpen;
        this.shouldBeOpen = z;
        if (!z2) {
            this.isOpen = z;
            this.inIconDrawable.stop();
            this.outIconDrawable.stop();
            this.inIconDrawable.setCurrentFrame(0);
            this.outIconDrawable.setCurrentFrame(0);
        } else if (z && !z3) {
            this.isOpen = false;
            this.inIconDrawable.setCurrentFrame(0);
            this.outIconDrawable.setCurrentFrame(0);
            this.outIconDrawable.start();
        } else if (!z && z3) {
            this.isOpen = true;
            this.outIconDrawable.setCurrentFrame(0);
            this.inIconDrawable.setCurrentFrame(0);
            this.inIconDrawable.start();
        }
        ChatMessageCell chatMessageCell = this.parent;
        if (chatMessageCell != null) {
            chatMessageCell.invalidate();
        }
    }

    public boolean onTouch(int i, float f, float f2) {
        if (i == 1 || i == 3) {
            if (this.pressed && i == 1) {
                onTap();
                return true;
            }
            this.pressed = false;
            return false;
        } else if (this.pressBounds.contains((int) f, (int) f2)) {
            if (i == 0) {
                this.pressed = true;
            }
            if (this.pressed && Build.VERSION.SDK_INT >= 21) {
                Drawable drawable = this.selectorDrawable;
                if (drawable instanceof RippleDrawable) {
                    drawable.setHotspot(f, f2);
                    this.selectorDrawable.setState(pressedState);
                    this.parent.invalidate();
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public void onTap() {
        boolean z;
        this.clickedToOpen = false;
        boolean z2 = this.shouldBeOpen;
        boolean z3 = !z2;
        if (!z2) {
            z = !this.loading;
            if (this.premium && this.parent.getMessageObject().isSent()) {
                setLoading(true, true);
            }
        } else {
            setOpen(false, true);
            setLoading(false, true);
            z = true;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            Drawable drawable = this.selectorDrawable;
            if (drawable instanceof RippleDrawable) {
                drawable.setState(StateSet.NOTHING);
                this.parent.invalidate();
            }
        }
        this.pressed = false;
        if (z) {
            if (!this.premium && z3) {
                if (this.parent.getDelegate() != null) {
                    this.parent.getDelegate().needShowPremiumBulletin(0);
                    return;
                }
                return;
            }
            if (z3) {
                this.clickedToOpen = true;
            }
            transcribePressed(this.parent.getMessageObject(), z3);
        }
    }

    public void setColor(int i, int i2, boolean z, float f) {
        boolean z2 = this.color != i;
        this.color = i;
        this.iconColor = i;
        int alphaComponent = ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * 0.156f));
        this.backgroundColor = alphaComponent;
        this.backgroundBack = f;
        this.rippleColor = Theme.blendOver(alphaComponent, ColorUtils.setAlphaComponent(i, (int) (Color.alpha(i) * (Theme.isCurrentThemeDark() ? 0.3f : 0.2f))));
        if (this.backgroundPaint == null) {
            this.backgroundPaint = new Paint();
        }
        this.backgroundPaint.setColor(this.backgroundColor);
        Paint paint = this.backgroundPaint;
        paint.setAlpha((int) (paint.getAlpha() * (1.0f - f)));
        if (z2 || this.selectorDrawable == null) {
            Drawable createSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(8.0f), 0, this.rippleColor);
            this.selectorDrawable = createSimpleSelectorRoundRectDrawable;
            createSimpleSelectorRoundRectDrawable.setCallback(this.parent);
        }
        if (z2) {
            this.inIconDrawable.beginApplyLayerColors();
            this.inIconDrawable.setLayerColor("Artboard Outlines.**", this.iconColor);
            this.inIconDrawable.commitApplyLayerColors();
            this.inIconDrawable.setAllowDecodeSingleFrame(true);
            this.inIconDrawable.updateCurrentFrame(0L, false);
            RLottieDrawable rLottieDrawable = this.inIconDrawable;
            int alpha = Color.alpha(i);
            this.inIconDrawableAlpha = alpha;
            rLottieDrawable.setAlpha(alpha);
            this.outIconDrawable.beginApplyLayerColors();
            this.outIconDrawable.setLayerColor("Artboard Outlines.**", this.iconColor);
            this.outIconDrawable.commitApplyLayerColors();
            this.outIconDrawable.setAllowDecodeSingleFrame(true);
            this.outIconDrawable.updateCurrentFrame(0L, false);
            RLottieDrawable rLottieDrawable2 = this.outIconDrawable;
            int alpha2 = Color.alpha(i);
            this.outIconDrawableAlpha = alpha2;
            rLottieDrawable2.setAlpha(alpha2);
        }
        if (this.strokePaint == null) {
            Paint paint2 = new Paint(1);
            this.strokePaint = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.strokePaint.setStrokeCap(Paint.Cap.ROUND);
        }
        this.strokePaint.setColor(i);
    }

    public void setBounds(int i, int i2, int i3, int i4, int i5) {
        if (i3 != this.bounds.width() || i4 != this.bounds.height()) {
            float f = i3 / 2.0f;
            float f2 = i5;
            float f3 = i4 / 2.0f;
            this.a = (float) ((Math.atan((f - f2) / f3) * 180.0d) / 3.141592653589793d);
            this.b = (float) ((Math.atan(f / (f3 - f2)) * 180.0d) / 3.141592653589793d);
        }
        this.bounds.set(i, i2, i + i3, i2 + i4);
        int min = Math.min(Math.min(i3, i4) / 2, i5);
        this.radius = min;
        this.diameter = min * 2;
    }

    public int width() {
        return this.bounds.width();
    }

    public int height() {
        return this.bounds.height();
    }

    public void draw(Canvas canvas, float f) {
        this.pressBounds.set(this.bounds.left - AndroidUtilities.dp(8.0f), this.bounds.top - AndroidUtilities.dp(8.0f), this.bounds.right + AndroidUtilities.dp(8.0f), this.bounds.bottom + AndroidUtilities.dp(8.0f));
        Path path = this.boundsPath;
        if (path == null) {
            this.boundsPath = new Path();
        } else {
            path.rewind();
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(this.bounds);
        Path path2 = this.boundsPath;
        int i = this.radius;
        path2.addRoundRect(rectF, i, i, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.boundsPath);
        float f2 = this.backgroundBack;
        if (f2 * f > 0.0f) {
            drawGradientBackground(canvas, this.bounds, f2 * f);
        }
        Paint paint = this.backgroundPaint;
        if (paint != null) {
            int alpha = paint.getAlpha();
            this.backgroundPaint.setAlpha((int) (alpha * f));
            canvas.drawRect(this.bounds, this.backgroundPaint);
            this.backgroundPaint.setAlpha(alpha);
        }
        Drawable drawable = this.selectorDrawable;
        if (drawable != null) {
            drawable.setBounds(this.bounds);
            this.selectorDrawable.draw(canvas);
        }
        canvas.restore();
        float f3 = this.loadingFloat.set(this.loading ? 1.0f : 0.0f);
        if (f3 > 0.0f) {
            float[] segments = getSegments(((float) (SystemClock.elapsedRealtime() - this.start)) * 0.75f);
            Path path3 = this.progressClipPath;
            if (path3 == null) {
                this.progressClipPath = new Path();
            } else {
                path3.rewind();
            }
            float max = Math.max(40.0f * f3, segments[1] - segments[0]);
            float f4 = segments[0] + ((1.0f - f3) * max * (this.loading ? 0.0f : 1.0f));
            float f5 = (max * f3) + f4;
            float f6 = f4 % 360.0f;
            float f7 = f5 % 360.0f;
            if (f6 < 0.0f) {
                f6 += 360.0f;
            }
            float f8 = f6;
            if (f7 < 0.0f) {
                f7 += 360.0f;
            }
            float f9 = f7;
            Path path4 = this.progressClipPath;
            int centerX = this.bounds.centerX();
            android.graphics.Rect rect = this.bounds;
            int i2 = rect.top;
            addLine(path4, centerX, i2, rect.right - this.radius, i2, f8, f9, 0.0f, this.a);
            Path path5 = this.progressClipPath;
            android.graphics.Rect rect2 = this.bounds;
            addCorner(path5, rect2.right, rect2.top, this.diameter, 1, f8, f9, this.a, this.b);
            Path path6 = this.progressClipPath;
            android.graphics.Rect rect3 = this.bounds;
            int i3 = rect3.right;
            int i4 = rect3.top;
            int i5 = this.radius;
            float f10 = this.b;
            addLine(path6, i3, i4 + i5, i3, rect3.bottom - i5, f8, f9, f10, 180.0f - f10);
            Path path7 = this.progressClipPath;
            android.graphics.Rect rect4 = this.bounds;
            addCorner(path7, rect4.right, rect4.bottom, this.diameter, 2, f8, f9, 180.0f - this.b, 180.0f - this.a);
            Path path8 = this.progressClipPath;
            android.graphics.Rect rect5 = this.bounds;
            int i6 = rect5.right;
            int i7 = this.radius;
            int i8 = rect5.bottom;
            int i9 = rect5.left + i7;
            float f11 = this.a;
            addLine(path8, i6 - i7, i8, i9, i8, f8, f9, 180.0f - f11, f11 + 180.0f);
            Path path9 = this.progressClipPath;
            android.graphics.Rect rect6 = this.bounds;
            addCorner(path9, rect6.left, rect6.bottom, this.diameter, 3, f8, f9, this.a + 180.0f, this.b + 180.0f);
            Path path10 = this.progressClipPath;
            android.graphics.Rect rect7 = this.bounds;
            int i10 = rect7.left;
            int i11 = rect7.bottom;
            int i12 = this.radius;
            int i13 = rect7.top + i12;
            float f12 = this.b;
            addLine(path10, i10, i11 - i12, i10, i13, f8, f9, f12 + 180.0f, 360.0f - f12);
            Path path11 = this.progressClipPath;
            android.graphics.Rect rect8 = this.bounds;
            addCorner(path11, rect8.left, rect8.top, this.diameter, 4, f8, f9, 360.0f - this.b, 360.0f - this.a);
            Path path12 = this.progressClipPath;
            android.graphics.Rect rect9 = this.bounds;
            addLine(path12, rect9.left + this.radius, rect9.top, rect9.centerX(), this.bounds.top, f8, f9, 360.0f - this.a, 360.0f);
            this.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            int alpha2 = this.strokePaint.getAlpha();
            this.strokePaint.setAlpha((int) (alpha2 * f));
            canvas.drawPath(this.progressClipPath, this.strokePaint);
            this.strokePaint.setAlpha(alpha2);
            this.parent.invalidate();
        }
        canvas.save();
        canvas.translate(this.bounds.centerX() + AndroidUtilities.dp(-13.0f), this.bounds.centerY() + AndroidUtilities.dp(-13.0f));
        if (this.isOpen) {
            this.inIconDrawable.setAlpha((int) (this.inIconDrawableAlpha * f));
            this.inIconDrawable.draw(canvas);
        } else {
            this.outIconDrawable.setAlpha((int) (this.outIconDrawableAlpha * f));
            this.outIconDrawable.draw(canvas);
        }
        canvas.restore();
    }

    private float[] getSegments(long j) {
        if (this.segments == null) {
            this.segments = new float[2];
        }
        long j2 = j % 5400;
        float[] fArr = this.segments;
        float f = ((float) (1520 * j2)) / 5400.0f;
        fArr[0] = f - 20.0f;
        fArr[1] = f;
        for (int i = 0; i < 4; i++) {
            float[] fArr2 = this.segments;
            int i2 = i * 1350;
            fArr2[1] = fArr2[1] + (this.interpolator.getInterpolation(((float) (j2 - i2)) / 667.0f) * 250.0f);
            float[] fArr3 = this.segments;
            fArr3[0] = fArr3[0] + (this.interpolator.getInterpolation(((float) (j2 - (i2 + 667))) / 667.0f) * 250.0f);
        }
        return this.segments;
    }

    private void addLine(Path path, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        if (i == i3 && i2 == i4) {
            return;
        }
        if (f > f2) {
            float f5 = f4 - f3;
            addLine(path, i, i2, i3, i4, (f - f3) / f5, 1.0f);
            addLine(path, i, i2, i3, i4, 0.0f, (f2 - f3) / f5);
            return;
        }
        float f6 = f4 - f3;
        addLine(path, i, i2, i3, i4, Math.max(0.0f, f - f3) / f6, (Math.min(f2, f4) - f3) / f6);
    }

    private void addLine(Path path, int i, int i2, int i3, int i4, float f, float f2) {
        if (i == i3 && i2 == i4) {
            return;
        }
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        float clamp2 = MathUtils.clamp(f2, 0.0f, 1.0f);
        if (clamp2 - clamp <= 0.0f) {
            return;
        }
        path.moveTo(AndroidUtilities.lerp(i, i3, clamp), AndroidUtilities.lerp(i2, i4, clamp));
        path.lineTo(AndroidUtilities.lerp(i, i3, clamp2), AndroidUtilities.lerp(i2, i4, clamp2));
    }

    private void addCorner(Path path, int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        if (f > f2) {
            float f5 = f4 - f3;
            addCorner(path, i, i2, i3, i4, (f - f3) / f5, 1.0f);
            addCorner(path, i, i2, i3, i4, 0.0f, (f2 - f3) / f5);
            return;
        }
        float f6 = f4 - f3;
        addCorner(path, i, i2, i3, i4, Math.max(0.0f, f - f3) / f6, (Math.min(f2, f4) - f3) / f6);
    }

    private void addCorner(Path path, int i, int i2, int i3, int i4, float f, float f2) {
        float clamp = MathUtils.clamp(f, 0.0f, 1.0f);
        float clamp2 = MathUtils.clamp(f2, 0.0f, 1.0f) - clamp;
        if (clamp2 <= 0.0f) {
            return;
        }
        if (i4 == 1) {
            AndroidUtilities.rectTmp.set(i - i3, i2, i, i2 + i3);
        } else if (i4 == 2) {
            AndroidUtilities.rectTmp.set(i - i3, i2 - i3, i, i2);
        } else if (i4 == 3) {
            AndroidUtilities.rectTmp.set(i, i2 - i3, i + i3, i2);
        } else if (i4 == 4) {
            AndroidUtilities.rectTmp.set(i, i2, i + i3, i2 + i3);
        }
        path.addArc(AndroidUtilities.rectTmp, ((i4 * 90) - 180) + (clamp * 90.0f), clamp2 * 90.0f);
    }

    public static class LoadingPointsSpan extends ImageSpan {
        private static LoadingPointsDrawable drawable;

        public LoadingPointsSpan() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.TranscribeButton.LoadingPointsSpan.<init>():void");
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            float textSize = textPaint.getTextSize() * 0.89f;
            int i = (int) (0.02f * textSize);
            getDrawable().setBounds(0, i, (int) textSize, ((int) (textSize * 1.25f)) + i);
            super.updateDrawState(textPaint);
        }
    }

    private static class LoadingPointsDrawable extends Drawable {
        private int lastColor;
        private RLottieDrawable lottie;
        private Paint paint;

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }

        public LoadingPointsDrawable(TextPaint textPaint) {
            this.paint = textPaint;
            float textSize = textPaint.getTextSize() * 0.89f;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(this, R.raw.dots_loading, "dots_loading", (int) textSize, (int) (textSize * 1.25f)) {
                @Override
                public boolean hasParentView() {
                    return true;
                }
            };
            this.lottie = rLottieDrawable;
            rLottieDrawable.setAutoRepeat(1);
            this.lottie.setCurrentFrame((int) ((((float) SystemClock.elapsedRealtime()) / 16.0f) % 60.0f));
            this.lottie.setAllowDecodeSingleFrame(true);
            this.lottie.start();
        }

        public void setColor(int i) {
            this.lottie.beginApplyLayerColors();
            this.lottie.setLayerColor("Comp 1.**", i);
            this.lottie.commitApplyLayerColors();
            this.lottie.setAllowDecodeSingleFrame(true);
            this.lottie.updateCurrentFrame(0L, false);
        }

        @Override
        public void draw(Canvas canvas) {
            int color = this.paint.getColor();
            if (color != this.lastColor) {
                setColor(color);
                this.lastColor = color;
            }
            this.lottie.draw(canvas);
        }
    }

    private static int reqInfoHash(MessageObject messageObject) {
        if (messageObject == null) {
            return 0;
        }
        return Objects.hash(Integer.valueOf(messageObject.currentAccount), Long.valueOf(messageObject.getDialogId()), Integer.valueOf(messageObject.getId()));
    }

    public static void openVideoTranscription(MessageObject messageObject) {
        if (messageObject == null || isVideoTranscriptionOpen(messageObject)) {
            return;
        }
        if (videoTranscriptionsOpen == null) {
            videoTranscriptionsOpen = new ArrayList<>(1);
        }
        videoTranscriptionsOpen.add(Integer.valueOf(reqInfoHash(messageObject)));
    }

    public static boolean isVideoTranscriptionOpen(MessageObject messageObject) {
        return videoTranscriptionsOpen != null && (!messageObject.isRoundVideo() || videoTranscriptionsOpen.contains(Integer.valueOf(reqInfoHash(messageObject))));
    }

    public static void resetVideoTranscriptionsOpen() {
        ArrayList<Integer> arrayList = videoTranscriptionsOpen;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public static boolean isTranscribing(MessageObject messageObject) {
        HashMap<Long, MessageObject> hashMap;
        TLRPC$Message tLRPC$Message;
        HashMap<Integer, MessageObject> hashMap2 = transcribeOperationsByDialogPosition;
        return (hashMap2 != null && (hashMap2.containsValue(messageObject) || transcribeOperationsByDialogPosition.containsKey(Integer.valueOf(reqInfoHash(messageObject))))) || !((hashMap = transcribeOperationsById) == null || messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null || !hashMap.containsKey(Long.valueOf(tLRPC$Message.voiceTranscriptionId)));
    }

    private static void transcribePressed(final MessageObject messageObject, boolean z) {
        if (messageObject == null || messageObject.messageOwner == null || !messageObject.isSent()) {
            return;
        }
        final int i = messageObject.currentAccount;
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        TLRPC$InputPeer inputPeer = MessagesController.getInstance(i).getInputPeer(messageObject.messageOwner.peer_id);
        final long peerDialogId = DialogObject.getPeerDialogId(inputPeer);
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        final int i2 = tLRPC$Message.id;
        if (z) {
            if (tLRPC$Message.voiceTranscription != null && tLRPC$Message.voiceTranscriptionFinal) {
                openVideoTranscription(messageObject);
                messageObject.messageOwner.voiceTranscriptionOpen = true;
                MessagesStorage.getInstance(i).updateMessageVoiceTranscriptionOpen(peerDialogId, i2, messageObject.messageOwner);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TranscribeButton.lambda$transcribePressed$2(i, messageObject);
                    }
                });
                return;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("sending Transcription request, msg_id=" + i2 + " dialog_id=" + peerDialogId);
            }
            TLRPC$TL_messages_transcribeAudio tLRPC$TL_messages_transcribeAudio = new TLRPC$TL_messages_transcribeAudio();
            tLRPC$TL_messages_transcribeAudio.peer = inputPeer;
            tLRPC$TL_messages_transcribeAudio.msg_id = i2;
            if (transcribeOperationsByDialogPosition == null) {
                transcribeOperationsByDialogPosition = new HashMap<>();
            }
            transcribeOperationsByDialogPosition.put(Integer.valueOf(reqInfoHash(messageObject)), messageObject);
            ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_transcribeAudio, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    TranscribeButton.lambda$transcribePressed$4(MessageObject.this, elapsedRealtime, i, peerDialogId, i2, tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        HashMap<Integer, MessageObject> hashMap = transcribeOperationsByDialogPosition;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(reqInfoHash(messageObject)));
        }
        messageObject.messageOwner.voiceTranscriptionOpen = false;
        MessagesStorage.getInstance(i).updateMessageVoiceTranscriptionOpen(peerDialogId, i2, messageObject.messageOwner);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TranscribeButton.lambda$transcribePressed$5(i, messageObject);
            }
        });
    }

    public static void lambda$transcribePressed$2(int i, MessageObject messageObject) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i);
        int i2 = NotificationCenter.voiceTranscriptionUpdate;
        Boolean bool = Boolean.TRUE;
        notificationCenter.postNotificationName(i2, messageObject, null, null, bool, bool);
    }

    public static void lambda$transcribePressed$4(final MessageObject messageObject, long j, int i, long j2, int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final long j3;
        boolean z;
        final String str = "";
        if (tLObject instanceof TLRPC$TL_messages_transcribedAudio) {
            TLRPC$TL_messages_transcribedAudio tLRPC$TL_messages_transcribedAudio = (TLRPC$TL_messages_transcribedAudio) tLObject;
            String str2 = tLRPC$TL_messages_transcribedAudio.text;
            long j4 = tLRPC$TL_messages_transcribedAudio.transcription_id;
            z = !tLRPC$TL_messages_transcribedAudio.pending;
            if (!TextUtils.isEmpty(str2)) {
                str = str2;
            } else if (!z) {
                str = null;
            }
            if (transcribeOperationsById == null) {
                transcribeOperationsById = new HashMap<>();
            }
            transcribeOperationsById.put(Long.valueOf(j4), messageObject);
            messageObject.messageOwner.voiceTranscriptionId = j4;
            j3 = j4;
        } else {
            j3 = 0;
            z = true;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        openVideoTranscription(messageObject);
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        tLRPC$Message.voiceTranscriptionOpen = true;
        tLRPC$Message.voiceTranscriptionFinal = z;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("Transcription request sent, received final=" + z + " id=" + j3 + " text=" + str);
        }
        MessagesStorage.getInstance(i).updateMessageVoiceTranscription(j2, i2, str, messageObject.messageOwner);
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TranscribeButton.finishTranscription(MessageObject.this, j3, str);
                }
            }, Math.max(0L, 350 - elapsedRealtime));
        }
    }

    public static void lambda$transcribePressed$5(int i, MessageObject messageObject) {
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.voiceTranscriptionUpdate, messageObject, null, null, Boolean.FALSE, null);
    }

    public static boolean finishTranscription(final MessageObject messageObject, final long j, final String str) {
        MessageObject messageObject2 = null;
        try {
            HashMap<Long, MessageObject> hashMap = transcribeOperationsById;
            if (hashMap != null && hashMap.containsKey(Long.valueOf(j))) {
                messageObject2 = transcribeOperationsById.remove(Long.valueOf(j));
            }
            if (messageObject == null) {
                messageObject = messageObject2;
            }
            if (messageObject != null && messageObject.messageOwner != null) {
                HashMap<Integer, MessageObject> hashMap2 = transcribeOperationsByDialogPosition;
                if (hashMap2 != null) {
                    hashMap2.remove(Integer.valueOf(reqInfoHash(messageObject)));
                }
                messageObject.messageOwner.voiceTranscriptionFinal = true;
                MessagesStorage.getInstance(messageObject.currentAccount).updateMessageVoiceTranscription(messageObject.getDialogId(), messageObject.getId(), str, messageObject.messageOwner);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TranscribeButton.lambda$finishTranscription$6(MessageObject.this, j, str);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void lambda$finishTranscription$6(MessageObject messageObject, long j, String str) {
        NotificationCenter notificationCenter = NotificationCenter.getInstance(messageObject.currentAccount);
        int i = NotificationCenter.voiceTranscriptionUpdate;
        Boolean bool = Boolean.TRUE;
        notificationCenter.postNotificationName(i, messageObject, Long.valueOf(j), str, bool, bool);
    }

    public static void showOffTranscribe(MessageObject messageObject) {
        showOffTranscribe(messageObject, true);
    }

    public static void showOffTranscribe(final MessageObject messageObject, boolean z) {
        TLRPC$Message tLRPC$Message;
        if (messageObject == null || (tLRPC$Message = messageObject.messageOwner) == null) {
            return;
        }
        tLRPC$Message.voiceTranscriptionForce = true;
        MessagesStorage.getInstance(messageObject.currentAccount).updateMessageVoiceTranscriptionOpen(messageObject.getDialogId(), messageObject.getId(), messageObject.messageOwner);
        if (z) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TranscribeButton.lambda$showOffTranscribe$7(MessageObject.this);
                }
            });
        }
    }

    public static void lambda$showOffTranscribe$7(MessageObject messageObject) {
        NotificationCenter.getInstance(messageObject.currentAccount).postNotificationName(NotificationCenter.voiceTranscriptionUpdate, messageObject);
    }
}

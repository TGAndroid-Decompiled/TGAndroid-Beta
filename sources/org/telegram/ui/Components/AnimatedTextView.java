package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import j$.wrappers.C$r8$wrapper$java$util$stream$IntStream$VWRP;
import j$.wrappers.C$r8$wrapper$java$util$stream$IntStream$WRP;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.AnimatedTextView;
public class AnimatedTextView extends View {
    public boolean adaptWidth;
    private AnimatedTextDrawable drawable;
    private boolean first;
    private int lastMaxWidth;
    private int maxWidth;
    private boolean toSetMoveDown;
    private CharSequence toSetText;

    public static class AnimatedTextDrawable extends Drawable {
        private boolean allowCancel;
        private int alpha;
        private long animateDelay;
        private long animateDuration;
        private TimeInterpolator animateInterpolator;
        private ValueAnimator animator;
        private android.graphics.Rect bounds;
        private float currentHeight;
        private Part[] currentParts;
        private CharSequence currentText;
        private float currentWidth;
        private int gravity;
        public boolean ignoreRTL;
        private boolean isRTL;
        private float moveAmplitude;
        private boolean moveDown;
        private float oldHeight;
        private Part[] oldParts;
        private CharSequence oldText;
        private float oldWidth;
        private Runnable onAnimationFinishListener;
        private boolean preserveIndex;
        private boolean splitByWords;
        private boolean startFromEnd;
        private float t;
        private TextPaint textPaint;
        private CharSequence toSetText;
        private boolean toSetTextMoveDown;

        public interface RegionCallback {
            void run(CharSequence charSequence, int i, int i2);
        }

        @Override
        @Deprecated
        public int getOpacity() {
            return -2;
        }

        public class Part {
            StaticLayout layout;
            float left;
            float offset;
            int toOppositeIndex;
            float width;

            public Part(AnimatedTextDrawable animatedTextDrawable, StaticLayout staticLayout, float f, int i) {
                this.layout = staticLayout;
                this.offset = f;
                this.toOppositeIndex = i;
                float f2 = 0.0f;
                this.left = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : staticLayout.getLineLeft(0);
                if (staticLayout != null && staticLayout.getLineCount() > 0) {
                    f2 = staticLayout.getLineWidth(0);
                }
                this.width = f2;
            }
        }

        public AnimatedTextDrawable() {
            this(false, false, false);
        }

        public AnimatedTextDrawable(boolean z, boolean z2, boolean z3) {
            this.textPaint = new TextPaint(1);
            this.gravity = 0;
            this.isRTL = false;
            this.t = 0.0f;
            this.moveDown = true;
            this.animateDelay = 0L;
            this.animateDuration = 450L;
            this.animateInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.moveAmplitude = 1.0f;
            this.alpha = 255;
            this.bounds = new android.graphics.Rect();
            this.splitByWords = z;
            this.preserveIndex = z2;
            this.startFromEnd = z3;
        }

        public void setAllowCancel(boolean z) {
            this.allowCancel = z;
        }

        public void setOnAnimationFinishListener(Runnable runnable) {
            this.onAnimationFinishListener = runnable;
        }

        @Override
        public void draw(Canvas canvas) {
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            canvas.save();
            android.graphics.Rect rect = this.bounds;
            canvas.translate(rect.left, rect.top);
            int width = this.bounds.width();
            int height = this.bounds.height();
            if (this.currentParts != null && this.oldParts != null) {
                float f10 = this.t;
                if (f10 != 1.0f) {
                    float lerp = AndroidUtilities.lerp(this.oldWidth, this.currentWidth, f10);
                    canvas.translate(0.0f, (height - AndroidUtilities.lerp(this.oldHeight, this.currentHeight, this.t)) / 2.0f);
                    int i = 0;
                    while (true) {
                        Part[] partArr = this.currentParts;
                        if (i >= partArr.length) {
                            break;
                        }
                        Part part = partArr[i];
                        int i2 = part.toOppositeIndex;
                        float f11 = part.offset;
                        if (i2 >= 0) {
                            boolean z = this.isRTL;
                            if (z && !this.ignoreRTL) {
                                f11 = this.currentWidth - (f11 + part.width);
                            }
                            Part part2 = this.oldParts[i2];
                            float f12 = part2.offset;
                            if (z && !this.ignoreRTL) {
                                f12 = this.oldWidth - (f12 + part2.width);
                            }
                            f7 = AndroidUtilities.lerp(f12 - part2.left, f11 - part.left, this.t);
                            this.textPaint.setAlpha(this.alpha);
                            f8 = 0.0f;
                        } else {
                            if (this.isRTL && !this.ignoreRTL) {
                                f11 = this.currentWidth - (f11 + part.width);
                            }
                            f7 = f11 - part.left;
                            float f13 = (-this.textPaint.getTextSize()) * this.moveAmplitude;
                            float f14 = this.t;
                            f8 = f13 * (1.0f - f14) * (this.moveDown ? 1.0f : -1.0f);
                            this.textPaint.setAlpha((int) (this.alpha * f14));
                        }
                        canvas.save();
                        float f15 = i2 >= 0 ? lerp : this.currentWidth;
                        int i3 = this.gravity;
                        if ((i3 | (-4)) != -1) {
                            if ((i3 | (-6)) != -1) {
                                if ((i3 | (-2)) == -1) {
                                    f9 = (width - f15) / 2.0f;
                                    f7 += f9;
                                } else if (this.isRTL) {
                                    if (this.ignoreRTL) {
                                    }
                                }
                            }
                            f9 = width - f15;
                            f7 += f9;
                        }
                        canvas.translate(f7, f8);
                        part.layout.draw(canvas);
                        canvas.restore();
                        i++;
                    }
                    int i4 = 0;
                    while (true) {
                        Part[] partArr2 = this.oldParts;
                        if (i4 >= partArr2.length) {
                            break;
                        }
                        Part part3 = partArr2[i4];
                        if (part3.toOppositeIndex < 0) {
                            float f16 = part3.offset;
                            float textSize = this.textPaint.getTextSize() * this.moveAmplitude;
                            float f17 = this.t;
                            float f18 = textSize * f17 * (this.moveDown ? 1.0f : -1.0f);
                            this.textPaint.setAlpha((int) (this.alpha * (1.0f - f17)));
                            canvas.save();
                            boolean z2 = this.isRTL;
                            if (z2 && !this.ignoreRTL) {
                                f16 = this.oldWidth - (f16 + part3.width);
                            }
                            float f19 = f16 - part3.left;
                            int i5 = this.gravity;
                            if ((i5 | (-4)) != -1) {
                                if ((i5 | (-6)) == -1) {
                                    f4 = width;
                                    f5 = this.oldWidth;
                                } else if ((i5 | (-2)) == -1) {
                                    f6 = (width - this.oldWidth) / 2.0f;
                                    f19 += f6;
                                } else if (z2 && !this.ignoreRTL) {
                                    f4 = width;
                                    f5 = this.oldWidth;
                                }
                                f6 = f4 - f5;
                                f19 += f6;
                            }
                            canvas.translate(f19, f18);
                            part3.layout.draw(canvas);
                            canvas.restore();
                        }
                        i4++;
                    }
                    canvas.restore();
                }
            }
            canvas.translate(0.0f, (height - this.currentHeight) / 2.0f);
            if (this.currentParts != null) {
                this.textPaint.setAlpha(this.alpha);
                for (int i6 = 0; i6 < this.currentParts.length; i6++) {
                    canvas.save();
                    Part part4 = this.currentParts[i6];
                    float f20 = part4.offset;
                    boolean z3 = this.isRTL;
                    if (z3 && !this.ignoreRTL) {
                        f20 = this.currentWidth - (f20 + part4.width);
                    }
                    float f21 = f20 - part4.left;
                    int i7 = this.gravity;
                    if ((i7 | (-4)) != -1) {
                        if ((i7 | (-6)) == -1) {
                            f = width;
                            f2 = this.currentWidth;
                        } else if ((i7 | (-2)) == -1) {
                            f3 = (width - this.currentWidth) / 2.0f;
                            f21 += f3;
                        } else if (z3 && !this.ignoreRTL) {
                            f = width;
                            f2 = this.currentWidth;
                        }
                        f3 = f - f2;
                        f21 += f3;
                    }
                    canvas.translate(f21, 0.0f);
                    part4.layout.draw(canvas);
                    canvas.restore();
                }
            }
            canvas.restore();
        }

        public void cancelAnimation() {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }

        public boolean isAnimating() {
            ValueAnimator valueAnimator = this.animator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        public void setText(CharSequence charSequence) {
            setText(charSequence, true);
        }

        public void setText(CharSequence charSequence, boolean z) {
            setText(charSequence, z, true);
        }

        public void setText(CharSequence charSequence, boolean z, boolean z2) {
            z = (this.currentText == null || charSequence == null) ? false : false;
            if (charSequence == null) {
                charSequence = "";
            }
            if (z) {
                if (this.allowCancel) {
                    ValueAnimator valueAnimator = this.animator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.animator = null;
                    }
                } else if (isAnimating()) {
                    this.toSetText = charSequence;
                    this.toSetTextMoveDown = z2;
                    return;
                }
                if (charSequence.equals(this.currentText)) {
                    return;
                }
                this.oldText = this.currentText;
                this.currentText = charSequence;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                this.currentHeight = 0.0f;
                this.currentWidth = 0.0f;
                this.oldHeight = 0.0f;
                this.oldWidth = 0.0f;
                this.isRTL = AndroidUtilities.isRTL(this.currentText);
                diff(this.splitByWords ? new WordSequence(this.oldText) : this.oldText, this.splitByWords ? new WordSequence(this.currentText) : this.currentText, new RegionCallback() {
                    @Override
                    public final void run(CharSequence charSequence2, int i, int i2) {
                        AnimatedTextView.AnimatedTextDrawable.this.lambda$setText$0(arrayList2, arrayList, charSequence2, i, i2);
                    }
                }, new RegionCallback() {
                    @Override
                    public final void run(CharSequence charSequence2, int i, int i2) {
                        AnimatedTextView.AnimatedTextDrawable.this.lambda$setText$1(arrayList, charSequence2, i, i2);
                    }
                }, new RegionCallback() {
                    @Override
                    public final void run(CharSequence charSequence2, int i, int i2) {
                        AnimatedTextView.AnimatedTextDrawable.this.lambda$setText$2(arrayList2, charSequence2, i, i2);
                    }
                });
                Part[] partArr = this.currentParts;
                if (partArr == null || partArr.length != arrayList.size()) {
                    this.currentParts = new Part[arrayList.size()];
                }
                arrayList.toArray(this.currentParts);
                Part[] partArr2 = this.oldParts;
                if (partArr2 == null || partArr2.length != arrayList2.size()) {
                    this.oldParts = new Part[arrayList2.size()];
                }
                arrayList2.toArray(this.oldParts);
                ValueAnimator valueAnimator2 = this.animator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.moveDown = z2;
                this.t = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.animator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        AnimatedTextView.AnimatedTextDrawable.this.lambda$setText$3(valueAnimator3);
                    }
                });
                this.animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        AnimatedTextDrawable.this.oldParts = null;
                        AnimatedTextDrawable.this.oldText = null;
                        AnimatedTextDrawable.this.oldWidth = 0.0f;
                        AnimatedTextDrawable.this.t = 0.0f;
                        AnimatedTextDrawable.this.invalidateSelf();
                        AnimatedTextDrawable.this.animator = null;
                        if (AnimatedTextDrawable.this.toSetText == null) {
                            if (AnimatedTextDrawable.this.onAnimationFinishListener != null) {
                                AnimatedTextDrawable.this.onAnimationFinishListener.run();
                                return;
                            }
                            return;
                        }
                        AnimatedTextDrawable animatedTextDrawable = AnimatedTextDrawable.this;
                        animatedTextDrawable.setText(animatedTextDrawable.toSetText, true, AnimatedTextDrawable.this.toSetTextMoveDown);
                        AnimatedTextDrawable.this.toSetText = null;
                        AnimatedTextDrawable.this.toSetTextMoveDown = false;
                    }
                });
                this.animator.setStartDelay(this.animateDelay);
                this.animator.setDuration(this.animateDuration);
                this.animator.setInterpolator(this.animateInterpolator);
                this.animator.start();
                return;
            }
            ValueAnimator valueAnimator3 = this.animator;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            this.animator = null;
            this.toSetText = null;
            this.toSetTextMoveDown = false;
            this.t = 0.0f;
            if (!charSequence.equals(this.currentText)) {
                this.currentParts = r11;
                this.currentText = charSequence;
                Part[] partArr3 = {new Part(this, makeLayout(charSequence, this.bounds.width()), 0.0f, -1)};
                Part[] partArr4 = this.currentParts;
                this.currentWidth = partArr4[0].width;
                this.currentHeight = partArr4[0].layout.getHeight();
                this.isRTL = AndroidUtilities.isRTL(this.currentText);
            }
            this.oldParts = null;
            this.oldText = null;
            this.oldWidth = 0.0f;
            this.oldHeight = 0.0f;
            invalidateSelf();
        }

        public void lambda$setText$0(ArrayList arrayList, ArrayList arrayList2, CharSequence charSequence, int i, int i2) {
            StaticLayout makeLayout = makeLayout(charSequence, this.bounds.width() - ((int) Math.ceil(Math.min(this.currentWidth, this.oldWidth))));
            Part part = new Part(this, makeLayout, this.currentWidth, arrayList.size());
            Part part2 = new Part(this, makeLayout, this.oldWidth, arrayList.size());
            arrayList2.add(part);
            arrayList.add(part2);
            float f = part.width;
            this.currentWidth += f;
            this.oldWidth += f;
            this.currentHeight = Math.max(this.currentHeight, makeLayout.getHeight());
            this.oldHeight = Math.max(this.oldHeight, makeLayout.getHeight());
        }

        public void lambda$setText$1(ArrayList arrayList, CharSequence charSequence, int i, int i2) {
            StaticLayout makeLayout;
            Part part = new Part(this, makeLayout(charSequence, this.bounds.width() - ((int) Math.ceil(this.currentWidth))), this.currentWidth, -1);
            arrayList.add(part);
            this.currentWidth += part.width;
            this.currentHeight = Math.max(this.currentHeight, makeLayout.getHeight());
        }

        public void lambda$setText$2(ArrayList arrayList, CharSequence charSequence, int i, int i2) {
            StaticLayout makeLayout;
            Part part = new Part(this, makeLayout(charSequence, this.bounds.width() - ((int) Math.ceil(this.oldWidth))), this.oldWidth, -1);
            arrayList.add(part);
            this.oldWidth += part.width;
            this.oldHeight = Math.max(this.oldHeight, makeLayout.getHeight());
        }

        public void lambda$setText$3(ValueAnimator valueAnimator) {
            this.t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidateSelf();
        }

        public CharSequence getText() {
            return this.currentText;
        }

        public float getWidth() {
            return Math.max(this.currentWidth, this.oldWidth);
        }

        public float getCurrentWidth() {
            if (this.currentParts != null && this.oldParts != null) {
                return AndroidUtilities.lerp(this.oldWidth, this.currentWidth, this.t);
            }
            return this.currentWidth;
        }

        public float getHeight() {
            return this.currentHeight;
        }

        private StaticLayout makeLayout(CharSequence charSequence, int i) {
            if (i <= 0) {
                android.graphics.Point point = AndroidUtilities.displaySize;
                i = Math.min(point.x, point.y);
            }
            int i2 = i;
            if (Build.VERSION.SDK_INT >= 23) {
                return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.textPaint, i2).setMaxLines(1).setLineSpacing(0.0f, 1.0f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i2).build();
            }
            return new StaticLayout(charSequence, 0, charSequence.length(), this.textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, i2);
        }

        public static class WordSequence implements CharSequence {
            private final int length;
            private CharSequence[] words;

            @Override
            public IntStream chars() {
                return C$r8$wrapper$java$util$stream$IntStream$WRP.convert(chars());
            }

            @Override
            public IntStream codePoints() {
                return C$r8$wrapper$java$util$stream$IntStream$WRP.convert(codePoints());
            }

            public WordSequence(CharSequence charSequence) {
                if (charSequence == null) {
                    this.words = new CharSequence[0];
                    this.length = 0;
                    return;
                }
                this.length = charSequence.length();
                int i = 0;
                for (int i2 = 0; i2 < this.length; i2++) {
                    if (charSequence.charAt(i2) == ' ') {
                        i++;
                    }
                }
                this.words = new CharSequence[i + 1];
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int i6 = this.length;
                    if (i3 > i6) {
                        return;
                    }
                    if (i3 == i6 || charSequence.charAt(i3) == ' ') {
                        int i7 = i4 + 1;
                        this.words[i4] = charSequence.subSequence(i5, (i3 < this.length ? 1 : 0) + i3);
                        i5 = i3 + 1;
                        i4 = i7;
                    }
                    i3++;
                }
            }

            public CharSequence wordAt(int i) {
                if (i >= 0) {
                    CharSequence[] charSequenceArr = this.words;
                    if (i >= charSequenceArr.length) {
                        return null;
                    }
                    return charSequenceArr[i];
                }
                return null;
            }

            @Override
            public int length() {
                return this.words.length;
            }

            @Override
            public char charAt(int i) {
                int i2 = 0;
                while (true) {
                    CharSequence[] charSequenceArr = this.words;
                    if (i2 >= charSequenceArr.length) {
                        return (char) 0;
                    }
                    if (i < charSequenceArr[i2].length()) {
                        return this.words[i2].charAt(i);
                    }
                    i -= this.words[i2].length();
                    i2++;
                }
            }

            @Override
            public CharSequence subSequence(int i, int i2) {
                return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.words, i, i2));
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (true) {
                    CharSequence[] charSequenceArr = this.words;
                    if (i < charSequenceArr.length) {
                        sb.append(charSequenceArr[i]);
                        i++;
                    } else {
                        return sb.toString();
                    }
                }
            }

            public CharSequence toCharSequence() {
                return TextUtils.concat(this.words);
            }

            @Override
            public j$.util.stream.IntStream chars() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return C$r8$wrapper$java$util$stream$IntStream$VWRP.convert(toCharSequence().chars());
                }
                return null;
            }

            @Override
            public j$.util.stream.IntStream codePoints() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return C$r8$wrapper$java$util$stream$IntStream$VWRP.convert(toCharSequence().codePoints());
                }
                return null;
            }
        }

        public static boolean partEquals(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
            if (!(charSequence instanceof WordSequence) || !(charSequence2 instanceof WordSequence)) {
                if (charSequence == null && charSequence2 == null) {
                    return true;
                }
                return (charSequence == null || charSequence2 == null || charSequence.charAt(i) != charSequence2.charAt(i2)) ? false : true;
            }
            CharSequence wordAt = ((WordSequence) charSequence).wordAt(i);
            CharSequence wordAt2 = ((WordSequence) charSequence2).wordAt(i2);
            if (wordAt == null && wordAt2 == null) {
                return true;
            }
            return wordAt != null && wordAt.equals(wordAt2);
        }

        private void diff(CharSequence charSequence, CharSequence charSequence2, RegionCallback regionCallback, RegionCallback regionCallback2, RegionCallback regionCallback3) {
            if (this.preserveIndex) {
                int min = Math.min(charSequence2.length(), charSequence.length());
                if (this.startFromEnd) {
                    ArrayList arrayList = new ArrayList();
                    boolean z = true;
                    int i = 0;
                    boolean z2 = true;
                    for (int i2 = 0; i2 <= min; i2++) {
                        int length = (charSequence2.length() - i2) - 1;
                        int length2 = (charSequence.length() - i2) - 1;
                        boolean z3 = length >= 0 && length2 >= 0 && partEquals(charSequence2, charSequence, length, length2);
                        if (z != z3 || i2 == min) {
                            int i3 = i2 - i;
                            if (i3 > 0) {
                                if (arrayList.size() != 0) {
                                    z = z2;
                                }
                                arrayList.add(Integer.valueOf(i3));
                                z2 = z;
                            }
                            i = i2;
                            z = z3;
                        }
                    }
                    int length3 = charSequence2.length() - min;
                    int length4 = charSequence.length() - min;
                    if (length3 > 0) {
                        regionCallback2.run(charSequence2.subSequence(0, length3), 0, length3);
                    }
                    if (length4 > 0) {
                        regionCallback3.run(charSequence.subSequence(0, length4), 0, length4);
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        int intValue = ((Integer) arrayList.get(size)).intValue();
                        if (size % 2 != 0 ? !z2 : z2) {
                            if (charSequence2.length() > charSequence.length()) {
                                int i4 = length3 + intValue;
                                regionCallback.run(charSequence2.subSequence(length3, i4), length3, i4);
                            } else {
                                int i5 = length4 + intValue;
                                regionCallback.run(charSequence.subSequence(length4, i5), length4, i5);
                            }
                        } else {
                            int i6 = length3 + intValue;
                            regionCallback2.run(charSequence2.subSequence(length3, i6), length3, i6);
                            int i7 = length4 + intValue;
                            regionCallback3.run(charSequence.subSequence(length4, i7), length4, i7);
                        }
                        length3 += intValue;
                        length4 += intValue;
                    }
                    return;
                }
                int i8 = 0;
                boolean z4 = true;
                int i9 = 0;
                while (i8 <= min) {
                    boolean z5 = i8 < min && partEquals(charSequence2, charSequence, i8, i8);
                    if (z4 != z5 || i8 == min) {
                        if (i8 - i9 > 0) {
                            if (z4) {
                                regionCallback.run(charSequence2.subSequence(i9, i8), i9, i8);
                            } else {
                                regionCallback2.run(charSequence2.subSequence(i9, i8), i9, i8);
                                regionCallback3.run(charSequence.subSequence(i9, i8), i9, i8);
                            }
                        }
                        i9 = i8;
                        z4 = z5;
                    }
                    i8++;
                }
                if (charSequence2.length() - min > 0) {
                    regionCallback2.run(charSequence2.subSequence(min, charSequence2.length()), min, charSequence2.length());
                }
                if (charSequence.length() - min > 0) {
                    regionCallback3.run(charSequence.subSequence(min, charSequence.length()), min, charSequence.length());
                    return;
                }
                return;
            }
            int min2 = Math.min(charSequence2.length(), charSequence.length());
            int i10 = 0;
            int i11 = 0;
            boolean z6 = true;
            int i12 = 0;
            int i13 = 0;
            while (i10 <= min2) {
                boolean z7 = i10 < min2 && partEquals(charSequence2, charSequence, i10, i11);
                if (z6 != z7 || i10 == min2) {
                    if (i10 == min2) {
                        i10 = charSequence2.length();
                        i11 = charSequence.length();
                    }
                    int i14 = i10 - i12;
                    int i15 = i11 - i13;
                    if (i14 > 0 || i15 > 0) {
                        if (i14 == i15 && z6) {
                            regionCallback.run(charSequence2.subSequence(i12, i10), i12, i10);
                        } else {
                            if (i14 > 0) {
                                regionCallback2.run(charSequence2.subSequence(i12, i10), i12, i10);
                            }
                            if (i15 > 0) {
                                regionCallback3.run(charSequence.subSequence(i13, i11), i13, i11);
                            }
                        }
                    }
                    i12 = i10;
                    i13 = i11;
                    z6 = z7;
                }
                if (z7) {
                    i11++;
                }
                i10++;
            }
        }

        public void setTextSize(float f) {
            this.textPaint.setTextSize(f);
        }

        public float getTextSize() {
            return this.textPaint.getTextSize();
        }

        public void setTextColor(int i) {
            this.textPaint.setColor(i);
            this.alpha = Color.alpha(i);
        }

        public int getTextColor() {
            return this.textPaint.getColor();
        }

        public void setTypeface(Typeface typeface) {
            this.textPaint.setTypeface(typeface);
        }

        public void setGravity(int i) {
            this.gravity = i;
        }

        public void setAnimationProperties(float f, long j, long j2, TimeInterpolator timeInterpolator) {
            this.moveAmplitude = f;
            this.animateDelay = j;
            this.animateDuration = j2;
            this.animateInterpolator = timeInterpolator;
        }

        public TextPaint getPaint() {
            return this.textPaint;
        }

        @Override
        public void setAlpha(int i) {
            this.alpha = i;
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.textPaint.setColorFilter(colorFilter);
        }

        @Override
        public void setBounds(android.graphics.Rect rect) {
            super.setBounds(rect);
            this.bounds.set(rect);
        }

        @Override
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            this.bounds.set(i, i2, i3, i4);
        }

        @Override
        public android.graphics.Rect getDirtyBounds() {
            return this.bounds;
        }
    }

    public AnimatedTextView(Context context) {
        this(context, false, false, false);
    }

    public AnimatedTextView(Context context, boolean z, boolean z2, boolean z3) {
        super(context);
        this.adaptWidth = true;
        this.first = true;
        AnimatedTextDrawable animatedTextDrawable = new AnimatedTextDrawable(z, z2, z3);
        this.drawable = animatedTextDrawable;
        animatedTextDrawable.setCallback(this);
        this.drawable.setOnAnimationFinishListener(new Runnable() {
            @Override
            public final void run() {
                AnimatedTextView.this.lambda$new$0();
            }
        });
    }

    public void lambda$new$0() {
        CharSequence charSequence = this.toSetText;
        if (charSequence != null) {
            setText(charSequence, this.toSetMoveDown, true);
            this.toSetText = null;
            this.toSetMoveDown = false;
        }
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    @Override
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = this.maxWidth;
        if (i3 > 0) {
            size = Math.min(size, i3);
        }
        if (this.lastMaxWidth != size && getLayoutParams().width != 0) {
            this.drawable.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            setText(this.drawable.getText(), false);
        }
        this.lastMaxWidth = size;
        if (this.adaptWidth && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.drawable.getWidth()));
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public void onDraw(Canvas canvas) {
        this.drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        this.drawable.draw(canvas);
    }

    public void setText(CharSequence charSequence) {
        setText(charSequence, true, true);
    }

    public void setText(CharSequence charSequence, boolean z) {
        setText(charSequence, z, true);
    }

    public void cancelAnimation() {
        this.drawable.cancelAnimation();
    }

    public boolean isAnimating() {
        return this.drawable.isAnimating();
    }

    public void setIgnoreRTL(boolean z) {
        this.drawable.ignoreRTL = z;
    }

    public void setText(CharSequence charSequence, boolean z, boolean z2) {
        boolean z3 = !this.first && z;
        this.first = false;
        if (z3) {
            if (this.drawable.allowCancel) {
                if (this.drawable.animator != null) {
                    this.drawable.animator.cancel();
                    this.drawable.animator = null;
                }
            } else if (this.drawable.isAnimating()) {
                this.toSetText = charSequence;
                this.toSetMoveDown = z2;
                return;
            }
        }
        this.drawable.setBounds(getPaddingLeft(), getPaddingTop(), this.lastMaxWidth - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        this.drawable.setText(charSequence, z3, z2);
        float width = (int) this.drawable.getWidth();
        if (width < this.drawable.getWidth() || !(z3 || width == this.drawable.getWidth())) {
            requestLayout();
        }
    }

    public int width() {
        return getPaddingLeft() + ((int) Math.ceil(this.drawable.getCurrentWidth())) + getPaddingRight();
    }

    public CharSequence getText() {
        return this.drawable.getText();
    }

    public int getTextHeight() {
        return getPaint().getFontMetricsInt().descent - getPaint().getFontMetricsInt().ascent;
    }

    public void setTextSize(float f) {
        this.drawable.setTextSize(f);
    }

    public void setTextColor(int i) {
        this.drawable.setTextColor(i);
        invalidate();
    }

    public int getTextColor() {
        return this.drawable.getTextColor();
    }

    public void setTypeface(Typeface typeface) {
        this.drawable.setTypeface(typeface);
    }

    public void setGravity(int i) {
        this.drawable.setGravity(i);
    }

    public void setAnimationProperties(float f, long j, long j2, TimeInterpolator timeInterpolator) {
        this.drawable.setAnimationProperties(f, j, j2, timeInterpolator);
    }

    public AnimatedTextDrawable getDrawable() {
        return this.drawable;
    }

    public TextPaint getPaint() {
        return this.drawable.getPaint();
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(getText());
    }
}

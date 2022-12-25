package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.Components.AnimatedTextView;
import p008j$.wrappers.C$r8$wrapper$java$util$stream$IntStream$VWRP;
import p008j$.wrappers.C$r8$wrapper$java$util$stream$IntStream$WRP;

public class AnimatedTextView extends View {
    private AnimatedTextDrawable drawable;
    private boolean first;
    private int lastMaxWidth;
    private boolean toSetMoveDown;
    private CharSequence toSetText;

    public static class AnimatedTextDrawable extends Drawable {
        private boolean allowCancel;
        private ValueAnimator animator;
        private int currentHeight;
        private StaticLayout[] currentLayout;
        private Integer[] currentLayoutOffsets;
        private Integer[] currentLayoutToOldIndex;
        private CharSequence currentText;
        private int currentWidth;
        public boolean ignoreRTL;
        private int oldHeight;
        private StaticLayout[] oldLayout;
        private Integer[] oldLayoutOffsets;
        private Integer[] oldLayoutToCurrentIndex;
        private CharSequence oldText;
        private int oldWidth;
        private Runnable onAnimationFinishListener;
        private boolean preserveIndex;
        private boolean splitByWords;
        private boolean startFromEnd;
        private CharSequence toSetText;
        private boolean toSetTextMoveDown;
        private TextPaint textPaint = new TextPaint(1);
        private int gravity = 0;
        private boolean isRTL = false;
        private float f1032t = 0.0f;
        private boolean moveDown = true;
        private long animateDelay = 0;
        private long animateDuration = 450;
        private TimeInterpolator animateInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        private float moveAmplitude = 1.0f;
        private int alpha = 255;
        private Rect bounds = new Rect();

        public interface RegionCallback {
            void run(CharSequence charSequence, int i, int i2);
        }

        @Override
        @Deprecated
        public int getOpacity() {
            return -2;
        }

        public AnimatedTextDrawable(boolean z, boolean z2, boolean z3) {
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
            int i;
            float f;
            int i2;
            float f2;
            float f3;
            float f4;
            canvas.save();
            Rect rect = this.bounds;
            canvas.translate(rect.left, rect.top);
            int width = this.bounds.width();
            int height = this.bounds.height();
            int i3 = 0;
            if (this.currentLayout != null && this.oldLayout != null) {
                float f5 = this.f1032t;
                if (f5 != 1.0f) {
                    int lerp = AndroidUtilities.lerp(this.oldWidth, this.currentWidth, f5);
                    canvas.translate(0.0f, (height - AndroidUtilities.lerp(this.oldHeight, this.currentHeight, this.f1032t)) / 2.0f);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= this.currentLayout.length) {
                            break;
                        }
                        int intValue = this.currentLayoutToOldIndex[i4].intValue();
                        float intValue2 = this.currentLayoutOffsets[i4].intValue();
                        if (intValue >= 0) {
                            intValue2 = AndroidUtilities.lerp(this.oldLayoutOffsets[intValue].intValue(), intValue2, this.f1032t);
                            this.textPaint.setAlpha(this.alpha);
                            f3 = 0.0f;
                        } else {
                            float f6 = (-this.textPaint.getTextSize()) * this.moveAmplitude;
                            float f7 = this.f1032t;
                            f3 = f6 * (1.0f - f7) * (this.moveDown ? 1.0f : -1.0f);
                            this.textPaint.setAlpha((int) (this.alpha * f7));
                        }
                        canvas.save();
                        int i5 = intValue >= 0 ? lerp : this.currentWidth;
                        if (this.isRTL && !this.ignoreRTL) {
                            intValue2 = (((-intValue2) + (i5 * 2)) - this.currentLayout[i4].getWidth()) - width;
                        }
                        int i6 = this.gravity;
                        if ((i6 | (-4)) != -1) {
                            if ((i6 | (-6)) != -1) {
                                if ((i6 | (-2)) == -1) {
                                    f4 = (width - i5) / 2.0f;
                                    intValue2 += f4;
                                } else if (this.isRTL) {
                                    if (this.ignoreRTL) {
                                    }
                                }
                            }
                            f4 = width - i5;
                            intValue2 += f4;
                        }
                        canvas.translate(intValue2, f3);
                        this.currentLayout[i4].draw(canvas);
                        canvas.restore();
                        i4++;
                    }
                    while (i3 < this.oldLayout.length) {
                        if (this.oldLayoutToCurrentIndex[i3].intValue() < 0) {
                            float intValue3 = this.oldLayoutOffsets[i3].intValue();
                            float textSize = this.textPaint.getTextSize() * this.moveAmplitude;
                            float f8 = this.f1032t;
                            float f9 = textSize * f8 * (this.moveDown ? 1.0f : -1.0f);
                            this.textPaint.setAlpha((int) (this.alpha * (1.0f - f8)));
                            canvas.save();
                            if (this.isRTL && !this.ignoreRTL) {
                                intValue3 = (((-intValue3) + (this.oldWidth * 2)) - this.oldLayout[i3].getWidth()) - width;
                            }
                            int i7 = this.gravity;
                            if ((i7 | (-4)) != -1) {
                                if ((i7 | (-6)) == -1) {
                                    i2 = this.oldWidth;
                                } else if ((i7 | (-2)) == -1) {
                                    f2 = (width - this.oldWidth) / 2.0f;
                                    intValue3 += f2;
                                } else if (this.isRTL && !this.ignoreRTL) {
                                    i2 = this.oldWidth;
                                }
                                f2 = width - i2;
                                intValue3 += f2;
                            }
                            canvas.translate(intValue3, f9);
                            this.oldLayout[i3].draw(canvas);
                            canvas.restore();
                        }
                        i3++;
                    }
                    canvas.restore();
                }
            }
            canvas.translate(0.0f, (height - this.currentHeight) / 2.0f);
            if (this.currentLayout != null) {
                while (i3 < this.currentLayout.length) {
                    this.textPaint.setAlpha(this.alpha);
                    canvas.save();
                    float intValue4 = this.currentLayoutOffsets[i3].intValue();
                    if (this.isRTL && !this.ignoreRTL) {
                        intValue4 = (((-intValue4) + (this.currentWidth * 2)) - this.currentLayout[i3].getWidth()) - width;
                    }
                    int i8 = this.gravity;
                    if ((i8 | (-4)) != -1) {
                        if ((i8 | (-6)) == -1) {
                            i = this.currentWidth;
                        } else if ((i8 | (-2)) == -1) {
                            f = (width - this.currentWidth) / 2.0f;
                            intValue4 += f;
                        } else if (this.isRTL && !this.ignoreRTL) {
                            i = this.currentWidth;
                        }
                        f = width - i;
                        intValue4 += f;
                    }
                    canvas.translate(intValue4, 0.0f);
                    this.currentLayout[i3].draw(canvas);
                    canvas.restore();
                    i3++;
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
            boolean z3 = (this.currentText == null || charSequence == null) ? false : z;
            String str = charSequence == null ? "" : charSequence;
            if (z3) {
                if (this.allowCancel) {
                    ValueAnimator valueAnimator = this.animator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.animator = null;
                    }
                } else if (isAnimating()) {
                    this.toSetText = str;
                    this.toSetTextMoveDown = z2;
                    return;
                }
                if (str.equals(this.currentText)) {
                    return;
                }
                this.oldText = this.currentText;
                this.currentText = str;
                this.currentLayout = null;
                this.oldLayout = null;
                final ArrayList arrayList = new ArrayList();
                final ArrayList arrayList2 = new ArrayList();
                final ArrayList arrayList3 = new ArrayList();
                final ArrayList arrayList4 = new ArrayList();
                final ArrayList arrayList5 = new ArrayList();
                final ArrayList arrayList6 = new ArrayList();
                this.currentHeight = 0;
                this.currentWidth = 0;
                this.oldHeight = 0;
                this.oldWidth = 0;
                diff(this.splitByWords ? new WordSequence(this.oldText) : this.oldText, this.splitByWords ? new WordSequence(this.currentText) : this.currentText, new RegionCallback() {
                    @Override
                    public final void run(CharSequence charSequence2, int i, int i2) {
                        AnimatedTextView.AnimatedTextDrawable.this.lambda$setText$0(arrayList5, arrayList3, arrayList2, arrayList6, arrayList, arrayList4, charSequence2, i, i2);
                    }
                }, new RegionCallback() {
                    @Override
                    public final void run(CharSequence charSequence2, int i, int i2) {
                        AnimatedTextView.AnimatedTextDrawable.this.lambda$setText$1(arrayList, arrayList3, arrayList2, charSequence2, i, i2);
                    }
                }, new RegionCallback() {
                    @Override
                    public final void run(CharSequence charSequence2, int i, int i2) {
                        AnimatedTextView.AnimatedTextDrawable.this.lambda$setText$2(arrayList4, arrayList6, arrayList5, charSequence2, i, i2);
                    }
                });
                StaticLayout[] staticLayoutArr = this.currentLayout;
                if (staticLayoutArr == null || staticLayoutArr.length != arrayList3.size()) {
                    this.currentLayout = new StaticLayout[arrayList3.size()];
                }
                arrayList3.toArray(this.currentLayout);
                Integer[] numArr = this.currentLayoutOffsets;
                if (numArr == null || numArr.length != arrayList.size()) {
                    this.currentLayoutOffsets = new Integer[arrayList.size()];
                }
                arrayList.toArray(this.currentLayoutOffsets);
                Integer[] numArr2 = this.currentLayoutToOldIndex;
                if (numArr2 == null || numArr2.length != arrayList2.size()) {
                    this.currentLayoutToOldIndex = new Integer[arrayList2.size()];
                }
                arrayList2.toArray(this.currentLayoutToOldIndex);
                StaticLayout[] staticLayoutArr2 = this.oldLayout;
                if (staticLayoutArr2 == null || staticLayoutArr2.length != arrayList6.size()) {
                    this.oldLayout = new StaticLayout[arrayList6.size()];
                }
                arrayList6.toArray(this.oldLayout);
                Integer[] numArr3 = this.oldLayoutOffsets;
                if (numArr3 == null || numArr3.length != arrayList4.size()) {
                    this.oldLayoutOffsets = new Integer[arrayList4.size()];
                }
                arrayList4.toArray(this.oldLayoutOffsets);
                Integer[] numArr4 = this.oldLayoutToCurrentIndex;
                if (numArr4 == null || numArr4.length != arrayList5.size()) {
                    this.oldLayoutToCurrentIndex = new Integer[arrayList5.size()];
                }
                arrayList5.toArray(this.oldLayoutToCurrentIndex);
                StaticLayout[] staticLayoutArr3 = this.currentLayout;
                if (staticLayoutArr3.length > 0) {
                    this.isRTL = staticLayoutArr3[0].isRtlCharAt(0);
                } else {
                    StaticLayout[] staticLayoutArr4 = this.oldLayout;
                    if (staticLayoutArr4.length > 0) {
                        this.isRTL = staticLayoutArr4[0].isRtlCharAt(0);
                    }
                }
                ValueAnimator valueAnimator2 = this.animator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                this.moveDown = z2;
                this.f1032t = 0.0f;
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
                        AnimatedTextDrawable.this.oldLayout = null;
                        AnimatedTextDrawable.this.oldLayoutOffsets = null;
                        AnimatedTextDrawable.this.oldLayoutToCurrentIndex = null;
                        AnimatedTextDrawable.this.oldText = null;
                        AnimatedTextDrawable.this.oldWidth = 0;
                        AnimatedTextDrawable.this.f1032t = 0.0f;
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
            this.f1032t = 0.0f;
            this.currentLayout = r4;
            this.currentText = str;
            StaticLayout[] staticLayoutArr5 = {makeLayout(str, this.bounds.width())};
            this.currentWidth = (int) this.currentLayout[0].getLineWidth(0);
            this.currentHeight = this.currentLayout[0].getHeight();
            this.currentLayoutOffsets = r1;
            Integer[] numArr5 = {0};
            this.currentLayoutToOldIndex = r1;
            Integer[] numArr6 = {-1};
            StaticLayout[] staticLayoutArr6 = this.currentLayout;
            if (staticLayoutArr6.length > 0) {
                this.isRTL = staticLayoutArr6[0].isRtlCharAt(0);
            }
            this.oldLayout = null;
            this.oldLayoutOffsets = null;
            this.oldLayoutToCurrentIndex = null;
            this.oldText = null;
            this.oldWidth = 0;
            this.oldHeight = 0;
            invalidateSelf();
        }

        public void lambda$setText$0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, CharSequence charSequence, int i, int i2) {
            StaticLayout makeLayout = makeLayout(charSequence, this.bounds.width() - Math.min(this.currentWidth, this.oldWidth));
            arrayList.add(Integer.valueOf(arrayList2.size()));
            arrayList3.add(Integer.valueOf(arrayList4.size()));
            arrayList5.add(Integer.valueOf(this.currentWidth));
            arrayList2.add(makeLayout);
            arrayList6.add(Integer.valueOf(this.oldWidth));
            arrayList4.add(makeLayout);
            float lineWidth = makeLayout.getLineWidth(0);
            this.currentWidth = (int) (this.currentWidth + lineWidth);
            this.oldWidth = (int) (this.oldWidth + lineWidth);
            this.currentHeight = Math.max(this.currentHeight, makeLayout.getHeight());
            this.oldHeight = Math.max(this.oldHeight, makeLayout.getHeight());
        }

        public void lambda$setText$1(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CharSequence charSequence, int i, int i2) {
            StaticLayout makeLayout = makeLayout(charSequence, this.bounds.width() - this.currentWidth);
            arrayList.add(Integer.valueOf(this.currentWidth));
            arrayList2.add(makeLayout);
            arrayList3.add(-1);
            this.currentWidth = (int) (this.currentWidth + makeLayout.getLineWidth(0));
            this.currentHeight = Math.max(this.currentHeight, makeLayout.getHeight());
        }

        public void lambda$setText$2(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, CharSequence charSequence, int i, int i2) {
            StaticLayout makeLayout = makeLayout(charSequence, this.bounds.width() - this.oldWidth);
            arrayList.add(Integer.valueOf(this.oldWidth));
            arrayList2.add(makeLayout);
            arrayList3.add(-1);
            this.oldWidth = (int) (this.oldWidth + makeLayout.getLineWidth(0));
            this.oldHeight = Math.max(this.oldHeight, makeLayout.getHeight());
        }

        public void lambda$setText$3(ValueAnimator valueAnimator) {
            this.f1032t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidateSelf();
        }

        public CharSequence getText() {
            return this.currentText;
        }

        public int getWidth() {
            return Math.max(this.currentWidth, this.oldWidth);
        }

        public int getCurrentWidth() {
            if (this.currentLayout != null && this.oldLayout != null) {
                return AndroidUtilities.lerp(this.oldWidth, this.currentWidth, this.f1032t);
            }
            return this.currentWidth;
        }

        private StaticLayout makeLayout(CharSequence charSequence, int i) {
            if (i <= 0) {
                Point point = AndroidUtilities.displaySize;
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
            public p008j$.util.stream.IntStream chars() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return C$r8$wrapper$java$util$stream$IntStream$VWRP.convert(toCharSequence().chars());
                }
                return null;
            }

            @Override
            public p008j$.util.stream.IntStream codePoints() {
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
        public void setBounds(Rect rect) {
            super.setBounds(rect);
            this.bounds.set(rect);
        }

        @Override
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            this.bounds.set(i, i2, i3, i4);
        }

        @Override
        public Rect getDirtyBounds() {
            return this.bounds;
        }
    }

    public AnimatedTextView(Context context) {
        this(context, false, false, false);
    }

    public AnimatedTextView(Context context, boolean z, boolean z2, boolean z3) {
        super(context);
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

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.lastMaxWidth != size && getLayoutParams().width != 0) {
            this.drawable.setBounds(getPaddingLeft(), getPaddingTop(), size - getPaddingRight(), size2 - getPaddingBottom());
            setText(this.drawable.getText(), false);
        }
        this.lastMaxWidth = size;
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + this.drawable.getWidth();
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
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

    private void setIgnoreRTL(boolean z) {
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
        int width = this.drawable.getWidth();
        this.drawable.setBounds(getPaddingLeft(), getPaddingTop(), this.lastMaxWidth - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        this.drawable.setText(charSequence, z3, z2);
        if (width < this.drawable.getWidth() || !(z3 || width == this.drawable.getWidth())) {
            requestLayout();
        }
    }

    public int width() {
        return getPaddingLeft() + this.drawable.getCurrentWidth() + getPaddingRight();
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

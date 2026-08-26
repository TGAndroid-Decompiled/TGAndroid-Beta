package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.graphics.ColorUtils;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;

public class AnimatedTextView extends View {
    public boolean adaptWidth;
    private Drawable backgroundDrawable;
    private final AnimatedTextDrawable drawable;
    private boolean first;
    private boolean hideBackgroundIfEmpty;
    private int lastMaxWidth;
    private int maxWidth;
    private boolean toSetMoveDown;
    private CharSequence toSetText;
    private Runnable widthUpdatedListener;

    public static class AnimatedTextDrawable extends Drawable {
        private boolean allowCancel;
        private int alpha;
        private long animateDelay;
        private long animateDuration;
        private TimeInterpolator animateInterpolator;
        private float animateWave;
        private ValueAnimator animator;
        private final Rect bounds;
        public boolean centerY;
        private ValueAnimator colorAnimator;
        private float currentHeight;
        private Part[] currentParts;
        private CharSequence currentText;
        private float currentWidth;
        private boolean ellipsizeByGradient;
        private LinearGradient ellipsizeGradient;
        private Matrix ellipsizeGradientMatrix;
        private Paint ellipsizePaint;
        private int emojiCacheType;
        private int emojiColor;
        private ValueAnimator emojiColorAnimator;
        private ColorFilter emojiColorFilter;
        private boolean enforceByLetter;
        private int gravity;
        public boolean ignoreRTL;
        private boolean includeFontPadding;
        private boolean isRTL;
        private float moveAmplitude;
        private boolean moveDown;
        private float oldHeight;
        private Part[] oldParts;
        private CharSequence oldText;
        private float oldWidth;
        private Runnable onAnimationFinishListener;
        private int overrideFullWidth;
        private boolean preserveIndex;
        private float rightPadding;
        private float scaleAmplitude;
        private int shadowColor;
        private float shadowDx;
        private float shadowDy;
        private float shadowRadius;
        private boolean shadowed;
        private boolean splitByWords;
        private boolean startFromEnd;
        private float t;
        private final TextPaint textPaint;
        private CharSequence toSetText;
        private boolean toSetTextMoveDown;
        public boolean updateAll;
        private Runnable widthUpdatedListener;

        public class Part {
            AnimatedEmojiSpan.EmojiGroupedSpans emoji;
            StaticLayout layout;
            float left;
            float offset;
            int toOppositeIndex;
            float width;

            public Part(StaticLayout staticLayout, float f, int i) {
                this.layout = staticLayout;
                this.toOppositeIndex = i;
                layout(f);
                if (AnimatedTextDrawable.this.getCallback() instanceof View) {
                    this.emoji = AnimatedEmojiSpan.update(AnimatedTextDrawable.this.emojiCacheType, (View) AnimatedTextDrawable.this.getCallback(), this.emoji, staticLayout);
                }
            }

            public void detach() {
                if (AnimatedTextDrawable.this.getCallback() instanceof View) {
                    AnimatedEmojiSpan.release((View) AnimatedTextDrawable.this.getCallback(), this.emoji);
                }
            }

            public void draw(Canvas canvas, float f) {
                this.layout.draw(canvas);
                AnimatedEmojiSpan.drawAnimatedEmojis(canvas, this.layout, this.emoji, 0.0f, null, 0.0f, 0.0f, 0.0f, f, AnimatedTextDrawable.this.emojiColorFilter);
            }

            public void layout(float f) {
                this.offset = f;
                StaticLayout staticLayout = this.layout;
                float lineWidth = 0.0f;
                this.left = (staticLayout == null || staticLayout.getLineCount() <= 0) ? 0.0f : this.layout.getLineLeft(0);
                StaticLayout staticLayout2 = this.layout;
                if (staticLayout2 != null && staticLayout2.getLineCount() > 0) {
                    lineWidth = this.layout.getLineWidth(0);
                }
                this.width = lineWidth;
            }
        }

        public interface RegionCallback {
            void run(CharSequence charSequence, int i, int i2);
        }

        public static class WordSequence implements CharSequence {
            private static final char SPACE = ' ';
            private final int length;
            private final CharSequence[] words;

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
            public final IntStream chars() {
                return j$.util.stream.IntStream.Wrapper.convert(chars());
            }

            @Override
            public final IntStream codePoints() {
                return j$.util.stream.IntStream.Wrapper.convert(codePoints());
            }

            @Override
            public int length() {
                return this.words.length;
            }

            @Override
            public CharSequence subSequence(int i, int i2) {
                return TextUtils.concat((CharSequence[]) Arrays.copyOfRange(this.words, i, i2));
            }

            public CharSequence toCharSequence() {
                return TextUtils.concat(this.words);
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                while (true) {
                    CharSequence[] charSequenceArr = this.words;
                    if (i >= charSequenceArr.length) {
                        return sb.toString();
                    }
                    sb.append(charSequenceArr[i]);
                    i++;
                }
            }

            public CharSequence wordAt(int i) {
                if (i < 0) {
                    return null;
                }
                CharSequence[] charSequenceArr = this.words;
                if (i >= charSequenceArr.length) {
                    return null;
                }
                return charSequenceArr[i];
            }

            @Override
            public j$.util.stream.IntStream chars() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return j$.util.stream.IntStream.VivifiedWrapper.convert(toCharSequence().chars());
                }
                return null;
            }

            @Override
            public j$.util.stream.IntStream codePoints() {
                if (Build.VERSION.SDK_INT >= 24) {
                    return j$.util.stream.IntStream.VivifiedWrapper.convert(toCharSequence().codePoints());
                }
                return null;
            }

            public WordSequence(CharSequence[] charSequenceArr) {
                int i = 0;
                if (charSequenceArr == null) {
                    this.words = new CharSequence[0];
                    this.length = 0;
                    return;
                }
                this.words = charSequenceArr;
                int length = 0;
                while (true) {
                    CharSequence[] charSequenceArr2 = this.words;
                    if (i < charSequenceArr2.length) {
                        CharSequence charSequence = charSequenceArr2[i];
                        if (charSequence != null) {
                            length = charSequence.length() + length;
                        }
                        i++;
                    } else {
                        this.length = length;
                        return;
                    }
                }
            }
        }

        public AnimatedTextDrawable() {
            this(false, false, false);
        }

        private void applyAlphaInternal(float f) {
            this.textPaint.setAlpha((int) (this.alpha * f));
            if (this.shadowed) {
                this.textPaint.setShadowLayer(this.shadowRadius, this.shadowDx, this.shadowDy, Theme.multAlpha(f, this.shadowColor));
            }
        }

        private void betterDiff(final CharSequence charSequence, final CharSequence charSequence2, final RegionCallback regionCallback, final RegionCallback regionCallback2, final RegionCallback regionCallback3) {
            int length = charSequence.length();
            int length2 = charSequence2.length();
            int i = 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, length + 1, length2 + 1);
            for (int i2 = 0; i2 <= length; i2++) {
                for (int i3 = 0; i3 <= length2; i3++) {
                    if (i2 == 0 || i3 == 0) {
                        iArr[i2][i3] = 0;
                    } else {
                        int i4 = i2 - 1;
                        int i5 = i3 - 1;
                        if (partEquals(charSequence, charSequence2, i4, i5)) {
                            iArr[i2][i3] = iArr[i4][i5] + 1;
                        } else {
                            int[] iArr2 = iArr[i2];
                            iArr2[i3] = Math.max(iArr[i4][i3], iArr2[i5]);
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            int i6 = length;
            int i7 = length2;
            while (i6 > 0 && i7 > 0) {
                final int i8 = i6 - 1;
                final int i9 = i7 - 1;
                if (partEquals(charSequence, charSequence2, i8, i9)) {
                    while (i6 > 1 && i7 > 1 && partEquals(charSequence, charSequence2, i6 - 2, i7 - 2)) {
                        i6--;
                        i7--;
                    }
                    final int i10 = i6 - 1;
                    final int i11 = 0;
                    arrayList.add(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$4(regionCallback, charSequence, i10, i8);
                                    break;
                                case 1:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$6(regionCallback, charSequence, i10, i8);
                                    break;
                                case 2:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$7(regionCallback, charSequence, i10, i8);
                                    break;
                                case 3:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$8(regionCallback, charSequence, i10, i8);
                                    break;
                                default:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$5(regionCallback, charSequence, i10, i8);
                                    break;
                            }
                        }
                    });
                    i6--;
                } else if (iArr[i8][i7] > iArr[i6][i9]) {
                    while (i6 > 1 && iArr[i6 - 2][i7] > iArr[i6 - 1][i9]) {
                        i6--;
                    }
                    final int i12 = i6 - 1;
                    final int i13 = 4;
                    arrayList.add(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i13) {
                                case 0:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$4(regionCallback3, charSequence, i12, i8);
                                    break;
                                case 1:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$6(regionCallback3, charSequence, i12, i8);
                                    break;
                                case 2:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$7(regionCallback3, charSequence, i12, i8);
                                    break;
                                case 3:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$8(regionCallback3, charSequence, i12, i8);
                                    break;
                                default:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$5(regionCallback3, charSequence, i12, i8);
                                    break;
                            }
                        }
                    });
                    i6--;
                } else {
                    while (i7 > 1 && iArr[i6][i7 - 2] > iArr[i8][i7 - 1]) {
                        i7--;
                    }
                    final int i14 = i7 - 1;
                    final int i15 = 1;
                    arrayList.add(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i15) {
                                case 0:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$4(regionCallback2, charSequence2, i14, i9);
                                    break;
                                case 1:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$6(regionCallback2, charSequence2, i14, i9);
                                    break;
                                case 2:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$7(regionCallback2, charSequence2, i14, i9);
                                    break;
                                case 3:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$8(regionCallback2, charSequence2, i14, i9);
                                    break;
                                default:
                                    AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$5(regionCallback2, charSequence2, i14, i9);
                                    break;
                            }
                        }
                    });
                }
                i7--;
            }
            while (i6 > 0) {
                final int i16 = i6 - 1;
                while (i6 > 1 && iArr[i6 - 2][i7] >= iArr[i6 - 1][i7]) {
                    i6--;
                }
                final int i17 = i6 - 1;
                final int i18 = 2;
                arrayList.add(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i18) {
                            case 0:
                                AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$4(regionCallback3, charSequence, i17, i16);
                                break;
                            case 1:
                                AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$6(regionCallback3, charSequence, i17, i16);
                                break;
                            case 2:
                                AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$7(regionCallback3, charSequence, i17, i16);
                                break;
                            case 3:
                                AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$8(regionCallback3, charSequence, i17, i16);
                                break;
                            default:
                                AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$5(regionCallback3, charSequence, i17, i16);
                                break;
                        }
                    }
                });
                i6--;
            }
            while (i7 > 0) {
                final int i19 = i7 - 1;
                while (i7 > 1) {
                    int[] iArr3 = iArr[i6];
                    if (iArr3[i7 - 2] < iArr3[i7 - 1]) {
                        break;
                    } else {
                        i7--;
                    }
                }
                final int i20 = i7 - 1;
                final int i21 = 3;
                arrayList.add(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i21) {
                            case 0:
                                AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$4(regionCallback2, charSequence2, i20, i19);
                                break;
                            case 1:
                                AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$6(regionCallback2, charSequence2, i20, i19);
                                break;
                            case 2:
                                AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$7(regionCallback2, charSequence2, i20, i19);
                                break;
                            case 3:
                                AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$8(regionCallback2, charSequence2, i20, i19);
                                break;
                            default:
                                AnimatedTextView.AnimatedTextDrawable.lambda$betterDiff$5(regionCallback2, charSequence2, i20, i19);
                                break;
                        }
                    }
                });
                i7--;
            }
            Collections.reverse(arrayList);
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }

        private void clearCurrentParts() {
            if (this.oldParts != null) {
                int i = 0;
                while (true) {
                    Part[] partArr = this.oldParts;
                    if (i >= partArr.length) {
                        break;
                    }
                    partArr[i].detach();
                    i++;
                }
            }
            this.oldParts = null;
        }

        public void clearOldParts() {
            if (this.oldParts != null) {
                int i = 0;
                while (true) {
                    Part[] partArr = this.oldParts;
                    if (i >= partArr.length) {
                        break;
                    }
                    partArr[i].detach();
                    i++;
                }
            }
            this.oldParts = null;
        }

        private void diff(CharSequence charSequence, CharSequence charSequence2, RegionCallback regionCallback, RegionCallback regionCallback2, RegionCallback regionCallback3) {
            if (this.updateAll) {
                part(regionCallback3, charSequence, 0, charSequence.length());
                part(regionCallback2, charSequence2, 0, charSequence2.length());
                return;
            }
            if (!this.preserveIndex) {
                int iMin = Math.min(charSequence2.length(), charSequence.length());
                int length = 0;
                int length2 = 0;
                boolean z = true;
                int i = 0;
                int i2 = 0;
                while (length <= iMin) {
                    boolean z2 = length < iMin && partEquals(charSequence2, charSequence, length, length2);
                    if (z != z2 || length == iMin) {
                        if (length == iMin) {
                            length = charSequence2.length();
                            length2 = charSequence.length();
                        }
                        int i3 = length - i;
                        int i4 = length2 - i2;
                        if (i3 > 0 || i4 > 0) {
                            if (i3 == i4 && z) {
                                regionCallback.run(charSequence2.subSequence(i, length), i, length);
                            } else {
                                if (i3 > 0) {
                                    part(regionCallback2, charSequence2.subSequence(i, length), i, length);
                                }
                                if (i4 > 0) {
                                    part(regionCallback3, charSequence.subSequence(i2, length2), i2, length2);
                                }
                            }
                        }
                        i = length;
                        i2 = length2;
                        z = z2;
                    }
                    if (z2) {
                        length2++;
                    }
                    length++;
                }
                return;
            }
            int iMin2 = Math.min(charSequence2.length(), charSequence.length());
            if (!this.startFromEnd) {
                int i5 = 0;
                boolean z3 = true;
                int i6 = 0;
                while (i5 <= iMin2) {
                    boolean z4 = i5 < iMin2 && partEquals(charSequence2, charSequence, i5, i5);
                    if (z3 != z4 || i5 == iMin2) {
                        if (i5 - i6 > 0) {
                            if (z3) {
                                part(regionCallback, charSequence2.subSequence(i6, i5), i6, i5);
                            } else {
                                part(regionCallback2, charSequence2.subSequence(i6, i5), i6, i5);
                                part(regionCallback3, charSequence.subSequence(i6, i5), i6, i5);
                            }
                        }
                        i6 = i5;
                        z3 = z4;
                    }
                    i5++;
                }
                if (charSequence2.length() - iMin2 > 0) {
                    part(regionCallback2, charSequence2.subSequence(iMin2, charSequence2.length()), iMin2, charSequence2.length());
                }
                if (charSequence.length() - iMin2 > 0) {
                    part(regionCallback3, charSequence.subSequence(iMin2, charSequence.length()), iMin2, charSequence.length());
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z5 = true;
            int i7 = 0;
            boolean z6 = true;
            for (int i8 = 0; i8 <= iMin2; i8++) {
                int length3 = (charSequence2.length() - i8) - 1;
                int length4 = (charSequence.length() - i8) - 1;
                boolean z7 = length3 >= 0 && length4 >= 0 && partEquals(charSequence2, charSequence, length3, length4);
                if (z5 != z7 || i8 == iMin2) {
                    int i9 = i8 - i7;
                    if (i9 > 0) {
                        if (arrayList.size() != 0) {
                            z5 = z6;
                        }
                        arrayList.add(Integer.valueOf(i9));
                        z6 = z5;
                    }
                    i7 = i8;
                    z5 = z7;
                }
            }
            int length5 = charSequence2.length() - iMin2;
            int length6 = charSequence.length() - iMin2;
            if (length5 > 0) {
                part(regionCallback2, charSequence2.subSequence(0, length5), 0, length5);
            }
            if (length6 > 0) {
                part(regionCallback3, charSequence.subSequence(0, length6), 0, length6);
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                int iIntValue = ((Integer) arrayList.get(size)).intValue();
                if ((size % 2 == 0) != z6) {
                    int i10 = length5 + iIntValue;
                    part(regionCallback2, charSequence2.subSequence(length5, i10), length5, i10);
                    int i11 = length6 + iIntValue;
                    part(regionCallback3, charSequence.subSequence(length6, i11), length6, i11);
                } else if (charSequence2.length() > charSequence.length()) {
                    int i12 = length5 + iIntValue;
                    regionCallback.run(charSequence2.subSequence(length5, i12), length5, i12);
                } else {
                    int i13 = length6 + iIntValue;
                    regionCallback.run(charSequence.subSequence(length6, i13), length6, i13);
                }
                length5 += iIntValue;
                length6 += iIntValue;
            }
        }

        public static void lambda$betterDiff$4(RegionCallback regionCallback, CharSequence charSequence, int i, int i2) {
            int i3 = i2 + 1;
            regionCallback.run(charSequence.subSequence(i, i3), i, i3);
        }

        public static void lambda$betterDiff$5(RegionCallback regionCallback, CharSequence charSequence, int i, int i2) {
            int i3 = i2 + 1;
            regionCallback.run(charSequence.subSequence(i, i3), i, i3);
        }

        public static void lambda$betterDiff$6(RegionCallback regionCallback, CharSequence charSequence, int i, int i2) {
            int i3 = i2 + 1;
            regionCallback.run(charSequence.subSequence(i, i3), i, i3);
        }

        public static void lambda$betterDiff$7(RegionCallback regionCallback, CharSequence charSequence, int i, int i2) {
            int i3 = i2 + 1;
            regionCallback.run(charSequence.subSequence(i, i3), i, i3);
        }

        public static void lambda$betterDiff$8(RegionCallback regionCallback, CharSequence charSequence, int i, int i2) {
            int i3 = i2 + 1;
            regionCallback.run(charSequence.subSequence(i, i3), i, i3);
        }

        public void lambda$setEmojiColor$10(int i, int i2, ValueAnimator valueAnimator) {
            setEmojiColor(ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), i, i2));
            invalidateSelf();
        }

        public void lambda$setText$0(int i, ArrayList arrayList, ArrayList arrayList2, CharSequence charSequence, int i2, int i3) {
            StaticLayout staticLayoutMakeLayout = makeLayout(charSequence, i - ((int) Math.ceil(Math.min(this.currentWidth, this.oldWidth))));
            Part part = new Part(staticLayoutMakeLayout, this.currentWidth, arrayList.size());
            Part part2 = new Part(staticLayoutMakeLayout, this.oldWidth, arrayList.size());
            arrayList2.add(part);
            arrayList.add(part2);
            float f = part.width;
            this.currentWidth += f;
            this.oldWidth += f;
            this.currentHeight = Math.max(this.currentHeight, staticLayoutMakeLayout.getHeight());
            this.oldHeight = Math.max(this.oldHeight, staticLayoutMakeLayout.getHeight());
        }

        public void lambda$setText$1(int i, ArrayList arrayList, CharSequence charSequence, int i2, int i3) {
            StaticLayout staticLayoutMakeLayout = makeLayout(charSequence, i - ((int) Math.ceil(this.currentWidth)));
            Part part = new Part(staticLayoutMakeLayout, this.currentWidth, -1);
            arrayList.add(part);
            this.currentWidth += part.width;
            this.currentHeight = Math.max(this.currentHeight, staticLayoutMakeLayout.getHeight());
        }

        public void lambda$setText$2(int i, ArrayList arrayList, CharSequence charSequence, int i2, int i3) {
            StaticLayout staticLayoutMakeLayout = makeLayout(charSequence, i - ((int) Math.ceil(this.oldWidth)));
            Part part = new Part(staticLayoutMakeLayout, this.oldWidth, -1);
            arrayList.add(part);
            this.oldWidth += part.width;
            this.oldHeight = Math.max(this.oldHeight, staticLayoutMakeLayout.getHeight());
        }

        public void lambda$setText$3(ValueAnimator valueAnimator) {
            this.t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidateSelf();
            Runnable runnable = this.widthUpdatedListener;
            if (runnable != null) {
                runnable.run();
            }
        }

        public void lambda$setTextColor$9(int i, int i2, ValueAnimator valueAnimator) {
            setTextColor(ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), i, i2));
            invalidateSelf();
        }

        private StaticLayout makeLayout(CharSequence charSequence, int i) {
            if (i <= 0) {
                Point point = AndroidUtilities.displaySize;
                i = Math.min(point.x, point.y);
            }
            int i2 = i;
            if (Build.VERSION.SDK_INT < 23) {
                return new StaticLayout(charSequence, 0, charSequence.length(), this.textPaint, i2, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, this.includeFontPadding, TextUtils.TruncateAt.END, i2);
            }
            StaticLayout.Builder lineSpacing = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.textPaint, i2).setMaxLines(1).setLineSpacing(0.0f, 1.0f);
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout.Builder alignment2 = lineSpacing.setAlignment(Layout.Alignment.ALIGN_NORMAL);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            return alignment2.setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(i2).setIncludePad(this.includeFontPadding).build();
        }

        private void part(RegionCallback regionCallback, CharSequence charSequence, int i, int i2) {
            if (!this.enforceByLetter || charSequence.length() <= 1) {
                regionCallback.run(charSequence, i, i2);
                return;
            }
            int i3 = 0;
            while (i3 < charSequence.length()) {
                int i4 = i3 + 1;
                CharSequence charSequenceSubSequence = charSequence.subSequence(i3, i4);
                int i5 = i3 + i;
                regionCallback.run(charSequenceSubSequence, i5, i5 + 1);
                i3 = i4;
            }
        }

        public static boolean partEquals(CharSequence charSequence, CharSequence charSequence2, int i, int i2) {
            if (!(charSequence instanceof WordSequence) || !(charSequence2 instanceof WordSequence)) {
                return (charSequence == null && charSequence2 == null) || !(charSequence == null || charSequence2 == null || charSequence.charAt(i) != charSequence2.charAt(i2));
            }
            CharSequence charSequenceWordAt = ((WordSequence) charSequence).wordAt(i);
            CharSequence charSequenceWordAt2 = ((WordSequence) charSequence2).wordAt(i2);
            return (charSequenceWordAt == null && charSequenceWordAt2 == null) || (charSequenceWordAt != null && charSequenceWordAt.equals(charSequenceWordAt2));
        }

        public void cancelAnimation() {
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
        }

        public void copyStylesFrom(TextPaint textPaint) {
            setTextColor(textPaint.getColor());
            setTextSize(textPaint.getTextSize());
            setTypeface(textPaint.getTypeface());
        }

        @Override
        public void draw(Canvas canvas) {
            int i;
            Part part;
            float f;
            boolean z;
            float fM;
            int i2;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float fM2;
            float f7;
            if (this.ellipsizeByGradient) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.bounds);
                rectF.right -= this.rightPadding;
                canvas.saveLayerAlpha(rectF, 255, 31);
            }
            canvas.save();
            Rect rect = this.bounds;
            canvas.translate(rect.left, rect.top);
            int iWidth = this.bounds.width();
            int iHeight = this.bounds.height();
            if (this.currentParts == null || this.oldParts == null) {
                if (this.centerY) {
                    canvas.translate(0.0f, (iHeight - this.currentHeight) / 2.0f);
                }
                if (this.currentParts != null) {
                    applyAlphaInternal(1.0f);
                    for (i = 0; i < this.currentParts.length; i++) {
                        canvas.save();
                        part = this.currentParts[i];
                        f = part.offset;
                        z = this.isRTL;
                        if (z && !this.ignoreRTL) {
                            f = this.currentWidth - (f + part.width);
                        }
                        fM = f - part.left;
                        i2 = this.gravity;
                        if ((i2 | (-4)) == -1) {
                            if ((i2 | (-6)) == -1) {
                                f2 = iWidth;
                                f3 = this.currentWidth;
                            } else if ((i2 | (-2)) == -1) {
                                fM = ImageReceiver$$ExternalSyntheticOutline0.m(iWidth, this.currentWidth, 2.0f, fM);
                            } else if (!z && !this.ignoreRTL) {
                                f2 = iWidth;
                                f3 = this.currentWidth;
                            }
                            fM += f2 - f3;
                        }
                        canvas.translate(fM, 0.0f);
                        part.draw(canvas, 1.0f);
                        canvas.restore();
                    }
                }
            } else {
                float f8 = this.t;
                if (f8 != 1.0f) {
                    float fLerp = AndroidUtilities.lerp(this.oldWidth, this.currentWidth, f8);
                    float fLerp2 = AndroidUtilities.lerp(this.oldHeight, this.currentHeight, this.t);
                    if (this.centerY) {
                        canvas.translate(0.0f, (iHeight - fLerp2) / 2.0f);
                    }
                    int i3 = 0;
                    while (true) {
                        Part[] partArr = this.currentParts;
                        if (i3 >= partArr.length) {
                            break;
                        }
                        Part part2 = partArr[i3];
                        int i4 = part2.toOppositeIndex;
                        float f9 = part2.offset;
                        if (this.isRTL && !this.ignoreRTL) {
                            f9 = this.currentWidth - (f9 + part2.width);
                        }
                        float fCascade = this.t;
                        float f10 = this.animateWave;
                        if (f10 > 0.0f) {
                            fCascade = AndroidUtilities.cascade(fCascade, i3, partArr.length, f10);
                        }
                        if (i4 >= 0) {
                            Part part3 = this.oldParts[i4];
                            float f11 = part3.offset;
                            if (this.isRTL && !this.ignoreRTL) {
                                f11 = this.oldWidth - (f11 + part3.width);
                            }
                            fM2 = AndroidUtilities.lerp(f11 - part3.left, f9 - part2.left, this.t);
                            applyAlphaInternal(1.0f);
                            f7 = 0.0f;
                        } else {
                            fM2 = f9 - part2.left;
                            f7 = (1.0f - fCascade) * (-this.textPaint.getTextSize()) * this.moveAmplitude * (this.moveDown ? 1.0f : -1.0f);
                            applyAlphaInternal(fCascade);
                        }
                        canvas.save();
                        float f12 = i4 >= 0 ? fLerp : this.currentWidth;
                        int i5 = this.gravity;
                        if ((i5 | (-4)) != -1) {
                            if ((i5 | (-6)) == -1) {
                                fM2 += iWidth - f12;
                            } else if ((i5 | (-2)) == -1) {
                                fM2 = ImageReceiver$$ExternalSyntheticOutline0.m(iWidth, f12, 2.0f, fM2);
                            } else if (this.isRTL && !this.ignoreRTL) {
                                fM2 += iWidth - f12;
                            }
                        }
                        canvas.translate(fM2, f7);
                        if (i4 < 0) {
                            float f13 = this.scaleAmplitude;
                            if (f13 > 0.0f) {
                                float fLerp3 = AndroidUtilities.lerp(1.0f - f13, 1.0f, this.t);
                                canvas.scale(fLerp3, fLerp3, part2.width / 2.0f, part2.layout.getHeight() / 2.0f);
                            }
                        }
                        part2.draw(canvas, i4 >= 0 ? 1.0f : this.t);
                        canvas.restore();
                        i3++;
                    }
                    int i6 = 0;
                    while (true) {
                        Part[] partArr2 = this.oldParts;
                        if (i6 >= partArr2.length) {
                            break;
                        }
                        Part part4 = partArr2[i6];
                        if (part4.toOppositeIndex < 0) {
                            float fCascade2 = this.t;
                            float f14 = this.animateWave;
                            if (f14 > 0.0f) {
                                fCascade2 = AndroidUtilities.cascade(fCascade2, i6, partArr2.length, f14);
                            }
                            float f15 = part4.offset;
                            float textSize = this.textPaint.getTextSize() * this.moveAmplitude * fCascade2 * (this.moveDown ? 1.0f : -1.0f);
                            float f16 = 1.0f - fCascade2;
                            applyAlphaInternal(f16);
                            canvas.save();
                            boolean z2 = this.isRTL;
                            if (z2 && !this.ignoreRTL) {
                                f15 = this.oldWidth - (f15 + part4.width);
                            }
                            float fM3 = f15 - part4.left;
                            int i7 = this.gravity;
                            if ((i7 | (-4)) != -1) {
                                if ((i7 | (-6)) == -1) {
                                    f5 = iWidth;
                                    f6 = this.oldWidth;
                                } else if ((i7 | (-2)) == -1) {
                                    fM3 = ImageReceiver$$ExternalSyntheticOutline0.m(iWidth, this.oldWidth, 2.0f, fM3);
                                } else if (z2 && !this.ignoreRTL) {
                                    f5 = iWidth;
                                    f6 = this.oldWidth;
                                }
                                fM3 += f5 - f6;
                            }
                            canvas.translate(fM3, textSize);
                            float f17 = this.scaleAmplitude;
                            if (f17 > 0.0f) {
                                float fLerp4 = AndroidUtilities.lerp(1.0f, 1.0f - f17, this.t);
                                canvas.scale(fLerp4, fLerp4, part4.width / 2.0f, part4.layout.getHeight() / 2.0f);
                            }
                            part4.draw(canvas, f16);
                            canvas.restore();
                        }
                        i6++;
                    }
                } else {
                    if (this.centerY) {
                        canvas.translate(0.0f, (iHeight - this.currentHeight) / 2.0f);
                    }
                    if (this.currentParts != null) {
                        applyAlphaInternal(1.0f);
                        while (i < this.currentParts.length) {
                            canvas.save();
                            part = this.currentParts[i];
                            f = part.offset;
                            z = this.isRTL;
                            if (z) {
                                f = this.currentWidth - (f + part.width);
                            }
                            fM = f - part.left;
                            i2 = this.gravity;
                            if ((i2 | (-4)) == -1) {
                                if ((i2 | (-6)) == -1) {
                                    f2 = iWidth;
                                    f3 = this.currentWidth;
                                } else if ((i2 | (-2)) == -1) {
                                    fM = ImageReceiver$$ExternalSyntheticOutline0.m(iWidth, this.currentWidth, 2.0f, fM);
                                } else if (!z) {
                                }
                                fM += f2 - f3;
                            }
                            canvas.translate(fM, 0.0f);
                            part.draw(canvas, 1.0f);
                            canvas.restore();
                        }
                    }
                }
            }
            canvas.restore();
            if (this.ellipsizeByGradient) {
                float fDp = AndroidUtilities.dp(16.0f);
                if (this.ellipsizeGradient == null) {
                    f4 = fDp;
                    this.ellipsizeGradient = new LinearGradient(0.0f, 0.0f, f4, 0.0f, new int[]{16711680, -65536}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.ellipsizeGradientMatrix = new Matrix();
                    Paint paint = new Paint(1);
                    this.ellipsizePaint = paint;
                    paint.setShader(this.ellipsizeGradient);
                    this.ellipsizePaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                } else {
                    f4 = fDp;
                }
                this.ellipsizeGradientMatrix.reset();
                this.ellipsizeGradientMatrix.postTranslate((this.bounds.right - this.rightPadding) - f4, 0.0f);
                this.ellipsizeGradient.setLocalMatrix(this.ellipsizeGradientMatrix);
                Rect rect2 = this.bounds;
                float f18 = rect2.right - this.rightPadding;
                canvas.drawRect(f18 - f4, rect2.top, f18 + AndroidUtilities.dp(1.0f), this.bounds.bottom, this.ellipsizePaint);
                canvas.restore();
            }
        }

        public float getAnimateToWidth() {
            return this.currentWidth;
        }

        public float getCurrentWidth() {
            return (this.currentParts == null || this.oldParts == null) ? this.currentWidth : AndroidUtilities.lerp(this.oldWidth, this.currentWidth, this.t);
        }

        @Override
        public Rect getDirtyBounds() {
            return this.bounds;
        }

        public int getGravity() {
            return this.gravity;
        }

        public float getHeight() {
            return this.currentHeight;
        }

        public float getMaxWidth(AnimatedTextDrawable animatedTextDrawable) {
            return (this.oldParts == null || animatedTextDrawable.oldParts == null) ? Math.max(getCurrentWidth(), animatedTextDrawable.getCurrentWidth()) : AndroidUtilities.lerp(Math.max(this.oldWidth, animatedTextDrawable.oldWidth), Math.max(this.currentWidth, animatedTextDrawable.currentWidth), Math.max(this.t, animatedTextDrawable.t));
        }

        @Override
        @Deprecated
        public int getOpacity() {
            return -2;
        }

        public TextPaint getPaint() {
            return this.textPaint;
        }

        public float getRightPadding() {
            return this.rightPadding;
        }

        public CharSequence getText() {
            return this.currentText;
        }

        public int getTextColor() {
            return this.textPaint.getColor();
        }

        public float getTextSize() {
            return this.textPaint.getTextSize();
        }

        public float getWidth() {
            return Math.max(this.currentWidth, this.oldWidth);
        }

        public boolean isAnimating() {
            ValueAnimator valueAnimator = this.animator;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        public float isNotEmpty() {
            CharSequence charSequence = this.oldText;
            float f = 0.0f;
            float f2 = (charSequence == null || charSequence.length() <= 0) ? 0.0f : 1.0f;
            CharSequence charSequence2 = this.currentText;
            if (charSequence2 != null && charSequence2.length() > 0) {
                f = 1.0f;
            }
            return AndroidUtilities.lerp(f2, f, this.oldText != null ? this.t : 1.0f);
        }

        public void setAllowCancel(boolean z) {
            this.allowCancel = z;
        }

        @Override
        public void setAlpha(int i) {
            this.alpha = i;
        }

        public void setAnimationProperties(float f, long j, long j2, TimeInterpolator timeInterpolator) {
            setAnimationProperties(f, j, j2, 1.0f, timeInterpolator);
        }

        @Override
        public void setBounds(Rect rect) {
            super.setBounds(rect);
            this.bounds.set(rect);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.textPaint.setColorFilter(colorFilter);
        }

        public void setEllipsizeByGradient(boolean z) {
            this.ellipsizeByGradient = z;
            invalidateSelf();
        }

        public void setEmojiCacheType(int i) {
            this.emojiCacheType = i;
        }

        public void setEmojiColor(int i) {
            if (this.emojiColor != i) {
                this.emojiColor = i;
                this.emojiColorFilter = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
            }
        }

        public void setEmojiColorFilter(ColorFilter colorFilter) {
            this.emojiColorFilter = colorFilter;
        }

        public void setGravity(int i) {
            this.gravity = i;
        }

        public void setHacks(boolean z, boolean z2, boolean z3) {
            setHacks(z, z2, z3, false);
        }

        public void setIncludeFontPadding(boolean z) {
            this.includeFontPadding = z;
        }

        public void setOnAnimationFinishListener(Runnable runnable) {
            this.onAnimationFinishListener = runnable;
        }

        public void setOnWidthUpdatedListener(Runnable runnable) {
            this.widthUpdatedListener = runnable;
        }

        public void setOverrideFullWidth(int i) {
            this.overrideFullWidth = i;
        }

        public void setRightPadding(float f) {
            this.rightPadding = f;
            invalidateSelf();
        }

        public void setScaleProperty(float f) {
            this.scaleAmplitude = f;
        }

        public void setShadowLayer(float f, float f2, float f3, int i) {
            this.shadowed = true;
            TextPaint textPaint = this.textPaint;
            this.shadowRadius = f;
            this.shadowDx = f2;
            this.shadowDy = f3;
            this.shadowColor = i;
            textPaint.setShadowLayer(f, f2, f3, i);
        }

        public void setSplitByWords(boolean z) {
            this.splitByWords = z;
        }

        public void setText(CharSequence charSequence) {
            setText(charSequence, true);
        }

        public void setTextColor(int i) {
            this.textPaint.setColor(i);
            this.alpha = Color.alpha(i);
        }

        public void setTextSize(float f) {
            float textSize = this.textPaint.getTextSize();
            this.textPaint.setTextSize(f);
            if (Math.abs(textSize - f) > 0.5f) {
                int iWidth = this.overrideFullWidth;
                if (iWidth <= 0) {
                    iWidth = this.bounds.width();
                }
                int i = 0;
                if (this.currentParts != null) {
                    this.currentWidth = 0.0f;
                    this.currentHeight = 0.0f;
                    int i2 = 0;
                    while (true) {
                        Part[] partArr = this.currentParts;
                        if (i2 >= partArr.length) {
                            break;
                        }
                        StaticLayout staticLayoutMakeLayout = makeLayout(partArr[i2].layout.getText(), iWidth - ((int) Math.ceil(Math.min(this.currentWidth, this.oldWidth))));
                        Part[] partArr2 = this.currentParts;
                        Part part = partArr2[i2];
                        partArr2[i2] = new Part(staticLayoutMakeLayout, part.offset, part.toOppositeIndex);
                        float f2 = this.currentWidth;
                        Part part2 = this.currentParts[i2];
                        this.currentWidth = f2 + part2.width;
                        this.currentHeight = Math.max(this.currentHeight, part2.layout.getHeight());
                        i2++;
                    }
                }
                if (this.oldParts != null) {
                    this.oldWidth = 0.0f;
                    this.oldHeight = 0.0f;
                    while (true) {
                        Part[] partArr3 = this.oldParts;
                        if (i >= partArr3.length) {
                            break;
                        }
                        StaticLayout staticLayoutMakeLayout2 = makeLayout(partArr3[i].layout.getText(), iWidth - ((int) Math.ceil(Math.min(this.currentWidth, this.oldWidth))));
                        Part[] partArr4 = this.oldParts;
                        Part part3 = partArr4[i];
                        partArr4[i] = new Part(staticLayoutMakeLayout2, part3.offset, part3.toOppositeIndex);
                        float f3 = this.oldWidth;
                        Part part4 = this.oldParts[i];
                        this.oldWidth = f3 + part4.width;
                        this.oldHeight = Math.max(this.oldHeight, part4.layout.getHeight());
                        i++;
                    }
                }
                invalidateSelf();
            }
        }

        public void setTypeface(Typeface typeface) {
            this.textPaint.setTypeface(typeface);
        }

        public AnimatedTextDrawable(boolean z, boolean z2, boolean z3) {
            this(z, z2, z3, false);
        }

        public void setAnimationProperties(float f, long j, long j2, float f2, TimeInterpolator timeInterpolator) {
            this.moveAmplitude = f;
            this.animateDelay = j;
            this.animateDuration = j2;
            this.animateWave = f2;
            this.animateInterpolator = timeInterpolator;
        }

        public void setHacks(boolean z, boolean z2, boolean z3, boolean z4) {
            this.splitByWords = z;
            this.preserveIndex = z2;
            this.startFromEnd = z3;
            this.enforceByLetter = z4;
        }

        public void setText(CharSequence charSequence, boolean z) {
            setText(charSequence, z, true);
        }

        public AnimatedTextDrawable(boolean z, boolean z2, boolean z3, boolean z4) {
            this.textPaint = new TextPaint(1);
            this.gravity = 0;
            this.isRTL = false;
            this.emojiCacheType = 0;
            this.t = 0.0f;
            this.moveDown = true;
            this.animateDelay = 0L;
            this.animateDuration = 320L;
            this.animateInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animateWave = -1.0f;
            this.moveAmplitude = 0.3f;
            this.scaleAmplitude = 0.0f;
            this.alpha = 255;
            this.bounds = new Rect();
            this.includeFontPadding = true;
            this.centerY = true;
            this.shadowed = false;
            this.splitByWords = z;
            this.preserveIndex = z2;
            this.startFromEnd = z3;
            this.enforceByLetter = z4;
        }

        public void setBounds(RectF rectF) {
            setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }

        public void setEmojiColor(final int i, boolean z) {
            ValueAnimator valueAnimator = this.emojiColorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.emojiColorAnimator = null;
            }
            if (!z) {
                setEmojiColor(i);
                return;
            }
            if (this.emojiColor != i) {
                int textColor = getTextColor();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.emojiColorAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new AnimatedTextView$AnimatedTextDrawable$$ExternalSyntheticLambda13(this, textColor, i, 1));
                this.emojiColorAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        AnimatedTextDrawable.this.setTextColor(i);
                    }
                });
                this.emojiColorAnimator.setDuration(240L);
                this.emojiColorAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.emojiColorAnimator.start();
            }
        }

        public void setText(CharSequence charSequence, boolean z, boolean z2) {
            final int i = 1;
            final int i2 = 0;
            boolean z3 = (this.currentText == null || charSequence == null) ? false : z;
            CharSequence charSequence2 = charSequence == null ? "" : charSequence;
            int iWidth = this.overrideFullWidth;
            if (iWidth <= 0) {
                iWidth = this.bounds.width();
            }
            if (z3) {
                if (TextUtils.equals(charSequence2, this.currentText)) {
                    return;
                }
                if (this.allowCancel) {
                    ValueAnimator valueAnimator = this.animator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.animator = null;
                    }
                } else if (isAnimating()) {
                    this.toSetText = charSequence2;
                    this.toSetTextMoveDown = z2;
                    return;
                }
                this.oldText = this.currentText;
                this.currentText = charSequence2;
                final ArrayList arrayList = new ArrayList();
                final int i3 = iWidth;
                final ArrayList arrayList2 = new ArrayList();
                this.currentHeight = 0.0f;
                this.currentWidth = 0.0f;
                this.oldHeight = 0.0f;
                this.oldWidth = 0.0f;
                this.isRTL = AndroidUtilities.isRTL(this.currentText);
                diff(this.splitByWords ? new WordSequence(this.oldText) : this.oldText, this.splitByWords ? new WordSequence(this.currentText) : this.currentText, new SearchTagsList$$ExternalSyntheticLambda12(this, i3, arrayList2, arrayList, 1), new RegionCallback(this) {
                    public final AnimatedTextView.AnimatedTextDrawable f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(CharSequence charSequence3, int i4, int i5) {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$setText$1(i3, arrayList, charSequence3, i4, i5);
                                break;
                            default:
                                this.f$0.lambda$setText$2(i3, arrayList, charSequence3, i4, i5);
                                break;
                        }
                    }
                }, new RegionCallback(this) {
                    public final AnimatedTextView.AnimatedTextDrawable f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(CharSequence charSequence3, int i4, int i5) {
                        switch (i) {
                            case 0:
                                this.f$0.lambda$setText$1(i3, arrayList2, charSequence3, i4, i5);
                                break;
                            default:
                                this.f$0.lambda$setText$2(i3, arrayList2, charSequence3, i4, i5);
                                break;
                        }
                    }
                });
                clearCurrentParts();
                Part[] partArr = this.currentParts;
                if (partArr == null || partArr.length != arrayList.size()) {
                    this.currentParts = new Part[arrayList.size()];
                }
                arrayList.toArray(this.currentParts);
                clearOldParts();
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
                this.animator = ValueAnimator.ofFloat(0.0f, 1.0f);
                Runnable runnable = this.widthUpdatedListener;
                if (runnable != null) {
                    runnable.run();
                }
                this.animator.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 21));
                this.animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                        AnimatedTextDrawable.this.clearOldParts();
                        AnimatedTextDrawable.this.oldText = null;
                        AnimatedTextDrawable.this.oldWidth = 0.0f;
                        AnimatedTextDrawable.this.t = 0.0f;
                        AnimatedTextDrawable.this.invalidateSelf();
                        if (AnimatedTextDrawable.this.widthUpdatedListener != null) {
                            AnimatedTextDrawable.this.widthUpdatedListener.run();
                        }
                        AnimatedTextDrawable.this.animator = null;
                        if (AnimatedTextDrawable.this.toSetText == null) {
                            if (AnimatedTextDrawable.this.onAnimationFinishListener != null) {
                                AnimatedTextDrawable.this.onAnimationFinishListener.run();
                            }
                        } else {
                            AnimatedTextDrawable animatedTextDrawable = AnimatedTextDrawable.this;
                            animatedTextDrawable.setText(animatedTextDrawable.toSetText, true, AnimatedTextDrawable.this.toSetTextMoveDown);
                            AnimatedTextDrawable.this.toSetText = null;
                            AnimatedTextDrawable.this.toSetTextMoveDown = false;
                        }
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
            if (!charSequence2.equals(this.currentText)) {
                clearCurrentParts();
                this.currentParts = new Part[]{new Part(makeLayout(charSequence2, iWidth), 0.0f, -1)};
                this.currentText = charSequence2;
                Part part = this.currentParts[0];
                this.currentWidth = part.width;
                this.currentHeight = part.layout.getHeight();
                this.isRTL = AndroidUtilities.isRTL(this.currentText);
            }
            clearOldParts();
            this.oldText = null;
            this.oldWidth = 0.0f;
            this.oldHeight = 0.0f;
            invalidateSelf();
            Runnable runnable2 = this.widthUpdatedListener;
            if (runnable2 != null) {
                runnable2.run();
            }
        }

        public void setTextColor(final int i, boolean z) {
            ValueAnimator valueAnimator = this.colorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.colorAnimator = null;
            }
            if (!z) {
                setTextColor(i);
                return;
            }
            int textColor = getTextColor();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.colorAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new AnimatedTextView$AnimatedTextDrawable$$ExternalSyntheticLambda13(this, textColor, i, 0));
            this.colorAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    AnimatedTextDrawable.this.setTextColor(i);
                }
            });
            this.colorAnimator.setDuration(240L);
            this.colorAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.colorAnimator.start();
        }

        @Override
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            this.bounds.set(i, i2, i3, i4);
        }

        public void setBounds(float f, float f2, float f3, float f4) {
            int i = (int) f;
            int i2 = (int) f2;
            int i3 = (int) f3;
            int i4 = (int) f4;
            super.setBounds(i, i2, i3, i4);
            this.bounds.set(i, i2, i3, i4);
        }
    }

    public AnimatedTextView(Context context) {
        this(context, false, false, false);
    }

    public void lambda$new$0() {
        CharSequence charSequence = this.toSetText;
        if (charSequence != null) {
            setText(charSequence, this.toSetMoveDown, true);
            this.toSetText = null;
            this.toSetMoveDown = false;
        }
    }

    public void cancelAnimation() {
        this.drawable.cancelAnimation();
    }

    public int finalWidth() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.drawable.getAnimateToWidth()));
    }

    public AnimatedTextDrawable getDrawable() {
        return this.drawable;
    }

    public TextPaint getPaint() {
        return this.drawable.getPaint();
    }

    public float getRightPadding() {
        return this.drawable.getRightPadding();
    }

    public Drawable getSizeableBackground() {
        return this.backgroundDrawable;
    }

    public CharSequence getText() {
        return this.drawable.getText();
    }

    public int getTextColor() {
        return this.drawable.getTextColor();
    }

    public int getTextHeight() {
        return getPaint().getFontMetricsInt().descent - getPaint().getFontMetricsInt().ascent;
    }

    @Override
    public void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    public boolean isAnimating() {
        return this.drawable.isAnimating();
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.backgroundDrawable != null && (!this.hideBackgroundIfEmpty || this.drawable.isNotEmpty() > 0.0f)) {
            int currentWidth = (int) (this.drawable.getCurrentWidth() + getPaddingLeft() + getPaddingRight());
            if ((this.drawable.gravity & 7) == 5) {
                this.backgroundDrawable.setBounds(getWidth() - currentWidth, 0, getWidth(), getHeight());
            } else {
                this.backgroundDrawable.setBounds(0, 0, currentWidth, getHeight());
            }
            this.backgroundDrawable.draw(canvas);
        }
        this.drawable.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        this.drawable.draw(canvas);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setText(getText());
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
            AnimatedTextDrawable animatedTextDrawable = this.drawable;
            animatedTextDrawable.setText(animatedTextDrawable.getText(), false, true);
        }
        this.lastMaxWidth = size;
        if (this.adaptWidth && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            size = getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.drawable.getWidth()));
        }
        setMeasuredDimension(size, size2);
    }

    public void setAllowCancel(boolean z) {
        this.drawable.setAllowCancel(z);
    }

    public void setAnimationProperties(float f, long j, long j2, TimeInterpolator timeInterpolator) {
        this.drawable.setAnimationProperties(f, j, j2, timeInterpolator);
    }

    public void setEllipsizeByGradient(boolean z) {
        this.drawable.setEllipsizeByGradient(z);
    }

    public void setEmojiCacheType(int i) {
        this.drawable.setEmojiCacheType(i);
    }

    public void setEmojiColor(int i) {
        this.drawable.setEmojiColor(i);
        invalidate();
    }

    public void setEmojiColorFilter(ColorFilter colorFilter) {
        this.drawable.setEmojiColorFilter(colorFilter);
        invalidate();
    }

    public void setGravity(int i) {
        this.drawable.setGravity(i);
    }

    public void setHideBackgroundIfEmpty(boolean z) {
        this.hideBackgroundIfEmpty = z;
    }

    public void setIgnoreRTL(boolean z) {
        this.drawable.ignoreRTL = z;
    }

    public void setIncludeFontPadding(boolean z) {
        this.drawable.setIncludeFontPadding(z);
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public void setOnWidthUpdatedListener(Runnable runnable) {
        this.drawable.setOnWidthUpdatedListener(runnable);
    }

    public void setRightPadding(float f) {
        this.drawable.setRightPadding(f);
    }

    public void setScaleProperty(float f) {
        this.drawable.setScaleProperty(f);
    }

    public void setSizeableBackground(Drawable drawable) {
        this.backgroundDrawable = drawable;
        invalidate();
    }

    public void setText(CharSequence charSequence) {
        setText(charSequence, true, true);
    }

    public void setTextColor(int i) {
        this.drawable.setTextColor(i);
        invalidate();
    }

    public void setTextSize(float f) {
        this.drawable.setTextSize(f);
    }

    public void setTypeface(Typeface typeface) {
        this.drawable.setTypeface(typeface);
    }

    public int width() {
        return getPaddingRight() + getPaddingLeft() + ((int) Math.ceil(this.drawable.getCurrentWidth()));
    }

    public AnimatedTextView(Context context, boolean z, boolean z2, boolean z3) {
        super(context);
        this.adaptWidth = true;
        this.first = true;
        AnimatedTextDrawable animatedTextDrawable = new AnimatedTextDrawable(z, z2, z3);
        this.drawable = animatedTextDrawable;
        animatedTextDrawable.setCallback(this);
        animatedTextDrawable.setOnAnimationFinishListener(new ShareAlert$23$$ExternalSyntheticLambda0(this, 21));
    }

    public void setText(CharSequence charSequence, boolean z) {
        setText(charSequence, z, true);
    }

    public void setEmojiColor(int i, boolean z) {
        this.drawable.setEmojiColor(i, z);
        invalidate();
    }

    public void setText(CharSequence charSequence, boolean z, boolean z2) {
        boolean z3 = !this.first && z;
        this.first = false;
        if (z3 && !TextUtils.equals(charSequence, this.drawable.getText())) {
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
        int width = (int) this.drawable.getWidth();
        this.drawable.setBounds(getPaddingLeft(), getPaddingTop(), this.lastMaxWidth - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        this.drawable.setText(charSequence, z3, z2);
        float f = width;
        if (f < this.drawable.getWidth() || !(z3 || f == this.drawable.getWidth())) {
            requestLayout();
        }
    }

    public void setTextColor(int i, boolean z) {
        this.drawable.setTextColor(i, z);
        invalidate();
    }
}

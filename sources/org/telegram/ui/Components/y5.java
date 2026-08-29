package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import android.util.LongSparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public class y5 extends ReplacementSpan {
    private static boolean lockPositionChanging;
    private boolean animateChanges;
    public int cacheType;
    public TLRPC.Document document;
    public String documentAbsolutePath;
    public long documentId;
    public String emoji;
    public float extraScale;
    private Paint.FontMetricsInt fontMetrics;
    public boolean fromEmojiKeyboard;
    public boolean full;
    public boolean invert;
    private boolean isAdded;
    private boolean isRemoved;
    float lastDrawnCx;
    float lastDrawnCy;
    protected int measuredSize;
    private int minimumLineHeight;
    private ValueAnimator moveAnimator;
    boolean positionChanged;
    private boolean preserveFontMetrics;
    private boolean recordPositions;
    private Runnable removedAction;
    private float scale;
    private ValueAnimator scaleAnimator;
    public float size;
    boolean spanDrawn;
    public boolean standard;
    public boolean top;

    public y5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f22398id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static void a(y5 y5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        y5Var.extraScale = floatValue;
        y5Var.scale = AndroidUtilities.lerp(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(y5 y5Var) {
        if (y5Var.moveAnimator == null && y5Var.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            y5[] y5VarArr = (y5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), y5.class);
            if (y5VarArr != null) {
                for (y5 y5Var : y5VarArr) {
                    y5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static void b(y5 y5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        y5Var.extraScale = floatValue;
        y5Var.scale = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i10, int i11) {
        if (layout.getText() instanceof Spanned) {
            i01[] i01VarArr = (i01[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i10), Math.min(layout.getText().length() - 1, i11), i01.class);
            for (int i12 = 0; i01VarArr != null && i12 < i01VarArr.length; i12++) {
                i01 i01Var = i01VarArr[i12];
                if (i01Var != null && i01Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static y5 cloneSpan(y5 y5Var, Paint.FontMetricsInt fontMetricsInt) {
        y5 y5Var2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = y5Var.document;
        if (document != null) {
            float f9 = y5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = y5Var.fontMetrics;
            }
            y5Var2 = new y5(document, f9, fontMetricsInt3);
        } else {
            long j10 = y5Var.documentId;
            float f10 = y5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = y5Var.fontMetrics;
            }
            y5Var2 = new y5(j10, f10, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            y5Var2.size = y5Var.size;
        }
        y5Var2.fromEmojiKeyboard = y5Var.fromEmojiKeyboard;
        y5Var2.isAdded = y5Var.isAdded;
        y5Var2.isRemoved = y5Var.isRemoved;
        return y5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, u5 u5Var, float f9, List<gh.k> list, float f10, float f11, float f12, float f13) {
        drawAnimatedEmojis(canvas, layout, u5Var, f9, list, f10, f11, f12, f13, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof y5) && !(characterStyle instanceof Emoji.EmojiSpan)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<p5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            p5 valueAt = longSparseArray.valueAt(i10);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static u5 update(int i10, View view, u5 u5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, u5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i10;
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y5.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.f22398id;
        }
        return this.documentId;
    }

    public float getExtraScale() {
        if (this.isAdded) {
            lockPositionChanging = true;
            this.isAdded = false;
            this.extraScale = 0.0f;
            ValueAnimator valueAnimator = this.scaleAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.scaleAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.extraScale, 1.0f);
            this.scaleAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final y5 f31859b;

                {
                    this.f31859b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            y5.b(this.f31859b, valueAnimator2);
                            return;
                        default:
                            y5.a(this.f31859b, valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new s5(this, 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(jr.f29800f);
            this.scaleAnimator.start();
        } else if (this.isRemoved) {
            this.isRemoved = false;
            this.extraScale = 1.0f;
            ValueAnimator valueAnimator2 = this.scaleAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllListeners();
                this.scaleAnimator.cancel();
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.extraScale, 0.0f);
            this.scaleAnimator = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final y5 f31859b;

                {
                    this.f31859b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            y5.b(this.f31859b, valueAnimator22);
                            return;
                        default:
                            y5.a(this.f31859b, valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new s5(this, 1));
            this.scaleAnimator.setInterpolator(jr.f29800f);
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.start();
        }
        return this.extraScale;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (this.preserveFontMetrics && fontMetricsInt2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i12 = fontMetricsInt2.top;
        } else {
            i12 = 0;
        }
        if (z10) {
            i13 = fontMetricsInt2.ascent;
        } else {
            i13 = 0;
        }
        if (z10) {
            i14 = fontMetricsInt2.descent;
        } else {
            i14 = 0;
        }
        if (z10) {
            i15 = fontMetricsInt2.bottom;
        } else {
            i15 = 0;
        }
        if (z10) {
            i16 = fontMetricsInt2.leading;
        } else {
            i16 = 0;
        }
        if (fontMetricsInt2 == null && this.top) {
            fontMetricsInt2 = paint.getFontMetricsInt();
        }
        if (fontMetricsInt2 == null) {
            i17 = 0;
        } else {
            i17 = fontMetricsInt2.ascent;
        }
        if (fontMetricsInt2 == null) {
            i18 = 0;
        } else {
            i18 = fontMetricsInt2.descent;
        }
        Paint.FontMetricsInt fontMetricsInt3 = this.fontMetrics;
        if (fontMetricsInt3 == null) {
            int i19 = (int) this.size;
            int dp = AndroidUtilities.dp(8.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            if (fontMetricsInt2 != null) {
                float f9 = (-dp2) - dp;
                float f10 = this.scale;
                fontMetricsInt2.top = (int) (f9 * f10);
                float f11 = dp2 - dp;
                fontMetricsInt2.bottom = (int) (f11 * f10);
                fontMetricsInt2.ascent = (int) (f9 * f10);
                fontMetricsInt2.descent = (int) (f11 * f10);
                fontMetricsInt2.leading = 0;
            }
            this.measuredSize = (int) (i19 * this.scale);
        } else {
            this.measuredSize = (int) (this.size * this.scale);
            if (fontMetricsInt2 != null) {
                if (!this.full) {
                    fontMetricsInt2.ascent = fontMetricsInt3.ascent;
                    fontMetricsInt2.descent = fontMetricsInt3.descent;
                    fontMetricsInt2.top = fontMetricsInt3.top;
                    fontMetricsInt2.bottom = fontMetricsInt3.bottom;
                } else {
                    float abs = Math.abs(this.fontMetrics.top) + Math.abs(fontMetricsInt3.bottom);
                    fontMetricsInt2.ascent = (int) Math.ceil((this.fontMetrics.top / abs) * this.measuredSize);
                    fontMetricsInt2.descent = (int) Math.ceil((this.fontMetrics.bottom / abs) * this.measuredSize);
                    fontMetricsInt2.top = (int) Math.ceil((this.fontMetrics.top / abs) * this.measuredSize);
                    fontMetricsInt2.bottom = (int) Math.ceil((this.fontMetrics.bottom / abs) * this.measuredSize);
                }
            }
        }
        if (fontMetricsInt2 != null && this.top) {
            int i20 = fontMetricsInt2.ascent;
            int i21 = fontMetricsInt2.descent;
            int i22 = ((i18 - i21) + (i17 - i20)) / 2;
            fontMetricsInt2.ascent = i20 + i22;
            fontMetricsInt2.descent = i21 - i22;
        }
        if (z10) {
            fontMetricsInt2.top = i12;
            fontMetricsInt2.ascent = i13;
            fontMetricsInt2.descent = i14;
            fontMetricsInt2.bottom = i15;
            fontMetricsInt2.leading = i16;
            int i23 = this.minimumLineHeight;
            int i24 = i14 - i13;
            if (i23 > i24) {
                int i25 = i23 - i24;
                int i26 = (i25 + 1) / 2;
                int i27 = i13 - i26;
                fontMetricsInt2.ascent = i27;
                fontMetricsInt2.descent = i14 + (i25 - i26);
                fontMetricsInt2.top = Math.min(i12, i27);
                fontMetricsInt2.bottom = Math.max(fontMetricsInt2.bottom, fontMetricsInt2.descent);
            }
        }
        return Math.max(0, this.measuredSize - 1);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(this.fontMetrics.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = AndroidUtilities.dp(20.0f);
            }
        }
    }

    public void setAdded() {
        this.isAdded = true;
        this.extraScale = 0.0f;
    }

    public void setAnimateChanges() {
        this.animateChanges = true;
    }

    public y5 setMinimumLineHeight(int i10) {
        this.minimumLineHeight = i10;
        return this;
    }

    public y5 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public y5 setSize(int i10) {
        this.size = i10;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10) {
        return cloneSpans(charSequence, i10, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, u5 u5Var, float f9, List<gh.k> list, float f10, float f11, float f12, float f13, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || u5Var == null) {
            return;
        }
        ArrayList arrayList = u5Var.f33141c;
        int i10 = 0;
        if (Emoji.emojiDrawingYOffset == 0.0f && f9 == 0.0f) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, Emoji.emojiDrawingYOffset + AndroidUtilities.dp(20.0f * f9));
            z10 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                break;
            }
            w5 w5Var = (w5) arrayList.get(i11);
            if (w5Var.f34314a == layout) {
                ArrayList arrayList2 = w5Var.f34315b;
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    t5 t5Var = (t5) arrayList2.get(i12);
                    if (t5Var != null) {
                        p5 p5Var = t5Var.f32873f;
                        if (p5Var != null) {
                            p5Var.setColorFilter(colorFilter);
                        }
                        y5 y5Var = t5Var.d;
                        if (y5Var.spanDrawn) {
                            float f14 = y5Var.measuredSize / 2.0f;
                            float f15 = y5Var.lastDrawnCx;
                            float f16 = y5Var.lastDrawnCy;
                            t5Var.f32872e.set((int) (f15 - f14), (int) (f16 - f14), (int) (f15 + f14), (int) (f16 + f14));
                            float max = (list == null || list.isEmpty() || !t5Var.v) ? 1.0f : Math.max(0.0f, list.get(i10).f7414n);
                            t5Var.f32875r = f12;
                            t5Var.f32876s = max;
                            t5Var.getClass();
                            if (f10 != 0.0f || f11 != 0.0f) {
                                Rect rect = t5Var.f32872e;
                                if (rect.bottom < f10 || rect.top > f11) {
                                    t5Var.f32874n = true;
                                    i12++;
                                    i10 = 0;
                                }
                            }
                            t5Var.f32874n = false;
                            p5 p5Var2 = t5Var.f32873f;
                            if (p5Var2 == null) {
                                if (t5Var.h != null) {
                                    float extraScale = t5Var.d.getExtraScale();
                                    t5Var.h.setAlpha((int) (t5Var.f32876s * 255.0f * f13));
                                    t5Var.h.setBounds(t5Var.f32872e);
                                    if (extraScale == 1.0f && !t5Var.d.invert) {
                                        t5Var.h.draw(canvas);
                                    } else {
                                        canvas.save();
                                        canvas.scale((t5Var.d.invert ? -1 : 1) * extraScale, extraScale, t5Var.f32872e.centerX(), t5Var.f32872e.centerY());
                                        t5Var.h.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            } else if (p5Var2.f31593k != null) {
                                p5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.g6.f23380v3 : colorFilter);
                                t5Var.f32873f.q(currentTimeMillis);
                                float extraScale2 = t5Var.d.getExtraScale();
                                if (extraScale2 == 1.0f && !t5Var.d.invert) {
                                    p5 p5Var3 = t5Var.f32873f;
                                    Rect rect2 = t5Var.f32872e;
                                    float f17 = t5Var.f32876s * f13;
                                    lh.x2 x2Var = p5Var3.f31593k;
                                    if (x2Var != null) {
                                        x2Var.setImageCoords(rect2);
                                        p5Var3.f31593k.setAlpha(f17);
                                        p5Var3.f31593k.draw(canvas);
                                    }
                                } else {
                                    canvas.save();
                                    canvas.scale((t5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, t5Var.f32872e.centerX(), t5Var.f32872e.centerY());
                                    p5 p5Var4 = t5Var.f32873f;
                                    Rect rect3 = t5Var.f32872e;
                                    float f18 = t5Var.f32876s * f13;
                                    lh.x2 x2Var2 = p5Var4.f31593k;
                                    if (x2Var2 != null) {
                                        x2Var2.setImageCoords(rect3);
                                        p5Var4.f31593k.setAlpha(f18);
                                        p5Var4.f31593k.draw(canvas);
                                    }
                                    canvas.restore();
                                }
                                if (access$400(t5Var.d)) {
                                    t5Var.invalidate();
                                }
                            }
                            i12++;
                            i10 = 0;
                        }
                    }
                    i12++;
                    i10 = 0;
                }
            } else {
                i11++;
                i10 = 0;
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public static u5 update(int i10, View view, u5 u5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z10) {
        return update(i10, view, false, u5Var, arrayList, z10);
    }

    public y5(TLRPC.Document document, float f9, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f22398id, f9, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i10, fontMetricsInt, 1.0f);
    }

    public static u5 update(int i10, View view, boolean z10, u5 u5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, z10, u5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt, float f9) {
        y5[] y5VarArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0 && ((y5VarArr = (y5[]) spanned.getSpans(0, spanned.length(), y5.class)) == null || y5VarArr.length > 0)) {
                charSequence = new SpannableString(spanned);
                for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                    CharacterStyle characterStyle = characterStyleArr[i11];
                    if (characterStyle != null && (characterStyle instanceof y5)) {
                        int spanStart = spanned.getSpanStart(characterStyle);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i11]);
                        y5 y5Var = (y5) characterStyleArr[i11];
                        charSequence.removeSpan(y5Var);
                        y5 cloneSpan = cloneSpan(y5Var, fontMetricsInt);
                        if (i10 != -1) {
                            cloneSpan.cacheType = i10;
                        }
                        cloneSpan.scale = y5Var.scale * f9;
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static u5 update(int i10, View view, boolean z10, u5 u5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                layoutArr[i11] = arrayList.get(i11).textLayout;
            }
        }
        return update(i10, view, z10, u5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10, int i11) {
        this.fontMetrics = fontMetricsInt;
        this.size = i10;
        this.cacheType = i11;
    }

    public y5(long j10, Paint.FontMetricsInt fontMetricsInt) {
        this(j10, 1.2f, fontMetricsInt);
    }

    public static void release(View view, u5 u5Var) {
        if (u5Var == null) {
            return;
        }
        while (u5Var.f33139a.size() > 0) {
            u5Var.b(0);
        }
    }

    public y5(long j10, float f9, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = AndroidUtilities.dp(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j10;
        this.scale = f9;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = AndroidUtilities.dp(20.0f);
            }
        }
    }

    public static u5 update(int i10, View view, u5 u5Var, Layout... layoutArr) {
        return update(i10, view, false, u5Var, layoutArr);
    }

    public static u5 update(int i10, View view, boolean z10, u5 u5Var, Layout... layoutArr) {
        return update(i10, view, z10, u5Var, false, layoutArr);
    }

    public static u5 update(int i10, View view, boolean z10, u5 u5Var, boolean z11, Layout... layoutArr) {
        int i11;
        y5[] y5VarArr;
        t5 t5Var;
        int i12;
        int i13;
        u5 u5Var2 = u5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i14 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (u5Var2 != null) {
                ArrayList arrayList = u5Var2.f33139a;
                arrayList.clear();
                while (arrayList.size() > 0) {
                    u5Var2.b(0);
                }
                return null;
            }
            return null;
        }
        int i15 = 0;
        while (i15 < layoutArr.length) {
            Layout layout = layoutArr[i15];
            if (layout == null || !(layout.getText() instanceof Spanned)) {
                i11 = i15;
                y5VarArr = null;
                u5Var2 = u5Var2;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                y5VarArr = (y5[]) spanned.getSpans(i14, spanned.length(), y5.class);
                int i16 = 0;
                ?? r12 = u5Var2;
                while (y5VarArr != null && i16 < y5VarArr.length) {
                    y5 y5Var = y5VarArr[i16];
                    if (y5Var == null) {
                        i12 = i15;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(y5Var);
                            int spanEnd = spanned.getSpanEnd(y5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(y5Var);
                            y5Var = cloneSpan(y5Var, fontMetricsInt);
                            y5VarArr[i16] = y5Var;
                            spannable.setSpan(y5Var, spanStart, spanEnd, 33);
                        }
                        if (r12 == 0) {
                            r12 = new Object();
                            r12.f33139a = new ArrayList();
                            r12.f33140b = new HashMap();
                            r12.f33141c = new ArrayList();
                        }
                        ArrayList arrayList2 = r12.f33139a;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                t5Var = fontMetricsInt;
                                break;
                            } else if (((t5) arrayList2.get(i17)).d == y5Var && ((t5) arrayList2.get(i17)).f32871c == layout) {
                                t5Var = (t5) arrayList2.get(i17);
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (t5Var == 0) {
                            t5 t5Var2 = new t5(view, z10);
                            t5Var2.f32871c = layout;
                            if (y5Var.standard) {
                                i13 = 8;
                            } else {
                                i13 = y5Var.cacheType;
                                if (i13 < 0) {
                                    i13 = i10;
                                }
                            }
                            if (y5Var.documentAbsolutePath != null) {
                                i12 = i15;
                                t5Var2.f32873f = p5.n(UserConfig.selectedAccount, y5Var.getDocumentId(), y5Var.documentAbsolutePath, i13);
                            } else {
                                i12 = i15;
                                TLRPC.Document document = y5Var.document;
                                if (document != null) {
                                    t5Var2.f32873f = p5.m(UserConfig.selectedAccount, i13, document);
                                } else {
                                    long j10 = y5Var.documentId;
                                    if (j10 != 0) {
                                        t5Var2.f32873f = p5.n(UserConfig.selectedAccount, j10, null, i13);
                                    }
                                }
                            }
                            int i18 = y5Var.cacheType;
                            if ((i18 == 20 || i18 == 21) && !TextUtils.isEmpty(y5Var.emoji)) {
                                p5 p5Var = t5Var2.f32873f;
                                if (p5Var != null) {
                                    p5Var.r(y5Var.emoji);
                                } else {
                                    t5Var2.h = Emoji.getEmojiDrawable(y5Var.emoji);
                                }
                            }
                            t5Var2.v = c(layout, spanned.getSpanStart(y5Var), spanned.getSpanEnd(y5Var));
                            t5Var2.f32872e = new Rect();
                            t5Var2.d = y5Var;
                            arrayList2.add(t5Var2);
                            HashMap hashMap = r12.f33140b;
                            w5 w5Var = (w5) hashMap.get(layout);
                            if (w5Var == null) {
                                w5Var = new w5(view, layout);
                                hashMap.put(layout, w5Var);
                                r12.f33141c.add(w5Var);
                            }
                            w5Var.f34315b.add(t5Var2);
                            w5Var.a();
                            p5 p5Var2 = t5Var2.f32873f;
                            if (p5Var2 != null) {
                                p5Var2.b(t5Var2);
                            }
                        } else {
                            i12 = i15;
                            t5Var.v = c(layout, spanned.getSpanStart(y5Var), spanned.getSpanEnd(y5Var));
                        }
                    }
                    i16++;
                    i15 = i12;
                    fontMetricsInt = null;
                    r12 = r12;
                }
                i11 = i15;
                u5Var2 = r12;
            }
            if (u5Var2 != null) {
                ArrayList arrayList3 = u5Var2.f33139a;
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    if (((t5) arrayList3.get(i19)).f32871c == layout) {
                        y5 y5Var2 = ((t5) arrayList3.get(i19)).d;
                        for (int i20 = 0; y5VarArr != null && i20 < y5VarArr.length; i20++) {
                            if (y5VarArr[i20] == y5Var2) {
                                break;
                            }
                        }
                        u5Var2.b(i19);
                        i19--;
                    }
                    i19++;
                }
            }
            i15 = i11 + 1;
            fontMetricsInt = null;
            i14 = 0;
        }
        if (u5Var2 != null) {
            ArrayList arrayList4 = u5Var2.f33139a;
            int i21 = 0;
            while (i21 < arrayList4.size()) {
                Layout layout2 = ((t5) arrayList4.get(i21)).f32871c;
                int i22 = 0;
                while (true) {
                    if (i22 < layoutArr.length) {
                        if (layoutArr[i22] == layout2) {
                            break;
                        }
                        i22++;
                    } else {
                        u5Var2.b(i21);
                        i21--;
                        break;
                    }
                }
                i21++;
            }
        }
        return u5Var2;
    }

    public static LongSparseArray<p5> update(View view, y5[] y5VarArr, LongSparseArray<p5> longSparseArray) {
        return update(0, view, y5VarArr, longSparseArray);
    }

    public static LongSparseArray<p5> update(int i10, View view, y5[] y5VarArr, LongSparseArray<p5> longSparseArray) {
        int i11;
        p5 n10;
        int i12;
        if (y5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            p5 p5Var = longSparseArray.get(keyAt);
            if (p5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i12 < y5VarArr.length) {
                    y5 y5Var = y5VarArr[i12];
                    i12 = (y5Var == null || y5Var.getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                p5Var.o(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (y5 y5Var2 : y5VarArr) {
            if (y5Var2 != null && longSparseArray.get(y5Var2.getDocumentId()) == null) {
                if (y5Var2.standard) {
                    i11 = 8;
                } else {
                    i11 = y5Var2.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                TLRPC.Document document = y5Var2.document;
                if (document != null) {
                    n10 = p5.m(UserConfig.selectedAccount, i11, document);
                } else {
                    n10 = p5.n(UserConfig.selectedAccount, y5Var2.documentId, null, i11);
                }
                n10.a(view);
                longSparseArray.put(y5Var2.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<p5> update(View view, ArrayList<y5> arrayList, LongSparseArray<p5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<p5> update(int i10, View view, ArrayList<y5> arrayList, LongSparseArray<p5> longSparseArray) {
        int i11;
        int i12;
        if (arrayList == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            p5 p5Var = longSparseArray.get(keyAt);
            if (p5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i12 < arrayList.size()) {
                    i12 = (arrayList.get(i12) == null || arrayList.get(i12).getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                p5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            y5 y5Var = arrayList.get(i14);
            if (y5Var != null && longSparseArray.get(y5Var.getDocumentId()) == null) {
                if (y5Var.standard) {
                    i11 = 8;
                } else {
                    i11 = y5Var.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                p5 n10 = p5.n(UserConfig.selectedAccount, y5Var.documentId, null, i11);
                n10.a(view);
                longSparseArray.put(y5Var.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }
}

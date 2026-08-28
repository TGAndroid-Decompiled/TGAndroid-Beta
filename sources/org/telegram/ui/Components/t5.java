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
public class t5 extends ReplacementSpan {
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

    public t5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f22386id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static void a(t5 t5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t5Var.extraScale = floatValue;
        t5Var.scale = AndroidUtilities.lerp(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(t5 t5Var) {
        if (t5Var.moveAnimator == null && t5Var.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            t5[] t5VarArr = (t5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), t5.class);
            if (t5VarArr != null) {
                for (t5 t5Var : t5VarArr) {
                    t5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static void b(t5 t5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        t5Var.extraScale = floatValue;
        t5Var.scale = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i9, int i10) {
        if (layout.getText() instanceof Spanned) {
            wz0[] wz0VarArr = (wz0[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i9), Math.min(layout.getText().length() - 1, i10), wz0.class);
            for (int i11 = 0; wz0VarArr != null && i11 < wz0VarArr.length; i11++) {
                wz0 wz0Var = wz0VarArr[i11];
                if (wz0Var != null && wz0Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static t5 cloneSpan(t5 t5Var, Paint.FontMetricsInt fontMetricsInt) {
        t5 t5Var2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = t5Var.document;
        if (document != null) {
            float f10 = t5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = t5Var.fontMetrics;
            }
            t5Var2 = new t5(document, f10, fontMetricsInt3);
        } else {
            long j10 = t5Var.documentId;
            float f11 = t5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = t5Var.fontMetrics;
            }
            t5Var2 = new t5(j10, f11, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            t5Var2.size = t5Var.size;
        }
        t5Var2.fromEmojiKeyboard = t5Var.fromEmojiKeyboard;
        t5Var2.isAdded = t5Var.isAdded;
        t5Var2.isRemoved = t5Var.isRemoved;
        return t5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, p5 p5Var, float f10, List<dh.l> list, float f11, float f12, float f13, float f14) {
        drawAnimatedEmojis(canvas, layout, p5Var, f10, list, f11, f12, f13, f14, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof t5) && !(characterStyle instanceof Emoji.EmojiSpan)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<k5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i9 = 0; i9 < longSparseArray.size(); i9++) {
            k5 valueAt = longSparseArray.valueAt(i9);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static p5 update(int i9, View view, p5 p5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i9, view, p5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i9) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i9;
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t5.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.f22386id;
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
                public final t5 f30354b;

                {
                    this.f30354b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            t5.b(this.f30354b, valueAnimator2);
                            return;
                        default:
                            t5.a(this.f30354b, valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new n5(this, 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(gr.f28844f);
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
                public final t5 f30354b;

                {
                    this.f30354b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            t5.b(this.f30354b, valueAnimator22);
                            return;
                        default:
                            t5.a(this.f30354b, valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new n5(this, 1));
            this.scaleAnimator.setInterpolator(gr.f28844f);
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.start();
        }
        return this.extraScale;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (this.preserveFontMetrics && fontMetricsInt2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i11 = fontMetricsInt2.top;
        } else {
            i11 = 0;
        }
        if (z10) {
            i12 = fontMetricsInt2.ascent;
        } else {
            i12 = 0;
        }
        if (z10) {
            i13 = fontMetricsInt2.descent;
        } else {
            i13 = 0;
        }
        if (z10) {
            i14 = fontMetricsInt2.bottom;
        } else {
            i14 = 0;
        }
        if (z10) {
            i15 = fontMetricsInt2.leading;
        } else {
            i15 = 0;
        }
        if (fontMetricsInt2 == null && this.top) {
            fontMetricsInt2 = paint.getFontMetricsInt();
        }
        if (fontMetricsInt2 == null) {
            i16 = 0;
        } else {
            i16 = fontMetricsInt2.ascent;
        }
        if (fontMetricsInt2 == null) {
            i17 = 0;
        } else {
            i17 = fontMetricsInt2.descent;
        }
        Paint.FontMetricsInt fontMetricsInt3 = this.fontMetrics;
        if (fontMetricsInt3 == null) {
            int i18 = (int) this.size;
            int dp = AndroidUtilities.dp(8.0f);
            int dp2 = AndroidUtilities.dp(10.0f);
            if (fontMetricsInt2 != null) {
                float f10 = (-dp2) - dp;
                float f11 = this.scale;
                fontMetricsInt2.top = (int) (f10 * f11);
                float f12 = dp2 - dp;
                fontMetricsInt2.bottom = (int) (f12 * f11);
                fontMetricsInt2.ascent = (int) (f10 * f11);
                fontMetricsInt2.descent = (int) (f12 * f11);
                fontMetricsInt2.leading = 0;
            }
            this.measuredSize = (int) (i18 * this.scale);
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
            int i19 = fontMetricsInt2.ascent;
            int i20 = fontMetricsInt2.descent;
            int i21 = ((i17 - i20) + (i16 - i19)) / 2;
            fontMetricsInt2.ascent = i19 + i21;
            fontMetricsInt2.descent = i20 - i21;
        }
        if (z10) {
            fontMetricsInt2.top = i11;
            fontMetricsInt2.ascent = i12;
            fontMetricsInt2.descent = i13;
            fontMetricsInt2.bottom = i14;
            fontMetricsInt2.leading = i15;
            int i22 = this.minimumLineHeight;
            int i23 = i13 - i12;
            if (i22 > i23) {
                int i24 = i22 - i23;
                int i25 = (i24 + 1) / 2;
                int i26 = i12 - i25;
                fontMetricsInt2.ascent = i26;
                fontMetricsInt2.descent = i13 + (i24 - i25);
                fontMetricsInt2.top = Math.min(i11, i26);
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

    public t5 setMinimumLineHeight(int i9) {
        this.minimumLineHeight = i9;
        return this;
    }

    public t5 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public t5 setSize(int i9) {
        this.size = i9;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i9) {
        return cloneSpans(charSequence, i9, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, p5 p5Var, float f10, List<dh.l> list, float f11, float f12, float f13, float f14, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || p5Var == null) {
            return;
        }
        ArrayList arrayList = p5Var.f31546c;
        int i9 = 0;
        if (Emoji.emojiDrawingYOffset == 0.0f && f10 == 0.0f) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, Emoji.emojiDrawingYOffset + AndroidUtilities.dp(20.0f * f10));
            z10 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            r5 r5Var = (r5) arrayList.get(i10);
            if (r5Var.f32083a == layout) {
                ArrayList arrayList2 = r5Var.f32084b;
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    o5 o5Var = (o5) arrayList2.get(i11);
                    if (o5Var != null) {
                        k5 k5Var = o5Var.f31291f;
                        if (k5Var != null) {
                            k5Var.setColorFilter(colorFilter);
                        }
                        t5 t5Var = o5Var.d;
                        if (t5Var.spanDrawn) {
                            float f15 = t5Var.measuredSize / 2.0f;
                            float f16 = t5Var.lastDrawnCx;
                            float f17 = t5Var.lastDrawnCy;
                            o5Var.f31290e.set((int) (f16 - f15), (int) (f17 - f15), (int) (f16 + f15), (int) (f17 + f15));
                            float max = (list == null || list.isEmpty() || !o5Var.v) ? 1.0f : Math.max(0.0f, list.get(i9).f4624n);
                            o5Var.f31293r = f13;
                            o5Var.f31294s = max;
                            o5Var.getClass();
                            if (f11 != 0.0f || f12 != 0.0f) {
                                Rect rect = o5Var.f31290e;
                                if (rect.bottom < f11 || rect.top > f12) {
                                    o5Var.f31292n = true;
                                    i11++;
                                    i9 = 0;
                                }
                            }
                            o5Var.f31292n = false;
                            k5 k5Var2 = o5Var.f31291f;
                            if (k5Var2 == null) {
                                if (o5Var.h != null) {
                                    float extraScale = o5Var.d.getExtraScale();
                                    o5Var.h.setAlpha((int) (o5Var.f31294s * 255.0f * f14));
                                    o5Var.h.setBounds(o5Var.f31290e);
                                    if (extraScale == 1.0f && !o5Var.d.invert) {
                                        o5Var.h.draw(canvas);
                                    } else {
                                        canvas.save();
                                        canvas.scale((o5Var.d.invert ? -1 : 1) * extraScale, extraScale, o5Var.f31290e.centerX(), o5Var.f31290e.centerY());
                                        o5Var.h.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            } else if (k5Var2.f29951k != null) {
                                k5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.f6.f23317v3 : colorFilter);
                                o5Var.f31291f.q(currentTimeMillis);
                                float extraScale2 = o5Var.d.getExtraScale();
                                if (extraScale2 == 1.0f && !o5Var.d.invert) {
                                    k5 k5Var3 = o5Var.f31291f;
                                    Rect rect2 = o5Var.f31290e;
                                    float f18 = o5Var.f31294s * f14;
                                    ih.z2 z2Var = k5Var3.f29951k;
                                    if (z2Var != null) {
                                        z2Var.setImageCoords(rect2);
                                        k5Var3.f29951k.setAlpha(f18);
                                        k5Var3.f29951k.draw(canvas);
                                    }
                                } else {
                                    canvas.save();
                                    canvas.scale((o5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, o5Var.f31290e.centerX(), o5Var.f31290e.centerY());
                                    k5 k5Var4 = o5Var.f31291f;
                                    Rect rect3 = o5Var.f31290e;
                                    float f19 = o5Var.f31294s * f14;
                                    ih.z2 z2Var2 = k5Var4.f29951k;
                                    if (z2Var2 != null) {
                                        z2Var2.setImageCoords(rect3);
                                        k5Var4.f29951k.setAlpha(f19);
                                        k5Var4.f29951k.draw(canvas);
                                    }
                                    canvas.restore();
                                }
                                if (access$400(o5Var.d)) {
                                    o5Var.invalidate();
                                }
                            }
                            i11++;
                            i9 = 0;
                        }
                    }
                    i11++;
                    i9 = 0;
                }
            } else {
                i10++;
                i9 = 0;
            }
        }
        if (z10) {
            canvas.restore();
        }
    }

    public static p5 update(int i9, View view, p5 p5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z10) {
        return update(i9, view, false, p5Var, arrayList, z10);
    }

    public t5(TLRPC.Document document, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f22386id, f10, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i9, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i9, fontMetricsInt, 1.0f);
    }

    public static p5 update(int i9, View view, boolean z10, p5 p5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i9, view, z10, p5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i9, Paint.FontMetricsInt fontMetricsInt, float f10) {
        t5[] t5VarArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0 && ((t5VarArr = (t5[]) spanned.getSpans(0, spanned.length(), t5.class)) == null || t5VarArr.length > 0)) {
                charSequence = new SpannableString(spanned);
                for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                    CharacterStyle characterStyle = characterStyleArr[i10];
                    if (characterStyle != null && (characterStyle instanceof t5)) {
                        int spanStart = spanned.getSpanStart(characterStyle);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i10]);
                        t5 t5Var = (t5) characterStyleArr[i10];
                        charSequence.removeSpan(t5Var);
                        t5 cloneSpan = cloneSpan(t5Var, fontMetricsInt);
                        if (i9 != -1) {
                            cloneSpan.cacheType = i9;
                        }
                        cloneSpan.scale = t5Var.scale * f10;
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static p5 update(int i9, View view, boolean z10, p5 p5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                layoutArr[i10] = arrayList.get(i10).textLayout;
            }
        }
        return update(i9, view, z10, p5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i9, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.size = i9;
        this.cacheType = i10;
    }

    public t5(long j10, Paint.FontMetricsInt fontMetricsInt) {
        this(j10, 1.2f, fontMetricsInt);
    }

    public static void release(View view, p5 p5Var) {
        if (p5Var == null) {
            return;
        }
        while (p5Var.f31544a.size() > 0) {
            p5Var.b(0);
        }
    }

    public t5(long j10, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = AndroidUtilities.dp(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j10;
        this.scale = f10;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = AndroidUtilities.dp(20.0f);
            }
        }
    }

    public static p5 update(int i9, View view, p5 p5Var, Layout... layoutArr) {
        return update(i9, view, false, p5Var, layoutArr);
    }

    public static p5 update(int i9, View view, boolean z10, p5 p5Var, Layout... layoutArr) {
        return update(i9, view, z10, p5Var, false, layoutArr);
    }

    public static p5 update(int i9, View view, boolean z10, p5 p5Var, boolean z11, Layout... layoutArr) {
        int i10;
        t5[] t5VarArr;
        o5 o5Var;
        int i11;
        int i12;
        p5 p5Var2 = p5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i13 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (p5Var2 != null) {
                ArrayList arrayList = p5Var2.f31544a;
                arrayList.clear();
                while (arrayList.size() > 0) {
                    p5Var2.b(0);
                }
                return null;
            }
            return null;
        }
        int i14 = 0;
        while (i14 < layoutArr.length) {
            Layout layout = layoutArr[i14];
            if (layout == null || !(layout.getText() instanceof Spanned)) {
                i10 = i14;
                t5VarArr = null;
                p5Var2 = p5Var2;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                t5VarArr = (t5[]) spanned.getSpans(i13, spanned.length(), t5.class);
                int i15 = 0;
                ?? r12 = p5Var2;
                while (t5VarArr != null && i15 < t5VarArr.length) {
                    t5 t5Var = t5VarArr[i15];
                    if (t5Var == null) {
                        i11 = i14;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(t5Var);
                            int spanEnd = spanned.getSpanEnd(t5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(t5Var);
                            t5Var = cloneSpan(t5Var, fontMetricsInt);
                            t5VarArr[i15] = t5Var;
                            spannable.setSpan(t5Var, spanStart, spanEnd, 33);
                        }
                        if (r12 == 0) {
                            r12 = new Object();
                            r12.f31544a = new ArrayList();
                            r12.f31545b = new HashMap();
                            r12.f31546c = new ArrayList();
                        }
                        ArrayList arrayList2 = r12.f31544a;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                o5Var = fontMetricsInt;
                                break;
                            } else if (((o5) arrayList2.get(i16)).d == t5Var && ((o5) arrayList2.get(i16)).f31289c == layout) {
                                o5Var = (o5) arrayList2.get(i16);
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (o5Var == 0) {
                            o5 o5Var2 = new o5(view, z10);
                            o5Var2.f31289c = layout;
                            if (t5Var.standard) {
                                i12 = 8;
                            } else {
                                i12 = t5Var.cacheType;
                                if (i12 < 0) {
                                    i12 = i9;
                                }
                            }
                            if (t5Var.documentAbsolutePath != null) {
                                i11 = i14;
                                o5Var2.f31291f = k5.n(UserConfig.selectedAccount, t5Var.getDocumentId(), t5Var.documentAbsolutePath, i12);
                            } else {
                                i11 = i14;
                                TLRPC.Document document = t5Var.document;
                                if (document != null) {
                                    o5Var2.f31291f = k5.m(UserConfig.selectedAccount, i12, document);
                                } else {
                                    long j10 = t5Var.documentId;
                                    if (j10 != 0) {
                                        o5Var2.f31291f = k5.n(UserConfig.selectedAccount, j10, null, i12);
                                    }
                                }
                            }
                            int i17 = t5Var.cacheType;
                            if ((i17 == 20 || i17 == 21) && !TextUtils.isEmpty(t5Var.emoji)) {
                                k5 k5Var = o5Var2.f31291f;
                                if (k5Var != null) {
                                    k5Var.r(t5Var.emoji);
                                } else {
                                    o5Var2.h = Emoji.getEmojiDrawable(t5Var.emoji);
                                }
                            }
                            o5Var2.v = c(layout, spanned.getSpanStart(t5Var), spanned.getSpanEnd(t5Var));
                            o5Var2.f31290e = new Rect();
                            o5Var2.d = t5Var;
                            arrayList2.add(o5Var2);
                            HashMap hashMap = r12.f31545b;
                            r5 r5Var = (r5) hashMap.get(layout);
                            if (r5Var == null) {
                                r5Var = new r5(view, layout);
                                hashMap.put(layout, r5Var);
                                r12.f31546c.add(r5Var);
                            }
                            r5Var.f32084b.add(o5Var2);
                            r5Var.a();
                            k5 k5Var2 = o5Var2.f31291f;
                            if (k5Var2 != null) {
                                k5Var2.b(o5Var2);
                            }
                        } else {
                            i11 = i14;
                            o5Var.v = c(layout, spanned.getSpanStart(t5Var), spanned.getSpanEnd(t5Var));
                        }
                    }
                    i15++;
                    i14 = i11;
                    fontMetricsInt = null;
                    r12 = r12;
                }
                i10 = i14;
                p5Var2 = r12;
            }
            if (p5Var2 != null) {
                ArrayList arrayList3 = p5Var2.f31544a;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    if (((o5) arrayList3.get(i18)).f31289c == layout) {
                        t5 t5Var2 = ((o5) arrayList3.get(i18)).d;
                        for (int i19 = 0; t5VarArr != null && i19 < t5VarArr.length; i19++) {
                            if (t5VarArr[i19] == t5Var2) {
                                break;
                            }
                        }
                        p5Var2.b(i18);
                        i18--;
                    }
                    i18++;
                }
            }
            i14 = i10 + 1;
            fontMetricsInt = null;
            i13 = 0;
        }
        if (p5Var2 != null) {
            ArrayList arrayList4 = p5Var2.f31544a;
            int i20 = 0;
            while (i20 < arrayList4.size()) {
                Layout layout2 = ((o5) arrayList4.get(i20)).f31289c;
                int i21 = 0;
                while (true) {
                    if (i21 < layoutArr.length) {
                        if (layoutArr[i21] == layout2) {
                            break;
                        }
                        i21++;
                    } else {
                        p5Var2.b(i20);
                        i20--;
                        break;
                    }
                }
                i20++;
            }
        }
        return p5Var2;
    }

    public static LongSparseArray<k5> update(View view, t5[] t5VarArr, LongSparseArray<k5> longSparseArray) {
        return update(0, view, t5VarArr, longSparseArray);
    }

    public static LongSparseArray<k5> update(int i9, View view, t5[] t5VarArr, LongSparseArray<k5> longSparseArray) {
        int i10;
        k5 n10;
        int i11;
        if (t5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i12 = 0;
        while (i12 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i12);
            k5 k5Var = longSparseArray.get(keyAt);
            if (k5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i11 < t5VarArr.length) {
                    t5 t5Var = t5VarArr[i11];
                    i11 = (t5Var == null || t5Var.getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                k5Var.o(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (t5 t5Var2 : t5VarArr) {
            if (t5Var2 != null && longSparseArray.get(t5Var2.getDocumentId()) == null) {
                if (t5Var2.standard) {
                    i10 = 8;
                } else {
                    i10 = t5Var2.cacheType;
                    if (i10 < 0) {
                        i10 = i9;
                    }
                }
                TLRPC.Document document = t5Var2.document;
                if (document != null) {
                    n10 = k5.m(UserConfig.selectedAccount, i10, document);
                } else {
                    n10 = k5.n(UserConfig.selectedAccount, t5Var2.documentId, null, i10);
                }
                n10.a(view);
                longSparseArray.put(t5Var2.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<k5> update(View view, ArrayList<t5> arrayList, LongSparseArray<k5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<k5> update(int i9, View view, ArrayList<t5> arrayList, LongSparseArray<k5> longSparseArray) {
        int i10;
        int i11;
        if (arrayList == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i12 = 0;
        while (i12 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i12);
            k5 k5Var = longSparseArray.get(keyAt);
            if (k5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i11 < arrayList.size()) {
                    i11 = (arrayList.get(i11) == null || arrayList.get(i11).getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                k5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            t5 t5Var = arrayList.get(i13);
            if (t5Var != null && longSparseArray.get(t5Var.getDocumentId()) == null) {
                if (t5Var.standard) {
                    i10 = 8;
                } else {
                    i10 = t5Var.cacheType;
                    if (i10 < 0) {
                        i10 = i9;
                    }
                }
                k5 n10 = k5.n(UserConfig.selectedAccount, t5Var.documentId, null, i10);
                n10.a(view);
                longSparseArray.put(t5Var.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }
}

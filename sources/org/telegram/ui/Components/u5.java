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
public class u5 extends ReplacementSpan {
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

    public u5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f19190id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static void a(u5 u5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        u5Var.extraScale = floatValue;
        u5Var.scale = AndroidUtilities.lerp(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(u5 u5Var) {
        if (u5Var.moveAnimator == null && u5Var.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            u5[] u5VarArr = (u5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), u5.class);
            if (u5VarArr != null) {
                for (u5 u5Var : u5VarArr) {
                    u5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static void b(u5 u5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        u5Var.extraScale = floatValue;
        u5Var.scale = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i10, int i11) {
        if (layout.getText() instanceof Spanned) {
            t01[] t01VarArr = (t01[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i10), Math.min(layout.getText().length() - 1, i11), t01.class);
            for (int i12 = 0; t01VarArr != null && i12 < t01VarArr.length; i12++) {
                t01 t01Var = t01VarArr[i12];
                if (t01Var != null && t01Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static u5 cloneSpan(u5 u5Var, Paint.FontMetricsInt fontMetricsInt) {
        u5 u5Var2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = u5Var.document;
        if (document != null) {
            float f10 = u5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = u5Var.fontMetrics;
            }
            u5Var2 = new u5(document, f10, fontMetricsInt3);
        } else {
            long j10 = u5Var.documentId;
            float f11 = u5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = u5Var.fontMetrics;
            }
            u5Var2 = new u5(j10, f11, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            u5Var2.size = u5Var.size;
        }
        u5Var2.fromEmojiKeyboard = u5Var.fromEmojiKeyboard;
        u5Var2.isAdded = u5Var.isAdded;
        u5Var2.isRemoved = u5Var.isRemoved;
        return u5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, q5 q5Var, float f10, List<ih.k> list, float f11, float f12, float f13, float f14) {
        drawAnimatedEmojis(canvas, layout, q5Var, f10, list, f11, f12, f13, f14, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof u5) && !(characterStyle instanceof Emoji.EmojiSpan)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<l5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            l5 valueAt = longSparseArray.valueAt(i10);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static q5 update(int i10, View view, q5 q5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, q5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i10;
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u5.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.f19190id;
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
                public final u5 f26942b;

                {
                    this.f26942b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            u5.b(this.f26942b, valueAnimator2);
                            return;
                        default:
                            u5.a(this.f26942b, valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new o5(this, 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(nr.f27346f);
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
                public final u5 f26942b;

                {
                    this.f26942b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            u5.b(this.f26942b, valueAnimator22);
                            return;
                        default:
                            u5.a(this.f26942b, valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new o5(this, 1));
            this.scaleAnimator.setInterpolator(nr.f27346f);
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.start();
        }
        return this.extraScale;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        boolean z4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (this.preserveFontMetrics && fontMetricsInt2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            i12 = fontMetricsInt2.top;
        } else {
            i12 = 0;
        }
        if (z4) {
            i13 = fontMetricsInt2.ascent;
        } else {
            i13 = 0;
        }
        if (z4) {
            i14 = fontMetricsInt2.descent;
        } else {
            i14 = 0;
        }
        if (z4) {
            i15 = fontMetricsInt2.bottom;
        } else {
            i15 = 0;
        }
        if (z4) {
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
                float f10 = (-dp2) - dp;
                float f11 = this.scale;
                fontMetricsInt2.top = (int) (f10 * f11);
                float f12 = dp2 - dp;
                fontMetricsInt2.bottom = (int) (f12 * f11);
                fontMetricsInt2.ascent = (int) (f10 * f11);
                fontMetricsInt2.descent = (int) (f12 * f11);
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
        if (z4) {
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

    public u5 setMinimumLineHeight(int i10) {
        this.minimumLineHeight = i10;
        return this;
    }

    public u5 setPreserveFontMetrics(boolean z4) {
        this.preserveFontMetrics = z4;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public u5 setSize(int i10) {
        this.size = i10;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10) {
        return cloneSpans(charSequence, i10, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, q5 q5Var, float f10, List<ih.k> list, float f11, float f12, float f13, float f14, ColorFilter colorFilter) {
        boolean z4;
        if (canvas == null || layout == null || q5Var == null) {
            return;
        }
        ArrayList arrayList = q5Var.f28060c;
        int i10 = 0;
        if (Emoji.emojiDrawingYOffset == 0.0f && f10 == 0.0f) {
            z4 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, Emoji.emojiDrawingYOffset + AndroidUtilities.dp(20.0f * f10));
            z4 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                break;
            }
            s5 s5Var = (s5) arrayList.get(i11);
            if (s5Var.f28629a == layout) {
                ArrayList arrayList2 = s5Var.f28630b;
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    p5 p5Var = (p5) arrayList2.get(i12);
                    if (p5Var != null) {
                        l5 l5Var = p5Var.f27742f;
                        if (l5Var != null) {
                            l5Var.setColorFilter(colorFilter);
                        }
                        u5 u5Var = p5Var.d;
                        if (u5Var.spanDrawn) {
                            float f15 = u5Var.measuredSize / 2.0f;
                            float f16 = u5Var.lastDrawnCx;
                            float f17 = u5Var.lastDrawnCy;
                            p5Var.e.set((int) (f16 - f15), (int) (f17 - f15), (int) (f16 + f15), (int) (f17 + f15));
                            float max = (list == null || list.isEmpty() || !p5Var.v) ? 1.0f : Math.max(0.0f, list.get(i10).f7613n);
                            p5Var.f27744r = f13;
                            p5Var.f27745s = max;
                            p5Var.getClass();
                            if (f11 != 0.0f || f12 != 0.0f) {
                                Rect rect = p5Var.e;
                                if (rect.bottom < f11 || rect.top > f12) {
                                    p5Var.f27743n = true;
                                    i12++;
                                    i10 = 0;
                                }
                            }
                            p5Var.f27743n = false;
                            l5 l5Var2 = p5Var.f27742f;
                            if (l5Var2 == null) {
                                if (p5Var.h != null) {
                                    float extraScale = p5Var.d.getExtraScale();
                                    p5Var.h.setAlpha((int) (p5Var.f27745s * 255.0f * f14));
                                    p5Var.h.setBounds(p5Var.e);
                                    if (extraScale == 1.0f && !p5Var.d.invert) {
                                        p5Var.h.draw(canvas);
                                    } else {
                                        canvas.save();
                                        canvas.scale((p5Var.d.invert ? -1 : 1) * extraScale, extraScale, p5Var.e.centerX(), p5Var.e.centerY());
                                        p5Var.h.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            } else if (l5Var2.f26569k != null) {
                                l5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.j6.f20222v3 : colorFilter);
                                p5Var.f27742f.q(currentTimeMillis);
                                float extraScale2 = p5Var.d.getExtraScale();
                                if (extraScale2 == 1.0f && !p5Var.d.invert) {
                                    l5 l5Var3 = p5Var.f27742f;
                                    Rect rect2 = p5Var.e;
                                    float f18 = p5Var.f27745s * f14;
                                    nh.y2 y2Var = l5Var3.f26569k;
                                    if (y2Var != null) {
                                        y2Var.setImageCoords(rect2);
                                        l5Var3.f26569k.setAlpha(f18);
                                        l5Var3.f26569k.draw(canvas);
                                    }
                                } else {
                                    canvas.save();
                                    canvas.scale((p5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, p5Var.e.centerX(), p5Var.e.centerY());
                                    l5 l5Var4 = p5Var.f27742f;
                                    Rect rect3 = p5Var.e;
                                    float f19 = p5Var.f27745s * f14;
                                    nh.y2 y2Var2 = l5Var4.f26569k;
                                    if (y2Var2 != null) {
                                        y2Var2.setImageCoords(rect3);
                                        l5Var4.f26569k.setAlpha(f19);
                                        l5Var4.f26569k.draw(canvas);
                                    }
                                    canvas.restore();
                                }
                                if (access$400(p5Var.d)) {
                                    p5Var.invalidate();
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
        if (z4) {
            canvas.restore();
        }
    }

    public static q5 update(int i10, View view, q5 q5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z4) {
        return update(i10, view, false, q5Var, arrayList, z4);
    }

    public u5(TLRPC.Document document, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f19190id, f10, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i10, fontMetricsInt, 1.0f);
    }

    public static q5 update(int i10, View view, boolean z4, q5 q5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, z4, q5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt, float f10) {
        u5[] u5VarArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0 && ((u5VarArr = (u5[]) spanned.getSpans(0, spanned.length(), u5.class)) == null || u5VarArr.length > 0)) {
                charSequence = new SpannableString(spanned);
                for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                    CharacterStyle characterStyle = characterStyleArr[i11];
                    if (characterStyle != null && (characterStyle instanceof u5)) {
                        int spanStart = spanned.getSpanStart(characterStyle);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i11]);
                        u5 u5Var = (u5) characterStyleArr[i11];
                        charSequence.removeSpan(u5Var);
                        u5 cloneSpan = cloneSpan(u5Var, fontMetricsInt);
                        if (i10 != -1) {
                            cloneSpan.cacheType = i10;
                        }
                        cloneSpan.scale = u5Var.scale * f10;
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static q5 update(int i10, View view, boolean z4, q5 q5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z10) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                layoutArr[i11] = arrayList.get(i11).textLayout;
            }
        }
        return update(i10, view, z4, q5Var, z10, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10, int i11) {
        this.fontMetrics = fontMetricsInt;
        this.size = i10;
        this.cacheType = i11;
    }

    public u5(long j10, Paint.FontMetricsInt fontMetricsInt) {
        this(j10, 1.2f, fontMetricsInt);
    }

    public static void release(View view, q5 q5Var) {
        if (q5Var == null) {
            return;
        }
        while (q5Var.f28058a.size() > 0) {
            q5Var.b(0);
        }
    }

    public u5(long j10, float f10, Paint.FontMetricsInt fontMetricsInt) {
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

    public static q5 update(int i10, View view, q5 q5Var, Layout... layoutArr) {
        return update(i10, view, false, q5Var, layoutArr);
    }

    public static q5 update(int i10, View view, boolean z4, q5 q5Var, Layout... layoutArr) {
        return update(i10, view, z4, q5Var, false, layoutArr);
    }

    public static q5 update(int i10, View view, boolean z4, q5 q5Var, boolean z10, Layout... layoutArr) {
        int i11;
        u5[] u5VarArr;
        p5 p5Var;
        int i12;
        int i13;
        q5 q5Var2 = q5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i14 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (q5Var2 != null) {
                ArrayList arrayList = q5Var2.f28058a;
                arrayList.clear();
                while (arrayList.size() > 0) {
                    q5Var2.b(0);
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
                u5VarArr = null;
                q5Var2 = q5Var2;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                u5VarArr = (u5[]) spanned.getSpans(i14, spanned.length(), u5.class);
                int i16 = 0;
                ?? r12 = q5Var2;
                while (u5VarArr != null && i16 < u5VarArr.length) {
                    u5 u5Var = u5VarArr[i16];
                    if (u5Var == null) {
                        i12 = i15;
                    } else {
                        if (z10 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(u5Var);
                            int spanEnd = spanned.getSpanEnd(u5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(u5Var);
                            u5Var = cloneSpan(u5Var, fontMetricsInt);
                            u5VarArr[i16] = u5Var;
                            spannable.setSpan(u5Var, spanStart, spanEnd, 33);
                        }
                        if (r12 == 0) {
                            r12 = new Object();
                            r12.f28058a = new ArrayList();
                            r12.f28059b = new HashMap();
                            r12.f28060c = new ArrayList();
                        }
                        ArrayList arrayList2 = r12.f28058a;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                p5Var = fontMetricsInt;
                                break;
                            } else if (((p5) arrayList2.get(i17)).d == u5Var && ((p5) arrayList2.get(i17)).f27741c == layout) {
                                p5Var = (p5) arrayList2.get(i17);
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (p5Var == 0) {
                            p5 p5Var2 = new p5(view, z4);
                            p5Var2.f27741c = layout;
                            if (u5Var.standard) {
                                i13 = 8;
                            } else {
                                i13 = u5Var.cacheType;
                                if (i13 < 0) {
                                    i13 = i10;
                                }
                            }
                            if (u5Var.documentAbsolutePath != null) {
                                i12 = i15;
                                p5Var2.f27742f = l5.n(UserConfig.selectedAccount, u5Var.getDocumentId(), u5Var.documentAbsolutePath, i13);
                            } else {
                                i12 = i15;
                                TLRPC.Document document = u5Var.document;
                                if (document != null) {
                                    p5Var2.f27742f = l5.m(UserConfig.selectedAccount, i13, document);
                                } else {
                                    long j10 = u5Var.documentId;
                                    if (j10 != 0) {
                                        p5Var2.f27742f = l5.n(UserConfig.selectedAccount, j10, null, i13);
                                    }
                                }
                            }
                            int i18 = u5Var.cacheType;
                            if ((i18 == 20 || i18 == 21) && !TextUtils.isEmpty(u5Var.emoji)) {
                                l5 l5Var = p5Var2.f27742f;
                                if (l5Var != null) {
                                    l5Var.r(u5Var.emoji);
                                } else {
                                    p5Var2.h = Emoji.getEmojiDrawable(u5Var.emoji);
                                }
                            }
                            p5Var2.v = c(layout, spanned.getSpanStart(u5Var), spanned.getSpanEnd(u5Var));
                            p5Var2.e = new Rect();
                            p5Var2.d = u5Var;
                            arrayList2.add(p5Var2);
                            HashMap hashMap = r12.f28059b;
                            s5 s5Var = (s5) hashMap.get(layout);
                            if (s5Var == null) {
                                s5Var = new s5(view, layout);
                                hashMap.put(layout, s5Var);
                                r12.f28060c.add(s5Var);
                            }
                            s5Var.f28630b.add(p5Var2);
                            s5Var.a();
                            l5 l5Var2 = p5Var2.f27742f;
                            if (l5Var2 != null) {
                                l5Var2.b(p5Var2);
                            }
                        } else {
                            i12 = i15;
                            p5Var.v = c(layout, spanned.getSpanStart(u5Var), spanned.getSpanEnd(u5Var));
                        }
                    }
                    i16++;
                    i15 = i12;
                    fontMetricsInt = null;
                    r12 = r12;
                }
                i11 = i15;
                q5Var2 = r12;
            }
            if (q5Var2 != null) {
                ArrayList arrayList3 = q5Var2.f28058a;
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    if (((p5) arrayList3.get(i19)).f27741c == layout) {
                        u5 u5Var2 = ((p5) arrayList3.get(i19)).d;
                        for (int i20 = 0; u5VarArr != null && i20 < u5VarArr.length; i20++) {
                            if (u5VarArr[i20] == u5Var2) {
                                break;
                            }
                        }
                        q5Var2.b(i19);
                        i19--;
                    }
                    i19++;
                }
            }
            i15 = i11 + 1;
            fontMetricsInt = null;
            i14 = 0;
        }
        if (q5Var2 != null) {
            ArrayList arrayList4 = q5Var2.f28058a;
            int i21 = 0;
            while (i21 < arrayList4.size()) {
                Layout layout2 = ((p5) arrayList4.get(i21)).f27741c;
                int i22 = 0;
                while (true) {
                    if (i22 < layoutArr.length) {
                        if (layoutArr[i22] == layout2) {
                            break;
                        }
                        i22++;
                    } else {
                        q5Var2.b(i21);
                        i21--;
                        break;
                    }
                }
                i21++;
            }
        }
        return q5Var2;
    }

    public static LongSparseArray<l5> update(View view, u5[] u5VarArr, LongSparseArray<l5> longSparseArray) {
        return update(0, view, u5VarArr, longSparseArray);
    }

    public static LongSparseArray<l5> update(int i10, View view, u5[] u5VarArr, LongSparseArray<l5> longSparseArray) {
        int i11;
        l5 n10;
        int i12;
        if (u5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            l5 l5Var = longSparseArray.get(keyAt);
            if (l5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i12 < u5VarArr.length) {
                    u5 u5Var = u5VarArr[i12];
                    i12 = (u5Var == null || u5Var.getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                l5Var.o(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (u5 u5Var2 : u5VarArr) {
            if (u5Var2 != null && longSparseArray.get(u5Var2.getDocumentId()) == null) {
                if (u5Var2.standard) {
                    i11 = 8;
                } else {
                    i11 = u5Var2.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                TLRPC.Document document = u5Var2.document;
                if (document != null) {
                    n10 = l5.m(UserConfig.selectedAccount, i11, document);
                } else {
                    n10 = l5.n(UserConfig.selectedAccount, u5Var2.documentId, null, i11);
                }
                n10.a(view);
                longSparseArray.put(u5Var2.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<l5> update(View view, ArrayList<u5> arrayList, LongSparseArray<l5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<l5> update(int i10, View view, ArrayList<u5> arrayList, LongSparseArray<l5> longSparseArray) {
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
            l5 l5Var = longSparseArray.get(keyAt);
            if (l5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i12 < arrayList.size()) {
                    i12 = (arrayList.get(i12) == null || arrayList.get(i12).getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                l5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            u5 u5Var = arrayList.get(i14);
            if (u5Var != null && longSparseArray.get(u5Var.getDocumentId()) == null) {
                if (u5Var.standard) {
                    i11 = 8;
                } else {
                    i11 = u5Var.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                l5 n10 = l5.n(UserConfig.selectedAccount, u5Var.documentId, null, i11);
                n10.a(view);
                longSparseArray.put(u5Var.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }
}

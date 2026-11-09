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
import org.telegram.tgnet.TLRPC;
public class r5 extends ReplacementSpan {
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

    public r5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f26962id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static void a(r5 r5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        r5Var.extraScale = floatValue;
        r5Var.scale = org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(r5 r5Var) {
        if (r5Var.moveAnimator == null && r5Var.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            r5[] r5VarArr = (r5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), r5.class);
            if (r5VarArr != null) {
                for (r5 r5Var : r5VarArr) {
                    r5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static void b(r5 r5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        r5Var.extraScale = floatValue;
        r5Var.scale = org.telegram.messenger.g0.T1(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i7, int i10) {
        if (layout.getText() instanceof Spanned) {
            wy0[] wy0VarArr = (wy0[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i7), Math.min(layout.getText().length() - 1, i10), wy0.class);
            for (int i11 = 0; wy0VarArr != null && i11 < wy0VarArr.length; i11++) {
                wy0 wy0Var = wy0VarArr[i11];
                if (wy0Var != null && wy0Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static r5 cloneSpan(r5 r5Var, Paint.FontMetricsInt fontMetricsInt) {
        r5 r5Var2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = r5Var.document;
        if (document != null) {
            float f10 = r5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = r5Var.fontMetrics;
            }
            r5Var2 = new r5(document, f10, fontMetricsInt3);
        } else {
            long j3 = r5Var.documentId;
            float f11 = r5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = r5Var.fontMetrics;
            }
            r5Var2 = new r5(j3, f11, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            r5Var2.size = r5Var.size;
        }
        r5Var2.fromEmojiKeyboard = r5Var.fromEmojiKeyboard;
        r5Var2.isAdded = r5Var.isAdded;
        r5Var2.isRemoved = r5Var.isRemoved;
        return r5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, n5 n5Var, float f10, List<xh.f> list, float f11, float f12, float f13, float f14) {
        drawAnimatedEmojis(canvas, layout, n5Var, f10, list, f11, f12, f13, f14, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof r5) && !(characterStyle instanceof org.telegram.messenger.f6)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<i5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
            i5 valueAt = longSparseArray.valueAt(i7);
            if (valueAt != null) {
                valueAt.n(view);
            }
        }
        longSparseArray.clear();
    }

    public static n5 update(int i7, View view, n5 n5Var, ArrayList<org.telegram.messenger.fj> arrayList) {
        return update(i7, view, n5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i7) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i7;
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r5.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.f26962id;
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
                public final r5 f34930b;

                {
                    this.f34930b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            r5.b(this.f34930b, valueAnimator2);
                            return;
                        default:
                            r5.a(this.f34930b, valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new l5(this, 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(xq.f40458f);
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
                public final r5 f34930b;

                {
                    this.f34930b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            r5.b(this.f34930b, valueAnimator22);
                            return;
                        default:
                            r5.a(this.f34930b, valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new l5(this, 1));
            this.scaleAnimator.setInterpolator(xq.f40458f);
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.start();
        }
        return this.extraScale;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
        boolean z9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Paint.FontMetricsInt fontMetricsInt2 = fontMetricsInt;
        if (this.preserveFontMetrics && fontMetricsInt2 != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i11 = fontMetricsInt2.top;
        } else {
            i11 = 0;
        }
        if (z9) {
            i12 = fontMetricsInt2.ascent;
        } else {
            i12 = 0;
        }
        if (z9) {
            i13 = fontMetricsInt2.descent;
        } else {
            i13 = 0;
        }
        if (z9) {
            i14 = fontMetricsInt2.bottom;
        } else {
            i14 = 0;
        }
        if (z9) {
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
            int L = org.telegram.messenger.g0.L(8.0f);
            int L2 = org.telegram.messenger.g0.L(10.0f);
            if (fontMetricsInt2 != null) {
                float f10 = (-L2) - L;
                float f11 = this.scale;
                fontMetricsInt2.top = (int) (f10 * f11);
                float f12 = L2 - L;
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
        if (z9) {
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
                this.size = org.telegram.messenger.g0.L(20.0f);
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

    public r5 setMinimumLineHeight(int i7) {
        this.minimumLineHeight = i7;
        return this;
    }

    public r5 setPreserveFontMetrics(boolean z9) {
        this.preserveFontMetrics = z9;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public r5 setSize(int i7) {
        this.size = i7;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7) {
        return cloneSpans(charSequence, i7, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, n5 n5Var, float f10, List<xh.f> list, float f11, float f12, float f13, float f14, ColorFilter colorFilter) {
        boolean z9;
        if (canvas == null || layout == null || n5Var == null) {
            return;
        }
        ArrayList arrayList = n5Var.f36252c;
        int i7 = 0;
        if (org.telegram.messenger.i6.f23062m == 0.0f && f10 == 0.0f) {
            z9 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, org.telegram.messenger.i6.f23062m + org.telegram.messenger.g0.L(20.0f * f10));
            z9 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            p5 p5Var = (p5) arrayList.get(i10);
            if (p5Var.f36927a == layout) {
                ArrayList arrayList2 = p5Var.f36928b;
                int i11 = i7;
                while (i11 < arrayList2.size()) {
                    m5 m5Var = (m5) arrayList2.get(i11);
                    if (m5Var != null) {
                        i5 i5Var = m5Var.f35954f;
                        if (i5Var != null) {
                            i5Var.setColorFilter(colorFilter);
                        }
                        r5 r5Var = m5Var.d;
                        if (r5Var.spanDrawn) {
                            float f15 = r5Var.measuredSize / 2.0f;
                            float f16 = r5Var.lastDrawnCx;
                            float f17 = r5Var.lastDrawnCy;
                            m5Var.f35953e.set((int) (f16 - f15), (int) (f17 - f15), (int) (f16 + f15), (int) (f17 + f15));
                            float max = (list == null || list.isEmpty() || !m5Var.f35958w) ? 1.0f : Math.max(0.0f, list.get(i7).f58810n);
                            m5Var.f35956r = f13;
                            m5Var.f35957s = max;
                            m5Var.getClass();
                            if (f11 != 0.0f || f12 != 0.0f) {
                                Rect rect = m5Var.f35953e;
                                if (rect.bottom < f11 || rect.top > f12) {
                                    m5Var.f35955n = true;
                                    i11++;
                                    i7 = 0;
                                }
                            }
                            m5Var.f35955n = false;
                            i5 i5Var2 = m5Var.f35954f;
                            if (i5Var2 == null) {
                                if (m5Var.h != null) {
                                    float extraScale = m5Var.d.getExtraScale();
                                    m5Var.h.setAlpha((int) (m5Var.f35957s * 255.0f * f14));
                                    m5Var.h.setBounds(m5Var.f35953e);
                                    if (extraScale == 1.0f && !m5Var.d.invert) {
                                        m5Var.h.draw(canvas);
                                    } else {
                                        canvas.save();
                                        canvas.scale((m5Var.d.invert ? -1 : 1) * extraScale, extraScale, m5Var.f35953e.centerX(), m5Var.f35953e.centerY());
                                        m5Var.h.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            } else if (i5Var2.f34568k != null) {
                                i5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.l6.f28197v3 : colorFilter);
                                m5Var.f35954f.p(currentTimeMillis);
                                float extraScale2 = m5Var.d.getExtraScale();
                                if (extraScale2 == 1.0f && !m5Var.d.invert) {
                                    i5 i5Var3 = m5Var.f35954f;
                                    Rect rect2 = m5Var.f35953e;
                                    float f18 = m5Var.f35957s * f14;
                                    di.z2 z2Var = i5Var3.f34568k;
                                    if (z2Var != null) {
                                        z2Var.z0(rect2);
                                        i5Var3.f34568k.setAlpha(f18);
                                        i5Var3.f34568k.h(canvas, null);
                                    }
                                } else {
                                    canvas.save();
                                    canvas.scale((m5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, m5Var.f35953e.centerX(), m5Var.f35953e.centerY());
                                    i5 i5Var4 = m5Var.f35954f;
                                    Rect rect3 = m5Var.f35953e;
                                    float f19 = m5Var.f35957s * f14;
                                    di.z2 z2Var2 = i5Var4.f34568k;
                                    if (z2Var2 != null) {
                                        z2Var2.z0(rect3);
                                        i5Var4.f34568k.setAlpha(f19);
                                        i5Var4.f34568k.h(canvas, null);
                                    }
                                    canvas.restore();
                                }
                                if (access$400(m5Var.d)) {
                                    m5Var.invalidate();
                                }
                            }
                            i11++;
                            i7 = 0;
                        }
                    }
                    i11++;
                    i7 = 0;
                }
            } else {
                i10++;
                i7 = 0;
            }
        }
        if (z9) {
            canvas.restore();
        }
    }

    public static n5 update(int i7, View view, n5 n5Var, ArrayList<org.telegram.messenger.fj> arrayList, boolean z9) {
        return update(i7, view, false, n5Var, arrayList, z9);
    }

    public r5(TLRPC.Document document, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f26962id, f10, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i7, fontMetricsInt, 1.0f);
    }

    public static n5 update(int i7, View view, boolean z9, n5 n5Var, ArrayList<org.telegram.messenger.fj> arrayList) {
        return update(i7, view, z9, n5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7, Paint.FontMetricsInt fontMetricsInt, float f10) {
        r5[] r5VarArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0 && ((r5VarArr = (r5[]) spanned.getSpans(0, spanned.length(), r5.class)) == null || r5VarArr.length > 0)) {
                charSequence = new SpannableString(spanned);
                for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                    CharacterStyle characterStyle = characterStyleArr[i10];
                    if (characterStyle != null && (characterStyle instanceof r5)) {
                        int spanStart = spanned.getSpanStart(characterStyle);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i10]);
                        r5 r5Var = (r5) characterStyleArr[i10];
                        charSequence.removeSpan(r5Var);
                        r5 cloneSpan = cloneSpan(r5Var, fontMetricsInt);
                        if (i7 != -1) {
                            cloneSpan.cacheType = i7;
                        }
                        cloneSpan.scale = r5Var.scale * f10;
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static n5 update(int i7, View view, boolean z9, n5 n5Var, ArrayList<org.telegram.messenger.fj> arrayList, boolean z10) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                layoutArr[i10] = arrayList.get(i10).f22424e;
            }
        }
        return update(i7, view, z9, n5Var, z10, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i7, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.size = i7;
        this.cacheType = i10;
    }

    public r5(long j3, Paint.FontMetricsInt fontMetricsInt) {
        this(j3, 1.2f, fontMetricsInt);
    }

    public static void release(View view, n5 n5Var) {
        if (n5Var == null) {
            return;
        }
        while (n5Var.f36250a.size() > 0) {
            n5Var.b(0);
        }
    }

    public r5(long j3, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = org.telegram.messenger.g0.L(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j3;
        this.scale = f10;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = org.telegram.messenger.g0.L(20.0f);
            }
        }
    }

    public static n5 update(int i7, View view, n5 n5Var, Layout... layoutArr) {
        return update(i7, view, false, n5Var, layoutArr);
    }

    public static n5 update(int i7, View view, boolean z9, n5 n5Var, Layout... layoutArr) {
        return update(i7, view, z9, n5Var, false, layoutArr);
    }

    public static n5 update(int i7, View view, boolean z9, n5 n5Var, boolean z10, Layout... layoutArr) {
        int i10;
        r5[] r5VarArr;
        m5 m5Var;
        int i11;
        int i12;
        n5 n5Var2 = n5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i13 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (n5Var2 != null) {
                ArrayList arrayList = n5Var2.f36250a;
                arrayList.clear();
                while (arrayList.size() > 0) {
                    n5Var2.b(0);
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
                r5VarArr = null;
                n5Var2 = n5Var2;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                r5VarArr = (r5[]) spanned.getSpans(i13, spanned.length(), r5.class);
                int i15 = i13;
                ?? r02 = n5Var2;
                while (r5VarArr != null && i15 < r5VarArr.length) {
                    r5 r5Var = r5VarArr[i15];
                    if (r5Var == null) {
                        i11 = i14;
                    } else {
                        if (z10 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(r5Var);
                            int spanEnd = spanned.getSpanEnd(r5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(r5Var);
                            r5Var = cloneSpan(r5Var, fontMetricsInt);
                            r5VarArr[i15] = r5Var;
                            spannable.setSpan(r5Var, spanStart, spanEnd, 33);
                        }
                        if (r02 == 0) {
                            r02 = new Object();
                            r02.f36250a = new ArrayList();
                            r02.f36251b = new HashMap();
                            r02.f36252c = new ArrayList();
                        }
                        ArrayList arrayList2 = r02.f36250a;
                        int i16 = i13;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                m5Var = fontMetricsInt;
                                break;
                            } else if (((m5) arrayList2.get(i16)).d == r5Var && ((m5) arrayList2.get(i16)).f35952c == layout) {
                                m5Var = (m5) arrayList2.get(i16);
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (m5Var == 0) {
                            m5 m5Var2 = new m5(view, z9);
                            m5Var2.f35952c = layout;
                            if (r5Var.standard) {
                                i12 = 8;
                            } else {
                                i12 = r5Var.cacheType;
                                if (i12 < 0) {
                                    i12 = i7;
                                }
                            }
                            if (r5Var.documentAbsolutePath != null) {
                                i11 = i14;
                                m5Var2.f35954f = i5.m(org.telegram.messenger.p10.f24470s0, r5Var.getDocumentId(), r5Var.documentAbsolutePath, i12);
                            } else {
                                i11 = i14;
                                TLRPC.Document document = r5Var.document;
                                if (document != null) {
                                    m5Var2.f35954f = i5.l(org.telegram.messenger.p10.f24470s0, i12, document);
                                } else {
                                    long j3 = r5Var.documentId;
                                    if (j3 != 0) {
                                        m5Var2.f35954f = i5.m(org.telegram.messenger.p10.f24470s0, j3, null, i12);
                                    }
                                }
                            }
                            int i17 = r5Var.cacheType;
                            if ((i17 == 20 || i17 == 21) && !TextUtils.isEmpty(r5Var.emoji)) {
                                i5 i5Var = m5Var2.f35954f;
                                if (i5Var != null) {
                                    i5Var.q(r5Var.emoji);
                                } else {
                                    m5Var2.h = org.telegram.messenger.i6.g(r5Var.emoji);
                                }
                            }
                            m5Var2.f35958w = c(layout, spanned.getSpanStart(r5Var), spanned.getSpanEnd(r5Var));
                            m5Var2.f35953e = new Rect();
                            m5Var2.d = r5Var;
                            arrayList2.add(m5Var2);
                            HashMap hashMap = r02.f36251b;
                            p5 p5Var = (p5) hashMap.get(layout);
                            if (p5Var == null) {
                                p5Var = new p5(m5Var2.f35950a, layout);
                                hashMap.put(layout, p5Var);
                                r02.f36252c.add(p5Var);
                            }
                            p5Var.f36928b.add(m5Var2);
                            p5Var.a();
                            i5 i5Var2 = m5Var2.f35954f;
                            if (i5Var2 != null) {
                                i5Var2.b(m5Var2);
                            }
                        } else {
                            i11 = i14;
                            m5Var.f35958w = c(layout, spanned.getSpanStart(r5Var), spanned.getSpanEnd(r5Var));
                        }
                    }
                    i15++;
                    i14 = i11;
                    fontMetricsInt = null;
                    i13 = 0;
                    r02 = r02;
                }
                i10 = i14;
                n5Var2 = r02;
            }
            if (n5Var2 != null) {
                ArrayList arrayList3 = n5Var2.f36250a;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    if (((m5) arrayList3.get(i18)).f35952c == layout) {
                        r5 r5Var2 = ((m5) arrayList3.get(i18)).d;
                        for (int i19 = 0; r5VarArr != null && i19 < r5VarArr.length; i19++) {
                            if (r5VarArr[i19] == r5Var2) {
                                break;
                            }
                        }
                        n5Var2.b(i18);
                        i18--;
                    }
                    i18++;
                }
            }
            i14 = i10 + 1;
            fontMetricsInt = null;
            i13 = 0;
        }
        if (n5Var2 != null) {
            ArrayList arrayList4 = n5Var2.f36250a;
            int i20 = 0;
            while (i20 < arrayList4.size()) {
                Layout layout2 = ((m5) arrayList4.get(i20)).f35952c;
                int i21 = 0;
                while (true) {
                    if (i21 < layoutArr.length) {
                        if (layoutArr[i21] == layout2) {
                            break;
                        }
                        i21++;
                    } else {
                        n5Var2.b(i20);
                        i20--;
                        break;
                    }
                }
                i20++;
            }
        }
        return n5Var2;
    }

    public static LongSparseArray<i5> update(View view, r5[] r5VarArr, LongSparseArray<i5> longSparseArray) {
        return update(0, view, r5VarArr, longSparseArray);
    }

    public static LongSparseArray<i5> update(int i7, View view, r5[] r5VarArr, LongSparseArray<i5> longSparseArray) {
        int i10;
        i5 m10;
        int i11;
        if (r5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i12 = 0;
        while (i12 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i12);
            i5 i5Var = longSparseArray.get(keyAt);
            if (i5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (r5 r5Var : r5VarArr) {
                    i11 = (r5Var == null || r5Var.getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                i5Var.n(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (r5 r5Var2 : r5VarArr) {
            if (r5Var2 != null && longSparseArray.get(r5Var2.getDocumentId()) == null) {
                if (r5Var2.standard) {
                    i10 = 8;
                } else {
                    i10 = r5Var2.cacheType;
                    if (i10 < 0) {
                        i10 = i7;
                    }
                }
                TLRPC.Document document = r5Var2.document;
                if (document != null) {
                    m10 = i5.l(org.telegram.messenger.p10.f24470s0, i10, document);
                } else {
                    m10 = i5.m(org.telegram.messenger.p10.f24470s0, r5Var2.documentId, null, i10);
                }
                m10.a(view);
                longSparseArray.put(r5Var2.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<i5> update(View view, ArrayList<r5> arrayList, LongSparseArray<i5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<i5> update(int i7, View view, ArrayList<r5> arrayList, LongSparseArray<i5> longSparseArray) {
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
            i5 i5Var = longSparseArray.get(keyAt);
            if (i5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (i11 = 0; i11 < arrayList.size(); i11 = i11 + 1) {
                    i11 = (arrayList.get(i11) == null || arrayList.get(i11).getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                i5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            r5 r5Var = arrayList.get(i13);
            if (r5Var != null && longSparseArray.get(r5Var.getDocumentId()) == null) {
                if (r5Var.standard) {
                    i10 = 8;
                } else {
                    i10 = r5Var.cacheType;
                    if (i10 < 0) {
                        i10 = i7;
                    }
                }
                i5 m10 = i5.m(org.telegram.messenger.p10.f24470s0, r5Var.documentId, null, i10);
                m10.a(view);
                longSparseArray.put(r5Var.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }
}

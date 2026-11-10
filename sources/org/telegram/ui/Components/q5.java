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
public class q5 extends ReplacementSpan {
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

    public q5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f26966id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static void a(q5 q5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        q5Var.extraScale = floatValue;
        q5Var.scale = org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(q5 q5Var) {
        if (q5Var.moveAnimator == null && q5Var.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            q5[] q5VarArr = (q5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), q5.class);
            if (q5VarArr != null) {
                for (q5 q5Var : q5VarArr) {
                    q5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static void b(q5 q5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        q5Var.extraScale = floatValue;
        q5Var.scale = org.telegram.messenger.g0.T1(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i7, int i10) {
        if (layout.getText() instanceof Spanned) {
            vy0[] vy0VarArr = (vy0[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i7), Math.min(layout.getText().length() - 1, i10), vy0.class);
            for (int i11 = 0; vy0VarArr != null && i11 < vy0VarArr.length; i11++) {
                vy0 vy0Var = vy0VarArr[i11];
                if (vy0Var != null && vy0Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static q5 cloneSpan(q5 q5Var, Paint.FontMetricsInt fontMetricsInt) {
        q5 q5Var2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = q5Var.document;
        if (document != null) {
            float f10 = q5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = q5Var.fontMetrics;
            }
            q5Var2 = new q5(document, f10, fontMetricsInt3);
        } else {
            long j3 = q5Var.documentId;
            float f11 = q5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = q5Var.fontMetrics;
            }
            q5Var2 = new q5(j3, f11, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            q5Var2.size = q5Var.size;
        }
        q5Var2.fromEmojiKeyboard = q5Var.fromEmojiKeyboard;
        q5Var2.isAdded = q5Var.isAdded;
        q5Var2.isRemoved = q5Var.isRemoved;
        return q5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, m5 m5Var, float f10, List<xh.f> list, float f11, float f12, float f13, float f14) {
        drawAnimatedEmojis(canvas, layout, m5Var, f10, list, f11, f12, f13, f14, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof q5) && !(characterStyle instanceof org.telegram.messenger.f6)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<h5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
            h5 valueAt = longSparseArray.valueAt(i7);
            if (valueAt != null) {
                valueAt.n(view);
            }
        }
        longSparseArray.clear();
    }

    public static m5 update(int i7, View view, m5 m5Var, ArrayList<org.telegram.messenger.fj> arrayList) {
        return update(i7, view, m5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i7) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i7;
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q5.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.f26966id;
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
                public final q5 f34531b;

                {
                    this.f34531b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            q5.b(this.f34531b, valueAnimator2);
                            return;
                        default:
                            q5.a(this.f34531b, valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new k5(this, 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(wq.f40046f);
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
                public final q5 f34531b;

                {
                    this.f34531b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            q5.b(this.f34531b, valueAnimator22);
                            return;
                        default:
                            q5.a(this.f34531b, valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new k5(this, 1));
            this.scaleAnimator.setInterpolator(wq.f40046f);
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

    public q5 setMinimumLineHeight(int i7) {
        this.minimumLineHeight = i7;
        return this;
    }

    public q5 setPreserveFontMetrics(boolean z9) {
        this.preserveFontMetrics = z9;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public q5 setSize(int i7) {
        this.size = i7;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7) {
        return cloneSpans(charSequence, i7, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, m5 m5Var, float f10, List<xh.f> list, float f11, float f12, float f13, float f14, ColorFilter colorFilter) {
        boolean z9;
        if (canvas == null || layout == null || m5Var == null) {
            return;
        }
        ArrayList arrayList = m5Var.f35852c;
        int i7 = 0;
        if (org.telegram.messenger.i6.f23066m == 0.0f && f10 == 0.0f) {
            z9 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, org.telegram.messenger.i6.f23066m + org.telegram.messenger.g0.L(20.0f * f10));
            z9 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            o5 o5Var = (o5) arrayList.get(i10);
            if (o5Var.f36521a == layout) {
                ArrayList arrayList2 = o5Var.f36522b;
                int i11 = i7;
                while (i11 < arrayList2.size()) {
                    l5 l5Var = (l5) arrayList2.get(i11);
                    if (l5Var != null) {
                        h5 h5Var = l5Var.f35540f;
                        if (h5Var != null) {
                            h5Var.setColorFilter(colorFilter);
                        }
                        q5 q5Var = l5Var.d;
                        if (q5Var.spanDrawn) {
                            float f15 = q5Var.measuredSize / 2.0f;
                            float f16 = q5Var.lastDrawnCx;
                            float f17 = q5Var.lastDrawnCy;
                            l5Var.f35539e.set((int) (f16 - f15), (int) (f17 - f15), (int) (f16 + f15), (int) (f17 + f15));
                            float max = (list == null || list.isEmpty() || !l5Var.f35544w) ? 1.0f : Math.max(0.0f, list.get(i7).f58808n);
                            l5Var.f35542r = f13;
                            l5Var.f35543s = max;
                            l5Var.getClass();
                            if (f11 != 0.0f || f12 != 0.0f) {
                                Rect rect = l5Var.f35539e;
                                if (rect.bottom < f11 || rect.top > f12) {
                                    l5Var.f35541n = true;
                                    i11++;
                                    i7 = 0;
                                }
                            }
                            l5Var.f35541n = false;
                            h5 h5Var2 = l5Var.f35540f;
                            if (h5Var2 == null) {
                                if (l5Var.h != null) {
                                    float extraScale = l5Var.d.getExtraScale();
                                    l5Var.h.setAlpha((int) (l5Var.f35543s * 255.0f * f14));
                                    l5Var.h.setBounds(l5Var.f35539e);
                                    if (extraScale == 1.0f && !l5Var.d.invert) {
                                        l5Var.h.draw(canvas);
                                    } else {
                                        canvas.save();
                                        canvas.scale((l5Var.d.invert ? -1 : 1) * extraScale, extraScale, l5Var.f35539e.centerX(), l5Var.f35539e.centerY());
                                        l5Var.h.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            } else if (h5Var2.f34176k != null) {
                                h5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.m6.f28222v3 : colorFilter);
                                l5Var.f35540f.p(currentTimeMillis);
                                float extraScale2 = l5Var.d.getExtraScale();
                                if (extraScale2 == 1.0f && !l5Var.d.invert) {
                                    h5 h5Var3 = l5Var.f35540f;
                                    Rect rect2 = l5Var.f35539e;
                                    float f18 = l5Var.f35543s * f14;
                                    di.z2 z2Var = h5Var3.f34176k;
                                    if (z2Var != null) {
                                        z2Var.z0(rect2);
                                        h5Var3.f34176k.setAlpha(f18);
                                        h5Var3.f34176k.h(canvas, null);
                                    }
                                } else {
                                    canvas.save();
                                    canvas.scale((l5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, l5Var.f35539e.centerX(), l5Var.f35539e.centerY());
                                    h5 h5Var4 = l5Var.f35540f;
                                    Rect rect3 = l5Var.f35539e;
                                    float f19 = l5Var.f35543s * f14;
                                    di.z2 z2Var2 = h5Var4.f34176k;
                                    if (z2Var2 != null) {
                                        z2Var2.z0(rect3);
                                        h5Var4.f34176k.setAlpha(f19);
                                        h5Var4.f34176k.h(canvas, null);
                                    }
                                    canvas.restore();
                                }
                                if (access$400(l5Var.d)) {
                                    l5Var.invalidate();
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

    public static m5 update(int i7, View view, m5 m5Var, ArrayList<org.telegram.messenger.fj> arrayList, boolean z9) {
        return update(i7, view, false, m5Var, arrayList, z9);
    }

    public q5(TLRPC.Document document, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f26966id, f10, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i7, fontMetricsInt, 1.0f);
    }

    public static m5 update(int i7, View view, boolean z9, m5 m5Var, ArrayList<org.telegram.messenger.fj> arrayList) {
        return update(i7, view, z9, m5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7, Paint.FontMetricsInt fontMetricsInt, float f10) {
        q5[] q5VarArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0 && ((q5VarArr = (q5[]) spanned.getSpans(0, spanned.length(), q5.class)) == null || q5VarArr.length > 0)) {
                charSequence = new SpannableString(spanned);
                for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                    CharacterStyle characterStyle = characterStyleArr[i10];
                    if (characterStyle != null && (characterStyle instanceof q5)) {
                        int spanStart = spanned.getSpanStart(characterStyle);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i10]);
                        q5 q5Var = (q5) characterStyleArr[i10];
                        charSequence.removeSpan(q5Var);
                        q5 cloneSpan = cloneSpan(q5Var, fontMetricsInt);
                        if (i7 != -1) {
                            cloneSpan.cacheType = i7;
                        }
                        cloneSpan.scale = q5Var.scale * f10;
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static m5 update(int i7, View view, boolean z9, m5 m5Var, ArrayList<org.telegram.messenger.fj> arrayList, boolean z10) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                layoutArr[i10] = arrayList.get(i10).f22428e;
            }
        }
        return update(i7, view, z9, m5Var, z10, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i7, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.size = i7;
        this.cacheType = i10;
    }

    public q5(long j3, Paint.FontMetricsInt fontMetricsInt) {
        this(j3, 1.2f, fontMetricsInt);
    }

    public static void release(View view, m5 m5Var) {
        if (m5Var == null) {
            return;
        }
        while (m5Var.f35850a.size() > 0) {
            m5Var.b(0);
        }
    }

    public q5(long j3, float f10, Paint.FontMetricsInt fontMetricsInt) {
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

    public static m5 update(int i7, View view, m5 m5Var, Layout... layoutArr) {
        return update(i7, view, false, m5Var, layoutArr);
    }

    public static m5 update(int i7, View view, boolean z9, m5 m5Var, Layout... layoutArr) {
        return update(i7, view, z9, m5Var, false, layoutArr);
    }

    public static m5 update(int i7, View view, boolean z9, m5 m5Var, boolean z10, Layout... layoutArr) {
        int i10;
        q5[] q5VarArr;
        l5 l5Var;
        int i11;
        int i12;
        m5 m5Var2 = m5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i13 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (m5Var2 != null) {
                ArrayList arrayList = m5Var2.f35850a;
                arrayList.clear();
                while (arrayList.size() > 0) {
                    m5Var2.b(0);
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
                q5VarArr = null;
                m5Var2 = m5Var2;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                q5VarArr = (q5[]) spanned.getSpans(i13, spanned.length(), q5.class);
                int i15 = i13;
                ?? r02 = m5Var2;
                while (q5VarArr != null && i15 < q5VarArr.length) {
                    q5 q5Var = q5VarArr[i15];
                    if (q5Var == null) {
                        i11 = i14;
                    } else {
                        if (z10 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(q5Var);
                            int spanEnd = spanned.getSpanEnd(q5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(q5Var);
                            q5Var = cloneSpan(q5Var, fontMetricsInt);
                            q5VarArr[i15] = q5Var;
                            spannable.setSpan(q5Var, spanStart, spanEnd, 33);
                        }
                        if (r02 == 0) {
                            r02 = new Object();
                            r02.f35850a = new ArrayList();
                            r02.f35851b = new HashMap();
                            r02.f35852c = new ArrayList();
                        }
                        ArrayList arrayList2 = r02.f35850a;
                        int i16 = i13;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                l5Var = fontMetricsInt;
                                break;
                            } else if (((l5) arrayList2.get(i16)).d == q5Var && ((l5) arrayList2.get(i16)).f35538c == layout) {
                                l5Var = (l5) arrayList2.get(i16);
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (l5Var == 0) {
                            l5 l5Var2 = new l5(view, z9);
                            l5Var2.f35538c = layout;
                            if (q5Var.standard) {
                                i12 = 8;
                            } else {
                                i12 = q5Var.cacheType;
                                if (i12 < 0) {
                                    i12 = i7;
                                }
                            }
                            if (q5Var.documentAbsolutePath != null) {
                                i11 = i14;
                                l5Var2.f35540f = h5.m(org.telegram.messenger.p10.f24474s0, q5Var.getDocumentId(), q5Var.documentAbsolutePath, i12);
                            } else {
                                i11 = i14;
                                TLRPC.Document document = q5Var.document;
                                if (document != null) {
                                    l5Var2.f35540f = h5.l(org.telegram.messenger.p10.f24474s0, i12, document);
                                } else {
                                    long j3 = q5Var.documentId;
                                    if (j3 != 0) {
                                        l5Var2.f35540f = h5.m(org.telegram.messenger.p10.f24474s0, j3, null, i12);
                                    }
                                }
                            }
                            int i17 = q5Var.cacheType;
                            if ((i17 == 20 || i17 == 21) && !TextUtils.isEmpty(q5Var.emoji)) {
                                h5 h5Var = l5Var2.f35540f;
                                if (h5Var != null) {
                                    h5Var.q(q5Var.emoji);
                                } else {
                                    l5Var2.h = org.telegram.messenger.i6.g(q5Var.emoji);
                                }
                            }
                            l5Var2.f35544w = c(layout, spanned.getSpanStart(q5Var), spanned.getSpanEnd(q5Var));
                            l5Var2.f35539e = new Rect();
                            l5Var2.d = q5Var;
                            arrayList2.add(l5Var2);
                            HashMap hashMap = r02.f35851b;
                            o5 o5Var = (o5) hashMap.get(layout);
                            if (o5Var == null) {
                                o5Var = new o5(l5Var2.f35536a, layout);
                                hashMap.put(layout, o5Var);
                                r02.f35852c.add(o5Var);
                            }
                            o5Var.f36522b.add(l5Var2);
                            o5Var.a();
                            h5 h5Var2 = l5Var2.f35540f;
                            if (h5Var2 != null) {
                                h5Var2.b(l5Var2);
                            }
                        } else {
                            i11 = i14;
                            l5Var.f35544w = c(layout, spanned.getSpanStart(q5Var), spanned.getSpanEnd(q5Var));
                        }
                    }
                    i15++;
                    i14 = i11;
                    fontMetricsInt = null;
                    i13 = 0;
                    r02 = r02;
                }
                i10 = i14;
                m5Var2 = r02;
            }
            if (m5Var2 != null) {
                ArrayList arrayList3 = m5Var2.f35850a;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    if (((l5) arrayList3.get(i18)).f35538c == layout) {
                        q5 q5Var2 = ((l5) arrayList3.get(i18)).d;
                        for (int i19 = 0; q5VarArr != null && i19 < q5VarArr.length; i19++) {
                            if (q5VarArr[i19] == q5Var2) {
                                break;
                            }
                        }
                        m5Var2.b(i18);
                        i18--;
                    }
                    i18++;
                }
            }
            i14 = i10 + 1;
            fontMetricsInt = null;
            i13 = 0;
        }
        if (m5Var2 != null) {
            ArrayList arrayList4 = m5Var2.f35850a;
            int i20 = 0;
            while (i20 < arrayList4.size()) {
                Layout layout2 = ((l5) arrayList4.get(i20)).f35538c;
                int i21 = 0;
                while (true) {
                    if (i21 < layoutArr.length) {
                        if (layoutArr[i21] == layout2) {
                            break;
                        }
                        i21++;
                    } else {
                        m5Var2.b(i20);
                        i20--;
                        break;
                    }
                }
                i20++;
            }
        }
        return m5Var2;
    }

    public static LongSparseArray<h5> update(View view, q5[] q5VarArr, LongSparseArray<h5> longSparseArray) {
        return update(0, view, q5VarArr, longSparseArray);
    }

    public static LongSparseArray<h5> update(int i7, View view, q5[] q5VarArr, LongSparseArray<h5> longSparseArray) {
        int i10;
        h5 m10;
        int i11;
        if (q5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i12 = 0;
        while (i12 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i12);
            h5 h5Var = longSparseArray.get(keyAt);
            if (h5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (q5 q5Var : q5VarArr) {
                    i11 = (q5Var == null || q5Var.getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                h5Var.n(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (q5 q5Var2 : q5VarArr) {
            if (q5Var2 != null && longSparseArray.get(q5Var2.getDocumentId()) == null) {
                if (q5Var2.standard) {
                    i10 = 8;
                } else {
                    i10 = q5Var2.cacheType;
                    if (i10 < 0) {
                        i10 = i7;
                    }
                }
                TLRPC.Document document = q5Var2.document;
                if (document != null) {
                    m10 = h5.l(org.telegram.messenger.p10.f24474s0, i10, document);
                } else {
                    m10 = h5.m(org.telegram.messenger.p10.f24474s0, q5Var2.documentId, null, i10);
                }
                m10.a(view);
                longSparseArray.put(q5Var2.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<h5> update(View view, ArrayList<q5> arrayList, LongSparseArray<h5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<h5> update(int i7, View view, ArrayList<q5> arrayList, LongSparseArray<h5> longSparseArray) {
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
            h5 h5Var = longSparseArray.get(keyAt);
            if (h5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (i11 = 0; i11 < arrayList.size(); i11 = i11 + 1) {
                    i11 = (arrayList.get(i11) == null || arrayList.get(i11).getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                h5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            q5 q5Var = arrayList.get(i13);
            if (q5Var != null && longSparseArray.get(q5Var.getDocumentId()) == null) {
                if (q5Var.standard) {
                    i10 = 8;
                } else {
                    i10 = q5Var.cacheType;
                    if (i10 < 0) {
                        i10 = i7;
                    }
                }
                h5 m10 = h5.m(org.telegram.messenger.p10.f24474s0, q5Var.documentId, null, i10);
                m10.a(view);
                longSparseArray.put(q5Var.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }
}

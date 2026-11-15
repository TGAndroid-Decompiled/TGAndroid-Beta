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
public class p5 extends ReplacementSpan {
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

    public p5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f28057id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static void a(p5 p5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p5Var.extraScale = floatValue;
        p5Var.scale = org.telegram.messenger.g0.T1(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(p5 p5Var) {
        if (p5Var.moveAnimator == null && p5Var.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            p5[] p5VarArr = (p5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), p5.class);
            if (p5VarArr != null) {
                for (p5 p5Var : p5VarArr) {
                    p5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static void b(p5 p5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        p5Var.extraScale = floatValue;
        p5Var.scale = org.telegram.messenger.g0.T1(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i7, int i10) {
        if (layout.getText() instanceof Spanned) {
            xy0[] xy0VarArr = (xy0[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i7), Math.min(layout.getText().length() - 1, i10), xy0.class);
            for (int i11 = 0; xy0VarArr != null && i11 < xy0VarArr.length; i11++) {
                xy0 xy0Var = xy0VarArr[i11];
                if (xy0Var != null && xy0Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static p5 cloneSpan(p5 p5Var, Paint.FontMetricsInt fontMetricsInt) {
        p5 p5Var2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = p5Var.document;
        if (document != null) {
            float f10 = p5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = p5Var.fontMetrics;
            }
            p5Var2 = new p5(document, f10, fontMetricsInt3);
        } else {
            long j3 = p5Var.documentId;
            float f11 = p5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = p5Var.fontMetrics;
            }
            p5Var2 = new p5(j3, f11, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            p5Var2.size = p5Var.size;
        }
        p5Var2.fromEmojiKeyboard = p5Var.fromEmojiKeyboard;
        p5Var2.isAdded = p5Var.isAdded;
        p5Var2.isRemoved = p5Var.isRemoved;
        return p5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, l5 l5Var, float f10, List<xh.f> list, float f11, float f12, float f13, float f14) {
        drawAnimatedEmojis(canvas, layout, l5Var, f10, list, f11, f12, f13, f14, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof p5) && !(characterStyle instanceof org.telegram.messenger.g6)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<g5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i7 = 0; i7 < longSparseArray.size(); i7++) {
            g5 valueAt = longSparseArray.valueAt(i7);
            if (valueAt != null) {
                valueAt.n(view);
            }
        }
        longSparseArray.clear();
    }

    public static l5 update(int i7, View view, l5 l5Var, ArrayList<org.telegram.messenger.dj> arrayList) {
        return update(i7, view, l5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i7) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i7;
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p5.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.f28057id;
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
                public final p5 f35167b;

                {
                    this.f35167b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            p5.b(this.f35167b, valueAnimator2);
                            return;
                        default:
                            p5.a(this.f35167b, valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new j5(this, 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(er.f34420f);
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
                public final p5 f35167b;

                {
                    this.f35167b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            p5.b(this.f35167b, valueAnimator22);
                            return;
                        default:
                            p5.a(this.f35167b, valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new j5(this, 1));
            this.scaleAnimator.setInterpolator(er.f34420f);
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.start();
        }
        return this.extraScale;
    }

    @Override
    public int getSize(Paint paint, CharSequence charSequence, int i7, int i10, Paint.FontMetricsInt fontMetricsInt) {
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

    public p5 setMinimumLineHeight(int i7) {
        this.minimumLineHeight = i7;
        return this;
    }

    public p5 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public p5 setSize(int i7) {
        this.size = i7;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7) {
        return cloneSpans(charSequence, i7, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, l5 l5Var, float f10, List<xh.f> list, float f11, float f12, float f13, float f14, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || l5Var == null) {
            return;
        }
        ArrayList arrayList = l5Var.f36728c;
        int i7 = 0;
        if (org.telegram.messenger.j6.f24530m == 0.0f && f10 == 0.0f) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, org.telegram.messenger.j6.f24530m + org.telegram.messenger.g0.L(20.0f * f10));
            z10 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                break;
            }
            n5 n5Var = (n5) arrayList.get(i10);
            if (n5Var.f37453a == layout) {
                ArrayList arrayList2 = n5Var.f37454b;
                int i11 = i7;
                while (i11 < arrayList2.size()) {
                    k5 k5Var = (k5) arrayList2.get(i11);
                    if (k5Var != null) {
                        g5 g5Var = k5Var.f36283f;
                        if (g5Var != null) {
                            g5Var.setColorFilter(colorFilter);
                        }
                        p5 p5Var = k5Var.d;
                        if (p5Var.spanDrawn) {
                            float f15 = p5Var.measuredSize / 2.0f;
                            float f16 = p5Var.lastDrawnCx;
                            float f17 = p5Var.lastDrawnCy;
                            k5Var.f36282e.set((int) (f16 - f15), (int) (f17 - f15), (int) (f16 + f15), (int) (f17 + f15));
                            float max = (list == null || list.isEmpty() || !k5Var.f36287w) ? 1.0f : Math.max(0.0f, list.get(i7).f59992n);
                            k5Var.f36285r = f13;
                            k5Var.f36286s = max;
                            k5Var.getClass();
                            if (f11 != 0.0f || f12 != 0.0f) {
                                Rect rect = k5Var.f36282e;
                                if (rect.bottom < f11 || rect.top > f12) {
                                    k5Var.f36284n = true;
                                    i11++;
                                    i7 = 0;
                                }
                            }
                            k5Var.f36284n = false;
                            g5 g5Var2 = k5Var.f36283f;
                            if (g5Var2 == null) {
                                if (k5Var.h != null) {
                                    float extraScale = k5Var.d.getExtraScale();
                                    k5Var.h.setAlpha((int) (k5Var.f36286s * 255.0f * f14));
                                    k5Var.h.setBounds(k5Var.f36282e);
                                    if (extraScale == 1.0f && !k5Var.d.invert) {
                                        k5Var.h.draw(canvas);
                                    } else {
                                        canvas.save();
                                        canvas.scale((k5Var.d.invert ? -1 : 1) * extraScale, extraScale, k5Var.f36282e.centerX(), k5Var.f36282e.centerY());
                                        k5Var.h.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            } else if (g5Var2.f34809k != null) {
                                g5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.j6.f29181v3 : colorFilter);
                                k5Var.f36283f.p(currentTimeMillis);
                                float extraScale2 = k5Var.d.getExtraScale();
                                if (extraScale2 == 1.0f && !k5Var.d.invert) {
                                    g5 g5Var3 = k5Var.f36283f;
                                    Rect rect2 = k5Var.f36282e;
                                    float f18 = k5Var.f36286s * f14;
                                    fi.u2 u2Var = g5Var3.f34809k;
                                    if (u2Var != null) {
                                        u2Var.z0(rect2);
                                        g5Var3.f34809k.setAlpha(f18);
                                        g5Var3.f34809k.h(canvas, null);
                                    }
                                } else {
                                    canvas.save();
                                    canvas.scale((k5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, k5Var.f36282e.centerX(), k5Var.f36282e.centerY());
                                    g5 g5Var4 = k5Var.f36283f;
                                    Rect rect3 = k5Var.f36282e;
                                    float f19 = k5Var.f36286s * f14;
                                    fi.u2 u2Var2 = g5Var4.f34809k;
                                    if (u2Var2 != null) {
                                        u2Var2.z0(rect3);
                                        g5Var4.f34809k.setAlpha(f19);
                                        g5Var4.f34809k.h(canvas, null);
                                    }
                                    canvas.restore();
                                }
                                if (access$400(k5Var.d)) {
                                    k5Var.invalidate();
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
        if (z10) {
            canvas.restore();
        }
    }

    public static l5 update(int i7, View view, l5 l5Var, ArrayList<org.telegram.messenger.dj> arrayList, boolean z10) {
        return update(i7, view, false, l5Var, arrayList, z10);
    }

    public p5(TLRPC.Document document, float f10, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f28057id, f10, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i7, fontMetricsInt, 1.0f);
    }

    public static l5 update(int i7, View view, boolean z10, l5 l5Var, ArrayList<org.telegram.messenger.dj> arrayList) {
        return update(i7, view, z10, l5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i7, Paint.FontMetricsInt fontMetricsInt, float f10) {
        p5[] p5VarArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0 && ((p5VarArr = (p5[]) spanned.getSpans(0, spanned.length(), p5.class)) == null || p5VarArr.length > 0)) {
                charSequence = new SpannableString(spanned);
                for (int i10 = 0; i10 < characterStyleArr.length; i10++) {
                    CharacterStyle characterStyle = characterStyleArr[i10];
                    if (characterStyle != null && (characterStyle instanceof p5)) {
                        int spanStart = spanned.getSpanStart(characterStyle);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i10]);
                        p5 p5Var = (p5) characterStyleArr[i10];
                        charSequence.removeSpan(p5Var);
                        p5 cloneSpan = cloneSpan(p5Var, fontMetricsInt);
                        if (i7 != -1) {
                            cloneSpan.cacheType = i7;
                        }
                        cloneSpan.scale = p5Var.scale * f10;
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static l5 update(int i7, View view, boolean z10, l5 l5Var, ArrayList<org.telegram.messenger.dj> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                layoutArr[i10] = arrayList.get(i10).f23093e;
            }
        }
        return update(i7, view, z10, l5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i7, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.size = i7;
        this.cacheType = i10;
    }

    public p5(long j3, Paint.FontMetricsInt fontMetricsInt) {
        this(j3, 1.2f, fontMetricsInt);
    }

    public static void release(View view, l5 l5Var) {
        if (l5Var == null) {
            return;
        }
        while (l5Var.f36726a.size() > 0) {
            l5Var.b(0);
        }
    }

    public p5(long j3, float f10, Paint.FontMetricsInt fontMetricsInt) {
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

    public static l5 update(int i7, View view, l5 l5Var, Layout... layoutArr) {
        return update(i7, view, false, l5Var, layoutArr);
    }

    public static l5 update(int i7, View view, boolean z10, l5 l5Var, Layout... layoutArr) {
        return update(i7, view, z10, l5Var, false, layoutArr);
    }

    public static l5 update(int i7, View view, boolean z10, l5 l5Var, boolean z11, Layout... layoutArr) {
        int i10;
        p5[] p5VarArr;
        k5 k5Var;
        int i11;
        int i12;
        l5 l5Var2 = l5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i13 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (l5Var2 != null) {
                ArrayList arrayList = l5Var2.f36726a;
                arrayList.clear();
                while (arrayList.size() > 0) {
                    l5Var2.b(0);
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
                p5VarArr = null;
                l5Var2 = l5Var2;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                p5VarArr = (p5[]) spanned.getSpans(i13, spanned.length(), p5.class);
                int i15 = i13;
                ?? r02 = l5Var2;
                while (p5VarArr != null && i15 < p5VarArr.length) {
                    p5 p5Var = p5VarArr[i15];
                    if (p5Var == null) {
                        i11 = i14;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(p5Var);
                            int spanEnd = spanned.getSpanEnd(p5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(p5Var);
                            p5Var = cloneSpan(p5Var, fontMetricsInt);
                            p5VarArr[i15] = p5Var;
                            spannable.setSpan(p5Var, spanStart, spanEnd, 33);
                        }
                        if (r02 == 0) {
                            r02 = new Object();
                            r02.f36726a = new ArrayList();
                            r02.f36727b = new HashMap();
                            r02.f36728c = new ArrayList();
                        }
                        ArrayList arrayList2 = r02.f36726a;
                        int i16 = i13;
                        while (true) {
                            if (i16 >= arrayList2.size()) {
                                k5Var = fontMetricsInt;
                                break;
                            } else if (((k5) arrayList2.get(i16)).d == p5Var && ((k5) arrayList2.get(i16)).f36281c == layout) {
                                k5Var = (k5) arrayList2.get(i16);
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (k5Var == 0) {
                            k5 k5Var2 = new k5(view, z10);
                            k5Var2.f36281c = layout;
                            if (p5Var.standard) {
                                i12 = 8;
                            } else {
                                i12 = p5Var.cacheType;
                                if (i12 < 0) {
                                    i12 = i7;
                                }
                            }
                            if (p5Var.documentAbsolutePath != null) {
                                i11 = i14;
                                k5Var2.f36283f = g5.m(org.telegram.messenger.m10.f24934t0, p5Var.getDocumentId(), p5Var.documentAbsolutePath, i12);
                            } else {
                                i11 = i14;
                                TLRPC.Document document = p5Var.document;
                                if (document != null) {
                                    k5Var2.f36283f = g5.l(org.telegram.messenger.m10.f24934t0, i12, document);
                                } else {
                                    long j3 = p5Var.documentId;
                                    if (j3 != 0) {
                                        k5Var2.f36283f = g5.m(org.telegram.messenger.m10.f24934t0, j3, null, i12);
                                    }
                                }
                            }
                            int i17 = p5Var.cacheType;
                            if ((i17 == 20 || i17 == 21) && !TextUtils.isEmpty(p5Var.emoji)) {
                                g5 g5Var = k5Var2.f36283f;
                                if (g5Var != null) {
                                    g5Var.q(p5Var.emoji);
                                } else {
                                    k5Var2.h = org.telegram.messenger.j6.g(p5Var.emoji);
                                }
                            }
                            k5Var2.f36287w = c(layout, spanned.getSpanStart(p5Var), spanned.getSpanEnd(p5Var));
                            k5Var2.f36282e = new Rect();
                            k5Var2.d = p5Var;
                            arrayList2.add(k5Var2);
                            HashMap hashMap = r02.f36727b;
                            n5 n5Var = (n5) hashMap.get(layout);
                            if (n5Var == null) {
                                n5Var = new n5(k5Var2.f36279a, layout);
                                hashMap.put(layout, n5Var);
                                r02.f36728c.add(n5Var);
                            }
                            n5Var.f37454b.add(k5Var2);
                            n5Var.a();
                            g5 g5Var2 = k5Var2.f36283f;
                            if (g5Var2 != null) {
                                g5Var2.b(k5Var2);
                            }
                        } else {
                            i11 = i14;
                            k5Var.f36287w = c(layout, spanned.getSpanStart(p5Var), spanned.getSpanEnd(p5Var));
                        }
                    }
                    i15++;
                    i14 = i11;
                    fontMetricsInt = null;
                    i13 = 0;
                    r02 = r02;
                }
                i10 = i14;
                l5Var2 = r02;
            }
            if (l5Var2 != null) {
                ArrayList arrayList3 = l5Var2.f36726a;
                int i18 = 0;
                while (i18 < arrayList3.size()) {
                    if (((k5) arrayList3.get(i18)).f36281c == layout) {
                        p5 p5Var2 = ((k5) arrayList3.get(i18)).d;
                        for (int i19 = 0; p5VarArr != null && i19 < p5VarArr.length; i19++) {
                            if (p5VarArr[i19] == p5Var2) {
                                break;
                            }
                        }
                        l5Var2.b(i18);
                        i18--;
                    }
                    i18++;
                }
            }
            i14 = i10 + 1;
            fontMetricsInt = null;
            i13 = 0;
        }
        if (l5Var2 != null) {
            ArrayList arrayList4 = l5Var2.f36726a;
            int i20 = 0;
            while (i20 < arrayList4.size()) {
                Layout layout2 = ((k5) arrayList4.get(i20)).f36281c;
                int i21 = 0;
                while (true) {
                    if (i21 < layoutArr.length) {
                        if (layoutArr[i21] == layout2) {
                            break;
                        }
                        i21++;
                    } else {
                        l5Var2.b(i20);
                        i20--;
                        break;
                    }
                }
                i20++;
            }
        }
        return l5Var2;
    }

    public static LongSparseArray<g5> update(View view, p5[] p5VarArr, LongSparseArray<g5> longSparseArray) {
        return update(0, view, p5VarArr, longSparseArray);
    }

    public static LongSparseArray<g5> update(int i7, View view, p5[] p5VarArr, LongSparseArray<g5> longSparseArray) {
        int i10;
        g5 m10;
        int i11;
        if (p5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i12 = 0;
        while (i12 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i12);
            g5 g5Var = longSparseArray.get(keyAt);
            if (g5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (p5 p5Var : p5VarArr) {
                    i11 = (p5Var == null || p5Var.getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                g5Var.n(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (p5 p5Var2 : p5VarArr) {
            if (p5Var2 != null && longSparseArray.get(p5Var2.getDocumentId()) == null) {
                if (p5Var2.standard) {
                    i10 = 8;
                } else {
                    i10 = p5Var2.cacheType;
                    if (i10 < 0) {
                        i10 = i7;
                    }
                }
                TLRPC.Document document = p5Var2.document;
                if (document != null) {
                    m10 = g5.l(org.telegram.messenger.m10.f24934t0, i10, document);
                } else {
                    m10 = g5.m(org.telegram.messenger.m10.f24934t0, p5Var2.documentId, null, i10);
                }
                m10.a(view);
                longSparseArray.put(p5Var2.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<g5> update(View view, ArrayList<p5> arrayList, LongSparseArray<g5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<g5> update(int i7, View view, ArrayList<p5> arrayList, LongSparseArray<g5> longSparseArray) {
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
            g5 g5Var = longSparseArray.get(keyAt);
            if (g5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (i11 = 0; i11 < arrayList.size(); i11 = i11 + 1) {
                    i11 = (arrayList.get(i11) == null || arrayList.get(i11).getDocumentId() != keyAt) ? i11 + 1 : 0;
                }
                g5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i12--;
            i12++;
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            p5 p5Var = arrayList.get(i13);
            if (p5Var != null && longSparseArray.get(p5Var.getDocumentId()) == null) {
                if (p5Var.standard) {
                    i10 = 8;
                } else {
                    i10 = p5Var.cacheType;
                    if (i10 < 0) {
                        i10 = i7;
                    }
                }
                g5 m10 = g5.m(org.telegram.messenger.m10.f24934t0, p5Var.documentId, null, i10);
                m10.a(view);
                longSparseArray.put(p5Var.getDocumentId(), m10);
            }
        }
        return longSparseArray;
    }
}

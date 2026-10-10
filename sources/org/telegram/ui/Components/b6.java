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
public class b6 extends ReplacementSpan {
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

    public b6(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f20048id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static void a(b6 b6Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b6Var.extraScale = floatValue;
        b6Var.scale = AndroidUtilities.lerp(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(b6 b6Var) {
        if (b6Var.moveAnimator == null && b6Var.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            b6[] b6VarArr = (b6[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), b6.class);
            if (b6VarArr != null) {
                for (b6 b6Var : b6VarArr) {
                    b6Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static void b(b6 b6Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        b6Var.extraScale = floatValue;
        b6Var.scale = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i10, int i11) {
        if (layout.getText() instanceof Spanned) {
            v11[] v11VarArr = (v11[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i10), Math.min(layout.getText().length() - 1, i11), v11.class);
            for (int i12 = 0; v11VarArr != null && i12 < v11VarArr.length; i12++) {
                v11 v11Var = v11VarArr[i12];
                if (v11Var != null && v11Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static b6 cloneSpan(b6 b6Var, Paint.FontMetricsInt fontMetricsInt) {
        b6 b6Var2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = b6Var.document;
        if (document != null) {
            float f7 = b6Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = b6Var.fontMetrics;
            }
            b6Var2 = new b6(document, f7, fontMetricsInt3);
        } else {
            long j3 = b6Var.documentId;
            float f10 = b6Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = b6Var.fontMetrics;
            }
            b6Var2 = new b6(j3, f10, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            b6Var2.size = b6Var.size;
        }
        b6Var2.fromEmojiKeyboard = b6Var.fromEmojiKeyboard;
        b6Var2.isAdded = b6Var.isAdded;
        b6Var2.isRemoved = b6Var.isRemoved;
        return b6Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, x5 x5Var, float f7, List<vh.g> list, float f10, float f11, float f12, float f13) {
        drawAnimatedEmojis(canvas, layout, x5Var, f7, list, f10, f11, f12, f13, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof b6) && !(characterStyle instanceof Emoji.EmojiSpan)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<s5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            s5 valueAt = longSparseArray.valueAt(i10);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static x5 update(int i10, View view, x5 x5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, x5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i10;
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b6.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.f20048id;
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
                public final b6 f30987b;

                {
                    this.f30987b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            b6.b(this.f30987b, valueAnimator2);
                            return;
                        default:
                            b6.a(this.f30987b, valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new v5(this, 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(is.f27443f);
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
                public final b6 f30987b;

                {
                    this.f30987b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            b6.b(this.f30987b, valueAnimator22);
                            return;
                        default:
                            b6.a(this.f30987b, valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new v5(this, 1));
            this.scaleAnimator.setInterpolator(is.f27443f);
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
                float f7 = (-dp2) - dp;
                float f10 = this.scale;
                fontMetricsInt2.top = (int) (f7 * f10);
                float f11 = dp2 - dp;
                fontMetricsInt2.bottom = (int) (f11 * f10);
                fontMetricsInt2.ascent = (int) (f7 * f10);
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

    public b6 setMinimumLineHeight(int i10) {
        this.minimumLineHeight = i10;
        return this;
    }

    public b6 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public b6 setSize(int i10) {
        this.size = i10;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10) {
        return cloneSpans(charSequence, i10, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, x5 x5Var, float f7, List<vh.g> list, float f10, float f11, float f12, float f13, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || x5Var == null) {
            return;
        }
        ArrayList arrayList = x5Var.f32840c;
        int i10 = 0;
        if (Emoji.emojiDrawingYOffset == 0.0f && f7 == 0.0f) {
            z10 = false;
        } else {
            canvas.save();
            canvas.translate(0.0f, Emoji.emojiDrawingYOffset + AndroidUtilities.dp(20.0f * f7));
            z10 = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i11 = 0;
        while (true) {
            if (i11 >= arrayList.size()) {
                break;
            }
            z5 z5Var = (z5) arrayList.get(i11);
            if (z5Var.f33504a == layout) {
                ArrayList arrayList2 = z5Var.f33505b;
                int i12 = i10;
                while (i12 < arrayList2.size()) {
                    w5 w5Var = (w5) arrayList2.get(i12);
                    if (w5Var != null) {
                        s5 s5Var = w5Var.f32597f;
                        if (s5Var != null) {
                            s5Var.setColorFilter(colorFilter);
                        }
                        b6 b6Var = w5Var.d;
                        if (b6Var.spanDrawn) {
                            float f14 = b6Var.measuredSize / 2.0f;
                            float f15 = b6Var.lastDrawnCx;
                            float f16 = b6Var.lastDrawnCy;
                            w5Var.f32596e.set((int) (f15 - f14), (int) (f16 - f14), (int) (f15 + f14), (int) (f16 + f14));
                            float max = (list == null || list.isEmpty() || !w5Var.v) ? 1.0f : Math.max(0.0f, list.get(i10).f49735n);
                            w5Var.f32599r = f12;
                            w5Var.f32600s = max;
                            w5Var.getClass();
                            if (f10 != 0.0f || f11 != 0.0f) {
                                Rect rect = w5Var.f32596e;
                                if (rect.bottom < f10 || rect.top > f11) {
                                    w5Var.f32598n = true;
                                    i12++;
                                    i10 = 0;
                                }
                            }
                            w5Var.f32598n = false;
                            s5 s5Var2 = w5Var.f32597f;
                            if (s5Var2 == null) {
                                if (w5Var.h != null) {
                                    float extraScale = w5Var.d.getExtraScale();
                                    w5Var.h.setAlpha((int) (w5Var.f32600s * 255.0f * f13));
                                    w5Var.h.setBounds(w5Var.f32596e);
                                    if (extraScale == 1.0f && !w5Var.d.invert) {
                                        w5Var.h.draw(canvas);
                                    } else {
                                        canvas.save();
                                        canvas.scale((w5Var.d.invert ? -1 : 1) * extraScale, extraScale, w5Var.f32596e.centerX(), w5Var.f32596e.centerY());
                                        w5Var.h.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            } else if (s5Var2.f30680k != null) {
                                s5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.i6.f21129v3 : colorFilter);
                                w5Var.f32597f.q(currentTimeMillis);
                                float extraScale2 = w5Var.d.getExtraScale();
                                if (extraScale2 == 1.0f && !w5Var.d.invert) {
                                    s5 s5Var3 = w5Var.f32597f;
                                    Rect rect2 = w5Var.f32596e;
                                    float f17 = w5Var.f32600s * f13;
                                    ai.m4 m4Var = s5Var3.f30680k;
                                    if (m4Var != null) {
                                        m4Var.setImageCoords(rect2);
                                        s5Var3.f30680k.setAlpha(f17);
                                        s5Var3.f30680k.draw(canvas);
                                    }
                                } else {
                                    canvas.save();
                                    canvas.scale((w5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, w5Var.f32596e.centerX(), w5Var.f32596e.centerY());
                                    s5 s5Var4 = w5Var.f32597f;
                                    Rect rect3 = w5Var.f32596e;
                                    float f18 = w5Var.f32600s * f13;
                                    ai.m4 m4Var2 = s5Var4.f30680k;
                                    if (m4Var2 != null) {
                                        m4Var2.setImageCoords(rect3);
                                        s5Var4.f30680k.setAlpha(f18);
                                        s5Var4.f30680k.draw(canvas);
                                    }
                                    canvas.restore();
                                }
                                if (access$400(w5Var.d)) {
                                    w5Var.invalidate();
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

    public static x5 update(int i10, View view, x5 x5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z10) {
        return update(i10, view, false, x5Var, arrayList, z10);
    }

    public b6(TLRPC.Document document, float f7, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f20048id, f7, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i10, fontMetricsInt, 1.0f);
    }

    public static x5 update(int i10, View view, boolean z10, x5 x5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, z10, x5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt, float f7) {
        b6[] b6VarArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0 && ((b6VarArr = (b6[]) spanned.getSpans(0, spanned.length(), b6.class)) == null || b6VarArr.length > 0)) {
                charSequence = new SpannableString(spanned);
                for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                    CharacterStyle characterStyle = characterStyleArr[i11];
                    if (characterStyle != null && (characterStyle instanceof b6)) {
                        int spanStart = spanned.getSpanStart(characterStyle);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i11]);
                        b6 b6Var = (b6) characterStyleArr[i11];
                        charSequence.removeSpan(b6Var);
                        b6 cloneSpan = cloneSpan(b6Var, fontMetricsInt);
                        if (i10 != -1) {
                            cloneSpan.cacheType = i10;
                        }
                        cloneSpan.scale = b6Var.scale * f7;
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static x5 update(int i10, View view, boolean z10, x5 x5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                layoutArr[i11] = arrayList.get(i11).textLayout;
            }
        }
        return update(i10, view, z10, x5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10, int i11) {
        this.fontMetrics = fontMetricsInt;
        this.size = i10;
        this.cacheType = i11;
    }

    public b6(long j3, Paint.FontMetricsInt fontMetricsInt) {
        this(j3, 1.2f, fontMetricsInt);
    }

    public static void release(View view, x5 x5Var) {
        if (x5Var == null) {
            return;
        }
        while (x5Var.f32838a.size() > 0) {
            x5Var.b(0);
        }
    }

    public b6(long j3, float f7, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = AndroidUtilities.dp(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j3;
        this.scale = f7;
        this.fontMetrics = fontMetricsInt;
        if (fontMetricsInt != null) {
            float abs = Math.abs(fontMetricsInt.ascent) + Math.abs(fontMetricsInt.descent);
            this.size = abs;
            if (abs == 0.0f) {
                this.size = AndroidUtilities.dp(20.0f);
            }
        }
    }

    public static x5 update(int i10, View view, x5 x5Var, Layout... layoutArr) {
        return update(i10, view, false, x5Var, layoutArr);
    }

    public static x5 update(int i10, View view, boolean z10, x5 x5Var, Layout... layoutArr) {
        return update(i10, view, z10, x5Var, false, layoutArr);
    }

    public static x5 update(int i10, View view, boolean z10, x5 x5Var, boolean z11, Layout... layoutArr) {
        int i11;
        b6[] b6VarArr;
        w5 w5Var;
        int i12;
        int i13;
        x5 x5Var2 = x5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i14 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (x5Var2 != null) {
                ArrayList arrayList = x5Var2.f32838a;
                arrayList.clear();
                while (arrayList.size() > 0) {
                    x5Var2.b(0);
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
                b6VarArr = null;
                x5Var2 = x5Var2;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                b6VarArr = (b6[]) spanned.getSpans(i14, spanned.length(), b6.class);
                int i16 = i14;
                ?? r02 = x5Var2;
                while (b6VarArr != null && i16 < b6VarArr.length) {
                    b6 b6Var = b6VarArr[i16];
                    if (b6Var == null) {
                        i12 = i15;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(b6Var);
                            int spanEnd = spanned.getSpanEnd(b6Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(b6Var);
                            b6Var = cloneSpan(b6Var, fontMetricsInt);
                            b6VarArr[i16] = b6Var;
                            spannable.setSpan(b6Var, spanStart, spanEnd, 33);
                        }
                        if (r02 == 0) {
                            r02 = new Object();
                            r02.f32838a = new ArrayList();
                            r02.f32839b = new HashMap();
                            r02.f32840c = new ArrayList();
                        }
                        ArrayList arrayList2 = r02.f32838a;
                        int i17 = i14;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                w5Var = fontMetricsInt;
                                break;
                            } else if (((w5) arrayList2.get(i17)).d == b6Var && ((w5) arrayList2.get(i17)).f32595c == layout) {
                                w5Var = (w5) arrayList2.get(i17);
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (w5Var == 0) {
                            w5 w5Var2 = new w5(view, z10);
                            w5Var2.f32595c = layout;
                            if (b6Var.standard) {
                                i13 = 8;
                            } else {
                                i13 = b6Var.cacheType;
                                if (i13 < 0) {
                                    i13 = i10;
                                }
                            }
                            if (b6Var.documentAbsolutePath != null) {
                                i12 = i15;
                                w5Var2.f32597f = s5.n(UserConfig.selectedAccount, b6Var.getDocumentId(), b6Var.documentAbsolutePath, i13);
                            } else {
                                i12 = i15;
                                TLRPC.Document document = b6Var.document;
                                if (document != null) {
                                    w5Var2.f32597f = s5.m(UserConfig.selectedAccount, i13, document);
                                } else {
                                    long j3 = b6Var.documentId;
                                    if (j3 != 0) {
                                        w5Var2.f32597f = s5.n(UserConfig.selectedAccount, j3, null, i13);
                                    }
                                }
                            }
                            int i18 = b6Var.cacheType;
                            if ((i18 == 20 || i18 == 21) && !TextUtils.isEmpty(b6Var.emoji)) {
                                s5 s5Var = w5Var2.f32597f;
                                if (s5Var != null) {
                                    s5Var.r(b6Var.emoji);
                                } else {
                                    w5Var2.h = Emoji.getEmojiDrawable(b6Var.emoji);
                                }
                            }
                            w5Var2.v = c(layout, spanned.getSpanStart(b6Var), spanned.getSpanEnd(b6Var));
                            w5Var2.f32596e = new Rect();
                            w5Var2.d = b6Var;
                            arrayList2.add(w5Var2);
                            HashMap hashMap = r02.f32839b;
                            z5 z5Var = (z5) hashMap.get(layout);
                            if (z5Var == null) {
                                z5Var = new z5(w5Var2.f32593a, layout);
                                hashMap.put(layout, z5Var);
                                r02.f32840c.add(z5Var);
                            }
                            z5Var.f33505b.add(w5Var2);
                            z5Var.a();
                            s5 s5Var2 = w5Var2.f32597f;
                            if (s5Var2 != null) {
                                s5Var2.b(w5Var2);
                            }
                        } else {
                            i12 = i15;
                            w5Var.v = c(layout, spanned.getSpanStart(b6Var), spanned.getSpanEnd(b6Var));
                        }
                    }
                    i16++;
                    i15 = i12;
                    fontMetricsInt = null;
                    i14 = 0;
                    r02 = r02;
                }
                i11 = i15;
                x5Var2 = r02;
            }
            if (x5Var2 != null) {
                ArrayList arrayList3 = x5Var2.f32838a;
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    if (((w5) arrayList3.get(i19)).f32595c == layout) {
                        b6 b6Var2 = ((w5) arrayList3.get(i19)).d;
                        for (int i20 = 0; b6VarArr != null && i20 < b6VarArr.length; i20++) {
                            if (b6VarArr[i20] == b6Var2) {
                                break;
                            }
                        }
                        x5Var2.b(i19);
                        i19--;
                    }
                    i19++;
                }
            }
            i15 = i11 + 1;
            fontMetricsInt = null;
            i14 = 0;
        }
        if (x5Var2 != null) {
            ArrayList arrayList4 = x5Var2.f32838a;
            int i21 = 0;
            while (i21 < arrayList4.size()) {
                Layout layout2 = ((w5) arrayList4.get(i21)).f32595c;
                int i22 = 0;
                while (true) {
                    if (i22 < layoutArr.length) {
                        if (layoutArr[i22] == layout2) {
                            break;
                        }
                        i22++;
                    } else {
                        x5Var2.b(i21);
                        i21--;
                        break;
                    }
                }
                i21++;
            }
        }
        return x5Var2;
    }

    public static LongSparseArray<s5> update(View view, b6[] b6VarArr, LongSparseArray<s5> longSparseArray) {
        return update(0, view, b6VarArr, longSparseArray);
    }

    public static LongSparseArray<s5> update(int i10, View view, b6[] b6VarArr, LongSparseArray<s5> longSparseArray) {
        int i11;
        s5 n10;
        int i12;
        if (b6VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            s5 s5Var = longSparseArray.get(keyAt);
            if (s5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (b6 b6Var : b6VarArr) {
                    i12 = (b6Var == null || b6Var.getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                s5Var.o(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (b6 b6Var2 : b6VarArr) {
            if (b6Var2 != null && longSparseArray.get(b6Var2.getDocumentId()) == null) {
                if (b6Var2.standard) {
                    i11 = 8;
                } else {
                    i11 = b6Var2.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                TLRPC.Document document = b6Var2.document;
                if (document != null) {
                    n10 = s5.m(UserConfig.selectedAccount, i11, document);
                } else {
                    n10 = s5.n(UserConfig.selectedAccount, b6Var2.documentId, null, i11);
                }
                n10.a(view);
                longSparseArray.put(b6Var2.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<s5> update(View view, ArrayList<b6> arrayList, LongSparseArray<s5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<s5> update(int i10, View view, ArrayList<b6> arrayList, LongSparseArray<s5> longSparseArray) {
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
            s5 s5Var = longSparseArray.get(keyAt);
            if (s5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (i12 = 0; i12 < arrayList.size(); i12 = i12 + 1) {
                    i12 = (arrayList.get(i12) == null || arrayList.get(i12).getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                s5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            b6 b6Var = arrayList.get(i14);
            if (b6Var != null && longSparseArray.get(b6Var.getDocumentId()) == null) {
                if (b6Var.standard) {
                    i11 = 8;
                } else {
                    i11 = b6Var.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                s5 n10 = s5.n(UserConfig.selectedAccount, b6Var.documentId, null, i11);
                n10.a(view);
                longSparseArray.put(b6Var.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }
}

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
public class x5 extends ReplacementSpan {
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

    public x5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f18127id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static void a(x5 x5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x5Var.extraScale = floatValue;
        x5Var.scale = AndroidUtilities.lerp(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(x5 x5Var) {
        if (x5Var.moveAnimator == null && x5Var.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            x5[] x5VarArr = (x5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), x5.class);
            if (x5VarArr != null) {
                for (x5 x5Var : x5VarArr) {
                    x5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static void b(x5 x5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x5Var.extraScale = floatValue;
        x5Var.scale = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i10, int i11) {
        if (layout.getText() instanceof Spanned) {
            q01[] q01VarArr = (q01[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i10), Math.min(layout.getText().length() - 1, i11), q01.class);
            for (int i12 = 0; q01VarArr != null && i12 < q01VarArr.length; i12++) {
                q01 q01Var = q01VarArr[i12];
                if (q01Var != null && q01Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static x5 cloneSpan(x5 x5Var, Paint.FontMetricsInt fontMetricsInt) {
        x5 x5Var2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = x5Var.document;
        if (document != null) {
            float f7 = x5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = x5Var.fontMetrics;
            }
            x5Var2 = new x5(document, f7, fontMetricsInt3);
        } else {
            long j3 = x5Var.documentId;
            float f10 = x5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = x5Var.fontMetrics;
            }
            x5Var2 = new x5(j3, f10, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            x5Var2.size = x5Var.size;
        }
        x5Var2.fromEmojiKeyboard = x5Var.fromEmojiKeyboard;
        x5Var2.isAdded = x5Var.isAdded;
        x5Var2.isRemoved = x5Var.isRemoved;
        return x5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, t5 t5Var, float f7, List<vh.h> list, float f10, float f11, float f12, float f13) {
        drawAnimatedEmojis(canvas, layout, t5Var, f7, list, f10, f11, f12, f13, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof x5) && !(characterStyle instanceof Emoji.EmojiSpan)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<o5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            o5 valueAt = longSparseArray.valueAt(i10);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static t5 update(int i10, View view, t5 t5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, t5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i10;
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x5.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.f18127id;
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
                public final x5 f26932b;

                {
                    this.f26932b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            x5.b(this.f26932b, valueAnimator2);
                            return;
                        default:
                            x5.a(this.f26932b, valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new r5(this, 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(qr.f27383f);
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
                public final x5 f26932b;

                {
                    this.f26932b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            x5.b(this.f26932b, valueAnimator22);
                            return;
                        default:
                            x5.a(this.f26932b, valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new r5(this, 1));
            this.scaleAnimator.setInterpolator(qr.f27383f);
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

    public x5 setMinimumLineHeight(int i10) {
        this.minimumLineHeight = i10;
        return this;
    }

    public x5 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public x5 setSize(int i10) {
        this.size = i10;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10) {
        return cloneSpans(charSequence, i10, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, t5 t5Var, float f7, List<vh.h> list, float f10, float f11, float f12, float f13, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || t5Var == null) {
            return;
        }
        ArrayList arrayList = t5Var.f28018c;
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
            v5 v5Var = (v5) arrayList.get(i11);
            if (v5Var.f28599a == layout) {
                ArrayList arrayList2 = v5Var.f28600b;
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    s5 s5Var = (s5) arrayList2.get(i12);
                    if (s5Var != null) {
                        o5 o5Var = s5Var.f27772f;
                        if (o5Var != null) {
                            o5Var.setColorFilter(colorFilter);
                        }
                        x5 x5Var = s5Var.d;
                        if (x5Var.spanDrawn) {
                            float f14 = x5Var.measuredSize / 2.0f;
                            float f15 = x5Var.lastDrawnCx;
                            float f16 = x5Var.lastDrawnCy;
                            s5Var.e.set((int) (f15 - f14), (int) (f16 - f14), (int) (f15 + f14), (int) (f16 + f14));
                            float max = (list == null || list.isEmpty() || !s5Var.v) ? 1.0f : Math.max(0.0f, list.get(i10).f44442n);
                            s5Var.f27774r = f12;
                            s5Var.f27775s = max;
                            s5Var.getClass();
                            if (f10 != 0.0f || f11 != 0.0f) {
                                Rect rect = s5Var.e;
                                if (rect.bottom < f10 || rect.top > f11) {
                                    s5Var.f27773n = true;
                                    i12++;
                                    i10 = 0;
                                }
                            }
                            s5Var.f27773n = false;
                            o5 o5Var2 = s5Var.f27772f;
                            if (o5Var2 == null) {
                                if (s5Var.h != null) {
                                    float extraScale = s5Var.d.getExtraScale();
                                    s5Var.h.setAlpha((int) (s5Var.f27775s * 255.0f * f13));
                                    s5Var.h.setBounds(s5Var.e);
                                    if (extraScale == 1.0f && !s5Var.d.invert) {
                                        s5Var.h.draw(canvas);
                                    } else {
                                        canvas.save();
                                        canvas.scale((s5Var.d.invert ? -1 : 1) * extraScale, extraScale, s5Var.e.centerX(), s5Var.e.centerY());
                                        s5Var.h.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            } else if (o5Var2.f26639k != null) {
                                o5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.j6.f19190v3 : colorFilter);
                                s5Var.f27772f.q(currentTimeMillis);
                                float extraScale2 = s5Var.d.getExtraScale();
                                if (extraScale2 == 1.0f && !s5Var.d.invert) {
                                    o5 o5Var3 = s5Var.f27772f;
                                    Rect rect2 = s5Var.e;
                                    float f17 = s5Var.f27775s * f13;
                                    ai.l4 l4Var = o5Var3.f26639k;
                                    if (l4Var != null) {
                                        l4Var.setImageCoords(rect2);
                                        o5Var3.f26639k.setAlpha(f17);
                                        o5Var3.f26639k.draw(canvas);
                                    }
                                } else {
                                    canvas.save();
                                    canvas.scale((s5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, s5Var.e.centerX(), s5Var.e.centerY());
                                    o5 o5Var4 = s5Var.f27772f;
                                    Rect rect3 = s5Var.e;
                                    float f18 = s5Var.f27775s * f13;
                                    ai.l4 l4Var2 = o5Var4.f26639k;
                                    if (l4Var2 != null) {
                                        l4Var2.setImageCoords(rect3);
                                        o5Var4.f26639k.setAlpha(f18);
                                        o5Var4.f26639k.draw(canvas);
                                    }
                                    canvas.restore();
                                }
                                if (access$400(s5Var.d)) {
                                    s5Var.invalidate();
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

    public static t5 update(int i10, View view, t5 t5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z10) {
        return update(i10, view, false, t5Var, arrayList, z10);
    }

    public x5(TLRPC.Document document, float f7, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f18127id, f7, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i10, fontMetricsInt, 1.0f);
    }

    public static t5 update(int i10, View view, boolean z10, t5 t5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, z10, t5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt, float f7) {
        x5[] x5VarArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0 && ((x5VarArr = (x5[]) spanned.getSpans(0, spanned.length(), x5.class)) == null || x5VarArr.length > 0)) {
                charSequence = new SpannableString(spanned);
                for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                    CharacterStyle characterStyle = characterStyleArr[i11];
                    if (characterStyle != null && (characterStyle instanceof x5)) {
                        int spanStart = spanned.getSpanStart(characterStyle);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i11]);
                        x5 x5Var = (x5) characterStyleArr[i11];
                        charSequence.removeSpan(x5Var);
                        x5 cloneSpan = cloneSpan(x5Var, fontMetricsInt);
                        if (i10 != -1) {
                            cloneSpan.cacheType = i10;
                        }
                        cloneSpan.scale = x5Var.scale * f7;
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static t5 update(int i10, View view, boolean z10, t5 t5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                layoutArr[i11] = arrayList.get(i11).textLayout;
            }
        }
        return update(i10, view, z10, t5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10, int i11) {
        this.fontMetrics = fontMetricsInt;
        this.size = i10;
        this.cacheType = i11;
    }

    public x5(long j3, Paint.FontMetricsInt fontMetricsInt) {
        this(j3, 1.2f, fontMetricsInt);
    }

    public static void release(View view, t5 t5Var) {
        if (t5Var == null) {
            return;
        }
        while (t5Var.f28016a.size() > 0) {
            t5Var.b(0);
        }
    }

    public x5(long j3, float f7, Paint.FontMetricsInt fontMetricsInt) {
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

    public static t5 update(int i10, View view, t5 t5Var, Layout... layoutArr) {
        return update(i10, view, false, t5Var, layoutArr);
    }

    public static t5 update(int i10, View view, boolean z10, t5 t5Var, Layout... layoutArr) {
        return update(i10, view, z10, t5Var, false, layoutArr);
    }

    public static t5 update(int i10, View view, boolean z10, t5 t5Var, boolean z11, Layout... layoutArr) {
        int i11;
        x5[] x5VarArr;
        s5 s5Var;
        int i12;
        int i13;
        t5 t5Var2 = t5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i14 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (t5Var2 != null) {
                ArrayList arrayList = t5Var2.f28016a;
                arrayList.clear();
                while (arrayList.size() > 0) {
                    t5Var2.b(0);
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
                x5VarArr = null;
                t5Var2 = t5Var2;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                x5VarArr = (x5[]) spanned.getSpans(i14, spanned.length(), x5.class);
                int i16 = 0;
                ?? r02 = t5Var2;
                while (x5VarArr != null && i16 < x5VarArr.length) {
                    x5 x5Var = x5VarArr[i16];
                    if (x5Var == null) {
                        i12 = i15;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(x5Var);
                            int spanEnd = spanned.getSpanEnd(x5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(x5Var);
                            x5Var = cloneSpan(x5Var, fontMetricsInt);
                            x5VarArr[i16] = x5Var;
                            spannable.setSpan(x5Var, spanStart, spanEnd, 33);
                        }
                        if (r02 == 0) {
                            r02 = new Object();
                            r02.f28016a = new ArrayList();
                            r02.f28017b = new HashMap();
                            r02.f28018c = new ArrayList();
                        }
                        ArrayList arrayList2 = r02.f28016a;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                s5Var = fontMetricsInt;
                                break;
                            } else if (((s5) arrayList2.get(i17)).d == x5Var && ((s5) arrayList2.get(i17)).f27771c == layout) {
                                s5Var = (s5) arrayList2.get(i17);
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (s5Var == 0) {
                            s5 s5Var2 = new s5(view, z10);
                            s5Var2.f27771c = layout;
                            if (x5Var.standard) {
                                i13 = 8;
                            } else {
                                i13 = x5Var.cacheType;
                                if (i13 < 0) {
                                    i13 = i10;
                                }
                            }
                            if (x5Var.documentAbsolutePath != null) {
                                i12 = i15;
                                s5Var2.f27772f = o5.n(UserConfig.selectedAccount, x5Var.getDocumentId(), x5Var.documentAbsolutePath, i13);
                            } else {
                                i12 = i15;
                                TLRPC.Document document = x5Var.document;
                                if (document != null) {
                                    s5Var2.f27772f = o5.m(UserConfig.selectedAccount, i13, document);
                                } else {
                                    long j3 = x5Var.documentId;
                                    if (j3 != 0) {
                                        s5Var2.f27772f = o5.n(UserConfig.selectedAccount, j3, null, i13);
                                    }
                                }
                            }
                            int i18 = x5Var.cacheType;
                            if ((i18 == 20 || i18 == 21) && !TextUtils.isEmpty(x5Var.emoji)) {
                                o5 o5Var = s5Var2.f27772f;
                                if (o5Var != null) {
                                    o5Var.r(x5Var.emoji);
                                } else {
                                    s5Var2.h = Emoji.getEmojiDrawable(x5Var.emoji);
                                }
                            }
                            s5Var2.v = c(layout, spanned.getSpanStart(x5Var), spanned.getSpanEnd(x5Var));
                            s5Var2.e = new Rect();
                            s5Var2.d = x5Var;
                            arrayList2.add(s5Var2);
                            HashMap hashMap = r02.f28017b;
                            v5 v5Var = (v5) hashMap.get(layout);
                            if (v5Var == null) {
                                v5Var = new v5(s5Var2.f27769a, layout);
                                hashMap.put(layout, v5Var);
                                r02.f28018c.add(v5Var);
                            }
                            v5Var.f28600b.add(s5Var2);
                            v5Var.a();
                            o5 o5Var2 = s5Var2.f27772f;
                            if (o5Var2 != null) {
                                o5Var2.b(s5Var2);
                            }
                        } else {
                            i12 = i15;
                            s5Var.v = c(layout, spanned.getSpanStart(x5Var), spanned.getSpanEnd(x5Var));
                        }
                    }
                    i16++;
                    i15 = i12;
                    fontMetricsInt = null;
                    r02 = r02;
                }
                i11 = i15;
                t5Var2 = r02;
            }
            if (t5Var2 != null) {
                ArrayList arrayList3 = t5Var2.f28016a;
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    if (((s5) arrayList3.get(i19)).f27771c == layout) {
                        x5 x5Var2 = ((s5) arrayList3.get(i19)).d;
                        for (int i20 = 0; x5VarArr != null && i20 < x5VarArr.length; i20++) {
                            if (x5VarArr[i20] == x5Var2) {
                                break;
                            }
                        }
                        t5Var2.b(i19);
                        i19--;
                    }
                    i19++;
                }
            }
            i15 = i11 + 1;
            fontMetricsInt = null;
            i14 = 0;
        }
        if (t5Var2 != null) {
            ArrayList arrayList4 = t5Var2.f28016a;
            int i21 = 0;
            while (i21 < arrayList4.size()) {
                Layout layout2 = ((s5) arrayList4.get(i21)).f27771c;
                int i22 = 0;
                while (true) {
                    if (i22 < layoutArr.length) {
                        if (layoutArr[i22] == layout2) {
                            break;
                        }
                        i22++;
                    } else {
                        t5Var2.b(i21);
                        i21--;
                        break;
                    }
                }
                i21++;
            }
        }
        return t5Var2;
    }

    public static LongSparseArray<o5> update(View view, x5[] x5VarArr, LongSparseArray<o5> longSparseArray) {
        return update(0, view, x5VarArr, longSparseArray);
    }

    public static LongSparseArray<o5> update(int i10, View view, x5[] x5VarArr, LongSparseArray<o5> longSparseArray) {
        int i11;
        o5 n10;
        int i12;
        if (x5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            o5 o5Var = longSparseArray.get(keyAt);
            if (o5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i12 < x5VarArr.length) {
                    x5 x5Var = x5VarArr[i12];
                    i12 = (x5Var == null || x5Var.getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                o5Var.o(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (x5 x5Var2 : x5VarArr) {
            if (x5Var2 != null && longSparseArray.get(x5Var2.getDocumentId()) == null) {
                if (x5Var2.standard) {
                    i11 = 8;
                } else {
                    i11 = x5Var2.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                TLRPC.Document document = x5Var2.document;
                if (document != null) {
                    n10 = o5.m(UserConfig.selectedAccount, i11, document);
                } else {
                    n10 = o5.n(UserConfig.selectedAccount, x5Var2.documentId, null, i11);
                }
                n10.a(view);
                longSparseArray.put(x5Var2.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<o5> update(View view, ArrayList<x5> arrayList, LongSparseArray<o5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<o5> update(int i10, View view, ArrayList<x5> arrayList, LongSparseArray<o5> longSparseArray) {
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
            o5 o5Var = longSparseArray.get(keyAt);
            if (o5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i12 < arrayList.size()) {
                    i12 = (arrayList.get(i12) == null || arrayList.get(i12).getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                o5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            x5 x5Var = arrayList.get(i14);
            if (x5Var != null && longSparseArray.get(x5Var.getDocumentId()) == null) {
                if (x5Var.standard) {
                    i11 = 8;
                } else {
                    i11 = x5Var.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                o5 n10 = o5.n(UserConfig.selectedAccount, x5Var.documentId, null, i11);
                n10.a(view);
                longSparseArray.put(x5Var.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }
}

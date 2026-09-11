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
public class z5 extends ReplacementSpan {
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

    public z5(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f19875id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static void a(z5 z5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z5Var.extraScale = floatValue;
        z5Var.scale = AndroidUtilities.lerp(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(z5 z5Var) {
        if (z5Var.moveAnimator == null && z5Var.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            z5[] z5VarArr = (z5[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), z5.class);
            if (z5VarArr != null) {
                for (z5 z5Var : z5VarArr) {
                    z5Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static void b(z5 z5Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z5Var.extraScale = floatValue;
        z5Var.scale = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i10, int i11) {
        if (layout.getText() instanceof Spanned) {
            o01[] o01VarArr = (o01[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i10), Math.min(layout.getText().length() - 1, i11), o01.class);
            for (int i12 = 0; o01VarArr != null && i12 < o01VarArr.length; i12++) {
                o01 o01Var = o01VarArr[i12];
                if (o01Var != null && o01Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static z5 cloneSpan(z5 z5Var, Paint.FontMetricsInt fontMetricsInt) {
        z5 z5Var2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = z5Var.document;
        if (document != null) {
            float f7 = z5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = z5Var.fontMetrics;
            }
            z5Var2 = new z5(document, f7, fontMetricsInt3);
        } else {
            long j3 = z5Var.documentId;
            float f10 = z5Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = z5Var.fontMetrics;
            }
            z5Var2 = new z5(j3, f10, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            z5Var2.size = z5Var.size;
        }
        z5Var2.fromEmojiKeyboard = z5Var.fromEmojiKeyboard;
        z5Var2.isAdded = z5Var.isAdded;
        z5Var2.isRemoved = z5Var.isRemoved;
        return z5Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, v5 v5Var, float f7, List<wh.h> list, float f10, float f11, float f12, float f13) {
        drawAnimatedEmojis(canvas, layout, v5Var, f7, list, f10, f11, f12, f13, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof z5) && !(characterStyle instanceof Emoji.EmojiSpan)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<q5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            q5 valueAt = longSparseArray.valueAt(i10);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static v5 update(int i10, View view, v5 v5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, v5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i10;
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.z5.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.f19875id;
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
                public final z5 f29933b;

                {
                    this.f29933b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            z5.b(this.f29933b, valueAnimator2);
                            return;
                        default:
                            z5.a(this.f29933b, valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new t5(this, 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(pr.f29466f);
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
                public final z5 f29933b;

                {
                    this.f29933b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            z5.b(this.f29933b, valueAnimator22);
                            return;
                        default:
                            z5.a(this.f29933b, valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new t5(this, 1));
            this.scaleAnimator.setInterpolator(pr.f29466f);
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

    public z5 setMinimumLineHeight(int i10) {
        this.minimumLineHeight = i10;
        return this;
    }

    public z5 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public z5 setSize(int i10) {
        this.size = i10;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10) {
        return cloneSpans(charSequence, i10, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, v5 v5Var, float f7, List<wh.h> list, float f10, float f11, float f12, float f13, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || v5Var == null) {
            return;
        }
        ArrayList arrayList = v5Var.f31095c;
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
            x5 x5Var = (x5) arrayList.get(i11);
            if (x5Var.f32428a == layout) {
                ArrayList arrayList2 = x5Var.f32429b;
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    u5 u5Var = (u5) arrayList2.get(i12);
                    if (u5Var != null) {
                        q5 q5Var = u5Var.f30814f;
                        if (q5Var != null) {
                            q5Var.setColorFilter(colorFilter);
                        }
                        z5 z5Var = u5Var.d;
                        if (z5Var.spanDrawn) {
                            float f14 = z5Var.measuredSize / 2.0f;
                            float f15 = z5Var.lastDrawnCx;
                            float f16 = z5Var.lastDrawnCy;
                            u5Var.f30813e.set((int) (f15 - f14), (int) (f16 - f14), (int) (f15 + f14), (int) (f16 + f14));
                            float max = (list == null || list.isEmpty() || !u5Var.v) ? 1.0f : Math.max(0.0f, list.get(i10).f48624n);
                            u5Var.f30816r = f12;
                            u5Var.f30817s = max;
                            u5Var.getClass();
                            if (f10 != 0.0f || f11 != 0.0f) {
                                Rect rect = u5Var.f30813e;
                                if (rect.bottom < f10 || rect.top > f11) {
                                    u5Var.f30815n = true;
                                    i12++;
                                    i10 = 0;
                                }
                            }
                            u5Var.f30815n = false;
                            q5 q5Var2 = u5Var.f30814f;
                            if (q5Var2 == null) {
                                if (u5Var.h != null) {
                                    float extraScale = u5Var.d.getExtraScale();
                                    u5Var.h.setAlpha((int) (u5Var.f30817s * 255.0f * f13));
                                    u5Var.h.setBounds(u5Var.f30813e);
                                    if (extraScale == 1.0f && !u5Var.d.invert) {
                                        u5Var.h.draw(canvas);
                                    } else {
                                        canvas.save();
                                        canvas.scale((u5Var.d.invert ? -1 : 1) * extraScale, extraScale, u5Var.f30813e.centerX(), u5Var.f30813e.centerY());
                                        u5Var.h.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            } else if (q5Var2.f29584k != null) {
                                q5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.j6.f20987v3 : colorFilter);
                                u5Var.f30814f.q(currentTimeMillis);
                                float extraScale2 = u5Var.d.getExtraScale();
                                if (extraScale2 == 1.0f && !u5Var.d.invert) {
                                    q5 q5Var3 = u5Var.f30814f;
                                    Rect rect2 = u5Var.f30813e;
                                    float f17 = u5Var.f30817s * f13;
                                    bi.y3 y3Var = q5Var3.f29584k;
                                    if (y3Var != null) {
                                        y3Var.setImageCoords(rect2);
                                        q5Var3.f29584k.setAlpha(f17);
                                        q5Var3.f29584k.draw(canvas);
                                    }
                                } else {
                                    canvas.save();
                                    canvas.scale((u5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, u5Var.f30813e.centerX(), u5Var.f30813e.centerY());
                                    q5 q5Var4 = u5Var.f30814f;
                                    Rect rect3 = u5Var.f30813e;
                                    float f18 = u5Var.f30817s * f13;
                                    bi.y3 y3Var2 = q5Var4.f29584k;
                                    if (y3Var2 != null) {
                                        y3Var2.setImageCoords(rect3);
                                        q5Var4.f29584k.setAlpha(f18);
                                        q5Var4.f29584k.draw(canvas);
                                    }
                                    canvas.restore();
                                }
                                if (access$400(u5Var.d)) {
                                    u5Var.invalidate();
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

    public static v5 update(int i10, View view, v5 v5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z10) {
        return update(i10, view, false, v5Var, arrayList, z10);
    }

    public z5(TLRPC.Document document, float f7, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f19875id, f7, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i10, fontMetricsInt, 1.0f);
    }

    public static v5 update(int i10, View view, boolean z10, v5 v5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, z10, v5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt, float f7) {
        z5[] z5VarArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0 && ((z5VarArr = (z5[]) spanned.getSpans(0, spanned.length(), z5.class)) == null || z5VarArr.length > 0)) {
                charSequence = new SpannableString(spanned);
                for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                    CharacterStyle characterStyle = characterStyleArr[i11];
                    if (characterStyle != null && (characterStyle instanceof z5)) {
                        int spanStart = spanned.getSpanStart(characterStyle);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i11]);
                        z5 z5Var = (z5) characterStyleArr[i11];
                        charSequence.removeSpan(z5Var);
                        z5 cloneSpan = cloneSpan(z5Var, fontMetricsInt);
                        if (i10 != -1) {
                            cloneSpan.cacheType = i10;
                        }
                        cloneSpan.scale = z5Var.scale * f7;
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static v5 update(int i10, View view, boolean z10, v5 v5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                layoutArr[i11] = arrayList.get(i11).textLayout;
            }
        }
        return update(i10, view, z10, v5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10, int i11) {
        this.fontMetrics = fontMetricsInt;
        this.size = i10;
        this.cacheType = i11;
    }

    public z5(long j3, Paint.FontMetricsInt fontMetricsInt) {
        this(j3, 1.2f, fontMetricsInt);
    }

    public static void release(View view, v5 v5Var) {
        if (v5Var == null) {
            return;
        }
        while (v5Var.f31093a.size() > 0) {
            v5Var.b(0);
        }
    }

    public z5(long j3, float f7, Paint.FontMetricsInt fontMetricsInt) {
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

    public static v5 update(int i10, View view, v5 v5Var, Layout... layoutArr) {
        return update(i10, view, false, v5Var, layoutArr);
    }

    public static v5 update(int i10, View view, boolean z10, v5 v5Var, Layout... layoutArr) {
        return update(i10, view, z10, v5Var, false, layoutArr);
    }

    public static v5 update(int i10, View view, boolean z10, v5 v5Var, boolean z11, Layout... layoutArr) {
        int i11;
        z5[] z5VarArr;
        u5 u5Var;
        int i12;
        int i13;
        v5 v5Var2 = v5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i14 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (v5Var2 != null) {
                ArrayList arrayList = v5Var2.f31093a;
                arrayList.clear();
                while (arrayList.size() > 0) {
                    v5Var2.b(0);
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
                z5VarArr = null;
                v5Var2 = v5Var2;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                z5VarArr = (z5[]) spanned.getSpans(i14, spanned.length(), z5.class);
                int i16 = 0;
                ?? r12 = v5Var2;
                while (z5VarArr != null && i16 < z5VarArr.length) {
                    z5 z5Var = z5VarArr[i16];
                    if (z5Var == null) {
                        i12 = i15;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(z5Var);
                            int spanEnd = spanned.getSpanEnd(z5Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(z5Var);
                            z5Var = cloneSpan(z5Var, fontMetricsInt);
                            z5VarArr[i16] = z5Var;
                            spannable.setSpan(z5Var, spanStart, spanEnd, 33);
                        }
                        if (r12 == 0) {
                            r12 = new Object();
                            r12.f31093a = new ArrayList();
                            r12.f31094b = new HashMap();
                            r12.f31095c = new ArrayList();
                        }
                        ArrayList arrayList2 = r12.f31093a;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                u5Var = fontMetricsInt;
                                break;
                            } else if (((u5) arrayList2.get(i17)).d == z5Var && ((u5) arrayList2.get(i17)).f30812c == layout) {
                                u5Var = (u5) arrayList2.get(i17);
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (u5Var == 0) {
                            u5 u5Var2 = new u5(view, z10);
                            u5Var2.f30812c = layout;
                            if (z5Var.standard) {
                                i13 = 8;
                            } else {
                                i13 = z5Var.cacheType;
                                if (i13 < 0) {
                                    i13 = i10;
                                }
                            }
                            if (z5Var.documentAbsolutePath != null) {
                                i12 = i15;
                                u5Var2.f30814f = q5.n(UserConfig.selectedAccount, z5Var.getDocumentId(), z5Var.documentAbsolutePath, i13);
                            } else {
                                i12 = i15;
                                TLRPC.Document document = z5Var.document;
                                if (document != null) {
                                    u5Var2.f30814f = q5.m(UserConfig.selectedAccount, i13, document);
                                } else {
                                    long j3 = z5Var.documentId;
                                    if (j3 != 0) {
                                        u5Var2.f30814f = q5.n(UserConfig.selectedAccount, j3, null, i13);
                                    }
                                }
                            }
                            int i18 = z5Var.cacheType;
                            if ((i18 == 20 || i18 == 21) && !TextUtils.isEmpty(z5Var.emoji)) {
                                q5 q5Var = u5Var2.f30814f;
                                if (q5Var != null) {
                                    q5Var.r(z5Var.emoji);
                                } else {
                                    u5Var2.h = Emoji.getEmojiDrawable(z5Var.emoji);
                                }
                            }
                            u5Var2.v = c(layout, spanned.getSpanStart(z5Var), spanned.getSpanEnd(z5Var));
                            u5Var2.f30813e = new Rect();
                            u5Var2.d = z5Var;
                            arrayList2.add(u5Var2);
                            HashMap hashMap = r12.f31094b;
                            x5 x5Var = (x5) hashMap.get(layout);
                            if (x5Var == null) {
                                x5Var = new x5(view, layout);
                                hashMap.put(layout, x5Var);
                                r12.f31095c.add(x5Var);
                            }
                            x5Var.f32429b.add(u5Var2);
                            x5Var.a();
                            q5 q5Var2 = u5Var2.f30814f;
                            if (q5Var2 != null) {
                                q5Var2.b(u5Var2);
                            }
                        } else {
                            i12 = i15;
                            u5Var.v = c(layout, spanned.getSpanStart(z5Var), spanned.getSpanEnd(z5Var));
                        }
                    }
                    i16++;
                    i15 = i12;
                    fontMetricsInt = null;
                    r12 = r12;
                }
                i11 = i15;
                v5Var2 = r12;
            }
            if (v5Var2 != null) {
                ArrayList arrayList3 = v5Var2.f31093a;
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    if (((u5) arrayList3.get(i19)).f30812c == layout) {
                        z5 z5Var2 = ((u5) arrayList3.get(i19)).d;
                        for (int i20 = 0; z5VarArr != null && i20 < z5VarArr.length; i20++) {
                            if (z5VarArr[i20] == z5Var2) {
                                break;
                            }
                        }
                        v5Var2.b(i19);
                        i19--;
                    }
                    i19++;
                }
            }
            i15 = i11 + 1;
            fontMetricsInt = null;
            i14 = 0;
        }
        if (v5Var2 != null) {
            ArrayList arrayList4 = v5Var2.f31093a;
            int i21 = 0;
            while (i21 < arrayList4.size()) {
                Layout layout2 = ((u5) arrayList4.get(i21)).f30812c;
                int i22 = 0;
                while (true) {
                    if (i22 < layoutArr.length) {
                        if (layoutArr[i22] == layout2) {
                            break;
                        }
                        i22++;
                    } else {
                        v5Var2.b(i21);
                        i21--;
                        break;
                    }
                }
                i21++;
            }
        }
        return v5Var2;
    }

    public static LongSparseArray<q5> update(View view, z5[] z5VarArr, LongSparseArray<q5> longSparseArray) {
        return update(0, view, z5VarArr, longSparseArray);
    }

    public static LongSparseArray<q5> update(int i10, View view, z5[] z5VarArr, LongSparseArray<q5> longSparseArray) {
        int i11;
        q5 n10;
        int i12;
        if (z5VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            q5 q5Var = longSparseArray.get(keyAt);
            if (q5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i12 < z5VarArr.length) {
                    z5 z5Var = z5VarArr[i12];
                    i12 = (z5Var == null || z5Var.getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                q5Var.o(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (z5 z5Var2 : z5VarArr) {
            if (z5Var2 != null && longSparseArray.get(z5Var2.getDocumentId()) == null) {
                if (z5Var2.standard) {
                    i11 = 8;
                } else {
                    i11 = z5Var2.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                TLRPC.Document document = z5Var2.document;
                if (document != null) {
                    n10 = q5.m(UserConfig.selectedAccount, i11, document);
                } else {
                    n10 = q5.n(UserConfig.selectedAccount, z5Var2.documentId, null, i11);
                }
                n10.a(view);
                longSparseArray.put(z5Var2.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<q5> update(View view, ArrayList<z5> arrayList, LongSparseArray<q5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<q5> update(int i10, View view, ArrayList<z5> arrayList, LongSparseArray<q5> longSparseArray) {
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
            q5 q5Var = longSparseArray.get(keyAt);
            if (q5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                while (i12 < arrayList.size()) {
                    i12 = (arrayList.get(i12) == null || arrayList.get(i12).getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                q5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            z5 z5Var = arrayList.get(i14);
            if (z5Var != null && longSparseArray.get(z5Var.getDocumentId()) == null) {
                if (z5Var.standard) {
                    i11 = 8;
                } else {
                    i11 = z5Var.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                q5 n10 = q5.n(UserConfig.selectedAccount, z5Var.documentId, null, i11);
                n10.a(view);
                longSparseArray.put(z5Var.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }
}

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
public class c6 extends ReplacementSpan {
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

    public c6(TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f22033id, 1.2f, fontMetricsInt);
        this.document = document;
    }

    public static void a(c6 c6Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c6Var.extraScale = floatValue;
        c6Var.scale = AndroidUtilities.lerp(0.0f, 1.0f, floatValue);
    }

    public static boolean access$400(c6 c6Var) {
        if (c6Var.moveAnimator == null && c6Var.scaleAnimator == null) {
            return false;
        }
        return true;
    }

    public static void applyFontMetricsForString(CharSequence charSequence, Paint paint) {
        if (charSequence instanceof Spannable) {
            c6[] c6VarArr = (c6[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), c6.class);
            if (c6VarArr != null) {
                for (c6 c6Var : c6VarArr) {
                    c6Var.applyFontMetrics(paint.getFontMetricsInt());
                }
            }
        }
    }

    public static void b(c6 c6Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c6Var.extraScale = floatValue;
        c6Var.scale = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        lockPositionChanging = false;
    }

    public static boolean c(Layout layout, int i10, int i11) {
        if (layout.getText() instanceof Spanned) {
            z11[] z11VarArr = (z11[]) ((Spanned) layout.getText()).getSpans(Math.max(0, i10), Math.min(layout.getText().length() - 1, i11), z11.class);
            for (int i12 = 0; z11VarArr != null && i12 < z11VarArr.length; i12++) {
                z11 z11Var = z11VarArr[i12];
                if (z11Var != null && z11Var.c()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static c6 cloneSpan(c6 c6Var, Paint.FontMetricsInt fontMetricsInt) {
        c6 c6Var2;
        Paint.FontMetricsInt fontMetricsInt2;
        Paint.FontMetricsInt fontMetricsInt3;
        TLRPC.Document document = c6Var.document;
        if (document != null) {
            float f7 = c6Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt3 = fontMetricsInt;
            } else {
                fontMetricsInt3 = c6Var.fontMetrics;
            }
            c6Var2 = new c6(document, f7, fontMetricsInt3);
        } else {
            long j10 = c6Var.documentId;
            float f10 = c6Var.scale;
            if (fontMetricsInt != null) {
                fontMetricsInt2 = fontMetricsInt;
            } else {
                fontMetricsInt2 = c6Var.fontMetrics;
            }
            c6Var2 = new c6(j10, f10, fontMetricsInt2);
        }
        if (fontMetricsInt != null) {
            c6Var2.size = c6Var.size;
        }
        c6Var2.fromEmojiKeyboard = c6Var.fromEmojiKeyboard;
        c6Var2.isAdded = c6Var.isAdded;
        c6Var2.isRemoved = c6Var.isRemoved;
        return c6Var2;
    }

    public static CharSequence cloneSpans(CharSequence charSequence) {
        return cloneSpans(charSequence, -1, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, y5 y5Var, float f7, List<xh.g> list, float f10, float f11, float f12, float f13) {
        drawAnimatedEmojis(canvas, layout, y5Var, f7, list, f10, f11, f12, f13, null);
    }

    public static CharSequence onlyEmojiSpans(CharSequence charSequence) {
        CharacterStyle[] characterStyleArr;
        if (charSequence == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        for (CharacterStyle characterStyle : (CharacterStyle[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), CharacterStyle.class)) {
            if (!(characterStyle instanceof c6) && !(characterStyle instanceof Emoji.EmojiSpan)) {
                spannableStringBuilder.removeSpan(characterStyle);
            }
        }
        return spannableStringBuilder;
    }

    public static void release(View view, LongSparseArray<t5> longSparseArray) {
        if (longSparseArray == null) {
            return;
        }
        for (int i10 = 0; i10 < longSparseArray.size(); i10++) {
            t5 valueAt = longSparseArray.valueAt(i10);
            if (valueAt != null) {
                valueAt.o(view);
            }
        }
        longSparseArray.clear();
    }

    public static y5 update(int i10, View view, y5 y5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, y5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10) {
        this.fontMetrics = fontMetricsInt;
        this.cacheType = i10;
    }

    @Override
    public void draw(android.graphics.Canvas r8, java.lang.CharSequence r9, int r10, int r11, float r12, int r13, int r14, int r15, android.graphics.Paint r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.c6.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    public long getDocumentId() {
        TLRPC.Document document = this.document;
        if (document != null) {
            return document.f22033id;
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
                public final c6 f33255b;

                {
                    this.f33255b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            c6.b(this.f33255b, valueAnimator2);
                            return;
                        default:
                            c6.a(this.f33255b, valueAnimator2);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new w5(this, 0));
            this.scaleAnimator.setDuration(130L);
            this.scaleAnimator.setInterpolator(ds.f27586f);
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
                public final c6 f33255b;

                {
                    this.f33255b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            c6.b(this.f33255b, valueAnimator22);
                            return;
                        default:
                            c6.a(this.f33255b, valueAnimator22);
                            return;
                    }
                }
            });
            this.scaleAnimator.addListener(new w5(this, 1));
            this.scaleAnimator.setInterpolator(ds.f27586f);
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

    public c6 setMinimumLineHeight(int i10) {
        this.minimumLineHeight = i10;
        return this;
    }

    public c6 setPreserveFontMetrics(boolean z10) {
        this.preserveFontMetrics = z10;
        return this;
    }

    public void setRemoved(Runnable runnable) {
        this.removedAction = runnable;
        this.isRemoved = true;
        this.extraScale = 1.0f;
    }

    public c6 setSize(int i10) {
        this.size = i10;
        return this;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10) {
        return cloneSpans(charSequence, i10, null);
    }

    public static void drawAnimatedEmojis(Canvas canvas, Layout layout, y5 y5Var, float f7, List<xh.g> list, float f10, float f11, float f12, float f13, ColorFilter colorFilter) {
        boolean z10;
        if (canvas == null || layout == null || y5Var == null) {
            return;
        }
        ArrayList arrayList = y5Var.f34930c;
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
            a6 a6Var = (a6) arrayList.get(i11);
            if (a6Var.f26417a == layout) {
                ArrayList arrayList2 = a6Var.f26418b;
                int i12 = i10;
                while (i12 < arrayList2.size()) {
                    x5 x5Var = (x5) arrayList2.get(i12);
                    if (x5Var != null) {
                        t5 t5Var = x5Var.f34626f;
                        if (t5Var != null) {
                            t5Var.setColorFilter(colorFilter);
                        }
                        c6 c6Var = x5Var.d;
                        if (c6Var.spanDrawn) {
                            float f14 = c6Var.measuredSize / 2.0f;
                            float f15 = c6Var.lastDrawnCx;
                            float f16 = c6Var.lastDrawnCy;
                            x5Var.e.set((int) (f15 - f14), (int) (f16 - f14), (int) (f15 + f14), (int) (f16 + f14));
                            float max = (list == null || list.isEmpty() || !x5Var.v) ? 1.0f : Math.max(0.0f, list.get(i10).f51870n);
                            x5Var.f34628r = f12;
                            x5Var.f34629s = max;
                            x5Var.getClass();
                            if (f10 != 0.0f || f11 != 0.0f) {
                                Rect rect = x5Var.e;
                                if (rect.bottom < f10 || rect.top > f11) {
                                    x5Var.f34627n = true;
                                    i12++;
                                    i10 = 0;
                                }
                            }
                            x5Var.f34627n = false;
                            t5 t5Var2 = x5Var.f34626f;
                            if (t5Var2 == null) {
                                if (x5Var.h != null) {
                                    float extraScale = x5Var.d.getExtraScale();
                                    x5Var.h.setAlpha((int) (x5Var.f34629s * 255.0f * f13));
                                    x5Var.h.setBounds(x5Var.e);
                                    if (extraScale == 1.0f && !x5Var.d.invert) {
                                        x5Var.h.draw(canvas);
                                    } else {
                                        canvas.save();
                                        canvas.scale((x5Var.d.invert ? -1 : 1) * extraScale, extraScale, x5Var.e.centerX(), x5Var.e.centerY());
                                        x5Var.h.draw(canvas);
                                        canvas.restore();
                                    }
                                }
                            } else if (t5Var2.f32852k != null) {
                                t5Var2.setColorFilter(colorFilter == null ? org.telegram.ui.ActionBar.y6.f23689v3 : colorFilter);
                                x5Var.f34626f.q(currentTimeMillis);
                                float extraScale2 = x5Var.d.getExtraScale();
                                if (extraScale2 == 1.0f && !x5Var.d.invert) {
                                    t5 t5Var3 = x5Var.f34626f;
                                    Rect rect2 = x5Var.e;
                                    float f17 = x5Var.f34629s * f13;
                                    di.f3 f3Var = t5Var3.f32852k;
                                    if (f3Var != null) {
                                        f3Var.setImageCoords(rect2);
                                        t5Var3.f32852k.setAlpha(f17);
                                        t5Var3.f32852k.draw(canvas);
                                    }
                                } else {
                                    canvas.save();
                                    canvas.scale((x5Var.d.invert ? -1 : 1) * extraScale2, extraScale2, x5Var.e.centerX(), x5Var.e.centerY());
                                    t5 t5Var4 = x5Var.f34626f;
                                    Rect rect3 = x5Var.e;
                                    float f18 = x5Var.f34629s * f13;
                                    di.f3 f3Var2 = t5Var4.f32852k;
                                    if (f3Var2 != null) {
                                        f3Var2.setImageCoords(rect3);
                                        t5Var4.f32852k.setAlpha(f18);
                                        t5Var4.f32852k.draw(canvas);
                                    }
                                    canvas.restore();
                                }
                                if (access$400(x5Var.d)) {
                                    x5Var.invalidate();
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

    public static y5 update(int i10, View view, y5 y5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z10) {
        return update(i10, view, false, y5Var, arrayList, z10);
    }

    public c6(TLRPC.Document document, float f7, Paint.FontMetricsInt fontMetricsInt) {
        this(document.f22033id, f7, fontMetricsInt);
        this.document = document;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt) {
        return cloneSpans(charSequence, i10, fontMetricsInt, 1.0f);
    }

    public static y5 update(int i10, View view, boolean z10, y5 y5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList) {
        return update(i10, view, z10, y5Var, arrayList, false);
    }

    public void applyFontMetrics(Paint.FontMetricsInt fontMetricsInt) {
        this.fontMetrics = fontMetricsInt;
    }

    public static CharSequence cloneSpans(CharSequence charSequence, int i10, Paint.FontMetricsInt fontMetricsInt, float f7) {
        c6[] c6VarArr;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, spanned.length(), CharacterStyle.class);
            if (characterStyleArr != null && characterStyleArr.length > 0 && ((c6VarArr = (c6[]) spanned.getSpans(0, spanned.length(), c6.class)) == null || c6VarArr.length > 0)) {
                charSequence = new SpannableString(spanned);
                for (int i11 = 0; i11 < characterStyleArr.length; i11++) {
                    CharacterStyle characterStyle = characterStyleArr[i11];
                    if (characterStyle != null && (characterStyle instanceof c6)) {
                        int spanStart = spanned.getSpanStart(characterStyle);
                        int spanEnd = spanned.getSpanEnd(characterStyleArr[i11]);
                        c6 c6Var = (c6) characterStyleArr[i11];
                        charSequence.removeSpan(c6Var);
                        c6 cloneSpan = cloneSpan(c6Var, fontMetricsInt);
                        if (i10 != -1) {
                            cloneSpan.cacheType = i10;
                        }
                        cloneSpan.scale = c6Var.scale * f7;
                        charSequence.setSpan(cloneSpan, spanStart, spanEnd, 33);
                    }
                }
            }
            return charSequence;
        }
        return charSequence;
    }

    public static y5 update(int i10, View view, boolean z10, y5 y5Var, ArrayList<MessageObject.TextLayoutBlock> arrayList, boolean z11) {
        Layout[] layoutArr = new Layout[arrayList == null ? 0 : arrayList.size()];
        if (arrayList != null) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                layoutArr[i11] = arrayList.get(i11).textLayout;
            }
        }
        return update(i10, view, z10, y5Var, z11, layoutArr);
    }

    public void replaceFontMetrics(Paint.FontMetricsInt fontMetricsInt, int i10, int i11) {
        this.fontMetrics = fontMetricsInt;
        this.size = i10;
        this.cacheType = i11;
    }

    public c6(long j10, Paint.FontMetricsInt fontMetricsInt) {
        this(j10, 1.2f, fontMetricsInt);
    }

    public static void release(View view, y5 y5Var) {
        if (y5Var == null) {
            return;
        }
        while (y5Var.f34928a.size() > 0) {
            y5Var.b(0);
        }
    }

    public c6(long j10, float f7, Paint.FontMetricsInt fontMetricsInt) {
        this.extraScale = 1.0f;
        this.full = false;
        this.top = false;
        this.invert = false;
        this.size = AndroidUtilities.dp(20.0f);
        this.cacheType = -1;
        this.recordPositions = true;
        this.documentId = j10;
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

    public static y5 update(int i10, View view, y5 y5Var, Layout... layoutArr) {
        return update(i10, view, false, y5Var, layoutArr);
    }

    public static y5 update(int i10, View view, boolean z10, y5 y5Var, Layout... layoutArr) {
        return update(i10, view, z10, y5Var, false, layoutArr);
    }

    public static y5 update(int i10, View view, boolean z10, y5 y5Var, boolean z11, Layout... layoutArr) {
        int i11;
        c6[] c6VarArr;
        x5 x5Var;
        int i12;
        int i13;
        y5 y5Var2 = y5Var;
        Paint.FontMetricsInt fontMetricsInt = null;
        int i14 = 0;
        if (layoutArr == null || layoutArr.length <= 0) {
            if (y5Var2 != null) {
                ArrayList arrayList = y5Var2.f34928a;
                arrayList.clear();
                while (arrayList.size() > 0) {
                    y5Var2.b(0);
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
                c6VarArr = null;
                y5Var2 = y5Var2;
            } else {
                Spanned spanned = (Spanned) layout.getText();
                c6VarArr = (c6[]) spanned.getSpans(i14, spanned.length(), c6.class);
                int i16 = i14;
                ?? r02 = y5Var2;
                while (c6VarArr != null && i16 < c6VarArr.length) {
                    c6 c6Var = c6VarArr[i16];
                    if (c6Var == null) {
                        i12 = i15;
                    } else {
                        if (z11 && (layout.getText() instanceof Spannable)) {
                            int spanStart = spanned.getSpanStart(c6Var);
                            int spanEnd = spanned.getSpanEnd(c6Var);
                            Spannable spannable = (Spannable) spanned;
                            spannable.removeSpan(c6Var);
                            c6Var = cloneSpan(c6Var, fontMetricsInt);
                            c6VarArr[i16] = c6Var;
                            spannable.setSpan(c6Var, spanStart, spanEnd, 33);
                        }
                        if (r02 == 0) {
                            r02 = new Object();
                            r02.f34928a = new ArrayList();
                            r02.f34929b = new HashMap();
                            r02.f34930c = new ArrayList();
                        }
                        ArrayList arrayList2 = r02.f34928a;
                        int i17 = i14;
                        while (true) {
                            if (i17 >= arrayList2.size()) {
                                x5Var = fontMetricsInt;
                                break;
                            } else if (((x5) arrayList2.get(i17)).d == c6Var && ((x5) arrayList2.get(i17)).f34625c == layout) {
                                x5Var = (x5) arrayList2.get(i17);
                                break;
                            } else {
                                i17++;
                            }
                        }
                        if (x5Var == 0) {
                            x5 x5Var2 = new x5(view, z10);
                            x5Var2.f34625c = layout;
                            if (c6Var.standard) {
                                i13 = 8;
                            } else {
                                i13 = c6Var.cacheType;
                                if (i13 < 0) {
                                    i13 = i10;
                                }
                            }
                            if (c6Var.documentAbsolutePath != null) {
                                i12 = i15;
                                x5Var2.f34626f = t5.n(UserConfig.selectedAccount, c6Var.getDocumentId(), c6Var.documentAbsolutePath, i13);
                            } else {
                                i12 = i15;
                                TLRPC.Document document = c6Var.document;
                                if (document != null) {
                                    x5Var2.f34626f = t5.m(UserConfig.selectedAccount, i13, document);
                                } else {
                                    long j10 = c6Var.documentId;
                                    if (j10 != 0) {
                                        x5Var2.f34626f = t5.n(UserConfig.selectedAccount, j10, null, i13);
                                    }
                                }
                            }
                            int i18 = c6Var.cacheType;
                            if ((i18 == 20 || i18 == 21) && !TextUtils.isEmpty(c6Var.emoji)) {
                                t5 t5Var = x5Var2.f34626f;
                                if (t5Var != null) {
                                    t5Var.r(c6Var.emoji);
                                } else {
                                    x5Var2.h = Emoji.getEmojiDrawable(c6Var.emoji);
                                }
                            }
                            x5Var2.v = c(layout, spanned.getSpanStart(c6Var), spanned.getSpanEnd(c6Var));
                            x5Var2.e = new Rect();
                            x5Var2.d = c6Var;
                            arrayList2.add(x5Var2);
                            HashMap hashMap = r02.f34929b;
                            a6 a6Var = (a6) hashMap.get(layout);
                            if (a6Var == null) {
                                a6Var = new a6(x5Var2.f34623a, layout);
                                hashMap.put(layout, a6Var);
                                r02.f34930c.add(a6Var);
                            }
                            a6Var.f26418b.add(x5Var2);
                            a6Var.a();
                            t5 t5Var2 = x5Var2.f34626f;
                            if (t5Var2 != null) {
                                t5Var2.b(x5Var2);
                            }
                        } else {
                            i12 = i15;
                            x5Var.v = c(layout, spanned.getSpanStart(c6Var), spanned.getSpanEnd(c6Var));
                        }
                    }
                    i16++;
                    i15 = i12;
                    fontMetricsInt = null;
                    i14 = 0;
                    r02 = r02;
                }
                i11 = i15;
                y5Var2 = r02;
            }
            if (y5Var2 != null) {
                ArrayList arrayList3 = y5Var2.f34928a;
                int i19 = 0;
                while (i19 < arrayList3.size()) {
                    if (((x5) arrayList3.get(i19)).f34625c == layout) {
                        c6 c6Var2 = ((x5) arrayList3.get(i19)).d;
                        for (int i20 = 0; c6VarArr != null && i20 < c6VarArr.length; i20++) {
                            if (c6VarArr[i20] == c6Var2) {
                                break;
                            }
                        }
                        y5Var2.b(i19);
                        i19--;
                    }
                    i19++;
                }
            }
            i15 = i11 + 1;
            fontMetricsInt = null;
            i14 = 0;
        }
        if (y5Var2 != null) {
            ArrayList arrayList4 = y5Var2.f34928a;
            int i21 = 0;
            while (i21 < arrayList4.size()) {
                Layout layout2 = ((x5) arrayList4.get(i21)).f34625c;
                int i22 = 0;
                while (true) {
                    if (i22 < layoutArr.length) {
                        if (layoutArr[i22] == layout2) {
                            break;
                        }
                        i22++;
                    } else {
                        y5Var2.b(i21);
                        i21--;
                        break;
                    }
                }
                i21++;
            }
        }
        return y5Var2;
    }

    public static LongSparseArray<t5> update(View view, c6[] c6VarArr, LongSparseArray<t5> longSparseArray) {
        return update(0, view, c6VarArr, longSparseArray);
    }

    public static LongSparseArray<t5> update(int i10, View view, c6[] c6VarArr, LongSparseArray<t5> longSparseArray) {
        int i11;
        t5 n10;
        int i12;
        if (c6VarArr == null) {
            return longSparseArray;
        }
        if (longSparseArray == null) {
            longSparseArray = new LongSparseArray<>();
        }
        int i13 = 0;
        while (i13 < longSparseArray.size()) {
            long keyAt = longSparseArray.keyAt(i13);
            t5 t5Var = longSparseArray.get(keyAt);
            if (t5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (c6 c6Var : c6VarArr) {
                    i12 = (c6Var == null || c6Var.getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                t5Var.o(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (c6 c6Var2 : c6VarArr) {
            if (c6Var2 != null && longSparseArray.get(c6Var2.getDocumentId()) == null) {
                if (c6Var2.standard) {
                    i11 = 8;
                } else {
                    i11 = c6Var2.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                TLRPC.Document document = c6Var2.document;
                if (document != null) {
                    n10 = t5.m(UserConfig.selectedAccount, i11, document);
                } else {
                    n10 = t5.n(UserConfig.selectedAccount, c6Var2.documentId, null, i11);
                }
                n10.a(view);
                longSparseArray.put(c6Var2.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }

    public static LongSparseArray<t5> update(View view, ArrayList<c6> arrayList, LongSparseArray<t5> longSparseArray) {
        return update(0, view, arrayList, longSparseArray);
    }

    public static LongSparseArray<t5> update(int i10, View view, ArrayList<c6> arrayList, LongSparseArray<t5> longSparseArray) {
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
            t5 t5Var = longSparseArray.get(keyAt);
            if (t5Var == null) {
                longSparseArray.remove(keyAt);
            } else {
                for (i12 = 0; i12 < arrayList.size(); i12 = i12 + 1) {
                    i12 = (arrayList.get(i12) == null || arrayList.get(i12).getDocumentId() != keyAt) ? i12 + 1 : 0;
                }
                t5Var.a(view);
                longSparseArray.remove(keyAt);
            }
            i13--;
            i13++;
        }
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            c6 c6Var = arrayList.get(i14);
            if (c6Var != null && longSparseArray.get(c6Var.getDocumentId()) == null) {
                if (c6Var.standard) {
                    i11 = 8;
                } else {
                    i11 = c6Var.cacheType;
                    if (i11 < 0) {
                        i11 = i10;
                    }
                }
                t5 n10 = t5.n(UserConfig.selectedAccount, c6Var.documentId, null, i11);
                n10.a(view);
                longSparseArray.put(c6Var.getDocumentId(), n10);
            }
        }
        return longSparseArray;
    }
}

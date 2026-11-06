package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class l90 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public int D;
    public int E;
    public int F;
    public CharSequence G;
    public int H;
    public SpannableStringBuilder I;
    public int J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public Rect N;
    public Rect O;
    public final int f35573a;
    public TLRPC.InputStickerSet f35574b;
    public final Rect f35575c;
    public i5 d;
    public boolean f35576e;
    public final a80 f35577f;
    public final TextPaint h;
    public final CharSequence f35578n;
    public StaticLayout f35579r;
    public final String f35580s;
    public SpannableStringBuilder f35581w;
    public StaticLayout f35582x;
    public int f35583y;

    public l90(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        String M0;
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet m0;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        String G;
        this.f35575c = new Rect();
        this.f35576e = false;
        this.J = -1;
        this.K = true;
        this.M = 0.0f;
        this.f35573a = i7;
        int i11 = org.telegram.ui.ActionBar.k6.f27940i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), 0, 16);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, f6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, f6Var));
        if (arrayList.size() > 1) {
            if (i10 == 0) {
                G = org.telegram.messenger.hd.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]);
            } else {
                G = org.telegram.messenger.hd.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]);
            }
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(G);
            this.f35578n = X2;
            t31[] t31VarArr = (t31[]) X2.getSpans(0, X2.length(), t31.class);
            for (int i12 = 0; t31VarArr != null && i12 < t31VarArr.length; i12++) {
                int spanStart = X2.getSpanStart(t31VarArr[i12]);
                int spanEnd = X2.getSpanEnd(t31VarArr[i12]);
                X2.removeSpan(t31VarArr[i12]);
                X2.setSpan(new li.w5(this, 2), spanStart, spanEnd, 33);
            }
        } else if (arrayList.size() == 1) {
            if (i10 == 0) {
                M0 = org.telegram.messenger.hd.M0(2131748596, null);
            } else if (i10 == 3) {
                M0 = org.telegram.messenger.hd.M0(2131748592, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131748591, null);
            }
            String[] split = M0.split("%s");
            if (split.length <= 1) {
                this.f35578n = M0;
                return;
            }
            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
            this.f35574b = inputStickerSet;
            if (inputStickerSet != null && (m0 = org.telegram.messenger.ui.b0(i7).m0(this.f35574b, false)) != null && (stickerSet = m0.set) != null) {
                str = stickerSet.title;
                int i13 = 0;
                while (true) {
                    ArrayList<TLRPC.Document> arrayList3 = m0.documents;
                    if (arrayList3 == null || i13 >= arrayList3.size()) {
                        break;
                    } else if (m0.documents.get(i13).f26958id == m0.set.thumb_document_id) {
                        document = m0.documents.get(i13);
                        break;
                    } else {
                        i13++;
                    }
                }
                document = null;
                if (document == null && (arrayList2 = m0.documents) != null && arrayList2.size() > 0) {
                    document = m0.documents.get(0);
                }
            } else {
                str = null;
                document = null;
            }
            if (str != null && document != null) {
                SpannableString spannableString = new SpannableString(org.telegram.messenger.ij.U(document));
                spannableString.setSpan(new j90(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
                i5 l10 = i5.l(i7, 0, document);
                this.d = l10;
                org.telegram.ui.ActionBar.r6.y(this, l10, org.telegram.ui.ActionBar.k6.f28030n6, f6Var, PorterDuff.Mode.SRC_IN);
                this.d.a(this);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new li.w5(this, 2), 0, spannableString2.length(), 33);
                this.f35578n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
                this.M = 1.0f;
                this.f35574b = null;
                return;
            }
            this.f35578n = split[0];
            this.f35580s = split[1];
            a80 a80Var = new a80(f6Var);
            this.f35577f = a80Var;
            a80Var.f31735l = org.telegram.ui.ActionBar.k6.G8;
            a80Var.f31736m = org.telegram.ui.ActionBar.k6.f27940i6;
            a80Var.k(4.0f);
        } else if (i10 == 4) {
            this.f35578n = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131744866, null), org.telegram.ui.ActionBar.k6.Uc, 2, null, f6Var);
        }
    }

    public final int a(int i7, boolean z9) {
        int i10;
        float f10;
        float f11;
        int i11 = 0;
        if (i7 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.G;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.f35578n;
        if (charSequence2 != charSequence || this.F != i7) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i7, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f35579r = staticLayout;
                a80 a80Var = this.f35577f;
                if (a80Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f35583y = org.telegram.messenger.g0.L(2.0f) + ((int) this.f35579r.getPrimaryHorizontal(charSequence2.length()));
                    this.D = this.f35579r.getLineTop(lineCount);
                    this.E = r3 - this.D;
                    float min = Math.min(org.telegram.messenger.g0.L(100.0f), this.f35579r.getWidth() - this.f35583y);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i12 = this.f35583y;
                    rect.set(i12, this.D, (int) (i12 + min), r3);
                    a80Var.setBounds(this.N);
                    this.f35576e = true;
                }
            } else {
                this.f35579r = null;
                this.f35576e = false;
            }
            this.G = charSequence2;
            this.F = i7;
        }
        SpannableStringBuilder spannableStringBuilder = this.f35581w;
        if (spannableStringBuilder != this.I || this.H != i7) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f35581w;
                i10 = i7;
                this.f35582x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i10 = i7;
                this.f35582x = null;
            }
            this.I = this.f35581w;
            this.H = i10;
        }
        StaticLayout staticLayout2 = this.f35579r;
        if (staticLayout2 != null) {
            i11 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f35582x;
        if (staticLayout3 != null) {
            float height = staticLayout3.getHeight() - this.E;
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = this.M;
            }
            f10 = height * f11;
        } else {
            f10 = 0.0f;
        }
        return i11 + ((int) f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.l90.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i5 i5Var = this.d;
        if (i5Var != null) {
            i5Var.a(this);
        }
        org.telegram.messenger.qs.f(this.f35573a).c(this, org.telegram.messenger.qs.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i5 i5Var = this.d;
        if (i5Var != null) {
            i5Var.n(this);
        }
        org.telegram.messenger.qs.f(this.f35573a).n(this, org.telegram.messenger.qs.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f35579r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f35579r.draw(canvas);
            a80 a80Var = this.f35577f;
            if (a80Var != null && this.f35576e) {
                a80Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f10 = this.M;
                    Rect rect3 = org.telegram.messenger.g0.Q;
                    org.telegram.messenger.g0.X1(rect2, rect, f10, rect3);
                    a80Var.setBounds(rect3);
                }
                a80Var.draw(canvas);
                invalidate();
            }
            if (this.f35582x != null) {
                canvas.save();
                canvas.translate(0.0f, this.D);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.f35582x.draw(canvas);
                canvas.restore();
            }
            i5 i5Var = this.d;
            if (i5Var != null) {
                i5Var.setAlpha((int) (this.M * 255.0f));
                this.d.setBounds(this.f35575c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        int size = View.MeasureSpec.getSize(i7);
        if (this.K && (i11 = this.J) > 0) {
            size = Math.min(size, i11);
        }
        this.J = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), 1073741824));
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.h;
        if (textPaint != null) {
            try {
                int alpha = textPaint.getAlpha();
                textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

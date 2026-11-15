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
public final class n90 extends FrameLayout implements org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public int E;
    public int F;
    public int G;
    public CharSequence H;
    public int I;
    public SpannableStringBuilder J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public float N;
    public Rect O;
    public Rect P;
    public final int f37507a;
    public TLRPC.InputStickerSet f37508b;
    public final Rect f37509c;
    public g5 d;
    public boolean f37510e;
    public final d80 f37511f;
    public final TextPaint h;
    public final CharSequence f37512n;
    public StaticLayout f37513r;
    public final String f37514s;
    public SpannableStringBuilder f37515w;
    public StaticLayout f37516x;
    public int f37517y;

    public n90(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        String M0;
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet m0;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        String G;
        this.f37509c = new Rect();
        this.f37510e = false;
        this.K = -1;
        this.L = true;
        this.N = 0.0f;
        this.f37507a = i7;
        int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.j6.a0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), 0, 16);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.q6.j(this, a02, null, M, e6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, e6Var));
        if (arrayList.size() > 1) {
            if (i10 == 0) {
                G = org.telegram.messenger.hd.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]);
            } else {
                G = org.telegram.messenger.hd.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]);
            }
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(G);
            this.f37512n = X2;
            y31[] y31VarArr = (y31[]) X2.getSpans(0, X2.length(), y31.class);
            for (int i12 = 0; y31VarArr != null && i12 < y31VarArr.length; i12++) {
                int spanStart = X2.getSpanStart(y31VarArr[i12]);
                int spanEnd = X2.getSpanEnd(y31VarArr[i12]);
                X2.removeSpan(y31VarArr[i12]);
                X2.setSpan(new oi.u5(this, 2), spanStart, spanEnd, 33);
            }
        } else if (arrayList.size() == 1) {
            if (i10 == 0) {
                M0 = org.telegram.messenger.hd.M0(2131748597, null);
            } else if (i10 == 3) {
                M0 = org.telegram.messenger.hd.M0(2131748593, null);
            } else {
                M0 = org.telegram.messenger.hd.M0(2131748592, null);
            }
            String[] split = M0.split("%s");
            if (split.length <= 1) {
                this.f37512n = M0;
                return;
            }
            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
            this.f37508b = inputStickerSet;
            if (inputStickerSet != null && (m0 = org.telegram.messenger.si.b0(i7).m0(this.f37508b, false)) != null && (stickerSet = m0.set) != null) {
                str = stickerSet.title;
                int i13 = 0;
                while (true) {
                    ArrayList<TLRPC.Document> arrayList3 = m0.documents;
                    if (arrayList3 == null || i13 >= arrayList3.size()) {
                        break;
                    } else if (m0.documents.get(i13).f28057id == m0.set.thumb_document_id) {
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
                SpannableString spannableString = new SpannableString(org.telegram.messenger.gj.U(document));
                spannableString.setSpan(new l90(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
                g5 l10 = g5.l(i7, 0, document);
                this.d = l10;
                org.telegram.ui.ActionBar.q6.x(this, l10, org.telegram.ui.ActionBar.j6.f29031n6, e6Var, PorterDuff.Mode.SRC_IN);
                this.d.a(this);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new oi.u5(this, 2), 0, spannableString2.length(), 33);
                this.f37512n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
                this.N = 1.0f;
                this.f37508b = null;
                return;
            }
            this.f37512n = split[0];
            this.f37514s = split[1];
            d80 d80Var = new d80(e6Var);
            this.f37511f = d80Var;
            d80Var.f33873l = org.telegram.ui.ActionBar.j6.G8;
            d80Var.f33874m = org.telegram.ui.ActionBar.j6.f28941i6;
            d80Var.k(4.0f);
        } else if (i10 == 4) {
            this.f37512n = org.telegram.messenger.g0.S2(org.telegram.messenger.hd.M0(2131744865, null), org.telegram.ui.ActionBar.j6.Xc, 2, null, e6Var);
        }
    }

    public final int a(int i7, boolean z10) {
        int i10;
        float f10;
        float f11;
        int i11 = 0;
        if (i7 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.H;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.f37512n;
        if (charSequence2 != charSequence || this.G != i7) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i7, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f37513r = staticLayout;
                d80 d80Var = this.f37511f;
                if (d80Var != null && this.P == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f37517y = org.telegram.messenger.g0.L(2.0f) + ((int) this.f37513r.getPrimaryHorizontal(charSequence2.length()));
                    this.E = this.f37513r.getLineTop(lineCount);
                    this.F = r3 - this.E;
                    float min = Math.min(org.telegram.messenger.g0.L(100.0f), this.f37513r.getWidth() - this.f37517y);
                    if (this.O == null) {
                        this.O = new Rect();
                    }
                    Rect rect = this.O;
                    int i12 = this.f37517y;
                    rect.set(i12, this.E, (int) (i12 + min), r3);
                    d80Var.setBounds(this.O);
                    this.f37510e = true;
                }
            } else {
                this.f37513r = null;
                this.f37510e = false;
            }
            this.H = charSequence2;
            this.G = i7;
        }
        SpannableStringBuilder spannableStringBuilder = this.f37515w;
        if (spannableStringBuilder != this.J || this.I != i7) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f37515w;
                i10 = i7;
                this.f37516x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i10 = i7;
                this.f37516x = null;
            }
            this.J = this.f37515w;
            this.I = i10;
        }
        StaticLayout staticLayout2 = this.f37513r;
        if (staticLayout2 != null) {
            i11 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f37516x;
        if (staticLayout3 != null) {
            float height = staticLayout3.getHeight() - this.F;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = this.N;
            }
            f10 = height * f11;
        } else {
            f10 = 0.0f;
        }
        return i11 + ((int) f10);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.E8));
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n90.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.a(this);
        }
        org.telegram.messenger.ns.f(this.f37507a).c(this, org.telegram.messenger.ns.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.n(this);
        }
        org.telegram.messenger.ns.f(this.f37507a).n(this, org.telegram.messenger.ns.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f37513r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f37513r.draw(canvas);
            d80 d80Var = this.f37511f;
            if (d80Var != null && this.f37510e) {
                d80Var.setAlpha((int) ((1.0f - this.N) * 255.0f));
                Rect rect2 = this.O;
                if (rect2 != null && (rect = this.P) != null) {
                    float f10 = this.N;
                    Rect rect3 = org.telegram.messenger.g0.Q;
                    org.telegram.messenger.g0.X1(rect2, rect, f10, rect3);
                    d80Var.setBounds(rect3);
                }
                d80Var.draw(canvas);
                invalidate();
            }
            if (this.f37516x != null) {
                canvas.save();
                canvas.translate(0.0f, this.E);
                textPaint.setAlpha((int) (this.N * 255.0f));
                this.f37516x.draw(canvas);
                canvas.restore();
            }
            g5 g5Var = this.d;
            if (g5Var != null) {
                g5Var.setAlpha((int) (this.N * 255.0f));
                this.d.setBounds(this.f37509c);
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
        if (this.L && (i11 = this.K) > 0) {
            size = Math.min(size, i11);
        }
        this.K = size;
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.E8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

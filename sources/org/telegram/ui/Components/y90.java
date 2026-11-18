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
public final class y90 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
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
    public final int f42422a;
    public TLRPC.InputStickerSet f42423b;
    public final Rect f42424c;
    public o5 d;
    public boolean f42425e;
    public final o80 f42426f;
    public final TextPaint h;
    public final CharSequence f42427n;
    public StaticLayout f42428r;
    public final String f42429s;
    public SpannableStringBuilder f42430w;
    public StaticLayout f42431x;
    public int f42432y;

    public y90(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        String M0;
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet o02;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        String G;
        this.f42424c = new Rect();
        this.f42425e = false;
        this.K = -1;
        this.L = true;
        this.N = 0.0f;
        this.f42422a = i7;
        int i11 = org.telegram.ui.ActionBar.n6.f29486i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.n6.a0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), 0, 16);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.u6.j(this, a02, null, M, i6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, i6Var));
        if (arrayList.size() > 1) {
            if (i10 == 0) {
                G = org.telegram.messenger.gd.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]);
            } else {
                G = org.telegram.messenger.gd.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]);
            }
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(G);
            this.f42427n = W2;
            i41[] i41VarArr = (i41[]) W2.getSpans(0, W2.length(), i41.class);
            for (int i12 = 0; i41VarArr != null && i12 < i41VarArr.length; i12++) {
                int spanStart = W2.getSpanStart(i41VarArr[i12]);
                int spanEnd = W2.getSpanEnd(i41VarArr[i12]);
                W2.removeSpan(i41VarArr[i12]);
                W2.setSpan(new oi.v5(this, 2), spanStart, spanEnd, 33);
            }
        } else if (arrayList.size() == 1) {
            if (i10 == 0) {
                M0 = org.telegram.messenger.gd.M0(2131748405, null);
            } else if (i10 == 3) {
                M0 = org.telegram.messenger.gd.M0(2131748401, null);
            } else {
                M0 = org.telegram.messenger.gd.M0(2131748400, null);
            }
            String[] split = M0.split("%s");
            if (split.length <= 1) {
                this.f42427n = M0;
                return;
            }
            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
            this.f42423b = inputStickerSet;
            if (inputStickerSet != null && (o02 = org.telegram.messenger.ri.d0(i7).o0(this.f42423b, false)) != null && (stickerSet = o02.set) != null) {
                str = stickerSet.title;
                int i13 = 0;
                while (true) {
                    ArrayList<TLRPC.Document> arrayList3 = o02.documents;
                    if (arrayList3 == null || i13 >= arrayList3.size()) {
                        break;
                    } else if (o02.documents.get(i13).f28409id == o02.set.thumb_document_id) {
                        document = o02.documents.get(i13);
                        break;
                    } else {
                        i13++;
                    }
                }
                document = null;
                if (document == null && (arrayList2 = o02.documents) != null && arrayList2.size() > 0) {
                    document = o02.documents.get(0);
                }
            } else {
                str = null;
                document = null;
            }
            if (str != null && document != null) {
                SpannableString spannableString = new SpannableString(org.telegram.messenger.fj.U(document));
                spannableString.setSpan(new w90(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
                o5 l10 = o5.l(i7, 0, document);
                this.d = l10;
                org.telegram.ui.ActionBar.u6.x(this, l10, org.telegram.ui.ActionBar.n6.f29576n6, i6Var, PorterDuff.Mode.SRC_IN);
                this.d.a(this);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new oi.v5(this, 2), 0, spannableString2.length(), 33);
                this.f42427n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
                this.N = 1.0f;
                this.f42423b = null;
                return;
            }
            this.f42427n = split[0];
            this.f42429s = split[1];
            o80 o80Var = new o80(i6Var);
            this.f42426f = o80Var;
            o80Var.f38021l = org.telegram.ui.ActionBar.n6.G8;
            o80Var.f38022m = org.telegram.ui.ActionBar.n6.f29486i6;
            o80Var.k(4.0f);
        } else if (i10 == 4) {
            this.f42427n = org.telegram.messenger.g0.R2(org.telegram.messenger.gd.M0(2131744630, null), org.telegram.ui.ActionBar.n6.Xc, 2, null, i6Var);
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
        CharSequence charSequence2 = this.f42427n;
        if (charSequence2 != charSequence || this.G != i7) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i7, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f42428r = staticLayout;
                o80 o80Var = this.f42426f;
                if (o80Var != null && this.P == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f42432y = org.telegram.messenger.g0.L(2.0f) + ((int) this.f42428r.getPrimaryHorizontal(charSequence2.length()));
                    this.E = this.f42428r.getLineTop(lineCount);
                    this.F = r3 - this.E;
                    float min = Math.min(org.telegram.messenger.g0.L(100.0f), this.f42428r.getWidth() - this.f42432y);
                    if (this.O == null) {
                        this.O = new Rect();
                    }
                    Rect rect = this.O;
                    int i12 = this.f42432y;
                    rect.set(i12, this.E, (int) (i12 + min), r3);
                    o80Var.setBounds(this.O);
                    this.f42425e = true;
                }
            } else {
                this.f42428r = null;
                this.f42425e = false;
            }
            this.H = charSequence2;
            this.G = i7;
        }
        SpannableStringBuilder spannableStringBuilder = this.f42430w;
        if (spannableStringBuilder != this.J || this.I != i7) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f42430w;
                i10 = i7;
                this.f42431x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i10 = i7;
                this.f42431x = null;
            }
            this.J = this.f42430w;
            this.I = i10;
        }
        StaticLayout staticLayout2 = this.f42428r;
        if (staticLayout2 != null) {
            i11 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f42431x;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E8));
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.y90.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.a(this);
        }
        org.telegram.messenger.ks.f(this.f42422a).c(this, org.telegram.messenger.ks.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o5 o5Var = this.d;
        if (o5Var != null) {
            o5Var.n(this);
        }
        org.telegram.messenger.ks.f(this.f42422a).n(this, org.telegram.messenger.ks.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f42428r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f42428r.draw(canvas);
            o80 o80Var = this.f42426f;
            if (o80Var != null && this.f42425e) {
                o80Var.setAlpha((int) ((1.0f - this.N) * 255.0f));
                Rect rect2 = this.O;
                if (rect2 != null && (rect = this.P) != null) {
                    float f10 = this.N;
                    Rect rect3 = org.telegram.messenger.g0.Q;
                    org.telegram.messenger.g0.X1(rect2, rect, f10, rect3);
                    o80Var.setBounds(rect3);
                }
                o80Var.draw(canvas);
                invalidate();
            }
            if (this.f42431x != null) {
                canvas.save();
                canvas.translate(0.0f, this.E);
                textPaint.setAlpha((int) (this.N * 255.0f));
                this.f42431x.draw(canvas);
                canvas.restore();
            }
            o5 o5Var = this.d;
            if (o5Var != null) {
                o5Var.setAlpha((int) (this.N * 255.0f));
                this.d.setBounds(this.f42424c);
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
                textPaint.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.E8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

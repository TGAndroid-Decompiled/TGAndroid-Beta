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
public final class aa0 extends FrameLayout implements org.telegram.messenger.gs, org.telegram.ui.ActionBar.b6 {
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
    public final int f33466a;
    public TLRPC.InputStickerSet f33467b;
    public final Rect f33468c;
    public p5 d;
    public boolean f33469e;
    public final q80 f33470f;
    public final TextPaint h;
    public final CharSequence f33471n;
    public StaticLayout f33472r;
    public final String f33473s;
    public SpannableStringBuilder f33474w;
    public StaticLayout f33475x;
    public int f33476y;

    public aa0(int i7, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        String N0;
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet o02;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        String G;
        this.f33468c = new Rect();
        this.f33469e = false;
        this.K = -1;
        this.L = true;
        this.N = 0.0f;
        this.f33466a = i7;
        int i11 = org.telegram.ui.ActionBar.m6.f29473i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.m6.a0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), 0, 16);
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.t6.j(this, a02, null, M, h6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var));
        if (arrayList.size() > 1) {
            if (i10 == 0) {
                G = org.telegram.messenger.hd.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]);
            } else {
                G = org.telegram.messenger.hd.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]);
            }
            SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(G);
            this.f33471n = W2;
            l41[] l41VarArr = (l41[]) W2.getSpans(0, W2.length(), l41.class);
            for (int i12 = 0; l41VarArr != null && i12 < l41VarArr.length; i12++) {
                int spanStart = W2.getSpanStart(l41VarArr[i12]);
                int spanEnd = W2.getSpanEnd(l41VarArr[i12]);
                W2.removeSpan(l41VarArr[i12]);
                W2.setSpan(new oi.w5(this, 2), spanStart, spanEnd, 33);
            }
        } else if (arrayList.size() == 1) {
            if (i10 == 0) {
                N0 = org.telegram.messenger.hd.N0(2131748404, null);
            } else if (i10 == 3) {
                N0 = org.telegram.messenger.hd.N0(2131748400, null);
            } else {
                N0 = org.telegram.messenger.hd.N0(2131748399, null);
            }
            String[] split = N0.split("%s");
            if (split.length <= 1) {
                this.f33471n = N0;
                return;
            }
            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
            this.f33467b = inputStickerSet;
            if (inputStickerSet != null && (o02 = org.telegram.messenger.si.d0(i7).o0(this.f33467b, false)) != null && (stickerSet = o02.set) != null) {
                str = stickerSet.title;
                int i13 = 0;
                while (true) {
                    ArrayList<TLRPC.Document> arrayList3 = o02.documents;
                    if (arrayList3 == null || i13 >= arrayList3.size()) {
                        break;
                    } else if (o02.documents.get(i13).f28440id == o02.set.thumb_document_id) {
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
                SpannableString spannableString = new SpannableString(org.telegram.messenger.gj.U(document));
                spannableString.setSpan(new y90(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
                p5 l10 = p5.l(i7, 0, document);
                this.d = l10;
                org.telegram.ui.ActionBar.t6.x(this, l10, org.telegram.ui.ActionBar.m6.f29563n6, h6Var, PorterDuff.Mode.SRC_IN);
                this.d.a(this);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new oi.w5(this, 2), 0, spannableString2.length(), 33);
                this.f33471n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
                this.N = 1.0f;
                this.f33467b = null;
                return;
            }
            this.f33471n = split[0];
            this.f33473s = split[1];
            q80 q80Var = new q80(h6Var);
            this.f33470f = q80Var;
            q80Var.f38821l = org.telegram.ui.ActionBar.m6.G8;
            q80Var.f38822m = org.telegram.ui.ActionBar.m6.f29473i6;
            q80Var.k(4.0f);
        } else if (i10 == 4) {
            this.f33471n = org.telegram.messenger.g0.R2(org.telegram.messenger.hd.N0(2131744622, null), org.telegram.ui.ActionBar.m6.Xc, 2, null, h6Var);
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
        CharSequence charSequence2 = this.f33471n;
        if (charSequence2 != charSequence || this.G != i7) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i7, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f33472r = staticLayout;
                q80 q80Var = this.f33470f;
                if (q80Var != null && this.P == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f33476y = org.telegram.messenger.g0.L(2.0f) + ((int) this.f33472r.getPrimaryHorizontal(charSequence2.length()));
                    this.E = this.f33472r.getLineTop(lineCount);
                    this.F = r3 - this.E;
                    float min = Math.min(org.telegram.messenger.g0.L(100.0f), this.f33472r.getWidth() - this.f33476y);
                    if (this.O == null) {
                        this.O = new Rect();
                    }
                    Rect rect = this.O;
                    int i12 = this.f33476y;
                    rect.set(i12, this.E, (int) (i12 + min), r3);
                    q80Var.setBounds(this.O);
                    this.f33469e = true;
                }
            } else {
                this.f33472r = null;
                this.f33469e = false;
            }
            this.H = charSequence2;
            this.G = i7;
        }
        SpannableStringBuilder spannableStringBuilder = this.f33474w;
        if (spannableStringBuilder != this.J || this.I != i7) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f33474w;
                i10 = i7;
                this.f33475x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i10 = i7;
                this.f33475x = null;
            }
            this.J = this.f33474w;
            this.I = i10;
        }
        StaticLayout staticLayout2 = this.f33472r;
        if (staticLayout2 != null) {
            i11 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f33475x;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.E8));
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.aa0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.a(this);
        }
        org.telegram.messenger.ls.f(this.f33466a).c(this, org.telegram.messenger.ls.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5 p5Var = this.d;
        if (p5Var != null) {
            p5Var.n(this);
        }
        org.telegram.messenger.ls.f(this.f33466a).n(this, org.telegram.messenger.ls.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f33472r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f33472r.draw(canvas);
            q80 q80Var = this.f33470f;
            if (q80Var != null && this.f33469e) {
                q80Var.setAlpha((int) ((1.0f - this.N) * 255.0f));
                Rect rect2 = this.O;
                if (rect2 != null && (rect = this.P) != null) {
                    float f10 = this.N;
                    Rect rect3 = org.telegram.messenger.g0.Q;
                    org.telegram.messenger.g0.X1(rect2, rect, f10, rect3);
                    q80Var.setBounds(rect3);
                }
                q80Var.draw(canvas);
                invalidate();
            }
            if (this.f33475x != null) {
                canvas.save();
                canvas.translate(0.0f, this.E);
                textPaint.setAlpha((int) (this.N * 255.0f));
                this.f33475x.draw(canvas);
                canvas.restore();
            }
            p5 p5Var = this.d;
            if (p5Var != null) {
                p5Var.setAlpha((int) (this.N * 255.0f));
                this.d.setBounds(this.f33468c);
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
                textPaint.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

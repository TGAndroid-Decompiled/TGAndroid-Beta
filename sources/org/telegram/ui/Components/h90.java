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
public final class h90 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
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
    public final int f34344a;
    public TLRPC.InputStickerSet f34345b;
    public final Rect f34346c;
    public g5 d;
    public boolean f34347e;
    public final w70 f34348f;
    public final TextPaint h;
    public final CharSequence f34349n;
    public StaticLayout f34350r;
    public final String f34351s;
    public SpannableStringBuilder f34352w;
    public StaticLayout f34353x;
    public int f34354y;

    public h90(int i3, int i10, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        String M0;
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet m0;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        String G;
        this.f34346c = new Rect();
        this.f34347e = false;
        this.K = -1;
        this.L = true;
        this.N = 0.0f;
        this.f34344a = i3;
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), 0, 16);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.r6.k(this, a02, null, N, e6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, e6Var));
        if (arrayList.size() > 1) {
            if (i10 == 0) {
                G = org.telegram.messenger.bd.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]);
            } else {
                G = org.telegram.messenger.bd.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]);
            }
            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(G);
            this.f34349n = X2;
            o31[] o31VarArr = (o31[]) X2.getSpans(0, X2.length(), o31.class);
            for (int i12 = 0; o31VarArr != null && i12 < o31VarArr.length; i12++) {
                int spanStart = X2.getSpanStart(o31VarArr[i12]);
                int spanEnd = X2.getSpanEnd(o31VarArr[i12]);
                X2.removeSpan(o31VarArr[i12]);
                X2.setSpan(new mi.x5(this, 2), spanStart, spanEnd, 33);
            }
        } else if (arrayList.size() == 1) {
            if (i10 == 0) {
                M0 = org.telegram.messenger.bd.M0(2131748605, null);
            } else if (i10 == 3) {
                M0 = org.telegram.messenger.bd.M0(2131748601, null);
            } else {
                M0 = org.telegram.messenger.bd.M0(2131748600, null);
            }
            String[] split = M0.split("%s");
            if (split.length <= 1) {
                this.f34349n = M0;
                return;
            }
            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
            this.f34345b = inputStickerSet;
            if (inputStickerSet != null && (m0 = org.telegram.messenger.li.b0(i3).m0(this.f34345b, false)) != null && (stickerSet = m0.set) != null) {
                str = stickerSet.title;
                int i13 = 0;
                while (true) {
                    ArrayList<TLRPC.Document> arrayList3 = m0.documents;
                    if (arrayList3 == null || i13 >= arrayList3.size()) {
                        break;
                    } else if (m0.documents.get(i13).f27007id == m0.set.thumb_document_id) {
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
                SpannableString spannableString = new SpannableString(org.telegram.messenger.zi.U(document));
                spannableString.setSpan(new f90(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
                g5 l10 = g5.l(i3, 0, document);
                this.d = l10;
                org.telegram.ui.ActionBar.r6.y(this, l10, org.telegram.ui.ActionBar.k6.f28062n6, e6Var, PorterDuff.Mode.SRC_IN);
                this.d.a(this);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new mi.x5(this, 2), 0, spannableString2.length(), 33);
                this.f34349n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
                this.N = 1.0f;
                this.f34345b = null;
                return;
            }
            this.f34349n = split[0];
            this.f34351s = split[1];
            w70 w70Var = new w70(e6Var);
            this.f34348f = w70Var;
            w70Var.f39933l = org.telegram.ui.ActionBar.k6.G8;
            w70Var.f39934m = org.telegram.ui.ActionBar.k6.f27972i6;
            w70Var.k(4.0f);
        } else if (i10 == 4) {
            this.f34349n = org.telegram.messenger.g0.S2(org.telegram.messenger.bd.M0(2131744875, null), org.telegram.ui.ActionBar.k6.Uc, 2, null, e6Var);
        }
    }

    public final int a(int i3, boolean z10) {
        int i10;
        float f10;
        float f11;
        int i11 = 0;
        if (i3 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.H;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.f34349n;
        if (charSequence2 != charSequence || this.G != i3) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i3, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f34350r = staticLayout;
                w70 w70Var = this.f34348f;
                if (w70Var != null && this.P == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f34354y = org.telegram.messenger.g0.L(2.0f) + ((int) this.f34350r.getPrimaryHorizontal(charSequence2.length()));
                    this.E = this.f34350r.getLineTop(lineCount);
                    this.F = r3 - this.E;
                    float min = Math.min(org.telegram.messenger.g0.L(100.0f), this.f34350r.getWidth() - this.f34354y);
                    if (this.O == null) {
                        this.O = new Rect();
                    }
                    Rect rect = this.O;
                    int i12 = this.f34354y;
                    rect.set(i12, this.E, (int) (i12 + min), r3);
                    w70Var.setBounds(this.O);
                    this.f34347e = true;
                }
            } else {
                this.f34350r = null;
                this.f34347e = false;
            }
            this.H = charSequence2;
            this.G = i3;
        }
        SpannableStringBuilder spannableStringBuilder = this.f34352w;
        if (spannableStringBuilder != this.J || this.I != i3) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f34352w;
                i10 = i3;
                this.f34353x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i10 = i3;
                this.f34353x = null;
            }
            this.J = this.f34352w;
            this.I = i10;
        }
        StaticLayout staticLayout2 = this.f34350r;
        if (staticLayout2 != null) {
            i11 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f34353x;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h90.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.a(this);
        }
        org.telegram.messenger.hs.f(this.f34344a).c(this, org.telegram.messenger.hs.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g5 g5Var = this.d;
        if (g5Var != null) {
            g5Var.n(this);
        }
        org.telegram.messenger.hs.f(this.f34344a).n(this, org.telegram.messenger.hs.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f34350r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f34350r.draw(canvas);
            w70 w70Var = this.f34348f;
            if (w70Var != null && this.f34347e) {
                w70Var.setAlpha((int) ((1.0f - this.N) * 255.0f));
                Rect rect2 = this.O;
                if (rect2 != null && (rect = this.P) != null) {
                    float f10 = this.N;
                    Rect rect3 = org.telegram.messenger.g0.Q;
                    org.telegram.messenger.g0.X1(rect2, rect, f10, rect3);
                    w70Var.setBounds(rect3);
                }
                w70Var.draw(canvas);
                invalidate();
            }
            if (this.f34353x != null) {
                canvas.save();
                canvas.translate(0.0f, this.E);
                textPaint.setAlpha((int) (this.N * 255.0f));
                this.f34353x.draw(canvas);
                canvas.restore();
            }
            g5 g5Var = this.d;
            if (g5Var != null) {
                g5Var.setAlpha((int) (this.N * 255.0f));
                this.d.setBounds(this.f34346c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        int size = View.MeasureSpec.getSize(i3);
        if (this.L && (i11 = this.K) > 0) {
            size = Math.min(size, i11);
        }
        this.K = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), 1073741824));
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

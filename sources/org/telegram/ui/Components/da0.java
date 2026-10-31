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
public final class da0 extends FrameLayout implements org.telegram.messenger.us, org.telegram.ui.ActionBar.k6 {
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
    public final int f25373a;
    public TLRPC.InputStickerSet f25374b;
    public final Rect f25375c;
    public f5 d;
    public boolean e;
    public final t80 f25376f;
    public final TextPaint h;
    public final CharSequence f25377n;
    public StaticLayout f25378r;
    public final String f25379s;
    public SpannableStringBuilder f25380w;
    public StaticLayout f25381x;
    public int f25382y;

    public da0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        String L0;
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet m0;
        TLRPC.StickerSet stickerSet;
        ArrayList<TLRPC.Document> arrayList2;
        String G;
        this.f25375c = new Rect();
        this.e = false;
        this.J = -1;
        this.K = true;
        this.M = 0.0f;
        this.f25373a = i10;
        int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), 0, 16);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
        setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(this, a02, null, N, p6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, p6Var));
        if (arrayList.size() > 1) {
            if (i11 == 0) {
                G = org.telegram.messenger.cd.G(arrayList.size(), "MessageContainsEmojiPacks", new Object[0]);
            } else {
                G = org.telegram.messenger.cd.G(arrayList.size(), "MessageContainsReactionsPacks", new Object[0]);
            }
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(G);
            this.f25377n = W2;
            x41[] x41VarArr = (x41[]) W2.getSpans(0, W2.length(), x41.class);
            for (int i13 = 0; x41VarArr != null && i13 < x41VarArr.length; i13++) {
                int spanStart = W2.getSpanStart(x41VarArr[i13]);
                int spanEnd = W2.getSpanEnd(x41VarArr[i13]);
                W2.removeSpan(x41VarArr[i13]);
                W2.setSpan(new bi.m6(this, 2), spanStart, spanEnd, 33);
            }
        } else if (arrayList.size() == 1) {
            if (i11 == 0) {
                L0 = org.telegram.messenger.cd.L0(2131748612, null);
            } else if (i11 == 3) {
                L0 = org.telegram.messenger.cd.L0(2131748608, null);
            } else {
                L0 = org.telegram.messenger.cd.L0(2131748607, null);
            }
            String[] split = L0.split("%s");
            if (split.length <= 1) {
                this.f25377n = L0;
                return;
            }
            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
            this.f25374b = inputStickerSet;
            if (inputStickerSet != null && (m0 = org.telegram.messenger.ui.b0(i10).m0(this.f25374b, false)) != null && (stickerSet = m0.set) != null) {
                str = stickerSet.title;
                int i14 = 0;
                while (true) {
                    ArrayList<TLRPC.Document> arrayList3 = m0.documents;
                    if (arrayList3 == null || i14 >= arrayList3.size()) {
                        break;
                    } else if (m0.documents.get(i14).f19799id == m0.set.thumb_document_id) {
                        document = m0.documents.get(i14);
                        break;
                    } else {
                        i14++;
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
                SpannableString spannableString = new SpannableString(org.telegram.messenger.jj.U(document));
                spannableString.setSpan(new ba0(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
                f5 l4 = f5.l(i10, 0, document);
                this.d = l4;
                org.telegram.ui.ActionBar.a7.y(this, l4, org.telegram.ui.ActionBar.t6.f21115n6, p6Var, PorterDuff.Mode.SRC_IN);
                this.d.a(this);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new bi.m6(this, 2), 0, spannableString2.length(), 33);
                this.f25377n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
                this.M = 1.0f;
                this.f25374b = null;
                return;
            }
            this.f25377n = split[0];
            this.f25379s = split[1];
            t80 t80Var = new t80(p6Var);
            this.f25376f = t80Var;
            t80Var.f30509l = org.telegram.ui.ActionBar.t6.G8;
            t80Var.f30510m = org.telegram.ui.ActionBar.t6.f21020i6;
            t80Var.k(4.0f);
        } else if (i11 == 4) {
            this.f25377n = org.telegram.messenger.i0.R2(org.telegram.messenger.cd.L0(2131744883, null), org.telegram.ui.ActionBar.t6.Uc, 2, null, p6Var);
        }
    }

    public final int a(int i10, boolean z10) {
        int i11;
        float f7;
        float f10;
        int i12 = 0;
        if (i10 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.G;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.f25377n;
        if (charSequence2 != charSequence || this.F != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f25378r = staticLayout;
                t80 t80Var = this.f25376f;
                if (t80Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f25382y = org.telegram.messenger.i0.L(2.0f) + ((int) this.f25378r.getPrimaryHorizontal(charSequence2.length()));
                    this.D = this.f25378r.getLineTop(lineCount);
                    this.E = r3 - this.D;
                    float min = Math.min(org.telegram.messenger.i0.L(100.0f), this.f25378r.getWidth() - this.f25382y);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i13 = this.f25382y;
                    rect.set(i13, this.D, (int) (i13 + min), r3);
                    t80Var.setBounds(this.N);
                    this.e = true;
                }
            } else {
                this.f25378r = null;
                this.e = false;
            }
            this.G = charSequence2;
            this.F = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.f25380w;
        if (spannableStringBuilder != this.I || this.H != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.f25380w;
                i11 = i10;
                this.f25381x = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f25381x = null;
            }
            this.I = this.f25380w;
            this.H = i11;
        }
        StaticLayout staticLayout2 = this.f25378r;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f25381x;
        if (staticLayout3 != null) {
            float height = staticLayout3.getHeight() - this.E;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = this.M;
            }
            f7 = height * f10;
        } else {
            f7 = 0.0f;
        }
        return i12 + ((int) f7);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.E8));
    }

    @Override
    public final void didReceivedNotification(int r9, int r10, java.lang.Object... r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.da0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.a(this);
        }
        org.telegram.messenger.zs.f(this.f25373a).c(this, org.telegram.messenger.zs.B0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f5 f5Var = this.d;
        if (f5Var != null) {
            f5Var.n(this);
        }
        org.telegram.messenger.zs.f(this.f25373a).n(this, org.telegram.messenger.zs.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f25378r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f25378r.draw(canvas);
            t80 t80Var = this.f25376f;
            if (t80Var != null && this.e) {
                t80Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f7 = this.M;
                    Rect rect3 = org.telegram.messenger.i0.Q;
                    org.telegram.messenger.i0.X1(rect2, rect, f7, rect3);
                    t80Var.setBounds(rect3);
                }
                t80Var.draw(canvas);
                invalidate();
            }
            if (this.f25381x != null) {
                canvas.save();
                canvas.translate(0.0f, this.D);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.f25381x.draw(canvas);
                canvas.restore();
            }
            f5 f5Var = this.d;
            if (f5Var != null) {
                f5Var.setAlpha((int) (this.M * 255.0f));
                this.d.setBounds(this.f25375c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
        int size = View.MeasureSpec.getSize(i10);
        if (this.K && (i12 = this.J) > 0) {
            size = Math.min(size, i12);
        }
        this.J = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), 1073741824));
    }

    @Override
    public final void updateColors() {
        TextPaint textPaint = this.h;
        if (textPaint != null) {
            try {
                int alpha = textPaint.getAlpha();
                textPaint.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}

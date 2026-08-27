package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class ga0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public int B;
    public CharSequence C;
    public int D;
    public SpannableStringBuilder E;
    public int F;
    public boolean G;
    public ValueAnimator H;
    public float I;
    public Rect J;
    public Rect K;

    public final int f28569a;

    public TLRPC.InputStickerSet f28570b;

    public final Rect f28571c;
    public k5 d;

    public boolean f28572e;

    public final t80 f28573f;
    public final TextPaint h;

    public final CharSequence f28574n;

    public StaticLayout f28575r;

    public final String f28576s;
    public SpannableStringBuilder v;

    public StaticLayout f28577w;

    public int f28578x;

    public int f28579y;

    public ga0(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList, int i11) {
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        ArrayList<TLRPC.Document> arrayList2;
        super(context);
        this.f28571c = new Rect();
        this.f28572e = false;
        this.F = -1;
        this.G = true;
        this.I = 0.0f;
        this.f28569a = i10;
        setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 0, 16));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        if (arrayList.size() > 1) {
            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(i11 == 0 ? LocaleController.formatPluralString("MessageContainsEmojiPacks", arrayList.size(), new Object[0]) : LocaleController.formatPluralString("MessageContainsReactionsPacks", arrayList.size(), new Object[0]));
            this.f28574n = spannableStringBuilderReplaceTags;
            k41[] k41VarArr = (k41[]) spannableStringBuilderReplaceTags.getSpans(0, spannableStringBuilderReplaceTags.length(), k41.class);
            for (int i12 = 0; k41VarArr != null && i12 < k41VarArr.length; i12++) {
                int spanStart = spannableStringBuilderReplaceTags.getSpanStart(k41VarArr[i12]);
                int spanEnd = spannableStringBuilderReplaceTags.getSpanEnd(k41VarArr[i12]);
                spannableStringBuilderReplaceTags.removeSpan(k41VarArr[i12]);
                spannableStringBuilderReplaceTags.setSpan(new fa0(0, this), spanStart, spanEnd, 33);
            }
            return;
        }
        if (arrayList.size() != 1) {
            if (i11 == 4) {
                this.f28574n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StickersCheckStickersBotForMoreOptions), org.telegram.ui.ActionBar.g6.gc, 2, null, c6Var);
                return;
            }
            return;
        }
        String string = i11 == 0 ? LocaleController.getString(R.string.MessageContainsEmojiPack) : i11 == 3 ? LocaleController.getString(R.string.MessageContainsReactionPack) : LocaleController.getString(R.string.MessageContainsReactionsPack);
        String[] strArrSplit = string.split("%s");
        if (strArrSplit.length <= 1) {
            this.f28574n = string;
            return;
        }
        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
        this.f28570b = inputStickerSet;
        if (inputStickerSet == null || (stickerSet = MediaDataController.getInstance(i10).getStickerSet(this.f28570b, false)) == null || (stickerSet2 = stickerSet.set) == null) {
            str = null;
            document = null;
        } else {
            str = stickerSet2.title;
            int i13 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList3 = stickerSet.documents;
                if (arrayList3 == null || i13 >= arrayList3.size()) {
                    document = null;
                    break;
                } else {
                    if (stickerSet.documents.get(i13).f22386id == stickerSet.set.thumb_document_id) {
                        document = stickerSet.documents.get(i13);
                        break;
                    }
                    i13++;
                }
            }
            if (document == null && (arrayList2 = stickerSet.documents) != null && arrayList2.size() > 0) {
                document = stickerSet.documents.get(0);
            }
        }
        if (str == null || document == null) {
            this.f28574n = strArrSplit[0];
            this.f28576s = strArrSplit[1];
            t80 t80Var = new t80(c6Var);
            this.f28573f = t80Var;
            t80Var.f32700l = org.telegram.ui.ActionBar.g6.G8;
            t80Var.f32701m = org.telegram.ui.ActionBar.g6.f23144i6;
            t80Var.j(4.0f);
            return;
        }
        SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString.setSpan(new da0(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
        k5 k5VarM = k5.m(i10, 0, document);
        this.d = k5VarM;
        k5VarM.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23234n6, c6Var), PorterDuff.Mode.SRC_IN));
        this.d.a(this);
        SpannableString spannableString2 = new SpannableString(str);
        spannableString2.setSpan(new fa0(0, this), 0, spannableString2.length(), 33);
        this.f28574n = new SpannableStringBuilder().append((CharSequence) strArrSplit[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) strArrSplit[1]);
        this.I = 1.0f;
        this.f28570b = null;
    }

    public final int a(int i10, boolean z10) {
        int i11;
        float height;
        if (i10 <= 0) {
            return 0;
        }
        CharSequence charSequence = this.C;
        TextPaint textPaint = this.h;
        CharSequence charSequence2 = this.f28574n;
        if (charSequence2 != charSequence || this.B != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f28575r = staticLayout;
                t80 t80Var = this.f28573f;
                if (t80Var != null && this.K == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f28578x = AndroidUtilities.dp(2.0f) + ((int) this.f28575r.getPrimaryHorizontal(charSequence2.length()));
                    this.f28579y = this.f28575r.getLineTop(lineCount);
                    int lineBottom = this.f28575r.getLineBottom(lineCount);
                    this.A = lineBottom - this.f28579y;
                    float fMin = Math.min(AndroidUtilities.dp(100.0f), this.f28575r.getWidth() - this.f28578x);
                    if (this.J == null) {
                        this.J = new Rect();
                    }
                    Rect rect = this.J;
                    int i12 = this.f28578x;
                    rect.set(i12, this.f28579y, (int) (i12 + fMin), lineBottom);
                    t80Var.setBounds(this.J);
                    this.f28572e = true;
                }
            } else {
                this.f28575r = null;
                this.f28572e = false;
            }
            this.C = charSequence2;
            this.B = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.E || this.D != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.f28577w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f28577w = null;
            }
            this.E = this.v;
            this.D = i11;
        }
        StaticLayout staticLayout2 = this.f28575r;
        int height2 = staticLayout2 != null ? staticLayout2.getHeight() : 0;
        StaticLayout staticLayout3 = this.f28577w;
        if (staticLayout3 != null) {
            height = (staticLayout3.getHeight() - this.A) * (z10 ? 1.0f : this.I);
        } else {
            height = 0.0f;
        }
        return height2 + ((int) height);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        String str;
        TLRPC.Document document;
        ArrayList<TLRPC.Document> arrayList;
        if (i10 != NotificationCenter.groupStickersDidLoad || this.f28570b == null) {
            return;
        }
        int i12 = this.f28569a;
        int i13 = 0;
        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(i12).getStickerSet(this.f28570b, false);
        if (stickerSet == null) {
            return;
        }
        TLRPC.StickerSet stickerSet2 = stickerSet.set;
        if (stickerSet2 != null) {
            str = stickerSet2.title;
            int i14 = 0;
            while (true) {
                ArrayList<TLRPC.Document> arrayList2 = stickerSet.documents;
                if (arrayList2 == null || i14 >= arrayList2.size()) {
                    document = null;
                    break;
                } else {
                    if (stickerSet.documents.get(i14).f22386id == stickerSet.set.thumb_document_id) {
                        document = stickerSet.documents.get(i14);
                        break;
                    }
                    i14++;
                }
            }
            if (document == null && (arrayList = stickerSet.documents) != null && arrayList.size() > 0) {
                document = stickerSet.documents.get(0);
            }
        } else {
            str = null;
            document = null;
        }
        if (str == null || document == null) {
            return;
        }
        k5 k5VarM = k5.m(i12, 0, document);
        this.d = k5VarM;
        k5VarM.a(this);
        invalidate();
        SpannableString spannableString = new SpannableString(" ");
        spannableString.setSpan(new cg.r2(this, 1), 0, 1, 33);
        SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
        spannableString2.setSpan(new ea0(this, document, this.h.getFontMetricsInt()), 0, spannableString2.length(), 33);
        SpannableString spannableString3 = new SpannableString(str);
        spannableString3.setSpan(new fa0(i13, this), 0, spannableString3.length(), 33);
        this.v = new SpannableStringBuilder().append((CharSequence) spannableString).append((CharSequence) spannableString2).append(' ').append((CharSequence) spannableString3).append((CharSequence) this.f28576s);
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int iA = a((this.F - getPaddingLeft()) - getPaddingRight(), true);
        if (this.J != null && this.f28577w != null) {
            if (this.K == null) {
                this.K = new Rect();
            }
            StaticLayout staticLayout = this.f28577w;
            float primaryHorizontal = staticLayout.getPrimaryHorizontal(staticLayout.getLineEnd(0));
            Rect rect = this.K;
            Rect rect2 = this.J;
            rect.set(rect2.left, rect2.top, (int) primaryHorizontal, rect2.bottom);
        }
        this.f28570b = null;
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        boolean z10 = Math.abs(measuredHeight - iA) > AndroidUtilities.dp(3.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.I, 1.0f);
        this.H = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ig.y(8, this, z10));
        this.H.setInterpolator(er.h);
        this.H.setStartDelay(150L);
        this.H.setDuration(400L);
        this.H.start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k5 k5Var = this.d;
        if (k5Var != null) {
            k5Var.a(this);
        }
        NotificationCenter.getInstance(this.f28569a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k5 k5Var = this.d;
        if (k5Var != null) {
            k5Var.o(this);
        }
        NotificationCenter.getInstance(this.f28569a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f28575r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f28575r.draw(canvas);
            t80 t80Var = this.f28573f;
            if (t80Var != null && this.f28572e) {
                t80Var.setAlpha((int) ((1.0f - this.I) * 255.0f));
                Rect rect2 = this.J;
                if (rect2 != null && (rect = this.K) != null) {
                    float f10 = this.I;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f10, rect3);
                    t80Var.setBounds(rect3);
                }
                t80Var.draw(canvas);
                invalidate();
            }
            if (this.f28577w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f28579y);
                textPaint.setAlpha((int) (this.I * 255.0f));
                this.f28577w.draw(canvas);
                canvas.restore();
            }
            k5 k5Var = this.d;
            if (k5Var != null) {
                k5Var.setAlpha((int) (this.I * 255.0f));
                this.d.setBounds(this.f28571c);
                this.d.draw(canvas);
            }
            canvas.restore();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        int size = View.MeasureSpec.getSize(i10);
        if (this.G && (i12 = this.F) > 0) {
            size = Math.min(size, i12);
        }
        this.F = size;
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a(paddingLeft, false), 1073741824));
    }
}

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pb0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.b6 {
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
    public final int f29498a;
    public TLRPC.InputStickerSet f29499b;
    public final Rect f29500c;
    public r5 d;
    public boolean e;
    public final ca0 f29501f;
    public final TextPaint h;
    public final CharSequence f29502n;
    public StaticLayout f29503r;
    public final String f29504s;
    public SpannableStringBuilder v;
    public StaticLayout f29505w;
    public int f29506x;
    public int f29507y;

    public pb0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        String string;
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        ArrayList<TLRPC.Document> arrayList2;
        String formatPluralString;
        this.f29500c = new Rect();
        this.e = false;
        this.J = -1;
        this.K = true;
        this.M = 0.0f;
        this.f29498a = i10;
        int i12 = org.telegram.ui.ActionBar.k6.f21272i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), 0, 16);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(this, Z, null, O, g6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        if (arrayList.size() > 1) {
            if (i11 == 0) {
                formatPluralString = LocaleController.formatPluralString("MessageContainsEmojiPacks", arrayList.size(), new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("MessageContainsReactionsPacks", arrayList.size(), new Object[0]);
            }
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatPluralString);
            this.f29502n = replaceTags;
            j61[] j61VarArr = (j61[]) replaceTags.getSpans(0, replaceTags.length(), j61.class);
            for (int i13 = 0; j61VarArr != null && i13 < j61VarArr.length; i13++) {
                int spanStart = replaceTags.getSpanStart(j61VarArr[i13]);
                int spanEnd = replaceTags.getSpanEnd(j61VarArr[i13]);
                replaceTags.removeSpan(j61VarArr[i13]);
                replaceTags.setSpan(new ki.y5(this, 1), spanStart, spanEnd, 33);
            }
        } else if (arrayList.size() == 1) {
            if (i11 == 0) {
                string = LocaleController.getString(R.string.MessageContainsEmojiPack);
            } else if (i11 == 3) {
                string = LocaleController.getString(R.string.MessageContainsReactionPack);
            } else {
                string = LocaleController.getString(R.string.MessageContainsReactionsPack);
            }
            String[] split = string.split("%s");
            if (split.length <= 1) {
                this.f29502n = string;
                return;
            }
            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
            this.f29499b = inputStickerSet;
            if (inputStickerSet != null && (stickerSet = MediaDataController.getInstance(i10).getStickerSet(this.f29499b, false)) != null && (stickerSet2 = stickerSet.set) != null) {
                str = stickerSet2.title;
                int i14 = 0;
                while (true) {
                    ArrayList<TLRPC.Document> arrayList3 = stickerSet.documents;
                    if (arrayList3 == null || i14 >= arrayList3.size()) {
                        break;
                    } else if (stickerSet.documents.get(i14).f20349id == stickerSet.set.thumb_document_id) {
                        document = stickerSet.documents.get(i14);
                        break;
                    } else {
                        i14++;
                    }
                }
                document = null;
                if (document == null && (arrayList2 = stickerSet.documents) != null && arrayList2.size() > 0) {
                    document = stickerSet.documents.get(0);
                }
            } else {
                str = null;
                document = null;
            }
            if (str != null && document != null) {
                SpannableString spannableString = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(document));
                spannableString.setSpan(new mb0(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
                r5 m10 = r5.m(i10, 0, document);
                this.d = m10;
                org.telegram.ui.ActionBar.r6.z(this, m10, org.telegram.ui.ActionBar.k6.f21366n6, g6Var, PorterDuff.Mode.SRC_IN);
                this.d.a(this);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new ki.y5(this, 1), 0, spannableString2.length(), 33);
                this.f29502n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
                this.M = 1.0f;
                this.f29499b = null;
                return;
            }
            this.f29502n = split[0];
            this.f29504s = split[1];
            ca0 ca0Var = new ca0(g6Var);
            this.f29501f = ca0Var;
            ca0Var.f25286l = org.telegram.ui.ActionBar.k6.G8;
            ca0Var.f25287m = org.telegram.ui.ActionBar.k6.f21272i6;
            ca0Var.k(4.0f);
        } else if (i11 == 4) {
            this.f29502n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StickersCheckStickersBotForMoreOptions), org.telegram.ui.ActionBar.k6.f21242gc, 2, null, g6Var);
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
        CharSequence charSequence2 = this.f29502n;
        if (charSequence2 != charSequence || this.F != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f29503r = staticLayout;
                ca0 ca0Var = this.f29501f;
                if (ca0Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f29506x = AndroidUtilities.dp(2.0f) + ((int) this.f29503r.getPrimaryHorizontal(charSequence2.length()));
                    this.f29507y = this.f29503r.getLineTop(lineCount);
                    this.E = r3 - this.f29507y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.f29503r.getWidth() - this.f29506x);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i13 = this.f29506x;
                    rect.set(i13, this.f29507y, (int) (i13 + min), r3);
                    ca0Var.setBounds(this.N);
                    this.e = true;
                }
            } else {
                this.f29503r = null;
                this.e = false;
            }
            this.G = charSequence2;
            this.F = i10;
        }
        SpannableStringBuilder spannableStringBuilder = this.v;
        if (spannableStringBuilder != this.I || this.H != i10) {
            if (spannableStringBuilder != null) {
                SpannableStringBuilder spannableStringBuilder2 = this.v;
                i11 = i10;
                this.f29505w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f29505w = null;
            }
            this.I = this.v;
            this.H = i11;
        }
        StaticLayout staticLayout2 = this.f29503r;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f29505w;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.E8));
    }

    @Override
    public final void didReceivedNotification(int r8, int r9, java.lang.Object... r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pb0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r5 r5Var = this.d;
        if (r5Var != null) {
            r5Var.a(this);
        }
        NotificationCenter.getInstance(this.f29498a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r5 r5Var = this.d;
        if (r5Var != null) {
            r5Var.o(this);
        }
        NotificationCenter.getInstance(this.f29498a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f29503r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f29503r.draw(canvas);
            ca0 ca0Var = this.f29501f;
            if (ca0Var != null && this.e) {
                ca0Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f7 = this.M;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f7, rect3);
                    ca0Var.setBounds(rect3);
                }
                ca0Var.draw(canvas);
                invalidate();
            }
            if (this.f29505w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f29507y);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.f29505w.draw(canvas);
                canvas.restore();
            }
            r5 r5Var = this.d;
            if (r5Var != null) {
                r5Var.setAlpha((int) (this.M * 255.0f));
                this.d.setBounds(this.f29500c);
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}

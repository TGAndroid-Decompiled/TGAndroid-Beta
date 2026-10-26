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
public final class mb0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.ActionBar.p6 {
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
    public final int f30509a;
    public TLRPC.InputStickerSet f30510b;
    public final Rect f30511c;
    public t5 d;
    public boolean e;
    public final da0 f30512f;
    public final TextPaint h;
    public final CharSequence f30513n;
    public StaticLayout f30514r;
    public final String f30515s;
    public SpannableStringBuilder v;
    public StaticLayout f30516w;
    public int f30517x;
    public int f30518y;

    public mb0(int i10, int i11, Context context, ArrayList arrayList, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        String string;
        String str;
        TLRPC.Document document;
        TLRPC.TL_messages_stickerSet stickerSet;
        TLRPC.StickerSet stickerSet2;
        ArrayList<TLRPC.Document> arrayList2;
        String formatPluralString;
        this.f30511c = new Rect();
        this.e = false;
        this.J = -1;
        this.K = true;
        this.M = 0.0f;
        this.f30509a = i10;
        int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), 0, 16);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(this, Z, null, N, u6Var);
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, u6Var));
        if (arrayList.size() > 1) {
            if (i11 == 0) {
                formatPluralString = LocaleController.formatPluralString("MessageContainsEmojiPacks", arrayList.size(), new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("MessageContainsReactionsPacks", arrayList.size(), new Object[0]);
            }
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(formatPluralString);
            this.f30513n = replaceTags;
            q61[] q61VarArr = (q61[]) replaceTags.getSpans(0, replaceTags.length(), q61.class);
            for (int i13 = 0; q61VarArr != null && i13 < q61VarArr.length; i13++) {
                int spanStart = replaceTags.getSpanStart(q61VarArr[i13]);
                int spanEnd = replaceTags.getSpanEnd(q61VarArr[i13]);
                replaceTags.removeSpan(q61VarArr[i13]);
                replaceTags.setSpan(new li.z5(this, 1), spanStart, spanEnd, 33);
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
                this.f30513n = string;
                return;
            }
            TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(0);
            this.f30510b = inputStickerSet;
            if (inputStickerSet != null && (stickerSet = MediaDataController.getInstance(i10).getStickerSet(this.f30510b, false)) != null && (stickerSet2 = stickerSet.set) != null) {
                str = stickerSet2.title;
                int i14 = 0;
                while (true) {
                    ArrayList<TLRPC.Document> arrayList3 = stickerSet.documents;
                    if (arrayList3 == null || i14 >= arrayList3.size()) {
                        break;
                    } else if (stickerSet.documents.get(i14).f22033id == stickerSet.set.thumb_document_id) {
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
                spannableString.setSpan(new jb0(this, document, this.h.getFontMetricsInt()), 0, spannableString.length(), 33);
                t5 m10 = t5.m(i10, 0, document);
                this.d = m10;
                org.telegram.ui.ActionBar.f7.y(this, m10, org.telegram.ui.ActionBar.y6.f23540n6, u6Var, PorterDuff.Mode.SRC_IN);
                this.d.a(this);
                SpannableString spannableString2 = new SpannableString(str);
                spannableString2.setSpan(new li.z5(this, 1), 0, spannableString2.length(), 33);
                this.f30513n = new SpannableStringBuilder().append((CharSequence) split[0]).append((CharSequence) spannableString).append(' ').append((CharSequence) spannableString2).append((CharSequence) split[1]);
                this.M = 1.0f;
                this.f30510b = null;
                return;
            }
            this.f30513n = split[0];
            this.f30515s = split[1];
            da0 da0Var = new da0(u6Var);
            this.f30512f = da0Var;
            da0Var.f27469l = org.telegram.ui.ActionBar.y6.G8;
            da0Var.f27470m = org.telegram.ui.ActionBar.y6.f23448i6;
            da0Var.k(4.0f);
        } else if (i11 == 4) {
            this.f30513n = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StickersCheckStickersBotForMoreOptions), org.telegram.ui.ActionBar.y6.gc, 2, null, u6Var);
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
        CharSequence charSequence2 = this.f30513n;
        if (charSequence2 != charSequence || this.F != i10) {
            if (charSequence2 != null) {
                StaticLayout staticLayout = new StaticLayout(charSequence2, 0, charSequence2.length(), textPaint, Math.max(i10, 0), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.f30514r = staticLayout;
                da0 da0Var = this.f30512f;
                if (da0Var != null && this.O == null) {
                    int lineCount = staticLayout.getLineCount() - 1;
                    this.f30517x = AndroidUtilities.dp(2.0f) + ((int) this.f30514r.getPrimaryHorizontal(charSequence2.length()));
                    this.f30518y = this.f30514r.getLineTop(lineCount);
                    this.E = r3 - this.f30518y;
                    float min = Math.min(AndroidUtilities.dp(100.0f), this.f30514r.getWidth() - this.f30517x);
                    if (this.N == null) {
                        this.N = new Rect();
                    }
                    Rect rect = this.N;
                    int i13 = this.f30517x;
                    rect.set(i13, this.f30518y, (int) (i13 + min), r3);
                    da0Var.setBounds(this.N);
                    this.e = true;
                }
            } else {
                this.f30514r = null;
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
                this.f30516w = new StaticLayout(spannableStringBuilder2, 0, spannableStringBuilder2.length(), textPaint, i11, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                i11 = i10;
                this.f30516w = null;
            }
            this.I = this.v;
            this.H = i11;
        }
        StaticLayout staticLayout2 = this.f30514r;
        if (staticLayout2 != null) {
            i12 = staticLayout2.getHeight();
        }
        StaticLayout staticLayout3 = this.f30516w;
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E8));
    }

    @Override
    public final void didReceivedNotification(int r8, int r9, java.lang.Object... r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mb0.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t5 t5Var = this.d;
        if (t5Var != null) {
            t5Var.a(this);
        }
        NotificationCenter.getInstance(this.f30509a).addObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t5 t5Var = this.d;
        if (t5Var != null) {
            t5Var.o(this);
        }
        NotificationCenter.getInstance(this.f30509a).removeObserver(this, NotificationCenter.groupStickersDidLoad);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Rect rect;
        super.onDraw(canvas);
        if (this.f30514r != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            TextPaint textPaint = this.h;
            textPaint.setAlpha(255);
            this.f30514r.draw(canvas);
            da0 da0Var = this.f30512f;
            if (da0Var != null && this.e) {
                da0Var.setAlpha((int) ((1.0f - this.M) * 255.0f));
                Rect rect2 = this.N;
                if (rect2 != null && (rect = this.O) != null) {
                    float f7 = this.M;
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    AndroidUtilities.lerp(rect2, rect, f7, rect3);
                    da0Var.setBounds(rect3);
                }
                da0Var.draw(canvas);
                invalidate();
            }
            if (this.f30516w != null) {
                canvas.save();
                canvas.translate(0.0f, this.f30518y);
                textPaint.setAlpha((int) (this.M * 255.0f));
                this.f30516w.draw(canvas);
                canvas.restore();
            }
            t5 t5Var = this.d;
            if (t5Var != null) {
                t5Var.setAlpha((int) (this.M * 255.0f));
                this.d.setBounds(this.f30511c);
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
                textPaint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E8, false));
                textPaint.setAlpha(alpha);
                invalidate();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }
}

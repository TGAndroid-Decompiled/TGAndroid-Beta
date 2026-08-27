package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;

public final class aa1 implements nh0 {
    public final rn A;
    public final LinearGradient B;
    public final float C;
    public final AnimationNotificationsLocker D;
    public final MessageObject.TextLayoutBlock E;
    public final NinePatchDrawable F;
    public final ck G;
    public final org.telegram.ui.Components.p5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.c6 N;
    public final PointF O;
    public final RectF P;
    public final RectF Q;
    public float[] R;
    public final float S;

    public float f36477a;

    public final Paint f36478b;

    public final boolean f36479c;
    public final ValueAnimator d;

    public final float f36480e;

    public final float f36481f;

    public final float f36482g;
    public final int h;

    public final int f36483i;

    public final float f36484j;

    public final MessageObject f36485k;

    public final float f36486l;

    public final float f36487m;

    public final boolean f36488n;

    public final boolean f36489o;

    public final StaticLayout f36490p;

    public final StaticLayout f36491q;

    public final org.telegram.ui.Cells.s1 f36492r;

    public final org.telegram.ui.Components.zk0 f36493s;

    public final org.telegram.ui.Components.fi f36494t;

    public final Matrix f36495u;
    public final Paint v;

    public final int f36496w;

    public final float f36497x;

    public final float f36498y;

    public final float f36499z;

    public aa1(org.telegram.ui.Cells.s1 s1Var, rn rnVar, org.telegram.ui.Components.zk0 zk0Var, org.telegram.ui.Components.fi fiVar, org.telegram.ui.ActionBar.c6 c6Var) {
        float f10;
        boolean z10;
        int[] iArr;
        CharSequence charSequenceTrim;
        int lineTop;
        int lineCount;
        int width;
        int i10;
        float f11;
        float fDp;
        StaticLayout staticLayout;
        double dF;
        int i11;
        float f12;
        int i12;
        int i13;
        boolean z11;
        StaticLayout staticLayout2;
        org.telegram.ui.ActionBar.d5 d5VarX2;
        SpannableString spannableString;
        SpannableString spannableString2;
        int i14;
        StaticLayout staticLayout3;
        int i15;
        StaticLayout staticLayout4;
        float lineLeft;
        Paint paint = new Paint(1);
        this.f36478b = paint;
        this.D = new AnimationNotificationsLocker();
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = c6Var;
        if (s1Var.getMessageObject().textLayoutBlocks == null || s1Var.getMessageObject().textLayoutBlocks.size() > 1 || s1Var.getMessageObject().textLayoutBlocks.isEmpty() || s1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getLineCount() > 10) {
            return;
        }
        this.f36492r = s1Var;
        this.f36493s = zk0Var;
        this.f36494t = fiVar;
        this.A = rnVar;
        ck ckVar = rnVar.U;
        this.G = ckVar;
        if (ckVar == null || ckVar.getEditField() == null || ckVar.getEditField().getLayout() == null) {
            return;
        }
        ckVar.getRecordCircle();
        paint.setFilterBitmap(true);
        this.f36485k = s1Var.getMessageObject();
        if (!s1Var.getTransitionParams().f25182v0) {
            s1Var.draw(new Canvas());
        }
        s1Var.setEnterTransitionInProgress(true);
        Editable editText = ckVar.getEditText();
        CharSequence charSequenceReplaceEmoji = s1Var.getMessageObject().messageText;
        this.f36488n = false;
        ckVar.getEditField().getLayout().getHeight();
        TextPaint textPaint = org.telegram.ui.ActionBar.g6.f23247o2;
        AndroidUtilities.dp(20.0f);
        if (s1Var.getMessageObject().getEmojiOnlyCount() != 0) {
            boolean z12 = s1Var.getMessageObject().emojiOnlyCount == s1Var.getMessageObject().animatedEmojiCount;
            switch (Math.max(s1Var.getMessageObject().emojiOnlyCount, s1Var.getMessageObject().animatedEmojiCount)) {
                case 0:
                case 1:
                case 2:
                    textPaint = z12 ? org.telegram.ui.ActionBar.g6.f23419y2[0] : org.telegram.ui.ActionBar.g6.f23419y2[2];
                    break;
                case 3:
                    textPaint = z12 ? org.telegram.ui.ActionBar.g6.f23419y2[1] : org.telegram.ui.ActionBar.g6.f23419y2[3];
                    break;
                case 4:
                    textPaint = z12 ? org.telegram.ui.ActionBar.g6.f23419y2[2] : org.telegram.ui.ActionBar.g6.f23419y2[4];
                    break;
                case 5:
                    textPaint = z12 ? org.telegram.ui.ActionBar.g6.f23419y2[3] : org.telegram.ui.ActionBar.g6.f23419y2[5];
                    break;
                case 6:
                    textPaint = z12 ? org.telegram.ui.ActionBar.g6.f23419y2[4] : org.telegram.ui.ActionBar.g6.f23419y2[5];
                    break;
                default:
                    textPaint = org.telegram.ui.ActionBar.g6.f23419y2[5];
                    break;
            }
            if (textPaint != null) {
                textPaint.getTextSize();
                AndroidUtilities.dp(4.0f);
            }
        }
        if (charSequenceReplaceEmoji instanceof Spannable) {
            f10 = 4.0f;
            Object[] spans = ((Spannable) charSequenceReplaceEmoji).getSpans(0, charSequenceReplaceEmoji.length(), Object.class);
            if (spans != null && spans.length > 0) {
                z10 = true;
            }
            if (editText.length() == charSequenceReplaceEmoji.length() || z10) {
                this.f36488n = true;
                iArr = new int[1];
                charSequenceTrim = AndroidUtilities.trim(editText, iArr);
                if (iArr[0] > 0) {
                    lineTop = ckVar.getEditField().getLayout().getLineTop(ckVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                    ckVar.getEditField().getLayout().getLineBottom(ckVar.getEditField().getLayout().getLineForOffset(charSequenceTrim.length() + iArr[0]));
                } else {
                    lineTop = 0;
                }
                org.telegram.ui.Components.t5.cloneSpans(charSequenceReplaceEmoji);
                charSequenceReplaceEmoji = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
            } else {
                lineTop = 0;
            }
            float textSize = ckVar.getEditField().getTextSize() / textPaint.getTextSize();
            this.C = textSize;
            lineCount = ckVar.getEditField().getLayout().getLineCount();
            width = (int) (ckVar.getEditField().getLayout().getWidth() / textSize);
            if (Build.VERSION.SDK_INT >= 24) {
                this.f36490p = StaticLayout.Builder.obtain(charSequenceReplaceEmoji, 0, charSequenceReplaceEmoji.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
            } else {
                this.f36490p = new StaticLayout(charSequenceReplaceEmoji, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.H = org.telegram.ui.Components.t5.update(2, (View) null, this.H, this.f36490p);
            qg.j.b(ckVar.getEditField(), rnVar.T0, pointF);
            float f13 = pointF.y;
            this.f36498y = pointF.x;
            this.f36499z = ((AndroidUtilities.dp(10.0f) + f13) - ckVar.getEditField().getScrollY()) + lineTop;
            this.f36486l = 0.0f;
            f11 = Float.MAX_VALUE;
            float f14 = Float.MAX_VALUE;
            for (i10 = 0; i10 < this.f36490p.getLineCount(); i10++) {
                lineLeft = this.f36490p.getLineLeft(i10);
                if (lineLeft < f11) {
                    f11 = lineLeft;
                }
            }
            if (f11 != Float.MAX_VALUE) {
                this.f36486l = f11;
            }
            this.f36490p.getHeight();
            fDp = AndroidUtilities.dp(f10) + f13;
            this.f36484j = fDp;
            if (this.G.z0()) {
                this.f36484j = fDp - AndroidUtilities.dp(12.0f);
            }
            this.f36497x = f13 + ckVar.getEditField().getMeasuredHeight();
            MessageObject.TextLayoutBlock textLayoutBlock = s1Var.getMessageObject().textLayoutBlocks.get(0);
            this.E = textLayoutBlock;
            staticLayout = textLayoutBlock.textLayout;
            int i16 = org.telegram.ui.ActionBar.g6.fc;
            dF = i0.b.f(org.telegram.ui.ActionBar.g6.v0(i16, this.N));
            i11 = org.telegram.ui.ActionBar.g6.Ud;
            if (Math.abs(dF - i0.b.f(org.telegram.ui.ActionBar.g6.v0(i11, this.N))) > 0.20000000298023224d) {
                this.f36488n = true;
                this.f36489o = true;
            }
            this.L = org.telegram.ui.ActionBar.g6.v0(i11, this.N);
            this.M = org.telegram.ui.ActionBar.g6.v0(i16, this.N);
            if (staticLayout.getLineCount() == this.f36490p.getLineCount()) {
                lineCount = staticLayout.getLineCount();
                i15 = 0;
                i12 = 0;
                i13 = 0;
                while (true) {
                    if (i15 < lineCount) {
                        staticLayout4 = this.f36490p;
                        f12 = 0.0f;
                        if (staticLayout4.getLineRight(i15) == staticLayout4.getWidth() || staticLayout4.getLineLeft(i15) == 0.0f) {
                            i12++;
                        } else {
                            i13++;
                        }
                        if (staticLayout.getLineEnd(i15) != this.f36490p.getLineEnd(i15)) {
                            this.f36488n = true;
                        } else {
                            i15++;
                        }
                    } else {
                        f12 = 0.0f;
                    }
                }
            } else {
                f12 = 0.0f;
                this.f36488n = true;
                i12 = 0;
                i13 = 0;
            }
            if (!this.f36488n && i13 > 0 && i12 > 0) {
                spannableString = new SpannableString(charSequenceReplaceEmoji);
                spannableString2 = new SpannableString(charSequenceReplaceEmoji);
                for (i14 = 0; i14 < lineCount; i14++) {
                    staticLayout3 = this.f36490p;
                    if (staticLayout3.getLineRight(i14) == staticLayout3.getWidth() || staticLayout3.getLineLeft(i14) == f12) {
                        spannableString2.setSpan(new org.telegram.ui.Components.zy(false), this.f36490p.getLineStart(i14), this.f36490p.getLineEnd(i14), 0);
                    } else {
                        spannableString.setSpan(new org.telegram.ui.Components.zy(false), this.f36490p.getLineStart(i14), this.f36490p.getLineEnd(i14), 0);
                        float lineLeft2 = this.f36490p.getLineLeft(i14);
                        if (lineLeft2 < f14) {
                            f14 = lineLeft2;
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    this.f36490p = hyphenationFrequency.setAlignment(alignment).build();
                    this.f36491q = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                } else {
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    TextPaint textPaint2 = textPaint;
                    this.f36490p = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    this.f36491q = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                }
            }
            this.f36487m = this.f36490p.getWidth() - s1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
            if (s1Var.getMessageObject().getReplyMsgId() != 0 || s1Var.f25606y9 == null) {
                z11 = false;
            } else {
                z11 = true;
            }
            this.f36479c = z11;
            if (z11) {
                org.telegram.ui.ActionBar.h5 h5Var = ((org.telegram.ui.Components.eo[]) rnVar.W.f594b)[0].f28103c;
                qg.j.b(h5Var, rnVar.T0, this.O);
                PointF pointF2 = this.O;
                this.f36480e = pointF2.x;
                this.f36482g = pointF2.y;
                this.f36481f = ((View) h5Var.getParent()).getWidth();
                org.telegram.ui.ActionBar.h5 h5Var2 = ((org.telegram.ui.Components.eo[]) rnVar.W.f594b)[0].d;
                qg.j.b(h5Var2, rnVar.T0, this.O);
                float f15 = this.O.y;
                this.h = h5Var.getTextColor();
                this.f36483i = h5Var2.getTextColor();
                this.f36484j -= AndroidUtilities.dp(46.0f);
            }
            this.S = zk0Var.getPaddingBottom() - (rnVar.f42163oc - AndroidUtilities.dp(44.0f));
            this.f36495u = new Matrix();
            Paint paint2 = new Paint(1);
            this.v = paint2;
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            this.B = linearGradient;
            paint2.setShader(linearGradient);
            this.f36496w = s1Var.getMessageObject().stableId;
            ckVar.getEditField().setAlpha(0.0f);
            ckVar.setTextTransitionIsRunning(true);
            staticLayout2 = s1Var.f25606y9;
            if (staticLayout2 != null && staticLayout2.getText().length() > 1 && s1Var.f25606y9.getPrimaryHorizontal(0) != 0.0f) {
                this.K = s1Var.f25606y9.getWidth() - s1Var.f25606y9.getLineWidth(0);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.d = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new aw0(this, ckVar, fiVar, 1));
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.setDuration(250L);
            ((ArrayList) fiVar.f28391c).add(this);
            fiVar.a();
            ((ViewGroup) fiVar.d).invalidate();
            this.D.lock();
            valueAnimatorOfFloat.addListener(new org.telegram.ui.Components.g20(this, fiVar, s1Var, ckVar, rnVar));
            if (SharedConfig.getDevicePerformanceClass() == 2 || (d5VarX2 = s1Var.x2(true)) == null) {
            }
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sd, this.N);
            Rect rect = d5VarX2.f22855o;
            if (d5VarX2.D == null) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(d5VarX2.b(50.0f), d5VarX2.b(40.0f), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                rect.set(d5VarX2.getBounds());
                Paint paint3 = new Paint(1);
                paint3.setColor(-1);
                d5VarX2.setBounds(0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                d5VarX2.c(canvas, paint3);
                d5VarX2.D = new NinePatchDrawable(bitmapCreateBitmap, h7.l6.c((bitmapCreateBitmap.getWidth() / 2) - 1, (bitmapCreateBitmap.getWidth() / 2) + 1, (bitmapCreateBitmap.getHeight() / 2) - 1, (bitmapCreateBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
                d5VarX2.setBounds(rect);
            }
            if (d5VarX2.E != iV0) {
                d5VarX2.E = iV0;
                d5VarX2.D.setColorFilter(new PorterDuffColorFilter(iV0, PorterDuff.Mode.MULTIPLY));
            }
            this.F = d5VarX2.D;
            return;
        }
        f10 = 4.0f;
        z10 = false;
        if (editText.length() == charSequenceReplaceEmoji.length()) {
            this.f36488n = true;
            iArr = new int[1];
            charSequenceTrim = AndroidUtilities.trim(editText, iArr);
            if (iArr[0] > 0) {
                lineTop = ckVar.getEditField().getLayout().getLineTop(ckVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                ckVar.getEditField().getLayout().getLineBottom(ckVar.getEditField().getLayout().getLineForOffset(charSequenceTrim.length() + iArr[0]));
            } else {
                lineTop = 0;
            }
            org.telegram.ui.Components.t5.cloneSpans(charSequenceReplaceEmoji);
            charSequenceReplaceEmoji = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
        } else {
            this.f36488n = true;
            iArr = new int[1];
            charSequenceTrim = AndroidUtilities.trim(editText, iArr);
            if (iArr[0] > 0) {
                lineTop = ckVar.getEditField().getLayout().getLineTop(ckVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                ckVar.getEditField().getLayout().getLineBottom(ckVar.getEditField().getLayout().getLineForOffset(charSequenceTrim.length() + iArr[0]));
            } else {
                lineTop = 0;
            }
            org.telegram.ui.Components.t5.cloneSpans(charSequenceReplaceEmoji);
            charSequenceReplaceEmoji = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
        }
        float textSize2 = ckVar.getEditField().getTextSize() / textPaint.getTextSize();
        this.C = textSize2;
        lineCount = ckVar.getEditField().getLayout().getLineCount();
        width = (int) (ckVar.getEditField().getLayout().getWidth() / textSize2);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f36490p = StaticLayout.Builder.obtain(charSequenceReplaceEmoji, 0, charSequenceReplaceEmoji.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
        } else {
            this.f36490p = new StaticLayout(charSequenceReplaceEmoji, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        this.H = org.telegram.ui.Components.t5.update(2, (View) null, this.H, this.f36490p);
        qg.j.b(ckVar.getEditField(), rnVar.T0, pointF);
        float f16 = pointF.y;
        this.f36498y = pointF.x;
        this.f36499z = ((AndroidUtilities.dp(10.0f) + f16) - ckVar.getEditField().getScrollY()) + lineTop;
        this.f36486l = 0.0f;
        f11 = Float.MAX_VALUE;
        float f17 = Float.MAX_VALUE;
        while (i10 < this.f36490p.getLineCount()) {
            lineLeft = this.f36490p.getLineLeft(i10);
            if (lineLeft < f11) {
                f11 = lineLeft;
            }
        }
        if (f11 != Float.MAX_VALUE) {
            this.f36486l = f11;
        }
        this.f36490p.getHeight();
        fDp = AndroidUtilities.dp(f10) + f16;
        this.f36484j = fDp;
        if (this.G.z0()) {
            this.f36484j = fDp - AndroidUtilities.dp(12.0f);
        }
        this.f36497x = f16 + ckVar.getEditField().getMeasuredHeight();
        MessageObject.TextLayoutBlock textLayoutBlock2 = s1Var.getMessageObject().textLayoutBlocks.get(0);
        this.E = textLayoutBlock2;
        staticLayout = textLayoutBlock2.textLayout;
        int i17 = org.telegram.ui.ActionBar.g6.fc;
        dF = i0.b.f(org.telegram.ui.ActionBar.g6.v0(i17, this.N));
        i11 = org.telegram.ui.ActionBar.g6.Ud;
        if (Math.abs(dF - i0.b.f(org.telegram.ui.ActionBar.g6.v0(i11, this.N))) > 0.20000000298023224d) {
            this.f36488n = true;
            this.f36489o = true;
        }
        this.L = org.telegram.ui.ActionBar.g6.v0(i11, this.N);
        this.M = org.telegram.ui.ActionBar.g6.v0(i17, this.N);
        if (staticLayout.getLineCount() == this.f36490p.getLineCount()) {
            lineCount = staticLayout.getLineCount();
            i15 = 0;
            i12 = 0;
            i13 = 0;
            while (true) {
                if (i15 < lineCount) {
                    staticLayout4 = this.f36490p;
                    f12 = 0.0f;
                    if (staticLayout4.getLineRight(i15) == staticLayout4.getWidth()) {
                        i12++;
                    } else {
                        i12++;
                    }
                    if (staticLayout.getLineEnd(i15) != this.f36490p.getLineEnd(i15)) {
                        this.f36488n = true;
                    } else {
                        i15++;
                    }
                } else {
                    f12 = 0.0f;
                }
            }
        } else {
            f12 = 0.0f;
            this.f36488n = true;
            i12 = 0;
            i13 = 0;
        }
        if (!this.f36488n) {
            spannableString = new SpannableString(charSequenceReplaceEmoji);
            spannableString2 = new SpannableString(charSequenceReplaceEmoji);
            while (i14 < lineCount) {
                staticLayout3 = this.f36490p;
                if (staticLayout3.getLineRight(i14) == staticLayout3.getWidth()) {
                    spannableString2.setSpan(new org.telegram.ui.Components.zy(false), this.f36490p.getLineStart(i14), this.f36490p.getLineEnd(i14), 0);
                } else {
                    spannableString2.setSpan(new org.telegram.ui.Components.zy(false), this.f36490p.getLineStart(i14), this.f36490p.getLineEnd(i14), 0);
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                this.f36490p = hyphenationFrequency2.setAlignment(alignment3).build();
                this.f36491q = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment3).build();
            } else {
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                TextPaint textPaint3 = textPaint;
                this.f36490p = new StaticLayout(spannableString, textPaint3, width, alignment4, 1.0f, 0.0f, false);
                this.f36491q = new StaticLayout(spannableString2, textPaint3, width, alignment4, 1.0f, 0.0f, false);
            }
        }
        this.f36487m = this.f36490p.getWidth() - s1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
        if (s1Var.getMessageObject().getReplyMsgId() != 0) {
            z11 = false;
        } else {
            z11 = false;
        }
        this.f36479c = z11;
        if (z11) {
            org.telegram.ui.ActionBar.h5 h5Var3 = ((org.telegram.ui.Components.eo[]) rnVar.W.f594b)[0].f28103c;
            qg.j.b(h5Var3, rnVar.T0, this.O);
            PointF pointF3 = this.O;
            this.f36480e = pointF3.x;
            this.f36482g = pointF3.y;
            this.f36481f = ((View) h5Var3.getParent()).getWidth();
            org.telegram.ui.ActionBar.h5 h5Var4 = ((org.telegram.ui.Components.eo[]) rnVar.W.f594b)[0].d;
            qg.j.b(h5Var4, rnVar.T0, this.O);
            float f18 = this.O.y;
            this.h = h5Var3.getTextColor();
            this.f36483i = h5Var4.getTextColor();
            this.f36484j -= AndroidUtilities.dp(46.0f);
        }
        this.S = zk0Var.getPaddingBottom() - (rnVar.f42163oc - AndroidUtilities.dp(44.0f));
        this.f36495u = new Matrix();
        Paint paint4 = new Paint(1);
        this.v = paint4;
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.B = linearGradient2;
        paint4.setShader(linearGradient2);
        this.f36496w = s1Var.getMessageObject().stableId;
        ckVar.getEditField().setAlpha(0.0f);
        ckVar.setTextTransitionIsRunning(true);
        staticLayout2 = s1Var.f25606y9;
        if (staticLayout2 != null) {
            this.K = s1Var.f25606y9.getWidth() - s1Var.f25606y9.getLineWidth(0);
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new aw0(this, ckVar, fiVar, 1));
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.setDuration(250L);
        ((ArrayList) fiVar.f28391c).add(this);
        fiVar.a();
        ((ViewGroup) fiVar.d).invalidate();
        this.D.lock();
        valueAnimatorOfFloat2.addListener(new org.telegram.ui.Components.g20(this, fiVar, s1Var, ckVar, rnVar));
        if (SharedConfig.getDevicePerformanceClass() == 2) {
        }
    }

    @Override
    public final void a(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        float f13;
        Canvas canvas2;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10;
        float f18;
        float f19;
        float f20;
        float f21;
        rn rnVar;
        boolean z10;
        int i11;
        float f22;
        float f23;
        float f24;
        org.telegram.ui.Cells.s1 s1Var;
        boolean z11;
        float f25;
        float f26;
        float f27;
        float f28;
        MessageObject.TextLayoutBlock textLayoutBlock;
        org.telegram.ui.Cells.r1 r1Var;
        float f29;
        Canvas canvas3;
        float f30;
        float f31;
        int i12;
        float f32;
        float f33;
        boolean z12;
        int iV0;
        int i13;
        MessageObject messageObject;
        org.telegram.ui.Components.gl0 gl0Var;
        int iV1;
        MessageObject messageObject2;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject3;
        float fDp;
        float fLerp;
        float fLerp2;
        RectF rectF;
        float f34;
        float f35;
        int iDp;
        int iDp2;
        float f36;
        float f37;
        float fDp2;
        float f38;
        RectF rectF2;
        float fLerp3;
        float fDp3;
        int size;
        int i14;
        eh.k kVar;
        boolean z13;
        int i15;
        int i16;
        CheckBoxBase checkBoxBase;
        float f39;
        int i17;
        StaticLayout staticLayout;
        int iV2;
        int iV3;
        float f40;
        MessageObject messageObject4;
        int iV4;
        float f41;
        MessageObject messageObject5;
        org.telegram.ui.Components.zk0 zk0Var = this.f36493s;
        float y10 = zk0Var.getY();
        org.telegram.ui.Components.fi fiVar = this.f36494t;
        float y11 = (y10 - fiVar.getY()) + zk0Var.getMeasuredHeight();
        float x8 = this.f36498y - fiVar.getX();
        float y12 = this.f36499z - fiVar.getY();
        org.telegram.ui.Cells.s1 s1Var2 = this.f36492r;
        int textX = s1Var2.getTextX();
        org.telegram.ui.Cells.r1 r1Var2 = s1Var2.Vc;
        ImageReceiver imageReceiver = s1Var2.B9;
        ArrayList arrayList = s1Var2.Hd;
        this.I = textX;
        this.J = s1Var2.getTextY();
        if (s1Var2.getMessageObject().stableId != this.f36496w) {
            return;
        }
        float x10 = (zk0Var.getX() + s1Var2.getX()) - fiVar.getX();
        float top = ((zk0Var.getTop() + (s1Var2.getPaddingTop() + s1Var2.getTop())) - fiVar.getY()) - (this.S - zk0Var.getPaddingBottom());
        float interpolation = sh.m.V.getInterpolation(this.f36477a);
        float f42 = this.f36477a;
        float f43 = f42 > 0.4f ? 1.0f : f42 / 0.4f;
        float interpolation2 = org.telegram.ui.Components.er.f28123g.getInterpolation(org.telegram.ui.Components.er.h.getInterpolation(f42));
        float f44 = this.I + x10;
        float f45 = this.J + top;
        float f46 = 1.0f - interpolation2;
        int measuredHeight = (int) ((y11 * interpolation2) + (fiVar.getMeasuredHeight() * f46));
        boolean z14 = s1Var2.getBottom() - AndroidUtilities.dp(4.0f) > zk0Var.getMeasuredHeight() && (((float) s1Var2.getMeasuredHeight()) + top) - ((float) AndroidUtilities.dp(8.0f)) > ((float) measuredHeight) && fiVar.getMeasuredHeight() > 0;
        if (z14) {
            f11 = f46;
            f12 = f43;
            f10 = top;
            f13 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, Math.max(0.0f, top), fiVar.getMeasuredWidth(), fiVar.getMeasuredHeight(), 255, 31);
        } else {
            f10 = top;
            f11 = f46;
            f12 = f43;
            f13 = 0.0f;
            canvas2 = canvas;
        }
        canvas2.save();
        float y13 = zk0Var.getY();
        rn rnVar2 = this.A;
        canvas2.clipRect(f13, ((rnVar2.f42160o9 + y13) - fiVar.getY()) - AndroidUtilities.dp(3.0f), fiVar.getMeasuredWidth(), fiVar.getMeasuredHeight());
        canvas2.save();
        float backgroundDrawableLeft = s1Var2.getBackgroundDrawableLeft() + x10;
        float f47 = this.f36486l;
        float f48 = backgroundDrawableLeft + ((x8 - (f44 - f47)) * f11);
        float f49 = f10;
        float backgroundDrawableTop = s1Var2.getBackgroundDrawableTop() + f49;
        float y14 = this.f36484j - fiVar.getY();
        float f50 = 1.0f - interpolation;
        float f51 = (backgroundDrawableTop * interpolation) + (y14 * f50);
        float y15 = ((this.f36497x - fiVar.getY()) * f50) + ((backgroundDrawableTop + (s1Var2.getBackgroundDrawableBottom() - s1Var2.getBackgroundDrawableTop())) * interpolation);
        int iDp3 = (int) ((AndroidUtilities.dp(4.0f) * f11) + s1Var2.getBackgroundDrawableRight() + x10);
        MessageObject messageObject6 = this.f36485k;
        org.telegram.ui.ActionBar.d5 d5VarX2 = !messageObject6.isAnimatedEmojiStickers() ? s1Var2.x2(true) : null;
        if (d5VarX2 != null) {
            s1Var2.setBackgroundTopY(fiVar.getTop() - zk0Var.getTop());
            Drawable drawableJ = d5VarX2.j();
            f15 = f12;
            if (f15 != 1.0f) {
                f14 = interpolation;
                NinePatchDrawable ninePatchDrawable = this.F;
                if (ninePatchDrawable != null) {
                    rnVar2 = rnVar2;
                    ninePatchDrawable.setBounds((int) f48, (int) f51, iDp3, (int) y15);
                    ninePatchDrawable.draw(canvas2);
                }
                f16 = interpolation2;
                if (drawableJ != null) {
                    drawableJ.setAlpha((int) (f16 * 255.0f));
                    drawableJ.setBounds((int) f48, (int) f51, iDp3, (int) y15);
                    drawableJ.draw(canvas2);
                    drawableJ.setAlpha(255);
                }
                d5VarX2.setAlpha((int) (f15 * 255.0f));
                d5VarX2.setBounds((int) f48, (int) f51, iDp3, (int) y15);
                d5VarX2.G = true;
                d5VarX2.draw(canvas2);
                d5VarX2.G = false;
                d5VarX2.setAlpha(255);
            } else {
                f14 = interpolation;
            }
            f16 = interpolation2;
            if (drawableJ != null) {
                drawableJ.setAlpha((int) (f16 * 255.0f));
                drawableJ.setBounds((int) f48, (int) f51, iDp3, (int) y15);
                drawableJ.draw(canvas2);
                drawableJ.setAlpha(255);
            }
            d5VarX2.setAlpha((int) (f15 * 255.0f));
            d5VarX2.setBounds((int) f48, (int) f51, iDp3, (int) y15);
            d5VarX2.G = true;
            d5VarX2.draw(canvas2);
            d5VarX2.G = false;
            d5VarX2.setAlpha(255);
        } else {
            rnVar2 = rnVar2;
            f14 = interpolation;
            f15 = f12;
            f16 = interpolation2;
            messageObject6 = messageObject6;
        }
        canvas2.restore();
        canvas2.save();
        if (d5VarX2 != null) {
            if (messageObject6.isOutOwner()) {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + f48, AndroidUtilities.dp(4.0f) + f51, iDp3 - AndroidUtilities.dp(10.0f), y15 - AndroidUtilities.dp(4.0f));
            } else {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + f48, AndroidUtilities.dp(4.0f) + f51, iDp3 - AndroidUtilities.dp(4.0f), y15 - AndroidUtilities.dp(4.0f));
            }
        }
        float x11 = (zk0Var.getX() + s1Var2.getLeft()) - fiVar.getX();
        float fZ = com.google.android.recaptcha.internal.a.z(y12, f45, f50, f49);
        canvas2.translate(x11, fZ);
        s1Var2.l2(f15, canvas2, false);
        s1Var2.V1(canvas2, f15);
        s1Var2.L1(canvas2, f15);
        s1Var2.H1(f15, canvas2, false);
        s1Var2.c2(canvas2, f15, null);
        s1Var2.M1(canvas2, f15);
        s1Var2.S1(canvas2, f15);
        canvas2.restore();
        if (this.f36479c) {
            rn rnVar3 = rnVar2;
            ((org.telegram.ui.Components.eo[]) rnVar3.W.f594b)[0].f28103c.setAlpha(0.0f);
            ((org.telegram.ui.Components.eo[]) rnVar3.W.f594b)[0].d.setAlpha(0.0f);
            AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), s1Var2.E9, f16);
            int iDp4 = AndroidUtilities.dp(10.0f);
            float x12 = this.f36480e - fiVar.getX();
            float y16 = this.f36482g - fiVar.getY();
            float f52 = r3 + s1Var2.C9;
            float f53 = f15;
            float f54 = s1Var2.D9 + f49;
            if (s1Var2.X9 == null) {
                s1Var2.X9 = new org.telegram.ui.Components.gl0(s1Var2);
            }
            s1Var2.X9.a(s1Var2.getMessageObject(), s1Var2.getCurrentUser(), s1Var2.getCurrentChat(), this.N, 0);
            boolean zShouldDrawWithoutBackground = messageObject6.shouldDrawWithoutBackground();
            org.telegram.ui.ActionBar.c6 c6Var = this.N;
            if (zShouldDrawWithoutBackground) {
                iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xc, c6Var);
                b(org.telegram.ui.ActionBar.g6.Vc);
            } else {
                org.telegram.ui.Components.gl0 gl0Var2 = s1Var2.X9;
                if (gl0Var2 != null) {
                    i13 = gl0Var2.I.f26922c;
                } else if (messageObject6.isOutOwner()) {
                    iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23040cb, c6Var);
                    b(org.telegram.ui.ActionBar.g6.f23003ab);
                } else {
                    iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Wc, c6Var);
                    b(org.telegram.ui.ActionBar.g6.Uc);
                }
                if (!messageObject6.shouldDrawWithoutBackground()) {
                    i10 = iDp3;
                    f18 = f51;
                    f19 = y12;
                    messageObject = messageObject6;
                    f20 = f50;
                    gl0Var = s1Var2.X9;
                    if (gl0Var != null) {
                        iV1 = gl0Var.I.f26922c;
                    } else if (messageObject.hasValidReplyMessageObject()) {
                        messageObject2 = messageObject.replyMessageObject;
                        if (messageObject2.type == 0 && TextUtils.isEmpty(messageObject2.caption)) {
                            iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23076eb, c6Var);
                        } else {
                            messageMedia = messageObject.replyMessageObject.messageOwner.media;
                            if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) || (messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23076eb, c6Var);
                            } else {
                                iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23058db, c6Var);
                            }
                        }
                    } else {
                        iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23076eb, c6Var);
                    }
                } else if (messageObject6.isOutOwner()) {
                    i10 = iDp3;
                    f18 = f51;
                    f19 = y12;
                    messageObject = messageObject6;
                    f20 = f50;
                    if (messageObject.isReplyToStory()) {
                        iV1 = i13;
                    } else {
                        iV2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yc, c6Var);
                        if (messageObject.forceAvatar) {
                            iV3 = iV2;
                            f40 = 0.0f;
                        } else if (messageObject.hasValidReplyMessageObject()) {
                            messageObject4 = messageObject.replyMessageObject;
                            if ((messageObject4.type != 0 || !TextUtils.isEmpty(messageObject4.caption)) && !(MessageObject.getMedia(messageObject.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame) && !(MessageObject.getMedia(messageObject.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaInvoice)) {
                                iV3 = iV2;
                                f40 = 0.0f;
                            } else if (s1Var2.f25562v9) {
                                iV3 = iV2;
                                f40 = 0.0f;
                            } else {
                                iV3 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Zc, c6Var);
                                f40 = 0.6f;
                            }
                        } else if (s1Var2.f25562v9) {
                            iV3 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Zc, c6Var);
                            f40 = 0.6f;
                        } else {
                            iV3 = iV2;
                            f40 = 0.0f;
                        }
                        iV1 = i0.b.d(f40, iV3, org.telegram.ui.ActionBar.g6.c(iV3, i13));
                    }
                } else if (messageObject6.isReplyToStory()) {
                    i10 = iDp3;
                    f18 = f51;
                    f19 = y12;
                    messageObject = messageObject6;
                    f20 = f50;
                    iV1 = i13;
                } else {
                    i10 = iDp3;
                    int iV5 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23058db, c6Var);
                    f18 = f51;
                    messageObject = messageObject6;
                    if (messageObject.forceAvatar) {
                        f19 = y12;
                    } else {
                        if (messageObject.hasValidReplyMessageObject()) {
                            messageObject5 = messageObject.replyMessageObject;
                            f19 = y12;
                            if ((messageObject5.type != 0 || !TextUtils.isEmpty(messageObject5.caption)) && !(MessageObject.getMedia(messageObject.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame) && !(MessageObject.getMedia(messageObject.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaInvoice)) {
                            }
                            f20 = f50;
                            iV1 = i0.b.d(f41, iV4, org.telegram.ui.ActionBar.g6.c(iV4, i13));
                        } else {
                            f19 = y12;
                        }
                        if (!s1Var2.f25562v9) {
                            iV4 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23076eb, c6Var);
                            f41 = 0.6f;
                        }
                        f20 = f50;
                        iV1 = i0.b.d(f41, iV4, org.telegram.ui.ActionBar.g6.c(iV4, i13));
                    }
                    iV4 = iV5;
                    f41 = 0.0f;
                    f20 = f50;
                    iV1 = i0.b.d(f41, iV4, org.telegram.ui.ActionBar.g6.c(iV4, i13));
                }
                messageObject3 = messageObject;
                f21 = f14;
                org.telegram.ui.ActionBar.g6.Z2.setColor(i0.b.d(f21, this.f36483i, iV1));
                org.telegram.ui.ActionBar.g6.Y2.setColor(i0.b.d(f21, this.h, i13));
                if (s1Var2.L9) {
                    fDp = x12 - AndroidUtilities.dp(44.0f);
                } else {
                    fDp = x12;
                }
                fLerp = AndroidUtilities.lerp(fDp, f52, f16);
                fLerp2 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f21) + y16, f54, f21);
                if (this.R == null) {
                    this.R = new float[]{fDp, fDp, 0.0f, 0.0f, 0.0f, 0.0f, fDp, fDp};
                    float fDp4 = AndroidUtilities.dp(4.0f);
                    float[] fArr = this.R;
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(fDp, y16, this.f36481f + fDp, AndroidUtilities.dp(35.0f) + y16);
                rectF3.offset(0.0f, AndroidUtilities.dp(12.0f) * f21);
                RectF rectF4 = s1Var2.f25593xc;
                RectF rectF5 = this.Q;
                rectF5.set(rectF4);
                rectF5.offset(x10, fZ);
                rectF = this.P;
                AndroidUtilities.lerp(rectF3, rectF5, f16, rectF);
                s1Var2.X9.d(canvas, rectF, f53, s1Var2.f25562v9, s1Var2.getMessageObject().shouldDrawWithoutBackground());
                canvas2 = canvas;
                s1Var2.X9.e(canvas2, rectF, f53);
                if (s1Var2.L9) {
                    canvas2.save();
                    float fHeight = rectF.height() - AndroidUtilities.dp(10.0f);
                    if (s1Var2.f25562v9) {
                        f39 = 3.0f;
                    } else {
                        f39 = 7.0f;
                    }
                    float fLerp4 = AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), Math.min(fHeight, org.telegram.ui.ActionBar.g6.Z2.getTextSize() + org.telegram.ui.ActionBar.g6.Y2.getTextSize() + AndroidUtilities.dp(f39)), f16);
                    float fLerp5 = AndroidUtilities.lerp(fLerp, rectF.left + AndroidUtilities.dp(8.0f), f16);
                    float f55 = rectF.top;
                    if (s1Var2.f25562v9 || (staticLayout = s1Var2.f25621z9) == null) {
                        f17 = f53;
                    } else {
                        if (staticLayout.getLineCount() <= 1) {
                            f17 = f53;
                            i17 = 2;
                        }
                        imageReceiver.setImageCoords(fLerp5, AndroidUtilities.lerp(fLerp2, f55 + AndroidUtilities.dp(i17 + 5), f16), fLerp4, fLerp4);
                        imageReceiver.draw(canvas2);
                        canvas2.restore();
                        f34 = fLerp4;
                    }
                    f17 = f53;
                    i17 = 0;
                    imageReceiver.setImageCoords(fLerp5, AndroidUtilities.lerp(fLerp2, f55 + AndroidUtilities.dp(i17 + 5), f16), fLerp4, fLerp4);
                    imageReceiver.draw(canvas2);
                    canvas2.restore();
                    f34 = fLerp4;
                } else {
                    f17 = f53;
                    f34 = 0.0f;
                }
                canvas2.save();
                f35 = iDp4 * f16;
                canvas2.translate(f35, 0.0f);
                if (messageObject3.shouldDrawWithoutBackground()) {
                    iDp = AndroidUtilities.dp(6.0f);
                } else {
                    iDp = AndroidUtilities.dp(1.0f);
                }
                float f56 = -iDp;
                if (messageObject3.shouldDrawWithoutBackground()) {
                    iDp2 = AndroidUtilities.dp(1.0f);
                } else {
                    iDp2 = AndroidUtilities.dp(3.0f);
                }
                f36 = iDp2;
                float f57 = s1Var2.J9;
                f37 = (f52 - f57) + f56;
                float f58 = (f52 - this.K) + f56;
                AndroidUtilities.lerp(fDp - f57, f37, f16);
                float fLerp6 = AndroidUtilities.lerp(fDp, f58, f16);
                if (s1Var2.L9) {
                    fDp2 = AndroidUtilities.dp(3.0f) + f34;
                } else {
                    fDp2 = 0.0f;
                }
                f38 = fLerp6 + fDp2;
                if (s1Var2.f25606y9 != null) {
                    canvas2.save();
                    canvas2.translate(f38, (f36 * f16) + fLerp2);
                    int alpha = org.telegram.ui.ActionBar.g6.Y2.getAlpha();
                    org.telegram.ui.ActionBar.g6.Y2.setAlpha((int) (alpha * f16));
                    s1Var2.f25606y9.draw(canvas2);
                    org.telegram.ui.ActionBar.g6.Y2.setAlpha(alpha);
                    org.telegram.ui.ActionBar.h5 h5Var = ((org.telegram.ui.Components.eo[]) rnVar3.W.f594b)[0].f28103c;
                    rnVar = rnVar3;
                    rectF2 = rectF;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, h5Var.getWidth(), h5Var.getHeight(), (int) (f11 * 255.0f), 31);
                    h5Var.setAlpha(1.0f);
                    h5Var.draw(canvas2);
                    h5Var.setAlpha(0.0f);
                    canvas2.restore();
                    canvas2.restore();
                } else {
                    rnVar = rnVar3;
                    rectF2 = rectF;
                }
                if (s1Var2.f25562v9 && s1Var2.f25502r9 != null) {
                    if (s1Var2.X9.h() != s1Var2.f25463o9) {
                        Drawable drawable = s1Var2.f25502r9;
                        int iH = s1Var2.X9.h();
                        s1Var2.f25463o9 = iH;
                        drawable.setColorFilter(new PorterDuffColorFilter(iH, PorterDuff.Mode.SRC_IN));
                    }
                    s1Var2.f25502r9.setBounds((int) (((rectF2.right - f35) - AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)) - s1Var2.f25502r9.getIntrinsicWidth()), (int) (rectF2.top + AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)), (int) ((rectF2.right - f35) - AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)), (int) (rectF2.top + AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2) + s1Var2.f25502r9.getIntrinsicHeight()));
                    s1Var2.f25502r9.setAlpha((int) (f16 * 255.0f));
                    s1Var2.f25502r9.draw(canvas2);
                }
                if (s1Var2.f25621z9 != null) {
                    canvas2.save();
                    fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(19.0f), org.telegram.ui.ActionBar.g6.Y2.getTextSize() + AndroidUtilities.dp(4.0f) + f36, f16) + fLerp2;
                    if (s1Var2.f25562v9 || !s1Var2.L9) {
                        fDp3 = f37;
                    } else {
                        fDp3 = f37 - AndroidUtilities.dp(2.0f);
                    }
                    if (s1Var2.L9 && (!s1Var2.f25562v9 || s1Var2.K9)) {
                        fDp3 += f34 + AndroidUtilities.dp(3.0f);
                    }
                    if (s1Var2.f25578w9 && s1Var2.f25590x9 != null) {
                        float fLerp7 = AndroidUtilities.lerp(fDp - s1Var2.J9, fDp3, f16);
                        s1Var2.f25590x9.e((int) fLerp7, AndroidUtilities.dp(2.0f) + ((int) fLerp3), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                        Paint paint = org.telegram.ui.ActionBar.g6.X1;
                        if (messageObject3.isOutOwner()) {
                            i15 = org.telegram.ui.ActionBar.g6.Ta;
                        } else {
                            i15 = org.telegram.ui.ActionBar.g6.Ac;
                        }
                        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
                        canvas2.drawCircle(fLerp7 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f) + fLerp3, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.X1);
                        CheckBoxBase checkBoxBase2 = s1Var2.f25590x9;
                        if (messageObject3.isOutOwner()) {
                            i16 = org.telegram.ui.ActionBar.g6.f23446zb;
                        } else {
                            i16 = org.telegram.ui.ActionBar.g6.f23412xd;
                        }
                        checkBoxBase2.h(-1, i16, org.telegram.ui.ActionBar.g6.f23182k7);
                        checkBoxBase = s1Var2.f25590x9;
                        if (checkBoxBase.h != f21) {
                            checkBoxBase.h = f21;
                            checkBoxBase.b();
                        }
                        s1Var2.f25590x9.a(canvas2);
                    }
                    if (s1Var2.f25578w9) {
                        fDp3 += AndroidUtilities.dp(16.0f);
                    }
                    if (s1Var2.K9 && s1Var2.J9 > 0) {
                        fDp3 = ((rectF2.right - AndroidUtilities.dp(8.0f)) - s1Var2.f25621z9.getWidth()) - f35;
                    }
                    canvas2.translate(AndroidUtilities.lerp(fDp - s1Var2.J9, fDp3, f16), fLerp3);
                    canvas2.save();
                    eh.k.d(canvas2, arrayList);
                    org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas2, s1Var2.f25621z9, s1Var2.f25436mc, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
                    s1Var2.f25621z9.draw(canvas2);
                    canvas2.restore();
                    size = arrayList.size();
                    i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        kVar = (eh.k) obj;
                        z13 = kVar.f5524p;
                        kVar.f5524p = false;
                        if (z13) {
                            kVar.h(s1Var2.f25621z9.getPaint().getColor());
                        }
                        kVar.draw(canvas2);
                    }
                    canvas2.restore();
                }
                canvas2.restore();
            }
            i13 = iV0;
            if (!messageObject6.shouldDrawWithoutBackground()) {
                i10 = iDp3;
                f18 = f51;
                f19 = y12;
                messageObject = messageObject6;
                f20 = f50;
                gl0Var = s1Var2.X9;
                if (gl0Var != null) {
                    iV1 = gl0Var.I.f26922c;
                } else if (messageObject.hasValidReplyMessageObject()) {
                    messageObject2 = messageObject.replyMessageObject;
                    if (messageObject2.type == 0) {
                        messageMedia = messageObject.replyMessageObject.messageOwner.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23076eb, c6Var);
                        } else {
                            iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23076eb, c6Var);
                        }
                    } else {
                        messageMedia = messageObject.replyMessageObject.messageOwner.media;
                        if (messageMedia instanceof TLRPC.TL_messageMediaGame) {
                            iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23076eb, c6Var);
                        } else {
                            iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23076eb, c6Var);
                        }
                    }
                } else {
                    iV1 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23076eb, c6Var);
                }
            } else if (messageObject6.isOutOwner()) {
                i10 = iDp3;
                f18 = f51;
                f19 = y12;
                messageObject = messageObject6;
                f20 = f50;
                if (messageObject.isReplyToStory()) {
                    iV1 = i13;
                } else {
                    iV2 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Yc, c6Var);
                    if (messageObject.forceAvatar) {
                        iV3 = iV2;
                        f40 = 0.0f;
                    } else if (messageObject.hasValidReplyMessageObject()) {
                        messageObject4 = messageObject.replyMessageObject;
                        if (messageObject4.type != 0) {
                        }
                        iV3 = iV2;
                        f40 = 0.0f;
                    } else if (s1Var2.f25562v9) {
                        iV3 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Zc, c6Var);
                        f40 = 0.6f;
                    } else {
                        iV3 = iV2;
                        f40 = 0.0f;
                    }
                    iV1 = i0.b.d(f40, iV3, org.telegram.ui.ActionBar.g6.c(iV3, i13));
                }
            } else if (messageObject6.isReplyToStory()) {
                i10 = iDp3;
                f18 = f51;
                f19 = y12;
                messageObject = messageObject6;
                f20 = f50;
                iV1 = i13;
            } else {
                i10 = iDp3;
                int iV6 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23058db, c6Var);
                f18 = f51;
                messageObject = messageObject6;
                if (messageObject.forceAvatar) {
                    if (messageObject.hasValidReplyMessageObject()) {
                        messageObject5 = messageObject.replyMessageObject;
                        f19 = y12;
                        if (messageObject5.type != 0) {
                        }
                    } else {
                        f19 = y12;
                    }
                    if (!s1Var2.f25562v9) {
                        iV4 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23076eb, c6Var);
                        f41 = 0.6f;
                    }
                    f20 = f50;
                    iV1 = i0.b.d(f41, iV4, org.telegram.ui.ActionBar.g6.c(iV4, i13));
                } else {
                    f19 = y12;
                }
                iV4 = iV6;
                f41 = 0.0f;
                f20 = f50;
                iV1 = i0.b.d(f41, iV4, org.telegram.ui.ActionBar.g6.c(iV4, i13));
            }
            messageObject3 = messageObject;
            f21 = f14;
            org.telegram.ui.ActionBar.g6.Z2.setColor(i0.b.d(f21, this.f36483i, iV1));
            org.telegram.ui.ActionBar.g6.Y2.setColor(i0.b.d(f21, this.h, i13));
            if (s1Var2.L9) {
                fDp = x12 - AndroidUtilities.dp(44.0f);
            } else {
                fDp = x12;
            }
            fLerp = AndroidUtilities.lerp(fDp, f52, f16);
            fLerp2 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f21) + y16, f54, f21);
            if (this.R == null) {
                this.R = new float[]{fDp4, fDp4, 0.0f, 0.0f, 0.0f, 0.0f, fDp4, fDp4};
                float fDp5 = AndroidUtilities.dp(4.0f);
                float[] fArr2 = this.R;
                fArr2[5] = 0.0f;
                fArr2[4] = 0.0f;
                fArr2[3] = 0.0f;
                fArr2[2] = 0.0f;
            }
            RectF rectF6 = AndroidUtilities.rectTmp;
            rectF6.set(fDp, y16, this.f36481f + fDp, AndroidUtilities.dp(35.0f) + y16);
            rectF6.offset(0.0f, AndroidUtilities.dp(12.0f) * f21);
            RectF rectF7 = s1Var2.f25593xc;
            RectF rectF8 = this.Q;
            rectF8.set(rectF7);
            rectF8.offset(x10, fZ);
            rectF = this.P;
            AndroidUtilities.lerp(rectF6, rectF8, f16, rectF);
            s1Var2.X9.d(canvas, rectF, f53, s1Var2.f25562v9, s1Var2.getMessageObject().shouldDrawWithoutBackground());
            canvas2 = canvas;
            s1Var2.X9.e(canvas2, rectF, f53);
            if (s1Var2.L9) {
                canvas2.save();
                float fHeight2 = rectF.height() - AndroidUtilities.dp(10.0f);
                if (s1Var2.f25562v9) {
                    f39 = 3.0f;
                } else {
                    f39 = 7.0f;
                }
                float fLerp8 = AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), Math.min(fHeight2, org.telegram.ui.ActionBar.g6.Z2.getTextSize() + org.telegram.ui.ActionBar.g6.Y2.getTextSize() + AndroidUtilities.dp(f39)), f16);
                float fLerp9 = AndroidUtilities.lerp(fLerp, rectF.left + AndroidUtilities.dp(8.0f), f16);
                float f59 = rectF.top;
                if (s1Var2.f25562v9) {
                    f17 = f53;
                    f17 = f53;
                    i17 = 0;
                } else {
                    f17 = f53;
                    f17 = f53;
                    i17 = 0;
                }
                imageReceiver.setImageCoords(fLerp9, AndroidUtilities.lerp(fLerp2, f59 + AndroidUtilities.dp(i17 + 5), f16), fLerp8, fLerp8);
                imageReceiver.draw(canvas2);
                canvas2.restore();
                f34 = fLerp8;
            } else {
                f17 = f53;
                f34 = 0.0f;
            }
            canvas2.save();
            f35 = iDp4 * f16;
            canvas2.translate(f35, 0.0f);
            if (messageObject3.shouldDrawWithoutBackground()) {
                iDp = AndroidUtilities.dp(6.0f);
            } else {
                iDp = AndroidUtilities.dp(1.0f);
            }
            float f510 = -iDp;
            if (messageObject3.shouldDrawWithoutBackground()) {
                iDp2 = AndroidUtilities.dp(1.0f);
            } else {
                iDp2 = AndroidUtilities.dp(3.0f);
            }
            f36 = iDp2;
            float f511 = s1Var2.J9;
            f37 = (f52 - f511) + f510;
            float f512 = (f52 - this.K) + f510;
            AndroidUtilities.lerp(fDp - f511, f37, f16);
            float fLerp10 = AndroidUtilities.lerp(fDp, f512, f16);
            if (s1Var2.L9) {
                fDp2 = AndroidUtilities.dp(3.0f) + f34;
            } else {
                fDp2 = 0.0f;
            }
            f38 = fLerp10 + fDp2;
            if (s1Var2.f25606y9 != null) {
                canvas2.save();
                canvas2.translate(f38, (f36 * f16) + fLerp2);
                int alpha2 = org.telegram.ui.ActionBar.g6.Y2.getAlpha();
                org.telegram.ui.ActionBar.g6.Y2.setAlpha((int) (alpha2 * f16));
                s1Var2.f25606y9.draw(canvas2);
                org.telegram.ui.ActionBar.g6.Y2.setAlpha(alpha2);
                org.telegram.ui.ActionBar.h5 h5Var2 = ((org.telegram.ui.Components.eo[]) rnVar3.W.f594b)[0].f28103c;
                rnVar = rnVar3;
                rectF2 = rectF;
                canvas2.saveLayerAlpha(0.0f, 0.0f, h5Var2.getWidth(), h5Var2.getHeight(), (int) (f11 * 255.0f), 31);
                h5Var2.setAlpha(1.0f);
                h5Var2.draw(canvas2);
                h5Var2.setAlpha(0.0f);
                canvas2.restore();
                canvas2.restore();
            } else {
                rnVar = rnVar3;
                rectF2 = rectF;
            }
            if (s1Var2.f25562v9) {
                if (s1Var2.X9.h() != s1Var2.f25463o9) {
                    Drawable drawable2 = s1Var2.f25502r9;
                    int iH2 = s1Var2.X9.h();
                    s1Var2.f25463o9 = iH2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(iH2, PorterDuff.Mode.SRC_IN));
                }
                s1Var2.f25502r9.setBounds((int) (((rectF2.right - f35) - AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)) - s1Var2.f25502r9.getIntrinsicWidth()), (int) (rectF2.top + AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)), (int) ((rectF2.right - f35) - AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2)), (int) (rectF2.top + AndroidUtilities.dp((!s1Var2.E ? 1 : 0) + 2) + s1Var2.f25502r9.getIntrinsicHeight()));
                s1Var2.f25502r9.setAlpha((int) (f16 * 255.0f));
                s1Var2.f25502r9.draw(canvas2);
            }
            if (s1Var2.f25621z9 != null) {
                canvas2.save();
                fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(19.0f), org.telegram.ui.ActionBar.g6.Y2.getTextSize() + AndroidUtilities.dp(4.0f) + f36, f16) + fLerp2;
                if (s1Var2.f25562v9) {
                    fDp3 = f37;
                } else {
                    fDp3 = f37;
                }
                if (s1Var2.L9) {
                    fDp3 += f34 + AndroidUtilities.dp(3.0f);
                }
                if (s1Var2.f25578w9) {
                    float fLerp11 = AndroidUtilities.lerp(fDp - s1Var2.J9, fDp3, f16);
                    s1Var2.f25590x9.e((int) fLerp11, AndroidUtilities.dp(2.0f) + ((int) fLerp3), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                    Paint paint2 = org.telegram.ui.ActionBar.g6.X1;
                    if (messageObject3.isOutOwner()) {
                        i15 = org.telegram.ui.ActionBar.g6.Ta;
                    } else {
                        i15 = org.telegram.ui.ActionBar.g6.Ac;
                    }
                    paint2.setColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
                    canvas2.drawCircle(fLerp11 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f) + fLerp3, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.g6.X1);
                    CheckBoxBase checkBoxBase3 = s1Var2.f25590x9;
                    if (messageObject3.isOutOwner()) {
                        i16 = org.telegram.ui.ActionBar.g6.f23446zb;
                    } else {
                        i16 = org.telegram.ui.ActionBar.g6.f23412xd;
                    }
                    checkBoxBase3.h(-1, i16, org.telegram.ui.ActionBar.g6.f23182k7);
                    checkBoxBase = s1Var2.f25590x9;
                    if (checkBoxBase.h != f21) {
                        checkBoxBase.h = f21;
                        checkBoxBase.b();
                    }
                    s1Var2.f25590x9.a(canvas2);
                }
                if (s1Var2.f25578w9) {
                    fDp3 += AndroidUtilities.dp(16.0f);
                }
                if (s1Var2.K9) {
                    fDp3 = ((rectF2.right - AndroidUtilities.dp(8.0f)) - s1Var2.f25621z9.getWidth()) - f35;
                }
                canvas2.translate(AndroidUtilities.lerp(fDp - s1Var2.J9, fDp3, f16), fLerp3);
                canvas2.save();
                eh.k.d(canvas2, arrayList);
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas2, s1Var2.f25621z9, s1Var2.f25436mc, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
                s1Var2.f25621z9.draw(canvas2);
                canvas2.restore();
                size = arrayList.size();
                i14 = 0;
                while (i14 < size) {
                    Object obj2 = arrayList.get(i14);
                    i14++;
                    kVar = (eh.k) obj2;
                    z13 = kVar.f5524p;
                    kVar.f5524p = false;
                    if (z13) {
                        kVar.h(s1Var2.f25621z9.getPaint().getColor());
                    }
                    kVar.draw(canvas2);
                }
                canvas2.restore();
            }
            canvas2.restore();
        } else {
            f17 = f15;
            i10 = iDp3;
            this = this;
            f18 = f51;
            f19 = y12;
            f20 = f50;
            f21 = f14;
            f11 = f11;
            rnVar = rnVar2;
        }
        canvas2.save();
        if (s1Var2.getMessageObject() == null || s1Var2.getMessageObject().type != 19) {
            canvas2.clipRect(f48 + AndroidUtilities.dp(4.0f), f18 + AndroidUtilities.dp(4.0f), i10 - AndroidUtilities.dp(4.0f), y15 - AndroidUtilities.dp(4.0f));
        }
        float f60 = (this.C * f11) + f16;
        canvas2.save();
        float f61 = x8 * f11;
        float fZ2 = com.google.android.recaptcha.internal.a.z(f44, f47, f16, f61);
        float f62 = f19 * f20;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = s1Var2.getMessageObject().textLayoutBlocks;
        MessageObject.TextLayoutBlock textLayoutBlock2 = this.E;
        canvas2.translate(fZ2, ((textLayoutBlock2.textYOffset(arrayList2, r1Var2) + r15) * f21) + f62);
        float f63 = f60 * 1.0f;
        canvas2.scale(f60, f63, 0.0f, 0.0f);
        boolean z15 = this.f36489o;
        int i18 = this.M;
        boolean z16 = this.f36488n;
        StaticLayout staticLayout2 = this.f36490p;
        if (z16 && z15) {
            int color = staticLayout2.getPaint().getColor();
            float f64 = f17;
            staticLayout2.getPaint().setColor(i0.b.d(f64, this.L, i18));
            float f65 = 1.0f - f64;
            f22 = f21;
            f23 = f11;
            i11 = i18;
            f26 = f64;
            z10 = z15;
            r1Var = r1Var2;
            z11 = z16;
            textLayoutBlock = textLayoutBlock2;
            f24 = fZ;
            s1Var = s1Var2;
            f27 = f44;
            canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f65 * 255.0f), 31);
            staticLayout2.draw(canvas);
            f25 = f60;
            f28 = f63;
            f29 = f61;
            org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas, this.f36490p, this.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f65);
            staticLayout2.getPaint().setColor(color);
            canvas.restore();
            canvas3 = canvas;
        } else {
            z10 = z15;
            i11 = i18;
            f22 = f21;
            f23 = f11;
            f24 = fZ;
            s1Var = s1Var2;
            z11 = z16;
            f25 = f60;
            f26 = f17;
            f27 = f44;
            f28 = f63;
            textLayoutBlock = textLayoutBlock2;
            r1Var = r1Var2;
            f29 = f61;
            if (z11) {
                float f66 = 1.0f - f26;
                canvas3 = canvas;
                canvas3.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f66 * 255.0f), 31);
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas3, this.f36490p, this.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f66);
                canvas3.restore();
            } else {
                canvas3 = canvas;
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.t5.drawAnimatedEmojis(canvas3, this.f36490p, this.H, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        }
        canvas3.restore();
        StaticLayout staticLayout3 = this.f36491q;
        if (staticLayout3 != null) {
            canvas3.save();
            canvas3.translate(com.google.android.recaptcha.internal.a.z(f27, this.f36487m, f16, f29), ((textLayoutBlock.textYOffset(s1Var.getMessageObject().textLayoutBlocks, r1Var) + f45) * f22) + f62);
            f30 = f28;
            f32 = f25;
            canvas3.scale(f32, f30, 0.0f, 0.0f);
            if (z11 && z10) {
                int color2 = staticLayout3.getPaint().getColor();
                f31 = f26;
                i12 = i11;
                staticLayout3.getPaint().setColor(i0.b.k(i0.b.d(f31, this.L, i12), (int) ((1.0f - f31) * Color.alpha(color2))));
                staticLayout3.draw(canvas3);
                staticLayout3.getPaint().setColor(color2);
            } else {
                f31 = f26;
                i12 = i11;
                if (z11) {
                    int alpha3 = staticLayout3.getPaint().getAlpha();
                    staticLayout3.getPaint().setAlpha((int) ((1.0f - f31) * alpha3));
                    staticLayout3.draw(canvas3);
                    staticLayout3.getPaint().setAlpha(alpha3);
                } else {
                    staticLayout3.draw(canvas3);
                }
            }
            canvas3.restore();
        } else {
            f30 = f28;
            f31 = f26;
            i12 = i11;
            f32 = f25;
        }
        if (z11) {
            canvas3.save();
            canvas3.translate(com.google.android.recaptcha.internal.a.z(x8, f27, f23, (zk0Var.getX() + s1Var.getLeft()) - fiVar.getX()), f24);
            canvas3.scale(f32, f30, s1Var.getTextX(), s1Var.getTextY());
            canvas3.translate(0.0f, -0.0f);
            int color3 = org.telegram.ui.ActionBar.g6.f23247o2.getColor();
            org.telegram.ui.ActionBar.g6.f23247o2.setColor(i12);
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = s1Var.getMessageObject().textLayoutBlocks;
            org.telegram.ui.Cells.s1 s1Var3 = s1Var;
            float f67 = s1Var3.f25440n0;
            org.telegram.ui.Cells.r1 r1Var3 = s1Var3.Vc;
            if (r1Var3.f25144l2) {
                float f68 = r1Var3.f25153n2;
                float f69 = r1Var3.K1;
                f67 = (f67 * f69) + ((1.0f - f69) * f68);
            }
            float f70 = s1Var3.f25383j0;
            MessageObject messageObject7 = s1Var3.f25546u7;
            Canvas canvas4 = canvas3;
            f33 = 0.0f;
            z12 = false;
            s1Var3.T1(f70, f67, canvas4, arrayList3, messageObject7 == null ? 0.0f : messageObject7.textXOffset, true, f31, false, true, false, false);
            canvas3 = canvas4;
            s1Var3.z1(canvas3, f31);
            if (org.telegram.ui.ActionBar.g6.f23247o2.getColor() != color3) {
                org.telegram.ui.ActionBar.g6.f23247o2.setColor(color3);
            }
            canvas3.restore();
        } else {
            f33 = 0.0f;
            z12 = false;
        }
        canvas3.restore();
        if (z14) {
            float f71 = measuredHeight;
            this.f36495u.setTranslate(f33, f71);
            this.B.setLocalMatrix(this.f36495u);
            canvas3.drawRect(0.0f, f71, fiVar.getMeasuredWidth(), fiVar.getMeasuredHeight(), this.v);
            canvas3.restore();
        }
        float f72 = this.f36477a;
        float f73 = f72 > 0.4f ? 1.0f : f72 / 0.4f;
        ck ckVar = this.G;
        if (f73 == 1.0f) {
            ckVar.setTextTransitionIsRunning(z12);
        }
        if (ckVar.getSendButton().getVisibility() != 0 || f73 >= 1.0f) {
            return;
        }
        View sendButton = ckVar.getSendButton();
        jm jmVar = rnVar.T0;
        PointF pointF = this.O;
        qg.j.b(sendButton, jmVar, pointF);
        canvas3.save();
        canvas3.translate(pointF.x - fiVar.getX(), pointF.y - fiVar.getY());
        View sendButton2 = ckVar.getSendButton();
        canvas3.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((1.0f - f73) * 255.0f));
        sendButton2.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        canvas3.restore();
    }

    public final int b(int i10) {
        return org.telegram.ui.ActionBar.g6.v0(i10, this.N);
    }
}

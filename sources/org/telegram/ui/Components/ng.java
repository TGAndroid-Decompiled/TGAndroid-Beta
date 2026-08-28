package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class ng extends View {
    public float A;
    public final ChatActivityEnterView B;
    public boolean f31091a;
    public boolean f31092b;
    public String f31093c;
    public long d;
    public long f31094e;
    public long f31095f;
    public final SpannableStringBuilder h;
    public final SpannableStringBuilder f31096n;
    public SpannableStringBuilder f31097r;
    public StaticLayout f31098s;
    public StaticLayout v;
    public float f31099w;
    public TextPaint f31100x;
    public final float f31101y;

    public ng(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.B = chatActivityEnterView;
        this.h = new SpannableStringBuilder();
        this.f31096n = new SpannableStringBuilder();
        this.f31097r = new SpannableStringBuilder();
        this.f31101y = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j10) {
        this.f31091a = true;
        long currentTimeMillis = System.currentTimeMillis() - j10;
        this.d = currentTimeMillis;
        this.f31095f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f31091a) {
            this.f31091a = false;
            if (this.d > 0) {
                this.f31094e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f31095f = 0L;
    }

    public float getLeftProperty() {
        return this.A;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int threadMessageId;
        int i9;
        int i10;
        TextPaint textPaint = this.f31100x;
        ChatActivityEnterView chatActivityEnterView = this.B;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.f31100x = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.f31100x.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.f31100x;
            int i11 = org.telegram.ui.ActionBar.f6.f23187nf;
            int i12 = ChatActivityEnterView.f26074i5;
            textPaint3.setColor(chatActivityEnterView.h0(i11));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f31091a) {
            j10 = currentTimeMillis - this.d;
        } else {
            j10 = this.f31094e - this.d;
        }
        long j11 = j10 / 1000;
        int i13 = ((int) (j10 % 1000)) / 10;
        if (chatActivityEnterView.Y0 && j10 >= 59500 && !this.f31092b) {
            chatActivityEnterView.f26211y2 = -1.0f;
            eg egVar = chatActivityEnterView.U2;
            if (chatActivityEnterView.K) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            egVar.U1(3, 0, i10, chatActivityEnterView.N4, 0L, true);
            oe oeVar = chatActivityEnterView.F0;
            chatActivityEnterView.N4 = 0L;
            oeVar.setEffect(0L);
            this.f31092b = true;
        }
        if (this.f31091a && currentTimeMillis > this.f31095f + 5000) {
            this.f31095f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.M);
            long j12 = chatActivityEnterView.L2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j13 = threadMessageId;
            if (chatActivityEnterView.Y0) {
                i9 = 7;
            } else {
                i9 = 1;
            }
            messagesController.sendTyping(j12, j13, i9, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j11, i13);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f31093c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f31093c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f31093c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.h;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f31096n;
            spannableStringBuilder3.clear();
            this.f31097r.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f31093c);
            this.f31097r.append((CharSequence) formatTimerDurationFast);
            int i14 = -1;
            int i15 = -1;
            int i16 = 0;
            int i17 = 0;
            for (int i18 = 0; i18 < length - 1; i18++) {
                if (this.f31093c.charAt(i18) != formatTimerDurationFast.charAt(i18)) {
                    if (i17 == 0) {
                        i15 = i18;
                    }
                    i17++;
                    if (i16 != 0) {
                        xy xyVar = new xy(false);
                        if (i18 == length - 2) {
                            i16++;
                        }
                        int i19 = i16 + i14;
                        spannableStringBuilder2.setSpan(xyVar, i14, i19, 33);
                        spannableStringBuilder3.setSpan(xyVar, i14, i19, 33);
                        i16 = 0;
                    }
                } else {
                    if (i16 == 0) {
                        i14 = i18;
                    }
                    i16++;
                    if (i17 != 0) {
                        this.f31097r.setSpan(new xy(false), i15, i17 + i15, 33);
                        i17 = 0;
                    }
                }
            }
            if (i16 != 0) {
                xy xyVar2 = new xy(false);
                int i20 = i16 + i14 + 1;
                spannableStringBuilder2.setSpan(xyVar2, i14, i20, 33);
                spannableStringBuilder3.setSpan(xyVar2, i14, i20, 33);
            }
            if (i17 != 0) {
                this.f31097r.setSpan(new xy(false), i15, i17 + i15, 33);
            }
            TextPaint textPaint4 = this.f31100x;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f31098s = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.v = new StaticLayout(spannableStringBuilder3, this.f31100x, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f31099w = 1.0f;
        } else {
            if (this.f31097r == null) {
                this.f31097r = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f31097r.length() != 0 && this.f31097r.length() == formatTimerDurationFast.length()) {
                this.f31097r.replace(spannableStringBuilder.length() - 1, this.f31097r.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f31097r.length()), formatTimerDurationFast.length());
            } else {
                this.f31097r.clear();
                this.f31097r.append((CharSequence) formatTimerDurationFast);
            }
        }
        float f10 = this.f31099w;
        if (f10 != 0.0f) {
            float f11 = f10 - 0.15f;
            this.f31099w = f11;
            if (f11 < 0.0f) {
                this.f31099w = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.f31099w == 0.0f) {
            this.f31097r.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f31097r, this.f31100x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.A = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f31098s;
            float f12 = this.f31101y;
            if (staticLayout2 != null) {
                canvas.save();
                this.f31100x.setAlpha((int) ((1.0f - this.f31099w) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f31098s.getHeight() / 2.0f)) - (this.f31099w * f12));
                this.f31098s.draw(canvas);
                canvas.restore();
            }
            if (this.v != null) {
                canvas.save();
                this.f31100x.setAlpha((int) (this.f31099w * 255.0f));
                canvas.translate(0.0f, e2.c.z(1.0f, this.f31099w, f12, measuredHeight - (this.v.getHeight() / 2.0f)));
                this.v.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.f31100x.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f31097r, this.f31100x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.A = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f31093c = formatTimerDurationFast;
        if (!this.f31091a && this.f31099w == 0.0f) {
            return;
        }
        invalidate();
    }
}

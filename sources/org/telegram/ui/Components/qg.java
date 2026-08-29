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
public final class qg extends View {
    public float A;
    public final ChatActivityEnterView B;
    public boolean f31930a;
    public boolean f31931b;
    public String f31932c;
    public long d;
    public long f31933e;
    public long f31934f;
    public final SpannableStringBuilder h;
    public final SpannableStringBuilder f31935n;
    public SpannableStringBuilder f31936r;
    public StaticLayout f31937s;
    public StaticLayout v;
    public float f31938w;
    public TextPaint f31939x;
    public final float f31940y;

    public qg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.B = chatActivityEnterView;
        this.h = new SpannableStringBuilder();
        this.f31935n = new SpannableStringBuilder();
        this.f31936r = new SpannableStringBuilder();
        this.f31940y = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j10) {
        this.f31930a = true;
        long currentTimeMillis = System.currentTimeMillis() - j10;
        this.d = currentTimeMillis;
        this.f31934f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f31930a) {
            this.f31930a = false;
            if (this.d > 0) {
                this.f31933e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f31934f = 0L;
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
        int i10;
        int i11;
        TextPaint textPaint = this.f31939x;
        ChatActivityEnterView chatActivityEnterView = this.B;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.f31939x = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.f31939x.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.f31939x;
            int i12 = org.telegram.ui.ActionBar.g6.f23250nf;
            int i13 = ChatActivityEnterView.f26085i5;
            textPaint3.setColor(chatActivityEnterView.i0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f31930a) {
            j10 = currentTimeMillis - this.d;
        } else {
            j10 = this.f31933e - this.d;
        }
        long j11 = j10 / 1000;
        int i14 = ((int) (j10 % 1000)) / 10;
        if (chatActivityEnterView.Y0 && j10 >= 59500 && !this.f31931b) {
            chatActivityEnterView.f26222y2 = -1.0f;
            hg hgVar = chatActivityEnterView.U2;
            if (chatActivityEnterView.K) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            hgVar.l2(3, 0, i11, chatActivityEnterView.N4, 0L, true);
            re reVar = chatActivityEnterView.F0;
            chatActivityEnterView.N4 = 0L;
            reVar.setEffect(0L);
            this.f31931b = true;
        }
        if (this.f31930a && currentTimeMillis > this.f31934f + 5000) {
            this.f31934f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.M);
            long j12 = chatActivityEnterView.L2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j13 = threadMessageId;
            if (chatActivityEnterView.Y0) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j12, j13, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j11, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f31932c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f31932c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f31932c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.h;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f31935n;
            spannableStringBuilder3.clear();
            this.f31936r.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f31932c);
            this.f31936r.append((CharSequence) formatTimerDurationFast);
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length - 1; i19++) {
                if (this.f31932c.charAt(i19) != formatTimerDurationFast.charAt(i19)) {
                    if (i18 == 0) {
                        i16 = i19;
                    }
                    i18++;
                    if (i17 != 0) {
                        gz gzVar = new gz(false);
                        if (i19 == length - 2) {
                            i17++;
                        }
                        int i20 = i17 + i15;
                        spannableStringBuilder2.setSpan(gzVar, i15, i20, 33);
                        spannableStringBuilder3.setSpan(gzVar, i15, i20, 33);
                        i17 = 0;
                    }
                } else {
                    if (i17 == 0) {
                        i15 = i19;
                    }
                    i17++;
                    if (i18 != 0) {
                        this.f31936r.setSpan(new gz(false), i16, i18 + i16, 33);
                        i18 = 0;
                    }
                }
            }
            if (i17 != 0) {
                gz gzVar2 = new gz(false);
                int i21 = i17 + i15 + 1;
                spannableStringBuilder2.setSpan(gzVar2, i15, i21, 33);
                spannableStringBuilder3.setSpan(gzVar2, i15, i21, 33);
            }
            if (i18 != 0) {
                this.f31936r.setSpan(new gz(false), i16, i18 + i16, 33);
            }
            TextPaint textPaint4 = this.f31939x;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f31937s = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.v = new StaticLayout(spannableStringBuilder3, this.f31939x, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f31938w = 1.0f;
        } else {
            if (this.f31936r == null) {
                this.f31936r = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f31936r.length() != 0 && this.f31936r.length() == formatTimerDurationFast.length()) {
                this.f31936r.replace(spannableStringBuilder.length() - 1, this.f31936r.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f31936r.length()), formatTimerDurationFast.length());
            } else {
                this.f31936r.clear();
                this.f31936r.append((CharSequence) formatTimerDurationFast);
            }
        }
        float f9 = this.f31938w;
        if (f9 != 0.0f) {
            float f10 = f9 - 0.15f;
            this.f31938w = f10;
            if (f10 < 0.0f) {
                this.f31938w = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.f31938w == 0.0f) {
            this.f31936r.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f31936r, this.f31939x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.A = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f31937s;
            float f11 = this.f31940y;
            if (staticLayout2 != null) {
                canvas.save();
                this.f31939x.setAlpha((int) ((1.0f - this.f31938w) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f31937s.getHeight() / 2.0f)) - (this.f31938w * f11));
                this.f31937s.draw(canvas);
                canvas.restore();
            }
            if (this.v != null) {
                canvas.save();
                this.f31939x.setAlpha((int) (this.f31938w * 255.0f));
                canvas.translate(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, this.f31938w, f11, measuredHeight - (this.v.getHeight() / 2.0f)));
                this.v.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.f31939x.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f31936r, this.f31939x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.A = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f31932c = formatTimerDurationFast;
        if (!this.f31930a && this.f31938w == 0.0f) {
            return;
        }
        invalidate();
    }
}

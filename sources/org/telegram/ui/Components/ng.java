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
    public float B;
    public final ChatActivityEnterView C;
    public boolean f29450a;
    public boolean f29451b;
    public String f29452c;
    public long d;
    public long f29453e;
    public long f29454f;
    public final SpannableStringBuilder h;
    public final SpannableStringBuilder f29455n;
    public SpannableStringBuilder f29456r;
    public StaticLayout f29457s;
    public StaticLayout v;
    public float f29458w;
    public TextPaint f29459x;
    public final float f29460y;

    public ng(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.C = chatActivityEnterView;
        this.h = new SpannableStringBuilder();
        this.f29455n = new SpannableStringBuilder();
        this.f29456r = new SpannableStringBuilder();
        this.f29460y = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j10) {
        this.f29450a = true;
        long currentTimeMillis = System.currentTimeMillis() - j10;
        this.d = currentTimeMillis;
        this.f29454f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f29450a) {
            this.f29450a = false;
            if (this.d > 0) {
                this.f29453e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f29454f = 0L;
    }

    public float getLeftProperty() {
        return this.B;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int threadMessageId;
        int i10;
        int i11;
        TextPaint textPaint = this.f29459x;
        ChatActivityEnterView chatActivityEnterView = this.C;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.f29459x = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.f29459x.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.f29459x;
            int i12 = org.telegram.ui.ActionBar.k6.f21849nf;
            int i13 = ChatActivityEnterView.f24570j5;
            textPaint3.setColor(chatActivityEnterView.i0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f29450a) {
            j10 = currentTimeMillis - this.d;
        } else {
            j10 = this.f29453e - this.d;
        }
        long j11 = j10 / 1000;
        int i14 = ((int) (j10 % 1000)) / 10;
        if (chatActivityEnterView.Z0 && j10 >= 59500 && !this.f29451b) {
            chatActivityEnterView.f24714z2 = -1.0f;
            eg egVar = chatActivityEnterView.V2;
            if (chatActivityEnterView.L) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            egVar.u2(3, 0, i11, chatActivityEnterView.O4, 0L, true);
            oe oeVar = chatActivityEnterView.G0;
            chatActivityEnterView.O4 = 0L;
            oeVar.setEffect(0L);
            this.f29451b = true;
        }
        if (this.f29450a && currentTimeMillis > this.f29454f + 5000) {
            this.f29454f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.N);
            long j12 = chatActivityEnterView.M2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j13 = threadMessageId;
            if (chatActivityEnterView.Z0) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j12, j13, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j11, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f29452c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f29452c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f29452c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.h;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f29455n;
            spannableStringBuilder3.clear();
            this.f29456r.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f29452c);
            this.f29456r.append((CharSequence) formatTimerDurationFast);
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length - 1; i19++) {
                if (this.f29452c.charAt(i19) != formatTimerDurationFast.charAt(i19)) {
                    if (i18 == 0) {
                        i16 = i19;
                    }
                    i18++;
                    if (i17 != 0) {
                        nz nzVar = new nz(false);
                        if (i19 == length - 2) {
                            i17++;
                        }
                        int i20 = i17 + i15;
                        spannableStringBuilder2.setSpan(nzVar, i15, i20, 33);
                        spannableStringBuilder3.setSpan(nzVar, i15, i20, 33);
                        i17 = 0;
                    }
                } else {
                    if (i17 == 0) {
                        i15 = i19;
                    }
                    i17++;
                    if (i18 != 0) {
                        this.f29456r.setSpan(new nz(false), i16, i18 + i16, 33);
                        i18 = 0;
                    }
                }
            }
            if (i17 != 0) {
                nz nzVar2 = new nz(false);
                int i21 = i17 + i15 + 1;
                spannableStringBuilder2.setSpan(nzVar2, i15, i21, 33);
                spannableStringBuilder3.setSpan(nzVar2, i15, i21, 33);
            }
            if (i18 != 0) {
                this.f29456r.setSpan(new nz(false), i16, i18 + i16, 33);
            }
            TextPaint textPaint4 = this.f29459x;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f29457s = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.v = new StaticLayout(spannableStringBuilder3, this.f29459x, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f29458w = 1.0f;
        } else {
            if (this.f29456r == null) {
                this.f29456r = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f29456r.length() != 0 && this.f29456r.length() == formatTimerDurationFast.length()) {
                this.f29456r.replace(spannableStringBuilder.length() - 1, this.f29456r.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f29456r.length()), formatTimerDurationFast.length());
            } else {
                this.f29456r.clear();
                this.f29456r.append((CharSequence) formatTimerDurationFast);
            }
        }
        float f10 = this.f29458w;
        if (f10 != 0.0f) {
            float f11 = f10 - 0.15f;
            this.f29458w = f11;
            if (f11 < 0.0f) {
                this.f29458w = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.f29458w == 0.0f) {
            this.f29456r.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f29456r, this.f29459x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.B = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f29457s;
            float f12 = this.f29460y;
            if (staticLayout2 != null) {
                canvas.save();
                this.f29459x.setAlpha((int) ((1.0f - this.f29458w) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f29457s.getHeight() / 2.0f)) - (this.f29458w * f12));
                this.f29457s.draw(canvas);
                canvas.restore();
            }
            if (this.v != null) {
                canvas.save();
                this.f29459x.setAlpha((int) (this.f29458w * 255.0f));
                canvas.translate(0.0f, e2.c.w(1.0f, this.f29458w, f12, measuredHeight - (this.v.getHeight() / 2.0f)));
                this.v.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.f29459x.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f29456r, this.f29459x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.B = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f29452c = formatTimerDurationFast;
        if (!this.f29450a && this.f29458w == 0.0f) {
            return;
        }
        invalidate();
    }
}

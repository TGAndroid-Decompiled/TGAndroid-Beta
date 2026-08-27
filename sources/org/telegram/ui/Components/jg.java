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

public final class jg extends View {
    public float A;
    public final ChatActivityEnterView B;

    public boolean f29683a;

    public boolean f29684b;

    public String f29685c;
    public long d;

    public long f29686e;

    public long f29687f;
    public final SpannableStringBuilder h;

    public final SpannableStringBuilder f29688n;

    public SpannableStringBuilder f29689r;

    public StaticLayout f29690s;
    public StaticLayout v;

    public float f29691w;

    public TextPaint f29692x;

    public final float f29693y;

    public jg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.B = chatActivityEnterView;
        this.h = new SpannableStringBuilder();
        this.f29688n = new SpannableStringBuilder();
        this.f29689r = new SpannableStringBuilder();
        this.f29693y = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j10) {
        this.f29683a = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - j10;
        this.d = jCurrentTimeMillis;
        this.f29687f = jCurrentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f29683a) {
            this.f29683a = false;
            if (this.d > 0) {
                this.f29686e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f29687f = 0L;
    }

    public float getLeftProperty() {
        return this.A;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        String str;
        TextPaint textPaint = this.f29692x;
        ChatActivityEnterView chatActivityEnterView = this.B;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.f29692x = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.f29692x.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.f29692x;
            int i10 = org.telegram.ui.ActionBar.g6.nf;
            int i11 = ChatActivityEnterView.f26070i5;
            textPaint3.setColor(chatActivityEnterView.i0(i10));
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f29683a ? jCurrentTimeMillis - this.d : this.f29686e - this.d;
        long j11 = j10 / 1000;
        int i12 = ((int) (j10 % 1000)) / 10;
        if (chatActivityEnterView.Y0 && j10 >= 59500 && !this.f29684b) {
            chatActivityEnterView.f26207y2 = -1.0f;
            chatActivityEnterView.U2.X1(3, 0, chatActivityEnterView.K ? Integer.MAX_VALUE : 0, chatActivityEnterView.N4, 0L, true);
            ke keVar = chatActivityEnterView.F0;
            chatActivityEnterView.N4 = 0L;
            keVar.setEffect(0L);
            this.f29684b = true;
        }
        if (this.f29683a && jCurrentTimeMillis > this.f29687f + 5000) {
            this.f29687f = jCurrentTimeMillis;
            MessagesController.getInstance(chatActivityEnterView.M).sendTyping(chatActivityEnterView.L2, chatActivityEnterView.getThreadMessageId(), chatActivityEnterView.Y0 ? 7 : 1, 0);
        }
        String timerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j11, i12);
        if (timerDurationFast.length() < 3 || (str = this.f29685c) == null || str.length() < 3 || timerDurationFast.length() != this.f29685c.length() || timerDurationFast.charAt(timerDurationFast.length() - 3) == this.f29685c.charAt(timerDurationFast.length() - 3)) {
            if (this.f29689r == null) {
                this.f29689r = new SpannableStringBuilder(timerDurationFast);
            }
            if (this.f29689r.length() == 0 || this.f29689r.length() != timerDurationFast.length()) {
                this.f29689r.clear();
                this.f29689r.append((CharSequence) timerDurationFast);
            } else {
                SpannableStringBuilder spannableStringBuilder = this.f29689r;
                spannableStringBuilder.replace(spannableStringBuilder.length() - 1, this.f29689r.length(), (CharSequence) timerDurationFast, (timerDurationFast.length() - 1) - (timerDurationFast.length() - this.f29689r.length()), timerDurationFast.length());
            }
        } else {
            int length = timerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.h;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f29688n;
            spannableStringBuilder3.clear();
            this.f29689r.clear();
            spannableStringBuilder2.append((CharSequence) timerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f29685c);
            this.f29689r.append((CharSequence) timerDurationFast);
            int i13 = -1;
            int i14 = -1;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < length - 1; i17++) {
                if (this.f29685c.charAt(i17) != timerDurationFast.charAt(i17)) {
                    if (i16 == 0) {
                        i14 = i17;
                    }
                    i16++;
                    if (i15 != 0) {
                        zy zyVar = new zy(false);
                        if (i17 == length - 2) {
                            i15++;
                        }
                        int i18 = i15 + i13;
                        spannableStringBuilder2.setSpan(zyVar, i13, i18, 33);
                        spannableStringBuilder3.setSpan(zyVar, i13, i18, 33);
                        i15 = 0;
                    }
                } else {
                    if (i15 == 0) {
                        i13 = i17;
                    }
                    i15++;
                    if (i16 != 0) {
                        this.f29689r.setSpan(new zy(false), i14, i16 + i14, 33);
                        i16 = 0;
                    }
                }
            }
            if (i15 != 0) {
                zy zyVar2 = new zy(false);
                int i19 = i15 + i13 + 1;
                spannableStringBuilder2.setSpan(zyVar2, i13, i19, 33);
                spannableStringBuilder3.setSpan(zyVar2, i13, i19, 33);
            }
            if (i16 != 0) {
                this.f29689r.setSpan(new zy(false), i14, i16 + i14, 33);
            }
            TextPaint textPaint4 = this.f29692x;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f29690s = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.v = new StaticLayout(spannableStringBuilder3, this.f29692x, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f29691w = 1.0f;
        }
        float f10 = this.f29691w;
        if (f10 != 0.0f) {
            float f11 = f10 - 0.15f;
            this.f29691w = f11;
            if (f11 < 0.0f) {
                this.f29691w = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.f29691w == 0.0f) {
            this.f29689r.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f29689r, this.f29692x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.A = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f29690s;
            float f12 = this.f29693y;
            if (staticLayout2 != null) {
                canvas.save();
                this.f29692x.setAlpha((int) ((1.0f - this.f29691w) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f29690s.getHeight() / 2.0f)) - (this.f29691w * f12));
                this.f29690s.draw(canvas);
                canvas.restore();
            }
            if (this.v != null) {
                canvas.save();
                this.f29692x.setAlpha((int) (this.f29691w * 255.0f));
                canvas.translate(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, this.f29691w, f12, measuredHeight - (this.v.getHeight() / 2.0f)));
                this.v.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.f29692x.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f29689r, this.f29692x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.A = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f29685c = timerDurationFast;
        if (this.f29683a || this.f29691w != 0.0f) {
            invalidate();
        }
    }
}

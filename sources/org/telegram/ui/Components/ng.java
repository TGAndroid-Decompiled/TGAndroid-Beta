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
    public boolean f27271a;
    public boolean f27272b;
    public String f27273c;
    public long d;
    public long e;
    public long f27274f;
    public final SpannableStringBuilder h;
    public final SpannableStringBuilder f27275n;
    public SpannableStringBuilder f27276r;
    public StaticLayout f27277s;
    public StaticLayout v;
    public float f27278w;
    public TextPaint f27279x;
    public final float f27280y;

    public ng(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.C = chatActivityEnterView;
        this.h = new SpannableStringBuilder();
        this.f27275n = new SpannableStringBuilder();
        this.f27276r = new SpannableStringBuilder();
        this.f27280y = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j10) {
        this.f27271a = true;
        long currentTimeMillis = System.currentTimeMillis() - j10;
        this.d = currentTimeMillis;
        this.f27274f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f27271a) {
            this.f27271a = false;
            if (this.d > 0) {
                this.e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f27274f = 0L;
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
        TextPaint textPaint = this.f27279x;
        ChatActivityEnterView chatActivityEnterView = this.C;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.f27279x = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.f27279x.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.f27279x;
            int i12 = org.telegram.ui.ActionBar.j6.f20093nf;
            int i13 = ChatActivityEnterView.f22729j5;
            textPaint3.setColor(chatActivityEnterView.i0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f27271a) {
            j10 = currentTimeMillis - this.d;
        } else {
            j10 = this.e - this.d;
        }
        long j11 = j10 / 1000;
        int i14 = ((int) (j10 % 1000)) / 10;
        if (chatActivityEnterView.Z0 && j10 >= 59500 && !this.f27272b) {
            chatActivityEnterView.f22872z2 = -1.0f;
            eg egVar = chatActivityEnterView.V2;
            if (chatActivityEnterView.L) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            egVar.o2(3, 0, i11, chatActivityEnterView.O4, 0L, true);
            oe oeVar = chatActivityEnterView.G0;
            chatActivityEnterView.O4 = 0L;
            oeVar.setEffect(0L);
            this.f27272b = true;
        }
        if (this.f27271a && currentTimeMillis > this.f27274f + 5000) {
            this.f27274f = currentTimeMillis;
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
        if (formatTimerDurationFast.length() >= 3 && (str = this.f27273c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f27273c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f27273c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.h;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f27275n;
            spannableStringBuilder3.clear();
            this.f27276r.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f27273c);
            this.f27276r.append((CharSequence) formatTimerDurationFast);
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length - 1; i19++) {
                if (this.f27273c.charAt(i19) != formatTimerDurationFast.charAt(i19)) {
                    if (i18 == 0) {
                        i16 = i19;
                    }
                    i18++;
                    if (i17 != 0) {
                        lz lzVar = new lz(false);
                        if (i19 == length - 2) {
                            i17++;
                        }
                        int i20 = i17 + i15;
                        spannableStringBuilder2.setSpan(lzVar, i15, i20, 33);
                        spannableStringBuilder3.setSpan(lzVar, i15, i20, 33);
                        i17 = 0;
                    }
                } else {
                    if (i17 == 0) {
                        i15 = i19;
                    }
                    i17++;
                    if (i18 != 0) {
                        this.f27276r.setSpan(new lz(false), i16, i18 + i16, 33);
                        i18 = 0;
                    }
                }
            }
            if (i17 != 0) {
                lz lzVar2 = new lz(false);
                int i21 = i17 + i15 + 1;
                spannableStringBuilder2.setSpan(lzVar2, i15, i21, 33);
                spannableStringBuilder3.setSpan(lzVar2, i15, i21, 33);
            }
            if (i18 != 0) {
                this.f27276r.setSpan(new lz(false), i16, i18 + i16, 33);
            }
            TextPaint textPaint4 = this.f27279x;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f27277s = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.v = new StaticLayout(spannableStringBuilder3, this.f27279x, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f27278w = 1.0f;
        } else {
            if (this.f27276r == null) {
                this.f27276r = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f27276r.length() != 0 && this.f27276r.length() == formatTimerDurationFast.length()) {
                this.f27276r.replace(spannableStringBuilder.length() - 1, this.f27276r.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f27276r.length()), formatTimerDurationFast.length());
            } else {
                this.f27276r.clear();
                this.f27276r.append((CharSequence) formatTimerDurationFast);
            }
        }
        float f10 = this.f27278w;
        if (f10 != 0.0f) {
            float f11 = f10 - 0.15f;
            this.f27278w = f11;
            if (f11 < 0.0f) {
                this.f27278w = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.f27278w == 0.0f) {
            this.f27276r.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f27276r, this.f27279x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.B = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f27277s;
            float f12 = this.f27280y;
            if (staticLayout2 != null) {
                canvas.save();
                this.f27279x.setAlpha((int) ((1.0f - this.f27278w) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f27277s.getHeight() / 2.0f)) - (this.f27278w * f12));
                this.f27277s.draw(canvas);
                canvas.restore();
            }
            if (this.v != null) {
                canvas.save();
                this.f27279x.setAlpha((int) (this.f27278w * 255.0f));
                canvas.translate(0.0f, e2.c.w(1.0f, this.f27278w, f12, measuredHeight - (this.v.getHeight() / 2.0f)));
                this.v.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.f27279x.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f27276r, this.f27279x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.B = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f27273c = formatTimerDurationFast;
        if (!this.f27271a && this.f27278w == 0.0f) {
            return;
        }
        invalidate();
    }
}

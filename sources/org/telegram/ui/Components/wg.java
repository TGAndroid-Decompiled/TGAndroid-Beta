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
public final class wg extends View {
    public float E;
    public final ChatActivityEnterView F;
    public boolean f30035a;
    public boolean f30036b;
    public String f30037c;
    public long d;
    public long e;
    public long f30038f;
    public final SpannableStringBuilder h;
    public final SpannableStringBuilder f30039n;
    public SpannableStringBuilder f30040r;
    public StaticLayout f30041s;
    public StaticLayout v;
    public float f30042w;
    public TextPaint f30043x;
    public final float f30044y;

    public wg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.F = chatActivityEnterView;
        this.h = new SpannableStringBuilder();
        this.f30039n = new SpannableStringBuilder();
        this.f30040r = new SpannableStringBuilder();
        this.f30044y = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j3) {
        this.f30035a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.f30038f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f30035a) {
            this.f30035a = false;
            if (this.d > 0) {
                this.e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f30038f = 0L;
    }

    public float getLeftProperty() {
        return this.E;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        SpannableStringBuilder spannableStringBuilder;
        String str;
        int threadMessageId;
        int i10;
        int i11;
        TextPaint textPaint = this.f30043x;
        ChatActivityEnterView chatActivityEnterView = this.F;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.f30043x = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.f30043x.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.f30043x;
            int i12 = org.telegram.ui.ActionBar.j6.f19253nf;
            int i13 = ChatActivityEnterView.f21917m5;
            textPaint3.setColor(chatActivityEnterView.i0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f30035a) {
            j3 = currentTimeMillis - this.d;
        } else {
            j3 = this.e - this.d;
        }
        long j10 = j3 / 1000;
        int i14 = ((int) (j3 % 1000)) / 10;
        if (chatActivityEnterView.f21933c1 && j3 >= 59500 && !this.f30036b) {
            chatActivityEnterView.C2 = -1.0f;
            ng ngVar = chatActivityEnterView.Y2;
            if (chatActivityEnterView.O) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            ngVar.k2(3, 0, i11, chatActivityEnterView.R4, 0L, true);
            xe xeVar = chatActivityEnterView.J0;
            chatActivityEnterView.R4 = 0L;
            xeVar.setEffect(0L);
            this.f30036b = true;
        }
        if (this.f30035a && currentTimeMillis > this.f30038f + 5000) {
            this.f30038f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j11 = chatActivityEnterView.P2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j12 = threadMessageId;
            if (chatActivityEnterView.f21933c1) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j11, j12, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j10, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f30037c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f30037c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f30037c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.h;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f30039n;
            spannableStringBuilder3.clear();
            this.f30040r.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f30037c);
            this.f30040r.append((CharSequence) formatTimerDurationFast);
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length - 1; i19++) {
                if (this.f30037c.charAt(i19) != formatTimerDurationFast.charAt(i19)) {
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
                        this.f30040r.setSpan(new lz(false), i16, i18 + i16, 33);
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
                this.f30040r.setSpan(new lz(false), i16, i18 + i16, 33);
            }
            TextPaint textPaint4 = this.f30043x;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f30041s = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.v = new StaticLayout(spannableStringBuilder3, this.f30043x, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f30042w = 1.0f;
        } else {
            if (this.f30040r == null) {
                this.f30040r = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f30040r.length() != 0 && this.f30040r.length() == formatTimerDurationFast.length()) {
                this.f30040r.replace(spannableStringBuilder.length() - 1, this.f30040r.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f30040r.length()), formatTimerDurationFast.length());
            } else {
                this.f30040r.clear();
                this.f30040r.append((CharSequence) formatTimerDurationFast);
            }
        }
        float f7 = this.f30042w;
        if (f7 != 0.0f) {
            float f10 = f7 - 0.15f;
            this.f30042w = f10;
            if (f10 < 0.0f) {
                this.f30042w = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.f30042w == 0.0f) {
            this.f30040r.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f30040r, this.f30043x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.E = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f30041s;
            float f11 = this.f30044y;
            if (staticLayout2 != null) {
                canvas.save();
                this.f30043x.setAlpha((int) ((1.0f - this.f30042w) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f30041s.getHeight() / 2.0f)) - (this.f30042w * f11));
                this.f30041s.draw(canvas);
                canvas.restore();
            }
            if (this.v != null) {
                canvas.save();
                this.f30043x.setAlpha((int) (this.f30042w * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, this.f30042w, f11, measuredHeight - (this.v.getHeight() / 2.0f)));
                this.v.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.f30043x.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f30040r, this.f30043x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.E = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f30037c = formatTimerDurationFast;
        if (!this.f30035a && this.f30042w == 0.0f) {
            return;
        }
        invalidate();
    }
}

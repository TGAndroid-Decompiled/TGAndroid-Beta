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
    public boolean f30039a;
    public boolean f30040b;
    public String f30041c;
    public long d;
    public long e;
    public long f30042f;
    public final SpannableStringBuilder h;
    public final SpannableStringBuilder f30043n;
    public SpannableStringBuilder f30044r;
    public StaticLayout f30045s;
    public StaticLayout v;
    public float f30046w;
    public TextPaint f30047x;
    public final float f30048y;

    public wg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.F = chatActivityEnterView;
        this.h = new SpannableStringBuilder();
        this.f30043n = new SpannableStringBuilder();
        this.f30044r = new SpannableStringBuilder();
        this.f30048y = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j3) {
        this.f30039a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.f30042f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f30039a) {
            this.f30039a = false;
            if (this.d > 0) {
                this.e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f30042f = 0L;
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
        TextPaint textPaint = this.f30047x;
        ChatActivityEnterView chatActivityEnterView = this.F;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.f30047x = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.f30047x.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.f30047x;
            int i12 = org.telegram.ui.ActionBar.j6.f19285nf;
            int i13 = ChatActivityEnterView.f21952m5;
            textPaint3.setColor(chatActivityEnterView.i0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f30039a) {
            j3 = currentTimeMillis - this.d;
        } else {
            j3 = this.e - this.d;
        }
        long j10 = j3 / 1000;
        int i14 = ((int) (j3 % 1000)) / 10;
        if (chatActivityEnterView.f21968c1 && j3 >= 59500 && !this.f30040b) {
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
            this.f30040b = true;
        }
        if (this.f30039a && currentTimeMillis > this.f30042f + 5000) {
            this.f30042f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j11 = chatActivityEnterView.P2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j12 = threadMessageId;
            if (chatActivityEnterView.f21968c1) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j11, j12, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j10, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f30041c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f30041c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f30041c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.h;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f30043n;
            spannableStringBuilder3.clear();
            this.f30044r.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f30041c);
            this.f30044r.append((CharSequence) formatTimerDurationFast);
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length - 1; i19++) {
                if (this.f30041c.charAt(i19) != formatTimerDurationFast.charAt(i19)) {
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
                        this.f30044r.setSpan(new lz(false), i16, i18 + i16, 33);
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
                this.f30044r.setSpan(new lz(false), i16, i18 + i16, 33);
            }
            TextPaint textPaint4 = this.f30047x;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f30045s = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.v = new StaticLayout(spannableStringBuilder3, this.f30047x, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f30046w = 1.0f;
        } else {
            if (this.f30044r == null) {
                this.f30044r = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f30044r.length() != 0 && this.f30044r.length() == formatTimerDurationFast.length()) {
                this.f30044r.replace(spannableStringBuilder.length() - 1, this.f30044r.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f30044r.length()), formatTimerDurationFast.length());
            } else {
                this.f30044r.clear();
                this.f30044r.append((CharSequence) formatTimerDurationFast);
            }
        }
        float f7 = this.f30046w;
        if (f7 != 0.0f) {
            float f10 = f7 - 0.15f;
            this.f30046w = f10;
            if (f10 < 0.0f) {
                this.f30046w = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.f30046w == 0.0f) {
            this.f30044r.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f30044r, this.f30047x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.E = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f30045s;
            float f11 = this.f30048y;
            if (staticLayout2 != null) {
                canvas.save();
                this.f30047x.setAlpha((int) ((1.0f - this.f30046w) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f30045s.getHeight() / 2.0f)) - (this.f30046w * f11));
                this.f30045s.draw(canvas);
                canvas.restore();
            }
            if (this.v != null) {
                canvas.save();
                this.f30047x.setAlpha((int) (this.f30046w * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, this.f30046w, f11, measuredHeight - (this.v.getHeight() / 2.0f)));
                this.v.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.f30047x.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f30044r, this.f30047x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.E = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f30041c = formatTimerDurationFast;
        if (!this.f30039a && this.f30046w == 0.0f) {
            return;
        }
        invalidate();
    }
}

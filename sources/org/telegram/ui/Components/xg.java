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
public final class xg extends View {
    public float E;
    public final ChatActivityEnterView F;
    public boolean f32550a;
    public boolean f32551b;
    public String f32552c;
    public long d;
    public long f32553e;
    public long f32554f;
    public final SpannableStringBuilder h;
    public final SpannableStringBuilder f32555n;
    public SpannableStringBuilder f32556r;
    public StaticLayout f32557s;
    public StaticLayout v;
    public float f32558w;
    public TextPaint f32559x;
    public final float f32560y;

    public xg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.F = chatActivityEnterView;
        this.h = new SpannableStringBuilder();
        this.f32555n = new SpannableStringBuilder();
        this.f32556r = new SpannableStringBuilder();
        this.f32560y = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j3) {
        this.f32550a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.f32554f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f32550a) {
            this.f32550a = false;
            if (this.d > 0) {
                this.f32553e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f32554f = 0L;
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
        TextPaint textPaint = this.f32559x;
        ChatActivityEnterView chatActivityEnterView = this.F;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.f32559x = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.f32559x.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.f32559x;
            int i12 = org.telegram.ui.ActionBar.j6.f20879nf;
            int i13 = ChatActivityEnterView.f23688m5;
            textPaint3.setColor(chatActivityEnterView.i0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f32550a) {
            j3 = currentTimeMillis - this.d;
        } else {
            j3 = this.f32553e - this.d;
        }
        long j10 = j3 / 1000;
        int i14 = ((int) (j3 % 1000)) / 10;
        if (chatActivityEnterView.f23704c1 && j3 >= 59500 && !this.f32551b) {
            chatActivityEnterView.C2 = -1.0f;
            og ogVar = chatActivityEnterView.Y2;
            if (chatActivityEnterView.O) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            ogVar.c2(3, 0, i11, chatActivityEnterView.R4, 0L, true);
            ye yeVar = chatActivityEnterView.J0;
            chatActivityEnterView.R4 = 0L;
            yeVar.setEffect(0L);
            this.f32551b = true;
        }
        if (this.f32550a && currentTimeMillis > this.f32554f + 5000) {
            this.f32554f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j11 = chatActivityEnterView.P2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j12 = threadMessageId;
            if (chatActivityEnterView.f23704c1) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j11, j12, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j10, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f32552c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f32552c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f32552c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.h;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f32555n;
            spannableStringBuilder3.clear();
            this.f32556r.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f32552c);
            this.f32556r.append((CharSequence) formatTimerDurationFast);
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length - 1; i19++) {
                if (this.f32552c.charAt(i19) != formatTimerDurationFast.charAt(i19)) {
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
                        this.f32556r.setSpan(new lz(false), i16, i18 + i16, 33);
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
                this.f32556r.setSpan(new lz(false), i16, i18 + i16, 33);
            }
            TextPaint textPaint4 = this.f32559x;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f32557s = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.v = new StaticLayout(spannableStringBuilder3, this.f32559x, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f32558w = 1.0f;
        } else {
            if (this.f32556r == null) {
                this.f32556r = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f32556r.length() != 0 && this.f32556r.length() == formatTimerDurationFast.length()) {
                this.f32556r.replace(spannableStringBuilder.length() - 1, this.f32556r.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f32556r.length()), formatTimerDurationFast.length());
            } else {
                this.f32556r.clear();
                this.f32556r.append((CharSequence) formatTimerDurationFast);
            }
        }
        float f7 = this.f32558w;
        if (f7 != 0.0f) {
            float f10 = f7 - 0.15f;
            this.f32558w = f10;
            if (f10 < 0.0f) {
                this.f32558w = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.f32558w == 0.0f) {
            this.f32556r.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f32556r, this.f32559x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.E = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f32557s;
            float f11 = this.f32560y;
            if (staticLayout2 != null) {
                canvas.save();
                this.f32559x.setAlpha((int) ((1.0f - this.f32558w) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f32557s.getHeight() / 2.0f)) - (this.f32558w * f11));
                this.f32557s.draw(canvas);
                canvas.restore();
            }
            if (this.v != null) {
                canvas.save();
                this.f32559x.setAlpha((int) (this.f32558w * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, this.f32558w, f11, measuredHeight - (this.v.getHeight() / 2.0f)));
                this.v.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.f32559x.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f32556r, this.f32559x, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.E = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f32552c = formatTimerDurationFast;
        if (!this.f32550a && this.f32558w == 0.0f) {
            return;
        }
        invalidate();
    }
}

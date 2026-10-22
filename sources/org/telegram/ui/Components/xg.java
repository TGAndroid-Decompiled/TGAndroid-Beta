package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
public final class xg extends View {
    public float E;
    public TextPaint F;
    public final float G;
    public float H;
    public final ChatActivityEnterView I;
    public boolean f32412a;
    public boolean f32413b;
    public String f32414c;
    public long d;
    public long e;
    public long f32415f;
    public long h;
    public long f32416n;
    public boolean f32417r;
    public final SpannableStringBuilder f32418s;
    public final SpannableStringBuilder v;
    public SpannableStringBuilder f32419w;
    public StaticLayout f32420x;
    public StaticLayout f32421y;

    public xg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.f32418s = new SpannableStringBuilder();
        this.v = new SpannableStringBuilder();
        this.f32419w = new SpannableStringBuilder();
        this.G = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j10) {
        this.f32412a = true;
        long currentTimeMillis = System.currentTimeMillis() - j10;
        this.d = currentTimeMillis;
        this.h = j10;
        this.f32415f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f32412a) {
            this.f32412a = false;
            if (this.d > 0) {
                this.e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f32415f = 0L;
    }

    public float getLeftProperty() {
        return this.H;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        long j11;
        SpannableStringBuilder spannableStringBuilder;
        long min;
        String str;
        int threadMessageId;
        int i10;
        int i11;
        TextPaint textPaint = this.F;
        ChatActivityEnterView chatActivityEnterView = this.I;
        boolean z10 = true;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.F = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.F.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.F;
            int i12 = org.telegram.ui.ActionBar.h6.f21185nf;
            int i13 = ChatActivityEnterView.f23911n5;
            textPaint3.setColor(chatActivityEnterView.g0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f32412a) {
            if (this.f32417r) {
                j10 = this.h;
            } else {
                j10 = currentTimeMillis - this.d;
            }
        } else {
            j10 = this.e - this.d;
        }
        long j12 = j10 / 1000;
        int i14 = ((int) (j10 % 1000)) / 10;
        long j13 = 0;
        if (chatActivityEnterView.f23927c1 && j10 >= 59500 && !this.f32413b) {
            chatActivityEnterView.D2 = -1.0f;
            og ogVar = chatActivityEnterView.Z2;
            if (chatActivityEnterView.O) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            ogVar.a2(3, 0, i11, chatActivityEnterView.S4, 0L, true);
            xe xeVar = chatActivityEnterView.J0;
            chatActivityEnterView.S4 = 0L;
            xeVar.setEffect(0L);
            this.f32413b = true;
        }
        if (this.f32412a && currentTimeMillis > this.f32415f + 5000) {
            this.f32415f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j14 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j15 = threadMessageId;
            if (chatActivityEnterView.f23927c1) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j14, j15, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j12, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f32414c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f32414c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f32414c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.f32418s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.v;
            spannableStringBuilder3.clear();
            this.f32419w.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f32414c);
            this.f32419w.append((CharSequence) formatTimerDurationFast);
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                boolean z11 = z10;
                j11 = j13;
                if (i17 >= length - 1) {
                    break;
                }
                if (this.f32414c.charAt(i17) != formatTimerDurationFast.charAt(i17)) {
                    if (i19 == 0) {
                        i16 = i17;
                    }
                    i19++;
                    if (i18 != 0) {
                        uz uzVar = new uz(false);
                        if (i17 == length - 2) {
                            i18++;
                        }
                        int i20 = i18 + i15;
                        spannableStringBuilder2.setSpan(uzVar, i15, i20, 33);
                        spannableStringBuilder3.setSpan(uzVar, i15, i20, 33);
                        i18 = 0;
                    }
                } else {
                    if (i18 == 0) {
                        i15 = i17;
                    }
                    i18++;
                    if (i19 != 0) {
                        this.f32419w.setSpan(new uz(false), i16, i19 + i16, 33);
                        i19 = 0;
                    }
                }
                i17++;
                z10 = z11;
                j13 = j11;
            }
            if (i18 != 0) {
                uz uzVar2 = new uz(false);
                int i21 = i18 + i15 + 1;
                spannableStringBuilder2.setSpan(uzVar2, i15, i21, 33);
                spannableStringBuilder3.setSpan(uzVar2, i15, i21, 33);
            }
            if (i19 != 0) {
                this.f32419w.setSpan(new uz(false), i16, i19 + i16, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f32420x = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f32421y = new StaticLayout(spannableStringBuilder3, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        } else {
            j11 = 0;
            if (this.f32419w == null) {
                this.f32419w = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f32419w.length() != 0 && this.f32419w.length() == formatTimerDurationFast.length()) {
                this.f32419w.replace(spannableStringBuilder.length() - 1, this.f32419w.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f32419w.length()), formatTimerDurationFast.length());
            } else {
                this.f32419w.clear();
                this.f32419w.append((CharSequence) formatTimerDurationFast);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j16 = this.f32416n;
        if (j16 == j11) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j16);
        }
        this.f32416n = elapsedRealtime;
        float f7 = this.E;
        if (f7 != 0.0f) {
            float f10 = f7 - (((float) min) / 116.0f);
            this.E = f10;
            if (f10 < 0.0f) {
                this.E = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.E == 0.0f) {
            this.f32419w.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f32419w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f32420x;
            float f11 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f32420x.getHeight() / 2.0f)) - (this.E * f11));
                this.f32420x.draw(canvas);
                canvas.restore();
            }
            if (this.f32421y != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.play_billing.k3.y(1.0f, this.E, f11, measuredHeight - (this.f32421y.getHeight() / 2.0f)));
                this.f32421y.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f32419w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.H = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f32414c = formatTimerDurationFast;
        if ((this.f32412a || this.E != 0.0f) && !this.f32417r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.f32417r = z10;
        this.f32416n = SystemClock.elapsedRealtime();
        invalidate();
    }
}

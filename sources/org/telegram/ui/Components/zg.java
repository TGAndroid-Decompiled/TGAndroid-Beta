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
public final class zg extends View {
    public float E;
    public TextPaint F;
    public final float G;
    public float H;
    public final ChatActivityEnterView I;
    public boolean f33504a;
    public boolean f33505b;
    public String f33506c;
    public long d;
    public long f33507e;
    public long f33508f;
    public long h;
    public long f33509n;
    public boolean f33510r;
    public final SpannableStringBuilder f33511s;
    public final SpannableStringBuilder v;
    public SpannableStringBuilder f33512w;
    public StaticLayout f33513x;
    public StaticLayout f33514y;

    public zg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.f33511s = new SpannableStringBuilder();
        this.v = new SpannableStringBuilder();
        this.f33512w = new SpannableStringBuilder();
        this.G = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j3) {
        this.f33504a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.h = j3;
        this.f33508f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f33504a) {
            this.f33504a = false;
            if (this.d > 0) {
                this.f33507e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f33508f = 0L;
    }

    public float getLeftProperty() {
        return this.H;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        long j10;
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
            int i12 = org.telegram.ui.ActionBar.h6.f20978nf;
            int i13 = ChatActivityEnterView.f23842n5;
            textPaint3.setColor(chatActivityEnterView.g0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f33504a) {
            if (this.f33510r) {
                j3 = this.h;
            } else {
                j3 = currentTimeMillis - this.d;
            }
        } else {
            j3 = this.f33507e - this.d;
        }
        long j11 = j3 / 1000;
        int i14 = ((int) (j3 % 1000)) / 10;
        long j12 = 0;
        if (chatActivityEnterView.f23858c1 && j3 >= 59500 && !this.f33505b) {
            chatActivityEnterView.D2 = -1.0f;
            qg qgVar = chatActivityEnterView.Z2;
            if (chatActivityEnterView.O) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            qgVar.q2(3, 0, i11, chatActivityEnterView.S4, 0L, true);
            af afVar = chatActivityEnterView.J0;
            chatActivityEnterView.S4 = 0L;
            afVar.setEffect(0L);
            this.f33505b = true;
        }
        if (this.f33504a && currentTimeMillis > this.f33508f + 5000) {
            this.f33508f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j13 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j14 = threadMessageId;
            if (chatActivityEnterView.f23858c1) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j13, j14, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j11, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f33506c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f33506c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f33506c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.f33511s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.v;
            spannableStringBuilder3.clear();
            this.f33512w.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f33506c);
            this.f33512w.append((CharSequence) formatTimerDurationFast);
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                boolean z11 = z10;
                j10 = j12;
                if (i17 >= length - 1) {
                    break;
                }
                if (this.f33506c.charAt(i17) != formatTimerDurationFast.charAt(i17)) {
                    if (i19 == 0) {
                        i16 = i17;
                    }
                    i19++;
                    if (i18 != 0) {
                        c00 c00Var = new c00(false);
                        if (i17 == length - 2) {
                            i18++;
                        }
                        int i20 = i18 + i15;
                        spannableStringBuilder2.setSpan(c00Var, i15, i20, 33);
                        spannableStringBuilder3.setSpan(c00Var, i15, i20, 33);
                        i18 = 0;
                    }
                } else {
                    if (i18 == 0) {
                        i15 = i17;
                    }
                    i18++;
                    if (i19 != 0) {
                        this.f33512w.setSpan(new c00(false), i16, i19 + i16, 33);
                        i19 = 0;
                    }
                }
                i17++;
                z10 = z11;
                j12 = j10;
            }
            if (i18 != 0) {
                c00 c00Var2 = new c00(false);
                int i21 = i18 + i15 + 1;
                spannableStringBuilder2.setSpan(c00Var2, i15, i21, 33);
                spannableStringBuilder3.setSpan(c00Var2, i15, i21, 33);
            }
            if (i19 != 0) {
                this.f33512w.setSpan(new c00(false), i16, i19 + i16, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f33513x = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f33514y = new StaticLayout(spannableStringBuilder3, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        } else {
            j10 = 0;
            if (this.f33512w == null) {
                this.f33512w = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f33512w.length() != 0 && this.f33512w.length() == formatTimerDurationFast.length()) {
                this.f33512w.replace(spannableStringBuilder.length() - 1, this.f33512w.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f33512w.length()), formatTimerDurationFast.length());
            } else {
                this.f33512w.clear();
                this.f33512w.append((CharSequence) formatTimerDurationFast);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j15 = this.f33509n;
        if (j15 == j10) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j15);
        }
        this.f33509n = elapsedRealtime;
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
            this.f33512w.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f33512w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f33513x;
            float f11 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f33513x.getHeight() / 2.0f)) - (this.E * f11));
                this.f33513x.draw(canvas);
                canvas.restore();
            }
            if (this.f33514y != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.y(1.0f, this.E, f11, measuredHeight - (this.f33514y.getHeight() / 2.0f)));
                this.f33514y.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f33512w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.H = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f33506c = formatTimerDurationFast;
        if ((this.f33504a || this.E != 0.0f) && !this.f33510r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.f33510r = z10;
        this.f33509n = SystemClock.elapsedRealtime();
        invalidate();
    }
}

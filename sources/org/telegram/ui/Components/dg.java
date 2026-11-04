package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
public final class dg extends View {
    public StaticLayout E;
    public float F;
    public TextPaint G;
    public final float H;
    public float I;
    public final ChatActivityEnterView J;
    public boolean f33086a;
    public boolean f33087b;
    public String f33088c;
    public long d;
    public long f33089e;
    public long f33090f;
    public long h;
    public long f33091n;
    public boolean f33092r;
    public final SpannableStringBuilder f33093s;
    public final SpannableStringBuilder f33094w;
    public SpannableStringBuilder f33095x;
    public StaticLayout f33096y;

    public dg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.J = chatActivityEnterView;
        this.f33093s = new SpannableStringBuilder();
        this.f33094w = new SpannableStringBuilder();
        this.f33095x = new SpannableStringBuilder();
        this.H = org.telegram.messenger.g0.L(15.0f);
    }

    public final void a(long j10) {
        this.f33086a = true;
        long currentTimeMillis = System.currentTimeMillis() - j10;
        this.d = currentTimeMillis;
        this.h = j10;
        this.f33090f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f33086a) {
            this.f33086a = false;
            if (this.d > 0) {
                this.f33089e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f33090f = 0L;
    }

    public float getLeftProperty() {
        return this.I;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j10;
        long j11;
        SpannableStringBuilder spannableStringBuilder;
        long min;
        String str;
        int threadMessageId;
        int i3;
        int i10;
        TextPaint textPaint = this.G;
        ChatActivityEnterView chatActivityEnterView = this.J;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.G = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.G.setTypeface(org.telegram.messenger.g0.o());
            TextPaint textPaint3 = this.G;
            int i11 = org.telegram.ui.ActionBar.k6.f27852bg;
            int i12 = ChatActivityEnterView.f31082t5;
            textPaint3.setColor(chatActivityEnterView.f0(i11));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f33086a) {
            if (this.f33092r) {
                j10 = this.h;
            } else {
                j10 = currentTimeMillis - this.d;
            }
        } else {
            j10 = this.f33089e - this.d;
        }
        long j12 = j10 / 1000;
        int i13 = ((int) (j10 % 1000)) / 10;
        long j13 = 0;
        if (chatActivityEnterView.f31104d1 && j10 >= 59500 && !this.f33087b) {
            chatActivityEnterView.E2 = -1.0f;
            uf ufVar = chatActivityEnterView.f31087a3;
            if (chatActivityEnterView.P) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            ufVar.d2(3, 0, i10, chatActivityEnterView.T4, 0L, true);
            ee eeVar = chatActivityEnterView.K0;
            chatActivityEnterView.T4 = 0L;
            eeVar.setEffect(0L);
            this.f33087b = true;
        }
        if (this.f33086a && currentTimeMillis > this.f33090f + 5000) {
            this.f33090f = currentTimeMillis;
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(chatActivityEnterView.R);
            long j14 = chatActivityEnterView.R2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j15 = threadMessageId;
            if (chatActivityEnterView.f31104d1) {
                i3 = 7;
            } else {
                i3 = 1;
            }
            s12.C4(i3, 0, j14, j15, null);
        }
        long j16 = (int) j12;
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        StringBuilder sb2 = new StringBuilder();
        long j17 = j16 / 60;
        if (j17 >= 60) {
            sb2.append(j17 / 60);
            sb2.append(":");
            org.telegram.messenger.g0.q2(j17 % 60, sb2);
            sb2.append(":");
            org.telegram.messenger.g0.q2(j16 % 60, sb2);
            sb2.append(",");
            sb2.append(i13 / 10);
        } else {
            sb2.append(j17);
            sb2.append(":");
            org.telegram.messenger.g0.q2(j16 % 60, sb2);
            sb2.append(",");
            sb2.append(i13 / 10);
        }
        String sb3 = sb2.toString();
        if (sb3.length() >= 3 && (str = this.f33088c) != null && str.length() >= 3 && sb3.length() == this.f33088c.length() && sb3.charAt(sb3.length() - 3) != this.f33088c.charAt(sb3.length() - 3)) {
            int length = sb3.length();
            SpannableStringBuilder spannableStringBuilder2 = this.f33093s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f33094w;
            spannableStringBuilder3.clear();
            this.f33095x.clear();
            spannableStringBuilder2.append((CharSequence) sb3);
            spannableStringBuilder3.append((CharSequence) this.f33088c);
            this.f33095x.append((CharSequence) sb3);
            int i14 = -1;
            int i15 = -1;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                j11 = j13;
                if (i16 >= length - 1) {
                    break;
                }
                if (this.f33088c.charAt(i16) != sb3.charAt(i16)) {
                    if (i18 == 0) {
                        i15 = i16;
                    }
                    i18++;
                    if (i17 != 0) {
                        fy fyVar = new fy(false);
                        if (i16 == length - 2) {
                            i17++;
                        }
                        int i19 = i17 + i14;
                        spannableStringBuilder2.setSpan(fyVar, i14, i19, 33);
                        spannableStringBuilder3.setSpan(fyVar, i14, i19, 33);
                        i17 = 0;
                    }
                } else {
                    if (i17 == 0) {
                        i14 = i16;
                    }
                    i17++;
                    if (i18 != 0) {
                        this.f33095x.setSpan(new fy(false), i15, i18 + i15, 33);
                        i18 = 0;
                    }
                }
                i16++;
                j13 = j11;
            }
            if (i17 != 0) {
                fy fyVar2 = new fy(false);
                int i20 = i17 + i14 + 1;
                spannableStringBuilder2.setSpan(fyVar2, i14, i20, 33);
                spannableStringBuilder3.setSpan(fyVar2, i14, i20, 33);
            }
            if (i18 != 0) {
                this.f33095x.setSpan(new fy(false), i15, i18 + i15, 33);
            }
            TextPaint textPaint4 = this.G;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f33096y = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.E = new StaticLayout(spannableStringBuilder3, this.G, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.F = 1.0f;
        } else {
            j11 = 0;
            if (this.f33095x == null) {
                this.f33095x = new SpannableStringBuilder(sb3);
            }
            if (this.f33095x.length() != 0 && this.f33095x.length() == sb3.length()) {
                this.f33095x.replace(spannableStringBuilder.length() - 1, this.f33095x.length(), (CharSequence) sb3, (sb3.length() - 1) - (sb3.length() - this.f33095x.length()), sb3.length());
            } else {
                this.f33095x.clear();
                this.f33095x.append((CharSequence) sb3);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j18 = this.f33091n;
        if (j18 == j11) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j18);
        }
        this.f33091n = elapsedRealtime;
        float f10 = this.F;
        if (f10 != 0.0f) {
            float f11 = f10 - (((float) min) / 116.0f);
            this.F = f11;
            if (f11 < 0.0f) {
                this.F = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.F == 0.0f) {
            this.f33095x.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f33095x, this.G, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.I = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f33096y;
            float f12 = this.H;
            if (staticLayout2 != null) {
                canvas.save();
                this.G.setAlpha((int) ((1.0f - this.F) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f33096y.getHeight() / 2.0f)) - (this.F * f12));
                this.f33096y.draw(canvas);
                canvas.restore();
            }
            if (this.E != null) {
                canvas.save();
                this.G.setAlpha((int) (this.F * 255.0f));
                canvas.translate(0.0f, com.google.android.recaptcha.internal.a.y(1.0f, this.F, f12, measuredHeight - (this.E.getHeight() / 2.0f)));
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.G.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f33095x, this.G, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.I = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f33088c = sb3;
        if ((this.f33086a || this.F != 0.0f) && !this.f33092r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.f33092r = z10;
        this.f33091n = SystemClock.elapsedRealtime();
        invalidate();
    }
}

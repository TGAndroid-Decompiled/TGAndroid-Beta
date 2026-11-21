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
public final class wg extends View {
    public StaticLayout E;
    public float F;
    public TextPaint G;
    public final float H;
    public float I;
    public final ChatActivityEnterView J;
    public boolean f41803a;
    public boolean f41804b;
    public String f41805c;
    public long d;
    public long f41806e;
    public long f41807f;
    public long h;
    public long f41808n;
    public boolean f41809r;
    public final SpannableStringBuilder f41810s;
    public final SpannableStringBuilder f41811w;
    public SpannableStringBuilder f41812x;
    public StaticLayout f41813y;

    public wg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.J = chatActivityEnterView;
        this.f41810s = new SpannableStringBuilder();
        this.f41811w = new SpannableStringBuilder();
        this.f41812x = new SpannableStringBuilder();
        this.H = org.telegram.messenger.g0.L(15.0f);
    }

    public final void a(long j3) {
        this.f41803a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.h = j3;
        this.f41807f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f41803a) {
            this.f41803a = false;
            if (this.d > 0) {
                this.f41806e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f41807f = 0L;
    }

    public float getLeftProperty() {
        return this.I;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        long j3;
        long j10;
        SpannableStringBuilder spannableStringBuilder;
        long min;
        String str;
        int threadMessageId;
        int i7;
        int i10;
        TextPaint textPaint = this.G;
        ChatActivityEnterView chatActivityEnterView = this.J;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.G = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(14.0f));
            this.G.setTypeface(org.telegram.messenger.g0.o());
            this.G.setFontFeatureSettings("tnum");
            TextPaint textPaint3 = this.G;
            int i11 = org.telegram.ui.ActionBar.m6.G6;
            int i12 = ChatActivityEnterView.f32566s7;
            textPaint3.setColor(chatActivityEnterView.G0(i11));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f41803a) {
            if (this.f41809r) {
                j3 = this.h;
            } else {
                j3 = currentTimeMillis - this.d;
            }
        } else {
            j3 = this.f41806e - this.d;
        }
        long j11 = j3 / 1000;
        int i13 = ((int) (j3 % 1000)) / 10;
        long j12 = 0;
        if (chatActivityEnterView.f32595d1 && j3 >= 59500 && !this.f41804b) {
            chatActivityEnterView.f32720t3 = -1.0f;
            ng ngVar = chatActivityEnterView.P3;
            if (chatActivityEnterView.P) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            ngVar.o2(3, 0, i10, chatActivityEnterView.P6, 0L, true);
            re reVar = chatActivityEnterView.K0;
            chatActivityEnterView.P6 = 0L;
            reVar.setEffect(0L);
            this.f41804b = true;
        }
        if (this.f41803a && currentTimeMillis > this.f41807f + 5000) {
            this.f41807f = currentTimeMillis;
            org.telegram.messenger.mp u12 = org.telegram.messenger.mp.u1(chatActivityEnterView.R);
            long j13 = chatActivityEnterView.G3;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j14 = threadMessageId;
            if (chatActivityEnterView.f32595d1) {
                i7 = 7;
            } else {
                i7 = 1;
            }
            u12.N4(i7, 0, j13, j14, null);
        }
        long j15 = (int) j11;
        Typeface typeface = org.telegram.messenger.g0.f24118a;
        StringBuilder sb2 = new StringBuilder();
        long j16 = j15 / 60;
        if (j16 >= 60) {
            sb2.append(j16 / 60);
            sb2.append(":");
            org.telegram.messenger.g0.q2(j16 % 60, sb2);
            sb2.append(":");
            org.telegram.messenger.g0.q2(j15 % 60, sb2);
            sb2.append(",");
            sb2.append(i13 / 10);
        } else {
            sb2.append(j16);
            sb2.append(":");
            org.telegram.messenger.g0.q2(j15 % 60, sb2);
            sb2.append(",");
            sb2.append(i13 / 10);
        }
        String sb3 = sb2.toString();
        if (sb3.length() >= 3 && (str = this.f41805c) != null && str.length() >= 3 && sb3.length() == this.f41805c.length() && sb3.charAt(sb3.length() - 3) != this.f41805c.charAt(sb3.length() - 3)) {
            int length = sb3.length();
            SpannableStringBuilder spannableStringBuilder2 = this.f41810s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f41811w;
            spannableStringBuilder3.clear();
            this.f41812x.clear();
            spannableStringBuilder2.append((CharSequence) sb3);
            spannableStringBuilder3.append((CharSequence) this.f41805c);
            this.f41812x.append((CharSequence) sb3);
            int i14 = -1;
            int i15 = -1;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                j10 = j12;
                if (i16 >= length - 1) {
                    break;
                }
                if (this.f41805c.charAt(i16) != sb3.charAt(i16)) {
                    if (i18 == 0) {
                        i15 = i16;
                    }
                    i18++;
                    if (i17 != 0) {
                        uy uyVar = new uy(false);
                        if (i16 == length - 2) {
                            i17++;
                        }
                        int i19 = i17 + i14;
                        spannableStringBuilder2.setSpan(uyVar, i14, i19, 33);
                        spannableStringBuilder3.setSpan(uyVar, i14, i19, 33);
                        i17 = 0;
                    }
                } else {
                    if (i17 == 0) {
                        i14 = i16;
                    }
                    i17++;
                    if (i18 != 0) {
                        this.f41812x.setSpan(new uy(false), i15, i18 + i15, 33);
                        i18 = 0;
                    }
                }
                i16++;
                j12 = j10;
            }
            if (i17 != 0) {
                uy uyVar2 = new uy(false);
                int i20 = i17 + i14 + 1;
                spannableStringBuilder2.setSpan(uyVar2, i14, i20, 33);
                spannableStringBuilder3.setSpan(uyVar2, i14, i20, 33);
            }
            if (i18 != 0) {
                this.f41812x.setSpan(new uy(false), i15, i18 + i15, 33);
            }
            TextPaint textPaint4 = this.G;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f41813y = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.E = new StaticLayout(spannableStringBuilder3, this.G, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.F = 1.0f;
        } else {
            j10 = 0;
            if (this.f41812x == null) {
                this.f41812x = new SpannableStringBuilder(sb3);
            }
            if (this.f41812x.length() != 0 && this.f41812x.length() == sb3.length()) {
                this.f41812x.replace(spannableStringBuilder.length() - 1, this.f41812x.length(), (CharSequence) sb3, (sb3.length() - 1) - (sb3.length() - this.f41812x.length()), sb3.length());
            } else {
                this.f41812x.clear();
                this.f41812x.append((CharSequence) sb3);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j17 = this.f41808n;
        if (j17 == j10) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j17);
        }
        this.f41808n = elapsedRealtime;
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
            this.f41812x.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f41812x, this.G, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            org.telegram.messenger.n10.k(staticLayout.getHeight(), 2.0f, measuredHeight, 0.0f, canvas);
            staticLayout.draw(canvas);
            canvas.restore();
            this.I = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f41813y;
            float f12 = this.H;
            if (staticLayout2 != null) {
                canvas.save();
                this.G.setAlpha((int) ((1.0f - this.F) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f41813y.getHeight() / 2.0f)) - (this.F * f12));
                this.f41813y.draw(canvas);
                canvas.restore();
            }
            if (this.E != null) {
                canvas.save();
                this.G.setAlpha((int) (this.F * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, this.F, f12, measuredHeight - (this.E.getHeight() / 2.0f)));
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.G.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f41812x, this.G, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            org.telegram.messenger.n10.k(staticLayout3.getHeight(), 2.0f, measuredHeight, 0.0f, canvas);
            staticLayout3.draw(canvas);
            canvas.restore();
            this.I = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f41805c = sb3;
        if ((this.f41803a || this.F != 0.0f) && !this.f41809r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.f41809r = z10;
        this.f41808n = SystemClock.elapsedRealtime();
        invalidate();
    }
}

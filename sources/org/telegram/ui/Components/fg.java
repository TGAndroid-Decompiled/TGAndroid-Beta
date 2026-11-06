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
public final class fg extends View {
    public StaticLayout D;
    public float E;
    public TextPaint F;
    public final float G;
    public float H;
    public final ChatActivityEnterView I;
    public boolean f33532a;
    public boolean f33533b;
    public String f33534c;
    public long d;
    public long f33535e;
    public long f33536f;
    public long h;
    public long f33537n;
    public boolean f33538r;
    public final SpannableStringBuilder f33539s;
    public final SpannableStringBuilder f33540w;
    public SpannableStringBuilder f33541x;
    public StaticLayout f33542y;

    public fg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.f33539s = new SpannableStringBuilder();
        this.f33540w = new SpannableStringBuilder();
        this.f33541x = new SpannableStringBuilder();
        this.G = org.telegram.messenger.g0.L(15.0f);
    }

    public final void a(long j3) {
        this.f33532a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.h = j3;
        this.f33536f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f33532a) {
            this.f33532a = false;
            if (this.d > 0) {
                this.f33535e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f33536f = 0L;
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
        int i7;
        int i10;
        TextPaint textPaint = this.F;
        ChatActivityEnterView chatActivityEnterView = this.I;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.F = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.F.setTypeface(org.telegram.messenger.g0.o());
            TextPaint textPaint3 = this.F;
            int i11 = org.telegram.ui.ActionBar.k6.f27821bg;
            int i12 = ChatActivityEnterView.s5;
            textPaint3.setColor(chatActivityEnterView.f0(i11));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f33532a) {
            if (this.f33538r) {
                j3 = this.h;
            } else {
                j3 = currentTimeMillis - this.d;
            }
        } else {
            j3 = this.f33535e - this.d;
        }
        long j11 = j3 / 1000;
        int i13 = ((int) (j3 % 1000)) / 10;
        long j12 = 0;
        if (chatActivityEnterView.f31025c1 && j3 >= 59500 && !this.f33533b) {
            chatActivityEnterView.D2 = -1.0f;
            wf wfVar = chatActivityEnterView.Z2;
            if (chatActivityEnterView.O) {
                i10 = Integer.MAX_VALUE;
            } else {
                i10 = 0;
            }
            wfVar.Z1(3, 0, i10, chatActivityEnterView.S4, 0L, true);
            ge geVar = chatActivityEnterView.J0;
            chatActivityEnterView.S4 = 0L;
            geVar.setEffect(0L);
            this.f33533b = true;
        }
        if (this.f33532a && currentTimeMillis > this.f33536f + 5000) {
            this.f33536f = currentTimeMillis;
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(chatActivityEnterView.Q);
            long j13 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j14 = threadMessageId;
            if (chatActivityEnterView.f31025c1) {
                i7 = 7;
            } else {
                i7 = 1;
            }
            s12.C4(i7, 0, j13, j14, null);
        }
        long j15 = (int) j11;
        Typeface typeface = org.telegram.messenger.g0.f22516a;
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
        if (sb3.length() >= 3 && (str = this.f33534c) != null && str.length() >= 3 && sb3.length() == this.f33534c.length() && sb3.charAt(sb3.length() - 3) != this.f33534c.charAt(sb3.length() - 3)) {
            int length = sb3.length();
            SpannableStringBuilder spannableStringBuilder2 = this.f33539s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f33540w;
            spannableStringBuilder3.clear();
            this.f33541x.clear();
            spannableStringBuilder2.append((CharSequence) sb3);
            spannableStringBuilder3.append((CharSequence) this.f33534c);
            this.f33541x.append((CharSequence) sb3);
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
                if (this.f33534c.charAt(i16) != sb3.charAt(i16)) {
                    if (i18 == 0) {
                        i15 = i16;
                    }
                    i18++;
                    if (i17 != 0) {
                        hy hyVar = new hy(false);
                        if (i16 == length - 2) {
                            i17++;
                        }
                        int i19 = i17 + i14;
                        spannableStringBuilder2.setSpan(hyVar, i14, i19, 33);
                        spannableStringBuilder3.setSpan(hyVar, i14, i19, 33);
                        i17 = 0;
                    }
                } else {
                    if (i17 == 0) {
                        i14 = i16;
                    }
                    i17++;
                    if (i18 != 0) {
                        this.f33541x.setSpan(new hy(false), i15, i18 + i15, 33);
                        i18 = 0;
                    }
                }
                i16++;
                j12 = j10;
            }
            if (i17 != 0) {
                hy hyVar2 = new hy(false);
                int i20 = i17 + i14 + 1;
                spannableStringBuilder2.setSpan(hyVar2, i14, i20, 33);
                spannableStringBuilder3.setSpan(hyVar2, i14, i20, 33);
            }
            if (i18 != 0) {
                this.f33541x.setSpan(new hy(false), i15, i18 + i15, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f33542y = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.D = new StaticLayout(spannableStringBuilder3, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        } else {
            j10 = 0;
            if (this.f33541x == null) {
                this.f33541x = new SpannableStringBuilder(sb3);
            }
            if (this.f33541x.length() != 0 && this.f33541x.length() == sb3.length()) {
                this.f33541x.replace(spannableStringBuilder.length() - 1, this.f33541x.length(), (CharSequence) sb3, (sb3.length() - 1) - (sb3.length() - this.f33541x.length()), sb3.length());
            } else {
                this.f33541x.clear();
                this.f33541x.append((CharSequence) sb3);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j17 = this.f33537n;
        if (j17 == j10) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j17);
        }
        this.f33537n = elapsedRealtime;
        float f10 = this.E;
        if (f10 != 0.0f) {
            float f11 = f10 - (((float) min) / 116.0f);
            this.E = f11;
            if (f11 < 0.0f) {
                this.E = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.E == 0.0f) {
            this.f33541x.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f33541x, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f33542y;
            float f12 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f33542y.getHeight() / 2.0f)) - (this.E * f12));
                this.f33542y.draw(canvas);
                canvas.restore();
            }
            if (this.D != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, com.google.android.recaptcha.internal.a.z(1.0f, this.E, f12, measuredHeight - (this.D.getHeight() / 2.0f)));
                this.D.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f33541x, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.H = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f33534c = sb3;
        if ((this.f33532a || this.E != 0.0f) && !this.f33538r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z9) {
        this.f33538r = z9;
        this.f33537n = SystemClock.elapsedRealtime();
        invalidate();
    }
}

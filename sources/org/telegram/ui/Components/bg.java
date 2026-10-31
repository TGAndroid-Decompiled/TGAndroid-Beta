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
public final class bg extends View {
    public StaticLayout D;
    public float E;
    public TextPaint F;
    public final float G;
    public float H;
    public final ChatActivityEnterView I;
    public boolean f24626a;
    public boolean f24627b;
    public String f24628c;
    public long d;
    public long e;
    public long f24629f;
    public long h;
    public long f24630n;
    public boolean f24631r;
    public final SpannableStringBuilder f24632s;
    public final SpannableStringBuilder f24633w;
    public SpannableStringBuilder f24634x;
    public StaticLayout f24635y;

    public bg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.f24632s = new SpannableStringBuilder();
        this.f24633w = new SpannableStringBuilder();
        this.f24634x = new SpannableStringBuilder();
        this.G = org.telegram.messenger.i0.L(15.0f);
    }

    public final void a(long j10) {
        this.f24626a = true;
        long currentTimeMillis = System.currentTimeMillis() - j10;
        this.d = currentTimeMillis;
        this.h = j10;
        this.f24629f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f24626a) {
            this.f24626a = false;
            if (this.d > 0) {
                this.e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f24629f = 0L;
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
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.F = textPaint2;
            textPaint2.setTextSize(org.telegram.messenger.i0.L(15.0f));
            this.F.setTypeface(org.telegram.messenger.i0.o());
            TextPaint textPaint3 = this.F;
            int i12 = org.telegram.ui.ActionBar.t6.f20900bg;
            int i13 = ChatActivityEnterView.f23672s5;
            textPaint3.setColor(chatActivityEnterView.e0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f24626a) {
            if (this.f24631r) {
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
        if (chatActivityEnterView.f23688c1 && j10 >= 59500 && !this.f24627b) {
            chatActivityEnterView.D2 = -1.0f;
            sf sfVar = chatActivityEnterView.Z2;
            if (chatActivityEnterView.O) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            sfVar.V1(3, 0, i11, chatActivityEnterView.S4, 0L, true);
            be beVar = chatActivityEnterView.J0;
            chatActivityEnterView.S4 = 0L;
            beVar.setEffect(0L);
            this.f24627b = true;
        }
        if (this.f24626a && currentTimeMillis > this.f24629f + 5000) {
            this.f24629f = currentTimeMillis;
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(chatActivityEnterView.Q);
            long j14 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j15 = threadMessageId;
            if (chatActivityEnterView.f23688c1) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            r12.z4(i10, 0, j14, j15, null);
        }
        long j16 = (int) j12;
        Typeface typeface = org.telegram.messenger.i0.f15999a;
        StringBuilder sb2 = new StringBuilder();
        long j17 = j16 / 60;
        if (j17 >= 60) {
            sb2.append(j17 / 60);
            sb2.append(":");
            org.telegram.messenger.i0.q2(j17 % 60, sb2);
            sb2.append(":");
            org.telegram.messenger.i0.q2(j16 % 60, sb2);
            sb2.append(",");
            sb2.append(i14 / 10);
        } else {
            sb2.append(j17);
            sb2.append(":");
            org.telegram.messenger.i0.q2(j16 % 60, sb2);
            sb2.append(",");
            sb2.append(i14 / 10);
        }
        String sb3 = sb2.toString();
        if (sb3.length() >= 3 && (str = this.f24628c) != null && str.length() >= 3 && sb3.length() == this.f24628c.length() && sb3.charAt(sb3.length() - 3) != this.f24628c.charAt(sb3.length() - 3)) {
            int length = sb3.length();
            SpannableStringBuilder spannableStringBuilder2 = this.f24632s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.f24633w;
            spannableStringBuilder3.clear();
            this.f24634x.clear();
            spannableStringBuilder2.append((CharSequence) sb3);
            spannableStringBuilder3.append((CharSequence) this.f24628c);
            this.f24634x.append((CharSequence) sb3);
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                j11 = j13;
                if (i17 >= length - 1) {
                    break;
                }
                if (this.f24628c.charAt(i17) != sb3.charAt(i17)) {
                    if (i19 == 0) {
                        i16 = i17;
                    }
                    i19++;
                    if (i18 != 0) {
                        wy wyVar = new wy(false);
                        if (i17 == length - 2) {
                            i18++;
                        }
                        int i20 = i18 + i15;
                        spannableStringBuilder2.setSpan(wyVar, i15, i20, 33);
                        spannableStringBuilder3.setSpan(wyVar, i15, i20, 33);
                        i18 = 0;
                    }
                } else {
                    if (i18 == 0) {
                        i15 = i17;
                    }
                    i18++;
                    if (i19 != 0) {
                        this.f24634x.setSpan(new wy(false), i16, i19 + i16, 33);
                        i19 = 0;
                    }
                }
                i17++;
                j13 = j11;
            }
            if (i18 != 0) {
                wy wyVar2 = new wy(false);
                int i21 = i18 + i15 + 1;
                spannableStringBuilder2.setSpan(wyVar2, i15, i21, 33);
                spannableStringBuilder3.setSpan(wyVar2, i15, i21, 33);
            }
            if (i19 != 0) {
                this.f24634x.setSpan(new wy(false), i16, i19 + i16, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f24635y = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.D = new StaticLayout(spannableStringBuilder3, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        } else {
            j11 = 0;
            if (this.f24634x == null) {
                this.f24634x = new SpannableStringBuilder(sb3);
            }
            if (this.f24634x.length() != 0 && this.f24634x.length() == sb3.length()) {
                this.f24634x.replace(spannableStringBuilder.length() - 1, this.f24634x.length(), (CharSequence) sb3, (sb3.length() - 1) - (sb3.length() - this.f24634x.length()), sb3.length());
            } else {
                this.f24634x.clear();
                this.f24634x.append((CharSequence) sb3);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j18 = this.f24630n;
        if (j18 == j11) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j18);
        }
        this.f24630n = elapsedRealtime;
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
            this.f24634x.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f24634x, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f24635y;
            float f11 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f24635y.getHeight() / 2.0f)) - (this.E * f11));
                this.f24635y.draw(canvas);
                canvas.restore();
            }
            if (this.D != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, c3.i0.z(1.0f, this.E, f11, measuredHeight - (this.D.getHeight() / 2.0f)));
                this.D.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f24634x, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.H = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f24628c = sb3;
        if ((this.f24626a || this.E != 0.0f) && !this.f24631r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.f24631r = z10;
        this.f24630n = SystemClock.elapsedRealtime();
        invalidate();
    }
}

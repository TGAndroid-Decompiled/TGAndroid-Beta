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
    public boolean f30341a;
    public boolean f30342b;
    public String f30343c;
    public long d;
    public long e;
    public long f30344f;
    public long h;
    public long f30345n;
    public boolean f30346r;
    public final SpannableStringBuilder f30347s;
    public final SpannableStringBuilder v;
    public SpannableStringBuilder f30348w;
    public StaticLayout f30349x;
    public StaticLayout f30350y;

    public xg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.f30347s = new SpannableStringBuilder();
        this.v = new SpannableStringBuilder();
        this.f30348w = new SpannableStringBuilder();
        this.G = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j3) {
        this.f30341a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.h = j3;
        this.f30344f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f30341a) {
            this.f30341a = false;
            if (this.d > 0) {
                this.e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f30344f = 0L;
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
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.F = textPaint2;
            textPaint2.setTextSize(AndroidUtilities.dp(15.0f));
            this.F.setTypeface(AndroidUtilities.bold());
            TextPaint textPaint3 = this.F;
            int i12 = org.telegram.ui.ActionBar.h6.f19249nf;
            int i13 = ChatActivityEnterView.f21952n5;
            textPaint3.setColor(chatActivityEnterView.i0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f30341a) {
            if (this.f30346r) {
                j3 = this.h;
            } else {
                j3 = currentTimeMillis - this.d;
            }
        } else {
            j3 = this.e - this.d;
        }
        long j11 = j3 / 1000;
        int i14 = ((int) (j3 % 1000)) / 10;
        long j12 = 0;
        if (chatActivityEnterView.f21968c1 && j3 >= 59500 && !this.f30342b) {
            chatActivityEnterView.D2 = -1.0f;
            og ogVar = chatActivityEnterView.Z2;
            if (chatActivityEnterView.O) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            ogVar.k2(3, 0, i11, chatActivityEnterView.S4, 0L, true);
            ye yeVar = chatActivityEnterView.J0;
            chatActivityEnterView.S4 = 0L;
            yeVar.setEffect(0L);
            this.f30342b = true;
        }
        if (this.f30341a && currentTimeMillis > this.f30344f + 5000) {
            this.f30344f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j13 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j14 = threadMessageId;
            if (chatActivityEnterView.f21968c1) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j13, j14, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j11, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f30343c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f30343c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f30343c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.f30347s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.v;
            spannableStringBuilder3.clear();
            this.f30348w.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f30343c);
            this.f30348w.append((CharSequence) formatTimerDurationFast);
            int i15 = -1;
            int i16 = -1;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            while (true) {
                j10 = j12;
                if (i17 >= length - 1) {
                    break;
                }
                if (this.f30343c.charAt(i17) != formatTimerDurationFast.charAt(i17)) {
                    if (i19 == 0) {
                        i16 = i17;
                    }
                    i19++;
                    if (i18 != 0) {
                        nz nzVar = new nz(false);
                        if (i17 == length - 2) {
                            i18++;
                        }
                        int i20 = i18 + i15;
                        spannableStringBuilder2.setSpan(nzVar, i15, i20, 33);
                        spannableStringBuilder3.setSpan(nzVar, i15, i20, 33);
                        i18 = 0;
                    }
                } else {
                    if (i18 == 0) {
                        i15 = i17;
                    }
                    i18++;
                    if (i19 != 0) {
                        this.f30348w.setSpan(new nz(false), i16, i19 + i16, 33);
                        i19 = 0;
                    }
                }
                i17++;
                j12 = j10;
            }
            if (i18 != 0) {
                nz nzVar2 = new nz(false);
                int i21 = i18 + i15 + 1;
                spannableStringBuilder2.setSpan(nzVar2, i15, i21, 33);
                spannableStringBuilder3.setSpan(nzVar2, i15, i21, 33);
            }
            if (i19 != 0) {
                this.f30348w.setSpan(new nz(false), i16, i19 + i16, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f30349x = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f30350y = new StaticLayout(spannableStringBuilder3, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        } else {
            j10 = 0;
            if (this.f30348w == null) {
                this.f30348w = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f30348w.length() != 0 && this.f30348w.length() == formatTimerDurationFast.length()) {
                this.f30348w.replace(spannableStringBuilder.length() - 1, this.f30348w.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f30348w.length()), formatTimerDurationFast.length());
            } else {
                this.f30348w.clear();
                this.f30348w.append((CharSequence) formatTimerDurationFast);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j15 = this.f30345n;
        if (j15 == j10) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j15);
        }
        this.f30345n = elapsedRealtime;
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
            this.f30348w.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f30348w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f30349x;
            float f11 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f30349x.getHeight() / 2.0f)) - (this.E * f11));
                this.f30349x.draw(canvas);
                canvas.restore();
            }
            if (this.f30350y != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, this.E, f11, measuredHeight - (this.f30350y.getHeight() / 2.0f)));
                this.f30350y.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f30348w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.H = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f30343c = formatTimerDurationFast;
        if ((this.f30341a || this.E != 0.0f) && !this.f30346r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.f30346r = z10;
        this.f30345n = SystemClock.elapsedRealtime();
        invalidate();
    }
}

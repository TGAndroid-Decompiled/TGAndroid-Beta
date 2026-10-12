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
public final class bh extends View {
    public float E;
    public TextPaint F;
    public final float G;
    public float H;
    public final ChatActivityEnterView I;
    public boolean f24632a;
    public boolean f24633b;
    public String f24634c;
    public long d;
    public long f24635e;
    public long f24636f;
    public long h;
    public long f24637n;
    public boolean f24638r;
    public final SpannableStringBuilder f24639s;
    public final SpannableStringBuilder v;
    public SpannableStringBuilder f24640w;
    public StaticLayout f24641x;
    public StaticLayout f24642y;

    public bh(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.f24639s = new SpannableStringBuilder();
        this.v = new SpannableStringBuilder();
        this.f24640w = new SpannableStringBuilder();
        this.G = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j3) {
        this.f24632a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.h = j3;
        this.f24636f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f24632a) {
            this.f24632a = false;
            if (this.d > 0) {
                this.f24635e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f24636f = 0L;
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
            int i12 = org.telegram.ui.ActionBar.h6.f20752nf;
            int i13 = ChatActivityEnterView.S5;
            textPaint3.setColor(chatActivityEnterView.j0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f24632a) {
            if (this.f24638r) {
                j3 = this.h;
            } else {
                j3 = currentTimeMillis - this.d;
            }
        } else {
            j3 = this.f24635e - this.d;
        }
        long j11 = j3 / 1000;
        int i14 = ((int) (j3 % 1000)) / 10;
        long j12 = 0;
        if (chatActivityEnterView.f23632c1 && j3 >= 59500 && !this.f24633b) {
            chatActivityEnterView.D2 = -1.0f;
            sg sgVar = chatActivityEnterView.Z2;
            if (chatActivityEnterView.O) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            sgVar.q2(3, 0, i11, chatActivityEnterView.f23750v5, 0L, true);
            af afVar = chatActivityEnterView.J0;
            chatActivityEnterView.f23750v5 = 0L;
            afVar.setEffect(0L);
            this.f24633b = true;
        }
        if (this.f24632a && currentTimeMillis > this.f24636f + 5000) {
            this.f24636f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j13 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j14 = threadMessageId;
            if (chatActivityEnterView.f23632c1) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j13, j14, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j11, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f24634c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f24634c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f24634c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.f24639s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.v;
            spannableStringBuilder3.clear();
            this.f24640w.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f24634c);
            this.f24640w.append((CharSequence) formatTimerDurationFast);
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
                if (this.f24634c.charAt(i17) != formatTimerDurationFast.charAt(i17)) {
                    if (i19 == 0) {
                        i16 = i17;
                    }
                    i19++;
                    if (i18 != 0) {
                        e00 e00Var = new e00(false);
                        if (i17 == length - 2) {
                            i18++;
                        }
                        int i20 = i18 + i15;
                        spannableStringBuilder2.setSpan(e00Var, i15, i20, 33);
                        spannableStringBuilder3.setSpan(e00Var, i15, i20, 33);
                        i18 = 0;
                    }
                } else {
                    if (i18 == 0) {
                        i15 = i17;
                    }
                    i18++;
                    if (i19 != 0) {
                        this.f24640w.setSpan(new e00(false), i16, i19 + i16, 33);
                        i19 = 0;
                    }
                }
                i17++;
                z10 = z11;
                j12 = j10;
            }
            if (i18 != 0) {
                e00 e00Var2 = new e00(false);
                int i21 = i18 + i15 + 1;
                spannableStringBuilder2.setSpan(e00Var2, i15, i21, 33);
                spannableStringBuilder3.setSpan(e00Var2, i15, i21, 33);
            }
            if (i19 != 0) {
                this.f24640w.setSpan(new e00(false), i16, i19 + i16, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f24641x = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f24642y = new StaticLayout(spannableStringBuilder3, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        } else {
            j10 = 0;
            if (this.f24640w == null) {
                this.f24640w = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f24640w.length() != 0 && this.f24640w.length() == formatTimerDurationFast.length()) {
                this.f24640w.replace(spannableStringBuilder.length() - 1, this.f24640w.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f24640w.length()), formatTimerDurationFast.length());
            } else {
                this.f24640w.clear();
                this.f24640w.append((CharSequence) formatTimerDurationFast);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j15 = this.f24637n;
        if (j15 == j10) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j15);
        }
        this.f24637n = elapsedRealtime;
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
            this.f24640w.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f24640w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f24641x;
            float f11 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f24641x.getHeight() / 2.0f)) - (this.E * f11));
                this.f24641x.draw(canvas);
                canvas.restore();
            }
            if (this.f24642y != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.y(1.0f, this.E, f11, measuredHeight - (this.f24642y.getHeight() / 2.0f)));
                this.f24642y.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f24640w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.H = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f24634c = formatTimerDurationFast;
        if ((this.f24632a || this.E != 0.0f) && !this.f24638r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.f24638r = z10;
        this.f24637n = SystemClock.elapsedRealtime();
        invalidate();
    }
}

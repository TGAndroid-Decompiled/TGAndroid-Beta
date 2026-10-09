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
    public boolean f33567a;
    public boolean f33568b;
    public String f33569c;
    public long d;
    public long f33570e;
    public long f33571f;
    public long h;
    public long f33572n;
    public boolean f33573r;
    public final SpannableStringBuilder f33574s;
    public final SpannableStringBuilder v;
    public SpannableStringBuilder f33575w;
    public StaticLayout f33576x;
    public StaticLayout f33577y;

    public zg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.f33574s = new SpannableStringBuilder();
        this.v = new SpannableStringBuilder();
        this.f33575w = new SpannableStringBuilder();
        this.G = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j3) {
        this.f33567a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.h = j3;
        this.f33571f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f33567a) {
            this.f33567a = false;
            if (this.d > 0) {
                this.f33570e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f33571f = 0L;
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
            int i12 = org.telegram.ui.ActionBar.i6.f20989nf;
            int i13 = ChatActivityEnterView.f23850n5;
            textPaint3.setColor(chatActivityEnterView.g0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f33567a) {
            if (this.f33573r) {
                j3 = this.h;
            } else {
                j3 = currentTimeMillis - this.d;
            }
        } else {
            j3 = this.f33570e - this.d;
        }
        long j11 = j3 / 1000;
        int i14 = ((int) (j3 % 1000)) / 10;
        long j12 = 0;
        if (chatActivityEnterView.f23866c1 && j3 >= 59500 && !this.f33568b) {
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
            this.f33568b = true;
        }
        if (this.f33567a && currentTimeMillis > this.f33571f + 5000) {
            this.f33571f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j13 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j14 = threadMessageId;
            if (chatActivityEnterView.f23866c1) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j13, j14, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j11, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f33569c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f33569c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f33569c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.f33574s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.v;
            spannableStringBuilder3.clear();
            this.f33575w.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f33569c);
            this.f33575w.append((CharSequence) formatTimerDurationFast);
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
                if (this.f33569c.charAt(i17) != formatTimerDurationFast.charAt(i17)) {
                    if (i19 == 0) {
                        i16 = i17;
                    }
                    i19++;
                    if (i18 != 0) {
                        b00 b00Var = new b00(false);
                        if (i17 == length - 2) {
                            i18++;
                        }
                        int i20 = i18 + i15;
                        spannableStringBuilder2.setSpan(b00Var, i15, i20, 33);
                        spannableStringBuilder3.setSpan(b00Var, i15, i20, 33);
                        i18 = 0;
                    }
                } else {
                    if (i18 == 0) {
                        i15 = i17;
                    }
                    i18++;
                    if (i19 != 0) {
                        this.f33575w.setSpan(new b00(false), i16, i19 + i16, 33);
                        i19 = 0;
                    }
                }
                i17++;
                z10 = z11;
                j12 = j10;
            }
            if (i18 != 0) {
                b00 b00Var2 = new b00(false);
                int i21 = i18 + i15 + 1;
                spannableStringBuilder2.setSpan(b00Var2, i15, i21, 33);
                spannableStringBuilder3.setSpan(b00Var2, i15, i21, 33);
            }
            if (i19 != 0) {
                this.f33575w.setSpan(new b00(false), i16, i19 + i16, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f33576x = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f33577y = new StaticLayout(spannableStringBuilder3, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        } else {
            j10 = 0;
            if (this.f33575w == null) {
                this.f33575w = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f33575w.length() != 0 && this.f33575w.length() == formatTimerDurationFast.length()) {
                this.f33575w.replace(spannableStringBuilder.length() - 1, this.f33575w.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f33575w.length()), formatTimerDurationFast.length());
            } else {
                this.f33575w.clear();
                this.f33575w.append((CharSequence) formatTimerDurationFast);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j15 = this.f33572n;
        if (j15 == j10) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j15);
        }
        this.f33572n = elapsedRealtime;
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
            this.f33575w.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f33575w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f33576x;
            float f11 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f33576x.getHeight() / 2.0f)) - (this.E * f11));
                this.f33576x.draw(canvas);
                canvas.restore();
            }
            if (this.f33577y != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.y(1.0f, this.E, f11, measuredHeight - (this.f33577y.getHeight() / 2.0f)));
                this.f33577y.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f33575w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.H = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f33569c = formatTimerDurationFast;
        if ((this.f33567a || this.E != 0.0f) && !this.f33573r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.f33573r = z10;
        this.f33572n = SystemClock.elapsedRealtime();
        invalidate();
    }
}

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
public final class yg extends View {
    public float E;
    public TextPaint F;
    public final float G;
    public float H;
    public final ChatActivityEnterView I;
    public boolean f33143a;
    public boolean f33144b;
    public String f33145c;
    public long d;
    public long f33146e;
    public long f33147f;
    public long h;
    public long f33148n;
    public boolean f33149r;
    public final SpannableStringBuilder f33150s;
    public final SpannableStringBuilder v;
    public SpannableStringBuilder f33151w;
    public StaticLayout f33152x;
    public StaticLayout f33153y;

    public yg(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.I = chatActivityEnterView;
        this.f33150s = new SpannableStringBuilder();
        this.v = new SpannableStringBuilder();
        this.f33151w = new SpannableStringBuilder();
        this.G = AndroidUtilities.dp(15.0f);
    }

    public final void a(long j3) {
        this.f33143a = true;
        long currentTimeMillis = System.currentTimeMillis() - j3;
        this.d = currentTimeMillis;
        this.h = j3;
        this.f33147f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.f33143a) {
            this.f33143a = false;
            if (this.d > 0) {
                this.f33146e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f33147f = 0L;
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
            int i12 = org.telegram.ui.ActionBar.i6.f21010nf;
            int i13 = ChatActivityEnterView.f23847n5;
            textPaint3.setColor(chatActivityEnterView.i0(i12));
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f33143a) {
            if (this.f33149r) {
                j3 = this.h;
            } else {
                j3 = currentTimeMillis - this.d;
            }
        } else {
            j3 = this.f33146e - this.d;
        }
        long j11 = j3 / 1000;
        int i14 = ((int) (j3 % 1000)) / 10;
        long j12 = 0;
        if (chatActivityEnterView.f23863c1 && j3 >= 59500 && !this.f33144b) {
            chatActivityEnterView.D2 = -1.0f;
            pg pgVar = chatActivityEnterView.Z2;
            if (chatActivityEnterView.O) {
                i11 = Integer.MAX_VALUE;
            } else {
                i11 = 0;
            }
            pgVar.k2(3, 0, i11, chatActivityEnterView.S4, 0L, true);
            ze zeVar = chatActivityEnterView.J0;
            chatActivityEnterView.S4 = 0L;
            zeVar.setEffect(0L);
            this.f33144b = true;
        }
        if (this.f33143a && currentTimeMillis > this.f33147f + 5000) {
            this.f33147f = currentTimeMillis;
            MessagesController messagesController = MessagesController.getInstance(chatActivityEnterView.Q);
            long j13 = chatActivityEnterView.Q2;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            long j14 = threadMessageId;
            if (chatActivityEnterView.f23863c1) {
                i10 = 7;
            } else {
                i10 = 1;
            }
            messagesController.sendTyping(j13, j14, i10, 0);
        }
        String formatTimerDurationFast = AndroidUtilities.formatTimerDurationFast((int) j11, i14);
        if (formatTimerDurationFast.length() >= 3 && (str = this.f33145c) != null && str.length() >= 3 && formatTimerDurationFast.length() == this.f33145c.length() && formatTimerDurationFast.charAt(formatTimerDurationFast.length() - 3) != this.f33145c.charAt(formatTimerDurationFast.length() - 3)) {
            int length = formatTimerDurationFast.length();
            SpannableStringBuilder spannableStringBuilder2 = this.f33150s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.v;
            spannableStringBuilder3.clear();
            this.f33151w.clear();
            spannableStringBuilder2.append((CharSequence) formatTimerDurationFast);
            spannableStringBuilder3.append((CharSequence) this.f33145c);
            this.f33151w.append((CharSequence) formatTimerDurationFast);
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
                if (this.f33145c.charAt(i17) != formatTimerDurationFast.charAt(i17)) {
                    if (i19 == 0) {
                        i16 = i17;
                    }
                    i19++;
                    if (i18 != 0) {
                        oz ozVar = new oz(false);
                        if (i17 == length - 2) {
                            i18++;
                        }
                        int i20 = i18 + i15;
                        spannableStringBuilder2.setSpan(ozVar, i15, i20, 33);
                        spannableStringBuilder3.setSpan(ozVar, i15, i20, 33);
                        i18 = 0;
                    }
                } else {
                    if (i18 == 0) {
                        i15 = i17;
                    }
                    i18++;
                    if (i19 != 0) {
                        this.f33151w.setSpan(new oz(false), i16, i19 + i16, 33);
                        i19 = 0;
                    }
                }
                i17++;
                j12 = j10;
            }
            if (i18 != 0) {
                oz ozVar2 = new oz(false);
                int i21 = i18 + i15 + 1;
                spannableStringBuilder2.setSpan(ozVar2, i15, i21, 33);
                spannableStringBuilder3.setSpan(ozVar2, i15, i21, 33);
            }
            if (i19 != 0) {
                this.f33151w.setSpan(new oz(false), i16, i19 + i16, 33);
            }
            TextPaint textPaint4 = this.F;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.f33152x = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.f33153y = new StaticLayout(spannableStringBuilder3, this.F, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.E = 1.0f;
        } else {
            j10 = 0;
            if (this.f33151w == null) {
                this.f33151w = new SpannableStringBuilder(formatTimerDurationFast);
            }
            if (this.f33151w.length() != 0 && this.f33151w.length() == formatTimerDurationFast.length()) {
                this.f33151w.replace(spannableStringBuilder.length() - 1, this.f33151w.length(), (CharSequence) formatTimerDurationFast, (formatTimerDurationFast.length() - 1) - (formatTimerDurationFast.length() - this.f33151w.length()), formatTimerDurationFast.length());
            } else {
                this.f33151w.clear();
                this.f33151w.append((CharSequence) formatTimerDurationFast);
            }
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j15 = this.f33148n;
        if (j15 == j10) {
            min = 16;
        } else {
            min = Math.min(50L, elapsedRealtime - j15);
        }
        this.f33148n = elapsedRealtime;
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
            this.f33151w.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.f33151w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            canvas.translate(0.0f, measuredHeight - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            this.H = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.f33152x;
            float f11 = this.G;
            if (staticLayout2 != null) {
                canvas.save();
                this.F.setAlpha((int) ((1.0f - this.E) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.f33152x.getHeight() / 2.0f)) - (this.E * f11));
                this.f33152x.draw(canvas);
                canvas.restore();
            }
            if (this.f33153y != null) {
                canvas.save();
                this.F.setAlpha((int) (this.E * 255.0f));
                canvas.translate(0.0f, com.google.android.gms.internal.vision.e2.z(1.0f, this.E, f11, measuredHeight - (this.f33153y.getHeight() / 2.0f)));
                this.f33153y.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.F.setAlpha(255);
            StaticLayout staticLayout3 = new StaticLayout(this.f33151w, this.F, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.translate(0.0f, measuredHeight - (staticLayout3.getHeight() / 2.0f));
            staticLayout3.draw(canvas);
            canvas.restore();
            this.H = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.f33145c = formatTimerDurationFast;
        if ((this.f33143a || this.E != 0.0f) && !this.f33149r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z10) {
        this.f33149r = z10;
        this.f33148n = SystemClock.elapsedRealtime();
        invalidate();
    }
}

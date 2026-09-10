package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public class oo0 extends FrameLayout {
    public static float[] f25858j0;
    public static Path f25859k0;
    public final org.telegram.ui.Cells.z E;
    public float F;
    public final int[] G;
    public float H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final org.telegram.ui.ActionBar.f6 M;
    public final mo0 N;
    public boolean O;
    public float P;
    public float Q;
    public int R;
    public ArrayList S;
    public CharSequence T;
    public long U;
    public float V;
    public int W;
    public final org.telegram.ui.Cells.f1 f25860a;
    public StaticLayout[] f25861a0;
    public final Paint f25862b;
    public TextPaint f25863b0;
    public final Paint f25864c;
    public float f25865c0;
    public final int d;
    public int f25866d0;
    public final int e;
    public long f25867e0;
    public int f25868f;
    public float f25869f0;
    public final RectF f25870g0;
    public final d6 h;
    public int f25871h0;
    public int f25872i0;
    public int f25873n;
    public float f25874r;
    public float f25875s;
    public boolean v;
    public no0 f25876w;
    public boolean f25877x;
    public float f25878y;

    public oo0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i10;
        int i11 = this.e;
        float f7 = i11 / 2.0f;
        int i12 = 0;
        if (this.U > 600000) {
            i10 = AndroidUtilities.dp(42.0f);
        } else {
            i10 = 0;
        }
        float f10 = f7 + i10;
        float measuredWidth = getMeasuredWidth() - (i11 / 2.0f);
        if (this.U > 600000) {
            i12 = AndroidUtilities.dp(42.0f);
        }
        return (int) (Math.abs(f10 - (measuredWidth - i12)) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i10) {
        if (this.f25871h0 != i10) {
            this.f25871h0 = i10;
            if (i10 >= 0 && i10 < this.S.size()) {
                this.N.setText((CharSequence) ((Pair) this.S.get(this.f25871h0)).second);
            }
        }
    }

    public final void a(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oo0.a(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final StaticLayout b(int i10, CharSequence charSequence) {
        CharSequence charSequence2;
        if (this.f25863b0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.f25863b0 = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.f25863b0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, this.M));
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.f25863b0, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.f25863b0, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i10));
    }

    public final int c() {
        return Math.max((int) (this.f25875s * (getMeasuredWidth() - this.e)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.P = motionEvent.getX();
            this.Q = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.E;
        int i10 = this.d;
        int i11 = this.e;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.O) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.Q) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.P) > viewConfiguration.getScaledTouchSlop()) {
                        this.O = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        int measuredHeight = (getMeasuredHeight() - i10) / 2;
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            if (this.f25868f - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.f25868f + i10 + measuredHeight) {
                                int x10 = ((int) motionEvent.getX()) - (i10 / 2);
                                this.f25868f = x10;
                                if (x10 < c()) {
                                    this.f25868f = c();
                                } else if (this.f25868f > getMeasuredWidth() - i11) {
                                    this.f25868f = getMeasuredWidth() - i11;
                                }
                            }
                            this.f25873n = (int) (motionEvent.getX() - this.f25868f);
                            this.v = true;
                            this.f25876w.y();
                            if (zVar != null) {
                                zVar.setState(this.G);
                                zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.v) {
                    int x11 = (int) (motionEvent.getX() - this.f25873n);
                    this.f25868f = x11;
                    if (x11 < c()) {
                        this.f25868f = c();
                    } else if (this.f25868f > getMeasuredWidth() - i11) {
                        this.f25868f = getMeasuredWidth() - i11;
                    }
                    if (this.f25877x) {
                        if (this.L) {
                            float measuredWidth = (getMeasuredWidth() - i11) / 2;
                            float f7 = this.f25868f;
                            if (f7 >= measuredWidth) {
                                f((f7 - measuredWidth) / measuredWidth, false);
                            } else {
                                f(-Math.max(0.01f, 1.0f - ((measuredWidth - f7) / measuredWidth)), false);
                            }
                        } else {
                            f(this.f25868f / (getMeasuredWidth() - i11), false);
                        }
                    }
                    if (zVar != null) {
                        zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                    invalidate();
                    return true;
                }
            }
        } else {
            this.O = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.Q) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight2 = (getMeasuredHeight() - i10) / 2;
                    if (this.f25868f - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.f25868f + i10 + measuredHeight2) {
                        int x12 = ((int) motionEvent.getX()) - (i10 / 2);
                        this.f25868f = x12;
                        if (x12 < c()) {
                            this.f25868f = c();
                        } else if (this.f25868f > getMeasuredWidth() - i11) {
                            this.f25868f = getMeasuredWidth() - i11;
                        }
                    }
                    this.f25873n = (int) (motionEvent.getX() - this.f25868f);
                    this.v = true;
                }
            }
            if (this.v) {
                if (motionEvent.getAction() == 1) {
                    if (this.L) {
                        float measuredWidth2 = (getMeasuredWidth() - i11) / 2;
                        float f10 = this.f25868f;
                        if (f10 >= measuredWidth2) {
                            f((f10 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f10) / measuredWidth2)), false);
                        }
                    } else {
                        f(this.f25868f / (getMeasuredWidth() - i11), true);
                    }
                }
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
                this.f25876w.y();
                this.v = false;
                AndroidUtilities.runOnUIThread(new kc0(this, 25), 50L);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(float f7, boolean z10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.f25874r = f7;
            return;
        }
        this.f25874r = -100.0f;
        boolean z11 = this.L;
        int i10 = this.e;
        if (z11) {
            float measuredWidth = (getMeasuredWidth() - i10) / 2;
            if (f7 < 0.0f) {
                ceil = Math.ceil(((-(f7 + 1.0f)) * measuredWidth) + measuredWidth);
            } else {
                ceil = Math.ceil((f7 * measuredWidth) + measuredWidth);
            }
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i10) * f7);
        }
        int i11 = (int) ceil;
        int i12 = this.f25868f;
        if (i12 != i11) {
            if (z10) {
                this.I = i12;
                this.H = 0.0f;
            }
            this.f25868f = i11;
            if (i11 < c()) {
                this.f25868f = c();
            } else if (this.f25868f > getMeasuredWidth() - i10) {
                this.f25868f = getMeasuredWidth() - i10;
            }
            invalidate();
        }
    }

    public final void f(float f7, boolean z10) {
        no0 no0Var = this.f25876w;
        if (no0Var != null) {
            no0Var.W(f7, z10);
        }
        int i10 = this.J;
        if (i10 > 1) {
            int round = Math.round((i10 - 1) * f7);
            if (!z10 && round != this.R) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.R = round;
        }
    }

    public final void g(MessageObject messageObject) {
        boolean z10;
        Integer parseInt;
        String str;
        Long valueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (valueOf.longValue() < 0) {
            this.S = null;
            this.W = -1;
            this.V = 0.0f;
            StaticLayout[] staticLayoutArr = this.f25861a0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.T = null;
            this.U = -1L;
            return;
        }
        CharSequence charSequence = messageObject.caption;
        if (messageObject.isYouTubeVideo()) {
            if (messageObject.youtubeDescription == null && (str = messageObject.messageOwner.media.webpage.description) != null) {
                messageObject.youtubeDescription = SpannableString.valueOf(str);
                MessageObject.addUrlsByPattern(messageObject.isOut(), messageObject.youtubeDescription, false, 3, (int) valueOf.longValue(), false);
            }
            charSequence = messageObject.youtubeDescription;
        }
        if (charSequence != this.T) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.U != valueOf.longValue()) {
            this.T = charSequence;
            this.U = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.f25872i0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.S = null;
                this.W = -1;
                this.V = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f25861a0;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                z51[] z51VarArr = (z51[]) spanned.getSpans(0, spanned.length(), z51.class);
                this.S = new ArrayList();
                if (z10) {
                    this.V = 0.0f;
                }
                if (this.f25863b0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f25863b0 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.f25863b0.setColor(-1);
                }
                for (z51 z51Var : z51VarArr) {
                    if (z51Var != null && z51Var.getURL() != null && z51Var.d != null && z51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) z51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                        float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(z51Var.d);
                        Emoji.replaceEmoji(spannableStringBuilder, this.f25863b0.getFontMetricsInt(), false);
                        this.S.add(new Pair(Float.valueOf(intValue), spannableStringBuilder));
                    }
                }
                Collections.sort(this.S, new m9(8));
            } catch (Exception e) {
                FileLog.e(e);
                this.S = null;
                this.W = -1;
                this.V = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.f25861a0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        if (getMeasuredWidth() == 0) {
            return this.f25874r;
        }
        return this.f25868f / (getMeasuredWidth() - this.e);
    }

    public lo0 getSeekBarAccessibilityDelegate() {
        return this.f25860a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10;
        int i10;
        int i11;
        float f12;
        float f13;
        float f14;
        float measuredWidth;
        Canvas canvas2 = canvas;
        int i12 = this.f25868f;
        boolean z11 = this.L;
        int i13 = this.e;
        if (!z11 && this.J > 1) {
            i12 = (int) this.h.d(Math.round(i12 / measuredWidth) * ((getMeasuredWidth() - i13) / (this.J - 1.0f)), false);
        }
        int i14 = i12;
        int measuredHeight = getMeasuredHeight();
        int i15 = this.d;
        int i16 = (measuredHeight - i15) / 2;
        int i17 = org.telegram.ui.ActionBar.j6.Ti;
        org.telegram.ui.ActionBar.f6 f6Var = this.M;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i17, f6Var);
        Paint paint = this.f25862b;
        paint.setColor(v02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f15 = i13 / 2.0f;
        int i18 = i13 / 2;
        float measuredWidth2 = getMeasuredWidth() - i18;
        float dp = measuredHeight2 - (AndroidUtilities.dp(this.K) / 2.0f);
        float dp2 = (AndroidUtilities.dp(this.K) / 2.0f) + measuredHeight2;
        RectF rectF = this.f25870g0;
        rectF.set(f15, dp, measuredWidth2, dp2);
        a(canvas2, rectF, paint);
        if (this.f25878y > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Ui, f6Var));
            f7 = 0.0f;
            rectF.set(f15, dp, (this.f25878y * (getMeasuredWidth() - i13)) + f15, dp2);
            a(canvas2, rectF, paint);
        } else {
            f7 = 0.0f;
        }
        boolean z12 = this.L;
        float f16 = 6.0f;
        Paint paint2 = this.f25864c;
        if (z12) {
            canvas2.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i14 > (getMeasuredWidth() - i13) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i18 + i14, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i18 + i14, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f15 = f15;
        } else {
            float f17 = this.f25875s;
            if (f17 >= f7) {
                float f18 = measuredWidth2 - f15;
                rectF.set((f17 * f18) + f15, dp, i14 + f15, dp2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f15, dp, (this.f25875s * f18) + f15, dp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f15, dp, i14 + f15, dp2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.z zVar = this.E;
        if (zVar != null) {
            int dp3 = (i18 + i14) - AndroidUtilities.dp(16.0f);
            int dp4 = ((i15 / 2) + i16) - AndroidUtilities.dp(16.0f);
            zVar.setBounds(dp3, dp4, AndroidUtilities.dp(32.0f) + dp3, AndroidUtilities.dp(32.0f) + dp4);
            zVar.draw(canvas2);
        }
        if (this.v) {
            f16 = 8.0f;
        }
        int dp5 = AndroidUtilities.dp(f16);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f19 = this.F;
        float f20 = dp5;
        if (f19 != f20) {
            if (f19 < f20) {
                f10 = 16.0f;
                f11 = 8.0f;
                float e = a4.a.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f19);
                this.F = e;
                if (e > f20) {
                    this.F = f20;
                }
            } else {
                f10 = 16.0f;
                f11 = 8.0f;
                float c10 = org.telegram.messenger.em.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f19);
                this.F = c10;
                if (c10 < f20) {
                    this.F = f20;
                }
            }
            z10 = true;
        } else {
            f10 = 16.0f;
            f11 = 8.0f;
            z10 = false;
        }
        float f21 = this.H;
        if (f21 < 1.0f) {
            float f22 = (((float) elapsedRealtime) / 225.0f) + f21;
            this.H = f22;
            if (f22 < 1.0f) {
                z10 = true;
            } else {
                this.H = 1.0f;
            }
        }
        float f23 = this.H;
        if (f23 < 1.0f) {
            float interpolation = 1.0f - pt.f26248c.getInterpolation(Math.min(1.0f, f23 * 3.0f));
            float interpolation2 = pt.d.getInterpolation(this.H);
            if (interpolation > f7) {
                canvas2.drawCircle(i18 + this.I, (i15 / 2) + i16, this.F * interpolation, paint2);
            }
            canvas2.drawCircle(i18 + i14, (i15 / 2) + i16, this.F * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i18 + i14, (i15 / 2) + i16, this.F, paint2);
        }
        ArrayList arrayList = this.S;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.S.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((Float) ((Pair) this.S.get(size)).first).floatValue() - 0.001f <= progress) {
                        break;
                    }
                } else {
                    size = -1;
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.f25861a0 == null) {
                this.f25861a0 = new StaticLayout[2];
            }
            if (this.U > 600000) {
                i10 = AndroidUtilities.dp(42.0f);
            } else {
                i10 = 0;
            }
            float f24 = i10 + f15;
            float measuredWidth3 = getMeasuredWidth() - f15;
            if (this.U > 600000) {
                i11 = AndroidUtilities.dp(42.0f);
            } else {
                i11 = 0;
            }
            float abs = Math.abs(f24 - (measuredWidth3 - i11)) - AndroidUtilities.dp(66.0f);
            float f25 = this.f25869f0;
            if (f25 > f7 && Math.abs(f25 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.f25861a0;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.f25861a0;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.f25869f0 = abs;
            if (size != this.W) {
                StaticLayout[] staticLayoutArr3 = this.f25861a0;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.v) {
                    AndroidUtilities.vibrateCursor(this);
                }
                if (size >= 0 && size < this.S.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.S.get(size)).second;
                    if (charSequence == null) {
                        this.f25861a0[0] = null;
                    } else {
                        this.f25861a0[0] = b((int) abs, charSequence);
                    }
                } else {
                    this.f25861a0[0] = null;
                }
                this.f25865c0 = 0.0f;
                if (size == -1) {
                    this.f25866d0 = -1;
                } else {
                    int i19 = this.W;
                    if (i19 == -1) {
                        this.f25866d0 = 1;
                    } else if (size < i19) {
                        this.f25866d0 = -1;
                    } else if (size > i19) {
                        this.f25866d0 = 1;
                    }
                }
                this.W = size;
            }
            if (this.f25865c0 < 1.0f) {
                long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f25867e0));
                if (this.S.size() > 8) {
                    f14 = 160.0f;
                } else {
                    f14 = 220.0f;
                }
                this.f25865c0 = Math.min((((float) min) / f14) + this.f25865c0, 1.0f);
                invalidate();
                this.f25867e0 = SystemClock.elapsedRealtime();
            }
            if (this.V < 1.0f) {
                this.V = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f25867e0))) / 200.0f) + this.V, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = wr.f28819f.getInterpolation(this.f25865c0);
            canvas2.save();
            canvas2.translate(f24 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.f25863b0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Si, f6Var));
            if (this.f25861a0[1] != null) {
                canvas2.save();
                if (this.f25866d0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate((AndroidUtilities.dp(f10) * (-this.f25866d0) * interpolation3) + AndroidUtilities.dp(f11), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.f25861a0[1].getHeight()) / 2.0f);
                this.f25863b0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.V));
                canvas2.restore();
            }
            if (this.f25861a0[0] != null) {
                canvas2.save();
                if (this.f25866d0 != 0) {
                    f12 = 0.0f;
                    canvas2.translate(com.google.android.gms.internal.vision.e2.z(1.0f, interpolation3, AndroidUtilities.dp(f10) * this.f25866d0, AndroidUtilities.dp(f11)), 0.0f);
                } else {
                    f12 = 0.0f;
                }
                canvas2.translate(f12, (-this.f25861a0[0].getHeight()) / 2.0f);
                this.f25863b0.setAlpha((int) (interpolation3 * 255.0f * this.V));
                canvas2.restore();
            }
            canvas2.restore();
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2);
        mo0 mo0Var = this.N;
        int measuredHeight = (mo0Var.getMeasuredHeight() / 2) + dp;
        int i15 = this.e / 2;
        if (this.U > 600000) {
            i14 = AndroidUtilities.dp(42.0f);
        } else {
            i14 = 0;
        }
        int dp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + i15 + i14;
        mo0Var.layout(dp2, measuredHeight - mo0Var.getMeasuredHeight(), mo0Var.getMeasuredWidth() + dp2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f25872i0 = timestampLabelWidth;
        this.N.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.f25874r != -100.0f && getMeasuredWidth() > 0) {
            setProgress(this.f25874r);
            this.f25874r = -100.0f;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f7) {
        this.f25878y = f7;
        invalidate();
    }

    public void setDelegate(no0 no0Var) {
        this.f25876w = no0Var;
    }

    public void setInnerColor(int i10) {
        this.f25862b.setColor(i10);
    }

    public void setLineWidth(int i10) {
        this.K = i10;
    }

    public void setMinProgress(float f7) {
        this.f25875s = f7;
        float progress = getProgress();
        float f10 = this.f25875s;
        if (progress < f10) {
            e(f10, false);
        }
        invalidate();
    }

    public void setOuterColor(int i10) {
        this.f25864c.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.E;
        if (zVar != null) {
            org.telegram.ui.ActionBar.j6.B1(zVar, i0.a.k(i10, 40), true);
        }
    }

    public void setProgress(float f7) {
        e(f7, false);
    }

    public void setReportChanges(boolean z10) {
        this.f25877x = z10;
    }

    public void setSeparatorsCount(int i10) {
        this.J = i10;
    }

    public void setTwoSided(boolean z10) {
        this.L = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.E) {
            return false;
        }
        return true;
    }

    public oo0(Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.h = new d6(this, 0L, 60L, wr.f28820g);
        this.f25874r = -100.0f;
        this.f25875s = -1.0f;
        this.G = new int[]{16842910, 16842919};
        this.H = 1.0f;
        this.K = 3;
        this.V = 0.0f;
        this.W = -1;
        this.f25865c0 = 1.0f;
        this.f25869f0 = -1.0f;
        this.f25870g0 = new RectF();
        this.f25871h0 = -1;
        this.M = f6Var;
        setWillNotDraw(false);
        this.f25862b = new Paint(1);
        Paint paint = new Paint(1);
        this.f25864c = paint;
        int i10 = org.telegram.ui.ActionBar.j6.Vi;
        paint.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.e = AndroidUtilities.dp(32.0f);
        this.d = AndroidUtilities.dp(24.0f);
        this.F = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), 40), 1, AndroidUtilities.dp(16.0f));
        this.E = f02;
        f02.setCallback(this);
        f02.setVisible(true, false);
        mo0 mo0Var = new mo0(this, context, context, 0);
        this.N = mo0Var;
        mo0Var.f22322x = true;
        addView(mo0Var, w7.a6.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(this, z10);
        this.f25860a = f1Var;
        setAccessibilityDelegate(f1Var);
    }
}

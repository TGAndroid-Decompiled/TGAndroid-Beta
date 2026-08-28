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
public class pn0 extends FrameLayout {
    public static float[] f31696f0;
    public static Path f31697g0;
    public final org.telegram.ui.Cells.z A;
    public float B;
    public final int[] C;
    public float D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final org.telegram.ui.ActionBar.b6 I;
    public final nn0 J;
    public boolean K;
    public float L;
    public float M;
    public int N;
    public ArrayList O;
    public CharSequence P;
    public long Q;
    public float R;
    public int S;
    public StaticLayout[] T;
    public TextPaint U;
    public float V;
    public int W;
    public final org.telegram.ui.Cells.f1 f31698a;
    public long f31699a0;
    public final Paint f31700b;
    public float f31701b0;
    public final Paint f31702c;
    public final RectF f31703c0;
    public final int d;
    public int f31704d0;
    public final int f31705e;
    public int f31706e0;
    public int f31707f;
    public final y5 h;
    public int f31708n;
    public float f31709r;
    public float f31710s;
    public boolean v;
    public on0 f31711w;
    public boolean f31712x;
    public float f31713y;

    public pn0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i9;
        int i10 = this.f31705e;
        float f10 = i10 / 2.0f;
        int i11 = 0;
        if (this.Q > 600000) {
            i9 = AndroidUtilities.dp(42.0f);
        } else {
            i9 = 0;
        }
        float f11 = f10 + i9;
        float measuredWidth = getMeasuredWidth() - (i10 / 2.0f);
        if (this.Q > 600000) {
            i11 = AndroidUtilities.dp(42.0f);
        }
        return (int) (Math.abs(f11 - (measuredWidth - i11)) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i9) {
        if (this.f31704d0 != i9) {
            this.f31704d0 = i9;
            if (i9 >= 0 && i9 < this.O.size()) {
                this.J.setText((CharSequence) ((Pair) this.O.get(this.f31704d0)).second);
            }
        }
    }

    public final void a(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pn0.a(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final StaticLayout b(int i9, CharSequence charSequence) {
        CharSequence charSequence2;
        if (this.U == null) {
            TextPaint textPaint = new TextPaint(1);
            this.U = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.U.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Si, this.I));
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.U, i9).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i9)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.U, i9, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i9));
    }

    public final int c() {
        return Math.max((int) (this.f31710s * (getMeasuredWidth() - this.f31705e)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.L = motionEvent.getX();
            this.M = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.A;
        int i9 = this.d;
        int i10 = this.f31705e;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.K) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.M) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.L) > viewConfiguration.getScaledTouchSlop()) {
                        this.K = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        int measuredHeight = (getMeasuredHeight() - i9) / 2;
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            if (this.f31707f - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.f31707f + i9 + measuredHeight) {
                                int x10 = ((int) motionEvent.getX()) - (i9 / 2);
                                this.f31707f = x10;
                                if (x10 < c()) {
                                    this.f31707f = c();
                                } else if (this.f31707f > getMeasuredWidth() - i10) {
                                    this.f31707f = getMeasuredWidth() - i10;
                                }
                            }
                            this.f31708n = (int) (motionEvent.getX() - this.f31707f);
                            this.v = true;
                            this.f31711w.n();
                            if (zVar != null) {
                                zVar.setState(this.C);
                                zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.v) {
                    int x11 = (int) (motionEvent.getX() - this.f31708n);
                    this.f31707f = x11;
                    if (x11 < c()) {
                        this.f31707f = c();
                    } else if (this.f31707f > getMeasuredWidth() - i10) {
                        this.f31707f = getMeasuredWidth() - i10;
                    }
                    if (this.f31712x) {
                        if (this.H) {
                            float measuredWidth = (getMeasuredWidth() - i10) / 2;
                            float f10 = this.f31707f;
                            if (f10 >= measuredWidth) {
                                f((f10 - measuredWidth) / measuredWidth, false);
                            } else {
                                f(-Math.max(0.01f, 1.0f - ((measuredWidth - f10) / measuredWidth)), false);
                            }
                        } else {
                            f(this.f31707f / (getMeasuredWidth() - i10), false);
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
            this.K = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.M) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight2 = (getMeasuredHeight() - i9) / 2;
                    if (this.f31707f - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.f31707f + i9 + measuredHeight2) {
                        int x12 = ((int) motionEvent.getX()) - (i9 / 2);
                        this.f31707f = x12;
                        if (x12 < c()) {
                            this.f31707f = c();
                        } else if (this.f31707f > getMeasuredWidth() - i10) {
                            this.f31707f = getMeasuredWidth() - i10;
                        }
                    }
                    this.f31708n = (int) (motionEvent.getX() - this.f31707f);
                    this.v = true;
                }
            }
            if (this.v) {
                if (motionEvent.getAction() == 1) {
                    if (this.H) {
                        float measuredWidth2 = (getMeasuredWidth() - i10) / 2;
                        float f11 = this.f31707f;
                        if (f11 >= measuredWidth2) {
                            f((f11 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f11) / measuredWidth2)), false);
                        }
                    } else {
                        f(this.f31707f / (getMeasuredWidth() - i10), true);
                    }
                }
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
                this.f31711w.n();
                this.v = false;
                AndroidUtilities.runOnUIThread(new ib0(this, 25), 50L);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(float f10, boolean z10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.f31709r = f10;
            return;
        }
        this.f31709r = -100.0f;
        boolean z11 = this.H;
        int i9 = this.f31705e;
        if (z11) {
            float measuredWidth = (getMeasuredWidth() - i9) / 2;
            if (f10 < 0.0f) {
                ceil = Math.ceil(((-(f10 + 1.0f)) * measuredWidth) + measuredWidth);
            } else {
                ceil = Math.ceil((f10 * measuredWidth) + measuredWidth);
            }
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i9) * f10);
        }
        int i10 = (int) ceil;
        int i11 = this.f31707f;
        if (i11 != i10) {
            if (z10) {
                this.E = i11;
                this.D = 0.0f;
            }
            this.f31707f = i10;
            if (i10 < c()) {
                this.f31707f = c();
            } else if (this.f31707f > getMeasuredWidth() - i9) {
                this.f31707f = getMeasuredWidth() - i9;
            }
            invalidate();
        }
    }

    public final void f(float f10, boolean z10) {
        on0 on0Var = this.f31711w;
        if (on0Var != null) {
            on0Var.Q(f10, z10);
        }
        int i9 = this.F;
        if (i9 > 1) {
            int round = Math.round((i9 - 1) * f10);
            if (!z10 && round != this.N) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.N = round;
        }
    }

    public final void g(MessageObject messageObject) {
        boolean z10;
        Integer parseInt;
        String str;
        Long valueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (valueOf.longValue() < 0) {
            this.O = null;
            this.S = -1;
            this.R = 0.0f;
            StaticLayout[] staticLayoutArr = this.T;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.P = null;
            this.Q = -1L;
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
        if (charSequence != this.P) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.Q != valueOf.longValue()) {
            this.P = charSequence;
            this.Q = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.f31706e0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.O = null;
                this.S = -1;
                this.R = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.T;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                p41[] p41VarArr = (p41[]) spanned.getSpans(0, spanned.length(), p41.class);
                this.O = new ArrayList();
                if (z10) {
                    this.R = 0.0f;
                }
                if (this.U == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.U = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.U.setColor(-1);
                }
                for (p41 p41Var : p41VarArr) {
                    if (p41Var != null && p41Var.getURL() != null && p41Var.d != null && p41Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) p41Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                        float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(p41Var.d);
                        Emoji.replaceEmoji(spannableStringBuilder, this.U.getFontMetricsInt(), false);
                        this.O.add(new Pair(Float.valueOf(intValue), spannableStringBuilder));
                    }
                }
                Collections.sort(this.O, new jn0(1));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.O = null;
                this.S = -1;
                this.R = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.T;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        if (getMeasuredWidth() == 0) {
            return this.f31709r;
        }
        return this.f31707f / (getMeasuredWidth() - this.f31705e);
    }

    public mn0 getSeekBarAccessibilityDelegate() {
        return this.f31698a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        int i9;
        int i10;
        float f13;
        float f14;
        float f15;
        float measuredWidth;
        Canvas canvas2 = canvas;
        int i11 = this.f31707f;
        boolean z11 = this.H;
        int i12 = this.f31705e;
        if (!z11 && this.F > 1) {
            i11 = (int) this.h.d(Math.round(i11 / measuredWidth) * ((getMeasuredWidth() - i12) / (this.F - 1.0f)), false);
        }
        int i13 = i11;
        int measuredHeight = getMeasuredHeight();
        int i14 = this.d;
        int i15 = (measuredHeight - i14) / 2;
        int i16 = org.telegram.ui.ActionBar.f6.Ti;
        org.telegram.ui.ActionBar.b6 b6Var = this.I;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i16, b6Var);
        Paint paint = this.f31700b;
        paint.setColor(v02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f16 = i12 / 2.0f;
        int i17 = i12 / 2;
        float measuredWidth2 = getMeasuredWidth() - i17;
        float dp = measuredHeight2 - (AndroidUtilities.dp(this.G) / 2.0f);
        float dp2 = (AndroidUtilities.dp(this.G) / 2.0f) + measuredHeight2;
        RectF rectF = this.f31703c0;
        rectF.set(f16, dp, measuredWidth2, dp2);
        a(canvas2, rectF, paint);
        if (this.f31713y > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Ui, b6Var));
            f10 = 0.0f;
            rectF.set(f16, dp, (this.f31713y * (getMeasuredWidth() - i12)) + f16, dp2);
            a(canvas2, rectF, paint);
        } else {
            f10 = 0.0f;
        }
        boolean z12 = this.H;
        float f17 = 6.0f;
        Paint paint2 = this.f31702c;
        if (z12) {
            canvas2.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i13 > (getMeasuredWidth() - i12) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i17 + i13, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i17 + i13, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f16 = f16;
        } else {
            float f18 = this.f31710s;
            if (f18 >= f10) {
                float f19 = measuredWidth2 - f16;
                rectF.set((f18 * f19) + f16, dp, i13 + f16, dp2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f16, dp, (this.f31710s * f19) + f16, dp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f16, dp, i13 + f16, dp2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            int dp3 = (i17 + i13) - AndroidUtilities.dp(16.0f);
            int dp4 = ((i14 / 2) + i15) - AndroidUtilities.dp(16.0f);
            zVar.setBounds(dp3, dp4, AndroidUtilities.dp(32.0f) + dp3, AndroidUtilities.dp(32.0f) + dp4);
            zVar.draw(canvas2);
        }
        if (this.v) {
            f17 = 8.0f;
        }
        int dp5 = AndroidUtilities.dp(f17);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f20 = this.B;
        float f21 = dp5;
        if (f20 != f21) {
            if (f20 < f21) {
                f11 = 16.0f;
                f12 = 8.0f;
                float b10 = org.telegram.ui.Cells.j2.b((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f20);
                this.B = b10;
                if (b10 > f21) {
                    this.B = f21;
                }
            } else {
                f11 = 16.0f;
                f12 = 8.0f;
                float c10 = org.telegram.messenger.ll.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f20);
                this.B = c10;
                if (c10 < f21) {
                    this.B = f21;
                }
            }
            z10 = true;
        } else {
            f11 = 16.0f;
            f12 = 8.0f;
            z10 = false;
        }
        float f22 = this.D;
        if (f22 < 1.0f) {
            float f23 = (((float) elapsedRealtime) / 225.0f) + f22;
            this.D = f23;
            if (f23 < 1.0f) {
                z10 = true;
            } else {
                this.D = 1.0f;
            }
        }
        float f24 = this.D;
        if (f24 < 1.0f) {
            float interpolation = 1.0f - xs.f34753c.getInterpolation(Math.min(1.0f, f24 * 3.0f));
            float interpolation2 = xs.d.getInterpolation(this.D);
            if (interpolation > f10) {
                canvas2.drawCircle(i17 + this.E, (i14 / 2) + i15, this.B * interpolation, paint2);
            }
            canvas2.drawCircle(i17 + i13, (i14 / 2) + i15, this.B * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i17 + i13, (i14 / 2) + i15, this.B, paint2);
        }
        ArrayList arrayList = this.O;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.O.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((Float) ((Pair) this.O.get(size)).first).floatValue() - 0.001f <= progress) {
                        break;
                    }
                } else {
                    size = -1;
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.T == null) {
                this.T = new StaticLayout[2];
            }
            if (this.Q > 600000) {
                i9 = AndroidUtilities.dp(42.0f);
            } else {
                i9 = 0;
            }
            float f25 = i9 + f16;
            float measuredWidth3 = getMeasuredWidth() - f16;
            if (this.Q > 600000) {
                i10 = AndroidUtilities.dp(42.0f);
            } else {
                i10 = 0;
            }
            float abs = Math.abs(f25 - (measuredWidth3 - i10)) - AndroidUtilities.dp(66.0f);
            float f26 = this.f31701b0;
            if (f26 > f10 && Math.abs(f26 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.T;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.T;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.f31701b0 = abs;
            if (size != this.S) {
                StaticLayout[] staticLayoutArr3 = this.T;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.v) {
                    AndroidUtilities.vibrateCursor(this);
                }
                if (size >= 0 && size < this.O.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.O.get(size)).second;
                    if (charSequence == null) {
                        this.T[0] = null;
                    } else {
                        this.T[0] = b((int) abs, charSequence);
                    }
                } else {
                    this.T[0] = null;
                }
                this.V = 0.0f;
                if (size == -1) {
                    this.W = -1;
                } else {
                    int i18 = this.S;
                    if (i18 == -1) {
                        this.W = 1;
                    } else if (size < i18) {
                        this.W = -1;
                    } else if (size > i18) {
                        this.W = 1;
                    }
                }
                this.S = size;
            }
            if (this.V < 1.0f) {
                long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f31699a0));
                if (this.O.size() > 8) {
                    f15 = 160.0f;
                } else {
                    f15 = 220.0f;
                }
                this.V = Math.min((((float) min) / f15) + this.V, 1.0f);
                invalidate();
                this.f31699a0 = SystemClock.elapsedRealtime();
            }
            if (this.R < 1.0f) {
                this.R = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f31699a0))) / 200.0f) + this.R, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = gr.f28844f.getInterpolation(this.V);
            canvas2.save();
            canvas2.translate(f25 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.U.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Si, b6Var));
            if (this.T[1] != null) {
                canvas2.save();
                if (this.W != 0) {
                    f14 = 0.0f;
                    canvas2.translate((AndroidUtilities.dp(f11) * (-this.W) * interpolation3) + AndroidUtilities.dp(f12), 0.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas2.translate(f14, (-this.T[1].getHeight()) / 2.0f);
                this.U.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.R));
                canvas2.restore();
            }
            if (this.T[0] != null) {
                canvas2.save();
                if (this.W != 0) {
                    f13 = 0.0f;
                    canvas2.translate(e2.c.z(1.0f, interpolation3, AndroidUtilities.dp(f11) * this.W, AndroidUtilities.dp(f12)), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.T[0].getHeight()) / 2.0f);
                this.U.setAlpha((int) (interpolation3 * 255.0f * this.R));
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        super.onLayout(z10, i9, i10, i11, i12);
        int dp = AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2);
        nn0 nn0Var = this.J;
        int measuredHeight = (nn0Var.getMeasuredHeight() / 2) + dp;
        int i14 = this.f31705e / 2;
        if (this.Q > 600000) {
            i13 = AndroidUtilities.dp(42.0f);
        } else {
            i13 = 0;
        }
        int dp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + i14 + i13;
        nn0Var.layout(dp2, measuredHeight - nn0Var.getMeasuredHeight(), nn0Var.getMeasuredWidth() + dp2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f31706e0 = timestampLabelWidth;
        this.J.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.f31709r != -100.0f && getMeasuredWidth() > 0) {
            setProgress(this.f31709r);
            this.f31709r = -100.0f;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f10) {
        this.f31713y = f10;
        invalidate();
    }

    public void setDelegate(on0 on0Var) {
        this.f31711w = on0Var;
    }

    public void setInnerColor(int i9) {
        this.f31700b.setColor(i9);
    }

    public void setLineWidth(int i9) {
        this.G = i9;
    }

    public void setMinProgress(float f10) {
        this.f31710s = f10;
        float progress = getProgress();
        float f11 = this.f31710s;
        if (progress < f11) {
            e(f11, false);
        }
        invalidate();
    }

    public void setOuterColor(int i9) {
        this.f31702c.setColor(i9);
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            org.telegram.ui.ActionBar.f6.B1(zVar, i0.a.k(i9, 40), true);
        }
    }

    public void setProgress(float f10) {
        e(f10, false);
    }

    public void setReportChanges(boolean z10) {
        this.f31712x = z10;
    }

    public void setSeparatorsCount(int i9) {
        this.F = i9;
    }

    public void setTwoSided(boolean z10) {
        this.H = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A) {
            return false;
        }
        return true;
    }

    public pn0(Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.h = new y5(this, 0L, 60L, gr.f28845g);
        this.f31709r = -100.0f;
        this.f31710s = -1.0f;
        this.C = new int[]{16842910, 16842919};
        this.D = 1.0f;
        this.G = 3;
        this.R = 0.0f;
        this.S = -1;
        this.V = 1.0f;
        this.f31701b0 = -1.0f;
        this.f31703c0 = new RectF();
        this.f31704d0 = -1;
        this.I = b6Var;
        setWillNotDraw(false);
        this.f31700b = new Paint(1);
        Paint paint = new Paint(1);
        this.f31702c = paint;
        int i9 = org.telegram.ui.ActionBar.f6.Vi;
        paint.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        this.f31705e = AndroidUtilities.dp(32.0f);
        this.d = AndroidUtilities.dp(24.0f);
        this.B = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.f6.f0(i0.a.k(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), 40), 1, AndroidUtilities.dp(16.0f));
        this.A = f02;
        f02.setCallback(this);
        f02.setVisible(true, false);
        nn0 nn0Var = new nn0(this, context, context, 0);
        this.J = nn0Var;
        nn0Var.f34134x = true;
        addView(nn0Var, g7.e6.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(this, z10);
        this.f31698a = f1Var;
        setAccessibilityDelegate(f1Var);
    }
}

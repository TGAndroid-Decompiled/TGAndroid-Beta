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
public class ao0 extends FrameLayout {
    public static float[] f26810f0;
    public static Path f26811g0;
    public final org.telegram.ui.Cells.z A;
    public float B;
    public final int[] C;
    public float D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final org.telegram.ui.ActionBar.c6 I;
    public final yn0 J;
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
    public final org.telegram.ui.Cells.e1 f26812a;
    public long f26813a0;
    public final Paint f26814b;
    public float f26815b0;
    public final Paint f26816c;
    public final RectF f26817c0;
    public final int d;
    public int f26818d0;
    public final int f26819e;
    public int f26820e0;
    public int f26821f;
    public final d6 h;
    public int f26822n;
    public float f26823r;
    public float f26824s;
    public boolean v;
    public zn0 f26825w;
    public boolean f26826x;
    public float f26827y;

    public ao0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i10;
        int i11 = this.f26819e;
        float f9 = i11 / 2.0f;
        int i12 = 0;
        if (this.Q > 600000) {
            i10 = AndroidUtilities.dp(42.0f);
        } else {
            i10 = 0;
        }
        float f10 = f9 + i10;
        float measuredWidth = getMeasuredWidth() - (i11 / 2.0f);
        if (this.Q > 600000) {
            i12 = AndroidUtilities.dp(42.0f);
        }
        return (int) (Math.abs(f10 - (measuredWidth - i12)) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i10) {
        if (this.f26818d0 != i10) {
            this.f26818d0 = i10;
            if (i10 >= 0 && i10 < this.O.size()) {
                this.J.setText((CharSequence) ((Pair) this.O.get(this.f26818d0)).second);
            }
        }
    }

    public final void a(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ao0.a(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final StaticLayout b(int i10, CharSequence charSequence) {
        CharSequence charSequence2;
        if (this.U == null) {
            TextPaint textPaint = new TextPaint(1);
            this.U = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.U.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Si, this.I));
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.U, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.U, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i10));
    }

    public final int c() {
        return Math.max((int) (this.f26824s * (getMeasuredWidth() - this.f26819e)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.L = motionEvent.getX();
            this.M = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.A;
        int i10 = this.d;
        int i11 = this.f26819e;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.K) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.M) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.L) > viewConfiguration.getScaledTouchSlop()) {
                        this.K = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        int measuredHeight = (getMeasuredHeight() - i10) / 2;
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            if (this.f26821f - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.f26821f + i10 + measuredHeight) {
                                int x4 = ((int) motionEvent.getX()) - (i10 / 2);
                                this.f26821f = x4;
                                if (x4 < c()) {
                                    this.f26821f = c();
                                } else if (this.f26821f > getMeasuredWidth() - i11) {
                                    this.f26821f = getMeasuredWidth() - i11;
                                }
                            }
                            this.f26822n = (int) (motionEvent.getX() - this.f26821f);
                            this.v = true;
                            this.f26825w.v();
                            if (zVar != null) {
                                zVar.setState(this.C);
                                zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.v) {
                    int x10 = (int) (motionEvent.getX() - this.f26822n);
                    this.f26821f = x10;
                    if (x10 < c()) {
                        this.f26821f = c();
                    } else if (this.f26821f > getMeasuredWidth() - i11) {
                        this.f26821f = getMeasuredWidth() - i11;
                    }
                    if (this.f26826x) {
                        if (this.H) {
                            float measuredWidth = (getMeasuredWidth() - i11) / 2;
                            float f9 = this.f26821f;
                            if (f9 >= measuredWidth) {
                                f((f9 - measuredWidth) / measuredWidth, false);
                            } else {
                                f(-Math.max(0.01f, 1.0f - ((measuredWidth - f9) / measuredWidth)), false);
                            }
                        } else {
                            f(this.f26821f / (getMeasuredWidth() - i11), false);
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
                    int measuredHeight2 = (getMeasuredHeight() - i10) / 2;
                    if (this.f26821f - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.f26821f + i10 + measuredHeight2) {
                        int x11 = ((int) motionEvent.getX()) - (i10 / 2);
                        this.f26821f = x11;
                        if (x11 < c()) {
                            this.f26821f = c();
                        } else if (this.f26821f > getMeasuredWidth() - i11) {
                            this.f26821f = getMeasuredWidth() - i11;
                        }
                    }
                    this.f26822n = (int) (motionEvent.getX() - this.f26821f);
                    this.v = true;
                }
            }
            if (this.v) {
                if (motionEvent.getAction() == 1) {
                    if (this.H) {
                        float measuredWidth2 = (getMeasuredWidth() - i11) / 2;
                        float f10 = this.f26821f;
                        if (f10 >= measuredWidth2) {
                            f((f10 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f10) / measuredWidth2)), false);
                        }
                    } else {
                        f(this.f26821f / (getMeasuredWidth() - i11), true);
                    }
                }
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
                this.f26825w.v();
                this.v = false;
                AndroidUtilities.runOnUIThread(new xb0(this, 25), 50L);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(float f9, boolean z10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.f26823r = f9;
            return;
        }
        this.f26823r = -100.0f;
        boolean z11 = this.H;
        int i10 = this.f26819e;
        if (z11) {
            float measuredWidth = (getMeasuredWidth() - i10) / 2;
            if (f9 < 0.0f) {
                ceil = Math.ceil(((-(f9 + 1.0f)) * measuredWidth) + measuredWidth);
            } else {
                ceil = Math.ceil((f9 * measuredWidth) + measuredWidth);
            }
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i10) * f9);
        }
        int i11 = (int) ceil;
        int i12 = this.f26821f;
        if (i12 != i11) {
            if (z10) {
                this.E = i12;
                this.D = 0.0f;
            }
            this.f26821f = i11;
            if (i11 < c()) {
                this.f26821f = c();
            } else if (this.f26821f > getMeasuredWidth() - i10) {
                this.f26821f = getMeasuredWidth() - i10;
            }
            invalidate();
        }
    }

    public final void f(float f9, boolean z10) {
        zn0 zn0Var = this.f26825w;
        if (zn0Var != null) {
            zn0Var.W(f9, z10);
        }
        int i10 = this.F;
        if (i10 > 1) {
            int round = Math.round((i10 - 1) * f9);
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
            if (getTimestampLabelWidth() != this.f26820e0) {
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
                a51[] a51VarArr = (a51[]) spanned.getSpans(0, spanned.length(), a51.class);
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
                for (a51 a51Var : a51VarArr) {
                    if (a51Var != null && a51Var.getURL() != null && a51Var.d != null && a51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) a51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                        float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a51Var.d);
                        Emoji.replaceEmoji(spannableStringBuilder, this.U.getFontMetricsInt(), false);
                        this.O.add(new Pair(Float.valueOf(intValue), spannableStringBuilder));
                    }
                }
                Collections.sort(this.O, new lh.e4(29));
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
            return this.f26823r;
        }
        return this.f26821f / (getMeasuredWidth() - this.f26819e);
    }

    public xn0 getSeekBarAccessibilityDelegate() {
        return this.f26812a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
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
        int i12 = this.f26821f;
        boolean z11 = this.H;
        int i13 = this.f26819e;
        if (!z11 && this.F > 1) {
            i12 = (int) this.h.d(Math.round(i12 / measuredWidth) * ((getMeasuredWidth() - i13) / (this.F - 1.0f)), false);
        }
        int i14 = i12;
        int measuredHeight = getMeasuredHeight();
        int i15 = this.d;
        int i16 = (measuredHeight - i15) / 2;
        int i17 = org.telegram.ui.ActionBar.g6.Ti;
        org.telegram.ui.ActionBar.c6 c6Var = this.I;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i17, c6Var);
        Paint paint = this.f26814b;
        paint.setColor(v02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f15 = i13 / 2.0f;
        int i18 = i13 / 2;
        float measuredWidth2 = getMeasuredWidth() - i18;
        float dp = measuredHeight2 - (AndroidUtilities.dp(this.G) / 2.0f);
        float dp2 = (AndroidUtilities.dp(this.G) / 2.0f) + measuredHeight2;
        RectF rectF = this.f26817c0;
        rectF.set(f15, dp, measuredWidth2, dp2);
        a(canvas2, rectF, paint);
        if (this.f26827y > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ui, c6Var));
            f9 = 0.0f;
            rectF.set(f15, dp, (this.f26827y * (getMeasuredWidth() - i13)) + f15, dp2);
            a(canvas2, rectF, paint);
        } else {
            f9 = 0.0f;
        }
        boolean z12 = this.H;
        float f16 = 6.0f;
        Paint paint2 = this.f26816c;
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
            float f17 = this.f26824s;
            if (f17 >= f9) {
                float f18 = measuredWidth2 - f15;
                rectF.set((f17 * f18) + f15, dp, i14 + f15, dp2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f15, dp, (this.f26824s * f18) + f15, dp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f15, dp, i14 + f15, dp2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.z zVar = this.A;
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
        float f19 = this.B;
        float f20 = dp5;
        if (f19 != f20) {
            if (f19 < f20) {
                f10 = 16.0f;
                f11 = 8.0f;
                float c3 = u3.c.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f19);
                this.B = c3;
                if (c3 > f20) {
                    this.B = f20;
                }
            } else {
                f10 = 16.0f;
                f11 = 8.0f;
                float A = org.telegram.messenger.x3.A((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f19);
                this.B = A;
                if (A < f20) {
                    this.B = f20;
                }
            }
            z10 = true;
        } else {
            f10 = 16.0f;
            f11 = 8.0f;
            z10 = false;
        }
        float f21 = this.D;
        if (f21 < 1.0f) {
            float f22 = (((float) elapsedRealtime) / 225.0f) + f21;
            this.D = f22;
            if (f22 < 1.0f) {
                z10 = true;
            } else {
                this.D = 1.0f;
            }
        }
        float f23 = this.D;
        if (f23 < 1.0f) {
            float interpolation = 1.0f - ct.f27566c.getInterpolation(Math.min(1.0f, f23 * 3.0f));
            float interpolation2 = ct.d.getInterpolation(this.D);
            if (interpolation > f9) {
                canvas2.drawCircle(i18 + this.E, (i15 / 2) + i16, this.B * interpolation, paint2);
            }
            canvas2.drawCircle(i18 + i14, (i15 / 2) + i16, this.B * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i18 + i14, (i15 / 2) + i16, this.B, paint2);
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
                i10 = AndroidUtilities.dp(42.0f);
            } else {
                i10 = 0;
            }
            float f24 = i10 + f15;
            float measuredWidth3 = getMeasuredWidth() - f15;
            if (this.Q > 600000) {
                i11 = AndroidUtilities.dp(42.0f);
            } else {
                i11 = 0;
            }
            float abs = Math.abs(f24 - (measuredWidth3 - i11)) - AndroidUtilities.dp(66.0f);
            float f25 = this.f26815b0;
            if (f25 > f9 && Math.abs(f25 - abs) > 0.01f) {
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
            this.f26815b0 = abs;
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
                    int i19 = this.S;
                    if (i19 == -1) {
                        this.W = 1;
                    } else if (size < i19) {
                        this.W = -1;
                    } else if (size > i19) {
                        this.W = 1;
                    }
                }
                this.S = size;
            }
            if (this.V < 1.0f) {
                long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f26813a0));
                if (this.O.size() > 8) {
                    f14 = 160.0f;
                } else {
                    f14 = 220.0f;
                }
                this.V = Math.min((((float) min) / f14) + this.V, 1.0f);
                invalidate();
                this.f26813a0 = SystemClock.elapsedRealtime();
            }
            if (this.R < 1.0f) {
                this.R = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f26813a0))) / 200.0f) + this.R, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = jr.f29800f.getInterpolation(this.V);
            canvas2.save();
            canvas2.translate(f24 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.U.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Si, c6Var));
            if (this.T[1] != null) {
                canvas2.save();
                if (this.W != 0) {
                    f13 = 0.0f;
                    canvas2.translate((AndroidUtilities.dp(f10) * (-this.W) * interpolation3) + AndroidUtilities.dp(f11), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.T[1].getHeight()) / 2.0f);
                this.U.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.R));
                canvas2.restore();
            }
            if (this.T[0] != null) {
                canvas2.save();
                if (this.W != 0) {
                    f12 = 0.0f;
                    canvas2.translate(com.google.android.recaptcha.internal.a.z(1.0f, interpolation3, AndroidUtilities.dp(f10) * this.W, AndroidUtilities.dp(f11)), 0.0f);
                } else {
                    f12 = 0.0f;
                }
                canvas2.translate(f12, (-this.T[0].getHeight()) / 2.0f);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z10, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2);
        yn0 yn0Var = this.J;
        int measuredHeight = (yn0Var.getMeasuredHeight() / 2) + dp;
        int i15 = this.f26819e / 2;
        if (this.Q > 600000) {
            i14 = AndroidUtilities.dp(42.0f);
        } else {
            i14 = 0;
        }
        int dp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + i15 + i14;
        yn0Var.layout(dp2, measuredHeight - yn0Var.getMeasuredHeight(), yn0Var.getMeasuredWidth() + dp2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f26820e0 = timestampLabelWidth;
        this.J.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.f26823r != -100.0f && getMeasuredWidth() > 0) {
            setProgress(this.f26823r);
            this.f26823r = -100.0f;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f9) {
        this.f26827y = f9;
        invalidate();
    }

    public void setDelegate(zn0 zn0Var) {
        this.f26825w = zn0Var;
    }

    public void setInnerColor(int i10) {
        this.f26814b.setColor(i10);
    }

    public void setLineWidth(int i10) {
        this.G = i10;
    }

    public void setMinProgress(float f9) {
        this.f26824s = f9;
        float progress = getProgress();
        float f10 = this.f26824s;
        if (progress < f10) {
            e(f10, false);
        }
        invalidate();
    }

    public void setOuterColor(int i10) {
        this.f26816c.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            org.telegram.ui.ActionBar.g6.B1(zVar, i0.a.k(i10, 40), true);
        }
    }

    public void setProgress(float f9) {
        e(f9, false);
    }

    public void setReportChanges(boolean z10) {
        this.f26826x = z10;
    }

    public void setSeparatorsCount(int i10) {
        this.F = i10;
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

    public ao0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.h = new d6(this, 0L, 60L, jr.f29801g);
        this.f26823r = -100.0f;
        this.f26824s = -1.0f;
        this.C = new int[]{16842910, 16842919};
        this.D = 1.0f;
        this.G = 3;
        this.R = 0.0f;
        this.S = -1;
        this.V = 1.0f;
        this.f26815b0 = -1.0f;
        this.f26817c0 = new RectF();
        this.f26818d0 = -1;
        this.I = c6Var;
        setWillNotDraw(false);
        this.f26814b = new Paint(1);
        Paint paint = new Paint(1);
        this.f26816c = paint;
        int i10 = org.telegram.ui.ActionBar.g6.Vi;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f26819e = AndroidUtilities.dp(32.0f);
        this.d = AndroidUtilities.dp(24.0f);
        this.B = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.g6.f0(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), 40), 1, AndroidUtilities.dp(16.0f));
        this.A = f02;
        f02.setCallback(this);
        f02.setVisible(true, false);
        yn0 yn0Var = new yn0(this, context, context, 0);
        this.J = yn0Var;
        yn0Var.f26693x = true;
        addView(yn0Var, i7.f6.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.Cells.e1 e1Var = new org.telegram.ui.Cells.e1(this, z10);
        this.f26812a = e1Var;
        setAccessibilityDelegate(e1Var);
    }
}

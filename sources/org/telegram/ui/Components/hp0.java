package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
public class hp0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public static float[] f26996k0;
    public static Path f26997l0;
    public float E;
    public final org.telegram.ui.Cells.y F;
    public float G;
    public final int[] H;
    public float I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public final org.telegram.ui.ActionBar.g6 N;
    public final fp0 O;
    public boolean P;
    public float Q;
    public float R;
    public int S;
    public ArrayList T;
    public CharSequence U;
    public long V;
    public float W;
    public int f26998a;
    public int f26999a0;
    public final org.telegram.ui.Cells.f1 f27000b;
    public StaticLayout[] f27001b0;
    public final Paint f27002c;
    public TextPaint f27003c0;
    public final Paint d;
    public float f27004d0;
    public final int e;
    public int f27005e0;
    public final int f27006f;
    public long f27007f0;
    public float f27008g0;
    public int h;
    public final RectF f27009h0;
    public int f27010i0;
    public int f27011j0;
    public final f6 f27012n;
    public int f27013r;
    public float f27014s;
    public float v;
    public boolean f27015w;
    public gp0 f27016x;
    public boolean f27017y;

    public hp0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i10;
        int i11 = this.f27006f;
        float f7 = i11 / 2.0f;
        int i12 = 0;
        if (this.V > 600000) {
            i10 = AndroidUtilities.dp(42.0f);
        } else {
            i10 = 0;
        }
        float f10 = f7 + i10;
        float measuredWidth = getMeasuredWidth() - (i11 / 2.0f);
        if (this.V > 600000) {
            i12 = AndroidUtilities.dp(42.0f);
        }
        return (int) (Math.abs(f10 - (measuredWidth - i12)) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i10) {
        if (this.f27010i0 != i10) {
            this.f27010i0 = i10;
            if (i10 >= 0 && i10 < this.T.size()) {
                this.O.setText((CharSequence) ((Pair) this.T.get(this.f27010i0)).second);
            }
        }
    }

    public final void a(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hp0.a(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final StaticLayout b(int i10, CharSequence charSequence) {
        if (this.f27003c0 == null) {
            TextPaint textPaint = new TextPaint(1);
            this.f27003c0 = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.f27003c0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Si, this.N));
        if (charSequence == null) {
            charSequence = "";
        }
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f27003c0, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
    }

    public final int c() {
        return Math.max((int) (this.v * (getMeasuredWidth() - this.f27006f)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.Q = motionEvent.getX();
            this.R = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.y yVar = this.F;
        int i10 = this.e;
        int i11 = this.f27006f;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.P) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.R) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.Q) > viewConfiguration.getScaledTouchSlop()) {
                        this.P = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        int measuredHeight = (getMeasuredHeight() - i10) / 2;
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            if (this.h - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.h + i10 + measuredHeight) {
                                int x10 = ((int) motionEvent.getX()) - (i10 / 2);
                                this.h = x10;
                                if (x10 < c()) {
                                    this.h = c();
                                } else if (this.h > getMeasuredWidth() - i11) {
                                    this.h = getMeasuredWidth() - i11;
                                }
                            }
                            this.f27013r = (int) (motionEvent.getX() - this.h);
                            this.f27015w = true;
                            this.f27016x.v();
                            if (yVar != null) {
                                yVar.setState(this.H);
                                yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.f27015w) {
                    int x11 = (int) (motionEvent.getX() - this.f27013r);
                    this.h = x11;
                    if (x11 < c()) {
                        this.h = c();
                    } else if (this.h > getMeasuredWidth() - i11) {
                        this.h = getMeasuredWidth() - i11;
                    }
                    if (this.f27017y) {
                        if (this.M) {
                            float measuredWidth = (getMeasuredWidth() - i11) / 2;
                            float f7 = this.h;
                            if (f7 >= measuredWidth) {
                                f((f7 - measuredWidth) / measuredWidth, false);
                            } else {
                                f(-Math.max(0.01f, 1.0f - ((measuredWidth - f7) / measuredWidth)), false);
                            }
                        } else {
                            f(this.h / (getMeasuredWidth() - i11), false);
                        }
                    }
                    if (yVar != null) {
                        yVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                    }
                    invalidate();
                    return true;
                }
            }
        } else {
            this.P = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.R) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight2 = (getMeasuredHeight() - i10) / 2;
                    if (this.h - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.h + i10 + measuredHeight2) {
                        int x12 = ((int) motionEvent.getX()) - (i10 / 2);
                        this.h = x12;
                        if (x12 < c()) {
                            this.h = c();
                        } else if (this.h > getMeasuredWidth() - i11) {
                            this.h = getMeasuredWidth() - i11;
                        }
                    }
                    this.f27013r = (int) (motionEvent.getX() - this.h);
                    this.f27015w = true;
                }
            }
            if (this.f27015w) {
                if (motionEvent.getAction() == 1) {
                    if (this.M) {
                        float measuredWidth2 = (getMeasuredWidth() - i11) / 2;
                        float f10 = this.h;
                        if (f10 >= measuredWidth2) {
                            f((f10 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f10) / measuredWidth2)), false);
                        }
                    } else {
                        f(this.h / (getMeasuredWidth() - i11), true);
                    }
                }
                if (yVar != null) {
                    yVar.setState(StateSet.NOTHING);
                }
                this.f27016x.v();
                this.f27015w = false;
                AndroidUtilities.runOnUIThread(new yb0(this, 26), 50L);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(float f7, boolean z10) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.f27014s = f7;
            return;
        }
        this.f27014s = -100.0f;
        boolean z11 = this.M;
        int i10 = this.f27006f;
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
        int i12 = this.h;
        if (i12 != i11) {
            if (z10) {
                this.J = i12;
                this.I = 0.0f;
            }
            this.h = i11;
            if (i11 < c()) {
                this.h = c();
            } else if (this.h > getMeasuredWidth() - i10) {
                this.h = getMeasuredWidth() - i10;
            }
            invalidate();
        }
    }

    public final void f(float f7, boolean z10) {
        gp0 gp0Var = this.f27016x;
        if (gp0Var != null) {
            gp0Var.L(f7, z10);
        }
        int i10 = this.K;
        if (i10 > 1) {
            int round = Math.round((i10 - 1) * f7);
            if (!z10 && round != this.S) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.S = round;
        }
    }

    public final void g(MessageObject messageObject) {
        boolean z10;
        Integer parseInt;
        String str;
        Long valueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (valueOf.longValue() < 0) {
            this.T = null;
            this.f26999a0 = -1;
            this.W = 0.0f;
            StaticLayout[] staticLayoutArr = this.f27001b0;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.U = null;
            this.V = -1L;
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
        if (charSequence != this.U) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || this.V != valueOf.longValue()) {
            this.U = charSequence;
            this.V = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.f27011j0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.T = null;
                this.f26999a0 = -1;
                this.W = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f27001b0;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                q61[] q61VarArr = (q61[]) spanned.getSpans(0, spanned.length(), q61.class);
                this.T = new ArrayList();
                if (z10) {
                    this.W = 0.0f;
                }
                if (this.f27003c0 == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.f27003c0 = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.f27003c0.setColor(-1);
                }
                for (q61 q61Var : q61VarArr) {
                    if (q61Var != null && q61Var.getURL() != null && q61Var.d != null && q61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) q61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                        float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(q61Var.d);
                        Emoji.replaceEmoji(spannableStringBuilder, this.f27003c0.getFontMetricsInt(), false);
                        this.T.add(new Pair(Float.valueOf(intValue), spannableStringBuilder));
                    }
                }
                Collections.sort(this.T, new org.telegram.ui.ActionBar.l4(22));
            } catch (Exception e) {
                FileLog.e(e);
                this.T = null;
                this.f26999a0 = -1;
                this.W = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.f27001b0;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        if (getMeasuredWidth() == 0) {
            return this.f27014s;
        }
        return this.h / (getMeasuredWidth() - this.f27006f);
    }

    public ep0 getSeekBarAccessibilityDelegate() {
        return this.f27000b;
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
        int i12 = this.h;
        boolean z11 = this.M;
        int i13 = this.f27006f;
        if (!z11 && this.K > 1) {
            i12 = (int) this.f27012n.d(Math.round(i12 / measuredWidth) * ((getMeasuredWidth() - i13) / (this.K - 1.0f)), false);
        }
        int i14 = i12;
        int measuredHeight = getMeasuredHeight();
        int i15 = this.e;
        int i16 = (measuredHeight - i15) / 2;
        int i17 = org.telegram.ui.ActionBar.k6.Ti;
        org.telegram.ui.ActionBar.g6 g6Var = this.N;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i17, g6Var);
        Paint paint = this.f27002c;
        paint.setColor(w02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f15 = i13 / 2.0f;
        int i18 = i13 / 2;
        float measuredWidth2 = getMeasuredWidth() - i18;
        float dp = measuredHeight2 - (AndroidUtilities.dp(this.L) / 2.0f);
        float dp2 = (AndroidUtilities.dp(this.L) / 2.0f) + measuredHeight2;
        RectF rectF = this.f27009h0;
        rectF.set(f15, dp, measuredWidth2, dp2);
        a(canvas2, rectF, paint);
        if (this.E > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ui, g6Var));
            f7 = 0.0f;
            rectF.set(f15, dp, (this.E * (getMeasuredWidth() - i13)) + f15, dp2);
            a(canvas2, rectF, paint);
        } else {
            f7 = 0.0f;
        }
        boolean z12 = this.M;
        float f16 = 6.0f;
        Paint paint2 = this.d;
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
            float f17 = this.v;
            if (f17 >= f7) {
                float f18 = measuredWidth2 - f15;
                rectF.set((f17 * f18) + f15, dp, i14 + f15, dp2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f15, dp, (this.v * f18) + f15, dp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f15, dp, i14 + f15, dp2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            int dp3 = (i18 + i14) - AndroidUtilities.dp(16.0f);
            int dp4 = ((i15 / 2) + i16) - AndroidUtilities.dp(16.0f);
            yVar.setBounds(dp3, dp4, AndroidUtilities.dp(32.0f) + dp3, AndroidUtilities.dp(32.0f) + dp4);
            yVar.draw(canvas2);
        }
        if (this.f27015w) {
            f16 = 8.0f;
        }
        int dp5 = AndroidUtilities.dp(f16);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > 18) {
            elapsedRealtime = 16;
        }
        float f19 = this.G;
        float f20 = dp5;
        if (f19 != f20) {
            f10 = 16.0f;
            if (f19 < f20) {
                f11 = 8.0f;
                float d = a1.g.d((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f19);
                this.G = d;
                if (d > f20) {
                    this.G = f20;
                }
            } else {
                f11 = 8.0f;
                float x10 = org.telegram.messenger.sl.x((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f19);
                this.G = x10;
                if (x10 < f20) {
                    this.G = f20;
                }
            }
            z10 = true;
        } else {
            f10 = 16.0f;
            f11 = 8.0f;
            z10 = false;
        }
        float f21 = this.I;
        if (f21 < 1.0f) {
            float f22 = (((float) elapsedRealtime) / 225.0f) + f21;
            this.I = f22;
            if (f22 < 1.0f) {
                z10 = true;
            } else {
                this.I = 1.0f;
            }
        }
        float f23 = this.I;
        if (f23 < 1.0f) {
            float interpolation = 1.0f - st.f30550c.getInterpolation(Math.min(1.0f, f23 * 3.0f));
            float interpolation2 = st.d.getInterpolation(this.I);
            if (interpolation > f7) {
                canvas2.drawCircle(i18 + this.J, (i15 / 2) + i16, this.G * interpolation, paint2);
            }
            canvas2.drawCircle(i18 + i14, (i15 / 2) + i16, this.G * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i18 + i14, (i15 / 2) + i16, this.G, paint2);
        }
        ArrayList arrayList = this.T;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.T.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((Float) ((Pair) this.T.get(size)).first).floatValue() - 0.001f <= progress) {
                        break;
                    }
                } else {
                    size = -1;
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.f27001b0 == null) {
                this.f27001b0 = new StaticLayout[2];
            }
            if (this.V > 600000) {
                i10 = AndroidUtilities.dp(42.0f);
            } else {
                i10 = 0;
            }
            float f24 = i10 + f15;
            float measuredWidth3 = getMeasuredWidth() - f15;
            if (this.V > 600000) {
                i11 = AndroidUtilities.dp(42.0f);
            } else {
                i11 = 0;
            }
            float abs = Math.abs(f24 - (measuredWidth3 - i11)) - AndroidUtilities.dp(66.0f);
            float f25 = this.f27008g0;
            if (f25 > f7 && Math.abs(f25 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.f27001b0;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.f27001b0;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.f27008g0 = abs;
            if (size != this.f26999a0) {
                StaticLayout[] staticLayoutArr3 = this.f27001b0;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.f27015w) {
                    AndroidUtilities.vibrateCursor(this);
                }
                if (size >= 0 && size < this.T.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.T.get(size)).second;
                    if (charSequence == null) {
                        this.f27001b0[0] = null;
                    } else {
                        this.f27001b0[0] = b((int) abs, charSequence);
                    }
                } else {
                    this.f27001b0[0] = null;
                }
                this.f27004d0 = f7;
                if (size == -1) {
                    this.f27005e0 = -1;
                } else {
                    int i19 = this.f26999a0;
                    if (i19 == -1) {
                        this.f27005e0 = 1;
                    } else if (size < i19) {
                        this.f27005e0 = -1;
                    } else if (size > i19) {
                        this.f27005e0 = 1;
                    }
                }
                this.f26999a0 = size;
            }
            if (this.f27004d0 < 1.0f) {
                long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f27007f0));
                if (this.T.size() > 8) {
                    f14 = 160.0f;
                } else {
                    f14 = 220.0f;
                }
                this.f27004d0 = Math.min((((float) min) / f14) + this.f27004d0, 1.0f);
                invalidate();
                this.f27007f0 = SystemClock.elapsedRealtime();
            }
            if (this.W < 1.0f) {
                this.W = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f27007f0))) / 200.0f) + this.W, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = bs.f25133f.getInterpolation(this.f27004d0);
            canvas2.save();
            canvas2.translate(f24 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.f27003c0.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Si, g6Var));
            if (this.f27001b0[1] != null) {
                canvas2.save();
                if (this.f27005e0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate((AndroidUtilities.dp(f10) * (-this.f27005e0) * interpolation3) + AndroidUtilities.dp(f11), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.f27001b0[1].getHeight()) / 2.0f);
                this.f27003c0.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.W));
                canvas2.restore();
            }
            if (this.f27001b0[0] != null) {
                canvas2.save();
                if (this.f27005e0 != 0) {
                    f12 = 0.0f;
                    canvas2.translate(com.google.android.gms.internal.play_billing.k3.y(1.0f, interpolation3, AndroidUtilities.dp(f10) * this.f27005e0, AndroidUtilities.dp(f11)), 0.0f);
                } else {
                    f12 = 0.0f;
                }
                canvas2.translate(f12, (-this.f27001b0[0].getHeight()) / 2.0f);
                this.f27003c0.setAlpha((int) (interpolation3 * 255.0f * this.W));
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
        fp0 fp0Var = this.O;
        int measuredHeight = (fp0Var.getMeasuredHeight() / 2) + dp;
        int i15 = this.f27006f / 2;
        if (this.V > 600000) {
            i14 = AndroidUtilities.dp(42.0f);
        } else {
            i14 = 0;
        }
        int dp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + i15 + i14;
        fp0Var.layout(dp2, measuredHeight - fp0Var.getMeasuredHeight(), fp0Var.getMeasuredWidth() + dp2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f27011j0 = timestampLabelWidth;
        this.O.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.f27014s != -100.0f && getMeasuredWidth() > 0) {
            setProgress(this.f27014s);
            this.f27014s = -100.0f;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f7) {
        this.E = f7;
        invalidate();
    }

    public void setDelegate(gp0 gp0Var) {
        this.f27016x = gp0Var;
    }

    public void setInnerColor(int i10) {
        this.f27002c.setColor(i10);
    }

    public void setLineWidth(int i10) {
        this.L = i10;
    }

    public void setMinProgress(float f7) {
        this.v = f7;
        float progress = getProgress();
        float f10 = this.v;
        if (progress < f10) {
            e(f10, false);
        }
        invalidate();
    }

    public void setOuterColor(int i10) {
        this.d.setColor(i10);
        org.telegram.ui.Cells.y yVar = this.F;
        if (yVar != null) {
            org.telegram.ui.ActionBar.k6.E1(yVar, i0.a.o(i10, 40), true);
        }
    }

    public void setProgress(float f7) {
        e(f7, false);
    }

    public void setReportChanges(boolean z10) {
        this.f27017y = z10;
    }

    public void setSeparatorsCount(int i10) {
        this.K = i10;
    }

    public void setTwoSided(boolean z10) {
        this.M = z10;
    }

    @Override
    public final void updateColors() {
        int w02;
        try {
            Paint paint = this.d;
            if (paint != null && paint.getColor() == this.f26998a && (w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vi, this.N)) != this.f26998a) {
                this.f26998a = w02;
                setOuterColor(w02);
                invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.F) {
            return false;
        }
        return true;
    }

    public hp0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context);
        this.f27012n = new f6(this, 0L, 60L, bs.f25134g);
        this.f27014s = -100.0f;
        this.v = -1.0f;
        this.H = new int[]{16842910, 16842919};
        this.I = 1.0f;
        this.L = 3;
        this.W = 0.0f;
        this.f26999a0 = -1;
        this.f27004d0 = 1.0f;
        this.f27008g0 = -1.0f;
        this.f27009h0 = new RectF();
        this.f27010i0 = -1;
        this.N = g6Var;
        setWillNotDraw(false);
        this.f27002c = new Paint(1);
        Paint paint = new Paint(1);
        this.d = paint;
        int i10 = org.telegram.ui.ActionBar.k6.Vi;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        this.f26998a = w02;
        paint.setColor(w02);
        this.f27006f = AndroidUtilities.dp(32.0f);
        this.e = AndroidUtilities.dp(24.0f);
        this.G = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), 40), 1, AndroidUtilities.dp(16.0f));
        this.F = g02;
        g02.setCallback(this);
        g02.setVisible(true, false);
        fp0 fp0Var = new fp0(this, context, context, 0);
        this.O = fp0Var;
        fp0Var.f25918x = true;
        addView(fp0Var, w7.z5.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(this, z10);
        this.f27000b = f1Var;
        setAccessibilityDelegate(f1Var);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}

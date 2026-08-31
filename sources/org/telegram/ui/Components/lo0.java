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
public class lo0 extends FrameLayout {
    public static float[] f28777g0;
    public static Path f28778h0;
    public final org.telegram.ui.Cells.z B;
    public float C;
    public final int[] D;
    public float E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public final org.telegram.ui.ActionBar.g6 J;
    public final jo0 K;
    public boolean L;
    public float M;
    public float N;
    public int O;
    public ArrayList P;
    public CharSequence Q;
    public long R;
    public float S;
    public int T;
    public StaticLayout[] U;
    public TextPaint V;
    public float W;
    public final org.telegram.ui.Cells.e1 f28779a;
    public int f28780a0;
    public final Paint f28781b;
    public long f28782b0;
    public final Paint f28783c;
    public float f28784c0;
    public final int d;
    public final RectF f28785d0;
    public final int f28786e;
    public int f28787e0;
    public int f28788f;
    public int f28789f0;
    public final z5 h;
    public int f28790n;
    public float f28791r;
    public float f28792s;
    public boolean v;
    public ko0 f28793w;
    public boolean f28794x;
    public float f28795y;

    public lo0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i10;
        int i11 = this.f28786e;
        float f10 = i11 / 2.0f;
        int i12 = 0;
        if (this.R > 600000) {
            i10 = AndroidUtilities.dp(42.0f);
        } else {
            i10 = 0;
        }
        float f11 = f10 + i10;
        float measuredWidth = getMeasuredWidth() - (i11 / 2.0f);
        if (this.R > 600000) {
            i12 = AndroidUtilities.dp(42.0f);
        }
        return (int) (Math.abs(f11 - (measuredWidth - i12)) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i10) {
        if (this.f28787e0 != i10) {
            this.f28787e0 = i10;
            if (i10 >= 0 && i10 < this.P.size()) {
                this.K.setText((CharSequence) ((Pair) this.P.get(this.f28787e0)).second);
            }
        }
    }

    public final void a(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lo0.a(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final StaticLayout b(int i10, CharSequence charSequence) {
        CharSequence charSequence2;
        if (this.V == null) {
            TextPaint textPaint = new TextPaint(1);
            this.V = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.V.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Si, this.J));
        if (charSequence == null) {
            charSequence2 = "";
        } else {
            charSequence2 = charSequence;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.V, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.V, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i10));
    }

    public final int c() {
        return Math.max((int) (this.f28792s * (getMeasuredWidth() - this.f28786e)), 0);
    }

    public boolean d(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.M = motionEvent.getX();
            this.N = motionEvent.getY();
            return true;
        }
        int action = motionEvent.getAction();
        org.telegram.ui.Cells.z zVar = this.B;
        int i10 = this.d;
        int i11 = this.f28786e;
        if (action != 1 && motionEvent.getAction() != 3) {
            if (motionEvent.getAction() == 2) {
                if (!this.L) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    if (Math.abs(motionEvent.getY() - this.N) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.M) > viewConfiguration.getScaledTouchSlop()) {
                        this.L = true;
                        getParent().requestDisallowInterceptTouchEvent(true);
                        int measuredHeight = (getMeasuredHeight() - i10) / 2;
                        if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                            if (this.f28788f - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.f28788f + i10 + measuredHeight) {
                                int x10 = ((int) motionEvent.getX()) - (i10 / 2);
                                this.f28788f = x10;
                                if (x10 < c()) {
                                    this.f28788f = c();
                                } else if (this.f28788f > getMeasuredWidth() - i11) {
                                    this.f28788f = getMeasuredWidth() - i11;
                                }
                            }
                            this.f28790n = (int) (motionEvent.getX() - this.f28788f);
                            this.v = true;
                            this.f28793w.A();
                            if (zVar != null) {
                                zVar.setState(this.D);
                                zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                            }
                            invalidate();
                            return true;
                        }
                    }
                } else if (this.v) {
                    int x11 = (int) (motionEvent.getX() - this.f28790n);
                    this.f28788f = x11;
                    if (x11 < c()) {
                        this.f28788f = c();
                    } else if (this.f28788f > getMeasuredWidth() - i11) {
                        this.f28788f = getMeasuredWidth() - i11;
                    }
                    if (this.f28794x) {
                        if (this.I) {
                            float measuredWidth = (getMeasuredWidth() - i11) / 2;
                            float f10 = this.f28788f;
                            if (f10 >= measuredWidth) {
                                f((f10 - measuredWidth) / measuredWidth, false);
                            } else {
                                f(-Math.max(0.01f, 1.0f - ((measuredWidth - f10) / measuredWidth)), false);
                            }
                        } else {
                            f(this.f28788f / (getMeasuredWidth() - i11), false);
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
            this.L = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.N) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight2 = (getMeasuredHeight() - i10) / 2;
                    if (this.f28788f - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.f28788f + i10 + measuredHeight2) {
                        int x12 = ((int) motionEvent.getX()) - (i10 / 2);
                        this.f28788f = x12;
                        if (x12 < c()) {
                            this.f28788f = c();
                        } else if (this.f28788f > getMeasuredWidth() - i11) {
                            this.f28788f = getMeasuredWidth() - i11;
                        }
                    }
                    this.f28790n = (int) (motionEvent.getX() - this.f28788f);
                    this.v = true;
                }
            }
            if (this.v) {
                if (motionEvent.getAction() == 1) {
                    if (this.I) {
                        float measuredWidth2 = (getMeasuredWidth() - i11) / 2;
                        float f11 = this.f28788f;
                        if (f11 >= measuredWidth2) {
                            f((f11 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f11) / measuredWidth2)), false);
                        }
                    } else {
                        f(this.f28788f / (getMeasuredWidth() - i11), true);
                    }
                }
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
                this.f28793w.A();
                this.v = false;
                AndroidUtilities.runOnUIThread(new ec0(this, 25), 50L);
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(float f10, boolean z4) {
        double ceil;
        if (getMeasuredWidth() == 0) {
            this.f28791r = f10;
            return;
        }
        this.f28791r = -100.0f;
        boolean z10 = this.I;
        int i10 = this.f28786e;
        if (z10) {
            float measuredWidth = (getMeasuredWidth() - i10) / 2;
            if (f10 < 0.0f) {
                ceil = Math.ceil(((-(f10 + 1.0f)) * measuredWidth) + measuredWidth);
            } else {
                ceil = Math.ceil((f10 * measuredWidth) + measuredWidth);
            }
        } else {
            ceil = Math.ceil((getMeasuredWidth() - i10) * f10);
        }
        int i11 = (int) ceil;
        int i12 = this.f28788f;
        if (i12 != i11) {
            if (z4) {
                this.F = i12;
                this.E = 0.0f;
            }
            this.f28788f = i11;
            if (i11 < c()) {
                this.f28788f = c();
            } else if (this.f28788f > getMeasuredWidth() - i10) {
                this.f28788f = getMeasuredWidth() - i10;
            }
            invalidate();
        }
    }

    public final void f(float f10, boolean z4) {
        ko0 ko0Var = this.f28793w;
        if (ko0Var != null) {
            ko0Var.X(f10, z4);
        }
        int i10 = this.G;
        if (i10 > 1) {
            int round = Math.round((i10 - 1) * f10);
            if (!z4 && round != this.O) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.O = round;
        }
    }

    public final void g(MessageObject messageObject) {
        boolean z4;
        Integer parseInt;
        String str;
        Long valueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (valueOf.longValue() < 0) {
            this.P = null;
            this.T = -1;
            this.S = 0.0f;
            StaticLayout[] staticLayoutArr = this.U;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
            }
            this.Q = null;
            this.R = -1L;
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
        if (charSequence != this.Q) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 || this.R != valueOf.longValue()) {
            this.Q = charSequence;
            this.R = valueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.f28789f0) {
                requestLayout();
            }
            if (!(charSequence instanceof Spanned)) {
                this.P = null;
                this.T = -1;
                this.S = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.U;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                n51[] n51VarArr = (n51[]) spanned.getSpans(0, spanned.length(), n51.class);
                this.P = new ArrayList();
                if (z4) {
                    this.S = 0.0f;
                }
                if (this.V == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.V = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.V.setColor(-1);
                }
                for (n51 n51Var : n51VarArr) {
                    if (n51Var != null && n51Var.getURL() != null && n51Var.d != null && n51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) n51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                        float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n51Var.d);
                        Emoji.replaceEmoji(spannableStringBuilder, this.V.getFontMetricsInt(), false);
                        this.P.add(new Pair(Float.valueOf(intValue), spannableStringBuilder));
                    }
                }
                Collections.sort(this.P, new oh.k0(26));
            } catch (Exception e6) {
                FileLog.e(e6);
                this.P = null;
                this.T = -1;
                this.S = 0.0f;
                StaticLayout[] staticLayoutArr3 = this.U;
                if (staticLayoutArr3 != null) {
                    staticLayoutArr3[1] = null;
                    staticLayoutArr3[0] = null;
                }
            }
        }
    }

    public float getProgress() {
        if (getMeasuredWidth() == 0) {
            return this.f28791r;
        }
        return this.f28788f / (getMeasuredWidth() - this.f28786e);
    }

    public io0 getSeekBarAccessibilityDelegate() {
        return this.f28779a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z4;
        int i10;
        int i11;
        float f13;
        float f14;
        float f15;
        float measuredWidth;
        Canvas canvas2 = canvas;
        int i12 = this.f28788f;
        boolean z10 = this.I;
        int i13 = this.f28786e;
        if (!z10 && this.G > 1) {
            i12 = (int) this.h.d(Math.round(i12 / measuredWidth) * ((getMeasuredWidth() - i13) / (this.G - 1.0f)), false);
        }
        int i14 = i12;
        int measuredHeight = getMeasuredHeight();
        int i15 = this.d;
        int i16 = (measuredHeight - i15) / 2;
        int i17 = org.telegram.ui.ActionBar.k6.Ti;
        org.telegram.ui.ActionBar.g6 g6Var = this.J;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i17, g6Var);
        Paint paint = this.f28781b;
        paint.setColor(v02);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f16 = i13 / 2.0f;
        int i18 = i13 / 2;
        float measuredWidth2 = getMeasuredWidth() - i18;
        float dp = measuredHeight2 - (AndroidUtilities.dp(this.H) / 2.0f);
        float dp2 = (AndroidUtilities.dp(this.H) / 2.0f) + measuredHeight2;
        RectF rectF = this.f28785d0;
        rectF.set(f16, dp, measuredWidth2, dp2);
        a(canvas2, rectF, paint);
        if (this.f28795y > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Ui, g6Var));
            f10 = 0.0f;
            rectF.set(f16, dp, (this.f28795y * (getMeasuredWidth() - i13)) + f16, dp2);
            a(canvas2, rectF, paint);
        } else {
            f10 = 0.0f;
        }
        boolean z11 = this.I;
        float f17 = 6.0f;
        Paint paint2 = this.f28783c;
        if (z11) {
            canvas2.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i14 > (getMeasuredWidth() - i13) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i18 + i14, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i18 + i14, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f16 = f16;
        } else {
            float f18 = this.f28792s;
            if (f18 >= f10) {
                float f19 = measuredWidth2 - f16;
                rectF.set((f18 * f19) + f16, dp, i14 + f16, dp2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f16, dp, (this.f28792s * f19) + f16, dp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f16, dp, i14 + f16, dp2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.z zVar = this.B;
        if (zVar != null) {
            int dp3 = (i18 + i14) - AndroidUtilities.dp(16.0f);
            int dp4 = ((i15 / 2) + i16) - AndroidUtilities.dp(16.0f);
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
        float f20 = this.C;
        float f21 = dp5;
        if (f20 != f21) {
            if (f20 < f21) {
                f11 = 16.0f;
                f12 = 8.0f;
                float c3 = w.c.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f20);
                this.C = c3;
                if (c3 > f21) {
                    this.C = f21;
                }
            } else {
                f11 = 16.0f;
                f12 = 8.0f;
                float A = org.telegram.messenger.y3.A((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f20);
                this.C = A;
                if (A < f21) {
                    this.C = f21;
                }
            }
            z4 = true;
        } else {
            f11 = 16.0f;
            f12 = 8.0f;
            z4 = false;
        }
        float f22 = this.E;
        if (f22 < 1.0f) {
            float f23 = (((float) elapsedRealtime) / 225.0f) + f22;
            this.E = f23;
            if (f23 < 1.0f) {
                z4 = true;
            } else {
                this.E = 1.0f;
            }
        }
        float f24 = this.E;
        if (f24 < 1.0f) {
            float interpolation = 1.0f - jt.f28198c.getInterpolation(Math.min(1.0f, f24 * 3.0f));
            float interpolation2 = jt.d.getInterpolation(this.E);
            if (interpolation > f10) {
                canvas2.drawCircle(i18 + this.F, (i15 / 2) + i16, this.C * interpolation, paint2);
            }
            canvas2.drawCircle(i18 + i14, (i15 / 2) + i16, this.C * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i18 + i14, (i15 / 2) + i16, this.C, paint2);
        }
        ArrayList arrayList = this.P;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.P.size();
            while (true) {
                size--;
                if (size >= 0) {
                    if (((Float) ((Pair) this.P.get(size)).first).floatValue() - 0.001f <= progress) {
                        break;
                    }
                } else {
                    size = -1;
                    break;
                }
            }
            setTimestampIndex(size);
            if (this.U == null) {
                this.U = new StaticLayout[2];
            }
            if (this.R > 600000) {
                i10 = AndroidUtilities.dp(42.0f);
            } else {
                i10 = 0;
            }
            float f25 = i10 + f16;
            float measuredWidth3 = getMeasuredWidth() - f16;
            if (this.R > 600000) {
                i11 = AndroidUtilities.dp(42.0f);
            } else {
                i11 = 0;
            }
            float abs = Math.abs(f25 - (measuredWidth3 - i11)) - AndroidUtilities.dp(66.0f);
            float f26 = this.f28784c0;
            if (f26 > f10 && Math.abs(f26 - abs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.U;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) abs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.U;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) abs, staticLayout2.getText());
                }
            }
            this.f28784c0 = abs;
            if (size != this.T) {
                StaticLayout[] staticLayoutArr3 = this.U;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.v) {
                    AndroidUtilities.vibrateCursor(this);
                }
                if (size >= 0 && size < this.P.size()) {
                    CharSequence charSequence = (CharSequence) ((Pair) this.P.get(size)).second;
                    if (charSequence == null) {
                        this.U[0] = null;
                    } else {
                        this.U[0] = b((int) abs, charSequence);
                    }
                } else {
                    this.U[0] = null;
                }
                this.W = 0.0f;
                if (size == -1) {
                    this.f28780a0 = -1;
                } else {
                    int i19 = this.T;
                    if (i19 == -1) {
                        this.f28780a0 = 1;
                    } else if (size < i19) {
                        this.f28780a0 = -1;
                    } else if (size > i19) {
                        this.f28780a0 = 1;
                    }
                }
                this.T = size;
            }
            if (this.W < 1.0f) {
                long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f28782b0));
                if (this.P.size() > 8) {
                    f15 = 160.0f;
                } else {
                    f15 = 220.0f;
                }
                this.W = Math.min((((float) min) / f15) + this.W, 1.0f);
                invalidate();
                this.f28782b0 = SystemClock.elapsedRealtime();
            }
            if (this.S < 1.0f) {
                this.S = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f28782b0))) / 200.0f) + this.S, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = pr.f30183f.getInterpolation(this.W);
            canvas2.save();
            canvas2.translate(f25 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.V.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Si, g6Var));
            if (this.U[1] != null) {
                canvas2.save();
                if (this.f28780a0 != 0) {
                    f14 = 0.0f;
                    canvas2.translate((AndroidUtilities.dp(f11) * (-this.f28780a0) * interpolation3) + AndroidUtilities.dp(f12), 0.0f);
                } else {
                    f14 = 0.0f;
                }
                canvas2.translate(f14, (-this.U[1].getHeight()) / 2.0f);
                this.V.setAlpha((int) ((1.0f - interpolation3) * 255.0f * this.S));
                canvas2.restore();
            }
            if (this.U[0] != null) {
                canvas2.save();
                if (this.f28780a0 != 0) {
                    f13 = 0.0f;
                    canvas2.translate(e2.c.w(1.0f, interpolation3, AndroidUtilities.dp(f11) * this.f28780a0, AndroidUtilities.dp(f12)), 0.0f);
                } else {
                    f13 = 0.0f;
                }
                canvas2.translate(f13, (-this.U[0].getHeight()) / 2.0f);
                this.V.setAlpha((int) (interpolation3 * 255.0f * this.S));
                canvas2.restore();
            }
            canvas2.restore();
        }
        if (z4) {
            postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14;
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2);
        jo0 jo0Var = this.K;
        int measuredHeight = (jo0Var.getMeasuredHeight() / 2) + dp;
        int i15 = this.f28786e / 2;
        if (this.R > 600000) {
            i14 = AndroidUtilities.dp(42.0f);
        } else {
            i14 = 0;
        }
        int dp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + i15 + i14;
        jo0Var.layout(dp2, measuredHeight - jo0Var.getMeasuredHeight(), jo0Var.getMeasuredWidth() + dp2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f28789f0 = timestampLabelWidth;
        this.K.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.f28791r != -100.0f && getMeasuredWidth() > 0) {
            setProgress(this.f28791r);
            this.f28791r = -100.0f;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f10) {
        this.f28795y = f10;
        invalidate();
    }

    public void setDelegate(ko0 ko0Var) {
        this.f28793w = ko0Var;
    }

    public void setInnerColor(int i10) {
        this.f28781b.setColor(i10);
    }

    public void setLineWidth(int i10) {
        this.H = i10;
    }

    public void setMinProgress(float f10) {
        this.f28792s = f10;
        float progress = getProgress();
        float f11 = this.f28792s;
        if (progress < f11) {
            e(f11, false);
        }
        invalidate();
    }

    public void setOuterColor(int i10) {
        this.f28783c.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.B;
        if (zVar != null) {
            org.telegram.ui.ActionBar.k6.B1(zVar, i0.a.k(i10, 40), true);
        }
    }

    public void setProgress(float f10) {
        e(f10, false);
    }

    public void setReportChanges(boolean z4) {
        this.f28794x = z4;
    }

    public void setSeparatorsCount(int i10) {
        this.G = i10;
    }

    public void setTwoSided(boolean z4) {
        this.I = z4;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.B) {
            return false;
        }
        return true;
    }

    public lo0(Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.h = new z5(this, 0L, 60L, pr.f30184g);
        this.f28791r = -100.0f;
        this.f28792s = -1.0f;
        this.D = new int[]{16842910, 16842919};
        this.E = 1.0f;
        this.H = 3;
        this.S = 0.0f;
        this.T = -1;
        this.W = 1.0f;
        this.f28784c0 = -1.0f;
        this.f28785d0 = new RectF();
        this.f28787e0 = -1;
        this.J = g6Var;
        setWillNotDraw(false);
        this.f28781b = new Paint(1);
        Paint paint = new Paint(1);
        this.f28783c = paint;
        int i10 = org.telegram.ui.ActionBar.k6.Vi;
        paint.setColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        this.f28786e = AndroidUtilities.dp(32.0f);
        this.d = AndroidUtilities.dp(24.0f);
        this.C = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.k6.f0(i0.a.k(org.telegram.ui.ActionBar.k6.v0(i10, g6Var), 40), 1, AndroidUtilities.dp(16.0f));
        this.B = f02;
        f02.setCallback(this);
        f02.setVisible(true, false);
        jo0 jo0Var = new jo0(this, context, context, 0);
        this.K = jo0Var;
        jo0Var.f32666x = true;
        addView(jo0Var, k7.c6.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.Cells.e1 e1Var = new org.telegram.ui.Cells.e1(this, z4);
        this.f28779a = e1Var;
        setAccessibilityDelegate(e1Var);
    }
}

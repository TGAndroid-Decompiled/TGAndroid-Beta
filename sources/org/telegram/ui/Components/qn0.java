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

public class qn0 extends FrameLayout {

    public static float[] f31930f0;

    public static Path f31931g0;
    public final org.telegram.ui.Cells.z A;
    public float B;
    public final int[] C;
    public float D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final org.telegram.ui.ActionBar.c6 I;
    public final on0 J;
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

    public final org.telegram.ui.Cells.e1 f31932a;

    public long f31933a0;

    public final Paint f31934b;

    public float f31935b0;

    public final Paint f31936c;

    public final RectF f31937c0;
    public final int d;

    public int f31938d0;

    public final int f31939e;

    public int f31940e0;

    public int f31941f;
    public final y5 h;

    public int f31942n;

    public float f31943r;

    public float f31944s;
    public boolean v;

    public pn0 f31945w;

    public boolean f31946x;

    public float f31947y;

    public qn0(Context context) {
        this(context, null, false);
    }

    private int getTimestampLabelWidth() {
        int i10 = this.f31939e;
        return (int) (Math.abs(((i10 / 2.0f) + (this.Q > 600000 ? AndroidUtilities.dp(42.0f) : 0)) - ((getMeasuredWidth() - (i10 / 2.0f)) - (this.Q > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f));
    }

    private void setTimestampIndex(int i10) {
        if (this.f31938d0 != i10) {
            this.f31938d0 = i10;
            if (i10 < 0 || i10 >= this.O.size()) {
                return;
            }
            this.J.setText((CharSequence) ((Pair) this.O.get(this.f31938d0)).second);
        }
    }

    public final void a(Canvas canvas, RectF rectF, Paint paint) {
        int size;
        char c10;
        float fFloatValue;
        char c11;
        char c12;
        qn0 qn0Var = this;
        float fDp = AndroidUtilities.dp(2.0f);
        ArrayList arrayList = qn0Var.O;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, fDp, fDp, paint);
            return;
        }
        float f10 = rectF.bottom;
        int i10 = qn0Var.f31939e;
        float f11 = i10 / 2.0f;
        float measuredWidth = qn0Var.getMeasuredWidth() - (i10 / 2.0f);
        AndroidUtilities.rectTmp.set(rectF);
        float fDp2 = AndroidUtilities.dp(qn0Var.R * 1.0f) / 2.0f;
        if (f31931g0 == null) {
            f31931g0 = new Path();
        }
        f31931g0.reset();
        float fDp3 = AndroidUtilities.dp(4.0f) / (measuredWidth - f11);
        int i11 = 0;
        while (true) {
            size = -1;
            if (i11 >= qn0Var.O.size()) {
                i11 = -1;
                break;
            } else if (((Float) ((Pair) qn0Var.O.get(i11)).first).floatValue() >= fDp3) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            i11 = 0;
        }
        for (int size2 = qn0Var.O.size() - 1; size2 >= 0; size2--) {
            if (1.0f - ((Float) ((Pair) qn0Var.O.get(size2)).first).floatValue() >= fDp3) {
                size = size2 + 1;
                break;
            }
        }
        if (size < 0) {
            size = qn0Var.O.size();
        }
        int i12 = i11;
        while (i12 <= size) {
            if (i12 == i11) {
                fFloatValue = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                fFloatValue = ((Float) ((Pair) qn0Var.O.get(i12 - 1)).first).floatValue();
            }
            float fFloatValue2 = i12 == size ? 1.0f : ((Float) ((Pair) qn0Var.O.get(i12)).first).floatValue();
            while (true) {
                if (i12 == size || i12 == 0) {
                    c11 = 1;
                    break;
                }
                c11 = 1;
                if (i12 >= qn0Var.O.size() - 1 || ((Float) ((Pair) qn0Var.O.get(i12)).first).floatValue() - fFloatValue > fDp3) {
                    break;
                }
                i12++;
                fFloatValue2 = ((Float) ((Pair) qn0Var.O.get(i12)).first).floatValue();
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(f11, measuredWidth, fFloatValue) + (i12 > 0 ? fDp2 : 0.0f);
            float fLerp = AndroidUtilities.lerp(f11, measuredWidth, fFloatValue2) - (i12 < size ? fDp2 : 0.0f);
            rectF2.right = fLerp;
            float f12 = rectF.right;
            boolean z10 = fLerp > f12;
            if (z10) {
                rectF2.right = f12;
            }
            float f13 = rectF2.right;
            float f14 = rectF.left;
            if (f13 >= f14) {
                if (rectF2.left < f14) {
                    rectF2.left = f14;
                }
                if (f31930f0 == null) {
                    f31930f0 = new float[8];
                }
                if (i12 != i11) {
                    if (z10) {
                        c12 = 4;
                        if (rectF2.left >= rectF.left) {
                        }
                        f31931g0.addRoundRect(rectF2, f31930f0, Path.Direction.CW);
                        if (z10) {
                            break;
                        }
                    } else {
                        c12 = 4;
                    }
                    if (i12 >= size) {
                        float[] fArr = f31930f0;
                        float f15 = 0.7f * fDp * qn0Var.R;
                        fArr[7] = f15;
                        fArr[6] = f15;
                        fArr[c11] = f15;
                        fArr[c10] = f15;
                        fArr[5] = fDp;
                        fArr[c12] = fDp;
                        fArr[3] = fDp;
                        fArr[2] = fDp;
                    } else {
                        float[] fArr2 = f31930f0;
                        float f16 = 0.7f * fDp * qn0Var.R;
                        fArr2[5] = f16;
                        fArr2[c12] = f16;
                        fArr2[3] = f16;
                        fArr2[2] = f16;
                        fArr2[7] = f16;
                        fArr2[6] = f16;
                        fArr2[c11] = f16;
                        fArr2[c10] = f16;
                    }
                    f31931g0.addRoundRect(rectF2, f31930f0, Path.Direction.CW);
                    if (z10) {
                        break;
                        break;
                    }
                } else {
                    c12 = 4;
                }
                float[] fArr3 = f31930f0;
                fArr3[7] = fDp;
                fArr3[6] = fDp;
                fArr3[c11] = fDp;
                fArr3[c10] = fDp;
                float f17 = 0.7f * fDp * qn0Var.R;
                fArr3[5] = f17;
                fArr3[c12] = f17;
                fArr3[3] = f17;
                fArr3[2] = f17;
                f31931g0.addRoundRect(rectF2, f31930f0, Path.Direction.CW);
                if (z10) {
                    break;
                    break;
                }
            }
            i12++;
            qn0Var = this;
        }
        canvas.drawPath(f31931g0, paint);
    }

    public final StaticLayout b(int i10, CharSequence charSequence) {
        if (this.U == null) {
            TextPaint textPaint = new TextPaint(1);
            this.U = textPaint;
            textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        }
        this.U.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Si, this.I));
        CharSequence charSequence2 = charSequence == null ? "" : charSequence;
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(charSequence2, 0, charSequence2.length(), this.U, i10).setMaxLines(1).setAlignment(Layout.Alignment.ALIGN_CENTER).setEllipsize(TextUtils.TruncateAt.END).setEllipsizedWidth(Math.min(AndroidUtilities.dp(400.0f), i10)).build();
        }
        CharSequence charSequence3 = charSequence2;
        return new StaticLayout(charSequence3, 0, charSequence3.length(), this.U, i10, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false, TextUtils.TruncateAt.END, Math.min(AndroidUtilities.dp(400.0f), i10));
    }

    public final int c() {
        return Math.max((int) (this.f31944s * (getMeasuredWidth() - this.f31939e)), 0);
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
        int i11 = this.f31939e;
        if (action == 1 || motionEvent.getAction() == 3) {
            this.K = false;
            if (motionEvent.getAction() == 1) {
                if (Math.abs(motionEvent.getY() - this.M) < ViewConfiguration.get(getContext()).getScaledTouchSlop()) {
                    int measuredHeight = (getMeasuredHeight() - i10) / 2;
                    if (this.f31941f - measuredHeight > motionEvent.getX() || motionEvent.getX() > this.f31941f + i10 + measuredHeight) {
                        int x8 = ((int) motionEvent.getX()) - (i10 / 2);
                        this.f31941f = x8;
                        if (x8 < c()) {
                            this.f31941f = c();
                        } else if (this.f31941f > getMeasuredWidth() - i11) {
                            this.f31941f = getMeasuredWidth() - i11;
                        }
                    }
                    this.f31942n = (int) (motionEvent.getX() - this.f31941f);
                    this.v = true;
                }
            }
            if (this.v) {
                if (motionEvent.getAction() == 1) {
                    if (this.H) {
                        float measuredWidth = (getMeasuredWidth() - i11) / 2;
                        float f10 = this.f31941f;
                        if (f10 >= measuredWidth) {
                            f((f10 - measuredWidth) / measuredWidth, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth - f10) / measuredWidth)), false);
                        }
                    } else {
                        f(this.f31941f / (getMeasuredWidth() - i11), true);
                    }
                }
                if (zVar != null) {
                    zVar.setState(StateSet.NOTHING);
                }
                this.f31945w.r();
                this.v = false;
                AndroidUtilities.runOnUIThread(new mb0(this, 25), 50L);
                invalidate();
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!this.K) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                if (Math.abs(motionEvent.getY() - this.M) <= viewConfiguration.getScaledTouchSlop() && Math.abs(motionEvent.getX() - this.L) > viewConfiguration.getScaledTouchSlop()) {
                    this.K = true;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    int measuredHeight2 = (getMeasuredHeight() - i10) / 2;
                    if (motionEvent.getY() >= 0.0f && motionEvent.getY() <= getMeasuredHeight()) {
                        if (this.f31941f - measuredHeight2 > motionEvent.getX() || motionEvent.getX() > this.f31941f + i10 + measuredHeight2) {
                            int x10 = ((int) motionEvent.getX()) - (i10 / 2);
                            this.f31941f = x10;
                            if (x10 < c()) {
                                this.f31941f = c();
                            } else if (this.f31941f > getMeasuredWidth() - i11) {
                                this.f31941f = getMeasuredWidth() - i11;
                            }
                        }
                        this.f31942n = (int) (motionEvent.getX() - this.f31941f);
                        this.v = true;
                        this.f31945w.r();
                        if (zVar != null) {
                            zVar.setState(this.C);
                            zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                        }
                        invalidate();
                        return true;
                    }
                }
            } else if (this.v) {
                int x11 = (int) (motionEvent.getX() - this.f31942n);
                this.f31941f = x11;
                if (x11 < c()) {
                    this.f31941f = c();
                } else if (this.f31941f > getMeasuredWidth() - i11) {
                    this.f31941f = getMeasuredWidth() - i11;
                }
                if (this.f31946x) {
                    if (this.H) {
                        float measuredWidth2 = (getMeasuredWidth() - i11) / 2;
                        float f11 = this.f31941f;
                        if (f11 >= measuredWidth2) {
                            f((f11 - measuredWidth2) / measuredWidth2, false);
                        } else {
                            f(-Math.max(0.01f, 1.0f - ((measuredWidth2 - f11) / measuredWidth2)), false);
                        }
                    } else {
                        f(this.f31941f / (getMeasuredWidth() - i11), false);
                    }
                }
                if (zVar != null) {
                    zVar.setHotspot(motionEvent.getX(), motionEvent.getY());
                }
                invalidate();
                return true;
            }
        }
        return false;
    }

    public final void e(float f10, boolean z10) {
        double dCeil;
        if (getMeasuredWidth() == 0) {
            this.f31943r = f10;
            return;
        }
        this.f31943r = -100.0f;
        boolean z11 = this.H;
        int i10 = this.f31939e;
        if (z11) {
            float measuredWidth = (getMeasuredWidth() - i10) / 2;
            dCeil = f10 < 0.0f ? Math.ceil(((-(f10 + 1.0f)) * measuredWidth) + measuredWidth) : Math.ceil((f10 * measuredWidth) + measuredWidth);
        } else {
            dCeil = Math.ceil((getMeasuredWidth() - i10) * f10);
        }
        int i11 = (int) dCeil;
        int i12 = this.f31941f;
        if (i12 != i11) {
            if (z10) {
                this.E = i12;
                this.D = 0.0f;
            }
            this.f31941f = i11;
            if (i11 < c()) {
                this.f31941f = c();
            } else if (this.f31941f > getMeasuredWidth() - i10) {
                this.f31941f = getMeasuredWidth() - i10;
            }
            invalidate();
        }
    }

    public final void f(float f10, boolean z10) {
        pn0 pn0Var = this.f31945w;
        if (pn0Var != null) {
            pn0Var.P(f10, z10);
        }
        int i10 = this.F;
        if (i10 > 1) {
            int iRound = Math.round((i10 - 1) * f10);
            if (!z10 && iRound != this.N) {
                AndroidUtilities.vibrateCursor(this);
            }
            this.N = iRound;
        }
    }

    public final void g(MessageObject messageObject) {
        Integer num;
        String str;
        Long lValueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (lValueOf.longValue() < 0) {
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
                MessageObject.addUrlsByPattern(messageObject.isOut(), messageObject.youtubeDescription, false, 3, (int) lValueOf.longValue(), false);
            }
            charSequence = messageObject.youtubeDescription;
        }
        boolean z10 = charSequence != this.P;
        if (z10 || this.Q != lValueOf.longValue()) {
            this.P = charSequence;
            this.Q = lValueOf.longValue() * 10;
            if (getTimestampLabelWidth() != this.f31940e0) {
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
                r41[] r41VarArr = (r41[]) spanned.getSpans(0, spanned.length(), r41.class);
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
                for (r41 r41Var : r41VarArr) {
                    if (r41Var != null && r41Var.getURL() != null && r41Var.d != null && r41Var.getURL().startsWith("audio?") && (num = Utilities.parseInt((CharSequence) r41Var.getURL().substring(6))) != null && num.intValue() >= 0) {
                        float fIntValue = (((long) num.intValue()) * 1000) / lValueOf.longValue();
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r41Var.d);
                        Emoji.replaceEmoji(spannableStringBuilder, this.U.getFontMetricsInt(), false);
                        this.O.add(new Pair(Float.valueOf(fIntValue), spannableStringBuilder));
                    }
                }
                Collections.sort(this.O, new k9.a(29));
            } catch (Exception e9) {
                FileLog.e(e9);
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
        return getMeasuredWidth() == 0 ? this.f31943r : this.f31941f / (getMeasuredWidth() - this.f31939e);
    }

    public nn0 getSeekBarAccessibilityDelegate() {
        return this.f31932a;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        float f14;
        CharSequence charSequence;
        Canvas canvas2 = canvas;
        int iD = this.f31941f;
        boolean z11 = this.H;
        int i10 = this.f31939e;
        if (!z11 && this.F > 1) {
            float measuredWidth = (getMeasuredWidth() - i10) / (this.F - 1.0f);
            iD = (int) this.h.d(Math.round(iD / measuredWidth) * measuredWidth, false);
        }
        int i11 = iD;
        int measuredHeight = getMeasuredHeight();
        int i12 = this.d;
        int i13 = (measuredHeight - i12) / 2;
        int i14 = org.telegram.ui.ActionBar.g6.Ti;
        org.telegram.ui.ActionBar.c6 c6Var = this.I;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i14, c6Var);
        Paint paint = this.f31934b;
        paint.setColor(iV0);
        float measuredHeight2 = getMeasuredHeight() / 2.0f;
        float f15 = i10 / 2.0f;
        int i15 = i10 / 2;
        float measuredWidth2 = getMeasuredWidth() - i15;
        float fDp = measuredHeight2 - (AndroidUtilities.dp(this.G) / 2.0f);
        float fDp2 = (AndroidUtilities.dp(this.G) / 2.0f) + measuredHeight2;
        RectF rectF = this.f31937c0;
        rectF.set(f15, fDp, measuredWidth2, fDp2);
        a(canvas2, rectF, paint);
        if (this.f31947y > 0.0f) {
            paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Ui, c6Var));
            f10 = 0.0f;
            rectF.set(f15, fDp, (this.f31947y * (getMeasuredWidth() - i10)) + f15, fDp2);
            a(canvas2, rectF, paint);
        } else {
            f10 = 0.0f;
        }
        boolean z12 = this.H;
        Paint paint2 = this.f31936c;
        if (z12) {
            canvas2.drawRect((getMeasuredWidth() / 2) - AndroidUtilities.dp(1.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f) + (getMeasuredWidth() / 2), AndroidUtilities.dp(6.0f) + (getMeasuredHeight() / 2), paint2);
            if (i11 > (getMeasuredWidth() - i10) / 2) {
                canvas2 = canvas;
                canvas2.drawRect(getMeasuredWidth() / 2, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), i15 + i11, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            } else {
                canvas2 = canvas;
                canvas2.drawRect(i15 + i11, (getMeasuredHeight() / 2) - AndroidUtilities.dp(1.0f), getMeasuredWidth() / 2, AndroidUtilities.dp(1.0f) + (getMeasuredHeight() / 2), paint2);
            }
            f15 = f15;
        } else {
            float f16 = this.f31944s;
            if (f16 >= f10) {
                float f17 = measuredWidth2 - f15;
                rectF.set((f16 * f17) + f15, fDp, i11 + f15, fDp2);
                a(canvas2, rectF, paint2);
                int alpha = paint2.getAlpha();
                rectF.set(f15, fDp, (this.f31944s * f17) + f15, fDp2);
                paint2.setAlpha((int) (alpha * 0.5f));
                a(canvas2, rectF, paint2);
                paint2.setAlpha(alpha);
            } else {
                rectF.set(f15, fDp, i11 + f15, fDp2);
                a(canvas2, rectF, paint2);
            }
        }
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            int iDp = (i15 + i11) - AndroidUtilities.dp(16.0f);
            int iDp2 = ((i12 / 2) + i13) - AndroidUtilities.dp(16.0f);
            zVar.setBounds(iDp, iDp2, AndroidUtilities.dp(32.0f) + iDp, AndroidUtilities.dp(32.0f) + iDp2);
            zVar.draw(canvas2);
        }
        int iDp3 = AndroidUtilities.dp(this.v ? 8.0f : 6.0f);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime > 18) {
            jElapsedRealtime = 16;
        }
        float f18 = this.B;
        float f19 = iDp3;
        if (f18 != f19) {
            if (f18 < f19) {
                f11 = 16.0f;
                f12 = 8.0f;
                float fC = s3.c.c(jElapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f18);
                this.B = fC;
                if (fC > f19) {
                    this.B = f19;
                }
            } else {
                f11 = 16.0f;
                f12 = 8.0f;
                float fC2 = org.telegram.messenger.rl.c(jElapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f18);
                this.B = fC2;
                if (fC2 < f19) {
                    this.B = f19;
                }
            }
            z10 = true;
        } else {
            f11 = 16.0f;
            f12 = 8.0f;
            z10 = false;
        }
        float f20 = this.D;
        if (f20 < 1.0f) {
            float f21 = (jElapsedRealtime / 225.0f) + f20;
            this.D = f21;
            if (f21 < 1.0f) {
                z10 = true;
            } else {
                this.D = 1.0f;
            }
        }
        float f22 = this.D;
        if (f22 < 1.0f) {
            float interpolation = 1.0f - ws.f34318c.getInterpolation(Math.min(1.0f, f22 * 3.0f));
            float interpolation2 = ws.d.getInterpolation(this.D);
            if (interpolation > f10) {
                canvas2.drawCircle(i15 + this.E, (i12 / 2) + i13, this.B * interpolation, paint2);
            }
            canvas2.drawCircle(i15 + i11, (i12 / 2) + i13, this.B * interpolation2, paint2);
        } else {
            canvas2.drawCircle(i15 + i11, (i12 / 2) + i13, this.B, paint2);
        }
        ArrayList arrayList = this.O;
        if (arrayList != null && !arrayList.isEmpty()) {
            float progress = getProgress();
            int size = this.O.size();
            do {
                size--;
                if (size < 0) {
                    size = -1;
                    break;
                }
            } while (((Float) ((Pair) this.O.get(size)).first).floatValue() - 0.001f > progress);
            setTimestampIndex(size);
            if (this.T == null) {
                this.T = new StaticLayout[2];
            }
            float fDp3 = (this.Q > 600000 ? AndroidUtilities.dp(42.0f) : 0) + f15;
            float fAbs = Math.abs(fDp3 - ((getMeasuredWidth() - f15) - (this.Q > 600000 ? AndroidUtilities.dp(42.0f) : 0))) - AndroidUtilities.dp(66.0f);
            float f23 = this.f31935b0;
            if (f23 > f10 && Math.abs(f23 - fAbs) > 0.01f) {
                StaticLayout[] staticLayoutArr = this.T;
                StaticLayout staticLayout = staticLayoutArr[0];
                if (staticLayout != null) {
                    staticLayoutArr[0] = b((int) fAbs, staticLayout.getText());
                }
                StaticLayout[] staticLayoutArr2 = this.T;
                StaticLayout staticLayout2 = staticLayoutArr2[1];
                if (staticLayout2 != null) {
                    staticLayoutArr2[1] = b((int) fAbs, staticLayout2.getText());
                }
            }
            this.f31935b0 = fAbs;
            if (size != this.S) {
                StaticLayout[] staticLayoutArr3 = this.T;
                staticLayoutArr3[1] = staticLayoutArr3[0];
                if (this.v) {
                    AndroidUtilities.vibrateCursor(this);
                }
                if (size < 0 || size >= this.O.size() || (charSequence = (CharSequence) ((Pair) this.O.get(size)).second) == null) {
                    this.T[0] = null;
                } else {
                    this.T[0] = b((int) fAbs, charSequence);
                }
                this.V = 0.0f;
                if (size == -1) {
                    this.W = -1;
                } else {
                    int i16 = this.S;
                    if (i16 == -1) {
                        this.W = 1;
                    } else if (size < i16) {
                        this.W = -1;
                    } else if (size > i16) {
                        this.W = 1;
                    }
                }
                this.S = size;
            }
            if (this.V < 1.0f) {
                this.V = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f31933a0)) / (this.O.size() > 8 ? 160.0f : 220.0f)) + this.V, 1.0f);
                invalidate();
                this.f31933a0 = SystemClock.elapsedRealtime();
            }
            if (this.R < 1.0f) {
                this.R = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.f31933a0)) / 200.0f) + this.R, 1.0f);
                invalidate();
                SystemClock.elapsedRealtime();
            }
            float interpolation3 = er.f28122f.getInterpolation(this.V);
            canvas2.save();
            canvas2.translate(fDp3 + AndroidUtilities.dp(25.0f), (getMeasuredHeight() / 2.0f) + AndroidUtilities.dp(14.0f));
            this.U.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Si, c6Var));
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
                    canvas2.translate(com.google.android.recaptcha.internal.a.z(1.0f, interpolation3, AndroidUtilities.dp(f11) * this.W, AndroidUtilities.dp(f12)), 0.0f);
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int iDp = AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2);
        on0 on0Var = this.J;
        int measuredHeight = (on0Var.getMeasuredHeight() / 2) + iDp;
        int iDp2 = AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(25.0f) + (this.f31939e / 2) + (this.Q > 600000 ? AndroidUtilities.dp(42.0f) : 0);
        on0Var.layout(iDp2, measuredHeight - on0Var.getMeasuredHeight(), on0Var.getMeasuredWidth() + iDp2, measuredHeight);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int timestampLabelWidth = getTimestampLabelWidth();
        this.f31940e0 = timestampLabelWidth;
        this.J.measure(View.MeasureSpec.makeMeasureSpec(timestampLabelWidth, 1073741824), 0);
        if (this.f31943r == -100.0f || getMeasuredWidth() <= 0) {
            return;
        }
        setProgress(this.f31943r);
        this.f31943r = -100.0f;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return d(motionEvent);
    }

    public void setBufferedProgress(float f10) {
        this.f31947y = f10;
        invalidate();
    }

    public void setDelegate(pn0 pn0Var) {
        this.f31945w = pn0Var;
    }

    public void setInnerColor(int i10) {
        this.f31934b.setColor(i10);
    }

    public void setLineWidth(int i10) {
        this.G = i10;
    }

    public void setMinProgress(float f10) {
        this.f31944s = f10;
        float progress = getProgress();
        float f11 = this.f31944s;
        if (progress < f11) {
            e(f11, false);
        }
        invalidate();
    }

    public void setOuterColor(int i10) {
        this.f31936c.setColor(i10);
        org.telegram.ui.Cells.z zVar = this.A;
        if (zVar != null) {
            org.telegram.ui.ActionBar.g6.B1(zVar, i0.b.k(i10, 40), true);
        }
    }

    public void setProgress(float f10) {
        e(f10, false);
    }

    public void setReportChanges(boolean z10) {
        this.f31946x = z10;
    }

    public void setSeparatorsCount(int i10) {
        this.F = i10;
    }

    public void setTwoSided(boolean z10) {
        this.H = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.A;
    }

    public qn0(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.h = new y5(this, 0L, 60L, er.f28123g);
        this.f31943r = -100.0f;
        this.f31944s = -1.0f;
        this.C = new int[]{16842910, 16842919};
        this.D = 1.0f;
        this.G = 3;
        this.R = 0.0f;
        this.S = -1;
        this.V = 1.0f;
        this.f31935b0 = -1.0f;
        this.f31937c0 = new RectF();
        this.f31938d0 = -1;
        this.I = c6Var;
        setWillNotDraw(false);
        this.f31934b = new Paint(1);
        Paint paint = new Paint(1);
        this.f31936c = paint;
        int i10 = org.telegram.ui.ActionBar.g6.Vi;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.f31939e = AndroidUtilities.dp(32.0f);
        this.d = AndroidUtilities.dp(24.0f);
        this.B = AndroidUtilities.dp(6.0f);
        org.telegram.ui.Cells.z zVarF0 = org.telegram.ui.ActionBar.g6.f0(i0.b.k(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), 40), 1, AndroidUtilities.dp(16.0f));
        this.A = zVarF0;
        zVarF0.setCallback(this);
        zVarF0.setVisible(true, false);
        on0 on0Var = new on0(this, context, context, 0);
        this.J = on0Var;
        on0Var.f33291x = true;
        addView(on0Var, h7.z5.c(-2.0f, -1));
        setImportantForAccessibility(1);
        org.telegram.ui.Cells.e1 e1Var = new org.telegram.ui.Cells.e1(this, z10);
        this.f31932a = e1Var;
        setAccessibilityDelegate(e1Var);
    }
}

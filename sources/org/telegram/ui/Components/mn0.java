package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

public class mn0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;

    public float f30705a;

    public int f30709f;

    public int f30710g;
    public ln0 h;

    public int f30711i;

    public int f30712j;

    public int f30713k;

    public int f30714l;

    public int f30715m;

    public boolean f30718p;

    public float f30719q;

    public float f30720r;

    public View f30721s;

    public ArrayList f30723u;
    public CharSequence v;

    public long f30724w;

    public StaticLayout[] f30727z;

    public int f30706b = 0;

    public int f30707c = 0;
    public int d = 0;

    public boolean f30708e = false;

    public final RectF f30716n = new RectF();

    public final int f30717o = AndroidUtilities.dp(2.0f);

    public float f30722t = 1.0f;

    public float f30725x = 0.0f;

    public int f30726y = -1;
    public float B = 1.0f;

    public mn0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f30721s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f30720r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f30723u = null;
        this.f30726y = -1;
        this.f30725x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f30727z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f30724w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        float f10 = this.f30722t;
        if (f10 <= 0.0f) {
            return;
        }
        if (f10 < 1.0f) {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, this.f30709f, this.f30710g, (int) (f10 * 255.0f), 31);
        } else {
            canvas2 = canvas;
        }
        int i10 = E / 2;
        int i11 = this.f30710g / 2;
        int i12 = this.f30717o / 2;
        RectF rectF = this.f30716n;
        rectF.set(i10, i11 - i12, this.f30709f - i10, i11 + i12);
        D.setColor(this.f30718p ? this.f30715m : this.f30711i);
        c(canvas2, rectF, D);
        if (this.f30719q > 0.0f) {
            D.setColor(this.f30718p ? this.f30715m : this.f30712j);
            int i13 = E;
            float f11 = i13 / 2;
            int i14 = this.f30710g / 2;
            rectF.set(f11, i14 - i12, (this.f30719q * (this.f30709f - i13)) + f11, i14 + i12);
            c(canvas2, rectF, D);
        }
        int i15 = E / 2;
        float f12 = i15;
        int i16 = this.f30710g / 2;
        rectF.set(f12, i16 - i12, i15 + (this.f30708e ? this.f30707c : this.f30706b), i12 + i16);
        D.setColor(this.f30714l);
        c(canvas2, rectF, D);
        D.setColor(this.f30713k);
        float fDp = AndroidUtilities.dp(this.f30708e ? 8.0f : 6.0f);
        if (this.f30720r != fDp) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime > 18) {
                jElapsedRealtime = 16;
            }
            float f13 = this.f30720r;
            if (f13 < fDp) {
                float fC = s3.c.c(jElapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f13);
                this.f30720r = fC;
                if (fC > fDp) {
                    this.f30720r = fDp;
                }
            } else {
                float fC2 = org.telegram.messenger.rl.c(jElapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f13);
                this.f30720r = fC2;
                if (fC2 < fDp) {
                    this.f30720r = fDp;
                }
            }
            View view = this.f30721s;
            if (view != null) {
                view.invalidate();
            }
        }
        canvas2.drawCircle((E / 2) + (this.f30708e ? this.f30707c : this.f30706b), this.f30710g / 2, this.f30720r, D);
        if (this.f30722t < 1.0f) {
            canvas2.restore();
        }
        ArrayList arrayList = this.f30723u;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        float f14 = (this.f30708e ? this.f30707c : this.f30706b) / (this.f30709f - E);
        int size = this.f30723u.size() - 1;
        while (true) {
            if (size < 0) {
                size = -1;
                break;
            } else if (((Float) ((Pair) this.f30723u.get(size)).first).floatValue() - 0.001f <= f14) {
                break;
            } else {
                size--;
            }
        }
        if (this.f30727z == null) {
            this.f30727z = new StaticLayout[2];
        }
        float f15 = E / 2.0f;
        Math.abs(f15 - (this.f30709f - f15));
        AndroidUtilities.dp(66.0f);
        if (size != this.f30726y) {
            if (this.f30708e) {
                AndroidUtilities.vibrateCursor(this.f30721s);
            }
            this.f30726y = size;
            if (size >= 0 && size < this.f30723u.size()) {
                e((r41) ((Pair) this.f30723u.get(this.f30726y)).second);
            }
        }
        if (this.B < 1.0f) {
            this.B = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C)) / (this.f30723u.size() > 8 ? 160.0f : 220.0f)) + this.B, 1.0f);
            View view2 = this.f30721s;
            if (view2 != null) {
                view2.invalidate();
            }
            this.C = SystemClock.elapsedRealtime();
        }
        if (this.f30725x < 1.0f) {
            this.f30725x = Math.min((Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C)) / 200.0f) + this.f30725x, 1.0f);
            View view3 = this.f30721s;
            if (view3 != null) {
                view3.invalidate();
            }
            SystemClock.elapsedRealtime();
        }
    }

    public final void c(Canvas canvas, RectF rectF, Paint paint) {
        int size;
        char c10;
        float fFloatValue;
        char c11;
        char c12;
        mn0 mn0Var = this;
        float f10 = E / 2.0f;
        ArrayList arrayList = mn0Var.f30723u;
        if (arrayList == null || arrayList.isEmpty()) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        float f11 = rectF.bottom;
        int i10 = E;
        float f12 = i10 / 2.0f;
        float f13 = mn0Var.f30709f - (i10 / 2.0f);
        AndroidUtilities.rectTmp.set(rectF);
        float fDp = AndroidUtilities.dp(mn0Var.f30725x * 1.0f) / 2.0f;
        if (G == null) {
            G = new Path();
        }
        G.reset();
        float fDp2 = AndroidUtilities.dp(4.0f) / (f13 - f12);
        int i11 = 0;
        while (true) {
            size = -1;
            if (i11 >= mn0Var.f30723u.size()) {
                i11 = -1;
                break;
            } else if (((Float) ((Pair) mn0Var.f30723u.get(i11)).first).floatValue() >= fDp2) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 < 0) {
            i11 = 0;
        }
        for (int size2 = mn0Var.f30723u.size() - 1; size2 >= 0; size2--) {
            if (1.0f - ((Float) ((Pair) mn0Var.f30723u.get(size2)).first).floatValue() >= fDp2) {
                size = size2 + 1;
                break;
            }
        }
        if (size < 0) {
            size = mn0Var.f30723u.size();
        }
        int i12 = i11;
        while (i12 <= size) {
            if (i12 == i11) {
                fFloatValue = 0.0f;
                c10 = 0;
            } else {
                c10 = 0;
                fFloatValue = ((Float) ((Pair) mn0Var.f30723u.get(i12 - 1)).first).floatValue();
            }
            float fFloatValue2 = i12 == size ? 1.0f : ((Float) ((Pair) mn0Var.f30723u.get(i12)).first).floatValue();
            while (true) {
                if (i12 == size || i12 == 0) {
                    c11 = 1;
                    break;
                }
                c11 = 1;
                if (i12 >= mn0Var.f30723u.size() - 1 || ((Float) ((Pair) mn0Var.f30723u.get(i12)).first).floatValue() - fFloatValue > fDp2) {
                    break;
                }
                i12++;
                fFloatValue2 = ((Float) ((Pair) mn0Var.f30723u.get(i12)).first).floatValue();
            }
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.left = AndroidUtilities.lerp(f12, f13, fFloatValue) + (i12 > 0 ? fDp : 0.0f);
            float fLerp = AndroidUtilities.lerp(f12, f13, fFloatValue2) - (i12 < size ? fDp : 0.0f);
            rectF2.right = fLerp;
            float f14 = rectF.right;
            boolean z10 = fLerp > f14;
            if (z10) {
                rectF2.right = f14;
            }
            float f15 = rectF2.right;
            float f16 = rectF.left;
            if (f15 >= f16) {
                if (rectF2.left < f16) {
                    rectF2.left = f16;
                }
                if (F == null) {
                    F = new float[8];
                }
                if (i12 != i11) {
                    if (z10) {
                        c12 = 4;
                        if (rectF2.left >= rectF.left) {
                        }
                        G.addRoundRect(rectF2, F, Path.Direction.CW);
                        if (z10) {
                            break;
                        }
                    } else {
                        c12 = 4;
                    }
                    if (i12 >= size) {
                        float[] fArr = F;
                        float f17 = 0.7f * f10 * mn0Var.f30725x;
                        fArr[7] = f17;
                        fArr[6] = f17;
                        fArr[c11] = f17;
                        fArr[c10] = f17;
                        fArr[5] = f10;
                        fArr[c12] = f10;
                        fArr[3] = f10;
                        fArr[2] = f10;
                    } else {
                        float[] fArr2 = F;
                        float f18 = 0.7f * f10 * mn0Var.f30725x;
                        fArr2[5] = f18;
                        fArr2[c12] = f18;
                        fArr2[3] = f18;
                        fArr2[2] = f18;
                        fArr2[7] = f18;
                        fArr2[6] = f18;
                        fArr2[c11] = f18;
                        fArr2[c10] = f18;
                    }
                    G.addRoundRect(rectF2, F, Path.Direction.CW);
                    if (z10) {
                        break;
                        break;
                    }
                } else {
                    c12 = 4;
                }
                float[] fArr3 = F;
                fArr3[7] = f10;
                fArr3[6] = f10;
                fArr3[c11] = f10;
                fArr3[c10] = f10;
                float f19 = 0.7f * f10 * mn0Var.f30725x;
                fArr3[5] = f19;
                fArr3[c12] = f19;
                fArr3[3] = f19;
                fArr3[2] = f19;
                G.addRoundRect(rectF2, F, Path.Direction.CW);
                if (z10) {
                    break;
                    break;
                }
            }
            i12++;
            mn0Var = this;
        }
        canvas.drawPath(G, paint);
    }

    public final int d() {
        return this.f30709f - E;
    }

    public final boolean f(float f10, float f11, int i10) {
        ln0 ln0Var;
        if (i10 == 0) {
            int i11 = this.f30710g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f10 >= (-i13)) {
                int i14 = this.f30709f;
                if (f10 <= i14 + i13 && f11 >= 0.0f && f11 <= i11) {
                    int i15 = this.f30706b;
                    if (i15 - i13 > f10 || f10 > i15 + i12 + i13) {
                        int i16 = ((int) f10) - (i12 / 2);
                        this.f30706b = i16;
                        if (i16 < 0) {
                            this.f30706b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f30706b = i17;
                            }
                        }
                    }
                    this.f30708e = true;
                    int i18 = this.f30706b;
                    this.f30707c = i18;
                    this.d = (int) (f10 - i18);
                    return true;
                }
            }
        } else if (i10 == 1 || i10 == 3) {
            if (this.f30708e) {
                int i19 = this.f30707c;
                this.f30706b = i19;
                if (i10 == 1 && (ln0Var = this.h) != null) {
                    ln0Var.b(i19 / (this.f30709f - E));
                }
                this.f30708e = false;
                return true;
            }
        } else if (i10 == 2 && this.f30708e) {
            int i20 = (int) (f10 - this.d);
            this.f30707c = i20;
            if (i20 < 0) {
                this.f30707c = 0;
            } else {
                int i21 = this.f30709f - E;
                if (i20 > i21) {
                    this.f30707c = i21;
                }
            }
            ln0 ln0Var2 = this.h;
            if (ln0Var2 != null) {
                ln0Var2.e(this.f30707c / (this.f30709f - E));
            }
            return true;
        }
        return false;
    }

    public final void g(float f10) {
        this.f30722t = f10;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f30711i = i10;
        this.f30712j = i11;
        this.f30713k = i13;
        this.f30714l = i12;
        this.f30715m = i14;
    }

    public final void i(float f10) {
        this.f30705a = f10;
        int iCeil = (int) Math.ceil((this.f30709f - E) * f10);
        this.f30706b = iCeil;
        if (iCeil < 0) {
            this.f30706b = 0;
            return;
        }
        int i10 = this.f30709f;
        int i11 = E;
        if (iCeil > i10 - i11) {
            this.f30706b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f30709f == i10 && this.f30710g == i11) {
            return;
        }
        this.f30709f = i10;
        this.f30710g = i11;
        i(this.f30705a);
    }

    public final void k(MessageObject messageObject) {
        Integer num;
        String str;
        if (messageObject == null) {
            a();
            return;
        }
        Long lValueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (lValueOf.longValue() < 0) {
            a();
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
        if (charSequence == this.v && this.f30724w == lValueOf.longValue()) {
            return;
        }
        this.v = charSequence;
        this.f30724w = lValueOf.longValue();
        if (!(charSequence instanceof Spanned)) {
            this.f30723u = null;
            this.f30726y = -1;
            this.f30725x = 0.0f;
            StaticLayout[] staticLayoutArr = this.f30727z;
            if (staticLayoutArr != null) {
                staticLayoutArr[1] = null;
                staticLayoutArr[0] = null;
                return;
            }
            return;
        }
        Spanned spanned = (Spanned) charSequence;
        try {
            r41[] r41VarArr = (r41[]) spanned.getSpans(0, spanned.length(), r41.class);
            this.f30723u = new ArrayList();
            this.f30725x = 0.0f;
            if (this.A == null) {
                TextPaint textPaint = new TextPaint(1);
                this.A = textPaint;
                textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                this.A.setColor(-1);
            }
            for (r41 r41Var : r41VarArr) {
                try {
                    if (r41Var != null && r41Var.getURL() != null && r41Var.d != null && r41Var.getURL().startsWith("audio?") && (num = Utilities.parseInt((CharSequence) r41Var.getURL().substring(6))) != null && num.intValue() >= 0) {
                        float fIntValue = (((long) num.intValue()) * 1000) / lValueOf.longValue();
                        Emoji.replaceEmoji(new SpannableStringBuilder(r41Var.d), this.A.getFontMetricsInt(), false);
                        this.f30723u.add(new Pair(Float.valueOf(fIntValue), r41Var));
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
            Collections.sort(this.f30723u, new k9.a(28));
        } catch (Exception e10) {
            FileLog.e(e10);
            this.f30723u = null;
            this.f30726y = -1;
            this.f30725x = 0.0f;
            StaticLayout[] staticLayoutArr2 = this.f30727z;
            if (staticLayoutArr2 != null) {
                staticLayoutArr2[1] = null;
                staticLayoutArr2[0] = null;
            }
        }
    }

    public void e(r41 r41Var) {
    }
}

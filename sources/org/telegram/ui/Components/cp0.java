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
public class cp0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f23850a;
    public int f23853f;
    public int f23854g;
    public bp0 h;
    public int f23855i;
    public int f23856j;
    public int f23857k;
    public int f23858l;
    public int f23859m;
    public boolean f23862p;
    public float f23863q;
    public float f23864r;
    public View f23865s;
    public ArrayList f23867u;
    public CharSequence v;
    public long f23868w;
    public StaticLayout[] f23871z;
    public int f23851b = 0;
    public int f23852c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f23860n = new RectF();
    public final int f23861o = AndroidUtilities.dp(2.0f);
    public float f23866t = 1.0f;
    public float f23869x = 0.0f;
    public int f23870y = -1;
    public float B = 1.0f;

    public cp0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f23865s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f23864r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f23867u = null;
        this.f23870y = -1;
        this.f23869x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f23871z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f23868w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        int i12;
        int i13;
        float f7;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        float f11 = this.f23866t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f23853f, this.f23854g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f23854g / 2;
            int i20 = this.f23861o / 2;
            RectF rectF = this.f23860n;
            rectF.set(i18, i19 - i20, this.f23853f - i18, i19 + i20);
            Paint paint = D;
            if (this.f23862p) {
                i10 = this.f23859m;
            } else {
                i10 = this.f23855i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f23863q > 0.0f) {
                Paint paint2 = D;
                if (this.f23862p) {
                    i16 = this.f23859m;
                } else {
                    i16 = this.f23856j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f23854g / 2;
                rectF.set(f12, i21 - i20, (this.f23863q * (this.f23853f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f23854g / 2) - i20;
            if (this.e) {
                i13 = this.f23852c;
            } else {
                i13 = this.f23851b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f23858l);
            c(canvas2, rectF, D);
            D.setColor(this.f23857k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f23864r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f23864r;
                if (f15 < dp) {
                    float d = a1.g.d((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f23864r = d;
                    if (d > dp) {
                        this.f23864r = dp;
                    }
                } else {
                    float b10 = org.telegram.messenger.sk.b((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f23864r = b10;
                    if (b10 < dp) {
                        this.f23864r = dp;
                    }
                }
                View view = this.f23865s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f23852c;
            } else {
                i14 = this.f23851b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f23854g / 2, this.f23864r, D);
            if (this.f23866t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f23867u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f23852c;
                } else {
                    i15 = this.f23851b;
                }
                float f16 = i15 / (this.f23853f - E);
                int size = this.f23867u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f23867u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f23871z == null) {
                    this.f23871z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f23853f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f23870y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f23865s);
                    }
                    this.f23870y = size;
                    if (size >= 0 && size < this.f23867u.size()) {
                        e((q61) ((Pair) this.f23867u.get(this.f23870y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f23867u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f23865s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f23869x < 1.0f) {
                    this.f23869x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f23869x, 1.0f);
                    View view3 = this.f23865s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cp0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f23853f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        bp0 bp0Var;
        if (i10 == 0) {
            int i11 = this.f23854g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f23853f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f23851b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f23851b = i16;
                        if (i16 < 0) {
                            this.f23851b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f23851b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f23851b;
                    this.f23852c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f23852c = i19;
                if (i19 < 0) {
                    this.f23852c = 0;
                } else {
                    int i20 = this.f23853f - E;
                    if (i19 > i20) {
                        this.f23852c = i20;
                    }
                }
                bp0 bp0Var2 = this.h;
                if (bp0Var2 != null) {
                    bp0Var2.c(this.f23852c / (this.f23853f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f23852c;
            this.f23851b = i21;
            if (i10 == 1 && (bp0Var = this.h) != null) {
                bp0Var.b(i21 / (this.f23853f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f23866t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f23855i = i10;
        this.f23856j = i11;
        this.f23857k = i13;
        this.f23858l = i12;
        this.f23859m = i14;
    }

    public final void i(float f7) {
        this.f23850a = f7;
        int ceil = (int) Math.ceil((this.f23853f - E) * f7);
        this.f23851b = ceil;
        if (ceil < 0) {
            this.f23851b = 0;
            return;
        }
        int i10 = this.f23853f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f23851b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f23853f == i10 && this.f23854g == i11) {
            return;
        }
        this.f23853f = i10;
        this.f23854g = i11;
        i(this.f23850a);
    }

    public final void k(MessageObject messageObject) {
        Integer parseInt;
        String str;
        if (messageObject == null) {
            a();
            return;
        }
        Long valueOf = Long.valueOf(((long) messageObject.getDuration()) * 1000);
        if (valueOf.longValue() < 0) {
            a();
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
        if (charSequence != this.v || this.f23868w != valueOf.longValue()) {
            this.v = charSequence;
            this.f23868w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f23867u = null;
                this.f23870y = -1;
                this.f23869x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f23871z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                q61[] q61VarArr = (q61[]) spanned.getSpans(0, spanned.length(), q61.class);
                this.f23867u = new ArrayList();
                this.f23869x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (q61 q61Var : q61VarArr) {
                    try {
                        if (q61Var != null && q61Var.getURL() != null && q61Var.d != null && q61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) q61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(q61Var.d), this.A.getFontMetricsInt(), false);
                            this.f23867u.add(new Pair(Float.valueOf(intValue), q61Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f23867u, new org.telegram.ui.ActionBar.l5(18));
            } catch (Exception e7) {
                FileLog.e(e7);
                this.f23867u = null;
                this.f23870y = -1;
                this.f23869x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f23871z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(q61 q61Var) {
    }
}

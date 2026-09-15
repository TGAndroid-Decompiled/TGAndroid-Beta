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
public class bo0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f22831a;
    public int f22834f;
    public int f22835g;
    public ao0 h;
    public int f22836i;
    public int f22837j;
    public int f22838k;
    public int f22839l;
    public int f22840m;
    public boolean f22843p;
    public float f22844q;
    public float f22845r;
    public View f22846s;
    public ArrayList f22848u;
    public CharSequence v;
    public long f22849w;
    public StaticLayout[] f22852z;
    public int f22832b = 0;
    public int f22833c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f22841n = new RectF();
    public final int f22842o = AndroidUtilities.dp(2.0f);
    public float f22847t = 1.0f;
    public float f22850x = 0.0f;
    public int f22851y = -1;
    public float B = 1.0f;

    public bo0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f22846s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f22845r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f22848u = null;
        this.f22851y = -1;
        this.f22850x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f22852z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f22849w = -1L;
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
        float f11 = this.f22847t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f22834f, this.f22835g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f22835g / 2;
            int i20 = this.f22842o / 2;
            RectF rectF = this.f22841n;
            rectF.set(i18, i19 - i20, this.f22834f - i18, i19 + i20);
            Paint paint = D;
            if (this.f22843p) {
                i10 = this.f22840m;
            } else {
                i10 = this.f22836i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f22844q > 0.0f) {
                Paint paint2 = D;
                if (this.f22843p) {
                    i16 = this.f22840m;
                } else {
                    i16 = this.f22837j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f22835g / 2;
                rectF.set(f12, i21 - i20, (this.f22844q * (this.f22834f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f22835g / 2) - i20;
            if (this.e) {
                i13 = this.f22833c;
            } else {
                i13 = this.f22832b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f22839l);
            c(canvas2, rectF, D);
            D.setColor(this.f22838k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f22845r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f22845r;
                if (f15 < dp) {
                    float e = a4.a.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f22845r = e;
                    if (e > dp) {
                        this.f22845r = dp;
                    }
                } else {
                    float c10 = org.telegram.messenger.wl.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f22845r = c10;
                    if (c10 < dp) {
                        this.f22845r = dp;
                    }
                }
                View view = this.f22846s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f22833c;
            } else {
                i14 = this.f22832b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f22835g / 2, this.f22845r, D);
            if (this.f22847t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f22848u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f22833c;
                } else {
                    i15 = this.f22832b;
                }
                float f16 = i15 / (this.f22834f - E);
                int size = this.f22848u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f22848u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f22852z == null) {
                    this.f22852z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f22834f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f22851y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f22846s);
                    }
                    this.f22851y = size;
                    if (size >= 0 && size < this.f22848u.size()) {
                        e((m51) ((Pair) this.f22848u.get(this.f22851y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f22848u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f22846s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f22850x < 1.0f) {
                    this.f22850x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f22850x, 1.0f);
                    View view3 = this.f22846s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bo0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f22834f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        ao0 ao0Var;
        if (i10 == 0) {
            int i11 = this.f22835g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f22834f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f22832b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f22832b = i16;
                        if (i16 < 0) {
                            this.f22832b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f22832b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f22832b;
                    this.f22833c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f22833c = i19;
                if (i19 < 0) {
                    this.f22833c = 0;
                } else {
                    int i20 = this.f22834f - E;
                    if (i19 > i20) {
                        this.f22833c = i20;
                    }
                }
                ao0 ao0Var2 = this.h;
                if (ao0Var2 != null) {
                    ao0Var2.d(this.f22833c / (this.f22834f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f22833c;
            this.f22832b = i21;
            if (i10 == 1 && (ao0Var = this.h) != null) {
                ao0Var.b(i21 / (this.f22834f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f22847t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f22836i = i10;
        this.f22837j = i11;
        this.f22838k = i13;
        this.f22839l = i12;
        this.f22840m = i14;
    }

    public final void i(float f7) {
        this.f22831a = f7;
        int ceil = (int) Math.ceil((this.f22834f - E) * f7);
        this.f22832b = ceil;
        if (ceil < 0) {
            this.f22832b = 0;
            return;
        }
        int i10 = this.f22834f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f22832b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f22834f == i10 && this.f22835g == i11) {
            return;
        }
        this.f22834f = i10;
        this.f22835g = i11;
        i(this.f22831a);
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
        if (charSequence != this.v || this.f22849w != valueOf.longValue()) {
            this.v = charSequence;
            this.f22849w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f22848u = null;
                this.f22851y = -1;
                this.f22850x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f22852z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                m51[] m51VarArr = (m51[]) spanned.getSpans(0, spanned.length(), m51.class);
                this.f22848u = new ArrayList();
                this.f22850x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (m51 m51Var : m51VarArr) {
                    try {
                        if (m51Var != null && m51Var.getURL() != null && m51Var.d != null && m51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) m51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(m51Var.d), this.A.getFontMetricsInt(), false);
                            this.f22848u.add(new Pair(Float.valueOf(intValue), m51Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f22848u, new org.telegram.ui.df(14));
            } catch (Exception e7) {
                FileLog.e(e7);
                this.f22848u = null;
                this.f22851y = -1;
                this.f22850x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f22852z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(m51 m51Var) {
    }
}

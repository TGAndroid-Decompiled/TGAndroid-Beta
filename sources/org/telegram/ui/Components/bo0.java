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
    public float f22829a;
    public int f22832f;
    public int f22833g;
    public ao0 h;
    public int f22834i;
    public int f22835j;
    public int f22836k;
    public int f22837l;
    public int f22838m;
    public boolean f22841p;
    public float f22842q;
    public float f22843r;
    public View f22844s;
    public ArrayList f22846u;
    public CharSequence v;
    public long f22847w;
    public StaticLayout[] f22850z;
    public int f22830b = 0;
    public int f22831c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f22839n = new RectF();
    public final int f22840o = AndroidUtilities.dp(2.0f);
    public float f22845t = 1.0f;
    public float f22848x = 0.0f;
    public int f22849y = -1;
    public float B = 1.0f;

    public bo0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f22844s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f22843r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f22846u = null;
        this.f22849y = -1;
        this.f22848x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f22850z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f22847w = -1L;
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
        float f11 = this.f22845t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f22832f, this.f22833g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f22833g / 2;
            int i20 = this.f22840o / 2;
            RectF rectF = this.f22839n;
            rectF.set(i18, i19 - i20, this.f22832f - i18, i19 + i20);
            Paint paint = D;
            if (this.f22841p) {
                i10 = this.f22838m;
            } else {
                i10 = this.f22834i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f22842q > 0.0f) {
                Paint paint2 = D;
                if (this.f22841p) {
                    i16 = this.f22838m;
                } else {
                    i16 = this.f22835j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f22833g / 2;
                rectF.set(f12, i21 - i20, (this.f22842q * (this.f22832f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f22833g / 2) - i20;
            if (this.e) {
                i13 = this.f22831c;
            } else {
                i13 = this.f22830b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f22837l);
            c(canvas2, rectF, D);
            D.setColor(this.f22836k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f22843r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f22843r;
                if (f15 < dp) {
                    float e = a4.a.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f22843r = e;
                    if (e > dp) {
                        this.f22843r = dp;
                    }
                } else {
                    float c10 = org.telegram.messenger.vl.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f22843r = c10;
                    if (c10 < dp) {
                        this.f22843r = dp;
                    }
                }
                View view = this.f22844s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f22831c;
            } else {
                i14 = this.f22830b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f22833g / 2, this.f22843r, D);
            if (this.f22845t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f22846u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f22831c;
                } else {
                    i15 = this.f22830b;
                }
                float f16 = i15 / (this.f22832f - E);
                int size = this.f22846u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f22846u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f22850z == null) {
                    this.f22850z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f22832f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f22849y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f22844s);
                    }
                    this.f22849y = size;
                    if (size >= 0 && size < this.f22846u.size()) {
                        e((m51) ((Pair) this.f22846u.get(this.f22849y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f22846u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f22844s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f22848x < 1.0f) {
                    this.f22848x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f22848x, 1.0f);
                    View view3 = this.f22844s;
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
        return this.f22832f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        ao0 ao0Var;
        if (i10 == 0) {
            int i11 = this.f22833g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f22832f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f22830b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f22830b = i16;
                        if (i16 < 0) {
                            this.f22830b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f22830b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f22830b;
                    this.f22831c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f22831c = i19;
                if (i19 < 0) {
                    this.f22831c = 0;
                } else {
                    int i20 = this.f22832f - E;
                    if (i19 > i20) {
                        this.f22831c = i20;
                    }
                }
                ao0 ao0Var2 = this.h;
                if (ao0Var2 != null) {
                    ao0Var2.d(this.f22831c / (this.f22832f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f22831c;
            this.f22830b = i21;
            if (i10 == 1 && (ao0Var = this.h) != null) {
                ao0Var.b(i21 / (this.f22832f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f22845t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f22834i = i10;
        this.f22835j = i11;
        this.f22836k = i13;
        this.f22837l = i12;
        this.f22838m = i14;
    }

    public final void i(float f7) {
        this.f22829a = f7;
        int ceil = (int) Math.ceil((this.f22832f - E) * f7);
        this.f22830b = ceil;
        if (ceil < 0) {
            this.f22830b = 0;
            return;
        }
        int i10 = this.f22832f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f22830b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f22832f == i10 && this.f22833g == i11) {
            return;
        }
        this.f22832f = i10;
        this.f22833g = i11;
        i(this.f22829a);
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
        if (charSequence != this.v || this.f22847w != valueOf.longValue()) {
            this.v = charSequence;
            this.f22847w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f22846u = null;
                this.f22849y = -1;
                this.f22848x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f22850z;
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
                this.f22846u = new ArrayList();
                this.f22848x = 0.0f;
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
                            this.f22846u.add(new Pair(Float.valueOf(intValue), m51Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f22846u, new org.telegram.ui.df(14));
            } catch (Exception e7) {
                FileLog.e(e7);
                this.f22846u = null;
                this.f22849y = -1;
                this.f22848x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f22850z;
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

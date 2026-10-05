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
public class uo0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f31469a;
    public int f31473f;
    public int f31474g;
    public to0 h;
    public int f31475i;
    public int f31476j;
    public int f31477k;
    public int f31478l;
    public int f31479m;
    public boolean f31482p;
    public float f31483q;
    public float f31484r;
    public View f31485s;
    public ArrayList f31487u;
    public CharSequence v;
    public long f31488w;
    public StaticLayout[] f31491z;
    public int f31470b = 0;
    public int f31471c = 0;
    public int d = 0;
    public boolean f31472e = false;
    public final RectF f31480n = new RectF();
    public final int f31481o = AndroidUtilities.dp(2.0f);
    public float f31486t = 1.0f;
    public float f31489x = 0.0f;
    public int f31490y = -1;
    public float B = 1.0f;

    public uo0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f31485s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f31484r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f31487u = null;
        this.f31490y = -1;
        this.f31489x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f31491z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f31488w = -1L;
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
        float f11 = this.f31486t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f31473f, this.f31474g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f31474g / 2;
            int i20 = this.f31481o / 2;
            RectF rectF = this.f31480n;
            rectF.set(i18, i19 - i20, this.f31473f - i18, i19 + i20);
            Paint paint = D;
            if (this.f31482p) {
                i10 = this.f31479m;
            } else {
                i10 = this.f31475i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f31483q > 0.0f) {
                Paint paint2 = D;
                if (this.f31482p) {
                    i16 = this.f31479m;
                } else {
                    i16 = this.f31476j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f31474g / 2;
                rectF.set(f12, i21 - i20, (this.f31483q * (this.f31473f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f31474g / 2) - i20;
            if (this.f31472e) {
                i13 = this.f31471c;
            } else {
                i13 = this.f31470b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f31478l);
            c(canvas2, rectF, D);
            D.setColor(this.f31477k);
            if (this.f31472e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f31484r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f31484r;
                if (f15 < dp) {
                    float e7 = a4.a.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f31484r = e7;
                    if (e7 > dp) {
                        this.f31484r = dp;
                    }
                } else {
                    float b10 = org.telegram.messenger.bi.b((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f31484r = b10;
                    if (b10 < dp) {
                        this.f31484r = dp;
                    }
                }
                View view = this.f31485s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f31472e) {
                i14 = this.f31471c;
            } else {
                i14 = this.f31470b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f31474g / 2, this.f31484r, D);
            if (this.f31486t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f31487u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f31472e) {
                    i15 = this.f31471c;
                } else {
                    i15 = this.f31470b;
                }
                float f16 = i15 / (this.f31473f - E);
                int size = this.f31487u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f31487u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f31491z == null) {
                    this.f31491z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f31473f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f31490y) {
                    if (this.f31472e) {
                        AndroidUtilities.vibrateCursor(this.f31485s);
                    }
                    this.f31490y = size;
                    if (size >= 0 && size < this.f31487u.size()) {
                        e((l61) ((Pair) this.f31487u.get(this.f31490y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f31487u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f31485s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f31489x < 1.0f) {
                    this.f31489x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f31489x, 1.0f);
                    View view3 = this.f31485s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uo0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f31473f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        to0 to0Var;
        if (i10 == 0) {
            int i11 = this.f31474g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f31473f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f31470b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f31470b = i16;
                        if (i16 < 0) {
                            this.f31470b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f31470b = i17;
                            }
                        }
                    }
                    this.f31472e = true;
                    int i18 = this.f31470b;
                    this.f31471c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f31472e) {
                int i19 = (int) (f7 - this.d);
                this.f31471c = i19;
                if (i19 < 0) {
                    this.f31471c = 0;
                } else {
                    int i20 = this.f31473f - E;
                    if (i19 > i20) {
                        this.f31471c = i20;
                    }
                }
                to0 to0Var2 = this.h;
                if (to0Var2 != null) {
                    to0Var2.d(this.f31471c / (this.f31473f - E));
                }
                return true;
            }
        } else if (this.f31472e) {
            int i21 = this.f31471c;
            this.f31470b = i21;
            if (i10 == 1 && (to0Var = this.h) != null) {
                to0Var.b(i21 / (this.f31473f - E));
            }
            this.f31472e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f31486t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f31475i = i10;
        this.f31476j = i11;
        this.f31477k = i13;
        this.f31478l = i12;
        this.f31479m = i14;
    }

    public final void i(float f7) {
        this.f31469a = f7;
        int ceil = (int) Math.ceil((this.f31473f - E) * f7);
        this.f31470b = ceil;
        if (ceil < 0) {
            this.f31470b = 0;
            return;
        }
        int i10 = this.f31473f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f31470b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f31473f == i10 && this.f31474g == i11) {
            return;
        }
        this.f31473f = i10;
        this.f31474g = i11;
        i(this.f31469a);
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
        if (charSequence != this.v || this.f31488w != valueOf.longValue()) {
            this.v = charSequence;
            this.f31488w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f31487u = null;
                this.f31490y = -1;
                this.f31489x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f31491z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                l61[] l61VarArr = (l61[]) spanned.getSpans(0, spanned.length(), l61.class);
                this.f31487u = new ArrayList();
                this.f31489x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (l61 l61Var : l61VarArr) {
                    try {
                        if (l61Var != null && l61Var.getURL() != null && l61Var.d != null && l61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) l61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(l61Var.d), this.A.getFontMetricsInt(), false);
                            this.f31487u.add(new Pair(Float.valueOf(intValue), l61Var));
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                Collections.sort(this.f31487u, new org.telegram.ui.ff(14));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.f31487u = null;
                this.f31490y = -1;
                this.f31489x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f31491z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(l61 l61Var) {
    }
}

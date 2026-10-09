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
public class gp0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f26832a;
    public int f26836f;
    public int f26837g;
    public fp0 h;
    public int f26838i;
    public int f26839j;
    public int f26840k;
    public int f26841l;
    public int f26842m;
    public boolean f26845p;
    public float f26846q;
    public float f26847r;
    public View f26848s;
    public ArrayList f26850u;
    public CharSequence v;
    public long f26851w;
    public StaticLayout[] f26854z;
    public int f26833b = 0;
    public int f26834c = 0;
    public int d = 0;
    public boolean f26835e = false;
    public final RectF f26843n = new RectF();
    public final int f26844o = AndroidUtilities.dp(2.0f);
    public float f26849t = 1.0f;
    public float f26852x = 0.0f;
    public int f26853y = -1;
    public float B = 1.0f;

    public gp0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f26848s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f26847r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f26850u = null;
        this.f26853y = -1;
        this.f26852x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f26854z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f26851w = -1L;
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
        float f11 = this.f26849t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f26836f, this.f26837g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f26837g / 2;
            int i20 = this.f26844o / 2;
            RectF rectF = this.f26843n;
            rectF.set(i18, i19 - i20, this.f26836f - i18, i19 + i20);
            Paint paint = D;
            if (this.f26845p) {
                i10 = this.f26842m;
            } else {
                i10 = this.f26838i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f26846q > 0.0f) {
                Paint paint2 = D;
                if (this.f26845p) {
                    i16 = this.f26842m;
                } else {
                    i16 = this.f26839j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f26837g / 2;
                rectF.set(f12, i21 - i20, (this.f26846q * (this.f26836f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f26837g / 2) - i20;
            if (this.f26835e) {
                i13 = this.f26834c;
            } else {
                i13 = this.f26833b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f26841l);
            c(canvas2, rectF, D);
            D.setColor(this.f26840k);
            if (this.f26835e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f26847r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f26847r;
                if (f15 < dp) {
                    float e7 = a1.g.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f26847r = e7;
                    if (e7 > dp) {
                        this.f26847r = dp;
                    }
                } else {
                    float b10 = org.telegram.messenger.bi.b((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f26847r = b10;
                    if (b10 < dp) {
                        this.f26847r = dp;
                    }
                }
                View view = this.f26848s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f26835e) {
                i14 = this.f26834c;
            } else {
                i14 = this.f26833b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f26837g / 2, this.f26847r, D);
            if (this.f26849t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f26850u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f26835e) {
                    i15 = this.f26834c;
                } else {
                    i15 = this.f26833b;
                }
                float f16 = i15 / (this.f26836f - E);
                int size = this.f26850u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f26850u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f26854z == null) {
                    this.f26854z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f26836f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f26853y) {
                    if (this.f26835e) {
                        AndroidUtilities.vibrateCursor(this.f26848s);
                    }
                    this.f26853y = size;
                    if (size >= 0 && size < this.f26850u.size()) {
                        e((t61) ((Pair) this.f26850u.get(this.f26853y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f26850u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f26848s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f26852x < 1.0f) {
                    this.f26852x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f26852x, 1.0f);
                    View view3 = this.f26848s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gp0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f26836f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        fp0 fp0Var;
        if (i10 == 0) {
            int i11 = this.f26837g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f26836f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f26833b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f26833b = i16;
                        if (i16 < 0) {
                            this.f26833b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f26833b = i17;
                            }
                        }
                    }
                    this.f26835e = true;
                    int i18 = this.f26833b;
                    this.f26834c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f26835e) {
                int i19 = (int) (f7 - this.d);
                this.f26834c = i19;
                if (i19 < 0) {
                    this.f26834c = 0;
                } else {
                    int i20 = this.f26836f - E;
                    if (i19 > i20) {
                        this.f26834c = i20;
                    }
                }
                fp0 fp0Var2 = this.h;
                if (fp0Var2 != null) {
                    fp0Var2.d(this.f26834c / (this.f26836f - E));
                }
                return true;
            }
        } else if (this.f26835e) {
            int i21 = this.f26834c;
            this.f26833b = i21;
            if (i10 == 1 && (fp0Var = this.h) != null) {
                fp0Var.b(i21 / (this.f26836f - E));
            }
            this.f26835e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f26849t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f26838i = i10;
        this.f26839j = i11;
        this.f26840k = i13;
        this.f26841l = i12;
        this.f26842m = i14;
    }

    public final void i(float f7) {
        this.f26832a = f7;
        int ceil = (int) Math.ceil((this.f26836f - E) * f7);
        this.f26833b = ceil;
        if (ceil < 0) {
            this.f26833b = 0;
            return;
        }
        int i10 = this.f26836f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f26833b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f26836f == i10 && this.f26837g == i11) {
            return;
        }
        this.f26836f = i10;
        this.f26837g = i11;
        i(this.f26832a);
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
        if (charSequence != this.v || this.f26851w != valueOf.longValue()) {
            this.v = charSequence;
            this.f26851w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f26850u = null;
                this.f26853y = -1;
                this.f26852x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f26854z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                t61[] t61VarArr = (t61[]) spanned.getSpans(0, spanned.length(), t61.class);
                this.f26850u = new ArrayList();
                this.f26852x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (t61 t61Var : t61VarArr) {
                    try {
                        if (t61Var != null && t61Var.getURL() != null && t61Var.d != null && t61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) t61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(t61Var.d), this.A.getFontMetricsInt(), false);
                            this.f26850u.add(new Pair(Float.valueOf(intValue), t61Var));
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                Collections.sort(this.f26850u, new org.telegram.ui.gf(14));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.f26850u = null;
                this.f26853y = -1;
                this.f26852x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f26854z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(t61 t61Var) {
    }
}

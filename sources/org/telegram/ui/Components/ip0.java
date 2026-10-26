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
public class ip0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f29330a;
    public int f29333f;
    public int f29334g;
    public hp0 h;
    public int f29335i;
    public int f29336j;
    public int f29337k;
    public int f29338l;
    public int f29339m;
    public boolean f29342p;
    public float f29343q;
    public float f29344r;
    public View f29345s;
    public ArrayList f29347u;
    public CharSequence v;
    public long f29348w;
    public StaticLayout[] f29351z;
    public int f29331b = 0;
    public int f29332c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f29340n = new RectF();
    public final int f29341o = AndroidUtilities.dp(2.0f);
    public float f29346t = 1.0f;
    public float f29349x = 0.0f;
    public int f29350y = -1;
    public float B = 1.0f;

    public ip0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f29345s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f29344r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f29347u = null;
        this.f29350y = -1;
        this.f29349x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f29351z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f29348w = -1L;
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
        float f11 = this.f29346t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f29333f, this.f29334g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f29334g / 2;
            int i20 = this.f29341o / 2;
            RectF rectF = this.f29340n;
            rectF.set(i18, i19 - i20, this.f29333f - i18, i19 + i20);
            Paint paint = D;
            if (this.f29342p) {
                i10 = this.f29339m;
            } else {
                i10 = this.f29335i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f29343q > 0.0f) {
                Paint paint2 = D;
                if (this.f29342p) {
                    i16 = this.f29339m;
                } else {
                    i16 = this.f29336j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f29334g / 2;
                rectF.set(f12, i21 - i20, (this.f29343q * (this.f29333f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f29334g / 2) - i20;
            if (this.e) {
                i13 = this.f29332c;
            } else {
                i13 = this.f29331b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f29338l);
            c(canvas2, rectF, D);
            D.setColor(this.f29337k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f29344r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f29344r;
                if (f15 < dp) {
                    float c10 = a1.g.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f29344r = c10;
                    if (c10 > dp) {
                        this.f29344r = dp;
                    }
                } else {
                    float w10 = org.telegram.messenger.vh.w((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f29344r = w10;
                    if (w10 < dp) {
                        this.f29344r = dp;
                    }
                }
                View view = this.f29345s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f29332c;
            } else {
                i14 = this.f29331b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f29334g / 2, this.f29344r, D);
            if (this.f29346t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f29347u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f29332c;
                } else {
                    i15 = this.f29331b;
                }
                float f16 = i15 / (this.f29333f - E);
                int size = this.f29347u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f29347u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f29351z == null) {
                    this.f29351z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f29333f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f29350y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f29345s);
                    }
                    this.f29350y = size;
                    if (size >= 0 && size < this.f29347u.size()) {
                        e((x61) ((Pair) this.f29347u.get(this.f29350y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f29347u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f29345s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f29349x < 1.0f) {
                    this.f29349x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f29349x, 1.0f);
                    View view3 = this.f29345s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ip0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f29333f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        hp0 hp0Var;
        if (i10 == 0) {
            int i11 = this.f29334g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f29333f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f29331b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f29331b = i16;
                        if (i16 < 0) {
                            this.f29331b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f29331b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f29331b;
                    this.f29332c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f29332c = i19;
                if (i19 < 0) {
                    this.f29332c = 0;
                } else {
                    int i20 = this.f29333f - E;
                    if (i19 > i20) {
                        this.f29332c = i20;
                    }
                }
                hp0 hp0Var2 = this.h;
                if (hp0Var2 != null) {
                    hp0Var2.f(this.f29332c / (this.f29333f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f29332c;
            this.f29331b = i21;
            if (i10 == 1 && (hp0Var = this.h) != null) {
                hp0Var.c(i21 / (this.f29333f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f29346t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f29335i = i10;
        this.f29336j = i11;
        this.f29337k = i13;
        this.f29338l = i12;
        this.f29339m = i14;
    }

    public final void i(float f7) {
        this.f29330a = f7;
        int ceil = (int) Math.ceil((this.f29333f - E) * f7);
        this.f29331b = ceil;
        if (ceil < 0) {
            this.f29331b = 0;
            return;
        }
        int i10 = this.f29333f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f29331b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f29333f == i10 && this.f29334g == i11) {
            return;
        }
        this.f29333f = i10;
        this.f29334g = i11;
        i(this.f29330a);
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
        if (charSequence != this.v || this.f29348w != valueOf.longValue()) {
            this.v = charSequence;
            this.f29348w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f29347u = null;
                this.f29350y = -1;
                this.f29349x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f29351z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                x61[] x61VarArr = (x61[]) spanned.getSpans(0, spanned.length(), x61.class);
                this.f29347u = new ArrayList();
                this.f29349x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (x61 x61Var : x61VarArr) {
                    try {
                        if (x61Var != null && x61Var.getURL() != null && x61Var.d != null && x61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) x61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(x61Var.d), this.A.getFontMetricsInt(), false);
                            this.f29347u.add(new Pair(Float.valueOf(intValue), x61Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f29347u, new org.telegram.ui.ActionBar.n4(21));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.f29347u = null;
                this.f29350y = -1;
                this.f29349x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f29351z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(x61 x61Var) {
    }
}

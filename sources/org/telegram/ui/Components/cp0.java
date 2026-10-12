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
    public float f24165a;
    public int f24168f;
    public int f24169g;
    public bp0 h;
    public int f24170i;
    public int f24171j;
    public int f24172k;
    public int f24173l;
    public int f24174m;
    public boolean f24177p;
    public float f24178q;
    public float f24179r;
    public View f24180s;
    public ArrayList f24182u;
    public CharSequence v;
    public long f24183w;
    public StaticLayout[] f24186z;
    public int f24166b = 0;
    public int f24167c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f24175n = new RectF();
    public final int f24176o = AndroidUtilities.dp(2.0f);
    public float f24181t = 1.0f;
    public float f24184x = 0.0f;
    public int f24185y = -1;
    public float B = 1.0f;

    public cp0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f24180s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f24179r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f24182u = null;
        this.f24185y = -1;
        this.f24184x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f24186z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f24183w = -1L;
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
        float f11 = this.f24181t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f24168f, this.f24169g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f24169g / 2;
            int i20 = this.f24176o / 2;
            RectF rectF = this.f24175n;
            rectF.set(i18, i19 - i20, this.f24168f - i18, i19 + i20);
            Paint paint = D;
            if (this.f24177p) {
                i10 = this.f24174m;
            } else {
                i10 = this.f24170i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f24178q > 0.0f) {
                Paint paint2 = D;
                if (this.f24177p) {
                    i16 = this.f24174m;
                } else {
                    i16 = this.f24171j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f24169g / 2;
                rectF.set(f12, i21 - i20, (this.f24178q * (this.f24168f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f24169g / 2) - i20;
            if (this.e) {
                i13 = this.f24167c;
            } else {
                i13 = this.f24166b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f24173l);
            c(canvas2, rectF, D);
            D.setColor(this.f24172k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f24179r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f24179r;
                if (f15 < dp) {
                    float d = a1.g.d((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f24179r = d;
                    if (d > dp) {
                        this.f24179r = dp;
                    }
                } else {
                    float b10 = org.telegram.messenger.yh.b((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f24179r = b10;
                    if (b10 < dp) {
                        this.f24179r = dp;
                    }
                }
                View view = this.f24180s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f24167c;
            } else {
                i14 = this.f24166b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f24169g / 2, this.f24179r, D);
            if (this.f24181t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f24182u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f24167c;
                } else {
                    i15 = this.f24166b;
                }
                float f16 = i15 / (this.f24168f - E);
                int size = this.f24182u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f24182u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f24186z == null) {
                    this.f24186z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f24168f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f24185y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f24180s);
                    }
                    this.f24185y = size;
                    if (size >= 0 && size < this.f24182u.size()) {
                        e((p61) ((Pair) this.f24182u.get(this.f24185y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f24182u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f24180s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f24184x < 1.0f) {
                    this.f24184x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f24184x, 1.0f);
                    View view3 = this.f24180s;
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
        return this.f24168f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        bp0 bp0Var;
        if (i10 == 0) {
            int i11 = this.f24169g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f24168f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f24166b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f24166b = i16;
                        if (i16 < 0) {
                            this.f24166b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f24166b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f24166b;
                    this.f24167c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f24167c = i19;
                if (i19 < 0) {
                    this.f24167c = 0;
                } else {
                    int i20 = this.f24168f - E;
                    if (i19 > i20) {
                        this.f24167c = i20;
                    }
                }
                bp0 bp0Var2 = this.h;
                if (bp0Var2 != null) {
                    bp0Var2.c(this.f24167c / (this.f24168f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f24167c;
            this.f24166b = i21;
            if (i10 == 1 && (bp0Var = this.h) != null) {
                bp0Var.b(i21 / (this.f24168f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f24181t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f24170i = i10;
        this.f24171j = i11;
        this.f24172k = i13;
        this.f24173l = i12;
        this.f24174m = i14;
    }

    public final void i(float f7) {
        this.f24165a = f7;
        int ceil = (int) Math.ceil((this.f24168f - E) * f7);
        this.f24166b = ceil;
        if (ceil < 0) {
            this.f24166b = 0;
            return;
        }
        int i10 = this.f24168f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f24166b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f24168f == i10 && this.f24169g == i11) {
            return;
        }
        this.f24168f = i10;
        this.f24169g = i11;
        i(this.f24165a);
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
        if (charSequence != this.v || this.f24183w != valueOf.longValue()) {
            this.v = charSequence;
            this.f24183w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f24182u = null;
                this.f24185y = -1;
                this.f24184x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f24186z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                p61[] p61VarArr = (p61[]) spanned.getSpans(0, spanned.length(), p61.class);
                this.f24182u = new ArrayList();
                this.f24184x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (p61 p61Var : p61VarArr) {
                    try {
                        if (p61Var != null && p61Var.getURL() != null && p61Var.d != null && p61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) p61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(p61Var.d), this.A.getFontMetricsInt(), false);
                            this.f24182u.add(new Pair(Float.valueOf(intValue), p61Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f24182u, new org.telegram.ui.ActionBar.l5(18));
            } catch (Exception e7) {
                FileLog.e(e7);
                this.f24182u = null;
                this.f24185y = -1;
                this.f24184x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f24186z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(p61 p61Var) {
    }
}

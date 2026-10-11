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
public class hp0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f27190a;
    public int f27194f;
    public int f27195g;
    public gp0 h;
    public int f27196i;
    public int f27197j;
    public int f27198k;
    public int f27199l;
    public int f27200m;
    public boolean f27203p;
    public float f27204q;
    public float f27205r;
    public View f27206s;
    public ArrayList f27208u;
    public CharSequence v;
    public long f27209w;
    public StaticLayout[] f27212z;
    public int f27191b = 0;
    public int f27192c = 0;
    public int d = 0;
    public boolean f27193e = false;
    public final RectF f27201n = new RectF();
    public final int f27202o = AndroidUtilities.dp(2.0f);
    public float f27207t = 1.0f;
    public float f27210x = 0.0f;
    public int f27211y = -1;
    public float B = 1.0f;

    public hp0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f27206s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f27205r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f27208u = null;
        this.f27211y = -1;
        this.f27210x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f27212z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f27209w = -1L;
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
        float f11 = this.f27207t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f27194f, this.f27195g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f27195g / 2;
            int i20 = this.f27202o / 2;
            RectF rectF = this.f27201n;
            rectF.set(i18, i19 - i20, this.f27194f - i18, i19 + i20);
            Paint paint = D;
            if (this.f27203p) {
                i10 = this.f27200m;
            } else {
                i10 = this.f27196i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f27204q > 0.0f) {
                Paint paint2 = D;
                if (this.f27203p) {
                    i16 = this.f27200m;
                } else {
                    i16 = this.f27197j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f27195g / 2;
                rectF.set(f12, i21 - i20, (this.f27204q * (this.f27194f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f27195g / 2) - i20;
            if (this.f27193e) {
                i13 = this.f27192c;
            } else {
                i13 = this.f27191b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f27199l);
            c(canvas2, rectF, D);
            D.setColor(this.f27198k);
            if (this.f27193e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f27205r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f27205r;
                if (f15 < dp) {
                    float e7 = a1.g.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f27205r = e7;
                    if (e7 > dp) {
                        this.f27205r = dp;
                    }
                } else {
                    float b10 = org.telegram.messenger.ai.b((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f27205r = b10;
                    if (b10 < dp) {
                        this.f27205r = dp;
                    }
                }
                View view = this.f27206s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f27193e) {
                i14 = this.f27192c;
            } else {
                i14 = this.f27191b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f27195g / 2, this.f27205r, D);
            if (this.f27207t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f27208u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f27193e) {
                    i15 = this.f27192c;
                } else {
                    i15 = this.f27191b;
                }
                float f16 = i15 / (this.f27194f - E);
                int size = this.f27208u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f27208u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f27212z == null) {
                    this.f27212z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f27194f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f27211y) {
                    if (this.f27193e) {
                        AndroidUtilities.vibrateCursor(this.f27206s);
                    }
                    this.f27211y = size;
                    if (size >= 0 && size < this.f27208u.size()) {
                        e((u61) ((Pair) this.f27208u.get(this.f27211y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f27208u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f27206s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f27210x < 1.0f) {
                    this.f27210x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f27210x, 1.0f);
                    View view3 = this.f27206s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hp0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f27194f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        gp0 gp0Var;
        if (i10 == 0) {
            int i11 = this.f27195g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f27194f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f27191b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f27191b = i16;
                        if (i16 < 0) {
                            this.f27191b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f27191b = i17;
                            }
                        }
                    }
                    this.f27193e = true;
                    int i18 = this.f27191b;
                    this.f27192c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f27193e) {
                int i19 = (int) (f7 - this.d);
                this.f27192c = i19;
                if (i19 < 0) {
                    this.f27192c = 0;
                } else {
                    int i20 = this.f27194f - E;
                    if (i19 > i20) {
                        this.f27192c = i20;
                    }
                }
                gp0 gp0Var2 = this.h;
                if (gp0Var2 != null) {
                    gp0Var2.d(this.f27192c / (this.f27194f - E));
                }
                return true;
            }
        } else if (this.f27193e) {
            int i21 = this.f27192c;
            this.f27191b = i21;
            if (i10 == 1 && (gp0Var = this.h) != null) {
                gp0Var.b(i21 / (this.f27194f - E));
            }
            this.f27193e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f27207t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f27196i = i10;
        this.f27197j = i11;
        this.f27198k = i13;
        this.f27199l = i12;
        this.f27200m = i14;
    }

    public final void i(float f7) {
        this.f27190a = f7;
        int ceil = (int) Math.ceil((this.f27194f - E) * f7);
        this.f27191b = ceil;
        if (ceil < 0) {
            this.f27191b = 0;
            return;
        }
        int i10 = this.f27194f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f27191b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f27194f == i10 && this.f27195g == i11) {
            return;
        }
        this.f27194f = i10;
        this.f27195g = i11;
        i(this.f27190a);
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
        if (charSequence != this.v || this.f27209w != valueOf.longValue()) {
            this.v = charSequence;
            this.f27209w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f27208u = null;
                this.f27211y = -1;
                this.f27210x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f27212z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                u61[] u61VarArr = (u61[]) spanned.getSpans(0, spanned.length(), u61.class);
                this.f27208u = new ArrayList();
                this.f27210x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (u61 u61Var : u61VarArr) {
                    try {
                        if (u61Var != null && u61Var.getURL() != null && u61Var.d != null && u61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) u61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(u61Var.d), this.A.getFontMetricsInt(), false);
                            this.f27208u.add(new Pair(Float.valueOf(intValue), u61Var));
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                Collections.sort(this.f27208u, new org.telegram.ui.ff(14));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.f27208u = null;
                this.f27211y = -1;
                this.f27210x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f27212z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(u61 u61Var) {
    }
}

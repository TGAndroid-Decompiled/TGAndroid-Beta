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
public class go0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f27204a;
    public int f27208f;
    public int f27209g;
    public fo0 h;
    public int f27210i;
    public int f27211j;
    public int f27212k;
    public int f27213l;
    public int f27214m;
    public boolean f27217p;
    public float f27218q;
    public float f27219r;
    public View f27220s;
    public ArrayList f27222u;
    public CharSequence v;
    public long f27223w;
    public StaticLayout[] f27226z;
    public int f27205b = 0;
    public int f27206c = 0;
    public int d = 0;
    public boolean f27207e = false;
    public final RectF f27215n = new RectF();
    public final int f27216o = AndroidUtilities.dp(2.0f);
    public float f27221t = 1.0f;
    public float f27224x = 0.0f;
    public int f27225y = -1;
    public float B = 1.0f;

    public go0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f27220s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f27219r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f27222u = null;
        this.f27225y = -1;
        this.f27224x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f27226z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f27223w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        float f11;
        int i16;
        int i17;
        float f12 = this.f27221t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f27208f, this.f27209g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f27209g / 2;
            int i20 = this.f27216o / 2;
            RectF rectF = this.f27215n;
            rectF.set(i18, i19 - i20, this.f27208f - i18, i19 + i20);
            Paint paint = D;
            if (this.f27217p) {
                i10 = this.f27214m;
            } else {
                i10 = this.f27210i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f27218q > 0.0f) {
                Paint paint2 = D;
                if (this.f27217p) {
                    i16 = this.f27214m;
                } else {
                    i16 = this.f27211j;
                }
                paint2.setColor(i16);
                float f13 = E / 2;
                int i21 = this.f27209g / 2;
                rectF.set(f13, i21 - i20, (this.f27218q * (this.f27208f - i17)) + f13, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f27209g / 2) - i20;
            if (this.f27207e) {
                i13 = this.f27206c;
            } else {
                i13 = this.f27205b;
            }
            rectF.set(f14, f15, i11 + i13, i20 + i12);
            D.setColor(this.f27213l);
            c(canvas2, rectF, D);
            D.setColor(this.f27212k);
            if (this.f27207e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            if (this.f27219r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f27219r;
                if (f16 < dp) {
                    float c3 = w.c.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f16);
                    this.f27219r = c3;
                    if (c3 > dp) {
                        this.f27219r = dp;
                    }
                } else {
                    float A = org.telegram.messenger.y3.A((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f16);
                    this.f27219r = A;
                    if (A < dp) {
                        this.f27219r = dp;
                    }
                }
                View view = this.f27220s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f27207e) {
                i14 = this.f27206c;
            } else {
                i14 = this.f27205b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f27209g / 2, this.f27219r, D);
            if (this.f27221t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f27222u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f27207e) {
                    i15 = this.f27206c;
                } else {
                    i15 = this.f27205b;
                }
                float f17 = i15 / (this.f27208f - E);
                int size = this.f27222u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f27222u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f27226z == null) {
                    this.f27226z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f27208f - f18));
                AndroidUtilities.dp(66.0f);
                if (size != this.f27225y) {
                    if (this.f27207e) {
                        AndroidUtilities.vibrateCursor(this.f27220s);
                    }
                    this.f27225y = size;
                    if (size >= 0 && size < this.f27222u.size()) {
                        e((l51) ((Pair) this.f27222u.get(this.f27225y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f27222u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f27220s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f27224x < 1.0f) {
                    this.f27224x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f27224x, 1.0f);
                    View view3 = this.f27220s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.go0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f27208f - E;
    }

    public final boolean f(float f10, float f11, int i10) {
        fo0 fo0Var;
        if (i10 == 0) {
            int i11 = this.f27209g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f10 >= (-i13)) {
                int i14 = this.f27208f;
                if (f10 <= i14 + i13 && f11 >= 0.0f && f11 <= i11) {
                    int i15 = this.f27205b;
                    if (i15 - i13 > f10 || f10 > i15 + i12 + i13) {
                        int i16 = ((int) f10) - (i12 / 2);
                        this.f27205b = i16;
                        if (i16 < 0) {
                            this.f27205b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f27205b = i17;
                            }
                        }
                    }
                    this.f27207e = true;
                    int i18 = this.f27205b;
                    this.f27206c = i18;
                    this.d = (int) (f10 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f27207e) {
                int i19 = (int) (f10 - this.d);
                this.f27206c = i19;
                if (i19 < 0) {
                    this.f27206c = 0;
                } else {
                    int i20 = this.f27208f - E;
                    if (i19 > i20) {
                        this.f27206c = i20;
                    }
                }
                fo0 fo0Var2 = this.h;
                if (fo0Var2 != null) {
                    fo0Var2.d(this.f27206c / (this.f27208f - E));
                }
                return true;
            }
        } else if (this.f27207e) {
            int i21 = this.f27206c;
            this.f27205b = i21;
            if (i10 == 1 && (fo0Var = this.h) != null) {
                fo0Var.b(i21 / (this.f27208f - E));
            }
            this.f27207e = false;
            return true;
        }
        return false;
    }

    public final void g(float f10) {
        this.f27221t = f10;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f27210i = i10;
        this.f27211j = i11;
        this.f27212k = i13;
        this.f27213l = i12;
        this.f27214m = i14;
    }

    public final void i(float f10) {
        this.f27204a = f10;
        int ceil = (int) Math.ceil((this.f27208f - E) * f10);
        this.f27205b = ceil;
        if (ceil < 0) {
            this.f27205b = 0;
            return;
        }
        int i10 = this.f27208f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f27205b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f27208f == i10 && this.f27209g == i11) {
            return;
        }
        this.f27208f = i10;
        this.f27209g = i11;
        i(this.f27204a);
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
        if (charSequence != this.v || this.f27223w != valueOf.longValue()) {
            this.v = charSequence;
            this.f27223w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f27222u = null;
                this.f27225y = -1;
                this.f27224x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f27226z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                l51[] l51VarArr = (l51[]) spanned.getSpans(0, spanned.length(), l51.class);
                this.f27222u = new ArrayList();
                this.f27224x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (l51 l51Var : l51VarArr) {
                    try {
                        if (l51Var != null && l51Var.getURL() != null && l51Var.d != null && l51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) l51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(l51Var.d), this.A.getFontMetricsInt(), false);
                            this.f27222u.add(new Pair(Float.valueOf(intValue), l51Var));
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                Collections.sort(this.f27222u, new oh.k0(25));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.f27222u = null;
                this.f27225y = -1;
                this.f27224x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f27226z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(l51 l51Var) {
    }
}

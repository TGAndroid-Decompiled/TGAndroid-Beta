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
public class oo0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f27141a;
    public int f27144f;
    public int f27145g;
    public no0 h;
    public int f27146i;
    public int f27147j;
    public int f27148k;
    public int f27149l;
    public int f27150m;
    public boolean f27153p;
    public float f27154q;
    public float f27155r;
    public View f27156s;
    public ArrayList f27158u;
    public CharSequence v;
    public long f27159w;
    public StaticLayout[] f27162z;
    public int f27142b = 0;
    public int f27143c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f27151n = new RectF();
    public final int f27152o = AndroidUtilities.dp(2.0f);
    public float f27157t = 1.0f;
    public float f27160x = 0.0f;
    public int f27161y = -1;
    public float B = 1.0f;

    public oo0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f27156s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f27155r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f27158u = null;
        this.f27161y = -1;
        this.f27160x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f27162z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f27159w = -1L;
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
        float f11 = this.f27157t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f27144f, this.f27145g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f27145g / 2;
            int i20 = this.f27152o / 2;
            RectF rectF = this.f27151n;
            rectF.set(i18, i19 - i20, this.f27144f - i18, i19 + i20);
            Paint paint = D;
            if (this.f27153p) {
                i10 = this.f27150m;
            } else {
                i10 = this.f27146i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f27154q > 0.0f) {
                Paint paint2 = D;
                if (this.f27153p) {
                    i16 = this.f27150m;
                } else {
                    i16 = this.f27147j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f27145g / 2;
                rectF.set(f12, i21 - i20, (this.f27154q * (this.f27144f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f27145g / 2) - i20;
            if (this.e) {
                i13 = this.f27143c;
            } else {
                i13 = this.f27142b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f27149l);
            c(canvas2, rectF, D);
            D.setColor(this.f27148k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f27155r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f27155r;
                if (f15 < dp) {
                    float e = a4.a.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f27155r = e;
                    if (e > dp) {
                        this.f27155r = dp;
                    }
                } else {
                    float b10 = org.telegram.messenger.ok.b((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f27155r = b10;
                    if (b10 < dp) {
                        this.f27155r = dp;
                    }
                }
                View view = this.f27156s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f27143c;
            } else {
                i14 = this.f27142b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f27145g / 2, this.f27155r, D);
            if (this.f27157t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f27158u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f27143c;
                } else {
                    i15 = this.f27142b;
                }
                float f16 = i15 / (this.f27144f - E);
                int size = this.f27158u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f27158u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f27162z == null) {
                    this.f27162z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f27144f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f27161y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f27156s);
                    }
                    this.f27161y = size;
                    if (size >= 0 && size < this.f27158u.size()) {
                        e((z51) ((Pair) this.f27158u.get(this.f27161y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f27158u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f27156s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f27160x < 1.0f) {
                    this.f27160x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f27160x, 1.0f);
                    View view3 = this.f27156s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oo0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f27144f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        no0 no0Var;
        if (i10 == 0) {
            int i11 = this.f27145g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f27144f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f27142b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f27142b = i16;
                        if (i16 < 0) {
                            this.f27142b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f27142b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f27142b;
                    this.f27143c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f27143c = i19;
                if (i19 < 0) {
                    this.f27143c = 0;
                } else {
                    int i20 = this.f27144f - E;
                    if (i19 > i20) {
                        this.f27143c = i20;
                    }
                }
                no0 no0Var2 = this.h;
                if (no0Var2 != null) {
                    no0Var2.d(this.f27143c / (this.f27144f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f27143c;
            this.f27142b = i21;
            if (i10 == 1 && (no0Var = this.h) != null) {
                no0Var.b(i21 / (this.f27144f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f27157t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f27146i = i10;
        this.f27147j = i11;
        this.f27148k = i13;
        this.f27149l = i12;
        this.f27150m = i14;
    }

    public final void i(float f7) {
        this.f27141a = f7;
        int ceil = (int) Math.ceil((this.f27144f - E) * f7);
        this.f27142b = ceil;
        if (ceil < 0) {
            this.f27142b = 0;
            return;
        }
        int i10 = this.f27144f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f27142b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f27144f == i10 && this.f27145g == i11) {
            return;
        }
        this.f27144f = i10;
        this.f27145g = i11;
        i(this.f27141a);
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
        if (charSequence != this.v || this.f27159w != valueOf.longValue()) {
            this.v = charSequence;
            this.f27159w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f27158u = null;
                this.f27161y = -1;
                this.f27160x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f27162z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                z51[] z51VarArr = (z51[]) spanned.getSpans(0, spanned.length(), z51.class);
                this.f27158u = new ArrayList();
                this.f27160x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (z51 z51Var : z51VarArr) {
                    try {
                        if (z51Var != null && z51Var.getURL() != null && z51Var.d != null && z51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) z51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(z51Var.d), this.A.getFontMetricsInt(), false);
                            this.f27158u.add(new Pair(Float.valueOf(intValue), z51Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f27158u, new org.telegram.ui.cf(14));
            } catch (Exception e7) {
                FileLog.e(e7);
                this.f27158u = null;
                this.f27161y = -1;
                this.f27160x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f27162z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(z51 z51Var) {
    }
}

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
public class mp0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f28607a;
    public int f28611f;
    public int f28612g;
    public lp0 h;
    public int f28613i;
    public int f28614j;
    public int f28615k;
    public int f28616l;
    public int f28617m;
    public boolean f28620p;
    public float f28621q;
    public float f28622r;
    public View f28623s;
    public ArrayList f28625u;
    public CharSequence v;
    public long f28626w;
    public StaticLayout[] f28629z;
    public int f28608b = 0;
    public int f28609c = 0;
    public int d = 0;
    public boolean f28610e = false;
    public final RectF f28618n = new RectF();
    public final int f28619o = AndroidUtilities.dp(2.0f);
    public float f28624t = 1.0f;
    public float f28627x = 0.0f;
    public int f28628y = -1;
    public float B = 1.0f;

    public mp0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f28623s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f28622r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f28625u = null;
        this.f28628y = -1;
        this.f28627x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f28629z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f28626w = -1L;
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
        float f11 = this.f28624t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f28611f, this.f28612g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f28612g / 2;
            int i20 = this.f28619o / 2;
            RectF rectF = this.f28618n;
            rectF.set(i18, i19 - i20, this.f28611f - i18, i19 + i20);
            Paint paint = D;
            if (this.f28620p) {
                i10 = this.f28617m;
            } else {
                i10 = this.f28613i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f28621q > 0.0f) {
                Paint paint2 = D;
                if (this.f28620p) {
                    i16 = this.f28617m;
                } else {
                    i16 = this.f28614j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f28612g / 2;
                rectF.set(f12, i21 - i20, (this.f28621q * (this.f28611f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f28612g / 2) - i20;
            if (this.f28610e) {
                i13 = this.f28609c;
            } else {
                i13 = this.f28608b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f28616l);
            c(canvas2, rectF, D);
            D.setColor(this.f28615k);
            if (this.f28610e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f28622r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f28622r;
                if (f15 < dp) {
                    float e7 = a1.g.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f28622r = e7;
                    if (e7 > dp) {
                        this.f28622r = dp;
                    }
                } else {
                    float b10 = org.telegram.messenger.am.b((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f28622r = b10;
                    if (b10 < dp) {
                        this.f28622r = dp;
                    }
                }
                View view = this.f28623s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f28610e) {
                i14 = this.f28609c;
            } else {
                i14 = this.f28608b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f28612g / 2, this.f28622r, D);
            if (this.f28624t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f28625u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f28610e) {
                    i15 = this.f28609c;
                } else {
                    i15 = this.f28608b;
                }
                float f16 = i15 / (this.f28611f - E);
                int size = this.f28625u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f28625u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f28629z == null) {
                    this.f28629z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f28611f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f28628y) {
                    if (this.f28610e) {
                        AndroidUtilities.vibrateCursor(this.f28623s);
                    }
                    this.f28628y = size;
                    if (size >= 0 && size < this.f28625u.size()) {
                        e((y61) ((Pair) this.f28625u.get(this.f28628y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f28625u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f28623s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f28627x < 1.0f) {
                    this.f28627x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f28627x, 1.0f);
                    View view3 = this.f28623s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mp0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f28611f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        lp0 lp0Var;
        if (i10 == 0) {
            int i11 = this.f28612g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f28611f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f28608b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f28608b = i16;
                        if (i16 < 0) {
                            this.f28608b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f28608b = i17;
                            }
                        }
                    }
                    this.f28610e = true;
                    int i18 = this.f28608b;
                    this.f28609c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f28610e) {
                int i19 = (int) (f7 - this.d);
                this.f28609c = i19;
                if (i19 < 0) {
                    this.f28609c = 0;
                } else {
                    int i20 = this.f28611f - E;
                    if (i19 > i20) {
                        this.f28609c = i20;
                    }
                }
                lp0 lp0Var2 = this.h;
                if (lp0Var2 != null) {
                    lp0Var2.d(this.f28609c / (this.f28611f - E));
                }
                return true;
            }
        } else if (this.f28610e) {
            int i21 = this.f28609c;
            this.f28608b = i21;
            if (i10 == 1 && (lp0Var = this.h) != null) {
                lp0Var.b(i21 / (this.f28611f - E));
            }
            this.f28610e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f28624t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f28613i = i10;
        this.f28614j = i11;
        this.f28615k = i13;
        this.f28616l = i12;
        this.f28617m = i14;
    }

    public final void i(float f7) {
        this.f28607a = f7;
        int ceil = (int) Math.ceil((this.f28611f - E) * f7);
        this.f28608b = ceil;
        if (ceil < 0) {
            this.f28608b = 0;
            return;
        }
        int i10 = this.f28611f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f28608b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f28611f == i10 && this.f28612g == i11) {
            return;
        }
        this.f28611f = i10;
        this.f28612g = i11;
        i(this.f28607a);
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
        if (charSequence != this.v || this.f28626w != valueOf.longValue()) {
            this.v = charSequence;
            this.f28626w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f28625u = null;
                this.f28628y = -1;
                this.f28627x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f28629z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                y61[] y61VarArr = (y61[]) spanned.getSpans(0, spanned.length(), y61.class);
                this.f28625u = new ArrayList();
                this.f28627x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (y61 y61Var : y61VarArr) {
                    try {
                        if (y61Var != null && y61Var.getURL() != null && y61Var.d != null && y61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) y61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(y61Var.d), this.A.getFontMetricsInt(), false);
                            this.f28625u.add(new Pair(Float.valueOf(intValue), y61Var));
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                Collections.sort(this.f28625u, new org.telegram.ui.lf(14));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.f28625u = null;
                this.f28628y = -1;
                this.f28627x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f28629z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(y61 y61Var) {
    }
}

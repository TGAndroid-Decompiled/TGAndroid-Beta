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
public class dp0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f25683a;
    public int f25686f;
    public int f25687g;
    public cp0 h;
    public int f25688i;
    public int f25689j;
    public int f25690k;
    public int f25691l;
    public int f25692m;
    public boolean f25695p;
    public float f25696q;
    public float f25697r;
    public View f25698s;
    public ArrayList f25700u;
    public CharSequence v;
    public long f25701w;
    public StaticLayout[] f25704z;
    public int f25684b = 0;
    public int f25685c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f25693n = new RectF();
    public final int f25694o = AndroidUtilities.dp(2.0f);
    public float f25699t = 1.0f;
    public float f25702x = 0.0f;
    public int f25703y = -1;
    public float B = 1.0f;

    public dp0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f25698s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f25697r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f25700u = null;
        this.f25703y = -1;
        this.f25702x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f25704z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f25701w = -1L;
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
        float f11 = this.f25699t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f25686f, this.f25687g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f25687g / 2;
            int i20 = this.f25694o / 2;
            RectF rectF = this.f25693n;
            rectF.set(i18, i19 - i20, this.f25686f - i18, i19 + i20);
            Paint paint = D;
            if (this.f25695p) {
                i10 = this.f25692m;
            } else {
                i10 = this.f25688i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f25696q > 0.0f) {
                Paint paint2 = D;
                if (this.f25695p) {
                    i16 = this.f25692m;
                } else {
                    i16 = this.f25689j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f25687g / 2;
                rectF.set(f12, i21 - i20, (this.f25696q * (this.f25686f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f25687g / 2) - i20;
            if (this.e) {
                i13 = this.f25685c;
            } else {
                i13 = this.f25684b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f25691l);
            c(canvas2, rectF, D);
            D.setColor(this.f25690k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f25697r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f25697r;
                if (f15 < dp) {
                    float d = a1.g.d((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f25697r = d;
                    if (d > dp) {
                        this.f25697r = dp;
                    }
                } else {
                    float x10 = org.telegram.messenger.sl.x((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f25697r = x10;
                    if (x10 < dp) {
                        this.f25697r = dp;
                    }
                }
                View view = this.f25698s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f25685c;
            } else {
                i14 = this.f25684b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f25687g / 2, this.f25697r, D);
            if (this.f25699t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f25700u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f25685c;
                } else {
                    i15 = this.f25684b;
                }
                float f16 = i15 / (this.f25686f - E);
                int size = this.f25700u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f25700u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f25704z == null) {
                    this.f25704z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f25686f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f25703y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f25698s);
                    }
                    this.f25703y = size;
                    if (size >= 0 && size < this.f25700u.size()) {
                        e((q61) ((Pair) this.f25700u.get(this.f25703y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f25700u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f25698s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f25702x < 1.0f) {
                    this.f25702x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f25702x, 1.0f);
                    View view3 = this.f25698s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dp0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f25686f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        cp0 cp0Var;
        if (i10 == 0) {
            int i11 = this.f25687g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f25686f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f25684b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f25684b = i16;
                        if (i16 < 0) {
                            this.f25684b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f25684b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f25684b;
                    this.f25685c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f25685c = i19;
                if (i19 < 0) {
                    this.f25685c = 0;
                } else {
                    int i20 = this.f25686f - E;
                    if (i19 > i20) {
                        this.f25685c = i20;
                    }
                }
                cp0 cp0Var2 = this.h;
                if (cp0Var2 != null) {
                    cp0Var2.b(this.f25685c / (this.f25686f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f25685c;
            this.f25684b = i21;
            if (i10 == 1 && (cp0Var = this.h) != null) {
                cp0Var.a(i21 / (this.f25686f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f25699t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f25688i = i10;
        this.f25689j = i11;
        this.f25690k = i13;
        this.f25691l = i12;
        this.f25692m = i14;
    }

    public final void i(float f7) {
        this.f25683a = f7;
        int ceil = (int) Math.ceil((this.f25686f - E) * f7);
        this.f25684b = ceil;
        if (ceil < 0) {
            this.f25684b = 0;
            return;
        }
        int i10 = this.f25686f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f25684b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f25686f == i10 && this.f25687g == i11) {
            return;
        }
        this.f25686f = i10;
        this.f25687g = i11;
        i(this.f25683a);
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
        if (charSequence != this.v || this.f25701w != valueOf.longValue()) {
            this.v = charSequence;
            this.f25701w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f25700u = null;
                this.f25703y = -1;
                this.f25702x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f25704z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                q61[] q61VarArr = (q61[]) spanned.getSpans(0, spanned.length(), q61.class);
                this.f25700u = new ArrayList();
                this.f25702x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (q61 q61Var : q61VarArr) {
                    try {
                        if (q61Var != null && q61Var.getURL() != null && q61Var.d != null && q61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) q61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(q61Var.d), this.A.getFontMetricsInt(), false);
                            this.f25700u.add(new Pair(Float.valueOf(intValue), q61Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f25700u, new org.telegram.ui.ActionBar.l4(21));
            } catch (Exception e7) {
                FileLog.e(e7);
                this.f25700u = null;
                this.f25703y = -1;
                this.f25702x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f25704z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(q61 q61Var) {
    }
}

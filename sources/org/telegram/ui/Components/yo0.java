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
public class yo0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f32721a;
    public int f32724f;
    public int f32725g;
    public xo0 h;
    public int f32726i;
    public int f32727j;
    public int f32728k;
    public int f32729l;
    public int f32730m;
    public boolean f32733p;
    public float f32734q;
    public float f32735r;
    public View f32736s;
    public ArrayList f32738u;
    public CharSequence v;
    public long f32739w;
    public StaticLayout[] f32742z;
    public int f32722b = 0;
    public int f32723c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f32731n = new RectF();
    public final int f32732o = AndroidUtilities.dp(2.0f);
    public float f32737t = 1.0f;
    public float f32740x = 0.0f;
    public int f32741y = -1;
    public float B = 1.0f;

    public yo0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f32736s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f32735r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f32738u = null;
        this.f32741y = -1;
        this.f32740x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f32742z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f32739w = -1L;
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
        float f11 = this.f32737t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f32724f, this.f32725g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f32725g / 2;
            int i20 = this.f32732o / 2;
            RectF rectF = this.f32731n;
            rectF.set(i18, i19 - i20, this.f32724f - i18, i19 + i20);
            Paint paint = D;
            if (this.f32733p) {
                i10 = this.f32730m;
            } else {
                i10 = this.f32726i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f32734q > 0.0f) {
                Paint paint2 = D;
                if (this.f32733p) {
                    i16 = this.f32730m;
                } else {
                    i16 = this.f32727j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f32725g / 2;
                rectF.set(f12, i21 - i20, (this.f32734q * (this.f32724f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f32725g / 2) - i20;
            if (this.e) {
                i13 = this.f32723c;
            } else {
                i13 = this.f32722b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f32729l);
            c(canvas2, rectF, D);
            D.setColor(this.f32728k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f32735r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f32735r;
                if (f15 < dp) {
                    float d = a1.g.d((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f32735r = d;
                    if (d > dp) {
                        this.f32735r = dp;
                    }
                } else {
                    float x10 = org.telegram.messenger.kk.x((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f32735r = x10;
                    if (x10 < dp) {
                        this.f32735r = dp;
                    }
                }
                View view = this.f32736s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f32723c;
            } else {
                i14 = this.f32722b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f32725g / 2, this.f32735r, D);
            if (this.f32737t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f32738u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f32723c;
                } else {
                    i15 = this.f32722b;
                }
                float f16 = i15 / (this.f32724f - E);
                int size = this.f32738u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f32738u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f32742z == null) {
                    this.f32742z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f32724f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f32741y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f32736s);
                    }
                    this.f32741y = size;
                    if (size >= 0 && size < this.f32738u.size()) {
                        e((j61) ((Pair) this.f32738u.get(this.f32741y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f32738u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f32736s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f32740x < 1.0f) {
                    this.f32740x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f32740x, 1.0f);
                    View view3 = this.f32736s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yo0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f32724f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        xo0 xo0Var;
        if (i10 == 0) {
            int i11 = this.f32725g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f32724f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f32722b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f32722b = i16;
                        if (i16 < 0) {
                            this.f32722b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f32722b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f32722b;
                    this.f32723c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f32723c = i19;
                if (i19 < 0) {
                    this.f32723c = 0;
                } else {
                    int i20 = this.f32724f - E;
                    if (i19 > i20) {
                        this.f32723c = i20;
                    }
                }
                xo0 xo0Var2 = this.h;
                if (xo0Var2 != null) {
                    xo0Var2.c(this.f32723c / (this.f32724f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f32723c;
            this.f32722b = i21;
            if (i10 == 1 && (xo0Var = this.h) != null) {
                xo0Var.b(i21 / (this.f32724f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f32737t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f32726i = i10;
        this.f32727j = i11;
        this.f32728k = i13;
        this.f32729l = i12;
        this.f32730m = i14;
    }

    public final void i(float f7) {
        this.f32721a = f7;
        int ceil = (int) Math.ceil((this.f32724f - E) * f7);
        this.f32722b = ceil;
        if (ceil < 0) {
            this.f32722b = 0;
            return;
        }
        int i10 = this.f32724f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f32722b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f32724f == i10 && this.f32725g == i11) {
            return;
        }
        this.f32724f = i10;
        this.f32725g = i11;
        i(this.f32721a);
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
        if (charSequence != this.v || this.f32739w != valueOf.longValue()) {
            this.v = charSequence;
            this.f32739w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f32738u = null;
                this.f32741y = -1;
                this.f32740x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f32742z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                j61[] j61VarArr = (j61[]) spanned.getSpans(0, spanned.length(), j61.class);
                this.f32738u = new ArrayList();
                this.f32740x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (j61 j61Var : j61VarArr) {
                    try {
                        if (j61Var != null && j61Var.getURL() != null && j61Var.d != null && j61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) j61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(j61Var.d), this.A.getFontMetricsInt(), false);
                            this.f32738u.add(new Pair(Float.valueOf(intValue), j61Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f32738u, new org.telegram.ui.ActionBar.i4(21));
            } catch (Exception e7) {
                FileLog.e(e7);
                this.f32738u = null;
                this.f32741y = -1;
                this.f32740x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f32742z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(j61 j61Var) {
    }
}

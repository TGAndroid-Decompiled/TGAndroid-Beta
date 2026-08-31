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
public class ho0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f27532a;
    public int f27536f;
    public int f27537g;
    public go0 h;
    public int f27538i;
    public int f27539j;
    public int f27540k;
    public int f27541l;
    public int f27542m;
    public boolean f27545p;
    public float f27546q;
    public float f27547r;
    public View f27548s;
    public ArrayList f27550u;
    public CharSequence v;
    public long f27551w;
    public StaticLayout[] f27554z;
    public int f27533b = 0;
    public int f27534c = 0;
    public int d = 0;
    public boolean f27535e = false;
    public final RectF f27543n = new RectF();
    public final int f27544o = AndroidUtilities.dp(2.0f);
    public float f27549t = 1.0f;
    public float f27552x = 0.0f;
    public int f27553y = -1;
    public float B = 1.0f;

    public ho0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f27548s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f27547r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f27550u = null;
        this.f27553y = -1;
        this.f27552x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f27554z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f27551w = -1L;
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
        float f12 = this.f27549t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f27536f, this.f27537g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f27537g / 2;
            int i20 = this.f27544o / 2;
            RectF rectF = this.f27543n;
            rectF.set(i18, i19 - i20, this.f27536f - i18, i19 + i20);
            Paint paint = D;
            if (this.f27545p) {
                i10 = this.f27542m;
            } else {
                i10 = this.f27538i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f27546q > 0.0f) {
                Paint paint2 = D;
                if (this.f27545p) {
                    i16 = this.f27542m;
                } else {
                    i16 = this.f27539j;
                }
                paint2.setColor(i16);
                float f13 = E / 2;
                int i21 = this.f27537g / 2;
                rectF.set(f13, i21 - i20, (this.f27546q * (this.f27536f - i17)) + f13, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f27537g / 2) - i20;
            if (this.f27535e) {
                i13 = this.f27534c;
            } else {
                i13 = this.f27533b;
            }
            rectF.set(f14, f15, i11 + i13, i20 + i12);
            D.setColor(this.f27541l);
            c(canvas2, rectF, D);
            D.setColor(this.f27540k);
            if (this.f27535e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            if (this.f27547r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f27547r;
                if (f16 < dp) {
                    float c3 = w.c.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f16);
                    this.f27547r = c3;
                    if (c3 > dp) {
                        this.f27547r = dp;
                    }
                } else {
                    float A = org.telegram.messenger.y3.A((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f16);
                    this.f27547r = A;
                    if (A < dp) {
                        this.f27547r = dp;
                    }
                }
                View view = this.f27548s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f27535e) {
                i14 = this.f27534c;
            } else {
                i14 = this.f27533b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f27537g / 2, this.f27547r, D);
            if (this.f27549t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f27550u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f27535e) {
                    i15 = this.f27534c;
                } else {
                    i15 = this.f27533b;
                }
                float f17 = i15 / (this.f27536f - E);
                int size = this.f27550u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f27550u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f27554z == null) {
                    this.f27554z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f27536f - f18));
                AndroidUtilities.dp(66.0f);
                if (size != this.f27553y) {
                    if (this.f27535e) {
                        AndroidUtilities.vibrateCursor(this.f27548s);
                    }
                    this.f27553y = size;
                    if (size >= 0 && size < this.f27550u.size()) {
                        e((n51) ((Pair) this.f27550u.get(this.f27553y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f27550u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f27548s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f27552x < 1.0f) {
                    this.f27552x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f27552x, 1.0f);
                    View view3 = this.f27548s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ho0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f27536f - E;
    }

    public final boolean f(float f10, float f11, int i10) {
        go0 go0Var;
        if (i10 == 0) {
            int i11 = this.f27537g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f10 >= (-i13)) {
                int i14 = this.f27536f;
                if (f10 <= i14 + i13 && f11 >= 0.0f && f11 <= i11) {
                    int i15 = this.f27533b;
                    if (i15 - i13 > f10 || f10 > i15 + i12 + i13) {
                        int i16 = ((int) f10) - (i12 / 2);
                        this.f27533b = i16;
                        if (i16 < 0) {
                            this.f27533b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f27533b = i17;
                            }
                        }
                    }
                    this.f27535e = true;
                    int i18 = this.f27533b;
                    this.f27534c = i18;
                    this.d = (int) (f10 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f27535e) {
                int i19 = (int) (f10 - this.d);
                this.f27534c = i19;
                if (i19 < 0) {
                    this.f27534c = 0;
                } else {
                    int i20 = this.f27536f - E;
                    if (i19 > i20) {
                        this.f27534c = i20;
                    }
                }
                go0 go0Var2 = this.h;
                if (go0Var2 != null) {
                    go0Var2.d(this.f27534c / (this.f27536f - E));
                }
                return true;
            }
        } else if (this.f27535e) {
            int i21 = this.f27534c;
            this.f27533b = i21;
            if (i10 == 1 && (go0Var = this.h) != null) {
                go0Var.b(i21 / (this.f27536f - E));
            }
            this.f27535e = false;
            return true;
        }
        return false;
    }

    public final void g(float f10) {
        this.f27549t = f10;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f27538i = i10;
        this.f27539j = i11;
        this.f27540k = i13;
        this.f27541l = i12;
        this.f27542m = i14;
    }

    public final void i(float f10) {
        this.f27532a = f10;
        int ceil = (int) Math.ceil((this.f27536f - E) * f10);
        this.f27533b = ceil;
        if (ceil < 0) {
            this.f27533b = 0;
            return;
        }
        int i10 = this.f27536f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f27533b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f27536f == i10 && this.f27537g == i11) {
            return;
        }
        this.f27536f = i10;
        this.f27537g = i11;
        i(this.f27532a);
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
        if (charSequence != this.v || this.f27551w != valueOf.longValue()) {
            this.v = charSequence;
            this.f27551w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f27550u = null;
                this.f27553y = -1;
                this.f27552x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f27554z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                n51[] n51VarArr = (n51[]) spanned.getSpans(0, spanned.length(), n51.class);
                this.f27550u = new ArrayList();
                this.f27552x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (n51 n51Var : n51VarArr) {
                    try {
                        if (n51Var != null && n51Var.getURL() != null && n51Var.d != null && n51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) n51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(n51Var.d), this.A.getFontMetricsInt(), false);
                            this.f27550u.add(new Pair(Float.valueOf(intValue), n51Var));
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                Collections.sort(this.f27550u, new oh.k0(25));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.f27550u = null;
                this.f27553y = -1;
                this.f27552x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f27554z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(n51 n51Var) {
    }
}

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
public class zo0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f32990a;
    public int f32993f;
    public int f32994g;
    public yo0 h;
    public int f32995i;
    public int f32996j;
    public int f32997k;
    public int f32998l;
    public int f32999m;
    public boolean f33002p;
    public float f33003q;
    public float f33004r;
    public View f33005s;
    public ArrayList f33007u;
    public CharSequence v;
    public long f33008w;
    public StaticLayout[] f33011z;
    public int f32991b = 0;
    public int f32992c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f33000n = new RectF();
    public final int f33001o = AndroidUtilities.dp(2.0f);
    public float f33006t = 1.0f;
    public float f33009x = 0.0f;
    public int f33010y = -1;
    public float B = 1.0f;

    public zo0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f33005s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f33004r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f33007u = null;
        this.f33010y = -1;
        this.f33009x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f33011z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f33008w = -1L;
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
        float f11 = this.f33006t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f32993f, this.f32994g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f32994g / 2;
            int i20 = this.f33001o / 2;
            RectF rectF = this.f33000n;
            rectF.set(i18, i19 - i20, this.f32993f - i18, i19 + i20);
            Paint paint = D;
            if (this.f33002p) {
                i10 = this.f32999m;
            } else {
                i10 = this.f32995i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f33003q > 0.0f) {
                Paint paint2 = D;
                if (this.f33002p) {
                    i16 = this.f32999m;
                } else {
                    i16 = this.f32996j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f32994g / 2;
                rectF.set(f12, i21 - i20, (this.f33003q * (this.f32993f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f32994g / 2) - i20;
            if (this.e) {
                i13 = this.f32992c;
            } else {
                i13 = this.f32991b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f32998l);
            c(canvas2, rectF, D);
            D.setColor(this.f32997k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f33004r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f33004r;
                if (f15 < dp) {
                    float d = a1.g.d((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f33004r = d;
                    if (d > dp) {
                        this.f33004r = dp;
                    }
                } else {
                    float x10 = org.telegram.messenger.mk.x((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f33004r = x10;
                    if (x10 < dp) {
                        this.f33004r = dp;
                    }
                }
                View view = this.f33005s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f32992c;
            } else {
                i14 = this.f32991b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f32994g / 2, this.f33004r, D);
            if (this.f33006t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f33007u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f32992c;
                } else {
                    i15 = this.f32991b;
                }
                float f16 = i15 / (this.f32993f - E);
                int size = this.f33007u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f33007u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f33011z == null) {
                    this.f33011z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f32993f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f33010y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f33005s);
                    }
                    this.f33010y = size;
                    if (size >= 0 && size < this.f33007u.size()) {
                        e((l61) ((Pair) this.f33007u.get(this.f33010y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f33007u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f33005s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f33009x < 1.0f) {
                    this.f33009x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f33009x, 1.0f);
                    View view3 = this.f33005s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zo0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f32993f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        yo0 yo0Var;
        if (i10 == 0) {
            int i11 = this.f32994g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f32993f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f32991b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f32991b = i16;
                        if (i16 < 0) {
                            this.f32991b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f32991b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f32991b;
                    this.f32992c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f32992c = i19;
                if (i19 < 0) {
                    this.f32992c = 0;
                } else {
                    int i20 = this.f32993f - E;
                    if (i19 > i20) {
                        this.f32992c = i20;
                    }
                }
                yo0 yo0Var2 = this.h;
                if (yo0Var2 != null) {
                    yo0Var2.c(this.f32992c / (this.f32993f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f32992c;
            this.f32991b = i21;
            if (i10 == 1 && (yo0Var = this.h) != null) {
                yo0Var.b(i21 / (this.f32993f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f33006t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f32995i = i10;
        this.f32996j = i11;
        this.f32997k = i13;
        this.f32998l = i12;
        this.f32999m = i14;
    }

    public final void i(float f7) {
        this.f32990a = f7;
        int ceil = (int) Math.ceil((this.f32993f - E) * f7);
        this.f32991b = ceil;
        if (ceil < 0) {
            this.f32991b = 0;
            return;
        }
        int i10 = this.f32993f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f32991b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f32993f == i10 && this.f32994g == i11) {
            return;
        }
        this.f32993f = i10;
        this.f32994g = i11;
        i(this.f32990a);
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
        if (charSequence != this.v || this.f33008w != valueOf.longValue()) {
            this.v = charSequence;
            this.f33008w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f33007u = null;
                this.f33010y = -1;
                this.f33009x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f33011z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                l61[] l61VarArr = (l61[]) spanned.getSpans(0, spanned.length(), l61.class);
                this.f33007u = new ArrayList();
                this.f33009x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (l61 l61Var : l61VarArr) {
                    try {
                        if (l61Var != null && l61Var.getURL() != null && l61Var.d != null && l61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) l61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(l61Var.d), this.A.getFontMetricsInt(), false);
                            this.f33007u.add(new Pair(Float.valueOf(intValue), l61Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f33007u, new org.telegram.ui.ActionBar.i4(21));
            } catch (Exception e7) {
                FileLog.e(e7);
                this.f33007u = null;
                this.f33010y = -1;
                this.f33009x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f33011z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(l61 l61Var) {
    }
}

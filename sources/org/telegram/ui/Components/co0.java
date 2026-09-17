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
public class co0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f23090a;
    public int f23093f;
    public int f23094g;
    public bo0 h;
    public int f23095i;
    public int f23096j;
    public int f23097k;
    public int f23098l;
    public int f23099m;
    public boolean f23102p;
    public float f23103q;
    public float f23104r;
    public View f23105s;
    public ArrayList f23107u;
    public CharSequence v;
    public long f23108w;
    public StaticLayout[] f23111z;
    public int f23091b = 0;
    public int f23092c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f23100n = new RectF();
    public final int f23101o = AndroidUtilities.dp(2.0f);
    public float f23106t = 1.0f;
    public float f23109x = 0.0f;
    public int f23110y = -1;
    public float B = 1.0f;

    public co0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f23105s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f23104r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f23107u = null;
        this.f23110y = -1;
        this.f23109x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f23111z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f23108w = -1L;
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
        float f11 = this.f23106t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f23093f, this.f23094g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f23094g / 2;
            int i20 = this.f23101o / 2;
            RectF rectF = this.f23100n;
            rectF.set(i18, i19 - i20, this.f23093f - i18, i19 + i20);
            Paint paint = D;
            if (this.f23102p) {
                i10 = this.f23099m;
            } else {
                i10 = this.f23095i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f23103q > 0.0f) {
                Paint paint2 = D;
                if (this.f23102p) {
                    i16 = this.f23099m;
                } else {
                    i16 = this.f23096j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f23094g / 2;
                rectF.set(f12, i21 - i20, (this.f23103q * (this.f23093f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f23094g / 2) - i20;
            if (this.e) {
                i13 = this.f23092c;
            } else {
                i13 = this.f23091b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f23098l);
            c(canvas2, rectF, D);
            D.setColor(this.f23097k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f23104r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f23104r;
                if (f15 < dp) {
                    float e = a4.a.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f23104r = e;
                    if (e > dp) {
                        this.f23104r = dp;
                    }
                } else {
                    float c10 = org.telegram.messenger.wl.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f23104r = c10;
                    if (c10 < dp) {
                        this.f23104r = dp;
                    }
                }
                View view = this.f23105s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f23092c;
            } else {
                i14 = this.f23091b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f23094g / 2, this.f23104r, D);
            if (this.f23106t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f23107u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f23092c;
                } else {
                    i15 = this.f23091b;
                }
                float f16 = i15 / (this.f23093f - E);
                int size = this.f23107u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f23107u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f23111z == null) {
                    this.f23111z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f23093f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f23110y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f23105s);
                    }
                    this.f23110y = size;
                    if (size >= 0 && size < this.f23107u.size()) {
                        e((n51) ((Pair) this.f23107u.get(this.f23110y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f23107u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f23105s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f23109x < 1.0f) {
                    this.f23109x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f23109x, 1.0f);
                    View view3 = this.f23105s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.co0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f23093f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        bo0 bo0Var;
        if (i10 == 0) {
            int i11 = this.f23094g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f23093f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f23091b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f23091b = i16;
                        if (i16 < 0) {
                            this.f23091b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f23091b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f23091b;
                    this.f23092c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f23092c = i19;
                if (i19 < 0) {
                    this.f23092c = 0;
                } else {
                    int i20 = this.f23093f - E;
                    if (i19 > i20) {
                        this.f23092c = i20;
                    }
                }
                bo0 bo0Var2 = this.h;
                if (bo0Var2 != null) {
                    bo0Var2.d(this.f23092c / (this.f23093f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f23092c;
            this.f23091b = i21;
            if (i10 == 1 && (bo0Var = this.h) != null) {
                bo0Var.b(i21 / (this.f23093f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f23106t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f23095i = i10;
        this.f23096j = i11;
        this.f23097k = i13;
        this.f23098l = i12;
        this.f23099m = i14;
    }

    public final void i(float f7) {
        this.f23090a = f7;
        int ceil = (int) Math.ceil((this.f23093f - E) * f7);
        this.f23091b = ceil;
        if (ceil < 0) {
            this.f23091b = 0;
            return;
        }
        int i10 = this.f23093f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f23091b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f23093f == i10 && this.f23094g == i11) {
            return;
        }
        this.f23093f = i10;
        this.f23094g = i11;
        i(this.f23090a);
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
        if (charSequence != this.v || this.f23108w != valueOf.longValue()) {
            this.v = charSequence;
            this.f23108w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f23107u = null;
                this.f23110y = -1;
                this.f23109x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f23111z;
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
                this.f23107u = new ArrayList();
                this.f23109x = 0.0f;
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
                            this.f23107u.add(new Pair(Float.valueOf(intValue), n51Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f23107u, new org.telegram.ui.ff(14));
            } catch (Exception e7) {
                FileLog.e(e7);
                this.f23107u = null;
                this.f23110y = -1;
                this.f23109x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f23111z;
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

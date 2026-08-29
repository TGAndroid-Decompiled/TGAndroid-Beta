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
public class wn0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f34446a;
    public int f34450f;
    public int f34451g;
    public vn0 h;
    public int f34452i;
    public int f34453j;
    public int f34454k;
    public int f34455l;
    public int f34456m;
    public boolean f34459p;
    public float f34460q;
    public float f34461r;
    public View f34462s;
    public ArrayList f34464u;
    public CharSequence v;
    public long f34465w;
    public StaticLayout[] f34468z;
    public int f34447b = 0;
    public int f34448c = 0;
    public int d = 0;
    public boolean f34449e = false;
    public final RectF f34457n = new RectF();
    public final int f34458o = AndroidUtilities.dp(2.0f);
    public float f34463t = 1.0f;
    public float f34466x = 0.0f;
    public int f34467y = -1;
    public float B = 1.0f;

    public wn0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f34462s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f34461r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f34464u = null;
        this.f34467y = -1;
        this.f34466x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f34468z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f34465w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        int i12;
        int i13;
        float f9;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        float f11 = this.f34463t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f34450f, this.f34451g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f34451g / 2;
            int i20 = this.f34458o / 2;
            RectF rectF = this.f34457n;
            rectF.set(i18, i19 - i20, this.f34450f - i18, i19 + i20);
            Paint paint = D;
            if (this.f34459p) {
                i10 = this.f34456m;
            } else {
                i10 = this.f34452i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f34460q > 0.0f) {
                Paint paint2 = D;
                if (this.f34459p) {
                    i16 = this.f34456m;
                } else {
                    i16 = this.f34453j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f34451g / 2;
                rectF.set(f12, i21 - i20, (this.f34460q * (this.f34450f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f34451g / 2) - i20;
            if (this.f34449e) {
                i13 = this.f34448c;
            } else {
                i13 = this.f34447b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f34455l);
            c(canvas2, rectF, D);
            D.setColor(this.f34454k);
            if (this.f34449e) {
                f9 = 8.0f;
            } else {
                f9 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f9);
            if (this.f34461r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f34461r;
                if (f15 < dp) {
                    float c3 = u3.c.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f34461r = c3;
                    if (c3 > dp) {
                        this.f34461r = dp;
                    }
                } else {
                    float A = org.telegram.messenger.x3.A((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f34461r = A;
                    if (A < dp) {
                        this.f34461r = dp;
                    }
                }
                View view = this.f34462s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f34449e) {
                i14 = this.f34448c;
            } else {
                i14 = this.f34447b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f34451g / 2, this.f34461r, D);
            if (this.f34463t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f34464u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f34449e) {
                    i15 = this.f34448c;
                } else {
                    i15 = this.f34447b;
                }
                float f16 = i15 / (this.f34450f - E);
                int size = this.f34464u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f34464u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f34468z == null) {
                    this.f34468z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f34450f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f34467y) {
                    if (this.f34449e) {
                        AndroidUtilities.vibrateCursor(this.f34462s);
                    }
                    this.f34467y = size;
                    if (size >= 0 && size < this.f34464u.size()) {
                        e((a51) ((Pair) this.f34464u.get(this.f34467y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f34464u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f34462s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f34466x < 1.0f) {
                    this.f34466x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f34466x, 1.0f);
                    View view3 = this.f34462s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wn0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f34450f - E;
    }

    public final boolean f(float f9, float f10, int i10) {
        vn0 vn0Var;
        if (i10 == 0) {
            int i11 = this.f34451g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f9 >= (-i13)) {
                int i14 = this.f34450f;
                if (f9 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f34447b;
                    if (i15 - i13 > f9 || f9 > i15 + i12 + i13) {
                        int i16 = ((int) f9) - (i12 / 2);
                        this.f34447b = i16;
                        if (i16 < 0) {
                            this.f34447b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f34447b = i17;
                            }
                        }
                    }
                    this.f34449e = true;
                    int i18 = this.f34447b;
                    this.f34448c = i18;
                    this.d = (int) (f9 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f34449e) {
                int i19 = (int) (f9 - this.d);
                this.f34448c = i19;
                if (i19 < 0) {
                    this.f34448c = 0;
                } else {
                    int i20 = this.f34450f - E;
                    if (i19 > i20) {
                        this.f34448c = i20;
                    }
                }
                vn0 vn0Var2 = this.h;
                if (vn0Var2 != null) {
                    vn0Var2.d(this.f34448c / (this.f34450f - E));
                }
                return true;
            }
        } else if (this.f34449e) {
            int i21 = this.f34448c;
            this.f34447b = i21;
            if (i10 == 1 && (vn0Var = this.h) != null) {
                vn0Var.c(i21 / (this.f34450f - E));
            }
            this.f34449e = false;
            return true;
        }
        return false;
    }

    public final void g(float f9) {
        this.f34463t = f9;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f34452i = i10;
        this.f34453j = i11;
        this.f34454k = i13;
        this.f34455l = i12;
        this.f34456m = i14;
    }

    public final void i(float f9) {
        this.f34446a = f9;
        int ceil = (int) Math.ceil((this.f34450f - E) * f9);
        this.f34447b = ceil;
        if (ceil < 0) {
            this.f34447b = 0;
            return;
        }
        int i10 = this.f34450f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f34447b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f34450f == i10 && this.f34451g == i11) {
            return;
        }
        this.f34450f = i10;
        this.f34451g = i11;
        i(this.f34446a);
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
        if (charSequence != this.v || this.f34465w != valueOf.longValue()) {
            this.v = charSequence;
            this.f34465w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f34464u = null;
                this.f34467y = -1;
                this.f34466x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f34468z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                a51[] a51VarArr = (a51[]) spanned.getSpans(0, spanned.length(), a51.class);
                this.f34464u = new ArrayList();
                this.f34466x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (a51 a51Var : a51VarArr) {
                    try {
                        if (a51Var != null && a51Var.getURL() != null && a51Var.d != null && a51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) a51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(a51Var.d), this.A.getFontMetricsInt(), false);
                            this.f34464u.add(new Pair(Float.valueOf(intValue), a51Var));
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                Collections.sort(this.f34464u, new lh.e4(28));
            } catch (Exception e11) {
                FileLog.e(e11);
                this.f34464u = null;
                this.f34467y = -1;
                this.f34466x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f34468z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(a51 a51Var) {
    }
}

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
public class bo0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f24754a;
    public int f24758f;
    public int f24759g;
    public ao0 h;
    public int f24760i;
    public int f24761j;
    public int f24762k;
    public int f24763l;
    public int f24764m;
    public boolean f24767p;
    public float f24768q;
    public float f24769r;
    public View f24770s;
    public ArrayList f24772u;
    public CharSequence v;
    public long f24773w;
    public StaticLayout[] f24776z;
    public int f24755b = 0;
    public int f24756c = 0;
    public int d = 0;
    public boolean f24757e = false;
    public final RectF f24765n = new RectF();
    public final int f24766o = AndroidUtilities.dp(2.0f);
    public float f24771t = 1.0f;
    public float f24774x = 0.0f;
    public int f24775y = -1;
    public float B = 1.0f;

    public bo0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f24770s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f24769r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f24772u = null;
        this.f24775y = -1;
        this.f24774x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f24776z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f24773w = -1L;
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
        float f11 = this.f24771t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f24758f, this.f24759g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f24759g / 2;
            int i20 = this.f24766o / 2;
            RectF rectF = this.f24765n;
            rectF.set(i18, i19 - i20, this.f24758f - i18, i19 + i20);
            Paint paint = D;
            if (this.f24767p) {
                i10 = this.f24764m;
            } else {
                i10 = this.f24760i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f24768q > 0.0f) {
                Paint paint2 = D;
                if (this.f24767p) {
                    i16 = this.f24764m;
                } else {
                    i16 = this.f24761j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f24759g / 2;
                rectF.set(f12, i21 - i20, (this.f24768q * (this.f24758f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f24759g / 2) - i20;
            if (this.f24757e) {
                i13 = this.f24756c;
            } else {
                i13 = this.f24755b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f24763l);
            c(canvas2, rectF, D);
            D.setColor(this.f24762k);
            if (this.f24757e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f24769r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f24769r;
                if (f15 < dp) {
                    float e7 = a4.a.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f24769r = e7;
                    if (e7 > dp) {
                        this.f24769r = dp;
                    }
                } else {
                    float c10 = org.telegram.messenger.vl.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f24769r = c10;
                    if (c10 < dp) {
                        this.f24769r = dp;
                    }
                }
                View view = this.f24770s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f24757e) {
                i14 = this.f24756c;
            } else {
                i14 = this.f24755b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f24759g / 2, this.f24769r, D);
            if (this.f24771t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f24772u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f24757e) {
                    i15 = this.f24756c;
                } else {
                    i15 = this.f24755b;
                }
                float f16 = i15 / (this.f24758f - E);
                int size = this.f24772u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f24772u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f24776z == null) {
                    this.f24776z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f24758f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f24775y) {
                    if (this.f24757e) {
                        AndroidUtilities.vibrateCursor(this.f24770s);
                    }
                    this.f24775y = size;
                    if (size >= 0 && size < this.f24772u.size()) {
                        e((l51) ((Pair) this.f24772u.get(this.f24775y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f24772u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f24770s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f24774x < 1.0f) {
                    this.f24774x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f24774x, 1.0f);
                    View view3 = this.f24770s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bo0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f24758f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        ao0 ao0Var;
        if (i10 == 0) {
            int i11 = this.f24759g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f24758f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f24755b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f24755b = i16;
                        if (i16 < 0) {
                            this.f24755b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f24755b = i17;
                            }
                        }
                    }
                    this.f24757e = true;
                    int i18 = this.f24755b;
                    this.f24756c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f24757e) {
                int i19 = (int) (f7 - this.d);
                this.f24756c = i19;
                if (i19 < 0) {
                    this.f24756c = 0;
                } else {
                    int i20 = this.f24758f - E;
                    if (i19 > i20) {
                        this.f24756c = i20;
                    }
                }
                ao0 ao0Var2 = this.h;
                if (ao0Var2 != null) {
                    ao0Var2.c(this.f24756c / (this.f24758f - E));
                }
                return true;
            }
        } else if (this.f24757e) {
            int i21 = this.f24756c;
            this.f24755b = i21;
            if (i10 == 1 && (ao0Var = this.h) != null) {
                ao0Var.b(i21 / (this.f24758f - E));
            }
            this.f24757e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f24771t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f24760i = i10;
        this.f24761j = i11;
        this.f24762k = i13;
        this.f24763l = i12;
        this.f24764m = i14;
    }

    public final void i(float f7) {
        this.f24754a = f7;
        int ceil = (int) Math.ceil((this.f24758f - E) * f7);
        this.f24755b = ceil;
        if (ceil < 0) {
            this.f24755b = 0;
            return;
        }
        int i10 = this.f24758f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f24755b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f24758f == i10 && this.f24759g == i11) {
            return;
        }
        this.f24758f = i10;
        this.f24759g = i11;
        i(this.f24754a);
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
        if (charSequence != this.v || this.f24773w != valueOf.longValue()) {
            this.v = charSequence;
            this.f24773w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f24772u = null;
                this.f24775y = -1;
                this.f24774x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f24776z;
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
                this.f24772u = new ArrayList();
                this.f24774x = 0.0f;
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
                            this.f24772u.add(new Pair(Float.valueOf(intValue), l51Var));
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                Collections.sort(this.f24772u, new org.telegram.ui.f6(16));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.f24772u = null;
                this.f24775y = -1;
                this.f24774x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f24776z;
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

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
public class ln0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f30487a;
    public int f30491f;
    public int f30492g;
    public kn0 h;
    public int f30493i;
    public int f30494j;
    public int f30495k;
    public int f30496l;
    public int f30497m;
    public boolean f30500p;
    public float f30501q;
    public float f30502r;
    public View f30503s;
    public ArrayList f30505u;
    public CharSequence v;
    public long f30506w;
    public StaticLayout[] f30509z;
    public int f30488b = 0;
    public int f30489c = 0;
    public int d = 0;
    public boolean f30490e = false;
    public final RectF f30498n = new RectF();
    public final int f30499o = AndroidUtilities.dp(2.0f);
    public float f30504t = 1.0f;
    public float f30507x = 0.0f;
    public int f30508y = -1;
    public float B = 1.0f;

    public ln0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f30503s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f30502r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f30505u = null;
        this.f30508y = -1;
        this.f30507x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f30509z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f30506w = -1L;
    }

    public final void b(Canvas canvas) {
        Canvas canvas2;
        int i9;
        int i10;
        int i11;
        int i12;
        float f10;
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        float f12 = this.f30504t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f30491f, this.f30492g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i17 = E / 2;
            int i18 = this.f30492g / 2;
            int i19 = this.f30499o / 2;
            RectF rectF = this.f30498n;
            rectF.set(i17, i18 - i19, this.f30491f - i17, i18 + i19);
            Paint paint = D;
            if (this.f30500p) {
                i9 = this.f30497m;
            } else {
                i9 = this.f30493i;
            }
            paint.setColor(i9);
            c(canvas2, rectF, D);
            if (this.f30501q > 0.0f) {
                Paint paint2 = D;
                if (this.f30500p) {
                    i15 = this.f30497m;
                } else {
                    i15 = this.f30494j;
                }
                paint2.setColor(i15);
                float f13 = E / 2;
                int i20 = this.f30492g / 2;
                rectF.set(f13, i20 - i19, (this.f30501q * (this.f30491f - i16)) + f13, i20 + i19);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f30492g / 2) - i19;
            if (this.f30490e) {
                i12 = this.f30489c;
            } else {
                i12 = this.f30488b;
            }
            rectF.set(f14, f15, i10 + i12, i19 + i11);
            D.setColor(this.f30496l);
            c(canvas2, rectF, D);
            D.setColor(this.f30495k);
            if (this.f30490e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            if (this.f30502r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f30502r;
                if (f16 < dp) {
                    float b10 = org.telegram.ui.Cells.j2.b((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f16);
                    this.f30502r = b10;
                    if (b10 > dp) {
                        this.f30502r = dp;
                    }
                } else {
                    float c10 = org.telegram.messenger.ll.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f16);
                    this.f30502r = c10;
                    if (c10 < dp) {
                        this.f30502r = dp;
                    }
                }
                View view = this.f30503s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f30490e) {
                i13 = this.f30489c;
            } else {
                i13 = this.f30488b;
            }
            canvas2.drawCircle((E / 2) + i13, this.f30492g / 2, this.f30502r, D);
            if (this.f30504t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f30505u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f30490e) {
                    i14 = this.f30489c;
                } else {
                    i14 = this.f30488b;
                }
                float f17 = i14 / (this.f30491f - E);
                int size = this.f30505u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f30505u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f30509z == null) {
                    this.f30509z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f30491f - f18));
                AndroidUtilities.dp(66.0f);
                if (size != this.f30508y) {
                    if (this.f30490e) {
                        AndroidUtilities.vibrateCursor(this.f30503s);
                    }
                    this.f30508y = size;
                    if (size >= 0 && size < this.f30505u.size()) {
                        e((p41) ((Pair) this.f30505u.get(this.f30508y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f30505u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f30503s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f30507x < 1.0f) {
                    this.f30507x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f30507x, 1.0f);
                    View view3 = this.f30503s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ln0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f30491f - E;
    }

    public final boolean f(float f10, float f11, int i9) {
        kn0 kn0Var;
        if (i9 == 0) {
            int i10 = this.f30492g;
            int i11 = E;
            int i12 = (i10 - i11) / 2;
            if (f10 >= (-i12)) {
                int i13 = this.f30491f;
                if (f10 <= i13 + i12 && f11 >= 0.0f && f11 <= i10) {
                    int i14 = this.f30488b;
                    if (i14 - i12 > f10 || f10 > i14 + i11 + i12) {
                        int i15 = ((int) f10) - (i11 / 2);
                        this.f30488b = i15;
                        if (i15 < 0) {
                            this.f30488b = 0;
                        } else {
                            int i16 = i13 - i11;
                            if (i15 > i16) {
                                this.f30488b = i16;
                            }
                        }
                    }
                    this.f30490e = true;
                    int i17 = this.f30488b;
                    this.f30489c = i17;
                    this.d = (int) (f10 - i17);
                    return true;
                }
            }
        } else if (i9 != 1 && i9 != 3) {
            if (i9 == 2 && this.f30490e) {
                int i18 = (int) (f10 - this.d);
                this.f30489c = i18;
                if (i18 < 0) {
                    this.f30489c = 0;
                } else {
                    int i19 = this.f30491f - E;
                    if (i18 > i19) {
                        this.f30489c = i19;
                    }
                }
                kn0 kn0Var2 = this.h;
                if (kn0Var2 != null) {
                    kn0Var2.e(this.f30489c / (this.f30491f - E));
                }
                return true;
            }
        } else if (this.f30490e) {
            int i20 = this.f30489c;
            this.f30488b = i20;
            if (i9 == 1 && (kn0Var = this.h) != null) {
                kn0Var.b(i20 / (this.f30491f - E));
            }
            this.f30490e = false;
            return true;
        }
        return false;
    }

    public final void g(float f10) {
        this.f30504t = f10;
    }

    public final void h(int i9, int i10, int i11, int i12, int i13) {
        this.f30493i = i9;
        this.f30494j = i10;
        this.f30495k = i12;
        this.f30496l = i11;
        this.f30497m = i13;
    }

    public final void i(float f10) {
        this.f30487a = f10;
        int ceil = (int) Math.ceil((this.f30491f - E) * f10);
        this.f30488b = ceil;
        if (ceil < 0) {
            this.f30488b = 0;
            return;
        }
        int i9 = this.f30491f;
        int i10 = E;
        if (ceil > i9 - i10) {
            this.f30488b = i9 - i10;
        }
    }

    public final void j(int i9, int i10) {
        if (this.f30491f == i9 && this.f30492g == i10) {
            return;
        }
        this.f30491f = i9;
        this.f30492g = i10;
        i(this.f30487a);
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
        if (charSequence != this.v || this.f30506w != valueOf.longValue()) {
            this.v = charSequence;
            this.f30506w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f30505u = null;
                this.f30508y = -1;
                this.f30507x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f30509z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                p41[] p41VarArr = (p41[]) spanned.getSpans(0, spanned.length(), p41.class);
                this.f30505u = new ArrayList();
                this.f30507x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (p41 p41Var : p41VarArr) {
                    try {
                        if (p41Var != null && p41Var.getURL() != null && p41Var.d != null && p41Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) p41Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(p41Var.d), this.A.getFontMetricsInt(), false);
                            this.f30505u.add(new Pair(Float.valueOf(intValue), p41Var));
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                Collections.sort(this.f30505u, new jn0(0));
            } catch (Exception e11) {
                FileLog.e(e11);
                this.f30505u = null;
                this.f30508y = -1;
                this.f30507x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f30509z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(p41 p41Var) {
    }
}

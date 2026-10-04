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
public class to0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f31114a;
    public int f31118f;
    public int f31119g;
    public so0 h;
    public int f31120i;
    public int f31121j;
    public int f31122k;
    public int f31123l;
    public int f31124m;
    public boolean f31127p;
    public float f31128q;
    public float f31129r;
    public View f31130s;
    public ArrayList f31132u;
    public CharSequence v;
    public long f31133w;
    public StaticLayout[] f31136z;
    public int f31115b = 0;
    public int f31116c = 0;
    public int d = 0;
    public boolean f31117e = false;
    public final RectF f31125n = new RectF();
    public final int f31126o = AndroidUtilities.dp(2.0f);
    public float f31131t = 1.0f;
    public float f31134x = 0.0f;
    public int f31135y = -1;
    public float B = 1.0f;

    public to0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f31130s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f31129r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f31132u = null;
        this.f31135y = -1;
        this.f31134x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f31136z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f31133w = -1L;
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
        float f11 = this.f31131t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f31118f, this.f31119g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f31119g / 2;
            int i20 = this.f31126o / 2;
            RectF rectF = this.f31125n;
            rectF.set(i18, i19 - i20, this.f31118f - i18, i19 + i20);
            Paint paint = D;
            if (this.f31127p) {
                i10 = this.f31124m;
            } else {
                i10 = this.f31120i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f31128q > 0.0f) {
                Paint paint2 = D;
                if (this.f31127p) {
                    i16 = this.f31124m;
                } else {
                    i16 = this.f31121j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f31119g / 2;
                rectF.set(f12, i21 - i20, (this.f31128q * (this.f31118f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f31119g / 2) - i20;
            if (this.f31117e) {
                i13 = this.f31116c;
            } else {
                i13 = this.f31115b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f31123l);
            c(canvas2, rectF, D);
            D.setColor(this.f31122k);
            if (this.f31117e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f31129r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f31129r;
                if (f15 < dp) {
                    float e7 = a4.a.e((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f31129r = e7;
                    if (e7 > dp) {
                        this.f31129r = dp;
                    }
                } else {
                    float b10 = org.telegram.messenger.bi.b((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f31129r = b10;
                    if (b10 < dp) {
                        this.f31129r = dp;
                    }
                }
                View view = this.f31130s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.f31117e) {
                i14 = this.f31116c;
            } else {
                i14 = this.f31115b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f31119g / 2, this.f31129r, D);
            if (this.f31131t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f31132u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.f31117e) {
                    i15 = this.f31116c;
                } else {
                    i15 = this.f31115b;
                }
                float f16 = i15 / (this.f31118f - E);
                int size = this.f31132u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f31132u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f31136z == null) {
                    this.f31136z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f31118f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f31135y) {
                    if (this.f31117e) {
                        AndroidUtilities.vibrateCursor(this.f31130s);
                    }
                    this.f31135y = size;
                    if (size >= 0 && size < this.f31132u.size()) {
                        e((k61) ((Pair) this.f31132u.get(this.f31135y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f31132u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f31130s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f31134x < 1.0f) {
                    this.f31134x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f31134x, 1.0f);
                    View view3 = this.f31130s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.to0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f31118f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        so0 so0Var;
        if (i10 == 0) {
            int i11 = this.f31119g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f31118f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f31115b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f31115b = i16;
                        if (i16 < 0) {
                            this.f31115b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f31115b = i17;
                            }
                        }
                    }
                    this.f31117e = true;
                    int i18 = this.f31115b;
                    this.f31116c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.f31117e) {
                int i19 = (int) (f7 - this.d);
                this.f31116c = i19;
                if (i19 < 0) {
                    this.f31116c = 0;
                } else {
                    int i20 = this.f31118f - E;
                    if (i19 > i20) {
                        this.f31116c = i20;
                    }
                }
                so0 so0Var2 = this.h;
                if (so0Var2 != null) {
                    so0Var2.d(this.f31116c / (this.f31118f - E));
                }
                return true;
            }
        } else if (this.f31117e) {
            int i21 = this.f31116c;
            this.f31115b = i21;
            if (i10 == 1 && (so0Var = this.h) != null) {
                so0Var.b(i21 / (this.f31118f - E));
            }
            this.f31117e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f31131t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f31120i = i10;
        this.f31121j = i11;
        this.f31122k = i13;
        this.f31123l = i12;
        this.f31124m = i14;
    }

    public final void i(float f7) {
        this.f31114a = f7;
        int ceil = (int) Math.ceil((this.f31118f - E) * f7);
        this.f31115b = ceil;
        if (ceil < 0) {
            this.f31115b = 0;
            return;
        }
        int i10 = this.f31118f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f31115b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f31118f == i10 && this.f31119g == i11) {
            return;
        }
        this.f31118f = i10;
        this.f31119g = i11;
        i(this.f31114a);
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
        if (charSequence != this.v || this.f31133w != valueOf.longValue()) {
            this.v = charSequence;
            this.f31133w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f31132u = null;
                this.f31135y = -1;
                this.f31134x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f31136z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                k61[] k61VarArr = (k61[]) spanned.getSpans(0, spanned.length(), k61.class);
                this.f31132u = new ArrayList();
                this.f31134x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (k61 k61Var : k61VarArr) {
                    try {
                        if (k61Var != null && k61Var.getURL() != null && k61Var.d != null && k61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) k61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(k61Var.d), this.A.getFontMetricsInt(), false);
                            this.f31132u.add(new Pair(Float.valueOf(intValue), k61Var));
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                Collections.sort(this.f31132u, new org.telegram.ui.ff(14));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.f31132u = null;
                this.f31135y = -1;
                this.f31134x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f31136z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(k61 k61Var) {
    }
}

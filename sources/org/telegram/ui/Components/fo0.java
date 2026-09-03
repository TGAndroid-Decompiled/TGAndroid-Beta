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
public class fo0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f24924a;
    public int f24927f;
    public int f24928g;
    public eo0 h;
    public int f24929i;
    public int f24930j;
    public int f24931k;
    public int f24932l;
    public int f24933m;
    public boolean f24936p;
    public float f24937q;
    public float f24938r;
    public View f24939s;
    public ArrayList f24941u;
    public CharSequence v;
    public long f24942w;
    public StaticLayout[] f24945z;
    public int f24925b = 0;
    public int f24926c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f24934n = new RectF();
    public final int f24935o = AndroidUtilities.dp(2.0f);
    public float f24940t = 1.0f;
    public float f24943x = 0.0f;
    public int f24944y = -1;
    public float B = 1.0f;

    public fo0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f24939s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f24938r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f24941u = null;
        this.f24944y = -1;
        this.f24943x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f24945z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f24942w = -1L;
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
        float f12 = this.f24940t;
        if (f12 > 0.0f) {
            if (f12 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f24927f, this.f24928g, (int) (f12 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f24928g / 2;
            int i20 = this.f24935o / 2;
            RectF rectF = this.f24934n;
            rectF.set(i18, i19 - i20, this.f24927f - i18, i19 + i20);
            Paint paint = D;
            if (this.f24936p) {
                i10 = this.f24933m;
            } else {
                i10 = this.f24929i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f24937q > 0.0f) {
                Paint paint2 = D;
                if (this.f24936p) {
                    i16 = this.f24933m;
                } else {
                    i16 = this.f24930j;
                }
                paint2.setColor(i16);
                float f13 = E / 2;
                int i21 = this.f24928g / 2;
                rectF.set(f13, i21 - i20, (this.f24937q * (this.f24927f - i17)) + f13, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f14 = E / 2;
            float f15 = (this.f24928g / 2) - i20;
            if (this.e) {
                i13 = this.f24926c;
            } else {
                i13 = this.f24925b;
            }
            rectF.set(f14, f15, i11 + i13, i20 + i12);
            D.setColor(this.f24932l);
            c(canvas2, rectF, D);
            D.setColor(this.f24931k);
            if (this.e) {
                f10 = 8.0f;
            } else {
                f10 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f10);
            if (this.f24938r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f16 = this.f24938r;
                if (f16 < dp) {
                    float c3 = vh.w2.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f16);
                    this.f24938r = c3;
                    if (c3 > dp) {
                        this.f24938r = dp;
                    }
                } else {
                    float A = org.telegram.messenger.y3.A((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f16);
                    this.f24938r = A;
                    if (A < dp) {
                        this.f24938r = dp;
                    }
                }
                View view = this.f24939s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f24926c;
            } else {
                i14 = this.f24925b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f24928g / 2, this.f24938r, D);
            if (this.f24940t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f24941u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f24926c;
                } else {
                    i15 = this.f24925b;
                }
                float f17 = i15 / (this.f24927f - E);
                int size = this.f24941u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f24941u.get(size)).first).floatValue() - 0.001f <= f17) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f24945z == null) {
                    this.f24945z = new StaticLayout[2];
                }
                float f18 = E / 2.0f;
                Math.abs(f18 - (this.f24927f - f18));
                AndroidUtilities.dp(66.0f);
                if (size != this.f24944y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f24939s);
                    }
                    this.f24944y = size;
                    if (size >= 0 && size < this.f24941u.size()) {
                        e((m51) ((Pair) this.f24941u.get(this.f24944y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f24941u.size() > 8) {
                        f11 = 160.0f;
                    } else {
                        f11 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f11) + this.B, 1.0f);
                    View view2 = this.f24939s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f24943x < 1.0f) {
                    this.f24943x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f24943x, 1.0f);
                    View view3 = this.f24939s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fo0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f24927f - E;
    }

    public final boolean f(float f10, float f11, int i10) {
        eo0 eo0Var;
        if (i10 == 0) {
            int i11 = this.f24928g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f10 >= (-i13)) {
                int i14 = this.f24927f;
                if (f10 <= i14 + i13 && f11 >= 0.0f && f11 <= i11) {
                    int i15 = this.f24925b;
                    if (i15 - i13 > f10 || f10 > i15 + i12 + i13) {
                        int i16 = ((int) f10) - (i12 / 2);
                        this.f24925b = i16;
                        if (i16 < 0) {
                            this.f24925b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f24925b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f24925b;
                    this.f24926c = i18;
                    this.d = (int) (f10 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f10 - this.d);
                this.f24926c = i19;
                if (i19 < 0) {
                    this.f24926c = 0;
                } else {
                    int i20 = this.f24927f - E;
                    if (i19 > i20) {
                        this.f24926c = i20;
                    }
                }
                eo0 eo0Var2 = this.h;
                if (eo0Var2 != null) {
                    eo0Var2.d(this.f24926c / (this.f24927f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f24926c;
            this.f24925b = i21;
            if (i10 == 1 && (eo0Var = this.h) != null) {
                eo0Var.b(i21 / (this.f24927f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f10) {
        this.f24940t = f10;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f24929i = i10;
        this.f24930j = i11;
        this.f24931k = i13;
        this.f24932l = i12;
        this.f24933m = i14;
    }

    public final void i(float f10) {
        this.f24924a = f10;
        int ceil = (int) Math.ceil((this.f24927f - E) * f10);
        this.f24925b = ceil;
        if (ceil < 0) {
            this.f24925b = 0;
            return;
        }
        int i10 = this.f24927f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f24925b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f24927f == i10 && this.f24928g == i11) {
            return;
        }
        this.f24927f = i10;
        this.f24928g = i11;
        i(this.f24924a);
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
        if (charSequence != this.v || this.f24942w != valueOf.longValue()) {
            this.v = charSequence;
            this.f24942w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f24941u = null;
                this.f24944y = -1;
                this.f24943x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f24945z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                m51[] m51VarArr = (m51[]) spanned.getSpans(0, spanned.length(), m51.class);
                this.f24941u = new ArrayList();
                this.f24943x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (m51 m51Var : m51VarArr) {
                    try {
                        if (m51Var != null && m51Var.getURL() != null && m51Var.d != null && m51Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) m51Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(m51Var.d), this.A.getFontMetricsInt(), false);
                            this.f24941u.add(new Pair(Float.valueOf(intValue), m51Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f24941u, new nh.e4(25));
            } catch (Exception e6) {
                FileLog.e(e6);
                this.f24941u = null;
                this.f24944y = -1;
                this.f24943x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f24945z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(m51 m51Var) {
    }
}

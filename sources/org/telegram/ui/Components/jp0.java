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
public class jp0 {
    public static Paint D;
    public static int E;
    public static float[] F;
    public static Path G;
    public TextPaint A;
    public long C;
    public float f29709a;
    public int f29712f;
    public int f29713g;
    public ip0 h;
    public int f29714i;
    public int f29715j;
    public int f29716k;
    public int f29717l;
    public int f29718m;
    public boolean f29721p;
    public float f29722q;
    public float f29723r;
    public View f29724s;
    public ArrayList f29726u;
    public CharSequence v;
    public long f29727w;
    public StaticLayout[] f29730z;
    public int f29710b = 0;
    public int f29711c = 0;
    public int d = 0;
    public boolean e = false;
    public final RectF f29719n = new RectF();
    public final int f29720o = AndroidUtilities.dp(2.0f);
    public float f29725t = 1.0f;
    public float f29728x = 0.0f;
    public int f29729y = -1;
    public float B = 1.0f;

    public jp0(View view) {
        if (D == null) {
            D = new Paint(1);
        }
        this.f29724s = view;
        E = AndroidUtilities.dp(24.0f);
        this.f29723r = AndroidUtilities.dp(6.0f);
    }

    public final void a() {
        this.f29726u = null;
        this.f29729y = -1;
        this.f29728x = 0.0f;
        StaticLayout[] staticLayoutArr = this.f29730z;
        if (staticLayoutArr != null) {
            staticLayoutArr[1] = null;
            staticLayoutArr[0] = null;
        }
        this.v = null;
        this.f29727w = -1L;
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
        float f11 = this.f29725t;
        if (f11 > 0.0f) {
            if (f11 < 1.0f) {
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, this.f29712f, this.f29713g, (int) (f11 * 255.0f), 31);
            } else {
                canvas2 = canvas;
            }
            int i18 = E / 2;
            int i19 = this.f29713g / 2;
            int i20 = this.f29720o / 2;
            RectF rectF = this.f29719n;
            rectF.set(i18, i19 - i20, this.f29712f - i18, i19 + i20);
            Paint paint = D;
            if (this.f29721p) {
                i10 = this.f29718m;
            } else {
                i10 = this.f29714i;
            }
            paint.setColor(i10);
            c(canvas2, rectF, D);
            if (this.f29722q > 0.0f) {
                Paint paint2 = D;
                if (this.f29721p) {
                    i16 = this.f29718m;
                } else {
                    i16 = this.f29715j;
                }
                paint2.setColor(i16);
                float f12 = E / 2;
                int i21 = this.f29713g / 2;
                rectF.set(f12, i21 - i20, (this.f29722q * (this.f29712f - i17)) + f12, i21 + i20);
                c(canvas2, rectF, D);
            }
            float f13 = E / 2;
            float f14 = (this.f29713g / 2) - i20;
            if (this.e) {
                i13 = this.f29711c;
            } else {
                i13 = this.f29710b;
            }
            rectF.set(f13, f14, i11 + i13, i20 + i12);
            D.setColor(this.f29717l);
            c(canvas2, rectF, D);
            D.setColor(this.f29716k);
            if (this.e) {
                f7 = 8.0f;
            } else {
                f7 = 6.0f;
            }
            float dp = AndroidUtilities.dp(f7);
            if (this.f29723r != dp) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime > 18) {
                    elapsedRealtime = 16;
                }
                float f15 = this.f29723r;
                if (f15 < dp) {
                    float c10 = a1.g.c((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f29723r = c10;
                    if (c10 > dp) {
                        this.f29723r = dp;
                    }
                } else {
                    float w10 = org.telegram.messenger.wh.w((float) elapsedRealtime, 60.0f, AndroidUtilities.dp(1.0f), f15);
                    this.f29723r = w10;
                    if (w10 < dp) {
                        this.f29723r = dp;
                    }
                }
                View view = this.f29724s;
                if (view != null) {
                    view.invalidate();
                }
            }
            if (this.e) {
                i14 = this.f29711c;
            } else {
                i14 = this.f29710b;
            }
            canvas2.drawCircle((E / 2) + i14, this.f29713g / 2, this.f29723r, D);
            if (this.f29725t < 1.0f) {
                canvas2.restore();
            }
            ArrayList arrayList = this.f29726u;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (this.e) {
                    i15 = this.f29711c;
                } else {
                    i15 = this.f29710b;
                }
                float f16 = i15 / (this.f29712f - E);
                int size = this.f29726u.size() - 1;
                while (true) {
                    if (size >= 0) {
                        if (((Float) ((Pair) this.f29726u.get(size)).first).floatValue() - 0.001f <= f16) {
                            break;
                        }
                        size--;
                    } else {
                        size = -1;
                        break;
                    }
                }
                if (this.f29730z == null) {
                    this.f29730z = new StaticLayout[2];
                }
                float f17 = E / 2.0f;
                Math.abs(f17 - (this.f29712f - f17));
                AndroidUtilities.dp(66.0f);
                if (size != this.f29729y) {
                    if (this.e) {
                        AndroidUtilities.vibrateCursor(this.f29724s);
                    }
                    this.f29729y = size;
                    if (size >= 0 && size < this.f29726u.size()) {
                        e((y61) ((Pair) this.f29726u.get(this.f29729y)).second);
                    }
                }
                if (this.B < 1.0f) {
                    long min = Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C));
                    if (this.f29726u.size() > 8) {
                        f10 = 160.0f;
                    } else {
                        f10 = 220.0f;
                    }
                    this.B = Math.min((((float) min) / f10) + this.B, 1.0f);
                    View view2 = this.f29724s;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                    this.C = SystemClock.elapsedRealtime();
                }
                if (this.f29728x < 1.0f) {
                    this.f29728x = Math.min((((float) Math.min(17L, Math.abs(SystemClock.elapsedRealtime() - this.C))) / 200.0f) + this.f29728x, 1.0f);
                    View view3 = this.f29724s;
                    if (view3 != null) {
                        view3.invalidate();
                    }
                    SystemClock.elapsedRealtime();
                }
            }
        }
    }

    public final void c(android.graphics.Canvas r26, android.graphics.RectF r27, android.graphics.Paint r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jp0.c(android.graphics.Canvas, android.graphics.RectF, android.graphics.Paint):void");
    }

    public final int d() {
        return this.f29712f - E;
    }

    public final boolean f(float f7, float f10, int i10) {
        ip0 ip0Var;
        if (i10 == 0) {
            int i11 = this.f29713g;
            int i12 = E;
            int i13 = (i11 - i12) / 2;
            if (f7 >= (-i13)) {
                int i14 = this.f29712f;
                if (f7 <= i14 + i13 && f10 >= 0.0f && f10 <= i11) {
                    int i15 = this.f29710b;
                    if (i15 - i13 > f7 || f7 > i15 + i12 + i13) {
                        int i16 = ((int) f7) - (i12 / 2);
                        this.f29710b = i16;
                        if (i16 < 0) {
                            this.f29710b = 0;
                        } else {
                            int i17 = i14 - i12;
                            if (i16 > i17) {
                                this.f29710b = i17;
                            }
                        }
                    }
                    this.e = true;
                    int i18 = this.f29710b;
                    this.f29711c = i18;
                    this.d = (int) (f7 - i18);
                    return true;
                }
            }
        } else if (i10 != 1 && i10 != 3) {
            if (i10 == 2 && this.e) {
                int i19 = (int) (f7 - this.d);
                this.f29711c = i19;
                if (i19 < 0) {
                    this.f29711c = 0;
                } else {
                    int i20 = this.f29712f - E;
                    if (i19 > i20) {
                        this.f29711c = i20;
                    }
                }
                ip0 ip0Var2 = this.h;
                if (ip0Var2 != null) {
                    ip0Var2.f(this.f29711c / (this.f29712f - E));
                }
                return true;
            }
        } else if (this.e) {
            int i21 = this.f29711c;
            this.f29710b = i21;
            if (i10 == 1 && (ip0Var = this.h) != null) {
                ip0Var.c(i21 / (this.f29712f - E));
            }
            this.e = false;
            return true;
        }
        return false;
    }

    public final void g(float f7) {
        this.f29725t = f7;
    }

    public final void h(int i10, int i11, int i12, int i13, int i14) {
        this.f29714i = i10;
        this.f29715j = i11;
        this.f29716k = i13;
        this.f29717l = i12;
        this.f29718m = i14;
    }

    public final void i(float f7) {
        this.f29709a = f7;
        int ceil = (int) Math.ceil((this.f29712f - E) * f7);
        this.f29710b = ceil;
        if (ceil < 0) {
            this.f29710b = 0;
            return;
        }
        int i10 = this.f29712f;
        int i11 = E;
        if (ceil > i10 - i11) {
            this.f29710b = i10 - i11;
        }
    }

    public final void j(int i10, int i11) {
        if (this.f29712f == i10 && this.f29713g == i11) {
            return;
        }
        this.f29712f = i10;
        this.f29713g = i11;
        i(this.f29709a);
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
        if (charSequence != this.v || this.f29727w != valueOf.longValue()) {
            this.v = charSequence;
            this.f29727w = valueOf.longValue();
            if (!(charSequence instanceof Spanned)) {
                this.f29726u = null;
                this.f29729y = -1;
                this.f29728x = 0.0f;
                StaticLayout[] staticLayoutArr = this.f29730z;
                if (staticLayoutArr != null) {
                    staticLayoutArr[1] = null;
                    staticLayoutArr[0] = null;
                    return;
                }
                return;
            }
            Spanned spanned = (Spanned) charSequence;
            try {
                y61[] y61VarArr = (y61[]) spanned.getSpans(0, spanned.length(), y61.class);
                this.f29726u = new ArrayList();
                this.f29728x = 0.0f;
                if (this.A == null) {
                    TextPaint textPaint = new TextPaint(1);
                    this.A = textPaint;
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    this.A.setColor(-1);
                }
                for (y61 y61Var : y61VarArr) {
                    try {
                        if (y61Var != null && y61Var.getURL() != null && y61Var.d != null && y61Var.getURL().startsWith("audio?") && (parseInt = Utilities.parseInt((CharSequence) y61Var.getURL().substring(6))) != null && parseInt.intValue() >= 0) {
                            float intValue = ((float) (parseInt.intValue() * 1000)) / ((float) valueOf.longValue());
                            Emoji.replaceEmoji(new SpannableStringBuilder(y61Var.d), this.A.getFontMetricsInt(), false);
                            this.f29726u.add(new Pair(Float.valueOf(intValue), y61Var));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                Collections.sort(this.f29726u, new org.telegram.ui.ActionBar.n4(21));
            } catch (Exception e10) {
                FileLog.e(e10);
                this.f29726u = null;
                this.f29729y = -1;
                this.f29728x = 0.0f;
                StaticLayout[] staticLayoutArr2 = this.f29730z;
                if (staticLayoutArr2 != null) {
                    staticLayoutArr2[1] = null;
                    staticLayoutArr2[0] = null;
                }
            }
        }
    }

    public void e(y61 y61Var) {
    }
}

package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class z8 extends Drawable {
    public static final int[][] C = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public Drawable B;
    public final TextPaint f35221a;
    public boolean f35222b;
    public boolean f35223c;
    public int d;
    public int f35224e;
    public z10 f35225f;
    public boolean f35226g;
    public StaticLayout h;
    public float f35227i;
    public float f35228j;
    public float f35229k;
    public boolean f35230l;
    public boolean f35231m;
    public int f35232n;
    public float f35233o;
    public float f35234p;
    public final StringBuilder f35235q;
    public int f35236r;
    public int f35237s;
    public int f35238t;
    public int f35239u;
    public LinearGradient v;
    public boolean f35240w;
    public boolean f35241x;
    public int f35242y;
    public final org.telegram.ui.ActionBar.b6 f35243z;

    public z8() {
        this((org.telegram.ui.ActionBar.b6) null);
    }

    public static void a(String str, String str2, String str3, StringBuilder sb2) {
        sb2.setLength(0);
        if (str3 != null) {
            sb2.append(str3);
            return;
        }
        if (str != null && str.length() > 0) {
            sb2.append(v(str));
        }
        if (str2 != null && str2.length() > 0) {
            int lastIndexOf = str2.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            sb2.append("\u200c");
            sb2.append(v(str2));
        } else if (str != null && str.length() > 0) {
            for (int length = str.length() - 1; length >= 0; length--) {
                if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                    int length2 = sb2.length();
                    sb2.append("\u200c");
                    sb2.append(v(str.substring(length2)));
                    return;
                }
            }
        }
    }

    public static int d(long j10) {
        return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23213p8[e(j10)], false);
    }

    public static int e(long j10) {
        return (int) Math.abs(j10 % org.telegram.ui.ActionBar.f6.f23213p8.length);
    }

    public static int f(int i9) {
        float[] M0 = org.telegram.ui.ActionBar.f6.M0(5);
        Color.colorToHSV(i9, M0);
        int i10 = (int) M0[0];
        if (i10 >= 345 || i10 < 29) {
            return 0;
        }
        if (i10 < 67) {
            return 1;
        }
        if (i10 < 140) {
            return 3;
        }
        if (i10 < 199) {
            return 4;
        }
        if (i10 < 234) {
            return 5;
        }
        if (i10 < 301) {
            return 2;
        }
        return 6;
    }

    public static String v(String str) {
        ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str);
        if (parseEmojis != null && !parseEmojis.isEmpty() && parseEmojis.get(0).start == 0) {
            return str.substring(0, parseEmojis.get(0).end);
        }
        return str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1)));
    }

    public final int b() {
        if (this.f35226g) {
            int i9 = this.d;
            int i10 = 0;
            org.telegram.ui.ActionBar.d6 k10 = org.telegram.ui.ActionBar.f6.I.k(false);
            org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
            if (k10 != null) {
                i10 = k10.f22868c;
            }
            return org.telegram.ui.ActionBar.f6.B(e6Var, i10, i9);
        }
        return this.d;
    }

    public final int c() {
        if (this.f35226g) {
            int i9 = this.f35224e;
            int i10 = 0;
            org.telegram.ui.ActionBar.d6 k10 = org.telegram.ui.ActionBar.f6.I.k(false);
            org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
            if (k10 != null) {
                i10 = k10.f22868c;
            }
            return org.telegram.ui.ActionBar.f6.B(e6Var, i10, i9);
        }
        return this.f35224e;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr;
        Drawable drawable;
        z10 z10Var;
        int i9;
        int i10;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int width = bounds.width();
        int i11 = org.telegram.ui.ActionBar.f6.J7;
        org.telegram.ui.ActionBar.b6 b6Var = this.f35243z;
        int k10 = i0.a.k(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), this.f35242y);
        TextPaint textPaint = this.f35221a;
        textPaint.setColor(k10);
        Paint paint = org.telegram.ui.ActionBar.f6.f23223q0;
        if (this.f35223c && (z10Var = this.f35225f) != null) {
            z10Var.b(bounds.left, bounds.top, i9 + width, i10 + width);
            paint = this.f35225f.f35155c;
        } else if (this.f35222b) {
            int k11 = i0.a.k(b(), this.f35242y);
            int k12 = i0.a.k(c(), this.f35242y);
            if (this.v == null || this.f35237s != bounds.height() || this.f35238t != k11 || this.f35239u != k12) {
                int height = bounds.height();
                this.f35237s = height;
                this.f35238t = k11;
                this.f35239u = k12;
                this.v = new LinearGradient(0.0f, 0.0f, 0.0f, height, k11, k12, Shader.TileMode.CLAMP);
            }
            paint.setShader(this.v);
            paint.setAlpha(this.f35242y);
        } else {
            paint.setShader(null);
            paint.setColor(i0.a.k(b(), this.f35242y));
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.f35240w) {
            if (this.f35241x) {
                canvas.save();
                float f10 = width / 2.0f;
                canvas.rotate(-45.0f, f10, f10);
            }
            if (this.f35236r > 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = width;
                rectF.set(0.0f, 0.0f, f11, f11);
                float f12 = this.f35236r;
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                float f13 = width / 2.0f;
                canvas.drawCircle(f13, f13, f13, paint);
            }
            if (this.f35241x) {
                canvas.restore();
            }
        }
        int i12 = this.f35232n;
        if (i12 == 2) {
            if (this.f35233o != 0.0f) {
                int i13 = org.telegram.ui.ActionBar.f6.M7;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.f6.v0(i13, b6Var), this.f35242y));
                float f14 = width / 2.0f;
                canvas.drawCircle(f14, f14, this.f35233o * f14, paint);
                if (org.telegram.ui.ActionBar.f6.C1) {
                    mi0 mi0Var = org.telegram.ui.ActionBar.f6.f23298u1;
                    mi0Var.W = true;
                    mi0Var.O(org.telegram.ui.ActionBar.f6.w0(null, i13, true), "Arrow1");
                    org.telegram.ui.ActionBar.f6.f23298u1.O(org.telegram.ui.ActionBar.f6.w0(null, i13, true), "Arrow2");
                    org.telegram.ui.ActionBar.f6.f23298u1.m();
                    org.telegram.ui.ActionBar.f6.C1 = false;
                }
            } else if (!org.telegram.ui.ActionBar.f6.C1) {
                mi0 mi0Var2 = org.telegram.ui.ActionBar.f6.f23298u1;
                mi0Var2.W = true;
                mi0Var2.O(this.d, "Arrow1");
                org.telegram.ui.ActionBar.f6.f23298u1.O(this.d, "Arrow2");
                org.telegram.ui.ActionBar.f6.f23298u1.m();
                org.telegram.ui.ActionBar.f6.C1 = true;
            }
            mi0 mi0Var3 = org.telegram.ui.ActionBar.f6.f23298u1;
            int i14 = mi0Var3.f30842b;
            int i15 = mi0Var3.f30844c;
            int i16 = (width - i14) / 2;
            int i17 = (width - i15) / 2;
            canvas.save();
            org.telegram.ui.ActionBar.f6.f23298u1.setBounds(i16, i17, i14 + i16, i15 + i17);
            org.telegram.ui.ActionBar.f6.f23298u1.draw(canvas);
            canvas.restore();
        } else if (i12 == 0 && this.B == null) {
            if (this.f35231m && (drawable = (drawableArr = org.telegram.ui.ActionBar.f6.f23242r0)[1]) != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawableArr[1].getIntrinsicHeight();
                if (this.f35230l) {
                    float f15 = intrinsicWidth;
                    float f16 = this.f35234p;
                    intrinsicHeight = (int) (intrinsicHeight * f16);
                    intrinsicWidth = (int) (f15 * f16);
                } else if (intrinsicWidth > width - AndroidUtilities.dp(6.0f) || intrinsicHeight > width - AndroidUtilities.dp(6.0f)) {
                    float dp = width / AndroidUtilities.dp(50.0f);
                    intrinsicWidth = (int) (intrinsicWidth * dp);
                    intrinsicHeight = (int) (intrinsicHeight * dp);
                }
                int i18 = (width - intrinsicWidth) / 2;
                int i19 = (width - intrinsicHeight) / 2;
                drawableArr[1].setBounds(i18, i19, intrinsicWidth + i18, intrinsicHeight + i19);
                drawableArr[1].draw(canvas);
            } else {
                if (this.A) {
                    this.A = false;
                    StringBuilder sb2 = this.f35235q;
                    if (sb2.length() > 0) {
                        CharSequence replaceEmoji = Emoji.replaceEmoji(sb2.toString().toUpperCase(), textPaint.getFontMetricsInt(), true);
                        StaticLayout staticLayout = this.h;
                        if (staticLayout == null || !TextUtils.equals(replaceEmoji, staticLayout.getText())) {
                            try {
                                StaticLayout staticLayout2 = new StaticLayout(replaceEmoji, textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                this.h = staticLayout2;
                                if (staticLayout2.getLineCount() > 0) {
                                    this.f35229k = this.h.getLineLeft(0);
                                    this.f35227i = this.h.getLineWidth(0);
                                    this.f35228j = this.h.getLineBottom(0);
                                }
                            } catch (Exception e10) {
                                FileLog.e(e10);
                            }
                        }
                    } else {
                        this.h = null;
                    }
                }
                if (this.h != null) {
                    float f17 = width;
                    float dp2 = f17 / AndroidUtilities.dp(50.0f);
                    float f18 = f17 / 2.0f;
                    canvas.scale(dp2, dp2, f18, f18);
                    canvas.translate(((f17 - this.f35227i) / 2.0f) - this.f35229k, (f17 - this.f35228j) / 2.0f);
                    this.h.draw(canvas);
                }
            }
        } else {
            Drawable drawable2 = this.B;
            if (drawable2 == null) {
                if (i12 == 1) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[0];
                } else if (i12 == 4) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[2];
                } else if (i12 == 5) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[3];
                } else if (i12 == 6) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[4];
                } else if (i12 == 7) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[5];
                } else if (i12 == 8) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[6];
                } else if (i12 == 9) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[7];
                } else if (i12 == 10) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[8];
                } else if (i12 == 3) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[10];
                } else if (i12 == 12) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[11];
                } else if (i12 == 14) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[12];
                } else if (i12 == 15) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[13];
                } else if (i12 == 16) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[14];
                } else if (i12 == 19) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[15];
                } else if (i12 == 18) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[16];
                } else if (i12 == 20) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[17];
                } else if (i12 == 21) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[18];
                } else if (i12 == 22) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[19];
                } else if (i12 == 23) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[21];
                } else if (i12 == 24) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[20];
                } else if (i12 == 25) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[22];
                } else if (i12 == 26) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[23];
                } else if (i12 == 27) {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[24];
                } else {
                    drawable2 = org.telegram.ui.ActionBar.f6.f23242r0[9];
                }
            }
            if (drawable2 != null) {
                int intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * this.f35234p);
                int intrinsicHeight2 = (int) (drawable2.getIntrinsicHeight() * this.f35234p);
                int i20 = (width - intrinsicWidth2) / 2;
                int i21 = (width - intrinsicHeight2) / 2;
                drawable2.setBounds(i20, i21, intrinsicWidth2 + i20, intrinsicHeight2 + i21);
                int i22 = this.f35242y;
                if (i22 != 255) {
                    drawable2.setAlpha(i22);
                    drawable2.draw(canvas);
                    drawable2.setAlpha(255);
                } else {
                    drawable2.draw(canvas);
                }
            }
        }
        canvas.restore();
    }

    public final void g(int i9) {
        this.f35232n = i9;
        boolean z10 = false;
        this.f35241x = false;
        this.f35223c = false;
        this.f35222b = false;
        if (i9 == 13) {
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.P9, false);
            this.f35224e = w02;
            this.d = w02;
        } else {
            org.telegram.ui.ActionBar.b6 b6Var = this.f35243z;
            if (i9 == 2) {
                int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.N7, b6Var);
                this.f35224e = v02;
                this.d = v02;
            } else if (i9 != 27 && i9 != 12 && i9 != 1 && i9 != 14) {
                if (i9 == 20) {
                    this.f35241x = true;
                    this.f35222b = true;
                    this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.hk, b6Var);
                    this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ik, b6Var);
                } else if (i9 == 3) {
                    this.f35222b = true;
                    this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(5L)], b6Var);
                    this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(5L)], b6Var);
                } else if (i9 == 25) {
                    this.f35222b = true;
                    this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(2L)], b6Var);
                    this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(2L)], b6Var);
                } else if (i9 == 26) {
                    this.f35222b = true;
                    this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(1L)], b6Var);
                    this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(1L)], b6Var);
                } else if (i9 == 4) {
                    this.f35222b = true;
                    this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(5L)], b6Var);
                    this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(5L)], b6Var);
                } else if (i9 == 5) {
                    this.f35222b = true;
                    this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(4L)], b6Var);
                    this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(4L)], b6Var);
                } else if (i9 != 6 && i9 != 23) {
                    if (i9 != 7 && i9 != 24) {
                        if (i9 == 8) {
                            this.f35222b = true;
                            this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(0L)], b6Var);
                            this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(0L)], b6Var);
                        } else if (i9 == 9) {
                            this.f35222b = true;
                            this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(6L)], b6Var);
                            this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(6L)], b6Var);
                        } else if (i9 == 10) {
                            this.f35222b = true;
                            this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(5L)], b6Var);
                            this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(5L)], b6Var);
                        } else if (i9 == 17) {
                            this.f35222b = true;
                            this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(5L)], b6Var);
                            this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(5L)], b6Var);
                        } else if (i9 == 21) {
                            this.f35223c = true;
                            if (this.f35225f == null) {
                                this.f35225f = new z10();
                            }
                            this.f35225f.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i9 == 22) {
                            this.f35223c = true;
                            if (this.f35225f == null) {
                                this.f35225f = new z10();
                            }
                            this.f35225f.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.f35222b = true;
                            this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(4L)], b6Var);
                            this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(4L)], b6Var);
                        }
                    } else {
                        this.f35222b = true;
                        this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(1L)], b6Var);
                        this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(1L)], b6Var);
                    }
                } else {
                    this.f35222b = true;
                    this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(3L)], b6Var);
                    this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(3L)], b6Var);
                }
            } else {
                this.f35222b = true;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.K7, b6Var);
                this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L7, b6Var);
            }
        }
        int i10 = this.f35232n;
        if (i10 != 2 && i10 != 1 && i10 != 20 && i10 != 21 && i10 != 27 && i10 != 12 && i10 != 14) {
            z10 = true;
        }
        this.f35226g = z10;
    }

    @Override
    public final int getIntrinsicHeight() {
        return 0;
    }

    @Override
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    public final void h(int i9) {
        this.f35222b = false;
        this.f35223c = false;
        this.f35224e = i9;
        this.d = i9;
        this.f35226g = false;
    }

    public final void i(int i9, int i10) {
        this.f35222b = true;
        this.f35223c = false;
        this.d = i9;
        this.f35224e = i10;
        this.f35226g = false;
    }

    public final void j(int i9, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            m(i9, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            k(i9, (TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            l(i9, (TLRPC.ChatInvite) tLObject);
        }
    }

    public final void k(int i9, TLRPC.Chat chat) {
        Integer num;
        if (chat != null) {
            long j10 = chat.f22380id;
            String str = chat.title;
            if (chat.color != null) {
                num = Integer.valueOf(ChatObject.getColorId(chat));
            } else {
                num = null;
            }
            o(j10, str, null, num, ChatObject.getPeerColorForAvatar(i9, chat));
        }
    }

    public final void l(int i9, TLRPC.ChatInvite chatInvite) {
        Integer num;
        if (chatInvite != null) {
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            if (chat != null && chat.color != null) {
                num = Integer.valueOf(ChatObject.getColorId(chat));
            } else {
                num = null;
            }
            o(0L, str, null, num, ChatObject.getPeerColorForAvatar(i9, chatInvite.chat));
        }
    }

    public final void m(int i9, TLRPC.User user) {
        Integer num;
        if (user != null) {
            long j10 = user.f22527id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(UserObject.getColorId(user));
            } else {
                num = null;
            }
            o(j10, str, str2, num, UserObject.getPeerColorForAvatar(i9, user));
            this.f35231m = UserObject.isDeleted(user);
        }
    }

    public final void n(long j10, String str, String str2) {
        o(j10, str, str2, null, null);
    }

    public final void o(long j10, String str, String str2, Integer num, MessagesController.PeerColor peerColor) {
        boolean z10 = true;
        this.A = true;
        this.f35222b = true;
        this.f35223c = false;
        if (peerColor != null) {
            this.d = peerColor.getAvatarColor1();
            this.f35224e = peerColor.getAvatarColor2();
        } else if (num != null) {
            s(num.intValue());
        } else {
            int i9 = org.telegram.ui.ActionBar.f6.f23213p8[e(j10)];
            org.telegram.ui.ActionBar.b6 b6Var = this.f35243z;
            this.d = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
            this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(j10)], b6Var);
        }
        if (j10 != 5) {
            z10 = false;
        }
        this.f35226g = z10;
        this.f35232n = 0;
        this.f35231m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f35235q);
    }

    public final void p(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            r((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            q((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            l(UserConfig.selectedAccount, (TLRPC.ChatInvite) tLObject);
        }
    }

    public final void q(TLRPC.Chat chat) {
        k(UserConfig.selectedAccount, chat);
    }

    public final void r(TLRPC.User user) {
        m(UserConfig.selectedAccount, user);
    }

    public final void s(int i9) {
        MessagesController.PeerColors peerColors;
        z10 z10Var = this.f35225f;
        if (z10Var != null) {
            this.f35222b = false;
            this.f35223c = true;
        } else {
            this.f35222b = true;
            this.f35223c = false;
        }
        int[][] iArr = C;
        org.telegram.ui.ActionBar.b6 b6Var = this.f35243z;
        if (i9 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            if (messagesController != null && (peerColors = messagesController.peerColors) != null && peerColors.getColor(i9) != null) {
                int color1 = messagesController.peerColors.getColor(i9).getColor1();
                if (this.f35225f != null) {
                    int[] iArr2 = iArr[f(color1)];
                    this.f35225f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[f(color1)], b6Var);
                this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[f(color1)], b6Var);
            } else if (this.f35225f != null) {
                int[] iArr3 = iArr[e(i9)];
                this.f35225f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j10 = i9;
                this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(j10)], b6Var);
                this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(j10)], b6Var);
            }
        } else if (z10Var != null) {
            int[] iArr4 = iArr[e(i9)];
            this.f35225f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j11 = i9;
            this.d = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23213p8[e(j11)], b6Var);
            this.f35224e = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23231q8[e(j11)], b6Var);
        }
    }

    @Override
    public final void setAlpha(int i9) {
        this.f35242y = i9;
    }

    public final void t() {
        this.f35230l = true;
    }

    public final void u(int i9) {
        this.f35221a.setTextSize(i9);
    }

    public z8(int i9, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.b6) null);
        this.f35230l = false;
        if (user != null) {
            o(user.f22527id, user.first_name, user.last_name, null, null);
            this.f35231m = UserObject.isDeleted(user);
        }
    }

    public z8(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.b6) null);
        this.f35230l = false;
        q(chat);
    }

    public z8(org.telegram.ui.ActionBar.b6 b6Var) {
        this.f35234p = 1.0f;
        this.f35235q = new StringBuilder(5);
        this.f35236r = -1;
        this.f35240w = true;
        this.f35241x = false;
        this.f35242y = 255;
        this.f35243z = b6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f35221a = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

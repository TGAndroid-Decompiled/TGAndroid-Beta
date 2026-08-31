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
    public final TextPaint f33790a;
    public boolean f33791b;
    public boolean f33792c;
    public int d;
    public int f33793e;
    public q20 f33794f;
    public boolean f33795g;
    public StaticLayout h;
    public float f33796i;
    public float f33797j;
    public float f33798k;
    public boolean f33799l;
    public boolean f33800m;
    public int f33801n;
    public float f33802o;
    public float f33803p;
    public final StringBuilder f33804q;
    public int f33805r;
    public int f33806s;
    public int f33807t;
    public int f33808u;
    public LinearGradient v;
    public boolean f33809w;
    public boolean f33810x;
    public int f33811y;
    public final org.telegram.ui.ActionBar.g6 f33812z;

    public z8() {
        this((org.telegram.ui.ActionBar.g6) null);
    }

    public static void a(String str, String str2, String str3, StringBuilder sb) {
        sb.setLength(0);
        if (str3 != null) {
            sb.append(str3);
            return;
        }
        if (str != null && str.length() > 0) {
            sb.append(v(str));
        }
        if (str2 != null && str2.length() > 0) {
            int lastIndexOf = str2.lastIndexOf(32);
            if (lastIndexOf >= 0) {
                str2 = str2.substring(lastIndexOf + 1);
            }
            sb.append("\u200c");
            sb.append(v(str2));
        } else if (str != null && str.length() > 0) {
            for (int length = str.length() - 1; length >= 0; length--) {
                if (str.charAt(length) == ' ' && length != str.length() - 1 && str.charAt(length + 1) != ' ') {
                    int length2 = sb.length();
                    sb.append("\u200c");
                    sb.append(v(str.substring(length2)));
                    return;
                }
            }
        }
    }

    public static int d(long j10) {
        return org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21877p8[e(j10)], false);
    }

    public static int e(long j10) {
        return (int) Math.abs(j10 % org.telegram.ui.ActionBar.k6.f21877p8.length);
    }

    public static int f(int i10) {
        float[] M0 = org.telegram.ui.ActionBar.k6.M0(5);
        Color.colorToHSV(i10, M0);
        int i11 = (int) M0[0];
        if (i11 >= 345 || i11 < 29) {
            return 0;
        }
        if (i11 < 67) {
            return 1;
        }
        if (i11 < 140) {
            return 3;
        }
        if (i11 < 199) {
            return 4;
        }
        if (i11 < 234) {
            return 5;
        }
        if (i11 < 301) {
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
        if (this.f33795g) {
            int i10 = this.d;
            int i11 = 0;
            org.telegram.ui.ActionBar.i6 k10 = org.telegram.ui.ActionBar.k6.I.k(false);
            org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
            if (k10 != null) {
                i11 = k10.f21469c;
            }
            return org.telegram.ui.ActionBar.k6.B(j6Var, i11, i10);
        }
        return this.d;
    }

    public final int c() {
        if (this.f33795g) {
            int i10 = this.f33793e;
            int i11 = 0;
            org.telegram.ui.ActionBar.i6 k10 = org.telegram.ui.ActionBar.k6.I.k(false);
            org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
            if (k10 != null) {
                i11 = k10.f21469c;
            }
            return org.telegram.ui.ActionBar.k6.B(j6Var, i11, i10);
        }
        return this.f33793e;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable[] drawableArr;
        Drawable drawable;
        q20 q20Var;
        int i10;
        int i11;
        Rect bounds = getBounds();
        if (bounds == null) {
            return;
        }
        int width = bounds.width();
        int i12 = org.telegram.ui.ActionBar.k6.J7;
        org.telegram.ui.ActionBar.g6 g6Var = this.f33812z;
        int k10 = i0.a.k(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), this.f33811y);
        TextPaint textPaint = this.f33790a;
        textPaint.setColor(k10);
        Paint paint = org.telegram.ui.ActionBar.k6.f21888q0;
        if (this.f33792c && (q20Var = this.f33794f) != null) {
            q20Var.b(bounds.left, bounds.top, i10 + width, i11 + width);
            paint = this.f33794f.f30254c;
        } else if (this.f33791b) {
            int k11 = i0.a.k(b(), this.f33811y);
            int k12 = i0.a.k(c(), this.f33811y);
            if (this.v == null || this.f33806s != bounds.height() || this.f33807t != k11 || this.f33808u != k12) {
                int height = bounds.height();
                this.f33806s = height;
                this.f33807t = k11;
                this.f33808u = k12;
                this.v = new LinearGradient(0.0f, 0.0f, 0.0f, height, k11, k12, Shader.TileMode.CLAMP);
            }
            paint.setShader(this.v);
            paint.setAlpha(this.f33811y);
        } else {
            paint.setShader(null);
            paint.setColor(i0.a.k(b(), this.f33811y));
        }
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        if (this.f33809w) {
            if (this.f33810x) {
                canvas.save();
                float f10 = width / 2.0f;
                canvas.rotate(-45.0f, f10, f10);
            }
            if (this.f33805r > 0) {
                RectF rectF = AndroidUtilities.rectTmp;
                float f11 = width;
                rectF.set(0.0f, 0.0f, f11, f11);
                float f12 = this.f33805r;
                canvas.drawRoundRect(rectF, f12, f12, paint);
            } else {
                float f13 = width / 2.0f;
                canvas.drawCircle(f13, f13, f13, paint);
            }
            if (this.f33810x) {
                canvas.restore();
            }
        }
        int i13 = this.f33801n;
        if (i13 == 2) {
            if (this.f33802o != 0.0f) {
                int i14 = org.telegram.ui.ActionBar.k6.M7;
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(i14, g6Var), this.f33811y));
                float f14 = width / 2.0f;
                canvas.drawCircle(f14, f14, this.f33802o * f14, paint);
                if (org.telegram.ui.ActionBar.k6.C1) {
                    ij0 ij0Var = org.telegram.ui.ActionBar.k6.f21956u1;
                    ij0Var.X = true;
                    ij0Var.O(org.telegram.ui.ActionBar.k6.w0(null, i14, true), "Arrow1");
                    org.telegram.ui.ActionBar.k6.f21956u1.O(org.telegram.ui.ActionBar.k6.w0(null, i14, true), "Arrow2");
                    org.telegram.ui.ActionBar.k6.f21956u1.m();
                    org.telegram.ui.ActionBar.k6.C1 = false;
                }
            } else if (!org.telegram.ui.ActionBar.k6.C1) {
                ij0 ij0Var2 = org.telegram.ui.ActionBar.k6.f21956u1;
                ij0Var2.X = true;
                ij0Var2.O(this.d, "Arrow1");
                org.telegram.ui.ActionBar.k6.f21956u1.O(this.d, "Arrow2");
                org.telegram.ui.ActionBar.k6.f21956u1.m();
                org.telegram.ui.ActionBar.k6.C1 = true;
            }
            ij0 ij0Var3 = org.telegram.ui.ActionBar.k6.f21956u1;
            int i15 = ij0Var3.f27812b;
            int i16 = ij0Var3.f27814c;
            int i17 = (width - i15) / 2;
            int i18 = (width - i16) / 2;
            canvas.save();
            org.telegram.ui.ActionBar.k6.f21956u1.setBounds(i17, i18, i15 + i17, i16 + i18);
            org.telegram.ui.ActionBar.k6.f21956u1.draw(canvas);
            canvas.restore();
        } else if (i13 == 0 && this.B == null) {
            if (this.f33800m && (drawable = (drawableArr = org.telegram.ui.ActionBar.k6.f21906r0)[1]) != null) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawableArr[1].getIntrinsicHeight();
                if (this.f33799l) {
                    float f15 = intrinsicWidth;
                    float f16 = this.f33803p;
                    intrinsicHeight = (int) (intrinsicHeight * f16);
                    intrinsicWidth = (int) (f15 * f16);
                } else if (intrinsicWidth > width - AndroidUtilities.dp(6.0f) || intrinsicHeight > width - AndroidUtilities.dp(6.0f)) {
                    float dp = width / AndroidUtilities.dp(50.0f);
                    intrinsicWidth = (int) (intrinsicWidth * dp);
                    intrinsicHeight = (int) (intrinsicHeight * dp);
                }
                int i19 = (width - intrinsicWidth) / 2;
                int i20 = (width - intrinsicHeight) / 2;
                drawableArr[1].setBounds(i19, i20, intrinsicWidth + i19, intrinsicHeight + i20);
                drawableArr[1].draw(canvas);
            } else {
                if (this.A) {
                    this.A = false;
                    StringBuilder sb = this.f33804q;
                    if (sb.length() > 0) {
                        CharSequence replaceEmoji = Emoji.replaceEmoji(sb.toString().toUpperCase(), textPaint.getFontMetricsInt(), true);
                        StaticLayout staticLayout = this.h;
                        if (staticLayout == null || !TextUtils.equals(replaceEmoji, staticLayout.getText())) {
                            try {
                                StaticLayout staticLayout2 = new StaticLayout(replaceEmoji, textPaint, AndroidUtilities.dp(100.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                                this.h = staticLayout2;
                                if (staticLayout2.getLineCount() > 0) {
                                    this.f33798k = this.h.getLineLeft(0);
                                    this.f33796i = this.h.getLineWidth(0);
                                    this.f33797j = this.h.getLineBottom(0);
                                }
                            } catch (Exception e6) {
                                FileLog.e(e6);
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
                    canvas.translate(((f17 - this.f33796i) / 2.0f) - this.f33798k, (f17 - this.f33797j) / 2.0f);
                    this.h.draw(canvas);
                }
            }
        } else {
            Drawable drawable2 = this.B;
            if (drawable2 == null) {
                if (i13 == 1) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[0];
                } else if (i13 == 4) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[2];
                } else if (i13 == 5) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[3];
                } else if (i13 == 6) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[4];
                } else if (i13 == 7) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[5];
                } else if (i13 == 8) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[6];
                } else if (i13 == 9) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[7];
                } else if (i13 == 10) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[8];
                } else if (i13 == 3) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[10];
                } else if (i13 == 12) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[11];
                } else if (i13 == 14) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[12];
                } else if (i13 == 15) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[13];
                } else if (i13 == 16) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[14];
                } else if (i13 == 19) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[15];
                } else if (i13 == 18) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[16];
                } else if (i13 == 20) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[17];
                } else if (i13 == 21) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[18];
                } else if (i13 == 22) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[19];
                } else if (i13 == 23) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[21];
                } else if (i13 == 24) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[20];
                } else if (i13 == 25) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[22];
                } else if (i13 == 26) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[23];
                } else if (i13 == 27) {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[24];
                } else {
                    drawable2 = org.telegram.ui.ActionBar.k6.f21906r0[9];
                }
            }
            if (drawable2 != null) {
                int intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * this.f33803p);
                int intrinsicHeight2 = (int) (drawable2.getIntrinsicHeight() * this.f33803p);
                int i21 = (width - intrinsicWidth2) / 2;
                int i22 = (width - intrinsicHeight2) / 2;
                drawable2.setBounds(i21, i22, intrinsicWidth2 + i21, intrinsicHeight2 + i22);
                int i23 = this.f33811y;
                if (i23 != 255) {
                    drawable2.setAlpha(i23);
                    drawable2.draw(canvas);
                    drawable2.setAlpha(255);
                } else {
                    drawable2.draw(canvas);
                }
            }
        }
        canvas.restore();
    }

    public final void g(int i10) {
        this.f33801n = i10;
        boolean z4 = false;
        this.f33810x = false;
        this.f33792c = false;
        this.f33791b = false;
        if (i10 == 13) {
            int w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.P9, false);
            this.f33793e = w02;
            this.d = w02;
        } else {
            org.telegram.ui.ActionBar.g6 g6Var = this.f33812z;
            if (i10 == 2) {
                int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.N7, g6Var);
                this.f33793e = v02;
                this.d = v02;
            } else if (i10 != 27 && i10 != 12 && i10 != 1 && i10 != 14) {
                if (i10 == 20) {
                    this.f33810x = true;
                    this.f33791b = true;
                    this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.hk, g6Var);
                    this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ik, g6Var);
                } else if (i10 == 3) {
                    this.f33791b = true;
                    this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(5L)], g6Var);
                    this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(5L)], g6Var);
                } else if (i10 == 25) {
                    this.f33791b = true;
                    this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(2L)], g6Var);
                    this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(2L)], g6Var);
                } else if (i10 == 26) {
                    this.f33791b = true;
                    this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(1L)], g6Var);
                    this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(1L)], g6Var);
                } else if (i10 == 4) {
                    this.f33791b = true;
                    this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(5L)], g6Var);
                    this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(5L)], g6Var);
                } else if (i10 == 5) {
                    this.f33791b = true;
                    this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(4L)], g6Var);
                    this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(4L)], g6Var);
                } else if (i10 != 6 && i10 != 23) {
                    if (i10 != 7 && i10 != 24) {
                        if (i10 == 8) {
                            this.f33791b = true;
                            this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(0L)], g6Var);
                            this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(0L)], g6Var);
                        } else if (i10 == 9) {
                            this.f33791b = true;
                            this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(6L)], g6Var);
                            this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(6L)], g6Var);
                        } else if (i10 == 10) {
                            this.f33791b = true;
                            this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(5L)], g6Var);
                            this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(5L)], g6Var);
                        } else if (i10 == 17) {
                            this.f33791b = true;
                            this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(5L)], g6Var);
                            this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(5L)], g6Var);
                        } else if (i10 == 21) {
                            this.f33792c = true;
                            if (this.f33794f == null) {
                                this.f33794f = new q20();
                            }
                            this.f33794f.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i10 == 22) {
                            this.f33792c = true;
                            if (this.f33794f == null) {
                                this.f33794f = new q20();
                            }
                            this.f33794f.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.f33791b = true;
                            this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(4L)], g6Var);
                            this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(4L)], g6Var);
                        }
                    } else {
                        this.f33791b = true;
                        this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(1L)], g6Var);
                        this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(1L)], g6Var);
                    }
                } else {
                    this.f33791b = true;
                    this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(3L)], g6Var);
                    this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(3L)], g6Var);
                }
            } else {
                this.f33791b = true;
                this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.K7, g6Var);
                this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L7, g6Var);
            }
        }
        int i11 = this.f33801n;
        if (i11 != 2 && i11 != 1 && i11 != 20 && i11 != 21 && i11 != 27 && i11 != 12 && i11 != 14) {
            z4 = true;
        }
        this.f33795g = z4;
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

    public final void h(int i10) {
        this.f33791b = false;
        this.f33792c = false;
        this.f33793e = i10;
        this.d = i10;
        this.f33795g = false;
    }

    public final void i(int i10, int i11) {
        this.f33791b = true;
        this.f33792c = false;
        this.d = i10;
        this.f33793e = i11;
        this.f33795g = false;
    }

    public final void j(int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            m(i10, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            k(i10, (TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            l(i10, (TLRPC.ChatInvite) tLObject);
        }
    }

    public final void k(int i10, TLRPC.Chat chat) {
        Integer num;
        if (chat != null) {
            long j10 = chat.f20843id;
            String str = chat.title;
            if (chat.color != null) {
                num = Integer.valueOf(ChatObject.getColorId(chat));
            } else {
                num = null;
            }
            o(j10, str, null, num, ChatObject.getPeerColorForAvatar(i10, chat));
        }
    }

    public final void l(int i10, TLRPC.ChatInvite chatInvite) {
        Integer num;
        if (chatInvite != null) {
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            if (chat != null && chat.color != null) {
                num = Integer.valueOf(ChatObject.getColorId(chat));
            } else {
                num = null;
            }
            o(0L, str, null, num, ChatObject.getPeerColorForAvatar(i10, chatInvite.chat));
        }
    }

    public final void m(int i10, TLRPC.User user) {
        Integer num;
        if (user != null) {
            long j10 = user.f20990id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(UserObject.getColorId(user));
            } else {
                num = null;
            }
            o(j10, str, str2, num, UserObject.getPeerColorForAvatar(i10, user));
            this.f33800m = UserObject.isDeleted(user);
        }
    }

    public final void n(long j10, String str, String str2) {
        o(j10, str, str2, null, null);
    }

    public final void o(long j10, String str, String str2, Integer num, MessagesController.PeerColor peerColor) {
        boolean z4 = true;
        this.A = true;
        this.f33791b = true;
        this.f33792c = false;
        if (peerColor != null) {
            this.d = peerColor.getAvatarColor1();
            this.f33793e = peerColor.getAvatarColor2();
        } else if (num != null) {
            s(num.intValue());
        } else {
            int i10 = org.telegram.ui.ActionBar.k6.f21877p8[e(j10)];
            org.telegram.ui.ActionBar.g6 g6Var = this.f33812z;
            this.d = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
            this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(j10)], g6Var);
        }
        if (j10 != 5) {
            z4 = false;
        }
        this.f33795g = z4;
        this.f33801n = 0;
        this.f33800m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f33804q);
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

    public final void s(int i10) {
        MessagesController.PeerColors peerColors;
        q20 q20Var = this.f33794f;
        if (q20Var != null) {
            this.f33791b = false;
            this.f33792c = true;
        } else {
            this.f33791b = true;
            this.f33792c = false;
        }
        int[][] iArr = C;
        org.telegram.ui.ActionBar.g6 g6Var = this.f33812z;
        if (i10 >= 14) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            if (messagesController != null && (peerColors = messagesController.peerColors) != null && peerColors.getColor(i10) != null) {
                int color1 = messagesController.peerColors.getColor(i10).getColor1();
                if (this.f33794f != null) {
                    int[] iArr2 = iArr[f(color1)];
                    this.f33794f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[f(color1)], g6Var);
                this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[f(color1)], g6Var);
            } else if (this.f33794f != null) {
                int[] iArr3 = iArr[e(i10)];
                this.f33794f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j10 = i10;
                this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(j10)], g6Var);
                this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(j10)], g6Var);
            }
        } else if (q20Var != null) {
            int[] iArr4 = iArr[e(i10)];
            this.f33794f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j11 = i10;
            this.d = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21877p8[e(j11)], g6Var);
            this.f33793e = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21896q8[e(j11)], g6Var);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f33811y = i10;
    }

    public final void t() {
        this.f33799l = true;
    }

    public final void u(int i10) {
        this.f33790a.setTextSize(i10);
    }

    public z8(int i10, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.g6) null);
        this.f33799l = false;
        if (user != null) {
            o(user.f20990id, user.first_name, user.last_name, null, null);
            this.f33800m = UserObject.isDeleted(user);
        }
    }

    public z8(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.g6) null);
        this.f33799l = false;
        q(chat);
    }

    public z8(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f33803p = 1.0f;
        this.f33804q = new StringBuilder(5);
        this.f33805r = -1;
        this.f33809w = true;
        this.f33810x = false;
        this.f33811y = 255;
        this.f33812z = g6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f33790a = textPaint;
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dp(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

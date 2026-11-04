package org.telegram.ui.Components;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class u8 extends Drawable {
    public static final int[][] L = {new int[]{-636796, -1090751, -612560, -35006}, new int[]{-693938, -690388, -11246, -22717}, new int[]{-8160001, -5217281, -36183, -1938945}, new int[]{-16133536, -10560448, -4070106, -8331477}, new int[]{-10569989, -14692629, -12191817, -14683687}, new int[]{-11694593, -13910017, -14622003, -15801871}, new int[]{-439392, -304000, -19910, -98718}};
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public Drawable K;
    public final TextPaint f38678a;
    public boolean f38679b;
    public boolean f38680c;
    public int d;
    public int f38681e;
    public b10 f38682f;
    public boolean f38683g;
    public StaticLayout h;
    public float f38684i;
    public float f38685j;
    public float f38686k;
    public boolean f38687l;
    public boolean f38688m;
    public int f38689n;
    public float f38690o;
    public float f38691p;
    public final StringBuilder f38692q;
    public int f38693r;
    public int f38694s;
    public int f38695t;
    public int f38696u;
    public LinearGradient v;
    public boolean f38697w;
    public boolean f38698x;
    public int f38699y;
    public final org.telegram.ui.ActionBar.e6 f38700z;

    public u8() {
        this((org.telegram.ui.ActionBar.e6) null);
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
        return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28103p8[e(j10)], false);
    }

    public static int e(long j10) {
        return (int) Math.abs(j10 % org.telegram.ui.ActionBar.k6.f28103p8.length);
    }

    public static int f(int i3) {
        float[] P0 = org.telegram.ui.ActionBar.k6.P0(5);
        Color.colorToHSV(i3, P0);
        int i10 = (int) P0[0];
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
        ArrayList j10 = org.telegram.messenger.i6.j(str, null);
        if (!j10.isEmpty() && ((org.telegram.messenger.g6) j10.get(0)).f22667a == 0) {
            return str.substring(0, ((org.telegram.messenger.g6) j10.get(0)).f22668b);
        }
        return str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1)));
    }

    public final int b() {
        if (this.f38683g) {
            int i3 = this.d;
            int i10 = 0;
            org.telegram.ui.ActionBar.g6 k10 = org.telegram.ui.ActionBar.k6.I.k(false);
            org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
            if (k10 != null) {
                i10 = k10.f27527c;
            }
            return org.telegram.ui.ActionBar.k6.C(j6Var, i10, i3);
        }
        return this.d;
    }

    public final int c() {
        if (this.f38683g) {
            int i3 = this.f38681e;
            int i10 = 0;
            org.telegram.ui.ActionBar.g6 k10 = org.telegram.ui.ActionBar.k6.I.k(false);
            org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
            if (k10 != null) {
                i10 = k10.f27527c;
            }
            return org.telegram.ui.ActionBar.k6.C(j6Var, i10, i3);
        }
        return this.f38681e;
    }

    @Override
    public final void draw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.u8.draw(android.graphics.Canvas):void");
    }

    public final void g(int i3) {
        boolean z10;
        this.f38689n = i3;
        boolean z11 = false;
        this.f38698x = false;
        this.f38680c = false;
        this.f38679b = false;
        if (i3 == 13) {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.P9, false);
            this.f38681e = x02;
            this.d = x02;
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.f38700z;
            if (i3 == 2) {
                int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.N7, e6Var);
                this.f38681e = w02;
                this.d = w02;
            } else if (i3 != 27 && i3 != 12 && i3 != 1 && i3 != 14) {
                if (i3 == 20) {
                    this.f38698x = true;
                    this.f38679b = true;
                    this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Vk, e6Var);
                    this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Wk, e6Var);
                } else if (i3 == 3) {
                    this.f38679b = true;
                    this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(5L)], e6Var);
                    this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(5L)], e6Var);
                } else if (i3 == 25) {
                    this.f38679b = true;
                    this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(2L)], e6Var);
                    this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(2L)], e6Var);
                } else if (i3 == 26) {
                    this.f38679b = true;
                    this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(1L)], e6Var);
                    this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(1L)], e6Var);
                } else if (i3 == 4) {
                    this.f38679b = true;
                    this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(5L)], e6Var);
                    this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(5L)], e6Var);
                } else if (i3 == 5) {
                    this.f38679b = true;
                    this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(4L)], e6Var);
                    this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(4L)], e6Var);
                } else if (i3 != 6 && i3 != 23) {
                    if (i3 != 7 && i3 != 24) {
                        if (i3 == 8) {
                            this.f38679b = true;
                            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(0L)], e6Var);
                            this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(0L)], e6Var);
                        } else if (i3 == 9) {
                            this.f38679b = true;
                            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(6L)], e6Var);
                            this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(6L)], e6Var);
                        } else if (i3 == 10) {
                            this.f38679b = true;
                            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(5L)], e6Var);
                            this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(5L)], e6Var);
                        } else if (i3 == 17) {
                            this.f38679b = true;
                            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(5L)], e6Var);
                            this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(5L)], e6Var);
                        } else if (i3 == 21) {
                            this.f38680c = true;
                            if (this.f38682f == null) {
                                this.f38682f = new b10();
                            }
                            this.f38682f.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i3 == 22) {
                            this.f38680c = true;
                            if (this.f38682f == null) {
                                this.f38682f = new b10();
                            }
                            this.f38682f.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.f38679b = true;
                            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(4L)], e6Var);
                            this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(4L)], e6Var);
                        }
                    } else {
                        this.f38679b = true;
                        this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(1L)], e6Var);
                        this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(1L)], e6Var);
                    }
                } else {
                    this.f38679b = true;
                    this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(3L)], e6Var);
                    this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(3L)], e6Var);
                }
            } else {
                this.f38679b = true;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.K7, e6Var);
                this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.L7, e6Var);
            }
        }
        int i10 = this.f38689n;
        if (i10 != 2 && i10 != 1 && i10 != 20 && i10 != 21 && i10 != 27 && i10 != 12 && i10 != 14) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38683g = z10;
        if (i10 == 13 || i10 == 2 || i10 == 27 || i10 == 12 || i10 == 1 || i10 == 14 || i10 == 20) {
            z11 = true;
        }
        this.G = z11;
        this.H = this.d;
        this.I = this.f38681e;
        this.J = org.telegram.ui.ActionBar.r6.f28515b;
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

    public final void h(int i3) {
        this.f38679b = false;
        this.f38680c = false;
        this.f38681e = i3;
        this.d = i3;
        this.f38683g = false;
    }

    public final void i(int i3, int i10) {
        this.f38679b = true;
        this.f38680c = false;
        this.d = i3;
        this.f38681e = i10;
        this.f38683g = false;
    }

    public final void j(long j10, String str, String str2) {
        k(j10, str, str2, null);
    }

    public final void k(long j10, String str, String str2, Integer num) {
        boolean z10 = true;
        this.A = true;
        this.f38679b = true;
        this.f38680c = false;
        if (num != null) {
            s(num.intValue());
        } else {
            int i3 = org.telegram.ui.ActionBar.k6.f28103p8[e(j10)];
            org.telegram.ui.ActionBar.e6 e6Var = this.f38700z;
            this.d = org.telegram.ui.ActionBar.k6.w0(i3, e6Var);
            this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(j10)], e6Var);
            this.C = e(j10);
            this.D = this.d;
            this.E = this.f38681e;
            this.B = true;
            this.F = org.telegram.ui.ActionBar.r6.f28515b;
        }
        if (j10 != 5) {
            z10 = false;
        }
        this.f38683g = z10;
        this.f38689n = 0;
        this.f38688m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f38692q);
    }

    public final void l(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            r((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            q((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            n((TLRPC.ChatInvite) tLObject);
        }
    }

    public final void m(TLRPC.Chat chat) {
        q(chat);
    }

    public final void n(TLRPC.ChatInvite chatInvite) {
        Integer num;
        if (chatInvite != null) {
            String str = chatInvite.title;
            TLRPC.Chat chat = chatInvite.chat;
            if (chat != null && chat.color != null) {
                num = Integer.valueOf(org.telegram.messenger.t3.F(chat));
            } else {
                num = null;
            }
            k(0L, str, null, num);
        }
    }

    public final void o(TLRPC.User user) {
        r(user);
    }

    public final void p(TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            r((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            q((TLRPC.Chat) tLObject);
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            n((TLRPC.ChatInvite) tLObject);
        }
    }

    public final void q(TLRPC.Chat chat) {
        Integer num;
        if (chat != null) {
            long j10 = chat.f27001id;
            String str = chat.title;
            if (chat.color != null) {
                num = Integer.valueOf(org.telegram.messenger.t3.F(chat));
            } else {
                num = null;
            }
            k(j10, str, null, num);
        }
    }

    public final void r(TLRPC.User user) {
        Integer num;
        if (user != null) {
            long j10 = user.f27150id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(org.telegram.messenger.l10.e(user));
            } else {
                num = null;
            }
            k(j10, str, str2, num);
            this.f38688m = org.telegram.messenger.l10.x(user);
        }
    }

    public final void s(int i3) {
        b10 b10Var = this.f38682f;
        if (b10Var != null) {
            this.f38679b = false;
            this.f38680c = true;
        } else {
            this.f38679b = true;
            this.f38680c = false;
        }
        int[][] iArr = L;
        org.telegram.ui.ActionBar.e6 e6Var = this.f38700z;
        if (i3 >= 14) {
            org.telegram.messenger.hp s12 = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0);
            org.telegram.messenger.xo xoVar = s12.f23099q4;
            if (xoVar != null && xoVar.d(i3) != null) {
                int f10 = s12.f23099q4.d(i3).f();
                if (this.f38682f != null) {
                    int[] iArr2 = iArr[f(f10)];
                    this.f38682f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[f(f10)], e6Var);
                this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[f(f10)], e6Var);
            } else if (this.f38682f != null) {
                int[] iArr3 = iArr[e(i3)];
                this.f38682f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j10 = i3;
                this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(j10)], e6Var);
                this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(j10)], e6Var);
            }
        } else if (b10Var != null) {
            int[] iArr4 = iArr[e(i3)];
            this.f38682f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j11 = i3;
            this.d = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[e(j11)], e6Var);
            this.f38681e = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[e(j11)], e6Var);
        }
    }

    @Override
    public final void setAlpha(int i3) {
        this.f38699y = i3;
    }

    public final void t() {
        this.f38687l = true;
    }

    public final void u(int i3) {
        this.f38678a.setTextSize(i3);
    }

    public u8(int i3, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.e6) null);
        this.f38687l = false;
        if (user != null) {
            k(user.f27150id, user.first_name, user.last_name, null);
            this.f38688m = org.telegram.messenger.l10.x(user);
        }
    }

    public u8(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.e6) null);
        this.f38687l = false;
        q(chat);
    }

    public u8(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f38691p = 1.0f;
        this.f38692q = new StringBuilder(5);
        this.f38693r = -1;
        this.f38697w = true;
        this.f38698x = false;
        this.f38699y = 255;
        this.f38700z = e6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f38678a = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

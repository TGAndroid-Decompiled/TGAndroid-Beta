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
public class t8 extends Drawable {
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
    public final TextPaint f39587a;
    public boolean f39588b;
    public boolean f39589c;
    public int d;
    public int f39590e;
    public i10 f39591f;
    public boolean f39592g;
    public StaticLayout h;
    public float f39593i;
    public float f39594j;
    public float f39595k;
    public boolean f39596l;
    public boolean f39597m;
    public int f39598n;
    public float f39599o;
    public float f39600p;
    public final StringBuilder f39601q;
    public int f39602r;
    public int f39603s;
    public int f39604t;
    public int f39605u;
    public LinearGradient v;
    public boolean f39606w;
    public boolean f39607x;
    public int f39608y;
    public final org.telegram.ui.ActionBar.e6 f39609z;

    public t8() {
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

    public static int d(long j3) {
        return org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29071p8[e(j3)], false);
    }

    public static int e(long j3) {
        return (int) Math.abs(j3 % org.telegram.ui.ActionBar.j6.f29071p8.length);
    }

    public static int f(int i7) {
        float[] P0 = org.telegram.ui.ActionBar.j6.P0(5);
        Color.colorToHSV(i7, P0);
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
        ArrayList j3 = org.telegram.messenger.j6.j(str, null);
        if (!j3.isEmpty() && ((org.telegram.messenger.h6) j3.get(0)).f24057a == 0) {
            return str.substring(0, ((org.telegram.messenger.h6) j3.get(0)).f24058b);
        }
        return str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1)));
    }

    public final int b() {
        if (this.f39592g) {
            int i7 = this.d;
            int i10 = 0;
            org.telegram.ui.ActionBar.g6 k10 = org.telegram.ui.ActionBar.j6.I.k(false);
            org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
            if (k10 != null) {
                i10 = k10.f28604c;
            }
            return org.telegram.ui.ActionBar.j6.C(i6Var, i10, i7);
        }
        return this.d;
    }

    public final int c() {
        if (this.f39592g) {
            int i7 = this.f39590e;
            int i10 = 0;
            org.telegram.ui.ActionBar.g6 k10 = org.telegram.ui.ActionBar.j6.I.k(false);
            org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
            if (k10 != null) {
                i10 = k10.f28604c;
            }
            return org.telegram.ui.ActionBar.j6.C(i6Var, i10, i7);
        }
        return this.f39590e;
    }

    @Override
    public final void draw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.t8.draw(android.graphics.Canvas):void");
    }

    public final void g(int i7) {
        boolean z10;
        this.f39598n = i7;
        boolean z11 = false;
        this.f39607x = false;
        this.f39589c = false;
        this.f39588b = false;
        if (i7 == 13) {
            int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.P9, false);
            this.f39590e = x02;
            this.d = x02;
        } else {
            org.telegram.ui.ActionBar.e6 e6Var = this.f39609z;
            if (i7 == 2) {
                int w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.N7, e6Var);
                this.f39590e = w02;
                this.d = w02;
            } else if (i7 != 27 && i7 != 12 && i7 != 1 && i7 != 14) {
                if (i7 == 20) {
                    this.f39607x = true;
                    this.f39588b = true;
                    this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Yk, e6Var);
                    this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Zk, e6Var);
                } else if (i7 == 3) {
                    this.f39588b = true;
                    this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(5L)], e6Var);
                    this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(5L)], e6Var);
                } else if (i7 == 25) {
                    this.f39588b = true;
                    this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(2L)], e6Var);
                    this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(2L)], e6Var);
                } else if (i7 == 26) {
                    this.f39588b = true;
                    this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(1L)], e6Var);
                    this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(1L)], e6Var);
                } else if (i7 == 4) {
                    this.f39588b = true;
                    this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(5L)], e6Var);
                    this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(5L)], e6Var);
                } else if (i7 == 5) {
                    this.f39588b = true;
                    this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(4L)], e6Var);
                    this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(4L)], e6Var);
                } else if (i7 != 6 && i7 != 23) {
                    if (i7 != 7 && i7 != 24) {
                        if (i7 == 8) {
                            this.f39588b = true;
                            this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(0L)], e6Var);
                            this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(0L)], e6Var);
                        } else if (i7 == 9) {
                            this.f39588b = true;
                            this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(6L)], e6Var);
                            this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(6L)], e6Var);
                        } else if (i7 == 10) {
                            this.f39588b = true;
                            this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(5L)], e6Var);
                            this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(5L)], e6Var);
                        } else if (i7 == 17) {
                            this.f39588b = true;
                            this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(5L)], e6Var);
                            this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(5L)], e6Var);
                        } else if (i7 == 21) {
                            this.f39589c = true;
                            if (this.f39591f == null) {
                                this.f39591f = new i10();
                            }
                            this.f39591f.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i7 == 22) {
                            this.f39589c = true;
                            if (this.f39591f == null) {
                                this.f39591f = new i10();
                            }
                            this.f39591f.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.f39588b = true;
                            this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(4L)], e6Var);
                            this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(4L)], e6Var);
                        }
                    } else {
                        this.f39588b = true;
                        this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(1L)], e6Var);
                        this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(1L)], e6Var);
                    }
                } else {
                    this.f39588b = true;
                    this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(3L)], e6Var);
                    this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(3L)], e6Var);
                }
            } else {
                this.f39588b = true;
                this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.K7, e6Var);
                this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.L7, e6Var);
            }
        }
        int i10 = this.f39598n;
        if (i10 != 2 && i10 != 1 && i10 != 20 && i10 != 21 && i10 != 27 && i10 != 12 && i10 != 14) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f39592g = z10;
        if (i10 == 13 || i10 == 2 || i10 == 27 || i10 == 12 || i10 == 1 || i10 == 14 || i10 == 20) {
            z11 = true;
        }
        this.G = z11;
        this.H = this.d;
        this.I = this.f39590e;
        this.J = org.telegram.ui.ActionBar.q6.f29535b;
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

    public final void h(int i7) {
        this.f39588b = false;
        this.f39589c = false;
        this.f39590e = i7;
        this.d = i7;
        this.f39592g = false;
    }

    public final void i(int i7, int i10) {
        this.f39588b = true;
        this.f39589c = false;
        this.d = i7;
        this.f39590e = i10;
        this.f39592g = false;
    }

    public final void j(long j3, String str, String str2) {
        k(j3, str, str2, null);
    }

    public final void k(long j3, String str, String str2, Integer num) {
        boolean z10 = true;
        this.A = true;
        this.f39588b = true;
        this.f39589c = false;
        if (num != null) {
            s(num.intValue());
        } else {
            int i7 = org.telegram.ui.ActionBar.j6.f29071p8[e(j3)];
            org.telegram.ui.ActionBar.e6 e6Var = this.f39609z;
            this.d = org.telegram.ui.ActionBar.j6.w0(i7, e6Var);
            this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(j3)], e6Var);
            this.C = e(j3);
            this.D = this.d;
            this.E = this.f39590e;
            this.B = true;
            this.F = org.telegram.ui.ActionBar.q6.f29535b;
        }
        if (j3 != 5) {
            z10 = false;
        }
        this.f39592g = z10;
        this.f39598n = 0;
        this.f39597m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f39601q);
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
            long j3 = chat.f28051id;
            String str = chat.title;
            if (chat.color != null) {
                num = Integer.valueOf(org.telegram.messenger.t3.F(chat));
            } else {
                num = null;
            }
            k(j3, str, null, num);
        }
    }

    public final void r(TLRPC.User user) {
        Integer num;
        if (user != null) {
            long j3 = user.f28200id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(org.telegram.messenger.q10.e(user));
            } else {
                num = null;
            }
            k(j3, str, str2, num);
            this.f39597m = org.telegram.messenger.q10.x(user);
        }
    }

    public final void s(int i7) {
        i10 i10Var = this.f39591f;
        if (i10Var != null) {
            this.f39588b = false;
            this.f39589c = true;
        } else {
            this.f39588b = true;
            this.f39589c = false;
        }
        int[][] iArr = L;
        org.telegram.ui.ActionBar.e6 e6Var = this.f39609z;
        if (i7 >= 14) {
            org.telegram.messenger.np s12 = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0);
            org.telegram.messenger.dp dpVar = s12.f25380r4;
            if (dpVar != null && dpVar.d(i7) != null) {
                int f10 = s12.f25380r4.d(i7).f();
                if (this.f39591f != null) {
                    int[] iArr2 = iArr[f(f10)];
                    this.f39591f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[f(f10)], e6Var);
                this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[f(f10)], e6Var);
            } else if (this.f39591f != null) {
                int[] iArr3 = iArr[e(i7)];
                this.f39591f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j3 = i7;
                this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(j3)], e6Var);
                this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(j3)], e6Var);
            }
        } else if (i10Var != null) {
            int[] iArr4 = iArr[e(i7)];
            this.f39591f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j10 = i7;
            this.d = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[e(j10)], e6Var);
            this.f39590e = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[e(j10)], e6Var);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f39608y = i7;
    }

    public final void t() {
        this.f39596l = true;
    }

    public final void u(int i7) {
        this.f39587a.setTextSize(i7);
    }

    public t8(int i7, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.e6) null);
        this.f39596l = false;
        if (user != null) {
            k(user.f28200id, user.first_name, user.last_name, null);
            this.f39597m = org.telegram.messenger.q10.x(user);
        }
    }

    public t8(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.e6) null);
        this.f39596l = false;
        q(chat);
    }

    public t8(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f39600p = 1.0f;
        this.f39601q = new StringBuilder(5);
        this.f39602r = -1;
        this.f39606w = true;
        this.f39607x = false;
        this.f39608y = 255;
        this.f39609z = e6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f39587a = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

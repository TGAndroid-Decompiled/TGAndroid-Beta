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
public class v8 extends Drawable {
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
    public final TextPaint f38912a;
    public boolean f38913b;
    public boolean f38914c;
    public int d;
    public int f38915e;
    public e10 f38916f;
    public boolean f38917g;
    public StaticLayout h;
    public float f38918i;
    public float f38919j;
    public float f38920k;
    public boolean f38921l;
    public boolean f38922m;
    public int f38923n;
    public float f38924o;
    public float f38925p;
    public final StringBuilder f38926q;
    public int f38927r;
    public int f38928s;
    public int f38929t;
    public int f38930u;
    public LinearGradient v;
    public boolean f38931w;
    public boolean f38932x;
    public int f38933y;
    public final org.telegram.ui.ActionBar.h6 f38934z;

    public v8() {
        this((org.telegram.ui.ActionBar.h6) null);
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
        return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f28112p8[e(j3)], false);
    }

    public static int e(long j3) {
        return (int) Math.abs(j3 % org.telegram.ui.ActionBar.m6.f28112p8.length);
    }

    public static int f(int i7) {
        float[] P0 = org.telegram.ui.ActionBar.m6.P0(5);
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
        ArrayList j3 = org.telegram.messenger.i6.j(str, null);
        if (!j3.isEmpty() && ((org.telegram.messenger.g6) j3.get(0)).f22627a == 0) {
            return str.substring(0, ((org.telegram.messenger.g6) j3.get(0)).f22628b);
        }
        return str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1)));
    }

    public final int b() {
        if (this.f38917g) {
            int i7 = this.d;
            int i10 = 0;
            org.telegram.ui.ActionBar.j6 k10 = org.telegram.ui.ActionBar.m6.I.k(false);
            org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
            if (k10 != null) {
                i10 = k10.f27611c;
            }
            return org.telegram.ui.ActionBar.m6.C(l6Var, i10, i7);
        }
        return this.d;
    }

    public final int c() {
        if (this.f38917g) {
            int i7 = this.f38915e;
            int i10 = 0;
            org.telegram.ui.ActionBar.j6 k10 = org.telegram.ui.ActionBar.m6.I.k(false);
            org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
            if (k10 != null) {
                i10 = k10.f27611c;
            }
            return org.telegram.ui.ActionBar.m6.C(l6Var, i10, i7);
        }
        return this.f38915e;
    }

    @Override
    public final void draw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.v8.draw(android.graphics.Canvas):void");
    }

    public final void g(int i7) {
        boolean z9;
        this.f38923n = i7;
        boolean z10 = false;
        this.f38932x = false;
        this.f38914c = false;
        this.f38913b = false;
        if (i7 == 13) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false);
            this.f38915e = x02;
            this.d = x02;
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.f38934z;
            if (i7 == 2) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.N7, h6Var);
                this.f38915e = w02;
                this.d = w02;
            } else if (i7 != 27 && i7 != 12 && i7 != 1 && i7 != 14) {
                if (i7 == 20) {
                    this.f38932x = true;
                    this.f38913b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Vk, h6Var);
                    this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Wk, h6Var);
                } else if (i7 == 3) {
                    this.f38913b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(5L)], h6Var);
                    this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(5L)], h6Var);
                } else if (i7 == 25) {
                    this.f38913b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(2L)], h6Var);
                    this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(2L)], h6Var);
                } else if (i7 == 26) {
                    this.f38913b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(1L)], h6Var);
                    this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(1L)], h6Var);
                } else if (i7 == 4) {
                    this.f38913b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(5L)], h6Var);
                    this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(5L)], h6Var);
                } else if (i7 == 5) {
                    this.f38913b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(4L)], h6Var);
                    this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(4L)], h6Var);
                } else if (i7 != 6 && i7 != 23) {
                    if (i7 != 7 && i7 != 24) {
                        if (i7 == 8) {
                            this.f38913b = true;
                            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(0L)], h6Var);
                            this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(0L)], h6Var);
                        } else if (i7 == 9) {
                            this.f38913b = true;
                            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(6L)], h6Var);
                            this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(6L)], h6Var);
                        } else if (i7 == 10) {
                            this.f38913b = true;
                            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(5L)], h6Var);
                            this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(5L)], h6Var);
                        } else if (i7 == 17) {
                            this.f38913b = true;
                            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(5L)], h6Var);
                            this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(5L)], h6Var);
                        } else if (i7 == 21) {
                            this.f38914c = true;
                            if (this.f38916f == null) {
                                this.f38916f = new e10();
                            }
                            this.f38916f.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i7 == 22) {
                            this.f38914c = true;
                            if (this.f38916f == null) {
                                this.f38916f = new e10();
                            }
                            this.f38916f.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.f38913b = true;
                            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(4L)], h6Var);
                            this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(4L)], h6Var);
                        }
                    } else {
                        this.f38913b = true;
                        this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(1L)], h6Var);
                        this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(1L)], h6Var);
                    }
                } else {
                    this.f38913b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(3L)], h6Var);
                    this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(3L)], h6Var);
                }
            } else {
                this.f38913b = true;
                this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.K7, h6Var);
                this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.L7, h6Var);
            }
        }
        int i10 = this.f38923n;
        if (i10 != 2 && i10 != 1 && i10 != 20 && i10 != 21 && i10 != 27 && i10 != 12 && i10 != 14) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f38917g = z9;
        if (i10 == 13 || i10 == 2 || i10 == 27 || i10 == 12 || i10 == 1 || i10 == 14 || i10 == 20) {
            z10 = true;
        }
        this.G = z10;
        this.H = this.d;
        this.I = this.f38915e;
        this.J = org.telegram.ui.ActionBar.t6.f28531b;
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
        this.f38913b = false;
        this.f38914c = false;
        this.f38915e = i7;
        this.d = i7;
        this.f38917g = false;
    }

    public final void i(int i7, int i10) {
        this.f38913b = true;
        this.f38914c = false;
        this.d = i7;
        this.f38915e = i10;
        this.f38917g = false;
    }

    public final void j(long j3, String str, String str2) {
        k(j3, str, str2, null);
    }

    public final void k(long j3, String str, String str2, Integer num) {
        boolean z9 = true;
        this.A = true;
        this.f38913b = true;
        this.f38914c = false;
        if (num != null) {
            s(num.intValue());
        } else {
            int i7 = org.telegram.ui.ActionBar.m6.f28112p8[e(j3)];
            org.telegram.ui.ActionBar.h6 h6Var = this.f38934z;
            this.d = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(j3)], h6Var);
            this.C = e(j3);
            this.D = this.d;
            this.E = this.f38915e;
            this.B = true;
            this.F = org.telegram.ui.ActionBar.t6.f28531b;
        }
        if (j3 != 5) {
            z9 = false;
        }
        this.f38917g = z9;
        this.f38923n = 0;
        this.f38922m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f38926q);
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
            long j3 = chat.f26960id;
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
            long j3 = user.f27109id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(org.telegram.messenger.t10.e(user));
            } else {
                num = null;
            }
            k(j3, str, str2, num);
            this.f38922m = org.telegram.messenger.t10.x(user);
        }
    }

    public final void s(int i7) {
        e10 e10Var = this.f38916f;
        if (e10Var != null) {
            this.f38913b = false;
            this.f38914c = true;
        } else {
            this.f38913b = true;
            this.f38914c = false;
        }
        int[][] iArr = L;
        org.telegram.ui.ActionBar.h6 h6Var = this.f38934z;
        if (i7 >= 14) {
            org.telegram.messenger.qp s12 = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0);
            org.telegram.messenger.gp gpVar = s12.f24878q4;
            if (gpVar != null && gpVar.d(i7) != null) {
                int f10 = s12.f24878q4.d(i7).f();
                if (this.f38916f != null) {
                    int[] iArr2 = iArr[f(f10)];
                    this.f38916f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[f(f10)], h6Var);
                this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[f(f10)], h6Var);
            } else if (this.f38916f != null) {
                int[] iArr3 = iArr[e(i7)];
                this.f38916f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j3 = i7;
                this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(j3)], h6Var);
                this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(j3)], h6Var);
            }
        } else if (e10Var != null) {
            int[] iArr4 = iArr[e(i7)];
            this.f38916f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j10 = i7;
            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[e(j10)], h6Var);
            this.f38915e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[e(j10)], h6Var);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f38933y = i7;
    }

    public final void t() {
        this.f38921l = true;
    }

    public final void u(int i7) {
        this.f38912a.setTextSize(i7);
    }

    public v8(int i7, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.h6) null);
        this.f38921l = false;
        if (user != null) {
            k(user.f27109id, user.first_name, user.last_name, null);
            this.f38922m = org.telegram.messenger.t10.x(user);
        }
    }

    public v8(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.h6) null);
        this.f38921l = false;
        q(chat);
    }

    public v8(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f38925p = 1.0f;
        this.f38926q = new StringBuilder(5);
        this.f38927r = -1;
        this.f38931w = true;
        this.f38932x = false;
        this.f38933y = 255;
        this.f38934z = h6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f38912a = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

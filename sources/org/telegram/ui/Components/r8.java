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
public class r8 extends Drawable {
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
    public final TextPaint f29859a;
    public boolean f29860b;
    public boolean f29861c;
    public int d;
    public int e;
    public u10 f29862f;
    public boolean f29863g;
    public StaticLayout h;
    public float f29864i;
    public float f29865j;
    public float f29866k;
    public boolean f29867l;
    public boolean f29868m;
    public int f29869n;
    public float f29870o;
    public float f29871p;
    public final StringBuilder f29872q;
    public int f29873r;
    public int f29874s;
    public int f29875t;
    public int f29876u;
    public LinearGradient v;
    public boolean f29877w;
    public boolean f29878x;
    public int f29879y;
    public final org.telegram.ui.ActionBar.p6 f29880z;

    public r8() {
        this((org.telegram.ui.ActionBar.p6) null);
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
        return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21154p8[e(j10)], false);
    }

    public static int e(long j10) {
        return (int) Math.abs(j10 % org.telegram.ui.ActionBar.t6.f21154p8.length);
    }

    public static int f(int i10) {
        float[] P0 = org.telegram.ui.ActionBar.t6.P0(5);
        Color.colorToHSV(i10, P0);
        int i11 = (int) P0[0];
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
        ArrayList j10 = org.telegram.messenger.k6.j(str, null);
        if (!j10.isEmpty() && ((org.telegram.messenger.i6) j10.get(0)).f16080a == 0) {
            return str.substring(0, ((org.telegram.messenger.i6) j10.get(0)).f16081b);
        }
        return str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1)));
    }

    public final int b() {
        if (this.f29863g) {
            int i10 = this.d;
            int i11 = 0;
            org.telegram.ui.ActionBar.r6 k10 = org.telegram.ui.ActionBar.t6.I.k(false);
            org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
            if (k10 != null) {
                i11 = k10.f20732c;
            }
            return org.telegram.ui.ActionBar.t6.C(s6Var, i11, i10);
        }
        return this.d;
    }

    public final int c() {
        if (this.f29863g) {
            int i10 = this.e;
            int i11 = 0;
            org.telegram.ui.ActionBar.r6 k10 = org.telegram.ui.ActionBar.t6.I.k(false);
            org.telegram.ui.ActionBar.s6 s6Var = org.telegram.ui.ActionBar.t6.I;
            if (k10 != null) {
                i11 = k10.f20732c;
            }
            return org.telegram.ui.ActionBar.t6.C(s6Var, i11, i10);
        }
        return this.e;
    }

    @Override
    public final void draw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r8.draw(android.graphics.Canvas):void");
    }

    public final void g(int i10) {
        boolean z10;
        this.f29869n = i10;
        boolean z11 = false;
        this.f29878x = false;
        this.f29861c = false;
        this.f29860b = false;
        if (i10 == 13) {
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.P9, false);
            this.e = x02;
            this.d = x02;
        } else {
            org.telegram.ui.ActionBar.p6 p6Var = this.f29880z;
            if (i10 == 2) {
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.N7, p6Var);
                this.e = w02;
                this.d = w02;
            } else if (i10 != 27 && i10 != 12 && i10 != 1 && i10 != 14) {
                if (i10 == 20) {
                    this.f29878x = true;
                    this.f29860b = true;
                    this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Vk, p6Var);
                    this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Wk, p6Var);
                } else if (i10 == 3) {
                    this.f29860b = true;
                    this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(5L)], p6Var);
                    this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(5L)], p6Var);
                } else if (i10 == 25) {
                    this.f29860b = true;
                    this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(2L)], p6Var);
                    this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(2L)], p6Var);
                } else if (i10 == 26) {
                    this.f29860b = true;
                    this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(1L)], p6Var);
                    this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(1L)], p6Var);
                } else if (i10 == 4) {
                    this.f29860b = true;
                    this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(5L)], p6Var);
                    this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(5L)], p6Var);
                } else if (i10 == 5) {
                    this.f29860b = true;
                    this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(4L)], p6Var);
                    this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(4L)], p6Var);
                } else if (i10 != 6 && i10 != 23) {
                    if (i10 != 7 && i10 != 24) {
                        if (i10 == 8) {
                            this.f29860b = true;
                            this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(0L)], p6Var);
                            this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(0L)], p6Var);
                        } else if (i10 == 9) {
                            this.f29860b = true;
                            this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(6L)], p6Var);
                            this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(6L)], p6Var);
                        } else if (i10 == 10) {
                            this.f29860b = true;
                            this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(5L)], p6Var);
                            this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(5L)], p6Var);
                        } else if (i10 == 17) {
                            this.f29860b = true;
                            this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(5L)], p6Var);
                            this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(5L)], p6Var);
                        } else if (i10 == 21) {
                            this.f29861c = true;
                            if (this.f29862f == null) {
                                this.f29862f = new u10();
                            }
                            this.f29862f.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i10 == 22) {
                            this.f29861c = true;
                            if (this.f29862f == null) {
                                this.f29862f = new u10();
                            }
                            this.f29862f.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.f29860b = true;
                            this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(4L)], p6Var);
                            this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(4L)], p6Var);
                        }
                    } else {
                        this.f29860b = true;
                        this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(1L)], p6Var);
                        this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(1L)], p6Var);
                    }
                } else {
                    this.f29860b = true;
                    this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(3L)], p6Var);
                    this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(3L)], p6Var);
                }
            } else {
                this.f29860b = true;
                this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.K7, p6Var);
                this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.L7, p6Var);
            }
        }
        int i11 = this.f29869n;
        if (i11 != 2 && i11 != 1 && i11 != 20 && i11 != 21 && i11 != 27 && i11 != 12 && i11 != 14) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29863g = z10;
        if (i11 == 13 || i11 == 2 || i11 == 27 || i11 == 12 || i11 == 1 || i11 == 14 || i11 == 20) {
            z11 = true;
        }
        this.G = z11;
        this.H = this.d;
        this.I = this.e;
        this.J = org.telegram.ui.ActionBar.a7.f20158b;
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
        this.f29860b = false;
        this.f29861c = false;
        this.e = i10;
        this.d = i10;
        this.f29863g = false;
    }

    public final void i(int i10, int i11) {
        this.f29860b = true;
        this.f29861c = false;
        this.d = i10;
        this.e = i11;
        this.f29863g = false;
    }

    public final void j(long j10, String str, String str2) {
        k(j10, str, str2, null);
    }

    public final void k(long j10, String str, String str2, Integer num) {
        boolean z10 = true;
        this.A = true;
        this.f29860b = true;
        this.f29861c = false;
        if (num != null) {
            s(num.intValue());
        } else {
            int i10 = org.telegram.ui.ActionBar.t6.f21154p8[e(j10)];
            org.telegram.ui.ActionBar.p6 p6Var = this.f29880z;
            this.d = org.telegram.ui.ActionBar.t6.w0(i10, p6Var);
            this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(j10)], p6Var);
            this.C = e(j10);
            this.D = this.d;
            this.E = this.e;
            this.B = true;
            this.F = org.telegram.ui.ActionBar.a7.f20158b;
        }
        if (j10 != 5) {
            z10 = false;
        }
        this.f29863g = z10;
        this.f29869n = 0;
        this.f29868m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f29872q);
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
                num = Integer.valueOf(org.telegram.messenger.w3.F(chat));
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
            long j10 = chat.f19793id;
            String str = chat.title;
            if (chat.color != null) {
                num = Integer.valueOf(org.telegram.messenger.w3.F(chat));
            } else {
                num = null;
            }
            k(j10, str, null, num);
        }
    }

    public final void r(TLRPC.User user) {
        Integer num;
        if (user != null) {
            long j10 = user.f19942id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(org.telegram.messenger.h20.e(user));
            } else {
                num = null;
            }
            k(j10, str, str2, num);
            this.f29868m = org.telegram.messenger.h20.x(user);
        }
    }

    public final void s(int i10) {
        u10 u10Var = this.f29862f;
        if (u10Var != null) {
            this.f29860b = false;
            this.f29861c = true;
        } else {
            this.f29860b = true;
            this.f29861c = false;
        }
        int[][] iArr = L;
        org.telegram.ui.ActionBar.p6 p6Var = this.f29880z;
        if (i10 >= 14) {
            org.telegram.messenger.vp r12 = org.telegram.messenger.vp.r1(org.telegram.messenger.d20.f15147s0);
            org.telegram.messenger.lp lpVar = r12.f18888r4;
            if (lpVar != null && lpVar.d(i10) != null) {
                int f7 = r12.f18888r4.d(i10).f();
                if (this.f29862f != null) {
                    int[] iArr2 = iArr[f(f7)];
                    this.f29862f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[f(f7)], p6Var);
                this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[f(f7)], p6Var);
            } else if (this.f29862f != null) {
                int[] iArr3 = iArr[e(i10)];
                this.f29862f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j10 = i10;
                this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(j10)], p6Var);
                this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(j10)], p6Var);
            }
        } else if (u10Var != null) {
            int[] iArr4 = iArr[e(i10)];
            this.f29862f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j11 = i10;
            this.d = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21154p8[e(j11)], p6Var);
            this.e = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21171q8[e(j11)], p6Var);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        this.f29879y = i10;
    }

    public final void t() {
        this.f29867l = true;
    }

    public final void u(int i10) {
        this.f29859a.setTextSize(i10);
    }

    public r8(int i10, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.p6) null);
        this.f29867l = false;
        if (user != null) {
            k(user.f19942id, user.first_name, user.last_name, null);
            this.f29868m = org.telegram.messenger.h20.x(user);
        }
    }

    public r8(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.p6) null);
        this.f29867l = false;
        q(chat);
    }

    public r8(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f29871p = 1.0f;
        this.f29872q = new StringBuilder(5);
        this.f29873r = -1;
        this.f29877w = true;
        this.f29878x = false;
        this.f29879y = 255;
        this.f29880z = p6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f29859a = textPaint;
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.L(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

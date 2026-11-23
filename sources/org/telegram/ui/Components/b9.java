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
public class b9 extends Drawable {
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
    public final TextPaint f33766a;
    public boolean f33767b;
    public boolean f33768c;
    public int d;
    public int f33769e;
    public s10 f33770f;
    public boolean f33771g;
    public StaticLayout h;
    public float f33772i;
    public float f33773j;
    public float f33774k;
    public boolean f33775l;
    public boolean f33776m;
    public int f33777n;
    public float f33778o;
    public float f33779p;
    public final StringBuilder f33780q;
    public int f33781r;
    public int f33782s;
    public int f33783t;
    public int f33784u;
    public LinearGradient v;
    public boolean f33785w;
    public boolean f33786x;
    public int f33787y;
    public final org.telegram.ui.ActionBar.h6 f33788z;

    public b9() {
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
        return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29569p8[e(j3)], false);
    }

    public static int e(long j3) {
        return (int) Math.abs(j3 % org.telegram.ui.ActionBar.m6.f29569p8.length);
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
        ArrayList j3 = org.telegram.messenger.j6.j(str, null);
        if (!j3.isEmpty() && ((org.telegram.messenger.h6) j3.get(0)).f24364a == 0) {
            return str.substring(0, ((org.telegram.messenger.h6) j3.get(0)).f24365b);
        }
        return str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 1)));
    }

    public final int b() {
        if (this.f33771g) {
            int i7 = this.d;
            int i10 = 0;
            org.telegram.ui.ActionBar.j6 k10 = org.telegram.ui.ActionBar.m6.I.k(false);
            org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
            if (k10 != null) {
                i10 = k10.f29064c;
            }
            return org.telegram.ui.ActionBar.m6.C(l6Var, i10, i7);
        }
        return this.d;
    }

    public final int c() {
        if (this.f33771g) {
            int i7 = this.f33769e;
            int i10 = 0;
            org.telegram.ui.ActionBar.j6 k10 = org.telegram.ui.ActionBar.m6.I.k(false);
            org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
            if (k10 != null) {
                i10 = k10.f29064c;
            }
            return org.telegram.ui.ActionBar.m6.C(l6Var, i10, i7);
        }
        return this.f33769e;
    }

    @Override
    public final void draw(android.graphics.Canvas r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.b9.draw(android.graphics.Canvas):void");
    }

    public final void g(int i7) {
        boolean z10;
        this.f33777n = i7;
        boolean z11 = false;
        this.f33786x = false;
        this.f33768c = false;
        this.f33767b = false;
        if (i7 == 13) {
            int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.P9, false);
            this.f33769e = x02;
            this.d = x02;
        } else {
            org.telegram.ui.ActionBar.h6 h6Var = this.f33788z;
            if (i7 == 2) {
                int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.N7, h6Var);
                this.f33769e = w02;
                this.d = w02;
            } else if (i7 != 27 && i7 != 12 && i7 != 1 && i7 != 14) {
                if (i7 == 20) {
                    this.f33786x = true;
                    this.f33767b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Yk, h6Var);
                    this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Zk, h6Var);
                } else if (i7 == 3) {
                    this.f33767b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(5L)], h6Var);
                    this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(5L)], h6Var);
                } else if (i7 == 25) {
                    this.f33767b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(2L)], h6Var);
                    this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(2L)], h6Var);
                } else if (i7 == 26) {
                    this.f33767b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(1L)], h6Var);
                    this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(1L)], h6Var);
                } else if (i7 == 4) {
                    this.f33767b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(5L)], h6Var);
                    this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(5L)], h6Var);
                } else if (i7 == 5) {
                    this.f33767b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(4L)], h6Var);
                    this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(4L)], h6Var);
                } else if (i7 != 6 && i7 != 23) {
                    if (i7 != 7 && i7 != 24) {
                        if (i7 == 8) {
                            this.f33767b = true;
                            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(0L)], h6Var);
                            this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(0L)], h6Var);
                        } else if (i7 == 9) {
                            this.f33767b = true;
                            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(6L)], h6Var);
                            this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(6L)], h6Var);
                        } else if (i7 == 10) {
                            this.f33767b = true;
                            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(5L)], h6Var);
                            this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(5L)], h6Var);
                        } else if (i7 == 17) {
                            this.f33767b = true;
                            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(5L)], h6Var);
                            this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(5L)], h6Var);
                        } else if (i7 == 21) {
                            this.f33768c = true;
                            if (this.f33770f == null) {
                                this.f33770f = new s10();
                            }
                            this.f33770f.d(-8160001, -5217281, -36183, -1938945);
                        } else if (i7 == 22) {
                            this.f33768c = true;
                            if (this.f33770f == null) {
                                this.f33770f = new s10();
                            }
                            this.f33770f.d(-11694593, -13910017, -14622003, -15801871);
                        } else {
                            this.f33767b = true;
                            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(4L)], h6Var);
                            this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(4L)], h6Var);
                        }
                    } else {
                        this.f33767b = true;
                        this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(1L)], h6Var);
                        this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(1L)], h6Var);
                    }
                } else {
                    this.f33767b = true;
                    this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(3L)], h6Var);
                    this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(3L)], h6Var);
                }
            } else {
                this.f33767b = true;
                this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.K7, h6Var);
                this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.L7, h6Var);
            }
        }
        int i10 = this.f33777n;
        if (i10 != 2 && i10 != 1 && i10 != 20 && i10 != 21 && i10 != 27 && i10 != 12 && i10 != 14) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f33771g = z10;
        if (i10 == 13 || i10 == 2 || i10 == 27 || i10 == 12 || i10 == 1 || i10 == 14 || i10 == 20) {
            z11 = true;
        }
        this.G = z11;
        this.H = this.d;
        this.I = this.f33769e;
        this.J = org.telegram.ui.ActionBar.t6.f30035b;
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
        this.f33767b = false;
        this.f33768c = false;
        this.f33769e = i7;
        this.d = i7;
        this.f33771g = false;
    }

    public final void i(int i7, int i10) {
        this.f33767b = true;
        this.f33768c = false;
        this.d = i7;
        this.f33769e = i10;
        this.f33771g = false;
    }

    public final void j(long j3, String str, String str2) {
        k(j3, str, str2, null);
    }

    public final void k(long j3, String str, String str2, Integer num) {
        boolean z10 = true;
        this.A = true;
        this.f33767b = true;
        this.f33768c = false;
        if (num != null) {
            s(num.intValue());
        } else {
            int i7 = org.telegram.ui.ActionBar.m6.f29569p8[e(j3)];
            org.telegram.ui.ActionBar.h6 h6Var = this.f33788z;
            this.d = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
            this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(j3)], h6Var);
            this.C = e(j3);
            this.D = this.d;
            this.E = this.f33769e;
            this.B = true;
            this.F = org.telegram.ui.ActionBar.t6.f30035b;
        }
        if (j3 != 5) {
            z10 = false;
        }
        this.f33771g = z10;
        this.f33777n = 0;
        this.f33776m = false;
        if (str == null || str.length() == 0) {
            str = str2;
            str2 = null;
        }
        a(str, str2, null, this.f33780q);
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
                num = Integer.valueOf(org.telegram.messenger.v3.F(chat));
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
            long j3 = chat.f28398id;
            String str = chat.title;
            if (chat.color != null) {
                num = Integer.valueOf(org.telegram.messenger.v3.F(chat));
            } else {
                num = null;
            }
            k(j3, str, null, num);
        }
    }

    public final void r(TLRPC.User user) {
        Integer num;
        if (user != null) {
            long j3 = user.f28547id;
            String str = user.first_name;
            String str2 = user.last_name;
            if (user.color != null) {
                num = Integer.valueOf(org.telegram.messenger.p10.f(user));
            } else {
                num = null;
            }
            k(j3, str, str2, num);
            this.f33776m = org.telegram.messenger.p10.y(user);
        }
    }

    public final void s(int i7) {
        s10 s10Var = this.f33770f;
        if (s10Var != null) {
            this.f33767b = false;
            this.f33768c = true;
        } else {
            this.f33767b = true;
            this.f33768c = false;
        }
        int[][] iArr = L;
        org.telegram.ui.ActionBar.h6 h6Var = this.f33788z;
        if (i7 >= 14) {
            org.telegram.messenger.np u12 = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24932t0);
            org.telegram.messenger.dp dpVar = u12.f25930t4;
            if (dpVar != null && dpVar.d(i7) != null) {
                int f10 = u12.f25930t4.d(i7).f();
                if (this.f33770f != null) {
                    int[] iArr2 = iArr[f(f10)];
                    this.f33770f.d(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
                    return;
                }
                this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[f(f10)], h6Var);
                this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[f(f10)], h6Var);
            } else if (this.f33770f != null) {
                int[] iArr3 = iArr[e(i7)];
                this.f33770f.d(iArr3[0], iArr3[1], iArr3[2], iArr3[3]);
            } else {
                long j3 = i7;
                this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(j3)], h6Var);
                this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(j3)], h6Var);
            }
        } else if (s10Var != null) {
            int[] iArr4 = iArr[e(i7)];
            this.f33770f.d(iArr4[0], iArr4[1], iArr4[2], iArr4[3]);
        } else {
            long j10 = i7;
            this.d = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29569p8[e(j10)], h6Var);
            this.f33769e = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29589q8[e(j10)], h6Var);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        this.f33787y = i7;
    }

    public final void t() {
        this.f33775l = true;
    }

    public final void u(int i7) {
        this.f33766a.setTextSize(i7);
    }

    public b9(int i7, TLRPC.User user) {
        this((org.telegram.ui.ActionBar.h6) null);
        this.f33775l = false;
        if (user != null) {
            k(user.f28547id, user.first_name, user.last_name, null);
            this.f33776m = org.telegram.messenger.p10.y(user);
        }
    }

    public b9(TLRPC.Chat chat) {
        this((org.telegram.ui.ActionBar.h6) null);
        this.f33775l = false;
        q(chat);
    }

    public b9(org.telegram.ui.ActionBar.h6 h6Var) {
        this.f33779p = 1.0f;
        this.f33780q = new StringBuilder(5);
        this.f33781r = -1;
        this.f33785w = true;
        this.f33786x = false;
        this.f33787y = 255;
        this.f33788z = h6Var;
        TextPaint textPaint = new TextPaint(1);
        this.f33766a = textPaint;
        textPaint.setTypeface(org.telegram.messenger.g0.o());
        textPaint.setTextSize(org.telegram.messenger.g0.L(18.0f));
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

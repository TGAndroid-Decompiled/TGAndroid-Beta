package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class b91 extends org.telegram.ui.Components.lm0 {
    public int f38012c0;
    public int d;
    public final w91 f38013d0;
    public int f38011c = -1;
    public int e = -1;
    public int f38014f = -1;
    public int h = -1;
    public int f38015n = -1;
    public int f38016r = -1;
    public int f38017s = -1;
    public int v = -1;
    public int f38018w = -1;
    public int f38019x = -1;
    public int f38020y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public int I = -1;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int M = -1;
    public int N = -1;
    public int O = -1;
    public int P = -1;
    public int Q = -1;
    public int R = -1;
    public int S = -1;
    public int T = -1;
    public int U = -1;
    public int V = -1;
    public int W = -1;
    public int X = -1;
    public int Y = -1;
    public int Z = -1;
    public final a0.g f38009a0 = new a0.g(0);
    public final a0.g f38010b0 = new a0.g(0);

    public b91(w91 w91Var) {
        this.f38013d0 = w91Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47741f;
        if (i10 != 9 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.f38016r = -1;
        this.v = -1;
        this.f38018w = -1;
        this.f38019x = -1;
        this.I = -1;
        this.J = -1;
        this.f38014f = -1;
        this.H = -1;
        this.f38017s = -1;
        this.f38015n = -1;
        this.f38020y = -1;
        this.G = -1;
        this.F = -1;
        this.E = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = -1;
        this.O = -1;
        this.P = -1;
        this.Q = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.f38012c0 = 0;
        a0.g gVar = this.f38010b0;
        gVar.clear();
        a0.g gVar2 = this.f38009a0;
        gVar2.clear();
        w91 w91Var = this.f38013d0;
        ArrayList arrayList = w91Var.f45053y0;
        ArrayList arrayList2 = w91Var.P;
        ArrayList arrayList3 = w91Var.Q;
        ArrayList arrayList4 = w91Var.O;
        if (w91Var.f45023b0) {
            if (w91Var.G != null) {
                int i10 = this.f38012c0;
                this.f38011c = i10;
                this.f38012c0 = i10 + 2;
                this.d = i10 + 1;
            }
            i91 i91Var = w91Var.d;
            if (i91Var != null && !i91Var.f40194l) {
                int i11 = this.f38012c0;
                if (i11 > 0) {
                    this.f38012c0 = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.f38012c0;
                this.f38012c0 = i12 + 1;
                this.e = i12;
            }
            i91 i91Var2 = w91Var.H;
            if (i91Var2 != null && !i91Var2.f40194l) {
                int i13 = this.f38012c0;
                if (i13 > 0) {
                    this.f38012c0 = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.f38012c0;
                this.f38012c0 = i14 + 1;
                this.K = i14;
            }
            i91 i91Var3 = w91Var.I;
            if (i91Var3 != null && !i91Var3.f40194l && !i91Var3.f40186a) {
                int i15 = this.f38012c0;
                if (i15 > 0) {
                    this.f38012c0 = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.f38012c0;
                this.f38012c0 = i16 + 1;
                this.L = i16;
            }
            i91 i91Var4 = w91Var.J;
            if (i91Var4 != null && !i91Var4.f40194l && !i91Var4.f40186a) {
                int i17 = this.f38012c0;
                if (i17 > 0) {
                    this.f38012c0 = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.f38012c0;
                this.f38012c0 = i18 + 1;
                this.M = i18;
            }
            i91 i91Var5 = w91Var.K;
            if (i91Var5 != null && !i91Var5.f40194l && !i91Var5.f40186a) {
                int i19 = this.f38012c0;
                if (i19 > 0) {
                    this.f38012c0 = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.f38012c0;
                this.f38012c0 = i20 + 1;
                this.N = i20;
            }
            i91 i91Var6 = w91Var.L;
            if (i91Var6 != null && !i91Var6.f40194l && !i91Var6.f40186a) {
                int i21 = this.f38012c0;
                if (i21 > 0) {
                    this.f38012c0 = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.f38012c0;
                this.f38012c0 = i22 + 1;
                this.O = i22;
            }
            i91 i91Var7 = w91Var.e;
            if (i91Var7 != null && !i91Var7.f40194l && !i91Var7.f40186a) {
                int i23 = this.f38012c0;
                if (i23 > 0) {
                    this.f38012c0 = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.f38012c0;
                this.f38012c0 = i24 + 1;
                this.f38015n = i24;
            }
            i91 i91Var8 = w91Var.M;
            if (i91Var8 != null && !i91Var8.f40194l && !i91Var8.f40186a) {
                int i25 = this.f38012c0;
                if (i25 > 0) {
                    this.f38012c0 = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.f38012c0;
                this.f38012c0 = i26 + 1;
                this.P = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.f38012c0;
                if (i27 > 0) {
                    this.f38012c0 = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.f38012c0;
                int i29 = i28 + 1;
                this.Q = i28;
                this.f38012c0 = i28 + 2;
                this.R = i29;
                int size = arrayList4.size() + i29;
                this.S = size - 1;
                this.f38012c0 = size;
                if (arrayList4.size() != w91Var.N.size()) {
                    int i30 = this.f38012c0;
                    this.f38012c0 = i30 + 1;
                    this.Z = i30;
                } else {
                    int i31 = this.f38012c0;
                    this.f38012c0 = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.f38012c0;
                if (i32 > 0) {
                    this.f38012c0 = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.f38012c0;
                int i34 = i33 + 1;
                this.T = i33;
                this.f38012c0 = i33 + 2;
                this.U = i34;
                int size2 = arrayList3.size() + i34;
                this.V = size2 - 1;
                this.f38012c0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.f38012c0;
                if (i35 > 0) {
                    this.f38012c0 = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.f38012c0;
                int i37 = i36 + 1;
                this.W = i36;
                this.f38012c0 = i36 + 2;
                this.X = i37;
                int size3 = arrayList2.size() + i37;
                this.Y = size3 - 1;
                this.f38012c0 = size3;
            }
            int i38 = this.f38012c0;
            if (i38 > 0) {
                this.f38012c0 = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.f38012c0;
                this.f38012c0 = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (w91Var.f45028f != null) {
            int i40 = this.f38012c0;
            this.f38011c = i40;
            this.f38012c0 = i40 + 2;
            this.d = i40 + 1;
        }
        i91 i91Var9 = w91Var.d;
        if (i91Var9 != null && !i91Var9.f40194l) {
            int i41 = this.f38012c0;
            if (i41 > 0) {
                this.f38012c0 = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.f38012c0;
            this.f38012c0 = i42 + 1;
            this.e = i42;
        }
        i91 i91Var10 = w91Var.h;
        if (i91Var10 != null && !i91Var10.f40194l) {
            int i43 = this.f38012c0;
            if (i43 > 0) {
                this.f38012c0 = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.f38012c0;
            this.f38012c0 = i44 + 1;
            this.h = i44;
        }
        i91 i91Var11 = w91Var.f45050x;
        if (i91Var11 != null && !i91Var11.f40194l) {
            int i45 = this.f38012c0;
            if (i45 > 0) {
                this.f38012c0 = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.f38012c0;
            this.f38012c0 = i46 + 1;
            this.f38020y = i46;
        }
        i91 i91Var12 = w91Var.e;
        if (i91Var12 != null && !i91Var12.f40194l) {
            int i47 = this.f38012c0;
            if (i47 > 0) {
                this.f38012c0 = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.f38012c0;
            this.f38012c0 = i48 + 1;
            this.f38015n = i48;
        }
        i91 i91Var13 = w91Var.f45043s;
        if (i91Var13 != null && !i91Var13.f40194l) {
            int i49 = this.f38012c0;
            if (i49 > 0) {
                this.f38012c0 = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.f38012c0;
            this.f38012c0 = i50 + 1;
            this.v = i50;
        }
        i91 i91Var14 = w91Var.v;
        if (i91Var14 != null && !i91Var14.f40194l) {
            int i51 = this.f38012c0;
            if (i51 > 0) {
                this.f38012c0 = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.f38012c0;
            this.f38012c0 = i52 + 1;
            this.f38018w = i52;
        }
        i91 i91Var15 = w91Var.f45048w;
        if (i91Var15 != null && !i91Var15.f40194l) {
            int i53 = this.f38012c0;
            if (i53 > 0) {
                this.f38012c0 = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.f38012c0;
            this.f38012c0 = i54 + 1;
            this.f38019x = i54;
        }
        i91 i91Var16 = w91Var.f45036n;
        if (i91Var16 != null && !i91Var16.f40194l) {
            int i55 = this.f38012c0;
            if (i55 > 0) {
                this.f38012c0 = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.f38012c0;
            this.f38012c0 = i56 + 1;
            this.f38016r = i56;
        }
        i91 i91Var17 = w91Var.f45041r;
        if (i91Var17 != null && !i91Var17.f40193k && !i91Var17.f40186a) {
            int i57 = this.f38012c0;
            if (i57 > 0) {
                this.f38012c0 = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.f38012c0;
            this.f38012c0 = i58 + 1;
            this.f38017s = i58;
        }
        i91 i91Var18 = w91Var.f45052y;
        if (i91Var18 != null && !i91Var18.f40194l && !i91Var18.f40186a) {
            int i59 = this.f38012c0;
            if (i59 > 0) {
                this.f38012c0 = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.f38012c0;
            this.f38012c0 = i60 + 1;
            this.E = i60;
        }
        i91 i91Var19 = w91Var.E;
        if (i91Var19 != null && !i91Var19.f40194l && !i91Var19.f40186a) {
            int i61 = this.f38012c0;
            if (i61 > 0) {
                this.f38012c0 = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.f38012c0;
            this.f38012c0 = i62 + 1;
            this.F = i62;
        }
        i91 i91Var20 = w91Var.F;
        if (i91Var20 != null && !i91Var20.f40194l && !i91Var20.f40186a) {
            int i63 = this.f38012c0;
            if (i63 > 0) {
                this.f38012c0 = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.f38012c0;
            this.f38012c0 = i64 + 1;
            this.G = i64;
        }
        int i65 = this.f38012c0;
        this.f38012c0 = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.f38012c0;
            int i67 = i66 + 1;
            this.H = i66;
            this.f38012c0 = i66 + 2;
            this.I = i67;
            int size4 = arrayList.size() + i67;
            this.J = size4 - 1;
            this.f38012c0 = size4;
            if (w91Var.f45047v0.size() != w91Var.f45046u0.size()) {
                int i68 = this.f38012c0;
                this.f38012c0 = i68 + 1;
                this.f38014f = i68;
            } else {
                int i69 = this.f38012c0;
                this.f38012c0 = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.f38012c0;
            this.f38012c0 = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override
    public final int h() {
        return this.f38012c0;
    }

    @Override
    public final long i(int i10) {
        int i11 = this.I;
        if (i10 >= i11 && i10 < this.J) {
            return ((t91) this.f38013d0.f45053y0.get(i10 - i11)).b();
        }
        if (i10 == this.e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.f38015n) {
            return 3L;
        }
        if (i10 == this.f38016r) {
            return 4L;
        }
        if (i10 == this.f38020y) {
            return 5L;
        }
        if (i10 == this.f38017s) {
            return 6L;
        }
        if (i10 == this.v) {
            return 7L;
        }
        if (i10 == this.f38018w) {
            return 8L;
        }
        if (i10 == this.f38019x) {
            return 9L;
        }
        if (i10 == this.K) {
            return 10L;
        }
        if (i10 == this.L) {
            return 11L;
        }
        if (i10 == this.M) {
            return 12L;
        }
        if (i10 == this.N) {
            return 13L;
        }
        if (i10 == this.O) {
            return 14L;
        }
        if (i10 == this.P) {
            return 15L;
        }
        if (i10 == this.E) {
            return 16L;
        }
        if (i10 == this.F) {
            return 17L;
        }
        if (i10 == this.G) {
            return 18L;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        if (i10 != this.e && i10 != this.h && i10 != this.f38015n && i10 != this.f38020y && i10 != this.O && i10 != this.K) {
            if (i10 != this.f38016r && i10 != this.f38017s && i10 != this.F) {
                if (i10 != this.v && i10 != this.f38018w && i10 != this.L && i10 != this.N && i10 != this.E && i10 != this.G) {
                    if (i10 != this.f38019x && i10 != this.M && i10 != this.P) {
                        if (i10 >= this.I && i10 <= this.J) {
                            return 9;
                        }
                        if (i10 == this.f38014f) {
                            return 11;
                        }
                        if (this.f38010b0.contains(Integer.valueOf(i10))) {
                            return 12;
                        }
                        if (i10 != this.H && i10 != this.f38011c && i10 != this.T && i10 != this.Q && i10 != this.W) {
                            if (i10 == this.d) {
                                return 14;
                            }
                            if ((i10 >= this.U && i10 <= this.V) || ((i10 >= this.R && i10 <= this.S) || (i10 >= this.X && i10 <= this.Y))) {
                                return 9;
                            }
                            if (i10 == this.Z) {
                                return 15;
                            }
                            return 10;
                        }
                        return 13;
                    }
                    return 4;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.e1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b91.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.c5 c5Var;
        int i11;
        int i12 = 4;
        w91 w91Var = this.f38013d0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.r2) w91Var).currentAccount;
            View h91Var = new h91(w91Var, context, i11, i10, w91Var.Z);
            h91Var.setWillNotDraw(false);
            c5Var = h91Var;
        } else if (i10 == 9) {
            View f8Var = new org.telegram.ui.Cells.f8(viewGroup.getContext(), w91Var.f45020a, w91Var.getResourceProvider());
            f8Var.setWillNotDraw(false);
            c5Var = f8Var;
        } else if (i10 == 11) {
            c5Var = new org.telegram.ui.Cells.w4(viewGroup.getContext());
        } else if (i10 == 12) {
            c5Var = new org.telegram.ui.Cells.i3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View cVar = new mg.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
            c5Var = cVar;
        } else if (i10 == 14) {
            Context context2 = viewGroup.getContext();
            if (w91Var.f45023b0) {
                i12 = 2;
            }
            c5Var = new q91(context2, i12);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.c5 c5Var2 = new org.telegram.ui.Cells.c5(viewGroup.getContext());
            c5Var2.a(org.telegram.ui.ActionBar.y6.f23692v6, org.telegram.ui.ActionBar.y6.f23673u6);
            c5Var = c5Var2;
        } else {
            c5Var = new org.telegram.ui.Cells.f7(viewGroup.getContext(), 0, 0);
        }
        return ic.a.n(c5Var, c5Var, -1, -2);
    }
}

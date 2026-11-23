package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class g41 extends org.telegram.ui.Components.dk0 {
    public int d;
    public int f48093d0;
    public final b51 f48095e0;
    public int f48091c = -1;
    public int f48094e = -1;
    public int f48096f = -1;
    public int h = -1;
    public int f48097n = -1;
    public int f48098r = -1;
    public int f48099s = -1;
    public int f48100w = -1;
    public int f48101x = -1;
    public int f48102y = -1;
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
    public int f48089a0 = -1;
    public final a0.g f48090b0 = new a0.g(0);
    public final a0.g f48092c0 = new a0.g(0);

    public g41(b51 b51Var) {
        this.f48095e0 = b51Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 9 && i7 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.f48094e = -1;
        this.h = -1;
        this.f48098r = -1;
        this.f48100w = -1;
        this.f48101x = -1;
        this.f48102y = -1;
        this.J = -1;
        this.K = -1;
        this.f48096f = -1;
        this.I = -1;
        this.f48099s = -1;
        this.f48097n = -1;
        this.E = -1;
        this.H = -1;
        this.G = -1;
        this.F = -1;
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
        this.f48089a0 = -1;
        this.f48093d0 = 0;
        a0.g gVar = this.f48092c0;
        gVar.clear();
        a0.g gVar2 = this.f48090b0;
        gVar2.clear();
        b51 b51Var = this.f48095e0;
        ArrayList arrayList = b51Var.f45959z0;
        ArrayList arrayList2 = b51Var.Q;
        ArrayList arrayList3 = b51Var.R;
        ArrayList arrayList4 = b51Var.P;
        if (b51Var.f45929c0) {
            if (b51Var.H != null) {
                int i7 = this.f48093d0;
                this.f48091c = i7;
                this.f48093d0 = i7 + 2;
                this.d = i7 + 1;
            }
            n41 n41Var = b51Var.d;
            if (n41Var != null && !n41Var.f50217l) {
                int i10 = this.f48093d0;
                if (i10 > 0) {
                    this.f48093d0 = i10 + 1;
                    gVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.f48093d0;
                this.f48093d0 = i11 + 1;
                this.f48094e = i11;
            }
            n41 n41Var2 = b51Var.I;
            if (n41Var2 != null && !n41Var2.f50217l) {
                int i12 = this.f48093d0;
                if (i12 > 0) {
                    this.f48093d0 = i12 + 1;
                    gVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.f48093d0;
                this.f48093d0 = i13 + 1;
                this.L = i13;
            }
            n41 n41Var3 = b51Var.J;
            if (n41Var3 != null && !n41Var3.f50217l && !n41Var3.f50208a) {
                int i14 = this.f48093d0;
                if (i14 > 0) {
                    this.f48093d0 = i14 + 1;
                    gVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.f48093d0;
                this.f48093d0 = i15 + 1;
                this.M = i15;
            }
            n41 n41Var4 = b51Var.K;
            if (n41Var4 != null && !n41Var4.f50217l && !n41Var4.f50208a) {
                int i16 = this.f48093d0;
                if (i16 > 0) {
                    this.f48093d0 = i16 + 1;
                    gVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.f48093d0;
                this.f48093d0 = i17 + 1;
                this.N = i17;
            }
            n41 n41Var5 = b51Var.L;
            if (n41Var5 != null && !n41Var5.f50217l && !n41Var5.f50208a) {
                int i18 = this.f48093d0;
                if (i18 > 0) {
                    this.f48093d0 = i18 + 1;
                    gVar2.add(Integer.valueOf(i18));
                }
                int i19 = this.f48093d0;
                this.f48093d0 = i19 + 1;
                this.O = i19;
            }
            n41 n41Var6 = b51Var.M;
            if (n41Var6 != null && !n41Var6.f50217l && !n41Var6.f50208a) {
                int i20 = this.f48093d0;
                if (i20 > 0) {
                    this.f48093d0 = i20 + 1;
                    gVar2.add(Integer.valueOf(i20));
                }
                int i21 = this.f48093d0;
                this.f48093d0 = i21 + 1;
                this.P = i21;
            }
            n41 n41Var7 = b51Var.f45931e;
            if (n41Var7 != null && !n41Var7.f50217l && !n41Var7.f50208a) {
                int i22 = this.f48093d0;
                if (i22 > 0) {
                    this.f48093d0 = i22 + 1;
                    gVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.f48093d0;
                this.f48093d0 = i23 + 1;
                this.f48097n = i23;
            }
            n41 n41Var8 = b51Var.N;
            if (n41Var8 != null && !n41Var8.f50217l && !n41Var8.f50208a) {
                int i24 = this.f48093d0;
                if (i24 > 0) {
                    this.f48093d0 = i24 + 1;
                    gVar2.add(Integer.valueOf(i24));
                }
                int i25 = this.f48093d0;
                this.f48093d0 = i25 + 1;
                this.Q = i25;
            }
            if (arrayList4.size() > 0) {
                int i26 = this.f48093d0;
                if (i26 > 0) {
                    this.f48093d0 = i26 + 1;
                    gVar2.add(Integer.valueOf(i26));
                }
                int i27 = this.f48093d0;
                int i28 = i27 + 1;
                this.R = i27;
                this.f48093d0 = i27 + 2;
                this.S = i28;
                int size = arrayList4.size() + i28;
                this.T = size - 1;
                this.f48093d0 = size;
                if (arrayList4.size() != b51Var.O.size()) {
                    int i29 = this.f48093d0;
                    this.f48093d0 = i29 + 1;
                    this.f48089a0 = i29;
                } else {
                    int i30 = this.f48093d0;
                    this.f48093d0 = i30 + 1;
                    gVar.add(Integer.valueOf(i30));
                }
            }
            if (arrayList3.size() > 0) {
                int i31 = this.f48093d0;
                if (i31 > 0) {
                    this.f48093d0 = i31 + 1;
                    gVar2.add(Integer.valueOf(i31));
                }
                int i32 = this.f48093d0;
                int i33 = i32 + 1;
                this.U = i32;
                this.f48093d0 = i32 + 2;
                this.V = i33;
                int size2 = arrayList3.size() + i33;
                this.W = size2 - 1;
                this.f48093d0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i34 = this.f48093d0;
                if (i34 > 0) {
                    this.f48093d0 = i34 + 1;
                    gVar2.add(Integer.valueOf(i34));
                }
                int i35 = this.f48093d0;
                int i36 = i35 + 1;
                this.X = i35;
                this.f48093d0 = i35 + 2;
                this.Y = i36;
                int size3 = arrayList2.size() + i36;
                this.Z = size3 - 1;
                this.f48093d0 = size3;
            }
            int i37 = this.f48093d0;
            if (i37 > 0) {
                this.f48093d0 = i37 + 1;
                gVar.add(Integer.valueOf(i37));
                int i38 = this.f48093d0;
                this.f48093d0 = i38 + 1;
                gVar2.add(Integer.valueOf(i38));
                return;
            }
            return;
        }
        if (b51Var.f45933f != null) {
            int i39 = this.f48093d0;
            this.f48091c = i39;
            this.f48093d0 = i39 + 2;
            this.d = i39 + 1;
        }
        n41 n41Var9 = b51Var.d;
        if (n41Var9 != null && !n41Var9.f50217l) {
            int i40 = this.f48093d0;
            if (i40 > 0) {
                this.f48093d0 = i40 + 1;
                gVar2.add(Integer.valueOf(i40));
            }
            int i41 = this.f48093d0;
            this.f48093d0 = i41 + 1;
            this.f48094e = i41;
        }
        n41 n41Var10 = b51Var.h;
        if (n41Var10 != null && !n41Var10.f50217l) {
            int i42 = this.f48093d0;
            if (i42 > 0) {
                this.f48093d0 = i42 + 1;
                gVar2.add(Integer.valueOf(i42));
            }
            int i43 = this.f48093d0;
            this.f48093d0 = i43 + 1;
            this.h = i43;
        }
        n41 n41Var11 = b51Var.f45957y;
        if (n41Var11 != null && !n41Var11.f50217l) {
            int i44 = this.f48093d0;
            if (i44 > 0) {
                this.f48093d0 = i44 + 1;
                gVar2.add(Integer.valueOf(i44));
            }
            int i45 = this.f48093d0;
            this.f48093d0 = i45 + 1;
            this.E = i45;
        }
        n41 n41Var12 = b51Var.f45931e;
        if (n41Var12 != null && !n41Var12.f50217l) {
            int i46 = this.f48093d0;
            if (i46 > 0) {
                this.f48093d0 = i46 + 1;
                gVar2.add(Integer.valueOf(i46));
            }
            int i47 = this.f48093d0;
            this.f48093d0 = i47 + 1;
            this.f48097n = i47;
        }
        n41 n41Var13 = b51Var.f45948s;
        if (n41Var13 != null && !n41Var13.f50217l) {
            int i48 = this.f48093d0;
            if (i48 > 0) {
                this.f48093d0 = i48 + 1;
                gVar2.add(Integer.valueOf(i48));
            }
            int i49 = this.f48093d0;
            this.f48093d0 = i49 + 1;
            this.f48100w = i49;
        }
        n41 n41Var14 = b51Var.f45953w;
        if (n41Var14 != null && !n41Var14.f50217l) {
            int i50 = this.f48093d0;
            if (i50 > 0) {
                this.f48093d0 = i50 + 1;
                gVar2.add(Integer.valueOf(i50));
            }
            int i51 = this.f48093d0;
            this.f48093d0 = i51 + 1;
            this.f48101x = i51;
        }
        n41 n41Var15 = b51Var.f45955x;
        if (n41Var15 != null && !n41Var15.f50217l) {
            int i52 = this.f48093d0;
            if (i52 > 0) {
                this.f48093d0 = i52 + 1;
                gVar2.add(Integer.valueOf(i52));
            }
            int i53 = this.f48093d0;
            this.f48093d0 = i53 + 1;
            this.f48102y = i53;
        }
        n41 n41Var16 = b51Var.f45941n;
        if (n41Var16 != null && !n41Var16.f50217l) {
            int i54 = this.f48093d0;
            if (i54 > 0) {
                this.f48093d0 = i54 + 1;
                gVar2.add(Integer.valueOf(i54));
            }
            int i55 = this.f48093d0;
            this.f48093d0 = i55 + 1;
            this.f48098r = i55;
        }
        n41 n41Var17 = b51Var.f45946r;
        if (n41Var17 != null && !n41Var17.f50216k && !n41Var17.f50208a) {
            int i56 = this.f48093d0;
            if (i56 > 0) {
                this.f48093d0 = i56 + 1;
                gVar2.add(Integer.valueOf(i56));
            }
            int i57 = this.f48093d0;
            this.f48093d0 = i57 + 1;
            this.f48099s = i57;
        }
        n41 n41Var18 = b51Var.E;
        if (n41Var18 != null && !n41Var18.f50217l && !n41Var18.f50208a) {
            int i58 = this.f48093d0;
            if (i58 > 0) {
                this.f48093d0 = i58 + 1;
                gVar2.add(Integer.valueOf(i58));
            }
            int i59 = this.f48093d0;
            this.f48093d0 = i59 + 1;
            this.F = i59;
        }
        n41 n41Var19 = b51Var.F;
        if (n41Var19 != null && !n41Var19.f50217l && !n41Var19.f50208a) {
            int i60 = this.f48093d0;
            if (i60 > 0) {
                this.f48093d0 = i60 + 1;
                gVar2.add(Integer.valueOf(i60));
            }
            int i61 = this.f48093d0;
            this.f48093d0 = i61 + 1;
            this.G = i61;
        }
        n41 n41Var20 = b51Var.G;
        if (n41Var20 != null && !n41Var20.f50217l && !n41Var20.f50208a) {
            int i62 = this.f48093d0;
            if (i62 > 0) {
                this.f48093d0 = i62 + 1;
                gVar2.add(Integer.valueOf(i62));
            }
            int i63 = this.f48093d0;
            this.f48093d0 = i63 + 1;
            this.H = i63;
        }
        int i64 = this.f48093d0;
        this.f48093d0 = i64 + 1;
        gVar2.add(Integer.valueOf(i64));
        if (arrayList.size() > 0) {
            int i65 = this.f48093d0;
            int i66 = i65 + 1;
            this.I = i65;
            this.f48093d0 = i65 + 2;
            this.J = i66;
            int size4 = arrayList.size() + i66;
            this.K = size4 - 1;
            this.f48093d0 = size4;
            if (b51Var.f45954w0.size() != b51Var.f45952v0.size()) {
                int i67 = this.f48093d0;
                this.f48093d0 = i67 + 1;
                this.f48096f = i67;
            } else {
                int i68 = this.f48093d0;
                this.f48093d0 = i68 + 1;
                gVar.add(Integer.valueOf(i68));
            }
            int i69 = this.f48093d0;
            this.f48093d0 = i69 + 1;
            gVar2.add(Integer.valueOf(i69));
        }
    }

    @Override
    public final int b() {
        return this.f48093d0;
    }

    @Override
    public final long c(int i7) {
        int i10 = this.J;
        if (i7 >= i10 && i7 < this.K) {
            return ((y41) this.f48095e0.f45959z0.get(i7 - i10)).b();
        }
        if (i7 == this.f48094e) {
            return 1L;
        }
        if (i7 == this.h) {
            return 2L;
        }
        if (i7 == this.f48097n) {
            return 3L;
        }
        if (i7 == this.f48098r) {
            return 4L;
        }
        if (i7 == this.E) {
            return 5L;
        }
        if (i7 == this.f48099s) {
            return 6L;
        }
        if (i7 == this.f48100w) {
            return 7L;
        }
        if (i7 == this.f48101x) {
            return 8L;
        }
        if (i7 == this.f48102y) {
            return 9L;
        }
        if (i7 == this.L) {
            return 10L;
        }
        if (i7 == this.M) {
            return 11L;
        }
        if (i7 == this.N) {
            return 12L;
        }
        if (i7 == this.O) {
            return 13L;
        }
        if (i7 == this.P) {
            return 14L;
        }
        if (i7 == this.Q) {
            return 15L;
        }
        if (i7 == this.F) {
            return 16L;
        }
        if (i7 == this.G) {
            return 17L;
        }
        if (i7 == this.H) {
            return 18L;
        }
        return -1L;
    }

    @Override
    public final int d(int i7) {
        if (i7 != this.f48094e && i7 != this.h && i7 != this.f48097n && i7 != this.E && i7 != this.P && i7 != this.L) {
            if (i7 != this.f48098r && i7 != this.f48099s && i7 != this.G) {
                if (i7 != this.f48100w && i7 != this.f48101x && i7 != this.M && i7 != this.O && i7 != this.F && i7 != this.H) {
                    if (i7 != this.f48102y && i7 != this.N && i7 != this.Q) {
                        if (i7 >= this.J && i7 <= this.K) {
                            return 9;
                        }
                        if (i7 == this.f48096f) {
                            return 11;
                        }
                        if (this.f48092c0.contains(Integer.valueOf(i7))) {
                            return 12;
                        }
                        if (i7 != this.I && i7 != this.f48091c && i7 != this.U && i7 != this.R && i7 != this.X) {
                            if (i7 == this.d) {
                                return 14;
                            }
                            if ((i7 >= this.V && i7 <= this.W) || ((i7 >= this.S && i7 <= this.T) || (i7 >= this.Y && i7 <= this.Z))) {
                                return 9;
                            }
                            if (i7 == this.f48089a0) {
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
    public final void t(v4.f1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g41.t(v4.f1, int):void");
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.y4 y4Var;
        int i10;
        int i11 = 4;
        b51 b51Var = this.f48095e0;
        if (i7 >= 0 && i7 <= 4) {
            Context context = viewGroup.getContext();
            i10 = ((org.telegram.ui.ActionBar.g2) b51Var).currentAccount;
            View m41Var = new m41(b51Var, context, i10, i7, b51Var.f45925a0);
            m41Var.setWillNotDraw(false);
            y4Var = m41Var;
        } else if (i7 == 9) {
            View w7Var = new org.telegram.ui.Cells.w7(viewGroup.getContext(), b51Var.f45924a, b51Var.getResourceProvider());
            w7Var.setWillNotDraw(false);
            y4Var = w7Var;
        } else if (i7 == 11) {
            y4Var = new org.telegram.ui.Cells.u4(viewGroup.getContext());
        } else if (i7 == 12) {
            y4Var = new org.telegram.ui.Cells.n3(viewGroup.getContext(), org.telegram.messenger.g0.L(15.0f));
        } else if (i7 == 13) {
            View cVar = new ng.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
            y4Var = cVar;
        } else if (i7 == 14) {
            Context context2 = viewGroup.getContext();
            if (b51Var.f45929c0) {
                i11 = 2;
            }
            y4Var = new v41(context2, i11);
        } else if (i7 == 15) {
            org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(viewGroup.getContext());
            y4Var2.a(org.telegram.ui.ActionBar.n6.f29786v6, org.telegram.ui.ActionBar.n6.f29767u6);
            y4Var = y4Var2;
        } else {
            y4Var = new org.telegram.ui.Cells.y6(viewGroup.getContext(), 0, 0);
        }
        return i5.c.q(y4Var, y4Var, -1, -2);
    }
}

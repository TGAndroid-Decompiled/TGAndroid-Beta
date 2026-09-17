package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class fa1 extends org.telegram.ui.Components.ll0 {
    public int f33602c0;
    public int d;
    public final ab1 f33603d0;
    public int f33601c = -1;
    public int e = -1;
    public int f33604f = -1;
    public int h = -1;
    public int f33605n = -1;
    public int f33606r = -1;
    public int f33607s = -1;
    public int v = -1;
    public int f33608w = -1;
    public int f33609x = -1;
    public int f33610y = -1;
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
    public final a0.g f33599a0 = new a0.g(0);
    public final a0.g f33600b0 = new a0.g(0);

    public fa1(ab1 ab1Var) {
        this.f33603d0 = ab1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42700f;
        if (i10 != 9 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.f33606r = -1;
        this.v = -1;
        this.f33608w = -1;
        this.f33609x = -1;
        this.I = -1;
        this.J = -1;
        this.f33604f = -1;
        this.H = -1;
        this.f33607s = -1;
        this.f33605n = -1;
        this.f33610y = -1;
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
        this.f33602c0 = 0;
        a0.g gVar = this.f33600b0;
        gVar.clear();
        a0.g gVar2 = this.f33599a0;
        gVar2.clear();
        ab1 ab1Var = this.f33603d0;
        ArrayList arrayList = ab1Var.f31809v0;
        ArrayList arrayList2 = ab1Var.P;
        ArrayList arrayList3 = ab1Var.Q;
        ArrayList arrayList4 = ab1Var.O;
        if (ab1Var.f31787c0) {
            if (ab1Var.G != null) {
                int i10 = this.f33602c0;
                this.f33601c = i10;
                this.f33602c0 = i10 + 2;
                this.d = i10 + 1;
            }
            ma1 ma1Var = ab1Var.d;
            if (ma1Var != null && !ma1Var.f35749l) {
                int i11 = this.f33602c0;
                if (i11 > 0) {
                    this.f33602c0 = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.f33602c0;
                this.f33602c0 = i12 + 1;
                this.e = i12;
            }
            ma1 ma1Var2 = ab1Var.H;
            if (ma1Var2 != null && !ma1Var2.f35749l) {
                int i13 = this.f33602c0;
                if (i13 > 0) {
                    this.f33602c0 = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.f33602c0;
                this.f33602c0 = i14 + 1;
                this.K = i14;
            }
            ma1 ma1Var3 = ab1Var.I;
            if (ma1Var3 != null && !ma1Var3.f35749l && !ma1Var3.f35741a) {
                int i15 = this.f33602c0;
                if (i15 > 0) {
                    this.f33602c0 = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.f33602c0;
                this.f33602c0 = i16 + 1;
                this.L = i16;
            }
            ma1 ma1Var4 = ab1Var.J;
            if (ma1Var4 != null && !ma1Var4.f35749l && !ma1Var4.f35741a) {
                int i17 = this.f33602c0;
                if (i17 > 0) {
                    this.f33602c0 = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.f33602c0;
                this.f33602c0 = i18 + 1;
                this.M = i18;
            }
            ma1 ma1Var5 = ab1Var.K;
            if (ma1Var5 != null && !ma1Var5.f35749l && !ma1Var5.f35741a) {
                int i19 = this.f33602c0;
                if (i19 > 0) {
                    this.f33602c0 = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.f33602c0;
                this.f33602c0 = i20 + 1;
                this.N = i20;
            }
            ma1 ma1Var6 = ab1Var.L;
            if (ma1Var6 != null && !ma1Var6.f35749l && !ma1Var6.f35741a) {
                int i21 = this.f33602c0;
                if (i21 > 0) {
                    this.f33602c0 = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.f33602c0;
                this.f33602c0 = i22 + 1;
                this.O = i22;
            }
            ma1 ma1Var7 = ab1Var.e;
            if (ma1Var7 != null && !ma1Var7.f35749l && !ma1Var7.f35741a) {
                int i23 = this.f33602c0;
                if (i23 > 0) {
                    this.f33602c0 = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.f33602c0;
                this.f33602c0 = i24 + 1;
                this.f33605n = i24;
            }
            ma1 ma1Var8 = ab1Var.M;
            if (ma1Var8 != null && !ma1Var8.f35749l && !ma1Var8.f35741a) {
                int i25 = this.f33602c0;
                if (i25 > 0) {
                    this.f33602c0 = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.f33602c0;
                this.f33602c0 = i26 + 1;
                this.P = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.f33602c0;
                if (i27 > 0) {
                    this.f33602c0 = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.f33602c0;
                int i29 = i28 + 1;
                this.Q = i28;
                this.f33602c0 = i28 + 2;
                this.R = i29;
                int size = arrayList4.size() + i29;
                this.S = size - 1;
                this.f33602c0 = size;
                if (arrayList4.size() != ab1Var.N.size()) {
                    int i30 = this.f33602c0;
                    this.f33602c0 = i30 + 1;
                    this.Z = i30;
                } else {
                    int i31 = this.f33602c0;
                    this.f33602c0 = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.f33602c0;
                if (i32 > 0) {
                    this.f33602c0 = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.f33602c0;
                int i34 = i33 + 1;
                this.T = i33;
                this.f33602c0 = i33 + 2;
                this.U = i34;
                int size2 = arrayList3.size() + i34;
                this.V = size2 - 1;
                this.f33602c0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.f33602c0;
                if (i35 > 0) {
                    this.f33602c0 = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.f33602c0;
                int i37 = i36 + 1;
                this.W = i36;
                this.f33602c0 = i36 + 2;
                this.X = i37;
                int size3 = arrayList2.size() + i37;
                this.Y = size3 - 1;
                this.f33602c0 = size3;
            }
            int i38 = this.f33602c0;
            if (i38 > 0) {
                this.f33602c0 = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.f33602c0;
                this.f33602c0 = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (ab1Var.f31790f != null) {
            int i40 = this.f33602c0;
            this.f33601c = i40;
            this.f33602c0 = i40 + 2;
            this.d = i40 + 1;
        }
        ma1 ma1Var9 = ab1Var.d;
        if (ma1Var9 != null && !ma1Var9.f35749l) {
            int i41 = this.f33602c0;
            if (i41 > 0) {
                this.f33602c0 = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.f33602c0;
            this.f33602c0 = i42 + 1;
            this.e = i42;
        }
        ma1 ma1Var10 = ab1Var.h;
        if (ma1Var10 != null && !ma1Var10.f35749l) {
            int i43 = this.f33602c0;
            if (i43 > 0) {
                this.f33602c0 = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.f33602c0;
            this.f33602c0 = i44 + 1;
            this.h = i44;
        }
        ma1 ma1Var11 = ab1Var.f31812x;
        if (ma1Var11 != null && !ma1Var11.f35749l) {
            int i45 = this.f33602c0;
            if (i45 > 0) {
                this.f33602c0 = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.f33602c0;
            this.f33602c0 = i46 + 1;
            this.f33610y = i46;
        }
        ma1 ma1Var12 = ab1Var.e;
        if (ma1Var12 != null && !ma1Var12.f35749l) {
            int i47 = this.f33602c0;
            if (i47 > 0) {
                this.f33602c0 = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.f33602c0;
            this.f33602c0 = i48 + 1;
            this.f33605n = i48;
        }
        ma1 ma1Var13 = ab1Var.f31805s;
        if (ma1Var13 != null && !ma1Var13.f35749l) {
            int i49 = this.f33602c0;
            if (i49 > 0) {
                this.f33602c0 = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.f33602c0;
            this.f33602c0 = i50 + 1;
            this.v = i50;
        }
        ma1 ma1Var14 = ab1Var.v;
        if (ma1Var14 != null && !ma1Var14.f35749l) {
            int i51 = this.f33602c0;
            if (i51 > 0) {
                this.f33602c0 = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.f33602c0;
            this.f33602c0 = i52 + 1;
            this.f33608w = i52;
        }
        ma1 ma1Var15 = ab1Var.f31810w;
        if (ma1Var15 != null && !ma1Var15.f35749l) {
            int i53 = this.f33602c0;
            if (i53 > 0) {
                this.f33602c0 = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.f33602c0;
            this.f33602c0 = i54 + 1;
            this.f33609x = i54;
        }
        ma1 ma1Var16 = ab1Var.f31798n;
        if (ma1Var16 != null && !ma1Var16.f35749l) {
            int i55 = this.f33602c0;
            if (i55 > 0) {
                this.f33602c0 = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.f33602c0;
            this.f33602c0 = i56 + 1;
            this.f33606r = i56;
        }
        ma1 ma1Var17 = ab1Var.f31803r;
        if (ma1Var17 != null && !ma1Var17.f35748k && !ma1Var17.f35741a) {
            int i57 = this.f33602c0;
            if (i57 > 0) {
                this.f33602c0 = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.f33602c0;
            this.f33602c0 = i58 + 1;
            this.f33607s = i58;
        }
        ma1 ma1Var18 = ab1Var.f31814y;
        if (ma1Var18 != null && !ma1Var18.f35749l && !ma1Var18.f35741a) {
            int i59 = this.f33602c0;
            if (i59 > 0) {
                this.f33602c0 = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.f33602c0;
            this.f33602c0 = i60 + 1;
            this.E = i60;
        }
        ma1 ma1Var19 = ab1Var.E;
        if (ma1Var19 != null && !ma1Var19.f35749l && !ma1Var19.f35741a) {
            int i61 = this.f33602c0;
            if (i61 > 0) {
                this.f33602c0 = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.f33602c0;
            this.f33602c0 = i62 + 1;
            this.F = i62;
        }
        ma1 ma1Var20 = ab1Var.F;
        if (ma1Var20 != null && !ma1Var20.f35749l && !ma1Var20.f35741a) {
            int i63 = this.f33602c0;
            if (i63 > 0) {
                this.f33602c0 = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.f33602c0;
            this.f33602c0 = i64 + 1;
            this.G = i64;
        }
        int i65 = this.f33602c0;
        this.f33602c0 = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.f33602c0;
            int i67 = i66 + 1;
            this.H = i66;
            this.f33602c0 = i66 + 2;
            this.I = i67;
            int size4 = arrayList.size() + i67;
            this.J = size4 - 1;
            this.f33602c0 = size4;
            if (ab1Var.f31806s0.size() != ab1Var.f31804r0.size()) {
                int i68 = this.f33602c0;
                this.f33602c0 = i68 + 1;
                this.f33604f = i68;
            } else {
                int i69 = this.f33602c0;
                this.f33602c0 = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.f33602c0;
            this.f33602c0 = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override
    public final int h() {
        return this.f33602c0;
    }

    @Override
    public final long i(int i10) {
        int i11 = this.I;
        if (i10 >= i11 && i10 < this.J) {
            return ((xa1) this.f33603d0.f31809v0.get(i10 - i11)).b();
        }
        if (i10 == this.e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.f33605n) {
            return 3L;
        }
        if (i10 == this.f33606r) {
            return 4L;
        }
        if (i10 == this.f33610y) {
            return 5L;
        }
        if (i10 == this.f33607s) {
            return 6L;
        }
        if (i10 == this.v) {
            return 7L;
        }
        if (i10 == this.f33608w) {
            return 8L;
        }
        if (i10 == this.f33609x) {
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
        if (i10 != this.e && i10 != this.h && i10 != this.f33605n && i10 != this.f33610y && i10 != this.O && i10 != this.K) {
            if (i10 != this.f33606r && i10 != this.f33607s && i10 != this.F) {
                if (i10 != this.v && i10 != this.f33608w && i10 != this.L && i10 != this.N && i10 != this.E && i10 != this.G) {
                    if (i10 != this.f33609x && i10 != this.M && i10 != this.P) {
                        if (i10 >= this.I && i10 <= this.J) {
                            return 9;
                        }
                        if (i10 == this.f33604f) {
                            return 11;
                        }
                        if (this.f33600b0.contains(Integer.valueOf(i10))) {
                            return 12;
                        }
                        if (i10 != this.H && i10 != this.f33601c && i10 != this.T && i10 != this.Q && i10 != this.W) {
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
    public final void v(s4.c1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fa1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.x4 x4Var;
        int i11;
        int i12 = 4;
        ab1 ab1Var = this.f33603d0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.o2) ab1Var).currentAccount;
            View la1Var = new la1(ab1Var, context, i11, i10, ab1Var.f31783a0);
            la1Var.setWillNotDraw(false);
            x4Var = la1Var;
        } else if (i10 == 9) {
            View c8Var = new org.telegram.ui.Cells.c8(viewGroup.getContext(), ab1Var.f31782a, ab1Var.getResourceProvider());
            c8Var.setWillNotDraw(false);
            x4Var = c8Var;
        } else if (i10 == 11) {
            x4Var = new org.telegram.ui.Cells.r4(viewGroup.getContext());
        } else if (i10 == 12) {
            x4Var = new org.telegram.ui.Cells.k3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View cVar = new kg.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
            x4Var = cVar;
        } else if (i10 == 14) {
            Context context2 = viewGroup.getContext();
            if (ab1Var.f31787c0) {
                i12 = 2;
            }
            x4Var = new ua1(context2, i12);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(viewGroup.getContext());
            x4Var2.a(org.telegram.ui.ActionBar.j6.f19192v6, org.telegram.ui.ActionBar.j6.f19174u6);
            x4Var = x4Var2;
        } else {
            x4Var = new org.telegram.ui.Cells.a7(viewGroup.getContext(), 0, 0);
        }
        return com.google.android.gms.internal.vision.e2.k(x4Var, x4Var, -1, -2);
    }
}

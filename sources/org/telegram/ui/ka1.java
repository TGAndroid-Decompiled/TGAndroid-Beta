package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class ka1 extends org.telegram.ui.Components.ul0 {
    public int f34315c0;
    public int d;
    public final fb1 f34316d0;
    public int f34314c = -1;
    public int e = -1;
    public int f34317f = -1;
    public int h = -1;
    public int f34318n = -1;
    public int f34319r = -1;
    public int f34320s = -1;
    public int v = -1;
    public int f34321w = -1;
    public int f34322x = -1;
    public int f34323y = -1;
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
    public final a0.g f34312a0 = new a0.g(0);
    public final a0.g f34313b0 = new a0.g(0);

    public ka1(fb1 fb1Var) {
        this.f34316d0 = fb1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
        if (i10 != 9 && i10 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.e = -1;
        this.h = -1;
        this.f34319r = -1;
        this.v = -1;
        this.f34321w = -1;
        this.f34322x = -1;
        this.I = -1;
        this.J = -1;
        this.f34317f = -1;
        this.H = -1;
        this.f34320s = -1;
        this.f34318n = -1;
        this.f34323y = -1;
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
        this.f34315c0 = 0;
        a0.g gVar = this.f34313b0;
        gVar.clear();
        a0.g gVar2 = this.f34312a0;
        gVar2.clear();
        fb1 fb1Var = this.f34316d0;
        ArrayList arrayList = fb1Var.f32767v0;
        ArrayList arrayList2 = fb1Var.P;
        ArrayList arrayList3 = fb1Var.Q;
        ArrayList arrayList4 = fb1Var.O;
        if (fb1Var.f32745c0) {
            if (fb1Var.G != null) {
                int i10 = this.f34315c0;
                this.f34314c = i10;
                this.f34315c0 = i10 + 2;
                this.d = i10 + 1;
            }
            ra1 ra1Var = fb1Var.d;
            if (ra1Var != null && !ra1Var.f36320l) {
                int i11 = this.f34315c0;
                if (i11 > 0) {
                    this.f34315c0 = i11 + 1;
                    gVar2.add(Integer.valueOf(i11));
                }
                int i12 = this.f34315c0;
                this.f34315c0 = i12 + 1;
                this.e = i12;
            }
            ra1 ra1Var2 = fb1Var.H;
            if (ra1Var2 != null && !ra1Var2.f36320l) {
                int i13 = this.f34315c0;
                if (i13 > 0) {
                    this.f34315c0 = i13 + 1;
                    gVar2.add(Integer.valueOf(i13));
                }
                int i14 = this.f34315c0;
                this.f34315c0 = i14 + 1;
                this.K = i14;
            }
            ra1 ra1Var3 = fb1Var.I;
            if (ra1Var3 != null && !ra1Var3.f36320l && !ra1Var3.f36312a) {
                int i15 = this.f34315c0;
                if (i15 > 0) {
                    this.f34315c0 = i15 + 1;
                    gVar2.add(Integer.valueOf(i15));
                }
                int i16 = this.f34315c0;
                this.f34315c0 = i16 + 1;
                this.L = i16;
            }
            ra1 ra1Var4 = fb1Var.J;
            if (ra1Var4 != null && !ra1Var4.f36320l && !ra1Var4.f36312a) {
                int i17 = this.f34315c0;
                if (i17 > 0) {
                    this.f34315c0 = i17 + 1;
                    gVar2.add(Integer.valueOf(i17));
                }
                int i18 = this.f34315c0;
                this.f34315c0 = i18 + 1;
                this.M = i18;
            }
            ra1 ra1Var5 = fb1Var.K;
            if (ra1Var5 != null && !ra1Var5.f36320l && !ra1Var5.f36312a) {
                int i19 = this.f34315c0;
                if (i19 > 0) {
                    this.f34315c0 = i19 + 1;
                    gVar2.add(Integer.valueOf(i19));
                }
                int i20 = this.f34315c0;
                this.f34315c0 = i20 + 1;
                this.N = i20;
            }
            ra1 ra1Var6 = fb1Var.L;
            if (ra1Var6 != null && !ra1Var6.f36320l && !ra1Var6.f36312a) {
                int i21 = this.f34315c0;
                if (i21 > 0) {
                    this.f34315c0 = i21 + 1;
                    gVar2.add(Integer.valueOf(i21));
                }
                int i22 = this.f34315c0;
                this.f34315c0 = i22 + 1;
                this.O = i22;
            }
            ra1 ra1Var7 = fb1Var.e;
            if (ra1Var7 != null && !ra1Var7.f36320l && !ra1Var7.f36312a) {
                int i23 = this.f34315c0;
                if (i23 > 0) {
                    this.f34315c0 = i23 + 1;
                    gVar2.add(Integer.valueOf(i23));
                }
                int i24 = this.f34315c0;
                this.f34315c0 = i24 + 1;
                this.f34318n = i24;
            }
            ra1 ra1Var8 = fb1Var.M;
            if (ra1Var8 != null && !ra1Var8.f36320l && !ra1Var8.f36312a) {
                int i25 = this.f34315c0;
                if (i25 > 0) {
                    this.f34315c0 = i25 + 1;
                    gVar2.add(Integer.valueOf(i25));
                }
                int i26 = this.f34315c0;
                this.f34315c0 = i26 + 1;
                this.P = i26;
            }
            if (arrayList4.size() > 0) {
                int i27 = this.f34315c0;
                if (i27 > 0) {
                    this.f34315c0 = i27 + 1;
                    gVar2.add(Integer.valueOf(i27));
                }
                int i28 = this.f34315c0;
                int i29 = i28 + 1;
                this.Q = i28;
                this.f34315c0 = i28 + 2;
                this.R = i29;
                int size = arrayList4.size() + i29;
                this.S = size - 1;
                this.f34315c0 = size;
                if (arrayList4.size() != fb1Var.N.size()) {
                    int i30 = this.f34315c0;
                    this.f34315c0 = i30 + 1;
                    this.Z = i30;
                } else {
                    int i31 = this.f34315c0;
                    this.f34315c0 = i31 + 1;
                    gVar.add(Integer.valueOf(i31));
                }
            }
            if (arrayList3.size() > 0) {
                int i32 = this.f34315c0;
                if (i32 > 0) {
                    this.f34315c0 = i32 + 1;
                    gVar2.add(Integer.valueOf(i32));
                }
                int i33 = this.f34315c0;
                int i34 = i33 + 1;
                this.T = i33;
                this.f34315c0 = i33 + 2;
                this.U = i34;
                int size2 = arrayList3.size() + i34;
                this.V = size2 - 1;
                this.f34315c0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i35 = this.f34315c0;
                if (i35 > 0) {
                    this.f34315c0 = i35 + 1;
                    gVar2.add(Integer.valueOf(i35));
                }
                int i36 = this.f34315c0;
                int i37 = i36 + 1;
                this.W = i36;
                this.f34315c0 = i36 + 2;
                this.X = i37;
                int size3 = arrayList2.size() + i37;
                this.Y = size3 - 1;
                this.f34315c0 = size3;
            }
            int i38 = this.f34315c0;
            if (i38 > 0) {
                this.f34315c0 = i38 + 1;
                gVar.add(Integer.valueOf(i38));
                int i39 = this.f34315c0;
                this.f34315c0 = i39 + 1;
                gVar2.add(Integer.valueOf(i39));
                return;
            }
            return;
        }
        if (fb1Var.f32748f != null) {
            int i40 = this.f34315c0;
            this.f34314c = i40;
            this.f34315c0 = i40 + 2;
            this.d = i40 + 1;
        }
        ra1 ra1Var9 = fb1Var.d;
        if (ra1Var9 != null && !ra1Var9.f36320l) {
            int i41 = this.f34315c0;
            if (i41 > 0) {
                this.f34315c0 = i41 + 1;
                gVar2.add(Integer.valueOf(i41));
            }
            int i42 = this.f34315c0;
            this.f34315c0 = i42 + 1;
            this.e = i42;
        }
        ra1 ra1Var10 = fb1Var.h;
        if (ra1Var10 != null && !ra1Var10.f36320l) {
            int i43 = this.f34315c0;
            if (i43 > 0) {
                this.f34315c0 = i43 + 1;
                gVar2.add(Integer.valueOf(i43));
            }
            int i44 = this.f34315c0;
            this.f34315c0 = i44 + 1;
            this.h = i44;
        }
        ra1 ra1Var11 = fb1Var.f32770x;
        if (ra1Var11 != null && !ra1Var11.f36320l) {
            int i45 = this.f34315c0;
            if (i45 > 0) {
                this.f34315c0 = i45 + 1;
                gVar2.add(Integer.valueOf(i45));
            }
            int i46 = this.f34315c0;
            this.f34315c0 = i46 + 1;
            this.f34323y = i46;
        }
        ra1 ra1Var12 = fb1Var.e;
        if (ra1Var12 != null && !ra1Var12.f36320l) {
            int i47 = this.f34315c0;
            if (i47 > 0) {
                this.f34315c0 = i47 + 1;
                gVar2.add(Integer.valueOf(i47));
            }
            int i48 = this.f34315c0;
            this.f34315c0 = i48 + 1;
            this.f34318n = i48;
        }
        ra1 ra1Var13 = fb1Var.f32763s;
        if (ra1Var13 != null && !ra1Var13.f36320l) {
            int i49 = this.f34315c0;
            if (i49 > 0) {
                this.f34315c0 = i49 + 1;
                gVar2.add(Integer.valueOf(i49));
            }
            int i50 = this.f34315c0;
            this.f34315c0 = i50 + 1;
            this.v = i50;
        }
        ra1 ra1Var14 = fb1Var.v;
        if (ra1Var14 != null && !ra1Var14.f36320l) {
            int i51 = this.f34315c0;
            if (i51 > 0) {
                this.f34315c0 = i51 + 1;
                gVar2.add(Integer.valueOf(i51));
            }
            int i52 = this.f34315c0;
            this.f34315c0 = i52 + 1;
            this.f34321w = i52;
        }
        ra1 ra1Var15 = fb1Var.f32768w;
        if (ra1Var15 != null && !ra1Var15.f36320l) {
            int i53 = this.f34315c0;
            if (i53 > 0) {
                this.f34315c0 = i53 + 1;
                gVar2.add(Integer.valueOf(i53));
            }
            int i54 = this.f34315c0;
            this.f34315c0 = i54 + 1;
            this.f34322x = i54;
        }
        ra1 ra1Var16 = fb1Var.f32756n;
        if (ra1Var16 != null && !ra1Var16.f36320l) {
            int i55 = this.f34315c0;
            if (i55 > 0) {
                this.f34315c0 = i55 + 1;
                gVar2.add(Integer.valueOf(i55));
            }
            int i56 = this.f34315c0;
            this.f34315c0 = i56 + 1;
            this.f34319r = i56;
        }
        ra1 ra1Var17 = fb1Var.f32761r;
        if (ra1Var17 != null && !ra1Var17.f36319k && !ra1Var17.f36312a) {
            int i57 = this.f34315c0;
            if (i57 > 0) {
                this.f34315c0 = i57 + 1;
                gVar2.add(Integer.valueOf(i57));
            }
            int i58 = this.f34315c0;
            this.f34315c0 = i58 + 1;
            this.f34320s = i58;
        }
        ra1 ra1Var18 = fb1Var.f32772y;
        if (ra1Var18 != null && !ra1Var18.f36320l && !ra1Var18.f36312a) {
            int i59 = this.f34315c0;
            if (i59 > 0) {
                this.f34315c0 = i59 + 1;
                gVar2.add(Integer.valueOf(i59));
            }
            int i60 = this.f34315c0;
            this.f34315c0 = i60 + 1;
            this.E = i60;
        }
        ra1 ra1Var19 = fb1Var.E;
        if (ra1Var19 != null && !ra1Var19.f36320l && !ra1Var19.f36312a) {
            int i61 = this.f34315c0;
            if (i61 > 0) {
                this.f34315c0 = i61 + 1;
                gVar2.add(Integer.valueOf(i61));
            }
            int i62 = this.f34315c0;
            this.f34315c0 = i62 + 1;
            this.F = i62;
        }
        ra1 ra1Var20 = fb1Var.F;
        if (ra1Var20 != null && !ra1Var20.f36320l && !ra1Var20.f36312a) {
            int i63 = this.f34315c0;
            if (i63 > 0) {
                this.f34315c0 = i63 + 1;
                gVar2.add(Integer.valueOf(i63));
            }
            int i64 = this.f34315c0;
            this.f34315c0 = i64 + 1;
            this.G = i64;
        }
        int i65 = this.f34315c0;
        this.f34315c0 = i65 + 1;
        gVar2.add(Integer.valueOf(i65));
        if (arrayList.size() > 0) {
            int i66 = this.f34315c0;
            int i67 = i66 + 1;
            this.H = i66;
            this.f34315c0 = i66 + 2;
            this.I = i67;
            int size4 = arrayList.size() + i67;
            this.J = size4 - 1;
            this.f34315c0 = size4;
            if (fb1Var.f32764s0.size() != fb1Var.f32762r0.size()) {
                int i68 = this.f34315c0;
                this.f34315c0 = i68 + 1;
                this.f34317f = i68;
            } else {
                int i69 = this.f34315c0;
                this.f34315c0 = i69 + 1;
                gVar.add(Integer.valueOf(i69));
            }
            int i70 = this.f34315c0;
            this.f34315c0 = i70 + 1;
            gVar2.add(Integer.valueOf(i70));
        }
    }

    @Override
    public final int h() {
        return this.f34315c0;
    }

    @Override
    public final long i(int i10) {
        int i11 = this.I;
        if (i10 >= i11 && i10 < this.J) {
            return ((cb1) this.f34316d0.f32767v0.get(i10 - i11)).b();
        }
        if (i10 == this.e) {
            return 1L;
        }
        if (i10 == this.h) {
            return 2L;
        }
        if (i10 == this.f34318n) {
            return 3L;
        }
        if (i10 == this.f34319r) {
            return 4L;
        }
        if (i10 == this.f34323y) {
            return 5L;
        }
        if (i10 == this.f34320s) {
            return 6L;
        }
        if (i10 == this.v) {
            return 7L;
        }
        if (i10 == this.f34321w) {
            return 8L;
        }
        if (i10 == this.f34322x) {
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
        if (i10 != this.e && i10 != this.h && i10 != this.f34318n && i10 != this.f34323y && i10 != this.O && i10 != this.K) {
            if (i10 != this.f34319r && i10 != this.f34320s && i10 != this.F) {
                if (i10 != this.v && i10 != this.f34321w && i10 != this.L && i10 != this.N && i10 != this.E && i10 != this.G) {
                    if (i10 != this.f34322x && i10 != this.M && i10 != this.P) {
                        if (i10 >= this.I && i10 <= this.J) {
                            return 9;
                        }
                        if (i10 == this.f34317f) {
                            return 11;
                        }
                        if (this.f34313b0.contains(Integer.valueOf(i10))) {
                            return 12;
                        }
                        if (i10 != this.H && i10 != this.f34314c && i10 != this.T && i10 != this.Q && i10 != this.W) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ka1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.y4 y4Var;
        int i11;
        int i12 = 4;
        fb1 fb1Var = this.f34316d0;
        if (i10 >= 0 && i10 <= 4) {
            Context context = viewGroup.getContext();
            i11 = ((org.telegram.ui.ActionBar.p2) fb1Var).currentAccount;
            View qa1Var = new qa1(fb1Var, context, i11, i10, fb1Var.f32741a0);
            qa1Var.setWillNotDraw(false);
            y4Var = qa1Var;
        } else if (i10 == 9) {
            View d8Var = new org.telegram.ui.Cells.d8(viewGroup.getContext(), fb1Var.f32740a, fb1Var.getResourceProvider());
            d8Var.setWillNotDraw(false);
            y4Var = d8Var;
        } else if (i10 == 11) {
            y4Var = new org.telegram.ui.Cells.s4(viewGroup.getContext());
        } else if (i10 == 12) {
            y4Var = new org.telegram.ui.Cells.k3(viewGroup.getContext(), AndroidUtilities.dp(15.0f));
        } else if (i10 == 13) {
            View cVar = new jg.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), AndroidUtilities.dp(16.0f), cVar.getRight(), AndroidUtilities.dp(16.0f));
            y4Var = cVar;
        } else if (i10 == 14) {
            Context context2 = viewGroup.getContext();
            if (fb1Var.f32745c0) {
                i12 = 2;
            }
            y4Var = new za1(context2, i12);
        } else if (i10 == 15) {
            org.telegram.ui.Cells.y4 y4Var2 = new org.telegram.ui.Cells.y4(viewGroup.getContext());
            y4Var2.a(org.telegram.ui.ActionBar.j6.f18254v6, org.telegram.ui.ActionBar.j6.f18236u6);
            y4Var = y4Var2;
        } else {
            y4Var = new org.telegram.ui.Cells.c7(viewGroup.getContext(), 0, 0);
        }
        return com.google.android.gms.internal.vision.e2.j(y4Var, y4Var, -1, -2);
    }
}

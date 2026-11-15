package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class e41 extends org.telegram.ui.Components.tj0 {
    public int d;
    public int f46543d0;
    public final z41 f46545e0;
    public int f46541c = -1;
    public int f46544e = -1;
    public int f46546f = -1;
    public int h = -1;
    public int f46547n = -1;
    public int f46548r = -1;
    public int f46549s = -1;
    public int f46550w = -1;
    public int f46551x = -1;
    public int f46552y = -1;
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
    public int f46539a0 = -1;
    public final a0.g f46540b0 = new a0.g(0);
    public final a0.g f46542c0 = new a0.g(0);

    public e41(z41 z41Var) {
        this.f46545e0 = z41Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 != 9 && i7 != 15) {
            return false;
        }
        return true;
    }

    public final void E() {
        this.f46544e = -1;
        this.h = -1;
        this.f46548r = -1;
        this.f46550w = -1;
        this.f46551x = -1;
        this.f46552y = -1;
        this.J = -1;
        this.K = -1;
        this.f46546f = -1;
        this.I = -1;
        this.f46549s = -1;
        this.f46547n = -1;
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
        this.f46539a0 = -1;
        this.f46543d0 = 0;
        a0.g gVar = this.f46542c0;
        gVar.clear();
        a0.g gVar2 = this.f46540b0;
        gVar2.clear();
        z41 z41Var = this.f46545e0;
        ArrayList arrayList = z41Var.f53842z0;
        ArrayList arrayList2 = z41Var.Q;
        ArrayList arrayList3 = z41Var.R;
        ArrayList arrayList4 = z41Var.P;
        if (z41Var.f53812c0) {
            if (z41Var.H != null) {
                int i7 = this.f46543d0;
                this.f46541c = i7;
                this.f46543d0 = i7 + 2;
                this.d = i7 + 1;
            }
            l41 l41Var = z41Var.d;
            if (l41Var != null && !l41Var.f48835l) {
                int i10 = this.f46543d0;
                if (i10 > 0) {
                    this.f46543d0 = i10 + 1;
                    gVar2.add(Integer.valueOf(i10));
                }
                int i11 = this.f46543d0;
                this.f46543d0 = i11 + 1;
                this.f46544e = i11;
            }
            l41 l41Var2 = z41Var.I;
            if (l41Var2 != null && !l41Var2.f48835l) {
                int i12 = this.f46543d0;
                if (i12 > 0) {
                    this.f46543d0 = i12 + 1;
                    gVar2.add(Integer.valueOf(i12));
                }
                int i13 = this.f46543d0;
                this.f46543d0 = i13 + 1;
                this.L = i13;
            }
            l41 l41Var3 = z41Var.J;
            if (l41Var3 != null && !l41Var3.f48835l && !l41Var3.f48826a) {
                int i14 = this.f46543d0;
                if (i14 > 0) {
                    this.f46543d0 = i14 + 1;
                    gVar2.add(Integer.valueOf(i14));
                }
                int i15 = this.f46543d0;
                this.f46543d0 = i15 + 1;
                this.M = i15;
            }
            l41 l41Var4 = z41Var.K;
            if (l41Var4 != null && !l41Var4.f48835l && !l41Var4.f48826a) {
                int i16 = this.f46543d0;
                if (i16 > 0) {
                    this.f46543d0 = i16 + 1;
                    gVar2.add(Integer.valueOf(i16));
                }
                int i17 = this.f46543d0;
                this.f46543d0 = i17 + 1;
                this.N = i17;
            }
            l41 l41Var5 = z41Var.L;
            if (l41Var5 != null && !l41Var5.f48835l && !l41Var5.f48826a) {
                int i18 = this.f46543d0;
                if (i18 > 0) {
                    this.f46543d0 = i18 + 1;
                    gVar2.add(Integer.valueOf(i18));
                }
                int i19 = this.f46543d0;
                this.f46543d0 = i19 + 1;
                this.O = i19;
            }
            l41 l41Var6 = z41Var.M;
            if (l41Var6 != null && !l41Var6.f48835l && !l41Var6.f48826a) {
                int i20 = this.f46543d0;
                if (i20 > 0) {
                    this.f46543d0 = i20 + 1;
                    gVar2.add(Integer.valueOf(i20));
                }
                int i21 = this.f46543d0;
                this.f46543d0 = i21 + 1;
                this.P = i21;
            }
            l41 l41Var7 = z41Var.f53814e;
            if (l41Var7 != null && !l41Var7.f48835l && !l41Var7.f48826a) {
                int i22 = this.f46543d0;
                if (i22 > 0) {
                    this.f46543d0 = i22 + 1;
                    gVar2.add(Integer.valueOf(i22));
                }
                int i23 = this.f46543d0;
                this.f46543d0 = i23 + 1;
                this.f46547n = i23;
            }
            l41 l41Var8 = z41Var.N;
            if (l41Var8 != null && !l41Var8.f48835l && !l41Var8.f48826a) {
                int i24 = this.f46543d0;
                if (i24 > 0) {
                    this.f46543d0 = i24 + 1;
                    gVar2.add(Integer.valueOf(i24));
                }
                int i25 = this.f46543d0;
                this.f46543d0 = i25 + 1;
                this.Q = i25;
            }
            if (arrayList4.size() > 0) {
                int i26 = this.f46543d0;
                if (i26 > 0) {
                    this.f46543d0 = i26 + 1;
                    gVar2.add(Integer.valueOf(i26));
                }
                int i27 = this.f46543d0;
                int i28 = i27 + 1;
                this.R = i27;
                this.f46543d0 = i27 + 2;
                this.S = i28;
                int size = arrayList4.size() + i28;
                this.T = size - 1;
                this.f46543d0 = size;
                if (arrayList4.size() != z41Var.O.size()) {
                    int i29 = this.f46543d0;
                    this.f46543d0 = i29 + 1;
                    this.f46539a0 = i29;
                } else {
                    int i30 = this.f46543d0;
                    this.f46543d0 = i30 + 1;
                    gVar.add(Integer.valueOf(i30));
                }
            }
            if (arrayList3.size() > 0) {
                int i31 = this.f46543d0;
                if (i31 > 0) {
                    this.f46543d0 = i31 + 1;
                    gVar2.add(Integer.valueOf(i31));
                }
                int i32 = this.f46543d0;
                int i33 = i32 + 1;
                this.U = i32;
                this.f46543d0 = i32 + 2;
                this.V = i33;
                int size2 = arrayList3.size() + i33;
                this.W = size2 - 1;
                this.f46543d0 = size2 + 1;
                gVar.add(Integer.valueOf(size2));
            }
            if (arrayList2.size() > 0) {
                int i34 = this.f46543d0;
                if (i34 > 0) {
                    this.f46543d0 = i34 + 1;
                    gVar2.add(Integer.valueOf(i34));
                }
                int i35 = this.f46543d0;
                int i36 = i35 + 1;
                this.X = i35;
                this.f46543d0 = i35 + 2;
                this.Y = i36;
                int size3 = arrayList2.size() + i36;
                this.Z = size3 - 1;
                this.f46543d0 = size3;
            }
            int i37 = this.f46543d0;
            if (i37 > 0) {
                this.f46543d0 = i37 + 1;
                gVar.add(Integer.valueOf(i37));
                int i38 = this.f46543d0;
                this.f46543d0 = i38 + 1;
                gVar2.add(Integer.valueOf(i38));
                return;
            }
            return;
        }
        if (z41Var.f53816f != null) {
            int i39 = this.f46543d0;
            this.f46541c = i39;
            this.f46543d0 = i39 + 2;
            this.d = i39 + 1;
        }
        l41 l41Var9 = z41Var.d;
        if (l41Var9 != null && !l41Var9.f48835l) {
            int i40 = this.f46543d0;
            if (i40 > 0) {
                this.f46543d0 = i40 + 1;
                gVar2.add(Integer.valueOf(i40));
            }
            int i41 = this.f46543d0;
            this.f46543d0 = i41 + 1;
            this.f46544e = i41;
        }
        l41 l41Var10 = z41Var.h;
        if (l41Var10 != null && !l41Var10.f48835l) {
            int i42 = this.f46543d0;
            if (i42 > 0) {
                this.f46543d0 = i42 + 1;
                gVar2.add(Integer.valueOf(i42));
            }
            int i43 = this.f46543d0;
            this.f46543d0 = i43 + 1;
            this.h = i43;
        }
        l41 l41Var11 = z41Var.f53840y;
        if (l41Var11 != null && !l41Var11.f48835l) {
            int i44 = this.f46543d0;
            if (i44 > 0) {
                this.f46543d0 = i44 + 1;
                gVar2.add(Integer.valueOf(i44));
            }
            int i45 = this.f46543d0;
            this.f46543d0 = i45 + 1;
            this.E = i45;
        }
        l41 l41Var12 = z41Var.f53814e;
        if (l41Var12 != null && !l41Var12.f48835l) {
            int i46 = this.f46543d0;
            if (i46 > 0) {
                this.f46543d0 = i46 + 1;
                gVar2.add(Integer.valueOf(i46));
            }
            int i47 = this.f46543d0;
            this.f46543d0 = i47 + 1;
            this.f46547n = i47;
        }
        l41 l41Var13 = z41Var.f53831s;
        if (l41Var13 != null && !l41Var13.f48835l) {
            int i48 = this.f46543d0;
            if (i48 > 0) {
                this.f46543d0 = i48 + 1;
                gVar2.add(Integer.valueOf(i48));
            }
            int i49 = this.f46543d0;
            this.f46543d0 = i49 + 1;
            this.f46550w = i49;
        }
        l41 l41Var14 = z41Var.f53836w;
        if (l41Var14 != null && !l41Var14.f48835l) {
            int i50 = this.f46543d0;
            if (i50 > 0) {
                this.f46543d0 = i50 + 1;
                gVar2.add(Integer.valueOf(i50));
            }
            int i51 = this.f46543d0;
            this.f46543d0 = i51 + 1;
            this.f46551x = i51;
        }
        l41 l41Var15 = z41Var.f53838x;
        if (l41Var15 != null && !l41Var15.f48835l) {
            int i52 = this.f46543d0;
            if (i52 > 0) {
                this.f46543d0 = i52 + 1;
                gVar2.add(Integer.valueOf(i52));
            }
            int i53 = this.f46543d0;
            this.f46543d0 = i53 + 1;
            this.f46552y = i53;
        }
        l41 l41Var16 = z41Var.f53824n;
        if (l41Var16 != null && !l41Var16.f48835l) {
            int i54 = this.f46543d0;
            if (i54 > 0) {
                this.f46543d0 = i54 + 1;
                gVar2.add(Integer.valueOf(i54));
            }
            int i55 = this.f46543d0;
            this.f46543d0 = i55 + 1;
            this.f46548r = i55;
        }
        l41 l41Var17 = z41Var.f53829r;
        if (l41Var17 != null && !l41Var17.f48834k && !l41Var17.f48826a) {
            int i56 = this.f46543d0;
            if (i56 > 0) {
                this.f46543d0 = i56 + 1;
                gVar2.add(Integer.valueOf(i56));
            }
            int i57 = this.f46543d0;
            this.f46543d0 = i57 + 1;
            this.f46549s = i57;
        }
        l41 l41Var18 = z41Var.E;
        if (l41Var18 != null && !l41Var18.f48835l && !l41Var18.f48826a) {
            int i58 = this.f46543d0;
            if (i58 > 0) {
                this.f46543d0 = i58 + 1;
                gVar2.add(Integer.valueOf(i58));
            }
            int i59 = this.f46543d0;
            this.f46543d0 = i59 + 1;
            this.F = i59;
        }
        l41 l41Var19 = z41Var.F;
        if (l41Var19 != null && !l41Var19.f48835l && !l41Var19.f48826a) {
            int i60 = this.f46543d0;
            if (i60 > 0) {
                this.f46543d0 = i60 + 1;
                gVar2.add(Integer.valueOf(i60));
            }
            int i61 = this.f46543d0;
            this.f46543d0 = i61 + 1;
            this.G = i61;
        }
        l41 l41Var20 = z41Var.G;
        if (l41Var20 != null && !l41Var20.f48835l && !l41Var20.f48826a) {
            int i62 = this.f46543d0;
            if (i62 > 0) {
                this.f46543d0 = i62 + 1;
                gVar2.add(Integer.valueOf(i62));
            }
            int i63 = this.f46543d0;
            this.f46543d0 = i63 + 1;
            this.H = i63;
        }
        int i64 = this.f46543d0;
        this.f46543d0 = i64 + 1;
        gVar2.add(Integer.valueOf(i64));
        if (arrayList.size() > 0) {
            int i65 = this.f46543d0;
            int i66 = i65 + 1;
            this.I = i65;
            this.f46543d0 = i65 + 2;
            this.J = i66;
            int size4 = arrayList.size() + i66;
            this.K = size4 - 1;
            this.f46543d0 = size4;
            if (z41Var.f53837w0.size() != z41Var.f53835v0.size()) {
                int i67 = this.f46543d0;
                this.f46543d0 = i67 + 1;
                this.f46546f = i67;
            } else {
                int i68 = this.f46543d0;
                this.f46543d0 = i68 + 1;
                gVar.add(Integer.valueOf(i68));
            }
            int i69 = this.f46543d0;
            this.f46543d0 = i69 + 1;
            gVar2.add(Integer.valueOf(i69));
        }
    }

    @Override
    public final int b() {
        return this.f46543d0;
    }

    @Override
    public final long c(int i7) {
        int i10 = this.J;
        if (i7 >= i10 && i7 < this.K) {
            return ((w41) this.f46545e0.f53842z0.get(i7 - i10)).b();
        }
        if (i7 == this.f46544e) {
            return 1L;
        }
        if (i7 == this.h) {
            return 2L;
        }
        if (i7 == this.f46547n) {
            return 3L;
        }
        if (i7 == this.f46548r) {
            return 4L;
        }
        if (i7 == this.E) {
            return 5L;
        }
        if (i7 == this.f46549s) {
            return 6L;
        }
        if (i7 == this.f46550w) {
            return 7L;
        }
        if (i7 == this.f46551x) {
            return 8L;
        }
        if (i7 == this.f46552y) {
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
        if (i7 != this.f46544e && i7 != this.h && i7 != this.f46547n && i7 != this.E && i7 != this.P && i7 != this.L) {
            if (i7 != this.f46548r && i7 != this.f46549s && i7 != this.G) {
                if (i7 != this.f46550w && i7 != this.f46551x && i7 != this.M && i7 != this.O && i7 != this.F && i7 != this.H) {
                    if (i7 != this.f46552y && i7 != this.N && i7 != this.Q) {
                        if (i7 >= this.J && i7 <= this.K) {
                            return 9;
                        }
                        if (i7 == this.f46546f) {
                            return 11;
                        }
                        if (this.f46542c0.contains(Integer.valueOf(i7))) {
                            return 12;
                        }
                        if (i7 != this.I && i7 != this.f46541c && i7 != this.U && i7 != this.R && i7 != this.X) {
                            if (i7 == this.d) {
                                return 14;
                            }
                            if ((i7 >= this.V && i7 <= this.W) || ((i7 >= this.S && i7 <= this.T) || (i7 >= this.Y && i7 <= this.Z))) {
                                return 9;
                            }
                            if (i7 == this.f46539a0) {
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
    public final void t(v4.e1 r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e41.t(v4.e1, int):void");
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.x4 x4Var;
        int i10;
        int i11 = 4;
        z41 z41Var = this.f46545e0;
        if (i7 >= 0 && i7 <= 4) {
            Context context = viewGroup.getContext();
            i10 = ((org.telegram.ui.ActionBar.e2) z41Var).currentAccount;
            View k41Var = new k41(z41Var, context, i10, i7, z41Var.f53808a0);
            k41Var.setWillNotDraw(false);
            x4Var = k41Var;
        } else if (i7 == 9) {
            View v7Var = new org.telegram.ui.Cells.v7(viewGroup.getContext(), z41Var.f53807a, z41Var.getResourceProvider());
            v7Var.setWillNotDraw(false);
            x4Var = v7Var;
        } else if (i7 == 11) {
            x4Var = new org.telegram.ui.Cells.t4(viewGroup.getContext());
        } else if (i7 == 12) {
            x4Var = new org.telegram.ui.Cells.m3(viewGroup.getContext(), org.telegram.messenger.g0.L(15.0f));
        } else if (i7 == 13) {
            View cVar = new ng.c(viewGroup.getContext(), null);
            cVar.setWillNotDraw(false);
            cVar.setPadding(cVar.getPaddingLeft(), org.telegram.messenger.g0.L(16.0f), cVar.getRight(), org.telegram.messenger.g0.L(16.0f));
            x4Var = cVar;
        } else if (i7 == 14) {
            Context context2 = viewGroup.getContext();
            if (z41Var.f53812c0) {
                i11 = 2;
            }
            x4Var = new t41(context2, i11);
        } else if (i7 == 15) {
            org.telegram.ui.Cells.x4 x4Var2 = new org.telegram.ui.Cells.x4(viewGroup.getContext());
            x4Var2.a(org.telegram.ui.ActionBar.j6.f29184v6, org.telegram.ui.ActionBar.j6.f29165u6);
            x4Var = x4Var2;
        } else {
            x4Var = new org.telegram.ui.Cells.x6(viewGroup.getContext(), 0, 0);
        }
        return i5.c.q(x4Var, x4Var, -1, -2);
    }
}

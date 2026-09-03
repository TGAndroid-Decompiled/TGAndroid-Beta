package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class lu0 extends cl0 {
    public final Context f28879c;
    public final int d;
    public boolean f28880e;
    public final yu0 f28881f;

    public lu0(yu0 yu0Var, Context context, int i10) {
        this.f28881f = yu0Var;
        this.f28879c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f28881f.f33643q1[this.d].f29583e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((vt0) arrayList.get(i11)).f32539b) {
                    return ((vt0) arrayList.get(i11)).f32538a;
                }
            }
            return ((vt0) l.d.i(1, arrayList)).f32538a;
        }
        return "";
    }

    @Override
    public final void G(sl0 sl0Var, float f10, int[] iArr) {
        int measuredHeight = sl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f10 * ((k() * measuredHeight) - (sl0Var.getMeasuredHeight() - sl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(sl0 sl0Var) {
        if (this.f28880e) {
            this.f28880e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < sl0Var.getChildCount() && (i10 = yu0.p(sl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f28881f.S(this.d, sl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.f28880e = true;
        qt0 W = this.f28881f.W(this.d);
        if (W != null) {
            yu0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        nu0[] nu0VarArr = this.f28881f.f33643q1;
        int i12 = this.d;
        nu0 nu0Var = nu0VarArr[i12];
        if (nu0Var.f29592o) {
            return nu0Var.e();
        }
        if (nu0Var.f29580a.size() == 0 && !nu0VarArr[i12].f29585g) {
            return 1;
        }
        if (nu0VarArr[i12].f29580a.size() == 0) {
            nu0 nu0Var2 = nu0VarArr[i12];
            boolean[] zArr = nu0Var2.f29586i;
            if ((!zArr[0] || !zArr[1]) && nu0Var2.f29589l) {
                return 0;
            }
        }
        if (nu0VarArr[i12].e() == 0) {
            int size = nu0VarArr[i12].c().size() + nu0VarArr[i12].d();
            if (size != 0) {
                nu0 nu0Var3 = nu0VarArr[i12];
                boolean[] zArr2 = nu0Var3.f29586i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z4 = nu0Var3.f29595r;
                    if (z4) {
                        i10 = nu0Var3.f29598u;
                    } else {
                        i10 = nu0Var3.f29591n;
                    }
                    if (i10 != 0) {
                        if (z4) {
                            i11 = nu0Var3.f29598u;
                        } else {
                            i11 = nu0Var3.f29591n;
                        }
                        return i11 + size;
                    }
                    return size + 1;
                }
                return size;
            }
            return size;
        }
        return Math.max(nu0VarArr[i12].e(), nu0VarArr[i12].c().size() + nu0VarArr[i12].d());
    }

    @Override
    public final int j(int i10) {
        nu0[] nu0VarArr = this.f28881f.f33643q1;
        int i11 = this.d;
        if (nu0VarArr[i11].f29582c.size() == 0 && !nu0VarArr[i11].f29585g) {
            return 9;
        }
        nu0 nu0Var = nu0VarArr[i11];
        int i12 = nu0Var.f29590m;
        if (i10 >= i12 && i10 < nu0Var.f29580a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f28881f.f33643q1[this.d].e();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        char c3;
        boolean z10;
        char c10;
        yu0 yu0Var = this.f28881f;
        long j10 = yu0Var.f33624g1;
        SparseArray[] sparseArrayArr = yu0Var.W0;
        nu0 nu0Var = yu0Var.f33643q1[this.d];
        ArrayList arrayList = nu0Var.f29580a;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        boolean z11 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.h7)) {
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - nu0Var.f29590m);
                if (i10 != arrayList.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                h7Var.f(messageObject, z10);
                if (yu0Var.f33666z1) {
                    if (messageObject.getDialogId() == j10) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                        z11 = true;
                    }
                    h7Var.e(z11, !yu0Var.Y0);
                    return;
                }
                h7Var.e(false, !yu0Var.Y0);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.i7)) {
        } else {
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - nu0Var.f29590m);
            if (i10 != arrayList.size() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            i7Var.c(messageObject2, z4);
            if (yu0Var.f33666z1) {
                if (messageObject2.getDialogId() == j10) {
                    c3 = 0;
                } else {
                    c3 = 1;
                }
                if (sparseArrayArr[c3].indexOfKey(messageObject2.getId()) >= 0) {
                    z11 = true;
                }
                i7Var.b(z11, !yu0Var.Y0);
                return;
            }
            i7Var.b(false, !yu0Var.Y0);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        yu0 yu0Var = this.f28881f;
        u00 u00Var = yu0Var.f33662y;
        ArrayList arrayList = yu0Var.D0;
        org.telegram.ui.ActionBar.g6 g6Var = yu0Var.C1;
        Context context = this.f28879c;
        if (i10 != 7) {
            int i11 = this.d;
            if (i10 != 8) {
                if (i10 != 9) {
                    if (i11 == 4 && !arrayList.isEmpty()) {
                        View view3 = (View) arrayList.get(0);
                        arrayList.remove(0);
                        ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                        view2 = view3;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(view3);
                            view2 = view3;
                        }
                    } else {
                        view2 = new st0(this, context, g6Var, 1);
                    }
                    org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view2;
                    h7Var.setGlobalGradientView(u00Var);
                    view = view2;
                    if (i11 == 4) {
                        yu0Var.E0.add(h7Var);
                        view = view2;
                    }
                } else {
                    kt0 M = yu0.M(i11, yu0Var.f33624g1, context, g6Var);
                    M.setLayoutParams(new f2.x0(-1, -1));
                    return new f2.m1(M);
                }
            } else {
                u00 u00Var2 = new u00(context, g6Var);
                if (i11 == 2) {
                    u00Var2.setViewType(4);
                } else {
                    u00Var2.setViewType(3);
                }
                u00Var2.f31465w = false;
                u00Var2.setIsSingleCell(true);
                u00Var2.setGlobalGradientView(u00Var);
                view = u00Var2;
            }
        } else {
            org.telegram.ui.Cells.i7 i7Var = new org.telegram.ui.Cells.i7(context, 0, g6Var);
            i7Var.setGlobalGradientView(u00Var);
            view = i7Var;
        }
        return org.telegram.ui.yh.o(view, view, -1, -2);
    }
}

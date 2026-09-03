package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
public final class lu0 extends bl0 {
    public final Context f26876c;
    public final int d;
    public boolean e;
    public final yu0 f26877f;

    public lu0(yu0 yu0Var, Context context, int i10) {
        this.f26877f = yu0Var;
        this.f26876c = context;
        this.d = i10;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final String F(int i10) {
        ArrayList arrayList = this.f26877f.f31149q1[this.d].e;
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i10 <= ((vt0) arrayList.get(i11)).f30051b) {
                    return ((vt0) arrayList.get(i11)).f30050a;
                }
            }
            return ((vt0) kf.k0.i(1, arrayList)).f30050a;
        }
        return "";
    }

    @Override
    public final void G(rl0 rl0Var, float f10, int[] iArr) {
        int measuredHeight = rl0Var.getChildAt(0).getMeasuredHeight();
        float k10 = f10 * ((k() * measuredHeight) - (rl0Var.getMeasuredHeight() - rl0Var.getPaddingTop()));
        iArr[0] = (int) (k10 / measuredHeight);
        iArr[1] = ((int) k10) % measuredHeight;
    }

    @Override
    public final void J(rl0 rl0Var) {
        if (this.e) {
            this.e = false;
            int i10 = 0;
            for (int i11 = 0; i11 < rl0Var.getChildCount() && (i10 = yu0.p(rl0Var.getChildAt(i11))) == 0; i11++) {
            }
            if (i10 == 0) {
                this.f26877f.S(this.d, rl0Var, true);
            }
        }
    }

    @Override
    public final void K() {
        this.e = true;
        qt0 W = this.f26877f.W(this.d);
        if (W != null) {
            yu0.q(W, null, false);
        }
    }

    @Override
    public final int h() {
        int i10;
        int i11;
        nu0[] nu0VarArr = this.f26877f.f31149q1;
        int i12 = this.d;
        nu0 nu0Var = nu0VarArr[i12];
        if (nu0Var.f27379o) {
            return nu0Var.e();
        }
        if (nu0Var.f27368a.size() == 0 && !nu0VarArr[i12].f27372g) {
            return 1;
        }
        if (nu0VarArr[i12].f27368a.size() == 0) {
            nu0 nu0Var2 = nu0VarArr[i12];
            boolean[] zArr = nu0Var2.f27373i;
            if ((!zArr[0] || !zArr[1]) && nu0Var2.f27376l) {
                return 0;
            }
        }
        if (nu0VarArr[i12].e() == 0) {
            int size = nu0VarArr[i12].c().size() + nu0VarArr[i12].d();
            if (size != 0) {
                nu0 nu0Var3 = nu0VarArr[i12];
                boolean[] zArr2 = nu0Var3.f27373i;
                if (!zArr2[0] || !zArr2[1]) {
                    boolean z4 = nu0Var3.f27382r;
                    if (z4) {
                        i10 = nu0Var3.f27385u;
                    } else {
                        i10 = nu0Var3.f27378n;
                    }
                    if (i10 != 0) {
                        if (z4) {
                            i11 = nu0Var3.f27385u;
                        } else {
                            i11 = nu0Var3.f27378n;
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
        nu0[] nu0VarArr = this.f26877f.f31149q1;
        int i11 = this.d;
        if (nu0VarArr[i11].f27370c.size() == 0 && !nu0VarArr[i11].f27372g) {
            return 9;
        }
        nu0 nu0Var = nu0VarArr[i11];
        int i12 = nu0Var.f27377m;
        if (i10 >= i12 && i10 < nu0Var.f27368a.size() + i12) {
            if (i11 != 2 && i11 != 4) {
                return 7;
            }
            return 10;
        }
        return 8;
    }

    @Override
    public final int k() {
        return this.f26877f.f31149q1[this.d].e();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        boolean z4;
        char c3;
        boolean z10;
        char c10;
        yu0 yu0Var = this.f26877f;
        long j10 = yu0Var.f31130g1;
        SparseArray[] sparseArrayArr = yu0Var.W0;
        nu0 nu0Var = yu0Var.f31149q1[this.d];
        ArrayList arrayList = nu0Var.f27368a;
        int i11 = l1Var.f5777f;
        View view = l1Var.f5774a;
        boolean z11 = false;
        if (i11 != 7) {
            if (i11 == 10 && (view instanceof org.telegram.ui.Cells.g7)) {
                org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
                MessageObject messageObject = (MessageObject) arrayList.get(i10 - nu0Var.f27377m);
                if (i10 != arrayList.size() - 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g7Var.f(messageObject, z10);
                if (yu0Var.f31172z1) {
                    if (messageObject.getDialogId() == j10) {
                        c10 = 0;
                    } else {
                        c10 = 1;
                    }
                    if (sparseArrayArr[c10].indexOfKey(messageObject.getId()) >= 0) {
                        z11 = true;
                    }
                    g7Var.e(z11, !yu0Var.Y0);
                    return;
                }
                g7Var.e(false, !yu0Var.Y0);
            }
        } else if (!(view instanceof org.telegram.ui.Cells.h7)) {
        } else {
            org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i10 - nu0Var.f27377m);
            if (i10 != arrayList.size() - 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            h7Var.c(messageObject2, z4);
            if (yu0Var.f31172z1) {
                if (messageObject2.getDialogId() == j10) {
                    c3 = 0;
                } else {
                    c3 = 1;
                }
                if (sparseArrayArr[c3].indexOfKey(messageObject2.getId()) >= 0) {
                    z11 = true;
                }
                h7Var.b(z11, !yu0Var.Y0);
                return;
            }
            h7Var.b(false, !yu0Var.Y0);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        yu0 yu0Var = this.f26877f;
        u00 u00Var = yu0Var.f31168y;
        ArrayList arrayList = yu0Var.D0;
        org.telegram.ui.ActionBar.f6 f6Var = yu0Var.C1;
        Context context = this.f26876c;
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
                        view2 = new st0(this, context, f6Var, 1);
                    }
                    org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view2;
                    g7Var.setGlobalGradientView(u00Var);
                    view = view2;
                    if (i11 == 4) {
                        yu0Var.E0.add(g7Var);
                        view = view2;
                    }
                } else {
                    kt0 M = yu0.M(i11, yu0Var.f31130g1, context, f6Var);
                    M.setLayoutParams(new f2.w0(-1, -1));
                    return new f2.l1(M);
                }
            } else {
                u00 u00Var2 = new u00(context, f6Var);
                if (i11 == 2) {
                    u00Var2.setViewType(4);
                } else {
                    u00Var2.setViewType(3);
                }
                u00Var2.f29071w = false;
                u00Var2.setIsSingleCell(true);
                u00Var2.setGlobalGradientView(u00Var);
                view = u00Var2;
            }
        } else {
            org.telegram.ui.Cells.h7 h7Var = new org.telegram.ui.Cells.h7(context, 0, f6Var);
            h7Var.setGlobalGradientView(u00Var);
            view = h7Var;
        }
        return org.telegram.ui.ai.n(view, view, -1, -2);
    }
}

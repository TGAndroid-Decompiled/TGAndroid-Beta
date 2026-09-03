package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
public final class mu0 extends nl0 {
    public final Context f27140r;
    public final yu0 f27141s;

    public mu0(yu0 yu0Var, Context context) {
        this.f27141s = yu0Var;
        this.f27140r = context;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(rl0 rl0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override
    public final int M(int i10) {
        nu0[] nu0VarArr = this.f27141s.f31149q1;
        int i11 = 1;
        if ((nu0VarArr[3].f27370c.size() == 0 && !nu0VarArr[3].f27372g) || i10 >= nu0VarArr[3].f27370c.size()) {
            return 1;
        }
        nu0 nu0Var = nu0VarArr[3];
        int size = ((ArrayList) nu0Var.d.get(nu0Var.f27370c.get(i10))).size();
        if (i10 == 0) {
            i11 = 0;
        }
        return size + i11;
    }

    @Override
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override
    public final int P(int i10, int i11) {
        nu0[] nu0VarArr = this.f27141s.f31149q1;
        if (nu0VarArr[3].f27370c.size() == 0 && !nu0VarArr[3].f27372g) {
            return 5;
        }
        if (i10 < nu0VarArr[3].f27370c.size()) {
            if (i10 != 0 && i11 == 0) {
                return 3;
            }
            return 4;
        }
        return 6;
    }

    @Override
    public final int R() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mu0.R():int");
    }

    @Override
    public final View T(int i10, View view) {
        yu0 yu0Var = this.f27141s;
        if (view == null) {
            view = new org.telegram.ui.Cells.t3(this.f27140r, 28, yu0Var.C1);
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < yu0Var.f31149q1[3].f27370c.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.t3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) yu0Var.f31149q1[3].d.get((String) yu0Var.f31149q1[3].f27370c.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override
    public final boolean V(int i10, int i11, f2.l1 l1Var) {
        nu0[] nu0VarArr = this.f27141s.f31149q1;
        if (nu0VarArr[3].f27370c.size() != 0 || nu0VarArr[3].f27372g) {
            if (i10 != 0 && i11 == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void W(int i10, int i11, f2.l1 l1Var) {
        boolean z4;
        char c3;
        yu0 yu0Var = this.f27141s;
        nu0[] nu0VarArr = yu0Var.f31149q1;
        int i12 = l1Var.f5777f;
        View view = l1Var.f5774a;
        if (i12 != 6 && i12 != 5) {
            ArrayList arrayList = (ArrayList) nu0VarArr[3].d.get((String) nu0VarArr[3].f27370c.get(i10));
            int i13 = l1Var.f5777f;
            boolean z10 = false;
            if (i13 != 3) {
                if (i13 == 4) {
                    if (i10 != 0) {
                        i11--;
                    }
                    if ((view instanceof org.telegram.ui.Cells.k7) && i11 >= 0 && i11 < arrayList.size()) {
                        org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
                        MessageObject messageObject = (MessageObject) arrayList.get(i11);
                        if (i11 == arrayList.size() - 1 && (i10 != nu0VarArr[3].f27370c.size() - 1 || !nu0VarArr[3].f27372g)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        k7Var.f21293y = z4;
                        k7Var.e();
                        k7Var.V = messageObject;
                        k7Var.requestLayout();
                        if (yu0Var.f31172z1) {
                            SparseArray[] sparseArrayArr = yu0Var.W0;
                            if (messageObject.getDialogId() == yu0Var.f31130g1) {
                                c3 = 0;
                            } else {
                                c3 = 1;
                            }
                            if (sparseArrayArr[c3].indexOfKey(messageObject.getId()) >= 0) {
                                z10 = true;
                            }
                            k7Var.f(z10, !yu0Var.Y0);
                            return;
                        }
                        k7Var.f(false, !yu0Var.Y0);
                        return;
                    }
                    return;
                }
                return;
            }
            MessageObject messageObject2 = (MessageObject) arrayList.get(0);
            if (view instanceof org.telegram.ui.Cells.t3) {
                ((org.telegram.ui.Cells.t3) view).setText(LocaleController.formatSectionDate(messageObject2.messageOwner.date));
            }
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.t3 t3Var;
        yu0 yu0Var = this.f27141s;
        org.telegram.ui.ActionBar.f6 f6Var = yu0Var.C1;
        Context context = this.f27140r;
        if (i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5) {
                    u00 u00Var = new u00(context, f6Var);
                    u00Var.setIsSingleCell(true);
                    u00Var.f29071w = false;
                    u00Var.setViewType(5);
                    t3Var = u00Var;
                } else {
                    kt0 M = yu0.M(3, yu0Var.f31130g1, context, f6Var);
                    M.setLayoutParams(new f2.w0(-1, -1));
                    return new f2.l1(M);
                }
            } else {
                org.telegram.ui.Cells.k7 k7Var = new org.telegram.ui.Cells.k7(context, 0, f6Var);
                k7Var.setDelegate(yu0Var.P1);
                t3Var = k7Var;
            }
        } else {
            t3Var = new org.telegram.ui.Cells.t3(context, 28, f6Var);
        }
        return org.telegram.ui.ai.n(t3Var, t3Var, -1, -2);
    }
}

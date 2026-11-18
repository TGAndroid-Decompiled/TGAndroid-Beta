package org.telegram.ui;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
public final class ax extends v4.w {
    public v4.f1 d;
    public boolean f45690e;
    public boolean f45691f;
    public final bx f45692g;
    public final cx h;

    public ax(cx cxVar, bx bxVar) {
        this.h = cxVar;
        this.f45692g = bxVar;
    }

    @Override
    public final int b(int i7, int i10) {
        if (this.f45691f) {
            return 0;
        }
        return super.b(i7, i10);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        cx cxVar;
        org.telegram.ui.Cells.t2 t2Var;
        if (i7 == 4) {
            return 200L;
        }
        if (i7 == 8 && (t2Var = (cxVar = this.h).Z0) != null) {
            org.telegram.messenger.g0.h3(new sg(1, t2Var), this.f45692g.f46317y.f59196e);
            cxVar.Z0 = null;
        }
        return super.d(recyclerView, i7, f10, f11);
    }

    @Override
    public final int e(androidx.recyclerview.widget.RecyclerView r13, v4.f1 r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ax.e(androidx.recyclerview.widget.RecyclerView, v4.f1):int");
    }

    @Override
    public final float f(float f10) {
        return 3500.0f;
    }

    @Override
    public final float g() {
        return 0.45f;
    }

    @Override
    public final float h(float f10) {
        return Float.MAX_VALUE;
    }

    @Override
    public final boolean n(RecyclerView recyclerView, v4.f1 f1Var, v4.f1 f1Var2) {
        char c10;
        int i7;
        cx cxVar = this.h;
        ArrayList arrayList = cxVar.f46668c1;
        View view = f1Var2.f59122a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.t2) {
            long dialogId = ((org.telegram.ui.Cells.t2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar.getMessagesController().R.f(dialogId);
            if (dialog != null && cxVar.v4(dialog) && !org.telegram.messenger.n5.D(dialogId)) {
                int b10 = f1Var.b();
                int b11 = f1Var2.b();
                bx bxVar = this.f45692g;
                if (bxVar.f46307a.getItemAnimator() == null) {
                    bxVar.f46307a.setItemAnimator(bxVar.f46317y);
                }
                kv kvVar = bxVar.d;
                cx cxVar2 = kvVar.S;
                int i10 = kvVar.G;
                ArrayList d42 = cxVar2.d4(i10, kvVar.h, kvVar.f17582r, false);
                int H = kvVar.H(b10);
                int H2 = kvVar.H(b11);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) d42.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) d42.get(H2);
                int i11 = kvVar.h;
                if (i11 != 7 && i11 != 8) {
                    int i12 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i12;
                } else {
                    org.telegram.messenger.ro[] roVarArr = org.telegram.messenger.mp.u1(i10).N;
                    if (kvVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    LongSparseIntArray longSparseIntArray = roVarArr[c10].f26681j;
                    int i13 = longSparseIntArray.get(dialog2.f28409id);
                    longSparseIntArray.put(dialog2.f28409id, longSparseIntArray.get(dialog3.f28409id));
                    longSparseIntArray.put(dialog3.f28409id, i13);
                }
                Collections.swap(d42, H, H2);
                kvVar.X(null);
                int i14 = cxVar.f46683f0[0].f46314s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        cxVar.f46662b1 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.ro[] roVarArr2 = cxVar.getMessagesController().N;
                if (cxVar.f46683f0[0].f46314s == i7) {
                    c11 = 1;
                }
                org.telegram.messenger.ro roVar = roVarArr2[c11];
                if (!arrayList.contains(roVar)) {
                    arrayList.add(roVar);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p(v4.f1 f1Var, int i7) {
        if (f1Var != null) {
            this.f45692g.f46307a.d1(false);
        }
        this.d = f1Var;
        if (f1Var != null) {
            View view = f1Var.f59122a;
            if (view instanceof org.telegram.ui.Cells.t2) {
                ((org.telegram.ui.Cells.t2) view).f31958x = false;
            }
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
        int i7;
        cx cxVar = this.h;
        if (f1Var != null) {
            org.telegram.ui.Cells.t2 t2Var = (org.telegram.ui.Cells.t2) f1Var.f59122a;
            long dialogId = t2Var.getDialogId();
            boolean D = org.telegram.messenger.n5.D(dialogId);
            int i10 = 0;
            bx bxVar = this.f45692g;
            if (D) {
                yw ywVar = bxVar.f46307a;
                int i11 = yw.C3;
                ywVar.C1(false, t2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar.getMessagesController().R.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!cxVar.getMessagesController().I2(dialogId, false) && cxVar.Y2 == 0) {
                i7 = ((org.telegram.ui.ActionBar.h2) cxVar).currentAccount;
                if (org.telegram.messenger.bz.m(i7) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i10 = 1;
                    }
                    cxVar.P2 = i10;
                    cxVar.K4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (org.telegram.messenger.v3.Y(cxVar.getMessagesController().O0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                cxVar.K4(arrayList2, 111, true, false, null);
                return;
            }
            cxVar.Y0 = t2Var;
            l2.x xVar = new l2.x(this, dialog, bxVar.d.b(), f1Var.b(), 13);
            cxVar.U4(true, true);
            if (Utilities.f22780b.nextInt(1000) == 1) {
                if (cxVar.X0 == null) {
                    yw ywVar2 = bxVar.f46307a;
                    ?? obj = new Object();
                    obj.f42858a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f42859b = paint;
                    obj.f42861e = 0L;
                    obj.f42862f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    obj.f42860c = ywVar2;
                    cxVar.X0 = obj;
                }
                org.telegram.ui.Components.zb0 zb0Var = cxVar.X0;
                zb0Var.d = xVar;
                zb0Var.h = 0.0f;
                zb0Var.f42863g = 0.0f;
                zb0Var.f42861e = System.currentTimeMillis();
                zb0Var.f42860c.invalidate();
                return;
            }
            xVar.run();
            return;
        }
        cxVar.Y0 = null;
    }
}

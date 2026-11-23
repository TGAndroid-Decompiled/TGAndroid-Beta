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
    public boolean f45720e;
    public boolean f45721f;
    public final bx f45722g;
    public final cx h;

    public ax(cx cxVar, bx bxVar) {
        this.h = cxVar;
        this.f45722g = bxVar;
    }

    @Override
    public final int b(int i7, int i10) {
        if (this.f45721f) {
            return 0;
        }
        return super.b(i7, i10);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i7, float f10, float f11) {
        cx cxVar;
        org.telegram.ui.Cells.u2 u2Var;
        if (i7 == 4) {
            return 200L;
        }
        if (i7 == 8 && (u2Var = (cxVar = this.h).Z0) != null) {
            org.telegram.messenger.g0.h3(new sg(1, u2Var), this.f45722g.f46335y.f59239e);
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
        ArrayList arrayList = cxVar.f46707c1;
        View view = f1Var2.f59165a;
        char c11 = 0;
        if (view instanceof org.telegram.ui.Cells.u2) {
            long dialogId = ((org.telegram.ui.Cells.u2) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar.getMessagesController().R.f(dialogId);
            if (dialog != null && cxVar.v4(dialog) && !org.telegram.messenger.n5.D(dialogId)) {
                int b10 = f1Var.b();
                int b11 = f1Var2.b();
                bx bxVar = this.f45722g;
                if (bxVar.f46325a.getItemAnimator() == null) {
                    bxVar.f46325a.setItemAnimator(bxVar.f46335y);
                }
                kv kvVar = bxVar.d;
                cx cxVar2 = kvVar.S;
                int i10 = kvVar.G;
                ArrayList d42 = cxVar2.d4(i10, kvVar.h, kvVar.f17607r, false);
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
                    org.telegram.messenger.so[] soVarArr = org.telegram.messenger.np.u1(i10).N;
                    if (kvVar.h == 8) {
                        c10 = 1;
                    } else {
                        c10 = 0;
                    }
                    LongSparseIntArray longSparseIntArray = soVarArr[c10].f26893j;
                    int i13 = longSparseIntArray.get(dialog2.f28438id);
                    longSparseIntArray.put(dialog2.f28438id, longSparseIntArray.get(dialog3.f28438id));
                    longSparseIntArray.put(dialog3.f28438id, i13);
                }
                Collections.swap(d42, H, H2);
                kvVar.X(null);
                int i14 = cxVar.f46722f0[0].f46332s;
                if (i14 != 7) {
                    i7 = 8;
                    if (i14 != 8) {
                        cxVar.f46701b1 = true;
                        return true;
                    }
                } else {
                    i7 = 8;
                }
                org.telegram.messenger.so[] soVarArr2 = cxVar.getMessagesController().N;
                if (cxVar.f46722f0[0].f46332s == i7) {
                    c11 = 1;
                }
                org.telegram.messenger.so soVar = soVarArr2[c11];
                if (!arrayList.contains(soVar)) {
                    arrayList.add(soVar);
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
            this.f45722g.f46325a.d1(false);
        }
        this.d = f1Var;
        if (f1Var != null) {
            View view = f1Var.f59165a;
            if (view instanceof org.telegram.ui.Cells.u2) {
                ((org.telegram.ui.Cells.u2) view).f32037x = false;
            }
        }
    }

    @Override
    public final void q(v4.f1 f1Var) {
        int i7;
        cx cxVar = this.h;
        if (f1Var != null) {
            org.telegram.ui.Cells.u2 u2Var = (org.telegram.ui.Cells.u2) f1Var.f59165a;
            long dialogId = u2Var.getDialogId();
            boolean D = org.telegram.messenger.n5.D(dialogId);
            int i10 = 0;
            bx bxVar = this.f45722g;
            if (D) {
                yw ywVar = bxVar.f46325a;
                int i11 = yw.C3;
                ywVar.C1(false, u2Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) cxVar.getMessagesController().R.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!cxVar.getMessagesController().I2(dialogId, false) && cxVar.Y2 == 0) {
                i7 = ((org.telegram.ui.ActionBar.g2) cxVar).currentAccount;
                if (org.telegram.messenger.cz.m(i7) == 1) {
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
            cxVar.Y0 = u2Var;
            l2.x xVar = new l2.x(this, dialog, bxVar.d.b(), f1Var.b(), 13);
            cxVar.U4(true, true);
            if (Utilities.f22808b.nextInt(1000) == 1) {
                if (cxVar.X0 == null) {
                    yw ywVar2 = bxVar.f46325a;
                    ?? obj = new Object();
                    obj.f33489a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.f33490b = paint;
                    obj.f33492e = 0L;
                    obj.f33493f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
                    obj.f33491c = ywVar2;
                    cxVar.X0 = obj;
                }
                org.telegram.ui.Components.ac0 ac0Var = cxVar.X0;
                ac0Var.d = xVar;
                ac0Var.h = 0.0f;
                ac0Var.f33494g = 0.0f;
                ac0Var.f33492e = System.currentTimeMillis();
                ac0Var.f33491c.invalidate();
                return;
            }
            xVar.run();
            return;
        }
        cxVar.Y0 = null;
    }
}

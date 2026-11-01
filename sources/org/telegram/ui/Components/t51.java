package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class t51 extends yy {
    public final int X;
    public final Object Y;

    public t51(v51 v51Var, int i10, int i11) {
        super(i10, false);
        this.X = i11;
        this.Y = v51Var;
    }

    @Override
    public int A() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.A();
        }
    }

    @Override
    public qu0 D1(int i10) {
        switch (this.X) {
            case 2:
                qu0 qu0Var = (qu0) this.Y;
                qu0Var.f29809b = 100.0f;
                qu0Var.f29808a = 100.0f;
                return qu0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(hf.e eVar, s4.z0 z0Var, View view, s0.c cVar) {
        a9.r rVar;
        switch (this.X) {
            case 2:
                super.U(eVar, z0Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47861a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    rVar = new a9.r(collectionItemInfo);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    Object obj = rVar.f355a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(eVar, z0Var, view, cVar);
                return;
        }
    }

    @Override
    public int W0(s4.z0 z0Var) {
        switch (this.X) {
            case 0:
                if (((v51) this.Y).f31185h3) {
                    return org.telegram.messenger.i0.f16172q.y;
                }
                return super.W0(z0Var);
            case 1:
                if (((v51) this.Y).f31185h3) {
                    return org.telegram.messenger.i0.f16172q.y;
                }
                return super.W0(z0Var);
            default:
                return super.W0(z0Var);
        }
    }

    @Override
    public void z0(s4.z0 z0Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.z0(z0Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.t7.a(1) * 2);
                return;
            default:
                super.z0(z0Var, iArr);
                return;
        }
    }

    public t51() {
        super(100, false);
        this.X = 2;
        this.Y = new Object();
    }
}

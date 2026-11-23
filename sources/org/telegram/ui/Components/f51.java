package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class f51 extends wy {
    public final int X;
    public final Object Y;

    public f51(h51 h51Var, int i7, int i10) {
        super(i7, false);
        this.X = i10;
        this.Y = h51Var;
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
    public yt0 D1(int i7) {
        switch (this.X) {
            case 2:
                yt0 yt0Var = (yt0) this.Y;
                yt0Var.f42507b = 100.0f;
                yt0Var.f42506a = 100.0f;
                return yt0Var;
            default:
                return super.D1(i7);
        }
    }

    @Override
    public void U(v4.w0 w0Var, v4.b1 b1Var, View view, s0.c cVar) {
        pf pfVar;
        switch (this.X) {
            case 2:
                super.U(w0Var, b1Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f56750a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    pfVar = new pf(collectionItemInfo, 15);
                } else {
                    pfVar = null;
                }
                if (pfVar != null) {
                    Object obj = pfVar.f38544b;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(w0Var, b1Var, view, cVar);
                return;
        }
    }

    @Override
    public int W0(v4.b1 b1Var) {
        switch (this.X) {
            case 0:
                if (((h51) this.Y).f35744i3) {
                    return org.telegram.messenger.g0.f24010q.y;
                }
                return super.W0(b1Var);
            case 1:
                if (((h51) this.Y).f35744i3) {
                    return org.telegram.messenger.g0.f24010q.y;
                }
                return super.W0(b1Var);
            default:
                return super.W0(b1Var);
        }
    }

    @Override
    public void z0(v4.b1 b1Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.z0(b1Var, iArr);
                iArr[1] = Math.max(iArr[1], org.telegram.ui.Cells.q7.a(1) * 2);
                return;
            default:
                super.z0(b1Var, iArr);
                return;
        }
    }

    public f51() {
        super(100, false);
        this.X = 2;
        this.Y = new Object();
    }
}

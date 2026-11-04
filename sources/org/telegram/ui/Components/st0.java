package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
public final class st0 extends nm0 {
    public final int d;
    public final View f38118e;

    public st0(int i3, View view) {
        this.d = i3;
        this.f38118e = view;
    }

    @Override
    public final boolean a() {
        if (i() > 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean b() {
        if (i() < h()) {
            return true;
        }
        return false;
    }

    @Override
    public final void c(boolean z10) {
        int i3;
        int max;
        switch (this.d) {
            case 1:
                i3 = 5;
                break;
            default:
                i3 = 1;
                break;
        }
        if (z10) {
            i3 *= -1;
        }
        int min = Math.min(h(), Math.max(0, i() + i3));
        switch (this.d) {
            case 0:
                ((ut0) this.f38118e).setOption(min);
                return;
            case 1:
                pm0 pm0Var = ((org.telegram.ui.r90) this.f38118e).h;
                float f10 = min / 100.0f;
                pm0Var.f37200y.k(true, f10);
                pm0Var.setProgress(f10);
                return;
            default:
                if (((org.telegram.ui.nq0) this.f38118e).f48113s.f41380a8 > 0 && (max = Math.max(0, Math.min(((org.telegram.ui.nq0) this.f38118e).f48113s.f41380a8 - 1, min))) != ((org.telegram.ui.nq0) this.f38118e).f48113s.Z7) {
                    org.telegram.ui.nq0 nq0Var = (org.telegram.ui.nq0) this.f38118e;
                    nq0Var.f48112r = nq0Var.f48113s.Z7;
                    ((org.telegram.ui.nq0) this.f38118e).f48113s.Z7 = max;
                    ((org.telegram.ui.nq0) this.f38118e).f48113s.S0();
                    ((org.telegram.ui.nq0) this.f38118e).invalidate();
                    int i10 = ((org.telegram.ui.nq0) this.f38118e).f48113s.Z7;
                    org.telegram.ui.nq0 nq0Var2 = (org.telegram.ui.nq0) this.f38118e;
                    if (i10 != nq0Var2.f48112r) {
                        nq0Var2.f48113s.s2(1);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public CharSequence d() {
        switch (this.d) {
            case 0:
                ut0 ut0Var = (ut0) this.f38118e;
                int i3 = ut0Var.J;
                String[] strArr = ut0Var.G;
                if (i3 < strArr.length) {
                    return strArr[i3];
                }
                return null;
            case 1:
            default:
                return super.d();
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.bd.M0(2131754735, "AccDescrVideoQuality"));
                if (((org.telegram.ui.nq0) this.f38118e).f48113s.f41380a8 > 0) {
                    sb2.append(", ");
                    sb2.append(((org.telegram.ui.nq0) this.f38118e).f48113s.Z7 + 1);
                    sb2.append(" / ");
                    sb2.append(((org.telegram.ui.nq0) this.f38118e).f48113s.f41380a8);
                }
                sb2.append(", ");
                sb2.append(((org.telegram.ui.nq0) this.f38118e).h);
                sb2.append(" – ");
                sb2.append(((org.telegram.ui.nq0) this.f38118e).f48111n);
                return sb2.toString();
        }
    }

    @Override
    public void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.d) {
            case 1:
                super.e(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setEnabled(true);
                return;
            default:
                super.e(view, accessibilityNodeInfo);
                return;
        }
    }

    public final int h() {
        switch (this.d) {
            case 0:
                return ((ut0) this.f38118e).G.length - 1;
            case 1:
                return 100;
            default:
                return Math.max(0, ((org.telegram.ui.nq0) this.f38118e).f48113s.f41380a8 - 1);
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((ut0) this.f38118e).J;
            case 1:
                return org.telegram.messenger.lc.c();
            default:
                return ((org.telegram.ui.nq0) this.f38118e).f48113s.Z7;
        }
    }

    @Override
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb2 = new StringBuilder(org.telegram.messenger.bd.M0(2131748876, null));
                sb2.append(", ");
                int c2 = org.telegram.messenger.lc.c();
                if (c2 <= 0) {
                    sb2.append(org.telegram.messenger.bd.M0(2131748884, null));
                } else if (c2 >= 100) {
                    sb2.append(org.telegram.messenger.bd.M0(2131748883, null));
                } else {
                    sb2.append(org.telegram.messenger.bd.a0(null, null, 2131754849, Integer.valueOf(Math.round(c2))));
                }
                accessibilityEvent.setContentDescription(sb2);
                ((org.telegram.ui.r90) this.f38118e).setContentDescription(sb2);
                return;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }
}

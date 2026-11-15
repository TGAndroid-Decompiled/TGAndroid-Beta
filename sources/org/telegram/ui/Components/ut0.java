package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
public final class ut0 extends om0 {
    public final int d;
    public final View f40159e;

    public ut0(int i7, View view) {
        this.d = i7;
        this.f40159e = view;
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
        int i7;
        int max;
        switch (this.d) {
            case 1:
                i7 = 5;
                break;
            default:
                i7 = 1;
                break;
        }
        if (z10) {
            i7 *= -1;
        }
        int min = Math.min(h(), Math.max(0, i() + i7));
        switch (this.d) {
            case 0:
                ((wt0) this.f40159e).setOption(min);
                return;
            case 1:
                qm0 qm0Var = ((org.telegram.ui.v90) this.f40159e).h;
                float f10 = min / 100.0f;
                qm0Var.f38727y.l(true, f10);
                qm0Var.setProgress(f10);
                return;
            default:
                if (((org.telegram.ui.vq0) this.f40159e).f52274s.Z7 > 0 && (max = Math.max(0, Math.min(((org.telegram.ui.vq0) this.f40159e).f52274s.Z7 - 1, min))) != ((org.telegram.ui.vq0) this.f40159e).f52274s.Y7) {
                    org.telegram.ui.vq0 vq0Var = (org.telegram.ui.vq0) this.f40159e;
                    vq0Var.f52273r = vq0Var.f52274s.Y7;
                    ((org.telegram.ui.vq0) this.f40159e).f52274s.Y7 = max;
                    ((org.telegram.ui.vq0) this.f40159e).f52274s.L0();
                    ((org.telegram.ui.vq0) this.f40159e).invalidate();
                    int i10 = ((org.telegram.ui.vq0) this.f40159e).f52274s.Y7;
                    org.telegram.ui.vq0 vq0Var2 = (org.telegram.ui.vq0) this.f40159e;
                    if (i10 != vq0Var2.f52273r) {
                        vq0Var2.f52274s.n2(1);
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
                wt0 wt0Var = (wt0) this.f40159e;
                int i7 = wt0Var.J;
                String[] strArr = wt0Var.G;
                if (i7 < strArr.length) {
                    return strArr[i7];
                }
                return null;
            case 1:
            default:
                return super.d();
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.hd.M0(2131754735, "AccDescrVideoQuality"));
                if (((org.telegram.ui.vq0) this.f40159e).f52274s.Z7 > 0) {
                    sb2.append(", ");
                    sb2.append(((org.telegram.ui.vq0) this.f40159e).f52274s.Y7 + 1);
                    sb2.append(" / ");
                    sb2.append(((org.telegram.ui.vq0) this.f40159e).f52274s.Z7);
                }
                sb2.append(", ");
                sb2.append(((org.telegram.ui.vq0) this.f40159e).h);
                sb2.append(" – ");
                sb2.append(((org.telegram.ui.vq0) this.f40159e).f52272n);
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
                return ((wt0) this.f40159e).G.length - 1;
            case 1:
                return 100;
            default:
                return Math.max(0, ((org.telegram.ui.vq0) this.f40159e).f52274s.Z7 - 1);
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((wt0) this.f40159e).J;
            case 1:
                return org.telegram.messenger.qc.c();
            default:
                return ((org.telegram.ui.vq0) this.f40159e).f52274s.Y7;
        }
    }

    @Override
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.M0(2131748868, null));
                sb2.append(", ");
                int c10 = org.telegram.messenger.qc.c();
                if (c10 <= 0) {
                    sb2.append(org.telegram.messenger.hd.M0(2131748876, null));
                } else if (c10 >= 100) {
                    sb2.append(org.telegram.messenger.hd.M0(2131748875, null));
                } else {
                    sb2.append(org.telegram.messenger.hd.a0(null, null, 2131754849, Integer.valueOf(Math.round(c10))));
                }
                accessibilityEvent.setContentDescription(sb2);
                ((org.telegram.ui.v90) this.f40159e).setContentDescription(sb2);
                return;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }
}

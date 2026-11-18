package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
public final class cu0 extends wm0 {
    public final int d;
    public final View f34183e;

    public cu0(int i7, View view) {
        this.d = i7;
        this.f34183e = view;
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
                ((eu0) this.f34183e).setOption(min);
                return;
            case 1:
                ym0 ym0Var = ((org.telegram.ui.w90) this.f34183e).h;
                float f10 = min / 100.0f;
                ym0Var.f42545y.n(true, f10);
                ym0Var.setProgress(f10);
                return;
            default:
                if (((org.telegram.ui.xq0) this.f34183e).f53922s.Z7 > 0 && (max = Math.max(0, Math.min(((org.telegram.ui.xq0) this.f34183e).f53922s.Z7 - 1, min))) != ((org.telegram.ui.xq0) this.f34183e).f53922s.Y7) {
                    org.telegram.ui.xq0 xq0Var = (org.telegram.ui.xq0) this.f34183e;
                    xq0Var.f53921r = xq0Var.f53922s.Y7;
                    ((org.telegram.ui.xq0) this.f34183e).f53922s.Y7 = max;
                    ((org.telegram.ui.xq0) this.f34183e).f53922s.L0();
                    ((org.telegram.ui.xq0) this.f34183e).invalidate();
                    int i10 = ((org.telegram.ui.xq0) this.f34183e).f53922s.Y7;
                    org.telegram.ui.xq0 xq0Var2 = (org.telegram.ui.xq0) this.f34183e;
                    if (i10 != xq0Var2.f53921r) {
                        xq0Var2.f53922s.n2(1);
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
                eu0 eu0Var = (eu0) this.f34183e;
                int i7 = eu0Var.J;
                String[] strArr = eu0Var.G;
                if (i7 < strArr.length) {
                    return strArr[i7];
                }
                return null;
            case 1:
            default:
                return super.d();
            case 2:
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.gd.M0(2131754735, "AccDescrVideoQuality"));
                if (((org.telegram.ui.xq0) this.f34183e).f53922s.Z7 > 0) {
                    sb2.append(", ");
                    sb2.append(((org.telegram.ui.xq0) this.f34183e).f53922s.Y7 + 1);
                    sb2.append(" / ");
                    sb2.append(((org.telegram.ui.xq0) this.f34183e).f53922s.Z7);
                }
                sb2.append(", ");
                sb2.append(((org.telegram.ui.xq0) this.f34183e).h);
                sb2.append(" – ");
                sb2.append(((org.telegram.ui.xq0) this.f34183e).f53920n);
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
                return ((eu0) this.f34183e).G.length - 1;
            case 1:
                return 100;
            default:
                return Math.max(0, ((org.telegram.ui.xq0) this.f34183e).f53922s.Z7 - 1);
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((eu0) this.f34183e).J;
            case 1:
                return org.telegram.messenger.pc.c();
            default:
                return ((org.telegram.ui.xq0) this.f34183e).f53922s.Y7;
        }
    }

    @Override
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb2 = new StringBuilder(org.telegram.messenger.gd.M0(2131748676, null));
                sb2.append(", ");
                int c10 = org.telegram.messenger.pc.c();
                if (c10 <= 0) {
                    sb2.append(org.telegram.messenger.gd.M0(2131748684, null));
                } else if (c10 >= 100) {
                    sb2.append(org.telegram.messenger.gd.M0(2131748683, null));
                } else {
                    sb2.append(org.telegram.messenger.gd.a0(null, null, 2131754849, Integer.valueOf(Math.round(c10))));
                }
                accessibilityEvent.setContentDescription(sb2);
                ((org.telegram.ui.w90) this.f34183e).setContentDescription(sb2);
                return;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }
}

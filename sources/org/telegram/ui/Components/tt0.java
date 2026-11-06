package org.telegram.ui.Components;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
public final class tt0 extends km0 {
    public final int d;
    public final View f38413e;

    public tt0(int i7, View view) {
        this.d = i7;
        this.f38413e = view;
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
    public final void c(boolean z9) {
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
        if (z9) {
            i7 *= -1;
        }
        int min = Math.min(h(), Math.max(0, i() + i7));
        switch (this.d) {
            case 0:
                ((vt0) this.f38413e).setOption(min);
                return;
            case 1:
                mm0 mm0Var = ((org.telegram.ui.u90) this.f38413e).h;
                float f10 = min / 100.0f;
                mm0Var.f36041y.l(true, f10);
                mm0Var.setProgress(f10);
                return;
            default:
                if (((org.telegram.ui.wq0) this.f38413e).f51478s.Y7 > 0 && (max = Math.max(0, Math.min(((org.telegram.ui.wq0) this.f38413e).f51478s.Y7 - 1, min))) != ((org.telegram.ui.wq0) this.f38413e).f51478s.X7) {
                    org.telegram.ui.wq0 wq0Var = (org.telegram.ui.wq0) this.f38413e;
                    wq0Var.f51477r = wq0Var.f51478s.X7;
                    ((org.telegram.ui.wq0) this.f38413e).f51478s.X7 = max;
                    ((org.telegram.ui.wq0) this.f38413e).f51478s.L0();
                    ((org.telegram.ui.wq0) this.f38413e).invalidate();
                    int i10 = ((org.telegram.ui.wq0) this.f38413e).f51478s.X7;
                    org.telegram.ui.wq0 wq0Var2 = (org.telegram.ui.wq0) this.f38413e;
                    if (i10 != wq0Var2.f51477r) {
                        wq0Var2.f51478s.m2(1);
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
                vt0 vt0Var = (vt0) this.f38413e;
                int i7 = vt0Var.I;
                String[] strArr = vt0Var.F;
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
                if (((org.telegram.ui.wq0) this.f38413e).f51478s.Y7 > 0) {
                    sb2.append(", ");
                    sb2.append(((org.telegram.ui.wq0) this.f38413e).f51478s.X7 + 1);
                    sb2.append(" / ");
                    sb2.append(((org.telegram.ui.wq0) this.f38413e).f51478s.Y7);
                }
                sb2.append(", ");
                sb2.append(((org.telegram.ui.wq0) this.f38413e).h);
                sb2.append(" – ");
                sb2.append(((org.telegram.ui.wq0) this.f38413e).f51476n);
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
                return ((vt0) this.f38413e).F.length - 1;
            case 1:
                return 100;
            default:
                return Math.max(0, ((org.telegram.ui.wq0) this.f38413e).f51478s.Y7 - 1);
        }
    }

    public final int i() {
        switch (this.d) {
            case 0:
                return ((vt0) this.f38413e).I;
            case 1:
                return org.telegram.messenger.rc.c();
            default:
                return ((org.telegram.ui.wq0) this.f38413e).f51478s.X7;
        }
    }

    @Override
    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb2 = new StringBuilder(org.telegram.messenger.hd.M0(2131748867, null));
                sb2.append(", ");
                int c10 = org.telegram.messenger.rc.c();
                if (c10 <= 0) {
                    sb2.append(org.telegram.messenger.hd.M0(2131748875, null));
                } else if (c10 >= 100) {
                    sb2.append(org.telegram.messenger.hd.M0(2131748874, null));
                } else {
                    sb2.append(org.telegram.messenger.hd.a0(null, null, 2131754849, Integer.valueOf(Math.round(c10))));
                }
                accessibilityEvent.setContentDescription(sb2);
                ((org.telegram.ui.u90) this.f38413e).setContentDescription(sb2);
                return;
            default:
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }
}

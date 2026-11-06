package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class if0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.a6 {
    public static final org.telegram.ui.Components.oa0 f46659n;
    public static final org.telegram.ui.Components.oa0 f46660r;
    public final int f46661a;
    public final org.telegram.ui.Components.l9 f46662b;
    public final org.telegram.ui.ActionBar.k5 f46663c;
    public final TextView d;
    public final org.telegram.ui.Components.w8 f46664e;
    public final org.telegram.ui.Components.nu0 f46665f;
    public TLObject h;

    static {
        int i7 = org.telegram.ui.ActionBar.k6.f28240y6;
        f46659n = new org.telegram.ui.Components.oa0(2131232234, i7);
        f46660r = new org.telegram.ui.Components.oa0(2131231939, i7);
    }

    public if0(Context context) {
        super(context);
        int i7;
        this.f46661a = org.telegram.messenger.p10.f24459s0;
        this.f46664e = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f46662b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f46663c = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(!org.telegram.messenger.hd.f22871a0);
        k5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        if (org.telegram.messenger.hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        k5Var.setGravity(i7);
        this.f46665f = new org.telegram.ui.Components.nu0(this);
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28240y6, null);
        textView.setGravity(org.telegram.messenger.hd.f22871a0 ? 5 : 3);
        if (org.telegram.messenger.hd.f22871a0) {
            addView(l9Var, c8.ha.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(k5Var, c8.ha.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, c8.ha.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(l9Var, c8.ha.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(k5Var, c8.ha.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, c8.ha.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, int i7, boolean z9) {
        org.telegram.ui.Components.oa0 oa0Var;
        this.h = tLObject;
        org.telegram.ui.Components.g5 a10 = this.f46665f.a(tLObject, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z9, false), false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f46663c;
        k5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.w8 w8Var = this.f46664e;
            w8Var.p(tLObject);
            this.f46662b.j(org.telegram.messenger.hc.m(this.f46661a, 1, tLObject), "50_50", w8Var, tLObject);
            k5Var.l(org.telegram.messenger.g5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i7 <= 0) {
            textView.setVisibility(8);
            k5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
            return;
        }
        if (z9) {
            oa0Var = f46660r;
        } else {
            oa0Var = f46659n;
        }
        textView.setText(TextUtils.concat(oa0Var.a(getContext(), null), org.telegram.messenger.hd.O(i7)));
        textView.setVisibility(0);
        k5Var.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z9));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.User user;
        if (i7 == org.telegram.messenger.qs.f25023m5) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f27101id == user2.f27101id) {
                this.h = user2;
                this.f46663c.i(this.f46665f.a(user2, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z9, false), true));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46665f.f36387a.a();
        org.telegram.messenger.qs.f(this.f46661a).c(this, org.telegram.messenger.qs.f25023m5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46665f.f36387a.b();
        org.telegram.messenger.qs.f(this.f46661a).n(this, org.telegram.messenger.qs.f25023m5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.hd.a0("AccDescrPersonHasSeen", null, 2131754812, this.f46663c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder j3 = rf.b.j(a02, " ");
            j3.append((Object) textView.getText());
            a02 = j3.toString();
        }
        accessibilityNodeInfo.setText(a02);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        boolean z9;
        org.telegram.ui.Components.nu0 nu0Var = this.f46665f;
        if (nu0Var != null) {
            try {
                org.telegram.ui.Components.g5 g5Var = nu0Var.f36387a;
                if (g5Var != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.z9, false);
                    Integer num = g5Var.F;
                    if (num != null && num.intValue() != x02) {
                        g5Var.k(Integer.valueOf(x02));
                        org.telegram.ui.ActionBar.k5 k5Var = this.f46663c;
                        if (k5Var != null) {
                            k5Var.invalidate();
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

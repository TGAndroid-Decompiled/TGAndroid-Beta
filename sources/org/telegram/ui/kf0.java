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
public final class kf0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.b6 {
    public static final org.telegram.ui.Components.pa0 f47280n;
    public static final org.telegram.ui.Components.pa0 f47281r;
    public final int f47282a;
    public final org.telegram.ui.Components.l9 f47283b;
    public final org.telegram.ui.ActionBar.l5 f47284c;
    public final TextView d;
    public final org.telegram.ui.Components.w8 f47285e;
    public final org.telegram.ui.Components.pu0 f47286f;
    public TLObject h;

    static {
        int i7 = org.telegram.ui.ActionBar.l6.f28257y6;
        f47280n = new org.telegram.ui.Components.pa0(2131232234, i7);
        f47281r = new org.telegram.ui.Components.pa0(2131231939, i7);
    }

    public kf0(Context context) {
        super(context);
        int i7;
        this.f47282a = org.telegram.messenger.p10.f24470s0;
        this.f47285e = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        this.f47283b = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f47284c = l5Var;
        l5Var.setTextSize(16);
        l5Var.setEllipsizeByGradient(!org.telegram.messenger.id.f23157a0);
        l5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.E8, null);
        if (org.telegram.messenger.id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        l5Var.setGravity(i7);
        this.f47286f = new org.telegram.ui.Components.pu0(this);
        l5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.f28257y6, null);
        textView.setGravity(org.telegram.messenger.id.f23157a0 ? 5 : 3);
        if (org.telegram.messenger.id.f23157a0) {
            addView(l9Var, c8.ha.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(l5Var, c8.ha.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, c8.ha.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(l9Var, c8.ha.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(l5Var, c8.ha.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, c8.ha.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, int i7, boolean z9) {
        org.telegram.ui.Components.pa0 pa0Var;
        this.h = tLObject;
        org.telegram.ui.Components.g5 a10 = this.f47286f.a(tLObject, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.z9, false), false);
        org.telegram.ui.ActionBar.l5 l5Var = this.f47284c;
        l5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.w8 w8Var = this.f47285e;
            w8Var.p(tLObject);
            this.f47283b.j(org.telegram.messenger.hc.m(this.f47282a, 1, tLObject), "50_50", w8Var, tLObject);
            l5Var.l(org.telegram.messenger.g5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i7 <= 0) {
            textView.setVisibility(8);
            l5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
            return;
        }
        if (z9) {
            pa0Var = f47281r;
        } else {
            pa0Var = f47280n;
        }
        textView.setText(TextUtils.concat(pa0Var.a(getContext(), null), org.telegram.messenger.id.O(i7)));
        textView.setVisibility(0);
        l5Var.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z9));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.User user;
        if (i7 == org.telegram.messenger.qs.f25040m5) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f27105id == user2.f27105id) {
                this.h = user2;
                this.f47284c.i(this.f47286f.a(user2, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.z9, false), true));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47286f.f37095a.a();
        org.telegram.messenger.qs.f(this.f47282a).c(this, org.telegram.messenger.qs.f25040m5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47286f.f37095a.b();
        org.telegram.messenger.qs.f(this.f47282a).n(this, org.telegram.messenger.qs.f25040m5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.id.a0("AccDescrPersonHasSeen", null, 2131754812, this.f47284c.getText());
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
        org.telegram.ui.Components.pu0 pu0Var = this.f47286f;
        if (pu0Var != null) {
            try {
                org.telegram.ui.Components.g5 g5Var = pu0Var.f37095a;
                if (g5Var != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    int x02 = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.z9, false);
                    Integer num = g5Var.F;
                    if (num != null && num.intValue() != x02) {
                        g5Var.k(Integer.valueOf(x02));
                        org.telegram.ui.ActionBar.l5 l5Var = this.f47284c;
                        if (l5Var != null) {
                            l5Var.invalidate();
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

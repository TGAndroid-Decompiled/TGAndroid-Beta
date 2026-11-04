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
public final class cf0 extends FrameLayout implements org.telegram.messenger.cs, org.telegram.ui.ActionBar.z5 {
    public static final org.telegram.ui.Components.ja0 f44339n;
    public static final org.telegram.ui.Components.ja0 f44340r;
    public final int f44341a;
    public final org.telegram.ui.Components.k9 f44342b;
    public final org.telegram.ui.ActionBar.k5 f44343c;
    public final TextView d;
    public final org.telegram.ui.Components.u8 f44344e;
    public final org.telegram.ui.Components.mu0 f44345f;
    public TLObject h;

    static {
        int i3 = org.telegram.ui.ActionBar.k6.f28273y6;
        f44339n = new org.telegram.ui.Components.ja0(2131232234, i3);
        f44340r = new org.telegram.ui.Components.ja0(2131231939, i3);
    }

    public cf0(Context context) {
        super(context);
        int i3;
        this.f44341a = org.telegram.messenger.h10.f22829t0;
        this.f44344e = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f44342b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f44343c = k5Var;
        k5Var.setTextSize(16);
        k5Var.setEllipsizeByGradient(!org.telegram.messenger.bd.f21784a0);
        k5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.E8, null);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        k5Var.setGravity(i3);
        this.f44345f = new org.telegram.ui.Components.mu0(this);
        k5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28273y6, null);
        textView.setGravity(org.telegram.messenger.bd.f21784a0 ? 5 : 3);
        if (org.telegram.messenger.bd.f21784a0) {
            addView(k9Var, b8.mf.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(k5Var, b8.mf.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, b8.mf.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(k9Var, b8.mf.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(k5Var, b8.mf.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, b8.mf.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, int i3, boolean z10) {
        org.telegram.ui.Components.ja0 ja0Var;
        this.h = tLObject;
        org.telegram.ui.Components.e5 a10 = this.f44345f.a(tLObject, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28293z9, false), false);
        org.telegram.ui.ActionBar.k5 k5Var = this.f44343c;
        k5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.u8 u8Var = this.f44344e;
            u8Var.p(tLObject);
            this.f44342b.j(org.telegram.messenger.ac.m(this.f44341a, 1, tLObject), "50_50", u8Var, tLObject);
            k5Var.l(org.telegram.messenger.g5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i3 <= 0) {
            textView.setVisibility(8);
            k5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
            return;
        }
        if (z10) {
            ja0Var = f44340r;
        } else {
            ja0Var = f44339n;
        }
        textView.setText(TextUtils.concat(ja0Var.a(getContext(), null), org.telegram.messenger.bd.O(i3)));
        textView.setVisibility(0);
        k5Var.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28293z9));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.User user;
        if (i3 == org.telegram.messenger.hs.f23268m5) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f27150id == user2.f27150id) {
                this.h = user2;
                this.f44343c.i(this.f44345f.a(user2, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28293z9, false), true));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f44345f.f36254a.a();
        org.telegram.messenger.hs.f(this.f44341a).c(this, org.telegram.messenger.hs.f23268m5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f44345f.f36254a.b();
        org.telegram.messenger.hs.f(this.f44341a).n(this, org.telegram.messenger.hs.f23268m5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.bd.a0("AccDescrPersonHasSeen", null, 2131754812, this.f44343c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder h = t4.c.h(a02, " ");
            h.append((Object) textView.getText());
            a02 = h.toString();
        }
        accessibilityNodeInfo.setText(a02);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        boolean z10;
        org.telegram.ui.Components.mu0 mu0Var = this.f44345f;
        if (mu0Var != null) {
            try {
                org.telegram.ui.Components.e5 e5Var = mu0Var.f36254a;
                if (e5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28293z9, false);
                    Integer num = e5Var.G;
                    if (num != null && num.intValue() != x02) {
                        e5Var.k(Integer.valueOf(x02));
                        org.telegram.ui.ActionBar.k5 k5Var = this.f44343c;
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

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
public final class lf0 extends FrameLayout implements org.telegram.messenger.ls, org.telegram.ui.ActionBar.c6 {
    public static final org.telegram.ui.Components.oa0 f47597n;
    public static final org.telegram.ui.Components.oa0 f47598r;
    public final int f47599a;
    public final org.telegram.ui.Components.k9 f47600b;
    public final org.telegram.ui.ActionBar.m5 f47601c;
    public final TextView d;
    public final org.telegram.ui.Components.v8 f47602e;
    public final org.telegram.ui.Components.ou0 f47603f;
    public TLObject h;

    static {
        int i7 = org.telegram.ui.ActionBar.m6.f28282y6;
        f47597n = new org.telegram.ui.Components.oa0(2131232234, i7);
        f47598r = new org.telegram.ui.Components.oa0(2131231939, i7);
    }

    public lf0(Context context) {
        super(context);
        int i7;
        this.f47599a = org.telegram.messenger.p10.f24474s0;
        this.f47602e = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f47600b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f47601c = m5Var;
        m5Var.setTextSize(16);
        m5Var.setEllipsizeByGradient(!org.telegram.messenger.id.f23161a0);
        m5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.E8, null);
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        m5Var.setGravity(i7);
        this.f47603f = new org.telegram.ui.Components.ou0(this);
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f28282y6, null);
        textView.setGravity(org.telegram.messenger.id.f23161a0 ? 5 : 3);
        if (org.telegram.messenger.id.f23161a0) {
            addView(k9Var, c8.ha.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(m5Var, c8.ha.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, c8.ha.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(k9Var, c8.ha.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(m5Var, c8.ha.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, c8.ha.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, int i7, boolean z9) {
        org.telegram.ui.Components.oa0 oa0Var;
        this.h = tLObject;
        org.telegram.ui.Components.f5 a10 = this.f47603f.a(tLObject, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.z9, false), false);
        org.telegram.ui.ActionBar.m5 m5Var = this.f47601c;
        m5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.v8 v8Var = this.f47602e;
            v8Var.p(tLObject);
            this.f47600b.j(org.telegram.messenger.hc.m(this.f47599a, 1, tLObject), "50_50", v8Var, tLObject);
            m5Var.l(org.telegram.messenger.g5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i7 <= 0) {
            textView.setVisibility(8);
            m5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
            return;
        }
        if (z9) {
            oa0Var = f47598r;
        } else {
            oa0Var = f47597n;
        }
        textView.setText(TextUtils.concat(oa0Var.a(getContext(), null), org.telegram.messenger.id.O(i7)));
        textView.setVisibility(0);
        m5Var.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z9));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.User user;
        if (i7 == org.telegram.messenger.qs.f25044m5) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f27109id == user2.f27109id) {
                this.h = user2;
                this.f47601c.i(this.f47603f.a(user2, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.z9, false), true));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47603f.f36694a.a();
        org.telegram.messenger.qs.f(this.f47599a).c(this, org.telegram.messenger.qs.f25044m5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47603f.f36694a.b();
        org.telegram.messenger.qs.f(this.f47599a).n(this, org.telegram.messenger.qs.f25044m5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.id.a0("AccDescrPersonHasSeen", null, 2131754812, this.f47601c.getText());
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
        org.telegram.ui.Components.ou0 ou0Var = this.f47603f;
        if (ou0Var != null) {
            try {
                org.telegram.ui.Components.f5 f5Var = ou0Var.f36694a;
                if (f5Var != null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.z9, false);
                    Integer num = f5Var.F;
                    if (num != null && num.intValue() != x02) {
                        f5Var.k(Integer.valueOf(x02));
                        org.telegram.ui.ActionBar.m5 m5Var = this.f47601c;
                        if (m5Var != null) {
                            m5Var.invalidate();
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

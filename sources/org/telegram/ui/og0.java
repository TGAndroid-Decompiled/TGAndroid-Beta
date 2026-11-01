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
public final class og0 extends FrameLayout implements org.telegram.messenger.vs, org.telegram.ui.ActionBar.k6 {
    public static final org.telegram.ui.Components.hb0 f40156n;
    public static final org.telegram.ui.Components.hb0 f40157r;
    public final int f40158a;
    public final org.telegram.ui.Components.g9 f40159b;
    public final org.telegram.ui.ActionBar.u5 f40160c;
    public final TextView d;
    public final org.telegram.ui.Components.r8 e;
    public final org.telegram.ui.Components.qv0 f40161f;
    public TLObject h;

    static {
        int i10 = org.telegram.ui.ActionBar.t6.f21312y6;
        f40156n = new org.telegram.ui.Components.hb0(2131232233, i10);
        f40157r = new org.telegram.ui.Components.hb0(2131231938, i10);
    }

    public og0(Context context) {
        super(context);
        int i10;
        this.f40158a = org.telegram.messenger.e20.f15506s0;
        this.e = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.f40159b = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(18.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.f40160c = u5Var;
        u5Var.setTextSize(16);
        u5Var.setEllipsizeByGradient(!org.telegram.messenger.dd.X);
        u5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.E8, null);
        if (org.telegram.messenger.dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        u5Var.setGravity(i10);
        this.f40161f = new org.telegram.ui.Components.qv0(this);
        u5Var.setDrawablePadding(org.telegram.messenger.i0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21312y6, null);
        textView.setGravity(org.telegram.messenger.dd.X ? 5 : 3);
        if (org.telegram.messenger.dd.X) {
            addView(g9Var, w7.b6.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(u5Var, w7.b6.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, w7.b6.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(g9Var, w7.b6.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(u5Var, w7.b6.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, w7.b6.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, int i10, boolean z10) {
        org.telegram.ui.Components.hb0 hb0Var;
        this.h = tLObject;
        org.telegram.ui.Components.d5 a2 = this.f40161f.a(tLObject, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21334z9, false), false);
        org.telegram.ui.ActionBar.u5 u5Var = this.f40160c;
        u5Var.i(a2);
        if (tLObject != null) {
            org.telegram.ui.Components.r8 r8Var = this.e;
            r8Var.p(tLObject);
            this.f40159b.j(org.telegram.messenger.jc.m(this.f40158a, 1, tLObject), "50_50", r8Var, tLObject);
            u5Var.l(org.telegram.messenger.i5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i10 <= 0) {
            textView.setVisibility(8);
            u5Var.setTranslationY(org.telegram.messenger.i0.L(9.0f));
            return;
        }
        if (z10) {
            hb0Var = f40157r;
        } else {
            hb0Var = f40156n;
        }
        textView.setText(TextUtils.concat(hb0Var.a(getContext(), null), org.telegram.messenger.dd.O(i10)));
        textView.setVisibility(0);
        u5Var.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21334z9));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.User user;
        if (i10 == org.telegram.messenger.at.f14748m5) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f19943id == user2.f19943id) {
                this.h = user2;
                this.f40160c.i(this.f40161f.a(user2, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21334z9, false), true));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f40161f.f29813a.a();
        org.telegram.messenger.at.f(this.f40158a).c(this, org.telegram.messenger.at.f14748m5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40161f.f29813a.b();
        org.telegram.messenger.at.f(this.f40158a).n(this, org.telegram.messenger.at.f14748m5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.dd.a0("AccDescrPersonHasSeen", null, 2131754812, this.f40160c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder i10 = sc.e.i(a02, " ");
            i10.append((Object) textView.getText());
            a02 = i10.toString();
        }
        accessibilityNodeInfo.setText(a02);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        boolean z10;
        org.telegram.ui.Components.qv0 qv0Var = this.f40161f;
        if (qv0Var != null) {
            try {
                org.telegram.ui.Components.d5 d5Var = qv0Var.f29813a;
                if (d5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21334z9, false);
                    Integer num = d5Var.F;
                    if (num != null && num.intValue() != x02) {
                        d5Var.k(Integer.valueOf(x02));
                        org.telegram.ui.ActionBar.u5 u5Var = this.f40160c;
                        if (u5Var != null) {
                            u5Var.invalidate();
                        }
                    }
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }
}

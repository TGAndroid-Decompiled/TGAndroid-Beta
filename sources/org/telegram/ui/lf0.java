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
public final class lf0 extends FrameLayout implements org.telegram.messenger.gs, org.telegram.ui.ActionBar.b6 {
    public static final org.telegram.ui.Components.ab0 f49586n;
    public static final org.telegram.ui.Components.ab0 f49587r;
    public final int f49588a;
    public final org.telegram.ui.Components.q9 f49589b;
    public final org.telegram.ui.ActionBar.m5 f49590c;
    public final TextView d;
    public final org.telegram.ui.Components.b9 f49591e;
    public final org.telegram.ui.Components.av0 f49592f;
    public TLObject h;

    static {
        int i7 = org.telegram.ui.ActionBar.m6.f29739y6;
        f49586n = new org.telegram.ui.Components.ab0(2131232236, i7);
        f49587r = new org.telegram.ui.Components.ab0(2131231940, i7);
    }

    public lf0(Context context) {
        super(context);
        int i7;
        this.f49588a = org.telegram.messenger.k10.f24932t0;
        this.f49591e = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f49589b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.f49590c = m5Var;
        m5Var.setTextSize(16);
        m5Var.setEllipsizeByGradient(!org.telegram.messenger.hd.f24408a0);
        m5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.t6.X(m5Var, org.telegram.ui.ActionBar.m6.E8, null);
        if (org.telegram.messenger.hd.f24408a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        m5Var.setGravity(i7);
        this.f49592f = new org.telegram.ui.Components.av0(this);
        m5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29739y6, null);
        textView.setGravity(org.telegram.messenger.hd.f24408a0 ? 5 : 3);
        if (org.telegram.messenger.hd.f24408a0) {
            addView(q9Var, c8.na.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(m5Var, c8.na.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, c8.na.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(q9Var, c8.na.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(m5Var, c8.na.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, c8.na.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, int i7, boolean z10) {
        org.telegram.ui.Components.ab0 ab0Var;
        this.h = tLObject;
        org.telegram.ui.Components.n5 a10 = this.f49592f.a(tLObject, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29761z9, false), false);
        org.telegram.ui.ActionBar.m5 m5Var = this.f49590c;
        m5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.b9 b9Var = this.f49591e;
            b9Var.p(tLObject);
            this.f49589b.j(org.telegram.messenger.gc.m(this.f49588a, 1, tLObject), "50_50", b9Var, tLObject);
            m5Var.l(org.telegram.messenger.i5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i7 <= 0) {
            textView.setVisibility(8);
            m5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
            return;
        }
        if (z10) {
            ab0Var = f49587r;
        } else {
            ab0Var = f49586n;
        }
        textView.setText(TextUtils.concat(ab0Var.a(getContext(), null), org.telegram.messenger.hd.O(i7)));
        textView.setVisibility(0);
        m5Var.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29761z9));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.User user;
        if (i7 == org.telegram.messenger.ls.f25328p5) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f28547id == user2.f28547id) {
                this.h = user2;
                this.f49590c.i(this.f49592f.a(user2, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29761z9, false), true));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49592f.f33625a.a();
        org.telegram.messenger.ls.f(this.f49588a).c(this, org.telegram.messenger.ls.f25328p5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49592f.f33625a.b();
        org.telegram.messenger.ls.f(this.f49588a).n(this, org.telegram.messenger.ls.f25328p5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.hd.a0("AccDescrPersonHasSeen", null, 2131754811, this.f49590c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder n10 = p5.c.n(a02, " ");
            n10.append((Object) textView.getText());
            a02 = n10.toString();
        }
        accessibilityNodeInfo.setText(a02);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    @Override
    public final void updateColors() {
        boolean z10;
        org.telegram.ui.Components.av0 av0Var = this.f49592f;
        if (av0Var != null) {
            try {
                org.telegram.ui.Components.n5 n5Var = av0Var.f33625a;
                if (n5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29761z9, false);
                    Integer num = n5Var.G;
                    if (num != null && num.intValue() != x02) {
                        n5Var.k(Integer.valueOf(x02));
                        org.telegram.ui.ActionBar.m5 m5Var = this.f49590c;
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

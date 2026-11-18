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
public final class lf0 extends FrameLayout implements org.telegram.messenger.fs, org.telegram.ui.ActionBar.c6 {
    public static final org.telegram.ui.Components.za0 f49593n;
    public static final org.telegram.ui.Components.za0 f49594r;
    public final int f49595a;
    public final org.telegram.ui.Components.q9 f49596b;
    public final org.telegram.ui.ActionBar.n5 f49597c;
    public final TextView d;
    public final org.telegram.ui.Components.b9 f49598e;
    public final org.telegram.ui.Components.xu0 f49599f;
    public TLObject h;

    static {
        int i7 = org.telegram.ui.ActionBar.n6.f29788y6;
        f49593n = new org.telegram.ui.Components.za0(2131232236, i7);
        f49594r = new org.telegram.ui.Components.za0(2131231940, i7);
    }

    public lf0(Context context) {
        super(context);
        int i7;
        this.f49595a = org.telegram.messenger.j10.f24773t0;
        this.f49598e = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f49596b = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.f49597c = n5Var;
        n5Var.setTextSize(16);
        n5Var.setEllipsizeByGradient(!org.telegram.messenger.gd.f24216a0);
        n5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.E8, null);
        if (org.telegram.messenger.gd.f24216a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        n5Var.setGravity(i7);
        this.f49599f = new org.telegram.ui.Components.xu0(this);
        n5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29788y6, null);
        textView.setGravity(org.telegram.messenger.gd.f24216a0 ? 5 : 3);
        if (org.telegram.messenger.gd.f24216a0) {
            addView(q9Var, c8.ma.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(n5Var, c8.ma.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, c8.ma.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(q9Var, c8.ma.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(n5Var, c8.ma.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, c8.ma.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, int i7, boolean z10) {
        org.telegram.ui.Components.za0 za0Var;
        this.h = tLObject;
        org.telegram.ui.Components.m5 a10 = this.f49599f.a(tLObject, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29810z9, false), false);
        org.telegram.ui.ActionBar.n5 n5Var = this.f49597c;
        n5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.b9 b9Var = this.f49598e;
            b9Var.p(tLObject);
            this.f49596b.j(org.telegram.messenger.fc.m(this.f49595a, 1, tLObject), "50_50", b9Var, tLObject);
            n5Var.l(org.telegram.messenger.i5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i7 <= 0) {
            textView.setVisibility(8);
            n5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
            return;
        }
        if (z10) {
            za0Var = f49594r;
        } else {
            za0Var = f49593n;
        }
        textView.setText(TextUtils.concat(za0Var.a(getContext(), null), org.telegram.messenger.gd.O(i7)));
        textView.setVisibility(0);
        n5Var.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29810z9));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.User user;
        if (i7 == org.telegram.messenger.ks.f25166o5) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f28554id == user2.f28554id) {
                this.h = user2;
                this.f49597c.i(this.f49599f.a(user2, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29810z9, false), true));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49599f.f42195a.a();
        org.telegram.messenger.ks.f(this.f49595a).c(this, org.telegram.messenger.ks.f25166o5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49599f.f42195a.b();
        org.telegram.messenger.ks.f(this.f49595a).n(this, org.telegram.messenger.ks.f25166o5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.gd.a0("AccDescrPersonHasSeen", null, 2131754812, this.f49597c.getText());
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
        org.telegram.ui.Components.xu0 xu0Var = this.f49599f;
        if (xu0Var != null) {
            try {
                org.telegram.ui.Components.m5 m5Var = xu0Var.f42195a;
                if (m5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29810z9, false);
                    Integer num = m5Var.G;
                    if (num != null && num.intValue() != x02) {
                        m5Var.k(Integer.valueOf(x02));
                        org.telegram.ui.ActionBar.n5 n5Var = this.f49597c;
                        if (n5Var != null) {
                            n5Var.invalidate();
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

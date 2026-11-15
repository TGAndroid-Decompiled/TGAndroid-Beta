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
public final class if0 extends FrameLayout implements org.telegram.messenger.is, org.telegram.ui.ActionBar.z5 {
    public static final org.telegram.ui.Components.pa0 f48039n;
    public static final org.telegram.ui.Components.pa0 f48040r;
    public final int f48041a;
    public final org.telegram.ui.Components.i9 f48042b;
    public final org.telegram.ui.ActionBar.j5 f48043c;
    public final TextView d;
    public final org.telegram.ui.Components.t8 f48044e;
    public final org.telegram.ui.Components.pu0 f48045f;
    public TLObject h;

    static {
        int i7 = org.telegram.ui.ActionBar.j6.f29241y6;
        f48039n = new org.telegram.ui.Components.pa0(2131232235, i7);
        f48040r = new org.telegram.ui.Components.pa0(2131231939, i7);
    }

    public if0(Context context) {
        super(context);
        int i7;
        this.f48041a = org.telegram.messenger.m10.f24934t0;
        this.f48044e = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(context);
        this.f48042b = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(18.0f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.f48043c = j5Var;
        j5Var.setTextSize(16);
        j5Var.setEllipsizeByGradient(!org.telegram.messenger.hd.f24101a0);
        j5Var.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.q6.X(j5Var, org.telegram.ui.ActionBar.j6.E8, null);
        if (org.telegram.messenger.hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        j5Var.setGravity(i7);
        this.f48045f = new org.telegram.ui.Components.pu0(this);
        j5Var.setDrawablePadding(org.telegram.messenger.g0.L(3.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 13.0f);
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29241y6, null);
        textView.setGravity(org.telegram.messenger.hd.f24101a0 ? 5 : 3);
        if (org.telegram.messenger.hd.f24101a0) {
            addView(i9Var, c8.ja.d(34, 34.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            addView(j5Var, c8.ja.d(-2, -2.0f, 53, 8.0f, 5.33f, 55.0f, 0.0f));
            addView(textView, c8.ja.d(-2, -2.0f, 53, 13.0f, 19.0f, 55.0f, 0.0f));
            return;
        }
        addView(i9Var, c8.ja.d(34, 34.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        addView(j5Var, c8.ja.d(-2, -2.0f, 51, 55.0f, 5.33f, 8.0f, 0.0f));
        addView(textView, c8.ja.d(-2, -2.0f, 51, 55.0f, 19.0f, 13.0f, 0.0f));
    }

    public final void a(TLObject tLObject, int i7, boolean z10) {
        org.telegram.ui.Components.pa0 pa0Var;
        this.h = tLObject;
        org.telegram.ui.Components.e5 a10 = this.f48045f.a(tLObject, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29263z9, false), false);
        org.telegram.ui.ActionBar.j5 j5Var = this.f48043c;
        j5Var.i(a10);
        if (tLObject != null) {
            org.telegram.ui.Components.t8 t8Var = this.f48044e;
            t8Var.p(tLObject);
            this.f48042b.j(org.telegram.messenger.gc.m(this.f48041a, 1, tLObject), "50_50", t8Var, tLObject);
            j5Var.l(org.telegram.messenger.g5.o(tLObject), false);
        }
        TextView textView = this.d;
        if (i7 <= 0) {
            textView.setVisibility(8);
            j5Var.setTranslationY(org.telegram.messenger.g0.L(9.0f));
            return;
        }
        if (z10) {
            pa0Var = f48040r;
        } else {
            pa0Var = f48039n;
        }
        textView.setText(TextUtils.concat(pa0Var.a(getContext(), null), org.telegram.messenger.hd.O(i7)));
        textView.setVisibility(0);
        j5Var.setTranslationY(0.0f);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29263z9));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.User user;
        if (i7 == org.telegram.messenger.ns.f25536m5) {
            TLRPC.User user2 = (TLRPC.User) objArr[0];
            TLObject tLObject = this.h;
            if (tLObject instanceof TLRPC.User) {
                user = (TLRPC.User) tLObject;
            } else {
                user = null;
            }
            if (user != null && user2 != null && user.f28200id == user2.f28200id) {
                this.h = user2;
                this.f48043c.i(this.f48045f.a(user2, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29263z9, false), true));
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48045f.f38413a.a();
        org.telegram.messenger.ns.f(this.f48041a).c(this, org.telegram.messenger.ns.f25536m5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48045f.f38413a.b();
        org.telegram.messenger.ns.f(this.f48041a).n(this, org.telegram.messenger.ns.f25536m5);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String a02 = org.telegram.messenger.hd.a0("AccDescrPersonHasSeen", null, 2131754812, this.f48043c.getText());
        TextView textView = this.d;
        if (textView.getVisibility() == 0) {
            StringBuilder m10 = r.b.m(a02, " ");
            m10.append((Object) textView.getText());
            a02 = m10.toString();
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
        org.telegram.ui.Components.pu0 pu0Var = this.f48045f;
        if (pu0Var != null) {
            try {
                org.telegram.ui.Components.e5 e5Var = pu0Var.f38413a;
                if (e5Var != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f29263z9, false);
                    Integer num = e5Var.G;
                    if (num != null && num.intValue() != x02) {
                        e5Var.k(Integer.valueOf(x02));
                        org.telegram.ui.ActionBar.j5 j5Var = this.f48043c;
                        if (j5Var != null) {
                            j5Var.invalidate();
                        }
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }
}

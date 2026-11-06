package org.telegram.ui;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
public class PopupNotificationActivity extends Activity implements org.telegram.messenger.ls {
    public static final int f41588b0 = 0;
    public LinearLayout D;
    public ds0 E;
    public int K;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public CharSequence P;
    public boolean Z;
    public org.telegram.ui.ActionBar.k f41589a;
    public ChatActivityEnterView f41591b;
    public org.telegram.ui.Components.l9 f41592c;
    public TextView d;
    public TextView f41593e;
    public FrameLayout f41594f;
    public TextView h;
    public k0 f41595n;
    public ViewGroup f41596r;
    public ViewGroup f41597s;
    public ViewGroup f41598w;
    public LinearLayout f41599x;
    public LinearLayout f41600y;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public VelocityTracker I = null;
    public final org.telegram.ui.Components.ou0[] J = new org.telegram.ui.Components.ou0[5];
    public int L = -1;
    public boolean O = false;
    public org.telegram.messenger.ij Q = null;
    public final org.telegram.messenger.ij[] R = new org.telegram.messenger.ij[3];
    public int S = 0;
    public PowerManager.WakeLock T = null;
    public boolean U = false;
    public long V = 0;
    public float W = -1.0f;
    public boolean X = false;
    public Runnable Y = null;
    public final ArrayList f41590a0 = new ArrayList();

    public final void a(int i7) {
        int L = org.telegram.messenger.g0.f22544q.x - org.telegram.messenger.g0.L(24.0f);
        ViewGroup viewGroup = this.f41597s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != L) {
                layoutParams.width = L;
                this.f41597s.setLayoutParams(layoutParams);
            }
            this.f41597s.setTranslationX((-L) + i7);
        }
        LinearLayout linearLayout = this.f41600y;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-L) + i7);
        }
        ViewGroup viewGroup2 = this.f41596r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != L) {
                layoutParams2.width = L;
                this.f41596r.setLayoutParams(layoutParams2);
            }
            this.f41596r.setTranslationX(i7);
        }
        LinearLayout linearLayout2 = this.f41599x;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i7);
        }
        ViewGroup viewGroup3 = this.f41598w;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != L) {
                layoutParams3.width = L;
                this.f41598w.setLayoutParams(layoutParams3);
            }
            this.f41598w.setTranslationX(L + i7);
        }
        LinearLayout linearLayout3 = this.D;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(L + i7);
        }
        this.f41595n.invalidate();
    }

    public final void b() {
        TLRPC.User a22;
        org.telegram.messenger.ij ijVar = this.Q;
        if (ijVar != null) {
            int i7 = ijVar.I1;
            if (this.N != null) {
                TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(this.N.f26953id));
                if (M0 != null) {
                    this.N = M0;
                    if (this.f41592c != null) {
                        this.f41592c.e(M0, new org.telegram.ui.Components.w8(this.N));
                    }
                }
            } else if (this.M != null && (a22 = org.telegram.messenger.qp.s1(i7).a2(Long.valueOf(this.M.f27102id))) != null) {
                this.M = a22;
                if (this.f41592c != null) {
                    this.f41592c.e(a22, new org.telegram.ui.Components.w8(0, this.M));
                }
            }
        }
    }

    public final boolean c() {
        if (this.U && this.V < System.currentTimeMillis() - 400) {
            this.U = false;
            Runnable runnable = this.Y;
            if (runnable != null) {
                runnable.run();
                this.Y = null;
            }
        }
        return this.U;
    }

    public final void d() {
        FrameLayout frameLayout = this.f41594f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new fs0(this, 0));
        }
        k0 k0Var = this.f41595n;
        if (k0Var != null) {
            k0Var.getViewTreeObserver().addOnPreDrawListener(new fs0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.re0 re0Var;
        org.telegram.messenger.ij messageObject;
        org.telegram.ui.Components.re0 re0Var2;
        org.telegram.messenger.ij messageObject2;
        org.telegram.messenger.ij ijVar;
        if (i7 == org.telegram.messenger.qs.I2) {
            if (i10 == this.L) {
                i();
                finish();
                return;
            }
            return;
        }
        int i11 = 0;
        if (i7 == org.telegram.messenger.qs.f24979d4) {
            if (!this.Z) {
                ArrayList arrayList = this.f41590a0;
                arrayList.clear();
                for (int i12 = 0; i12 < 4; i12++) {
                    if (org.telegram.messenger.p10.i(i12).p()) {
                        arrayList.addAll(org.telegram.messenger.dt.t(i12).f22082w);
                    }
                }
                f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < 3; i13++) {
                        int i14 = (this.S - 1) + i13;
                        if (arrayList.size() == 1 && (i14 < 0 || i14 >= arrayList.size())) {
                            ijVar = null;
                        } else {
                            if (i14 == -1) {
                                i14 = arrayList.size() - 1;
                            } else if (i14 == arrayList.size()) {
                                i14 = 0;
                            }
                            ijVar = (org.telegram.messenger.ij) arrayList.get(i14);
                        }
                        if (this.R[i13] != ijVar) {
                            q(0);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25054r) {
            if (this.Q != null && i10 == this.L) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i15 = org.telegram.messenger.qp.C8;
                if ((intValue & 1) != 0 || (intValue & 4) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0) {
                    r();
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0) {
                    b();
                }
                if ((intValue & 64) != 0) {
                    CharSequence D1 = org.telegram.messenger.qp.s1(this.Q.I1).D1(org.telegram.messenger.ij.B0(this.Q.f23244k), 0L, false);
                    CharSequence charSequence = this.P;
                    if ((charSequence != null && D1 == null) || ((charSequence == null && D1 != null) || (charSequence != null && !charSequence.equals(D1)))) {
                        r();
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f24989f2) {
            Integer num = (Integer) objArr[0];
            k0 k0Var = this.f41595n;
            if (k0Var != null) {
                int childCount = k0Var.getChildCount();
                while (i11 < childCount) {
                    View childAt = this.f41595n.getChildAt(i11);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (re0Var2 = (org.telegram.ui.Components.re0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.I1 == i10 && messageObject2.f1() == num.intValue()) {
                        re0Var2.v();
                        return;
                    }
                    i11++;
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f24983e2) {
            Integer num2 = (Integer) objArr[0];
            k0 k0Var2 = this.f41595n;
            if (k0Var2 != null) {
                int childCount2 = k0Var2.getChildCount();
                while (i11 < childCount2) {
                    View childAt2 = this.f41595n.getChildAt(i11);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (re0Var = (org.telegram.ui.Components.re0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.I1 == i10 && messageObject.f1() == num2.intValue()) {
                        re0Var.w();
                        return;
                    }
                    i11++;
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25009i4) {
            k0 k0Var3 = this.f41595n;
            if (k0Var3 != null) {
                int childCount3 = k0Var3.getChildCount();
                while (i11 < childCount3) {
                    View childAt3 = this.f41595n.getChildAt(i11);
                    if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                        textView.invalidate();
                    }
                    i11++;
                }
            }
        } else if (i7 == org.telegram.messenger.qs.O && i10 == this.L) {
            r();
        }
    }

    public final LinearLayout e(int i7, boolean z9) {
        int i10;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i11 = i7;
        ArrayList arrayList2 = this.f41590a0;
        LinearLayout linearLayout = null;
        if (arrayList2.size() == 1 && (i11 < 0 || i11 >= arrayList2.size())) {
            return null;
        }
        int i12 = 0;
        if (i11 == -1) {
            i11 = arrayList2.size() - 1;
        } else if (i11 == arrayList2.size()) {
            i11 = 0;
        }
        org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList2.get(i11);
        TLRPC.Message message = ijVar.f23244k;
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (org.telegram.messenger.ij.B0(message) == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i13);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    if (cg.c.c(keyboardInlineButtonRow.buttons.get(i14), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i10++;
                    }
                }
            }
        } else {
            i10 = 0;
        }
        int i15 = ijVar.I1;
        if (i10 > 0 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size3 = arrayList4.size();
            LinearLayout linearLayout2 = null;
            int i16 = 0;
            while (i16 < size3) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList4.get(i16);
                int size4 = keyboardInlineButtonRow2.buttons.size();
                int i17 = i12;
                while (i17 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i17);
                    if (cg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(i12);
                            arrayList = arrayList4;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, linearLayout2, null);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new bs0(0));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28031n6, null);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(true));
                        linearLayout2.addView(textView, c8.ha.l(100.0f / i10, -1, -1));
                        textView.setOnClickListener(new ai.v(i15, ijVar));
                    } else {
                        arrayList = arrayList4;
                    }
                    i17++;
                    arrayList4 = arrayList;
                    i12 = 0;
                }
                i16++;
                i12 = 0;
            }
            linearLayout = linearLayout2;
        }
        if (linearLayout != null) {
            int L = org.telegram.messenger.g0.f22544q.x - org.telegram.messenger.g0.L(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z9) {
                int i18 = this.S;
                if (i11 == i18) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i11 == i18 - 1) {
                    linearLayout.setTranslationX(-L);
                } else if (i11 == i18 + 1) {
                    linearLayout.setTranslationX(L);
                }
            }
            this.E.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.f41590a0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.S != 0 || this.f41591b.h0() || this.X) && this.Q != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i7);
                if (ijVar.I1 == this.Q.I1 && org.telegram.messenger.ij.B0(ijVar.f23244k) == org.telegram.messenger.ij.B0(this.Q.f23244k) && ijVar.f1() == this.Q.f1()) {
                    this.S = i7;
                    if (this.X) {
                        if (i7 == arrayList.size() - 1) {
                            l(3);
                        } else if (this.S == 1) {
                            l(4);
                        }
                    }
                    this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
                }
            }
        }
        this.S = 0;
        this.Q = (org.telegram.messenger.ij) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
    }

    public final android.view.ViewGroup g(int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PopupNotificationActivity.g(int, boolean):android.view.ViewGroup");
    }

    public final void h(Intent intent) {
        boolean z9;
        int i7;
        if (intent != null && intent.getBooleanExtra("force", false)) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.Z = z9;
        this.f41590a0.clear();
        if (this.Z) {
            if (intent != null) {
                i7 = intent.getIntExtra("currentAccount", org.telegram.messenger.p10.f24467s0);
            } else {
                i7 = org.telegram.messenger.p10.f24467s0;
            }
            if (!org.telegram.messenger.p10.r(i7)) {
                return;
            }
            this.f41590a0.addAll(org.telegram.messenger.dt.t(i7).f22083x);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                if (org.telegram.messenger.p10.i(i10).p()) {
                    this.f41590a0.addAll(org.telegram.messenger.dt.t(i10).f22082w);
                }
            }
        }
        if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() && org.telegram.messenger.t0.f25570w) {
            getWindow().addFlags(2623488);
            getWindow().clearFlags(2);
        } else {
            getWindow().addFlags(2623490);
        }
        if (this.Q == null) {
            this.S = 0;
        }
        f();
    }

    public final void i() {
        if (!this.O) {
            this.O = true;
            if (this.Z) {
                this.f41590a0.clear();
            }
            for (int i7 = 0; i7 < 4; i7++) {
                org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.I2);
                org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f25054r);
                org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f24983e2);
                org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f24989f2);
                org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.O);
            }
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f24979d4);
            org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009i4);
            ChatActivityEnterView chatActivityEnterView = this.f41591b;
            if (chatActivityEnterView != null) {
                chatActivityEnterView.B0();
            }
            if (this.T.isHeld()) {
                this.T.release();
            }
        }
    }

    public final boolean j(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PopupNotificationActivity.j(android.view.MotionEvent):boolean");
    }

    public final void k() {
        if (this.Q == null) {
            return;
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f25563b, LaunchActivity.class);
        long B0 = org.telegram.messenger.ij.B0(this.Q.f23244k);
        if (org.telegram.messenger.m5.C(B0)) {
            intent.putExtra("encId", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            intent.putExtra("userId", B0);
        } else if (org.telegram.messenger.m5.z(B0)) {
            intent.putExtra("chatId", -B0);
        }
        intent.putExtra("currentAccount", this.Q.I1);
        intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i7) {
        org.telegram.messenger.ij ijVar;
        int L = org.telegram.messenger.g0.f22544q.x - org.telegram.messenger.g0.L(24.0f);
        if (i7 == 0) {
            n(this.f41596r);
            n(this.f41597s);
            n(this.f41598w);
            m(this.f41599x);
            m(this.f41600y);
            m(this.D);
            int i10 = this.S - 1;
            while (true) {
                int i11 = this.S;
                if (i10 >= i11 + 2) {
                    break;
                }
                if (i10 == i11 - 1) {
                    this.f41597s = g(i10, true);
                    this.f41600y = e(i10, true);
                } else if (i10 == i11) {
                    this.f41596r = g(i10, true);
                    this.f41599x = e(i10, true);
                } else if (i10 == i11 + 1) {
                    this.f41598w = g(i10, true);
                    this.D = e(i10, true);
                }
                i10++;
            }
        } else if (i7 == 1) {
            n(this.f41598w);
            m(this.D);
            this.f41598w = this.f41596r;
            this.f41596r = this.f41597s;
            this.f41597s = g(this.S - 1, true);
            this.D = this.f41599x;
            this.f41599x = this.f41600y;
            this.f41600y = e(this.S - 1, true);
        } else if (i7 == 2) {
            n(this.f41597s);
            m(this.f41600y);
            this.f41597s = this.f41596r;
            this.f41596r = this.f41598w;
            this.f41598w = g(this.S + 1, true);
            this.f41600y = this.f41599x;
            this.f41599x = this.D;
            this.D = e(this.S + 1, true);
        } else if (i7 == 3) {
            ViewGroup viewGroup = this.f41598w;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.f41598w);
                ViewGroup g10 = g(this.S + 1, false);
                this.f41598w = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g10.getLayoutParams();
                    layoutParams.width = L;
                    this.f41598w.setLayoutParams(layoutParams);
                    this.f41598w.setTranslationX(translationX);
                    this.f41598w.invalidate();
                }
            }
            LinearLayout linearLayout = this.D;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.D);
                LinearLayout e10 = e(this.S + 1, false);
                this.D = e10;
                if (e10 != null) {
                    e10.setTranslationX(translationX2);
                }
            }
        } else if (i7 == 4) {
            ViewGroup viewGroup2 = this.f41597s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.f41597s);
                ViewGroup g11 = g(0, false);
                this.f41597s = g11;
                if (g11 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g11.getLayoutParams();
                    layoutParams2.width = L;
                    this.f41597s.setLayoutParams(layoutParams2);
                    this.f41597s.setTranslationX(translationX3);
                    this.f41597s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.f41600y;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.f41600y);
                LinearLayout e11 = e(0, false);
                this.f41600y = e11;
                if (e11 != null) {
                    e11.setTranslationX(translationX4);
                }
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = (this.S - 1) + i12;
            ArrayList arrayList = this.f41590a0;
            if (arrayList.size() == 1 && (i13 < 0 || i13 >= arrayList.size())) {
                ijVar = null;
            } else {
                if (i13 == -1) {
                    i13 = arrayList.size() - 1;
                } else if (i13 == arrayList.size()) {
                    i13 = 0;
                }
                ijVar = (org.telegram.messenger.ij) arrayList.get(i13);
            }
            this.R[i12] = ijVar;
        }
    }

    public final void m(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.E.removeView(linearLayout);
    }

    public final void n(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int intValue = ((Integer) viewGroup.getTag()).intValue();
            viewGroup.setVisibility(8);
            if (intValue == 1) {
                this.F.add(viewGroup);
            } else if (intValue == 2) {
                this.G.add(viewGroup);
            } else if (intValue == 3) {
                this.H.add(viewGroup);
            }
        }
    }

    public final void o(boolean z9) {
        if (this.f41589a != null) {
            int i7 = 0;
            org.telegram.ui.Components.ou0[] ou0VarArr = this.J;
            if (z9) {
                try {
                    Integer E1 = org.telegram.messenger.qp.s1(this.Q.I1).E1(org.telegram.messenger.ij.B0(this.Q.f23244k), 0L);
                    this.f41593e.setCompoundDrawablesWithIntrinsicBounds(ou0VarArr[E1.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                    this.f41593e.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                    while (i7 < ou0VarArr.length) {
                        if (i7 == E1.intValue()) {
                            ou0VarArr[i7].d();
                        } else {
                            ou0VarArr[i7].e();
                        }
                        i7++;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            this.f41593e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f41593e.setCompoundDrawablePadding(0);
            while (i7 < ou0VarArr.length) {
                ou0VarArr[i7].e();
                i7++;
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f41591b.s0()) {
            this.f41591b.k0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.x3(getWindow());
        d();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.k6.T(this);
        org.telegram.ui.ActionBar.k6.K(this, false);
        Typeface typeface = org.telegram.messenger.g0.f22516a;
        for (int i7 = 0; i7 < 4; i7++) {
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.I2);
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f25054r);
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f24983e2);
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f24989f2);
            org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.O);
        }
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f24979d4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009i4);
        this.K = ConnectionsManager.generateClassGuid();
        this.J[0] = new org.telegram.ui.Components.v31(false);
        this.J[1] = new org.telegram.ui.Components.ap(false);
        this.J[2] = new org.telegram.ui.Components.dn0(false);
        this.J[3] = new org.telegram.ui.Components.ie0(null, false);
        this.J[4] = new org.telegram.ui.Components.dk0(false);
        v8 v8Var = new v8(8, this, this);
        setContentView(v8Var);
        v8Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        v8Var.addView(relativeLayout, c8.ha.c(-1.0f, -1));
        ds0 ds0Var = new ds0(this, this);
        this.E = ds0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27849d6, ds0Var, null);
        float f10 = -1;
        relativeLayout.addView(this.E, c8.ha.v(12, f10, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.f41591b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.B0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, v8Var, null, false, null);
        this.f41591b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.E.addView(this.f41591b, c8.ha.v(0, f10, 0, -2, 12));
        this.f41591b.setDelegate(new es0(this));
        k0 k0Var = new k0(20, this, this);
        this.f41595n = k0Var;
        this.E.addView(k0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.f41589a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f41589a.setBackButtonImage(2131231269);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f28129s8, this.f41589a, null);
        org.telegram.ui.ActionBar.r6.m(this.f41589a, 3, org.telegram.ui.ActionBar.k6.f28147t8, null);
        org.telegram.ui.ActionBar.r6.m(this.f41589a, 1, org.telegram.ui.ActionBar.k6.f28186v8, null);
        this.E.addView(this.f41589a);
        ViewGroup.LayoutParams layoutParams = this.f41589a.getLayoutParams();
        layoutParams.width = -1;
        this.f41589a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.r0 g10 = this.f41589a.q().g(2, 0, org.telegram.messenger.g0.L(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i10 = org.telegram.ui.ActionBar.k6.B8;
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g10.addView(this.h, c8.ha.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f41594f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.f41589a.addView(this.f41594f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f41594f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(48.0f);
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(60.0f);
        layoutParams2.gravity = 51;
        this.f41594f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(this);
        this.f41592c = l9Var;
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.f41594f.addView(this.f41592c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f41592c.getLayoutParams();
        layoutParams3.width = org.telegram.messenger.g0.L(42.0f);
        layoutParams3.height = org.telegram.messenger.g0.L(42.0f);
        layoutParams3.topMargin = org.telegram.messenger.g0.L(3.0f);
        this.f41592c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.A8, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(org.telegram.messenger.g0.o());
        this.f41594f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = org.telegram.messenger.g0.L(54.0f);
        layoutParams4.bottomMargin = org.telegram.messenger.g0.L(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.f41593e = textView4;
        org.telegram.ui.ActionBar.r6.V(textView4, i10, null);
        this.f41593e.setTextSize(1, 14.0f);
        this.f41593e.setLines(1);
        this.f41593e.setMaxLines(1);
        this.f41593e.setSingleLine(true);
        this.f41593e.setEllipsize(truncateAt);
        this.f41593e.setGravity(3);
        this.f41594f.addView(this.f41593e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f41593e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = org.telegram.messenger.g0.L(54.0f);
        layoutParams5.bottomMargin = org.telegram.messenger.g0.L(4.0f);
        layoutParams5.gravity = 80;
        this.f41593e.setLayoutParams(layoutParams5);
        this.f41589a.setActionBarMenuOnItemClick(new ux(this, 26));
        PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.f25563b.getSystemService("power")).newWakeLock(268435462, "screen");
        this.T = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController B = MediaController.B();
        if (B.K0 == this.f41591b) {
            B.K0 = null;
        }
        if (this.T.isHeld()) {
            this.T.release();
        }
        org.telegram.ui.Components.l9 l9Var = this.f41592c;
        if (l9Var != null) {
            l9Var.setImageDrawable(null);
        }
    }

    @Override
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        h(intent);
    }

    @Override
    public final void onPause() {
        super.onPause();
        overridePendingTransition(0, 0);
        ChatActivityEnterView chatActivityEnterView = this.f41591b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.k0(false);
            this.f41591b.setFieldFocused(false);
        }
        int i7 = this.L;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i7).setAppPaused(true, false);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (i7 == 3 && iArr[0] != 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String M0 = org.telegram.messenger.hd.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = M0;
            u1Var.T = org.telegram.messenger.hd.M0(2131747310, null);
            alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747299, null), new li0(this, 6));
            alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController B = MediaController.B();
        ChatActivityEnterView chatActivityEnterView = this.f41591b;
        B.K0 = chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.T.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.f41590a0;
        if (arrayList.size() > 1) {
            if (this.S < arrayList.size() - 1) {
                this.S++;
            } else {
                this.S = 0;
            }
            this.Q = (org.telegram.messenger.ij) arrayList.get(this.S);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i7) {
        if (this.f41589a == null) {
            return;
        }
        int i10 = this.L;
        if (i10 != this.Q.I1) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(i10).setAppPaused(true, false);
            }
            int i11 = this.Q.I1;
            this.L = i11;
            ConnectionsManager.getInstance(i11).setAppPaused(false, false);
        }
        this.N = null;
        this.M = null;
        long B0 = org.telegram.messenger.ij.B0(this.Q.f23244k);
        this.f41591b.a1(this.Q.I1, B0);
        if (org.telegram.messenger.m5.C(B0)) {
            this.M = org.telegram.messenger.qp.s1(this.Q.I1).a2(Long.valueOf(org.telegram.messenger.qp.s1(this.Q.I1).a1(Integer.valueOf((int) (4294967295L & B0))).user_id));
        } else if (org.telegram.messenger.m5.E(B0)) {
            this.M = org.telegram.messenger.qp.s1(this.Q.I1).a2(Long.valueOf(B0));
        } else if (org.telegram.messenger.m5.z(B0)) {
            this.N = org.telegram.messenger.qp.s1(this.Q.I1).M0(Long.valueOf(-B0));
            if (this.Q.q3()) {
                this.M = org.telegram.messenger.qp.s1(this.Q.I1).a2(Long.valueOf(this.Q.f23244k.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.N;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.M;
            if (user != null) {
                this.f41593e.setText(org.telegram.messenger.t10.p(user));
            } else {
                this.f41593e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.M;
            if (user2 != null) {
                this.d.setText(org.telegram.messenger.t10.p(user2));
                if (org.telegram.messenger.m5.C(B0)) {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(2131231311, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                } else {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(0);
                }
            }
        }
        l(i7);
        r();
        b();
        a(0);
    }

    public final void r() {
        org.telegram.messenger.ij ijVar;
        TLRPC.User user;
        if (this.f41589a != null && (ijVar = this.Q) != null && this.N == null && (user = this.M) != null) {
            long j3 = user.f27102id / 1000;
            if (j3 != 777 && j3 != 333 && org.telegram.messenger.g5.r(ijVar.I1).f22591f0.get(Long.valueOf(this.M.f27102id)) == null && (org.telegram.messenger.g5.r(this.Q.I1).f22591f0.size() != 0 || !org.telegram.messenger.g5.r(this.Q.I1).y())) {
                String str = this.M.phone;
                if (str != null && str.length() != 0) {
                    TextView textView = this.d;
                    pf.b c10 = pf.b.c();
                    textView.setText(c10.b("+" + this.M.phone));
                } else {
                    this.d.setText(org.telegram.messenger.t10.p(this.M));
                }
            } else {
                this.d.setText(org.telegram.messenger.t10.p(this.M));
            }
            TLRPC.User user2 = this.M;
            if (user2 != null && user2.f27102id == 489000) {
                this.f41593e.setText(org.telegram.messenger.hd.M0(2131743617, null));
            } else if (user2 != null && user2.f27102id == 777000) {
                this.f41593e.setText(org.telegram.messenger.hd.M0(2131745562, null));
            } else {
                CharSequence D1 = org.telegram.messenger.qp.s1(this.Q.I1).D1(org.telegram.messenger.ij.B0(this.Q.f23244k), 0L, false);
                if (D1 != null && D1.length() != 0) {
                    this.P = D1;
                    this.f41593e.setText(D1);
                    o(true);
                    return;
                }
                this.P = null;
                o(false);
                TLRPC.User a22 = org.telegram.messenger.qp.s1(this.Q.I1).a2(Long.valueOf(this.M.f27102id));
                if (a22 != null) {
                    this.M = a22;
                }
                this.f41593e.setText(org.telegram.messenger.hd.d0(this.Q.I1, this.M, null, null));
            }
        }
    }
}

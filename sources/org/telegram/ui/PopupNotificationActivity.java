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
public class PopupNotificationActivity extends Activity implements org.telegram.messenger.cs {
    public static final int f41618c0 = 0;
    public LinearLayout E;
    public tr0 F;
    public int L;
    public TLRPC.User N;
    public TLRPC.Chat O;
    public CharSequence Q;
    public org.telegram.ui.ActionBar.k f41619a;
    public boolean f41620a0;
    public ChatActivityEnterView f41621b;
    public org.telegram.ui.Components.k9 f41623c;
    public TextView d;
    public TextView f41624e;
    public FrameLayout f41625f;
    public TextView h;
    public l0 f41626n;
    public ViewGroup f41627r;
    public ViewGroup f41628s;
    public ViewGroup f41629w;
    public LinearLayout f41630x;
    public LinearLayout f41631y;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public VelocityTracker J = null;
    public final org.telegram.ui.Components.nu0[] K = new org.telegram.ui.Components.nu0[5];
    public int M = -1;
    public boolean P = false;
    public org.telegram.messenger.zi R = null;
    public final org.telegram.messenger.zi[] S = new org.telegram.messenger.zi[3];
    public int T = 0;
    public PowerManager.WakeLock U = null;
    public boolean V = false;
    public long W = 0;
    public float X = -1.0f;
    public boolean Y = false;
    public Runnable Z = null;
    public final ArrayList f41622b0 = new ArrayList();

    public final void a(int i3) {
        int L = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(24.0f);
        ViewGroup viewGroup = this.f41628s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != L) {
                layoutParams.width = L;
                this.f41628s.setLayoutParams(layoutParams);
            }
            this.f41628s.setTranslationX((-L) + i3);
        }
        LinearLayout linearLayout = this.f41631y;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-L) + i3);
        }
        ViewGroup viewGroup2 = this.f41627r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != L) {
                layoutParams2.width = L;
                this.f41627r.setLayoutParams(layoutParams2);
            }
            this.f41627r.setTranslationX(i3);
        }
        LinearLayout linearLayout2 = this.f41630x;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i3);
        }
        ViewGroup viewGroup3 = this.f41629w;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != L) {
                layoutParams3.width = L;
                this.f41629w.setLayoutParams(layoutParams3);
            }
            this.f41629w.setTranslationX(L + i3);
        }
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(L + i3);
        }
        this.f41626n.invalidate();
    }

    public final void b() {
        TLRPC.User a22;
        org.telegram.messenger.zi ziVar = this.R;
        if (ziVar != null) {
            int i3 = ziVar.I1;
            if (this.O != null) {
                TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(this.O.f27001id));
                if (M0 != null) {
                    this.O = M0;
                    if (this.f41623c != null) {
                        this.f41623c.e(M0, new org.telegram.ui.Components.u8(this.O));
                    }
                }
            } else if (this.N != null && (a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(this.N.f27150id))) != null) {
                this.N = a22;
                if (this.f41623c != null) {
                    this.f41623c.e(a22, new org.telegram.ui.Components.u8(0, this.N));
                }
            }
        }
    }

    public final boolean c() {
        if (this.V && this.W < System.currentTimeMillis() - 400) {
            this.V = false;
            Runnable runnable = this.Z;
            if (runnable != null) {
                runnable.run();
                this.Z = null;
            }
        }
        return this.V;
    }

    public final void d() {
        FrameLayout frameLayout = this.f41625f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new vr0(this, 0));
        }
        l0 l0Var = this.f41626n;
        if (l0Var != null) {
            l0Var.getViewTreeObserver().addOnPreDrawListener(new vr0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.te0 te0Var;
        org.telegram.messenger.zi messageObject;
        org.telegram.ui.Components.te0 te0Var2;
        org.telegram.messenger.zi messageObject2;
        org.telegram.messenger.zi ziVar;
        if (i3 == org.telegram.messenger.hs.I2) {
            if (i10 == this.M) {
                i();
                finish();
                return;
            }
            return;
        }
        int i11 = 0;
        if (i3 == org.telegram.messenger.hs.f23217d4) {
            if (!this.f41620a0) {
                ArrayList arrayList = this.f41622b0;
                arrayList.clear();
                for (int i12 = 0; i12 < 4; i12++) {
                    if (org.telegram.messenger.h10.i(i12).p()) {
                        arrayList.addAll(org.telegram.messenger.us.t(i12).f25773w);
                    }
                }
                f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < 3; i13++) {
                        int i14 = (this.T - 1) + i13;
                        if (arrayList.size() == 1 && (i14 < 0 || i14 >= arrayList.size())) {
                            ziVar = null;
                        } else {
                            if (i14 == -1) {
                                i14 = arrayList.size() - 1;
                            } else if (i14 == arrayList.size()) {
                                i14 = 0;
                            }
                            ziVar = (org.telegram.messenger.zi) arrayList.get(i14);
                        }
                        if (this.S[i13] != ziVar) {
                            q(0);
                        }
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23292r) {
            if (this.R != null && i10 == this.M) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i15 = org.telegram.messenger.hp.C8;
                if ((intValue & 1) != 0 || (intValue & 4) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0) {
                    r();
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0) {
                    b();
                }
                if ((intValue & 64) != 0) {
                    CharSequence D1 = org.telegram.messenger.hp.s1(this.R.I1).D1(org.telegram.messenger.zi.B0(this.R.f26868k), 0L, false);
                    CharSequence charSequence = this.Q;
                    if ((charSequence != null && D1 == null) || ((charSequence == null && D1 != null) || (charSequence != null && !charSequence.equals(D1)))) {
                        r();
                    }
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23227f2) {
            Integer num = (Integer) objArr[0];
            l0 l0Var = this.f41626n;
            if (l0Var != null) {
                int childCount = l0Var.getChildCount();
                while (i11 < childCount) {
                    View childAt = this.f41626n.getChildAt(i11);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (te0Var2 = (org.telegram.ui.Components.te0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.I1 == i10 && messageObject2.f1() == num.intValue()) {
                        te0Var2.v();
                        return;
                    }
                    i11++;
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23221e2) {
            Integer num2 = (Integer) objArr[0];
            l0 l0Var2 = this.f41626n;
            if (l0Var2 != null) {
                int childCount2 = l0Var2.getChildCount();
                while (i11 < childCount2) {
                    View childAt2 = this.f41626n.getChildAt(i11);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (te0Var = (org.telegram.ui.Components.te0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.I1 == i10 && messageObject.f1() == num2.intValue()) {
                        te0Var.w();
                        return;
                    }
                    i11++;
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23246i4) {
            l0 l0Var3 = this.f41626n;
            if (l0Var3 != null) {
                int childCount3 = l0Var3.getChildCount();
                while (i11 < childCount3) {
                    View childAt3 = this.f41626n.getChildAt(i11);
                    if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                        textView.invalidate();
                    }
                    i11++;
                }
            }
        } else if (i3 == org.telegram.messenger.hs.O && i10 == this.M) {
            r();
        }
    }

    public final LinearLayout e(int i3, boolean z10) {
        int i10;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i11 = i3;
        ArrayList arrayList2 = this.f41622b0;
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
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList2.get(i11);
        TLRPC.Message message = ziVar.f26868k;
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (org.telegram.messenger.zi.B0(message) == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i13);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    if (dg.c.c(keyboardInlineButtonRow.buttons.get(i14), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i10++;
                    }
                }
            }
        } else {
            i10 = 0;
        }
        int i15 = ziVar.I1;
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
                    if (dg.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(i12);
                            arrayList = arrayList4;
                            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, linearLayout2, null);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new rr0(0));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28062n6, null);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.N0(true));
                        linearLayout2.addView(textView, b8.mf.l(100.0f / i10, -1, -1));
                        textView.setOnClickListener(new bi.q(i15, ziVar));
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
            int L = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z10) {
                int i18 = this.T;
                if (i11 == i18) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i11 == i18 - 1) {
                    linearLayout.setTranslationX(-L);
                } else if (i11 == i18 + 1) {
                    linearLayout.setTranslationX(L);
                }
            }
            this.F.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.f41622b0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.T != 0 || this.f41621b.h0() || this.Y) && this.R != null) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
                if (ziVar.I1 == this.R.I1 && org.telegram.messenger.zi.B0(ziVar.f26868k) == org.telegram.messenger.zi.B0(this.R.f26868k) && ziVar.f1() == this.R.f1()) {
                    this.T = i3;
                    if (this.Y) {
                        if (i3 == arrayList.size() - 1) {
                            l(3);
                        } else if (this.T == 1) {
                            l(4);
                        }
                    }
                    this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
                }
            }
        }
        this.T = 0;
        this.R = (org.telegram.messenger.zi) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
    }

    public final android.view.ViewGroup g(int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PopupNotificationActivity.g(int, boolean):android.view.ViewGroup");
    }

    public final void h(Intent intent) {
        boolean z10;
        int i3;
        if (intent != null && intent.getBooleanExtra("force", false)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41620a0 = z10;
        this.f41622b0.clear();
        if (this.f41620a0) {
            if (intent != null) {
                i3 = intent.getIntExtra("currentAccount", org.telegram.messenger.h10.f22829t0);
            } else {
                i3 = org.telegram.messenger.h10.f22829t0;
            }
            if (!org.telegram.messenger.h10.r(i3)) {
                return;
            }
            this.f41622b0.addAll(org.telegram.messenger.us.t(i3).f25774x);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                if (org.telegram.messenger.h10.i(i10).p()) {
                    this.f41622b0.addAll(org.telegram.messenger.us.t(i10).f25773w);
                }
            }
        }
        if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() && org.telegram.messenger.t0.f25464w) {
            getWindow().addFlags(2623488);
            getWindow().clearFlags(2);
        } else {
            getWindow().addFlags(2623490);
        }
        if (this.R == null) {
            this.T = 0;
        }
        f();
    }

    public final void i() {
        if (!this.P) {
            this.P = true;
            if (this.f41620a0) {
                this.f41622b0.clear();
            }
            for (int i3 = 0; i3 < 4; i3++) {
                org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.I2);
                org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23292r);
                org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23221e2);
                org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23227f2);
                org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.O);
            }
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23217d4);
            org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
            ChatActivityEnterView chatActivityEnterView = this.f41621b;
            if (chatActivityEnterView != null) {
                chatActivityEnterView.A0();
            }
            if (this.U.isHeld()) {
                this.U.release();
            }
        }
    }

    public final boolean j(android.view.MotionEvent r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PopupNotificationActivity.j(android.view.MotionEvent):boolean");
    }

    public final void k() {
        if (this.R == null) {
            return;
        }
        Intent intent = new Intent(org.telegram.messenger.t0.f25457b, LaunchActivity.class);
        long B0 = org.telegram.messenger.zi.B0(this.R.f26868k);
        if (org.telegram.messenger.m5.C(B0)) {
            intent.putExtra("encId", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.m5.E(B0)) {
            intent.putExtra("userId", B0);
        } else if (org.telegram.messenger.m5.z(B0)) {
            intent.putExtra("chatId", -B0);
        }
        intent.putExtra("currentAccount", this.R.I1);
        intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i3) {
        org.telegram.messenger.zi ziVar;
        int L = org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(24.0f);
        if (i3 == 0) {
            n(this.f41627r);
            n(this.f41628s);
            n(this.f41629w);
            m(this.f41630x);
            m(this.f41631y);
            m(this.E);
            int i10 = this.T - 1;
            while (true) {
                int i11 = this.T;
                if (i10 >= i11 + 2) {
                    break;
                }
                if (i10 == i11 - 1) {
                    this.f41628s = g(i10, true);
                    this.f41631y = e(i10, true);
                } else if (i10 == i11) {
                    this.f41627r = g(i10, true);
                    this.f41630x = e(i10, true);
                } else if (i10 == i11 + 1) {
                    this.f41629w = g(i10, true);
                    this.E = e(i10, true);
                }
                i10++;
            }
        } else if (i3 == 1) {
            n(this.f41629w);
            m(this.E);
            this.f41629w = this.f41627r;
            this.f41627r = this.f41628s;
            this.f41628s = g(this.T - 1, true);
            this.E = this.f41630x;
            this.f41630x = this.f41631y;
            this.f41631y = e(this.T - 1, true);
        } else if (i3 == 2) {
            n(this.f41628s);
            m(this.f41631y);
            this.f41628s = this.f41627r;
            this.f41627r = this.f41629w;
            this.f41629w = g(this.T + 1, true);
            this.f41631y = this.f41630x;
            this.f41630x = this.E;
            this.E = e(this.T + 1, true);
        } else if (i3 == 3) {
            ViewGroup viewGroup = this.f41629w;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.f41629w);
                ViewGroup g7 = g(this.T + 1, false);
                this.f41629w = g7;
                if (g7 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g7.getLayoutParams();
                    layoutParams.width = L;
                    this.f41629w.setLayoutParams(layoutParams);
                    this.f41629w.setTranslationX(translationX);
                    this.f41629w.invalidate();
                }
            }
            LinearLayout linearLayout = this.E;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.E);
                LinearLayout e10 = e(this.T + 1, false);
                this.E = e10;
                if (e10 != null) {
                    e10.setTranslationX(translationX2);
                }
            }
        } else if (i3 == 4) {
            ViewGroup viewGroup2 = this.f41628s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.f41628s);
                ViewGroup g10 = g(0, false);
                this.f41628s = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g10.getLayoutParams();
                    layoutParams2.width = L;
                    this.f41628s.setLayoutParams(layoutParams2);
                    this.f41628s.setTranslationX(translationX3);
                    this.f41628s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.f41631y;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.f41631y);
                LinearLayout e11 = e(0, false);
                this.f41631y = e11;
                if (e11 != null) {
                    e11.setTranslationX(translationX4);
                }
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = (this.T - 1) + i12;
            ArrayList arrayList = this.f41622b0;
            if (arrayList.size() == 1 && (i13 < 0 || i13 >= arrayList.size())) {
                ziVar = null;
            } else {
                if (i13 == -1) {
                    i13 = arrayList.size() - 1;
                } else if (i13 == arrayList.size()) {
                    i13 = 0;
                }
                ziVar = (org.telegram.messenger.zi) arrayList.get(i13);
            }
            this.S[i12] = ziVar;
        }
    }

    public final void m(LinearLayout linearLayout) {
        if (linearLayout == null) {
            return;
        }
        this.F.removeView(linearLayout);
    }

    public final void n(ViewGroup viewGroup) {
        if (viewGroup != null) {
            int intValue = ((Integer) viewGroup.getTag()).intValue();
            viewGroup.setVisibility(8);
            if (intValue == 1) {
                this.G.add(viewGroup);
            } else if (intValue == 2) {
                this.H.add(viewGroup);
            } else if (intValue == 3) {
                this.I.add(viewGroup);
            }
        }
    }

    public final void o(boolean z10) {
        if (this.f41619a != null) {
            int i3 = 0;
            org.telegram.ui.Components.nu0[] nu0VarArr = this.K;
            if (z10) {
                try {
                    Integer E1 = org.telegram.messenger.hp.s1(this.R.I1).E1(org.telegram.messenger.zi.B0(this.R.f26868k), 0L);
                    this.f41624e.setCompoundDrawablesWithIntrinsicBounds(nu0VarArr[E1.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                    this.f41624e.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                    while (i3 < nu0VarArr.length) {
                        if (i3 == E1.intValue()) {
                            nu0VarArr[i3].d();
                        } else {
                            nu0VarArr[i3].e();
                        }
                        i3++;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            this.f41624e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f41624e.setCompoundDrawablePadding(0);
            while (i3 < nu0VarArr.length) {
                nu0VarArr[i3].e();
                i3++;
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f41621b.r0()) {
            this.f41621b.j0(true);
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
        Typeface typeface = org.telegram.messenger.g0.f22580a;
        for (int i3 = 0; i3 < 4; i3++) {
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.I2);
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23292r);
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23221e2);
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23227f2);
            org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.O);
        }
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23217d4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        this.L = ConnectionsManager.generateClassGuid();
        this.K[0] = new org.telegram.ui.Components.p31(false);
        this.K[1] = new org.telegram.ui.Components.ap(false);
        this.K[2] = new org.telegram.ui.Components.gn0(false);
        this.K[3] = new org.telegram.ui.Components.ke0(null, false);
        this.K[4] = new org.telegram.ui.Components.hk0(false);
        ai.h5 h5Var = new ai.h5(9, this, this);
        setContentView(h5Var);
        h5Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        h5Var.addView(relativeLayout, b8.mf.c(-1.0f, -1));
        tr0 tr0Var = new tr0(this, this);
        this.F = tr0Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, tr0Var, null);
        float f10 = -1;
        relativeLayout.addView(this.F, b8.mf.v(12, f10, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.f41621b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.A0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, h5Var, null, false, null);
        this.f41621b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.F.addView(this.f41621b, b8.mf.v(0, f10, 0, -2, 12));
        this.f41621b.setDelegate(new ur0(this));
        l0 l0Var = new l0(20, this, this);
        this.f41626n = l0Var;
        this.F.addView(l0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.f41619a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f41619a.setBackButtonImage(2131231269);
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f28160s8, this.f41619a, null);
        org.telegram.ui.ActionBar.r6.m(this.f41619a, 3, org.telegram.ui.ActionBar.k6.f28179t8, null);
        org.telegram.ui.ActionBar.r6.m(this.f41619a, 1, org.telegram.ui.ActionBar.k6.f28216v8, null);
        this.F.addView(this.f41619a);
        ViewGroup.LayoutParams layoutParams = this.f41619a.getLayoutParams();
        layoutParams.width = -1;
        this.f41619a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.q0 g7 = this.f41619a.q().g(2, 0, org.telegram.messenger.g0.L(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i10 = org.telegram.ui.ActionBar.k6.B8;
        org.telegram.ui.ActionBar.r6.V(textView, i10, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g7.addView(this.h, b8.mf.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f41625f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.f41619a.addView(this.f41625f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f41625f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(48.0f);
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(60.0f);
        layoutParams2.gravity = 51;
        this.f41625f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(this);
        this.f41623c = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.f41625f.addView(this.f41623c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f41623c.getLayoutParams();
        layoutParams3.width = org.telegram.messenger.g0.L(42.0f);
        layoutParams3.height = org.telegram.messenger.g0.L(42.0f);
        layoutParams3.topMargin = org.telegram.messenger.g0.L(3.0f);
        this.f41623c.setLayoutParams(layoutParams3);
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
        this.f41625f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = org.telegram.messenger.g0.L(54.0f);
        layoutParams4.bottomMargin = org.telegram.messenger.g0.L(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.f41624e = textView4;
        org.telegram.ui.ActionBar.r6.V(textView4, i10, null);
        this.f41624e.setTextSize(1, 14.0f);
        this.f41624e.setLines(1);
        this.f41624e.setMaxLines(1);
        this.f41624e.setSingleLine(true);
        this.f41624e.setEllipsize(truncateAt);
        this.f41624e.setGravity(3);
        this.f41625f.addView(this.f41624e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f41624e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = org.telegram.messenger.g0.L(54.0f);
        layoutParams5.bottomMargin = org.telegram.messenger.g0.L(4.0f);
        layoutParams5.gravity = 80;
        this.f41624e.setLayoutParams(layoutParams5);
        this.f41619a.setActionBarMenuOnItemClick(new hx(this, 27));
        PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.f25457b.getSystemService("power")).newWakeLock(268435462, "screen");
        this.U = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController B = MediaController.B();
        if (B.L0 == this.f41621b) {
            B.L0 = null;
        }
        if (this.U.isHeld()) {
            this.U.release();
        }
        org.telegram.ui.Components.k9 k9Var = this.f41623c;
        if (k9Var != null) {
            k9Var.setImageDrawable(null);
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
        ChatActivityEnterView chatActivityEnterView = this.f41621b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.j0(false);
            this.f41621b.setFieldFocused(false);
        }
        int i3 = this.M;
        if (i3 >= 0) {
            ConnectionsManager.getInstance(i3).setAppPaused(true, false);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i3, strArr, iArr);
        if (i3 == 3 && iArr[0] != 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String M0 = org.telegram.messenger.bd.M0(2131689472, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131747319, null);
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747308, null), new ci0(this, 7));
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController B = MediaController.B();
        ChatActivityEnterView chatActivityEnterView = this.f41621b;
        B.L0 = chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.U.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.f41622b0;
        if (arrayList.size() > 1) {
            if (this.T < arrayList.size() - 1) {
                this.T++;
            } else {
                this.T = 0;
            }
            this.R = (org.telegram.messenger.zi) arrayList.get(this.T);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i3) {
        if (this.f41619a == null) {
            return;
        }
        int i10 = this.M;
        if (i10 != this.R.I1) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(i10).setAppPaused(true, false);
            }
            int i11 = this.R.I1;
            this.M = i11;
            ConnectionsManager.getInstance(i11).setAppPaused(false, false);
        }
        this.O = null;
        this.N = null;
        long B0 = org.telegram.messenger.zi.B0(this.R.f26868k);
        this.f41621b.a1(this.R.I1, B0);
        if (org.telegram.messenger.m5.C(B0)) {
            this.N = org.telegram.messenger.hp.s1(this.R.I1).a2(Long.valueOf(org.telegram.messenger.hp.s1(this.R.I1).a1(Integer.valueOf((int) (4294967295L & B0))).user_id));
        } else if (org.telegram.messenger.m5.E(B0)) {
            this.N = org.telegram.messenger.hp.s1(this.R.I1).a2(Long.valueOf(B0));
        } else if (org.telegram.messenger.m5.z(B0)) {
            this.O = org.telegram.messenger.hp.s1(this.R.I1).M0(Long.valueOf(-B0));
            if (this.R.q3()) {
                this.N = org.telegram.messenger.hp.s1(this.R.I1).a2(Long.valueOf(this.R.f26868k.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.O;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.N;
            if (user != null) {
                this.f41624e.setText(org.telegram.messenger.l10.p(user));
            } else {
                this.f41624e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.N;
            if (user2 != null) {
                this.d.setText(org.telegram.messenger.l10.p(user2));
                if (org.telegram.messenger.m5.C(B0)) {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(2131231311, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                } else {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(0);
                }
            }
        }
        l(i3);
        r();
        b();
        a(0);
    }

    public final void r() {
        org.telegram.messenger.zi ziVar;
        TLRPC.User user;
        if (this.f41619a != null && (ziVar = this.R) != null && this.O == null && (user = this.N) != null) {
            long j10 = user.f27150id / 1000;
            if (j10 != 777 && j10 != 333 && org.telegram.messenger.g5.r(ziVar.I1).f22654g0.get(Long.valueOf(this.N.f27150id)) == null && (org.telegram.messenger.g5.r(this.R.I1).f22654g0.size() != 0 || !org.telegram.messenger.g5.r(this.R.I1).y())) {
                String str = this.N.phone;
                if (str != null && str.length() != 0) {
                    TextView textView = this.d;
                    mf.b c2 = mf.b.c();
                    textView.setText(c2.b("+" + this.N.phone));
                } else {
                    this.d.setText(org.telegram.messenger.l10.p(this.N));
                }
            } else {
                this.d.setText(org.telegram.messenger.l10.p(this.N));
            }
            TLRPC.User user2 = this.N;
            if (user2 != null && user2.f27150id == 489000) {
                this.f41624e.setText(org.telegram.messenger.bd.M0(2131743626, null));
            } else if (user2 != null && user2.f27150id == 777000) {
                this.f41624e.setText(org.telegram.messenger.bd.M0(2131745571, null));
            } else {
                CharSequence D1 = org.telegram.messenger.hp.s1(this.R.I1).D1(org.telegram.messenger.zi.B0(this.R.f26868k), 0L, false);
                if (D1 != null && D1.length() != 0) {
                    this.Q = D1;
                    this.f41624e.setText(D1);
                    o(true);
                    return;
                }
                this.Q = null;
                o(false);
                TLRPC.User a22 = org.telegram.messenger.hp.s1(this.R.I1).a2(Long.valueOf(this.N.f27150id));
                if (a22 != null) {
                    this.N = a22;
                }
                this.f41624e.setText(org.telegram.messenger.bd.d0(this.R.I1, this.N, null, null));
            }
        }
    }
}

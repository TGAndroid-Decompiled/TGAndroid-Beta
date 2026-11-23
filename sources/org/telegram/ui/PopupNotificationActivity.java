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
public class PopupNotificationActivity extends Activity implements org.telegram.messenger.gs {
    public static final int f43451c0 = 0;
    public LinearLayout E;
    public ds0 F;
    public int L;
    public TLRPC.User N;
    public TLRPC.Chat O;
    public CharSequence Q;
    public org.telegram.ui.ActionBar.k f43452a;
    public boolean f43453a0;
    public ChatActivityEnterView f43454b;
    public org.telegram.ui.Components.q9 f43456c;
    public TextView d;
    public TextView f43457e;
    public FrameLayout f43458f;
    public TextView h;
    public k0 f43459n;
    public ViewGroup f43460r;
    public ViewGroup f43461s;
    public ViewGroup f43462w;
    public LinearLayout f43463x;
    public LinearLayout f43464y;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public VelocityTracker J = null;
    public final org.telegram.ui.Components.bv0[] K = new org.telegram.ui.Components.bv0[5];
    public int M = -1;
    public boolean P = false;
    public org.telegram.messenger.gj R = null;
    public final org.telegram.messenger.gj[] S = new org.telegram.messenger.gj[3];
    public int T = 0;
    public PowerManager.WakeLock U = null;
    public boolean V = false;
    public long W = 0;
    public float X = -1.0f;
    public boolean Y = false;
    public Runnable Z = null;
    public final ArrayList f43455b0 = new ArrayList();

    public final void a(int i7) {
        int L = org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(24.0f);
        ViewGroup viewGroup = this.f43461s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != L) {
                layoutParams.width = L;
                this.f43461s.setLayoutParams(layoutParams);
            }
            this.f43461s.setTranslationX((-L) + i7);
        }
        LinearLayout linearLayout = this.f43464y;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-L) + i7);
        }
        ViewGroup viewGroup2 = this.f43460r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != L) {
                layoutParams2.width = L;
                this.f43460r.setLayoutParams(layoutParams2);
            }
            this.f43460r.setTranslationX(i7);
        }
        LinearLayout linearLayout2 = this.f43463x;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i7);
        }
        ViewGroup viewGroup3 = this.f43462w;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != L) {
                layoutParams3.width = L;
                this.f43462w.setLayoutParams(layoutParams3);
            }
            this.f43462w.setTranslationX(L + i7);
        }
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(L + i7);
        }
        this.f43459n.invalidate();
    }

    public final void b() {
        TLRPC.User c22;
        org.telegram.messenger.gj gjVar = this.R;
        if (gjVar != null) {
            int i7 = gjVar.K1;
            if (this.O != null) {
                TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(this.O.f28434id));
                if (O0 != null) {
                    this.O = O0;
                    if (this.f43456c != null) {
                        this.f43456c.f(O0, new org.telegram.ui.Components.b9(this.O));
                    }
                }
            } else if (this.N != null && (c22 = org.telegram.messenger.np.u1(i7).c2(Long.valueOf(this.N.f28583id))) != null) {
                this.N = c22;
                if (this.f43456c != null) {
                    this.f43456c.f(c22, new org.telegram.ui.Components.b9(0, this.N));
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
        FrameLayout frameLayout = this.f43458f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new fs0(this, 0));
        }
        k0 k0Var = this.f43459n;
        if (k0Var != null) {
            k0Var.getViewTreeObserver().addOnPreDrawListener(new fs0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.gf0 gf0Var;
        org.telegram.messenger.gj messageObject;
        org.telegram.ui.Components.gf0 gf0Var2;
        org.telegram.messenger.gj messageObject2;
        org.telegram.messenger.gj gjVar;
        if (i7 == org.telegram.messenger.ls.I2) {
            if (i10 == this.M) {
                i();
                finish();
                return;
            }
            return;
        }
        int i11 = 0;
        if (i7 == org.telegram.messenger.ls.f25314g4) {
            if (!this.f43453a0) {
                ArrayList arrayList = this.f43455b0;
                arrayList.clear();
                for (int i12 = 0; i12 < 4; i12++) {
                    if (org.telegram.messenger.k10.i(i12).p()) {
                        arrayList.addAll(org.telegram.messenger.ys.t(i12).f28194w);
                    }
                }
                f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < 3; i13++) {
                        int i14 = (this.T - 1) + i13;
                        if (arrayList.size() == 1 && (i14 < 0 || i14 >= arrayList.size())) {
                            gjVar = null;
                        } else {
                            if (i14 == -1) {
                                i14 = arrayList.size() - 1;
                            } else if (i14 == arrayList.size()) {
                                i14 = 0;
                            }
                            gjVar = (org.telegram.messenger.gj) arrayList.get(i14);
                        }
                        if (this.S[i13] != gjVar) {
                            q(0);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25371r) {
            if (this.R != null && i10 == this.M) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i15 = org.telegram.messenger.np.I8;
                if ((intValue & 1) != 0 || (intValue & 4) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0) {
                    r();
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0) {
                    b();
                }
                if ((intValue & 64) != 0) {
                    CharSequence F1 = org.telegram.messenger.np.u1(this.R.K1).F1(org.telegram.messenger.gj.B0(this.R.f24213k), 0L, false);
                    CharSequence charSequence = this.Q;
                    if ((charSequence != null && F1 == null) || ((charSequence == null && F1 != null) || (charSequence != null && !charSequence.equals(F1)))) {
                        r();
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25306f2) {
            Integer num = (Integer) objArr[0];
            k0 k0Var = this.f43459n;
            if (k0Var != null) {
                int childCount = k0Var.getChildCount();
                while (i11 < childCount) {
                    View childAt = this.f43459n.getChildAt(i11);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (gf0Var2 = (org.telegram.ui.Components.gf0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.K1 == i10 && messageObject2.e1() == num.intValue()) {
                        gf0Var2.v();
                        return;
                    }
                    i11++;
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25300e2) {
            Integer num2 = (Integer) objArr[0];
            k0 k0Var2 = this.f43459n;
            if (k0Var2 != null) {
                int childCount2 = k0Var2.getChildCount();
                while (i11 < childCount2) {
                    View childAt2 = this.f43459n.getChildAt(i11);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (gf0Var = (org.telegram.ui.Components.gf0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.K1 == i10 && messageObject.e1() == num2.intValue()) {
                        gf0Var.w();
                        return;
                    }
                    i11++;
                }
            }
        } else if (i7 == org.telegram.messenger.ls.f25342l4) {
            k0 k0Var3 = this.f43459n;
            if (k0Var3 != null) {
                int childCount3 = k0Var3.getChildCount();
                while (i11 < childCount3) {
                    View childAt3 = this.f43459n.getChildAt(i11);
                    if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                        textView.invalidate();
                    }
                    i11++;
                }
            }
        } else if (i7 == org.telegram.messenger.ls.O && i10 == this.M) {
            r();
        }
    }

    public final LinearLayout e(int i7, boolean z10) {
        int i10;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i11 = i7;
        ArrayList arrayList2 = this.f43455b0;
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
        org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList2.get(i11);
        TLRPC.Message message = gjVar.f24213k;
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (org.telegram.messenger.gj.B0(message) == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
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
        int i15 = gjVar.K1;
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
                            org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, linearLayout2, null);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new ok0(1));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.f29563n6, null);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.m6.N0(true));
                        linearLayout2.addView(textView, c8.ma.l(100.0f / i10, -1, -1));
                        textView.setOnClickListener(new vm0(i15, gjVar));
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
            int L = org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(24.0f);
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
        ArrayList arrayList = this.f43455b0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.T != 0 || this.f43454b.I0() || this.Y) && this.R != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) arrayList.get(i7);
                if (gjVar.K1 == this.R.K1 && org.telegram.messenger.gj.B0(gjVar.f24213k) == org.telegram.messenger.gj.B0(this.R.f24213k) && gjVar.e1() == this.R.e1()) {
                    this.T = i7;
                    if (this.Y) {
                        if (i7 == arrayList.size() - 1) {
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
        this.R = (org.telegram.messenger.gj) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
    }

    public final android.view.ViewGroup g(int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PopupNotificationActivity.g(int, boolean):android.view.ViewGroup");
    }

    public final void h(Intent intent) {
        boolean z10;
        int i7;
        if (intent != null && intent.getBooleanExtra("force", false)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43453a0 = z10;
        this.f43455b0.clear();
        if (this.f43453a0) {
            if (intent != null) {
                i7 = intent.getIntExtra("currentAccount", org.telegram.messenger.k10.f24968t0);
            } else {
                i7 = org.telegram.messenger.k10.f24968t0;
            }
            if (!org.telegram.messenger.k10.r(i7)) {
                return;
            }
            this.f43455b0.addAll(org.telegram.messenger.ys.t(i7).f28195x);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                if (org.telegram.messenger.k10.i(i10).p()) {
                    this.f43455b0.addAll(org.telegram.messenger.ys.t(i10).f28194w);
                }
            }
        }
        if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() && org.telegram.messenger.t0.f26938w) {
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
            if (this.f43453a0) {
                this.f43455b0.clear();
            }
            for (int i7 = 0; i7 < 4; i7++) {
                org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.I2);
                org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25371r);
                org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25300e2);
                org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.f25306f2);
                org.telegram.messenger.ls.f(i7).n(this, org.telegram.messenger.ls.O);
            }
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25314g4);
            org.telegram.messenger.ls.e().n(this, org.telegram.messenger.ls.f25342l4);
            ChatActivityEnterView chatActivityEnterView = this.f43454b;
            if (chatActivityEnterView != null) {
                chatActivityEnterView.c1();
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
        Intent intent = new Intent(org.telegram.messenger.t0.f26931b, LaunchActivity.class);
        long B0 = org.telegram.messenger.gj.B0(this.R.f24213k);
        if (org.telegram.messenger.n5.C(B0)) {
            intent.putExtra("encId", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.n5.E(B0)) {
            intent.putExtra("userId", B0);
        } else if (org.telegram.messenger.n5.z(B0)) {
            intent.putExtra("chatId", -B0);
        }
        intent.putExtra("currentAccount", this.R.K1);
        intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i7) {
        org.telegram.messenger.gj gjVar;
        int L = org.telegram.messenger.g0.f24046q.x - org.telegram.messenger.g0.L(24.0f);
        if (i7 == 0) {
            n(this.f43460r);
            n(this.f43461s);
            n(this.f43462w);
            m(this.f43463x);
            m(this.f43464y);
            m(this.E);
            int i10 = this.T - 1;
            while (true) {
                int i11 = this.T;
                if (i10 >= i11 + 2) {
                    break;
                }
                if (i10 == i11 - 1) {
                    this.f43461s = g(i10, true);
                    this.f43464y = e(i10, true);
                } else if (i10 == i11) {
                    this.f43460r = g(i10, true);
                    this.f43463x = e(i10, true);
                } else if (i10 == i11 + 1) {
                    this.f43462w = g(i10, true);
                    this.E = e(i10, true);
                }
                i10++;
            }
        } else if (i7 == 1) {
            n(this.f43462w);
            m(this.E);
            this.f43462w = this.f43460r;
            this.f43460r = this.f43461s;
            this.f43461s = g(this.T - 1, true);
            this.E = this.f43463x;
            this.f43463x = this.f43464y;
            this.f43464y = e(this.T - 1, true);
        } else if (i7 == 2) {
            n(this.f43461s);
            m(this.f43464y);
            this.f43461s = this.f43460r;
            this.f43460r = this.f43462w;
            this.f43462w = g(this.T + 1, true);
            this.f43464y = this.f43463x;
            this.f43463x = this.E;
            this.E = e(this.T + 1, true);
        } else if (i7 == 3) {
            ViewGroup viewGroup = this.f43462w;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.f43462w);
                ViewGroup g10 = g(this.T + 1, false);
                this.f43462w = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g10.getLayoutParams();
                    layoutParams.width = L;
                    this.f43462w.setLayoutParams(layoutParams);
                    this.f43462w.setTranslationX(translationX);
                    this.f43462w.invalidate();
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
        } else if (i7 == 4) {
            ViewGroup viewGroup2 = this.f43461s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.f43461s);
                ViewGroup g11 = g(0, false);
                this.f43461s = g11;
                if (g11 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g11.getLayoutParams();
                    layoutParams2.width = L;
                    this.f43461s.setLayoutParams(layoutParams2);
                    this.f43461s.setTranslationX(translationX3);
                    this.f43461s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.f43464y;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.f43464y);
                LinearLayout e11 = e(0, false);
                this.f43464y = e11;
                if (e11 != null) {
                    e11.setTranslationX(translationX4);
                }
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = (this.T - 1) + i12;
            ArrayList arrayList = this.f43455b0;
            if (arrayList.size() == 1 && (i13 < 0 || i13 >= arrayList.size())) {
                gjVar = null;
            } else {
                if (i13 == -1) {
                    i13 = arrayList.size() - 1;
                } else if (i13 == arrayList.size()) {
                    i13 = 0;
                }
                gjVar = (org.telegram.messenger.gj) arrayList.get(i13);
            }
            this.S[i12] = gjVar;
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
        if (this.f43452a != null) {
            int i7 = 0;
            org.telegram.ui.Components.bv0[] bv0VarArr = this.K;
            if (z10) {
                try {
                    Integer G1 = org.telegram.messenger.np.u1(this.R.K1).G1(org.telegram.messenger.gj.B0(this.R.f24213k), 0L);
                    this.f43457e.setCompoundDrawablesWithIntrinsicBounds(bv0VarArr[G1.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                    this.f43457e.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                    while (i7 < bv0VarArr.length) {
                        if (i7 == G1.intValue()) {
                            bv0VarArr[i7].d();
                        } else {
                            bv0VarArr[i7].e();
                        }
                        i7++;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            this.f43457e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f43457e.setCompoundDrawablePadding(0);
            while (i7 < bv0VarArr.length) {
                bv0VarArr[i7].e();
                i7++;
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f43454b.S0()) {
            this.f43454b.K0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.g0.v(this, configuration);
        org.telegram.messenger.g0.v3(getWindow());
        d();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.m6.T(this);
        org.telegram.ui.ActionBar.m6.K(this, false);
        Typeface typeface = org.telegram.messenger.g0.f24018a;
        for (int i7 = 0; i7 < 4; i7++) {
            org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.I2);
            org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.f25371r);
            org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.f25300e2);
            org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.f25306f2);
            org.telegram.messenger.ls.f(i7).c(this, org.telegram.messenger.ls.O);
        }
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25314g4);
        org.telegram.messenger.ls.e().c(this, org.telegram.messenger.ls.f25342l4);
        this.L = ConnectionsManager.generateClassGuid();
        this.K[0] = new org.telegram.ui.Components.m41(false);
        this.K[1] = new org.telegram.ui.Components.sp(false);
        this.K[2] = new org.telegram.ui.Components.sn0(false);
        this.K[3] = new org.telegram.ui.Components.xe0(null, false);
        this.K[4] = new org.telegram.ui.Components.sk0(false);
        w8 w8Var = new w8(8, this, this);
        setContentView(w8Var);
        w8Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        w8Var.addView(relativeLayout, c8.ma.c(-1.0f, -1));
        ds0 ds0Var = new ds0(this, this);
        this.F = ds0Var;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29381d6, ds0Var, null);
        float f10 = -1;
        relativeLayout.addView(this.F, c8.ma.v(12, f10, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.f43454b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.c1();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, w8Var, null, false, null);
        this.f43454b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.F.addView(this.f43454b, c8.ma.v(0, f10, 0, -2, 12));
        this.f43454b.setDelegate(new es0(this));
        k0 k0Var = new k0(20, this, this);
        this.f43459n = k0Var;
        this.F.addView(k0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.f43452a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f43452a.setBackButtonImage(2131231269);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29661s8, this.f43452a, null);
        org.telegram.ui.ActionBar.t6.l(this.f43452a, 3, org.telegram.ui.ActionBar.m6.f29679t8, null);
        org.telegram.ui.ActionBar.t6.l(this.f43452a, 1, org.telegram.ui.ActionBar.m6.f29718v8, null);
        this.F.addView(this.f43452a);
        ViewGroup.LayoutParams layoutParams = this.f43452a.getLayoutParams();
        layoutParams.width = -1;
        this.f43452a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.q0 g10 = this.f43452a.s().g(2, 0, org.telegram.messenger.g0.L(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i10 = org.telegram.ui.ActionBar.m6.B8;
        org.telegram.ui.ActionBar.t6.U(textView, i10, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g10.addView(this.h, c8.ma.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f43458f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.f43452a.addView(this.f43458f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f43458f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(48.0f);
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(60.0f);
        layoutParams2.gravity = 51;
        this.f43458f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(this);
        this.f43456c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.f43458f.addView(this.f43456c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f43456c.getLayoutParams();
        layoutParams3.width = org.telegram.messenger.g0.L(42.0f);
        layoutParams3.height = org.telegram.messenger.g0.L(42.0f);
        layoutParams3.topMargin = org.telegram.messenger.g0.L(3.0f);
        this.f43456c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.A8, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(org.telegram.messenger.g0.o());
        this.f43458f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = org.telegram.messenger.g0.L(54.0f);
        layoutParams4.bottomMargin = org.telegram.messenger.g0.L(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.f43457e = textView4;
        org.telegram.ui.ActionBar.t6.U(textView4, i10, null);
        this.f43457e.setTextSize(1, 14.0f);
        this.f43457e.setLines(1);
        this.f43457e.setMaxLines(1);
        this.f43457e.setSingleLine(true);
        this.f43457e.setEllipsize(truncateAt);
        this.f43457e.setGravity(3);
        this.f43458f.addView(this.f43457e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f43457e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = org.telegram.messenger.g0.L(54.0f);
        layoutParams5.bottomMargin = org.telegram.messenger.g0.L(4.0f);
        layoutParams5.gravity = 80;
        this.f43457e.setLayoutParams(layoutParams5);
        this.f43452a.setActionBarMenuOnItemClick(new dv(this, 29));
        PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.f26931b.getSystemService("power")).newWakeLock(268435462, "screen");
        this.U = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController B = MediaController.B();
        if (B.L0 == this.f43454b) {
            B.L0 = null;
        }
        if (this.U.isHeld()) {
            this.U.release();
        }
        org.telegram.ui.Components.q9 q9Var = this.f43456c;
        if (q9Var != null) {
            q9Var.setImageDrawable(null);
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
        ChatActivityEnterView chatActivityEnterView = this.f43454b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.K0(false);
            this.f43454b.setFieldFocused(false);
        }
        int i7 = this.M;
        if (i7 >= 0) {
            ConnectionsManager.getInstance(i7).setAppPaused(true, false);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i7, strArr, iArr);
        if (i7 == 3 && iArr[0] != 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String N0 = org.telegram.messenger.hd.N0(2131689472, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
            t1Var.S = N0;
            t1Var.U = org.telegram.messenger.hd.N0(2131747117, null);
            alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131747106, null), new qi0(this, 6));
            alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131747637, null), null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController B = MediaController.B();
        ChatActivityEnterView chatActivityEnterView = this.f43454b;
        B.L0 = chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.U.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.f43455b0;
        if (arrayList.size() > 1) {
            if (this.T < arrayList.size() - 1) {
                this.T++;
            } else {
                this.T = 0;
            }
            this.R = (org.telegram.messenger.gj) arrayList.get(this.T);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i7) {
        if (this.f43452a == null) {
            return;
        }
        int i10 = this.M;
        if (i10 != this.R.K1) {
            if (i10 >= 0) {
                ConnectionsManager.getInstance(i10).setAppPaused(true, false);
            }
            int i11 = this.R.K1;
            this.M = i11;
            ConnectionsManager.getInstance(i11).setAppPaused(false, false);
        }
        this.O = null;
        this.N = null;
        long B0 = org.telegram.messenger.gj.B0(this.R.f24213k);
        this.f43454b.D1(this.R.K1, B0);
        if (org.telegram.messenger.n5.C(B0)) {
            this.N = org.telegram.messenger.np.u1(this.R.K1).c2(Long.valueOf(org.telegram.messenger.np.u1(this.R.K1).c1(Integer.valueOf((int) (4294967295L & B0))).user_id));
        } else if (org.telegram.messenger.n5.E(B0)) {
            this.N = org.telegram.messenger.np.u1(this.R.K1).c2(Long.valueOf(B0));
        } else if (org.telegram.messenger.n5.z(B0)) {
            this.O = org.telegram.messenger.np.u1(this.R.K1).O0(Long.valueOf(-B0));
            if (this.R.p3()) {
                this.N = org.telegram.messenger.np.u1(this.R.K1).c2(Long.valueOf(this.R.f24213k.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.O;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.N;
            if (user != null) {
                this.f43457e.setText(org.telegram.messenger.p10.q(user));
            } else {
                this.f43457e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.N;
            if (user2 != null) {
                this.d.setText(org.telegram.messenger.p10.q(user2));
                if (org.telegram.messenger.n5.C(B0)) {
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
        org.telegram.messenger.gj gjVar;
        TLRPC.User user;
        if (this.f43452a != null && (gjVar = this.R) != null && this.O == null && (user = this.N) != null) {
            long j3 = user.f28583id / 1000;
            if (j3 != 777 && j3 != 333 && org.telegram.messenger.i5.r(gjVar.K1).f24606g0.get(Long.valueOf(this.N.f28583id)) == null && (org.telegram.messenger.i5.r(this.R.K1).f24606g0.size() != 0 || !org.telegram.messenger.i5.r(this.R.K1).y())) {
                String str = this.N.phone;
                if (str != null && str.length() != 0) {
                    TextView textView = this.d;
                    pf.b c10 = pf.b.c();
                    textView.setText(c10.b("+" + this.N.phone));
                } else {
                    this.d.setText(org.telegram.messenger.p10.q(this.N));
                }
            } else {
                this.d.setText(org.telegram.messenger.p10.q(this.N));
            }
            TLRPC.User user2 = this.N;
            if (user2 != null && user2.f28583id == 489000) {
                this.f43457e.setText(org.telegram.messenger.hd.N0(2131743371, null));
            } else if (user2 != null && user2.f28583id == 777000) {
                this.f43457e.setText(org.telegram.messenger.hd.N0(2131745365, null));
            } else {
                CharSequence F1 = org.telegram.messenger.np.u1(this.R.K1).F1(org.telegram.messenger.gj.B0(this.R.f24213k), 0L, false);
                if (F1 != null && F1.length() != 0) {
                    this.Q = F1;
                    this.f43457e.setText(F1);
                    o(true);
                    return;
                }
                this.Q = null;
                o(false);
                TLRPC.User c22 = org.telegram.messenger.np.u1(this.R.K1).c2(Long.valueOf(this.N.f28583id));
                if (c22 != null) {
                    this.N = c22;
                }
                this.f43457e.setText(org.telegram.messenger.hd.d0(this.R.K1, this.N, null, null));
            }
        }
    }
}

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
public class PopupNotificationActivity extends Activity implements org.telegram.messenger.fs {
    public static final int f43406c0 = 0;
    public LinearLayout E;
    public ds0 F;
    public int L;
    public TLRPC.User N;
    public TLRPC.Chat O;
    public CharSequence Q;
    public org.telegram.ui.ActionBar.k f43407a;
    public boolean f43408a0;
    public ChatActivityEnterView f43409b;
    public org.telegram.ui.Components.q9 f43411c;
    public TextView d;
    public TextView f43412e;
    public FrameLayout f43413f;
    public TextView h;
    public k0 f43414n;
    public ViewGroup f43415r;
    public ViewGroup f43416s;
    public ViewGroup f43417w;
    public LinearLayout f43418x;
    public LinearLayout f43419y;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public VelocityTracker J = null;
    public final org.telegram.ui.Components.yu0[] K = new org.telegram.ui.Components.yu0[5];
    public int M = -1;
    public boolean P = false;
    public org.telegram.messenger.fj R = null;
    public final org.telegram.messenger.fj[] S = new org.telegram.messenger.fj[3];
    public int T = 0;
    public PowerManager.WakeLock U = null;
    public boolean V = false;
    public long W = 0;
    public float X = -1.0f;
    public boolean Y = false;
    public Runnable Z = null;
    public final ArrayList f43410b0 = new ArrayList();

    public final void a(int i7) {
        int L = org.telegram.messenger.g0.f24121q.x - org.telegram.messenger.g0.L(24.0f);
        ViewGroup viewGroup = this.f43416s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != L) {
                layoutParams.width = L;
                this.f43416s.setLayoutParams(layoutParams);
            }
            this.f43416s.setTranslationX((-L) + i7);
        }
        LinearLayout linearLayout = this.f43419y;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-L) + i7);
        }
        ViewGroup viewGroup2 = this.f43415r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != L) {
                layoutParams2.width = L;
                this.f43415r.setLayoutParams(layoutParams2);
            }
            this.f43415r.setTranslationX(i7);
        }
        LinearLayout linearLayout2 = this.f43418x;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i7);
        }
        ViewGroup viewGroup3 = this.f43417w;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != L) {
                layoutParams3.width = L;
                this.f43417w.setLayoutParams(layoutParams3);
            }
            this.f43417w.setTranslationX(L + i7);
        }
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(L + i7);
        }
        this.f43414n.invalidate();
    }

    public final void b() {
        TLRPC.User c22;
        org.telegram.messenger.fj fjVar = this.R;
        if (fjVar != null) {
            int i7 = fjVar.K1;
            if (this.O != null) {
                TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(this.O.f28405id));
                if (O0 != null) {
                    this.O = O0;
                    if (this.f43411c != null) {
                        this.f43411c.f(O0, new org.telegram.ui.Components.b9(this.O));
                    }
                }
            } else if (this.N != null && (c22 = org.telegram.messenger.mp.u1(i7).c2(Long.valueOf(this.N.f28554id))) != null) {
                this.N = c22;
                if (this.f43411c != null) {
                    this.f43411c.f(c22, new org.telegram.ui.Components.b9(0, this.N));
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
        FrameLayout frameLayout = this.f43413f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new fs0(this, 0));
        }
        k0 k0Var = this.f43414n;
        if (k0Var != null) {
            k0Var.getViewTreeObserver().addOnPreDrawListener(new fs0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.ef0 ef0Var;
        org.telegram.messenger.fj messageObject;
        org.telegram.ui.Components.ef0 ef0Var2;
        org.telegram.messenger.fj messageObject2;
        org.telegram.messenger.fj fjVar;
        if (i7 == org.telegram.messenger.ks.I2) {
            if (i10 == this.M) {
                i();
                finish();
                return;
            }
            return;
        }
        int i11 = 0;
        if (i7 == org.telegram.messenger.ks.f25116f4) {
            if (!this.f43408a0) {
                ArrayList arrayList = this.f43410b0;
                arrayList.clear();
                for (int i12 = 0; i12 < 4; i12++) {
                    if (org.telegram.messenger.j10.i(i12).p()) {
                        arrayList.addAll(org.telegram.messenger.xs.t(i12).f27984w);
                    }
                }
                f();
                if (!arrayList.isEmpty()) {
                    for (int i13 = 0; i13 < 3; i13++) {
                        int i14 = (this.T - 1) + i13;
                        if (arrayList.size() == 1 && (i14 < 0 || i14 >= arrayList.size())) {
                            fjVar = null;
                        } else {
                            if (i14 == -1) {
                                i14 = arrayList.size() - 1;
                            } else if (i14 == arrayList.size()) {
                                i14 = 0;
                            }
                            fjVar = (org.telegram.messenger.fj) arrayList.get(i14);
                        }
                        if (this.S[i13] != fjVar) {
                            q(0);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25179r) {
            if (this.R != null && i10 == this.M) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i15 = org.telegram.messenger.mp.I8;
                if ((intValue & 1) != 0 || (intValue & 4) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0) {
                    r();
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0) {
                    b();
                }
                if ((intValue & 64) != 0) {
                    CharSequence F1 = org.telegram.messenger.mp.u1(this.R.K1).F1(org.telegram.messenger.fj.B0(this.R.f23968k), 0L, false);
                    CharSequence charSequence = this.Q;
                    if ((charSequence != null && F1 == null) || ((charSequence == null && F1 != null) || (charSequence != null && !charSequence.equals(F1)))) {
                        r();
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25114f2) {
            Integer num = (Integer) objArr[0];
            k0 k0Var = this.f43414n;
            if (k0Var != null) {
                int childCount = k0Var.getChildCount();
                while (i11 < childCount) {
                    View childAt = this.f43414n.getChildAt(i11);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (ef0Var2 = (org.telegram.ui.Components.ef0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.K1 == i10 && messageObject2.e1() == num.intValue()) {
                        ef0Var2.v();
                        return;
                    }
                    i11++;
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25108e2) {
            Integer num2 = (Integer) objArr[0];
            k0 k0Var2 = this.f43414n;
            if (k0Var2 != null) {
                int childCount2 = k0Var2.getChildCount();
                while (i11 < childCount2) {
                    View childAt2 = this.f43414n.getChildAt(i11);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (ef0Var = (org.telegram.ui.Components.ef0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.K1 == i10 && messageObject.e1() == num2.intValue()) {
                        ef0Var.w();
                        return;
                    }
                    i11++;
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25145k4) {
            k0 k0Var3 = this.f43414n;
            if (k0Var3 != null) {
                int childCount3 = k0Var3.getChildCount();
                while (i11 < childCount3) {
                    View childAt3 = this.f43414n.getChildAt(i11);
                    if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                        textView.invalidate();
                    }
                    i11++;
                }
            }
        } else if (i7 == org.telegram.messenger.ks.O && i10 == this.M) {
            r();
        }
    }

    public final LinearLayout e(int i7, boolean z10) {
        int i10;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i11 = i7;
        ArrayList arrayList2 = this.f43410b0;
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
        org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList2.get(i11);
        TLRPC.Message message = fjVar.f23968k;
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (org.telegram.messenger.fj.B0(message) == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
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
        int i15 = fjVar.K1;
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
                            org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, linearLayout2, null);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new ok0(1));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.f29578n6, null);
                        textView.setTypeface(org.telegram.messenger.g0.o());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.n6.N0(true));
                        linearLayout2.addView(textView, c8.ma.l(100.0f / i10, -1, -1));
                        textView.setOnClickListener(new vm0(i15, fjVar));
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
            int L = org.telegram.messenger.g0.f24121q.x - org.telegram.messenger.g0.L(24.0f);
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
        ArrayList arrayList = this.f43410b0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.T != 0 || this.f43409b.E0() || this.Y) && this.R != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i7);
                if (fjVar.K1 == this.R.K1 && org.telegram.messenger.fj.B0(fjVar.f23968k) == org.telegram.messenger.fj.B0(this.R.f23968k) && fjVar.e1() == this.R.e1()) {
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
        this.R = (org.telegram.messenger.fj) arrayList.get(0);
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
        this.f43408a0 = z10;
        this.f43410b0.clear();
        if (this.f43408a0) {
            if (intent != null) {
                i7 = intent.getIntExtra("currentAccount", org.telegram.messenger.j10.f24773t0);
            } else {
                i7 = org.telegram.messenger.j10.f24773t0;
            }
            if (!org.telegram.messenger.j10.r(i7)) {
                return;
            }
            this.f43410b0.addAll(org.telegram.messenger.xs.t(i7).f27985x);
        } else {
            for (int i10 = 0; i10 < 4; i10++) {
                if (org.telegram.messenger.j10.i(i10).p()) {
                    this.f43410b0.addAll(org.telegram.messenger.xs.t(i10).f27984w);
                }
            }
        }
        if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() && org.telegram.messenger.t0.f26922w) {
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
            if (this.f43408a0) {
                this.f43410b0.clear();
            }
            for (int i7 = 0; i7 < 4; i7++) {
                org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.I2);
                org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25179r);
                org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25108e2);
                org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.f25114f2);
                org.telegram.messenger.ks.f(i7).n(this, org.telegram.messenger.ks.O);
            }
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25116f4);
            org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25145k4);
            ChatActivityEnterView chatActivityEnterView = this.f43409b;
            if (chatActivityEnterView != null) {
                chatActivityEnterView.Y0();
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
        Intent intent = new Intent(org.telegram.messenger.t0.f26915b, LaunchActivity.class);
        long B0 = org.telegram.messenger.fj.B0(this.R.f23968k);
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
        org.telegram.messenger.fj fjVar;
        int L = org.telegram.messenger.g0.f24121q.x - org.telegram.messenger.g0.L(24.0f);
        if (i7 == 0) {
            n(this.f43415r);
            n(this.f43416s);
            n(this.f43417w);
            m(this.f43418x);
            m(this.f43419y);
            m(this.E);
            int i10 = this.T - 1;
            while (true) {
                int i11 = this.T;
                if (i10 >= i11 + 2) {
                    break;
                }
                if (i10 == i11 - 1) {
                    this.f43416s = g(i10, true);
                    this.f43419y = e(i10, true);
                } else if (i10 == i11) {
                    this.f43415r = g(i10, true);
                    this.f43418x = e(i10, true);
                } else if (i10 == i11 + 1) {
                    this.f43417w = g(i10, true);
                    this.E = e(i10, true);
                }
                i10++;
            }
        } else if (i7 == 1) {
            n(this.f43417w);
            m(this.E);
            this.f43417w = this.f43415r;
            this.f43415r = this.f43416s;
            this.f43416s = g(this.T - 1, true);
            this.E = this.f43418x;
            this.f43418x = this.f43419y;
            this.f43419y = e(this.T - 1, true);
        } else if (i7 == 2) {
            n(this.f43416s);
            m(this.f43419y);
            this.f43416s = this.f43415r;
            this.f43415r = this.f43417w;
            this.f43417w = g(this.T + 1, true);
            this.f43419y = this.f43418x;
            this.f43418x = this.E;
            this.E = e(this.T + 1, true);
        } else if (i7 == 3) {
            ViewGroup viewGroup = this.f43417w;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.f43417w);
                ViewGroup g10 = g(this.T + 1, false);
                this.f43417w = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g10.getLayoutParams();
                    layoutParams.width = L;
                    this.f43417w.setLayoutParams(layoutParams);
                    this.f43417w.setTranslationX(translationX);
                    this.f43417w.invalidate();
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
            ViewGroup viewGroup2 = this.f43416s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.f43416s);
                ViewGroup g11 = g(0, false);
                this.f43416s = g11;
                if (g11 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g11.getLayoutParams();
                    layoutParams2.width = L;
                    this.f43416s.setLayoutParams(layoutParams2);
                    this.f43416s.setTranslationX(translationX3);
                    this.f43416s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.f43419y;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.f43419y);
                LinearLayout e11 = e(0, false);
                this.f43419y = e11;
                if (e11 != null) {
                    e11.setTranslationX(translationX4);
                }
            }
        }
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = (this.T - 1) + i12;
            ArrayList arrayList = this.f43410b0;
            if (arrayList.size() == 1 && (i13 < 0 || i13 >= arrayList.size())) {
                fjVar = null;
            } else {
                if (i13 == -1) {
                    i13 = arrayList.size() - 1;
                } else if (i13 == arrayList.size()) {
                    i13 = 0;
                }
                fjVar = (org.telegram.messenger.fj) arrayList.get(i13);
            }
            this.S[i12] = fjVar;
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
        if (this.f43407a != null) {
            int i7 = 0;
            org.telegram.ui.Components.yu0[] yu0VarArr = this.K;
            if (z10) {
                try {
                    Integer G1 = org.telegram.messenger.mp.u1(this.R.K1).G1(org.telegram.messenger.fj.B0(this.R.f23968k), 0L);
                    this.f43412e.setCompoundDrawablesWithIntrinsicBounds(yu0VarArr[G1.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                    this.f43412e.setCompoundDrawablePadding(org.telegram.messenger.g0.L(4.0f));
                    while (i7 < yu0VarArr.length) {
                        if (i7 == G1.intValue()) {
                            yu0VarArr[i7].d();
                        } else {
                            yu0VarArr[i7].e();
                        }
                        i7++;
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            }
            this.f43412e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.f43412e.setCompoundDrawablePadding(0);
            while (i7 < yu0VarArr.length) {
                yu0VarArr[i7].e();
                i7++;
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f43409b.O0()) {
            this.f43409b.G0(true);
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
        org.telegram.ui.ActionBar.n6.T(this);
        org.telegram.ui.ActionBar.n6.K(this, false);
        Typeface typeface = org.telegram.messenger.g0.f24093a;
        for (int i7 = 0; i7 < 4; i7++) {
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.I2);
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25179r);
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25108e2);
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.f25114f2);
            org.telegram.messenger.ks.f(i7).c(this, org.telegram.messenger.ks.O);
        }
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25116f4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25145k4);
        this.L = ConnectionsManager.generateClassGuid();
        this.K[0] = new org.telegram.ui.Components.j41(false);
        this.K[1] = new org.telegram.ui.Components.qp(false);
        this.K[2] = new org.telegram.ui.Components.qn0(false);
        this.K[3] = new org.telegram.ui.Components.ve0(null, false);
        this.K[4] = new org.telegram.ui.Components.qk0(false);
        v8 v8Var = new v8(8, this, this);
        setContentView(v8Var);
        v8Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        v8Var.addView(relativeLayout, c8.ma.c(-1.0f, -1));
        ds0 ds0Var = new ds0(this, this);
        this.F = ds0Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, ds0Var, null);
        float f10 = -1;
        relativeLayout.addView(this.F, c8.ma.v(12, f10, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.f43409b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.Y0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, v8Var, null, false, null);
        this.f43409b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.F.addView(this.f43409b, c8.ma.v(0, f10, 0, -2, 12));
        this.f43409b.setDelegate(new es0(this));
        k0 k0Var = new k0(20, this, this);
        this.f43414n = k0Var;
        this.F.addView(k0Var, 0);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(this, null);
        this.f43407a = kVar;
        kVar.setOccupyStatusBar(false);
        this.f43407a.setBackButtonImage(2131231269);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29676s8, this.f43407a, null);
        org.telegram.ui.ActionBar.u6.l(this.f43407a, 3, org.telegram.ui.ActionBar.n6.f29694t8, null);
        org.telegram.ui.ActionBar.u6.l(this.f43407a, 1, org.telegram.ui.ActionBar.n6.f29733v8, null);
        this.F.addView(this.f43407a);
        ViewGroup.LayoutParams layoutParams = this.f43407a.getLayoutParams();
        layoutParams.width = -1;
        this.f43407a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.r0 g10 = this.f43407a.t().g(2, 0, org.telegram.messenger.g0.L(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i10 = org.telegram.ui.ActionBar.n6.B8;
        org.telegram.ui.ActionBar.u6.U(textView, i10, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g10.addView(this.h, c8.ma.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f43413f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
        this.f43407a.addView(this.f43413f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f43413f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = org.telegram.messenger.g0.L(48.0f);
        layoutParams2.leftMargin = org.telegram.messenger.g0.L(60.0f);
        layoutParams2.gravity = 51;
        this.f43413f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(this);
        this.f43411c = q9Var;
        q9Var.setRoundRadius(org.telegram.messenger.g0.L(21.0f));
        this.f43413f.addView(this.f43411c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f43411c.getLayoutParams();
        layoutParams3.width = org.telegram.messenger.g0.L(42.0f);
        layoutParams3.height = org.telegram.messenger.g0.L(42.0f);
        layoutParams3.topMargin = org.telegram.messenger.g0.L(3.0f);
        this.f43411c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.A8, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(org.telegram.messenger.g0.o());
        this.f43413f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = org.telegram.messenger.g0.L(54.0f);
        layoutParams4.bottomMargin = org.telegram.messenger.g0.L(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.f43412e = textView4;
        org.telegram.ui.ActionBar.u6.U(textView4, i10, null);
        this.f43412e.setTextSize(1, 14.0f);
        this.f43412e.setLines(1);
        this.f43412e.setMaxLines(1);
        this.f43412e.setSingleLine(true);
        this.f43412e.setEllipsize(truncateAt);
        this.f43412e.setGravity(3);
        this.f43413f.addView(this.f43412e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f43412e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = org.telegram.messenger.g0.L(54.0f);
        layoutParams5.bottomMargin = org.telegram.messenger.g0.L(4.0f);
        layoutParams5.gravity = 80;
        this.f43412e.setLayoutParams(layoutParams5);
        this.f43407a.setActionBarMenuOnItemClick(new dv(this, 29));
        PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.t0.f26915b.getSystemService("power")).newWakeLock(268435462, "screen");
        this.U = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController B = MediaController.B();
        if (B.L0 == this.f43409b) {
            B.L0 = null;
        }
        if (this.U.isHeld()) {
            this.U.release();
        }
        org.telegram.ui.Components.q9 q9Var = this.f43411c;
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
        ChatActivityEnterView chatActivityEnterView = this.f43409b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.G0(false);
            this.f43409b.setFieldFocused(false);
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
            String M0 = org.telegram.messenger.gd.M0(2131689472, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
            u1Var.S = M0;
            u1Var.U = org.telegram.messenger.gd.M0(2131747118, null);
            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131747107, null), new qi0(this, 6));
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController B = MediaController.B();
        ChatActivityEnterView chatActivityEnterView = this.f43409b;
        B.L0 = chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.U.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.f43410b0;
        if (arrayList.size() > 1) {
            if (this.T < arrayList.size() - 1) {
                this.T++;
            } else {
                this.T = 0;
            }
            this.R = (org.telegram.messenger.fj) arrayList.get(this.T);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i7) {
        if (this.f43407a == null) {
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
        long B0 = org.telegram.messenger.fj.B0(this.R.f23968k);
        this.f43409b.z1(this.R.K1, B0);
        if (org.telegram.messenger.n5.C(B0)) {
            this.N = org.telegram.messenger.mp.u1(this.R.K1).c2(Long.valueOf(org.telegram.messenger.mp.u1(this.R.K1).c1(Integer.valueOf((int) (4294967295L & B0))).user_id));
        } else if (org.telegram.messenger.n5.E(B0)) {
            this.N = org.telegram.messenger.mp.u1(this.R.K1).c2(Long.valueOf(B0));
        } else if (org.telegram.messenger.n5.z(B0)) {
            this.O = org.telegram.messenger.mp.u1(this.R.K1).O0(Long.valueOf(-B0));
            if (this.R.p3()) {
                this.N = org.telegram.messenger.mp.u1(this.R.K1).c2(Long.valueOf(this.R.f23968k.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.O;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.N;
            if (user != null) {
                this.f43412e.setText(org.telegram.messenger.o10.q(user));
            } else {
                this.f43412e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.N;
            if (user2 != null) {
                this.d.setText(org.telegram.messenger.o10.q(user2));
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
        org.telegram.messenger.fj fjVar;
        TLRPC.User user;
        if (this.f43407a != null && (fjVar = this.R) != null && this.O == null && (user = this.N) != null) {
            long j3 = user.f28554id / 1000;
            if (j3 != 777 && j3 != 333 && org.telegram.messenger.i5.r(fjVar.K1).f24571g0.get(Long.valueOf(this.N.f28554id)) == null && (org.telegram.messenger.i5.r(this.R.K1).f24571g0.size() != 0 || !org.telegram.messenger.i5.r(this.R.K1).y())) {
                String str = this.N.phone;
                if (str != null && str.length() != 0) {
                    TextView textView = this.d;
                    pf.b c10 = pf.b.c();
                    textView.setText(c10.b("+" + this.N.phone));
                } else {
                    this.d.setText(org.telegram.messenger.o10.q(this.N));
                }
            } else {
                this.d.setText(org.telegram.messenger.o10.q(this.N));
            }
            TLRPC.User user2 = this.N;
            if (user2 != null && user2.f28554id == 489000) {
                this.f43412e.setText(org.telegram.messenger.gd.M0(2131743379, null));
            } else if (user2 != null && user2.f28554id == 777000) {
                this.f43412e.setText(org.telegram.messenger.gd.M0(2131745366, null));
            } else {
                CharSequence F1 = org.telegram.messenger.mp.u1(this.R.K1).F1(org.telegram.messenger.fj.B0(this.R.f23968k), 0L, false);
                if (F1 != null && F1.length() != 0) {
                    this.Q = F1;
                    this.f43412e.setText(F1);
                    o(true);
                    return;
                }
                this.Q = null;
                o(false);
                TLRPC.User c22 = org.telegram.messenger.mp.u1(this.R.K1).c2(Long.valueOf(this.N.f28554id));
                if (c22 != null) {
                    this.N = c22;
                }
                this.f43412e.setText(org.telegram.messenger.gd.d0(this.R.K1, this.N, null, null));
            }
        }
    }
}

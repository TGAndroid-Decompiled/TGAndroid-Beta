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
public class PopupNotificationActivity extends Activity implements org.telegram.messenger.vs {
    public static final int f33684b0 = 0;
    public LinearLayout D;
    public mt0 E;
    public int K;
    public TLRPC.User M;
    public TLRPC.Chat N;
    public CharSequence P;
    public boolean Z;
    public org.telegram.ui.ActionBar.l f33685a;
    public ChatActivityEnterView f33687b;
    public org.telegram.ui.Components.g9 f33688c;
    public TextView d;
    public TextView e;
    public FrameLayout f33689f;
    public TextView h;
    public l0 f33690n;
    public ViewGroup f33691r;
    public ViewGroup f33692s;
    public ViewGroup f33693w;
    public LinearLayout f33694x;
    public LinearLayout f33695y;
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public VelocityTracker I = null;
    public final org.telegram.ui.Components.rv0[] J = new org.telegram.ui.Components.rv0[5];
    public int L = -1;
    public boolean O = false;
    public org.telegram.messenger.kj Q = null;
    public final org.telegram.messenger.kj[] R = new org.telegram.messenger.kj[3];
    public int S = 0;
    public PowerManager.WakeLock T = null;
    public boolean U = false;
    public long V = 0;
    public float W = -1.0f;
    public boolean X = false;
    public Runnable Y = null;
    public final ArrayList f33686a0 = new ArrayList();

    public final void a(int i10) {
        int L = org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(24.0f);
        ViewGroup viewGroup = this.f33692s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != L) {
                layoutParams.width = L;
                this.f33692s.setLayoutParams(layoutParams);
            }
            this.f33692s.setTranslationX((-L) + i10);
        }
        LinearLayout linearLayout = this.f33695y;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-L) + i10);
        }
        ViewGroup viewGroup2 = this.f33691r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != L) {
                layoutParams2.width = L;
                this.f33691r.setLayoutParams(layoutParams2);
            }
            this.f33691r.setTranslationX(i10);
        }
        LinearLayout linearLayout2 = this.f33694x;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i10);
        }
        ViewGroup viewGroup3 = this.f33693w;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != L) {
                layoutParams3.width = L;
                this.f33693w.setLayoutParams(layoutParams3);
            }
            this.f33693w.setTranslationX(L + i10);
        }
        LinearLayout linearLayout3 = this.D;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(L + i10);
        }
        this.f33690n.invalidate();
    }

    public final void b() {
        TLRPC.User Z1;
        org.telegram.messenger.kj kjVar = this.Q;
        if (kjVar != null) {
            int i10 = kjVar.I1;
            if (this.N != null) {
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i10).L0(Long.valueOf(this.N.f19794id));
                if (L0 != null) {
                    this.N = L0;
                    if (this.f33688c != null) {
                        this.f33688c.e(L0, new org.telegram.ui.Components.r8(this.N));
                    }
                }
            } else if (this.M != null && (Z1 = org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(this.M.f19943id))) != null) {
                this.M = Z1;
                if (this.f33688c != null) {
                    this.f33688c.e(Z1, new org.telegram.ui.Components.r8(0, this.M));
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
        FrameLayout frameLayout = this.f33689f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new ot0(this, 0));
        }
        l0 l0Var = this.f33690n;
        if (l0Var != null) {
            l0Var.getViewTreeObserver().addOnPreDrawListener(new ot0(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        org.telegram.ui.Components.uf0 uf0Var;
        org.telegram.messenger.kj messageObject;
        org.telegram.ui.Components.uf0 uf0Var2;
        org.telegram.messenger.kj messageObject2;
        org.telegram.messenger.kj kjVar;
        if (i10 == org.telegram.messenger.at.I2) {
            if (i11 == this.L) {
                i();
                finish();
                return;
            }
            return;
        }
        int i12 = 0;
        if (i10 == org.telegram.messenger.at.f14696d4) {
            if (!this.Z) {
                ArrayList arrayList = this.f33686a0;
                arrayList.clear();
                for (int i13 = 0; i13 < 4; i13++) {
                    if (org.telegram.messenger.e20.i(i13).p()) {
                        arrayList.addAll(org.telegram.messenger.pt.t(i13).f17660w);
                    }
                }
                f();
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < 3; i14++) {
                        int i15 = (this.S - 1) + i14;
                        if (arrayList.size() == 1 && (i15 < 0 || i15 >= arrayList.size())) {
                            kjVar = null;
                        } else {
                            if (i15 == -1) {
                                i15 = arrayList.size() - 1;
                            } else if (i15 == arrayList.size()) {
                                i15 = 0;
                            }
                            kjVar = (org.telegram.messenger.kj) arrayList.get(i15);
                        }
                        if (this.R[i14] != kjVar) {
                            q(0);
                        }
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14772r) {
            if (this.Q != null && i11 == this.L) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i16 = org.telegram.messenger.wp.D8;
                if ((intValue & 1) != 0 || (intValue & 4) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0) {
                    r();
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0) {
                    b();
                }
                if ((intValue & 64) != 0) {
                    CharSequence C1 = org.telegram.messenger.wp.r1(this.Q.I1).C1(org.telegram.messenger.kj.B0(this.Q.f16690k), 0L, false);
                    CharSequence charSequence = this.P;
                    if ((charSequence != null && C1 == null) || ((charSequence == null && C1 != null) || (charSequence != null && !charSequence.equals(C1)))) {
                        r();
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14706f2) {
            Integer num = (Integer) objArr[0];
            l0 l0Var = this.f33690n;
            if (l0Var != null) {
                int childCount = l0Var.getChildCount();
                while (i12 < childCount) {
                    View childAt = this.f33690n.getChildAt(i12);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (uf0Var2 = (org.telegram.ui.Components.uf0) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.I1 == i11 && messageObject2.f1() == num.intValue()) {
                        uf0Var2.x();
                        return;
                    }
                    i12++;
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14700e2) {
            Integer num2 = (Integer) objArr[0];
            l0 l0Var2 = this.f33690n;
            if (l0Var2 != null) {
                int childCount2 = l0Var2.getChildCount();
                while (i12 < childCount2) {
                    View childAt2 = this.f33690n.getChildAt(i12);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (uf0Var = (org.telegram.ui.Components.uf0) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.I1 == i11 && messageObject.f1() == num2.intValue()) {
                        uf0Var.y();
                        return;
                    }
                    i12++;
                }
            }
        } else if (i10 == org.telegram.messenger.at.f14726i4) {
            l0 l0Var3 = this.f33690n;
            if (l0Var3 != null) {
                int childCount3 = l0Var3.getChildCount();
                while (i12 < childCount3) {
                    View childAt3 = this.f33690n.getChildAt(i12);
                    if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                        textView.invalidate();
                    }
                    i12++;
                }
            }
        } else if (i10 == org.telegram.messenger.at.O && i11 == this.L) {
            r();
        }
    }

    public final LinearLayout e(int i10, boolean z10) {
        int i11;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i12 = i10;
        ArrayList arrayList2 = this.f33686a0;
        LinearLayout linearLayout = null;
        if (arrayList2.size() == 1 && (i12 < 0 || i12 >= arrayList2.size())) {
            return null;
        }
        int i13 = 0;
        if (i12 == -1) {
            i12 = arrayList2.size() - 1;
        } else if (i12 == arrayList2.size()) {
            i12 = 0;
        }
        org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList2.get(i12);
        TLRPC.Message message = kjVar.f16690k;
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (org.telegram.messenger.kj.B0(message) == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i11 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i14);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    if (sf.c.c(keyboardInlineButtonRow.buttons.get(i15), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i11++;
                    }
                }
            }
        } else {
            i11 = 0;
        }
        int i16 = kjVar.I1;
        if (i11 > 0 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size3 = arrayList4.size();
            LinearLayout linearLayout2 = null;
            int i17 = 0;
            while (i17 < size3) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList4.get(i17);
                int size4 = keyboardInlineButtonRow2.buttons.size();
                int i18 = i13;
                while (i18 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i18);
                    if (sf.c.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(i13);
                            arrayList = arrayList4;
                            org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, linearLayout2, null);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new org.telegram.ui.ActionBar.n2(29));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21116n6, null);
                        textView.setTypeface(org.telegram.messenger.i0.o());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(org.telegram.ui.ActionBar.t6.N0(true));
                        linearLayout2.addView(textView, w7.b6.l(100.0f / i11, -1, -1));
                        textView.setOnClickListener(new bh.f(i16, kjVar));
                    } else {
                        arrayList = arrayList4;
                    }
                    i18++;
                    arrayList4 = arrayList;
                    i13 = 0;
                }
                i17++;
                i13 = 0;
            }
            linearLayout = linearLayout2;
        }
        if (linearLayout != null) {
            int L = org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z10) {
                int i19 = this.S;
                if (i12 == i19) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i12 == i19 - 1) {
                    linearLayout.setTranslationX(-L);
                } else if (i12 == i19 + 1) {
                    linearLayout.setTranslationX(L);
                }
            }
            this.E.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.f33686a0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.S != 0 || this.f33687b.g0() || this.X) && this.Q != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.kj kjVar = (org.telegram.messenger.kj) arrayList.get(i10);
                if (kjVar.I1 == this.Q.I1 && org.telegram.messenger.kj.B0(kjVar.f16690k) == org.telegram.messenger.kj.B0(this.Q.f16690k) && kjVar.f1() == this.Q.f1()) {
                    this.S = i10;
                    if (this.X) {
                        if (i10 == arrayList.size() - 1) {
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
        this.Q = (org.telegram.messenger.kj) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
    }

    public final android.view.ViewGroup g(int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PopupNotificationActivity.g(int, boolean):android.view.ViewGroup");
    }

    public final void h(Intent intent) {
        boolean z10;
        int i10;
        if (intent != null && intent.getBooleanExtra("force", false)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
        this.f33686a0.clear();
        if (this.Z) {
            if (intent != null) {
                i10 = intent.getIntExtra("currentAccount", org.telegram.messenger.e20.f15506s0);
            } else {
                i10 = org.telegram.messenger.e20.f15506s0;
            }
            if (!org.telegram.messenger.e20.r(i10)) {
                return;
            }
            this.f33686a0.addAll(org.telegram.messenger.pt.t(i10).f17661x);
        } else {
            for (int i11 = 0; i11 < 4; i11++) {
                if (org.telegram.messenger.e20.i(i11).p()) {
                    this.f33686a0.addAll(org.telegram.messenger.pt.t(i11).f17660w);
                }
            }
        }
        if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() && org.telegram.messenger.w0.f18951w) {
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
                this.f33686a0.clear();
            }
            for (int i10 = 0; i10 < 4; i10++) {
                org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.I2);
                org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14772r);
                org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14700e2);
                org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14706f2);
                org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.O);
            }
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14696d4);
            org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
            ChatActivityEnterView chatActivityEnterView = this.f33687b;
            if (chatActivityEnterView != null) {
                chatActivityEnterView.z0();
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
        Intent intent = new Intent(org.telegram.messenger.w0.f18945b, LaunchActivity.class);
        long B0 = org.telegram.messenger.kj.B0(this.Q.f16690k);
        if (org.telegram.messenger.o5.C(B0)) {
            intent.putExtra("encId", (int) (B0 & 4294967295L));
        } else if (org.telegram.messenger.o5.E(B0)) {
            intent.putExtra("userId", B0);
        } else if (org.telegram.messenger.o5.z(B0)) {
            intent.putExtra("chatId", -B0);
        }
        intent.putExtra("currentAccount", this.Q.I1);
        intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i10) {
        org.telegram.messenger.kj kjVar;
        int L = org.telegram.messenger.i0.f16172q.x - org.telegram.messenger.i0.L(24.0f);
        if (i10 == 0) {
            n(this.f33691r);
            n(this.f33692s);
            n(this.f33693w);
            m(this.f33694x);
            m(this.f33695y);
            m(this.D);
            int i11 = this.S - 1;
            while (true) {
                int i12 = this.S;
                if (i11 >= i12 + 2) {
                    break;
                }
                if (i11 == i12 - 1) {
                    this.f33692s = g(i11, true);
                    this.f33695y = e(i11, true);
                } else if (i11 == i12) {
                    this.f33691r = g(i11, true);
                    this.f33694x = e(i11, true);
                } else if (i11 == i12 + 1) {
                    this.f33693w = g(i11, true);
                    this.D = e(i11, true);
                }
                i11++;
            }
        } else if (i10 == 1) {
            n(this.f33693w);
            m(this.D);
            this.f33693w = this.f33691r;
            this.f33691r = this.f33692s;
            this.f33692s = g(this.S - 1, true);
            this.D = this.f33694x;
            this.f33694x = this.f33695y;
            this.f33695y = e(this.S - 1, true);
        } else if (i10 == 2) {
            n(this.f33692s);
            m(this.f33695y);
            this.f33692s = this.f33691r;
            this.f33691r = this.f33693w;
            this.f33693w = g(this.S + 1, true);
            this.f33695y = this.f33694x;
            this.f33694x = this.D;
            this.D = e(this.S + 1, true);
        } else if (i10 == 3) {
            ViewGroup viewGroup = this.f33693w;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.f33693w);
                ViewGroup g10 = g(this.S + 1, false);
                this.f33693w = g10;
                if (g10 != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g10.getLayoutParams();
                    layoutParams.width = L;
                    this.f33693w.setLayoutParams(layoutParams);
                    this.f33693w.setTranslationX(translationX);
                    this.f33693w.invalidate();
                }
            }
            LinearLayout linearLayout = this.D;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.D);
                LinearLayout e = e(this.S + 1, false);
                this.D = e;
                if (e != null) {
                    e.setTranslationX(translationX2);
                }
            }
        } else if (i10 == 4) {
            ViewGroup viewGroup2 = this.f33692s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.f33692s);
                ViewGroup g11 = g(0, false);
                this.f33692s = g11;
                if (g11 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g11.getLayoutParams();
                    layoutParams2.width = L;
                    this.f33692s.setLayoutParams(layoutParams2);
                    this.f33692s.setTranslationX(translationX3);
                    this.f33692s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.f33695y;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.f33695y);
                LinearLayout e7 = e(0, false);
                this.f33695y = e7;
                if (e7 != null) {
                    e7.setTranslationX(translationX4);
                }
            }
        }
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = (this.S - 1) + i13;
            ArrayList arrayList = this.f33686a0;
            if (arrayList.size() == 1 && (i14 < 0 || i14 >= arrayList.size())) {
                kjVar = null;
            } else {
                if (i14 == -1) {
                    i14 = arrayList.size() - 1;
                } else if (i14 == arrayList.size()) {
                    i14 = 0;
                }
                kjVar = (org.telegram.messenger.kj) arrayList.get(i14);
            }
            this.R[i13] = kjVar;
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

    public final void o(boolean z10) {
        if (this.f33685a != null) {
            int i10 = 0;
            org.telegram.ui.Components.rv0[] rv0VarArr = this.J;
            if (z10) {
                try {
                    Integer D1 = org.telegram.messenger.wp.r1(this.Q.I1).D1(org.telegram.messenger.kj.B0(this.Q.f16690k), 0L);
                    this.e.setCompoundDrawablesWithIntrinsicBounds(rv0VarArr[D1.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                    this.e.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
                    while (i10 < rv0VarArr.length) {
                        if (i10 == D1.intValue()) {
                            rv0VarArr[i10].d();
                        } else {
                            rv0VarArr[i10].e();
                        }
                        i10++;
                    }
                    return;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            }
            this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(0);
            while (i10 < rv0VarArr.length) {
                rv0VarArr[i10].e();
                i10++;
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.f33687b.q0()) {
            this.f33687b.i0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        org.telegram.messenger.i0.v(this, configuration);
        org.telegram.messenger.i0.w3(getWindow());
        d();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        org.telegram.ui.ActionBar.t6.T(this);
        org.telegram.ui.ActionBar.t6.K(this, false);
        Typeface typeface = org.telegram.messenger.i0.f16145a;
        for (int i10 = 0; i10 < 4; i10++) {
            org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.I2);
            org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14772r);
            org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14700e2);
            org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14706f2);
            org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.O);
        }
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14696d4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
        this.K = ConnectionsManager.generateClassGuid();
        this.J[0] = new org.telegram.ui.Components.z41(false);
        this.J[1] = new org.telegram.ui.Components.ip(false);
        this.J[2] = new org.telegram.ui.Components.fo0(false);
        this.J[3] = new org.telegram.ui.Components.lf0(null, false);
        this.J[4] = new org.telegram.ui.Components.il0(false);
        w8 w8Var = new w8(this, this, 8);
        setContentView(w8Var);
        w8Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        w8Var.addView(relativeLayout, w7.b6.c(-1.0f, -1));
        mt0 mt0Var = new mt0(this, this);
        this.E = mt0Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, mt0Var, null);
        float f7 = -1;
        relativeLayout.addView(this.E, w7.b6.v(12, f7, 12, 240, 13));
        ChatActivityEnterView chatActivityEnterView = this.f33687b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.z0();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, w8Var, null, false, null);
        this.f33687b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.E.addView(this.f33687b, w7.b6.v(0, f7, 0, -2, 12));
        this.f33687b.setDelegate(new nt0(this));
        l0 l0Var = new l0(this, this, 21);
        this.f33690n = l0Var;
        this.E.addView(l0Var, 0);
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(this, null);
        this.f33685a = lVar;
        lVar.setOccupyStatusBar(false);
        this.f33685a.setBackButtonImage(2131231270);
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f21207s8, this.f33685a, null);
        org.telegram.ui.ActionBar.a7.m(this.f33685a, 3, org.telegram.ui.ActionBar.t6.f21226t8, null);
        org.telegram.ui.ActionBar.a7.m(this.f33685a, 1, org.telegram.ui.ActionBar.t6.f21262v8, null);
        this.E.addView(this.f33685a);
        ViewGroup.LayoutParams layoutParams = this.f33685a.getLayoutParams();
        layoutParams.width = -1;
        this.f33685a.setLayoutParams(layoutParams);
        org.telegram.ui.ActionBar.t0 g10 = this.f33685a.p().g(2, 0, org.telegram.messenger.i0.L(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i11 = org.telegram.ui.ActionBar.t6.B8;
        org.telegram.ui.ActionBar.a7.V(textView, i11, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g10.addView(this.h, w7.b6.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f33689f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
        this.f33685a.addView(this.f33689f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f33689f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = org.telegram.messenger.i0.L(48.0f);
        layoutParams2.leftMargin = org.telegram.messenger.i0.L(60.0f);
        layoutParams2.gravity = 51;
        this.f33689f.setLayoutParams(layoutParams2);
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(this);
        this.f33688c = g9Var;
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(21.0f));
        this.f33689f.addView(this.f33688c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f33688c.getLayoutParams();
        layoutParams3.width = org.telegram.messenger.i0.L(42.0f);
        layoutParams3.height = org.telegram.messenger.i0.L(42.0f);
        layoutParams3.topMargin = org.telegram.messenger.i0.L(3.0f);
        this.f33688c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.A8, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(org.telegram.messenger.i0.o());
        this.f33689f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = org.telegram.messenger.i0.L(54.0f);
        layoutParams4.bottomMargin = org.telegram.messenger.i0.L(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.e = textView4;
        org.telegram.ui.ActionBar.a7.V(textView4, i11, null);
        this.e.setTextSize(1, 14.0f);
        this.e.setLines(1);
        this.e.setMaxLines(1);
        this.e.setSingleLine(true);
        this.e.setEllipsize(truncateAt);
        this.e.setGravity(3);
        this.f33689f.addView(this.e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = org.telegram.messenger.i0.L(54.0f);
        layoutParams5.bottomMargin = org.telegram.messenger.i0.L(4.0f);
        layoutParams5.gravity = 80;
        this.e.setLayoutParams(layoutParams5);
        this.f33685a.setActionBarMenuOnItemClick(new s60(this, 17));
        PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.w0.f18945b.getSystemService("power")).newWakeLock(268435462, "screen");
        this.T = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController B = MediaController.B();
        if (B.K0 == this.f33687b) {
            B.K0 = null;
        }
        if (this.T.isHeld()) {
            this.T.release();
        }
        org.telegram.ui.Components.g9 g9Var = this.f33688c;
        if (g9Var != null) {
            g9Var.setImageDrawable(null);
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
        ChatActivityEnterView chatActivityEnterView = this.f33687b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.i0(false);
            this.f33687b.setFieldFocused(false);
        }
        int i10 = this.L;
        if (i10 >= 0) {
            ConnectionsManager.getInstance(i10).setAppPaused(true, false);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        if (i10 == 3 && iArr[0] != 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String L0 = org.telegram.messenger.dd.L0(2131689472, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131747327, null);
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747316, null), new rj0(this, 7));
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131747847, null), null);
            alertDialog$Builder.p();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController B = MediaController.B();
        ChatActivityEnterView chatActivityEnterView = this.f33687b;
        B.K0 = chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.T.acquire(7000L);
    }

    public final void p() {
        ArrayList arrayList = this.f33686a0;
        if (arrayList.size() > 1) {
            if (this.S < arrayList.size() - 1) {
                this.S++;
            } else {
                this.S = 0;
            }
            this.Q = (org.telegram.messenger.kj) arrayList.get(this.S);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.S + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i10) {
        if (this.f33685a == null) {
            return;
        }
        int i11 = this.L;
        if (i11 != this.Q.I1) {
            if (i11 >= 0) {
                ConnectionsManager.getInstance(i11).setAppPaused(true, false);
            }
            int i12 = this.Q.I1;
            this.L = i12;
            ConnectionsManager.getInstance(i12).setAppPaused(false, false);
        }
        this.N = null;
        this.M = null;
        long B0 = org.telegram.messenger.kj.B0(this.Q.f16690k);
        this.f33687b.Z0(this.Q.I1, B0);
        if (org.telegram.messenger.o5.C(B0)) {
            this.M = org.telegram.messenger.wp.r1(this.Q.I1).Z1(Long.valueOf(org.telegram.messenger.wp.r1(this.Q.I1).Z0(Integer.valueOf((int) (4294967295L & B0))).user_id));
        } else if (org.telegram.messenger.o5.E(B0)) {
            this.M = org.telegram.messenger.wp.r1(this.Q.I1).Z1(Long.valueOf(B0));
        } else if (org.telegram.messenger.o5.z(B0)) {
            this.N = org.telegram.messenger.wp.r1(this.Q.I1).L0(Long.valueOf(-B0));
            if (this.Q.p3()) {
                this.M = org.telegram.messenger.wp.r1(this.Q.I1).Z1(Long.valueOf(this.Q.f16690k.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.N;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.M;
            if (user != null) {
                this.e.setText(org.telegram.messenger.i20.p(user));
            } else {
                this.e.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.M;
            if (user2 != null) {
                this.d.setText(org.telegram.messenger.i20.p(user2));
                if (org.telegram.messenger.o5.C(B0)) {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(2131231312, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(org.telegram.messenger.i0.L(4.0f));
                } else {
                    this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(0);
                }
            }
        }
        l(i10);
        r();
        b();
        a(0);
    }

    public final void r() {
        org.telegram.messenger.kj kjVar;
        TLRPC.User user;
        if (this.f33685a != null && (kjVar = this.Q) != null && this.N == null && (user = this.M) != null) {
            long j10 = user.f19943id / 1000;
            if (j10 != 777 && j10 != 333 && org.telegram.messenger.i5.r(kjVar.I1).f16220f0.get(Long.valueOf(this.M.f19943id)) == null && (org.telegram.messenger.i5.r(this.Q.I1).f16220f0.size() != 0 || !org.telegram.messenger.i5.r(this.Q.I1).y())) {
                String str = this.M.phone;
                if (str != null && str.length() != 0) {
                    TextView textView = this.d;
                    af.b c10 = af.b.c();
                    textView.setText(c10.b("+" + this.M.phone));
                } else {
                    this.d.setText(org.telegram.messenger.i20.p(this.M));
                }
            } else {
                this.d.setText(org.telegram.messenger.i20.p(this.M));
            }
            TLRPC.User user2 = this.M;
            if (user2 != null && user2.f19943id == 489000) {
                this.e.setText(org.telegram.messenger.dd.L0(2131743642, null));
            } else if (user2 != null && user2.f19943id == 777000) {
                this.e.setText(org.telegram.messenger.dd.L0(2131745578, null));
            } else {
                CharSequence C1 = org.telegram.messenger.wp.r1(this.Q.I1).C1(org.telegram.messenger.kj.B0(this.Q.f16690k), 0L, false);
                if (C1 != null && C1.length() != 0) {
                    this.P = C1;
                    this.e.setText(C1);
                    o(true);
                    return;
                }
                this.P = null;
                o(false);
                TLRPC.User Z1 = org.telegram.messenger.wp.r1(this.Q.I1).Z1(Long.valueOf(this.M.f19943id));
                if (Z1 != null) {
                    this.M = Z1;
                }
                this.e.setText(org.telegram.messenger.dd.d0(this.Q.I1, this.M, null, null));
            }
        }
    }
}

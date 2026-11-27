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
public class PopupNotificationActivity extends Activity implements fn7 {
    public static final int c0 = 0;
    public LinearLayout E;
    public zi8 F;
    public int L;
    public TLRPC.User N;
    public TLRPC.Chat O;
    public CharSequence Q;
    public org.telegram.ui.ActionBar.a a;
    public boolean a0;
    public ChatActivityEnterView b;
    public de0 c;
    public TextView d;
    public TextView e;
    public FrameLayout f;
    public TextView h;
    public d26 n;
    public ViewGroup r;
    public ViewGroup s;
    public ViewGroup w;
    public LinearLayout x;
    public LinearLayout y;
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final ArrayList I = new ArrayList();
    public VelocityTracker J = null;
    public final d2b[] K = new d2b[5];
    public int M = -1;
    public boolean P = false;
    public r47 R = null;
    public final r47[] S = new r47[3];
    public int T = 0;
    public PowerManager.WakeLock U = null;
    public boolean V = false;
    public long W = 0;
    public float X = -1.0f;
    public boolean Y = false;
    public Runnable Z = null;
    public final ArrayList b0 = new ArrayList();

    public final void a(int i) {
        int L = hl.q.x - hl.L(24.0f);
        ViewGroup viewGroup = this.s;
        if (viewGroup != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewGroup.getLayoutParams();
            if (layoutParams.width != L) {
                layoutParams.width = L;
                this.s.setLayoutParams(layoutParams);
            }
            this.s.setTranslationX((-L) + i);
        }
        LinearLayout linearLayout = this.y;
        if (linearLayout != null) {
            linearLayout.setTranslationX((-L) + i);
        }
        ViewGroup viewGroup2 = this.r;
        if (viewGroup2 != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) viewGroup2.getLayoutParams();
            if (layoutParams2.width != L) {
                layoutParams2.width = L;
                this.r.setLayoutParams(layoutParams2);
            }
            this.r.setTranslationX(i);
        }
        LinearLayout linearLayout2 = this.x;
        if (linearLayout2 != null) {
            linearLayout2.setTranslationX(i);
        }
        ViewGroup viewGroup3 = this.w;
        if (viewGroup3 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) viewGroup3.getLayoutParams();
            if (layoutParams3.width != L) {
                layoutParams3.width = L;
                this.w.setLayoutParams(layoutParams3);
            }
            this.w.setTranslationX(L + i);
        }
        LinearLayout linearLayout3 = this.E;
        if (linearLayout3 != null) {
            linearLayout3.setTranslationX(L + i);
        }
        this.n.invalidate();
    }

    public final void b() {
        TLRPC.User X1;
        r47 r47Var = this.R;
        if (r47Var != null) {
            int i = r47Var.K1;
            if (this.O != null) {
                TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(this.O.id));
                if (M0 != null) {
                    this.O = M0;
                    if (this.c != null) {
                        this.c.f(M0, new rb0(this.O));
                    }
                }
            } else if (this.N != null && (X1 = uc7.s1(i).X1(Long.valueOf(this.N.id))) != null) {
                this.N = X1;
                if (this.c != null) {
                    this.c.f(X1, new rb0(0, this.N));
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
        FrameLayout frameLayout = this.f;
        if (frameLayout != null) {
            frameLayout.getViewTreeObserver().addOnPreDrawListener(new bj8(this, (byte) 0));
        }
        d26 d26Var = this.n;
        if (d26Var != null) {
            d26Var.getViewTreeObserver().addOnPreDrawListener(new bj8(this, (byte) 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TextView textView;
        wi8 wi8Var;
        r47 messageObject;
        wi8 wi8Var2;
        r47 messageObject2;
        r47 r47Var;
        if (i == jn7.I2) {
            if (i2 == this.M) {
                i();
                finish();
                return;
            }
            return;
        }
        int i3 = 0;
        if (i == jn7.g4) {
            if (!this.a0) {
                ArrayList arrayList = this.b0;
                arrayList.clear();
                for (int i4 = 0; i4 < 4; i4++) {
                    if (yac.h(i4).o()) {
                        arrayList.addAll(ip7.n(i4).w);
                    }
                }
                f();
                if (!arrayList.isEmpty()) {
                    for (int i5 = 0; i5 < 3; i5++) {
                        int i6 = (this.T - 1) + i5;
                        if (arrayList.size() == 1 && (i6 < 0 || i6 >= arrayList.size())) {
                            r47Var = null;
                        } else {
                            if (i6 == -1) {
                                i6 = arrayList.size() - 1;
                            } else if (i6 == arrayList.size()) {
                                i6 = 0;
                            }
                            r47Var = (r47) arrayList.get(i6);
                        }
                        if (this.S[i5] != r47Var) {
                            q(0);
                        }
                    }
                }
            }
        } else if (i == 2) {
            if (this.R != null && i2 == this.M) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i7 = uc7.s5;
                if ((intValue & 1) != 0 || (intValue & 4) != 0 || (intValue & 16) != 0 || (intValue & 32) != 0) {
                    r();
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0) {
                    b();
                }
                if ((intValue & 64) != 0) {
                    CharSequence C1 = uc7.s1(this.R.K1).C1(r47.B0(this.R.k), 0L, false);
                    CharSequence charSequence = this.Q;
                    if (charSequence != null) {
                        if (C1 != null && charSequence.equals(C1)) {
                            return;
                        }
                    } else if (C1 == null) {
                        return;
                    }
                    r();
                }
            }
        } else if (i == jn7.f2) {
            Integer num = (Integer) objArr[0];
            d26 d26Var = this.n;
            if (d26Var != null) {
                int childCount = d26Var.getChildCount();
                while (i3 < childCount) {
                    View childAt = this.n.getChildAt(i3);
                    if (((Integer) childAt.getTag()).intValue() == 3 && (messageObject2 = (wi8Var2 = (wi8) childAt.findViewWithTag(300)).getMessageObject()) != null && messageObject2.K1 == i2 && messageObject2.e1() == num.intValue()) {
                        wi8Var2.y();
                        return;
                    }
                    i3++;
                }
            }
        } else if (i == jn7.e2) {
            Integer num2 = (Integer) objArr[0];
            d26 d26Var2 = this.n;
            if (d26Var2 != null) {
                int childCount2 = d26Var2.getChildCount();
                while (i3 < childCount2) {
                    View childAt2 = this.n.getChildAt(i3);
                    if (((Integer) childAt2.getTag()).intValue() == 3 && (messageObject = (wi8Var = (wi8) childAt2.findViewWithTag(300)).getMessageObject()) != null && messageObject.K1 == i2 && messageObject.e1() == num2.intValue()) {
                        wi8Var.A();
                        return;
                    }
                    i3++;
                }
            }
        } else if (i == jn7.l4) {
            d26 d26Var3 = this.n;
            if (d26Var3 != null) {
                int childCount3 = d26Var3.getChildCount();
                while (i3 < childCount3) {
                    View childAt3 = this.n.getChildAt(i3);
                    if (((Integer) childAt3.getTag()).intValue() == 1 && (textView = (TextView) childAt3.findViewWithTag(301)) != null) {
                        textView.invalidate();
                    }
                    i3++;
                }
            }
        } else if (i == jn7.N && i2 == this.M) {
            r();
        }
    }

    public final LinearLayout e(int i, boolean z) {
        int i2;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList;
        int i3 = i;
        ArrayList arrayList2 = this.b0;
        LinearLayout linearLayout = null;
        if (arrayList2.size() == 1 && (i3 < 0 || i3 >= arrayList2.size())) {
            return null;
        }
        int i4 = 0;
        if (i3 == -1) {
            i3 = arrayList2.size() - 1;
        } else if (i3 == arrayList2.size()) {
            i3 = 0;
        }
        r47 r47Var = (r47) arrayList2.get(i3);
        TLRPC.Message message = r47Var.k;
        TLRPC.ReplyMarkup replyMarkup = message.reply_markup;
        if (r47.B0(message) == 777000 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size = arrayList3.size();
            i2 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i5);
                int size2 = keyboardInlineButtonRow.buttons.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    if (ehb.c(keyboardInlineButtonRow.buttons.get(i6), TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        i2++;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        int i7 = r47Var.K1;
        if (i2 > 0 && (replyMarkup instanceof TLRPC.TL_replyInlineMarkup)) {
            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList4 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
            int size3 = arrayList4.size();
            LinearLayout linearLayout2 = null;
            int i8 = 0;
            while (i8 < size3) {
                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow2 = arrayList4.get(i8);
                int size4 = keyboardInlineButtonRow2.buttons.size();
                int i9 = i4;
                while (i9 < size4) {
                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow2.buttons.get(i9);
                    if (ehb.c(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class)) {
                        if (linearLayout2 == null) {
                            linearLayout2 = new LinearLayout(this);
                            linearLayout2.setOrientation(i4);
                            arrayList = arrayList4;
                            yob.h(aob.d6, null, linearLayout2);
                            linearLayout2.setWeightSum(100.0f);
                            linearLayout2.setTag("b");
                            linearLayout2.setOnTouchListener(new b02((byte) 21));
                        } else {
                            arrayList = arrayList4;
                        }
                        TextView textView = new TextView(this);
                        textView.setTextSize(1, 16.0f);
                        yob.X(textView, aob.n6, null);
                        textView.setTypeface(hl.o());
                        textView.setText(keyboardInlineButton.text.toUpperCase());
                        textView.setTag(keyboardInlineButton);
                        textView.setGravity(17);
                        textView.setBackgroundDrawable(aob.L0(true));
                        linearLayout2.addView(textView, tre.l(100.0f / i2, -1, -1));
                        textView.setOnClickListener(new w0(i7, r47Var));
                    } else {
                        arrayList = arrayList4;
                    }
                    i9++;
                    arrayList4 = arrayList;
                    i4 = 0;
                }
                i8++;
                i4 = 0;
            }
            linearLayout = linearLayout2;
        }
        if (linearLayout != null) {
            int L = hl.q.x - hl.L(24.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            if (z) {
                int i10 = this.T;
                if (i3 == i10) {
                    linearLayout.setTranslationX(0.0f);
                } else if (i3 == i10 - 1) {
                    linearLayout.setTranslationX(-L);
                } else if (i3 == i10 + 1) {
                    linearLayout.setTranslationX(L);
                }
            }
            this.F.addView(linearLayout, layoutParams);
        }
        return linearLayout;
    }

    public final void f() {
        ArrayList arrayList = this.b0;
        if (arrayList.isEmpty()) {
            i();
            finish();
            return;
        }
        if ((this.T != 0 || this.b.L0() || this.Y) && this.R != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                r47 r47Var = (r47) arrayList.get(i);
                if (r47Var.K1 == this.R.K1 && r47.B0(r47Var.k) == r47.B0(this.R.k) && r47Var.e1() == this.R.e1()) {
                    this.T = i;
                    if (this.Y) {
                        if (i == arrayList.size() - 1) {
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
        this.R = (r47) arrayList.get(0);
        q(0);
        this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
    }

    public final android.view.ViewGroup g(int r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PopupNotificationActivity.g(int, boolean):android.view.ViewGroup");
    }

    public final void h(Intent intent) {
        boolean z;
        if (intent != null && intent.getBooleanExtra("force", false)) {
            z = true;
        } else {
            z = false;
        }
        this.a0 = z;
        this.b0.clear();
        if (this.a0) {
            int i = yac.t0;
            if (intent != null) {
                i = intent.getIntExtra("currentAccount", i);
            }
            if (!yac.q(i)) {
                return;
            }
            this.b0.addAll(ip7.n(i).x);
        } else {
            for (int i2 = 0; i2 < 4; i2++) {
                if (yac.h(i2).o()) {
                    this.b0.addAll(ip7.n(i2).w);
                }
            }
        }
        if (!((KeyguardManager) getSystemService("keyguard")).inKeyguardRestrictedInputMode() && org.telegram.messenger.a.w) {
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
            if (this.a0) {
                this.b0.clear();
            }
            for (int i = 0; i < 4; i++) {
                jn7.f(i).n(this, jn7.I2);
                jn7.f(i).n(this, 2);
                jn7.f(i).n(this, jn7.e2);
                jn7.f(i).n(this, jn7.f2);
                jn7.f(i).n(this, jn7.N);
            }
            jn7.e().n(this, jn7.g4);
            jn7.e().n(this, jn7.l4);
            ChatActivityEnterView chatActivityEnterView = this.b;
            if (chatActivityEnterView != null) {
                chatActivityEnterView.g1();
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
        Intent intent = new Intent(org.telegram.messenger.a.b, LaunchActivity.class);
        long B0 = r47.B0(this.R.k);
        if (wf3.B(B0)) {
            intent.putExtra("encId", (int) (B0 & 4294967295L));
        } else if (wf3.D(B0)) {
            intent.putExtra("userId", B0);
        } else if (wf3.y(B0)) {
            intent.putExtra("chatId", -B0);
        }
        intent.putExtra("currentAccount", this.R.K1);
        intent.setAction("com.tmessages.openchat" + Math.random() + Integer.MAX_VALUE);
        intent.setFlags(32768);
        startActivity(intent);
        i();
        finish();
    }

    public final void l(int i) {
        r47 r47Var;
        int L = hl.q.x - hl.L(24.0f);
        if (i == 0) {
            n(this.r);
            n(this.s);
            n(this.w);
            m(this.x);
            m(this.y);
            m(this.E);
            int i2 = this.T - 1;
            while (true) {
                int i3 = this.T;
                if (i2 >= i3 + 2) {
                    break;
                }
                if (i2 == i3 - 1) {
                    this.s = g(i2, true);
                    this.y = e(i2, true);
                } else if (i2 == i3) {
                    this.r = g(i2, true);
                    this.x = e(i2, true);
                } else if (i2 == i3 + 1) {
                    this.w = g(i2, true);
                    this.E = e(i2, true);
                }
                i2++;
            }
        } else if (i == 1) {
            n(this.w);
            m(this.E);
            this.w = this.r;
            this.r = this.s;
            this.s = g(this.T - 1, true);
            this.E = this.x;
            this.x = this.y;
            this.y = e(this.T - 1, true);
        } else if (i == 2) {
            n(this.s);
            m(this.y);
            this.s = this.r;
            this.r = this.w;
            this.w = g(this.T + 1, true);
            this.y = this.x;
            this.x = this.E;
            this.E = e(this.T + 1, true);
        } else if (i == 3) {
            ViewGroup viewGroup = this.w;
            if (viewGroup != null) {
                float translationX = viewGroup.getTranslationX();
                n(this.w);
                ViewGroup g = g(this.T + 1, false);
                this.w = g;
                if (g != null) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g.getLayoutParams();
                    layoutParams.width = L;
                    this.w.setLayoutParams(layoutParams);
                    this.w.setTranslationX(translationX);
                    this.w.invalidate();
                }
            }
            LinearLayout linearLayout = this.E;
            if (linearLayout != null) {
                float translationX2 = linearLayout.getTranslationX();
                m(this.E);
                LinearLayout e = e(this.T + 1, false);
                this.E = e;
                if (e != null) {
                    e.setTranslationX(translationX2);
                }
            }
        } else if (i == 4) {
            ViewGroup viewGroup2 = this.s;
            if (viewGroup2 != null) {
                float translationX3 = viewGroup2.getTranslationX();
                n(this.s);
                ViewGroup g2 = g(0, false);
                this.s = g2;
                if (g2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g2.getLayoutParams();
                    layoutParams2.width = L;
                    this.s.setLayoutParams(layoutParams2);
                    this.s.setTranslationX(translationX3);
                    this.s.invalidate();
                }
            }
            LinearLayout linearLayout2 = this.y;
            if (linearLayout2 != null) {
                float translationX4 = linearLayout2.getTranslationX();
                m(this.y);
                LinearLayout e2 = e(0, false);
                this.y = e2;
                if (e2 != null) {
                    e2.setTranslationX(translationX4);
                }
            }
        }
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = (this.T - 1) + i4;
            ArrayList arrayList = this.b0;
            if (arrayList.size() == 1 && (i5 < 0 || i5 >= arrayList.size())) {
                r47Var = null;
            } else {
                if (i5 == -1) {
                    i5 = arrayList.size() - 1;
                } else if (i5 == arrayList.size()) {
                    i5 = 0;
                }
                r47Var = (r47) arrayList.get(i5);
            }
            this.S[i4] = r47Var;
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

    public final void o(boolean z) {
        if (this.a != null) {
            int i = 0;
            d2b[] d2bVarArr = this.K;
            if (z) {
                try {
                    Integer D1 = uc7.s1(this.R.K1).D1(r47.B0(this.R.k), 0L);
                    this.e.setCompoundDrawablesWithIntrinsicBounds(d2bVarArr[D1.intValue()], (Drawable) null, (Drawable) null, (Drawable) null);
                    this.e.setCompoundDrawablePadding(hl.L(4.0f));
                    while (i < d2bVarArr.length) {
                        if (i == D1.intValue()) {
                            d2bVarArr[i].d();
                        } else {
                            d2bVarArr[i].e();
                        }
                        i++;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            }
            this.e.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.e.setCompoundDrawablePadding(0);
            while (i < d2bVarArr.length) {
                d2bVarArr[i].e();
                i++;
            }
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.b.U0()) {
            this.b.N0(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        hl.v(this, configuration);
        hl.r3(getWindow());
        d();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        aob.S(this);
        aob.J(this, false);
        Typeface typeface = hl.a;
        for (int i = 0; i < 4; i++) {
            jn7.f(i).b(this, jn7.I2);
            jn7.f(i).b(this, 2);
            jn7.f(i).b(this, jn7.e2);
            jn7.f(i).b(this, jn7.f2);
            jn7.f(i).b(this, jn7.N);
        }
        jn7.e().b(this, jn7.g4);
        jn7.e().b(this, jn7.l4);
        this.L = ConnectionsManager.generateClassGuid();
        this.K[0] = new z7c(false);
        this.K[1] = new hh2(false);
        this.K[2] = new e8a(false);
        this.K[3] = new pg8(null, false);
        this.K[4] = new cn9(false);
        w81 w81Var = new w81((byte) 7, this, this);
        setContentView(w81Var);
        w81Var.setBackgroundColor(-1728053248);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        w81Var.addView(relativeLayout, tre.c(-1.0f, -1));
        zi8 zi8Var = new zi8(this, this);
        this.F = zi8Var;
        yob.h(aob.d6, null, zi8Var);
        relativeLayout.addView(this.F, tre.v(12, -1.0f, 12, 240.0f, 13));
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.g1();
        }
        ChatActivityEnterView chatActivityEnterView2 = new ChatActivityEnterView(this, w81Var, null, false, null);
        this.b = chatActivityEnterView2;
        chatActivityEnterView2.setId(1000);
        this.F.addView(this.b, tre.v(0, -1.0f, 0, -2.0f, 12));
        this.b.setDelegate(new aj8(this));
        d26 d26Var = new d26((byte) 12, this, this);
        this.n = d26Var;
        this.F.addView(d26Var, 0);
        org.telegram.ui.ActionBar.a aVar = new org.telegram.ui.ActionBar.a(this, null);
        this.a = aVar;
        aVar.setOccupyStatusBar(false);
        this.a.setBackButtonImage(2131231272);
        yob.h(aob.s8, null, this.a);
        yob.l(this.a, 3, aob.t8, null);
        yob.l(this.a, 1, aob.v8, null);
        this.F.addView(this.a);
        ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
        layoutParams.width = -1;
        this.a.setLayoutParams(layoutParams);
        s7 g = this.a.u().g(2, 0, hl.L(56.0f));
        TextView textView = new TextView(this);
        this.h = textView;
        int i2 = aob.B8;
        yob.X(textView, i2, null);
        this.h.setTextSize(1, 14.0f);
        this.h.setGravity(17);
        g.addView(this.h, tre.c(-1.0f, 56));
        FrameLayout frameLayout = new FrameLayout(this);
        this.f = frameLayout;
        frameLayout.setPadding(hl.L(4.0f), 0, hl.L(4.0f), 0);
        this.a.addView(this.f);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -2;
        layoutParams2.rightMargin = hl.L(48.0f);
        layoutParams2.leftMargin = hl.L(60.0f);
        layoutParams2.gravity = 51;
        this.f.setLayoutParams(layoutParams2);
        de0 de0Var = new de0(this);
        this.c = de0Var;
        de0Var.setRoundRadius(hl.L(21.0f));
        this.f.addView(this.c);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.c.getLayoutParams();
        layoutParams3.width = hl.L(42.0f);
        layoutParams3.height = hl.L(42.0f);
        layoutParams3.topMargin = hl.L(3.0f);
        this.c.setLayoutParams(layoutParams3);
        TextView textView2 = new TextView(this);
        this.d = textView2;
        yob.X(textView2, aob.A8, null);
        this.d.setTextSize(1, 18.0f);
        this.d.setLines(1);
        this.d.setMaxLines(1);
        this.d.setSingleLine(true);
        TextView textView3 = this.d;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView3.setEllipsize(truncateAt);
        this.d.setGravity(3);
        this.d.setTypeface(hl.o());
        this.f.addView(this.d);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.d.getLayoutParams();
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.leftMargin = hl.L(54.0f);
        layoutParams4.bottomMargin = hl.L(22.0f);
        layoutParams4.gravity = 80;
        this.d.setLayoutParams(layoutParams4);
        TextView textView4 = new TextView(this);
        this.e = textView4;
        yob.X(textView4, i2, null);
        this.e.setTextSize(1, 14.0f);
        this.e.setLines(1);
        this.e.setMaxLines(1);
        this.e.setSingleLine(true);
        this.e.setEllipsize(truncateAt);
        this.e.setGravity(3);
        this.f.addView(this.e);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.leftMargin = hl.L(54.0f);
        layoutParams5.bottomMargin = hl.L(4.0f);
        layoutParams5.gravity = 80;
        this.e.setLayoutParams(layoutParams5);
        this.a.setActionBarMenuOnItemClick(new zl5(this, (byte) 25));
        PowerManager.WakeLock newWakeLock = ((PowerManager) org.telegram.messenger.a.b.getSystemService("power")).newWakeLock(268435462, "screen");
        this.U = newWakeLock;
        newWakeLock.setReferenceCounted(false);
        h(getIntent());
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        i();
        MediaController z = MediaController.z();
        if (z.L0 == this.b) {
            z.L0 = null;
        }
        if (this.U.isHeld()) {
            this.U.release();
        }
        de0 de0Var = this.c;
        if (de0Var != null) {
            de0Var.setImageDrawable(null);
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
        ChatActivityEnterView chatActivityEnterView = this.b;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.N0(false);
            this.b.setFieldFocused(false);
        }
        int i = this.M;
        if (i >= 0) {
            ConnectionsManager.getInstance(i).setAppPaused(true, false);
        }
    }

    @Override
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 3 && iArr[0] != 0) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this);
            String M0 = ob6.M0(2131689472, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131747038, null);
            alertDialog$Builder.g(ob6.M0(2131747027, null), new jz7(this, (byte) 12));
            alertDialog$Builder.j(ob6.M0(2131747558, null), null);
            alertDialog$Builder.o();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        MediaController z = MediaController.z();
        ChatActivityEnterView chatActivityEnterView = this.b;
        z.L0 = chatActivityEnterView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.setFieldFocused(true);
        }
        d();
        b();
        this.U.acquire(7000L);
    }

    public final void p() {
        int i;
        ArrayList arrayList = this.b0;
        if (arrayList.size() > 1) {
            if (this.T < arrayList.size() - 1) {
                i = this.T + 1;
                this.T = i;
            } else {
                this.T = 0;
                i = 0;
            }
            this.R = (r47) arrayList.get(i);
            q(2);
            this.h.setText(String.format("%d/%d", Integer.valueOf(this.T + 1), Integer.valueOf(arrayList.size())));
        }
    }

    public final void q(int i) {
        if (this.a == null) {
            return;
        }
        int i2 = this.M;
        if (i2 != this.R.K1) {
            if (i2 >= 0) {
                ConnectionsManager.getInstance(i2).setAppPaused(true, false);
            }
            int i3 = this.R.K1;
            this.M = i3;
            ConnectionsManager.getInstance(i3).setAppPaused(false, false);
        }
        this.O = null;
        this.N = null;
        long B0 = r47.B0(this.R.k);
        this.b.M1(this.R.K1, B0);
        if (wf3.B(B0)) {
            this.N = uc7.s1(this.R.K1).X1(Long.valueOf(uc7.s1(this.R.K1).a1(Integer.valueOf((int) (4294967295L & B0))).user_id));
        } else if (wf3.D(B0)) {
            this.N = uc7.s1(this.R.K1).X1(Long.valueOf(B0));
        } else if (wf3.y(B0)) {
            this.O = uc7.s1(this.R.K1).M0(Long.valueOf(-B0));
            if (this.R.p3()) {
                this.N = uc7.s1(this.R.K1).X1(Long.valueOf(this.R.k.from_id.user_id));
            }
        }
        TLRPC.Chat chat = this.O;
        if (chat != null) {
            this.d.setText(chat.title);
            TLRPC.User user = this.N;
            TextView textView = this.e;
            if (user != null) {
                textView.setText(lbc.r(user));
            } else {
                textView.setText((CharSequence) null);
            }
            this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.d.setCompoundDrawablePadding(0);
        } else {
            TLRPC.User user2 = this.N;
            if (user2 != null) {
                this.d.setText(lbc.r(user2));
                boolean B = wf3.B(B0);
                TextView textView2 = this.d;
                if (B) {
                    textView2.setCompoundDrawablesWithIntrinsicBounds(2131231314, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(hl.L(4.0f));
                } else {
                    textView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                    this.d.setCompoundDrawablePadding(0);
                }
            }
        }
        l(i);
        r();
        b();
        a(0);
    }

    public final void r() {
        r47 r47Var;
        TLRPC.User user;
        if (this.a != null && (r47Var = this.R) != null && this.O == null && (user = this.N) != null) {
            long j = user.id / 1000;
            if (j != 777 && j != 333 && lv2.r(r47Var.K1).g0.get(Long.valueOf(this.N.id)) == null && (lv2.r(this.R.K1).g0.size() != 0 || !lv2.r(this.R.K1).y())) {
                String str = this.N.phone;
                if (str != null && str.length() != 0) {
                    TextView textView = this.d;
                    f78 f = f78.f();
                    textView.setText(f.e("+" + this.N.phone));
                } else {
                    this.d.setText(lbc.r(this.N));
                }
            } else {
                this.d.setText(lbc.r(this.N));
            }
            TLRPC.User user2 = this.N;
            if (user2 != null) {
                long j2 = user2.id;
                if (j2 == 489000) {
                    this.e.setText(ob6.M0(2131743271, null));
                    return;
                } else if (j2 == 777000) {
                    this.e.setText(ob6.M0(2131745289, null));
                    return;
                }
            }
            CharSequence C1 = uc7.s1(this.R.K1).C1(r47.B0(this.R.k), 0L, false);
            if (C1 != null && C1.length() != 0) {
                this.Q = C1;
                this.e.setText(C1);
                o(true);
                return;
            }
            this.Q = null;
            o(false);
            TLRPC.User X1 = uc7.s1(this.R.K1).X1(Long.valueOf(this.N.id));
            if (X1 != null) {
                this.N = X1;
            }
            this.e.setText(ob6.d0(this.R.K1, this.N, null, null));
        }
    }
}

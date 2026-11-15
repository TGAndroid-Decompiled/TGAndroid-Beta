package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.z70;
import org.telegram.ui.an;
import org.telegram.ui.ct0;
import org.telegram.ui.t70;
public final class p9 extends r41 implements is {
    public LinearLayout E;
    public o9 F;
    public ShapeDrawable G;
    public org.telegram.ui.ActionBar.r4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public final Runnable K;
    public final ViewTreeObserver.OnWindowFocusChangeListener L;
    public SpannableString M;
    public SpannableString N;
    public org.telegram.ui.Components.h6 O;
    public TextView P;
    public TextView Q;
    public z70 R;
    public TextView S;
    public SpannableString T;
    public org.telegram.ui.ActionBar.l2 U;
    public SpannableString V;
    public boolean W;
    public boolean X;
    public float Y;
    public ValueAnimator Z;
    public LinearLayout f44333a0;
    public r1.g f44334b0;
    public float f44335c0;
    public float f44336d0;
    public TL_wallet.walletUserAddress f44337e;
    public hi.d f44338e0;
    public TLRPC.User f44339f;
    public long f44340f0;
    public boolean f44341g0;
    public String h;
    public String f44342h0;
    public boolean f44343i0;
    public int f44344j0;
    public int f44345k0;
    public boolean f44346l0;
    public boolean m0;
    public String f44347n;
    public DecimalFormat f44348n0;
    public DecimalFormat f44349o0;
    public int f44350p0;
    public boolean f44351q0;
    public boolean f44352r;
    public TL_wallet.walletTransaction f44353r0;
    public long f44354s;
    public y5 f44355s0;
    public da f44356t0;
    public an f44357u0;
    public o6 f44358v0;
    public s8 f44359w;
    public int f44360w0;
    public hi.y4 f44361x;
    public int f44362x0;
    public FrameLayout f44363y;

    public p9(TLRPC.User user) {
        this.f44354s = 0L;
        this.K = new y8(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                p9 p9Var = p9.this;
                Runnable runnable = p9Var.K;
                if (z10 && p9Var.J && (editTextBoldCursor = p9Var.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    p9Var.I.post(runnable);
                }
            }
        };
        this.f44340f0 = -1L;
        this.f44343i0 = true;
        this.f44350p0 = 6;
        this.f44339f = user;
        this.h = null;
        this.f44352r = true;
        l0.x(this.currentAccount).a0(user, new a9(this, 2));
    }

    public static void d0(p9 p9Var) {
        y5.J0(p9Var.currentAccount, p9Var.getParentActivity(), p9Var.getResourceProvider());
    }

    public static void e0(p9 p9Var) {
        String q02;
        hi.d dVar = p9Var.f44338e0;
        if (dVar.f14056d0 && !dVar.R) {
            final l0 x10 = l0.x(p9Var.currentAccount);
            long p02 = p9Var.p0();
            long v = x10.v();
            if (!p9Var.f44352r && WalletEngine2.isValidRecipientAddress(p9Var.h) && p02 > 0) {
                long j3 = ((org.telegram.messenger.l0) np.s1(p9Var.currentAccount).f25448y7.f25856l0.f14544b).f24785c;
                byte[] bArr = null;
                if (p02 < j3) {
                    if (p9Var.f44346l0) {
                        q02 = p9Var.l0(j3, p9Var.n0());
                    } else {
                        q02 = q0(j3);
                    }
                    p9Var.F.setAmountText(q02);
                    p9Var.I.setSelection(q02.length());
                    EditTextBoldCursor editTextBoldCursor = p9Var.I;
                    int i7 = -p9Var.f44350p0;
                    p9Var.f44350p0 = i7;
                    org.telegram.messenger.g0.F3(i7, editTextBoldCursor, null);
                } else if (p02 > v) {
                    org.telegram.messenger.p2.APP_ERROR.a();
                    z70 z70Var = p9Var.R;
                    int i10 = -p9Var.f44350p0;
                    p9Var.f44350p0 = i10;
                    org.telegram.messenger.g0.F3(i10, z70Var, null);
                } else {
                    long j10 = p9Var.f44340f0;
                    if (j10 >= 0 && p02 + j10 > v) {
                        p02 -= j10;
                    }
                    boolean z10 = false;
                    p9Var.J = false;
                    EditTextBoldCursor editTextBoldCursor2 = p9Var.I;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(p9Var.K);
                        p9Var.fragmentView.requestFocus();
                        org.telegram.messenger.g0.v1(p9Var.I);
                    }
                    p9Var.f44338e0.setLoading(true);
                    p9Var.f44353r0 = null;
                    if (p9Var.f44339f != null && TextUtils.isEmpty(p9Var.f44347n)) {
                        p9Var.f44351q0 = true;
                        TLRPC.User user = p9Var.f44339f;
                        long j11 = p02;
                        String str = p9Var.h;
                        String str2 = p9Var.f44342h0;
                        if (p9Var.f44343i0) {
                            bArr = p9Var.r0();
                        }
                        x10.d0(user, str, j11, str2, bArr, null, null, new c9(p9Var, 0), new c9(p9Var, 1), null);
                        return;
                    }
                    final String str3 = p9Var.f44342h0;
                    if (p9Var.f44343i0) {
                        bArr = p9Var.r0();
                    }
                    if (bArr != null) {
                        z10 = true;
                    }
                    if (x10.F()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = l0.g(p9Var.f44339f, p9Var.h, p9Var.f44347n);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z10;
                        wallettransaction.date = p9Var.getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, p9Var.f44340f0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = p02;
                        org.telegram.messenger.g0.v1(p9Var.I);
                        y5.G0(p9Var.getParentActivity(), p9Var.getCurrentAccount(), wallettransaction, new d9(p9Var, x10, p02, 0), new a9(p9Var, 3), p9Var.r0(), null, p9Var.getResourceProvider());
                        org.telegram.messenger.g0.i3(new y8(p9Var, 2), 1000L);
                        return;
                    }
                    final long j12 = p02;
                    final boolean z11 = z10;
                    x10.i(p9Var.h, j12, str3, bArr, new s10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            String str4 = (String) obj2;
                            p9 p9Var2 = p9.this;
                            if (str4 != null) {
                                p9Var2.f44338e0.setLoading(false);
                                cc.a0(p9Var2).e0(str4, false);
                                return;
                            }
                            wallettransaction2.peer = l0.g(p9Var2.f44339f, p9Var2.h, p9Var2.f44347n);
                            wallettransaction2.comment = str3;
                            wallettransaction2.comment_encrypted = z11;
                            wallettransaction2.date = p9Var2.getConnectionsManager().getCurrentTime();
                            org.telegram.messenger.g0.v1(p9Var2.I);
                            y5.G0(p9Var2.getParentActivity(), p9Var2.getCurrentAccount(), wallettransaction2, new d9(p9Var2, x10, j12, 1), new a9(p9Var2, 4), p9Var2.r0(), null, p9Var2.getResourceProvider());
                            org.telegram.messenger.g0.i3(new y8(p9Var2, 3), 1000L);
                        }
                    });
                }
            }
        }
    }

    public static void f0(p9 p9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            p9Var.f44351q0 = false;
            p9Var.f44338e0.setLoading(false);
        } else if (str != null) {
            p9Var.f44351q0 = false;
            p9Var.f44338e0.setLoading(false);
            cc.a0(p9Var).e0(str, false);
        } else if (p9Var.f44341g0) {
            org.telegram.ui.ActionBar.o4 parentLayout = p9Var.getParentLayout();
            if (parentLayout == null) {
                p9Var.finishFragment();
                return;
            }
            long j3 = p9Var.f44339f.f28200id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && i5.c.h(1, arrayList) == p9Var) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) arrayList.get(size);
                    if ((e2Var instanceof an) && e2Var.getCurrentAccount() == p9Var.currentAccount) {
                        an anVar = (an) e2Var;
                        if (anVar.a() == j3 && anVar.f45204g4 == 0) {
                            p9Var.f44357u0 = anVar;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.e2) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (p9Var.f44357u0 == null) {
                    p9Var.getNotificationCenter().k(ns.v, Long.valueOf(j3), Boolean.FALSE);
                    an ua2 = an.ua(j3);
                    ua2.setCurrentAccount(p9Var.currentAccount);
                    if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ua2)) {
                        p9Var.finishFragment();
                        return;
                    }
                    p9Var.f44357u0 = ua2;
                }
                p9Var.finishFragment();
            }
        } else {
            p9Var.w0();
        }
    }

    public static void g0(p9 p9Var, TL_wallet.walletUserAddress walletuseraddress) {
        p9Var.f44352r = false;
        p9Var.f44337e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            p9Var.f44339f = np.s1(p9Var.currentAccount).a2(Long.valueOf(walletuseraddress.user_id));
        }
        bi.v3 v3Var = p9Var.f38882a;
        if (v3Var != null) {
            v3Var.f39895g3.O(true);
        }
        p9Var.C0();
        s8 s8Var = p9Var.f44359w;
        if (s8Var != null) {
            s8Var.a(p9Var.h, p9Var.f44339f);
        }
    }

    public static int i0(p9 p9Var) {
        return p9Var.currentAccount;
    }

    public static int m0(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i7 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i7++;
        }
        return i7;
    }

    public static String q0(long j3) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j3).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static BigDecimal v0(String str) {
        if (TextUtils.isEmpty(str)) {
            return BigDecimal.ZERO;
        }
        try {
            BigDecimal bigDecimal = new BigDecimal(str.replace(',', '.'));
            if (bigDecimal.signum() < 0) {
                return BigDecimal.ZERO;
            }
            return bigDecimal;
        } catch (NumberFormatException unused) {
            return BigDecimal.ZERO;
        }
    }

    public static void z0(SpannableStringBuilder spannableStringBuilder, int i7, int i10, char c10) {
        int i11 = i7 + 1;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10) {
                if (spannableStringBuilder.charAt(i11) == c10 && Character.isDigit(spannableStringBuilder.charAt(i11 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i12))) {
                    int i13 = i12;
                    while (i13 < i10 && Character.isDigit(spannableStringBuilder.charAt(i13))) {
                        i13++;
                    }
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), i12, i13, 33);
                    return;
                }
                i11 = i12;
            } else {
                return;
            }
        }
    }

    public final void A0(String str) {
        this.f44347n = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(hd.M0(2131743016, null));
        }
    }

    public final void B0(boolean z10) {
        float f10;
        float f11 = 0.0f;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) hd.M0(2131743084, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) hd.M0(2131743137, null));
            spannableStringBuilder.append((CharSequence) " >");
            eq eqVar = new eq(2131232698, 0);
            float N = org.telegram.messenger.g0.N(0.66f);
            eqVar.f34415r = 0.0f;
            eqVar.f34416s = N;
            spannableStringBuilder.setSpan(eqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new hi.ha(this, 9), length, spannableStringBuilder.length(), 33);
            this.R.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = this.R.animate();
        float f12 = 1.0f;
        if (z10) {
            f11 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f11);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z10) {
            f12 = 0.6f;
        }
        scaleX.scaleY(f12).setDuration(320L).setInterpolator(er.h).start();
    }

    public final void C0() {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        CharSequence V;
        String q02;
        E0();
        if (this.I != null && this.f44338e0 != null) {
            l0 x10 = l0.x(this.currentAccount);
            long v = x10.v();
            long p02 = p0();
            long j3 = ((org.telegram.messenger.l0) np.s1(this.currentAccount).f25448y7.f25856l0.f14544b).f24785c;
            int i7 = (p02 > 0L ? 1 : (p02 == 0L ? 0 : -1));
            if (i7 > 0 && p02 < j3) {
                if (this.f44346l0) {
                    q02 = l0(j3, n0());
                } else {
                    q02 = q0(j3);
                }
                this.F.setAmountText(q02);
                this.I.setSelection(q02.length());
                EditTextBoldCursor editTextBoldCursor = this.I;
                int i10 = -this.f44350p0;
                this.f44350p0 = i10;
                org.telegram.messenger.g0.F3(i10, editTextBoldCursor, null);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.h) && !this.f44352r && i7 > 0 && p02 <= v) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!TextUtils.isEmpty(this.I.getText()) && p02 > v) {
                z11 = true;
            } else {
                z11 = false;
            }
            B0(z11);
            long p03 = p0();
            if (this.f44348n0 == null) {
                this.f44348n0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            }
            if (p03 > 0) {
                str = this.f44348n0.format(BigDecimal.valueOf(p03, 9));
            } else {
                str = "";
            }
            hi.d dVar = this.f44338e0;
            if (!this.f44352r && !this.f44351q0) {
                z12 = false;
            } else {
                z12 = true;
            }
            dVar.setLoading(z12);
            hi.d dVar2 = this.f44338e0;
            if (TextUtils.isEmpty(str)) {
                V = hd.M0(2131743020, null);
            } else {
                V = hd.V(null, null, 2131743021, l0.l("Grams", str, 2131749507));
            }
            dVar2.i(V, true, true);
            this.f44338e0.setEnabled(z10);
            D0();
            F0();
            if (this.f44346l0) {
                org.telegram.ui.Components.h6 h6Var = this.O;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.N).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.f44349o0 == null) {
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.f44349o0 = decimalFormat;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.f44349o0.format(BigDecimal.valueOf(p02).movePointLeft(9)));
                z0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) hd.M0(2131749516, null));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                h6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M));
                return;
            }
            this.O.setText(o0(x10, p02));
        }
    }

    public final void D0() {
        boolean z10;
        boolean z11;
        float f10;
        if (this.S != null) {
            l0 x10 = l0.x(this.currentAccount);
            this.S.setText(hd.V(null, null, 2131743185, l0.l("Grams", l0.p(x10.v(), false), 2131749507)));
            boolean z12 = this.X;
            EditTextBoldCursor editTextBoldCursor = this.I;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.X = z12 | z10;
            if ((!x10.F() || l0.b(x10.t(), this.h)) && this.X) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j3 = this.f44340f0;
                if (j3 >= 0) {
                    this.U.setText(hd.V(null, null, 2131743072, l0.s(j3, false)));
                } else {
                    this.U.setText(hd.V(null, null, 2131743072, this.V));
                }
            }
            if (this.W == z11) {
                return;
            }
            this.W = z11;
            ValueAnimator valueAnimator = this.Z;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Z = null;
            }
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!this.U.isAttachedToWindow()) {
                y0(f10);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Y, f10);
            this.Z = ofFloat;
            ofFloat.setDuration(320L);
            this.Z.setInterpolator(er.h);
            this.Z.addUpdateListener(new q3(this, 8));
            this.Z.start();
        }
    }

    public final void E0() {
        final boolean z10;
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.E != null && this.P != null) {
            if (p0() <= 0 && this.Q.getVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != this.m0) {
                this.m0 = z10;
                this.E.setVisibility(0);
                this.P.setVisibility(0);
                ViewPropertyAnimator animate = this.E.animate();
                float f14 = 0.0f;
                float f15 = 1.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.8f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.8f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).withEndAction(new Runnable(this) {
                    public final p9 f43849b;

                    {
                        this.f43849b = this;
                    }

                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f43849b.E;
                                if (z10) {
                                    i7 = 0;
                                } else {
                                    i7 = 4;
                                }
                                linearLayout.setVisibility(i7);
                                return;
                            default:
                                TextView textView = this.f43849b.P;
                                if (!z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                textView.setVisibility(i10);
                                return;
                        }
                    }
                }).setDuration(320L);
                er erVar = er.h;
                duration.setInterpolator(erVar).start();
                ViewPropertyAnimator animate2 = this.P.animate();
                if (!z10) {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (!z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.8f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (z10) {
                    f15 = 0.8f;
                }
                scaleX2.scaleY(f15).withEndAction(new Runnable(this) {
                    public final p9 f43849b;

                    {
                        this.f43849b = this;
                    }

                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f43849b.E;
                                if (z10) {
                                    i7 = 0;
                                } else {
                                    i7 = 4;
                                }
                                linearLayout.setVisibility(i7);
                                return;
                            default:
                                TextView textView = this.f43849b.P;
                                if (!z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                textView.setVisibility(i10);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(erVar).start();
            }
        }
    }

    public final void F0() {
        this.F.d(l0.x(this.currentAccount), this.f44346l0);
    }

    public final void G0() {
        boolean z10;
        float f10 = this.f44335c0;
        float f11 = 1.0f - f10;
        float max = Math.max(this.f44336d0, Math.max(0.0f, Math.min(1.0f, f10)));
        this.f44336d0 = max;
        float f12 = 1.0f - max;
        o9 o9Var = this.F;
        float f13 = this.f44335c0;
        if (this.f44334b0 == null && f13 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        o9Var.e(f13, max, z10);
        this.F.setTranslationY((((this.f44361x.getHeight() / 2.0f) - this.F.getTop()) - (this.F.getHeight() / 2.0f)) * f11);
        this.O.setAlpha(this.f44336d0);
        this.O.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.f44363y.setAlpha(this.f44336d0);
        this.f44363y.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.f44333a0.setAlpha(this.f44336d0);
        for (int i7 = 0; i7 < this.f44333a0.getChildCount(); i7++) {
            this.f44333a0.getChildAt(i7).setTranslationY(org.telegram.messenger.g0.L(24.0f) * f12);
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131743016, null);
    }

    @Override
    public final boolean c0(b41 b41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.f38882a.setVisibility(8);
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.q6.h(i7, view, getResourceProvider());
        org.telegram.ui.ActionBar.q6.h(i7, this.actionBar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(1, 2131231244);
        a10.setContentDescription(hd.M0(2131754839, null));
        a10.e(2, 2131232045, hd.M0(2131743137, null));
        a10.e(3, 2131231778, hd.M0(2131743205, null));
        this.actionBar.setActionBarMenuOnItemClick(new ct0(this, 21));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        s8 s8Var = new s8(context, new y8(this, 5), new y8(this, 6), this.resourceProvider);
        this.f44359w = s8Var;
        frameLayout.addView(s8Var, c8.ja.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        s8 s8Var2 = this.f44359w;
        if (s8Var2 != null) {
            s8Var2.a(this.h, this.f44339f);
        }
        hi.y4 y4Var = new hi.y4(this, context);
        this.f44361x = y4Var;
        y4Var.setOrientation(1);
        this.f44361x.setClipChildren(false);
        this.f44361x.setClipToPadding(false);
        frameLayout.addView(this.f44361x, c8.ja.e(-1, -2, 17));
        o9 o9Var = new o9(context, getResourceProvider());
        this.F = o9Var;
        if (o9Var.getDiamondView().f44641f == null) {
            this.f44336d0 = 1.0f;
            this.f44335c0 = 1.0f;
        }
        this.f44361x.addView(this.F, c8.ja.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.F.getEditText();
        this.I = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(spanned.subSequence(0, i12).toString());
                sb2.append((Object) charSequence.subSequence(i10, i11));
                sb2.append((Object) spanned.subSequence(i13, spanned.length()));
                String sb3 = sb2.toString();
                int i14 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                p9 p9Var = p9.this;
                if (p9Var.f44346l0) {
                    BigDecimal n02 = p9Var.n0();
                    valueOf = valueOf.multiply(n02);
                    i14 = p9.m0(n02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i14) {
                    return spanned.subSequence(i12, i13);
                }
                if (p9.v0(sb3).compareTo(valueOf) > 0) {
                    return spanned.subSequence(i12, i13);
                }
                if (i10 != i11) {
                    boolean z10 = false;
                    for (int i15 = 0; i15 < sb3.length(); i15++) {
                        char charAt = sb3.charAt(i15);
                        if (charAt == '.' || charAt == ',') {
                            if (z10) {
                                return spanned.subSequence(i12, i13);
                            }
                            z10 = true;
                        }
                    }
                    if (i12 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
                        return "0" + ((Object) charSequence.subSequence(i10, i11));
                    } else if (sb3.startsWith("00")) {
                        return spanned.subSequence(i12, i13);
                    } else {
                        return null;
                    }
                }
                return null;
            }
        }});
        this.I.setImeOptions(33554438);
        this.I.setOnEditorActionListener(new t8(this, 1));
        this.I.addTextChangedListener(new i9(this, 0));
        long j3 = this.f44354s;
        if (j3 > 0) {
            o9 o9Var2 = this.F;
            BigDecimal valueOf = BigDecimal.valueOf(j3, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            o9Var2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.I;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.M = new SpannableString("⇅");
        eq eqVar = new eq(2131232815, 0);
        eqVar.f34418x = 0.72f;
        SpannableString spannableString = this.M;
        spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
        this.N = new SpannableString("G");
        eq eqVar2 = new eq(2131232819, 0);
        eqVar2.d = false;
        SpannableString spannableString2 = this.N;
        spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true, true, true);
        this.O = h6Var;
        h6Var.f35175c.m(0.35f, 320L, 3.5f, er.h);
        this.O.setScaleProperty(0.25f);
        this.O.setText(o0(l0.x(this.currentAccount), 0L));
        org.telegram.ui.Components.h6 h6Var2 = this.O;
        int i10 = org.telegram.ui.ActionBar.j6.f29260z6;
        org.telegram.ui.ActionBar.m6 p10 = org.telegram.ui.ActionBar.q6.p(i7, i10);
        org.telegram.ui.ActionBar.q6.m(h6Var2, p10.f29392a, p10.f29393b, 4, 0.0f, getResourceProvider());
        this.O.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.O.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        this.O.setGravity(17);
        this.O.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.O.setAllowCancel(true);
        int r12 = org.telegram.ui.ActionBar.j6.r1(0.08f, getThemedColor(i10));
        org.telegram.ui.Components.h6 h6Var3 = this.O;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(14.0f), r12);
        this.G = d02;
        h6Var3.setSizeableBackground(d02);
        this.f44361x.addView(this.O, c8.ja.t(-2, 28, 49, 0, 8, 0, 0));
        c8.na.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final p9 f44689b;

            {
                this.f44689b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f44689b.u0();
                        return;
                    case 1:
                        p9.e0(this.f44689b);
                        return;
                    case 2:
                        p9 p9Var = this.f44689b;
                        BigDecimal n02 = p9Var.n0();
                        if (p9Var.f44346l0 || n02.signum() > 0) {
                            long p02 = p9Var.p0();
                            p9Var.f44346l0 = !p9Var.f44346l0;
                            p9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (p9Var.f44346l0) {
                                q02 = p9Var.l0(p02, n02);
                            } else {
                                q02 = p9.q0(p02);
                            }
                            p9Var.F.setAmountText(q02);
                            p9Var.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        p9.d0(this.f44689b);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f44363y = frameLayout2;
        this.f44361x.addView(frameLayout2, c8.ja.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        this.f44363y.addView(this.E, c8.ja.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.P;
        int i11 = org.telegram.ui.ActionBar.j6.Fi;
        org.telegram.ui.ActionBar.q6.U(textView2, i11, getResourceProvider());
        org.telegram.ui.ActionBar.q6.Q(this.P, org.telegram.ui.ActionBar.j6.b0(org.telegram.ui.ActionBar.j6.r1(0.1f, getThemedColor(i11)), org.telegram.ui.ActionBar.j6.r1(0.25f, getThemedColor(i11)), 14, 14), org.telegram.ui.ActionBar.q6.K(0.1f, i11), org.telegram.ui.ActionBar.q6.K(0.25f, i11), getResourceProvider());
        this.P.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.P.setGravity(17);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131743137, null));
        spannableStringBuilder.append((CharSequence) " >");
        eq eqVar3 = new eq(2131232698, 0);
        float N = org.telegram.messenger.g0.N(0.66f);
        eqVar3.f34415r = 0.0f;
        eqVar3.f34416s = N;
        spannableStringBuilder.setSpan(eqVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.P.setText(spannableStringBuilder);
        this.f44363y.addView(this.P, c8.ja.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        c8.na.a(this.P);
        this.P.setOnClickListener(new View.OnClickListener(this) {
            public final p9 f44689b;

            {
                this.f44689b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f44689b.u0();
                        return;
                    case 1:
                        p9.e0(this.f44689b);
                        return;
                    case 2:
                        p9 p9Var = this.f44689b;
                        BigDecimal n02 = p9Var.n0();
                        if (p9Var.f44346l0 || n02.signum() > 0) {
                            long p02 = p9Var.p0();
                            p9Var.f44346l0 = !p9Var.f44346l0;
                            p9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (p9Var.f44346l0) {
                                q02 = p9Var.l0(p02, n02);
                            } else {
                                q02 = p9.q0(p02);
                            }
                            p9Var.F.setAmountText(q02);
                            p9Var.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        p9.d0(this.f44689b);
                        return;
                }
            }
        });
        this.E.setVisibility(4);
        this.E.setAlpha(0.0f);
        this.E.setScaleX(0.8f);
        this.E.setScaleY(0.8f);
        this.P.setVisibility(0);
        this.P.setAlpha(1.0f);
        this.P.setScaleX(1.0f);
        this.P.setScaleY(1.0f);
        this.m0 = false;
        this.Q = new TextView(context);
        org.telegram.ui.ActionBar.r4 r4Var = new org.telegram.ui.ActionBar.r4(0, true, false, null);
        r4Var.f29574x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = r4Var.f29556c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i12 = org.telegram.ui.ActionBar.j6.bm;
        paint.setColor(getThemedColor(i12));
        r4Var.f29573w = Integer.valueOf(getThemedColor(i12));
        this.Q.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        this.Q.setBackground(r4Var);
        this.H = r4Var;
        this.Q.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.q6.U(this.Q, i10, getResourceProvider());
        this.Q.setTypeface(org.telegram.messenger.g0.o());
        this.Q.setEllipsize(TextUtils.TruncateAt.END);
        this.Q.setMaxLines(4);
        if (TextUtils.isEmpty(this.f44342h0)) {
            this.Q.setVisibility(8);
        } else {
            this.Q.setText(this.f44342h0);
            this.Q.setVisibility(0);
        }
        this.E.addView(this.Q, c8.ja.t(-2, -2, 49, 32, 12, 32, 0));
        this.Q.setOnClickListener(new View.OnClickListener(this) {
            public final p9 f44689b;

            {
                this.f44689b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f44689b.u0();
                        return;
                    case 1:
                        p9.e0(this.f44689b);
                        return;
                    case 2:
                        p9 p9Var = this.f44689b;
                        BigDecimal n02 = p9Var.n0();
                        if (p9Var.f44346l0 || n02.signum() > 0) {
                            long p02 = p9Var.p0();
                            p9Var.f44346l0 = !p9Var.f44346l0;
                            p9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (p9Var.f44346l0) {
                                q02 = p9Var.l0(p02, n02);
                            } else {
                                q02 = p9.q0(p02);
                            }
                            p9Var.F.setAmountText(q02);
                            p9Var.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        p9.d0(this.f44689b);
                        return;
                }
            }
        });
        c8.na.b(this.Q, 0.02f, 1.2f);
        E0();
        z70 z70Var = new z70(context, this.resourceProvider);
        this.R = z70Var;
        org.telegram.ui.ActionBar.q6.U(z70Var, org.telegram.ui.ActionBar.j6.f29090q7, getResourceProvider());
        org.telegram.ui.ActionBar.q6.G(this.R, i11, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.R.setTypeface(org.telegram.messenger.g0.o());
        this.R.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        B0(false);
        this.E.addView(this.R, c8.ja.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f44333a0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f44333a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        this.f44333a0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, getThemedColor(i7)), getThemedColor(i7), getThemedColor(i7)}));
        TextView textView3 = new TextView(context);
        this.S = textView3;
        org.telegram.ui.ActionBar.q6.U(textView3, i10, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.f44333a0.addView(this.S, c8.ja.t(-1, -2, 55, 16, 0, 16, 0));
        this.T = new SpannableString(">");
        eq eqVar4 = new eq(2131232698, 0);
        eqVar4.f34415r = 0.0f;
        eqVar4.f34416s = org.telegram.messenger.g0.L(1.0f);
        SpannableString spannableString3 = this.T;
        spannableString3.setSpan(eqVar4, 0, spannableString3.length(), 33);
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2(10, context, this);
        this.U = l2Var;
        org.telegram.ui.ActionBar.q6.U(l2Var, i10, getResourceProvider());
        this.U.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        this.U.setVisibility(8);
        this.f44333a0.addView(this.U, c8.ja.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(hd.M0(2131748779, null));
        this.V = spannableString4;
        spannableString4.setSpan(new e80(org.telegram.messenger.g0.L(80.0f), this.U), 0, this.V.length(), 33);
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f44338e0 = dVar;
        dVar.setText(hd.M0(2131743020, null));
        this.f44338e0.setEnabled(false);
        this.f44338e0.setOnClickListener(new View.OnClickListener(this) {
            public final p9 f44689b;

            {
                this.f44689b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f44689b.u0();
                        return;
                    case 1:
                        p9.e0(this.f44689b);
                        return;
                    case 2:
                        p9 p9Var = this.f44689b;
                        BigDecimal n02 = p9Var.n0();
                        if (p9Var.f44346l0 || n02.signum() > 0) {
                            long p02 = p9Var.p0();
                            p9Var.f44346l0 = !p9Var.f44346l0;
                            p9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (p9Var.f44346l0) {
                                q02 = p9Var.l0(p02, n02);
                            } else {
                                q02 = p9.q0(p02);
                            }
                            p9Var.F.setAmountText(q02);
                            p9Var.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        p9.d0(this.f44689b);
                        return;
                }
            }
        });
        this.f44333a0.addView(this.f44338e0, c8.ja.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.f44333a0, c8.ja.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ns.f25467a4) {
            D0();
            C0();
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0() {
        try {
            ShapeDrawable shapeDrawable = this.G;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.j6.r1(0.08f, getThemedColor(org.telegram.ui.ActionBar.j6.f29260z6)));
                this.G.invalidateSelf();
                org.telegram.ui.Components.h6 h6Var = this.O;
                if (h6Var != null) {
                    h6Var.invalidate();
                }
            }
            if (this.H != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.bm);
                this.H.f29556c.setColor(themedColor);
                this.H.f29573w = Integer.valueOf(themedColor);
                this.H.invalidateSelf();
                TextView textView = this.Q;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void k0() {
        o9 o9Var = this.F;
        if (o9Var != null) {
            o9Var.getDiamondView().l(null);
        }
        r1.g gVar = this.f44334b0;
        if (gVar != null) {
            gVar.d();
        }
        this.f44335c0 = 1.0f;
        if (this.F != null) {
            G0();
        }
    }

    public final String l0(long j3, BigDecimal bigDecimal) {
        int i7;
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate s02 = s0();
        if (s02 != null) {
            i7 = s02.exp;
        } else if (TextUtils.equals(l0.x(this.currentAccount).h.g(), "USD")) {
            i7 = 2;
        } else {
            i7 = 0;
        }
        int max = Math.max(0, Math.min(i7, 20));
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        BigDecimal scale = movePointLeft.setScale(max, roundingMode);
        if (scale.signum() == 0 && movePointLeft.signum() != 0) {
            scale = movePointLeft.setScale(Math.min(20, Math.max(max, movePointLeft.scale())), roundingMode);
        }
        int m0 = m0(bigDecimal);
        if (scale.scale() > m0) {
            scale = scale.setScale(m0, RoundingMode.DOWN);
        }
        BigDecimal multiply = BigDecimal.valueOf(Long.MAX_VALUE, 9).multiply(bigDecimal);
        if (scale.compareTo(multiply) > 0) {
            scale = multiply.setScale(scale.scale(), RoundingMode.DOWN);
        }
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public final BigDecimal n0() {
        f fVar = l0.x(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.i0) np.s1(this.currentAccount).f25448y7.f25855l.f13134b).f24257a;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    public final SpannableStringBuilder o0(l0 l0Var, long j3) {
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(l0Var.m(j3, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate s02 = s0();
        if (s02 != null && !TextUtils.isEmpty(s02.decimalSeparator)) {
            c10 = s02.decimalSeparator.charAt(0);
        } else {
            c10 = '.';
        }
        z0(spannableStringBuilder, length, length2, c10);
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M);
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        o9 o9Var;
        View view2;
        if (!z10 && this.f44357u0 != null && (wallettransaction = this.f44353r0) != null && wallettransaction.localMessageId != 0 && (o9Var = this.F) != null) {
            w6 diamondView = o9Var.getDiamondView();
            if (diamondView.f44641f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                o6 o6Var = new o6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.f44357u0, this.f44353r0, runnable, null);
                this.f44358v0 = o6Var;
                return o6Var.f44258m;
            }
        }
        if (!z10 && this.f44355s0 != null && this.f44353r0 != null && this.F != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            da daVar = new da(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.f44355s0, this.f44353r0, runnable, null);
            this.f44356t0 = daVar;
            return daVar.f43771m;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.f25467a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.J = false;
        k0();
        o6 o6Var = this.f44358v0;
        if (o6Var != null) {
            AnimatorSet animatorSet = o6Var.f44258m;
            if (!o6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    o6Var.a(false);
                }
            }
            this.f44358v0 = null;
        }
        da daVar = this.f44356t0;
        if (daVar != null) {
            AnimatorSet animatorSet2 = daVar.f43771m;
            if (!daVar.f43777s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    daVar.b();
                }
            }
            this.f44356t0 = null;
        }
        ValueAnimator valueAnimator = this.Z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Z = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.K);
        }
        getNotificationCenter().n(this, ns.f25467a4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f44344j0 = i12;
        if (this.f44333a0 != null) {
            int max = Math.max(0, this.f44345k0 - i12);
            this.f44333a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f) + this.f44344j0);
            if (this.f44360w0 != max) {
                this.f44333a0.animate().cancel();
                this.f44333a0.animate().translationY(-max).setDuration(320L).setInterpolator(er.h).start();
                this.f44360w0 = max;
            }
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f44345k0 = k1Var.f55682a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override
    public final void onPause() {
        k0();
        this.J = false;
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.K);
            this.fragmentView.requestFocus();
            org.telegram.messenger.g0.v1(this.I);
        }
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        t0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            j0();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6);
            LinearLayout linearLayout = this.f44333a0;
            if (linearLayout != null && themedColor != this.f44362x0 && (linearLayout.getBackground() instanceof GradientDrawable)) {
                this.f44362x0 = themedColor;
                ((GradientDrawable) this.f44333a0.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.j6.r1(0.0f, themedColor), themedColor, themedColor});
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11 && this.J && (editTextBoldCursor = this.I) != null) {
            Runnable runnable = this.K;
            editTextBoldCursor.removeCallbacks(runnable);
            this.I.post(runnable);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        o9 o9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (o9Var = this.F) != null && this.f44335c0 < 1.0f) {
            o9Var.getDiamondView().l(new y8(this, 1));
        }
        if (z10 && !z11 && (editTextBoldCursor = this.I) != null) {
            Runnable runnable = this.K;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.f44354s > 0) {
                EditTextBoldCursor editTextBoldCursor2 = this.I;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
            }
            this.J = true;
            this.I.requestFocus();
            this.I.post(runnable);
        }
    }

    public final long p0() {
        EditTextBoldCursor editTextBoldCursor = this.I;
        if (editTextBoldCursor != null) {
            BigDecimal v02 = v0(editTextBoldCursor.getText().toString());
            if (this.f44346l0) {
                BigDecimal n02 = n0();
                if (n02.signum() <= 0) {
                    return 0L;
                }
                v02 = v02.divide(n02, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
            }
            BigInteger bigInteger = v02.movePointRight(9).toBigInteger();
            if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                return Long.MAX_VALUE;
            }
            return bigInteger.longValue();
        }
        return 0L;
    }

    public final byte[] r0() {
        TL_wallet.walletUserAddress walletuseraddress = this.f44337e;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f44337e.public_key;
            if (i7 >= bArr.length) {
                return null;
            }
            if (bArr[i7] != 0) {
                return bArr;
            }
            i7++;
        }
    }

    public final TL_wallet.currencyRate s0() {
        f fVar = l0.x(this.currentAccount).h;
        TL_wallet.currencyRates f10 = fVar.f();
        if (f10 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f10.rates;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i7);
            i7++;
            TL_wallet.currencyRate currencyrate2 = currencyrate;
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, fVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    public final void t0() {
        byte[] bArr;
        if (WalletEngine2.isValidRecipientAddress(this.h)) {
            this.f44340f0 = -1L;
            D0();
            l0 x10 = l0.x(this.currentAccount);
            if (x10.F() && !l0.b(x10.t(), this.h) && this.f44339f != null && TextUtils.isEmpty(this.f44347n)) {
                return;
            }
            String str = this.h;
            String str2 = this.f44342h0;
            if (this.f44343i0) {
                bArr = r0();
            } else {
                bArr = null;
            }
            x10.i(str, 0L, str2, bArr, new a9(this, 1));
        }
    }

    public final void u0() {
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        int i7;
        int L;
        boolean z12;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            if (this.f44345k0 - this.f44344j0 > org.telegram.messenger.g0.L(20.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, getResourceProvider());
            } else {
                alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, getResourceProvider());
            }
            String M0 = hd.M0(2131743205, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
            t1Var.S = M0;
            final kg.x0 x0Var = new kg.x0(this, parentActivity);
            x0Var.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.q6.U(x0Var, org.telegram.ui.ActionBar.j6.f28957j5, getResourceProvider());
            org.telegram.ui.ActionBar.q6.D(x0Var, org.telegram.ui.ActionBar.j6.f29145t5, getResourceProvider());
            x0Var.setHint(hd.M0(2131743169, null));
            x0Var.setText(this.f44342h0);
            x0Var.setSelection(x0Var.length());
            x0Var.setInputType(147457);
            int i10 = 5;
            x0Var.setMaxLines(5);
            x0Var.setImeOptions(6);
            org.telegram.ui.ActionBar.q6.F(x0Var, org.telegram.ui.ActionBar.j6.f28978k6, org.telegram.ui.ActionBar.j6.f28996l6, org.telegram.ui.ActionBar.j6.f29070p7, getResourceProvider());
            x0Var.setBackground(null);
            x0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, getResourceProvider());
            int i11 = org.telegram.ui.ActionBar.j6.f28941i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.w0(i11, this.resourceProvider), 7, org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
            org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
            c2Var.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(c2Var, h02, null, M, e6Var);
            String M02 = hd.M0(2131743077, null);
            if (this.f44343i0 && r0() != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            c2Var.e(M02, "", z11, false, false);
            c2Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (!hd.f24101a0) {
                i10 = 3;
            }
            layoutParams.gravity = i10 | 16;
            c2Var.getCheckBoxView().setLayoutParams(layoutParams);
            if (hd.f24101a0) {
                i7 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i7 = 0;
            }
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (hd.f24101a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            c2Var.setPadding(i7, L2, L, org.telegram.messenger.g0.L(12.0f));
            if (r0() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            c2Var.setEnabled(z12);
            c2Var.setOnClickListener(new g3(c2Var, 6));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(x0Var, c8.ja.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(c2Var, c8.ja.t(-1, -2, 83, 8, 0, 8, 0));
            t1Var.H = 6;
            alertDialog$Builder.o(linearLayout);
            t1Var.f29614a = org.telegram.messenger.g0.L(292.0f);
            alertDialog$Builder.h(hd.M0(2131752589, null), new t70(19));
            alertDialog$Builder.k(hd.M0(2131754486, null), new j8(this, x0Var, c2Var, 2));
            t1Var.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    kg.x0 x0Var2 = kg.x0.this;
                    x0Var2.requestFocus();
                    org.telegram.messenger.g0.J3(x0Var2);
                }
            });
            t1Var.setOnDismissListener(new j2(this, 2));
            if (z10) {
                t1Var.r(250L);
            } else {
                t1Var.show();
            }
            t1Var.f29639k0 = false;
            View d = t1Var.d(-1);
            if ((d instanceof TextView) && !TextUtils.isEmpty(this.f44342h0)) {
                x0Var.addTextChangedListener(new bi.l3(x0Var, (TextView) d));
            }
        }
    }

    public final void w0() {
        org.telegram.ui.ActionBar.o4 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (!arrayList.isEmpty() && i5.c.h(1, arrayList) == this) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                if (e2Var instanceof z9) {
                    ((ActionBarLayout) parentLayout).d0(e2Var, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (r.b.h(2, fragmentStack) instanceof y5) && ((org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.f44355s0 = (y5) r.b.h(2, fragmentStack);
            } else {
                y5 y5Var = new y5();
                y5Var.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, y5Var)) {
                    this.f44355s0 = y5Var;
                }
            }
            finishFragment();
        }
    }

    public final void x0() {
        this.f44341g0 = true;
    }

    public final void y0(float f10) {
        int i7;
        this.Y = f10;
        this.U.setAlpha(f10);
        org.telegram.ui.ActionBar.l2 l2Var = this.U;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        l2Var.setVisibility(i7);
        ((LinearLayout.LayoutParams) this.U.getLayoutParams()).topMargin = Math.round(org.telegram.messenger.g0.L(4.0f) * f10);
        this.U.requestLayout();
    }

    public p9(String str) {
        this(m10.f24934t0, str);
    }

    public p9(int i7, String str) {
        this.f44354s = 0L;
        this.K = new y8(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                p9 p9Var = p9.this;
                Runnable runnable = p9Var.K;
                if (z10 && p9Var.J && (editTextBoldCursor = p9Var.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    p9Var.I.post(runnable);
                }
            }
        };
        this.f44340f0 = -1L;
        this.f44343i0 = true;
        this.f44350p0 = 6;
        setCurrentAccount(i7);
        this.f44339f = null;
        this.h = str;
        t0();
        this.f44352r = true;
        l0.x(this.currentAccount).Z(new a9(this, 0), str);
    }

    @Override
    public final void Z(ArrayList arrayList, p41 p41Var) {
    }

    @Override
    public final void b0(b41 b41Var, View view) {
    }
}

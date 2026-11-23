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
import org.telegram.messenger.gs;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r80;
import org.telegram.ui.bn;
import org.telegram.ui.is0;
import org.telegram.ui.l60;
public final class da extends e51 implements gs {
    public LinearLayout E;
    public ca F;
    public ShapeDrawable G;
    public org.telegram.ui.ActionBar.u4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public final Runnable K;
    public final ViewTreeObserver.OnWindowFocusChangeListener L;
    public SpannableString M;
    public SpannableString N;
    public org.telegram.ui.Components.o6 O;
    public TextView P;
    public TextView Q;
    public m80 R;
    public TextView S;
    public SpannableString T;
    public org.telegram.ui.ActionBar.n2 U;
    public SpannableString V;
    public boolean W;
    public boolean X;
    public float Y;
    public ValueAnimator Z;
    public LinearLayout f44063a0;
    public r1.g f44064b0;
    public float f44065c0;
    public float f44066d0;
    public TL_wallet.walletUserAddress f44067e;
    public hi.d f44068e0;
    public TLRPC.User f44069f;
    public long f44070f0;
    public boolean f44071g0;
    public String h;
    public String f44072h0;
    public boolean f44073i0;
    public int f44074j0;
    public int f44075k0;
    public boolean f44076l0;
    public boolean m0;
    public String f44077n;
    public DecimalFormat f44078n0;
    public DecimalFormat f44079o0;
    public int f44080p0;
    public boolean f44081q0;
    public boolean f44082r;
    public TL_wallet.walletTransaction f44083r0;
    public long f44084s;
    public n6 f44085s0;
    public ra f44086t0;
    public bn f44087u0;
    public e7 f44088v0;
    public g9 f44089w;
    public int f44090w0;
    public hi.y4 f44091x;
    public int f44092x0;
    public FrameLayout f44093y;

    public da(TLRPC.User user) {
        this.f44084s = 0L;
        this.K = new n9(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                da daVar = da.this;
                Runnable runnable = daVar.K;
                if (z10 && daVar.J && (editTextBoldCursor = daVar.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    daVar.I.post(runnable);
                }
            }
        };
        this.f44070f0 = -1L;
        this.f44073i0 = true;
        this.f44080p0 = 6;
        this.f44069f = user;
        this.h = null;
        this.f44082r = true;
        u0.D(this.currentAccount).j0(user, new p9(this, 2));
    }

    public static void d0(da daVar) {
        n6.N0(daVar.currentAccount, daVar.getParentActivity(), daVar.getResourceProvider());
    }

    public static void e0(da daVar) {
        String q02;
        hi.d dVar = daVar.f44068e0;
        if (dVar.f14303e0 && !dVar.R) {
            final u0 D = u0.D(daVar.currentAccount);
            long p02 = daVar.p0();
            long A = D.A();
            if (!daVar.f44082r && WalletEngine2.isValidRecipientAddress(daVar.h) && p02 > 0) {
                long j3 = ((org.telegram.messenger.l0) np.u1(daVar.currentAccount).A7.f26207r0.f13993b).f25140c;
                byte[] bArr = null;
                if (p02 < j3) {
                    if (daVar.f44076l0) {
                        q02 = daVar.l0(j3, daVar.n0());
                    } else {
                        q02 = q0(j3);
                    }
                    daVar.F.setAmountText(q02);
                    daVar.I.setSelection(q02.length());
                    EditTextBoldCursor editTextBoldCursor = daVar.I;
                    int i7 = -daVar.f44080p0;
                    daVar.f44080p0 = i7;
                    org.telegram.messenger.g0.E3(i7, editTextBoldCursor, null);
                } else if (p02 > A) {
                    org.telegram.messenger.q2.APP_ERROR.a();
                    m80 m80Var = daVar.R;
                    int i10 = -daVar.f44080p0;
                    daVar.f44080p0 = i10;
                    org.telegram.messenger.g0.E3(i10, m80Var, null);
                } else {
                    long j10 = daVar.f44070f0;
                    if (j10 >= 0 && p02 + j10 > A) {
                        p02 -= j10;
                    }
                    boolean z10 = false;
                    daVar.J = false;
                    EditTextBoldCursor editTextBoldCursor2 = daVar.I;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(daVar.K);
                        daVar.fragmentView.requestFocus();
                        org.telegram.messenger.g0.v1(daVar.I);
                    }
                    daVar.f44068e0.setLoading(true);
                    daVar.f44083r0 = null;
                    if (daVar.f44069f != null && TextUtils.isEmpty(daVar.f44077n)) {
                        daVar.f44081q0 = true;
                        TLRPC.User user = daVar.f44069f;
                        long j11 = p02;
                        String str = daVar.h;
                        String str2 = daVar.f44072h0;
                        if (daVar.f44073i0) {
                            bArr = daVar.r0();
                        }
                        D.m0(user, str, j11, str2, bArr, null, null, new r9(daVar, 0), new r9(daVar, 1));
                        return;
                    }
                    final String str3 = daVar.f44072h0;
                    if (daVar.f44073i0) {
                        bArr = daVar.r0();
                    }
                    if (bArr != null) {
                        z10 = true;
                    }
                    if (D.M()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = u0.i(daVar.f44069f, daVar.h, daVar.f44077n);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z10;
                        wallettransaction.date = daVar.getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, daVar.f44070f0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = p02;
                        org.telegram.messenger.g0.v1(daVar.I);
                        n6.K0(daVar.getParentActivity(), daVar.getCurrentAccount(), wallettransaction, new s9(daVar, D, p02, 0), new p9(daVar, 3), daVar.r0(), null, daVar.getResourceProvider());
                        org.telegram.messenger.g0.h3(new n9(daVar, 2), 1000L);
                        return;
                    }
                    final long j12 = p02;
                    final boolean z11 = z10;
                    D.m(daVar.h, j12, str3, bArr, new r10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            String str4 = (String) obj2;
                            da daVar2 = da.this;
                            if (str4 != null) {
                                daVar2.f44068e0.setLoading(false);
                                lc.b0(daVar2).f0(str4, false);
                                return;
                            }
                            wallettransaction2.peer = u0.i(daVar2.f44069f, daVar2.h, daVar2.f44077n);
                            wallettransaction2.comment = str3;
                            wallettransaction2.comment_encrypted = z11;
                            wallettransaction2.date = daVar2.getConnectionsManager().getCurrentTime();
                            org.telegram.messenger.g0.v1(daVar2.I);
                            n6.K0(daVar2.getParentActivity(), daVar2.getCurrentAccount(), wallettransaction2, new s9(daVar2, D, j12, 1), new p9(daVar2, 4), daVar2.r0(), null, daVar2.getResourceProvider());
                            org.telegram.messenger.g0.h3(new n9(daVar2, 3), 1000L);
                        }
                    });
                }
            }
        }
    }

    public static void f0(da daVar, String str) {
        if (u0.L(str)) {
            daVar.f44081q0 = false;
            daVar.f44068e0.setLoading(false);
        } else if (str != null) {
            daVar.f44081q0 = false;
            daVar.f44068e0.setLoading(false);
            lc.b0(daVar).f0(str, false);
        } else if (daVar.f44071g0) {
            org.telegram.ui.ActionBar.r4 parentLayout = daVar.getParentLayout();
            if (parentLayout == null) {
                daVar.finishFragment();
                return;
            }
            long j3 = daVar.f44069f.f28547id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && i5.c.h(1, arrayList) == daVar) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) arrayList.get(size);
                    if ((g2Var instanceof bn) && g2Var.getCurrentAccount() == daVar.currentAccount) {
                        bn bnVar = (bn) g2Var;
                        if (bnVar.a() == j3 && bnVar.f45989g4 == 0) {
                            daVar.f44087u0 = bnVar;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.g2) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (daVar.f44087u0 == null) {
                    daVar.getNotificationCenter().k(ls.v, Long.valueOf(j3), Boolean.FALSE);
                    bn ua2 = bn.ua(j3);
                    ua2.setCurrentAccount(daVar.currentAccount);
                    if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ua2)) {
                        daVar.finishFragment();
                        return;
                    }
                    daVar.f44087u0 = ua2;
                }
                daVar.finishFragment();
            }
        } else {
            daVar.w0();
        }
    }

    public static void g0(da daVar, TL_wallet.walletUserAddress walletuseraddress) {
        daVar.f44082r = false;
        daVar.f44067e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            daVar.f44069f = np.u1(daVar.currentAccount).c2(Long.valueOf(walletuseraddress.user_id));
        }
        bi.i6 i6Var = daVar.f34671a;
        if (i6Var != null) {
            i6Var.f35742g3.O(true);
        }
        daVar.C0();
        g9 g9Var = daVar.f44089w;
        if (g9Var != null) {
            g9Var.a(daVar.h, daVar.f44069f);
        }
    }

    public static int i0(da daVar) {
        return daVar.currentAccount;
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
        this.f44077n = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(hd.N0(2131742752, null));
        }
    }

    public final void B0(boolean z10) {
        float f10;
        float f11 = 0.0f;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) hd.N0(2131742839, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) hd.N0(2131742893, null));
            spannableStringBuilder.append((CharSequence) " >");
            nq nqVar = new nq(2131232699, 0);
            float N = org.telegram.messenger.g0.N(0.66f);
            nqVar.f37907r = 0.0f;
            nqVar.f37908s = N;
            spannableStringBuilder.setSpan(nqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new hi.ia(this, 9), length, spannableStringBuilder.length(), 33);
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
        scaleX.scaleY(f12).setDuration(320L).setInterpolator(nr.h).start();
    }

    public final void C0() {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        CharSequence V;
        String q02;
        E0();
        if (this.I != null && this.f44068e0 != null) {
            u0 D = u0.D(this.currentAccount);
            long A = D.A();
            long p02 = p0();
            long j3 = ((org.telegram.messenger.l0) np.u1(this.currentAccount).A7.f26207r0.f13993b).f25140c;
            int i7 = (p02 > 0L ? 1 : (p02 == 0L ? 0 : -1));
            if (i7 > 0 && p02 < j3) {
                if (this.f44076l0) {
                    q02 = l0(j3, n0());
                } else {
                    q02 = q0(j3);
                }
                this.F.setAmountText(q02);
                this.I.setSelection(q02.length());
                EditTextBoldCursor editTextBoldCursor = this.I;
                int i10 = -this.f44080p0;
                this.f44080p0 = i10;
                org.telegram.messenger.g0.E3(i10, editTextBoldCursor, null);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.h) && !this.f44082r && i7 > 0 && p02 <= A) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!TextUtils.isEmpty(this.I.getText()) && p02 > A) {
                z11 = true;
            } else {
                z11 = false;
            }
            B0(z11);
            long p03 = p0();
            if (this.f44078n0 == null) {
                this.f44078n0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            }
            if (p03 > 0) {
                str = this.f44078n0.format(BigDecimal.valueOf(p03, 9));
            } else {
                str = "";
            }
            hi.d dVar = this.f44068e0;
            if (!this.f44082r && !this.f44081q0) {
                z12 = false;
            } else {
                z12 = true;
            }
            dVar.setLoading(z12);
            hi.d dVar2 = this.f44068e0;
            if (TextUtils.isEmpty(str)) {
                V = hd.N0(2131742756, null);
            } else {
                V = hd.V(null, null, 2131742757, u0.q("Grams", str, 2131749314));
            }
            dVar2.i(V, true, true);
            this.f44068e0.setEnabled(z10);
            D0();
            F0();
            if (this.f44076l0) {
                org.telegram.ui.Components.o6 o6Var = this.O;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.N).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.f44079o0 == null) {
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.f44079o0 = decimalFormat;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.f44079o0.format(BigDecimal.valueOf(p02).movePointLeft(9)));
                z0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) hd.N0(2131749340, null));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                o6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M));
                return;
            }
            this.O.setText(o0(D, p02));
        }
    }

    public final void D0() {
        boolean z10;
        boolean z11;
        float f10;
        if (this.S != null) {
            u0 D = u0.D(this.currentAccount);
            this.S.setText(hd.V(null, null, 2131742941, u0.q("Grams", u0.u(D.A(), false), 2131749314)));
            boolean z12 = this.X;
            EditTextBoldCursor editTextBoldCursor = this.I;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.X = z12 | z10;
            if ((!D.M() || u0.c(D.y(), this.h)) && this.X) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j3 = this.f44070f0;
                if (j3 >= 0) {
                    this.U.setText(hd.V(null, null, 2131742827, u0.x(j3, false)));
                } else {
                    this.U.setText(hd.V(null, null, 2131742827, this.V));
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
            this.Z.setInterpolator(nr.h);
            this.Z.addUpdateListener(new z3(this, 8));
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
                    public final da f45157b;

                    {
                        this.f45157b = this;
                    }

                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f45157b.E;
                                if (z10) {
                                    i7 = 0;
                                } else {
                                    i7 = 4;
                                }
                                linearLayout.setVisibility(i7);
                                return;
                            default:
                                TextView textView = this.f45157b.P;
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
                nr nrVar = nr.h;
                duration.setInterpolator(nrVar).start();
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
                    public final da f45157b;

                    {
                        this.f45157b = this;
                    }

                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f45157b.E;
                                if (z10) {
                                    i7 = 0;
                                } else {
                                    i7 = 4;
                                }
                                linearLayout.setVisibility(i7);
                                return;
                            default:
                                TextView textView = this.f45157b.P;
                                if (!z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                textView.setVisibility(i10);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(nrVar).start();
            }
        }
    }

    public final void F0() {
        this.F.d(u0.D(this.currentAccount), this.f44076l0);
    }

    public final void G0() {
        boolean z10;
        float f10 = this.f44065c0;
        float f11 = 1.0f - f10;
        float max = Math.max(this.f44066d0, Math.max(0.0f, Math.min(1.0f, f10)));
        this.f44066d0 = max;
        float f12 = 1.0f - max;
        ca caVar = this.F;
        float f13 = this.f44065c0;
        if (this.f44064b0 == null && f13 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        caVar.e(f13, max, z10);
        this.F.setTranslationY((((this.f44091x.getHeight() / 2.0f) - this.F.getTop()) - (this.F.getHeight() / 2.0f)) * f11);
        this.O.setAlpha(this.f44066d0);
        this.O.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.f44093y.setAlpha(this.f44066d0);
        this.f44093y.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.f44063a0.setAlpha(this.f44066d0);
        for (int i7 = 0; i7 < this.f44063a0.getChildCount(); i7++) {
            this.f44063a0.getChildAt(i7).setTranslationY(org.telegram.messenger.g0.L(24.0f) * f12);
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.N0(2131742752, null);
    }

    @Override
    public final boolean c0(o41 o41Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.f34671a.setVisibility(8);
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.m6.f29347d6;
        org.telegram.ui.ActionBar.t6.h(i7, view, getResourceProvider());
        org.telegram.ui.ActionBar.t6.h(i7, this.actionBar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.s().a(1, 2131231244);
        a10.setContentDescription(hd.N0(2131754838, null));
        a10.e(2, 2131232046, hd.N0(2131742893, null));
        a10.e(3, 2131231779, hd.N0(2131742961, null));
        this.actionBar.setActionBarMenuOnItemClick(new is0(this, 23));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        g9 g9Var = new g9(context, new n9(this, 5), new n9(this, 6), this.resourceProvider);
        this.f44089w = g9Var;
        frameLayout.addView(g9Var, c8.na.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        g9 g9Var2 = this.f44089w;
        if (g9Var2 != null) {
            g9Var2.a(this.h, this.f44069f);
        }
        hi.y4 y4Var = new hi.y4(this, context);
        this.f44091x = y4Var;
        y4Var.setOrientation(1);
        this.f44091x.setClipChildren(false);
        this.f44091x.setClipToPadding(false);
        frameLayout.addView(this.f44091x, c8.na.e(-1, -2, 17));
        ca caVar = new ca(context, getResourceProvider());
        this.F = caVar;
        if (caVar.getDiamondView().f44587f == null) {
            this.f44066d0 = 1.0f;
            this.f44065c0 = 1.0f;
        }
        this.f44091x.addView(this.F, c8.na.t(-1, 64, 49, 16, 0, 16, 0));
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
                da daVar = da.this;
                if (daVar.f44076l0) {
                    BigDecimal n02 = daVar.n0();
                    valueOf = valueOf.multiply(n02);
                    i14 = da.m0(n02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i14) {
                    return spanned.subSequence(i12, i13);
                }
                if (da.v0(sb3).compareTo(valueOf) > 0) {
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
        this.I.setOnEditorActionListener(new h9(this, 1));
        this.I.addTextChangedListener(new i9(this, 1));
        long j3 = this.f44084s;
        if (j3 > 0) {
            ca caVar2 = this.F;
            BigDecimal valueOf = BigDecimal.valueOf(j3, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            caVar2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.I;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.M = new SpannableString("⇅");
        nq nqVar = new nq(2131232817, 0);
        nqVar.f37910x = 0.72f;
        SpannableString spannableString = this.M;
        spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
        this.N = new SpannableString("G");
        nq nqVar2 = new nq(2131232821, 0);
        nqVar2.d = false;
        SpannableString spannableString2 = this.N;
        spannableString2.setSpan(nqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true, true, true);
        this.O = o6Var;
        o6Var.f38082c.m(0.35f, 320L, 3.5f, nr.h);
        this.O.setScaleProperty(0.25f);
        this.O.setText(o0(u0.D(this.currentAccount), 0L));
        org.telegram.ui.Components.o6 o6Var2 = this.O;
        int i10 = org.telegram.ui.ActionBar.m6.f29758z6;
        org.telegram.ui.ActionBar.p6 p10 = org.telegram.ui.ActionBar.t6.p(i7, i10);
        org.telegram.ui.ActionBar.t6.m(o6Var2, p10.f29861a, p10.f29862b, 4, 0.0f, getResourceProvider());
        this.O.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.O.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        this.O.setGravity(17);
        this.O.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.O.setAllowCancel(true);
        int r12 = org.telegram.ui.ActionBar.m6.r1(0.08f, getThemedColor(i10));
        org.telegram.ui.Components.o6 o6Var3 = this.O;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(14.0f), r12);
        this.G = d02;
        o6Var3.setSizeableBackground(d02);
        this.f44091x.addView(this.O, c8.na.t(-2, 28, 49, 0, 8, 0, 0));
        c8.sa.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final da f44603b;

            {
                this.f44603b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f44603b.u0();
                        return;
                    case 1:
                        da.e0(this.f44603b);
                        return;
                    case 2:
                        da daVar = this.f44603b;
                        BigDecimal n02 = daVar.n0();
                        if (daVar.f44076l0 || n02.signum() > 0) {
                            long p02 = daVar.p0();
                            daVar.f44076l0 = !daVar.f44076l0;
                            daVar.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (daVar.f44076l0) {
                                q02 = daVar.l0(p02, n02);
                            } else {
                                q02 = da.q0(p02);
                            }
                            daVar.F.setAmountText(q02);
                            daVar.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        da.d0(this.f44603b);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f44093y = frameLayout2;
        this.f44091x.addView(frameLayout2, c8.na.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        this.f44093y.addView(this.E, c8.na.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.P;
        int i11 = org.telegram.ui.ActionBar.m6.Fi;
        org.telegram.ui.ActionBar.t6.U(textView2, i11, getResourceProvider());
        org.telegram.ui.ActionBar.t6.Q(this.P, org.telegram.ui.ActionBar.m6.b0(org.telegram.ui.ActionBar.m6.r1(0.1f, getThemedColor(i11)), org.telegram.ui.ActionBar.m6.r1(0.25f, getThemedColor(i11)), 14, 14), org.telegram.ui.ActionBar.t6.K(0.1f, i11), org.telegram.ui.ActionBar.t6.K(0.25f, i11), getResourceProvider());
        this.P.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.P.setGravity(17);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.N0(2131742893, null));
        spannableStringBuilder.append((CharSequence) " >");
        nq nqVar3 = new nq(2131232699, 0);
        float N = org.telegram.messenger.g0.N(0.66f);
        nqVar3.f37907r = 0.0f;
        nqVar3.f37908s = N;
        spannableStringBuilder.setSpan(nqVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.P.setText(spannableStringBuilder);
        this.f44093y.addView(this.P, c8.na.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        c8.sa.a(this.P);
        this.P.setOnClickListener(new View.OnClickListener(this) {
            public final da f44603b;

            {
                this.f44603b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f44603b.u0();
                        return;
                    case 1:
                        da.e0(this.f44603b);
                        return;
                    case 2:
                        da daVar = this.f44603b;
                        BigDecimal n02 = daVar.n0();
                        if (daVar.f44076l0 || n02.signum() > 0) {
                            long p02 = daVar.p0();
                            daVar.f44076l0 = !daVar.f44076l0;
                            daVar.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (daVar.f44076l0) {
                                q02 = daVar.l0(p02, n02);
                            } else {
                                q02 = da.q0(p02);
                            }
                            daVar.F.setAmountText(q02);
                            daVar.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        da.d0(this.f44603b);
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
        org.telegram.ui.ActionBar.u4 u4Var = new org.telegram.ui.ActionBar.u4(0, true, false, null);
        u4Var.f30067x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = u4Var.f30049c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i12 = org.telegram.ui.ActionBar.m6.bm;
        paint.setColor(getThemedColor(i12));
        u4Var.f30066w = Integer.valueOf(getThemedColor(i12));
        this.Q.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        this.Q.setBackground(u4Var);
        this.H = u4Var;
        this.Q.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(this.Q, i10, getResourceProvider());
        this.Q.setTypeface(org.telegram.messenger.g0.o());
        this.Q.setEllipsize(TextUtils.TruncateAt.END);
        this.Q.setMaxLines(4);
        if (TextUtils.isEmpty(this.f44072h0)) {
            this.Q.setVisibility(8);
        } else {
            this.Q.setText(this.f44072h0);
            this.Q.setVisibility(0);
        }
        this.E.addView(this.Q, c8.na.t(-2, -2, 49, 32, 12, 32, 0));
        this.Q.setOnClickListener(new View.OnClickListener(this) {
            public final da f44603b;

            {
                this.f44603b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f44603b.u0();
                        return;
                    case 1:
                        da.e0(this.f44603b);
                        return;
                    case 2:
                        da daVar = this.f44603b;
                        BigDecimal n02 = daVar.n0();
                        if (daVar.f44076l0 || n02.signum() > 0) {
                            long p02 = daVar.p0();
                            daVar.f44076l0 = !daVar.f44076l0;
                            daVar.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (daVar.f44076l0) {
                                q02 = daVar.l0(p02, n02);
                            } else {
                                q02 = da.q0(p02);
                            }
                            daVar.F.setAmountText(q02);
                            daVar.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        da.d0(this.f44603b);
                        return;
                }
            }
        });
        c8.sa.b(this.Q, 0.02f, 1.2f);
        E0();
        m80 m80Var = new m80(context, this.resourceProvider);
        this.R = m80Var;
        org.telegram.ui.ActionBar.t6.U(m80Var, org.telegram.ui.ActionBar.m6.f29588q7, getResourceProvider());
        org.telegram.ui.ActionBar.t6.G(this.R, i11, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.R.setTypeface(org.telegram.messenger.g0.o());
        this.R.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        B0(false);
        this.E.addView(this.R, c8.na.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f44063a0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f44063a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        this.f44063a0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, getThemedColor(i7)), getThemedColor(i7), getThemedColor(i7)}));
        TextView textView3 = new TextView(context);
        this.S = textView3;
        org.telegram.ui.ActionBar.t6.U(textView3, i10, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.f44063a0.addView(this.S, c8.na.t(-1, -2, 55, 16, 0, 16, 0));
        this.T = new SpannableString(">");
        nq nqVar4 = new nq(2131232699, 0);
        nqVar4.f37907r = 0.0f;
        nqVar4.f37908s = org.telegram.messenger.g0.L(1.0f);
        SpannableString spannableString3 = this.T;
        spannableString3.setSpan(nqVar4, 0, spannableString3.length(), 33);
        org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2(10, context, this);
        this.U = n2Var;
        org.telegram.ui.ActionBar.t6.U(n2Var, i10, getResourceProvider());
        this.U.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        this.U.setVisibility(8);
        this.f44063a0.addView(this.U, c8.na.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(hd.N0(2131748586, null));
        this.V = spannableString4;
        spannableString4.setSpan(new r80(org.telegram.messenger.g0.L(80.0f), this.U), 0, this.V.length(), 33);
        hi.d dVar = new hi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f44068e0 = dVar;
        dVar.setText(hd.N0(2131742756, null));
        this.f44068e0.setEnabled(false);
        this.f44068e0.setOnClickListener(new View.OnClickListener(this) {
            public final da f44603b;

            {
                this.f44603b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f44603b.u0();
                        return;
                    case 1:
                        da.e0(this.f44603b);
                        return;
                    case 2:
                        da daVar = this.f44603b;
                        BigDecimal n02 = daVar.n0();
                        if (daVar.f44076l0 || n02.signum() > 0) {
                            long p02 = daVar.p0();
                            daVar.f44076l0 = !daVar.f44076l0;
                            daVar.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (daVar.f44076l0) {
                                q02 = daVar.l0(p02, n02);
                            } else {
                                q02 = da.q0(p02);
                            }
                            daVar.F.setAmountText(q02);
                            daVar.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        da.d0(this.f44603b);
                        return;
                }
            }
        });
        this.f44063a0.addView(this.f44068e0, c8.na.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.f44063a0, c8.na.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ls.f25260d4) {
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
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.m6.r1(0.08f, getThemedColor(org.telegram.ui.ActionBar.m6.f29758z6)));
                this.G.invalidateSelf();
                org.telegram.ui.Components.o6 o6Var = this.O;
                if (o6Var != null) {
                    o6Var.invalidate();
                }
            }
            if (this.H != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.bm);
                this.H.f30049c.setColor(themedColor);
                this.H.f30066w = Integer.valueOf(themedColor);
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
        ca caVar = this.F;
        if (caVar != null) {
            caVar.getDiamondView().l(null);
        }
        r1.g gVar = this.f44064b0;
        if (gVar != null) {
            gVar.d();
        }
        this.f44065c0 = 1.0f;
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
        } else if (TextUtils.equals(u0.D(this.currentAccount).h.g(), "USD")) {
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
        g gVar = u0.D(this.currentAccount).h;
        gVar.f();
        double h = gVar.h();
        double d = ((org.telegram.messenger.i0) np.u1(this.currentAccount).A7.f26195l.f15680b).f24529a;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    public final SpannableStringBuilder o0(u0 u0Var, long j3) {
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(u0Var.r(j3, false));
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
        ca caVar;
        View view2;
        if (!z10 && this.f44087u0 != null && (wallettransaction = this.f44083r0) != null && wallettransaction.localMessageId != 0 && (caVar = this.F) != null) {
            m7 diamondView = caVar.getDiamondView();
            if (diamondView.f44587f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                e7 e7Var = new e7(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.f44087u0, this.f44083r0, runnable, null);
                this.f44088v0 = e7Var;
                return e7Var.f44134m;
            }
        }
        if (!z10 && this.f44085s0 != null && this.f44083r0 != null && this.F != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            ra raVar = new ra(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.f44085s0, this.f44083r0, runnable, null);
            this.f44086t0 = raVar;
            return raVar.f44965m;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ls.f25260d4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.J = false;
        k0();
        e7 e7Var = this.f44088v0;
        if (e7Var != null) {
            AnimatorSet animatorSet = e7Var.f44134m;
            if (!e7Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    e7Var.a(false);
                }
            }
            this.f44088v0 = null;
        }
        ra raVar = this.f44086t0;
        if (raVar != null) {
            AnimatorSet animatorSet2 = raVar.f44965m;
            if (!raVar.f44971s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    raVar.b();
                }
            }
            this.f44086t0 = null;
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
        getNotificationCenter().n(this, ls.f25260d4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f44074j0 = i12;
        if (this.f44063a0 != null) {
            int max = Math.max(0, this.f44075k0 - i12);
            this.f44063a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f) + this.f44074j0);
            if (this.f44090w0 != max) {
                this.f44063a0.animate().cancel();
                this.f44063a0.animate().translationY(-max).setDuration(320L).setInterpolator(nr.h).start();
                this.f44090w0 = max;
            }
        }
    }

    @Override
    public final r0.l1 onInsetsInternal(View view, r0.l1 l1Var) {
        this.f44075k0 = l1Var.f56268a.f(8).d;
        return super.onInsetsInternal(view, l1Var);
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.m6.f29347d6);
            LinearLayout linearLayout = this.f44063a0;
            if (linearLayout != null && themedColor != this.f44092x0 && (linearLayout.getBackground() instanceof GradientDrawable)) {
                this.f44092x0 = themedColor;
                ((GradientDrawable) this.f44063a0.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.m6.r1(0.0f, themedColor), themedColor, themedColor});
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
        ca caVar;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (caVar = this.F) != null && this.f44065c0 < 1.0f) {
            caVar.getDiamondView().l(new n9(this, 1));
        }
        if (z10 && !z11 && (editTextBoldCursor = this.I) != null) {
            Runnable runnable = this.K;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.f44084s > 0) {
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
            if (this.f44076l0) {
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
        TL_wallet.walletUserAddress walletuseraddress = this.f44067e;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f44067e.public_key;
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
        g gVar = u0.D(this.currentAccount).h;
        TL_wallet.currencyRates f10 = gVar.f();
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
            if (currencyrate2 != null && TextUtils.equals(currencyrate2.currency, gVar.g())) {
                return currencyrate2;
            }
        }
        return null;
    }

    public final void t0() {
        byte[] bArr;
        if (WalletEngine2.isValidRecipientAddress(this.h)) {
            this.f44070f0 = -1L;
            D0();
            u0 D = u0.D(this.currentAccount);
            if (D.M() && !u0.c(D.y(), this.h) && this.f44069f != null && TextUtils.isEmpty(this.f44077n)) {
                return;
            }
            String str = this.h;
            String str2 = this.f44072h0;
            if (this.f44073i0) {
                bArr = r0();
            } else {
                bArr = null;
            }
            D.m(str, 0L, str2, bArr, new p9(this, 1));
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
            if (this.f44075k0 - this.f44074j0 > org.telegram.messenger.g0.L(20.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, getResourceProvider());
            } else {
                alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, getResourceProvider());
            }
            String N0 = hd.N0(2131742961, null);
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
            t1Var.S = N0;
            final kg.a1 a1Var = new kg.a1(this, parentActivity);
            a1Var.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.t6.U(a1Var, org.telegram.ui.ActionBar.m6.f29455j5, getResourceProvider());
            org.telegram.ui.ActionBar.t6.D(a1Var, org.telegram.ui.ActionBar.m6.f29643t5, getResourceProvider());
            a1Var.setHint(hd.N0(2131742925, null));
            a1Var.setText(this.f44072h0);
            a1Var.setSelection(a1Var.length());
            a1Var.setInputType(147457);
            int i10 = 5;
            a1Var.setMaxLines(5);
            a1Var.setImeOptions(6);
            org.telegram.ui.ActionBar.t6.F(a1Var, org.telegram.ui.ActionBar.m6.f29476k6, org.telegram.ui.ActionBar.m6.f29494l6, org.telegram.ui.ActionBar.m6.f29568p7, getResourceProvider());
            a1Var.setBackground(null);
            a1Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
            org.telegram.ui.Cells.d2 d2Var = new org.telegram.ui.Cells.d2(1, parentActivity, getResourceProvider());
            int i11 = org.telegram.ui.ActionBar.m6.f29439i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, this.resourceProvider), 7, org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            org.telegram.ui.ActionBar.h6 h6Var = this.resourceProvider;
            d2Var.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(d2Var, h02, null, M, h6Var);
            String N02 = hd.N0(2131742832, null);
            if (this.f44073i0 && r0() != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            d2Var.e(N02, "", z11, false, false);
            d2Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d2Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (!hd.f24408a0) {
                i10 = 3;
            }
            layoutParams.gravity = i10 | 16;
            d2Var.getCheckBoxView().setLayoutParams(layoutParams);
            if (hd.f24408a0) {
                i7 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i7 = 0;
            }
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (hd.f24408a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            d2Var.setPadding(i7, L2, L, org.telegram.messenger.g0.L(12.0f));
            if (r0() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            d2Var.setEnabled(z12);
            d2Var.setOnClickListener(new o3(d2Var, 6));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(a1Var, c8.na.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(d2Var, c8.na.t(-1, -2, 83, 8, 0, 8, 0));
            t1Var.H = 6;
            alertDialog$Builder.o(linearLayout);
            t1Var.f29976a = org.telegram.messenger.g0.L(292.0f);
            alertDialog$Builder.h(hd.N0(2131752577, null), new l60(20));
            alertDialog$Builder.k(hd.N0(2131754483, null), new x8(this, a1Var, d2Var, 2));
            t1Var.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    kg.a1 a1Var2 = kg.a1.this;
                    a1Var2.requestFocus();
                    org.telegram.messenger.g0.I3(a1Var2);
                }
            });
            t1Var.setOnDismissListener(new q2(this, 2));
            if (z10) {
                t1Var.r(250L);
            } else {
                t1Var.show();
            }
            t1Var.f30001k0 = false;
            View d = t1Var.d(-1);
            if ((d instanceof TextView) && !TextUtils.isEmpty(this.f44072h0)) {
                a1Var.addTextChangedListener(new bi.y5(a1Var, (TextView) d));
            }
        }
    }

    public final void w0() {
        org.telegram.ui.ActionBar.r4 parentLayout = getParentLayout();
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
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                if (g2Var instanceof na) {
                    ((ActionBarLayout) parentLayout).d0(g2Var, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (p5.c.h(2, fragmentStack) instanceof n6) && ((org.telegram.ui.ActionBar.g2) p5.c.h(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.f44085s0 = (n6) p5.c.h(2, fragmentStack);
            } else {
                n6 n6Var = new n6();
                n6Var.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, n6Var)) {
                    this.f44085s0 = n6Var;
                }
            }
            finishFragment();
        }
    }

    public final void x0() {
        this.f44071g0 = true;
    }

    public final void y0(float f10) {
        int i7;
        this.Y = f10;
        this.U.setAlpha(f10);
        org.telegram.ui.ActionBar.n2 n2Var = this.U;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        n2Var.setVisibility(i7);
        ((LinearLayout.LayoutParams) this.U.getLayoutParams()).topMargin = Math.round(org.telegram.messenger.g0.L(4.0f) * f10);
        this.U.requestLayout();
    }

    public da(String str) {
        this(k10.f24932t0, str);
    }

    public da(int i7, String str) {
        this.f44084s = 0L;
        this.K = new n9(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                da daVar = da.this;
                Runnable runnable = daVar.K;
                if (z10 && daVar.J && (editTextBoldCursor = daVar.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    daVar.I.post(runnable);
                }
            }
        };
        this.f44070f0 = -1L;
        this.f44073i0 = true;
        this.f44080p0 = 6;
        setCurrentAccount(i7);
        this.f44069f = null;
        this.h = str;
        t0();
        this.f44082r = true;
        u0.D(this.currentAccount).i0(new p9(this, 0), str);
    }

    @Override
    public final void Z(ArrayList arrayList, c51 c51Var) {
    }

    @Override
    public final void b0(o41 o41Var, View view) {
    }
}

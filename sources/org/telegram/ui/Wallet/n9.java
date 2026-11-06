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
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xq;
import org.telegram.ui.an;
import org.telegram.ui.go0;
import org.telegram.ui.nt0;
import org.telegram.ui.tb0;
public final class n9 extends n41 implements ls {
    public LinearLayout D;
    public m9 E;
    public ShapeDrawable F;
    public org.telegram.ui.ActionBar.t4 G;
    public EditTextBoldCursor H;
    public boolean I;
    public final Runnable J;
    public final ViewTreeObserver.OnWindowFocusChangeListener K;
    public SpannableString L;
    public SpannableString M;
    public org.telegram.ui.Components.j6 N;
    public TextView O;
    public TextView P;
    public w70 Q;
    public TextView R;
    public SpannableString S;
    public org.telegram.ui.ActionBar.m2 T;
    public SpannableString U;
    public boolean V;
    public boolean W;
    public float X;
    public ValueAnimator Y;
    public LinearLayout Z;
    public r1.g f42844a0;
    public float f42845b0;
    public float f42846c0;
    public fi.d f42847d0;
    public TL_wallet.walletUserAddress f42848e;
    public long f42849e0;
    public TLRPC.User f42850f;
    public boolean f42851f0;
    public String f42852g0;
    public String h;
    public boolean f42853h0;
    public int f42854i0;
    public int f42855j0;
    public boolean f42856k0;
    public boolean f42857l0;
    public DecimalFormat m0;
    public String f42858n;
    public DecimalFormat f42859n0;
    public int f42860o0;
    public boolean f42861p0;
    public TL_wallet.walletTransaction f42862q0;
    public boolean f42863r;
    public y5 f42864r0;
    public long f42865s;
    public ba f42866s0;
    public an f42867t0;
    public o6 f42868u0;
    public int f42869v0;
    public r8 f42870w;
    public int f42871w0;
    public fi.a5 f42872x;
    public FrameLayout f42873y;

    public n9(TLRPC.User user) {
        this.f42865s = 0L;
        this.J = new x8(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z9) {
                EditTextBoldCursor editTextBoldCursor;
                n9 n9Var = n9.this;
                Runnable runnable = n9Var.J;
                if (z9 && n9Var.I && (editTextBoldCursor = n9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    n9Var.H.post(runnable);
                }
            }
        };
        this.f42849e0 = -1L;
        this.f42853h0 = true;
        this.f42860o0 = 6;
        this.f42850f = user;
        this.h = null;
        this.f42863r = true;
        n0.x(this.currentAccount).a0(user, new z8(this, 2));
    }

    public static void d0(n9 n9Var) {
        y5.J0(n9Var.currentAccount, n9Var.getParentActivity(), n9Var.getResourceProvider());
    }

    public static void e0(n9 n9Var) {
        String q02;
        fi.d dVar = n9Var.f42847d0;
        if (dVar.f11752c0 && !dVar.Q) {
            final n0 x10 = n0.x(n9Var.currentAccount);
            long p02 = n9Var.p0();
            long v = x10.v();
            if (!n9Var.f42863r && WalletEngine2.isValidRecipientAddress(n9Var.h) && p02 > 0) {
                long j3 = ((org.telegram.messenger.l0) qp.s1(n9Var.currentAccount).f24935x7.f24446l0.f13889b).f23813c;
                byte[] bArr = null;
                if (p02 < j3) {
                    if (n9Var.f42856k0) {
                        q02 = n9Var.l0(j3, n9Var.n0());
                    } else {
                        q02 = q0(j3);
                    }
                    n9Var.E.setAmountText(q02);
                    n9Var.H.setSelection(q02.length());
                    EditTextBoldCursor editTextBoldCursor = n9Var.H;
                    int i7 = -n9Var.f42860o0;
                    n9Var.f42860o0 = i7;
                    org.telegram.messenger.g0.G3(i7, editTextBoldCursor, null);
                } else if (p02 > v) {
                    org.telegram.messenger.p2.APP_ERROR.a();
                    w70 w70Var = n9Var.Q;
                    int i10 = -n9Var.f42860o0;
                    n9Var.f42860o0 = i10;
                    org.telegram.messenger.g0.G3(i10, w70Var, null);
                } else {
                    long j10 = n9Var.f42849e0;
                    if (j10 >= 0 && p02 + j10 > v) {
                        p02 -= j10;
                    }
                    boolean z9 = false;
                    n9Var.I = false;
                    EditTextBoldCursor editTextBoldCursor2 = n9Var.H;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(n9Var.J);
                        n9Var.fragmentView.requestFocus();
                        org.telegram.messenger.g0.v1(n9Var.H);
                    }
                    n9Var.f42847d0.setLoading(true);
                    n9Var.f42862q0 = null;
                    if (n9Var.f42850f != null && TextUtils.isEmpty(n9Var.f42858n)) {
                        n9Var.f42861p0 = true;
                        TLRPC.User user = n9Var.f42850f;
                        long j11 = p02;
                        String str = n9Var.h;
                        String str2 = n9Var.f42852g0;
                        if (n9Var.f42853h0) {
                            bArr = n9Var.r0();
                        }
                        x10.d0(user, str, j11, str2, bArr, null, null, new b9(n9Var, 0), new b9(n9Var, 1), null);
                        return;
                    }
                    final String str3 = n9Var.f42852g0;
                    if (n9Var.f42853h0) {
                        bArr = n9Var.r0();
                    }
                    if (bArr != null) {
                        z9 = true;
                    }
                    if (x10.F()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = n0.g(n9Var.f42850f, n9Var.h, n9Var.f42858n);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z9;
                        wallettransaction.date = n9Var.getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, n9Var.f42849e0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = p02;
                        org.telegram.messenger.g0.v1(n9Var.H);
                        y5.G0(n9Var.getParentActivity(), n9Var.getCurrentAccount(), wallettransaction, new c9(n9Var, x10, p02, 0), new z8(n9Var, 3), n9Var.r0(), null, n9Var.getResourceProvider());
                        org.telegram.messenger.g0.i3(new x8(n9Var, 2), 1000L);
                        return;
                    }
                    final long j12 = p02;
                    final boolean z10 = z9;
                    x10.i(n9Var.h, j12, str3, bArr, new v10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            String str4 = (String) obj2;
                            n9 n9Var2 = n9.this;
                            if (str4 != null) {
                                n9Var2.f42847d0.setLoading(false);
                                hc.a0(n9Var2).e0(str4, false);
                                return;
                            }
                            wallettransaction2.peer = n0.g(n9Var2.f42850f, n9Var2.h, n9Var2.f42858n);
                            wallettransaction2.comment = str3;
                            wallettransaction2.comment_encrypted = z10;
                            wallettransaction2.date = n9Var2.getConnectionsManager().getCurrentTime();
                            org.telegram.messenger.g0.v1(n9Var2.H);
                            y5.G0(n9Var2.getParentActivity(), n9Var2.getCurrentAccount(), wallettransaction2, new c9(n9Var2, x10, j12, 1), new z8(n9Var2, 4), n9Var2.r0(), null, n9Var2.getResourceProvider());
                            org.telegram.messenger.g0.i3(new x8(n9Var2, 3), 1000L);
                        }
                    });
                }
            }
        }
    }

    public static void f0(n9 n9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            n9Var.f42861p0 = false;
            n9Var.f42847d0.setLoading(false);
        } else if (str != null) {
            n9Var.f42861p0 = false;
            n9Var.f42847d0.setLoading(false);
            hc.a0(n9Var).e0(str, false);
        } else if (n9Var.f42851f0) {
            org.telegram.ui.ActionBar.q4 parentLayout = n9Var.getParentLayout();
            if (parentLayout == null) {
                n9Var.finishFragment();
                return;
            }
            long j3 = n9Var.f42850f.f27102id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && jg.g.i(1, arrayList) == n9Var) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) arrayList.get(size);
                    if ((f2Var instanceof an) && f2Var.getCurrentAccount() == n9Var.currentAccount) {
                        an anVar = (an) f2Var;
                        if (anVar.a() == j3 && anVar.f43790f4 == 0) {
                            n9Var.f42867t0 = anVar;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.f2) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (n9Var.f42867t0 == null) {
                    n9Var.getNotificationCenter().k(qs.v, Long.valueOf(j3), Boolean.FALSE);
                    an ra2 = an.ra(j3);
                    ra2.setCurrentAccount(n9Var.currentAccount);
                    if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ra2)) {
                        n9Var.finishFragment();
                        return;
                    }
                    n9Var.f42867t0 = ra2;
                }
                n9Var.finishFragment();
            }
        } else {
            n9Var.w0();
        }
    }

    public static void g0(n9 n9Var, TL_wallet.walletUserAddress walletuseraddress) {
        n9Var.f42863r = false;
        n9Var.f42848e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            n9Var.f42850f = qp.s1(n9Var.currentAccount).a2(Long.valueOf(walletuseraddress.user_id));
        }
        fi.w3 w3Var = n9Var.f36227a;
        if (w3Var != null) {
            w3Var.f37160f3.O(true);
        }
        n9Var.C0();
        r8 r8Var = n9Var.f42870w;
        if (r8Var != null) {
            r8Var.a(n9Var.h, n9Var.f42850f);
        }
    }

    public static int i0(n9 n9Var) {
        return n9Var.currentAccount;
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
        this.f42858n = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(hd.M0(2131743017, null));
        }
    }

    public final void B0(boolean z9) {
        float f10;
        float f11 = 0.0f;
        if (z9) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) hd.M0(2131743085, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) hd.M0(2131743138, null));
            spannableStringBuilder.append((CharSequence) " >");
            wp wpVar = new wp(2131232697, 0);
            float N = org.telegram.messenger.g0.N(0.66f);
            wpVar.f40070r = 0.0f;
            wpVar.f40071s = N;
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new fi.ka(this, 9), length, spannableStringBuilder.length(), 33);
            this.Q.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = this.Q.animate();
        float f12 = 1.0f;
        if (z9) {
            f11 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f11);
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (!z9) {
            f12 = 0.6f;
        }
        scaleX.scaleY(f12).setDuration(320L).setInterpolator(xq.h).start();
    }

    public final void C0() {
        boolean z9;
        boolean z10;
        String str;
        boolean z11;
        CharSequence V;
        String q02;
        E0();
        if (this.H != null && this.f42847d0 != null) {
            n0 x10 = n0.x(this.currentAccount);
            long v = x10.v();
            long p02 = p0();
            long j3 = ((org.telegram.messenger.l0) qp.s1(this.currentAccount).f24935x7.f24446l0.f13889b).f23813c;
            int i7 = (p02 > 0L ? 1 : (p02 == 0L ? 0 : -1));
            if (i7 > 0 && p02 < j3) {
                if (this.f42856k0) {
                    q02 = l0(j3, n0());
                } else {
                    q02 = q0(j3);
                }
                this.E.setAmountText(q02);
                this.H.setSelection(q02.length());
                EditTextBoldCursor editTextBoldCursor = this.H;
                int i10 = -this.f42860o0;
                this.f42860o0 = i10;
                org.telegram.messenger.g0.G3(i10, editTextBoldCursor, null);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.h) && !this.f42863r && i7 > 0 && p02 <= v) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!TextUtils.isEmpty(this.H.getText()) && p02 > v) {
                z10 = true;
            } else {
                z10 = false;
            }
            B0(z10);
            long p03 = p0();
            if (this.m0 == null) {
                this.m0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            }
            if (p03 > 0) {
                str = this.m0.format(BigDecimal.valueOf(p03, 9));
            } else {
                str = "";
            }
            fi.d dVar = this.f42847d0;
            if (!this.f42863r && !this.f42861p0) {
                z11 = false;
            } else {
                z11 = true;
            }
            dVar.setLoading(z11);
            fi.d dVar2 = this.f42847d0;
            if (TextUtils.isEmpty(str)) {
                V = hd.M0(2131743021, null);
            } else {
                V = hd.V(null, null, 2131743022, n0.l("Grams", str, 2131749506));
            }
            dVar2.i(V, true, true);
            this.f42847d0.setEnabled(z9);
            D0();
            F0();
            if (this.f42856k0) {
                org.telegram.ui.Components.j6 j6Var = this.N;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.M).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.f42859n0 == null) {
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.f42859n0 = decimalFormat;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.f42859n0.format(BigDecimal.valueOf(p02).movePointLeft(9)));
                z0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) hd.M0(2131749515, null));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                j6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L));
                return;
            }
            this.N.setText(o0(x10, p02));
        }
    }

    public final void D0() {
        boolean z9;
        boolean z10;
        float f10;
        if (this.R != null) {
            n0 x10 = n0.x(this.currentAccount);
            this.R.setText(hd.V(null, null, 2131743186, n0.l("Grams", n0.p(x10.v(), false), 2131749506)));
            boolean z11 = this.W;
            EditTextBoldCursor editTextBoldCursor = this.H;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.W = z11 | z9;
            if ((!x10.F() || n0.b(x10.t(), this.h)) && this.W) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                long j3 = this.f42849e0;
                if (j3 >= 0) {
                    this.T.setText(hd.V(null, null, 2131743073, n0.s(j3, false)));
                } else {
                    this.T.setText(hd.V(null, null, 2131743073, this.U));
                }
            }
            if (this.V == z10) {
                return;
            }
            this.V = z10;
            ValueAnimator valueAnimator = this.Y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Y = null;
            }
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (!this.T.isAttachedToWindow()) {
                y0(f10);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X, f10);
            this.Y = ofFloat;
            ofFloat.setDuration(320L);
            this.Y.setInterpolator(xq.h);
            this.Y.addUpdateListener(new r3(this, 8));
            this.Y.start();
        }
    }

    public final void E0() {
        final boolean z9;
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.D != null && this.O != null) {
            if (p0() <= 0 && this.P.getVisibility() != 0) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9 != this.f42857l0) {
                this.f42857l0 = z9;
                this.D.setVisibility(0);
                this.O.setVisibility(0);
                ViewPropertyAnimator animate = this.D.animate();
                float f14 = 0.0f;
                float f15 = 1.0f;
                if (z9) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (z9) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.8f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (z9) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.8f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).withEndAction(new Runnable(this) {
                    public final n9 f42433b;

                    {
                        this.f42433b = this;
                    }

                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f42433b.D;
                                if (z9) {
                                    i7 = 0;
                                } else {
                                    i7 = 4;
                                }
                                linearLayout.setVisibility(i7);
                                return;
                            default:
                                TextView textView = this.f42433b.O;
                                if (!z9) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                textView.setVisibility(i10);
                                return;
                        }
                    }
                }).setDuration(320L);
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
                ViewPropertyAnimator animate2 = this.O.animate();
                if (!z9) {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (!z9) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.8f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (z9) {
                    f15 = 0.8f;
                }
                scaleX2.scaleY(f15).withEndAction(new Runnable(this) {
                    public final n9 f42433b;

                    {
                        this.f42433b = this;
                    }

                    @Override
                    public final void run() {
                        int i7;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f42433b.D;
                                if (z9) {
                                    i7 = 0;
                                } else {
                                    i7 = 4;
                                }
                                linearLayout.setVisibility(i7);
                                return;
                            default:
                                TextView textView = this.f42433b.O;
                                if (!z9) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                textView.setVisibility(i10);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(xqVar).start();
            }
        }
    }

    public final void F0() {
        this.E.d(n0.x(this.currentAccount), this.f42856k0);
    }

    public final void G0() {
        boolean z9;
        float f10 = this.f42845b0;
        float f11 = 1.0f - f10;
        float max = Math.max(this.f42846c0, Math.max(0.0f, Math.min(1.0f, f10)));
        this.f42846c0 = max;
        float f12 = 1.0f - max;
        m9 m9Var = this.E;
        float f13 = this.f42845b0;
        if (this.f42844a0 == null && f13 == 1.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        m9Var.e(f13, max, z9);
        this.E.setTranslationY((((this.f42872x.getHeight() / 2.0f) - this.E.getTop()) - (this.E.getHeight() / 2.0f)) * f11);
        this.N.setAlpha(this.f42846c0);
        this.N.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.f42873y.setAlpha(this.f42846c0);
        this.f42873y.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.Z.setAlpha(this.f42846c0);
        for (int i7 = 0; i7 < this.Z.getChildCount(); i7++) {
            this.Z.getChildAt(i7).setTranslationY(org.telegram.messenger.g0.L(24.0f) * f12);
        }
    }

    @Override
    public final CharSequence a0() {
        return hd.M0(2131743017, null);
    }

    @Override
    public final boolean c0(x31 x31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.f36227a.setVisibility(8);
        View view = this.fragmentView;
        int i7 = org.telegram.ui.ActionBar.k6.f27849d6;
        org.telegram.ui.ActionBar.r6.i(i7, view, getResourceProvider());
        org.telegram.ui.ActionBar.r6.i(i7, this.actionBar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.r0 a10 = this.actionBar.q().a(1, 2131231244);
        a10.setContentDescription(hd.M0(2131754839, null));
        a10.e(2, 2131232044, hd.M0(2131743138, null));
        a10.e(3, 2131231778, hd.M0(2131743206, null));
        this.actionBar.setActionBarMenuOnItemClick(new nt0(this, 20));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        r8 r8Var = new r8(context, new x8(this, 5), new x8(this, 6), this.resourceProvider);
        this.f42870w = r8Var;
        frameLayout.addView(r8Var, c8.ha.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        r8 r8Var2 = this.f42870w;
        if (r8Var2 != null) {
            r8Var2.a(this.h, this.f42850f);
        }
        fi.a5 a5Var = new fi.a5(this, context);
        this.f42872x = a5Var;
        a5Var.setOrientation(1);
        this.f42872x.setClipChildren(false);
        this.f42872x.setClipToPadding(false);
        frameLayout.addView(this.f42872x, c8.ha.e(-1, -2, 17));
        m9 m9Var = new m9(context, getResourceProvider());
        this.E = m9Var;
        if (m9Var.getDiamondView().f43294f == null) {
            this.f42846c0 = 1.0f;
            this.f42845b0 = 1.0f;
        }
        this.f42872x.addView(this.E, c8.ha.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.E.getEditText();
        this.H = editText;
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
                n9 n9Var = n9.this;
                if (n9Var.f42856k0) {
                    BigDecimal n02 = n9Var.n0();
                    valueOf = valueOf.multiply(n02);
                    i14 = n9.m0(n02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i14) {
                    return spanned.subSequence(i12, i13);
                }
                if (n9.v0(sb3).compareTo(valueOf) > 0) {
                    return spanned.subSequence(i12, i13);
                }
                if (i10 != i11) {
                    boolean z9 = false;
                    for (int i15 = 0; i15 < sb3.length(); i15++) {
                        char charAt = sb3.charAt(i15);
                        if (charAt == '.' || charAt == ',') {
                            if (z9) {
                                return spanned.subSequence(i12, i13);
                            }
                            z9 = true;
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
        this.H.setImeOptions(33554438);
        this.H.setOnEditorActionListener(new s8(this, 1));
        this.H.addTextChangedListener(new ah.j(this, 28));
        long j3 = this.f42865s;
        if (j3 > 0) {
            m9 m9Var2 = this.E;
            BigDecimal valueOf = BigDecimal.valueOf(j3, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            m9Var2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.H;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.L = new SpannableString("⇅");
        wp wpVar = new wp(2131232814, 0);
        wpVar.f40073x = 0.72f;
        SpannableString spannableString = this.L;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        this.M = new SpannableString("G");
        wp wpVar2 = new wp(2131232818, 0);
        wpVar2.d = false;
        SpannableString spannableString2 = this.M;
        spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true, true, true);
        this.N = j6Var;
        j6Var.f34898c.m(0.35f, 320L, 3.5f, xq.h);
        this.N.setScaleProperty(0.25f);
        this.N.setText(o0(n0.x(this.currentAccount), 0L));
        org.telegram.ui.Components.j6 j6Var2 = this.N;
        int i10 = org.telegram.ui.ActionBar.k6.f28259z6;
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i7, i10);
        org.telegram.ui.ActionBar.r6.n(j6Var2, q10.f28324a, q10.f28325b, 4, 0.0f, getResourceProvider());
        this.N.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.N.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        this.N.setGravity(17);
        this.N.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.N.setAllowCancel(true);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.08f, getThemedColor(i10));
        org.telegram.ui.Components.j6 j6Var3 = this.N;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(14.0f), r12);
        this.F = d02;
        j6Var3.setSizeableBackground(d02);
        this.f42872x.addView(this.N, c8.ha.t(-2, 28, 49, 0, 8, 0, 0));
        c8.ka.a(this.N);
        this.N.setOnClickListener(new View.OnClickListener(this) {
            public final n9 f43310b;

            {
                this.f43310b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f43310b.u0();
                        return;
                    case 1:
                        n9.e0(this.f43310b);
                        return;
                    case 2:
                        n9 n9Var = this.f43310b;
                        BigDecimal n02 = n9Var.n0();
                        if (n9Var.f42856k0 || n02.signum() > 0) {
                            long p02 = n9Var.p0();
                            n9Var.f42856k0 = !n9Var.f42856k0;
                            n9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (n9Var.f42856k0) {
                                q02 = n9Var.l0(p02, n02);
                            } else {
                                q02 = n9.q0(p02);
                            }
                            n9Var.E.setAmountText(q02);
                            n9Var.H.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        n9.d0(this.f43310b);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f42873y = frameLayout2;
        this.f42872x.addView(frameLayout2, c8.ha.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.D = linearLayout;
        linearLayout.setOrientation(1);
        this.f42873y.addView(this.D, c8.ha.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.O = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.O;
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(textView2, i11, getResourceProvider());
        org.telegram.ui.ActionBar.r6.R(this.O, org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(i11)), org.telegram.ui.ActionBar.k6.r1(0.25f, getThemedColor(i11)), 14, 14), org.telegram.ui.ActionBar.r6.L(0.1f, i11), org.telegram.ui.ActionBar.r6.L(0.25f, i11), getResourceProvider());
        this.O.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.O.setGravity(17);
        this.O.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hd.M0(2131743138, null));
        spannableStringBuilder.append((CharSequence) " >");
        wp wpVar3 = new wp(2131232697, 0);
        float N = org.telegram.messenger.g0.N(0.66f);
        wpVar3.f40070r = 0.0f;
        wpVar3.f40071s = N;
        spannableStringBuilder.setSpan(wpVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        this.f42873y.addView(this.O, c8.ha.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        c8.ka.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final n9 f43310b;

            {
                this.f43310b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f43310b.u0();
                        return;
                    case 1:
                        n9.e0(this.f43310b);
                        return;
                    case 2:
                        n9 n9Var = this.f43310b;
                        BigDecimal n02 = n9Var.n0();
                        if (n9Var.f42856k0 || n02.signum() > 0) {
                            long p02 = n9Var.p0();
                            n9Var.f42856k0 = !n9Var.f42856k0;
                            n9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (n9Var.f42856k0) {
                                q02 = n9Var.l0(p02, n02);
                            } else {
                                q02 = n9.q0(p02);
                            }
                            n9Var.E.setAmountText(q02);
                            n9Var.H.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        n9.d0(this.f43310b);
                        return;
                }
            }
        });
        this.D.setVisibility(4);
        this.D.setAlpha(0.0f);
        this.D.setScaleX(0.8f);
        this.D.setScaleY(0.8f);
        this.O.setVisibility(0);
        this.O.setAlpha(1.0f);
        this.O.setScaleX(1.0f);
        this.O.setScaleY(1.0f);
        this.f42857l0 = false;
        this.P = new TextView(context);
        org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, true, false, null);
        t4Var.f28527x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = t4Var.f28509c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i12 = org.telegram.ui.ActionBar.k6.Yl;
        paint.setColor(getThemedColor(i12));
        t4Var.f28526w = Integer.valueOf(getThemedColor(i12));
        this.P.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        this.P.setBackground(t4Var);
        this.G = t4Var;
        this.P.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(this.P, i10, getResourceProvider());
        this.P.setTypeface(org.telegram.messenger.g0.o());
        this.P.setEllipsize(TextUtils.TruncateAt.END);
        this.P.setMaxLines(4);
        if (TextUtils.isEmpty(this.f42852g0)) {
            this.P.setVisibility(8);
        } else {
            this.P.setText(this.f42852g0);
            this.P.setVisibility(0);
        }
        this.D.addView(this.P, c8.ha.t(-2, -2, 49, 32, 12, 32, 0));
        this.P.setOnClickListener(new View.OnClickListener(this) {
            public final n9 f43310b;

            {
                this.f43310b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f43310b.u0();
                        return;
                    case 1:
                        n9.e0(this.f43310b);
                        return;
                    case 2:
                        n9 n9Var = this.f43310b;
                        BigDecimal n02 = n9Var.n0();
                        if (n9Var.f42856k0 || n02.signum() > 0) {
                            long p02 = n9Var.p0();
                            n9Var.f42856k0 = !n9Var.f42856k0;
                            n9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (n9Var.f42856k0) {
                                q02 = n9Var.l0(p02, n02);
                            } else {
                                q02 = n9.q0(p02);
                            }
                            n9Var.E.setAmountText(q02);
                            n9Var.H.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        n9.d0(this.f43310b);
                        return;
                }
            }
        });
        c8.ka.b(this.P, 0.02f, 1.2f);
        E0();
        w70 w70Var = new w70(context, this.resourceProvider);
        this.Q = w70Var;
        org.telegram.ui.ActionBar.r6.V(w70Var, org.telegram.ui.ActionBar.k6.f28090q7, getResourceProvider());
        org.telegram.ui.ActionBar.r6.H(this.Q, i11, getResourceProvider());
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Q.setTypeface(org.telegram.messenger.g0.o());
        this.Q.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        B0(false);
        this.D.addView(this.Q, c8.ha.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.Z = linearLayout2;
        linearLayout2.setOrientation(1);
        this.Z.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        this.Z.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, getThemedColor(i7)), getThemedColor(i7), getThemedColor(i7)}));
        TextView textView3 = new TextView(context);
        this.R = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i10, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.Z.addView(this.R, c8.ha.t(-1, -2, 55, 16, 0, 16, 0));
        this.S = new SpannableString(">");
        wp wpVar4 = new wp(2131232697, 0);
        wpVar4.f40070r = 0.0f;
        wpVar4.f40071s = org.telegram.messenger.g0.L(1.0f);
        SpannableString spannableString3 = this.S;
        spannableString3.setSpan(wpVar4, 0, spannableString3.length(), 33);
        org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2(10, context, this);
        this.T = m2Var;
        org.telegram.ui.ActionBar.r6.V(m2Var, i10, getResourceProvider());
        this.T.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        this.T.setVisibility(8);
        this.Z.addView(this.T, c8.ha.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(hd.M0(2131748778, null));
        this.U = spannableString4;
        spannableString4.setSpan(new b80(org.telegram.messenger.g0.L(80.0f), this.T), 0, this.U.length(), 33);
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f42847d0 = dVar;
        dVar.setText(hd.M0(2131743021, null));
        this.f42847d0.setEnabled(false);
        this.f42847d0.setOnClickListener(new View.OnClickListener(this) {
            public final n9 f43310b;

            {
                this.f43310b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f43310b.u0();
                        return;
                    case 1:
                        n9.e0(this.f43310b);
                        return;
                    case 2:
                        n9 n9Var = this.f43310b;
                        BigDecimal n02 = n9Var.n0();
                        if (n9Var.f42856k0 || n02.signum() > 0) {
                            long p02 = n9Var.p0();
                            n9Var.f42856k0 = !n9Var.f42856k0;
                            n9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (n9Var.f42856k0) {
                                q02 = n9Var.l0(p02, n02);
                            } else {
                                q02 = n9.q0(p02);
                            }
                            n9Var.E.setAmountText(q02);
                            n9Var.H.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        n9.d0(this.f43310b);
                        return;
                }
            }
        });
        this.Z.addView(this.f42847d0, c8.ha.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.Z, c8.ha.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == qs.f24962a4) {
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
            ShapeDrawable shapeDrawable = this.F;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.k6.r1(0.08f, getThemedColor(org.telegram.ui.ActionBar.k6.f28259z6)));
                this.F.invalidateSelf();
                org.telegram.ui.Components.j6 j6Var = this.N;
                if (j6Var != null) {
                    j6Var.invalidate();
                }
            }
            if (this.G != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Yl);
                this.G.f28509c.setColor(themedColor);
                this.G.f28526w = Integer.valueOf(themedColor);
                this.G.invalidateSelf();
                TextView textView = this.P;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void k0() {
        m9 m9Var = this.E;
        if (m9Var != null) {
            m9Var.getDiamondView().l(null);
        }
        r1.g gVar = this.f42844a0;
        if (gVar != null) {
            gVar.d();
        }
        this.f42845b0 = 1.0f;
        if (this.E != null) {
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
        } else if (TextUtils.equals(n0.x(this.currentAccount).h.g(), "USD")) {
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
        f fVar = n0.x(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.i0) qp.s1(this.currentAccount).f24935x7.f24445l.f14323b).f23010a;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    public final SpannableStringBuilder o0(n0 n0Var, long j3) {
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(n0Var.m(j3, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate s02 = s0();
        if (s02 != null && !TextUtils.isEmpty(s02.decimalSeparator)) {
            c10 = s02.decimalSeparator.charAt(0);
        } else {
            c10 = '.';
        }
        z0(spannableStringBuilder, length, length2, c10);
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L);
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z9, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        m9 m9Var;
        View view2;
        if (!z9 && this.f42867t0 != null && (wallettransaction = this.f42862q0) != null && wallettransaction.localMessageId != 0 && (m9Var = this.E) != null) {
            w6 diamondView = m9Var.getDiamondView();
            if (diamondView.f43294f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                o6 o6Var = new o6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.f42867t0, this.f42862q0, runnable, null);
                this.f42868u0 = o6Var;
                return o6Var.f42917m;
            }
        }
        if (!z9 && this.f42864r0 != null && this.f42862q0 != null && this.E != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            ba baVar = new ba(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.f42864r0, this.f42862q0, runnable, null);
            this.f42866s0 = baVar;
            return baVar.f42190m;
        }
        return super.onCustomTransitionAnimation(z9, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.f24962a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.I = false;
        k0();
        o6 o6Var = this.f42868u0;
        if (o6Var != null) {
            AnimatorSet animatorSet = o6Var.f42917m;
            if (!o6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    o6Var.a(false);
                }
            }
            this.f42868u0 = null;
        }
        ba baVar = this.f42866s0;
        if (baVar != null) {
            AnimatorSet animatorSet2 = baVar.f42190m;
            if (!baVar.f42196s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    baVar.b();
                }
            }
            this.f42866s0 = null;
        }
        ValueAnimator valueAnimator = this.Y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.Y = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.J);
        }
        getNotificationCenter().n(this, qs.f24962a4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f42854i0 = i12;
        if (this.Z != null) {
            int max = Math.max(0, this.f42855j0 - i12);
            this.Z.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f) + this.f42854i0);
            if (this.f42869v0 != max) {
                this.Z.animate().cancel();
                this.Z.animate().translationY(-max).setDuration(320L).setInterpolator(xq.h).start();
                this.f42869v0 = max;
            }
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f42855j0 = k1Var.f54108a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override
    public final void onPause() {
        k0();
        this.I = false;
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.J);
            this.fragmentView.requestFocus();
            org.telegram.messenger.g0.v1(this.H);
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27849d6);
            LinearLayout linearLayout = this.Z;
            if (linearLayout != null && themedColor != this.f42871w0 && (linearLayout.getBackground() instanceof GradientDrawable)) {
                this.f42871w0 = themedColor;
                ((GradientDrawable) this.Z.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, themedColor), themedColor, themedColor});
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z9, z10);
        if (z9 && !z10 && this.I && (editTextBoldCursor = this.H) != null) {
            Runnable runnable = this.J;
            editTextBoldCursor.removeCallbacks(runnable);
            this.H.post(runnable);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z9, boolean z10) {
        EditTextBoldCursor editTextBoldCursor;
        m9 m9Var;
        super.onTransitionAnimationStart(z9, z10);
        if (z9 && !z10 && (m9Var = this.E) != null && this.f42845b0 < 1.0f) {
            m9Var.getDiamondView().l(new x8(this, 1));
        }
        if (z9 && !z10 && (editTextBoldCursor = this.H) != null) {
            Runnable runnable = this.J;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.f42865s > 0) {
                EditTextBoldCursor editTextBoldCursor2 = this.H;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
            }
            this.I = true;
            this.H.requestFocus();
            this.H.post(runnable);
        }
    }

    public final long p0() {
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            BigDecimal v02 = v0(editTextBoldCursor.getText().toString());
            if (this.f42856k0) {
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
        TL_wallet.walletUserAddress walletuseraddress = this.f42848e;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr = this.f42848e.public_key;
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
        f fVar = n0.x(this.currentAccount).h;
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
            this.f42849e0 = -1L;
            D0();
            n0 x10 = n0.x(this.currentAccount);
            if (x10.F() && !n0.b(x10.t(), this.h) && this.f42850f != null && TextUtils.isEmpty(this.f42858n)) {
                return;
            }
            String str = this.h;
            String str2 = this.f42852g0;
            if (this.f42853h0) {
                bArr = r0();
            } else {
                bArr = null;
            }
            x10.i(str, 0L, str2, bArr, new z8(this, 1));
        }
    }

    public final void u0() {
        boolean z9;
        AlertDialog$Builder alertDialog$Builder;
        boolean z10;
        int i7;
        int L;
        boolean z11;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            if (this.f42855j0 - this.f42854i0 > org.telegram.messenger.g0.L(20.0f)) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, getResourceProvider());
            } else {
                alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, getResourceProvider());
            }
            String M0 = hd.M0(2131743206, null);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
            u1Var.R = M0;
            final kg.x0 x0Var = new kg.x0(this, parentActivity);
            x0Var.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.V(x0Var, org.telegram.ui.ActionBar.k6.f27957j5, getResourceProvider());
            org.telegram.ui.ActionBar.r6.E(x0Var, org.telegram.ui.ActionBar.k6.f28145t5, getResourceProvider());
            x0Var.setHint(hd.M0(2131743170, null));
            x0Var.setText(this.f42852g0);
            x0Var.setSelection(x0Var.length());
            x0Var.setInputType(147457);
            int i10 = 5;
            x0Var.setMaxLines(5);
            x0Var.setImeOptions(6);
            org.telegram.ui.ActionBar.r6.G(x0Var, org.telegram.ui.ActionBar.k6.f27978k6, org.telegram.ui.ActionBar.k6.f27996l6, org.telegram.ui.ActionBar.k6.f28070p7, getResourceProvider());
            x0Var.setBackground(null);
            x0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, getResourceProvider());
            int i11 = org.telegram.ui.ActionBar.k6.f27941i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, this.resourceProvider), 7, org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
            c2Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, f6Var);
            String M02 = hd.M0(2131743078, null);
            if (this.f42853h0 && r0() != null) {
                z10 = false;
            } else {
                z10 = true;
            }
            c2Var.e(M02, "", z10, false, false);
            c2Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (!hd.f22878a0) {
                i10 = 3;
            }
            layoutParams.gravity = i10 | 16;
            c2Var.getCheckBoxView().setLayoutParams(layoutParams);
            if (hd.f22878a0) {
                i7 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i7 = 0;
            }
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (hd.f22878a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            c2Var.setPadding(i7, L2, L, org.telegram.messenger.g0.L(12.0f));
            if (r0() != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            c2Var.setEnabled(z11);
            c2Var.setOnClickListener(new j3(c2Var, 6));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(x0Var, c8.ha.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(c2Var, c8.ha.t(-1, -2, 83, 8, 0, 8, 0));
            u1Var.G = 6;
            alertDialog$Builder.o(linearLayout);
            u1Var.f28548a = org.telegram.messenger.g0.L(292.0f);
            alertDialog$Builder.h(hd.M0(2131752589, null), new go0(14));
            alertDialog$Builder.k(hd.M0(2131754486, null), new j8(this, x0Var, c2Var, 2));
            u1Var.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    kg.x0 x0Var2 = kg.x0.this;
                    x0Var2.requestFocus();
                    org.telegram.messenger.g0.K3(x0Var2);
                }
            });
            u1Var.setOnDismissListener(new m2(this, 2));
            if (z9) {
                u1Var.r(250L);
            } else {
                u1Var.show();
            }
            u1Var.f28571j0 = false;
            View d = u1Var.d(-1);
            if ((d instanceof TextView) && !TextUtils.isEmpty(this.f42852g0)) {
                x0Var.addTextChangedListener(new tb0(x0Var, (TextView) d));
            }
        }
    }

    public final void w0() {
        org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (!arrayList.isEmpty() && jg.g.i(1, arrayList) == this) {
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) obj;
                if (f2Var instanceof x9) {
                    ((ActionBarLayout) parentLayout).d0(f2Var, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (rf.b.g(2, fragmentStack) instanceof y5) && ((org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.f42864r0 = (y5) rf.b.g(2, fragmentStack);
            } else {
                y5 y5Var = new y5();
                y5Var.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, y5Var)) {
                    this.f42864r0 = y5Var;
                }
            }
            finishFragment();
        }
    }

    public final void x0() {
        this.f42851f0 = true;
    }

    public final void y0(float f10) {
        int i7;
        this.X = f10;
        this.T.setAlpha(f10);
        org.telegram.ui.ActionBar.m2 m2Var = this.T;
        if (f10 > 0.0f) {
            i7 = 0;
        } else {
            i7 = 8;
        }
        m2Var.setVisibility(i7);
        ((LinearLayout.LayoutParams) this.T.getLayoutParams()).topMargin = Math.round(org.telegram.messenger.g0.L(4.0f) * f10);
        this.T.requestLayout();
    }

    public n9(String str) {
        this(p10.f24467s0, str);
    }

    public n9(int i7, String str) {
        this.f42865s = 0L;
        this.J = new x8(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z9) {
                EditTextBoldCursor editTextBoldCursor;
                n9 n9Var = n9.this;
                Runnable runnable = n9Var.J;
                if (z9 && n9Var.I && (editTextBoldCursor = n9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    n9Var.H.post(runnable);
                }
            }
        };
        this.f42849e0 = -1L;
        this.f42853h0 = true;
        this.f42860o0 = 6;
        setCurrentAccount(i7);
        this.f42850f = null;
        this.h = str;
        t0();
        this.f42863r = true;
        n0.x(this.currentAccount).Z(new z8(this, 0), str);
    }

    @Override
    public final void Z(ArrayList arrayList, l41 l41Var) {
    }

    @Override
    public final void b0(x31 x31Var, View view) {
    }
}

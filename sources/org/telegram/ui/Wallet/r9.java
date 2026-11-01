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
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ii;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.u80;
import org.telegram.ui.pa1;
import org.telegram.ui.un;
import org.telegram.ui.z01;
public final class r9 extends s51 implements vs {
    public LinearLayout D;
    public q9 E;
    public ShapeDrawable F;
    public org.telegram.ui.ActionBar.c5 G;
    public EditTextBoldCursor H;
    public boolean I;
    public final Runnable J;
    public final ViewTreeObserver.OnWindowFocusChangeListener K;
    public SpannableString L;
    public SpannableString M;
    public org.telegram.ui.Components.f6 N;
    public TextView O;
    public TextView P;
    public p80 Q;
    public TextView R;
    public SpannableString S;
    public org.telegram.ui.ActionBar.q2 T;
    public SpannableString U;
    public boolean V;
    public boolean W;
    public float X;
    public ValueAnimator Y;
    public LinearLayout Z;
    public o1.j f35130a0;
    public float f35131b0;
    public float f35132c0;
    public vh.d f35133d0;
    public TL_wallet.walletUserAddress e;
    public long f35134e0;
    public TLRPC.User f35135f;
    public boolean f35136f0;
    public String f35137g0;
    public String h;
    public boolean f35138h0;
    public int f35139i0;
    public int f35140j0;
    public boolean f35141k0;
    public boolean f35142l0;
    public DecimalFormat m0;
    public String f35143n;
    public DecimalFormat f35144n0;
    public int f35145o0;
    public boolean f35146p0;
    public TL_wallet.walletTransaction f35147q0;
    public boolean f35148r;
    public b6 f35149r0;
    public long f35150s;
    public fa f35151s0;
    public un f35152t0;
    public s6 f35153u0;
    public int f35154v0;
    public w8 f35155w;
    public int f35156w0;
    public jg.d0 f35157x;
    public FrameLayout f35158y;

    public r9(TLRPC.User user) {
        this.f35150s = 0L;
        this.J = new c9(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                r9 r9Var = r9.this;
                Runnable runnable = r9Var.J;
                if (z10 && r9Var.I && (editTextBoldCursor = r9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    r9Var.H.post(runnable);
                }
            }
        };
        this.f35134e0 = -1L;
        this.f35138h0 = true;
        this.f35145o0 = 6;
        this.f35135f = user;
        this.h = null;
        this.f35148r = true;
        k0.x(this.currentAccount).a0(user, new e9(this, 2));
    }

    public static void d0(r9 r9Var) {
        b6.J0(r9Var.currentAccount, r9Var.getParentActivity(), r9Var.getResourceProvider());
    }

    public static void e0(r9 r9Var) {
        String q02;
        vh.d dVar = r9Var.f35133d0;
        if (dVar.f51070c0 && !dVar.Q) {
            final k0 x10 = k0.x(r9Var.currentAccount);
            long p02 = r9Var.p0();
            long v = x10.v();
            if (!r9Var.f35148r && WalletEngine2.isValidRecipientAddress(r9Var.h) && p02 > 0) {
                long j10 = wp.r1(r9Var.currentAccount).f19300y7.f18037l0.f17366a.f17238c;
                byte[] bArr = null;
                if (p02 < j10) {
                    if (r9Var.f35141k0) {
                        q02 = r9Var.l0(j10, r9Var.n0());
                    } else {
                        q02 = q0(j10);
                    }
                    r9Var.E.setAmountText(q02);
                    r9Var.H.setSelection(q02.length());
                    EditTextBoldCursor editTextBoldCursor = r9Var.H;
                    int i10 = -r9Var.f35145o0;
                    r9Var.f35145o0 = i10;
                    org.telegram.messenger.i0.F3(i10, editTextBoldCursor, null);
                } else if (p02 > v) {
                    org.telegram.messenger.t2.APP_ERROR.a();
                    p80 p80Var = r9Var.Q;
                    int i11 = -r9Var.f35145o0;
                    r9Var.f35145o0 = i11;
                    org.telegram.messenger.i0.F3(i11, p80Var, null);
                } else {
                    long j11 = r9Var.f35134e0;
                    if (j11 >= 0 && p02 + j11 > v) {
                        p02 -= j11;
                    }
                    boolean z10 = false;
                    r9Var.I = false;
                    EditTextBoldCursor editTextBoldCursor2 = r9Var.H;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(r9Var.J);
                        r9Var.fragmentView.requestFocus();
                        org.telegram.messenger.i0.v1(r9Var.H);
                    }
                    r9Var.f35133d0.setLoading(true);
                    r9Var.f35147q0 = null;
                    if (r9Var.f35135f != null && TextUtils.isEmpty(r9Var.f35143n)) {
                        r9Var.f35146p0 = true;
                        TLRPC.User user = r9Var.f35135f;
                        long j12 = p02;
                        String str = r9Var.h;
                        String str2 = r9Var.f35137g0;
                        if (r9Var.f35138h0) {
                            bArr = r9Var.r0();
                        }
                        x10.d0(user, str, j12, str2, bArr, null, null, new g9(r9Var, 0), new g9(r9Var, 1), null);
                        return;
                    }
                    final String str3 = r9Var.f35137g0;
                    if (r9Var.f35138h0) {
                        bArr = r9Var.r0();
                    }
                    if (bArr != null) {
                        z10 = true;
                    }
                    if (x10.F()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = k0.g(r9Var.f35135f, r9Var.h, r9Var.f35143n);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z10;
                        wallettransaction.date = r9Var.getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, r9Var.f35134e0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = p02;
                        org.telegram.messenger.i0.v1(r9Var.H);
                        b6.G0(r9Var.getParentActivity(), r9Var.getCurrentAccount(), wallettransaction, new h9(r9Var, x10, p02, 0), new e9(r9Var, 3), r9Var.r0(), null, r9Var.getResourceProvider());
                        org.telegram.messenger.i0.h3(new c9(r9Var, 2), 1000L);
                        return;
                    }
                    final long j13 = p02;
                    final boolean z11 = z10;
                    x10.i(r9Var.h, j13, str3, bArr, new k20() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            String str4 = (String) obj2;
                            r9 r9Var2 = r9.this;
                            if (str4 != null) {
                                r9Var2.f35133d0.setLoading(false);
                                cc.a0(r9Var2).e0(str4, false);
                                return;
                            }
                            wallettransaction2.peer = k0.g(r9Var2.f35135f, r9Var2.h, r9Var2.f35143n);
                            wallettransaction2.comment = str3;
                            wallettransaction2.comment_encrypted = z11;
                            wallettransaction2.date = r9Var2.getConnectionsManager().getCurrentTime();
                            org.telegram.messenger.i0.v1(r9Var2.H);
                            b6.G0(r9Var2.getParentActivity(), r9Var2.getCurrentAccount(), wallettransaction2, new h9(r9Var2, x10, j13, 1), new e9(r9Var2, 4), r9Var2.r0(), null, r9Var2.getResourceProvider());
                            org.telegram.messenger.i0.h3(new c9(r9Var2, 3), 1000L);
                        }
                    });
                }
            }
        }
    }

    public static void f0(r9 r9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            r9Var.f35146p0 = false;
            r9Var.f35133d0.setLoading(false);
        } else if (str != null) {
            r9Var.f35146p0 = false;
            r9Var.f35133d0.setLoading(false);
            cc.a0(r9Var).e0(str, false);
        } else if (r9Var.f35136f0) {
            org.telegram.ui.ActionBar.z4 parentLayout = r9Var.getParentLayout();
            if (parentLayout == null) {
                r9Var.finishFragment();
                return;
            }
            long j10 = r9Var.f35135f.f19943id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && i0.a.g(1, arrayList) == r9Var) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) arrayList.get(size);
                    if ((k2Var instanceof un) && k2Var.getCurrentAccount() == r9Var.currentAccount) {
                        un unVar = (un) k2Var;
                        if (unVar.a() == j10 && unVar.f42059f4 == 0) {
                            r9Var.f35152t0 = unVar;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).c0((org.telegram.ui.ActionBar.k2) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (r9Var.f35152t0 == null) {
                    r9Var.getNotificationCenter().k(at.v, Long.valueOf(j10), Boolean.FALSE);
                    un ma2 = un.ma(j10);
                    ma2.setCurrentAccount(r9Var.currentAccount);
                    if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ma2)) {
                        r9Var.finishFragment();
                        return;
                    }
                    r9Var.f35152t0 = ma2;
                }
                r9Var.finishFragment();
            }
        } else {
            r9Var.w0();
        }
    }

    public static void g0(r9 r9Var, TL_wallet.walletUserAddress walletuseraddress) {
        r9Var.f35148r = false;
        r9Var.e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            r9Var.f35135f = wp.r1(r9Var.currentAccount).Z1(Long.valueOf(walletuseraddress.user_id));
        }
        ii iiVar = r9Var.f30217a;
        if (iiVar != null) {
            iiVar.f31183f3.O(true);
        }
        r9Var.C0();
        w8 w8Var = r9Var.f35155w;
        if (w8Var != null) {
            w8Var.a(r9Var.h, r9Var.f35135f);
        }
    }

    public static int i0(r9 r9Var) {
        return r9Var.currentAccount;
    }

    public static int m0(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i10 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i10++;
        }
        return i10;
    }

    public static String q0(long j10) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
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

    public static void z0(SpannableStringBuilder spannableStringBuilder, int i10, int i11, char c10) {
        int i12 = i10 + 1;
        while (true) {
            int i13 = i12 + 1;
            if (i13 < i11) {
                if (spannableStringBuilder.charAt(i12) == c10 && Character.isDigit(spannableStringBuilder.charAt(i12 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i13))) {
                    int i14 = i13;
                    while (i14 < i11 && Character.isDigit(spannableStringBuilder.charAt(i14))) {
                        i14++;
                    }
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), i13, i14, 33);
                    return;
                }
                i12 = i13;
            } else {
                return;
            }
        }
    }

    public final void A0(String str) {
        this.f35143n = str;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            lVar.setTitle(dd.L0(2131743042, null));
        }
    }

    public final void B0(boolean z10) {
        float f7;
        float f10 = 0.0f;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) dd.L0(2131743110, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) dd.L0(2131743163, null));
            spannableStringBuilder.append((CharSequence) " >");
            dq dqVar = new dq(2131232694, 0);
            float N = org.telegram.messenger.i0.N(0.66f);
            dqVar.f25568r = 0.0f;
            dqVar.f25569s = N;
            spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new dh.a(this, 10), length, spannableStringBuilder.length(), 33);
            this.Q.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = this.Q.animate();
        float f11 = 1.0f;
        if (z10) {
            f10 = 1.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f7);
        if (!z10) {
            f11 = 0.6f;
        }
        scaleX.scaleY(f11).setDuration(320L).setInterpolator(gr.h).start();
    }

    public final void C0() {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        CharSequence V;
        String q02;
        E0();
        if (this.H != null && this.f35133d0 != null) {
            k0 x10 = k0.x(this.currentAccount);
            long v = x10.v();
            long p02 = p0();
            long j10 = wp.r1(this.currentAccount).f19300y7.f18037l0.f17366a.f17238c;
            int i10 = (p02 > 0L ? 1 : (p02 == 0L ? 0 : -1));
            if (i10 > 0 && p02 < j10) {
                if (this.f35141k0) {
                    q02 = l0(j10, n0());
                } else {
                    q02 = q0(j10);
                }
                this.E.setAmountText(q02);
                this.H.setSelection(q02.length());
                EditTextBoldCursor editTextBoldCursor = this.H;
                int i11 = -this.f35145o0;
                this.f35145o0 = i11;
                org.telegram.messenger.i0.F3(i11, editTextBoldCursor, null);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.h) && !this.f35148r && i10 > 0 && p02 <= v) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!TextUtils.isEmpty(this.H.getText()) && p02 > v) {
                z11 = true;
            } else {
                z11 = false;
            }
            B0(z11);
            long p03 = p0();
            if (this.m0 == null) {
                this.m0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            }
            if (p03 > 0) {
                str = this.m0.format(BigDecimal.valueOf(p03, 9));
            } else {
                str = "";
            }
            vh.d dVar = this.f35133d0;
            if (!this.f35148r && !this.f35146p0) {
                z12 = false;
            } else {
                z12 = true;
            }
            dVar.setLoading(z12);
            vh.d dVar2 = this.f35133d0;
            if (TextUtils.isEmpty(str)) {
                V = dd.L0(2131743046, null);
            } else {
                V = dd.V(null, null, 2131743047, k0.l("Grams", str, 2131749516));
            }
            dVar2.i(V, true, true);
            this.f35133d0.setEnabled(z10);
            D0();
            F0();
            if (this.f35141k0) {
                org.telegram.ui.Components.f6 f6Var = this.N;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.M).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.f35144n0 == null) {
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.f35144n0 = decimalFormat;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.f35144n0.format(BigDecimal.valueOf(p02).movePointLeft(9)));
                z0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) dd.L0(2131749525, null));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                f6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L));
                return;
            }
            this.N.setText(o0(x10, p02));
        }
    }

    public final void D0() {
        boolean z10;
        boolean z11;
        float f7;
        if (this.R != null) {
            k0 x10 = k0.x(this.currentAccount);
            this.R.setText(dd.V(null, null, 2131743211, k0.l("Grams", k0.p(x10.v(), false), 2131749516)));
            boolean z12 = this.W;
            EditTextBoldCursor editTextBoldCursor = this.H;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.W = z12 | z10;
            if ((!x10.F() || k0.b(x10.t(), this.h)) && this.W) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j10 = this.f35134e0;
                if (j10 >= 0) {
                    this.T.setText(dd.V(null, null, 2131743098, k0.s(j10, false)));
                } else {
                    this.T.setText(dd.V(null, null, 2131743098, this.U));
                }
            }
            if (this.V == z11) {
                return;
            }
            this.V = z11;
            ValueAnimator valueAnimator = this.Y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.Y = null;
            }
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!this.T.isAttachedToWindow()) {
                y0(f7);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X, f7);
            this.Y = ofFloat;
            ofFloat.setDuration(320L);
            this.Y.setInterpolator(gr.h);
            this.Y.addUpdateListener(new r3(this, 8));
            this.Y.start();
        }
    }

    public final void E0() {
        final boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.D != null && this.O != null) {
            if (p0() <= 0 && this.P.getVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != this.f35142l0) {
                this.f35142l0 = z10;
                this.D.setVisibility(0);
                this.O.setVisibility(0);
                ViewPropertyAnimator animate = this.D.animate();
                float f13 = 0.0f;
                float f14 = 1.0f;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f7);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.8f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.8f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f11).withEndAction(new Runnable(this) {
                    public final r9 f34767b;

                    {
                        this.f34767b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f34767b.D;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f34767b.O;
                                if (!z10) {
                                    i11 = 0;
                                } else {
                                    i11 = 4;
                                }
                                textView.setVisibility(i11);
                                return;
                        }
                    }
                }).setDuration(320L);
                gr grVar = gr.h;
                duration.setInterpolator(grVar).start();
                ViewPropertyAnimator animate2 = this.O.animate();
                if (!z10) {
                    f13 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f13);
                if (!z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.8f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
                if (z10) {
                    f14 = 0.8f;
                }
                scaleX2.scaleY(f14).withEndAction(new Runnable(this) {
                    public final r9 f34767b;

                    {
                        this.f34767b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f34767b.D;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f34767b.O;
                                if (!z10) {
                                    i11 = 0;
                                } else {
                                    i11 = 4;
                                }
                                textView.setVisibility(i11);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(grVar).start();
            }
        }
    }

    public final void F0() {
        this.E.d(k0.x(this.currentAccount), this.f35141k0);
    }

    public final void G0() {
        boolean z10;
        float f7 = this.f35131b0;
        float f10 = 1.0f - f7;
        float max = Math.max(this.f35132c0, Math.max(0.0f, Math.min(1.0f, f7)));
        this.f35132c0 = max;
        float f11 = 1.0f - max;
        q9 q9Var = this.E;
        float f12 = this.f35131b0;
        if (this.f35130a0 == null && f12 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        q9Var.e(f12, max, z10);
        this.E.setTranslationY((((this.f35157x.getHeight() / 2.0f) - this.E.getTop()) - (this.E.getHeight() / 2.0f)) * f10);
        this.N.setAlpha(this.f35132c0);
        this.N.setTranslationY(org.telegram.messenger.i0.L(16.0f) * f11);
        this.f35158y.setAlpha(this.f35132c0);
        this.f35158y.setTranslationY(org.telegram.messenger.i0.L(16.0f) * f11);
        this.Z.setAlpha(this.f35132c0);
        for (int i10 = 0; i10 < this.Z.getChildCount(); i10++) {
            this.Z.getChildAt(i10).setTranslationY(org.telegram.messenger.i0.L(24.0f) * f11);
        }
    }

    @Override
    public final CharSequence a0() {
        return dd.L0(2131743042, null);
    }

    @Override
    public final boolean c0(b51 b51Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.f30217a.setVisibility(8);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.t6.f20930d6;
        org.telegram.ui.ActionBar.a7.i(i10, view, getResourceProvider());
        org.telegram.ui.ActionBar.a7.i(i10, this.actionBar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.t0 a2 = this.actionBar.p().a(1, 2131231245);
        a2.setContentDescription(dd.L0(2131754839, null));
        a2.e(2, 2131232043, dd.L0(2131743163, null));
        a2.e(3, 2131231777, dd.L0(2131743231, null));
        this.actionBar.setActionBarMenuOnItemClick(new z01(this, 11));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        w8 w8Var = new w8(context, new c9(this, 5), new c9(this, 6), this.resourceProvider);
        this.f35155w = w8Var;
        frameLayout.addView(w8Var, w7.b6.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        w8 w8Var2 = this.f35155w;
        if (w8Var2 != null) {
            w8Var2.a(this.h, this.f35135f);
        }
        jg.d0 d0Var = new jg.d0(this, context);
        this.f35157x = d0Var;
        d0Var.setOrientation(1);
        this.f35157x.setClipChildren(false);
        this.f35157x.setClipToPadding(false);
        frameLayout.addView(this.f35157x, w7.b6.e(-1, -2, 17));
        q9 q9Var = new q9(context, getResourceProvider());
        this.E = q9Var;
        if (q9Var.getDiamondView().f34199f == null) {
            this.f35132c0 = 1.0f;
            this.f35131b0 = 1.0f;
        }
        this.f35157x.addView(this.E, w7.b6.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.E.getEditText();
        this.H = editText;
        editText.setFilters(new InputFilter[]{new InputFilter() {
            @Override
            public final CharSequence filter(CharSequence charSequence, int i11, int i12, Spanned spanned, int i13, int i14) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(spanned.subSequence(0, i13).toString());
                sb2.append((Object) charSequence.subSequence(i11, i12));
                sb2.append((Object) spanned.subSequence(i14, spanned.length()));
                String sb3 = sb2.toString();
                int i15 = 9;
                BigDecimal valueOf = BigDecimal.valueOf(Long.MAX_VALUE, 9);
                r9 r9Var = r9.this;
                if (r9Var.f35141k0) {
                    BigDecimal n02 = r9Var.n0();
                    valueOf = valueOf.multiply(n02);
                    i15 = r9.m0(n02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i15) {
                    return spanned.subSequence(i13, i14);
                }
                if (r9.v0(sb3).compareTo(valueOf) > 0) {
                    return spanned.subSequence(i13, i14);
                }
                if (i11 != i12) {
                    boolean z10 = false;
                    for (int i16 = 0; i16 < sb3.length(); i16++) {
                        char charAt = sb3.charAt(i16);
                        if (charAt == '.' || charAt == ',') {
                            if (z10) {
                                return spanned.subSequence(i13, i14);
                            }
                            z10 = true;
                        }
                    }
                    if (i13 == 0 && (sb3.startsWith(".") || sb3.startsWith(","))) {
                        return "0" + ((Object) charSequence.subSequence(i11, i12));
                    } else if (sb3.startsWith("00")) {
                        return spanned.subSequence(i13, i14);
                    } else {
                        return null;
                    }
                }
                return null;
            }
        }});
        this.H.setImeOptions(33554438);
        this.H.setOnEditorActionListener(new x8(this, 1));
        this.H.addTextChangedListener(new ag.a1(this, 23));
        long j10 = this.f35150s;
        if (j10 > 0) {
            q9 q9Var2 = this.E;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            q9Var2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.H;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.L = new SpannableString("⇅");
        dq dqVar = new dq(2131232812, 0);
        dqVar.f25571x = 0.72f;
        SpannableString spannableString = this.L;
        spannableString.setSpan(dqVar, 0, spannableString.length(), 33);
        this.M = new SpannableString("G");
        dq dqVar2 = new dq(2131232816, 0);
        dqVar2.d = false;
        SpannableString spannableString2 = this.M;
        spannableString2.setSpan(dqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, false, true, true, true, true);
        this.N = f6Var;
        f6Var.f26082c.m(0.35f, 320L, 3.5f, gr.h);
        this.N.setScaleProperty(0.25f);
        this.N.setText(o0(k0.x(this.currentAccount), 0L));
        org.telegram.ui.Components.f6 f6Var2 = this.N;
        int i11 = org.telegram.ui.ActionBar.t6.f21331z6;
        org.telegram.ui.ActionBar.w6 q6 = org.telegram.ui.ActionBar.a7.q(i10, i11);
        org.telegram.ui.ActionBar.a7.n(f6Var2, q6.f21453a, q6.f21454b, 4, 0.0f, getResourceProvider());
        this.N.setTextSize(org.telegram.messenger.i0.L(14.0f));
        this.N.setTypeface(org.telegram.messenger.i0.o1("fonts/gram.ttf"));
        this.N.setGravity(17);
        this.N.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        this.N.setAllowCancel(true);
        int r12 = org.telegram.ui.ActionBar.t6.r1(0.08f, getThemedColor(i11));
        org.telegram.ui.Components.f6 f6Var3 = this.N;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(14.0f), r12);
        this.F = d02;
        f6Var3.setSizeableBackground(d02);
        this.f35157x.addView(this.N, w7.b6.t(-2, 28, 49, 0, 8, 0, 0));
        w7.e6.a(this.N);
        this.N.setOnClickListener(new View.OnClickListener(this) {
            public final r9 f34280b;

            {
                this.f34280b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f34280b.u0();
                        return;
                    case 1:
                        r9.e0(this.f34280b);
                        return;
                    case 2:
                        r9 r9Var = this.f34280b;
                        BigDecimal n02 = r9Var.n0();
                        if (r9Var.f35141k0 || n02.signum() > 0) {
                            long p02 = r9Var.p0();
                            r9Var.f35141k0 = !r9Var.f35141k0;
                            r9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (r9Var.f35141k0) {
                                q02 = r9Var.l0(p02, n02);
                            } else {
                                q02 = r9.q0(p02);
                            }
                            r9Var.E.setAmountText(q02);
                            r9Var.H.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        r9.d0(this.f34280b);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f35158y = frameLayout2;
        this.f35157x.addView(frameLayout2, w7.b6.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.D = linearLayout;
        linearLayout.setOrientation(1);
        this.f35158y.addView(this.D, w7.b6.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.O = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.O;
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.a7.V(textView2, i12, getResourceProvider());
        org.telegram.ui.ActionBar.a7.R(this.O, org.telegram.ui.ActionBar.t6.b0(org.telegram.ui.ActionBar.t6.r1(0.1f, getThemedColor(i12)), org.telegram.ui.ActionBar.t6.r1(0.25f, getThemedColor(i12)), 14, 14), org.telegram.ui.ActionBar.a7.L(0.1f, i12), org.telegram.ui.ActionBar.a7.L(0.25f, i12), getResourceProvider());
        this.O.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        this.O.setGravity(17);
        this.O.setTypeface(org.telegram.messenger.i0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(dd.L0(2131743163, null));
        spannableStringBuilder.append((CharSequence) " >");
        dq dqVar3 = new dq(2131232694, 0);
        float N = org.telegram.messenger.i0.N(0.66f);
        dqVar3.f25568r = 0.0f;
        dqVar3.f25569s = N;
        spannableStringBuilder.setSpan(dqVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        this.f35158y.addView(this.O, w7.b6.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w7.e6.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final r9 f34280b;

            {
                this.f34280b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f34280b.u0();
                        return;
                    case 1:
                        r9.e0(this.f34280b);
                        return;
                    case 2:
                        r9 r9Var = this.f34280b;
                        BigDecimal n02 = r9Var.n0();
                        if (r9Var.f35141k0 || n02.signum() > 0) {
                            long p02 = r9Var.p0();
                            r9Var.f35141k0 = !r9Var.f35141k0;
                            r9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (r9Var.f35141k0) {
                                q02 = r9Var.l0(p02, n02);
                            } else {
                                q02 = r9.q0(p02);
                            }
                            r9Var.E.setAmountText(q02);
                            r9Var.H.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        r9.d0(this.f34280b);
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
        this.f35142l0 = false;
        this.P = new TextView(context);
        org.telegram.ui.ActionBar.c5 c5Var = new org.telegram.ui.ActionBar.c5(0, true, false, null);
        c5Var.f20230x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = c5Var.f20213c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.i0.N(0.5f)));
        int i13 = org.telegram.ui.ActionBar.t6.Yl;
        paint.setColor(getThemedColor(i13));
        c5Var.f20229w = Integer.valueOf(getThemedColor(i13));
        this.P.setPadding(org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(19.0f), org.telegram.messenger.i0.L(8.0f));
        this.P.setBackground(c5Var);
        this.G = c5Var;
        this.P.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(this.P, i11, getResourceProvider());
        this.P.setTypeface(org.telegram.messenger.i0.o());
        this.P.setEllipsize(TextUtils.TruncateAt.END);
        this.P.setMaxLines(4);
        if (TextUtils.isEmpty(this.f35137g0)) {
            this.P.setVisibility(8);
        } else {
            this.P.setText(this.f35137g0);
            this.P.setVisibility(0);
        }
        this.D.addView(this.P, w7.b6.t(-2, -2, 49, 32, 12, 32, 0));
        this.P.setOnClickListener(new View.OnClickListener(this) {
            public final r9 f34280b;

            {
                this.f34280b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f34280b.u0();
                        return;
                    case 1:
                        r9.e0(this.f34280b);
                        return;
                    case 2:
                        r9 r9Var = this.f34280b;
                        BigDecimal n02 = r9Var.n0();
                        if (r9Var.f35141k0 || n02.signum() > 0) {
                            long p02 = r9Var.p0();
                            r9Var.f35141k0 = !r9Var.f35141k0;
                            r9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (r9Var.f35141k0) {
                                q02 = r9Var.l0(p02, n02);
                            } else {
                                q02 = r9.q0(p02);
                            }
                            r9Var.E.setAmountText(q02);
                            r9Var.H.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        r9.d0(this.f34280b);
                        return;
                }
            }
        });
        w7.e6.b(this.P, 0.02f, 1.2f);
        E0();
        p80 p80Var = new p80(context, this.resourceProvider);
        this.Q = p80Var;
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.f21171q7, getResourceProvider());
        org.telegram.ui.ActionBar.a7.H(this.Q, i12, getResourceProvider());
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Q.setTypeface(org.telegram.messenger.i0.o());
        this.Q.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        B0(false);
        this.D.addView(this.Q, w7.b6.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.Z = linearLayout2;
        linearLayout2.setOrientation(1);
        this.Z.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
        this.Z.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        TextView textView3 = new TextView(context);
        this.R = textView3;
        org.telegram.ui.ActionBar.a7.V(textView3, i11, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.Z.addView(this.R, w7.b6.t(-1, -2, 55, 16, 0, 16, 0));
        this.S = new SpannableString(">");
        dq dqVar4 = new dq(2131232694, 0);
        dqVar4.f25568r = 0.0f;
        dqVar4.f25569s = org.telegram.messenger.i0.L(1.0f);
        SpannableString spannableString3 = this.S;
        spannableString3.setSpan(dqVar4, 0, spannableString3.length(), 33);
        org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(this, context, 10);
        this.T = q2Var;
        org.telegram.ui.ActionBar.a7.V(q2Var, i11, getResourceProvider());
        this.T.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        this.T.setVisibility(8);
        this.Z.addView(this.T, w7.b6.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(dd.L0(2131748789, null));
        this.U = spannableString4;
        spannableString4.setSpan(new u80(org.telegram.messenger.i0.L(80.0f), this.T), 0, this.U.length(), 33);
        vh.d dVar = new vh.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f35133d0 = dVar;
        dVar.setText(dd.L0(2131743046, null));
        this.f35133d0.setEnabled(false);
        this.f35133d0.setOnClickListener(new View.OnClickListener(this) {
            public final r9 f34280b;

            {
                this.f34280b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f34280b.u0();
                        return;
                    case 1:
                        r9.e0(this.f34280b);
                        return;
                    case 2:
                        r9 r9Var = this.f34280b;
                        BigDecimal n02 = r9Var.n0();
                        if (r9Var.f35141k0 || n02.signum() > 0) {
                            long p02 = r9Var.p0();
                            r9Var.f35141k0 = !r9Var.f35141k0;
                            r9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (r9Var.f35141k0) {
                                q02 = r9Var.l0(p02, n02);
                            } else {
                                q02 = r9.q0(p02);
                            }
                            r9Var.E.setAmountText(q02);
                            r9Var.H.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        r9.d0(this.f34280b);
                        return;
                }
            }
        });
        this.Z.addView(this.f35133d0, w7.b6.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.Z, w7.b6.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == at.f14678a4) {
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
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.t6.r1(0.08f, getThemedColor(org.telegram.ui.ActionBar.t6.f21331z6)));
                this.F.invalidateSelf();
                org.telegram.ui.Components.f6 f6Var = this.N;
                if (f6Var != null) {
                    f6Var.invalidate();
                }
            }
            if (this.G != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Yl);
                this.G.f20213c.setColor(themedColor);
                this.G.f20229w = Integer.valueOf(themedColor);
                this.G.invalidateSelf();
                TextView textView = this.P;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void k0() {
        q9 q9Var = this.E;
        if (q9Var != null) {
            q9Var.getDiamondView().l(null);
        }
        o1.j jVar = this.f35130a0;
        if (jVar != null) {
            jVar.d();
        }
        this.f35131b0 = 1.0f;
        if (this.E != null) {
            G0();
        }
    }

    public final String l0(long j10, BigDecimal bigDecimal) {
        int i10;
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate s02 = s0();
        if (s02 != null) {
            i10 = s02.exp;
        } else if (TextUtils.equals(k0.x(this.currentAccount).h.g(), "USD")) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int max = Math.max(0, Math.min(i10, 20));
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
        f fVar = k0.x(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = ((org.telegram.messenger.k0) wp.r1(this.currentAccount).f19300y7.f18036l.f13481b).f16536a;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    public final SpannableStringBuilder o0(k0 k0Var, long j10) {
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(k0Var.m(j10, false));
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
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        q9 q9Var;
        View view2;
        if (!z10 && this.f35152t0 != null && (wallettransaction = this.f35147q0) != null && wallettransaction.localMessageId != 0 && (q9Var = this.E) != null) {
            a7 diamondView = q9Var.getDiamondView();
            if (diamondView.f34199f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                s6 s6Var = new s6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.f35152t0, this.f35147q0, runnable, null);
                this.f35153u0 = s6Var;
                return s6Var.f35197m;
            }
        }
        if (!z10 && this.f35149r0 != null && this.f35147q0 != null && this.E != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            fa faVar = new fa(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.f35149r0, this.f35147q0, runnable, null);
            this.f35151s0 = faVar;
            return faVar.f34519m;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, at.f14678a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.I = false;
        k0();
        s6 s6Var = this.f35153u0;
        if (s6Var != null) {
            AnimatorSet animatorSet = s6Var.f35197m;
            if (!s6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    s6Var.a(false);
                }
            }
            this.f35153u0 = null;
        }
        fa faVar = this.f35151s0;
        if (faVar != null) {
            AnimatorSet animatorSet2 = faVar.f34519m;
            if (!faVar.f34525s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    faVar.b();
                }
            }
            this.f35151s0 = null;
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
        getNotificationCenter().n(this, at.f14678a4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35139i0 = i13;
        if (this.Z != null) {
            int max = Math.max(0, this.f35140j0 - i13);
            this.Z.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f) + this.f35139i0);
            if (this.f35154v0 != max) {
                this.Z.animate().cancel();
                this.Z.animate().translationY(-max).setDuration(320L).setInterpolator(gr.h).start();
                this.f35154v0 = max;
            }
        }
    }

    @Override
    public final r0.j1 onInsetsInternal(View view, r0.j1 j1Var) {
        this.f35140j0 = j1Var.f46143a.f(8).d;
        return super.onInsetsInternal(view, j1Var);
    }

    @Override
    public final void onPause() {
        k0();
        this.I = false;
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.J);
            this.fragmentView.requestFocus();
            org.telegram.messenger.i0.v1(this.H);
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6);
            LinearLayout linearLayout = this.Z;
            if (linearLayout != null && themedColor != this.f35156w0 && (linearLayout.getBackground() instanceof GradientDrawable)) {
                this.f35156w0 = themedColor;
                ((GradientDrawable) this.Z.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.t6.r1(0.0f, themedColor), themedColor, themedColor});
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11 && this.I && (editTextBoldCursor = this.H) != null) {
            Runnable runnable = this.J;
            editTextBoldCursor.removeCallbacks(runnable);
            this.H.post(runnable);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        q9 q9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (q9Var = this.E) != null && this.f35131b0 < 1.0f) {
            q9Var.getDiamondView().l(new c9(this, 1));
        }
        if (z10 && !z11 && (editTextBoldCursor = this.H) != null) {
            Runnable runnable = this.J;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.f35150s > 0) {
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
            if (this.f35141k0) {
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
        TL_wallet.walletUserAddress walletuseraddress = this.e;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.e.public_key;
            if (i10 >= bArr.length) {
                return null;
            }
            if (bArr[i10] != 0) {
                return bArr;
            }
            i10++;
        }
    }

    public final TL_wallet.currencyRate s0() {
        f fVar = k0.x(this.currentAccount).h;
        TL_wallet.currencyRates f7 = fVar.f();
        if (f7 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f7.rates;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i10);
            i10++;
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
            this.f35134e0 = -1L;
            D0();
            k0 x10 = k0.x(this.currentAccount);
            if (x10.F() && !k0.b(x10.t(), this.h) && this.f35135f != null && TextUtils.isEmpty(this.f35143n)) {
                return;
            }
            String str = this.h;
            String str2 = this.f35137g0;
            if (this.f35138h0) {
                bArr = r0();
            } else {
                bArr = null;
            }
            x10.i(str, 0L, str2, bArr, new e9(this, 1));
        }
    }

    public final void u0() {
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        int i10;
        int L;
        boolean z12;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            if (this.f35140j0 - this.f35139i0 > org.telegram.messenger.i0.L(20.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, getResourceProvider());
            } else {
                alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, getResourceProvider());
            }
            String L0 = dd.L0(2131743231, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = L0;
            final ag.a2 a2Var = new ag.a2(this, parentActivity);
            a2Var.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.a7.V(a2Var, org.telegram.ui.ActionBar.t6.f21038j5, getResourceProvider());
            org.telegram.ui.ActionBar.a7.E(a2Var, org.telegram.ui.ActionBar.t6.f21223t5, getResourceProvider());
            a2Var.setHint(dd.L0(2131743195, null));
            a2Var.setText(this.f35137g0);
            a2Var.setSelection(a2Var.length());
            a2Var.setInputType(147457);
            int i11 = 5;
            a2Var.setMaxLines(5);
            a2Var.setImeOptions(6);
            org.telegram.ui.ActionBar.a7.G(a2Var, org.telegram.ui.ActionBar.t6.f21059k6, org.telegram.ui.ActionBar.t6.f21077l6, org.telegram.ui.ActionBar.t6.f21154p7, getResourceProvider());
            a2Var.setBackground(null);
            a2Var.setPadding(0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(48.0f), org.telegram.messenger.i0.L(10.0f));
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, getResourceProvider());
            int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, this.resourceProvider), 7, org.telegram.messenger.i0.L(12.0f));
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            org.telegram.ui.ActionBar.p6 p6Var = this.resourceProvider;
            c2Var.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(c2Var, h02, null, N, p6Var);
            String L02 = dd.L0(2131743103, null);
            if (this.f35138h0 && r0() != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            c2Var.e(L02, "", z11, false, false);
            c2Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (!dd.X) {
                i11 = 3;
            }
            layoutParams.gravity = i11 | 16;
            c2Var.getCheckBoxView().setLayoutParams(layoutParams);
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(4.0f);
            } else {
                i10 = 0;
            }
            int L2 = org.telegram.messenger.i0.L(12.0f);
            if (dd.X) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(4.0f);
            }
            c2Var.setPadding(i10, L2, L, org.telegram.messenger.i0.L(12.0f));
            if (r0() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            c2Var.setEnabled(z12);
            c2Var.setOnClickListener(new j3(c2Var, 6));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(a2Var, w7.b6.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(c2Var, w7.b6.t(-1, -2, 83, 8, 0, 8, 0));
            x1Var.G = 6;
            alertDialog$Builder.o(linearLayout);
            x1Var.f21469a = org.telegram.messenger.i0.L(292.0f);
            alertDialog$Builder.h(dd.L0(2131752589, null), new pa1(4));
            alertDialog$Builder.k(dd.L0(2131754486, null), new o8(this, a2Var, c2Var, 2));
            x1Var.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    ag.a2 a2Var2 = ag.a2.this;
                    a2Var2.requestFocus();
                    org.telegram.messenger.i0.J3(a2Var2);
                }
            });
            x1Var.setOnDismissListener(new l2(this, 2));
            if (z10) {
                x1Var.r(250L);
            } else {
                x1Var.show();
            }
            x1Var.f21491j0 = false;
            View d = x1Var.d(-1);
            if ((d instanceof TextView) && !TextUtils.isEmpty(this.f35137g0)) {
                a2Var.addTextChangedListener(new jg.f3(a2Var, (TextView) d));
            }
        }
    }

    public final void w0() {
        org.telegram.ui.ActionBar.z4 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (!arrayList.isEmpty() && i0.a.g(1, arrayList) == this) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) obj;
                if (k2Var instanceof ba) {
                    ((ActionBarLayout) parentLayout).c0(k2Var, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (sc.e.g(2, fragmentStack) instanceof b6) && ((org.telegram.ui.ActionBar.k2) sc.e.g(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.f35149r0 = (b6) sc.e.g(2, fragmentStack);
            } else {
                b6 b6Var = new b6();
                b6Var.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, b6Var)) {
                    this.f35149r0 = b6Var;
                }
            }
            finishFragment();
        }
    }

    public final void x0() {
        this.f35136f0 = true;
    }

    public final void y0(float f7) {
        int i10;
        this.X = f7;
        this.T.setAlpha(f7);
        org.telegram.ui.ActionBar.q2 q2Var = this.T;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        q2Var.setVisibility(i10);
        ((LinearLayout.LayoutParams) this.T.getLayoutParams()).topMargin = Math.round(org.telegram.messenger.i0.L(4.0f) * f7);
        this.T.requestLayout();
    }

    public r9(String str) {
        this(e20.f15506s0, str);
    }

    public r9(int i10, String str) {
        this.f35150s = 0L;
        this.J = new c9(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                r9 r9Var = r9.this;
                Runnable runnable = r9Var.J;
                if (z10 && r9Var.I && (editTextBoldCursor = r9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    r9Var.H.post(runnable);
                }
            }
        };
        this.f35134e0 = -1L;
        this.f35138h0 = true;
        this.f35145o0 = 6;
        setCurrentAccount(i10);
        this.f35135f = null;
        this.h = str;
        t0();
        this.f35148r = true;
        k0.x(this.currentAccount).Z(new e9(this, 0), str);
    }

    @Override
    public final void Z(ArrayList arrayList, q51 q51Var) {
    }

    @Override
    public final void b0(b51 b51Var, View view) {
    }
}

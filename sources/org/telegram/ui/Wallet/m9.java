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
import b8.mf;
import b8.pf;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.xq;
import org.telegram.ui.u70;
import org.telegram.ui.vs0;
import org.telegram.ui.wm;
public final class m9 extends h41 implements cs {
    public LinearLayout E;
    public l9 F;
    public ShapeDrawable G;
    public org.telegram.ui.ActionBar.t4 H;
    public EditTextBoldCursor I;
    public boolean J;
    public final Runnable K;
    public final ViewTreeObserver.OnWindowFocusChangeListener L;
    public SpannableString M;
    public SpannableString N;
    public org.telegram.ui.Components.h6 O;
    public TextView P;
    public TextView Q;
    public s70 R;
    public TextView S;
    public SpannableString T;
    public org.telegram.ui.ActionBar.k2 U;
    public SpannableString V;
    public boolean W;
    public boolean X;
    public float Y;
    public ValueAnimator Z;
    public LinearLayout f42869a0;
    public q1.g f42870b0;
    public float f42871c0;
    public float f42872d0;
    public TL_wallet.walletUserAddress f42873e;
    public gi.d f42874e0;
    public TLRPC.User f42875f;
    public long f42876f0;
    public boolean f42877g0;
    public String h;
    public String f42878h0;
    public boolean f42879i0;
    public int f42880j0;
    public int f42881k0;
    public boolean f42882l0;
    public boolean m0;
    public String f42883n;
    public DecimalFormat f42884n0;
    public DecimalFormat f42885o0;
    public int f42886p0;
    public boolean f42887q0;
    public boolean f42888r;
    public TL_wallet.walletTransaction f42889r0;
    public long f42890s;
    public w5 f42891s0;
    public aa f42892t0;
    public wm f42893u0;
    public m6 f42894v0;
    public q8 f42895w;
    public int f42896w0;
    public gi.y4 f42897x;
    public int f42898x0;
    public FrameLayout f42899y;

    public m9(TLRPC.User user) {
        this.f42890s = 0L;
        this.K = new w8(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                m9 m9Var = m9.this;
                Runnable runnable = m9Var.K;
                if (z10 && m9Var.J && (editTextBoldCursor = m9Var.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    m9Var.I.post(runnable);
                }
            }
        };
        this.f42876f0 = -1L;
        this.f42879i0 = true;
        this.f42886p0 = 6;
        this.f42875f = user;
        this.h = null;
        this.f42888r = true;
        k0.x(this.currentAccount).a0(user, new y8(this, 2));
    }

    public static void d0(m9 m9Var) {
        w5.J0(m9Var.currentAccount, m9Var.getParentActivity(), m9Var.getResourceProvider());
    }

    public static void e0(m9 m9Var) {
        String q02;
        gi.d dVar = m9Var.f42874e0;
        if (dVar.f12517d0 && !dVar.R) {
            final k0 x10 = k0.x(m9Var.currentAccount);
            long p02 = m9Var.p0();
            long v = x10.v();
            if (!m9Var.f42888r && WalletEngine2.isValidRecipientAddress(m9Var.h) && p02 > 0) {
                long j10 = ((org.telegram.messenger.l0) hp.s1(m9Var.currentAccount).f23167x7.f24666l0.f13688b).f23921c;
                byte[] bArr = null;
                if (p02 < j10) {
                    if (m9Var.f42882l0) {
                        q02 = m9Var.l0(j10, m9Var.n0());
                    } else {
                        q02 = q0(j10);
                    }
                    m9Var.F.setAmountText(q02);
                    m9Var.I.setSelection(q02.length());
                    EditTextBoldCursor editTextBoldCursor = m9Var.I;
                    int i3 = -m9Var.f42886p0;
                    m9Var.f42886p0 = i3;
                    org.telegram.messenger.g0.G3(i3, editTextBoldCursor, null);
                } else if (p02 > v) {
                    org.telegram.messenger.p2.APP_ERROR.a();
                    s70 s70Var = m9Var.R;
                    int i10 = -m9Var.f42886p0;
                    m9Var.f42886p0 = i10;
                    org.telegram.messenger.g0.G3(i10, s70Var, null);
                } else {
                    long j11 = m9Var.f42876f0;
                    if (j11 >= 0 && p02 + j11 > v) {
                        p02 -= j11;
                    }
                    boolean z10 = false;
                    m9Var.J = false;
                    EditTextBoldCursor editTextBoldCursor2 = m9Var.I;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(m9Var.K);
                        m9Var.fragmentView.requestFocus();
                        org.telegram.messenger.g0.v1(m9Var.I);
                    }
                    m9Var.f42874e0.setLoading(true);
                    m9Var.f42889r0 = null;
                    if (m9Var.f42875f != null && TextUtils.isEmpty(m9Var.f42883n)) {
                        m9Var.f42887q0 = true;
                        TLRPC.User user = m9Var.f42875f;
                        long j12 = p02;
                        String str = m9Var.h;
                        String str2 = m9Var.f42878h0;
                        if (m9Var.f42879i0) {
                            bArr = m9Var.r0();
                        }
                        x10.d0(user, str, j12, str2, bArr, null, null, new a9(m9Var, 0), new a9(m9Var, 1), null);
                        return;
                    }
                    final String str3 = m9Var.f42878h0;
                    if (m9Var.f42879i0) {
                        bArr = m9Var.r0();
                    }
                    if (bArr != null) {
                        z10 = true;
                    }
                    if (x10.F()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = k0.g(m9Var.f42875f, m9Var.h, m9Var.f42883n);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z10;
                        wallettransaction.date = m9Var.getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, m9Var.f42876f0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = p02;
                        org.telegram.messenger.g0.v1(m9Var.I);
                        w5.G0(m9Var.getParentActivity(), m9Var.getCurrentAccount(), wallettransaction, new b9(m9Var, x10, p02, 0), new y8(m9Var, 3), m9Var.r0(), null, m9Var.getResourceProvider());
                        org.telegram.messenger.g0.i3(new w8(m9Var, 2), 1000L);
                        return;
                    }
                    final long j13 = p02;
                    final boolean z11 = z10;
                    x10.i(m9Var.h, j13, str3, bArr, new n10() {
                        @Override
                        public final void a(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            String str4 = (String) obj2;
                            m9 m9Var2 = m9.this;
                            if (str4 != null) {
                                m9Var2.f42874e0.setLoading(false);
                                fc.a0(m9Var2).e0(str4, false);
                                return;
                            }
                            wallettransaction2.peer = k0.g(m9Var2.f42875f, m9Var2.h, m9Var2.f42883n);
                            wallettransaction2.comment = str3;
                            wallettransaction2.comment_encrypted = z11;
                            wallettransaction2.date = m9Var2.getConnectionsManager().getCurrentTime();
                            org.telegram.messenger.g0.v1(m9Var2.I);
                            w5.G0(m9Var2.getParentActivity(), m9Var2.getCurrentAccount(), wallettransaction2, new b9(m9Var2, x10, j13, 1), new y8(m9Var2, 4), m9Var2.r0(), null, m9Var2.getResourceProvider());
                            org.telegram.messenger.g0.i3(new w8(m9Var2, 3), 1000L);
                        }
                    });
                }
            }
        }
    }

    public static void f0(m9 m9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            m9Var.f42887q0 = false;
            m9Var.f42874e0.setLoading(false);
        } else if (str != null) {
            m9Var.f42887q0 = false;
            m9Var.f42874e0.setLoading(false);
            fc.a0(m9Var).e0(str, false);
        } else if (m9Var.f42877g0) {
            org.telegram.ui.ActionBar.q4 parentLayout = m9Var.getParentLayout();
            if (parentLayout == null) {
                m9Var.finishFragment();
                return;
            }
            long j10 = m9Var.f42875f.f27150id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && k2.p1.h(1, arrayList) == m9Var) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) arrayList.get(size);
                    if ((d2Var instanceof wm) && d2Var.getCurrentAccount() == m9Var.currentAccount) {
                        wm wmVar = (wm) d2Var;
                        if (wmVar.a() == j10 && wmVar.f51325g4 == 0) {
                            m9Var.f42893u0 = wmVar;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.d2) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (m9Var.f42893u0 == null) {
                    m9Var.getNotificationCenter().k(hs.v, Long.valueOf(j10), Boolean.FALSE);
                    wm ra2 = wm.ra(j10);
                    ra2.setCurrentAccount(m9Var.currentAccount);
                    if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ra2)) {
                        m9Var.finishFragment();
                        return;
                    }
                    m9Var.f42893u0 = ra2;
                }
                m9Var.finishFragment();
            }
        } else {
            m9Var.w0();
        }
    }

    public static void g0(m9 m9Var, TL_wallet.walletUserAddress walletuseraddress) {
        m9Var.f42888r = false;
        m9Var.f42873e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            m9Var.f42875f = hp.s1(m9Var.currentAccount).a2(Long.valueOf(walletuseraddress.user_id));
        }
        ai.h4 h4Var = m9Var.f34298a;
        if (h4Var != null) {
            h4Var.f35594g3.O(true);
        }
        m9Var.C0();
        q8 q8Var = m9Var.f42895w;
        if (q8Var != null) {
            q8Var.a(m9Var.h, m9Var.f42875f);
        }
    }

    public static int i0(m9 m9Var) {
        return m9Var.currentAccount;
    }

    public static int m0(BigDecimal bigDecimal) {
        if (bigDecimal.signum() <= 0) {
            return 9;
        }
        BigDecimal movePointLeft = bigDecimal.movePointLeft(9);
        int i3 = 0;
        for (BigDecimal movePointLeft2 = BigDecimal.ONE.movePointLeft(1); movePointLeft2.compareTo(movePointLeft) >= 0; movePointLeft2 = movePointLeft2.movePointLeft(1)) {
            i3++;
        }
        return i3;
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

    public static void z0(SpannableStringBuilder spannableStringBuilder, int i3, int i10, char c2) {
        int i11 = i3 + 1;
        while (true) {
            int i12 = i11 + 1;
            if (i12 < i10) {
                if (spannableStringBuilder.charAt(i11) == c2 && Character.isDigit(spannableStringBuilder.charAt(i11 - 1)) && Character.isDigit(spannableStringBuilder.charAt(i12))) {
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
        this.f42883n = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(bd.M0(2131743026, null));
        }
    }

    public final void B0(boolean z10) {
        float f10;
        float f11 = 0.0f;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) bd.M0(2131743094, null));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) bd.M0(2131743147, null));
            spannableStringBuilder.append((CharSequence) " >");
            wp wpVar = new wp(2131232695, 0);
            float N = org.telegram.messenger.g0.N(0.66f);
            wpVar.f40045r = 0.0f;
            wpVar.f40046s = N;
            spannableStringBuilder.setSpan(wpVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new gi.ka(this, 9), length, spannableStringBuilder.length(), 33);
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
        scaleX.scaleY(f12).setDuration(320L).setInterpolator(xq.h).start();
    }

    public final void C0() {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        CharSequence V;
        String q02;
        E0();
        if (this.I != null && this.f42874e0 != null) {
            k0 x10 = k0.x(this.currentAccount);
            long v = x10.v();
            long p02 = p0();
            long j10 = ((org.telegram.messenger.l0) hp.s1(this.currentAccount).f23167x7.f24666l0.f13688b).f23921c;
            int i3 = (p02 > 0L ? 1 : (p02 == 0L ? 0 : -1));
            if (i3 > 0 && p02 < j10) {
                if (this.f42882l0) {
                    q02 = l0(j10, n0());
                } else {
                    q02 = q0(j10);
                }
                this.F.setAmountText(q02);
                this.I.setSelection(q02.length());
                EditTextBoldCursor editTextBoldCursor = this.I;
                int i10 = -this.f42886p0;
                this.f42886p0 = i10;
                org.telegram.messenger.g0.G3(i10, editTextBoldCursor, null);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.h) && !this.f42888r && i3 > 0 && p02 <= v) {
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
            if (this.f42884n0 == null) {
                this.f42884n0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            }
            if (p03 > 0) {
                str = this.f42884n0.format(BigDecimal.valueOf(p03, 9));
            } else {
                str = "";
            }
            gi.d dVar = this.f42874e0;
            if (!this.f42888r && !this.f42887q0) {
                z12 = false;
            } else {
                z12 = true;
            }
            dVar.setLoading(z12);
            gi.d dVar2 = this.f42874e0;
            if (TextUtils.isEmpty(str)) {
                V = bd.M0(2131743030, null);
            } else {
                V = bd.V(null, null, 2131743031, k0.l("Grams", str, 2131749515));
            }
            dVar2.i(V, true, true);
            this.f42874e0.setEnabled(z10);
            D0();
            F0();
            if (this.f42882l0) {
                org.telegram.ui.Components.h6 h6Var = this.O;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.N).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.f42885o0 == null) {
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.f42885o0 = decimalFormat;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.f42885o0.format(BigDecimal.valueOf(p02).movePointLeft(9)));
                z0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) bd.M0(2131749524, null));
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
            k0 x10 = k0.x(this.currentAccount);
            this.S.setText(bd.V(null, null, 2131743195, k0.l("Grams", k0.p(x10.v(), false), 2131749515)));
            boolean z12 = this.X;
            EditTextBoldCursor editTextBoldCursor = this.I;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.X = z12 | z10;
            if ((!x10.F() || k0.b(x10.t(), this.h)) && this.X) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j10 = this.f42876f0;
                if (j10 >= 0) {
                    this.U.setText(bd.V(null, null, 2131743082, k0.s(j10, false)));
                } else {
                    this.U.setText(bd.V(null, null, 2131743082, this.V));
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
            this.Z.setInterpolator(xq.h);
            this.Z.addUpdateListener(new p3(this, 8));
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
                    public final m9 f42441b;

                    {
                        this.f42441b = this;
                    }

                    @Override
                    public final void run() {
                        int i3;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f42441b.E;
                                if (z10) {
                                    i3 = 0;
                                } else {
                                    i3 = 4;
                                }
                                linearLayout.setVisibility(i3);
                                return;
                            default:
                                TextView textView = this.f42441b.P;
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
                xq xqVar = xq.h;
                duration.setInterpolator(xqVar).start();
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
                    public final m9 f42441b;

                    {
                        this.f42441b = this;
                    }

                    @Override
                    public final void run() {
                        int i3;
                        int i10;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f42441b.E;
                                if (z10) {
                                    i3 = 0;
                                } else {
                                    i3 = 4;
                                }
                                linearLayout.setVisibility(i3);
                                return;
                            default:
                                TextView textView = this.f42441b.P;
                                if (!z10) {
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
        this.F.d(k0.x(this.currentAccount), this.f42882l0);
    }

    public final void G0() {
        boolean z10;
        float f10 = this.f42871c0;
        float f11 = 1.0f - f10;
        float max = Math.max(this.f42872d0, Math.max(0.0f, Math.min(1.0f, f10)));
        this.f42872d0 = max;
        float f12 = 1.0f - max;
        l9 l9Var = this.F;
        float f13 = this.f42871c0;
        if (this.f42870b0 == null && f13 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        l9Var.e(f13, max, z10);
        this.F.setTranslationY((((this.f42897x.getHeight() / 2.0f) - this.F.getTop()) - (this.F.getHeight() / 2.0f)) * f11);
        this.O.setAlpha(this.f42872d0);
        this.O.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.f42899y.setAlpha(this.f42872d0);
        this.f42899y.setTranslationY(org.telegram.messenger.g0.L(16.0f) * f12);
        this.f42869a0.setAlpha(this.f42872d0);
        for (int i3 = 0; i3 < this.f42869a0.getChildCount(); i3++) {
            this.f42869a0.getChildAt(i3).setTranslationY(org.telegram.messenger.g0.L(24.0f) * f12);
        }
    }

    @Override
    public final CharSequence a0() {
        return bd.M0(2131743026, null);
    }

    @Override
    public final boolean c0(r31 r31Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.f34298a.setVisibility(8);
        View view = this.fragmentView;
        int i3 = org.telegram.ui.ActionBar.k6.f27878d6;
        org.telegram.ui.ActionBar.r6.i(i3, view, getResourceProvider());
        org.telegram.ui.ActionBar.r6.i(i3, this.actionBar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.q0 a10 = this.actionBar.q().a(1, 2131231244);
        a10.setContentDescription(bd.M0(2131754839, null));
        a10.e(2, 2131232044, bd.M0(2131743147, null));
        a10.e(3, 2131231778, bd.M0(2131743215, null));
        this.actionBar.setActionBarMenuOnItemClick(new vs0(this, 21));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        q8 q8Var = new q8(context, new w8(this, 5), new w8(this, 6), this.resourceProvider);
        this.f42895w = q8Var;
        frameLayout.addView(q8Var, mf.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        q8 q8Var2 = this.f42895w;
        if (q8Var2 != null) {
            q8Var2.a(this.h, this.f42875f);
        }
        gi.y4 y4Var = new gi.y4(this, context);
        this.f42897x = y4Var;
        y4Var.setOrientation(1);
        this.f42897x.setClipChildren(false);
        this.f42897x.setClipToPadding(false);
        frameLayout.addView(this.f42897x, mf.e(-1, -2, 17));
        l9 l9Var = new l9(context, getResourceProvider());
        this.F = l9Var;
        if (l9Var.getDiamondView().f43254f == null) {
            this.f42872d0 = 1.0f;
            this.f42871c0 = 1.0f;
        }
        this.f42897x.addView(this.F, mf.t(-1, 64, 49, 16, 0, 16, 0));
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
                m9 m9Var = m9.this;
                if (m9Var.f42882l0) {
                    BigDecimal n02 = m9Var.n0();
                    valueOf = valueOf.multiply(n02);
                    i14 = m9.m0(n02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i14) {
                    return spanned.subSequence(i12, i13);
                }
                if (m9.v0(sb3).compareTo(valueOf) > 0) {
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
        this.I.setOnEditorActionListener(new r8(this, 1));
        this.I.addTextChangedListener(new bh.h(this, 28));
        long j10 = this.f42890s;
        if (j10 > 0) {
            l9 l9Var2 = this.F;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            l9Var2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.I;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.M = new SpannableString("⇅");
        wp wpVar = new wp(2131232812, 0);
        wpVar.f40048x = 0.72f;
        SpannableString spannableString = this.M;
        spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
        this.N = new SpannableString("G");
        wp wpVar2 = new wp(2131232816, 0);
        wpVar2.d = false;
        SpannableString spannableString2 = this.N;
        spannableString2.setSpan(wpVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, false, true, true, true, true);
        this.O = h6Var;
        h6Var.f34307c.m(0.35f, 320L, 3.5f, xq.h);
        this.O.setScaleProperty(0.25f);
        this.O.setText(o0(k0.x(this.currentAccount), 0L));
        org.telegram.ui.Components.h6 h6Var2 = this.O;
        int i10 = org.telegram.ui.ActionBar.k6.f28290z6;
        org.telegram.ui.ActionBar.n6 q10 = org.telegram.ui.ActionBar.r6.q(i3, i10);
        org.telegram.ui.ActionBar.r6.n(h6Var2, q10.f28359a, q10.f28360b, 4, 0.0f, getResourceProvider());
        this.O.setTextSize(org.telegram.messenger.g0.L(14.0f));
        this.O.setTypeface(org.telegram.messenger.g0.o1("fonts/gram.ttf"));
        this.O.setGravity(17);
        this.O.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.O.setAllowCancel(true);
        int r12 = org.telegram.ui.ActionBar.k6.r1(0.08f, getThemedColor(i10));
        org.telegram.ui.Components.h6 h6Var3 = this.O;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(14.0f), r12);
        this.G = d02;
        h6Var3.setSizeableBackground(d02);
        this.f42897x.addView(this.O, mf.t(-2, 28, 49, 0, 8, 0, 0));
        pf.a(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final m9 f43297b;

            {
                this.f43297b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f43297b.u0();
                        return;
                    case 1:
                        m9.e0(this.f43297b);
                        return;
                    case 2:
                        m9 m9Var = this.f43297b;
                        BigDecimal n02 = m9Var.n0();
                        if (m9Var.f42882l0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.f42882l0 = !m9Var.f42882l0;
                            m9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (m9Var.f42882l0) {
                                q02 = m9Var.l0(p02, n02);
                            } else {
                                q02 = m9.q0(p02);
                            }
                            m9Var.F.setAmountText(q02);
                            m9Var.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        m9.d0(this.f43297b);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f42899y = frameLayout2;
        this.f42897x.addView(frameLayout2, mf.r(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.E = linearLayout;
        linearLayout.setOrientation(1);
        this.f42899y.addView(this.E, mf.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.P = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.P;
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        org.telegram.ui.ActionBar.r6.V(textView2, i11, getResourceProvider());
        org.telegram.ui.ActionBar.r6.R(this.P, org.telegram.ui.ActionBar.k6.b0(org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(i11)), org.telegram.ui.ActionBar.k6.r1(0.25f, getThemedColor(i11)), 14, 14), org.telegram.ui.ActionBar.r6.L(0.1f, i11), org.telegram.ui.ActionBar.r6.L(0.25f, i11), getResourceProvider());
        this.P.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        this.P.setGravity(17);
        this.P.setTypeface(org.telegram.messenger.g0.o());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131743147, null));
        spannableStringBuilder.append((CharSequence) " >");
        wp wpVar3 = new wp(2131232695, 0);
        float N = org.telegram.messenger.g0.N(0.66f);
        wpVar3.f40045r = 0.0f;
        wpVar3.f40046s = N;
        spannableStringBuilder.setSpan(wpVar3, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.P.setText(spannableStringBuilder);
        this.f42899y.addView(this.P, mf.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        pf.a(this.P);
        this.P.setOnClickListener(new View.OnClickListener(this) {
            public final m9 f43297b;

            {
                this.f43297b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f43297b.u0();
                        return;
                    case 1:
                        m9.e0(this.f43297b);
                        return;
                    case 2:
                        m9 m9Var = this.f43297b;
                        BigDecimal n02 = m9Var.n0();
                        if (m9Var.f42882l0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.f42882l0 = !m9Var.f42882l0;
                            m9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (m9Var.f42882l0) {
                                q02 = m9Var.l0(p02, n02);
                            } else {
                                q02 = m9.q0(p02);
                            }
                            m9Var.F.setAmountText(q02);
                            m9Var.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        m9.d0(this.f43297b);
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
        org.telegram.ui.ActionBar.t4 t4Var = new org.telegram.ui.ActionBar.t4(0, true, false, null);
        t4Var.f28653x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = t4Var.f28635c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, org.telegram.messenger.g0.N(0.5f)));
        int i12 = org.telegram.ui.ActionBar.k6.Yl;
        paint.setColor(getThemedColor(i12));
        t4Var.f28652w = Integer.valueOf(getThemedColor(i12));
        this.Q.setPadding(org.telegram.messenger.g0.L(15.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(8.0f));
        this.Q.setBackground(t4Var);
        this.H = t4Var;
        this.Q.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(this.Q, i10, getResourceProvider());
        this.Q.setTypeface(org.telegram.messenger.g0.o());
        this.Q.setEllipsize(TextUtils.TruncateAt.END);
        this.Q.setMaxLines(4);
        if (TextUtils.isEmpty(this.f42878h0)) {
            this.Q.setVisibility(8);
        } else {
            this.Q.setText(this.f42878h0);
            this.Q.setVisibility(0);
        }
        this.E.addView(this.Q, mf.t(-2, -2, 49, 32, 12, 32, 0));
        this.Q.setOnClickListener(new View.OnClickListener(this) {
            public final m9 f43297b;

            {
                this.f43297b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f43297b.u0();
                        return;
                    case 1:
                        m9.e0(this.f43297b);
                        return;
                    case 2:
                        m9 m9Var = this.f43297b;
                        BigDecimal n02 = m9Var.n0();
                        if (m9Var.f42882l0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.f42882l0 = !m9Var.f42882l0;
                            m9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (m9Var.f42882l0) {
                                q02 = m9Var.l0(p02, n02);
                            } else {
                                q02 = m9.q0(p02);
                            }
                            m9Var.F.setAmountText(q02);
                            m9Var.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        m9.d0(this.f43297b);
                        return;
                }
            }
        });
        pf.b(this.Q, 0.02f, 1.2f);
        E0();
        s70 s70Var = new s70(context, this.resourceProvider);
        this.R = s70Var;
        org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.f28122q7, getResourceProvider());
        org.telegram.ui.ActionBar.r6.H(this.R, i11, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.R.setTypeface(org.telegram.messenger.g0.o());
        this.R.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        B0(false);
        this.E.addView(this.R, mf.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f42869a0 = linearLayout2;
        linearLayout2.setOrientation(1);
        this.f42869a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
        this.f42869a0.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, getThemedColor(i3)), getThemedColor(i3), getThemedColor(i3)}));
        TextView textView3 = new TextView(context);
        this.S = textView3;
        org.telegram.ui.ActionBar.r6.V(textView3, i10, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.f42869a0.addView(this.S, mf.t(-1, -2, 55, 16, 0, 16, 0));
        this.T = new SpannableString(">");
        wp wpVar4 = new wp(2131232695, 0);
        wpVar4.f40045r = 0.0f;
        wpVar4.f40046s = org.telegram.messenger.g0.L(1.0f);
        SpannableString spannableString3 = this.T;
        spannableString3.setSpan(wpVar4, 0, spannableString3.length(), 33);
        org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(10, context, this);
        this.U = k2Var;
        org.telegram.ui.ActionBar.r6.V(k2Var, i10, getResourceProvider());
        this.U.setTextSize(1, 14.0f);
        this.U.setGravity(17);
        this.U.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        this.U.setVisibility(8);
        this.f42869a0.addView(this.U, mf.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(bd.M0(2131748787, null));
        this.V = spannableString4;
        spannableString4.setSpan(new x70(org.telegram.messenger.g0.L(80.0f), this.U), 0, this.V.length(), 33);
        gi.d dVar = new gi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f42874e0 = dVar;
        dVar.setText(bd.M0(2131743030, null));
        this.f42874e0.setEnabled(false);
        this.f42874e0.setOnClickListener(new View.OnClickListener(this) {
            public final m9 f43297b;

            {
                this.f43297b = this;
            }

            @Override
            public final void onClick(View view2) {
                String q02;
                switch (r2) {
                    case 0:
                        this.f43297b.u0();
                        return;
                    case 1:
                        m9.e0(this.f43297b);
                        return;
                    case 2:
                        m9 m9Var = this.f43297b;
                        BigDecimal n02 = m9Var.n0();
                        if (m9Var.f42882l0 || n02.signum() > 0) {
                            long p02 = m9Var.p0();
                            m9Var.f42882l0 = !m9Var.f42882l0;
                            m9Var.F0();
                            if (p02 <= 0) {
                                q02 = "";
                            } else if (m9Var.f42882l0) {
                                q02 = m9Var.l0(p02, n02);
                            } else {
                                q02 = m9.q0(p02);
                            }
                            m9Var.F.setAmountText(q02);
                            m9Var.I.setSelection(q02.length());
                            return;
                        }
                        return;
                    default:
                        m9.d0(this.f43297b);
                        return;
                }
            }
        });
        this.f42869a0.addView(this.f42874e0, mf.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.f42869a0, mf.e(-1, -2, 87));
        C0();
        G0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.f23200a4) {
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
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.k6.r1(0.08f, getThemedColor(org.telegram.ui.ActionBar.k6.f28290z6)));
                this.G.invalidateSelf();
                org.telegram.ui.Components.h6 h6Var = this.O;
                if (h6Var != null) {
                    h6Var.invalidate();
                }
            }
            if (this.H != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Yl);
                this.H.f28635c.setColor(themedColor);
                this.H.f28652w = Integer.valueOf(themedColor);
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
        l9 l9Var = this.F;
        if (l9Var != null) {
            l9Var.getDiamondView().l(null);
        }
        q1.g gVar = this.f42870b0;
        if (gVar != null) {
            gVar.d();
        }
        this.f42871c0 = 1.0f;
        if (this.F != null) {
            G0();
        }
    }

    public final String l0(long j10, BigDecimal bigDecimal) {
        int i3;
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate s02 = s0();
        if (s02 != null) {
            i3 = s02.exp;
        } else if (TextUtils.equals(k0.x(this.currentAccount).h.g(), "USD")) {
            i3 = 2;
        } else {
            i3 = 0;
        }
        int max = Math.max(0, Math.min(i3, 20));
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
        double d = ((org.telegram.messenger.i0) hp.s1(this.currentAccount).f23167x7.f24665l.f14429b).f23413a;
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    public final SpannableStringBuilder o0(k0 k0Var, long j10) {
        char c2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(k0Var.m(j10, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate s02 = s0();
        if (s02 != null && !TextUtils.isEmpty(s02.decimalSeparator)) {
            c2 = s02.decimalSeparator.charAt(0);
        } else {
            c2 = '.';
        }
        z0(spannableStringBuilder, length, length2, c2);
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.M);
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        l9 l9Var;
        View view2;
        if (!z10 && this.f42893u0 != null && (wallettransaction = this.f42889r0) != null && wallettransaction.localMessageId != 0 && (l9Var = this.F) != null) {
            u6 diamondView = l9Var.getDiamondView();
            if (diamondView.f43254f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                m6 m6Var = new m6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.f42893u0, this.f42889r0, runnable, null);
                this.f42894v0 = m6Var;
                return m6Var.f42854m;
            }
        }
        if (!z10 && this.f42891s0 != null && this.f42889r0 != null && this.F != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            aa aaVar = new aa(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.F.getDiamondView(), this.f42891s0, this.f42889r0, runnable, null);
            this.f42892t0 = aaVar;
            return aaVar.f42201m;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.f23200a4);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.J = false;
        k0();
        m6 m6Var = this.f42894v0;
        if (m6Var != null) {
            AnimatorSet animatorSet = m6Var.f42854m;
            if (!m6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    m6Var.a(false);
                }
            }
            this.f42894v0 = null;
        }
        aa aaVar = this.f42892t0;
        if (aaVar != null) {
            AnimatorSet animatorSet2 = aaVar.f42201m;
            if (!aaVar.f42207s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    aaVar.b();
                }
            }
            this.f42892t0 = null;
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
        getNotificationCenter().n(this, hs.f23200a4);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f42880j0 = i12;
        if (this.f42869a0 != null) {
            int max = Math.max(0, this.f42881k0 - i12);
            this.f42869a0.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f) + this.f42880j0);
            if (this.f42896w0 != max) {
                this.f42869a0.animate().cancel();
                this.f42869a0.animate().translationY(-max).setDuration(320L).setInterpolator(xq.h).start();
                this.f42896w0 = max;
            }
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f42881k0 = k1Var.f54026a.f(8).d;
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
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6);
            LinearLayout linearLayout = this.f42869a0;
            if (linearLayout != null && themedColor != this.f42898x0 && (linearLayout.getBackground() instanceof GradientDrawable)) {
                this.f42898x0 = themedColor;
                ((GradientDrawable) this.f42869a0.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.r1(0.0f, themedColor), themedColor, themedColor});
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
        l9 l9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (l9Var = this.F) != null && this.f42871c0 < 1.0f) {
            l9Var.getDiamondView().l(new w8(this, 1));
        }
        if (z10 && !z11 && (editTextBoldCursor = this.I) != null) {
            Runnable runnable = this.K;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.f42890s > 0) {
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
            if (this.f42882l0) {
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
        TL_wallet.walletUserAddress walletuseraddress = this.f42873e;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr = this.f42873e.public_key;
            if (i3 >= bArr.length) {
                return null;
            }
            if (bArr[i3] != 0) {
                return bArr;
            }
            i3++;
        }
    }

    public final TL_wallet.currencyRate s0() {
        f fVar = k0.x(this.currentAccount).h;
        TL_wallet.currencyRates f10 = fVar.f();
        if (f10 == null) {
            return null;
        }
        ArrayList<TL_wallet.currencyRate> arrayList = f10.rates;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            TL_wallet.currencyRate currencyrate = arrayList.get(i3);
            i3++;
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
            this.f42876f0 = -1L;
            D0();
            k0 x10 = k0.x(this.currentAccount);
            if (x10.F() && !k0.b(x10.t(), this.h) && this.f42875f != null && TextUtils.isEmpty(this.f42883n)) {
                return;
            }
            String str = this.h;
            String str2 = this.f42878h0;
            if (this.f42879i0) {
                bArr = r0();
            } else {
                bArr = null;
            }
            x10.i(str, 0L, str2, bArr, new y8(this, 1));
        }
    }

    public final void u0() {
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        int i3;
        int L;
        boolean z12;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            if (this.f42881k0 - this.f42880j0 > org.telegram.messenger.g0.L(20.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, getResourceProvider());
            } else {
                alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, getResourceProvider());
            }
            String M0 = bd.M0(2131743215, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            final lg.y0 y0Var = new lg.y0(this, parentActivity);
            y0Var.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.V(y0Var, org.telegram.ui.ActionBar.k6.f27988j5, getResourceProvider());
            org.telegram.ui.ActionBar.r6.E(y0Var, org.telegram.ui.ActionBar.k6.f28176t5, getResourceProvider());
            y0Var.setHint(bd.M0(2131743179, null));
            y0Var.setText(this.f42878h0);
            y0Var.setSelection(y0Var.length());
            y0Var.setInputType(147457);
            int i10 = 5;
            y0Var.setMaxLines(5);
            y0Var.setImeOptions(6);
            org.telegram.ui.ActionBar.r6.G(y0Var, org.telegram.ui.ActionBar.k6.f28007k6, org.telegram.ui.ActionBar.k6.f28026l6, org.telegram.ui.ActionBar.k6.f28102p7, getResourceProvider());
            y0Var.setBackground(null);
            y0Var.setPadding(0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(48.0f), org.telegram.messenger.g0.L(10.0f));
            org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(1, parentActivity, getResourceProvider());
            int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, this.resourceProvider), 7, org.telegram.messenger.g0.L(12.0f));
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
            c2Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(c2Var, h02, null, N, e6Var);
            String M02 = bd.M0(2131743087, null);
            if (this.f42879i0 && r0() != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            c2Var.e(M02, "", z11, false, false);
            c2Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (!bd.f21784a0) {
                i10 = 3;
            }
            layoutParams.gravity = i10 | 16;
            c2Var.getCheckBoxView().setLayoutParams(layoutParams);
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(4.0f);
            } else {
                i3 = 0;
            }
            int L2 = org.telegram.messenger.g0.L(12.0f);
            if (bd.f21784a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(4.0f);
            }
            c2Var.setPadding(i3, L2, L, org.telegram.messenger.g0.L(12.0f));
            if (r0() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            c2Var.setEnabled(z12);
            c2Var.setOnClickListener(new h3(c2Var, 6));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(y0Var, mf.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(c2Var, mf.t(-1, -2, 83, 8, 0, 8, 0));
            s1Var.H = 6;
            alertDialog$Builder.o(linearLayout);
            s1Var.f28523a = org.telegram.messenger.g0.L(292.0f);
            alertDialog$Builder.h(bd.M0(2131752589, null), new u70(19));
            alertDialog$Builder.k(bd.M0(2131754486, null), new i8(this, y0Var, c2Var, 2));
            s1Var.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    lg.y0 y0Var2 = lg.y0.this;
                    y0Var2.requestFocus();
                    org.telegram.messenger.g0.K3(y0Var2);
                }
            });
            s1Var.setOnDismissListener(new k2(this, 2));
            if (z10) {
                s1Var.r(250L);
            } else {
                s1Var.show();
            }
            s1Var.f28548k0 = false;
            View d = s1Var.d(-1);
            if ((d instanceof TextView) && !TextUtils.isEmpty(this.f42878h0)) {
                y0Var.addTextChangedListener(new ai.w3(y0Var, (TextView) d));
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
        if (!arrayList.isEmpty() && k2.p1.h(1, arrayList) == this) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                if (d2Var instanceof w9) {
                    ((ActionBarLayout) parentLayout).d0(d2Var, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (t4.c.d(2, fragmentStack) instanceof w5) && ((org.telegram.ui.ActionBar.d2) t4.c.d(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.f42891s0 = (w5) t4.c.d(2, fragmentStack);
            } else {
                w5 w5Var = new w5();
                w5Var.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, w5Var)) {
                    this.f42891s0 = w5Var;
                }
            }
            finishFragment();
        }
    }

    public final void x0() {
        this.f42877g0 = true;
    }

    public final void y0(float f10) {
        int i3;
        this.Y = f10;
        this.U.setAlpha(f10);
        org.telegram.ui.ActionBar.k2 k2Var = this.U;
        if (f10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        k2Var.setVisibility(i3);
        ((LinearLayout.LayoutParams) this.U.getLayoutParams()).topMargin = Math.round(org.telegram.messenger.g0.L(4.0f) * f10);
        this.U.requestLayout();
    }

    public m9(String str) {
        this(h10.f22829t0, str);
    }

    public m9(int i3, String str) {
        this.f42890s = 0L;
        this.K = new w8(this, 0);
        this.L = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                m9 m9Var = m9.this;
                Runnable runnable = m9Var.K;
                if (z10 && m9Var.J && (editTextBoldCursor = m9Var.I) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    m9Var.I.post(runnable);
                }
            }
        };
        this.f42876f0 = -1L;
        this.f42879i0 = true;
        this.f42886p0 = 6;
        setCurrentAccount(i3);
        this.f42875f = null;
        this.h = str;
        t0();
        this.f42888r = true;
        k0.x(this.currentAccount).Z(new y8(this, 0), str);
    }

    @Override
    public final void Z(ArrayList arrayList, f41 f41Var) {
    }

    @Override
    public final void b0(r31 r31Var, View view) {
    }
}

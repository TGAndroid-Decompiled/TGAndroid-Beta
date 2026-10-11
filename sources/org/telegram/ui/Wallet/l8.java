package org.telegram.ui.Wallet;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
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
import ci.ac;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.o81;
import org.telegram.ui.tk;
import org.telegram.ui.v20;
import org.telegram.ui.zn;
public final class l8 extends h71 implements NotificationCenter.NotificationCenterDelegate {
    public EditTextBoldCursor E;
    public boolean F;
    public final Runnable G;
    public final ViewTreeObserver.OnWindowFocusChangeListener H;
    public SpannableString I;
    public SpannableString J;
    public org.telegram.ui.Components.r6 K;
    public TextView L;
    public TextView M;
    public fa0 N;
    public TextView O;
    public SpannableString P;
    public tk Q;
    public SpannableString R;
    public boolean S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public LinearLayout W;
    public o1.k X;
    public float Y;
    public float Z;
    public ci.d f35230a0;
    public long f35231b0;
    public boolean f35232c0;
    public TL_wallet.walletUserAddress d;
    public String f35233d0;
    public TLRPC.User f35234e;
    public boolean f35235e0;
    public String f35236f;
    public int f35237f0;
    public int f35238g0;
    public String h;
    public boolean f35239h0;
    public boolean f35240i0;
    public DecimalFormat f35241j0;
    public DecimalFormat f35242k0;
    public int f35243l0;
    public TL_wallet.walletTransaction m0;
    public boolean f35244n;
    public c5 f35245n0;
    public y8 f35246o0;
    public zn f35247p0;
    public x5 f35248q0;
    public long f35249r;
    public int f35250r0;
    public p7 f35251s;
    public ci.w5 v;
    public FrameLayout f35252w;
    public LinearLayout f35253x;
    public k8 f35254y;

    public l8(TLRPC.User user) {
        this.f35249r = 0L;
        this.G = new v7(this, 0);
        this.H = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                l8 l8Var = l8.this;
                Runnable runnable = l8Var.G;
                if (z10 && l8Var.F && (editTextBoldCursor = l8Var.E) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    l8Var.E.post(runnable);
                }
            }
        };
        this.f35231b0 = -1L;
        this.f35235e0 = true;
        this.f35243l0 = 6;
        this.f35234e = user;
        this.f35236f = null;
        this.f35244n = true;
        l0.v(this.currentAccount).W(user, new u7(this, 1));
    }

    public static void Y(l8 l8Var) {
        c5.u0(l8Var.getParentActivity(), l8Var.currentAccount, l8Var.getResourceProvider());
    }

    public static void Z(l8 l8Var) {
        byte[] bArr;
        byte[] bArr2;
        String k02;
        ci.d dVar = l8Var.f35230a0;
        if (dVar.W && !dVar.N) {
            final l0 v = l0.v(l8Var.currentAccount);
            long j02 = l8Var.j0();
            long t10 = v.t();
            if (!l8Var.f35244n && WalletEngine2.isValidRecipientAddress(l8Var.f35236f) && j02 > 0) {
                long j3 = MessagesController.getInstance(l8Var.currentAccount).config.walletTransferMinNanos.get();
                if (j02 < j3) {
                    if (l8Var.f35239h0) {
                        k02 = l8Var.f0(j3, l8Var.h0());
                    } else {
                        k02 = k0(j3);
                    }
                    l8Var.f35254y.setAmountText(k02);
                    l8Var.E.setSelection(k02.length());
                    EditTextBoldCursor editTextBoldCursor = l8Var.E;
                    int i10 = -l8Var.f35243l0;
                    l8Var.f35243l0 = i10;
                    AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
                } else if (j02 > t10) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    fa0 fa0Var = l8Var.N;
                    int i11 = -l8Var.f35243l0;
                    l8Var.f35243l0 = i11;
                    AndroidUtilities.shakeViewSpring(fa0Var, i11);
                } else {
                    long j10 = l8Var.f35231b0;
                    if (j10 >= 0 && j02 + j10 > t10) {
                        j02 -= j10;
                    }
                    boolean z10 = false;
                    l8Var.F = false;
                    EditTextBoldCursor editTextBoldCursor2 = l8Var.E;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(l8Var.G);
                        l8Var.fragmentView.requestFocus();
                        AndroidUtilities.hideKeyboard(l8Var.E);
                    }
                    l8Var.f35230a0.setLoading(true);
                    l8Var.m0 = null;
                    if (l8Var.f35234e != null && TextUtils.isEmpty(l8Var.h)) {
                        TLRPC.User user = l8Var.f35234e;
                        long j11 = j02;
                        String str = l8Var.f35236f;
                        String str2 = l8Var.f35233d0;
                        if (l8Var.f35235e0) {
                            bArr2 = l8Var.l0();
                        } else {
                            bArr2 = null;
                        }
                        v.Z(user, str, j11, str2, bArr2, null, null, new x7(l8Var, 0), new x7(l8Var, 1));
                        return;
                    }
                    final String str3 = l8Var.f35233d0;
                    if (l8Var.f35235e0) {
                        bArr = l8Var.l0();
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        z10 = true;
                    }
                    if (v.C()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = l0.g(l8Var.f35234e, l8Var.f35236f, l8Var.h);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z10;
                        wallettransaction.date = l8Var.getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, l8Var.f35231b0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = j02;
                        AndroidUtilities.hideKeyboard(l8Var.E);
                        c5.s0(l8Var.getParentActivity(), l8Var.getCurrentAccount(), wallettransaction, new y7(l8Var, v, j02, 0), new u7(l8Var, 2), l8Var.l0(), null, l8Var.getResourceProvider());
                        AndroidUtilities.runOnUIThread(new v7(l8Var, 1), 1000L);
                        return;
                    }
                    final long j12 = j02;
                    final boolean z11 = z10;
                    v.h(l8Var.f35236f, j12, str3, bArr, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            String str4 = (String) obj2;
                            l8 l8Var2 = l8.this;
                            if (str4 != null) {
                                l8Var2.f35230a0.setLoading(false);
                                ad.a0(l8Var2).e0(str4, false);
                                return;
                            }
                            wallettransaction2.peer = l0.g(l8Var2.f35234e, l8Var2.f35236f, l8Var2.h);
                            wallettransaction2.comment = str3;
                            wallettransaction2.comment_encrypted = z11;
                            wallettransaction2.date = l8Var2.getConnectionsManager().getCurrentTime();
                            AndroidUtilities.hideKeyboard(l8Var2.E);
                            c5.s0(l8Var2.getParentActivity(), l8Var2.getCurrentAccount(), wallettransaction2, new y7(l8Var2, v, j12, 1), new u7(l8Var2, 3), l8Var2.l0(), null, l8Var2.getResourceProvider());
                            AndroidUtilities.runOnUIThread(new v7(l8Var2, 2), 1000L);
                        }
                    });
                }
            }
        }
    }

    public static void a0(l8 l8Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            l8Var.f35230a0.setLoading(false);
        } else if (str != null) {
            l8Var.f35230a0.setLoading(false);
            ad.a0(l8Var).e0(str, false);
        } else if (l8Var.f35232c0) {
            org.telegram.ui.ActionBar.b5 parentLayout = l8Var.getParentLayout();
            if (parentLayout == null) {
                l8Var.finishFragment();
                return;
            }
            long j3 = l8Var.f35234e.f20179id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && hg.c.g(1, arrayList) == l8Var) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) arrayList.get(size);
                    if ((m2Var instanceof zn) && m2Var.getCurrentAccount() == l8Var.currentAccount) {
                        zn znVar = (zn) m2Var;
                        if (znVar.a() == j3 && znVar.R3 == 0) {
                            l8Var.f35247p0 = znVar;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.m2) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (l8Var.f35247p0 == null) {
                    l8Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeProfileActivity, Long.valueOf(j3), Boolean.FALSE);
                    zn W9 = zn.W9(j3);
                    W9.setCurrentAccount(l8Var.currentAccount);
                    if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, W9)) {
                        l8Var.finishFragment();
                        return;
                    }
                    l8Var.f35247p0 = W9;
                }
                l8Var.finishFragment();
            }
        } else {
            l8Var.q0();
        }
    }

    public static void b0(l8 l8Var, TL_wallet.walletUserAddress walletuseraddress) {
        l8Var.f35244n = false;
        l8Var.d = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            l8Var.f35234e = MessagesController.getInstance(l8Var.currentAccount).getUser(Long.valueOf(walletuseraddress.user_id));
        }
        g71 g71Var = l8Var.f26922a;
        if (g71Var != null) {
            g71Var.W2.N(true);
        }
        l8Var.w0();
        p7 p7Var = l8Var.f35251s;
        if (p7Var != null) {
            p7Var.a(l8Var.f35236f, l8Var.f35234e);
        }
    }

    public static int d0(l8 l8Var) {
        return l8Var.currentAccount;
    }

    public static int g0(BigDecimal bigDecimal) {
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

    public static String k0(long j3) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j3).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static BigDecimal p0(String str) {
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

    public static void t0(SpannableStringBuilder spannableStringBuilder, int i10, int i11, char c10) {
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

    public final void A0() {
        boolean z10;
        float f7 = this.Y;
        float f10 = 1.0f - f7;
        float max = Math.max(this.Z, Math.max(0.0f, Math.min(1.0f, f7)));
        this.Z = max;
        float f11 = 1.0f - max;
        k8 k8Var = this.f35254y;
        float f12 = this.Y;
        if (this.X == null && f12 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        k8Var.e(f12, max, z10);
        this.f35254y.setTranslationY((((this.v.getHeight() / 2.0f) - this.f35254y.getTop()) - (this.f35254y.getHeight() / 2.0f)) * f10);
        this.K.setAlpha(this.Z);
        this.K.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.f35252w.setAlpha(this.Z);
        this.f35252w.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.W.setAlpha(this.Z);
        for (int i10 = 0; i10 < this.W.getChildCount(); i10++) {
            this.W.getChildAt(i10).setTranslationY(AndroidUtilities.dp(24.0f) * f11);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletSendMoneyTo);
    }

    @Override
    public final boolean X(r61 r61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.f26922a.setVisibility(8);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20786d6;
        view.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.o().a(1, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        this.actionBar.setActionBarMenuOnItemClick(new o81(this, 10));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        p7 p7Var = new p7(context, new v7(this, 5), new v7(this, 6), this.resourceProvider);
        this.f35251s = p7Var;
        frameLayout.addView(p7Var, w7.x5.a(64.0f, 16.0f, 5.0f, 16.0f, 0.0f, -2, 49));
        p7 p7Var2 = this.f35251s;
        if (p7Var2 != null) {
            p7Var2.a(this.f35236f, this.f35234e);
        }
        ci.w5 w5Var = new ci.w5(this, context);
        this.v = w5Var;
        w5Var.setOrientation(1);
        this.v.setClipChildren(false);
        this.v.setClipToPadding(false);
        frameLayout.addView(this.v, w7.x5.e(-1, -2, 17));
        k8 k8Var = new k8(context, getResourceProvider());
        this.f35254y = k8Var;
        if (k8Var.getDiamondView().f34857f == null) {
            this.Z = 1.0f;
            this.Y = 1.0f;
        }
        this.v.addView(this.f35254y, w7.x5.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.f35254y.getEditText();
        this.E = editText;
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
                l8 l8Var = l8.this;
                if (l8Var.f35239h0) {
                    BigDecimal h02 = l8Var.h0();
                    valueOf = valueOf.multiply(h02);
                    i15 = l8.g0(h02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i15) {
                    return spanned.subSequence(i13, i14);
                }
                if (l8.p0(sb3).compareTo(valueOf) > 0) {
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
        this.E.setImeOptions(33554438);
        this.E.setOnEditorActionListener(new s7(this, 0));
        this.E.addTextChangedListener(new ci.h2(this, 15));
        long j3 = this.f35249r;
        if (j3 > 0) {
            k8 k8Var2 = this.f35254y;
            BigDecimal valueOf = BigDecimal.valueOf(j3, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            k8Var2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.E;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.I = new SpannableString("⇅");
        er erVar = new er(R.drawable.wallet_currency_exchange, 0);
        erVar.setAlpha(0.72f);
        SpannableString spannableString = this.I;
        spannableString.setSpan(erVar, 0, spannableString.length(), 33);
        this.J = new SpannableString("G");
        er erVar2 = new er(R.drawable.wallet_gram_small, 0);
        erVar2.recolorDrawable = false;
        SpannableString spannableString2 = this.J;
        spannableString2.setSpan(erVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, false, true, true, true, true);
        this.K = r6Var;
        r6Var.f30346c.m(0.35f, 320L, 3.5f, is.h);
        this.K.setScaleProperty(0.25f);
        this.K.setText(i0(l0.v(this.currentAccount), 0L));
        org.telegram.ui.Components.r6 r6Var2 = this.K;
        int themedColor = getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.h6.f21189z6;
        r6Var2.setTextColor(org.telegram.ui.ActionBar.h6.v(themedColor, getThemedColor(i11)));
        this.K.setTextSize(AndroidUtilities.dp(14.0f));
        this.K.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        this.K.setGravity(17);
        this.K.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.K.setAllowCancel(true);
        this.K.setSizeableBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.h6.m1(0.08f, getThemedColor(i11))));
        this.v.addView(this.K, w7.x5.t(-2, 28, 49, 0, 8, 0, 0));
        w7.z5.a(this.K);
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final l8 f35586b;

            {
                this.f35586b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        l8 l8Var = this.f35586b;
                        BigDecimal h02 = l8Var.h0();
                        if (l8Var.f35239h0 || h02.signum() > 0) {
                            long j02 = l8Var.j0();
                            l8Var.f35239h0 = !l8Var.f35239h0;
                            l8Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (l8Var.f35239h0) {
                                k02 = l8Var.f0(j02, h02);
                            } else {
                                k02 = l8.k0(j02);
                            }
                            l8Var.f35254y.setAmountText(k02);
                            l8Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    case 1:
                        l8.Y(this.f35586b);
                        return;
                    case 2:
                        this.f35586b.o0();
                        return;
                    default:
                        l8.Z(this.f35586b);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f35252w = frameLayout2;
        this.v.addView(frameLayout2, w7.x5.q(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f35253x = linearLayout;
        linearLayout.setOrientation(1);
        this.f35252w.addView(this.f35253x, w7.x5.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.L = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.L;
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        textView2.setTextColor(getThemedColor(i12));
        this.L.setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.m1(0.1f, getThemedColor(i12)), org.telegram.ui.ActionBar.h6.m1(0.25f, getThemedColor(i12)), 14, 14));
        this.L.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.L.setGravity(17);
        this.L.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletDepositFunds));
        spannableStringBuilder.append((CharSequence) " >");
        spannableStringBuilder.setSpan(new er(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.L.setText(spannableStringBuilder);
        this.f35252w.addView(this.L, w7.x5.a(28.0f, 0.0f, 8.0f, 0.0f, 0.0f, -2, 49));
        w7.z5.a(this.L);
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final l8 f35586b;

            {
                this.f35586b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        l8 l8Var = this.f35586b;
                        BigDecimal h02 = l8Var.h0();
                        if (l8Var.f35239h0 || h02.signum() > 0) {
                            long j02 = l8Var.j0();
                            l8Var.f35239h0 = !l8Var.f35239h0;
                            l8Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (l8Var.f35239h0) {
                                k02 = l8Var.f0(j02, h02);
                            } else {
                                k02 = l8.k0(j02);
                            }
                            l8Var.f35254y.setAmountText(k02);
                            l8Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    case 1:
                        l8.Y(this.f35586b);
                        return;
                    case 2:
                        this.f35586b.o0();
                        return;
                    default:
                        l8.Z(this.f35586b);
                        return;
                }
            }
        });
        this.f35253x.setVisibility(4);
        this.f35253x.setAlpha(0.0f);
        this.f35253x.setScaleX(0.8f);
        this.f35253x.setScaleY(0.8f);
        this.L.setVisibility(0);
        this.L.setAlpha(1.0f);
        this.L.setScaleX(1.0f);
        this.L.setScaleY(1.0f);
        this.f35240i0 = false;
        this.M = new TextView(context);
        org.telegram.ui.ActionBar.d5 d5Var = new org.telegram.ui.ActionBar.d5(0, true, false, null);
        d5Var.f20542x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = d5Var.f20524c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i13 = org.telegram.ui.ActionBar.h6.kl;
        paint.setColor(getThemedColor(i13));
        d5Var.f20541w = Integer.valueOf(getThemedColor(i13));
        this.M.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        this.M.setBackground(d5Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTextColor(getThemedColor(i11));
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setMaxLines(4);
        if (TextUtils.isEmpty(this.f35233d0)) {
            this.M.setVisibility(8);
        } else {
            this.M.setText(this.f35233d0);
            this.M.setVisibility(0);
        }
        this.f35253x.addView(this.M, w7.x5.t(-2, -2, 49, 32, 12, 32, 0));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final l8 f35586b;

            {
                this.f35586b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        l8 l8Var = this.f35586b;
                        BigDecimal h02 = l8Var.h0();
                        if (l8Var.f35239h0 || h02.signum() > 0) {
                            long j02 = l8Var.j0();
                            l8Var.f35239h0 = !l8Var.f35239h0;
                            l8Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (l8Var.f35239h0) {
                                k02 = l8Var.f0(j02, h02);
                            } else {
                                k02 = l8.k0(j02);
                            }
                            l8Var.f35254y.setAmountText(k02);
                            l8Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    case 1:
                        l8.Y(this.f35586b);
                        return;
                    case 2:
                        this.f35586b.o0();
                        return;
                    default:
                        l8.Z(this.f35586b);
                        return;
                }
            }
        });
        w7.z5.b(this.M, 0.02f, 1.2f);
        y0();
        fa0 fa0Var = new fa0(context, this.resourceProvider);
        this.N = fa0Var;
        fa0Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21026q7));
        this.N.setLinkTextColor(getThemedColor(i12));
        this.N.setTextSize(1, 14.0f);
        this.N.setGravity(17);
        this.N.setTypeface(AndroidUtilities.bold());
        this.N.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        v0(false);
        this.f35253x.addView(this.N, w7.x5.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.W = linearLayout2;
        linearLayout2.setOrientation(1);
        this.W.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        this.W.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        TextView textView3 = new TextView(context);
        this.O = textView3;
        textView3.setTextColor(getThemedColor(i11));
        this.O.setTextSize(1, 14.0f);
        this.O.setGravity(17);
        this.W.addView(this.O, w7.x5.t(-1, -2, 55, 16, 0, 16, 0));
        this.P = new SpannableString(">");
        er erVar3 = new er(R.drawable.settings_arrow, 0);
        erVar3.translate(0.0f, AndroidUtilities.dp(1.0f));
        SpannableString spannableString3 = this.P;
        spannableString3.setSpan(erVar3, 0, spannableString3.length(), 33);
        tk tkVar = new tk(this, context, 6);
        this.Q = tkVar;
        tkVar.setTextColor(getThemedColor(i11));
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Q.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        this.Q.setVisibility(8);
        this.W.addView(this.Q, w7.x5.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.R = spannableString4;
        spannableString4.setSpan(new ka0(AndroidUtilities.dp(80.0f), this.Q), 0, this.R.length(), 33);
        ci.d dVar = new ci.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f35230a0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletSendGrams));
        this.f35230a0.setEnabled(false);
        this.f35230a0.setOnClickListener(new View.OnClickListener(this) {
            public final l8 f35586b;

            {
                this.f35586b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        l8 l8Var = this.f35586b;
                        BigDecimal h02 = l8Var.h0();
                        if (l8Var.f35239h0 || h02.signum() > 0) {
                            long j02 = l8Var.j0();
                            l8Var.f35239h0 = !l8Var.f35239h0;
                            l8Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (l8Var.f35239h0) {
                                k02 = l8Var.f0(j02, h02);
                            } else {
                                k02 = l8.k0(j02);
                            }
                            l8Var.f35254y.setAmountText(k02);
                            l8Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    case 1:
                        l8.Y(this.f35586b);
                        return;
                    case 2:
                        this.f35586b.o0();
                        return;
                    default:
                        l8.Z(this.f35586b);
                        return;
                }
            }
        });
        this.W.addView(this.f35230a0, w7.x5.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.W, w7.x5.e(-1, -2, 87));
        w0();
        A0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            x0();
            w0();
        }
    }

    public final void e0() {
        k8 k8Var = this.f35254y;
        if (k8Var != null) {
            k8Var.getDiamondView().l(null);
        }
        o1.k kVar = this.X;
        if (kVar != null) {
            kVar.c();
        }
        this.Y = 1.0f;
        if (this.f35254y != null) {
            A0();
        }
    }

    public final String f0(long j3, BigDecimal bigDecimal) {
        int i10;
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j3).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate m0 = m0();
        if (m0 != null) {
            i10 = m0.exp;
        } else if (TextUtils.equals(l0.v(this.currentAccount).h.g(), "USD")) {
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
        int g02 = g0(bigDecimal);
        if (scale.scale() > g02) {
            scale = scale.setScale(g02, RoundingMode.DOWN);
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

    public final BigDecimal h0() {
        f fVar = l0.v(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    public final SpannableStringBuilder i0(l0 l0Var, long j3) {
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(l0Var.l(j3, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate m0 = m0();
        if (m0 != null && !TextUtils.isEmpty(m0.decimalSeparator)) {
            c10 = m0.decimalSeparator.charAt(0);
        } else {
            c10 = '.';
        }
        t0(spannableStringBuilder, length, length2, c10);
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.I);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final long j0() {
        EditTextBoldCursor editTextBoldCursor = this.E;
        if (editTextBoldCursor != null) {
            BigDecimal p02 = p0(editTextBoldCursor.getText().toString());
            if (this.f35239h0) {
                BigDecimal h02 = h0();
                if (h02.signum() <= 0) {
                    return 0L;
                }
                p02 = p02.divide(h02, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
            }
            BigInteger bigInteger = p02.movePointRight(9).toBigInteger();
            if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                return Long.MAX_VALUE;
            }
            return bigInteger.longValue();
        }
        return 0L;
    }

    public final byte[] l0() {
        TL_wallet.walletUserAddress walletuseraddress = this.d;
        if (walletuseraddress == null || walletuseraddress.public_key == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = this.d.public_key;
            if (i10 >= bArr.length) {
                return null;
            }
            if (bArr[i10] != 0) {
                return bArr;
            }
            i10++;
        }
    }

    public final TL_wallet.currencyRate m0() {
        f fVar = l0.v(this.currentAccount).h;
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

    public final void n0() {
        byte[] bArr;
        if (WalletEngine2.isValidRecipientAddress(this.f35236f)) {
            this.f35231b0 = -1L;
            x0();
            l0 v = l0.v(this.currentAccount);
            if (v.C() && !l0.b(v.r(), this.f35236f) && this.f35234e != null && TextUtils.isEmpty(this.h)) {
                return;
            }
            String str = this.f35236f;
            String str2 = this.f35233d0;
            if (this.f35235e0) {
                bArr = l0();
            } else {
                bArr = null;
            }
            v.h(str, 0L, str2, bArr, new u7(this, 0));
        }
    }

    public final void o0() {
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        int i10;
        int dp;
        boolean z12;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            if (this.f35238g0 - this.f35237f0 > AndroidUtilities.dp(20.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, getResourceProvider());
            } else {
                alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, getResourceProvider());
            }
            String string = LocaleController.getString(R.string.WalletAddComment);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
            a2Var.R = string;
            final hg.b1 b1Var = new hg.b1(this, parentActivity);
            b1Var.setTextSize(1, 18.0f);
            b1Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20894j5));
            b1Var.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21081t5));
            b1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
            b1Var.setText(this.f35233d0);
            b1Var.setSelection(b1Var.length());
            b1Var.setInputType(147457);
            int i11 = 5;
            b1Var.setMaxLines(5);
            b1Var.setImeOptions(6);
            b1Var.setLineColors(getThemedColor(org.telegram.ui.ActionBar.h6.f20914k6), getThemedColor(org.telegram.ui.ActionBar.h6.f20932l6), getThemedColor(org.telegram.ui.ActionBar.h6.f21007p7));
            b1Var.setBackground(null);
            b1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
            org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(parentActivity, 1, getResourceProvider());
            a2Var2.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20877i6, this.resourceProvider), 7, AndroidUtilities.dp(12.0f)));
            String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
            if (this.f35235e0 && l0() != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            a2Var2.e(string2, "", z11, false, false);
            a2Var2.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var2.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (!LocaleController.isRTL) {
                i11 = 3;
            }
            layoutParams.gravity = i11 | 16;
            a2Var2.getCheckBoxView().setLayoutParams(layoutParams);
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(4.0f);
            } else {
                i10 = 0;
            }
            int dp2 = AndroidUtilities.dp(12.0f);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            a2Var2.setPadding(i10, dp2, dp, AndroidUtilities.dp(12.0f));
            if (l0() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            a2Var2.setEnabled(z12);
            a2Var2.setOnClickListener(new l3(a2Var2, 4));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(b1Var, w7.x5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(a2Var2, w7.x5.t(-1, -2, 83, 8, 0, 8, 0));
            a2Var.G = 6;
            alertDialog$Builder.n(linearLayout);
            a2Var.f20377a = AndroidUtilities.dp(292.0f);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v20(20));
            alertDialog$Builder.k(LocaleController.getString(R.string.Add), new h7(this, b1Var, a2Var2, 2));
            a2Var.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    hg.b1 b1Var2 = hg.b1.this;
                    b1Var2.requestFocus();
                    AndroidUtilities.showKeyboard(b1Var2);
                }
            });
            a2Var.setOnDismissListener(new w3(this, 2));
            if (z10) {
                a2Var.q(250L);
            } else {
                a2Var.show();
            }
            a2Var.f20391h0 = false;
            View d = a2Var.d(-1);
            if ((d instanceof TextView) && !TextUtils.isEmpty(this.f35233d0)) {
                b1Var.addTextChangedListener(new e8(b1Var, (TextView) d));
            }
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        k8 k8Var;
        View view2;
        if (!z10 && this.f35247p0 != null && (wallettransaction = this.m0) != null && wallettransaction.localMessageId != 0 && (k8Var = this.f35254y) != null) {
            e6 diamondView = k8Var.getDiamondView();
            if (diamondView.f34857f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                x5 x5Var = new x5(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.f35254y.getDiamondView(), this.f35247p0, this.m0, runnable, null);
                this.f35248q0 = x5Var;
                return x5Var.f35708m;
            }
        }
        if (!z10 && this.f35245n0 != null && this.m0 != null && this.f35254y != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            y8 y8Var = new y8(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.f35254y.getDiamondView(), this.f35245n0, this.m0, runnable, null);
            this.f35246o0 = y8Var;
            return y8Var.f35750m;
        }
        return super.onCustomTransitionAnimation(z10, runnable);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.walletUpdate);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        this.F = false;
        e0();
        x5 x5Var = this.f35248q0;
        if (x5Var != null) {
            AnimatorSet animatorSet = x5Var.f35708m;
            if (!x5Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    x5Var.a(false);
                }
            }
            this.f35248q0 = null;
        }
        y8 y8Var = this.f35246o0;
        if (y8Var != null) {
            AnimatorSet animatorSet2 = y8Var.f35750m;
            if (!y8Var.f35756s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    y8Var.b();
                }
            }
            this.f35246o0 = null;
        }
        ValueAnimator valueAnimator = this.V;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.E;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.G);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35237f0 = i13;
        if (this.W != null) {
            int max = Math.max(0, this.f35238g0 - i13);
            this.W.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f) + this.f35237f0);
            if (this.f35250r0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(is.h).start();
                this.f35250r0 = max;
            }
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f35238g0 = k1Var.f46867a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override
    public final void onPause() {
        e0();
        this.F = false;
        EditTextBoldCursor editTextBoldCursor = this.E;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.G);
            this.fragmentView.requestFocus();
            AndroidUtilities.hideKeyboard(this.E);
        }
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        n0();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11 && this.F && (editTextBoldCursor = this.E) != null) {
            Runnable runnable = this.G;
            editTextBoldCursor.removeCallbacks(runnable);
            this.E.post(runnable);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        k8 k8Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (k8Var = this.f35254y) != null && this.Y < 1.0f) {
            k8Var.getDiamondView().l(new v7(this, 4));
        }
        if (z10 && !z11 && (editTextBoldCursor = this.E) != null) {
            Runnable runnable = this.G;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.f35249r > 0) {
                EditTextBoldCursor editTextBoldCursor2 = this.E;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
            }
            this.F = true;
            this.E.requestFocus();
            this.E.post(runnable);
        }
    }

    public final void q0() {
        org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (!arrayList.isEmpty() && hg.c.g(1, arrayList) == this) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (m2Var instanceof u8) {
                    ((ActionBarLayout) parentLayout).a0(m2Var, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (sc.v.h(2, fragmentStack) instanceof c5) && ((org.telegram.ui.ActionBar.m2) sc.v.h(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.f35245n0 = (c5) sc.v.h(2, fragmentStack);
            } else {
                c5 c5Var = new c5();
                c5Var.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, c5Var)) {
                    this.f35245n0 = c5Var;
                }
            }
            finishFragment();
        }
    }

    public final void r0() {
        this.f35232c0 = true;
    }

    public final void s0(float f7) {
        int i10;
        this.U = f7;
        this.Q.setAlpha(f7);
        tk tkVar = this.Q;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        tkVar.setVisibility(i10);
        ((LinearLayout.LayoutParams) this.Q.getLayoutParams()).topMargin = Math.round(AndroidUtilities.dp(4.0f) * f7);
        this.Q.requestLayout();
    }

    public final void u0(String str) {
        this.h = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(LocaleController.getString(R.string.WalletSendMoneyTo));
        }
    }

    public final void v0(boolean z10) {
        float f7;
        float f10 = 0.0f;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletInsufficientFunds));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletDepositFunds));
            spannableStringBuilder.append((CharSequence) " >");
            spannableStringBuilder.setSpan(new er(R.drawable.settings_arrow, 0).setOverrideColor(getThemedColor(org.telegram.ui.ActionBar.h6.Oh)).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new ac(this, 9), length, spannableStringBuilder.length(), 33);
            this.N.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = this.N.animate();
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
        scaleX.scaleY(f11).setDuration(320L).setInterpolator(is.h).start();
    }

    public final void w0() {
        boolean z10;
        boolean z11;
        String str;
        CharSequence formatSpannable;
        String k02;
        y0();
        if (this.E != null && this.f35230a0 != null) {
            l0 v = l0.v(this.currentAccount);
            long t10 = v.t();
            long j02 = j0();
            long j3 = MessagesController.getInstance(this.currentAccount).config.walletTransferMinNanos.get();
            int i10 = (j02 > 0L ? 1 : (j02 == 0L ? 0 : -1));
            if (i10 > 0 && j02 < j3) {
                if (this.f35239h0) {
                    k02 = f0(j3, h0());
                } else {
                    k02 = k0(j3);
                }
                this.f35254y.setAmountText(k02);
                this.E.setSelection(k02.length());
                EditTextBoldCursor editTextBoldCursor = this.E;
                int i11 = -this.f35243l0;
                this.f35243l0 = i11;
                AndroidUtilities.shakeViewSpring(editTextBoldCursor, i11);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.f35236f) && !this.f35244n && i10 > 0 && j02 <= t10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!TextUtils.isEmpty(this.E.getText()) && j02 > t10) {
                z11 = true;
            } else {
                z11 = false;
            }
            v0(z11);
            long j03 = j0();
            if (this.f35241j0 == null) {
                this.f35241j0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            }
            if (j03 > 0) {
                str = this.f35241j0.format(BigDecimal.valueOf(j03, 9));
            } else {
                str = "";
            }
            this.f35230a0.setLoading(this.f35244n);
            ci.d dVar = this.f35230a0;
            if (TextUtils.isEmpty(str)) {
                formatSpannable = LocaleController.getString(R.string.WalletSendGrams);
            } else {
                formatSpannable = LocaleController.formatSpannable(R.string.WalletSendAmount, l0.k("Grams", str, R.string.Grams_other));
            }
            dVar.g(formatSpannable, true, true);
            this.f35230a0.setEnabled(z10);
            x0();
            z0();
            if (this.f35239h0) {
                org.telegram.ui.Components.r6 r6Var = this.K;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.f35242k0 == null) {
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.f35242k0 = decimalFormat;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.f35242k0.format(BigDecimal.valueOf(j02).movePointLeft(9)));
                t0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                r6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.I));
                return;
            }
            this.K.setText(i0(v, j02));
        }
    }

    public final void x0() {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        if (this.O != null) {
            l0 v = l0.v(this.currentAccount);
            TextView textView = this.O;
            int i10 = R.string.WalletBalanceAmount;
            long t10 = v.t();
            if (v.t() < 1000000000) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setText(LocaleController.formatSpannable(i10, l0.q(t10, z10)));
            boolean z13 = this.T;
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.T = z13 | z11;
            if ((!v.C() || l0.b(v.r(), this.f35236f)) && this.T) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                long j3 = this.f35231b0;
                if (j3 >= 0) {
                    this.Q.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, l0.q(j3, false)));
                } else {
                    this.Q.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.R));
                }
            }
            if (this.S == z12) {
                return;
            }
            this.S = z12;
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.V = null;
            }
            if (z12) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!this.Q.isAttachedToWindow()) {
                s0(f7);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, f7);
            this.V = ofFloat;
            ofFloat.setDuration(320L);
            this.V.setInterpolator(is.h);
            this.V.addUpdateListener(new u2(this, 7));
            this.V.start();
        }
    }

    public final void y0() {
        final boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f35253x != null && this.L != null) {
            if (j0() <= 0 && this.M.getVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != this.f35240i0) {
                this.f35240i0 = z10;
                this.f35253x.setVisibility(0);
                this.L.setVisibility(0);
                ViewPropertyAnimator animate = this.f35253x.animate();
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
                    public final l8 f34782b;

                    {
                        this.f34782b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f34782b.f35253x;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f34782b.L;
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
                is isVar = is.h;
                duration.setInterpolator(isVar).start();
                ViewPropertyAnimator animate2 = this.L.animate();
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
                    public final l8 f34782b;

                    {
                        this.f34782b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f34782b.f35253x;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f34782b.L;
                                if (!z10) {
                                    i11 = 0;
                                } else {
                                    i11 = 4;
                                }
                                textView.setVisibility(i11);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(isVar).start();
            }
        }
    }

    public final void z0() {
        this.f35254y.d(l0.v(this.currentAccount), this.f35239h0);
    }

    public l8(String str) {
        this.f35249r = 0L;
        this.G = new v7(this, 0);
        this.H = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                l8 l8Var = l8.this;
                Runnable runnable = l8Var.G;
                if (z10 && l8Var.F && (editTextBoldCursor = l8Var.E) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    l8Var.E.post(runnable);
                }
            }
        };
        this.f35231b0 = -1L;
        this.f35235e0 = true;
        this.f35243l0 = 6;
        this.f35234e = null;
        this.f35236f = str;
        n0();
        this.f35244n = true;
        l0.v(this.currentAccount).V(str, new u7(this, 4));
    }

    @Override
    public final void U(ArrayList arrayList, e71 e71Var) {
    }

    @Override
    public final void W(r61 r61Var, View view) {
    }
}

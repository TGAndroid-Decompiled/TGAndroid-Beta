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
import ei.kb;
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
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yq;
import org.telegram.ui.a31;
import org.telegram.ui.hk0;
import org.telegram.ui.mk;
import org.telegram.ui.sn;
public final class l9 extends v61 implements NotificationCenter.NotificationCenterDelegate {
    public EditTextBoldCursor E;
    public boolean F;
    public final Runnable G;
    public final ViewTreeObserver.OnWindowFocusChangeListener H;
    public SpannableString I;
    public SpannableString J;
    public org.telegram.ui.Components.q6 K;
    public TextView L;
    public TextView M;
    public x90 N;
    public TextView O;
    public SpannableString P;
    public mk Q;
    public SpannableString R;
    public boolean S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public LinearLayout W;
    public o1.k X;
    public float Y;
    public float Z;
    public ei.d f34524a0;
    public long f34525b0;
    public boolean f34526c0;
    public TL_wallet.walletUserAddress d;
    public String f34527d0;
    public TLRPC.User e;
    public boolean f34528e0;
    public String f34529f;
    public int f34530f0;
    public int f34531g0;
    public String h;
    public boolean f34532h0;
    public boolean f34533i0;
    public DecimalFormat f34534j0;
    public DecimalFormat f34535k0;
    public int f34536l0;
    public TL_wallet.walletTransaction m0;
    public boolean f34537n;
    public l5 f34538n0;
    public x9 f34539o0;
    public sn f34540p0;
    public h6 f34541q0;
    public long f34542r;
    public int f34543r0;
    public n8 f34544s;
    public ei.m5 v;
    public FrameLayout f34545w;
    public LinearLayout f34546x;
    public k9 f34547y;

    public l9(TLRPC.User user) {
        this.f34542r = 0L;
        this.G = new u8(this, 0);
        this.H = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                l9 l9Var = l9.this;
                Runnable runnable = l9Var.G;
                if (z10 && l9Var.F && (editTextBoldCursor = l9Var.E) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    l9Var.E.post(runnable);
                }
            }
        };
        this.f34525b0 = -1L;
        this.f34528e0 = true;
        this.f34536l0 = 6;
        this.e = user;
        this.f34529f = null;
        this.f34537n = true;
        m0.w(this.currentAccount).Y(user, new w8(this, 2));
    }

    public static void Y(l9 l9Var) {
        l5.C0(l9Var.getParentActivity(), l9Var.currentAccount, l9Var.getResourceProvider());
    }

    public static void Z(l9 l9Var) {
        byte[] bArr;
        byte[] bArr2;
        String k02;
        ei.d dVar = l9Var.f34524a0;
        if (dVar.W && !dVar.N) {
            final m0 w9 = m0.w(l9Var.currentAccount);
            long j02 = l9Var.j0();
            long u10 = w9.u();
            if (!l9Var.f34537n && WalletEngine2.isValidRecipientAddress(l9Var.f34529f) && j02 > 0) {
                long j10 = MessagesController.getInstance(l9Var.currentAccount).config.walletTransferMinNanos.get();
                if (j02 < j10) {
                    if (l9Var.f34532h0) {
                        k02 = l9Var.f0(j10, l9Var.h0());
                    } else {
                        k02 = k0(j10);
                    }
                    l9Var.f34547y.setAmountText(k02);
                    l9Var.E.setSelection(k02.length());
                    EditTextBoldCursor editTextBoldCursor = l9Var.E;
                    int i10 = -l9Var.f34536l0;
                    l9Var.f34536l0 = i10;
                    AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
                } else if (j02 > u10) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    x90 x90Var = l9Var.N;
                    int i11 = -l9Var.f34536l0;
                    l9Var.f34536l0 = i11;
                    AndroidUtilities.shakeViewSpring(x90Var, i11);
                } else {
                    long j11 = l9Var.f34525b0;
                    if (j11 >= 0 && j02 + j11 > u10) {
                        j02 -= j11;
                    }
                    boolean z10 = false;
                    l9Var.F = false;
                    EditTextBoldCursor editTextBoldCursor2 = l9Var.E;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(l9Var.G);
                        l9Var.fragmentView.requestFocus();
                        AndroidUtilities.hideKeyboard(l9Var.E);
                    }
                    l9Var.f34524a0.setLoading(true);
                    l9Var.m0 = null;
                    if (l9Var.e != null && TextUtils.isEmpty(l9Var.h)) {
                        TLRPC.User user = l9Var.e;
                        long j12 = j02;
                        String str = l9Var.f34529f;
                        String str2 = l9Var.f34527d0;
                        if (l9Var.f34528e0) {
                            bArr2 = l9Var.l0();
                        } else {
                            bArr2 = null;
                        }
                        w9.b0(user, str, j12, str2, bArr2, null, null, new y8(l9Var, 0), new y8(l9Var, 1), null);
                        return;
                    }
                    final String str3 = l9Var.f34527d0;
                    if (l9Var.f34528e0) {
                        bArr = l9Var.l0();
                    } else {
                        bArr = null;
                    }
                    if (bArr != null) {
                        z10 = true;
                    }
                    if (w9.D()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = m0.f(l9Var.e, l9Var.f34529f, l9Var.h);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z10;
                        wallettransaction.date = l9Var.getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, l9Var.f34525b0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = j02;
                        AndroidUtilities.hideKeyboard(l9Var.E);
                        l5.z0(l9Var.getParentActivity(), l9Var.getCurrentAccount(), wallettransaction, new z8(l9Var, w9, j02, 0), new w8(l9Var, 3), l9Var.l0(), null, l9Var.getResourceProvider());
                        AndroidUtilities.runOnUIThread(new u8(l9Var, 2), 1000L);
                        return;
                    }
                    final long j13 = j02;
                    final boolean z11 = z10;
                    w9.h(l9Var.f34529f, j13, str3, bArr, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            String str4 = (String) obj2;
                            l9 l9Var2 = l9.this;
                            if (str4 != null) {
                                l9Var2.f34524a0.setLoading(false);
                                xc.a0(l9Var2).e0(str4, false);
                                return;
                            }
                            wallettransaction2.peer = m0.f(l9Var2.e, l9Var2.f34529f, l9Var2.h);
                            wallettransaction2.comment = str3;
                            wallettransaction2.comment_encrypted = z11;
                            wallettransaction2.date = l9Var2.getConnectionsManager().getCurrentTime();
                            AndroidUtilities.hideKeyboard(l9Var2.E);
                            l5.z0(l9Var2.getParentActivity(), l9Var2.getCurrentAccount(), wallettransaction2, new z8(l9Var2, w9, j13, 1), new w8(l9Var2, 4), l9Var2.l0(), null, l9Var2.getResourceProvider());
                            AndroidUtilities.runOnUIThread(new u8(l9Var2, 3), 1000L);
                        }
                    });
                }
            }
        }
    }

    public static void a0(l9 l9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            l9Var.f34524a0.setLoading(false);
        } else if (str != null) {
            l9Var.f34524a0.setLoading(false);
            xc.a0(l9Var).e0(str, false);
        } else if (l9Var.f34526c0) {
            org.telegram.ui.ActionBar.d5 parentLayout = l9Var.getParentLayout();
            if (parentLayout == null) {
                l9Var.finishFragment();
                return;
            }
            long j10 = l9Var.e.f20419id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && i0.a.h(1, arrayList) == l9Var) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) arrayList.get(size);
                    if ((n2Var instanceof sn) && n2Var.getCurrentAccount() == l9Var.currentAccount) {
                        sn snVar = (sn) n2Var;
                        if (snVar.a() == j10 && snVar.R3 == 0) {
                            l9Var.f34540p0 = snVar;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (l9Var.f34540p0 == null) {
                    l9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeProfileActivity, Long.valueOf(j10), Boolean.FALSE);
                    sn W9 = sn.W9(j10);
                    W9.setCurrentAccount(l9Var.currentAccount);
                    if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, W9)) {
                        l9Var.finishFragment();
                        return;
                    }
                    l9Var.f34540p0 = W9;
                }
                l9Var.finishFragment();
            }
        } else {
            l9Var.q0();
        }
    }

    public static void b0(l9 l9Var, TL_wallet.walletUserAddress walletuseraddress) {
        l9Var.f34537n = false;
        l9Var.d = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            l9Var.e = MessagesController.getInstance(l9Var.currentAccount).getUser(Long.valueOf(walletuseraddress.user_id));
        }
        u61 u61Var = l9Var.f31190a;
        if (u61Var != null) {
            u61Var.W2.N(true);
        }
        l9Var.w0();
        n8 n8Var = l9Var.f34544s;
        if (n8Var != null) {
            n8Var.a(l9Var.f34529f, l9Var.e);
        }
    }

    public static int d0(l9 l9Var) {
        return l9Var.currentAccount;
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

    public static String k0(long j10) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
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
        k9 k9Var = this.f34547y;
        float f12 = this.Y;
        if (this.X == null && f12 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        k9Var.e(f12, max, z10);
        this.f34547y.setTranslationY((((this.v.getHeight() / 2.0f) - this.f34547y.getTop()) - (this.f34547y.getHeight() / 2.0f)) * f10);
        this.K.setAlpha(this.Z);
        this.K.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.f34545w.setAlpha(this.Z);
        this.f34545w.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
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
    public final boolean X(f61 f61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.f31190a.setVisibility(8);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20986d6;
        view.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(1, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        this.actionBar.setActionBarMenuOnItemClick(new a31(this, 13));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        n8 n8Var = new n8(context, new u8(this, 5), new u8(this, 6), this.resourceProvider);
        this.f34544s = n8Var;
        frameLayout.addView(n8Var, w7.z5.a(64.0f, 16.0f, 5.0f, 16.0f, 0.0f, -2, 49));
        n8 n8Var2 = this.f34544s;
        if (n8Var2 != null) {
            n8Var2.a(this.f34529f, this.e);
        }
        ei.m5 m5Var = new ei.m5(this, context);
        this.v = m5Var;
        m5Var.setOrientation(1);
        this.v.setClipChildren(false);
        this.v.setClipToPadding(false);
        frameLayout.addView(this.v, w7.z5.e(-1, -2, 17));
        k9 k9Var = new k9(context, getResourceProvider());
        this.f34547y = k9Var;
        if (k9Var.getDiamondView().f34735f == null) {
            this.Z = 1.0f;
            this.Y = 1.0f;
        }
        this.v.addView(this.f34547y, w7.z5.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.f34547y.getEditText();
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
                l9 l9Var = l9.this;
                if (l9Var.f34532h0) {
                    BigDecimal h02 = l9Var.h0();
                    valueOf = valueOf.multiply(h02);
                    i15 = l9.g0(h02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i15) {
                    return spanned.subSequence(i13, i14);
                }
                if (l9.p0(sb3).compareTo(valueOf) > 0) {
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
        this.E.setOnEditorActionListener(new o8(this, 1));
        this.E.addTextChangedListener(new ai.u(this, 16));
        long j10 = this.f34542r;
        if (j10 > 0) {
            k9 k9Var2 = this.f34547y;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            k9Var2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.E;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.I = new SpannableString("⇅");
        yq yqVar = new yq(R.drawable.wallet_currency_exchange, 0);
        yqVar.setAlpha(0.72f);
        SpannableString spannableString = this.I;
        spannableString.setSpan(yqVar, 0, spannableString.length(), 33);
        this.J = new SpannableString("G");
        yq yqVar2 = new yq(R.drawable.wallet_gram_small, 0);
        yqVar2.recolorDrawable = false;
        SpannableString spannableString2 = this.J;
        spannableString2.setSpan(yqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(context, false, true, true, true, true);
        this.K = q6Var;
        q6Var.f29578c.m(0.35f, 320L, 3.5f, bs.h);
        this.K.setScaleProperty(0.25f);
        this.K.setText(i0(m0.w(this.currentAccount), 0L));
        org.telegram.ui.Components.q6 q6Var2 = this.K;
        int themedColor = getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.h6.f21391z6;
        q6Var2.setTextColor(org.telegram.ui.ActionBar.h6.v(themedColor, getThemedColor(i11)));
        this.K.setTextSize(AndroidUtilities.dp(14.0f));
        this.K.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        this.K.setGravity(17);
        this.K.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.K.setAllowCancel(true);
        this.K.setSizeableBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.h6.m1(0.08f, getThemedColor(i11))));
        this.v.addView(this.K, w7.z5.t(-2, 28, 49, 0, 8, 0, 0));
        w7.b6.a(this.K);
        this.K.setOnClickListener(new View.OnClickListener(this) {
            public final l9 f34908b;

            {
                this.f34908b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        this.f34908b.o0();
                        return;
                    case 1:
                        l9.Z(this.f34908b);
                        return;
                    case 2:
                        l9 l9Var = this.f34908b;
                        BigDecimal h02 = l9Var.h0();
                        if (l9Var.f34532h0 || h02.signum() > 0) {
                            long j02 = l9Var.j0();
                            l9Var.f34532h0 = !l9Var.f34532h0;
                            l9Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (l9Var.f34532h0) {
                                k02 = l9Var.f0(j02, h02);
                            } else {
                                k02 = l9.k0(j02);
                            }
                            l9Var.f34547y.setAmountText(k02);
                            l9Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    default:
                        l9.Y(this.f34908b);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34545w = frameLayout2;
        this.v.addView(frameLayout2, w7.z5.q(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34546x = linearLayout;
        linearLayout.setOrientation(1);
        this.f34545w.addView(this.f34546x, w7.z5.e(-2, -2, 49));
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
        spannableStringBuilder.setSpan(new yq(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.L.setText(spannableStringBuilder);
        this.f34545w.addView(this.L, w7.z5.a(28.0f, 0.0f, 8.0f, 0.0f, 0.0f, -2, 49));
        w7.b6.a(this.L);
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final l9 f34908b;

            {
                this.f34908b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        this.f34908b.o0();
                        return;
                    case 1:
                        l9.Z(this.f34908b);
                        return;
                    case 2:
                        l9 l9Var = this.f34908b;
                        BigDecimal h02 = l9Var.h0();
                        if (l9Var.f34532h0 || h02.signum() > 0) {
                            long j02 = l9Var.j0();
                            l9Var.f34532h0 = !l9Var.f34532h0;
                            l9Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (l9Var.f34532h0) {
                                k02 = l9Var.f0(j02, h02);
                            } else {
                                k02 = l9.k0(j02);
                            }
                            l9Var.f34547y.setAmountText(k02);
                            l9Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    default:
                        l9.Y(this.f34908b);
                        return;
                }
            }
        });
        this.f34546x.setVisibility(4);
        this.f34546x.setAlpha(0.0f);
        this.f34546x.setScaleX(0.8f);
        this.f34546x.setScaleY(0.8f);
        this.L.setVisibility(0);
        this.L.setAlpha(1.0f);
        this.L.setScaleX(1.0f);
        this.L.setScaleY(1.0f);
        this.f34533i0 = false;
        this.M = new TextView(context);
        org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, null);
        f5Var.f20825x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = f5Var.f20808c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i13 = org.telegram.ui.ActionBar.h6.kl;
        paint.setColor(getThemedColor(i13));
        f5Var.f20824w = Integer.valueOf(getThemedColor(i13));
        this.M.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        this.M.setBackground(f5Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTextColor(getThemedColor(i11));
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setMaxLines(4);
        if (TextUtils.isEmpty(this.f34527d0)) {
            this.M.setVisibility(8);
        } else {
            this.M.setText(this.f34527d0);
            this.M.setVisibility(0);
        }
        this.f34546x.addView(this.M, w7.z5.t(-2, -2, 49, 32, 12, 32, 0));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final l9 f34908b;

            {
                this.f34908b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        this.f34908b.o0();
                        return;
                    case 1:
                        l9.Z(this.f34908b);
                        return;
                    case 2:
                        l9 l9Var = this.f34908b;
                        BigDecimal h02 = l9Var.h0();
                        if (l9Var.f34532h0 || h02.signum() > 0) {
                            long j02 = l9Var.j0();
                            l9Var.f34532h0 = !l9Var.f34532h0;
                            l9Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (l9Var.f34532h0) {
                                k02 = l9Var.f0(j02, h02);
                            } else {
                                k02 = l9.k0(j02);
                            }
                            l9Var.f34547y.setAmountText(k02);
                            l9Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    default:
                        l9.Y(this.f34908b);
                        return;
                }
            }
        });
        w7.b6.b(this.M, 0.02f, 1.2f);
        y0();
        x90 x90Var = new x90(context, this.resourceProvider);
        this.N = x90Var;
        x90Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7));
        this.N.setLinkTextColor(getThemedColor(i12));
        this.N.setTextSize(1, 14.0f);
        this.N.setGravity(17);
        this.N.setTypeface(AndroidUtilities.bold());
        this.N.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        v0(false);
        this.f34546x.addView(this.N, w7.z5.t(-2, -2, 49, 0, 10, 0, 0));
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
        this.W.addView(this.O, w7.z5.t(-1, -2, 55, 16, 0, 16, 0));
        this.P = new SpannableString(">");
        yq yqVar3 = new yq(R.drawable.settings_arrow, 0);
        yqVar3.translate(0.0f, AndroidUtilities.dp(1.0f));
        SpannableString spannableString3 = this.P;
        spannableString3.setSpan(yqVar3, 0, spannableString3.length(), 33);
        mk mkVar = new mk(this, context, 7);
        this.Q = mkVar;
        mkVar.setTextColor(getThemedColor(i11));
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Q.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        this.Q.setVisibility(8);
        this.W.addView(this.Q, w7.z5.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.R = spannableString4;
        spannableString4.setSpan(new ca0(AndroidUtilities.dp(80.0f), this.Q), 0, this.R.length(), 33);
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f34524a0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletSendGrams));
        this.f34524a0.setEnabled(false);
        this.f34524a0.setOnClickListener(new View.OnClickListener(this) {
            public final l9 f34908b;

            {
                this.f34908b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        this.f34908b.o0();
                        return;
                    case 1:
                        l9.Z(this.f34908b);
                        return;
                    case 2:
                        l9 l9Var = this.f34908b;
                        BigDecimal h02 = l9Var.h0();
                        if (l9Var.f34532h0 || h02.signum() > 0) {
                            long j02 = l9Var.j0();
                            l9Var.f34532h0 = !l9Var.f34532h0;
                            l9Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (l9Var.f34532h0) {
                                k02 = l9Var.f0(j02, h02);
                            } else {
                                k02 = l9.k0(j02);
                            }
                            l9Var.f34547y.setAmountText(k02);
                            l9Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    default:
                        l9.Y(this.f34908b);
                        return;
                }
            }
        });
        this.W.addView(this.f34524a0, w7.z5.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.W, w7.z5.e(-1, -2, 87));
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
        k9 k9Var = this.f34547y;
        if (k9Var != null) {
            k9Var.getDiamondView().l(null);
        }
        o1.k kVar = this.X;
        if (kVar != null) {
            kVar.c();
        }
        this.Y = 1.0f;
        if (this.f34547y != null) {
            A0();
        }
    }

    public final String f0(long j10, BigDecimal bigDecimal) {
        int i10;
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate m0 = m0();
        if (m0 != null) {
            i10 = m0.exp;
        } else if (TextUtils.equals(m0.w(this.currentAccount).h.g(), "USD")) {
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
        f fVar = m0.w(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    public final SpannableStringBuilder i0(m0 m0Var, long j10) {
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(m0Var.l(j10, false));
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
            if (this.f34532h0) {
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
        f fVar = m0.w(this.currentAccount).h;
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
        if (WalletEngine2.isValidRecipientAddress(this.f34529f)) {
            this.f34525b0 = -1L;
            x0();
            m0 w9 = m0.w(this.currentAccount);
            if (w9.D() && !m0.a(w9.s(), this.f34529f) && this.e != null && TextUtils.isEmpty(this.h)) {
                return;
            }
            String str = this.f34529f;
            String str2 = this.f34527d0;
            if (this.f34528e0) {
                bArr = l0();
            } else {
                bArr = null;
            }
            w9.h(str, 0L, str2, bArr, new w8(this, 1));
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
            if (this.f34531g0 - this.f34530f0 > AndroidUtilities.dp(20.0f)) {
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
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
            b2Var.R = string;
            final ig.y0 y0Var = new ig.y0(this, parentActivity);
            y0Var.setTextSize(1, 18.0f);
            y0Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21092j5));
            y0Var.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21281t5));
            y0Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
            y0Var.setText(this.f34527d0);
            y0Var.setSelection(y0Var.length());
            y0Var.setInputType(147457);
            int i11 = 5;
            y0Var.setMaxLines(5);
            y0Var.setImeOptions(6);
            y0Var.setLineColors(getThemedColor(org.telegram.ui.ActionBar.h6.f21113k6), getThemedColor(org.telegram.ui.ActionBar.h6.f21130l6), getThemedColor(org.telegram.ui.ActionBar.h6.f21207p7));
            y0Var.setBackground(null);
            y0Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(parentActivity, 1, getResourceProvider());
            a2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, this.resourceProvider), 7, AndroidUtilities.dp(12.0f)));
            String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
            if (this.f34528e0 && l0() != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            a2Var.e(string2, "", z11, false, false);
            a2Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (!LocaleController.isRTL) {
                i11 = 3;
            }
            layoutParams.gravity = i11 | 16;
            a2Var.getCheckBoxView().setLayoutParams(layoutParams);
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
            a2Var.setPadding(i10, dp2, dp, AndroidUtilities.dp(12.0f));
            if (l0() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            a2Var.setEnabled(z12);
            a2Var.setOnClickListener(new t2(a2Var, 6));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(y0Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(a2Var, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
            b2Var.G = 6;
            alertDialog$Builder.n(linearLayout);
            b2Var.f20649a = AndroidUtilities.dp(292.0f);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new hk0(14));
            alertDialog$Builder.k(LocaleController.getString(R.string.Add), new e8(this, y0Var, a2Var, 2));
            b2Var.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    ig.y0 y0Var2 = ig.y0.this;
                    y0Var2.requestFocus();
                    AndroidUtilities.showKeyboard(y0Var2);
                }
            });
            b2Var.setOnDismissListener(new f4(this, 1));
            if (z10) {
                b2Var.q(250L);
            } else {
                b2Var.show();
            }
            b2Var.f20662h0 = false;
            View d = b2Var.d(-1);
            if ((d instanceof TextView) && !TextUtils.isEmpty(this.f34527d0)) {
                y0Var.addTextChangedListener(new e9(y0Var, (TextView) d));
            }
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        k9 k9Var;
        View view2;
        if (!z10 && this.f34540p0 != null && (wallettransaction = this.m0) != null && wallettransaction.localMessageId != 0 && (k9Var = this.f34547y) != null) {
            p6 diamondView = k9Var.getDiamondView();
            if (diamondView.f34735f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                h6 h6Var = new h6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.f34547y.getDiamondView(), this.f34540p0, this.m0, runnable, null);
                this.f34541q0 = h6Var;
                return h6Var.f34276m;
            }
        }
        if (!z10 && this.f34538n0 != null && this.m0 != null && this.f34547y != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            x9 x9Var = new x9(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.f34547y.getDiamondView(), this.f34538n0, this.m0, runnable, null);
            this.f34539o0 = x9Var;
            return x9Var.f35148m;
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
        h6 h6Var = this.f34541q0;
        if (h6Var != null) {
            AnimatorSet animatorSet = h6Var.f34276m;
            if (!h6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    h6Var.a(false);
                }
            }
            this.f34541q0 = null;
        }
        x9 x9Var = this.f34539o0;
        if (x9Var != null) {
            AnimatorSet animatorSet2 = x9Var.f35148m;
            if (!x9Var.f35154s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    x9Var.b();
                }
            }
            this.f34539o0 = null;
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
        this.f34530f0 = i13;
        if (this.W != null) {
            int max = Math.max(0, this.f34531g0 - i13);
            this.W.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f) + this.f34530f0);
            if (this.f34543r0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(bs.h).start();
                this.f34543r0 = max;
            }
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f34531g0 = k1Var.f44853a.f(8).d;
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
        k9 k9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (k9Var = this.f34547y) != null && this.Y < 1.0f) {
            k9Var.getDiamondView().l(new u8(this, 1));
        }
        if (z10 && !z11 && (editTextBoldCursor = this.E) != null) {
            Runnable runnable = this.G;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.f34542r > 0) {
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
        org.telegram.ui.ActionBar.d5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (!arrayList.isEmpty() && i0.a.h(1, arrayList) == this) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (n2Var instanceof t9) {
                    ((ActionBarLayout) parentLayout).a0(n2Var, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (r.c.e(2, fragmentStack) instanceof l5) && ((org.telegram.ui.ActionBar.n2) r.c.e(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.f34538n0 = (l5) r.c.e(2, fragmentStack);
            } else {
                l5 l5Var = new l5();
                l5Var.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, l5Var)) {
                    this.f34538n0 = l5Var;
                }
            }
            finishFragment();
        }
    }

    public final void r0() {
        this.f34526c0 = true;
    }

    public final void s0(float f7) {
        int i10;
        this.U = f7;
        this.Q.setAlpha(f7);
        mk mkVar = this.Q;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        mkVar.setVisibility(i10);
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
            spannableStringBuilder.setSpan(new yq(R.drawable.settings_arrow, 0).setOverrideColor(getThemedColor(org.telegram.ui.ActionBar.h6.Oh)).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new kb(this, 9), length, spannableStringBuilder.length(), 33);
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
        scaleX.scaleY(f11).setDuration(320L).setInterpolator(bs.h).start();
    }

    public final void w0() {
        boolean z10;
        boolean z11;
        String str;
        CharSequence formatSpannable;
        String k02;
        y0();
        if (this.E != null && this.f34524a0 != null) {
            m0 w9 = m0.w(this.currentAccount);
            long u10 = w9.u();
            long j02 = j0();
            long j10 = MessagesController.getInstance(this.currentAccount).config.walletTransferMinNanos.get();
            int i10 = (j02 > 0L ? 1 : (j02 == 0L ? 0 : -1));
            if (i10 > 0 && j02 < j10) {
                if (this.f34532h0) {
                    k02 = f0(j10, h0());
                } else {
                    k02 = k0(j10);
                }
                this.f34547y.setAmountText(k02);
                this.E.setSelection(k02.length());
                EditTextBoldCursor editTextBoldCursor = this.E;
                int i11 = -this.f34536l0;
                this.f34536l0 = i11;
                AndroidUtilities.shakeViewSpring(editTextBoldCursor, i11);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.f34529f) && !this.f34537n && i10 > 0 && j02 <= u10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!TextUtils.isEmpty(this.E.getText()) && j02 > u10) {
                z11 = true;
            } else {
                z11 = false;
            }
            v0(z11);
            long j03 = j0();
            if (this.f34534j0 == null) {
                this.f34534j0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            }
            if (j03 > 0) {
                str = this.f34534j0.format(BigDecimal.valueOf(j03, 9));
            } else {
                str = "";
            }
            this.f34524a0.setLoading(this.f34537n);
            ei.d dVar = this.f34524a0;
            if (TextUtils.isEmpty(str)) {
                formatSpannable = LocaleController.getString(R.string.WalletSendGrams);
            } else {
                formatSpannable = LocaleController.formatSpannable(R.string.WalletSendAmount, m0.k("Grams", str, R.string.Grams_other));
            }
            dVar.g(formatSpannable, true, true);
            this.f34524a0.setEnabled(z10);
            x0();
            z0();
            if (this.f34532h0) {
                org.telegram.ui.Components.q6 q6Var = this.K;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.f34535k0 == null) {
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.f34535k0 = decimalFormat;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.f34535k0.format(BigDecimal.valueOf(j02).movePointLeft(9)));
                t0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                q6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.I));
                return;
            }
            this.K.setText(i0(w9, j02));
        }
    }

    public final void x0() {
        boolean z10;
        boolean z11;
        boolean z12;
        float f7;
        if (this.O != null) {
            m0 w9 = m0.w(this.currentAccount);
            TextView textView = this.O;
            int i10 = R.string.WalletBalanceAmount;
            long u10 = w9.u();
            if (w9.u() < 1000000000) {
                z10 = true;
            } else {
                z10 = false;
            }
            textView.setText(LocaleController.formatSpannable(i10, m0.k("Grams", m0.o(u10, z10), R.string.Grams_other)));
            boolean z13 = this.T;
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.T = z13 | z11;
            if ((!w9.D() || m0.a(w9.s(), this.f34529f)) && this.T) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                long j10 = this.f34525b0;
                if (j10 >= 0) {
                    this.Q.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, m0.r(j10, false)));
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
            this.V.setInterpolator(bs.h);
            this.V.addUpdateListener(new u2(this, 9));
            this.V.start();
        }
    }

    public final void y0() {
        final boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f34546x != null && this.L != null) {
            if (j0() <= 0 && this.M.getVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != this.f34533i0) {
                this.f34533i0 = z10;
                this.f34546x.setVisibility(0);
                this.L.setVisibility(0);
                ViewPropertyAnimator animate = this.f34546x.animate();
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
                    public final l9 f34055b;

                    {
                        this.f34055b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f34055b.f34546x;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f34055b.L;
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
                bs bsVar = bs.h;
                duration.setInterpolator(bsVar).start();
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
                    public final l9 f34055b;

                    {
                        this.f34055b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f34055b.f34546x;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f34055b.L;
                                if (!z10) {
                                    i11 = 0;
                                } else {
                                    i11 = 4;
                                }
                                textView.setVisibility(i11);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(bsVar).start();
            }
        }
    }

    public final void z0() {
        this.f34547y.d(m0.w(this.currentAccount), this.f34532h0);
    }

    public l9(String str) {
        this(UserConfig.selectedAccount, str);
    }

    public l9(int i10, String str) {
        this.f34542r = 0L;
        this.G = new u8(this, 0);
        this.H = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                l9 l9Var = l9.this;
                Runnable runnable = l9Var.G;
                if (z10 && l9Var.F && (editTextBoldCursor = l9Var.E) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    l9Var.E.post(runnable);
                }
            }
        };
        this.f34525b0 = -1L;
        this.f34528e0 = true;
        this.f34536l0 = 6;
        setCurrentAccount(i10);
        this.e = null;
        this.f34529f = str;
        n0();
        this.f34537n = true;
        m0.w(this.currentAccount).X(str, new w8(this, 0));
    }

    @Override
    public final void U(ArrayList arrayList, s61 s61Var) {
    }

    @Override
    public final void W(f61 f61Var, View view) {
    }
}

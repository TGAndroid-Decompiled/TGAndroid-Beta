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
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yq;
import org.telegram.ui.fk0;
import org.telegram.ui.kk;
import org.telegram.ui.qn;
import org.telegram.ui.y21;
public final class i9 extends x61 implements NotificationCenter.NotificationCenterDelegate {
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
    public kk Q;
    public SpannableString R;
    public boolean S;
    public boolean T;
    public float U;
    public ValueAnimator V;
    public LinearLayout W;
    public o1.k X;
    public float Y;
    public float Z;
    public ei.d f34344a0;
    public long f34345b0;
    public boolean f34346c0;
    public TL_wallet.walletUserAddress d;
    public String f34347d0;
    public TLRPC.User e;
    public boolean f34348e0;
    public String f34349f;
    public int f34350f0;
    public int f34351g0;
    public String h;
    public boolean f34352h0;
    public boolean f34353i0;
    public DecimalFormat f34354j0;
    public DecimalFormat f34355k0;
    public int f34356l0;
    public boolean m0;
    public boolean f34357n;
    public TL_wallet.walletTransaction f34358n0;
    public o5 f34359o0;
    public v9 f34360p0;
    public qn f34361q0;
    public long f34362r;
    public e6 f34363r0;
    public k8 f34364s;
    public int f34365s0;
    public ei.m5 v;
    public FrameLayout f34366w;
    public LinearLayout f34367x;
    public h9 f34368y;

    public i9(TLRPC.User user) {
        this.f34362r = 0L;
        this.G = new r8(this, 0);
        this.H = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                i9 i9Var = i9.this;
                Runnable runnable = i9Var.G;
                if (z10 && i9Var.F && (editTextBoldCursor = i9Var.E) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    i9Var.E.post(runnable);
                }
            }
        };
        this.f34345b0 = -1L;
        this.f34348e0 = true;
        this.f34356l0 = 6;
        this.e = user;
        this.f34349f = null;
        this.f34357n = true;
        m0.w(this.currentAccount).Y(user, new t8(this, 2));
    }

    public static void Y(i9 i9Var) {
        o5.E0(i9Var.getParentActivity(), i9Var.currentAccount, i9Var.getResourceProvider());
    }

    public static void Z(final i9 i9Var) {
        byte[] bArr;
        String k02;
        ei.d dVar = i9Var.f34344a0;
        if (dVar.W && !dVar.N) {
            final m0 w9 = m0.w(i9Var.currentAccount);
            long j02 = i9Var.j0();
            long u10 = w9.u();
            if (!i9Var.f34357n && WalletEngine2.isValidRecipientAddress(i9Var.f34349f) && j02 > 0) {
                long j10 = MessagesController.getInstance(i9Var.currentAccount).config.walletTransferMinNanos.get();
                if (j02 < j10) {
                    if (i9Var.f34352h0) {
                        k02 = i9Var.f0(j10, i9Var.h0());
                    } else {
                        k02 = k0(j10);
                    }
                    i9Var.f34368y.setAmountText(k02);
                    i9Var.E.setSelection(k02.length());
                    EditTextBoldCursor editTextBoldCursor = i9Var.E;
                    int i10 = -i9Var.f34356l0;
                    i9Var.f34356l0 = i10;
                    AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
                } else if (j02 > u10) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    x90 x90Var = i9Var.N;
                    int i11 = -i9Var.f34356l0;
                    i9Var.f34356l0 = i11;
                    AndroidUtilities.shakeViewSpring(x90Var, i11);
                } else {
                    long j11 = i9Var.f34345b0;
                    if (j11 >= 0 && j02 + j11 > u10) {
                        j02 -= j11;
                    }
                    boolean z10 = false;
                    i9Var.F = false;
                    EditTextBoldCursor editTextBoldCursor2 = i9Var.E;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(i9Var.G);
                        i9Var.fragmentView.requestFocus();
                        AndroidUtilities.hideKeyboard(i9Var.E);
                    }
                    i9Var.f34344a0.setLoading(true);
                    i9Var.f34358n0 = null;
                    if (i9Var.e != null && TextUtils.isEmpty(i9Var.h)) {
                        i9Var.m0 = true;
                        TLRPC.User user = i9Var.e;
                        long j12 = j02;
                        String str = i9Var.f34349f;
                        String str2 = i9Var.f34347d0;
                        if (i9Var.f34348e0) {
                            bArr = i9Var.l0();
                        } else {
                            bArr = null;
                        }
                        w9.b0(user, str, j12, str2, bArr, null, null, new v8(i9Var, 0), new v8(i9Var, 1), null);
                        return;
                    }
                    byte[] bArr2 = null;
                    final String str3 = i9Var.f34347d0;
                    if (i9Var.f34348e0) {
                        bArr2 = i9Var.l0();
                    }
                    if (bArr2 != null) {
                        z10 = true;
                    }
                    if (w9.D()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = m0.f(i9Var.e, i9Var.f34349f, i9Var.h);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z10;
                        wallettransaction.date = i9Var.getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, i9Var.f34345b0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = j02;
                        AndroidUtilities.hideKeyboard(i9Var.E);
                        o5.B0(i9Var.getParentActivity(), i9Var.getCurrentAccount(), wallettransaction, new w8(i9Var, w9, j02, 0), new t8(i9Var, 3), i9Var.l0(), null, i9Var.getResourceProvider());
                        AndroidUtilities.runOnUIThread(new r8(i9Var, 2), 1000L);
                        return;
                    }
                    final long j13 = j02;
                    final boolean z11 = z10;
                    w9.h(i9Var.f34349f, j13, str3, bArr2, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            String str4 = (String) obj2;
                            i9 i9Var2 = i9.this;
                            if (str4 != null) {
                                i9Var2.f34344a0.setLoading(false);
                                xc.a0(i9Var2).e0(str4, false);
                                return;
                            }
                            wallettransaction2.peer = m0.f(i9Var2.e, i9Var2.f34349f, i9Var2.h);
                            wallettransaction2.comment = str3;
                            wallettransaction2.comment_encrypted = z11;
                            wallettransaction2.date = i9Var2.getConnectionsManager().getCurrentTime();
                            AndroidUtilities.hideKeyboard(i9Var2.E);
                            o5.B0(i9Var2.getParentActivity(), i9Var2.getCurrentAccount(), wallettransaction2, new w8(i9Var2, w9, j13, 1), new t8(i9Var2, 4), i9Var2.l0(), null, i9Var2.getResourceProvider());
                            AndroidUtilities.runOnUIThread(new r8(i9Var2, 3), 1000L);
                        }
                    });
                }
            }
        }
    }

    public static void a0(i9 i9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            i9Var.m0 = false;
            i9Var.f34344a0.setLoading(false);
        } else if (str != null) {
            i9Var.m0 = false;
            i9Var.f34344a0.setLoading(false);
            xc.a0(i9Var).e0(str, false);
        } else if (i9Var.f34346c0) {
            org.telegram.ui.ActionBar.d5 parentLayout = i9Var.getParentLayout();
            if (parentLayout == null) {
                i9Var.finishFragment();
                return;
            }
            long j10 = i9Var.e.f20423id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && i2.e.h(1, arrayList) == i9Var) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) arrayList.get(size);
                    if ((n2Var instanceof qn) && n2Var.getCurrentAccount() == i9Var.currentAccount) {
                        qn qnVar = (qn) n2Var;
                        if (qnVar.a() == j10 && qnVar.R3 == 0) {
                            i9Var.f34361q0 = qnVar;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).a0((org.telegram.ui.ActionBar.n2) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (i9Var.f34361q0 == null) {
                    i9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeProfileActivity, Long.valueOf(j10), Boolean.FALSE);
                    qn W9 = qn.W9(j10);
                    W9.setCurrentAccount(i9Var.currentAccount);
                    if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, W9)) {
                        i9Var.finishFragment();
                        return;
                    }
                    i9Var.f34361q0 = W9;
                }
                i9Var.finishFragment();
            }
        } else {
            i9Var.q0();
        }
    }

    public static void b0(i9 i9Var, TL_wallet.walletUserAddress walletuseraddress) {
        i9Var.f34357n = false;
        i9Var.d = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            i9Var.e = MessagesController.getInstance(i9Var.currentAccount).getUser(Long.valueOf(walletuseraddress.user_id));
        }
        w61 w61Var = i9Var.f32355a;
        if (w61Var != null) {
            w61Var.W2.N(true);
        }
        i9Var.w0();
        k8 k8Var = i9Var.f34364s;
        if (k8Var != null) {
            k8Var.a(i9Var.f34349f, i9Var.e);
        }
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
        h9 h9Var = this.f34368y;
        float f12 = this.Y;
        if (this.X == null && f12 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        h9Var.e(f12, max, z10);
        this.f34368y.setTranslationY((((this.v.getHeight() / 2.0f) - this.f34368y.getTop()) - (this.f34368y.getHeight() / 2.0f)) * f10);
        this.K.setAlpha(this.Z);
        this.K.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.f34366w.setAlpha(this.Z);
        this.f34366w.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
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
    public final boolean X(h61 h61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.f32355a.setVisibility(8);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.h6.f20990d6;
        view.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(1, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        this.actionBar.setActionBarMenuOnItemClick(new y21(this, 13));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        k8 k8Var = new k8(context, new r8(this, 5), new r8(this, 6), this.resourceProvider);
        this.f34364s = k8Var;
        frameLayout.addView(k8Var, w7.z5.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        k8 k8Var2 = this.f34364s;
        if (k8Var2 != null) {
            k8Var2.a(this.f34349f, this.e);
        }
        ei.m5 m5Var = new ei.m5(this, context);
        this.v = m5Var;
        m5Var.setOrientation(1);
        this.v.setClipChildren(false);
        this.v.setClipToPadding(false);
        frameLayout.addView(this.v, w7.z5.e(-1, -2, 17));
        h9 h9Var = new h9(context, getResourceProvider());
        this.f34368y = h9Var;
        if (h9Var.getDiamondView().f34523f == null) {
            this.Z = 1.0f;
            this.Y = 1.0f;
        }
        this.v.addView(this.f34368y, w7.z5.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.f34368y.getEditText();
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
                i9 i9Var = i9.this;
                if (i9Var.f34352h0) {
                    BigDecimal h02 = i9Var.h0();
                    valueOf = valueOf.multiply(h02);
                    i15 = i9.g0(h02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i15) {
                    return spanned.subSequence(i13, i14);
                }
                if (i9.p0(sb3).compareTo(valueOf) > 0) {
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
        this.E.setOnEditorActionListener(new l8(this, 1));
        this.E.addTextChangedListener(new ai.u(this, 16));
        long j10 = this.f34362r;
        if (j10 > 0) {
            h9 h9Var2 = this.f34368y;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            h9Var2.setAmountText(stripTrailingZeros.toPlainString());
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
        q6Var.f29479c.m(0.35f, 320L, 3.5f, bs.h);
        this.K.setScaleProperty(0.25f);
        this.K.setText(i0(m0.w(this.currentAccount), 0L));
        org.telegram.ui.Components.q6 q6Var2 = this.K;
        int themedColor = getThemedColor(i10);
        int i11 = org.telegram.ui.ActionBar.h6.f21395z6;
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
            public final i9 f34784b;

            {
                this.f34784b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        this.f34784b.o0();
                        return;
                    case 1:
                        i9.Z(this.f34784b);
                        return;
                    case 2:
                        i9 i9Var = this.f34784b;
                        BigDecimal h02 = i9Var.h0();
                        if (i9Var.f34352h0 || h02.signum() > 0) {
                            long j02 = i9Var.j0();
                            i9Var.f34352h0 = !i9Var.f34352h0;
                            i9Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (i9Var.f34352h0) {
                                k02 = i9Var.f0(j02, h02);
                            } else {
                                k02 = i9.k0(j02);
                            }
                            i9Var.f34368y.setAmountText(k02);
                            i9Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    default:
                        i9.Y(this.f34784b);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34366w = frameLayout2;
        this.v.addView(frameLayout2, w7.z5.q(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34367x = linearLayout;
        linearLayout.setOrientation(1);
        this.f34366w.addView(this.f34367x, w7.z5.e(-2, -2, 49));
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
        this.f34366w.addView(this.L, w7.z5.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w7.b6.a(this.L);
        this.L.setOnClickListener(new View.OnClickListener(this) {
            public final i9 f34784b;

            {
                this.f34784b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        this.f34784b.o0();
                        return;
                    case 1:
                        i9.Z(this.f34784b);
                        return;
                    case 2:
                        i9 i9Var = this.f34784b;
                        BigDecimal h02 = i9Var.h0();
                        if (i9Var.f34352h0 || h02.signum() > 0) {
                            long j02 = i9Var.j0();
                            i9Var.f34352h0 = !i9Var.f34352h0;
                            i9Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (i9Var.f34352h0) {
                                k02 = i9Var.f0(j02, h02);
                            } else {
                                k02 = i9.k0(j02);
                            }
                            i9Var.f34368y.setAmountText(k02);
                            i9Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    default:
                        i9.Y(this.f34784b);
                        return;
                }
            }
        });
        this.f34367x.setVisibility(4);
        this.f34367x.setAlpha(0.0f);
        this.f34367x.setScaleX(0.8f);
        this.f34367x.setScaleY(0.8f);
        this.L.setVisibility(0);
        this.L.setAlpha(1.0f);
        this.L.setScaleX(1.0f);
        this.L.setScaleY(1.0f);
        this.f34353i0 = false;
        this.M = new TextView(context);
        org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(0, true, false, null);
        f5Var.f20829x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = f5Var.f20812c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i13 = org.telegram.ui.ActionBar.h6.kl;
        paint.setColor(getThemedColor(i13));
        f5Var.f20828w = Integer.valueOf(getThemedColor(i13));
        this.M.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        this.M.setBackground(f5Var);
        this.M.setTextSize(1, 14.0f);
        this.M.setTextColor(getThemedColor(i11));
        this.M.setTypeface(AndroidUtilities.bold());
        this.M.setEllipsize(TextUtils.TruncateAt.END);
        this.M.setMaxLines(4);
        if (TextUtils.isEmpty(this.f34347d0)) {
            this.M.setVisibility(8);
        } else {
            this.M.setText(this.f34347d0);
            this.M.setVisibility(0);
        }
        this.f34367x.addView(this.M, w7.z5.t(-2, -2, 49, 32, 12, 32, 0));
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final i9 f34784b;

            {
                this.f34784b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        this.f34784b.o0();
                        return;
                    case 1:
                        i9.Z(this.f34784b);
                        return;
                    case 2:
                        i9 i9Var = this.f34784b;
                        BigDecimal h02 = i9Var.h0();
                        if (i9Var.f34352h0 || h02.signum() > 0) {
                            long j02 = i9Var.j0();
                            i9Var.f34352h0 = !i9Var.f34352h0;
                            i9Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (i9Var.f34352h0) {
                                k02 = i9Var.f0(j02, h02);
                            } else {
                                k02 = i9.k0(j02);
                            }
                            i9Var.f34368y.setAmountText(k02);
                            i9Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    default:
                        i9.Y(this.f34784b);
                        return;
                }
            }
        });
        w7.b6.b(this.M, 0.02f, 1.2f);
        y0();
        x90 x90Var = new x90(context, this.resourceProvider);
        this.N = x90Var;
        x90Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21228q7));
        this.N.setLinkTextColor(getThemedColor(i12));
        this.N.setTextSize(1, 14.0f);
        this.N.setGravity(17);
        this.N.setTypeface(AndroidUtilities.bold());
        this.N.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        v0(false);
        this.f34367x.addView(this.N, w7.z5.t(-2, -2, 49, 0, 10, 0, 0));
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
        kk kkVar = new kk(this, context, 7);
        this.Q = kkVar;
        kkVar.setTextColor(getThemedColor(i11));
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
        this.f34344a0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletSendGrams));
        this.f34344a0.setEnabled(false);
        this.f34344a0.setOnClickListener(new View.OnClickListener(this) {
            public final i9 f34784b;

            {
                this.f34784b = this;
            }

            @Override
            public final void onClick(View view2) {
                String k02;
                switch (r2) {
                    case 0:
                        this.f34784b.o0();
                        return;
                    case 1:
                        i9.Z(this.f34784b);
                        return;
                    case 2:
                        i9 i9Var = this.f34784b;
                        BigDecimal h02 = i9Var.h0();
                        if (i9Var.f34352h0 || h02.signum() > 0) {
                            long j02 = i9Var.j0();
                            i9Var.f34352h0 = !i9Var.f34352h0;
                            i9Var.z0();
                            if (j02 <= 0) {
                                k02 = "";
                            } else if (i9Var.f34352h0) {
                                k02 = i9Var.f0(j02, h02);
                            } else {
                                k02 = i9.k0(j02);
                            }
                            i9Var.f34368y.setAmountText(k02);
                            i9Var.E.setSelection(k02.length());
                            return;
                        }
                        return;
                    default:
                        i9.Y(this.f34784b);
                        return;
                }
            }
        });
        this.W.addView(this.f34344a0, w7.z5.t(-1, 48, 87, 0, 14, 0, 0));
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
        h9 h9Var = this.f34368y;
        if (h9Var != null) {
            h9Var.getDiamondView().l(null);
        }
        o1.k kVar = this.X;
        if (kVar != null) {
            kVar.c();
        }
        this.Y = 1.0f;
        if (this.f34368y != null) {
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
            if (this.f34352h0) {
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
        if (WalletEngine2.isValidRecipientAddress(this.f34349f)) {
            this.f34345b0 = -1L;
            x0();
            m0 w9 = m0.w(this.currentAccount);
            if (w9.D() && !m0.a(w9.s(), this.f34349f) && this.e != null && TextUtils.isEmpty(this.h)) {
                return;
            }
            String str = this.f34349f;
            String str2 = this.f34347d0;
            if (this.f34348e0) {
                bArr = l0();
            } else {
                bArr = null;
            }
            w9.h(str, 0L, str2, bArr, new t8(this, 1));
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
            if (this.f34351g0 - this.f34350f0 > AndroidUtilities.dp(20.0f)) {
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
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
            b2Var.R = string;
            final ig.a1 a1Var = new ig.a1(this, parentActivity);
            a1Var.setTextSize(1, 18.0f);
            a1Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21096j5));
            a1Var.setHintTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21285t5));
            a1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
            a1Var.setText(this.f34347d0);
            a1Var.setSelection(a1Var.length());
            a1Var.setInputType(147457);
            int i11 = 5;
            a1Var.setMaxLines(5);
            a1Var.setImeOptions(6);
            a1Var.setLineColors(getThemedColor(org.telegram.ui.ActionBar.h6.f21117k6), getThemedColor(org.telegram.ui.ActionBar.h6.f21134l6), getThemedColor(org.telegram.ui.ActionBar.h6.f21211p7));
            a1Var.setBackground(null);
            a1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(parentActivity, 1, getResourceProvider());
            a2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21079i6, this.resourceProvider), 7, AndroidUtilities.dp(12.0f)));
            String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
            if (this.f34348e0 && l0() != null) {
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
            linearLayout.addView(a1Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(a2Var, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
            b2Var.G = 6;
            alertDialog$Builder.n(linearLayout);
            b2Var.f20653a = AndroidUtilities.dp(292.0f);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fk0(15));
            alertDialog$Builder.k(LocaleController.getString(R.string.Add), new b8(this, a1Var, a2Var, 2));
            b2Var.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    ig.a1 a1Var2 = ig.a1.this;
                    a1Var2.requestFocus();
                    AndroidUtilities.showKeyboard(a1Var2);
                }
            });
            b2Var.setOnDismissListener(new i4(this, 1));
            if (z10) {
                b2Var.r(250L);
            } else {
                b2Var.show();
            }
            b2Var.f20666h0 = false;
            View d = b2Var.d(-1);
            if ((d instanceof TextView) && !TextUtils.isEmpty(this.f34347d0)) {
                a1Var.addTextChangedListener(new b9(a1Var, (TextView) d));
            }
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        h9 h9Var;
        View view2;
        if (!z10 && this.f34361q0 != null && (wallettransaction = this.f34358n0) != null && wallettransaction.localMessageId != 0 && (h9Var = this.f34368y) != null) {
            m6 diamondView = h9Var.getDiamondView();
            if (diamondView.f34523f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                e6 e6Var = new e6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.f34368y.getDiamondView(), this.f34361q0, this.f34358n0, runnable, null);
                this.f34363r0 = e6Var;
                return e6Var.f34162m;
            }
        }
        if (!z10 && this.f34359o0 != null && this.f34358n0 != null && this.f34368y != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            v9 v9Var = new v9(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.f34368y.getDiamondView(), this.f34359o0, this.f34358n0, runnable, null);
            this.f34360p0 = v9Var;
            return v9Var.f35038m;
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
        e6 e6Var = this.f34363r0;
        if (e6Var != null) {
            AnimatorSet animatorSet = e6Var.f34162m;
            if (!e6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    e6Var.a(false);
                }
            }
            this.f34363r0 = null;
        }
        v9 v9Var = this.f34360p0;
        if (v9Var != null) {
            AnimatorSet animatorSet2 = v9Var.f35038m;
            if (!v9Var.f35044s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    v9Var.b();
                }
            }
            this.f34360p0 = null;
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
        this.f34350f0 = i13;
        if (this.W != null) {
            int max = Math.max(0, this.f34351g0 - i13);
            this.W.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f) + this.f34350f0);
            if (this.f34365s0 != max) {
                this.W.animate().cancel();
                this.W.animate().translationY(-max).setDuration(320L).setInterpolator(bs.h).start();
                this.f34365s0 = max;
            }
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f34351g0 = k1Var.f44835a.f(8).d;
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
        h9 h9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (h9Var = this.f34368y) != null && this.Y < 1.0f) {
            h9Var.getDiamondView().l(new r8(this, 1));
        }
        if (z10 && !z11 && (editTextBoldCursor = this.E) != null) {
            Runnable runnable = this.G;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.f34362r > 0) {
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
        if (!arrayList.isEmpty() && i2.e.h(1, arrayList) == this) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (n2Var instanceof r9) {
                    ((ActionBarLayout) parentLayout).a0(n2Var, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (r4.c.f(2, fragmentStack) instanceof o5) && ((org.telegram.ui.ActionBar.n2) r4.c.f(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.f34359o0 = (o5) r4.c.f(2, fragmentStack);
            } else {
                o5 o5Var = new o5();
                o5Var.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, o5Var)) {
                    this.f34359o0 = o5Var;
                }
            }
            finishFragment();
        }
    }

    public final void r0() {
        this.f34346c0 = true;
    }

    public final void s0(float f7) {
        int i10;
        this.U = f7;
        this.Q.setAlpha(f7);
        kk kkVar = this.Q;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        kkVar.setVisibility(i10);
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
        boolean z12;
        CharSequence formatSpannable;
        String k02;
        y0();
        if (this.E != null && this.f34344a0 != null) {
            m0 w9 = m0.w(this.currentAccount);
            long u10 = w9.u();
            long j02 = j0();
            long j10 = MessagesController.getInstance(this.currentAccount).config.walletTransferMinNanos.get();
            int i10 = (j02 > 0L ? 1 : (j02 == 0L ? 0 : -1));
            if (i10 > 0 && j02 < j10) {
                if (this.f34352h0) {
                    k02 = f0(j10, h0());
                } else {
                    k02 = k0(j10);
                }
                this.f34368y.setAmountText(k02);
                this.E.setSelection(k02.length());
                EditTextBoldCursor editTextBoldCursor = this.E;
                int i11 = -this.f34356l0;
                this.f34356l0 = i11;
                AndroidUtilities.shakeViewSpring(editTextBoldCursor, i11);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.f34349f) && !this.f34357n && i10 > 0 && j02 <= u10) {
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
            if (this.f34354j0 == null) {
                this.f34354j0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            }
            if (j03 > 0) {
                str = this.f34354j0.format(BigDecimal.valueOf(j03, 9));
            } else {
                str = "";
            }
            ei.d dVar = this.f34344a0;
            if (!this.f34357n && !this.m0) {
                z12 = false;
            } else {
                z12 = true;
            }
            dVar.setLoading(z12);
            ei.d dVar2 = this.f34344a0;
            if (TextUtils.isEmpty(str)) {
                formatSpannable = LocaleController.getString(R.string.WalletSendGrams);
            } else {
                formatSpannable = LocaleController.formatSpannable(R.string.WalletSendAmount, m0.k("Grams", str, R.string.Grams_other));
            }
            dVar2.g(formatSpannable, true, true);
            this.f34344a0.setEnabled(z10);
            x0();
            z0();
            if (this.f34352h0) {
                org.telegram.ui.Components.q6 q6Var = this.K;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.J).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.f34355k0 == null) {
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.f34355k0 = decimalFormat;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.f34355k0.format(BigDecimal.valueOf(j02).movePointLeft(9)));
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
        float f7;
        if (this.O != null) {
            m0 w9 = m0.w(this.currentAccount);
            this.O.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, m0.k("Grams", m0.o(w9.u(), false), R.string.Grams_other)));
            boolean z12 = this.T;
            EditTextBoldCursor editTextBoldCursor = this.E;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T = z12 | z10;
            if ((!w9.D() || m0.a(w9.s(), this.f34349f)) && this.T) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j10 = this.f34345b0;
                if (j10 >= 0) {
                    this.Q.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, m0.r(j10, false)));
                } else {
                    this.Q.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.R));
                }
            }
            if (this.S == z11) {
                return;
            }
            this.S = z11;
            ValueAnimator valueAnimator = this.V;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.V = null;
            }
            if (z11) {
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
            this.V.addUpdateListener(new b3(this, 8));
            this.V.start();
        }
    }

    public final void y0() {
        final boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f34367x != null && this.L != null) {
            if (j0() <= 0 && this.M.getVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != this.f34353i0) {
                this.f34353i0 = z10;
                this.f34367x.setVisibility(0);
                this.L.setVisibility(0);
                ViewPropertyAnimator animate = this.f34367x.animate();
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
                    public final i9 f35158b;

                    {
                        this.f35158b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f35158b.f34367x;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f35158b.L;
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
                    public final i9 f35158b;

                    {
                        this.f35158b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f35158b.f34367x;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f35158b.L;
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
        this.f34368y.d(m0.w(this.currentAccount), this.f34352h0);
    }

    public i9(String str) {
        this(UserConfig.selectedAccount, str);
    }

    public i9(int i10, String str) {
        this.f34362r = 0L;
        this.G = new r8(this, 0);
        this.H = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                i9 i9Var = i9.this;
                Runnable runnable = i9Var.G;
                if (z10 && i9Var.F && (editTextBoldCursor = i9Var.E) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    i9Var.E.post(runnable);
                }
            }
        };
        this.f34345b0 = -1L;
        this.f34348e0 = true;
        this.f34356l0 = 6;
        setCurrentAccount(i10);
        this.e = null;
        this.f34349f = str;
        n0();
        this.f34357n = true;
        m0.w(this.currentAccount).X(str, new t8(this, 0));
    }

    @Override
    public final void U(ArrayList arrayList, u61 u61Var) {
    }

    @Override
    public final void W(h61 h61Var, View view) {
    }
}

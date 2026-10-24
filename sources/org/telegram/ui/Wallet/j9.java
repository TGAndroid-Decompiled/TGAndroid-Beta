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
import org.telegram.messenger.FileLog;
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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.zr;
import org.telegram.ui.b31;
import org.telegram.ui.lk;
import org.telegram.ui.sn;
import org.telegram.ui.wv;
public final class j9 extends d71 implements NotificationCenter.NotificationCenterDelegate {
    public ShapeDrawable E;
    public org.telegram.ui.ActionBar.j5 F;
    public EditTextBoldCursor G;
    public boolean H;
    public final Runnable I;
    public final ViewTreeObserver.OnWindowFocusChangeListener J;
    public SpannableString K;
    public SpannableString L;
    public org.telegram.ui.Components.o6 M;
    public TextView N;
    public TextView O;
    public w90 P;
    public TextView Q;
    public SpannableString R;
    public lk S;
    public SpannableString T;
    public boolean U;
    public boolean V;
    public float W;
    public ValueAnimator X;
    public LinearLayout Y;
    public o1.k Z;
    public float f34659a0;
    public float f34660b0;
    public ei.d f34661c0;
    public TL_wallet.walletUserAddress d;
    public long f34662d0;
    public TLRPC.User e;
    public boolean f34663e0;
    public String f34664f;
    public String f34665f0;
    public boolean f34666g0;
    public String h;
    public int f34667h0;
    public int f34668i0;
    public boolean f34669j0;
    public boolean f34670k0;
    public DecimalFormat f34671l0;
    public DecimalFormat m0;
    public boolean f34672n;
    public int f34673n0;
    public boolean f34674o0;
    public TL_wallet.walletTransaction f34675p0;
    public o5 f34676q0;
    public long f34677r;
    public w9 f34678r0;
    public l8 f34679s;
    public sn f34680s0;
    public e6 f34681t0;
    public int f34682u0;
    public ei.m5 v;
    public int f34683v0;
    public FrameLayout f34684w;
    public LinearLayout f34685x;
    public i9 f34686y;

    public j9(TLRPC.User user) {
        this.f34677r = 0L;
        this.I = new s8(this, 0);
        this.J = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                j9 j9Var = j9.this;
                Runnable runnable = j9Var.I;
                if (z10 && j9Var.H && (editTextBoldCursor = j9Var.G) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    j9Var.G.post(runnable);
                }
            }
        };
        this.f34662d0 = -1L;
        this.f34666g0 = true;
        this.f34673n0 = 6;
        this.e = user;
        this.f34664f = null;
        this.f34672n = true;
        l0.w(this.currentAccount).Y(user, new u8(this, 2));
    }

    public static void Y(j9 j9Var) {
        o5.E0(j9Var.getParentActivity(), j9Var.currentAccount, j9Var.getResourceProvider());
    }

    public static void Z(final j9 j9Var) {
        byte[] bArr;
        String l02;
        ei.d dVar = j9Var.f34661c0;
        if (dVar.f8862c0 && !dVar.Q) {
            final l0 w9 = l0.w(j9Var.currentAccount);
            long k02 = j9Var.k0();
            long u10 = w9.u();
            if (!j9Var.f34672n && WalletEngine2.isValidRecipientAddress(j9Var.f34664f) && k02 > 0) {
                long j10 = MessagesController.getInstance(j9Var.currentAccount).config.walletTransferMinNanos.get();
                if (k02 < j10) {
                    if (j9Var.f34669j0) {
                        l02 = j9Var.g0(j10, j9Var.i0());
                    } else {
                        l02 = l0(j10);
                    }
                    j9Var.f34686y.setAmountText(l02);
                    j9Var.G.setSelection(l02.length());
                    EditTextBoldCursor editTextBoldCursor = j9Var.G;
                    int i10 = -j9Var.f34673n0;
                    j9Var.f34673n0 = i10;
                    AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
                } else if (k02 > u10) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    w90 w90Var = j9Var.P;
                    int i11 = -j9Var.f34673n0;
                    j9Var.f34673n0 = i11;
                    AndroidUtilities.shakeViewSpring(w90Var, i11);
                } else {
                    long j11 = j9Var.f34662d0;
                    if (j11 >= 0 && k02 + j11 > u10) {
                        k02 -= j11;
                    }
                    boolean z10 = false;
                    j9Var.H = false;
                    EditTextBoldCursor editTextBoldCursor2 = j9Var.G;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(j9Var.I);
                        j9Var.fragmentView.requestFocus();
                        AndroidUtilities.hideKeyboard(j9Var.G);
                    }
                    j9Var.f34661c0.setLoading(true);
                    j9Var.f34675p0 = null;
                    if (j9Var.e != null && TextUtils.isEmpty(j9Var.h)) {
                        j9Var.f34674o0 = true;
                        TLRPC.User user = j9Var.e;
                        long j12 = k02;
                        String str = j9Var.f34664f;
                        String str2 = j9Var.f34665f0;
                        if (j9Var.f34666g0) {
                            bArr = j9Var.m0();
                        } else {
                            bArr = null;
                        }
                        w9.b0(user, str, j12, str2, bArr, null, null, new w8(j9Var, 0), new w8(j9Var, 1), null);
                        return;
                    }
                    byte[] bArr2 = null;
                    final String str3 = j9Var.f34665f0;
                    if (j9Var.f34666g0) {
                        bArr2 = j9Var.m0();
                    }
                    if (bArr2 != null) {
                        z10 = true;
                    }
                    if (w9.D()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = l0.f(j9Var.e, j9Var.f34664f, j9Var.h);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z10;
                        wallettransaction.date = j9Var.getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, j9Var.f34662d0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = k02;
                        AndroidUtilities.hideKeyboard(j9Var.G);
                        o5.B0(j9Var.getParentActivity(), j9Var.getCurrentAccount(), wallettransaction, new x8(j9Var, w9, k02, 0), new u8(j9Var, 3), j9Var.m0(), null, j9Var.getResourceProvider());
                        AndroidUtilities.runOnUIThread(new s8(j9Var, 2), 1000L);
                        return;
                    }
                    final long j13 = k02;
                    final boolean z11 = z10;
                    w9.h(j9Var.f34664f, j13, str3, bArr2, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            String str4 = (String) obj2;
                            j9 j9Var2 = j9.this;
                            if (str4 != null) {
                                j9Var2.f34661c0.setLoading(false);
                                vc.a0(j9Var2).e0(str4, false);
                                return;
                            }
                            wallettransaction2.peer = l0.f(j9Var2.e, j9Var2.f34664f, j9Var2.h);
                            wallettransaction2.comment = str3;
                            wallettransaction2.comment_encrypted = z11;
                            wallettransaction2.date = j9Var2.getConnectionsManager().getCurrentTime();
                            AndroidUtilities.hideKeyboard(j9Var2.G);
                            o5.B0(j9Var2.getParentActivity(), j9Var2.getCurrentAccount(), wallettransaction2, new x8(j9Var2, w9, j13, 1), new u8(j9Var2, 4), j9Var2.m0(), null, j9Var2.getResourceProvider());
                            AndroidUtilities.runOnUIThread(new s8(j9Var2, 3), 1000L);
                        }
                    });
                }
            }
        }
    }

    public static void a0(j9 j9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            j9Var.f34674o0 = false;
            j9Var.f34661c0.setLoading(false);
        } else if (str != null) {
            j9Var.f34674o0 = false;
            j9Var.f34661c0.setLoading(false);
            vc.a0(j9Var).e0(str, false);
        } else if (j9Var.f34663e0) {
            org.telegram.ui.ActionBar.h5 parentLayout = j9Var.getParentLayout();
            if (parentLayout == null) {
                j9Var.finishFragment();
                return;
            }
            long j10 = j9Var.e.f20491id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && i2.o1.i(1, arrayList) == j9Var) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) arrayList.get(size);
                    if ((o2Var instanceof sn) && o2Var.getCurrentAccount() == j9Var.currentAccount) {
                        sn snVar = (sn) o2Var;
                        if (snVar.a() == j10 && snVar.f41489d4 == 0) {
                            j9Var.f34680s0 = snVar;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).b0((org.telegram.ui.ActionBar.o2) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (j9Var.f34680s0 == null) {
                    j9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeProfileActivity, Long.valueOf(j10), Boolean.FALSE);
                    sn W9 = sn.W9(j10);
                    W9.setCurrentAccount(j9Var.currentAccount);
                    if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, W9)) {
                        j9Var.finishFragment();
                        return;
                    }
                    j9Var.f34680s0 = W9;
                }
                j9Var.finishFragment();
            }
        } else {
            j9Var.r0();
        }
    }

    public static void b0(j9 j9Var, TL_wallet.walletUserAddress walletuseraddress) {
        j9Var.f34672n = false;
        j9Var.d = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            j9Var.e = MessagesController.getInstance(j9Var.currentAccount).getUser(Long.valueOf(walletuseraddress.user_id));
        }
        c71 c71Var = j9Var.f25615a;
        if (c71Var != null) {
            c71Var.Z2.N(true);
        }
        j9Var.x0();
        l8 l8Var = j9Var.f34679s;
        if (l8Var != null) {
            l8Var.a(j9Var.f34664f, j9Var.e);
        }
    }

    public static int h0(BigDecimal bigDecimal) {
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

    public static String l0(long j10) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static BigDecimal q0(String str) {
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

    public static void u0(SpannableStringBuilder spannableStringBuilder, int i10, int i11, char c10) {
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
        this.f34686y.d(l0.w(this.currentAccount), this.f34669j0);
    }

    public final void B0() {
        boolean z10;
        float f7 = this.f34659a0;
        float f10 = 1.0f - f7;
        float max = Math.max(this.f34660b0, Math.max(0.0f, Math.min(1.0f, f7)));
        this.f34660b0 = max;
        float f11 = 1.0f - max;
        i9 i9Var = this.f34686y;
        float f12 = this.f34659a0;
        if (this.Z == null && f12 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        i9Var.e(f12, max, z10);
        this.f34686y.setTranslationY((((this.v.getHeight() / 2.0f) - this.f34686y.getTop()) - (this.f34686y.getHeight() / 2.0f)) * f10);
        this.M.setAlpha(this.f34660b0);
        this.M.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.f34684w.setAlpha(this.f34660b0);
        this.f34684w.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.Y.setAlpha(this.f34660b0);
        for (int i10 = 0; i10 < this.Y.getChildCount(); i10++) {
            this.Y.getChildAt(i10).setTranslationY(AndroidUtilities.dp(24.0f) * f11);
        }
    }

    @Override
    public final CharSequence V() {
        return LocaleController.getString(R.string.WalletSendMoneyTo);
    }

    @Override
    public final boolean X(l61 l61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.f25615a.setVisibility(8);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.r6.i(i10, view, getResourceProvider());
        org.telegram.ui.ActionBar.r6.i(i10, this.actionBar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(1, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        this.actionBar.setActionBarMenuOnItemClick(new b31(this, 13));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        l8 l8Var = new l8(context, new s8(this, 5), new s8(this, 6), this.resourceProvider);
        this.f34679s = l8Var;
        frameLayout.addView(l8Var, w7.z5.d(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        l8 l8Var2 = this.f34679s;
        if (l8Var2 != null) {
            l8Var2.a(this.f34664f, this.e);
        }
        ei.m5 m5Var = new ei.m5(this, context);
        this.v = m5Var;
        m5Var.setOrientation(1);
        this.v.setClipChildren(false);
        this.v.setClipToPadding(false);
        frameLayout.addView(this.v, w7.z5.e(-1, -2, 17));
        i9 i9Var = new i9(context, getResourceProvider());
        this.f34686y = i9Var;
        if (i9Var.getDiamondView().f34867f == null) {
            this.f34660b0 = 1.0f;
            this.f34659a0 = 1.0f;
        }
        this.v.addView(this.f34686y, w7.z5.t(-1, 64, 49, 16, 0, 16, 0));
        EditTextBoldCursor editText = this.f34686y.getEditText();
        this.G = editText;
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
                j9 j9Var = j9.this;
                if (j9Var.f34669j0) {
                    BigDecimal i02 = j9Var.i0();
                    valueOf = valueOf.multiply(i02);
                    i15 = j9.h0(i02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i15) {
                    return spanned.subSequence(i13, i14);
                }
                if (j9.q0(sb3).compareTo(valueOf) > 0) {
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
        this.G.setImeOptions(33554438);
        this.G.setOnEditorActionListener(new m8(this, 1));
        this.G.addTextChangedListener(new ai.u(this, 16));
        long j10 = this.f34677r;
        if (j10 > 0) {
            i9 i9Var2 = this.f34686y;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            i9Var2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.G;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.K = new SpannableString("⇅");
        vq vqVar = new vq(R.drawable.wallet_currency_exchange, 0);
        vqVar.setAlpha(0.72f);
        SpannableString spannableString = this.K;
        spannableString.setSpan(vqVar, 0, spannableString.length(), 33);
        this.L = new SpannableString("G");
        vq vqVar2 = new vq(R.drawable.wallet_gram_small, 0);
        vqVar2.recolorDrawable = false;
        SpannableString spannableString2 = this.L;
        spannableString2.setSpan(vqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true, true, true);
        this.M = o6Var;
        o6Var.f29155c.m(0.35f, 320L, 3.5f, zr.h);
        this.M.setScaleProperty(0.25f);
        this.M.setText(j0(l0.w(this.currentAccount), 0L));
        org.telegram.ui.Components.o6 o6Var2 = this.M;
        int i11 = org.telegram.ui.ActionBar.k6.f21589z6;
        org.telegram.ui.ActionBar.n6 q6 = org.telegram.ui.ActionBar.r6.q(i10, i11);
        org.telegram.ui.ActionBar.r6.n(o6Var2, q6.f21711a, q6.f21712b, 4, 0.0f, getResourceProvider());
        this.M.setTextSize(AndroidUtilities.dp(14.0f));
        this.M.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        this.M.setGravity(17);
        this.M.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.M.setAllowCancel(true);
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.08f, getThemedColor(i11));
        org.telegram.ui.Components.o6 o6Var3 = this.M;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(14.0f), o12);
        this.E = c02;
        o6Var3.setSizeableBackground(c02);
        this.v.addView(this.M, w7.z5.t(-2, 28, 49, 0, 8, 0, 0));
        w7.b6.a(this.M);
        this.M.setOnClickListener(new View.OnClickListener(this) {
            public final j9 f35115b;

            {
                this.f35115b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l02;
                switch (r2) {
                    case 0:
                        this.f35115b.p0();
                        return;
                    case 1:
                        j9.Z(this.f35115b);
                        return;
                    case 2:
                        j9 j9Var = this.f35115b;
                        BigDecimal i02 = j9Var.i0();
                        if (j9Var.f34669j0 || i02.signum() > 0) {
                            long k02 = j9Var.k0();
                            j9Var.f34669j0 = !j9Var.f34669j0;
                            j9Var.A0();
                            if (k02 <= 0) {
                                l02 = "";
                            } else if (j9Var.f34669j0) {
                                l02 = j9Var.g0(k02, i02);
                            } else {
                                l02 = j9.l0(k02);
                            }
                            j9Var.f34686y.setAmountText(l02);
                            j9Var.G.setSelection(l02.length());
                            return;
                        }
                        return;
                    default:
                        j9.Y(this.f35115b);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f34684w = frameLayout2;
        this.v.addView(frameLayout2, w7.z5.q(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f34685x = linearLayout;
        linearLayout.setOrientation(1);
        this.f34684w.addView(this.f34685x, w7.z5.e(-2, -2, 49));
        TextView textView = new TextView(context);
        this.N = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.N;
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        org.telegram.ui.ActionBar.r6.W(textView2, i12, getResourceProvider());
        org.telegram.ui.ActionBar.r6.S(this.N, org.telegram.ui.ActionBar.k6.a0(org.telegram.ui.ActionBar.k6.o1(0.1f, getThemedColor(i12)), org.telegram.ui.ActionBar.k6.o1(0.25f, getThemedColor(i12)), 14, 14), org.telegram.ui.ActionBar.r6.M(0.1f, i12), org.telegram.ui.ActionBar.r6.M(0.25f, i12), getResourceProvider());
        this.N.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.N.setGravity(17);
        this.N.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletDepositFunds));
        spannableStringBuilder.append((CharSequence) " >");
        spannableStringBuilder.setSpan(new vq(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.N.setText(spannableStringBuilder);
        this.f34684w.addView(this.N, w7.z5.d(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        w7.b6.a(this.N);
        this.N.setOnClickListener(new View.OnClickListener(this) {
            public final j9 f35115b;

            {
                this.f35115b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l02;
                switch (r2) {
                    case 0:
                        this.f35115b.p0();
                        return;
                    case 1:
                        j9.Z(this.f35115b);
                        return;
                    case 2:
                        j9 j9Var = this.f35115b;
                        BigDecimal i02 = j9Var.i0();
                        if (j9Var.f34669j0 || i02.signum() > 0) {
                            long k02 = j9Var.k0();
                            j9Var.f34669j0 = !j9Var.f34669j0;
                            j9Var.A0();
                            if (k02 <= 0) {
                                l02 = "";
                            } else if (j9Var.f34669j0) {
                                l02 = j9Var.g0(k02, i02);
                            } else {
                                l02 = j9.l0(k02);
                            }
                            j9Var.f34686y.setAmountText(l02);
                            j9Var.G.setSelection(l02.length());
                            return;
                        }
                        return;
                    default:
                        j9.Y(this.f35115b);
                        return;
                }
            }
        });
        this.f34685x.setVisibility(4);
        this.f34685x.setAlpha(0.0f);
        this.f34685x.setScaleX(0.8f);
        this.f34685x.setScaleY(0.8f);
        this.N.setVisibility(0);
        this.N.setAlpha(1.0f);
        this.N.setScaleX(1.0f);
        this.N.setScaleY(1.0f);
        this.f34670k0 = false;
        this.O = new TextView(context);
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(0, true, false, null);
        j5Var.f21017x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = j5Var.f21000c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i13 = org.telegram.ui.ActionBar.k6.kl;
        paint.setColor(getThemedColor(i13));
        j5Var.f21016w = Integer.valueOf(getThemedColor(i13));
        this.O.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        this.O.setBackground(j5Var);
        this.F = j5Var;
        this.O.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(this.O, i11, getResourceProvider());
        this.O.setTypeface(AndroidUtilities.bold());
        this.O.setEllipsize(TextUtils.TruncateAt.END);
        this.O.setMaxLines(4);
        if (TextUtils.isEmpty(this.f34665f0)) {
            this.O.setVisibility(8);
        } else {
            this.O.setText(this.f34665f0);
            this.O.setVisibility(0);
        }
        this.f34685x.addView(this.O, w7.z5.t(-2, -2, 49, 32, 12, 32, 0));
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final j9 f35115b;

            {
                this.f35115b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l02;
                switch (r2) {
                    case 0:
                        this.f35115b.p0();
                        return;
                    case 1:
                        j9.Z(this.f35115b);
                        return;
                    case 2:
                        j9 j9Var = this.f35115b;
                        BigDecimal i02 = j9Var.i0();
                        if (j9Var.f34669j0 || i02.signum() > 0) {
                            long k02 = j9Var.k0();
                            j9Var.f34669j0 = !j9Var.f34669j0;
                            j9Var.A0();
                            if (k02 <= 0) {
                                l02 = "";
                            } else if (j9Var.f34669j0) {
                                l02 = j9Var.g0(k02, i02);
                            } else {
                                l02 = j9.l0(k02);
                            }
                            j9Var.f34686y.setAmountText(l02);
                            j9Var.G.setSelection(l02.length());
                            return;
                        }
                        return;
                    default:
                        j9.Y(this.f35115b);
                        return;
                }
            }
        });
        w7.b6.b(this.O, 0.02f, 1.2f);
        z0();
        w90 w90Var = new w90(context, this.resourceProvider);
        this.P = w90Var;
        org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.f21422q7, getResourceProvider());
        org.telegram.ui.ActionBar.r6.I(this.P, i12, getResourceProvider());
        this.P.setTextSize(1, 14.0f);
        this.P.setGravity(17);
        this.P.setTypeface(AndroidUtilities.bold());
        this.P.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        w0(false);
        this.f34685x.addView(this.P, w7.z5.t(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.Y = linearLayout2;
        linearLayout2.setOrientation(1);
        this.Y.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        this.Y.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        TextView textView3 = new TextView(context);
        this.Q = textView3;
        org.telegram.ui.ActionBar.r6.W(textView3, i11, getResourceProvider());
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Y.addView(this.Q, w7.z5.t(-1, -2, 55, 16, 0, 16, 0));
        this.R = new SpannableString(">");
        vq vqVar3 = new vq(R.drawable.settings_arrow, 0);
        vqVar3.translate(0.0f, AndroidUtilities.dp(1.0f));
        SpannableString spannableString3 = this.R;
        spannableString3.setSpan(vqVar3, 0, spannableString3.length(), 33);
        lk lkVar = new lk(this, context, 7);
        this.S = lkVar;
        org.telegram.ui.ActionBar.r6.W(lkVar, i11, getResourceProvider());
        this.S.setTextSize(1, 14.0f);
        this.S.setGravity(17);
        this.S.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        this.S.setVisibility(8);
        this.Y.addView(this.S, w7.z5.t(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.T = spannableString4;
        spannableString4.setSpan(new ba0(AndroidUtilities.dp(80.0f), this.S), 0, this.T.length(), 33);
        ei.d dVar = new ei.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f34661c0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletSendGrams));
        this.f34661c0.setEnabled(false);
        this.f34661c0.setOnClickListener(new View.OnClickListener(this) {
            public final j9 f35115b;

            {
                this.f35115b = this;
            }

            @Override
            public final void onClick(View view2) {
                String l02;
                switch (r2) {
                    case 0:
                        this.f35115b.p0();
                        return;
                    case 1:
                        j9.Z(this.f35115b);
                        return;
                    case 2:
                        j9 j9Var = this.f35115b;
                        BigDecimal i02 = j9Var.i0();
                        if (j9Var.f34669j0 || i02.signum() > 0) {
                            long k02 = j9Var.k0();
                            j9Var.f34669j0 = !j9Var.f34669j0;
                            j9Var.A0();
                            if (k02 <= 0) {
                                l02 = "";
                            } else if (j9Var.f34669j0) {
                                l02 = j9Var.g0(k02, i02);
                            } else {
                                l02 = j9.l0(k02);
                            }
                            j9Var.f34686y.setAmountText(l02);
                            j9Var.G.setSelection(l02.length());
                            return;
                        }
                        return;
                    default:
                        j9.Y(this.f35115b);
                        return;
                }
            }
        });
        this.Y.addView(this.f34661c0, w7.z5.t(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.Y, w7.z5.e(-1, -2, 87));
        x0();
        B0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            y0();
            x0();
        }
    }

    public final void e0() {
        try {
            ShapeDrawable shapeDrawable = this.E;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.k6.o1(0.08f, getThemedColor(org.telegram.ui.ActionBar.k6.f21589z6)));
                this.E.invalidateSelf();
                org.telegram.ui.Components.o6 o6Var = this.M;
                if (o6Var != null) {
                    o6Var.invalidate();
                }
            }
            if (this.F != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.kl);
                this.F.f21000c.setColor(themedColor);
                this.F.f21016w = Integer.valueOf(themedColor);
                this.F.invalidateSelf();
                TextView textView = this.O;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void f0() {
        i9 i9Var = this.f34686y;
        if (i9Var != null) {
            i9Var.getDiamondView().l(null);
        }
        o1.k kVar = this.Z;
        if (kVar != null) {
            kVar.c();
        }
        this.f34659a0 = 1.0f;
        if (this.f34686y != null) {
            B0();
        }
    }

    public final String g0(long j10, BigDecimal bigDecimal) {
        int i10;
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate n02 = n0();
        if (n02 != null) {
            i10 = n02.exp;
        } else if (TextUtils.equals(l0.w(this.currentAccount).h.g(), "USD")) {
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
        int h02 = h0(bigDecimal);
        if (scale.scale() > h02) {
            scale = scale.setScale(h02, RoundingMode.DOWN);
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

    public final BigDecimal i0() {
        f fVar = l0.w(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final SpannableStringBuilder j0(l0 l0Var, long j10) {
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(l0Var.l(j10, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate n02 = n0();
        if (n02 != null && !TextUtils.isEmpty(n02.decimalSeparator)) {
            c10 = n02.decimalSeparator.charAt(0);
        } else {
            c10 = '.';
        }
        u0(spannableStringBuilder, length, length2, c10);
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.K);
    }

    public final long k0() {
        EditTextBoldCursor editTextBoldCursor = this.G;
        if (editTextBoldCursor != null) {
            BigDecimal q02 = q0(editTextBoldCursor.getText().toString());
            if (this.f34669j0) {
                BigDecimal i02 = i0();
                if (i02.signum() <= 0) {
                    return 0L;
                }
                q02 = q02.divide(i02, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
            }
            BigInteger bigInteger = q02.movePointRight(9).toBigInteger();
            if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                return Long.MAX_VALUE;
            }
            return bigInteger.longValue();
        }
        return 0L;
    }

    public final byte[] m0() {
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

    public final TL_wallet.currencyRate n0() {
        f fVar = l0.w(this.currentAccount).h;
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

    public final void o0() {
        byte[] bArr;
        if (WalletEngine2.isValidRecipientAddress(this.f34664f)) {
            this.f34662d0 = -1L;
            y0();
            l0 w9 = l0.w(this.currentAccount);
            if (w9.D() && !l0.a(w9.s(), this.f34664f) && this.e != null && TextUtils.isEmpty(this.h)) {
                return;
            }
            String str = this.f34664f;
            String str2 = this.f34665f0;
            if (this.f34666g0) {
                bArr = m0();
            } else {
                bArr = null;
            }
            w9.h(str, 0L, str2, bArr, new u8(this, 1));
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        i9 i9Var;
        View view2;
        if (!z10 && this.f34680s0 != null && (wallettransaction = this.f34675p0) != null && wallettransaction.localMessageId != 0 && (i9Var = this.f34686y) != null) {
            m6 diamondView = i9Var.getDiamondView();
            if (diamondView.f34867f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                e6 e6Var = new e6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.f34686y.getDiamondView(), this.f34680s0, this.f34675p0, runnable, null);
                this.f34681t0 = e6Var;
                return e6Var.f34450m;
            }
        }
        if (!z10 && this.f34676q0 != null && this.f34675p0 != null && this.f34686y != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            w9 w9Var = new w9(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.f34686y.getDiamondView(), this.f34676q0, this.f34675p0, runnable, null);
            this.f34678r0 = w9Var;
            return w9Var.f35370m;
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
        this.H = false;
        f0();
        e6 e6Var = this.f34681t0;
        if (e6Var != null) {
            AnimatorSet animatorSet = e6Var.f34450m;
            if (!e6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    e6Var.a(false);
                }
            }
            this.f34681t0 = null;
        }
        w9 w9Var = this.f34678r0;
        if (w9Var != null) {
            AnimatorSet animatorSet2 = w9Var.f35370m;
            if (!w9Var.f35376s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    w9Var.b();
                }
            }
            this.f34678r0 = null;
        }
        ValueAnimator valueAnimator = this.X;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.X = null;
        }
        EditTextBoldCursor editTextBoldCursor = this.G;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.I);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34667h0 = i13;
        if (this.Y != null) {
            int max = Math.max(0, this.f34668i0 - i13);
            this.Y.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f) + this.f34667h0);
            if (this.f34682u0 != max) {
                this.Y.animate().cancel();
                this.Y.animate().translationY(-max).setDuration(320L).setInterpolator(zr.h).start();
                this.f34682u0 = max;
            }
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f34668i0 = k1Var.f45250a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override
    public final void onPause() {
        f0();
        this.H = false;
        EditTextBoldCursor editTextBoldCursor = this.G;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.I);
            this.fragmentView.requestFocus();
            AndroidUtilities.hideKeyboard(this.G);
        }
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        o0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            e0();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6);
            LinearLayout linearLayout = this.Y;
            if (linearLayout != null && themedColor != this.f34683v0 && (linearLayout.getBackground() instanceof GradientDrawable)) {
                this.f34683v0 = themedColor;
                ((GradientDrawable) this.Y.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.k6.o1(0.0f, themedColor), themedColor, themedColor});
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10 && !z11 && this.H && (editTextBoldCursor = this.G) != null) {
            Runnable runnable = this.I;
            editTextBoldCursor.removeCallbacks(runnable);
            this.G.post(runnable);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        EditTextBoldCursor editTextBoldCursor;
        i9 i9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (i9Var = this.f34686y) != null && this.f34659a0 < 1.0f) {
            i9Var.getDiamondView().l(new s8(this, 1));
        }
        if (z10 && !z11 && (editTextBoldCursor = this.G) != null) {
            Runnable runnable = this.I;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.f34677r > 0) {
                EditTextBoldCursor editTextBoldCursor2 = this.G;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
            }
            this.H = true;
            this.G.requestFocus();
            this.G.post(runnable);
        }
    }

    public final void p0() {
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        int i10;
        int dp;
        boolean z12;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            if (this.f34668i0 - this.f34667h0 > AndroidUtilities.dp(20.0f)) {
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
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
            final ig.z0 z0Var = new ig.z0(this, parentActivity);
            z0Var.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.r6.W(z0Var, org.telegram.ui.ActionBar.k6.f21290j5, getResourceProvider());
            org.telegram.ui.ActionBar.r6.F(z0Var, org.telegram.ui.ActionBar.k6.f21479t5, getResourceProvider());
            z0Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
            z0Var.setText(this.f34665f0);
            z0Var.setSelection(z0Var.length());
            z0Var.setInputType(147457);
            int i11 = 5;
            z0Var.setMaxLines(5);
            z0Var.setImeOptions(6);
            org.telegram.ui.ActionBar.r6.H(z0Var, org.telegram.ui.ActionBar.k6.f21311k6, org.telegram.ui.ActionBar.k6.f21328l6, org.telegram.ui.ActionBar.k6.f21405p7, getResourceProvider());
            z0Var.setBackground(null);
            z0Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(parentActivity, 1, getResourceProvider());
            int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i12, this.resourceProvider), 7, AndroidUtilities.dp(12.0f));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
            org.telegram.ui.ActionBar.g6 g6Var = this.resourceProvider;
            z1Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(z1Var, g02, null, O, g6Var);
            String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
            if (this.f34666g0 && m0() != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            z1Var.e(string2, "", z11, false, false);
            z1Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (!LocaleController.isRTL) {
                i11 = 3;
            }
            layoutParams.gravity = i11 | 16;
            z1Var.getCheckBoxView().setLayoutParams(layoutParams);
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
            z1Var.setPadding(i10, dp2, dp, AndroidUtilities.dp(12.0f));
            if (m0() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            z1Var.setEnabled(z12);
            z1Var.setOnClickListener(new s2(z1Var, 6));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(z0Var, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(z1Var, w7.z5.t(-1, -2, 83, 8, 0, 8, 0));
            c2Var.G = 6;
            alertDialog$Builder.o(linearLayout);
            c2Var.f20743a = AndroidUtilities.dp(292.0f);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new wv(27));
            alertDialog$Builder.k(LocaleController.getString(R.string.Add), new b8(this, z0Var, z1Var, 2));
            c2Var.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    ig.z0 z0Var2 = ig.z0.this;
                    z0Var2.requestFocus();
                    AndroidUtilities.showKeyboard(z0Var2);
                }
            });
            c2Var.setOnDismissListener(new g4(this, 1));
            if (z10) {
                c2Var.r(250L);
            } else {
                c2Var.show();
            }
            c2Var.f20765j0 = false;
            View d = c2Var.d(-1);
            if ((d instanceof TextView) && !TextUtils.isEmpty(this.f34665f0)) {
                z0Var.addTextChangedListener(new c9(z0Var, (TextView) d));
            }
        }
    }

    public final void r0() {
        org.telegram.ui.ActionBar.h5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (!arrayList.isEmpty() && i2.o1.i(1, arrayList) == this) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (o2Var instanceof s9) {
                    ((ActionBarLayout) parentLayout).b0(o2Var, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (si.o0.g(2, fragmentStack) instanceof o5) && ((org.telegram.ui.ActionBar.o2) si.o0.g(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.f34676q0 = (o5) si.o0.g(2, fragmentStack);
            } else {
                o5 o5Var = new o5();
                o5Var.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, o5Var)) {
                    this.f34676q0 = o5Var;
                }
            }
            finishFragment();
        }
    }

    public final void s0() {
        this.f34663e0 = true;
    }

    public final void t0(float f7) {
        int i10;
        this.W = f7;
        this.S.setAlpha(f7);
        lk lkVar = this.S;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        lkVar.setVisibility(i10);
        ((LinearLayout.LayoutParams) this.S.getLayoutParams()).topMargin = Math.round(AndroidUtilities.dp(4.0f) * f7);
        this.S.requestLayout();
    }

    public final void v0(String str) {
        this.h = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(LocaleController.getString(R.string.WalletSendMoneyTo));
        }
    }

    public final void w0(boolean z10) {
        float f7;
        float f10 = 0.0f;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletInsufficientFunds));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletDepositFunds));
            spannableStringBuilder.append((CharSequence) " >");
            spannableStringBuilder.setSpan(new vq(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new kb(this, 9), length, spannableStringBuilder.length(), 33);
            this.P.setText(spannableStringBuilder);
        }
        ViewPropertyAnimator animate = this.P.animate();
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
        scaleX.scaleY(f11).setDuration(320L).setInterpolator(zr.h).start();
    }

    public final void x0() {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        CharSequence formatSpannable;
        String l02;
        z0();
        if (this.G != null && this.f34661c0 != null) {
            l0 w9 = l0.w(this.currentAccount);
            long u10 = w9.u();
            long k02 = k0();
            long j10 = MessagesController.getInstance(this.currentAccount).config.walletTransferMinNanos.get();
            int i10 = (k02 > 0L ? 1 : (k02 == 0L ? 0 : -1));
            if (i10 > 0 && k02 < j10) {
                if (this.f34669j0) {
                    l02 = g0(j10, i0());
                } else {
                    l02 = l0(j10);
                }
                this.f34686y.setAmountText(l02);
                this.G.setSelection(l02.length());
                EditTextBoldCursor editTextBoldCursor = this.G;
                int i11 = -this.f34673n0;
                this.f34673n0 = i11;
                AndroidUtilities.shakeViewSpring(editTextBoldCursor, i11);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.f34664f) && !this.f34672n && i10 > 0 && k02 <= u10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!TextUtils.isEmpty(this.G.getText()) && k02 > u10) {
                z11 = true;
            } else {
                z11 = false;
            }
            w0(z11);
            long k03 = k0();
            if (this.f34671l0 == null) {
                this.f34671l0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            }
            if (k03 > 0) {
                str = this.f34671l0.format(BigDecimal.valueOf(k03, 9));
            } else {
                str = "";
            }
            ei.d dVar = this.f34661c0;
            if (!this.f34672n && !this.f34674o0) {
                z12 = false;
            } else {
                z12 = true;
            }
            dVar.setLoading(z12);
            ei.d dVar2 = this.f34661c0;
            if (TextUtils.isEmpty(str)) {
                formatSpannable = LocaleController.getString(R.string.WalletSendGrams);
            } else {
                formatSpannable = LocaleController.formatSpannable(R.string.WalletSendAmount, l0.k("Grams", str, R.string.Grams_other));
            }
            dVar2.i(formatSpannable, true, true);
            this.f34661c0.setEnabled(z10);
            y0();
            A0();
            if (this.f34669j0) {
                org.telegram.ui.Components.o6 o6Var = this.M;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.L).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.m0 == null) {
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.m0 = decimalFormat;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.m0.format(BigDecimal.valueOf(k02).movePointLeft(9)));
                u0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                o6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.K));
                return;
            }
            this.M.setText(j0(w9, k02));
        }
    }

    public final void y0() {
        boolean z10;
        boolean z11;
        float f7;
        if (this.Q != null) {
            l0 w9 = l0.w(this.currentAccount);
            this.Q.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, l0.k("Grams", l0.o(w9.u(), false), R.string.Grams_other)));
            boolean z12 = this.V;
            EditTextBoldCursor editTextBoldCursor = this.G;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.V = z12 | z10;
            if ((!w9.D() || l0.a(w9.s(), this.f34664f)) && this.V) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j10 = this.f34662d0;
                if (j10 >= 0) {
                    this.S.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, l0.r(j10, false)));
                } else {
                    this.S.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.T));
                }
            }
            if (this.U == z11) {
                return;
            }
            this.U = z11;
            ValueAnimator valueAnimator = this.X;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.X = null;
            }
            if (z11) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (!this.S.isAttachedToWindow()) {
                t0(f7);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.W, f7);
            this.X = ofFloat;
            ofFloat.setDuration(320L);
            this.X.setInterpolator(zr.h);
            this.X.addUpdateListener(new a3(this, 8));
            this.X.start();
        }
    }

    public final void z0() {
        final boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f34685x != null && this.N != null) {
            if (k0() <= 0 && this.O.getVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != this.f34670k0) {
                this.f34670k0 = z10;
                this.f34685x.setVisibility(0);
                this.N.setVisibility(0);
                ViewPropertyAnimator animate = this.f34685x.animate();
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
                    public final j9 f35513b;

                    {
                        this.f35513b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f35513b.f34685x;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f35513b.N;
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
                zr zrVar = zr.h;
                duration.setInterpolator(zrVar).start();
                ViewPropertyAnimator animate2 = this.N.animate();
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
                    public final j9 f35513b;

                    {
                        this.f35513b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f35513b.f34685x;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f35513b.N;
                                if (!z10) {
                                    i11 = 0;
                                } else {
                                    i11 = 4;
                                }
                                textView.setVisibility(i11);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(zrVar).start();
            }
        }
    }

    public j9(String str) {
        this(UserConfig.selectedAccount, str);
    }

    public j9(int i10, String str) {
        this.f34677r = 0L;
        this.I = new s8(this, 0);
        this.J = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                j9 j9Var = j9.this;
                Runnable runnable = j9Var.I;
                if (z10 && j9Var.H && (editTextBoldCursor = j9Var.G) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    j9Var.G.post(runnable);
                }
            }
        };
        this.f34662d0 = -1L;
        this.f34666g0 = true;
        this.f34673n0 = 6;
        setCurrentAccount(i10);
        this.e = null;
        this.f34664f = str;
        o0();
        this.f34672n = true;
        l0.w(this.currentAccount).X(str, new u8(this, 0));
    }

    @Override
    public final void U(ArrayList arrayList, a71 a71Var) {
    }

    @Override
    public final void W(l61 l61Var, View view) {
    }
}

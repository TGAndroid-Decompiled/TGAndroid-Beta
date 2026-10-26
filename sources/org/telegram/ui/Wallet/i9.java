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
import fi.hb;
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
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.zq;
import org.telegram.ui.mk;
import org.telegram.ui.p11;
import org.telegram.ui.un;
public final class i9 extends m71 implements NotificationCenter.NotificationCenterDelegate {
    public h9 E;
    public ShapeDrawable F;
    public org.telegram.ui.ActionBar.l5 G;
    public EditTextBoldCursor H;
    public boolean I;
    public final Runnable J;
    public final ViewTreeObserver.OnWindowFocusChangeListener K;
    public SpannableString L;
    public SpannableString M;
    public org.telegram.ui.Components.s6 N;
    public TextView O;
    public TextView P;
    public z90 Q;
    public TextView R;
    public SpannableString S;
    public mk T;
    public SpannableString U;
    public boolean V;
    public boolean W;
    public float X;
    public ValueAnimator Y;
    public LinearLayout Z;
    public o1.j f36691a0;
    public float f36692b0;
    public float f36693c0;
    public fi.d f36694d0;
    public TL_wallet.walletUserAddress e;
    public long f36695e0;
    public TLRPC.User f36696f;
    public boolean f36697f0;
    public String f36698g0;
    public String h;
    public boolean f36699h0;
    public int f36700i0;
    public int f36701j0;
    public boolean f36702k0;
    public boolean f36703l0;
    public DecimalFormat m0;
    public String f36704n;
    public DecimalFormat f36705n0;
    public int f36706o0;
    public boolean f36707p0;
    public TL_wallet.walletTransaction f36708q0;
    public boolean f36709r;
    public m5 f36710r0;
    public long f36711s;
    public v9 f36712s0;
    public un f36713t0;
    public d6 f36714u0;
    public k8 v;
    public int f36715v0;
    public fi.l5 f36716w;
    public int f36717w0;
    public FrameLayout f36718x;
    public LinearLayout f36719y;

    public i9(TLRPC.User user) {
        this.f36711s = 0L;
        this.J = new r8(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                i9 i9Var = i9.this;
                Runnable runnable = i9Var.J;
                if (z10 && i9Var.I && (editTextBoldCursor = i9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    i9Var.H.post(runnable);
                }
            }
        };
        this.f36695e0 = -1L;
        this.f36699h0 = true;
        this.f36706o0 = 6;
        this.f36696f = user;
        this.h = null;
        this.f36709r = true;
        l0.w(this.currentAccount).Y(user, new t8(this, 2));
    }

    public static void Z(i9 i9Var) {
        m5.F0(i9Var.getParentActivity(), i9Var.currentAccount, i9Var.getResourceProvider());
    }

    public static void a0(final i9 i9Var) {
        byte[] bArr;
        String m0;
        fi.d dVar = i9Var.f36694d0;
        if (dVar.f10687c0 && !dVar.Q) {
            final l0 w10 = l0.w(i9Var.currentAccount);
            long l02 = i9Var.l0();
            long u10 = w10.u();
            if (!i9Var.f36709r && WalletEngine2.isValidRecipientAddress(i9Var.h) && l02 > 0) {
                long j10 = MessagesController.getInstance(i9Var.currentAccount).config.walletTransferMinNanos.get();
                if (l02 < j10) {
                    if (i9Var.f36702k0) {
                        m0 = i9Var.h0(j10, i9Var.j0());
                    } else {
                        m0 = m0(j10);
                    }
                    i9Var.E.setAmountText(m0);
                    i9Var.H.setSelection(m0.length());
                    EditTextBoldCursor editTextBoldCursor = i9Var.H;
                    int i10 = -i9Var.f36706o0;
                    i9Var.f36706o0 = i10;
                    AndroidUtilities.shakeViewSpring(editTextBoldCursor, i10);
                } else if (l02 > u10) {
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    z90 z90Var = i9Var.Q;
                    int i11 = -i9Var.f36706o0;
                    i9Var.f36706o0 = i11;
                    AndroidUtilities.shakeViewSpring(z90Var, i11);
                } else {
                    long j11 = i9Var.f36695e0;
                    if (j11 >= 0 && l02 + j11 > u10) {
                        l02 -= j11;
                    }
                    boolean z10 = false;
                    i9Var.I = false;
                    EditTextBoldCursor editTextBoldCursor2 = i9Var.H;
                    if (editTextBoldCursor2 != null) {
                        editTextBoldCursor2.removeCallbacks(i9Var.J);
                        i9Var.fragmentView.requestFocus();
                        AndroidUtilities.hideKeyboard(i9Var.H);
                    }
                    i9Var.f36694d0.setLoading(true);
                    i9Var.f36708q0 = null;
                    if (i9Var.f36696f != null && TextUtils.isEmpty(i9Var.f36704n)) {
                        i9Var.f36707p0 = true;
                        TLRPC.User user = i9Var.f36696f;
                        long j12 = l02;
                        String str = i9Var.h;
                        String str2 = i9Var.f36698g0;
                        if (i9Var.f36699h0) {
                            bArr = i9Var.n0();
                        } else {
                            bArr = null;
                        }
                        w10.b0(user, str, j12, str2, bArr, null, null, new v8(i9Var, 0), new v8(i9Var, 1), null);
                        return;
                    }
                    byte[] bArr2 = null;
                    final String str3 = i9Var.f36698g0;
                    if (i9Var.f36699h0) {
                        bArr2 = i9Var.n0();
                    }
                    if (bArr2 != null) {
                        z10 = true;
                    }
                    if (w10.D()) {
                        TL_wallet.walletTransaction wallettransaction = new TL_wallet.walletTransaction();
                        wallettransaction.peer = l0.f(i9Var.f36696f, i9Var.h, i9Var.f36704n);
                        wallettransaction.comment = str3;
                        wallettransaction.comment_encrypted = z10;
                        wallettransaction.date = i9Var.getConnectionsManager().getCurrentTime();
                        wallettransaction.fee = Math.max(0L, i9Var.f36695e0);
                        wallettransaction.gasless = true;
                        wallettransaction.amount = l02;
                        AndroidUtilities.hideKeyboard(i9Var.H);
                        m5.C0(i9Var.getParentActivity(), i9Var.getCurrentAccount(), wallettransaction, new w8(i9Var, w10, l02, 0), new t8(i9Var, 3), i9Var.n0(), null, i9Var.getResourceProvider());
                        AndroidUtilities.runOnUIThread(new r8(i9Var, 2), 1000L);
                        return;
                    }
                    final long j13 = l02;
                    final boolean z11 = z10;
                    w10.h(i9Var.h, j13, str3, bArr2, new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TL_wallet.walletTransaction wallettransaction2 = (TL_wallet.walletTransaction) obj;
                            String str4 = (String) obj2;
                            i9 i9Var2 = i9.this;
                            if (str4 != null) {
                                i9Var2.f36694d0.setLoading(false);
                                wc.b0(i9Var2).f0(str4, false);
                                return;
                            }
                            wallettransaction2.peer = l0.f(i9Var2.f36696f, i9Var2.h, i9Var2.f36704n);
                            wallettransaction2.comment = str3;
                            wallettransaction2.comment_encrypted = z11;
                            wallettransaction2.date = i9Var2.getConnectionsManager().getCurrentTime();
                            AndroidUtilities.hideKeyboard(i9Var2.H);
                            m5.C0(i9Var2.getParentActivity(), i9Var2.getCurrentAccount(), wallettransaction2, new w8(i9Var2, w10, j13, 1), new t8(i9Var2, 4), i9Var2.n0(), null, i9Var2.getResourceProvider());
                            AndroidUtilities.runOnUIThread(new r8(i9Var2, 3), 1000L);
                        }
                    });
                }
            }
        }
    }

    public static void b0(i9 i9Var, String str) {
        if ("PASSCODE_FAILED".equalsIgnoreCase(str)) {
            i9Var.f36707p0 = false;
            i9Var.f36694d0.setLoading(false);
        } else if (str != null) {
            i9Var.f36707p0 = false;
            i9Var.f36694d0.setLoading(false);
            wc.b0(i9Var).f0(str, false);
        } else if (i9Var.f36697f0) {
            org.telegram.ui.ActionBar.j5 parentLayout = i9Var.getParentLayout();
            if (parentLayout == null) {
                i9Var.finishFragment();
                return;
            }
            long j10 = i9Var.f36696f.f22176id;
            ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
            if (!arrayList.isEmpty() && ic.a.g(1, arrayList) == i9Var) {
                int size = arrayList.size() - 2;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) arrayList.get(size);
                    if ((r2Var instanceof un) && r2Var.getCurrentAccount() == i9Var.currentAccount) {
                        un unVar = (un) r2Var;
                        if (unVar.a() == j10 && unVar.f44224d4 == 0) {
                            i9Var.f36713t0 = unVar;
                            for (int size2 = arrayList.size() - 2; size2 > size; size2--) {
                                ((ActionBarLayout) parentLayout).c0((org.telegram.ui.ActionBar.r2) arrayList.get(size2), false);
                            }
                        }
                    }
                    size--;
                }
                if (i9Var.f36713t0 == null) {
                    i9Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeProfileActivity, Long.valueOf(j10), Boolean.FALSE);
                    un ba2 = un.ba(j10);
                    ba2.setCurrentAccount(i9Var.currentAccount);
                    if (!((ActionBarLayout) parentLayout).c(parentLayout.getFragmentStack().size() - 1, ba2)) {
                        i9Var.finishFragment();
                        return;
                    }
                    i9Var.f36713t0 = ba2;
                }
                i9Var.finishFragment();
            }
        } else {
            i9Var.s0();
        }
    }

    public static void c0(i9 i9Var, TL_wallet.walletUserAddress walletuseraddress) {
        i9Var.f36709r = false;
        i9Var.e = walletuseraddress;
        if (walletuseraddress != null && walletuseraddress.user_id != 0) {
            i9Var.f36696f = MessagesController.getInstance(i9Var.currentAccount).getUser(Long.valueOf(walletuseraddress.user_id));
        }
        l71 l71Var = i9Var.f30419a;
        if (l71Var != null) {
            l71Var.f32152g3.O(true);
        }
        i9Var.y0();
        k8 k8Var = i9Var.v;
        if (k8Var != null) {
            k8Var.a(i9Var.h, i9Var.f36696f);
        }
    }

    public static int i0(BigDecimal bigDecimal) {
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

    public static String m0(long j10) {
        BigDecimal stripTrailingZeros;
        BigDecimal scale = BigDecimal.valueOf(j10).movePointLeft(9).setScale(2, RoundingMode.HALF_UP);
        if (scale.signum() == 0) {
            stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
        } else {
            stripTrailingZeros = scale.stripTrailingZeros();
        }
        return stripTrailingZeros.toPlainString();
    }

    public static BigDecimal r0(String str) {
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

    public static void v0(SpannableStringBuilder spannableStringBuilder, int i10, int i11, char c10) {
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
        final boolean z10;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f36719y != null && this.O != null) {
            if (l0() <= 0 && this.P.getVisibility() != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10 != this.f36703l0) {
                this.f36703l0 = z10;
                this.f36719y.setVisibility(0);
                this.O.setVisibility(0);
                ViewPropertyAnimator animate = this.f36719y.animate();
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
                    public final i9 f37528b;

                    {
                        this.f37528b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f37528b.f36719y;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f37528b.O;
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
                ds dsVar = ds.h;
                duration.setInterpolator(dsVar).start();
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
                    public final i9 f37528b;

                    {
                        this.f37528b = this;
                    }

                    @Override
                    public final void run() {
                        int i10;
                        int i11;
                        switch (r3) {
                            case 0:
                                LinearLayout linearLayout = this.f37528b.f36719y;
                                if (z10) {
                                    i10 = 0;
                                } else {
                                    i10 = 4;
                                }
                                linearLayout.setVisibility(i10);
                                return;
                            default:
                                TextView textView = this.f37528b.O;
                                if (!z10) {
                                    i11 = 0;
                                } else {
                                    i11 = 4;
                                }
                                textView.setVisibility(i11);
                                return;
                        }
                    }
                }).setDuration(320L).setInterpolator(dsVar).start();
            }
        }
    }

    public final void B0() {
        this.E.d(l0.w(this.currentAccount), this.f36702k0);
    }

    public final void C0() {
        boolean z10;
        float f7 = this.f36692b0;
        float f10 = 1.0f - f7;
        float max = Math.max(this.f36693c0, Math.max(0.0f, Math.min(1.0f, f7)));
        this.f36693c0 = max;
        float f11 = 1.0f - max;
        h9 h9Var = this.E;
        float f12 = this.f36692b0;
        if (this.f36691a0 == null && f12 == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        h9Var.e(f12, max, z10);
        this.E.setTranslationY((((this.f36716w.getHeight() / 2.0f) - this.E.getTop()) - (this.E.getHeight() / 2.0f)) * f10);
        this.N.setAlpha(this.f36693c0);
        this.N.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.f36718x.setAlpha(this.f36693c0);
        this.f36718x.setTranslationY(AndroidUtilities.dp(16.0f) * f11);
        this.Z.setAlpha(this.f36693c0);
        for (int i10 = 0; i10 < this.Z.getChildCount(); i10++) {
            this.Z.getChildAt(i10).setTranslationY(AndroidUtilities.dp(24.0f) * f11);
        }
    }

    @Override
    public final CharSequence W() {
        return LocaleController.getString(R.string.WalletSendMoneyTo);
    }

    @Override
    public final boolean Y(t61 t61Var, View view) {
        return false;
    }

    @Override
    public final View createView(Context context) {
        BigDecimal stripTrailingZeros;
        View createView = super.createView(context);
        this.fragmentView = createView;
        createView.setFocusableInTouchMode(true);
        this.f30419a.setVisibility(8);
        View view = this.fragmentView;
        int i10 = org.telegram.ui.ActionBar.y6.f23356d6;
        org.telegram.ui.ActionBar.f7.i(i10, view, getResourceProvider());
        org.telegram.ui.ActionBar.f7.i(i10, this.actionBar, getResourceProvider());
        this.actionBar.setCastShadows(false);
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.l().a(1, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        a2.e(2, R.drawable.msg_addbot, LocaleController.getString(R.string.WalletDepositFunds));
        a2.e(3, R.drawable.menu_comments, LocaleController.getString(R.string.WalletAddComment));
        this.actionBar.setActionBarMenuOnItemClick(new p11(this, 16));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        k8 k8Var = new k8(context, new r8(this, 5), new r8(this, 6), this.resourceProvider);
        this.v = k8Var;
        frameLayout.addView(k8Var, gb1.h(-2, 64.0f, 49, 16.0f, 5.0f, 16.0f, 0.0f));
        k8 k8Var2 = this.v;
        if (k8Var2 != null) {
            k8Var2.a(this.h, this.f36696f);
        }
        fi.l5 l5Var = new fi.l5(this, context);
        this.f36716w = l5Var;
        l5Var.setOrientation(1);
        this.f36716w.setClipChildren(false);
        this.f36716w.setClipToPadding(false);
        frameLayout.addView(this.f36716w, gb1.i(-1, -2, 17));
        h9 h9Var = new h9(context, getResourceProvider());
        this.E = h9Var;
        if (h9Var.getDiamondView().f36854f == null) {
            this.f36693c0 = 1.0f;
            this.f36692b0 = 1.0f;
        }
        this.f36716w.addView(this.E, gb1.x(-1, 64, 49, 16, 0, 16, 0));
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
                i9 i9Var = i9.this;
                if (i9Var.f36702k0) {
                    BigDecimal j02 = i9Var.j0();
                    valueOf = valueOf.multiply(j02);
                    i15 = i9.i0(j02);
                }
                int max = Math.max(sb3.indexOf(46), sb3.indexOf(44));
                if (max >= 0 && (sb3.length() - max) - 1 > i15) {
                    return spanned.subSequence(i13, i14);
                }
                if (i9.r0(sb3).compareTo(valueOf) > 0) {
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
        this.H.setOnEditorActionListener(new l8(this, 1));
        this.H.addTextChangedListener(new bi.u(this, 16));
        long j10 = this.f36711s;
        if (j10 > 0) {
            h9 h9Var2 = this.E;
            BigDecimal valueOf = BigDecimal.valueOf(j10, 9);
            if (valueOf.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = valueOf.stripTrailingZeros();
            }
            h9Var2.setAmountText(stripTrailingZeros.toPlainString());
            EditTextBoldCursor editTextBoldCursor = this.H;
            editTextBoldCursor.setSelection(editTextBoldCursor.length());
        }
        this.L = new SpannableString("⇅");
        zq zqVar = new zq(R.drawable.wallet_currency_exchange, 0);
        zqVar.setAlpha(0.72f);
        SpannableString spannableString = this.L;
        spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
        this.M = new SpannableString("G");
        zq zqVar2 = new zq(R.drawable.wallet_gram_small, 0);
        zqVar2.recolorDrawable = false;
        SpannableString spannableString2 = this.M;
        spannableString2.setSpan(zqVar2, 0, spannableString2.length(), 33);
        org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(context, false, true, true, true, true);
        this.N = s6Var;
        s6Var.f32442c.m(0.35f, 320L, 3.5f, ds.h);
        this.N.setScaleProperty(0.25f);
        this.N.setText(k0(l0.w(this.currentAccount), 0L));
        org.telegram.ui.Components.s6 s6Var2 = this.N;
        int i11 = org.telegram.ui.ActionBar.y6.f23767z6;
        org.telegram.ui.ActionBar.b7 q5 = org.telegram.ui.ActionBar.f7.q(i10, i11);
        org.telegram.ui.ActionBar.f7.n(s6Var2, q5.f22485a, q5.f22486b, 4, 0.0f, getResourceProvider());
        this.N.setTextSize(AndroidUtilities.dp(14.0f));
        this.N.setTypeface(AndroidUtilities.getTypeface("fonts/gram.ttf"));
        this.N.setGravity(17);
        this.N.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.N.setAllowCancel(true);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.08f, getThemedColor(i11));
        org.telegram.ui.Components.s6 s6Var3 = this.N;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(14.0f), o12);
        this.F = c02;
        s6Var3.setSizeableBackground(c02);
        this.f36716w.addView(this.N, gb1.x(-2, 28, 49, 0, 8, 0, 0));
        gb1.b(this.N);
        this.N.setOnClickListener(new View.OnClickListener(this) {
            public final i9 f37143b;

            {
                this.f37143b = this;
            }

            @Override
            public final void onClick(View view2) {
                String m0;
                switch (r2) {
                    case 0:
                        this.f37143b.q0();
                        return;
                    case 1:
                        i9.a0(this.f37143b);
                        return;
                    case 2:
                        i9 i9Var = this.f37143b;
                        BigDecimal j02 = i9Var.j0();
                        if (i9Var.f36702k0 || j02.signum() > 0) {
                            long l02 = i9Var.l0();
                            i9Var.f36702k0 = !i9Var.f36702k0;
                            i9Var.B0();
                            if (l02 <= 0) {
                                m0 = "";
                            } else if (i9Var.f36702k0) {
                                m0 = i9Var.h0(l02, j02);
                            } else {
                                m0 = i9.m0(l02);
                            }
                            i9Var.E.setAmountText(m0);
                            i9Var.H.setSelection(m0.length());
                            return;
                        }
                        return;
                    default:
                        i9.Z(this.f37143b);
                        return;
                }
            }
        });
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f36718x = frameLayout2;
        this.f36716w.addView(frameLayout2, gb1.u(-2, -2, 49));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36719y = linearLayout;
        linearLayout.setOrientation(1);
        this.f36718x.addView(this.f36719y, gb1.i(-2, -2, 49));
        TextView textView = new TextView(context);
        this.O = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.O;
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.V(textView2, i12, getResourceProvider());
        org.telegram.ui.ActionBar.f7.R(this.O, org.telegram.ui.ActionBar.y6.a0(org.telegram.ui.ActionBar.y6.o1(0.1f, getThemedColor(i12)), org.telegram.ui.ActionBar.y6.o1(0.25f, getThemedColor(i12)), 14, 14), org.telegram.ui.ActionBar.f7.L(0.1f, i12), org.telegram.ui.ActionBar.f7.L(0.25f, i12), getResourceProvider());
        this.O.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        this.O.setGravity(17);
        this.O.setTypeface(AndroidUtilities.bold());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.WalletDepositFunds));
        spannableStringBuilder.append((CharSequence) " >");
        spannableStringBuilder.setSpan(new zq(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        this.O.setText(spannableStringBuilder);
        this.f36718x.addView(this.O, gb1.h(-2, 28.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
        gb1.b(this.O);
        this.O.setOnClickListener(new View.OnClickListener(this) {
            public final i9 f37143b;

            {
                this.f37143b = this;
            }

            @Override
            public final void onClick(View view2) {
                String m0;
                switch (r2) {
                    case 0:
                        this.f37143b.q0();
                        return;
                    case 1:
                        i9.a0(this.f37143b);
                        return;
                    case 2:
                        i9 i9Var = this.f37143b;
                        BigDecimal j02 = i9Var.j0();
                        if (i9Var.f36702k0 || j02.signum() > 0) {
                            long l02 = i9Var.l0();
                            i9Var.f36702k0 = !i9Var.f36702k0;
                            i9Var.B0();
                            if (l02 <= 0) {
                                m0 = "";
                            } else if (i9Var.f36702k0) {
                                m0 = i9Var.h0(l02, j02);
                            } else {
                                m0 = i9.m0(l02);
                            }
                            i9Var.E.setAmountText(m0);
                            i9Var.H.setSelection(m0.length());
                            return;
                        }
                        return;
                    default:
                        i9.Z(this.f37143b);
                        return;
                }
            }
        });
        this.f36719y.setVisibility(4);
        this.f36719y.setAlpha(0.0f);
        this.f36719y.setScaleX(0.8f);
        this.f36719y.setScaleY(0.8f);
        this.O.setVisibility(0);
        this.O.setAlpha(1.0f);
        this.O.setScaleX(1.0f);
        this.O.setScaleY(1.0f);
        this.f36703l0 = false;
        this.P = new TextView(context);
        org.telegram.ui.ActionBar.l5 l5Var2 = new org.telegram.ui.ActionBar.l5(0, true, false, null);
        l5Var2.f22851x = false;
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = l5Var2.f22834c;
        paint.setStyle(style);
        paint.setStrokeWidth(Math.max(1.0f, AndroidUtilities.dpf2(0.5f)));
        int i13 = org.telegram.ui.ActionBar.y6.kl;
        paint.setColor(getThemedColor(i13));
        l5Var2.f22850w = Integer.valueOf(getThemedColor(i13));
        this.P.setPadding(AndroidUtilities.dp(15.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(8.0f));
        this.P.setBackground(l5Var2);
        this.G = l5Var2;
        this.P.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(this.P, i11, getResourceProvider());
        this.P.setTypeface(AndroidUtilities.bold());
        this.P.setEllipsize(TextUtils.TruncateAt.END);
        this.P.setMaxLines(4);
        if (TextUtils.isEmpty(this.f36698g0)) {
            this.P.setVisibility(8);
        } else {
            this.P.setText(this.f36698g0);
            this.P.setVisibility(0);
        }
        this.f36719y.addView(this.P, gb1.x(-2, -2, 49, 32, 12, 32, 0));
        this.P.setOnClickListener(new View.OnClickListener(this) {
            public final i9 f37143b;

            {
                this.f37143b = this;
            }

            @Override
            public final void onClick(View view2) {
                String m0;
                switch (r2) {
                    case 0:
                        this.f37143b.q0();
                        return;
                    case 1:
                        i9.a0(this.f37143b);
                        return;
                    case 2:
                        i9 i9Var = this.f37143b;
                        BigDecimal j02 = i9Var.j0();
                        if (i9Var.f36702k0 || j02.signum() > 0) {
                            long l02 = i9Var.l0();
                            i9Var.f36702k0 = !i9Var.f36702k0;
                            i9Var.B0();
                            if (l02 <= 0) {
                                m0 = "";
                            } else if (i9Var.f36702k0) {
                                m0 = i9Var.h0(l02, j02);
                            } else {
                                m0 = i9.m0(l02);
                            }
                            i9Var.E.setAmountText(m0);
                            i9Var.H.setSelection(m0.length());
                            return;
                        }
                        return;
                    default:
                        i9.Z(this.f37143b);
                        return;
                }
            }
        });
        gb1.c(this.P, 0.02f, 1.2f);
        A0();
        z90 z90Var = new z90(context, this.resourceProvider);
        this.Q = z90Var;
        org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.f23598q7, getResourceProvider());
        org.telegram.ui.ActionBar.f7.H(this.Q, i12, getResourceProvider());
        this.Q.setTextSize(1, 14.0f);
        this.Q.setGravity(17);
        this.Q.setTypeface(AndroidUtilities.bold());
        this.Q.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
        x0(false);
        this.f36719y.addView(this.Q, gb1.x(-2, -2, 49, 0, 10, 0, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.Z = linearLayout2;
        linearLayout2.setOrientation(1);
        this.Z.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
        this.Z.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        TextView textView3 = new TextView(context);
        this.R = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, i11, getResourceProvider());
        this.R.setTextSize(1, 14.0f);
        this.R.setGravity(17);
        this.Z.addView(this.R, gb1.x(-1, -2, 55, 16, 0, 16, 0));
        this.S = new SpannableString(">");
        zq zqVar3 = new zq(R.drawable.settings_arrow, 0);
        zqVar3.translate(0.0f, AndroidUtilities.dp(1.0f));
        SpannableString spannableString3 = this.S;
        spannableString3.setSpan(zqVar3, 0, spannableString3.length(), 33);
        mk mkVar = new mk(this, context, 7);
        this.T = mkVar;
        org.telegram.ui.ActionBar.f7.V(mkVar, i11, getResourceProvider());
        this.T.setTextSize(1, 14.0f);
        this.T.setGravity(17);
        this.T.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        this.T.setVisibility(8);
        this.Z.addView(this.T, gb1.x(-1, -2, 55, 16, 0, 16, 0));
        SpannableString spannableString4 = new SpannableString(LocaleController.getString(R.string.Loading));
        this.U = spannableString4;
        spannableString4.setSpan(new ea0(AndroidUtilities.dp(80.0f), this.T), 0, this.U.length(), 33);
        fi.d dVar = new fi.d(context, getResourceProvider(), true);
        dVar.setRoundRadius(24);
        this.f36694d0 = dVar;
        dVar.setText(LocaleController.getString(R.string.WalletSendGrams));
        this.f36694d0.setEnabled(false);
        this.f36694d0.setOnClickListener(new View.OnClickListener(this) {
            public final i9 f37143b;

            {
                this.f37143b = this;
            }

            @Override
            public final void onClick(View view2) {
                String m0;
                switch (r2) {
                    case 0:
                        this.f37143b.q0();
                        return;
                    case 1:
                        i9.a0(this.f37143b);
                        return;
                    case 2:
                        i9 i9Var = this.f37143b;
                        BigDecimal j02 = i9Var.j0();
                        if (i9Var.f36702k0 || j02.signum() > 0) {
                            long l02 = i9Var.l0();
                            i9Var.f36702k0 = !i9Var.f36702k0;
                            i9Var.B0();
                            if (l02 <= 0) {
                                m0 = "";
                            } else if (i9Var.f36702k0) {
                                m0 = i9Var.h0(l02, j02);
                            } else {
                                m0 = i9.m0(l02);
                            }
                            i9Var.E.setAmountText(m0);
                            i9Var.H.setSelection(m0.length());
                            return;
                        }
                        return;
                    default:
                        i9.Z(this.f37143b);
                        return;
                }
            }
        });
        this.Z.addView(this.f36694d0, gb1.x(-1, 48, 87, 0, 14, 0, 0));
        frameLayout.addView(this.Z, gb1.i(-1, -2, 87));
        y0();
        C0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.walletUpdate) {
            z0();
            y0();
        }
    }

    public final void f0() {
        try {
            ShapeDrawable shapeDrawable = this.F;
            if (shapeDrawable != null) {
                shapeDrawable.getPaint().setColor(org.telegram.ui.ActionBar.y6.o1(0.08f, getThemedColor(org.telegram.ui.ActionBar.y6.f23767z6)));
                this.F.invalidateSelf();
                org.telegram.ui.Components.s6 s6Var = this.N;
                if (s6Var != null) {
                    s6Var.invalidate();
                }
            }
            if (this.G != null) {
                int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.kl);
                this.G.f22834c.setColor(themedColor);
                this.G.f22850w = Integer.valueOf(themedColor);
                this.G.invalidateSelf();
                TextView textView = this.P;
                if (textView != null) {
                    textView.invalidate();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void g0() {
        h9 h9Var = this.E;
        if (h9Var != null) {
            h9Var.getDiamondView().l(null);
        }
        o1.j jVar = this.f36691a0;
        if (jVar != null) {
            jVar.c();
        }
        this.f36692b0 = 1.0f;
        if (this.E != null) {
            C0();
        }
    }

    public final String h0(long j10, BigDecimal bigDecimal) {
        int i10;
        BigDecimal stripTrailingZeros;
        BigDecimal movePointLeft = BigDecimal.valueOf(j10).multiply(bigDecimal).movePointLeft(9);
        TL_wallet.currencyRate o02 = o0();
        if (o02 != null) {
            i10 = o02.exp;
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
        int i02 = i0(bigDecimal);
        if (scale.scale() > i02) {
            scale = scale.setScale(i02, RoundingMode.DOWN);
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

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final BigDecimal j0() {
        f fVar = l0.w(this.currentAccount).h;
        fVar.f();
        double h = fVar.h();
        double d = MessagesController.getInstance(this.currentAccount).config.tonUsdRate.get();
        if (h > 0.0d && d > 0.0d && !Double.isNaN(h) && !Double.isInfinite(h) && !Double.isNaN(d) && !Double.isInfinite(d)) {
            return BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(d));
        }
        return BigDecimal.ZERO;
    }

    public final SpannableStringBuilder k0(l0 l0Var, long j10) {
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("≈ ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(l0Var.l(j10, false));
        int length2 = spannableStringBuilder.length();
        TL_wallet.currencyRate o02 = o0();
        if (o02 != null && !TextUtils.isEmpty(o02.decimalSeparator)) {
            c10 = o02.decimalSeparator.charAt(0);
        } else {
            c10 = '.';
        }
        v0(spannableStringBuilder, length, length2, c10);
        return spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L);
    }

    public final long l0() {
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            BigDecimal r02 = r0(editTextBoldCursor.getText().toString());
            if (this.f36702k0) {
                BigDecimal j02 = j0();
                if (j02.signum() <= 0) {
                    return 0L;
                }
                r02 = r02.divide(j02, 9, RoundingMode.DOWN).setScale(2, RoundingMode.HALF_UP);
            }
            BigInteger bigInteger = r02.movePointRight(9).toBigInteger();
            if (bigInteger.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) > 0) {
                return Long.MAX_VALUE;
            }
            return bigInteger.longValue();
        }
        return 0L;
    }

    public final byte[] n0() {
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

    public final TL_wallet.currencyRate o0() {
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

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        View view;
        TL_wallet.walletTransaction wallettransaction;
        h9 h9Var;
        View view2;
        if (!z10 && this.f36713t0 != null && (wallettransaction = this.f36708q0) != null && wallettransaction.localMessageId != 0 && (h9Var = this.E) != null) {
            l6 diamondView = h9Var.getDiamondView();
            if (diamondView.f36854f != null && diamondView.isShown() && diamondView.getAlpha() > 0.01f && (view2 = this.fragmentView) != null && (view2.getParent() instanceof View) && getParentLayout() != null) {
                d6 d6Var = new d6(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.f36713t0, this.f36708q0, runnable, null);
                this.f36714u0 = d6Var;
                return d6Var.f36473m;
            }
        }
        if (!z10 && this.f36710r0 != null && this.f36708q0 != null && this.E != null && (view = this.fragmentView) != null && (view.getParent() instanceof View) && getParentLayout() != null) {
            v9 v9Var = new v9(getParentLayout().getView(), (View) this.fragmentView.getParent(), this.E.getDiamondView(), this.f36710r0, this.f36708q0, runnable, null);
            this.f36712s0 = v9Var;
            return v9Var.f37396m;
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
        this.I = false;
        g0();
        d6 d6Var = this.f36714u0;
        if (d6Var != null) {
            AnimatorSet animatorSet = d6Var.f36473m;
            if (!d6Var.v) {
                if (animatorSet.isStarted()) {
                    animatorSet.cancel();
                } else {
                    d6Var.a(false);
                }
            }
            this.f36714u0 = null;
        }
        v9 v9Var = this.f36712s0;
        if (v9Var != null) {
            AnimatorSet animatorSet2 = v9Var.f37396m;
            if (!v9Var.f37402s) {
                if (animatorSet2.isStarted()) {
                    animatorSet2.cancel();
                } else {
                    v9Var.b();
                }
            }
            this.f36712s0 = null;
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
        getNotificationCenter().removeObserver(this, NotificationCenter.walletUpdate);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36700i0 = i13;
        if (this.Z != null) {
            int max = Math.max(0, this.f36701j0 - i13);
            this.Z.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f) + this.f36700i0);
            if (this.f36715v0 != max) {
                this.Z.animate().cancel();
                this.Z.animate().translationY(-max).setDuration(320L).setInterpolator(ds.h).start();
                this.f36715v0 = max;
            }
        }
    }

    @Override
    public final r0.k1 onInsetsInternal(View view, r0.k1 k1Var) {
        this.f36701j0 = k1Var.f47118a.f(8).d;
        return super.onInsetsInternal(view, k1Var);
    }

    @Override
    public final void onPause() {
        g0();
        this.I = false;
        EditTextBoldCursor editTextBoldCursor = this.H;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.removeCallbacks(this.J);
            this.fragmentView.requestFocus();
            AndroidUtilities.hideKeyboard(this.H);
        }
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        p0();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            f0();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6);
            LinearLayout linearLayout = this.Z;
            if (linearLayout != null && themedColor != this.f36717w0 && (linearLayout.getBackground() instanceof GradientDrawable)) {
                this.f36717w0 = themedColor;
                ((GradientDrawable) this.Z.getBackground()).setColors(new int[]{org.telegram.ui.ActionBar.y6.o1(0.0f, themedColor), themedColor, themedColor});
            }
        } catch (Exception e) {
            FileLog.e(e);
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
        h9 h9Var;
        super.onTransitionAnimationStart(z10, z11);
        if (z10 && !z11 && (h9Var = this.E) != null && this.f36692b0 < 1.0f) {
            h9Var.getDiamondView().l(new r8(this, 1));
        }
        if (z10 && !z11 && (editTextBoldCursor = this.H) != null) {
            Runnable runnable = this.J;
            editTextBoldCursor.removeCallbacks(runnable);
            if (this.f36711s > 0) {
                EditTextBoldCursor editTextBoldCursor2 = this.H;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
            }
            this.I = true;
            this.H.requestFocus();
            this.H.post(runnable);
        }
    }

    public final void p0() {
        byte[] bArr;
        if (WalletEngine2.isValidRecipientAddress(this.h)) {
            this.f36695e0 = -1L;
            z0();
            l0 w10 = l0.w(this.currentAccount);
            if (w10.D() && !l0.a(w10.s(), this.h) && this.f36696f != null && TextUtils.isEmpty(this.f36704n)) {
                return;
            }
            String str = this.h;
            String str2 = this.f36698g0;
            if (this.f36699h0) {
                bArr = n0();
            } else {
                bArr = null;
            }
            w10.h(str, 0L, str2, bArr, new t8(this, 1));
        }
    }

    public final void q0() {
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        boolean z11;
        int i10;
        int dp;
        boolean z12;
        Activity parentActivity = getParentActivity();
        if (parentActivity != null) {
            if (this.f36701j0 - this.f36700i0 > AndroidUtilities.dp(20.0f)) {
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
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22368a;
            e2Var.R = string;
            final jg.a1 a1Var = new jg.a1(this, parentActivity);
            a1Var.setTextSize(1, 18.0f);
            org.telegram.ui.ActionBar.f7.V(a1Var, org.telegram.ui.ActionBar.y6.f23464j5, getResourceProvider());
            org.telegram.ui.ActionBar.f7.E(a1Var, org.telegram.ui.ActionBar.y6.f23653t5, getResourceProvider());
            a1Var.setHint(LocaleController.getString(R.string.WalletCommentOptionalMessage));
            a1Var.setText(this.f36698g0);
            a1Var.setSelection(a1Var.length());
            a1Var.setInputType(147457);
            int i11 = 5;
            a1Var.setMaxLines(5);
            a1Var.setImeOptions(6);
            org.telegram.ui.ActionBar.f7.G(a1Var, org.telegram.ui.ActionBar.y6.f23484k6, org.telegram.ui.ActionBar.y6.f23502l6, org.telegram.ui.ActionBar.y6.f23581p7, getResourceProvider());
            a1Var.setBackground(null);
            a1Var.setPadding(0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(48.0f), AndroidUtilities.dp(10.0f));
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(parentActivity, 1, getResourceProvider());
            int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i12, this.resourceProvider), 7, AndroidUtilities.dp(12.0f));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
            org.telegram.ui.ActionBar.u6 u6Var = this.resourceProvider;
            y1Var.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(y1Var, g02, null, N, u6Var);
            String string2 = LocaleController.getString(R.string.WalletMakeCommentPublic);
            if (this.f36699h0 && n0() != null) {
                z11 = false;
            } else {
                z11 = true;
            }
            y1Var.e(string2, "", z11, false, false);
            y1Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (!LocaleController.isRTL) {
                i11 = 3;
            }
            layoutParams.gravity = i11 | 16;
            y1Var.getCheckBoxView().setLayoutParams(layoutParams);
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
            y1Var.setPadding(i10, dp2, dp, AndroidUtilities.dp(12.0f));
            if (n0() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            y1Var.setEnabled(z12);
            y1Var.setOnClickListener(new s2(y1Var, 6));
            LinearLayout linearLayout = new LinearLayout(parentActivity);
            linearLayout.setOrientation(1);
            linearLayout.addView(a1Var, gb1.o(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
            linearLayout.addView(y1Var, gb1.x(-1, -2, 83, 8, 0, 8, 0));
            e2Var.G = 6;
            alertDialog$Builder.o(linearLayout);
            e2Var.f22555a = AndroidUtilities.dp(292.0f);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.Components.voip.c1(29));
            alertDialog$Builder.k(LocaleController.getString(R.string.Add), new b8(this, a1Var, y1Var, 2));
            e2Var.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    jg.a1 a1Var2 = jg.a1.this;
                    a1Var2.requestFocus();
                    AndroidUtilities.showKeyboard(a1Var2);
                }
            });
            e2Var.setOnDismissListener(new f4(this, 1));
            if (z10) {
                e2Var.r(250L);
            } else {
                e2Var.show();
            }
            e2Var.f22577j0 = false;
            View d = e2Var.d(-1);
            if ((d instanceof TextView) && !TextUtils.isEmpty(this.f36698g0)) {
                a1Var.addTextChangedListener(new b9(a1Var, (TextView) d));
            }
        }
    }

    public final void s0() {
        org.telegram.ui.ActionBar.j5 parentLayout = getParentLayout();
        if (parentLayout == null) {
            finishFragment();
            return;
        }
        ArrayList arrayList = new ArrayList(parentLayout.getFragmentStack());
        if (!arrayList.isEmpty() && ic.a.g(1, arrayList) == this) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                if (r2Var instanceof r9) {
                    ((ActionBarLayout) parentLayout).c0(r2Var, false);
                }
            }
            List fragmentStack = parentLayout.getFragmentStack();
            if (fragmentStack.size() >= 2 && (b10.h(2, fragmentStack) instanceof m5) && ((org.telegram.ui.ActionBar.r2) b10.h(2, fragmentStack)).getCurrentAccount() == this.currentAccount) {
                this.f36710r0 = (m5) b10.h(2, fragmentStack);
            } else {
                m5 m5Var = new m5();
                m5Var.setCurrentAccount(this.currentAccount);
                if (((ActionBarLayout) parentLayout).c(fragmentStack.size() - 1, m5Var)) {
                    this.f36710r0 = m5Var;
                }
            }
            finishFragment();
        }
    }

    public final void t0() {
        this.f36697f0 = true;
    }

    public final void u0(float f7) {
        int i10;
        this.X = f7;
        this.T.setAlpha(f7);
        mk mkVar = this.T;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        mkVar.setVisibility(i10);
        ((LinearLayout.LayoutParams) this.T.getLayoutParams()).topMargin = Math.round(AndroidUtilities.dp(4.0f) * f7);
        this.T.requestLayout();
    }

    public final void w0(String str) {
        this.f36704n = str;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            kVar.setTitle(LocaleController.getString(R.string.WalletSendMoneyTo));
        }
    }

    public final void x0(boolean z10) {
        float f7;
        float f10 = 0.0f;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletInsufficientFunds));
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.WalletDepositFunds));
            spannableStringBuilder.append((CharSequence) " >");
            spannableStringBuilder.setSpan(new zq(R.drawable.settings_arrow, 0).translate(0.0f, AndroidUtilities.dpf2(0.66f)), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new hb(this, 9), length, spannableStringBuilder.length(), 33);
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
        scaleX.scaleY(f11).setDuration(320L).setInterpolator(ds.h).start();
    }

    public final void y0() {
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        CharSequence formatSpannable;
        String m0;
        A0();
        if (this.H != null && this.f36694d0 != null) {
            l0 w10 = l0.w(this.currentAccount);
            long u10 = w10.u();
            long l02 = l0();
            long j10 = MessagesController.getInstance(this.currentAccount).config.walletTransferMinNanos.get();
            int i10 = (l02 > 0L ? 1 : (l02 == 0L ? 0 : -1));
            if (i10 > 0 && l02 < j10) {
                if (this.f36702k0) {
                    m0 = h0(j10, j0());
                } else {
                    m0 = m0(j10);
                }
                this.E.setAmountText(m0);
                this.H.setSelection(m0.length());
                EditTextBoldCursor editTextBoldCursor = this.H;
                int i11 = -this.f36706o0;
                this.f36706o0 = i11;
                AndroidUtilities.shakeViewSpring(editTextBoldCursor, i11);
                return;
            }
            if (WalletEngine2.isValidRecipientAddress(this.h) && !this.f36709r && i10 > 0 && l02 <= u10) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!TextUtils.isEmpty(this.H.getText()) && l02 > u10) {
                z11 = true;
            } else {
                z11 = false;
            }
            x0(z11);
            long l03 = l0();
            if (this.m0 == null) {
                this.m0 = new DecimalFormat("#,##0.#########", new DecimalFormatSymbols(Locale.US));
            }
            if (l03 > 0) {
                str = this.m0.format(BigDecimal.valueOf(l03, 9));
            } else {
                str = "";
            }
            fi.d dVar = this.f36694d0;
            if (!this.f36709r && !this.f36707p0) {
                z12 = false;
            } else {
                z12 = true;
            }
            dVar.setLoading(z12);
            fi.d dVar2 = this.f36694d0;
            if (TextUtils.isEmpty(str)) {
                formatSpannable = LocaleController.getString(R.string.WalletSendGrams);
            } else {
                formatSpannable = LocaleController.formatSpannable(R.string.WalletSendAmount, l0.k("Grams", str, R.string.Grams_other));
            }
            dVar2.i(formatSpannable, true, true);
            this.f36694d0.setEnabled(z10);
            z0();
            B0();
            if (this.f36702k0) {
                org.telegram.ui.Components.s6 s6Var = this.N;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) this.M).append((CharSequence) " ");
                int length = spannableStringBuilder.length();
                if (this.f36705n0 == null) {
                    DecimalFormat decimalFormat = new DecimalFormat("#,##0.##", new DecimalFormatSymbols(Locale.US));
                    this.f36705n0 = decimalFormat;
                    decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
                }
                spannableStringBuilder.append((CharSequence) this.f36705n0.format(BigDecimal.valueOf(l02).movePointLeft(9)));
                v0(spannableStringBuilder, length, spannableStringBuilder.length(), '.');
                spannableStringBuilder.append((CharSequence) " ");
                int length2 = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GramCurrency));
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85714287f), length2, spannableStringBuilder.length(), 33);
                s6Var.setText(spannableStringBuilder.append((CharSequence) " ").append((CharSequence) this.L));
                return;
            }
            this.N.setText(k0(w10, l02));
        }
    }

    public final void z0() {
        boolean z10;
        boolean z11;
        float f7;
        if (this.R != null) {
            l0 w10 = l0.w(this.currentAccount);
            this.R.setText(LocaleController.formatSpannable(R.string.WalletBalanceAmount, l0.k("Grams", l0.o(w10.u(), false), R.string.Grams_other)));
            boolean z12 = this.W;
            EditTextBoldCursor editTextBoldCursor = this.H;
            if (editTextBoldCursor != null && !TextUtils.isEmpty(editTextBoldCursor.getText())) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.W = z12 | z10;
            if ((!w10.D() || l0.a(w10.s(), this.h)) && this.W) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                long j10 = this.f36695e0;
                if (j10 >= 0) {
                    this.T.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, l0.r(j10, false)));
                } else {
                    this.T.setText(LocaleController.formatSpannable(R.string.WalletNetworkFeeAmount, this.U));
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
                u0(f7);
                return;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.X, f7);
            this.Y = ofFloat;
            ofFloat.setDuration(320L);
            this.Y.setInterpolator(ds.h);
            this.Y.addUpdateListener(new a3(this, 8));
            this.Y.start();
        }
    }

    public i9(String str) {
        this(UserConfig.selectedAccount, str);
    }

    public i9(int i10, String str) {
        this.f36711s = 0L;
        this.J = new r8(this, 0);
        this.K = new ViewTreeObserver.OnWindowFocusChangeListener() {
            @Override
            public final void onWindowFocusChanged(boolean z10) {
                EditTextBoldCursor editTextBoldCursor;
                i9 i9Var = i9.this;
                Runnable runnable = i9Var.J;
                if (z10 && i9Var.I && (editTextBoldCursor = i9Var.H) != null) {
                    editTextBoldCursor.removeCallbacks(runnable);
                    i9Var.H.post(runnable);
                }
            }
        };
        this.f36695e0 = -1L;
        this.f36699h0 = true;
        this.f36706o0 = 6;
        setCurrentAccount(i10);
        this.f36696f = null;
        this.h = str;
        p0();
        this.f36709r = true;
        l0.w(this.currentAccount).X(str, new t8(this, 0));
    }

    @Override
    public final void V(ArrayList arrayList, j71 j71Var) {
    }

    @Override
    public final void X(t61 t61Var, View view) {
    }
}

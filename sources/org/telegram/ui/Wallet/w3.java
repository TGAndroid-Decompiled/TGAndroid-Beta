package org.telegram.ui.Wallet;

import ai.xb;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.yq;
import org.telegram.ui.LaunchActivity;
public final class w3 implements Utilities.Callback {
    public final LinearLayout f35025a;
    public final o4 f35026b;
    public final org.telegram.ui.ActionBar.d6 f35027c;
    public final int d;
    public final TextView e;
    public final k2[] f35028f;
    public final j01 f35029g;
    public final Utilities.Callback3 h;
    public final Context f35030i;
    public final TextView[] f35031j;
    public final int f35032k;
    public final SpannableString[] f35033l;

    public w3(LinearLayout linearLayout, o4 o4Var, org.telegram.ui.ActionBar.d6 d6Var, int i10, TextView textView, k2[] k2VarArr, j01 j01Var, Utilities.Callback3 callback3, Context context, TextView[] textViewArr, int i11, SpannableString[] spannableStringArr) {
        this.f35025a = linearLayout;
        this.f35026b = o4Var;
        this.f35027c = d6Var;
        this.d = i10;
        this.e = textView;
        this.f35028f = k2VarArr;
        this.f35029g = j01Var;
        this.h = callback3;
        this.f35030i = context;
        this.f35031j = textViewArr;
        this.f35032k = i11;
        this.f35033l = spannableStringArr;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j10;
        k2 k2Var;
        xa xaVar;
        String str;
        k2 k2Var2;
        xa xaVar2;
        final k2[] k2VarArr;
        int i10;
        int i11;
        d4 d4Var;
        j01 j01Var;
        int i12;
        boolean z14;
        boolean z15;
        CharSequence charSequence;
        char c10;
        String str2;
        ?? r32;
        int i13;
        char c11;
        int i14;
        u3 u3Var;
        int w02;
        String str3;
        boolean z16;
        int i15;
        char c12;
        k2 k2Var3;
        xa xaVar3;
        CharSequence a2;
        int i16;
        int i17;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        long abs = Math.abs(wallettransaction.amount);
        boolean z17 = wallettransaction.incoming;
        long abs2 = Math.abs(wallettransaction.fee);
        if (!wallettransaction.pending && !wallettransaction.failed) {
            z10 = false;
        } else {
            z10 = true;
        }
        LinearLayout linearLayout = this.f35025a;
        if ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof c91) && ((c91) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z18 = wallettransaction.key_change;
        org.telegram.ui.ActionBar.d6 d6Var = this.f35027c;
        int i18 = this.d;
        k2[] k2VarArr2 = this.f35028f;
        if (!z18 && wallettransaction.nft == null) {
            if (z10) {
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21398z6, d6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, d6Var);
            }
            o4 o4Var = this.f35026b;
            o4Var.setTextColor(w02);
            SpannableStringBuilder p5 = m0.p(m0.n(abs, false), 0.75f);
            if (z17) {
                str3 = "+";
            } else {
                str3 = "–";
            }
            z12 = z17;
            p5.insert(0, (CharSequence) str3);
            if (!z10) {
                if (z12) {
                    i17 = org.telegram.ui.ActionBar.h6.uj;
                } else {
                    i17 = org.telegram.ui.ActionBar.h6.G6;
                }
                z13 = z10;
                z16 = z11;
                p5.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(i17, d6Var)), 0, p5.length(), 33);
            } else {
                z13 = z10;
                z16 = z11;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) m0.k("Grams", p5, R.string.Grams_other));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, p5);
            int length = p5.length() + indexOf;
            if (indexOf > 0) {
                j10 = abs2;
                i15 = 33;
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
            } else {
                j10 = abs2;
                i15 = 33;
            }
            if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i15);
            }
            o4Var.setText(spannableStringBuilder);
            CharSequence l4 = m0.w(i18).l(abs, false);
            TextView textView = this.e;
            if (z13) {
                if (wallettransaction.failed) {
                    a2 = LocaleController.getString(R.string.WalletFailed);
                } else {
                    a2 = ci.ga.a(textView, LocaleController.getString(R.string.WalletSending));
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a2);
                if (wallettransaction.failed) {
                    i16 = org.telegram.ui.ActionBar.h6.f21214p7;
                } else {
                    i16 = org.telegram.ui.ActionBar.h6.f21176n6;
                }
                c12 = 0;
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(i16, d6Var)), 0, spannableStringBuilder2.length(), 33);
                textView.setText(LocaleController.formatSpannable(R.string.WalletTransactionAmountStatus, l4, spannableStringBuilder2));
            } else {
                c12 = 0;
                textView.setText(l4);
            }
            if (z16 && (k2Var3 = k2VarArr2[c12]) != null && (xaVar3 = k2Var3.e) != null) {
                xaVar3.setTitle(m0.k("Grams", p5, R.string.Grams_other));
            }
        } else {
            z12 = z17;
            z13 = z10;
            boolean z19 = z11;
            j10 = abs2;
            if (z18) {
                if (z19 && (k2Var2 = k2VarArr2[0]) != null && (xaVar2 = k2Var2.e) != null) {
                    xaVar2.setTitle(m0.k("Grams", m0.p(m0.n(abs, false), 0.75f), R.string.Grams_other));
                }
            } else {
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null && z19 && (k2Var = k2VarArr2[0]) != null && (xaVar = k2Var.e) != null) {
                    if (TextUtils.isEmpty(nftitem.name)) {
                        str = LocaleController.getString(R.string.WalletCollectible);
                    } else {
                        str = wallettransaction.nft.name;
                    }
                    xaVar.setTitle(str);
                }
            }
        }
        j01 j01Var2 = this.f35029g;
        j01Var2.removeAllViews();
        final TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        boolean z20 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
        Utilities.Callback3 callback3 = this.h;
        if (z20) {
            TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(wallettransactionpeeruser.user_id));
            if (user != null && !UserObject.isService(user.f20426id)) {
                if (z12) {
                    i14 = R.string.WalletSender;
                } else {
                    i14 = R.string.WalletRecipient;
                }
                String string = LocaleController.getString(i14);
                long j11 = wallettransactionpeeruser.user_id;
                h hVar = new h(callback3, k2VarArr2, wallettransactionpeeruser, 9);
                String string2 = LocaleController.getString(R.string.WalletSend);
                if (callback3 != null) {
                    u3Var = null;
                } else {
                    u3Var = new u3(4, k2VarArr2, user);
                }
                k2VarArr = k2VarArr2;
                j01Var2.m(string, i18, j11, hVar, string2, u3Var);
            } else {
                k2VarArr = k2VarArr2;
            }
            j01Var = j01Var2;
            if (!TextUtils.isEmpty(wallettransactionpeeruser.domain)) {
                j01Var = j01Var2;
                if (!TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                    j01Var2.i(LocaleController.getString(R.string.WalletDomain), wallettransactionpeeruser.domain, new h(k2VarArr, user, wallettransactionpeeruser, 10));
                    j01Var = j01Var2;
                }
            }
        } else {
            k2VarArr = k2VarArr2;
            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerChannel) {
                if (MessagesController.getInstance(i18).getChat(Long.valueOf(walletTransactionPeer.channel_id)) != null) {
                    if (z12) {
                        i12 = R.string.WalletSender;
                    } else {
                        i12 = R.string.WalletRecipient;
                    }
                    j01Var2.n(LocaleController.getString(i12), i18, -walletTransactionPeer.channel_id, new h(callback3, k2VarArr, walletTransactionPeer, 11));
                }
                j01Var = j01Var2;
                if (!TextUtils.isEmpty(walletTransactionPeer.domain)) {
                    j01Var = j01Var2;
                    if (!TextUtils.isEmpty(walletTransactionPeer.address)) {
                        j01Var2.i(LocaleController.getString(R.string.WalletDomain), walletTransactionPeer.domain, new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        k2[] k2VarArr3 = k2VarArr;
                                        k2 k2Var4 = k2VarArr3[0];
                                        final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = walletTransactionPeer;
                                        k2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                            @Override
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (r2) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            U.presentFragment(new o9(walletTransactionPeer2.address));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                                                            o9 o9Var = new o9(walletTransactionPeer3.address);
                                                            o9Var.u0(walletTransactionPeer3.domain);
                                                            U2.presentFragment(o9Var);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        k2VarArr3[0].dismiss();
                                        return;
                                    default:
                                        k2[] k2VarArr4 = k2VarArr;
                                        k2 k2Var5 = k2VarArr4[0];
                                        final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer;
                                        k2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                            @Override
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (r2) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            U.presentFragment(new o9(walletTransactionPeer3.address));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                            o9 o9Var = new o9(walletTransactionPeer32.address);
                                                            o9Var.u0(walletTransactionPeer32.domain);
                                                            U2.presentFragment(o9Var);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        k2VarArr4[0].dismiss();
                                        return;
                                }
                            }
                        });
                        j01Var = j01Var2;
                    }
                }
            } else {
                j01Var = j01Var2;
                if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                    final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                    j01Var = j01Var2;
                    if (!TextUtils.isEmpty(wallettransactionpeeraddress.domain)) {
                        if (!TextUtils.isEmpty(wallettransactionpeeraddress.address)) {
                            if (z12) {
                                i11 = R.string.WalletSender;
                            } else {
                                i11 = R.string.WalletRecipient;
                            }
                            String string3 = LocaleController.getString(i11);
                            String str4 = wallettransactionpeeraddress.domain;
                            Runnable runnable = new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            k2[] k2VarArr3 = k2VarArr;
                                            k2 k2Var4 = k2VarArr3[0];
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                            k2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                @Override
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (r2) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                                o9 o9Var = new o9(wallettransactionpeeraddress3.address);
                                                                o9Var.u0(wallettransactionpeeraddress3.domain);
                                                                U.presentFragment(o9Var);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                o9 o9Var2 = new o9(wallettransactionpeeraddress4.address);
                                                                o9Var2.u0(wallettransactionpeeraddress4.domain);
                                                                U2.presentFragment(o9Var2);
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            k2VarArr3[0].dismiss();
                                            return;
                                        default:
                                            k2[] k2VarArr4 = k2VarArr;
                                            k2 k2Var5 = k2VarArr4[0];
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                            k2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                @Override
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (r2) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                o9 o9Var = new o9(wallettransactionpeeraddress32.address);
                                                                o9Var.u0(wallettransactionpeeraddress32.domain);
                                                                U.presentFragment(o9Var);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                o9 o9Var2 = new o9(wallettransactionpeeraddress4.address);
                                                                o9Var2.u0(wallettransactionpeeraddress4.domain);
                                                                U2.presentFragment(o9Var2);
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            k2VarArr4[0].dismiss();
                                            return;
                                    }
                                }
                            };
                            String string4 = LocaleController.getString(R.string.WalletSend);
                            if (callback3 != null) {
                                d4Var = 0;
                            } else {
                                d4Var = new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                k2[] k2VarArr3 = k2VarArr;
                                                k2 k2Var4 = k2VarArr3[0];
                                                final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                                k2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                    @Override
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (r2) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                                if (U != null) {
                                                                    TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                    o9 o9Var = new o9(wallettransactionpeeraddress32.address);
                                                                    o9Var.u0(wallettransactionpeeraddress32.domain);
                                                                    U.presentFragment(o9Var);
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                                if (U2 != null) {
                                                                    TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                    o9 o9Var2 = new o9(wallettransactionpeeraddress4.address);
                                                                    o9Var2.u0(wallettransactionpeeraddress4.domain);
                                                                    U2.presentFragment(o9Var2);
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                k2VarArr3[0].dismiss();
                                                return;
                                            default:
                                                k2[] k2VarArr4 = k2VarArr;
                                                k2 k2Var5 = k2VarArr4[0];
                                                final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                                k2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                    @Override
                                                    public final void onDismiss(DialogInterface dialogInterface) {
                                                        switch (r2) {
                                                            case 0:
                                                                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                                                if (U != null) {
                                                                    TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                    o9 o9Var = new o9(wallettransactionpeeraddress32.address);
                                                                    o9Var.u0(wallettransactionpeeraddress32.domain);
                                                                    U.presentFragment(o9Var);
                                                                    return;
                                                                }
                                                                return;
                                                            default:
                                                                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                                                if (U2 != null) {
                                                                    TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                    o9 o9Var2 = new o9(wallettransactionpeeraddress4.address);
                                                                    o9Var2.u0(wallettransactionpeeraddress4.domain);
                                                                    U2.presentFragment(o9Var2);
                                                                    return;
                                                                }
                                                                return;
                                                        }
                                                    }
                                                });
                                                k2VarArr4[0].dismiss();
                                                return;
                                        }
                                    }
                                };
                            }
                            j01Var2.h(string3, str4, runnable, string4, d4Var);
                            j01Var = j01Var2;
                        } else {
                            if (z12) {
                                i10 = R.string.WalletSender;
                            } else {
                                i10 = R.string.WalletRecipient;
                            }
                            j01Var2.i(LocaleController.getString(i10), wallettransactionpeeraddress.domain, new ah.j(23));
                            j01Var = j01Var2;
                        }
                    }
                }
            }
        }
        final TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
        boolean z21 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
        if (z21 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerChannel) || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
            if (z21 && MessagesController.getInstance(i18).getUser(Long.valueOf(walletTransactionPeer2.user_id)) != null && !UserObject.isService(walletTransactionPeer2.user_id)) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (callback3 == null && !z14 && TextUtils.isEmpty(walletTransactionPeer2.domain) && !TextUtils.isEmpty(walletTransactionPeer2.address)) {
                z15 = true;
            } else {
                z15 = false;
            }
            String string5 = LocaleController.getString(R.string.WalletAddress);
            String str5 = walletTransactionPeer2.address;
            u3 u3Var2 = new u3(5, k2VarArr, d6Var);
            if (TextUtils.isEmpty(str5)) {
                charSequence = LocaleController.getString(R.string.WalletUnknown);
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                for (int i19 = 0; i19 < str5.length(); i19++) {
                    if (i19 > 0 && i19 % 4 == 0) {
                        if (i19 % 16 == 0) {
                            c10 = '\n';
                        } else {
                            c10 = ' ';
                        }
                        spannableStringBuilder3.append(c10);
                        spannableStringBuilder3.length();
                    }
                    spannableStringBuilder3.append(str5.charAt(i19));
                    if (i19 % 4 == 3) {
                        spannableStringBuilder3.length();
                    }
                }
                spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.i(str5, u3Var2, 9), 0, spannableStringBuilder3.length(), 33);
                charSequence = spannableStringBuilder3;
            }
            if (z15) {
                str2 = LocaleController.getString(R.string.WalletSend);
            } else {
                str2 = null;
            }
            j01Var.j(string5, charSequence, 14, null, str2, new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            k2[] k2VarArr3 = k2VarArr;
                            k2 k2Var4 = k2VarArr3[0];
                            final TL_wallet.WalletTransactionPeer walletTransactionPeer22 = walletTransactionPeer2;
                            k2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                            if (U != null) {
                                                U.presentFragment(new o9(walletTransactionPeer22.address));
                                                return;
                                            }
                                            return;
                                        default:
                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer22;
                                                o9 o9Var = new o9(walletTransactionPeer32.address);
                                                o9Var.u0(walletTransactionPeer32.domain);
                                                U2.presentFragment(o9Var);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            k2VarArr3[0].dismiss();
                            return;
                        default:
                            k2[] k2VarArr4 = k2VarArr;
                            k2 k2Var5 = k2VarArr4[0];
                            final TL_wallet.WalletTransactionPeer walletTransactionPeer3 = walletTransactionPeer2;
                            k2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r2) {
                                        case 0:
                                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                            if (U != null) {
                                                U.presentFragment(new o9(walletTransactionPeer3.address));
                                                return;
                                            }
                                            return;
                                        default:
                                            org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                                            if (U2 != null) {
                                                TL_wallet.WalletTransactionPeer walletTransactionPeer32 = walletTransactionPeer3;
                                                o9 o9Var = new o9(walletTransactionPeer32.address);
                                                o9Var.u0(walletTransactionPeer32.domain);
                                                U2.presentFragment(o9Var);
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            k2VarArr4[0].dismiss();
                            return;
                    }
                }
            });
        }
        int i20 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        Context context = this.f35030i;
        if (i20 > 0 && wallettransaction.gasless) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
            yq yqVar = new yq(R.drawable.wallet_gram_small, 2);
            yqVar.recolorDrawable = false;
            yqVar.setSize(AndroidUtilities.dp(16.0f));
            yqVar.translate(0.0f, AndroidUtilities.dp(1.0f));
            spannableStringBuilder4.setSpan(yqVar, 0, 1, 33);
            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.WalletFeePaidByTelegram));
            r32 = 0;
            j01Var.e(LocaleController.getString(R.string.WalletFee), spannableStringBuilder4, "?", new xb(context, d6Var, i18, j10, 18), null);
        } else {
            long j12 = j10;
            r32 = 0;
            r32 = 0;
            if (i20 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                TextView textView2 = new TextView(context);
                TextView[] textViewArr = this.f35031j;
                textViewArr[0] = textView2;
                textView2.setGravity(16);
                textViewArr[0].setIncludeFontPadding(false);
                textViewArr[0].setTextSize(1, 14.0f);
                TextView textView3 = textViewArr[0];
                if (z13) {
                    i13 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21398z6, d6Var);
                } else {
                    i13 = this.f35032k;
                }
                textView3.setTextColor(i13);
                if (wallettransaction.preview && i20 <= 0) {
                    SpannableString[] spannableStringArr = this.f35033l;
                    c11 = 0;
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new ca0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                } else {
                    c11 = 0;
                    textViewArr[0].setText(m5.r0(i18, j12, d6Var));
                }
                j01Var.f(textViewArr[c11], LocaleController.getString(R.string.WalletFee));
            }
        }
        if (wallettransaction.date != 0) {
            j01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(wallettransaction.date), r32, r32);
        }
    }
}

package org.telegram.ui.Wallet;

import ai.qc;
import android.content.Context;
import android.content.DialogInterface;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
public final class p3 implements Utilities.Callback {
    public final LinearLayout f35207a;
    public final f4 f35208b;
    public final org.telegram.ui.ActionBar.c6 f35209c;
    public final int d;
    public final TextView f35210e;
    public final k2[] f35211f;
    public final x01 f35212g;
    public final Utilities.Callback3 h;
    public final Context f35213i;
    public final TextView[] f35214j;
    public final int f35215k;
    public final SpannableString[] f35216l;

    public p3(LinearLayout linearLayout, f4 f4Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, TextView textView, k2[] k2VarArr, x01 x01Var, Utilities.Callback3 callback3, Context context, TextView[] textViewArr, int i11, SpannableString[] spannableStringArr) {
        this.f35207a = linearLayout;
        this.f35208b = f4Var;
        this.f35209c = c6Var;
        this.d = i10;
        this.f35210e = textView;
        this.f35211f = k2VarArr;
        this.f35212g = x01Var;
        this.h = callback3;
        this.f35213i = context;
        this.f35214j = textViewArr;
        this.f35215k = i11;
        this.f35216l = spannableStringArr;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j3;
        k2 k2Var;
        za zaVar;
        String str;
        k2 k2Var2;
        za zaVar2;
        final k2[] k2VarArr;
        int i10;
        int i11;
        u3 u3Var;
        x01 x01Var;
        boolean z14;
        boolean z15;
        CharSequence charSequence;
        char c10;
        String str2;
        ?? r42;
        int i12;
        char c11;
        int i13;
        s sVar;
        int w02;
        String str3;
        boolean z16;
        int i14;
        char c12;
        k2 k2Var3;
        za zaVar3;
        CharSequence a2;
        int i15;
        int i16;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        long abs = Math.abs(wallettransaction.amount);
        boolean z17 = wallettransaction.incoming;
        long abs2 = Math.abs(wallettransaction.fee);
        if (!wallettransaction.pending && !wallettransaction.failed) {
            z10 = false;
        } else {
            z10 = true;
        }
        LinearLayout linearLayout = this.f35207a;
        if ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof u91) && ((u91) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z18 = wallettransaction.key_change;
        org.telegram.ui.ActionBar.c6 c6Var = this.f35209c;
        int i17 = this.d;
        k2[] k2VarArr2 = this.f35211f;
        if (!z18 && wallettransaction.nft == null) {
            if (z10) {
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20963z6, c6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, c6Var);
            }
            f4 f4Var = this.f35208b;
            f4Var.setTextColor(w02);
            SpannableStringBuilder o9 = l0.o(l0.n(abs, false), 0.75f);
            if (z17) {
                str3 = "+";
            } else {
                str3 = "–";
            }
            z12 = z17;
            o9.insert(0, (CharSequence) str3);
            if (!z10) {
                if (z12) {
                    i16 = org.telegram.ui.ActionBar.h6.uj;
                } else {
                    i16 = org.telegram.ui.ActionBar.h6.G6;
                }
                z13 = z10;
                z16 = z11;
                o9.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(i16, c6Var)), 0, o9.length(), 33);
            } else {
                z13 = z10;
                z16 = z11;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) l0.k("Grams", o9, R.string.Grams_other));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, o9);
            int length = o9.length() + indexOf;
            if (indexOf > 0) {
                j3 = abs2;
                i14 = 33;
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
            } else {
                j3 = abs2;
                i14 = 33;
            }
            if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i14);
            }
            f4Var.setText(spannableStringBuilder);
            CharSequence l4 = l0.v(i17).l(abs, false);
            TextView textView = this.f35210e;
            if (z13) {
                if (wallettransaction.failed) {
                    a2 = LocaleController.getString(R.string.WalletFailed);
                } else {
                    a2 = qc.a(textView, LocaleController.getString(R.string.WalletSending));
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a2);
                if (wallettransaction.failed) {
                    i15 = org.telegram.ui.ActionBar.h6.f20780p7;
                } else {
                    i15 = org.telegram.ui.ActionBar.h6.f20744n6;
                }
                c12 = 0;
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.h6.w0(i15, c6Var)), 0, spannableStringBuilder2.length(), 33);
                textView.setText(LocaleController.formatSpannable(R.string.WalletTransactionAmountStatus, l4, spannableStringBuilder2));
            } else {
                c12 = 0;
                textView.setText(l4);
            }
            if (z16 && (k2Var3 = k2VarArr2[c12]) != null && (zaVar3 = k2Var3.f25295e) != null) {
                zaVar3.setTitle(l0.k("Grams", o9, R.string.Grams_other));
            }
        } else {
            z12 = z17;
            z13 = z10;
            boolean z19 = z11;
            j3 = abs2;
            if (z18) {
                if (z19 && (k2Var2 = k2VarArr2[0]) != null && (zaVar2 = k2Var2.f25295e) != null) {
                    zaVar2.setTitle(l0.k("Grams", l0.o(l0.n(abs, false), 0.75f), R.string.Grams_other));
                }
            } else {
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null && z19 && (k2Var = k2VarArr2[0]) != null && (zaVar = k2Var.f25295e) != null) {
                    if (TextUtils.isEmpty(nftitem.name)) {
                        str = LocaleController.getString(R.string.WalletCollectible);
                    } else {
                        str = wallettransaction.nft.name;
                    }
                    zaVar.setTitle(str);
                }
            }
        }
        x01 x01Var2 = this.f35212g;
        x01Var2.removeAllViews();
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        boolean z20 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
        Utilities.Callback3 callback3 = this.h;
        if (z20) {
            TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
            TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(wallettransactionpeeruser.user_id));
            if (user != null && !UserObject.isService(user.f19949id)) {
                if (z12) {
                    i13 = R.string.WalletSender;
                } else {
                    i13 = R.string.WalletRecipient;
                }
                String string = LocaleController.getString(i13);
                long j10 = wallettransactionpeeruser.user_id;
                l lVar = new l(callback3, k2VarArr2, wallettransactionpeeruser, 9);
                String string2 = LocaleController.getString(R.string.WalletSend);
                if (callback3 != null) {
                    sVar = null;
                } else {
                    sVar = new s(7, k2VarArr2, user);
                }
                k2VarArr = k2VarArr2;
                x01Var2.l(string, i17, j10, lVar, string2, sVar);
            } else {
                k2VarArr = k2VarArr2;
            }
            x01Var = x01Var2;
            if (!TextUtils.isEmpty(wallettransactionpeeruser.domain)) {
                x01Var = x01Var2;
                if (!TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                    x01Var2.h(LocaleController.getString(R.string.WalletDomain), wallettransactionpeeruser.domain, new l(k2VarArr, user, wallettransactionpeeruser, 10));
                    x01Var = x01Var2;
                }
            }
        } else {
            k2VarArr = k2VarArr2;
            x01Var = x01Var2;
            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                x01Var = x01Var2;
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
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            l8 l8Var = new l8(wallettransactionpeeraddress3.address);
                                                            l8Var.u0(wallettransactionpeeraddress3.domain);
                                                            U.presentFragment(l8Var);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                            l8 l8Var2 = new l8(wallettransactionpeeraddress4.address);
                                                            l8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(l8Var2);
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
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                            l8 l8Var = new l8(wallettransactionpeeraddress32.address);
                                                            l8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(l8Var);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                            l8 l8Var2 = new l8(wallettransactionpeeraddress4.address);
                                                            l8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(l8Var2);
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
                            u3Var = 0;
                        } else {
                            u3Var = new Runnable() {
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
                                                            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                l8 l8Var = new l8(wallettransactionpeeraddress32.address);
                                                                l8Var.u0(wallettransactionpeeraddress32.domain);
                                                                U.presentFragment(l8Var);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                l8 l8Var2 = new l8(wallettransactionpeeraddress4.address);
                                                                l8Var2.u0(wallettransactionpeeraddress4.domain);
                                                                U2.presentFragment(l8Var2);
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
                                                            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                l8 l8Var = new l8(wallettransactionpeeraddress32.address);
                                                                l8Var.u0(wallettransactionpeeraddress32.domain);
                                                                U.presentFragment(l8Var);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                l8 l8Var2 = new l8(wallettransactionpeeraddress4.address);
                                                                l8Var2.u0(wallettransactionpeeraddress4.domain);
                                                                U2.presentFragment(l8Var2);
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
                        x01Var2.g(string3, str4, runnable, string4, u3Var);
                        x01Var = x01Var2;
                    } else {
                        if (z12) {
                            i10 = R.string.WalletSender;
                        } else {
                            i10 = R.string.WalletRecipient;
                        }
                        x01Var2.h(LocaleController.getString(i10), wallettransactionpeeraddress.domain, new ai.f(18));
                        x01Var = x01Var2;
                    }
                }
            }
        }
        TL_wallet.WalletTransactionPeer walletTransactionPeer2 = wallettransaction.peer;
        boolean z21 = walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerUser;
        if (z21 || (walletTransactionPeer2 instanceof TL_wallet.walletTransactionPeerAddress)) {
            if (z21 && MessagesController.getInstance(i17).getUser(Long.valueOf(walletTransactionPeer2.user_id)) != null && !UserObject.isService(walletTransactionPeer2.user_id)) {
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
            s sVar2 = new s(8, k2VarArr, c6Var);
            if (TextUtils.isEmpty(str5)) {
                charSequence = LocaleController.getString(R.string.WalletUnknown);
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                for (int i18 = 0; i18 < str5.length(); i18++) {
                    if (i18 > 0 && i18 % 4 == 0) {
                        if (i18 % 16 == 0) {
                            c10 = '\n';
                        } else {
                            c10 = ' ';
                        }
                        spannableStringBuilder3.append(c10);
                        spannableStringBuilder3.length();
                    }
                    spannableStringBuilder3.append(str5.charAt(i18));
                    if (i18 % 4 == 3) {
                        spannableStringBuilder3.length();
                    }
                }
                spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.i(str5, sVar2, 9), 0, spannableStringBuilder3.length(), 33);
                charSequence = spannableStringBuilder3;
            }
            if (z15) {
                str2 = LocaleController.getString(R.string.WalletSend);
            } else {
                str2 = null;
            }
            x01Var.i(string5, charSequence, 14, null, str2, new s(9, k2VarArr, walletTransactionPeer2));
        }
        int i19 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        Context context = this.f35213i;
        if (i19 > 0 && wallettransaction.gasless) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
            gr grVar = new gr(R.drawable.wallet_gram_small, 2);
            grVar.recolorDrawable = false;
            grVar.setSize(AndroidUtilities.dp(16.0f));
            grVar.translate(0.0f, AndroidUtilities.dp(1.0f));
            spannableStringBuilder4.setSpan(grVar, 0, 1, 33);
            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.WalletFeePaidByTelegram));
            r42 = 0;
            x01Var.e(LocaleController.getString(R.string.WalletFee), spannableStringBuilder4, "?", new org.telegram.messenger.k7(context, c6Var, i17, j3, 17), null);
        } else {
            long j11 = j3;
            r42 = 0;
            r42 = 0;
            if (i19 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                TextView textView2 = new TextView(context);
                TextView[] textViewArr = this.f35214j;
                textViewArr[0] = textView2;
                textView2.setGravity(16);
                textViewArr[0].setIncludeFontPadding(false);
                textViewArr[0].setTextSize(1, 14.0f);
                TextView textView3 = textViewArr[0];
                if (z13) {
                    i12 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20963z6, c6Var);
                } else {
                    i12 = this.f35215k;
                }
                textView3.setTextColor(i12);
                if (wallettransaction.preview && i19 <= 0) {
                    SpannableString[] spannableStringArr = this.f35216l;
                    c11 = 0;
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new na0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                } else {
                    c11 = 0;
                    textViewArr[0].setText(c5.l0(i17, j11, c6Var));
                }
                String string6 = LocaleController.getString(R.string.WalletFee);
                TextView textView4 = textViewArr[c11];
                TableRow tableRow = new TableRow(x01Var.getContext());
                tableRow.addView(new w01(x01Var, string6), new TableRow.LayoutParams(-2, -1));
                tableRow.addView(new u01(x01Var, textView4, false), new TableRow.LayoutParams(0, -1, 1.0f));
                x01Var.addView(tableRow);
            }
        }
        if (wallettransaction.date != 0) {
            x01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(wallettransaction.date), r42, r42);
        }
    }
}

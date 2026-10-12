package org.telegram.ui.Wallet;

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
import bi.yb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.je1;
public final class n3 implements Utilities.Callback {
    public final LinearLayout f33502a;
    public final d4 f33503b;
    public final org.telegram.ui.ActionBar.c6 f33504c;
    public final int d;
    public final TextView e;
    public final i2[] f33505f;
    public final n01 f33506g;
    public final Utilities.Callback3 h;
    public final Context f33507i;
    public final TextView[] f33508j;
    public final int f33509k;
    public final SpannableString[] f33510l;

    public n3(LinearLayout linearLayout, d4 d4Var, org.telegram.ui.ActionBar.c6 c6Var, int i10, TextView textView, i2[] i2VarArr, n01 n01Var, Utilities.Callback3 callback3, Context context, TextView[] textViewArr, int i11, SpannableString[] spannableStringArr) {
        this.f33502a = linearLayout;
        this.f33503b = d4Var;
        this.f33504c = c6Var;
        this.d = i10;
        this.e = textView;
        this.f33505f = i2VarArr;
        this.f33506g = n01Var;
        this.h = callback3;
        this.f33507i = context;
        this.f33508j = textViewArr;
        this.f33509k = i11;
        this.f33510l = spannableStringArr;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j10;
        i2 i2Var;
        za zaVar;
        String str;
        i2 i2Var2;
        za zaVar2;
        final i2[] i2VarArr;
        int i10;
        int i11;
        s3 s3Var;
        n01 n01Var;
        boolean z14;
        boolean z15;
        CharSequence charSequence;
        char c10;
        String str2;
        ?? r42;
        int i12;
        char c11;
        int i13;
        je1 je1Var;
        int w02;
        String str3;
        boolean z16;
        int i14;
        char c12;
        i2 i2Var3;
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
        LinearLayout linearLayout = this.f33502a;
        if ((linearLayout.getParent() instanceof View) && (linearLayout.getParent().getParent() instanceof k91) && ((k91) linearLayout.getParent().getParent()).getViewPages()[0] != linearLayout.getParent()) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean z18 = wallettransaction.key_change;
        org.telegram.ui.ActionBar.c6 c6Var = this.f33504c;
        int i17 = this.d;
        i2[] i2VarArr2 = this.f33505f;
        if (!z18 && wallettransaction.nft == null) {
            if (z10) {
                w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, c6Var);
            } else {
                w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, c6Var);
            }
            d4 d4Var = this.f33503b;
            d4Var.setTextColor(w02);
            SpannableStringBuilder o10 = j0.o(j0.n(abs, false), 0.75f);
            if (z17) {
                str3 = "+";
            } else {
                str3 = "–";
            }
            z12 = z17;
            o10.insert(0, (CharSequence) str3);
            if (!z10) {
                if (z12) {
                    i16 = org.telegram.ui.ActionBar.g6.uj;
                } else {
                    i16 = org.telegram.ui.ActionBar.g6.G6;
                }
                z13 = z10;
                z16 = z11;
                o10.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(i16, c6Var)), 0, o10.length(), 33);
            } else {
                z13 = z10;
                z16 = z11;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) j0.k("Grams", o10, R.string.Grams_other));
            int indexOf = TextUtils.indexOf(spannableStringBuilder, o10);
            int length = o10.length() + indexOf;
            if (indexOf > 0) {
                j10 = abs2;
                i14 = 33;
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), 0, indexOf, 33);
            } else {
                j10 = abs2;
                i14 = 33;
            }
            if (indexOf >= 0 && length < spannableStringBuilder.length()) {
                spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), length, spannableStringBuilder.length(), i14);
            }
            d4Var.setText(spannableStringBuilder);
            CharSequence l4 = j0.v(i17).l(abs, false);
            TextView textView = this.e;
            if (z13) {
                if (wallettransaction.failed) {
                    a2 = LocaleController.getString(R.string.WalletFailed);
                } else {
                    a2 = yb.a(textView, LocaleController.getString(R.string.WalletSending));
                }
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(a2);
                if (wallettransaction.failed) {
                    i15 = org.telegram.ui.ActionBar.g6.f20122p7;
                } else {
                    i15 = org.telegram.ui.ActionBar.g6.f20084n6;
                }
                c12 = 0;
                spannableStringBuilder2.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.w0(i15, c6Var)), 0, spannableStringBuilder2.length(), 33);
                textView.setText(LocaleController.formatSpannable(R.string.WalletTransactionAmountStatus, l4, spannableStringBuilder2));
            } else {
                c12 = 0;
                textView.setText(l4);
            }
            if (z16 && (i2Var3 = i2VarArr2[c12]) != null && (zaVar3 = i2Var3.e) != null) {
                zaVar3.setTitle(j0.k("Grams", o10, R.string.Grams_other));
            }
        } else {
            z12 = z17;
            z13 = z10;
            boolean z19 = z11;
            j10 = abs2;
            if (z18) {
                if (z19 && (i2Var2 = i2VarArr2[0]) != null && (zaVar2 = i2Var2.e) != null) {
                    zaVar2.setTitle(j0.k("Grams", j0.o(j0.n(abs, false), 0.75f), R.string.Grams_other));
                }
            } else {
                TL_wallet.nftItem nftitem = wallettransaction.nft;
                if (nftitem != null && z19 && (i2Var = i2VarArr2[0]) != null && (zaVar = i2Var.e) != null) {
                    if (TextUtils.isEmpty(nftitem.name)) {
                        str = LocaleController.getString(R.string.WalletCollectible);
                    } else {
                        str = wallettransaction.nft.name;
                    }
                    zaVar.setTitle(str);
                }
            }
        }
        n01 n01Var2 = this.f33506g;
        n01Var2.removeAllViews();
        TL_wallet.WalletTransactionPeer walletTransactionPeer = wallettransaction.peer;
        boolean z20 = walletTransactionPeer instanceof TL_wallet.walletTransactionPeerUser;
        Utilities.Callback3 callback3 = this.h;
        if (z20) {
            TL_wallet.walletTransactionPeerUser wallettransactionpeeruser = (TL_wallet.walletTransactionPeerUser) walletTransactionPeer;
            TLRPC.User user = MessagesController.getInstance(i17).getUser(Long.valueOf(wallettransactionpeeruser.user_id));
            if (user != null && !UserObject.isService(user.f19363id)) {
                if (z12) {
                    i13 = R.string.WalletSender;
                } else {
                    i13 = R.string.WalletRecipient;
                }
                String string = LocaleController.getString(i13);
                long j11 = wallettransactionpeeruser.user_id;
                k kVar = new k(callback3, i2VarArr2, wallettransactionpeeruser, 9);
                String string2 = LocaleController.getString(R.string.WalletSend);
                if (callback3 != null) {
                    je1Var = null;
                } else {
                    je1Var = new je1(21, i2VarArr2, user);
                }
                i2VarArr = i2VarArr2;
                n01Var2.l(string, i17, j11, kVar, string2, je1Var);
            } else {
                i2VarArr = i2VarArr2;
            }
            n01Var = n01Var2;
            if (!TextUtils.isEmpty(wallettransactionpeeruser.domain)) {
                n01Var = n01Var2;
                if (!TextUtils.isEmpty(wallettransactionpeeruser.address)) {
                    n01Var2.h(LocaleController.getString(R.string.WalletDomain), wallettransactionpeeruser.domain, new k(i2VarArr, user, wallettransactionpeeruser, 10));
                    n01Var = n01Var2;
                }
            }
        } else {
            i2VarArr = i2VarArr2;
            n01Var = n01Var2;
            if (walletTransactionPeer instanceof TL_wallet.walletTransactionPeerAddress) {
                final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress = (TL_wallet.walletTransactionPeerAddress) walletTransactionPeer;
                n01Var = n01Var2;
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
                                        i2[] i2VarArr3 = i2VarArr;
                                        i2 i2Var4 = i2VarArr3[0];
                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                        i2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                            @Override
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (r2) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress2;
                                                            i8 i8Var = new i8(wallettransactionpeeraddress3.address);
                                                            i8Var.u0(wallettransactionpeeraddress3.domain);
                                                            U.presentFragment(i8Var);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                            i8 i8Var2 = new i8(wallettransactionpeeraddress4.address);
                                                            i8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(i8Var2);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        i2VarArr3[0].dismiss();
                                        return;
                                    default:
                                        i2[] i2VarArr4 = i2VarArr;
                                        i2 i2Var5 = i2VarArr4[0];
                                        final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                        i2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                            @Override
                                            public final void onDismiss(DialogInterface dialogInterface) {
                                                switch (r2) {
                                                    case 0:
                                                        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                        if (U != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                            i8 i8Var = new i8(wallettransactionpeeraddress32.address);
                                                            i8Var.u0(wallettransactionpeeraddress32.domain);
                                                            U.presentFragment(i8Var);
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                        if (U2 != null) {
                                                            TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                            i8 i8Var2 = new i8(wallettransactionpeeraddress4.address);
                                                            i8Var2.u0(wallettransactionpeeraddress4.domain);
                                                            U2.presentFragment(i8Var2);
                                                            return;
                                                        }
                                                        return;
                                                }
                                            }
                                        });
                                        i2VarArr4[0].dismiss();
                                        return;
                                }
                            }
                        };
                        String string4 = LocaleController.getString(R.string.WalletSend);
                        if (callback3 != null) {
                            s3Var = 0;
                        } else {
                            s3Var = new Runnable() {
                                @Override
                                public final void run() {
                                    switch (r3) {
                                        case 0:
                                            i2[] i2VarArr3 = i2VarArr;
                                            i2 i2Var4 = i2VarArr3[0];
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress2 = wallettransactionpeeraddress;
                                            i2Var4.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                @Override
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (r2) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress2;
                                                                i8 i8Var = new i8(wallettransactionpeeraddress32.address);
                                                                i8Var.u0(wallettransactionpeeraddress32.domain);
                                                                U.presentFragment(i8Var);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress2;
                                                                i8 i8Var2 = new i8(wallettransactionpeeraddress4.address);
                                                                i8Var2.u0(wallettransactionpeeraddress4.domain);
                                                                U2.presentFragment(i8Var2);
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            i2VarArr3[0].dismiss();
                                            return;
                                        default:
                                            i2[] i2VarArr4 = i2VarArr;
                                            i2 i2Var5 = i2VarArr4[0];
                                            final TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress3 = wallettransactionpeeraddress;
                                            i2Var5.setOnDismissListener(new DialogInterface.OnDismissListener() {
                                                @Override
                                                public final void onDismiss(DialogInterface dialogInterface) {
                                                    switch (r2) {
                                                        case 0:
                                                            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                                            if (U != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress32 = wallettransactionpeeraddress3;
                                                                i8 i8Var = new i8(wallettransactionpeeraddress32.address);
                                                                i8Var.u0(wallettransactionpeeraddress32.domain);
                                                                U.presentFragment(i8Var);
                                                                return;
                                                            }
                                                            return;
                                                        default:
                                                            org.telegram.ui.ActionBar.m2 U2 = LaunchActivity.U();
                                                            if (U2 != null) {
                                                                TL_wallet.walletTransactionPeerAddress wallettransactionpeeraddress4 = wallettransactionpeeraddress3;
                                                                i8 i8Var2 = new i8(wallettransactionpeeraddress4.address);
                                                                i8Var2.u0(wallettransactionpeeraddress4.domain);
                                                                U2.presentFragment(i8Var2);
                                                                return;
                                                            }
                                                            return;
                                                    }
                                                }
                                            });
                                            i2VarArr4[0].dismiss();
                                            return;
                                    }
                                }
                            };
                        }
                        n01Var2.g(string3, str4, runnable, string4, s3Var);
                        n01Var = n01Var2;
                    } else {
                        if (z12) {
                            i10 = R.string.WalletSender;
                        } else {
                            i10 = R.string.WalletRecipient;
                        }
                        n01Var2.h(LocaleController.getString(i10), wallettransactionpeeraddress.domain, new ah.j(19));
                        n01Var = n01Var2;
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
            je1 je1Var2 = new je1(22, i2VarArr, c6Var);
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
                spannableStringBuilder3.setSpan(new org.telegram.ui.Cells.i(str5, je1Var2, 9), 0, spannableStringBuilder3.length(), 33);
                charSequence = spannableStringBuilder3;
            }
            if (z15) {
                str2 = LocaleController.getString(R.string.WalletSend);
            } else {
                str2 = null;
            }
            n01Var.i(string5, charSequence, 14, null, str2, new je1(23, i2VarArr, walletTransactionPeer2));
        }
        int i19 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        Context context = this.f33507i;
        if (i19 > 0 && wallettransaction.gasless) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder("x ");
            br brVar = new br(R.drawable.wallet_gram_small, 2);
            brVar.recolorDrawable = false;
            brVar.setSize(AndroidUtilities.dp(16.0f));
            brVar.translate(0.0f, AndroidUtilities.dp(1.0f));
            spannableStringBuilder4.setSpan(brVar, 0, 1, 33);
            spannableStringBuilder4.append((CharSequence) LocaleController.getString(R.string.WalletFeePaidByTelegram));
            r42 = 0;
            n01Var.e(LocaleController.getString(R.string.WalletFee), spannableStringBuilder4, "?", new org.telegram.messenger.k7(context, c6Var, i17, j10, 17), null);
        } else {
            long j12 = j10;
            r42 = 0;
            r42 = 0;
            if (i19 > 0 || wallettransaction.nft != null || wallettransaction.preview) {
                TextView textView2 = new TextView(context);
                TextView[] textViewArr = this.f33508j;
                textViewArr[0] = textView2;
                textView2.setGravity(16);
                textViewArr[0].setIncludeFontPadding(false);
                textViewArr[0].setTextSize(1, 14.0f);
                TextView textView3 = textViewArr[0];
                if (z13) {
                    i12 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20305z6, c6Var);
                } else {
                    i12 = this.f33509k;
                }
                textView3.setTextColor(i12);
                if (wallettransaction.preview && i19 <= 0) {
                    SpannableString[] spannableStringArr = this.f33510l;
                    c11 = 0;
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new ia0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                } else {
                    c11 = 0;
                    textViewArr[0].setText(z4.l0(i17, j12, c6Var));
                }
                String string6 = LocaleController.getString(R.string.WalletFee);
                TextView textView4 = textViewArr[c11];
                TableRow tableRow = new TableRow(n01Var.getContext());
                tableRow.addView(new m01(n01Var, string6), new TableRow.LayoutParams(-2, -1));
                tableRow.addView(new k01(n01Var, textView4, false), new TableRow.LayoutParams(0, -1, 1.0f));
                n01Var.addView(tableRow);
            }
        }
        if (wallettransaction.date != 0) {
            n01Var.c(LocaleController.getString(R.string.WalletDate), LocaleController.formatShortDateTime(wallettransaction.date), r42, r42);
        }
    }
}

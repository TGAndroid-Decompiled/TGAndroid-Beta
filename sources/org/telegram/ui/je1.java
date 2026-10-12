package org.telegram.ui;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.WalletEngine2;
public final class je1 implements Runnable {
    public final int f37365a;
    public final Object f37366b;
    public final Object f37367c;

    public je1(int i10, Object obj, Object obj2) {
        this.f37365a = i10;
        this.f37366b = obj;
        this.f37367c = obj2;
    }

    @Override
    public final void run() {
        switch (this.f37365a) {
            case 0:
                se1 se1Var = (se1) this.f37366b;
                se1Var.getClass();
                AndroidUtilities.addToClipboard(MessageObject.formatTextWithEntities(((TLRPC.TodoItem) this.f37367c).title, false));
                se1Var.c(true);
                return;
            case 1:
                rf1 rf1Var = (rf1) this.f37366b;
                rf1Var.getClass();
                Bundle bundle = new Bundle();
                lg1 lg1Var = rf1Var.f39790b;
                bundle.putLong("dialog_id", -lg1Var.f37957a);
                bundle.putLong("topic_id", ((TLRPC.TL_forumTopic) this.f37367c).f19268id);
                lg1Var.presentFragment(new c21(bundle, null));
                return;
            case 2:
                hg1 hg1Var = (hg1) this.f37366b;
                String str = (String) this.f37367c;
                ArrayList arrayList = hg1Var.f36798c0;
                lg1 lg1Var2 = hg1Var.f36814t0;
                String lowerCase = str.trim().toLowerCase();
                ArrayList arrayList2 = new ArrayList();
                int i10 = 0;
                while (true) {
                    ArrayList arrayList3 = lg1Var2.f37960b;
                    if (i10 < arrayList3.size()) {
                        if (((cg1) arrayList3.get(i10)).f34947c != null && ((cg1) arrayList3.get(i10)).f34947c.title.toLowerCase().contains(lowerCase)) {
                            arrayList2.add(((cg1) arrayList3.get(i10)).f34947c);
                            ((cg1) arrayList3.get(i10)).f34947c.searchQuery = lowerCase;
                        }
                        i10++;
                    } else {
                        arrayList.clear();
                        arrayList.addAll(arrayList2);
                        hg1Var.L();
                        if (!arrayList.isEmpty()) {
                            hg1Var.f36807l0 = false;
                            hg1Var.f36809o0.b(0);
                        }
                        hg1Var.J(str);
                        return;
                    }
                }
                break;
            case 3:
                og1 og1Var = ((ng1) this.f37366b).f38715b;
                og1Var.f38954a.e.remove(Integer.valueOf(((TLRPC.TL_forumTopic) this.f37367c).f19268id));
                og1Var.f38954a.V();
                return;
            case 4:
                TwoStepVerificationActivity.Y((TwoStepVerificationActivity) this.f37366b, (byte[]) this.f37367c);
                return;
            case 5:
                TwoStepVerificationActivity.d0((TwoStepVerificationActivity) this.f37366b, (TL_account.updatePasswordSettings) this.f37367c);
                return;
            case 6:
                TwoStepVerificationActivity.W((TwoStepVerificationActivity) this.f37366b, (TLRPC.TL_error) this.f37367c);
                return;
            case 7:
                oh1.g0((oh1) this.f37366b, (String) this.f37367c);
                return;
            case 8:
                Runnable runnable = (Runnable) this.f37367c;
                for (ks ksVar : ((oh1) this.f37366b).f38977w.f36949f) {
                    ksVar.l(0.0f);
                }
                runnable.run();
                return;
            case 9:
                vh1 vh1Var = (vh1) this.f37366b;
                TLObject tLObject = (TLObject) this.f37367c;
                ArrayList arrayList4 = vh1Var.f41014f;
                ArrayList<TLRPC.Chat> arrayList5 = vh1Var.e;
                if (tLObject instanceof TLRPC.messages_Chats) {
                    arrayList5.clear();
                    arrayList5.addAll(((TLRPC.messages_Chats) tLObject).chats);
                }
                int i11 = 0;
                MessagesController.getInstance(vh1Var.f41011a).putChats(arrayList5, false);
                vh1Var.d = false;
                vh1Var.f41013c = true;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj = arrayList4.get(i11);
                    i11++;
                    ((Runnable) obj).run();
                }
                arrayList4.clear();
                return;
            case 10:
                dj1 dj1Var = (dj1) this.f37366b;
                dj1Var.U.a(new mi1(dj1Var, (VoIPService) this.f37367c, 1), true);
                return;
            case 11:
                dj1 dj1Var2 = (dj1) this.f37366b;
                ValueAnimator valueAnimator = (ValueAnimator) this.f37367c;
                org.telegram.ui.Components.voip.k2.U = false;
                org.telegram.ui.Components.voip.k2.i();
                ViewPropertyAnimator duration = dj1Var2.K.animate().setDuration(150L);
                org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.f24771f;
                duration.setInterpolator(esVar).start();
                dj1Var2.H.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                dj1Var2.I.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                dj1Var2.N.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                dj1Var2.X.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                dj1Var2.f35296j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(esVar).start();
                dj1Var2.f35292h0.animate().alpha(1.0f).setDuration(350L).setInterpolator(esVar).start();
                dj1Var2.f35294i0.animate().alpha(1.0f).setDuration(350L).setInterpolator(esVar).start();
                dj1Var2.M0.animate().alpha(1.0f).setDuration(350L).setInterpolator(esVar).start();
                valueAnimator.addListener(new ri1(dj1Var2, 2));
                valueAnimator.setDuration(350L);
                valueAnimator.setInterpolator(esVar);
                valueAnimator.start();
                return;
            case 12:
                MessagesController.getInstance(((org.telegram.ui.Wallet.j0) this.f37366b).f33319a).lambda$processUpdates$377((TLRPC.Updates) this.f37367c, false);
                return;
            case 13:
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.f37366b;
                org.telegram.ui.Wallet.j0.E("enable backup: ready! getting secret phrase...");
                j0Var.x(new bi.f0(20, j0Var, (org.telegram.ui.Wallet.a7) this.f37367c), false, true);
                return;
            case 14:
                boolean[] zArr = (boolean[]) this.f37366b;
                org.telegram.ui.Wallet.p pVar = (org.telegram.ui.Wallet.p) this.f37367c;
                if (!zArr[0]) {
                    zArr[0] = true;
                    pVar.run();
                    return;
                }
                return;
            case 15:
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.f37366b;
                org.telegram.ui.Wallet.i iVar = (org.telegram.ui.Wallet.i) this.f37367c;
                org.telegram.ui.Wallet.j0.E("emulate disable backup: ready");
                if (j0Var2.t() <= 0) {
                    iVar.run(500000L, null);
                    return;
                }
                WalletEngine2 walletEngine2 = j0Var2.f33320b;
                if (walletEngine2 == null) {
                    org.telegram.ui.Wallet.j0.i("emulate disable backup: no engine!");
                    iVar.run(null, "NULL_ENGINE");
                    return;
                }
                walletEngine2.emulateRotateKey(new org.telegram.ui.Wallet.d(j0Var2, iVar));
                return;
            case 16:
                MessagesController.getInstance(((org.telegram.ui.Wallet.d2) this.f37366b).f33040a).lambda$processUpdates$377((TLRPC.Updates) this.f37367c, false);
                return;
            case 17:
                TextView[] textViewArr = (TextView[]) this.f37366b;
                SpannableString[] spannableStringArr = (SpannableString[]) this.f37367c;
                if (textViewArr[0] != null) {
                    if (spannableStringArr[0] == null) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Loading));
                        spannableStringArr[0] = spannableString;
                        spannableString.setSpan(new org.telegram.ui.Components.ia0(AndroidUtilities.dp(150.0f), textViewArr[0]), 0, spannableStringArr[0].length(), 33);
                    }
                    textViewArr[0].setText(spannableStringArr[0]);
                    return;
                }
                return;
            case 18:
                ((org.telegram.ui.Wallet.n3) this.f37366b).run(((TL_wallet.walletTransaction[]) this.f37367c)[0]);
                return;
            case 19:
                ((org.telegram.ui.Wallet.z4) this.f37366b).D0.remove((org.telegram.ui.Wallet.l6) this.f37367c);
                return;
            case 20:
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) this.f37367c;
                ((Utilities.Callback2) this.f37366b).run(wallettransaction.comment, Boolean.valueOf(wallettransaction.comment_encrypted));
                return;
            case 21:
                org.telegram.ui.Wallet.i2[] i2VarArr = (org.telegram.ui.Wallet.i2[]) this.f37366b;
                i2VarArr[0].setOnDismissListener(new org.telegram.ui.Wallet.u3((TLRPC.User) this.f37367c, 0));
                i2VarArr[0].dismiss();
                return;
            case 22:
                new org.telegram.ui.Components.zc(((org.telegram.ui.Wallet.i2[]) this.f37366b)[0].topBulletinContainer, (org.telegram.ui.ActionBar.c6) this.f37367c).Q(R.raw.copy, 36, LocaleController.getString(R.string.WalletAddressCopiedBulletin)).k(false);
                return;
            case 23:
                org.telegram.ui.Wallet.i2[] i2VarArr2 = (org.telegram.ui.Wallet.i2[]) this.f37366b;
                i2VarArr2[0].setOnDismissListener(new org.telegram.ui.Wallet.u3((TL_wallet.WalletTransactionPeer) this.f37367c, 1));
                i2VarArr2[0].dismiss();
                return;
            case 24:
                ((ViewGroup) this.f37367c).removeView(((org.telegram.ui.Wallet.u5) this.f37366b).h);
                return;
            case 25:
                ((Utilities.Callback) this.f37366b).run((TL_wallet.walletTransaction) this.f37367c);
                return;
            case 26:
                org.telegram.ui.Wallet.z6 z6Var = (org.telegram.ui.Wallet.z6) this.f37366b;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.f37367c;
                if ((m2Var instanceof org.telegram.ui.Wallet.z4) && org.telegram.ui.Components.zc.a(m2Var)) {
                    org.telegram.ui.Components.zc.a0(m2Var).M(LocaleController.getString(R.string.WalletImported), LocaleController.getString(R.string.WalletImportedInfo), R.raw.contact_check).j();
                }
                z6Var.finishFragment();
                return;
            case 27:
                ((org.telegram.ui.Wallet.o0) this.f37367c).B();
                ((org.telegram.ui.Wallet.k7) this.f37366b).f23964a.W2.N(true);
                return;
            case 28:
                org.telegram.ui.Wallet.k7 k7Var = (org.telegram.ui.Wallet.k7) this.f37366b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getParentActivity(), 0, k7Var.getResourceProvider());
                alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.WalletDisableBackupTitle);
                alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.WalletDisableBackupExistingPhraseInfo);
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.k(LocaleController.getString(R.string.WalletDisable), new cs0(27, k7Var, (org.telegram.ui.Wallet.j0) this.f37367c));
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                return;
            default:
                ((org.telegram.ui.ActionBar.a2[]) this.f37366b)[0].dismiss();
                ((Runnable) this.f37367c).run();
                return;
        }
    }
}

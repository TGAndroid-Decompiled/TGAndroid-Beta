package org.telegram.ui.Wallet;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ii1;
public final class p implements Runnable {
    public final int f35333a;
    public final Object f35334b;
    public final String f35335c;
    public final Object d;
    public final Object f35336e;
    public final Object f35337f;
    public final Object h;
    public final Object f35338n;
    public final long f35339r;
    public final TLObject f35340s;
    public final Object v;
    public final Object f35341w;

    public p(k0 k0Var, String str, Utilities.Callback callback, TL_wallet.nftItem nftitem, String str2, String str3, byte[] bArr, long j3, TLRPC.User user, String str4, Utilities.Callback callback2, int i10) {
        this.f35333a = i10;
        this.f35334b = k0Var;
        this.f35335c = str;
        this.d = callback;
        this.f35336e = nftitem;
        this.f35337f = str2;
        this.h = str3;
        this.f35338n = bArr;
        this.f35339r = j3;
        this.f35340s = user;
        this.v = str4;
        this.f35341w = callback2;
    }

    @Override
    public final void run() {
        String str;
        int i10 = this.f35333a;
        TLObject tLObject = this.f35340s;
        Object obj = this.f35338n;
        Object obj2 = this.f35336e;
        Object obj3 = this.f35341w;
        Object obj4 = this.d;
        Object obj5 = this.v;
        Object obj6 = this.h;
        Object obj7 = this.f35337f;
        Object obj8 = this.f35334b;
        int i11 = 0;
        switch (i10) {
            case 0:
                k0 k0Var = (k0) obj8;
                Utilities.Callback callback = (Utilities.Callback) obj4;
                String str2 = this.f35335c;
                p pVar = new p(k0Var, str2, callback, (TL_wallet.nftItem) obj2, (String) obj7, (String) obj6, (byte[]) obj, this.f35339r, (TLRPC.User) tLObject, (String) obj5, (Utilities.Callback) obj3, 1);
                if (k0Var.H() && !k0Var.G()) {
                    k0.E("send " + str2 + ": asking passcode");
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj9 = new Object();
                        obj9.f21357a = true;
                        boolean[] zArr = {false};
                        x xVar = new x(zArr, callback);
                        xVar.V = new ii1(3, zArr, pVar);
                        U.showAsSheet(xVar, obj9);
                        return;
                    }
                    return;
                }
                pVar.run();
                return;
            case 1:
                final k0 k0Var2 = (k0) obj8;
                final Utilities.Callback callback2 = (Utilities.Callback) obj4;
                final TL_wallet.nftItem nftitem = (TL_wallet.nftItem) obj2;
                final String str3 = (String) obj7;
                final String str4 = (String) obj6;
                final byte[] bArr = (byte[]) obj;
                final TLRPC.User user = (TLRPC.User) tLObject;
                final String str5 = (String) obj5;
                final Utilities.Callback callback3 = (Utilities.Callback) obj3;
                StringBuilder sb2 = new StringBuilder("send ");
                final String str6 = this.f35335c;
                sb2.append(str6);
                sb2.append(": ready, get secret phrase");
                k0.E(sb2.toString());
                final long j3 = this.f35339r;
                k0Var2.x(new Utilities.Callback2() {
                    @Override
                    public final void run(java.lang.Object r27, java.lang.Object r28) {
                        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Wallet.s.run(java.lang.Object, java.lang.Object):void");
                    }
                }, false, true);
                return;
            default:
                yh.m5 m5Var = (yh.m5) obj8;
                TLObject tLObject2 = (TLObject) obj7;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj6;
                Utilities.Callback2 callback22 = (Utilities.Callback2) obj5;
                TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars = (TLRPC.TL_inputInvoicePremiumGiftStars) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                TLObject tLObject3 = (TLObject) obj;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) tLObject;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentFormStars)) {
                    if (tL_error == null) {
                        str = "NO_PAYMENT_FORM";
                    } else {
                        str = tL_error.text;
                    }
                    yh.m5.e(str);
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
                TLRPC.TL_payments_paymentFormStars tL_payments_paymentFormStars = (TLRPC.TL_payments_paymentFormStars) tLObject2;
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = tL_payments_paymentFormStars.form_id;
                tL_payments_sendStarsForm.invoice = tL_inputInvoicePremiumGiftStars;
                ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStars.invoice.prices;
                int size = arrayList.size();
                long j10 = 0;
                while (i11 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                    i11++;
                    j10 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(m5Var.f52878a).sendRequest(tL_payments_sendStarsForm, new yh.k4(m5Var, callback22, context, e6Var, j10, this.f35335c, this.f35339r, tLObject3, tL_textWithEntities));
                return;
        }
    }

    public p(yh.m5 m5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, TLRPC.TL_inputInvoicePremiumGiftStars tL_inputInvoicePremiumGiftStars, Context context, org.telegram.ui.ActionBar.e6 e6Var, String str, long j3, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.f35333a = 2;
        this.f35334b = m5Var;
        this.f35337f = tLObject;
        this.h = tL_error;
        this.v = callback2;
        this.d = tL_inputInvoicePremiumGiftStars;
        this.f35341w = context;
        this.f35336e = e6Var;
        this.f35335c = str;
        this.f35339r = j3;
        this.f35338n = tLObject2;
        this.f35340s = tL_textWithEntities;
    }
}

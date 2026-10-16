package org.telegram.ui.Wallet;

import android.text.TextUtils;
import android.view.View;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.zc;
public final class m1 implements View.OnClickListener {
    public final int f33187a;
    public final Object f33188b;
    public final Object f33189c;
    public final Object d;

    public m1(Object obj, Object obj2, Object obj3, int i10) {
        this.f33187a = i10;
        this.f33188b = obj;
        this.f33189c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f33187a) {
            case 0:
                i2 i2Var = (i2) this.f33189c;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.d;
                if (AndroidUtilities.addToClipboard(((JSONObject) this.f33188b).optString("text"))) {
                    sk.p(R.string.WalletSigningDataCopied, new zc(i2Var.topBulletinContainer, c6Var));
                    return;
                }
                return;
            case 1:
                l80 l80Var = (l80) this.d;
                f fVar = ((k0) this.f33188b).h;
                String str = ((TL_wallet.currencyRate) this.f33189c).currency;
                if (!TextUtils.equals(fVar.f32885f, str)) {
                    fVar.f32885f = str;
                    try {
                        ApplicationLoader.applicationContext.getSharedPreferences("gram_wallet", 0).edit().putString("currency", fVar.g()).apply();
                    } catch (Exception e) {
                        FileLog.e("[gram-wallet] failed to save currency prefs", e);
                    }
                    fVar.f32883b.I();
                }
                l80Var.u();
                return;
            default:
                n7 n7Var = (n7) this.f33188b;
                n7Var.getClass();
                ((org.telegram.ui.ActionBar.a2[]) this.f33189c)[0].dismiss();
                AndroidUtilities.addToClipboard(n7Var.f33260r);
                ((Runnable) this.d).run();
                return;
        }
    }
}

package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.UItem;

public final class PasskeysActivity$$ExternalSyntheticLambda1 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final PasskeysActivity f$0;

    public PasskeysActivity$$ExternalSyntheticLambda1(PasskeysActivity passkeysActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passkeysActivity;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        PasskeysActivity passkeysActivity = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                String string = LocaleController.getString(R.string.PasskeyTopInfo);
                int i = R.raw.passkey;
                UItem uItem = new UItem(2);
                uItem.text = string;
                uItem.iconResId = i;
                arrayList.add(uItem);
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = passkeysActivity.passkeys;
                    if (i2 >= arrayList2.size()) {
                        if (arrayList2.size() + 1 <= passkeysActivity.getMessagesController().config.passkeysAccountPasskeysMax.get()) {
                            arrayList.size();
                            UItem uItemAsButton = UItem.asButton(-1, R.drawable.menu_passkey_add, LocaleController.getString(R.string.PasskeyAdd));
                            uItemAsButton.accent = true;
                            arrayList.add(uItemAsButton);
                        }
                        CharSequence charSequenceReplaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.PasskeyInfo), new IntroActivity$$ExternalSyntheticLambda6(passkeysActivity, 29)), true);
                        UItem uItem2 = new UItem(7);
                        uItem2.text = charSequenceReplaceArrows;
                        arrayList.add(uItem2);
                    } else {
                        TL_account.Passkey passkey = (TL_account.Passkey) arrayList2.get(i2);
                        OAuthSheet$$ExternalSyntheticLambda4 oAuthSheet$$ExternalSyntheticLambda4 = new OAuthSheet$$ExternalSyntheticLambda4(passkeysActivity, 13);
                        int i3 = PasskeysActivity.PasskeyCell.Factory.$r8$clinit;
                        UItem uItemOfFactory = UItem.ofFactory(PasskeysActivity.PasskeyCell.Factory.class);
                        uItemOfFactory.object = passkey;
                        uItemOfFactory.clickCallback = oAuthSheet$$ExternalSyntheticLambda4;
                        arrayList.add(uItemOfFactory);
                        i2++;
                    }
                    break;
                }
                break;
            default:
                passkeysActivity.lambda$onItemClick$4((TL_account.Passkey) obj, (String) obj2);
                break;
        }
    }
}

package org.telegram.ui.Components;

import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;

public final class TranslateAlert3$$ExternalSyntheticLambda2 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final TranslateAlert3 f$0;

    public TranslateAlert3$$ExternalSyntheticLambda2(TranslateAlert3 translateAlert3, int i) {
        this.$r8$classId = i;
        this.f$0 = translateAlert3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        String[] strArr;
        switch (this.$r8$classId) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
                TranslateAlert3 translateAlert3 = this.f$0;
                translateAlert3.getClass();
                UItem uItem = new UItem(7);
                uItem.text = null;
                arrayList.add(uItem);
                universalAdapter.itemsOffset = 1;
                universalAdapter.whiteSectionStart();
                String str = translateAlert3.from_lang;
                arrayList.add(TranslateAlert3.Header.Factory.of(3, "", str != null ? TranslateAlert2.capitalFirst(TranslateAlert2.languageName(str, null, null)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null, false, null, null));
                arrayList.add(TranslateAlert3.Text.Factory.of(4, translateAlert3.text, translateAlert3.collapsed, new ContactAddActivity$$ExternalSyntheticLambda8(20, translateAlert3, universalAdapter), new TranslateAlert3$$ExternalSyntheticLambda7(translateAlert3, 0), null));
                StringBuilder sb = new StringBuilder();
                sb.append(TranslateAlert2.languageName(translateAlert3.to_lang, null, null));
                sb.append((translateAlert3.tone == 1 || (strArr = translateAlert3.tonesText) == null) ? "" : MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(" ("), strArr[translateAlert3.tone], ")"));
                arrayList.add(TranslateAlert3.Header.Factory.of(5, "", TranslateAlert2.capitalFirst(sb.toString()), null, new TranslateAlert3$$ExternalSyntheticLambda3(translateAlert3, 4), false, null, null));
                arrayList.add(TranslateAlert3.Text.Factory.of(6, translateAlert3.translated, false, null, new TranslateAlert3$$ExternalSyntheticLambda7(translateAlert3, 0), null));
                universalAdapter.whiteSectionEnd();
                UItem uItem2 = new UItem(7);
                uItem2.text = null;
                arrayList.add(uItem2);
                universalAdapter.whiteSectionStart();
                arrayList.add(UItem.asButton(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
                universalAdapter.whiteSectionEnd();
                break;
            default:
                this.f$0.lambda$requestTranslate$14((TLRPC.TL_messages_translateResult) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}

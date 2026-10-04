package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class a41 implements View.OnClickListener {
    public final int f34668a;
    public final Object f34669b;

    public a41(Object obj, int i10) {
        this.f34668a = i10;
        this.f34669b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f34668a) {
            case 0:
                ((b41) this.f34669b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f34669b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34400a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34402c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34400a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((o41) this.f34669b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34669b;
                MessageObject messageObject = secretMediaViewer.f34428h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.e4 e4Var = secretMediaViewer.f34447r;
                        if (e4Var.V) {
                            e4Var.e(true);
                            return;
                        } else {
                            secretMediaViewer.l();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 4:
                m71 m71Var = (m71) this.f34669b;
                if (m71Var.f38459a0 instanceof TLRPC.User) {
                    ci.d dVar = m71Var.f38466h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        m71Var.R((TLRPC.User) m71Var.f38459a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                n81.a((n81) this.f34669b);
                return;
            case 6:
                ((ge1) this.f34669b).c(true);
                return;
            case 7:
                ((ge1) ((cw0) this.f34669b).f35570c).c(true);
                return;
            case 8:
                ne1 ne1Var = (ne1) this.f34669b;
                ArrayList arrayList = ne1Var.f38965f;
                HashSet hashSet = ne1Var.f38969w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ne1Var.getMessagesController().getUser(Long.valueOf(ne1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20042id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ne1Var.getMessagesController().putChat(chat, false);
                        ne1Var.getMessagesController().deleteParticipantFromChat(chat.f20042id, user);
                    }
                    ne1Var.finishFragment();
                    return;
                }
                return;
            default:
                ej1 ej1Var = (ej1) this.f34669b;
                org.telegram.ui.Cells.a2 a2Var = ej1Var.f36041a;
                a2Var.c(!a2Var.b(), true);
                ej1Var.f36043c.setEnabled(ej1Var.f36041a.b());
                ViewPropertyAnimator animate = ej1Var.f36043c.animate();
                if (ej1Var.f36041a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

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
    public final int f31965a;
    public final Object f31966b;

    public a41(Object obj, int i10) {
        this.f31965a = i10;
        this.f31966b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f31965a) {
            case 0:
                ((b41) this.f31966b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f31966b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f31716a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f31718c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31716a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((o41) this.f31966b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f31966b;
                MessageObject messageObject = secretMediaViewer.f31742h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.e4 e4Var = secretMediaViewer.f31761r;
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
                m71 m71Var = (m71) this.f31966b;
                if (m71Var.f35537a0 instanceof TLRPC.User) {
                    ci.d dVar = m71Var.f35544h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        m71Var.T((TLRPC.User) m71Var.f35537a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                n81.a((n81) this.f31966b);
                return;
            case 6:
                ((ee1) this.f31966b).c(true);
                return;
            case 7:
                ((ee1) ((cw0) this.f31966b).f32804c).c(true);
                return;
            case 8:
                le1 le1Var = (le1) this.f31966b;
                ArrayList arrayList = le1Var.f35331f;
                HashSet hashSet = le1Var.f35335w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = le1Var.getMessagesController().getUser(Long.valueOf(le1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f18329id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        le1Var.getMessagesController().putChat(chat, false);
                        le1Var.getMessagesController().deleteParticipantFromChat(chat.f18329id, user);
                    }
                    le1Var.finishFragment();
                    return;
                }
                return;
            default:
                cj1 cj1Var = (cj1) this.f31966b;
                org.telegram.ui.Cells.a2 a2Var = cj1Var.f32738a;
                a2Var.c(!a2Var.b(), true);
                cj1Var.f32740c.setEnabled(cj1Var.f32738a.b());
                ViewPropertyAnimator animate = cj1Var.f32740c.animate();
                if (cj1Var.f32738a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

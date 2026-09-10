package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class m41 implements View.OnClickListener {
    public final int f34842a;
    public final Object f34843b;

    public m41(Object obj, int i10) {
        this.f34842a = i10;
        this.f34843b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f34842a) {
            case 0:
                ((n41) this.f34843b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f34843b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f30540a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f30542c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f30540a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((x41) this.f34843b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34843b;
                MessageObject messageObject = secretMediaViewer.f30566h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        bi.x4 x4Var = secretMediaViewer.f30585r;
                        if (x4Var.V) {
                            x4Var.e(true);
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
                v71 v71Var = (v71) this.f34843b;
                if (v71Var.f37434a0 instanceof TLRPC.User) {
                    bi.d dVar = v71Var.f37441h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        v71Var.T((TLRPC.User) v71Var.f37434a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                w81.a((w81) this.f34843b);
                return;
            case 6:
                ((pe1) this.f34843b).c(true);
                return;
            case 7:
                ((pe1) ((kw0) this.f34843b).f34467c).c(true);
                return;
            case 8:
                xe1 xe1Var = (xe1) this.f34843b;
                ArrayList arrayList = xe1Var.f38697f;
                HashSet hashSet = xe1Var.f38701w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = xe1Var.getMessagesController().getUser(Long.valueOf(xe1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f17195id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        xe1Var.getMessagesController().putChat(chat, false);
                        xe1Var.getMessagesController().deleteParticipantFromChat(chat.f17195id, user);
                    }
                    xe1Var.finishFragment();
                    return;
                }
                return;
            default:
                qj1 qj1Var = (qj1) this.f34843b;
                org.telegram.ui.Cells.z1 z1Var = qj1Var.f36082a;
                z1Var.c(!z1Var.b(), true);
                qj1Var.f36084c.setEnabled(qj1Var.f36082a.b());
                ViewPropertyAnimator animate = qj1Var.f36084c.animate();
                if (qj1Var.f36082a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

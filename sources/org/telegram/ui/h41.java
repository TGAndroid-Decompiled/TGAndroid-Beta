package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class h41 implements View.OnClickListener {
    public final int f34137a;
    public final Object f34138b;

    public h41(Object obj, int i10) {
        this.f34137a = i10;
        this.f34138b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f34137a) {
            case 0:
                ((i41) this.f34138b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f34138b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f31733a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f31735c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31733a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((v41) this.f34138b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34138b;
                MessageObject messageObject = secretMediaViewer.f31759h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.f4 f4Var = secretMediaViewer.f31778r;
                        if (f4Var.V) {
                            f4Var.e(true);
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
                t71 t71Var = (t71) this.f34138b;
                if (t71Var.f37689a0 instanceof TLRPC.User) {
                    ci.d dVar = t71Var.f37696h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        t71Var.T((TLRPC.User) t71Var.f37689a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                u81.a((u81) this.f34138b);
                return;
            case 6:
                ((me1) this.f34138b).c(true);
                return;
            case 7:
                ((me1) ((iw0) this.f34138b).f34717c).c(true);
                return;
            case 8:
                ue1 ue1Var = (ue1) this.f34138b;
                ArrayList arrayList = ue1Var.f38073f;
                HashSet hashSet = ue1Var.f38077w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ue1Var.getMessagesController().getUser(Long.valueOf(ue1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f18343id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ue1Var.getMessagesController().putChat(chat, false);
                        ue1Var.getMessagesController().deleteParticipantFromChat(chat.f18343id, user);
                    }
                    ue1Var.finishFragment();
                    return;
                }
                return;
            default:
                lj1 lj1Var = (lj1) this.f34138b;
                org.telegram.ui.Cells.a2 a2Var = lj1Var.f35485a;
                a2Var.c(!a2Var.b(), true);
                lj1Var.f35487c.setEnabled(lj1Var.f35485a.b());
                ViewPropertyAnimator animate = lj1Var.f35487c.animate();
                if (lj1Var.f35485a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

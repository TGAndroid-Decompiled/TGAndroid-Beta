package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class g41 implements View.OnClickListener {
    public final int f33755a;
    public final Object f33756b;

    public g41(Object obj, int i10) {
        this.f33755a = i10;
        this.f33756b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f33755a) {
            case 0:
                ((h41) this.f33756b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f33756b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f31428a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f31430c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31428a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((r41) this.f33756b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f33756b;
                MessageObject messageObject = secretMediaViewer.f31454h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.f4 f4Var = secretMediaViewer.f31473r;
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
                q71 q71Var = (q71) this.f33756b;
                if (q71Var.f36788a0 instanceof TLRPC.User) {
                    ci.d dVar = q71Var.f36795h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        q71Var.T((TLRPC.User) q71Var.f36788a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                q81.a((q81) this.f33756b);
                return;
            case 6:
                ((ke1) this.f33756b).c(true);
                return;
            case 7:
                ((ke1) ((iw0) this.f33756b).f34740c).c(true);
                return;
            case 8:
                se1 se1Var = (se1) this.f33756b;
                ArrayList arrayList = se1Var.f37371f;
                HashSet hashSet = se1Var.f37375w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = se1Var.getMessagesController().getUser(Long.valueOf(se1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f18112id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        se1Var.getMessagesController().putChat(chat, false);
                        se1Var.getMessagesController().deleteParticipantFromChat(chat.f18112id, user);
                    }
                    se1Var.finishFragment();
                    return;
                }
                return;
            default:
                lj1 lj1Var = (lj1) this.f33756b;
                org.telegram.ui.Cells.z1 z1Var = lj1Var.f35524a;
                z1Var.c(!z1Var.b(), true);
                lj1Var.f35526c.setEnabled(lj1Var.f35524a.b());
                ViewPropertyAnimator animate = lj1Var.f35526c.animate();
                if (lj1Var.f35524a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

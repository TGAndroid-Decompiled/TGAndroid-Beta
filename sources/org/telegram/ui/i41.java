package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class i41 implements View.OnClickListener {
    public final int f34434a;
    public final Object f34435b;

    public i41(Object obj, int i10) {
        this.f34434a = i10;
        this.f34435b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f34434a) {
            case 0:
                ((j41) this.f34435b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f34435b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f31445a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f31447c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31445a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((u41) this.f34435b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34435b;
                MessageObject messageObject = secretMediaViewer.f31471h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.f4 f4Var = secretMediaViewer.f31490r;
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
                s71 s71Var = (s71) this.f34435b;
                if (s71Var.f37406a0 instanceof TLRPC.User) {
                    ci.d dVar = s71Var.f37413h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        s71Var.T((TLRPC.User) s71Var.f37406a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                s81.a((s81) this.f34435b);
                return;
            case 6:
                ((me1) this.f34435b).c(true);
                return;
            case 7:
                ((me1) ((kw0) this.f34435b).f35375c).c(true);
                return;
            case 8:
                ue1 ue1Var = (ue1) this.f34435b;
                ArrayList arrayList = ue1Var.f38060f;
                HashSet hashSet = ue1Var.f38064w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ue1Var.getMessagesController().getUser(Long.valueOf(ue1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f18121id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ue1Var.getMessagesController().putChat(chat, false);
                        ue1Var.getMessagesController().deleteParticipantFromChat(chat.f18121id, user);
                    }
                    ue1Var.finishFragment();
                    return;
                }
                return;
            default:
                lj1 lj1Var = (lj1) this.f34435b;
                org.telegram.ui.Cells.z1 z1Var = lj1Var.f35581a;
                z1Var.c(!z1Var.b(), true);
                lj1Var.f35583c.setEnabled(lj1Var.f35581a.b());
                ViewPropertyAnimator animate = lj1Var.f35583c.animate();
                if (lj1Var.f35581a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

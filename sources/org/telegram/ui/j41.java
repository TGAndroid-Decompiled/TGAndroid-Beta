package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class j41 implements View.OnClickListener {
    public final int f37503a;
    public final Object f37504b;

    public j41(Object obj, int i10) {
        this.f37503a = i10;
        this.f37504b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f37503a) {
            case 0:
                ((k41) this.f37504b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f37504b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34048a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34050c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34048a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((u41) this.f37504b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37504b;
                MessageObject messageObject = secretMediaViewer.f34076h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        di.f4 f4Var = secretMediaViewer.f34095r;
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
                t71 t71Var = (t71) this.f37504b;
                if (t71Var.f40648a0 instanceof TLRPC.User) {
                    di.d dVar = t71Var.f40655h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        t71Var.T((TLRPC.User) t71Var.f40648a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                u81.a((u81) this.f37504b);
                return;
            case 6:
                ((le1) this.f37504b).c(true);
                return;
            case 7:
                ((le1) ((hw0) this.f37504b).f37119c).c(true);
                return;
            case 8:
                te1 te1Var = (te1) this.f37504b;
                ArrayList arrayList = te1Var.f40732f;
                HashSet hashSet = te1Var.f40736w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = te1Var.getMessagesController().getUser(Long.valueOf(te1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f19869id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        te1Var.getMessagesController().putChat(chat, false);
                        te1Var.getMessagesController().deleteParticipantFromChat(chat.f19869id, user);
                    }
                    te1Var.finishFragment();
                    return;
                }
                return;
            default:
                mj1 mj1Var = (mj1) this.f37504b;
                org.telegram.ui.Cells.z1 z1Var = mj1Var.f38724a;
                z1Var.c(!z1Var.b(), true);
                mj1Var.f38726c.setEnabled(mj1Var.f38724a.b());
                ViewPropertyAnimator animate = mj1Var.f38726c.animate();
                if (mj1Var.f38724a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

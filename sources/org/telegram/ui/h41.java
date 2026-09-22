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
    public final int f34097a;
    public final Object f34098b;

    public h41(Object obj, int i10) {
        this.f34097a = i10;
        this.f34098b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f34097a) {
            case 0:
                ((i41) this.f34098b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f34098b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f31425a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f31427c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f31425a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((s41) this.f34098b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34098b;
                MessageObject messageObject = secretMediaViewer.f31451h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.f4 f4Var = secretMediaViewer.f31470r;
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
                r71 r71Var = (r71) this.f34098b;
                if (r71Var.f37051a0 instanceof TLRPC.User) {
                    ci.d dVar = r71Var.f37058h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        r71Var.T((TLRPC.User) r71Var.f37051a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                r81.a((r81) this.f34098b);
                return;
            case 6:
                ((le1) this.f34098b).c(true);
                return;
            case 7:
                ((le1) ((iw0) this.f34098b).f34727c).c(true);
                return;
            case 8:
                te1 te1Var = (te1) this.f34098b;
                ArrayList arrayList = te1Var.f37651f;
                HashSet hashSet = te1Var.f37655w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = te1Var.getMessagesController().getUser(Long.valueOf(te1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f18109id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        te1Var.getMessagesController().putChat(chat, false);
                        te1Var.getMessagesController().deleteParticipantFromChat(chat.f18109id, user);
                    }
                    te1Var.finishFragment();
                    return;
                }
                return;
            default:
                mj1 mj1Var = (mj1) this.f34098b;
                org.telegram.ui.Cells.z1 z1Var = mj1Var.f35764a;
                z1Var.c(!z1Var.b(), true);
                mj1Var.f35766c.setEnabled(mj1Var.f35764a.b());
                ViewPropertyAnimator animate = mj1Var.f35766c.animate();
                if (mj1Var.f35764a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

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
    public final int f37530a;
    public final Object f37531b;

    public j41(Object obj, int i10) {
        this.f37530a = i10;
        this.f37531b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f37530a) {
            case 0:
                ((k41) this.f37531b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f37531b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34075a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34077c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34075a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((u41) this.f37531b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37531b;
                MessageObject messageObject = secretMediaViewer.f34103h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        di.f4 f4Var = secretMediaViewer.f34122r;
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
                t71 t71Var = (t71) this.f37531b;
                if (t71Var.f40675a0 instanceof TLRPC.User) {
                    di.d dVar = t71Var.f40682h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        t71Var.T((TLRPC.User) t71Var.f40675a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                u81.a((u81) this.f37531b);
                return;
            case 6:
                ((le1) this.f37531b).c(true);
                return;
            case 7:
                ((le1) ((hw0) this.f37531b).f37146c).c(true);
                return;
            case 8:
                te1 te1Var = (te1) this.f37531b;
                ArrayList arrayList = te1Var.f40759f;
                HashSet hashSet = te1Var.f40763w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = te1Var.getMessagesController().getUser(Long.valueOf(te1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f19896id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        te1Var.getMessagesController().putChat(chat, false);
                        te1Var.getMessagesController().deleteParticipantFromChat(chat.f19896id, user);
                    }
                    te1Var.finishFragment();
                    return;
                }
                return;
            default:
                mj1 mj1Var = (mj1) this.f37531b;
                org.telegram.ui.Cells.z1 z1Var = mj1Var.f38751a;
                z1Var.c(!z1Var.b(), true);
                mj1Var.f38753c.setEnabled(mj1Var.f38751a.b());
                ViewPropertyAnimator animate = mj1Var.f38753c.animate();
                if (mj1Var.f38751a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

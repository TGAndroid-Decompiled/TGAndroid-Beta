package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class k31 implements View.OnClickListener {
    public final int f38265a;
    public final Object f38266b;

    public k31(Object obj, int i10) {
        this.f38265a = i10;
        this.f38266b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        switch (this.f38265a) {
            case 0:
                i31 i31Var = (i31) ((eg.q1) this.f38266b).f5446e;
                if (i31Var != null) {
                    i31Var.run();
                    return;
                }
                return;
            case 1:
                ((r31) this.f38266b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f38266b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34750a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34752c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34750a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((b41) this.f38266b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38266b;
                MessageObject messageObject = secretMediaViewer.f34771e0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        qh.f3 f3Var = secretMediaViewer.f34797r;
                        if (f3Var.S) {
                            f3Var.e(true);
                            return;
                        } else {
                            secretMediaViewer.l();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 5:
                c71 c71Var = (c71) this.f38266b;
                if (c71Var.X instanceof TLRPC.User) {
                    qh.d dVar = c71Var.f35700e0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        c71Var.T((TLRPC.User) c71Var.X, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                c81.a((c81) this.f38266b);
                return;
            case 7:
                ((ud1) this.f38266b).c(true);
                return;
            case 8:
                ((ud1) ((hg.u) this.f38266b).f7616c).c(true);
                return;
            case 9:
                be1 be1Var = (be1) this.f38266b;
                ArrayList arrayList = be1Var.f35495f;
                HashSet hashSet = be1Var.f35499w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = be1Var.getMessagesController().getUser(Long.valueOf(be1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20843id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        be1Var.getMessagesController().putChat(chat, false);
                        be1Var.getMessagesController().deleteParticipantFromChat(chat.f20843id, user);
                    }
                    be1Var.finishFragment();
                    return;
                }
                return;
            default:
                vi1 vi1Var = (vi1) this.f38266b;
                org.telegram.ui.Cells.z1 z1Var = vi1Var.f42244a;
                z1Var.c(!z1Var.b(), true);
                vi1Var.f42246c.setEnabled(vi1Var.f42244a.b());
                ViewPropertyAnimator animate = vi1Var.f42246c.animate();
                if (vi1Var.f42244a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}

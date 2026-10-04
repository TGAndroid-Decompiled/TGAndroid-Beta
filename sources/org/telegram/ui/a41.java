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
    public final int f34661a;
    public final Object f34662b;

    public a41(Object obj, int i10) {
        this.f34661a = i10;
        this.f34662b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f7;
        switch (this.f34661a) {
            case 0:
                ((b41) this.f34662b).dismiss();
                return;
            case 1:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f34662b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34393a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34395c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34393a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 2:
                ((o41) this.f34662b).dismiss();
                return;
            case 3:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34662b;
                MessageObject messageObject = secretMediaViewer.f34421h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.e4 e4Var = secretMediaViewer.f34440r;
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
                m71 m71Var = (m71) this.f34662b;
                if (m71Var.f38453a0 instanceof TLRPC.User) {
                    ci.d dVar = m71Var.f38460h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        m71Var.R((TLRPC.User) m71Var.f38453a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                n81.a((n81) this.f34662b);
                return;
            case 6:
                ((ge1) this.f34662b).c(true);
                return;
            case 7:
                ((ge1) ((cw0) this.f34662b).f35564c).c(true);
                return;
            case 8:
                ne1 ne1Var = (ne1) this.f34662b;
                ArrayList arrayList = ne1Var.f38959f;
                HashSet hashSet = ne1Var.f38963w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ne1Var.getMessagesController().getUser(Long.valueOf(ne1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20037id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ne1Var.getMessagesController().putChat(chat, false);
                        ne1Var.getMessagesController().deleteParticipantFromChat(chat.f20037id, user);
                    }
                    ne1Var.finishFragment();
                    return;
                }
                return;
            default:
                ej1 ej1Var = (ej1) this.f34662b;
                org.telegram.ui.Cells.a2 a2Var = ej1Var.f36035a;
                a2Var.c(!a2Var.b(), true);
                ej1Var.f36037c.setEnabled(ej1Var.f36035a.b());
                ViewPropertyAnimator animate = ej1Var.f36037c.animate();
                if (ej1Var.f36035a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class g31 implements View.OnClickListener {
    public final int f37477a;
    public final Object f37478b;

    public g31(Object obj, int i10) {
        this.f37477a = i10;
        this.f37478b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.z1 z1Var;
        float f7;
        switch (this.f37477a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f37478b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34077a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34079c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34077a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 1:
                ((l31) this.f37478b).dismiss();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37478b;
                MessageObject messageObject = secretMediaViewer.f34103h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ei.x3 x3Var = secretMediaViewer.f34122r;
                        if (x3Var.V) {
                            x3Var.e(true);
                            return;
                        } else {
                            secretMediaViewer.l();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 3:
                l61 l61Var = (l61) this.f37478b;
                if (l61Var.f39140a0 instanceof TLRPC.User) {
                    ei.d dVar = l61Var.f39147h0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        l61Var.T((TLRPC.User) l61Var.f39140a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = ((m71) this.f37478b).f39390f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    w9.e0(sessionsActivity.getParentActivity(), 2, new k71(sessionsActivity));
                    return;
                }
                return;
            case 5:
                ((ed1) this.f37478b).c(true);
                return;
            case 6:
                ((ed1) ((ai.j5) this.f37478b).f1545c).c(true);
                return;
            case 7:
                md1 md1Var = (md1) this.f37478b;
                ArrayList arrayList = md1Var.f39514f;
                HashSet hashSet = md1Var.f39518w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = md1Var.getMessagesController().getUser(Long.valueOf(md1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20343id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        md1Var.getMessagesController().putChat(chat, false);
                        md1Var.getMessagesController().deleteParticipantFromChat(chat.f20343id, user);
                    }
                    md1Var.finishFragment();
                    return;
                }
                return;
            default:
                hi1 hi1Var = (hi1) this.f37478b;
                hi1Var.f37869a.c(!z1Var.b(), true);
                hi1Var.f37871c.setEnabled(hi1Var.f37869a.b());
                ViewPropertyAnimator animate = hi1Var.f37871c.animate();
                if (hi1Var.f37869a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

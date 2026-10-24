package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class f31 implements View.OnClickListener {
    public final int f37180a;
    public final Object f37181b;

    public f31(Object obj, int i10) {
        this.f37180a = i10;
        this.f37181b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.z1 z1Var;
        float f7;
        switch (this.f37180a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f37181b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34079a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34081c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34079a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 1:
                ((k31) this.f37181b).dismiss();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37181b;
                MessageObject messageObject = secretMediaViewer.f34105h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ei.x3 x3Var = secretMediaViewer.f34124r;
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
                k61 k61Var = (k61) this.f37181b;
                if (k61Var.f38800a0 instanceof TLRPC.User) {
                    ei.d dVar = k61Var.f38807h0;
                    if (!dVar.Q) {
                        dVar.setLoading(true);
                        k61Var.T((TLRPC.User) k61Var.f38800a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = ((l71) this.f37181b).f39133f;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    w9.e0(sessionsActivity.getParentActivity(), 2, new j71(sessionsActivity));
                    return;
                }
                return;
            case 5:
                ((dd1) this.f37181b).c(true);
                return;
            case 6:
                ((dd1) ((ai.j5) this.f37181b).f1545c).c(true);
                return;
            case 7:
                ld1 ld1Var = (ld1) this.f37181b;
                ArrayList arrayList = ld1Var.f39205f;
                HashSet hashSet = ld1Var.f39209w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ld1Var.getMessagesController().getUser(Long.valueOf(ld1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20344id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ld1Var.getMessagesController().putChat(chat, false);
                        ld1Var.getMessagesController().deleteParticipantFromChat(chat.f20344id, user);
                    }
                    ld1Var.finishFragment();
                    return;
                }
                return;
            default:
                gi1 gi1Var = (gi1) this.f37181b;
                gi1Var.f37588a.c(!z1Var.b(), true);
                gi1Var.f37590c.setEnabled(gi1Var.f37588a.b());
                ViewPropertyAnimator animate = gi1Var.f37590c.animate();
                if (gi1Var.f37588a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class c31 implements View.OnClickListener {
    public final int f35793a;
    public final Object f35794b;

    public c31(Object obj, int i10) {
        this.f35793a = i10;
        this.f35794b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.a2 a2Var;
        float f7;
        switch (this.f35793a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f35794b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f33769a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f33771c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f33769a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 1:
                ((h31) this.f35794b).dismiss();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35794b;
                MessageObject messageObject = secretMediaViewer.f33795h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ei.x3 x3Var = secretMediaViewer.f33814r;
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
                h61 h61Var = (h61) this.f35794b;
                if (h61Var.f37499a0 instanceof TLRPC.User) {
                    ei.d dVar = h61Var.f37506h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        h61Var.U((TLRPC.User) h61Var.f37499a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = ((i71) this.f35794b).d;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    w9.e0(sessionsActivity.getParentActivity(), 2, new g71(sessionsActivity));
                    return;
                }
                return;
            case 5:
                ((yc1) this.f35794b).c(true);
                return;
            case 6:
                ((yc1) ((ai.j5) this.f35794b).f1567c).c(true);
                return;
            case 7:
                gd1 gd1Var = (gd1) this.f35794b;
                ArrayList arrayList = gd1Var.f37281f;
                HashSet hashSet = gd1Var.f37285w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = gd1Var.getMessagesController().getUser(Long.valueOf(gd1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20273id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        gd1Var.getMessagesController().putChat(chat, false);
                        gd1Var.getMessagesController().deleteParticipantFromChat(chat.f20273id, user);
                    }
                    gd1Var.finishFragment();
                    return;
                }
                return;
            default:
                zh1 zh1Var = (zh1) this.f35794b;
                zh1Var.f43756a.c(!a2Var.b(), true);
                zh1Var.f43758c.setEnabled(zh1Var.f43756a.b());
                ViewPropertyAnimator animate = zh1Var.f43758c.animate();
                if (zh1Var.f43756a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

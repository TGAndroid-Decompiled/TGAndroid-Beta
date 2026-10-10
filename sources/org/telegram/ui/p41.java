package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class p41 implements View.OnClickListener {
    public final int f40711a;
    public final Object f40712b;

    public p41(Object obj, int i10) {
        this.f40711a = i10;
        this.f40712b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.a2 a2Var;
        float f7;
        switch (this.f40711a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f40712b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34441a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34443c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34441a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 1:
                ((u41) this.f40712b).dismiss();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40712b;
                MessageObject messageObject = secretMediaViewer.f34469h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.d4 d4Var = secretMediaViewer.f34488r;
                        if (d4Var.V) {
                            d4Var.e(true);
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
                u71 u71Var = (u71) this.f40712b;
                if (u71Var.f42396a0 instanceof TLRPC.User) {
                    ci.d dVar = u71Var.f42403h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        u71Var.U((TLRPC.User) u71Var.f42396a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = ((v81) this.f40712b).d;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    v9.e0(sessionsActivity.getParentActivity(), false, 2, new t81(sessionsActivity));
                    return;
                }
                return;
            case 5:
                ((me1) this.f40712b).c(true);
                return;
            case 6:
                ((me1) ((iw0) this.f40712b).f38818c).c(true);
                return;
            case 7:
                ue1 ue1Var = (ue1) this.f40712b;
                ArrayList arrayList = ue1Var.f42460f;
                HashSet hashSet = ue1Var.f42464w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = ue1Var.getMessagesController().getUser(Long.valueOf(ue1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20042id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        ue1Var.getMessagesController().putChat(chat, false);
                        ue1Var.getMessagesController().deleteParticipantFromChat(chat.f20042id, user);
                    }
                    ue1Var.finishFragment();
                    return;
                }
                return;
            default:
                oj1 oj1Var = (oj1) this.f40712b;
                oj1Var.f40590a.c(!a2Var.b(), true);
                oj1Var.f40592c.setEnabled(oj1Var.f40590a.b());
                ViewPropertyAnimator animate = oj1Var.f40592c.animate();
                if (oj1Var.f40590a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

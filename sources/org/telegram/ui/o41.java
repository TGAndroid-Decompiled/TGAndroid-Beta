package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class o41 implements View.OnClickListener {
    public final int f40452a;
    public final Object f40453b;

    public o41(Object obj, int i10) {
        this.f40452a = i10;
        this.f40453b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.a2 a2Var;
        float f7;
        switch (this.f40452a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f40453b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34465a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34467c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34465a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 1:
                ((t41) this.f40453b).dismiss();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40453b;
                MessageObject messageObject = secretMediaViewer.f34493h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.d4 d4Var = secretMediaViewer.f34512r;
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
                t71 t71Var = (t71) this.f40453b;
                if (t71Var.f42141a0 instanceof TLRPC.User) {
                    ci.d dVar = t71Var.f42148h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        t71Var.U((TLRPC.User) t71Var.f42141a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = ((u81) this.f40453b).d;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    u9.e0(sessionsActivity.getParentActivity(), false, 2, new s81(sessionsActivity));
                    return;
                }
                return;
            case 5:
                ((le1) this.f40453b).c(true);
                return;
            case 6:
                ((le1) ((hw0) this.f40453b).f38558c).c(true);
                return;
            case 7:
                te1 te1Var = (te1) this.f40453b;
                ArrayList arrayList = te1Var.f42205f;
                HashSet hashSet = te1Var.f42209w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = te1Var.getMessagesController().getUser(Long.valueOf(te1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20068id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        te1Var.getMessagesController().putChat(chat, false);
                        te1Var.getMessagesController().deleteParticipantFromChat(chat.f20068id, user);
                    }
                    te1Var.finishFragment();
                    return;
                }
                return;
            default:
                mj1 mj1Var = (mj1) this.f40453b;
                mj1Var.f39995a.c(!a2Var.b(), true);
                mj1Var.f39997c.setEnabled(mj1Var.f39995a.b());
                ViewPropertyAnimator animate = mj1Var.f39997c.animate();
                if (mj1Var.f39995a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

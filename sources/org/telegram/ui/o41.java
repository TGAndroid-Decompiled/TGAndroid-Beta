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
    public final int f40418a;
    public final Object f40419b;

    public o41(Object obj, int i10) {
        this.f40418a = i10;
        this.f40419b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.a2 a2Var;
        float f7;
        switch (this.f40418a) {
            case 0:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f40419b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f34431a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f34433c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f34431a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 1:
                ((t41) this.f40419b).dismiss();
                return;
            case 2:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40419b;
                MessageObject messageObject = secretMediaViewer.f34459h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ci.d4 d4Var = secretMediaViewer.f34478r;
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
                t71 t71Var = (t71) this.f40419b;
                if (t71Var.f42107a0 instanceof TLRPC.User) {
                    ci.d dVar = t71Var.f42114h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        t71Var.U((TLRPC.User) t71Var.f42107a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                SessionsActivity sessionsActivity = ((u81) this.f40419b).d;
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
                ((le1) this.f40419b).c(true);
                return;
            case 6:
                ((le1) ((hw0) this.f40419b).f38524c).c(true);
                return;
            case 7:
                te1 te1Var = (te1) this.f40419b;
                ArrayList arrayList = te1Var.f42171f;
                HashSet hashSet = te1Var.f42175w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = te1Var.getMessagesController().getUser(Long.valueOf(te1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20032id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        te1Var.getMessagesController().putChat(chat, false);
                        te1Var.getMessagesController().deleteParticipantFromChat(chat.f20032id, user);
                    }
                    te1Var.finishFragment();
                    return;
                }
                return;
            default:
                mj1 mj1Var = (mj1) this.f40419b;
                mj1Var.f39961a.c(!a2Var.b(), true);
                mj1Var.f39963c.setEnabled(mj1Var.f39961a.b());
                ViewPropertyAnimator animate = mj1Var.f39963c.animate();
                if (mj1Var.f39961a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

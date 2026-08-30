package org.telegram.ui;

import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.tgnet.TLRPC;
public final class i31 implements View.OnClickListener {
    public final int f35005a;
    public final Object f35006b;

    public i31(Object obj, int i10) {
        this.f35005a = i10;
        this.f35006b = obj;
    }

    @Override
    public final void onClick(View view) {
        float f10;
        switch (this.f35005a) {
            case 0:
                g31 g31Var = (g31) ((dg.s1) this.f35006b).e;
                if (g31Var != null) {
                    g31Var.run();
                    return;
                }
                return;
            case 1:
                ((p31) this.f35006b).dismiss();
                return;
            case 2:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.f35006b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.f32216a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.f32218c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.f32216a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                return;
            case 3:
                ((z31) this.f35006b).dismiss();
                return;
            case 4:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35006b;
                MessageObject messageObject = secretMediaViewer.f32235e0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ph.f3 f3Var = secretMediaViewer.f32261r;
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
                b71 b71Var = (b71) this.f35006b;
                if (b71Var.X instanceof TLRPC.User) {
                    ph.d dVar = b71Var.f32833e0;
                    if (!dVar.K) {
                        dVar.setLoading(true);
                        b71Var.T((TLRPC.User) b71Var.X, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                b81.a((b81) this.f35006b);
                return;
            case 7:
                ((rd1) this.f35006b).c(true);
                return;
            case 8:
                ((rd1) ((gg.u) this.f35006b).f6761c).c(true);
                return;
            case 9:
                yd1 yd1Var = (yd1) this.f35006b;
                ArrayList arrayList = yd1Var.f40495f;
                HashSet hashSet = yd1Var.f40499w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = yd1Var.getMessagesController().getUser(Long.valueOf(yd1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f19184id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        yd1Var.getMessagesController().putChat(chat, false);
                        yd1Var.getMessagesController().deleteParticipantFromChat(chat.f19184id, user);
                    }
                    yd1Var.finishFragment();
                    return;
                }
                return;
            default:
                si1 si1Var = (si1) this.f35006b;
                org.telegram.ui.Cells.z1 z1Var = si1Var.f38382a;
                z1Var.c(!z1Var.b(), true);
                si1Var.f38384c.setEnabled(si1Var.f38382a.b());
                ViewPropertyAnimator animate = si1Var.f38384c.animate();
                if (si1Var.f38382a.b()) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.5f;
                }
                animate.alpha(f10).start();
                return;
        }
    }
}

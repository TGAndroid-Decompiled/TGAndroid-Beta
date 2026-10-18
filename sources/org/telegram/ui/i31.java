package org.telegram.ui;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class i31 implements View.OnClickListener {
    public final int f37707a;
    public final Object f37708b;

    public i31(Object obj, int i10) {
        this.f37707a = i10;
        this.f37708b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.a2 a2Var;
        float f7;
        switch (this.f37707a) {
            case 0:
                ((j31) this.f37708b).dismiss();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37708b;
                MessageObject messageObject = secretMediaViewer.f33787h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ei.x3 x3Var = secretMediaViewer.f33806r;
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
            case 2:
                j61 j61Var = (j61) this.f37708b;
                if (j61Var.f38053a0 instanceof TLRPC.User) {
                    ei.d dVar = j61Var.f38060h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        j61Var.U((TLRPC.User) j61Var.f38053a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                SessionsActivity sessionsActivity = ((k71) this.f37708b).d;
                if (sessionsActivity.getParentActivity() != null) {
                    if (sessionsActivity.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                        sessionsActivity.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                        return;
                    }
                    y9.e0(sessionsActivity.getParentActivity(), false, 2, new i71(sessionsActivity));
                    return;
                }
                return;
            case 4:
                ((ad1) this.f37708b).c(true);
                return;
            case 5:
                ((ad1) ((ai.i5) this.f37708b).f1482c).c(true);
                return;
            case 6:
                id1 id1Var = (id1) this.f37708b;
                ArrayList arrayList = id1Var.f37831f;
                HashSet hashSet = id1Var.f37835w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = id1Var.getMessagesController().getUser(Long.valueOf(id1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20272id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        id1Var.getMessagesController().putChat(chat, false);
                        id1Var.getMessagesController().deleteParticipantFromChat(chat.f20272id, user);
                    }
                    id1Var.finishFragment();
                    return;
                }
                return;
            default:
                bi1 bi1Var = (bi1) this.f37708b;
                bi1Var.f35674a.c(!a2Var.b(), true);
                bi1Var.f35676c.setEnabled(bi1Var.f35674a.b());
                ViewPropertyAnimator animate = bi1Var.f35676c.animate();
                if (bi1Var.f35674a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

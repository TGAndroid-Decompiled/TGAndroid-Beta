package org.telegram.ui;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
public final class i31 implements View.OnClickListener {
    public final int f37745a;
    public final Object f37746b;

    public i31(Object obj, int i10) {
        this.f37745a = i10;
        this.f37746b = obj;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Cells.a2 a2Var;
        float f7;
        switch (this.f37745a) {
            case 0:
                ((j31) this.f37746b).dismiss();
                return;
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37746b;
                MessageObject messageObject = secretMediaViewer.f33794h0;
                if (messageObject != null) {
                    TLRPC.Message message = messageObject.messageOwner;
                    if (message.destroyTime != 0 || message.ttl == Integer.MAX_VALUE) {
                        ei.x3 x3Var = secretMediaViewer.f33813r;
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
                j61 j61Var = (j61) this.f37746b;
                if (j61Var.f38071a0 instanceof TLRPC.User) {
                    ei.d dVar = j61Var.f38078h0;
                    if (!dVar.N) {
                        dVar.setLoading(true);
                        j61Var.U((TLRPC.User) j61Var.f38071a0, null, null);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                SessionsActivity sessionsActivity = ((k71) this.f37746b).d;
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
                ((ad1) this.f37746b).c(true);
                return;
            case 5:
                ((ad1) ((ai.i5) this.f37746b).f1481c).c(true);
                return;
            case 6:
                id1 id1Var = (id1) this.f37746b;
                ArrayList arrayList = id1Var.f37869f;
                HashSet hashSet = id1Var.f37873w;
                if (!hashSet.isEmpty()) {
                    TLRPC.User user = id1Var.getMessagesController().getUser(Long.valueOf(id1Var.getUserConfig().getClientUserId()));
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (hashSet.contains(Long.valueOf(((TLRPC.Chat) arrayList.get(i10)).f20279id))) {
                            arrayList2.add((TLRPC.Chat) arrayList.get(i10));
                        }
                    }
                    for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                        TLRPC.Chat chat = (TLRPC.Chat) arrayList2.get(i11);
                        id1Var.getMessagesController().putChat(chat, false);
                        id1Var.getMessagesController().deleteParticipantFromChat(chat.f20279id, user);
                    }
                    id1Var.finishFragment();
                    return;
                }
                return;
            default:
                bi1 bi1Var = (bi1) this.f37746b;
                bi1Var.f35719a.c(!a2Var.b(), true);
                bi1Var.f35721c.setEnabled(bi1Var.f35719a.b());
                ViewPropertyAnimator animate = bi1Var.f35721c.animate();
                if (bi1Var.f35719a.b()) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.5f;
                }
                animate.alpha(f7).start();
                return;
        }
    }
}

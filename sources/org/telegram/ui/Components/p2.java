package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ContactsActivity;
import org.telegram.ui.LaunchActivity;
public final class p2 implements org.telegram.ui.ActionBar.z1, d5, IMapsProvider.ITouchInterceptor, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, cj, org.telegram.ui.ActionBar.l1, cm0, Utilities.Callback5, MessagesStorage.BooleanCallback, bm0, dm0 {
    public final int f29401a;
    public final Object f29402b;
    public final Object f29403c;

    public p2(int i10, Object obj, Object obj2) {
        this.f29401a = i10;
        this.f29402b = obj;
        this.f29403c = obj2;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f29401a) {
            case 6:
                String str = (String) this.f29402b;
                ChatActivityEnterView chatActivityEnterView = ((of) this.f29403c).f29168a;
                long j10 = chatActivityEnterView.Q2;
                MessageObject messageObject = chatActivityEnterView.T2;
                threadMessage = chatActivityEnterView.getThreadMessage();
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, j10, messageObject, threadMessage, null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.sn snVar = chatActivityEnterView.P2;
                if (snVar != null) {
                    sendMessageChatArguments = snVar.H8();
                } else {
                    sendMessageChatArguments = null;
                }
                of2.sendMessageChatArguments = sendMessageChatArguments;
                of2.effect_id = chatActivityEnterView.S4;
                SendMessagesHelper.getInstance(chatActivityEnterView.Q).sendMessage(of2);
                chatActivityEnterView.setFieldText("");
                chatActivityEnterView.m0.c();
                xe xeVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                xeVar.setEffect(0L);
                return;
            case 7:
                ((ng) this.f29402b).o((t0.i) this.f29403c, z10, i10, i11);
                return;
            case 8:
            default:
                fo foVar = (fo) this.f29402b;
                View view = (View) this.f29403c;
                if (z10) {
                    foVar.V = i10;
                    foVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        foVar.X((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        foVar.f26418r.m(foVar.I0);
                        return;
                    }
                }
                foVar.getClass();
                return;
            case 9:
                rl rlVar = ((ol) this.f29402b).f29228b;
                rlVar.f30213v0.b(((ql) this.f29403c).f29938c, rlVar.f30215w0, z10, i10, 0L);
                rlVar.f28366b.dismiss(true);
                return;
        }
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a() {
        cp cpVar = (cp) this.f29402b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29403c;
        if (cpVar.f25396c != null) {
            cpVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            cpVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.s5 s5Var) {
        int i10;
        TLRPC.Chat chat;
        sm smVar = (sm) this.f29402b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.f29403c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = smVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f24265v0;
        ti tiVar = chatAttachAlertPhotoLayout.f28366b;
        if (z10) {
            int i11 = tiVar.T0;
            org.telegram.ui.ActionBar.o2 o2Var = tiVar.f30730f0;
            if (i11 == 0 && !tiVar.H) {
                int intValue = ((Integer) s5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f24224s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                        new xc(tiVar.f30777u1, chatAttachAlertPhotoLayout.f28365a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", o2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && tiVar.V1 >= 0 && hashMap.size() >= tiVar.V1) {
                        if (tiVar.W1 && (o2Var instanceof org.telegram.ui.sn) && (chat = ((org.telegram.ui.sn) o2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            f5.O(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f28365a).p();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f24225t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((o2Var instanceof org.telegram.ui.sn) && tiVar.W1) {
                        s5Var.b(i10, z12, true);
                    } else {
                        s5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    sm smVar2 = chatAttachAlertPhotoLayout.v;
                    if (smVar == smVar2) {
                        sm smVar3 = chatAttachAlertPhotoLayout.G;
                        if (smVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (smVar3.f30519f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        smVar3.m(intValue);
                    } else {
                        smVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    tiVar.d2(i12);
                    s5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    s5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j10 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z11 = false;
                    }
                    s5Var2.f(j10, z11);
                }
            }
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.f29403c;
        m61 G = ((j71) this.f29402b).Z2.G(i10);
        if (G == null) {
            return;
        }
        callback5.mo0run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
    }

    @Override
    public boolean d(int i10, View view) {
        return aw.r((aw) this.f29402b, (Context) this.f29403c, view);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ym ymVar = (ym) this.f29402b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f29403c;
        ymVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && ymVar.d.getBitmap() == null) {
            if (ymVar.d.getBitmap() != null && !ymVar.d.getBitmap().isRecycled()) {
                ymVar.d.getBitmap().recycle();
                ymVar.d.setImageBitmap((Bitmap) null);
            }
            ymVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override
    public void f(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f29402b;
        mn mnVar = (mn) this.f29403c;
        if (!arrayList.isEmpty()) {
            callback.run(new sh.g((MessageObject) arrayList.get(0)));
        }
        mnVar.dismiss(true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f29401a) {
            case 0:
                String str = (String) this.f29402b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f29403c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(o2Var.getCurrentAccount()).getInviteText(1));
                    o2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f29402b;
                int i11 = encryptedChat.ttl;
                int value = ((qd0) this.f29403c).getValue();
                if (value >= 0 && value < 16) {
                    encryptedChat.ttl = value;
                } else if (value == 16) {
                    encryptedChat.ttl = 30;
                } else if (value == 17) {
                    encryptedChat.ttl = 60;
                } else if (value == 18) {
                    encryptedChat.ttl = 3600;
                } else if (value == 19) {
                    encryptedChat.ttl = 86400;
                } else if (value == 20) {
                    encryptedChat.ttl = 604800;
                }
                if (i11 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.fa) this.f29402b).run(((boolean[]) this.f29403c)[0]);
                return;
            case 3:
                Runnable runnable = (Runnable) this.f29403c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f29402b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ((MessagesStorage.BooleanCallback) this.f29402b).run(((boolean[]) this.f29403c)[0]);
                return;
            case 5:
                org.telegram.ui.ks ksVar = (org.telegram.ui.ks) this.f29402b;
                boolean[] zArr = (boolean[]) this.f29403c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) ksVar.f39051b;
                ArrayList arrayList = (ArrayList) ksVar.f39052c;
                eyVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l4 = (Long) arrayList.get(i12);
                    long longValue = l4.longValue();
                    if (z10) {
                        eyVar.getMessagesController().reportSpam(longValue, eyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        eyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    eyVar.getMessagesController().blockPeer(longValue);
                }
                eyVar.Z3(false);
                return;
            case 16:
                ((hu) this.f29402b).run(((ai.t) this.f29403c).getText().toString().trim());
                return;
            case 18:
                m40 m40Var = (m40) this.f29403c;
                HashtagSearchController.getInstance(m40Var.f28500a).removeHashtagFromHistory((String) this.f29402b);
                m40Var.f28503f.N(true);
                return;
            case 19:
                xa0 xa0Var = ((qa0) this.f29402b).f29821a;
                xa0Var.getMessagesController().getStoriesController().s(xa0Var.e, (ArrayList) this.f29403c);
                xa0Var.V.M(false);
                return;
            case 21:
                ap0 ap0Var = (ap0) this.f29402b;
                ap0Var.getClass();
                c2Var.dismiss();
                ap0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f29403c);
                ap0Var.P(false);
                return;
            case 23:
                ((Runnable) this.f29402b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f29403c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ci.d6(15));
                return;
            case 27:
                Context context = (Context) this.f29402b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f29403c));
                context.startActivity(intent2);
                return;
            case 28:
                org.telegram.ui.hs hsVar = (org.telegram.ui.hs) this.f29402b;
                TLRPC.User user = (TLRPC.User) this.f29403c;
                hsVar.getClass();
                ArrayList<TLRPC.User> arrayList2 = new ArrayList<>();
                arrayList2.add(user);
                hsVar.getContactsController().deleteContact(arrayList2, true);
                if (user != null) {
                    user.contact = false;
                }
                hsVar.finishFragment();
                return;
            default:
                ContactsActivity.W((ContactsActivity) this.f29403c, (String) this.f29402b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        Location location;
        rl rlVar = (rl) this.f29402b;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f29403c;
        ImageView imageView = rlVar.f30202n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = rlVar.Q;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = rlVar.f30193d0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            rlVar.f30193d0 = animatorSet2;
            animatorSet2.setDuration(200L);
            rlVar.f30193d0.playTogether(ObjectAnimator.ofFloat(imageView2, property, rlVar.f30206q0 - AndroidUtilities.dp(10.0f)));
            rlVar.f30193d0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = rlVar.f30193d0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            rlVar.I = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            rlVar.f30193d0 = animatorSet4;
            animatorSet4.setDuration(200L);
            rlVar.f30193d0.playTogether(ObjectAnimator.ofFloat(imageView2, property, rlVar.f30206q0));
            rlVar.f30193d0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!rlVar.f30210s0) {
                int i10 = org.telegram.ui.ActionBar.k6.ui;
                org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i10));
                rlVar.f30210s0 = true;
            }
            IMapsProvider.IMap iMap = rlVar.F;
            if (iMap != null && (location = rlVar.f30205p0) != null) {
                location.setLatitude(iMap.getCameraPosition().target.latitude);
                rlVar.f30205p0.setLongitude(rlVar.F.getCameraPosition().target.longitude);
            }
            rlVar.M.L(rlVar.f30205p0);
        }
        return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f29403c;
        xv0 xv0Var = ((bu0) this.f29402b).d;
        xv0Var.f32711v1.finishFragment();
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
        if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            o2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
        }
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(xv0Var.f32686j1), user, null, Boolean.valueOf(z10));
        o2Var.getMessagesController().setSavedViewAs(false);
    }

    public p2(String str, int i10, Object obj) {
        this.f29401a = i10;
        this.f29403c = obj;
        this.f29402b = str;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f29403c;
        m61 G = ((j71) this.f29402b).Z2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        mm0 mm0Var = (mm0) this.f29402b;
        Canvas canvas = (Canvas) this.f29403c;
        Float f7 = (Float) obj;
        Float f10 = (Float) obj2;
        Float f11 = (Float) obj3;
        Float f12 = (Float) obj4;
        Float f13 = (Float) obj5;
        if (mm0Var.N2) {
            f7 = Float.valueOf(Math.max(f7.floatValue(), mm0Var.p1()));
        }
        if (mm0Var.O2) {
            f10 = Float.valueOf(Math.min(f10.floatValue(), mm0Var.o1()));
        }
        if (f10.floatValue() <= f7.floatValue()) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(mm0Var.getPaddingLeft() + mm0Var.G2.f32975c, f7.floatValue(), (mm0Var.getWidth() - mm0Var.G2.f32975c) - mm0Var.getPaddingRight(), f10.floatValue());
        mm0Var.I2.mo0run(canvas, rectF, f11, f12, f13);
    }

    @Override
    public void h() {
    }

    @Override
    public void o(float f7) {
    }

    @Override
    public void a0(View view, float f7, float f10) {
    }
}

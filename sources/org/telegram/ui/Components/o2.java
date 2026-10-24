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
public final class o2 implements org.telegram.ui.ActionBar.z1, b5, IMapsProvider.ITouchInterceptor, org.telegram.ui.Cells.r5, ImageReceiver.ImageReceiverDelegate, aj, org.telegram.ui.ActionBar.l1, bm0, Utilities.Callback5, MessagesStorage.BooleanCallback, am0, cm0 {
    public final int f29134a;
    public final Object f29135b;
    public final Object f29136c;

    public o2(int i10, Object obj, Object obj2) {
        this.f29134a = i10;
        this.f29135b = obj;
        this.f29136c = obj2;
    }

    @Override
    public void C(int i10, int i11, boolean z10) {
        MessageObject threadMessage;
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f29134a) {
            case 6:
                String str = (String) this.f29135b;
                ChatActivityEnterView chatActivityEnterView = ((mf) this.f29136c).f28590a;
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
                ve veVar = chatActivityEnterView.J0;
                chatActivityEnterView.S4 = 0L;
                veVar.setEffect(0L);
                return;
            case 7:
                ((lg) this.f29135b).o((t0.i) this.f29136c, z10, i10, i11);
                return;
            case 8:
            default:
                co coVar = (co) this.f29135b;
                View view = (View) this.f29136c;
                if (z10) {
                    coVar.V = i10;
                    coVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.r8) {
                        coVar.X((org.telegram.ui.Cells.r8) view, true);
                        return;
                    } else {
                        coVar.f25390r.m(coVar.I0);
                        return;
                    }
                }
                coVar.getClass();
                return;
            case 9:
                pl plVar = ((ml) this.f29135b).f28621b;
                plVar.f29610u0.b(((ol) this.f29136c).f29315c, plVar.f29611v0, z10, i10, 0L);
                plVar.f27704b.dismiss(true);
                return;
        }
    }

    @Override
    public boolean P0(View view) {
        return false;
    }

    @Override
    public void a() {
        ap apVar = (ap) this.f29135b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f29136c;
        if (apVar.f24768c != null) {
            apVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            apVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.s5 s5Var) {
        int i10;
        TLRPC.Chat chat;
        qm qmVar = (qm) this.f29135b;
        org.telegram.ui.Cells.s5 s5Var2 = (org.telegram.ui.Cells.s5) this.f29136c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = qmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f24266v0;
        ri riVar = chatAttachAlertPhotoLayout.f27704b;
        if (z10) {
            int i11 = riVar.T0;
            org.telegram.ui.ActionBar.o2 o2Var = riVar.f30146f0;
            if (i11 == 0 && !riVar.H) {
                int intValue = ((Integer) s5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = s5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.X(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f24225s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                        new vc(riVar.f30193u1, chatAttachAlertPhotoLayout.f27703a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", o2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && riVar.V1 >= 0 && hashMap.size() >= riVar.V1) {
                        if (riVar.W1 && (o2Var instanceof org.telegram.ui.sn) && (chat = ((org.telegram.ui.sn) o2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            d5.N(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f27703a).p();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f24226t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((o2Var instanceof org.telegram.ui.sn) && riVar.W1) {
                        s5Var.b(i10, z12, true);
                    } else {
                        s5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.Q(photoEntry, intValue);
                    qm qmVar2 = chatAttachAlertPhotoLayout.v;
                    if (qmVar == qmVar2) {
                        qm qmVar3 = chatAttachAlertPhotoLayout.G;
                        if (qmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (qmVar3.f29954f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        qmVar3.m(intValue);
                    } else {
                        qmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    riVar.d2(i12);
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
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.f29136c;
        l61 G = ((i71) this.f29135b).Z2.G(i10);
        if (G == null) {
            return;
        }
        callback5.mo0run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
    }

    @Override
    public boolean d(int i10, View view) {
        return yv.r((yv) this.f29135b, (Context) this.f29136c, view);
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        wm wmVar = (wm) this.f29135b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f29136c;
        wmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && wmVar.d.getBitmap() == null) {
            if (wmVar.d.getBitmap() != null && !wmVar.d.getBitmap().isRecycled()) {
                wmVar.d.getBitmap().recycle();
                wmVar.d.setImageBitmap((Bitmap) null);
            }
            wmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public void f(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f29135b;
        kn knVar = (kn) this.f29136c;
        if (!arrayList.isEmpty()) {
            callback.run(new sh.g((MessageObject) arrayList.get(0)));
        }
        knVar.dismiss(true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f29134a) {
            case 0:
                String str = (String) this.f29135b;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.f29136c;
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
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f29135b;
                int i11 = encryptedChat.ttl;
                int value = ((od0) this.f29136c).getValue();
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
                ((org.telegram.ui.fa) this.f29135b).run(((boolean[]) this.f29136c)[0]);
                return;
            case 3:
                Runnable runnable = (Runnable) this.f29136c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f29135b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 4:
                ((MessagesStorage.BooleanCallback) this.f29135b).run(((boolean[]) this.f29136c)[0]);
                return;
            case 5:
                org.telegram.ui.ks ksVar = (org.telegram.ui.ks) this.f29135b;
                boolean[] zArr = (boolean[]) this.f29136c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) ksVar.f39027b;
                ArrayList arrayList = (ArrayList) ksVar.f39028c;
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
                ((fu) this.f29135b).run(((ai.t) this.f29136c).getText().toString().trim());
                return;
            case 18:
                k40 k40Var = (k40) this.f29136c;
                HashtagSearchController.getInstance(k40Var.f27854a).removeHashtagFromHistory((String) this.f29135b);
                k40Var.f27857f.N(true);
                return;
            case 19:
                va0 va0Var = ((oa0) this.f29135b).f29192a;
                va0Var.getMessagesController().getStoriesController().s(va0Var.e, (ArrayList) this.f29136c);
                va0Var.V.M(false);
                return;
            case 21:
                zo0 zo0Var = (zo0) this.f29135b;
                zo0Var.getClass();
                c2Var.dismiss();
                zo0Var.J0.getDownloadController().deleteRecentFiles((ArrayList) this.f29136c);
                zo0Var.P(false);
                return;
            case 23:
                ((Runnable) this.f29135b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f29136c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new ci.d6(15));
                return;
            case 27:
                Context context = (Context) this.f29135b;
                Intent intent2 = new Intent(context, LaunchActivity.class);
                intent2.setAction("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile((File) this.f29136c));
                context.startActivity(intent2);
                return;
            case 28:
                org.telegram.ui.hs hsVar = (org.telegram.ui.hs) this.f29135b;
                TLRPC.User user = (TLRPC.User) this.f29136c;
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
                ContactsActivity.W((ContactsActivity) this.f29136c, (String) this.f29135b);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        Location location;
        pl plVar = (pl) this.f29135b;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.f29136c;
        ImageView imageView = plVar.f29600n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = plVar.Q;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = plVar.f29591d0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            plVar.f29591d0 = animatorSet2;
            animatorSet2.setDuration(200L);
            plVar.f29591d0.playTogether(ObjectAnimator.ofFloat(imageView2, property, plVar.f29603p0 - AndroidUtilities.dp(10.0f)));
            plVar.f29591d0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = plVar.f29591d0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            plVar.I = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            plVar.f29591d0 = animatorSet4;
            animatorSet4.setDuration(200L);
            plVar.f29591d0.playTogether(ObjectAnimator.ofFloat(imageView2, property, plVar.f29603p0));
            plVar.f29591d0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!plVar.f29606r0) {
                int i10 = org.telegram.ui.ActionBar.k6.ui;
                org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i10));
                plVar.f29606r0 = true;
            }
            IMapsProvider.IMap iMap = plVar.F;
            if (iMap != null && (location = plVar.f29602o0) != null) {
                location.setLatitude(iMap.getCameraPosition().target.latitude);
                plVar.f29602o0.setLongitude(plVar.F.getCameraPosition().target.longitude);
            }
            plVar.M.L(plVar.f29602o0);
        }
        return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
    }

    @Override
    public void run(boolean z10) {
        TLRPC.User user = (TLRPC.User) this.f29136c;
        wv0 wv0Var = ((au0) this.f29135b).d;
        wv0Var.f32410v1.finishFragment();
        org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
        if (o2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            o2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var, NotificationCenter.closeChats);
        }
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        o2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(wv0Var.f32385j1), user, null, Boolean.valueOf(z10));
        o2Var.getMessagesController().setSavedViewAs(false);
    }

    public o2(String str, int i10, Object obj) {
        this.f29134a = i10;
        this.f29136c = obj;
        this.f29135b = str;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f29136c;
        l61 G = ((i71) this.f29135b).Z2.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        lm0 lm0Var = (lm0) this.f29135b;
        Canvas canvas = (Canvas) this.f29136c;
        Float f7 = (Float) obj;
        Float f10 = (Float) obj2;
        Float f11 = (Float) obj3;
        Float f12 = (Float) obj4;
        Float f13 = (Float) obj5;
        if (lm0Var.N2) {
            f7 = Float.valueOf(Math.max(f7.floatValue(), lm0Var.p1()));
        }
        if (lm0Var.O2) {
            f10 = Float.valueOf(Math.min(f10.floatValue(), lm0Var.o1()));
        }
        if (f10.floatValue() <= f7.floatValue()) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(lm0Var.getPaddingLeft() + lm0Var.G2.f32636c, f7.floatValue(), (lm0Var.getWidth() - lm0Var.G2.f32636c) - lm0Var.getPaddingRight(), f10.floatValue());
        lm0Var.I2.mo0run(canvas, rectF, f11, f12, f13);
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

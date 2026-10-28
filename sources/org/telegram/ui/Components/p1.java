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
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
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
public final class p1 implements org.telegram.ui.ActionBar.b2, e5, IMapsProvider.ITouchInterceptor, org.telegram.ui.Cells.w5, ImageReceiver.ImageReceiverDelegate, cj, org.telegram.ui.ActionBar.n1, cm0, Utilities.Callback5, MessagesStorage.BooleanCallback, bm0, dm0 {
    public final int f31424a;
    public final Object f31425b;
    public final Object f31426c;

    public p1(int i10, Object obj, Object obj2) {
        this.f31424a = i10;
        this.f31425b = obj;
        this.f31426c = obj2;
    }

    @Override
    public void G(int i10, int i11, boolean z10) {
        SendMessageChatArguments sendMessageChatArguments;
        switch (this.f31424a) {
            case 9:
                ChatActivityEnterView chatActivityEnterView = ((of) this.f31425b).f31281a;
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of((String) this.f31426c, chatActivityEnterView.Q2, chatActivityEnterView.T2, ChatActivityEnterView.i(chatActivityEnterView), null, false, null, null, null, z10, i10, i11, null, false);
                org.telegram.ui.wn wnVar = chatActivityEnterView.P2;
                if (wnVar != null) {
                    sendMessageChatArguments = wnVar.O8();
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
            case 10:
                ((ng) this.f31425b).o((t0.i) this.f31426c, z10, i10, i11);
                return;
            case 11:
            default:
                go goVar = (go) this.f31425b;
                View view = (View) this.f31426c;
                if (z10) {
                    goVar.V = i10;
                    goVar.U = 0;
                    if (view instanceof org.telegram.ui.Cells.v8) {
                        goVar.X((org.telegram.ui.Cells.v8) view, true);
                        return;
                    } else {
                        goVar.f28694r.m(goVar.I0);
                        return;
                    }
                }
                goVar.getClass();
                return;
            case 12:
                sl slVar = ((pl) this.f31425b).f31637b;
                slVar.f32636u0.d(((rl) this.f31426c).f32273c, slVar.f32637v0, z10, i10, 0L);
                slVar.f30254b.dismiss(true);
                return;
        }
    }

    @Override
    public void a() {
        fp fpVar = (fp) this.f31425b;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f31426c;
        if (fpVar.f28236c != null) {
            fpVar.h = actionBarPopupWindow$ActionBarPopupWindowLayout.getVisibleHeight() - actionBarPopupWindow$ActionBarPopupWindowLayout.getMeasuredHeight();
            fpVar.a();
        }
    }

    @Override
    public void b(org.telegram.ui.Cells.x5 x5Var) {
        int i10;
        TLRPC.Chat chat;
        tm tmVar = (tm) this.f31425b;
        org.telegram.ui.Cells.x5 x5Var2 = (org.telegram.ui.Cells.x5) this.f31426c;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tmVar.v;
        boolean z10 = chatAttachAlertPhotoLayout.f26060v0;
        ti tiVar = chatAttachAlertPhotoLayout.f30254b;
        if (z10) {
            int i11 = tiVar.T0;
            org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
            if (i11 == 0 && !tiVar.H) {
                int intValue = ((Integer) x5Var.getTag()).intValue();
                MediaController.PhotoEntry photoEntry = x5Var.getPhotoEntry();
                if (!chatAttachAlertPhotoLayout.Y(photoEntry)) {
                    HashMap hashMap = ChatAttachAlertPhotoLayout.f26019s1;
                    boolean z11 = true;
                    if (hashMap.size() + 1 > ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                        new wc(tiVar.f33037u1, chatAttachAlertPhotoLayout.f30253a).t(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BusinessRepliesToastLimit", r2Var.getMessagesController().config.quickReplyMessagesLimit.get(), new Object[0])), null).j();
                        return;
                    }
                    boolean containsKey = hashMap.containsKey(Integer.valueOf(photoEntry.imageId));
                    boolean z12 = !containsKey;
                    int i12 = 2;
                    if (!containsKey && tiVar.V1 >= 0 && hashMap.size() >= tiVar.V1) {
                        if (tiVar.W1 && (r2Var instanceof org.telegram.ui.wn) && (chat = ((org.telegram.ui.wn) r2Var).e) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled && chatAttachAlertPhotoLayout.L != 2) {
                            g5.N(chatAttachAlertPhotoLayout.getContext(), LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null, null, chatAttachAlertPhotoLayout.f30253a).p();
                            if (chatAttachAlertPhotoLayout.L == 1) {
                                chatAttachAlertPhotoLayout.L = 2;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!containsKey) {
                        i10 = ChatAttachAlertPhotoLayout.f26020t1.size();
                    } else {
                        i10 = -1;
                    }
                    if ((r2Var instanceof org.telegram.ui.wn) && tiVar.W1) {
                        x5Var.b(i10, z12, true);
                    } else {
                        x5Var.b(-1, z12, true);
                    }
                    chatAttachAlertPhotoLayout.R(photoEntry, intValue);
                    tm tmVar2 = chatAttachAlertPhotoLayout.v;
                    if (tmVar == tmVar2) {
                        tm tmVar3 = chatAttachAlertPhotoLayout.G;
                        if (tmVar3.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                            intValue++;
                        }
                        if (tmVar3.f33106f && intValue >= chatAttachAlertPhotoLayout.M0) {
                            intValue++;
                        }
                        tmVar3.m(intValue);
                    } else {
                        tmVar2.m(intValue);
                    }
                    if (!containsKey) {
                        i12 = 1;
                    }
                    tiVar.d2(i12);
                    x5Var2.setHasSpoiler(photoEntry.hasSpoiler);
                    x5Var2.setHighQuality(photoEntry.isHighQuality());
                    long j10 = photoEntry.starsAmount;
                    if (hashMap.size() <= 1) {
                        z11 = false;
                    }
                    x5Var2.f(j10, z11);
                }
            }
        }
    }

    @Override
    public boolean c(int i10, View view) {
        return aw.q((aw) this.f31425b, (Context) this.f31426c, view);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        zm zmVar = (zm) this.f31425b;
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.f31426c;
        zmVar.getClass();
        if (z10 && !z11 && photoEntry != null && photoEntry.hasSpoiler && zmVar.d.getBitmap() == null) {
            if (zmVar.d.getBitmap() != null && !zmVar.d.getBitmap().isRecycled()) {
                zmVar.d.getBitmap().recycle();
                zmVar.d.setImageBitmap((Bitmap) null);
            }
            zmVar.d.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
        }
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override
    public void e(float f7, float f10, int i10, View view) {
        Utilities.Callback5 callback5 = (Utilities.Callback5) this.f31426c;
        u61 G = ((s71) this.f31425b).f32504g3.G(i10);
        if (G == null) {
            return;
        }
        callback5.mo5run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        boolean matches;
        switch (this.f31424a) {
            case 0:
                e2Var.dismiss();
                ((li.s2) this.f31425b).run(((EditText) this.f31426c).getText().toString());
                return;
            case 1:
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.f31426c;
                int i12 = ((int[]) this.f31425b)[0];
                if (i12 == 0) {
                    i11 = 900;
                } else if (i12 == 1) {
                    i11 = 3600;
                } else if (i12 == 2) {
                    i11 = 28800;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                intCallback.run(i11);
                return;
            case 2:
                h4 h4Var = (h4) this.f31425b;
                Utilities.Callback callback = (Utilities.Callback) this.f31426c;
                String trim = h4Var.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    matches = false;
                } else {
                    matches = g5.f28387a.matcher(trim.trim()).matches();
                }
                if (!matches) {
                    AndroidUtilities.shakeView(h4Var);
                    return;
                }
                callback.run(trim);
                e2Var.dismiss();
                return;
            case 3:
                String str = (String) this.f31425b;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.f31426c;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", ContactsController.getInstance(r2Var.getCurrentAccount()).getInviteText(1));
                    r2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 4:
                TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.f31425b;
                int i13 = encryptedChat.ttl;
                int value = ((nd0) this.f31426c).getValue();
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
                if (i13 != encryptedChat.ttl) {
                    SecretChatHelper.getInstance(UserConfig.selectedAccount).sendTTLMessage(encryptedChat, null);
                    MessagesStorage.getInstance(UserConfig.selectedAccount).updateEncryptedChatTTL(encryptedChat);
                    return;
                }
                return;
            case 5:
                ((ag.k0) this.f31425b).run(((boolean[]) this.f31426c)[0]);
                return;
            case 6:
                Runnable runnable = (Runnable) this.f31426c;
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                edit.remove("color_" + ((String) this.f31425b));
                edit.commit();
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ((MessagesStorage.BooleanCallback) this.f31425b).run(((boolean[]) this.f31426c)[0]);
                return;
            case 8:
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f31425b;
                boolean[] zArr = (boolean[]) this.f31426c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) k1Var.f33990c;
                ArrayList arrayList = (ArrayList) k1Var.f33989b;
                eyVar.getClass();
                int size = arrayList.size();
                for (int i14 = 0; i14 < size; i14++) {
                    Long l4 = (Long) arrayList.get(i14);
                    long longValue = l4.longValue();
                    if (z10) {
                        eyVar.getMessagesController().reportSpam(longValue, eyVar.getMessagesController().getUser(l4), null, null, false);
                    }
                    if (z11) {
                        eyVar.getMessagesController().deleteDialog(longValue, 0, true);
                    }
                    eyVar.getMessagesController().blockPeer(longValue);
                }
                eyVar.j4(false);
                return;
            case 19:
                ((iu) this.f31425b).run(((bi.t) this.f31426c).getText().toString().trim());
                return;
            case 22:
                o40 o40Var = (o40) this.f31425b;
                HashtagSearchController.getInstance(o40Var.f31154a).removeHashtagFromHistory((String) this.f31426c);
                o40Var.f31157f.O(true);
                return;
            case 24:
                fp0 fp0Var = (fp0) this.f31425b;
                fp0Var.getClass();
                e2Var.dismiss();
                fp0Var.L0.getDownloadController().deleteRecentFiles((ArrayList) this.f31426c);
                fp0Var.R(false);
                return;
            case 26:
                ((Runnable) this.f31425b).run();
                TLRPC.TL_stickers_deleteStickerSet tL_stickers_deleteStickerSet = new TLRPC.TL_stickers_deleteStickerSet();
                tL_stickers_deleteStickerSet.stickerset = MediaDataController.getInputStickerSet((TLRPC.StickerSet) this.f31426c);
                ConnectionsManager.getInstance(UserConfig.selectedAccount).sendRequest(tL_stickers_deleteStickerSet, new di.d6(15));
                return;
            default:
                qf.d.o((Context) this.f31425b, Uri.parse((String) this.f31426c), true, false);
                return;
        }
    }

    @Override
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        Utilities.Callback callback = (Utilities.Callback) this.f31425b;
        nn nnVar = (nn) this.f31426c;
        if (!arrayList.isEmpty()) {
            callback.run(new th.g((MessageObject) arrayList.get(0)));
        }
        nnVar.dismiss(true);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        Location location;
        sl slVar = (sl) this.f31425b;
        org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.f31426c;
        ImageView imageView = slVar.f32626n;
        Property property = View.TRANSLATION_Y;
        ImageView imageView2 = slVar.Q;
        if (motionEvent.getAction() == 0) {
            AnimatorSet animatorSet = slVar.f32617d0;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            slVar.f32617d0 = animatorSet2;
            animatorSet2.setDuration(200L);
            slVar.f32617d0.playTogether(ObjectAnimator.ofFloat(imageView2, property, slVar.f32629p0 - AndroidUtilities.dp(10.0f)));
            slVar.f32617d0.start();
        } else if (motionEvent.getAction() == 1) {
            AnimatorSet animatorSet3 = slVar.f32617d0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
            slVar.I = 0.0f;
            AnimatorSet animatorSet4 = new AnimatorSet();
            slVar.f32617d0 = animatorSet4;
            animatorSet4.setDuration(200L);
            slVar.f32617d0.playTogether(ObjectAnimator.ofFloat(imageView2, property, slVar.f32629p0));
            slVar.f32617d0.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!slVar.f32632r0) {
                int i10 = org.telegram.ui.ActionBar.y6.f23686ui;
                org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
                imageView.setTag(Integer.valueOf(i10));
                slVar.f32632r0 = true;
            }
            IMapsProvider.IMap iMap = slVar.F;
            if (iMap != null && (location = slVar.f32628o0) != null) {
                location.setLatitude(iMap.getCameraPosition().target.latitude);
                slVar.f32628o0.setLongitude(slVar.F.getCameraPosition().target.longitude);
            }
            slVar.M.L(slVar.f32628o0);
        }
        return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        nm0 nm0Var = (nm0) this.f31425b;
        Canvas canvas = (Canvas) this.f31426c;
        Float f7 = (Float) obj;
        Float f10 = (Float) obj2;
        Float f11 = (Float) obj3;
        Float f12 = (Float) obj4;
        Float f13 = (Float) obj5;
        if (nm0Var.Q2) {
            f7 = Float.valueOf(Math.max(f7.floatValue(), nm0Var.q1()));
        }
        if (nm0Var.R2) {
            f10 = Float.valueOf(Math.min(f10.floatValue(), nm0Var.p1()));
        }
        if (f10.floatValue() <= f7.floatValue()) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(nm0Var.getPaddingLeft() + nm0Var.G2.f35109c, f7.floatValue(), (nm0Var.getWidth() - nm0Var.G2.f35109c) - nm0Var.getPaddingRight(), f10.floatValue());
        f11.getClass();
        f12.getClass();
        f13.getClass();
        nm0Var.J2.mo5run(canvas, rectF, f11, f12, f13);
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        Utilities.Callback5Return callback5Return = (Utilities.Callback5Return) this.f31426c;
        u61 G = ((s71) this.f31425b).f32504g3.G(i10);
        if (G == null) {
            return false;
        }
        return ((Boolean) callback5Return.run(G, view, Integer.valueOf(i10), Float.valueOf(f7), Float.valueOf(f10))).booleanValue();
    }

    @Override
    public void run(boolean z10) {
        bw0 bw0Var = (bw0) this.f31425b;
        TLRPC.User user = (TLRPC.User) this.f31426c;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
        r2Var.finishFragment();
        if (r2Var instanceof NotificationCenter.NotificationCenterDelegate) {
            r2Var.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) r2Var, NotificationCenter.closeChats);
        }
        r2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        r2Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(bw0Var.l1), user, null, Boolean.valueOf(z10));
        r2Var.getMessagesController().setSavedViewAs(false);
    }

    @Override
    public void g() {
    }

    @Override
    public void o(float f7) {
    }

    @Override
    public void l0(View view, float f7, float f10) {
    }
}

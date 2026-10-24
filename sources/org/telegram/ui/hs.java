package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.RadialProgressView;
public final class hs extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.b50 {
    public fs E;
    public org.telegram.ui.Cells.r8 F;
    public MessagesController.DialogPhotos G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public gs O;
    public final org.telegram.ui.Components.c50 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.u9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.i71 W;
    public boolean X;
    public boolean Y;
    public MessageObject Z;
    public org.telegram.ui.ActionBar.u0 f37971a;
    public org.telegram.ui.Cells.h3 f37972b;
    public org.telegram.ui.Cells.h3 f37973c;
    public org.telegram.ui.Cells.h3 d;
    public org.telegram.ui.Components.u9 e;
    public TextView f37974f;
    public TextView h;
    public org.telegram.ui.Components.f9 f37975n;
    public final org.telegram.ui.ActionBar.g6 f37976r;
    public RadialProgressView f37977s;
    public ei.g6 v;
    public AnimatorSet f37978w;
    public org.telegram.ui.Cells.r8 f37979x;
    public org.telegram.ui.Cells.r8 f37980y;

    public hs(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.c50(0, true, true);
    }

    public static void U(hs hsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f20486id = hsVar.getMessagesController().getInputUser(hsVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(hsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(hsVar, 5));
    }

    public static void V(hs hsVar, TLRPC.User user) {
        hsVar.Q = null;
        hsVar.c0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(hsVar.currentAccount).getUserFull(hsVar.H);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            hsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = hsVar.T;
        if (photo != null) {
            user2.photo.photo_id = photo.f20368id;
            ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
            if (closestPhotoSizeWithSize != null) {
                user2.photo.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                user2.photo.photo_big = closestPhotoSizeWithSize2.location;
            }
        } else {
            user2.photo = null;
            user2.flags &= -33;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(user);
        hsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        hsVar.f0();
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void W(hs hsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.c50 c50Var = hsVar.P;
        if (c50Var.T) {
            return;
        }
        int i10 = hsVar.S;
        if (i10 == 2) {
            hsVar.Q = photoSize.location;
        } else if (i10 == 1 && hsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.h5 parentLayout = hsVar.getParentLayout();
            org.telegram.ui.ActionBar.o2 lastFragment = hsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                if (o2Var instanceof sn) {
                    sn snVar = (sn) o2Var;
                    org.telegram.ui.ActionBar.o2 o2Var2 = lastFragment;
                    if (snVar.a() == hsVar.H && snVar.f41489d4 == 0) {
                        snVar.ab(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var2;
                            if (arrayList.get(size2) != o2Var3) {
                                ((org.telegram.ui.ActionBar.o2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            o2Var2 = o2Var3;
                        }
                        o2Var2.finishFragment();
                    } else {
                        lastFragment = o2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.o2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            hsVar.e.h(ImageLocation.getForLocal(hsVar.Q), "50_50", hsVar.f37975n, hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H)));
            if (hsVar.S == 2) {
                hsVar.d0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(hsVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = hsVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = hsVar.getUserConfig().getNewMessageId();
                tL_messageService.f20365id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = hsVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = hsVar.H;
                tL_messageService.date = hsVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(hsVar.currentAccount, tL_messageService, false, false);
                hsVar.Z = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(hsVar.currentAccount).updateInterfaceWithMessages(hsVar.H, arrayList2, 0);
                hsVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, c50Var);
            }
        } else {
            TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
            if (hsVar.Z == null && user != null) {
                if (inputFile2 != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                user.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z11;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(user);
                hsVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            hsVar.c0(hsVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, hsVar.S);
            hsVar.d0(false, true);
        }
        hsVar.f0();
    }

    public static void X(hs hsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (hsVar.Z == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.H));
                TLRPC.UserFull userFull = MessagesController.getInstance(hsVar.currentAccount).getUserFull(hsVar.H);
                if (userFull != null) {
                    userFull.personal_photo = tL_photos_photo.photo;
                    userFull.flags |= 2097152;
                    hsVar.getMessagesStorage().updateUserInfo(userFull, true);
                }
                if (user != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
                    if (closestPhotoSizeWithSize != null && fileLocation != null) {
                        FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocation.volume_id);
                        sb2.append("_");
                        String n10 = a1.g.n(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(hsVar.currentAccount, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                        FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    zf.d0.a(tL_photos_photo.photo, user, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    hsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    hsVar.getMessagesController().getDialogPhotos(hsVar.H).addPhotoAtStart(tL_photos_photo.photo);
                    hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                    if (hsVar.getParentActivity() != null) {
                        if (i10 == 2) {
                            org.telegram.ui.Components.vc.a0(hsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.vc.a0(hsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        }
                    }
                }
                hsVar.Q = null;
                hsVar.f0();
            }
        }
    }

    public static void Y(hs hsVar) {
        if (hsVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(hsVar.Z.getId()));
            NotificationCenter.getInstance(hsVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void E(float f7) {
        RadialProgressView radialProgressView = this.f37977s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f37977s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void P() {
        AndroidUtilities.runOnUIThread(new xr(this, 0));
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                hs.W(hs.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21328l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21311k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
    }

    public final String b0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        if (user != null && !TextUtils.isEmpty(user.phone)) {
            return user.phone;
        }
        return this.L;
    }

    public final void c0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.H);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i11 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i11 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i10 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new ai.tb(this, fileLocation, inputFile2, fileLocation2, i10, 9));
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f7;
        float f10;
        int i15;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i16 = org.telegram.ui.ActionBar.k6.f21221f8;
        int i17 = 3;
        org.telegram.ui.ActionBar.g6 g6Var = this.f37976r;
        org.telegram.ui.ActionBar.r6.m(kVar, 3, i16, g6Var);
        org.telegram.ui.ActionBar.r6.m(this.actionBar, 1, org.telegram.ui.ActionBar.k6.f21519v8, g6Var);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.I) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ds(this));
        this.f37971a = this.actionBar.m().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i18 = org.telegram.ui.ActionBar.k6.f21126a7;
        org.telegram.ui.ActionBar.r6.i(i18, frameLayout, g6Var);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i19 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.r6.i(i19, frameLayout2, g6Var);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        this.e = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        FrameLayout frameLayout3 = this.V;
        org.telegram.ui.Components.u9 u9Var2 = this.e;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(u9Var2, w7.z5.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ei.g6 g6Var2 = new ei.g6(this, context, paint, 8);
        this.v = g6Var2;
        FrameLayout frameLayout4 = this.V;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(g6Var2, w7.z5.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f37977s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f37977s.setProgressColor(-1);
        this.f37977s.setNoProgress(false);
        FrameLayout frameLayout5 = this.V;
        RadialProgressView radialProgressView2 = this.f37977s;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, w7.z5.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        d0(false, false);
        TextView textView = new TextView(context);
        this.f37974f = textView;
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.G6, g6Var);
        this.f37974f.setTextSize(1, 18.0f);
        this.f37974f.setLines(1);
        this.f37974f.setMaxLines(1);
        this.f37974f.setSingleLine(true);
        TextView textView2 = this.f37974f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f37974f;
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f37974f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout6 = this.V;
        TextView textView4 = this.f37974f;
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 94.0f;
        }
        if (z10) {
            f10 = 94.0f;
        } else {
            f10 = 0.0f;
        }
        TextView j10 = org.telegram.ui.Cells.b1.j(frameLayout6, textView4, w7.z5.d(-2, -2.0f, i20, f7, 25.66f, f10, 0.0f), context);
        this.h = j10;
        org.telegram.ui.ActionBar.r6.W(j10, org.telegram.ui.ActionBar.k6.A6, g6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (LocaleController.isRTL) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView5.setGravity(i15);
        FrameLayout frameLayout7 = this.V;
        TextView textView6 = this.h;
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i17 = 5;
        }
        int i21 = i17 | 48;
        if (z11) {
            f11 = 0.0f;
        } else {
            f11 = 94.0f;
        }
        if (z11) {
            f12 = 94.0f;
        } else {
            f12 = 0.0f;
        }
        frameLayout7.addView(textView6, w7.z5.d(-2, -2.0f, i21, f11, 49.66f, f12, 0.0f));
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.f37976r);
        this.f37972b = h3Var;
        h3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i19, this.f37972b, g6Var);
        this.f37972b.setDivider(true);
        this.f37972b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hs f36133b;

            {
                this.f36133b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            hs hsVar = this.f36133b;
                            hsVar.f37973c.d.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = hsVar.f37973c.d;
                            f3Var.setSelection(f3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        hs hsVar2 = this.f36133b;
                        if (i22 == 6) {
                            hsVar2.f37971a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            hsVar2.d.d.requestFocus();
                            hsVar2.d.d.setSelection(hsVar2.f37973c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f36133b.f37971a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f37972b.d.setOnFocusChangeListener(new Object());
        this.f37972b.setText(this.M);
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.f37976r);
        this.f37973c = h3Var2;
        h3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.r6.i(i19, this.f37973c, g6Var);
        this.f37973c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hs f36133b;

            {
                this.f36133b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            hs hsVar = this.f36133b;
                            hsVar.f37973c.d.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = hsVar.f37973c.d;
                            f3Var.setSelection(f3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        hs hsVar2 = this.f36133b;
                        if (i22 == 6) {
                            hsVar2.f37971a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            hsVar2.d.d.requestFocus();
                            hsVar2.d.d.setSelection(hsVar2.f37973c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f36133b.f37971a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f37973c.setText(this.N);
        org.telegram.ui.Cells.h3 h3Var3 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.f37976r);
        this.d = h3Var3;
        org.telegram.ui.ActionBar.r6.I(h3Var3.d, org.telegram.ui.ActionBar.k6.f21243gc, g6Var);
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.r6.i(i19, this.d, g6Var);
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hs f36133b;

            {
                this.f36133b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            hs hsVar = this.f36133b;
                            hsVar.f37973c.d.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = hsVar.f37973c.d;
                            f3Var.setSelection(f3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        hs hsVar2 = this.f36133b;
                        if (i22 == 6) {
                            hsVar2.f37971a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            hsVar2.d.d.requestFocus();
                            hsVar2.d.d.setSelection(hsVar2.f37973c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f36133b.f37971a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (!this.I) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, g6Var);
            this.f37979x = r8Var;
            r8Var.o(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.f37979x.setBackground(org.telegram.ui.ActionBar.k6.L0(g6Var, true));
            org.telegram.ui.Cells.r8 r8Var2 = this.f37979x;
            int i22 = org.telegram.ui.ActionBar.k6.f21517v6;
            int i23 = org.telegram.ui.ActionBar.k6.f21500u6;
            r8Var2.g(i22, i23);
            final org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f37979x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f37979x.e.setAnimation(xj0Var);
            this.f37979x.setOnClickListener(new View.OnClickListener(this) {
                public final hs f36393b;

                {
                    this.f36393b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final hs hsVar = this.f36393b;
                            boolean z13 = true;
                            hsVar.R = 1;
                            org.telegram.ui.Components.c50 c50Var = hsVar.P;
                            TLRPC.User user2 = user;
                            c50Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ah.j jVar = new ah.j(23);
                            final org.telegram.ui.Components.xj0 xj0Var2 = xj0Var;
                            c50Var.n(z13, jVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            hs hsVar2 = hsVar;
                                            boolean g10 = hsVar2.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var3 = xj0Var2;
                                            if (!g10) {
                                                xj0Var3.P(86);
                                                hsVar2.f37980y.e.d();
                                                return;
                                            }
                                            xj0Var3.N(0, false, false);
                                            return;
                                        default:
                                            hs hsVar3 = hsVar;
                                            boolean g11 = hsVar3.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var4 = xj0Var2;
                                            if (!g11) {
                                                xj0Var4.P(85);
                                                hsVar3.f37979x.e.d();
                                                return;
                                            }
                                            xj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            xj0Var2.M(0);
                            xj0Var2.P(43);
                            hsVar.f37979x.e.d();
                            return;
                        default:
                            final hs hsVar2 = this.f36393b;
                            hsVar2.R = 2;
                            org.telegram.ui.Components.c50 c50Var2 = hsVar2.P;
                            TLRPC.User user3 = user;
                            c50Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ah.j jVar2 = new ah.j(23);
                            final org.telegram.ui.Components.xj0 xj0Var3 = xj0Var;
                            c50Var2.n(z12, jVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            hs hsVar22 = hsVar2;
                                            boolean g10 = hsVar22.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var32 = xj0Var3;
                                            if (!g10) {
                                                xj0Var32.P(86);
                                                hsVar22.f37980y.e.d();
                                                return;
                                            }
                                            xj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            hs hsVar3 = hsVar2;
                                            boolean g11 = hsVar3.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var4 = xj0Var3;
                                            if (!g11) {
                                                xj0Var4.P(85);
                                                hsVar3.f37979x.e.d();
                                                return;
                                            }
                                            xj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            xj0Var3.M(0);
                            xj0Var3.P(43);
                            hsVar2.f37980y.e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(context, g6Var);
            this.f37980y = r8Var3;
            r8Var3.o(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.f37980y.setBackground(org.telegram.ui.ActionBar.k6.L0(g6Var, true));
            this.f37980y.g(i22, i23);
            final org.telegram.ui.Components.xj0 xj0Var2 = new org.telegram.ui.Components.xj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f37980y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f37980y.e.setAnimation(xj0Var2);
            this.f37980y.setOnClickListener(new View.OnClickListener(this) {
                public final hs f36393b;

                {
                    this.f36393b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final hs hsVar = this.f36393b;
                            boolean z13 = true;
                            hsVar.R = 1;
                            org.telegram.ui.Components.c50 c50Var = hsVar.P;
                            TLRPC.User user2 = user;
                            c50Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ah.j jVar = new ah.j(23);
                            final org.telegram.ui.Components.xj0 xj0Var22 = xj0Var2;
                            c50Var.n(z13, jVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            hs hsVar22 = hsVar;
                                            boolean g10 = hsVar22.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var32 = xj0Var22;
                                            if (!g10) {
                                                xj0Var32.P(86);
                                                hsVar22.f37980y.e.d();
                                                return;
                                            }
                                            xj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            hs hsVar3 = hsVar;
                                            boolean g11 = hsVar3.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var4 = xj0Var22;
                                            if (!g11) {
                                                xj0Var4.P(85);
                                                hsVar3.f37979x.e.d();
                                                return;
                                            }
                                            xj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            xj0Var22.M(0);
                            xj0Var22.P(43);
                            hsVar.f37979x.e.d();
                            return;
                        default:
                            final hs hsVar2 = this.f36393b;
                            hsVar2.R = 2;
                            org.telegram.ui.Components.c50 c50Var2 = hsVar2.P;
                            TLRPC.User user3 = user;
                            c50Var2.L = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            ah.j jVar2 = new ah.j(23);
                            final org.telegram.ui.Components.xj0 xj0Var3 = xj0Var2;
                            c50Var2.n(z12, jVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            hs hsVar22 = hsVar2;
                                            boolean g10 = hsVar22.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var32 = xj0Var3;
                                            if (!g10) {
                                                xj0Var32.P(86);
                                                hsVar22.f37980y.e.d();
                                                return;
                                            }
                                            xj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            hs hsVar3 = hsVar2;
                                            boolean g11 = hsVar3.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var4 = xj0Var3;
                                            if (!g11) {
                                                xj0Var4.P(85);
                                                hsVar3.f37979x.e.d();
                                                return;
                                            }
                                            xj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            xj0Var3.M(0);
                            xj0Var3.P(43);
                            hsVar2.f37980y.e.d();
                            return;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.u9(context);
            this.E = new fs(this, context, g6Var);
            if (this.f37975n == null) {
                this.f37975n = new org.telegram.ui.Components.f9(0, user);
            }
            this.U.e(user.photo, this.f37975n);
            this.E.addView(this.U, w7.z5.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.k(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.k6.L0(g6Var, true));
            this.E.g(i22, i23);
            this.E.setOnClickListener(new z(this, context, user, 10));
            org.telegram.ui.Cells.r8 r8Var4 = new org.telegram.ui.Cells.r8(context, g6Var);
            this.F = r8Var4;
            r8Var4.o(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.k6.L0(g6Var, true));
            this.F.g(i22, i23);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.c51(8, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.H);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.T = photo;
                if (photo == null) {
                    this.T = userFull.fallback_photo;
                }
            }
            f0();
        }
        org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(this, new f5(this, 7), new a1(this, 26), null);
        this.W = i71Var;
        i71Var.t1();
        this.W.setOnScrollListener(new ki.m3(4, this, frameLayout));
        org.telegram.ui.ActionBar.r6.i(i18, this.W, g6Var);
        frameLayout.addView(this.W, w7.z5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.W);
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.Z2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10, boolean z11) {
        if (this.f37977s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f37978w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f37978w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f37978w = animatorSet2;
            if (z10) {
                this.f37977s.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f37978w;
                RadialProgressView radialProgressView = this.f37977s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f37977s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f37978w.setDuration(180L);
            this.f37978w.addListener(new ho(27, this, z10));
            this.f37978w.start();
        } else if (z10) {
            this.f37977s.setAlpha(1.0f);
            this.f37977s.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f37977s.setAlpha(0.0f);
            this.f37977s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_STATUS) != 0) {
                e0();
            }
        } else if (i10 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.G) {
            ArrayList arrayList = new ArrayList(dialogPhotos.photos);
            int i12 = 0;
            while (i12 < arrayList.size()) {
                if (arrayList.get(i12) == null) {
                    arrayList.remove(i12);
                    i12--;
                }
                i12++;
            }
            if (arrayList.size() > 0) {
                this.T = (TLRPC.Photo) arrayList.get(0);
                f0();
            }
        }
    }

    @Override
    public final boolean e() {
        if (this.S != 1) {
            return true;
        }
        return false;
    }

    public final void e0() {
        TLRPC.User user;
        if (this.f37974f != null && (user = getMessagesController().getUser(Long.valueOf(this.H))) != null) {
            if (TextUtils.isEmpty(b0())) {
                this.f37974f.setText(LocaleController.getString(R.string.MobileHidden));
            } else {
                TextView textView = this.f37974f;
                jf.b c10 = jf.b.c();
                textView.setText(c10.b("+" + b0()));
            }
            this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
            if (this.Q == null) {
                org.telegram.ui.Components.u9 u9Var = this.e;
                org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9(0, user);
                this.f37975n = f9Var;
                u9Var.e(user, f9Var);
            }
        }
    }

    public final void f0() {
        TLRPC.Photo photo;
        if (this.I) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.T) != null) {
            this.U.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.T), "50_50", this.f37975n, null);
        }
        if (this.f37975n == null) {
            this.f37975n = new org.telegram.ui.Components.f9(0, user);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.e(user, this.f37975n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.f37975n, getMessagesController().getUser(Long.valueOf(this.H)));
        }
    }

    @Override
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f37976r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.H = getArguments().getLong("user_id", 0L);
        this.L = getArguments().getString("phone");
        this.M = getArguments().getString("first_name_card");
        this.N = getArguments().getString("last_name_card");
        this.I = getArguments().getBoolean("addContact", false);
        this.J = getArguments().getBoolean("focus_notes", false);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        this.K = notificationsSettings.getBoolean("dialog_bar_exception" + this.H, false);
        if (this.H != 0) {
            user = getMessagesController().getUser(Long.valueOf(this.H));
        } else {
            user = null;
        }
        org.telegram.ui.Components.c50 c50Var = this.P;
        if (c50Var != null) {
            c50Var.f25185a = this;
            c50Var.f25186b = this;
        }
        this.G = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.H);
        if (user == null || !super.onFragmentCreate()) {
            return false;
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        org.telegram.ui.Components.c50 c50Var = this.P;
        if (c50Var != null) {
            c50Var.d();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.P.i();
    }

    @Override
    public final void onResume() {
        super.onResume();
        e0();
        this.P.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        TLRPC.User user;
        try {
            super.onThemeColorsChanged();
            if (this.e != null && (user = getMessagesController().getUser(Long.valueOf(this.H))) != null) {
                this.f37975n.m(this.currentAccount, user);
                this.e.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    public hs(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.f37976r = g6Var;
        this.P = new org.telegram.ui.Components.c50(0, true, true);
    }
}

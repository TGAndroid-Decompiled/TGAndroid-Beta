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
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
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
public final class is extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d40 {
    public gs A;
    public org.telegram.ui.Cells.p8 B;
    public MessagesController.DialogPhotos C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public String I;
    public String J;
    public hs K;
    public final org.telegram.ui.Components.e40 L;
    public TLRPC.FileLocation M;
    public int N;
    public int O;
    public TLRPC.Photo P;
    public org.telegram.ui.Components.o9 Q;
    public FrameLayout R;
    public org.telegram.ui.Components.i51 S;
    public boolean T;
    public boolean U;
    public MessageObject V;
    public org.telegram.ui.ActionBar.w0 f39269a;
    public org.telegram.ui.Cells.j3 f39270b;
    public org.telegram.ui.Cells.j3 f39271c;
    public org.telegram.ui.Cells.j3 d;
    public org.telegram.ui.Components.o9 f39272e;
    public TextView f39273f;
    public TextView h;
    public org.telegram.ui.Components.z8 f39274n;
    public final org.telegram.ui.ActionBar.b6 f39275r;
    public RadialProgressView f39276s;
    public kh.h6 v;
    public AnimatorSet f39277w;
    public org.telegram.ui.Cells.p8 f39278x;
    public org.telegram.ui.Cells.p8 f39279y;

    public is(Bundle bundle) {
        super(bundle);
        this.T = false;
        this.U = true;
        this.L = new org.telegram.ui.Components.e40(0, true, true);
    }

    public static void T(is isVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f22522id = isVar.getMessagesController().getInputUser(isVar.D);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(isVar.currentAccount).sendRequest(tL_users_suggestBirthday, new m(isVar, 5));
    }

    public static void U(is isVar, TLRPC.User user) {
        isVar.M = null;
        isVar.c0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(isVar.currentAccount).getUserFull(isVar.D);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            isVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = isVar.P;
        if (photo != null) {
            user2.photo.photo_id = photo.f22404id;
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
        isVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        isVar.f0();
        isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void V(is isVar) {
        TLRPC.User user;
        if (isVar.f39272e != null && (user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D))) != null) {
            isVar.f39274n.m(isVar.currentAccount, user);
            isVar.f39272e.invalidate();
        }
    }

    public static void W(is isVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.e40 e40Var = isVar.L;
        if (e40Var.P) {
            return;
        }
        int i9 = isVar.O;
        if (i9 == 2) {
            isVar.M = photoSize.location;
        } else if (i9 == 1 && isVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.b5 parentLayout = isVar.getParentLayout();
            org.telegram.ui.ActionBar.o2 lastFragment = isVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                if (o2Var instanceof qn) {
                    qn qnVar = (qn) o2Var;
                    org.telegram.ui.ActionBar.o2 o2Var2 = lastFragment;
                    if (qnVar.a() == isVar.D && qnVar.N3 == 0) {
                        qnVar.Wa(false, null);
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
            isVar.f39272e.h(ImageLocation.getForLocal(isVar.M), "50_50", isVar.f39274n, isVar.getMessagesController().getUser(Long.valueOf(isVar.D)));
            if (isVar.O == 2) {
                isVar.d0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(isVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = isVar.D;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = isVar.getUserConfig().getNewMessageId();
                tL_messageService.f22401id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = isVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = isVar.D;
                tL_messageService.date = isVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(isVar.currentAccount, tL_messageService, false, false);
                isVar.V = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(isVar.currentAccount).updateInterfaceWithMessages(isVar.D, arrayList2, 0);
                isVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, e40Var);
            }
        } else {
            TLRPC.User user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
            if (isVar.V == null && user != null) {
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
                isVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            isVar.c0(isVar.M, photoSize2.location, inputFile, inputFile2, videoSize, d, isVar.O);
            isVar.d0(false, true);
        }
        isVar.f0();
    }

    public static void X(is isVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i9) {
        if (isVar.V == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User user = isVar.getMessagesController().getUser(Long.valueOf(isVar.D));
                TLRPC.UserFull userFull = MessagesController.getInstance(isVar.currentAccount).getUserFull(isVar.D);
                if (userFull != null) {
                    userFull.personal_photo = tL_photos_photo.photo;
                    userFull.flags |= 2097152;
                    isVar.getMessagesStorage().updateUserInfo(userFull, true);
                }
                if (user != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
                    if (closestPhotoSizeWithSize != null && fileLocation != null) {
                        FileLoader.getInstance(isVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(isVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocation.volume_id);
                        sb2.append("_");
                        String l10 = aa.d.l(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(isVar.currentAccount, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                        FileLoader.getInstance(isVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(isVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    ff.l0.a(tL_photos_photo.photo, user, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    isVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    isVar.getMessagesController().getDialogPhotos(isVar.D).addPhotoAtStart(tL_photos_photo.photo);
                    isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    isVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                    if (isVar.getParentActivity() != null) {
                        if (i9 == 2) {
                            org.telegram.ui.Components.oc.a0(isVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.oc.a0(isVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        }
                    }
                }
                isVar.M = null;
                isVar.f0();
            }
        }
    }

    public static void Y(is isVar) {
        if (isVar.V != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(isVar.V.getId()));
            NotificationCenter.getInstance(isVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.f39276s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f39276s;
        if (radialProgressView == null) {
            return;
        }
        this.O = this.N;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void O() {
        AndroidUtilities.runOnUIThread(new as(this, 1));
    }

    @Override
    public final void P(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                is.W(is.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    public final String b0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
        if (user != null && !TextUtils.isEmpty(user.phone)) {
            return user.phone;
        }
        return this.H;
    }

    public final void c0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i9) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.D);
        if (inputFile != null) {
            tL_photos_uploadContactProfilePhoto.file = inputFile;
            tL_photos_uploadContactProfilePhoto.flags |= 1;
        }
        if (inputFile2 != null) {
            tL_photos_uploadContactProfilePhoto.video = inputFile2;
            int i10 = tL_photos_uploadContactProfilePhoto.flags;
            tL_photos_uploadContactProfilePhoto.video_start_ts = d;
            tL_photos_uploadContactProfilePhoto.flags = i10 | 6;
        }
        if (videoSize != null) {
            tL_photos_uploadContactProfilePhoto.flags |= 32;
            tL_photos_uploadContactProfilePhoto.video_emoji_markup = videoSize;
        }
        if (i9 == 1) {
            tL_photos_uploadContactProfilePhoto.suggest = true;
            tL_photos_uploadContactProfilePhoto.flags |= 8;
        } else {
            tL_photos_uploadContactProfilePhoto.save = true;
            tL_photos_uploadContactProfilePhoto.flags |= 16;
        }
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new ff.j0(this, fileLocation, inputFile2, fileLocation2, i9, 10));
    }

    @Override
    public final View createView(Context context) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        float f11;
        int i14;
        float f12;
        float f13;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.f6.f23039f8;
        org.telegram.ui.ActionBar.b6 b6Var = this.f39275r;
        kVar.A(org.telegram.ui.ActionBar.f6.v0(i15, b6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23321v8, b6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.E) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new es(this));
        this.f39269a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i16 = org.telegram.ui.ActionBar.f6.f22947a7;
        frameLayout.setBackgroundColor(getThemedColor(i16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        int i17 = org.telegram.ui.ActionBar.f6.f23001d6;
        frameLayout2.setBackgroundColor(getThemedColor(i17));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f39272e = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        FrameLayout frameLayout3 = this.R;
        org.telegram.ui.Components.o9 o9Var2 = this.f39272e;
        int i18 = 3;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        frameLayout3.addView(o9Var2, g7.e6.d(64, 64.0f, i9 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        kh.h6 h6Var = new kh.h6(this, context, paint, 8);
        this.v = h6Var;
        FrameLayout frameLayout4 = this.R;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout4.addView(h6Var, g7.e6.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39276s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f39276s.setProgressColor(-1);
        this.f39276s.setNoProgress(false);
        FrameLayout frameLayout5 = this.R;
        RadialProgressView radialProgressView2 = this.f39276s;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout5.addView(radialProgressView2, g7.e6.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        d0(false, false);
        TextView textView = new TextView(context);
        this.f39273f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        this.f39273f.setTextSize(1, 18.0f);
        this.f39273f.setLines(1);
        this.f39273f.setMaxLines(1);
        this.f39273f.setSingleLine(true);
        TextView textView2 = this.f39273f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f39273f;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView3.setGravity(i12);
        this.f39273f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout6 = this.R;
        TextView textView4 = this.f39273f;
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i19 = i13 | 48;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 94.0f;
        }
        if (z10) {
            f11 = 94.0f;
        } else {
            f11 = 0.0f;
        }
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout6, textView4, g7.e6.d(-2, -2.0f, i19, f10, 25.66f, f11, 0.0f), context);
        this.h = g10;
        g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A6, b6Var));
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView5.setGravity(i14);
        FrameLayout frameLayout7 = this.R;
        TextView textView6 = this.h;
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i18 = 5;
        }
        int i20 = i18 | 48;
        if (z11) {
            f12 = 0.0f;
        } else {
            f12 = 94.0f;
        }
        if (z11) {
            f13 = 94.0f;
        } else {
            f13 = 0.0f;
        }
        frameLayout7.addView(textView6, g7.e6.d(-2, -2.0f, i20, f12, 49.66f, f13, 0.0f));
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.f39275r);
        this.f39270b = j3Var;
        j3Var.f24544b.setImeOptions(5);
        this.f39270b.setBackgroundColor(getThemedColor(i17));
        this.f39270b.setDivider(true);
        this.f39270b.f24544b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final is f37313b;

            {
                this.f37313b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            is isVar = this.f37313b;
                            isVar.f39271c.f24544b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = isVar.f39271c.f24544b;
                            h3Var.setSelection(h3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        is isVar2 = this.f37313b;
                        if (i21 == 6) {
                            isVar2.f39269a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            isVar2.d.f24544b.requestFocus();
                            isVar2.d.f24544b.setSelection(isVar2.f39271c.f24544b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i21 == 6) {
                            this.f37313b.f39269a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f39270b.f24544b.setOnFocusChangeListener(new Object());
        this.f39270b.setText(this.I);
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.f39275r);
        this.f39271c = j3Var2;
        j3Var2.f24544b.setImeOptions(5);
        this.f39271c.setBackgroundColor(getThemedColor(i17));
        this.f39271c.f24544b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final is f37313b;

            {
                this.f37313b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            is isVar = this.f37313b;
                            isVar.f39271c.f24544b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = isVar.f39271c.f24544b;
                            h3Var.setSelection(h3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        is isVar2 = this.f37313b;
                        if (i21 == 6) {
                            isVar2.f39269a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            isVar2.d.f24544b.requestFocus();
                            isVar2.d.f24544b.setSelection(isVar2.f39271c.f24544b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i21 == 6) {
                            this.f37313b.f39269a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f39271c.setText(this.J);
        org.telegram.ui.Cells.j3 j3Var3 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.f39275r);
        this.d = j3Var3;
        j3Var3.f24544b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23061gc));
        this.d.f24544b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i17));
        this.d.f24544b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final is f37313b;

            {
                this.f37313b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            is isVar = this.f37313b;
                            isVar.f39271c.f24544b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = isVar.f39271c.f24544b;
                            h3Var.setSelection(h3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        is isVar2 = this.f37313b;
                        if (i21 == 6) {
                            isVar2.f39269a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            isVar2.d.f24544b.requestFocus();
                            isVar2.d.f24544b.setSelection(isVar2.f39271c.f24544b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i21 == 6) {
                            this.f37313b.f39269a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (!this.E) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context, b6Var);
            this.f39278x = p8Var;
            p8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.f39278x.setBackground(org.telegram.ui.ActionBar.f6.J0(b6Var, true));
            org.telegram.ui.Cells.p8 p8Var2 = this.f39278x;
            int i21 = org.telegram.ui.ActionBar.f6.f23319v6;
            int i22 = org.telegram.ui.ActionBar.f6.f23303u6;
            p8Var2.e(i21, i22);
            int i23 = R.raw.photo_suggest_icon;
            final org.telegram.ui.Components.mi0 mi0Var = new org.telegram.ui.Components.mi0(i23, "" + R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f39278x.f24875e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.f39278x.f24875e.setAnimation(mi0Var);
            this.f39278x.setOnClickListener(new View.OnClickListener(this) {
                public final is f37591b;

                {
                    this.f37591b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final is isVar = this.f37591b;
                            boolean z13 = true;
                            isVar.N = 1;
                            org.telegram.ui.Components.e40 e40Var = isVar.L;
                            TLRPC.User user2 = user;
                            e40Var.H = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            bg.d2 d2Var = new bg.d2(23);
                            final org.telegram.ui.Components.mi0 mi0Var2 = mi0Var;
                            e40Var.o(z13, d2Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            is isVar2 = isVar;
                                            boolean h = isVar2.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var3 = mi0Var2;
                                            if (!h) {
                                                mi0Var3.N(86);
                                                isVar2.f39279y.f24875e.d();
                                                return;
                                            }
                                            mi0Var3.L(0, false, false);
                                            return;
                                        default:
                                            is isVar3 = isVar;
                                            boolean h10 = isVar3.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var4 = mi0Var2;
                                            if (!h10) {
                                                mi0Var4.N(85);
                                                isVar3.f39278x.f24875e.d();
                                                return;
                                            }
                                            mi0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            mi0Var2.K(0);
                            mi0Var2.N(43);
                            isVar.f39278x.f24875e.d();
                            return;
                        default:
                            final is isVar2 = this.f37591b;
                            isVar2.N = 2;
                            org.telegram.ui.Components.e40 e40Var2 = isVar2.L;
                            TLRPC.User user3 = user;
                            e40Var2.H = user3;
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
                            bg.d2 d2Var2 = new bg.d2(23);
                            final org.telegram.ui.Components.mi0 mi0Var3 = mi0Var;
                            e40Var2.o(z12, d2Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            is isVar22 = isVar2;
                                            boolean h = isVar22.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var32 = mi0Var3;
                                            if (!h) {
                                                mi0Var32.N(86);
                                                isVar22.f39279y.f24875e.d();
                                                return;
                                            }
                                            mi0Var32.L(0, false, false);
                                            return;
                                        default:
                                            is isVar3 = isVar2;
                                            boolean h10 = isVar3.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var4 = mi0Var3;
                                            if (!h10) {
                                                mi0Var4.N(85);
                                                isVar3.f39278x.f24875e.d();
                                                return;
                                            }
                                            mi0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            mi0Var3.K(0);
                            mi0Var3.N(43);
                            isVar2.f39279y.f24875e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.p8 p8Var3 = new org.telegram.ui.Cells.p8(context, b6Var);
            this.f39279y = p8Var3;
            p8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.f39279y.setBackground(org.telegram.ui.ActionBar.f6.J0(b6Var, true));
            this.f39279y.e(i21, i22);
            int i24 = R.raw.camera_outline;
            final org.telegram.ui.Components.mi0 mi0Var2 = new org.telegram.ui.Components.mi0(i24, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f39279y.f24875e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.f39279y.f24875e.setAnimation(mi0Var2);
            this.f39279y.setOnClickListener(new View.OnClickListener(this) {
                public final is f37591b;

                {
                    this.f37591b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final is isVar = this.f37591b;
                            boolean z13 = true;
                            isVar.N = 1;
                            org.telegram.ui.Components.e40 e40Var = isVar.L;
                            TLRPC.User user2 = user;
                            e40Var.H = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            bg.d2 d2Var = new bg.d2(23);
                            final org.telegram.ui.Components.mi0 mi0Var22 = mi0Var2;
                            e40Var.o(z13, d2Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            is isVar22 = isVar;
                                            boolean h = isVar22.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var32 = mi0Var22;
                                            if (!h) {
                                                mi0Var32.N(86);
                                                isVar22.f39279y.f24875e.d();
                                                return;
                                            }
                                            mi0Var32.L(0, false, false);
                                            return;
                                        default:
                                            is isVar3 = isVar;
                                            boolean h10 = isVar3.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var4 = mi0Var22;
                                            if (!h10) {
                                                mi0Var4.N(85);
                                                isVar3.f39278x.f24875e.d();
                                                return;
                                            }
                                            mi0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            mi0Var22.K(0);
                            mi0Var22.N(43);
                            isVar.f39278x.f24875e.d();
                            return;
                        default:
                            final is isVar2 = this.f37591b;
                            isVar2.N = 2;
                            org.telegram.ui.Components.e40 e40Var2 = isVar2.L;
                            TLRPC.User user3 = user;
                            e40Var2.H = user3;
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
                            bg.d2 d2Var2 = new bg.d2(23);
                            final org.telegram.ui.Components.mi0 mi0Var3 = mi0Var2;
                            e40Var2.o(z12, d2Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            is isVar22 = isVar2;
                                            boolean h = isVar22.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var32 = mi0Var3;
                                            if (!h) {
                                                mi0Var32.N(86);
                                                isVar22.f39279y.f24875e.d();
                                                return;
                                            }
                                            mi0Var32.L(0, false, false);
                                            return;
                                        default:
                                            is isVar3 = isVar2;
                                            boolean h10 = isVar3.L.h();
                                            org.telegram.ui.Components.mi0 mi0Var4 = mi0Var3;
                                            if (!h10) {
                                                mi0Var4.N(85);
                                                isVar3.f39278x.f24875e.d();
                                                return;
                                            }
                                            mi0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            mi0Var3.K(0);
                            mi0Var3.N(43);
                            isVar2.f39279y.f24875e.d();
                            return;
                    }
                }
            });
            this.Q = new org.telegram.ui.Components.o9(context);
            this.A = new gs(this, context, b6Var);
            if (this.f39274n == null) {
                this.f39274n = new org.telegram.ui.Components.z8(0, user);
            }
            this.Q.e(user.photo, this.f39274n);
            this.A.addView(this.Q, g7.e6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.A.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.A.getImageView().setVisibility(0);
            this.A.setBackground(org.telegram.ui.ActionBar.f6.J0(b6Var, true));
            this.A.e(i21, i22);
            this.A.setOnClickListener(new b0(this, context, user, 10));
            org.telegram.ui.Cells.p8 p8Var4 = new org.telegram.ui.Cells.p8(context, b6Var);
            this.B = p8Var4;
            p8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.B.setBackground(org.telegram.ui.ActionBar.f6.J0(b6Var, true));
            this.B.e(i21, i22);
            this.B.setNeedDivider(true);
            this.B.f24875e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.B.setOnClickListener(new org.telegram.ui.Components.vh0(14, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.D);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.P = photo;
                if (photo == null) {
                    this.P = userFull.fallback_photo;
                }
            }
            f0();
        }
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(this, new a5(this, 7), new b1(this, 26), null);
        this.S = i51Var;
        i51Var.p1();
        this.S.setOnScrollListener(new eh.n(5, this, frameLayout));
        this.S.setBackgroundColor(getThemedColor(i16));
        frameLayout.addView(this.S, g7.e6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.S);
        if (this.E && this.G) {
            this.T = true;
        }
        this.S.U2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(boolean z10, boolean z11) {
        if (this.f39276s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39277w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f39277w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f39277w = animatorSet2;
            if (z10) {
                this.f39276s.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39277w;
                RadialProgressView radialProgressView = this.f39276s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f39276s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f39277w.setDuration(180L);
            this.f39277w.addListener(new org.telegram.ui.Components.u9(26, this, z10));
            this.f39277w.start();
        } else if (z10) {
            this.f39276s.setAlpha(1.0f);
            this.f39276s.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f39276s.setAlpha(0.0f);
            this.f39276s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i9 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_STATUS) != 0) {
                e0();
            }
        } else if (i9 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.C) {
            ArrayList arrayList = new ArrayList(dialogPhotos.photos);
            int i11 = 0;
            while (i11 < arrayList.size()) {
                if (arrayList.get(i11) == null) {
                    arrayList.remove(i11);
                    i11--;
                }
                i11++;
            }
            if (arrayList.size() > 0) {
                this.P = (TLRPC.Photo) arrayList.get(0);
                f0();
            }
        }
    }

    @Override
    public final boolean e() {
        if (this.O != 1) {
            return true;
        }
        return false;
    }

    public final void e0() {
        TLRPC.User user;
        if (this.f39273f != null && (user = getMessagesController().getUser(Long.valueOf(this.D))) != null) {
            if (TextUtils.isEmpty(b0())) {
                this.f39273f.setText(LocaleController.getString(R.string.MobileHidden));
            } else {
                TextView textView = this.f39273f;
                ne.b c10 = ne.b.c();
                textView.setText(c10.b("+" + b0()));
            }
            this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
            if (this.M == null) {
                org.telegram.ui.Components.o9 o9Var = this.f39272e;
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(0, user);
                this.f39274n = z8Var;
                o9Var.e(user, z8Var);
            }
        }
    }

    public final void f0() {
        TLRPC.Photo photo;
        if (this.E) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.P) != null) {
            this.Q.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.P), "50_50", this.f39274n, null);
        }
        if (this.f39274n == null) {
            this.f39274n = new org.telegram.ui.Components.z8(0, user);
        }
        TLRPC.FileLocation fileLocation = this.M;
        if (fileLocation == null) {
            this.f39272e.e(user, this.f39274n);
        } else {
            this.f39272e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.f39274n, getMessagesController().getUser(Long.valueOf(this.D)));
        }
    }

    @Override
    public final bu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.f39275r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        TextView textView = this.f39273f;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39270b, 4, null, null, null, null, i9));
        org.telegram.ui.Cells.j3 j3Var = this.f39270b;
        int i10 = org.telegram.ui.ActionBar.f6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(j3Var, 8388608, null, null, null, null, i10));
        org.telegram.ui.Cells.j3 j3Var2 = this.f39270b;
        int i11 = org.telegram.ui.ActionBar.f6.f23127k6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(j3Var2, 32, null, null, null, null, i11));
        org.telegram.ui.Cells.j3 j3Var3 = this.f39270b;
        int i12 = org.telegram.ui.ActionBar.f6.f23144l6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(j3Var3, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39271c, 4, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39271c, 8388608, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39271c, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f39271c, 65568, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, org.telegram.ui.ActionBar.f6.f23242r0, eVar, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.U7));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.D = getArguments().getLong("user_id", 0L);
        this.H = getArguments().getString("phone");
        this.I = getArguments().getString("first_name_card");
        this.J = getArguments().getString("last_name_card");
        this.E = getArguments().getBoolean("addContact", false);
        this.F = getArguments().getBoolean("focus_notes", false);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        this.G = notificationsSettings.getBoolean("dialog_bar_exception" + this.D, false);
        if (this.D != 0) {
            user = getMessagesController().getUser(Long.valueOf(this.D));
        } else {
            user = null;
        }
        org.telegram.ui.Components.e40 e40Var = this.L;
        if (e40Var != null) {
            e40Var.f27909a = this;
            e40Var.f27910b = this;
        }
        this.C = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.D);
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
        org.telegram.ui.Components.e40 e40Var = this.L;
        if (e40Var != null) {
            e40Var.e();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.L.j();
    }

    @Override
    public final void onResume() {
        super.onResume();
        e0();
        this.L.l();
    }

    @Override
    public final boolean u() {
        return false;
    }

    public is(Bundle bundle, org.telegram.ui.ActionBar.b6 b6Var) {
        super(bundle);
        this.T = false;
        this.U = true;
        this.f39275r = b6Var;
        this.L = new org.telegram.ui.Components.e40(0, true, true);
    }
}

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
public final class ms extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.v40 {
    public ks E;
    public org.telegram.ui.Cells.r8 F;
    public MessagesController.DialogPhotos G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public ls O;
    public final org.telegram.ui.Components.w40 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.w9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.s61 W;
    public boolean X;
    public boolean Y;
    public MessageObject Z;
    public org.telegram.ui.ActionBar.u0 f35651a;
    public org.telegram.ui.Cells.j3 f35652b;
    public org.telegram.ui.Cells.j3 f35653c;
    public org.telegram.ui.Cells.j3 d;
    public org.telegram.ui.Components.w9 e;
    public TextView f35654f;
    public TextView h;
    public org.telegram.ui.Components.h9 f35655n;
    public final org.telegram.ui.ActionBar.d6 f35656r;
    public RadialProgressView f35657s;
    public ci.r6 v;
    public AnimatorSet f35658w;
    public org.telegram.ui.Cells.r8 f35659x;
    public org.telegram.ui.Cells.r8 f35660y;

    public ms(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.w40(0, true, true);
    }

    public static void U(ms msVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f18477id = msVar.getMessagesController().getInputUser(msVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(msVar.currentAccount).sendRequest(tL_users_suggestBirthday, new m(msVar, 5));
    }

    public static void V(ms msVar, TLRPC.User user) {
        msVar.Q = null;
        msVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = msVar.getMessagesController().getUser(Long.valueOf(msVar.H));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(msVar.currentAccount).getUserFull(msVar.H);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            msVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = msVar.T;
        if (photo != null) {
            user2.photo.photo_id = photo.f18359id;
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
        msVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        msVar.g0();
        msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void W(ms msVar) {
        TLRPC.User user;
        if (msVar.e != null && (user = msVar.getMessagesController().getUser(Long.valueOf(msVar.H))) != null) {
            msVar.f35655n.m(msVar.currentAccount, user);
            msVar.e.invalidate();
        }
    }

    public static void X(ms msVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.w40 w40Var = msVar.P;
        if (w40Var.T) {
            return;
        }
        int i10 = msVar.S;
        if (i10 == 2) {
            msVar.Q = photoSize.location;
        } else if (i10 == 1 && msVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.b5 parentLayout = msVar.getParentLayout();
            org.telegram.ui.ActionBar.m2 lastFragment = msVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(size);
                if (m2Var instanceof wn) {
                    wn wnVar = (wn) m2Var;
                    org.telegram.ui.ActionBar.m2 m2Var2 = lastFragment;
                    if (wnVar.a() == msVar.H && wnVar.R3 == 0) {
                        wnVar.Wa(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var2;
                            if (arrayList.get(size2) != m2Var3) {
                                ((org.telegram.ui.ActionBar.m2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            m2Var2 = m2Var3;
                        }
                        m2Var2.finishFragment();
                    } else {
                        lastFragment = m2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.m2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            msVar.e.h(ImageLocation.getForLocal(msVar.Q), "50_50", msVar.f35655n, msVar.getMessagesController().getUser(Long.valueOf(msVar.H)));
            if (msVar.S == 2) {
                msVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(msVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = msVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = msVar.getUserConfig().getNewMessageId();
                tL_messageService.f18356id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = msVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = msVar.H;
                tL_messageService.date = msVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(msVar.currentAccount, tL_messageService, false, false);
                msVar.Z = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(msVar.currentAccount).updateInterfaceWithMessages(msVar.H, arrayList2, 0);
                msVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, w40Var);
            }
        } else {
            TLRPC.User user = msVar.getMessagesController().getUser(Long.valueOf(msVar.H));
            if (msVar.Z == null && user != null) {
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
                msVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            msVar.d0(msVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, msVar.S);
            msVar.e0(false, true);
        }
        msVar.g0();
    }

    public static void Y(ms msVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (msVar.Z == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User user = msVar.getMessagesController().getUser(Long.valueOf(msVar.H));
                TLRPC.UserFull userFull = MessagesController.getInstance(msVar.currentAccount).getUserFull(msVar.H);
                if (userFull != null) {
                    userFull.personal_photo = tL_photos_photo.photo;
                    userFull.flags |= 2097152;
                    msVar.getMessagesStorage().updateUserInfo(userFull, true);
                }
                if (user != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
                    if (closestPhotoSizeWithSize != null && fileLocation != null) {
                        FileLoader.getInstance(msVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(msVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocation.volume_id);
                        sb2.append("_");
                        String o9 = a4.a.o(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        ImageLoader.getInstance().replaceImageInCache(o9, a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(msVar.currentAccount, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                        FileLoader.getInstance(msVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(msVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    yf.d0.a(tL_photos_photo.photo, user, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    msVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    msVar.getMessagesController().getDialogPhotos(msVar.H).addPhotoAtStart(tL_photos_photo.photo);
                    msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    msVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                    if (msVar.getParentActivity() != null) {
                        if (i10 == 2) {
                            org.telegram.ui.Components.xc.a0(msVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.xc.a0(msVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        }
                    }
                }
                msVar.Q = null;
                msVar.g0();
            }
        }
    }

    public static void Z(ms msVar) {
        if (msVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(msVar.Z.getId()));
            NotificationCenter.getInstance(msVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void B(float f7) {
        RadialProgressView radialProgressView = this.f35657s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f35657s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void P() {
        AndroidUtilities.runOnUIThread(new es(this, 1));
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ms.X(ms.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    public final String c0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        if (user != null && !TextUtils.isEmpty(user.phone)) {
            return user.phone;
        }
        return this.L;
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
        int i16 = org.telegram.ui.ActionBar.h6.f19096f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f35656r;
        kVar.A(org.telegram.ui.ActionBar.h6.v0(i16, d6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19392v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.I) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new is(this));
        this.f35651a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i17 = org.telegram.ui.ActionBar.h6.f19003a7;
        frameLayout.setBackgroundColor(getThemedColor(i17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i18 = org.telegram.ui.ActionBar.h6.f19059d6;
        frameLayout2.setBackgroundColor(getThemedColor(i18));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.e = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        FrameLayout frameLayout3 = this.V;
        org.telegram.ui.Components.w9 w9Var2 = this.e;
        int i19 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(w9Var2, w7.y5.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ci.r6 r6Var = new ci.r6(this, context, paint, 8);
        this.v = r6Var;
        FrameLayout frameLayout4 = this.V;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(r6Var, w7.y5.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f35657s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f35657s.setProgressColor(-1);
        this.f35657s.setNoProgress(false);
        FrameLayout frameLayout5 = this.V;
        RadialProgressView radialProgressView2 = this.f35657s;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, w7.y5.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f35654f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        this.f35654f.setTextSize(1, 18.0f);
        this.f35654f.setLines(1);
        this.f35654f.setMaxLines(1);
        this.f35654f.setSingleLine(true);
        TextView textView2 = this.f35654f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f35654f;
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f35654f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout6 = this.V;
        TextView textView4 = this.f35654f;
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
        TextView h = org.telegram.ui.Cells.c1.h(frameLayout6, textView4, w7.y5.d(-2, -2.0f, i20, f7, 25.66f, f10, 0.0f), context);
        this.h = h;
        h.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, d6Var));
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
            i19 = 5;
        }
        int i21 = i19 | 48;
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
        frameLayout7.addView(textView6, w7.y5.d(-2, -2.0f, i21, f11, 49.66f, f12, 0.0f));
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.f35656r);
        this.f35652b = j3Var;
        j3Var.f20491b.setImeOptions(5);
        this.f35652b.setBackgroundColor(getThemedColor(i18));
        this.f35652b.setDivider(true);
        this.f35652b.f20491b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ms f34043b;

            {
                this.f34043b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ms msVar = this.f34043b;
                            msVar.f35653c.f20491b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = msVar.f35653c.f20491b;
                            h3Var.setSelection(h3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ms msVar2 = this.f34043b;
                        if (i22 == 6) {
                            msVar2.f35651a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            msVar2.d.f20491b.requestFocus();
                            msVar2.d.f20491b.setSelection(msVar2.f35653c.f20491b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f34043b.f35651a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f35652b.f20491b.setOnFocusChangeListener(new Object());
        this.f35652b.setText(this.M);
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.f35656r);
        this.f35653c = j3Var2;
        j3Var2.f20491b.setImeOptions(5);
        this.f35653c.setBackgroundColor(getThemedColor(i18));
        this.f35653c.f20491b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ms f34043b;

            {
                this.f34043b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ms msVar = this.f34043b;
                            msVar.f35653c.f20491b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = msVar.f35653c.f20491b;
                            h3Var.setSelection(h3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ms msVar2 = this.f34043b;
                        if (i22 == 6) {
                            msVar2.f35651a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            msVar2.d.f20491b.requestFocus();
                            msVar2.d.f20491b.setSelection(msVar2.f35653c.f20491b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f34043b.f35651a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f35653c.setText(this.N);
        org.telegram.ui.Cells.j3 j3Var3 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.f35656r);
        this.d = j3Var3;
        j3Var3.f20491b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.gc));
        this.d.f20491b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i18));
        this.d.f20491b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ms f34043b;

            {
                this.f34043b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ms msVar = this.f34043b;
                            msVar.f35653c.f20491b.requestFocus();
                            org.telegram.ui.Cells.h3 h3Var = msVar.f35653c.f20491b;
                            h3Var.setSelection(h3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ms msVar2 = this.f34043b;
                        if (i22 == 6) {
                            msVar2.f35651a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            msVar2.d.f20491b.requestFocus();
                            msVar2.d.f20491b.setSelection(msVar2.f35653c.f20491b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f34043b.f35651a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (!this.I) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context, d6Var);
            this.f35659x = r8Var;
            r8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.f35659x.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            org.telegram.ui.Cells.r8 r8Var2 = this.f35659x;
            int i22 = org.telegram.ui.ActionBar.h6.f19390v6;
            int i23 = org.telegram.ui.ActionBar.h6.f19372u6;
            r8Var2.e(i22, i23);
            final org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f35659x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f35659x.e.setAnimation(jj0Var);
            this.f35659x.setOnClickListener(new View.OnClickListener(this) {
                public final ms f34276b;

                {
                    this.f34276b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final ms msVar = this.f34276b;
                            boolean z13 = true;
                            msVar.R = 1;
                            org.telegram.ui.Components.w40 w40Var = msVar.P;
                            TLRPC.User user2 = user;
                            w40Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ai.f fVar = new ai.f(18);
                            final org.telegram.ui.Components.jj0 jj0Var2 = jj0Var;
                            w40Var.o(z13, fVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ms msVar2 = msVar;
                                            boolean h10 = msVar2.P.h();
                                            org.telegram.ui.Components.jj0 jj0Var3 = jj0Var2;
                                            if (!h10) {
                                                jj0Var3.P(86);
                                                msVar2.f35660y.e.d();
                                                return;
                                            }
                                            jj0Var3.N(0, false, false);
                                            return;
                                        default:
                                            ms msVar3 = msVar;
                                            boolean h11 = msVar3.P.h();
                                            org.telegram.ui.Components.jj0 jj0Var4 = jj0Var2;
                                            if (!h11) {
                                                jj0Var4.P(85);
                                                msVar3.f35659x.e.d();
                                                return;
                                            }
                                            jj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            jj0Var2.M(0);
                            jj0Var2.P(43);
                            msVar.f35659x.e.d();
                            return;
                        default:
                            final ms msVar2 = this.f34276b;
                            msVar2.R = 2;
                            org.telegram.ui.Components.w40 w40Var2 = msVar2.P;
                            TLRPC.User user3 = user;
                            w40Var2.L = user3;
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
                            ai.f fVar2 = new ai.f(18);
                            final org.telegram.ui.Components.jj0 jj0Var3 = jj0Var;
                            w40Var2.o(z12, fVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ms msVar22 = msVar2;
                                            boolean h10 = msVar22.P.h();
                                            org.telegram.ui.Components.jj0 jj0Var32 = jj0Var3;
                                            if (!h10) {
                                                jj0Var32.P(86);
                                                msVar22.f35660y.e.d();
                                                return;
                                            }
                                            jj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ms msVar3 = msVar2;
                                            boolean h11 = msVar3.P.h();
                                            org.telegram.ui.Components.jj0 jj0Var4 = jj0Var3;
                                            if (!h11) {
                                                jj0Var4.P(85);
                                                msVar3.f35659x.e.d();
                                                return;
                                            }
                                            jj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            jj0Var3.M(0);
                            jj0Var3.P(43);
                            msVar2.f35660y.e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.r8 r8Var3 = new org.telegram.ui.Cells.r8(context, d6Var);
            this.f35660y = r8Var3;
            r8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.f35660y.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            this.f35660y.e(i22, i23);
            final org.telegram.ui.Components.jj0 jj0Var2 = new org.telegram.ui.Components.jj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f35660y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f35660y.e.setAnimation(jj0Var2);
            this.f35660y.setOnClickListener(new View.OnClickListener(this) {
                public final ms f34276b;

                {
                    this.f34276b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final ms msVar = this.f34276b;
                            boolean z13 = true;
                            msVar.R = 1;
                            org.telegram.ui.Components.w40 w40Var = msVar.P;
                            TLRPC.User user2 = user;
                            w40Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ai.f fVar = new ai.f(18);
                            final org.telegram.ui.Components.jj0 jj0Var22 = jj0Var2;
                            w40Var.o(z13, fVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ms msVar22 = msVar;
                                            boolean h10 = msVar22.P.h();
                                            org.telegram.ui.Components.jj0 jj0Var32 = jj0Var22;
                                            if (!h10) {
                                                jj0Var32.P(86);
                                                msVar22.f35660y.e.d();
                                                return;
                                            }
                                            jj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ms msVar3 = msVar;
                                            boolean h11 = msVar3.P.h();
                                            org.telegram.ui.Components.jj0 jj0Var4 = jj0Var22;
                                            if (!h11) {
                                                jj0Var4.P(85);
                                                msVar3.f35659x.e.d();
                                                return;
                                            }
                                            jj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            jj0Var22.M(0);
                            jj0Var22.P(43);
                            msVar.f35659x.e.d();
                            return;
                        default:
                            final ms msVar2 = this.f34276b;
                            msVar2.R = 2;
                            org.telegram.ui.Components.w40 w40Var2 = msVar2.P;
                            TLRPC.User user3 = user;
                            w40Var2.L = user3;
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
                            ai.f fVar2 = new ai.f(18);
                            final org.telegram.ui.Components.jj0 jj0Var3 = jj0Var2;
                            w40Var2.o(z12, fVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ms msVar22 = msVar2;
                                            boolean h10 = msVar22.P.h();
                                            org.telegram.ui.Components.jj0 jj0Var32 = jj0Var3;
                                            if (!h10) {
                                                jj0Var32.P(86);
                                                msVar22.f35660y.e.d();
                                                return;
                                            }
                                            jj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ms msVar3 = msVar2;
                                            boolean h11 = msVar3.P.h();
                                            org.telegram.ui.Components.jj0 jj0Var4 = jj0Var3;
                                            if (!h11) {
                                                jj0Var4.P(85);
                                                msVar3.f35659x.e.d();
                                                return;
                                            }
                                            jj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            jj0Var3.M(0);
                            jj0Var3.P(43);
                            msVar2.f35660y.e.d();
                            return;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.w9(context);
            this.E = new ks(this, context, d6Var);
            if (this.f35655n == null) {
                this.f35655n = new org.telegram.ui.Components.h9(0, user);
            }
            this.U.e(user.photo, this.f35655n);
            this.E.addView(this.U, w7.y5.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            this.E.e(i22, i23);
            this.E.setOnClickListener(new a0(this, context, user, 10));
            org.telegram.ui.Cells.r8 r8Var4 = new org.telegram.ui.Cells.r8(context, d6Var);
            this.F = r8Var4;
            r8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            this.F.e(i22, i23);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.ft(27, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.H);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.T = photo;
                if (photo == null) {
                    this.T = userFull.fallback_photo;
                }
            }
            g0();
        }
        org.telegram.ui.Components.s61 s61Var = new org.telegram.ui.Components.s61(this, new b5(this, 7), new z0(this, 26), null);
        this.W = s61Var;
        s61Var.p1();
        this.W.setOnScrollListener(new ii.n3(4, this, frameLayout));
        this.W.setBackgroundColor(getThemedColor(i17));
        frameLayout.addView(this.W, w7.y5.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.W);
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.Y2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new ai.ya(this, fileLocation, inputFile2, fileLocation2, i10, 7));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_STATUS) != 0) {
                f0();
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
                g0();
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

    public final void e0(boolean z10, boolean z11) {
        if (this.f35657s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f35658w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f35658w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35658w = animatorSet2;
            if (z10) {
                this.f35657s.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f35658w;
                RadialProgressView radialProgressView = this.f35657s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f35657s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f35658w.setDuration(180L);
            this.f35658w.addListener(new org.telegram.ui.Components.ca(26, this, z10));
            this.f35658w.start();
        } else if (z10) {
            this.f35657s.setAlpha(1.0f);
            this.f35657s.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f35657s.setAlpha(0.0f);
            this.f35657s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f35654f != null && (user = getMessagesController().getUser(Long.valueOf(this.H))) != null) {
            if (TextUtils.isEmpty(c0())) {
                this.f35654f.setText(LocaleController.getString(R.string.MobileHidden));
            } else {
                TextView textView = this.f35654f;
                gf.b c10 = gf.b.c();
                textView.setText(c10.b("+" + c0()));
            }
            this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
            if (this.Q == null) {
                org.telegram.ui.Components.w9 w9Var = this.e;
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(0, user);
                this.f35655n = h9Var;
                w9Var.e(user, h9Var);
            }
        }
    }

    public final void g0() {
        TLRPC.Photo photo;
        if (this.I) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.T) != null) {
            this.U.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.T), "50_50", this.f35655n, null);
        }
        if (this.f35655n == null) {
            this.f35655n = new org.telegram.ui.Components.h9(0, user);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.e(user, this.f35655n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.f35655n, getMessagesController().getUser(Long.valueOf(this.H)));
        }
    }

    @Override
    public final vu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f35656r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19059d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19392v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19356t8));
        TextView textView = this.f35654f;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35652b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.j3 j3Var = this.f35652b;
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(j3Var, 8388608, null, null, null, null, i11));
        org.telegram.ui.Cells.j3 j3Var2 = this.f35652b;
        int i12 = org.telegram.ui.ActionBar.h6.f19186k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(j3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.j3 j3Var3 = this.f35652b;
        int i13 = org.telegram.ui.ActionBar.h6.f19204l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(j3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35653c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35653c, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35653c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35653c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f19310r0, eVar, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        return arrayList;
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
        org.telegram.ui.Components.w40 w40Var = this.P;
        if (w40Var != null) {
            w40Var.f29841a = this;
            w40Var.f29842b = this;
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
        org.telegram.ui.Components.w40 w40Var = this.P;
        if (w40Var != null) {
            w40Var.e();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.P.j();
    }

    @Override
    public final void onResume() {
        super.onResume();
        f0();
        this.P.l();
    }

    @Override
    public final boolean t() {
        return false;
    }

    public ms(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.f35656r = d6Var;
        this.P = new org.telegram.ui.Components.w40(0, true, true);
    }
}

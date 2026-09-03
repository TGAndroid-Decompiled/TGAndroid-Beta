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
public final class os extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.x40 {
    public ms B;
    public org.telegram.ui.Cells.o8 C;
    public MessagesController.DialogPhotos D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public String I;
    public String J;
    public String K;
    public ns L;
    public final org.telegram.ui.Components.y40 M;
    public TLRPC.FileLocation N;
    public int O;
    public int P;
    public TLRPC.Photo Q;
    public org.telegram.ui.Components.p9 R;
    public FrameLayout S;
    public org.telegram.ui.Components.h61 T;
    public boolean U;
    public boolean V;
    public MessageObject W;
    public org.telegram.ui.ActionBar.w0 f39790a;
    public org.telegram.ui.Cells.i3 f39791b;
    public org.telegram.ui.Cells.i3 f39792c;
    public org.telegram.ui.Cells.i3 d;
    public org.telegram.ui.Components.p9 f39793e;
    public TextView f39794f;
    public TextView h;
    public org.telegram.ui.Components.z8 f39795n;
    public final org.telegram.ui.ActionBar.g6 f39796r;
    public RadialProgressView f39797s;
    public fg.i0 v;
    public AnimatorSet f39798w;
    public org.telegram.ui.Cells.o8 f39799x;
    public org.telegram.ui.Cells.o8 f39800y;

    public os(Bundle bundle) {
        super(bundle);
        this.U = false;
        this.V = true;
        this.M = new org.telegram.ui.Components.y40(0, true, true);
    }

    public static void U(os osVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f20987id = osVar.getMessagesController().getInputUser(osVar.E);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(osVar.currentAccount).sendRequest(tL_users_suggestBirthday, new o(osVar, 5));
    }

    public static void V(os osVar, TLRPC.User user) {
        osVar.N = null;
        osVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = osVar.getMessagesController().getUser(Long.valueOf(osVar.E));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(osVar.currentAccount).getUserFull(osVar.E);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            osVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = osVar.Q;
        if (photo != null) {
            user2.photo.photo_id = photo.f20869id;
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
        osVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        osVar.g0();
        osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void W(os osVar) {
        TLRPC.User user;
        if (osVar.f39793e != null && (user = osVar.getMessagesController().getUser(Long.valueOf(osVar.E))) != null) {
            osVar.f39795n.m(osVar.currentAccount, user);
            osVar.f39793e.invalidate();
        }
    }

    public static void X(os osVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z4) {
        boolean z10;
        org.telegram.ui.Components.y40 y40Var = osVar.M;
        if (y40Var.Q) {
            return;
        }
        int i10 = osVar.P;
        if (i10 == 2) {
            osVar.N = photoSize.location;
        } else if (i10 == 1 && osVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.f5 parentLayout = osVar.getParentLayout();
            org.telegram.ui.ActionBar.p2 lastFragment = osVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(size);
                if (p2Var instanceof xn) {
                    xn xnVar = (xn) p2Var;
                    org.telegram.ui.ActionBar.p2 p2Var2 = lastFragment;
                    if (xnVar.a() == osVar.E && xnVar.O3 == 0) {
                        xnVar.Wa(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var2;
                            if (arrayList.get(size2) != p2Var3) {
                                ((org.telegram.ui.ActionBar.p2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            p2Var2 = p2Var3;
                        }
                        p2Var2.finishFragment();
                    } else {
                        lastFragment = p2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.p2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            osVar.f39793e.h(ImageLocation.getForLocal(osVar.N), "50_50", osVar.f39795n, osVar.getMessagesController().getUser(Long.valueOf(osVar.E)));
            if (osVar.P == 2) {
                osVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(osVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = osVar.E;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = osVar.getUserConfig().getNewMessageId();
                tL_messageService.f20866id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = osVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = osVar.E;
                tL_messageService.date = osVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z4;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(osVar.currentAccount, tL_messageService, false, false);
                osVar.W = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(osVar.currentAccount).updateInterfaceWithMessages(osVar.E, arrayList2, 0);
                osVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, y40Var);
            }
        } else {
            TLRPC.User user = osVar.getMessagesController().getUser(Long.valueOf(osVar.E));
            if (osVar.W == null && user != null) {
                if (inputFile2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                user.flags |= 32;
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.personal = true;
                tL_userProfilePhoto.photo_id = 0L;
                tL_userProfilePhoto.has_video = z10;
                if (photoSize != null) {
                    tL_userProfilePhoto.photo_small = photoSize.location;
                }
                if (photoSize2 != null) {
                    tL_userProfilePhoto.photo_big = photoSize2.location;
                }
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(user);
                osVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            osVar.d0(osVar.N, photoSize2.location, inputFile, inputFile2, videoSize, d, osVar.P);
            osVar.e0(false, true);
        }
        osVar.g0();
    }

    public static void Y(os osVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (osVar.W == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User user = osVar.getMessagesController().getUser(Long.valueOf(osVar.E));
                TLRPC.UserFull userFull = MessagesController.getInstance(osVar.currentAccount).getUserFull(osVar.E);
                if (userFull != null) {
                    userFull.personal_photo = tL_photos_photo.photo;
                    userFull.flags |= 2097152;
                    osVar.getMessagesStorage().updateUserInfo(userFull, true);
                }
                if (user != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
                    if (closestPhotoSizeWithSize != null && fileLocation != null) {
                        FileLoader.getInstance(osVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(osVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileLocation.volume_id);
                        sb.append("_");
                        String m9 = android.support.v4.media.a.m(fileLocation.local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUser(osVar.currentAccount, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                        FileLoader.getInstance(osVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(osVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    lf.k0.a(tL_photos_photo.photo, user, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    osVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    osVar.getMessagesController().getDialogPhotos(osVar.E).addPhotoAtStart(tL_photos_photo.photo);
                    osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    osVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                    if (osVar.getParentActivity() != null) {
                        if (i10 == 2) {
                            org.telegram.ui.Components.qc.a0(osVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.qc.a0(osVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        }
                    }
                }
                osVar.N = null;
                osVar.g0();
            }
        }
    }

    public static void Z(os osVar) {
        if (osVar.W != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(osVar.W.getId()));
            NotificationCenter.getInstance(osVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.f39797s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.f39797s;
        if (radialProgressView == null) {
            return;
        }
        this.P = this.O;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void P() {
        AndroidUtilities.runOnUIThread(new gs(this, 1));
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z4, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                os.X(os.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z4);
            }
        });
    }

    public final String c0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.E));
        if (user != null && !TextUtils.isEmpty(user.phone)) {
            return user.phone;
        }
        return this.I;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        float f11;
        int i15;
        float f12;
        float f13;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i16 = org.telegram.ui.ActionBar.k6.f21700f8;
        org.telegram.ui.ActionBar.g6 g6Var = this.f39796r;
        kVar.B(org.telegram.ui.ActionBar.k6.v0(i16, g6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21983v8, g6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.F) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ks(this));
        this.f39790a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i17 = org.telegram.ui.ActionBar.k6.f21607a7;
        frameLayout.setBackgroundColor(getThemedColor(i17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S = frameLayout2;
        int i18 = org.telegram.ui.ActionBar.k6.f21661d6;
        frameLayout2.setBackgroundColor(getThemedColor(i18));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.f39793e = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        FrameLayout frameLayout3 = this.S;
        org.telegram.ui.Components.p9 p9Var2 = this.f39793e;
        int i19 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(p9Var2, k7.c6.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fg.i0 i0Var = new fg.i0(this, context, paint, 7);
        this.v = i0Var;
        FrameLayout frameLayout4 = this.S;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(i0Var, k7.c6.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39797s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f39797s.setProgressColor(-1);
        this.f39797s.setNoProgress(false);
        FrameLayout frameLayout5 = this.S;
        RadialProgressView radialProgressView2 = this.f39797s;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, k7.c6.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f39794f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var));
        this.f39794f.setTextSize(1, 18.0f);
        this.f39794f.setLines(1);
        this.f39794f.setMaxLines(1);
        this.f39794f.setSingleLine(true);
        TextView textView2 = this.f39794f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f39794f;
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f39794f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout6 = this.S;
        TextView textView4 = this.f39794f;
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 94.0f;
        }
        if (z4) {
            f11 = 94.0f;
        } else {
            f11 = 0.0f;
        }
        TextView h = yh.h(frameLayout6, textView4, k7.c6.d(-2, -2.0f, i20, f10, 25.66f, f11, 0.0f), context);
        this.h = h;
        h.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A6, g6Var));
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
        FrameLayout frameLayout7 = this.S;
        TextView textView6 = this.h;
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i19 = 5;
        }
        int i21 = i19 | 48;
        if (z10) {
            f12 = 0.0f;
        } else {
            f12 = 94.0f;
        }
        if (z10) {
            f13 = 94.0f;
        } else {
            f13 = 0.0f;
        }
        frameLayout7.addView(textView6, k7.c6.d(-2, -2.0f, i21, f12, 49.66f, f13, 0.0f));
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.f39796r);
        this.f39791b = i3Var;
        i3Var.f22957b.setImeOptions(5);
        this.f39791b.setBackgroundColor(getThemedColor(i18));
        this.f39791b.setDivider(true);
        this.f39791b.f22957b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final os f37775b;

            {
                this.f37775b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            os osVar = this.f37775b;
                            osVar.f39792c.f22957b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = osVar.f39792c.f22957b;
                            g3Var.setSelection(g3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        os osVar2 = this.f37775b;
                        if (i22 == 6) {
                            osVar2.f39790a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            osVar2.d.f22957b.requestFocus();
                            osVar2.d.f22957b.setSelection(osVar2.f39792c.f22957b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f37775b.f39790a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f39791b.f22957b.setOnFocusChangeListener(new Object());
        this.f39791b.setText(this.J);
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.f39796r);
        this.f39792c = i3Var2;
        i3Var2.f22957b.setImeOptions(5);
        this.f39792c.setBackgroundColor(getThemedColor(i18));
        this.f39792c.f22957b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final os f37775b;

            {
                this.f37775b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            os osVar = this.f37775b;
                            osVar.f39792c.f22957b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = osVar.f39792c.f22957b;
                            g3Var.setSelection(g3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        os osVar2 = this.f37775b;
                        if (i22 == 6) {
                            osVar2.f39790a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            osVar2.d.f22957b.requestFocus();
                            osVar2.d.f22957b.setSelection(osVar2.f39792c.f22957b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f37775b.f39790a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f39792c.setText(this.K);
        org.telegram.ui.Cells.i3 i3Var3 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.f39796r);
        this.d = i3Var3;
        i3Var3.f22957b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21722gc));
        this.d.f22957b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i18));
        this.d.f22957b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final os f37775b;

            {
                this.f37775b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            os osVar = this.f37775b;
                            osVar.f39792c.f22957b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = osVar.f39792c.f22957b;
                            g3Var.setSelection(g3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        os osVar2 = this.f37775b;
                        if (i22 == 6) {
                            osVar2.f39790a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            osVar2.d.f22957b.requestFocus();
                            osVar2.d.f22957b.setSelection(osVar2.f39792c.f22957b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f37775b.f39790a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (!this.F) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.E));
            org.telegram.ui.Cells.o8 o8Var = new org.telegram.ui.Cells.o8(context, g6Var);
            this.f39799x = o8Var;
            o8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.f39799x.setBackground(org.telegram.ui.ActionBar.k6.J0(g6Var, true));
            org.telegram.ui.Cells.o8 o8Var2 = this.f39799x;
            int i22 = org.telegram.ui.ActionBar.k6.f21981v6;
            int i23 = org.telegram.ui.ActionBar.k6.f21963u6;
            o8Var2.e(i22, i23);
            final org.telegram.ui.Components.hj0 hj0Var = new org.telegram.ui.Components.hj0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f39799x.f23315e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f39799x.f23315e.setAnimation(hj0Var);
            this.f39799x.setOnClickListener(new View.OnClickListener(this) {
                public final os f38116b;

                {
                    this.f38116b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z11;
                    switch (r4) {
                        case 0:
                            final os osVar = this.f38116b;
                            boolean z12 = true;
                            osVar.O = 1;
                            org.telegram.ui.Components.y40 y40Var = osVar.M;
                            TLRPC.User user2 = user;
                            y40Var.I = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z12 = false;
                            }
                            ag.f fVar = new ag.f(23);
                            final org.telegram.ui.Components.hj0 hj0Var2 = hj0Var;
                            y40Var.o(z12, fVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            os osVar2 = osVar;
                                            boolean h9 = osVar2.M.h();
                                            org.telegram.ui.Components.hj0 hj0Var3 = hj0Var2;
                                            if (!h9) {
                                                hj0Var3.N(86);
                                                osVar2.f39800y.f23315e.d();
                                                return;
                                            }
                                            hj0Var3.L(0, false, false);
                                            return;
                                        default:
                                            os osVar3 = osVar;
                                            boolean h10 = osVar3.M.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var2;
                                            if (!h10) {
                                                hj0Var4.N(85);
                                                osVar3.f39799x.f23315e.d();
                                                return;
                                            }
                                            hj0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            hj0Var2.K(0);
                            hj0Var2.N(43);
                            osVar.f39799x.f23315e.d();
                            return;
                        default:
                            final os osVar2 = this.f38116b;
                            osVar2.O = 2;
                            org.telegram.ui.Components.y40 y40Var2 = osVar2.M;
                            TLRPC.User user3 = user;
                            y40Var2.I = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ag.f fVar2 = new ag.f(23);
                            final org.telegram.ui.Components.hj0 hj0Var3 = hj0Var;
                            y40Var2.o(z11, fVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            os osVar22 = osVar2;
                                            boolean h9 = osVar22.M.h();
                                            org.telegram.ui.Components.hj0 hj0Var32 = hj0Var3;
                                            if (!h9) {
                                                hj0Var32.N(86);
                                                osVar22.f39800y.f23315e.d();
                                                return;
                                            }
                                            hj0Var32.L(0, false, false);
                                            return;
                                        default:
                                            os osVar3 = osVar2;
                                            boolean h10 = osVar3.M.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var3;
                                            if (!h10) {
                                                hj0Var4.N(85);
                                                osVar3.f39799x.f23315e.d();
                                                return;
                                            }
                                            hj0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            hj0Var3.K(0);
                            hj0Var3.N(43);
                            osVar2.f39800y.f23315e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.o8 o8Var3 = new org.telegram.ui.Cells.o8(context, g6Var);
            this.f39800y = o8Var3;
            o8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.f39800y.setBackground(org.telegram.ui.ActionBar.k6.J0(g6Var, true));
            this.f39800y.e(i22, i23);
            final org.telegram.ui.Components.hj0 hj0Var2 = new org.telegram.ui.Components.hj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f39800y.f23315e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f39800y.f23315e.setAnimation(hj0Var2);
            this.f39800y.setOnClickListener(new View.OnClickListener(this) {
                public final os f38116b;

                {
                    this.f38116b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z11;
                    switch (r4) {
                        case 0:
                            final os osVar = this.f38116b;
                            boolean z12 = true;
                            osVar.O = 1;
                            org.telegram.ui.Components.y40 y40Var = osVar.M;
                            TLRPC.User user2 = user;
                            y40Var.I = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z12 = false;
                            }
                            ag.f fVar = new ag.f(23);
                            final org.telegram.ui.Components.hj0 hj0Var22 = hj0Var2;
                            y40Var.o(z12, fVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            os osVar22 = osVar;
                                            boolean h9 = osVar22.M.h();
                                            org.telegram.ui.Components.hj0 hj0Var32 = hj0Var22;
                                            if (!h9) {
                                                hj0Var32.N(86);
                                                osVar22.f39800y.f23315e.d();
                                                return;
                                            }
                                            hj0Var32.L(0, false, false);
                                            return;
                                        default:
                                            os osVar3 = osVar;
                                            boolean h10 = osVar3.M.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var22;
                                            if (!h10) {
                                                hj0Var4.N(85);
                                                osVar3.f39799x.f23315e.d();
                                                return;
                                            }
                                            hj0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            hj0Var22.K(0);
                            hj0Var22.N(43);
                            osVar.f39799x.f23315e.d();
                            return;
                        default:
                            final os osVar2 = this.f38116b;
                            osVar2.O = 2;
                            org.telegram.ui.Components.y40 y40Var2 = osVar2.M;
                            TLRPC.User user3 = user;
                            y40Var2.I = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            if (userProfilePhoto2 == null) {
                                fileLocation2 = null;
                            } else {
                                fileLocation2 = userProfilePhoto2.photo_small;
                            }
                            if (fileLocation2 != null) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            ag.f fVar2 = new ag.f(23);
                            final org.telegram.ui.Components.hj0 hj0Var3 = hj0Var2;
                            y40Var2.o(z11, fVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            os osVar22 = osVar2;
                                            boolean h9 = osVar22.M.h();
                                            org.telegram.ui.Components.hj0 hj0Var32 = hj0Var3;
                                            if (!h9) {
                                                hj0Var32.N(86);
                                                osVar22.f39800y.f23315e.d();
                                                return;
                                            }
                                            hj0Var32.L(0, false, false);
                                            return;
                                        default:
                                            os osVar3 = osVar2;
                                            boolean h10 = osVar3.M.h();
                                            org.telegram.ui.Components.hj0 hj0Var4 = hj0Var3;
                                            if (!h10) {
                                                hj0Var4.N(85);
                                                osVar3.f39799x.f23315e.d();
                                                return;
                                            }
                                            hj0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            hj0Var3.K(0);
                            hj0Var3.N(43);
                            osVar2.f39800y.f23315e.d();
                            return;
                    }
                }
            });
            this.R = new org.telegram.ui.Components.p9(context);
            this.B = new ms(this, context, g6Var);
            if (this.f39795n == null) {
                this.f39795n = new org.telegram.ui.Components.z8(0, user);
            }
            this.R.e(user.photo, this.f39795n);
            this.B.addView(this.R, k7.c6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.B.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.B.getImageView().setVisibility(0);
            this.B.setBackground(org.telegram.ui.ActionBar.k6.J0(g6Var, true));
            this.B.e(i22, i23);
            this.B.setOnClickListener(new b0(this, context, user, 10));
            org.telegram.ui.Cells.o8 o8Var4 = new org.telegram.ui.Cells.o8(context, g6Var);
            this.C = o8Var4;
            o8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.C.setBackground(org.telegram.ui.ActionBar.k6.J0(g6Var, true));
            this.C.e(i22, i23);
            this.C.setNeedDivider(true);
            this.C.f23315e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.C.setOnClickListener(new org.telegram.ui.Components.rx0(12, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.E);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.Q = photo;
                if (photo == null) {
                    this.Q = userFull.fallback_photo;
                }
            }
            g0();
        }
        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(this, new d5(this, 7), new a1(this, 26), null);
        this.T = h61Var;
        h61Var.o1();
        this.T.setOnScrollListener(new kh.l(5, this, frameLayout));
        this.T.setBackgroundColor(getThemedColor(i17));
        frameLayout.addView(this.T, k7.c6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.T);
        if (this.F && this.H) {
            this.U = true;
        }
        this.T.V2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.E);
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new lf.i0(this, fileLocation, inputFile2, fileLocation2, i10, 9));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_STATUS) != 0) {
                f0();
            }
        } else if (i10 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.D) {
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
                this.Q = (TLRPC.Photo) arrayList.get(0);
                g0();
            }
        }
    }

    @Override
    public final boolean e() {
        if (this.P != 1) {
            return true;
        }
        return false;
    }

    public final void e0(boolean z4, boolean z10) {
        if (this.f39797s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39798w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f39798w = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f39798w = animatorSet2;
            if (z4) {
                this.f39797s.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39798w;
                RadialProgressView radialProgressView = this.f39797s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f39797s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f39798w.setDuration(180L);
            this.f39798w.addListener(new org.telegram.ui.Components.x20(16, this, z4));
            this.f39798w.start();
        } else if (z4) {
            this.f39797s.setAlpha(1.0f);
            this.f39797s.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f39797s.setAlpha(0.0f);
            this.f39797s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f39794f != null && (user = getMessagesController().getUser(Long.valueOf(this.E))) != null) {
            if (TextUtils.isEmpty(c0())) {
                this.f39794f.setText(LocaleController.getString(R.string.MobileHidden));
            } else {
                TextView textView = this.f39794f;
                se.b c3 = se.b.c();
                textView.setText(c3.b("+" + c0()));
            }
            this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
            if (this.N == null) {
                org.telegram.ui.Components.p9 p9Var = this.f39793e;
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(0, user);
                this.f39795n = z8Var;
                p9Var.e(user, z8Var);
            }
        }
    }

    public final void g0() {
        TLRPC.Photo photo;
        if (this.F) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.E));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.Q) != null) {
            this.R.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.Q), "50_50", this.f39795n, null);
        }
        if (this.f39795n == null) {
            this.f39795n = new org.telegram.ui.Components.z8(0, user);
        }
        TLRPC.FileLocation fileLocation = this.N;
        if (fileLocation == null) {
            this.f39793e.e(user, this.f39795n);
        } else {
            this.f39793e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.f39795n, getMessagesController().getUser(Long.valueOf(this.E)));
        }
    }

    @Override
    public final qu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f39796r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        TextView textView = this.f39794f;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39791b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.i3 i3Var = this.f39791b;
        int i11 = org.telegram.ui.ActionBar.k6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(i3Var, 8388608, null, null, null, null, i11));
        org.telegram.ui.Cells.i3 i3Var2 = this.f39791b;
        int i12 = org.telegram.ui.ActionBar.k6.f21787k6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(i3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.i3 i3Var3 = this.f39791b;
        int i13 = org.telegram.ui.ActionBar.k6.f21805l6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(i3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39792c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39792c, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39792c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f39792c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, org.telegram.ui.ActionBar.k6.f21908r0, fVar, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        TLRPC.User user;
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.E = getArguments().getLong("user_id", 0L);
        this.I = getArguments().getString("phone");
        this.J = getArguments().getString("first_name_card");
        this.K = getArguments().getString("last_name_card");
        this.F = getArguments().getBoolean("addContact", false);
        this.G = getArguments().getBoolean("focus_notes", false);
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        this.H = notificationsSettings.getBoolean("dialog_bar_exception" + this.E, false);
        if (this.E != 0) {
            user = getMessagesController().getUser(Long.valueOf(this.E));
        } else {
            user = null;
        }
        org.telegram.ui.Components.y40 y40Var = this.M;
        if (y40Var != null) {
            y40Var.f33309a = this;
            y40Var.f33310b = this;
        }
        this.D = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.E);
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
        org.telegram.ui.Components.y40 y40Var = this.M;
        if (y40Var != null) {
            y40Var.e();
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        this.M.j();
    }

    @Override
    public final void onResume() {
        super.onResume();
        f0();
        this.M.l();
    }

    @Override
    public final boolean u() {
        return false;
    }

    public os(Bundle bundle, org.telegram.ui.ActionBar.g6 g6Var) {
        super(bundle);
        this.U = false;
        this.V = true;
        this.f39796r = g6Var;
        this.M = new org.telegram.ui.Components.y40(0, true, true);
    }
}

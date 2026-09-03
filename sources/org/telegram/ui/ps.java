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
public final class ps extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.w40 {
    public ns B;
    public org.telegram.ui.Cells.n8 C;
    public MessagesController.DialogPhotos D;
    public long E;
    public boolean F;
    public boolean G;
    public boolean H;
    public String I;
    public String J;
    public String K;
    public os L;
    public final org.telegram.ui.Components.x40 M;
    public TLRPC.FileLocation N;
    public int O;
    public int P;
    public TLRPC.Photo Q;
    public org.telegram.ui.Components.p9 R;
    public FrameLayout S;
    public org.telegram.ui.Components.g61 T;
    public boolean U;
    public boolean V;
    public MessageObject W;
    public org.telegram.ui.ActionBar.w0 f37219a;
    public org.telegram.ui.Cells.h3 f37220b;
    public org.telegram.ui.Cells.h3 f37221c;
    public org.telegram.ui.Cells.h3 d;
    public org.telegram.ui.Components.p9 e;
    public TextView f37222f;
    public TextView h;
    public org.telegram.ui.Components.z8 f37223n;
    public final org.telegram.ui.ActionBar.f6 f37224r;
    public RadialProgressView f37225s;
    public eg.i0 v;
    public AnimatorSet f37226w;
    public org.telegram.ui.Cells.n8 f37227x;
    public org.telegram.ui.Cells.n8 f37228y;

    public ps(Bundle bundle) {
        super(bundle);
        this.U = false;
        this.V = true;
        this.M = new org.telegram.ui.Components.x40(0, true, true);
    }

    public static void U(ps psVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f19301id = psVar.getMessagesController().getInputUser(psVar.E);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(psVar.currentAccount).sendRequest(tL_users_suggestBirthday, new o(psVar, 5));
    }

    public static void V(ps psVar, TLRPC.User user) {
        psVar.N = null;
        psVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(psVar.currentAccount).getUserFull(psVar.E);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            psVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = psVar.Q;
        if (photo != null) {
            user2.photo.photo_id = photo.f19183id;
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
        psVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        psVar.g0();
        psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void W(ps psVar) {
        TLRPC.User user;
        if (psVar.e != null && (user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E))) != null) {
            psVar.f37223n.m(psVar.currentAccount, user);
            psVar.e.invalidate();
        }
    }

    public static void X(ps psVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z4) {
        boolean z10;
        org.telegram.ui.Components.x40 x40Var = psVar.M;
        if (x40Var.Q) {
            return;
        }
        int i10 = psVar.P;
        if (i10 == 2) {
            psVar.N = photoSize.location;
        } else if (i10 == 1 && psVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.e5 parentLayout = psVar.getParentLayout();
            org.telegram.ui.ActionBar.p2 lastFragment = psVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(size);
                if (p2Var instanceof zn) {
                    zn znVar = (zn) p2Var;
                    org.telegram.ui.ActionBar.p2 p2Var2 = lastFragment;
                    if (znVar.a() == psVar.E && znVar.O3 == 0) {
                        znVar.Wa(false, null);
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
            psVar.e.h(ImageLocation.getForLocal(psVar.N), "50_50", psVar.f37223n, psVar.getMessagesController().getUser(Long.valueOf(psVar.E)));
            if (psVar.P == 2) {
                psVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(psVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = psVar.E;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = psVar.getUserConfig().getNewMessageId();
                tL_messageService.f19180id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = psVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = psVar.E;
                tL_messageService.date = psVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z4;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(psVar.currentAccount, tL_messageService, false, false);
                psVar.W = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(psVar.currentAccount).updateInterfaceWithMessages(psVar.E, arrayList2, 0);
                psVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, x40Var);
            }
        } else {
            TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
            if (psVar.W == null && user != null) {
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
                psVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            psVar.d0(psVar.N, photoSize2.location, inputFile, inputFile2, videoSize, d, psVar.P);
            psVar.e0(false, true);
        }
        psVar.g0();
    }

    public static void Y(ps psVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (psVar.W == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User user = psVar.getMessagesController().getUser(Long.valueOf(psVar.E));
                TLRPC.UserFull userFull = MessagesController.getInstance(psVar.currentAccount).getUserFull(psVar.E);
                if (userFull != null) {
                    userFull.personal_photo = tL_photos_photo.photo;
                    userFull.flags |= 2097152;
                    psVar.getMessagesStorage().updateUserInfo(userFull, true);
                }
                if (user != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
                    if (closestPhotoSizeWithSize != null && fileLocation != null) {
                        FileLoader.getInstance(psVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(psVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileLocation.volume_id);
                        sb.append("_");
                        String m9 = android.support.v4.media.a.m(fileLocation.local_id, "@50_50", sb);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(closestPhotoSizeWithSize.location.volume_id);
                        sb2.append("_");
                        ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForUser(psVar.currentAccount, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                        FileLoader.getInstance(psVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(psVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    kf.l0.a(tL_photos_photo.photo, user, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    psVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    psVar.getMessagesController().getDialogPhotos(psVar.E).addPhotoAtStart(tL_photos_photo.photo);
                    psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    psVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                    if (psVar.getParentActivity() != null) {
                        if (i10 == 2) {
                            org.telegram.ui.Components.qc.a0(psVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.qc.a0(psVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        }
                    }
                }
                psVar.N = null;
                psVar.g0();
            }
        }
    }

    public static void Z(ps psVar) {
        if (psVar.W != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(psVar.W.getId()));
            NotificationCenter.getInstance(psVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void D(float f10) {
        RadialProgressView radialProgressView = this.f37225s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        RadialProgressView radialProgressView = this.f37225s;
        if (radialProgressView == null) {
            return;
        }
        this.P = this.O;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void P() {
        AndroidUtilities.runOnUIThread(new hs(this, 1));
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z4, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ps.X(ps.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z4);
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
        int i16 = org.telegram.ui.ActionBar.j6.f19919f8;
        org.telegram.ui.ActionBar.f6 f6Var = this.f37224r;
        kVar.B(org.telegram.ui.ActionBar.j6.v0(i16, f6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20202v8, f6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.F) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ls(this));
        this.f37219a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i17 = org.telegram.ui.ActionBar.j6.f19827a7;
        frameLayout.setBackgroundColor(getThemedColor(i17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.S = frameLayout2;
        int i18 = org.telegram.ui.ActionBar.j6.f19881d6;
        frameLayout2.setBackgroundColor(getThemedColor(i18));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        this.e = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        FrameLayout frameLayout3 = this.S;
        org.telegram.ui.Components.p9 p9Var2 = this.e;
        int i19 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(p9Var2, k7.b6.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        eg.i0 i0Var = new eg.i0(this, context, paint, 7);
        this.v = i0Var;
        FrameLayout frameLayout4 = this.S;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(i0Var, k7.b6.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f37225s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f37225s.setProgressColor(-1);
        this.f37225s.setNoProgress(false);
        FrameLayout frameLayout5 = this.S;
        RadialProgressView radialProgressView2 = this.f37225s;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, k7.b6.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f37222f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        this.f37222f.setTextSize(1, 18.0f);
        this.f37222f.setLines(1);
        this.f37222f.setMaxLines(1);
        this.f37222f.setSingleLine(true);
        TextView textView2 = this.f37222f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f37222f;
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f37222f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout6 = this.S;
        TextView textView4 = this.f37222f;
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
        TextView h = ai.h(frameLayout6, textView4, k7.b6.d(-2, -2.0f, i20, f10, 25.66f, f11, 0.0f), context);
        this.h = h;
        h.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A6, f6Var));
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
        frameLayout7.addView(textView6, k7.b6.d(-2, -2.0f, i21, f12, 49.66f, f13, 0.0f));
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.f37224r);
        this.f37220b = h3Var;
        h3Var.f21132b.setImeOptions(5);
        this.f37220b.setBackgroundColor(getThemedColor(i18));
        this.f37220b.setDivider(true);
        this.f37220b.f21132b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ps f35361b;

            {
                this.f35361b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ps psVar = this.f35361b;
                            psVar.f37221c.f21132b.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = psVar.f37221c.f21132b;
                            f3Var.setSelection(f3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ps psVar2 = this.f35361b;
                        if (i22 == 6) {
                            psVar2.f37219a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            psVar2.d.f21132b.requestFocus();
                            psVar2.d.f21132b.setSelection(psVar2.f37221c.f21132b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f35361b.f37219a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f37220b.f21132b.setOnFocusChangeListener(new Object());
        this.f37220b.setText(this.J);
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.f37224r);
        this.f37221c = h3Var2;
        h3Var2.f21132b.setImeOptions(5);
        this.f37221c.setBackgroundColor(getThemedColor(i18));
        this.f37221c.f21132b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ps f35361b;

            {
                this.f35361b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ps psVar = this.f35361b;
                            psVar.f37221c.f21132b.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = psVar.f37221c.f21132b;
                            f3Var.setSelection(f3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ps psVar2 = this.f35361b;
                        if (i22 == 6) {
                            psVar2.f37219a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            psVar2.d.f21132b.requestFocus();
                            psVar2.d.f21132b.setSelection(psVar2.f37221c.f21132b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f35361b.f37219a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f37221c.setText(this.K);
        org.telegram.ui.Cells.h3 h3Var3 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.f37224r);
        this.d = h3Var3;
        h3Var3.f21132b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19941gc));
        this.d.f21132b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i18));
        this.d.f21132b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ps f35361b;

            {
                this.f35361b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ps psVar = this.f35361b;
                            psVar.f37221c.f21132b.requestFocus();
                            org.telegram.ui.Cells.f3 f3Var = psVar.f37221c.f21132b;
                            f3Var.setSelection(f3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ps psVar2 = this.f35361b;
                        if (i22 == 6) {
                            psVar2.f37219a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            psVar2.d.f21132b.requestFocus();
                            psVar2.d.f21132b.setSelection(psVar2.f37221c.f21132b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f35361b.f37219a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (!this.F) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.E));
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context, f6Var);
            this.f37227x = n8Var;
            n8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.f37227x.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            org.telegram.ui.Cells.n8 n8Var2 = this.f37227x;
            int i22 = org.telegram.ui.ActionBar.j6.f20200v6;
            int i23 = org.telegram.ui.ActionBar.j6.f20182u6;
            n8Var2.e(i22, i23);
            final org.telegram.ui.Components.gj0 gj0Var = new org.telegram.ui.Components.gj0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f37227x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f37227x.e.setAnimation(gj0Var);
            this.f37227x.setOnClickListener(new View.OnClickListener(this) {
                public final ps f35580b;

                {
                    this.f35580b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z11;
                    switch (r4) {
                        case 0:
                            final ps psVar = this.f35580b;
                            boolean z12 = true;
                            psVar.O = 1;
                            org.telegram.ui.Components.x40 x40Var = psVar.M;
                            TLRPC.User user2 = user;
                            x40Var.I = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z12 = false;
                            }
                            cg.n0 n0Var = new cg.n0(21);
                            final org.telegram.ui.Components.gj0 gj0Var2 = gj0Var;
                            x40Var.o(z12, n0Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ps psVar2 = psVar;
                                            boolean h9 = psVar2.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var3 = gj0Var2;
                                            if (!h9) {
                                                gj0Var3.N(86);
                                                psVar2.f37228y.e.d();
                                                return;
                                            }
                                            gj0Var3.L(0, false, false);
                                            return;
                                        default:
                                            ps psVar3 = psVar;
                                            boolean h10 = psVar3.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var4 = gj0Var2;
                                            if (!h10) {
                                                gj0Var4.N(85);
                                                psVar3.f37227x.e.d();
                                                return;
                                            }
                                            gj0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            gj0Var2.K(0);
                            gj0Var2.N(43);
                            psVar.f37227x.e.d();
                            return;
                        default:
                            final ps psVar2 = this.f35580b;
                            psVar2.O = 2;
                            org.telegram.ui.Components.x40 x40Var2 = psVar2.M;
                            TLRPC.User user3 = user;
                            x40Var2.I = user3;
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
                            cg.n0 n0Var2 = new cg.n0(21);
                            final org.telegram.ui.Components.gj0 gj0Var3 = gj0Var;
                            x40Var2.o(z11, n0Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ps psVar22 = psVar2;
                                            boolean h9 = psVar22.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var32 = gj0Var3;
                                            if (!h9) {
                                                gj0Var32.N(86);
                                                psVar22.f37228y.e.d();
                                                return;
                                            }
                                            gj0Var32.L(0, false, false);
                                            return;
                                        default:
                                            ps psVar3 = psVar2;
                                            boolean h10 = psVar3.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var4 = gj0Var3;
                                            if (!h10) {
                                                gj0Var4.N(85);
                                                psVar3.f37227x.e.d();
                                                return;
                                            }
                                            gj0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            gj0Var3.K(0);
                            gj0Var3.N(43);
                            psVar2.f37228y.e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.n8 n8Var3 = new org.telegram.ui.Cells.n8(context, f6Var);
            this.f37228y = n8Var3;
            n8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.f37228y.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.f37228y.e(i22, i23);
            final org.telegram.ui.Components.gj0 gj0Var2 = new org.telegram.ui.Components.gj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f37228y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f37228y.e.setAnimation(gj0Var2);
            this.f37228y.setOnClickListener(new View.OnClickListener(this) {
                public final ps f35580b;

                {
                    this.f35580b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z11;
                    switch (r4) {
                        case 0:
                            final ps psVar = this.f35580b;
                            boolean z12 = true;
                            psVar.O = 1;
                            org.telegram.ui.Components.x40 x40Var = psVar.M;
                            TLRPC.User user2 = user;
                            x40Var.I = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z12 = false;
                            }
                            cg.n0 n0Var = new cg.n0(21);
                            final org.telegram.ui.Components.gj0 gj0Var22 = gj0Var2;
                            x40Var.o(z12, n0Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ps psVar22 = psVar;
                                            boolean h9 = psVar22.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var32 = gj0Var22;
                                            if (!h9) {
                                                gj0Var32.N(86);
                                                psVar22.f37228y.e.d();
                                                return;
                                            }
                                            gj0Var32.L(0, false, false);
                                            return;
                                        default:
                                            ps psVar3 = psVar;
                                            boolean h10 = psVar3.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var4 = gj0Var22;
                                            if (!h10) {
                                                gj0Var4.N(85);
                                                psVar3.f37227x.e.d();
                                                return;
                                            }
                                            gj0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            gj0Var22.K(0);
                            gj0Var22.N(43);
                            psVar.f37227x.e.d();
                            return;
                        default:
                            final ps psVar2 = this.f35580b;
                            psVar2.O = 2;
                            org.telegram.ui.Components.x40 x40Var2 = psVar2.M;
                            TLRPC.User user3 = user;
                            x40Var2.I = user3;
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
                            cg.n0 n0Var2 = new cg.n0(21);
                            final org.telegram.ui.Components.gj0 gj0Var3 = gj0Var2;
                            x40Var2.o(z11, n0Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ps psVar22 = psVar2;
                                            boolean h9 = psVar22.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var32 = gj0Var3;
                                            if (!h9) {
                                                gj0Var32.N(86);
                                                psVar22.f37228y.e.d();
                                                return;
                                            }
                                            gj0Var32.L(0, false, false);
                                            return;
                                        default:
                                            ps psVar3 = psVar2;
                                            boolean h10 = psVar3.M.h();
                                            org.telegram.ui.Components.gj0 gj0Var4 = gj0Var3;
                                            if (!h10) {
                                                gj0Var4.N(85);
                                                psVar3.f37227x.e.d();
                                                return;
                                            }
                                            gj0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            gj0Var3.K(0);
                            gj0Var3.N(43);
                            psVar2.f37228y.e.d();
                            return;
                    }
                }
            });
            this.R = new org.telegram.ui.Components.p9(context);
            this.B = new ns(this, context, f6Var);
            if (this.f37223n == null) {
                this.f37223n = new org.telegram.ui.Components.z8(0, user);
            }
            this.R.e(user.photo, this.f37223n);
            this.B.addView(this.R, k7.b6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.B.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.B.getImageView().setVisibility(0);
            this.B.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.B.e(i22, i23);
            this.B.setOnClickListener(new c0(this, context, user, 10));
            org.telegram.ui.Cells.n8 n8Var4 = new org.telegram.ui.Cells.n8(context, f6Var);
            this.C = n8Var4;
            n8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.C.setBackground(org.telegram.ui.ActionBar.j6.J0(f6Var, true));
            this.C.e(i22, i23);
            this.C.setNeedDivider(true);
            this.C.e.setTranslationX(AndroidUtilities.dp(4.0f));
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
        org.telegram.ui.Components.g61 g61Var = new org.telegram.ui.Components.g61(this, new f5(this, 7), new c1(this, 26), null);
        this.T = g61Var;
        g61Var.o1();
        this.T.setOnScrollListener(new jh.l(5, this, frameLayout));
        this.T.setBackgroundColor(getThemedColor(i17));
        frameLayout.addView(this.T, k7.b6.e(-1, -1, 119));
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new kf.i0(this, fileLocation, inputFile2, fileLocation2, i10, 9));
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
        if (this.f37225s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f37226w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f37226w = null;
        }
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f37226w = animatorSet2;
            if (z4) {
                this.f37225s.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f37226w;
                RadialProgressView radialProgressView = this.f37225s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f37225s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f37226w.setDuration(180L);
            this.f37226w.addListener(new org.telegram.ui.Components.m00(18, this, z4));
            this.f37226w.start();
        } else if (z4) {
            this.f37225s.setAlpha(1.0f);
            this.f37225s.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f37225s.setAlpha(0.0f);
            this.f37225s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f37222f != null && (user = getMessagesController().getUser(Long.valueOf(this.E))) != null) {
            if (TextUtils.isEmpty(c0())) {
                this.f37222f.setText(LocaleController.getString(R.string.MobileHidden));
            } else {
                TextView textView = this.f37222f;
                se.b c3 = se.b.c();
                textView.setText(c3.b("+" + c0()));
            }
            this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
            if (this.N == null) {
                org.telegram.ui.Components.p9 p9Var = this.e;
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(0, user);
                this.f37223n = z8Var;
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
            this.R.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.Q), "50_50", this.f37223n, null);
        }
        if (this.f37223n == null) {
            this.f37223n = new org.telegram.ui.Components.z8(0, user);
        }
        TLRPC.FileLocation fileLocation = this.N;
        if (fileLocation == null) {
            this.e.e(user, this.f37223n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.f37223n, getMessagesController().getUser(Long.valueOf(this.E)));
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
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        return this.f37224r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19881d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20202v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20167t8));
        TextView textView = this.f37222f;
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37220b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.h3 h3Var = this.f37220b;
        int i11 = org.telegram.ui.ActionBar.j6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h3Var, 8388608, null, null, null, null, i11));
        org.telegram.ui.Cells.h3 h3Var2 = this.f37220b;
        int i12 = org.telegram.ui.ActionBar.j6.f20006k6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.h3 h3Var3 = this.f37220b;
        int i13 = org.telegram.ui.ActionBar.j6.f20024l6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(h3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37221c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37221c, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37221c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f37221c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f20126r0, fVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.j6.U7));
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
        org.telegram.ui.Components.x40 x40Var = this.M;
        if (x40Var != null) {
            x40Var.f30466a = this;
            x40Var.f30467b = this;
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
        org.telegram.ui.Components.x40 x40Var = this.M;
        if (x40Var != null) {
            x40Var.e();
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

    public ps(Bundle bundle, org.telegram.ui.ActionBar.f6 f6Var) {
        super(bundle);
        this.U = false;
        this.V = true;
        this.f37224r = f6Var;
        this.M = new org.telegram.ui.Components.x40(0, true, true);
    }
}

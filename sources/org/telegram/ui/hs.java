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
public final class hs extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.r40 {
    public fs A;
    public org.telegram.ui.Cells.m8 B;
    public MessagesController.DialogPhotos C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public String I;
    public String J;
    public gs K;
    public final org.telegram.ui.Components.s40 L;
    public TLRPC.FileLocation M;
    public int N;
    public int O;
    public TLRPC.Photo P;
    public org.telegram.ui.Components.t9 Q;
    public FrameLayout R;
    public org.telegram.ui.Components.u51 S;
    public boolean T;
    public boolean U;
    public MessageObject V;
    public org.telegram.ui.ActionBar.w0 f39003a;
    public org.telegram.ui.Cells.g3 f39004b;
    public org.telegram.ui.Cells.g3 f39005c;
    public org.telegram.ui.Cells.g3 d;
    public org.telegram.ui.Components.t9 f39006e;
    public TextView f39007f;
    public TextView h;
    public org.telegram.ui.Components.e9 f39008n;
    public final org.telegram.ui.ActionBar.c6 f39009r;
    public RadialProgressView f39010s;
    public cg.i0 v;
    public AnimatorSet f39011w;
    public org.telegram.ui.Cells.m8 f39012x;
    public org.telegram.ui.Cells.m8 f39013y;

    public hs(Bundle bundle) {
        super(bundle);
        this.T = false;
        this.U = true;
        this.L = new org.telegram.ui.Components.s40(0, true, true);
    }

    public static void U(hs hsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f22534id = hsVar.getMessagesController().getInputUser(hsVar.D);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(hsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new o(hsVar, 5));
    }

    public static void V(hs hsVar, TLRPC.User user) {
        hsVar.M = null;
        hsVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(hsVar.currentAccount).getUserFull(hsVar.D);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            hsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = hsVar.P;
        if (photo != null) {
            user2.photo.photo_id = photo.f22416id;
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
        hsVar.g0();
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void W(hs hsVar) {
        TLRPC.User user;
        if (hsVar.f39006e != null && (user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D))) != null) {
            hsVar.f39008n.m(hsVar.currentAccount, user);
            hsVar.f39006e.invalidate();
        }
    }

    public static void X(hs hsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.s40 s40Var = hsVar.L;
        if (s40Var.P) {
            return;
        }
        int i10 = hsVar.O;
        if (i10 == 2) {
            hsVar.M = photoSize.location;
        } else if (i10 == 1 && hsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.b5 parentLayout = hsVar.getParentLayout();
            org.telegram.ui.ActionBar.o2 lastFragment = hsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                if (o2Var instanceof tn) {
                    tn tnVar = (tn) o2Var;
                    org.telegram.ui.ActionBar.o2 o2Var2 = lastFragment;
                    if (tnVar.a() == hsVar.D && tnVar.N3 == 0) {
                        tnVar.Wa(false, null);
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
            hsVar.f39006e.h(ImageLocation.getForLocal(hsVar.M), "50_50", hsVar.f39008n, hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D)));
            if (hsVar.O == 2) {
                hsVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(hsVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = hsVar.D;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = hsVar.getUserConfig().getNewMessageId();
                tL_messageService.f22413id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = hsVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = hsVar.D;
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
                hsVar.V = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(hsVar.currentAccount).updateInterfaceWithMessages(hsVar.D, arrayList2, 0);
                hsVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, s40Var);
            }
        } else {
            TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
            if (hsVar.V == null && user != null) {
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
            hsVar.d0(hsVar.M, photoSize2.location, inputFile, inputFile2, videoSize, d, hsVar.O);
            hsVar.e0(false, true);
        }
        hsVar.g0();
    }

    public static void Y(hs hsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (hsVar.V == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User user = hsVar.getMessagesController().getUser(Long.valueOf(hsVar.D));
                TLRPC.UserFull userFull = MessagesController.getInstance(hsVar.currentAccount).getUserFull(hsVar.D);
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
                        String l10 = a4.w.l(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        ImageLoader.getInstance().replaceImageInCache(l10, a4.w.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(hsVar.currentAccount, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                        FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(hsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    jf.k0.a(tL_photos_photo.photo, user, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    hsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    hsVar.getMessagesController().getDialogPhotos(hsVar.D).addPhotoAtStart(tL_photos_photo.photo);
                    hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    hsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                    if (hsVar.getParentActivity() != null) {
                        if (i10 == 2) {
                            org.telegram.ui.Components.tc.a0(hsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.tc.a0(hsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        }
                    }
                }
                hsVar.M = null;
                hsVar.g0();
            }
        }
    }

    public static void Z(hs hsVar) {
        if (hsVar.V != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(hsVar.V.getId()));
            NotificationCenter.getInstance(hsVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void D(float f9) {
        RadialProgressView radialProgressView = this.f39010s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f9);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f39010s;
        if (radialProgressView == null) {
            return;
        }
        this.O = this.N;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void P() {
        AndroidUtilities.runOnUIThread(new zr(this, 1));
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                hs.X(hs.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    public final String c0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
        if (user != null && !TextUtils.isEmpty(user.phone)) {
            return user.phone;
        }
        return this.H;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f9;
        float f10;
        int i15;
        float f11;
        float f12;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i16 = org.telegram.ui.ActionBar.g6.f23101f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f39009r;
        lVar.B(org.telegram.ui.ActionBar.g6.v0(i16, c6Var), false);
        this.actionBar.C(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23385v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.E) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ds(this));
        this.f39003a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i17 = org.telegram.ui.ActionBar.g6.f23009a7;
        frameLayout.setBackgroundColor(getThemedColor(i17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        int i18 = org.telegram.ui.ActionBar.g6.f23062d6;
        frameLayout2.setBackgroundColor(getThemedColor(i18));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f39006e = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        FrameLayout frameLayout3 = this.R;
        org.telegram.ui.Components.t9 t9Var2 = this.f39006e;
        int i19 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        frameLayout3.addView(t9Var2, i7.f6.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        cg.i0 i0Var = new cg.i0(this, context, paint, 8);
        this.v = i0Var;
        FrameLayout frameLayout4 = this.R;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout4.addView(i0Var, i7.f6.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39010s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f39010s.setProgressColor(-1);
        this.f39010s.setNoProgress(false);
        FrameLayout frameLayout5 = this.R;
        RadialProgressView radialProgressView2 = this.f39010s;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, i7.f6.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f39007f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        this.f39007f.setTextSize(1, 18.0f);
        this.f39007f.setLines(1);
        this.f39007f.setMaxLines(1);
        this.f39007f.setSingleLine(true);
        TextView textView2 = this.f39007f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f39007f;
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f39007f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout6 = this.R;
        TextView textView4 = this.f39007f;
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 94.0f;
        }
        if (z10) {
            f10 = 94.0f;
        } else {
            f10 = 0.0f;
        }
        TextView h = th.h(frameLayout6, textView4, i7.f6.d(-2, -2.0f, i20, f9, 25.66f, f10, 0.0f), context);
        this.h = h;
        h.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
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
        FrameLayout frameLayout7 = this.R;
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
        frameLayout7.addView(textView6, i7.f6.d(-2, -2.0f, i21, f11, 49.66f, f12, 0.0f));
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.f39009r);
        this.f39004b = g3Var;
        g3Var.f24387b.setImeOptions(5);
        this.f39004b.setBackgroundColor(getThemedColor(i18));
        this.f39004b.setDivider(true);
        this.f39004b.f24387b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hs f36898b;

            {
                this.f36898b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            hs hsVar = this.f36898b;
                            hsVar.f39005c.f24387b.requestFocus();
                            org.telegram.ui.Cells.e3 e3Var = hsVar.f39005c.f24387b;
                            e3Var.setSelection(e3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        hs hsVar2 = this.f36898b;
                        if (i22 == 6) {
                            hsVar2.f39003a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            hsVar2.d.f24387b.requestFocus();
                            hsVar2.d.f24387b.setSelection(hsVar2.f39005c.f24387b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f36898b.f39003a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f39004b.f24387b.setOnFocusChangeListener(new Object());
        this.f39004b.setText(this.I);
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.f39009r);
        this.f39005c = g3Var2;
        g3Var2.f24387b.setImeOptions(5);
        this.f39005c.setBackgroundColor(getThemedColor(i18));
        this.f39005c.f24387b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hs f36898b;

            {
                this.f36898b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            hs hsVar = this.f36898b;
                            hsVar.f39005c.f24387b.requestFocus();
                            org.telegram.ui.Cells.e3 e3Var = hsVar.f39005c.f24387b;
                            e3Var.setSelection(e3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        hs hsVar2 = this.f36898b;
                        if (i22 == 6) {
                            hsVar2.f39003a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            hsVar2.d.f24387b.requestFocus();
                            hsVar2.d.f24387b.setSelection(hsVar2.f39005c.f24387b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f36898b.f39003a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f39005c.setText(this.J);
        org.telegram.ui.Cells.g3 g3Var3 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.f39009r);
        this.d = g3Var3;
        g3Var3.f24387b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.gc));
        this.d.f24387b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i18));
        this.d.f24387b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final hs f36898b;

            {
                this.f36898b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            hs hsVar = this.f36898b;
                            hsVar.f39005c.f24387b.requestFocus();
                            org.telegram.ui.Cells.e3 e3Var = hsVar.f39005c.f24387b;
                            e3Var.setSelection(e3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        hs hsVar2 = this.f36898b;
                        if (i22 == 6) {
                            hsVar2.f39003a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            hsVar2.d.f24387b.requestFocus();
                            hsVar2.d.f24387b.setSelection(hsVar2.f39005c.f24387b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f36898b.f39003a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (!this.E) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context, c6Var);
            this.f39012x = m8Var;
            m8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.f39012x.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            org.telegram.ui.Cells.m8 m8Var2 = this.f39012x;
            int i22 = org.telegram.ui.ActionBar.g6.f23383v6;
            int i23 = org.telegram.ui.ActionBar.g6.f23365u6;
            m8Var2.e(i22, i23);
            int i24 = R.raw.photo_suggest_icon;
            final org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(i24, "" + R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f39012x.f24711e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.f39012x.f24711e.setAnimation(xi0Var);
            this.f39012x.setOnClickListener(new View.OnClickListener(this) {
                public final hs f37207b;

                {
                    this.f37207b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final hs hsVar = this.f37207b;
                            boolean z13 = true;
                            hsVar.N = 1;
                            org.telegram.ui.Components.s40 s40Var = hsVar.L;
                            TLRPC.User user2 = user;
                            s40Var.H = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ag.o0 o0Var = new ag.o0(25);
                            final org.telegram.ui.Components.xi0 xi0Var2 = xi0Var;
                            s40Var.o(z13, o0Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            hs hsVar2 = hsVar;
                                            boolean h10 = hsVar2.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var3 = xi0Var2;
                                            if (!h10) {
                                                xi0Var3.N(86);
                                                hsVar2.f39013y.f24711e.d();
                                                return;
                                            }
                                            xi0Var3.L(0, false, false);
                                            return;
                                        default:
                                            hs hsVar3 = hsVar;
                                            boolean h11 = hsVar3.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var2;
                                            if (!h11) {
                                                xi0Var4.N(85);
                                                hsVar3.f39012x.f24711e.d();
                                                return;
                                            }
                                            xi0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            xi0Var2.K(0);
                            xi0Var2.N(43);
                            hsVar.f39012x.f24711e.d();
                            return;
                        default:
                            final hs hsVar2 = this.f37207b;
                            hsVar2.N = 2;
                            org.telegram.ui.Components.s40 s40Var2 = hsVar2.L;
                            TLRPC.User user3 = user;
                            s40Var2.H = user3;
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
                            ag.o0 o0Var2 = new ag.o0(25);
                            final org.telegram.ui.Components.xi0 xi0Var3 = xi0Var;
                            s40Var2.o(z12, o0Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            hs hsVar22 = hsVar2;
                                            boolean h10 = hsVar22.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var32 = xi0Var3;
                                            if (!h10) {
                                                xi0Var32.N(86);
                                                hsVar22.f39013y.f24711e.d();
                                                return;
                                            }
                                            xi0Var32.L(0, false, false);
                                            return;
                                        default:
                                            hs hsVar3 = hsVar2;
                                            boolean h11 = hsVar3.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var3;
                                            if (!h11) {
                                                xi0Var4.N(85);
                                                hsVar3.f39012x.f24711e.d();
                                                return;
                                            }
                                            xi0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            xi0Var3.K(0);
                            xi0Var3.N(43);
                            hsVar2.f39013y.f24711e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.m8 m8Var3 = new org.telegram.ui.Cells.m8(context, c6Var);
            this.f39013y = m8Var3;
            m8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.f39013y.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            this.f39013y.e(i22, i23);
            int i25 = R.raw.camera_outline;
            final org.telegram.ui.Components.xi0 xi0Var2 = new org.telegram.ui.Components.xi0(i25, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f39013y.f24711e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.f39013y.f24711e.setAnimation(xi0Var2);
            this.f39013y.setOnClickListener(new View.OnClickListener(this) {
                public final hs f37207b;

                {
                    this.f37207b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final hs hsVar = this.f37207b;
                            boolean z13 = true;
                            hsVar.N = 1;
                            org.telegram.ui.Components.s40 s40Var = hsVar.L;
                            TLRPC.User user2 = user;
                            s40Var.H = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ag.o0 o0Var = new ag.o0(25);
                            final org.telegram.ui.Components.xi0 xi0Var22 = xi0Var2;
                            s40Var.o(z13, o0Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            hs hsVar22 = hsVar;
                                            boolean h10 = hsVar22.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var32 = xi0Var22;
                                            if (!h10) {
                                                xi0Var32.N(86);
                                                hsVar22.f39013y.f24711e.d();
                                                return;
                                            }
                                            xi0Var32.L(0, false, false);
                                            return;
                                        default:
                                            hs hsVar3 = hsVar;
                                            boolean h11 = hsVar3.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var22;
                                            if (!h11) {
                                                xi0Var4.N(85);
                                                hsVar3.f39012x.f24711e.d();
                                                return;
                                            }
                                            xi0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            xi0Var22.K(0);
                            xi0Var22.N(43);
                            hsVar.f39012x.f24711e.d();
                            return;
                        default:
                            final hs hsVar2 = this.f37207b;
                            hsVar2.N = 2;
                            org.telegram.ui.Components.s40 s40Var2 = hsVar2.L;
                            TLRPC.User user3 = user;
                            s40Var2.H = user3;
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
                            ag.o0 o0Var2 = new ag.o0(25);
                            final org.telegram.ui.Components.xi0 xi0Var3 = xi0Var2;
                            s40Var2.o(z12, o0Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            hs hsVar22 = hsVar2;
                                            boolean h10 = hsVar22.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var32 = xi0Var3;
                                            if (!h10) {
                                                xi0Var32.N(86);
                                                hsVar22.f39013y.f24711e.d();
                                                return;
                                            }
                                            xi0Var32.L(0, false, false);
                                            return;
                                        default:
                                            hs hsVar3 = hsVar2;
                                            boolean h11 = hsVar3.L.h();
                                            org.telegram.ui.Components.xi0 xi0Var4 = xi0Var3;
                                            if (!h11) {
                                                xi0Var4.N(85);
                                                hsVar3.f39012x.f24711e.d();
                                                return;
                                            }
                                            xi0Var4.L(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            xi0Var3.K(0);
                            xi0Var3.N(43);
                            hsVar2.f39013y.f24711e.d();
                            return;
                    }
                }
            });
            this.Q = new org.telegram.ui.Components.t9(context);
            this.A = new fs(this, context, c6Var);
            if (this.f39008n == null) {
                this.f39008n = new org.telegram.ui.Components.e9(0, user);
            }
            this.Q.e(user.photo, this.f39008n);
            this.A.addView(this.Q, i7.f6.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.A.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.A.getImageView().setVisibility(0);
            this.A.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            this.A.e(i22, i23);
            this.A.setOnClickListener(new c0(this, context, user, 10));
            org.telegram.ui.Cells.m8 m8Var4 = new org.telegram.ui.Cells.m8(context, c6Var);
            this.B = m8Var4;
            m8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.B.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            this.B.e(i22, i23);
            this.B.setNeedDivider(true);
            this.B.f24711e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.B.setOnClickListener(new org.telegram.ui.Components.fi0(15, this, user));
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.D);
            if (userFull != null) {
                TLRPC.Photo photo = userFull.profile_photo;
                this.P = photo;
                if (photo == null) {
                    this.P = userFull.fallback_photo;
                }
            }
            g0();
        }
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(this, new b5(this, 7), new c1(this, 26), null);
        this.S = u51Var;
        u51Var.p1();
        this.S.setOnScrollListener(new hh.l(5, this, frameLayout));
        this.S.setBackgroundColor(getThemedColor(i17));
        frameLayout.addView(this.S, i7.f6.e(-1, -1, 119));
        this.actionBar.setAdaptiveBackground(this.S);
        if (this.E && this.G) {
            this.T = true;
        }
        this.S.U2.N(false);
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0(TLRPC.FileLocation fileLocation, TLRPC.FileLocation fileLocation2, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, int i10) {
        TLRPC.TL_photos_uploadContactProfilePhoto tL_photos_uploadContactProfilePhoto = new TLRPC.TL_photos_uploadContactProfilePhoto();
        tL_photos_uploadContactProfilePhoto.user_id = getMessagesController().getInputUser(this.D);
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new jf.i0(this, fileLocation, inputFile2, fileLocation2, i10, 9));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i10 == NotificationCenter.updateInterfaces) {
            int intValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (intValue & MessagesController.UPDATE_MASK_STATUS) != 0) {
                f0();
            }
        } else if (i10 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.C) {
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
                this.P = (TLRPC.Photo) arrayList.get(0);
                g0();
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

    public final void e0(boolean z10, boolean z11) {
        if (this.f39010s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39011w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f39011w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f39011w = animatorSet2;
            if (z10) {
                this.f39010s.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f39011w;
                RadialProgressView radialProgressView = this.f39010s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f39010s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f39011w.setDuration(180L);
            this.f39011w.addListener(new org.telegram.ui.Components.z9(26, this, z10));
            this.f39011w.start();
        } else if (z10) {
            this.f39010s.setAlpha(1.0f);
            this.f39010s.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f39010s.setAlpha(0.0f);
            this.f39010s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f39007f != null && (user = getMessagesController().getUser(Long.valueOf(this.D))) != null) {
            if (TextUtils.isEmpty(c0())) {
                this.f39007f.setText(LocaleController.getString(R.string.MobileHidden));
            } else {
                TextView textView = this.f39007f;
                qe.b c3 = qe.b.c();
                textView.setText(c3.b("+" + c0()));
            }
            this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
            if (this.M == null) {
                org.telegram.ui.Components.t9 t9Var = this.f39006e;
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(0, user);
                this.f39008n = e9Var;
                t9Var.e(user, e9Var);
            }
        }
    }

    public final void g0() {
        TLRPC.Photo photo;
        if (this.E) {
            return;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        if (userProfilePhoto != null && userProfilePhoto.personal && (photo = this.P) != null) {
            this.Q.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.P), "50_50", this.f39008n, null);
        }
        if (this.f39008n == null) {
            this.f39008n = new org.telegram.ui.Components.e9(0, user);
        }
        TLRPC.FileLocation fileLocation = this.M;
        if (fileLocation == null) {
            this.f39006e.e(user, this.f39008n);
        } else {
            this.f39006e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.f39008n, getMessagesController().getUser(Long.valueOf(this.D)));
        }
    }

    @Override
    public final zt0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f39009r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        TextView textView = this.f39007f;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39004b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.g3 g3Var = this.f39004b;
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g3Var, 8388608, null, null, null, null, i11));
        org.telegram.ui.Cells.g3 g3Var2 = this.f39004b;
        int i12 = org.telegram.ui.ActionBar.g6.f23189k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.g3 g3Var3 = this.f39004b;
        int i13 = org.telegram.ui.ActionBar.g6.f23206l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39005c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39005c, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39005c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39005c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23305r0, fVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.U7));
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
        org.telegram.ui.Components.s40 s40Var = this.L;
        if (s40Var != null) {
            s40Var.f32469a = this;
            s40Var.f32470b = this;
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
        org.telegram.ui.Components.s40 s40Var = this.L;
        if (s40Var != null) {
            s40Var.e();
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
        f0();
        this.L.l();
    }

    @Override
    public final boolean u() {
        return false;
    }

    public hs(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.T = false;
        this.U = true;
        this.f39009r = c6Var;
        this.L = new org.telegram.ui.Components.s40(0, true, true);
    }
}

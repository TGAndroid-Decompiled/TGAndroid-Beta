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
public final class ns extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.u40 {
    public ls E;
    public org.telegram.ui.Cells.s8 F;
    public MessagesController.DialogPhotos G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public ms O;
    public final org.telegram.ui.Components.v40 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.w9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.d61 W;
    public boolean X;
    public boolean Y;
    public MessageObject Z;
    public org.telegram.ui.ActionBar.v0 f35586a;
    public org.telegram.ui.Cells.i3 f35587b;
    public org.telegram.ui.Cells.i3 f35588c;
    public org.telegram.ui.Cells.i3 d;
    public org.telegram.ui.Components.w9 e;
    public TextView f35589f;
    public TextView h;
    public org.telegram.ui.Components.h9 f35590n;
    public final org.telegram.ui.ActionBar.d6 f35591r;
    public RadialProgressView f35592s;
    public ci.r6 v;
    public AnimatorSet f35593w;
    public org.telegram.ui.Cells.s8 f35594x;
    public org.telegram.ui.Cells.s8 f35595y;

    public ns(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.v40(0, true, true);
    }

    public static void U(ns nsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f18225id = nsVar.getMessagesController().getInputUser(nsVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(nsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new m(nsVar, 5));
    }

    public static void V(ns nsVar, TLRPC.User user) {
        nsVar.Q = null;
        nsVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.H));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(nsVar.currentAccount).getUserFull(nsVar.H);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            nsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = nsVar.T;
        if (photo != null) {
            user2.photo.photo_id = photo.f18107id;
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
        nsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        nsVar.g0();
        nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void W(ns nsVar) {
        TLRPC.User user;
        if (nsVar.e != null && (user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.H))) != null) {
            nsVar.f35590n.m(nsVar.currentAccount, user);
            nsVar.e.invalidate();
        }
    }

    public static void X(ns nsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.v40 v40Var = nsVar.P;
        if (v40Var.T) {
            return;
        }
        int i10 = nsVar.S;
        if (i10 == 2) {
            nsVar.Q = photoSize.location;
        } else if (i10 == 1 && nsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.c5 parentLayout = nsVar.getParentLayout();
            org.telegram.ui.ActionBar.n2 lastFragment = nsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                if (n2Var instanceof xn) {
                    xn xnVar = (xn) n2Var;
                    org.telegram.ui.ActionBar.n2 n2Var2 = lastFragment;
                    if (xnVar.a() == nsVar.H && xnVar.R3 == 0) {
                        xnVar.Wa(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                            if (arrayList.get(size2) != n2Var3) {
                                ((org.telegram.ui.ActionBar.n2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            n2Var2 = n2Var3;
                        }
                        n2Var2.finishFragment();
                    } else {
                        lastFragment = n2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.n2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            nsVar.e.h(ImageLocation.getForLocal(nsVar.Q), "50_50", nsVar.f35590n, nsVar.getMessagesController().getUser(Long.valueOf(nsVar.H)));
            if (nsVar.S == 2) {
                nsVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(nsVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = nsVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = nsVar.getUserConfig().getNewMessageId();
                tL_messageService.f18104id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = nsVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = nsVar.H;
                tL_messageService.date = nsVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(nsVar.currentAccount, tL_messageService, false, false);
                nsVar.Z = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(nsVar.currentAccount).updateInterfaceWithMessages(nsVar.H, arrayList2, 0);
                nsVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, v40Var);
            }
        } else {
            TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.H));
            if (nsVar.Z == null && user != null) {
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
                nsVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            nsVar.d0(nsVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, nsVar.S);
            nsVar.e0(false, true);
        }
        nsVar.g0();
    }

    public static void Y(ns nsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (nsVar.Z == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User user = nsVar.getMessagesController().getUser(Long.valueOf(nsVar.H));
                TLRPC.UserFull userFull = MessagesController.getInstance(nsVar.currentAccount).getUserFull(nsVar.H);
                if (userFull != null) {
                    userFull.personal_photo = tL_photos_photo.photo;
                    userFull.flags |= 2097152;
                    nsVar.getMessagesStorage().updateUserInfo(userFull, true);
                }
                if (user != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
                    if (closestPhotoSizeWithSize != null && fileLocation != null) {
                        FileLoader.getInstance(nsVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(nsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(fileLocation.volume_id);
                        sb2.append("_");
                        String o9 = a4.a.o(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        ImageLoader.getInstance().replaceImageInCache(o9, a4.a.o(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(nsVar.currentAccount, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                        FileLoader.getInstance(nsVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(nsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    yf.d0.a(tL_photos_photo.photo, user, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    nsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    nsVar.getMessagesController().getDialogPhotos(nsVar.H).addPhotoAtStart(tL_photos_photo.photo);
                    nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    nsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                    if (nsVar.getParentActivity() != null) {
                        if (i10 == 2) {
                            org.telegram.ui.Components.xc.a0(nsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.xc.a0(nsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        }
                    }
                }
                nsVar.Q = null;
                nsVar.g0();
            }
        }
    }

    public static void Z(ns nsVar) {
        if (nsVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(nsVar.Z.getId()));
            NotificationCenter.getInstance(nsVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void B(float f7) {
        RadialProgressView radialProgressView = this.f35592s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f35592s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void P() {
        AndroidUtilities.runOnUIThread(new fs(this, 1));
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ns.X(ns.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
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
        int i16 = org.telegram.ui.ActionBar.h6.f18826f8;
        org.telegram.ui.ActionBar.d6 d6Var = this.f35591r;
        kVar.A(org.telegram.ui.ActionBar.h6.v0(i16, d6Var), false);
        this.actionBar.B(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19120v8, d6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.I) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new js(this));
        this.f35586a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i17 = org.telegram.ui.ActionBar.h6.f18733a7;
        frameLayout.setBackgroundColor(getThemedColor(i17));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i18 = org.telegram.ui.ActionBar.h6.f18789d6;
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
        frameLayout3.addView(w9Var2, w7.x5.d(64, 64.0f, i10 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
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
        frameLayout4.addView(r6Var, w7.x5.d(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f35592s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f35592s.setProgressColor(-1);
        this.f35592s.setNoProgress(false);
        FrameLayout frameLayout5 = this.V;
        RadialProgressView radialProgressView2 = this.f35592s;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout5.addView(radialProgressView2, w7.x5.d(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f35589f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        this.f35589f.setTextSize(1, 18.0f);
        this.f35589f.setLines(1);
        this.f35589f.setMaxLines(1);
        this.f35589f.setSingleLine(true);
        TextView textView2 = this.f35589f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f35589f;
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView3.setGravity(i13);
        this.f35589f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout6 = this.V;
        TextView textView4 = this.f35589f;
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
        TextView f13 = org.telegram.ui.Cells.q3.f(frameLayout6, textView4, w7.x5.d(-2, -2.0f, i20, f7, 25.66f, f10, 0.0f), context);
        this.h = f13;
        f13.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A6, d6Var));
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
        frameLayout7.addView(textView6, w7.x5.d(-2, -2.0f, i21, f11, 49.66f, f12, 0.0f));
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.f35591r);
        this.f35587b = i3Var;
        i3Var.f20177b.setImeOptions(5);
        this.f35587b.setBackgroundColor(getThemedColor(i18));
        this.f35587b.setDivider(true);
        this.f35587b.f20177b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ns f33911b;

            {
                this.f33911b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ns nsVar = this.f33911b;
                            nsVar.f35588c.f20177b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = nsVar.f35588c.f20177b;
                            g3Var.setSelection(g3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ns nsVar2 = this.f33911b;
                        if (i22 == 6) {
                            nsVar2.f35586a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            nsVar2.d.f20177b.requestFocus();
                            nsVar2.d.f20177b.setSelection(nsVar2.f35588c.f20177b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f33911b.f35586a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f35587b.f20177b.setOnFocusChangeListener(new Object());
        this.f35587b.setText(this.M);
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.f35591r);
        this.f35588c = i3Var2;
        i3Var2.f20177b.setImeOptions(5);
        this.f35588c.setBackgroundColor(getThemedColor(i18));
        this.f35588c.f20177b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ns f33911b;

            {
                this.f33911b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ns nsVar = this.f33911b;
                            nsVar.f35588c.f20177b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = nsVar.f35588c.f20177b;
                            g3Var.setSelection(g3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ns nsVar2 = this.f33911b;
                        if (i22 == 6) {
                            nsVar2.f35586a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            nsVar2.d.f20177b.requestFocus();
                            nsVar2.d.f20177b.setSelection(nsVar2.f35588c.f20177b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f33911b.f35586a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        this.f35588c.setText(this.N);
        org.telegram.ui.Cells.i3 i3Var3 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.f35591r);
        this.d = i3Var3;
        i3Var3.f20177b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.gc));
        this.d.f20177b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i18));
        this.d.f20177b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final ns f33911b;

            {
                this.f33911b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i22, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i22 == 5) {
                            ns nsVar = this.f33911b;
                            nsVar.f35588c.f20177b.requestFocus();
                            org.telegram.ui.Cells.g3 g3Var = nsVar.f35588c.f20177b;
                            g3Var.setSelection(g3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        ns nsVar2 = this.f33911b;
                        if (i22 == 6) {
                            nsVar2.f35586a.performClick();
                            return true;
                        } else if (i22 == 5) {
                            nsVar2.d.f20177b.requestFocus();
                            nsVar2.d.f20177b.setSelection(nsVar2.f35588c.f20177b.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        if (i22 == 6) {
                            this.f33911b.f35586a.performClick();
                            return true;
                        }
                        return false;
                }
            }
        });
        if (!this.I) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
            org.telegram.ui.Cells.s8 s8Var = new org.telegram.ui.Cells.s8(context, d6Var);
            this.f35594x = s8Var;
            s8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.f35594x.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            org.telegram.ui.Cells.s8 s8Var2 = this.f35594x;
            int i22 = org.telegram.ui.ActionBar.h6.f19118v6;
            int i23 = org.telegram.ui.ActionBar.h6.f19100u6;
            s8Var2.e(i22, i23);
            final org.telegram.ui.Components.yi0 yi0Var = new org.telegram.ui.Components.yi0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f35594x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f35594x.e.setAnimation(yi0Var);
            this.f35594x.setOnClickListener(new View.OnClickListener(this) {
                public final ns f34235b;

                {
                    this.f34235b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final ns nsVar = this.f34235b;
                            boolean z13 = true;
                            nsVar.R = 1;
                            org.telegram.ui.Components.v40 v40Var = nsVar.P;
                            TLRPC.User user2 = user;
                            v40Var.L = user2;
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
                            final org.telegram.ui.Components.yi0 yi0Var2 = yi0Var;
                            v40Var.o(z13, fVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ns nsVar2 = nsVar;
                                            boolean h = nsVar2.P.h();
                                            org.telegram.ui.Components.yi0 yi0Var3 = yi0Var2;
                                            if (!h) {
                                                yi0Var3.P(86);
                                                nsVar2.f35595y.e.d();
                                                return;
                                            }
                                            yi0Var3.N(0, false, false);
                                            return;
                                        default:
                                            ns nsVar3 = nsVar;
                                            boolean h10 = nsVar3.P.h();
                                            org.telegram.ui.Components.yi0 yi0Var4 = yi0Var2;
                                            if (!h10) {
                                                yi0Var4.P(85);
                                                nsVar3.f35594x.e.d();
                                                return;
                                            }
                                            yi0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            yi0Var2.M(0);
                            yi0Var2.P(43);
                            nsVar.f35594x.e.d();
                            return;
                        default:
                            final ns nsVar2 = this.f34235b;
                            nsVar2.R = 2;
                            org.telegram.ui.Components.v40 v40Var2 = nsVar2.P;
                            TLRPC.User user3 = user;
                            v40Var2.L = user3;
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
                            final org.telegram.ui.Components.yi0 yi0Var3 = yi0Var;
                            v40Var2.o(z12, fVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ns nsVar22 = nsVar2;
                                            boolean h = nsVar22.P.h();
                                            org.telegram.ui.Components.yi0 yi0Var32 = yi0Var3;
                                            if (!h) {
                                                yi0Var32.P(86);
                                                nsVar22.f35595y.e.d();
                                                return;
                                            }
                                            yi0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ns nsVar3 = nsVar2;
                                            boolean h10 = nsVar3.P.h();
                                            org.telegram.ui.Components.yi0 yi0Var4 = yi0Var3;
                                            if (!h10) {
                                                yi0Var4.P(85);
                                                nsVar3.f35594x.e.d();
                                                return;
                                            }
                                            yi0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            yi0Var3.M(0);
                            yi0Var3.P(43);
                            nsVar2.f35595y.e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.s8 s8Var3 = new org.telegram.ui.Cells.s8(context, d6Var);
            this.f35595y = s8Var3;
            s8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.f35595y.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            this.f35595y.e(i22, i23);
            final org.telegram.ui.Components.yi0 yi0Var2 = new org.telegram.ui.Components.yi0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f35595y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f35595y.e.setAnimation(yi0Var2);
            this.f35595y.setOnClickListener(new View.OnClickListener(this) {
                public final ns f34235b;

                {
                    this.f34235b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final ns nsVar = this.f34235b;
                            boolean z13 = true;
                            nsVar.R = 1;
                            org.telegram.ui.Components.v40 v40Var = nsVar.P;
                            TLRPC.User user2 = user;
                            v40Var.L = user2;
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
                            final org.telegram.ui.Components.yi0 yi0Var22 = yi0Var2;
                            v40Var.o(z13, fVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ns nsVar22 = nsVar;
                                            boolean h = nsVar22.P.h();
                                            org.telegram.ui.Components.yi0 yi0Var32 = yi0Var22;
                                            if (!h) {
                                                yi0Var32.P(86);
                                                nsVar22.f35595y.e.d();
                                                return;
                                            }
                                            yi0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ns nsVar3 = nsVar;
                                            boolean h10 = nsVar3.P.h();
                                            org.telegram.ui.Components.yi0 yi0Var4 = yi0Var22;
                                            if (!h10) {
                                                yi0Var4.P(85);
                                                nsVar3.f35594x.e.d();
                                                return;
                                            }
                                            yi0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            yi0Var22.M(0);
                            yi0Var22.P(43);
                            nsVar.f35594x.e.d();
                            return;
                        default:
                            final ns nsVar2 = this.f34235b;
                            nsVar2.R = 2;
                            org.telegram.ui.Components.v40 v40Var2 = nsVar2.P;
                            TLRPC.User user3 = user;
                            v40Var2.L = user3;
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
                            final org.telegram.ui.Components.yi0 yi0Var3 = yi0Var2;
                            v40Var2.o(z12, fVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            ns nsVar22 = nsVar2;
                                            boolean h = nsVar22.P.h();
                                            org.telegram.ui.Components.yi0 yi0Var32 = yi0Var3;
                                            if (!h) {
                                                yi0Var32.P(86);
                                                nsVar22.f35595y.e.d();
                                                return;
                                            }
                                            yi0Var32.N(0, false, false);
                                            return;
                                        default:
                                            ns nsVar3 = nsVar2;
                                            boolean h10 = nsVar3.P.h();
                                            org.telegram.ui.Components.yi0 yi0Var4 = yi0Var3;
                                            if (!h10) {
                                                yi0Var4.P(85);
                                                nsVar3.f35594x.e.d();
                                                return;
                                            }
                                            yi0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            yi0Var3.M(0);
                            yi0Var3.P(43);
                            nsVar2.f35595y.e.d();
                            return;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.w9(context);
            this.E = new ls(this, context, d6Var);
            if (this.f35590n == null) {
                this.f35590n = new org.telegram.ui.Components.h9(0, user);
            }
            this.U.e(user.photo, this.f35590n);
            this.E.addView(this.U, w7.x5.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            this.E.e(i22, i23);
            this.E.setOnClickListener(new a0(this, context, user, 10));
            org.telegram.ui.Cells.s8 s8Var4 = new org.telegram.ui.Cells.s8(context, d6Var);
            this.F = s8Var4;
            s8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.h6.J0(d6Var, true));
            this.F.e(i22, i23);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.et(27, this, user));
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
        org.telegram.ui.Components.d61 d61Var = new org.telegram.ui.Components.d61(this, new c5(this, 7), new z0(this, 26), null);
        this.W = d61Var;
        d61Var.p1();
        this.W.setOnScrollListener(new ii.n3(4, this, frameLayout));
        this.W.setBackgroundColor(getThemedColor(i17));
        frameLayout.addView(this.W, w7.x5.e(-1, -1, 119));
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
        if (this.f35592s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f35593w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f35593w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f35593w = animatorSet2;
            if (z10) {
                this.f35592s.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f35593w;
                RadialProgressView radialProgressView = this.f35592s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f35592s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f35593w.setDuration(180L);
            this.f35593w.addListener(new org.telegram.ui.Components.ca(26, this, z10));
            this.f35593w.start();
        } else if (z10) {
            this.f35592s.setAlpha(1.0f);
            this.f35592s.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f35592s.setAlpha(0.0f);
            this.f35592s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f35589f != null && (user = getMessagesController().getUser(Long.valueOf(this.H))) != null) {
            if (TextUtils.isEmpty(c0())) {
                this.f35589f.setText(LocaleController.getString(R.string.MobileHidden));
            } else {
                TextView textView = this.f35589f;
                gf.b c10 = gf.b.c();
                textView.setText(c10.b("+" + c0()));
            }
            this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
            if (this.Q == null) {
                org.telegram.ui.Components.w9 w9Var = this.e;
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9(0, user);
                this.f35590n = h9Var;
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
            this.U.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.T), "50_50", this.f35590n, null);
        }
        if (this.f35590n == null) {
            this.f35590n = new org.telegram.ui.Components.h9(0, user);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.e(user, this.f35590n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.f35590n, getMessagesController().getUser(Long.valueOf(this.H)));
        }
    }

    @Override
    public final wu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f35591r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f18789d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f19120v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f19084t8));
        TextView textView = this.f35589f;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35587b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.i3 i3Var = this.f35587b;
        int i11 = org.telegram.ui.ActionBar.h6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(i3Var, 8388608, null, null, null, null, i11));
        org.telegram.ui.Cells.i3 i3Var2 = this.f35587b;
        int i12 = org.telegram.ui.ActionBar.h6.f18916k6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(i3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.i3 i3Var3 = this.f35587b;
        int i13 = org.telegram.ui.ActionBar.h6.f18934l6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(i3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35588c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35588c, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35588c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f35588c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f19038r0, eVar, org.telegram.ui.ActionBar.h6.J7));
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
        org.telegram.ui.Components.v40 v40Var = this.P;
        if (v40Var != null) {
            v40Var.f28645a = this;
            v40Var.f28646b = this;
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
        org.telegram.ui.Components.v40 v40Var = this.P;
        if (v40Var != null) {
            v40Var.e();
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

    public ns(Bundle bundle, org.telegram.ui.ActionBar.d6 d6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.f35591r = d6Var;
        this.P = new org.telegram.ui.Components.v40(0, true, true);
    }
}

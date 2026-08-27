package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
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

public final class js extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.i40 {
    public hs A;
    public org.telegram.ui.Cells.l8 B;
    public MessagesController.DialogPhotos C;
    public long D;
    public boolean E;
    public boolean F;
    public boolean G;
    public String H;
    public String I;
    public String J;
    public is K;
    public final org.telegram.ui.Components.j40 L;
    public TLRPC.FileLocation M;
    public int N;
    public int O;
    public TLRPC.Photo P;
    public org.telegram.ui.Components.n9 Q;
    public FrameLayout R;
    public org.telegram.ui.Components.k51 S;
    public boolean T;
    public boolean U;
    public MessageObject V;

    public org.telegram.ui.ActionBar.v0 f39483a;

    public org.telegram.ui.Cells.g3 f39484b;

    public org.telegram.ui.Cells.g3 f39485c;
    public org.telegram.ui.Cells.g3 d;

    public org.telegram.ui.Components.n9 f39486e;

    public TextView f39487f;
    public TextView h;

    public org.telegram.ui.Components.y8 f39488n;

    public final org.telegram.ui.ActionBar.c6 f39489r;

    public RadialProgressView f39490s;
    public ag.t0 v;

    public AnimatorSet f39491w;

    public org.telegram.ui.Cells.l8 f39492x;

    public org.telegram.ui.Cells.l8 f39493y;

    public js(Bundle bundle) {
        super(bundle);
        this.T = false;
        this.U = true;
        this.L = new org.telegram.ui.Components.j40(0, true, true);
    }

    public static void U(js jsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f22522id = jsVar.getMessagesController().getInputUser(jsVar.D);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(jsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new n(jsVar, 5));
    }

    public static void V(js jsVar, TLRPC.User user) {
        jsVar.M = null;
        jsVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.D));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(jsVar.currentAccount).getUserFull(jsVar.D);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            jsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = jsVar.P;
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
        jsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
        jsVar.g0();
        jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
    }

    public static void W(js jsVar) {
        TLRPC.User user;
        if (jsVar.f39486e == null || (user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.D))) == null) {
            return;
        }
        jsVar.f39488n.m(jsVar.currentAccount, user);
        jsVar.f39486e.invalidate();
    }

    public static void X(js jsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        org.telegram.ui.Components.j40 j40Var = jsVar.L;
        if (j40Var.P) {
            return;
        }
        int i10 = jsVar.O;
        if (i10 == 2) {
            jsVar.M = photoSize.location;
        } else if (i10 == 1 && jsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.b5 parentLayout = jsVar.getParentLayout();
            org.telegram.ui.ActionBar.n2 lastFragment = jsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = parentLayout.getFragmentStack().size() - 1; size >= 0; size--) {
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                if (n2Var instanceof rn) {
                    rn rnVar = (rn) n2Var;
                    org.telegram.ui.ActionBar.n2 n2Var2 = lastFragment;
                    if (rnVar.a() == jsVar.D && rnVar.N3 == 0) {
                        rnVar.Wa(false, null);
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
                        break;
                    }
                    lastFragment = n2Var2;
                }
                arrayList.add((org.telegram.ui.ActionBar.n2) fragmentStack.get(size));
            }
        }
        if (inputFile == null && inputFile2 == null) {
            jsVar.f39486e.h(ImageLocation.getForLocal(jsVar.M), "50_50", jsVar.f39488n, jsVar.getMessagesController().getUser(Long.valueOf(jsVar.D)));
            if (jsVar.O == 2) {
                jsVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(jsVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = jsVar.D;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = jsVar.getUserConfig().getNewMessageId();
                tL_messageService.f22401id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = jsVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = jsVar.D;
                tL_messageService.date = jsVar.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageActionSuggestProfilePhoto tL_messageActionSuggestProfilePhoto = new TLRPC.TL_messageActionSuggestProfilePhoto();
                tL_messageService.action = tL_messageActionSuggestProfilePhoto;
                TLRPC.TL_photo tL_photo = new TLRPC.TL_photo();
                tL_messageActionSuggestProfilePhoto.photo = tL_photo;
                tL_photo.sizes.add(photoSize);
                tL_messageActionSuggestProfilePhoto.photo.sizes.add(photoSize2);
                tL_messageActionSuggestProfilePhoto.video = z10;
                tL_messageActionSuggestProfilePhoto.photo.file_reference = new byte[0];
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                MessageObject messageObject = new MessageObject(jsVar.currentAccount, tL_messageService, false, false);
                jsVar.V = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(jsVar.currentAccount).updateInterfaceWithMessages(jsVar.D, arrayList2, 0);
                jsVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, j40Var);
            }
        } else {
            TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.D));
            if (jsVar.V == null && user != null) {
                boolean z11 = inputFile2 != null;
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
                jsVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            jsVar.d0(jsVar.M, photoSize2.location, inputFile, inputFile2, videoSize, d, jsVar.O);
            jsVar.e0(false, true);
        }
        jsVar.g0();
    }

    public static void Y(js jsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (jsVar.V != null) {
            return;
        }
        if ((fileLocation == null && inputFile == null) || tLObject == null) {
            return;
        }
        TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
        ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
        TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.D));
        TLRPC.UserFull userFull = MessagesController.getInstance(jsVar.currentAccount).getUserFull(jsVar.D);
        if (userFull != null) {
            userFull.personal_photo = tL_photos_photo.photo;
            userFull.flags |= 2097152;
            jsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        if (user != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 1000);
            if (closestPhotoSizeWithSize != null && fileLocation != null) {
                FileLoader.getInstance(jsVar.currentAccount).getPathToAttach(fileLocation, true).renameTo(FileLoader.getInstance(jsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(fileLocation.volume_id);
                sb2.append("_");
                String strK = a9.p.k(fileLocation.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(strK, a9.p.k(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(jsVar.currentAccount, user, 1), false);
            }
            if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                FileLoader.getInstance(jsVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(jsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            gf.l0.a(tL_photos_photo.photo, user, true);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            jsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            jsVar.getMessagesController().getDialogPhotos(jsVar.D).addPhotoAtStart(tL_photos_photo.photo);
            jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            if (jsVar.getParentActivity() != null) {
                if (i10 == 2) {
                    org.telegram.ui.Components.mc.a0(jsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                } else {
                    org.telegram.ui.Components.mc.a0(jsVar).V(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                }
            }
        }
        jsVar.M = null;
        jsVar.g0();
    }

    public static void Z(js jsVar) {
        if (jsVar.V != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(jsVar.V.getId()));
            NotificationCenter.getInstance(jsVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void E(float f10) {
        RadialProgressView radialProgressView = this.f39490s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f10);
    }

    @Override
    public final void J(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f39490s;
        if (radialProgressView == null) {
            return;
        }
        this.O = this.N;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void P() {
        AndroidUtilities.runOnUIThread(new bs(this, 1));
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                js.X(this.f44883a, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    public final String c0() {
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
        return (user == null || TextUtils.isEmpty(user.phone)) ? this.H : user.phone;
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f23092f8;
        org.telegram.ui.ActionBar.c6 c6Var = this.f39489r;
        final int i11 = 0;
        kVar.C(org.telegram.ui.ActionBar.g6.v0(i10, c6Var), false);
        this.actionBar.D(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23375v8, c6Var), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        final int i12 = 1;
        this.actionBar.setAllowOverlayTitle(true);
        if (this.E) {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.actionBar.setActionBarMenuOnItemClick(new fs(this));
        this.f39483a = this.actionBar.n().e(1, LocaleController.getString(R.string.Done).toUpperCase());
        FrameLayout frameLayout = new FrameLayout(context);
        int i13 = org.telegram.ui.ActionBar.g6.f22999a7;
        frameLayout.setBackgroundColor(getThemedColor(i13));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.R = frameLayout2;
        int i14 = org.telegram.ui.ActionBar.g6.f23053d6;
        frameLayout2.setBackgroundColor(getThemedColor(i14));
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
        this.f39486e = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        this.R.addView(this.f39486e, h7.z5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        ag.t0 t0Var = new ag.t0(this, context, paint, 9);
        this.v = t0Var;
        this.R.addView(t0Var, h7.z5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39490s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f39490s.setProgressColor(-1);
        this.f39490s.setNoProgress(false);
        this.R.addView(this.f39490s, h7.z5.d(64, 64.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f39487f = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        this.f39487f.setTextSize(1, 18.0f);
        this.f39487f.setLines(1);
        this.f39487f.setMaxLines(1);
        this.f39487f.setSingleLine(true);
        TextView textView2 = this.f39487f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        this.f39487f.setGravity(LocaleController.isRTL ? 5 : 3);
        this.f39487f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout3 = this.R;
        TextView textView3 = this.f39487f;
        boolean z10 = LocaleController.isRTL;
        TextView textViewH = org.telegram.ui.Cells.pa.h(frameLayout3, textView3, h7.z5.d(-2, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 0.0f : 94.0f, 25.66f, z10 ? 94.0f : 0.0f, 0.0f), context);
        this.h = textViewH;
        textViewH.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.A6, c6Var));
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        this.h.setGravity(LocaleController.isRTL ? 5 : 3);
        FrameLayout frameLayout4 = this.R;
        TextView textView4 = this.h;
        boolean z11 = LocaleController.isRTL;
        frameLayout4.addView(textView4, h7.z5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 0.0f : 94.0f, 49.66f, z11 ? 94.0f : 0.0f, 0.0f));
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.f39489r);
        this.f39484b = g3Var;
        g3Var.f24370b.setImeOptions(5);
        this.f39484b.setBackgroundColor(getThemedColor(i14));
        this.f39484b.setDivider(true);
        this.f39484b.f24370b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final js f37537b;

            {
                this.f37537b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i11) {
                    case 0:
                        if (i15 != 5) {
                            return false;
                        }
                        js jsVar = this.f37537b;
                        jsVar.f39485c.f24370b.requestFocus();
                        org.telegram.ui.Cells.e3 e3Var = jsVar.f39485c.f24370b;
                        e3Var.setSelection(e3Var.length());
                        return true;
                    case 1:
                        js jsVar2 = this.f37537b;
                        if (i15 == 6) {
                            jsVar2.f39483a.performClick();
                            return true;
                        }
                        if (i15 != 5) {
                            return false;
                        }
                        jsVar2.d.f24370b.requestFocus();
                        jsVar2.d.f24370b.setSelection(jsVar2.f39485c.f24370b.length());
                        return true;
                    default:
                        if (i15 != 6) {
                            return false;
                        }
                        this.f37537b.f39483a.performClick();
                        return true;
                }
            }
        });
        this.f39484b.f24370b.setOnFocusChangeListener(new gs());
        this.f39484b.setText(this.I);
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.f39489r);
        this.f39485c = g3Var2;
        g3Var2.f24370b.setImeOptions(5);
        this.f39485c.setBackgroundColor(getThemedColor(i14));
        this.f39485c.f24370b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final js f37537b;

            {
                this.f37537b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView5, int i15, KeyEvent keyEvent) {
                switch (i12) {
                    case 0:
                        if (i15 != 5) {
                            return false;
                        }
                        js jsVar = this.f37537b;
                        jsVar.f39485c.f24370b.requestFocus();
                        org.telegram.ui.Cells.e3 e3Var = jsVar.f39485c.f24370b;
                        e3Var.setSelection(e3Var.length());
                        return true;
                    case 1:
                        js jsVar2 = this.f37537b;
                        if (i15 == 6) {
                            jsVar2.f39483a.performClick();
                            return true;
                        }
                        if (i15 != 5) {
                            return false;
                        }
                        jsVar2.d.f24370b.requestFocus();
                        jsVar2.d.f24370b.setSelection(jsVar2.f39485c.f24370b.length());
                        return true;
                    default:
                        if (i15 != 6) {
                            return false;
                        }
                        this.f37537b.f39483a.performClick();
                        return true;
                }
            }
        });
        this.f39485c.setText(this.J);
        org.telegram.ui.Cells.g3 g3Var3 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.f39489r);
        this.d = g3Var3;
        g3Var3.f24370b.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.gc));
        this.d.f24370b.setImeOptions(6);
        this.d.setBackgroundColor(getThemedColor(i14));
        final int i15 = 2;
        this.d.f24370b.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {

            public final js f37537b;

            {
                this.f37537b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView5, int i16, KeyEvent keyEvent) {
                switch (i15) {
                    case 0:
                        if (i16 != 5) {
                            return false;
                        }
                        js jsVar = this.f37537b;
                        jsVar.f39485c.f24370b.requestFocus();
                        org.telegram.ui.Cells.e3 e3Var = jsVar.f39485c.f24370b;
                        e3Var.setSelection(e3Var.length());
                        return true;
                    case 1:
                        js jsVar2 = this.f37537b;
                        if (i16 == 6) {
                            jsVar2.f39483a.performClick();
                            return true;
                        }
                        if (i16 != 5) {
                            return false;
                        }
                        jsVar2.d.f24370b.requestFocus();
                        jsVar2.d.f24370b.setSelection(jsVar2.f39485c.f24370b.length());
                        return true;
                    default:
                        if (i16 != 6) {
                            return false;
                        }
                        this.f37537b.f39483a.performClick();
                        return true;
                }
            }
        });
        if (!this.E) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.D));
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context, c6Var);
            this.f39492x = l8Var;
            l8Var.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.f39492x.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            org.telegram.ui.Cells.l8 l8Var2 = this.f39492x;
            int i16 = org.telegram.ui.ActionBar.g6.f23373v6;
            int i17 = org.telegram.ui.ActionBar.g6.f23357u6;
            l8Var2.e(i16, i17);
            final org.telegram.ui.Components.oi0 oi0Var = new org.telegram.ui.Components.oi0(R.raw.photo_suggest_icon, "" + R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f39492x.f24631e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.f39492x.f24631e.setAnimation(oi0Var);
            this.f39492x.setOnClickListener(new View.OnClickListener(this) {

                public final js f37831b;

                {
                    this.f37831b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            final js jsVar = this.f37831b;
                            jsVar.N = 1;
                            org.telegram.ui.Components.j40 j40Var = jsVar.L;
                            TLRPC.User user2 = user;
                            j40Var.H = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ag.l3 l3Var = new ag.l3(22);
                            final int i18 = 1;
                            final org.telegram.ui.Components.oi0 oi0Var2 = oi0Var;
                            j40Var.o(z12, l3Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            js jsVar2 = jsVar;
                                            boolean zH = jsVar2.L.h();
                                            org.telegram.ui.Components.oi0 oi0Var3 = oi0Var2;
                                            if (!zH) {
                                                oi0Var3.N(86);
                                                jsVar2.f39493y.f24631e.d();
                                            } else {
                                                oi0Var3.L(0, false, false);
                                            }
                                            break;
                                        default:
                                            js jsVar3 = jsVar;
                                            boolean zH2 = jsVar3.L.h();
                                            org.telegram.ui.Components.oi0 oi0Var4 = oi0Var2;
                                            if (!zH2) {
                                                oi0Var4.N(85);
                                                jsVar3.f39492x.f24631e.d();
                                            } else {
                                                oi0Var4.L(0, false, false);
                                            }
                                            break;
                                    }
                                }
                            }, 2);
                            oi0Var2.K(0);
                            oi0Var2.N(43);
                            jsVar.f39492x.f24631e.d();
                            break;
                        default:
                            final js jsVar2 = this.f37831b;
                            jsVar2.N = 2;
                            org.telegram.ui.Components.j40 j40Var2 = jsVar2.L;
                            TLRPC.User user3 = user;
                            j40Var2.H = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ag.l3 l3Var2 = new ag.l3(22);
                            final int i19 = 0;
                            final org.telegram.ui.Components.oi0 oi0Var3 = oi0Var;
                            j40Var2.o(z13, l3Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            js jsVar3 = jsVar2;
                                            boolean zH = jsVar3.L.h();
                                            org.telegram.ui.Components.oi0 oi0Var4 = oi0Var3;
                                            if (!zH) {
                                                oi0Var4.N(86);
                                                jsVar3.f39493y.f24631e.d();
                                            } else {
                                                oi0Var4.L(0, false, false);
                                            }
                                            break;
                                        default:
                                            js jsVar4 = jsVar2;
                                            boolean zH2 = jsVar4.L.h();
                                            org.telegram.ui.Components.oi0 oi0Var5 = oi0Var3;
                                            if (!zH2) {
                                                oi0Var5.N(85);
                                                jsVar4.f39492x.f24631e.d();
                                            } else {
                                                oi0Var5.L(0, false, false);
                                            }
                                            break;
                                    }
                                }
                            }, 1);
                            oi0Var3.K(0);
                            oi0Var3.N(43);
                            jsVar2.f39493y.f24631e.d();
                            break;
                    }
                }
            });
            org.telegram.ui.Cells.l8 l8Var3 = new org.telegram.ui.Cells.l8(context, c6Var);
            this.f39493y = l8Var3;
            l8Var3.m(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.f39493y.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            this.f39493y.e(i16, i17);
            final org.telegram.ui.Components.oi0 oi0Var2 = new org.telegram.ui.Components.oi0(R.raw.camera_outline, "" + R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f39493y.f24631e.setTranslationX((float) (-AndroidUtilities.dp(8.0f)));
            this.f39493y.f24631e.setAnimation(oi0Var2);
            this.f39493y.setOnClickListener(new View.OnClickListener(this) {

                public final js f37831b;

                {
                    this.f37831b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            final js jsVar = this.f37831b;
                            jsVar.N = 1;
                            org.telegram.ui.Components.j40 j40Var = jsVar.L;
                            TLRPC.User user2 = user;
                            j40Var.H = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            boolean z12 = (userProfilePhoto == null ? null : userProfilePhoto.photo_small) != null;
                            ag.l3 l3Var = new ag.l3(22);
                            final int i18 = 1;
                            final org.telegram.ui.Components.oi0 oi0Var3 = oi0Var2;
                            j40Var.o(z12, l3Var, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i18) {
                                        case 0:
                                            js jsVar3 = jsVar;
                                            boolean zH = jsVar3.L.h();
                                            org.telegram.ui.Components.oi0 oi0Var4 = oi0Var3;
                                            if (!zH) {
                                                oi0Var4.N(86);
                                                jsVar3.f39493y.f24631e.d();
                                            } else {
                                                oi0Var4.L(0, false, false);
                                            }
                                            break;
                                        default:
                                            js jsVar4 = jsVar;
                                            boolean zH2 = jsVar4.L.h();
                                            org.telegram.ui.Components.oi0 oi0Var5 = oi0Var3;
                                            if (!zH2) {
                                                oi0Var5.N(85);
                                                jsVar4.f39492x.f24631e.d();
                                            } else {
                                                oi0Var5.L(0, false, false);
                                            }
                                            break;
                                    }
                                }
                            }, 2);
                            oi0Var3.K(0);
                            oi0Var3.N(43);
                            jsVar.f39492x.f24631e.d();
                            break;
                        default:
                            final js jsVar2 = this.f37831b;
                            jsVar2.N = 2;
                            org.telegram.ui.Components.j40 j40Var2 = jsVar2.L;
                            TLRPC.User user3 = user;
                            j40Var2.H = user3;
                            TLRPC.UserProfilePhoto userProfilePhoto2 = user3.photo;
                            boolean z13 = (userProfilePhoto2 == null ? null : userProfilePhoto2.photo_small) != null;
                            ag.l3 l3Var2 = new ag.l3(22);
                            final int i19 = 0;
                            final org.telegram.ui.Components.oi0 oi0Var4 = oi0Var2;
                            j40Var2.o(z13, l3Var2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (i19) {
                                        case 0:
                                            js jsVar3 = jsVar2;
                                            boolean zH = jsVar3.L.h();
                                            org.telegram.ui.Components.oi0 oi0Var5 = oi0Var4;
                                            if (!zH) {
                                                oi0Var5.N(86);
                                                jsVar3.f39493y.f24631e.d();
                                            } else {
                                                oi0Var5.L(0, false, false);
                                            }
                                            break;
                                        default:
                                            js jsVar4 = jsVar2;
                                            boolean zH2 = jsVar4.L.h();
                                            org.telegram.ui.Components.oi0 oi0Var6 = oi0Var4;
                                            if (!zH2) {
                                                oi0Var6.N(85);
                                                jsVar4.f39492x.f24631e.d();
                                            } else {
                                                oi0Var6.L(0, false, false);
                                            }
                                            break;
                                    }
                                }
                            }, 1);
                            oi0Var4.K(0);
                            oi0Var4.N(43);
                            jsVar2.f39493y.f24631e.d();
                            break;
                    }
                }
            });
            this.Q = new org.telegram.ui.Components.n9(context);
            this.A = new hs(this, context, c6Var);
            if (this.f39488n == null) {
                this.f39488n = new org.telegram.ui.Components.y8(0, user);
            }
            this.Q.e(user.photo, this.f39488n);
            this.A.addView(this.Q, h7.z5.d(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.A.i(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.A.getImageView().setVisibility(0);
            this.A.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            this.A.e(i16, i17);
            this.A.setOnClickListener(new c0(this, context, user, 10));
            org.telegram.ui.Cells.l8 l8Var4 = new org.telegram.ui.Cells.l8(context, c6Var);
            this.B = l8Var4;
            l8Var4.m(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.B.setBackground(org.telegram.ui.ActionBar.g6.J0(c6Var, true));
            this.B.e(i16, i17);
            this.B.setNeedDivider(true);
            this.B.f24631e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.B.setOnClickListener(new org.telegram.ui.Components.xh0(15, this, user));
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
        org.telegram.ui.Components.k51 k51Var = new org.telegram.ui.Components.k51(this, new b5(this, 7), new c1(this, 26), null);
        this.S = k51Var;
        k51Var.p1();
        this.S.setOnScrollListener(new fh.l(5, this, frameLayout));
        this.S.setBackgroundColor(getThemedColor(i13));
        frameLayout.addView(this.S, h7.z5.e(-1, -1, 119));
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new gf.j0(this, fileLocation, inputFile2, fileLocation2, i10, 9));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        MessagesController.DialogPhotos dialogPhotos;
        if (i10 == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if ((MessagesController.UPDATE_MASK_AVATAR & iIntValue) == 0 && (iIntValue & MessagesController.UPDATE_MASK_STATUS) == 0) {
                return;
            }
            f0();
            return;
        }
        if (i10 == NotificationCenter.dialogPhotosUpdate && (dialogPhotos = (MessagesController.DialogPhotos) objArr[0]) == this.C) {
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
        return this.O != 1;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f39490s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f39491w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f39491w = null;
        }
        if (!z11) {
            if (z10) {
                this.f39490s.setAlpha(1.0f);
                this.f39490s.setVisibility(0);
                this.v.setAlpha(1.0f);
                this.v.setVisibility(0);
                return;
            }
            this.f39490s.setAlpha(0.0f);
            this.f39490s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f39491w = animatorSet2;
        if (z10) {
            this.f39490s.setVisibility(0);
            this.v.setVisibility(0);
            AnimatorSet animatorSet3 = this.f39491w;
            RadialProgressView radialProgressView = this.f39490s;
            Property property = View.ALPHA;
            animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, (Property<RadialProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.v, (Property<ag.t0, Float>) property, 1.0f));
        } else {
            RadialProgressView radialProgressView2 = this.f39490s;
            Property property2 = View.ALPHA;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, (Property<RadialProgressView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.v, (Property<ag.t0, Float>) property2, 0.0f));
        }
        this.f39491w.setDuration(180L);
        this.f39491w.addListener(new go(27, this, z10));
        this.f39491w.start();
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f39487f == null || (user = getMessagesController().getUser(Long.valueOf(this.D))) == null) {
            return;
        }
        if (TextUtils.isEmpty(c0())) {
            this.f39487f.setText(LocaleController.getString(R.string.MobileHidden));
        } else {
            this.f39487f.setText(oe.b.c().b("+" + c0()));
        }
        this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
        if (this.M == null) {
            org.telegram.ui.Components.n9 n9Var = this.f39486e;
            org.telegram.ui.Components.y8 y8Var = new org.telegram.ui.Components.y8(0, user);
            this.f39488n = y8Var;
            n9Var.e(user, y8Var);
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
            this.Q.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.P), "50_50", this.f39488n, null);
        }
        if (this.f39488n == null) {
            this.f39488n = new org.telegram.ui.Components.y8(0, user);
        }
        TLRPC.FileLocation fileLocation = this.M;
        if (fileLocation == null) {
            this.f39486e.e(user, this.f39488n);
        } else {
            this.f39486e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.f39488n, getMessagesController().getUser(Long.valueOf(this.D)));
        }
    }

    @Override
    public final cu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f39489r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 11);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        TextView textView = this.f39487f;
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.h, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.A6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39484b, 4, null, null, null, null, i10));
        org.telegram.ui.Cells.g3 g3Var = this.f39484b;
        int i11 = org.telegram.ui.ActionBar.g6.H6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g3Var, 8388608, null, null, null, null, i11));
        org.telegram.ui.Cells.g3 g3Var2 = this.f39484b;
        int i12 = org.telegram.ui.ActionBar.g6.f23181k6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g3Var2, 32, null, null, null, null, i12));
        org.telegram.ui.Cells.g3 g3Var3 = this.f39484b;
        int i13 = org.telegram.ui.ActionBar.g6.f23198l6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g3Var3, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39485c, 4, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39485c, 8388608, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39485c, 32, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39485c, 65568, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23295r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        return arrayList;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogPhotosUpdate);
        this.D = getArguments().getLong("user_id", 0L);
        this.H = getArguments().getString("phone");
        this.I = getArguments().getString("first_name_card");
        this.J = getArguments().getString("last_name_card");
        this.E = getArguments().getBoolean("addContact", false);
        this.F = getArguments().getBoolean("focus_notes", false);
        this.G = MessagesController.getNotificationsSettings(this.currentAccount).getBoolean("dialog_bar_exception" + this.D, false);
        TLRPC.User user = this.D != 0 ? getMessagesController().getUser(Long.valueOf(this.D)) : null;
        org.telegram.ui.Components.j40 j40Var = this.L;
        if (j40Var != null) {
            j40Var.f29569a = this;
            j40Var.f29570b = this;
        }
        this.C = MessagesController.getInstance(this.currentAccount).getDialogPhotos(this.D);
        return user != null && super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogPhotosUpdate);
        org.telegram.ui.Components.j40 j40Var = this.L;
        if (j40Var != null) {
            j40Var.e();
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
    public final boolean v() {
        return false;
    }

    public js(Bundle bundle, org.telegram.ui.ActionBar.c6 c6Var) {
        super(bundle);
        this.T = false;
        this.U = true;
        this.f39489r = c6Var;
        this.L = new org.telegram.ui.Components.j40(0, true, true);
    }
}

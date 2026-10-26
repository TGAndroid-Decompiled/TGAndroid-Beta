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
public final class js extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.f50 {
    public hs E;
    public org.telegram.ui.Cells.v8 F;
    public MessagesController.DialogPhotos G;
    public long H;
    public boolean I;
    public boolean J;
    public boolean K;
    public String L;
    public String M;
    public String N;
    public is O;
    public final org.telegram.ui.Components.g50 P;
    public TLRPC.FileLocation Q;
    public int R;
    public int S;
    public TLRPC.Photo T;
    public org.telegram.ui.Components.y9 U;
    public FrameLayout V;
    public org.telegram.ui.Components.r71 W;
    public boolean X;
    public boolean Y;
    public MessageObject Z;
    public org.telegram.ui.ActionBar.u5 f40732a;
    public org.telegram.ui.Cells.g3 f40733b;
    public org.telegram.ui.Cells.g3 f40734c;
    public org.telegram.ui.Cells.g3 d;
    public org.telegram.ui.Components.y9 e;
    public TextView f40735f;
    public TextView h;
    public org.telegram.ui.Components.j9 f40736n;
    public final org.telegram.ui.ActionBar.u6 f40737r;
    public RadialProgressView f40738s;
    public fi.f6 v;
    public AnimatorSet f40739w;
    public org.telegram.ui.Cells.v8 f40740x;
    public org.telegram.ui.Cells.v8 f40741y;

    public js(Bundle bundle) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.P = new org.telegram.ui.Components.g50(0, true, true);
    }

    public static void V(js jsVar, TL_account.TL_birthday tL_birthday) {
        TLRPC.TL_users_suggestBirthday tL_users_suggestBirthday = new TLRPC.TL_users_suggestBirthday();
        tL_users_suggestBirthday.f22171id = jsVar.getMessagesController().getInputUser(jsVar.H);
        tL_users_suggestBirthday.birthday = tL_birthday;
        ConnectionsManager.getInstance(jsVar.currentAccount).sendRequest(tL_users_suggestBirthday, new l(jsVar, 5));
    }

    public static void W(js jsVar, TLRPC.User user) {
        jsVar.Q = null;
        jsVar.d0(null, null, null, null, null, 0.0d, 2);
        TLRPC.User user2 = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.H));
        user2.photo.personal = false;
        TLRPC.UserFull userFull = MessagesController.getInstance(jsVar.currentAccount).getUserFull(jsVar.H);
        if (userFull != null) {
            userFull.personal_photo = null;
            userFull.flags &= -2097153;
            jsVar.getMessagesStorage().updateUserInfo(userFull, true);
        }
        TLRPC.Photo photo = jsVar.T;
        if (photo != null) {
            user2.photo.photo_id = photo.f22051id;
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

    public static void X(js jsVar, TLRPC.PhotoSize photoSize, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.PhotoSize photoSize2, TLRPC.VideoSize videoSize, double d, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.g50 g50Var = jsVar.P;
        if (g50Var.T) {
            return;
        }
        int i10 = jsVar.S;
        if (i10 == 2) {
            jsVar.Q = photoSize.location;
        } else if (i10 == 1 && jsVar.getParentLayout() != null) {
            org.telegram.ui.ActionBar.j5 parentLayout = jsVar.getParentLayout();
            org.telegram.ui.ActionBar.r2 lastFragment = jsVar.getParentLayout().getLastFragment();
            List fragmentStack = lastFragment.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            int size = parentLayout.getFragmentStack().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(size);
                if (r2Var instanceof un) {
                    un unVar = (un) r2Var;
                    org.telegram.ui.ActionBar.r2 r2Var2 = lastFragment;
                    if (unVar.a() == jsVar.H && unVar.f44224d4 == 0) {
                        unVar.fb(false, null);
                        int size2 = arrayList.size() - 1;
                        while (size2 >= 0) {
                            org.telegram.ui.ActionBar.r2 r2Var3 = r2Var2;
                            if (arrayList.get(size2) != r2Var3) {
                                ((org.telegram.ui.ActionBar.r2) arrayList.get(size2)).removeSelfFromStack();
                            }
                            size2--;
                            r2Var2 = r2Var3;
                        }
                        r2Var2.finishFragment();
                    } else {
                        lastFragment = r2Var2;
                    }
                }
                arrayList.add((org.telegram.ui.ActionBar.r2) fragmentStack.get(size));
                size--;
            }
        }
        if (inputFile == null && inputFile2 == null) {
            jsVar.e.h(ImageLocation.getForLocal(jsVar.Q), "50_50", jsVar.f40736n, jsVar.getMessagesController().getUser(Long.valueOf(jsVar.H)));
            if (jsVar.S == 2) {
                jsVar.e0(true, false);
            } else {
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.random_id = SendMessagesHelper.getInstance(jsVar.currentAccount).getNextRandomId();
                tL_messageService.dialog_id = jsVar.H;
                tL_messageService.unread = true;
                tL_messageService.out = true;
                int newMessageId = jsVar.getUserConfig().getNewMessageId();
                tL_messageService.f22048id = newMessageId;
                tL_messageService.local_id = newMessageId;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_messageService.from_id = tL_peerUser;
                tL_peerUser.user_id = jsVar.getUserConfig().getClientUserId();
                tL_messageService.flags |= 256;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_messageService.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = jsVar.H;
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
                jsVar.Z = messageObject;
                arrayList2.add(messageObject);
                new ArrayList().add(tL_messageService);
                MessagesController.getInstance(jsVar.currentAccount).updateInterfaceWithMessages(jsVar.H, arrayList2, 0);
                jsVar.getMessagesController().photoSuggestion.put(tL_messageService.local_id, g50Var);
            }
        } else {
            TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.H));
            if (jsVar.Z == null && user != null) {
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
                jsVar.getMessagesStorage().putUsersAndChats(arrayList3, null, false, true);
                jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
            }
            jsVar.d0(jsVar.Q, photoSize2.location, inputFile, inputFile2, videoSize, d, jsVar.S);
            jsVar.e0(false, true);
        }
        jsVar.g0();
    }

    public static void Y(js jsVar, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i10) {
        if (jsVar.Z == null) {
            if ((fileLocation != null || inputFile != null) && tLObject != null) {
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.User user = jsVar.getMessagesController().getUser(Long.valueOf(jsVar.H));
                TLRPC.UserFull userFull = MessagesController.getInstance(jsVar.currentAccount).getUserFull(jsVar.H);
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
                        String n10 = a1.g.n(fileLocation.local_id, "@50_50", sb2);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(closestPhotoSizeWithSize.location.volume_id);
                        sb3.append("_");
                        ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForUser(jsVar.currentAccount, user, 1), false);
                    }
                    if (closestPhotoSizeWithSize2 != null && fileLocation2 != null) {
                        FileLoader.getInstance(jsVar.currentAccount).getPathToAttach(fileLocation2, true).renameTo(FileLoader.getInstance(jsVar.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                    ag.s0.a(tL_photos_photo.photo, user, true);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(user);
                    jsVar.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                    jsVar.getMessagesController().getDialogPhotos(jsVar.H).addPhotoAtStart(tL_photos_photo.photo);
                    jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
                    jsVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_AVATAR));
                    if (jsVar.getParentActivity() != null) {
                        if (i10 == 2) {
                            org.telegram.ui.Components.wc.b0(jsVar).W(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        } else {
                            org.telegram.ui.Components.wc.b0(jsVar).W(arrayList2, AndroidUtilities.replaceTags(LocaleController.formatString("UserCustomPhotoSeted", R.string.UserCustomPhotoSeted, user.first_name)), null, null).j();
                        }
                    }
                }
                jsVar.Q = null;
                jsVar.g0();
            }
        }
    }

    public static void Z(js jsVar) {
        if (jsVar.Z != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(jsVar.Z.getId()));
            NotificationCenter.getInstance(jsVar.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDeleted, arrayList, 0L, Boolean.FALSE);
        }
    }

    @Override
    public final void F(float f7) {
        RadialProgressView radialProgressView = this.f40738s;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        RadialProgressView radialProgressView = this.f40738s;
        if (radialProgressView == null) {
            return;
        }
        this.S = this.R;
        radialProgressView.setProgress(0.0f);
    }

    @Override
    public final void Q() {
        AndroidUtilities.runOnUIThread(new zr(this, 0));
    }

    @Override
    public final void R(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                js.X(js.this, photoSize2, inputFile, inputFile2, photoSize, videoSize, d, z10);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23502l6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23484k6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
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
        int i15;
        float f7;
        float f10;
        int i16;
        float f11;
        float f12;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (this.I) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.NewContact));
        } else {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.EditContact));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new fs(this));
        org.telegram.ui.ActionBar.r5 r5Var = this.simpleActionBar;
        if (this.I) {
            i10 = R.string.Create;
        } else {
            i10 = R.string.Save;
        }
        this.f40732a = r5Var.i(LocaleController.getString(i10));
        FrameLayout frameLayout = new FrameLayout(context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.V = frameLayout2;
        int i17 = org.telegram.ui.ActionBar.y6.f23356d6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f40737r;
        org.telegram.ui.ActionBar.f7.i(i17, frameLayout2, u6Var);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.e = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(32.0f));
        FrameLayout frameLayout3 = this.V;
        org.telegram.ui.Components.y9 y9Var2 = this.e;
        int i18 = 3;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        frameLayout3.addView(y9Var2, org.telegram.ui.Components.gb1.h(64, 64.0f, i11 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        Paint paint = new Paint(1);
        paint.setColor(1426063360);
        fi.f6 f6Var = new fi.f6(this, context, paint, 9);
        this.v = f6Var;
        FrameLayout frameLayout4 = this.V;
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        frameLayout4.addView(f6Var, org.telegram.ui.Components.gb1.h(64, 64.0f, i12 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f40738s = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(30.0f));
        this.f40738s.setProgressColor(-1);
        this.f40738s.setNoProgress(false);
        FrameLayout frameLayout5 = this.V;
        RadialProgressView radialProgressView2 = this.f40738s;
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        frameLayout5.addView(radialProgressView2, org.telegram.ui.Components.gb1.h(64, 64.0f, i13 | 48, 16.0f, 13.0f, 16.0f, 13.0f));
        e0(false, false);
        TextView textView = new TextView(context);
        this.f40735f = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, u6Var);
        this.f40735f.setTextSize(1, 18.0f);
        this.f40735f.setLines(1);
        this.f40735f.setMaxLines(1);
        this.f40735f.setSingleLine(true);
        TextView textView2 = this.f40735f;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView textView3 = this.f40735f;
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView3.setGravity(i14);
        this.f40735f.setTypeface(AndroidUtilities.bold());
        FrameLayout frameLayout6 = this.V;
        TextView textView4 = this.f40735f;
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i19 = i15 | 48;
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
        TextView k10 = d3.k(frameLayout6, textView4, org.telegram.ui.Components.gb1.h(-2, -2.0f, i19, f7, 25.66f, f10, 0.0f), context);
        this.h = k10;
        org.telegram.ui.ActionBar.f7.V(k10, org.telegram.ui.ActionBar.y6.A6, u6Var);
        this.h.setTextSize(1, 14.0f);
        this.h.setLines(1);
        this.h.setMaxLines(1);
        this.h.setSingleLine(true);
        this.h.setEllipsize(truncateAt);
        TextView textView5 = this.h;
        if (LocaleController.isRTL) {
            i16 = 5;
        } else {
            i16 = 3;
        }
        textView5.setGravity(i16);
        FrameLayout frameLayout7 = this.V;
        TextView textView6 = this.h;
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i18 = 5;
        }
        int i20 = i18 | 48;
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
        frameLayout7.addView(textView6, org.telegram.ui.Components.gb1.h(-2, -2.0f, i20, f11, 49.66f, f12, 0.0f));
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.FirstName), false, false, -1, this.f40737r);
        this.f40733b = g3Var;
        g3Var.d.setImeOptions(5);
        org.telegram.ui.ActionBar.f7.i(i17, this.f40733b, u6Var);
        this.f40733b.setDivider(true);
        this.f40733b.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final js f38928b;

            {
                this.f38928b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            js jsVar = this.f38928b;
                            jsVar.f40734c.d.requestFocus();
                            org.telegram.ui.Cells.e3 e3Var = jsVar.f40734c.d;
                            e3Var.setSelection(e3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        js jsVar2 = this.f38928b;
                        if (i21 == 6) {
                            jsVar2.f40732a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            jsVar2.d.d.requestFocus();
                            jsVar2.d.d.setSelection(jsVar2.f40734c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        js jsVar3 = this.f38928b;
                        if (i21 == 6) {
                            jsVar3.f40732a.performClick();
                            return true;
                        }
                        jsVar3.getClass();
                        return false;
                }
            }
        });
        this.f40733b.d.setOnFocusChangeListener(new Object());
        this.f40733b.setText(this.M);
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.LastName), false, false, -1, this.f40737r);
        this.f40734c = g3Var2;
        g3Var2.d.setImeOptions(5);
        org.telegram.ui.ActionBar.f7.i(i17, this.f40734c, u6Var);
        this.f40734c.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final js f38928b;

            {
                this.f38928b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            js jsVar = this.f38928b;
                            jsVar.f40734c.d.requestFocus();
                            org.telegram.ui.Cells.e3 e3Var = jsVar.f40734c.d;
                            e3Var.setSelection(e3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        js jsVar2 = this.f38928b;
                        if (i21 == 6) {
                            jsVar2.f40732a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            jsVar2.d.d.requestFocus();
                            jsVar2.d.d.setSelection(jsVar2.f40734c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        js jsVar3 = this.f38928b;
                        if (i21 == 6) {
                            jsVar3.f40732a.performClick();
                            return true;
                        }
                        jsVar3.getClass();
                        return false;
                }
            }
        });
        this.f40734c.setText(this.N);
        org.telegram.ui.Cells.g3 g3Var3 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.AddNotes), true, true, getMessagesController().config.contactNoteLengthLimit.get(), this.f40737r);
        this.d = g3Var3;
        org.telegram.ui.ActionBar.f7.H(g3Var3.d, org.telegram.ui.ActionBar.y6.gc, u6Var);
        this.d.d.setImeOptions(6);
        org.telegram.ui.ActionBar.f7.i(i17, this.d, u6Var);
        this.d.d.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
            public final js f38928b;

            {
                this.f38928b = this;
            }

            @Override
            public final boolean onEditorAction(TextView textView7, int i21, KeyEvent keyEvent) {
                switch (r2) {
                    case 0:
                        if (i21 == 5) {
                            js jsVar = this.f38928b;
                            jsVar.f40734c.d.requestFocus();
                            org.telegram.ui.Cells.e3 e3Var = jsVar.f40734c.d;
                            e3Var.setSelection(e3Var.length());
                            return true;
                        }
                        return false;
                    case 1:
                        js jsVar2 = this.f38928b;
                        if (i21 == 6) {
                            jsVar2.f40732a.performClick();
                            return true;
                        } else if (i21 == 5) {
                            jsVar2.d.d.requestFocus();
                            jsVar2.d.d.setSelection(jsVar2.f40734c.d.length());
                            return true;
                        } else {
                            return false;
                        }
                    default:
                        js jsVar3 = this.f38928b;
                        if (i21 == 6) {
                            jsVar3.f40732a.performClick();
                            return true;
                        }
                        jsVar3.getClass();
                        return false;
                }
            }
        });
        if (!this.I) {
            final TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.H));
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context, u6Var);
            this.f40740x = v8Var;
            v8Var.o(R.drawable.msg_addphoto, LocaleController.formatString(R.string.SuggestUserPhoto, user.first_name), true);
            this.f40740x.setBackground(org.telegram.ui.ActionBar.y6.L0(u6Var, true));
            org.telegram.ui.Cells.v8 v8Var2 = this.f40740x;
            int i21 = org.telegram.ui.ActionBar.y6.f23692v6;
            int i22 = org.telegram.ui.ActionBar.y6.f23673u6;
            v8Var2.g(i21, i22);
            final org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(R.raw.photo_suggest_icon, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f40740x.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f40740x.e.setAnimation(xj0Var);
            this.f40740x.setOnClickListener(new View.OnClickListener(this) {
                public final js f39174b;

                {
                    this.f39174b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final js jsVar = this.f39174b;
                            boolean z13 = true;
                            jsVar.R = 1;
                            org.telegram.ui.Components.g50 g50Var = jsVar.P;
                            TLRPC.User user2 = user;
                            g50Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ag.c cVar = new ag.c(25);
                            final org.telegram.ui.Components.xj0 xj0Var2 = xj0Var;
                            g50Var.n(z13, cVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            js jsVar2 = jsVar;
                                            boolean g7 = jsVar2.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var3 = xj0Var2;
                                            if (!g7) {
                                                xj0Var3.P(86);
                                                jsVar2.f40741y.e.d();
                                                return;
                                            }
                                            xj0Var3.N(0, false, false);
                                            return;
                                        default:
                                            js jsVar3 = jsVar;
                                            boolean g10 = jsVar3.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var4 = xj0Var2;
                                            if (!g10) {
                                                xj0Var4.P(85);
                                                jsVar3.f40740x.e.d();
                                                return;
                                            }
                                            xj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            xj0Var2.M(0);
                            xj0Var2.P(43);
                            jsVar.f40740x.e.d();
                            return;
                        default:
                            final js jsVar2 = this.f39174b;
                            jsVar2.R = 2;
                            org.telegram.ui.Components.g50 g50Var2 = jsVar2.P;
                            TLRPC.User user3 = user;
                            g50Var2.L = user3;
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
                            ag.c cVar2 = new ag.c(25);
                            final org.telegram.ui.Components.xj0 xj0Var3 = xj0Var;
                            g50Var2.n(z12, cVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            js jsVar22 = jsVar2;
                                            boolean g7 = jsVar22.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var32 = xj0Var3;
                                            if (!g7) {
                                                xj0Var32.P(86);
                                                jsVar22.f40741y.e.d();
                                                return;
                                            }
                                            xj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            js jsVar3 = jsVar2;
                                            boolean g10 = jsVar3.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var4 = xj0Var3;
                                            if (!g10) {
                                                xj0Var4.P(85);
                                                jsVar3.f40740x.e.d();
                                                return;
                                            }
                                            xj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            xj0Var3.M(0);
                            xj0Var3.P(43);
                            jsVar2.f40741y.e.d();
                            return;
                    }
                }
            });
            org.telegram.ui.Cells.v8 v8Var3 = new org.telegram.ui.Cells.v8(context, u6Var);
            this.f40741y = v8Var3;
            v8Var3.o(R.drawable.msg_addphoto, LocaleController.formatString(R.string.UserSetPhoto, user.first_name), false);
            this.f40741y.setBackground(org.telegram.ui.ActionBar.y6.L0(u6Var, true));
            this.f40741y.g(i21, i22);
            final org.telegram.ui.Components.xj0 xj0Var2 = new org.telegram.ui.Components.xj0(R.raw.camera_outline, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f), false, null);
            this.f40741y.e.setTranslationX(-AndroidUtilities.dp(8.0f));
            this.f40741y.e.setAnimation(xj0Var2);
            this.f40741y.setOnClickListener(new View.OnClickListener(this) {
                public final js f39174b;

                {
                    this.f39174b = this;
                }

                @Override
                public final void onClick(View view) {
                    TLRPC.FileLocation fileLocation;
                    TLRPC.FileLocation fileLocation2;
                    boolean z12;
                    switch (r4) {
                        case 0:
                            final js jsVar = this.f39174b;
                            boolean z13 = true;
                            jsVar.R = 1;
                            org.telegram.ui.Components.g50 g50Var = jsVar.P;
                            TLRPC.User user2 = user;
                            g50Var.L = user2;
                            TLRPC.UserProfilePhoto userProfilePhoto = user2.photo;
                            if (userProfilePhoto == null) {
                                fileLocation = null;
                            } else {
                                fileLocation = userProfilePhoto.photo_small;
                            }
                            if (fileLocation == null) {
                                z13 = false;
                            }
                            ag.c cVar = new ag.c(25);
                            final org.telegram.ui.Components.xj0 xj0Var22 = xj0Var2;
                            g50Var.n(z13, cVar, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            js jsVar22 = jsVar;
                                            boolean g7 = jsVar22.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var32 = xj0Var22;
                                            if (!g7) {
                                                xj0Var32.P(86);
                                                jsVar22.f40741y.e.d();
                                                return;
                                            }
                                            xj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            js jsVar3 = jsVar;
                                            boolean g10 = jsVar3.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var4 = xj0Var22;
                                            if (!g10) {
                                                xj0Var4.P(85);
                                                jsVar3.f40740x.e.d();
                                                return;
                                            }
                                            xj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 2);
                            xj0Var22.M(0);
                            xj0Var22.P(43);
                            jsVar.f40740x.e.d();
                            return;
                        default:
                            final js jsVar2 = this.f39174b;
                            jsVar2.R = 2;
                            org.telegram.ui.Components.g50 g50Var2 = jsVar2.P;
                            TLRPC.User user3 = user;
                            g50Var2.L = user3;
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
                            ag.c cVar2 = new ag.c(25);
                            final org.telegram.ui.Components.xj0 xj0Var3 = xj0Var2;
                            g50Var2.n(z12, cVar2, new DialogInterface.OnDismissListener() {
                                @Override
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    switch (r3) {
                                        case 0:
                                            js jsVar22 = jsVar2;
                                            boolean g7 = jsVar22.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var32 = xj0Var3;
                                            if (!g7) {
                                                xj0Var32.P(86);
                                                jsVar22.f40741y.e.d();
                                                return;
                                            }
                                            xj0Var32.N(0, false, false);
                                            return;
                                        default:
                                            js jsVar3 = jsVar2;
                                            boolean g10 = jsVar3.P.g();
                                            org.telegram.ui.Components.xj0 xj0Var4 = xj0Var3;
                                            if (!g10) {
                                                xj0Var4.P(85);
                                                jsVar3.f40740x.e.d();
                                                return;
                                            }
                                            xj0Var4.N(0, false, false);
                                            return;
                                    }
                                }
                            }, 1);
                            xj0Var3.M(0);
                            xj0Var3.P(43);
                            jsVar2.f40741y.e.d();
                            return;
                    }
                }
            });
            this.U = new org.telegram.ui.Components.y9(context);
            this.E = new hs(this, context, u6Var);
            if (this.f40736n == null) {
                this.f40736n = new org.telegram.ui.Components.j9(0, user);
            }
            this.U.f(user.photo, this.f40736n);
            this.E.addView(this.U, org.telegram.ui.Components.gb1.h(30, 30.0f, 16, 21.0f, 0.0f, 21.0f, 0.0f));
            this.E.k(LocaleController.getString(R.string.ResetToOriginalPhoto), false);
            this.E.getImageView().setVisibility(0);
            this.E.setBackground(org.telegram.ui.ActionBar.y6.L0(u6Var, true));
            this.E.g(i21, i22);
            this.E.setOnClickListener(new z(this, context, user, 10));
            org.telegram.ui.Cells.v8 v8Var4 = new org.telegram.ui.Cells.v8(context, u6Var);
            this.F = v8Var4;
            v8Var4.o(R.drawable.menu_birthday, LocaleController.formatString(R.string.UserSuggestBirthday, new Object[0]), false);
            this.F.setBackground(org.telegram.ui.ActionBar.y6.L0(u6Var, true));
            this.F.g(i21, i22);
            this.F.setNeedDivider(true);
            this.F.e.setTranslationX(AndroidUtilities.dp(4.0f));
            this.F.setOnClickListener(new org.telegram.ui.Components.k51(8, this, user));
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
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(this, new e5(this, 7), new y0(this, 28), null);
        this.W = r71Var;
        r71Var.u1();
        this.W.setSectionsDrawBackground(true);
        this.W.setOnScrollListener(new ai.u0(5, this, frameLayout));
        frameLayout.addView(this.W, org.telegram.ui.Components.gb1.i(-1, -1, 119));
        if (this.I && this.K) {
            this.X = true;
        }
        this.W.f32152g3.O(false);
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
        getConnectionsManager().sendRequest(tL_photos_uploadContactProfilePhoto, new ag.p0(this, fileLocation, inputFile2, fileLocation2, i10, 10));
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
        if (this.f40738s == null) {
            return;
        }
        AnimatorSet animatorSet = this.f40739w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f40739w = null;
        }
        if (z11) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.f40739w = animatorSet2;
            if (z10) {
                this.f40738s.setVisibility(0);
                this.v.setVisibility(0);
                AnimatorSet animatorSet3 = this.f40739w;
                RadialProgressView radialProgressView = this.f40738s;
                Property property = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(radialProgressView, property, 1.0f), ObjectAnimator.ofFloat(this.v, property, 1.0f));
            } else {
                RadialProgressView radialProgressView2 = this.f40738s;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView2, property2, 0.0f), ObjectAnimator.ofFloat(this.v, property2, 0.0f));
            }
            this.f40739w.setDuration(180L);
            this.f40739w.addListener(new jo(27, this, z10));
            this.f40739w.start();
        } else if (z10) {
            this.f40738s.setAlpha(1.0f);
            this.f40738s.setVisibility(0);
            this.v.setAlpha(1.0f);
            this.v.setVisibility(0);
        } else {
            this.f40738s.setAlpha(0.0f);
            this.f40738s.setVisibility(4);
            this.v.setAlpha(0.0f);
            this.v.setVisibility(4);
        }
    }

    public final void f0() {
        TLRPC.User user;
        if (this.f40735f != null && (user = getMessagesController().getUser(Long.valueOf(this.H))) != null) {
            if (TextUtils.isEmpty(c0())) {
                this.f40735f.setText(LocaleController.getString(R.string.MobileHidden));
            } else {
                TextView textView = this.f40735f;
                kf.b c10 = kf.b.c();
                textView.setText(c10.b("+" + c0()));
            }
            this.h.setText(LocaleController.formatUserStatus(this.currentAccount, user));
            if (this.Q == null) {
                org.telegram.ui.Components.y9 y9Var = this.e;
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(0, user);
                this.f40736n = j9Var;
                y9Var.f(user, j9Var);
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
            this.U.h(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1000), this.T), "50_50", this.f40736n, null);
        }
        if (this.f40736n == null) {
            this.f40736n = new org.telegram.ui.Components.j9(0, user);
        }
        TLRPC.FileLocation fileLocation = this.Q;
        if (fileLocation == null) {
            this.e.f(user, this.f40736n);
        } else {
            this.e.h(ImageLocation.getForLocal(fileLocation), "50_50", this.f40736n, getMessagesController().getUser(Long.valueOf(this.H)));
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
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.W;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.f40737r;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return new ArrayList();
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
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
        org.telegram.ui.Components.g50 g50Var = this.P;
        if (g50Var != null) {
            g50Var.f28421a = this;
            g50Var.f28422b = this;
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
        org.telegram.ui.Components.g50 g50Var = this.P;
        if (g50Var != null) {
            g50Var.d();
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
        f0();
        this.P.k();
    }

    @Override
    public final void onThemeColorsChanged() {
        TLRPC.User user;
        try {
            super.onThemeColorsChanged();
            if (this.e != null && (user = getMessagesController().getUser(Long.valueOf(this.H))) != null) {
                this.f40736n.m(this.currentAccount, user);
                this.e.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public js(Bundle bundle, org.telegram.ui.ActionBar.u6 u6Var) {
        super(bundle);
        this.X = false;
        this.Y = true;
        this.f40737r = u6Var;
        this.P = new org.telegram.ui.Components.g50(0, true, true);
    }
}

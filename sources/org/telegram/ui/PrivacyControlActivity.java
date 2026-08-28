package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d40 {
    public final boolean[] A;
    public boolean A0;
    public final boolean[] B;
    public boolean B0;
    public ArrayList C;
    public boolean C0;
    public ArrayList D;
    public boolean D0;
    public int E;
    public boolean E0;
    public int F;
    public boolean F0;
    public long G;
    public boolean G0;
    public long H;
    public boolean H0;
    public int I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public int K0;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public uw0 f35871a;
    public int f35872a0;
    public org.telegram.ui.Components.fr f35873b;
    public int f35874b0;
    public org.telegram.ui.ActionBar.w0 f35875c;
    public int f35876c0;
    private int currentPhotoForRestRow;
    public org.telegram.ui.Components.wk0 d;
    public int f35877d0;
    public vw0 f35878e;
    public int f35879e0;
    private int everybodyRow;
    public int f35880f;
    public int f35881f0;
    public int f35882g0;
    private int giftTypesHeaderRow;
    public int h;
    public int f35883h0;
    public int f35884i0;
    public int f35885j0;
    public int f35886k0;
    public int f35887l0;
    public int m0;
    public final ArrayList f35888n;
    public int f35889n0;
    private int nobodyRow;
    public final org.telegram.ui.Components.e40 f35890o0;
    public org.telegram.ui.Components.mi0 f35891p0;
    private int photoForRestRow;
    private int priceRow;
    public org.telegram.ui.Cells.p8 f35892q0;
    public final ArrayList f35893r;
    public org.telegram.ui.Components.o9 f35894r0;
    private int readRow;
    public final boolean[] f35895s;
    public gs f35896s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public TLRPC.PhotoSize f35897t0;
    public TLRPC.Photo f35898u0;
    public final boolean[] v;
    public SpannableString f35899v0;
    public final boolean[] f35900w;
    public boolean f35901w0;
    public final int f35902x;
    public boolean f35903x0;
    public final boolean[] f35904y;
    public boolean f35905y0;
    public boolean f35906z0;

    public PrivacyControlActivity(int i9, boolean z10) {
        super(null);
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        this.f35888n = new ArrayList();
        this.f35893r = new ArrayList();
        this.f35895s = new boolean[4];
        this.v = new boolean[4];
        this.f35900w = new boolean[4];
        this.f35904y = new boolean[4];
        this.A = new boolean[4];
        this.B = new boolean[4];
        this.H = 10L;
        this.K0 = 4;
        this.f35902x = i9;
        if (z10) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (i9 == 4) {
            org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
            this.f35890o0 = e40Var;
            e40Var.f27909a = this;
            e40Var.f27910b = this;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, 1000)) == null) {
                return;
            }
            this.f35897t0 = closestPhotoSizeWithSize;
            this.f35898u0 = userFull.fallback_photo;
        }
    }

    public static void T(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.f35897t0 = null;
        privacyControlActivity.f35898u0 = null;
        TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
        if (userFull != null && (photo = userFull.fallback_photo) != null) {
            userFull.flags &= -4194305;
            userFull.fallback_photo = null;
            privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
            privacyControlActivity.C0();
            privacyControlActivity.E0(true);
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f22399id = photo.f22404id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            MessagesController.getInstance(privacyControlActivity.currentAccount).deleteUserPhoto(tL_inputPhoto);
            NotificationCenter.getInstance(privacyControlActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
        }
    }

    public static void U(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
            MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
            ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, 13);
            AndroidUtilities.runOnUIThread(new ys0(7, privacyControlActivity, zArr));
            return;
        }
        privacyControlActivity.A0();
    }

    public static void V(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
            userFull.flags |= 4194304;
            userFull.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
            NotificationCenter.getInstance(privacyControlActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
            if (closestPhotoSizeWithSize != null && privacyControlActivity.f35897t0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.f35897t0, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.f35897t0.location.volume_id);
                sb2.append("_");
                String l10 = aa.d.l(privacyControlActivity.f35897t0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 != null && privacyControlActivity.f35897t0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.f35897t0.location, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
        }
    }

    public static void W(PrivacyControlActivity privacyControlActivity, View view, int i9) {
        ArrayList arrayList;
        String str;
        int i10;
        boolean z10;
        boolean z11;
        char c10;
        int i11;
        int i12 = privacyControlActivity.f35902x;
        if (i9 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.y4.O(privacyControlActivity.getParentActivity(), LocaleController.getString(R.string.RemovePublicPhoto), LocaleController.getString(R.string.RemovePhotoForRestDescription), LocaleController.getString(R.string.Remove), new iw0(privacyControlActivity, 1), null).f22702a;
            c2Var.show();
            c2Var.h();
            return;
        }
        int i13 = 0;
        r2 = false;
        boolean z12 = false;
        int i14 = 0;
        if (i9 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.e40 e40Var = privacyControlActivity.f35890o0;
            if (e40Var != null) {
                e40Var.o(false, new bg.d2(23), new r5(privacyControlActivity, 13), 0);
                privacyControlActivity.f35891p0.K(0);
                privacyControlActivity.f35891p0.N(43);
                privacyControlActivity.f35892q0.f24875e.d();
            }
        } else if (i12 == 10 && i9 == privacyControlActivity.K && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium()) {
            org.telegram.ui.Components.oc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new iw0(privacyControlActivity, 2)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i15 = -privacyControlActivity.K0;
            privacyControlActivity.K0 = i15;
            AndroidUtilities.shakeViewSpring(view, i15);
        } else if (i12 == 8 && ((i9 == privacyControlActivity.K || i9 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().isPremium())) {
            org.telegram.ui.Components.oc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new iw0(privacyControlActivity, 3)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i16 = -privacyControlActivity.K0;
            privacyControlActivity.K0 = i16;
            AndroidUtilities.shakeViewSpring(view, i16);
        } else if (i9 != privacyControlActivity.nobodyRow && i9 != privacyControlActivity.everybodyRow && i9 != privacyControlActivity.K && i9 != privacyControlActivity.f35876c0) {
            if (i9 != privacyControlActivity.T && i9 != privacyControlActivity.S) {
                if (i9 != privacyControlActivity.P && i9 != privacyControlActivity.O) {
                    if (i9 == privacyControlActivity.X) {
                        privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
                        return;
                    } else if (i9 == privacyControlActivity.readRow) {
                        privacyControlActivity.f35903x0 = !privacyControlActivity.f35903x0;
                        privacyControlActivity.D0();
                        ((org.telegram.ui.Cells.t8) view).setChecked(privacyControlActivity.f35903x0);
                        return;
                    } else if (i9 == privacyControlActivity.f35872a0) {
                        privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
                        return;
                    } else if (i9 == privacyControlActivity.showGiftIconRow) {
                        privacyControlActivity.f35906z0 = !privacyControlActivity.f35906z0;
                        privacyControlActivity.D0();
                        ((org.telegram.ui.Cells.t8) view).setChecked(privacyControlActivity.f35906z0);
                        return;
                    } else if (i9 == privacyControlActivity.f35884i0) {
                        if (privacyControlActivity.D0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i17 = -privacyControlActivity.K0;
                            privacyControlActivity.K0 = i17;
                            AndroidUtilities.shakeViewSpring(view, i17);
                            privacyControlActivity.B0();
                            return;
                        }
                        boolean t02 = privacyControlActivity.t0();
                        privacyControlActivity.D0 = !privacyControlActivity.D0;
                        privacyControlActivity.D0();
                        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                        t8Var.setChecked(privacyControlActivity.D0);
                        if (privacyControlActivity.D0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            t8Var.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (t02 != privacyControlActivity.t0()) {
                            privacyControlActivity.E0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                            return;
                        }
                        return;
                    } else if (i9 == privacyControlActivity.f35883h0) {
                        if (privacyControlActivity.B0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i18 = -privacyControlActivity.K0;
                            privacyControlActivity.K0 = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            privacyControlActivity.B0();
                            return;
                        }
                        boolean t03 = privacyControlActivity.t0();
                        privacyControlActivity.B0 = !privacyControlActivity.B0;
                        privacyControlActivity.D0();
                        org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
                        t8Var2.setChecked(privacyControlActivity.B0);
                        if (privacyControlActivity.B0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            t8Var2.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (t03 != privacyControlActivity.t0()) {
                            privacyControlActivity.E0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                            return;
                        }
                        return;
                    } else if (i9 == privacyControlActivity.f35885j0) {
                        if (privacyControlActivity.F0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i19 = -privacyControlActivity.K0;
                            privacyControlActivity.K0 = i19;
                            AndroidUtilities.shakeViewSpring(view, i19);
                            privacyControlActivity.B0();
                            return;
                        }
                        boolean t04 = privacyControlActivity.t0();
                        privacyControlActivity.F0 = !privacyControlActivity.F0;
                        privacyControlActivity.D0();
                        org.telegram.ui.Cells.t8 t8Var3 = (org.telegram.ui.Cells.t8) view;
                        t8Var3.setChecked(privacyControlActivity.F0);
                        if (privacyControlActivity.F0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            t8Var3.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (t04 != privacyControlActivity.t0()) {
                            privacyControlActivity.E0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                            return;
                        }
                        return;
                    } else if (i9 == privacyControlActivity.f35886k0) {
                        if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i20 = -privacyControlActivity.K0;
                            privacyControlActivity.K0 = i20;
                            AndroidUtilities.shakeViewSpring(view, i20);
                            privacyControlActivity.B0();
                            return;
                        }
                        boolean t05 = privacyControlActivity.t0();
                        privacyControlActivity.H0 = !privacyControlActivity.H0;
                        privacyControlActivity.D0();
                        org.telegram.ui.Cells.t8 t8Var4 = (org.telegram.ui.Cells.t8) view;
                        t8Var4.setChecked(privacyControlActivity.H0);
                        if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            t8Var4.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (t05 != privacyControlActivity.t0()) {
                            privacyControlActivity.E0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                            return;
                        }
                        return;
                    } else if (i9 == privacyControlActivity.f35887l0) {
                        if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i21 = -privacyControlActivity.K0;
                            privacyControlActivity.K0 = i21;
                            AndroidUtilities.shakeViewSpring(view, i21);
                            privacyControlActivity.B0();
                            return;
                        }
                        boolean t06 = privacyControlActivity.t0();
                        privacyControlActivity.J0 = !privacyControlActivity.J0;
                        privacyControlActivity.D0();
                        org.telegram.ui.Cells.t8 t8Var5 = (org.telegram.ui.Cells.t8) view;
                        t8Var5.setChecked(privacyControlActivity.J0);
                        if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            t8Var5.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (t06 != privacyControlActivity.t0()) {
                            privacyControlActivity.E0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i12 == 12 && privacyControlActivity.t0()) {
                    int i22 = -privacyControlActivity.K0;
                    privacyControlActivity.K0 = i22;
                    AndroidUtilities.shakeViewSpring(view, i22);
                    return;
                } else {
                    if (i9 == privacyControlActivity.P) {
                        arrayList = privacyControlActivity.D;
                    } else {
                        arrayList = privacyControlActivity.C;
                    }
                    Bundle bundle = new Bundle();
                    if (i9 == privacyControlActivity.P) {
                        str = "isNeverShare";
                    } else {
                        str = "isAlwaysShare";
                    }
                    bundle.putBoolean(str, true);
                    if (i12 != 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    bundle.putInt("chatAddType", i10);
                    if (i9 == privacyControlActivity.O && i12 == 1) {
                        bundle.putBoolean("allowPremium", true);
                    }
                    if (i12 == 12 && ((i11 = privacyControlActivity.E) != 1 ? !(i11 != 2 ? i11 != 0 || i9 != privacyControlActivity.P : i9 != privacyControlActivity.O) : i9 == privacyControlActivity.O)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bundle.putBoolean("allowMiniapps", z10);
                    k60 k60Var = new k60(bundle);
                    if (i12 == 10) {
                        k60Var.H = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    }
                    if (i9 == privacyControlActivity.O) {
                        boolean[] zArr = privacyControlActivity.f35904y;
                        if (privacyControlActivity.E == 2) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (zArr[c10]) {
                            z11 = true;
                            if (z10 && privacyControlActivity.A[privacyControlActivity.E]) {
                                z12 = true;
                            }
                            k60Var.o0(arrayList, z11, z12);
                            k60Var.f39749w = new kg.a(i9, privacyControlActivity, z10);
                            k60Var.f39726a0 = true;
                            privacyControlActivity.presentFragment(k60Var);
                            return;
                        }
                    }
                    z11 = false;
                    if (z10) {
                        z12 = true;
                    }
                    k60Var.o0(arrayList, z11, z12);
                    k60Var.f39749w = new kg.a(i9, privacyControlActivity, z10);
                    k60Var.f39726a0 = true;
                    privacyControlActivity.presentFragment(k60Var);
                    return;
                }
            }
            if (i9 != privacyControlActivity.S) {
                i14 = 1;
            }
            if (i14 != privacyControlActivity.F) {
                privacyControlActivity.F = i14;
                privacyControlActivity.D0();
                privacyControlActivity.E0(true);
            }
        } else if (i12 == 12 && privacyControlActivity.t0()) {
            int i23 = -privacyControlActivity.K0;
            privacyControlActivity.K0 = i23;
            AndroidUtilities.shakeViewSpring(view, i23);
        } else {
            if (i9 == privacyControlActivity.nobodyRow) {
                i13 = 1;
            } else if (i9 != privacyControlActivity.everybodyRow) {
                if (i9 == privacyControlActivity.f35876c0) {
                    i13 = 3;
                } else {
                    i13 = 2;
                }
            }
            if (i13 == privacyControlActivity.E) {
                return;
            }
            privacyControlActivity.E = i13;
            org.telegram.ui.Components.gc.e();
            privacyControlActivity.D0();
            privacyControlActivity.E0(true);
        }
    }

    public static void X(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(((TL_account.privacyRules) tLObject).rules, 7);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.w0();
                return;
            }
            return;
        }
        org.telegram.ui.Components.oc.a0(privacyControlActivity).d0(tL_error, false);
    }

    public static void Y(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
            MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
            ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, privacyControlActivity.f35902x);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.w0();
                return;
            }
            return;
        }
        privacyControlActivity.A0();
    }

    public final void A0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyFloodControlError);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder.f22702a);
    }

    public final void B0() {
        org.telegram.ui.Components.oc.a0(this).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new iw0(this, 0)).j();
    }

    public final void C0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.p8 p8Var = this.f35892q0;
        if (p8Var != null) {
            if (this.f35897t0 == null) {
                p8Var.getTextView().k(LocaleController.formatString("SetPhotoForRest", R.string.SetPhotoForRest, new Object[0]));
                this.f35892q0.setNeedDivider(false);
            } else {
                p8Var.getTextView().k(LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]));
                this.f35892q0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.o9 o9Var = this.f35894r0;
        if (o9Var != null && (photoSize = this.f35897t0) != null) {
            TLRPC.Photo photo = this.f35898u0;
            if (photo != null) {
                o9Var.h(ImageLocation.getForPhoto(photoSize, photo), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
            } else {
                o9Var.h(ImageLocation.getForLocal(photoSize.location), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
            }
        }
    }

    public final void D0() {
        float f10;
        float f11;
        boolean x02 = x0();
        this.f35875c.setEnabled(x02);
        ViewPropertyAnimator animate = this.f35875c.animate();
        float f12 = 0.0f;
        if (x02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (x02) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (x02) {
            f12 = 1.0f;
        }
        scaleX.scaleY(f12).setDuration(180L).start();
    }

    public final void E0(boolean z10) {
        qw0 qw0Var;
        ArrayList arrayList;
        int i9;
        f2.q1 T;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        TLRPC.UserFull userFull;
        if (z10) {
            qw0Var = new qw0(this);
            qw0Var.f(qw0Var.f42214c);
            qw0Var.f42213b = this.f35889n0;
        } else {
            qw0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.V = -1;
        this.I = -1;
        this.setBirthdayRow = -1;
        this.U = -1;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.O = -1;
        this.P = -1;
        this.W = -1;
        this.X = -1;
        this.L = -1;
        this.M = -1;
        this.Y = -1;
        this.Z = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.N = -1;
        this.Q = -1;
        this.f35876c0 = -1;
        this.f35877d0 = -1;
        this.priceRow = -1;
        this.f35881f0 = -1;
        this.f35879e0 = -1;
        this.f35872a0 = -1;
        this.f35874b0 = -1;
        this.showGiftIconRow = -1;
        this.f35882g0 = -1;
        this.giftTypesHeaderRow = -1;
        this.f35883h0 = -1;
        this.f35884i0 = -1;
        this.f35885j0 = -1;
        this.f35886k0 = -1;
        this.f35887l0 = -1;
        this.m0 = -1;
        this.f35889n0 = 0;
        int i12 = this.f35902x;
        if (i12 == 12) {
            this.showGiftIconRow = 0;
            this.f35889n0 = 2;
            this.f35882g0 = 1;
        }
        if (i12 == 11 && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null && userFull.birthday == null) {
            int i13 = this.f35889n0;
            this.f35889n0 = i13 + 1;
            this.setBirthdayRow = i13;
        }
        if (i12 == 5) {
            int i14 = this.f35889n0;
            this.f35889n0 = i14 + 1;
            this.I = i14;
        }
        int i15 = this.f35889n0;
        this.J = i15;
        this.everybodyRow = i15 + 1;
        int i16 = i15 + 3;
        this.f35889n0 = i16;
        this.K = i15 + 2;
        if (i12 == 4 || i12 == 9 || i12 == 14 || i12 == 0 || i12 == 2 || i12 == 3 || i12 == 5 || i12 == 6 || i12 == 8 || i12 == 1 || i12 == 11 || i12 == 12) {
            this.f35889n0 = i15 + 4;
            this.nobodyRow = i16;
        }
        if (getMessagesController().starsPaidMessagesAvailable && i12 == 10) {
            int i17 = this.f35889n0;
            this.f35889n0 = i17 + 1;
            this.f35876c0 = i17;
        }
        if (i12 == 6 && this.E == 1) {
            int i18 = this.f35889n0;
            this.U = i18;
            this.R = i18 + 1;
            this.S = i18 + 2;
            this.f35889n0 = i18 + 4;
            this.T = i18 + 3;
        }
        if (i12 == 10 && this.E == 3) {
            int i19 = this.f35889n0;
            this.f35889n0 = i19 + 1;
            this.M = i19;
        } else {
            int i20 = this.f35889n0;
            this.f35889n0 = i20 + 1;
            this.L = i20;
        }
        if (i12 == 10) {
            if (this.E == 3) {
                int i21 = this.f35889n0;
                this.f35877d0 = i21;
                this.f35889n0 = i21 + 2;
                this.priceRow = i21 + 1;
                if (!getUserConfig().isPremium()) {
                    int i22 = this.f35889n0;
                    this.f35889n0 = i22 + 1;
                    this.f35879e0 = i22;
                }
                int i23 = this.f35889n0;
                this.f35889n0 = i23 + 1;
                this.f35881f0 = i23;
                if (getUserConfig().isPremium()) {
                    int i24 = this.f35889n0;
                    this.N = i24;
                    this.O = i24 + 1;
                    this.f35889n0 = i24 + 3;
                    this.Q = i24 + 2;
                }
            }
        } else if (i12 != 8 || getUserConfig().isPremium()) {
            int i25 = this.f35889n0;
            int i26 = i25 + 1;
            this.f35889n0 = i26;
            this.N = i25;
            int i27 = this.E;
            if (i27 == 1 || i27 == 2) {
                this.f35889n0 = i25 + 2;
                this.O = i26;
            }
            if (i27 == 0 || i27 == 2) {
                int i28 = this.f35889n0;
                this.f35889n0 = i28 + 1;
                this.P = i28;
            }
            int i29 = this.f35889n0;
            int i30 = i29 + 1;
            this.f35889n0 = i30;
            this.Q = i29;
            if (i12 == 2) {
                this.W = i30;
                this.X = i29 + 2;
                this.f35889n0 = i29 + 4;
                this.Y = i29 + 3;
            }
            if (i12 == 4 && (this.D.size() > 0 || (i9 = this.E) == 2 || i9 == 1)) {
                int i31 = this.f35889n0;
                int i32 = i31 + 1;
                this.f35889n0 = i32;
                this.photoForRestRow = i31;
                if (this.f35897t0 != null) {
                    this.f35889n0 = i31 + 2;
                    this.currentPhotoForRestRow = i32;
                }
                int i33 = this.f35889n0;
                this.f35889n0 = i33 + 1;
                this.V = i33;
            }
            if (i12 == 0 && (this.E != 0 || ((arrayList = this.D) != null && !arrayList.isEmpty()))) {
                int i34 = this.f35889n0;
                this.readRow = i34;
                this.f35889n0 = i34 + 2;
                this.Z = i34 + 1;
            }
            if (i12 == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i35 = this.f35889n0;
                this.f35872a0 = i35;
                this.f35889n0 = i35 + 2;
                this.f35874b0 = i35 + 1;
            }
        }
        if (i12 == 12) {
            int i36 = this.f35889n0;
            this.giftTypesHeaderRow = i36;
            this.f35884i0 = i36 + 1;
            this.f35883h0 = i36 + 2;
            this.f35885j0 = i36 + 3;
            this.f35886k0 = i36 + 4;
            this.f35887l0 = i36 + 5;
            this.f35889n0 = i36 + 7;
            this.m0 = i36 + 6;
        }
        z0();
        uw0 uw0Var = this.f35871a;
        if (uw0Var != null) {
            if (z10) {
                int childCount = this.d.getChildCount();
                for (int i37 = 0; i37 < childCount; i37++) {
                    View childAt = this.d.getChildAt(i37);
                    if (childAt instanceof org.telegram.ui.Cells.j6) {
                        org.telegram.ui.Components.wk0 wk0Var = this.d;
                        View F = wk0Var.F(childAt);
                        if (F == null) {
                            T = null;
                        } else {
                            T = wk0Var.T(F);
                        }
                        if (T != null) {
                            int b10 = T.b();
                            org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                            int i38 = this.everybodyRow;
                            if (b10 != i38 && b10 != this.K && b10 != this.nobodyRow && b10 != this.f35876c0) {
                                if (b10 == this.T) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (this.F == i11) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                j6Var.a(z12, true);
                            } else {
                                if (b10 == i38) {
                                    i10 = 0;
                                } else if (b10 == this.K) {
                                    i10 = 2;
                                } else if (b10 == this.nobodyRow) {
                                    i10 = 1;
                                } else {
                                    i10 = 3;
                                }
                                if (this.E == i10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                j6Var.a(z11, true);
                            }
                        }
                    }
                }
                qw0Var.f(qw0Var.d);
                f2.s.c(qw0Var, true).b(this.f35871a);
                AndroidUtilities.updateVisibleRows(this.d);
                return;
            }
            uw0Var.l();
        }
    }

    @Override
    public final void P(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.f35897t0 = photoSize3;
                privacyControlActivity.f35898u0 = null;
                privacyControlActivity.C0();
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile3 != null || inputFile4 != null) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i9 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i9 | 6;
                    }
                    TLRPC.VideoSize videoSize2 = videoSize;
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.fallback = true;
                    tL_photos_uploadProfilePhoto.flags |= 8;
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new m(privacyControlActivity, 18));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().getCurrentUser().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().getCurrentUser().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().getCurrentUser().access_hash;
                    org.telegram.ui.Components.oc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip), null, null).j();
                }
                privacyControlActivity.E0(false);
            }
        });
    }

    @Override
    public final boolean canBeginSlide() {
        return u0(true);
    }

    @Override
    public final View createView(Context context) {
        float f10;
        float f11;
        int i9 = this.f35902x;
        if (i9 == 5) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.setWillNotDraw(false);
            frameLayout.setClipToPadding(false);
            frameLayout.d = org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7);
            frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(R.string.PrivacyForwardsMessageLine);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 261;
            tL_message.from_id = new TLRPC.TL_peerUser();
            tL_message.f22401id = 1;
            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
            tL_message.fwd_from = tL_messageFwdHeader;
            tL_messageFwdHeader.from_name = ContactsController.formatName(user.first_name, user.last_name);
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.out = false;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, true, false);
            frameLayout.f43595f = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            org.telegram.ui.Cells.t1 t1Var = new org.telegram.ui.Cells.t1(context, this.currentAccount);
            frameLayout.f43592b = t1Var;
            t1Var.setDelegate(new wa.a(19));
            t1Var.J7 = false;
            t1Var.setFullyDraw(true);
            t1Var.X3(messageObject, null, false, false, false, false);
            frameLayout.addView(t1Var, g7.e6.n(-1, -2));
            org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(1, context, null, true);
            frameLayout.f43594e = s30Var;
            frameLayout.addView(s30Var, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.f35878e = frameLayout;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (i9 == 6) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyPhone));
        } else if (i9 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyForwards));
        } else if (i9 == 4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyProfilePhoto));
        } else if (i9 == 9) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBio));
        } else if (i9 == 14) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMusic));
        } else if (i9 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyP2P));
        } else if (i9 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        } else if (i9 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyInvites));
        } else if (i9 == 8) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyVoiceMessages));
        } else if (i9 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyLastSeen));
        } else if (i9 == 10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMessages));
        } else if (i9 == 11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBirthday));
        } else if (i9 == 12) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyGifts));
        }
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 15));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i10, false)));
        this.f35873b = frVar;
        this.f35875c = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), frVar);
        boolean x02 = x0();
        org.telegram.ui.ActionBar.w0 w0Var = this.f35875c;
        float f12 = 0.0f;
        if (x02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f35875c;
        if (x02) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f35875c;
        if (x02) {
            f12 = 1.0f;
        }
        w0Var3.setScaleY(f12);
        this.f35875c.setEnabled(x02);
        this.f35871a = new uw0(this, context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.d = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.d);
        this.d.setLayoutManager(new f2.m0(1, false));
        this.d.setVerticalScrollBarEnabled(false);
        ((f2.n) this.d.getItemAnimator()).C = false;
        frameLayout2.addView(this.d, g7.e6.c(-1.0f, -1));
        this.d.setAdapter(this.f35871a);
        this.d.setOnItemClickListener(new i(this, 25));
        pw0 pw0Var = new pw0(this);
        pw0Var.n(350L);
        pw0Var.o(org.telegram.ui.Components.gr.h);
        pw0Var.C = false;
        this.d.setItemAnimator(pw0Var);
        z0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        vw0 vw0Var;
        if (i9 == NotificationCenter.privacyRulesUpdated) {
            v0();
        } else if (i9 == NotificationCenter.emojiLoaded) {
            this.d.f1();
        } else if (i9 == NotificationCenter.didSetNewWallpapper && (vw0Var = this.f35878e) != null) {
            vw0Var.invalidate();
        }
    }

    @Override
    public final boolean e() {
        return true;
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
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i9 = org.telegram.ui.ActionBar.f6.f23001d6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 16, new Class[]{org.telegram.ui.Cells.ba.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j6.class}, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 1, null, null, null, null, i9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        int i10 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.ba.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.b9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.B6));
        int i11 = org.telegram.ui.ActionBar.f6.f22947a7;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 48, new Class[]{org.telegram.ui.Cells.b9.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23056g7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23074h7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23159m3, org.telegram.ui.ActionBar.f6.f23226q3}, null, org.telegram.ui.ActionBar.f6.f23252ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23176n3, org.telegram.ui.ActionBar.f6.f23245r3}, null, org.telegram.ui.ActionBar.f6.f23006dc));
        org.telegram.ui.Components.wk0 wk0Var = this.d;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.f6.f23159m3.f22864y;
        int i12 = org.telegram.ui.ActionBar.f6.f23289ta;
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, null, null, drawableArr, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, org.telegram.ui.ActionBar.f6.f23226q3.f22864y, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23194o3, org.telegram.ui.ActionBar.f6.f23264s3}, null, org.telegram.ui.ActionBar.f6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23209p3, org.telegram.ui.ActionBar.f6.f23282t3}, null, org.telegram.ui.ActionBar.f6.Ba));
        org.telegram.ui.Components.wk0 wk0Var2 = this.d;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.f6.f23194o3.f22864y;
        int i13 = org.telegram.ui.ActionBar.f6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var2, 0, null, null, drawableArr2, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, org.telegram.ui.ActionBar.f6.f23264s3.f22864y, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23366y3}, null, org.telegram.ui.ActionBar.f6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23383z3}, null, org.telegram.ui.ActionBar.f6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.A3, org.telegram.ui.ActionBar.f6.C3}, null, org.telegram.ui.ActionBar.f6.La));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.B3, org.telegram.ui.ActionBar.f6.D3}, null, org.telegram.ui.ActionBar.f6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.f23273sc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22951ab));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22988cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23005db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22953ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23042fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23272sb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23201od));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23184nb));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return u0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        v0();
        E0(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.privacyRulesUpdated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewWallpapper);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.d.setPadding(0, 0, 0, i12);
        this.d.setClipToPadding(false);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.e40 e40Var = this.f35890o0;
        if (e40Var != null) {
            e40Var.j();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        E0(false);
        org.telegram.ui.Components.e40 e40Var = this.f35890o0;
        if (e40Var != null) {
            e40Var.l();
        }
    }

    public final void s0() {
        final AtomicInteger atomicInteger;
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        TLRPC.InputUser inputUser3;
        char c10 = 0;
        boolean z10 = false;
        int i9 = this.f35902x;
        if (i9 == 10) {
            boolean[] zArr = {true};
            if (this.E == 3) {
                ArrayList arrayList = this.f35888n;
                Collections.sort(arrayList);
                Collections.sort(this.C);
                if (!arrayList.equals(this.C)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.E != 0 && this.C.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i10 = 0; i10 < this.C.size(); i10++) {
                            Long l10 = (Long) this.C.get(i10);
                            long longValue = l10.longValue();
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l10);
                                if (user != null && (inputUser3 = MessagesController.getInstance(this.currentAccount).getInputUser(user)) != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(inputUser3);
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new v40(20, this, zArr));
                }
            }
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings != null) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                globalPrivacySettings2.flags = globalPrivacySettings.flags;
                globalPrivacySettings2.disallowed_stargifts = globalPrivacySettings.disallowed_stargifts;
                globalPrivacySettings2.archive_and_mute_new_noncontact_peers = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                globalPrivacySettings2.noncontact_peers_paid_stars = globalPrivacySettings.noncontact_peers_paid_stars;
                globalPrivacySettings2.keep_archived_folders = globalPrivacySettings.keep_archived_folders;
                globalPrivacySettings2.keep_archived_unmuted = globalPrivacySettings.keep_archived_unmuted;
                globalPrivacySettings2.hide_read_marks = globalPrivacySettings.hide_read_marks;
            }
            int i11 = this.E;
            if (i11 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.H;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                if (i11 == 2) {
                    z10 = true;
                }
                globalPrivacySettings4.new_noncontact_peers_require_premium = z10;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new fh.h1(this, zArr, globalPrivacySettings, setglobalprivacysettings, 17));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i9 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.E == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.F == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) {
                    public final PrivacyControlActivity f39641b;

                    {
                        this.f39641b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final PrivacyControlActivity privacyControlActivity = this.f39641b;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r5) {
                                            case 0:
                                                PrivacyControlActivity.X(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                return;
                                            default:
                                                PrivacyControlActivity.Y(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final PrivacyControlActivity privacyControlActivity2 = this.f39641b;
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r5) {
                                            case 0:
                                                PrivacyControlActivity.X(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                return;
                                            default:
                                                PrivacyControlActivity.Y(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                }, 2);
            }
        } else if (i9 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i9 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i9 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i9 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i9 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i9 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i9 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i9 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i9 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i9 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.E != 0 && this.C.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i12 = 0; i12 < this.C.size(); i12++) {
                Long l11 = (Long) this.C.get(i12);
                long longValue2 = l11.longValue();
                if (DialogObject.isUserDialog(longValue2)) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(l11);
                    if (user2 != null && (inputUser2 = MessagesController.getInstance(this.currentAccount).getInputUser(user2)) != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(inputUser2);
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-longValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.E != 1 && this.D.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i13 = 0; i13 < this.D.size(); i13++) {
                Long l12 = (Long) this.D.get(i13);
                long longValue3 = l12.longValue();
                if (DialogObject.isUserDialog(longValue3)) {
                    TLRPC.User user3 = getMessagesController().getUser(l12);
                    if (user3 != null && (inputUser = getMessagesController().getInputUser(user3)) != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-longValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i14 = this.E;
        if (i14 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i14 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i14 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i15 = this.E;
        if (i15 != 0) {
            if (i15 != 2) {
                c10 = 1;
            }
            if (this.f35904y[c10]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i16 = this.E;
        if (this.A[i16]) {
            if (i16 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) {
            public final PrivacyControlActivity f39641b;

            {
                this.f39641b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final PrivacyControlActivity privacyControlActivity = this.f39641b;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        PrivacyControlActivity.X(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        return;
                                    default:
                                        PrivacyControlActivity.Y(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final PrivacyControlActivity privacyControlActivity2 = this.f39641b;
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        PrivacyControlActivity.X(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        return;
                                    default:
                                        PrivacyControlActivity.Y(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }, 2);
        if (i9 == 0 && this.f35903x0 != this.f35901w0) {
            atomicInteger2.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings5 = getContactsController().getGlobalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings6 = setglobalprivacysettings2.settings;
            globalPrivacySettings6.archive_and_mute_new_noncontact_peers = globalPrivacySettings5.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings6.keep_archived_folders = globalPrivacySettings5.keep_archived_folders;
            globalPrivacySettings6.keep_archived_unmuted = globalPrivacySettings5.keep_archived_unmuted;
            globalPrivacySettings6.new_noncontact_peers_require_premium = globalPrivacySettings5.new_noncontact_peers_require_premium;
            globalPrivacySettings6.noncontact_peers_paid_stars = globalPrivacySettings5.noncontact_peers_paid_stars;
            globalPrivacySettings6.hide_read_marks = this.f35903x0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) {
                public final PrivacyControlActivity f39939b;

                {
                    this.f39939b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f39939b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                            privacyControlActivity2.getClass();
                                            boolean z11 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity2.f35901w0 = z11;
                                            globalPrivacySettings7.hide_read_marks = z11;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.w0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings7;
                                            boolean z12 = globalPrivacySettings8.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                            if (z12 != setglobalprivacysettings4.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z13 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity3.f35905y0 = z13;
                                            globalPrivacySettings8.display_gifts_button = z13;
                                            if (globalPrivacySettings8.disallowed_stargifts == null) {
                                                globalPrivacySettings8.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings4.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings8.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings8.disallowed_stargifts;
                                                boolean z14 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z14;
                                                privacyControlActivity3.A0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.C0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.E0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.G0 = !z17;
                                                boolean z18 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z18;
                                                privacyControlActivity3.I0 = !z18;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.w0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.f39939b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z11 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.f35901w0 = z11;
                                            globalPrivacySettings8.hide_read_marks = z11;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.w0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings8;
                                            boolean z12 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z13 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.f35905y0 = z13;
                                            globalPrivacySettings82.display_gifts_button = z13;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z14 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z14;
                                                privacyControlActivity3.A0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.C0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.E0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.G0 = !z17;
                                                boolean z18 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z18;
                                                privacyControlActivity3.I0 = !z18;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.w0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
        } else {
            atomicInteger = atomicInteger2;
        }
        if (i9 == 12 && (this.f35906z0 != this.f35905y0 || this.D0 != this.C0 || this.B0 != this.A0 || this.F0 != this.E0 || this.J0 != this.I0)) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings3.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = getContactsController().getGlobalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = setglobalprivacysettings3.settings;
            globalPrivacySettings8.archive_and_mute_new_noncontact_peers = globalPrivacySettings7.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings8.keep_archived_folders = globalPrivacySettings7.keep_archived_folders;
            globalPrivacySettings8.keep_archived_unmuted = globalPrivacySettings7.keep_archived_unmuted;
            globalPrivacySettings8.new_noncontact_peers_require_premium = globalPrivacySettings7.new_noncontact_peers_require_premium;
            globalPrivacySettings8.noncontact_peers_paid_stars = globalPrivacySettings7.noncontact_peers_paid_stars;
            globalPrivacySettings8.hide_read_marks = globalPrivacySettings7.hide_read_marks;
            globalPrivacySettings8.display_gifts_button = this.f35906z0;
            if (getUserConfig().isPremium()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.B0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.D0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.F0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.J0;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) {
                public final PrivacyControlActivity f39939b;

                {
                    this.f39939b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f39939b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings32 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity;
                                            privacyControlActivity22.getClass();
                                            boolean z11 = setglobalprivacysettings32.settings.hide_read_marks;
                                            privacyControlActivity22.f35901w0 = z11;
                                            globalPrivacySettings72.hide_read_marks = z11;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity22.w0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings72;
                                            boolean z12 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings32;
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z13 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.f35905y0 = z13;
                                            globalPrivacySettings82.display_gifts_button = z13;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z14 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z14;
                                                privacyControlActivity3.A0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.C0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.E0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.G0 = !z17;
                                                boolean z18 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z18;
                                                privacyControlActivity3.I0 = !z18;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.w0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.f39939b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z11 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.f35901w0 = z11;
                                            globalPrivacySettings82.hide_read_marks = z11;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.w0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings822 = globalPrivacySettings82;
                                            boolean z12 = globalPrivacySettings822.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z13 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.f35905y0 = z13;
                                            globalPrivacySettings822.display_gifts_button = z13;
                                            if (globalPrivacySettings822.disallowed_stargifts == null) {
                                                globalPrivacySettings822.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings822.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings822.disallowed_stargifts;
                                                boolean z14 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z14;
                                                privacyControlActivity3.A0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.C0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.E0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.G0 = !z17;
                                                boolean z18 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z18;
                                                privacyControlActivity3.I0 = !z18;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.w0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
        }
        if (atomicInteger.get() > 0) {
            this.f35873b.a(1.0f);
        }
    }

    public final boolean t0() {
        if (!this.F0 && !this.B0 && !this.D0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean u() {
        return false;
    }

    public final boolean u0(boolean z10) {
        if (this.f35875c.getAlpha() == 1.0f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new mw0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new mw0(this, 2));
                showDialog(alertDialog$Builder.f22702a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void v0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z14;
        int i9;
        char c10;
        boolean z15;
        boolean[] zArr;
        ArrayList<TLRPC.PrivacyRule> arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.f35888n;
        int i10 = 2;
        int i11 = this.f35902x;
        if (i11 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings();
            i10 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 0;
            this.E = i10;
            this.f35880f = i10;
            this.D = new ArrayList();
            this.C = new ArrayList();
            if (globalPrivacySettings != null && (globalPrivacySettings.flags & 32) != 0) {
                long clamp = Utilities.clamp(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.H = clamp;
                this.G = clamp;
                this.E = 3;
                this.f35880f = 3;
            } else {
                this.H = 10L;
                this.G = 10L;
            }
            ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(13);
            this.C = new ArrayList();
            if (privacyRules != null) {
                for (int i12 = 0; i12 < privacyRules.size(); i12++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i12);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i13 = 0;
                        while (i13 < size) {
                            i13 = aa.d.g(-tL_privacyValueAllowChatParticipants.chats.get(i13).longValue(), this.C, i13, 1);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.C.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.C);
            return;
        }
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean[] zArr4 = this.f35895s;
        zArr4[0] = z10;
        boolean[] zArr5 = this.f35904y;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.v;
        zArr6[0] = false;
        boolean[] zArr7 = this.A;
        zArr7[0] = false;
        if (i11 == 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        zArr6[1] = z11;
        zArr7[1] = z11;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.f35900w;
        zArr8[0] = false;
        boolean[] zArr9 = this.B;
        zArr9[0] = false;
        if (i11 == 12) {
            z12 = true;
        } else {
            z12 = false;
        }
        zArr8[1] = z12;
        zArr9[1] = z12;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.C = new ArrayList();
        this.D = new ArrayList();
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i11);
        if (privacyRules2 != null && privacyRules2.size() != 0) {
            Boolean bool2 = null;
            char c11 = 65535;
            int i14 = 0;
            boolean z16 = false;
            boolean z17 = false;
            while (i14 < privacyRules2.size()) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i14);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        i15 = aa.d.g(-tL_privacyValueAllowChatParticipants2.chats.get(i15).longValue(), this.C, i15, 1);
                        zArr6 = zArr6;
                        privacyRules2 = privacyRules2;
                        tL_privacyValueAllowChatParticipants2 = tL_privacyValueAllowChatParticipants2;
                        zArr4 = zArr4;
                    }
                    zArr = zArr6;
                    arrayList = privacyRules2;
                    zArr2 = zArr4;
                } else {
                    zArr = zArr6;
                    arrayList = privacyRules2;
                    zArr2 = zArr4;
                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule2;
                        int i16 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); i16 < size3; size3 = size3) {
                            i16 = aa.d.g(-tL_privacyValueDisallowChatParticipants.chats.get(i16).longValue(), this.D, i16, 1);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.C.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.D.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                            z16 = true;
                        } else {
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                                bool = Boolean.TRUE;
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                                bool = Boolean.FALSE;
                            } else {
                                boolean z18 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                                if (!z18) {
                                    boolean z19 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                                    if (!z19 || z17) {
                                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                            c11 = 2;
                                            z17 = true;
                                        } else if (c11 == 65535) {
                                            if (!z18) {
                                                if (!z19 || z17) {
                                                    c11 = 2;
                                                }
                                            }
                                        }
                                    }
                                    c11 = 1;
                                }
                                c11 = 0;
                            }
                            bool2 = bool;
                        }
                        i14++;
                        zArr5 = zArr3;
                        zArr6 = zArr;
                        privacyRules2 = arrayList;
                        zArr4 = zArr2;
                    }
                }
                zArr3 = zArr5;
                i14++;
                zArr5 = zArr3;
                zArr6 = zArr;
                privacyRules2 = arrayList;
                zArr4 = zArr2;
            }
            boolean[] zArr10 = zArr6;
            boolean[] zArr11 = zArr4;
            boolean[] zArr12 = zArr5;
            if (c11 == 0 || (c11 == 65535 && (this.D.size() > 0 || (bool2 != null && !bool2.booleanValue())))) {
                i9 = 2;
                this.E = 0;
            } else {
                i9 = 2;
                if (c11 != 2) {
                    if (c11 == 65535 && this.D.size() > 0 && this.C.size() > 0) {
                        i9 = 2;
                    } else {
                        int i17 = 1;
                        if (c11 != 1) {
                            if (c11 == 65535 && (this.C.size() > 0 || (bool2 != null && bool2.booleanValue()))) {
                                i17 = 1;
                            }
                            i9 = 2;
                        }
                        this.E = i17;
                        i9 = 2;
                    }
                }
                this.E = i9;
            }
            int i18 = this.E;
            if (i18 == i9) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            zArr11[c10] = z16;
            zArr12[c10] = z16;
            if (bool2 != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            zArr10[i18] = z15;
            zArr7[i18] = z15;
            zArr8[i18] = false;
            zArr9[i18] = false;
            org.telegram.ui.ActionBar.w0 w0Var = this.f35875c;
            if (w0Var != null) {
                w0Var.setAlpha(0.0f);
                this.f35875c.setScaleX(0.0f);
                this.f35875c.setScaleY(0.0f);
                this.f35875c.setEnabled(false);
            }
        } else {
            this.E = 1;
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.f35893r;
        arrayList3.clear();
        this.f35880f = this.E;
        arrayList2.addAll(this.C);
        arrayList3.addAll(this.D);
        if (i11 == 6) {
            ArrayList<TLRPC.PrivacyRule> privacyRules3 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules3 != null && privacyRules3.size() != 0) {
                int i19 = 0;
                while (true) {
                    if (i19 >= privacyRules3.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = privacyRules3.get(i19);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.F = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.F = 2;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                        this.F = 1;
                        break;
                    } else {
                        i19++;
                    }
                }
            } else {
                this.F = 0;
            }
            this.h = this.F;
        }
        if (i11 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f35901w0 = z14;
            this.f35903x0 = z14;
        }
        if (i11 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f35905y0 = z13;
            this.f35906z0 = z13;
            if (globalPrivacySettings3 != null && (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) != null) {
                boolean z20 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.B0 = z20;
                this.A0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.D0 = z21;
                this.C0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.F0 = z22;
                this.E0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.H0 = z23;
                this.G0 = z23;
                boolean z24 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.J0 = z24;
                this.I0 = z24;
            } else {
                this.B0 = true;
                this.A0 = true;
                this.D0 = true;
                this.C0 = true;
                this.F0 = true;
                this.E0 = true;
                this.H0 = true;
                this.G0 = true;
                this.J0 = true;
                this.I0 = true;
            }
        }
        E0(false);
        AndroidUtilities.updateVisibleRows(this.d);
    }

    public final void w0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        int i9;
        int i10;
        this.f35873b.a(0.0f);
        int i11 = this.f35902x;
        if ((i11 == 10 || i11 == 1 || i11 == 2) && this.E != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i12 = 0; i12 < 2; i12++) {
                int i13 = iArr[i12];
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i13);
                if (i13 != i11 && ContactsController.findRule(privacyRules, TLRPC.TL_privacyValueAllowAll.class) != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.resourceProvider);
                    if (i13 == 1) {
                        i9 = R.string.CheckPrivacyInviteTitle;
                    } else {
                        i9 = R.string.CheckPrivacyCallsTitle;
                    }
                    alertDialog$Builder.f22702a.N = LocaleController.getString(i9);
                    if (i13 == 1) {
                        i10 = R.string.CheckPrivacyInviteText;
                    } else {
                        i10 = R.string.CheckPrivacyCallsText;
                    }
                    alertDialog$Builder.f22702a.P = LocaleController.getString(i10);
                    alertDialog$Builder.k(LocaleController.getString(R.string.CheckPrivacyReview), new bg.x2(this, i13, 15));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mw0(this, 1));
                    alertDialog$Builder.o();
                    return;
                }
            }
        }
        finishFragment();
    }

    public final boolean x0() {
        char c10;
        char c11;
        ArrayList arrayList;
        int i9 = this.f35902x;
        if (i9 == 0 && ((this.E != 0 || ((arrayList = this.D) != null && !arrayList.isEmpty())) && this.f35901w0 != this.f35903x0)) {
            return true;
        }
        if (i9 == 12 && (this.f35905y0 != this.f35906z0 || this.C0 != this.D0 || this.A0 != this.B0 || this.E0 != this.F0 || this.G0 != this.H0 || this.I0 != this.J0)) {
            return true;
        }
        int i10 = this.f35880f;
        int i11 = this.E;
        if (i10 != i11) {
            return true;
        }
        if (i9 == 6 && i11 == 1 && this.h != this.F) {
            return true;
        }
        if (i11 != 0) {
            if (i11 == 2) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            boolean z10 = this.f35895s[c10];
            if (i11 == 2) {
                c11 = 0;
            } else {
                c11 = 1;
            }
            if (z10 != this.f35904y[c11]) {
                return true;
            }
        }
        if ((i9 == 10 && i11 == 3 && this.H != this.G) || this.v[i11] != this.A[i11]) {
            return true;
        }
        ArrayList arrayList2 = this.f35893r;
        if (arrayList2.size() != this.D.size()) {
            return true;
        }
        ArrayList arrayList3 = this.f35888n;
        if (arrayList3.size() != this.C.size()) {
            return true;
        }
        if (i9 != 10 || this.E == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.C);
            if (!arrayList3.equals(this.C)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.D);
            if (!arrayList2.equals(this.D)) {
                return true;
            }
        }
        return false;
    }

    public final void y0() {
        if (getParentActivity() == null) {
            return;
        }
        int i9 = this.f35902x;
        if (i9 == 10 && this.E == 3 && !getUserConfig().isPremium()) {
            showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) this, 27, true));
            return;
        }
        if (this.E != 0 && i9 == 0 && !getUserConfig().isPremium()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (i9 == 1) {
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.WhoCanAddMeInfo);
                } else {
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.CustomHelp);
                }
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new nl0(12, this, globalMainSettings));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder.f22702a);
                return;
            }
        }
        s0();
    }

    public final void z0() {
        vw0 vw0Var = this.f35878e;
        if (vw0Var != null) {
            vw0Var.f43595f.messageOwner.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i9 = this.E;
            if (i9 == 0) {
                this.f35878e.f43594e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsEverybody));
                this.f35878e.f43595f.messageOwner.fwd_from.from_id.user_id = 1L;
            } else if (i9 == 1) {
                this.f35878e.f43594e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsNobody));
                this.f35878e.f43595f.messageOwner.fwd_from.from_id.user_id = 0L;
            } else {
                this.f35878e.f43594e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsContacts));
                this.f35878e.f43595f.messageOwner.fwd_from.from_id.user_id = 1L;
            }
            this.f35878e.f43592b.t2();
        }
    }

    public PrivacyControlActivity(int i9) {
        this(i9, false);
    }

    @Override
    public final void D(float f10) {
    }

    @Override
    public final void O() {
    }

    @Override
    public final void J(boolean z10, boolean z11) {
    }
}

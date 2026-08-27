package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
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

public class PrivacyControlActivity extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.i40 {
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

    public uw0 f35874a;

    public int f35875a0;

    public org.telegram.ui.Components.dr f35876b;

    public int f35877b0;

    public org.telegram.ui.ActionBar.v0 f35878c;

    public int f35879c0;
    private int currentPhotoForRestRow;
    public org.telegram.ui.Components.zk0 d;

    public int f35880d0;

    public vw0 f35881e;

    public int f35882e0;
    private int everybodyRow;

    public int f35883f;

    public int f35884f0;

    public int f35885g0;
    private int giftTypesHeaderRow;
    public int h;

    public int f35886h0;

    public int f35887i0;

    public int f35888j0;

    public int f35889k0;

    public int f35890l0;
    public int m0;

    public final ArrayList f35891n;

    public int f35892n0;
    private int nobodyRow;

    public final org.telegram.ui.Components.j40 f35893o0;

    public org.telegram.ui.Components.oi0 f35894p0;
    private int photoForRestRow;
    private int priceRow;

    public org.telegram.ui.Cells.l8 f35895q0;

    public final ArrayList f35896r;

    public org.telegram.ui.Components.n9 f35897r0;
    private int readRow;

    public final boolean[] f35898s;

    public hs f35899s0;
    private int setBirthdayRow;
    private int showGiftIconRow;

    public TLRPC.PhotoSize f35900t0;

    public TLRPC.Photo f35901u0;
    public final boolean[] v;

    public SpannableString f35902v0;

    public final boolean[] f35903w;

    public boolean f35904w0;

    public final int f35905x;

    public boolean f35906x0;

    public final boolean[] f35907y;

    public boolean f35908y0;

    public boolean f35909z0;

    public PrivacyControlActivity(int i10, boolean z10) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        super(null);
        this.f35891n = new ArrayList();
        this.f35896r = new ArrayList();
        this.f35898s = new boolean[4];
        this.v = new boolean[4];
        this.f35903w = new boolean[4];
        this.f35907y = new boolean[4];
        this.A = new boolean[4];
        this.B = new boolean[4];
        this.H = 10L;
        this.K0 = 4;
        this.f35905x = i10;
        if (z10) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (i10 == 4) {
            org.telegram.ui.Components.j40 j40Var = new org.telegram.ui.Components.j40(0, true, true);
            this.f35893o0 = j40Var;
            j40Var.f29569a = this;
            j40Var.f29570b = this;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, 1000)) == null) {
                return;
            }
            this.f35900t0 = closestPhotoSizeWithSize;
            this.f35901u0 = userFull.fallback_photo;
        }
    }

    public static void U(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.f35900t0 = null;
        privacyControlActivity.f35901u0 = null;
        TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
        if (userFull == null || (photo = userFull.fallback_photo) == null) {
            return;
        }
        userFull.flags &= -4194305;
        userFull.fallback_photo = null;
        privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
        privacyControlActivity.D0();
        privacyControlActivity.F0(true);
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

    public static void V(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error != null) {
            privacyControlActivity.B0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, 13);
        AndroidUtilities.runOnUIThread(new zs0(7, privacyControlActivity, zArr));
    }

    public static void W(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
            userFull.flags |= 4194304;
            userFull.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
            NotificationCenter.getInstance(privacyControlActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
            if (closestPhotoSizeWithSize != null && privacyControlActivity.f35900t0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.f35900t0, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.f35900t0.location.volume_id);
                sb2.append("_");
                String strK = a9.p.k(privacyControlActivity.f35900t0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(strK, a9.p.k(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 == null || privacyControlActivity.f35900t0 == null) {
                return;
            }
            FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.f35900t0.location, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
        }
    }

    public static void X(PrivacyControlActivity privacyControlActivity, View view, int i10) {
        boolean z10;
        int i11;
        int i12 = privacyControlActivity.f35905x;
        if (i10 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.b2 b2Var = org.telegram.ui.Components.y4.O(privacyControlActivity.getParentActivity(), LocaleController.getString(R.string.RemovePublicPhoto), LocaleController.getString(R.string.RemovePhotoForRestDescription), LocaleController.getString(R.string.Remove), new iw0(privacyControlActivity, 1), null).f22702a;
            b2Var.show();
            b2Var.h();
            return;
        }
        int i13 = 0;
        z = false;
        boolean z11 = false;
        if (i10 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.j40 j40Var = privacyControlActivity.f35893o0;
            if (j40Var != null) {
                j40Var.o(false, new ag.l3(22), new s5(privacyControlActivity, 13), 0);
                privacyControlActivity.f35894p0.K(0);
                privacyControlActivity.f35894p0.N(43);
                privacyControlActivity.f35895q0.f24631e.d();
                return;
            }
            return;
        }
        if (i12 == 10 && i10 == privacyControlActivity.K && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium()) {
            org.telegram.ui.Components.mc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new iw0(privacyControlActivity, 2)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i14 = -privacyControlActivity.K0;
            privacyControlActivity.K0 = i14;
            AndroidUtilities.shakeViewSpring(view, i14);
            return;
        }
        if (i12 == 8 && ((i10 == privacyControlActivity.K || i10 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().isPremium())) {
            org.telegram.ui.Components.mc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new iw0(privacyControlActivity, 3)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i15 = -privacyControlActivity.K0;
            privacyControlActivity.K0 = i15;
            AndroidUtilities.shakeViewSpring(view, i15);
            return;
        }
        if (i10 == privacyControlActivity.nobodyRow || i10 == privacyControlActivity.everybodyRow || i10 == privacyControlActivity.K || i10 == privacyControlActivity.f35879c0) {
            if (i12 == 12 && privacyControlActivity.u0()) {
                int i16 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i16;
                AndroidUtilities.shakeViewSpring(view, i16);
                return;
            }
            if (i10 == privacyControlActivity.nobodyRow) {
                i13 = 1;
            } else if (i10 != privacyControlActivity.everybodyRow) {
                i13 = i10 == privacyControlActivity.f35879c0 ? 3 : 2;
            }
            if (i13 == privacyControlActivity.E) {
                return;
            }
            privacyControlActivity.E = i13;
            org.telegram.ui.Components.ec.e();
            privacyControlActivity.E0();
            privacyControlActivity.F0(true);
            return;
        }
        if (i10 == privacyControlActivity.T || i10 == privacyControlActivity.S) {
            int i17 = i10 != privacyControlActivity.S ? 1 : 0;
            if (i17 == privacyControlActivity.F) {
                return;
            }
            privacyControlActivity.F = i17;
            privacyControlActivity.E0();
            privacyControlActivity.F0(true);
            return;
        }
        if (i10 == privacyControlActivity.P || i10 == privacyControlActivity.O) {
            if (i12 == 12 && privacyControlActivity.u0()) {
                int i18 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i18;
                AndroidUtilities.shakeViewSpring(view, i18);
                return;
            }
            ArrayList arrayList = i10 == privacyControlActivity.P ? privacyControlActivity.D : privacyControlActivity.C;
            Bundle bundle = new Bundle();
            bundle.putBoolean(i10 == privacyControlActivity.P ? "isNeverShare" : "isAlwaysShare", true);
            bundle.putInt("chatAddType", i12 != 0 ? 1 : 0);
            if (i10 == privacyControlActivity.O && i12 == 1) {
                bundle.putBoolean("allowPremium", true);
            }
            boolean z12 = i12 == 12 && ((i11 = privacyControlActivity.E) != 1 ? !(i11 != 2 ? !(i11 == 0 && i10 == privacyControlActivity.P) : i10 != privacyControlActivity.O) : i10 == privacyControlActivity.O);
            bundle.putBoolean("allowMiniapps", z12);
            o60 o60Var = new o60(bundle);
            if (i12 == 10) {
                o60Var.H = LocaleController.getString(R.string.RemoveMessageFeeTitle);
            }
            if (i10 == privacyControlActivity.O) {
                if (privacyControlActivity.f35907y[privacyControlActivity.E == 2 ? (char) 0 : (char) 1]) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (z12 && privacyControlActivity.A[privacyControlActivity.E]) {
                z11 = true;
            }
            o60Var.p0(arrayList, z10, z11);
            o60Var.f41017w = new lg.a(i10, privacyControlActivity, z12);
            o60Var.f40994a0 = true;
            privacyControlActivity.presentFragment(o60Var);
            return;
        }
        if (i10 == privacyControlActivity.X) {
            privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
            return;
        }
        if (i10 == privacyControlActivity.readRow) {
            privacyControlActivity.f35906x0 = !privacyControlActivity.f35906x0;
            privacyControlActivity.E0();
            ((org.telegram.ui.Cells.p8) view).setChecked(privacyControlActivity.f35906x0);
            return;
        }
        if (i10 == privacyControlActivity.f35875a0) {
            privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
            return;
        }
        if (i10 == privacyControlActivity.showGiftIconRow) {
            privacyControlActivity.f35909z0 = !privacyControlActivity.f35909z0;
            privacyControlActivity.E0();
            ((org.telegram.ui.Cells.p8) view).setChecked(privacyControlActivity.f35909z0);
            return;
        }
        if (i10 == privacyControlActivity.f35887i0) {
            if (privacyControlActivity.D0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i19 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i19;
                AndroidUtilities.shakeViewSpring(view, i19);
                privacyControlActivity.C0();
                return;
            }
            boolean zU0 = privacyControlActivity.u0();
            privacyControlActivity.D0 = !privacyControlActivity.D0;
            privacyControlActivity.E0();
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            p8Var.setChecked(privacyControlActivity.D0);
            if (privacyControlActivity.D0 && !privacyControlActivity.getUserConfig().isPremium()) {
                p8Var.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zU0 != privacyControlActivity.u0()) {
                privacyControlActivity.F0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.f35886h0) {
            if (privacyControlActivity.B0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i20 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i20;
                AndroidUtilities.shakeViewSpring(view, i20);
                privacyControlActivity.C0();
                return;
            }
            boolean zU1 = privacyControlActivity.u0();
            privacyControlActivity.B0 = !privacyControlActivity.B0;
            privacyControlActivity.E0();
            org.telegram.ui.Cells.p8 p8Var2 = (org.telegram.ui.Cells.p8) view;
            p8Var2.setChecked(privacyControlActivity.B0);
            if (privacyControlActivity.B0 && !privacyControlActivity.getUserConfig().isPremium()) {
                p8Var2.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zU1 != privacyControlActivity.u0()) {
                privacyControlActivity.F0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.f35888j0) {
            if (privacyControlActivity.F0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i21 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i21;
                AndroidUtilities.shakeViewSpring(view, i21);
                privacyControlActivity.C0();
                return;
            }
            boolean zU2 = privacyControlActivity.u0();
            privacyControlActivity.F0 = !privacyControlActivity.F0;
            privacyControlActivity.E0();
            org.telegram.ui.Cells.p8 p8Var3 = (org.telegram.ui.Cells.p8) view;
            p8Var3.setChecked(privacyControlActivity.F0);
            if (privacyControlActivity.F0 && !privacyControlActivity.getUserConfig().isPremium()) {
                p8Var3.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zU2 != privacyControlActivity.u0()) {
                privacyControlActivity.F0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.f35889k0) {
            if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i22 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i22;
                AndroidUtilities.shakeViewSpring(view, i22);
                privacyControlActivity.C0();
                return;
            }
            boolean zU3 = privacyControlActivity.u0();
            privacyControlActivity.H0 = !privacyControlActivity.H0;
            privacyControlActivity.E0();
            org.telegram.ui.Cells.p8 p8Var4 = (org.telegram.ui.Cells.p8) view;
            p8Var4.setChecked(privacyControlActivity.H0);
            if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().isPremium()) {
                p8Var4.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zU3 != privacyControlActivity.u0()) {
                privacyControlActivity.F0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                return;
            }
            return;
        }
        if (i10 == privacyControlActivity.f35890l0) {
            if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().isPremium()) {
                int i23 = -privacyControlActivity.K0;
                privacyControlActivity.K0 = i23;
                AndroidUtilities.shakeViewSpring(view, i23);
                privacyControlActivity.C0();
                return;
            }
            boolean zU4 = privacyControlActivity.u0();
            privacyControlActivity.J0 = !privacyControlActivity.J0;
            privacyControlActivity.E0();
            org.telegram.ui.Cells.p8 p8Var5 = (org.telegram.ui.Cells.p8) view;
            p8Var5.setChecked(privacyControlActivity.J0);
            if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().isPremium()) {
                p8Var5.setCheckBoxIcon(R.drawable.permission_locked);
            }
            if (zU4 != privacyControlActivity.u0()) {
                privacyControlActivity.F0(true);
                AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
            }
        }
    }

    public static void Y(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            org.telegram.ui.Components.mc.a0(privacyControlActivity).d0(tL_error, false);
            return;
        }
        ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(((TL_account.privacyRules) tLObject).rules, 7);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.x0();
        }
    }

    public static void Z(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error != null) {
            privacyControlActivity.B0();
            return;
        }
        TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
        MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
        MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
        ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, privacyControlActivity.f35905x);
        if (atomicInteger.decrementAndGet() == 0) {
            privacyControlActivity.x0();
        }
    }

    public final void A0() {
        vw0 vw0Var = this.f35881e;
        if (vw0Var != null) {
            vw0Var.f43538f.messageOwner.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i10 = this.E;
            if (i10 == 0) {
                this.f35881e.f43537e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsEverybody));
                this.f35881e.f43538f.messageOwner.fwd_from.from_id.user_id = 1L;
            } else if (i10 == 1) {
                this.f35881e.f43537e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsNobody));
                this.f35881e.f43538f.messageOwner.fwd_from.from_id.user_id = 0L;
            } else {
                this.f35881e.f43537e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsContacts));
                this.f35881e.f43538f.messageOwner.fwd_from.from_id.user_id = 1L;
            }
            this.f35881e.f43535b.s2();
        }
    }

    public final void B0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacyFloodControlError);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder.f22702a);
    }

    public final void C0() {
        org.telegram.ui.Components.mc.a0(this).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new iw0(this, 0)).j();
    }

    public final void D0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.l8 l8Var = this.f35895q0;
        if (l8Var != null) {
            if (this.f35900t0 == null) {
                l8Var.getTextView().k(LocaleController.formatString("SetPhotoForRest", R.string.SetPhotoForRest, new Object[0]));
                this.f35895q0.setNeedDivider(false);
            } else {
                l8Var.getTextView().k(LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]));
                this.f35895q0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.n9 n9Var = this.f35897r0;
        if (n9Var == null || (photoSize = this.f35900t0) == null) {
            return;
        }
        TLRPC.Photo photo = this.f35901u0;
        if (photo != null) {
            n9Var.h(ImageLocation.getForPhoto(photoSize, photo), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        } else {
            n9Var.h(ImageLocation.getForLocal(photoSize.location), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
        }
    }

    public final void E0() {
        boolean zY0 = y0();
        this.f35878c.setEnabled(zY0);
        this.f35878c.animate().alpha(zY0 ? 1.0f : 0.0f).scaleX(zY0 ? 1.0f : 0.0f).scaleY(zY0 ? 1.0f : 0.0f).setDuration(180L).start();
    }

    public final void F0(boolean z10) {
        qw0 qw0Var;
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.UserFull userFull;
        if (z10) {
            qw0Var = new qw0(this);
            qw0Var.f(qw0Var.f41760c);
            qw0Var.f41759b = this.f35892n0;
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
        this.f35879c0 = -1;
        this.f35880d0 = -1;
        this.priceRow = -1;
        this.f35884f0 = -1;
        this.f35882e0 = -1;
        this.f35875a0 = -1;
        this.f35877b0 = -1;
        this.showGiftIconRow = -1;
        this.f35885g0 = -1;
        this.giftTypesHeaderRow = -1;
        this.f35886h0 = -1;
        this.f35887i0 = -1;
        this.f35888j0 = -1;
        this.f35889k0 = -1;
        this.f35890l0 = -1;
        this.m0 = -1;
        this.f35892n0 = 0;
        int i12 = this.f35905x;
        if (i12 == 12) {
            this.showGiftIconRow = 0;
            this.f35892n0 = 2;
            this.f35885g0 = 1;
        }
        if (i12 == 11 && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null && userFull.birthday == null) {
            int i13 = this.f35892n0;
            this.f35892n0 = i13 + 1;
            this.setBirthdayRow = i13;
        }
        if (i12 == 5) {
            int i14 = this.f35892n0;
            this.f35892n0 = i14 + 1;
            this.I = i14;
        }
        int i15 = this.f35892n0;
        this.J = i15;
        this.everybodyRow = i15 + 1;
        int i16 = i15 + 3;
        this.f35892n0 = i16;
        this.K = i15 + 2;
        if (i12 == 4 || i12 == 9 || i12 == 14 || i12 == 0 || i12 == 2 || i12 == 3 || i12 == 5 || i12 == 6 || i12 == 8 || i12 == 1 || i12 == 11 || i12 == 12) {
            this.f35892n0 = i15 + 4;
            this.nobodyRow = i16;
        }
        if (getMessagesController().starsPaidMessagesAvailable && i12 == 10) {
            int i17 = this.f35892n0;
            this.f35892n0 = i17 + 1;
            this.f35879c0 = i17;
        }
        if (i12 == 6 && this.E == 1) {
            int i18 = this.f35892n0;
            this.U = i18;
            this.R = i18 + 1;
            this.S = i18 + 2;
            this.f35892n0 = i18 + 4;
            this.T = i18 + 3;
        }
        if (i12 == 10 && this.E == 3) {
            int i19 = this.f35892n0;
            this.f35892n0 = i19 + 1;
            this.M = i19;
        } else {
            int i20 = this.f35892n0;
            this.f35892n0 = i20 + 1;
            this.L = i20;
        }
        if (i12 == 10) {
            if (this.E == 3) {
                int i21 = this.f35892n0;
                this.f35880d0 = i21;
                this.f35892n0 = i21 + 2;
                this.priceRow = i21 + 1;
                if (!getUserConfig().isPremium()) {
                    int i22 = this.f35892n0;
                    this.f35892n0 = i22 + 1;
                    this.f35882e0 = i22;
                }
                int i23 = this.f35892n0;
                this.f35892n0 = i23 + 1;
                this.f35884f0 = i23;
                if (getUserConfig().isPremium()) {
                    int i24 = this.f35892n0;
                    this.N = i24;
                    this.O = i24 + 1;
                    this.f35892n0 = i24 + 3;
                    this.Q = i24 + 2;
                }
            }
        } else if (i12 != 8 || getUserConfig().isPremium()) {
            int i25 = this.f35892n0;
            int i26 = i25 + 1;
            this.f35892n0 = i26;
            this.N = i25;
            int i27 = this.E;
            if (i27 == 1 || i27 == 2) {
                this.f35892n0 = i25 + 2;
                this.O = i26;
            }
            if (i27 == 0 || i27 == 2) {
                int i28 = this.f35892n0;
                this.f35892n0 = i28 + 1;
                this.P = i28;
            }
            int i29 = this.f35892n0;
            int i30 = i29 + 1;
            this.f35892n0 = i30;
            this.Q = i29;
            if (i12 == 2) {
                this.W = i30;
                this.X = i29 + 2;
                this.f35892n0 = i29 + 4;
                this.Y = i29 + 3;
            }
            if (i12 == 4 && (this.D.size() > 0 || (i10 = this.E) == 2 || i10 == 1)) {
                int i31 = this.f35892n0;
                int i32 = i31 + 1;
                this.f35892n0 = i32;
                this.photoForRestRow = i31;
                if (this.f35900t0 != null) {
                    this.f35892n0 = i31 + 2;
                    this.currentPhotoForRestRow = i32;
                }
                int i33 = this.f35892n0;
                this.f35892n0 = i33 + 1;
                this.V = i33;
            }
            if (i12 == 0 && (this.E != 0 || ((arrayList = this.D) != null && !arrayList.isEmpty()))) {
                int i34 = this.f35892n0;
                this.readRow = i34;
                this.f35892n0 = i34 + 2;
                this.Z = i34 + 1;
            }
            if (i12 == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i35 = this.f35892n0;
                this.f35875a0 = i35;
                this.f35892n0 = i35 + 2;
                this.f35877b0 = i35 + 1;
            }
        }
        if (i12 == 12) {
            int i36 = this.f35892n0;
            this.giftTypesHeaderRow = i36;
            this.f35887i0 = i36 + 1;
            this.f35886h0 = i36 + 2;
            this.f35888j0 = i36 + 3;
            this.f35889k0 = i36 + 4;
            this.f35890l0 = i36 + 5;
            this.f35892n0 = i36 + 7;
            this.m0 = i36 + 6;
        }
        A0();
        uw0 uw0Var = this.f35874a;
        if (uw0Var != null) {
            if (!z10) {
                uw0Var.l();
                return;
            }
            int childCount = this.d.getChildCount();
            for (int i37 = 0; i37 < childCount; i37++) {
                View childAt = this.d.getChildAt(i37);
                if (childAt instanceof org.telegram.ui.Cells.g6) {
                    org.telegram.ui.Components.zk0 zk0Var = this.d;
                    View viewF = zk0Var.F(childAt);
                    f2.o1 o1VarT = viewF == null ? null : zk0Var.T(viewF);
                    if (o1VarT != null) {
                        int iB = o1VarT.b();
                        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) childAt;
                        int i38 = this.everybodyRow;
                        if (iB == i38 || iB == this.K || iB == this.nobodyRow || iB == this.f35879c0) {
                            if (iB == i38) {
                                i11 = 0;
                            } else if (iB == this.K) {
                                i11 = 2;
                            } else {
                                i11 = iB == this.nobodyRow ? 1 : 3;
                            }
                            g6Var.a(this.E == i11, true);
                        } else {
                            g6Var.a(this.F == (iB == this.T ? 1 : 0), true);
                        }
                    }
                }
            }
            qw0Var.f(qw0Var.d);
            f2.q.c(qw0Var, true).b(this.f35874a);
            AndroidUtilities.updateVisibleRows(this.d);
        }
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = this.f41197a;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.f35900t0 = photoSize3;
                privacyControlActivity.f35901u0 = null;
                privacyControlActivity.D0();
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
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    TLRPC.VideoSize videoSize2 = videoSize;
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.fallback = true;
                    tL_photos_uploadProfilePhoto.flags |= 8;
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new n(privacyControlActivity, 18));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().getCurrentUser().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().getCurrentUser().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().getCurrentUser().access_hash;
                    org.telegram.ui.Components.mc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip), null, null).j();
                }
                privacyControlActivity.F0(false);
            }
        });
    }

    @Override
    public final boolean canBeginSlide() {
        return v0(true);
    }

    @Override
    public final View createView(Context context) {
        int i10 = this.f35905x;
        if (i10 == 5) {
            vw0 vw0Var = new vw0(context);
            vw0Var.setWillNotDraw(false);
            vw0Var.setClipToPadding(false);
            vw0Var.d = org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7);
            vw0Var.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(R.string.PrivacyForwardsMessageLine);
            tL_message.date = iCurrentTimeMillis - 3540;
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
            vw0Var.f43538f = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            org.telegram.ui.Cells.s1 s1Var = new org.telegram.ui.Cells.s1(context, this.currentAccount);
            vw0Var.f43535b = s1Var;
            s1Var.setDelegate(new xa.a(19));
            s1Var.J7 = false;
            s1Var.setFullyDraw(true);
            s1Var.W3(messageObject, null, false, false, false, false);
            vw0Var.addView(s1Var, h7.z5.n(-1, -2));
            org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(1, context, null, true);
            vw0Var.f43537e = x30Var;
            vw0Var.addView(x30Var, h7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.f35881e = vw0Var;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (i10 == 6) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyPhone));
        } else if (i10 == 5) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyForwards));
        } else if (i10 == 4) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyProfilePhoto));
        } else if (i10 == 9) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBio));
        } else if (i10 == 14) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMusic));
        } else if (i10 == 3) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyP2P));
        } else if (i10 == 2) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Calls));
        } else if (i10 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyInvites));
        } else if (i10 == 8) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyVoiceMessages));
        } else if (i10 == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyLastSeen));
        } else if (i10 == 10) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyMessages));
        } else if (i10 == 11) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBirthday));
        } else if (i10 == 12) {
            this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyGifts));
        }
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 16));
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.g6.f23375v8;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.dr drVar = new org.telegram.ui.Components.dr(drawableMutate, new org.telegram.ui.Components.hp(org.telegram.ui.ActionBar.g6.w0(null, i11, false)));
        this.f35876b = drVar;
        this.f35878c = zVarN.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), drVar);
        boolean zY0 = y0();
        this.f35878c.setAlpha(zY0 ? 1.0f : 0.0f);
        this.f35878c.setScaleX(zY0 ? 1.0f : 0.0f);
        this.f35878c.setScaleY(zY0 ? 1.0f : 0.0f);
        this.f35878c.setEnabled(zY0);
        this.f35874a = new uw0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.d = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.d);
        this.d.setLayoutManager(new f2.k0(1, false));
        this.d.setVerticalScrollBarEnabled(false);
        ((f2.l) this.d.getItemAnimator()).C = false;
        frameLayout.addView(this.d, h7.z5.c(-1.0f, -1));
        this.d.setAdapter(this.f35874a);
        this.d.setOnItemClickListener(new i(this, 25));
        pw0 pw0Var = new pw0(this);
        pw0Var.n(350L);
        pw0Var.o(org.telegram.ui.Components.er.h);
        pw0Var.C = false;
        this.d.setItemAnimator(pw0Var);
        A0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        vw0 vw0Var;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            w0();
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            this.d.f1();
        } else {
            if (i10 != NotificationCenter.didSetNewWallpapper || (vw0Var = this.f35881e) == null) {
                return;
            }
            vw0Var.invalidate();
        }
    }

    @Override
    public final boolean e() {
        return true;
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
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16, new Class[]{org.telegram.ui.Cells.x9.class, org.telegram.ui.Cells.j4.class, org.telegram.ui.Cells.g6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x9.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.x8.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.B6));
        int i12 = org.telegram.ui.ActionBar.g6.f22999a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 48, new Class[]{org.telegram.ui.Cells.x8.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 8192, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23109g7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 16384, new Class[]{org.telegram.ui.Cells.g6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23126h7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23212m3, org.telegram.ui.ActionBar.g6.f23281q3}, null, org.telegram.ui.ActionBar.g6.f23305ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23231n3, org.telegram.ui.ActionBar.g6.f23298r3}, null, org.telegram.ui.ActionBar.g6.f23059dc));
        org.telegram.ui.Components.zk0 zk0Var = this.d;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.g6.f23212m3.f22864y;
        int i13 = org.telegram.ui.ActionBar.g6.f23343ta;
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, null, null, drawableArr, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, org.telegram.ui.ActionBar.g6.f23281q3.f22864y, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23248o3, org.telegram.ui.ActionBar.g6.f23317s3}, null, org.telegram.ui.ActionBar.g6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23266p3, org.telegram.ui.ActionBar.g6.f23336t3}, null, org.telegram.ui.ActionBar.g6.Ba));
        org.telegram.ui.Components.zk0 zk0Var2 = this.d;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.g6.f23248o3.f22864y;
        int i14 = org.telegram.ui.ActionBar.g6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var2, 0, null, null, drawableArr2, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, org.telegram.ui.ActionBar.g6.f23317s3.f22864y, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23077ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23420y3}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23438z3}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.A3, org.telegram.ui.ActionBar.g6.C3}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.B3, org.telegram.ui.ActionBar.g6.D3}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f23326sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23003ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23040cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23058db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23005ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23095fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23240nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23325sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.nb));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return v0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        w0();
        F0(false);
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
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.d.setPadding(0, 0, 0, i13);
        this.d.setClipToPadding(false);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.j40 j40Var = this.f35893o0;
        if (j40Var != null) {
            j40Var.j();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        F0(false);
        org.telegram.ui.Components.j40 j40Var = this.f35893o0;
        if (j40Var != null) {
            j40Var.l();
        }
    }

    public final void t0() {
        final AtomicInteger atomicInteger;
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        TLRPC.InputUser inputUser3;
        int i10 = this.f35905x;
        if (i10 == 10) {
            boolean[] zArr = {true, false};
            if (this.E == 3) {
                ArrayList arrayList = this.f35891n;
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
                        for (int i11 = 0; i11 < this.C.size(); i11++) {
                            Long l10 = (Long) this.C.get(i11);
                            long jLongValue = l10.longValue();
                            if (DialogObject.isUserDialog(jLongValue)) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l10);
                                if (user != null && (inputUser3 = MessagesController.getInstance(this.currentAccount).getInputUser(user)) != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(inputUser3);
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-jLongValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new v80(17, this, zArr));
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
            int i12 = this.E;
            if (i12 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.H;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                globalPrivacySettings4.new_noncontact_peers_require_premium = i12 == 2;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new gh.f1(this, zArr, globalPrivacySettings, setglobalprivacysettings, 15));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i10 == 6) {
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
                final int i13 = 0;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) {

                    public final PrivacyControlActivity f39530b;

                    {
                        this.f39530b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (i13) {
                            case 0:
                                final int i14 = 0;
                                final PrivacyControlActivity privacyControlActivity = this.f39530b;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                PrivacyControlActivity.Y(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                break;
                                            default:
                                                PrivacyControlActivity.Z(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                break;
                                        }
                                    }
                                });
                                break;
                            default:
                                final int i15 = 1;
                                final PrivacyControlActivity privacyControlActivity2 = this.f39530b;
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (i15) {
                                            case 0:
                                                PrivacyControlActivity.Y(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                break;
                                            default:
                                                PrivacyControlActivity.Z(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                break;
                                        }
                                    }
                                });
                                break;
                        }
                    }
                }, 2);
            }
        } else if (i10 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i10 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i10 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i10 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i10 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i10 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i10 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i10 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i10 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i10 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.E != 0 && this.C.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i14 = 0; i14 < this.C.size(); i14++) {
                Long l11 = (Long) this.C.get(i14);
                long jLongValue2 = l11.longValue();
                if (DialogObject.isUserDialog(jLongValue2)) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(l11);
                    if (user2 != null && (inputUser2 = MessagesController.getInstance(this.currentAccount).getInputUser(user2)) != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(inputUser2);
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-jLongValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.E != 1 && this.D.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i15 = 0; i15 < this.D.size(); i15++) {
                Long l12 = (Long) this.D.get(i15);
                long jLongValue3 = l12.longValue();
                if (DialogObject.isUserDialog(jLongValue3)) {
                    TLRPC.User user3 = getMessagesController().getUser(l12);
                    if (user3 != null && (inputUser = getMessagesController().getInputUser(user3)) != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(inputUser);
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-jLongValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i16 = this.E;
        if (i16 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i16 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i16 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i17 = this.E;
        if (i17 != 0) {
            if (this.f35907y[i17 != 2 ? (char) 1 : (char) 0]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i18 = this.E;
        if (this.A[i18]) {
            if (i18 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        final int i19 = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) {

            public final PrivacyControlActivity f39530b;

            {
                this.f39530b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (i19) {
                    case 0:
                        final int i110 = 0;
                        final PrivacyControlActivity privacyControlActivity = this.f39530b;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i110) {
                                    case 0:
                                        PrivacyControlActivity.Y(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        break;
                                    default:
                                        PrivacyControlActivity.Z(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final int i111 = 1;
                        final PrivacyControlActivity privacyControlActivity2 = this.f39530b;
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i111) {
                                    case 0:
                                        PrivacyControlActivity.Y(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        break;
                                    default:
                                        PrivacyControlActivity.Z(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        }, 2);
        if (i10 != 0 || this.f35906x0 == this.f35904w0) {
            atomicInteger = atomicInteger2;
        } else {
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
            globalPrivacySettings6.hide_read_marks = this.f35906x0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            final int i20 = 0;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) {

                public final PrivacyControlActivity f39892b;

                {
                    this.f39892b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i20) {
                        case 0:
                            final int i21 = 0;
                            final PrivacyControlActivity privacyControlActivity = this.f39892b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i21) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                            privacyControlActivity2.getClass();
                                            boolean z10 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity2.f35904w0 = z10;
                                            globalPrivacySettings7.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.x0();
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings7;
                                            boolean z11 = globalPrivacySettings8.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                            if (z11 != setglobalprivacysettings4.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity3.f35908y0 = z12;
                                            globalPrivacySettings8.display_gifts_button = z12;
                                            if (globalPrivacySettings8.disallowed_stargifts == null) {
                                                globalPrivacySettings8.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings4.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings8.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings8.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.A0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.C0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.E0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.G0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.I0 = !z17;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i22 = 1;
                            final PrivacyControlActivity privacyControlActivity2 = this.f39892b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i22) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity3.f35904w0 = z10;
                                            globalPrivacySettings8.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity2;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings9 = globalPrivacySettings8;
                                            boolean z11 = globalPrivacySettings9.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings5 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings5.settings.display_gifts_button && (userFull = privacyControlActivity4.getMessagesController().getUserFull(privacyControlActivity4.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings5.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings5.settings.display_gifts_button;
                                            privacyControlActivity4.f35908y0 = z12;
                                            globalPrivacySettings9.display_gifts_button = z12;
                                            if (globalPrivacySettings9.disallowed_stargifts == null) {
                                                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings5.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings9.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings9.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity4.A0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity4.C0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity4.E0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity4.G0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity4.I0 = !z17;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity4.x0();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        if (i10 == 12 && (this.f35909z0 != this.f35908y0 || this.D0 != this.C0 || this.B0 != this.A0 || this.F0 != this.E0 || this.J0 != this.I0)) {
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
            globalPrivacySettings8.display_gifts_button = this.f35909z0;
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
            final int i21 = 1;
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) {

                public final PrivacyControlActivity f39892b;

                {
                    this.f39892b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i21) {
                        case 0:
                            final int i22 = 0;
                            final PrivacyControlActivity privacyControlActivity = this.f39892b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings10 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i22) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity3.f35904w0 = z10;
                                            globalPrivacySettings10.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings11 = globalPrivacySettings10;
                                            boolean z11 = globalPrivacySettings11.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings5 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings5.settings.display_gifts_button && (userFull = privacyControlActivity4.getMessagesController().getUserFull(privacyControlActivity4.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings5.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings5.settings.display_gifts_button;
                                            privacyControlActivity4.f35908y0 = z12;
                                            globalPrivacySettings11.display_gifts_button = z12;
                                            if (globalPrivacySettings11.disallowed_stargifts == null) {
                                                globalPrivacySettings11.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings5.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings11.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3 = globalPrivacySettings11.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings3.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity4.A0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings3.disallow_limited_stargifts = z14;
                                                privacyControlActivity4.C0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings3.disallow_unique_stargifts = z15;
                                                privacyControlActivity4.E0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings3.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity4.G0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings3.disallow_premium_gifts = z17;
                                                privacyControlActivity4.I0 = !z17;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity4.x0();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i23 = 1;
                            final PrivacyControlActivity privacyControlActivity2 = this.f39892b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings11 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings5 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull userFull;
                                    switch (i23) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            boolean z10 = setglobalprivacysettings5.settings.hide_read_marks;
                                            privacyControlActivity3.f35904w0 = z10;
                                            globalPrivacySettings11.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
                                            }
                                            break;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity2;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings12 = globalPrivacySettings11;
                                            boolean z11 = globalPrivacySettings12.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings6 = setglobalprivacysettings5;
                                            if (z11 != setglobalprivacysettings6.settings.display_gifts_button && (userFull = privacyControlActivity4.getMessagesController().getUserFull(privacyControlActivity4.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings6.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings6.settings.display_gifts_button;
                                            privacyControlActivity4.f35908y0 = z12;
                                            globalPrivacySettings12.display_gifts_button = z12;
                                            if (globalPrivacySettings12.disallowed_stargifts == null) {
                                                globalPrivacySettings12.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings6.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings12.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3 = globalPrivacySettings12.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings3.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity4.A0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings3.disallow_limited_stargifts = z14;
                                                privacyControlActivity4.C0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings3.disallow_unique_stargifts = z15;
                                                privacyControlActivity4.E0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings3.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity4.G0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings3.disallow_premium_gifts = z17;
                                                privacyControlActivity4.I0 = !z17;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity4.x0();
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
        if (atomicInteger.get() > 0) {
            this.f35876b.a(1.0f);
        }
    }

    public final boolean u0() {
        return (this.F0 || this.B0 || this.D0) ? false : true;
    }

    @Override
    public final boolean v() {
        return false;
    }

    public final boolean v0(boolean z10) {
        if (this.f35878c.getAlpha() != 1.0f) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
        alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new mw0(this, 0));
        alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new mw0(this, 2));
        showDialog(alertDialog$Builder.f22702a);
        return false;
    }

    public final void w0() {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        int i10;
        boolean[] zArr;
        ArrayList<TLRPC.PrivacyRule> arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.f35891n;
        int i11 = this.f35905x;
        if (i11 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings();
            int i12 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 2;
            this.E = i12;
            this.f35883f = i12;
            this.D = new ArrayList();
            this.C = new ArrayList();
            if (globalPrivacySettings == null || (globalPrivacySettings.flags & 32) == 0) {
                this.H = 10L;
                this.G = 10L;
            } else {
                long jClamp = Utilities.clamp(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.H = jClamp;
                this.G = jClamp;
                this.E = 3;
                this.f35883f = 3;
            }
            ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(13);
            this.C = new ArrayList();
            if (privacyRules != null) {
                for (int i13 = 0; i13 < privacyRules.size(); i13++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i13);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int iF = 0;
                        while (iF < size) {
                            iF = com.google.android.recaptcha.internal.a.f(-tL_privacyValueAllowChatParticipants.chats.get(iF).longValue(), this.C, iF, 1);
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
        boolean z10 = i11 == 1;
        boolean[] zArr4 = this.f35898s;
        zArr4[0] = z10;
        boolean[] zArr5 = this.f35907y;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.v;
        zArr6[0] = false;
        boolean[] zArr7 = this.A;
        zArr7[0] = false;
        boolean z11 = i11 == 12;
        zArr6[1] = z11;
        zArr7[1] = z11;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.f35903w;
        zArr8[0] = false;
        boolean[] zArr9 = this.B;
        zArr9[0] = false;
        boolean z12 = i11 == 12;
        zArr8[1] = z12;
        zArr9[1] = z12;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.C = new ArrayList();
        this.D = new ArrayList();
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i11);
        if (privacyRules2 == null || privacyRules2.size() == 0) {
            this.E = 1;
        } else {
            Boolean bool2 = null;
            byte b10 = -1;
            int i14 = 0;
            boolean z13 = false;
            boolean z14 = false;
            while (i14 < privacyRules2.size()) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i14);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int iF2 = 0;
                    while (iF2 < size2) {
                        iF2 = com.google.android.recaptcha.internal.a.f(-tL_privacyValueAllowChatParticipants2.chats.get(iF2).longValue(), this.C, iF2, 1);
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
                        int iF3 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); iF3 < size3; size3 = size3) {
                            iF3 = com.google.android.recaptcha.internal.a.f(-tL_privacyValueDisallowChatParticipants.chats.get(iF3).longValue(), this.D, iF3, 1);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.C.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.D.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                            z13 = true;
                        } else {
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                                bool = Boolean.TRUE;
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                                bool = Boolean.FALSE;
                            } else {
                                boolean z15 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                                if (z15) {
                                    b10 = 0;
                                } else {
                                    boolean z16 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                                    if (z16 && !z14) {
                                        b10 = 1;
                                    } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                        b10 = 2;
                                        z14 = true;
                                    } else if (b10 == -1) {
                                        if (z15) {
                                            b10 = 0;
                                        } else if (!z16 || z14) {
                                            b10 = 2;
                                        } else {
                                            b10 = 1;
                                        }
                                    }
                                }
                            }
                            bool2 = bool;
                        }
                    }
                    i14++;
                    zArr5 = zArr3;
                    zArr6 = zArr;
                    privacyRules2 = arrayList;
                    zArr4 = zArr2;
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
            if (b10 == 0 || (b10 == -1 && (this.D.size() > 0 || !(bool2 == null || bool2.booleanValue())))) {
                i10 = 2;
                this.E = 0;
            } else {
                i10 = 2;
                if (b10 == 2) {
                    this.E = i10;
                } else if (b10 != -1 || this.D.size() <= 0 || this.C.size() <= 0) {
                    int i15 = 1;
                    if (b10 == 1) {
                        this.E = i15;
                    } else if (b10 == -1 && (this.C.size() > 0 || (bool2 != null && bool2.booleanValue()))) {
                        i15 = 1;
                        this.E = i15;
                    }
                    i10 = 2;
                } else {
                    i10 = 2;
                    this.E = i10;
                }
            }
            int i16 = this.E;
            char c10 = i16 == i10 ? (char) 0 : (char) 1;
            zArr11[c10] = z13;
            zArr12[c10] = z13;
            boolean z17 = bool2 != null;
            zArr10[i16] = z17;
            zArr7[i16] = z17;
            zArr8[i16] = false;
            zArr9[i16] = false;
            org.telegram.ui.ActionBar.v0 v0Var = this.f35878c;
            if (v0Var != null) {
                v0Var.setAlpha(0.0f);
                this.f35878c.setScaleX(0.0f);
                this.f35878c.setScaleY(0.0f);
                this.f35878c.setEnabled(false);
            }
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.f35896r;
        arrayList3.clear();
        this.f35883f = this.E;
        arrayList2.addAll(this.C);
        arrayList3.addAll(this.D);
        if (i11 == 6) {
            ArrayList<TLRPC.PrivacyRule> privacyRules3 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules3 == null || privacyRules3.size() == 0) {
                this.F = 0;
            } else {
                for (int i17 = 0; i17 < privacyRules3.size(); i17++) {
                    TLRPC.PrivacyRule privacyRule3 = privacyRules3.get(i17);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.F = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.F = 2;
                        break;
                    } else {
                        if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                            this.F = 1;
                            break;
                        }
                    }
                }
            }
            this.h = this.F;
        }
        if (i11 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            boolean z18 = globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks;
            this.f35904w0 = z18;
            this.f35906x0 = z18;
        }
        if (i11 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().getGlobalPrivacySettings();
            boolean z19 = globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button;
            this.f35908y0 = z19;
            this.f35909z0 = z19;
            if (globalPrivacySettings3 == null || (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) == null) {
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
            } else {
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
            }
        }
        F0(false);
        AndroidUtilities.updateVisibleRows(this.d);
    }

    public final void x0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        this.f35876b.a(0.0f);
        int i10 = this.f35905x;
        if ((i10 == 10 || i10 == 1 || i10 == 2) && this.E != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = iArr[i11];
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i12);
                if (i12 != i10 && ContactsController.findRule(privacyRules, TLRPC.TL_privacyValueAllowAll.class) != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.resourceProvider);
                    alertDialog$Builder.f22702a.N = LocaleController.getString(i12 == 1 ? R.string.CheckPrivacyInviteTitle : R.string.CheckPrivacyCallsTitle);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(i12 == 1 ? R.string.CheckPrivacyInviteText : R.string.CheckPrivacyCallsText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.CheckPrivacyReview), new cg.p2(this, i12, 15));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new mw0(this, 1));
                    alertDialog$Builder.o();
                    return;
                }
            }
        }
        finishFragment();
    }

    public final boolean y0() {
        ArrayList arrayList;
        int i10 = this.f35905x;
        if (i10 == 0 && ((this.E != 0 || ((arrayList = this.D) != null && !arrayList.isEmpty())) && this.f35904w0 != this.f35906x0)) {
            return true;
        }
        if (i10 == 12 && (this.f35908y0 != this.f35909z0 || this.C0 != this.D0 || this.A0 != this.B0 || this.E0 != this.F0 || this.G0 != this.H0 || this.I0 != this.J0)) {
            return true;
        }
        int i11 = this.f35883f;
        int i12 = this.E;
        if (i11 != i12) {
            return true;
        }
        if (i10 == 6 && i12 == 1 && this.h != this.F) {
            return true;
        }
        if (i12 != 0) {
            if (this.f35898s[i12 == 2 ? (char) 0 : (char) 1] != this.f35907y[i12 == 2 ? (char) 0 : (char) 1]) {
                return true;
            }
        }
        if ((i10 == 10 && i12 == 3 && this.H != this.G) || this.v[i12] != this.A[i12]) {
            return true;
        }
        ArrayList arrayList2 = this.f35896r;
        if (arrayList2.size() != this.D.size()) {
            return true;
        }
        ArrayList arrayList3 = this.f35891n;
        if (arrayList3.size() != this.C.size()) {
            return true;
        }
        if (i10 != 10 || this.E == 3) {
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

    public final void z0() {
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.f35905x;
        if (i10 == 10 && this.E == 3 && !getUserConfig().isPremium()) {
            showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) this, 27, true));
            return;
        }
        if (this.E != 0 && i10 == 0 && !getUserConfig().isPremium()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (i10 == 1) {
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
        t0();
    }

    public PrivacyControlActivity(int i10) {
        this(i10, false);
    }

    @Override
    public final void E(float f10) {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void J(boolean z10, boolean z11) {
    }
}

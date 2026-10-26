package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.f50 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public final boolean[] E;
    public boolean E0;
    public ArrayList F;
    public boolean F0;
    public ArrayList G;
    public boolean G0;
    public int H;
    public boolean H0;
    public int I;
    public boolean I0;
    public long J;
    public boolean J0;
    public long K;
    public boolean K0;
    public int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public int N0;
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
    public kx0 f35900a;
    public int f35901a0;
    public org.telegram.ui.ActionBar.u5 f35902b;
    public int f35903b0;
    public org.telegram.ui.Components.mm0 f35904c;
    public int f35905c0;
    private int currentPhotoForRestRow;
    public lx0 d;
    public int f35906d0;
    public int e;
    public int f35907e0;
    private int everybodyRow;
    public int f35908f;
    public int f35909f0;
    public int f35910g0;
    private int giftTypesHeaderRow;
    public final ArrayList h;
    public int f35911h0;
    public int f35912i0;
    public int f35913j0;
    public int f35914k0;
    public int f35915l0;
    public int m0;
    public final ArrayList f35916n;
    public int f35917n0;
    private int nobodyRow;
    public int f35918o0;
    public int f35919p0;
    private int photoForRestRow;
    private int priceRow;
    public int f35920q0;
    public final boolean[] f35921r;
    public final org.telegram.ui.Components.g50 f35922r0;
    private int readRow;
    public final boolean[] f35923s;
    public org.telegram.ui.Components.xj0 f35924s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public org.telegram.ui.Cells.v8 f35925t0;
    public org.telegram.ui.Components.y9 f35926u0;
    public final boolean[] v;
    public hs f35927v0;
    public final int f35928w;
    public TLRPC.PhotoSize f35929w0;
    public final boolean[] f35930x;
    public TLRPC.Photo f35931x0;
    public final boolean[] f35932y;
    public SpannableString f35933y0;
    public boolean f35934z0;

    public PrivacyControlActivity(int i10, boolean z10) {
        super(null);
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        this.h = new ArrayList();
        this.f35916n = new ArrayList();
        this.f35921r = new boolean[4];
        this.f35923s = new boolean[4];
        this.v = new boolean[4];
        this.f35930x = new boolean[4];
        this.f35932y = new boolean[4];
        this.E = new boolean[4];
        this.K = 10L;
        this.N0 = 4;
        this.f35928w = i10;
        if (z10) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (i10 == 4) {
            org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(0, true, true);
            this.f35922r0 = g50Var;
            g50Var.f28421a = this;
            g50Var.f28422b = this;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, 1000)) == null) {
                return;
            }
            this.f35929w0 = closestPhotoSizeWithSize;
            this.f35931x0 = userFull.fallback_photo;
        }
    }

    public static void V(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.f35929w0 = null;
        privacyControlActivity.f35931x0 = null;
        TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
        if (userFull != null && (photo = userFull.fallback_photo) != null) {
            userFull.flags &= -4194305;
            userFull.fallback_photo = null;
            privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
            privacyControlActivity.E0();
            privacyControlActivity.G0(true);
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f22046id = photo.f22051id;
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

    public static void W(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
            MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
            ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, 13);
            AndroidUtilities.runOnUIThread(new yl0(22, privacyControlActivity, zArr));
            return;
        }
        privacyControlActivity.C0();
    }

    public static void X(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
            userFull.flags |= 4194304;
            userFull.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
            NotificationCenter.getInstance(privacyControlActivity.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.reloadDialogPhotos, new Object[0]);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 100);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(tL_photos_photo.photo.sizes, 1000);
            if (closestPhotoSizeWithSize != null && privacyControlActivity.f35929w0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.f35929w0, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.f35929w0.location.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(privacyControlActivity.f35929w0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 != null && privacyControlActivity.f35929w0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.f35929w0.location, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
        }
    }

    public static void Y(PrivacyControlActivity privacyControlActivity, View view, int i10) {
        ArrayList arrayList;
        String str;
        int i11;
        boolean z10;
        boolean z11;
        char c10;
        int i12;
        int i13 = privacyControlActivity.f35928w;
        if (i10 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.e2 e2Var = org.telegram.ui.Components.g5.N(privacyControlActivity.getParentActivity(), LocaleController.getString(R.string.RemovePublicPhoto), LocaleController.getString(R.string.RemovePhotoForRestDescription), LocaleController.getString(R.string.Remove), new yw0(privacyControlActivity, 1), null).f22368a;
            e2Var.show();
            e2Var.i();
            return;
        }
        int i14 = 0;
        r2 = false;
        boolean z12 = false;
        int i15 = 0;
        if (i10 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.g50 g50Var = privacyControlActivity.f35922r0;
            if (g50Var != null) {
                g50Var.n(false, new ag.c(25), new u5(privacyControlActivity, 12), 0);
                privacyControlActivity.f35924s0.M(0);
                privacyControlActivity.f35924s0.P(43);
                privacyControlActivity.f35925t0.e.d();
            }
        } else if (i13 == 10 && i10 == privacyControlActivity.N && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium()) {
            org.telegram.ui.Components.wc.b0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new yw0(privacyControlActivity, 2)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i16 = -privacyControlActivity.N0;
            privacyControlActivity.N0 = i16;
            AndroidUtilities.shakeViewSpring(view, i16);
        } else if (i13 == 8 && ((i10 == privacyControlActivity.N || i10 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().isPremium())) {
            org.telegram.ui.Components.wc.b0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new yw0(privacyControlActivity, 3)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i17 = -privacyControlActivity.N0;
            privacyControlActivity.N0 = i17;
            AndroidUtilities.shakeViewSpring(view, i17);
        } else if (i10 != privacyControlActivity.nobodyRow && i10 != privacyControlActivity.everybodyRow && i10 != privacyControlActivity.N && i10 != privacyControlActivity.f35909f0) {
            if (i10 != privacyControlActivity.W && i10 != privacyControlActivity.V) {
                if (i10 != privacyControlActivity.S && i10 != privacyControlActivity.R) {
                    if (i10 == privacyControlActivity.f35901a0) {
                        privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
                        return;
                    } else if (i10 == privacyControlActivity.readRow) {
                        privacyControlActivity.A0 = !privacyControlActivity.A0;
                        privacyControlActivity.F0();
                        ((org.telegram.ui.Cells.a9) view).setChecked(privacyControlActivity.A0);
                        return;
                    } else if (i10 == privacyControlActivity.f35906d0) {
                        privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
                        return;
                    } else if (i10 == privacyControlActivity.showGiftIconRow) {
                        privacyControlActivity.C0 = !privacyControlActivity.C0;
                        privacyControlActivity.F0();
                        ((org.telegram.ui.Cells.a9) view).setChecked(privacyControlActivity.C0);
                        return;
                    } else if (i10 == privacyControlActivity.f35915l0) {
                        if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i18 = -privacyControlActivity.N0;
                            privacyControlActivity.N0 = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            privacyControlActivity.D0();
                            return;
                        }
                        boolean v02 = privacyControlActivity.v0();
                        privacyControlActivity.G0 = !privacyControlActivity.G0;
                        privacyControlActivity.F0();
                        org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                        a9Var.setChecked(privacyControlActivity.G0);
                        if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            a9Var.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (v02 != privacyControlActivity.v0()) {
                            privacyControlActivity.G0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.f35904c);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f35914k0) {
                        if (privacyControlActivity.E0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i19 = -privacyControlActivity.N0;
                            privacyControlActivity.N0 = i19;
                            AndroidUtilities.shakeViewSpring(view, i19);
                            privacyControlActivity.D0();
                            return;
                        }
                        boolean v03 = privacyControlActivity.v0();
                        privacyControlActivity.E0 = !privacyControlActivity.E0;
                        privacyControlActivity.F0();
                        org.telegram.ui.Cells.a9 a9Var2 = (org.telegram.ui.Cells.a9) view;
                        a9Var2.setChecked(privacyControlActivity.E0);
                        if (privacyControlActivity.E0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            a9Var2.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (v03 != privacyControlActivity.v0()) {
                            privacyControlActivity.G0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.f35904c);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.m0) {
                        if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i20 = -privacyControlActivity.N0;
                            privacyControlActivity.N0 = i20;
                            AndroidUtilities.shakeViewSpring(view, i20);
                            privacyControlActivity.D0();
                            return;
                        }
                        boolean v04 = privacyControlActivity.v0();
                        privacyControlActivity.I0 = !privacyControlActivity.I0;
                        privacyControlActivity.F0();
                        org.telegram.ui.Cells.a9 a9Var3 = (org.telegram.ui.Cells.a9) view;
                        a9Var3.setChecked(privacyControlActivity.I0);
                        if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            a9Var3.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (v04 != privacyControlActivity.v0()) {
                            privacyControlActivity.G0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.f35904c);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f35917n0) {
                        if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i21 = -privacyControlActivity.N0;
                            privacyControlActivity.N0 = i21;
                            AndroidUtilities.shakeViewSpring(view, i21);
                            privacyControlActivity.D0();
                            return;
                        }
                        boolean v05 = privacyControlActivity.v0();
                        privacyControlActivity.K0 = !privacyControlActivity.K0;
                        privacyControlActivity.F0();
                        org.telegram.ui.Cells.a9 a9Var4 = (org.telegram.ui.Cells.a9) view;
                        a9Var4.setChecked(privacyControlActivity.K0);
                        if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            a9Var4.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (v05 != privacyControlActivity.v0()) {
                            privacyControlActivity.G0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.f35904c);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f35918o0) {
                        if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i22 = -privacyControlActivity.N0;
                            privacyControlActivity.N0 = i22;
                            AndroidUtilities.shakeViewSpring(view, i22);
                            privacyControlActivity.D0();
                            return;
                        }
                        boolean v06 = privacyControlActivity.v0();
                        privacyControlActivity.M0 = !privacyControlActivity.M0;
                        privacyControlActivity.F0();
                        org.telegram.ui.Cells.a9 a9Var5 = (org.telegram.ui.Cells.a9) view;
                        a9Var5.setChecked(privacyControlActivity.M0);
                        if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            a9Var5.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (v06 != privacyControlActivity.v0()) {
                            privacyControlActivity.G0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.f35904c);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i13 == 12 && privacyControlActivity.v0()) {
                    int i23 = -privacyControlActivity.N0;
                    privacyControlActivity.N0 = i23;
                    AndroidUtilities.shakeViewSpring(view, i23);
                    return;
                } else {
                    if (i10 == privacyControlActivity.S) {
                        arrayList = privacyControlActivity.G;
                    } else {
                        arrayList = privacyControlActivity.F;
                    }
                    Bundle bundle = new Bundle();
                    if (i10 == privacyControlActivity.S) {
                        str = "isNeverShare";
                    } else {
                        str = "isAlwaysShare";
                    }
                    bundle.putBoolean(str, true);
                    if (i13 != 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    bundle.putInt("chatAddType", i11);
                    if (i10 == privacyControlActivity.R && i13 == 1) {
                        bundle.putBoolean("allowPremium", true);
                    }
                    if (i13 == 12 && ((i12 = privacyControlActivity.H) != 1 ? !(i12 != 2 ? i12 != 0 || i10 != privacyControlActivity.S : i10 != privacyControlActivity.R) : i10 == privacyControlActivity.R)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bundle.putBoolean("allowMiniapps", z10);
                    r60 r60Var = new r60(bundle);
                    if (i13 == 10) {
                        r60Var.L = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    }
                    if (i10 == privacyControlActivity.R) {
                        boolean[] zArr = privacyControlActivity.f35930x;
                        if (privacyControlActivity.H == 2) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (zArr[c10]) {
                            z11 = true;
                            if (z10 && privacyControlActivity.f35932y[privacyControlActivity.H]) {
                                z12 = true;
                            }
                            r60Var.q0(arrayList, z11, z12);
                            r60Var.f43039w = new eh.a(i10, privacyControlActivity, z10);
                            r60Var.f43019e0 = true;
                            privacyControlActivity.presentFragment(r60Var);
                            return;
                        }
                    }
                    z11 = false;
                    if (z10) {
                        z12 = true;
                    }
                    r60Var.q0(arrayList, z11, z12);
                    r60Var.f43039w = new eh.a(i10, privacyControlActivity, z10);
                    r60Var.f43019e0 = true;
                    privacyControlActivity.presentFragment(r60Var);
                    return;
                }
            }
            if (i10 != privacyControlActivity.V) {
                i15 = 1;
            }
            if (i15 != privacyControlActivity.I) {
                privacyControlActivity.I = i15;
                privacyControlActivity.F0();
                privacyControlActivity.G0(true);
            }
        } else if (i13 == 12 && privacyControlActivity.v0()) {
            int i24 = -privacyControlActivity.N0;
            privacyControlActivity.N0 = i24;
            AndroidUtilities.shakeViewSpring(view, i24);
        } else {
            if (i10 == privacyControlActivity.nobodyRow) {
                i14 = 1;
            } else if (i10 != privacyControlActivity.everybodyRow) {
                if (i10 == privacyControlActivity.f35909f0) {
                    i14 = 3;
                } else {
                    i14 = 2;
                }
            }
            if (i14 == privacyControlActivity.H) {
                return;
            }
            privacyControlActivity.H = i14;
            org.telegram.ui.Components.qc.e();
            privacyControlActivity.F0();
            privacyControlActivity.G0(true);
        }
    }

    public static void Z(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(((TL_account.privacyRules) tLObject).rules, 7);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.y0();
                return;
            }
            return;
        }
        org.telegram.ui.Components.wc.b0(privacyControlActivity).g0(tL_error, false);
    }

    public static void a0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
            MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
            ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, privacyControlActivity.f35928w);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.y0();
                return;
            }
            return;
        }
        privacyControlActivity.C0();
    }

    public final void A0() {
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.f35928w;
        if (i10 == 10 && this.H == 3 && !getUserConfig().isPremium()) {
            showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) this, 27, true));
            return;
        }
        if (this.H != 0 && i10 == 0 && !getUserConfig().isPremium()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (i10 == 1) {
                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.WhoCanAddMeInfo);
                } else {
                    alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.CustomHelp);
                }
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new af0(14, this, globalMainSettings));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder.f22368a);
                return;
            }
        }
        u0();
    }

    public final void B0() {
        lx0 lx0Var = this.d;
        if (lx0Var != null) {
            lx0Var.f41391f.messageOwner.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i10 = this.H;
            if (i10 == 0) {
                this.d.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsEverybody));
                this.d.f41391f.messageOwner.fwd_from.from_id.user_id = 1L;
            } else if (i10 == 1) {
                this.d.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsNobody));
                this.d.f41391f.messageOwner.fwd_from.from_id.user_id = 0L;
            } else {
                this.d.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsContacts));
                this.d.f41391f.messageOwner.fwd_from.from_id.user_id = 1L;
            }
            this.d.f41389b.t2();
        }
    }

    public final void C0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PrivacyFloodControlError);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder.f22368a);
    }

    public final void D0() {
        org.telegram.ui.Components.wc.b0(this).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new yw0(this, 0)).j();
    }

    public final void E0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.v8 v8Var = this.f35925t0;
        if (v8Var != null) {
            if (this.f35929w0 == null) {
                v8Var.getTextView().k(LocaleController.formatString("SetPhotoForRest", R.string.SetPhotoForRest, new Object[0]));
                this.f35925t0.setNeedDivider(false);
            } else {
                v8Var.getTextView().k(LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]));
                this.f35925t0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.y9 y9Var = this.f35926u0;
        if (y9Var != null && (photoSize = this.f35929w0) != null) {
            TLRPC.Photo photo = this.f35931x0;
            if (photo != null) {
                y9Var.h(ImageLocation.getForPhoto(photoSize, photo), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
            } else {
                y9Var.h(ImageLocation.getForLocal(photoSize.location), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
            }
        }
    }

    public final void F0() {
        this.f35902b.a(z0(), true);
    }

    public final void G0(boolean z10) {
        gx0 gx0Var;
        ArrayList arrayList;
        int i10;
        s4.e1 T;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        TLRPC.UserFull userFull;
        if (z10) {
            gx0Var = new gx0(this);
            gx0Var.f(gx0Var.f39797c);
            gx0Var.f39796b = this.f35920q0;
        } else {
            gx0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.Y = -1;
        this.L = -1;
        this.setBirthdayRow = -1;
        this.X = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.R = -1;
        this.S = -1;
        this.Z = -1;
        this.f35901a0 = -1;
        this.O = -1;
        this.P = -1;
        this.f35903b0 = -1;
        this.f35905c0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.Q = -1;
        this.T = -1;
        this.f35909f0 = -1;
        this.f35910g0 = -1;
        this.priceRow = -1;
        this.f35912i0 = -1;
        this.f35911h0 = -1;
        this.f35906d0 = -1;
        this.f35907e0 = -1;
        this.showGiftIconRow = -1;
        this.f35913j0 = -1;
        this.giftTypesHeaderRow = -1;
        this.f35914k0 = -1;
        this.f35915l0 = -1;
        this.m0 = -1;
        this.f35917n0 = -1;
        this.f35918o0 = -1;
        this.f35919p0 = -1;
        this.f35920q0 = 0;
        int i13 = this.f35928w;
        if (i13 == 12) {
            this.showGiftIconRow = 0;
            this.f35920q0 = 2;
            this.f35913j0 = 1;
        }
        if (i13 == 11 && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null && userFull.birthday == null) {
            int i14 = this.f35920q0;
            this.f35920q0 = i14 + 1;
            this.setBirthdayRow = i14;
        }
        if (i13 == 5) {
            int i15 = this.f35920q0;
            this.f35920q0 = i15 + 1;
            this.L = i15;
        }
        int i16 = this.f35920q0;
        this.M = i16;
        this.everybodyRow = i16 + 1;
        int i17 = i16 + 3;
        this.f35920q0 = i17;
        this.N = i16 + 2;
        if (i13 == 4 || i13 == 9 || i13 == 14 || i13 == 0 || i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 8 || i13 == 1 || i13 == 11 || i13 == 12) {
            this.f35920q0 = i16 + 4;
            this.nobodyRow = i17;
        }
        if (getMessagesController().starsPaidMessagesAvailable && i13 == 10) {
            int i18 = this.f35920q0;
            this.f35920q0 = i18 + 1;
            this.f35909f0 = i18;
        }
        if (i13 == 6 && this.H == 1) {
            int i19 = this.f35920q0;
            this.X = i19;
            this.U = i19 + 1;
            this.V = i19 + 2;
            this.f35920q0 = i19 + 4;
            this.W = i19 + 3;
        }
        if (i13 == 10 && this.H == 3) {
            int i20 = this.f35920q0;
            this.f35920q0 = i20 + 1;
            this.P = i20;
        } else {
            int i21 = this.f35920q0;
            this.f35920q0 = i21 + 1;
            this.O = i21;
        }
        if (i13 == 10) {
            if (this.H == 3) {
                int i22 = this.f35920q0;
                this.f35910g0 = i22;
                this.f35920q0 = i22 + 2;
                this.priceRow = i22 + 1;
                if (!getUserConfig().isPremium()) {
                    int i23 = this.f35920q0;
                    this.f35920q0 = i23 + 1;
                    this.f35911h0 = i23;
                }
                int i24 = this.f35920q0;
                this.f35920q0 = i24 + 1;
                this.f35912i0 = i24;
                if (getUserConfig().isPremium()) {
                    int i25 = this.f35920q0;
                    this.Q = i25;
                    this.R = i25 + 1;
                    this.f35920q0 = i25 + 3;
                    this.T = i25 + 2;
                }
            }
        } else if (i13 != 8 || getUserConfig().isPremium()) {
            int i26 = this.f35920q0;
            int i27 = i26 + 1;
            this.f35920q0 = i27;
            this.Q = i26;
            int i28 = this.H;
            if (i28 == 1 || i28 == 2) {
                this.f35920q0 = i26 + 2;
                this.R = i27;
            }
            if (i28 == 0 || i28 == 2) {
                int i29 = this.f35920q0;
                this.f35920q0 = i29 + 1;
                this.S = i29;
            }
            int i30 = this.f35920q0;
            int i31 = i30 + 1;
            this.f35920q0 = i31;
            this.T = i30;
            if (i13 == 2) {
                this.Z = i31;
                this.f35901a0 = i30 + 2;
                this.f35920q0 = i30 + 4;
                this.f35903b0 = i30 + 3;
            }
            if (i13 == 4 && (this.G.size() > 0 || (i10 = this.H) == 2 || i10 == 1)) {
                int i32 = this.f35920q0;
                int i33 = i32 + 1;
                this.f35920q0 = i33;
                this.photoForRestRow = i32;
                if (this.f35929w0 != null) {
                    this.f35920q0 = i32 + 2;
                    this.currentPhotoForRestRow = i33;
                }
                int i34 = this.f35920q0;
                this.f35920q0 = i34 + 1;
                this.Y = i34;
            }
            if (i13 == 0 && (this.H != 0 || ((arrayList = this.G) != null && !arrayList.isEmpty()))) {
                int i35 = this.f35920q0;
                this.readRow = i35;
                this.f35920q0 = i35 + 2;
                this.f35905c0 = i35 + 1;
            }
            if (i13 == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i36 = this.f35920q0;
                this.f35906d0 = i36;
                this.f35920q0 = i36 + 2;
                this.f35907e0 = i36 + 1;
            }
        }
        if (i13 == 12) {
            int i37 = this.f35920q0;
            this.giftTypesHeaderRow = i37;
            this.f35915l0 = i37 + 1;
            this.f35914k0 = i37 + 2;
            this.m0 = i37 + 3;
            this.f35917n0 = i37 + 4;
            this.f35918o0 = i37 + 5;
            this.f35920q0 = i37 + 7;
            this.f35919p0 = i37 + 6;
        }
        B0();
        kx0 kx0Var = this.f35900a;
        if (kx0Var != null) {
            if (z10) {
                int childCount = this.f35904c.getChildCount();
                for (int i38 = 0; i38 < childCount; i38++) {
                    View childAt = this.f35904c.getChildAt(i38);
                    if (childAt instanceof org.telegram.ui.Cells.o6) {
                        org.telegram.ui.Components.mm0 mm0Var = this.f35904c;
                        View F = mm0Var.F(childAt);
                        if (F == null) {
                            T = null;
                        } else {
                            T = mm0Var.T(F);
                        }
                        if (T != null) {
                            int b10 = T.b();
                            org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) childAt;
                            int i39 = this.everybodyRow;
                            if (b10 != i39 && b10 != this.N && b10 != this.nobodyRow && b10 != this.f35909f0) {
                                if (b10 == this.W) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (this.I == i12) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                o6Var.a(z12, true);
                            } else {
                                if (b10 == i39) {
                                    i11 = 0;
                                } else if (b10 == this.N) {
                                    i11 = 2;
                                } else if (b10 == this.nobodyRow) {
                                    i11 = 1;
                                } else {
                                    i11 = 3;
                                }
                                if (this.H == i11) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                o6Var.a(z11, true);
                            }
                        }
                    }
                }
                gx0Var.f(gx0Var.d);
                s4.p.c(gx0Var, true).c(this.f35900a);
                AndroidUtilities.updateVisibleRows(this.f35904c);
                return;
            }
            kx0Var.l();
        }
    }

    @Override
    public final void R(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.f35929w0 = photoSize3;
                privacyControlActivity.f35931x0 = null;
                privacyControlActivity.E0();
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
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new l(privacyControlActivity, 19));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().getCurrentUser().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().getCurrentUser().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().getCurrentUser().access_hash;
                    org.telegram.ui.Components.wc.b0(privacyControlActivity).W(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip), null, null).j();
                }
                privacyControlActivity.G0(false);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23640sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23658ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23362dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23618ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23429h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23357d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
    }

    @Override
    public final boolean canBeginSlide() {
        return w0(true);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        int i10 = this.f35928w;
        if (i10 == 5) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.setWillNotDraw(false);
            frameLayout.setClipToPadding(false);
            frameLayout.d = org.telegram.ui.ActionBar.y6.X0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23318b7);
            frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(R.string.PrivacyForwardsMessageLine);
            tL_message.date = ((int) (System.currentTimeMillis() / 1000)) - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 261;
            tL_message.from_id = new TLRPC.TL_peerUser();
            tL_message.f22048id = 1;
            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
            tL_message.fwd_from = tL_messageFwdHeader;
            tL_messageFwdHeader.from_name = ContactsController.formatName(user.first_name, user.last_name);
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.out = false;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, true, false);
            frameLayout.f41391f = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            org.telegram.ui.Cells.s1 s1Var = new org.telegram.ui.Cells.s1(context, this.currentAccount);
            frameLayout.f41389b = s1Var;
            s1Var.setDelegate(new u7.s(16));
            s1Var.N7 = false;
            s1Var.setFullyDraw(true);
            s1Var.Z3(messageObject, null, false, false, false, false);
            frameLayout.addView(s1Var, org.telegram.ui.Components.gb1.r(-1, -2));
            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(1, context, null, true);
            frameLayout.e = t40Var;
            frameLayout.addView(t40Var, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.d = frameLayout;
        }
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (i10 == 6) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyPhone));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyForwards));
        } else if (i10 == 4) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyProfilePhoto));
        } else if (i10 == 9) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyBio));
        } else if (i10 == 14) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyMusic));
        } else if (i10 == 3) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyP2P));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.Calls));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyInvites));
        } else if (i10 == 8) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyVoiceMessages));
        } else if (i10 == 0) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyLastSeen));
        } else if (i10 == 10) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyMessages));
        } else if (i10 == 11) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyBirthday));
        } else if (i10 == 12) {
            this.simpleActionBar.setTitle(LocaleController.getString(R.string.PrivacyGifts));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 26));
        this.simpleActionBar.j();
        org.telegram.ui.ActionBar.u5 i11 = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        this.f35902b = i11;
        i11.a(z0(), false);
        this.f35900a = new kx0(this, context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f35904c = mm0Var;
        mm0Var.u1();
        this.f35904c.setLayoutManager(new s4.c0(1, false));
        this.f35904c.setSectionsDrawBackground(true);
        this.f35904c.setVerticalScrollBarEnabled(false);
        ((s4.l) this.f35904c.getItemAnimator()).C = false;
        frameLayout2.addView(this.f35904c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f35904c.setAdapter(this.f35900a);
        this.f35904c.setOnItemClickListener(new h(this, 27));
        fx0 fx0Var = new fx0(this);
        fx0Var.n(350L);
        fx0Var.o(org.telegram.ui.Components.ds.h);
        fx0Var.C = false;
        this.f35904c.setItemAnimator(fx0Var);
        B0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        lx0 lx0Var;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            x0();
        } else if (i10 == NotificationCenter.emojiLoaded) {
            this.f35904c.g1();
        } else if (i10 == NotificationCenter.didSetNewWallpapper && (lx0Var = this.d) != null) {
            lx0Var.invalidate();
        }
    }

    @Override
    public final boolean e() {
        return true;
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
        return this.f35904c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23380ec));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23398fc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23303ab));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23342cb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23361db));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ad));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23397fb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23547nd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23639sb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23567od));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f35904c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23545nb));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return w0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        x0();
        G0(false);
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
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.g50 g50Var = this.f35922r0;
        if (g50Var != null) {
            g50Var.i();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        G0(false);
        org.telegram.ui.Components.g50 g50Var = this.f35922r0;
        if (g50Var != null) {
            g50Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            lx0 lx0Var = this.d;
            if (lx0Var != null) {
                lx0Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    public final void u0() {
        final AtomicInteger atomicInteger;
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        TLRPC.InputUser inputUser3;
        char c10 = 0;
        boolean z10 = false;
        int i10 = this.f35928w;
        if (i10 == 10) {
            boolean[] zArr = {true};
            if (this.H == 3) {
                ArrayList arrayList = this.h;
                Collections.sort(arrayList);
                Collections.sort(this.F);
                if (!arrayList.equals(this.F)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.H != 0 && this.F.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i11 = 0; i11 < this.F.size(); i11++) {
                            Long l4 = (Long) this.F.get(i11);
                            long longValue = l4.longValue();
                            if (DialogObject.isUserDialog(longValue)) {
                                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l4);
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
                    getConnectionsManager().sendRequest(setprivacy, new j10(22, this, zArr));
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
            int i12 = this.H;
            if (i12 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.K;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                if (i12 == 2) {
                    z10 = true;
                }
                globalPrivacySettings4.new_noncontact_peers_require_premium = z10;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new bi.i2(this, zArr, globalPrivacySettings, setglobalprivacysettings, 16));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i10 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.H == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.I == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) {
                    public final PrivacyControlActivity f46379b;

                    {
                        this.f46379b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final PrivacyControlActivity privacyControlActivity = this.f46379b;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r5) {
                                            case 0:
                                                PrivacyControlActivity.Z(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                return;
                                            default:
                                                PrivacyControlActivity.a0(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final PrivacyControlActivity privacyControlActivity2 = this.f46379b;
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r5) {
                                            case 0:
                                                PrivacyControlActivity.Z(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                return;
                                            default:
                                                PrivacyControlActivity.a0(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                return;
                                        }
                                    }
                                });
                                return;
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
        if (this.H != 0 && this.F.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i13 = 0; i13 < this.F.size(); i13++) {
                Long l10 = (Long) this.F.get(i13);
                long longValue2 = l10.longValue();
                if (DialogObject.isUserDialog(longValue2)) {
                    TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(l10);
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
        if (this.H != 1 && this.G.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i14 = 0; i14 < this.G.size(); i14++) {
                Long l11 = (Long) this.G.get(i14);
                long longValue3 = l11.longValue();
                if (DialogObject.isUserDialog(longValue3)) {
                    TLRPC.User user3 = getMessagesController().getUser(l11);
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
        int i15 = this.H;
        if (i15 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i15 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i15 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i16 = this.H;
        if (i16 != 0) {
            if (i16 != 2) {
                c10 = 1;
            }
            if (this.f35930x[c10]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i17 = this.H;
        if (this.f35932y[i17]) {
            if (i17 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) {
            public final PrivacyControlActivity f46379b;

            {
                this.f46379b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final PrivacyControlActivity privacyControlActivity = this.f46379b;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        PrivacyControlActivity.Z(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        return;
                                    default:
                                        PrivacyControlActivity.a0(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final PrivacyControlActivity privacyControlActivity2 = this.f46379b;
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        PrivacyControlActivity.Z(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        return;
                                    default:
                                        PrivacyControlActivity.a0(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }, 2);
        if (i10 == 0 && this.A0 != this.f35934z0) {
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
            globalPrivacySettings6.hide_read_marks = this.A0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) {
                public final PrivacyControlActivity f37911b;

                {
                    this.f37911b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f37911b;
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
                                            privacyControlActivity2.f35934z0 = z11;
                                            globalPrivacySettings7.hide_read_marks = z11;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.y0();
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
                                            privacyControlActivity3.B0 = z13;
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
                                                privacyControlActivity3.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.J0 = !z17;
                                                boolean z18 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z18;
                                                privacyControlActivity3.L0 = !z18;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.y0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.f37911b;
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
                                            privacyControlActivity22.f35934z0 = z11;
                                            globalPrivacySettings8.hide_read_marks = z11;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.y0();
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
                                            privacyControlActivity3.B0 = z13;
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
                                                privacyControlActivity3.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.J0 = !z17;
                                                boolean z18 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z18;
                                                privacyControlActivity3.L0 = !z18;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.y0();
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
        if (i10 == 12 && (this.C0 != this.B0 || this.G0 != this.F0 || this.E0 != this.D0 || this.I0 != this.H0 || this.M0 != this.L0)) {
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
            globalPrivacySettings8.display_gifts_button = this.C0;
            if (getUserConfig().isPremium()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.E0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.G0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.I0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.M0;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) {
                public final PrivacyControlActivity f37911b;

                {
                    this.f37911b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f37911b;
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
                                            privacyControlActivity22.f35934z0 = z11;
                                            globalPrivacySettings72.hide_read_marks = z11;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity22.y0();
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
                                            privacyControlActivity3.B0 = z13;
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
                                                privacyControlActivity3.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.J0 = !z17;
                                                boolean z18 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z18;
                                                privacyControlActivity3.L0 = !z18;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.y0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.f37911b;
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
                                            privacyControlActivity22.f35934z0 = z11;
                                            globalPrivacySettings82.hide_read_marks = z11;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.y0();
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
                                            privacyControlActivity3.B0 = z13;
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
                                                privacyControlActivity3.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.J0 = !z17;
                                                boolean z18 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z18;
                                                privacyControlActivity3.L0 = !z18;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.y0();
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
            this.f35902b.b(true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final boolean v0() {
        if (!this.I0 && !this.E0 && !this.G0) {
            return true;
        }
        return false;
    }

    public final boolean w0(boolean z10) {
        if (this.f35902b.f23138w.f19327f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new cx0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new cx0(this, 2));
                showDialog(alertDialog$Builder.f22368a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void x0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z14;
        int i10;
        char c10;
        boolean z15;
        boolean[] zArr;
        ArrayList<TLRPC.PrivacyRule> arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.h;
        int i11 = 2;
        int i12 = this.f35928w;
        if (i12 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings();
            i11 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 0;
            this.H = i11;
            this.e = i11;
            this.G = new ArrayList();
            this.F = new ArrayList();
            if (globalPrivacySettings != null && (globalPrivacySettings.flags & 32) != 0) {
                long clamp = Utilities.clamp(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.K = clamp;
                this.J = clamp;
                this.H = 3;
                this.e = 3;
            } else {
                this.K = 10L;
                this.J = 10L;
            }
            ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(13);
            this.F = new ArrayList();
            if (privacyRules != null) {
                for (int i13 = 0; i13 < privacyRules.size(); i13++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i13);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i14 = 0;
                        while (i14 < size) {
                            i14 = c3.h0.j(-tL_privacyValueAllowChatParticipants.chats.get(i14).longValue(), this.F, i14, 1);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.F.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.F);
            return;
        }
        if (i12 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean[] zArr4 = this.f35921r;
        zArr4[0] = z10;
        boolean[] zArr5 = this.f35930x;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.f35923s;
        zArr6[0] = false;
        boolean[] zArr7 = this.f35932y;
        zArr7[0] = false;
        if (i12 == 12) {
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
        boolean[] zArr8 = this.v;
        zArr8[0] = false;
        boolean[] zArr9 = this.E;
        zArr9[0] = false;
        if (i12 == 12) {
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
        this.F = new ArrayList();
        this.G = new ArrayList();
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i12);
        if (privacyRules2 != null && privacyRules2.size() != 0) {
            Boolean bool2 = null;
            int i15 = 0;
            boolean z16 = false;
            boolean z17 = false;
            char c11 = 65535;
            while (i15 < privacyRules2.size()) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i15);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        i16 = c3.h0.j(-tL_privacyValueAllowChatParticipants2.chats.get(i16).longValue(), this.F, i16, 1);
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
                        int i17 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); i17 < size3; size3 = size3) {
                            i17 = c3.h0.j(-tL_privacyValueDisallowChatParticipants.chats.get(i17).longValue(), this.G, i17, 1);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.F.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.G.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
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
                        i15++;
                        zArr5 = zArr3;
                        zArr6 = zArr;
                        privacyRules2 = arrayList;
                        zArr4 = zArr2;
                    }
                }
                zArr3 = zArr5;
                i15++;
                zArr5 = zArr3;
                zArr6 = zArr;
                privacyRules2 = arrayList;
                zArr4 = zArr2;
            }
            boolean[] zArr10 = zArr6;
            boolean[] zArr11 = zArr4;
            boolean[] zArr12 = zArr5;
            if (c11 == 0 || (c11 == 65535 && (this.G.size() > 0 || (bool2 != null && !bool2.booleanValue())))) {
                i10 = 2;
                this.H = 0;
            } else {
                i10 = 2;
                if (c11 != 2) {
                    if (c11 == 65535 && this.G.size() > 0 && this.F.size() > 0) {
                        i10 = 2;
                    } else {
                        int i18 = 1;
                        if (c11 != 1) {
                            if (c11 == 65535 && (this.F.size() > 0 || (bool2 != null && bool2.booleanValue()))) {
                                i18 = 1;
                            }
                            i10 = 2;
                        }
                        this.H = i18;
                        i10 = 2;
                    }
                }
                this.H = i10;
            }
            int i19 = this.H;
            if (i19 == i10) {
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
            zArr10[i19] = z15;
            zArr7[i19] = z15;
            zArr8[i19] = false;
            zArr9[i19] = false;
            org.telegram.ui.ActionBar.u5 u5Var = this.f35902b;
            if (u5Var != null) {
                u5Var.a(false, false);
            }
        } else {
            this.H = 1;
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.f35916n;
        arrayList3.clear();
        this.e = this.H;
        arrayList2.addAll(this.F);
        arrayList3.addAll(this.G);
        if (i12 == 6) {
            ArrayList<TLRPC.PrivacyRule> privacyRules3 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(7);
            if (privacyRules3 != null && privacyRules3.size() != 0) {
                int i20 = 0;
                while (true) {
                    if (i20 >= privacyRules3.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = privacyRules3.get(i20);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.I = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.I = 2;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                        this.I = 1;
                        break;
                    } else {
                        i20++;
                    }
                }
            } else {
                this.I = 0;
            }
            this.f35908f = this.I;
        }
        if (i12 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f35934z0 = z14;
            this.A0 = z14;
        }
        if (i12 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.B0 = z13;
            this.C0 = z13;
            if (globalPrivacySettings3 != null && (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) != null) {
                boolean z20 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.E0 = z20;
                this.D0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.G0 = z21;
                this.F0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.I0 = z22;
                this.H0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.K0 = z23;
                this.J0 = z23;
                boolean z24 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.M0 = z24;
                this.L0 = z24;
            } else {
                this.E0 = true;
                this.D0 = true;
                this.G0 = true;
                this.F0 = true;
                this.I0 = true;
                this.H0 = true;
                this.K0 = true;
                this.J0 = true;
                this.M0 = true;
                this.L0 = true;
            }
        }
        G0(false);
        AndroidUtilities.updateVisibleRows(this.f35904c);
    }

    public final void y0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        int i10;
        int i11;
        this.f35902b.b(false);
        int i12 = this.f35928w;
        if ((i12 == 10 || i12 == 1 || i12 == 2) && this.H != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i13 = 0; i13 < 2; i13++) {
                int i14 = iArr[i13];
                ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i14);
                if (i14 != i12 && ContactsController.findRule(privacyRules, TLRPC.TL_privacyValueAllowAll.class) != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.resourceProvider);
                    if (i14 == 1) {
                        i10 = R.string.CheckPrivacyInviteTitle;
                    } else {
                        i10 = R.string.CheckPrivacyCallsTitle;
                    }
                    alertDialog$Builder.f22368a.R = LocaleController.getString(i10);
                    if (i14 == 1) {
                        i11 = R.string.CheckPrivacyInviteText;
                    } else {
                        i11 = R.string.CheckPrivacyCallsText;
                    }
                    alertDialog$Builder.f22368a.T = LocaleController.getString(i11);
                    alertDialog$Builder.k(LocaleController.getString(R.string.CheckPrivacyReview), new i2.r(this, i14, 17));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new cx0(this, 1));
                    alertDialog$Builder.p();
                    return;
                }
            }
        }
        finishFragment();
    }

    public final boolean z0() {
        char c10;
        char c11;
        ArrayList arrayList;
        int i10 = this.f35928w;
        if (i10 == 0 && ((this.H != 0 || ((arrayList = this.G) != null && !arrayList.isEmpty())) && this.f35934z0 != this.A0)) {
            return true;
        }
        if (i10 == 12 && (this.B0 != this.C0 || this.F0 != this.G0 || this.D0 != this.E0 || this.H0 != this.I0 || this.J0 != this.K0 || this.L0 != this.M0)) {
            return true;
        }
        int i11 = this.e;
        int i12 = this.H;
        if (i11 != i12) {
            return true;
        }
        if (i10 == 6 && i12 == 1 && this.f35908f != this.I) {
            return true;
        }
        if (i12 != 0) {
            if (i12 == 2) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            boolean z10 = this.f35921r[c10];
            if (i12 == 2) {
                c11 = 0;
            } else {
                c11 = 1;
            }
            if (z10 != this.f35930x[c11]) {
                return true;
            }
        }
        if ((i10 == 10 && i12 == 3 && this.K != this.J) || this.f35923s[i12] != this.f35932y[i12]) {
            return true;
        }
        ArrayList arrayList2 = this.f35916n;
        if (arrayList2.size() != this.G.size()) {
            return true;
        }
        ArrayList arrayList3 = this.h;
        if (arrayList3.size() != this.F.size()) {
            return true;
        }
        if (i10 != 10 || this.H == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.F);
            if (!arrayList3.equals(this.F)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.G);
            if (!arrayList2.equals(this.G)) {
                return true;
            }
        }
        return false;
    }

    public PrivacyControlActivity(int i10) {
        this(i10, false);
    }

    @Override
    public final void Q() {
    }

    @Override
    public final void F(float f7) {
    }

    @Override
    public final void L(boolean z10, boolean z11) {
    }
}

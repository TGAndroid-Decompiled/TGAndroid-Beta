package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
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
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.b50 {
    public SpannableString A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public final boolean[] E;
    public boolean E0;
    public final boolean[] F;
    public boolean F0;
    public final boolean[] G;
    public boolean G0;
    public ArrayList H;
    public boolean H0;
    public ArrayList I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public boolean K0;
    public long L;
    public boolean L0;
    public long M;
    public boolean M0;
    public int N;
    public boolean N0;
    public int O;
    public boolean O0;
    public int P;
    public int P0;
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
    public fx0 f33836a;
    public int f33837a0;
    public org.telegram.ui.Components.yr f33838b;
    public int f33839b0;
    public org.telegram.ui.Components.cq f33840c;
    public int f33841c0;
    private int currentPhotoForRestRow;
    public org.telegram.ui.ActionBar.u0 d;
    public int f33842d0;
    public org.telegram.ui.Components.lm0 e;
    public int f33843e0;
    private int everybodyRow;
    public gx0 f33844f;
    public int f33845f0;
    public int f33846g0;
    private int giftTypesHeaderRow;
    public int h;
    public int f33847h0;
    public int f33848i0;
    public int f33849j0;
    public int f33850k0;
    public int f33851l0;
    public int m0;
    public int f33852n;
    public int f33853n0;
    private int nobodyRow;
    public int f33854o0;
    public int f33855p0;
    private int photoForRestRow;
    private int priceRow;
    public int f33856q0;
    public final ArrayList f33857r;
    public int f33858r0;
    private int readRow;
    public final ArrayList f33859s;
    public int f33860s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public final org.telegram.ui.Components.c50 f33861t0;
    public org.telegram.ui.Components.xj0 f33862u0;
    public final boolean[] v;
    public org.telegram.ui.Cells.r8 f33863v0;
    public final boolean[] f33864w;
    public org.telegram.ui.Components.u9 f33865w0;
    public final boolean[] f33866x;
    public fs f33867x0;
    public final int f33868y;
    public TLRPC.PhotoSize f33869y0;
    public TLRPC.Photo f33870z0;

    public PrivacyControlActivity(int i10, boolean z10) {
        super(null);
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        this.f33857r = new ArrayList();
        this.f33859s = new ArrayList();
        this.v = new boolean[4];
        this.f33864w = new boolean[4];
        this.f33866x = new boolean[4];
        this.E = new boolean[4];
        this.F = new boolean[4];
        this.G = new boolean[4];
        this.M = 10L;
        this.P0 = 4;
        this.f33868y = i10;
        if (z10) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (i10 == 4) {
            org.telegram.ui.Components.c50 c50Var = new org.telegram.ui.Components.c50(0, true, true);
            this.f33861t0 = c50Var;
            c50Var.f25185a = this;
            c50Var.f25186b = this;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, 1000)) == null) {
                return;
            }
            this.f33869y0 = closestPhotoSizeWithSize;
            this.f33870z0 = userFull.fallback_photo;
        }
    }

    public static void U(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.f33869y0 = null;
        privacyControlActivity.f33870z0 = null;
        TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
        if (userFull != null && (photo = userFull.fallback_photo) != null) {
            userFull.flags &= -4194305;
            userFull.fallback_photo = null;
            privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
            privacyControlActivity.D0();
            privacyControlActivity.F0(true);
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f20363id = photo.f20368id;
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

    public static void V(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
            MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
            ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, 13);
            AndroidUtilities.runOnUIThread(new lv0(3, privacyControlActivity, zArr));
            return;
        }
        privacyControlActivity.B0();
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
            if (closestPhotoSizeWithSize != null && privacyControlActivity.f33869y0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.f33869y0, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.f33869y0.location.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(privacyControlActivity.f33869y0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@50_50", sb3), ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 != null && privacyControlActivity.f33869y0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.f33869y0.location, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
        }
    }

    public static void X(PrivacyControlActivity privacyControlActivity, View view, int i10) {
        ArrayList arrayList;
        String str;
        int i11;
        boolean z10;
        boolean z11;
        char c10;
        int i12;
        int i13 = privacyControlActivity.f33868y;
        if (i10 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.c2 c2Var = org.telegram.ui.Components.d5.N(privacyControlActivity.getParentActivity(), LocaleController.getString(R.string.RemovePublicPhoto), LocaleController.getString(R.string.RemovePhotoForRestDescription), LocaleController.getString(R.string.Remove), new tw0(privacyControlActivity, 1), null).f20679a;
            c2Var.show();
            c2Var.i();
            return;
        }
        int i14 = 0;
        r2 = false;
        boolean z12 = false;
        int i15 = 0;
        if (i10 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.c50 c50Var = privacyControlActivity.f33861t0;
            if (c50Var != null) {
                c50Var.n(false, new ah.j(23), new v5(privacyControlActivity, 12), 0);
                privacyControlActivity.f33862u0.M(0);
                privacyControlActivity.f33862u0.P(43);
                privacyControlActivity.f33863v0.e.d();
            }
        } else if (i13 == 10 && i10 == privacyControlActivity.P && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium()) {
            org.telegram.ui.Components.vc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new tw0(privacyControlActivity, 2)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i16 = -privacyControlActivity.P0;
            privacyControlActivity.P0 = i16;
            AndroidUtilities.shakeViewSpring(view, i16);
        } else if (i13 == 8 && ((i10 == privacyControlActivity.P || i10 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().isPremium())) {
            org.telegram.ui.Components.vc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new tw0(privacyControlActivity, 3)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i17 = -privacyControlActivity.P0;
            privacyControlActivity.P0 = i17;
            AndroidUtilities.shakeViewSpring(view, i17);
        } else if (i10 != privacyControlActivity.nobodyRow && i10 != privacyControlActivity.everybodyRow && i10 != privacyControlActivity.P && i10 != privacyControlActivity.f33847h0) {
            if (i10 != privacyControlActivity.Y && i10 != privacyControlActivity.X) {
                if (i10 != privacyControlActivity.U && i10 != privacyControlActivity.T) {
                    if (i10 == privacyControlActivity.f33841c0) {
                        privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
                        return;
                    } else if (i10 == privacyControlActivity.readRow) {
                        privacyControlActivity.C0 = !privacyControlActivity.C0;
                        privacyControlActivity.E0();
                        ((org.telegram.ui.Cells.w8) view).setChecked(privacyControlActivity.C0);
                        return;
                    } else if (i10 == privacyControlActivity.f33845f0) {
                        privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
                        return;
                    } else if (i10 == privacyControlActivity.showGiftIconRow) {
                        privacyControlActivity.E0 = !privacyControlActivity.E0;
                        privacyControlActivity.E0();
                        ((org.telegram.ui.Cells.w8) view).setChecked(privacyControlActivity.E0);
                        return;
                    } else if (i10 == privacyControlActivity.f33853n0) {
                        if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i18 = -privacyControlActivity.P0;
                            privacyControlActivity.P0 = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            privacyControlActivity.C0();
                            return;
                        }
                        boolean u02 = privacyControlActivity.u0();
                        privacyControlActivity.I0 = !privacyControlActivity.I0;
                        privacyControlActivity.E0();
                        org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                        w8Var.setChecked(privacyControlActivity.I0);
                        if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            w8Var.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (u02 != privacyControlActivity.u0()) {
                            privacyControlActivity.F0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.e);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.m0) {
                        if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i19 = -privacyControlActivity.P0;
                            privacyControlActivity.P0 = i19;
                            AndroidUtilities.shakeViewSpring(view, i19);
                            privacyControlActivity.C0();
                            return;
                        }
                        boolean u03 = privacyControlActivity.u0();
                        privacyControlActivity.G0 = !privacyControlActivity.G0;
                        privacyControlActivity.E0();
                        org.telegram.ui.Cells.w8 w8Var2 = (org.telegram.ui.Cells.w8) view;
                        w8Var2.setChecked(privacyControlActivity.G0);
                        if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            w8Var2.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (u03 != privacyControlActivity.u0()) {
                            privacyControlActivity.F0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.e);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f33854o0) {
                        if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i20 = -privacyControlActivity.P0;
                            privacyControlActivity.P0 = i20;
                            AndroidUtilities.shakeViewSpring(view, i20);
                            privacyControlActivity.C0();
                            return;
                        }
                        boolean u04 = privacyControlActivity.u0();
                        privacyControlActivity.K0 = !privacyControlActivity.K0;
                        privacyControlActivity.E0();
                        org.telegram.ui.Cells.w8 w8Var3 = (org.telegram.ui.Cells.w8) view;
                        w8Var3.setChecked(privacyControlActivity.K0);
                        if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            w8Var3.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (u04 != privacyControlActivity.u0()) {
                            privacyControlActivity.F0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.e);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f33855p0) {
                        if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i21 = -privacyControlActivity.P0;
                            privacyControlActivity.P0 = i21;
                            AndroidUtilities.shakeViewSpring(view, i21);
                            privacyControlActivity.C0();
                            return;
                        }
                        boolean u05 = privacyControlActivity.u0();
                        privacyControlActivity.M0 = !privacyControlActivity.M0;
                        privacyControlActivity.E0();
                        org.telegram.ui.Cells.w8 w8Var4 = (org.telegram.ui.Cells.w8) view;
                        w8Var4.setChecked(privacyControlActivity.M0);
                        if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            w8Var4.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (u05 != privacyControlActivity.u0()) {
                            privacyControlActivity.F0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.e);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f33856q0) {
                        if (privacyControlActivity.O0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i22 = -privacyControlActivity.P0;
                            privacyControlActivity.P0 = i22;
                            AndroidUtilities.shakeViewSpring(view, i22);
                            privacyControlActivity.C0();
                            return;
                        }
                        boolean u06 = privacyControlActivity.u0();
                        privacyControlActivity.O0 = !privacyControlActivity.O0;
                        privacyControlActivity.E0();
                        org.telegram.ui.Cells.w8 w8Var5 = (org.telegram.ui.Cells.w8) view;
                        w8Var5.setChecked(privacyControlActivity.O0);
                        if (privacyControlActivity.O0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            w8Var5.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (u06 != privacyControlActivity.u0()) {
                            privacyControlActivity.F0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.e);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i13 == 12 && privacyControlActivity.u0()) {
                    int i23 = -privacyControlActivity.P0;
                    privacyControlActivity.P0 = i23;
                    AndroidUtilities.shakeViewSpring(view, i23);
                    return;
                } else {
                    if (i10 == privacyControlActivity.U) {
                        arrayList = privacyControlActivity.I;
                    } else {
                        arrayList = privacyControlActivity.H;
                    }
                    Bundle bundle = new Bundle();
                    if (i10 == privacyControlActivity.U) {
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
                    if (i10 == privacyControlActivity.T && i13 == 1) {
                        bundle.putBoolean("allowPremium", true);
                    }
                    if (i13 == 12 && ((i12 = privacyControlActivity.J) != 1 ? !(i12 != 2 ? i12 != 0 || i10 != privacyControlActivity.U : i10 != privacyControlActivity.T) : i10 == privacyControlActivity.T)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bundle.putBoolean("allowMiniapps", z10);
                    p60 p60Var = new p60(bundle);
                    if (i13 == 10) {
                        p60Var.L = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    }
                    if (i10 == privacyControlActivity.T) {
                        boolean[] zArr = privacyControlActivity.E;
                        if (privacyControlActivity.J == 2) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (zArr[c10]) {
                            z11 = true;
                            if (z10 && privacyControlActivity.F[privacyControlActivity.J]) {
                                z12 = true;
                            }
                            p60Var.p0(arrayList, z11, z12);
                            p60Var.f40375w = new dh.a(i10, privacyControlActivity, z10);
                            p60Var.f40355e0 = true;
                            privacyControlActivity.presentFragment(p60Var);
                            return;
                        }
                    }
                    z11 = false;
                    if (z10) {
                        z12 = true;
                    }
                    p60Var.p0(arrayList, z11, z12);
                    p60Var.f40375w = new dh.a(i10, privacyControlActivity, z10);
                    p60Var.f40355e0 = true;
                    privacyControlActivity.presentFragment(p60Var);
                    return;
                }
            }
            if (i10 != privacyControlActivity.X) {
                i15 = 1;
            }
            if (i15 != privacyControlActivity.K) {
                privacyControlActivity.K = i15;
                privacyControlActivity.E0();
                privacyControlActivity.F0(true);
            }
        } else if (i13 == 12 && privacyControlActivity.u0()) {
            int i24 = -privacyControlActivity.P0;
            privacyControlActivity.P0 = i24;
            AndroidUtilities.shakeViewSpring(view, i24);
        } else {
            if (i10 == privacyControlActivity.nobodyRow) {
                i14 = 1;
            } else if (i10 != privacyControlActivity.everybodyRow) {
                if (i10 == privacyControlActivity.f33847h0) {
                    i14 = 3;
                } else {
                    i14 = 2;
                }
            }
            if (i14 == privacyControlActivity.J) {
                return;
            }
            privacyControlActivity.J = i14;
            org.telegram.ui.Components.oc.e();
            privacyControlActivity.E0();
            privacyControlActivity.F0(true);
        }
    }

    public static void Y(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(((TL_account.privacyRules) tLObject).rules, 7);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.x0();
                return;
            }
            return;
        }
        org.telegram.ui.Components.vc.a0(privacyControlActivity).f0(tL_error, false);
    }

    public static void Z(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
            MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
            ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, privacyControlActivity.f33868y);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.x0();
                return;
            }
            return;
        }
        privacyControlActivity.B0();
    }

    public final void A0() {
        gx0 gx0Var = this.f33844f;
        if (gx0Var != null) {
            gx0Var.f37678f.messageOwner.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i10 = this.J;
            if (i10 == 0) {
                this.f33844f.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsEverybody));
                this.f33844f.f37678f.messageOwner.fwd_from.from_id.user_id = 1L;
            } else if (i10 == 1) {
                this.f33844f.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsNobody));
                this.f33844f.f37678f.messageOwner.fwd_from.from_id.user_id = 0L;
            } else {
                this.f33844f.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsContacts));
                this.f33844f.f37678f.messageOwner.fwd_from.from_id.user_id = 1L;
            }
            this.f33844f.f37676b.s2();
        }
    }

    public final void B0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PrivacyFloodControlError);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder.f20679a);
    }

    public final void C0() {
        org.telegram.ui.Components.vc.a0(this).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new tw0(this, 0)).j();
    }

    public final void D0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.r8 r8Var = this.f33863v0;
        if (r8Var != null) {
            if (this.f33869y0 == null) {
                r8Var.getTextView().k(LocaleController.formatString("SetPhotoForRest", R.string.SetPhotoForRest, new Object[0]));
                this.f33863v0.setNeedDivider(false);
            } else {
                r8Var.getTextView().k(LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]));
                this.f33863v0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.u9 u9Var = this.f33865w0;
        if (u9Var != null && (photoSize = this.f33869y0) != null) {
            TLRPC.Photo photo = this.f33870z0;
            if (photo != null) {
                u9Var.h(ImageLocation.getForPhoto(photoSize, photo), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
            } else {
                u9Var.h(ImageLocation.getForLocal(photoSize.location), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
            }
        }
    }

    public final void E0() {
        float f7;
        float f10;
        boolean y02 = y0();
        this.d.setEnabled(y02);
        ViewPropertyAnimator animate = this.d.animate();
        float f11 = 0.0f;
        if (y02) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f7);
        if (y02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f10);
        if (y02) {
            f11 = 1.0f;
        }
        scaleX.scaleY(f11).setDuration(180L).start();
    }

    public final void F0(boolean z10) {
        bx0 bx0Var;
        ArrayList arrayList;
        int i10;
        s4.b1 T;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        TLRPC.UserFull userFull;
        if (z10) {
            bx0Var = new bx0(this);
            bx0Var.f(bx0Var.f36159c);
            bx0Var.f36158b = this.f33860s0;
        } else {
            bx0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.f33837a0 = -1;
        this.N = -1;
        this.setBirthdayRow = -1;
        this.Z = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.T = -1;
        this.U = -1;
        this.f33839b0 = -1;
        this.f33841c0 = -1;
        this.Q = -1;
        this.R = -1;
        this.f33842d0 = -1;
        this.f33843e0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.S = -1;
        this.V = -1;
        this.f33847h0 = -1;
        this.f33848i0 = -1;
        this.priceRow = -1;
        this.f33850k0 = -1;
        this.f33849j0 = -1;
        this.f33845f0 = -1;
        this.f33846g0 = -1;
        this.showGiftIconRow = -1;
        this.f33851l0 = -1;
        this.giftTypesHeaderRow = -1;
        this.m0 = -1;
        this.f33853n0 = -1;
        this.f33854o0 = -1;
        this.f33855p0 = -1;
        this.f33856q0 = -1;
        this.f33858r0 = -1;
        this.f33860s0 = 0;
        int i13 = this.f33868y;
        if (i13 == 12) {
            this.showGiftIconRow = 0;
            this.f33860s0 = 2;
            this.f33851l0 = 1;
        }
        if (i13 == 11 && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null && userFull.birthday == null) {
            int i14 = this.f33860s0;
            this.f33860s0 = i14 + 1;
            this.setBirthdayRow = i14;
        }
        if (i13 == 5) {
            int i15 = this.f33860s0;
            this.f33860s0 = i15 + 1;
            this.N = i15;
        }
        int i16 = this.f33860s0;
        this.O = i16;
        this.everybodyRow = i16 + 1;
        int i17 = i16 + 3;
        this.f33860s0 = i17;
        this.P = i16 + 2;
        if (i13 == 4 || i13 == 9 || i13 == 14 || i13 == 0 || i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 8 || i13 == 1 || i13 == 11 || i13 == 12) {
            this.f33860s0 = i16 + 4;
            this.nobodyRow = i17;
        }
        if (getMessagesController().starsPaidMessagesAvailable && i13 == 10) {
            int i18 = this.f33860s0;
            this.f33860s0 = i18 + 1;
            this.f33847h0 = i18;
        }
        if (i13 == 6 && this.J == 1) {
            int i19 = this.f33860s0;
            this.Z = i19;
            this.W = i19 + 1;
            this.X = i19 + 2;
            this.f33860s0 = i19 + 4;
            this.Y = i19 + 3;
        }
        if (i13 == 10 && this.J == 3) {
            int i20 = this.f33860s0;
            this.f33860s0 = i20 + 1;
            this.R = i20;
        } else {
            int i21 = this.f33860s0;
            this.f33860s0 = i21 + 1;
            this.Q = i21;
        }
        if (i13 == 10) {
            if (this.J == 3) {
                int i22 = this.f33860s0;
                this.f33848i0 = i22;
                this.f33860s0 = i22 + 2;
                this.priceRow = i22 + 1;
                if (!getUserConfig().isPremium()) {
                    int i23 = this.f33860s0;
                    this.f33860s0 = i23 + 1;
                    this.f33849j0 = i23;
                }
                int i24 = this.f33860s0;
                this.f33860s0 = i24 + 1;
                this.f33850k0 = i24;
                if (getUserConfig().isPremium()) {
                    int i25 = this.f33860s0;
                    this.S = i25;
                    this.T = i25 + 1;
                    this.f33860s0 = i25 + 3;
                    this.V = i25 + 2;
                }
            }
        } else if (i13 != 8 || getUserConfig().isPremium()) {
            int i26 = this.f33860s0;
            int i27 = i26 + 1;
            this.f33860s0 = i27;
            this.S = i26;
            int i28 = this.J;
            if (i28 == 1 || i28 == 2) {
                this.f33860s0 = i26 + 2;
                this.T = i27;
            }
            if (i28 == 0 || i28 == 2) {
                int i29 = this.f33860s0;
                this.f33860s0 = i29 + 1;
                this.U = i29;
            }
            int i30 = this.f33860s0;
            int i31 = i30 + 1;
            this.f33860s0 = i31;
            this.V = i30;
            if (i13 == 2) {
                this.f33839b0 = i31;
                this.f33841c0 = i30 + 2;
                this.f33860s0 = i30 + 4;
                this.f33842d0 = i30 + 3;
            }
            if (i13 == 4 && (this.I.size() > 0 || (i10 = this.J) == 2 || i10 == 1)) {
                int i32 = this.f33860s0;
                int i33 = i32 + 1;
                this.f33860s0 = i33;
                this.photoForRestRow = i32;
                if (this.f33869y0 != null) {
                    this.f33860s0 = i32 + 2;
                    this.currentPhotoForRestRow = i33;
                }
                int i34 = this.f33860s0;
                this.f33860s0 = i34 + 1;
                this.f33837a0 = i34;
            }
            if (i13 == 0 && (this.J != 0 || ((arrayList = this.I) != null && !arrayList.isEmpty()))) {
                int i35 = this.f33860s0;
                this.readRow = i35;
                this.f33860s0 = i35 + 2;
                this.f33843e0 = i35 + 1;
            }
            if (i13 == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i36 = this.f33860s0;
                this.f33845f0 = i36;
                this.f33860s0 = i36 + 2;
                this.f33846g0 = i36 + 1;
            }
        }
        if (i13 == 12) {
            int i37 = this.f33860s0;
            this.giftTypesHeaderRow = i37;
            this.f33853n0 = i37 + 1;
            this.m0 = i37 + 2;
            this.f33854o0 = i37 + 3;
            this.f33855p0 = i37 + 4;
            this.f33856q0 = i37 + 5;
            this.f33860s0 = i37 + 7;
            this.f33858r0 = i37 + 6;
        }
        A0();
        fx0 fx0Var = this.f33836a;
        if (fx0Var != null) {
            if (z10) {
                int childCount = this.e.getChildCount();
                for (int i38 = 0; i38 < childCount; i38++) {
                    View childAt = this.e.getChildAt(i38);
                    if (childAt instanceof org.telegram.ui.Cells.k6) {
                        org.telegram.ui.Components.lm0 lm0Var = this.e;
                        View F = lm0Var.F(childAt);
                        if (F == null) {
                            T = null;
                        } else {
                            T = lm0Var.T(F);
                        }
                        if (T != null) {
                            int b10 = T.b();
                            org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) childAt;
                            int i39 = this.everybodyRow;
                            if (b10 != i39 && b10 != this.P && b10 != this.nobodyRow && b10 != this.f33847h0) {
                                if (b10 == this.Y) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (this.K == i12) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                k6Var.a(z12, true);
                            } else {
                                if (b10 == i39) {
                                    i11 = 0;
                                } else if (b10 == this.P) {
                                    i11 = 2;
                                } else if (b10 == this.nobodyRow) {
                                    i11 = 1;
                                } else {
                                    i11 = 3;
                                }
                                if (this.J == i11) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                k6Var.a(z11, true);
                            }
                        }
                    }
                }
                bx0Var.f(bx0Var.d);
                s4.o.c(bx0Var, true).c(this.f33836a);
                AndroidUtilities.updateVisibleRows(this.e);
                return;
            }
            fx0Var.l();
        }
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.f33869y0 = photoSize3;
                privacyControlActivity.f33870z0 = null;
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
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new l(privacyControlActivity, 19));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().getCurrentUser().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().getCurrentUser().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().getCurrentUser().access_hash;
                    org.telegram.ui.Components.vc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip), null, null).j();
                }
                privacyControlActivity.F0(false);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21467sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ca));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21484ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21189dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21445ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21257h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21238g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d6));
    }

    @Override
    public final boolean canBeginSlide() {
        return v0(true);
    }

    @Override
    public final View createView(Context context) {
        float f7;
        float f10;
        int i10 = this.f33868y;
        if (i10 == 5) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.setWillNotDraw(false);
            frameLayout.setClipToPadding(false);
            frameLayout.d = org.telegram.ui.ActionBar.k6.X0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21146b7);
            frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(R.string.PrivacyForwardsMessageLine);
            tL_message.date = ((int) (System.currentTimeMillis() / 1000)) - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 261;
            tL_message.from_id = new TLRPC.TL_peerUser();
            tL_message.f20365id = 1;
            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
            tL_message.fwd_from = tL_messageFwdHeader;
            tL_messageFwdHeader.from_name = ContactsController.formatName(user.first_name, user.last_name);
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.out = false;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, true, false);
            frameLayout.f37678f = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            org.telegram.ui.Cells.t1 t1Var = new org.telegram.ui.Cells.t1(context, this.currentAccount);
            frameLayout.f37676b = t1Var;
            t1Var.setDelegate(new oa.d(18));
            t1Var.N7 = false;
            t1Var.setFullyDraw(true);
            t1Var.W3(messageObject, null, false, false, false, false);
            frameLayout.addView(t1Var, w7.z5.n(-1, -2));
            org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(1, context, null, true);
            frameLayout.e = p40Var;
            frameLayout.addView(p40Var, w7.z5.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.f33844f = frameLayout;
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
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 23));
        org.telegram.ui.ActionBar.y m10 = this.actionBar.m();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.k6.f21519v8;
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, mode));
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(org.telegram.ui.ActionBar.k6.x0(null, i11, false));
        this.f33840c = cqVar;
        org.telegram.ui.Components.yr yrVar = new org.telegram.ui.Components.yr(mutate, cqVar);
        this.f33838b = yrVar;
        org.telegram.ui.ActionBar.u0 i12 = m10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), yrVar);
        this.d = i12;
        org.telegram.ui.ActionBar.r6.z(i12, mutate, i11, null, mode);
        boolean y02 = y0();
        org.telegram.ui.ActionBar.u0 u0Var = this.d;
        float f11 = 0.0f;
        if (y02) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.d;
        if (y02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.d;
        if (y02) {
            f11 = 1.0f;
        }
        u0Var3.setScaleY(f11);
        this.d.setEnabled(y02);
        this.f33836a = new fx0(this, context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout2, null);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.e = lm0Var;
        lm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.e);
        this.e.setLayoutManager(new s4.b0(1, false));
        this.e.setVerticalScrollBarEnabled(false);
        ((s4.k) this.e.getItemAnimator()).C = false;
        frameLayout2.addView(this.e, w7.z5.c(-1.0f, -1));
        this.e.setAdapter(this.f33836a);
        this.e.setOnItemClickListener(new h(this, 27));
        ax0 ax0Var = new ax0(this);
        ax0Var.n(350L);
        ax0Var.o(org.telegram.ui.Components.zr.h);
        ax0Var.C = false;
        this.e.setItemAnimator(ax0Var);
        A0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        gx0 gx0Var;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            w0();
        } else if (i10 == NotificationCenter.emojiLoaded) {
            this.e.g1();
        } else if (i10 == NotificationCenter.didSetNewWallpapper && (gx0Var = this.f33844f) != null) {
            gx0Var.invalidate();
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final lu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21206ec));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21130ab));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21170cb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.db));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21132ad));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21224fb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21374nd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21466sb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21392od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.e, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21372nb));
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
        this.e.setPadding(0, 0, 0, i13);
        this.e.setClipToPadding(false);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.c50 c50Var = this.f33861t0;
        if (c50Var != null) {
            c50Var.i();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        F0(false);
        org.telegram.ui.Components.c50 c50Var = this.f33861t0;
        if (c50Var != null) {
            c50Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.Components.cq cqVar = this.f33840c;
            if (cqVar != null) {
                cqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21519v8, false));
            }
            gx0 gx0Var = this.f33844f;
            if (gx0Var != null) {
                gx0Var.invalidate();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void t0() {
        final AtomicInteger atomicInteger;
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        TLRPC.InputUser inputUser3;
        char c10 = 0;
        boolean z10 = false;
        int i10 = this.f33868y;
        if (i10 == 10) {
            boolean[] zArr = {true};
            if (this.J == 3) {
                ArrayList arrayList = this.f33857r;
                Collections.sort(arrayList);
                Collections.sort(this.H);
                if (!arrayList.equals(this.H)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.J != 0 && this.H.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i11 = 0; i11 < this.H.size(); i11++) {
                            Long l4 = (Long) this.H.get(i11);
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
                    getConnectionsManager().sendRequest(setprivacy, new a50(20, this, zArr));
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
            int i12 = this.J;
            if (i12 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.M;
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
            getConnectionsManager().sendRequest(setglobalprivacysettings, new ai.k2(this, zArr, globalPrivacySettings, setglobalprivacysettings, 16));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i10 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.J == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.K == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) {
                    public final PrivacyControlActivity f42505b;

                    {
                        this.f42505b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final PrivacyControlActivity privacyControlActivity = this.f42505b;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r5) {
                                            case 0:
                                                PrivacyControlActivity.Y(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                return;
                                            default:
                                                PrivacyControlActivity.Z(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final PrivacyControlActivity privacyControlActivity2 = this.f42505b;
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r5) {
                                            case 0:
                                                PrivacyControlActivity.Y(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                return;
                                            default:
                                                PrivacyControlActivity.Z(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
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
        if (this.J != 0 && this.H.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i13 = 0; i13 < this.H.size(); i13++) {
                Long l10 = (Long) this.H.get(i13);
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
        if (this.J != 1 && this.I.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i14 = 0; i14 < this.I.size(); i14++) {
                Long l11 = (Long) this.I.get(i14);
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
        int i15 = this.J;
        if (i15 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i15 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i15 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i16 = this.J;
        if (i16 != 0) {
            if (i16 != 2) {
                c10 = 1;
            }
            if (this.E[c10]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i17 = this.J;
        if (this.F[i17]) {
            if (i17 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) {
            public final PrivacyControlActivity f42505b;

            {
                this.f42505b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final PrivacyControlActivity privacyControlActivity = this.f42505b;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        PrivacyControlActivity.Y(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        return;
                                    default:
                                        PrivacyControlActivity.Z(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final PrivacyControlActivity privacyControlActivity2 = this.f42505b;
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        PrivacyControlActivity.Y(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        return;
                                    default:
                                        PrivacyControlActivity.Z(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }, 2);
        if (i10 == 0 && this.C0 != this.B0) {
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
            globalPrivacySettings6.hide_read_marks = this.C0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) {
                public final PrivacyControlActivity f42832b;

                {
                    this.f42832b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f42832b;
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
                                            privacyControlActivity2.B0 = z11;
                                            globalPrivacySettings7.hide_read_marks = z11;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.x0();
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
                                            privacyControlActivity3.D0 = z13;
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
                                                privacyControlActivity3.F0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.H0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.J0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.L0 = !z17;
                                                boolean z18 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z18;
                                                privacyControlActivity3.N0 = !z18;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.f42832b;
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
                                            privacyControlActivity22.B0 = z11;
                                            globalPrivacySettings8.hide_read_marks = z11;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.x0();
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
                                            privacyControlActivity3.D0 = z13;
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
                                                privacyControlActivity3.F0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.H0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.J0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.L0 = !z17;
                                                boolean z18 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z18;
                                                privacyControlActivity3.N0 = !z18;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
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
        if (i10 == 12 && (this.E0 != this.D0 || this.I0 != this.H0 || this.G0 != this.F0 || this.K0 != this.J0 || this.O0 != this.N0)) {
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
            globalPrivacySettings8.display_gifts_button = this.E0;
            if (getUserConfig().isPremium()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.G0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.I0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.K0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.O0;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) {
                public final PrivacyControlActivity f42832b;

                {
                    this.f42832b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f42832b;
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
                                            privacyControlActivity22.B0 = z11;
                                            globalPrivacySettings72.hide_read_marks = z11;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity22.x0();
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
                                            privacyControlActivity3.D0 = z13;
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
                                                privacyControlActivity3.F0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.H0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.J0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.L0 = !z17;
                                                boolean z18 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z18;
                                                privacyControlActivity3.N0 = !z18;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.f42832b;
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
                                            privacyControlActivity22.B0 = z11;
                                            globalPrivacySettings82.hide_read_marks = z11;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.x0();
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
                                            privacyControlActivity3.D0 = z13;
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
                                                privacyControlActivity3.F0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.H0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.J0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.L0 = !z17;
                                                boolean z18 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z18;
                                                privacyControlActivity3.N0 = !z18;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.x0();
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
            this.f33838b.a(1.0f);
        }
    }

    public final boolean u0() {
        if (!this.K0 && !this.G0 && !this.I0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean v() {
        return false;
    }

    public final boolean v0(boolean z10) {
        if (this.d.getAlpha() == 1.0f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new xw0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new xw0(this, 2));
                showDialog(alertDialog$Builder.f20679a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void w0() {
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
        ArrayList arrayList2 = this.f33857r;
        int i11 = 2;
        int i12 = this.f33868y;
        if (i12 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings();
            i11 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 0;
            this.J = i11;
            this.h = i11;
            this.I = new ArrayList();
            this.H = new ArrayList();
            if (globalPrivacySettings != null && (globalPrivacySettings.flags & 32) != 0) {
                long clamp = Utilities.clamp(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.M = clamp;
                this.L = clamp;
                this.J = 3;
                this.h = 3;
            } else {
                this.M = 10L;
                this.L = 10L;
            }
            ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(13);
            this.H = new ArrayList();
            if (privacyRules != null) {
                for (int i13 = 0; i13 < privacyRules.size(); i13++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i13);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i14 = 0;
                        while (i14 < size) {
                            i14 = com.google.android.gms.internal.play_billing.k3.h(-tL_privacyValueAllowChatParticipants.chats.get(i14).longValue(), this.H, i14, 1);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.H.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.H);
            return;
        }
        if (i12 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean[] zArr4 = this.v;
        zArr4[0] = z10;
        boolean[] zArr5 = this.E;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.f33864w;
        zArr6[0] = false;
        boolean[] zArr7 = this.F;
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
        boolean[] zArr8 = this.f33866x;
        zArr8[0] = false;
        boolean[] zArr9 = this.G;
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
        this.H = new ArrayList();
        this.I = new ArrayList();
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
                        i16 = com.google.android.gms.internal.play_billing.k3.h(-tL_privacyValueAllowChatParticipants2.chats.get(i16).longValue(), this.H, i16, 1);
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
                            i17 = com.google.android.gms.internal.play_billing.k3.h(-tL_privacyValueDisallowChatParticipants.chats.get(i17).longValue(), this.I, i17, 1);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.H.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.I.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
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
            if (c11 == 0 || (c11 == 65535 && (this.I.size() > 0 || (bool2 != null && !bool2.booleanValue())))) {
                i10 = 2;
                this.J = 0;
            } else {
                i10 = 2;
                if (c11 != 2) {
                    if (c11 == 65535 && this.I.size() > 0 && this.H.size() > 0) {
                        i10 = 2;
                    } else {
                        int i18 = 1;
                        if (c11 != 1) {
                            if (c11 == 65535 && (this.H.size() > 0 || (bool2 != null && bool2.booleanValue()))) {
                                i18 = 1;
                            }
                            i10 = 2;
                        }
                        this.J = i18;
                        i10 = 2;
                    }
                }
                this.J = i10;
            }
            int i19 = this.J;
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
            org.telegram.ui.ActionBar.u0 u0Var = this.d;
            if (u0Var != null) {
                u0Var.setAlpha(0.0f);
                this.d.setScaleX(0.0f);
                this.d.setScaleY(0.0f);
                this.d.setEnabled(false);
            }
        } else {
            this.J = 1;
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.f33859s;
        arrayList3.clear();
        this.h = this.J;
        arrayList2.addAll(this.H);
        arrayList3.addAll(this.I);
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
                        this.K = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.K = 2;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                        this.K = 1;
                        break;
                    } else {
                        i20++;
                    }
                }
            } else {
                this.K = 0;
            }
            this.f33852n = this.K;
        }
        if (i12 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.B0 = z14;
            this.C0 = z14;
        }
        if (i12 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.D0 = z13;
            this.E0 = z13;
            if (globalPrivacySettings3 != null && (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) != null) {
                boolean z20 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.G0 = z20;
                this.F0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.I0 = z21;
                this.H0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.K0 = z22;
                this.J0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.M0 = z23;
                this.L0 = z23;
                boolean z24 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.O0 = z24;
                this.N0 = z24;
            } else {
                this.G0 = true;
                this.F0 = true;
                this.I0 = true;
                this.H0 = true;
                this.K0 = true;
                this.J0 = true;
                this.M0 = true;
                this.L0 = true;
                this.O0 = true;
                this.N0 = true;
            }
        }
        F0(false);
        AndroidUtilities.updateVisibleRows(this.e);
    }

    public final void x0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        int i10;
        int i11;
        this.f33838b.a(0.0f);
        int i12 = this.f33868y;
        if ((i12 == 10 || i12 == 1 || i12 == 2) && this.J != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
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
                    alertDialog$Builder.f20679a.R = LocaleController.getString(i10);
                    if (i14 == 1) {
                        i11 = R.string.CheckPrivacyInviteText;
                    } else {
                        i11 = R.string.CheckPrivacyCallsText;
                    }
                    alertDialog$Builder.f20679a.T = LocaleController.getString(i11);
                    alertDialog$Builder.k(LocaleController.getString(R.string.CheckPrivacyReview), new i2.r(this, i14, 17));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new xw0(this, 1));
                    alertDialog$Builder.p();
                    return;
                }
            }
        }
        finishFragment();
    }

    public final boolean y0() {
        char c10;
        char c11;
        ArrayList arrayList;
        int i10 = this.f33868y;
        if (i10 == 0 && ((this.J != 0 || ((arrayList = this.I) != null && !arrayList.isEmpty())) && this.B0 != this.C0)) {
            return true;
        }
        if (i10 == 12 && (this.D0 != this.E0 || this.H0 != this.I0 || this.F0 != this.G0 || this.J0 != this.K0 || this.L0 != this.M0 || this.N0 != this.O0)) {
            return true;
        }
        int i11 = this.h;
        int i12 = this.J;
        if (i11 != i12) {
            return true;
        }
        if (i10 == 6 && i12 == 1 && this.f33852n != this.K) {
            return true;
        }
        if (i12 != 0) {
            if (i12 == 2) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            boolean z10 = this.v[c10];
            if (i12 == 2) {
                c11 = 0;
            } else {
                c11 = 1;
            }
            if (z10 != this.E[c11]) {
                return true;
            }
        }
        if ((i10 == 10 && i12 == 3 && this.M != this.L) || this.f33864w[i12] != this.F[i12]) {
            return true;
        }
        ArrayList arrayList2 = this.f33859s;
        if (arrayList2.size() != this.I.size()) {
            return true;
        }
        ArrayList arrayList3 = this.f33857r;
        if (arrayList3.size() != this.H.size()) {
            return true;
        }
        if (i10 != 10 || this.J == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.H);
            if (!arrayList3.equals(this.H)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.I);
            if (!arrayList2.equals(this.I)) {
                return true;
            }
        }
        return false;
    }

    public final void z0() {
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.f33868y;
        if (i10 == 10 && this.J == 3 && !getUserConfig().isPremium()) {
            showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) this, 27, true));
            return;
        }
        if (this.J != 0 && i10 == 0 && !getUserConfig().isPremium()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (i10 == 1) {
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.WhoCanAddMeInfo);
                } else {
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.CustomHelp);
                }
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new pl0(10, this, globalMainSettings));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder.f20679a);
                return;
            }
        }
        t0();
    }

    public PrivacyControlActivity(int i10) {
        this(i10, false);
    }

    @Override
    public final void E(float f7) {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void K(boolean z10, boolean z11) {
    }
}

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
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.v40 {
    public boolean A0;
    public final boolean[] B;
    public boolean B0;
    public final boolean[] C;
    public boolean C0;
    public ArrayList D;
    public boolean D0;
    public ArrayList E;
    public boolean E0;
    public int F;
    public boolean F0;
    public int G;
    public boolean G0;
    public long H;
    public boolean H0;
    public long I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public boolean K0;
    public int L;
    public int L0;
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
    public ex0 f31983a;
    public int f31984a0;
    public org.telegram.ui.Components.mr f31985b;
    public int f31986b0;
    public org.telegram.ui.ActionBar.w0 f31987c;
    public int f31988c0;
    private int currentPhotoForRestRow;
    public org.telegram.ui.Components.sl0 d;
    public int f31989d0;
    public fx0 e;
    public int f31990e0;
    private int everybodyRow;
    public int f31991f;
    public int f31992f0;
    public int f31993g0;
    private int giftTypesHeaderRow;
    public int h;
    public int f31994h0;
    public int f31995i0;
    public int f31996j0;
    public int f31997k0;
    public int f31998l0;
    public int m0;
    public final ArrayList f31999n;
    public int f32000n0;
    private int nobodyRow;
    public int f32001o0;
    public final org.telegram.ui.Components.w40 f32002p0;
    private int photoForRestRow;
    private int priceRow;
    public org.telegram.ui.Components.gj0 f32003q0;
    public final ArrayList f32004r;
    public org.telegram.ui.Cells.o8 f32005r0;
    private int readRow;
    public final boolean[] f32006s;
    public org.telegram.ui.Components.p9 f32007s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public ls f32008t0;
    public TLRPC.PhotoSize f32009u0;
    public final boolean[] v;
    public TLRPC.Photo f32010v0;
    public final boolean[] f32011w;
    public SpannableString f32012w0;
    public final int f32013x;
    public boolean f32014x0;
    public final boolean[] f32015y;
    public boolean f32016y0;
    public boolean f32017z0;

    public PrivacyControlActivity(int i10, boolean z4) {
        super(null);
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        this.f31999n = new ArrayList();
        this.f32004r = new ArrayList();
        this.f32006s = new boolean[4];
        this.v = new boolean[4];
        this.f32011w = new boolean[4];
        this.f32015y = new boolean[4];
        this.B = new boolean[4];
        this.C = new boolean[4];
        this.I = 10L;
        this.L0 = 4;
        this.f32013x = i10;
        if (z4) {
            ContactsController.getInstance(this.currentAccount).loadPrivacySettings();
        }
        if (i10 == 4) {
            org.telegram.ui.Components.w40 w40Var = new org.telegram.ui.Components.w40(0, true, true);
            this.f32002p0 = w40Var;
            w40Var.f30190a = this;
            w40Var.f30191b = this;
            TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().clientUserId);
            if (!UserObject.hasFallbackPhoto(userFull) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(userFull.fallback_photo.sizes, 1000)) == null) {
                return;
            }
            this.f32009u0 = closestPhotoSizeWithSize;
            this.f32010v0 = userFull.fallback_photo;
        }
    }

    public static void U(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.f32009u0 = null;
        privacyControlActivity.f32010v0 = null;
        TLRPC.UserFull userFull = privacyControlActivity.getMessagesController().getUserFull(privacyControlActivity.getUserConfig().clientUserId);
        if (userFull != null && (photo = userFull.fallback_photo) != null) {
            userFull.flags &= -4194305;
            userFull.fallback_photo = null;
            privacyControlActivity.getMessagesStorage().updateUserInfo(userFull, true);
            privacyControlActivity.D0();
            privacyControlActivity.F0(true);
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f19203id = photo.f19208id;
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
            AndroidUtilities.runOnUIThread(new zq0(13, privacyControlActivity, zArr));
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
            if (closestPhotoSizeWithSize != null && privacyControlActivity.f32009u0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.f32009u0, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb = new StringBuilder();
                sb.append(privacyControlActivity.f32009u0.location.volume_id);
                sb.append("_");
                String m9 = android.support.v4.media.a.m(privacyControlActivity.f32009u0.location.local_id, "@50_50", sb);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(closestPhotoSizeWithSize.location.volume_id);
                sb2.append("_");
                ImageLoader.getInstance().replaceImageInCache(m9, android.support.v4.media.a.m(closestPhotoSizeWithSize.location.local_id, "@50_50", sb2), ImageLocation.getForLocal(closestPhotoSizeWithSize.location), false);
            }
            if (closestPhotoSizeWithSize2 != null && privacyControlActivity.f32009u0 != null) {
                FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(privacyControlActivity.f32009u0.location, true).renameTo(FileLoader.getInstance(privacyControlActivity.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
        }
    }

    public static void X(PrivacyControlActivity privacyControlActivity, View view, int i10) {
        ArrayList arrayList;
        String str;
        int i11;
        boolean z4;
        boolean z10;
        char c3;
        int i12;
        int i13 = privacyControlActivity.f32013x;
        if (i10 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.d2 d2Var = org.telegram.ui.Components.z4.O(privacyControlActivity.getParentActivity(), LocaleController.getString(R.string.RemovePublicPhoto), LocaleController.getString(R.string.RemovePhotoForRestDescription), LocaleController.getString(R.string.Remove), new rw0(privacyControlActivity, 1), null).f19503a;
            d2Var.show();
            d2Var.h();
            return;
        }
        int i14 = 0;
        r2 = false;
        boolean z11 = false;
        int i15 = 0;
        if (i10 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.w40 w40Var = privacyControlActivity.f32002p0;
            if (w40Var != null) {
                w40Var.o(false, new cg.n0(21), new v5(privacyControlActivity, 13), 0);
                privacyControlActivity.f32003q0.K(0);
                privacyControlActivity.f32003q0.N(43);
                privacyControlActivity.f32005r0.e.d();
            }
        } else if (i13 == 10 && i10 == privacyControlActivity.L && !privacyControlActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacyControlActivity.getUserConfig().isPremium()) {
            org.telegram.ui.Components.qc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new rw0(privacyControlActivity, 2)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i16 = -privacyControlActivity.L0;
            privacyControlActivity.L0 = i16;
            AndroidUtilities.shakeViewSpring(view, i16);
        } else if (i13 == 8 && ((i10 == privacyControlActivity.L || i10 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().isPremium())) {
            org.telegram.ui.Components.qc.a0(privacyControlActivity).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new rw0(privacyControlActivity, 3)).j();
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            int i17 = -privacyControlActivity.L0;
            privacyControlActivity.L0 = i17;
            AndroidUtilities.shakeViewSpring(view, i17);
        } else if (i10 != privacyControlActivity.nobodyRow && i10 != privacyControlActivity.everybodyRow && i10 != privacyControlActivity.L && i10 != privacyControlActivity.f31989d0) {
            if (i10 != privacyControlActivity.U && i10 != privacyControlActivity.T) {
                if (i10 != privacyControlActivity.Q && i10 != privacyControlActivity.P) {
                    if (i10 == privacyControlActivity.Y) {
                        privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
                        return;
                    } else if (i10 == privacyControlActivity.readRow) {
                        privacyControlActivity.f32016y0 = !privacyControlActivity.f32016y0;
                        privacyControlActivity.E0();
                        ((org.telegram.ui.Cells.s8) view).setChecked(privacyControlActivity.f32016y0);
                        return;
                    } else if (i10 == privacyControlActivity.f31986b0) {
                        privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
                        return;
                    } else if (i10 == privacyControlActivity.showGiftIconRow) {
                        privacyControlActivity.A0 = !privacyControlActivity.A0;
                        privacyControlActivity.E0();
                        ((org.telegram.ui.Cells.s8) view).setChecked(privacyControlActivity.A0);
                        return;
                    } else if (i10 == privacyControlActivity.f31996j0) {
                        if (privacyControlActivity.E0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i18 = -privacyControlActivity.L0;
                            privacyControlActivity.L0 = i18;
                            AndroidUtilities.shakeViewSpring(view, i18);
                            privacyControlActivity.C0();
                            return;
                        }
                        boolean u02 = privacyControlActivity.u0();
                        privacyControlActivity.E0 = !privacyControlActivity.E0;
                        privacyControlActivity.E0();
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        s8Var.setChecked(privacyControlActivity.E0);
                        if (privacyControlActivity.E0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            s8Var.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (u02 != privacyControlActivity.u0()) {
                            privacyControlActivity.F0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f31995i0) {
                        if (privacyControlActivity.C0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i19 = -privacyControlActivity.L0;
                            privacyControlActivity.L0 = i19;
                            AndroidUtilities.shakeViewSpring(view, i19);
                            privacyControlActivity.C0();
                            return;
                        }
                        boolean u03 = privacyControlActivity.u0();
                        privacyControlActivity.C0 = !privacyControlActivity.C0;
                        privacyControlActivity.E0();
                        org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                        s8Var2.setChecked(privacyControlActivity.C0);
                        if (privacyControlActivity.C0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            s8Var2.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (u03 != privacyControlActivity.u0()) {
                            privacyControlActivity.F0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f31997k0) {
                        if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i20 = -privacyControlActivity.L0;
                            privacyControlActivity.L0 = i20;
                            AndroidUtilities.shakeViewSpring(view, i20);
                            privacyControlActivity.C0();
                            return;
                        }
                        boolean u04 = privacyControlActivity.u0();
                        privacyControlActivity.G0 = !privacyControlActivity.G0;
                        privacyControlActivity.E0();
                        org.telegram.ui.Cells.s8 s8Var3 = (org.telegram.ui.Cells.s8) view;
                        s8Var3.setChecked(privacyControlActivity.G0);
                        if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            s8Var3.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (u04 != privacyControlActivity.u0()) {
                            privacyControlActivity.F0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f31998l0) {
                        if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i21 = -privacyControlActivity.L0;
                            privacyControlActivity.L0 = i21;
                            AndroidUtilities.shakeViewSpring(view, i21);
                            privacyControlActivity.C0();
                            return;
                        }
                        boolean u05 = privacyControlActivity.u0();
                        privacyControlActivity.I0 = !privacyControlActivity.I0;
                        privacyControlActivity.E0();
                        org.telegram.ui.Cells.s8 s8Var4 = (org.telegram.ui.Cells.s8) view;
                        s8Var4.setChecked(privacyControlActivity.I0);
                        if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            s8Var4.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (u05 != privacyControlActivity.u0()) {
                            privacyControlActivity.F0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.m0) {
                        if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            int i22 = -privacyControlActivity.L0;
                            privacyControlActivity.L0 = i22;
                            AndroidUtilities.shakeViewSpring(view, i22);
                            privacyControlActivity.C0();
                            return;
                        }
                        boolean u06 = privacyControlActivity.u0();
                        privacyControlActivity.K0 = !privacyControlActivity.K0;
                        privacyControlActivity.E0();
                        org.telegram.ui.Cells.s8 s8Var5 = (org.telegram.ui.Cells.s8) view;
                        s8Var5.setChecked(privacyControlActivity.K0);
                        if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().isPremium()) {
                            s8Var5.setCheckBoxIcon(R.drawable.permission_locked);
                        }
                        if (u06 != privacyControlActivity.u0()) {
                            privacyControlActivity.F0(true);
                            AndroidUtilities.updateVisibleRows(privacyControlActivity.d);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i13 == 12 && privacyControlActivity.u0()) {
                    int i23 = -privacyControlActivity.L0;
                    privacyControlActivity.L0 = i23;
                    AndroidUtilities.shakeViewSpring(view, i23);
                    return;
                } else {
                    if (i10 == privacyControlActivity.Q) {
                        arrayList = privacyControlActivity.E;
                    } else {
                        arrayList = privacyControlActivity.D;
                    }
                    Bundle bundle = new Bundle();
                    if (i10 == privacyControlActivity.Q) {
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
                    if (i10 == privacyControlActivity.P && i13 == 1) {
                        bundle.putBoolean("allowPremium", true);
                    }
                    if (i13 == 12 && ((i12 = privacyControlActivity.F) != 1 ? !(i12 != 2 ? i12 != 0 || i10 != privacyControlActivity.Q : i10 != privacyControlActivity.P) : i10 == privacyControlActivity.P)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bundle.putBoolean("allowMiniapps", z4);
                    y60 y60Var = new y60(bundle);
                    if (i13 == 10) {
                        y60Var.I = LocaleController.getString(R.string.RemoveMessageFeeTitle);
                    }
                    if (i10 == privacyControlActivity.P) {
                        boolean[] zArr = privacyControlActivity.f32015y;
                        if (privacyControlActivity.F == 2) {
                            c3 = 0;
                        } else {
                            c3 = 1;
                        }
                        if (zArr[c3]) {
                            z10 = true;
                            if (z4 && privacyControlActivity.B[privacyControlActivity.F]) {
                                z11 = true;
                            }
                            y60Var.p0(arrayList, z10, z11);
                            y60Var.f40435w = new xw0(i10, privacyControlActivity, z4);
                            y60Var.f40414b0 = true;
                            privacyControlActivity.presentFragment(y60Var);
                            return;
                        }
                    }
                    z10 = false;
                    if (z4) {
                        z11 = true;
                    }
                    y60Var.p0(arrayList, z10, z11);
                    y60Var.f40435w = new xw0(i10, privacyControlActivity, z4);
                    y60Var.f40414b0 = true;
                    privacyControlActivity.presentFragment(y60Var);
                    return;
                }
            }
            if (i10 != privacyControlActivity.T) {
                i15 = 1;
            }
            if (i15 != privacyControlActivity.G) {
                privacyControlActivity.G = i15;
                privacyControlActivity.E0();
                privacyControlActivity.F0(true);
            }
        } else if (i13 == 12 && privacyControlActivity.u0()) {
            int i24 = -privacyControlActivity.L0;
            privacyControlActivity.L0 = i24;
            AndroidUtilities.shakeViewSpring(view, i24);
        } else {
            if (i10 == privacyControlActivity.nobodyRow) {
                i14 = 1;
            } else if (i10 != privacyControlActivity.everybodyRow) {
                if (i10 == privacyControlActivity.f31989d0) {
                    i14 = 3;
                } else {
                    i14 = 2;
                }
            }
            if (i14 == privacyControlActivity.F) {
                return;
            }
            privacyControlActivity.F = i14;
            org.telegram.ui.Components.ic.e();
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
        org.telegram.ui.Components.qc.a0(privacyControlActivity).d0(tL_error, false);
    }

    public static void Z(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            MessagesController.getInstance(privacyControlActivity.currentAccount).putUsers(privacyrules.users, false);
            MessagesController.getInstance(privacyControlActivity.currentAccount).putChats(privacyrules.chats, false);
            ContactsController.getInstance(privacyControlActivity.currentAccount).setPrivacyRules(privacyrules.rules, privacyControlActivity.f32013x);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.x0();
                return;
            }
            return;
        }
        privacyControlActivity.B0();
    }

    public final void A0() {
        fx0 fx0Var = this.e;
        if (fx0Var != null) {
            fx0Var.f34415f.messageOwner.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i10 = this.F;
            if (i10 == 0) {
                this.e.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsEverybody));
                this.e.f34415f.messageOwner.fwd_from.from_id.user_id = 1L;
            } else if (i10 == 1) {
                this.e.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsNobody));
                this.e.f34415f.messageOwner.fwd_from.from_id.user_id = 0L;
            } else {
                this.e.e.setOverrideText(LocaleController.getString(R.string.PrivacyForwardsContacts));
                this.e.f34415f.messageOwner.fwd_from.from_id.user_id = 1L;
            }
            this.e.f34413b.t2();
        }
    }

    public final void B0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.PrivacyFloodControlError);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog$Builder.f19503a);
    }

    public final void C0() {
        org.telegram.ui.Components.qc.a0(this).K(R.raw.star_premium_2, LocaleController.getString(R.string.OptionPremiumRequiredTitle), AndroidUtilities.replaceTags(LocaleController.getString(R.string.OptionPremiumRequiredMessage)), LocaleController.getString(R.string.OptionPremiumRequiredButton), new rw0(this, 0)).j();
    }

    public final void D0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.o8 o8Var = this.f32005r0;
        if (o8Var != null) {
            if (this.f32009u0 == null) {
                o8Var.getTextView().k(LocaleController.formatString("SetPhotoForRest", R.string.SetPhotoForRest, new Object[0]));
                this.f32005r0.setNeedDivider(false);
            } else {
                o8Var.getTextView().k(LocaleController.formatString("UpdatePhotoForRest", R.string.UpdatePhotoForRest, new Object[0]));
                this.f32005r0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.p9 p9Var = this.f32007s0;
        if (p9Var != null && (photoSize = this.f32009u0) != null) {
            TLRPC.Photo photo = this.f32010v0;
            if (photo != null) {
                p9Var.h(ImageLocation.getForPhoto(photoSize, photo), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
            } else {
                p9Var.h(ImageLocation.getForLocal(photoSize.location), "50_50", null, UserConfig.getInstance(this.currentAccount).getCurrentUser());
            }
        }
    }

    public final void E0() {
        float f10;
        float f11;
        boolean y02 = y0();
        this.f31987c.setEnabled(y02);
        ViewPropertyAnimator animate = this.f31987c.animate();
        float f12 = 0.0f;
        if (y02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f10);
        if (y02) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f11);
        if (y02) {
            f12 = 1.0f;
        }
        scaleX.scaleY(f12).setDuration(180L).start();
    }

    public final void F0(boolean z4) {
        ax0 ax0Var;
        ArrayList arrayList;
        int i10;
        f2.l1 T;
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        TLRPC.UserFull userFull;
        if (z4) {
            ax0Var = new ax0(this);
            ax0Var.f(ax0Var.f32718c);
            ax0Var.f32717b = this.f32001o0;
        } else {
            ax0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.W = -1;
        this.J = -1;
        this.setBirthdayRow = -1;
        this.V = -1;
        this.S = -1;
        this.T = -1;
        this.U = -1;
        this.P = -1;
        this.Q = -1;
        this.X = -1;
        this.Y = -1;
        this.M = -1;
        this.N = -1;
        this.Z = -1;
        this.f31984a0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.O = -1;
        this.R = -1;
        this.f31989d0 = -1;
        this.f31990e0 = -1;
        this.priceRow = -1;
        this.f31993g0 = -1;
        this.f31992f0 = -1;
        this.f31986b0 = -1;
        this.f31988c0 = -1;
        this.showGiftIconRow = -1;
        this.f31994h0 = -1;
        this.giftTypesHeaderRow = -1;
        this.f31995i0 = -1;
        this.f31996j0 = -1;
        this.f31997k0 = -1;
        this.f31998l0 = -1;
        this.m0 = -1;
        this.f32000n0 = -1;
        this.f32001o0 = 0;
        int i13 = this.f32013x;
        if (i13 == 12) {
            this.showGiftIconRow = 0;
            this.f32001o0 = 2;
            this.f31994h0 = 1;
        }
        if (i13 == 11 && (userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId())) != null && userFull.birthday == null) {
            int i14 = this.f32001o0;
            this.f32001o0 = i14 + 1;
            this.setBirthdayRow = i14;
        }
        if (i13 == 5) {
            int i15 = this.f32001o0;
            this.f32001o0 = i15 + 1;
            this.J = i15;
        }
        int i16 = this.f32001o0;
        this.K = i16;
        this.everybodyRow = i16 + 1;
        int i17 = i16 + 3;
        this.f32001o0 = i17;
        this.L = i16 + 2;
        if (i13 == 4 || i13 == 9 || i13 == 14 || i13 == 0 || i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 8 || i13 == 1 || i13 == 11 || i13 == 12) {
            this.f32001o0 = i16 + 4;
            this.nobodyRow = i17;
        }
        if (getMessagesController().starsPaidMessagesAvailable && i13 == 10) {
            int i18 = this.f32001o0;
            this.f32001o0 = i18 + 1;
            this.f31989d0 = i18;
        }
        if (i13 == 6 && this.F == 1) {
            int i19 = this.f32001o0;
            this.V = i19;
            this.S = i19 + 1;
            this.T = i19 + 2;
            this.f32001o0 = i19 + 4;
            this.U = i19 + 3;
        }
        if (i13 == 10 && this.F == 3) {
            int i20 = this.f32001o0;
            this.f32001o0 = i20 + 1;
            this.N = i20;
        } else {
            int i21 = this.f32001o0;
            this.f32001o0 = i21 + 1;
            this.M = i21;
        }
        if (i13 == 10) {
            if (this.F == 3) {
                int i22 = this.f32001o0;
                this.f31990e0 = i22;
                this.f32001o0 = i22 + 2;
                this.priceRow = i22 + 1;
                if (!getUserConfig().isPremium()) {
                    int i23 = this.f32001o0;
                    this.f32001o0 = i23 + 1;
                    this.f31992f0 = i23;
                }
                int i24 = this.f32001o0;
                this.f32001o0 = i24 + 1;
                this.f31993g0 = i24;
                if (getUserConfig().isPremium()) {
                    int i25 = this.f32001o0;
                    this.O = i25;
                    this.P = i25 + 1;
                    this.f32001o0 = i25 + 3;
                    this.R = i25 + 2;
                }
            }
        } else if (i13 != 8 || getUserConfig().isPremium()) {
            int i26 = this.f32001o0;
            int i27 = i26 + 1;
            this.f32001o0 = i27;
            this.O = i26;
            int i28 = this.F;
            if (i28 == 1 || i28 == 2) {
                this.f32001o0 = i26 + 2;
                this.P = i27;
            }
            if (i28 == 0 || i28 == 2) {
                int i29 = this.f32001o0;
                this.f32001o0 = i29 + 1;
                this.Q = i29;
            }
            int i30 = this.f32001o0;
            int i31 = i30 + 1;
            this.f32001o0 = i31;
            this.R = i30;
            if (i13 == 2) {
                this.X = i31;
                this.Y = i30 + 2;
                this.f32001o0 = i30 + 4;
                this.Z = i30 + 3;
            }
            if (i13 == 4 && (this.E.size() > 0 || (i10 = this.F) == 2 || i10 == 1)) {
                int i32 = this.f32001o0;
                int i33 = i32 + 1;
                this.f32001o0 = i33;
                this.photoForRestRow = i32;
                if (this.f32009u0 != null) {
                    this.f32001o0 = i32 + 2;
                    this.currentPhotoForRestRow = i33;
                }
                int i34 = this.f32001o0;
                this.f32001o0 = i34 + 1;
                this.W = i34;
            }
            if (i13 == 0 && (this.F != 0 || ((arrayList = this.E) != null && !arrayList.isEmpty()))) {
                int i35 = this.f32001o0;
                this.readRow = i35;
                this.f32001o0 = i35 + 2;
                this.f31984a0 = i35 + 1;
            }
            if (i13 == 0 && !getMessagesController().premiumFeaturesBlocked()) {
                int i36 = this.f32001o0;
                this.f31986b0 = i36;
                this.f32001o0 = i36 + 2;
                this.f31988c0 = i36 + 1;
            }
        }
        if (i13 == 12) {
            int i37 = this.f32001o0;
            this.giftTypesHeaderRow = i37;
            this.f31996j0 = i37 + 1;
            this.f31995i0 = i37 + 2;
            this.f31997k0 = i37 + 3;
            this.f31998l0 = i37 + 4;
            this.m0 = i37 + 5;
            this.f32001o0 = i37 + 7;
            this.f32000n0 = i37 + 6;
        }
        A0();
        ex0 ex0Var = this.f31983a;
        if (ex0Var != null) {
            if (z4) {
                int childCount = this.d.getChildCount();
                for (int i38 = 0; i38 < childCount; i38++) {
                    View childAt = this.d.getChildAt(i38);
                    if (childAt instanceof org.telegram.ui.Cells.j6) {
                        org.telegram.ui.Components.sl0 sl0Var = this.d;
                        View F = sl0Var.F(childAt);
                        if (F == null) {
                            T = null;
                        } else {
                            T = sl0Var.T(F);
                        }
                        if (T != null) {
                            int b10 = T.b();
                            org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                            int i39 = this.everybodyRow;
                            if (b10 != i39 && b10 != this.L && b10 != this.nobodyRow && b10 != this.f31989d0) {
                                if (b10 == this.U) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (this.G == i12) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                j6Var.a(z11, true);
                            } else {
                                if (b10 == i39) {
                                    i11 = 0;
                                } else if (b10 == this.L) {
                                    i11 = 2;
                                } else if (b10 == this.nobodyRow) {
                                    i11 = 1;
                                } else {
                                    i11 = 3;
                                }
                                if (this.F == i11) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                j6Var.a(z10, true);
                            }
                        }
                    }
                }
                ax0Var.f(ax0Var.d);
                f2.q.c(ax0Var, true).b(this.f31983a);
                AndroidUtilities.updateVisibleRows(this.d);
                return;
            }
            ex0Var.l();
        }
    }

    @Override
    public final void Q(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z4, final TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.f32009u0 = photoSize3;
                privacyControlActivity.f32010v0 = null;
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
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new o(privacyControlActivity, 18));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().getCurrentUser().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().getCurrentUser().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().getCurrentUser().access_hash;
                    org.telegram.ui.Components.qc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), LocaleController.getString(R.string.PhotoForRestTooltip), null, null).j();
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
        float f10;
        float f11;
        int i10 = this.f32013x;
        if (i10 == 5) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.setWillNotDraw(false);
            frameLayout.setClipToPadding(false);
            frameLayout.d = org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7);
            frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
            int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = LocaleController.getString(R.string.PrivacyForwardsMessageLine);
            tL_message.date = currentTimeMillis - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 261;
            tL_message.from_id = new TLRPC.TL_peerUser();
            tL_message.f19205id = 1;
            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
            tL_message.fwd_from = tL_messageFwdHeader;
            tL_messageFwdHeader.from_name = ContactsController.formatName(user.first_name, user.last_name);
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.out = false;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, true, false);
            frameLayout.f34415f = messageObject;
            messageObject.eventId = 1L;
            messageObject.resetLayout();
            org.telegram.ui.Cells.t1 t1Var = new org.telegram.ui.Cells.t1(context, this.currentAccount);
            frameLayout.f34413b = t1Var;
            t1Var.setDelegate(new ab.a(17));
            t1Var.K7 = false;
            t1Var.setFullyDraw(true);
            t1Var.X3(messageObject, null, false, false, false, false);
            frameLayout.addView(t1Var, k7.b6.n(-1, -2));
            org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(1, context, null, true);
            frameLayout.e = k40Var;
            frameLayout.addView(k40Var, k7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.e = frameLayout;
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
        this.actionBar.setActionBarMenuOnItemClick(new jl0(this, 7));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i11 = org.telegram.ui.ActionBar.j6.f20227v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
        org.telegram.ui.Components.mr mrVar = new org.telegram.ui.Components.mr(mutate, new org.telegram.ui.Components.rp(org.telegram.ui.ActionBar.j6.w0(null, i11, false)));
        this.f31985b = mrVar;
        this.f31987c = n10.i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), mrVar);
        boolean y02 = y0();
        org.telegram.ui.ActionBar.w0 w0Var = this.f31987c;
        float f12 = 0.0f;
        if (y02) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f31987c;
        if (y02) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f31987c;
        if (y02) {
            f12 = 1.0f;
        }
        w0Var3.setScaleY(f12);
        this.f31987c.setEnabled(y02);
        this.f31983a = new ex0(this, context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19852a7, false));
        org.telegram.ui.Components.sl0 sl0Var = new org.telegram.ui.Components.sl0(context, null);
        this.d = sl0Var;
        sl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.d);
        this.d.setLayoutManager(new f2.i0(1, false));
        this.d.setVerticalScrollBarEnabled(false);
        ((f2.l) this.d.getItemAnimator()).C = false;
        frameLayout2.addView(this.d, k7.b6.c(-1.0f, -1));
        this.d.setAdapter(this.f31983a);
        this.d.setOnItemClickListener(new j(this, 25));
        zw0 zw0Var = new zw0(this);
        zw0Var.n(350L);
        zw0Var.o(org.telegram.ui.Components.nr.h);
        zw0Var.C = false;
        this.d.setItemAnimator(zw0Var);
        A0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        fx0 fx0Var;
        if (i10 == NotificationCenter.privacyRulesUpdated) {
            w0();
        } else if (i10 == NotificationCenter.emojiLoaded) {
            this.d.f1();
        } else if (i10 == NotificationCenter.didSetNewWallpapper && (fx0Var = this.e) != null) {
            fx0Var.invalidate();
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final ju0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16, new Class[]{org.telegram.ui.Cells.aa.class, org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.j6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20176s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20227v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20192t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19996i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20025k0, null, null, org.telegram.ui.ActionBar.j6.f19907d7));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"valueTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.I6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
        int i12 = org.telegram.ui.ActionBar.j6.f19852a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 48, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19961g7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19979h7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20064m3, org.telegram.ui.ActionBar.j6.f20137q3}, null, org.telegram.ui.ActionBar.j6.f20162ra));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20082n3, org.telegram.ui.ActionBar.j6.f20155r3}, null, org.telegram.ui.ActionBar.j6.f19912dc));
        org.telegram.ui.Components.sl0 sl0Var = this.d;
        Drawable[] drawableArr = org.telegram.ui.ActionBar.j6.f20064m3.f19734y;
        int i13 = org.telegram.ui.ActionBar.j6.f20193ta;
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var, 0, null, null, drawableArr, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, org.telegram.ui.ActionBar.j6.f20137q3.f19734y, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20100o3, org.telegram.ui.ActionBar.j6.f20172s3}, null, org.telegram.ui.ActionBar.j6.Aa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20100o3, org.telegram.ui.ActionBar.j6.f20172s3}, null, org.telegram.ui.ActionBar.j6.Da));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20100o3, org.telegram.ui.ActionBar.j6.f20172s3}, null, org.telegram.ui.ActionBar.j6.Ea));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20100o3, org.telegram.ui.ActionBar.j6.f20172s3}, null, org.telegram.ui.ActionBar.j6.Fa));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20118p3, org.telegram.ui.ActionBar.j6.f20188t3}, null, org.telegram.ui.ActionBar.j6.Ba));
        org.telegram.ui.Components.sl0 sl0Var2 = this.d;
        Drawable[] drawableArr2 = org.telegram.ui.ActionBar.j6.f20100o3.f19734y;
        int i14 = org.telegram.ui.ActionBar.j6.Ca;
        arrayList.add(new org.telegram.ui.ActionBar.l6(sl0Var2, 0, null, null, drawableArr2, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, org.telegram.ui.ActionBar.j6.f20172s3.f19734y, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19929ec));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19947fc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20278y3}, null, org.telegram.ui.ActionBar.j6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.f20296z3}, null, org.telegram.ui.ActionBar.j6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.A3, org.telegram.ui.ActionBar.j6.C3}, null, org.telegram.ui.ActionBar.j6.La));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.B3, org.telegram.ui.ActionBar.j6.D3}, null, org.telegram.ui.ActionBar.j6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.j6.F3, org.telegram.ui.ActionBar.j6.G3}, null, org.telegram.ui.ActionBar.j6.f20178sc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Uc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19856ab));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19893cb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19911db));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19858ad));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f19946fb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20091nd));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20109od));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.d, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.f20090nb));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        return v0(z4);
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
        org.telegram.ui.Components.w40 w40Var = this.f32002p0;
        if (w40Var != null) {
            w40Var.j();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        F0(false);
        org.telegram.ui.Components.w40 w40Var = this.f32002p0;
        if (w40Var != null) {
            w40Var.l();
        }
    }

    public final void t0() {
        final AtomicInteger atomicInteger;
        TLRPC.InputUser inputUser;
        TLRPC.InputUser inputUser2;
        TLRPC.InputUser inputUser3;
        char c3 = 0;
        boolean z4 = false;
        int i10 = this.f32013x;
        if (i10 == 10) {
            boolean[] zArr = {true};
            if (this.F == 3) {
                ArrayList arrayList = this.f31999n;
                Collections.sort(arrayList);
                Collections.sort(this.D);
                if (!arrayList.equals(this.D)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.F != 0 && this.D.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i11 = 0; i11 < this.D.size(); i11++) {
                            Long l10 = (Long) this.D.get(i11);
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
                    getConnectionsManager().sendRequest(setprivacy, new sb0(13, this, zArr));
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
            int i12 = this.F;
            if (i12 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.I;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                if (i12 == 2) {
                    z4 = true;
                }
                globalPrivacySettings4.new_noncontact_peers_require_premium = z4;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new kh.b1(this, zArr, globalPrivacySettings, setglobalprivacysettings, 14));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i10 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.F == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.G == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) {
                    public final PrivacyControlActivity f38448b;

                    {
                        this.f38448b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final PrivacyControlActivity privacyControlActivity = this.f38448b;
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
                                final PrivacyControlActivity privacyControlActivity2 = this.f38448b;
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
        if (this.F != 0 && this.D.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i13 = 0; i13 < this.D.size(); i13++) {
                Long l11 = (Long) this.D.get(i13);
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
        if (this.F != 1 && this.E.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i14 = 0; i14 < this.E.size(); i14++) {
                Long l12 = (Long) this.E.get(i14);
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
        int i15 = this.F;
        if (i15 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i15 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i15 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i16 = this.F;
        if (i16 != 0) {
            if (i16 != 2) {
                c3 = 1;
            }
            if (this.f32015y[c3]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i17 = this.F;
        if (this.B[i17]) {
            if (i17 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) {
            public final PrivacyControlActivity f38448b;

            {
                this.f38448b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final PrivacyControlActivity privacyControlActivity = this.f38448b;
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
                        final PrivacyControlActivity privacyControlActivity2 = this.f38448b;
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
        if (i10 == 0 && this.f32016y0 != this.f32014x0) {
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
            globalPrivacySettings6.hide_read_marks = this.f32016y0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) {
                public final PrivacyControlActivity f38769b;

                {
                    this.f38769b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f38769b;
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
                                            boolean z10 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity2.f32014x0 = z10;
                                            globalPrivacySettings7.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.x0();
                                                return;
                                            }
                                            return;
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
                                            privacyControlActivity3.f32017z0 = z12;
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
                                                privacyControlActivity3.B0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.J0 = !z17;
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
                            final PrivacyControlActivity privacyControlActivity2 = this.f38769b;
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
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.f32014x0 = z10;
                                            globalPrivacySettings8.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.x0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings8;
                                            boolean z11 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.f32017z0 = z12;
                                            globalPrivacySettings82.display_gifts_button = z12;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.B0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.J0 = !z17;
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
        if (i10 == 12 && (this.A0 != this.f32017z0 || this.E0 != this.D0 || this.C0 != this.B0 || this.G0 != this.F0 || this.K0 != this.J0)) {
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
            globalPrivacySettings8.display_gifts_button = this.A0;
            if (getUserConfig().isPremium()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.C0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.E0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.G0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.K0;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) {
                public final PrivacyControlActivity f38769b;

                {
                    this.f38769b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f38769b;
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
                                            boolean z10 = setglobalprivacysettings32.settings.hide_read_marks;
                                            privacyControlActivity22.f32014x0 = z10;
                                            globalPrivacySettings72.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity22.x0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings72;
                                            boolean z11 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings32;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.f32017z0 = z12;
                                            globalPrivacySettings82.display_gifts_button = z12;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.B0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity3.J0 = !z17;
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
                            final PrivacyControlActivity privacyControlActivity2 = this.f38769b;
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
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.f32014x0 = z10;
                                            globalPrivacySettings82.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.x0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings822 = globalPrivacySettings82;
                                            boolean z11 = globalPrivacySettings822.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (userFull = privacyControlActivity3.getMessagesController().getUserFull(privacyControlActivity3.getUserConfig().getClientUserId())) != null) {
                                                userFull.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().updateUserInfo(userFull, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.f32017z0 = z12;
                                            globalPrivacySettings822.display_gifts_button = z12;
                                            if (globalPrivacySettings822.disallowed_stargifts == null) {
                                                globalPrivacySettings822.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings822.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings822.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.B0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity3.J0 = !z17;
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
            this.f31985b.a(1.0f);
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    public final boolean u0() {
        if (!this.G0 && !this.C0 && !this.E0) {
            return true;
        }
        return false;
    }

    public final boolean v0(boolean z4) {
        if (this.f31987c.getAlpha() == 1.0f) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.UserRestrictionsApplyChanges);
                alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.PrivacySettingsChangedAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new vw0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.PassportDiscard), new vw0(this, 2));
                showDialog(alertDialog$Builder.f19503a);
                return false;
            }
            return false;
        }
        return true;
    }

    public final void w0() {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z13;
        int i10;
        char c3;
        boolean z14;
        boolean[] zArr;
        ArrayList<TLRPC.PrivacyRule> arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.f31999n;
        int i11 = 2;
        int i12 = this.f32013x;
        if (i12 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings();
            i11 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 0;
            this.F = i11;
            this.f31991f = i11;
            this.E = new ArrayList();
            this.D = new ArrayList();
            if (globalPrivacySettings != null && (globalPrivacySettings.flags & 32) != 0) {
                long clamp = Utilities.clamp(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.I = clamp;
                this.H = clamp;
                this.F = 3;
                this.f31991f = 3;
            } else {
                this.I = 10L;
                this.H = 10L;
            }
            ArrayList<TLRPC.PrivacyRule> privacyRules = ContactsController.getInstance(this.currentAccount).getPrivacyRules(13);
            this.D = new ArrayList();
            if (privacyRules != null) {
                for (int i13 = 0; i13 < privacyRules.size(); i13++) {
                    TLRPC.PrivacyRule privacyRule = privacyRules.get(i13);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i14 = 0;
                        while (i14 < size) {
                            i14 = android.support.v4.media.a.g(-tL_privacyValueAllowChatParticipants.chats.get(i14).longValue(), this.D, i14, 1);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.D.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.D);
            return;
        }
        if (i12 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean[] zArr4 = this.f32006s;
        zArr4[0] = z4;
        boolean[] zArr5 = this.f32015y;
        zArr5[0] = z4;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.v;
        zArr6[0] = false;
        boolean[] zArr7 = this.B;
        zArr7[0] = false;
        if (i12 == 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr6[1] = z10;
        zArr7[1] = z10;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.f32011w;
        zArr8[0] = false;
        boolean[] zArr9 = this.C;
        zArr9[0] = false;
        if (i12 == 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        zArr8[1] = z11;
        zArr9[1] = z11;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.D = new ArrayList();
        this.E = new ArrayList();
        ArrayList<TLRPC.PrivacyRule> privacyRules2 = ContactsController.getInstance(this.currentAccount).getPrivacyRules(i12);
        if (privacyRules2 != null && privacyRules2.size() != 0) {
            Boolean bool2 = null;
            char c10 = 65535;
            int i15 = 0;
            boolean z15 = false;
            boolean z16 = false;
            while (i15 < privacyRules2.size()) {
                TLRPC.PrivacyRule privacyRule2 = privacyRules2.get(i15);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        i16 = android.support.v4.media.a.g(-tL_privacyValueAllowChatParticipants2.chats.get(i16).longValue(), this.D, i16, 1);
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
                            i17 = android.support.v4.media.a.g(-tL_privacyValueDisallowChatParticipants.chats.get(i17).longValue(), this.E, i17, 1);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.D.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.E.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                            z15 = true;
                        } else {
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                                bool = Boolean.TRUE;
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                                bool = Boolean.FALSE;
                            } else {
                                boolean z17 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                                if (!z17) {
                                    boolean z18 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                                    if (!z18 || z16) {
                                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                            c10 = 2;
                                            z16 = true;
                                        } else if (c10 == 65535) {
                                            if (!z17) {
                                                if (!z18 || z16) {
                                                    c10 = 2;
                                                }
                                            }
                                        }
                                    }
                                    c10 = 1;
                                }
                                c10 = 0;
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
            if (c10 == 0 || (c10 == 65535 && (this.E.size() > 0 || (bool2 != null && !bool2.booleanValue())))) {
                i10 = 2;
                this.F = 0;
            } else {
                i10 = 2;
                if (c10 != 2) {
                    if (c10 == 65535 && this.E.size() > 0 && this.D.size() > 0) {
                        i10 = 2;
                    } else {
                        int i18 = 1;
                        if (c10 != 1) {
                            if (c10 == 65535 && (this.D.size() > 0 || (bool2 != null && bool2.booleanValue()))) {
                                i18 = 1;
                            }
                            i10 = 2;
                        }
                        this.F = i18;
                        i10 = 2;
                    }
                }
                this.F = i10;
            }
            int i19 = this.F;
            if (i19 == i10) {
                c3 = 0;
            } else {
                c3 = 1;
            }
            zArr11[c3] = z15;
            zArr12[c3] = z15;
            if (bool2 != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            zArr10[i19] = z14;
            zArr7[i19] = z14;
            zArr8[i19] = false;
            zArr9[i19] = false;
            org.telegram.ui.ActionBar.w0 w0Var = this.f31987c;
            if (w0Var != null) {
                w0Var.setAlpha(0.0f);
                this.f31987c.setScaleX(0.0f);
                this.f31987c.setScaleY(0.0f);
                this.f31987c.setEnabled(false);
            }
        } else {
            this.F = 1;
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.f32004r;
        arrayList3.clear();
        this.f31991f = this.F;
        arrayList2.addAll(this.D);
        arrayList3.addAll(this.E);
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
                        this.G = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.G = 2;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                        this.G = 1;
                        break;
                    } else {
                        i20++;
                    }
                }
            } else {
                this.G = 0;
            }
            this.h = this.G;
        }
        if (i12 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f32014x0 = z13;
            this.f32016y0 = z13;
        }
        if (i12 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().getGlobalPrivacySettings();
            if (globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f32017z0 = z12;
            this.A0 = z12;
            if (globalPrivacySettings3 != null && (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) != null) {
                boolean z19 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.C0 = z19;
                this.B0 = z19;
                boolean z20 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.E0 = z20;
                this.D0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.G0 = z21;
                this.F0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.I0 = z22;
                this.H0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.K0 = z23;
                this.J0 = z23;
            } else {
                this.C0 = true;
                this.B0 = true;
                this.E0 = true;
                this.D0 = true;
                this.G0 = true;
                this.F0 = true;
                this.I0 = true;
                this.H0 = true;
                this.K0 = true;
                this.J0 = true;
            }
        }
        F0(false);
        AndroidUtilities.updateVisibleRows(this.d);
    }

    public final void x0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        int i10;
        int i11;
        this.f31985b.a(0.0f);
        int i12 = this.f32013x;
        if ((i12 == 10 || i12 == 1 || i12 == 2) && this.F != 0 && (globalPrivacySettings = ContactsController.getInstance(this.currentAccount).getGlobalPrivacySettings()) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
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
                    alertDialog$Builder.f19503a.O = LocaleController.getString(i10);
                    if (i14 == 1) {
                        i11 = R.string.CheckPrivacyInviteText;
                    } else {
                        i11 = R.string.CheckPrivacyCallsText;
                    }
                    alertDialog$Builder.f19503a.Q = LocaleController.getString(i11);
                    alertDialog$Builder.k(LocaleController.getString(R.string.CheckPrivacyReview), new gg.m2(this, i14, 16));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new vw0(this, 1));
                    alertDialog$Builder.o();
                    return;
                }
            }
        }
        finishFragment();
    }

    public final boolean y0() {
        char c3;
        char c10;
        ArrayList arrayList;
        int i10 = this.f32013x;
        if (i10 == 0 && ((this.F != 0 || ((arrayList = this.E) != null && !arrayList.isEmpty())) && this.f32014x0 != this.f32016y0)) {
            return true;
        }
        if (i10 == 12 && (this.f32017z0 != this.A0 || this.D0 != this.E0 || this.B0 != this.C0 || this.F0 != this.G0 || this.H0 != this.I0 || this.J0 != this.K0)) {
            return true;
        }
        int i11 = this.f31991f;
        int i12 = this.F;
        if (i11 != i12) {
            return true;
        }
        if (i10 == 6 && i12 == 1 && this.h != this.G) {
            return true;
        }
        if (i12 != 0) {
            if (i12 == 2) {
                c3 = 0;
            } else {
                c3 = 1;
            }
            boolean z4 = this.f32006s[c3];
            if (i12 == 2) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            if (z4 != this.f32015y[c10]) {
                return true;
            }
        }
        if ((i10 == 10 && i12 == 3 && this.I != this.H) || this.v[i12] != this.B[i12]) {
            return true;
        }
        ArrayList arrayList2 = this.f32004r;
        if (arrayList2.size() != this.E.size()) {
            return true;
        }
        ArrayList arrayList3 = this.f31999n;
        if (arrayList3.size() != this.D.size()) {
            return true;
        }
        if (i10 != 10 || this.F == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.D);
            if (!arrayList3.equals(this.D)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.E);
            if (!arrayList2.equals(this.E)) {
                return true;
            }
        }
        return false;
    }

    public final void z0() {
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.f32013x;
        if (i10 == 10 && this.F == 3 && !getUserConfig().isPremium()) {
            showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) this, 27, true));
            return;
        }
        if (this.F != 0 && i10 == 0 && !getUserConfig().isPremium()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                if (i10 == 1) {
                    alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.WhoCanAddMeInfo);
                } else {
                    alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.CustomHelp);
                }
                alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new tl0(11, this, globalMainSettings));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                showDialog(alertDialog$Builder.f19503a);
                return;
            }
        }
        t0();
    }

    public PrivacyControlActivity(int i10) {
        this(i10, false);
    }

    @Override
    public final void D(float f10) {
    }

    @Override
    public final void P() {
    }

    @Override
    public final void I(boolean z4, boolean z10) {
    }
}

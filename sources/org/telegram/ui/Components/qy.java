package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
public final class qy implements Utilities.Callback {
    public final int f29777a;
    public final Object f29778b;
    public final Object f29779c;

    public qy(int i10, Object obj, Object obj2) {
        this.f29777a = i10;
        this.f29778b = obj;
        this.f29779c = obj2;
    }

    @Override
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        String formatPluralString;
        float f7;
        int[] iArr;
        int i10;
        TLRPC.Document document;
        s4.b1 K;
        int i11 = this.f29777a;
        float f10 = -0.02f;
        float f11 = 0.05f;
        float f12 = -0.04f;
        float f13 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f29779c;
        Object obj3 = this.f29778b;
        switch (i11) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                ty tyVar = ((sy) obj3).f30405a;
                if (ConnectionsManager.getInstance(tyVar.F.f30747c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    ty.E(tyVar, runnable, arrayList2, false);
                    return;
                }
            case 1:
                mz mzVar = (mz) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i12 < size) {
                    Object obj4 = arrayList3.get(i12);
                    i12++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(mzVar.f28608w.Q.f30747c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        mzVar.f28605n.add(new ky(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 2:
                k10 k10Var = (k10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (k10Var.f27671a0 == null && !(k10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    qc M = xc.a0(n2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, k10Var.f27676f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f29639j = 5000;
                    M.j();
                    return;
                }
                xc a02 = xc.a0(n2Var);
                int i13 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, k10Var.f27676f0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", k10Var.f27678h0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                qc M2 = a02.M(replaceTags, formatPluralString, i13);
                M2.f29639j = 5000;
                M2.j();
                return;
            case 3:
                View view = (View) obj3;
                d dVar = (d) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((iArr[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((iArr[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f13 = 0.04f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f13);
                float f14 = -0.07f;
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    f12 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f12);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f7 = 2.0f;
                } else {
                    f7 = 3.0f;
                }
                colorMatrix2.setSaturation(f7);
                if (org.telegram.ui.ActionBar.h6.I.q()) {
                    f14 = -0.2f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f14);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 4:
                MessagesController messagesController = (MessagesController) obj3;
                bs0 bs0Var = (bs0) obj2;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        xc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new sd(2, U)), true)).k(true);
                    }
                    bs0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    xc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            case 5:
                sv0.j((sv0) obj3, (TL_stories.StoryItem) obj2, (ci.b7) obj);
                return;
            case 6:
                org.telegram.ui.gt gtVar = (org.telegram.ui.gt) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                gtVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                n2Var2.presentFragment(new ProfileActivity(bundle, null));
                gtVar.p();
                return;
            case 7:
                org.telegram.ui.ct ctVar = (org.telegram.ui.ct) obj3;
                Boolean bool = (Boolean) obj;
                ctVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    ctVar.f35984a.p();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    eyVar.showDialog(new org.telegram.ui.rj0(activity, !we0.a(), new org.telegram.ui.sv(activity, 0)));
                    return;
                }
                return;
            case 9:
                org.telegram.ui.gp0 gp0Var = (org.telegram.ui.gp0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.p00 p00Var = ((org.telegram.ui.m00) obj3).e;
                if (!p00Var.getUserConfig().isPremium()) {
                    p00Var.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) p00Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                p00Var.E = intValue;
                gp0Var.a(intValue, true);
                org.telegram.ui.d00 d00Var = p00Var.I;
                if (d00Var != null) {
                    if (!p00Var.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = p00Var.E;
                    }
                    d00Var.d(i10, true);
                }
                p00Var.i0(true);
                return;
            case 10:
                org.telegram.ui.c50 c50Var = (org.telegram.ui.c50) obj3;
                org.telegram.ui.x10 x10Var = (org.telegram.ui.x10) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (x10Var != null) {
                    c50Var.getClass();
                    x10Var.setVisibility(0);
                }
                c50Var.f35823c = bitmap2;
                Paint paint = new Paint(1);
                c50Var.d = paint;
                Bitmap bitmap3 = c50Var.f35823c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                c50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, f11);
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, f10);
                c50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 11:
                org.telegram.ui.kb0 kb0Var = (org.telegram.ui.kb0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                kb0Var.c();
                if (user != null) {
                    long j10 = userArr[0].f20419id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f20419id);
                    kb0Var.u(new org.telegram.ui.jb0(bundle2, user, userArr, j10), false);
                    return;
                }
                return;
            case 12:
                org.telegram.ui.dj0 dj0Var = (org.telegram.ui.dj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = dj0Var.f36215f0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f20419id)) && dj0Var.S(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.f20419id));
                        }
                    }
                }
                Boolean bool2 = dj0Var.f36226r0;
                if (bool2 != null && bool2.booleanValue()) {
                    qy qyVar = new qy(13, dj0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str != null && !str.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f20318q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.o71(10, messagesController2, qyVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new tg.p(qyVar, 5));
                    }
                    dj0Var.m0 = i12;
                    return;
                }
                dj0Var.V(true, true);
                return;
            case 13:
                org.telegram.ui.dj0 dj0Var2 = (org.telegram.ui.dj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f20419id)) && dj0Var2.S(user3)) {
                            dj0Var2.f36215f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f20419id));
                        }
                    }
                }
                dj0Var2.V(true, true);
                return;
            case 14:
                org.telegram.ui.oj0 oj0Var = (org.telegram.ui.oj0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    oj0Var.R.setImageDrawable(null);
                    oj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new org.telegram.ui.zg0(2, oj0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = oj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(oj0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21319v6), PorterDuff.Mode.SRC_IN));
                    oj0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        oj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new org.telegram.ui.zg0(3, oj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        oj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                oj0Var.y(false);
                return;
            case 15:
                ArrayList arrayList6 = (ArrayList) obj2;
                w9[] w9VarArr = (w9[]) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        String str3 = (String) arrayList6.get(i14);
                        int i15 = 0;
                        while (true) {
                            if (i15 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i15).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i15).emoticon, str3)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i15).documents.get(0).longValue();
                                    for (int i16 = 0; i16 < tL_messages_stickerSet.documents.size(); i16++) {
                                        if (tL_messages_stickerSet.documents.get(i16).f20278id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i16);
                                        }
                                    }
                                } else {
                                    i15++;
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            w9VarArr[i14].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                        }
                    }
                    return;
                }
                return;
            case 16:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.tk0) obj2).run();
                return;
            case 17:
                org.telegram.ui.sv0 sv0Var = (org.telegram.ui.sv0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var3 = (org.telegram.ui.ActionBar.n2) obj2;
                Long l10 = (Long) obj;
                sv0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                n2Var3.presentFragment(new ProfileActivity(bundle3, null));
                sv0Var.c(false);
                return;
            case 18:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().invalidateContentSettings();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.vr0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 19:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                ((org.telegram.ui.ActionBar.b2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ei.vb D = ei.vb.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    ei.lb lbVar = D.f9957c1;
                    if (lbVar != null) {
                        lbVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.s01 s01Var = (org.telegram.ui.s01) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.z51.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a1.g.v("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.v01.f42085s;
                    FileLog.e(v.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                s01Var.f40853c = imageReceiver;
                s01Var.e.add(imageReceiver);
                int f15 = org.telegram.ui.qy.f();
                s01Var.f40853c.setAutoRepeat(0);
                org.telegram.ui.u01 u01Var = s01Var.f40853c;
                String str5 = f15 + "_" + f15 + "_precache";
                org.telegram.ui.sy0 sy0Var = new org.telegram.ui.sy0(s01Var, 5);
                u01Var.getClass();
                u01Var.setDelegate(new org.telegram.ui.t01(new Runnable[]{sy0Var}));
                u01Var.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                s01Var.f40853c.onAttachedToWindow();
                s01Var.f40855g[1] = true;
                s01Var.a();
                return;
            case 21:
                Runnable runnable3 = (Runnable) obj;
                ((ci.e) obj3).run((HashSet) obj2);
                return;
            case 22:
                org.telegram.ui.z31 z31Var = (org.telegram.ui.z31) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    z31Var.getClass();
                    view2.setVisibility(0);
                }
                z31Var.f43548f = bitmap4;
                Paint paint2 = new Paint(1);
                z31Var.f43549n = paint2;
                Bitmap bitmap5 = z31Var.f43548f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                z31Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    f11 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix4, f11);
                if (!org.telegram.ui.ActionBar.h6.I.q()) {
                    f10 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix4, f10);
                z31Var.f43549n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                z31Var.f43550r = new Matrix();
                return;
            case 23:
                Boolean bool3 = (Boolean) obj;
                org.telegram.ui.z71.X((org.telegram.ui.z71) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 24:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    im0 im0Var = themeActivity.f33884b;
                    if (im0Var != null && im0Var.G && (K = im0Var.K(themeActivity.M)) != null) {
                        themeActivity.f33882a.v(K, themeActivity.M);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                org.telegram.ui.m71 m71Var = (org.telegram.ui.m71) obj2;
                if (((Boolean) obj).booleanValue()) {
                    m71Var.run();
                    return;
                } else {
                    xc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 26:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) obj3;
                org.telegram.ui.Wallet.g8 g8Var = (org.telegram.ui.Wallet.g8) obj2;
                String str6 = (String) obj;
                if (str6 != null) {
                    org.telegram.ui.Wallet.m0.i("disableBackupWithoutUpdatingPhrase: ".concat(str6));
                    g8Var.run(str6);
                    return;
                }
                org.telegram.ui.Wallet.m0.F("sending disableBackup to server");
                org.telegram.ui.Wallet.s2.a(m0Var.f34551a, new gi.c(7), null, null, null, new ci.c0(3, m0Var, g8Var), true, true, new org.telegram.ui.pa0((Object) null, 1));
                return;
            case 27:
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) obj3;
                try {
                    ((Utilities.Callback) obj2).run((String) obj);
                    if (j0Var != null) {
                        return;
                    }
                    return;
                } finally {
                    if (j0Var != null) {
                        j0Var.close();
                    }
                }
            case 28:
                ((org.telegram.ui.Wallet.j0) obj3).close();
                ((org.telegram.ui.Wallet.a8) obj2).run((String) obj);
                return;
            default:
                ((org.telegram.ui.Wallet.m0) obj3).f34564q.put((TL_wallet.walletTransaction) obj, (ai.e4) obj2);
                return;
        }
    }

    public qy(ArrayList arrayList, w9[] w9VarArr) {
        this.f29777a = 15;
        this.f29779c = arrayList;
        this.f29778b = w9VarArr;
    }
}

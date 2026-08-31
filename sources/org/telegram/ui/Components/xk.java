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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;
public final class xk implements Utilities.Callback {
    public final int f33126a;
    public final Object f33127b;
    public final Object f33128c;

    public xk(int i10, Object obj, Object obj2) {
        this.f33126a = i10;
        this.f33127b = obj;
        this.f33128c = obj2;
    }

    @Override
    public final void run(Object obj) {
        boolean z4;
        ArrayList<TLRPC.Document> arrayList;
        String formatPluralString;
        float f10;
        int[] iArr;
        int i10;
        TLRPC.Document document;
        f2.m1 K;
        String str;
        int i11 = this.f33126a;
        float f11 = -0.02f;
        float f12 = 0.05f;
        float f13 = -0.04f;
        float f14 = 0.25f;
        int i12 = 0;
        Object obj2 = this.f33128c;
        Object obj3 = this.f33127b;
        switch (i11) {
            case 0:
                cl clVar = ((zk) obj3).f33907b;
                clVar.f26018u0.d(((bl) obj2).f25630c, clVar.f26019v0, true, 0, ((Long) obj).longValue());
                clVar.f26546b.dismiss(true);
                return;
            case 1:
                lv lvVar = (lv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new kv(lvVar, 1));
                    return;
                }
                return;
            case 2:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                gm gmVar = (gm) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                gmVar.run();
                return;
            case 3:
                ky kyVar = (ky) obj3;
                ly lyVar = kyVar.f28473a;
                mz mzVar = lyVar.C;
                MediaDataController mediaDataController = MediaDataController.getInstance(mzVar.Z0);
                String[] strArr = mzVar.T0;
                String str2 = lyVar.v;
                androidx.car.app.utils.a aVar = new androidx.car.app.utils.a((Object) kyVar, (String) obj2, (Object) ((Runnable) obj), 23);
                if (!SharedConfig.suggestAnimatedEmoji && !UserConfig.getInstance(mzVar.Z0).isPremium()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                mediaDataController.getEmojiSuggestions(strArr, str2, false, aVar, null, z4, false, true, 25);
                return;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                ly lyVar2 = ((ky) obj3).f28473a;
                if (ConnectionsManager.getInstance(lyVar2.C.Z0).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    ly.E(lyVar2, runnable, arrayList2, false);
                    return;
                }
            case 5:
                fz fzVar = (fz) obj3;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(fzVar.f27048w.N.Z0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        if (stickerSet != null) {
                            arrayList = stickerSet.documents;
                        } else {
                            arrayList = null;
                        }
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        fzVar.f27045n.add(new dy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 6:
                d10 d10Var = (d10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (d10Var.X == null && !(d10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    ic M = qc.a0(p2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, d10Var.f26136c0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M.f27745j = 5000;
                    M.j();
                    return;
                }
                qc a02 = qc.a0(p2Var);
                int i13 = R.raw.folder_in;
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, d10Var.f26136c0));
                if (arrayList4.size() <= 0) {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", d10Var.f26138e0.size(), new Object[0]);
                } else {
                    formatPluralString = LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]);
                }
                ic M2 = a02.M(replaceTags, formatPluralString, i13);
                M2.f27745j = 5000;
                M2.j();
                return;
            case 7:
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
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f14 = 0.04f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, f14);
                float f15 = -0.07f;
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f13 = -0.07f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, f13);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f10 = 2.0f;
                } else {
                    f10 = 3.0f;
                }
                colorMatrix2.setSaturation(f10);
                if (org.telegram.ui.ActionBar.k6.I.q()) {
                    f15 = -0.2f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, f15);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 8:
                MessagesController messagesController = (MessagesController) obj3;
                ir0 ir0Var = (ir0) obj2;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        qc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new jd(2, U)), true)).k(true);
                    }
                    ir0Var.run(Boolean.TRUE);
                    return;
                } else if (U != null) {
                    qc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                } else {
                    return;
                }
            case 9:
                zu0.j((zu0) obj3, (TL_stories.StoryItem) obj2, (oh.m6) obj);
                return;
            case 10:
                org.telegram.ui.qt qtVar = (org.telegram.ui.qt) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                Long l10 = (Long) obj;
                qtVar.getClass();
                Bundle bundle = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle.putLong("user_id", l10.longValue());
                } else {
                    bundle.putLong("chat_id", -l10.longValue());
                }
                p2Var2.presentFragment(new ProfileActivity(bundle, null));
                qtVar.p();
                return;
            case 11:
                org.telegram.ui.mt mtVar = (org.telegram.ui.mt) obj3;
                Boolean bool = (Boolean) obj;
                mtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    mtVar.f39219a.p();
                    return;
                }
                return;
            case 12:
                org.telegram.ui.py pyVar = (org.telegram.ui.py) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    pyVar.showDialog(new org.telegram.ui.xj0(activity, !ie0.c(), new org.telegram.ui.cw(activity, 0)));
                    return;
                }
                return;
            case 13:
                org.telegram.ui.gp0 gp0Var = (org.telegram.ui.gp0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.b10 b10Var = ((org.telegram.ui.y00) obj3).f43511e;
                if (!b10Var.getUserConfig().isPremium()) {
                    b10Var.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) b10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                b10Var.B = intValue;
                gp0Var.a(intValue, true);
                org.telegram.ui.p00 p00Var = b10Var.F;
                if (p00Var != null) {
                    if (!b10Var.getUserConfig().isPremium()) {
                        i10 = -1;
                    } else {
                        i10 = b10Var.B;
                    }
                    p00Var.d(i10, true);
                }
                b10Var.i0(true);
                return;
            case 14:
                org.telegram.ui.n50 n50Var = (org.telegram.ui.n50) obj3;
                fg.h0 h0Var = (fg.h0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (h0Var != null) {
                    n50Var.getClass();
                    h0Var.setVisibility(0);
                }
                n50Var.f39297c = bitmap2;
                Paint paint = new Paint(1);
                n50Var.d = paint;
                Bitmap bitmap3 = n50Var.f39297c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                n50Var.f39298e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, f12);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, f11);
                n50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 15:
                org.telegram.ui.xb0 xb0Var = (org.telegram.ui.xb0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                xb0Var.a();
                if (user != null) {
                    long j10 = userArr[0].f20990id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.f20990id);
                    xb0Var.n(new org.telegram.ui.wb0(bundle2, user, userArr, j10), false);
                    return;
                }
                return;
            case 16:
                org.telegram.ui.ij0 ij0Var = (org.telegram.ui.ij0) obj3;
                String str3 = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = ij0Var.f37872c0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.f20990id)) && ij0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.f20990id));
                        }
                    }
                }
                Boolean bool2 = ij0Var.f37883o0;
                if (bool2 != null && bool2.booleanValue()) {
                    xk xkVar = new xk(17, ij0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str3 != null && !str3.isEmpty()) {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.f20889q = str3;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new eg.b3(2, messagesController2, xkVar));
                    } else {
                        AndroidUtilities.runOnUIThread(new eh.m(xkVar, 13));
                    }
                    ij0Var.f37879j0 = i12;
                    return;
                }
                ij0Var.U(true, true);
                return;
            case 17:
                org.telegram.ui.ij0 ij0Var2 = (org.telegram.ui.ij0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.f20990id)) && ij0Var2.R(user3)) {
                            ij0Var2.f37872c0.add(user3);
                            hashSet2.add(Long.valueOf(user3.f20990id));
                        }
                    }
                }
                ij0Var2.U(true, true);
                return;
            case 18:
                org.telegram.ui.uj0 uj0Var = (org.telegram.ui.uj0) obj3;
                String str4 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    uj0Var.O.setImageDrawable(null);
                    uj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new org.telegram.ui.he0(12, uj0Var, str4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = uj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(uj0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21979v6), PorterDuff.Mode.SRC_IN));
                    uj0Var.O.setImageDrawable(mutate);
                    if (user4.contact) {
                        uj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new org.telegram.ui.he0(13, uj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        uj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                uj0Var.w(false);
                return;
            case 19:
                ArrayList arrayList6 = (ArrayList) obj3;
                p9[] p9VarArr = (p9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                        String str5 = (String) arrayList6.get(i14);
                        int i15 = 0;
                        while (true) {
                            if (i15 < tL_messages_stickerSet.packs.size()) {
                                if (!tL_messages_stickerSet.packs.get(i15).documents.isEmpty() && TextUtils.equals(tL_messages_stickerSet.packs.get(i15).emoticon, str5)) {
                                    long longValue = tL_messages_stickerSet.packs.get(i15).documents.get(0).longValue();
                                    for (int i16 = 0; i16 < tL_messages_stickerSet.documents.size(); i16++) {
                                        if (tL_messages_stickerSet.documents.get(i16).f20849id == longValue) {
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
                            p9VarArr[i14].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str5), null);
                        }
                    }
                    return;
                }
                return;
            case 20:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.xk0) obj2).run();
                return;
            case 21:
                org.telegram.ui.ip0 ip0Var = (org.telegram.ui.ip0) obj3;
                ip0Var.f37909n = false;
                ((org.telegram.ui.dp0) obj2).f36280f.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    ip0Var.v0();
                    ip0Var.finishFragment();
                    ip0Var.y0();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.tv0 tv0Var = (org.telegram.ui.tv0) obj3;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) obj2;
                Long l11 = (Long) obj;
                tv0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l11.longValue() >= 0) {
                    bundle3.putLong("user_id", l11.longValue());
                } else {
                    bundle3.putLong("chat_id", -l11.longValue());
                }
                p2Var3.presentFragment(new ProfileActivity(bundle3, null));
                tv0Var.c(false);
                return;
            case 23:
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.tr0(profileActivity, userFull, tL_birthday2, 3), 1024);
                return;
            case 24:
                org.telegram.ui.x01 x01Var = (org.telegram.ui.x01) obj3;
                String str6 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.r61.k(str6, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder t6 = android.support.v4.media.a.t("couldn't find ", str6, " sticker in EmojiAnimations");
                    String[] strArr2 = org.telegram.ui.a11.f34978s;
                    FileLog.e(t6.toString());
                    return;
                }
                ?? imageReceiver = new ImageReceiver();
                x01Var.f42923c = imageReceiver;
                x01Var.f42924e.add(imageReceiver);
                int f16 = org.telegram.ui.cz.f();
                x01Var.f42923c.setAutoRepeat(0);
                org.telegram.ui.z01 z01Var = x01Var.f42923c;
                String str7 = f16 + "_" + f16 + "_precache";
                org.telegram.ui.xy0 xy0Var = new org.telegram.ui.xy0(x01Var, 5);
                z01Var.getClass();
                z01Var.setDelegate(new org.telegram.ui.y01(new Runnable[]{xy0Var}));
                z01Var.setImage(ImageLocation.getForDocument(k10), str7, null, null, tL_messages_stickerSet2, 0);
                x01Var.f42923c.onAttachedToWindow();
                x01Var.f42926g[1] = true;
                x01Var.a();
                return;
            case 25:
                Runnable runnable3 = (Runnable) obj;
                ((hg.h) obj3).run((HashSet) obj2);
                return;
            case 26:
                org.telegram.ui.r41 r41Var = (org.telegram.ui.r41) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    r41Var.getClass();
                    view2.setVisibility(0);
                }
                r41Var.f40771f = bitmap4;
                Paint paint2 = new Paint(1);
                r41Var.f40772n = paint2;
                Bitmap bitmap5 = r41Var.f40771f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                r41Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f12 = 0.25f;
                }
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix4, f12);
                if (!org.telegram.ui.ActionBar.k6.I.q()) {
                    f11 = -0.04f;
                }
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix4, f11);
                r41Var.f40772n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                r41Var.f40773r = new Matrix();
                return;
            case 27:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.K0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    tl0 tl0Var = themeActivity.f34872b;
                    if (tl0Var != null && tl0Var.D && (K = tl0Var.K(themeActivity.J)) != null) {
                        themeActivity.f34870a.v(K, themeActivity.J);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                org.telegram.ui.w01 w01Var = (org.telegram.ui.w01) obj2;
                if (((Boolean) obj).booleanValue()) {
                    w01Var.run();
                    return;
                } else {
                    qc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj3;
                String str8 = (String) obj2;
                Boolean bool3 = (Boolean) obj;
                a1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (bool3.booleanValue()) {
                        if (TextUtils.isEmpty(str8)) {
                            str = "removed";
                        } else {
                            str = "updated";
                        }
                    } else {
                        str = "failed";
                    }
                    jSONObject.put("status", str);
                    a1Var.v("biometry_token_updated", jSONObject);
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }
}

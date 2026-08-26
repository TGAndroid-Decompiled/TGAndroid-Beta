package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.web.BotWebViewContainer;

public class OAuthSheet {
    private static BottomSheet showing;

    public static BulletinFactory getBulletinFactory() {
        Context parentActivity;
        Context parentActivity2;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        HashSet<BotWebViewSheet> hashSet = BotWebViewSheet.activeSheets;
        if (!hashSet.isEmpty()) {
            BotWebViewSheet botWebViewSheet = null;
            for (BotWebViewSheet botWebViewSheet2 : hashSet) {
                if (botWebViewSheet2.attached) {
                    botWebViewSheet = botWebViewSheet2;
                }
            }
            if (botWebViewSheet != null) {
                if (safeLastFragment == null || safeLastFragment.getParentActivity() == null) {
                    parentActivity2 = LaunchActivity.instance;
                    if (parentActivity2 == null) {
                        parentActivity2 = ApplicationLoader.applicationContext;
                    }
                } else {
                    parentActivity2 = safeLastFragment.getParentActivity();
                }
                return BulletinFactory.of(Bulletin.BulletinWindow.make(parentActivity2), null);
            }
        }
        if (!ArticleViewer.activeSheets.isEmpty()) {
            ArticleViewer articleViewer = null;
            for (ArticleViewer articleViewer2 : ArticleViewer.activeSheets) {
                if (articleViewer2.isVisible()) {
                    articleViewer = articleViewer2;
                }
            }
            if (articleViewer != null) {
                if (safeLastFragment == null || safeLastFragment.getParentActivity() == null) {
                    parentActivity = LaunchActivity.instance;
                    if (parentActivity == null) {
                        parentActivity = ApplicationLoader.applicationContext;
                    }
                } else {
                    parentActivity = safeLastFragment.getParentActivity();
                }
                return BulletinFactory.of(Bulletin.BulletinWindow.make(parentActivity), null);
            }
        }
        return (safeLastFragment == null || safeLastFragment.getLastSheet() == null || safeLastFragment.getLastSheet().getBulletinFactory() == null) ? BulletinFactory.of(safeLastFragment) : safeLastFragment.getLastSheet().getBulletinFactory();
    }

    public static void handle(boolean z, int i, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult) {
        handle(z, i, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
    }

    public static void lambda$handle$0(Context context) {
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        if (activityFindActivity == null) {
            activityFindActivity = LaunchActivity.instance;
        }
        if (activityFindActivity == null || activityFindActivity.isFinishing()) {
            return;
        }
        activityFindActivity.moveTaskToBack(true);
    }

    public static int lambda$handle$1(Integer num, Integer num2) {
        long j = UserConfig.getInstance(num.intValue()).loginTime;
        long j2 = UserConfig.getInstance(num2.intValue()).loginTime;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public static void lambda$handle$10(ButtonWithCounterView buttonWithCounterView, ButtonWithCounterView buttonWithCounterView2, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, TextCheckCell textCheckCell, boolean[] zArr, final int[] iArr, final boolean[] zArr2, final BottomSheet bottomSheet, final String str, final Theme.ResourcesProvider resourcesProvider, final boolean z, final String str2, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final BotWebViewContainer botWebViewContainer) {
        if (buttonWithCounterView.isLoading() || buttonWithCounterView2.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 2)) {
            tL_messages_acceptUrlAuth.flags |= 2;
            tL_messages_acceptUrlAuth.peer = tL_messages_requestUrlAuth.peer;
            tL_messages_acceptUrlAuth.msg_id = tL_messages_requestUrlAuth.msg_id;
            tL_messages_acceptUrlAuth.button_id = tL_messages_requestUrlAuth.button_id;
        }
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 4)) {
            tL_messages_acceptUrlAuth.flags |= 4;
            tL_messages_acceptUrlAuth.url = tL_messages_requestUrlAuth.url;
        }
        String str3 = strArr[0];
        if (str3 != null) {
            tL_messages_acceptUrlAuth.match_code = str3;
        }
        tL_messages_acceptUrlAuth.write_allowed = textCheckCell != null && textCheckCell.isChecked();
        tL_messages_acceptUrlAuth.share_phone_number = zArr[0];
        ConnectionsManager.getInstance(iArr[0]).sendRequestTyped(tL_messages_acceptUrlAuth, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                int[] iArr2 = iArr;
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth2 = tL_messages_requestUrlAuth;
                TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth2 = tL_messages_acceptUrlAuth;
                BotWebViewContainer botWebViewContainer2 = botWebViewContainer;
                OAuthSheet.lambda$handle$9(zArr2, bottomSheet, str, resourcesProvider, z, iArr2, tL_messages_requestUrlAuth2, str2, tL_urlAuthResultRequest, tL_messages_acceptUrlAuth2, botWebViewContainer2, (TLRPC.UrlAuthResult) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void lambda$handle$11(String[] strArr, Runnable runnable, String str) {
        strArr[0] = str;
        runnable.run();
    }

    public static void lambda$handle$12() {
    }

    public static void lambda$handle$13(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, String[] strArr, Context context, int i, Runnable runnable, BaseFragment baseFragment) {
        if (tL_urlAuthResultRequest.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
            runnable.run();
        } else {
            showMatchCodeSheet(context, i, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new OAuthSheet$$ExternalSyntheticLambda1(25, strArr, runnable), true, new OAuthSheet$$ExternalSyntheticLambda5(0), baseFragment.getResourceProvider());
        }
    }

    public static void lambda$handle$14(boolean[] zArr, Runnable runnable, AlertDialog alertDialog, int i) {
        zArr[0] = false;
        runnable.run();
    }

    public static void lambda$handle$15(boolean[] zArr, Runnable runnable, AlertDialog alertDialog, int i) {
        zArr[0] = true;
        runnable.run();
    }

    public static void lambda$handle$16(ButtonWithCounterView buttonWithCounterView, ButtonWithCounterView buttonWithCounterView2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, int[] iArr, Context context, BaseFragment baseFragment, boolean z, boolean z2, String str, final boolean[] zArr, final Runnable runnable, View view) {
        final int i = 1;
        final int i2 = 0;
        if (buttonWithCounterView.isLoading() || buttonWithCounterView2.isLoading()) {
            return;
        }
        if (!tL_urlAuthResultRequest.request_phone_number) {
            runnable.run();
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
        AlertDialog.Builder title = new AlertDialog.Builder(context, 0, baseFragment.getResourceProvider()).setTitle(LocaleController.getString(R.string.BotAuthPhoneNumber));
        int i3 = R.string.BotAuthPhoneNumberText;
        if (z && !z2) {
            str = UserObject.getUserName(tL_urlAuthResultRequest.bot);
        }
        title.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i3, str, PhoneFormat.getInstance().format("+" + currentUser.phone).replaceAll(" ", " ")))).setNegativeButton(LocaleController.getString(R.string.BotAuthPhoneNumberDeny), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i4) {
                switch (i2) {
                    case 0:
                        OAuthSheet.lambda$handle$14(zArr, runnable, alertDialog, i4);
                        break;
                    default:
                        OAuthSheet.lambda$handle$15(zArr, runnable, alertDialog, i4);
                        break;
                }
            }
        }).setPositiveButton(LocaleController.getString(R.string.BotAuthPhoneNumberAccept), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i4) {
                switch (i) {
                    case 0:
                        OAuthSheet.lambda$handle$14(zArr, runnable, alertDialog, i4);
                        break;
                    default:
                        OAuthSheet.lambda$handle$15(zArr, runnable, alertDialog, i4);
                        break;
                }
            }
        }).makeRed(-2).show();
    }

    public static void lambda$handle$17(BottomSheet[] bottomSheetArr, DialogInterface dialogInterface) {
        showing = null;
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$showGiftOfferSheet$15();
            bottomSheetArr[0] = null;
        }
    }

    public static void lambda$handle$18(AlertDialog alertDialog, BottomSheet bottomSheet, String str, Theme.ResourcesProvider resourcesProvider, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (bool instanceof TLRPC.TL_boolTrue) {
            showing = bottomSheet;
            bottomSheet.show();
            return;
        }
        BottomSheet bottomSheet2 = showing;
        if (bottomSheet2 != null) {
            bottomSheet2.lambda$showGiftOfferSheet$15();
            showing = null;
        }
        getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider))).show();
    }

    public static void lambda$handle$19(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i, BottomSheet bottomSheet, String str, Theme.ResourcesProvider resourcesProvider, String str2) {
        AlertDialog alertDialog = new AlertDialog(context, 3, null);
        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 200L);
        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
        strArr[0] = str2;
        tL_messages_checkUrlAuthMatchCode.match_code = str2;
        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda21(0, str, bottomSheet, resourcesProvider, alertDialog));
    }

    public static void lambda$handle$2(TextCheckCell textCheckCell, View view) {
        textCheckCell.setChecked(!textCheckCell.isChecked());
    }

    public static void lambda$handle$20(boolean[] zArr, BotWebViewContainer botWebViewContainer, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i) {
        showing = null;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        if (botWebViewContainer != null) {
            botWebViewContainer.notifyEvent("oauth_result_failed", BotWebViewContainer.obj());
        }
        if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
            return;
        }
        TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
        tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_declineUrlAuth, null);
    }

    public static void lambda$handle$3(AlertDialog alertDialog, BottomSheet bottomSheet, boolean z, Integer num, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z2, BotWebViewContainer botWebViewContainer, String str2, Theme.ResourcesProvider resourcesProvider, TLRPC.UrlAuthResult urlAuthResult2, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (urlAuthResult2 != null) {
            bottomSheet.lambda$showGiftOfferSheet$15();
            handle(z, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z2, botWebViewContainer);
        } else if (tL_error != null) {
            if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                BulletinFactory.of(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError(tL_error);
            } else {
                bottomSheet.lambda$showGiftOfferSheet$15();
                getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str2) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider))).show();
            }
        }
    }

    public static void lambda$handle$4(int[] iArr, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, final BottomSheet bottomSheet, final boolean z, final String str, final TLRPC.UrlAuthResult urlAuthResult, final String[] strArr, final boolean z2, final BotWebViewContainer botWebViewContainer, final String str2, final Theme.ResourcesProvider resourcesProvider, final Integer num) {
        if (iArr[0] == num.intValue()) {
            return;
        }
        final AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3, null);
        AndroidUtilities.cancelRunOnUIThread(alertDialog.showRunnable);
        AndroidUtilities.runOnUIThread(alertDialog.showRunnable, 200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                AlertDialog alertDialog2 = alertDialog;
                Integer num2 = num;
                String str3 = str2;
                Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                OAuthSheet.lambda$handle$3(alertDialog2, bottomSheet, z, num2, tL_messages_requestUrlAuth, str, urlAuthResult, strArr, z2, botWebViewContainer, str3, resourcesProvider2, (TLRPC.UrlAuthResult) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void lambda$handle$5(Utilities.Callback callback, int i) {
        callback.run(Integer.valueOf(i));
    }

    public static void lambda$handle$6(BottomSheet bottomSheet, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, Utilities.Callback callback, View view) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(bottomSheet.container, bottomSheet.getResourcesProvider(), frameLayout);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int iIntValue = ((Integer) obj).intValue();
            if (UserConfig.getInstance(iIntValue).getCurrentUser() != null) {
                itemOptionsMakeOptions.addAccount(iIntValue, iArr[0] == iIntValue, new OAuthSheet$$ExternalSyntheticLambda6(callback, iIntValue, 0));
            }
        }
        itemOptionsMakeOptions.setDrawScrim(false).setOnTopOfScrim().setDimAlpha(0).setGravity(3).translate(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f)).show();
    }

    public static void lambda$handle$7(boolean[] zArr, BottomSheet bottomSheet, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        zArr[0] = true;
        bottomSheet.lambda$showGiftOfferSheet$15();
    }

    public static void lambda$handle$8(TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, boolean[] zArr, BottomSheet bottomSheet, ButtonWithCounterView buttonWithCounterView, BotWebViewContainer botWebViewContainer, int i, View view) {
        if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
            zArr[0] = true;
            bottomSheet.lambda$showGiftOfferSheet$15();
        } else {
            if (buttonWithCounterView.isLoading()) {
                return;
            }
            buttonWithCounterView.setLoading(true);
            if (botWebViewContainer != null) {
                botWebViewContainer.notifyEvent("oauth_result_failed", BotWebViewContainer.obj());
            }
            TLRPC.TL_messages_declineUrlAuth tL_messages_declineUrlAuth = new TLRPC.TL_messages_declineUrlAuth();
            tL_messages_declineUrlAuth.url = tL_messages_requestUrlAuth.url;
            ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_declineUrlAuth, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda19(0, zArr, bottomSheet));
        }
    }

    public static void lambda$handle$9(boolean[] zArr, BottomSheet bottomSheet, String str, Theme.ResourcesProvider resourcesProvider, boolean z, int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth, BotWebViewContainer botWebViewContainer, TLRPC.UrlAuthResult urlAuthResult, TLRPC.TL_error tL_error) {
        zArr[0] = true;
        bottomSheet.lambda$showGiftOfferSheet$15();
        if (tL_error == null) {
            handle(z, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str2, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, botWebViewContainer);
        } else if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
            getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider))).show();
        } else {
            getBulletinFactory().showForError(tL_error);
        }
    }

    public static void lambda$showMatchCodeSheet$21(BottomSheet[] bottomSheetArr, Utilities.Callback callback, String str, View view) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$showGiftOfferSheet$15();
            bottomSheetArr[0] = null;
            callback.run(str);
        }
    }

    public static void lambda$showMatchCodeSheet$22(ArrayList arrayList, BackupImageView[] backupImageViewArr, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            int i2 = 0;
            while (true) {
                if (i2 < tL_messages_stickerSet.packs.size()) {
                    if (tL_messages_stickerSet.packs.get(i2).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i2).emoticon, str)) {
                        i2++;
                    } else {
                        long jLongValue = tL_messages_stickerSet.packs.get(i2).documents.get(0).longValue();
                        int i3 = 0;
                        while (true) {
                            if (i3 < tL_messages_stickerSet.documents.size()) {
                                if (tL_messages_stickerSet.documents.get(i3).id == jLongValue) {
                                    document = tL_messages_stickerSet.documents.get(i3);
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                }
                document = null;
                break;
            }
            if (document != null) {
                backupImageViewArr[i].setImage(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str), (Object) null);
            }
        }
    }

    public static void lambda$showMatchCodeSheet$23(ButtonWithCounterView buttonWithCounterView, BottomSheet[] bottomSheetArr, Runnable runnable, View view) {
        BottomSheet bottomSheet;
        if (buttonWithCounterView.isLoading() || (bottomSheet = bottomSheetArr[0]) == null) {
            return;
        }
        bottomSheet.lambda$showGiftOfferSheet$15();
        bottomSheetArr[0] = null;
        runnable.run();
    }

    public static BottomSheet showMatchCodeSheet(Context context, int i, ArrayList<String> arrayList, String str, Utilities.Callback<String> callback, boolean z, Runnable runnable, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        Drawable drawable;
        BottomSheet[] bottomSheetArr = new BottomSheet[1];
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, false, false, null);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        bottomSheetM.customView = linearLayout;
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
        linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 1, 0, 25, 0, 19));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setPadding(0, AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f));
        linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1, 0, 0, 0, 0));
        if (!ConnectionsManager.getInstance(i).isTestBackend()) {
            i2 = i;
            break;
        }
        i2 = 0;
        while (true) {
            if (i2 >= 4) {
                i2 = i;
                break;
            }
            if (UserConfig.getInstance(i2).isClientActivated() && !ConnectionsManager.getInstance(i2).isTestBackend()) {
                break;
            }
            i2++;
        }
        BackupImageView[] backupImageViewArr = new BackupImageView[arrayList.size()];
        int i3 = 0;
        boolean z2 = true;
        while (i3 < arrayList.size()) {
            String str2 = arrayList.get(i3);
            FrameLayout frameLayout = new FrameLayout(context);
            BottomSheet bottomSheet = bottomSheetM;
            frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(70.0f), Theme.multAlpha(0.05f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider))));
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str2);
            if (emojiBigDrawable == null) {
                final Text text = new Text(str2, 30.0f, AndroidUtilities.bold());
                drawable = new Drawable() {
                    @Override
                    public void draw(Canvas canvas) {
                        text.draw(canvas, getBounds().centerX() - (text.getCurrentWidth() / 2.0f), getBounds().centerY(), Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), 1.0f);
                    }

                    @Override
                    public int getOpacity() {
                        return -2;
                    }

                    @Override
                    public void setAlpha(int i4) {
                    }

                    @Override
                    public void setColorFilter(ColorFilter colorFilter) {
                    }
                };
                z2 = false;
            } else {
                drawable = emojiBigDrawable;
            }
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageViewArr[i3] = backupImageView;
            backupImageView.getImageReceiver().setCurrentAccount(i2);
            backupImageView.setImage((ImageLocation) null, (String) null, (ImageLocation) null, (String) null, drawable, (Object) null);
            NotificationCenter.listenEmojiLoading(backupImageView);
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40, 17));
            linearLayout2.addView(frameLayout, LayoutHelper.createLinear(70, 70, 16, i3 == 0 ? 0 : 24, 0, 0, 0));
            ScaleStateListAnimator.apply(frameLayout);
            frameLayout.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda0(bottomSheetArr, callback, str2, 0));
            i3++;
            bottomSheetM = bottomSheet;
        }
        BottomSheet bottomSheet2 = bottomSheetM;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        MediaDataController.getInstance(i2).getStickerSet(tL_inputStickerSetShortName, null, false, new OAuthSheet$$ExternalSyntheticLambda1(0, arrayList, backupImageViewArr));
        textView.setText(LocaleController.getString(z2 ? R.string.BotAuthSelectEmoji : R.string.BotAuthSelectCode));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        textView2.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthLoginRequestFrom, str), Theme.getColor(null, Theme.key_featuredStickers_addButton, false)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 0, 23, 0, 11));
        ButtonWithCounterView buttonWithCounterViewM = zzkg.m(context, resourcesProvider, true);
        if (z) {
            buttonWithCounterViewM.setNeutral();
            buttonWithCounterViewM.setText(LocaleController.getString(R.string.Cancel));
        } else {
            buttonWithCounterViewM.setColor(Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
            buttonWithCounterViewM.setText(LocaleController.getString(R.string.Decline));
        }
        linearLayout.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 7, 12, 12, 12, 12));
        buttonWithCounterViewM.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda0(buttonWithCounterViewM, bottomSheetArr, runnable));
        bottomSheet2.show();
        bottomSheetArr[0] = bottomSheet2;
        return bottomSheet2;
    }

    public static void handle(final boolean z, final int i, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, final String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z2, final BotWebViewContainer botWebViewContainer) {
        final Context context;
        boolean z3;
        FrameLayout frameLayout;
        TextCheckCell textCheckCell;
        ArrayList arrayList;
        BaseFragment safeLastFragment;
        String string;
        BaseFragment safeLastFragment2;
        Context context2;
        int i2 = 0;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (botWebViewContainer == null || (!TextUtils.isEmpty(tL_messages_requestUrlAuth.in_app_origin) && TextUtils.equals(botWebViewContainer.getOriginHost(), tL_messages_requestUrlAuth.in_app_origin))) {
                if (!TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                    if (botWebViewContainer != null) {
                        botWebViewContainer.notifyEvent("oauth_result_confirmed", BotWebViewContainer.obj("result_url", tL_urlAuthResultAccepted.url));
                        return;
                    }
                    BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                    if (safeLastFragment3 == null) {
                        return;
                    }
                    Browser.openUrlInSystemBrowser(safeLastFragment3.getContext(), tL_urlAuthResultAccepted.url);
                    return;
                }
                boolean z4 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z4) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    string = tL_urlAuthResultRequest.is_app ? !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : LocaleController.getString(R.string.UnverifiedApp) : tL_urlAuthResultRequest.domain;
                } else {
                    string = null;
                }
                if (!TextUtils.isEmpty(string)) {
                    getBulletinFactory().createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.BotAuthLoggedInSuccessTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(z4 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z2 ? R.string.BotAuthLoggedInSuccessWithoutPhoneNumber : R.string.BotAuthLoggedInSuccess, string), Theme.getColor(null, Theme.key_undo_cancelColor, false))).show();
                }
                if (botWebViewContainer != null) {
                    botWebViewContainer.notifyEvent("oauth_result_confirmed", BotWebViewContainer.obj("result_url", null));
                    return;
                } else {
                    if (!z || (safeLastFragment2 = LaunchActivity.getSafeLastFragment()) == null || (context2 = safeLastFragment2.getContext()) == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda7(context2, i2), 800L);
                    return;
                }
            }
            return;
        }
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (botWebViewContainer != null) {
                return;
            }
            if (TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                if (TextUtils.isEmpty(str) || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                    return;
                }
                AlertsCreator.showOpenUrlAlert(safeLastFragment, str, false, urlAuthResult2 == null);
                return;
            }
            BaseFragment safeLastFragment4 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment4 == null) {
                return;
            }
            AlertsCreator.showOpenUrlAlert(safeLastFragment4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
            return;
        }
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final BaseFragment safeLastFragment5 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment5 == null || (context = safeLastFragment5.getContext()) == null) {
                return;
            }
            Theme.ResourcesProvider resourceProvider = safeLastFragment5.getResourceProvider();
            final BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, false, false, safeLastFragment5.getResourceProvider());
            FrameLayout frameLayout2 = new FrameLayout(context);
            bottomSheetM.customView = frameLayout2;
            ArrayList arrayList2 = new ArrayList();
            boolean zIsTestBackend = ConnectionsManager.getInstance(i).isTestBackend();
            arrayList2.clear();
            for (int i3 = 0; i3 < 4; i3++) {
                if (UserConfig.getInstance(i3).isClientActivated() && ConnectionsManager.getInstance(i3).isTestBackend() == zIsTestBackend) {
                    arrayList2.add(Integer.valueOf(i3));
                }
            }
            Collections.sort(arrayList2, new OAuthSheet$$ExternalSyntheticLambda10(i2));
            final boolean z5 = tL_messages_requestUrlAuth.peer != null;
            final boolean z6 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout3 = new FrameLayout(context);
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), safeLastFragment5.getThemedColor(Theme.key_dialogBackgroundGray)));
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
            backupImageView.getImageReceiver().setCrossfadeWithOldImage(true);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            final int[] iArr = {i};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            avatarDrawable.setInfo(currentUser);
            backupImageView.setForUserOrChat(currentUser, avatarDrawable);
            frameLayout4.addView(backupImageView, LayoutHelper.createFrame(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int themedColor = safeLastFragment5.getThemedColor(Theme.key_dialogTextGray3);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout4.addView(imageView, LayoutHelper.createFrame(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout3.addView(frameLayout4, LayoutHelper.createFrame(52, 28, 17));
            frameLayout3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout2.addView(frameLayout3, LayoutHelper.createLinear(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            ScaleStateListAnimator.apply(frameLayout3);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout3.setVisibility(8);
            }
            LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
            frameLayout2.addView(linearLayoutM, LayoutHelper.createFrame(-1, -1, 119));
            BackupImageView backupImageView2 = new BackupImageView(context);
            backupImageView2.setRoundRadius(AndroidUtilities.dp(40.0f));
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            avatarDrawable2.setInfo(tL_urlAuthResultRequest2.bot);
            backupImageView2.setForUserOrChat(tL_urlAuthResultRequest2.bot, avatarDrawable2);
            linearLayoutM.addView(backupImageView2, LayoutHelper.createLinear(80, 80, 49, 0, 21, 0, 16));
            final String string2 = tL_urlAuthResultRequest2.is_app ? !TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name) ? tL_urlAuthResultRequest2.verified_app_name : LocaleController.getString(R.string.UnverifiedApp) : tL_urlAuthResultRequest2.domain;
            int i4 = Theme.key_dialogTextBlack;
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i4, true);
            textViewMakeTextView.setGravity(17);
            textViewMakeTextView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthTitle, string2), safeLastFragment5.getThemedColor(Theme.key_featuredStickers_addButton)));
            linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i4, false);
            textViewMakeTextView2.setGravity(17);
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(z6 ? R.string.BotAuthAppSubtitle : z5 ? R.string.BotAuthBotSubtitle : R.string.BotAuthSiteSubtitle, textViewMakeTextView2);
            linearLayoutM.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                frameLayout = frameLayout3;
                frameLayout4 = frameLayout4;
                resourceProvider = resourceProvider;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                linearLayout.setBackground(Theme.createRoundRectDrawableShadowed(AndroidUtilities.dp(16.0f), safeLastFragment5.getThemedColor(Theme.key_windowBackgroundWhite)));
                linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 55, 9, -3, 9, -3));
                if (!TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) || !TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    LinearLayout linearLayoutM2 = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.msg2_devices);
                    imageView2.setColorFilter(new PorterDuffColorFilter(safeLastFragment5.getThemedColor(i4), mode));
                    linearLayoutM2.addView(imageView2, LayoutHelper.createLinear(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    linearLayoutM2.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 16.0f, i4, false);
                    textViewMakeTextView3.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(textViewMakeTextView3, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView textViewMakeTextView4 = TextHelper.makeTextView(context, 13.0f, Theme.key_windowBackgroundWhiteGrayText, false);
                    textViewMakeTextView4.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    linearLayout2.addView(textViewMakeTextView4, LayoutHelper.createLinear(-1, -2, 55));
                    linearLayout.addView(linearLayoutM2, LayoutHelper.createLinear(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    z3 = false;
                } else {
                    LinearLayout linearLayoutM3 = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(R.drawable.msg2_language);
                    imageView3.setColorFilter(new PorterDuffColorFilter(safeLastFragment5.getThemedColor(i4), mode));
                    linearLayoutM3.addView(imageView3, LayoutHelper.createLinear(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    linearLayoutM3.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView textViewMakeTextView5 = TextHelper.makeTextView(context, 16.0f, i4, false);
                    textViewMakeTextView5.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(textViewMakeTextView5, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    z3 = false;
                    TextView textViewMakeTextView6 = TextHelper.makeTextView(context, 13.0f, Theme.key_windowBackgroundWhiteGrayText, false);
                    textViewMakeTextView6.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : LocaleController.formatString(R.string.BotAuthBasedOnIP, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(textViewMakeTextView6, LayoutHelper.createLinear(-1, -2, 55));
                    linearLayout.addView(linearLayoutM3, LayoutHelper.createLinear(-1, -2));
                }
                TextView textViewMakeTextView7 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, z3);
                textViewMakeTextView7.setText(LocaleController.getString(R.string.BotAuthInfo));
                linearLayoutM.addView(textViewMakeTextView7, LayoutHelper.createLinear(-1, -2, 55, 22, 5, 22, 20));
                frameLayout = frameLayout3;
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout5 = new FrameLayout(context);
                int iDp = AndroidUtilities.dp(16.0f);
                int i5 = Theme.key_windowBackgroundWhite;
                frameLayout5.setBackground(Theme.createRoundRectDrawableShadowed(iDp, safeLastFragment5.getThemedColor(i5)));
                TextCheckCell textCheckCell2 = new TextCheckCell(context, 21, false, safeLastFragment5.getResourceProvider());
                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.BotAuthAllowMessages), true, false);
                textCheckCell2.setBackground(Theme.createRadSelectorDrawable(safeLastFragment5.getThemedColor(i5), safeLastFragment5.getThemedColor(Theme.key_listSelector), 16, 16));
                textCheckCell2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(textCheckCell2, 0));
                frameLayout5.addView(textCheckCell2, LayoutHelper.createFrame(-1, -1, 119));
                linearLayoutM.addView(frameLayout5, LayoutHelper.createLinear(-1, -2, 7, 9, -3, 9, -3));
                TextView textViewMakeTextView8 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false);
                textViewMakeTextView8.setText(LocaleController.formatString(R.string.BotAuthAllowMessagesInfo, UserObject.getUserName(tL_urlAuthResultRequest2.bot)));
                linearLayoutM.addView(textViewMakeTextView8, LayoutHelper.createLinear(-1, -2, 55, 22, 6, 22, 20));
                textCheckCell = textCheckCell2;
            } else {
                textCheckCell = null;
            }
            LinearLayout linearLayoutM4 = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
            final ButtonWithCounterView round = new ButtonWithCounterView(context, true, safeLastFragment5.getResourceProvider()).setRound();
            round.setColor(safeLastFragment5.getThemedColor(Theme.key_text_RedRegular));
            round.setText(LocaleController.getString(R.string.Decline));
            linearLayoutM4.addView(round, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            final ButtonWithCounterView round2 = new ButtonWithCounterView(context, true, safeLastFragment5.getResourceProvider()).setRound();
            round2.setText(LocaleController.getString(R.string.BotAuthLogin));
            linearLayoutM4.addView(round2, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            linearLayoutM.addView(linearLayoutM4, LayoutHelper.createLinear(-1, -2, 7, 12, 12, 12, 8));
            bottomSheetM.setBackgroundColor(safeLastFragment5.getThemedColor(Theme.key_windowBackgroundGray));
            final String[] strArr = {str2};
            ArrayList arrayList3 = arrayList2;
            FrameLayout frameLayout6 = frameLayout;
            final Theme.ResourcesProvider resourcesProvider = resourceProvider;
            OAuthSheet$$ExternalSyntheticLambda12 oAuthSheet$$ExternalSyntheticLambda12 = new OAuthSheet$$ExternalSyntheticLambda12(iArr, tL_messages_requestUrlAuth, bottomSheetM, z, str, urlAuthResult2, strArr, z2, botWebViewContainer, string2, resourcesProvider);
            if (tL_urlAuthResultRequest2.user_id_hint == 0 || UserConfig.getInstance(i).getClientUserId() == tL_urlAuthResultRequest2.user_id_hint) {
                arrayList = arrayList3;
                break;
            }
            int size = arrayList3.size();
            int i6 = 0;
            while (true) {
                if (i6 >= size) {
                    arrayList = arrayList3;
                    break;
                }
                arrayList = arrayList3;
                Object obj = arrayList.get(i6);
                int i7 = i6 + 1;
                Integer num = (Integer) obj;
                int i8 = size;
                if (UserConfig.getInstance(num.intValue()).getClientUserId() == tL_urlAuthResultRequest2.user_id_hint) {
                    oAuthSheet$$ExternalSyntheticLambda12.run(num);
                    break;
                } else {
                    size = i8;
                    i6 = i7;
                    arrayList3 = arrayList;
                }
            }
            frameLayout6.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda13(bottomSheetM, frameLayout4, arrayList, iArr, oAuthSheet$$ExternalSyntheticLambda12, 0));
            final boolean[] zArr = new boolean[1];
            round.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda14(tL_messages_requestUrlAuth, zArr, bottomSheetM, round, botWebViewContainer, i, 0));
            final boolean[] zArr2 = new boolean[1];
            final TextCheckCell textCheckCell3 = textCheckCell;
            final OAuthSheet$$ExternalSyntheticLambda16 oAuthSheet$$ExternalSyntheticLambda16 = new OAuthSheet$$ExternalSyntheticLambda16(tL_urlAuthResultRequest2, strArr, context, i, (OAuthSheet$$ExternalSyntheticLambda15) new Runnable() {
                @Override
                public final void run() {
                    OAuthSheet.lambda$handle$10(round2, round, tL_messages_requestUrlAuth, strArr, textCheckCell3, zArr2, iArr, zArr, bottomSheetM, string2, resourcesProvider, z, str, tL_urlAuthResultRequest2, botWebViewContainer);
                }
            }, safeLastFragment5);
            round2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    boolean[] zArr3 = zArr2;
                    OAuthSheet$$ExternalSyntheticLambda16 oAuthSheet$$ExternalSyntheticLambda17 = oAuthSheet$$ExternalSyntheticLambda16;
                    OAuthSheet.lambda$handle$16(round2, round, tL_urlAuthResultRequest2, iArr, context, safeLastFragment5, z5, z6, string2, zArr3, oAuthSheet$$ExternalSyntheticLambda17, view);
                }
            });
            bottomSheetM.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda18(new BottomSheet[1], 0));
            BottomSheet bottomSheet = showing;
            if (bottomSheet != null) {
                bottomSheet.lambda$showGiftOfferSheet$15();
                showing = null;
            }
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                showing = showMatchCodeSheet(context, i, tL_urlAuthResultRequest2.match_codes, string2, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        Context context3 = context;
                        String[] strArr2 = strArr;
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth2 = tL_messages_requestUrlAuth;
                        BottomSheet bottomSheet2 = bottomSheetM;
                        String str3 = string2;
                        OAuthSheet.lambda$handle$19(context3, strArr2, tL_messages_requestUrlAuth2, i, bottomSheet2, str3, resourcesProvider, (String) obj2);
                    }
                }, false, new OAuthSheet$$ExternalSyntheticLambda9(zArr, botWebViewContainer, tL_messages_requestUrlAuth, i, 0), safeLastFragment5.getResourceProvider());
            } else {
                showing = bottomSheetM;
                bottomSheetM.show();
            }
        }
    }
}

package org.telegram.ui;

import android.content.Context;
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
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzlp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1;
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
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.web.BotWebViewContainer;

public abstract class OAuthSheet {
    public static BottomSheet showing;

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
                return new BulletinFactory(new Bulletin.BulletinWindow(parentActivity2, null).container, null);
            }
        }
        HashSet<ArticleViewer> hashSet2 = ArticleViewer.activeSheets;
        if (!hashSet2.isEmpty()) {
            ArticleViewer articleViewer = null;
            for (ArticleViewer articleViewer2 : hashSet2) {
                if (articleViewer2.isVisible) {
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
                return new BulletinFactory(new Bulletin.BulletinWindow(parentActivity, null).container, null);
            }
        }
        return (safeLastFragment == null || safeLastFragment.getLastSheet() == null || safeLastFragment.getLastSheet().getBulletinFactory() == null) ? BulletinFactory.of(safeLastFragment) : safeLastFragment.getLastSheet().getBulletinFactory();
    }

    public static void handle(boolean z, final int i, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, String str, TLRPC.UrlAuthResult urlAuthResult2, String str2, boolean z2, BotWebViewContainer botWebViewContainer) {
        final Context context;
        boolean z3;
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
                        botWebViewContainer.notifyEvent("oauth_result_confirmed", BotWebViewContainer.obj(tL_urlAuthResultAccepted.url, "result_url"));
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
                    getBulletinFactory().createSimpleBulletin(LocaleController.getString(R.string.BotAuthLoggedInSuccessTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(z4 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z2 ? R.string.BotAuthLoggedInSuccessWithoutPhoneNumber : R.string.BotAuthLoggedInSuccess, string), Theme.getColor(null, Theme.key_undo_cancelColor, false)), R.raw.contact_check).show();
                }
                if (botWebViewContainer != null) {
                    botWebViewContainer.notifyEvent("oauth_result_confirmed", BotWebViewContainer.obj(null, "result_url"));
                    return;
                } else {
                    if (!z || (safeLastFragment2 = LaunchActivity.getSafeLastFragment()) == null || (context2 = safeLastFragment2.getContext()) == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda0(context2, i2), 800L);
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
            final BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, safeLastFragment5.getResourceProvider(), false, false);
            FrameLayout frameLayout = new FrameLayout(context);
            bottomSheetM.customView = frameLayout;
            ArrayList arrayList2 = new ArrayList();
            boolean zIsTestBackend = ConnectionsManager.getInstance(i).isTestBackend();
            arrayList2.clear();
            for (int i3 = 0; i3 < 4; i3++) {
                if (UserConfig.getInstance(i3).isClientActivated() && ConnectionsManager.getInstance(i3).isTestBackend() == zIsTestBackend) {
                    arrayList2.add(Integer.valueOf(i3));
                }
            }
            Collections.sort(arrayList2, new OAuthSheet$$ExternalSyntheticLambda3(i2));
            final boolean z5 = tL_messages_requestUrlAuth.peer != null;
            final boolean z6 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout2 = new FrameLayout(context);
            FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), safeLastFragment5.getThemedColor(Theme.key_dialogBackgroundGray)));
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
            backupImageView.getImageReceiver().setCrossfadeWithOldImage(true);
            AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
            final int[] iArr = {i};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            avatarDrawable.setInfo(UserConfig.selectedAccount, currentUser);
            backupImageView.imageReceiver.setForUserOrChat(currentUser, avatarDrawable);
            backupImageView.onNewImageSet();
            frameLayout3.addView(backupImageView, LayoutHelper.createFrame(28, 28, 115));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            int themedColor = safeLastFragment5.getThemedColor(Theme.key_dialogTextGray3);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            imageView.setImageResource(R.drawable.arrows_select);
            frameLayout3.addView(imageView, LayoutHelper.createFrame(18, 18.0f, 21, 0.0f, 0.0f, 4.0f, 0.0f));
            frameLayout2.addView(frameLayout3, LayoutHelper.createFrame(52, 28, 17));
            frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(8.0f), 0);
            frameLayout.addView(frameLayout2, LayoutHelper.createLinear(-2, -2, 0.0f, 51, 6, 4, 6, 0));
            ScaleStateListAnimator.apply(frameLayout2, 0.1f, 1.5f);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout linearLayoutM = zzkf.m(context, 1);
            frameLayout.addView(linearLayoutM, LayoutHelper.createFrame(-1, -1, 119));
            BackupImageView backupImageView2 = new BackupImageView(context);
            backupImageView2.setRoundRadius(AndroidUtilities.dp(40.0f));
            AvatarDrawable avatarDrawable2 = new AvatarDrawable((Theme.ResourcesProvider) null);
            avatarDrawable2.setInfo(UserConfig.selectedAccount, tL_urlAuthResultRequest2.bot);
            backupImageView2.imageReceiver.setForUserOrChat(tL_urlAuthResultRequest2.bot, avatarDrawable2);
            backupImageView2.onNewImageSet();
            linearLayoutM.addView(backupImageView2, LayoutHelper.createLinear(80, 80, 49, 0, 21, 0, 16));
            String string2 = tL_urlAuthResultRequest2.is_app ? !TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name) ? tL_urlAuthResultRequest2.verified_app_name : LocaleController.getString(R.string.UnverifiedApp) : tL_urlAuthResultRequest2.domain;
            int i4 = Theme.key_dialogTextBlack;
            final String str3 = string2;
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i4, true, null);
            textViewMakeTextView.setGravity(17);
            textViewMakeTextView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthTitle, str3), safeLastFragment5.getThemedColor(Theme.key_featuredStickers_addButton)));
            linearLayoutM.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i4, false, null);
            textViewMakeTextView2.setGravity(17);
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline1.m(z6 ? R.string.BotAuthAppSubtitle : z5 ? R.string.BotAuthBotSubtitle : R.string.BotAuthSiteSubtitle, textViewMakeTextView2);
            linearLayoutM.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                frameLayout2 = frameLayout2;
                frameLayout3 = frameLayout3;
                resourceProvider = resourceProvider;
            } else {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setClipToPadding(false);
                linearLayout.setClipChildren(false);
                linearLayout.setOrientation(1);
                linearLayout.setBackground(Theme.createRoundRectDrawableShadowed(AndroidUtilities.dp(16.0f), safeLastFragment5.getThemedColor(Theme.key_windowBackgroundWhite)));
                linearLayoutM.addView(linearLayout, LayoutHelper.createLinear(-1, -2, 55, 9, -3, 9, -3));
                if (!TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) || !TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    LinearLayout linearLayoutM2 = zzkf.m(context, 0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.msg2_devices);
                    imageView2.setColorFilter(new PorterDuffColorFilter(safeLastFragment5.getThemedColor(i4), mode));
                    linearLayoutM2.addView(imageView2, LayoutHelper.createLinear(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    linearLayoutM2.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 16.0f, i4, false, null);
                    textViewMakeTextView3.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout2.addView(textViewMakeTextView3, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView textViewMakeTextView4 = TextHelper.makeTextView(context, 13.0f, Theme.key_windowBackgroundWhiteGrayText, false, null);
                    textViewMakeTextView4.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    linearLayout2.addView(textViewMakeTextView4, LayoutHelper.createLinear(-1, -2, 55));
                    linearLayout.addView(linearLayoutM2, LayoutHelper.createLinear(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    z3 = false;
                } else {
                    LinearLayout linearLayoutM3 = zzkf.m(context, 0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(R.drawable.msg2_language);
                    imageView3.setColorFilter(new PorterDuffColorFilter(safeLastFragment5.getThemedColor(i4), mode));
                    linearLayoutM3.addView(imageView3, LayoutHelper.createLinear(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(1);
                    linearLayoutM3.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView textViewMakeTextView5 = TextHelper.makeTextView(context, 16.0f, i4, false, null);
                    textViewMakeTextView5.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout3.addView(textViewMakeTextView5, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    z3 = false;
                    TextView textViewMakeTextView6 = TextHelper.makeTextView(context, 13.0f, Theme.key_windowBackgroundWhiteGrayText, false, null);
                    textViewMakeTextView6.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : LocaleController.formatString(R.string.BotAuthBasedOnIP, tL_urlAuthResultRequest2.ip));
                    linearLayout3.addView(textViewMakeTextView6, LayoutHelper.createLinear(-1, -2, 55));
                    linearLayout.addView(linearLayoutM3, LayoutHelper.createLinear(-1, -2));
                }
                TextView textViewMakeTextView7 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, z3, null);
                textViewMakeTextView7.setText(LocaleController.getString(R.string.BotAuthInfo));
                linearLayoutM.addView(textViewMakeTextView7, LayoutHelper.createLinear(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                int iDp = AndroidUtilities.dp(16.0f);
                int i5 = Theme.key_windowBackgroundWhite;
                frameLayout4.setBackground(Theme.createRoundRectDrawableShadowed(iDp, safeLastFragment5.getThemedColor(i5)));
                TextCheckCell textCheckCell2 = new TextCheckCell(21, context, safeLastFragment5.getResourceProvider(), false);
                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.BotAuthAllowMessages), true, false);
                textCheckCell2.setBackground(Theme.createRadSelectorDrawable(safeLastFragment5.getThemedColor(i5), safeLastFragment5.getThemedColor(Theme.key_listSelector), 16, 16));
                textCheckCell2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda4(textCheckCell2, 0));
                frameLayout4.addView(textCheckCell2, LayoutHelper.createFrame(-1, -1, 119));
                linearLayoutM.addView(frameLayout4, LayoutHelper.createLinear(-1, -2, 7, 9, -3, 9, -3));
                TextView textViewMakeTextView8 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false, null);
                textViewMakeTextView8.setText(LocaleController.formatString(R.string.BotAuthAllowMessagesInfo, UserObject.getUserName(tL_urlAuthResultRequest2.bot)));
                linearLayoutM.addView(textViewMakeTextView8, LayoutHelper.createLinear(-1, -2, 55, 22, 6, 22, 20));
                textCheckCell = textCheckCell2;
            } else {
                textCheckCell = null;
            }
            LinearLayout linearLayoutM4 = zzkf.m(context, 0);
            final ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, safeLastFragment5.getResourceProvider(), true);
            buttonWithCounterView.setRoundRadius(24);
            buttonWithCounterView.setColor(safeLastFragment5.getThemedColor(Theme.key_text_RedRegular));
            buttonWithCounterView.setText(LocaleController.getString(R.string.Decline));
            linearLayoutM4.addView(buttonWithCounterView, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            final ButtonWithCounterView buttonWithCounterView2 = new ButtonWithCounterView(context, safeLastFragment5.getResourceProvider(), true);
            buttonWithCounterView2.setRoundRadius(24);
            buttonWithCounterView2.setText(LocaleController.getString(R.string.BotAuthLogin));
            linearLayoutM4.addView(buttonWithCounterView2, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            linearLayoutM.addView(linearLayoutM4, LayoutHelper.createLinear(-1, -2, 7, 12, 12, 12, 8));
            bottomSheetM.setBackgroundColor(safeLastFragment5.getThemedColor(Theme.key_windowBackgroundGray));
            final String[] strArr = {str2};
            ArrayList arrayList3 = arrayList2;
            FrameLayout frameLayout5 = frameLayout2;
            final Theme.ResourcesProvider resourcesProvider = resourceProvider;
            OAuthSheet$$ExternalSyntheticLambda5 oAuthSheet$$ExternalSyntheticLambda5 = new OAuthSheet$$ExternalSyntheticLambda5(iArr, tL_messages_requestUrlAuth, bottomSheetM, z, str, urlAuthResult2, strArr, z2, botWebViewContainer, str3, resourcesProvider);
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
                    oAuthSheet$$ExternalSyntheticLambda5.run(num);
                    break;
                } else {
                    size = i8;
                    i6 = i7;
                    arrayList3 = arrayList;
                }
            }
            frameLayout5.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(bottomSheetM, frameLayout3, arrayList, iArr, oAuthSheet$$ExternalSyntheticLambda5, 0));
            boolean[] zArr = new boolean[1];
            buttonWithCounterView.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda7(tL_messages_requestUrlAuth, zArr, bottomSheetM, buttonWithCounterView, botWebViewContainer, i, 0));
            final boolean[] zArr2 = new boolean[1];
            final OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda9 = new OAuthSheet$$ExternalSyntheticLambda9(tL_urlAuthResultRequest2, strArr, context, i, new OAuthSheet$$ExternalSyntheticLambda8(buttonWithCounterView2, buttonWithCounterView, tL_messages_requestUrlAuth, strArr, textCheckCell, zArr2, iArr, zArr, bottomSheetM, str3, resourcesProvider, z, str, tL_urlAuthResultRequest2, botWebViewContainer), safeLastFragment5, 0);
            buttonWithCounterView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    final int i9 = 1;
                    final int i10 = 0;
                    if (buttonWithCounterView2.loading || buttonWithCounterView.loading) {
                        return;
                    }
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest3 = tL_urlAuthResultRequest2;
                    boolean z7 = tL_urlAuthResultRequest3.request_phone_number;
                    final OAuthSheet$$ExternalSyntheticLambda9 oAuthSheet$$ExternalSyntheticLambda10 = oAuthSheet$$ExternalSyntheticLambda9;
                    if (!z7) {
                        oAuthSheet$$ExternalSyntheticLambda10.run();
                        return;
                    }
                    TLRPC.User currentUser2 = UserConfig.getInstance(iArr[0]).getCurrentUser();
                    AlertDialog.Builder builder = new AlertDialog.Builder(context, 0, safeLastFragment5.getResourceProvider());
                    String string3 = LocaleController.getString(R.string.BotAuthPhoneNumber);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string3;
                    int i11 = R.string.BotAuthPhoneNumberText;
                    String userName = (!z5 || z6) ? str3 : UserObject.getUserName(tL_urlAuthResultRequest3.bot);
                    alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString(i11, userName, PhoneFormat.getInstance().format("+" + currentUser2.phone).replaceAll(" ", " ")));
                    String string4 = LocaleController.getString(R.string.BotAuthPhoneNumberDeny);
                    final boolean[] zArr3 = zArr2;
                    builder.setNegativeButton(string4, new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog2, int i12) {
                            switch (i10) {
                                case 0:
                                    zArr3[0] = false;
                                    oAuthSheet$$ExternalSyntheticLambda10.run();
                                    break;
                                default:
                                    zArr3[0] = true;
                                    oAuthSheet$$ExternalSyntheticLambda10.run();
                                    break;
                            }
                        }
                    });
                    builder.setPositiveButton(LocaleController.getString(R.string.BotAuthPhoneNumberAccept), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog2, int i12) {
                            switch (i9) {
                                case 0:
                                    zArr3[0] = false;
                                    oAuthSheet$$ExternalSyntheticLambda10.run();
                                    break;
                                default:
                                    zArr3[0] = true;
                                    oAuthSheet$$ExternalSyntheticLambda10.run();
                                    break;
                            }
                        }
                    });
                    builder.makeRed(-2);
                    builder.show();
                }
            });
            bottomSheetM.setOnDismissListener(new OAuthSheet$$ExternalSyntheticLambda11(new BottomSheet[1], 0));
            BottomSheet bottomSheet = showing;
            if (bottomSheet != null) {
                bottomSheet.lambda$showGiftOfferSheet$15();
                showing = null;
            }
            if (tL_urlAuthResultRequest2.match_codes_first && !tL_urlAuthResultRequest2.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
                showing = showMatchCodeSheet(context, i, tL_urlAuthResultRequest2.match_codes, str3, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj2) {
                        String str4 = (String) obj2;
                        AlertDialog alertDialog = new AlertDialog(context, 3, null);
                        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 200L);
                        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                        strArr[0] = str4;
                        tL_messages_checkUrlAuthMatchCode.match_code = str4;
                        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
                        ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new AiTonesController$$ExternalSyntheticLambda0(), new OAuthSheet$$ExternalSyntheticLambda20(alertDialog, bottomSheetM, str3, resourcesProvider, 0));
                    }
                }, false, new OAuthSheet$$ExternalSyntheticLambda2(zArr, botWebViewContainer, tL_messages_requestUrlAuth, i, 0), safeLastFragment5.getResourceProvider());
            } else {
                showing = bottomSheetM;
                bottomSheetM.show();
            }
        }
    }

    public static BottomSheet showMatchCodeSheet(Context context, int i, ArrayList arrayList, String str, Utilities.Callback callback, boolean z, Runnable runnable, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        Drawable drawable;
        BottomSheet[] bottomSheetArr = new BottomSheet[1];
        BottomSheet bottomSheetM = VoIPService$$ExternalSyntheticOutline0.m(context, null, false, false);
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
            String str2 = (String) arrayList.get(i3);
            FrameLayout frameLayout = new FrameLayout(context);
            BottomSheet bottomSheet = bottomSheetM;
            frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(70.0f), Theme.multAlpha(0.05f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider))));
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str2);
            if (emojiBigDrawable == null) {
                final Text text = new Text(str2, 30.0f, AndroidUtilities.bold());
                drawable = new Drawable() {
                    @Override
                    public final void draw(Canvas canvas) {
                        text.draw(getBounds().centerX() - (text.width / 2.0f), getBounds().centerY(), 1.0f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), canvas);
                    }

                    @Override
                    public final int getOpacity() {
                        return -2;
                    }

                    @Override
                    public final void setAlpha(int i4) {
                    }

                    @Override
                    public final void setColorFilter(ColorFilter colorFilter) {
                    }
                };
                z2 = false;
            } else {
                drawable = emojiBigDrawable;
            }
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageViewArr[i3] = backupImageView;
            backupImageView.getImageReceiver().setCurrentAccount(i2);
            backupImageView.setImage(null, null, null, null, drawable, null);
            NotificationCenter.listenEmojiLoading(backupImageView);
            frameLayout.addView(backupImageView, LayoutHelper.createFrame(40, 40, 17));
            linearLayout2.addView(frameLayout, LayoutHelper.createLinear(70, 70, 16, i3 == 0 ? 0 : 24, 0, 0, 0));
            ScaleStateListAnimator.apply(frameLayout, 0.1f, 1.5f);
            frameLayout.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda12(bottomSheetArr, callback, str2, 0));
            i3++;
            bottomSheetM = bottomSheet;
        }
        BottomSheet bottomSheet2 = bottomSheetM;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        MediaDataController.getInstance(i2).getStickerSet(tL_inputStickerSetShortName, null, false, new OAuthSheet$$ExternalSyntheticLambda13(0, arrayList, backupImageViewArr));
        textView.setText(LocaleController.getString(z2 ? R.string.BotAuthSelectEmoji : R.string.BotAuthSelectCode));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        textView2.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthLoginRequestFrom, str), Theme.getColor(null, Theme.key_featuredStickers_addButton, false)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 0, 23, 0, 11));
        ButtonWithCounterView buttonWithCounterViewM = zzlp.m(context, resourcesProvider, true);
        if (z) {
            buttonWithCounterViewM.setNeutral();
            buttonWithCounterViewM.setText(LocaleController.getString(R.string.Cancel));
        } else {
            buttonWithCounterViewM.setColor(Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
            buttonWithCounterViewM.setText(LocaleController.getString(R.string.Decline));
        }
        linearLayout.addView(buttonWithCounterViewM, LayoutHelper.createLinear(-1, 48, 7, 12, 12, 12, 12));
        buttonWithCounterViewM.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda12(buttonWithCounterViewM, bottomSheetArr, runnable));
        bottomSheet2.show();
        bottomSheetArr[0] = bottomSheet2;
        return bottomSheet2;
    }
}

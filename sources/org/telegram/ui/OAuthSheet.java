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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotForumHelper$$ExternalSyntheticLambda2;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
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

public abstract class OAuthSheet {
    private static BottomSheet showing;

    public static void lambda$handle$12() {
    }

    public static void handle(boolean z, int i, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult) {
        handle(z, i, tL_messages_requestUrlAuth, urlAuthResult, null, null, null, false, null);
    }

    public static void handle(final boolean z, final int i, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, final String str, final TLRPC.UrlAuthResult urlAuthResult2, String str2, final boolean z2, final BotWebViewContainer botWebViewContainer) {
        final Context context;
        String string;
        int i2;
        boolean z3;
        ArrayList arrayList;
        boolean z4;
        TextCheckCell textCheckCell;
        BaseFragment safeLastFragment;
        String string2;
        BaseFragment safeLastFragment2;
        final Context context2;
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
                boolean z5 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest;
                if (z5) {
                    TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult2;
                    if (tL_urlAuthResultRequest.is_app) {
                        string2 = !TextUtils.isEmpty(tL_urlAuthResultRequest.verified_app_name) ? tL_urlAuthResultRequest.verified_app_name : LocaleController.getString(R.string.UnverifiedApp);
                    } else {
                        string2 = tL_urlAuthResultRequest.domain;
                    }
                } else {
                    string2 = null;
                }
                if (!TextUtils.isEmpty(string2)) {
                    getBulletinFactory().createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.BotAuthLoggedInSuccessTitle), AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(z5 && ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).request_phone_number && !z2 ? R.string.BotAuthLoggedInSuccessWithoutPhoneNumber : R.string.BotAuthLoggedInSuccess, string2), Theme.getColor(Theme.key_undo_cancelColor))).show();
                }
                if (botWebViewContainer != null) {
                    botWebViewContainer.notifyEvent("oauth_result_confirmed", BotWebViewContainer.obj("result_url", null));
                    return;
                } else {
                    if (!z || (safeLastFragment2 = LaunchActivity.getSafeLastFragment()) == null || (context2 = safeLastFragment2.getContext()) == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            OAuthSheet.lambda$handle$0(context2);
                        }
                    }, 800L);
                    return;
                }
            }
            return;
        }
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
            if (botWebViewContainer != null) {
                return;
            }
            if (!TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
                BaseFragment safeLastFragment4 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment4 == null) {
                    return;
                }
                AlertsCreator.showOpenUrlAlert(safeLastFragment4, tL_messages_requestUrlAuth.url, false, urlAuthResult2 == null);
                return;
            }
            if (TextUtils.isEmpty(str) || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                return;
            }
            AlertsCreator.showOpenUrlAlert(safeLastFragment, str, false, urlAuthResult2 == null);
            return;
        }
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultRequest) {
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final BaseFragment safeLastFragment5 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment5 == null || (context = safeLastFragment5.getContext()) == null) {
                return;
            }
            final Theme.ResourcesProvider resourceProvider = safeLastFragment5.getResourceProvider();
            BottomSheet.Builder builder = new BottomSheet.Builder(context, false, safeLastFragment5.getResourceProvider());
            FrameLayout frameLayout = new FrameLayout(context);
            builder.setCustomView(frameLayout);
            ArrayList arrayList2 = new ArrayList();
            boolean zIsTestBackend = ConnectionsManager.getInstance(i).isTestBackend();
            arrayList2.clear();
            for (int i3 = 0; i3 < 4; i3++) {
                if (UserConfig.getInstance(i3).isClientActivated() && ConnectionsManager.getInstance(i3).isTestBackend() == zIsTestBackend) {
                    arrayList2.add(Integer.valueOf(i3));
                }
            }
            Collections.sort(arrayList2, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return OAuthSheet.lambda$handle$1((Integer) obj, (Integer) obj2);
                }
            });
            boolean z6 = tL_messages_requestUrlAuth.peer != null;
            boolean z7 = tL_urlAuthResultRequest2.is_app;
            FrameLayout frameLayout2 = new FrameLayout(context);
            final FrameLayout frameLayout3 = new FrameLayout(context);
            frameLayout3.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), safeLastFragment5.getThemedColor(Theme.key_dialogBackgroundGray)));
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setRoundRadius(AndroidUtilities.dp(14.0f));
            backupImageView.getImageReceiver().setCrossfadeWithOldImage(true);
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            final int[] iArr = {i};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            avatarDrawable.setInfo(currentUser);
            backupImageView.setForUserOrChat(currentUser, avatarDrawable);
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
            ScaleStateListAnimator.apply(frameLayout2);
            if (arrayList2.size() <= 1 || tL_messages_requestUrlAuth.peer != null) {
                frameLayout2.setVisibility(8);
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -1, 119));
            BackupImageView backupImageView2 = new BackupImageView(context);
            backupImageView2.setRoundRadius(AndroidUtilities.dp(40.0f));
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            avatarDrawable2.setInfo(tL_urlAuthResultRequest2.bot);
            backupImageView2.setForUserOrChat(tL_urlAuthResultRequest2.bot, avatarDrawable2);
            linearLayout.addView(backupImageView2, LayoutHelper.createLinear(80, 80, 49, 0, 21, 0, 16));
            if (tL_urlAuthResultRequest2.is_app) {
                string = !TextUtils.isEmpty(tL_urlAuthResultRequest2.verified_app_name) ? tL_urlAuthResultRequest2.verified_app_name : LocaleController.getString(R.string.UnverifiedApp);
            } else {
                string = tL_urlAuthResultRequest2.domain;
            }
            final String str3 = string;
            int i4 = Theme.key_dialogTextBlack;
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i4, true);
            textViewMakeTextView.setGravity(17);
            textViewMakeTextView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthTitle, str3), safeLastFragment5.getThemedColor(Theme.key_featuredStickers_addButton)));
            linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i4, false);
            textViewMakeTextView2.setGravity(17);
            if (z7) {
                i2 = R.string.BotAuthAppSubtitle;
            } else {
                i2 = z6 ? R.string.BotAuthBotSubtitle : R.string.BotAuthSiteSubtitle;
            }
            textViewMakeTextView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(i2)));
            linearLayout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                z3 = z7;
                arrayList = arrayList2;
            } else {
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setClipToPadding(false);
                linearLayout2.setClipChildren(false);
                linearLayout2.setOrientation(1);
                linearLayout2.setBackground(Theme.createRoundRectDrawableShadowed(AndroidUtilities.dp(16.0f), safeLastFragment5.getThemedColor(Theme.key_windowBackgroundWhite)));
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest2.browser)) {
                    z3 = z7;
                    arrayList = arrayList2;
                } else {
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.msg2_devices);
                    z3 = z7;
                    imageView2.setColorFilter(new PorterDuffColorFilter(safeLastFragment5.getThemedColor(i4), mode));
                    linearLayout3.addView(imageView2, LayoutHelper.createLinear(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout4 = new LinearLayout(context);
                    linearLayout4.setOrientation(1);
                    linearLayout3.addView(linearLayout4, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    arrayList = arrayList2;
                    TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 16.0f, i4, false);
                    textViewMakeTextView3.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.platform) ? "—" : tL_urlAuthResultRequest2.platform);
                    linearLayout4.addView(textViewMakeTextView3, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView textViewMakeTextView4 = TextHelper.makeTextView(context, 13.0f, Theme.key_windowBackgroundWhiteGrayText, false);
                    textViewMakeTextView4.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.browser) ? "—" : tL_urlAuthResultRequest2.browser);
                    linearLayout4.addView(textViewMakeTextView4, LayoutHelper.createLinear(-1, -2, 55));
                    linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest2.region) && TextUtils.isEmpty(tL_urlAuthResultRequest2.ip)) {
                    z4 = false;
                } else {
                    LinearLayout linearLayout5 = new LinearLayout(context);
                    linearLayout5.setOrientation(0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(R.drawable.msg2_language);
                    imageView3.setColorFilter(new PorterDuffColorFilter(safeLastFragment5.getThemedColor(i4), mode));
                    linearLayout5.addView(imageView3, LayoutHelper.createLinear(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout6 = new LinearLayout(context);
                    linearLayout6.setOrientation(1);
                    linearLayout5.addView(linearLayout6, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView textViewMakeTextView5 = TextHelper.makeTextView(context, 16.0f, i4, false);
                    textViewMakeTextView5.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.region) ? "—" : tL_urlAuthResultRequest2.region);
                    linearLayout6.addView(textViewMakeTextView5, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    z4 = false;
                    TextView textViewMakeTextView6 = TextHelper.makeTextView(context, 13.0f, Theme.key_windowBackgroundWhiteGrayText, false);
                    textViewMakeTextView6.setText(TextUtils.isEmpty(tL_urlAuthResultRequest2.ip) ? "—" : LocaleController.formatString(R.string.BotAuthBasedOnIP, tL_urlAuthResultRequest2.ip));
                    linearLayout6.addView(textViewMakeTextView6, LayoutHelper.createLinear(-1, -2, 55));
                    linearLayout2.addView(linearLayout5, LayoutHelper.createLinear(-1, -2));
                }
                TextView textViewMakeTextView7 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, z4);
                textViewMakeTextView7.setText(LocaleController.getString(R.string.BotAuthInfo));
                linearLayout.addView(textViewMakeTextView7, LayoutHelper.createLinear(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest2.request_write_access) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                int iDp = AndroidUtilities.dp(16.0f);
                int i5 = Theme.key_windowBackgroundWhite;
                frameLayout4.setBackground(Theme.createRoundRectDrawableShadowed(iDp, safeLastFragment5.getThemedColor(i5)));
                final TextCheckCell textCheckCell2 = new TextCheckCell(context, safeLastFragment5.getResourceProvider());
                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.BotAuthAllowMessages), true, false);
                textCheckCell2.setBackground(Theme.createRadSelectorDrawable(safeLastFragment5.getThemedColor(i5), safeLastFragment5.getThemedColor(Theme.key_listSelector), 16, 16));
                textCheckCell2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        OAuthSheet.lambda$handle$2(textCheckCell2, view);
                    }
                });
                frameLayout4.addView(textCheckCell2, LayoutHelper.createFrame(-1, -1, 119));
                linearLayout.addView(frameLayout4, LayoutHelper.createLinear(-1, -2, 7, 9, -3, 9, -3));
                TextView textViewMakeTextView8 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false);
                textViewMakeTextView8.setText(LocaleController.formatString(R.string.BotAuthAllowMessagesInfo, UserObject.getUserName(tL_urlAuthResultRequest2.bot)));
                linearLayout.addView(textViewMakeTextView8, LayoutHelper.createLinear(-1, -2, 55, 22, 6, 22, 20));
                textCheckCell = textCheckCell2;
            } else {
                textCheckCell = null;
            }
            LinearLayout linearLayout7 = new LinearLayout(context);
            linearLayout7.setOrientation(0);
            final ButtonWithCounterView round = new ButtonWithCounterView(context, safeLastFragment5.getResourceProvider()).setRound();
            round.setColor(safeLastFragment5.getThemedColor(Theme.key_text_RedRegular));
            round.setText(LocaleController.getString(R.string.Decline));
            linearLayout7.addView(round, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            final ButtonWithCounterView round2 = new ButtonWithCounterView(context, safeLastFragment5.getResourceProvider()).setRound();
            round2.setText(LocaleController.getString(R.string.BotAuthLogin));
            linearLayout7.addView(round2, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            linearLayout.addView(linearLayout7, LayoutHelper.createLinear(-1, -2, 7, 12, 12, 12, 8));
            final BottomSheet bottomSheetCreate = builder.create();
            bottomSheetCreate.setBackgroundColor(safeLastFragment5.getThemedColor(Theme.key_windowBackgroundGray));
            final String[] strArr = {str2};
            final boolean z8 = z3;
            final ArrayList arrayList3 = arrayList;
            final TextCheckCell textCheckCell3 = textCheckCell;
            final Utilities.Callback callback = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    OAuthSheet.lambda$handle$4(iArr, tL_messages_requestUrlAuth, bottomSheetCreate, z, str, urlAuthResult2, strArr, z2, botWebViewContainer, str3, resourceProvider, (Integer) obj);
                }
            };
            if (tL_urlAuthResultRequest2.user_id_hint != 0 && UserConfig.getInstance(i).getClientUserId() != tL_urlAuthResultRequest2.user_id_hint) {
                Iterator it = arrayList3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) it.next();
                    if (UserConfig.getInstance(num.intValue()).getClientUserId() == tL_urlAuthResultRequest2.user_id_hint) {
                        callback.run(num);
                        break;
                    }
                }
            }
            frameLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    OAuthSheet.lambda$handle$6(bottomSheetCreate, frameLayout3, arrayList3, iArr, callback, view);
                }
            });
            final boolean[] zArr = new boolean[1];
            round.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    OAuthSheet.lambda$handle$8(tL_messages_requestUrlAuth, zArr, bottomSheetCreate, round, botWebViewContainer, i, view);
                }
            });
            final boolean[] zArr2 = new boolean[1];
            final BottomSheet[] bottomSheetArr = new BottomSheet[1];
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    OAuthSheet.lambda$handle$10(round2, round, tL_messages_requestUrlAuth, strArr, textCheckCell3, zArr2, iArr, zArr, bottomSheetCreate, str3, resourceProvider, z, str, tL_urlAuthResultRequest2, botWebViewContainer);
                }
            };
            final Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    OAuthSheet.lambda$handle$13(tL_urlAuthResultRequest2, strArr, context, i, runnable, safeLastFragment5);
                }
            };
            final boolean z9 = z6;
            round2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    OAuthSheet.lambda$handle$16(round2, round, tL_urlAuthResultRequest2, iArr, context, safeLastFragment5, z9, z8, str3, zArr2, runnable2, view);
                }
            });
            bottomSheetCreate.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    OAuthSheet.lambda$handle$17(bottomSheetArr, dialogInterface);
                }
            });
            BottomSheet bottomSheet = showing;
            if (bottomSheet != null) {
                bottomSheet.lambda$new$0();
                showing = null;
            }
            if (!tL_urlAuthResultRequest2.match_codes_first || tL_urlAuthResultRequest2.match_codes.isEmpty() || !TextUtils.isEmpty(strArr[0])) {
                showing = bottomSheetCreate;
                bottomSheetCreate.show();
            } else {
                showing = showMatchCodeSheet(context, i, tL_urlAuthResultRequest2.match_codes, str3, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        OAuthSheet.lambda$handle$19(context, strArr, tL_messages_requestUrlAuth, i, bottomSheetCreate, str3, resourceProvider, (String) obj);
                    }
                }, false, new Runnable() {
                    @Override
                    public final void run() {
                        OAuthSheet.lambda$handle$20(zArr, botWebViewContainer, tL_messages_requestUrlAuth, i);
                    }
                }, safeLastFragment5.getResourceProvider());
            }
        }
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

    public static void lambda$handle$2(TextCheckCell textCheckCell, View view) {
        textCheckCell.setChecked(!textCheckCell.isChecked());
    }

    public static void lambda$handle$4(int[] iArr, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, final BottomSheet bottomSheet, final boolean z, final String str, final TLRPC.UrlAuthResult urlAuthResult, final String[] strArr, final boolean z2, final BotWebViewContainer botWebViewContainer, final String str2, final Theme.ResourcesProvider resourcesProvider, final Integer num) {
        if (iArr[0] == num.intValue()) {
            return;
        }
        final AlertDialog alertDialog = new AlertDialog(ApplicationLoader.applicationContext, 3);
        alertDialog.showDelayed(200L);
        ConnectionsManager.getInstance(num.intValue()).sendRequestTyped(tL_messages_requestUrlAuth, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                OAuthSheet.lambda$handle$3(alertDialog, bottomSheet, z, num, tL_messages_requestUrlAuth, str, urlAuthResult, strArr, z2, botWebViewContainer, str2, resourcesProvider, (TLRPC.UrlAuthResult) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void lambda$handle$3(AlertDialog alertDialog, BottomSheet bottomSheet, boolean z, Integer num, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.UrlAuthResult urlAuthResult, String[] strArr, boolean z2, BotWebViewContainer botWebViewContainer, String str2, Theme.ResourcesProvider resourcesProvider, TLRPC.UrlAuthResult urlAuthResult2, TLRPC.TL_error tL_error) {
        alertDialog.dismiss();
        if (urlAuthResult2 != null) {
            bottomSheet.lambda$new$0();
            handle(z, num.intValue(), tL_messages_requestUrlAuth, urlAuthResult2, str, urlAuthResult, strArr[0], z2, botWebViewContainer);
        } else if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                bottomSheet.lambda$new$0();
                getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str2) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str2), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider))).show();
            } else {
                BulletinFactory.of(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError(tL_error);
            }
        }
    }

    public static void lambda$handle$6(BottomSheet bottomSheet, FrameLayout frameLayout, ArrayList arrayList, int[] iArr, final Utilities.Callback callback, View view) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(bottomSheet.container, bottomSheet.getResourcesProvider(), frameLayout);
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                final int iIntValue = ((Integer) it.next()).intValue();
                if (UserConfig.getInstance(iIntValue).getCurrentUser() != null) {
                    itemOptionsMakeOptions.addAccount(iIntValue, iArr[0] == iIntValue, new Runnable() {
                        @Override
                        public final void run() {
                            OAuthSheet.lambda$handle$5(callback, iIntValue);
                        }
                    });
                }
            } else {
                itemOptionsMakeOptions.setDrawScrim(false).setOnTopOfScrim().setDimAlpha(0).setGravity(3).translate(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f)).show();
                return;
            }
        }
    }

    public static void lambda$handle$5(Utilities.Callback callback, int i) {
        callback.run(Integer.valueOf(i));
    }

    public static void lambda$handle$8(TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, final boolean[] zArr, final BottomSheet bottomSheet, ButtonWithCounterView buttonWithCounterView, BotWebViewContainer botWebViewContainer, int i, View view) {
        if (tL_messages_requestUrlAuth == null || TextUtils.isEmpty(tL_messages_requestUrlAuth.url)) {
            zArr[0] = true;
            bottomSheet.lambda$new$0();
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
            ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_declineUrlAuth, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    OAuthSheet.lambda$handle$7(zArr, bottomSheet, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
    }

    public static void lambda$handle$7(boolean[] zArr, BottomSheet bottomSheet, TLRPC.Bool bool, TLRPC.TL_error tL_error) {
        zArr[0] = true;
        bottomSheet.lambda$new$0();
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
        ConnectionsManager.getInstance(iArr[0]).sendRequestTyped(tL_messages_acceptUrlAuth, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                OAuthSheet.lambda$handle$9(zArr2, bottomSheet, str, resourcesProvider, z, iArr, tL_messages_requestUrlAuth, str2, tL_urlAuthResultRequest, tL_messages_acceptUrlAuth, botWebViewContainer, (TLRPC.UrlAuthResult) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void lambda$handle$9(boolean[] zArr, BottomSheet bottomSheet, String str, Theme.ResourcesProvider resourcesProvider, boolean z, int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth, BotWebViewContainer botWebViewContainer, TLRPC.UrlAuthResult urlAuthResult, TLRPC.TL_error tL_error) {
        zArr[0] = true;
        bottomSheet.lambda$new$0();
        if (tL_error != null) {
            if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider))).show();
                return;
            } else {
                getBulletinFactory().showForError(tL_error);
                return;
            }
        }
        handle(z, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str2, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, botWebViewContainer);
    }

    public static void lambda$handle$13(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final String[] strArr, Context context, int i, final Runnable runnable, BaseFragment baseFragment) {
        if (!tL_urlAuthResultRequest.match_codes.isEmpty() && TextUtils.isEmpty(strArr[0])) {
            showMatchCodeSheet(context, i, tL_urlAuthResultRequest.match_codes, tL_urlAuthResultRequest.domain, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    OAuthSheet.lambda$handle$11(strArr, runnable, (String) obj);
                }
            }, true, new Runnable() {
                @Override
                public final void run() {
                    OAuthSheet.lambda$handle$12();
                }
            }, baseFragment.getResourceProvider());
        } else {
            runnable.run();
        }
    }

    public static void lambda$handle$11(String[] strArr, Runnable runnable, String str) {
        strArr[0] = str;
        runnable.run();
    }

    public static void lambda$handle$16(ButtonWithCounterView buttonWithCounterView, ButtonWithCounterView buttonWithCounterView2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, int[] iArr, Context context, BaseFragment baseFragment, boolean z, boolean z2, String str, final boolean[] zArr, final Runnable runnable, View view) {
        if (buttonWithCounterView.isLoading() || buttonWithCounterView2.isLoading()) {
            return;
        }
        if (tL_urlAuthResultRequest.request_phone_number) {
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            AlertDialog.Builder title = new AlertDialog.Builder(context, baseFragment.getResourceProvider()).setTitle(LocaleController.getString(R.string.BotAuthPhoneNumber));
            int i = R.string.BotAuthPhoneNumberText;
            if (z && !z2) {
                str = UserObject.getUserName(tL_urlAuthResultRequest.bot);
            }
            title.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i, str, PhoneFormat.getInstance().format("+" + currentUser.phone).replaceAll(" ", " ")))).setNegativeButton(LocaleController.getString(R.string.BotAuthPhoneNumberDeny), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    OAuthSheet.lambda$handle$14(zArr, runnable, alertDialog, i2);
                }
            }).setPositiveButton(LocaleController.getString(R.string.BotAuthPhoneNumberAccept), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    OAuthSheet.lambda$handle$15(zArr, runnable, alertDialog, i2);
                }
            }).makeRed(-2).show();
            return;
        }
        runnable.run();
    }

    public static void lambda$handle$14(boolean[] zArr, Runnable runnable, AlertDialog alertDialog, int i) {
        zArr[0] = false;
        runnable.run();
    }

    public static void lambda$handle$15(boolean[] zArr, Runnable runnable, AlertDialog alertDialog, int i) {
        zArr[0] = true;
        runnable.run();
    }

    public static void lambda$handle$17(BottomSheet[] bottomSheetArr, DialogInterface dialogInterface) {
        showing = null;
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$new$0();
            bottomSheetArr[0] = null;
        }
    }

    public static void lambda$handle$19(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i, final BottomSheet bottomSheet, final String str, final Theme.ResourcesProvider resourcesProvider, String str2) {
        final AlertDialog alertDialog = new AlertDialog(context, 3);
        alertDialog.showDelayed(200L);
        TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
        strArr[0] = str2;
        tL_messages_checkUrlAuthMatchCode.match_code = str2;
        tL_messages_checkUrlAuthMatchCode.url = tL_messages_requestUrlAuth.url;
        ConnectionsManager.getInstance(i).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                OAuthSheet.lambda$handle$18(alertDialog, bottomSheet, str, resourcesProvider, (TLRPC.Bool) obj, (TLRPC.TL_error) obj2);
            }
        });
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
            bottomSheet2.lambda$new$0();
            showing = null;
        }
        getBulletinFactory().createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider))).show();
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

    public static BottomSheet showMatchCodeSheet(Context context, int i, final ArrayList arrayList, String str, final Utilities.Callback callback, boolean z, final Runnable runnable, final Theme.ResourcesProvider resourcesProvider) {
        int i2;
        Drawable drawable;
        final BottomSheet[] bottomSheetArr = new BottomSheet[1];
        BottomSheet.Builder builder = new BottomSheet.Builder(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        builder.setCustomView(linearLayout);
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
        if (ConnectionsManager.getInstance(i).isTestBackend()) {
            i2 = 0;
            while (i2 < 4) {
                if (UserConfig.getInstance(i2).isClientActivated() && !ConnectionsManager.getInstance(i2).isTestBackend()) {
                    break;
                }
                i2++;
            }
            i2 = i;
        } else {
            i2 = i;
        }
        final BackupImageView[] backupImageViewArr = new BackupImageView[arrayList.size()];
        int i3 = 0;
        boolean z2 = true;
        BottomSheet.Builder builder2 = builder;
        while (i3 < arrayList.size()) {
            final String str2 = (String) arrayList.get(i3);
            FrameLayout frameLayout = new FrameLayout(context);
            BottomSheet.Builder builder3 = builder2;
            frameLayout.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(70.0f), Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), 0.05f)));
            Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str2);
            if (emojiBigDrawable == null) {
                final Text text = new Text(str2, 30.0f, AndroidUtilities.bold());
                drawable = new Drawable() {
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

                    @Override
                    public void draw(Canvas canvas) {
                        text.draw(canvas, getBounds().centerX() - (text.getCurrentWidth() / 2.0f), getBounds().centerY(), Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider), 1.0f);
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
            frameLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    OAuthSheet.lambda$showMatchCodeSheet$21(bottomSheetArr, callback, str2, view);
                }
            });
            i3++;
            builder2 = builder3;
        }
        BottomSheet.Builder builder4 = builder2;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName.short_name = "RestrictedEmoji";
        MediaDataController.getInstance(i2).getStickerSet(tL_inputStickerSetShortName, null, false, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                OAuthSheet.lambda$showMatchCodeSheet$22(arrayList, backupImageViewArr, (TLRPC.TL_messages_stickerSet) obj);
            }
        });
        textView.setText(LocaleController.getString(z2 ? R.string.BotAuthSelectEmoji : R.string.BotAuthSelectCode));
        TextView textView2 = new TextView(context);
        textView2.setGravity(17);
        textView2.setTextSize(1, 12.0f);
        textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        textView2.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthLoginRequestFrom, str), Theme.getColor(Theme.key_featuredStickers_addButton)));
        linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 0, 23, 0, 11));
        final ButtonWithCounterView round = new ButtonWithCounterView(context, resourcesProvider).setRound();
        if (z) {
            round.setNeutral();
            round.setText(LocaleController.getString(R.string.Cancel));
        } else {
            round.setColor(Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
            round.setText(LocaleController.getString(R.string.Decline));
        }
        linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 7, 12, 12, 12, 12));
        round.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                OAuthSheet.lambda$showMatchCodeSheet$23(round, bottomSheetArr, runnable, view);
            }
        });
        BottomSheet bottomSheetShow = builder4.show();
        bottomSheetArr[0] = bottomSheetShow;
        return bottomSheetShow;
    }

    public static void lambda$showMatchCodeSheet$21(BottomSheet[] bottomSheetArr, Utilities.Callback callback, String str, View view) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$new$0();
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
                if (i2 >= tL_messages_stickerSet.packs.size()) {
                    break;
                }
                if (tL_messages_stickerSet.packs.get(i2).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i2).emoticon, str)) {
                    i2++;
                } else {
                    long jLongValue = tL_messages_stickerSet.packs.get(i2).documents.get(0).longValue();
                    for (int i3 = 0; i3 < tL_messages_stickerSet.documents.size(); i3++) {
                        if (tL_messages_stickerSet.documents.get(i3).id == jLongValue) {
                            document = tL_messages_stickerSet.documents.get(i3);
                            break;
                        }
                    }
                }
            }
            document = null;
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
        bottomSheet.lambda$new$0();
        bottomSheetArr[0] = null;
        runnable.run();
    }

    public static BulletinFactory getBulletinFactory() {
        Context parentActivity;
        Context parentActivity2;
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!BotWebViewSheet.activeSheets.isEmpty()) {
            Iterator it = BotWebViewSheet.activeSheets.iterator();
            BotWebViewSheet botWebViewSheet = null;
            while (it.hasNext()) {
                BotWebViewSheet botWebViewSheet2 = (BotWebViewSheet) it.next();
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
            Iterator it2 = ArticleViewer.activeSheets.iterator();
            ArticleViewer articleViewer = null;
            while (it2.hasNext()) {
                ArticleViewer articleViewer2 = (ArticleViewer) it2.next();
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
        if (safeLastFragment != null && safeLastFragment.getLastSheet() != null && safeLastFragment.getLastSheet().getBulletinFactory() != null) {
            return safeLastFragment.getLastSheet().getBulletinFactory();
        }
        return BulletinFactory.of(safeLastFragment);
    }
}

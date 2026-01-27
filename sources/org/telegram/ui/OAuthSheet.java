package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.LocaleController;
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
import org.telegram.ui.Components.TextHelper;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotWebViewSheet;

public abstract class OAuthSheet {
    public static void handle(boolean z, int i, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult) {
        handle(z, i, tL_messages_requestUrlAuth, urlAuthResult, null, null);
    }

    public static void handle(final boolean z, int i, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TLRPC.UrlAuthResult urlAuthResult, final String str, TLRPC.UrlAuthResult urlAuthResult2) {
        final Context context;
        BackupImageView backupImageView;
        ArrayList arrayList;
        FrameLayout frameLayout;
        boolean z2;
        TextCheckCell textCheckCell;
        BaseFragment safeLastFragment;
        BaseFragment safeLastFragment2;
        final Context context2;
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultAccepted) {
            TLRPC.TL_urlAuthResultAccepted tL_urlAuthResultAccepted = (TLRPC.TL_urlAuthResultAccepted) urlAuthResult;
            if (TextUtils.isEmpty(tL_urlAuthResultAccepted.url)) {
                String str2 = urlAuthResult2 instanceof TLRPC.TL_urlAuthResultRequest ? ((TLRPC.TL_urlAuthResultRequest) urlAuthResult2).domain : null;
                if (!TextUtils.isEmpty(str2)) {
                    getBulletinFactory().createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthLoggedInSuccess, str2), Theme.getColor(Theme.key_featuredStickers_addButton))).show();
                }
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
            BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment3 == null) {
                return;
            }
            Browser.openUrlInSystemBrowser(safeLastFragment3.getContext(), tL_urlAuthResultAccepted.url);
            return;
        }
        if (urlAuthResult instanceof TLRPC.TL_urlAuthResultDefault) {
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
            final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = (TLRPC.TL_urlAuthResultRequest) urlAuthResult;
            final BaseFragment safeLastFragment5 = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment5 == null || (context = safeLastFragment5.getContext()) == null) {
                return;
            }
            BottomSheet.Builder builder = new BottomSheet.Builder(context, false, safeLastFragment5.getResourceProvider());
            FrameLayout frameLayout2 = new FrameLayout(context);
            builder.setCustomView(frameLayout2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.clear();
            for (int i2 = 0; i2 < 4; i2++) {
                if (UserConfig.getInstance(i2).isClientActivated()) {
                    arrayList2.add(Integer.valueOf(i2));
                }
            }
            Collections.sort(arrayList2, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return OAuthSheet.lambda$handle$1((Integer) obj, (Integer) obj2);
                }
            });
            boolean z3 = tL_messages_requestUrlAuth.peer != null;
            FrameLayout frameLayout3 = new FrameLayout(context);
            final FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(14.0f), safeLastFragment5.getThemedColor(Theme.key_dialogBackgroundGray)));
            BackupImageView backupImageView2 = new BackupImageView(context);
            backupImageView2.setRoundRadius(AndroidUtilities.dp(14.0f));
            backupImageView2.getImageReceiver().setCrossfadeWithOldImage(true);
            final AvatarDrawable avatarDrawable = new AvatarDrawable();
            final int[] iArr = {i};
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            avatarDrawable.setInfo(currentUser);
            backupImageView2.setForUserOrChat(currentUser, avatarDrawable);
            frameLayout4.addView(backupImageView2, LayoutHelper.createFrame(28, 28, 115));
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
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            frameLayout2.addView(linearLayout, LayoutHelper.createFrame(-1, -1, 119));
            BackupImageView backupImageView3 = new BackupImageView(context);
            backupImageView3.setRoundRadius(AndroidUtilities.dp(40.0f));
            AvatarDrawable avatarDrawable2 = new AvatarDrawable();
            avatarDrawable2.setInfo(tL_urlAuthResultRequest.bot);
            backupImageView3.setForUserOrChat(tL_urlAuthResultRequest.bot, avatarDrawable2);
            linearLayout.addView(backupImageView3, LayoutHelper.createLinear(80, 80, 49, 0, 21, 0, 16));
            int i3 = Theme.key_dialogTextBlack;
            TextView textViewMakeTextView = TextHelper.makeTextView(context, 20.0f, i3, true);
            textViewMakeTextView.setGravity(17);
            textViewMakeTextView.setText(AndroidUtilities.replaceSingleLink(LocaleController.formatString(R.string.BotAuthTitle, tL_urlAuthResultRequest.domain), safeLastFragment5.getThemedColor(Theme.key_featuredStickers_addButton)));
            linearLayout.addView(textViewMakeTextView, LayoutHelper.createLinear(-1, -2, 49, 32.0f, 0.0f, 32.0f, 9.66f));
            TextView textViewMakeTextView2 = TextHelper.makeTextView(context, 14.0f, i3, false);
            textViewMakeTextView2.setGravity(17);
            textViewMakeTextView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(z3 ? R.string.BotAuthBotSubtitle : R.string.BotAuthSiteSubtitle)));
            linearLayout.addView(textViewMakeTextView2, LayoutHelper.createLinear(-1, -2, 49, 32, 0, 32, 24));
            if (TextUtils.isEmpty(tL_urlAuthResultRequest.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest.browser) && TextUtils.isEmpty(tL_urlAuthResultRequest.region) && TextUtils.isEmpty(tL_urlAuthResultRequest.ip)) {
                arrayList = arrayList2;
                frameLayout = frameLayout3;
                backupImageView = backupImageView2;
            } else {
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setClipToPadding(false);
                linearLayout2.setClipChildren(false);
                linearLayout2.setOrientation(1);
                linearLayout2.setBackground(Theme.createRoundRectDrawableShadowed(AndroidUtilities.dp(16.0f), safeLastFragment5.getThemedColor(Theme.key_windowBackgroundWhite)));
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 55, 9, -3, 9, -3));
                if (TextUtils.isEmpty(tL_urlAuthResultRequest.platform) && TextUtils.isEmpty(tL_urlAuthResultRequest.browser)) {
                    arrayList = arrayList2;
                    frameLayout = frameLayout3;
                    backupImageView = backupImageView2;
                } else {
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    linearLayout3.setOrientation(0);
                    ImageView imageView2 = new ImageView(context);
                    imageView2.setImageResource(R.drawable.msg2_devices);
                    imageView2.setColorFilter(new PorterDuffColorFilter(safeLastFragment5.getThemedColor(i3), mode));
                    linearLayout3.addView(imageView2, LayoutHelper.createLinear(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout4 = new LinearLayout(context);
                    linearLayout4.setOrientation(1);
                    linearLayout3.addView(linearLayout4, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    backupImageView = backupImageView2;
                    TextView textViewMakeTextView3 = TextHelper.makeTextView(context, 16.0f, i3, false);
                    textViewMakeTextView3.setText(TextUtils.isEmpty(tL_urlAuthResultRequest.platform) ? "—" : tL_urlAuthResultRequest.platform);
                    linearLayout4.addView(textViewMakeTextView3, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    TextView textViewMakeTextView4 = TextHelper.makeTextView(context, 13.0f, Theme.key_windowBackgroundWhiteGrayText, false);
                    textViewMakeTextView4.setText(TextUtils.isEmpty(tL_urlAuthResultRequest.browser) ? "—" : tL_urlAuthResultRequest.browser);
                    arrayList = arrayList2;
                    frameLayout = frameLayout3;
                    linearLayout4.addView(textViewMakeTextView4, LayoutHelper.createLinear(-1, -2, 55));
                    linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-1, -2));
                }
                if (TextUtils.isEmpty(tL_urlAuthResultRequest.region) && TextUtils.isEmpty(tL_urlAuthResultRequest.ip)) {
                    z2 = false;
                } else {
                    LinearLayout linearLayout5 = new LinearLayout(context);
                    linearLayout5.setOrientation(0);
                    ImageView imageView3 = new ImageView(context);
                    imageView3.setImageResource(R.drawable.msg2_language);
                    imageView3.setColorFilter(new PorterDuffColorFilter(safeLastFragment5.getThemedColor(i3), mode));
                    linearLayout5.addView(imageView3, LayoutHelper.createLinear(24, 24, 19, 17, 0, 20, 0));
                    LinearLayout linearLayout6 = new LinearLayout(context);
                    linearLayout6.setOrientation(1);
                    linearLayout5.addView(linearLayout6, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 10.66f, 20.0f, 11.0f));
                    TextView textViewMakeTextView5 = TextHelper.makeTextView(context, 16.0f, i3, false);
                    textViewMakeTextView5.setText(TextUtils.isEmpty(tL_urlAuthResultRequest.region) ? "—" : tL_urlAuthResultRequest.region);
                    linearLayout6.addView(textViewMakeTextView5, LayoutHelper.createLinear(-1, -2, 55, 0.0f, 0.0f, 0.0f, 4.33f));
                    z2 = false;
                    TextView textViewMakeTextView6 = TextHelper.makeTextView(context, 13.0f, Theme.key_windowBackgroundWhiteGrayText, false);
                    textViewMakeTextView6.setText(TextUtils.isEmpty(tL_urlAuthResultRequest.ip) ? "—" : LocaleController.formatString(R.string.BotAuthBasedOnIP, tL_urlAuthResultRequest.ip));
                    linearLayout6.addView(textViewMakeTextView6, LayoutHelper.createLinear(-1, -2, 55));
                    linearLayout2.addView(linearLayout5, LayoutHelper.createLinear(-1, -2));
                }
                TextView textViewMakeTextView7 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, z2);
                textViewMakeTextView7.setText(LocaleController.getString(R.string.BotAuthInfo));
                linearLayout.addView(textViewMakeTextView7, LayoutHelper.createLinear(-1, -2, 55, 22, 5, 22, 20));
            }
            if (tL_urlAuthResultRequest.request_write_access) {
                FrameLayout frameLayout5 = new FrameLayout(context);
                int iDp = AndroidUtilities.dp(16.0f);
                int i4 = Theme.key_windowBackgroundWhite;
                frameLayout5.setBackground(Theme.createRoundRectDrawableShadowed(iDp, safeLastFragment5.getThemedColor(i4)));
                final TextCheckCell textCheckCell2 = new TextCheckCell(context, safeLastFragment5.getResourceProvider());
                textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.BotAuthAllowMessages), true, false);
                textCheckCell2.setBackground(Theme.createRadSelectorDrawable(safeLastFragment5.getThemedColor(i4), safeLastFragment5.getThemedColor(Theme.key_listSelector), 16, 16));
                textCheckCell2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        OAuthSheet.lambda$handle$2(textCheckCell2, view);
                    }
                });
                frameLayout5.addView(textCheckCell2, LayoutHelper.createFrame(-1, -1, 119));
                linearLayout.addView(frameLayout5, LayoutHelper.createLinear(-1, -2, 7, 9, -3, 9, -3));
                TextView textViewMakeTextView8 = TextHelper.makeTextView(context, 14.0f, Theme.key_windowBackgroundWhiteGrayText, false);
                textViewMakeTextView8.setText(LocaleController.formatString(R.string.BotAuthAllowMessagesInfo, UserObject.getUserName(tL_urlAuthResultRequest.bot)));
                linearLayout.addView(textViewMakeTextView8, LayoutHelper.createLinear(-1, -2, 55, 22, 6, 22, 20));
                textCheckCell = textCheckCell2;
            } else {
                textCheckCell = null;
            }
            LinearLayout linearLayout7 = new LinearLayout(context);
            linearLayout7.setOrientation(0);
            ButtonWithCounterView neutral = new ButtonWithCounterView(context, safeLastFragment5.getResourceProvider()).setRound().setNeutral();
            neutral.setText(LocaleController.getString(R.string.Cancel));
            linearLayout7.addView(neutral, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 0, 0, 5, 0));
            final ButtonWithCounterView round = new ButtonWithCounterView(context, safeLastFragment5.getResourceProvider()).setRound();
            round.setText(LocaleController.getString(R.string.BotAuthLogin));
            linearLayout7.addView(round, LayoutHelper.createLinear(-1, 48, 1.0f, 119, 5, 0, 0, 0));
            linearLayout.addView(linearLayout7, LayoutHelper.createLinear(-1, -2, 7, 12, 12, 12, 8));
            final BottomSheet bottomSheetCreate = builder.create();
            bottomSheetCreate.setBackgroundColor(safeLastFragment5.getThemedColor(Theme.key_windowBackgroundGray));
            bottomSheetCreate.show();
            final BackupImageView backupImageView4 = backupImageView;
            final ArrayList arrayList3 = arrayList;
            frameLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    OAuthSheet.lambda$handle$4(bottomSheetCreate, frameLayout4, arrayList3, iArr, avatarDrawable, backupImageView4, view);
                }
            });
            neutral.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    bottomSheetCreate.lambda$new$0();
                }
            });
            final boolean[] zArr = new boolean[1];
            final TextCheckCell textCheckCell3 = textCheckCell;
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    OAuthSheet.lambda$handle$7(round, tL_messages_requestUrlAuth, textCheckCell3, zArr, iArr, bottomSheetCreate, z, str, tL_urlAuthResultRequest);
                }
            };
            final boolean z4 = z3;
            round.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    OAuthSheet.lambda$handle$10(tL_urlAuthResultRequest, iArr, context, safeLastFragment5, z4, zArr, runnable, view);
                }
            });
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

    public static void lambda$handle$4(BottomSheet bottomSheet, FrameLayout frameLayout, ArrayList arrayList, final int[] iArr, final AvatarDrawable avatarDrawable, final BackupImageView backupImageView, View view) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(bottomSheet.container, bottomSheet.getResourcesProvider(), frameLayout);
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                final int iIntValue = ((Integer) it.next()).intValue();
                final TLRPC.User currentUser = UserConfig.getInstance(iIntValue).getCurrentUser();
                if (currentUser != null) {
                    itemOptionsMakeOptions.addAccount(iIntValue, iArr[0] == iIntValue, new Runnable() {
                        @Override
                        public final void run() {
                            OAuthSheet.lambda$handle$3(iArr, iIntValue, avatarDrawable, currentUser, backupImageView);
                        }
                    });
                }
            } else {
                itemOptionsMakeOptions.setDrawScrim(false).setOnTopOfScrim().setDimAlpha(0).setGravity(3).translate(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f)).show();
                return;
            }
        }
    }

    public static void lambda$handle$3(int[] iArr, int i, AvatarDrawable avatarDrawable, TLRPC.User user, BackupImageView backupImageView) {
        iArr[0] = i;
        avatarDrawable.setInfo(user);
        backupImageView.setForUserOrChat(user, avatarDrawable);
    }

    public static void lambda$handle$7(ButtonWithCounterView buttonWithCounterView, final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, TextCheckCell textCheckCell, boolean[] zArr, final int[] iArr, final BottomSheet bottomSheet, final boolean z, final String str, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest) {
        if (buttonWithCounterView.isLoading()) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
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
        tL_messages_acceptUrlAuth.write_allowed = textCheckCell != null && textCheckCell.isChecked();
        tL_messages_acceptUrlAuth.share_phone_number = zArr[0];
        ConnectionsManager.getInstance(iArr[0]).sendRequestTyped(tL_messages_acceptUrlAuth, new BotForumHelper$$ExternalSyntheticLambda2(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                OAuthSheet.lambda$handle$6(bottomSheet, z, iArr, tL_messages_requestUrlAuth, str, tL_urlAuthResultRequest, (TLRPC.UrlAuthResult) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void lambda$handle$6(BottomSheet bottomSheet, boolean z, int[] iArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, TLRPC.UrlAuthResult urlAuthResult, TLRPC.TL_error tL_error) {
        bottomSheet.lambda$new$0();
        if (tL_error != null) {
            BulletinFactory.of(bottomSheet.topBulletinContainer, bottomSheet.getResourcesProvider()).showForError(tL_error);
        } else {
            handle(z, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str, tL_urlAuthResultRequest);
        }
    }

    public static void lambda$handle$10(TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, int[] iArr, Context context, BaseFragment baseFragment, boolean z, final boolean[] zArr, final Runnable runnable, View view) {
        if (tL_urlAuthResultRequest.request_phone_number) {
            TLRPC.User currentUser = UserConfig.getInstance(iArr[0]).getCurrentUser();
            AlertDialog.Builder title = new AlertDialog.Builder(context, baseFragment.getResourceProvider()).setTitle(LocaleController.getString(R.string.BotAuthPhoneNumber));
            int i = R.string.BotAuthPhoneNumberText;
            String userName = z ? UserObject.getUserName(tL_urlAuthResultRequest.bot) : tL_urlAuthResultRequest.domain;
            title.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(i, userName, PhoneFormat.getInstance().format("+" + currentUser.phone).replaceAll(" ", " ")))).setNegativeButton(LocaleController.getString(R.string.BotAuthPhoneNumberDeny), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    OAuthSheet.lambda$handle$8(zArr, runnable, alertDialog, i2);
                }
            }).setPositiveButton(LocaleController.getString(R.string.BotAuthPhoneNumberAccept), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    OAuthSheet.lambda$handle$9(zArr, runnable, alertDialog, i2);
                }
            }).makeRed(-2).show();
            return;
        }
        runnable.run();
    }

    public static void lambda$handle$8(boolean[] zArr, Runnable runnable, AlertDialog alertDialog, int i) {
        zArr[0] = false;
        runnable.run();
    }

    public static void lambda$handle$9(boolean[] zArr, Runnable runnable, AlertDialog alertDialog, int i) {
        zArr[0] = true;
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

package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.clearcut.zze;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.wearable.internal.zzfp;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.community.sheet.CommunityInviteOnlySheet;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.web.AddressBarList;
import org.telegram.ui.web.MHTML;

public final class VoIPFragment$$ExternalSyntheticLambda28 implements View.OnClickListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public VoIPFragment$$ExternalSyntheticLambda28(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onClick(View view) {
        MHTML mhtml;
        int i = 25;
        int i2 = 0;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                VoIPFragment voIPFragment = (VoIPFragment) obj2;
                UserSelectorBottomSheet userSelectorBottomSheet = voIPFragment.addPeopleSheet;
                if (userSelectorBottomSheet != null) {
                    userSelectorBottomSheet.lambda$showGiftOfferSheet$15();
                    voIPFragment.addPeopleSheet = null;
                }
                UserSelectorBottomSheet userSelectorBottomSheet2 = new UserSelectorBottomSheet((Activity) obj, voIPFragment.currentAccount, null, 4, new ShareAlert.AnonymousClass3());
                TLRPC.User user = voIPFragment.currentUser;
                long j = user != null ? user.id : 0L;
                TLRPC.User user2 = voIPFragment.callingUser;
                long[] jArr = {j, user2 != null ? user2.id : 0L};
                for (int i3 = 0; i3 < 2; i3++) {
                    userSelectorBottomSheet2.excludeUserIds.add(Long.valueOf(jArr[i3]));
                }
                userSelectorBottomSheet2.updateItems(false, true);
                userSelectorBottomSheet2.onUsersSelectedListener = new VoIPFragment$$ExternalSyntheticLambda36(i2);
                voIPFragment.addPeopleSheet = userSelectorBottomSheet2;
                userSelectorBottomSheet2.show();
                break;
            case 1:
                SuggestClearDatabaseBottomSheet suggestClearDatabaseBottomSheet = (SuggestClearDatabaseBottomSheet) obj2;
                suggestClearDatabaseBottomSheet.getClass();
                DialogsActivity dialogsActivity = (DialogsActivity) obj;
                AlertDialog.Builder builder = new AlertDialog.Builder(dialogsActivity.getParentActivity(), 0, null);
                String string = LocaleController.getString(R.string.LocalDatabaseClearTextTitle);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.getString(R.string.LocalDatabaseClearText);
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                builder.setPositiveButton(LocaleController.getString(R.string.CacheClear), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(i, suggestClearDatabaseBottomSheet, dialogsActivity));
                dialogsActivity.showDialog(alertDialog);
                TextView textView = (TextView) alertDialog.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                }
                break;
            case 2:
                ThemeSetUrlActivity themeSetUrlActivity = (ThemeSetUrlActivity) obj2;
                if (themeSetUrlActivity.getParentActivity() != null) {
                    BottomSheet.Builder builder2 = new BottomSheet.Builder(themeSetUrlActivity.getParentActivity(), null);
                    BottomSheet bottomSheet = builder2.bottomSheet;
                    bottomSheet.applyBottomPadding = false;
                    Context context = (Context) obj;
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView2 = new TextView(context);
                    textView2.setText(LocaleController.getString(R.string.ChooseTheme));
                    FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(20.0f, Theme.getColor(null, Theme.key_dialogTextBlack, false), 1, textView2);
                    linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 51, 22, 12, 22, 4));
                    textView2.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
                    bottomSheet.customView = linearLayout;
                    ArrayList arrayList = new ArrayList();
                    int size = Theme.themes.size();
                    while (i2 < size) {
                        Theme.ThemeInfo themeInfo = (Theme.ThemeInfo) Theme.themes.get(i2);
                        TLRPC.TL_theme tL_theme = themeInfo.info;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList.add(themeInfo);
                        }
                        i2++;
                    }
                    ThemeSetUrlActivity.AnonymousClass4 anonymousClass4 = new ThemeSetUrlActivity.AnonymousClass4(context, themeSetUrlActivity, arrayList, new ArrayList(), builder2);
                    linearLayout.addView(anonymousClass4, LayoutHelper.createLinear(0.0f, 7.0f, 0.0f, 1.0f, -1, 148));
                    anonymousClass4.scrollToCurrentTheme(themeSetUrlActivity.fragmentView.getMeasuredWidth());
                    themeSetUrlActivity.showDialog(bottomSheet);
                    break;
                }
                break;
            case 3:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) obj2;
                if (!buttonWithCounterView.loading && (mhtml = WearAuthSheet.currentSession) != null) {
                    buttonWithCounterView.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] bArrAcceptAndBuildAnswer = mhtml.acceptAndBuildAnswer();
                        zabv zabvVar = new zze(applicationContext, GoogleApi.Settings.DEFAULT_SETTINGS).zai;
                        zzi zziVar = new zzi(zabvVar, (String) mhtml.boundary, "/tg-wear-auth/answer", bArrAcceptAndBuildAnswer);
                        zabvVar.zaa.zad(0, zziVar);
                        zzah.toTask(zziVar, zzfp.zza).addOnSuccessListener(new VoIPFragment$$ExternalSyntheticLambda42(mhtml, buttonWithCounterView, (int[]) obj, i)).addOnFailureListener(new WearAuthSheet$$ExternalSyntheticLambda5(buttonWithCounterView, 0));
                    } catch (Exception e) {
                        FileLog.e(e);
                        buttonWithCounterView.setLoading(false);
                        return;
                    }
                }
                break;
            case 4:
                ((AffiliateProgramFragment) obj2).lambda$createView$4((Context) obj);
                break;
            case 5:
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) obj2;
                botWebViewSheet.getClass();
                BotDownloads.FileDownload fileDownload = (BotDownloads.FileDownload) obj;
                if (fileDownload.isDownloading()) {
                    BotDownloads.this.cancel(fileDownload);
                } else {
                    File file = fileDownload.file;
                    if (file != null && file.exists()) {
                        File file2 = fileDownload.file;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.instance, null, true);
                    }
                }
                ItemOptions itemOptions = botWebViewSheet.options;
                if (itemOptions != null) {
                    itemOptions.dismiss();
                    botWebViewSheet.options = null;
                }
                break;
            case 6:
                ((BottomSheet) obj2).lambda$showGiftOfferSheet$15();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(ProfileActivity.of(((TL_payments.connectedBotStarRef) obj).bot_id));
                }
                break;
            case 7:
                CommunityInviteOnlySheet communityInviteOnlySheet = (CommunityInviteOnlySheet) obj2;
                communityInviteOnlySheet.getClass();
                ((Runnable) obj).run();
                communityInviteOnlySheet.lambda$showGiftOfferSheet$15();
                break;
            case 8:
                ((RichEditor) obj2).lambda$createView$20((Context) obj, view);
                break;
            default:
                AddressBarList addressBarList = (AddressBarList) obj2;
                addressBarList.hideCurrent = true;
                ((ArticleViewer$$ExternalSyntheticLambda32) obj).run();
                addressBarList.listView.adapter.update(true);
                break;
        }
    }
}
